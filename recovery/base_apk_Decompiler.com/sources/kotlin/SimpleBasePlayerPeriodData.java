package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0080\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR$\u0010!\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0017\u0010\u001f\"\u0004\b\u0019\u0010 R\u001a\u0010\u001b\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b!\u0010#R\u001a\u0010\u0019\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010$\u001a\u0004\b\u001b\u0010%R\u001a\u0010\u0017\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010&\u001a\u0004\b\u001d\u0010'"}, d2 = {"Lo/SimpleBasePlayerPeriodData;", "", "Lo/access6500;", "p0", "Lo/setTracks;", "p1", "Lo/access6700;", "p2", "Lo/setUid;", "p3", "Lo/setWindowStartTimeMs;", "p4", "<init>", "(Lo/access6700;Lo/setUid;Lo/setWindowStartTimeMs;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "Lo/access6500;", "IconCompatParcelizer", "()Lo/access6500;", "RemoteActionCompatParcelizer", "(Lo/access6500;)V", "write", "Lo/setTracks;", "()Lo/setTracks;", "(Lo/setTracks;)V", "AudioAttributesCompatParcelizer", "Lo/access6700;", "()Lo/access6700;", "Lo/setUid;", "()Lo/setUid;", "Lo/setWindowStartTimeMs;", "()Lo/setWindowStartTimeMs;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class SimpleBasePlayerPeriodData {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final access6700 RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final setWindowStartTimeMs read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final setUid IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private access6500 write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private setTracks AudioAttributesCompatParcelizer;

    public SimpleBasePlayerPeriodData(access6700 access6700Var, setUid setuid, setWindowStartTimeMs setwindowstarttimems) {
        toMagicModuleMetaRepoModel.write(access6700Var, "");
        toMagicModuleMetaRepoModel.write(setuid, "");
        toMagicModuleMetaRepoModel.write(setwindowstarttimems, "");
        this.write = null;
        this.AudioAttributesCompatParcelizer = null;
        this.RemoteActionCompatParcelizer = access6700Var;
        this.IconCompatParcelizer = setuid;
        this.read = setwindowstarttimems;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final access6500 getWrite() {
        return this.write;
    }

    public final void RemoteActionCompatParcelizer(access6500 access6500Var) {
        this.write = access6500Var;
    }

    public final void IconCompatParcelizer(setTracks settracks) {
        this.AudioAttributesCompatParcelizer = settracks;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final setTracks getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final access6700 getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final setUid getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final setWindowStartTimeMs getRead() {
        return this.read;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SimpleBasePlayerPeriodData)) {
            return false;
        }
        SimpleBasePlayerPeriodData simpleBasePlayerPeriodData = (SimpleBasePlayerPeriodData) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, simpleBasePlayerPeriodData.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, simpleBasePlayerPeriodData.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, simpleBasePlayerPeriodData.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, simpleBasePlayerPeriodData.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, simpleBasePlayerPeriodData.read);
    }

    public final int hashCode() {
        access6500 access6500Var = this.write;
        int iHashCode = access6500Var == null ? 0 : access6500Var.hashCode();
        setTracks settracks = this.AudioAttributesCompatParcelizer;
        return (((((((iHashCode * 31) + (settracks != null ? settracks.hashCode() : 0)) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.read.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SimpleBasePlayerPeriodData(write=");
        sb.append(this.write);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", read=");
        sb.append(this.read);
        sb.append(')');
        return sb.toString();
    }
}
