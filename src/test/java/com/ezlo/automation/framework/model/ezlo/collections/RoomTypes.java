package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.RoomTypeData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class RoomTypes extends ForwardingSet<RoomTypeData> {

    private Set<RoomTypeData> delegate;

    public RoomTypes(RoomTypes roomTypes) {
        this.delegate = new HashSet<>(roomTypes.delegate);
    }

    public RoomTypes() {
        this.delegate = new HashSet<>();
    }

    public RoomTypes(Collection<RoomTypeData> roomTypes) {
        this.delegate = new HashSet<>(roomTypes);
    }

    @Override
    protected Set<RoomTypeData> delegate() {
        return delegate;
    }

    public RoomTypes withAdded(RoomTypeData roomType) {
        this.add(roomType);
        return this;
    }

    public RoomTypes withOut(RoomTypeData roomType) {
        this.remove(roomType);
        return this;
    }
}
