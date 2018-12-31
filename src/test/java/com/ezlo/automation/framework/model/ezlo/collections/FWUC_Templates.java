package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.FWUC_TemplateData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class FWUC_Templates extends ForwardingSet<FWUC_TemplateData> {

    private Set<FWUC_TemplateData> delegate;

    public FWUC_Templates(FWUC_Templates templates) {
        this.delegate = new HashSet<>(templates.delegate);
    }

    public FWUC_Templates() {
        this.delegate = new HashSet<>();
    }

    public FWUC_Templates(Collection<FWUC_TemplateData> templates) {
        this.delegate = new HashSet<>(templates);
    }

    @Override
    protected Set<FWUC_TemplateData> delegate() {
        return delegate;
    }

    public FWUC_Templates withAdded(FWUC_TemplateData template) {
        this.add(template);
        return this;
    }

    public FWUC_Templates withOut(FWUC_TemplateData template) {
        this.remove(template);
        return this;
    }
}
