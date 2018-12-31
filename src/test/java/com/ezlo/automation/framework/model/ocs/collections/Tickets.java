package com.ezlo.automation.framework.model.ocs.collections;

import com.ezlo.automation.framework.model.ocs.data.TicketData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Tickets extends ForwardingSet<TicketData> {

    private Set<TicketData> delegate;

    public Tickets(Tickets tickets) {
        this.delegate = new HashSet<>(tickets.delegate);
    }

    public Tickets() {
        this.delegate = new HashSet<>();
    }

    public Tickets(Collection<TicketData> tickets) {
        this.delegate = new HashSet<>(tickets);
    }

    @Override
    protected Set<TicketData> delegate() {
        return delegate;
    }

    public Tickets withAdded(TicketData ticket) {
        this.add(ticket);
        return this;
    }

    public Tickets withOut(TicketData ticket) {
        this.remove(ticket);
        return this;
    }

    public Tickets withModified(TicketData modifiedTicket, TicketData ticket) {
        this.remove(modifiedTicket);
        this.add(ticket);
        return this;
    }
}
