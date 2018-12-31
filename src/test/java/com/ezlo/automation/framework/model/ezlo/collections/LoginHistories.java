package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.LoginHistoryData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


public class LoginHistories extends ForwardingSet<LoginHistoryData> {

    private Set<LoginHistoryData> delegate;

    public LoginHistories(LoginHistories loginHistories) {
        this.delegate = new HashSet<>(loginHistories.delegate);
    }

    public LoginHistories() {
        this.delegate = new HashSet<>();
    }

    public LoginHistories(Collection<LoginHistoryData> loginHistoryDatas) {
        this.delegate = new HashSet<>(loginHistoryDatas);
    }

    @Override
    protected Set<LoginHistoryData> delegate() {
        return delegate;
    }

    public LoginHistories withAdded(LoginHistoryData loginHistoryData) {
        this.add(loginHistoryData);
        return this;
    }

    public LoginHistories withOut(LoginHistoryData loginHistoryData) {
        this.remove(loginHistoryData);
        return this;
    }
}