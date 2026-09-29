package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b9\b\u0086\b\u0018\u00002\u00020\u0001B\u0081\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u000e\u0012\u000e\b\u0002\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020!\u0012\b\b\u0002\u0010#\u001a\u00020\u0011\u0012\b\b\u0002\u0010%\u001a\u00020$\u0012\b\b\u0002\u0010&\u001a\u00020\u000b\u0012\b\b\u0002\u0010'\u001a\u00020\u000e\u0012\u000e\b\u0002\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020!\u0012\u000e\b\u0002\u0010*\u001a\b\u0012\u0004\u0012\u00020)0!\u0012\b\b\u0002\u0010+\u001a\u00020\u000b\u0012\b\b\u0002\u0010,\u001a\u00020\u000e¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0011¢\u0006\u0004\b/\u00100J\u001a\u00101\u001a\u00020\u00112\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b5\u00106R\u0017\u0010:\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u00106R\u001a\u0010=\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u00108\u001a\u0004\b<\u00106R\u0014\u00109\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b>\u00108R\u001a\u0010@\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u00108\u001a\u0004\b=\u00106R\u0014\u0010B\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bA\u00108R\u0014\u0010?\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bC\u00108R\u0014\u0010D\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u00108R\u0014\u0010F\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bE\u00108R\u0014\u0010I\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0014\u00107\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bJ\u0010HR\u001a\u0010/\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010L\u001a\u0004\bD\u00104R\u0014\u0010<\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bM\u0010LR\u001a\u0010P\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010N\u001a\u0004\bO\u00100R\u001a\u0010O\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u0010L\u001a\u0004\bP\u00104R\u001a\u0010G\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010L\u001a\u0004\b7\u00104R\u0014\u0010T\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u0010LR\u0014\u0010V\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bU\u0010LR\u001a\u0010X\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bW\u0010L\u001a\u0004\b?\u00104R\u001a\u0010E\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bY\u0010L\u001a\u0004\bF\u00104R\u0014\u0010U\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bT\u0010LR\u001a\u0010M\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bV\u0010L\u001a\u0004\b:\u00104R\u0014\u0010Z\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010NR\u0014\u0010W\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bF\u0010NR\u0016\u0010[\u001a\u00020\u00028\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b@\u00108R\u0014\u0010S\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u0010LR\u0014\u0010K\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\\\u00108R\u001a\u0010R\u001a\u00020\u000e8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b]\u0010L\u001a\u0004\bI\u00104R\u001a\u0010A\u001a\b\u0012\u0004\u0012\u00020\u00020!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b[\u0010^R\u0014\u0010Y\u001a\u00020\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b=\u0010NR\u001a\u0010J\u001a\u00020$8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bZ\u0010_\u001a\u0004\bB\u0010`R\u001a\u0010Q\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bX\u0010H\u001a\u0004\b@\u0010aR\u0014\u0010>\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010LR\u001a\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00020!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bI\u0010^R\u001a\u0010]\u001a\b\u0012\u0004\u0012\u00020)0!8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010^R\u0014\u0010C\u001a\u00020\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bP\u0010HR\u0014\u0010b\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b/\u0010L"}, d2 = {"Lo/startFile;", "", "", "p0", "p1", "p2", "p3", "p4", "p5", "p6", "p7", "", "p8", "p9", "", "p10", "p11", "", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "p23", "p24", "p25", "p26", "", "p27", "p28", "", "p29", "p30", "p31", "p32", "Lo/getCacheSpace;", "p33", "p34", "p35", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJIIZIIIIIIIIZZLjava/lang/String;ILjava/lang/String;ILjava/util/List;ZFJILjava/util/List;Ljava/util/List;JI)V", "MediaBrowserCompatSearchResultReceiver", "()Z", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "MediaBrowserCompatItemReceiver", "Ljava/lang/String;", "read", "RemoteActionCompatParcelizer", "onSeekTo", "MediaDescriptionCompat", "IconCompatParcelizer", "onPrepareFromUri", "AudioAttributesImplBaseParcelizer", "AudioAttributesCompatParcelizer", "onPrepare", "write", "onRemoveQueueItem", "AudioAttributesImplApi26Parcelizer", "onCustomAction", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatMediaItem", "J", "MediaBrowserCompatCustomActionResultReceiver", "onPlayFromSearch", "onPrepareFromMediaId", "I", "onMediaButtonEvent", "Z", "RatingCompat", "MediaMetadataCompat", "onRemoveQueueItemAt", "onPlayFromUri", "onFastForward", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "handleMediaPlayPauseIfPendingOnHandler", "onAddQueueItem", "onPause", "onCommand", "onPrepareFromSearch", "onPlayFromMediaId", "onPlay", "onSetCaptioningEnabled", "onRewind", "Ljava/util/List;", "F", "()F", "()J", "onSetShuffleMode"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class startFile {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public String onPlay;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final boolean onPause;
    private final String AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final boolean onPrepareFromSearch;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final List<String> onSeekTo;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final long MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final int onSetShuffleMode;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final int handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final boolean MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final long onRemoveQueueItem;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final boolean onPlayFromMediaId;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int onPrepareFromUri;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final int onAddQueueItem;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final int onMediaButtonEvent;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final long onRemoveQueueItemAt;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final String AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final int MediaDescriptionCompat;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final int onCommand;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final List<String> onPrepare;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final float onPlayFromSearch;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private final long MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private final int MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private final int MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private final int onCustomAction;

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: onRemoveQueueItem, reason: from kotlin metadata */
    private final String AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from kotlin metadata */
    private final int RatingCompat;

    /* JADX INFO: renamed from: onRewind, reason: from kotlin metadata */
    private final int onPlayFromUri;

    /* JADX INFO: renamed from: onSeekTo, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: onSetCaptioningEnabled, reason: from kotlin metadata */
    private final String onPrepareFromMediaId;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int onFastForward;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final List<getCacheSpace> onRewind;

    private startFile(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, long j2, int i, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z2, boolean z3, String str9, int i11, String str10, int i12, List<String> list, boolean z4, float f, long j3, int i13, List<String> list2, List<getCacheSpace> list3, long j4, int i14) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        toMagicModuleMetaRepoModel.write(str8, "");
        toMagicModuleMetaRepoModel.write(str9, "");
        toMagicModuleMetaRepoModel.write(str10, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.read = str3;
        this.AudioAttributesCompatParcelizer = str4;
        this.write = str5;
        this.AudioAttributesImplBaseParcelizer = str6;
        this.AudioAttributesImplApi26Parcelizer = str7;
        this.AudioAttributesImplApi21Parcelizer = str8;
        this.MediaBrowserCompatCustomActionResultReceiver = j;
        this.MediaBrowserCompatItemReceiver = j2;
        this.MediaBrowserCompatSearchResultReceiver = i;
        this.MediaDescriptionCompat = i2;
        this.MediaMetadataCompat = z;
        this.RatingCompat = i3;
        this.MediaBrowserCompatMediaItem = i4;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i5;
        this.onAddQueueItem = i6;
        this.onCommand = i7;
        this.onCustomAction = i8;
        this.handleMediaPlayPauseIfPendingOnHandler = i9;
        this.onMediaButtonEvent = i10;
        this.onPlayFromMediaId = z2;
        this.onPause = z3;
        this.onPlay = str9;
        this.onFastForward = i11;
        this.onPrepareFromMediaId = str10;
        this.onPlayFromUri = i12;
        this.onPrepare = list;
        this.onPrepareFromSearch = z4;
        this.onPlayFromSearch = f;
        this.onRemoveQueueItemAt = j3;
        this.onPrepareFromUri = i13;
        this.onSeekTo = list2;
        this.onRewind = list3;
        this.onRemoveQueueItem = j4;
        this.onSetShuffleMode = i14;
    }

    public /* synthetic */ startFile(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, long j, long j2, int i, int i2, boolean z, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, boolean z2, boolean z3, String str9, int i11, String str10, int i12, List list, boolean z4, float f, long j3, int i13, List list2, List list3, long j4, int i14, int i15, int i16, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i15 & 1) != 0 ? "" : str, (i15 & 2) != 0 ? "" : str2, (i15 & 4) != 0 ? "" : str3, (i15 & 8) != 0 ? "" : str4, (i15 & 16) != 0 ? "" : str5, (i15 & 32) != 0 ? "" : str6, (i15 & 64) != 0 ? "" : str7, (i15 & 128) != 0 ? "" : str8, (i15 & 256) != 0 ? 0L : j, (i15 & 512) != 0 ? 0L : j2, (i15 & 1024) != 0 ? 0 : i, (i15 & 2048) != 0 ? 0 : i2, (i15 & 4096) != 0 ? false : z, (i15 & 8192) != 0 ? 0 : i3, (i15 & 16384) != 0 ? 0 : i4, (i15 & 32768) != 0 ? 0 : i5, (i15 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? 0 : i6, (i15 & 131072) != 0 ? 0 : i7, (i15 & 262144) != 0 ? 0 : i8, (i15 & 524288) != 0 ? 0 : i9, (i15 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? 0 : i10, (i15 & 2097152) != 0 ? false : z2, (i15 & 4194304) != 0 ? false : z3, (i15 & 8388608) != 0 ? "" : str9, (i15 & BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? 0 : i11, (i15 & 33554432) != 0 ? "" : str10, (i15 & 67108864) != 0 ? 0 : i12, (i15 & C.BUFFER_FLAG_FIRST_SAMPLE) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i15 & 268435456) != 0 ? false : z4, (i15 & 536870912) != 0 ? BitmapDescriptorFactory.HUE_RED : f, (i15 & 1073741824) != 0 ? 0L : j3, (i15 & Integer.MIN_VALUE) != 0 ? 0 : i13, (i16 & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2, (i16 & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list3, (i16 & 4) != 0 ? 0L : j4, (i16 & 8) == 0 ? i14 : 0);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final boolean getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final int getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final int getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final int getOnCommand() {
        return this.onCommand;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final int getOnCustomAction() {
        return this.onCustomAction;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getOnMediaButtonEvent() {
        return this.onMediaButtonEvent;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final int getOnPlayFromUri() {
        return this.onPlayFromUri;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final float getOnPlayFromSearch() {
        return this.onPlayFromSearch;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final long getOnRemoveQueueItemAt() {
        return this.onRemoveQueueItemAt;
    }

    public final boolean MediaBrowserCompatSearchResultReceiver() {
        return (this.onPlayFromUri & withAdditionalHeaders.IconCompatParcelizer.getRemoteActionCompatParcelizer()) == withAdditionalHeaders.IconCompatParcelizer.getRemoteActionCompatParcelizer();
    }

    public startFile() {
        this(null, null, null, null, null, null, null, null, 0L, 0L, 0, 0, false, 0, 0, 0, 0, 0, 0, 0, 0, false, false, null, 0, null, 0, null, false, BitmapDescriptorFactory.HUE_RED, 0L, 0, null, null, 0L, 0, -1, 15, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof startFile)) {
            return false;
        }
        startFile startfile = (startFile) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) startfile.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) startfile.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) startfile.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) startfile.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) startfile.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) startfile.AudioAttributesImplBaseParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) startfile.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) startfile.AudioAttributesImplApi21Parcelizer) && this.MediaBrowserCompatCustomActionResultReceiver == startfile.MediaBrowserCompatCustomActionResultReceiver && this.MediaBrowserCompatItemReceiver == startfile.MediaBrowserCompatItemReceiver && this.MediaBrowserCompatSearchResultReceiver == startfile.MediaBrowserCompatSearchResultReceiver && this.MediaDescriptionCompat == startfile.MediaDescriptionCompat && this.MediaMetadataCompat == startfile.MediaMetadataCompat && this.RatingCompat == startfile.RatingCompat && this.MediaBrowserCompatMediaItem == startfile.MediaBrowserCompatMediaItem && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == startfile.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && this.onAddQueueItem == startfile.onAddQueueItem && this.onCommand == startfile.onCommand && this.onCustomAction == startfile.onCustomAction && this.handleMediaPlayPauseIfPendingOnHandler == startfile.handleMediaPlayPauseIfPendingOnHandler && this.onMediaButtonEvent == startfile.onMediaButtonEvent && this.onPlayFromMediaId == startfile.onPlayFromMediaId && this.onPause == startfile.onPause && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPlay, (Object) startfile.onPlay) && this.onFastForward == startfile.onFastForward && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPrepareFromMediaId, (Object) startfile.onPrepareFromMediaId) && this.onPlayFromUri == startfile.onPlayFromUri && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onPrepare, startfile.onPrepare) && this.onPrepareFromSearch == startfile.onPrepareFromSearch && Float.compare(this.onPlayFromSearch, startfile.onPlayFromSearch) == 0 && this.onRemoveQueueItemAt == startfile.onRemoveQueueItemAt && this.onPrepareFromUri == startfile.onPrepareFromUri && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onSeekTo, startfile.onSeekTo) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onRewind, startfile.onRewind) && this.onRemoveQueueItem == startfile.onRemoveQueueItem && this.onSetShuffleMode == startfile.onSetShuffleMode;
    }

    public final int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.write.hashCode()) * 31) + this.AudioAttributesImplBaseParcelizer.hashCode()) * 31) + this.AudioAttributesImplApi26Parcelizer.hashCode()) * 31) + this.AudioAttributesImplApi21Parcelizer.hashCode()) * 31) + Long.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Long.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Integer.hashCode(this.MediaBrowserCompatSearchResultReceiver)) * 31) + Integer.hashCode(this.MediaDescriptionCompat)) * 31) + Boolean.hashCode(this.MediaMetadataCompat)) * 31) + Integer.hashCode(this.RatingCompat)) * 31) + Integer.hashCode(this.MediaBrowserCompatMediaItem)) * 31) + Integer.hashCode(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) * 31) + Integer.hashCode(this.onAddQueueItem)) * 31) + Integer.hashCode(this.onCommand)) * 31) + Integer.hashCode(this.onCustomAction)) * 31) + Integer.hashCode(this.handleMediaPlayPauseIfPendingOnHandler)) * 31) + Integer.hashCode(this.onMediaButtonEvent)) * 31) + Boolean.hashCode(this.onPlayFromMediaId)) * 31) + Boolean.hashCode(this.onPause)) * 31) + this.onPlay.hashCode()) * 31) + Integer.hashCode(this.onFastForward)) * 31) + this.onPrepareFromMediaId.hashCode()) * 31) + Integer.hashCode(this.onPlayFromUri)) * 31) + this.onPrepare.hashCode()) * 31) + Boolean.hashCode(this.onPrepareFromSearch)) * 31) + Float.hashCode(this.onPlayFromSearch)) * 31) + Long.hashCode(this.onRemoveQueueItemAt)) * 31) + Integer.hashCode(this.onPrepareFromUri)) * 31) + this.onSeekTo.hashCode()) * 31) + this.onRewind.hashCode()) * 31) + Long.hashCode(this.onRemoveQueueItem)) * 31) + Integer.hashCode(this.onSetShuffleMode);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.IconCompatParcelizer;
        String str3 = this.read;
        String str4 = this.AudioAttributesCompatParcelizer;
        String str5 = this.write;
        String str6 = this.AudioAttributesImplBaseParcelizer;
        String str7 = this.AudioAttributesImplApi26Parcelizer;
        String str8 = this.AudioAttributesImplApi21Parcelizer;
        long j = this.MediaBrowserCompatCustomActionResultReceiver;
        long j2 = this.MediaBrowserCompatItemReceiver;
        int i = this.MediaBrowserCompatSearchResultReceiver;
        int i2 = this.MediaDescriptionCompat;
        boolean z = this.MediaMetadataCompat;
        int i3 = this.RatingCompat;
        int i4 = this.MediaBrowserCompatMediaItem;
        int i5 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i6 = this.onAddQueueItem;
        int i7 = this.onCommand;
        int i8 = this.onCustomAction;
        int i9 = this.handleMediaPlayPauseIfPendingOnHandler;
        int i10 = this.onMediaButtonEvent;
        boolean z2 = this.onPlayFromMediaId;
        boolean z3 = this.onPause;
        String str9 = this.onPlay;
        int i11 = this.onFastForward;
        String str10 = this.onPrepareFromMediaId;
        int i12 = this.onPlayFromUri;
        List<String> list = this.onPrepare;
        boolean z4 = this.onPrepareFromSearch;
        float f = this.onPlayFromSearch;
        long j3 = this.onRemoveQueueItemAt;
        int i13 = this.onPrepareFromUri;
        List<String> list2 = this.onSeekTo;
        List<getCacheSpace> list3 = this.onRewind;
        long j4 = this.onRemoveQueueItem;
        int i14 = this.onSetShuffleMode;
        StringBuilder sb = new StringBuilder("startFile(RemoteActionCompatParcelizer=");
        sb.append(str);
        sb.append(", IconCompatParcelizer=");
        sb.append(str2);
        sb.append(", read=");
        sb.append(str3);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str4);
        sb.append(", write=");
        sb.append(str5);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(str6);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(str7);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(str8);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(j);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(j2);
        sb.append(", MediaBrowserCompatSearchResultReceiver=");
        sb.append(i);
        sb.append(", MediaDescriptionCompat=");
        sb.append(i2);
        sb.append(", MediaMetadataCompat=");
        sb.append(z);
        sb.append(", RatingCompat=");
        sb.append(i3);
        sb.append(", MediaBrowserCompatMediaItem=");
        sb.append(i4);
        sb.append(", MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver=");
        sb.append(i5);
        sb.append(", onAddQueueItem=");
        sb.append(i6);
        sb.append(", onCommand=");
        sb.append(i7);
        sb.append(", onCustomAction=");
        sb.append(i8);
        sb.append(", handleMediaPlayPauseIfPendingOnHandler=");
        sb.append(i9);
        sb.append(", onMediaButtonEvent=");
        sb.append(i10);
        sb.append(", onPlayFromMediaId=");
        sb.append(z2);
        sb.append(", onPause=");
        sb.append(z3);
        sb.append(", onPlay=");
        sb.append(str9);
        sb.append(", onFastForward=");
        sb.append(i11);
        sb.append(", onPrepareFromMediaId=");
        sb.append(str10);
        sb.append(", onPlayFromUri=");
        sb.append(i12);
        sb.append(", onPrepare=");
        sb.append(list);
        sb.append(", onPrepareFromSearch=");
        sb.append(z4);
        sb.append(", onPlayFromSearch=");
        sb.append(f);
        sb.append(", onRemoveQueueItemAt=");
        sb.append(j3);
        sb.append(", onPrepareFromUri=");
        sb.append(i13);
        sb.append(", onSeekTo=");
        sb.append(list2);
        sb.append(", onRewind=");
        sb.append(list3);
        sb.append(", onRemoveQueueItem=");
        sb.append(j4);
        sb.append(", onSetShuffleMode=");
        sb.append(i14);
        sb.append(")");
        return sb.toString();
    }
}
