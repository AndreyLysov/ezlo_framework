package com.ezlo.automation.framework.model.ocs.data;

import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class AclRolePermissions extends ForwardingSet<AclRolePermissionData> {

    private Set<AclRolePermissionData> delegate;

    public AclRolePermissions(AclRolePermissions aclRolePermissions) {
        this.delegate = new HashSet<>(aclRolePermissions.delegate);
    }

    public AclRolePermissions() {
        this.delegate = new HashSet<>();
    }

    public AclRolePermissions(Collection<AclRolePermissionData> aclRolePermissions) {
        this.delegate = new HashSet<>(aclRolePermissions);
    }

    @Override
    protected Set<AclRolePermissionData> delegate() {
        return delegate;
    }

    public AclRolePermissions withAdded(AclRolePermissionData aclRolePermission) {
        this.add(aclRolePermission);
        return this;
    }

    public AclRolePermissions withOut(AclRolePermissionData aclRolePermission) {
        this.remove(aclRolePermission);
        return this;
    }

    public AclRolePermissions withModified(
            AclRolePermissionData modifiedAclRolePermission, AclRolePermissionData aclRolePermission) {
        this.remove(modifiedAclRolePermission);
        this.add(aclRolePermission);
        return this;
    }
}
