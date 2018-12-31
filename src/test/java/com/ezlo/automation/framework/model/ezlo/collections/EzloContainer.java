package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.EzloData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class EzloContainer extends ForwardingSet<EzloData> {

    private Set<EzloData> delegate;

    public EzloContainer(EzloContainer ezlos) {
        this.delegate = new HashSet<>(ezlos.delegate);
    }

    public EzloContainer() {
        this.delegate = new HashSet<>();
    }

    public EzloContainer(Collection<EzloData> ezlos) {
        this.delegate = new HashSet<>(ezlos);
    }

    @Override
    protected Set<EzloData> delegate() {
        return delegate;
    }

    public EzloContainer withAdded(EzloData ezlo) {
        this.add(ezlo);
        return this;
    }

    public EzloContainer withOut(EzloData ezlo) {
        this.remove(ezlo);
        return this;
    }
}
