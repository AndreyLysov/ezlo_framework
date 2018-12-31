package com.ezlo.automation.framework.model.ocs.collections;

import com.ezlo.automation.framework.model.ocs.data.AclContextData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class AclContexts extends ForwardingSet<AclContextData> {

    private Set<AclContextData> delegate;

    public AclContexts(AclContexts aclContexts) {
        this.delegate = new HashSet<>(aclContexts.delegate);
    }

    public AclContexts() {
        this.delegate = new HashSet<>();
    }

    public AclContexts(Collection<AclContextData> aclContexts) {
        this.delegate = new HashSet<>(aclContexts);
    }

    @Override
    protected Set<AclContextData> delegate() {
        return delegate;
    }

    public AclContexts withAdded(AclContextData aclContext) {
        this.add(aclContext);
        return this;
    }

    public AclContexts withOut(AclContextData aclContext) {
        this.remove(aclContext);
        return this;
    }

    public AclContexts withModified(AclContextData modifiedAclContext, AclContextData aclContext) {
        this.remove(modifiedAclContext);
        this.add(aclContext);
        return this;
    }
}
