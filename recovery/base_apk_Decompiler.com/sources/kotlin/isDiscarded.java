package kotlin;

import com.fasterxml.jackson.databind.ObjectReader;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class isDiscarded<T> implements PlanSubscriptionRSModel<ActivityAdapterModule, T> {
    private final ObjectReader AudioAttributesCompatParcelizer;

    isDiscarded(ObjectReader objectReader) {
        this.AudioAttributesCompatParcelizer = objectReader;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.PlanSubscriptionRSModel
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public T IconCompatParcelizer(ActivityAdapterModule activityAdapterModule) throws IOException {
        try {
            return (T) this.AudioAttributesCompatParcelizer.readValue(activityAdapterModule.AudioAttributesImplBaseParcelizer());
        } finally {
            activityAdapterModule.close();
        }
    }
}
