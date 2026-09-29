package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\t\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0010¢\u0006\u0004\b\t\u0010\u0011J'\u0010\r\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\bH\u0010¢\u0006\u0004\b\r\u0010\u0012J7\u0010\t\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0001H\u0010¢\u0006\u0004\b\t\u0010\u0016J\u0017\u0010\t\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\fH\u0016¢\u0006\u0004\b\t\u0010\u000e"}, d2 = {"Lo/findSerializationConverter;", "Lo/findImplicitPropertyName;", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;I)V", "", "RemoteActionCompatParcelizer", "(I)F", "AudioAttributesCompatParcelizer", "", "read", "([F)[F", "p2", "", "(FFF)J", "(FFF)F", "p3", "p4", "Lo/switchToNext;", "(FFFFLo/findImplicitPropertyName;)J"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class findSerializationConverter extends findImplicitPropertyName {
    @Override // kotlin.findImplicitPropertyName
    public final float AudioAttributesCompatParcelizer(int p0) {
        return 2.0f;
    }

    @Override // kotlin.findImplicitPropertyName
    public final float RemoteActionCompatParcelizer(int p0) {
        return -2.0f;
    }

    @Override // kotlin.findImplicitPropertyName
    public final float read(float p0, float p1, float p2) {
        if (p2 < -2.0f) {
            p2 = -2.0f;
        }
        if (p2 > 2.0f) {
            return 2.0f;
        }
        return p2;
    }

    public findSerializationConverter(String str, int i) {
        super(str, findEnumAliases.INSTANCE.read(), i, null);
    }

    @Override // kotlin.findImplicitPropertyName
    public final float[] read(float[] p0) {
        float f = p0[0];
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        p0[0] = f;
        float f2 = p0[1];
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        p0[1] = f2;
        float f3 = p0[2];
        float f4 = f3 >= -2.0f ? f3 : -2.0f;
        p0[2] = f4 <= 2.0f ? f4 : 2.0f;
        return p0;
    }

    @Override // kotlin.findImplicitPropertyName
    public final long RemoteActionCompatParcelizer(float p0, float p1, float p2, float p3, findImplicitPropertyName p4) {
        if (p0 < -2.0f) {
            p0 = -2.0f;
        }
        if (p0 > 2.0f) {
            p0 = 2.0f;
        }
        if (p1 < -2.0f) {
            p1 = -2.0f;
        }
        if (p1 > 2.0f) {
            p1 = 2.0f;
        }
        if (p2 < -2.0f) {
            p2 = -2.0f;
        }
        return RequestPayload.write(p0, p1, p2 <= 2.0f ? p2 : 2.0f, p3, p4);
    }

    @Override // kotlin.findImplicitPropertyName
    public final float[] RemoteActionCompatParcelizer(float[] p0) {
        float f = p0[0];
        if (f < -2.0f) {
            f = -2.0f;
        }
        if (f > 2.0f) {
            f = 2.0f;
        }
        p0[0] = f;
        float f2 = p0[1];
        if (f2 < -2.0f) {
            f2 = -2.0f;
        }
        if (f2 > 2.0f) {
            f2 = 2.0f;
        }
        p0[1] = f2;
        float f3 = p0[2];
        float f4 = f3 >= -2.0f ? f3 : -2.0f;
        p0[2] = f4 <= 2.0f ? f4 : 2.0f;
        return p0;
    }

    @Override // kotlin.findImplicitPropertyName
    public final long RemoteActionCompatParcelizer(float p0, float p1, float p2) {
        if (p0 < -2.0f) {
            p0 = -2.0f;
        }
        if (p0 > 2.0f) {
            p0 = 2.0f;
        }
        if (p1 < -2.0f) {
            p1 = -2.0f;
        }
        long j = -1;
        return (((long) Float.floatToRawIntBits(p0)) << 32) | (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & ((long) Float.floatToRawIntBits(p1 <= 2.0f ? p1 : 2.0f)));
    }
}
