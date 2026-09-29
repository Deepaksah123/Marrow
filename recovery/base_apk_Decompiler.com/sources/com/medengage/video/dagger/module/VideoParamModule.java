package com.medengage.video.dagger.module;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.DefaultLoadControl;
import com.google.android.exoplayer2.audio.AacUtil;
import com.google.android.exoplayer2.audio.MpegAudioUtil;
import com.google.android.exoplayer2.upstream.DefaultAllocator;
import com.google.android.gms.auth.api.proxy.AuthApiStatusCodes;

/* JADX INFO: loaded from: classes5.dex */
public abstract class VideoParamModule {
    public static DefaultLoadControl AudioAttributesCompatParcelizer = RemoteActionCompatParcelizer();

    private static DefaultLoadControl RemoteActionCompatParcelizer() {
        return new DefaultLoadControl.Builder().setAllocator(new DefaultAllocator(true, C.DEFAULT_BUFFER_SEGMENT_SIZE)).setBufferDurationsMs(20000, MpegAudioUtil.MAX_RATE_BYTES_PER_SECOND, 2000, AuthApiStatusCodes.AUTH_API_INVALID_CREDENTIALS).setTargetBufferBytes(-1).setPrioritizeTimeOverSizeThresholds(true).setBackBuffer(AacUtil.AAC_HE_V1_MAX_RATE_BYTES_PER_SECOND, true).build();
    }
}
