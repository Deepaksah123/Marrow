package kotlin;

import android.graphics.Color;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class ExoPlayerImplInternalMoveMediaItemsMessage implements copyWithCryptoType<scheduleNextWork> {
    private int write;

    @Override // kotlin.copyWithCryptoType
    public final /* synthetic */ scheduleNextWork AudioAttributesCompatParcelizer(Format1 format1, float f) throws IOException {
        return IconCompatParcelizer(format1);
    }

    public ExoPlayerImplInternalMoveMediaItemsMessage(int i) {
        this.write = i;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00cc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private kotlin.scheduleNextWork IconCompatParcelizer(kotlin.Format1 r15) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ExoPlayerImplInternalMoveMediaItemsMessage.IconCompatParcelizer(o.Format1):o.scheduleNextWork");
    }

    private scheduleNextWork AudioAttributesCompatParcelizer(scheduleNextWork schedulenextwork, List<Float> list) {
        int i = this.write << 2;
        if (list.size() <= i) {
            return schedulenextwork;
        }
        float[] fArrWrite = schedulenextwork.write();
        int[] iArr = schedulenextwork.read();
        int size = (list.size() - i) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i2 = 0;
        while (i < list.size()) {
            if (i % 2 == 0) {
                fArr[i2] = list.get(i).floatValue();
            } else {
                fArr2[i2] = list.get(i).floatValue();
                i2++;
            }
            i++;
        }
        float[] fArrWrite2 = write(schedulenextwork.write(), fArr);
        int length = fArrWrite2.length;
        int[] iArr2 = new int[length];
        for (int i3 = 0; i3 < length; i3++) {
            float f = fArrWrite2[i3];
            int iBinarySearch = Arrays.binarySearch(fArrWrite, f);
            int iBinarySearch2 = Arrays.binarySearch(fArr, f);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                iArr2[i3] = IconCompatParcelizer(f, fArr2[iBinarySearch2], fArrWrite, iArr);
            } else {
                iArr2[i3] = RemoteActionCompatParcelizer(f, iArr[iBinarySearch], fArr, fArr2);
            }
        }
        return new scheduleNextWork(fArrWrite2, iArr2);
    }

    private static int IconCompatParcelizer(float f, float f2, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f == fArr[0]) {
            return iArr[0];
        }
        for (int i = 1; i < fArr.length; i++) {
            float f3 = fArr[i];
            if (f3 >= f || i == fArr.length - 1) {
                if (i == fArr.length - 1 && f >= f3) {
                    return Color.argb((int) (f2 * 255.0f), Color.red(iArr[i]), Color.green(iArr[i]), Color.blue(iArr[i]));
                }
                int i2 = i - 1;
                float f4 = fArr[i2];
                int iWrite = setAccessibilityChannel.write((f - f4) / (f3 - f4), iArr[i2], iArr[i]);
                return Color.argb((int) (f2 * 255.0f), Color.red(iWrite), Color.green(iWrite), Color.blue(iWrite));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    private static int RemoteActionCompatParcelizer(float f, int i, float[] fArr, float[] fArr2) {
        float fRemoteActionCompatParcelizer;
        if (fArr2.length < 2 || f <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
        }
        for (int i2 = 1; i2 < fArr.length; i2++) {
            float f2 = fArr[i2];
            if (f2 >= f || i2 == fArr.length - 1) {
                if (f2 <= f) {
                    fRemoteActionCompatParcelizer = fArr2[i2];
                } else {
                    int i3 = i2 - 1;
                    float f3 = fArr[i3];
                    fRemoteActionCompatParcelizer = setColorInfo.RemoteActionCompatParcelizer(fArr2[i3], fArr2[i2], (f - f3) / (f2 - f3));
                }
                return Color.argb((int) (fRemoteActionCompatParcelizer * 255.0f), Color.red(i), Color.green(i), Color.blue(i));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    private static float[] write(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            float f = i2 < fArr.length ? fArr[i2] : Float.NaN;
            float f2 = i3 < fArr2.length ? fArr2[i3] : Float.NaN;
            if (Float.isNaN(f2) || f < f2) {
                fArr3[i4] = f;
                i2++;
            } else if (Float.isNaN(f) || f2 < f) {
                fArr3[i4] = f2;
                i3++;
            } else {
                fArr3[i4] = f;
                i2++;
                i3++;
                i++;
            }
        }
        return i == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i);
    }
}
