package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0015\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0016\u0010\u0012R\u001a\u0010\u001a\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u001a\u0010\u0018\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u0015\u0010\u0010"}, d2 = {"Lo/setFloat;", "", "", "p0", "", "p1", "p2", "p3", "", "p4", "<init>", "(Ljava/lang/String;DLjava/lang/String;DI)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "IconCompatParcelizer", "Ljava/lang/String;", "read", "RemoteActionCompatParcelizer", "D", "write", "()D", "AudioAttributesCompatParcelizer", "I"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setFloat {
    private final double AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String read;
    private final double RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    public setFloat(String str, double d, String str2, double d2, int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.read = str;
        this.RemoteActionCompatParcelizer = d;
        this.IconCompatParcelizer = str2;
        this.AudioAttributesCompatParcelizer = d2;
        this.write = i;
    }

    public /* synthetic */ setFloat(String str, double d, String str2, double d2, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? 0.0d : d, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0.0d : d2, (i2 & 16) != 0 ? 0 : i);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final double getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final double getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    public setFloat() {
        this(null, 0.0d, null, 0.0d, 0, 31, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setFloat)) {
            return false;
        }
        setFloat setfloat = (setFloat) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) setfloat.read) && Double.compare(this.RemoteActionCompatParcelizer, setfloat.RemoteActionCompatParcelizer) == 0 && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) setfloat.IconCompatParcelizer) && Double.compare(this.AudioAttributesCompatParcelizer, setfloat.AudioAttributesCompatParcelizer) == 0 && this.write == setfloat.write;
    }

    public final int hashCode() {
        return (((((((this.read.hashCode() * 31) + Double.hashCode(this.RemoteActionCompatParcelizer)) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Double.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.write);
    }

    public final String toString() {
        String str = this.read;
        double d = this.RemoteActionCompatParcelizer;
        String str2 = this.IconCompatParcelizer;
        double d2 = this.AudioAttributesCompatParcelizer;
        int i = this.write;
        StringBuilder sb = new StringBuilder("setFloat(read=");
        sb.append(str);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(d);
        sb.append(", IconCompatParcelizer=");
        sb.append(str2);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(d2);
        sb.append(", write=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }
}
