package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.OCS_LogTraceData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class OCS_LogTraces extends ForwardingSet<OCS_LogTraceData> {

    private Set<OCS_LogTraceData> delegate;

    public OCS_LogTraces(OCS_LogTraces logTraces) {
        this.delegate = new HashSet<>(logTraces.delegate);
    }

    public OCS_LogTraces() {
        this.delegate = new HashSet<>();
    }

    public OCS_LogTraces(Collection<OCS_LogTraceData> logTraces) {
        this.delegate = new HashSet<>(logTraces);
    }

    @Override
    protected Set<OCS_LogTraceData> delegate() {
        return delegate;
    }

    public OCS_LogTraces withAdded(OCS_LogTraceData logTrace) {
        this.add(logTrace);
        return this;
    }

    public OCS_LogTraces withOut(OCS_LogTraceData logTrace) {
        this.remove(logTrace);
        return this;
    }
}
