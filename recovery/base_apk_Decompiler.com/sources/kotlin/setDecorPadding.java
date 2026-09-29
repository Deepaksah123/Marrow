package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u0010\u001a\u00020\f8\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000fR\u001a\u0010\r\u001a\u00020\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u000fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\f0\u00138\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0014\u001a\u0004\b\u0011\u0010\u0015R\u001a\u0010\u0011\u001a\u00020\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018"}, d2 = {"Lo/setDecorPadding;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lo/switchToNext;", "write", "J", "()J", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "read", "Lo/SwitchCompat;", "Lo/SwitchCompat;", "()Lo/SwitchCompat;", "Z", "AudioAttributesCompatParcelizer", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class setDecorPadding {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final long write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;
    private final SwitchCompat<switchToNext> read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final long getWrite() {
        return this.write;
    }

    public final SwitchCompat<switchToNext> IconCompatParcelizer() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setDecorPadding)) {
            return false;
        }
        setDecorPadding setdecorpadding = (setDecorPadding) p0;
        return switchToNext.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, setdecorpadding.RemoteActionCompatParcelizer) && switchToNext.RemoteActionCompatParcelizer(this.write, setdecorpadding.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, setdecorpadding.read) && this.IconCompatParcelizer == setdecorpadding.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (((((switchToNext.MediaBrowserCompatItemReceiver(this.RemoteActionCompatParcelizer) * 31) + switchToNext.MediaBrowserCompatItemReceiver(this.write)) * 31) + this.read.hashCode()) * 31) + Boolean.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("setDecorPadding(RemoteActionCompatParcelizer=");
        sb.append((Object) switchToNext.AudioAttributesImplApi26Parcelizer(this.RemoteActionCompatParcelizer));
        sb.append(", write=");
        sb.append((Object) switchToNext.AudioAttributesImplApi26Parcelizer(this.write));
        sb.append(", read=");
        sb.append(this.read);
        sb.append(", IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
