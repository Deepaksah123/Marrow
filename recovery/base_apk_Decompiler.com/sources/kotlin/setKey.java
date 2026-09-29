package kotlin;

import com.marrow.di.app.data.NetworkModule;
import kotlin.PlanSubscriptionRSModel;

/* JADX INFO: loaded from: classes3.dex */
public final class setKey implements getSubmittedOn<PlanSubscriptionRSModel.IconCompatParcelizer> {
    @Override // kotlin.setDescriptionList
    public final /* synthetic */ Object get() {
        return AudioAttributesCompatParcelizer();
    }

    private static PlanSubscriptionRSModel.IconCompatParcelizer AudioAttributesCompatParcelizer() {
        return write();
    }

    public static PlanSubscriptionRSModel.IconCompatParcelizer write() {
        return (PlanSubscriptionRSModel.IconCompatParcelizer) setPossibleScore.write(NetworkModule.AudioAttributesCompatParcelizer());
    }
}
