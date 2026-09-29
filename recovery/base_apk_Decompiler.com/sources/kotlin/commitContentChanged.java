package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B7\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0005\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001c\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u001c\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001b"}, d2 = {"Lo/commitContentChanged;", "Lo/writerFor;", "Lo/cancelLoad;", "Lo/SwitchCompat;", "", "p0", "Lo/hasReferringProperties;", "p1", "p2", "<init>", "(Lo/SwitchCompat;Lo/SwitchCompat;Lo/SwitchCompat;)V", "write", "()Lo/cancelLoad;", "", "IconCompatParcelizer", "(Lo/cancelLoad;)V", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "read", "Lo/SwitchCompat;", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class commitContentChanged extends writerFor<cancelLoad> {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final SwitchCompat<hasReferringProperties> IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final SwitchCompat<Float> write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final SwitchCompat<Float> AudioAttributesCompatParcelizer;

    public commitContentChanged(SwitchCompat<Float> switchCompat, SwitchCompat<hasReferringProperties> switchCompat2, SwitchCompat<Float> switchCompat3) {
        this.write = switchCompat;
        this.IconCompatParcelizer = switchCompat2;
        this.AudioAttributesCompatParcelizer = switchCompat3;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final cancelLoad IconCompatParcelizer() {
        return new cancelLoad(this.write, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer);
    }

    @Override // kotlin.writerFor
    public final void IconCompatParcelizer(cancelLoad p0) {
        p0.RemoteActionCompatParcelizer(this.write);
        p0.write(this.IconCompatParcelizer);
        p0.read(this.AudioAttributesCompatParcelizer);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof commitContentChanged)) {
            return false;
        }
        commitContentChanged commitcontentchanged = (commitContentChanged) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, commitcontentchanged.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, commitcontentchanged.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, commitcontentchanged.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        SwitchCompat<Float> switchCompat = this.write;
        int iHashCode = switchCompat == null ? 0 : switchCompat.hashCode();
        SwitchCompat<hasReferringProperties> switchCompat2 = this.IconCompatParcelizer;
        int iHashCode2 = switchCompat2 == null ? 0 : switchCompat2.hashCode();
        SwitchCompat<Float> switchCompat3 = this.AudioAttributesCompatParcelizer;
        return (((iHashCode * 31) + iHashCode2) * 31) + (switchCompat3 != null ? switchCompat3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("commitContentChanged(write=");
        sb.append(this.write);
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
