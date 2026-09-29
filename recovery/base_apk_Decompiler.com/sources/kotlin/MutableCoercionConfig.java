package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/MutableCoercionConfig;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MutableCoercionConfig {
    private static final /* synthetic */ getMagicModuleSavedMcqCount read;
    private static final /* synthetic */ MutableCoercionConfig[] write;
    public static final MutableCoercionConfig IconCompatParcelizer = new MutableCoercionConfig("On", 0);
    public static final MutableCoercionConfig AudioAttributesCompatParcelizer = new MutableCoercionConfig("Off", 1);
    public static final MutableCoercionConfig RemoteActionCompatParcelizer = new MutableCoercionConfig("Indeterminate", 2);

    private MutableCoercionConfig(String str, int i) {
    }

    static {
        MutableCoercionConfig[] mutableCoercionConfigArrIconCompatParcelizer = IconCompatParcelizer();
        write = mutableCoercionConfigArrIconCompatParcelizer;
        read = getMagicModuleTimeline.IconCompatParcelizer(mutableCoercionConfigArrIconCompatParcelizer);
    }

    private static final /* synthetic */ MutableCoercionConfig[] IconCompatParcelizer() {
        return new MutableCoercionConfig[]{IconCompatParcelizer, AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer};
    }

    public static MutableCoercionConfig valueOf(String str) {
        return (MutableCoercionConfig) Enum.valueOf(MutableCoercionConfig.class, str);
    }

    public static MutableCoercionConfig[] values() {
        return (MutableCoercionConfig[]) write.clone();
    }
}
