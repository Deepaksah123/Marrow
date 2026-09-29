package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class scheduleNextWork {
    private final float[] RemoteActionCompatParcelizer;
    private final int[] write;

    public scheduleNextWork(float[] fArr, int[] iArr) {
        this.RemoteActionCompatParcelizer = fArr;
        this.write = iArr;
    }

    public final float[] write() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int[] read() {
        return this.write;
    }

    public final int IconCompatParcelizer() {
        return this.write.length;
    }

    public final void IconCompatParcelizer(scheduleNextWork schedulenextwork, scheduleNextWork schedulenextwork2, float f) {
        int[] iArr;
        if (schedulenextwork.equals(schedulenextwork2)) {
            RemoteActionCompatParcelizer(schedulenextwork);
            return;
        }
        if (f <= BitmapDescriptorFactory.HUE_RED) {
            RemoteActionCompatParcelizer(schedulenextwork);
            return;
        }
        if (f >= 1.0f) {
            RemoteActionCompatParcelizer(schedulenextwork2);
            return;
        }
        if (schedulenextwork.write.length != schedulenextwork2.write.length) {
            StringBuilder sb = new StringBuilder("Cannot interpolate between gradients. Lengths vary (");
            sb.append(schedulenextwork.write.length);
            sb.append(" vs ");
            sb.append(schedulenextwork2.write.length);
            sb.append(")");
            throw new IllegalArgumentException(sb.toString());
        }
        int i = 0;
        while (true) {
            iArr = schedulenextwork.write;
            if (i >= iArr.length) {
                break;
            }
            this.RemoteActionCompatParcelizer[i] = setColorInfo.RemoteActionCompatParcelizer(schedulenextwork.RemoteActionCompatParcelizer[i], schedulenextwork2.RemoteActionCompatParcelizer[i], f);
            this.write[i] = setAccessibilityChannel.write(f, schedulenextwork.write[i], schedulenextwork2.write[i]);
            i++;
        }
        int length = iArr.length;
        while (true) {
            float[] fArr = this.RemoteActionCompatParcelizer;
            if (length >= fArr.length) {
                return;
            }
            int[] iArr2 = schedulenextwork.write;
            fArr[length] = fArr[iArr2.length - 1];
            int[] iArr3 = this.write;
            iArr3[length] = iArr3[iArr2.length - 1];
            length++;
        }
    }

    public final scheduleNextWork IconCompatParcelizer(float[] fArr) {
        int[] iArr = new int[fArr.length];
        for (int i = 0; i < fArr.length; i++) {
            iArr[i] = IconCompatParcelizer(fArr[i]);
        }
        return new scheduleNextWork(fArr, iArr);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        scheduleNextWork schedulenextwork = (scheduleNextWork) obj;
        return Arrays.equals(this.RemoteActionCompatParcelizer, schedulenextwork.RemoteActionCompatParcelizer) && Arrays.equals(this.write, schedulenextwork.write);
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.RemoteActionCompatParcelizer) * 31) + Arrays.hashCode(this.write);
    }

    private int IconCompatParcelizer(float f) {
        int iBinarySearch = Arrays.binarySearch(this.RemoteActionCompatParcelizer, f);
        if (iBinarySearch >= 0) {
            return this.write[iBinarySearch];
        }
        int i = -(iBinarySearch + 1);
        if (i == 0) {
            return this.write[0];
        }
        int[] iArr = this.write;
        if (i == iArr.length - 1) {
            return iArr[iArr.length - 1];
        }
        float[] fArr = this.RemoteActionCompatParcelizer;
        int i2 = i - 1;
        float f2 = fArr[i2];
        return setAccessibilityChannel.write((f - f2) / (fArr[i] - f2), iArr[i2], iArr[i]);
    }

    private void RemoteActionCompatParcelizer(scheduleNextWork schedulenextwork) {
        int i = 0;
        while (true) {
            int[] iArr = schedulenextwork.write;
            if (i >= iArr.length) {
                return;
            }
            this.RemoteActionCompatParcelizer[i] = schedulenextwork.RemoteActionCompatParcelizer[i];
            this.write[i] = iArr[i];
            i++;
        }
    }
}
