package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0014\u001a\u0004\b\u001a\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0015\u0010\u0019R\u001a\u0010\u0016\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u0016\u0010\u0010"}, d2 = {"Lo/fromUtf8Bytes;", "", "", "p0", "", "p1", "p2", "p3", "", "p4", "<init>", "(Ljava/lang/String;DLjava/lang/String;DI)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Ljava/lang/String;", "write", "IconCompatParcelizer", "D", "read", "()D", "RemoteActionCompatParcelizer", "I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class fromUtf8Bytes {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final double AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final double read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    public fromUtf8Bytes(String str, double d, String str2, double d2, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.write = str;
        this.AudioAttributesCompatParcelizer = d;
        this.RemoteActionCompatParcelizer = str2;
        this.read = d2;
        this.IconCompatParcelizer = i;
    }

    public /* synthetic */ fromUtf8Bytes(String str, double d, String str2, double d2, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0.0d : d, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0.0d : d2, (i2 & 16) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final double getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final double getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public fromUtf8Bytes() {
        this(null, 0.0d, null, 0.0d, 0, 31, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof fromUtf8Bytes)) {
            return false;
        }
        fromUtf8Bytes fromutf8bytes = (fromUtf8Bytes) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) fromutf8bytes.write) && Double.compare(this.AudioAttributesCompatParcelizer, fromutf8bytes.AudioAttributesCompatParcelizer) == 0 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) fromutf8bytes.RemoteActionCompatParcelizer) && Double.compare(this.read, fromutf8bytes.read) == 0 && this.IconCompatParcelizer == fromutf8bytes.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (((((((this.write.hashCode() * 31) + Double.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Double.hashCode(this.read)) * 31) + Integer.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        String str = this.write;
        double d = this.AudioAttributesCompatParcelizer;
        String str2 = this.RemoteActionCompatParcelizer;
        double d2 = this.read;
        int i = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("fromUtf8Bytes(write=");
        sb.append(str);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(d);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str2);
        sb.append(", read=");
        sb.append(d2);
        sb.append(", IconCompatParcelizer=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
