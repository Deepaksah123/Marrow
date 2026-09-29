package com.google.android.exoplayer2.drm;

import com.google.android.exoplayer2.drm.ExoMediaDrm;
import com.google.android.exoplayer2.util.Assertions;
import java.util.UUID;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class LocalMediaDrmCallback implements MediaDrmCallback {
    private final byte[] keyResponse;

    public LocalMediaDrmCallback(byte[] bArr) {
        this.keyResponse = (byte[]) Assertions.checkNotNull(bArr);
    }

    @Override // com.google.android.exoplayer2.drm.MediaDrmCallback
    public final byte[] executeProvisionRequest(UUID uuid, ExoMediaDrm.ProvisionRequest provisionRequest) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.exoplayer2.drm.MediaDrmCallback
    public final byte[] executeKeyRequest(UUID uuid, ExoMediaDrm.KeyRequest keyRequest) {
        return this.keyResponse;
    }
}
