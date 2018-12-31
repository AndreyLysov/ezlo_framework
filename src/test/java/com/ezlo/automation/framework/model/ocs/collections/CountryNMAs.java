package com.ezlo.automation.framework.model.ocs.collections;

import com.ezlo.automation.framework.model.ocs.data.CountryNmaData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CountryNMAs extends ForwardingSet<CountryNmaData> {

    private Set<CountryNmaData> delegate;

    public CountryNMAs(CountryNMAs countryNmas) {
        this.delegate = new HashSet<>(countryNmas.delegate);
    }

    public CountryNMAs() {
        this.delegate = new HashSet<>();
    }

    public CountryNMAs(Collection<CountryNmaData> companies) {
        this.delegate = new HashSet<>(companies);
    }

    @Override
    protected Set<CountryNmaData> delegate() {
        return delegate;
    }

    public CountryNMAs withAdded(CountryNmaData countryNma) {
        this.add(countryNma);
        return this;
    }

    public CountryNMAs withOut(CountryNmaData countryNma) {
        this.remove(countryNma);
        return this;
    }

    public CountryNMAs withModified(CountryNmaData modifiedCountryNma, CountryNmaData countryNma) {
        this.remove(modifiedCountryNma);
        this.add(countryNma);
        return this;
    }
}
