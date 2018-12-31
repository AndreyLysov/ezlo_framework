package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.OCS_ReconstructionLogData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class OCS_ReconstructionLogs extends ForwardingSet<OCS_ReconstructionLogData> {

    private Set<OCS_ReconstructionLogData> delegate;

    public OCS_ReconstructionLogs(OCS_ReconstructionLogs reconstructionLogs) {
        this.delegate = new HashSet<>(reconstructionLogs.delegate);
    }

    public OCS_ReconstructionLogs() {
        this.delegate = new HashSet<>();
    }

    public OCS_ReconstructionLogs(Collection<OCS_ReconstructionLogData> reconstructionLogs) {
        this.delegate = new HashSet<>(reconstructionLogs);
    }

    @Override
    protected Set<OCS_ReconstructionLogData> delegate() {
        return delegate;
    }

    public OCS_ReconstructionLogs withAdded(OCS_ReconstructionLogData reconstructionLog) {
        this.add(reconstructionLog);
        return this;
    }

    public OCS_ReconstructionLogs withOut(OCS_ReconstructionLogData reconstructionLog) {
        this.remove(reconstructionLog);
        return this;
    }
}
