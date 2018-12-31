package com.ezlo.automation.framework.model.ocs.collections;

import com.ezlo.automation.framework.model.ocs.data.RequestSqlData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Requests extends ForwardingSet<RequestSqlData> {

    private Set<RequestSqlData> delegate;

    public Requests(Requests requests) {
        this.delegate = new HashSet<>(requests.delegate);
    }

    public Requests() {
        this.delegate = new HashSet<>();
    }

    public Requests(Collection<RequestSqlData> nmas) {
        this.delegate = new HashSet<>(nmas);
    }

    @Override
    protected Set<RequestSqlData> delegate() {
        return delegate;
    }

    public Requests withAdded(RequestSqlData request) {
        this.add(request);
        return this;
    }

    public Requests withOut(RequestSqlData request) {
        this.remove(request);
        return this;
    }

    public Requests withModified(RequestSqlData modifiedrequest, RequestSqlData request) {
        this.remove(modifiedrequest);
        this.add(request);
        return this;
    }
}
