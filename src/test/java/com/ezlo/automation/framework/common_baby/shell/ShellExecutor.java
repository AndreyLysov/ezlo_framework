package com.ezlo.automation.framework.common_baby.shell;

import java.io.IOException;
import java.io.InputStream;

public class ShellExecutor {
    private Process shellProcess;

    public Process getProcess(String command) {
        Runtime rt = Runtime.getRuntime();
        try {
            shellProcess = rt.exec(command);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return shellProcess;
    }

    public ShellOutputPrinter getError() {
        return this.getStreamWrapper(shellProcess.getErrorStream(), "ERROR");
    }

    public ShellOutputPrinter getOutput() {
        return this.getStreamWrapper(shellProcess.getInputStream(), "OUTPUT");
    }

    private ShellOutputPrinter getStreamWrapper(InputStream is, String type) {
        return new ShellOutputPrinter(is, type);
    }
}