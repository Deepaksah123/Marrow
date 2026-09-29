package kotlin;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
final class getDefaultPlanBannerDesign implements InvocationHandler {
    private final RenewEligible AudioAttributesCompatParcelizer;
    private final List IconCompatParcelizer;
    private final Map RemoteActionCompatParcelizer;
    private final RenewEligible read;
    private final Class write;

    public getDefaultPlanBannerDesign(Class cls, Map map, RenewEligible renewEligible, RenewEligible renewEligible2, List list) {
        this.write = cls;
        this.RemoteActionCompatParcelizer = map;
        this.AudioAttributesCompatParcelizer = renewEligible;
        this.read = renewEligible2;
        this.IconCompatParcelizer = list;
    }

    @Override // java.lang.reflect.InvocationHandler
    public final Object invoke(Object obj, Method method, Object[] objArr) {
        return getDeeplinks.AudioAttributesCompatParcelizer(this.write, this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, this.read, this.IconCompatParcelizer, method, objArr);
    }
}
