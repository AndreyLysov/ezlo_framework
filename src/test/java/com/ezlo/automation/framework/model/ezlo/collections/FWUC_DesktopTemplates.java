package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.FWUC_TemplateDesktopData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class FWUC_DesktopTemplates extends ForwardingSet<FWUC_TemplateDesktopData> {

    private Set<FWUC_TemplateDesktopData> delegate;

    public FWUC_DesktopTemplates(FWUC_DesktopTemplates desktopTemplates) {
        this.delegate = new HashSet<>(desktopTemplates.delegate);
    }

    public FWUC_DesktopTemplates() {
        this.delegate = new HashSet<>();
    }

    public FWUC_DesktopTemplates(Collection<FWUC_TemplateDesktopData> desktopTemplates) {
        this.delegate = new HashSet<>(desktopTemplates);
    }

    @Override
    protected Set<FWUC_TemplateDesktopData> delegate() {
        return delegate;
    }

    public FWUC_DesktopTemplates withAdded(FWUC_TemplateDesktopData desktopTemplate) {
        this.add(desktopTemplate);
        return this;
    }

    public FWUC_DesktopTemplates withOut(FWUC_TemplateDesktopData desktopTemplate) {
        this.remove(desktopTemplate);
        return this;
    }
}
