package com.marrow.data.models.plan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.Arrays;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0018\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J@\u0010\u0013\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00042\b\b\u0003\u0010\u0006\u001a\u00020\u00022\u0010\b\u0003\u0010\t\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000fJ\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\rR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\rR\u001a\u0010\u001d\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010\u000fR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\rR\"\u0010\"\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010\u0012"}, d2 = {"Lcom/marrow/data/models/plan/PlanData;", "", "", "p0", "", "p1", "p2", "", "Lcom/marrow/data/models/plan/SubscriptionType;", "p3", "<init>", "(Ljava/lang/String;ILjava/lang/String;[Lcom/marrow/data/models/plan/SubscriptionType;)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "()[Lcom/marrow/data/models/plan/SubscriptionType;", "copy", "(Ljava/lang/String;ILjava/lang/String;[Lcom/marrow/data/models/plan/SubscriptionType;)Lcom/marrow/data/models/plan/PlanData;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "id", "Ljava/lang/String;", "getId", "subscriptionPeriod", "I", "getSubscriptionPeriod", "title", "getTitle", "subscriptionDetails", "[Lcom/marrow/data/models/plan/SubscriptionType;", "getSubscriptionDetails"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanData {
    private final String id;
    private final SubscriptionType[] subscriptionDetails;
    private final int subscriptionPeriod;
    private final String title;

    public PlanData(@JsonProperty("_id") String str, @JsonProperty("subscription_period") int i, @JsonProperty("title") String str2, @JsonProperty("subscription_detail") SubscriptionType[] subscriptionTypeArr) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.id = str;
        this.subscriptionPeriod = i;
        this.title = str2;
        this.subscriptionDetails = subscriptionTypeArr;
    }

    public /* synthetic */ PlanData(String str, int i, String str2, SubscriptionType[] subscriptionTypeArr, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, i, str2, (i2 & 8) != 0 ? null : subscriptionTypeArr);
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

    public final SubscriptionType[] getSubscriptionDetails() {
        return this.subscriptionDetails;
    }

    public static /* synthetic */ PlanData copy$default(PlanData planData, String str, int i, String str2, SubscriptionType[] subscriptionTypeArr, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = planData.id;
        }
        if ((i2 & 2) != 0) {
            i = planData.subscriptionPeriod;
        }
        if ((i2 & 4) != 0) {
            str2 = planData.title;
        }
        if ((i2 & 8) != 0) {
            subscriptionTypeArr = planData.subscriptionDetails;
        }
        return planData.copy(str, i, str2, subscriptionTypeArr);
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

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final SubscriptionType[] getSubscriptionDetails() {
        return this.subscriptionDetails;
    }

    public final PlanData copy(@JsonProperty("_id") String p0, @JsonProperty("subscription_period") int p1, @JsonProperty("title") String p2, @JsonProperty("subscription_detail") SubscriptionType[] p3) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new PlanData(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PlanData)) {
            return false;
        }
        PlanData planData = (PlanData) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) planData.id) && this.subscriptionPeriod == planData.subscriptionPeriod && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) planData.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.subscriptionDetails, planData.subscriptionDetails);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        int iHashCode2 = Integer.hashCode(this.subscriptionPeriod);
        int iHashCode3 = this.title.hashCode();
        SubscriptionType[] subscriptionTypeArr = this.subscriptionDetails;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (subscriptionTypeArr == null ? 0 : Arrays.hashCode(subscriptionTypeArr));
    }

    public final String toString() {
        String str = this.id;
        int i = this.subscriptionPeriod;
        String str2 = this.title;
        String string = Arrays.toString(this.subscriptionDetails);
        StringBuilder sb = new StringBuilder("PlanData(id=");
        sb.append(str);
        sb.append(", subscriptionPeriod=");
        sb.append(i);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", subscriptionDetails=");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
