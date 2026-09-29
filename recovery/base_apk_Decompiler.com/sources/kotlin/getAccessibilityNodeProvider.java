package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\t\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\u000b\u001a\u00020\b*\u00020\u0004¢\u0006\u0004\b\u000b\u0010\nJ%\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\u0011R\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006@\u0007X\u0086\u000e¢\u0006\f\n\u0004\b\u000f\u0010\u0012\"\u0004\b\t\u0010\u0013R\u0016\u0010\u0016\u001a\u00020\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015"}, d2 = {"Lo/getAccessibilityNodeProvider;", "", "Lo/superDispatchKeyEvent;", "p0", "Lo/getReferencedType;", "p1", "<init>", "(Lo/superDispatchKeyEvent;JLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "", "read", "(J)F", "RemoteActionCompatParcelizer", "p2", "(JJF)J", "", "IconCompatParcelizer", "(J)V", "(F)J", "Lo/superDispatchKeyEvent;", "(Lo/superDispatchKeyEvent;)V", "write", "J", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getAccessibilityNodeProvider {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private superDispatchKeyEvent RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private long AudioAttributesCompatParcelizer;

    private getAccessibilityNodeProvider(superDispatchKeyEvent superdispatchkeyevent, long j) {
        this.RemoteActionCompatParcelizer = superdispatchkeyevent;
        this.AudioAttributesCompatParcelizer = j;
    }

    public final void read(superDispatchKeyEvent superdispatchkeyevent) {
        this.RemoteActionCompatParcelizer = superdispatchkeyevent;
    }

    public /* synthetic */ getAccessibilityNodeProvider(superDispatchKeyEvent superdispatchkeyevent, long j, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : superdispatchkeyevent, (i & 2) != 0 ? getReferencedType.INSTANCE.write() : j, null);
    }

    public final float read(long j) {
        long j2;
        if (this.RemoteActionCompatParcelizer == superDispatchKeyEvent.AudioAttributesCompatParcelizer) {
            j2 = j >> 32;
        } else {
            long j3 = -1;
            j2 = j & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)));
        }
        return Float.intBitsToFloat((int) j2);
    }

    public final float RemoteActionCompatParcelizer(long j) {
        long j2;
        if (this.RemoteActionCompatParcelizer == superDispatchKeyEvent.AudioAttributesCompatParcelizer) {
            long j3 = -1;
            j2 = j & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)));
        } else {
            j2 = j >> 32;
        }
        return Float.intBitsToFloat((int) j2);
    }

    public final long RemoteActionCompatParcelizer(long p0, long p1, float p2) {
        float fAbs;
        long jRemoteActionCompatParcelizer = getReferencedType.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, getReferencedType.AudioAttributesCompatParcelizer(p0, p1));
        this.AudioAttributesCompatParcelizer = jRemoteActionCompatParcelizer;
        if (this.RemoteActionCompatParcelizer == null) {
            fAbs = getReferencedType.IconCompatParcelizer(jRemoteActionCompatParcelizer);
        } else {
            fAbs = Math.abs(read(jRemoteActionCompatParcelizer));
        }
        if (fAbs >= p2) {
            return read(p2);
        }
        return getReferencedType.INSTANCE.read();
    }

    public static /* synthetic */ void IconCompatParcelizer$default(getAccessibilityNodeProvider getaccessibilitynodeprovider, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = getReferencedType.INSTANCE.write();
        }
        getaccessibilitynodeprovider.IconCompatParcelizer(j);
    }

    public final void IconCompatParcelizer(long p0) {
        this.AudioAttributesCompatParcelizer = p0;
    }

    private final long read(float p0) {
        if (this.RemoteActionCompatParcelizer == null) {
            long j = this.AudioAttributesCompatParcelizer;
            return getReferencedType.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, getReferencedType.read(getReferencedType.IconCompatParcelizer(j, getReferencedType.IconCompatParcelizer(j)), p0));
        }
        float fSignum = read(this.AudioAttributesCompatParcelizer) - (Math.signum(read(this.AudioAttributesCompatParcelizer)) * p0);
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer);
        if (this.RemoteActionCompatParcelizer == superDispatchKeyEvent.AudioAttributesCompatParcelizer) {
            long j2 = -1;
            return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(fRemoteActionCompatParcelizer)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) Float.floatToRawIntBits(fSignum)) << 32));
        }
        long j3 = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(fRemoteActionCompatParcelizer)) << 32) | (((long) Float.floatToRawIntBits(fSignum)) & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)))));
    }

    public /* synthetic */ getAccessibilityNodeProvider(superDispatchKeyEvent superdispatchkeyevent, long j, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(superdispatchkeyevent, j);
    }
}
