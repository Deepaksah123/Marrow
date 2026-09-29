package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\t\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\u0011J'\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0010¢\u0006\u0004\b\r\u0010\u0012J7\u0010\t\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\t\u0010\u0016J\u0017\u0010\t\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\t\u0010\u000e"}, d2 = {"Lo/findNullSerializer;", "Lo/findImplicitPropertyName;", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;I)V", "", "RemoteActionCompatParcelizer", "(I)F", "AudioAttributesCompatParcelizer", "", "read", "([F)[F", "p2", "", "(FFF)J", "(FFF)F", "p3", "p4", "Lo/switchToNext;", "(FFFFLo/findImplicitPropertyName;)J"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class findNullSerializer extends findImplicitPropertyName {
    private static final float[] AudioAttributesImplApi26Parcelizer;
    private static final float[] IconCompatParcelizer;
    private static final float[] read;
    private static final float[] write;

    @Override // kotlin.findImplicitPropertyName
    public final float AudioAttributesCompatParcelizer(int p0) {
        return p0 == 0 ? 1.0f : 0.5f;
    }

    @Override // kotlin.findImplicitPropertyName
    public final float RemoteActionCompatParcelizer(int p0) {
        if (p0 == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return -0.5f;
    }

    public findNullSerializer(String str, int i) {
        super(str, findEnumAliases.INSTANCE.IconCompatParcelizer(), i, null);
    }

    @Override // kotlin.findImplicitPropertyName
    public final float[] read(float[] p0) {
        float f = p0[0];
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = 0.0f;
        }
        if (f > 1.0f) {
            f = 1.0f;
        }
        p0[0] = f;
        float f2 = p0[1];
        if (f2 < -0.5f) {
            f2 = -0.5f;
        }
        if (f2 > 0.5f) {
            f2 = 0.5f;
        }
        p0[1] = f2;
        float f3 = p0[2];
        float f4 = f3 >= -0.5f ? f3 : -0.5f;
        p0[2] = f4 <= 0.5f ? f4 : 0.5f;
        findFormat.write(IconCompatParcelizer, p0);
        float f5 = p0[0];
        p0[0] = f5 * f5 * f5;
        float f6 = p0[1];
        p0[1] = f6 * f6 * f6;
        float f7 = p0[2];
        p0[2] = f7 * f7 * f7;
        findFormat.write(read, p0);
        return p0;
    }

    @Override // kotlin.findImplicitPropertyName
    public final long RemoteActionCompatParcelizer(float p0, float p1, float p2) {
        if (p0 < BitmapDescriptorFactory.HUE_RED) {
            p0 = 0.0f;
        }
        if (p0 > 1.0f) {
            p0 = 1.0f;
        }
        if (p1 < -0.5f) {
            p1 = -0.5f;
        }
        if (p1 > 0.5f) {
            p1 = 0.5f;
        }
        if (p2 < -0.5f) {
            p2 = -0.5f;
        }
        float f = p2 <= 0.5f ? p2 : 0.5f;
        float[] fArr = IconCompatParcelizer;
        float f2 = (fArr[0] * p0) + (fArr[3] * p1) + (fArr[6] * f);
        float f3 = (fArr[1] * p0) + (fArr[4] * p1) + (fArr[7] * f);
        float f4 = (fArr[2] * p0) + (fArr[5] * p1) + (fArr[8] * f);
        float f5 = f2 * f2 * f2;
        float f6 = f3 * f3 * f3;
        float f7 = f4 * f4 * f4;
        float[] fArr2 = read;
        float f8 = fArr2[0];
        float f9 = fArr2[3];
        float f10 = fArr2[6];
        float f11 = fArr2[1];
        float f12 = fArr2[4];
        float f13 = fArr2[7];
        long jFloatToRawIntBits = ((long) Float.floatToRawIntBits(((f8 * f5) + (f9 * f6)) + (f10 * f7))) << 32;
        long jFloatToRawIntBits2 = Float.floatToRawIntBits((f11 * f5) + (f12 * f6) + (f13 * f7));
        long j = -1;
        return (jFloatToRawIntBits2 & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | jFloatToRawIntBits;
    }

    @Override // kotlin.findImplicitPropertyName
    public final float read(float p0, float p1, float p2) {
        if (p0 < BitmapDescriptorFactory.HUE_RED) {
            p0 = 0.0f;
        }
        if (p0 > 1.0f) {
            p0 = 1.0f;
        }
        if (p1 < -0.5f) {
            p1 = -0.5f;
        }
        if (p1 > 0.5f) {
            p1 = 0.5f;
        }
        if (p2 < -0.5f) {
            p2 = -0.5f;
        }
        float f = p2 <= 0.5f ? p2 : 0.5f;
        float[] fArr = IconCompatParcelizer;
        float f2 = (fArr[0] * p0) + (fArr[3] * p1) + (fArr[6] * f);
        float f3 = (fArr[1] * p0) + (fArr[4] * p1) + (fArr[7] * f);
        float f4 = (fArr[2] * p0) + (fArr[5] * p1) + (fArr[8] * f);
        float[] fArr2 = read;
        return (fArr2[2] * f2 * f2 * f2) + (fArr2[5] * f3 * f3 * f3) + (fArr2[8] * f4 * f4 * f4);
    }

    @Override // kotlin.findImplicitPropertyName
    public final long RemoteActionCompatParcelizer(float p0, float p1, float p2, float p3, findImplicitPropertyName p4) {
        float[] fArr = write;
        float f = fArr[0];
        float f2 = fArr[3];
        float f3 = fArr[6];
        float f4 = fArr[1];
        float f5 = fArr[4];
        float f6 = fArr[7];
        float f7 = fArr[2];
        float f8 = fArr[5];
        float f9 = fArr[8];
        float fAudioAttributesCompatParcelizer = AtomicBooleanDeserializer.AudioAttributesCompatParcelizer((f * p0) + (f2 * p1) + (f3 * p2));
        float fAudioAttributesCompatParcelizer2 = AtomicBooleanDeserializer.AudioAttributesCompatParcelizer((f4 * p0) + (f5 * p1) + (f6 * p2));
        float fAudioAttributesCompatParcelizer3 = AtomicBooleanDeserializer.AudioAttributesCompatParcelizer((f7 * p0) + (f8 * p1) + (f9 * p2));
        float[] fArr2 = AudioAttributesImplApi26Parcelizer;
        return RequestPayload.write((fArr2[0] * fAudioAttributesCompatParcelizer) + (fArr2[3] * fAudioAttributesCompatParcelizer2) + (fArr2[6] * fAudioAttributesCompatParcelizer3), (fArr2[1] * fAudioAttributesCompatParcelizer) + (fArr2[4] * fAudioAttributesCompatParcelizer2) + (fArr2[7] * fAudioAttributesCompatParcelizer3), (fArr2[2] * fAudioAttributesCompatParcelizer) + (fArr2[5] * fAudioAttributesCompatParcelizer2) + (fArr2[8] * fAudioAttributesCompatParcelizer3), p3, p4);
    }

    @Override // kotlin.findImplicitPropertyName
    public final float[] RemoteActionCompatParcelizer(float[] p0) {
        findFormat.write(write, p0);
        p0[0] = AtomicBooleanDeserializer.AudioAttributesCompatParcelizer(p0[0]);
        p0[1] = AtomicBooleanDeserializer.AudioAttributesCompatParcelizer(p0[1]);
        p0[2] = AtomicBooleanDeserializer.AudioAttributesCompatParcelizer(p0[2]);
        findFormat.write(AudioAttributesImplApi26Parcelizer, p0);
        return p0;
    }

    static {
        float[] fArr = findFormat.read(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, findFormat.write(findDeserializationContentConverter.INSTANCE.AudioAttributesCompatParcelizer().getRemoteActionCompatParcelizer(), findNamingStrategy.INSTANCE.read().AudioAttributesCompatParcelizer(), findNamingStrategy.INSTANCE.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer()));
        write = fArr;
        float[] fArr2 = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        AudioAttributesImplApi26Parcelizer = fArr2;
        read = findFormat.write(fArr);
        IconCompatParcelizer = findFormat.write(fArr2);
    }
}
