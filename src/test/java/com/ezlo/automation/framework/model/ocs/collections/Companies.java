package com.ezlo.automation.framework.model.ocs.collections;

import com.ezlo.automation.framework.model.ocs.data.CompanyData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Companies extends ForwardingSet<CompanyData> {

    private Set<CompanyData> delegate;

    public Companies(Companies companies) {
        this.delegate = new HashSet<>(companies.delegate);
    }

    public Companies() {
        this.delegate = new HashSet<>();
    }

    public Companies(Collection<CompanyData> companies) {
        this.delegate = new HashSet<>(companies);
    }

    @Override
    protected Set<CompanyData> delegate() {
        return delegate;
    }

    public Companies withAdded(CompanyData company) {
        this.add(company);
        return this;
    }

    public Companies withOut(CompanyData company) {
        this.remove(company);
        return this;
    }

    public Companies withModified(CompanyData modifiedCompany, CompanyData company) {
        this.remove(modifiedCompany);
        this.add(company);
        return this;
    }
}
