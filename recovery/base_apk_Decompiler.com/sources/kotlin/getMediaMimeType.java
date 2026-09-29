package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lo/getMediaMimeType;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesImplBaseParcelizer", "AudioAttributesCompatParcelizer", "AudioAttributesImplApi26Parcelizer", "MediaMetadataCompat", "MediaBrowserCompatItemReceiver", "AudioAttributesImplApi21Parcelizer", "read", "RemoteActionCompatParcelizer", "write", "MediaBrowserCompatCustomActionResultReceiver", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getMediaMimeType {
    private static final /* synthetic */ getMediaMimeType[] RatingCompat;
    public static final getMediaMimeType AudioAttributesImplBaseParcelizer = new getMediaMimeType("TYPE_FILTER_NONE", 0);
    public static final getMediaMimeType AudioAttributesCompatParcelizer = new getMediaMimeType("TYPE_FILTER_BOOKMARKED", 1);
    public static final getMediaMimeType AudioAttributesImplApi26Parcelizer = new getMediaMimeType("TYPE_FILTER_RIGHT", 2);
    public static final getMediaMimeType MediaMetadataCompat = new getMediaMimeType("TYPE_FILTER_WRONG", 3);
    public static final getMediaMimeType MediaBrowserCompatItemReceiver = new getMediaMimeType("TYPE_FILTER_SKIPPED", 4);
    public static final getMediaMimeType AudioAttributesImplApi21Parcelizer = new getMediaMimeType("TYPE_FILTER_SILLY_MISTAKES", 5);
    public static final getMediaMimeType read = new getMediaMimeType("TYPE_FILTER_GUESSED_RIGHT", 6);
    public static final getMediaMimeType RemoteActionCompatParcelizer = new getMediaMimeType("TYPE_FILTER_GUESSED_WRONG", 7);
    public static final getMediaMimeType write = new getMediaMimeType("TYPE_FILTER_CHANGED_BY_YOU", 8);
    public static final getMediaMimeType MediaBrowserCompatCustomActionResultReceiver = new getMediaMimeType("TYPE_FILTER_NEW_OR_UPDATED", 9);
    public static final getMediaMimeType IconCompatParcelizer = new getMediaMimeType("TYPE_FILTER_HIGH_YIELD_IDS", 10);

    private getMediaMimeType(String str, int i) {
    }

    static {
        getMediaMimeType[] getmediamimetypeArr = read();
        RatingCompat = getmediamimetypeArr;
        getMagicModuleTimeline.IconCompatParcelizer(getmediamimetypeArr);
    }

    private static final /* synthetic */ getMediaMimeType[] read() {
        return new getMediaMimeType[]{AudioAttributesImplBaseParcelizer, AudioAttributesCompatParcelizer, AudioAttributesImplApi26Parcelizer, MediaMetadataCompat, MediaBrowserCompatItemReceiver, AudioAttributesImplApi21Parcelizer, read, RemoteActionCompatParcelizer, write, MediaBrowserCompatCustomActionResultReceiver, IconCompatParcelizer};
    }

    public static getMediaMimeType valueOf(String str) {
        return (getMediaMimeType) Enum.valueOf(getMediaMimeType.class, str);
    }

    public static getMediaMimeType[] values() {
        return (getMediaMimeType[]) RatingCompat.clone();
    }
}
