package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003JG\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00052\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\tHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000f¨\u0006\u001f"}, d2 = {"Lcom/marrow2/ui/video/landing/model/VideoLandingUIState;", "", "editionSwitchBannerText", "", "isInternModeEnabled", "", "isInternModeOn", "showPytBanner", "sortOrder", "", "showInternModeSnackBar", "<init>", "(Ljava/lang/String;ZZZIZ)V", "getEditionSwitchBannerText", "()Ljava/lang/String;", "()Z", "getShowPytBanner", "getSortOrder", "()I", "getShowInternModeSnackBar", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TransformationChildLayout {
    private final boolean AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private final boolean IconCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;
    private final boolean read;
    private final String write;

    private TransformationChildLayout(String str, boolean z, boolean z2, boolean z3, int i, boolean z4) {
        this.write = str;
        this.read = z;
        this.IconCompatParcelizer = z2;
        this.RemoteActionCompatParcelizer = z3;
        this.AudioAttributesImplApi26Parcelizer = i;
        this.AudioAttributesCompatParcelizer = z4;
    }

    public /* synthetic */ TransformationChildLayout(String str, boolean z, boolean z2, boolean z3, int i, boolean z4, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? false : z, (i2 & 4) != 0 ? false : z2, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? 0 : i, (i2 & 32) == 0 ? z4 : false);
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public TransformationChildLayout() {
        this(null, false, false, false, 0, false, 63, null);
    }

    public static /* synthetic */ TransformationChildLayout RemoteActionCompatParcelizer(TransformationChildLayout transformationChildLayout, String str, boolean z, boolean z2, boolean z3, int i, boolean z4, int i2) {
        if ((i2 & 1) != 0) {
            str = transformationChildLayout.write;
        }
        if ((i2 & 2) != 0) {
            z = transformationChildLayout.read;
        }
        boolean z5 = z;
        if ((i2 & 4) != 0) {
            z2 = transformationChildLayout.IconCompatParcelizer;
        }
        boolean z6 = z2;
        if ((i2 & 8) != 0) {
            z3 = transformationChildLayout.RemoteActionCompatParcelizer;
        }
        boolean z7 = z3;
        if ((i2 & 16) != 0) {
            i = transformationChildLayout.AudioAttributesImplApi26Parcelizer;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            z4 = transformationChildLayout.AudioAttributesCompatParcelizer;
        }
        return read(str, z5, z6, z7, i3, z4);
    }

    private static TransformationChildLayout read(String str, boolean z, boolean z2, boolean z3, int i, boolean z4) {
        return new TransformationChildLayout(str, z, z2, z3, i, z4);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransformationChildLayout)) {
            return false;
        }
        TransformationChildLayout transformationChildLayout = (TransformationChildLayout) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) transformationChildLayout.write) && this.read == transformationChildLayout.read && this.IconCompatParcelizer == transformationChildLayout.IconCompatParcelizer && this.RemoteActionCompatParcelizer == transformationChildLayout.RemoteActionCompatParcelizer && this.AudioAttributesImplApi26Parcelizer == transformationChildLayout.AudioAttributesImplApi26Parcelizer && this.AudioAttributesCompatParcelizer == transformationChildLayout.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        String str = this.write;
        return ((((((((((str == null ? 0 : str.hashCode()) * 31) + Boolean.hashCode(this.read)) * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Integer.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        String str = this.write;
        boolean z = this.read;
        boolean z2 = this.IconCompatParcelizer;
        boolean z3 = this.RemoteActionCompatParcelizer;
        int i = this.AudioAttributesImplApi26Parcelizer;
        boolean z4 = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("VideoLandingUIState(editionSwitchBannerText=");
        sb.append(str);
        sb.append(", isInternModeEnabled=");
        sb.append(z);
        sb.append(", isInternModeOn=");
        sb.append(z2);
        sb.append(", showPytBanner=");
        sb.append(z3);
        sb.append(", sortOrder=");
        sb.append(i);
        sb.append(", showInternModeSnackBar=");
        sb.append(z4);
        sb.append(")");
        return sb.toString();
    }
}
