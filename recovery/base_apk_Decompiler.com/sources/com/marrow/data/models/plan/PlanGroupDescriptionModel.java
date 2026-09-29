package com.marrow.data.models.plan;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.getMagicModuleMeta;
import kotlin.isDvbProfileDeclared;
import kotlin.parseLastSegmentNumberSupplementalProperty;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB%\u0012\u0010\b\u0001\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ.\u0010\f\u001a\u00020\u00002\u0010\b\u0003\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u000bR\"\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00038\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u000b"}, d2 = {"Lcom/marrow/data/models/plan/PlanGroupDescriptionModel;", "", "", "", "p0", "p1", "<init>", "([Ljava/lang/String;Ljava/lang/String;)V", "component1", "()[Ljava/lang/String;", "component2", "()Ljava/lang/String;", "copy", "([Ljava/lang/String;Ljava/lang/String;)Lcom/marrow/data/models/plan/PlanGroupDescriptionModel;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "descriptionList", "[Ljava/lang/String;", "getDescriptionList", "planFeatureTitle", "Ljava/lang/String;", "getPlanFeatureTitle", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PlanGroupDescriptionModel {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String[] descriptionList;
    private final String planFeatureTitle;

    public PlanGroupDescriptionModel(@JsonProperty(PlanGroupDescriptionModelKt.KEY_DESCRIPTION_LIST) String[] strArr, @JsonProperty("key") String str) {
        this.descriptionList = strArr;
        this.planFeatureTitle = str;
    }

    public final String[] getDescriptionList() {
        return this.descriptionList;
    }

    public final String getPlanFeatureTitle() {
        return this.planFeatureTitle;
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0007J$\u0010\n\u001a\u00020\t2\u001a\u0010\u000b\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00020\u0006\u0018\u0001`\u0007H\u0007J\f\u0010\n\u001a\u00020\f*\u00020\u0006H\u0007¨\u0006\r"}, d2 = {"Lcom/marrow/data/models/plan/PlanGroupDescriptionModel$Companion;", "", "<init>", "()V", "fromJSON", "Ljava/util/ArrayList;", "Lcom/marrow/data/models/plan/PlanGroupDescriptionModel;", "Lkotlin/collections/ArrayList;", "array", "Lorg/json/JSONArray;", "toJSON", "planGrpDescModelList", "Lorg/json/JSONObject;", "data_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public final ArrayList<PlanGroupDescriptionModel> fromJSON(JSONArray array) {
            if (array == null) {
                return null;
            }
            int length = array.length();
            ArrayList<PlanGroupDescriptionModel> arrayList = new ArrayList<>(length);
            for (int i = 0; i < length; i++) {
                JSONObject jSONObjectOptJSONObject = array.optJSONObject(i);
                arrayList.add(new PlanGroupDescriptionModel(parseLastSegmentNumberSupplementalProperty.RemoteActionCompatParcelizer(jSONObjectOptJSONObject.getJSONArray(PlanGroupDescriptionModelKt.KEY_DESCRIPTION_LIST)), jSONObjectOptJSONObject.optString("key")));
            }
            return arrayList;
        }

        @getMagicModuleMeta
        public final JSONArray toJSON(ArrayList<PlanGroupDescriptionModel> planGrpDescModelList) {
            JSONArray jSONArray = new JSONArray();
            if (planGrpDescModelList != null) {
                Iterator<T> it = planGrpDescModelList.iterator();
                while (it.hasNext()) {
                    jSONArray.put(PlanGroupDescriptionModel.INSTANCE.toJSON((PlanGroupDescriptionModel) it.next()));
                }
            }
            return jSONArray;
        }

        @getMagicModuleMeta
        public final JSONObject toJSON(PlanGroupDescriptionModel planGroupDescriptionModel) {
            toMagicModuleMetaRepoModel.write(planGroupDescriptionModel, "");
            JSONObject jSONObject = new JSONObject();
            String planFeatureTitle = planGroupDescriptionModel.getPlanFeatureTitle();
            isDvbProfileDeclared.write(jSONObject, "key", planFeatureTitle != null ? planFeatureTitle : "");
            String[] descriptionList = planGroupDescriptionModel.getDescriptionList();
            if (descriptionList == null) {
                descriptionList = new String[0];
            }
            isDvbProfileDeclared.read(jSONObject, PlanGroupDescriptionModelKt.KEY_DESCRIPTION_LIST, descriptionList);
            return jSONObject;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static /* synthetic */ PlanGroupDescriptionModel copy$default(PlanGroupDescriptionModel planGroupDescriptionModel, String[] strArr, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            strArr = planGroupDescriptionModel.descriptionList;
        }
        if ((i & 2) != 0) {
            str = planGroupDescriptionModel.planFeatureTitle;
        }
        return planGroupDescriptionModel.copy(strArr, str);
    }

    @getMagicModuleMeta
    public static final ArrayList<PlanGroupDescriptionModel> fromJSON(JSONArray jSONArray) {
        return INSTANCE.fromJSON(jSONArray);
    }

    @getMagicModuleMeta
    public static final JSONArray toJSON(ArrayList<PlanGroupDescriptionModel> arrayList) {
        return INSTANCE.toJSON(arrayList);
    }

    @getMagicModuleMeta
    public static final JSONObject toJSON(PlanGroupDescriptionModel planGroupDescriptionModel) {
        return INSTANCE.toJSON(planGroupDescriptionModel);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String[] getDescriptionList() {
        return this.descriptionList;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getPlanFeatureTitle() {
        return this.planFeatureTitle;
    }

    public final PlanGroupDescriptionModel copy(@JsonProperty(PlanGroupDescriptionModelKt.KEY_DESCRIPTION_LIST) String[] p0, @JsonProperty("key") String p1) {
        return new PlanGroupDescriptionModel(p0, p1);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PlanGroupDescriptionModel)) {
            return false;
        }
        PlanGroupDescriptionModel planGroupDescriptionModel = (PlanGroupDescriptionModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.descriptionList, planGroupDescriptionModel.descriptionList) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.planFeatureTitle, (Object) planGroupDescriptionModel.planFeatureTitle);
    }

    public final int hashCode() {
        String[] strArr = this.descriptionList;
        int iHashCode = strArr == null ? 0 : Arrays.hashCode(strArr);
        String str = this.planFeatureTitle;
        return (iHashCode * 31) + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        String string = Arrays.toString(this.descriptionList);
        String str = this.planFeatureTitle;
        StringBuilder sb = new StringBuilder("PlanGroupDescriptionModel(descriptionList=");
        sb.append(string);
        sb.append(", planFeatureTitle=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
