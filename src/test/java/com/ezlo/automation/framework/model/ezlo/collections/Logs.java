package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.LogData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


public class Logs extends ForwardingSet<LogData>{

    private Set<LogData> delegate;

    public Logs(Logs logs) {
        this.delegate = new HashSet<>(logs.delegate);
    }

    public Logs() {
        this.delegate = new HashSet<>();
    }

    public Logs(Collection<LogData> logData) {
        this.delegate = new HashSet<>(logData);
    }

    @Override
    protected Set<LogData> delegate() {
        return delegate;
    }

    public Logs withAdded(LogData logData) {
        this.add(logData);
        return this;
    }

    public Logs withOut(LogData logData) {
        this.remove(logData);
        return this;
    }
}