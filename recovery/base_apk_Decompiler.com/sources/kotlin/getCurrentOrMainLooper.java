package kotlin;

/* JADX INFO: loaded from: classes3.dex */
public final class getCurrentOrMainLooper {
    private final int AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi21Parcelizer;
    private final boolean AudioAttributesImplApi26Parcelizer;
    private final boolean AudioAttributesImplBaseParcelizer;
    private final boolean IconCompatParcelizer;
    private final int MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final double MediaBrowserCompatMediaItem;
    private final int MediaBrowserCompatSearchResultReceiver;
    private final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final int MediaDescriptionCompat;
    private final int MediaMetadataCompat;
    private final double RatingCompat;
    private final int RemoteActionCompatParcelizer;
    private final int handleMediaPlayPauseIfPendingOnHandler;
    private final int onAddQueueItem;
    private final String onCommand;
    private final double onCustomAction;
    private final String onFastForward;
    private final long onMediaButtonEvent;
    private final int onPause;
    private final String onPlay;
    private final String onPlayFromMediaId;
    private final int onPlayFromSearch;
    private final long onPrepareFromMediaId;
    private final String read;
    private final long write;

    public getCurrentOrMainLooper(String str, String str2, int i, double d, double d2, boolean z, boolean z2, boolean z3, boolean z4, int i2, int i3, int i4, int i5, int i6, int i7, int i8, double d3, long j, long j2, String str3, boolean z5, int i9, long j3, int i10, String str4, String str5, int i11) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        this.read = str;
        this.onCommand = str2;
        this.MediaMetadataCompat = i;
        this.onCustomAction = d;
        this.MediaBrowserCompatMediaItem = d2;
        this.AudioAttributesImplApi26Parcelizer = z;
        this.MediaBrowserCompatItemReceiver = z2;
        this.AudioAttributesImplApi21Parcelizer = z3;
        this.IconCompatParcelizer = z4;
        this.MediaBrowserCompatSearchResultReceiver = i2;
        this.handleMediaPlayPauseIfPendingOnHandler = i3;
        this.AudioAttributesCompatParcelizer = i4;
        this.onPlayFromSearch = i5;
        this.MediaDescriptionCompat = i6;
        this.onPause = i7;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i8;
        this.RatingCompat = d3;
        this.write = j;
        this.onMediaButtonEvent = j2;
        this.onPlayFromMediaId = str3;
        this.AudioAttributesImplBaseParcelizer = z5;
        this.MediaBrowserCompatCustomActionResultReceiver = i9;
        this.onPrepareFromMediaId = j3;
        this.RemoteActionCompatParcelizer = i10;
        this.onPlay = str4;
        this.onFastForward = str5;
        this.onAddQueueItem = i11;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final String RatingCompat() {
        return this.onCommand;
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.MediaMetadataCompat;
    }

    public final double read() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final boolean onPlay() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final boolean onPause() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final boolean handleMediaPlayPauseIfPendingOnHandler() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final int MediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final int write() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final int onAddQueueItem() {
        return this.onPlayFromSearch;
    }

    public final int AudioAttributesImplApi21Parcelizer() {
        return this.MediaDescriptionCompat;
    }

