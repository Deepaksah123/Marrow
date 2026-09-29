package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ@\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u000b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0015\u001a\u0004\b\u001c\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0015\u001a\u0004\b\u000b\u0010\u0017"}, d2 = {"Lo/getFragment;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "<init>", "(ZZZZZZ)V", "read", "(ZZZZZZ)Lo/getFragment;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "AudioAttributesCompatParcelizer", "()Z", "write", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplBaseParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getFragment {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final boolean write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    private getFragment(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6) {
        this.AudioAttributesCompatParcelizer = z;
        this.IconCompatParcelizer = z2;
        this.RemoteActionCompatParcelizer = z3;
        this.read = z4;
        this.write = z5;
        this.AudioAttributesImplBaseParcelizer = z6;
    }

    public /* synthetic */ getFragment(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? false : z3, (i & 8) != 0 ? false : z4, (i & 16) != 0 ? false : z5, (i & 32) != 0 ? false : z6);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public getFragment() {
        this(false, false, false, false, false, false, 63, null);
    }

    public static getFragment read(boolean p0, boolean p1, boolean p2, boolean p3, boolean p4, boolean p5) {
        return new getFragment(p0, p1, p2, p3, p4, p5);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getFragment)) {
            return false;
        }
        getFragment getfragment = (getFragment) p0;
        return this.AudioAttributesCompatParcelizer == getfragment.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == getfragment.IconCompatParcelizer && this.RemoteActionCompatParcelizer == getfragment.RemoteActionCompatParcelizer && this.read == getfragment.read && this.write == getfragment.write && this.AudioAttributesImplBaseParcelizer == getfragment.AudioAttributesImplBaseParcelizer;
    }

    public final int hashCode() {
        return (((((((((Boolean.hashCode(this.AudioAttributesCompatParcelizer) * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Boolean.hashCode(this.read)) * 31) + Boolean.hashCode(this.write)) * 31) + Boolean.hashCode(this.AudioAttributesImplBaseParcelizer);
    }

    public final String toString() {
        boolean z = this.AudioAttributesCompatParcelizer;
        boolean z2 = this.IconCompatParcelizer;
        boolean z3 = this.RemoteActionCompatParcelizer;
        boolean z4 = this.read;
        boolean z5 = this.write;
        boolean z6 = this.AudioAttributesImplBaseParcelizer;
        StringBuilder sb = new StringBuilder("getFragment(AudioAttributesCompatParcelizer=");
        sb.append(z);
        sb.append(", IconCompatParcelizer=");
        sb.append(z2);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(z3);
        sb.append(", read=");
        sb.append(z4);
        sb.append(", write=");
        sb.append(z5);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(z6);
        sb.append(")");
        return sb.toString();
    }
}
