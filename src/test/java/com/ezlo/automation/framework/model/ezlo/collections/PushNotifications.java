package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.PushNotificationData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class PushNotifications extends ForwardingSet<PushNotificationData> {

    private Set<PushNotificationData> delegate;

    public PushNotifications(PushNotifications pushNotifications) {
        this.delegate = new HashSet<>(pushNotifications.delegate);
    }

    public PushNotifications() {
        this.delegate = new HashSet<>();
    }

    public PushNotifications(Collection<PushNotificationData> pushNotificationDataCollection) {
        this.delegate = new HashSet<>(pushNotificationDataCollection);
    }

    @Override
    protected Set<PushNotificationData> delegate() {
        return delegate;
    }

    public PushNotifications withAdded(PushNotificationData pushNotificationData) {
        this.add(pushNotificationData);
        return this;
    }

    public PushNotifications withOut(PushNotificationData pushNotificationData) {
        this.remove(pushNotificationData);
        return this;
    }
}