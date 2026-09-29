package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class isNalUnitSei extends getTopLevelType {
    private final boolean AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi21Parcelizer;
    private final boolean AudioAttributesImplApi26Parcelizer;
    private final boolean AudioAttributesImplBaseParcelizer;
    private final boolean IconCompatParcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final long MediaBrowserCompatMediaItem;
    private final String MediaBrowserCompatSearchResultReceiver;
    private final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final String MediaDescriptionCompat;
    private final List<String> MediaMetadataCompat;
    private final String RatingCompat;
    private final boolean RemoteActionCompatParcelizer;
    private final String handleMediaPlayPauseIfPendingOnHandler;
    private final getTrackTypeOfCodec onAddQueueItem;
    private final long onCommand;
    private final int onCustomAction;
    private final String onFastForward;
    private final int onMediaButtonEvent;
    private final isText onPause;
    private final reconnect onPlay;
    private final String onPlayFromMediaId;
    private final String onPlayFromSearch;
    private final String onPlayFromUri;
    private final int onPrepare;
    private final String onPrepareFromMediaId;
    private final long onPrepareFromSearch;
    private final long onPrepareFromUri;
    private final String onRemoveQueueItem;
    private final long onRemoveQueueItemAt;
    private final String onRewind;
    private final String onSeekTo;
    private final boolean read;
    private final getContextAttributionTag write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public isNalUnitSei(String str, getTrackTypeOfCodec gettracktypeofcodec, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, isText istext, List<String> list, int i, String str10, String str11, String str12, String str13, long j, reconnect reconnectVar, getContextAttributionTag getcontextattributiontag, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, long j2, long j3, int i2, long j4, long j5, int i3) {
        super(str10, gettracktypeofcodec, str2, str3, str4, str5, str6, str7, str8, str9, istext, list, i);
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
        toMagicModuleMetaRepoModel.write(str12, "");
        toMagicModuleMetaRepoModel.write(str13, "");
        toMagicModuleMetaRepoModel.write(reconnectVar, "");
        toMagicModuleMetaRepoModel.write(getcontextattributiontag, "");
        this.handleMediaPlayPauseIfPendingOnHandler = str;
        this.onAddQueueItem = gettracktypeofcodec;
        this.MediaBrowserCompatSearchResultReceiver = str2;
        this.onPrepareFromMediaId = str3;
        this.onPlayFromSearch = str4;
        this.MediaDescriptionCompat = str5;
        this.onPlayFromUri = str6;
        this.onPlayFromMediaId = str7;
        this.onSeekTo = str8;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = str9;
        this.onPause = istext;
        this.MediaMetadataCompat = list;
        this.onMediaButtonEvent = i;
        this.onFastForward = str10;
        this.onRemoveQueueItem = str11;
        this.RatingCompat = str12;
        this.onRewind = str13;
        this.onRemoveQueueItemAt = j;
        this.onPlay = reconnectVar;
        this.write = getcontextattributiontag;
        this.RemoteActionCompatParcelizer = z;
        this.MediaBrowserCompatItemReceiver = z2;
        this.AudioAttributesCompatParcelizer = z3;
        this.IconCompatParcelizer = z4;
        this.MediaBrowserCompatCustomActionResultReceiver = z5;
        this.read = z6;
        this.AudioAttributesImplBaseParcelizer = z7;
        this.AudioAttributesImplApi21Parcelizer = z8;
        this.AudioAttributesImplApi26Parcelizer = z9;
        this.onPrepareFromSearch = j2;
        this.onCommand = j3;
        this.onPrepare = i2;
        this.onPrepareFromUri = j4;
        this.MediaBrowserCompatMediaItem = j5;
        this.onCustomAction = i3;
    }

    public final String onFastForward() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final getTrackTypeOfCodec onAddQueueItem() {
        return this.onAddQueueItem;
    }

    public final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final String onRemoveQueueItem() {
        return this.onPrepareFromMediaId;
    }

    public final String onPrepareFromUri() {
        return this.onPlayFromSearch;
    }

    public final String onCustomAction() {
        return this.MediaDescriptionCompat;
    }

    public final String onSeekTo() {
        return this.onPlayFromUri;
    }

    public final String onPrepareFromSearch() {
        return this.onPlayFromMediaId;
    }

    public final String onRewind() {
        return this.onSeekTo;
    }

    public final String onPause() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final isText onPrepareFromMediaId() {
        return this.onPause;
    }

    public final List<String> handleMediaPlayPauseIfPendingOnHandler() {
        return this.MediaMetadataCompat;
    }

    public final int onPrepare() {
        return this.onMediaButtonEvent;
    }

    public final String onSetRating() {
        return this.onRemoveQueueItem;
    }

    public final String MediaDescriptionCompat() {
        return this.RatingCompat;
    }

    public final String onSetPlaybackSpeed() {
        return this.onRewind;
    }

    public final long onSetRepeatMode() {
        return this.onRemoveQueueItemAt;
    }

    public final reconnect onPlay() {
        return this.onPlay;
    }

    public final getContextAttributionTag MediaBrowserCompatMediaItem() {
        return this.write;
    }

    public final boolean onSkipToQueueItem() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean setSessionImpl() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final boolean onSetShuffleMode() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean onSkipToPrevious() {
        return this.IconCompatParcelizer;
    }

    public final boolean onStop() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final boolean onSetCaptioningEnabled() {
        return this.read;
    }

    public final boolean MediaSessionCompatResultReceiverWrapper() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final boolean ParcelableVolumeInfo() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final boolean onSkipToNext() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final long onPlayFromSearch() {
        return this.onPrepareFromSearch;
    }

    public final long onPlayFromMediaId() {
        return this.onCommand;
    }

    public final int onPlayFromUri() {
        return this.onPrepare;
    }

    public final long onRemoveQueueItemAt() {
        return this.onPrepareFromUri;
    }

    public final long onCommand() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final int onMediaButtonEvent() {
        return this.onCustomAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof isNalUnitSei)) {
            return false;
        }
        isNalUnitSei isnalunitsei = (isNalUnitSei) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.handleMediaPlayPauseIfPendingOnHandler, (Object) isnalunitsei.handleMediaPlayPauseIfPendingOnHandler) && this.onAddQueueItem == isnalunitsei.onAddQueueItem && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) isnalunitsei.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPrepareFromMediaId, (Object) isnalunitsei.onPrepareFromMediaId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPlayFromSearch, (Object) isnalunitsei.onPlayFromSearch) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaDescriptionCompat, (Object) isnalunitsei.MediaDescriptionCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPlayFromUri, (Object) isnalunitsei.onPlayFromUri) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPlayFromMediaId, (Object) isnalunitsei.onPlayFromMediaId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onSeekTo, (Object) isnalunitsei.onSeekTo) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, (Object) isnalunitsei.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onPause, isnalunitsei.onPause) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaMetadataCompat, isnalunitsei.MediaMetadataCompat) && this.onMediaButtonEvent == isnalunitsei.onMediaButtonEvent && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onFastForward, (Object) isnalunitsei.onFastForward) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onRemoveQueueItem, (Object) isnalunitsei.onRemoveQueueItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RatingCompat, (Object) isnalunitsei.RatingCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onRewind, (Object) isnalunitsei.onRewind) && this.onRemoveQueueItemAt == isnalunitsei.onRemoveQueueItemAt && this.onPlay == isnalunitsei.onPlay && this.write == isnalunitsei.write && this.RemoteActionCompatParcelizer == isnalunitsei.RemoteActionCompatParcelizer && this.MediaBrowserCompatItemReceiver == isnalunitsei.MediaBrowserCompatItemReceiver && this.AudioAttributesCompatParcelizer == isnalunitsei.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == isnalunitsei.IconCompatParcelizer && this.MediaBrowserCompatCustomActionResultReceiver == isnalunitsei.MediaBrowserCompatCustomActionResultReceiver && this.read == isnalunitsei.read && this.AudioAttributesImplBaseParcelizer == isnalunitsei.AudioAttributesImplBaseParcelizer && this.AudioAttributesImplApi21Parcelizer == isnalunitsei.AudioAttributesImplApi21Parcelizer && this.AudioAttributesImplApi26Parcelizer == isnalunitsei.AudioAttributesImplApi26Parcelizer && this.onPrepareFromSearch == isnalunitsei.onPrepareFromSearch && this.onCommand == isnalunitsei.onCommand && this.onPrepare == isnalunitsei.onPrepare && this.onPrepareFromUri == isnalunitsei.onPrepareFromUri && this.MediaBrowserCompatMediaItem == isnalunitsei.MediaBrowserCompatMediaItem && this.onCustomAction == isnalunitsei.onCustomAction;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.handleMediaPlayPauseIfPendingOnHandler.hashCode() * 31) + this.onAddQueueItem.hashCode()) * 31) + this.MediaBrowserCompatSearchResultReceiver.hashCode()) * 31) + this.onPrepareFromMediaId.hashCode()) * 31) + this.onPlayFromSearch.hashCode()) * 31) + this.MediaDescriptionCompat.hashCode()) * 31) + this.onPlayFromUri.hashCode()) * 31) + this.onPlayFromMediaId.hashCode()) * 31) + this.onSeekTo.hashCode()) * 31) + this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.hashCode()) * 31) + this.onPause.hashCode()) * 31) + this.MediaMetadataCompat.hashCode()) * 31) + Integer.hashCode(this.onMediaButtonEvent)) * 31) + this.onFastForward.hashCode()) * 31) + this.onRemoveQueueItem.hashCode()) * 31) + this.RatingCompat.hashCode()) * 31) + this.onRewind.hashCode()) * 31) + Long.hashCode(this.onRemoveQueueItemAt)) * 31) + this.onPlay.hashCode()) * 31) + this.write.hashCode()) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Boolean.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + Boolean.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Boolean.hashCode(this.read)) * 31) + Boolean.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + Long.hashCode(this.onPrepareFromSearch)) * 31) + Long.hashCode(this.onCommand)) * 31) + Integer.hashCode(this.onPrepare)) * 31) + Long.hashCode(this.onPrepareFromUri)) * 31) + Long.hashCode(this.MediaBrowserCompatMediaItem)) * 31) + Integer.hashCode(this.onCustomAction);
    }

    public final String toString() {
        String str = this.handleMediaPlayPauseIfPendingOnHandler;
        getTrackTypeOfCodec gettracktypeofcodec = this.onAddQueueItem;
        String str2 = this.MediaBrowserCompatSearchResultReceiver;
        String str3 = this.onPrepareFromMediaId;
        String str4 = this.onPlayFromSearch;
        String str5 = this.MediaDescriptionCompat;
        String str6 = this.onPlayFromUri;
        String str7 = this.onPlayFromMediaId;
        String str8 = this.onSeekTo;
        String str9 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        isText istext = this.onPause;
        List<String> list = this.MediaMetadataCompat;
        int i = this.onMediaButtonEvent;
        String str10 = this.onFastForward;
        String str11 = this.onRemoveQueueItem;
        String str12 = this.RatingCompat;
        String str13 = this.onRewind;
        long j = this.onRemoveQueueItemAt;
        reconnect reconnectVar = this.onPlay;
        getContextAttributionTag getcontextattributiontag = this.write;
        boolean z = this.RemoteActionCompatParcelizer;
        boolean z2 = this.MediaBrowserCompatItemReceiver;
        boolean z3 = this.AudioAttributesCompatParcelizer;
        boolean z4 = this.IconCompatParcelizer;
        boolean z5 = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean z6 = this.read;
        boolean z7 = this.AudioAttributesImplBaseParcelizer;
        boolean z8 = this.AudioAttributesImplApi21Parcelizer;
        boolean z9 = this.AudioAttributesImplApi26Parcelizer;
        long j2 = this.onPrepareFromSearch;
        long j3 = this.onCommand;
        int i2 = this.onPrepare;
        long j4 = this.onPrepareFromUri;
        long j5 = this.MediaBrowserCompatMediaItem;
        int i3 = this.onCustomAction;
        StringBuilder sb = new StringBuilder("TestFeatureCardUCModel(testFcId=");
        sb.append(str);
        sb.append(", testContentType=");
        sb.append(gettracktypeofcodec);
        sb.append(", testContentId=");
        sb.append(str2);
        sb.append(", testSubContentId=");
        sb.append(str3);
        sb.append(", testSubContentType=");
        sb.append(str4);
        sb.append(", testContentTitle=");
        sb.append(str5);
        sb.append(", testSubTitle=");
        sb.append(str6);
        sb.append(", testPublishedStatus=");
        sb.append(str7);
        sb.append(", testThumbnail=");
        sb.append(str8);
        sb.append(", testCourseId=");
        sb.append(str9);
        sb.append(", testLabel=");
        sb.append(istext);
        sb.append(", testContentStepIds=");
        sb.append(list);
        sb.append(", testSortOrder=");
        sb.append(i);
        sb.append(", testId=");
        sb.append(str10);
        sb.append(", title=");
        sb.append(str11);
        sb.append(", secondTitle=");
        sb.append(str12);
        sb.append(", thirdTitle=");
        sb.append(str13);
        sb.append(", timeRemaining=");
        sb.append(j);
        sb.append(", testInfo=");
        sb.append(reconnectVar);
        sb.append(", initials=");
        sb.append(getcontextattributiontag);
        sb.append(", isLockVisible=");
        sb.append(z);
        sb.append(", isProVisible=");
        sb.append(z2);
        sb.append(", isComingSoonVisible=");
        sb.append(z3);
        sb.append(", isPausedVisible=");
        sb.append(z4);
        sb.append(", isTestInfoVisible=");
        sb.append(z5);
        sb.append(", isLiveVisible=");
        sb.append(z6);
        sb.append(", isTimerVisible=");
        sb.append(z7);
        sb.append(", isThirdInfoVisible=");
        sb.append(z8);
        sb.append(", isResultOutVisible=");
        sb.append(z9);
        sb.append(", testStartTime=");
        sb.append(j2);
        sb.append(", testEndTime=");
        sb.append(j3);
        sb.append(", testStatus=");
        sb.append(i2);
        sb.append(", testUserStartedTime=");
        sb.append(j4);
        sb.append(", tentativeEndTimestampMs=");
        sb.append(j5);
        sb.append(", testDuration=");
        sb.append(i3);
        sb.append(")");
        return sb.toString();
    }
}
