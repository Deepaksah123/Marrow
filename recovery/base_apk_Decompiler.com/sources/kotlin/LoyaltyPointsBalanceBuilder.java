package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/LoyaltyPointsBalanceBuilder;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "read", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LoyaltyPointsBalanceBuilder {
    private static final /* synthetic */ LoyaltyPointsBalanceBuilder[] IconCompatParcelizer;
    public static final LoyaltyPointsBalanceBuilder RemoteActionCompatParcelizer = new LoyaltyPointsBalanceBuilder("CURRENT", 0);
    public static final LoyaltyPointsBalanceBuilder read = new LoyaltyPointsBalanceBuilder("UPCOMING", 1);
    public static final LoyaltyPointsBalanceBuilder AudioAttributesCompatParcelizer = new LoyaltyPointsBalanceBuilder("PREVIOUS", 2);

    private LoyaltyPointsBalanceBuilder(String str, int i) {
    }

    static {
        LoyaltyPointsBalanceBuilder[] loyaltyPointsBalanceBuilderArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        IconCompatParcelizer = loyaltyPointsBalanceBuilderArrAudioAttributesCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(loyaltyPointsBalanceBuilderArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ LoyaltyPointsBalanceBuilder[] AudioAttributesCompatParcelizer() {
        return new LoyaltyPointsBalanceBuilder[]{RemoteActionCompatParcelizer, read, AudioAttributesCompatParcelizer};
    }

    public static LoyaltyPointsBalanceBuilder valueOf(String str) {
        return (LoyaltyPointsBalanceBuilder) Enum.valueOf(LoyaltyPointsBalanceBuilder.class, str);
    }

    public static LoyaltyPointsBalanceBuilder[] values() {
        return (LoyaltyPointsBalanceBuilder[]) IconCompatParcelizer.clone();
    }
}
