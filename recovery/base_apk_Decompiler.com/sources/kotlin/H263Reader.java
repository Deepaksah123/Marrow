package kotlin;

import android.os.Bundle;

/* JADX INFO: loaded from: classes5.dex */
public final class H263Reader implements onStartCode {
    private final TrackSampleTable IconCompatParcelizer;

    public H263Reader(TrackSampleTable trackSampleTable) {
        this.IconCompatParcelizer = trackSampleTable;
    }

    @Override // kotlin.onStartCode
    public final void write(String str, Bundle bundle) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer("clx", str, bundle);
    }
}
