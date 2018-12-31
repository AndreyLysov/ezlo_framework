package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.CameraData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Cameras extends ForwardingSet<CameraData> {

    private Set<CameraData> delegate;

    public Cameras(Cameras cameras) {
        this.delegate = new HashSet<>(cameras.delegate);
    }

    public Cameras() {
        this.delegate = new HashSet<>();
    }

    public Cameras(Collection<CameraData> cameras) {
        this.delegate = new HashSet<>(cameras);
    }

    @Override
    protected Set<CameraData> delegate() {
        return delegate;
    }

    public Cameras withAdded(CameraData camera) {
        this.add(camera);
        return this;
    }

    public Cameras withOut(CameraData camera) {
        this.remove(camera);
        return this;
    }
}
