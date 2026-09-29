package com.google.android.exoplayer2.source.rtsp;

import java.util.List;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class RtspOptionsResponse {
    public final int status;
    public final initExtraTracks<Integer> supportedMethods;

    public RtspOptionsResponse(int i, List<Integer> list) {
        this.status = i;
        this.supportedMethods = initExtraTracks.write(list);
    }
}
