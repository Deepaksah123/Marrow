package kotlin;

import android.net.Uri;
import kotlin.Metadata;
import kotlin.setOnMarkerDragListener;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\b\b\u0002\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0007HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\t\u0010!\u001a\u00020\u000bHÆ\u0003J\t\u0010\"\u001a\u00020\rHÆ\u0003JO\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\rHÆ\u0001J\u0013\u0010$\u001a\u00020\u000b2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\tHÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006("}, d2 = {"Lcom/marrow2/ui/settings/kyc/name/KycNameUiState;", "", "docType", "", "userName", "confirmedUserName", "frontImageUri", "Landroid/net/Uri;", "kycStatus", "", "showConfirmationDialog", "", "kycNavigationEvent", "Lcom/marrow2/ui/settings/kyc/name/KycNameConfirmationNavigateUiState;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/net/Uri;IZLcom/marrow2/ui/settings/kyc/name/KycNameConfirmationNavigateUiState;)V", "getDocType", "()Ljava/lang/String;", "getUserName", "getConfirmedUserName", "getFrontImageUri", "()Landroid/net/Uri;", "getKycStatus", "()I", "getShowConfirmationDialog", "()Z", "getKycNavigationEvent", "()Lcom/marrow2/ui/settings/kyc/name/KycNameConfirmationNavigateUiState;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setOnPolygonClickListener {
    private final int AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final boolean AudioAttributesImplApi26Parcelizer;
    private final String IconCompatParcelizer;
    private final setOnMarkerDragListener RemoteActionCompatParcelizer;
    private final Uri read;
    private final String write;

    private setOnPolygonClickListener(String str, String str2, String str3, Uri uri, int i, boolean z, setOnMarkerDragListener setonmarkerdraglistener) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(uri, "");
        toMagicModuleMetaRepoModel.write(setonmarkerdraglistener, "");
        this.write = str;
        this.AudioAttributesImplApi21Parcelizer = str2;
        this.IconCompatParcelizer = str3;
        this.read = uri;
        this.AudioAttributesCompatParcelizer = i;
        this.AudioAttributesImplApi26Parcelizer = z;
        this.RemoteActionCompatParcelizer = setonmarkerdraglistener;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ setOnPolygonClickListener(String str, String str2, String str3, Uri uri, int i, boolean z, setOnMarkerDragListener.IconCompatParcelizer iconCompatParcelizer, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        str = (i2 & 1) != 0 ? "" : str;
        str2 = (i2 & 2) != 0 ? "" : str2;
        str3 = (i2 & 4) != 0 ? "" : str3;
        if ((i2 & 8) != 0) {
            uri = Uri.EMPTY;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uri, "");
        }
        this(str, str2, str3, uri, (i2 & 16) != 0 ? 1 : i, (i2 & 32) != 0 ? false : z, (i2 & 64) != 0 ? setOnMarkerDragListener.IconCompatParcelizer.INSTANCE : iconCompatParcelizer);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final Uri getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final boolean getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final setOnMarkerDragListener getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public setOnPolygonClickListener() {
        this(null, null, null, null, 0, false, null, 127, null);
    }

    public static /* synthetic */ setOnPolygonClickListener read(setOnPolygonClickListener setonpolygonclicklistener, String str, String str2, String str3, Uri uri, int i, boolean z, setOnMarkerDragListener setonmarkerdraglistener, int i2) {
        if ((i2 & 1) != 0) {
            str = setonpolygonclicklistener.write;
        }
        if ((i2 & 2) != 0) {
            str2 = setonpolygonclicklistener.AudioAttributesImplApi21Parcelizer;
        }
        String str4 = str2;
        if ((i2 & 4) != 0) {
            str3 = setonpolygonclicklistener.IconCompatParcelizer;
        }
        String str5 = str3;
        if ((i2 & 8) != 0) {
            uri = setonpolygonclicklistener.read;
        }
        Uri uri2 = uri;
        if ((i2 & 16) != 0) {
            i = setonpolygonclicklistener.AudioAttributesCompatParcelizer;
        }
        int i3 = i;
        if ((i2 & 32) != 0) {
            z = setonpolygonclicklistener.AudioAttributesImplApi26Parcelizer;
        }
        boolean z2 = z;
        if ((i2 & 64) != 0) {
            setonmarkerdraglistener = setonpolygonclicklistener.RemoteActionCompatParcelizer;
        }
        return write(str, str4, str5, uri2, i3, z2, setonmarkerdraglistener);
    }

    private static setOnPolygonClickListener write(String str, String str2, String str3, Uri uri, int i, boolean z, setOnMarkerDragListener setonmarkerdraglistener) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(uri, "");
        toMagicModuleMetaRepoModel.write(setonmarkerdraglistener, "");
        return new setOnPolygonClickListener(str, str2, str3, uri, i, z, setonmarkerdraglistener);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof setOnPolygonClickListener)) {
            return false;
        }
        setOnPolygonClickListener setonpolygonclicklistener = (setOnPolygonClickListener) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) setonpolygonclicklistener.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) setonpolygonclicklistener.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) setonpolygonclicklistener.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, setonpolygonclicklistener.read) && this.AudioAttributesCompatParcelizer == setonpolygonclicklistener.AudioAttributesCompatParcelizer && this.AudioAttributesImplApi26Parcelizer == setonpolygonclicklistener.AudioAttributesImplApi26Parcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, setonpolygonclicklistener.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (((((((((((this.write.hashCode() * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.AudioAttributesImplApi21Parcelizer;
        String str3 = this.IconCompatParcelizer;
        Uri uri = this.read;
        int i = this.AudioAttributesCompatParcelizer;
        boolean z = this.AudioAttributesImplApi26Parcelizer;
        setOnMarkerDragListener setonmarkerdraglistener = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("KycNameUiState(docType=");
        sb.append(str);
        sb.append(", userName=");
        sb.append(str2);
        sb.append(", confirmedUserName=");
        sb.append(str3);
        sb.append(", frontImageUri=");
        sb.append(uri);
        sb.append(", kycStatus=");
        sb.append(i);
        sb.append(", showConfirmationDialog=");
        sb.append(z);
        sb.append(", kycNavigationEvent=");
        sb.append(setonmarkerdraglistener);
        sb.append(")");
        return sb.toString();
    }
}
