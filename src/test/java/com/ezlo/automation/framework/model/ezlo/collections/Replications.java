package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.ReplicationData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Replications extends ForwardingSet<ReplicationData> {

    private Set<ReplicationData> delegate;

    public Replications(Replications replications) {
        this.delegate = new HashSet<>(replications.delegate);
    }

    public Replications() {
        this.delegate = new HashSet<>();
    }

    public Replications(Collection<ReplicationData> replications) {
        this.delegate = new HashSet<>(replications);
    }

    @Override
    protected Set<ReplicationData> delegate() {
        return delegate;
    }

    public Replications withAdded(ReplicationData replication) {
        this.add(replication);
        return this;
    }

    public Replications withOut(ReplicationData replication) {
        this.remove(replication);
        return this;
    }
}
