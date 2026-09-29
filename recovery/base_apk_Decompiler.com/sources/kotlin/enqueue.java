package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class enqueue extends getApiFallbackAttributionTag {
    private final String AudioAttributesCompatParcelizer;
    private final List<String> AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplApi26Parcelizer;
    private final String AudioAttributesImplBaseParcelizer;
    private final boolean IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final getTrackTypeOfCodec MediaBrowserCompatMediaItem;
    private final String MediaBrowserCompatSearchResultReceiver;
    private final List<GoogleApiClient> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final String MediaDescriptionCompat;
    private final boolean MediaMetadataCompat;
    private final String RatingCompat;
    private final String RemoteActionCompatParcelizer;
    private final String handleMediaPlayPauseIfPendingOnHandler;
    private final String onAddQueueItem;
    private final GoogleApiSettingsBuilder onCommand;
    private final String onCustomAction;
    private final String onFastForward;
    private final String onMediaButtonEvent;
    private final String onPause;
    private final int onPlay;
    private final String onPlayFromMediaId;
    private final String onPrepareFromMediaId;
    private final int read;
    private final float write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enqueue(String str, getTrackTypeOfCodec gettracktypeofcodec, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, GoogleApiSettingsBuilder googleApiSettingsBuilder, List<String> list, int i, String str10, String str11, int i2, boolean z, List<GoogleApiClient> list2, String str12, String str13, int i3, String str14, String str15, String str16, boolean z2, float f) {
        super(str, gettracktypeofcodec, str2, str3, str4, str5, str6, str7, str8, str9, googleApiSettingsBuilder, list, i, 6);
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
        toMagicModuleMetaRepoModel.write(str11, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(str12, "");
        toMagicModuleMetaRepoModel.write(str13, "");
        toMagicModuleMetaRepoModel.write(str14, "");
        toMagicModuleMetaRepoModel.write(str15, "");
        toMagicModuleMetaRepoModel.write(str16, "");
        this.RatingCompat = str;
        this.MediaBrowserCompatMediaItem = gettracktypeofcodec;
        this.MediaBrowserCompatCustomActionResultReceiver = str2;
        this.onMediaButtonEvent = str3;
        this.onPause = str4;
        this.AudioAttributesImplBaseParcelizer = str5;
        this.onFastForward = str6;
        this.onCustomAction = str7;
        this.onPlayFromMediaId = str8;
        this.MediaBrowserCompatSearchResultReceiver = str9;
        this.onCommand = googleApiSettingsBuilder;
        this.AudioAttributesImplApi21Parcelizer = list;
        this.onPlay = i;
        this.onAddQueueItem = str10;
        this.handleMediaPlayPauseIfPendingOnHandler = str11;
        this.AudioAttributesImplApi26Parcelizer = i2;
        this.MediaMetadataCompat = z;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = list2;
        this.MediaDescriptionCompat = str12;
        this.onPrepareFromMediaId = str13;
        this.read = i3;
        this.AudioAttributesCompatParcelizer = str14;
        this.MediaBrowserCompatItemReceiver = str15;
        this.RemoteActionCompatParcelizer = str16;
        this.IconCompatParcelizer = z2;
        this.write = f;
    }

    public final String RatingCompat() {
        return this.RatingCompat;
    }

    public final String MediaDescriptionCompat() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final String onPlayFromMediaId() {
        return this.onMediaButtonEvent;
    }

    public final String onMediaButtonEvent() {
        return this.onPlayFromMediaId;
    }

    public final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.onAddQueueItem;
    }

    public final String onAddQueueItem() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final int MediaMetadataCompat() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final boolean onCommand() {
        return this.MediaMetadataCompat;
    }

    public final List<GoogleApiClient> onCustomAction() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final String handleMediaPlayPauseIfPendingOnHandler() {
        return this.MediaDescriptionCompat;
    }

    public final String onFastForward() {
        return this.onPrepareFromMediaId;
    }

    public final int MediaBrowserCompatSearchResultReceiver() {
        return this.read;
    }

    public final String AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final String MediaBrowserCompatItemReceiver() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean onPlay() {
        return this.IconCompatParcelizer;
    }

    public final float AudioAttributesImplApi21Parcelizer() {
        return this.write;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static enqueue IconCompatParcelizer(String str, getTrackTypeOfCodec gettracktypeofcodec, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, GoogleApiSettingsBuilder googleApiSettingsBuilder, List<String> list, int i, String str10, String str11, int i2, boolean z, List<GoogleApiClient> list2, String str12, String str13, int i3, String str14, String str15, String str16, boolean z2, float f) {
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
        toMagicModuleMetaRepoModel.write(str11, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(str12, "");
        toMagicModuleMetaRepoModel.write(str13, "");
        toMagicModuleMetaRepoModel.write(str14, "");
        toMagicModuleMetaRepoModel.write(str15, "");
        toMagicModuleMetaRepoModel.write(str16, "");
        return new enqueue(str, gettracktypeofcodec, str2, str3, str4, str5, str6, str7, str8, str9, googleApiSettingsBuilder, list, i, str10, str11, i2, true, list2, str12, str13, i3, str14, str15, str16, z2, f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enqueue)) {
            return false;
        }
        enqueue enqueueVar = (enqueue) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RatingCompat, (Object) enqueueVar.RatingCompat) && this.MediaBrowserCompatMediaItem == enqueueVar.MediaBrowserCompatMediaItem && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) enqueueVar.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onMediaButtonEvent, (Object) enqueueVar.onMediaButtonEvent) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPause, (Object) enqueueVar.onPause) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) enqueueVar.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onFastForward, (Object) enqueueVar.onFastForward) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onCustomAction, (Object) enqueueVar.onCustomAction) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPlayFromMediaId, (Object) enqueueVar.onPlayFromMediaId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) enqueueVar.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onCommand, enqueueVar.onCommand) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, enqueueVar.AudioAttributesImplApi21Parcelizer) && this.onPlay == enqueueVar.onPlay && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onAddQueueItem, (Object) enqueueVar.onAddQueueItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.handleMediaPlayPauseIfPendingOnHandler, (Object) enqueueVar.handleMediaPlayPauseIfPendingOnHandler) && this.AudioAttributesImplApi26Parcelizer == enqueueVar.AudioAttributesImplApi26Parcelizer && this.MediaMetadataCompat == enqueueVar.MediaMetadataCompat && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, enqueueVar.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaDescriptionCompat, (Object) enqueueVar.MediaDescriptionCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPrepareFromMediaId, (Object) enqueueVar.onPrepareFromMediaId) && this.read == enqueueVar.read && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) enqueueVar.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) enqueueVar.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) enqueueVar.RemoteActionCompatParcelizer) && this.IconCompatParcelizer == enqueueVar.IconCompatParcelizer && Float.compare(this.write, enqueueVar.write) == 0;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((this.RatingCompat.hashCode() * 31) + this.MediaBrowserCompatMediaItem.hashCode()) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + this.onMediaButtonEvent.hashCode()) * 31) + this.onPause.hashCode()) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + this.onFastForward.hashCode()) * 31) + this.onCustomAction.hashCode()) * 31) + this.onPlayFromMediaId.hashCode()) * 31) + this.MediaBrowserCompatSearchResultReceiver.hashCode()) * 31) + this.onCommand.hashCode()) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + Integer.hashCode(this.onPlay)) * 31) + this.onAddQueueItem.hashCode()) * 31) + this.handleMediaPlayPauseIfPendingOnHandler.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + Boolean.hashCode(this.MediaMetadataCompat)) * 31) + this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.hashCode()) * 31) + this.MediaDescriptionCompat.hashCode()) * 31) + this.onPrepareFromMediaId.hashCode()) * 31) + Integer.hashCode(this.read)) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.MediaBrowserCompatItemReceiver.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + Float.hashCode(this.write);
    }

    public final String toString() {
        String str = this.RatingCompat;
        getTrackTypeOfCodec gettracktypeofcodec = this.MediaBrowserCompatMediaItem;
        String str2 = this.MediaBrowserCompatCustomActionResultReceiver;
        String str3 = this.onMediaButtonEvent;
        String str4 = this.onPause;
        String str5 = this.AudioAttributesImplBaseParcelizer;
        String str6 = this.onFastForward;
        String str7 = this.onCustomAction;
        String str8 = this.onPlayFromMediaId;
        String str9 = this.MediaBrowserCompatSearchResultReceiver;
        GoogleApiSettingsBuilder googleApiSettingsBuilder = this.onCommand;
        List<String> list = this.AudioAttributesImplApi21Parcelizer;
        int i = this.onPlay;
        String str10 = this.onAddQueueItem;
        String str11 = this.handleMediaPlayPauseIfPendingOnHandler;
        int i2 = this.AudioAttributesImplApi26Parcelizer;
        boolean z = this.MediaMetadataCompat;
        List<GoogleApiClient> list2 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        String str12 = this.MediaDescriptionCompat;
        String str13 = this.onPrepareFromMediaId;
        int i3 = this.read;
        String str14 = this.AudioAttributesCompatParcelizer;
        String str15 = this.MediaBrowserCompatItemReceiver;
        String str16 = this.RemoteActionCompatParcelizer;
        boolean z2 = this.IconCompatParcelizer;
        float f = this.write;
        StringBuilder sb = new StringBuilder("McqFeatureCardVMModel(mcqId=");
        sb.append(str);
        sb.append(", mcqContentType=");
        sb.append(gettracktypeofcodec);
        sb.append(", mcqContentId=");
        sb.append(str2);
        sb.append(", mcqSubContentId=");
        sb.append(str3);
        sb.append(", mcqSubContentType=");
        sb.append(str4);
        sb.append(", mcqContentTitle=");
        sb.append(str5);
        sb.append(", mcqSubTitle=");
        sb.append(str6);
        sb.append(", mcqPublishedStatus=");
        sb.append(str7);
        sb.append(", mcqThumbnail=");
        sb.append(str8);
        sb.append(", mcqCourseId=");
        sb.append(str9);
        sb.append(", mcqLabel=");
        sb.append(googleApiSettingsBuilder);
        sb.append(", mcqContentStepIds=");
        sb.append(list);
        sb.append(", mcqSortOrder=");
        sb.append(i);
        sb.append(", mcqQuestion=");
        sb.append(str10);
        sb.append(", mcqQuestionDescription=");
        sb.append(str11);
        sb.append(", mcqAnswer=");
        sb.append(i2);
        sb.append(", mcqIsAnswered=");
        sb.append(z);
        sb.append(", mcqOptions=");
        sb.append(list2);
        sb.append(", mcqImage=");
        sb.append(str12);
        sb.append(", subjectTitle=");
        sb.append(str13);
        sb.append(", lessonNumber=");
        sb.append(i3);
        sb.append(", lessonId=");
        sb.append(str14);
        sb.append(", lessonTitle=");
        sb.append(str15);
        sb.append(", lessonImage=");
        sb.append(str16);
        sb.append(", isVibrationEnable=");
        sb.append(z2);
        sb.append(", aspectRatio=");
        sb.append(f);
        sb.append(")");
        return sb.toString();
    }
}
