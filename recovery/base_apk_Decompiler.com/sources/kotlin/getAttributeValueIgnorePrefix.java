package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lo/getAttributeValueIgnorePrefix;", "", "<init>", "(Ljava/lang/String;I)V", "read", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatItemReceiver", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getAttributeValueIgnorePrefix {
    private static final /* synthetic */ getAttributeValueIgnorePrefix[] AudioAttributesImplApi21Parcelizer;
    public static final getAttributeValueIgnorePrefix read = new getAttributeValueIgnorePrefix("ALL", 0);
    public static final getAttributeValueIgnorePrefix AudioAttributesImplBaseParcelizer = new getAttributeValueIgnorePrefix("QBANK", 1);
    public static final getAttributeValueIgnorePrefix MediaBrowserCompatCustomActionResultReceiver = new getAttributeValueIgnorePrefix("VIDEO", 2);
    public static final getAttributeValueIgnorePrefix MediaBrowserCompatItemReceiver = new getAttributeValueIgnorePrefix("TEST", 3);
    public static final getAttributeValueIgnorePrefix RemoteActionCompatParcelizer = new getAttributeValueIgnorePrefix("PEARL", 4);
    public static final getAttributeValueIgnorePrefix AudioAttributesCompatParcelizer = new getAttributeValueIgnorePrefix("PEARL_ID", 5);
    public static final getAttributeValueIgnorePrefix write = new getAttributeValueIgnorePrefix("MCQ_ID", 6);
    public static final getAttributeValueIgnorePrefix IconCompatParcelizer = new getAttributeValueIgnorePrefix("NONE", 7);

    private getAttributeValueIgnorePrefix(String str, int i) {
    }

    static {
        getAttributeValueIgnorePrefix[] getattributevalueignoreprefixArrWrite = write();
        AudioAttributesImplApi21Parcelizer = getattributevalueignoreprefixArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(getattributevalueignoreprefixArrWrite);
    }

    private static final /* synthetic */ getAttributeValueIgnorePrefix[] write() {
        return new getAttributeValueIgnorePrefix[]{read, AudioAttributesImplBaseParcelizer, MediaBrowserCompatCustomActionResultReceiver, MediaBrowserCompatItemReceiver, RemoteActionCompatParcelizer, AudioAttributesCompatParcelizer, write, IconCompatParcelizer};
    }

    public static getAttributeValueIgnorePrefix valueOf(String str) {
        return (getAttributeValueIgnorePrefix) Enum.valueOf(getAttributeValueIgnorePrefix.class, str);
    }

    public static getAttributeValueIgnorePrefix[] values() {
        return (getAttributeValueIgnorePrefix[]) AudioAttributesImplApi21Parcelizer.clone();
    }
}
