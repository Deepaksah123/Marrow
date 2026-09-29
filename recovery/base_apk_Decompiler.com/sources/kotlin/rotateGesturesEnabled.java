package kotlin;

import android.net.Uri;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bu\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\n\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0006HÆ\u0003J\t\u0010%\u001a\u00020\bHÆ\u0003J\t\u0010&\u001a\u00020\nHÆ\u0003J\t\u0010'\u001a\u00020\nHÆ\u0003J\t\u0010(\u001a\u00020\nHÆ\u0003J\t\u0010)\u001a\u00020\nHÆ\u0003J\t\u0010*\u001a\u00020\u0006HÆ\u0003J\t\u0010+\u001a\u00020\bHÆ\u0003J\t\u0010,\u001a\u00020\u0011HÆ\u0003Jw\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\n2\b\b\u0002\u0010\u000e\u001a\u00020\u00062\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0010\u001a\u00020\u0011HÆ\u0001J\u0013\u0010.\u001a\u00020\u00032\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\bHÖ\u0001J\t\u00101\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u0014R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0011\u0010\r\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0018R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b \u0010!¨\u00062"}, d2 = {"Lcom/marrow2/ui/settings/kyc/upload/KycUploadUiState;", "", "isImagePickDialogShown", "", "isDeleteImageDialogShown", "docTypeTitle", "", "docType", "", "frontImageUri", "Landroid/net/Uri;", "backImageUri", "tempImageUri", "tempCameraUri", "confirmUiTitle", "kycStatus", "screenType", "Lcom/marrow2/ui/settings/kyc/upload/KycUploadScreenType;", "<init>", "(ZZLjava/lang/String;ILandroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Landroid/net/Uri;Ljava/lang/String;ILcom/marrow2/ui/settings/kyc/upload/KycUploadScreenType;)V", "()Z", "getDocTypeTitle", "()Ljava/lang/String;", "getDocType", "()I", "getFrontImageUri", "()Landroid/net/Uri;", "getBackImageUri", "getTempImageUri", "getTempCameraUri", "getConfirmUiTitle", "getKycStatus", "getScreenType", "()Lcom/marrow2/ui/settings/kyc/upload/KycUploadScreenType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class rotateGesturesEnabled {
    private final int AudioAttributesCompatParcelizer;
    private final Uri AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private final boolean AudioAttributesImplBaseParcelizer;
    private final Uri IconCompatParcelizer;
    private final minZoomPreference MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final Uri MediaBrowserCompatSearchResultReceiver;
    private final Uri RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    private rotateGesturesEnabled(boolean z, boolean z2, String str, int i, Uri uri, Uri uri2, Uri uri3, Uri uri4, String str2, int i2, minZoomPreference minzoompreference) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(uri, "");
        toMagicModuleMetaRepoModel.write(uri2, "");
        toMagicModuleMetaRepoModel.write(uri3, "");
        toMagicModuleMetaRepoModel.write(uri4, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(minzoompreference, "");
        this.AudioAttributesImplBaseParcelizer = z;
        this.MediaBrowserCompatItemReceiver = z2;
        this.write = str;
        this.AudioAttributesCompatParcelizer = i;
        this.IconCompatParcelizer = uri;
        this.RemoteActionCompatParcelizer = uri2;
        this.MediaBrowserCompatSearchResultReceiver = uri3;
        this.AudioAttributesImplApi21Parcelizer = uri4;
        this.read = str2;
        this.AudioAttributesImplApi26Parcelizer = i2;
        this.MediaBrowserCompatCustomActionResultReceiver = minzoompreference;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ rotateGesturesEnabled(boolean z, boolean z2, String str, int i, Uri uri, Uri uri2, Uri uri3, Uri uri4, String str2, int i2, minZoomPreference minzoompreference, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        z = (i3 & 1) != 0 ? false : z;
        z2 = (i3 & 2) != 0 ? false : z2;
        str = (i3 & 4) != 0 ? "" : str;
        i = (i3 & 8) != 0 ? -1 : i;
        if ((i3 & 16) != 0) {
            uri = Uri.EMPTY;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uri, "");
        }
        if ((i3 & 32) != 0) {
            uri2 = Uri.EMPTY;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uri2, "");
        }
        if ((i3 & 64) != 0) {
            uri3 = Uri.EMPTY;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uri3, "");
        }
        if ((i3 & 128) != 0) {
            uri4 = Uri.EMPTY;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uri4, "");
        }
        this(z, z2, str, i, uri, uri2, uri3, uri4, (i3 & 256) != 0 ? "" : str2, (i3 & 512) != 0 ? 1 : i2, (i3 & 1024) != 0 ? minZoomPreference.RemoteActionCompatParcelizer : minzoompreference);
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final boolean getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final Uri getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final Uri getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final Uri getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final Uri getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final int getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final minZoomPreference getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public rotateGesturesEnabled() {
        this(false, false, null, 0, null, null, null, null, null, 0, null, 2047, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static rotateGesturesEnabled AudioAttributesCompatParcelizer(boolean z, boolean z2, String str, int i, Uri uri, Uri uri2, Uri uri3, Uri uri4, String str2, int i2, minZoomPreference minzoompreference) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(uri, "");
        toMagicModuleMetaRepoModel.write(uri2, "");
        toMagicModuleMetaRepoModel.write(uri3, "");
        toMagicModuleMetaRepoModel.write(uri4, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(minzoompreference, "");
        return new rotateGesturesEnabled(z, z2, str, i, uri, uri2, uri3, uri4, str2, i2, minzoompreference);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof rotateGesturesEnabled)) {
            return false;
        }
        rotateGesturesEnabled rotategesturesenabled = (rotateGesturesEnabled) other;
        return this.AudioAttributesImplBaseParcelizer == rotategesturesenabled.AudioAttributesImplBaseParcelizer && this.MediaBrowserCompatItemReceiver == rotategesturesenabled.MediaBrowserCompatItemReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) rotategesturesenabled.write) && this.AudioAttributesCompatParcelizer == rotategesturesenabled.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, rotategesturesenabled.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, rotategesturesenabled.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, rotategesturesenabled.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, rotategesturesenabled.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) rotategesturesenabled.read) && this.AudioAttributesImplApi26Parcelizer == rotategesturesenabled.AudioAttributesImplApi26Parcelizer && this.MediaBrowserCompatCustomActionResultReceiver == rotategesturesenabled.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final int hashCode() {
        return (((((((((((((((((((Boolean.hashCode(this.AudioAttributesImplBaseParcelizer) * 31) + Boolean.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + this.write.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.MediaBrowserCompatSearchResultReceiver.hashCode()) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode();
    }

    public final String toString() {
        boolean z = this.AudioAttributesImplBaseParcelizer;
        boolean z2 = this.MediaBrowserCompatItemReceiver;
        String str = this.write;
        int i = this.AudioAttributesCompatParcelizer;
        Uri uri = this.IconCompatParcelizer;
        Uri uri2 = this.RemoteActionCompatParcelizer;
        Uri uri3 = this.MediaBrowserCompatSearchResultReceiver;
        Uri uri4 = this.AudioAttributesImplApi21Parcelizer;
        String str2 = this.read;
        int i2 = this.AudioAttributesImplApi26Parcelizer;
        minZoomPreference minzoompreference = this.MediaBrowserCompatCustomActionResultReceiver;
        StringBuilder sb = new StringBuilder("KycUploadUiState(isImagePickDialogShown=");
        sb.append(z);
        sb.append(", isDeleteImageDialogShown=");
        sb.append(z2);
        sb.append(", docTypeTitle=");
        sb.append(str);
        sb.append(", docType=");
        sb.append(i);
        sb.append(", frontImageUri=");
        sb.append(uri);
        sb.append(", backImageUri=");
        sb.append(uri2);
        sb.append(", tempImageUri=");
        sb.append(uri3);
        sb.append(", tempCameraUri=");
        sb.append(uri4);
        sb.append(", confirmUiTitle=");
        sb.append(str2);
        sb.append(", kycStatus=");
        sb.append(i2);
        sb.append(", screenType=");
        sb.append(minzoompreference);
        sb.append(")");
        return sb.toString();
    }
}
