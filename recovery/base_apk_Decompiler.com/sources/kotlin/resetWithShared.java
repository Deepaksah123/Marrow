package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.Arrays;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087@\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\u0004\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u0018\u0010\f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0000H\u0086\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\f\u001a\u00020\n¢\u0006\u0004\b\f\u0010\u0011J\u0015\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0012¢\u0006\u0004\b\u0013\u0010\u0014J%\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u0007\u0010\u0017J+\u0010\u000f\u001a\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0012¢\u0006\u0004\b\u000f\u0010\u0017J{\u0010\u0007\u001a\u00020\n2\b\b\u0002\u0010\u0003\u001a\u00020\u00122\b\b\u0002\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00122\b\b\u0002\u0010\u0018\u001a\u00020\u00122\b\b\u0002\u0010\u0019\u001a\u00020\u00122\b\b\u0002\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u001b\u001a\u00020\u00122\b\b\u0002\u0010\u001c\u001a\u00020\u00122\b\b\u0002\u0010\u001d\u001a\u00020\u00122\b\b\u0002\u0010\u001e\u001a\u00020\u00122\b\b\u0002\u0010\u001f\u001a\u00020\u0012¢\u0006\u0004\b\u0007\u0010 J\u001a\u0010\"\u001a\u00020!2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&R\u0011\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0007\u0010'\u0088\u0001(\u0092\u0001\u00020\u0002"}, d2 = {"Lo/resetWithShared;", "", "", "p0", "write", "([F)[F", "Lo/getReferencedType;", "AudioAttributesCompatParcelizer", "([FJ)J", "Lo/getType;", "", "([FLo/getType;)V", "RemoteActionCompatParcelizer", "([F[F)V", "", "read", "([F)Ljava/lang/String;", "([F)V", "", "IconCompatParcelizer", "([FF)V", "p1", "p2", "([FFFF)V", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "([FFFFFFFFFFFF)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "[F", "values"}, k = 1, mv = {2, 0, 0}, xi = 48)
@submitMagicModule
public final class resetWithShared {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final float[] IconCompatParcelizer;

    public static float[] write(float[] fArr) {
        return fArr;
    }

    private /* synthetic */ resetWithShared(float[] fArr) {
        this.IconCompatParcelizer = fArr;
    }

    public static /* synthetic */ float[] RemoteActionCompatParcelizer(float[] fArr, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        if ((i & 1) != 0) {
            fArr = new float[]{1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, 1.0f};
        }
        return write(fArr);
    }

    public static final long AudioAttributesCompatParcelizer(float[] fArr, long j) {
        if (fArr.length < 16) {
            return j;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) j);
        float f10 = 1.0f / (((f3 * fIntBitsToFloat) + (f6 * fIntBitsToFloat2)) + f9);
        if ((Float.floatToRawIntBits(f10) & Integer.MAX_VALUE) >= 2139095040) {
            f10 = BitmapDescriptorFactory.HUE_RED;
        }
        long jFloatToRawIntBits = Float.floatToRawIntBits(((f * fIntBitsToFloat) + (f4 * fIntBitsToFloat2) + f7) * f10);
        long jFloatToRawIntBits2 = Float.floatToRawIntBits(f10 * ((f2 * fIntBitsToFloat) + (f5 * fIntBitsToFloat2) + f8));
        long j2 = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((jFloatToRawIntBits2 & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (jFloatToRawIntBits << 32));
    }

    public static final void write(float[] fArr, getType gettype) {
        if (fArr.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr[1];
        float f3 = fArr[3];
        float f4 = fArr[4];
        float f5 = fArr[5];
        float f6 = fArr[7];
        float f7 = fArr[12];
        float f8 = fArr[13];
        float f9 = fArr[15];
        float remoteActionCompatParcelizer = gettype.getRemoteActionCompatParcelizer();
        float read = gettype.getRead();
        float audioAttributesCompatParcelizer = gettype.getAudioAttributesCompatParcelizer();
        float write = gettype.getWrite();
        float f10 = f3 * remoteActionCompatParcelizer;
        float f11 = f6 * read;
        float f12 = 1.0f / ((f10 + f11) + f9);
        int iFloatToRawIntBits = Float.floatToRawIntBits(f12) & Integer.MAX_VALUE;
        float f13 = BitmapDescriptorFactory.HUE_RED;
        if (iFloatToRawIntBits >= 2139095040) {
            f12 = 0.0f;
        }
        float f14 = f * remoteActionCompatParcelizer;
        float f15 = f4 * read;
        float f16 = f12 * (f14 + f15 + f7);
        float f17 = remoteActionCompatParcelizer * f2;
        float f18 = read * f5;
        float f19 = f12 * (f17 + f18 + f8);
        float f20 = f6 * write;
        float f21 = 1.0f / ((f10 + f20) + f9);
        float f22 = (Float.floatToRawIntBits(f21) & Integer.MAX_VALUE) >= 2139095040 ? 0.0f : f21;
        float f23 = f4 * write;
        float f24 = (f14 + f23 + f7) * f22;
        float f25 = f5 * write;
        float f26 = f22 * (f17 + f25 + f8);
        float f27 = f3 * audioAttributesCompatParcelizer;
        float f28 = 1.0f / ((f11 + f27) + f9);
        if ((Float.floatToRawIntBits(f28) & Integer.MAX_VALUE) >= 2139095040) {
            f28 = 0.0f;
        }
        float f29 = f * audioAttributesCompatParcelizer;
        float f30 = f28 * (f29 + f15 + f7);
        float f31 = audioAttributesCompatParcelizer * f2;
        float f32 = f28 * (f18 + f31 + f8);
        float f33 = 1.0f / ((f27 + f20) + f9);
        if ((Float.floatToRawIntBits(f33) & Integer.MAX_VALUE) < 2139095040) {
            f13 = f33;
        }
        float f34 = (f29 + f23 + f7) * f13;
        float f35 = f13 * (f31 + f25 + f8);
        gettype.IconCompatParcelizer(Math.min(f16, Math.min(f24, Math.min(f30, f34))));
        gettype.write(Math.min(f19, Math.min(f26, Math.min(f32, f35))));
        gettype.read(Math.max(f16, Math.max(f24, Math.max(f30, f34))));
        gettype.RemoteActionCompatParcelizer(Math.max(f19, Math.max(f26, Math.max(f32, f35))));
    }

    public static final void RemoteActionCompatParcelizer(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return;
        }
        float f = fArr[0];
        float f2 = fArr2[0];
        float f3 = fArr[1];
        float f4 = fArr2[4];
        float f5 = fArr[2];
        float f6 = fArr2[8];
        float f7 = fArr[3];
        float f8 = fArr2[12];
        float f9 = fArr2[1];
        float f10 = fArr2[5];
        float f11 = fArr2[9];
        float f12 = fArr2[13];
        float f13 = fArr2[2];
        float f14 = fArr2[6];
        float f15 = fArr2[10];
        float f16 = fArr2[14];
        float f17 = fArr2[3];
        float f18 = fArr2[7];
        float f19 = fArr2[11];
        float f20 = fArr2[15];
        float f21 = fArr[4];
        float f22 = fArr[5];
        float f23 = fArr[6];
        float f24 = fArr[7];
        float f25 = fArr[8];
        float f26 = fArr[9];
        float f27 = fArr[10];
        float f28 = fArr[11];
        float f29 = fArr[12];
        float f30 = fArr[13];
        float f31 = fArr[14];
        float f32 = fArr[15];
        fArr[0] = (f * f2) + (f3 * f4) + (f5 * f6) + (f7 * f8);
        fArr[1] = (f * f9) + (f3 * f10) + (f5 * f11) + (f7 * f12);
        fArr[2] = (f * f13) + (f3 * f14) + (f5 * f15) + (f7 * f16);
        fArr[3] = (f * f17) + (f3 * f18) + (f5 * f19) + (f7 * f20);
        fArr[4] = (f21 * f2) + (f22 * f4) + (f23 * f6) + (f24 * f8);
        fArr[5] = (f21 * f9) + (f22 * f10) + (f23 * f11) + (f24 * f12);
        fArr[6] = (f21 * f13) + (f22 * f14) + (f23 * f15) + (f24 * f16);
        fArr[7] = (f21 * f17) + (f22 * f18) + (f23 * f19) + (f24 * f20);
        fArr[8] = (f25 * f2) + (f26 * f4) + (f27 * f6) + (f28 * f8);
        fArr[9] = (f25 * f9) + (f26 * f10) + (f27 * f11) + (f28 * f12);
        fArr[10] = (f25 * f13) + (f26 * f14) + (f27 * f15) + (f28 * f16);
        fArr[11] = (f25 * f17) + (f26 * f18) + (f27 * f19) + (f28 * f20);
        fArr[12] = (f2 * f29) + (f4 * f30) + (f6 * f31) + (f8 * f32);
        fArr[13] = (f9 * f29) + (f10 * f30) + (f11 * f31) + (f12 * f32);
        fArr[14] = (f13 * f29) + (f14 * f30) + (f15 * f31) + (f16 * f32);
        fArr[15] = (f29 * f17) + (f30 * f18) + (f31 * f19) + (f32 * f20);
    }

    public final String toString() {
        return read(this.IconCompatParcelizer);
    }

    public static String read(float[] fArr) {
        StringBuilder sb = new StringBuilder("\n            |");
        sb.append(fArr[0]);
        sb.append(' ');
        sb.append(fArr[1]);
        sb.append(' ');
        sb.append(fArr[2]);
        sb.append(' ');
        sb.append(fArr[3]);
        sb.append("|\n            |");
        sb.append(fArr[4]);
        sb.append(' ');
        sb.append(fArr[5]);
        sb.append(' ');
        sb.append(fArr[6]);
        sb.append(' ');
        sb.append(fArr[7]);
        sb.append("|\n            |");
        sb.append(fArr[8]);
        sb.append(' ');
        sb.append(fArr[9]);
        sb.append(' ');
        sb.append(fArr[10]);
        sb.append(' ');
        sb.append(fArr[11]);
        sb.append("|\n            |");
        sb.append(fArr[12]);
        sb.append(' ');
        sb.append(fArr[13]);
        sb.append(' ');
        sb.append(fArr[14]);
        sb.append(' ');
        sb.append(fArr[15]);
        sb.append("|\n        ");
        return TestGroupLSModel.write(sb.toString());
    }

    public static final void RemoteActionCompatParcelizer(float[] fArr) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        fArr[4] = 0.0f;
        fArr[5] = 1.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[12] = 0.0f;
        fArr[13] = 0.0f;
        fArr[14] = 0.0f;
        fArr[15] = 1.0f;
    }

    public static final void IconCompatParcelizer(float[] fArr, float f) {
        if (fArr.length < 16) {
            return;
        }
        double d = ((double) f) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d);
        float fCos = (float) Math.cos(d);
        float f2 = fArr[0];
        float f3 = fArr[4];
        float f4 = -fSin;
        float f5 = fArr[1];
        float f6 = fArr[5];
        float f7 = fArr[2];
        float f8 = fArr[6];
        float f9 = fArr[3];
        float f10 = fArr[7];
        fArr[0] = (fCos * f2) + (fSin * f3);
        fArr[1] = (fCos * f5) + (fSin * f6);
        fArr[2] = (fCos * f7) + (fSin * f8);
        fArr[3] = (fCos * f9) + (fSin * f10);
        fArr[4] = (f2 * f4) + (f3 * fCos);
        fArr[5] = (f5 * f4) + (f6 * fCos);
        fArr[6] = (f7 * f4) + (f8 * fCos);
        fArr[7] = (f4 * f9) + (fCos * f10);
    }

    public static final void AudioAttributesCompatParcelizer(float[] fArr, float f, float f2, float f3) {
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = fArr[0] * f;
        fArr[1] = fArr[1] * f;
        fArr[2] = fArr[2] * f;
        fArr[3] = fArr[3] * f;
        fArr[4] = fArr[4] * f2;
        fArr[5] = fArr[5] * f2;
        fArr[6] = fArr[6] * f2;
        fArr[7] = fArr[7] * f2;
        fArr[8] = fArr[8] * f3;
        fArr[9] = fArr[9] * f3;
        fArr[10] = fArr[10] * f3;
        fArr[11] = fArr[11] * f3;
    }

    public static /* synthetic */ void read$default(float[] fArr, float f, float f2, float f3, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        read(fArr, f, f2, f3);
    }

    public static final void read(float[] fArr, float f, float f2, float f3) {
        if (fArr.length < 16) {
            return;
        }
        float f4 = fArr[0];
        float f5 = fArr[4];
        float f6 = fArr[8];
        float f7 = fArr[12];
        float f8 = fArr[1];
        float f9 = fArr[5];
        float f10 = fArr[9];
        float f11 = fArr[13];
        float f12 = fArr[2];
        float f13 = fArr[6];
        float f14 = fArr[10];
        float f15 = fArr[14];
        float f16 = fArr[3];
        float f17 = fArr[7];
        float f18 = fArr[11];
        float f19 = fArr[15];
        fArr[12] = (f4 * f) + (f5 * f2) + (f6 * f3) + f7;
        fArr[13] = (f8 * f) + (f9 * f2) + (f10 * f3) + f11;
        fArr[14] = (f12 * f) + (f13 * f2) + (f14 * f3) + f15;
        fArr[15] = (f16 * f) + (f17 * f2) + (f18 * f3) + f19;
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer$default(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        if ((i & 4) != 0) {
            f3 = 0.0f;
        }
        if ((i & 8) != 0) {
            f4 = 0.0f;
        }
        if ((i & 16) != 0) {
            f5 = 0.0f;
        }
        if ((i & 32) != 0) {
            f6 = 0.0f;
        }
        if ((i & 64) != 0) {
            f7 = 0.0f;
        }
        if ((i & 128) != 0) {
            f8 = 0.0f;
        }
        if ((i & 256) != 0) {
            f9 = 1.0f;
        }
        if ((i & 512) != 0) {
            f10 = 1.0f;
        }
        if ((i & 1024) != 0) {
            f11 = 1.0f;
        }
        AudioAttributesCompatParcelizer(fArr, f, f2, f3, f4, f5, f6, f7, f8, f9, f10, f11);
    }

    public static final void AudioAttributesCompatParcelizer(float[] fArr, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, float f10, float f11) {
        double d = ((double) f6) * 0.017453292519943295d;
        float fSin = (float) Math.sin(d);
        float fCos = (float) Math.cos(d);
        float f12 = -fSin;
        float f13 = (f4 * fSin) + (f5 * fCos);
        double d2 = ((double) f7) * 0.017453292519943295d;
        float fSin2 = (float) Math.sin(d2);
        float fCos2 = (float) Math.cos(d2);
        float f14 = -fSin2;
        float f15 = fSin * fSin2;
        float f16 = fSin * fCos2;
        float f17 = -f3;
        double d3 = ((double) f8) * 0.017453292519943295d;
        float fSin3 = (float) Math.sin(d3);
        float fCos3 = (float) Math.cos(d3);
        float f18 = -fSin3;
        float f19 = ((fCos2 * fCos3) + (f15 * fSin3)) * f9;
        float f20 = fSin3 * fCos * f9;
        float f21 = ((fCos3 * f14) + (fSin3 * f16)) * f9;
        float f22 = ((f18 * fCos2) + (f15 * fCos3)) * f10;
        float f23 = fCos * fCos3 * f10;
        float f24 = ((f18 * f14) + (fCos3 * f16)) * f10;
        if (fArr.length < 16) {
            return;
        }
        fArr[0] = f19;
        fArr[1] = f20;
        fArr[2] = f21;
        fArr[3] = 0.0f;
        fArr[4] = f22;
        fArr[5] = f23;
        fArr[6] = f24;
        fArr[7] = 0.0f;
        fArr[8] = fCos * fSin2 * f11;
        fArr[9] = f12 * f11;
        fArr[10] = fCos * fCos2 * f11;
        fArr[11] = 0.0f;
        float f25 = -f;
        fArr[12] = ((f19 * f25) - (f22 * f2)) + (f3 * fCos2) + (f13 * fSin2) + f;
        fArr[13] = ((f20 * f25) - (f23 * f2)) + ((f4 * fCos) - (f5 * fSin)) + f2;
        fArr[14] = ((f25 * f21) - (f2 * f24)) + (f17 * fSin2) + (f13 * fCos2);
        fArr[15] = 1.0f;
    }

    public static final /* synthetic */ resetWithShared IconCompatParcelizer(float[] fArr) {
        return new resetWithShared(fArr);
    }

    public static boolean write(float[] fArr, Object obj) {
        return (obj instanceof resetWithShared) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(fArr, ((resetWithShared) obj).getIconCompatParcelizer());
    }

    public static final boolean IconCompatParcelizer(float[] fArr, float[] fArr2) {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(fArr, fArr2);
    }

    public static int AudioAttributesCompatParcelizer(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public final boolean equals(Object p0) {
        return write(this.IconCompatParcelizer, p0);
    }

    public final int hashCode() {
        return AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final /* synthetic */ float[] getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
