package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.drmSessionManagerError;

/* JADX INFO: loaded from: classes2.dex */
public final class DrmSessionEventListener extends drmSessionManagerError.read {
    private static drmSessionManagerError<DrmSessionEventListener> AudioAttributesCompatParcelizer;
    public float IconCompatParcelizer;
    public float RemoteActionCompatParcelizer;

    static {
        drmSessionManagerError<DrmSessionEventListener> drmsessionmanagererrorIconCompatParcelizer = drmSessionManagerError.IconCompatParcelizer(256, new DrmSessionEventListener((byte) 0));
        AudioAttributesCompatParcelizer = drmsessionmanagererrorIconCompatParcelizer;
        drmsessionmanagererrorIconCompatParcelizer.IconCompatParcelizer();
    }

    @Override // o.drmSessionManagerError.read
    protected final drmSessionManagerError.read RemoteActionCompatParcelizer() {
        return new DrmSessionEventListener((byte) 0);
    }

    public static DrmSessionEventListener IconCompatParcelizer(float f, float f2) {
        DrmSessionEventListener drmSessionEventListener = (DrmSessionEventListener) AudioAttributesCompatParcelizer.write();
        drmSessionEventListener.RemoteActionCompatParcelizer = f;
        drmSessionEventListener.IconCompatParcelizer = f2;
        return drmSessionEventListener;
    }

    public static void IconCompatParcelizer(DrmSessionEventListener drmSessionEventListener) {
        AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(drmSessionEventListener);
    }

    public DrmSessionEventListener() {
    }

    private DrmSessionEventListener(byte b) {
        this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.IconCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrmSessionEventListener) {
            DrmSessionEventListener drmSessionEventListener = (DrmSessionEventListener) obj;
            if (this.RemoteActionCompatParcelizer == drmSessionEventListener.RemoteActionCompatParcelizer && this.IconCompatParcelizer == drmSessionEventListener.IconCompatParcelizer) {
                return true;
            }
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("x");
        sb.append(this.IconCompatParcelizer);
        return sb.toString();
    }

    public final int hashCode() {
        return Float.floatToIntBits(this.IconCompatParcelizer) ^ Float.floatToIntBits(this.RemoteActionCompatParcelizer);
    }
}
