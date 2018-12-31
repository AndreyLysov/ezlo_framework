package com.ezlo.automation.framework.model.ocs.collections;

import com.ezlo.automation.framework.model.ocs.data.HubNmaData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HubNMAs extends ForwardingSet<HubNmaData> {

    private Set<HubNmaData> delegate;

    public HubNMAs(HubNMAs hubNmas) {
        this.delegate = new HashSet<>(hubNmas.delegate);
    }

    public HubNMAs() {
        this.delegate = new HashSet<>();
    }

    public HubNMAs(Collection<HubNmaData> hubNmas) {
        this.delegate = new HashSet<>(hubNmas);
    }

    @Override
    protected Set<HubNmaData> delegate() {
        return delegate;
    }

    public HubNMAs withAdded(HubNmaData hubNma) {
        this.add(hubNma);
        return this;
    }

    public HubNMAs withOut(HubNmaData hubNma) {
        this.remove(hubNma);
        return this;
    }

    public HubNMAs withModified(HubNmaData modifiedHubNma, HubNmaData hubNma) {
        this.remove(modifiedHubNma);
        this.add(hubNma);
        return this;
    }
}
