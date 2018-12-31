package com.ezlo.automation.framework.generators;

import com.ezlo.automation.framework.common_baby.Constants;
import com.ezlo.automation.framework.model.ezlo.*;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.ezlo.automation.framework.common_baby.CommonMethods.*;
import static com.ezlo.automation.framework.common_baby.Constants.STR_DEFAULT_PHONE_OPERATOR_CODE;
import static com.ezlo.automation.framework.generators.EzloDataGenerator.getDateTime;
import static java.lang.String.format;

// todo - @OleksiiIsakov: rename Portal with NMA.
public class PortalDataSupplier {

    private static String pass = Constants.STR_PASS_TEST_AUTOMATION;

    public static UserData generateValidUser() {
        return generateUsers(1).stream().findFirst().get();
    }

    public static Users generateUsers(int count) {
        return Stream
                .generate(
                        () -> new UserData()
                                .withName(format("testName_%S", randIntOfNow()))
                                .withEmail(format("test_%S@address.com", randIntOfNow()))
                                .withCreated("")
                                .withUpdated("")
                                .withCreator(format("test_%S@address.com", randIntOfNow()))
                                .withBlocked(false)
                                .withDeleted(false)
                                .withMd5hash(pass)
                                .withLocale("en_US")
                                .withAddress(format("test_%S address", randIntOfNow()))
                                .withImageId(format("test_%S image", randIntOfNow()))
                                .withResetTime("")
                                .withPassword(pass)
                                .withConfirmPassword(pass)
                                .withPhone(getPhoneString(STR_DEFAULT_PHONE_OPERATOR_CODE))
                                .withSkype(format("testSkype.%S", randIntOfNow()))
                                .withCompany(format("testCompany_%S", randIntOfNow()))
                                .withPosition(format("testPosition_%S", randIntOfNow())))
                .limit(count)
                .collect(Collectors.toCollection(Users::new));
    }

    public static EzlosData generateValidEzlo() {
        return generateEzlos(1).stream().findFirst().get();
    }

    public static Ezlos generateEzlos(int count) {
        //TODO -  EQAT-65 Implement: "EzloProps" generator.
        // @OleksiiIsakov: Review comment from AndreyLysov - Please generate EzloProps in another generator.
        return generateEzloLocations(count)
                .stream()
                // todo - OleksiiIsakov: ezloProps should be generated with it own method
                .map(o -> new EzlosData.EzloProps()
                        .withEzloColor("#009933")
                        .withEzloLocation(o))
                .limit(count)
                .map(
                        o -> new EzlosData()
                                .withAutoBackupDone(true)
                                .withAutoFirmwareUpdate(true)
                                .withConnId(null)
                                .withDeleted(false)
                                .withDescription(format("test_%d Description", randIntOfNow()))
                                .withDisabled(false)
                                .withDeleted(false)
                                .withDisconnectedAt("")
                                .withEzloConnectedAt("")
                                .withFirmware("0.34.96")
                                .withImageId(format("test_%d image", randIntOfNow()))
                                .withLocked(false)
                                .withRegistered(true)
                                .withSerial(generateString(1, 16, true, true) + getDateTime("SSSS"))
                                .withShouldBeCleaned(false)
                                .withProperties(o)
                                .withCompany(format("testCompany_%d", randIntOfNow()))
                                .withOwner(format("testOwner_%d", randIntOfNow())))
                .limit(count)
                .collect(Collectors.toCollection(Ezlos::new));
    }

    //-----------------------------------------------------------------------------------------------------------------------------------------------


    public static UserData generateBaseUser() {
        return new UserData()
                .withName(format("testName_%S", randIntOfNow()))
                .withEmail(format("test_%S@address.com", randIntOfNow()))
                .withCreated("")
                .withUpdated("")
                .withCreator(format("test_%S@address.com", randIntOfNow()))
                .withBlocked(false)
                .withDeleted(false)
                .withMd5hash(pass)
                .withLocale("en_US")
                .withAddress(format("test_%S address", randIntOfNow()))
                .withImageId(format("test_%S image", randIntOfNow()))
                .withResetTime("")
                .withPassword(pass)
                .withConfirmPassword(pass)
                .withPhone(format("09312345", randIntOfNow()))
                .withSkype(format("testSkype.%S", randIntOfNow()))
                .withCompany(format("testCompany_%S", randIntOfNow()))
                .withPosition(format("testPosition_%S", randIntOfNow()));
    }

    public static EzloLocationData generateValidEzloLocation() {
        return generateEzloLocations(1).stream().findFirst().get();
    }

    public static EzloLocations generateEzloLocations(int count) {
        return Stream
                .generate(
                        () -> new EzloLocationData()
                                .withDstOffset(randInt(10000))
                                .withLatitude(randLatitude())
                                .withLongitude(randLongitude())
                                .withTimeOffset(randInt(10000))
                                .withTimeZoneId(generateString(1, 10, true, false).get(0))
                                .withRawOffset(randInt(10000))
                )
                .limit(count)
                .collect(Collectors.toCollection(EzloLocations::new));
    }

}
