package kotlin;

import com.marrow.data.api.models.response.notespurchase.NotesPurchasePlanDetailsResponse;
import com.marrow.data.api.models.response.notespurchase.PlanDetails;
import com.marrow.data.api.models.response.notespurchase.Taxes;

/* JADX INFO: loaded from: classes3.dex */
public final class readBytes {
    public static final skipBit AudioAttributesCompatParcelizer(NotesPurchasePlanDetailsResponse notesPurchasePlanDetailsResponse) {
        Taxes taxes;
        Taxes taxes2;
        toMagicModuleMetaRepoModel.write(notesPurchasePlanDetailsResponse, "");
        boolean zIsNotesPurchaseAllowed = notesPurchasePlanDetailsResponse.isNotesPurchaseAllowed();
        String message = notesPurchasePlanDetailsResponse.getMessage();
        boolean hasAlreadyPurchased = notesPurchasePlanDetailsResponse.getHasAlreadyPurchased();
        PlanDetails planDetails = notesPurchasePlanDetailsResponse.getPlanDetails();
        String id = planDetails != null ? planDetails.getId() : null;
        PlanDetails planDetails2 = notesPurchasePlanDetailsResponse.getPlanDetails();
        String planGroupId = planDetails2 != null ? planDetails2.getPlanGroupId() : null;
        PlanDetails planDetails3 = notesPurchasePlanDetailsResponse.getPlanDetails();
        String title = planDetails3 != null ? planDetails3.getTitle() : null;
        PlanDetails planDetails4 = notesPurchasePlanDetailsResponse.getPlanDetails();
        Integer subscriptionPeriod = planDetails4 != null ? planDetails4.getSubscriptionPeriod() : null;
        PlanDetails planDetails5 = notesPurchasePlanDetailsResponse.getPlanDetails();
        Double basePrice = planDetails5 != null ? planDetails5.getBasePrice() : null;
        PlanDetails planDetails6 = notesPurchasePlanDetailsResponse.getPlanDetails();
        Double discount = planDetails6 != null ? planDetails6.getDiscount() : null;
        PlanDetails planDetails7 = notesPurchasePlanDetailsResponse.getPlanDetails();
        Double offerPrice = planDetails7 != null ? planDetails7.getOfferPrice() : null;
        PlanDetails planDetails8 = notesPurchasePlanDetailsResponse.getPlanDetails();
        Double shippingCharge = planDetails8 != null ? planDetails8.getShippingCharge() : null;
        PlanDetails planDetails9 = notesPurchasePlanDetailsResponse.getPlanDetails();
        Double cgst = (planDetails9 == null || (taxes2 = planDetails9.getTaxes()) == null) ? null : taxes2.getCgst();
        PlanDetails planDetails10 = notesPurchasePlanDetailsResponse.getPlanDetails();
        Double sgst = (planDetails10 == null || (taxes = planDetails10.getTaxes()) == null) ? null : taxes.getSgst();
        PlanDetails planDetails11 = notesPurchasePlanDetailsResponse.getPlanDetails();
        return new skipBit(zIsNotesPurchaseAllowed, message, hasAlreadyPurchased, new readCharacterIfInList(id, planGroupId, title, subscriptionPeriod, basePrice, discount, offerPrice, shippingCharge, cgst, sgst, planDetails11 != null ? planDetails11.getPrice() : null));
    }
}
