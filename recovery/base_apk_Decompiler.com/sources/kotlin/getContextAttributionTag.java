package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/getContextAttributionTag;", "", "<init>", "(Ljava/lang/String;I)V", "read", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getContextAttributionTag {
    private static final /* synthetic */ getContextAttributionTag[] RemoteActionCompatParcelizer;
    public static final getContextAttributionTag read = new getContextAttributionTag("NONE", 0);
    public static final getContextAttributionTag AudioAttributesCompatParcelizer = new getContextAttributionTag("G", 1);
    public static final getContextAttributionTag IconCompatParcelizer = new getContextAttributionTag("M", 2);
    public static final getContextAttributionTag write = new getContextAttributionTag("S", 3);

    private getContextAttributionTag(String str, int i) {
    }

    static {
        getContextAttributionTag[] getcontextattributiontagArr = read();
        RemoteActionCompatParcelizer = getcontextattributiontagArr;
        getMagicModuleTimeline.IconCompatParcelizer(getcontextattributiontagArr);
    }

    private static final /* synthetic */ getContextAttributionTag[] read() {
        return new getContextAttributionTag[]{read, AudioAttributesCompatParcelizer, IconCompatParcelizer, write};
    }

    public static getContextAttributionTag valueOf(String str) {
        return (getContextAttributionTag) Enum.valueOf(getContextAttributionTag.class, str);
    }

    public static getContextAttributionTag[] values() {
        return (getContextAttributionTag[]) RemoteActionCompatParcelizer.clone();
    }
}
