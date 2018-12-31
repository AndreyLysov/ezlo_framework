package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.PushCountData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class PushCounts extends ForwardingSet<PushCountData> {

    private Set<PushCountData> delegate;

    public PushCounts(PushCounts pushCounts) {
        this.delegate = new HashSet<>(pushCounts.delegate);
    }

    public PushCounts() {
        this.delegate = new HashSet<>();
    }

    public PushCounts(Collection<PushCountData> pushCountDataCollection) {
        this.delegate = new HashSet<>(pushCountDataCollection);
    }

    @Override
    protected Set<PushCountData> delegate() {
        return delegate;
    }

    public PushCounts withAdded(PushCountData pushCountData) {
        this.add(pushCountData);
        return this;
    }

    public PushCounts withOut(PushCountData pushCountData) {
        this.remove(pushCountData);
        return this;
    }
}

