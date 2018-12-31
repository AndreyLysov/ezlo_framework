package com.ezlo.automation.framework.model.ezlo;

import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Users extends ForwardingSet<UserData> {

    private Set<UserData> delegate;

    public Users(Users users) {
        this.delegate = new HashSet<UserData>(users.delegate);
    }

    public Users() {
        this.delegate = new HashSet<>();
    }

    public Users(Collection<UserData> users) {
        this.delegate = new HashSet<>(users);
    }

    protected Set<UserData> delegate() {
        return delegate;
    }

    public Users withAdded(UserData user) {
        Users users = new Users(this);
        users.add(user);
        return users;
    }

    public Users withDeleted(UserData user) {
        Users users = new Users(this);
        users.remove(user);
        return users;
    }

    public Users withModified(UserData modifiedUser, UserData user) {
        Users users = new Users(this);
        users.remove(modifiedUser);
        users.add(user);
        return users;
    }
}
