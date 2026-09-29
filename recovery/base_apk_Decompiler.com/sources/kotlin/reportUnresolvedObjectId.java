package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\t\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\u001a!\u0010\b\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t\u001a3\u0010\u0010\u001a\u00020\u0003*\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\u0002\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\b\u001a\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\b\u0010\u0015\u001a/\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0010\u0010\u0017\u001a\u001b\u0010\u0004\u001a\u00020\u000e*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0004\u0010\u0018\"\u001c\u0010\u001c\u001a\u00020\u00168\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001b*\f\b\u0002\u0010\u001d\"\u00020\u00122\u00020\u0012*\u0018\b\u0002\u0010\u001e\"\b\u0012\u0004\u0012\u00020\u00120\n2\b\u0012\u0004\u0012\u00020\u00120\n"}, d2 = {"Lo/reportPropertyInputMismatch;", "Lo/getArrayBuilders;", "p0", "", "RemoteActionCompatParcelizer", "(Lo/reportPropertyInputMismatch;Lo/getArrayBuilders;)V", "Lo/getReferencedType;", "p1", "AudioAttributesCompatParcelizer", "(Lo/reportPropertyInputMismatch;Lo/getArrayBuilders;J)V", "", "Lo/missingTypeIdException;", "", "", "", "p2", "read", "([Lo/missingTypeIdException;IJF)V", "", "p3", "p4", "([F[FII[F)[F", "", "([F[FIZ)F", "([F[F)F", "write", "Z", "()Z", "IconCompatParcelizer", "Vector", "Matrix"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class reportUnresolvedObjectId {
    private static boolean write = true;

    public static final void RemoteActionCompatParcelizer(reportPropertyInputMismatch reportpropertyinputmismatch, getArrayBuilders getarraybuilders) {
        AudioAttributesCompatParcelizer(reportpropertyinputmismatch, getarraybuilders, getReferencedType.INSTANCE.write());
    }

    public static final void AudioAttributesCompatParcelizer(reportPropertyInputMismatch reportpropertyinputmismatch, getArrayBuilders getarraybuilders, long j) {
        reportpropertyinputmismatch.getRead().IconCompatParcelizer(getarraybuilders, j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void read(missingTypeIdException[] missingtypeidexceptionArr, int i, long j, float f) {
        missingTypeIdException missingtypeidexception = missingtypeidexceptionArr[i];
        if (missingtypeidexception == null) {
            missingtypeidexceptionArr[i] = new missingTypeIdException(j, f);
        } else {
            missingtypeidexception.write(j);
            missingtypeidexception.AudioAttributesCompatParcelizer(f);
        }
    }

    public static final float[] AudioAttributesCompatParcelizer(float[] fArr, float[] fArr2, int i, int i2, float[] fArr3) {
        int i3 = i2;
        if (i3 <= 0) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("The degree must be at positive integer");
        }
        if (i == 0) {
            reportWrongTokenException.AudioAttributesCompatParcelizer("At least one point must be provided");
        }
        if (i3 >= i) {
            i3 = i - 1;
        }
        int i4 = i3 + 1;
        float[][] fArr4 = new float[i4][];
        for (int i5 = 0; i5 < i4; i5++) {
            fArr4[i5] = new float[i];
        }
        for (int i6 = 0; i6 < i; i6++) {
            fArr4[0][i6] = 1.0f;
            for (int i7 = 1; i7 < i4; i7++) {
                fArr4[i7][i6] = fArr4[i7 - 1][i6] * fArr[i6];
            }
        }
        float[][] fArr5 = new float[i4][];
        for (int i8 = 0; i8 < i4; i8++) {
            fArr5[i8] = new float[i];
        }
        float[][] fArr6 = new float[i4][];
        for (int i9 = 0; i9 < i4; i9++) {
            fArr6[i9] = new float[i4];
        }
        int i10 = 0;
        while (i10 < i4) {
            float[] fArr7 = fArr5[i10];
            getOrderDetails.IconCompatParcelizer(fArr4[i10], fArr7, 0, 0, i);
            for (int i11 = 0; i11 < i10; i11++) {
                float[] fArr8 = fArr5[i11];
                float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(fArr7, fArr8);
                for (int i12 = 0; i12 < i; i12++) {
                    fArr7[i12] = fArr7[i12] - (fArr8[i12] * fRemoteActionCompatParcelizer);
                }
            }
            float fSqrt = (float) Math.sqrt(RemoteActionCompatParcelizer(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f = 1.0f / fSqrt;
            for (int i13 = 0; i13 < i; i13++) {
                fArr7[i13] = fArr7[i13] * f;
            }
            float[] fArr9 = fArr6[i10];
            int i14 = 0;
            while (i14 < i4) {
                fArr9[i14] = i14 < i10 ? BitmapDescriptorFactory.HUE_RED : RemoteActionCompatParcelizer(fArr7, fArr4[i14]);
                i14++;
            }
            i10++;
        }
        for (int i15 = i3; i15 >= 0; i15--) {
            float fRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(fArr5[i15], fArr2);
            float[] fArr10 = fArr6[i15];
            int i16 = i15 + 1;
            if (i16 <= i3) {
                int i17 = i3;
                while (true) {
                    fRemoteActionCompatParcelizer2 -= fArr10[i17] * fArr3[i17];
                    if (i17 != i16) {
                        i17--;
                    }
                }
            }
            fArr3[i15] = fRemoteActionCompatParcelizer2 / fArr10[i15];
        }
        return fArr3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float read(float[] fArr, float[] fArr2, int i, boolean z) {
        int i2 = i - 1;
        float f = fArr2[i2];
        float fSignum = BitmapDescriptorFactory.HUE_RED;
        int i3 = i2;
        while (i3 > 0) {
            int i4 = i3 - 1;
            float f2 = fArr2[i4];
            if (f != f2) {
                float f3 = (z ? -fArr[i4] : fArr[i3] - fArr[i4]) / (f - f2);
                fSignum += (f3 - (Math.signum(fSignum) * ((float) Math.sqrt(Math.abs(fSignum) * 2.0f)))) * Math.abs(f3);
                if (i3 == i2) {
                    fSignum *= 0.5f;
                }
            }
            i3--;
            f = f2;
        }
        return Math.signum(fSignum) * ((float) Math.sqrt(Math.abs(fSignum) * 2.0f));
    }

    private static final float RemoteActionCompatParcelizer(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f = BitmapDescriptorFactory.HUE_RED;
        for (int i = 0; i < length; i++) {
            f += fArr[i] * fArr2[i];
        }
        return f;
    }

    public static final boolean write() {
        return write;
    }
}
