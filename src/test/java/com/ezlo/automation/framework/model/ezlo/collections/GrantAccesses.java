package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.GrantAccessData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


public class GrantAccesses extends ForwardingSet<GrantAccessData>{

    private Set<GrantAccessData> delegate;

    public GrantAccesses(GrantAccesses grantAccesses) {
        this.delegate = new HashSet<>(grantAccesses.delegate);
    }

    public GrantAccesses() {
        this.delegate = new HashSet<>();
    }

    public GrantAccesses(Collection<GrantAccessData> grantAccessDataCollection) {
        this.delegate = new HashSet<>(grantAccessDataCollection);
    }

    @Override
    protected Set<GrantAccessData> delegate() {
        return delegate;
    }

    public GrantAccesses withAdded(GrantAccessData grantAccessData) {
        this.add(grantAccessData);
        return this;
    }

    public GrantAccesses withOut(GrantAccessData grantAccessData) {
        this.remove(grantAccessData);
        return this;
    }
}