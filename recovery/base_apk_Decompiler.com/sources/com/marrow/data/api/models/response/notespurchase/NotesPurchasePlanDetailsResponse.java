package com.marrow.data.api.models.response.notespurchase;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\b\b\u0003\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0002\u0012\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J<\u0010\u0012\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000eR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b \u0010\fR\u001c\u0010!\u001a\u0004\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010\u0011"}, d2 = {"Lcom/marrow/data/api/models/response/notespurchase/NotesPurchasePlanDetailsResponse;", "", "", "p0", "", "p1", "p2", "Lcom/marrow/data/api/models/response/notespurchase/PlanDetails;", "p3", "<init>", "(ZLjava/lang/String;ZLcom/marrow/data/api/models/response/notespurchase/PlanDetails;)V", "component1", "()Z", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/marrow/data/api/models/response/notespurchase/PlanDetails;", "copy", "(ZLjava/lang/String;ZLcom/marrow/data/api/models/response/notespurchase/PlanDetails;)Lcom/marrow/data/api/models/response/notespurchase/NotesPurchasePlanDetailsResponse;", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "isNotesPurchaseAllowed", "Z", "message", "Ljava/lang/String;", "getMessage", "hasAlreadyPurchased", "getHasAlreadyPurchased", "planDetails", "Lcom/marrow/data/api/models/response/notespurchase/PlanDetails;", "getPlanDetails"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NotesPurchasePlanDetailsResponse {
    private final boolean hasAlreadyPurchased;
    private final boolean isNotesPurchaseAllowed;
    private final String message;
    private final PlanDetails planDetails;

    public NotesPurchasePlanDetailsResponse(@JsonProperty("is_notes_purchase_allowed") boolean z, @JsonProperty("message") String str, @JsonProperty("has_already_purchased") boolean z2, @JsonProperty("plan_details") PlanDetails planDetails) {
        this.isNotesPurchaseAllowed = z;
        this.message = str;
        this.hasAlreadyPurchased = z2;
        this.planDetails = planDetails;
    }

    public /* synthetic */ NotesPurchasePlanDetailsResponse(boolean z, String str, boolean z2, PlanDetails planDetails, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : planDetails);
    }

    public final boolean isNotesPurchaseAllowed() {
        return this.isNotesPurchaseAllowed;
    }

    public final String getMessage() {
        return this.message;
    }

    public final boolean getHasAlreadyPurchased() {
        return this.hasAlreadyPurchased;
    }

    public final PlanDetails getPlanDetails() {
        return this.planDetails;
    }

    public NotesPurchasePlanDetailsResponse() {
        this(false, null, false, null, 15, null);
    }

    public static /* synthetic */ NotesPurchasePlanDetailsResponse copy$default(NotesPurchasePlanDetailsResponse notesPurchasePlanDetailsResponse, boolean z, String str, boolean z2, PlanDetails planDetails, int i, Object obj) {
        if ((i & 1) != 0) {
            z = notesPurchasePlanDetailsResponse.isNotesPurchaseAllowed;
        }
        if ((i & 2) != 0) {
            str = notesPurchasePlanDetailsResponse.message;
        }
        if ((i & 4) != 0) {
            z2 = notesPurchasePlanDetailsResponse.hasAlreadyPurchased;
        }
        if ((i & 8) != 0) {
            planDetails = notesPurchasePlanDetailsResponse.planDetails;
        }
        return notesPurchasePlanDetailsResponse.copy(z, str, z2, planDetails);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsNotesPurchaseAllowed() {
        return this.isNotesPurchaseAllowed;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final boolean getHasAlreadyPurchased() {
        return this.hasAlreadyPurchased;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final PlanDetails getPlanDetails() {
        return this.planDetails;
    }

    public final NotesPurchasePlanDetailsResponse copy(@JsonProperty("is_notes_purchase_allowed") boolean p0, @JsonProperty("message") String p1, @JsonProperty("has_already_purchased") boolean p2, @JsonProperty("plan_details") PlanDetails p3) {
        return new NotesPurchasePlanDetailsResponse(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof NotesPurchasePlanDetailsResponse)) {
            return false;
        }
        NotesPurchasePlanDetailsResponse notesPurchasePlanDetailsResponse = (NotesPurchasePlanDetailsResponse) p0;
        return this.isNotesPurchaseAllowed == notesPurchasePlanDetailsResponse.isNotesPurchaseAllowed && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.message, (Object) notesPurchasePlanDetailsResponse.message) && this.hasAlreadyPurchased == notesPurchasePlanDetailsResponse.hasAlreadyPurchased && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.planDetails, notesPurchasePlanDetailsResponse.planDetails);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.isNotesPurchaseAllowed);
        String str = this.message;
        int iHashCode2 = str == null ? 0 : str.hashCode();
        int iHashCode3 = Boolean.hashCode(this.hasAlreadyPurchased);
        PlanDetails planDetails = this.planDetails;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (planDetails != null ? planDetails.hashCode() : 0);
    }

    public final String toString() {
        boolean z = this.isNotesPurchaseAllowed;
        String str = this.message;
        boolean z2 = this.hasAlreadyPurchased;
        PlanDetails planDetails = this.planDetails;
        StringBuilder sb = new StringBuilder("NotesPurchasePlanDetailsResponse(isNotesPurchaseAllowed=");
        sb.append(z);
        sb.append(", message=");
        sb.append(str);
        sb.append(", hasAlreadyPurchased=");
        sb.append(z2);
        sb.append(", planDetails=");
        sb.append(planDetails);
        sb.append(")");
        return sb.toString();
    }
}
