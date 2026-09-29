package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class MimeTypesCustomMimeType extends getTopLevelType {
    private final int AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi21Parcelizer;
    private final String AudioAttributesImplApi26Parcelizer;
    private final List<String> AudioAttributesImplBaseParcelizer;
    private final String IconCompatParcelizer;
    private final String MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private final String MediaBrowserCompatMediaItem;
    private final boolean MediaBrowserCompatSearchResultReceiver;
    private final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final String MediaDescriptionCompat;
    private final String MediaMetadataCompat;
    private final getTrackTypeOfCodec RatingCompat;
    private final float RemoteActionCompatParcelizer;
    private final isText handleMediaPlayPauseIfPendingOnHandler;
    private final List<NalUnitUtil> onAddQueueItem;
    private final String onCommand;
    private final String onCustomAction;
    private final String onFastForward;
    private final String onMediaButtonEvent;
    private final String onPause;
    private final int onPlay;
    private final String onPlayFromMediaId;
    private final String onPrepareFromMediaId;
    private final boolean read;
    private final String write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MimeTypesCustomMimeType(String str, getTrackTypeOfCodec gettracktypeofcodec, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, isText istext, List<String> list, int i, String str10, String str11, int i2, boolean z, List<NalUnitUtil> list2, String str12, String str13, int i3, String str14, String str15, String str16, boolean z2, float f) {
        super(str, gettracktypeofcodec, str2, str3, str4, str5, str6, str7, str8, str9, istext, list, i);
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
        toMagicModuleMetaRepoModel.write(istext, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str10, "");
        toMagicModuleMetaRepoModel.write(str11, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(str12, "");
        toMagicModuleMetaRepoModel.write(str13, "");
        toMagicModuleMetaRepoModel.write(str14, "");
        toMagicModuleMetaRepoModel.write(str15, "");
        toMagicModuleMetaRepoModel.write(str16, "");
        this.MediaMetadataCompat = str;
        this.RatingCompat = gettracktypeofcodec;
        this.MediaBrowserCompatCustomActionResultReceiver = str2;
        this.onFastForward = str3;
        this.onPlayFromMediaId = str4;
        this.AudioAttributesImplApi26Parcelizer = str5;
        this.onMediaButtonEvent = str6;
        this.onCustomAction = str7;
        this.onPause = str8;
        this.MediaBrowserCompatMediaItem = str9;
        this.handleMediaPlayPauseIfPendingOnHandler = istext;
        this.AudioAttributesImplBaseParcelizer = list;
        this.onPlay = i;
        this.onCommand = str10;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = str11;
        this.AudioAttributesImplApi21Parcelizer = i2;
        this.MediaBrowserCompatSearchResultReceiver = z;
        this.onAddQueueItem = list2;
        this.MediaDescriptionCompat = str12;
        this.onPrepareFromMediaId = str13;
        this.AudioAttributesCompatParcelizer = i3;
        this.write = str14;
        this.MediaBrowserCompatItemReceiver = str15;
        this.IconCompatParcelizer = str16;
        this.read = z2;
        this.RemoteActionCompatParcelizer = f;
    }

    public final String onPlay() {
        return this.MediaMetadataCompat;
    }

    public final getTrackTypeOfCodec onMediaButtonEvent() {
        return this.RatingCompat;
    }

    public final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final String onRemoveQueueItem() {
        return this.onFastForward;
    }

    public final String onRemoveQueueItemAt() {
        return this.onPlayFromMediaId;
    }

    public final String onPause() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final String onSetShuffleMode() {
        return this.onMediaButtonEvent;
    }

    public final String onPlayFromSearch() {
        return this.onCustomAction;
    }

    public final String onSetPlaybackSpeed() {
        return this.onPause;
    }

    public final String onPlayFromMediaId() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final isText onPrepareFromSearch() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final List<String> onFastForward() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final int onRewind() {
        return this.onPlay;
    }

    public final String onSeekTo() {
        return this.onCommand;
    }

    public final String onPrepareFromUri() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final int onAddQueueItem() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final boolean onPlayFromUri() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final List<NalUnitUtil> onPrepare() {
        return this.onAddQueueItem;
    }

    public final String onPrepareFromMediaId() {
        return this.MediaDescriptionCompat;
    }

    public final String onSetCaptioningEnabled() {
        return this.onPrepareFromMediaId;
    }

    public final int handleMediaPlayPauseIfPendingOnHandler() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String MediaBrowserCompatMediaItem() {
        return this.write;
    }

    public final String onCustomAction() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final String onCommand() {
        return this.IconCompatParcelizer;
    }

    public final boolean onSetRating() {
        return this.read;
    }

    public final float MediaDescriptionCompat() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MimeTypesCustomMimeType)) {
            return false;
        }
        MimeTypesCustomMimeType mimeTypesCustomMimeType = (MimeTypesCustomMimeType) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaMetadataCompat, (Object) mimeTypesCustomMimeType.MediaMetadataCompat) && this.RatingCompat == mimeTypesCustomMimeType.RatingCompat && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatCustomActionResultReceiver, (Object) mimeTypesCustomMimeType.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onFastForward, (Object) mimeTypesCustomMimeType.onFastForward) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPlayFromMediaId, (Object) mimeTypesCustomMimeType.onPlayFromMediaId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) mimeTypesCustomMimeType.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onMediaButtonEvent, (Object) mimeTypesCustomMimeType.onMediaButtonEvent) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onCustomAction, (Object) mimeTypesCustomMimeType.onCustomAction) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPause, (Object) mimeTypesCustomMimeType.onPause) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatMediaItem, (Object) mimeTypesCustomMimeType.MediaBrowserCompatMediaItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, mimeTypesCustomMimeType.handleMediaPlayPauseIfPendingOnHandler) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, mimeTypesCustomMimeType.AudioAttributesImplBaseParcelizer) && this.onPlay == mimeTypesCustomMimeType.onPlay && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onCommand, (Object) mimeTypesCustomMimeType.onCommand) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, (Object) mimeTypesCustomMimeType.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && this.AudioAttributesImplApi21Parcelizer == mimeTypesCustomMimeType.AudioAttributesImplApi21Parcelizer && this.MediaBrowserCompatSearchResultReceiver == mimeTypesCustomMimeType.MediaBrowserCompatSearchResultReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onAddQueueItem, mimeTypesCustomMimeType.onAddQueueItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaDescriptionCompat, (Object) mimeTypesCustomMimeType.MediaDescriptionCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPrepareFromMediaId, (Object) mimeTypesCustomMimeType.onPrepareFromMediaId) && this.AudioAttributesCompatParcelizer == mimeTypesCustomMimeType.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) mimeTypesCustomMimeType.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatItemReceiver, (Object) mimeTypesCustomMimeType.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) mimeTypesCustomMimeType.IconCompatParcelizer) && this.read == mimeTypesCustomMimeType.read && Float.compare(this.RemoteActionCompatParcelizer, mimeTypesCustomMimeType.RemoteActionCompatParcelizer) == 0;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((this.MediaMetadataCompat.hashCode() * 31) + this.RatingCompat.hashCode()) * 31) + this.MediaBrowserCompatCustomActionResultReceiver.hashCode()) * 31) + this.onFastForward.hashCode()) * 31) + this.onPlayFromMediaId.hashCode()) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + this.onMediaButtonEvent.hashCode()) * 31) + this.onCustomAction.hashCode()) * 31) + this.onPause.hashCode()) * 31) + this.MediaBrowserCompatMediaItem.hashCode()) * 31) + this.handleMediaPlayPauseIfPendingOnHandler.hashCode()) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + Integer.hashCode(this.onPlay)) * 31) + this.onCommand.hashCode()) * 31) + this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Boolean.hashCode(this.MediaBrowserCompatSearchResultReceiver)) * 31) + this.onAddQueueItem.hashCode()) * 31) + this.MediaDescriptionCompat.hashCode()) * 31) + this.onPrepareFromMediaId.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + this.write.hashCode()) * 31) + this.MediaBrowserCompatItemReceiver.hashCode()) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.read)) * 31) + Float.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        String str = this.MediaMetadataCompat;
        getTrackTypeOfCodec gettracktypeofcodec = this.RatingCompat;
        String str2 = this.MediaBrowserCompatCustomActionResultReceiver;
        String str3 = this.onFastForward;
        String str4 = this.onPlayFromMediaId;
        String str5 = this.AudioAttributesImplApi26Parcelizer;
        String str6 = this.onMediaButtonEvent;
        String str7 = this.onCustomAction;
        String str8 = this.onPause;
        String str9 = this.MediaBrowserCompatMediaItem;
        isText istext = this.handleMediaPlayPauseIfPendingOnHandler;
        List<String> list = this.AudioAttributesImplBaseParcelizer;
        int i = this.onPlay;
        String str10 = this.onCommand;
        String str11 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i2 = this.AudioAttributesImplApi21Parcelizer;
        boolean z = this.MediaBrowserCompatSearchResultReceiver;
        List<NalUnitUtil> list2 = this.onAddQueueItem;
        String str12 = this.MediaDescriptionCompat;
        String str13 = this.onPrepareFromMediaId;
        int i3 = this.AudioAttributesCompatParcelizer;
        String str14 = this.write;
        String str15 = this.MediaBrowserCompatItemReceiver;
        String str16 = this.IconCompatParcelizer;
        boolean z2 = this.read;
        float f = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("McqFeatureCardUCModel(mcqId=");
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
        sb.append(istext);
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
