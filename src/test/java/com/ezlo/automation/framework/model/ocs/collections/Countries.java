package com.ezlo.automation.framework.model.ocs.collections;

import com.ezlo.automation.framework.model.ocs.data.CountryData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Countries extends ForwardingSet<CountryData> {

    private Set<CountryData> delegate;

    public Countries(Countries countries) {
        this.delegate = new HashSet<>(countries.delegate);
    }

    public Countries() {
        this.delegate = new HashSet<>();
    }

    public Countries(Collection<CountryData> countries) {
        this.delegate = new HashSet<>(countries);
    }

    @Override
    protected Set<CountryData> delegate() {
        return delegate;
    }

    public Countries withAdded(CountryData country) {
        this.add(country);
        return this;
    }

    public Countries withOut(CountryData country) {
        this.remove(country);
        return this;
    }

    public Countries withModified(CountryData modifiedCountry, CountryData country) {
        this.remove(modifiedCountry);
        this.add(country);
        return this;
    }
}
