package kotlin;

import android.graphics.Shader;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002BC\b\u0000\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u0012\u001a\u00060\u0010j\u0002`\u00112\u0006\u0010\u0005\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0005\u001a\u0004\u0018\u00010\u0014H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010\u0012\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\"\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b$\u0010#R\u0014\u0010$\u001a\u00020\u000b8\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b%\u0010&"}, d2 = {"Lo/contentsAsLong;", "Lo/throwInternal;", "Lo/contentsAsString;", "", "Lo/switchToNext;", "p0", "", "p1", "Lo/getReferencedType;", "p2", "p3", "Lo/findContentSerializer;", "p4", "<init>", "(Ljava/util/List;Ljava/util/List;JJILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V", "Lo/calloc;", "Landroid/graphics/Shader;", "Lo/AudioAttributesCompatParcelizer;", "IconCompatParcelizer", "(J)Landroid/graphics/Shader;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "Ljava/util/List;", "MediaBrowserCompatCustomActionResultReceiver", "write", "RemoteActionCompatParcelizer", "J", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi21Parcelizer", "I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class contentsAsLong extends throwInternal implements contentsAsString {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final List<Float> write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final long IconCompatParcelizer;
    private final List<switchToNext> read;

    private contentsAsLong(List<switchToNext> list, List<Float> list2, long j, long j2, int i) {
        this.read = list;
        this.write = list2;
        this.IconCompatParcelizer = j;
        this.RemoteActionCompatParcelizer = j2;
        this.AudioAttributesCompatParcelizer = i;
    }

    @Override // kotlin.throwInternal
    public final Shader IconCompatParcelizer(long p0) {
        long j;
        long j2;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.IconCompatParcelizer >> 32)) == Float.POSITIVE_INFINITY ? p0 >> 32 : this.IconCompatParcelizer >> 32));
        if (Float.intBitsToFloat((int) this.IconCompatParcelizer) == Float.POSITIVE_INFINITY) {
            long j3 = -1;
            j = p0 & ((((long) 0) << 32) | (j3 - ((j3 >> 63) << 32)));
        } else {
            long j4 = -1;
            j = this.IconCompatParcelizer & ((((long) 0) << 32) | (j4 - ((j4 >> 63) << 32)));
        }
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) j);
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (Float.intBitsToFloat((int) (this.RemoteActionCompatParcelizer >> 32)) == Float.POSITIVE_INFINITY ? p0 >> 32 : this.RemoteActionCompatParcelizer >> 32));
        if (Float.intBitsToFloat((int) this.RemoteActionCompatParcelizer) == Float.POSITIVE_INFINITY) {
            long j5 = -1;
            j2 = p0 & ((((long) 0) << 32) | (j5 - ((j5 >> 63) << 32)));
        } else {
            long j6 = -1;
            j2 = this.RemoteActionCompatParcelizer & ((((long) 0) << 32) | (j6 - ((j6 >> 63) << 32)));
        }
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) j2);
        List<switchToNext> list = this.read;
        List<Float> list2 = this.write;
        long jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat);
        long j7 = -1;
        long j8 = -1;
        return AbstractTypeResolver.RemoteActionCompatParcelizer(getReferencedType.AudioAttributesCompatParcelizer((((j7 - ((j7 >> 63) << 32)) | (((long) 0) << 32)) & ((long) Float.floatToRawIntBits(fIntBitsToFloat2))) | (jFloatToRawIntBits << 32)), getReferencedType.AudioAttributesCompatParcelizer((((j8 - ((j8 >> 63) << 32)) | (((long) 0) << 32)) & ((long) Float.floatToRawIntBits(fIntBitsToFloat4))) | (((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32)), list, list2, this.AudioAttributesCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof contentsAsLong)) {
            return false;
        }
        contentsAsLong contentsaslong = (contentsAsLong) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, contentsaslong.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, contentsaslong.write) && getReferencedType.IconCompatParcelizer(this.IconCompatParcelizer, contentsaslong.IconCompatParcelizer) && getReferencedType.IconCompatParcelizer(this.RemoteActionCompatParcelizer, contentsaslong.RemoteActionCompatParcelizer) && findContentSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, contentsaslong.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        List<Float> list = this.write;
        return (((((((iHashCode * 31) + (list != null ? list.hashCode() : 0)) * 31) + getReferencedType.MediaBrowserCompatItemReceiver(this.IconCompatParcelizer)) * 31) + getReferencedType.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer)) * 31) + findContentSerializer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        String string;
        String string2 = "";
        if (((((this.IconCompatParcelizer & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0) {
            StringBuilder sb = new StringBuilder("start=");
            sb.append((Object) getReferencedType.AudioAttributesImplBaseParcelizer(this.IconCompatParcelizer));
            sb.append(", ");
            string = sb.toString();
        } else {
            string = "";
        }
        if ((((9187343241974906880L ^ (this.RemoteActionCompatParcelizer & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) {
            StringBuilder sb2 = new StringBuilder("end=");
            sb2.append((Object) getReferencedType.AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer));
            sb2.append(", ");
            string2 = sb2.toString();
        }
        StringBuilder sb3 = new StringBuilder("LinearGradient(colors=");
        sb3.append(this.read);
        sb3.append(", stops=");
        sb3.append(this.write);
        sb3.append(", ");
        sb3.append(string);
        sb3.append(string2);
        sb3.append("tileMode=");
        sb3.append((Object) findContentSerializer.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer));
        sb3.append(')');
        return sb3.toString();
    }

    public /* synthetic */ contentsAsLong(List list, List list2, long j, long j2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(list, list2, j, j2, i);
    }
}
