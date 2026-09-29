package kotlin;

import android.graphics.Bitmap;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a7\u0010\r\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u0002\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0002\u0010\u000f\u001a\u0013\u0010\u0002\u001a\u00020\u0010*\u00020\u0007H\u0000¢\u0006\u0004\b\u0002\u0010\u0011\u001a\u0013\u0010\u0012\u001a\u00020\u0007*\u00020\u0010H\u0000¢\u0006\u0004\b\u0012\u0010\u0013"}, d2 = {"Landroid/graphics/Bitmap;", "Lo/unshare;", "AudioAttributesCompatParcelizer", "(Landroid/graphics/Bitmap;)Lo/unshare;", "", "p0", "p1", "Lo/contentsAsInt;", "p2", "", "p3", "Lo/findImplicitPropertyName;", "p4", "read", "(IIIZLo/findImplicitPropertyName;)Lo/unshare;", "(Lo/unshare;)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$Config;", "(I)Landroid/graphics/Bitmap$Config;", "write", "(Landroid/graphics/Bitmap$Config;)I"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _allocMore {
    public static final unshare AudioAttributesCompatParcelizer(Bitmap bitmap) {
        return new completeAndCoalesce(bitmap);
    }

    public static final unshare read(int i, int i2, int i3, boolean z, findImplicitPropertyName findimplicitpropertyname) {
        AudioAttributesCompatParcelizer(i3);
        return new completeAndCoalesce(withSeparators.RemoteActionCompatParcelizer(i, i2, i3, z, findimplicitpropertyname));
    }

    public static final Bitmap AudioAttributesCompatParcelizer(unshare unshareVar) {
        if (unshareVar instanceof completeAndCoalesce) {
            return ((completeAndCoalesce) unshareVar).getWrite();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final Bitmap.Config AudioAttributesCompatParcelizer(int i) {
        if (contentsAsInt.write(i, contentsAsInt.INSTANCE.write())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (contentsAsInt.write(i, contentsAsInt.INSTANCE.IconCompatParcelizer())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (contentsAsInt.write(i, contentsAsInt.INSTANCE.read())) {
            return Bitmap.Config.RGB_565;
        }
        if (contentsAsInt.write(i, contentsAsInt.INSTANCE.AudioAttributesCompatParcelizer())) {
            return Bitmap.Config.RGBA_F16;
        }
        if (contentsAsInt.write(i, contentsAsInt.INSTANCE.RemoteActionCompatParcelizer())) {
            return Bitmap.Config.HARDWARE;
        }
        return Bitmap.Config.ARGB_8888;
    }

    public static final int write(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return contentsAsInt.INSTANCE.IconCompatParcelizer();
        }
        if (config == Bitmap.Config.RGB_565) {
            return contentsAsInt.INSTANCE.read();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return contentsAsInt.INSTANCE.write();
        }
        if (config == Bitmap.Config.RGBA_F16) {
            return contentsAsInt.INSTANCE.AudioAttributesCompatParcelizer();
        }
        if (config == Bitmap.Config.HARDWARE) {
            return contentsAsInt.INSTANCE.RemoteActionCompatParcelizer();
        }
        return contentsAsInt.INSTANCE.write();
    }
}
