package com.ezlo.automation.framework.common_baby.shell;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class ShellOutputPrinter extends Thread {
    private InputStream is;

    ShellOutputPrinter(InputStream is, String type) {
        this.is = is;
    }

    public InputStream getIs() {
        return is;
    }

    public void run() {
        String s = null;
        try {
            BufferedReader br = new BufferedReader( new InputStreamReader(is));
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }
}
