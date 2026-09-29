package com.marrow.ui.activities.plan;

import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.rtsp.RtpDataLoadable;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.data.api.models.response.payment.SdkPayload;
import com.marrow.data.api.models.response.plan.Coupon;
import com.marrow.data.models.ResponseError;
import com.marrow.data.models.plan.Plan;
import com.marrow.data.models.plan.PlanGroup;
import com.marrow.data.models.plan.Subscription;
import com.marrow.ui.activities.plan.PlanContract;
import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import kotlin.C0201setMcqCount;
import kotlin.CueDecoder;
import kotlin.DefaultTrackSelectorExternalSyntheticLambda0;
import kotlin.DownloadService;
import kotlin.HlsChunkSourceSegmentBaseHolder;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.Metadata;
import kotlin.PlayerControlViewExternalSyntheticLambda0;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.SessionDescriptionParser;
import kotlin.TopUserCompanion;
import kotlin.WebvttCueInfo;
import kotlin.canSelectFormat;
import kotlin.deriveMaxSize;
import kotlin.downloadMagicModuleMetalambda0;
import kotlin.getAdjustedUpstreamFormat;
import kotlin.getAnswerMap;
import kotlin.getColorInfoString;
import kotlin.getCredentialList;
import kotlin.getHttpMethodString;
import kotlin.getInternalName;
import kotlin.getLatestBitrateEstimate;
import kotlin.getMagicModuleMeta;
import kotlin.getMagicModuleStats;
import kotlin.getOrderDetails;
import kotlin.getPlaylistProtectionSchemes;
import kotlin.getPositionAnchor;
import kotlin.getShowPopup;
import kotlin.getYear;
import kotlin.handlePreambleAddressCode;
import kotlin.isDolbyAudio;
import kotlin.isExtendedWestEuropeanChar;
import kotlin.isNewSubtitleDataAvailable;
import kotlin.isResolutionNotSupported;
import kotlin.isSpecialNorthAmericanChar;
import kotlin.lambdasetDeviceMuted29;
import kotlin.notifyDownloads;
import kotlin.onRebuffer;
import kotlin.parseSelectionFlagsFromDashRoleScheme;
import kotlin.parseTrackTiming;
import kotlin.selectTextTrack;
import kotlin.setCountry;
import kotlin.setSessionInfo;
import kotlin.setWatermarkEnabled;
import kotlin.shouldEvaluateQueueSize;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaDataUcModel;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateAndVerifyCurrentChannel;
import kotlin.zat;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000³\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b*\u0003HKN\b\u0007\u0018\u0000 n2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001nB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\b\u0010.\u001a\u00020/H\u0016J\b\u00100\u001a\u00020+H\u0016J\u0012\u00103\u001a\u0002042\b\u00105\u001a\u0004\u0018\u000106H\u0016J\b\u00107\u001a\u000204H\u0002J\b\u00108\u001a\u000204H\u0016J\b\u00109\u001a\u000204H\u0016J\b\u0010:\u001a\u000204H\u0002J\u0010\u0010;\u001a\u0002042\u0006\u0010<\u001a\u00020$H\u0016J\u0018\u0010=\u001a\u0002042\u0006\u0010>\u001a\u00020+2\u0006\u0010?\u001a\u00020$H\u0016J\u0010\u0010@\u001a\u0002042\u0006\u0010A\u001a\u000206H\u0016J\u0010\u0010B\u001a\u0002042\u0006\u00105\u001a\u000206H\u0016J<\u0010C\u001a\u0002042\u0006\u0010D\u001a\u00020\u001c2\b\u0010E\u001a\u0004\u0018\u00010\u00162\b\u0010F\u001a\u0004\u0018\u00010\u00162\u0016\u0010%\u001a\u0012\u0012\u0004\u0012\u00020$0&j\b\u0012\u0004\u0012\u00020$`'H\u0002J\u0015\u0010P\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010\u000eH\u0016¢\u0006\u0002\u0010RJ\u0010\u0010S\u001a\u0002042\u0006\u0010T\u001a\u00020UH\u0016J\b\u0010V\u001a\u000204H\u0016J\b\u0010W\u001a\u000204H\u0016J\u0010\u0010X\u001a\u0002042\u0006\u0010Y\u001a\u00020ZH\u0016J\u0010\u0010[\u001a\u0002042\u0006\u0010\\\u001a\u00020$H\u0016J\b\u0010]\u001a\u000204H\u0016J\b\u0010^\u001a\u000204H\u0016J\u0010\u0010_\u001a\u0002042\u0006\u0010`\u001a\u00020$H\u0002J\u0010\u0010a\u001a\u0002042\u0006\u0010`\u001a\u00020$H\u0002J \u0010b\u001a\u0002042\u0006\u0010`\u001a\u00020$2\u0006\u0010c\u001a\u00020+2\u0006\u0010d\u001a\u00020+H\u0016J+\u0010e\u001a\u0002042\f\u0010f\u001a\b\u0012\u0004\u0012\u00020g0\u000e2\u0006\u0010<\u001a\u00020$2\u0006\u0010c\u001a\u00020+H\u0016¢\u0006\u0002\u0010hJ\b\u0010i\u001a\u000204H\u0016J\u0018\u0010j\u001a\u0002042\u0006\u0010`\u001a\u00020$2\u0006\u0010c\u001a\u00020+H\u0002J\u0018\u0010k\u001a\u0002042\u0006\u0010l\u001a\u00020+2\u0006\u0010m\u001a\u00020$H\u0002R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\nR$\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0014\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u001cX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u0016X\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0004\n\u0002\u0010!R\u0012\u0010\"\u001a\u0004\u0018\u00010 X\u0082\u000e¢\u0006\u0004\n\u0002\u0010!R\u0010\u0010#\u001a\u0004\u0018\u00010$X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010%\u001a\u0012\u0012\u0004\u0012\u00020$0&j\b\u0012\u0004\u0012\u00020$`'X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020)X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020+X\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010,\u001a\u0004\u0018\u00010-X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u000202X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010G\u001a\u00020HX\u0082\u0004¢\u0006\u0004\n\u0002\u0010IR\u0010\u0010J\u001a\u00020KX\u0082\u0004¢\u0006\u0004\n\u0002\u0010LR\u0010\u0010M\u001a\u00020NX\u0082\u0004¢\u0006\u0004\n\u0002\u0010O¨\u0006o"}, d2 = {"Lcom/marrow/ui/activities/plan/PlanActivity;", "Lcom/marrow/kt/base/BaseDaggerToolbarActivity;", "Lcom/marrow/ui/activities/plan/PlanContract$Presenter;", "Lcom/razorpay/PaymentResultListener;", "Lcom/marrow/ui/activities/plan/PlanContract$View;", "<init>", "()V", "binding", "Lcom/marrow/databinding/ActivityPlanDetailBinding;", "getBinding", "()Lcom/marrow/databinding/ActivityPlanDetailBinding;", "binding$delegate", "Lcom/marrow/kt/base/view_binding/ViewBindingProperty;", "currentPlanGroup", "", "Lcom/marrow/data/models/plan/PlanGroup;", "getCurrentPlanGroup", "()[Lcom/marrow/data/models/plan/PlanGroup;", "setCurrentPlanGroup", "([Lcom/marrow/data/models/plan/PlanGroup;)V", "[Lcom/marrow/data/models/plan/PlanGroup;", "currentCoupon", "Lcom/marrow/data/api/models/response/plan/Coupon;", "getCurrentCoupon", "()Lcom/marrow/data/api/models/response/plan/Coupon;", "setCurrentCoupon", "(Lcom/marrow/data/api/models/response/plan/Coupon;)V", "planUnderPaymentProcess", "Lcom/marrow/data/models/plan/Plan;", "appliedNormalCoupon", "appliedReferralCoupon", "userStartTimeInMillis", "", "Ljava/lang/Long;", "userEndTimeInMillis", "screenType", "", "addOns", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "analyticPublisher", "Lcom/marrow/analytics/IAnalyticPublisher;", "UPDATE_COLLEGE_DETAILS", "", "stickyLoadingDialog", "Landroid/app/Dialog;", "getToolbarView", "Landroidx/appcompat/widget/Toolbar;", "getLayoutId", "jusPaySource", "Lcom/marrow/ui/activities/plan/source/JusPaySourceImpl;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "applyEdgeToEdgeInsets", "onStart", "onBackPressed", "loadBuynowFragment", "onPaymentSuccess", "paymentId", "onPaymentError", "code", "response", "onSaveInstanceState", "outState", "onRestoreInstanceState", "startPayment", "plan", "coupon", "rfCoupon", "planSelectReceiver", "com/marrow/ui/activities/plan/PlanActivity$planSelectReceiver$1", "Lcom/marrow/ui/activities/plan/PlanActivity$planSelectReceiver$1;", "eventBroadcastReceiver", "com/marrow/ui/activities/plan/PlanActivity$eventBroadcastReceiver$1", "Lcom/marrow/ui/activities/plan/PlanActivity$eventBroadcastReceiver$1;", "confirmationButtonTapReceiver", "com/marrow/ui/activities/plan/PlanActivity$confirmationButtonTapReceiver$1", "Lcom/marrow/ui/activities/plan/PlanActivity$confirmationButtonTapReceiver$1;", "getLocalReceivers", "Lcom/marrow/receivers/BaseReceiver;", "()[Lcom/marrow/receivers/BaseReceiver;", "onPaymentStarted", "options", "Lorg/json/JSONObject;", "showStickyLoadingDialog", "hideStickyLoadingDialog", "startJusPayPayment", "sdkPayload", "Lcom/marrow/data/api/models/response/payment/SdkPayload;", "recordEvent", "collegeYear", "openInitialUserActivity", "showUpdateDialog", "performClipboardOperation", "orderId", "performAnalytics", "retryPaymentValidation", "gateway", "attemptNo", "initiateUserSyncAndMoveToPostPayment", "subscriptionList", "Lcom/marrow/data/models/plan/Subscription;", "([Lcom/marrow/data/models/plan/Subscription;Ljava/lang/String;I)V", "showPaymentDelayedDialog", "validatePaymentWithServer", "performErrorAnalytics", "errorCode", "jsonObjectString", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PlanActivity extends WebvttCueInfo<PlanContract.Presenter> implements PaymentResultListener, PlanContract.View {
    private static /* synthetic */ isResolutionNotSupported<Object>[] IconCompatParcelizer;
    public static final AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;
    private static char[] onMediaButtonEvent;
    private static long onPlayFromMediaId;
    private static char[] onPlayFromSearch;
    private static boolean onPrepare;
    private static boolean onPrepareFromMediaId;
    private static int onPrepareFromSearch;
    private static int onRewind;
    private Coupon MediaBrowserCompatCustomActionResultReceiver;
    private Coupon MediaBrowserCompatMediaItem;
    private String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private PlanGroup[] MediaMetadataCompat;
    private Coupon RatingCompat;
    private Plan onCommand;
    private deriveMaxSize onCustomAction;
    private Long onFastForward;
    private Dialog onPause;
    private Long onPlay;
    private onRebuffer write;
    private static final byte[] $$B = {14, -40, -35, 110};
    private static final int $$C = 239;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {3, -120, 17, 23, -30, -19, -13, -16, 4, 25, -45, -28, 0, -17, -10, 32, -55, -9, -14, 4, -30, 25, -28, -28, 4, -13, -18, -8, -28, 10, -24, TarConstants.LF_FIFO, -35, -58, -2, -11, 14, -29, -13, -17, -3, -20, -17, 36, -52, 0, -26, -18, -2, -15, 0, -17, -10, 24, -37, -31, 43, -41, -13, -16, -8, 41, -6, -2, -22, 4, TarConstants.LF_FIFO, -68, -9, -26, 35, -52, -10, -17, 22, -33, -28, 10, 5, -36, -6, -22, 69, -57, -30, -19, -13, -16, 4, 25, -45, -28, 0, -17, -10, 32, -55, -9, -14, 4, -30, 25, -28, -28, 4, -13, -18, -8, -28, 10, -24, 8};
    private static final int $$t = 88;
    private static final byte[] $$j = {TarConstants.LF_CHR, -23, 108, 101, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$k = 198;
    private static int onPrepareFromUri = 0;
    private static int onPlayFromUri = 0;
    private static int onRemoveQueueItemAt = 1;
    private final setSessionInfo MediaDescriptionCompat = parseTrackTiming.write(this, SessionDescriptionParser.RemoteActionCompatParcelizer(), new MediaBrowserCompatItemReceiver());
    private ArrayList<String> AudioAttributesCompatParcelizer = new ArrayList<>();
    private final int read = 102;
    private final RemoteActionCompatParcelizer onAddQueueItem = new RemoteActionCompatParcelizer();
    private final write handleMediaPlayPauseIfPendingOnHandler = new write();
    private final read MediaBrowserCompatSearchResultReceiver = new read();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$D(short r6, int r7, short r8) {
        /*
            int r6 = r6 * 2
            int r6 = 101 - r6
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r0 = com.marrow.ui.activities.plan.PlanActivity.$$B
            int r8 = r8 * 2
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r6 = r8
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r7]
        L27:
            int r7 = r7 + 1
            int r6 = r6 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.plan.PlanActivity.$$D(short, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void o(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.marrow.ui.activities.plan.PlanActivity.$$j
            int r7 = r7 + 65
            int r1 = r8 + 4
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = -1
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            r9[r7] = r6
            return
        L23:
            r4 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L29:
            int r7 = -r7
            int r6 = r6 + 1
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.plan.PlanActivity.o(short, int, int, java.lang.Object[]):void");
    }

    private static void p(byte b, byte b2, short s, Object[] objArr) {
        byte[] bArr = $$s;
        int i = 119 - s;
        int i2 = b2 + 4;
        byte[] bArr2 = new byte[47 - b];
        int i3 = 46 - b;
        int i4 = -1;
        if (bArr == null) {
            i = (i + (-i3)) - 11;
            i2++;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            if (i4 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i = (i + (-bArr[i2])) - 11;
                i2++;
            }
        }
    }

    public static /* synthetic */ Object read(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        handlePreambleAddressCode[] handlepreambleaddresscodeArr;
        int i7 = ~(i5 | i2 | i6);
        int i8 = ~i2;
        int i9 = (~(i8 | i6)) | (~((~i6) | i5));
        int i10 = (~(i6 | (~i5))) | i8;
        int i11 = i5 + i2 + i + ((-2044576983) * i3) + (1743660113 * i4);
        int i12 = i11 * i11;
        int i13 = ((1047202342 * i5) - 713031680) + (164951516 * i2) + (i7 * 441125413) + (441125413 * i9) + ((-441125413) * i10) + (606076928 * i) + (689963008 * i3) + ((-299892736) * i4) + ((-1081737216) * i12);
        int i14 = ((i5 * 2048727874) - 782056376) + (i2 * 2048728756) + (i7 * (-441)) + (i9 * (-441)) + (i10 * 441) + (i * 2048728315) + (i3 * 2142076211) + (i4 * (-1448904853)) + (i12 * 1885470720);
        switch (i13 + (i14 * i14 * (-1618345984))) {
            case 1:
                PlanActivity planActivity = (PlanActivity) objArr[0];
                String str = (String) objArr[1];
                int iIntValue = ((Number) objArr[2]).intValue();
                int iIntValue2 = ((Number) objArr[3]).intValue();
                int i15 = 2 % 2;
                toMagicModuleMetaRepoModel.write(str, "");
                planActivity.onPlayFromSearch();
                C0201setMcqCount.IconCompatParcelizer(getInternalName.RemoteActionCompatParcelizer(planActivity), null, null, new IconCompatParcelizer(iIntValue2, planActivity, str, iIntValue, null), 3);
                int i16 = onRemoveQueueItemAt + 95;
                onPlayFromUri = i16 % 128;
                int i17 = i16 % 2;
                return null;
            case 2:
                PlanActivity planActivity2 = (PlanActivity) objArr[0];
                int i18 = 2 % 2;
                int i19 = onPlayFromUri + 123;
                onRemoveQueueItemAt = i19 % 128;
                if (i19 % 2 == 0) {
                    handlepreambleaddresscodeArr = new handlePreambleAddressCode[2];
                    handlepreambleaddresscodeArr[1] = planActivity2.onAddQueueItem;
                    handlepreambleaddresscodeArr[1] = planActivity2.handleMediaPlayPauseIfPendingOnHandler;
                    handlepreambleaddresscodeArr[4] = planActivity2.MediaBrowserCompatSearchResultReceiver;
                } else {
                    handlepreambleaddresscodeArr = new handlePreambleAddressCode[]{planActivity2.onAddQueueItem, planActivity2.handleMediaPlayPauseIfPendingOnHandler, planActivity2.MediaBrowserCompatSearchResultReceiver};
                }
                return handlepreambleaddresscodeArr;
            case 3:
                Context context = (Context) objArr[0];
                String str2 = (String) objArr[1];
                int i20 = 2 % 2;
                int i21 = onRemoveQueueItemAt + 49;
                onPlayFromUri = i21 % 128;
                int i22 = i21 % 2;
                Intent intentWrite = AudioAttributesCompatParcelizer.write(context, str2);
                int i23 = onPlayFromUri + 101;
                onRemoveQueueItemAt = i23 % 128;
                int i24 = i23 % 2;
                return intentWrite;
            case 4:
                return write(objArr);
            case 5:
                return IconCompatParcelizer(objArr);
            case 6:
                return read(objArr);
            case 7:
                return RemoteActionCompatParcelizer(objArr);
            case 8:
                return AudioAttributesImplApi26Parcelizer(objArr);
            case 9:
                return MediaBrowserCompatItemReceiver(objArr);
            default:
                PlanActivity planActivity3 = (PlanActivity) objArr[0];
                int i25 = 2 % 2;
                planActivity3.RemoteActionCompatParcelizer();
                canSelectFormat canselectformat = new canSelectFormat(planActivity3, planActivity3.MediaBrowserCompatItemReceiver(), planActivity3.read);
                canselectformat.write((String) shouldEvaluateQueueSize.IconCompatParcelizer(new Object[]{canselectformat, Integer.valueOf(R.string.btn_continue)}, HlsChunkSourceSegmentBaseHolder.write(), HlsChunkSourceSegmentBaseHolder.write(), -1090992228, 1090992228, HlsChunkSourceSegmentBaseHolder.write(), HlsChunkSourceSegmentBaseHolder.write()));
                planActivity3.AudioAttributesImplApi21Parcelizer = canselectformat;
                planActivity3.AudioAttributesImplApi21Parcelizer.show();
                int i26 = onPlayFromUri + 69;
                onRemoveQueueItemAt = i26 % 128;
                int i27 = i26 % 2;
                return null;
        }
    }

    public static final /* synthetic */ int IconCompatParcelizer(PlanActivity planActivity) {
        int i = 2 % 2;
        int i2 = onPlayFromUri;
        int i3 = i2 + 123;
        onRemoveQueueItemAt = i3 % 128;
        int i4 = i3 % 2;
        int i5 = planActivity.read;
        if (i4 == 0) {
            int i6 = 41 / 0;
        }
        int i7 = i2 + 99;
        onRemoveQueueItemAt = i7 % 128;
        int i8 = i7 % 2;
        return i5;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        PlanActivity planActivity = (PlanActivity) objArr[0];
        Plan plan = (Plan) objArr[1];
        Coupon coupon = (Coupon) objArr[2];
        Coupon coupon2 = (Coupon) objArr[3];
        ArrayList<String> arrayList = (ArrayList) objArr[4];
        int i = 2 % 2;
        int i2 = onPlayFromUri + 81;
        onRemoveQueueItemAt = i2 % 128;
        int i3 = i2 % 2;
        planActivity.AudioAttributesCompatParcelizer(plan, coupon, coupon2, arrayList);
        if (i3 == 0) {
            int i4 = 69 / 0;
        }
        int i5 = onPlayFromUri + 113;
        onRemoveQueueItemAt = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    public static final /* synthetic */ Dialog read(PlanActivity planActivity) {
        int i = 2 % 2;
        int i2 = onRemoveQueueItemAt + 19;
        onPlayFromUri = i2 % 128;
        int i3 = i2 % 2;
        Dialog dialog = planActivity.AudioAttributesImplApi21Parcelizer;
        int i4 = onRemoveQueueItemAt + 51;
        onPlayFromUri = i4 % 128;
        int i5 = i4 % 2;
        return dialog;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object MediaBrowserCompatItemReceiver(Object[] objArr) {
        PlanActivity planActivity = (PlanActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onRemoveQueueItemAt + 83;
        onPlayFromUri = i2 % 128;
        int i3 = i2 % 2;
        parseSelectionFlagsFromDashRoleScheme parseselectionflagsfromdashrolescheme = (parseSelectionFlagsFromDashRoleScheme) planActivity.MediaDescriptionCompat.read(planActivity, IconCompatParcelizer[0]);
        int i4 = onRemoveQueueItemAt + 85;
        onPlayFromUri = i4 % 128;
        if (i4 % 2 == 0) {
            return parseselectionflagsfromdashrolescheme;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final class MediaBrowserCompatItemReceiver implements getAnswerMap<PlanActivity, parseSelectionFlagsFromDashRoleScheme> {
        private static parseSelectionFlagsFromDashRoleScheme read(PlanActivity planActivity) {
            toMagicModuleMetaRepoModel.write(planActivity, "");
            return parseSelectionFlagsFromDashRoleScheme.IconCompatParcelizer(SessionDescriptionParser.AudioAttributesCompatParcelizer(planActivity));
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [o.getApplicationLabel, o.parseSelectionFlagsFromDashRoleScheme] */
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ parseSelectionFlagsFromDashRoleScheme invoke(PlanActivity planActivity) {
            return read(planActivity);
        }
    }

    public final void RemoteActionCompatParcelizer(PlanGroup[] planGroupArr) {
        int i = 2 % 2;
        int i2 = onRemoveQueueItemAt;
        int i3 = i2 + 123;
        onPlayFromUri = i3 % 128;
        int i4 = i3 % 2;
        this.MediaMetadataCompat = planGroupArr;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 37;
        onPlayFromUri = i5 % 128;
        int i6 = i5 % 2;
    }

    public final PlanGroup[] onFastForward() {
        int i = 2 % 2;
        int i2 = onRemoveQueueItemAt + 19;
        int i3 = i2 % 128;
        onPlayFromUri = i3;
        int i4 = i2 % 2;
        PlanGroup[] planGroupArr = this.MediaMetadataCompat;
        int i5 = i3 + 121;
        onRemoveQueueItemAt = i5 % 128;
        if (i5 % 2 != 0) {
            return planGroupArr;
        }
        throw null;
    }

    public final Coupon onCustomAction() {
        int i = 2 % 2;
        int i2 = onRemoveQueueItemAt + 3;
        int i3 = i2 % 128;
        onPlayFromUri = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Coupon coupon = this.RatingCompat;
        int i4 = i3 + 1;
        onRemoveQueueItemAt = i4 % 128;
        int i5 = i4 % 2;
        return coupon;
    }

    public final void read(Coupon coupon) {
        int i = 2 % 2;
        int i2 = onRemoveQueueItemAt + 5;
        onPlayFromUri = i2 % 128;
        int i3 = i2 % 2;
        this.RatingCompat = coupon;
        if (i3 != 0) {
            int i4 = 67 / 0;
        }
    }

    @Override // kotlin.convertMessageToByteArray
    public final Toolbar onCommand() {
        int i = 2 % 2;
        int i2 = onRemoveQueueItemAt + 47;
        onPlayFromUri = i2 % 128;
        int i3 = i2 % 2;
        int i4 = RtpDataLoadable.read();
        Toolbar toolbarIconCompatParcelizer = ((parseSelectionFlagsFromDashRoleScheme) read(RtpDataLoadable.read(), -595022971, RtpDataLoadable.read(), new Object[]{this}, RtpDataLoadable.read(), 595022980, i4)).AudioAttributesCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(toolbarIconCompatParcelizer, "");
        int i5 = onPlayFromUri + 7;
        onRemoveQueueItemAt = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 51 / 0;
        }
        return toolbarIconCompatParcelizer;
    }

    private static void n(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i4 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(onMediaButtonEvent[i2 + i4])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 36620), 2341 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 28 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 480654850, false, $$D(b, b2, b2), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(onPlayFromMediaId), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) Drawable.resolveOpacity(0, 0), (Process.myTid() >> 22) + 9701, 26 - View.MeasureSpec.makeMeasureSpec(0, 0), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {downloadService, downloadService};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) KeyEvent.normalizeMetaState(0), 23783 - TextUtils.lastIndexOf("", '0', 0, 0), 34 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        char[] cArr = new char[i];
        downloadService.write = 0;
        int i5 = $11 + 67;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (downloadService.write < i) {
            int i7 = $11 + 53;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            try {
                Object[] objArr5 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) Color.red(0), Drawable.resolveOpacity(0, 0) + 23784, (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 32, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr);
    }

    private static void m(char[] cArr, byte[] bArr, int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = onPlayFromSearch;
        char c = '0';
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 115;
                $11 = i6 % 128;
                if (i6 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf("", c) + 44863), (ViewConfiguration.getFadingEdgeLength() >> 16) + 18944, 27 - TextUtils.indexOf("", c), -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        i5 >>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-298077624);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 44861), 18944 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 28 - TextUtils.getCapsMode("", 0, 0), -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                        i5++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i3 = 2;
                c = '0';
            }
            cArr2 = cArr3;
        }
        try {
            Object[] objArr4 = {Integer.valueOf(onPrepareFromSearch)};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(680566917);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), 19034 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 75 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1457087504, false, "r", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
            try {
                if (onPrepareFromMediaId) {
                    int i7 = $11 + 123;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
                    char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                    notifydownloads.IconCompatParcelizer = 0;
                    while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                        int i9 = $11 + 15;
                        $10 = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = notifydownloads.IconCompatParcelizer;
                            int i11 = notifydownloads.AudioAttributesCompatParcelizer;
                            cArr4[i10] = (char) (cArr2[bArr[0 / notifydownloads.IconCompatParcelizer] << i] / iIntValue);
                            Object[] objArr5 = {notifydownloads, notifydownloads};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), TextUtils.lastIndexOf("", '0', 0, 0) + 11440, View.MeasureSpec.makeMeasureSpec(0, 0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                        } else {
                            cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                            Object[] objArr6 = {notifydownloads, notifydownloads};
                            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                            if (objRemoteActionCompatParcelizer5 == null) {
                                objRemoteActionCompatParcelizer5 = startForeground.read((char) TextUtils.getTrimmedLength(""), 11439 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                            }
                            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
                        }
                    }
                    objArr[0] = new String(cArr4);
                    return;
                }
                if (!onPrepare) {
                    notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
                    char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                    notifydownloads.IconCompatParcelizer = 0;
                    while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                        int i12 = $10 + 77;
                        $11 = i12 % 128;
                        if (i12 % 2 == 0) {
                            cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[notifydownloads.AudioAttributesCompatParcelizer * notifydownloads.IconCompatParcelizer] >>> i] / iIntValue);
                            i2 = notifydownloads.IconCompatParcelizer >> 1;
                        } else {
                            cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                            i2 = notifydownloads.IconCompatParcelizer + 1;
                        }
                        notifydownloads.IconCompatParcelizer = i2;
                    }
                    objArr[0] = new String(cArr5);
                    return;
                }
                notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
                char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 0;
                while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                    int i13 = $10 + 53;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                    Object[] objArr7 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        objRemoteActionCompatParcelizer6 = startForeground.read((char) Color.blue(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 11439, (ViewConfiguration.getFadingEdgeLength() >> 16) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
                }
                objArr[0] = new String(cArr6);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        } catch (Throwable th4) {
            Throwable cause4 = th4.getCause();
            if (cause4 == null) {
                throw th4;
            }
            throw cause4;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object write(java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2238
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.plan.PlanActivity.write(java.lang.Object[]):java.lang.Object");
    }

    public static final class RemoteActionCompatParcelizer extends isNewSubtitleDataAvailable {
        RemoteActionCompatParcelizer() {
        }

        @Override // kotlin.isNewSubtitleDataAvailable
        public final void write(Context context, PlanGroup planGroup, Coupon coupon, Coupon coupon2, boolean z, String str, boolean z2) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(planGroup, "");
            getPositionAnchor.write writeVar = getPositionAnchor.AudioAttributesCompatParcelizer;
            getPositionAnchor getpositionanchor = getPositionAnchor.write.read(planGroup, coupon, coupon2, z, str);
            PlanContract.Presenter presenter = (PlanContract.Presenter) PlanActivity.this.getMPresenter();
            Plan defaultPlan = planGroup.getDefaultPlan(coupon);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(defaultPlan, "");
            presenter.read(defaultPlan, z2);
            PlanActivity.this.read(getpositionanchor);
        }

        @Override // kotlin.isNewSubtitleDataAvailable
        public final void IconCompatParcelizer(Context context, Plan plan, Coupon coupon, Coupon coupon2, ArrayList<String> arrayList) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(plan, "");
            toMagicModuleMetaRepoModel.write(arrayList, "");
            getLatestBitrateEstimate.read.RemoteActionCompatParcelizer(plan);
            PlanActivity.read(RtpDataLoadable.read(), -1777941204, RtpDataLoadable.read(), new Object[]{PlanActivity.this, plan, coupon, coupon2, arrayList}, RtpDataLoadable.read(), 1777941211, RtpDataLoadable.read());
        }

        @Override // kotlin.isNewSubtitleDataAvailable, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static final class write extends isSpecialNorthAmericanChar {
        write() {
        }

        @Override // kotlin.isSpecialNorthAmericanChar
        public final void RemoteActionCompatParcelizer(String str, String str2) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "PlanListFragmentNew", (Object) str) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "learn_more_event", (Object) str2)) {
                PlanActivity planActivity = PlanActivity.this;
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
                planActivity.startActivity(AudioAttributesCompatParcelizer.IconCompatParcelizer(PlanActivity.this));
            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "initial_user_screen", (Object) str) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "update_user_details", (Object) str2)) {
                PlanActivity.read(RtpDataLoadable.read(), 438280715, RtpDataLoadable.read(), new Object[]{PlanActivity.this}, RtpDataLoadable.read(), -438280715, RtpDataLoadable.read());
            }
        }

        @Override // kotlin.isSpecialNorthAmericanChar, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static final class read extends isExtendedWestEuropeanChar {
        read() {
        }

        @Override // kotlin.isExtendedWestEuropeanChar
        public final void write(Context context, int i, int i2) {
            toMagicModuleMetaRepoModel.write(context, "");
            if (i == PlanActivity.IconCompatParcelizer(PlanActivity.this)) {
                PlanActivity.this.onPlayFromMediaId();
            } else if (i == 14) {
                PlanActivity.read(PlanActivity.this).hide();
            }
        }

        @Override // kotlin.isExtendedWestEuropeanChar, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    private static final getShowPopup RemoteActionCompatParcelizer(PlanActivity planActivity) {
        int i = 2 % 2;
        int i2 = onPlayFromUri + 113;
        onRemoveQueueItemAt = i2 % 128;
        if (i2 % 2 != 0) {
            planActivity.onPlay();
            return getShowPopup.INSTANCE;
        }
        planActivity.onPlay();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0003¢\u0006\u0004\b\n\u0010\u000bJ)\u0010\f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\r\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u000eJ!\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000eJ)\u0010\u0011\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0011\u0010\u000b"}, d2 = {"Lcom/marrow/ui/activities/plan/PlanActivity$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "Landroid/content/Intent;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;", "AudioAttributesCompatParcelizer", "read", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;", "IconCompatParcelizer", "(Landroid/content/Context;)Landroid/content/Intent;", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer {
        public static int AudioAttributesCompatParcelizer;
        public static int read;

        private AudioAttributesCompatParcelizer() {
        }

        @getMagicModuleMeta
        private static Intent RemoteActionCompatParcelizer(Context p0, String p1, String p2) {
            Intent intent = new Intent(p0, (Class<?>) PlanActivity.class);
            intent.putExtra("screen_type", p1);
            intent.putExtra("android.intent.extra.TITLE", p2);
            return intent;
        }

        @getMagicModuleMeta
        public static Intent AudioAttributesCompatParcelizer(Context p0, String p1, String p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intentRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0, "subscribe", p0.getString(R.string.plan_subscribe));
            intentRemoteActionCompatParcelizer.putExtra("key_intent_origin", p1);
            intentRemoteActionCompatParcelizer.putExtra("key_intent_source", p2);
            return intentRemoteActionCompatParcelizer;
        }

        @getMagicModuleMeta
        public static Intent read(Context p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intentRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0, "subscribe", p0.getString(R.string.plan_subscribe));
            intentRemoteActionCompatParcelizer.putExtra("key_intent_origin", p1);
            intentRemoteActionCompatParcelizer.putExtra("plan_expanded", true);
            intentRemoteActionCompatParcelizer.putExtra("open_default_plan", true);
            return intentRemoteActionCompatParcelizer;
        }

        @getMagicModuleMeta
        public static Intent IconCompatParcelizer(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            zat.Companion audioAttributesCompatParcelizer = zat.INSTANCE;
            return zat.Companion.RemoteActionCompatParcelizer(p0);
        }

        @getMagicModuleMeta
        public static Intent write(Context p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Intent intentRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0, "subscribe", p0.getString(R.string.plan_subscribe));
            intentRemoteActionCompatParcelizer.putExtra("key_coupon", p1);
            intentRemoteActionCompatParcelizer.putExtra("plan_expanded", true);
            return intentRemoteActionCompatParcelizer;
        }

        @getMagicModuleMeta
        public static Intent RemoteActionCompatParcelizer(Context p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Intent intentRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0, "subscribe", p0.getString(R.string.plan_subscribe));
            intentRemoteActionCompatParcelizer.putExtra("key_disc_coupon", p1);
            intentRemoteActionCompatParcelizer.putExtra("plan_expanded", true);
            return intentRemoteActionCompatParcelizer;
        }

        @getMagicModuleMeta
        public final Intent write(Context p0, String p1, String p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            Intent intentRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0, p1);
            intentRemoteActionCompatParcelizer.putExtra("plan_id", p2);
            return intentRemoteActionCompatParcelizer;
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        public static int IconCompatParcelizer() {
            int i = read;
            int i2 = i % 9319793;
            read = i + 1;
            if (i2 != 0) {
                return AudioAttributesCompatParcelizer;
            }
            int iNextInt = new Random().nextInt(2025333911);
            AudioAttributesCompatParcelizer = iNextInt;
            return iNextInt;
        }
    }

    private static final getShowPopup RemoteActionCompatParcelizer(PlanActivity planActivity, String str) {
        int i = 2 % 2;
        int i2 = onRemoveQueueItemAt + 63;
        onPlayFromUri = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            planActivity.IconCompatParcelizer(str);
            planActivity.AudioAttributesCompatParcelizer(str, 4);
        } else {
            toMagicModuleMetaRepoModel.write(str, "");
            planActivity.IconCompatParcelizer(str);
            planActivity.AudioAttributesCompatParcelizer(str, 2);
        }
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i3 = onPlayFromUri + 37;
        onRemoveQueueItemAt = i3 % 128;
        if (i3 % 2 != 0) {
            return getshowpopup;
        }
        throw null;
    }

    private static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(PlanActivity planActivity) {
        getShowPopup getshowpopup;
        int i = 2 % 2;
        int i2 = onPlayFromUri + 75;
        onRemoveQueueItemAt = i2 % 128;
        if (i2 % 2 == 0) {
            planActivity.MediaBrowserCompatMediaItem();
            getshowpopup = getShowPopup.INSTANCE;
            int i3 = 3 / 0;
        } else {
            planActivity.MediaBrowserCompatMediaItem();
            getshowpopup = getShowPopup.INSTANCE;
        }
        int i4 = onPlayFromUri + 123;
        onRemoveQueueItemAt = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    private static final getShowPopup AudioAttributesCompatParcelizer(PlanActivity planActivity, String str) {
        int i = 2 % 2;
        int i2 = onRemoveQueueItemAt + 35;
        onPlayFromUri = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        planActivity.AudioAttributesCompatParcelizer(str);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = onPlayFromUri + 53;
        onRemoveQueueItemAt = i4 % 128;
        if (i4 % 2 != 0) {
            return getshowpopup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getShowPopup read(PlanActivity planActivity, int i, String str) {
        int i2 = 2 % 2;
        int i3 = onPlayFromUri + 25;
        onRemoveQueueItemAt = i3 % 128;
        int i4 = i3 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        read(RtpDataLoadable.read(), -1389656763, RtpDataLoadable.read(), new Object[]{planActivity, Integer.valueOf(i), str}, RtpDataLoadable.read(), 1389656771, RtpDataLoadable.read());
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i5 = onPlayFromUri + 107;
        onRemoveQueueItemAt = i5 % 128;
        int i6 = i5 % 2;
        return getshowpopup;
    }

    private static final getShowPopup MediaBrowserCompatItemReceiver(PlanActivity planActivity, String str) {
        int i = 2 % 2;
        int i2 = onRemoveQueueItemAt + 71;
        onPlayFromUri = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        DefaultTrackSelectorExternalSyntheticLambda0.Companion readVar = DefaultTrackSelectorExternalSyntheticLambda0.INSTANCE;
        DefaultTrackSelectorExternalSyntheticLambda0.Companion.write(str).show(planActivity.getSupportFragmentManager(), "payment_failure_dialog");
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = onRemoveQueueItemAt + 83;
        onPlayFromUri = i4 % 128;
        if (i4 % 2 == 0) {
            return getshowpopup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void onPrepareFromSearch() {
        int i = 2 % 2;
        int i2 = onPlayFromUri + 51;
        onRemoveQueueItemAt = i2 % 128;
        int i3 = i2 % 2;
        int i4 = RtpDataLoadable.read();
        Toolbar toolbarIconCompatParcelizer = ((parseSelectionFlagsFromDashRoleScheme) read(RtpDataLoadable.read(), -595022971, RtpDataLoadable.read(), new Object[]{this}, RtpDataLoadable.read(), 595022980, i4)).AudioAttributesCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(toolbarIconCompatParcelizer, "");
        getHttpMethodString.read((View) toolbarIconCompatParcelizer, true, false, true, true, 0, 50);
        int i5 = RtpDataLoadable.read();
        FrameLayout frameLayout = ((parseSelectionFlagsFromDashRoleScheme) read(RtpDataLoadable.read(), -595022971, RtpDataLoadable.read(), new Object[]{this}, RtpDataLoadable.read(), 595022980, i5)).IconCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        getHttpMethodString.read((View) frameLayout, false, true, true, true, 0, 49);
        int i6 = onRemoveQueueItemAt + 107;
        onPlayFromUri = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // kotlin.WebvttCueInfo, kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        super.onStart();
        this.onFastForward = Long.valueOf(new Date().getTime());
        int i2 = onRemoveQueueItemAt + 119;
        onPlayFromUri = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 54 / 0;
        }
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = onPlayFromUri + 65;
        int i3 = i2 % 128;
        onRemoveQueueItemAt = i3;
        int i4 = i2 % 2;
        deriveMaxSize derivemaxsize = this.onCustomAction;
        if (derivemaxsize == null) {
            int i5 = i3 + 87;
            onPlayFromUri = i5 % 128;
            int i6 = i5 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            derivemaxsize = null;
        }
        if (derivemaxsize.AudioAttributesCompatParcelizer()) {
            return;
        }
        super.onBackPressed();
    }

    private final void setSessionImpl() {
        boolean booleanExtra;
        boolean booleanExtra2;
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        String stringExtra4;
        String str;
        int i = 2 % 2;
        Intent intent = getIntent();
        if (intent != null) {
            stringExtra = intent.getStringExtra("key_coupon");
            stringExtra2 = intent.getStringExtra("key_disc_coupon");
            stringExtra3 = intent.getStringExtra("key_intent_origin");
            String stringExtra5 = intent.getStringExtra("key_intent_source");
            str = stringExtra5;
            booleanExtra = intent.getBooleanExtra("plan_expanded", false);
            stringExtra4 = intent.getStringExtra("plan_id");
            booleanExtra2 = intent.getBooleanExtra("open_default_plan", false);
        } else {
            int i2 = onPlayFromUri + 123;
            onRemoveQueueItemAt = i2 % 128;
            int i3 = i2 % 2;
            booleanExtra = false;
            booleanExtra2 = false;
            stringExtra = null;
            stringExtra2 = null;
            stringExtra3 = null;
            stringExtra4 = null;
            str = null;
        }
        CueDecoder.Companion audioAttributesCompatParcelizer = CueDecoder.INSTANCE;
        AudioAttributesCompatParcelizer(CueDecoder.Companion.IconCompatParcelizer(stringExtra, stringExtra2, stringExtra3, booleanExtra, stringExtra4, booleanExtra2, str));
        int i4 = onRemoveQueueItemAt + 53;
        onPlayFromUri = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.razorpay.PaymentResultListener
    public final void onPaymentSuccess(String paymentId) {
        int i;
        int i2 = 2 % 2;
        int i3 = onPlayFromUri + 107;
        onRemoveQueueItemAt = i3 % 128;
        if (i3 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(paymentId, "");
            IconCompatParcelizer(paymentId);
            i = 0;
        } else {
            toMagicModuleMetaRepoModel.write(paymentId, "");
            IconCompatParcelizer(paymentId);
            i = 1;
        }
        AudioAttributesCompatParcelizer(paymentId, i);
    }

    @Override // com.razorpay.PaymentResultListener
    public final void onPaymentError(int code, String response) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(response, "");
        read(RtpDataLoadable.read(), -1389656763, RtpDataLoadable.read(), new Object[]{this, Integer.valueOf(code), response}, RtpDataLoadable.read(), 1389656771, RtpDataLoadable.read());
        if (code != 0) {
            int i2 = onRemoveQueueItemAt + 49;
            onPlayFromUri = i2 % 128;
            if (i2 % 2 == 0 ? code != 5 : code != 4) {
                write(new ResponseError(code, response, false, 4, null));
                return;
            }
        }
        AudioAttributesCompatParcelizer("Payment Cancelled");
        int i3 = onRemoveQueueItemAt + 95;
        onPlayFromUri = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onSaveInstanceState(Bundle outState) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(outState, "");
        Plan plan = this.onCommand;
        Object obj = null;
        if (plan != null) {
            int i2 = onPlayFromUri + 93;
            onRemoveQueueItemAt = i2 % 128;
            if (i2 % 2 == 0) {
                toMagicModuleMetaRepoModel.write(plan);
                String string = plan.toJSON().toString();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                outState.putString("ss_plan", string);
                obj.hashCode();
                throw null;
            }
            toMagicModuleMetaRepoModel.write(plan);
            String string2 = plan.toJSON().toString();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
            outState.putString("ss_plan", string2);
        }
        Coupon coupon = this.MediaBrowserCompatCustomActionResultReceiver;
        if (coupon != null) {
            int i3 = onRemoveQueueItemAt + 105;
            onPlayFromUri = i3 % 128;
            int i4 = i3 % 2;
            toMagicModuleMetaRepoModel.write(coupon);
            String string3 = coupon.toJSON().toString();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
            outState.putString("coupon", string3);
        }
        Coupon coupon2 = this.MediaBrowserCompatMediaItem;
        if (coupon2 != null) {
            int i5 = onRemoveQueueItemAt + 105;
            onPlayFromUri = i5 % 128;
            if (i5 % 2 != 0) {
                toMagicModuleMetaRepoModel.write(coupon2);
                String string4 = coupon2.toJSON().toString();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
                outState.putString("rf_coupon", string4);
                obj.hashCode();
                throw null;
            }
            toMagicModuleMetaRepoModel.write(coupon2);
            String string5 = coupon2.toJSON().toString();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string5, "");
            outState.putString("rf_coupon", string5);
        }
        super.onSaveInstanceState(outState);
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, android.app.Activity
    public final void onRestoreInstanceState(Bundle savedInstanceState) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(savedInstanceState, "");
        super.onRestoreInstanceState(savedInstanceState);
        String string = savedInstanceState.getString("ss_plan");
        String string2 = savedInstanceState.getString("coupon");
        String string3 = savedInstanceState.getString("rf_coupon");
        String str = string;
        if (str != null) {
            int i2 = onRemoveQueueItemAt + 109;
            onPlayFromUri = i2 % 128;
            int i3 = i2 % 2;
            if (str.length() != 0) {
                Plan plan = new Plan();
                this.onCommand = plan;
                plan.fromJSON(string);
            }
        }
        String str2 = string2;
        if (str2 != null) {
            int i4 = onRemoveQueueItemAt + 101;
            onPlayFromUri = i4 % 128;
            int i5 = i4 % 2;
            if (str2.length() != 0) {
                Coupon coupon = new Coupon();
                this.MediaBrowserCompatCustomActionResultReceiver = coupon;
                coupon.fromJSON(string2);
            }
        }
        String str3 = string3;
        if (str3 == null || str3.length() == 0) {
            return;
        }
        Coupon coupon2 = new Coupon();
        this.MediaBrowserCompatMediaItem = coupon2;
        coupon2.fromJSON(string3);
    }

    private final void AudioAttributesCompatParcelizer(Plan plan, Coupon coupon, Coupon coupon2, ArrayList<String> arrayList) {
        int i = 2 % 2;
        int i2 = onPlayFromUri + 81;
        onRemoveQueueItemAt = i2 % 128;
        int i3 = i2 % 2;
        this.onCommand = plan;
        this.MediaBrowserCompatCustomActionResultReceiver = coupon;
        this.MediaBrowserCompatMediaItem = coupon2;
        this.AudioAttributesCompatParcelizer = arrayList;
        ((PlanContract.Presenter) getMPresenter()).write(plan, coupon, coupon2, arrayList);
        int i4 = onRemoveQueueItemAt + 73;
        onPlayFromUri = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ int AudioAttributesCompatParcelizer;
        private int IconCompatParcelizer;
        private /* synthetic */ PlanActivity RemoteActionCompatParcelizer;
        private /* synthetic */ int read;
        private /* synthetic */ String write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                long j = this.AudioAttributesCompatParcelizer;
                this.IconCompatParcelizer = 1;
                if (setCountry.IconCompatParcelizer(j * C.DEFAULT_MAX_SEEK_TO_PREVIOUS_POSITION_MS, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            ((PlanContract.Presenter) this.RemoteActionCompatParcelizer.getMPresenter()).IconCompatParcelizer(this.write, this.read);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(int i, PlanActivity planActivity, String str, int i2, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = i;
            this.RemoteActionCompatParcelizer = planActivity;
            this.write = str;
            this.read = i2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, this.write, this.read, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // com.marrow.ui.activities.plan.PlanContract.View
    public final void onPaymentStarted(JSONObject options) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(options, "");
        try {
            new Checkout().open(this, options);
        } catch (Exception e) {
            Toast.makeText(this, "Error in payment: ".concat(String.valueOf(e.getMessage())), 0).show();
            onRebuffer onrebuffer = this.write;
            if (onrebuffer == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                int i2 = onRemoveQueueItemAt + 105;
                onPlayFromUri = i2 % 128;
                int i3 = i2 % 2;
                onrebuffer = null;
            }
            new getPlaylistProtectionSchemes(onrebuffer).AudioAttributesCompatParcelizer(e, "CHECKOUT");
            int i4 = onPlayFromUri + 53;
            onRemoveQueueItemAt = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // com.marrow.ui.activities.plan.PlanContract.View
    public final void onPlayFromSearch() {
        int i = 2 % 2;
        onPlay();
        selectTextTrack selecttexttrack = new selectTextTrack(this, 0, 2, null);
        selecttexttrack.setCancelable(false);
        selecttexttrack.RemoteActionCompatParcelizer();
        selectTextTrack selecttexttrack2 = selecttexttrack;
        this.onPause = selecttexttrack2;
        selecttexttrack2.show();
        int i2 = onPlayFromUri + 103;
        onRemoveQueueItemAt = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // com.marrow.ui.activities.plan.PlanContract.View
    public final void onPlay() {
        int i = 2 % 2;
        Dialog dialog = this.onPause;
        if (dialog == null || dialog == null) {
            return;
        }
        int i2 = onRemoveQueueItemAt + 93;
        onPlayFromUri = i2 % 128;
        if (i2 % 2 != 0) {
            if (dialog.isShowing()) {
                return;
            }
        } else if (!dialog.isShowing()) {
            return;
        }
        Dialog dialog2 = this.onPause;
        if (dialog2 != null) {
            int i3 = onPlayFromUri + 13;
            onRemoveQueueItemAt = i3 % 128;
            int i4 = i3 % 2;
            dialog2.dismiss();
            if (i4 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = onRemoveQueueItemAt + 73;
            onPlayFromUri = i5 % 128;
            if (i5 % 2 != 0) {
                int i6 = 4 / 4;
            }
        }
    }

    @Override // com.marrow.ui.activities.plan.PlanContract.View
    public final void RemoteActionCompatParcelizer(SdkPayload sdkPayload) {
        int i = 2 % 2;
        int i2 = onRemoveQueueItemAt + 59;
        onPlayFromUri = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(sdkPayload, "");
        deriveMaxSize derivemaxsize = this.onCustomAction;
        if (derivemaxsize == null) {
            int i4 = onPlayFromUri + 77;
            onRemoveQueueItemAt = i4 % 128;
            int i5 = i4 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            int i6 = onRemoveQueueItemAt + 41;
            onPlayFromUri = i6 % 128;
            int i7 = i6 % 2;
            derivemaxsize = null;
        }
        derivemaxsize.RemoteActionCompatParcelizer(sdkPayload);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object IconCompatParcelizer(java.lang.Object[] r8) {
        /*
            r0 = 0
            r0 = r8[r0]
            com.marrow.ui.activities.plan.PlanActivity r0 = (com.marrow.ui.activities.plan.PlanActivity) r0
            r1 = 1
            r8 = r8[r1]
            java.lang.String r8 = (java.lang.String) r8
            r2 = 2
            int r3 = r2 % r2
            java.lang.String r3 = ""
            kotlin.toMagicModuleMetaRepoModel.write(r8, r3)
            java.util.Date r4 = new java.util.Date
            r4.<init>()
            long r4 = r4.getTime()
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r0.onPlay = r4
            java.lang.String r4 = r0.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            if (r4 == 0) goto L88
            int r5 = com.marrow.ui.activities.plan.PlanActivity.onPlayFromUri
            int r5 = r5 + 55
            int r6 = r5 % 128
            com.marrow.ui.activities.plan.PlanActivity.onRemoveQueueItemAt = r6
            int r5 = r5 % r2
            java.lang.String r6 = "subscribe"
            if (r5 != 0) goto L39
            boolean r4 = r4.equals(r6)
            if (r4 != r1) goto L88
            goto L3f
        L39:
            boolean r4 = r4.equals(r6)
            if (r4 != r1) goto L88
        L3f:
            java.lang.Long r4 = r0.onPlay
            if (r4 == 0) goto L88
            int r4 = com.marrow.ui.activities.plan.PlanActivity.onRemoveQueueItemAt
            int r5 = r4 + 67
            int r6 = r5 % 128
            com.marrow.ui.activities.plan.PlanActivity.onPlayFromUri = r6
            int r5 = r5 % r2
            java.lang.Long r5 = r0.onFastForward
            if (r5 == 0) goto L88
            int r4 = r4 + r1
            int r1 = r4 % 128
            com.marrow.ui.activities.plan.PlanActivity.onPlayFromUri = r1
            int r4 = r4 % r2
            android.content.Intent r1 = r0.getIntent()
            if (r1 == 0) goto L6d
            int r4 = com.marrow.ui.activities.plan.PlanActivity.onRemoveQueueItemAt
            int r4 = r4 + 103
            int r5 = r4 % 128
            com.marrow.ui.activities.plan.PlanActivity.onPlayFromUri = r5
            int r4 = r4 % r2
            java.lang.String r4 = "key_intent_origin"
            java.lang.String r1 = r1.getStringExtra(r4)
            if (r1 != 0) goto L6f
        L6d:
            java.lang.String r1 = "unknown"
        L6f:
            java.lang.Long r4 = r0.onPlay
            kotlin.toMagicModuleMetaRepoModel.read(r4, r3)
            long r4 = r4.longValue()
            java.lang.Long r0 = r0.onFastForward
            kotlin.toMagicModuleMetaRepoModel.read(r0, r3)
            long r6 = r0.longValue()
            long r4 = r4 - r6
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r6
            o.getLatestBitrateEstimate.write.IconCompatParcelizer(r1, r4, r8)
        L88:
            int r8 = com.marrow.ui.activities.plan.PlanActivity.onRemoveQueueItemAt
            int r8 = r8 + 63
            int r0 = r8 % 128
            com.marrow.ui.activities.plan.PlanActivity.onPlayFromUri = r0
            int r8 = r8 % r2
            r0 = 0
            if (r8 != 0) goto L95
            return r0
        L95:
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.plan.PlanActivity.IconCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    public final void onPlayFromMediaId() {
        Intent intentAudioAttributesCompatParcelizer;
        int i = 2 % 2;
        int i2 = onRemoveQueueItemAt + 85;
        onPlayFromUri = i2 % 128;
        if (i2 % 2 != 0) {
            setWatermarkEnabled.Companion companion = setWatermarkEnabled.INSTANCE;
            intentAudioAttributesCompatParcelizer = setWatermarkEnabled.Companion.AudioAttributesCompatParcelizer(this, false, false, 3);
        } else {
            setWatermarkEnabled.Companion companion2 = setWatermarkEnabled.INSTANCE;
            intentAudioAttributesCompatParcelizer = setWatermarkEnabled.Companion.AudioAttributesCompatParcelizer(this, true, false, 4);
        }
        startActivity(intentAudioAttributesCompatParcelizer);
        int i3 = onRemoveQueueItemAt + 101;
        onPlayFromUri = i3 % 128;
        int i4 = i3 % 2;
    }

    private final void IconCompatParcelizer(String str) {
        String id;
        int i = 2 % 2;
        PlanContract.Presenter presenter = (PlanContract.Presenter) getMPresenter();
        Plan plan = this.onCommand;
        Object obj = null;
        String strRemoteActionCompatParcelizer = PlayerControlViewExternalSyntheticLambda0.RemoteActionCompatParcelizer(plan != null ? plan.getGroupId() : null, "NA");
        Plan plan2 = this.onCommand;
        if (plan2 != null) {
            int i2 = onRemoveQueueItemAt + 45;
            onPlayFromUri = i2 % 128;
            int i3 = i2 % 2;
            id = plan2.getId();
        } else {
            id = null;
        }
        String strIconCompatParcelizer = PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(id);
        Plan plan3 = this.onCommand;
        String strIconCompatParcelizer2 = PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(plan3 != null ? plan3.getPlanDuration() : null);
        Coupon coupon = this.MediaBrowserCompatCustomActionResultReceiver;
        presenter.onPaymentSuccess(str, strRemoteActionCompatParcelizer, strIconCompatParcelizer, strIconCompatParcelizer2, coupon != null && coupon.getCouponType() == 2);
        Plan plan4 = this.onCommand;
        if (plan4 != null) {
            int i4 = onRemoveQueueItemAt + 93;
            onPlayFromUri = i4 % 128;
            if (i4 % 2 == 0) {
                getLatestBitrateEstimate.write.read(plan4.getId(), plan4.getGroupId(), plan4.getDiscountedPrice(this.MediaBrowserCompatCustomActionResultReceiver));
            } else {
                getLatestBitrateEstimate.write.read(plan4.getId(), plan4.getGroupId(), plan4.getDiscountedPrice(this.MediaBrowserCompatCustomActionResultReceiver));
                obj.hashCode();
                throw null;
            }
        }
    }

    @Override // com.marrow.ui.activities.plan.PlanContract.View
    public final void write(Subscription[] subscriptionArr, String str, int i) {
        Toolbar toolbarOnCommand;
        int i2;
        int i3 = 2 % 2;
        toMagicModuleMetaRepoModel.write(subscriptionArr, "");
        toMagicModuleMetaRepoModel.write(str, "");
        PlanActivity planActivity = this;
        startService(new Intent(planActivity, (Class<?>) getAdjustedUpstreamFormat.class));
        updateAndVerifyCurrentChannel.Companion companion = updateAndVerifyCurrentChannel.INSTANCE;
        AudioAttributesCompatParcelizer(updateAndVerifyCurrentChannel.Companion.RemoteActionCompatParcelizer());
        if (!this.AudioAttributesCompatParcelizer.isEmpty()) {
            int i4 = onRemoveQueueItemAt + 73;
            onPlayFromUri = i4 % 128;
            if (i4 % 2 != 0) {
                toolbarOnCommand = onCommand();
                i2 = 82;
            } else {
                toolbarOnCommand = onCommand();
                i2 = 8;
            }
            toolbarOnCommand.setVisibility(i2);
            int i5 = onPlayFromUri + 115;
            onRemoveQueueItemAt = i5 % 128;
            int i6 = i5 % 2;
        }
        setResult(-1);
        getCredentialList.Companion iconCompatParcelizer = getCredentialList.INSTANCE;
        Plan plan = this.onCommand;
        toMagicModuleMetaRepoModel.write(plan);
        startActivity(getCredentialList.Companion.write(planActivity, str, plan, this.MediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesCompatParcelizer, i, new ArrayList(getOrderDetails.read(subscriptionArr))));
        finish();
    }

    @Override // com.marrow.ui.activities.plan.PlanContract.View
    public final void onMediaButtonEvent() {
        int i = 2 % 2;
        isDolbyAudio isdolbyaudio = new isDolbyAudio(this, 14, null, 4, null);
        isdolbyaudio.MediaBrowserCompatItemReceiver();
        isdolbyaudio.RemoteActionCompatParcelizer();
        isDolbyAudio.read(742101932, new Object[]{isdolbyaudio, Integer.valueOf(R.string.close)}, getColorInfoString.write(), getColorInfoString.write(), getColorInfoString.write(), -742101932, getColorInfoString.write());
        this.AudioAttributesImplApi21Parcelizer = isdolbyaudio;
        this.AudioAttributesImplApi21Parcelizer.show();
        int i2 = onPlayFromUri + 43;
        onRemoveQueueItemAt = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void AudioAttributesCompatParcelizer(String str, int i) {
        int i2 = 2 % 2;
        int i3 = onRemoveQueueItemAt + 87;
        onPlayFromUri = i3 % 128;
        int i4 = i3 % 2;
        ((PlanContract.Presenter) getMPresenter()).IconCompatParcelizer(str, i);
        int i5 = onRemoveQueueItemAt + 29;
        onPlayFromUri = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object AudioAttributesImplApi26Parcelizer(java.lang.Object[] r13) {
        /*
            r0 = 0
            r1 = r13[r0]
            com.marrow.ui.activities.plan.PlanActivity r1 = (com.marrow.ui.activities.plan.PlanActivity) r1
            r2 = 1
            r3 = r13[r2]
            java.lang.Number r3 = (java.lang.Number) r3
            int r5 = r3.intValue()
            r3 = 2
            r13 = r13[r3]
            r6 = r13
            java.lang.String r6 = (java.lang.String) r6
            int r13 = r3 % r3
            o.getExtendedEsFrChar r13 = r1.getMPresenter()
            r4 = r13
            com.marrow.ui.activities.plan.PlanContract$Presenter r4 = (com.marrow.ui.activities.plan.PlanContract.Presenter) r4
            com.marrow.data.models.plan.Plan r13 = r1.onCommand
            r11 = 0
            if (r13 == 0) goto L27
            java.lang.String r13 = r13.getGroupId()
            goto L28
        L27:
            r13 = r11
        L28:
            java.lang.String r7 = "NA"
            java.lang.String r7 = kotlin.PlayerControlViewExternalSyntheticLambda0.RemoteActionCompatParcelizer(r13, r7)
            com.marrow.data.models.plan.Plan r13 = r1.onCommand
            if (r13 == 0) goto L40
            int r8 = com.marrow.ui.activities.plan.PlanActivity.onPlayFromUri
            int r8 = r8 + 111
            int r9 = r8 % 128
            com.marrow.ui.activities.plan.PlanActivity.onRemoveQueueItemAt = r9
            int r8 = r8 % r3
            java.lang.String r13 = r13.getId()
            goto L41
        L40:
            r13 = r11
        L41:
            java.lang.String r8 = kotlin.PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(r13)
            com.marrow.data.models.plan.Plan r13 = r1.onCommand
            if (r13 == 0) goto L61
            int r9 = com.marrow.ui.activities.plan.PlanActivity.onPlayFromUri
            int r9 = r9 + 93
            int r10 = r9 % 128
            com.marrow.ui.activities.plan.PlanActivity.onRemoveQueueItemAt = r10
            int r9 = r9 % r3
            if (r9 != 0) goto L5c
            java.lang.String r13 = r13.getPlanDuration()
            r9 = 75
            int r9 = r9 / r0
            goto L62
        L5c:
            java.lang.String r13 = r13.getPlanDuration()
            goto L62
        L61:
            r13 = r11
        L62:
            java.lang.String r9 = kotlin.PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(r13)
            com.marrow.data.api.models.response.plan.Coupon r13 = r1.MediaBrowserCompatCustomActionResultReceiver
            if (r13 == 0) goto L84
            int r10 = com.marrow.ui.activities.plan.PlanActivity.onPlayFromUri
            int r10 = r10 + 107
            int r12 = r10 % 128
            com.marrow.ui.activities.plan.PlanActivity.onRemoveQueueItemAt = r12
            int r10 = r10 % r3
            int r13 = r13.getCouponType()
            if (r13 != r3) goto L84
            int r13 = com.marrow.ui.activities.plan.PlanActivity.onPlayFromUri
            int r13 = r13 + 109
            int r0 = r13 % 128
            com.marrow.ui.activities.plan.PlanActivity.onRemoveQueueItemAt = r0
            int r13 = r13 % r3
            r10 = r2
            goto L85
        L84:
            r10 = r0
        L85:
            r4.onPaymentError(r5, r6, r7, r8, r9, r10)
            com.marrow.data.models.plan.Plan r13 = r1.onCommand
            if (r13 == 0) goto L9d
            java.lang.String r0 = r13.getId()
            java.lang.String r2 = r13.getGroupId()
            com.marrow.data.api.models.response.plan.Coupon r1 = r1.MediaBrowserCompatCustomActionResultReceiver
            double r4 = r13.getDiscountedPrice(r1)
            o.getLatestBitrateEstimate.write.RemoteActionCompatParcelizer(r0, r2, r4)
        L9d:
            int r13 = com.marrow.ui.activities.plan.PlanActivity.onPlayFromUri
            int r13 = r13 + 77
            int r0 = r13 % 128
            com.marrow.ui.activities.plan.PlanActivity.onRemoveQueueItemAt = r0
            int r13 = r13 % r3
            if (r13 == 0) goto La9
            return r11
        La9:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.plan.PlanActivity.AudioAttributesImplApi26Parcelizer(java.lang.Object[]):java.lang.Object");
    }

    @Override // kotlin.WebvttCueInfo, kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            m(null, new byte[]{-123, -122, -110, -120, -111, -112, -126, -114, -124, -113, -124, -114, -115, -116, -118, -117, -117, -122, -118, -123, -124, -119, -120, -123, -121, -122}, TextUtils.indexOf("", "", 0, 0) + 127, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            m(null, new byte[]{-121, -119, -124, -114, -122, -115, -124, -108, -117, -117, -116, -114, -121, -110, -120, -120, -109, -115}, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 127, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i2 = onPlayFromUri + 105;
                onRemoveQueueItemAt = i2 % 128;
                int i3 = i2 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i4 = onPlayFromUri + 65;
            onRemoveQueueItemAt = i4 % 128;
            try {
                if (i4 % 2 == 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (Process.myPid() >> 22)), 6055 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 42 - (KeyEvent.getMaxKeyCode() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 6029 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 24 - (Process.myPid() >> 22), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    obj.hashCode();
                    throw null;
                }
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (4535 - ((Process.getThreadPriority(0) + 20) >> 6)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6053, (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getWindowTouchSlop() >> 8), View.resolveSizeAndState(0, 0, 0) + 6030, TextUtils.indexOf("", "", 0) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke2, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
        int i5 = onRemoveQueueItemAt + 73;
        onPlayFromUri = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.WebvttCueInfo, kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = onRemoveQueueItemAt + 93;
        onPlayFromUri = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            m(null, new byte[]{-123, -122, -110, -120, -111, -112, -126, -114, -124, -113, -124, -114, -115, -116, -118, -117, -117, -122, -118, -123, -124, -119, -120, -123, -121, -122}, TextUtils.indexOf("", "") + 127, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            m(null, new byte[]{-121, -119, -124, -114, -122, -115, -124, -108, -117, -117, -116, -114, -121, -110, -120, -120, -109, -115}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) + 90, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = onPlayFromUri + 111;
            onRemoveQueueItemAt = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6054, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.getTrimmedLength("") + 6030, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24, -861814097, false, "read", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i6 = onPlayFromUri + 67;
                onRemoveQueueItemAt = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x08cc A[Catch: all -> 0x033e, TryCatch #16 {all -> 0x033e, blocks: (B:125:0x08c6, B:127:0x08cc, B:128:0x08f2, B:208:0x0fad, B:210:0x0fb3, B:211:0x0fdc, B:250:0x1437, B:252:0x143d, B:253:0x146d, B:231:0x122a, B:233:0x124c, B:234:0x12a1, B:169:0x0aef, B:171:0x0af5, B:172:0x0b22, B:19:0x00c7, B:21:0x00cd, B:22:0x00f5, B:24:0x02b4, B:26:0x02e3, B:27:0x0338), top: B:304:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x009c  */
    @Override // kotlin.WebvttCueInfo, kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.plan.PlanActivity.attachBaseContext(android.content.Context):void");
    }

    public static /* synthetic */ getShowPopup read(PlanActivity planActivity, String str) {
        int i = 2 % 2;
        int i2 = onPlayFromUri + 13;
        onRemoveQueueItemAt = i2 % 128;
        if (i2 % 2 == 0) {
            AudioAttributesCompatParcelizer(planActivity, str);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getShowPopup getshowpopupAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(planActivity, str);
        int i3 = onRemoveQueueItemAt + 115;
        onPlayFromUri = i3 % 128;
        int i4 = i3 % 2;
        return getshowpopupAudioAttributesCompatParcelizer;
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(PlanActivity planActivity) {
        int i = 2 % 2;
        int i2 = onPlayFromUri + 35;
        onRemoveQueueItemAt = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(planActivity);
        int i4 = onPlayFromUri + 33;
        onRemoveQueueItemAt = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopupRemoteActionCompatParcelizer;
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(PlanActivity planActivity, String str) {
        int i = RtpDataLoadable.read();
        return (getShowPopup) read(RtpDataLoadable.read(), -1767411695, RtpDataLoadable.read(), new Object[]{planActivity, str}, RtpDataLoadable.read(), 1767411701, i);
    }

    public static /* synthetic */ getShowPopup write(PlanActivity planActivity) {
        int i = 2 % 2;
        int i2 = onPlayFromUri + 63;
        onRemoveQueueItemAt = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(planActivity);
        int i4 = onRemoveQueueItemAt + 63;
        onPlayFromUri = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopupMediaBrowserCompatCustomActionResultReceiver;
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(PlanActivity planActivity, int i, String str) {
        int i2 = 2 % 2;
        int i3 = onRemoveQueueItemAt + 3;
        onPlayFromUri = i3 % 128;
        if (i3 % 2 != 0) {
            read(planActivity, i, str);
            throw null;
        }
        getShowPopup getshowpopup = read(planActivity, i, str);
        int i4 = onPlayFromUri + 19;
        onRemoveQueueItemAt = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    public static /* synthetic */ getShowPopup write(PlanActivity planActivity, String str) {
        int i = 2 % 2;
        int i2 = onPlayFromUri + 79;
        onRemoveQueueItemAt = i2 % 128;
        if (i2 % 2 == 0) {
            RemoteActionCompatParcelizer(planActivity, str);
            throw null;
        }
        getShowPopup getshowpopupRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(planActivity, str);
        int i3 = onRemoveQueueItemAt + 41;
        onPlayFromUri = i3 % 128;
        if (i3 % 2 == 0) {
            return getshowpopupRemoteActionCompatParcelizer;
        }
        throw null;
    }

    static {
        onRewind = 1;
        onPlayFromUri();
        IconCompatParcelizer = new isResolutionNotSupported[]{toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(PlanActivity.class, "binding", "getBinding()Lcom/marrow/databinding/ActivityPlanDetailBinding;", 0))};
        RemoteActionCompatParcelizer = new AudioAttributesCompatParcelizer(null);
        int i = onPrepareFromUri + 81;
        onRewind = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    public static final /* synthetic */ void RemoteActionCompatParcelizer(PlanActivity planActivity, Plan plan, Coupon coupon, Coupon coupon2, ArrayList arrayList) {
        int i = RtpDataLoadable.read();
        read(RtpDataLoadable.read(), -1777941204, RtpDataLoadable.read(), new Object[]{planActivity, plan, coupon, coupon2, arrayList}, RtpDataLoadable.read(), 1777941211, i);
    }

    private final parseSelectionFlagsFromDashRoleScheme onPrepareFromMediaId() {
        int i = RtpDataLoadable.read();
        return (parseSelectionFlagsFromDashRoleScheme) read(RtpDataLoadable.read(), -595022971, RtpDataLoadable.read(), new Object[]{this}, RtpDataLoadable.read(), 595022980, i);
    }

    @getMagicModuleMeta
    public static final Intent RemoteActionCompatParcelizer(Context context, String str, String str2) {
        int i = 2 % 2;
        int i2 = onRemoveQueueItemAt + 53;
        onPlayFromUri = i2 % 128;
        int i3 = i2 % 2;
        Intent intentAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(context, str, str2);
        int i4 = onRemoveQueueItemAt + 87;
        onPlayFromUri = i4 % 128;
        int i5 = i4 % 2;
        return intentAudioAttributesCompatParcelizer;
    }

    @getMagicModuleMeta
    public static final Intent AudioAttributesCompatParcelizer(Context context, String str) {
        int i = 2 % 2;
        int i2 = onPlayFromUri + 17;
        onRemoveQueueItemAt = i2 % 128;
        if (i2 % 2 != 0) {
            return AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(context, str);
        }
        AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(context, str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @getMagicModuleMeta
    public static final Intent AudioAttributesCompatParcelizer(Context context, String str, String str2) {
        int i = 2 % 2;
        int i2 = onRemoveQueueItemAt + 3;
        onPlayFromUri = i2 % 128;
        int i3 = i2 % 2;
        Intent intentWrite = RemoteActionCompatParcelizer.write(context, str, str2);
        int i4 = onPlayFromUri + 29;
        onRemoveQueueItemAt = i4 % 128;
        int i5 = i4 % 2;
        return intentWrite;
    }

    @getMagicModuleMeta
    public static final Intent write(Context context) {
        int i = 2 % 2;
        int i2 = onPlayFromUri + 15;
        onRemoveQueueItemAt = i2 % 128;
        int i3 = i2 % 2;
        Intent intentIconCompatParcelizer = AudioAttributesCompatParcelizer.IconCompatParcelizer(context);
        if (i3 == 0) {
            int i4 = 80 / 0;
        }
        int i5 = onRemoveQueueItemAt + 45;
        onPlayFromUri = i5 % 128;
        if (i5 % 2 == 0) {
            return intentIconCompatParcelizer;
        }
        throw null;
    }

    @getMagicModuleMeta
    public static final Intent IconCompatParcelizer(Context context, String str) {
        int i = RtpDataLoadable.read();
        return (Intent) read(RtpDataLoadable.read(), -1214127335, RtpDataLoadable.read(), new Object[]{context, str}, RtpDataLoadable.read(), 1214127338, i);
    }

    private final void IconCompatParcelizer(int i, String str) {
        read(RtpDataLoadable.read(), -1389656763, RtpDataLoadable.read(), new Object[]{this, Integer.valueOf(i), str}, RtpDataLoadable.read(), 1389656771, RtpDataLoadable.read());
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final int handleMediaPlayPauseIfPendingOnHandler() {
        int i = 2 % 2;
        int i2 = onRemoveQueueItemAt;
        int i3 = i2 + 119;
        onPlayFromUri = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 75;
        onPlayFromUri = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 34 / 0;
        }
        return R.layout.activity_plan_detail;
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity
    public final handlePreambleAddressCode[] MediaBrowserCompatCustomActionResultReceiver() {
        return (handlePreambleAddressCode[]) read(RtpDataLoadable.read(), 1938613487, lambdasetDeviceMuted29.write.RemoteActionCompatParcelizer(), new Object[]{this}, lambdasetDeviceMuted29.write.RemoteActionCompatParcelizer(), -1938613485, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1119794263);
    }

    @Override // kotlin.WebvttCueInfo, kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle savedInstanceState) {
        read(RtpDataLoadable.read(), -854058910, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 206500111, new Object[]{this, savedInstanceState}, lambdasetDeviceMuted29.write.RemoteActionCompatParcelizer(), 854058914, RtpDataLoadable.read());
    }

    @Override // com.marrow.ui.activities.plan.PlanContract.View
    public final void write(String str) {
        int i = RtpDataLoadable.read();
        read(RtpDataLoadable.read(), -331307909, RtpDataLoadable.read(), new Object[]{this, str}, RtpDataLoadable.read(), 331307914, i);
    }

    @Override // com.marrow.ui.activities.plan.PlanContract.View
    public final void AudioAttributesCompatParcelizer(String str, int i, int i2) {
        read(RtpDataLoadable.read(), -464609384, RtpDataLoadable.read(), new Object[]{this, str, Integer.valueOf(i), Integer.valueOf(i2)}, RtpDataLoadable.read(), 464609385, RtpDataLoadable.read());
    }

    @Override // com.marrow.ui.activities.plan.PlanContract.View
    public final void onPrepare() {
        int i = RtpDataLoadable.read();
        read(RtpDataLoadable.read(), 438280715, RtpDataLoadable.read(), new Object[]{this}, RtpDataLoadable.read(), -438280715, i);
    }

    static void onPlayFromUri() {
        onMediaButtonEvent = new char[]{56429, 8769, 8238, 9751, 9455, 10954, 10426, 11991, 11643, 13124, 12668, 14301, 13786, 15268, 14725, 14436, 15951, 15404, 56431, 8730, 8314, 9731, 9443, 10951, 10431, 11931, 11552, 13057, 12641, 14260, 13773, 15277, 14722, 14388, 15884, 15418, 537, 165, 1667, 1206, 2920, 2320, 3964, 3329, 5046, 4572, 6123, 5578, 5156, 6657, 6153, 7869, 7324, 25248, 24706, 26464, 25948, 27502, 26896, 28580, 28043, 29656, 29232, 28690, 30240, 29700, 33910, 31238, 30771, 32281, 31913, 29321, 28837, 30425, 30056, 27467, 27007, 28580, 28040, 25522, 24986, 24701, 26140, 25638, 23040, 22716, 24218, 23802, 21285, 20739, 22373, 21786, 19454, 18844, 20467, 19925, 19519, 16913, 16448, 18166, 17541, 15032, 14489, 16254, 15637, 13095, 12637, 14269, 13775, 11205, 10867, 10241, 11886, 11288, 8881, 8387, 9892, 9356, 6969, 6429, 8005, 7666, 5005, 4541, 6095, 5735, 5142, 2676, 2136, 3761, 47280, 18052, 17662, 17108, 16427, 19988, 45583, 19503, 19993, 18531, 19079, 17568, 18142, 16633, 17160, 23870, 24325, 22916, 23551, 21975, 22499, 22022, 20537, 21081, 27750, 28317, 26851, 27344, 25871, 26421, 24851, 25441, 32210, 32702, 31198, 31663, 31300, 29798, 30316, 28895, 29357, 3266, 56422, 8782, 8252, 9732, 9390, 10959, 10431, 11927, 11635, 13081, 12545, 14324, 13787, 15295, 14723, 14444, 47227, 18001, 17459, 16922, 16635, 20191, 19622, 19086, 18797, 22346, 21801};
        onPlayFromMediaId = -8198284932498120145L;
        onPlayFromSearch = new char[]{28347, 28239, 28307, 28351, 28322, 28327, 28344, 28340, 28345, 28408, 28342, 28295, 28325, 28338, 28336, 28306, 28350, 28323, 28339, 28346, 28406, 28401, 28400, 28403, 28324, 28407, 28303, 28302, 28402, 28404, 28405, 28320, 28341, 28300, 28409, 28321, 28343, 28318, 28293, 28309, 28349, 28308};
        onPrepareFromSearch = 411397830;
        onPrepare = true;
        onPrepareFromMediaId = true;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        PlanActivity planActivity = (PlanActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onPlayFromUri + 119;
        onRemoveQueueItemAt = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(planActivity, str);
        if (i3 == 0) {
            int i4 = 53 / 0;
        }
        int i5 = onPlayFromUri + 57;
        onRemoveQueueItemAt = i5 % 128;
        int i6 = i5 % 2;
        return getshowpopupMediaBrowserCompatItemReceiver;
    }
}
