package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.DeletedUserData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class DeletedUsers extends ForwardingSet<DeletedUserData> {

    private Set<DeletedUserData> delegate;

    public DeletedUsers(DeletedUsers users) {
        this.delegate = new HashSet<>(users.delegate);
    }

    public DeletedUsers() {
        this.delegate = new HashSet<>();
    }

    public DeletedUsers(Collection<DeletedUserData> users) {
        this.delegate = new HashSet<>(users);
    }

    @Override
    protected Set<DeletedUserData> delegate() {
        return delegate;
    }

    public DeletedUsers withAdded(DeletedUserData user) {
        this.add(user);
        return this;
    }

    public DeletedUsers withOut(DeletedUserData user) {
        this.remove(user);
        return this;
    }
}
