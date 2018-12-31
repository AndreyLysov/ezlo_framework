package com.ezlo.automation.framework.model.ezlo.collections;

import com.ezlo.automation.framework.model.ezlo.data.MediaAboutData;
import com.google.common.collect.ForwardingSet;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class MediaAbouts extends ForwardingSet<MediaAboutData> {

    private Set<MediaAboutData> delegate;

    public MediaAbouts(MediaAbouts mediaAbouts) {
        this.delegate = new HashSet<>(mediaAbouts.delegate);
    }

    public MediaAbouts() {
        this.delegate = new HashSet<>();
    }

    public MediaAbouts(Collection<MediaAboutData> mediaAbouts) {
        this.delegate = new HashSet<>(mediaAbouts);
    }

    @Override
    protected Set<MediaAboutData> delegate() {
        return delegate;
    }

    public MediaAbouts withAdded(MediaAboutData mediaAbout) {
        this.add(mediaAbout);
        return this;
    }

    public MediaAbouts withOut(MediaAboutData mediaAbout) {
        this.remove(mediaAbout);
        return this;
    }
}
