package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.marrow2.data.test.remote.model.RankPairModel;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000e\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b;\b\u0086\b\u0018\u00002\u00020\u0001B«\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n\u0012\b\b\u0002\u0010\u000f\u001a\u00020\n\u0012\b\b\u0002\u0010\u0010\u001a\u00020\n\u0012\b\b\u0002\u0010\u0011\u001a\u00020\n\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\n\u0012\b\b\u0002\u0010\u001b\u001a\u00020\n\u0012\b\b\u0002\u0010\u001c\u001a\u00020\n\u0012\b\b\u0002\u0010\u001d\u001a\u00020\n\u0012\b\b\u0002\u0010\u001e\u001a\u00020\n\u0012\b\b\u0002\u0010\u001f\u001a\u00020\n\u0012\b\b\u0002\u0010 \u001a\u00020\n\u0012\b\b\u0002\u0010!\u001a\u00020\n\u0012\b\b\u0002\u0010\"\u001a\u00020\u0015\u0012\b\b\u0002\u0010#\u001a\u00020\n\u0012\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00020$\u0012\b\b\u0002\u0010&\u001a\u00020\u0006\u0012\u0014\b\u0002\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020(0'\u0012\u0014\b\u0002\u0010*\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020(0'\u0012\u000e\b\u0002\u0010,\u001a\b\u0012\u0004\u0012\u00020+0$\u0012\u000e\b\u0002\u0010-\u001a\b\u0012\u0004\u0012\u00020+0$\u0012\u000e\b\u0002\u0010/\u001a\b\u0012\u0004\u0012\u00020.0$\u0012\b\b\u0002\u00101\u001a\u000200¢\u0006\u0004\b2\u00103J\u001a\u00104\u001a\u00020\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b8\u00109R\u0011\u0010<\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b:\u0010;R\u0011\u0010>\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b=\u0010;R\u0011\u0010@\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b?\u0010;R\u0011\u0010C\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\bA\u0010BR\u0011\u0010E\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\bD\u0010BR\u0011\u0010G\u001a\u00020\u00068\u0006¢\u0006\u0006\n\u0004\bF\u0010BR\u0011\u0010I\u001a\u00020\n8\u0006¢\u0006\u0006\n\u0004\b<\u0010HR\u0011\u0010K\u001a\u00020\n8\u0006¢\u0006\u0006\n\u0004\bJ\u0010HR\u0011\u0010M\u001a\u00020\n8\u0006¢\u0006\u0006\n\u0004\bL\u0010HR\u0011\u0010O\u001a\u00020\n8\u0006¢\u0006\u0006\n\u0004\bN\u0010HR\u0011\u0010Q\u001a\u00020\n8\u0006¢\u0006\u0006\n\u0004\bP\u0010HR\u0011\u0010S\u001a\u00020\n8\u0006¢\u0006\u0006\n\u0004\bR\u0010HR\u0011\u0010U\u001a\u00020\n8\u0006¢\u0006\u0006\n\u0004\bT\u0010HR\u0011\u0010X\u001a\u00020\u00128\u0006¢\u0006\u0006\n\u0004\bV\u0010WR\u0011\u0010Z\u001a\u00020\u00128\u0006¢\u0006\u0006\n\u0004\bY\u0010WR\u0011\u0010]\u001a\u00020\u00158\u0006¢\u0006\u0006\n\u0004\b[\u0010\\R\u0017\u0010_\u001a\u00020\u00068\u0007¢\u0006\f\n\u0004\bS\u0010B\u001a\u0004\bU\u0010^R\u0014\u0010F\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bZ\u0010BR\u001a\u0010A\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010B\u001a\u0004\bZ\u0010^R\u001c\u0010D\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010`\u001a\u0004\bM\u0010aR\u001a\u0010b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u00107R\u001a\u0010[\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bU\u0010H\u001a\u0004\bO\u00107R\u001a\u0010c\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010H\u001a\u0004\b<\u00107R\u001a\u0010J\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010H\u001a\u0004\bC\u00107R\u001a\u0010d\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u0010H\u001a\u0004\bE\u00107R\u001a\u0010Y\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010H\u001a\u0004\bK\u00107R\u001a\u0010V\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bd\u0010H\u001a\u0004\bS\u00107R\u001a\u0010T\u001a\u00020\u00158\u0007X\u0087\u0004¢\u0006\f\n\u0004\be\u0010\\\u001a\u0004\bX\u0010fR\u001a\u0010:\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010H\u001a\u0004\b@\u00107R\u001a\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00020$8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bc\u0010gR\u0014\u0010?\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b_\u0010BR \u0010N\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020(0'8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bh\u0010iR \u0010=\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020(0'8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010iR \u0010P\u001a\b\u0012\u0004\u0012\u00020+0$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010g\u001a\u0004\b>\u0010jR \u0010R\u001a\b\u0012\u0004\u0012\u00020+0$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010g\u001a\u0004\bG\u0010jR \u0010h\u001a\b\u0012\u0004\u0012\u00020.0$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bb\u0010g\u001a\u0004\bQ\u0010jR\u0014\u0010e\u001a\u0002008\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010k"}, d2 = {"Lo/setExpandedTitleTextColor;", "", "", "p0", "p1", "p2", "", "p3", "p4", "p5", "", "p6", "p7", "p8", "p9", "p10", "p11", "p12", "", "p13", "p14", "", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "p23", "p24", "p25", "p26", "p27", "p28", "", "p29", "p30", "", "Lo/onProviderInstalled;", "p31", "p32", "Lo/uncaughtException;", "p33", "p34", "Lcom/marrow2/data/test/remote/model/RankPairModel;", "p35", "Lo/installIfNeededAsync;", "p36", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZZIIIIIIIDDJZZZLjava/lang/Integer;IIIIIIIJILjava/util/List;ZLjava/util/Map;Ljava/util/Map;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lo/installIfNeededAsync;)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "onPrepareFromSearch", "Ljava/lang/String;", "RemoteActionCompatParcelizer", "onRemoveQueueItemAt", "AudioAttributesCompatParcelizer", "onPrepareFromUri", "IconCompatParcelizer", "onAddQueueItem", "Z", "write", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "read", "onCommand", "MediaBrowserCompatCustomActionResultReceiver", "I", "MediaBrowserCompatItemReceiver", "onFastForward", "AudioAttributesImplBaseParcelizer", "onPlayFromUri", "AudioAttributesImplApi21Parcelizer", "onRewind", "AudioAttributesImplApi26Parcelizer", "onRemoveQueueItem", "RatingCompat", "onSeekTo", "MediaDescriptionCompat", "onPrepare", "MediaBrowserCompatMediaItem", "onPlayFromSearch", "D", "MediaBrowserCompatSearchResultReceiver", "onPrepareFromMediaId", "MediaMetadataCompat", "onMediaButtonEvent", "J", "handleMediaPlayPauseIfPendingOnHandler", "()Z", "onCustomAction", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "onPlayFromMediaId", "onPause", "onPlay", "onSetRating", "()J", "Ljava/util/List;", "onSetCaptioningEnabled", "Ljava/util/Map;", "()Ljava/util/List;", "Lo/installIfNeededAsync;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setExpandedTitleTextColor {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final List<uncaughtException> onRemoveQueueItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final int onPlay;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final installIfNeededAsync onSetRating;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int onPrepareFromMediaId;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int onPrepareFromSearch;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final int onPlayFromMediaId;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final Map<String, onProviderInstalled> onRemoveQueueItemAt;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final int onMediaButtonEvent;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final List<uncaughtException> onSeekTo;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final boolean read;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final boolean onCustomAction;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final boolean onCommand;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final Integer MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final boolean onAddQueueItem;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final boolean write;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final boolean onPrepareFromUri;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final long handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final List<String> onPlayFromUri;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final int onPlayFromSearch;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final List<RankPairModel> onSetCaptioningEnabled;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private final double MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private final int AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private final int MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private final double MediaMetadataCompat;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: onRemoveQueueItem, reason: from kotlin metadata */
    private final int RatingCompat;

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: onRewind, reason: from kotlin metadata */
    private final int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: onSeekTo, reason: from kotlin metadata */
    private final int MediaDescriptionCompat;

    /* JADX INFO: renamed from: onSetCaptioningEnabled, reason: from kotlin metadata */
    private final Map<String, onProviderInstalled> onRewind;

    /* JADX INFO: renamed from: onSetRating, reason: from kotlin metadata */
    private final long onPrepare;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int onFastForward;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int onPause;

    private setExpandedTitleTextColor(String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5, int i6, int i7, double d, double d2, long j, boolean z4, boolean z5, boolean z6, Integer num, int i8, int i9, int i10, int i11, int i12, int i13, int i14, long j2, int i15, List<String> list, boolean z7, Map<String, onProviderInstalled> map, Map<String, onProviderInstalled> map2, List<uncaughtException> list2, List<uncaughtException> list3, List<RankPairModel> list4, installIfNeededAsync installifneededasync) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(map, "");
        toMagicModuleMetaRepoModel.write(map2, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        toMagicModuleMetaRepoModel.write(list4, "");
        toMagicModuleMetaRepoModel.write(installifneededasync, "");
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.IconCompatParcelizer = str3;
        this.write = z;
        this.read = z2;
        this.MediaBrowserCompatCustomActionResultReceiver = z3;
        this.MediaBrowserCompatItemReceiver = i;
        this.AudioAttributesImplBaseParcelizer = i2;
        this.AudioAttributesImplApi21Parcelizer = i3;
        this.AudioAttributesImplApi26Parcelizer = i4;
        this.RatingCompat = i5;
        this.MediaDescriptionCompat = i6;
        this.MediaBrowserCompatMediaItem = i7;
        this.MediaBrowserCompatSearchResultReceiver = d;
        this.MediaMetadataCompat = d2;
        this.handleMediaPlayPauseIfPendingOnHandler = j;
        this.onCustomAction = z4;
        this.onCommand = z5;
        this.onAddQueueItem = z6;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = num;
        this.onPlayFromMediaId = i8;
        this.onMediaButtonEvent = i9;
        this.onPause = i10;
        this.onFastForward = i11;
        this.onPlay = i12;
        this.onPrepareFromMediaId = i13;
        this.onPlayFromSearch = i14;
        this.onPrepare = j2;
        this.onPrepareFromSearch = i15;
        this.onPlayFromUri = list;
        this.onPrepareFromUri = z7;
        this.onRewind = map;
        this.onRemoveQueueItemAt = map2;
        this.onRemoveQueueItem = list2;
        this.onSeekTo = list3;
        this.onSetCaptioningEnabled = list4;
        this.onSetRating = installifneededasync;
    }

    public /* synthetic */ setExpandedTitleTextColor(String str, String str2, String str3, boolean z, boolean z2, boolean z3, int i, int i2, int i3, int i4, int i5, int i6, int i7, double d, double d2, long j, boolean z4, boolean z5, boolean z6, Integer num, int i8, int i9, int i10, int i11, int i12, int i13, int i14, long j2, int i15, List list, boolean z7, Map map, Map map2, List list2, List list3, List list4, installIfNeededAsync installifneededasync, int i16, int i17, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i16 & 1) != 0 ? "" : str, (i16 & 2) != 0 ? "" : str2, (i16 & 4) == 0 ? str3 : "", (i16 & 8) != 0 ? false : z, (i16 & 16) != 0 ? true : z2, (i16 & 32) == 0 ? z3 : true, (i16 & 64) != 0 ? 0 : i, (i16 & 128) != 0 ? 0 : i2, (i16 & 256) != 0 ? 0 : i3, (i16 & 512) != 0 ? 0 : i4, (i16 & 1024) != 0 ? 0 : i5, (i16 & 2048) != 0 ? 0 : i6, (i16 & 4096) != 0 ? 0 : i7, (i16 & 8192) != 0 ? 0.0d : d, (i16 & 16384) == 0 ? d2 : 0.0d, (32768 & i16) != 0 ? 0L : j, (65536 & i16) != 0 ? false : z4, (i16 & 131072) != 0 ? false : z5, (i16 & 262144) != 0 ? false : z6, (i16 & 524288) != 0 ? null : num, (i16 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? 0 : i8, (i16 & 2097152) != 0 ? 0 : i9, (i16 & 4194304) != 0 ? 0 : i10, (i16 & 8388608) != 0 ? 0 : i11, (i16 & BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? 0 : i12, (i16 & 33554432) != 0 ? 0 : i13, (i16 & 67108864) != 0 ? 0 : i14, (i16 & C.BUFFER_FLAG_FIRST_SAMPLE) == 0 ? j2 : 0L, (i16 & 268435456) != 0 ? 0 : i15, (i16 & 536870912) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i16 & 1073741824) == 0 ? z7 : false, (i16 & Integer.MIN_VALUE) != 0 ? VideoTimelineResponseBody.read() : map, (i17 & 1) != 0 ? VideoTimelineResponseBody.read() : map2, (i17 & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2, (i17 & 4) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list3, (i17 & 8) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list4, (i17 & 16) != 0 ? new installIfNeededAsync(0, null, null, null, 15, null) : installifneededasync);
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final boolean getOnCustomAction() {
        return this.onCustomAction;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final boolean getOnAddQueueItem() {
        return this.onAddQueueItem;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final Integer getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final int getOnPlayFromMediaId() {
        return this.onPlayFromMediaId;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getOnMediaButtonEvent() {
        return this.onMediaButtonEvent;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getOnPause() {
        return this.onPause;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getOnFastForward() {
        return this.onFastForward;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getOnPlay() {
        return this.onPlay;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final int getOnPrepareFromMediaId() {
        return this.onPrepareFromMediaId;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final int getOnPlayFromSearch() {
        return this.onPlayFromSearch;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final long getOnPrepare() {
        return this.onPrepare;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getOnPrepareFromSearch() {
        return this.onPrepareFromSearch;
    }

    public final List<uncaughtException> AudioAttributesCompatParcelizer() {
        return this.onRemoveQueueItem;
    }

    public final List<uncaughtException> MediaBrowserCompatCustomActionResultReceiver() {
        return this.onSeekTo;
    }

    public final List<RankPairModel> RatingCompat() {
        return this.onSetCaptioningEnabled;
    }

    public setExpandedTitleTextColor() {
        this(null, null, null, false, false, false, 0, 0, 0, 0, 0, 0, 0, 0.0d, 0.0d, 0L, false, false, false, null, 0, 0, 0, 0, 0, 0, 0, 0L, 0, null, false, null, null, null, null, null, null, -1, 31, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof setExpandedTitleTextColor)) {
            return false;
        }
        setExpandedTitleTextColor setexpandedtitletextcolor = (setExpandedTitleTextColor) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) setexpandedtitletextcolor.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) setexpandedtitletextcolor.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) setexpandedtitletextcolor.IconCompatParcelizer) && this.write == setexpandedtitletextcolor.write && this.read == setexpandedtitletextcolor.read && this.MediaBrowserCompatCustomActionResultReceiver == setexpandedtitletextcolor.MediaBrowserCompatCustomActionResultReceiver && this.MediaBrowserCompatItemReceiver == setexpandedtitletextcolor.MediaBrowserCompatItemReceiver && this.AudioAttributesImplBaseParcelizer == setexpandedtitletextcolor.AudioAttributesImplBaseParcelizer && this.AudioAttributesImplApi21Parcelizer == setexpandedtitletextcolor.AudioAttributesImplApi21Parcelizer && this.AudioAttributesImplApi26Parcelizer == setexpandedtitletextcolor.AudioAttributesImplApi26Parcelizer && this.RatingCompat == setexpandedtitletextcolor.RatingCompat && this.MediaDescriptionCompat == setexpandedtitletextcolor.MediaDescriptionCompat && this.MediaBrowserCompatMediaItem == setexpandedtitletextcolor.MediaBrowserCompatMediaItem && Double.compare(this.MediaBrowserCompatSearchResultReceiver, setexpandedtitletextcolor.MediaBrowserCompatSearchResultReceiver) == 0 && Double.compare(this.MediaMetadataCompat, setexpandedtitletextcolor.MediaMetadataCompat) == 0 && this.handleMediaPlayPauseIfPendingOnHandler == setexpandedtitletextcolor.handleMediaPlayPauseIfPendingOnHandler && this.onCustomAction == setexpandedtitletextcolor.onCustomAction && this.onCommand == setexpandedtitletextcolor.onCommand && this.onAddQueueItem == setexpandedtitletextcolor.onAddQueueItem && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, setexpandedtitletextcolor.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && this.onPlayFromMediaId == setexpandedtitletextcolor.onPlayFromMediaId && this.onMediaButtonEvent == setexpandedtitletextcolor.onMediaButtonEvent && this.onPause == setexpandedtitletextcolor.onPause && this.onFastForward == setexpandedtitletextcolor.onFastForward && this.onPlay == setexpandedtitletextcolor.onPlay && this.onPrepareFromMediaId == setexpandedtitletextcolor.onPrepareFromMediaId && this.onPlayFromSearch == setexpandedtitletextcolor.onPlayFromSearch && this.onPrepare == setexpandedtitletextcolor.onPrepare && this.onPrepareFromSearch == setexpandedtitletextcolor.onPrepareFromSearch && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onPlayFromUri, setexpandedtitletextcolor.onPlayFromUri) && this.onPrepareFromUri == setexpandedtitletextcolor.onPrepareFromUri && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onRewind, setexpandedtitletextcolor.onRewind) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onRemoveQueueItemAt, setexpandedtitletextcolor.onRemoveQueueItemAt) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onRemoveQueueItem, setexpandedtitletextcolor.onRemoveQueueItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onSeekTo, setexpandedtitletextcolor.onSeekTo) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onSetCaptioningEnabled, setexpandedtitletextcolor.onSetCaptioningEnabled) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onSetRating, setexpandedtitletextcolor.onSetRating);
    }

    public final int hashCode() {
        int iHashCode = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode2 = this.AudioAttributesCompatParcelizer.hashCode();
        int iHashCode3 = this.IconCompatParcelizer.hashCode();
        int iHashCode4 = Boolean.hashCode(this.write);
        int iHashCode5 = Boolean.hashCode(this.read);
        int iHashCode6 = Boolean.hashCode(this.MediaBrowserCompatCustomActionResultReceiver);
        int iHashCode7 = Integer.hashCode(this.MediaBrowserCompatItemReceiver);
        int iHashCode8 = Integer.hashCode(this.AudioAttributesImplBaseParcelizer);
        int iHashCode9 = Integer.hashCode(this.AudioAttributesImplApi21Parcelizer);
        int iHashCode10 = Integer.hashCode(this.AudioAttributesImplApi26Parcelizer);
        int iHashCode11 = Integer.hashCode(this.RatingCompat);
        int iHashCode12 = Integer.hashCode(this.MediaDescriptionCompat);
        int iHashCode13 = Integer.hashCode(this.MediaBrowserCompatMediaItem);
        int iHashCode14 = Double.hashCode(this.MediaBrowserCompatSearchResultReceiver);
        int iHashCode15 = Double.hashCode(this.MediaMetadataCompat);
        int iHashCode16 = Long.hashCode(this.handleMediaPlayPauseIfPendingOnHandler);
        int iHashCode17 = Boolean.hashCode(this.onCustomAction);
        int iHashCode18 = Boolean.hashCode(this.onCommand);
        int iHashCode19 = Boolean.hashCode(this.onAddQueueItem);
        Integer num = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + (num == null ? 0 : num.hashCode())) * 31) + Integer.hashCode(this.onPlayFromMediaId)) * 31) + Integer.hashCode(this.onMediaButtonEvent)) * 31) + Integer.hashCode(this.onPause)) * 31) + Integer.hashCode(this.onFastForward)) * 31) + Integer.hashCode(this.onPlay)) * 31) + Integer.hashCode(this.onPrepareFromMediaId)) * 31) + Integer.hashCode(this.onPlayFromSearch)) * 31) + Long.hashCode(this.onPrepare)) * 31) + Integer.hashCode(this.onPrepareFromSearch)) * 31) + this.onPlayFromUri.hashCode()) * 31) + Boolean.hashCode(this.onPrepareFromUri)) * 31) + this.onRewind.hashCode()) * 31) + this.onRemoveQueueItemAt.hashCode()) * 31) + this.onRemoveQueueItem.hashCode()) * 31) + this.onSeekTo.hashCode()) * 31) + this.onSetCaptioningEnabled.hashCode()) * 31) + this.onSetRating.hashCode();
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.AudioAttributesCompatParcelizer;
        String str3 = this.IconCompatParcelizer;
        boolean z = this.write;
        boolean z2 = this.read;
        boolean z3 = this.MediaBrowserCompatCustomActionResultReceiver;
        int i = this.MediaBrowserCompatItemReceiver;
        int i2 = this.AudioAttributesImplBaseParcelizer;
        int i3 = this.AudioAttributesImplApi21Parcelizer;
        int i4 = this.AudioAttributesImplApi26Parcelizer;
        int i5 = this.RatingCompat;
        int i6 = this.MediaDescriptionCompat;
        int i7 = this.MediaBrowserCompatMediaItem;
        double d = this.MediaBrowserCompatSearchResultReceiver;
        double d2 = this.MediaMetadataCompat;
        long j = this.handleMediaPlayPauseIfPendingOnHandler;
        boolean z4 = this.onCustomAction;
        boolean z5 = this.onCommand;
        boolean z6 = this.onAddQueueItem;
        Integer num = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i8 = this.onPlayFromMediaId;
        int i9 = this.onMediaButtonEvent;
        int i10 = this.onPause;
        int i11 = this.onFastForward;
        int i12 = this.onPlay;
        int i13 = this.onPrepareFromMediaId;
        int i14 = this.onPlayFromSearch;
        long j2 = this.onPrepare;
        int i15 = this.onPrepareFromSearch;
        List<String> list = this.onPlayFromUri;
        boolean z7 = this.onPrepareFromUri;
        Map<String, onProviderInstalled> map = this.onRewind;
        Map<String, onProviderInstalled> map2 = this.onRemoveQueueItemAt;
        List<uncaughtException> list2 = this.onRemoveQueueItem;
        List<uncaughtException> list3 = this.onSeekTo;
        List<RankPairModel> list4 = this.onSetCaptioningEnabled;
        installIfNeededAsync installifneededasync = this.onSetRating;
        StringBuilder sb = new StringBuilder("setExpandedTitleTextColor(RemoteActionCompatParcelizer=");
        sb.append(str);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str2);
        sb.append(", IconCompatParcelizer=");
        sb.append(str3);
        sb.append(", write=");
        sb.append(z);
        sb.append(", read=");
        sb.append(z2);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(z3);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(i);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(i2);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(i3);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(i4);
        sb.append(", RatingCompat=");
        sb.append(i5);
        sb.append(", MediaDescriptionCompat=");
        sb.append(i6);
        sb.append(", MediaBrowserCompatMediaItem=");
        sb.append(i7);
        sb.append(", MediaBrowserCompatSearchResultReceiver=");
        sb.append(d);
        sb.append(", MediaMetadataCompat=");
        sb.append(d2);
        sb.append(", handleMediaPlayPauseIfPendingOnHandler=");
        sb.append(j);
        sb.append(", onCustomAction=");
        sb.append(z4);
        sb.append(", onCommand=");
        sb.append(z5);
        sb.append(", onAddQueueItem=");
        sb.append(z6);
        sb.append(", MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver=");
        sb.append(num);
        sb.append(", onPlayFromMediaId=");
        sb.append(i8);
        sb.append(", onMediaButtonEvent=");
        sb.append(i9);
        sb.append(", onPause=");
        sb.append(i10);
        sb.append(", onFastForward=");
        sb.append(i11);
        sb.append(", onPlay=");
        sb.append(i12);
        sb.append(", onPrepareFromMediaId=");
        sb.append(i13);
        sb.append(", onPlayFromSearch=");
        sb.append(i14);
        sb.append(", onPrepare=");
        sb.append(j2);
        sb.append(", onPrepareFromSearch=");
        sb.append(i15);
        sb.append(", onPlayFromUri=");
        sb.append(list);
        sb.append(", onPrepareFromUri=");
        sb.append(z7);
        sb.append(", onRewind=");
        sb.append(map);
        sb.append(", onRemoveQueueItemAt=");
        sb.append(map2);
        sb.append(", onRemoveQueueItem=");
        sb.append(list2);
        sb.append(", onSeekTo=");
        sb.append(list3);
        sb.append(", onSetCaptioningEnabled=");
        sb.append(list4);
        sb.append(", onSetRating=");
        sb.append(installifneededasync);
        sb.append(")");
        return sb.toString();
    }
}
