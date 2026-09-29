package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class DummyExtractorOutput implements ExtractorOutput {
    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public final void endTracks() {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public final void seekMap(SeekMap seekMap) {
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorOutput
    public final TrackOutput track(int i, int i2) {
        return new DummyTrackOutput();
    }
}
