package com.google.android.exoplayer2.source.hls;

import java.io.IOException;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class SampleQueueMappingException extends IOException {
    public SampleQueueMappingException(String str) {
        StringBuilder sb = new StringBuilder("Unable to bind a sample queue to TrackGroup with MIME type ");
        sb.append(str);
        sb.append(".");
        super(sb.toString());
    }
}
