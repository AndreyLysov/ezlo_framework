package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.EzloOrderData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class EzloOrders extends ForwardingSet<EzloOrderData> {

    private Set<EzloOrderData> delegate;

    public EzloOrders(EzloOrders ezloOrders) {
        this.delegate = new HashSet<>(ezloOrders.delegate);
    }

    public EzloOrders() {
        this.delegate = new HashSet<>();
    }

    public EzloOrders(Collection<EzloOrderData> ezloOrders) {
        this.delegate = new HashSet<>(ezloOrders);
    }

    @Override
    protected Set<EzloOrderData> delegate() {
        return delegate;
    }

    public EzloOrders withAdded(EzloOrderData ezloOrder) {
        this.add(ezloOrder);
        return this;
    }

    public EzloOrders withOut(EzloOrderData ezloOrder) {
        this.remove(ezloOrder);
        return this;
    }
}
