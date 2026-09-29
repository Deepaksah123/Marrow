package kotlin;

import com.marrow.data.models.pearl.PearlMini;

/* JADX INFO: loaded from: classes3.dex */
public final class getStreamPositionUsWithNotYetStartedHandling implements ServerSideAdInsertionMediaSourceSharedMediaPeriod {
    private getStreamPositionUsForContent IconCompatParcelizer;
    private SingleSampleMediaSourceFactory write;

    @setSdkPayload
    public getStreamPositionUsWithNotYetStartedHandling(SingleSampleMediaSourceFactory singleSampleMediaSourceFactory, getStreamPositionUsForContent getstreampositionusforcontent) {
        this.write = singleSampleMediaSourceFactory;
        this.IconCompatParcelizer = getstreampositionusforcontent;
    }

    @Override // kotlin.ServerSideAdInsertionMediaSourceSharedMediaPeriod
    public final PearlMini IconCompatParcelizer(String str) {
        throw new UnsupportedOperationException("Cannot load the PearlMini directly from the remote API");
    }
}
