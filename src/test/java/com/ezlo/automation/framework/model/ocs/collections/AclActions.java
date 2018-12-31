package com.ezlo.automation.framework.model.ocs.collections;

import com.ezlo.automation.framework.model.ocs.data.AclActionData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class AclActions extends ForwardingSet<AclActionData> {

    private Set<AclActionData> delegate;

    public AclActions(AclActions aclActions) {
        this.delegate = new HashSet<>(aclActions.delegate);
    }

    public AclActions() {
        this.delegate = new HashSet<>();
    }

    public AclActions(Collection<AclActionData> aclActions) {
        this.delegate = new HashSet<>(aclActions);
    }

    @Override
    protected Set<AclActionData> delegate() {
        return delegate;
    }

    public AclActions withAdded(AclActionData aclAction) {
        this.add(aclAction);
        return this;
    }

    public AclActions withOut(AclActionData aclAction) {
        this.remove(aclAction);
        return this;
    }

    public AclActions withModified(AclActionData modifiedAclAction, AclActionData aclAction) {
        this.remove(modifiedAclAction);
        this.add(aclAction);
        return this;
    }
}
