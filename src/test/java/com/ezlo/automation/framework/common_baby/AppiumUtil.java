package com.ezlo.automation.framework.common_baby;

import com.google.common.io.Files;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class AppiumUtil {
    public static URL appiumServerUrl;
    private static AppiumDriverLocalService service;

    static {
        service = AppiumDriverLocalService
                .buildService(
                        new AppiumServiceBuilder()
                                .withLogFile(makeLogFile())
                                .withIPAddress(Constants.STR_APPIUM_SERVER_IP)
                                .usingAnyFreePort()
                )
        ;
    }

    private static File makeLogFile() {
        File logFile = new File(Constants.STR_APPIUM_SERVER_LOG_PATH);
        try {
            Files.createParentDirs(logFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            Files.touch(logFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return logFile;
    }

    public static void startServer() {
        if (!service.isRunning()) {
            service.start();
        }
        while (!Objects.requireNonNull(service.getStdOut()).contains(Constants.STR_APPIUM_STARTED_ON_SUCCESS_MSG)) {
            System.out.println(service.getStdOut());
        }
        appiumServerUrl = service.getUrl();
    }

    public static void stopServer() {
        while (service.isRunning()) {
            service.stop();
        }
    }

    public static Boolean isAlive() {
        return service.isRunning();
    }
}
