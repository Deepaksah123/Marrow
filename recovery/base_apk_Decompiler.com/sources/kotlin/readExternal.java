package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\"\u0018\u00002\u00020\u0001Bµ\u0002\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002¢\u0006\u0004\b!\u0010\"B\u009f\u0001\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b!\u0010#J\u001a\u0010%\u001a\u00020$2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,R\u0011\u0010/\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b-\u0010.R\u0011\u00101\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b0\u0010.R\u0011\u00103\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b2\u0010.R\u0011\u00105\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b4\u0010.R\u0011\u00107\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b6\u0010.R\u0011\u00109\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b8\u0010.R\u0011\u0010;\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b:\u0010.R\u0011\u00100\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b<\u0010.R\u0011\u0010>\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b=\u0010.R\u0011\u0010-\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b/\u0010.R\u0011\u0010?\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b1\u0010.R\u0011\u00102\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b3\u0010.R\u0017\u0010B\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b@\u0010.\u001a\u0004\b1\u0010AR\u0014\u00104\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u0010.R\u0014\u00106\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010.R\u0014\u00108\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b;\u0010.R\u0014\u0010@\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b9\u0010.R\u0014\u0010E\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bB\u0010.R\u0014\u0010F\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b?\u0010.R\u0014\u0010G\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bF\u0010.R\u0014\u0010H\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bE\u0010.R\u0014\u0010D\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bI\u0010.R\u0014\u0010:\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bJ\u0010.R\u0014\u0010L\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bK\u0010.R\u0014\u0010C\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b5\u0010.R\u0014\u0010<\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b7\u0010.R\u0014\u0010K\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b>\u0010.R\u0014\u0010=\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bG\u0010.R\u0014\u0010I\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bH\u0010.R\u0014\u0010J\u001a\u00020\u00028\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bL\u0010."}, d2 = {"Lo/readExternal;", "", "Lo/deserializeWithObjectId;", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "p23", "p24", "p25", "p26", "p27", "p28", "p29", "<init>", "(Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;)V", "(Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;Lo/deserializeWithObjectId;)V", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "AudioAttributesImplApi21Parcelizer", "Lo/deserializeWithObjectId;", "write", "MediaBrowserCompatItemReceiver", "read", "MediaMetadataCompat", "AudioAttributesCompatParcelizer", "MediaBrowserCompatSearchResultReceiver", "IconCompatParcelizer", "RatingCompat", "RemoteActionCompatParcelizer", "onCustomAction", "AudioAttributesImplBaseParcelizer", "onPause", "MediaBrowserCompatCustomActionResultReceiver", "onPlayFromUri", "onPrepareFromSearch", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatMediaItem", "handleMediaPlayPauseIfPendingOnHandler", "()Lo/deserializeWithObjectId;", "MediaDescriptionCompat", "onFastForward", "onPlayFromMediaId", "onCommand", "onAddQueueItem", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onPlay", "onPlayFromSearch", "onPrepare", "onPrepareFromMediaId", "onMediaButtonEvent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class readExternal {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final deserializeWithObjectId MediaMetadataCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final deserializeWithObjectId write;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final deserializeWithObjectId onPrepareFromMediaId;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final deserializeWithObjectId handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final deserializeWithObjectId onFastForward;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final deserializeWithObjectId onCustomAction;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final deserializeWithObjectId read;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final deserializeWithObjectId onAddQueueItem;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final deserializeWithObjectId IconCompatParcelizer;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final deserializeWithObjectId onPrepareFromSearch;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final deserializeWithObjectId onCommand;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final deserializeWithObjectId AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final deserializeWithObjectId RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final deserializeWithObjectId onPlayFromUri;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final deserializeWithObjectId MediaDescriptionCompat;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final deserializeWithObjectId MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final deserializeWithObjectId onPlay;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final deserializeWithObjectId AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final deserializeWithObjectId MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final deserializeWithObjectId onPrepare;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final deserializeWithObjectId MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final deserializeWithObjectId onPlayFromSearch;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final deserializeWithObjectId RatingCompat;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private final deserializeWithObjectId onPlayFromMediaId;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private final deserializeWithObjectId MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private final deserializeWithObjectId onPause;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private final deserializeWithObjectId onMediaButtonEvent;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private final deserializeWithObjectId AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final deserializeWithObjectId MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final deserializeWithObjectId AudioAttributesImplApi21Parcelizer;

    public readExternal(deserializeWithObjectId deserializewithobjectid, deserializeWithObjectId deserializewithobjectid2, deserializeWithObjectId deserializewithobjectid3, deserializeWithObjectId deserializewithobjectid4, deserializeWithObjectId deserializewithobjectid5, deserializeWithObjectId deserializewithobjectid6, deserializeWithObjectId deserializewithobjectid7, deserializeWithObjectId deserializewithobjectid8, deserializeWithObjectId deserializewithobjectid9, deserializeWithObjectId deserializewithobjectid10, deserializeWithObjectId deserializewithobjectid11, deserializeWithObjectId deserializewithobjectid12, deserializeWithObjectId deserializewithobjectid13, deserializeWithObjectId deserializewithobjectid14, deserializeWithObjectId deserializewithobjectid15, deserializeWithObjectId deserializewithobjectid16, deserializeWithObjectId deserializewithobjectid17, deserializeWithObjectId deserializewithobjectid18, deserializeWithObjectId deserializewithobjectid19, deserializeWithObjectId deserializewithobjectid20, deserializeWithObjectId deserializewithobjectid21, deserializeWithObjectId deserializewithobjectid22, deserializeWithObjectId deserializewithobjectid23, deserializeWithObjectId deserializewithobjectid24, deserializeWithObjectId deserializewithobjectid25, deserializeWithObjectId deserializewithobjectid26, deserializeWithObjectId deserializewithobjectid27, deserializeWithObjectId deserializewithobjectid28, deserializeWithObjectId deserializewithobjectid29, deserializeWithObjectId deserializewithobjectid30) {
        this.write = deserializewithobjectid;
        this.read = deserializewithobjectid2;
        this.AudioAttributesCompatParcelizer = deserializewithobjectid3;
        this.IconCompatParcelizer = deserializewithobjectid4;
        this.RemoteActionCompatParcelizer = deserializewithobjectid5;
        this.AudioAttributesImplBaseParcelizer = deserializewithobjectid6;
        this.MediaBrowserCompatCustomActionResultReceiver = deserializewithobjectid7;
        this.MediaBrowserCompatItemReceiver = deserializewithobjectid8;
        this.AudioAttributesImplApi26Parcelizer = deserializewithobjectid9;
        this.AudioAttributesImplApi21Parcelizer = deserializewithobjectid10;
        this.MediaBrowserCompatMediaItem = deserializewithobjectid11;
        this.MediaMetadataCompat = deserializewithobjectid12;
        this.MediaDescriptionCompat = deserializewithobjectid13;
        this.MediaBrowserCompatSearchResultReceiver = deserializewithobjectid14;
        this.RatingCompat = deserializewithobjectid15;
        this.onCustomAction = deserializewithobjectid16;
        this.handleMediaPlayPauseIfPendingOnHandler = deserializewithobjectid17;
        this.onCommand = deserializewithobjectid18;
        this.onAddQueueItem = deserializewithobjectid19;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = deserializewithobjectid20;
        this.onPlay = deserializewithobjectid21;
        this.onPlayFromMediaId = deserializewithobjectid22;
        this.onPause = deserializewithobjectid23;
        this.onMediaButtonEvent = deserializewithobjectid24;
        this.onFastForward = deserializewithobjectid25;
        this.onPlayFromUri = deserializewithobjectid26;
        this.onPrepareFromMediaId = deserializewithobjectid27;
        this.onPrepareFromSearch = deserializewithobjectid28;
        this.onPlayFromSearch = deserializewithobjectid29;
        this.onPrepare = deserializewithobjectid30;
    }

    public /* synthetic */ readExternal(deserializeWithObjectId deserializewithobjectid, deserializeWithObjectId deserializewithobjectid2, deserializeWithObjectId deserializewithobjectid3, deserializeWithObjectId deserializewithobjectid4, deserializeWithObjectId deserializewithobjectid5, deserializeWithObjectId deserializewithobjectid6, deserializeWithObjectId deserializewithobjectid7, deserializeWithObjectId deserializewithobjectid8, deserializeWithObjectId deserializewithobjectid9, deserializeWithObjectId deserializewithobjectid10, deserializeWithObjectId deserializewithobjectid11, deserializeWithObjectId deserializewithobjectid12, deserializeWithObjectId deserializewithobjectid13, deserializeWithObjectId deserializewithobjectid14, deserializeWithObjectId deserializewithobjectid15, deserializeWithObjectId deserializewithobjectid16, deserializeWithObjectId deserializewithobjectid17, deserializeWithObjectId deserializewithobjectid18, deserializeWithObjectId deserializewithobjectid19, deserializeWithObjectId deserializewithobjectid20, deserializeWithObjectId deserializewithobjectid21, deserializeWithObjectId deserializewithobjectid22, deserializeWithObjectId deserializewithobjectid23, deserializeWithObjectId deserializewithobjectid24, deserializeWithObjectId deserializewithobjectid25, deserializeWithObjectId deserializewithobjectid26, deserializeWithObjectId deserializewithobjectid27, deserializeWithObjectId deserializewithobjectid28, deserializeWithObjectId deserializewithobjectid29, deserializeWithObjectId deserializewithobjectid30, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? _checkRangeBoundsForString.INSTANCE.AudioAttributesImplApi26Parcelizer() : deserializewithobjectid, (i & 2) != 0 ? _checkRangeBoundsForString.INSTANCE.AudioAttributesImplApi21Parcelizer() : deserializewithobjectid2, (i & 4) != 0 ? _checkRangeBoundsForString.INSTANCE.MediaDescriptionCompat() : deserializewithobjectid3, (i & 8) != 0 ? _checkRangeBoundsForString.INSTANCE.MediaMetadataCompat() : deserializewithobjectid4, (i & 16) != 0 ? _checkRangeBoundsForString.INSTANCE.RatingCompat() : deserializewithobjectid5, (i & 32) != 0 ? _checkRangeBoundsForString.INSTANCE.onCustomAction() : deserializewithobjectid6, (i & 64) != 0 ? _checkRangeBoundsForString.INSTANCE.onFastForward() : deserializewithobjectid7, (i & 128) != 0 ? _checkRangeBoundsForString.INSTANCE.onPrepareFromMediaId() : deserializewithobjectid8, (i & 256) != 0 ? _checkRangeBoundsForString.INSTANCE.onPrepare() : deserializewithobjectid9, (i & 512) != 0 ? _checkRangeBoundsForString.INSTANCE.IconCompatParcelizer() : deserializewithobjectid10, (i & 1024) != 0 ? _checkRangeBoundsForString.INSTANCE.AudioAttributesCompatParcelizer() : deserializewithobjectid11, (i & 2048) != 0 ? _checkRangeBoundsForString.INSTANCE.RemoteActionCompatParcelizer() : deserializewithobjectid12, (i & 4096) != 0 ? _checkRangeBoundsForString.INSTANCE.handleMediaPlayPauseIfPendingOnHandler() : deserializewithobjectid13, (i & 8192) != 0 ? _checkRangeBoundsForString.INSTANCE.onPause() : deserializewithobjectid14, (i & 16384) != 0 ? _checkRangeBoundsForString.INSTANCE.onMediaButtonEvent() : deserializewithobjectid15, (i & 32768) != 0 ? _checkRangeBoundsForString.INSTANCE.AudioAttributesImplBaseParcelizer() : deserializewithobjectid16, (i & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? _checkRangeBoundsForString.INSTANCE.MediaBrowserCompatCustomActionResultReceiver() : deserializewithobjectid17, (i & 131072) != 0 ? _checkRangeBoundsForString.INSTANCE.MediaBrowserCompatMediaItem() : deserializewithobjectid18, (i & 262144) != 0 ? _checkRangeBoundsForString.INSTANCE.MediaBrowserCompatSearchResultReceiver() : deserializewithobjectid19, (i & 524288) != 0 ? _checkRangeBoundsForString.INSTANCE.onCommand() : deserializewithobjectid20, (i & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? _checkRangeBoundsForString.INSTANCE.onAddQueueItem() : deserializewithobjectid21, (i & 2097152) != 0 ? _checkRangeBoundsForString.INSTANCE.onPlayFromSearch() : deserializewithobjectid22, (i & 4194304) != 0 ? _checkRangeBoundsForString.INSTANCE.onPrepareFromSearch() : deserializewithobjectid23, (i & 8388608) != 0 ? _checkRangeBoundsForString.INSTANCE.onPlayFromUri() : deserializewithobjectid24, (i & BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? _checkRangeBoundsForString.INSTANCE.write() : deserializewithobjectid25, (i & 33554432) != 0 ? _checkRangeBoundsForString.INSTANCE.read() : deserializewithobjectid26, (i & 67108864) != 0 ? _checkRangeBoundsForString.INSTANCE.MediaBrowserCompatItemReceiver() : deserializewithobjectid27, (i & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? _checkRangeBoundsForString.INSTANCE.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() : deserializewithobjectid28, (i & 268435456) != 0 ? _checkRangeBoundsForString.INSTANCE.onPlay() : deserializewithobjectid29, (i & 536870912) != 0 ? _checkRangeBoundsForString.INSTANCE.onPlayFromMediaId() : deserializewithobjectid30);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final deserializeWithObjectId getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    public /* synthetic */ readExternal(deserializeWithObjectId deserializewithobjectid, deserializeWithObjectId deserializewithobjectid2, deserializeWithObjectId deserializewithobjectid3, deserializeWithObjectId deserializewithobjectid4, deserializeWithObjectId deserializewithobjectid5, deserializeWithObjectId deserializewithobjectid6, deserializeWithObjectId deserializewithobjectid7, deserializeWithObjectId deserializewithobjectid8, deserializeWithObjectId deserializewithobjectid9, deserializeWithObjectId deserializewithobjectid10, deserializeWithObjectId deserializewithobjectid11, deserializeWithObjectId deserializewithobjectid12, deserializeWithObjectId deserializewithobjectid13, deserializeWithObjectId deserializewithobjectid14, deserializeWithObjectId deserializewithobjectid15, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? _checkRangeBoundsForString.INSTANCE.AudioAttributesImplApi26Parcelizer() : deserializewithobjectid, (i & 2) != 0 ? _checkRangeBoundsForString.INSTANCE.AudioAttributesImplApi21Parcelizer() : deserializewithobjectid2, (i & 4) != 0 ? _checkRangeBoundsForString.INSTANCE.MediaDescriptionCompat() : deserializewithobjectid3, (i & 8) != 0 ? _checkRangeBoundsForString.INSTANCE.MediaMetadataCompat() : deserializewithobjectid4, (i & 16) != 0 ? _checkRangeBoundsForString.INSTANCE.RatingCompat() : deserializewithobjectid5, (i & 32) != 0 ? _checkRangeBoundsForString.INSTANCE.onCustomAction() : deserializewithobjectid6, (i & 64) != 0 ? _checkRangeBoundsForString.INSTANCE.onFastForward() : deserializewithobjectid7, (i & 128) != 0 ? _checkRangeBoundsForString.INSTANCE.onPrepareFromMediaId() : deserializewithobjectid8, (i & 256) != 0 ? _checkRangeBoundsForString.INSTANCE.onPrepare() : deserializewithobjectid9, (i & 512) != 0 ? _checkRangeBoundsForString.INSTANCE.IconCompatParcelizer() : deserializewithobjectid10, (i & 1024) != 0 ? _checkRangeBoundsForString.INSTANCE.AudioAttributesCompatParcelizer() : deserializewithobjectid11, (i & 2048) != 0 ? _checkRangeBoundsForString.INSTANCE.RemoteActionCompatParcelizer() : deserializewithobjectid12, (i & 4096) != 0 ? _checkRangeBoundsForString.INSTANCE.handleMediaPlayPauseIfPendingOnHandler() : deserializewithobjectid13, (i & 8192) != 0 ? _checkRangeBoundsForString.INSTANCE.onPause() : deserializewithobjectid14, (i & 16384) != 0 ? _checkRangeBoundsForString.INSTANCE.onMediaButtonEvent() : deserializewithobjectid15);
    }

    public readExternal(deserializeWithObjectId deserializewithobjectid, deserializeWithObjectId deserializewithobjectid2, deserializeWithObjectId deserializewithobjectid3, deserializeWithObjectId deserializewithobjectid4, deserializeWithObjectId deserializewithobjectid5, deserializeWithObjectId deserializewithobjectid6, deserializeWithObjectId deserializewithobjectid7, deserializeWithObjectId deserializewithobjectid8, deserializeWithObjectId deserializewithobjectid9, deserializeWithObjectId deserializewithobjectid10, deserializeWithObjectId deserializewithobjectid11, deserializeWithObjectId deserializewithobjectid12, deserializeWithObjectId deserializewithobjectid13, deserializeWithObjectId deserializewithobjectid14, deserializeWithObjectId deserializewithobjectid15) {
        this(deserializewithobjectid, deserializewithobjectid2, deserializewithobjectid3, deserializewithobjectid4, deserializewithobjectid5, deserializewithobjectid6, deserializewithobjectid7, deserializewithobjectid8, deserializewithobjectid9, deserializewithobjectid10, deserializewithobjectid11, deserializewithobjectid12, deserializewithobjectid13, deserializewithobjectid14, deserializewithobjectid15, deserializewithobjectid, deserializewithobjectid2, deserializewithobjectid3, deserializewithobjectid4, deserializewithobjectid5, deserializewithobjectid6, deserializewithobjectid7, deserializewithobjectid8, deserializewithobjectid9, deserializewithobjectid10, deserializewithobjectid11, deserializewithobjectid12, deserializewithobjectid13, deserializewithobjectid14, deserializewithobjectid15);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof readExternal)) {
            return false;
        }
        readExternal readexternal = (readExternal) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, readexternal.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, readexternal.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, readexternal.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, readexternal.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, readexternal.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, readexternal.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, readexternal.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, readexternal.MediaBrowserCompatItemReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi26Parcelizer, readexternal.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, readexternal.AudioAttributesImplApi21Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, readexternal.MediaBrowserCompatMediaItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaMetadataCompat, readexternal.MediaMetadataCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaDescriptionCompat, readexternal.MediaDescriptionCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver, readexternal.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RatingCompat, readexternal.RatingCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onCustomAction, readexternal.onCustomAction) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, readexternal.handleMediaPlayPauseIfPendingOnHandler) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onCommand, readexternal.onCommand) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onAddQueueItem, readexternal.onAddQueueItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, readexternal.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onPlay, readexternal.onPlay) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onPlayFromMediaId, readexternal.onPlayFromMediaId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onPause, readexternal.onPause) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onMediaButtonEvent, readexternal.onMediaButtonEvent) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onFastForward, readexternal.onFastForward) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onPlayFromUri, readexternal.onPlayFromUri) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onPrepareFromMediaId, readexternal.onPrepareFromMediaId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onPrepareFromSearch, readexternal.onPrepareFromSearch) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onPlayFromSearch, readexternal.onPlayFromSearch) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onPrepare, readexternal.onPrepare);
    }

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.read.hashCode();
        int iHashCode3 = this.AudioAttributesCompatParcelizer.hashCode();
        int iHashCode4 = this.IconCompatParcelizer.hashCode();
        int iHashCode5 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode6 = this.AudioAttributesImplBaseParcelizer.hashCode();
        int iHashCode7 = this.MediaBrowserCompatCustomActionResultReceiver.hashCode();
        int iHashCode8 = this.MediaBrowserCompatItemReceiver.hashCode();
        int iHashCode9 = this.AudioAttributesImplApi26Parcelizer.hashCode();
        int iHashCode10 = this.AudioAttributesImplApi21Parcelizer.hashCode();
        int iHashCode11 = this.MediaBrowserCompatMediaItem.hashCode();
        int iHashCode12 = this.MediaMetadataCompat.hashCode();
        int iHashCode13 = this.MediaDescriptionCompat.hashCode();
        int iHashCode14 = this.MediaBrowserCompatSearchResultReceiver.hashCode();
        int iHashCode15 = this.RatingCompat.hashCode();
        int iHashCode16 = this.onCustomAction.hashCode();
        int iHashCode17 = this.handleMediaPlayPauseIfPendingOnHandler.hashCode();
        int iHashCode18 = this.onCommand.hashCode();
        int iHashCode19 = this.onAddQueueItem.hashCode();
        int iHashCode20 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.hashCode();
        int iHashCode21 = this.onPlay.hashCode();
        int iHashCode22 = this.onPlayFromMediaId.hashCode();
        int iHashCode23 = this.onPause.hashCode();
        int iHashCode24 = this.onMediaButtonEvent.hashCode();
        int iHashCode25 = this.onFastForward.hashCode();
        int iHashCode26 = this.onPlayFromUri.hashCode();
        int iHashCode27 = this.onPrepareFromMediaId.hashCode();
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + this.onPrepareFromSearch.hashCode()) * 31) + this.onPlayFromSearch.hashCode()) * 31) + this.onPrepare.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Typography(displayLarge=");
        sb.append(this.write);
        sb.append(", displayMedium=");
        sb.append(this.read);
        sb.append(",displaySmall=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", headlineLarge=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", headlineMedium=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", headlineSmall=");
        sb.append(this.AudioAttributesImplBaseParcelizer);
        sb.append(", titleLarge=");
        sb.append(this.MediaBrowserCompatCustomActionResultReceiver);
        sb.append(", titleMedium=");
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(", titleSmall=");
        sb.append(this.AudioAttributesImplApi26Parcelizer);
        sb.append(", bodyLarge=");
        sb.append(this.AudioAttributesImplApi21Parcelizer);
        sb.append(", bodyMedium=");
        sb.append(this.MediaBrowserCompatMediaItem);
        sb.append(", bodySmall=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", labelLarge=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", labelMedium=");
        sb.append(this.MediaBrowserCompatSearchResultReceiver);
        sb.append(", labelSmall=");
        sb.append(this.RatingCompat);
        sb.append(", displayLargeEmphasized=");
        sb.append(this.onCustomAction);
        sb.append(", displayMediumEmphasized=");
        sb.append(this.handleMediaPlayPauseIfPendingOnHandler);
        sb.append(", displaySmallEmphasized=");
        sb.append(this.onCommand);
        sb.append(", headlineLargeEmphasized=");
        sb.append(this.onAddQueueItem);
        sb.append(", headlineMediumEmphasized=");
        sb.append(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        sb.append(", headlineSmallEmphasized=");
        sb.append(this.onPlay);
        sb.append(", titleLargeEmphasized=");
        sb.append(this.onPlayFromMediaId);
        sb.append(", titleMediumEmphasized=");
        sb.append(this.onPause);
        sb.append(", titleSmallEmphasized=");
        sb.append(this.onMediaButtonEvent);
        sb.append(", bodyLargeEmphasized=");
        sb.append(this.onFastForward);
        sb.append(", bodyMediumEmphasized=");
        sb.append(this.onPlayFromUri);
        sb.append(", bodySmallEmphasized=");
        sb.append(this.onPrepareFromMediaId);
        sb.append(", labelLargeEmphasized=");
        sb.append(this.onPrepareFromSearch);
        sb.append(", labelMediumEmphasized=");
        sb.append(this.onPlayFromSearch);
        sb.append(", labelSmallEmphasized=");
        sb.append(this.onPrepare);
        sb.append(')');
        return sb.toString();
    }

    public readExternal() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 1073741823, null);
    }
}
