package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/PaymentDataRequestBuilder;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentDataRequestBuilder {
    private static final /* synthetic */ PaymentDataRequestBuilder[] IconCompatParcelizer;
    public static final PaymentDataRequestBuilder RemoteActionCompatParcelizer = new PaymentDataRequestBuilder("PERCENTILE", 0);
    public static final PaymentDataRequestBuilder read = new PaymentDataRequestBuilder("PERCENTAGE", 1);

    static {
        PaymentDataRequestBuilder[] paymentDataRequestBuilderArrWrite = write();
        IconCompatParcelizer = paymentDataRequestBuilderArrWrite;
        getMagicModuleTimeline.IconCompatParcelizer(paymentDataRequestBuilderArrWrite);
    }

    private PaymentDataRequestBuilder(String str, int i) {
    }

    private static final /* synthetic */ PaymentDataRequestBuilder[] write() {
        return new PaymentDataRequestBuilder[]{RemoteActionCompatParcelizer, read};
    }

    public static PaymentDataRequestBuilder valueOf(String str) {
        return (PaymentDataRequestBuilder) Enum.valueOf(PaymentDataRequestBuilder.class, str);
    }

    public static PaymentDataRequestBuilder[] values() {
        return (PaymentDataRequestBuilder[]) IconCompatParcelizer.clone();
    }
}
