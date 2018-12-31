package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.FWUC_TemplateAndroidData;
import com.google.common.collect.ForwardingSet;

import java.util.*;

public class FWUC_AndroidTemplates extends ForwardingSet<FWUC_TemplateAndroidData> {

    private Set<FWUC_TemplateAndroidData> delegate;

    public FWUC_AndroidTemplates(FWUC_AndroidTemplates androidTemplates) {
        this.delegate = new HashSet<>(androidTemplates.delegate);
    }

    public FWUC_AndroidTemplates() {
        this.delegate = new HashSet<>();
    }

    public FWUC_AndroidTemplates(Collection<FWUC_TemplateAndroidData> androidTemplates) {
        this.delegate = new HashSet<>(androidTemplates);
    }

    @Override
    protected Set<FWUC_TemplateAndroidData> delegate() {
        return delegate;
    }

    public FWUC_AndroidTemplates withAdded(FWUC_TemplateAndroidData androidTemplate) {
        this.add(androidTemplate);
        return this;
    }

    public FWUC_AndroidTemplates withOut(FWUC_TemplateAndroidData androidTemplate) {
        this.remove(androidTemplate);
        return this;
    }
}
