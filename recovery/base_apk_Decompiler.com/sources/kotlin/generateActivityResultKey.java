package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000b\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ+\u0010\f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\f\u0010\u000bJ+\u0010\r\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000bJ+\u0010\u000e\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000bJ+\u0010\u000f\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u000bJ+\u0010\u0010\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u000bJ+\u0010\u0011\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0011\u0010\u000bJ+\u0010\u0012\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007¢\u0006\u0004\b\u0012\u0010\u000b"}, d2 = {"Lo/generateActivityResultKey;", "", "<init>", "()V", "", "Lo/hasHandlers;", "p0", "", "p1", "p2", "read", "(Ljava/util/List;II)I", "MediaBrowserCompatItemReceiver", "IconCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "write", "AudioAttributesImplApi21Parcelizer", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class generateActivityResultKey {
    public static final generateActivityResultKey INSTANCE = new generateActivityResultKey();

    private generateActivityResultKey() {
    }

    public final int read(List<? extends hasHandlers> p0, int p1, int p2) {
        if (p0.isEmpty()) {
            return 0;
        }
        int size = p0.size();
        int iMax = 0;
        int i = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            hasHandlers hashandlers = p0.get(i2);
            float fWrite = getTargetRequestCode.write(getTargetRequestCode.RemoteActionCompatParcelizer(hashandlers));
            int iAudioAttributesCompatParcelizer = hashandlers.AudioAttributesCompatParcelizer(p1);
            if (fWrite == BitmapDescriptorFactory.HUE_RED) {
                i += iAudioAttributesCompatParcelizer;
            } else if (fWrite > BitmapDescriptorFactory.HUE_RED) {
                f += fWrite;
                iMax = Math.max(iMax, Math.round(iAudioAttributesCompatParcelizer / fWrite));
            }
        }
        return Math.round(iMax * f) + i + ((p0.size() - 1) * p2);
    }

    public final int MediaBrowserCompatItemReceiver(List<? extends hasHandlers> p0, int p1, int p2) {
        int iRound;
        if (p0.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((p0.size() - 1) * p2, p1);
        List<? extends hasHandlers> list = p0;
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            hasHandlers hashandlers = p0.get(i);
            float fWrite = getTargetRequestCode.write(getTargetRequestCode.RemoteActionCompatParcelizer(hashandlers));
            if (fWrite == BitmapDescriptorFactory.HUE_RED) {
                int iMin2 = Math.min(hashandlers.IconCompatParcelizer(Integer.MAX_VALUE), p1 == Integer.MAX_VALUE ? Integer.MAX_VALUE : p1 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, hashandlers.AudioAttributesCompatParcelizer(iMin2));
            } else if (fWrite > BitmapDescriptorFactory.HUE_RED) {
                f += fWrite;
            }
        }
        if (f == BitmapDescriptorFactory.HUE_RED) {
            iRound = 0;
        } else {
            iRound = p1 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(p1 - iMin, 0) / f);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            hasHandlers hashandlers2 = p0.get(i2);
            float fWrite2 = getTargetRequestCode.write(getTargetRequestCode.RemoteActionCompatParcelizer(hashandlers2));
            if (fWrite2 > BitmapDescriptorFactory.HUE_RED) {
                iMax = Math.max(iMax, hashandlers2.AudioAttributesCompatParcelizer(iRound != Integer.MAX_VALUE ? Math.round(iRound * fWrite2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int IconCompatParcelizer(List<? extends hasHandlers> p0, int p1, int p2) {
        int iRound;
        if (p0.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((p0.size() - 1) * p2, p1);
        List<? extends hasHandlers> list = p0;
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            hasHandlers hashandlers = p0.get(i);
            float fWrite = getTargetRequestCode.write(getTargetRequestCode.RemoteActionCompatParcelizer(hashandlers));
            if (fWrite == BitmapDescriptorFactory.HUE_RED) {
                int iMin2 = Math.min(hashandlers.write(Integer.MAX_VALUE), p1 == Integer.MAX_VALUE ? Integer.MAX_VALUE : p1 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, hashandlers.read(iMin2));
            } else if (fWrite > BitmapDescriptorFactory.HUE_RED) {
                f += fWrite;
            }
        }
        if (f == BitmapDescriptorFactory.HUE_RED) {
            iRound = 0;
        } else {
            iRound = p1 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(p1 - iMin, 0) / f);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            hasHandlers hashandlers2 = p0.get(i2);
            float fWrite2 = getTargetRequestCode.write(getTargetRequestCode.RemoteActionCompatParcelizer(hashandlers2));
            if (fWrite2 > BitmapDescriptorFactory.HUE_RED) {
                iMax = Math.max(iMax, hashandlers2.read(iRound != Integer.MAX_VALUE ? Math.round(iRound * fWrite2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int AudioAttributesImplApi26Parcelizer(List<? extends hasHandlers> p0, int p1, int p2) {
        if (p0.isEmpty()) {
            return 0;
        }
        int size = p0.size();
        int iMax = 0;
        int i = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            hasHandlers hashandlers = p0.get(i2);
            float fWrite = getTargetRequestCode.write(getTargetRequestCode.RemoteActionCompatParcelizer(hashandlers));
            int i3 = hashandlers.read(p1);
            if (fWrite == BitmapDescriptorFactory.HUE_RED) {
                i += i3;
            } else if (fWrite > BitmapDescriptorFactory.HUE_RED) {
                f += fWrite;
                iMax = Math.max(iMax, Math.round(i3 / fWrite));
            }
        }
        return Math.round(iMax * f) + i + ((p0.size() - 1) * p2);
    }

    public final int write(List<? extends hasHandlers> p0, int p1, int p2) {
        if (p0.isEmpty()) {
            return 0;
        }
        int size = p0.size();
        int iMax = 0;
        int i = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            hasHandlers hashandlers = p0.get(i2);
            float fWrite = getTargetRequestCode.write(getTargetRequestCode.RemoteActionCompatParcelizer(hashandlers));
            int iWrite = hashandlers.write(p1);
            if (fWrite == BitmapDescriptorFactory.HUE_RED) {
                i += iWrite;
            } else if (fWrite > BitmapDescriptorFactory.HUE_RED) {
                f += fWrite;
                iMax = Math.max(iMax, Math.round(iWrite / fWrite));
            }
        }
        return Math.round(iMax * f) + i + ((p0.size() - 1) * p2);
    }

    public final int AudioAttributesImplApi21Parcelizer(List<? extends hasHandlers> p0, int p1, int p2) {
        int iRound;
        if (p0.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((p0.size() - 1) * p2, p1);
        List<? extends hasHandlers> list = p0;
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            hasHandlers hashandlers = p0.get(i);
            float fWrite = getTargetRequestCode.write(getTargetRequestCode.RemoteActionCompatParcelizer(hashandlers));
            if (fWrite == BitmapDescriptorFactory.HUE_RED) {
                int iMin2 = Math.min(hashandlers.IconCompatParcelizer(Integer.MAX_VALUE), p1 == Integer.MAX_VALUE ? Integer.MAX_VALUE : p1 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, hashandlers.write(iMin2));
            } else if (fWrite > BitmapDescriptorFactory.HUE_RED) {
                f += fWrite;
            }
        }
        if (f == BitmapDescriptorFactory.HUE_RED) {
            iRound = 0;
        } else {
            iRound = p1 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(p1 - iMin, 0) / f);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            hasHandlers hashandlers2 = p0.get(i2);
            float fWrite2 = getTargetRequestCode.write(getTargetRequestCode.RemoteActionCompatParcelizer(hashandlers2));
            if (fWrite2 > BitmapDescriptorFactory.HUE_RED) {
                iMax = Math.max(iMax, hashandlers2.write(iRound != Integer.MAX_VALUE ? Math.round(iRound * fWrite2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int AudioAttributesCompatParcelizer(List<? extends hasHandlers> p0, int p1, int p2) {
        int iRound;
        if (p0.isEmpty()) {
            return 0;
        }
        int iMin = Math.min((p0.size() - 1) * p2, p1);
        List<? extends hasHandlers> list = p0;
        int size = list.size();
        int iMax = 0;
        float f = 0.0f;
        for (int i = 0; i < size; i++) {
            hasHandlers hashandlers = p0.get(i);
            float fWrite = getTargetRequestCode.write(getTargetRequestCode.RemoteActionCompatParcelizer(hashandlers));
            if (fWrite == BitmapDescriptorFactory.HUE_RED) {
                int iMin2 = Math.min(hashandlers.write(Integer.MAX_VALUE), p1 == Integer.MAX_VALUE ? Integer.MAX_VALUE : p1 - iMin);
                iMin += iMin2;
                iMax = Math.max(iMax, hashandlers.IconCompatParcelizer(iMin2));
            } else if (fWrite > BitmapDescriptorFactory.HUE_RED) {
                f += fWrite;
            }
        }
        if (f == BitmapDescriptorFactory.HUE_RED) {
            iRound = 0;
        } else {
            iRound = p1 == Integer.MAX_VALUE ? Integer.MAX_VALUE : Math.round(Math.max(p1 - iMin, 0) / f);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            hasHandlers hashandlers2 = p0.get(i2);
            float fWrite2 = getTargetRequestCode.write(getTargetRequestCode.RemoteActionCompatParcelizer(hashandlers2));
            if (fWrite2 > BitmapDescriptorFactory.HUE_RED) {
                iMax = Math.max(iMax, hashandlers2.IconCompatParcelizer(iRound != Integer.MAX_VALUE ? Math.round(iRound * fWrite2) : Integer.MAX_VALUE));
            }
        }
        return iMax;
    }

    public final int RemoteActionCompatParcelizer(List<? extends hasHandlers> p0, int p1, int p2) {
        if (p0.isEmpty()) {
            return 0;
        }
        int size = p0.size();
        int iMax = 0;
        int i = 0;
        float f = 0.0f;
        for (int i2 = 0; i2 < size; i2++) {
            hasHandlers hashandlers = p0.get(i2);
            float fWrite = getTargetRequestCode.write(getTargetRequestCode.RemoteActionCompatParcelizer(hashandlers));
            int iIconCompatParcelizer = hashandlers.IconCompatParcelizer(p1);
            if (fWrite == BitmapDescriptorFactory.HUE_RED) {
                i += iIconCompatParcelizer;
            } else if (fWrite > BitmapDescriptorFactory.HUE_RED) {
                f += fWrite;
                iMax = Math.max(iMax, Math.round(iIconCompatParcelizer / fWrite));
            }
        }
        return Math.round(iMax * f) + i + ((p0.size() - 1) * p2);
    }
}
