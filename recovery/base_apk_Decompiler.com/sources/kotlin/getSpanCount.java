package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/getSpanCount;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getSpanCount {
    private static final /* synthetic */ getSpanCount[] RemoteActionCompatParcelizer;
    private static final /* synthetic */ getMagicModuleSavedMcqCount read;
    public static final getSpanCount AudioAttributesCompatParcelizer = new getSpanCount("EditableText", 0);
    public static final getSpanCount write = new getSpanCount("StaticText", 1);

    private getSpanCount(String str, int i) {
    }

    static {
        getSpanCount[] getspancountArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        RemoteActionCompatParcelizer = getspancountArrRemoteActionCompatParcelizer;
        read = getMagicModuleTimeline.IconCompatParcelizer(getspancountArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ getSpanCount[] RemoteActionCompatParcelizer() {
        return new getSpanCount[]{AudioAttributesCompatParcelizer, write};
    }

    public static getSpanCount valueOf(String str) {
        return (getSpanCount) Enum.valueOf(getSpanCount.class, str);
    }

    public static getSpanCount[] values() {
        return (getSpanCount[]) RemoteActionCompatParcelizer.clone();
    }
}
