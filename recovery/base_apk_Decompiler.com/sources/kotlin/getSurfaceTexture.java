package kotlin;

import com.marrow2.data.subscription.remote.model.PlanSubscriptionRSModel;
import com.marrow2.data.subscription.remote.model.SubscriptionDetailRSModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.dispatchOnFrameAvailable;

/* JADX INFO: loaded from: classes3.dex */
public final class getSurfaceTexture {
    public static final dispatchOnFrameAvailable IconCompatParcelizer(PlanSubscriptionRSModel planSubscriptionRSModel) {
        toMagicModuleMetaRepoModel.write(planSubscriptionRSModel, "");
        String invoiceUrl = planSubscriptionRSModel.getInvoiceUrl();
        Long paymentDate = planSubscriptionRSModel.getPaymentDate();
        String paymentRefId = planSubscriptionRSModel.getPaymentRefId();
        String id = planSubscriptionRSModel.getPlanData().getId();
        List<SubscriptionDetailRSModel> subscriptionDetails = planSubscriptionRSModel.getPlanData().getSubscriptionDetails();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Iterable) subscriptionDetails, 10));
        Iterator<T> it = subscriptionDetails.iterator();
        while (it.hasNext()) {
            arrayList.add(write((SubscriptionDetailRSModel) it.next()));
        }
        String title = planSubscriptionRSModel.getPlanData().getTitle();
        return new dispatchOnFrameAvailable(invoiceUrl, paymentDate, paymentRefId, new dispatchOnFrameAvailable.IconCompatParcelizer(id, planSubscriptionRSModel.getPlanData().getSubscriptionPeriod(), title, arrayList), planSubscriptionRSModel.isFreePlan(), planSubscriptionRSModel.isAddressAvailable(), planSubscriptionRSModel.getAddOnPlans());
    }

    private static dispatchOnFrameAvailable.read write(SubscriptionDetailRSModel subscriptionDetailRSModel) {
        toMagicModuleMetaRepoModel.write(subscriptionDetailRSModel, "");
        return new dispatchOnFrameAvailable.read(subscriptionDetailRSModel.getContentId(), subscriptionDetailRSModel.getContentType(), subscriptionDetailRSModel.getContentNameForEvent());
    }
}
