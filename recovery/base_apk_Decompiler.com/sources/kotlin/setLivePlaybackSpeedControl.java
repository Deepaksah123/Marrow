package kotlin;

import android.graphics.Bitmap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b`\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011J)\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000b\u001a\u0004\u0018\u00010\u0007H&¢\u0006\u0004\b\u000b\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0011\u0010\u0012"}, d2 = {"Lo/setLivePlaybackSpeedControl;", "", "", "p0", "p1", "Landroid/graphics/Bitmap$Config;", "p2", "Landroid/graphics/Bitmap;", "IconCompatParcelizer", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "", "AudioAttributesCompatParcelizer", "(Landroid/graphics/Bitmap;)V", "()Landroid/graphics/Bitmap;", "", "read", "(Landroid/graphics/Bitmap;)Ljava/lang/String;", "RemoteActionCompatParcelizer", "(IILandroid/graphics/Bitmap$Config;)Ljava/lang/String;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface setLivePlaybackSpeedControl {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.RemoteActionCompatParcelizer;

    Bitmap AudioAttributesCompatParcelizer();

    void AudioAttributesCompatParcelizer(Bitmap p0);

    Bitmap IconCompatParcelizer(int p0, int p1, Bitmap.Config p2);

    String RemoteActionCompatParcelizer(int p0, int p1, Bitmap.Config p2);

    String read(Bitmap p0);

    /* JADX INFO: renamed from: o.setLivePlaybackSpeedControl$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion RemoteActionCompatParcelizer = new Companion();

        private Companion() {
        }

        public static setLivePlaybackSpeedControl read() {
            return new setUsePlatformDiagnostics();
        }
    }
}
