package com.ezlo.automation.framework.model.ezlo;

import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings("ALL")
public class Customers extends ForwardingSet<CustomerData> {

    private Set<CustomerData> delegate;

    public Customers(Customers customers) {
        this.delegate = new HashSet<CustomerData>(customers.delegate);
    }

    public Customers() {
        this.delegate = new HashSet<CustomerData>();
    }

    public Customers(Collection<CustomerData> customers) {
        this.delegate = new HashSet<CustomerData>(customers);
    }

    @Override
    protected Set<CustomerData> delegate() {
        return delegate;
    }

    public Customers withAdded(CustomerData customer) {
        Customers customers = new Customers(this);
        customers.add(customer);
        return customers;
    }

    public Customers withOut(CustomerData customer) {
        Customers customers = new Customers(this);
        customers.remove(customer);
        return customers;
    }

    public Customers withModified(CustomerData modifiedContact, CustomerData customer) {
        Customers customers = new Customers(this);
        customers.remove(modifiedContact);
        customers.add(customer);
        return customers;
    }
}
