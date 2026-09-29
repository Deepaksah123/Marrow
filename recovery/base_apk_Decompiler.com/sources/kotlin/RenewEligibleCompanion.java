package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/RenewEligibleCompanion;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "write", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class RenewEligibleCompanion {
    private static final /* synthetic */ RenewEligibleCompanion[] AudioAttributesCompatParcelizer;
    public static final RenewEligibleCompanion RemoteActionCompatParcelizer = new RenewEligibleCompanion("SYNCHRONIZED", 0);
    public static final RenewEligibleCompanion write = new RenewEligibleCompanion("PUBLICATION", 1);
    public static final RenewEligibleCompanion read = new RenewEligibleCompanion("NONE", 2);

    private RenewEligibleCompanion(String str, int i) {
    }

    static {
        RenewEligibleCompanion[] renewEligibleCompanionArrWrite = write();
        AudioAttributesCompatParcelizer = renewEligibleCompanionArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(renewEligibleCompanionArrWrite);
    }

    private static final /* synthetic */ RenewEligibleCompanion[] write() {
        return new RenewEligibleCompanion[]{RemoteActionCompatParcelizer, write, read};
    }

    public static RenewEligibleCompanion valueOf(String str) {
        return (RenewEligibleCompanion) Enum.valueOf(RenewEligibleCompanion.class, str);
    }

    public static RenewEligibleCompanion[] values() {
        return (RenewEligibleCompanion[]) AudioAttributesCompatParcelizer.clone();
    }
}
