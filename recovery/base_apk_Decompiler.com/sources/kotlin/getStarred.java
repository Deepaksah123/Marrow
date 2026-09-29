package kotlin;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import kotlin.PlanSubscriptionRSModel;

/* JADX INFO: loaded from: classes4.dex */
public final class getStarred extends PlanSubscriptionRSModel.IconCompatParcelizer {
    private final ObjectMapper read;

    public static getStarred AudioAttributesCompatParcelizer() {
        return RemoteActionCompatParcelizer(new ObjectMapper());
    }

    private static getStarred RemoteActionCompatParcelizer(ObjectMapper objectMapper) {
        return new getStarred(objectMapper);
    }

    private getStarred(ObjectMapper objectMapper) {
        this.read = objectMapper;
    }

    @Override // o.PlanSubscriptionRSModel.IconCompatParcelizer
    public final PlanSubscriptionRSModel<ActivityAdapterModule, ?> RemoteActionCompatParcelizer(Type type, Annotation[] annotationArr, GTNudgeRequestModel gTNudgeRequestModel) {
        return new isDiscarded(this.read.readerFor(this.read.getTypeFactory().constructType(type)));
    }

    @Override // o.PlanSubscriptionRSModel.IconCompatParcelizer
    public final PlanSubscriptionRSModel<?, ThemeKtExternalSyntheticLambda2> write(Type type) {
        return new getReviewAttemptTimeSeconds(this.read.writerFor(this.read.getTypeFactory().constructType(type)));
    }
}
