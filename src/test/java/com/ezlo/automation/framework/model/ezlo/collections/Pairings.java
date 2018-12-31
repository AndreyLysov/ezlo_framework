package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.PairingData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


public class Pairings extends ForwardingSet<PairingData>{

    private Set<PairingData> delegate;

    public Pairings(Pairings pairings) {
        this.delegate = new HashSet<>(pairings.delegate);
    }

    public Pairings() {
        this.delegate = new HashSet<>();
    }

    public Pairings(Collection<PairingData> pairingDataCollection) {
        this.delegate = new HashSet<>(pairingDataCollection);
    }

    @Override
    protected Set<PairingData> delegate() {
        return delegate;
    }

    public Pairings withAdded(PairingData pairingData) {
        this.add(pairingData);
        return this;
    }

    public Pairings withOut(PairingData pairingData) {
        this.remove(pairingData);
        return this;
    }
}