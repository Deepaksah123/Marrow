package com.marrow.kt.ui.activities.plan;

import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import com.google.android.exoplayer2.C;
import com.marrow.R;
import com.marrow.data.api.models.Failed;
import com.marrow.data.api.models.MarrowError;
import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.Success;
import com.marrow.data.api.models.response.payment.PayloadKt;
import com.marrow.data.api.models.response.payment.PaymentStatusResponse;
import com.marrow.data.api.models.response.plan.OrderDetails;
import com.marrow.data.api.models.response.plan.SdkPayload;
import com.marrow.data.api.models.response.plan.SdkPayloadData;
import com.marrow.data.api.models.response.plan.UpgradeCardContent;
import com.marrow.data.api.models.response.plan.UpgradePlanResponseV2;
import com.marrow.data.models.ResponseError;
import com.marrow.data.models.common.ApplicationData;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.plan.Copy;
import com.marrow.data.models.plan.PlanMetaDataResponse;
import com.marrow.data.models.user.LoggedUser;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract;
import com.marrow.kt.ui.activities.plan.UpgradePlanActivityPresenter;
import in.juspay.hyper.constants.LogSubCategory;
import in.juspay.hypersdk.core.PaymentConstants;
import java.text.SimpleDateFormat;
import java.util.List;
import kotlin.C0201setMcqCount;
import kotlin.College;
import kotlin.IntermediateLoginResponseBody;
import kotlin.LessonDynamicResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.TestGroupLSModel;
import kotlin.TopUserCompanion;
import kotlin.TransferRtpDataChannel;
import kotlin.accessgetEmptyStatecp;
import kotlin.endsWithLivePostrollPlaceHolder;
import kotlin.getAltContact;
import kotlin.getAnswerMap;
import kotlin.getChannel;
import kotlin.getIds;
import kotlin.getMagicModuleStats;
import kotlin.getPlatform;
import kotlin.getSegmentEndTimeUs;
import kotlin.getShowPopup;
import kotlin.getStreamPositionUsForContent;
import kotlin.getYear;
import kotlin.isAtLeastN;
import kotlin.isRtspStartLine;
import kotlin.isSeekPending;
import kotlin.isUnused;
import kotlin.maybeNotifyPrimaryTrackFormatChanged;
import kotlin.parseLongAttr;
import kotlin.parseStringAttr;
import kotlin.readShort;
import kotlin.setCountry;
import kotlin.setDownloadingStatesToQueued;
import kotlin.setFastestInterval;
import kotlin.setSdkPayload;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateLoadingFinished;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u0000 U2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001UBw\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\b\u0001\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\b\b\u0001\u0010\u001a\u001a\u00020\u001b¢\u0006\u0004\b\u001c\u0010\u001dJ\b\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020'H\u0016J\b\u00101\u001a\u00020/H\u0016J\b\u00102\u001a\u00020/H\u0002J\b\u00103\u001a\u00020/H\u0002J\b\u00104\u001a\u00020/H\u0016J\b\u00105\u001a\u00020/H\u0002J\b\u00106\u001a\u00020/H\u0016J\b\u00107\u001a\u00020/H\u0016J\u0018\u00108\u001a\u00020/2\u0006\u00109\u001a\u00020'2\u0006\u0010:\u001a\u00020'H\u0016J\b\u0010;\u001a\u00020/H\u0016J\u0014\u0010<\u001a\u00020/2\n\u0010=\u001a\u00060>j\u0002`?H\u0016J\u0010\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020'H\u0002J\b\u0010B\u001a\u00020/H\u0002J\b\u0010C\u001a\u00020/H\u0002J\b\u0010D\u001a\u00020/H\u0002J\b\u0010E\u001a\u00020/H\u0002J\b\u0010F\u001a\u00020/H\u0002J\b\u0010G\u001a\u00020/H\u0002J\b\u0010H\u001a\u00020$H\u0016J\b\u0010I\u001a\u00020/H\u0016J\b\u0010J\u001a\u00020/H\u0002J\u0014\u0010K\u001a\u00020/2\n\u0010=\u001a\u00060>j\u0002`?H\u0016J\u0010\u0010L\u001a\u00020/2\u0006\u0010M\u001a\u00020'H\u0016J\u0010\u0010N\u001a\u00020/2\u0006\u0010M\u001a\u00020'H\u0016J\b\u0010O\u001a\u00020/H\u0016J\u0010\u0010P\u001a\u00020/2\u0006\u0010M\u001a\u00020'H\u0016J\u0018\u0010Q\u001a\u00020/2\u0006\u0010M\u001a\u00020'2\u0006\u0010R\u001a\u00020)H\u0002J\b\u0010S\u001a\u00020/H\u0016J\b\u0010T\u001a\u00020/H\u0016R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u0010 \u001a\n\u0012\u0004\u0012\u00020\"\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020$X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010&\u001a\u0004\u0018\u00010'X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020)X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020$X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006V"}, d2 = {"Lcom/marrow/kt/ui/activities/plan/UpgradePlanActivityPresenter;", "Lcom/marrow/kt/base/BasePresenter;", "Lcom/marrow/kt/ui/activities/plan/UpgradePlanActivityContract$View;", "Lcom/marrow/kt/ui/activities/plan/UpgradePlanActivityContract$Presenter;", "crashDataProvider2", "Lcom/marrow/dataprovider/crash/ICrashDataProvider;", "resourceProvider", "Lcom/marrow/data/dataprovider/common/IResourceProvider;", "computationScheduler", "Lio/reactivex/Scheduler;", "uiScheduler", "view", "preferenceDataProvider", "Lcom/marrow/data/dataprovider/preference/IPreferenceDataProvider;", "planDataProvider", "Lcom/marrow/data/dataprovider/plan/IPlanDataProvider;", "subscriptionSyncRemoteDataSource", "Lcom/marrow/data/dataprovider/sync/subscription/SubscriptionSyncRemoteDataSource;", "connectivity", "Lcom/marrow/mvp/Connectivity;", "applicationData", "Lcom/marrow/data/models/common/ApplicationData;", "intent", "Lcom/marrow/di/activity/ActivityArguments;", "analytics", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "mainDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "<init>", "(Lcom/marrow/dataprovider/crash/ICrashDataProvider;Lcom/marrow/data/dataprovider/common/IResourceProvider;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;Lcom/marrow/kt/ui/activities/plan/UpgradePlanActivityContract$View;Lcom/marrow/data/dataprovider/preference/IPreferenceDataProvider;Lcom/marrow/data/dataprovider/plan/IPlanDataProvider;Lcom/marrow/data/dataprovider/sync/subscription/SubscriptionSyncRemoteDataSource;Lcom/marrow/mvp/Connectivity;Lcom/marrow/data/models/common/ApplicationData;Lcom/marrow/di/activity/ActivityArguments;Lcom/marrow/dranalytics/base/AnalyticPublisher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "data", "Lcom/marrow/data/api/models/response/plan/UpgradePlanResponseV2;", "faqs", "", "Lcom/marrow/data/api/models/response/plan/UpgradeCardContent;", "isDeeplink", "", "isUserEligibleForUpgrade", "source", "", "subscriptionSyncCount", "", "juspayStatusCheckCount", "juspayPaymentInProgress", "presenterScope", "Lkotlinx/coroutines/CoroutineScope;", "clearUpgradePlanPreference", "", "getPlanExpiryDate", "onCreate", "sendOpenScreenEvent", "logPurchaseSuccess", "logPurchaseFailure", "logPurchaseFailureEvent", "onJusPayCodInitiated", "onJusPayBackPressedOrCancelled", "onJusPayAuthorizationFailed", "code", "errorMsg", "onJusPayNoInternet", "onJusPayException", "e", "Ljava/lang/Exception;", "Lkotlin/Exception;", "validatePlanPurchaseCountry", "groupId", "getPlanData", "getFaqs", "presetUserData", "startPayment", "readyPaymentObject", "startRazorPayPayment", "isJusPayPaymentInProgress", "onJusPayPaymentFinished", "startJusPayPayment", "recordCrash", "onPaymentSuccess", "orderId", "validatePaymentWithServer", "onJusPaySdkPaymentSuccess", "checkJusPayPaymentStatus", "retryJusPayPaymentStatus", "attemptNo", "onDestroy", "onBuyNowBtnClicked", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class UpgradePlanActivityPresenter extends isRtspStartLine<UpgradePlanActivityContract.AudioAttributesCompatParcelizer> implements UpgradePlanActivityContract.Presenter {
    public static final AudioAttributesCompatParcelizer read = new AudioAttributesCompatParcelizer(null);
    private final isSeekPending AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private UpgradePlanResponseV2 AudioAttributesImplApi26Parcelizer;
    private List<UpgradeCardContent> AudioAttributesImplBaseParcelizer;
    private final getChannel IconCompatParcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private final isUnused MediaBrowserCompatMediaItem;
    private final getPlatform MediaBrowserCompatSearchResultReceiver;
    private final TopUserCompanion MediaDescriptionCompat;
    private final getStreamPositionUsForContent MediaMetadataCompat;
    private int RatingCompat;
    private final String handleMediaPlayPauseIfPendingOnHandler;
    private final maybeNotifyPrimaryTrackFormatChanged onAddQueueItem;
    private int onCustomAction;
    private final ApplicationData write;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @setSdkPayload
    public UpgradePlanActivityPresenter(parseLongAttr parselongattr, endsWithLivePostrollPlaceHolder endswithlivepostrollplaceholder, getIds getids, getIds getids2, UpgradePlanActivityContract.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, getStreamPositionUsForContent getstreampositionusforcontent, isUnused isunused, maybeNotifyPrimaryTrackFormatChanged maybenotifyprimarytrackformatchanged, getChannel getchannel, ApplicationData applicationData, parseStringAttr parsestringattr, isSeekPending isseekpending, getPlatform getplatform) {
        super(parselongattr, endswithlivepostrollplaceholder, getids, getids2, audioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.write(parselongattr, "");
        toMagicModuleMetaRepoModel.write(endswithlivepostrollplaceholder, "");
        toMagicModuleMetaRepoModel.write(getids, "");
        toMagicModuleMetaRepoModel.write(getids2, "");
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(isunused, "");
        toMagicModuleMetaRepoModel.write(maybenotifyprimarytrackformatchanged, "");
        toMagicModuleMetaRepoModel.write(getchannel, "");
        toMagicModuleMetaRepoModel.write(applicationData, "");
        toMagicModuleMetaRepoModel.write(parsestringattr, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        this.MediaMetadataCompat = getstreampositionusforcontent;
        this.MediaBrowserCompatMediaItem = isunused;
        this.onAddQueueItem = maybenotifyprimarytrackformatchanged;
        this.IconCompatParcelizer = getchannel;
        this.write = applicationData;
        this.AudioAttributesCompatParcelizer = isseekpending;
        this.MediaBrowserCompatSearchResultReceiver = getplatform;
        this.MediaBrowserCompatCustomActionResultReceiver = parsestringattr.IconCompatParcelizer("is_deeplink");
        this.MediaBrowserCompatItemReceiver = parsestringattr.IconCompatParcelizer("is_user_eligible_for_upgrade");
        this.handleMediaPlayPauseIfPendingOnHandler = parsestringattr.AudioAttributesCompatParcelizer("source");
        this.MediaDescriptionCompat = College.AudioAttributesCompatParcelizer(getAltContact.read(null).plus(getplatform));
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.Presenter
    public final void write() {
        this.MediaMetadataCompat.AudioAttributesImplApi26Parcelizer((String) null);
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.Presenter
    public final void AudioAttributesCompatParcelizer() {
        onPlayFromMediaId();
        if (this.MediaBrowserCompatCustomActionResultReceiver && !this.MediaBrowserCompatItemReceiver) {
            SpannableString spannableString = new SpannableString(read(R.string.upgrade_deeplink_error));
            try {
                int i = TestGroupLSModel.read((CharSequence) spannableString, read(R.string.eligible_key), 0, false, 6);
                int length = read(R.string.eligible_key).length();
                int i2 = TestGroupLSModel.read((CharSequence) spannableString, read(R.string.not_eligible_key), 0, false, 6);
                int length2 = read(R.string.not_eligible_key).length();
                int i3 = TestGroupLSModel.read((CharSequence) spannableString, read(R.string.planb_key), 0, false, 6);
                int length3 = read(R.string.planb_key).length();
                spannableString.setSpan(new StyleSpan(1), i, length + i, 18);
                spannableString.setSpan(new StyleSpan(1), i2, length2 + i2, 18);
                spannableString.setSpan(new StyleSpan(1), i3, length3 + i3, 18);
            } catch (Exception unused) {
            } catch (Throwable th) {
                ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(spannableString);
                ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onMediaButtonEvent();
                throw th;
            }
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(spannableString);
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onMediaButtonEvent();
            return;
        }
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    private final void onPlayFromMediaId() {
        if (this.handleMediaPlayPauseIfPendingOnHandler != null) {
            isSeekPending isseekpending = this.AudioAttributesCompatParcelizer;
            setFastestInterval setfastestinterval = setFastestInterval.INSTANCE;
            isseekpending.write(setFastestInterval.AudioAttributesCompatParcelizer(this.handleMediaPlayPauseIfPendingOnHandler), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        }
    }

    private final void onAddQueueItem() {
        isSeekPending isseekpending = this.AudioAttributesCompatParcelizer;
        TransferRtpDataChannel transferRtpDataChannel = TransferRtpDataChannel.INSTANCE;
        UpgradePlanResponseV2 upgradePlanResponseV2 = this.AudioAttributesImplApi26Parcelizer;
        String id = upgradePlanResponseV2 != null ? upgradePlanResponseV2.getId() : null;
        if (id == null) {
            id = "";
        }
        UpgradePlanResponseV2 upgradePlanResponseV22 = this.AudioAttributesImplApi26Parcelizer;
        String groupId = upgradePlanResponseV22 != null ? upgradePlanResponseV22.getGroupId() : null;
        isseekpending.write(TransferRtpDataChannel.write(id, groupId != null ? groupId : ""), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.Presenter
    public final void read() {
        handleMediaPlayPauseIfPendingOnHandler();
    }

    private final void handleMediaPlayPauseIfPendingOnHandler() {
        isSeekPending isseekpending = this.AudioAttributesCompatParcelizer;
        TransferRtpDataChannel transferRtpDataChannel = TransferRtpDataChannel.INSTANCE;
        UpgradePlanResponseV2 upgradePlanResponseV2 = this.AudioAttributesImplApi26Parcelizer;
        String id = upgradePlanResponseV2 != null ? upgradePlanResponseV2.getId() : null;
        if (id == null) {
            id = "";
        }
        UpgradePlanResponseV2 upgradePlanResponseV22 = this.AudioAttributesImplApi26Parcelizer;
        String groupId = upgradePlanResponseV22 != null ? upgradePlanResponseV22.getGroupId() : null;
        isseekpending.write(TransferRtpDataChannel.IconCompatParcelizer(id, groupId != null ? groupId : ""), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.Presenter
    public final void RatingCompat() {
        ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(read(R.string.cod_initiated));
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.Presenter
    public final void MediaBrowserCompatItemReceiver() {
        onMediaButtonEvent();
        ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(read(R.string.payment_cancelled));
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.Presenter
    public final void IconCompatParcelizer(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        onMediaButtonEvent();
        UpgradePlanActivityContract.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer;
        Integer numAudioAttributesImplApi26Parcelizer = TestGroupLSModel.AudioAttributesImplApi26Parcelizer(str);
        audioAttributesCompatParcelizer.write(new ResponseError(numAudioAttributesImplApi26Parcelizer != null ? numAudioAttributesImplApi26Parcelizer.intValue() : 0, str2, false, 4, null));
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.Presenter
    public final void MediaDescriptionCompat() {
        onMediaButtonEvent();
        ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(read(R.string.app_error_no_internet));
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.Presenter
    public final void read(Exception exc) {
        toMagicModuleMetaRepoModel.write(exc, "");
        onMediaButtonEvent();
        AudioAttributesCompatParcelizer(exc);
    }

    private final void write(String str) {
        LessonDynamicResponseBody<MarrowResponse<PlanMetaDataResponse>> lessonDynamicResponseBodyWrite = this.MediaBrowserCompatMediaItem.write(str);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyWrite, "");
        AudioAttributesCompatParcelizer(lessonDynamicResponseBodyWrite, new getAnswerMap() { // from class: o.RtpAc3Reader
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return UpgradePlanActivityPresenter.AudioAttributesImplApi26Parcelizer(this.RemoteActionCompatParcelizer, (MarrowResponse) obj);
            }
        }, new getAnswerMap() { // from class: o.processFragmentedPacket
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return UpgradePlanActivityPresenter.IconCompatParcelizer((Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer(UpgradePlanActivityPresenter upgradePlanActivityPresenter, MarrowResponse marrowResponse) {
        Copy vpnUsageCopy;
        Copy countryRestrictionCopy;
        if (marrowResponse instanceof Success) {
            PlanMetaDataResponse planMetaDataResponse = (PlanMetaDataResponse) ((Success) marrowResponse).getData();
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(planMetaDataResponse.getMediaRestrictions().isCountryRestrictedForVideo(), Boolean.TRUE) && (countryRestrictionCopy = planMetaDataResponse.getMediaRestrictions().getCountryRestrictionCopy()) != null) {
                ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) upgradePlanActivityPresenter.RemoteActionCompatParcelizer).read(countryRestrictionCopy.getMainCopy(), countryRestrictionCopy.getLink().getText(), countryRestrictionCopy.getLink().getHref());
                isSeekPending isseekpending = upgradePlanActivityPresenter.AudioAttributesCompatParcelizer;
                isAtLeastN isatleastn = isAtLeastN.INSTANCE;
                isseekpending.write(isAtLeastN.write(upgradePlanActivityPresenter.MediaMetadataCompat.onRemoveQueueItem()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(planMetaDataResponse.getMediaRestrictions().isVpnUsageDetected(), Boolean.TRUE) && (vpnUsageCopy = planMetaDataResponse.getMediaRestrictions().getVpnUsageCopy()) != null) {
                ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) upgradePlanActivityPresenter.RemoteActionCompatParcelizer).IconCompatParcelizer(vpnUsageCopy.getMainCopy(), vpnUsageCopy.getLink().getText(), vpnUsageCopy.getLink().getHref());
                isSeekPending isseekpending2 = upgradePlanActivityPresenter.AudioAttributesCompatParcelizer;
                isAtLeastN isatleastn2 = isAtLeastN.INSTANCE;
                isseekpending2.write(isAtLeastN.IconCompatParcelizer(upgradePlanActivityPresenter.MediaMetadataCompat.onRemoveQueueItem()), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(Throwable th) {
        toMagicModuleMetaRepoModel.write(th, "");
        getSegmentEndTimeUs.IconCompatParcelizer(th);
        return getShowPopup.INSTANCE;
    }

    private final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        if (this.IconCompatParcelizer.aC_()) {
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onPlayFromUri();
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onMediaButtonEvent();
            accessgetEmptyStatecp<MarrowResponse<UpgradePlanResponseV2>> accessgetemptystatecpIconCompatParcelizer = this.MediaBrowserCompatMediaItem.IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpIconCompatParcelizer, "");
            IconCompatParcelizer(accessgetemptystatecpIconCompatParcelizer, new getAnswerMap() { // from class: o.parseVopHeader
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return UpgradePlanActivityPresenter.AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer, (MarrowResponse) obj);
                }
            }, new getAnswerMap() { // from class: o.getBufferFlagsFromNalType
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return UpgradePlanActivityPresenter.write(this.write, (Throwable) obj);
                }
            });
            return;
        }
        ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).MediaBrowserCompatMediaItem(read(R.string.app_error_no_internet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(UpgradePlanActivityPresenter upgradePlanActivityPresenter, MarrowResponse marrowResponse) {
        if (marrowResponse instanceof Success) {
            upgradePlanActivityPresenter.AudioAttributesImplApi26Parcelizer = (UpgradePlanResponseV2) ((Success) marrowResponse).getData();
            upgradePlanActivityPresenter.MediaMetadataCompat.AudioAttributesImplApi26Parcelizer(new setDownloadingStatesToQueued().AudioAttributesCompatParcelizer(upgradePlanActivityPresenter.AudioAttributesImplApi26Parcelizer));
            upgradePlanActivityPresenter.MediaBrowserCompatMediaItem();
            UpgradePlanResponseV2 upgradePlanResponseV2 = upgradePlanActivityPresenter.AudioAttributesImplApi26Parcelizer;
            String groupId = upgradePlanResponseV2 != null ? upgradePlanResponseV2.getGroupId() : null;
            String str = groupId;
            if (str != null && str.length() != 0) {
                upgradePlanActivityPresenter.write(groupId);
            }
        } else if (marrowResponse instanceof Failed) {
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) upgradePlanActivityPresenter.RemoteActionCompatParcelizer).write(((Failed) marrowResponse).getError());
            upgradePlanActivityPresenter.MediaMetadataCompat.AudioAttributesImplApi26Parcelizer((String) null);
        } else {
            if (!(marrowResponse instanceof MarrowError)) {
                throw new RenewEligibleCreator();
            }
            UpgradePlanActivityContract.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (UpgradePlanActivityContract.AudioAttributesCompatParcelizer) upgradePlanActivityPresenter.RemoteActionCompatParcelizer;
            String message = ((MarrowError) marrowResponse).getThrowable().getMessage();
            if (message == null) {
                message = upgradePlanActivityPresenter.read(R.string.something_went_wrong);
            }
            audioAttributesCompatParcelizer.MediaBrowserCompatMediaItem(message);
        }
        ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) upgradePlanActivityPresenter.RemoteActionCompatParcelizer).onPlayFromMediaId();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(UpgradePlanActivityPresenter upgradePlanActivityPresenter, Throwable th) {
        toMagicModuleMetaRepoModel.write(th, "");
        ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) upgradePlanActivityPresenter.RemoteActionCompatParcelizer).onPlayFromMediaId();
        UpgradePlanActivityContract.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (UpgradePlanActivityContract.AudioAttributesCompatParcelizer) upgradePlanActivityPresenter.RemoteActionCompatParcelizer;
        String message = th.getMessage();
        if (message == null) {
            message = upgradePlanActivityPresenter.read(R.string.something_went_wrong);
        }
        audioAttributesCompatParcelizer.MediaBrowserCompatMediaItem(message);
        upgradePlanActivityPresenter.RemoteActionCompatParcelizer(th);
        return getShowPopup.INSTANCE;
    }

    private final void MediaBrowserCompatMediaItem() {
        if (this.IconCompatParcelizer.aC_()) {
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onPlayFromUri();
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onMediaButtonEvent();
            accessgetEmptyStatecp<MarrowResponse<List<UpgradeCardContent>>> accessgetemptystatecpRemoteActionCompatParcelizer = this.MediaBrowserCompatMediaItem.RemoteActionCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpRemoteActionCompatParcelizer, "");
            IconCompatParcelizer(accessgetemptystatecpRemoteActionCompatParcelizer, new getAnswerMap() { // from class: o.processSingleFramePacket
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return UpgradePlanActivityPresenter.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, (MarrowResponse) obj);
                }
            }, new getAnswerMap() { // from class: o.RtpH263Reader
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return UpgradePlanActivityPresenter.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, (Throwable) obj);
                }
            });
            return;
        }
        ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).MediaBrowserCompatMediaItem(read(R.string.app_error_no_internet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(UpgradePlanActivityPresenter upgradePlanActivityPresenter, MarrowResponse marrowResponse) {
        if (marrowResponse instanceof Success) {
            upgradePlanActivityPresenter.AudioAttributesImplBaseParcelizer = (List) ((Success) marrowResponse).getData();
        } else if (!(marrowResponse instanceof Failed) && !(marrowResponse instanceof MarrowError)) {
            throw new RenewEligibleCreator();
        }
        ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) upgradePlanActivityPresenter.RemoteActionCompatParcelizer).onPlayFromMediaId();
        ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) upgradePlanActivityPresenter.RemoteActionCompatParcelizer).onPrepareFromMediaId();
        upgradePlanActivityPresenter.onCommand();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup RemoteActionCompatParcelizer(UpgradePlanActivityPresenter upgradePlanActivityPresenter, Throwable th) {
        toMagicModuleMetaRepoModel.write(th, "");
        ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) upgradePlanActivityPresenter.RemoteActionCompatParcelizer).onPlayFromMediaId();
        upgradePlanActivityPresenter.RemoteActionCompatParcelizer(th);
        return getShowPopup.INSTANCE;
    }

    private final void onCommand() {
        UpgradePlanResponseV2 upgradePlanResponseV2 = this.AudioAttributesImplApi26Parcelizer;
        if (upgradePlanResponseV2 != null) {
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesImplApi21Parcelizer(upgradePlanResponseV2.getGroupTitle());
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer(upgradePlanResponseV2.getGroupSubTitle());
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).MediaBrowserCompatCustomActionResultReceiver(read(R.string.price_string_format, Integer.valueOf(upgradePlanResponseV2.getPrice())));
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(read(R.string.price_string_format, Integer.valueOf(upgradePlanResponseV2.getBasePrice())));
            String str = new SimpleDateFormat("MMM dd, yyyy").format(Long.valueOf(upgradePlanResponseV2.getValidTill()));
            toMagicModuleMetaRepoModel.write((Object) str);
            SpannableString spannableString = new SpannableString(read(R.string.validity_format, str));
            spannableString.setSpan(new ForegroundColorSpan(ap_().read()), 0, 11, 17);
            spannableString.setSpan(new ForegroundColorSpan(-1), 11, spannableString.length(), 33);
            spannableString.setSpan(new StyleSpan(2), 0, spannableString.length(), 17);
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).write(spannableString);
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).RatingCompat(read(R.string.validity_format_2, str));
            int size = upgradePlanResponseV2.getPlanBUpgradeDataList().size();
            for (int i = 0; i < size; i++) {
                ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesImplBaseParcelizer(upgradePlanResponseV2.getPlanBUpgradeDataList().get(i).getKey());
                ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).write(upgradePlanResponseV2.getPlanBUpgradeDataList().get(i).getDescriptionList());
            }
            List<UpgradeCardContent> list = this.AudioAttributesImplBaseParcelizer;
            if (list == null || list.isEmpty()) {
                ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onCustomAction();
                return;
            }
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onPlay();
            List<UpgradeCardContent> list2 = this.AudioAttributesImplBaseParcelizer;
            toMagicModuleMetaRepoModel.write(list2);
            int size2 = list2.size();
            for (int i2 = 0; i2 < size2; i2++) {
                if (list2.get(i2).getTitle() != null) {
                    UpgradePlanActivityContract.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer;
                    String title = list2.get(i2).getTitle();
                    if (title == null) {
                        title = String.valueOf(i2);
                    }
                    audioAttributesCompatParcelizer.write(title);
                    UpgradePlanActivityContract.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = (UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer;
                    String description = list2.get(i2).getDescription();
                    if (description == null) {
                        description = String.valueOf(i2);
                    }
                    audioAttributesCompatParcelizer2.IconCompatParcelizer(description);
                }
            }
        }
    }

    private final void onFastForward() {
        if (this.IconCompatParcelizer.aC_()) {
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onPlayFromUri();
            accessgetEmptyStatecp<MarrowResponse<UpgradePlanResponseV2>> accessgetemptystatecpWrite = this.MediaBrowserCompatMediaItem.write();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpWrite, "");
            IconCompatParcelizer(accessgetemptystatecpWrite, new getAnswerMap() { // from class: o.outputSampleMetadataForFragmentedPackets
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return UpgradePlanActivityPresenter.AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer, (MarrowResponse) obj);
                }
            }, new getAnswerMap() { // from class: o.RtpH264Reader
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return UpgradePlanActivityPresenter.AudioAttributesImplBaseParcelizer(this.RemoteActionCompatParcelizer, (Throwable) obj);
                }
            });
            return;
        }
        ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(read(R.string.app_error_no_internet));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi21Parcelizer(UpgradePlanActivityPresenter upgradePlanActivityPresenter, MarrowResponse marrowResponse) {
        if (marrowResponse instanceof Success) {
            upgradePlanActivityPresenter.AudioAttributesImplApi26Parcelizer = (UpgradePlanResponseV2) ((Success) marrowResponse).getData();
            upgradePlanActivityPresenter.onCustomAction();
        } else if (marrowResponse instanceof Failed) {
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) upgradePlanActivityPresenter.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(((Failed) marrowResponse).getError().getErrorMessage());
        } else {
            if (!(marrowResponse instanceof MarrowError)) {
                throw new RenewEligibleCreator();
            }
            UpgradePlanActivityContract.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (UpgradePlanActivityContract.AudioAttributesCompatParcelizer) upgradePlanActivityPresenter.RemoteActionCompatParcelizer;
            String message = ((MarrowError) marrowResponse).getThrowable().getMessage();
            if (message == null) {
                message = upgradePlanActivityPresenter.read(R.string.something_went_wrong);
            }
            audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(message);
        }
        ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) upgradePlanActivityPresenter.RemoteActionCompatParcelizer).onPlayFromMediaId();
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplBaseParcelizer(UpgradePlanActivityPresenter upgradePlanActivityPresenter, Throwable th) {
        toMagicModuleMetaRepoModel.write(th, "");
        ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) upgradePlanActivityPresenter.RemoteActionCompatParcelizer).onPlayFromMediaId();
        UpgradePlanActivityContract.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (UpgradePlanActivityContract.AudioAttributesCompatParcelizer) upgradePlanActivityPresenter.RemoteActionCompatParcelizer;
        String message = th.getMessage();
        if (message == null) {
            message = upgradePlanActivityPresenter.read(R.string.something_went_wrong);
        }
        audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(message);
        upgradePlanActivityPresenter.RemoteActionCompatParcelizer(th);
        return getShowPopup.INSTANCE;
    }

    private final void onCustomAction() {
        OrderDetails orderDetails;
        OrderDetails orderDetails2;
        UpgradePlanResponseV2 upgradePlanResponseV2 = this.AudioAttributesImplApi26Parcelizer;
        String gateway = null;
        String orderId = upgradePlanResponseV2 != null ? upgradePlanResponseV2.getOrderId() : null;
        if (orderId == null || orderId.length() == 0) {
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(read(R.string.something_went_wrong));
            return;
        }
        UpgradePlanResponseV2 upgradePlanResponseV22 = this.AudioAttributesImplApi26Parcelizer;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((upgradePlanResponseV22 == null || (orderDetails2 = upgradePlanResponseV22.getOrderDetails()) == null) ? null : orderDetails2.getGateway()), (Object) "juspay")) {
            onPause();
            return;
        }
        UpgradePlanResponseV2 upgradePlanResponseV23 = this.AudioAttributesImplApi26Parcelizer;
        if (upgradePlanResponseV23 != null && (orderDetails = upgradePlanResponseV23.getOrderDetails()) != null) {
            gateway = orderDetails.getGateway();
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) gateway, (Object) "razorpay")) {
            onPlay();
        } else {
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(read(R.string.something_went_wrong));
        }
    }

    private final void onPlay() {
        UpgradePlanResponseV2 upgradePlanResponseV2 = this.AudioAttributesImplApi26Parcelizer;
        Integer numValueOf = upgradePlanResponseV2 != null ? Integer.valueOf(upgradePlanResponseV2.getPrice()) : null;
        Integer numValueOf2 = numValueOf != null ? Integer.valueOf(numValueOf.intValue() * 100) : null;
        LoggedUser loggedUser = this.write.getLoggedUser();
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("name", "Marrow App Subscription");
            UpgradePlanResponseV2 upgradePlanResponseV22 = this.AudioAttributesImplApi26Parcelizer;
            String groupTitle = upgradePlanResponseV22 != null ? upgradePlanResponseV22.getGroupTitle() : null;
            UpgradePlanResponseV2 upgradePlanResponseV23 = this.AudioAttributesImplApi26Parcelizer;
            String id = upgradePlanResponseV23 != null ? upgradePlanResponseV23.getId() : null;
            StringBuilder sb = new StringBuilder();
            sb.append(groupTitle);
            sb.append(", ");
            sb.append(id);
            jSONObject.put("description", sb.toString());
            jSONObject.put(PayloadKt.KEY_JP_CURRENCY, "INR");
            jSONObject.put("amount", String.valueOf(numValueOf2));
            UpgradePlanResponseV2 upgradePlanResponseV24 = this.AudioAttributesImplApi26Parcelizer;
            jSONObject.put(PaymentConstants.ORDER_ID, upgradePlanResponseV24 != null ? upgradePlanResponseV24.getOrderId() : null);
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
            UpgradePlanResponseV2 upgradePlanResponseV25 = this.AudioAttributesImplApi26Parcelizer;
            jSONObject4.put("plan_id", upgradePlanResponseV25 != null ? upgradePlanResponseV25.getId() : null);
            UpgradePlanResponseV2 upgradePlanResponseV26 = this.AudioAttributesImplApi26Parcelizer;
            jSONObject4.put("plan_title", upgradePlanResponseV26 != null ? upgradePlanResponseV26.getGroupTitle() : null);
            UpgradePlanResponseV2 upgradePlanResponseV27 = this.AudioAttributesImplApi26Parcelizer;
            jSONObject4.put("plan_duration", upgradePlanResponseV27 != null ? Integer.valueOf(upgradePlanResponseV27.getSubscriptionPeriod()) : null);
            jSONObject4.put("amount", String.valueOf(numValueOf));
            jSONObject4.put("user_id", loggedUser.getInfo().getId());
            jSONObject4.put("platform", LogSubCategory.LifeCycle.ANDROID);
            jSONObject4.put(FilterParams.KEY_COURSE_ID, this.MediaMetadataCompat.onRemoveQueueItem());
            jSONObject.put(CourseConfigKeyConstantsKt.KEY_NOTES, jSONObject4);
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(jSONObject);
        } catch (Exception e) {
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(read(R.string.error_in_payment));
            am_().AudioAttributesCompatParcelizer(e, "CHECKOUT");
        }
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.Presenter
    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    private void onMediaButtonEvent() {
        this.AudioAttributesImplApi21Parcelizer = false;
    }

    private final void onPause() {
        OrderDetails orderDetails;
        UpgradePlanResponseV2 upgradePlanResponseV2 = this.AudioAttributesImplApi26Parcelizer;
        SdkPayload sdkPayload = (upgradePlanResponseV2 == null || (orderDetails = upgradePlanResponseV2.getOrderDetails()) == null) ? null : orderDetails.getSdkPayload();
        SdkPayloadData payload = sdkPayload != null ? sdkPayload.getPayload() : null;
        if (payload == null) {
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(read(R.string.something_went_wrong));
            return;
        }
        try {
            readShort.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = new readShort.AudioAttributesCompatParcelizer(payload.getAction(), payload.getAmount(), payload.getClientId(), payload.getMerchantId(), payload.getEnvironment(), payload.getClientAuthToken(), payload.getClientAuthTokenExpiry(), payload.getCustomerId(), payload.getCurrency(), payload.getCustomerPhone(), payload.getCustomerEmail(), payload.getOrderId(), payload.getDescription(), sdkPayload.getRequestId(), sdkPayload.getService());
            this.AudioAttributesImplApi21Parcelizer = true;
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(audioAttributesCompatParcelizer);
        } catch (Exception e) {
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(read(R.string.error_in_payment));
            am_().AudioAttributesCompatParcelizer(e, "CHECKOUT");
        }
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.Presenter
    public final void AudioAttributesCompatParcelizer(Exception exc) {
        toMagicModuleMetaRepoModel.write(exc, "");
        am_().AudioAttributesCompatParcelizer(exc, "plan_upgrade_success_crash");
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.Presenter
    public final void onPaymentSuccess(String orderId) {
        toMagicModuleMetaRepoModel.write(orderId, "");
        onAddQueueItem();
        AudioAttributesCompatParcelizer(orderId);
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.Presenter
    public final void AudioAttributesCompatParcelizer(final String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        int i = this.onCustomAction;
        if (i > 4) {
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onPlayFromUri();
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onFastForward();
        } else {
            this.onCustomAction = i + 1;
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onPlayFromUri();
            read(this.onAddQueueItem.IconCompatParcelizer(str), new getAnswerMap() { // from class: o.RtpAmrReader
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return UpgradePlanActivityPresenter.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer, str, (MarrowResponse) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0038  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.getShowPopup AudioAttributesCompatParcelizer(com.marrow.kt.ui.activities.plan.UpgradePlanActivityPresenter r1, java.lang.String r2, com.marrow.data.api.models.MarrowResponse r3) {
        /*
            java.lang.String r0 = ""
            kotlin.toMagicModuleMetaRepoModel.write(r3, r0)
            V extends o.handleMiscCode r0 = r1.RemoteActionCompatParcelizer
            com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract$AudioAttributesCompatParcelizer r0 = (com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer) r0
            r0.onPlayFromMediaId()
            boolean r0 = r3 instanceof com.marrow.data.api.models.Failed
            if (r0 != 0) goto L38
            boolean r0 = r3 instanceof com.marrow.data.api.models.MarrowError
            if (r0 != 0) goto L38
            boolean r0 = r3 instanceof com.marrow.data.api.models.Success
            if (r0 == 0) goto L32
            com.marrow.data.api.models.Success r3 = (com.marrow.data.api.models.Success) r3
            java.lang.Object r0 = r3.getData()
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            int r0 = r0.length
            if (r0 != 0) goto L24
            goto L38
        L24:
            V extends o.handleMiscCode r1 = r1.RemoteActionCompatParcelizer
            com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract$AudioAttributesCompatParcelizer r1 = (com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer) r1
            java.lang.Object r3 = r3.getData()
            com.marrow.data.models.plan.Subscription[] r3 = (com.marrow.data.models.plan.Subscription[]) r3
            r1.write(r3, r2)
            goto L41
        L32:
            o.RenewEligibleCreator r1 = new o.RenewEligibleCreator
            r1.<init>()
            throw r1
        L38:
            V extends o.handleMiscCode r3 = r1.RemoteActionCompatParcelizer
            com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract$AudioAttributesCompatParcelizer r3 = (com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer) r3
            int r1 = r1.onCustomAction
            r3.RemoteActionCompatParcelizer(r2, r1)
        L41:
            o.getShowPopup r1 = kotlin.getShowPopup.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.kt.ui.activities.plan.UpgradePlanActivityPresenter.AudioAttributesCompatParcelizer(com.marrow.kt.ui.activities.plan.UpgradePlanActivityPresenter, java.lang.String, com.marrow.data.api.models.MarrowResponse):o.getShowPopup");
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.Presenter
    public final void MediaMetadataCompat() {
        String orderId;
        onAddQueueItem();
        this.AudioAttributesImplApi21Parcelizer = false;
        UpgradePlanResponseV2 upgradePlanResponseV2 = this.AudioAttributesImplApi26Parcelizer;
        if (upgradePlanResponseV2 == null || (orderId = upgradePlanResponseV2.getOrderId()) == null) {
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(read(R.string.something_went_wrong));
        } else {
            IconCompatParcelizer(orderId);
        }
    }

    public final void IconCompatParcelizer(final String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        int i = this.RatingCompat;
        if (i > 4) {
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onPlayFromUri();
            ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onFastForward();
            return;
        }
        this.RatingCompat = i + 1;
        ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) this.RemoteActionCompatParcelizer).onPlayFromUri();
        accessgetEmptyStatecp<MarrowResponse<PaymentStatusResponse>> accessgetemptystatecpAudioAttributesCompatParcelizer = this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(str);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpAudioAttributesCompatParcelizer, "");
        IconCompatParcelizer(accessgetemptystatecpAudioAttributesCompatParcelizer, new getAnswerMap() { // from class: o.maybeOutputSampleMetadata
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return UpgradePlanActivityPresenter.RemoteActionCompatParcelizer(this.read, str, (MarrowResponse) obj);
            }
        }, new getAnswerMap() { // from class: o.processMultiFramePacket
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return UpgradePlanActivityPresenter.IconCompatParcelizer(this.read, str, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.getShowPopup RemoteActionCompatParcelizer(com.marrow.kt.ui.activities.plan.UpgradePlanActivityPresenter r2, java.lang.String r3, com.marrow.data.api.models.MarrowResponse r4) {
        /*
            V extends o.handleMiscCode r0 = r2.RemoteActionCompatParcelizer
            com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract$AudioAttributesCompatParcelizer r0 = (com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.AudioAttributesCompatParcelizer) r0
            r0.onPlayFromMediaId()
            boolean r0 = r4 instanceof com.marrow.data.api.models.Failed
            if (r0 != 0) goto L3f
            boolean r0 = r4 instanceof com.marrow.data.api.models.MarrowError
            if (r0 != 0) goto L3f
            boolean r0 = r4 instanceof com.marrow.data.api.models.Success
            if (r0 == 0) goto L39
            com.marrow.data.api.models.Success r4 = (com.marrow.data.api.models.Success) r4
            java.lang.Object r0 = r4.getData()
            com.marrow.data.api.models.response.payment.PaymentStatusResponse r0 = (com.marrow.data.api.models.response.payment.PaymentStatusResponse) r0
            java.lang.String r0 = r0.getStatus()
            java.lang.String r1 = "payment_success"
            boolean r0 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r0, r1)
            if (r0 == 0) goto L3f
            java.lang.Object r3 = r4.getData()
            com.marrow.data.api.models.response.payment.PaymentStatusResponse r3 = (com.marrow.data.api.models.response.payment.PaymentStatusResponse) r3
            java.lang.String r3 = r3.getPaymentRefId()
            if (r3 != 0) goto L35
            java.lang.String r3 = ""
        L35:
            r2.AudioAttributesCompatParcelizer(r3)
            goto L44
        L39:
            o.RenewEligibleCreator r2 = new o.RenewEligibleCreator
            r2.<init>()
            throw r2
        L3f:
            int r4 = r2.RatingCompat
            r2.RemoteActionCompatParcelizer(r3, r4)
        L44:
            o.getShowPopup r2 = kotlin.getShowPopup.INSTANCE
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.kt.ui.activities.plan.UpgradePlanActivityPresenter.RemoteActionCompatParcelizer(com.marrow.kt.ui.activities.plan.UpgradePlanActivityPresenter, java.lang.String, com.marrow.data.api.models.MarrowResponse):o.getShowPopup");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(UpgradePlanActivityPresenter upgradePlanActivityPresenter, String str, Throwable th) {
        toMagicModuleMetaRepoModel.write(th, "");
        ((UpgradePlanActivityContract.AudioAttributesCompatParcelizer) upgradePlanActivityPresenter.RemoteActionCompatParcelizer).onPlayFromMediaId();
        upgradePlanActivityPresenter.RemoteActionCompatParcelizer(str, upgradePlanActivityPresenter.RatingCompat);
        upgradePlanActivityPresenter.RemoteActionCompatParcelizer(th);
        return getShowPopup.INSTANCE;
    }

    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private /* synthetic */ UpgradePlanActivityPresenter IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                kotlin.SdkPayloadData.IconCompatParcelizer(obj);
                long j = this.write;
                this.RemoteActionCompatParcelizer = 1;
                if (setCountry.IconCompatParcelizer(j * C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.SdkPayloadData.IconCompatParcelizer(obj);
            }
            this.IconCompatParcelizer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        read(int i, UpgradePlanActivityPresenter upgradePlanActivityPresenter, String str, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.write = i;
            this.IconCompatParcelizer = upgradePlanActivityPresenter;
            this.AudioAttributesCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.write, this.IconCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer(String str, int i) {
        C0201setMcqCount.IconCompatParcelizer(this.MediaDescriptionCompat, null, null, new read(i, this, str, null), 3);
    }

    @Override // kotlin.isRtspStartLine, kotlin.getExtendedEsFrChar
    public final void AudioAttributesImplApi26Parcelizer() {
        College.AudioAttributesCompatParcelizer(this.MediaDescriptionCompat, null);
        super.AudioAttributesImplApi26Parcelizer();
    }

    @Override // com.marrow.kt.ui.activities.plan.UpgradePlanActivityContract.Presenter
    public final void IconCompatParcelizer() {
        if (this.handleMediaPlayPauseIfPendingOnHandler != null) {
            isSeekPending isseekpending = this.AudioAttributesCompatParcelizer;
            setFastestInterval setfastestinterval = setFastestInterval.INSTANCE;
            isseekpending.write(setFastestInterval.read(this.handleMediaPlayPauseIfPendingOnHandler), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        }
        onFastForward();
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow/kt/ui/activities/plan/UpgradePlanActivityPresenter$AudioAttributesCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
