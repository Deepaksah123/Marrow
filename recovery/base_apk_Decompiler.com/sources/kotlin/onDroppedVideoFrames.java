package kotlin;

import java.util.Date;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0006H&¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/onDroppedVideoFrames;", "", "", "AudioAttributesCompatParcelizer", "()J", "RemoteActionCompatParcelizer", "", "IconCompatParcelizer", "()I", "Ljava/util/Date;", "read", "()Ljava/util/Date;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface onDroppedVideoFrames {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.RemoteActionCompatParcelizer;
    public static final onDroppedVideoFrames IconCompatParcelizer = new RemoteActionCompatParcelizer();

    long AudioAttributesCompatParcelizer();

    int IconCompatParcelizer();

    long RemoteActionCompatParcelizer();

    Date read();

    /* JADX INFO: renamed from: o.onDroppedVideoFrames$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes2.dex */
    public static final class Companion {
        static final /* synthetic */ Companion RemoteActionCompatParcelizer = new Companion();

        private Companion() {
        }
    }

    public static final class RemoteActionCompatParcelizer implements onDroppedVideoFrames {
        RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.onDroppedVideoFrames
        public final long AudioAttributesCompatParcelizer() {
            return System.currentTimeMillis();
        }

        @Override // kotlin.onDroppedVideoFrames
        public final Date read() {
            return new Date();
        }

        @Override // kotlin.onDroppedVideoFrames
        public final long RemoteActionCompatParcelizer() {
            return TimeUnit.MILLISECONDS.toSeconds(AudioAttributesCompatParcelizer());
        }

        @Override // kotlin.onDroppedVideoFrames
        public final int IconCompatParcelizer() {
            return (int) (AudioAttributesCompatParcelizer() / 1000);
        }
    }
}
