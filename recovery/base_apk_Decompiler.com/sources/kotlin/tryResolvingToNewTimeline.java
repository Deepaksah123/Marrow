package kotlin;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class tryResolvingToNewTimeline {
    private final onUnderrun read;

    public tryResolvingToNewTimeline(Context context) {
        this.read = new onUnderrun(context);
    }

    public final updateSessions AudioAttributesCompatParcelizer(DefaultPlaybackSessionManagerExternalSyntheticLambda0 defaultPlaybackSessionManagerExternalSyntheticLambda0) {
        return new PlayerId(new playToEndOfStream(this.read, defaultPlaybackSessionManagerExternalSyntheticLambda0));
    }
}
