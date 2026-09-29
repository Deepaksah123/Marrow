package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/setContentInsetsRelative;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setContentInsetsRelative {
    private static final /* synthetic */ setContentInsetsRelative[] AudioAttributesCompatParcelizer;
    public static final setContentInsetsRelative IconCompatParcelizer = new setContentInsetsRelative("Restart", 0);
    public static final setContentInsetsRelative RemoteActionCompatParcelizer = new setContentInsetsRelative("Reverse", 1);
    private static final /* synthetic */ getMagicModuleSavedMcqCount read;

    private setContentInsetsRelative(String str, int i) {
    }

    static {
        setContentInsetsRelative[] setcontentinsetsrelativeArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        AudioAttributesCompatParcelizer = setcontentinsetsrelativeArrRemoteActionCompatParcelizer;
        read = getMagicModuleTimeline.IconCompatParcelizer(setcontentinsetsrelativeArrRemoteActionCompatParcelizer);
    }

    private static final /* synthetic */ setContentInsetsRelative[] RemoteActionCompatParcelizer() {
        return new setContentInsetsRelative[]{IconCompatParcelizer, RemoteActionCompatParcelizer};
    }

    public static setContentInsetsRelative valueOf(String str) {
        return (setContentInsetsRelative) Enum.valueOf(setContentInsetsRelative.class, str);
    }

    public static setContentInsetsRelative[] values() {
        return (setContentInsetsRelative[]) AudioAttributesCompatParcelizer.clone();
    }
}
