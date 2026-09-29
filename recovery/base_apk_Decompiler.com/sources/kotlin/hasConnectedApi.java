package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class hasConnectedApi extends getApiFallbackAttributionTag {
    private final List<String> AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final getTrackTypeOfCodec AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final GoogleApiSettingsBuilder MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final String MediaBrowserCompatMediaItem;
    private final String MediaBrowserCompatSearchResultReceiver;
    private final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final int MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final String RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private final String handleMediaPlayPauseIfPendingOnHandler;
    private final float onCustomAction;
    private final boolean read;
    private final boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hasConnectedApi(String str, getTrackTypeOfCodec gettracktypeofcodec, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, GoogleApiSettingsBuilder googleApiSettingsBuilder, List<String> list, int i, String str10, boolean z, boolean z2, float f, int i2) {
        super(str, gettracktypeofcodec, str2, str3, str4, str5, str6, str7, str8, str9, googleApiSettingsBuilder, list, i, 1);
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(gettracktypeofcodec, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        toMagicModuleMetaRepoModel.write(str8, "");
        toMagicModuleMetaRepoModel.write(str9, "");
        toMagicModuleMetaRepoModel.write(googleApiSettingsBuilder, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str10, "");
        this.AudioAttributesImplApi26Parcelizer = str;
        this.AudioAttributesImplBaseParcelizer = gettracktypeofcodec;
        this.RemoteActionCompatParcelizer = str2;
        this.MediaBrowserCompatMediaItem = str3;
        this.MediaMetadataCompat = str4;
        this.IconCompatParcelizer = str5;
        this.MediaBrowserCompatSearchResultReceiver = str6;
        this.MediaBrowserCompatItemReceiver = str7;
        this.handleMediaPlayPauseIfPendingOnHandler = str8;
        this.AudioAttributesImplApi21Parcelizer = str9;
        this.MediaBrowserCompatCustomActionResultReceiver = googleApiSettingsBuilder;
        this.AudioAttributesCompatParcelizer = list;
        this.MediaDescriptionCompat = i;
        this.RatingCompat = str10;
        this.write = z;
        this.read = z2;
        this.onCustomAction = f;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i2;
    }

    public final getTrackTypeOfCodec MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String AudioAttributesImplBaseParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final String MediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final String MediaDescriptionCompat() {
        return this.RatingCompat;
    }

    public final boolean MediaMetadataCompat() {
        return this.write;
    }

    public final boolean onCustomAction() {
        return this.read;
    }

    public final float RatingCompat() {
        return this.onCustomAction;
    }

    public final int MediaBrowserCompatMediaItem() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hasConnectedApi)) {
            return false;
        }
        hasConnectedApi hasconnectedapi = (hasConnectedApi) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) hasconnectedapi.AudioAttributesImplApi26Parcelizer) && this.AudioAttributesImplBaseParcelizer == hasconnectedapi.AudioAttributesImplBaseParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) hasconnectedapi.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatMediaItem, (Object) hasconnectedapi.MediaBrowserCompatMediaItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaMetadataCompat, (Object) hasconnectedapi.MediaMetadataCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) hasconnectedapi.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) hasconnectedapi.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) hasconnectedapi.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.handleMediaPlayPauseIfPendingOnHandler, (Object) hasconnectedapi.handleMediaPlayPauseIfPendingOnHandler) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) hasconnectedapi.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, hasconnectedapi.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, hasconnectedapi.AudioAttributesCompatParcelizer) && this.MediaDescriptionCompat == hasconnectedapi.MediaDescriptionCompat && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RatingCompat, (Object) hasconnectedapi.RatingCompat) && this.write == hasconnectedapi.write && this.read == hasconnectedapi.read && Float.compare(this.onCustomAction, hasconnectedapi.onCustomAction) == 0 && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == hasconnectedapi.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((this.AudioAttributesImplApi26Parcelizer.hashCode() * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + this.MediaBrowserCompatMediaItem.hashCode()) * 31) + this.MediaMetadataCompat.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.MediaBrowserCompatSearchResultReceiver.hashCode()) * 31) + this.MediaBrowserCompatItemReceiver.hashCode()) * 31) + this.handleMediaPlayPauseIfPendingOnHandler.hashCode()) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.MediaDescriptionCompat)) * 31) + this.RatingCompat.hashCode()) * 31) + Boolean.hashCode(this.write)) * 31) + Boolean.hashCode(this.read)) * 31) + Float.hashCode(this.onCustomAction)) * 31) + Integer.hashCode(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
    }

    public final String toString() {
        String str = this.AudioAttributesImplApi26Parcelizer;
        getTrackTypeOfCodec gettracktypeofcodec = this.AudioAttributesImplBaseParcelizer;
        String str2 = this.RemoteActionCompatParcelizer;
        String str3 = this.MediaBrowserCompatMediaItem;
        String str4 = this.MediaMetadataCompat;
        String str5 = this.IconCompatParcelizer;
        String str6 = this.MediaBrowserCompatSearchResultReceiver;
        String str7 = this.MediaBrowserCompatItemReceiver;
        String str8 = this.handleMediaPlayPauseIfPendingOnHandler;
        String str9 = this.AudioAttributesImplApi21Parcelizer;
        GoogleApiSettingsBuilder googleApiSettingsBuilder = this.MediaBrowserCompatCustomActionResultReceiver;
        List<String> list = this.AudioAttributesCompatParcelizer;
        int i = this.MediaDescriptionCompat;
        String str10 = this.RatingCompat;
        boolean z = this.write;
        boolean z2 = this.read;
        float f = this.onCustomAction;
        int i2 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        StringBuilder sb = new StringBuilder("QBankFeatureCardVMModel(qBankId=");
        sb.append(str);
        sb.append(", qBankContentType=");
        sb.append(gettracktypeofcodec);
        sb.append(", qBankContentId=");
        sb.append(str2);
        sb.append(", qBankSubContentId=");
        sb.append(str3);
        sb.append(", qBankSubContentType=");
        sb.append(str4);
        sb.append(", qBankContentTitle=");
        sb.append(str5);
        sb.append(", qBankSubTitle=");
        sb.append(str6);
        sb.append(", qBankPublishedStatus=");
        sb.append(str7);
        sb.append(", qBankThumbnail=");
        sb.append(str8);
        sb.append(", qBankCourseId=");
        sb.append(str9);
        sb.append(", qBankLabel=");
        sb.append(googleApiSettingsBuilder);
        sb.append(", qBankContentStepIds=");
        sb.append(list);
        sb.append(", qBankSortOrder=");
        sb.append(i);
        sb.append(", qBankSubjectTitle=");
        sb.append(str10);
        sb.append(", isLockVisible=");
        sb.append(z);
        sb.append(", isProVisible=");
        sb.append(z2);
        sb.append(", rating=");
        sb.append(f);
        sb.append(", status=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
