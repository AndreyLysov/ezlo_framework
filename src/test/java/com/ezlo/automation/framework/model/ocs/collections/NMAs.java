package com.ezlo.automation.framework.model.ocs.collections;

import com.ezlo.automation.framework.model.ocs.data.NmaData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class NMAs extends ForwardingSet<NmaData> {

    private Set<NmaData> delegate;

    public NMAs(NMAs nmas) {
        this.delegate = new HashSet<>(nmas.delegate);
    }

    public NMAs() {
        this.delegate = new HashSet<>();
    }

    public NMAs(Collection<NmaData> nmas) {
        this.delegate = new HashSet<>(nmas);
    }

    @Override
    protected Set<NmaData> delegate() {
        return delegate;
    }

    public NMAs withAdded(NmaData nma) {
        this.add(nma);
        return this;
    }

    public NMAs withOut(NmaData nma) {
        this.remove(nma);
        return this;
    }

    public NMAs withModified(NmaData modifiedNma, NmaData nma) {
        this.remove(modifiedNma);
        this.add(nma);
        return this;
    }
}
