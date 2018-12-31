package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.PandingLogData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class PandingLogs extends ForwardingSet<PandingLogData> {

    private Set<PandingLogData> delegate;

    public PandingLogs(PandingLogs pandingLogs) {
        this.delegate = new HashSet<>(pandingLogs.delegate);
    }

    public PandingLogs() {
        this.delegate = new HashSet<>();
    }

    public PandingLogs(Collection<PandingLogData> pandingLogDataCollection) {
        this.delegate = new HashSet<>(pandingLogDataCollection);
    }

    @Override
    protected Set<PandingLogData> delegate() {
        return delegate;
    }

    public PandingLogs withAdded(PandingLogData pandingLogData) {
        this.add(pandingLogData);
        return this;
    }

    public PandingLogs withOut(PandingLogData pandingLogData) {
        this.remove(pandingLogData);
        return this;
    }
}
