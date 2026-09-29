package kotlin;

import com.fasterxml.jackson.databind.ObjectWriter;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class getReviewAttemptTimeSeconds<T> implements PlanSubscriptionRSModel<T, ThemeKtExternalSyntheticLambda2> {
    private static final MediaType IconCompatParcelizer = MediaType.read("application/json; charset=UTF-8");
    private final ObjectWriter read;

    getReviewAttemptTimeSeconds(ObjectWriter objectWriter) {
        this.read = objectWriter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.PlanSubscriptionRSModel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public ThemeKtExternalSyntheticLambda2 IconCompatParcelizer(T t) throws IOException {
        return ThemeKtExternalSyntheticLambda2.create(IconCompatParcelizer, this.read.writeValueAsBytes(t));
    }
}
