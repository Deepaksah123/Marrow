package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0015\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u001a\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u000e\"\u0004\b\u0012\u0010\u0019R\"\u0010\u001b\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u001b\u0010\u000e\"\u0004\b\u001a\u0010\u0019R\"\u0010\u0017\u001a\u00020\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0017\u0010\u000e\"\u0004\b\u0015\u0010\u0019"}, d2 = {"Lo/setLineSpacingMultiplier;", "", "", "p0", "", "p1", "p2", "p3", "<init>", "(JIII)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "write", "J", "()J", "IconCompatParcelizer", "(J)V", "read", "I", "(I)V", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setLineSpacingMultiplier {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int read;
    private int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private long IconCompatParcelizer;

    private setLineSpacingMultiplier(long j, int i, int i2, int i3) {
        this.IconCompatParcelizer = j;
        this.AudioAttributesCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
        this.read = i3;
    }

    public /* synthetic */ setLineSpacingMultiplier(long j, int i, int i2, int i3, int i4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i4 & 1) != 0 ? 0L : j, (i4 & 2) != 0 ? 0 : i, (i4 & 4) != 0 ? 0 : i2, (i4 & 8) != 0 ? 0 : i3);
    }

    public final void IconCompatParcelizer(long j) {
        this.IconCompatParcelizer = j;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void write(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void IconCompatParcelizer(int i) {
        this.read = i;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    public setLineSpacingMultiplier() {
        this(0L, 0, 0, 0, 15, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setLineSpacingMultiplier)) {
            return false;
        }
        setLineSpacingMultiplier setlinespacingmultiplier = (setLineSpacingMultiplier) p0;
        return this.IconCompatParcelizer == setlinespacingmultiplier.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == setlinespacingmultiplier.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == setlinespacingmultiplier.RemoteActionCompatParcelizer && this.read == setlinespacingmultiplier.read;
    }

    public final int hashCode() {
        return (((((Long.hashCode(this.IconCompatParcelizer) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Integer.hashCode(this.read);
    }

    public final String toString() {
        long j = this.IconCompatParcelizer;
        int i = this.AudioAttributesCompatParcelizer;
        int i2 = this.RemoteActionCompatParcelizer;
        int i3 = this.read;
        StringBuilder sb = new StringBuilder("setLineSpacingMultiplier(IconCompatParcelizer=");
        sb.append(j);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(i);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(i2);
        sb.append(", read=");
        sb.append(i3);
        sb.append(")");
        return sb.toString();
    }
}
