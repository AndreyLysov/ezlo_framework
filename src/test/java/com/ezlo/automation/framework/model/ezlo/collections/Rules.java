package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.RuleData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Rules extends ForwardingSet<RuleData> {

    private Set<RuleData> delegate;

    public Rules(Rules rules) {
        this.delegate = new HashSet<>(rules.delegate);
    }

    public Rules() {
        this.delegate = new HashSet<>();
    }

    public Rules(Collection<RuleData> rules) {
        this.delegate = new HashSet<>(rules);
    }

    @Override
    protected Set<RuleData> delegate() {
        return delegate;
    }

    public Rules withAdded(RuleData rule) {
        this.add(rule);
        return this;
    }

    public Rules withOut(RuleData rule) {
        this.remove(rule);
        return this;
    }
}
