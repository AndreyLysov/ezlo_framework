package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.PushSettingData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class PushSettings extends ForwardingSet<PushSettingData> {

    private Set<PushSettingData> delegate;

    public PushSettings(PushSettings pushSettings) {
        this.delegate = new HashSet<>(pushSettings.delegate);
    }

    public PushSettings() {
        this.delegate = new HashSet<>();
    }

    public PushSettings(Collection<PushSettingData> pushSettings) {
        this.delegate = new HashSet<>(pushSettings);
    }

    @Override
    protected Set<PushSettingData> delegate() {
        return delegate;
    }

    public PushSettings withAdded(PushSettingData pushSetting) {
        this.add(pushSetting);
        return this;
    }

    public PushSettings withOut(PushSettingData pushSetting) {
        this.remove(pushSetting);
        return this;
    }
}
