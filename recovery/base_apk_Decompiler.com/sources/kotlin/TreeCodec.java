package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0011\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012"}, d2 = {"Lo/TreeCodec;", "", "<init>", "(Ljava/lang/String;I)V", "read", "write", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "AudioAttributesImplApi21Parcelizer", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "MediaDescriptionCompat", "MediaBrowserCompatSearchResultReceiver", "MediaMetadataCompat", "RatingCompat", "MediaBrowserCompatMediaItem"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class TreeCodec {
    private static final /* synthetic */ getMagicModuleSavedMcqCount handleMediaPlayPauseIfPendingOnHandler;
    private static final /* synthetic */ TreeCodec[] onCustomAction;
    public static final TreeCodec read = new TreeCodec("CornerExtraExtraLarge", 0);
    public static final TreeCodec write = new TreeCodec("CornerExtraLarge", 1);
    public static final TreeCodec AudioAttributesCompatParcelizer = new TreeCodec("CornerExtraLargeIncreased", 2);
    public static final TreeCodec RemoteActionCompatParcelizer = new TreeCodec("CornerExtraLargeTop", 3);
    public static final TreeCodec IconCompatParcelizer = new TreeCodec("CornerExtraSmall", 4);
    public static final TreeCodec AudioAttributesImplApi26Parcelizer = new TreeCodec("CornerExtraSmallTop", 5);
    public static final TreeCodec AudioAttributesImplApi21Parcelizer = new TreeCodec("CornerFull", 6);
    public static final TreeCodec AudioAttributesImplBaseParcelizer = new TreeCodec("CornerLarge", 7);
    public static final TreeCodec MediaBrowserCompatCustomActionResultReceiver = new TreeCodec("CornerLargeEnd", 8);
    public static final TreeCodec MediaBrowserCompatItemReceiver = new TreeCodec("CornerLargeIncreased", 9);
    public static final TreeCodec MediaDescriptionCompat = new TreeCodec("CornerLargeStart", 10);
    public static final TreeCodec MediaBrowserCompatSearchResultReceiver = new TreeCodec("CornerLargeTop", 11);
    public static final TreeCodec MediaMetadataCompat = new TreeCodec("CornerMedium", 12);
    public static final TreeCodec RatingCompat = new TreeCodec("CornerNone", 13);
    public static final TreeCodec MediaBrowserCompatMediaItem = new TreeCodec("CornerSmall", 14);

    private TreeCodec(String str, int i) {
    }

    static {
        TreeCodec[] treeCodecArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        onCustomAction = treeCodecArrRemoteActionCompatParcelizer;
        handleMediaPlayPauseIfPendingOnHandler = getMagicModuleTimeline.IconCompatParcelizer(treeCodecArrRemoteActionCompatParcelizer);
    }

    public static TreeCodec valueOf(String str) {
        return (TreeCodec) Enum.valueOf(TreeCodec.class, str);
    }

    public static TreeCodec[] values() {
        return (TreeCodec[]) onCustomAction.clone();
    }

    private static final /* synthetic */ TreeCodec[] RemoteActionCompatParcelizer() {
        return new TreeCodec[]{read, write, AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer, IconCompatParcelizer, AudioAttributesImplApi26Parcelizer, AudioAttributesImplApi21Parcelizer, AudioAttributesImplBaseParcelizer, MediaBrowserCompatCustomActionResultReceiver, MediaBrowserCompatItemReceiver, MediaDescriptionCompat, MediaBrowserCompatSearchResultReceiver, MediaMetadataCompat, RatingCompat, MediaBrowserCompatMediaItem};
    }
}
