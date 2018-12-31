package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.TokenData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Tokens extends ForwardingSet<TokenData> {

    private Set<TokenData> delegate;

    public Tokens(Tokens tokens) {
        this.delegate = new HashSet<>(tokens.delegate);
    }

    public Tokens() {
        this.delegate = new HashSet<>();
    }

    public Tokens(Collection<TokenData> tokens) {
        this.delegate = new HashSet<>(tokens);
    }

    @Override
    protected Set<TokenData> delegate() {
        return delegate;
    }

    public Tokens withAdded(TokenData token) {
        this.add(token);
        return this;
    }

    public Tokens withOut(TokenData token) {
        this.remove(token);
        return this;
    }
}
