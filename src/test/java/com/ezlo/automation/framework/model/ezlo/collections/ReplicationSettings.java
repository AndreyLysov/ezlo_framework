package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.ReplicationSettingData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class ReplicationSettings extends ForwardingSet<ReplicationSettingData> {

    private Set<ReplicationSettingData> delegate;

    public ReplicationSettings(ReplicationSettings replicationSettings) {
        this.delegate = new HashSet<>(replicationSettings.delegate);
    }

    public ReplicationSettings() {
        this.delegate = new HashSet<>();
    }

    public ReplicationSettings(Collection<ReplicationSettingData> replicationSettings) {
        this.delegate = new HashSet<>(replicationSettings);
    }

    @Override
    protected Set<ReplicationSettingData> delegate() {
        return delegate;
    }

    public ReplicationSettings withAdded(ReplicationSettingData replicationSetting) {
        this.add(replicationSetting);
        return this;
    }

    public ReplicationSettings withOut(ReplicationSettingData replicationSetting) {
        this.remove(replicationSetting);
        return this;
    }
}
