package kotlin;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.marrow.data.api.models.response.plan.Coupon;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.plan.Plan;
import com.marrow.data.models.plan.PlanGroup;
import in.juspay.hyper.constants.LogCategory;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.Metadata;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b'\u0018\u0000 (2\u00020\u0001:\u0001(B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0016J\u001a\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016JF\u0010\f\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u0013H&JD\u0010\u0017\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u00102\u0016\u0010\u001b\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u001cj\b\u0012\u0004\u0012\u00020\u0015`\u001dH&Je\u0010\u001e\u001a\u00020\u00132\u000e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0019\u0018\u00010 2\"\u0010!\u001a\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020#0\"j\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020#`$2\"\u0010%\u001a\u001e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020&0\"j\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020&`$H\u0002¢\u0006\u0002\u0010'¨\u0006)"}, d2 = {"Lcom/marrow/receivers/plan/PlanSelectReceiver;", "Lcom/marrow/receivers/BaseReceiver;", "<init>", "()V", "getFilter", "Landroid/content/IntentFilter;", "onReceive", "", LogCategory.CONTEXT, "Landroid/content/Context;", "intent", "Landroid/content/Intent;", "onPlanGroupSelected", "group", "Lcom/marrow/data/models/plan/PlanGroup;", "coupon", "Lcom/marrow/data/api/models/response/plan/Coupon;", "referralCoupon", "isPlanExpanded", "", "planId", "", "isFromRenewFlow", "onPlanSelected", "plan", "Lcom/marrow/data/models/plan/Plan;", "rfCoupon", "addOns", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "isAnyPlanIsApplicable", "plans", "", "discountMap", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "extensionMap", "", "([Lcom/marrow/data/models/plan/Plan;Ljava/util/HashMap;Ljava/util/HashMap;)Z", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class isNewSubtitleDataAvailable extends handlePreambleAddressCode {
    public static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer(null);

    public abstract void IconCompatParcelizer(Context context, Plan plan, Coupon coupon, Coupon coupon2, ArrayList<String> arrayList);

    public abstract void write(Context context, PlanGroup planGroup, Coupon coupon, Coupon coupon2, boolean z, String str, boolean z2);

    @Override // kotlin.handlePreambleAddressCode
    public final IntentFilter AudioAttributesCompatParcelizer() {
        return new IntentFilter("PlanSelectReceiver");
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        String action;
        toMagicModuleMetaRepoModel.write(context, "");
        if (intent == null || (action = intent.getAction()) == null || !"PlanSelectReceiver".contentEquals(action)) {
            return;
        }
        String stringExtra = intent.getStringExtra("coupon");
        String stringExtra2 = intent.getStringExtra("plan_group");
        String stringExtra3 = intent.getStringExtra("plan");
        String stringExtra4 = intent.getStringExtra("referal_coupon");
        boolean booleanExtra = intent.getBooleanExtra("plan_exp", false);
        String stringExtra5 = intent.getStringExtra("plan_id");
        int intExtra = intent.getIntExtra("type", 1);
        ArrayList<String> stringArrayListExtra = intent.getStringArrayListExtra("addons");
        boolean booleanExtra2 = intent.getBooleanExtra("isFromRenewFlow", false);
        if (intExtra == 1) {
            PlanGroup planGroup = (PlanGroup) getSampleMimeType.RemoteActionCompatParcelizer(stringExtra2, new PlanGroup());
            Object objRemoteActionCompatParcelizer = getSampleMimeType.RemoteActionCompatParcelizer(stringExtra, new Coupon());
            Coupon coupon = (Coupon) getSampleMimeType.RemoteActionCompatParcelizer(stringExtra4, new Coupon());
            Coupon coupon2 = (Coupon) objRemoteActionCompatParcelizer;
            if (coupon2 != null) {
                Plan[] plans = planGroup != null ? planGroup.getPlans() : null;
                HashMap<String, Double> discountGroup = coupon2.getDiscountGroup();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(discountGroup, "");
                HashMap<String, Integer> extensionGroup = coupon2.getExtensionGroup();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(extensionGroup, "");
                if (!AudioAttributesCompatParcelizer(plans, discountGroup, extensionGroup) && coupon2.getFallBack() != null) {
                    Plan[] plans2 = planGroup != null ? planGroup.getPlans() : null;
                    HashMap<String, Double> discountGroup2 = coupon2.getFallBack().getDiscountGroup();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(discountGroup2, "");
                    HashMap<String, Integer> extensionGroup2 = coupon2.getFallBack().getExtensionGroup();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(extensionGroup2, "");
                    if (AudioAttributesCompatParcelizer(plans2, discountGroup2, extensionGroup2)) {
                        objRemoteActionCompatParcelizer = coupon2.getFallBack();
                    }
                }
            }
            if (planGroup != null) {
                write(context, planGroup, (Coupon) objRemoteActionCompatParcelizer, coupon, booleanExtra, stringExtra5, booleanExtra2);
                return;
            }
            return;
        }
        Plan plan = (Plan) getSampleMimeType.RemoteActionCompatParcelizer(stringExtra3, new Plan());
        Coupon coupon3 = (Coupon) getSampleMimeType.RemoteActionCompatParcelizer(stringExtra, new Coupon());
        Coupon coupon4 = (coupon3 == null || !coupon3.isValid()) ? null : coupon3;
        Coupon coupon5 = (Coupon) getSampleMimeType.RemoteActionCompatParcelizer(stringExtra4, new Coupon());
        ArrayList<String> arrayList = stringArrayListExtra == null ? new ArrayList<>() : stringArrayListExtra;
        if (plan != null) {
            IconCompatParcelizer(context, plan, coupon4, coupon5, arrayList);
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J<\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001c\u001a\u00020\u001aJ\"\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017J:\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u00172\u0016\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\b0!j\b\u0012\u0004\u0012\u00020\b`\"R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/marrow/receivers/plan/PlanSelectReceiver$Companion;", "", "<init>", "()V", "TYPE_GROUP", "", "TYPE_INDIVIDUAL", "KEY_PLAN_GROUP", "", "KEY_PLAN", "KEY_COUPON", "KEY_REFERRAL_COUPON", "KEY_TYPE", "KEY_PLAN_EXPANDED", "KEY_PLAN_ID", "KEY_ADDONS", "KEY_IS_FROM_RENEW_FLOW", "ACTION", "newIntent", "Landroid/content/Intent;", "group", "Lcom/marrow/data/models/plan/PlanGroup;", "coupon", "Lcom/marrow/data/api/models/response/plan/Coupon;", "referralCoupon", "isPlanExpanded", "", "planId", "isFromRenew", "plan", "Lcom/marrow/data/models/plan/Plan;", "rfCoupon", CourseConfigKeyConstantsKt.KEY_NOTES, "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public static Intent read(PlanGroup planGroup, Coupon coupon, Coupon coupon2, boolean z, String str, boolean z2) {
            toMagicModuleMetaRepoModel.write(planGroup, "");
            Intent intentIconCompatParcelizer = IconCompatParcelizer(planGroup, coupon, coupon2);
            intentIconCompatParcelizer.putExtra("plan_exp", z);
            intentIconCompatParcelizer.putExtra("plan_id", str);
            intentIconCompatParcelizer.putExtra("isFromRenewFlow", z2);
            return intentIconCompatParcelizer;
        }

        private static Intent IconCompatParcelizer(PlanGroup planGroup, Coupon coupon, Coupon coupon2) {
            JSONObject json;
            JSONObject json2;
            toMagicModuleMetaRepoModel.write(planGroup, "");
            Intent intent = new Intent("PlanSelectReceiver");
            intent.putExtra("plan_group", planGroup.toJSON().toString());
            String string = null;
            intent.putExtra("coupon", (coupon == null || (json2 = coupon.toJSON()) == null) ? null : json2.toString());
            if (coupon2 != null && (json = coupon2.toJSON()) != null) {
                string = json.toString();
            }
            intent.putExtra("referal_coupon", string);
            intent.putExtra("type", 1);
            return intent;
        }

        public static Intent read(Plan plan, Coupon coupon, Coupon coupon2, ArrayList<String> arrayList) {
            JSONObject json;
            JSONObject json2;
            toMagicModuleMetaRepoModel.write(plan, "");
            toMagicModuleMetaRepoModel.write(arrayList, "");
            Intent intent = new Intent("PlanSelectReceiver");
            intent.putExtra("plan", plan.toJSON().toString());
            String string = null;
            intent.putExtra("coupon", (coupon == null || (json2 = coupon.toJSON()) == null) ? null : json2.toString());
            if (coupon2 != null && (json = coupon2.toJSON()) != null) {
                string = json.toString();
            }
            intent.putExtra("referal_coupon", string);
            intent.putExtra("addons", arrayList);
            intent.putExtra("type", 2);
            return intent;
        }

        public /* synthetic */ RemoteActionCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static boolean AudioAttributesCompatParcelizer(Plan[] planArr, HashMap<String, Double> map, HashMap<String, Integer> map2) {
        if (planArr == null) {
            return false;
        }
        for (Plan plan : planArr) {
            if (map.containsKey(plan.getId()) || map2.containsKey(plan.getId())) {
                return true;
            }
        }
        return false;
    }
}
