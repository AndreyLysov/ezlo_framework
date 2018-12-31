package com.ezlo.automation.framework.common_baby;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.RandomStringUtils;
import org.joda.time.DateTime;

import javax.xml.bind.DatatypeConverter;
import java.io.*;
import java.security.MessageDigest;
import java.text.DecimalFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CommonMethods {

    public static String jsonFileToString(File file) {
        String json = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            line = reader.readLine();
            while (line != null) {
                json += line;
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return json;
    }

    public static String xmlToString(File file) {
        String xml = "";
        try (BufferedReader reader = new BufferedReader(new FileReader(file))) {
            String line;
            line = reader.readLine();
            while (line != null) {
                xml += line;
                line = reader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return xml;
    }

    public static List<HashMap<String, String>> jsonFileToListOfHashMaps(File file) {
        Gson gson = new Gson();
        return gson.fromJson(
                jsonFileToString(file),
                new TypeToken<List<HashMap<String, String>>>() {
                }
                        .getType());
    }

    public static int randIntOfNow() {
        return DateTime.now().getMillisOfDay();
    }

    public static double randLatitude() {
        return Double.valueOf(getRandomIntInRange(67) + getStringFormattedByPattern(".0000000"));
    }

    public static double randLongitude() {
        return Double.valueOf(getRandomIntInRange(178) + getStringFormattedByPattern(".0000000"));
    }

    private static int getRandomIntInRange(int bound) {
        return new Random().nextInt(bound);
    }

    public static double randDouble() {
        return new Random().nextDouble();
    }

    public static int randInt(Integer bound) {
        return bound != null ? new Random().nextInt(bound) : new Random().nextInt();
    }

    public static String md5Hash(String password) {
        try {
            return DatatypeConverter.printHexBinary(
                    MessageDigest.getInstance("MD5").digest(password.getBytes("UTF-8")));
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static String getPrettyJson(String uglyJSONString) {
        if (uglyJSONString != null) {
            return new GsonBuilder()
                    .excludeFieldsWithoutExposeAnnotation()
                    .serializeNulls()
                    .setPrettyPrinting()
                    .create()
                    .toJson(new JsonParser()
                            .parse(uglyJSONString));
        } else
            return null;
    }

    public static List<String> generateString(int count, int length, boolean useLetters, boolean useNumbers) {
        return Stream
                .generate(
                        () -> RandomStringUtils
                                .random(length, useLetters, useNumbers))
                .limit(count)
                .collect(Collectors.toList());
    }

    public static String getPhoneString(String phoneOperatorCode) {
        return phoneOperatorCode + getStringFormattedByPattern("0000000");
    }

    private static String getStringFormattedByPattern(String pattern) {
        return new DecimalFormat(pattern).format(randDouble());
    }


}