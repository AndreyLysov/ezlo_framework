package com.ezlo.automation.framework.model.ocs.collections;

import com.ezlo.automation.framework.model.ocs.data.TicketSubjectData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class TicketSubjects extends ForwardingSet<TicketSubjectData> {

    private Set<TicketSubjectData> delegate;

    public TicketSubjects(TicketSubjects ticketSubjects) {
        this.delegate = new HashSet<>(ticketSubjects.delegate);
    }

    public TicketSubjects() {
        this.delegate = new HashSet<>();
    }

    public TicketSubjects(Collection<TicketSubjectData> ticketSubjects) {
        this.delegate = new HashSet<>(ticketSubjects);
    }

    @Override
    protected Set<TicketSubjectData> delegate() {
        return delegate;
    }

    public TicketSubjects withAdded(TicketSubjectData ticketSubject) {
        this.add(ticketSubject);
        return this;
    }

    public TicketSubjects withOut(TicketSubjectData ticketSubject) {
        this.remove(ticketSubject);
        return this;
    }

    public TicketSubjects withModified(TicketSubjectData modifiedTicketSubject, TicketSubjectData ticketSubject) {
        this.remove(modifiedTicketSubject);
        this.add(ticketSubject);
        return this;
    }
}
