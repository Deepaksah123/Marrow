package kotlin;

import java.lang.reflect.Method;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
abstract class getShowNudge<T> {
    abstract T write(Object[] objArr);

    getShowNudge() {
    }

    static <T> getShowNudge<T> AudioAttributesCompatParcelizer(GTNudgeRequestModel gTNudgeRequestModel, Method method) {
        GTSubjectAnalyticsV2RSModelKt gTSubjectAnalyticsV2RSModelKtIconCompatParcelizer = GTSubjectAnalyticsV2RSModelKt.IconCompatParcelizer(gTNudgeRequestModel, method);
        Type genericReturnType = method.getGenericReturnType();
        if (GTSubjectAnalyticsV2ResponseModel.IconCompatParcelizer(genericReturnType)) {
            throw GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer(method, "Method return type must not include a type variable or wildcard: %s", genericReturnType);
        }
        if (genericReturnType == Void.TYPE) {
            throw GTSubjectAnalyticsV2ResponseModel.AudioAttributesCompatParcelizer(method, "Service methods cannot return void.", new Object[0]);
        }
        return GTAnalyticsV2RSModelKt.IconCompatParcelizer(gTNudgeRequestModel, method, gTSubjectAnalyticsV2RSModelKtIconCompatParcelizer);
    }
}
