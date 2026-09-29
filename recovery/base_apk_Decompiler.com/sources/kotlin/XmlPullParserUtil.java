package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000e"}, d2 = {"Lo/XmlPullParserUtil;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "MediaBrowserCompatItemReceiver", "write", "AudioAttributesImplApi21Parcelizer", "IconCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "AudioAttributesImplApi26Parcelizer", "MediaBrowserCompatSearchResultReceiver", "AudioAttributesImplBaseParcelizer", "RemoteActionCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class XmlPullParserUtil {
    private static final /* synthetic */ XmlPullParserUtil[] MediaDescriptionCompat;
    public static final XmlPullParserUtil AudioAttributesCompatParcelizer = new XmlPullParserUtil("MCQ", 0);
    public static final XmlPullParserUtil MediaBrowserCompatItemReceiver = new XmlPullParserUtil("PRACTICAL_CORNER_MCQ", 1);
    public static final XmlPullParserUtil write = new XmlPullParserUtil("NORMAL_QBANK", 2);
    public static final XmlPullParserUtil AudioAttributesImplApi21Parcelizer = new XmlPullParserUtil("PRACTICAL_CORNER_QBANK", 3);
    public static final XmlPullParserUtil IconCompatParcelizer = new XmlPullParserUtil("PEARL", 4);
    public static final XmlPullParserUtil MediaBrowserCompatCustomActionResultReceiver = new XmlPullParserUtil("TEST", 5);
    public static final XmlPullParserUtil AudioAttributesImplApi26Parcelizer = new XmlPullParserUtil("VIDEO", 6);
    public static final XmlPullParserUtil MediaBrowserCompatSearchResultReceiver = new XmlPullParserUtil("VIDEO_TIMELINE", 7);
    public static final XmlPullParserUtil AudioAttributesImplBaseParcelizer = new XmlPullParserUtil("PRACTICAL_CORNER_MCQ_ID", 8);
    public static final XmlPullParserUtil RemoteActionCompatParcelizer = new XmlPullParserUtil("NORMAL_MCQ_ID", 9);
    public static final XmlPullParserUtil read = new XmlPullParserUtil("PEARL_ID", 10);

    private XmlPullParserUtil(String str, int i) {
    }

    static {
        XmlPullParserUtil[] xmlPullParserUtilArr = read();
        MediaDescriptionCompat = xmlPullParserUtilArr;
        getMagicModuleTimeline.IconCompatParcelizer(xmlPullParserUtilArr);
    }

    private static final /* synthetic */ XmlPullParserUtil[] read() {
        return new XmlPullParserUtil[]{AudioAttributesCompatParcelizer, MediaBrowserCompatItemReceiver, write, AudioAttributesImplApi21Parcelizer, IconCompatParcelizer, MediaBrowserCompatCustomActionResultReceiver, AudioAttributesImplApi26Parcelizer, MediaBrowserCompatSearchResultReceiver, AudioAttributesImplBaseParcelizer, RemoteActionCompatParcelizer, read};
    }

    public static XmlPullParserUtil valueOf(String str) {
        return (XmlPullParserUtil) Enum.valueOf(XmlPullParserUtil.class, str);
    }

    public static XmlPullParserUtil[] values() {
        return (XmlPullParserUtil[]) MediaDescriptionCompat.clone();
    }
}
