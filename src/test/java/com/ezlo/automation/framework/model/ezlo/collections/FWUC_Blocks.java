package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.FWUC_BlockData;
import com.google.common.collect.ForwardingSet;

import java.util.*;

public class FWUC_Blocks extends ForwardingSet<FWUC_BlockData> {

    private Set<FWUC_BlockData> delegate;

    public FWUC_Blocks(FWUC_Blocks blocks) {
        this.delegate = new HashSet<>(blocks.delegate);
    }

    public FWUC_Blocks() {
        this.delegate = new HashSet<>();
    }

    public FWUC_Blocks(Collection<FWUC_BlockData> blocks) {
        this.delegate = new HashSet<>(blocks);
    }

    @Override
    protected Set<FWUC_BlockData> delegate() {
        return delegate;
    }

    public FWUC_Blocks withAdded(FWUC_BlockData block) {
        this.add(block);
        return this;
    }

    public FWUC_Blocks withOut(FWUC_BlockData block) {
        this.remove(block);
        return this;
    }
}
