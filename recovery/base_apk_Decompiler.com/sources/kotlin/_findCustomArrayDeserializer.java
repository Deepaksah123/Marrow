package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0080\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0011\u0010\u000e\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fJ\u0011\u0010\u0010\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0010\u0010\u000fJ\u0011\u0010\u0011\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0011\u0010\u000fJ\u0011\u0010\u0012\u001a\u00020\u0004*\u00020\u0004¢\u0006\u0004\b\u0012\u0010\u000fJ\u0011\u0010\u000e\u001a\u00020\t*\u00020\t¢\u0006\u0004\b\u000e\u0010\u0013J\u0011\u0010\u0012\u001a\u00020\t*\u00020\t¢\u0006\u0004\b\u0012\u0010\u0013J\u0011\u0010\u0010\u001a\u00020\u0014*\u00020\u0014¢\u0006\u0004\b\u0010\u0010\u0015J\u0011\u0010\u0012\u001a\u00020\u0016*\u00020\u0016¢\u0006\u0004\b\u0012\u0010\u0017J\u0011\u0010\u000e\u001a\u00020\u0016*\u00020\u0016¢\u0006\u0004\b\u000e\u0010\u0017J\u0011\u0010\u000e\u001a\u00020\u0018*\u00020\u0018¢\u0006\u0004\b\u000e\u0010\u0019J\u001b\u0010\u0010\u001a\u00020\u001a*\u00020\u001a2\b\b\u0002\u0010\u0003\u001a\u00020\u001b¢\u0006\u0004\b\u0010\u0010\u001cJ\u001a\u0010\u001d\u001a\u00020\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0012\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010$\u001a\u0004\b\u0012\u0010%R\u001a\u0010\u0011\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010&\u001a\u0004\b'\u0010 R\u001a\u0010(\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010&\u001a\u0004\b(\u0010 R\u001c\u0010\u000e\u001a\u00020\u00048\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b)\u0010&\u001a\u0004\b)\u0010 R\u001c\u0010\u0010\u001a\u00020\u00048\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b\u0010\u0010 R\u001c\u0010*\u001a\u00020\t8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u001c\u0010)\u001a\u00020\t8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b(\u0010+\u001a\u0004\b\u000e\u0010,R\u0011\u0010'\u001a\u00020\u00048G¢\u0006\u0006\u001a\u0004\b\u0011\u0010 "}, d2 = {"Lo/_findCustomArrayDeserializer;", "", "Lo/_constructDefaultValueInstantiator;", "p0", "", "p1", "p2", "p3", "p4", "", "p5", "p6", "<init>", "(Lo/_constructDefaultValueInstantiator;IIIIFF)V", "write", "(I)I", "read", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "(F)F", "Lo/getReferencedType;", "(J)J", "Lo/WritableTypeIdInclusion;", "(Lo/WritableTypeIdInclusion;)Lo/WritableTypeIdInclusion;", "Lo/removeSoftRefsClearedByGc;", "(Lo/removeSoftRefsClearedByGc;)Lo/removeSoftRefsClearedByGc;", "Lo/findProperty;", "", "(JZ)J", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lo/_constructDefaultValueInstantiator;", "()Lo/_constructDefaultValueInstantiator;", "I", "AudioAttributesImplApi26Parcelizer", "RemoteActionCompatParcelizer", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "F", "()F"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class _findCustomArrayDeserializer {
    private final _constructDefaultValueInstantiator AudioAttributesCompatParcelizer;
    private float AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private int write;
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private float AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int read;

    public _findCustomArrayDeserializer(_constructDefaultValueInstantiator _constructdefaultvalueinstantiator, int i, int i2, int i3, int i4, float f, float f2) {
        this.AudioAttributesCompatParcelizer = _constructdefaultvalueinstantiator;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
        this.write = i3;
        this.read = i4;
        this.AudioAttributesImplApi21Parcelizer = f;
        this.AudioAttributesImplBaseParcelizer = f2;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final _constructDefaultValueInstantiator getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final float getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final float getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final int IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer - this.IconCompatParcelizer;
    }

    public final int write(int i) {
        return getQues.write(i, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer) - this.IconCompatParcelizer;
    }

    public final int read(int i) {
        return i + this.IconCompatParcelizer;
    }

    public final int IconCompatParcelizer(int i) {
        return i - this.write;
    }

    public final int AudioAttributesCompatParcelizer(int i) {
        return i + this.write;
    }

    public final float write(float f) {
        return f + this.AudioAttributesImplApi21Parcelizer;
    }

    public final float AudioAttributesCompatParcelizer(float f) {
        return f - this.AudioAttributesImplApi21Parcelizer;
    }

    public final WritableTypeIdInclusion AudioAttributesCompatParcelizer(WritableTypeIdInclusion writableTypeIdInclusion) {
        long j = -1;
        return writableTypeIdInclusion.RemoteActionCompatParcelizer(getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << 32) | (((long) Float.floatToRawIntBits(this.AudioAttributesImplApi21Parcelizer)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))));
    }

    public final WritableTypeIdInclusion write(WritableTypeIdInclusion writableTypeIdInclusion) {
        long j = -1;
        return writableTypeIdInclusion.RemoteActionCompatParcelizer(getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << 32) | (((long) Float.floatToRawIntBits(-this.AudioAttributesImplApi21Parcelizer)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))));
    }

    public final removeSoftRefsClearedByGc write(removeSoftRefsClearedByGc removesoftrefsclearedbygc) {
        long j = -1;
        removesoftrefsclearedbygc.read(getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(BitmapDescriptorFactory.HUE_RED)) << 32) | (((long) Float.floatToRawIntBits(this.AudioAttributesImplApi21Parcelizer)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))));
        return removesoftrefsclearedbygc;
    }

    public static /* synthetic */ long read$default(_findCustomArrayDeserializer _findcustomarraydeserializer, long j, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = true;
        }
        return _findcustomarraydeserializer.read(j, z);
    }

    public final long read(long j, boolean z) {
        if (z && findProperty.IconCompatParcelizer(j, findProperty.INSTANCE.AudioAttributesCompatParcelizer())) {
            return findProperty.INSTANCE.AudioAttributesCompatParcelizer();
        }
        return getValueInstantiator.write(read(findProperty.AudioAttributesImplBaseParcelizer(j)), read(findProperty.read(j)));
    }

    public final long read(long j) {
        long j2 = -1;
        return getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) j) - this.AudioAttributesImplApi21Parcelizer)) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j >> 32)))) << 32));
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof _findCustomArrayDeserializer)) {
            return false;
        }
        _findCustomArrayDeserializer _findcustomarraydeserializer = (_findCustomArrayDeserializer) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, _findcustomarraydeserializer.AudioAttributesCompatParcelizer) && this.IconCompatParcelizer == _findcustomarraydeserializer.IconCompatParcelizer && this.RemoteActionCompatParcelizer == _findcustomarraydeserializer.RemoteActionCompatParcelizer && this.write == _findcustomarraydeserializer.write && this.read == _findcustomarraydeserializer.read && Float.compare(this.AudioAttributesImplApi21Parcelizer, _findcustomarraydeserializer.AudioAttributesImplApi21Parcelizer) == 0 && Float.compare(this.AudioAttributesImplBaseParcelizer, _findcustomarraydeserializer.AudioAttributesImplBaseParcelizer) == 0;
    }

    public final int hashCode() {
        return (((((((((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Integer.hashCode(this.write)) * 31) + Integer.hashCode(this.read)) * 31) + Float.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Float.hashCode(this.AudioAttributesImplBaseParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("_findCustomArrayDeserializer(AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", write=");
        sb.append(this.write);
        sb.append(", read=");
        sb.append(this.read);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
