package com.ezlo.automation.framework.model.ocs.collections;

import com.ezlo.automation.framework.model.ocs.data.CompanyNmaData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class CompanyNMAs extends ForwardingSet<CompanyNmaData> {

    private Set<CompanyNmaData> delegate;

    public CompanyNMAs(CompanyNMAs companyNmas) {
        this.delegate = new HashSet<>(companyNmas.delegate);
    }

    public CompanyNMAs() {
        this.delegate = new HashSet<>();
    }

    public CompanyNMAs(Collection<CompanyNmaData> companyNmas) {
        this.delegate = new HashSet<>(companyNmas);
    }

    @Override
    protected Set<CompanyNmaData> delegate() {
        return delegate;
    }

    public CompanyNMAs withAdded(CompanyNmaData companyNma) {
        this.add(companyNma);
        return this;
    }

    public CompanyNMAs withOut(CompanyNmaData companyNma) {
        this.remove(companyNma);
        return this;
    }

    public CompanyNMAs withModified(CompanyNmaData modifiedCompanyNma, CompanyNmaData companyNma) {
        this.remove(modifiedCompanyNma);
        this.add(companyNma);
        return this;
    }
}
