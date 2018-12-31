package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.GrantAccessHistoryData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


public class GrantAccessHistories extends ForwardingSet<GrantAccessHistoryData>{

    private Set<GrantAccessHistoryData> delegate;

    public GrantAccessHistories(GrantAccessHistories grantAccessHistory) {
        this.delegate = new HashSet<>(grantAccessHistory.delegate);
    }

    public GrantAccessHistories() {
        this.delegate = new HashSet<>();
    }

    public GrantAccessHistories(Collection<GrantAccessHistoryData> grantAccessHistoryDataCollection) {
        this.delegate = new HashSet<>(grantAccessHistoryDataCollection);
    }

    @Override
    protected Set<GrantAccessHistoryData> delegate() {
        return delegate;
    }

    public GrantAccessHistories withAdded(GrantAccessHistoryData grantAccessHistoryData) {
        this.add(grantAccessHistoryData);
        return this;
    }

    public GrantAccessHistories withOut(GrantAccessHistoryData grantAccessHistoryData) {
        this.remove(grantAccessHistoryData);
        return this;
    }
}