package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.StoreDeviceData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class StoreDevices extends ForwardingSet<StoreDeviceData> {

    private Set<StoreDeviceData> delegate;

    public StoreDevices(StoreDevices storeDevices) {
        this.delegate = new HashSet<>(storeDevices.delegate);
    }

    public StoreDevices() {
        this.delegate = new HashSet<>();
    }

    public StoreDevices(Collection<StoreDeviceData> storeDevices) {
        this.delegate = new HashSet<>(storeDevices);
    }

    @Override
    protected Set<StoreDeviceData> delegate() {
        return delegate;
    }

    public StoreDevices withAdded(StoreDeviceData storeDevice) {
        this.add(storeDevice);
        return this;
    }

    public StoreDevices withOut(StoreDeviceData storeDevice) {
        this.remove(storeDevice);
        return this;
    }
}
