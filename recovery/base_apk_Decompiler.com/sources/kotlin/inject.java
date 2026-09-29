package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ%\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\tJ5\u0010\r\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u0004¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lo/inject;", "", "<init>", "()V", "", "p0", "p1", "p2", "AudioAttributesCompatParcelizer", "(FFF)F", "IconCompatParcelizer", "p3", "p4", "read", "(FFFFF)F"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class inject {
    public static final inject INSTANCE = new inject();

    public final float AudioAttributesCompatParcelizer(float p0, float p1, float p2) {
        return p0 + ((p1 - p0) * p2);
    }

    public final float IconCompatParcelizer(float p0, float p1, float p2) {
        return p0 == p1 ? BitmapDescriptorFactory.HUE_RED : (p2 - p0) / (p1 - p0);
    }

    private inject() {
    }

    public final float read(float p0, float p1, float p2, float p3, float p4) {
        return AudioAttributesCompatParcelizer(p0, p1, Math.max(BitmapDescriptorFactory.HUE_RED, Math.min(1.0f, IconCompatParcelizer(p2, p3, p4))));
    }
}
