package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/isFirstModule;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isFirstModule {
    private static final /* synthetic */ isFirstModule[] RemoteActionCompatParcelizer;
    public static final isFirstModule IconCompatParcelizer = new isFirstModule("TOP_DOWN", 0);
    public static final isFirstModule AudioAttributesCompatParcelizer = new isFirstModule("BOTTOM_UP", 1);

    private isFirstModule(String str, int i) {
    }

    static {
        isFirstModule[] isfirstmoduleArrWrite = write();
        RemoteActionCompatParcelizer = isfirstmoduleArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(isfirstmoduleArrWrite);
    }

    private static final /* synthetic */ isFirstModule[] write() {
        return new isFirstModule[]{IconCompatParcelizer, AudioAttributesCompatParcelizer};
    }

    public static isFirstModule valueOf(String str) {
        return (isFirstModule) Enum.valueOf(isFirstModule.class, str);
    }

    public static isFirstModule[] values() {
        return (isFirstModule[]) RemoteActionCompatParcelizer.clone();
    }
}
