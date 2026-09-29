package kotlin;

import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b+\b\u0086\b\u0018\u00002\u00020\u0001:\u00018B\u0097\u0002\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\b\u0012\u000e\b\u0002\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012\u0012\b\b\u0002\u0010\u0016\u001a\u00020\b\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u000b\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001c\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u001d\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0019\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u000b\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b\"\u0010#J\r\u0010%\u001a\u00020$¢\u0006\u0004\b%\u0010&J\u001a\u0010'\u001a\u00020\u000b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b+\u0010,R\u0017\u00100\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u0010,R\u001a\u0010%\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u0010.\u001a\u0004\b2\u0010,R\u001a\u0010/\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u0010.\u001a\u0004\b4\u0010,R\u001a\u00107\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010.\u001a\u0004\b6\u0010,R\u001a\u00108\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b0\u0010,R\u001a\u0010;\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010*R\u0014\u0010-\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b<\u0010:R\u001a\u00103\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010=\u001a\u0004\b>\u0010?R\u0014\u0010A\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b@\u0010:R\u0014\u00104\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bB\u0010:R\u001c\u0010D\u001a\u00020\u00028\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\bC\u0010.\u001a\u0004\bA\u0010,R\u0014\u0010<\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u0010:R\u001a\u0010F\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010:\u001a\u0004\b-\u0010*R\u001a\u00106\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bD\u0010GR\u0014\u00102\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b8\u0010:R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00020\u00128\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b;\u0010GR\u001a\u0010>\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b3\u0010*R\u0016\u00109\u001a\u00020\u000b8\u0006@\u0006X\u0087\f¢\u0006\u0006\n\u0004\b/\u0010=R\u001a\u0010C\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u0010=\u001a\u0004\b9\u0010?R\u001a\u0010B\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u0010H\u001a\u0004\b7\u0010IR\u001a\u0010K\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u0010.\u001a\u0004\bD\u0010,R\u001a\u0010J\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u0010=\u001a\u0004\bE\u0010?R\u001a\u00101\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bL\u0010.\u001a\u0004\bF\u0010,R\u001a\u0010L\u001a\u00020\u00198\u0007X\u0087\u0004¢\u0006\f\n\u0004\bK\u0010H\u001a\u0004\b<\u0010IR\u001a\u00105\u001a\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010=\u001a\u0004\bB\u0010?R\u001e\u0010O\u001a\u0004\u0018\u00010 8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b7\u0010M\u001a\u0004\b8\u0010N"}, d2 = {"Lo/CacheListener;", "", "", "p0", "p1", "p2", "p3", "p4", "", "p5", "p6", "", "p7", "p8", "p9", "p10", "p11", "p12", "", "p13", "p14", "p15", "p16", "p17", "p18", "", "p19", "p20", "p21", "p22", "p23", "p24", "Lo/CacheListener$read;", "p25", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IIZIILjava/lang/String;IILjava/util/List;ILjava/util/List;IZZJLjava/lang/String;ZLjava/lang/String;JZLo/CacheListener$read;)V", "", "IconCompatParcelizer", "()F", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "MediaBrowserCompatItemReceiver", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "write", "onMediaButtonEvent", "MediaBrowserCompatMediaItem", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplBaseParcelizer", "onFastForward", "MediaMetadataCompat", "RemoteActionCompatParcelizer", "read", "onCommand", "I", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatSearchResultReceiver", "Z", "handleMediaPlayPauseIfPendingOnHandler", "()Z", "onPrepareFromSearch", "AudioAttributesImplApi21Parcelizer", "onCustomAction", "onAddQueueItem", "RatingCompat", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "MediaDescriptionCompat", "Ljava/util/List;", "J", "()J", "onPause", "onPlayFromMediaId", "onPlay", "Lo/CacheListener$read;", "()Lo/CacheListener$read;", "onPrepare"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CacheListener {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public boolean onCommand;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final long onCustomAction;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final boolean onAddQueueItem;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final List<String> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final int MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final boolean onPause;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final boolean onFastForward;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final List<String> MediaMetadataCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private read onPrepare;
    private final int handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private String RatingCompat;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final String onPlayFromMediaId;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final String onMediaButtonEvent;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final long onPlay;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private final int AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int MediaBrowserCompatSearchResultReceiver;

    private CacheListener(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, int i3, int i4, String str6, int i5, int i6, List<String> list, int i7, List<String> list2, int i8, boolean z2, boolean z3, long j, String str7, boolean z4, String str8, long j2, boolean z5, read readVar) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        toMagicModuleMetaRepoModel.write(str8, "");
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.AudioAttributesCompatParcelizer = str3;
        this.RemoteActionCompatParcelizer = str4;
        this.read = str5;
        this.MediaBrowserCompatCustomActionResultReceiver = i;
        this.MediaBrowserCompatItemReceiver = i2;
        this.AudioAttributesImplApi26Parcelizer = z;
        this.AudioAttributesImplApi21Parcelizer = i3;
        this.AudioAttributesImplBaseParcelizer = i4;
        this.RatingCompat = str6;
        this.MediaBrowserCompatSearchResultReceiver = i5;
        this.MediaDescriptionCompat = i6;
        this.MediaMetadataCompat = list;
        this.MediaBrowserCompatMediaItem = i7;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = list2;
        this.handleMediaPlayPauseIfPendingOnHandler = i8;
        this.onCommand = z2;
        this.onAddQueueItem = z3;
        this.onCustomAction = j;
        this.onPlayFromMediaId = str7;
        this.onPause = z4;
        this.onMediaButtonEvent = str8;
        this.onPlay = j2;
        this.onFastForward = z5;
        this.onPrepare = readVar;
    }

    public /* synthetic */ CacheListener(String str, String str2, String str3, String str4, String str5, int i, int i2, boolean z, int i3, int i4, String str6, int i5, int i6, List list, int i7, List list2, int i8, boolean z2, boolean z3, long j, String str7, boolean z4, String str8, long j2, boolean z5, read readVar, int i9, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i9 & 1) != 0 ? "" : str, (i9 & 2) != 0 ? "" : str2, (i9 & 4) != 0 ? "" : str3, (i9 & 8) != 0 ? "" : str4, (i9 & 16) != 0 ? "" : str5, (i9 & 32) != 0 ? 0 : i, (i9 & 64) != 0 ? 0 : i2, (i9 & 128) != 0 ? false : z, (i9 & 256) != 0 ? 0 : i3, (i9 & 512) != 0 ? 0 : i4, (i9 & 1024) != 0 ? "" : str6, (i9 & 2048) != 0 ? 0 : i5, (i9 & 4096) != 0 ? 0 : i6, (i9 & 8192) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i9 & 16384) != 0 ? 0 : i7, (32768 & i9) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2, (65536 & i9) != 0 ? 0 : i8, (131072 & i9) != 0 ? false : z2, (262144 & i9) != 0 ? false : z3, j, (1048576 & i9) != 0 ? "" : str7, (2097152 & i9) != 0 ? false : z4, (4194304 & i9) != 0 ? "" : str8, (8388608 & i9) != 0 ? 0L : j2, (16777216 & i9) != 0 ? false : z5, (i9 & 33554432) != 0 ? null : readVar);
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final String getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final int getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final boolean getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final String getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final int getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final int getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final boolean getOnAddQueueItem() {
        return this.onAddQueueItem;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final long getOnCustomAction() {
        return this.onCustomAction;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final String getOnPlayFromMediaId() {
        return this.onPlayFromMediaId;
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final boolean getOnPause() {
        return this.onPause;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final String getOnMediaButtonEvent() {
        return this.onMediaButtonEvent;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final long getOnPlay() {
        return this.onPlay;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final boolean getOnFastForward() {
        return this.onFastForward;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final read getOnPrepare() {
        return this.onPrepare;
    }

    public final float IconCompatParcelizer() {
        int i = this.AudioAttributesImplApi21Parcelizer;
        return i > 0 ? this.AudioAttributesImplBaseParcelizer / i : BitmapDescriptorFactory.HUE_RED;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CacheListener)) {
            return false;
        }
        CacheListener cacheListener = (CacheListener) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) cacheListener.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) cacheListener.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesCompatParcelizer, (Object) cacheListener.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) cacheListener.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) cacheListener.read) && this.MediaBrowserCompatCustomActionResultReceiver == cacheListener.MediaBrowserCompatCustomActionResultReceiver && this.MediaBrowserCompatItemReceiver == cacheListener.MediaBrowserCompatItemReceiver && this.AudioAttributesImplApi26Parcelizer == cacheListener.AudioAttributesImplApi26Parcelizer && this.AudioAttributesImplApi21Parcelizer == cacheListener.AudioAttributesImplApi21Parcelizer && this.AudioAttributesImplBaseParcelizer == cacheListener.AudioAttributesImplBaseParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RatingCompat, (Object) cacheListener.RatingCompat) && this.MediaBrowserCompatSearchResultReceiver == cacheListener.MediaBrowserCompatSearchResultReceiver && this.MediaDescriptionCompat == cacheListener.MediaDescriptionCompat && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaMetadataCompat, cacheListener.MediaMetadataCompat) && this.MediaBrowserCompatMediaItem == cacheListener.MediaBrowserCompatMediaItem && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, cacheListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && this.handleMediaPlayPauseIfPendingOnHandler == cacheListener.handleMediaPlayPauseIfPendingOnHandler && this.onCommand == cacheListener.onCommand && this.onAddQueueItem == cacheListener.onAddQueueItem && this.onCustomAction == cacheListener.onCustomAction && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPlayFromMediaId, (Object) cacheListener.onPlayFromMediaId) && this.onPause == cacheListener.onPause && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onMediaButtonEvent, (Object) cacheListener.onMediaButtonEvent) && this.onPlay == cacheListener.onPlay && this.onFastForward == cacheListener.onFastForward && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onPrepare, cacheListener.onPrepare);
    }

    public static final class read {
        private final int AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private final int RemoteActionCompatParcelizer;

        public read(int i, int i2, int i3) {
            this.IconCompatParcelizer = i;
            this.AudioAttributesCompatParcelizer = i2;
            this.RemoteActionCompatParcelizer = i3;
        }

        public final int RemoteActionCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public final int AudioAttributesCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final int read() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof read)) {
                return false;
            }
            read readVar = (read) obj;
            return this.IconCompatParcelizer == readVar.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == readVar.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == readVar.RemoteActionCompatParcelizer;
        }

        public final int hashCode() {
            return (((Integer.hashCode(this.IconCompatParcelizer) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer);
        }

        public final String toString() {
            int i = this.IconCompatParcelizer;
            int i2 = this.AudioAttributesCompatParcelizer;
            int i3 = this.RemoteActionCompatParcelizer;
            StringBuilder sb = new StringBuilder("ActiveRecallDataLsModel(activeRecallStatus=");
            sb.append(i);
            sb.append(", activeRecallScore=");
            sb.append(i2);
            sb.append(", activeRecallPossibleScore=");
            sb.append(i3);
            sb.append(")");
            return sb.toString();
        }
    }

    public final int hashCode() {
        int iHashCode = this.write.hashCode();
        int iHashCode2 = this.IconCompatParcelizer.hashCode();
        int iHashCode3 = this.AudioAttributesCompatParcelizer.hashCode();
        int iHashCode4 = this.RemoteActionCompatParcelizer.hashCode();
        int iHashCode5 = this.read.hashCode();
        int iHashCode6 = Integer.hashCode(this.MediaBrowserCompatCustomActionResultReceiver);
        int iHashCode7 = Integer.hashCode(this.MediaBrowserCompatItemReceiver);
        int iHashCode8 = Boolean.hashCode(this.AudioAttributesImplApi26Parcelizer);
        int iHashCode9 = Integer.hashCode(this.AudioAttributesImplApi21Parcelizer);
        int iHashCode10 = Integer.hashCode(this.AudioAttributesImplBaseParcelizer);
        int iHashCode11 = this.RatingCompat.hashCode();
        int iHashCode12 = Integer.hashCode(this.MediaBrowserCompatSearchResultReceiver);
        int iHashCode13 = Integer.hashCode(this.MediaDescriptionCompat);
        int iHashCode14 = this.MediaMetadataCompat.hashCode();
        int iHashCode15 = Integer.hashCode(this.MediaBrowserCompatMediaItem);
        int iHashCode16 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.hashCode();
        int iHashCode17 = Integer.hashCode(this.handleMediaPlayPauseIfPendingOnHandler);
        int iHashCode18 = Boolean.hashCode(this.onCommand);
        int iHashCode19 = Boolean.hashCode(this.onAddQueueItem);
        int iHashCode20 = Long.hashCode(this.onCustomAction);
        int iHashCode21 = this.onPlayFromMediaId.hashCode();
        int iHashCode22 = Boolean.hashCode(this.onPause);
        int iHashCode23 = this.onMediaButtonEvent.hashCode();
        int iHashCode24 = Long.hashCode(this.onPlay);
        int iHashCode25 = Boolean.hashCode(this.onFastForward);
        read readVar = this.onPrepare;
        return (((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + iHashCode13) * 31) + iHashCode14) * 31) + iHashCode15) * 31) + iHashCode16) * 31) + iHashCode17) * 31) + iHashCode18) * 31) + iHashCode19) * 31) + iHashCode20) * 31) + iHashCode21) * 31) + iHashCode22) * 31) + iHashCode23) * 31) + iHashCode24) * 31) + iHashCode25) * 31) + (readVar == null ? 0 : readVar.hashCode());
    }

    public final String toString() {
        String str = this.write;
        String str2 = this.IconCompatParcelizer;
        String str3 = this.AudioAttributesCompatParcelizer;
        String str4 = this.RemoteActionCompatParcelizer;
        String str5 = this.read;
        int i = this.MediaBrowserCompatCustomActionResultReceiver;
        int i2 = this.MediaBrowserCompatItemReceiver;
        boolean z = this.AudioAttributesImplApi26Parcelizer;
        int i3 = this.AudioAttributesImplApi21Parcelizer;
        int i4 = this.AudioAttributesImplBaseParcelizer;
        String str6 = this.RatingCompat;
        int i5 = this.MediaBrowserCompatSearchResultReceiver;
        int i6 = this.MediaDescriptionCompat;
        List<String> list = this.MediaMetadataCompat;
        int i7 = this.MediaBrowserCompatMediaItem;
        List<String> list2 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i8 = this.handleMediaPlayPauseIfPendingOnHandler;
        boolean z2 = this.onCommand;
        boolean z3 = this.onAddQueueItem;
        long j = this.onCustomAction;
        String str7 = this.onPlayFromMediaId;
        boolean z4 = this.onPause;
        String str8 = this.onMediaButtonEvent;
        long j2 = this.onPlay;
        boolean z5 = this.onFastForward;
        read readVar = this.onPrepare;
        StringBuilder sb = new StringBuilder("CacheListener(write=");
        sb.append(str);
        sb.append(", IconCompatParcelizer=");
        sb.append(str2);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(str3);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(str4);
        sb.append(", read=");
        sb.append(str5);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(i);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(i2);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(z);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(i3);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(i4);
        sb.append(", RatingCompat=");
        sb.append(str6);
        sb.append(", MediaBrowserCompatSearchResultReceiver=");
        sb.append(i5);
        sb.append(", MediaDescriptionCompat=");
        sb.append(i6);
        sb.append(", MediaMetadataCompat=");
        sb.append(list);
        sb.append(", MediaBrowserCompatMediaItem=");
        sb.append(i7);
        sb.append(", MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver=");
        sb.append(list2);
        sb.append(", handleMediaPlayPauseIfPendingOnHandler=");
        sb.append(i8);
        sb.append(", onCommand=");
        sb.append(z2);
        sb.append(", onAddQueueItem=");
        sb.append(z3);
        sb.append(", onCustomAction=");
        sb.append(j);
        sb.append(", onPlayFromMediaId=");
        sb.append(str7);
        sb.append(", onPause=");
        sb.append(z4);
        sb.append(", onMediaButtonEvent=");
        sb.append(str8);
        sb.append(", onPlay=");
        sb.append(j2);
        sb.append(", onFastForward=");
        sb.append(z5);
        sb.append(", onPrepare=");
        sb.append(readVar);
        sb.append(")");
        return sb.toString();
    }
}
