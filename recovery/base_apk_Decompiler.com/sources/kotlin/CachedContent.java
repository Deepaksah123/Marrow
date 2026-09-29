package kotlin;

import java.util.List;
import kotlin.Metadata;
import kotlin.buildCacheKey;
import kotlin.isHoleSpan;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b2\b\u0086\b\u0018\u00002\u00020\u0001B\u0095\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\b\u0012\u0006\u0010\u000f\u001a\u00020\b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0004\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b\u0012\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b\u0012\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0004\u0012\u000e\b\u0002\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\"\u001a\u00020\b\u0012\u0006\u0010#\u001a\u00020\u0004¢\u0006\u0004\b$\u0010%J\u001a\u0010&\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010+R\u0017\u0010.\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b,\u0010)R\u001a\u00102\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010+R\u001a\u00105\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b3\u00100\u001a\u0004\b4\u0010+R\u001a\u00107\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b1\u00100\u001a\u0004\b6\u0010+R\u001a\u0010;\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u00109\u001a\u0004\b/\u0010:R\u001a\u00103\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u00100\u001a\u0004\b=\u0010+R \u0010A\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b6\u0010>\u001a\u0004\b?\u0010@R \u00104\u001a\b\u0012\u0004\u0012\u00020\u00020\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bB\u0010>\u001a\u0004\bC\u0010@R\u001a\u00108\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u00109\u001a\u0004\bD\u0010:R\u001a\u0010F\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b?\u00109\u001a\u0004\bE\u0010:R\u001a\u0010G\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010-\u001a\u0004\b.\u0010)R\u001a\u0010J\u001a\u00020\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bG\u0010IR\u001c\u0010?\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bD\u0010K\u001a\u0004\bB\u0010LR\u001a\u0010C\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bF\u00100\u001a\u0004\bA\u0010+R\u001a\u0010,\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bM\u00100\u001a\u0004\bN\u0010+R\u001a\u0010=\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bO\u00100\u001a\u0004\bP\u0010+R\u001a\u00106\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bP\u00100\u001a\u0004\bO\u0010+R \u0010<\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bN\u0010>\u001a\u0004\b<\u0010@R \u0010B\u001a\b\u0012\u0004\u0012\u00020\u00190\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b;\u0010>\u001a\u0004\b;\u0010@R \u00101\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\bJ\u0010@R \u0010N\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u0010>\u001a\u0004\b7\u0010@R\u001a\u0010O\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bJ\u00100\u001a\u0004\b8\u0010+R \u0010/\u001a\b\u0012\u0004\u0012\u00020\u00000\u000b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u0010>\u001a\u0004\b5\u0010@R\u001a\u0010P\u001a\u00020 8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010Q\u001a\u0004\b2\u0010RR\u001a\u0010D\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00109\u001a\u0004\bF\u0010:R\u001a\u0010E\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\bA\u00100\u001a\u0004\b3\u0010+"}, d2 = {"Lo/CachedContent;", "", "", "p0", "", "p1", "p2", "p3", "", "p4", "p5", "", "p6", "p7", "p8", "p9", "p10", "Lo/getCachedBytesLength;", "p11", "p12", "p13", "p14", "p15", "p16", "p17", "Lo/isHoleSpan$IconCompatParcelizer;", "p18", "p19", "Lo/buildCacheKey$IconCompatParcelizer;", "p20", "p21", "p22", "Lo/onDisplayInfoChanged;", "p23", "p24", "p25", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/util/List;Ljava/util/List;ZZILo/getCachedBytesLength;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;Lo/onDisplayInfoChanged;ZLjava/lang/String;)V", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "MediaMetadataCompat", "I", "RemoteActionCompatParcelizer", "onPlayFromMediaId", "Ljava/lang/String;", "onCommand", "read", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatItemReceiver", "IconCompatParcelizer", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "write", "AudioAttributesImplBaseParcelizer", "Z", "()Z", "AudioAttributesCompatParcelizer", "handleMediaPlayPauseIfPendingOnHandler", "onCustomAction", "Ljava/util/List;", "MediaBrowserCompatMediaItem", "()Ljava/util/List;", "MediaBrowserCompatCustomActionResultReceiver", "onAddQueueItem", "MediaBrowserCompatSearchResultReceiver", "onPlay", "onPlayFromSearch", "AudioAttributesImplApi21Parcelizer", "RatingCompat", "Lo/getCachedBytesLength;", "()Lo/getCachedBytesLength;", "MediaDescriptionCompat", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "onPrepareFromSearch", "onMediaButtonEvent", "onPause", "onFastForward", "Lo/onDisplayInfoChanged;", "()Lo/onDisplayInfoChanged;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CachedContent {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final List<isHoleSpan.IconCompatParcelizer> onAddQueueItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final String MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final boolean AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final List<CachedContent> onPlayFromMediaId;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final String onPlayFromSearch;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final boolean onPlay;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final boolean AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final List<String> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final String onPause;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final getCachedBytesLength MediaDescriptionCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int RatingCompat;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final String AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private final List<Integer> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final List<String> onCommand;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private final List<String> handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private final String onCustomAction;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private final Integer MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private final String read;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private final String MediaMetadataCompat;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final onDisplayInfoChanged onFastForward;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final List<buildCacheKey.IconCompatParcelizer> onMediaButtonEvent;

    public CachedContent(int i, String str, String str2, String str3, boolean z, String str4, List<String> list, List<Integer> list2, boolean z2, boolean z3, int i2, getCachedBytesLength getcachedbyteslength, Integer num, String str5, String str6, String str7, String str8, List<String> list3, List<isHoleSpan.IconCompatParcelizer> list4, List<String> list5, List<buildCacheKey.IconCompatParcelizer> list6, String str9, List<CachedContent> list7, onDisplayInfoChanged ondisplayinfochanged, boolean z4, String str10) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(getcachedbyteslength, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        toMagicModuleMetaRepoModel.write(str6, "");
        toMagicModuleMetaRepoModel.write(str7, "");
        toMagicModuleMetaRepoModel.write(str8, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        toMagicModuleMetaRepoModel.write(list4, "");
        toMagicModuleMetaRepoModel.write(list5, "");
        toMagicModuleMetaRepoModel.write(list6, "");
        toMagicModuleMetaRepoModel.write(str9, "");
        toMagicModuleMetaRepoModel.write(list7, "");
        toMagicModuleMetaRepoModel.write(ondisplayinfochanged, "");
        toMagicModuleMetaRepoModel.write(str10, "");
        this.RemoteActionCompatParcelizer = i;
        this.read = str;
        this.IconCompatParcelizer = str2;
        this.write = str3;
        this.AudioAttributesCompatParcelizer = z;
        this.AudioAttributesImplApi26Parcelizer = str4;
        this.MediaBrowserCompatCustomActionResultReceiver = list;
        this.MediaBrowserCompatItemReceiver = list2;
        this.AudioAttributesImplBaseParcelizer = z2;
        this.AudioAttributesImplApi21Parcelizer = z3;
        this.RatingCompat = i2;
        this.MediaDescriptionCompat = getcachedbyteslength;
        this.MediaBrowserCompatMediaItem = num;
        this.MediaBrowserCompatSearchResultReceiver = str5;
        this.MediaMetadataCompat = str6;
        this.onCustomAction = str7;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = str8;
        this.handleMediaPlayPauseIfPendingOnHandler = list3;
        this.onAddQueueItem = list4;
        this.onCommand = list5;
        this.onMediaButtonEvent = list6;
        this.onPause = str9;
        this.onPlayFromMediaId = list7;
        this.onFastForward = ondisplayinfochanged;
        this.onPlay = z4;
        this.onPlayFromSearch = str10;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final String getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    public final List<String> MediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final List<Integer> MediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: onPlay, reason: from getter */
    public final boolean getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from getter */
    public final boolean getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getRatingCompat() {
        return this.RatingCompat;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final getCachedBytesLength getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
    public final Integer getMediaBrowserCompatMediaItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final String getMediaBrowserCompatSearchResultReceiver() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from getter */
    public final String getMediaMetadataCompat() {
        return this.MediaMetadataCompat;
    }

    /* JADX INFO: renamed from: onFastForward, reason: from getter */
    public final String getOnCustomAction() {
        return this.onCustomAction;
    }

    /* JADX INFO: renamed from: onPause, reason: from getter */
    public final String getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public final List<String> handleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    public final List<isHoleSpan.IconCompatParcelizer> AudioAttributesCompatParcelizer() {
        return this.onAddQueueItem;
    }

    public final List<String> MediaDescriptionCompat() {
        return this.onCommand;
    }

    public final List<buildCacheKey.IconCompatParcelizer> write() {
        return this.onMediaButtonEvent;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final String getOnPause() {
        return this.onPause;
    }

    public final List<CachedContent> IconCompatParcelizer() {
        return this.onPlayFromMediaId;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final onDisplayInfoChanged getOnFastForward() {
        return this.onFastForward;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final boolean getOnPlay() {
        return this.onPlay;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final String getOnPlayFromSearch() {
        return this.onPlayFromSearch;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CachedContent)) {
            return false;
        }
        CachedContent cachedContent = (CachedContent) p0;
        return this.RemoteActionCompatParcelizer == cachedContent.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) cachedContent.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) cachedContent.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) cachedContent.write) && this.AudioAttributesCompatParcelizer == cachedContent.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.AudioAttributesImplApi26Parcelizer, (Object) cachedContent.AudioAttributesImplApi26Parcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, cachedContent.MediaBrowserCompatCustomActionResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver, cachedContent.MediaBrowserCompatItemReceiver) && this.AudioAttributesImplBaseParcelizer == cachedContent.AudioAttributesImplBaseParcelizer && this.AudioAttributesImplApi21Parcelizer == cachedContent.AudioAttributesImplApi21Parcelizer && this.RatingCompat == cachedContent.RatingCompat && this.MediaDescriptionCompat == cachedContent.MediaDescriptionCompat && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.MediaBrowserCompatMediaItem, cachedContent.MediaBrowserCompatMediaItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaBrowserCompatSearchResultReceiver, (Object) cachedContent.MediaBrowserCompatSearchResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaMetadataCompat, (Object) cachedContent.MediaMetadataCompat) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onCustomAction, (Object) cachedContent.onCustomAction) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, (Object) cachedContent.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler, cachedContent.handleMediaPlayPauseIfPendingOnHandler) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onAddQueueItem, cachedContent.onAddQueueItem) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onCommand, cachedContent.onCommand) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onMediaButtonEvent, cachedContent.onMediaButtonEvent) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPause, (Object) cachedContent.onPause) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.onPlayFromMediaId, cachedContent.onPlayFromMediaId) && this.onFastForward == cachedContent.onFastForward && this.onPlay == cachedContent.onPlay && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.onPlayFromSearch, (Object) cachedContent.onPlayFromSearch);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.RemoteActionCompatParcelizer);
        int iHashCode2 = this.read.hashCode();
        int iHashCode3 = this.IconCompatParcelizer.hashCode();
        int iHashCode4 = this.write.hashCode();
        int iHashCode5 = Boolean.hashCode(this.AudioAttributesCompatParcelizer);
        int iHashCode6 = this.AudioAttributesImplApi26Parcelizer.hashCode();
        int iHashCode7 = this.MediaBrowserCompatCustomActionResultReceiver.hashCode();
        int iHashCode8 = this.MediaBrowserCompatItemReceiver.hashCode();
        int iHashCode9 = Boolean.hashCode(this.AudioAttributesImplBaseParcelizer);
        int iHashCode10 = Boolean.hashCode(this.AudioAttributesImplApi21Parcelizer);
        int iHashCode11 = Integer.hashCode(this.RatingCompat);
        int iHashCode12 = this.MediaDescriptionCompat.hashCode();
        Integer num = this.MediaBrowserCompatMediaItem;
        return (((((((((((((((((((((((((((((((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + iHashCode9) * 31) + iHashCode10) * 31) + iHashCode11) * 31) + iHashCode12) * 31) + (num == null ? 0 : num.hashCode())) * 31) + this.MediaBrowserCompatSearchResultReceiver.hashCode()) * 31) + this.MediaMetadataCompat.hashCode()) * 31) + this.onCustomAction.hashCode()) * 31) + this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.hashCode()) * 31) + this.handleMediaPlayPauseIfPendingOnHandler.hashCode()) * 31) + this.onAddQueueItem.hashCode()) * 31) + this.onCommand.hashCode()) * 31) + this.onMediaButtonEvent.hashCode()) * 31) + this.onPause.hashCode()) * 31) + this.onPlayFromMediaId.hashCode()) * 31) + this.onFastForward.hashCode()) * 31) + Boolean.hashCode(this.onPlay)) * 31) + this.onPlayFromSearch.hashCode();
    }

    public final String toString() {
        int i = this.RemoteActionCompatParcelizer;
        String str = this.read;
        String str2 = this.IconCompatParcelizer;
        String str3 = this.write;
        boolean z = this.AudioAttributesCompatParcelizer;
        String str4 = this.AudioAttributesImplApi26Parcelizer;
        List<String> list = this.MediaBrowserCompatCustomActionResultReceiver;
        List<Integer> list2 = this.MediaBrowserCompatItemReceiver;
        boolean z2 = this.AudioAttributesImplBaseParcelizer;
        boolean z3 = this.AudioAttributesImplApi21Parcelizer;
        int i2 = this.RatingCompat;
        getCachedBytesLength getcachedbyteslength = this.MediaDescriptionCompat;
        Integer num = this.MediaBrowserCompatMediaItem;
        String str5 = this.MediaBrowserCompatSearchResultReceiver;
        String str6 = this.MediaMetadataCompat;
        String str7 = this.onCustomAction;
        String str8 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        List<String> list3 = this.handleMediaPlayPauseIfPendingOnHandler;
        List<isHoleSpan.IconCompatParcelizer> list4 = this.onAddQueueItem;
        List<String> list5 = this.onCommand;
        List<buildCacheKey.IconCompatParcelizer> list6 = this.onMediaButtonEvent;
        String str9 = this.onPause;
        List<CachedContent> list7 = this.onPlayFromMediaId;
        onDisplayInfoChanged ondisplayinfochanged = this.onFastForward;
        boolean z4 = this.onPlay;
        String str10 = this.onPlayFromSearch;
        StringBuilder sb = new StringBuilder("CachedContent(RemoteActionCompatParcelizer=");
        sb.append(i);
        sb.append(", read=");
        sb.append(str);
        sb.append(", IconCompatParcelizer=");
        sb.append(str2);
        sb.append(", write=");
        sb.append(str3);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(z);
        sb.append(", AudioAttributesImplApi26Parcelizer=");
        sb.append(str4);
        sb.append(", MediaBrowserCompatCustomActionResultReceiver=");
        sb.append(list);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(list2);
        sb.append(", AudioAttributesImplBaseParcelizer=");
        sb.append(z2);
        sb.append(", AudioAttributesImplApi21Parcelizer=");
        sb.append(z3);
        sb.append(", RatingCompat=");
        sb.append(i2);
        sb.append(", MediaDescriptionCompat=");
        sb.append(getcachedbyteslength);
        sb.append(", MediaBrowserCompatMediaItem=");
        sb.append(num);
        sb.append(", MediaBrowserCompatSearchResultReceiver=");
        sb.append(str5);
        sb.append(", MediaMetadataCompat=");
        sb.append(str6);
        sb.append(", onCustomAction=");
        sb.append(str7);
        sb.append(", MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver=");
        sb.append(str8);
        sb.append(", handleMediaPlayPauseIfPendingOnHandler=");
        sb.append(list3);
        sb.append(", onAddQueueItem=");
        sb.append(list4);
        sb.append(", onCommand=");
        sb.append(list5);
        sb.append(", onMediaButtonEvent=");
        sb.append(list6);
        sb.append(", onPause=");
        sb.append(str9);
        sb.append(", onPlayFromMediaId=");
        sb.append(list7);
        sb.append(", onFastForward=");
        sb.append(ondisplayinfochanged);
        sb.append(", onPlay=");
        sb.append(z4);
        sb.append(", onPlayFromSearch=");
        sb.append(str10);
        sb.append(")");
        return sb.toString();
    }
}
