package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class unregisterConnectionFailedListener extends getApiFallbackAttributionTag {
    private final String AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final getTrackTypeOfCodec AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final boolean IconCompatParcelizer;
    private final List<String> MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final String MediaBrowserCompatMediaItem;
    private final GoogleApiSettingsBuilder MediaBrowserCompatSearchResultReceiver;
    private final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final String MediaDescriptionCompat;
    private final int MediaMetadataCompat;
    private final String RatingCompat;
    private final float RemoteActionCompatParcelizer;
    private final String handleMediaPlayPauseIfPendingOnHandler;
    private final String onAddQueueItem;
    private final boolean read;
    private final int write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public unregisterConnectionFailedListener(String str, getTrackTypeOfCodec gettracktypeofcodec, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, GoogleApiSettingsBuilder googleApiSettingsBuilder, List<String> list, int i, String str10, boolean z, boolean z2, float f, int i2) {
        super(str, gettracktypeofcodec, str2, str3, str4, str5, str6, str7, str8, str9, googleApiSettingsBuilder, list, i, 2);
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
        this.AudioAttributesImplApi21Parcelizer = str;
        this.AudioAttributesImplApi26Parcelizer = gettracktypeofcodec;
        this.AudioAttributesCompatParcelizer = str2;
        this.MediaBrowserCompatMediaItem = str3;
        this.RatingCompat = str4;
        this.MediaBrowserCompatItemReceiver = str5;
        this.handleMediaPlayPauseIfPendingOnHandler = str6;
        this.MediaDescriptionCompat = str7;
        this.onAddQueueItem = str8;
        this.AudioAttributesImplBaseParcelizer = str9;
        this.MediaBrowserCompatSearchResultReceiver = googleApiSettingsBuilder;
        this.MediaBrowserCompatCustomActionResultReceiver = list;
        this.MediaMetadataCompat = i;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = str10;
        this.IconCompatParcelizer = z;
        this.read = z2;
        this.RemoteActionCompatParcelizer = f;
        this.write = i2;
    }

    public final getTrackTypeOfCodec MediaBrowserCompatMediaItem() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final String AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String MediaMetadataCompat() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final String MediaBrowserCompatSearchResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final boolean RatingCompat() {
        return this.IconCompatParcelizer;
    }

    public final boolean MediaDescriptionCompat() {
        return this.read;
    }

    public final float MediaBrowserCompatItemReceiver() {
        return this.RemoteActionCompatParcelizer;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.write;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof unregisterConnectionFailedListener)) {
            return false;
        }
        unregisterConnectionFailedListener unregisterconnectionfailedlistener = (unregisterConnectionFailedListener) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) unregisterconnectionfailedlistener.AudioAttributesImplApi21Parcelizer) && this.AudioAttributesImplApi26Parcelizer == unregisterconnectionfailedlistener.AudioAttributesImplApi26Parcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) unregisterconnectionfailedlistener.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatMediaItem, (Object) unregisterconnectionfailedlistener.MediaBrowserCompatMediaItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RatingCompat, (Object) unregisterconnectionfailedlistener.RatingCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) unregisterconnectionfailedlistener.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.handleMediaPlayPauseIfPendingOnHandler, (Object) unregisterconnectionfailedlistener.handleMediaPlayPauseIfPendingOnHandler) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaDescriptionCompat, (Object) unregisterconnectionfailedlistener.MediaDescriptionCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onAddQueueItem, (Object) unregisterconnectionfailedlistener.onAddQueueItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) unregisterconnectionfailedlistener.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, unregisterconnectionfailedlistener.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, unregisterconnectionfailedlistener.MediaBrowserCompatCustomActionResultReceiver) && this.MediaMetadataCompat == unregisterconnectionfailedlistener.MediaMetadataCompat && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, (Object) unregisterconnectionfailedlistener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && this.IconCompatParcelizer == unregisterconnectionfailedlistener.IconCompatParcelizer && this.read == unregisterconnectionfailedlistener.read && Float.compare(this.RemoteActionCompatParcelizer, unregisterconnectionfailedlistener.RemoteActionCompatParcelizer) == 0 && this.write == unregisterconnectionfailedlistener.write;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((this.AudioAttributesImplApi21Parcelizer.hashCode() * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.MediaBrowserCompatMediaItem.hashCode()) * 31) + this.RatingCompat.hashCode()) * 31) + this.MediaBrowserCompatItemReceiver.hashCode()) * 31) + this.handleMediaPlayPauseIfPendingOnHandler.hashCode()) * 31) + this.MediaDescriptionCompat.hashCode()) * 31) + this.onAddQueueItem.hashCode()) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + this.MediaBrowserCompatSearchResultReceiver.hashCode()) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + Integer.hashCode(this.MediaMetadataCompat)) * 31) + this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.hashCode()) * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + Boolean.hashCode(this.read)) * 31) + Float.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Integer.hashCode(this.write);
    }

    public final String toString() {
        String str = this.AudioAttributesImplApi21Parcelizer;
        getTrackTypeOfCodec gettracktypeofcodec = this.AudioAttributesImplApi26Parcelizer;
        String str2 = this.AudioAttributesCompatParcelizer;
        String str3 = this.MediaBrowserCompatMediaItem;
        String str4 = this.RatingCompat;
        String str5 = this.MediaBrowserCompatItemReceiver;
        String str6 = this.handleMediaPlayPauseIfPendingOnHandler;
        String str7 = this.MediaDescriptionCompat;
        String str8 = this.onAddQueueItem;
        String str9 = this.AudioAttributesImplBaseParcelizer;
        GoogleApiSettingsBuilder googleApiSettingsBuilder = this.MediaBrowserCompatSearchResultReceiver;
        List<String> list = this.MediaBrowserCompatCustomActionResultReceiver;
        int i = this.MediaMetadataCompat;
        String str10 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        boolean z = this.IconCompatParcelizer;
        boolean z2 = this.read;
        float f = this.RemoteActionCompatParcelizer;
        int i2 = this.write;
        StringBuilder sb = new StringBuilder("VideoFeatureCardVMModel(videoId=");
        sb.append(str);
        sb.append(", videoContentType=");
        sb.append(gettracktypeofcodec);
        sb.append(", videoContentId=");
        sb.append(str2);
        sb.append(", videoSubContentId=");
        sb.append(str3);
        sb.append(", videoSubContentType=");
        sb.append(str4);
        sb.append(", videoContentTitle=");
        sb.append(str5);
        sb.append(", videoSubTitle=");
        sb.append(str6);
        sb.append(", videoPublishedStatus=");
        sb.append(str7);
        sb.append(", videoThumbnail=");
        sb.append(str8);
        sb.append(", videoCourseId=");
        sb.append(str9);
        sb.append(", videoLabel=");
        sb.append(googleApiSettingsBuilder);
        sb.append(", videoContentStepIds=");
        sb.append(list);
        sb.append(", videoSortOrder=");
        sb.append(i);
        sb.append(", videoSubjectTitle=");
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
