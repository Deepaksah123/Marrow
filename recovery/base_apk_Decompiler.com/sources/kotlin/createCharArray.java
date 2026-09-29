package kotlin;

import kotlin.Metadata;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b!\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Be\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0005HÆ\u0003Jg\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\u0005HÆ\u0001J\u0013\u0010$\u001a\u00020\u00052\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0010R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0012R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0012¨\u0006)"}, d2 = {"Lcom/marrow2/ui/onboarding/email/model/EmailSignInUiData;", "", "emailId", "", "emailButtonEnable", "", "emailPassword", "passwordButtonEnable", "emailOtp", "otpButtonEnable", "resendOtpTextTimer", "forgotPasswordEmail", "forgotPasswordButtonEnable", "<init>", "(Ljava/lang/String;ZLjava/lang/String;ZLjava/lang/String;ZLjava/lang/String;Ljava/lang/String;Z)V", "getEmailId", "()Ljava/lang/String;", "getEmailButtonEnable", "()Z", "getEmailPassword", "getPasswordButtonEnable", "getEmailOtp", "getOtpButtonEnable", "getResendOtpTextTimer", "getForgotPasswordEmail", "getForgotPasswordButtonEnable", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class createCharArray {
    private final boolean AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final String RemoteActionCompatParcelizer;
    private final boolean read;
    private final String write;

    private createCharArray(String str, boolean z, String str2, boolean z2, String str3, boolean z3, String str4, String str5, boolean z4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = z;
        this.write = str2;
        this.MediaBrowserCompatItemReceiver = z2;
        this.IconCompatParcelizer = str3;
        this.MediaBrowserCompatCustomActionResultReceiver = z3;
        this.AudioAttributesImplApi26Parcelizer = str4;
        this.AudioAttributesImplBaseParcelizer = str5;
        this.read = z4;
    }

    public /* synthetic */ createCharArray(String str, boolean z, String str2, boolean z2, String str3, boolean z3, String str4, String str5, boolean z4, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? false : z2, (i & 16) != 0 ? null : str3, (i & 32) != 0 ? false : z3, (i & 64) != 0 ? "" : str4, (i & 128) != 0 ? "" : str5, (i & 256) != 0 ? false : z4);
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final boolean getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final String getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public createCharArray() {
        this(null, false, null, false, null, false, null, null, false, UnixStat.DEFAULT_LINK_PERM, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static createCharArray read(String str, boolean z, String str2, boolean z2, String str3, boolean z3, String str4, String str5, boolean z4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        return new createCharArray(str, z, str2, z2, str3, z3, str4, str5, z4);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof createCharArray)) {
            return false;
        }
        createCharArray createchararray = (createCharArray) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) createchararray.RemoteActionCompatParcelizer) && this.AudioAttributesCompatParcelizer == createchararray.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) createchararray.write) && this.MediaBrowserCompatItemReceiver == createchararray.MediaBrowserCompatItemReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) createchararray.IconCompatParcelizer) && this.MediaBrowserCompatCustomActionResultReceiver == createchararray.MediaBrowserCompatCustomActionResultReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) createchararray.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) createchararray.AudioAttributesImplBaseParcelizer) && this.read == createchararray.read;
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = Boolean.hashCode(this.AudioAttributesCompatParcelizer);
        String str = this.write;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        int iHashCode4 = Boolean.hashCode(this.MediaBrowserCompatItemReceiver);
        String str2 = this.IconCompatParcelizer;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Boolean.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + Boolean.hashCode(this.read);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        boolean z = this.AudioAttributesCompatParcelizer;
        String str2 = this.write;
        boolean z2 = this.MediaBrowserCompatItemReceiver;
        String str3 = this.IconCompatParcelizer;
        boolean z3 = this.MediaBrowserCompatCustomActionResultReceiver;
        String str4 = this.AudioAttributesImplApi26Parcelizer;
        String str5 = this.AudioAttributesImplBaseParcelizer;
        boolean z4 = this.read;
        StringBuilder sb = new StringBuilder("EmailSignInUiData(emailId=");
        sb.append(str);
        sb.append(", emailButtonEnable=");
        sb.append(z);
        sb.append(", emailPassword=");
        sb.append(str2);
        sb.append(", passwordButtonEnable=");
        sb.append(z2);
        sb.append(", emailOtp=");
        sb.append(str3);
        sb.append(", otpButtonEnable=");
        sb.append(z3);
        sb.append(", resendOtpTextTimer=");
        sb.append(str4);
        sb.append(", forgotPasswordEmail=");
        sb.append(str5);
        sb.append(", forgotPasswordButtonEnable=");
        sb.append(z4);
        sb.append(")");
        return sb.toString();
    }
}
