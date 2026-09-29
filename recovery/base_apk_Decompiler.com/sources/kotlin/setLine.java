package kotlin;

import com.marrow.R;
import com.marrow.data.api.models.Failed;
import com.marrow.data.api.models.MarrowError;
import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.Success;
import com.marrow.data.api.models.response.plan.Coupon;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.plan.Copy;
import com.marrow.data.models.plan.Plan;
import com.marrow.data.models.plan.PlanAddOns;
import com.marrow.data.models.plan.PlanGroup;
import com.marrow.data.models.plan.PlanMetaDataResponse;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.getLineAnchor;
import kotlin.getSampleFormats;
import kotlin.setFastestInterval;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \\2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\\Bm\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\b\b\u0001\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0001\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0017\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ\b\u00104\u001a\u000205H\u0016J$\u00106\u001a\u0002052\u0006\u0010,\u001a\u00020&2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u00107\u001a\u0004\u0018\u00010.H\u0002J\b\u00108\u001a\u000205H\u0002JJ\u00109\u001a\u0002052\u001a\u0010:\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010&0)j\n\u0012\u0006\u0012\u0004\u0018\u00010&`*2\u001a\u0010;\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010&0)j\n\u0012\u0006\u0012\u0004\u0018\u00010&`*2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J\u0012\u0010<\u001a\u0002052\b\u0010=\u001a\u0004\u0018\u00010\u001cH\u0002J\u0010\u0010>\u001a\u0002052\u0006\u0010?\u001a\u000202H\u0002J\u001a\u0010@\u001a\u0002052\u0006\u0010A\u001a\u00020&2\b\u0010B\u001a\u0004\u0018\u00010.H\u0002J\u001a\u0010C\u001a\u00020\u001c2\u0006\u0010A\u001a\u00020&2\b\u0010B\u001a\u0004\u0018\u00010.H\u0002J\b\u0010D\u001a\u00020 H\u0002J\u0018\u0010E\u001a\u0002052\u0006\u0010B\u001a\u00020.2\u0006\u0010F\u001a\u00020 H\u0016J\b\u0010G\u001a\u000205H\u0016J\b\u0010H\u001a\u000205H\u0016J\b\u0010I\u001a\u000205H\u0016J\u0010\u0010J\u001a\u0002052\u0006\u0010K\u001a\u00020LH\u0016J\u0010\u0010M\u001a\u0002052\u0006\u0010N\u001a\u00020\u001cH\u0016J\b\u0010O\u001a\u000205H\u0002J\u0010\u0010P\u001a\u0002052\u0006\u0010A\u001a\u00020&H\u0002J\b\u0010Q\u001a\u000205H\u0002J\b\u0010R\u001a\u000205H\u0002J\b\u0010S\u001a\u000205H\u0016J\b\u0010T\u001a\u000205H\u0016J\u0010\u0010U\u001a\u0002052\u0006\u0010V\u001a\u000202H\u0002J\u001a\u0010W\u001a\u0002052\b\u0010-\u001a\u0004\u0018\u00010.2\u0006\u0010X\u001a\u00020YH\u0002J\b\u0010Z\u001a\u00020[H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010!\u001a\u0004\u0018\u00010\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082.¢\u0006\u0002\n\u0000R\u0018\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010&0%X\u0082.¢\u0006\u0004\n\u0002\u0010'R\"\u0010(\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010&0)j\n\u0012\u0006\u0012\u0004\u0018\u00010&`*X\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010+\u001a\u0016\u0012\u0006\u0012\u0004\u0018\u00010&0)j\n\u0012\u0006\u0012\u0004\u0018\u00010&`*X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020&X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010/\u001a\u0004\u0018\u00010.X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00100\u001a\u00020\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082D¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020 X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006]"}, d2 = {"Lcom/marrow/kt/ui/fragment/plan/plan_detail/PlanDetailPresenterV2;", "Lcom/marrow/kt/base/BasePresenter;", "Lcom/marrow/kt/ui/fragment/plan/plan_detail/PlanDetailContractV2$View;", "Lcom/marrow/kt/ui/fragment/plan/plan_detail/PlanDetailContractV2$Presenter;", "view", "preferenceDataProvider", "Lcom/marrow/data/dataprovider/preference/IPreferenceDataProvider;", "remoteConfigProvider", "Lcom/marrow/data/dataprovider/remoteconfig/IRemoteConfigDataProvider;", "planDataProvider", "Lcom/marrow/data/dataprovider/plan/IPlanDataProvider;", "userDataProvider", "Lcom/marrow/data/dataprovider/user/IUserProfileProvider;", "userProfileProvider", "analytics", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "crashDataProvider", "Lcom/marrow/dataprovider/crash/ICrashDataProvider;", "resourceProvider", "Lcom/marrow/data/dataprovider/common/IResourceProvider;", "computationScheduler", "Lio/reactivex/Scheduler;", "uiScheduler", "arguments", "Lcom/marrow/di/fragment/FragmentArguments;", "<init>", "(Lcom/marrow/kt/ui/fragment/plan/plan_detail/PlanDetailContractV2$View;Lcom/marrow/data/dataprovider/preference/IPreferenceDataProvider;Lcom/marrow/data/dataprovider/remoteconfig/IRemoteConfigDataProvider;Lcom/marrow/data/dataprovider/plan/IPlanDataProvider;Lcom/marrow/data/dataprovider/user/IUserProfileProvider;Lcom/marrow/data/dataprovider/user/IUserProfileProvider;Lcom/marrow/dranalytics/base/AnalyticPublisher;Lcom/marrow/dataprovider/crash/ICrashDataProvider;Lcom/marrow/data/dataprovider/common/IResourceProvider;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;Lcom/marrow/di/fragment/FragmentArguments;)V", "couponString", "", "referralCouponString", "planGroupString", "isExpanded", "", "planId", "planGroup", "Lcom/marrow/data/models/plan/PlanGroup;", "arrayOfPlans", "", "Lcom/marrow/data/models/plan/Plan;", "[Lcom/marrow/data/models/plan/Plan;", "arrayOfDefaultPlans", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "arrayOfFallBackPlans", "selectedPlan", "appliedCoupon", "Lcom/marrow/data/api/models/response/plan/Coupon;", "referalCoupon", "currentSelectedPlanId", "VISIBLE_ITEM_SIZE", "", "isNoteIncluded", "onCreate", "", "populatePaymentSummary", "referralCoupon", "resetNotesAddonCardAndPrice", "renderPlanList", "appliedCouponPlanList", "fallbackCouponPlanList", "checkDefaultPlanHasCoupon", "defaultId", "refreshRenewBanner", "couponType", "renderPlanDropdowns", "plan", "coupon", "getExtension", "isCouponApplicableOnAnyPlanDuration", "onValidCouponApplied", "isReferal", "clickApplyReferal", "onInfoIconClicked", "clickApplyCoupon", "onBuyButtonTapped", "mBroadcaster", "Lcom/marrow/kt/ui/fragment/plan/plan_detail/PlanDetailContractV2$Broadcaster;", "onPlanSelected", "selectedPlanId", "refreshAppliedCoupon", "refreshReferalCoupon", "refreshOrderAmount", "loadMoreDuration", "onAddNotesBtnClicked", "onClickViewMoreDuration", "isCouponApplicableOnSelectedPlan", "planIndex", "sendCouponAppliedEvent", FilterParams.KEY_MODE, "Lcom/marrow2/ui/settings/analytics/SubscriptionAnalytics$CouponApplyMode;", "getSubscriptionAnalyticsPlanData", "Lcom/marrow2/ui/settings/analytics/SubscriptionAnalytics$SubscriptionAnalyticsPlanData;", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setLine extends isRtspStartLine<getLineAnchor.write> implements getLineAnchor.AudioAttributesCompatParcelizer {
    public static final AudioAttributesCompatParcelizer IconCompatParcelizer = new AudioAttributesCompatParcelizer(null);
    private Coupon AudioAttributesCompatParcelizer;
    private ArrayList<Plan> AudioAttributesImplApi21Parcelizer;
    private String AudioAttributesImplApi26Parcelizer;
    private Plan[] AudioAttributesImplBaseParcelizer;
    private ArrayList<Plan> MediaBrowserCompatCustomActionResultReceiver;
    private final String MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private Coupon MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private PlanGroup MediaDescriptionCompat;
    private final isUnused MediaMetadataCompat;
    private final String RatingCompat;
    private final String handleMediaPlayPauseIfPendingOnHandler;
    private final getSampleFormats onAddQueueItem;
    private final getStreamPositionUsForContent onCommand;
    private final String onCustomAction;
    private final getNextChunkIndex onFastForward;
    private final getNextChunkIndex onPause;
    private Plan onPlay;
    private final int read;
    private final isSeekPending write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @setSdkPayload
    public setLine(getLineAnchor.write writeVar, getStreamPositionUsForContent getstreampositionusforcontent, getSampleFormats getsampleformats, isUnused isunused, getNextChunkIndex getnextchunkindex, getNextChunkIndex getnextchunkindex2, isSeekPending isseekpending, parseLongAttr parselongattr, endsWithLivePostrollPlaceHolder endswithlivepostrollplaceholder, getIds getids, getIds getids2, sendTeardownRequest sendteardownrequest) {
        super(parselongattr, endswithlivepostrollplaceholder, getids, getids2, writeVar);
        toMagicModuleMetaRepoModel.write(writeVar, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(getsampleformats, "");
        toMagicModuleMetaRepoModel.write(isunused, "");
        toMagicModuleMetaRepoModel.write(getnextchunkindex, "");
        toMagicModuleMetaRepoModel.write(getnextchunkindex2, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(parselongattr, "");
        toMagicModuleMetaRepoModel.write(endswithlivepostrollplaceholder, "");
        toMagicModuleMetaRepoModel.write(getids, "");
        toMagicModuleMetaRepoModel.write(getids2, "");
        toMagicModuleMetaRepoModel.write(sendteardownrequest, "");
        this.onCommand = getstreampositionusforcontent;
        this.onAddQueueItem = getsampleformats;
        this.MediaMetadataCompat = isunused;
        this.onPause = getnextchunkindex;
        this.onFastForward = getnextchunkindex2;
        this.write = isseekpending;
        this.MediaBrowserCompatItemReceiver = sendteardownrequest.AudioAttributesImplBaseParcelizer("coupon");
        this.handleMediaPlayPauseIfPendingOnHandler = sendteardownrequest.AudioAttributesImplBaseParcelizer("referral_coupon");
        this.RatingCompat = sendteardownrequest.AudioAttributesImplBaseParcelizer("plan_group");
        this.MediaBrowserCompatMediaItem = sendteardownrequest.write("is_plan_expanded");
        this.onCustomAction = sendteardownrequest.AudioAttributesImplBaseParcelizer("plan_id");
        this.AudioAttributesImplApi21Parcelizer = new ArrayList<>();
        this.MediaBrowserCompatCustomActionResultReceiver = new ArrayList<>();
        this.AudioAttributesImplApi26Parcelizer = "";
        this.read = 2;
    }

    @Override // o.getLineAnchor.AudioAttributesCompatParcelizer
    public final void RemoteActionCompatParcelizer() {
        Plan defaultPlan;
        Plan[] planArr;
        Plan plan;
        this.MediaDescriptionCompat = new PlanGroup();
        Coupon coupon = new Coupon();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new Coupon();
        PlanGroup planGroup = this.MediaDescriptionCompat;
        PlanGroup planGroup2 = null;
        if (planGroup == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            planGroup = null;
        }
        planGroup.fromJSON(parseLastSegmentNumberSupplementalProperty.AudioAttributesCompatParcelizer(this.RatingCompat));
        coupon.fromJSON(parseLastSegmentNumberSupplementalProperty.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver));
        Coupon coupon2 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        toMagicModuleMetaRepoModel.write(coupon2);
        coupon2.fromJSON(parseLastSegmentNumberSupplementalProperty.AudioAttributesCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler));
        if (!coupon.belongsToCourseId(this.onCommand.onRemoveQueueItem())) {
            coupon = null;
        }
        PlanGroup planGroup3 = this.MediaDescriptionCompat;
        if (planGroup3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            planGroup3 = null;
        }
        if (planGroup3.size() == 0) {
            ((getLineAnchor.write) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(read(R.string.toast_plan_no_plans_found));
            return;
        }
        PlanGroup planGroup4 = this.MediaDescriptionCompat;
        if (planGroup4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            planGroup4 = null;
        }
        Plan[] plans = planGroup4.getPlans();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(plans, "");
        Plan[] planArr2 = plans;
        if (planArr2.length > 1) {
            getOrderDetails.IconCompatParcelizer((Object[]) planArr2, (Comparator) new write());
        }
        if (setVerticalType.AudioAttributesCompatParcelizer(coupon)) {
            PlanGroup planGroup5 = this.MediaDescriptionCompat;
            if (planGroup5 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                planGroup5 = null;
            }
            defaultPlan = planGroup5.getFirstEligiblePlan(coupon, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        } else {
            PlanGroup planGroup6 = this.MediaDescriptionCompat;
            if (planGroup6 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                planGroup6 = null;
            }
            defaultPlan = planGroup6.getDefaultPlan(coupon);
        }
        toMagicModuleMetaRepoModel.write(defaultPlan);
        this.onPlay = defaultPlan;
        PlanGroup planGroup7 = this.MediaDescriptionCompat;
        if (planGroup7 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            planGroup7 = null;
        }
        Plan plan2 = this.onPlay;
        if (plan2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            plan2 = null;
        }
        Plan planRemoteActionCompatParcelizer = setVerticalType.RemoteActionCompatParcelizer(planGroup7, plan2, this.AudioAttributesCompatParcelizer, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        PlanGroup planGroup8 = this.MediaDescriptionCompat;
        if (planGroup8 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            planGroup8 = null;
        }
        Plan plan3 = this.onPlay;
        if (plan3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            plan3 = null;
        }
        List listWrite = setVerticalType.write(planGroup8, plan3, planRemoteActionCompatParcelizer);
        if (planRemoteActionCompatParcelizer != null) {
            planArr = new Plan[2];
            Plan plan4 = this.onPlay;
            if (plan4 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                plan4 = null;
            }
            planArr[0] = plan4;
            planArr[1] = planRemoteActionCompatParcelizer;
        } else {
            planArr = new Plan[1];
            Plan plan5 = this.onPlay;
            if (plan5 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                plan5 = null;
            }
            planArr[0] = plan5;
        }
        this.AudioAttributesImplBaseParcelizer = planArr;
        Plan[] planArr3 = (Plan[]) getOrderDetails.RemoteActionCompatParcelizer((Object[]) planArr, (Collection) listWrite);
        this.AudioAttributesImplBaseParcelizer = planArr3;
        if (planArr3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            planArr3 = null;
        }
        this.MediaBrowserCompatMediaItem = planArr3.length == this.read;
        getLineAnchor.write writeVar = (getLineAnchor.write) this.RemoteActionCompatParcelizer;
        Plan plan6 = this.onPlay;
        if (plan6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            plan6 = null;
        }
        writeVar.AudioAttributesImplApi21Parcelizer(plan6.getGroupSubttile());
        Plan plan7 = this.onPlay;
        if (plan7 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            plan7 = null;
        }
        String[] descriptionList = plan7.getDescriptionList();
        if (descriptionList != null) {
            for (String str : descriptionList) {
                ((getLineAnchor.write) this.RemoteActionCompatParcelizer).IconCompatParcelizer(str);
            }
        }
        Plan plan8 = this.onPlay;
        if (plan8 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            plan8 = null;
        }
        if (plan8.isPlanContainsAnyVideo()) {
            getNextChunkIndex getnextchunkindex = this.onFastForward;
            getnextchunkindex.IconCompatParcelizer(getnextchunkindex.IconCompatParcelizer().getInfo().getId());
            ((getLineAnchor.write) this.RemoteActionCompatParcelizer).MediaDescriptionCompat();
        }
        getSampleFormats getsampleformats = this.onAddQueueItem;
        getSampleFormats.Companion companion = getSampleFormats.INSTANCE;
        if (getsampleformats.AudioAttributesCompatParcelizer(getSampleFormats.Companion.onPlayFromMediaId())) {
            ((getLineAnchor.write) this.RemoteActionCompatParcelizer).handleMediaPlayPauseIfPendingOnHandler();
            Coupon coupon3 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            toMagicModuleMetaRepoModel.write(coupon3);
            if (!parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) coupon3.getCouponCode())) {
                isUnused isunused = this.MediaMetadataCompat;
                Coupon coupon4 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                toMagicModuleMetaRepoModel.write(coupon4);
                String couponCode = coupon4.getCouponCode();
                Plan plan9 = this.onPlay;
                if (plan9 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    plan9 = null;
                }
                accessgetEmptyStatecp<MarrowResponse<Coupon>> accessgetemptystatecpIconCompatParcelizer = isunused.IconCompatParcelizer(couponCode, plan9.getId());
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpIconCompatParcelizer, "");
                read(accessgetemptystatecpIconCompatParcelizer, new getAnswerMap() { // from class: o.setPositionAnchor
                    @Override // kotlin.getAnswerMap
                    public final Object invoke(Object obj) {
                        return setLine.write(this.AudioAttributesCompatParcelizer, (MarrowResponse) obj);
                    }
                });
            } else {
                ((getLineAnchor.write) this.RemoteActionCompatParcelizer).AudioAttributesImplBaseParcelizer();
            }
        } else {
            ((getLineAnchor.write) this.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver();
        }
        this.AudioAttributesCompatParcelizer = coupon;
        String str2 = this.onCustomAction;
        if (str2 != null && str2.length() != 0) {
            Plan[] planArr4 = this.AudioAttributesImplBaseParcelizer;
            if (planArr4 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                planArr4 = null;
            }
            int length = planArr4.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    plan = null;
                    break;
                }
                plan = planArr4[i];
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) (plan != null ? plan.getId() : null), (Object) this.onCustomAction)) {
                    break;
                } else {
                    i++;
                }
            }
            if (plan == null && (plan = this.onPlay) == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                plan = null;
            }
            this.onPlay = plan;
            if (plan == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                plan = null;
            }
            String id = plan.getId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
            this.AudioAttributesImplApi26Parcelizer = id;
        } else {
            Plan plan10 = this.onPlay;
            if (plan10 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                plan10 = null;
            }
            String id2 = plan10.getId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id2, "");
            this.AudioAttributesImplApi26Parcelizer = id2;
        }
        Plan[] planArr5 = this.AudioAttributesImplBaseParcelizer;
        if (planArr5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            planArr5 = null;
        }
        Pair pairWrite = setVerticalType.write(planArr5, coupon, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, MediaDescriptionCompat());
        ArrayList<Plan> arrayList = (ArrayList) pairWrite.RemoteActionCompatParcelizer();
        ArrayList<Plan> arrayList2 = (ArrayList) pairWrite.read();
        if (this.MediaBrowserCompatMediaItem) {
            ((getLineAnchor.write) this.RemoteActionCompatParcelizer).RatingCompat();
            read(arrayList, arrayList2, coupon);
        } else {
            Plan[] planArr6 = this.AudioAttributesImplBaseParcelizer;
            if (planArr6 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                planArr6 = null;
            }
            if (planArr6.length <= this.read) {
                ((getLineAnchor.write) this.RemoteActionCompatParcelizer).RatingCompat();
            } else {
                ((getLineAnchor.write) this.RemoteActionCompatParcelizer).onAddQueueItem();
            }
            int i2 = 0;
            for (Object obj : arrayList) {
                if (i2 < 0) {
                    IntermediateLoginResponseBody.read();
                }
                Plan plan11 = (Plan) obj;
                if (plan11 != null && i2 < this.read) {
                    if (!this.AudioAttributesImplApi21Parcelizer.contains(plan11)) {
                        this.AudioAttributesImplApi21Parcelizer.add(plan11);
                    }
                    if (setVerticalType.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer)) {
                        Plan plan12 = this.onPlay;
                        if (plan12 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            plan12 = null;
                        }
                        String id3 = plan12.getId();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id3, "");
                        this.AudioAttributesImplApi26Parcelizer = id3;
                    }
                    read(plan11, this.AudioAttributesCompatParcelizer);
                }
                i2++;
            }
        }
        if (setVerticalType.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)) {
            ((getLineAnchor.write) this.RemoteActionCompatParcelizer).MediaMetadataCompat();
            ((getLineAnchor.write) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer();
            getLineAnchor.write writeVar2 = (getLineAnchor.write) this.RemoteActionCompatParcelizer;
            Coupon coupon5 = this.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.write(coupon5);
            writeVar2.write(coupon5.getCouponCode());
            write(this.AudioAttributesCompatParcelizer, setFastestInterval.RemoteActionCompatParcelizer.write);
            Coupon coupon6 = this.AudioAttributesCompatParcelizer;
            RemoteActionCompatParcelizer(coupon6 != null ? coupon6.getCouponType() : 0);
        } else {
            this.AudioAttributesCompatParcelizer = null;
            ((getLineAnchor.write) this.RemoteActionCompatParcelizer).MediaBrowserCompatSearchResultReceiver();
            ((getLineAnchor.write) this.RemoteActionCompatParcelizer).IconCompatParcelizer();
        }
        onCommand();
        Plan plan13 = this.onPlay;
        if (plan13 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            plan13 = null;
        }
        IconCompatParcelizer(plan13.getId());
        Plan plan14 = this.onPlay;
        if (plan14 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            plan14 = null;
        }
        write(plan14, this.AudioAttributesCompatParcelizer, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        PlanGroup planGroup9 = this.MediaDescriptionCompat;
        if (planGroup9 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            planGroup2 = planGroup9;
        }
        String groupId = planGroup2.getGroupId();
        if (groupId != null) {
            LessonDynamicResponseBody<MarrowResponse<PlanMetaDataResponse>> lessonDynamicResponseBodyWrite = this.MediaMetadataCompat.write(groupId);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyWrite, "");
            AudioAttributesCompatParcelizer(lessonDynamicResponseBodyWrite, new getAnswerMap() { // from class: o.setMultiRowAlignment
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj2) {
                    return setLine.read(this.RemoteActionCompatParcelizer, (MarrowResponse) obj2);
                }
            }, new getAnswerMap() { // from class: o.setTextAlignment
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj2) {
                    return setLine.read((Throwable) obj2);
                }
            });
        }
    }

    public static final class write<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read(Integer.valueOf(((Plan) t).getSubscriptionPeriod()), Integer.valueOf(((Plan) t2).getSubscriptionPeriod()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(setLine setline, MarrowResponse marrowResponse) {
        if (marrowResponse instanceof Success) {
            Object data = ((Success) marrowResponse).getData();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(data, "");
            setline.IconCompatParcelizer((Coupon) data, true);
            ((getLineAnchor.write) setline.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(setline.read(R.string.toast_referral_coupon_applied_successfully));
        } else if (marrowResponse instanceof Failed) {
            ((getLineAnchor.write) setline.RemoteActionCompatParcelizer).AudioAttributesImplBaseParcelizer();
            ((getLineAnchor.write) setline.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(((Failed) marrowResponse).getError().getErrorMessage());
        } else {
            if (!(marrowResponse instanceof MarrowError)) {
                throw new RenewEligibleCreator();
            }
            ((getLineAnchor.write) setline.RemoteActionCompatParcelizer).AudioAttributesImplBaseParcelizer();
            setline.RemoteActionCompatParcelizer(((MarrowError) marrowResponse).getThrowable(), "referal_deeplink");
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(setLine setline, MarrowResponse marrowResponse) {
        Copy vpnUsageCopy;
        Copy countryRestrictionCopy;
        if (marrowResponse instanceof Success) {
            PlanMetaDataResponse planMetaDataResponse = (PlanMetaDataResponse) ((Success) marrowResponse).getData();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(planMetaDataResponse.getMediaRestrictions().isCountryRestrictedForVideo(), Boolean.TRUE) && (countryRestrictionCopy = planMetaDataResponse.getMediaRestrictions().getCountryRestrictionCopy()) != null) {
                ((getLineAnchor.write) setline.RemoteActionCompatParcelizer).read(countryRestrictionCopy.getMainCopy(), countryRestrictionCopy.getLink().getText(), countryRestrictionCopy.getLink().getHref());
                isSeekPending isseekpending = setline.write;
                isAtLeastN isatleastn = isAtLeastN.INSTANCE;
                isseekpending.write(isAtLeastN.write(setline.onCommand.onRemoveQueueItem()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(planMetaDataResponse.getMediaRestrictions().isVpnUsageDetected(), Boolean.TRUE) && (vpnUsageCopy = planMetaDataResponse.getMediaRestrictions().getVpnUsageCopy()) != null) {
                ((getLineAnchor.write) setline.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(vpnUsageCopy.getMainCopy(), vpnUsageCopy.getLink().getText(), vpnUsageCopy.getLink().getHref());
                isSeekPending isseekpending2 = setline.write;
                isAtLeastN isatleastn2 = isAtLeastN.INSTANCE;
                isseekpending2.write(isAtLeastN.IconCompatParcelizer(setline.onCommand.onRemoveQueueItem()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(Throwable th) {
        toMagicModuleMetaRepoModel.write(th, "");
        getSegmentEndTimeUs.IconCompatParcelizer(th);
        return getShowPopup.INSTANCE;
    }

    private final void write(Plan plan, Coupon coupon, Coupon coupon2) {
        String str;
        int couponType = coupon != null ? coupon.getCouponType() : 1;
        ((getLineAnchor.write) this.RemoteActionCompatParcelizer).write(plan, setVerticalType.AudioAttributesCompatParcelizer(plan, coupon, coupon2), setVerticalType.RemoteActionCompatParcelizer(plan, coupon, coupon2, this.MediaBrowserCompatSearchResultReceiver));
        ArrayList<PlanAddOns> planAddOns = plan.getPlanAddOns();
        if (planAddOns != null && !planAddOns.isEmpty() && couponType != 5) {
            PlanAddOns planAddOns2 = plan.getPlanAddOns().get(0);
            if (planAddOns2 != null) {
                getLineAnchor.write writeVar = (getLineAnchor.write) this.RemoteActionCompatParcelizer;
                Double noteEdition = planAddOns2.getNoteEdition();
                if (noteEdition == null || (str = read(R.string.label_marrow_notes_edition, setVerticalType.IconCompatParcelizer(noteEdition.doubleValue()))) == null) {
                    str = "";
                }
                writeVar.AudioAttributesCompatParcelizer(str, planAddOns2.getOfferPrice(), planAddOns2.getShippingCharge(), planAddOns2.getTaxInfo().getCgst(), planAddOns2.getTaxInfo().getSgst(), planAddOns2.getMeta().getTaxPercentInfo().getCgstPercentInfo(), planAddOns2.getMeta().getTaxPercentInfo().getSgstPercentInfo());
                ((getLineAnchor.write) this.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer(planAddOns2.getMeta().getTitle());
                isSeekPending isseekpending = this.write;
                setFastestInterval setfastestinterval = setFastestInterval.INSTANCE;
                isseekpending.write(setFastestInterval.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                return;
            }
            return;
        }
        this.MediaBrowserCompatSearchResultReceiver = false;
        onAddQueueItem();
    }

    private final void onAddQueueItem() {
        ((getLineAnchor.write) this.RemoteActionCompatParcelizer).MediaBrowserCompatCustomActionResultReceiver();
        ((getLineAnchor.write) this.RemoteActionCompatParcelizer).write(false);
    }

    private final void read(ArrayList<Plan> arrayList, ArrayList<Plan> arrayList2, Coupon coupon) {
        Coupon fallBack;
        int i = 0;
        for (Object obj : arrayList) {
            if (i < 0) {
                IntermediateLoginResponseBody.read();
            }
            Plan plan = (Plan) obj;
            if ((this.MediaBrowserCompatMediaItem || i <= 1) && plan != null && !this.AudioAttributesImplApi21Parcelizer.contains(plan)) {
                this.AudioAttributesImplApi21Parcelizer.add(plan);
                read(plan, coupon);
            }
            i++;
        }
        if (arrayList2.size() > 0) {
            if (!this.MediaBrowserCompatMediaItem) {
                Plan[] planArr = this.AudioAttributesImplBaseParcelizer;
                if (planArr == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    planArr = null;
                }
                if (planArr.length != this.read) {
                    return;
                }
            }
            ((getLineAnchor.write) this.RemoteActionCompatParcelizer).write(PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(coupon != null ? coupon.getCouponCode() : null), PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer((coupon == null || (fallBack = coupon.getFallBack()) == null) ? null : fallBack.getCouponCode()));
            for (Plan plan2 : arrayList2) {
                if (plan2 != null && !this.MediaBrowserCompatCustomActionResultReceiver.contains(plan2)) {
                    this.MediaBrowserCompatCustomActionResultReceiver.add(plan2);
                    read(plan2, coupon != null ? coupon.getFallBack() : null);
                }
            }
        }
    }

    private final void IconCompatParcelizer(String str) {
        Plan[] planArr = this.AudioAttributesImplBaseParcelizer;
        if (planArr == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            planArr = null;
        }
        int length = planArr.length;
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < length) {
            Plan plan = planArr[i];
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) (plan != null ? plan.getId() : null), (Object) str) && i2 == -1) {
                i2 = i3;
            }
            i++;
            i3++;
        }
        write(i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void RemoteActionCompatParcelizer(int r4) {
        /*
            r3 = this;
            r0 = 2
            if (r4 != r0) goto L3f
            com.marrow.data.models.plan.Plan r4 = r3.onPlay
            r0 = 0
            java.lang.String r1 = ""
            if (r4 != 0) goto Le
            kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer(r1)
            r4 = r0
        Le:
            java.lang.String r4 = r4.getGroupId()
            java.lang.String r2 = "2"
            boolean r4 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r4, r2)
            if (r4 != 0) goto L2f
            com.marrow.data.models.plan.Plan r4 = r3.onPlay
            if (r4 != 0) goto L22
            kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer(r1)
            goto L23
        L22:
            r0 = r4
        L23:
            java.lang.String r4 = r0.getGroupId()
            java.lang.String r0 = "3"
            boolean r4 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r4, r0)
            if (r4 == 0) goto L3f
        L2f:
            o.getStreamPositionUsForContent r4 = r3.onCommand
            boolean r4 = r4.addContentView()
            if (r4 == 0) goto L3f
            V extends o.handleMiscCode r3 = r3.RemoteActionCompatParcelizer
            o.getLineAnchor$write r3 = (o.getLineAnchor.write) r3
            r3.onCustomAction()
            return
        L3f:
            V extends o.handleMiscCode r3 = r3.RemoteActionCompatParcelizer
            o.getLineAnchor$write r3 = (o.getLineAnchor.write) r3
            r3.AudioAttributesImplApi26Parcelizer()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setLine.RemoteActionCompatParcelizer(int):void");
    }

    private final void read(Plan plan, Coupon coupon) {
        String str = parseDolbyChannelConfiguration.read(plan.getSubscriptionPeriod());
        String durationTitle = plan.getDurationTitle();
        String str2 = !parseDolbyChannelConfiguration.AudioAttributesCompatParcelizer((CharSequence) durationTitle) ? durationTitle : str;
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(plan, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        String strRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(plan, coupon);
        String str3 = strRemoteActionCompatParcelizer.length() <= 0 ? null : strRemoteActionCompatParcelizer;
        String str4 = strRemoteActionCompatParcelizer2.length() <= 0 ? null : strRemoteActionCompatParcelizer2;
        double price = plan.getPrice();
        double dAudioAttributesCompatParcelizer = setVerticalType.AudioAttributesCompatParcelizer(plan, coupon, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        getLineAnchor.write writeVar = (getLineAnchor.write) this.RemoteActionCompatParcelizer;
        String id = plan.getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
        writeVar.RemoteActionCompatParcelizer(str2, str4, str3, price, price - dAudioAttributesCompatParcelizer, id, this.AudioAttributesImplApi26Parcelizer);
    }

    private final String RemoteActionCompatParcelizer(Plan plan, Coupon coupon) {
        double price = plan.getPrice() - plan.getDiscountedPrice(coupon);
        int extension = coupon != null ? coupon.getExtension(plan.getId()) : 0;
        if (price != 0.0d && extension != 0) {
            String str = parseDolbyChannelConfiguration.read(price);
            String str2 = parseDolbyChannelConfiguration.read(extension);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
            String str3 = read(R.string.f_referal_coupon_days_entitlement, str2);
            StringBuilder sb = new StringBuilder("+ ");
            sb.append(str);
            sb.append(" off\n");
            sb.append(str3);
            return sb.toString();
        }
        if (price == 0.0d) {
            if (extension == 0) {
                return "";
            }
            String str4 = parseDolbyChannelConfiguration.read(extension);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
            return read(R.string.f_referal_coupon_days_entitlement, str4);
        }
        String str5 = parseDolbyChannelConfiguration.read(price);
        StringBuilder sb2 = new StringBuilder("+ ");
        sb2.append(str5);
        sb2.append(" off");
        return sb2.toString();
    }

    private final boolean MediaDescriptionCompat() {
        Plan[] planArr = this.AudioAttributesImplBaseParcelizer;
        if (planArr == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            planArr = null;
        }
        boolean zIsValidForPlan = false;
        for (Plan plan : planArr) {
            if (plan != null && !zIsValidForPlan) {
                Coupon coupon = this.AudioAttributesCompatParcelizer;
                zIsValidForPlan = coupon != null ? coupon.isValidForPlan(plan.getId()) : false;
            }
        }
        return zIsValidForPlan;
    }

    @Override // o.getLineAnchor.AudioAttributesCompatParcelizer
    public final void IconCompatParcelizer(Coupon coupon, boolean z) {
        toMagicModuleMetaRepoModel.write(coupon, "");
        Plan[] planArr = null;
        if (z) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = coupon;
            Plan plan = this.onPlay;
            if (plan == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                plan = null;
            }
            read(plan);
            isSeekPending isseekpending = this.write;
            setFastestInterval setfastestinterval = setFastestInterval.INSTANCE;
            isseekpending.write(setFastestInterval.RemoteActionCompatParcelizer(RatingCompat()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        } else {
            this.AudioAttributesCompatParcelizer = coupon;
        }
        MediaMetadataCompat();
        this.AudioAttributesImplApi21Parcelizer = new ArrayList<>();
        this.MediaBrowserCompatCustomActionResultReceiver = new ArrayList<>();
        MediaBrowserCompatMediaItem();
        Coupon coupon2 = this.AudioAttributesCompatParcelizer;
        RemoteActionCompatParcelizer(coupon2 != null ? coupon2.getCouponType() : 0);
        onCommand();
        ((getLineAnchor.write) this.RemoteActionCompatParcelizer).read();
        Plan[] planArr2 = this.AudioAttributesImplBaseParcelizer;
        if (planArr2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            planArr = planArr2;
        }
        Pair pairWrite = setVerticalType.write(planArr, this.AudioAttributesCompatParcelizer, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, MediaDescriptionCompat());
        read((ArrayList<Plan>) pairWrite.RemoteActionCompatParcelizer(), (ArrayList<Plan>) pairWrite.read(), this.AudioAttributesCompatParcelizer);
    }

    @Override // o.getLineAnchor.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer() {
        isSeekPending isseekpending = this.write;
        setFastestInterval setfastestinterval = setFastestInterval.INSTANCE;
        isseekpending.write(setFastestInterval.write(RatingCompat()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        getLineAnchor.write writeVar = (getLineAnchor.write) this.RemoteActionCompatParcelizer;
        Coupon coupon = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        Plan plan = null;
        String couponCode = coupon != null ? coupon.getCouponCode() : null;
        String str = couponCode;
        if (str == null || str.length() == 0) {
            couponCode = null;
        }
        Plan plan2 = this.onPlay;
        if (plan2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            plan = plan2;
        }
        String id = plan.getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
        writeVar.RemoteActionCompatParcelizer(couponCode, id, true);
    }

    @Override // o.getLineAnchor.AudioAttributesCompatParcelizer
    public final void read() {
        getLineAnchor.write writeVar = (getLineAnchor.write) this.RemoteActionCompatParcelizer;
        Coupon coupon = this.AudioAttributesCompatParcelizer;
        Plan plan = null;
        String couponCode = coupon != null ? coupon.getCouponCode() : null;
        Plan plan2 = this.onPlay;
        if (plan2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            plan = plan2;
        }
        String id = plan.getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
        writeVar.RemoteActionCompatParcelizer(couponCode, id, false);
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/setLine$AudioAttributesCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x005b  */
    @Override // o.getLineAnchor.AudioAttributesCompatParcelizer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void IconCompatParcelizer(o.getLineAnchor.read r10) {
        /*
            Method dump skipped, instruction units count: 260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setLine.IconCompatParcelizer(o.getLineAnchor$read):void");
    }

    @Override // o.getLineAnchor.AudioAttributesCompatParcelizer
    public final void read(String str) {
        Object obj;
        toMagicModuleMetaRepoModel.write(str, "");
        Iterator<T> it = this.AudioAttributesImplApi21Parcelizer.iterator();
        int size = -1;
        int i = 0;
        int i2 = 0;
        while (true) {
            obj = null;
            Plan plan = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (i2 < 0) {
                IntermediateLoginResponseBody.read();
            }
            Plan plan2 = (Plan) next;
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) (plan2 != null ? plan2.getId() : null), (Object) str)) {
                ((getLineAnchor.write) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(i2);
                this.onPlay = plan2;
                if (plan2 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                } else {
                    plan = plan2;
                }
                String id = plan.getId();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
                this.AudioAttributesImplApi26Parcelizer = id;
                size = i2;
            } else {
                ((getLineAnchor.write) this.RemoteActionCompatParcelizer).write(i2);
            }
            i2++;
        }
        for (Object obj2 : this.MediaBrowserCompatCustomActionResultReceiver) {
            if (i < 0) {
                IntermediateLoginResponseBody.read();
            }
            Plan plan3 = (Plan) obj2;
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) (plan3 != null ? plan3.getId() : null), (Object) str)) {
                size = this.AudioAttributesImplApi21Parcelizer.size() + i + 1;
                ((getLineAnchor.write) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(size);
                this.onPlay = plan3;
                if (plan3 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    plan3 = null;
                }
                String id2 = plan3.getId();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id2, "");
                this.AudioAttributesImplApi26Parcelizer = id2;
            } else {
                ((getLineAnchor.write) this.RemoteActionCompatParcelizer).write(this.AudioAttributesImplApi21Parcelizer.size() + i + 1);
            }
            i++;
        }
        Iterator<T> it2 = this.AudioAttributesImplApi21Parcelizer.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            Plan plan4 = (Plan) next2;
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) (plan4 != null ? plan4.getId() : null), (Object) str)) {
                obj = next2;
                break;
            }
        }
        if (obj != null) {
            write(size);
        }
        onCommand();
        isSeekPending isseekpending = this.write;
        setFastestInterval setfastestinterval = setFastestInterval.INSTANCE;
        isseekpending.write(setFastestInterval.read(RatingCompat()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    private final void MediaBrowserCompatMediaItem() {
        Coupon coupon = this.AudioAttributesCompatParcelizer;
        if (coupon != null && setVerticalType.IconCompatParcelizer(coupon)) {
            ((getLineAnchor.write) this.RemoteActionCompatParcelizer).MediaMetadataCompat();
            ((getLineAnchor.write) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer();
            getLineAnchor.write writeVar = (getLineAnchor.write) this.RemoteActionCompatParcelizer;
            Coupon coupon2 = this.AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.write(coupon2);
            writeVar.write(coupon2.getCouponCode());
            write(this.AudioAttributesCompatParcelizer, setFastestInterval.RemoteActionCompatParcelizer.read);
            return;
        }
        ((getLineAnchor.write) this.RemoteActionCompatParcelizer).IconCompatParcelizer();
    }

    private final void read(Plan plan) {
        if (setVerticalType.IconCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver)) {
            double price = plan.getPrice();
            double discountedPrice = plan.getDiscountedPrice(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            Coupon coupon = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
            toMagicModuleMetaRepoModel.write(coupon);
            int extension = coupon.getExtension(plan.getId());
            if (price - discountedPrice != 0.0d || extension != 0) {
                ((getLineAnchor.write) this.RemoteActionCompatParcelizer).onCommand();
                ((getLineAnchor.write) this.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver();
                getLineAnchor.write writeVar = (getLineAnchor.write) this.RemoteActionCompatParcelizer;
                Coupon coupon2 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
                toMagicModuleMetaRepoModel.write(coupon2);
                writeVar.MediaBrowserCompatItemReceiver(coupon2.getCouponCode());
                return;
            }
            ((getLineAnchor.write) this.RemoteActionCompatParcelizer).AudioAttributesImplBaseParcelizer();
            return;
        }
        ((getLineAnchor.write) this.RemoteActionCompatParcelizer).AudioAttributesImplBaseParcelizer();
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0055  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void onCommand() {
        /*
            Method dump skipped, instruction units count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setLine.onCommand():void");
    }

    private final void MediaMetadataCompat() {
        this.MediaBrowserCompatMediaItem = true;
        ((getLineAnchor.write) this.RemoteActionCompatParcelizer).RatingCompat();
        Plan[] planArr = this.AudioAttributesImplBaseParcelizer;
        if (planArr == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            planArr = null;
        }
        Pair pairWrite = setVerticalType.write(planArr, this.AudioAttributesCompatParcelizer, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, MediaDescriptionCompat());
        read((ArrayList<Plan>) pairWrite.RemoteActionCompatParcelizer(), (ArrayList<Plan>) pairWrite.read(), this.AudioAttributesCompatParcelizer);
    }

    @Override // o.getLineAnchor.AudioAttributesCompatParcelizer
    public final void IconCompatParcelizer() {
        this.MediaBrowserCompatSearchResultReceiver = !this.MediaBrowserCompatSearchResultReceiver;
        isSeekPending isseekpending = this.write;
        setFastestInterval setfastestinterval = setFastestInterval.INSTANCE;
        isseekpending.write(setFastestInterval.RemoteActionCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        onCommand();
        ((getLineAnchor.write) this.RemoteActionCompatParcelizer).write(this.MediaBrowserCompatSearchResultReceiver);
    }

    @Override // o.getLineAnchor.AudioAttributesCompatParcelizer
    public final void write() {
        isSeekPending isseekpending = this.write;
        setFastestInterval setfastestinterval = setFastestInterval.INSTANCE;
        PlanGroup planGroup = this.MediaDescriptionCompat;
        if (planGroup == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            planGroup = null;
        }
        String groupId = planGroup.getGroupId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(groupId, "");
        isseekpending.write(setFastestInterval.RemoteActionCompatParcelizer(groupId), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        MediaMetadataCompat();
    }

    private final void write(int i) {
        Coupon coupon = this.AudioAttributesCompatParcelizer;
        if (coupon == null || coupon == null || coupon.isValidForPlan(this.AudioAttributesImplApi26Parcelizer)) {
            return;
        }
        getLineAnchor.write writeVar = (getLineAnchor.write) this.RemoteActionCompatParcelizer;
        Coupon coupon2 = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(coupon2);
        String couponCode = coupon2.getCouponCode();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(couponCode, "");
        writeVar.RemoteActionCompatParcelizer(i, couponCode);
    }

    private final void write(Coupon coupon, setFastestInterval.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        if (coupon != null) {
            isSeekPending isseekpending = this.write;
            setFastestInterval setfastestinterval = setFastestInterval.INSTANCE;
            isseekpending.write(setFastestInterval.AudioAttributesCompatParcelizer(remoteActionCompatParcelizer, coupon.getCouponType()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        }
    }

    private final setFastestInterval.read RatingCompat() {
        Plan plan = this.onPlay;
        Plan plan2 = null;
        if (plan == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            plan = null;
        }
        String groupId = plan.getGroupId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(groupId, "");
        String str = this.AudioAttributesImplApi26Parcelizer;
        Plan plan3 = this.onPlay;
        if (plan3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            plan2 = plan3;
        }
        String planDuration = plan2.getPlanDuration();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(planDuration, "");
        return new setFastestInterval.read(groupId, str, planDuration);
    }
}
