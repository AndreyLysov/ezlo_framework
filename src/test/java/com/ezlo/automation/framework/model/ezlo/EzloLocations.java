package com.ezlo.automation.framework.model.ezlo;

import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class EzloLocations extends ForwardingSet<EzloLocationData> {

    private Set<EzloLocationData> delegate;

    public EzloLocations(EzloLocations EzloLocations) {
        this.delegate = new HashSet<EzloLocationData>(EzloLocations.delegate);
    }

    public EzloLocations() {
        this.delegate = new HashSet<>();
    }

    public EzloLocations(Collection<EzloLocationData> EzloLocations) {
        this.delegate = new HashSet<>(EzloLocations);
    }

    protected Set<EzloLocationData> delegate() {
        return delegate;
    }

    public EzloLocations withAdded(EzloLocationData ezloLocation) {
        EzloLocations EzloLocations = new EzloLocations(this);
        EzloLocations.add(ezloLocation);
        return EzloLocations;
    }

    public EzloLocations withDeleted(EzloLocationData ezloLocation) {
        EzloLocations EzloLocations = new EzloLocations(this);
        EzloLocations.remove(ezloLocation);
        return EzloLocations;
    }

    public EzloLocations withModified(EzloLocationData modifiedEzloLocation, EzloLocationData ezloLocation) {
        EzloLocations EzloLocations = new EzloLocations(this);
        EzloLocations.remove(modifiedEzloLocation);
        EzloLocations.add(ezloLocation);
        return EzloLocations;
    }
}