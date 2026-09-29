package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\r\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0016\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0012R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0014\u001a\u0004\b\u0017\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0013\u0010\u0012R\u001a\u0010\u0018\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u0010R\u001a\u0010\u0017\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0019\u001a\u0004\b\u0016\u0010\u0010R\u001a\u0010\u001e\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d"}, d2 = {"Lo/getFirstInstallAppVersion;", "", "", "p0", "p1", "p2", "", "p3", "p4", "", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZ)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "write", "Ljava/lang/String;", "read", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "I", "MediaBrowserCompatCustomActionResultReceiver", "Z", "AudioAttributesImplApi26Parcelizer", "()Z", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getFirstInstallAppVersion {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final int IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    public getFirstInstallAppVersion(String str, String str2, String str3, int i, int i2, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.AudioAttributesCompatParcelizer = str;
        this.read = str2;
        this.write = str3;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = i2;
        this.AudioAttributesImplApi21Parcelizer = z;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final boolean getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getFirstInstallAppVersion)) {
            return false;
        }
        getFirstInstallAppVersion getfirstinstallappversion = (getFirstInstallAppVersion) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) getfirstinstallappversion.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) getfirstinstallappversion.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) getfirstinstallappversion.write) && this.RemoteActionCompatParcelizer == getfirstinstallappversion.RemoteActionCompatParcelizer && this.IconCompatParcelizer == getfirstinstallappversion.IconCompatParcelizer && this.AudioAttributesImplApi21Parcelizer == getfirstinstallappversion.AudioAttributesImplApi21Parcelizer;
    }

    public final int hashCode() {
        return (((((((((this.AudioAttributesCompatParcelizer.hashCode() * 31) + this.read.hashCode()) * 31) + this.write.hashCode()) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi21Parcelizer);
    }

    public final String toString() {
        String str = this.AudioAttributesCompatParcelizer;
        String str2 = this.read;
        String str3 = this.write;
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.IconCompatParcelizer;
        boolean z = this.AudioAttributesImplApi21Parcelizer;
        StringBuilder sb = new StringBuilder("getFirstInstallAppVersion(AudioAttributesCompatParcelizer=");
        sb.append(str);
        sb.append(", read=");
        sb.append(str2);
        sb.append(", write=");
        sb.append(str3);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(i);
        sb.append(", IconCompatParcelizer=");
        sb.append(i2);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
