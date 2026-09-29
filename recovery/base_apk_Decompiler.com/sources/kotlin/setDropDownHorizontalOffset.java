package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/setDropDownHorizontalOffset;", "", "<init>", "(Ljava/lang/String;I)V", "read", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setDropDownHorizontalOffset {
    private static final /* synthetic */ setDropDownHorizontalOffset[] AudioAttributesCompatParcelizer;
    private static final /* synthetic */ getMagicModuleSavedMcqCount RemoteActionCompatParcelizer;
    public static final setDropDownHorizontalOffset read = new setDropDownHorizontalOffset("PreEnter", 0);
    public static final setDropDownHorizontalOffset IconCompatParcelizer = new setDropDownHorizontalOffset("Visible", 1);
    public static final setDropDownHorizontalOffset write = new setDropDownHorizontalOffset("PostExit", 2);

    private setDropDownHorizontalOffset(String str, int i) {
    }

    static {
        setDropDownHorizontalOffset[] setdropdownhorizontaloffsetArr = read();
        AudioAttributesCompatParcelizer = setdropdownhorizontaloffsetArr;
        RemoteActionCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(setdropdownhorizontaloffsetArr);
    }

    private static final /* synthetic */ setDropDownHorizontalOffset[] read() {
        return new setDropDownHorizontalOffset[]{read, IconCompatParcelizer, write};
    }

    public static setDropDownHorizontalOffset valueOf(String str) {
        return (setDropDownHorizontalOffset) Enum.valueOf(setDropDownHorizontalOffset.class, str);
    }

    public static setDropDownHorizontalOffset[] values() {
        return (setDropDownHorizontalOffset[]) AudioAttributesCompatParcelizer.clone();
    }
}
