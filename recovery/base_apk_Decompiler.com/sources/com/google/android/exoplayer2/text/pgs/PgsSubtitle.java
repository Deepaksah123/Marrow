package com.google.android.exoplayer2.text.pgs;

import com.google.android.exoplayer2.text.Cue;
import com.google.android.exoplayer2.text.Subtitle;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
final class PgsSubtitle implements Subtitle {
    private final List<Cue> cues;

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final long getEventTime(int i) {
        return 0L;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final int getEventTimeCount() {
        return 1;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final int getNextEventTimeIndex(long j) {
        return -1;
    }

    public PgsSubtitle(List<Cue> list) {
        this.cues = list;
    }

    @Override // com.google.android.exoplayer2.text.Subtitle
    public final List<Cue> getCues(long j) {
        return this.cues;
    }
}
