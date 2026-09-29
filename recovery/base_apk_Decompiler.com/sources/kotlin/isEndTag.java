package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lo/isEndTag;", "", "<init>", "(Ljava/lang/String;I)V", "read", "AudioAttributesImplApi26Parcelizer", "MediaMetadataCompat", "AudioAttributesCompatParcelizer", "write", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "AudioAttributesImplApi21Parcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isEndTag {
    private static final /* synthetic */ isEndTag[] MediaBrowserCompatMediaItem;
    public static final isEndTag read = new isEndTag("INIT", 0);
    public static final isEndTag AudioAttributesImplApi26Parcelizer = new isEndTag("RECENT_SEARCH", 1);
    public static final isEndTag MediaMetadataCompat = new isEndTag("TABS", 2);
    public static final isEndTag AudioAttributesCompatParcelizer = new isEndTag("NO_TABS", 3);
    public static final isEndTag write = new isEndTag("NO_RESULT", 4);
    public static final isEndTag AudioAttributesImplBaseParcelizer = new isEndTag("START_LOADING", 5);
    public static final isEndTag MediaBrowserCompatCustomActionResultReceiver = new isEndTag("STOP_LOADING", 6);
    public static final isEndTag MediaBrowserCompatItemReceiver = new isEndTag("SHOW_CLOSE", 7);
    public static final isEndTag RemoteActionCompatParcelizer = new isEndTag("HIDE_CLOSE", 8);
    public static final isEndTag IconCompatParcelizer = new isEndTag("EMPTY", 9);
    public static final isEndTag AudioAttributesImplApi21Parcelizer = new isEndTag("SHOW_PRO_LABEL", 10);

    private isEndTag(String str, int i) {
    }

    static {
        isEndTag[] isendtagArrIconCompatParcelizer = IconCompatParcelizer();
        MediaBrowserCompatMediaItem = isendtagArrIconCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(isendtagArrIconCompatParcelizer);
    }

    private static final /* synthetic */ isEndTag[] IconCompatParcelizer() {
        return new isEndTag[]{read, AudioAttributesImplApi26Parcelizer, MediaMetadataCompat, AudioAttributesCompatParcelizer, write, AudioAttributesImplBaseParcelizer, MediaBrowserCompatCustomActionResultReceiver, MediaBrowserCompatItemReceiver, RemoteActionCompatParcelizer, IconCompatParcelizer, AudioAttributesImplApi21Parcelizer};
    }

    public static isEndTag valueOf(String str) {
        return (isEndTag) Enum.valueOf(isEndTag.class, str);
    }

    public static isEndTag[] values() {
        return (isEndTag[]) MediaBrowserCompatMediaItem.clone();
    }
}
