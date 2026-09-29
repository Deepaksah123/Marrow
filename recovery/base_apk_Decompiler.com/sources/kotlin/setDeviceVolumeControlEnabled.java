package kotlin;

import android.graphics.Bitmap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000 \b2\u00020\u0001:\u0001\bJ'\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ'\u0010\n\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/setDeviceVolumeControlEnabled;", "", "", "p0", "p1", "Landroid/graphics/Bitmap$Config;", "p2", "Landroid/graphics/Bitmap;", "read", "(IILandroid/graphics/Bitmap$Config;)Landroid/graphics/Bitmap;", "IconCompatParcelizer", "", "RemoteActionCompatParcelizer", "(Landroid/graphics/Bitmap;)V", "AudioAttributesCompatParcelizer", "(I)V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface setDeviceVolumeControlEnabled {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.read;

    void AudioAttributesCompatParcelizer(int p0);

    Bitmap IconCompatParcelizer(int p0, int p1, Bitmap.Config p2);

    void RemoteActionCompatParcelizer(Bitmap p0);

    Bitmap read(int p0, int p1, Bitmap.Config p2);

    /* JADX INFO: renamed from: o.setDeviceVolumeControlEnabled$read, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion read = new Companion();

        private Companion() {
        }
    }
}