    public final int MediaDescriptionCompat() {
        return this.onPause;
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final double MediaBrowserCompatCustomActionResultReceiver() {
        return this.RatingCompat;
    }

    public final long IconCompatParcelizer() {
        return this.write;
    }

    public final long onCustomAction() {
        return this.onMediaButtonEvent;
    }

    public final boolean onCommand() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final int onMediaButtonEvent() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final long MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.onPrepareFromMediaId;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String MediaBrowserCompatSearchResultReceiver() {
        return this.onPlay;
    }

    public final String MediaMetadataCompat() {
        return this.onFastForward;
    }

    public final int MediaBrowserCompatMediaItem() {
        return this.onAddQueueItem;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof getCurrentOrMainLooper)) {
            return false;
        }
        getCurrentOrMainLooper getcurrentormainlooper = (getCurrentOrMainLooper) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) getcurrentormainlooper.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onCommand, (Object) getcurrentormainlooper.onCommand) && this.MediaMetadataCompat == getcurrentormainlooper.MediaMetadataCompat && Double.compare(this.onCustomAction, getcurrentormainlooper.onCustomAction) == 0 && Double.compare(this.MediaBrowserCompatMediaItem, getcurrentormainlooper.MediaBrowserCompatMediaItem) == 0 && this.AudioAttributesImplApi26Parcelizer == getcurrentormainlooper.AudioAttributesImplApi26Parcelizer && this.MediaBrowserCompatItemReceiver == getcurrentormainlooper.MediaBrowserCompatItemReceiver && this.AudioAttributesImplApi21Parcelizer == getcurrentormainlooper.AudioAttributesImplApi21Parcelizer && this.IconCompatParcelizer == getcurrentormainlooper.IconCompatParcelizer && this.MediaBrowserCompatSearchResultReceiver == getcurrentormainlooper.MediaBrowserCompatSearchResultReceiver && this.handleMediaPlayPauseIfPendingOnHandler == getcurrentormainlooper.handleMediaPlayPauseIfPendingOnHandler && this.AudioAttributesCompatParcelizer == getcurrentormainlooper.AudioAttributesCompatParcelizer && this.onPlayFromSearch == getcurrentormainlooper.onPlayFromSearch && this.MediaDescriptionCompat == getcurrentormainlooper.MediaDescriptionCompat && this.onPause == getcurrentormainlooper.onPause && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == getcurrentormainlooper.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && Double.compare(this.RatingCompat, getcurrentormainlooper.RatingCompat) == 0 && this.write == getcurrentormainlooper.write && this.onMediaButtonEvent == getcurrentormainlooper.onMediaButtonEvent && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPlayFromMediaId, (Object) getcurrentormainlooper.onPlayFromMediaId) && this.AudioAttributesImplBaseParcelizer == getcurrentormainlooper.AudioAttributesImplBaseParcelizer && this.MediaBrowserCompatCustomActionResultReceiver == getcurrentormainlooper.MediaBrowserCompatCustomActionResultReceiver && this.onPrepareFromMediaId == getcurrentormainlooper.onPrepareFromMediaId && this.RemoteActionCompatParcelizer == getcurrentormainlooper.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPlay, (Object) getcurrentormainlooper.onPlay) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onFastForward, (Object) getcurrentormainlooper.onFastForward) && this.onAddQueueItem == getcurrentormainlooper.onAddQueueItem;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((this.read.hashCode() * 31) + this.onCommand.hashCode()) * 31) + Integer.hashCode(this.MediaMetadataCompat)) * 31) + Double.hashCode(this.onCustomAction)) * 31) + Double.hashCode(this.MediaBrowserCompatMediaItem)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + Boolean.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi21Parcelizer)) * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatSearchResultReceiver)) * 31) + Integer.hashCode(this.handleMediaPlayPauseIfPendingOnHandler)) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.onPlayFromSearch)) * 31) + Integer.hashCode(this.MediaDescriptionCompat)) * 31) + Integer.hashCode(this.onPause)) * 31) + Integer.hashCode(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) * 31) + Double.hashCode(this.RatingCompat)) * 31) + Long.hashCode(this.write)) * 31) + Long.hashCode(this.onMediaButtonEvent)) * 31) + this.onPlayFromMediaId.hashCode()) * 31) + Boolean.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Long.hashCode(this.onPrepareFromMediaId)) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + this.onPlay.hashCode()) * 31) + this.onFastForward.hashCode()) * 31) + Integer.hashCode(this.onAddQueueItem);
    }

    public final String toString() {
        String str = this.read;
        String str2 = this.onCommand;
        int i = this.MediaMetadataCompat;
        double d = this.onCustomAction;
        double d2 = this.MediaBrowserCompatMediaItem;
        boolean z = this.AudioAttributesImplApi26Parcelizer;
        boolean z2 = this.MediaBrowserCompatItemReceiver;
        boolean z3 = this.AudioAttributesImplApi21Parcelizer;
        boolean z4 = this.IconCompatParcelizer;
        int i2 = this.MediaBrowserCompatSearchResultReceiver;
        int i3 = this.handleMediaPlayPauseIfPendingOnHandler;
        int i4 = this.AudioAttributesCompatParcelizer;
        int i5 = this.onPlayFromSearch;
        int i6 = this.MediaDescriptionCompat;
        int i7 = this.onPause;
        int i8 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        double d3 = this.RatingCompat;
        long j = this.write;
        long j2 = this.onMediaButtonEvent;
        String str3 = this.onPlayFromMediaId;
        boolean z5 = this.AudioAttributesImplBaseParcelizer;
        int i9 = this.MediaBrowserCompatCustomActionResultReceiver;
        long j3 = this.onPrepareFromMediaId;
        int i10 = this.RemoteActionCompatParcelizer;
        String str4 = this.onPlay;
        String str5 = this.onFastForward;
        int i11 = this.onAddQueueItem;
        StringBuilder sb = new StringBuilder("TestScoreUCModel(id=");
        sb.append(str);
        sb.append(", stateId=");
        sb.append(str2);
        sb.append(", possibleScore=");
        sb.append(i);
        sb.append(", statePercentile=");
        sb.append(d);
        sb.append(", percentile=");
        sb.append(d2);
        sb.append(", isReviewAvailable=");
        sb.append(z);
        sb.append(", isTestDiscarded=");
        sb.append(z2);
        sb.append(", isRankPredicted=");
        sb.append(z3);
        sb.append(", isAnonymous=");
        sb.append(z4);
        sb.append(", rank=");
        sb.append(i2);
        sb.append(", stateRank=");
        sb.append(i3);
        sb.append(", correct=");
        sb.append(i4);
        sb.append(", wrong=");
        sb.append(i5);
        sb.append(", skipped=");
        sb.append(i6);
        sb.append(", totalAttempt=");
        sb.append(i7);
        sb.append(", solvedCount=");
        sb.append(i8);
        sb.append(", score=");
        sb.append(d3);
        sb.append(", endTimestamp=");
        sb.append(j);
        sb.append(", userStartedTimestamp=");
        sb.append(j2);
        sb.append(", testTitle=");
        sb.append(str3);
        sb.append(", isPaid=");
        sb.append(z5);
        sb.append(", isRanked=");
        sb.append(i9);
        sb.append(", userSubmissionTimestamp=");
        sb.append(j3);
        sb.append(", duration=");
        sb.append(i10);
        sb.append(", testType=");
        sb.append(str4);
        sb.append(", title=");
        sb.append(str5);
        sb.append(", testPattern=");
        sb.append(i11);
        sb.append(")");
        return sb.toString();
    }
}
