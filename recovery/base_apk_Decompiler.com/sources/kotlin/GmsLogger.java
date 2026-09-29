package kotlin;

import com.google.android.exoplayer2.C;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010 \n\u0002\b&\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÓ\u0001\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\f\u0012\b\b\u0002\u0010\u0013\u001a\u00020\f\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010.\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010/\u001a\u00020\fHÆ\u0003J\t\u00100\u001a\u00020\fHÆ\u0003J\t\u00101\u001a\u00020\fHÆ\u0003J\t\u00102\u001a\u00020\fHÆ\u0003J\t\u00103\u001a\u00020\fHÆ\u0003J\t\u00104\u001a\u00020\fHÆ\u0003J\t\u00105\u001a\u00020\fHÆ\u0003J\t\u00106\u001a\u00020\fHÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u00108\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016HÆ\u0003JÕ\u0001\u00109\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000e\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\f2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\b\b\u0002\u0010\u0012\u001a\u00020\f2\b\b\u0002\u0010\u0013\u001a\u00020\f2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016HÆ\u0001J\u0013\u0010:\u001a\u00020\f2\b\u0010;\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010<\u001a\u00020=HÖ\u0001J\t\u0010>\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001aR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001aR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001aR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001aR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u001aR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001aR\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\"R\u0011\u0010\r\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\"R\u0011\u0010\u000e\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\"R\u0011\u0010\u000f\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\"R\u0011\u0010\u0010\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\"R\u0011\u0010\u0011\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\"R\u0011\u0010\u0012\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\"R\u0011\u0010\u0013\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\"R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\u001aR\u0017\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0011\u0010&\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b&\u0010\"¨\u0006?"}, d2 = {"Lcom/marrow2/ui/notespurchase/addressinput/AddressFormUiState;", "", "name", "", "phone", "alternatePhone", "addressLine1", "addressLine2", "addressLine3", NotesDispatchAddressRequestKt.KEY_CITY, "pinCode", "isNameValid", "", "isPhoneValid", "isAlternatePhoneValid", "isAddressLine1Valid", "isAddressLine2Valid", "isAddressLine3Valid", "isCityValid", "isPinCodeValid", "selectedState", "stateList", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLjava/lang/String;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getPhone", "getAlternatePhone", "getAddressLine1", "getAddressLine2", "getAddressLine3", "getCity", "getPinCode", "()Z", "getSelectedState", "getStateList", "()Ljava/util/List;", "isFormValid", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class GmsLogger {
    private final String AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi21Parcelizer;
    private final boolean AudioAttributesImplApi26Parcelizer;
    private final boolean AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final boolean MediaBrowserCompatMediaItem;
    private final String MediaBrowserCompatSearchResultReceiver;
    private final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final boolean MediaDescriptionCompat;
    private final boolean MediaMetadataCompat;
    private final String RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private final List<String> handleMediaPlayPauseIfPendingOnHandler;
    private final String onCommand;
    private final String read;
    private final String write;

    private GmsLogger(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str9, List<String> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.RatingCompat = str;
        this.MediaBrowserCompatSearchResultReceiver = str2;
        this.RemoteActionCompatParcelizer = str3;
        this.write = str4;
        this.IconCompatParcelizer = str5;
        this.read = str6;
        this.AudioAttributesCompatParcelizer = str7;
        this.onCommand = str8;
        this.MediaMetadataCompat = z;
        this.MediaDescriptionCompat = z2;
        this.MediaBrowserCompatItemReceiver = z3;
        this.AudioAttributesImplApi21Parcelizer = z4;
        this.AudioAttributesImplApi26Parcelizer = z5;
        this.MediaBrowserCompatCustomActionResultReceiver = z6;
        this.AudioAttributesImplBaseParcelizer = z7;
        this.MediaBrowserCompatMediaItem = z8;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = str9;
        this.handleMediaPlayPauseIfPendingOnHandler = list;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final String getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final String getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getOnCommand() {
        return this.onCommand;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final boolean getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final boolean getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final boolean getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
    public final boolean getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final String getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public /* synthetic */ GmsLogger(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str9, List list, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? null : str6, (i & 64) != 0 ? null : str7, (i & 128) != 0 ? null : str8, (i & 256) != 0 ? false : z, (i & 512) != 0 ? false : z2, (i & 1024) != 0 ? false : z3, (i & 2048) != 0 ? false : z4, (i & 4096) != 0 ? false : z5, (i & 8192) != 0 ? false : z6, (i & 16384) != 0 ? false : z7, (i & 32768) != 0 ? false : z8, (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? null : str9, (i & 131072) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list);
    }

    public final List<String> AudioAttributesImplBaseParcelizer() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final boolean MediaDescriptionCompat() {
        return this.MediaMetadataCompat && this.MediaDescriptionCompat && this.MediaBrowserCompatItemReceiver && this.AudioAttributesImplApi21Parcelizer && this.AudioAttributesImplApi26Parcelizer && this.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesImplBaseParcelizer && this.MediaBrowserCompatMediaItem && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != null;
    }

    public GmsLogger() {
        this(null, null, null, null, null, null, null, null, false, false, false, false, false, false, false, false, null, null, 262143, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static GmsLogger IconCompatParcelizer(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, String str9, List<String> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        return new GmsLogger(str, str2, str3, str4, str5, str6, str7, str8, z, z2, z3, z4, z5, z6, z7, z8, str9, list);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GmsLogger)) {
            return false;
        }
        GmsLogger gmsLogger = (GmsLogger) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RatingCompat, (Object) gmsLogger.RatingCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) gmsLogger.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) gmsLogger.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) gmsLogger.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) gmsLogger.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) gmsLogger.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) gmsLogger.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onCommand, (Object) gmsLogger.onCommand) && this.MediaMetadataCompat == gmsLogger.MediaMetadataCompat && this.MediaDescriptionCompat == gmsLogger.MediaDescriptionCompat && this.MediaBrowserCompatItemReceiver == gmsLogger.MediaBrowserCompatItemReceiver && this.AudioAttributesImplApi21Parcelizer == gmsLogger.AudioAttributesImplApi21Parcelizer && this.AudioAttributesImplApi26Parcelizer == gmsLogger.AudioAttributesImplApi26Parcelizer && this.MediaBrowserCompatCustomActionResultReceiver == gmsLogger.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesImplBaseParcelizer == gmsLogger.AudioAttributesImplBaseParcelizer && this.MediaBrowserCompatMediaItem == gmsLogger.MediaBrowserCompatMediaItem && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, (Object) gmsLogger.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, gmsLogger.handleMediaPlayPauseIfPendingOnHandler);
    }

    public final int hashCode() {
        String str = this.RatingCompat;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.MediaBrowserCompatSearchResultReceiver;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.RemoteActionCompatParcelizer;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.write;
        int iHashCode4 = str4 == null ? 0 : str4.hashCode();
        String str5 = this.IconCompatParcelizer;
        int iHashCode5 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.read;
        int iHashCode6 = str6 == null ? 0 : str6.hashCode();
        String str7 = this.AudioAttributesCompatParcelizer;
        int iHashCode7 = str7 == null ? 0 : str7.hashCode();
        String str8 = this.onCommand;
        int iHashCode8 = str8 == null ? 0 : str8.hashCode();
        int iHashCode9 = Boolean.hashCode(this.MediaMetadataCompat);
        int iHashCode10 = Boolean.hashCode(this.MediaDescriptionCompat);
        int iHashCode11 = Boolean.hashCode(this.MediaBrowserCompatItemReceiver);
        int iHashCode12 = Boolean.hashCode(this.AudioAttributesImplApi21Parcelizer);
        int iHashCode13 = Boolean.hashCode(this.AudioAttributesImplApi26Parcelizer);
        int iHashCode14 = Boolean.hashCode(this.MediaBrowserCompatCustomActionResultReceiver);
        int iHashCode15 = Boolean.hashCode(this.AudioAttributesImplBaseParcelizer);
        int iHashCode16 = Boolean.hashCode(this.MediaBrowserCompatMediaItem);
        String str9 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        return (((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + (str9 != null ? str9.hashCode() : 0)) * 31) + this.handleMediaPlayPauseIfPendingOnHandler.hashCode();
    }

    public final String toString() {
        String str = this.RatingCompat;
        String str2 = this.MediaBrowserCompatSearchResultReceiver;
        String str3 = this.RemoteActionCompatParcelizer;
        String str4 = this.write;
        String str5 = this.IconCompatParcelizer;
        String str6 = this.read;
        String str7 = this.AudioAttributesCompatParcelizer;
        String str8 = this.onCommand;
        boolean z = this.MediaMetadataCompat;
        boolean z2 = this.MediaDescriptionCompat;
        boolean z3 = this.MediaBrowserCompatItemReceiver;
        boolean z4 = this.AudioAttributesImplApi21Parcelizer;
        boolean z5 = this.AudioAttributesImplApi26Parcelizer;
        boolean z6 = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean z7 = this.AudioAttributesImplBaseParcelizer;
        boolean z8 = this.MediaBrowserCompatMediaItem;
        String str9 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        List<String> list = this.handleMediaPlayPauseIfPendingOnHandler;
        StringBuilder sb = new StringBuilder("AddressFormUiState(name=");
        sb.append(str);
        sb.append(", phone=");
        sb.append(str2);
        sb.append(", alternatePhone=");
        sb.append(str3);
        sb.append(", addressLine1=");
        sb.append(str4);
        sb.append(", addressLine2=");
        sb.append(str5);
        sb.append(", addressLine3=");
        sb.append(str6);
        sb.append(", city=");
        sb.append(str7);
        sb.append(", pinCode=");
        sb.append(str8);
        sb.append(", isNameValid=");
        sb.append(z);
        sb.append(", isPhoneValid=");
        sb.append(z2);
        sb.append(", isAlternatePhoneValid=");
        sb.append(z3);
        sb.append(", isAddressLine1Valid=");
        sb.append(z4);
        sb.append(", isAddressLine2Valid=");
        sb.append(z5);
        sb.append(", isAddressLine3Valid=");
        sb.append(z6);
        sb.append(", isCityValid=");
        sb.append(z7);
        sb.append(", isPinCodeValid=");
        sb.append(z8);
        sb.append(", selectedState=");
        sb.append(str9);
        sb.append(", stateList=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
