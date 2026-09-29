package kotlin;

import java.util.concurrent.ThreadFactory;
import kotlin.getIds;

/* JADX INFO: loaded from: classes4.dex */
public final class Coupon extends getIds {
    private static final getCouponType write = new getCouponType("RxNewThreadScheduler", Math.max(1, Math.min(10, Integer.getInteger("rx2.newthread-priority", 5).intValue())));
    private ThreadFactory IconCompatParcelizer;

    public Coupon() {
        this(write);
    }

    private Coupon(ThreadFactory threadFactory) {
        this.IconCompatParcelizer = threadFactory;
    }

    @Override // kotlin.getIds
    public final getIds.IconCompatParcelizer IconCompatParcelizer() {
        return new getCouponCode(this.IconCompatParcelizer);
    }
}
