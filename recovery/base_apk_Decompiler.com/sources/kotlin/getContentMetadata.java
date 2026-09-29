package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\b6\b\u0086\b\u0018\u0000 42\u00020\u0001:\u00014B\u0089\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\b\u0012\u0006\u0010\u0014\u001a\u00020\u000b\u0012\u0006\u0010\u0015\u001a\u00020\u0005\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0005\u0012\u0006\u0010\u0018\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0005\u0012\u0006\u0010\u001b\u001a\u00020\u0005\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0005\u0012\u0006\u0010\u001e\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\u0005\u0012\b\b\u0002\u0010\"\u001a\u00020\u0005\u0012\u0006\u0010#\u001a\u00020\u000f\u0012\u0006\u0010$\u001a\u00020\u0005\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b&\u0010'J\u001a\u0010(\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010-R\u0017\u00101\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u0010-R\u001a\u00104\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010/\u001a\u0004\b3\u0010-R\u001a\u00108\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010+R\u001a\u0010:\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00106\u001a\u0004\b9\u0010+R\u001a\u0010=\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010;\u001a\u0004\b:\u0010<R\u001a\u0010@\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010/\u001a\u0004\b?\u0010-R\u001a\u00109\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010A\u001a\u0004\bB\u0010CR\u001a\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010/\u001a\u0004\b2\u0010-R\u001a\u0010F\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010;\u001a\u0004\b1\u0010<R\u001a\u00103\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010I\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010A\u001a\u0004\bL\u0010CR\u001a\u00107\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bM\u0010CR\u001a\u0010.\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u0010;\u001a\u0004\bF\u0010<R\u001a\u0010E\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010A\u001a\u0004\b4\u0010CR\u001a\u0010K\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u00106\u001a\u0004\b.\u0010+R\u001a\u0010O\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010/\u001a\u0004\b8\u0010-R\u001a\u00105\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u00106\u001a\u0004\bK\u0010+R\u001a\u00102\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u00106\u001a\u0004\bN\u0010+R\u001a\u0010R\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bQ\u00106\u001a\u0004\bG\u0010+R\u001a\u0010N\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u00106\u001a\u0004\b5\u0010+R\u001a\u0010G\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u00106\u001a\u0004\bO\u0010+R\u001a\u0010M\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bR\u0010/\u001a\u0004\bE\u0010-R\u0014\u0010L\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u00106R\u0014\u0010B\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bS\u00106R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020\u001f8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b?\u0010TR\u001a\u0010P\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bU\u00106\u001a\u0004\bR\u0010+R\u0014\u0010D\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b9\u00106R\u001a\u0010>\u001a\u00020\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010H\u001a\u0004\b=\u0010JR\u001a\u0010U\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u00106\u001a\u0004\b@\u0010+R\u0016\u0010S\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b1\u0010/"}, d2 = {"Lo/getContentMetadata;", "", "", "p0", "p1", "", "p2", "p3", "", "p4", "p5", "", "p6", "p7", "p8", "", "p9", "p10", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "p18", "p19", "p20", "p21", "p22", "p23", "", "p24", "p25", "p26", "p27", "p28", "p29", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIJLjava/lang/String;ZLjava/lang/String;JFZZJZILjava/lang/String;IIIIILjava/lang/String;IILjava/util/List;IIFILjava/lang/String;)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "MediaDescriptionCompat", "Ljava/lang/String;", "AudioAttributesImplApi21Parcelizer", "write", "onCommand", "AudioAttributesImplApi26Parcelizer", "read", "onCustomAction", "I", "MediaBrowserCompatSearchResultReceiver", "IconCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "RemoteActionCompatParcelizer", "J", "()J", "AudioAttributesCompatParcelizer", "onPlayFromUri", "onPlay", "AudioAttributesImplBaseParcelizer", "Z", "onPause", "()Z", "onPrepareFromSearch", "RatingCompat", "MediaBrowserCompatItemReceiver", "onFastForward", "F", "MediaBrowserCompatMediaItem", "()F", "MediaMetadataCompat", "onMediaButtonEvent", "onPlayFromMediaId", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "handleMediaPlayPauseIfPendingOnHandler", "onPrepare", "onRemoveQueueItemAt", "onAddQueueItem", "onPrepareFromMediaId", "Ljava/util/List;", "onPlayFromSearch"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getContentMetadata {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final float onPlayFromUri;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final boolean RatingCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final long AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final int onPrepareFromSearch;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final String handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final long MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final int MediaMetadataCompat;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final boolean MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final long MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int onMediaButtonEvent;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final int onPlayFromSearch;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final String onPlayFromMediaId;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final float AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final int onFastForward;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final List<String> onPlay;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final int onCustomAction;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private final int onPrepare;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private final String AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private final int onCommand;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private final int onPause;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private final String AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from kotlin metadata */
    private final int onAddQueueItem;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String onPrepareFromMediaId;

    public getContentMetadata(String str, String str2, int i, int i2, long j, String str3, boolean z, String str4, long j2, float f, boolean z2, boolean z3, long j3, boolean z4, int i3, String str5, int i4, int i5, int i6, int i7, int i8, String str6, int i9, int i10, List<String> list, int i11, int i12, float f2, int i13, String str7) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.write = str;
        this.read = str2;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = i2;
        this.AudioAttributesCompatParcelizer = j;
        this.AudioAttributesImplBaseParcelizer = str3;
        this.MediaBrowserCompatCustomActionResultReceiver = z;
        this.AudioAttributesImplApi21Parcelizer = str4;
        this.MediaBrowserCompatItemReceiver = j2;
        this.AudioAttributesImplApi26Parcelizer = f;
        this.MediaBrowserCompatMediaItem = z2;
        this.MediaBrowserCompatSearchResultReceiver = z3;
        this.MediaDescriptionCompat = j3;
        this.RatingCompat = z4;
        this.MediaMetadataCompat = i3;
        this.handleMediaPlayPauseIfPendingOnHandler = str5;
        this.onCustomAction = i4;
        this.onCommand = i5;
        this.onAddQueueItem = i6;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i7;
        this.onFastForward = i8;
        this.onPlayFromMediaId = str6;
        this.onMediaButtonEvent = i9;
        this.onPause = i10;
        this.onPlay = list;
        this.onPrepare = i11;
        this.onPrepareFromSearch = i12;
        this.onPlayFromUri = f2;
        this.onPlayFromSearch = i13;
        this.onPrepareFromMediaId = str7;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final long getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: onPlay, reason: from getter */
    public final String getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: onPause, reason: from getter */
    public final boolean getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final String getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final long getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final float getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from getter */
    public final boolean getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from getter */
    public final boolean getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final long getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final int getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final String getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final int getOnCustomAction() {
        return this.onCustomAction;
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final int getOnCommand() {
        return this.onCommand;
    }

    /* JADX INFO: renamed from: onFastForward, reason: from getter */
    public final int getOnAddQueueItem() {
        return this.onAddQueueItem;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final int getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final int getOnFastForward() {
        return this.onFastForward;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final String getOnPlayFromMediaId() {
        return this.onPlayFromMediaId;
    }

    public /* synthetic */ getContentMetadata(String str, String str2, int i, int i2, long j, String str3, boolean z, String str4, long j2, float f, boolean z2, boolean z3, long j3, boolean z4, int i3, String str5, int i4, int i5, int i6, int i7, int i8, String str6, int i9, int i10, List list, int i11, int i12, float f2, int i13, String str7, int i14, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2, i, i2, j, str3, z, str4, j2, f, z2, z3, j3, z4, i3, str5, i4, i5, (i14 & 262144) != 0 ? 0 : i6, (i14 & 524288) != 0 ? 0 : i7, i8, str6, i9, i10, (i14 & BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i14 & 33554432) != 0 ? 0 : i11, (i14 & 67108864) != 0 ? 0 : i12, f2, i13, str7);
    }

    /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
    public final int getOnPrepare() {
        return this.onPrepare;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final float getOnPlayFromUri() {
        return this.onPlayFromUri;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final int getOnPlayFromSearch() {
        return this.onPlayFromSearch;
    }

    /* JADX INFO: renamed from: o.getContentMetadata$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lo/getContentMetadata$read;", "", "<init>", "()V", "Lo/getContentMetadata;", "AudioAttributesCompatParcelizer", "()Lo/getContentMetadata;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static getContentMetadata AudioAttributesCompatParcelizer() {
            return new getContentMetadata("", "", 0, 0, 0L, "", false, "", 0L, BitmapDescriptorFactory.HUE_RED, false, false, 0L, false, 0, "", 0, 0, 0, 0, 0, "", 1, 0, null, 0, 0, BitmapDescriptorFactory.HUE_RED, 0, null, 118226944, null);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof getContentMetadata)) {
            return false;
        }
        getContentMetadata getcontentmetadata = (getContentMetadata) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) getcontentmetadata.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) getcontentmetadata.read) && this.IconCompatParcelizer == getcontentmetadata.IconCompatParcelizer && this.RemoteActionCompatParcelizer == getcontentmetadata.RemoteActionCompatParcelizer && this.AudioAttributesCompatParcelizer == getcontentmetadata.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplBaseParcelizer, (Object) getcontentmetadata.AudioAttributesImplBaseParcelizer) && this.MediaBrowserCompatCustomActionResultReceiver == getcontentmetadata.MediaBrowserCompatCustomActionResultReceiver && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi21Parcelizer, (Object) getcontentmetadata.AudioAttributesImplApi21Parcelizer) && this.MediaBrowserCompatItemReceiver == getcontentmetadata.MediaBrowserCompatItemReceiver && Float.compare(this.AudioAttributesImplApi26Parcelizer, getcontentmetadata.AudioAttributesImplApi26Parcelizer) == 0 && this.MediaBrowserCompatMediaItem == getcontentmetadata.MediaBrowserCompatMediaItem && this.MediaBrowserCompatSearchResultReceiver == getcontentmetadata.MediaBrowserCompatSearchResultReceiver && this.MediaDescriptionCompat == getcontentmetadata.MediaDescriptionCompat && this.RatingCompat == getcontentmetadata.RatingCompat && this.MediaMetadataCompat == getcontentmetadata.MediaMetadataCompat && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.handleMediaPlayPauseIfPendingOnHandler, (Object) getcontentmetadata.handleMediaPlayPauseIfPendingOnHandler) && this.onCustomAction == getcontentmetadata.onCustomAction && this.onCommand == getcontentmetadata.onCommand && this.onAddQueueItem == getcontentmetadata.onAddQueueItem && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver == getcontentmetadata.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && this.onFastForward == getcontentmetadata.onFastForward && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPlayFromMediaId, (Object) getcontentmetadata.onPlayFromMediaId) && this.onMediaButtonEvent == getcontentmetadata.onMediaButtonEvent && this.onPause == getcontentmetadata.onPause && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onPlay, getcontentmetadata.onPlay) && this.onPrepare == getcontentmetadata.onPrepare && this.onPrepareFromSearch == getcontentmetadata.onPrepareFromSearch && Float.compare(this.onPlayFromUri, getcontentmetadata.onPlayFromUri) == 0 && this.onPlayFromSearch == getcontentmetadata.onPlayFromSearch && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPrepareFromMediaId, (Object) getcontentmetadata.onPrepareFromMediaId);
    }

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.read.hashCode();
        int iHashCode3 = Integer.hashCode(this.IconCompatParcelizer);
        int iHashCode4 = Integer.hashCode(this.RemoteActionCompatParcelizer);
        int iHashCode5 = Long.hashCode(this.AudioAttributesCompatParcelizer);
        int iHashCode6 = this.AudioAttributesImplBaseParcelizer.hashCode();
        int iHashCode7 = Boolean.hashCode(this.MediaBrowserCompatCustomActionResultReceiver);
        int iHashCode8 = this.AudioAttributesImplApi21Parcelizer.hashCode();
        int iHashCode9 = Long.hashCode(this.MediaBrowserCompatItemReceiver);
        int iHashCode10 = Float.hashCode(this.AudioAttributesImplApi26Parcelizer);
        int iHashCode11 = Boolean.hashCode(this.MediaBrowserCompatMediaItem);
        int iHashCode12 = Boolean.hashCode(this.MediaBrowserCompatSearchResultReceiver);
        int iHashCode13 = Long.hashCode(this.MediaDescriptionCompat);
        int iHashCode14 = Boolean.hashCode(this.RatingCompat);
        int iHashCode15 = Integer.hashCode(this.MediaMetadataCompat);
        int iHashCode16 = this.handleMediaPlayPauseIfPendingOnHandler.hashCode();
        int iHashCode17 = Integer.hashCode(this.onCustomAction);
        int iHashCode18 = Integer.hashCode(this.onCommand);
        int iHashCode19 = Integer.hashCode(this.onAddQueueItem);
        int iHashCode20 = Integer.hashCode(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        int iHashCode21 = Integer.hashCode(this.onFastForward);
        int iHashCode22 = this.onPlayFromMediaId.hashCode();
        int iHashCode23 = Integer.hashCode(this.onMediaButtonEvent);
        int iHashCode24 = Integer.hashCode(this.onPause);
        int iHashCode25 = this.onPlay.hashCode();
        int iHashCode26 = Integer.hashCode(this.onPrepare);
        int iHashCode27 = Integer.hashCode(this.onPrepareFromSearch);
        int iHashCode28 = Float.hashCode(this.onPlayFromUri);
        int iHashCode29 = Integer.hashCode(this.onPlayFromSearch);
        String str = this.onPrepareFromMediaId;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + iHashCode26) * 31) + iHashCode27) * 31) + iHashCode28) * 31) + iHashCode29) * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.read;
        int i = this.IconCompatParcelizer;
        int i2 = this.RemoteActionCompatParcelizer;
        long j = this.AudioAttributesCompatParcelizer;
        String str3 = this.AudioAttributesImplBaseParcelizer;
        boolean z = this.MediaBrowserCompatCustomActionResultReceiver;
        String str4 = this.AudioAttributesImplApi21Parcelizer;
        long j2 = this.MediaBrowserCompatItemReceiver;
        float f = this.AudioAttributesImplApi26Parcelizer;
        boolean z2 = this.MediaBrowserCompatMediaItem;
        boolean z3 = this.MediaBrowserCompatSearchResultReceiver;
        long j3 = this.MediaDescriptionCompat;
        boolean z4 = this.RatingCompat;
        int i3 = this.MediaMetadataCompat;
        String str5 = this.handleMediaPlayPauseIfPendingOnHandler;
        int i4 = this.onCustomAction;
        int i5 = this.onCommand;
        int i6 = this.onAddQueueItem;
        int i7 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i8 = this.onFastForward;
        String str6 = this.onPlayFromMediaId;
        int i9 = this.onMediaButtonEvent;
        int i10 = this.onPause;
        List<String> list = this.onPlay;
        int i11 = this.onPrepare;
        int i12 = this.onPrepareFromSearch;
        float f2 = this.onPlayFromUri;
        int i13 = this.onPlayFromSearch;
        String str7 = this.onPrepareFromMediaId;
        StringBuilder sb = new StringBuilder("getContentMetadata(write=");
        sb.append(str);
        sb.append(", read=");
        sb.append(str2);
        sb.append(", IconCompatParcelizer=");
        sb.append(i);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(i2);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(j);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(str3);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(z);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(str4);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(j2);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(f);
        sb.append(", MediaBrowserCompatMediaItem=");
        sb.append(z2);
        sb.append(", MediaBrowserCompatSearchResultReceiver=");
        sb.append(z3);
        sb.append(", MediaDescriptionCompat=");
        sb.append(j3);
        sb.append(", RatingCompat=");
        sb.append(z4);
        sb.append(", MediaMetadataCompat=");
        sb.append(i3);
        sb.append(", handleMediaPlayPauseIfPendingOnHandler=");
        sb.append(str5);
        sb.append(", onCustomAction=");
        sb.append(i4);
        sb.append(", onCommand=");
        sb.append(i5);
        sb.append(", onAddQueueItem=");
        sb.append(i6);
        sb.append(", MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver=");
        sb.append(i7);
        sb.append(", onFastForward=");
        sb.append(i8);
        sb.append(", onPlayFromMediaId=");
        sb.append(str6);
        sb.append(", onMediaButtonEvent=");
        sb.append(i9);
        sb.append(", onPause=");
        sb.append(i10);
        sb.append(", onPlay=");
        sb.append(list);
        sb.append(", onPrepare=");
        sb.append(i11);
        sb.append(", onPrepareFromSearch=");
        sb.append(i12);
        sb.append(", onPlayFromUri=");
        sb.append(f2);
        sb.append(", onPlayFromSearch=");
        sb.append(i13);
        sb.append(", onPrepareFromMediaId=");
        sb.append(str7);
        sb.append(")");
        return sb.toString();
    }
}
