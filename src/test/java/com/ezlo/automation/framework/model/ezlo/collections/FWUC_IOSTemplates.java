package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.FWUC_TemplateIOSData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class FWUC_IOSTemplates extends ForwardingSet<FWUC_TemplateIOSData> {

    private Set<FWUC_TemplateIOSData> delegate;

    public FWUC_IOSTemplates(FWUC_IOSTemplates iosTemplates) {
        this.delegate = new HashSet<>(iosTemplates.delegate);
    }

    public FWUC_IOSTemplates() {
        this.delegate = new HashSet<>();
    }

    public FWUC_IOSTemplates(Collection<FWUC_TemplateIOSData> iosTemplates) {
        this.delegate = new HashSet<>(iosTemplates);
    }

    @Override
    protected Set<FWUC_TemplateIOSData> delegate() {
        return delegate;
    }

    public FWUC_IOSTemplates withAdded(FWUC_TemplateIOSData iosTemplate) {
        this.add(iosTemplate);
        return this;
    }

    public FWUC_IOSTemplates withOut(FWUC_TemplateIOSData iosTemplate) {
        this.remove(iosTemplate);
        return this;
    }
}
