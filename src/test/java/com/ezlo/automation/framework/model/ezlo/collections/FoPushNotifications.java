package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.FoPushNotificationData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class FoPushNotifications extends ForwardingSet<FoPushNotificationData> {

    private Set<FoPushNotificationData> delegate;

    public FoPushNotifications(FoPushNotifications foPushNotifications) {
        this.delegate = new HashSet<>(foPushNotifications.delegate);
    }

    public FoPushNotifications() {
        this.delegate = new HashSet<>();
    }

    public FoPushNotifications(Collection<FoPushNotificationData> foPushNotifications) {
        this.delegate = new HashSet<>(foPushNotifications);
    }

    @Override
    protected Set<FoPushNotificationData> delegate() {
        return delegate;
    }

    public FoPushNotifications withAdded(FoPushNotificationData pushNotification) {
        this.add(pushNotification);
        return this;
    }

    public FoPushNotifications withOut(FoPushNotificationData pushNotification) {
        this.remove(pushNotification);
        return this;
    }
}
