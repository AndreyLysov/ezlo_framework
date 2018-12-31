package com.ezlo.automation.framework.model.ocs.collections;

import com.ezlo.automation.framework.model.ocs.data.AccountData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Accounts extends ForwardingSet<AccountData> {

    private Set<AccountData> delegate;

    public Accounts(Accounts accounts) {
        this.delegate = new HashSet<>(accounts.delegate);
    }

    public Accounts() {
        this.delegate = new HashSet<>();
    }

    public Accounts(Collection<AccountData> accounts) {
        this.delegate = new HashSet<>(accounts);
    }

    @Override
    protected Set<AccountData> delegate() {
        return delegate;
    }

    public Accounts withAdded(AccountData account) {
        this.add(account);
        return this;
    }

    public Accounts withOut(AccountData account) {
        this.remove(account);
        return this;
    }

    public Accounts withModified(AccountData modifiedAccount, AccountData account) {
        this.remove(modifiedAccount);
        this.add(account);
        return this;
    }
}
