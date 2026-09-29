package com.google.android.exoplayer2;

import com.google.android.exoplayer2.drm.DrmSession;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class FormatHolder {
    public DrmSession drmSession;
    public Format format;

    public final void clear() {
        this.drmSession = null;
        this.format = null;
    }
}
