package kotlin;

import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b^\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0011\u0010\t\u001a\u00020\u00048\u0006¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0017\u0010\b\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\n\u0010\u0006\u001a\u0004\b\u0007\u0010\u000bR\u001a\u0010\n\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0006\u001a\u0004\b\t\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u0006R\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0006R\u001a\u0010\f\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\r\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0006R\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0006\u001a\u0004\b\b\u0010\u000bR\u0014\u0010\u0012\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0006R\u0014\u0010\u0013\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0006R\u001a\u0010\u0015\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0006\u001a\u0004\b\u0005\u0010\u000bR\u001a\u0010\u0016\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0006\u001a\u0004\b\u0010\u0010\u000bR\u001a\u0010\u0017\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0006\u001a\u0004\b\u000f\u0010\u000bR\u0014\u0010\u001a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0006R\u0014\u0010\u0018\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0006R\u001a\u0010\u0019\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0006\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u001c\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0006R\u0014\u0010\u001b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0006R\u0014\u0010\u001e\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0006R\u0014\u0010\u001f\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0006R\u0014\u0010\u001d\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b \u0010\u0006R\u0014\u0010!\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0006R\u0014\u0010 \u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0006R\u0014\u0010$\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0006R\u0014\u0010\"\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0006R\u0014\u0010#\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0006R\u001a\u0010%\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b&\u0010\u0006\u001a\u0004\b\u000e\u0010\u000bR\u001a\u0010&\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b'\u0010\u0006\u001a\u0004\b\f\u0010\u000bR\u001a\u0010'\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010\u0006\u001a\u0004\b\u0013\u0010\u000bR\u001a\u0010(\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010\u0006\u001a\u0004\b\u0015\u0010\u000bR\u001a\u0010)\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b*\u0010\u0006\u001a\u0004\b\u0014\u0010\u000bR\u001a\u0010,\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b\u0012\u0010\u000bR\u001a\u0010*\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010\u0006\u001a\u0004\b\u0011\u0010\u000bR\u0014\u0010.\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b,\u0010\u0006R\u0014\u0010+\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b.\u0010\u0006R\u0014\u0010-\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010\u0006R\u0014\u00101\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0006R\u0014\u00102\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b2\u0010\u0006R\u001a\u00100\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b\u001a\u0010\u000bR\u0014\u00103\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b3\u0010\u0006R\u001a\u0010/\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010\u0006\u001a\u0004\b\u0016\u0010\u000bR\u0014\u00106\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b5\u0010\u0006R\u0014\u00107\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b7\u0010\u0006R\u001a\u00104\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010\u0006\u001a\u0004\b\u0017\u0010\u000bR\u001a\u00108\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010\u0006\u001a\u0004\b\u0018\u0010\u000bR\u0014\u00105\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010\u0006R\u0014\u0010;\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010\u0006R\u0014\u0010<\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0006R\u001a\u00109\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010\u0006\u001a\u0004\b\u0019\u0010\u000bR\u001a\u0010:\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010\u0006\u001a\u0004\b\u001c\u0010\u000bR\u0014\u0010=\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u0010\u0006R\u001a\u0010>\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u0010\u0006\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010@\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010\u0006\u001a\u0004\b\u001b\u0010\u000bR\u0014\u0010?\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u0010\u0006R\u0014\u0010B\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010\u0006R\u0014\u0010A\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010\u0006R\u001a\u0010E\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010\u0006\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010G\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010\u0006\u001a\u0004\b\u001e\u0010\u000bR\u0014\u0010F\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010\u0006R\u0014\u0010D\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0006R\u0014\u0010C\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bH\u0010\u0006R\u001a\u0010J\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010\u0006\u001a\u0004\b \u0010\u000bR\u001a\u0010L\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010\u0006\u001a\u0004\b#\u0010\u000bR\u0014\u0010I\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bL\u0010\u0006R\u001a\u0010K\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010\u0006\u001a\u0004\b$\u0010\u000bR\u001a\u0010H\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010\u0006\u001a\u0004\b\"\u0010\u000bR\u0014\u0010O\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bN\u0010\u0006R\u0014\u0010P\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010\u0006R\u0014\u0010N\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010\u0006R\u001a\u0010Q\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u0010\u0006\u001a\u0004\b!\u0010\u000bR\u001a\u0010M\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010\u0006\u001a\u0004\b)\u0010\u000bR\u0014\u0010S\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010\u0006R\u0014\u0010U\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010\u0006R\u0014\u0010T\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010\u0006R\u001a\u0010V\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010\u0006\u001a\u0004\b(\u0010\u000bR\u001a\u0010R\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010\u0006\u001a\u0004\b'\u0010\u000bR\u0014\u0010Y\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bX\u0010\u0006R\u001a\u0010X\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010\u0006\u001a\u0004\b%\u0010\u000bR\u001a\u0010W\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010\u0006\u001a\u0004\b&\u0010\u000bR\u0014\u0010Z\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b[\u0010\u0006R\u0014\u0010[\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\\\u0010\u0006R\u0014\u0010^\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b]\u0010\u0006R\u001a\u0010]\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b_\u0010\u0006\u001a\u0004\b+\u0010\u000bR\u001a\u0010\\\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b^\u0010\u0006\u001a\u0004\b*\u0010\u000bR\u0014\u0010`\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b`\u0010\u0006R\u0014\u0010_\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\ba\u0010\u0006R\u0014\u0010a\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bb\u0010\u0006"}, d2 = {"Lo/_checkRangeBoundsForByteArray;", "", "<init>", "()V", "Lo/switchToNext;", "write", "J", "read", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "RemoteActionCompatParcelizer", "()J", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatItemReceiver", "MediaBrowserCompatCustomActionResultReceiver", "MediaMetadataCompat", "MediaBrowserCompatMediaItem", "RatingCompat", "MediaDescriptionCompat", "MediaBrowserCompatSearchResultReceiver", "onCustomAction", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "handleMediaPlayPauseIfPendingOnHandler", "onCommand", "onAddQueueItem", "onMediaButtonEvent", "onPause", "onFastForward", "onPlay", "onPlayFromMediaId", "onPrepare", "onPrepareFromSearch", "onPlayFromUri", "onPlayFromSearch", "onPrepareFromMediaId", "onPrepareFromUri", "onSeekTo", "onRewind", "onRemoveQueueItem", "onRemoveQueueItemAt", "onSetRating", "onSetCaptioningEnabled", "onSetShuffleMode", "onSetPlaybackSpeed", "onSetRepeatMode", "onSkipToNext", "onSkipToPrevious", "onStop", "onSkipToQueueItem", "setSessionImpl", "PlaybackStateCompat", "MediaSessionCompatResultReceiverWrapper", "MediaSessionCompatToken", "MediaSessionCompatQueueItem", "ParcelableVolumeInfo", "ResultReceiver", "r8lambdaKUbBm7ckfqTc9QCgukC86fguu4", "r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM", "r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw", "PlaybackStateCompatCustomAction", "r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28", "_init_lambda3", "r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0", "_init_lambda2", "r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8", "accessgetReportFullyDrawnExecutorp", "_init_lambda4", "accessensureViewModelStore", "accessaddObserverForBackInvoker", "_init_lambda5", "accessonBackPresseds1027565324", "addObserverForBackInvokerlambda7", "ensureViewModelStore", "addObserverForBackInvoker", "createFullyDrawnExecutor", "addMenuProvider", "menuHostHelperlambda0", "getOnBackPressedDispatcherannotations", "addContentView", "getSavedStateRegistryControllerannotations", "addOnMultiWindowModeChangedListener", "addOnContextAvailableListener", "addOnNewIntentListener", "addOnPictureInPictureModeChangedListener", "addOnConfigurationChangedListener", "addOnUserLeaveHintListener", "getActivityResultRegistry", "addOnTrimMemoryListener", "getDefaultViewModelCreationExtras", "getDefaultViewModelProviderFactory", "getOnBackPressedDispatcher", "getLifecycle", "getSavedStateRegistry", "getLastCustomNonConfigurationInstance", "getFullyDrawnReporter", "onActivityResult", "initializeViewTreeOwners"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class _checkRangeBoundsForByteArray {
    public static final _checkRangeBoundsForByteArray INSTANCE = new _checkRangeBoundsForByteArray();

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private static final long read = RequestPayload.write$default(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final long IconCompatParcelizer = RequestPayload.write$default(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private static final long AudioAttributesCompatParcelizer = RequestPayload.write$default(65, 14, 11, 0, 8, null);

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private static final long RemoteActionCompatParcelizer = RequestPayload.write$default(255, 255, 255, 0, 8, null);

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private static final long write = RequestPayload.write$default(96, 20, 16, 0, 8, null);

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private static final long AudioAttributesImplBaseParcelizer = RequestPayload.write$default(140, 29, 24, 0, 8, null);

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private static final long AudioAttributesImplApi26Parcelizer = RequestPayload.write$default(179, 38, 30, 0, 8, null);
    private static final long MediaBrowserCompatItemReceiver = RequestPayload.write$default(220, 54, 46, 0, 8, null);

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private static final long AudioAttributesImplApi21Parcelizer = RequestPayload.write$default(228, 105, 98, 0, 8, null);

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private static final long MediaBrowserCompatCustomActionResultReceiver = RequestPayload.write$default(236, 146, 142, 0, 8, null);

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private static final long MediaMetadataCompat = RequestPayload.write$default(242, 184, 181, 0, 8, null);

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private static final long MediaDescriptionCompat = RequestPayload.write$default(249, 222, 220, 0, 8, null);

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private static final long MediaBrowserCompatMediaItem = RequestPayload.write$default(252, 238, 238, 0, 8, null);

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private static final long RatingCompat = RequestPayload.write$default(255, 251, 249, 0, 8, null);

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private static final long MediaBrowserCompatSearchResultReceiver = RequestPayload.write$default(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private static final long onCustomAction = RequestPayload.write$default(29, 27, 32, 0, 8, null);

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private static final long MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = RequestPayload.write$default(255, 255, 255, 0, 8, null);

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private static final long onAddQueueItem = RequestPayload.write$default(33, 31, 38, 0, 8, null);

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private static final long handleMediaPlayPauseIfPendingOnHandler = RequestPayload.write$default(43, 41, 48, 0, 8, null);

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private static final long onCommand = RequestPayload.write$default(50, 47, 53, 0, 8, null);
    private static final long onPause = RequestPayload.write$default(54, 52, 59, 0, 8, null);

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private static final long onMediaButtonEvent = RequestPayload.write$default(59, 56, 62, 0, 8, null);
    private static final long onPlay = RequestPayload.write$default(72, 70, 76, 0, 8, null);
    private static final long onPlayFromMediaId = RequestPayload.write$default(15, 13, 19, 0, 8, null);

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private static final long onFastForward = RequestPayload.write$default(96, 93, 100, 0, 8, null);
    private static final long onPrepareFromSearch = RequestPayload.write$default(121, 118, 125, 0, 8, null);

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private static final long onPrepare = RequestPayload.write$default(20, 18, 24, 0, 8, null);

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private static final long onPrepareFromMediaId = RequestPayload.write$default(147, 143, 150, 0, 8, null);

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private static final long onPlayFromUri = RequestPayload.write$default(174, 169, 177, 0, 8, null);

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from kotlin metadata */
    private static final long onPlayFromSearch = RequestPayload.write$default(202, 197, 205, 0, 8, null);

    /* JADX INFO: renamed from: onSeekTo, reason: from kotlin metadata */
    private static final long onPrepareFromUri = RequestPayload.write$default(222, 216, 225, 0, 8, null);

    /* JADX INFO: renamed from: onRewind, reason: from kotlin metadata */
    private static final long onSeekTo = RequestPayload.write$default(230, 224, 233, 0, 8, null);

    /* JADX INFO: renamed from: onRemoveQueueItem, reason: from kotlin metadata */
    private static final long onRewind = RequestPayload.write$default(236, 230, PsExtractor.VIDEO_STREAM_MASK, 0, 8, null);

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from kotlin metadata */
    private static final long onRemoveQueueItem = RequestPayload.write$default(243, 237, 247, 0, 8, null);

    /* JADX INFO: renamed from: onSetRating, reason: from kotlin metadata */
    private static final long onRemoveQueueItemAt = RequestPayload.write$default(245, 239, 247, 0, 8, null);

    /* JADX INFO: renamed from: onSetCaptioningEnabled, reason: from kotlin metadata */
    private static final long onSetShuffleMode = RequestPayload.write$default(247, 242, 250, 0, 8, null);

    /* JADX INFO: renamed from: onSetPlaybackSpeed, reason: from kotlin metadata */
    private static final long onSetRating = RequestPayload.write$default(254, 247, 255, 0, 8, null);

    /* JADX INFO: renamed from: onSetShuffleMode, reason: from kotlin metadata */
    private static final long onSetRepeatMode = RequestPayload.write$default(255, 251, 255, 0, 8, null);

    /* JADX INFO: renamed from: onSetRepeatMode, reason: from kotlin metadata */
    private static final long onSetCaptioningEnabled = RequestPayload.write$default(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: onSkipToNext, reason: from kotlin metadata */
    private static final long onSetPlaybackSpeed = RequestPayload.write$default(29, 26, 34, 0, 8, null);

    /* JADX INFO: renamed from: onSkipToPrevious, reason: from kotlin metadata */
    private static final long onStop = RequestPayload.write$default(255, 255, 255, 0, 8, null);
    private static final long onSkipToQueueItem = RequestPayload.write$default(50, 47, 55, 0, 8, null);

    /* JADX INFO: renamed from: onStop, reason: from kotlin metadata */
    private static final long onSkipToPrevious = RequestPayload.write$default(73, 69, 79, 0, 8, null);
    private static final long setSessionImpl = RequestPayload.write$default(96, 93, 102, 0, 8, null);

    /* JADX INFO: renamed from: PlaybackStateCompat, reason: from kotlin metadata */
    private static final long onSkipToNext = RequestPayload.write$default(121, 116, 126, 0, 8, null);

    /* JADX INFO: renamed from: MediaSessionCompatResultReceiverWrapper, reason: from kotlin metadata */
    private static final long MediaSessionCompatToken = RequestPayload.write$default(147, 143, 153, 0, 8, null);
    private static final long MediaSessionCompatQueueItem = RequestPayload.write$default(174, 169, 180, 0, 8, null);

    /* JADX INFO: renamed from: ParcelableVolumeInfo, reason: from kotlin metadata */
    private static final long PlaybackStateCompat = RequestPayload.write$default(202, 196, 208, 0, 8, null);

    /* JADX INFO: renamed from: MediaSessionCompatToken, reason: from kotlin metadata */
    private static final long ParcelableVolumeInfo = RequestPayload.write$default(231, 224, 236, 0, 8, null);

    /* JADX INFO: renamed from: ResultReceiver, reason: from kotlin metadata */
    private static final long MediaSessionCompatResultReceiverWrapper = RequestPayload.write$default(245, 238, 250, 0, 8, null);

    /* JADX INFO: renamed from: r8lambdaKUbBm7ckfqTc9QCgukC86fguu4, reason: from kotlin metadata */
    private static final long r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = RequestPayload.write$default(255, 251, 254, 0, 8, null);

    /* JADX INFO: renamed from: r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, reason: from kotlin metadata */
    private static final long r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = RequestPayload.write$default(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, reason: from kotlin metadata */
    private static final long ResultReceiver = RequestPayload.write$default(33, 0, 93, 0, 8, null);

    /* JADX INFO: renamed from: PlaybackStateCompatCustomAction, reason: from kotlin metadata */
    private static final long r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = RequestPayload.write$default(255, 255, 255, 0, 8, null);

    /* JADX INFO: renamed from: r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28, reason: from kotlin metadata */
    private static final long PlaybackStateCompatCustomAction = RequestPayload.write$default(56, 30, 114, 0, 8, null);

    /* JADX INFO: renamed from: _init_lambda3, reason: from kotlin metadata */
    private static final long r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = RequestPayload.write$default(79, 55, 139, 0, 8, null);
    private static final long r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = RequestPayload.write$default(103, 80, 164, 0, 8, null);

    /* JADX INFO: renamed from: _init_lambda2, reason: from kotlin metadata */
    private static final long _init_lambda3 = RequestPayload.write$default(127, 103, 190, 0, 8, null);
    private static final long r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = RequestPayload.write$default(154, TsExtractor.TS_STREAM_TYPE_HDMV_DTS, 219, 0, 8, null);

    /* JADX INFO: renamed from: accessgetReportFullyDrawnExecutorp, reason: from kotlin metadata */
    private static final long _init_lambda2 = RequestPayload.write$default(182, 157, 248, 0, 8, null);

    /* JADX INFO: renamed from: _init_lambda4, reason: from kotlin metadata */
    private static final long accessensureViewModelStore = RequestPayload.write$default(208, TsExtractor.TS_PACKET_SIZE, 255, 0, 8, null);

    /* JADX INFO: renamed from: accessaddObserverForBackInvoker, reason: from kotlin metadata */
    private static final long _init_lambda5 = RequestPayload.write$default(234, 221, 255, 0, 8, null);

    /* JADX INFO: renamed from: _init_lambda5, reason: from kotlin metadata */
    private static final long accessaddObserverForBackInvoker = RequestPayload.write$default(246, 237, 255, 0, 8, null);

    /* JADX INFO: renamed from: accessensureViewModelStore, reason: from kotlin metadata */
    private static final long _init_lambda4 = RequestPayload.write$default(255, 251, 254, 0, 8, null);

    /* JADX INFO: renamed from: accessonBackPresseds1027565324, reason: from kotlin metadata */
    private static final long accessgetReportFullyDrawnExecutorp = RequestPayload.write$default(0, 0, 0, 0, 8, null);

    /* JADX INFO: renamed from: addObserverForBackInvokerlambda7, reason: from kotlin metadata */
    private static final long ensureViewModelStore = RequestPayload.write$default(29, 25, 43, 0, 8, null);

    /* JADX INFO: renamed from: addObserverForBackInvoker, reason: from kotlin metadata */
    private static final long createFullyDrawnExecutor = RequestPayload.write$default(255, 255, 255, 0, 8, null);

    /* JADX INFO: renamed from: createFullyDrawnExecutor, reason: from kotlin metadata */
    private static final long addObserverForBackInvokerlambda7 = RequestPayload.write$default(51, 45, 65, 0, 8, null);

    /* JADX INFO: renamed from: ensureViewModelStore, reason: from kotlin metadata */
    private static final long addObserverForBackInvoker = RequestPayload.write$default(74, 68, 88, 0, 8, null);

    /* JADX INFO: renamed from: addMenuProvider, reason: from kotlin metadata */
    private static final long accessonBackPresseds1027565324 = RequestPayload.write$default(98, 91, 113, 0, 8, null);

    /* JADX INFO: renamed from: menuHostHelperlambda0, reason: from kotlin metadata */
    private static final long getOnBackPressedDispatcherannotations = RequestPayload.write$default(122, 114, 137, 0, 8, null);
    private static final long addContentView = RequestPayload.write$default(149, 141, 165, 0, 8, null);

    /* JADX INFO: renamed from: getSavedStateRegistryControllerannotations, reason: from kotlin metadata */
    private static final long menuHostHelperlambda0 = RequestPayload.write$default(176, 167, PsExtractor.AUDIO_STREAM, 0, 8, null);

    /* JADX INFO: renamed from: getOnBackPressedDispatcherannotations, reason: from kotlin metadata */
    private static final long getSavedStateRegistryControllerannotations = RequestPayload.write$default(204, 194, 220, 0, 8, null);

    /* JADX INFO: renamed from: addOnMultiWindowModeChangedListener, reason: from kotlin metadata */
    private static final long addMenuProvider = RequestPayload.write$default(232, 222, 248, 0, 8, null);
    private static final long addOnContextAvailableListener = RequestPayload.write$default(246, 237, 255, 0, 8, null);

    /* JADX INFO: renamed from: addOnNewIntentListener, reason: from kotlin metadata */
    private static final long addOnPictureInPictureModeChangedListener = RequestPayload.write$default(255, 251, 254, 0, 8, null);

    /* JADX INFO: renamed from: addOnPictureInPictureModeChangedListener, reason: from kotlin metadata */
    private static final long addOnNewIntentListener = RequestPayload.write$default(0, 0, 0, 0, 8, null);
    private static final long addOnConfigurationChangedListener = RequestPayload.write$default(49, 17, 29, 0, 8, null);

    /* JADX INFO: renamed from: addOnUserLeaveHintListener, reason: from kotlin metadata */
    private static final long addOnMultiWindowModeChangedListener = RequestPayload.write$default(255, 255, 255, 0, 8, null);

    /* JADX INFO: renamed from: getActivityResultRegistry, reason: from kotlin metadata */
    private static final long addOnTrimMemoryListener = RequestPayload.write$default(73, 37, 50, 0, 8, null);

    /* JADX INFO: renamed from: getDefaultViewModelCreationExtras, reason: from kotlin metadata */
    private static final long getActivityResultRegistry = RequestPayload.write$default(99, 59, 72, 0, 8, null);

    /* JADX INFO: renamed from: addOnTrimMemoryListener, reason: from kotlin metadata */
    private static final long addOnUserLeaveHintListener = RequestPayload.write$default(125, 82, 96, 0, 8, null);

    /* JADX INFO: renamed from: getDefaultViewModelProviderFactory, reason: from kotlin metadata */
    private static final long getDefaultViewModelCreationExtras = RequestPayload.write$default(152, 105, 119, 0, 8, null);

    /* JADX INFO: renamed from: getOnBackPressedDispatcher, reason: from kotlin metadata */
    private static final long getDefaultViewModelProviderFactory = RequestPayload.write$default(181, TarConstants.PREFIXLEN_XSTAR, 146, 0, 8, null);

    /* JADX INFO: renamed from: getLifecycle, reason: from kotlin metadata */
    private static final long getSavedStateRegistry = RequestPayload.write$default(210, 157, TsExtractor.TS_STREAM_TYPE_AC4, 0, 8, null);

    /* JADX INFO: renamed from: getLastCustomNonConfigurationInstance, reason: from kotlin metadata */
    private static final long getLifecycle = RequestPayload.write$default(239, 184, 200, 0, 8, null);

    /* JADX INFO: renamed from: getSavedStateRegistry, reason: from kotlin metadata */
    private static final long getOnBackPressedDispatcher = RequestPayload.write$default(255, 216, 228, 0, 8, null);
    private static final long getFullyDrawnReporter = RequestPayload.write$default(255, 236, 241, 0, 8, null);

    /* JADX INFO: renamed from: onActivityResult, reason: from kotlin metadata */
    private static final long getLastCustomNonConfigurationInstance = RequestPayload.write$default(255, 251, 250, 0, 8, null);

    /* JADX INFO: renamed from: initializeViewTreeOwners, reason: from kotlin metadata */
    private static final long onActivityResult = RequestPayload.write$default(255, 255, 255, 0, 8, null);

    private _checkRangeBoundsForByteArray() {
    }

    public final long read() {
        return AudioAttributesCompatParcelizer;
    }

    public final long IconCompatParcelizer() {
        return RemoteActionCompatParcelizer;
    }

    public final long RemoteActionCompatParcelizer() {
        return AudioAttributesImplApi26Parcelizer;
    }

    public final long AudioAttributesCompatParcelizer() {
        return MediaDescriptionCompat;
    }

    public final long write() {
        return MediaBrowserCompatSearchResultReceiver;
    }

    public final long MediaBrowserCompatCustomActionResultReceiver() {
        return onCustomAction;
    }

    public final long MediaBrowserCompatItemReceiver() {
        return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final long AudioAttributesImplApi21Parcelizer() {
        return onCommand;
    }

    public final long AudioAttributesImplBaseParcelizer() {
        return onPrepareFromUri;
    }

    public final long AudioAttributesImplApi26Parcelizer() {
        return onSeekTo;
    }

    public final long RatingCompat() {
        return onRewind;
    }

    public final long MediaBrowserCompatSearchResultReceiver() {
        return onRemoveQueueItem;
    }

    public final long MediaDescriptionCompat() {
        return onRemoveQueueItemAt;
    }

    public final long MediaBrowserCompatMediaItem() {
        return onSetShuffleMode;
    }

    public final long MediaMetadataCompat() {
        return onSetRating;
    }

    public final long onAddQueueItem() {
        return onSkipToPrevious;
    }

    public final long onCustomAction() {
        return onSkipToNext;
    }

    public final long MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return PlaybackStateCompat;
    }

    public final long handleMediaPlayPauseIfPendingOnHandler() {
        return ParcelableVolumeInfo;
    }

    public final long onCommand() {
        return ResultReceiver;
    }

    public final long onPause() {
        return r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    }

    public final long onPlayFromMediaId() {
        return r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    }

    public final long onMediaButtonEvent() {
        return r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    }

    public final long onFastForward() {
        return accessensureViewModelStore;
    }

    public final long onPlay() {
        return _init_lambda5;
    }

    public final long onPrepare() {
        return ensureViewModelStore;
    }

    public final long onPlayFromSearch() {
        return createFullyDrawnExecutor;
    }

    public final long onPrepareFromMediaId() {
        return addObserverForBackInvoker;
    }

    public final long onPlayFromUri() {
        return accessonBackPresseds1027565324;
    }

    public final long onPrepareFromSearch() {
        return getSavedStateRegistryControllerannotations;
    }

    public final long onRemoveQueueItemAt() {
        return addMenuProvider;
    }

    public final long onRemoveQueueItem() {
        return addOnConfigurationChangedListener;
    }

    public final long onRewind() {
        return addOnMultiWindowModeChangedListener;
    }

    public final long onPrepareFromUri() {
        return getActivityResultRegistry;
    }

    public final long onSeekTo() {
        return addOnUserLeaveHintListener;
    }

    public final long onSetCaptioningEnabled() {
        return getLifecycle;
    }

    public final long onSetRating() {
        return getOnBackPressedDispatcher;
    }
}
