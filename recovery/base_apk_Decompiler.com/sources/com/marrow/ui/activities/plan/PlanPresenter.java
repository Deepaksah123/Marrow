package com.marrow.ui.activities.plan;

import com.marrow.data.api.models.Failed;
import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.Success;
import com.marrow.data.api.models.request.payment.CreateOrderRequest;
import com.marrow.data.api.models.response.payment.CreateOrderResponse;
import com.marrow.data.api.models.response.payment.PayloadKt;
import com.marrow.data.api.models.response.payment.SdkPayload;
import com.marrow.data.api.models.response.plan.Coupon;
import com.marrow.data.models.common.ApplicationData;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.plan.Plan;
import com.marrow.data.models.plan.PlanAddOns;
import com.marrow.data.models.user.College;
import com.marrow.data.models.user.LoggedUser;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import com.marrow.data.utils.product.exceptions.ResponseErrorException;
import com.marrow.ui.activities.plan.PlanContract;
import com.marrow.ui.activities.plan.PlanPresenter;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LessonDynamicResponseBody;
import kotlin.Metadata;
import kotlin.endsWithLivePostrollPlaceHolder;
import kotlin.getAnswerMap;
import kotlin.getChannel;
import kotlin.getIds;
import kotlin.getLatestBitrateEstimate;
import kotlin.getNextChunkIndex;
import kotlin.getShowPopup;
import kotlin.getStreamPositionUsForContent;
import kotlin.isRtspStartLine;
import kotlin.isSeekPending;
import kotlin.isUnused;
import kotlin.maybeNotifyPrimaryTrackFormatChanged;
import kotlin.parseLongAttr;
import kotlin.setFastestInterval;
import kotlin.setSdkPayload;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.toMagicModuleStatusUcModel;
import kotlin.updateLoadingFinished;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003Bm\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\b\u0001\u0010\t\u001a\u00020\n\u0012\b\b\u0001\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019¢\u0006\u0004\b\u001a\u0010\u001bJ<\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#2\b\u0010$\u001a\u0004\u0018\u00010#2\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020'0&j\b\u0012\u0004\u0012\u00020'`(H\u0016J\u0018\u0010)\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010*\u001a\u00020+H\u0016J8\u0010,\u001a\u00020\u001f2\u0006\u0010-\u001a\u00020\u001d2\u0006\u0010.\u001a\u00020'2\u0006\u0010/\u001a\u00020'2\u0006\u00100\u001a\u00020'2\u0006\u00101\u001a\u00020'2\u0006\u00102\u001a\u00020+H\u0016J0\u00103\u001a\u00020\u001f2\u0006\u00104\u001a\u00020'2\u0006\u0010/\u001a\u00020'2\u0006\u00100\u001a\u00020'2\u0006\u00101\u001a\u00020'2\u0006\u00105\u001a\u00020+H\u0016J\b\u00106\u001a\u00020\u001fH\u0016J\u0018\u00107\u001a\u00020\u001f2\u0006\u00108\u001a\u00020'2\u0006\u00109\u001a\u00020\u001dH\u0016J \u0010:\u001a\u00020;2\u0006\u0010/\u001a\u00020'2\u0006\u00100\u001a\u00020'2\u0006\u0010<\u001a\u00020'H\u0002R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lcom/marrow/ui/activities/plan/PlanPresenter;", "Lcom/marrow/kt/base/BasePresenter;", "Lcom/marrow/ui/activities/plan/PlanContract$View;", "Lcom/marrow/ui/activities/plan/PlanContract$Presenter;", "view", "crashDataProvider", "Lcom/marrow/dataprovider/crash/ICrashDataProvider;", "resourceProvider", "Lcom/marrow/data/dataprovider/common/IResourceProvider;", "computationScheduler", "Lio/reactivex/Scheduler;", "uiScheduler", "prefDataProvider", "Lcom/marrow/data/dataprovider/preference/IPreferenceDataProvider;", "connectivity", "Lcom/marrow/mvp/Connectivity;", "planDataProvider", "Lcom/marrow/data/dataprovider/plan/IPlanDataProvider;", "userProfileProvider", "Lcom/marrow/data/dataprovider/user/IUserProfileProvider;", "subscriptionSyncRemoteDataSource", "Lcom/marrow/data/dataprovider/sync/subscription/SubscriptionSyncRemoteDataSource;", "appData", "Lcom/marrow/data/models/common/ApplicationData;", "analytics", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "<init>", "(Lcom/marrow/ui/activities/plan/PlanContract$View;Lcom/marrow/dataprovider/crash/ICrashDataProvider;Lcom/marrow/data/dataprovider/common/IResourceProvider;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;Lcom/marrow/data/dataprovider/preference/IPreferenceDataProvider;Lcom/marrow/mvp/Connectivity;Lcom/marrow/data/dataprovider/plan/IPlanDataProvider;Lcom/marrow/data/dataprovider/user/IUserProfileProvider;Lcom/marrow/data/dataprovider/sync/subscription/SubscriptionSyncRemoteDataSource;Lcom/marrow/data/models/common/ApplicationData;Lcom/marrow/dranalytics/base/AnalyticPublisher;)V", "subscriptionSyncCount", "", "startPayment", "", "plan", "Lcom/marrow/data/models/plan/Plan;", "coupon", "Lcom/marrow/data/api/models/response/plan/Coupon;", "rfCoupon", "addOns", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "sendPlanSelectedEvent", "isFromRenewFlow", "", "onPaymentError", "code", "response", "groupId", "planId", "planDuration", "isRenewCoupon", "onPaymentSuccess", "paymentId", "renew", "onStop", "validatePaymentWithServer", "orderId", "gateway", "getSubscriptionAnalyticsPlanData", "Lcom/marrow2/ui/settings/analytics/SubscriptionAnalytics$SubscriptionAnalyticsPlanData;", "duration", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanPresenter extends isRtspStartLine<PlanContract.View> implements PlanContract.Presenter {
    private final getChannel AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private final getNextChunkIndex AudioAttributesImplBaseParcelizer;
    private final isSeekPending IconCompatParcelizer;
    private final getStreamPositionUsForContent MediaBrowserCompatCustomActionResultReceiver;
    private final maybeNotifyPrimaryTrackFormatChanged MediaBrowserCompatItemReceiver;
    private final isUnused read;
    private final ApplicationData write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @setSdkPayload
    public PlanPresenter(PlanContract.View view, parseLongAttr parselongattr, endsWithLivePostrollPlaceHolder endswithlivepostrollplaceholder, getIds getids, getIds getids2, getStreamPositionUsForContent getstreampositionusforcontent, getChannel getchannel, isUnused isunused, getNextChunkIndex getnextchunkindex, maybeNotifyPrimaryTrackFormatChanged maybenotifyprimarytrackformatchanged, ApplicationData applicationData, isSeekPending isseekpending) {
        super(parselongattr, endswithlivepostrollplaceholder, getids, getids2, view);
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(parselongattr, "");
        toMagicModuleMetaRepoModel.write(endswithlivepostrollplaceholder, "");
        toMagicModuleMetaRepoModel.write(getids, "");
        toMagicModuleMetaRepoModel.write(getids2, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(getchannel, "");
        toMagicModuleMetaRepoModel.write(isunused, "");
        toMagicModuleMetaRepoModel.write(getnextchunkindex, "");
        toMagicModuleMetaRepoModel.write(maybenotifyprimarytrackformatchanged, "");
        toMagicModuleMetaRepoModel.write(applicationData, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        this.MediaBrowserCompatCustomActionResultReceiver = getstreampositionusforcontent;
        this.AudioAttributesCompatParcelizer = getchannel;
        this.read = isunused;
        this.AudioAttributesImplBaseParcelizer = getnextchunkindex;
        this.MediaBrowserCompatItemReceiver = maybenotifyprimarytrackformatchanged;
        this.write = applicationData;
        this.IconCompatParcelizer = isseekpending;
    }

    @Override // com.marrow.ui.activities.plan.PlanContract.Presenter
    public final void write(final Plan plan, final Coupon coupon, final Coupon coupon2, ArrayList<String> arrayList) {
        ArrayList<PlanAddOns> planAddOns;
        toMagicModuleMetaRepoModel.write(plan, "");
        toMagicModuleMetaRepoModel.write(arrayList, "");
        if (!this.AudioAttributesCompatParcelizer.aC_()) {
            ((PlanContract.View) this.RemoteActionCompatParcelizer).MediaBrowserCompatMediaItem();
            return;
        }
        double discountedPrice = plan.getDiscountedPrice(coupon) + ((arrayList.isEmpty() || (planAddOns = plan.getPlanAddOns()) == null || planAddOns.isEmpty()) ? 0.0d : plan.getPlanAddOns().get(0).getPrice());
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        final String str = String.format(Locale.getDefault(), "%.0f", Arrays.copyOf(new Object[]{Double.valueOf(discountedPrice)}, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        final LoggedUser loggedUserIconCompatParcelizer = this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer();
        ((PlanContract.View) this.RemoteActionCompatParcelizer).onPlayFromSearch();
        isUnused isunused = this.read;
        String id = loggedUserIconCompatParcelizer.getInfo().getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
        String couponCode = coupon != null ? coupon.getCouponCode() : null;
        String couponCode2 = coupon2 != null ? coupon2.getCouponCode() : null;
        String id2 = plan.getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id2, "");
        LessonDynamicResponseBody<MarrowResponse<CreateOrderResponse>> lessonDynamicResponseBodyIconCompatParcelizer = isunused.IconCompatParcelizer(new CreateOrderRequest(id, couponCode, couponCode2, id2, discountedPrice, arrayList, null, 64, null));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyIconCompatParcelizer, "");
        AudioAttributesCompatParcelizer(lessonDynamicResponseBodyIconCompatParcelizer, new getAnswerMap() { // from class: o.applyStyleToText
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return PlanPresenter.read(this.RemoteActionCompatParcelizer, loggedUserIconCompatParcelizer, plan, str, coupon, coupon2, (MarrowResponse) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(PlanPresenter planPresenter, LoggedUser loggedUser, Plan plan, String str, Coupon coupon, Coupon coupon2, MarrowResponse marrowResponse) throws JSONException {
        if (marrowResponse instanceof Success) {
            JSONObject jSONObject = new JSONObject();
            Success success = (Success) marrowResponse;
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((CreateOrderResponse) success.getData()).getGateway(), (Object) "juspay")) {
                SdkPayload sdkPayload = ((CreateOrderResponse) success.getData()).getSdkPayload();
                if (sdkPayload != null) {
                    ((PlanContract.View) planPresenter.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(sdkPayload);
                }
            } else {
                ((PlanContract.View) planPresenter.RemoteActionCompatParcelizer).onPlay();
                int amount = ((CreateOrderResponse) success.getData()).getAmount();
                jSONObject.put(PaymentConstants.ORDER_ID, ((CreateOrderResponse) success.getData()).getOrderId());
                jSONObject.put(PayloadKt.KEY_JP_CURRENCY, ((CreateOrderResponse) success.getData()).getCurrency());
                jSONObject.put("amount", amount * 100);
                jSONObject.put("name", "Marrow App Subscription");
                String title = plan.getTitle();
                String id = plan.getId();
                StringBuilder sb = new StringBuilder();
                sb.append(title);
                sb.append(", ");
                sb.append(id);
                jSONObject.put("description", sb.toString());
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("email", true);
                jSONObject2.put(NotesDispatchAddressRequestKt.KEY_CONTACT, true);
                jSONObject.put("readonly", jSONObject2);
                JSONObject jSONObject3 = new JSONObject();
                jSONObject3.put("email", loggedUser.getEmail());
                jSONObject3.put(NotesDispatchAddressRequestKt.KEY_CONTACT, loggedUser.getInfo().getPhoneNumber().asSingleEntity());
                jSONObject.put("prefill", jSONObject3);
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.put("email", loggedUser.getEmail());
                jSONObject4.put(NotesDispatchAddressRequestKt.KEY_CONTACT, loggedUser.getInfo().getPhoneNumber().asSingleEntity());
                jSONObject4.put("plan_id", plan.getId());
                jSONObject4.put("plan_title", plan.getTitle());
                jSONObject4.put("plan_duration", plan.getSubscriptionPeriod());
                jSONObject4.put("amount", str);
                jSONObject4.put("coupon_code", Coupon.getCouponCode(coupon));
                jSONObject4.put("rf_coupon", Coupon.getCouponCode(coupon2));
                jSONObject4.put("user_id", loggedUser.getInfo().getId());
                jSONObject4.put("platform", LogSubCategory.LifeCycle.ANDROID);
                jSONObject4.put(FilterParams.KEY_COURSE_ID, planPresenter.MediaBrowserCompatCustomActionResultReceiver.onRemoveQueueItem());
                jSONObject.put(CourseConfigKeyConstantsKt.KEY_NOTES, jSONObject4);
                ((PlanContract.View) planPresenter.RemoteActionCompatParcelizer).onPaymentStarted(jSONObject);
            }
        } else if (marrowResponse instanceof Failed) {
            ((PlanContract.View) planPresenter.RemoteActionCompatParcelizer).onPlay();
            Failed failed = (Failed) marrowResponse;
            if (failed.getError().getErrorCode() == 1900) {
                loggedUser.getInfo().setCollege(new College());
                planPresenter.AudioAttributesImplBaseParcelizer.read(loggedUser);
                ((PlanContract.View) planPresenter.RemoteActionCompatParcelizer).onPrepare();
            } else {
                planPresenter.RemoteActionCompatParcelizer(new ResponseErrorException(failed.getError()), "create_order_failure");
            }
        } else {
            ((PlanContract.View) planPresenter.RemoteActionCompatParcelizer).onPlay();
        }
        return getShowPopup.INSTANCE;
    }

    @Override // com.marrow.ui.activities.plan.PlanContract.Presenter
    public final void read(Plan plan, boolean z) {
        toMagicModuleMetaRepoModel.write(plan, "");
        String string = plan.toString();
        this.MediaBrowserCompatCustomActionResultReceiver.onRemoveQueueItem();
        getLatestBitrateEstimate.RatingCompat.write(string);
        isSeekPending isseekpending = this.IconCompatParcelizer;
        setFastestInterval setfastestinterval = setFastestInterval.INSTANCE;
        String groupId = plan.getGroupId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(groupId, "");
        isseekpending.write(setFastestInterval.write(groupId, z), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    @Override // com.marrow.ui.activities.plan.PlanContract.Presenter
    public final void onPaymentError(int code, String response, String groupId, String planId, String planDuration, boolean isRenewCoupon) {
        toMagicModuleMetaRepoModel.write(response, "");
        toMagicModuleMetaRepoModel.write(groupId, "");
        toMagicModuleMetaRepoModel.write(planId, "");
        toMagicModuleMetaRepoModel.write(planDuration, "");
        if (code == 0) {
            this.MediaBrowserCompatCustomActionResultReceiver.onRemoveQueueItem();
            getLatestBitrateEstimate.AudioAttributesImplApi21Parcelizer.AudioAttributesCompatParcelizer(response, groupId, isRenewCoupon);
        } else {
            this.MediaBrowserCompatCustomActionResultReceiver.onRemoveQueueItem();
            getLatestBitrateEstimate.AudioAttributesImplApi21Parcelizer.RemoteActionCompatParcelizer(response, groupId, isRenewCoupon);
        }
        isSeekPending isseekpending = this.IconCompatParcelizer;
        setFastestInterval setfastestinterval = setFastestInterval.INSTANCE;
        isseekpending.write(setFastestInterval.AudioAttributesCompatParcelizer(IconCompatParcelizer(groupId, planId, planDuration)), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    @Override // com.marrow.ui.activities.plan.PlanContract.Presenter
    public final void onPaymentSuccess(String paymentId, String groupId, String planId, String planDuration, boolean renew) {
        toMagicModuleMetaRepoModel.write(paymentId, "");
        toMagicModuleMetaRepoModel.write(groupId, "");
        toMagicModuleMetaRepoModel.write(planId, "");
        toMagicModuleMetaRepoModel.write(planDuration, "");
        this.MediaBrowserCompatCustomActionResultReceiver.onRemoveQueueItem();
        getLatestBitrateEstimate.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(paymentId, groupId, renew);
        isSeekPending isseekpending = this.IconCompatParcelizer;
        setFastestInterval setfastestinterval = setFastestInterval.INSTANCE;
        isseekpending.write(setFastestInterval.IconCompatParcelizer(IconCompatParcelizer(groupId, planId, planDuration)), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    @Override // kotlin.isRtspStartLine, kotlin.getExtendedEsFrChar
    public final void MediaBrowserCompatSearchResultReceiver() {
        String currentYear;
        super.MediaBrowserCompatSearchResultReceiver();
        LoggedUser loggedUser = this.write.getLoggedUser();
        if (loggedUser == null || (currentYear = loggedUser.getInfo().getCollege().getCurrentYear()) == null) {
            return;
        }
        ((PlanContract.View) this.RemoteActionCompatParcelizer).write(currentYear);
    }

    @Override // com.marrow.ui.activities.plan.PlanContract.Presenter
    public final void IconCompatParcelizer(final String str, final int i) {
        toMagicModuleMetaRepoModel.write(str, "");
        int i2 = this.AudioAttributesImplApi21Parcelizer;
        if (i2 > 4) {
            ((PlanContract.View) this.RemoteActionCompatParcelizer).onPlay();
            ((PlanContract.View) this.RemoteActionCompatParcelizer).onMediaButtonEvent();
            return;
        }
        this.AudioAttributesImplApi21Parcelizer = i2 + 1;
        ((PlanContract.View) this.RemoteActionCompatParcelizer).onPlayFromSearch();
        if (i == 2) {
            read(this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(str), new getAnswerMap() { // from class: o.applyRubySpans
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return PlanPresenter.read(this.read, str, i, (MarrowResponse) obj);
                }
            });
        } else {
            read(this.MediaBrowserCompatItemReceiver.IconCompatParcelizer(str), new getAnswerMap() { // from class: o.parseCueSettingsList
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return PlanPresenter.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, str, i, (MarrowResponse) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.getShowPopup read(com.marrow.ui.activities.plan.PlanPresenter r2, java.lang.String r3, int r4, com.marrow.data.api.models.MarrowResponse r5) {
        /*
            java.lang.String r0 = ""
            kotlin.toMagicModuleMetaRepoModel.write(r5, r0)
            V extends o.handleMiscCode r0 = r2.RemoteActionCompatParcelizer
            com.marrow.ui.activities.plan.PlanContract$View r0 = (com.marrow.ui.activities.plan.PlanContract.View) r0
            r0.onPlay()
            boolean r0 = r5 instanceof com.marrow.data.api.models.Failed
            if (r0 != 0) goto L54
            boolean r0 = r5 instanceof com.marrow.data.api.models.MarrowError
            if (r0 != 0) goto L54
            boolean r0 = r5 instanceof com.marrow.data.api.models.Success
            if (r0 == 0) goto L4e
            com.marrow.data.api.models.Success r5 = (com.marrow.data.api.models.Success) r5
            java.lang.Object r5 = r5.getData()
            com.marrow.data.api.models.response.payment.PaymentStatusResponse r5 = (com.marrow.data.api.models.response.payment.PaymentStatusResponse) r5
            java.lang.String r0 = r5.getStatus()
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            if (r0 == 0) goto L54
            int r0 = r0.length()
            if (r0 == 0) goto L54
            java.lang.String r0 = r5.getStatus()
            java.lang.String r1 = "payment_success"
            boolean r0 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r0, r1)
            if (r0 == 0) goto L54
            V extends o.handleMiscCode r2 = r2.RemoteActionCompatParcelizer
            com.marrow.ui.activities.plan.PlanContract$View r2 = (com.marrow.ui.activities.plan.PlanContract.View) r2
            com.marrow.data.models.plan.Subscription[] r3 = r5.getSubscriptionList()
            java.lang.String r5 = r5.getPaymentRefId()
            java.lang.String r5 = kotlin.PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(r5)
            r2.write(r3, r5, r4)
            goto L5d
        L4e:
            o.RenewEligibleCreator r2 = new o.RenewEligibleCreator
            r2.<init>()
            throw r2
        L54:
            V extends o.handleMiscCode r5 = r2.RemoteActionCompatParcelizer
            com.marrow.ui.activities.plan.PlanContract$View r5 = (com.marrow.ui.activities.plan.PlanContract.View) r5
            int r2 = r2.AudioAttributesImplApi21Parcelizer
            r5.AudioAttributesCompatParcelizer(r3, r4, r2)
        L5d:
            o.getShowPopup r2 = kotlin.getShowPopup.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.plan.PlanPresenter.read(com.marrow.ui.activities.plan.PlanPresenter, java.lang.String, int, com.marrow.data.api.models.MarrowResponse):o.getShowPopup");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.getShowPopup AudioAttributesCompatParcelizer(com.marrow.ui.activities.plan.PlanPresenter r1, java.lang.String r2, int r3, com.marrow.data.api.models.MarrowResponse r4) {
        /*
            java.lang.String r0 = ""
            kotlin.toMagicModuleMetaRepoModel.write(r4, r0)
            V extends o.handleMiscCode r0 = r1.RemoteActionCompatParcelizer
            com.marrow.ui.activities.plan.PlanContract$View r0 = (com.marrow.ui.activities.plan.PlanContract.View) r0
            r0.onPlay()
            boolean r0 = r4 instanceof com.marrow.data.api.models.Failed
            if (r0 != 0) goto L38
            boolean r0 = r4 instanceof com.marrow.data.api.models.MarrowError
            if (r0 != 0) goto L38
            boolean r0 = r4 instanceof com.marrow.data.api.models.Success
            if (r0 == 0) goto L32
            com.marrow.data.api.models.Success r4 = (com.marrow.data.api.models.Success) r4
            java.lang.Object r0 = r4.getData()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r0 = r0.length
            if (r0 != 0) goto L24
            goto L38
        L24:
            V extends o.handleMiscCode r1 = r1.RemoteActionCompatParcelizer
            com.marrow.ui.activities.plan.PlanContract$View r1 = (com.marrow.ui.activities.plan.PlanContract.View) r1
            java.lang.Object r4 = r4.getData()
            com.marrow.data.models.plan.Subscription[] r4 = (com.marrow.data.models.plan.Subscription[]) r4
            r1.write(r4, r2, r3)
            goto L41
        L32:
            o.RenewEligibleCreator r1 = new o.RenewEligibleCreator
            r1.<init>()
            throw r1
        L38:
            V extends o.handleMiscCode r4 = r1.RemoteActionCompatParcelizer
            com.marrow.ui.activities.plan.PlanContract$View r4 = (com.marrow.ui.activities.plan.PlanContract.View) r4
            int r1 = r1.AudioAttributesImplApi21Parcelizer
            r4.AudioAttributesCompatParcelizer(r2, r3, r1)
        L41:
            o.getShowPopup r1 = kotlin.getShowPopup.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.plan.PlanPresenter.AudioAttributesCompatParcelizer(com.marrow.ui.activities.plan.PlanPresenter, java.lang.String, int, com.marrow.data.api.models.MarrowResponse):o.getShowPopup");
    }

    private static setFastestInterval.read IconCompatParcelizer(String str, String str2, String str3) {
        return new setFastestInterval.read(str, str2, str3);
    }
}
