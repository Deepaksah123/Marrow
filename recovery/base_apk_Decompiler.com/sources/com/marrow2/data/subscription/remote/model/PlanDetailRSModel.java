package com.marrow2.data.subscription.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J>\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\rR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0012"}, d2 = {"Lcom/marrow2/data/subscription/remote/model/PlanDetailRSModel;", "", "", "p0", "", "p1", "p2", "", "Lcom/marrow2/data/subscription/remote/model/SubscriptionDetailRSModel;", "p3", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/util/List;)Lcom/marrow2/data/subscription/remote/model/PlanDetailRSModel;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "id", "Ljava/lang/String;", "getId", "subscriptionPeriod", "I", "getSubscriptionPeriod", "title", "getTitle", "subscriptionDetails", "Ljava/util/List;", "getSubscriptionDetails"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanDetailRSModel {
    public static final int $stable = 8;

    @JsonProperty("_id")
    private final String id;

    @JsonProperty("subscription_detail")
    private final List<SubscriptionDetailRSModel> subscriptionDetails;

    @JsonProperty("subscription_period")
    private final int subscriptionPeriod;

    @JsonProperty("title")
    private final String title;

    public PlanDetailRSModel(String str, int i, String str2, List<SubscriptionDetailRSModel> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.id = str;
        this.subscriptionPeriod = i;
        this.title = str2;
        this.subscriptionDetails = list;
    }

    public /* synthetic */ PlanDetailRSModel(String str, int i, String str2, List list, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? -1 : i, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list);
    }

    public final String getId() {
        return this.id;
    }

    public final int getSubscriptionPeriod() {
        return this.subscriptionPeriod;
    }

    public final String getTitle() {
        return this.title;
    }

    public final List<SubscriptionDetailRSModel> getSubscriptionDetails() {
        return this.subscriptionDetails;
    }

    public PlanDetailRSModel() {
        this(null, 0, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PlanDetailRSModel copy$default(PlanDetailRSModel planDetailRSModel, String str, int i, String str2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = planDetailRSModel.id;
        }
        if ((i2 & 2) != 0) {
            i = planDetailRSModel.subscriptionPeriod;
        }
        if ((i2 & 4) != 0) {
            str2 = planDetailRSModel.title;
        }
        if ((i2 & 8) != 0) {
            list = planDetailRSModel.subscriptionDetails;
        }
        return planDetailRSModel.copy(str, i, str2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getSubscriptionPeriod() {
        return this.subscriptionPeriod;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final List<SubscriptionDetailRSModel> component4() {
        return this.subscriptionDetails;
    }

    public final PlanDetailRSModel copy(String p0, int p1, String p2, List<SubscriptionDetailRSModel> p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        return new PlanDetailRSModel(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PlanDetailRSModel)) {
            return false;
        }
        PlanDetailRSModel planDetailRSModel = (PlanDetailRSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) planDetailRSModel.id) && this.subscriptionPeriod == planDetailRSModel.subscriptionPeriod && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) planDetailRSModel.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.subscriptionDetails, planDetailRSModel.subscriptionDetails);
    }

    public final int hashCode() {
        return (((((this.id.hashCode() * 31) + Integer.hashCode(this.subscriptionPeriod)) * 31) + this.title.hashCode()) * 31) + this.subscriptionDetails.hashCode();
    }

    public final String toString() {
        String str = this.id;
        int i = this.subscriptionPeriod;
        String str2 = this.title;
        List<SubscriptionDetailRSModel> list = this.subscriptionDetails;
        StringBuilder sb = new StringBuilder("PlanDetailRSModel(id=");
        sb.append(str);
        sb.append(", subscriptionPeriod=");
        sb.append(i);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", subscriptionDetails=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
