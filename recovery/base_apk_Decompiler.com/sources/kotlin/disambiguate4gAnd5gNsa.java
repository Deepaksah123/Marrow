package kotlin;

import com.google.android.exoplayer2.C;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\bU\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BÑ\u0001\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0013\u001a\u00020\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005¢\u0006\u0004\b\u001a\u0010\u001bJ\t\u0010K\u001a\u00020\u0003HÆ\u0003J\t\u0010L\u001a\u00020\u0005HÆ\u0003J\t\u0010M\u001a\u00020\u0005HÆ\u0003J\t\u0010N\u001a\u00020\u0005HÆ\u0003J\t\u0010O\u001a\u00020\tHÆ\u0003J\t\u0010P\u001a\u00020\u0005HÆ\u0003J\t\u0010Q\u001a\u00020\u0005HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\rHÆ\u0003J\t\u0010S\u001a\u00020\u0005HÆ\u0003J\t\u0010T\u001a\u00020\u0005HÆ\u0003J\t\u0010U\u001a\u00020\u0005HÆ\u0003J\t\u0010V\u001a\u00020\u0005HÆ\u0003J\t\u0010W\u001a\u00020\u0005HÆ\u0003J\t\u0010X\u001a\u00020\tHÆ\u0003J\t\u0010Y\u001a\u00020\u0005HÆ\u0003J\t\u0010Z\u001a\u00020\u0005HÆ\u0003J\t\u0010[\u001a\u00020\u0005HÆ\u0003J\t\u0010\\\u001a\u00020\u0005HÆ\u0003J\t\u0010]\u001a\u00020\u0005HÆ\u0003J\t\u0010^\u001a\u00020\u0005HÆ\u0003JÓ\u0001\u0010_\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\u00052\b\b\u0002\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0011\u001a\u00020\u00052\b\b\u0002\u0010\u0012\u001a\u00020\u00052\b\b\u0002\u0010\u0013\u001a\u00020\t2\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u00052\b\b\u0002\u0010\u0016\u001a\u00020\u00052\b\b\u0002\u0010\u0017\u001a\u00020\u00052\b\b\u0002\u0010\u0018\u001a\u00020\u00052\b\b\u0002\u0010\u0019\u001a\u00020\u0005HÆ\u0001J\u0013\u0010`\u001a\u00020\u00052\b\u0010a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010b\u001a\u00020cHÖ\u0001J\t\u0010d\u001a\u00020\tHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010!\"\u0004\b$\u0010#R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b%\u0010!\"\u0004\b&\u0010#R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010!\"\u0004\b,\u0010#R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b-\u0010!\"\u0004\b.\u0010#R\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u0010!\"\u0004\b4\u0010#R\u001a\u0010\u000f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010!\"\u0004\b6\u0010#R\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u0010!\"\u0004\b8\u0010#R\u001a\u0010\u0011\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u0010!\"\u0004\b:\u0010#R\u001a\u0010\u0012\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010!\"\u0004\b<\u0010#R\u001a\u0010\u0013\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u0010(\"\u0004\b>\u0010*R\u001a\u0010\u0014\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u0010!\"\u0004\b@\u0010#R\u001a\u0010\u0015\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010!\"\u0004\bB\u0010#R\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u0010!\"\u0004\bD\u0010#R\u001a\u0010\u0017\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u0010!\"\u0004\bF\u0010#R\u001a\u0010\u0018\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010!\"\u0004\bH\u0010#R\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u0010!\"\u0004\bJ\u0010#¨\u0006e"}, d2 = {"Lcom/marrow2/domain/main/model/MainUIModel;", "", "drawerUserProfile", "Lcom/marrow2/domain/main/model/DrawerUserProfile;", "hasNewCourse", "", "isProUser", "canShowGoPro", "courseSubTitle", "", "canShowYourPlanValidity", "canShowNotes", "downloadNotesModel", "Lcom/marrow2/domain/main/model/DownloadNotesModel;", "canShowExtension", "canShowKnowMore", "canShowAboutUs", "canShowShare", "canShowBuyNow", "buyNowLabel", "canShowAddVideo", "canShowFaq", "canShowContactUs", "canShowRateUs", "canShowTNC", "canShowReportPiracy", "<init>", "(Lcom/marrow2/domain/main/model/DrawerUserProfile;ZZZLjava/lang/String;ZZLcom/marrow2/domain/main/model/DownloadNotesModel;ZZZZZLjava/lang/String;ZZZZZZ)V", "getDrawerUserProfile", "()Lcom/marrow2/domain/main/model/DrawerUserProfile;", "setDrawerUserProfile", "(Lcom/marrow2/domain/main/model/DrawerUserProfile;)V", "getHasNewCourse", "()Z", "setHasNewCourse", "(Z)V", "setProUser", "getCanShowGoPro", "setCanShowGoPro", "getCourseSubTitle", "()Ljava/lang/String;", "setCourseSubTitle", "(Ljava/lang/String;)V", "getCanShowYourPlanValidity", "setCanShowYourPlanValidity", "getCanShowNotes", "setCanShowNotes", "getDownloadNotesModel", "()Lcom/marrow2/domain/main/model/DownloadNotesModel;", "setDownloadNotesModel", "(Lcom/marrow2/domain/main/model/DownloadNotesModel;)V", "getCanShowExtension", "setCanShowExtension", "getCanShowKnowMore", "setCanShowKnowMore", "getCanShowAboutUs", "setCanShowAboutUs", "getCanShowShare", "setCanShowShare", "getCanShowBuyNow", "setCanShowBuyNow", "getBuyNowLabel", "setBuyNowLabel", "getCanShowAddVideo", "setCanShowAddVideo", "getCanShowFaq", "setCanShowFaq", "getCanShowContactUs", "setCanShowContactUs", "getCanShowRateUs", "setCanShowRateUs", "getCanShowTNC", "setCanShowTNC", "getCanShowReportPiracy", "setCanShowReportPiracy", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "equals", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class disambiguate4gAnd5gNsa {
    private String AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private boolean MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private boolean RatingCompat;
    private boolean RemoteActionCompatParcelizer;
    private NetworkTypeObserverExternalSyntheticLambda0 handleMediaPlayPauseIfPendingOnHandler;
    private NetworkTypeObserver1 onAddQueueItem;
    private boolean onCommand;
    private boolean onCustomAction;
    private boolean read;
    private boolean write;

    private disambiguate4gAnd5gNsa(NetworkTypeObserverExternalSyntheticLambda0 networkTypeObserverExternalSyntheticLambda0, boolean z, boolean z2, boolean z3, String str, boolean z4, boolean z5, NetworkTypeObserver1 networkTypeObserver1, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str2, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        toMagicModuleMetaRepoModel.write(networkTypeObserverExternalSyntheticLambda0, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.handleMediaPlayPauseIfPendingOnHandler = networkTypeObserverExternalSyntheticLambda0;
        this.onCommand = z;
        this.onCustomAction = z2;
        this.AudioAttributesImplApi21Parcelizer = z3;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = str;
        this.MediaBrowserCompatMediaItem = z4;
        this.MediaBrowserCompatItemReceiver = z5;
        this.onAddQueueItem = networkTypeObserver1;
        this.MediaBrowserCompatCustomActionResultReceiver = z6;
        this.AudioAttributesImplApi26Parcelizer = z7;
        this.RemoteActionCompatParcelizer = z8;
        this.MediaMetadataCompat = z9;
        this.IconCompatParcelizer = z10;
        this.AudioAttributesCompatParcelizer = str2;
        this.write = z11;
        this.AudioAttributesImplBaseParcelizer = z12;
        this.read = z13;
        this.MediaDescriptionCompat = z14;
        this.RatingCompat = z15;
        this.MediaBrowserCompatSearchResultReceiver = z16;
    }

    public /* synthetic */ disambiguate4gAnd5gNsa(NetworkTypeObserverExternalSyntheticLambda0 networkTypeObserverExternalSyntheticLambda0, boolean z, boolean z2, boolean z3, String str, boolean z4, boolean z5, NetworkTypeObserver1 networkTypeObserver1, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str2, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? new NetworkTypeObserverExternalSyntheticLambda0(null, null, null, 7, null) : networkTypeObserverExternalSyntheticLambda0, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? false : z3, (i & 16) != 0 ? "" : str, (i & 32) != 0 ? false : z4, (i & 64) != 0 ? false : z5, (i & 128) != 0 ? null : networkTypeObserver1, (i & 256) != 0 ? false : z6, (i & 512) != 0 ? false : z7, (i & 1024) != 0 ? false : z8, (i & 2048) != 0 ? false : z9, (i & 4096) != 0 ? false : z10, (i & 8192) == 0 ? str2 : "", (i & 16384) != 0 ? false : z11, (i & 32768) != 0 ? false : z12, (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? false : z13, (i & 131072) != 0 ? false : z14, (i & 262144) != 0 ? false : z15, (i & 524288) != 0 ? false : z16);
    }

    public final void IconCompatParcelizer(NetworkTypeObserverExternalSyntheticLambda0 networkTypeObserverExternalSyntheticLambda0) {
        toMagicModuleMetaRepoModel.write(networkTypeObserverExternalSyntheticLambda0, "");
        this.handleMediaPlayPauseIfPendingOnHandler = networkTypeObserverExternalSyntheticLambda0;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final NetworkTypeObserverExternalSyntheticLambda0 getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final void AudioAttributesImplApi26Parcelizer(boolean z) {
        this.onCommand = z;
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final boolean getOnCommand() {
        return this.onCommand;
    }

    public final void AudioAttributesImplApi21Parcelizer(boolean z) {
        this.onCustomAction = z;
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final boolean getOnCustomAction() {
        return this.onCustomAction;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final void RemoteActionCompatParcelizer(boolean z) {
        this.AudioAttributesImplApi21Parcelizer = z;
    }

    public final void RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = str;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final String getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final void MediaBrowserCompatCustomActionResultReceiver(boolean z) {
        this.MediaBrowserCompatMediaItem = z;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final boolean getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final boolean getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final void write(boolean z) {
        this.MediaBrowserCompatItemReceiver = z;
    }

    public final void RemoteActionCompatParcelizer(NetworkTypeObserver1 networkTypeObserver1) {
        this.onAddQueueItem = networkTypeObserver1;
    }

    /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
    public final NetworkTypeObserver1 getOnAddQueueItem() {
        return this.onAddQueueItem;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final boolean getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final void IconCompatParcelizer(boolean z) {
        this.MediaBrowserCompatCustomActionResultReceiver = z;
    }

    public final void AudioAttributesCompatParcelizer(boolean z) {
        this.AudioAttributesImplApi26Parcelizer = z;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final boolean getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final void read(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }

    public final void MediaBrowserCompatItemReceiver(boolean z) {
        this.MediaMetadataCompat = z;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final boolean getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    public final void onFastForward() {
        this.IconCompatParcelizer = true;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final void AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.AudioAttributesCompatParcelizer = str;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final boolean getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public final void onPlayFromMediaId() {
        this.AudioAttributesImplBaseParcelizer = true;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    public final void onMediaButtonEvent() {
        this.read = true;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final boolean getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    public final void onPause() {
        this.MediaDescriptionCompat = true;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final boolean getRatingCompat() {
        return this.RatingCompat;
    }

    public final void onPlayFromSearch() {
        this.RatingCompat = true;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final boolean getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final void onPlay() {
        this.MediaBrowserCompatSearchResultReceiver = true;
    }

    public disambiguate4gAnd5gNsa() {
        this(null, false, false, false, null, false, false, null, false, false, false, false, false, null, false, false, false, false, false, false, 1048575, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static disambiguate4gAnd5gNsa IconCompatParcelizer(NetworkTypeObserverExternalSyntheticLambda0 networkTypeObserverExternalSyntheticLambda0, boolean z, boolean z2, boolean z3, String str, boolean z4, boolean z5, NetworkTypeObserver1 networkTypeObserver1, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, String str2, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, boolean z16) {
        toMagicModuleMetaRepoModel.write(networkTypeObserverExternalSyntheticLambda0, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        return new disambiguate4gAnd5gNsa(networkTypeObserverExternalSyntheticLambda0, z, z2, z3, str, z4, z5, networkTypeObserver1, z6, z7, z8, z9, z10, str2, z11, z12, z13, z14, z15, z16);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof disambiguate4gAnd5gNsa)) {
            return false;
        }
        disambiguate4gAnd5gNsa disambiguate4gand5gnsa = (disambiguate4gAnd5gNsa) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, disambiguate4gand5gnsa.handleMediaPlayPauseIfPendingOnHandler) && this.onCommand == disambiguate4gand5gnsa.onCommand && this.onCustomAction == disambiguate4gand5gnsa.onCustomAction && this.AudioAttributesImplApi21Parcelizer == disambiguate4gand5gnsa.AudioAttributesImplApi21Parcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, (Object) disambiguate4gand5gnsa.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && this.MediaBrowserCompatMediaItem == disambiguate4gand5gnsa.MediaBrowserCompatMediaItem && this.MediaBrowserCompatItemReceiver == disambiguate4gand5gnsa.MediaBrowserCompatItemReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onAddQueueItem, disambiguate4gand5gnsa.onAddQueueItem) && this.MediaBrowserCompatCustomActionResultReceiver == disambiguate4gand5gnsa.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesImplApi26Parcelizer == disambiguate4gand5gnsa.AudioAttributesImplApi26Parcelizer && this.RemoteActionCompatParcelizer == disambiguate4gand5gnsa.RemoteActionCompatParcelizer && this.MediaMetadataCompat == disambiguate4gand5gnsa.MediaMetadataCompat && this.IconCompatParcelizer == disambiguate4gand5gnsa.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) disambiguate4gand5gnsa.AudioAttributesCompatParcelizer) && this.write == disambiguate4gand5gnsa.write && this.AudioAttributesImplBaseParcelizer == disambiguate4gand5gnsa.AudioAttributesImplBaseParcelizer && this.read == disambiguate4gand5gnsa.read && this.MediaDescriptionCompat == disambiguate4gand5gnsa.MediaDescriptionCompat && this.RatingCompat == disambiguate4gand5gnsa.RatingCompat && this.MediaBrowserCompatSearchResultReceiver == disambiguate4gand5gnsa.MediaBrowserCompatSearchResultReceiver;
    }

    public final int hashCode() {
        int iHashCode = this.handleMediaPlayPauseIfPendingOnHandler.hashCode();
        int iHashCode2 = Boolean.hashCode(this.onCommand);
        int iHashCode3 = Boolean.hashCode(this.onCustomAction);
        int iHashCode4 = Boolean.hashCode(this.AudioAttributesImplApi21Parcelizer);
        int iHashCode5 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.hashCode();
        int iHashCode6 = Boolean.hashCode(this.MediaBrowserCompatMediaItem);
        int iHashCode7 = Boolean.hashCode(this.MediaBrowserCompatItemReceiver);
        NetworkTypeObserver1 networkTypeObserver1 = this.onAddQueueItem;
        return (((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (networkTypeObserver1 == null ? 0 : networkTypeObserver1.hashCode())) * 31) + Boolean.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Boolean.hashCode(this.MediaMetadataCompat)) * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.write)) * 31) + Boolean.hashCode(this.AudioAttributesImplBaseParcelizer)) * 31) + Boolean.hashCode(this.read)) * 31) + Boolean.hashCode(this.MediaDescriptionCompat)) * 31) + Boolean.hashCode(this.RatingCompat)) * 31) + Boolean.hashCode(this.MediaBrowserCompatSearchResultReceiver);
    }

    public final String toString() {
        NetworkTypeObserverExternalSyntheticLambda0 networkTypeObserverExternalSyntheticLambda0 = this.handleMediaPlayPauseIfPendingOnHandler;
        boolean z = this.onCommand;
        boolean z2 = this.onCustomAction;
        boolean z3 = this.AudioAttributesImplApi21Parcelizer;
        String str = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        boolean z4 = this.MediaBrowserCompatMediaItem;
        boolean z5 = this.MediaBrowserCompatItemReceiver;
        NetworkTypeObserver1 networkTypeObserver1 = this.onAddQueueItem;
        boolean z6 = this.MediaBrowserCompatCustomActionResultReceiver;
        boolean z7 = this.AudioAttributesImplApi26Parcelizer;
        boolean z8 = this.RemoteActionCompatParcelizer;
        boolean z9 = this.MediaMetadataCompat;
        boolean z10 = this.IconCompatParcelizer;
        String str2 = this.AudioAttributesCompatParcelizer;
        boolean z11 = this.write;
        boolean z12 = this.AudioAttributesImplBaseParcelizer;
        boolean z13 = this.read;
        boolean z14 = this.MediaDescriptionCompat;
        boolean z15 = this.RatingCompat;
        boolean z16 = this.MediaBrowserCompatSearchResultReceiver;
        StringBuilder sb = new StringBuilder("MainUIModel(drawerUserProfile=");
        sb.append(networkTypeObserverExternalSyntheticLambda0);
        sb.append(", hasNewCourse=");
        sb.append(z);
        sb.append(", isProUser=");
        sb.append(z2);
        sb.append(", canShowGoPro=");
        sb.append(z3);
        sb.append(", courseSubTitle=");
        sb.append(str);
        sb.append(", canShowYourPlanValidity=");
        sb.append(z4);
        sb.append(", canShowNotes=");
        sb.append(z5);
        sb.append(", downloadNotesModel=");
        sb.append(networkTypeObserver1);
        sb.append(", canShowExtension=");
        sb.append(z6);
        sb.append(", canShowKnowMore=");
        sb.append(z7);
        sb.append(", canShowAboutUs=");
        sb.append(z8);
        sb.append(", canShowShare=");
        sb.append(z9);
        sb.append(", canShowBuyNow=");
        sb.append(z10);
        sb.append(", buyNowLabel=");
        sb.append(str2);
        sb.append(", canShowAddVideo=");
        sb.append(z11);
        sb.append(", canShowFaq=");
        sb.append(z12);
        sb.append(", canShowContactUs=");
        sb.append(z13);
        sb.append(", canShowRateUs=");
        sb.append(z14);
        sb.append(", canShowTNC=");
        sb.append(z15);
        sb.append(", canShowReportPiracy=");
        sb.append(z16);
        sb.append(")");
        return sb.toString();
    }
}
