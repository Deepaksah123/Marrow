package kotlin;

import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lo/withSeparators;", "", "<init>", "()V", "", "p0", "p1", "Lo/contentsAsInt;", "p2", "", "p3", "Lo/findImplicitPropertyName;", "p4", "Landroid/graphics/Bitmap;", "RemoteActionCompatParcelizer", "(IIIZLo/findImplicitPropertyName;)Landroid/graphics/Bitmap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class withSeparators {
    public static final withSeparators INSTANCE = new withSeparators();

    private withSeparators() {
    }

    @getMagicModuleMeta
    public static final Bitmap RemoteActionCompatParcelizer(int p0, int p1, int p2, boolean p3, findImplicitPropertyName p4) {
        return Bitmap.createBitmap((DisplayMetrics) null, p0, p1, _allocMore.AudioAttributesCompatParcelizer(p2), p3, getBufferRecycler.write(p4));
    }
}
