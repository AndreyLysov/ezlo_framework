package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.OwnerData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


public class Owners extends ForwardingSet<OwnerData>{

    private Set<OwnerData> delegate;

    public Owners(Owners owners) {
        this.delegate = new HashSet<>(owners.delegate);
    }

    public Owners() {
        this.delegate = new HashSet<>();
    }

    public Owners(Collection<OwnerData> ownerDataCollection) {
        this.delegate = new HashSet<>(ownerDataCollection);
    }

    @Override
    protected Set<OwnerData> delegate() {
        return delegate;
    }

    public Owners withAdded(OwnerData ownerData) {
        this.add(ownerData);
        return this;
    }

    public Owners withOut(OwnerData ownerData) {
        this.remove(ownerData);
        return this;
    }
}