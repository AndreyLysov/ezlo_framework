package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.HUBdol5_GatewayData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class HUBdol5_Gateways extends ForwardingSet<HUBdol5_GatewayData> {

    private Set<HUBdol5_GatewayData> delegate;

    public HUBdol5_Gateways(HUBdol5_Gateways blocks) {
        this.delegate = new HashSet<>(blocks.delegate);
    }

    public HUBdol5_Gateways() {
        this.delegate = new HashSet<>();
    }

    public HUBdol5_Gateways(Collection<HUBdol5_GatewayData> huBdol5_gateway) {
        this.delegate = new HashSet<>(huBdol5_gateway);
    }

    @Override
    protected Set<HUBdol5_GatewayData> delegate() {
        return delegate;
    }

    public HUBdol5_Gateways withAdded(HUBdol5_GatewayData huBdol5_gateway) {
        this.add(huBdol5_gateway);
        return this;
    }

    public HUBdol5_Gateways withOut(HUBdol5_GatewayData huBdol5_gateway) {
        this.remove(huBdol5_gateway);
        return this;
    }
}
