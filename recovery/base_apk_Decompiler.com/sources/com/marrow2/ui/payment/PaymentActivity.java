package com.marrow2.ui.payment;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ProgressBar;
import androidx.fragment.app.FragmentManager;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.data.api.models.response.payment.PayloadKt;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.user.NotesDispatchAddressRequestKt;
import com.marrow2.ui.payment.PaymentActivity;
import com.marrow2.ui.payment.model.PaymentArgs;
import com.razorpay.Checkout;
import com.razorpay.PaymentResultListener;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.CmcdConfigurationRequestConfig;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.MagicModuleUseCase;
import kotlin.MediaBrowserCompatMediaItem;
import kotlin.Metadata;
import kotlin.PlanDetailsCreator;
import kotlin.RenewEligible;
import kotlin.RenewEligibleCreator;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.VirtualAnnotatedMember;
import kotlin.VisibilityChecker;
import kotlin.buildSetRequirementsIntent;
import kotlin.deserializeIterableFromIntentExtraSafe;
import kotlin.getAdjustedUpstreamFormat;
import kotlin.getAnswerMap;
import kotlin.getAutofillClient;
import kotlin.getBrowserClient;
import kotlin.getCreatedOnDateMs;
import kotlin.getCredentialList;
import kotlin.getMagicModuleStats;
import kotlin.getShowPopup;
import kotlin.getValidationToken;
import kotlin.getYear;
import kotlin.hasMixIns;
import kotlin.maybeInvalidateForRendererCapabilitiesChange;
import kotlin.onRemoveQueueItemAt;
import kotlin.parseSegmentList;
import kotlin.readShort;
import kotlin.serializeIterableToBundle;
import kotlin.serializeIterableToBundleSafe;
import kotlin.serializeToIntentExtra;
import kotlin.setUpdatedStatus;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaDataUcModel;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.withFieldVisibility;
import kotlin.writeSparseLongArray;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 *2\u00020\u00012\u00020\u0002:\u0001*B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014J\b\u0010\u0013\u001a\u00020\u0010H\u0002J\b\u0010\u0014\u001a\u00020\u0010H\u0002J4\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00172\u000e\b\u0002\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u001bH\u0002J\u0012\u0010\u001c\u001a\u00020\u00102\b\u0010\u001d\u001a\u0004\u0018\u00010\u0017H\u0002J\u0010\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u001f\u001a\u00020\u0017H\u0016J\u0018\u0010 \u001a\u00020\u00102\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0017H\u0016J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010%\u001a\u00020&H\u0002J\u0010\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020&H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\f¨\u0006+"}, d2 = {"Lcom/marrow2/ui/payment/PaymentActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "Lcom/razorpay/PaymentResultListener;", "<init>", "()V", "binding", "Lcom/marrow/databinding/ActivityPaymentBinding;", "juspayGateway", "Lcom/marrow2/ui/payment/paymentgateway/JusPayGatewayImpl;", "viewModel", "Lcom/marrow2/ui/payment/PaymentViewModel;", "getViewModel", "()Lcom/marrow2/ui/payment/PaymentViewModel;", "viewModel$delegate", "Lkotlin/Lazy;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "initialisePaymentGateway", "initObservers", "showDialog", "message", "", "actionText", "title", "callback", "Lkotlin/Function0;", "finishActivityWithResult", "paymentStatus", "onPaymentSuccess", "razorpayPaymentId", "onPaymentError", "errorCode", "", "response", "startRazorpayPayment", "sdkPayloadParams", "Lcom/marrow2/domain/payment/model/SdkPayloadParams$RazorpaySdkPayloadParams;", "createCheckoutOptionsJson", "Lorg/json/JSONObject;", "params", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PaymentActivity extends writeSparseLongArray implements PaymentResultListener {
    private static int AudioAttributesImplApi26Parcelizer;
    private static long MediaBrowserCompatCustomActionResultReceiver;
    private static int RemoteActionCompatParcelizer;
    public static final write read;
    private parseSegmentList AudioAttributesCompatParcelizer;
    private final RenewEligible IconCompatParcelizer;
    private serializeToIntentExtra write;
    private static final byte[] $$l = {TarConstants.LF_BLK, -62, -101, -125};
    private static final int $$m = 29;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {36, 33, 122, TarConstants.LF_DIR, -51, 71, 12, 29, -24, 37, 29, 17, 6, 17, 7, -9, TarConstants.LF_CHR, 5, 3, -17, 58, 11, 12, -28, 58, 13, 14, 5, 12, 31, 3, 27, 1, 25, 19, -30, 34, 27, 1, 20, 12, 27, 9, 5, 25, -1, 33, 22, 16, 19, -1, -22, TarConstants.LF_NORMAL, 31, 3, 20, 13, -29, 58, 12, 17, -1, 33, -22, 31, 31, -1, 16, 21, 11, 31, -7, 27, -51, 71, 12, 29, -36, 59, 3, 35, -71, 43, 66, -3, 19, 20, -32, 65, 14, 12, 5, 7, 33, 13, -1, 28, -28, TarConstants.LF_SYMLINK, 17, 10, -28, 45, 32, 0, -7, 31, 31, -1, 16, 21, 11, 31, -7, 27};
    private static final int $$k = 88;
    private static final byte[] $$d = {34, TarConstants.LF_NORMAL, 18, 42, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 198;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int MediaBrowserCompatItemReceiver = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(int r5, int r6, short r7) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 1
            int r5 = r5 * 2
            int r5 = 104 - r5
            int r6 = r6 * 2
            int r6 = 4 - r6
            byte[] r1 = com.marrow2.ui.payment.PaymentActivity.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r5 = r6
            r4 = r7
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            r4 = r1[r6]
            int r3 = r3 + 1
        L27:
            int r6 = r6 + 1
            int r5 = r5 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.payment.PaymentActivity.$$n(int, int, short):java.lang.String");
    }

    public static /* synthetic */ Object AudioAttributesCompatParcelizer(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = ~(i7 | i8);
        int i10 = (~(i7 | i5)) | i9 | (~(i8 | i5));
        int i11 = ~i5;
        int i12 = (~(i8 | i11)) | i9;
        int i13 = (~(i11 | i7)) | i6;
        int i14 = i3 + i6 + i4 + ((-700610695) * i2) + ((-1151578525) * i);
        int i15 = i14 * i14;
        int i16 = (1165304685 * i3) + 1030029312 + ((-1366800679) * i6) + (i10 * (-1762861932)) + (i12 * (-1762861932)) + ((-1762861932) * i13) + ((-597557248) * i4) + ((-665714688) * i2) + (367394816 * i) + (374145024 * i15);
        int i17 = ((i3 * 323709325) - 650539883) + (i6 * 323709049) + (i10 * 276) + (i12 * 276) + (i13 * 276) + (i4 * 323709601) + (i2 * (-499299047)) + (i * 1568885315) + (i15 * (-395509760));
        switch (i16 + (i17 * i17 * (-772603904))) {
            case 1:
                return AudioAttributesCompatParcelizer(objArr);
            case 2:
                return write(objArr);
            case 3:
                PaymentActivity paymentActivity = (PaymentActivity) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                String str = (String) objArr[2];
                int i18 = 2 % 2;
                toMagicModuleMetaRepoModel.write(str, "");
                paymentActivity.MediaBrowserCompatItemReceiver().read(new deserializeIterableFromIntentExtraSafe.read(iIntValue, str));
                getShowPopup getshowpopup = getShowPopup.INSTANCE;
                int i19 = MediaBrowserCompatItemReceiver + 35;
                AudioAttributesImplBaseParcelizer = i19 % 128;
                int i20 = i19 % 2;
                return getshowpopup;
            case 4:
                return IconCompatParcelizer(objArr);
            case 5:
                return RemoteActionCompatParcelizer(objArr);
            case 6:
                PaymentActivity paymentActivity2 = (PaymentActivity) objArr[0];
                int i21 = 2 % 2;
                int i22 = AudioAttributesImplBaseParcelizer + 85;
                int i23 = i22 % 128;
                MediaBrowserCompatItemReceiver = i23;
                int i24 = i22 % 2;
                serializeToIntentExtra serializetointentextra = paymentActivity2.write;
                int i25 = i23 + 35;
                AudioAttributesImplBaseParcelizer = i25 % 128;
                int i26 = i25 % 2;
                return serializetointentextra;
            default:
                return read(objArr);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.marrow2.ui.payment.PaymentActivity.$$d
            int r6 = r6 + 4
            int r1 = r8 + 4
            int r7 = 114 - r7
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = -1
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            r9[r7] = r6
            return
        L24:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r3 = r3 + r6
            int r6 = r7 + 1
            int r7 = r3 + (-1)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.payment.PaymentActivity.g(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.marrow2.ui.payment.PaymentActivity.$$j
            int r1 = 43 - r5
            int r6 = 119 - r6
            int r7 = 72 - r7
            byte[] r1 = new byte[r1]
            int r5 = 42 - r5
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r6
            r3 = r2
            r6 = r5
            goto L27
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
        L27:
            int r6 = r6 + r4
            int r6 = r6 + (-14)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.payment.PaymentActivity.h(int, int, short, java.lang.Object[]):void");
    }

    public PaymentActivity() {
        PaymentActivity paymentActivity = this;
        this.IconCompatParcelizer = new VirtualAnnotatedMember(toMagicModuleMetaDataUcModel.write(PaymentViewModel.class), new AnonymousClass3(paymentActivity), new AnonymousClass5(paymentActivity), new AnonymousClass4(paymentActivity));
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        PaymentActivity paymentActivity = (PaymentActivity) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 107;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        parseSegmentList parsesegmentlist = paymentActivity.AudioAttributesCompatParcelizer;
        if (i3 == 0) {
            return parsesegmentlist;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void AudioAttributesCompatParcelizer(PaymentActivity paymentActivity, readShort.IconCompatParcelizer iconCompatParcelizer) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 67;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
            AudioAttributesCompatParcelizer(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite3, 1669579087, iWrite2, iWrite, new Object[]{paymentActivity, iconCompatParcelizer}, -1669579083);
            return;
        }
        int iWrite4 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite5 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite6 = maybeInvalidateForRendererCapabilitiesChange.write();
        AudioAttributesCompatParcelizer(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite6, 1669579087, iWrite5, iWrite4, new Object[]{paymentActivity, iconCompatParcelizer}, -1669579083);
        int i3 = 96 / 0;
    }

    public static final /* synthetic */ PaymentViewModel AudioAttributesImplApi26Parcelizer(PaymentActivity paymentActivity) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 75;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        PaymentViewModel paymentViewModelMediaBrowserCompatItemReceiver = paymentActivity.MediaBrowserCompatItemReceiver();
        int i4 = MediaBrowserCompatItemReceiver + 109;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return paymentViewModelMediaBrowserCompatItemReceiver;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        PaymentActivity paymentActivity = (PaymentActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 13;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        paymentActivity.RemoteActionCompatParcelizer(str);
        int i4 = AudioAttributesImplBaseParcelizer + 95;
        MediaBrowserCompatItemReceiver = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void write(PaymentActivity paymentActivity, String str, String str2, String str3, getCreatedOnDateMs getcreatedondatems) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 3;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        paymentActivity.read(str, str2, str3, getcreatedondatems);
        if (i3 == 0) {
            int i4 = 50 / 0;
        }
    }

    private final PaymentViewModel MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 41;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        PaymentViewModel paymentViewModel = (PaymentViewModel) objRemoteActionCompatParcelizer;
        int i4 = AudioAttributesImplBaseParcelizer + 69;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        return paymentViewModel;
    }

    public static final class IconCompatParcelizer extends onRemoveQueueItemAt {
        IconCompatParcelizer() {
            super(true);
        }

        @Override // kotlin.onRemoveQueueItemAt
        public final void handleOnBackPressed() {
            Object[] objArr = {PaymentActivity.this};
            int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
            serializeToIntentExtra serializetointentextra = (serializeToIntentExtra) PaymentActivity.AudioAttributesCompatParcelizer(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), -107693158, iWrite2, iWrite, objArr, 107693164);
            if (serializetointentextra == null || !serializetointentextra.read()) {
                setEnabled(false);
                PaymentActivity.this.getIconCompatParcelizer().RemoteActionCompatParcelizer();
            }
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $10 + 23;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12424, Color.rgb(0, 0, 0) + 16777236, -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1867, (ViewConfiguration.getEdgeSlop() >> 16) + 10, 1983509525, false, $$n(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
        int i6 = $11 + 89;
        $10 = i6 % 128;
        if (i6 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i7 = 8 / 0;
            objArr[0] = str;
        }
    }

    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<serializeIterableToBundleSafe> setupdatedstatusIconCompatParcelizer = PaymentActivity.AudioAttributesImplApi26Parcelizer(PaymentActivity.this).IconCompatParcelizer();
                final PaymentActivity paymentActivity = PaymentActivity.this;
                this.IconCompatParcelizer = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: com.marrow2.ui.payment.PaymentActivity.RemoteActionCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return write((serializeIterableToBundleSafe) obj2);
                    }

                    private Object write(serializeIterableToBundleSafe serializeiterabletobundlesafe) {
                        Object[] objArr = {paymentActivity};
                        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
                        parseSegmentList parsesegmentlist = (parseSegmentList) PaymentActivity.AudioAttributesCompatParcelizer(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), -731410206, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, objArr, 731410207);
                        if (parsesegmentlist == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            parsesegmentlist = null;
                        }
                        ProgressBar progressBar = parsesegmentlist.AudioAttributesCompatParcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                        progressBar.setVisibility(serializeiterabletobundlesafe.getAudioAttributesCompatParcelizer() ? 0 : 8);
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return PaymentActivity.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.marrow2.ui.payment.PaymentActivity$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ MediaBrowserCompatMediaItem $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$RemoteActionCompatParcelizer.getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$RemoteActionCompatParcelizer = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        /* JADX INFO: renamed from: com.marrow2.ui.payment.PaymentActivity$read$2, reason: invalid class name */
        public static final class AnonymousClass2<T> implements getValidationToken {
            private /* synthetic */ PaymentActivity AudioAttributesCompatParcelizer;

            @Override // kotlin.getValidationToken
            public final /* synthetic */ Object IconCompatParcelizer(Object obj, SampleVideos sampleVideos) {
                return RemoteActionCompatParcelizer((serializeIterableToBundle) obj);
            }

            private Object RemoteActionCompatParcelizer(serializeIterableToBundle serializeiterabletobundle) {
                if (serializeiterabletobundle instanceof serializeIterableToBundle.MediaBrowserCompatCustomActionResultReceiver) {
                    Object[] objArr = {this.AudioAttributesCompatParcelizer};
                    int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
                    int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
                    serializeToIntentExtra serializetointentextra = (serializeToIntentExtra) PaymentActivity.AudioAttributesCompatParcelizer(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), -107693158, iWrite2, iWrite, objArr, 107693164);
                    if (serializetointentextra != null) {
                        serializetointentextra.IconCompatParcelizer(((serializeIterableToBundle.MediaBrowserCompatCustomActionResultReceiver) serializeiterabletobundle).write());
                    }
                } else if (serializeiterabletobundle instanceof serializeIterableToBundle.AudioAttributesImplBaseParcelizer) {
                    PaymentActivity.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer, ((serializeIterableToBundle.AudioAttributesImplBaseParcelizer) serializeiterabletobundle).read());
                } else if (serializeiterabletobundle instanceof serializeIterableToBundle.AudioAttributesImplApi26Parcelizer) {
                    PaymentActivity paymentActivity = this.AudioAttributesCompatParcelizer;
                    String string = paymentActivity.getString(R.string.payment_cnf_mail_message);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                    String string2 = this.AudioAttributesCompatParcelizer.getString(R.string.close);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                    String string3 = this.AudioAttributesCompatParcelizer.getString(R.string.taking_longer);
                    final PaymentActivity paymentActivity2 = this.AudioAttributesCompatParcelizer;
                    PaymentActivity.write(paymentActivity, string, string2, string3, new getCreatedOnDateMs() { // from class: o.SafeParcelable
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return PaymentActivity.read.AnonymousClass2.RemoteActionCompatParcelizer(paymentActivity2);
                        }
                    });
                } else if (serializeiterabletobundle instanceof serializeIterableToBundle.RemoteActionCompatParcelizer) {
                    String string4 = this.AudioAttributesCompatParcelizer.getString(R.string.label_order_id);
                    serializeIterableToBundle.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (serializeIterableToBundle.RemoteActionCompatParcelizer) serializeiterabletobundle;
                    String strRemoteActionCompatParcelizer = remoteActionCompatParcelizer.RemoteActionCompatParcelizer();
                    String strAudioAttributesCompatParcelizer = remoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
                    String string5 = this.AudioAttributesCompatParcelizer.getString(R.string.label_payment_try_again_detail);
                    String str = remoteActionCompatParcelizer.read();
                    StringBuilder sb = new StringBuilder();
                    sb.append(string4);
                    sb.append(" ");
                    sb.append(strRemoteActionCompatParcelizer);
                    sb.append(" ");
                    sb.append(strAudioAttributesCompatParcelizer);
                    sb.append(" ");
                    sb.append(string5);
                    sb.append(" [ERR: ");
                    sb.append(str);
                    sb.append("]");
                    String string6 = sb.toString();
                    PaymentActivity paymentActivity3 = this.AudioAttributesCompatParcelizer;
                    String string7 = paymentActivity3.getString(R.string.text_okay);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string7, "");
                    final PaymentActivity paymentActivity4 = this.AudioAttributesCompatParcelizer;
                    PaymentActivity.RemoteActionCompatParcelizer(paymentActivity3, string6, string7, new getCreatedOnDateMs() { // from class: o.SafeParcelableField
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return PaymentActivity.read.AnonymousClass2.write(paymentActivity4);
                        }
                    });
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(serializeiterabletobundle, serializeIterableToBundle.write.INSTANCE)) {
                    Object[] objArr2 = {this.AudioAttributesCompatParcelizer, "Payment Cancelled"};
                    int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
                    int iWrite4 = maybeInvalidateForRendererCapabilitiesChange.write();
                    PaymentActivity.AudioAttributesCompatParcelizer(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 940266909, iWrite4, iWrite3, objArr2, -940266904);
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(serializeiterabletobundle, serializeIterableToBundle.read.INSTANCE)) {
                    PaymentActivity paymentActivity5 = this.AudioAttributesCompatParcelizer;
                    Object[] objArr3 = {paymentActivity5, paymentActivity5.getString(R.string.app_error_no_internet)};
                    int iWrite5 = maybeInvalidateForRendererCapabilitiesChange.write();
                    int iWrite6 = maybeInvalidateForRendererCapabilitiesChange.write();
                    PaymentActivity.AudioAttributesCompatParcelizer(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 940266909, iWrite6, iWrite5, objArr3, -940266904);
                } else if (serializeiterabletobundle instanceof serializeIterableToBundle.AudioAttributesCompatParcelizer) {
                    Object[] objArr4 = {this.AudioAttributesCompatParcelizer, ((serializeIterableToBundle.AudioAttributesCompatParcelizer) serializeiterabletobundle).RemoteActionCompatParcelizer()};
                    int iWrite7 = maybeInvalidateForRendererCapabilitiesChange.write();
                    int iWrite8 = maybeInvalidateForRendererCapabilitiesChange.write();
                    PaymentActivity.AudioAttributesCompatParcelizer(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 940266909, iWrite8, iWrite7, objArr4, -940266904);
                } else if (serializeiterabletobundle instanceof serializeIterableToBundle.IconCompatParcelizer) {
                    this.AudioAttributesCompatParcelizer.startService(new Intent(this.AudioAttributesCompatParcelizer, (Class<?>) getAdjustedUpstreamFormat.class));
                    PaymentActivity paymentActivity6 = this.AudioAttributesCompatParcelizer;
                    getCredentialList.Companion companion = getCredentialList.INSTANCE;
                    paymentActivity6.startActivity(getCredentialList.Companion.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer));
                } else {
                    if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(serializeiterabletobundle, serializeIterableToBundle.MediaBrowserCompatItemReceiver.INSTANCE)) {
                        throw new RenewEligibleCreator();
                    }
                    PaymentActivity paymentActivity7 = this.AudioAttributesCompatParcelizer;
                    String string8 = paymentActivity7.getString(R.string.dlg_title_update_college);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string8, "");
                    String string9 = this.AudioAttributesCompatParcelizer.getString(R.string.close);
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string9, "");
                    final PaymentActivity paymentActivity8 = this.AudioAttributesCompatParcelizer;
                    PaymentActivity.RemoteActionCompatParcelizer(paymentActivity7, string8, string9, new getCreatedOnDateMs() { // from class: o.defaultValueUnchecked
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return PaymentActivity.read.AnonymousClass2.AudioAttributesImplApi21Parcelizer(paymentActivity8);
                        }
                    });
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final getShowPopup RemoteActionCompatParcelizer(PaymentActivity paymentActivity) {
                paymentActivity.finish();
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final getShowPopup write(PaymentActivity paymentActivity) {
                paymentActivity.finish();
                return getShowPopup.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final getShowPopup AudioAttributesImplApi21Parcelizer(PaymentActivity paymentActivity) {
                paymentActivity.finish();
                return getShowPopup.INSTANCE;
            }

            AnonymousClass2(PaymentActivity paymentActivity) {
                this.AudioAttributesCompatParcelizer = paymentActivity;
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (PaymentActivity.AudioAttributesImplApi26Parcelizer(PaymentActivity.this).read().write(new AnonymousClass2(PaymentActivity.this), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return PaymentActivity.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: com.marrow2.ui.payment.PaymentActivity$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "IconCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ MediaBrowserCompatMediaItem $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$write.getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$write = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: com.marrow2.ui.payment.PaymentActivity$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "IconCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;
        private /* synthetic */ MediaBrowserCompatMediaItem $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$read.getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$read = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(boolean r24, int r25, char[] r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.payment.PaymentActivity.e(boolean, int, char[], int, int, java.lang.Object[]):void");
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lcom/marrow2/ui/payment/PaymentActivity$write;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lcom/marrow2/ui/payment/model/PaymentArgs;", "p1", "Landroid/content/Intent;", "write", "(Landroid/content/Context;Lcom/marrow2/ui/payment/model/PaymentArgs;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class write {
        private write() {
        }

        public static Intent write(Context p0, PaymentArgs p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) PaymentActivity.class);
            p1.RemoteActionCompatParcelizer(intent);
            return intent;
        }

        public /* synthetic */ write(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.writeSparseLongArray, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle savedInstanceState) throws Throwable {
        Object[] objArr;
        parseSegmentList parsesegmentlist;
        parseSegmentList parsesegmentlist2;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        e(true, 2 - View.resolveSizeAndState(0, 0, 0), new char[]{11, 65534, 16, 16, 2, 0, '\f', 15, 65517, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 184, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 8, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        f(1 - (ViewConfiguration.getTouchSlop() >> 8), new char[]{48305, 48348, 57728, 48956, 45650, 10311, 3981, 13409, 51137}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 113, new char[]{2644, 2613, 25209, 15570, 36049, 6362, 12607, 1255, 28975, 48073, 2501, 37802, 64541, 14052, 33533, 5822, 31529, 45595, 8077, 35077, 58994, 10501, 39057, 3073, 28004, 42040, 5539, 34609, 59469, 8992}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 34, new char[]{4772, 4807, 4494, 20286, 31134, 61058, 50278, 62143, 27093, 51257, 64652, 26013, 58620, 17683, 30648, 57505, 25595, 49646, 60116, 32605, 65179, 23285}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i2 = MediaBrowserCompatItemReceiver + 117;
                AudioAttributesImplBaseParcelizer = i2 % 128;
                int i3 = i2 % 2;
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 6054 - View.resolveSizeAndState(0, 0, 0), (Process.myPid() >> 22) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 14, new char[]{65517, 27, 65513, 22, 65512, 65510, 65511, 65509, 26, 65511, 65515, 26, 23, 24, 23, 65516, 25, 65512, 65518, 65514, 65517, 65518, 27, 26, 24, 65514, 65509, 27, 24, 25, 22, 23, 65513, 65515, 65512, 65518, 26, 27, 25, 65514, 65509, 26, 24, 65509, 65512, 26, 27, 65518}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 86, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 47, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 9, new char[]{51512, 51464, 48189, 58011, 29816, 7603, 51601, 460, 45595, 25989, 61752, 38553, 16165, 59623, 31303, 5081, 47156, 27661, 59187, 35953, 9481, 63309, 24618, 2410, 44650, 31276, 60747, 33350, 11042, 64817, 27042, 65339, 38029, '[', 53941, 30759, 4520, 35692, 24537, 62736, 39658, 3702, 55452, 29183, 1992, 37255, 17825, 60095, 32896, 5370, 52934, 26499, 3576, 40881, 19422, 57539, 35085, 8909, 13355, 23978, 29208, 42374, 45398, 54984, 65313, 10409, 14868, 21376}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    e(false, 47 - Process.getGidForName(""), new char[]{65521, 26, 27, 65514, 65515, 65514, 65516, 65515, 65522, 30, 29, 65522, 65516, 65519, 65514, 65521, 65517, 26, 65520, 30, 26, 30, 65516, 31, 65514, 65515, 30, 65513, 28, 65515, 65513, 26, 65518, 29, 31, 26, 65514, 65519, 65516, 28, 65514, 27, 65518, 27, 65519, 65520, 65519, 65521, 27, 65514, 26, 29, 65514, 65515, 28, 65521, 29, 29, 65518, 65514, 65521, 26, 29, 29}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 187, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 29, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 32, new char[]{17, 18, '\f', 3, 20, 3, 65485, 65488, 20, 65485, 18, 17, 3, 5, '\f', 7, 65485, 7, 14, 65535, 65485, 11, '\r', 1, 65484, 3, 16, 65535, 19, 15, 17, 2, 16, 65535, 19, 5, 65484, 18, 17, 65535, 1, 18, 65535, 3, 16, 6, 18, 65484, 17, 2, '\f', 19, '\r', 16, 23, '\n', 7, 65535, 2, 65485, 65485, 65496, 17, 14, 18, 18, 6}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 183, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 63, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    e(false, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 1, new char[]{65532, 0, 7, 65532, 65535, 2}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 166, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 2, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(3) - 114, new char[]{47066, 47080, 4037, 20785, 44166, 51328, 4462, 54520, 52472, 54830, 10689, 17322, 16863, 23312, 41658, 50871, 50816, 57321, 16284, 22853, 23486, 17639, 47257, 56414, 53468, 51678, 13744, 22374, 21956, 20175, 45325, 10765, 60001, 46065, 2587, 44357, 28491, 14529, 34674, 8225}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), KeyEvent.keyCodeFromString("") + 6030, 24 - TextUtils.indexOf("", ""), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
                    int i4 = MediaBrowserCompatItemReceiver + 9;
                    AudioAttributesImplBaseParcelizer = i4 % 128;
                    int i5 = i4 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer3 == null) {
            char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 13183);
            int i6 = 1649 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 26;
            byte[] bArr = $$d;
            short s = bArr[5];
            byte b = bArr[62];
            Object[] objArr13 = new Object[1];
            g(s, b, (byte) (b + 3), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(absoluteGravity, i6, capsMode, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 13183);
                int longPressTimeout = 1649 - (ViewConfiguration.getLongPressTimeout() >> 16);
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 26;
                byte[] bArr2 = $$d;
                Object[] objArr14 = new Object[1];
                g((short) (-bArr2[27]), bArr2[9], (byte) (-bArr2[8]), objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(keyRepeatDelay, longPressTimeout, offsetAfter, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 33, new char[]{18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 217, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 12, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            f((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), new char[]{10846, 10807, 6831, 17422, 7922, 15860, 41757, 8661, 20798, 49951, 39927, 46799, 56382, 20003, 4316, 13258, 23329, 51905, 36287, 44091}, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i7 = AudioAttributesImplBaseParcelizer + 125;
            MediaBrowserCompatItemReceiver = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, 518307521};
                byte[] bArr3 = $$j;
                byte b2 = (byte) (bArr3[17] - 1);
                Object[] objArr18 = new Object[1];
                h(b2, (byte) (b2 + 4), (byte) 69, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                h((byte) (bArr3[9] + 1), bArr3[104], bArr3[29], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 13183);
                    int i9 = 1649 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int bitsPerPixel = 25 - ImageFormat.getBitsPerPixel(0);
                    byte[] bArr4 = $$d;
                    Object[] objArr20 = new Object[1];
                    g((short) (-bArr4[27]), bArr4[9], (byte) (-bArr4[8]), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(maximumFlingVelocity, i9, bitsPerPixel, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 34, new char[]{0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f'}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 184, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) - 27, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 29, new char[]{65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 222, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 13184);
                        int i10 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1648;
                        int keyRepeatDelay2 = 26 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        Object[] objArr23 = new Object[1];
                        g((short) 76, r14[9], (byte) (-$$d[8]), objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(c, i10, keyRepeatDelay2, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char minimumFlingVelocity = (char) (13183 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                        int i11 = 1649 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        int i12 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25;
                        byte[] bArr5 = $$d;
                        short s2 = bArr5[5];
                        byte b3 = bArr5[62];
                        Object[] objArr24 = new Object[1];
                        g(s2, b3, (byte) (b3 + 3), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(minimumFlingVelocity, i11, i12, -133433128, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i13 = ((int[]) objArr[3])[0];
        int i14 = ((int[]) objArr[2])[0];
        if (i14 != i13) {
            long j = -1;
            long j2 = ((long) (i14 ^ i13)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4535), (ViewConfiguration.getLongPressTimeout() >> 16) + 6054, 41 - TextUtils.indexOf((CharSequence) "", '0', 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            parsesegmentlist = null;
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i15 = MediaBrowserCompatItemReceiver + 111;
            AudioAttributesImplBaseParcelizer = i15 % 128;
            int i16 = i15 % 2;
            try {
                Object[] objArr25 = {280815963, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) TextUtils.indexOf("", "", 0), TextUtils.indexOf("", "") + 6030, Color.blue(0) + 24);
                Object[] objArr26 = new Object[1];
                h((byte) ($$j[48] - 1), r4[9], r4[31], objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        } else {
            parsesegmentlist = null;
        }
        super.onCreate(savedInstanceState);
        parseSegmentList parsesegmentlistIconCompatParcelizer = parseSegmentList.IconCompatParcelizer(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parsesegmentlistIconCompatParcelizer, "");
        this.AudioAttributesCompatParcelizer = parsesegmentlistIconCompatParcelizer;
        if (parsesegmentlistIconCompatParcelizer == null) {
            int i17 = MediaBrowserCompatItemReceiver + 91;
            AudioAttributesImplBaseParcelizer = i17 % 128;
            int i18 = i17 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            parsesegmentlist2 = parsesegmentlist;
        } else {
            parsesegmentlist2 = parsesegmentlistIconCompatParcelizer;
        }
        setContentView(parsesegmentlist2.IconCompatParcelizer());
        Checkout.preload(getApplicationContext());
        MediaBrowserCompatCustomActionResultReceiver();
        AudioAttributesImplApi26Parcelizer();
        getIconCompatParcelizer().AudioAttributesCompatParcelizer(this, new IconCompatParcelizer());
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        this.write = new serializeToIntentExtra(this, new getCreatedOnDateMs() { // from class: o.writeTypedArray
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return PaymentActivity.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
            }
        }, new getCreatedOnDateMs() { // from class: o.writeStringArray
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                Object[] objArr = {this.IconCompatParcelizer};
                int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
                int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
                return (getShowPopup) PaymentActivity.AudioAttributesCompatParcelizer(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 571879407, iWrite2, iWrite, objArr, -571879407);
            }
        }, new getCreatedOnDateMs() { // from class: o.writeTypedList
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return PaymentActivity.write(this.write);
            }
        }, new MagicModuleSubmissionRequestBody() { // from class: o.writeStringSparseArray
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PaymentActivity.IconCompatParcelizer(this.IconCompatParcelizer, (String) obj, (String) obj2);
            }
        }, new getCreatedOnDateMs() { // from class: o.doNotParcelTypeDefaultValues
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return PaymentActivity.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
            }
        }, new getCreatedOnDateMs() { // from class: o.creatorIsFinal
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return PaymentActivity.read(this.write);
            }
        }, new MagicModuleSubmissionRequestBody() { // from class: o.writeTypedSparseArray
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return PaymentActivity.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ((Integer) obj).intValue(), (String) obj2);
            }
        }, new getAnswerMap() { // from class: o.SafeParcelableClass
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return PaymentActivity.write(this.AudioAttributesCompatParcelizer, (Exception) obj);
            }
        });
        int i2 = AudioAttributesImplBaseParcelizer + 1;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getShowPopup AudioAttributesImplBaseParcelizer(PaymentActivity paymentActivity) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 103;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        paymentActivity.MediaBrowserCompatItemReceiver().read(deserializeIterableFromIntentExtraSafe.AudioAttributesImplBaseParcelizer.INSTANCE);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = AudioAttributesImplBaseParcelizer + 23;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        PaymentActivity paymentActivity = (PaymentActivity) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 21;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        PaymentViewModel paymentViewModelMediaBrowserCompatItemReceiver = paymentActivity.MediaBrowserCompatItemReceiver();
        if (i3 != 0) {
            paymentViewModelMediaBrowserCompatItemReceiver.read(deserializeIterableFromIntentExtraSafe.write.INSTANCE);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            throw null;
        }
        paymentViewModelMediaBrowserCompatItemReceiver.read(deserializeIterableFromIntentExtraSafe.write.INSTANCE);
        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        int i4 = AudioAttributesImplBaseParcelizer + 65;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 51 / 0;
        }
        return getshowpopup2;
    }

    private static final getShowPopup MediaBrowserCompatSearchResultReceiver(PaymentActivity paymentActivity) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 83;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        paymentActivity.MediaBrowserCompatItemReceiver().read(deserializeIterableFromIntentExtraSafe.IconCompatParcelizer.INSTANCE);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = AudioAttributesImplBaseParcelizer + 7;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 8 / 0;
        }
        return getshowpopup;
    }

    private static final getShowPopup RemoteActionCompatParcelizer(PaymentActivity paymentActivity, String str, String str2) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        paymentActivity.MediaBrowserCompatItemReceiver().read(new deserializeIterableFromIntentExtraSafe.RemoteActionCompatParcelizer(str, str2));
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i2 = AudioAttributesImplBaseParcelizer + 113;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        return getshowpopup;
    }

    private static final getShowPopup MediaDescriptionCompat(PaymentActivity paymentActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 53;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        PaymentViewModel paymentViewModelMediaBrowserCompatItemReceiver = paymentActivity.MediaBrowserCompatItemReceiver();
        if (i3 != 0) {
            paymentViewModelMediaBrowserCompatItemReceiver.read(deserializeIterableFromIntentExtraSafe.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            throw null;
        }
        paymentViewModelMediaBrowserCompatItemReceiver.read(deserializeIterableFromIntentExtraSafe.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        int i4 = AudioAttributesImplBaseParcelizer + 39;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 25 / 0;
        }
        return getshowpopup2;
    }

    private static final getShowPopup RatingCompat(PaymentActivity paymentActivity) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 43;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        paymentActivity.MediaBrowserCompatItemReceiver().read(deserializeIterableFromIntentExtraSafe.AudioAttributesImplApi26Parcelizer.INSTANCE);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = MediaBrowserCompatItemReceiver + 9;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return getshowpopup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getShowPopup AudioAttributesCompatParcelizer(PaymentActivity paymentActivity, Exception exc) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(exc, "");
        paymentActivity.MediaBrowserCompatItemReceiver().read(new deserializeIterableFromIntentExtraSafe.AudioAttributesCompatParcelizer(exc));
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i2 = MediaBrowserCompatItemReceiver + 55;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        return getshowpopup;
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        PaymentActivity paymentActivity = this;
        CmcdConfigurationRequestConfig.read(paymentActivity, new RemoteActionCompatParcelizer(null));
        CmcdConfigurationRequestConfig.read(paymentActivity, new read(null));
        int i2 = AudioAttributesImplBaseParcelizer + 11;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    static /* synthetic */ void RemoteActionCompatParcelizer(PaymentActivity paymentActivity, String str, String str2, getCreatedOnDateMs getcreatedondatems) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 121;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        paymentActivity.read(str, str2, null, getcreatedondatems);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = AudioAttributesImplBaseParcelizer + 63;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private final void read(String str, String str2, String str3, final getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 67;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getAutofillClient.Companion companion = getAutofillClient.INSTANCE;
        getAutofillClient getautofillclientAudioAttributesCompatParcelizer = getAutofillClient.Companion.AudioAttributesCompatParcelizer(str3 == null ? "" : str3, str, str2, null, 0, null, false, false, null, 440);
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(supportFragmentManager, "");
        getBrowserClient.IconCompatParcelizer(getautofillclientAudioAttributesCompatParcelizer, supportFragmentManager, null, new getCreatedOnDateMs() { // from class: o.writeStringList
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return PaymentActivity.RemoteActionCompatParcelizer(getcreatedondatems);
            }
        }, 2);
        int i4 = MediaBrowserCompatItemReceiver + 57;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final getShowPopup write(getCreatedOnDateMs getcreatedondatems) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 41;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            getcreatedondatems.invoke();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            int i3 = AudioAttributesImplBaseParcelizer + 95;
            MediaBrowserCompatItemReceiver = i3 % 128;
            int i4 = i3 % 2;
            return getshowpopup;
        }
        getcreatedondatems.invoke();
        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        throw null;
    }

    private final void RemoteActionCompatParcelizer(String str) {
        int i = 2 % 2;
        Intent intent = new Intent();
        intent.putExtra("paymentStatusMessage", str);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        setResult(-1, intent);
        finish();
        int i2 = MediaBrowserCompatItemReceiver + 25;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 79 / 0;
        }
    }

    @Override // com.razorpay.PaymentResultListener
    public final void onPaymentSuccess(String razorpayPaymentId) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 53;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(razorpayPaymentId, "");
        if (razorpayPaymentId.length() > 0) {
            MediaBrowserCompatItemReceiver().read(new deserializeIterableFromIntentExtraSafe.AudioAttributesImplApi21Parcelizer(razorpayPaymentId));
            return;
        }
        MediaBrowserCompatItemReceiver().read(new deserializeIterableFromIntentExtraSafe.MediaBrowserCompatItemReceiver("Failed to generate order id"));
        int i4 = MediaBrowserCompatItemReceiver + 31;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.razorpay.PaymentResultListener
    public final void onPaymentError(int errorCode, String response) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(response, "");
        MediaBrowserCompatItemReceiver().read(new deserializeIterableFromIntentExtraSafe.read(errorCode, response));
        if (errorCode != 0) {
            if (errorCode == 2) {
                MediaBrowserCompatItemReceiver().read(deserializeIterableFromIntentExtraSafe.MediaBrowserCompatCustomActionResultReceiver.INSTANCE);
                return;
            }
            int i2 = AudioAttributesImplBaseParcelizer + 25;
            MediaBrowserCompatItemReceiver = i2 % 128;
            int i3 = i2 % 2;
            if (errorCode != 5) {
                MediaBrowserCompatItemReceiver().read(new deserializeIterableFromIntentExtraSafe.MediaBrowserCompatItemReceiver(response));
                return;
            }
        }
        MediaBrowserCompatItemReceiver().read(deserializeIterableFromIntentExtraSafe.IconCompatParcelizer.INSTANCE);
        int i4 = AudioAttributesImplBaseParcelizer + 11;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        PaymentActivity paymentActivity = (PaymentActivity) objArr[0];
        readShort.IconCompatParcelizer iconCompatParcelizer = (readShort.IconCompatParcelizer) objArr[1];
        int i = 2 % 2;
        Object obj = null;
        try {
            new Checkout().open(paymentActivity, read(iconCompatParcelizer));
            int i2 = MediaBrowserCompatItemReceiver + 75;
            AudioAttributesImplBaseParcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        } catch (Exception e) {
            paymentActivity.MediaBrowserCompatItemReceiver().read(new deserializeIterableFromIntentExtraSafe.MediaBrowserCompatItemReceiver("Error in payment: ".concat(String.valueOf(e.getMessage()))));
            paymentActivity.MediaBrowserCompatItemReceiver().read(new deserializeIterableFromIntentExtraSafe.AudioAttributesCompatParcelizer(e));
            return null;
        }
    }

    private static JSONObject read(readShort.IconCompatParcelizer iconCompatParcelizer) throws JSONException {
        int i = 2 % 2;
        int iconCompatParcelizer2 = iconCompatParcelizer.getIconCompatParcelizer();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("email", true);
        jSONObject.put(NotesDispatchAddressRequestKt.KEY_CONTACT, true);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("email", iconCompatParcelizer.getAudioAttributesImplApi21Parcelizer());
        jSONObject2.put(NotesDispatchAddressRequestKt.KEY_CONTACT, iconCompatParcelizer.getMediaBrowserCompatItemReceiver());
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("plan_id", iconCompatParcelizer.getMediaBrowserCompatMediaItem());
        jSONObject3.put("user_id", iconCompatParcelizer.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver());
        jSONObject3.put("email", iconCompatParcelizer.getAudioAttributesImplApi21Parcelizer());
        jSONObject3.put(NotesDispatchAddressRequestKt.KEY_CONTACT, iconCompatParcelizer.getMediaBrowserCompatItemReceiver());
        jSONObject3.putOpt("name", iconCompatParcelizer.getRatingCompat());
        jSONObject3.putOpt("alt_phone", iconCompatParcelizer.getRemoteActionCompatParcelizer());
        jSONObject3.putOpt(NotesDispatchAddressRequestKt.KEY_ADD_LINE1, iconCompatParcelizer.getAudioAttributesCompatParcelizer());
        jSONObject3.putOpt(NotesDispatchAddressRequestKt.KEY_ADD_LINE2, iconCompatParcelizer.getRead());
        jSONObject3.putOpt(NotesDispatchAddressRequestKt.KEY_ADD_LINE3, iconCompatParcelizer.getWrite());
        jSONObject3.putOpt(NotesDispatchAddressRequestKt.KEY_CITY, iconCompatParcelizer.getAudioAttributesImplApi26Parcelizer());
        jSONObject3.putOpt(NotesDispatchAddressRequestKt.KEY_STATE, iconCompatParcelizer.getOnCommand());
        jSONObject3.putOpt("pincode", iconCompatParcelizer.getMediaDescriptionCompat());
        JSONObject jSONObject4 = new JSONObject();
        jSONObject4.put("amount", iconCompatParcelizer2 * 100);
        jSONObject4.put(PayloadKt.KEY_JP_CURRENCY, iconCompatParcelizer.getAudioAttributesImplBaseParcelizer());
        jSONObject4.put("name", "Marrow Notes Subscription");
        String handleMediaPlayPauseIfPendingOnHandler = iconCompatParcelizer.getHandleMediaPlayPauseIfPendingOnHandler();
        String mediaBrowserCompatMediaItem = iconCompatParcelizer.getMediaBrowserCompatMediaItem();
        StringBuilder sb = new StringBuilder();
        sb.append(handleMediaPlayPauseIfPendingOnHandler);
        sb.append(", ");
        sb.append(mediaBrowserCompatMediaItem);
        jSONObject4.put("description", sb.toString());
        jSONObject4.put(PaymentConstants.ORDER_ID, iconCompatParcelizer.getMediaBrowserCompatSearchResultReceiver());
        jSONObject4.put("readOnly", jSONObject);
        jSONObject4.put("prefill", jSONObject2);
        jSONObject4.put(CourseConfigKeyConstantsKt.KEY_NOTES, jSONObject3);
        int i2 = MediaBrowserCompatItemReceiver + 91;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            return jSONObject4;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // kotlin.writeSparseLongArray, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 442
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow2.ui.payment.PaymentActivity.onResume():void");
    }

    @Override // kotlin.writeSparseLongArray, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 34, new char[]{2644, 2613, 25209, 15570, 36049, 6362, 12607, 1255, 28975, 48073, 2501, 37802, 64541, 14052, 33533, 5822, 31529, 45595, 8077, 35077, 58994, 10501, 39057, 3073, 28004, 42040, 5539, 34609, 59469, 8992}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(1 - ((Process.getThreadPriority(0) + 20) >> 6), new char[]{4772, 4807, 4494, 20286, 31134, 61058, 50278, 62143, 27093, 51257, 64652, 26013, 58620, 17683, 30648, 57505, 25595, 49646, 60116, 32605, 65179, 23285}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i2 = AudioAttributesImplBaseParcelizer + 21;
                MediaBrowserCompatItemReceiver = i2 % 128;
                int i3 = i2 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i4 = MediaBrowserCompatItemReceiver + 45;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 4535), (ViewConfiguration.getTouchSlop() >> 8) + 6054, 42 - Color.green(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 6030 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0') + 25, -861814097, false, "read", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
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

    @Override // kotlin.writeSparseLongArray, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Context applicationContext;
        String strValueOf;
        String strValueOf2;
        Object[] objArr;
        Object[] objArr2;
        List<Object[]> list;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object[] objArr3 = new Object[1];
        e(true, KeyEvent.keyCodeFromString("") + 2, new char[]{11, 65534, 16, 16, 2, 0, '\f', 15, 65517, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) + 170, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 17, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        f(1 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), new char[]{48305, 48348, 57728, 48956, 45650, 10311, 3981, 13409, 51137}, objArr4);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            if (context != null) {
                int i2 = AudioAttributesImplBaseParcelizer + 113;
                MediaBrowserCompatItemReceiver = i2 % 128;
                if (i2 % 2 == 0) {
                    boolean z = context instanceof ContextWrapper;
                    throw null;
                }
                if ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) {
                    int i3 = AudioAttributesImplBaseParcelizer + 27;
                    MediaBrowserCompatItemReceiver = i3 % 128;
                    int i4 = i3 % 2;
                    applicationContext = null;
                } else {
                    applicationContext = context.getApplicationContext();
                }
            } else {
                applicationContext = context;
            }
            if (applicationContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (Process.myPid() >> 22)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6054, 41 - TextUtils.indexOf((CharSequence) "", '0', 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    e(false, (ViewConfiguration.getFadingEdgeLength() >> 16) + 24, new char[]{65517, 27, 65513, 22, 65512, 65510, 65511, 65509, 26, 65511, 65515, 26, 23, 24, 23, 65516, 25, 65512, 65518, 65514, 65517, 65518, 27, 26, 24, 65514, 65509, 27, 24, 25, 22, 23, 65513, 65515, 65512, 65518, 26, 27, 25, 65514, 65509, 26, 24, 65509, 65512, 26, 27, 65518}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 81, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 13, objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    f(1 - TextUtils.indexOf("", "", 0, 0), new char[]{51512, 51464, 48189, 58011, 29816, 7603, 51601, 460, 45595, 25989, 61752, 38553, 16165, 59623, 31303, 5081, 47156, 27661, 59187, 35953, 9481, 63309, 24618, 2410, 44650, 31276, 60747, 33350, 11042, 64817, 27042, 65339, 38029, '[', 53941, 30759, 4520, 35692, 24537, 62736, 39658, 3702, 55452, 29183, 1992, 37255, 17825, 60095, 32896, 5370, 52934, 26499, 3576, 40881, 19422, 57539, 35085, 8909, 13355, 23978, 29208, 42374, 45398, 54984, 65313, 10409, 14868, 21376}, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 44, new char[]{65521, 26, 27, 65514, 65515, 65514, 65516, 65515, 65522, 30, 29, 65522, 65516, 65519, 65514, 65521, 65517, 26, 65520, 30, 26, 30, 65516, 31, 65514, 65515, 30, 65513, 28, 65515, 65513, 26, 65518, 29, 31, 26, 65514, 65519, 65516, 28, 65514, 27, 65518, 27, 65519, 65520, 65519, 65521, 27, 65514, 26, 29, 65514, 65515, 28, 65521, 29, 29, 65518, 65514, 65521, 26, 29, 29}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 181, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 27, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 32, new char[]{17, 18, '\f', 3, 20, 3, 65485, 65488, 20, 65485, 18, 17, 3, 5, '\f', 7, 65485, 7, 14, 65535, 65485, 11, '\r', 1, 65484, 3, 16, 65535, 19, 15, 17, 2, 16, 65535, 19, 5, 65484, 18, 17, 65535, 1, 18, 65535, 3, 16, 6, 18, 65484, 17, 2, '\f', 19, '\r', 16, 23, '\n', 7, 65535, 2, 65485, 65485, 65496, 17, 14, 18, 18, 6}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) + 181, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 57, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    e(false, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 1, new char[]{65532, 0, 7, 65532, 65535, 2}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + TsExtractor.TS_STREAM_TYPE_E_AC3, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 5, objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 114, new char[]{47066, 47080, 4037, 20785, 44166, 51328, 4462, 54520, 52472, 54830, 10689, 17322, 16863, 23312, 41658, 50871, 50816, 57321, 16284, 22853, 23486, 17639, 47257, 56414, 53468, 51678, 13744, 22374, 21956, 20175, 45325, 10765, 60001, 46065, 2587, 44357, 28491, 14529, 34674, 8225}, objArr10);
                    Object[] objArr11 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr10[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 6029 - MotionEvent.axisFromString(""), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr11);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Context applicationContext2 = context;
        try {
            if (applicationContext2 != null) {
                int i5 = AudioAttributesImplBaseParcelizer + 95;
                MediaBrowserCompatItemReceiver = i5 % 128;
                if (i5 % 2 == 0) {
                    boolean z2 = applicationContext2 instanceof ContextWrapper;
                    throw null;
                }
                if ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) {
                    int i6 = AudioAttributesImplBaseParcelizer + 73;
                    MediaBrowserCompatItemReceiver = i6 % 128;
                    int i7 = i6 % 2;
                    applicationContext2 = null;
                } else {
                    applicationContext2 = context.getApplicationContext();
                }
            }
            try {
                Object[] objArr12 = {1450342306};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1128409246);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) Color.alpha(0), (Process.myTid() >> 22) + 1991, 12 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1024191497, false, null, new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr13 = {applicationContext2, ((Constructor) objRemoteActionCompatParcelizer3).newInstance(objArr12)};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(352975618);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char scrollBarFadeDuration = (char) (19323 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                        int maximumDrawingCacheSize = 2759 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        int i8 = 100 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        Object[] objArr14 = new Object[1];
                        g((short) 109, r7[70], (byte) ($$d[4] - 1), objArr14);
                        objRemoteActionCompatParcelizer4 = startForeground.read(scrollBarFadeDuration, maximumDrawingCacheSize, i8, 1799372695, false, (String) objArr14[0], new Class[]{Context.class, (Class) startForeground.IconCompatParcelizer((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 9580), 3446 - TextUtils.getOffsetBefore("", 0), 144 - KeyEvent.getDeadChar(0, 0))});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr13);
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
        } catch (Throwable th4) {
            Object[] objArr15 = new Object[1];
            f(TextUtils.getOffsetAfter("", 0) + 1, new char[]{46323, 46283, 32426, 8286, 55298, 17225, 26046, 24374, 53203, 42816, 23831, 51309, 17133, 10869, 54840}, objArr15);
            String str6 = (String) objArr15[0];
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintStream printStream = new PrintStream(byteArrayOutputStream);
                th4.printStackTrace(printStream);
                printStream.close();
                strValueOf = byteArrayOutputStream.toString(CharsetNames.UTF_8);
            } catch (Throwable unused) {
                strValueOf = String.valueOf(th4);
            }
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(strValueOf);
            arrayList.add(str6);
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer5 == null) {
                objRemoteActionCompatParcelizer5 = startForeground.read((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4536), Color.green(0) + 6054, 'Z' - AndroidCharacter.getMirror('0'), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer5).invoke(null, null);
            try {
                Object[] objArr16 = {1450342306, 81604378625L, arrayList, TrainingApplication.RemoteActionCompatParcelizer(), false};
                Class cls2 = (Class) startForeground.IconCompatParcelizer((char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 6030 - TextUtils.getOffsetBefore("", 0), 25 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                Object[] objArr17 = new Object[1];
                h((byte) ($$j[48] - 1), r5[9], r5[31], objArr17);
                cls2.getMethod((String) objArr17[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr16);
            } catch (Throwable th5) {
                Throwable cause4 = th5.getCause();
                if (cause4 == null) {
                    throw th5;
                }
                throw cause4;
            }
        }
        try {
            Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-18205161);
            if (objRemoteActionCompatParcelizer6 == null) {
                char cIndexOf = (char) (61147 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 2146;
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 12;
                byte b = $$d[5];
                Object[] objArr18 = new Object[1];
                g((short) 136, b, b, objArr18);
                objRemoteActionCompatParcelizer6 = startForeground.read(cIndexOf, iLastIndexOf, longPressTimeout, -2136739198, false, (String) objArr18[0], null);
            }
            if (((Field) objRemoteActionCompatParcelizer6).getLong(null) != -1) {
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-629126231);
                if (objRemoteActionCompatParcelizer7 == null) {
                    char c = (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 61147);
                    int i9 = 2146 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    int defaultSize = View.getDefaultSize(0, 0) + 12;
                    Object[] objArr19 = new Object[1];
                    g((short) 139, r6[62], (byte) (-$$d[164]), objArr19);
                    objRemoteActionCompatParcelizer7 = startForeground.read(c, i9, defaultSize, -1530294468, false, (String) objArr19[0], null);
                }
                list = (List) ((Field) objRemoteActionCompatParcelizer7).get(null);
            } else {
                Object[] objArr20 = new Object[1];
                e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 33, new char[]{18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17}, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 217, (ViewConfiguration.getEdgeSlop() >> 16) + 16, objArr20);
                Class<?> cls3 = Class.forName((String) objArr20[0]);
                Object[] objArr21 = new Object[1];
                f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 3, new char[]{10846, 10807, 6831, 17422, 7922, 15860, 41757, 8661, 20798, 49951, 39927, 46799, 56382, 20003, 4316, 13258, 23329, 51905, 36287, 44091}, objArr21);
                int iIntValue2 = ((Integer) cls3.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
                try {
                    Object[] objArr22 = {1450342306};
                    Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-173351824);
                    if (objRemoteActionCompatParcelizer8 == null) {
                        objRemoteActionCompatParcelizer8 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 45844), TextUtils.getCapsMode("", 0, 0) + 913, 9 - MotionEvent.axisFromString(""), -1948051227, false, null, new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr23 = {Integer.valueOf(iIntValue2), ((Constructor) objRemoteActionCompatParcelizer8).newInstance(objArr22)};
                        Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(1891595430);
                        if (objRemoteActionCompatParcelizer9 == null) {
                            char c2 = (char) (61147 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)));
                            int iMyPid = 2145 - (Process.myPid() >> 22);
                            int iMyTid = (Process.myTid() >> 22) + 12;
                            byte[] bArr = $$d;
                            Object[] objArr24 = new Object[1];
                            g((short) 168, (byte) (-bArr[61]), (byte) (-bArr[45]), objArr24);
                            objRemoteActionCompatParcelizer9 = startForeground.read(c2, iMyPid, iMyTid, 251047987, false, (String) objArr24[0], new Class[]{Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), KeyEvent.getDeadChar(0, 0) + 557, 18 - View.MeasureSpec.makeMeasureSpec(0, 0))});
                        }
                        list = (List) ((Method) objRemoteActionCompatParcelizer9).invoke(null, objArr23);
                        Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(-629126231);
                        if (objRemoteActionCompatParcelizer10 == null) {
                            char c3 = (char) (61149 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                            int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 2145;
                            int longPressTimeout3 = 12 - (ViewConfiguration.getLongPressTimeout() >> 16);
                            Object[] objArr25 = new Object[1];
                            g((short) 139, r7[62], (byte) (-$$d[164]), objArr25);
                            objRemoteActionCompatParcelizer10 = startForeground.read(c3, longPressTimeout2, longPressTimeout3, -1530294468, false, (String) objArr25[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer10).set(null, list);
                        Object[] objArr26 = new Object[1];
                        e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 33, new char[]{0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f'}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 218, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 24, objArr26);
                        Class<?> cls4 = Class.forName((String) objArr26[0]);
                        Object[] objArr27 = new Object[1];
                        e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 29, new char[]{65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + TsExtractor.TS_PACKET_SIZE, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, objArr27);
                        long jLongValue = ((Long) cls4.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(301834150);
                        if (objRemoteActionCompatParcelizer11 == null) {
                            char offsetBefore = (char) (61148 - TextUtils.getOffsetBefore("", 0));
                            int i10 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2144;
                            int mode = View.MeasureSpec.getMode(0) + 12;
                            Object[] objArr28 = new Object[1];
                            g((short) 109, r13[70], (byte) ($$d[4] - 1), objArr28);
                            objRemoteActionCompatParcelizer11 = startForeground.read(offsetBefore, i10, mode, 1874090803, false, (String) objArr28[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer11).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(-18205161);
                        if (objRemoteActionCompatParcelizer12 == null) {
                            char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 61148);
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 2145;
                            int i11 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 11;
                            byte b2 = $$d[5];
                            Object[] objArr29 = new Object[1];
                            g((short) 136, b2, b2, objArr29);
                            objRemoteActionCompatParcelizer12 = startForeground.read(fadingEdgeLength, iNormalizeMetaState, i11, -2136739198, false, (String) objArr29[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer12).set(null, lValueOf2);
                    } catch (Throwable th6) {
                        Throwable cause5 = th6.getCause();
                        if (cause5 == null) {
                            throw th6;
                        }
                        throw cause5;
                    }
                } catch (Throwable th7) {
                    Throwable cause6 = th7.getCause();
                    if (cause6 == null) {
                        throw th7;
                    }
                    throw cause6;
                }
            }
            for (Object[] objArr30 : list) {
                int i12 = AudioAttributesImplBaseParcelizer + 81;
                MediaBrowserCompatItemReceiver = i12 % 128;
                int i13 = i12 % 2;
                int i14 = ((int[]) objArr30[3])[0];
                int i15 = ((int[]) objArr30[1])[0];
                if (i15 != i14) {
                    ArrayList arrayList2 = new ArrayList();
                    String[] strArr = (String[]) objArr30[2];
                    if (strArr != null) {
                        int i16 = MediaBrowserCompatItemReceiver + 53;
                        AudioAttributesImplBaseParcelizer = i16 % 128;
                        for (int i17 = i16 % 2 != 0 ? 1 : 0; i17 < strArr.length; i17++) {
                            int i18 = MediaBrowserCompatItemReceiver + 7;
                            AudioAttributesImplBaseParcelizer = i18 % 128;
                            int i19 = i18 % 2;
                            arrayList2.add(strArr[i17]);
                        }
                    }
                    long j = -1;
                    long j2 = ((long) (i15 ^ i14)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
                    long j3 = 0;
                    long j4 = j2 | (((long) 10) << 32) | (j3 - ((j3 >> 63) << 32));
                    try {
                        Object objRemoteActionCompatParcelizer13 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                        if (objRemoteActionCompatParcelizer13 == null) {
                            objRemoteActionCompatParcelizer13 = startForeground.read((char) (Color.alpha(0) + 4535), (ViewConfiguration.getFadingEdgeLength() >> 16) + 6054, 42 - (Process.myTid() >> 22), -764908173, false, "IconCompatParcelizer", new Class[0]);
                        }
                        Object objInvoke3 = ((Method) objRemoteActionCompatParcelizer13).invoke(null, null);
                        try {
                            Object[] objArr31 = {1450342306, Long.valueOf(j4), arrayList2, TrainingApplication.RemoteActionCompatParcelizer(), false};
                            Class cls5 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getEdgeSlop() >> 16), 6030 - Color.blue(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 24);
                            Object[] objArr32 = new Object[1];
                            h((byte) ($$j[48] - 1), r5[9], r5[31], objArr32);
                            cls5.getMethod((String) objArr32[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke3, objArr31);
                        } catch (Throwable th8) {
                            Throwable cause7 = th8.getCause();
                            if (cause7 == null) {
                                throw th8;
                            }
                            throw cause7;
                        }
                    } catch (Throwable th9) {
                        Throwable cause8 = th9.getCause();
                        if (cause8 == null) {
                            throw th9;
                        }
                        throw cause8;
                    }
                }
            }
        } catch (Throwable th10) {
            Object[] objArr33 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length(), new char[]{65533, 4, 1, 65531, 65535, 65533, 4, 65535, 4, 1, 2}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 169, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 10, objArr33);
            String str7 = (String) objArr33[0];
            try {
                ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                PrintStream printStream2 = new PrintStream(byteArrayOutputStream2);
                th10.printStackTrace(printStream2);
                printStream2.close();
                strValueOf2 = byteArrayOutputStream2.toString(CharsetNames.UTF_8);
            } catch (Throwable unused2) {
                strValueOf2 = String.valueOf(th10);
            }
            ArrayList arrayList3 = new ArrayList(2);
            arrayList3.add(strValueOf2);
            arrayList3.add(str7);
            Object objRemoteActionCompatParcelizer14 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer14 == null) {
                objRemoteActionCompatParcelizer14 = startForeground.read((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 4535), 6054 - KeyEvent.getDeadChar(0, 0), 42 - (ViewConfiguration.getScrollBarSize() >> 8), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke4 = ((Method) objRemoteActionCompatParcelizer14).invoke(null, null);
            Object[] objArr34 = {1450342306, 81604378625L, arrayList3, TrainingApplication.RemoteActionCompatParcelizer(), false};
            Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 6030 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getLongPressTimeout() >> 16) + 24);
            Object[] objArr35 = new Object[1];
            h((byte) ($$j[48] - 1), r4[9], r4[31], objArr35);
            cls6.getMethod((String) objArr35[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke4, objArr34);
        }
        Object objRemoteActionCompatParcelizer15 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer15 == null) {
            char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13183);
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1649;
            int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 26;
            byte[] bArr2 = $$d;
            short s = bArr2[5];
            byte b3 = bArr2[62];
            Object[] objArr36 = new Object[1];
            g(s, b3, (byte) (b3 + 3), objArr36);
            objRemoteActionCompatParcelizer15 = startForeground.read(keyRepeatTimeout, scrollDefaultDelay, fadingEdgeLength2, -133433128, false, (String) objArr36[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer15).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer16 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer16 == null) {
                char packedPositionChild = (char) (13182 - ExpandableListView.getPackedPositionChild(0L));
                int maxKeyCode = 1649 - (KeyEvent.getMaxKeyCode() >> 16);
                int iIndexOf = 25 - TextUtils.indexOf((CharSequence) "", '0', 0);
                byte[] bArr3 = $$d;
                Object[] objArr37 = new Object[1];
                g((short) (-bArr3[27]), bArr3[9], (byte) (-bArr3[8]), objArr37);
                objRemoteActionCompatParcelizer16 = startForeground.read(packedPositionChild, maxKeyCode, iIndexOf, -1033747278, false, (String) objArr37[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer16).get(null);
        } else {
            Object[] objArr38 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 1, new char[]{18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) + 119, ImageFormat.getBitsPerPixel(0) + 17, objArr38);
            Class<?> cls7 = Class.forName((String) objArr38[0]);
            Object[] objArr39 = new Object[1];
            f((ViewConfiguration.getEdgeSlop() >> 16) + 1, new char[]{10846, 10807, 6831, 17422, 7922, 15860, 41757, 8661, 20798, 49951, 39927, 46799, 56382, 20003, 4316, 13258, 23329, 51905, 36287, 44091}, objArr39);
            try {
                Object[] objArr40 = {Integer.valueOf(((Integer) cls7.getMethod((String) objArr39[0], Object.class).invoke(null, this)).intValue()), 0, -855978290};
                byte[] bArr4 = $$j;
                byte b4 = bArr4[104];
                byte b5 = b4;
                Object[] objArr41 = new Object[1];
                h(b5, (byte) (b5 | 8), b4, objArr41);
                Class<?> cls8 = Class.forName((String) objArr41[0]);
                Object[] objArr42 = new Object[1];
                h((byte) (bArr4[9] + 1), bArr4[104], bArr4[29], objArr42);
                objArr = (Object[]) cls8.getMethod((String) objArr42[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr40);
                Object objRemoteActionCompatParcelizer17 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer17 == null) {
                    char cKeyCodeFromString = (char) (13183 - KeyEvent.keyCodeFromString(""));
                    int tapTimeout = 1649 - (ViewConfiguration.getTapTimeout() >> 16);
                    int i20 = 27 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                    byte[] bArr5 = $$d;
                    Object[] objArr43 = new Object[1];
                    g((short) (-bArr5[27]), bArr5[9], (byte) (-bArr5[8]), objArr43);
                    objRemoteActionCompatParcelizer17 = startForeground.read(cKeyCodeFromString, tapTimeout, i20, -1033747278, false, (String) objArr43[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer17).set(null, objArr);
                try {
                    Object[] objArr44 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 33, new char[]{0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f'}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 209, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) - 27, objArr44);
                    Class<?> cls9 = Class.forName((String) objArr44[0]);
                    Object[] objArr45 = new Object[1];
                    e(false, (ViewConfiguration.getTapTimeout() >> 16) + 6, new char[]{65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + TsExtractor.TS_PACKET_SIZE, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 14, objArr45);
                    long jLongValue2 = ((Long) cls9.getDeclaredMethod((String) objArr45[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf3 = Long.valueOf(jLongValue2);
                    Object objRemoteActionCompatParcelizer18 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer18 == null) {
                        char cGreen = (char) (Color.green(0) + 13183);
                        int iGreen = 1649 - Color.green(0);
                        int threadPriority = 26 - ((Process.getThreadPriority(0) + 20) >> 6);
                        Object[] objArr46 = new Object[1];
                        g((short) 76, r9[9], (byte) (-$$d[8]), objArr46);
                        objRemoteActionCompatParcelizer18 = startForeground.read(cGreen, iGreen, threadPriority, 54351865, false, (String) objArr46[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer18).set(null, lValueOf3);
                    Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                    Object objRemoteActionCompatParcelizer19 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer19 == null) {
                        char cIndexOf2 = (char) (13182 - TextUtils.indexOf((CharSequence) "", '0', 0));
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1649;
                        int iMyTid2 = (Process.myTid() >> 22) + 26;
                        byte[] bArr6 = $$d;
                        short s2 = bArr6[5];
                        byte b6 = bArr6[62];
                        Object[] objArr47 = new Object[1];
                        g(s2, b6, (byte) (b6 + 3), objArr47);
                        objRemoteActionCompatParcelizer19 = startForeground.read(cIndexOf2, touchSlop, iMyTid2, -133433128, false, (String) objArr47[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer19).set(null, lValueOf4);
                } catch (Exception unused3) {
                    throw new RuntimeException();
                }
            } catch (Throwable th11) {
                Throwable cause9 = th11.getCause();
                if (cause9 == null) {
                    throw th11;
                }
                throw cause9;
            }
        }
        int i21 = ((int[]) objArr[3])[0];
        int i22 = ((int[]) objArr[2])[0];
        if (i22 != i21) {
            long j5 = -1;
            long j6 = ((long) (i22 ^ i21)) & ((((long) 0) << 32) | (j5 - ((j5 >> 63) << 32)));
            long j7 = 0;
            long j8 = j6 | (((long) 2) << 32) | (j7 - ((j7 >> 63) << 32));
            Object objRemoteActionCompatParcelizer20 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer20 == null) {
                objRemoteActionCompatParcelizer20 = startForeground.read((char) (4534 - TextUtils.indexOf((CharSequence) "", '0')), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6053, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke5 = ((Method) objRemoteActionCompatParcelizer20).invoke(null, null);
            Object[] objArr48 = {1450342306, Long.valueOf(j8), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
            Class cls10 = (Class) startForeground.IconCompatParcelizer((char) ((-1) - MotionEvent.axisFromString("")), (ViewConfiguration.getTapTimeout() >> 16) + 6030, KeyEvent.normalizeMetaState(0) + 24);
            Object[] objArr49 = new Object[1];
            h((byte) ($$j[48] - 1), r2[9], r2[31], objArr49);
            cls10.getMethod((String) objArr49[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke5, objArr48);
        }
        Object objRemoteActionCompatParcelizer21 = startForeground.RemoteActionCompatParcelizer(-2008995297);
        if (objRemoteActionCompatParcelizer21 == null) {
            char keyRepeatTimeout2 = (char) (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            int i23 = 943 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            int iAxisFromString = 35 - MotionEvent.axisFromString("");
            byte b7 = $$d[5];
            Object[] objArr50 = new Object[1];
            g((short) 136, b7, b7, objArr50);
            objRemoteActionCompatParcelizer21 = startForeground.read(keyRepeatTimeout2, i23, iAxisFromString, -167186806, false, (String) objArr50[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer21).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer22 = startForeground.RemoteActionCompatParcelizer(-757676623);
            if (objRemoteActionCompatParcelizer22 == null) {
                char cIndexOf3 = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1);
                int maximumDrawingCacheSize2 = 943 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                int iArgb = 36 - Color.argb(0, 0, 0, 0);
                Object[] objArr51 = new Object[1];
                g((short) 139, r2[62], (byte) (-$$d[164]), objArr51);
                objRemoteActionCompatParcelizer22 = startForeground.read(cIndexOf3, maximumDrawingCacheSize2, iArgb, -1398865628, false, (String) objArr51[0], null);
            }
            objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer22).get(null);
        } else {
            Object[] objArr52 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 32, new char[]{18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484, 65521, 23, 17}, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 217, 16 - View.getDefaultSize(0, 0), objArr52);
            Class<?> cls11 = Class.forName((String) objArr52[0]);
            Object[] objArr53 = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3), new char[]{10846, 10807, 6831, 17422, 7922, 15860, 41757, 8661, 20798, 49951, 39927, 46799, 56382, 20003, 4316, 13258, 23329, 51905, 36287, 44091}, objArr53);
            Object[] objArr54 = {Integer.valueOf(((Integer) cls11.getMethod((String) objArr53[0], Object.class).invoke(null, this)).intValue()), 0, 1170470913};
            Object objRemoteActionCompatParcelizer23 = startForeground.RemoteActionCompatParcelizer(-21191141);
            if (objRemoteActionCompatParcelizer23 == null) {
                char c4 = (char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 943;
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 36;
                byte[] bArr7 = $$d;
                Object[] objArr55 = new Object[1];
                g((short) 187, bArr7[9], bArr7[103], objArr55);
                objRemoteActionCompatParcelizer23 = startForeground.read(c4, capsMode, jumpTapTimeout, -2131402098, false, (String) objArr55[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
            }
            objArr2 = (Object[]) ((Method) objRemoteActionCompatParcelizer23).invoke(null, objArr54);
            Object objRemoteActionCompatParcelizer24 = startForeground.RemoteActionCompatParcelizer(-757676623);
            if (objRemoteActionCompatParcelizer24 == null) {
                char c5 = (char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int i24 = 944 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                int iResolveSize = View.resolveSize(0, 0) + 36;
                Object[] objArr56 = new Object[1];
                g((short) 139, r6[62], (byte) (-$$d[164]), objArr56);
                objRemoteActionCompatParcelizer24 = startForeground.read(c5, i24, iResolveSize, -1398865628, false, (String) objArr56[0], null);
            }
            ((Field) objRemoteActionCompatParcelizer24).set(null, objArr2);
            try {
                Object[] objArr57 = new Object[1];
                e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 2, new char[]{0, '\b', 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f'}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 218, (ViewConfiguration.getFadingEdgeLength() >> 16) + 22, objArr57);
                Class<?> cls12 = Class.forName((String) objArr57[0]);
                Object[] objArr58 = new Object[1];
                e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 108, new char[]{65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + TsExtractor.TS_PACKET_SIZE, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 11, objArr58);
                long jLongValue3 = ((Long) cls12.getDeclaredMethod((String) objArr58[0], new Class[0]).invoke(null, new Object[0])).longValue();
                Long lValueOf5 = Long.valueOf(jLongValue3);
                Object objRemoteActionCompatParcelizer25 = startForeground.RemoteActionCompatParcelizer(-1539638354);
                if (objRemoteActionCompatParcelizer25 == null) {
                    char pressedStateDuration = (char) (ViewConfiguration.getPressedStateDuration() >> 16);
                    int i25 = 944 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                    int iMyPid2 = (Process.myPid() >> 22) + 36;
                    Object[] objArr59 = new Object[1];
                    g((short) 109, r9[70], (byte) ($$d[4] - 1), objArr59);
                    objRemoteActionCompatParcelizer25 = startForeground.read(pressedStateDuration, i25, iMyPid2, -629981381, false, (String) objArr59[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer25).set(null, lValueOf5);
                Long lValueOf6 = Long.valueOf(jLongValue3 >> 12);
                Object objRemoteActionCompatParcelizer26 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                if (objRemoteActionCompatParcelizer26 == null) {
                    char mode2 = (char) View.MeasureSpec.getMode(0);
                    int fadingEdgeLength3 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 943;
                    int iKeyCodeFromString = 36 - KeyEvent.keyCodeFromString("");
                    byte b8 = $$d[5];
                    Object[] objArr60 = new Object[1];
                    g((short) 136, b8, b8, objArr60);
                    objRemoteActionCompatParcelizer26 = startForeground.read(mode2, fadingEdgeLength3, iKeyCodeFromString, -167186806, false, (String) objArr60[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer26).set(null, lValueOf6);
            } catch (Exception unused4) {
                throw new RuntimeException();
            }
        }
        int i26 = ((int[]) objArr2[2])[0];
        int i27 = ((int[]) objArr2[0])[0];
        if (i27 != i26) {
            long j9 = -1;
            long j10 = ((long) (i27 ^ i26)) & ((((long) 0) << 32) | (j9 - ((j9 >> 63) << 32)));
            long j11 = 0;
            long j12 = j10 | (((long) 1) << 32) | (j11 - ((j11 >> 63) << 32));
            Object objRemoteActionCompatParcelizer27 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer27 == null) {
                objRemoteActionCompatParcelizer27 = startForeground.read((char) (4535 - (ViewConfiguration.getTapTimeout() >> 16)), 6054 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 42 - View.resolveSizeAndState(0, 0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke6 = ((Method) objRemoteActionCompatParcelizer27).invoke(null, null);
            Object[] objArr61 = {1450342306, Long.valueOf(j12), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
            Class cls13 = (Class) startForeground.IconCompatParcelizer((char) (Process.myTid() >> 22), Drawable.resolveOpacity(0, 0) + 6030, 24 - (ViewConfiguration.getJumpTapTimeout() >> 16));
            Object[] objArr62 = new Object[1];
            h((byte) ($$j[48] - 1), r2[9], r2[31], objArr62);
            cls13.getMethod((String) objArr62[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke6, objArr61);
        }
    }

    public static /* synthetic */ getShowPopup write(PaymentActivity paymentActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 21;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver(paymentActivity);
        if (i3 != 0) {
            int i4 = 6 / 0;
        }
        int i5 = MediaBrowserCompatItemReceiver + 117;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return getshowpopupMediaBrowserCompatSearchResultReceiver;
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(PaymentActivity paymentActivity) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        return (getShowPopup) AudioAttributesCompatParcelizer(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite3, 571879407, iWrite2, iWrite, new Object[]{paymentActivity}, -571879407);
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 37;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupWrite = write(getcreatedondatems);
        int i4 = MediaBrowserCompatItemReceiver + 49;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return getshowpopupWrite;
        }
        throw null;
    }

    public static /* synthetic */ getShowPopup write(PaymentActivity paymentActivity, Exception exc) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 79;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            return AudioAttributesCompatParcelizer(paymentActivity, exc);
        }
        AudioAttributesCompatParcelizer(paymentActivity, exc);
        throw null;
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(PaymentActivity paymentActivity, int i, String str) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplBaseParcelizer + 101;
        MediaBrowserCompatItemReceiver = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {paymentActivity, Integer.valueOf(i), str};
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        getShowPopup getshowpopup = (getShowPopup) AudioAttributesCompatParcelizer(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 1124960217, iWrite2, iWrite, objArr, -1124960214);
        int i5 = AudioAttributesImplBaseParcelizer + 25;
        MediaBrowserCompatItemReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            return getshowpopup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(PaymentActivity paymentActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 11;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(paymentActivity);
        int i4 = AudioAttributesImplBaseParcelizer + 37;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return getshowpopupAudioAttributesImplBaseParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(PaymentActivity paymentActivity, String str, String str2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 77;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(paymentActivity, str, str2);
        int i4 = MediaBrowserCompatItemReceiver + 83;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopupRemoteActionCompatParcelizer;
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(PaymentActivity paymentActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 33;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupMediaDescriptionCompat = MediaDescriptionCompat(paymentActivity);
        int i4 = AudioAttributesImplBaseParcelizer + 85;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 12 / 0;
        }
        return getshowpopupMediaDescriptionCompat;
    }

    public static /* synthetic */ getShowPopup read(PaymentActivity paymentActivity) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 1;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            return RatingCompat(paymentActivity);
        }
        RatingCompat(paymentActivity);
        throw null;
    }

    static {
        AudioAttributesImplApi26Parcelizer = 1;
        AudioAttributesImplBaseParcelizer();
        read = new write(null);
        int i = AudioAttributesImplApi21Parcelizer + 109;
        AudioAttributesImplApi26Parcelizer = i % 128;
        if (i % 2 == 0) {
            int i2 = 57 / 0;
        }
    }

    public static final /* synthetic */ void RemoteActionCompatParcelizer(PaymentActivity paymentActivity, String str) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        AudioAttributesCompatParcelizer(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite3, 940266909, iWrite2, iWrite, new Object[]{paymentActivity, str}, -940266904);
    }

    public static final /* synthetic */ parseSegmentList MediaBrowserCompatItemReceiver(PaymentActivity paymentActivity) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        return (parseSegmentList) AudioAttributesCompatParcelizer(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite3, -731410206, iWrite2, iWrite, new Object[]{paymentActivity}, 731410207);
    }

    public static final /* synthetic */ serializeToIntentExtra AudioAttributesImplApi21Parcelizer(PaymentActivity paymentActivity) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        return (serializeToIntentExtra) AudioAttributesCompatParcelizer(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite3, -107693158, iWrite2, iWrite, new Object[]{paymentActivity}, 107693164);
    }

    private static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(PaymentActivity paymentActivity) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        return (getShowPopup) AudioAttributesCompatParcelizer(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite3, 1083867060, iWrite2, iWrite, new Object[]{paymentActivity}, -1083867058);
    }

    private static final getShowPopup write(PaymentActivity paymentActivity, int i, String str) {
        Object[] objArr = {paymentActivity, Integer.valueOf(i), str};
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        return (getShowPopup) AudioAttributesCompatParcelizer(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 1124960217, iWrite2, iWrite, objArr, -1124960214);
    }

    private final void write(readShort.IconCompatParcelizer iconCompatParcelizer) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        AudioAttributesCompatParcelizer(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite3, 1669579087, iWrite2, iWrite, new Object[]{this, iconCompatParcelizer}, -1669579083);
    }

    @Override // kotlin.writeSparseLongArray, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 69;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void AudioAttributesImplBaseParcelizer() {
        RemoteActionCompatParcelizer = 1000326211;
        MediaBrowserCompatCustomActionResultReceiver = 754030114159462494L;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        PaymentActivity paymentActivity = (PaymentActivity) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 63;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        getShowPopup getshowpopup = (getShowPopup) AudioAttributesCompatParcelizer(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite3, 1083867060, iWrite2, iWrite, new Object[]{paymentActivity}, -1083867058);
        int i4 = MediaBrowserCompatItemReceiver + 53;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }
}
