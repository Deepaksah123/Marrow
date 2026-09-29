package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/getPattern;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getPattern {
    private static final /* synthetic */ getMagicModuleSavedMcqCount read;
    private static final /* synthetic */ getPattern[] write;
    public static final getPattern AudioAttributesCompatParcelizer = new getPattern("Hidden", 0);
    public static final getPattern RemoteActionCompatParcelizer = new getPattern("Expanded", 1);
    public static final getPattern IconCompatParcelizer = new getPattern("HalfExpanded", 2);

    private getPattern(String str, int i) {
    }

    static {
        getPattern[] getpatternArrIconCompatParcelizer = IconCompatParcelizer();
        write = getpatternArrIconCompatParcelizer;
        read = getMagicModuleTimeline.IconCompatParcelizer(getpatternArrIconCompatParcelizer);
    }

    private static final /* synthetic */ getPattern[] IconCompatParcelizer() {
        return new getPattern[]{AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer, IconCompatParcelizer};
    }

    public static getPattern valueOf(String str) {
        return (getPattern) Enum.valueOf(getPattern.class, str);
    }

    public static getPattern[] values() {
        return (getPattern[]) write.clone();
    }
}
