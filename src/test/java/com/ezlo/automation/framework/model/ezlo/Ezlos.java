package com.ezlo.automation.framework.model.ezlo;

import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Ezlos extends ForwardingSet<EzlosData> {

    private Set<EzlosData> delegate;

    public Ezlos(Ezlos ezlos) {
        this.delegate = new HashSet<EzlosData>(ezlos.delegate);
    }

    public Ezlos() {
        this.delegate = new HashSet<>();
    }

    public Ezlos(Collection<EzlosData> ezlos) {
        this.delegate = new HashSet<>(ezlos);
    }

    protected Set<EzlosData> delegate() {
        return delegate;
    }

    public Ezlos withAdded(EzlosData ezlo) {
        Ezlos ezlos = new Ezlos(this);
        ezlos.add(ezlo);
        return ezlos;
    }

    public Ezlos withDeleted(EzlosData ezlo) {
        Ezlos ezlos = new Ezlos(this);
        ezlos.remove(ezlo);
        return ezlos;
    }

    public Ezlos withModified(EzlosData modifiedEzlo, EzlosData ezlo) {
        Ezlos ezlos = new Ezlos(this);
        ezlos.remove(modifiedEzlo);
        ezlos.add(ezlo);
        return ezlos;
    }
}
