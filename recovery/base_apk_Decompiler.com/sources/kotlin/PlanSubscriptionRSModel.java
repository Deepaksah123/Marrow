package kotlin;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/* JADX INFO: loaded from: classes4.dex */
public interface PlanSubscriptionRSModel<F, T> {
    T IconCompatParcelizer(F f) throws IOException;

    public static abstract class IconCompatParcelizer {
        public PlanSubscriptionRSModel<ActivityAdapterModule, ?> RemoteActionCompatParcelizer(Type type, Annotation[] annotationArr, GTNudgeRequestModel gTNudgeRequestModel) {
            return null;
        }

        public PlanSubscriptionRSModel<?, ThemeKtExternalSyntheticLambda2> write(Type type) {
            return null;
        }

        protected static Type read(ParameterizedType parameterizedType) {
            return GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(0, parameterizedType);
        }

        protected static Class<?> AudioAttributesCompatParcelizer(Type type) {
            return GTSubjectAnalyticsV2ResponseModel.RemoteActionCompatParcelizer(type);
        }
    }
}
