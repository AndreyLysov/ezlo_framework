package com.ezlo.automation.framework.model.ocs.collections;

import com.ezlo.automation.framework.model.ocs.data.UserStatusData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class UserStatuses extends ForwardingSet<UserStatusData> {

    private Set<UserStatusData> delegate;

    public UserStatuses(UserStatuses userStatuses) {
        this.delegate = new HashSet<>(userStatuses.delegate);
    }

    public UserStatuses() {
        this.delegate = new HashSet<>();
    }

    public UserStatuses(Collection<UserStatusData> userStatuses) {
        this.delegate = new HashSet<>(userStatuses);
    }

    @Override
    protected Set<UserStatusData> delegate() {
        return delegate;
    }

    public UserStatuses withAdded(UserStatusData userStatus) {
        this.add(userStatus);
        return this;
    }

    public UserStatuses withOut(UserStatusData userStatus) {
        this.remove(userStatus);
        return this;
    }

    public UserStatuses withModified(UserStatusData modifiedUserStatus, UserStatusData userStatusData) {
        this.remove(modifiedUserStatus);
        this.add(userStatusData);
        return this;
    }
}
