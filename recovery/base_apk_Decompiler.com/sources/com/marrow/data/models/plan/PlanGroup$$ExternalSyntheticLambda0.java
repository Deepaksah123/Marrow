package com.marrow.data.models.plan;

import com.marrow.data.api.models.response.plan.Coupon;
import java.util.Comparator;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class PlanGroup$$ExternalSyntheticLambda0 implements Comparator {
    public static int AudioAttributesCompatParcelizer;
    public static int write;
    public final /* synthetic */ Coupon f$0;

    public /* synthetic */ PlanGroup$$ExternalSyntheticLambda0(Coupon coupon) {
        this.f$0 = coupon;
    }

    public static int IconCompatParcelizer() {
        int i = write;
        int i2 = i % 9128089;
        write = i + 1;
        if (i2 != 0) {
            return AudioAttributesCompatParcelizer;
        }
        int iMaxMemory = (int) Runtime.getRuntime().maxMemory();
        AudioAttributesCompatParcelizer = iMaxMemory;
        return iMaxMemory;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return PlanGroup.lambda$getPlanGroupSorted$0(this.f$0, (PlanGroup) obj, (PlanGroup) obj2);
    }
}
