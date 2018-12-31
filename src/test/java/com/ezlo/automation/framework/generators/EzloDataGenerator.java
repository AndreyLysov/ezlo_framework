package com.ezlo.automation.framework.generators;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import com.ezlo.automation.framework.model.ezlo.EzloLocationData;
import com.ezlo.automation.framework.model.ezlo.EzlosData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.thoughtworks.xstream.XStream;
import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

import static com.ezlo.automation.framework.generators.PortalDataSupplier.generateValidEzloLocation;
import static com.ezlo.automation.framework.generators.UserDataGenerator.getHash;
import static java.lang.String.format;

public class EzloDataGenerator {

    @Parameter(names = "-c", description = "Ezlos count value.")
    public int count;

    @Parameter(names = "-f", description = "File path - absolute.")
    public String file;

    @Parameter(names = "-d", description = "Data format.")
    public String format;

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        EzloDataGenerator generator = new EzloDataGenerator();
        JCommander jCommander = new JCommander(generator);
        try {
            jCommander.parse(args);
        } catch (ParameterException ex) {
            jCommander.usage();
            return;
        }
        generator.run();
    }

    public static String getDateTime(String pattern) {
        DateTime date = DateTime.now();
        DateTimeFormatter fmt = DateTimeFormat.forPattern(pattern);
        return date.toString(fmt);
    }

    private void run() throws IOException, NoSuchAlgorithmException {
        List<EzlosData> users = generatorUsers(count);
        if (format.equals("xml")) {
            saveAsXml(users, new File(file));
        } else if (format.equals("json")) {
            saveAsJson(users, new File(file));
        } else {
            System.out.println("Unrecognized format " + format);
        }
    }

    private void saveAsXml(List<EzlosData> contacts, File file) throws IOException {
        XStream xstream = new XStream();
        xstream.processAnnotations(EzlosData.class);
        String xml = xstream.toXML(contacts);
        try (Writer writer = new FileWriter(file)) {
            writer.write(xml);
        }
    }

    private void saveAsJson(List<EzlosData> ezlos, File file) throws IOException {
        Gson gson = new GsonBuilder().setPrettyPrinting().excludeFieldsWithoutExposeAnnotation().create();
        String json = gson.toJson(ezlos);
        try (Writer writer = new FileWriter(file)) {
            writer.write(json);
        }
    }

    // TODO withFirmware field == latest version
    private List<EzlosData> generatorUsers(int count) throws NoSuchAlgorithmException {
        List<EzlosData> ezlos = new ArrayList();
        for (int i = 1; i < count + 1; i++) {
            String serial = getRandomString(10) + getDateTime("SSSS");
            // todo - @OleksiiIsakov - Comment from andrey.lysov
            // call generator directly in withEzloLocation() method.
            // https://bitbucket.org/ezloTestAutomation/ezlo-framework-m/pull-requests/42/eqat-64-implementezlolocationgenerator/activity
            EzloLocationData location = generateValidEzloLocation();
            EzlosData.EzloProps props = new EzlosData.EzloProps();
            props.withEzloColor("#009933");
            props.withEzloLocation(location);

            ezlos.add(new EzlosData().withAutoBackupDone(true)
                    .withAutoFirmwareUpdate(true)
                    .withConnId(null)
                    .withDeleted(false)
                    .withDescription(format("test_%S Description", i))
                    .withDisabled(false)
                    .withDeleted(false)
                    .withDisconnectedAt("")
                    .withEzloConnectedAt("")
                    .withFirmware("0.34.96")
                    .withImageId(format("test_%S image", i))
                    .withLocked(false)
                    .withRegistered(true)
                    .withProperties(props)
                    .withSerial(serial)
                    .withSerialHash(getHash(serial))
                    .withShouldBeCleaned(false)
                    .withCompany(format("testCompany_%S", i))
                    .withOwner(format("testOwner_%S", i))
            );
        }
        return ezlos;
    }

    private String getRandomString(int length) {
        String s = "0123456789abcdefghijklmnopqrstuvwxyz";
        SecureRandom random = new SecureRandom();
        StringBuilder sbuilder = new StringBuilder(length);
        for (int i = 0; i < length; i++)
            sbuilder.append(s.charAt(random.nextInt(s.length())));
        return sbuilder.toString();
    }
}
