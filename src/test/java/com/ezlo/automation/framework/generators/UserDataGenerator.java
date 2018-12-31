package com.ezlo.automation.framework.generators;

import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;
import com.beust.jcommander.ParameterException;
import com.ezlo.automation.framework.common_baby.CommonMethods;
import com.ezlo.automation.framework.common_baby.Constants;
import com.ezlo.automation.framework.model.ezlo.UserData;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.thoughtworks.xstream.XStream;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.List;

import static java.lang.String.format;

public class UserDataGenerator {

    @Parameter(names = "-c", description = "Users count value.")
    public int count;

    @Parameter(names = "-f", description = "File path - absolute.")
    public String file;

    @Parameter(names = "-d", description = "Data format.")
    public String format;

    public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
        UserDataGenerator generator = new UserDataGenerator();
        JCommander jCommander = new JCommander(generator);
        try {
            jCommander.parse(args);
        } catch (ParameterException ex) {
            jCommander.usage();
            return;
        }
        generator.run();
    }

    static String getHash(String s) {
        return CommonMethods.md5Hash(Constants.STR_PASS_TEST_AUTOMATION);
    }

    private void run() throws IOException {
        List<UserData> users = generatorUsers(count);
        if (format.equals("xml")) {
            saveAsXml(users, new File(file));
        } else if (format.equals("json")) {
            saveAsJson(users, new File(file));
        } else {
            System.out.println("Unrecognized format " + format);
        }
    }

    private void saveAsXml(List<UserData> contacts, File file) throws IOException {
        XStream xstream = new XStream();
        xstream.processAnnotations(UserData.class);
        String xml = xstream.toXML(contacts);
        try (Writer writer = new FileWriter(file)) {
            writer.write(xml);
        }
    }

    private void saveAsJson(List<UserData> users, File file) throws IOException {
        System.out.println(users.get(0).toString());
        Gson gson = new GsonBuilder().setPrettyPrinting().excludeFieldsWithoutExposeAnnotation().create();
        String json = gson.toJson(users);
        System.out.println(json);
        try (Writer writer = new FileWriter(file)) {
            writer.write(json);
        }
    }

    private List<UserData> generatorUsers(int count) {
        List<UserData> users = new ArrayList();
        String password = Constants.STR_PASS_TEST_AUTOMATION;
        for (int i = 1; i < count + 1; i++) {
            users.add(new UserData().withName(format("testName_%S", i))
                    .withEmail(format("test_%S@address.com", i))
                    .withCreated("")
                    .withUpdated("")
                    .withCreator(format("test_%S@address.com", i))
                    .withBlocked(false)
                    .withDeleted(false)
                    .withMd5hash(getHash(format("test_%S@address.com", i) + password))
                    .withLocale("en_US")
                    .withAddress(format("test_%S address", i))
                    .withImageId(format("test_%S image", i))
                    .withResetTime("")
                    .withPassword(password)
                    .withConfirmPassword(password)
                    .withPhone(format("09312345", i))
                    .withSkype(format("testSkype.%S", i))
                    .withCompany(format("testCompany_%S", i))
                    .withPosition(format("testPosition_%S", i))
            );
        }

        return users;
    }
}
