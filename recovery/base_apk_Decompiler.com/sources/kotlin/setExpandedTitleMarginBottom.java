package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\"\u0010\u0016\u001a\u00020\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\"\u0010\u0014\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015\"\u0004\b\u0014\u0010\u0017R\"\u0010\u0012\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0019\u001a\u0004\b\u0018\u0010\u000e\"\u0004\b\u0012\u0010\u001aR$\u0010\u001e\u001a\u0004\u0018\u00010\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0016\u0010\u001c\"\u0004\b\u0012\u0010\u001dR\"\u0010\u0018\u001a\u00020\u00058\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001e\u0010\u000e\"\u0004\b\u0014\u0010\u001a"}, d2 = {"Lo/setExpandedTitleMarginBottom;", "", "", "p0", "p1", "", "p2", "p3", "p4", "<init>", "(ZZILjava/lang/Integer;I)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesCompatParcelizer", "Z", "IconCompatParcelizer", "()Z", "read", "(Z)V", "RemoteActionCompatParcelizer", "I", "(I)V", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "(Ljava/lang/Integer;)V", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setExpandedTitleMarginBottom {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private Integer write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    private setExpandedTitleMarginBottom(boolean z, boolean z2, int i, Integer num, int i2) {
        this.read = z;
        this.IconCompatParcelizer = z2;
        this.AudioAttributesCompatParcelizer = i;
        this.write = num;
        this.RemoteActionCompatParcelizer = i2;
    }

    public /* synthetic */ setExpandedTitleMarginBottom(boolean z, boolean z2, int i, Integer num, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? false : z2, (i3 & 4) != 0 ? 0 : i, (i3 & 8) != 0 ? null : num, (i3 & 16) != 0 ? 0 : i2);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    public final void read(boolean z) {
        this.read = z;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final void IconCompatParcelizer(boolean z) {
        this.IconCompatParcelizer = z;
    }

    public final void AudioAttributesCompatParcelizer(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(Integer num) {
        this.write = num;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final Integer getWrite() {
        return this.write;
    }

    public final void IconCompatParcelizer(int i) {
        this.RemoteActionCompatParcelizer = i;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public setExpandedTitleMarginBottom() {
        this(false, false, 0, null, 0, 31, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setExpandedTitleMarginBottom)) {
            return false;
        }
        setExpandedTitleMarginBottom setexpandedtitlemarginbottom = (setExpandedTitleMarginBottom) p0;
        return this.read == setexpandedtitlemarginbottom.read && this.IconCompatParcelizer == setexpandedtitlemarginbottom.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == setexpandedtitlemarginbottom.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, setexpandedtitlemarginbottom.write) && this.RemoteActionCompatParcelizer == setexpandedtitlemarginbottom.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.read);
        int iHashCode2 = Boolean.hashCode(this.IconCompatParcelizer);
        int iHashCode3 = Integer.hashCode(this.AudioAttributesCompatParcelizer);
        Integer num = this.write;
        return (((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        boolean z = this.read;
        boolean z2 = this.IconCompatParcelizer;
        int i = this.AudioAttributesCompatParcelizer;
        Integer num = this.write;
        int i2 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("setExpandedTitleMarginBottom(read=");
        sb.append(z);
        sb.append(", IconCompatParcelizer=");
        sb.append(z2);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(i);
        sb.append(", write=");
        sb.append(num);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
