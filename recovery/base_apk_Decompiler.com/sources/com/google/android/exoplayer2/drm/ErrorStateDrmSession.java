package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.decoder.CryptoConfig;
import com.google.android.exoplayer2.drm.DrmSession;
import com.google.android.exoplayer2.drm.DrmSessionEventListener;
import com.google.android.exoplayer2.util.Assertions;
import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class ErrorStateDrmSession implements DrmSession {
    private final DrmSession.DrmSessionException error;

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void acquire(DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final CryptoConfig getCryptoConfig() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final byte[] getOfflineLicenseKeySetId() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final int getState() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final boolean playClearSamplesWithoutKeys() {
        return false;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final Map<String, String> queryKeyStatus() {
        return null;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final void release(DrmSessionEventListener.EventDispatcher eventDispatcher) {
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final boolean requiresSecureDecoder(String str) {
        return false;
    }

    public ErrorStateDrmSession(DrmSession.DrmSessionException drmSessionException) {
        this.error = (DrmSession.DrmSessionException) Assertions.checkNotNull(drmSessionException);
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final DrmSession.DrmSessionException getError() {
        return this.error;
    }

    @Override // com.google.android.exoplayer2.drm.DrmSession
    public final UUID getSchemeUuid() {
        return C.UUID_NIL;
    }
}
