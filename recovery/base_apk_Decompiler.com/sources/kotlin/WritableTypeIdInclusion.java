package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\b\u0018\u0000 \n2\u00020\u0001:\u0001\nB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\f\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\f\u0010\u000eJ-\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000fJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\tH\u0086\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J8\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0011\u0010\u000fJ\u001a\u0010\u0018\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0013\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u001d\u001a\u0004\b\u0011\u0010\u001eR\u001a\u0010\n\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001d\u001a\u0004\b \u0010\u001eR\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001d\u001a\u0004\b\"\u0010\u001eR\u001a\u0010\u0011\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\n\u0010\u001eR\u0011\u0010!\u001a\u00020#8G¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0011\u0010$\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u001f\u0010&R\u0011\u0010\u001f\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b'\u0010%R\u0011\u0010 \u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b!\u0010%R\u0011\u0010\"\u001a\u00020\t8G¢\u0006\u0006\u001a\u0004\b\u0013\u0010%"}, d2 = {"Lo/WritableTypeIdInclusion;", "", "", "p0", "p1", "p2", "p3", "<init>", "(FFFF)V", "Lo/getReferencedType;", "RemoteActionCompatParcelizer", "(J)Lo/WritableTypeIdInclusion;", "write", "(FF)Lo/WritableTypeIdInclusion;", "(Lo/WritableTypeIdInclusion;)Lo/WritableTypeIdInclusion;", "(FFFF)Lo/WritableTypeIdInclusion;", "", "IconCompatParcelizer", "(Lo/WritableTypeIdInclusion;)Z", "AudioAttributesCompatParcelizer", "(J)Z", "", "toString", "()Ljava/lang/String;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "F", "()F", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi21Parcelizer", "read", "AudioAttributesImplApi26Parcelizer", "Lo/calloc;", "MediaBrowserCompatItemReceiver", "()J", "()Z", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class WritableTypeIdInclusion {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final float RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final float write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final float IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final WritableTypeIdInclusion AudioAttributesCompatParcelizer = new WritableTypeIdInclusion(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);

    public WritableTypeIdInclusion(float f, float f2, float f3, float f4) {
        this.AudioAttributesCompatParcelizer = f;
        this.RemoteActionCompatParcelizer = f2;
        this.write = f3;
        this.IconCompatParcelizer = f4;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final float getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final float getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final float getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final float getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: o.WritableTypeIdInclusion$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/WritableTypeIdInclusion$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Lo/WritableTypeIdInclusion;", "AudioAttributesCompatParcelizer", "Lo/WritableTypeIdInclusion;", "write", "()Lo/WritableTypeIdInclusion;", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final WritableTypeIdInclusion write() {
            return WritableTypeIdInclusion.AudioAttributesCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return (this.AudioAttributesCompatParcelizer >= this.write) | (this.RemoteActionCompatParcelizer >= this.IconCompatParcelizer);
    }

    public final WritableTypeIdInclusion RemoteActionCompatParcelizer(long p0) {
        int i = (int) (p0 >> 32);
        int i2 = (int) p0;
        return new WritableTypeIdInclusion(this.AudioAttributesCompatParcelizer + Float.intBitsToFloat(i), this.RemoteActionCompatParcelizer + Float.intBitsToFloat(i2), this.write + Float.intBitsToFloat(i), this.IconCompatParcelizer + Float.intBitsToFloat(i2));
    }

    public final WritableTypeIdInclusion write(float p0, float p1) {
        return new WritableTypeIdInclusion(this.AudioAttributesCompatParcelizer + p0, this.RemoteActionCompatParcelizer + p1, this.write + p0, this.IconCompatParcelizer + p1);
    }

    public final WritableTypeIdInclusion write(WritableTypeIdInclusion p0) {
        return new WritableTypeIdInclusion(Math.max(this.AudioAttributesCompatParcelizer, p0.AudioAttributesCompatParcelizer), Math.max(this.RemoteActionCompatParcelizer, p0.RemoteActionCompatParcelizer), Math.min(this.write, p0.write), Math.min(this.IconCompatParcelizer, p0.IconCompatParcelizer));
    }

    public final WritableTypeIdInclusion RemoteActionCompatParcelizer(float p0, float p1, float p2, float p3) {
        return new WritableTypeIdInclusion(Math.max(this.AudioAttributesCompatParcelizer, p0), Math.max(this.RemoteActionCompatParcelizer, p1), Math.min(this.write, p2), Math.min(this.IconCompatParcelizer, p3));
    }

    public final boolean IconCompatParcelizer(WritableTypeIdInclusion p0) {
        boolean z = this.AudioAttributesCompatParcelizer < p0.write;
        boolean z2 = p0.AudioAttributesCompatParcelizer < this.write;
        return z & z2 & (this.RemoteActionCompatParcelizer < p0.IconCompatParcelizer) & (p0.RemoteActionCompatParcelizer < this.IconCompatParcelizer);
    }

    public final long AudioAttributesImplBaseParcelizer() {
        long j = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(this.AudioAttributesCompatParcelizer)) << 32) | (((long) Float.floatToRawIntBits(this.RemoteActionCompatParcelizer)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
    }

    public final long read() {
        long j = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(this.AudioAttributesCompatParcelizer + ((getWrite() - getAudioAttributesCompatParcelizer()) / 2.0f))) << 32) | (((long) Float.floatToRawIntBits(this.RemoteActionCompatParcelizer + ((getIconCompatParcelizer() - getRemoteActionCompatParcelizer()) / 2.0f))) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
    }

    public final long AudioAttributesCompatParcelizer() {
        long j = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(this.write)) << 32) | (((long) Float.floatToRawIntBits(this.IconCompatParcelizer)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Rect.fromLTRB(");
        sb.append(isReferenceType.read(this.AudioAttributesCompatParcelizer, 1));
        sb.append(", ");
        sb.append(isReferenceType.read(this.RemoteActionCompatParcelizer, 1));
        sb.append(", ");
        sb.append(isReferenceType.read(this.write, 1));
        sb.append(", ");
        sb.append(isReferenceType.read(this.IconCompatParcelizer, 1));
        sb.append(')');
        return sb.toString();
    }

    public final long MediaBrowserCompatItemReceiver() {
        long j = -1;
        return calloc.write((((long) Float.floatToRawIntBits(getWrite() - getAudioAttributesCompatParcelizer())) << 32) | (((long) Float.floatToRawIntBits(getIconCompatParcelizer() - getRemoteActionCompatParcelizer())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
    }

    public final boolean AudioAttributesCompatParcelizer(long p0) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (p0 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) p0);
        boolean z = fIntBitsToFloat >= this.AudioAttributesCompatParcelizer;
        boolean z2 = fIntBitsToFloat < this.write;
        return z & z2 & (fIntBitsToFloat2 >= this.RemoteActionCompatParcelizer) & (fIntBitsToFloat2 < this.IconCompatParcelizer);
    }

    public static /* synthetic */ WritableTypeIdInclusion IconCompatParcelizer$default(WritableTypeIdInclusion writableTypeIdInclusion, float f, float f2, float f3, float f4, int i, Object obj) {
        if ((i & 1) != 0) {
            f = writableTypeIdInclusion.AudioAttributesCompatParcelizer;
        }
        if ((i & 2) != 0) {
            f2 = writableTypeIdInclusion.RemoteActionCompatParcelizer;
        }
        if ((i & 4) != 0) {
            f3 = writableTypeIdInclusion.write;
        }
        if ((i & 8) != 0) {
            f4 = writableTypeIdInclusion.IconCompatParcelizer;
        }
        return writableTypeIdInclusion.IconCompatParcelizer(f, f2, f3, f4);
    }

    public final WritableTypeIdInclusion IconCompatParcelizer(float p0, float p1, float p2, float p3) {
        return new WritableTypeIdInclusion(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof WritableTypeIdInclusion)) {
            return false;
        }
        WritableTypeIdInclusion writableTypeIdInclusion = (WritableTypeIdInclusion) p0;
        return Float.compare(this.AudioAttributesCompatParcelizer, writableTypeIdInclusion.AudioAttributesCompatParcelizer) == 0 && Float.compare(this.RemoteActionCompatParcelizer, writableTypeIdInclusion.RemoteActionCompatParcelizer) == 0 && Float.compare(this.write, writableTypeIdInclusion.write) == 0 && Float.compare(this.IconCompatParcelizer, writableTypeIdInclusion.IconCompatParcelizer) == 0;
    }

    public final int hashCode() {
        return (((((Float.hashCode(this.AudioAttributesCompatParcelizer) * 31) + Float.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Float.hashCode(this.write)) * 31) + Float.hashCode(this.IconCompatParcelizer);
    }
}
