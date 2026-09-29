package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/getUseInput;", "", "<init>", "(Ljava/lang/String;I)V", "write", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getUseInput {
    private static final /* synthetic */ getUseInput[] AudioAttributesCompatParcelizer;
    private static final /* synthetic */ getMagicModuleSavedMcqCount RemoteActionCompatParcelizer;
    public static final getUseInput write = new getUseInput("Focused", 0);
    public static final getUseInput read = new getUseInput("UnfocusedEmpty", 1);
    public static final getUseInput IconCompatParcelizer = new getUseInput("UnfocusedNotEmpty", 2);

    private getUseInput(String str, int i) {
    }

    static {
        getUseInput[] getuseinputArrWrite = write();
        AudioAttributesCompatParcelizer = getuseinputArrWrite;
        RemoteActionCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(getuseinputArrWrite);
    }

    private static final /* synthetic */ getUseInput[] write() {
        return new getUseInput[]{write, read, IconCompatParcelizer};
    }

    public static getUseInput valueOf(String str) {
        return (getUseInput) Enum.valueOf(getUseInput.class, str);
    }

    public static getUseInput[] values() {
        return (getUseInput[]) AudioAttributesCompatParcelizer.clone();
    }
}
