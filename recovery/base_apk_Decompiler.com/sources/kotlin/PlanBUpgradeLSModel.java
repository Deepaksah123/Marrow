package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lo/PlanBUpgradeLSModel;", "", "<init>", "(Ljava/lang/String;I)V", "write", "read", "AudioAttributesImplBaseParcelizer", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PlanBUpgradeLSModel {
    private static final /* synthetic */ PlanBUpgradeLSModel[] IconCompatParcelizer;
    public static final PlanBUpgradeLSModel write = new PlanBUpgradeLSModel("DEBUG", 0);
    public static final PlanBUpgradeLSModel read = new PlanBUpgradeLSModel("INFO", 1);
    private static PlanBUpgradeLSModel AudioAttributesImplBaseParcelizer = new PlanBUpgradeLSModel("WARNING", 2);
    private static PlanBUpgradeLSModel AudioAttributesCompatParcelizer = new PlanBUpgradeLSModel("ERROR", 3);
    public static final PlanBUpgradeLSModel RemoteActionCompatParcelizer = new PlanBUpgradeLSModel("NONE", 4);

    private PlanBUpgradeLSModel(String str, int i) {
    }

    static {
        PlanBUpgradeLSModel[] planBUpgradeLSModelArrIconCompatParcelizer = IconCompatParcelizer();
        IconCompatParcelizer = planBUpgradeLSModelArrIconCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(planBUpgradeLSModelArrIconCompatParcelizer);
    }

    public static PlanBUpgradeLSModel valueOf(String str) {
        return (PlanBUpgradeLSModel) Enum.valueOf(PlanBUpgradeLSModel.class, str);
    }

    public static PlanBUpgradeLSModel[] values() {
        return (PlanBUpgradeLSModel[]) IconCompatParcelizer.clone();
    }

    private static final /* synthetic */ PlanBUpgradeLSModel[] IconCompatParcelizer() {
        return new PlanBUpgradeLSModel[]{write, read, AudioAttributesImplBaseParcelizer, AudioAttributesCompatParcelizer, RemoteActionCompatParcelizer};
    }
}
