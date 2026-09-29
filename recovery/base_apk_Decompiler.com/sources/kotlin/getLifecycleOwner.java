package kotlin;

import android.content.Context;
import android.os.Build;
import android.widget.EdgeEffect;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\u00020\t*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000f\u001a\u00020\u000e*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0007\u001a\u00020\t*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0007\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u000e*\u00020\u00062\u0006\u0010\u0005\u001a\u00020\t¢\u0006\u0004\b\u0014\u0010\u0015R\u0015\u0010\u0014\u001a\u00020\t*\u00020\u00068G¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lo/getLifecycleOwner;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/widget/EdgeEffect;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;)Landroid/widget/EdgeEffect;", "", "p1", "RemoteActionCompatParcelizer", "(Landroid/widget/EdgeEffect;FF)F", "", "", "read", "(Landroid/widget/EdgeEffect;I)V", "Lo/bufferMapProperty;", "p2", "(Landroid/widget/EdgeEffect;FFLo/bufferMapProperty;)F", "IconCompatParcelizer", "(Landroid/widget/EdgeEffect;F)V", "write", "(Landroid/widget/EdgeEffect;)F"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getLifecycleOwner {
    public static final getLifecycleOwner INSTANCE = new getLifecycleOwner();

    private getLifecycleOwner() {
    }

    public final EdgeEffect AudioAttributesCompatParcelizer(Context p0) {
        if (Build.VERSION.SDK_INT >= 31) {
            return getContentCaptureManagerui.INSTANCE.AudioAttributesCompatParcelizer(p0, null);
        }
        return new setModifier(p0);
    }

    public final float RemoteActionCompatParcelizer(EdgeEffect edgeEffect, float f, float f2) {
        if (Build.VERSION.SDK_INT >= 31) {
            return getContentCaptureManagerui.INSTANCE.RemoteActionCompatParcelizer(edgeEffect, f, f2);
        }
        edgeEffect.onPull(f, f2);
        return f;
    }

    public final void read(EdgeEffect edgeEffect, int i) {
        if (Build.VERSION.SDK_INT >= 31) {
            edgeEffect.onAbsorb(i);
        } else if (edgeEffect.isFinished()) {
            edgeEffect.onAbsorb(i);
        }
    }

    public final float AudioAttributesCompatParcelizer(EdgeEffect edgeEffect, float f, float f2, bufferMapProperty buffermapproperty) {
        if (getDensity.IconCompatParcelizer(buffermapproperty, f) > write(edgeEffect) * f2) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        read(edgeEffect, getOnline.RemoteActionCompatParcelizer(f));
        return f;
    }

    public final void IconCompatParcelizer(EdgeEffect edgeEffect, float f) {
        if (edgeEffect instanceof setModifier) {
            ((setModifier) edgeEffect).RemoteActionCompatParcelizer(f);
        } else {
            edgeEffect.onRelease();
        }
    }

    public final float write(EdgeEffect edgeEffect) {
        return Build.VERSION.SDK_INT >= 31 ? getContentCaptureManagerui.INSTANCE.RemoteActionCompatParcelizer(edgeEffect) : BitmapDescriptorFactory.HUE_RED;
    }
}
