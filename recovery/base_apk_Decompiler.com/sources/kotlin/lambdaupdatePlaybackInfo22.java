package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J#\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0096@ø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/lambdaupdatePlaybackInfo22;", "Lo/maskWindowPositionMsOrGetPeriodPositionUs;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "Lo/lambdaupdatePlaybackInfo24;", "p0", "Lo/lambdasetRepeatMode3;", "p1", "", "read", "(Lo/lambdaupdatePlaybackInfo24;Lo/lambdasetRepeatMode3;Lo/SampleVideos;)Ljava/lang/Object;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class lambdaupdatePlaybackInfo22 implements maskWindowPositionMsOrGetPeriodPositionUs {
    public static final lambdaupdatePlaybackInfo22 INSTANCE = new lambdaupdatePlaybackInfo22();

    private lambdaupdatePlaybackInfo22() {
    }

    @Override // kotlin.maskWindowPositionMsOrGetPeriodPositionUs
    public final Object read(lambdaupdatePlaybackInfo24 lambdaupdateplaybackinfo24, lambdasetRepeatMode3 lambdasetrepeatmode3, SampleVideos<? super getShowPopup> sampleVideos) {
        if (lambdasetrepeatmode3 instanceof lambdasetAudioSessionId9) {
            lambdaupdateplaybackinfo24.RemoteActionCompatParcelizer(((lambdasetAudioSessionId9) lambdasetrepeatmode3).IconCompatParcelizer());
        } else if (lambdasetrepeatmode3 instanceof handlePlaybackInfo) {
            lambdasetrepeatmode3.IconCompatParcelizer();
        }
        return getShowPopup.INSTANCE;
    }

    public final String toString() {
        return "coil.transition.NoneTransition";
    }
}
