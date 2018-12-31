package com.ezlo.automation.framework.model.ocs.collections;

import com.ezlo.automation.framework.model.ocs.data.RoleData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Roles extends ForwardingSet<RoleData> {

    private Set<RoleData> delegate;

    public Roles(Roles roles) {
        this.delegate = new HashSet<>(roles.delegate);
    }

    public Roles() {
        this.delegate = new HashSet<>();
    }

    public Roles(Collection<RoleData> roles) {
        this.delegate = new HashSet<>(roles);
    }

    @Override
    protected Set<RoleData> delegate() {
        return delegate;
    }

    public Roles withAdded(RoleData role) {
        this.add(role);
        return this;
    }

    public Roles withOut(RoleData role) {
        this.remove(role);
        return this;
    }

    public Roles withModified(RoleData modifiedRole, RoleData role) {
        this.remove(modifiedRole);
        this.add(role);
        return this;
    }
}
