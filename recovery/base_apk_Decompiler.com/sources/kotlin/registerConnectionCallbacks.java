package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class registerConnectionCallbacks extends getApiFallbackAttributionTag {
    private final boolean AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi21Parcelizer;
    private final boolean AudioAttributesImplApi26Parcelizer;
    private final boolean AudioAttributesImplBaseParcelizer;
    private final boolean IconCompatParcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final String MediaBrowserCompatMediaItem;
    private final String MediaBrowserCompatSearchResultReceiver;
    private final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final String MediaDescriptionCompat;
    private final List<String> MediaMetadataCompat;
    private final long RatingCompat;
    private final getContextAttributionTag RemoteActionCompatParcelizer;
    private final getTrackTypeOfCodec handleMediaPlayPauseIfPendingOnHandler;
    private final int onAddQueueItem;
    private final long onCommand;
    private final String onCustomAction;
    private final reconnect onFastForward;
    private final GoogleApiSettingsBuilder onMediaButtonEvent;
    private final String onPause;
    private final int onPlay;
    private final String onPlayFromMediaId;
    private final int onPlayFromSearch;
    private final long onPlayFromUri;
    private final String onPrepare;
    private final String onPrepareFromMediaId;
    private final String onPrepareFromSearch;
    private final long onPrepareFromUri;
    private final long onRemoveQueueItem;
    private final String onRemoveQueueItemAt;
    private final String onRewind;
    private final String onSeekTo;
    private final boolean read;
    private final boolean write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public registerConnectionCallbacks(String str, getTrackTypeOfCodec gettracktypeofcodec, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, GoogleApiSettingsBuilder googleApiSettingsBuilder, List<String> list, int i, String str10, String str11, String str12, String str13, long j, reconnect reconnectVar, getContextAttributionTag getcontextattributiontag, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, long j2, long j3, int i2, long j4, long j5, int i3) {
        super(str10, gettracktypeofcodec, str2, str3, str4, str5, str6, str7, str8, str9, googleApiSettingsBuilder, list, i, 3);
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
        toMagicModuleMetaRepoModel.write(str12, "");
        toMagicModuleMetaRepoModel.write(str13, "");
        toMagicModuleMetaRepoModel.write(reconnectVar, "");
        toMagicModuleMetaRepoModel.write(getcontextattributiontag, "");
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = str;
        this.handleMediaPlayPauseIfPendingOnHandler = gettracktypeofcodec;
        this.MediaBrowserCompatSearchResultReceiver = str2;
        this.onPrepareFromSearch = str3;
        this.onPrepareFromMediaId = str4;
        this.MediaDescriptionCompat = str5;
        this.onPrepare = str6;
        this.onPlayFromMediaId = str7;
        this.onRewind = str8;
        this.onCustomAction = str9;
        this.onMediaButtonEvent = googleApiSettingsBuilder;
        this.MediaMetadataCompat = list;
        this.onPlay = i;
        this.onPause = str10;
        this.onRemoveQueueItemAt = str11;
        this.MediaBrowserCompatMediaItem = str12;
        this.onSeekTo = str13;
        this.onRemoveQueueItem = j;
        this.onFastForward = reconnectVar;
        this.RemoteActionCompatParcelizer = getcontextattributiontag;
        this.read = z;
        this.MediaBrowserCompatItemReceiver = z2;
        this.write = z3;
        this.AudioAttributesCompatParcelizer = z4;
        this.AudioAttributesImplApi26Parcelizer = z5;
        this.IconCompatParcelizer = z6;
        this.MediaBrowserCompatCustomActionResultReceiver = z7;
        this.AudioAttributesImplApi21Parcelizer = z8;
        this.AudioAttributesImplBaseParcelizer = z9;
        this.onPlayFromUri = j2;
        this.onCommand = j3;
        this.onPlayFromSearch = i2;
        this.onPrepareFromUri = j4;
        this.RatingCompat = j5;
        this.onAddQueueItem = i3;
    }

    public final getTrackTypeOfCodec MediaDescriptionCompat() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final String onAddQueueItem() {
        return this.onRemoveQueueItemAt;
    }

    public final String AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.onSeekTo;
    }

    public final long onCommand() {
        return this.onRemoveQueueItem;
    }

    public final reconnect MediaMetadataCompat() {
        return this.onFastForward;
    }

    public final getContextAttributionTag AudioAttributesImplBaseParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean onMediaButtonEvent() {
        return this.read;
    }

    public final boolean onPause() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final boolean onFastForward() {
        return this.write;
    }

    public final boolean onPlayFromMediaId() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final boolean onPrepare() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final boolean onPlay() {
        return this.IconCompatParcelizer;
    }

    public final boolean onPlayFromSearch() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final boolean onPrepareFromSearch() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final boolean onPrepareFromMediaId() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final long MediaBrowserCompatMediaItem() {
        return this.onPlayFromUri;
    }

    public final long RatingCompat() {
        return this.onCommand;
    }

    public final int onCustomAction() {
        return this.onPlayFromSearch;
    }

    public final long handleMediaPlayPauseIfPendingOnHandler() {
        return this.onPrepareFromUri;
    }

    public final long MediaBrowserCompatItemReceiver() {
        return this.RatingCompat;
    }

    public final int MediaBrowserCompatSearchResultReceiver() {
        return this.onAddQueueItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof registerConnectionCallbacks)) {
            return false;
        }
        registerConnectionCallbacks registerconnectioncallbacks = (registerConnectionCallbacks) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, (Object) registerconnectioncallbacks.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && this.handleMediaPlayPauseIfPendingOnHandler == registerconnectioncallbacks.handleMediaPlayPauseIfPendingOnHandler && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) registerconnectioncallbacks.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPrepareFromSearch, (Object) registerconnectioncallbacks.onPrepareFromSearch) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPrepareFromMediaId, (Object) registerconnectioncallbacks.onPrepareFromMediaId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaDescriptionCompat, (Object) registerconnectioncallbacks.MediaDescriptionCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPrepare, (Object) registerconnectioncallbacks.onPrepare) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPlayFromMediaId, (Object) registerconnectioncallbacks.onPlayFromMediaId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onRewind, (Object) registerconnectioncallbacks.onRewind) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onCustomAction, (Object) registerconnectioncallbacks.onCustomAction) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onMediaButtonEvent, registerconnectioncallbacks.onMediaButtonEvent) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaMetadataCompat, registerconnectioncallbacks.MediaMetadataCompat) && this.onPlay == registerconnectioncallbacks.onPlay && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPause, (Object) registerconnectioncallbacks.onPause) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onRemoveQueueItemAt, (Object) registerconnectioncallbacks.onRemoveQueueItemAt) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatMediaItem, (Object) registerconnectioncallbacks.MediaBrowserCompatMediaItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onSeekTo, (Object) registerconnectioncallbacks.onSeekTo) && this.onRemoveQueueItem == registerconnectioncallbacks.onRemoveQueueItem && this.onFastForward == registerconnectioncallbacks.onFastForward && this.RemoteActionCompatParcelizer == registerconnectioncallbacks.RemoteActionCompatParcelizer && this.read == registerconnectioncallbacks.read && this.MediaBrowserCompatItemReceiver == registerconnectioncallbacks.MediaBrowserCompatItemReceiver && this.write == registerconnectioncallbacks.write && this.AudioAttributesCompatParcelizer == registerconnectioncallbacks.AudioAttributesCompatParcelizer && this.AudioAttributesImplApi26Parcelizer == registerconnectioncallbacks.AudioAttributesImplApi26Parcelizer && this.IconCompatParcelizer == registerconnectioncallbacks.IconCompatParcelizer && this.MediaBrowserCompatCustomActionResultReceiver == registerconnectioncallbacks.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesImplApi21Parcelizer == registerconnectioncallbacks.AudioAttributesImplApi21Parcelizer && this.AudioAttributesImplBaseParcelizer == registerconnectioncallbacks.AudioAttributesImplBaseParcelizer && this.onPlayFromUri == registerconnectioncallbacks.onPlayFromUri && this.onCommand == registerconnectioncallbacks.onCommand && this.onPlayFromSearch == registerconnectioncallbacks.onPlayFromSearch && this.onPrepareFromUri == registerconnectioncallbacks.onPrepareFromUri && this.RatingCompat == registerconnectioncallbacks.RatingCompat && this.onAddQueueItem == registerconnectioncallbacks.onAddQueueItem;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.hashCode() * 31) + this.handleMediaPlayPauseIfPendingOnHandler.hashCode()) * 31) + this.MediaBrowserCompatSearchResultReceiver.hashCode()) * 31) + this.onPrepareFromSearch.hashCode()) * 31) + this.onPrepareFromMediaId.hashCode()) * 31) + this.MediaDescriptionCompat.hashCode()) * 31) + this.onPrepare.hashCode()) * 31) + this.onPlayFromMediaId.hashCode()) * 31) + this.onRewind.hashCode()) * 31) + this.onCustomAction.hashCode()) * 31) + this.onMediaButtonEvent.hashCode()) * 31) + this.MediaMetadataCompat.hashCode()) * 31) + Integer.hashCode(this.onPlay)) * 31) + this.onPause.hashCode()) * 31) + this.onRemoveQueueItemAt.hashCode()) * 31) + this.MediaBrowserCompatMediaItem.hashCode()) * 31) + this.onSeekTo.hashCode()) * 31) + Long.hashCode(this.onRemoveQueueItem)) * 31) + this.onFastForward.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.read)) * 31) + Boolean.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Boolean.hashCode(this.write)) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + Boolean.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + Long.hashCode(this.onPlayFromUri)) * 31) + Long.hashCode(this.onCommand)) * 31) + Integer.hashCode(this.onPlayFromSearch)) * 31) + Long.hashCode(this.onPrepareFromUri)) * 31) + Long.hashCode(this.RatingCompat)) * 31) + Integer.hashCode(this.onAddQueueItem);
    }

    public final String toString() {
        String str = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        getTrackTypeOfCodec gettracktypeofcodec = this.handleMediaPlayPauseIfPendingOnHandler;
        String str2 = this.MediaBrowserCompatSearchResultReceiver;
        String str3 = this.onPrepareFromSearch;
        String str4 = this.onPrepareFromMediaId;
        String str5 = this.MediaDescriptionCompat;
        String str6 = this.onPrepare;
        String str7 = this.onPlayFromMediaId;
        String str8 = this.onRewind;
        String str9 = this.onCustomAction;
        GoogleApiSettingsBuilder googleApiSettingsBuilder = this.onMediaButtonEvent;
        List<String> list = this.MediaMetadataCompat;
        int i = this.onPlay;
        String str10 = this.onPause;
        String str11 = this.onRemoveQueueItemAt;
        String str12 = this.MediaBrowserCompatMediaItem;
        String str13 = this.onSeekTo;
        long j = this.onRemoveQueueItem;
        reconnect reconnectVar = this.onFastForward;
        getContextAttributionTag getcontextattributiontag = this.RemoteActionCompatParcelizer;
        boolean z = this.read;
        boolean z2 = this.MediaBrowserCompatItemReceiver;
        boolean z3 = this.write;
        boolean z4 = this.AudioAttributesCompatParcelizer;
        boolean z5 = this.AudioAttributesImplApi26Parcelizer;
        boolean z6 = this.IconCompatParcelizer;
        boolean z7 = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean z8 = this.AudioAttributesImplApi21Parcelizer;
        boolean z9 = this.AudioAttributesImplBaseParcelizer;
        long j2 = this.onPlayFromUri;
        long j3 = this.onCommand;
        int i2 = this.onPlayFromSearch;
        long j4 = this.onPrepareFromUri;
        long j5 = this.RatingCompat;
        int i3 = this.onAddQueueItem;
        StringBuilder sb = new StringBuilder("TestFeatureCardVMModel(testFcId=");
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
        sb.append(googleApiSettingsBuilder);
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
