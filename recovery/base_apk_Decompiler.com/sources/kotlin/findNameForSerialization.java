package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\t\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\u0011J'\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0010¢\u0006\u0004\b\r\u0010\u0012J7\u0010\t\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\t\u0010\u0016J\u0017\u0010\t\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\t\u0010\u000e"}, d2 = {"Lo/findNameForSerialization;", "Lo/findImplicitPropertyName;", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;I)V", "", "RemoteActionCompatParcelizer", "(I)F", "AudioAttributesCompatParcelizer", "", "read", "([F)[F", "p2", "", "(FFF)J", "(FFF)F", "p3", "p4", "Lo/switchToNext;", "(FFFFLo/findImplicitPropertyName;)J"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class findNameForSerialization extends findImplicitPropertyName {
    @Override // kotlin.findImplicitPropertyName
    public final float AudioAttributesCompatParcelizer(int p0) {
        return p0 == 0 ? 100.0f : 128.0f;
    }

    @Override // kotlin.findImplicitPropertyName
    public final float RemoteActionCompatParcelizer(int p0) {
        if (p0 == 0) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        return -128.0f;
    }

    public findNameForSerialization(String str, int i) {
        super(str, findEnumAliases.INSTANCE.IconCompatParcelizer(), i, null);
    }

    @Override // kotlin.findImplicitPropertyName
    public final float[] read(float[] p0) {
        float f = p0[0];
        if (f < BitmapDescriptorFactory.HUE_RED) {
            f = 0.0f;
        }
        if (f > 100.0f) {
            f = 100.0f;
        }
        p0[0] = f;
        float f2 = p0[1];
        if (f2 < -128.0f) {
            f2 = -128.0f;
        }
        if (f2 > 128.0f) {
            f2 = 128.0f;
        }
        p0[1] = f2;
        float f3 = p0[2];
        float f4 = f3 >= -128.0f ? f3 : -128.0f;
        float f5 = f4 <= 128.0f ? f4 : 128.0f;
        p0[2] = f5;
        float f6 = (f + 16.0f) / 116.0f;
        float f7 = (f2 * 0.002f) + f6;
        float f8 = f6 - (f5 * 0.005f);
        float f9 = f7 > 0.20689656f ? f7 * f7 * f7 : (f7 - 0.13793103f) * 0.12841855f;
        float f10 = f6 > 0.20689656f ? f6 * f6 * f6 : (f6 - 0.13793103f) * 0.12841855f;
        float f11 = f8 > 0.20689656f ? f8 * f8 * f8 : (f8 - 0.13793103f) * 0.12841855f;
        p0[0] = f9 * findNamingStrategy.INSTANCE.write()[0];
        p0[1] = f10 * findNamingStrategy.INSTANCE.write()[1];
        p0[2] = f11 * findNamingStrategy.INSTANCE.write()[2];
        return p0;
    }

    @Override // kotlin.findImplicitPropertyName
    public final long RemoteActionCompatParcelizer(float p0, float p1, float p2) {
        if (p0 < BitmapDescriptorFactory.HUE_RED) {
            p0 = 0.0f;
        }
        if (p0 > 100.0f) {
            p0 = 100.0f;
        }
        if (p1 < -128.0f) {
            p1 = -128.0f;
        }
        if (p1 > 128.0f) {
            p1 = 128.0f;
        }
        float f = (p0 + 16.0f) / 116.0f;
        float f2 = (p1 * 0.002f) + f;
        float f3 = f2 > 0.20689656f ? f2 * f2 * f2 : (f2 - 0.13793103f) * 0.12841855f;
        long j = -1;
        return (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & ((long) Float.floatToRawIntBits((f > 0.20689656f ? f * f * f : (f - 0.13793103f) * 0.12841855f) * findNamingStrategy.INSTANCE.write()[1]))) | (((long) Float.floatToRawIntBits(f3 * findNamingStrategy.INSTANCE.write()[0])) << 32);
    }

    @Override // kotlin.findImplicitPropertyName
    public final float read(float p0, float p1, float p2) {
        if (p0 < BitmapDescriptorFactory.HUE_RED) {
            p0 = 0.0f;
        }
        if (p0 > 100.0f) {
            p0 = 100.0f;
        }
        if (p2 < -128.0f) {
            p2 = -128.0f;
        }
        if (p2 > 128.0f) {
            p2 = 128.0f;
        }
        float f = ((p0 + 16.0f) / 116.0f) - (p2 * 0.005f);
        return (f > 0.20689656f ? f * f * f : 0.12841855f * (f - 0.13793103f)) * findNamingStrategy.INSTANCE.write()[2];
    }

    @Override // kotlin.findImplicitPropertyName
    public final long RemoteActionCompatParcelizer(float p0, float p1, float p2, float p3, findImplicitPropertyName p4) {
        float f = p0 / findNamingStrategy.INSTANCE.write()[0];
        float f2 = p1 / findNamingStrategy.INSTANCE.write()[1];
        float f3 = p2 / findNamingStrategy.INSTANCE.write()[2];
        float fCbrt = f > 0.008856452f ? (float) Math.cbrt(f) : (f * 7.787037f) + 0.13793103f;
        float fCbrt2 = f2 > 0.008856452f ? (float) Math.cbrt(f2) : (f2 * 7.787037f) + 0.13793103f;
        float fCbrt3 = f3 > 0.008856452f ? (float) Math.cbrt(f3) : (f3 * 7.787037f) + 0.13793103f;
        float f4 = (116.0f * fCbrt2) - 16.0f;
        float f5 = (fCbrt - fCbrt2) * 500.0f;
        float f6 = (fCbrt2 - fCbrt3) * 200.0f;
        if (f4 < BitmapDescriptorFactory.HUE_RED) {
            f4 = 0.0f;
        }
        if (f4 > 100.0f) {
            f4 = 100.0f;
        }
        if (f5 < -128.0f) {
            f5 = -128.0f;
        }
        if (f5 > 128.0f) {
            f5 = 128.0f;
        }
        if (f6 < -128.0f) {
            f6 = -128.0f;
        }
        return RequestPayload.write(f4, f5, f6 <= 128.0f ? f6 : 128.0f, p3, p4);
    }

    @Override // kotlin.findImplicitPropertyName
    public final float[] RemoteActionCompatParcelizer(float[] p0) {
        float f = p0[0] / findNamingStrategy.INSTANCE.write()[0];
        float f2 = p0[1] / findNamingStrategy.INSTANCE.write()[1];
        float f3 = p0[2] / findNamingStrategy.INSTANCE.write()[2];
        float fCbrt = f > 0.008856452f ? (float) Math.cbrt(f) : (f * 7.787037f) + 0.13793103f;
        float fCbrt2 = f2 > 0.008856452f ? (float) Math.cbrt(f2) : (f2 * 7.787037f) + 0.13793103f;
        float f4 = (116.0f * fCbrt2) - 16.0f;
        float f5 = (fCbrt - fCbrt2) * 500.0f;
        float fCbrt3 = (fCbrt2 - (f3 > 0.008856452f ? (float) Math.cbrt(f3) : (f3 * 7.787037f) + 0.13793103f)) * 200.0f;
        if (f4 < BitmapDescriptorFactory.HUE_RED) {
            f4 = 0.0f;
        }
        if (f4 > 100.0f) {
            f4 = 100.0f;
        }
        p0[0] = f4;
        if (f5 < -128.0f) {
            f5 = -128.0f;
        }
        if (f5 > 128.0f) {
            f5 = 128.0f;
        }
        p0[1] = f5;
        if (fCbrt3 < -128.0f) {
            fCbrt3 = -128.0f;
        }
        p0[2] = fCbrt3 <= 128.0f ? fCbrt3 : 128.0f;
        return p0;
    }
}
