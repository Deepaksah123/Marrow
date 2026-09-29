package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003JO\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00032\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\rR\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/marrow2/ui/plan/plan_validity/model/PlanValidityUiData;", "", "isVideoExpiringSoon", "", "videoValidTill", "", "isQbankExpiringSoon", "qbankValidTill", "isTestExpiringSoon", "testValidTill", "isSubjectListExpanded", "<init>", "(ZLjava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Z)V", "()Z", "getVideoValidTill", "()Ljava/lang/String;", "getQbankValidTill", "getTestValidTill", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getLocalVersion {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final boolean IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final boolean RemoteActionCompatParcelizer;
    private final boolean read;
    private final boolean write;

    private getLocalVersion(boolean z, String str, boolean z2, String str2, boolean z3, String str3, boolean z4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.IconCompatParcelizer = z;
        this.AudioAttributesImplApi21Parcelizer = str;
        this.RemoteActionCompatParcelizer = z2;
        this.AudioAttributesCompatParcelizer = str2;
        this.write = z3;
        this.MediaBrowserCompatCustomActionResultReceiver = str3;
        this.read = z4;
    }

    public /* synthetic */ getLocalVersion(boolean z, String str, boolean z2, String str2, boolean z3, String str3, boolean z4, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? false : z3, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? false : z4);
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    public getLocalVersion() {
        this(false, null, false, null, false, null, false, 127, null);
    }

    public static /* synthetic */ getLocalVersion RemoteActionCompatParcelizer(getLocalVersion getlocalversion, boolean z, String str, boolean z2, String str2, boolean z3, String str3, boolean z4, int i) {
        if ((i & 1) != 0) {
            z = getlocalversion.IconCompatParcelizer;
        }
        if ((i & 2) != 0) {
            str = getlocalversion.AudioAttributesImplApi21Parcelizer;
        }
        String str4 = str;
        if ((i & 4) != 0) {
            z2 = getlocalversion.RemoteActionCompatParcelizer;
        }
        boolean z5 = z2;
        if ((i & 8) != 0) {
            str2 = getlocalversion.AudioAttributesCompatParcelizer;
        }
        String str5 = str2;
        if ((i & 16) != 0) {
            z3 = getlocalversion.write;
        }
        boolean z6 = z3;
        if ((i & 32) != 0) {
            str3 = getlocalversion.MediaBrowserCompatCustomActionResultReceiver;
        }
        String str6 = str3;
        if ((i & 64) != 0) {
            z4 = getlocalversion.read;
        }
        return write(z, str4, z5, str5, z6, str6, z4);
    }

    private static getLocalVersion write(boolean z, String str, boolean z2, String str2, boolean z3, String str3, boolean z4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        return new getLocalVersion(z, str, z2, str2, z3, str3, z4);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof getLocalVersion)) {
            return false;
        }
        getLocalVersion getlocalversion = (getLocalVersion) other;
        return this.IconCompatParcelizer == getlocalversion.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) getlocalversion.AudioAttributesImplApi21Parcelizer) && this.RemoteActionCompatParcelizer == getlocalversion.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) getlocalversion.AudioAttributesCompatParcelizer) && this.write == getlocalversion.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) getlocalversion.MediaBrowserCompatCustomActionResultReceiver) && this.read == getlocalversion.read;
    }

    public final int hashCode() {
        return (((((((((((Boolean.hashCode(this.IconCompatParcelizer) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer)) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.write)) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + Boolean.hashCode(this.read);
    }

    public final String toString() {
        boolean z = this.IconCompatParcelizer;
        String str = this.AudioAttributesImplApi21Parcelizer;
        boolean z2 = this.RemoteActionCompatParcelizer;
        String str2 = this.AudioAttributesCompatParcelizer;
        boolean z3 = this.write;
        String str3 = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean z4 = this.read;
        StringBuilder sb = new StringBuilder("PlanValidityUiData(isVideoExpiringSoon=");
        sb.append(z);
        sb.append(", videoValidTill=");
        sb.append(str);
        sb.append(", isQbankExpiringSoon=");
        sb.append(z2);
        sb.append(", qbankValidTill=");
        sb.append(str2);
        sb.append(", isTestExpiringSoon=");
        sb.append(z3);
        sb.append(", testValidTill=");
        sb.append(str3);
        sb.append(", isSubjectListExpanded=");
        sb.append(z4);
        sb.append(")");
        return sb.toString();
    }
}
