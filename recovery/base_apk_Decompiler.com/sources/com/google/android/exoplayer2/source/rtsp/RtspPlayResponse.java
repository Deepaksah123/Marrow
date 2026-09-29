package com.google.android.exoplayer2.source.rtsp;

import java.util.List;
import kotlin.initExtraTracks;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class RtspPlayResponse {
    public final RtspSessionTiming sessionTiming;
    public final int status;
    public final initExtraTracks<RtspTrackTiming> trackTimingList;

    public RtspPlayResponse(int i, RtspSessionTiming rtspSessionTiming, List<RtspTrackTiming> list) {
        this.status = i;
        this.sessionTiming = rtspSessionTiming;
        this.trackTimingList = initExtraTracks.write(list);
    }
}
