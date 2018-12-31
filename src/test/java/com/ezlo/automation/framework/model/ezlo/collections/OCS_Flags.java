package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.OCS_FlagData;
import com.google.common.collect.ForwardingSet;

import java.util.*;

public class OCS_Flags extends ForwardingSet<OCS_FlagData> {

    private Set<OCS_FlagData> delegate;

    public OCS_Flags(OCS_Flags flags) {
        this.delegate = new HashSet<>(flags.delegate);
    }

    public OCS_Flags() {
        this.delegate = new HashSet<>();
    }

    public OCS_Flags(Collection<OCS_FlagData> flags) {
        this.delegate = new HashSet<>(flags);
    }

    @Override
    protected Set<OCS_FlagData> delegate() {
        return delegate;
    }

    public OCS_Flags withAdded(OCS_FlagData flag) {
        this.add(flag);
        return this;
    }

    public OCS_Flags withOut(OCS_FlagData flag) {
        this.remove(flag);
        return this;
    }
}
