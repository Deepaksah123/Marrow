package kotlin;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Optional;
import kotlin.PlanSubscriptionRSModel;

/* JADX INFO: loaded from: classes4.dex */
final class GTAnalyticsV2ResponseModel extends PlanSubscriptionRSModel.IconCompatParcelizer {
    static final PlanSubscriptionRSModel.IconCompatParcelizer read = new GTAnalyticsV2ResponseModel();

    GTAnalyticsV2ResponseModel() {
    }

    @Override // o.PlanSubscriptionRSModel.IconCompatParcelizer
    public final PlanSubscriptionRSModel<ActivityAdapterModule, ?> RemoteActionCompatParcelizer(Type type, Annotation[] annotationArr, GTNudgeRequestModel gTNudgeRequestModel) {
        if (AudioAttributesCompatParcelizer(type) != Optional.class) {
            return null;
        }
        return new write(gTNudgeRequestModel.AudioAttributesCompatParcelizer(read((ParameterizedType) type), annotationArr));
    }

    static final class write<T> implements PlanSubscriptionRSModel<ActivityAdapterModule, Optional<T>> {
        private PlanSubscriptionRSModel<ActivityAdapterModule, T> AudioAttributesCompatParcelizer;

        write(PlanSubscriptionRSModel<ActivityAdapterModule, T> planSubscriptionRSModel) {
            this.AudioAttributesCompatParcelizer = planSubscriptionRSModel;
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.PlanSubscriptionRSModel
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Optional<T> IconCompatParcelizer(ActivityAdapterModule activityAdapterModule) throws IOException {
            return Optional.ofNullable(this.AudioAttributesCompatParcelizer.IconCompatParcelizer(activityAdapterModule));
        }
    }
}
