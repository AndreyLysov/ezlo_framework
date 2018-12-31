package com.ezlo.automation.framework.model.ocs.collections;

import com.ezlo.automation.framework.model.ocs.data.TicketStatusData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TicketStatuses extends ForwardingSet<TicketStatusData> {

    private Set<TicketStatusData> delegate;

    public TicketStatuses(TicketStatuses ticketStatuses) {
        this.delegate = new HashSet<>(ticketStatuses.delegate);
    }

    public TicketStatuses() {
        this.delegate = new HashSet<>();
    }

    public TicketStatuses(Collection<TicketStatusData> ticketStatuses) {
        this.delegate = new HashSet<>(ticketStatuses);
    }

    @Override
    protected Set<TicketStatusData> delegate() {
        return delegate;
    }

    public TicketStatuses withAdded(TicketStatusData ticketStatus) {
        this.add(ticketStatus);
        return this;
    }

    public TicketStatuses withOut(TicketStatusData ticketStatus) {
        this.remove(ticketStatus);
        return this;
    }

    public TicketStatuses withModified(TicketStatusData modifiedTicketStatus, TicketStatusData ticketStatus) {
        this.remove(modifiedTicketStatus);
        this.add(ticketStatus);
        return this;
    }
}
