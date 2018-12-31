package com.ezlo.automation.framework.model.ocs.collections;

import com.ezlo.automation.framework.model.ocs.data.AccountRoleData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class AccountRoles extends ForwardingSet<AccountRoleData> {

    private Set<AccountRoleData> delegate;

    public AccountRoles(AccountRoles accountRoles) {
        this.delegate = new HashSet<>(accountRoles.delegate);
    }

    public AccountRoles() {
        this.delegate = new HashSet<>();
    }

    public AccountRoles(Collection<AccountRoleData> accountRoles) {
        this.delegate = new HashSet<>(accountRoles);
    }

    @Override
    protected Set<AccountRoleData> delegate() {
        return delegate;
    }

    public AccountRoles withAdded(AccountRoleData accountRole) {
        this.add(accountRole);
        return this;
    }

    public AccountRoles withOut(AccountRoleData accountRole) {
        this.remove(accountRole);
        return this;
    }

    public AccountRoles withModified(AccountRoleData modifiedAccountRole, AccountRoleData accountRole) {
        this.remove(modifiedAccountRole);
        this.add(accountRole);
        return this;
    }
}
