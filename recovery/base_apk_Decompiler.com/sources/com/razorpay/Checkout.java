package com.razorpay;

import android.app.Activity;
import android.app.Fragment;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import com.razorpay.AnalyticsProperty;
import com.razorpay.OpinionatedSoln;
import in.juspay.hypersdk.core.PaymentConstants;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.isStopped;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
public class Checkout extends Fragment {
    private static char AudioAttributesCompatParcelizer = 0;
    static final String EVENT_CALLBACK_DNE = "dne";
    static final String EVENT_CALLBACK_THREW_ERROR = "threw_error";
    static final int EXTERNAL_WALLET = 4;
    public static final int INCOMPATIBLE_PLUGIN = 7;
    static final int INTEGRATION_ONE = 1;
    static final int INTEGRATION_THREE = 3;
    static final int INTEGRATION_TWO = 2;
    public static final int INVALID_OPTIONS = 3;
    private static char IconCompatParcelizer = 0;
    public static final int MAGICX_REQUEST_CODE = 98001;
    public static final int MAGICX_RESPONSE_CODE = 99002;
    public static final int NETWORK_ERROR = 2;
    public static final int PAYMENT_CANCELED = 0;
    static final int PAYMENT_SUCCESS = 1;
    public static final int RZP_REQUEST_CODE = 62442;
    private static char RemoteActionCompatParcelizer = 0;
    public static final int TLS_ERROR = 6;
    public static final int WEBVIEW_CREATION_FAILED = 8;
    public static volatile boolean isPreloadTriggered = false;
    private static PaymentData paymentData;
    private static int read;
    private static Class<? extends Activity> sAddressWalletUpdateActivityClass;
    private static WeakReference<EventCallback> sEventCallback;
    private static long sPreloadAbortDuration;
    private static long sPreloadCompleteDuration;
    private static boolean sPreloadFailed;
    private static WebView sPreloadView;
    private static ArrayList<String> sSubscribedAnalyticsEvents;
    private static char write;
    private int checkoutImage;
    private boolean disableFullScreen;
    private boolean isMethodOverridden;
    private String key;
    private Activity merchantActivity;
    private String merchantClassName;
    private JSONObject options;
    public UpiTurboCheckout upiTurbo;
    private static final byte[] $$c = {TarConstants.LF_SYMLINK, -57, 8, -14};
    private static final int $$f = 62;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {36, 33, 122, TarConstants.LF_DIR, -58, 64, 5, 22, -25, 27, 20, -1, -4, 19, -6, 15, 10, -16, 36, 1, -65, TarConstants.LF_DIR, 26, 15, 9, 12, -8, -29, 41, 24, -4, 13, 6, -36, TarConstants.LF_CHR, 5, 10, -8, 26, -29, 24, 24, -8, 9, 14, 4, 24, -14, 20, 26, 15, 9, 12, -8, -29, 41, 24, -4, 13, 6, -36, TarConstants.LF_CHR, 5, 10, -8, 26, -29, 24, 24, -8, 9, 14, 4, 24, -14, 20};
    private static final int $$e = 245;
    private static final byte[] $$a = {34, TarConstants.LF_NORMAL, 18, 42, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 75;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int AudioAttributesImplApi21Parcelizer = 1;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    boolean isGlobalConfigLoaded = false;
    private PaymentResultListener paymentResultListenerFromClass = null;
    private PaymentResultWithDataListener paymentResultWithDataListenerFromClass = null;
    private ExternalWalletListener externalWalletListenerFromClass = null;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r5, short r6, short r7) {
        /*
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r5 = r5 * 4
            int r0 = r5 + 1
            int r7 = r7 * 4
            int r7 = 122 - r7
            byte[] r1 = com.razorpay.Checkout.$$c
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L16
            r3 = r2
            r2 = r6
            goto L2f
        L16:
            r4 = r7
            r7 = r6
            r6 = r4
        L19:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r0[r2] = r3
            if (r2 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            return r5
        L27:
            int r7 = r7 + 1
            r3 = r1[r7]
            r4 = r2
            r2 = r7
            r7 = r3
            r3 = r4
        L2f:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r2
            r2 = r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.Checkout.$$g(short, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 12
            int r6 = 77 - r6
            int r7 = 79 - r7
            byte[] r0 = com.razorpay.Checkout.$$a
            int r8 = r8 * 10
            int r1 = r8 + 34
            byte[] r1 = new byte[r1]
            int r8 = r8 + 33
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2f:
            int r6 = r6 + r7
            int r6 = r6 + (-1)
            r7 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.Checkout.a(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 * 45
            int r7 = r7 + 4
            int r8 = r8 * 29
            int r8 = r8 + 82
            int r9 = r9 * 18
            int r9 = r9 + 28
            byte[] r0 = com.razorpay.Checkout.$$d
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2d
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r3 = r3 + r7
            int r7 = r8 + 1
            int r8 = r3 + (-7)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.Checkout.c(short, short, int, java.lang.Object[]):void");
    }

    static /* synthetic */ void access$000(Checkout checkout, Activity activity, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 105;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        checkout.openInternal(activity, jSONObject);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 33;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    static /* synthetic */ WebView access$100() {
        WebView webView;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = i2 + 73;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            webView = sPreloadView;
            int i4 = 97 / 0;
        } else {
            webView = sPreloadView;
        }
        int i5 = i2 + 37;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        return webView;
    }

    static /* synthetic */ void access$200() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 11;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        failPreload();
        int i4 = AudioAttributesImplApi21Parcelizer + 89;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ boolean access$300() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer;
        int i3 = i2 + 109;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        boolean z = sPreloadFailed;
        int i5 = i2 + 107;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    static /* synthetic */ long access$400() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 37;
        int i3 = i2 % 128;
        MediaBrowserCompatCustomActionResultReceiver = i3;
        int i4 = i2 % 2;
        long j = sPreloadCompleteDuration;
        int i5 = i3 + 97;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    static /* synthetic */ long access$402(long j) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer;
        int i3 = i2 + 117;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        sPreloadCompleteDuration = j;
        int i5 = i2 + 51;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    static /* synthetic */ void access$500() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 105;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        destroyPreloadView();
        int i4 = AudioAttributesImplApi21Parcelizer + 17;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    public Checkout() {
        trackEvent(AnalyticsEvent.CHECKOUT_INITIALIZED, PaymentConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
    }

    public static Checkout getInstance(Context context) {
        int i = 2 % 2;
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("Checkout", "getInstance", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            if (!(!_Oo_O_$.getInstance().getPrefetchEnabled().booleanValue())) {
                C$O0Oo$oo0o.getInstance().startPrefetch(context);
                int i2 = AudioAttributesImplApi21Parcelizer + 97;
                MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
                int i3 = i2 % 2;
            }
            if (_Oo_O_$.getInstance().getPreloadEnabled().booleanValue()) {
                int i4 = MediaBrowserCompatCustomActionResultReceiver + 41;
                AudioAttributesImplApi21Parcelizer = i4 % 128;
                int i5 = i4 % 2;
                preload(context);
                int i6 = MediaBrowserCompatCustomActionResultReceiver + 119;
                AudioAttributesImplApi21Parcelizer = i6 % 128;
                int i7 = i6 % 2;
            }
            trackEvent(AnalyticsEvent.CHECKOUT_INITIALIZED_GET_INSTANCE, PaymentConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
            AnalyticsUtil.logCheckoutFunctionExit("Checkout", "getInstance", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            return new Checkout();
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
            return new Checkout();
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 3;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (isstopped.read < cArr.length) {
            int i6 = $11 + 55;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr3[i3] = cArr[isstopped.read];
            cArr3[1] = cArr[isstopped.read + 1];
            int i8 = $11 + 55;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 58224;
            int i11 = i3;
            while (i11 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                char[] cArr4 = cArr3;
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i10) ^ ((c2 << 4) + ((char) (((long) write) ^ 1193402106669854891L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(AudioAttributesCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getTouchSlop() >> 8), 1504 - Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 21, 1322448859, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i10) ^ ((cCharValue << 4) + ((char) (((long) IconCompatParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(RemoteActionCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getTapTimeout() >> 16) + 1504, View.resolveSize(0, 0) + 21, 1322448859, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i10 -= 40503;
                    i11++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[isstopped.read] = cArr5[0];
            cArr2[isstopped.read + 1] = cArr5[1];
            Object[] objArr4 = {isstopped, isstopped};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), ImageFormat.getBitsPerPixel(0) + 9017, 58 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -1950993821, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX INFO: loaded from: classes5.dex */
    public static class Builder {
        private Activity activity;
        private int builderCheckoutImage;
        private boolean builderDisableFullScreen;
        private String builderKey;
        private String color;
        private ArrayList<String> subscribedAnalyticsEvents = null;

        public Builder(Activity activity) {
            this.activity = activity;
        }

        public Builder() {
        }

        public Builder setKeyId(String str) {
            this.builderKey = str;
            return this;
        }

        public Builder setImage(int i) {
            this.builderCheckoutImage = i;
            return this;
        }

        public Builder disableFullscreen(boolean z) {
            this.builderDisableFullScreen = z;
            return this;
        }

        public Builder setColor(String str) {
            this.color = str;
            return this;
        }

        public Builder subscribeToAnalyticsEvents(ArrayList<String> arrayList) {
            this.subscribedAnalyticsEvents = arrayList;
            return this;
        }

        public Checkout build() {
            Checkout checkout = new Checkout();
            checkout.setFullScreenDisable(this.builderDisableFullScreen);
            checkout.setImage(this.builderCheckoutImage);
            String str = this.color;
            if (str != null) {
                checkout.setUpiTurbo(this.activity, str);
            } else {
                checkout.setUpiTurbo(this.activity);
            }
            String str2 = this.builderKey;
            if (str2 != null) {
                checkout.setKeyID(str2);
            }
            ArrayList<String> arrayList = this.subscribedAnalyticsEvents;
            if (arrayList != null) {
                checkout.setSubscribedAnalyticsEvents(arrayList);
            }
            return checkout;
        }
    }

    @Deprecated
    public final void setPublicKey(String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 109;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.key = str;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final Checkout upiTurbo(Activity activity) {
        int i = 2 % 2;
        this.upiTurbo = new UpiTurboCheckout(activity, "", null, null);
        int i2 = AudioAttributesImplApi21Parcelizer + 117;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 72 / 0;
        }
        return this;
    }

    public final void setHostedOptimizerConfig(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 25;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.isGlobalConfigLoaded = true;
        GlobalUrlConfig.initiate(jSONObject);
    }

    public final void setImage(int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi21Parcelizer;
        int i4 = i3 + 7;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        this.checkoutImage = i;
        int i6 = i3 + 31;
        MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void setUpiTurbo(Activity activity) {
        int i = 2 % 2;
        Object obj = null;
        this.upiTurbo = new UpiTurboCheckout(activity, "", null, null);
        int i2 = AudioAttributesImplApi21Parcelizer + 117;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public final void setUpiTurbo(Activity activity, String str) {
        int i = 2 % 2;
        this.upiTurbo = new UpiTurboCheckout(activity, "", str, null);
        int i2 = AudioAttributesImplApi21Parcelizer + 15;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    public final void setKeyID(String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 33;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        setPublicKey(str);
        BaseUtils.apiKey = str;
        int i4 = AudioAttributesImplApi21Parcelizer + 55;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void setEventCallback(EventCallback eventCallback) {
        WeakReference<EventCallback> weakReference;
        int i = 2 % 2;
        if (eventCallback != null) {
            weakReference = new WeakReference<>(eventCallback);
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 17;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            int i3 = i2 % 2;
        } else {
            int i4 = AudioAttributesImplApi21Parcelizer + 85;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            int i5 = i4 % 2;
            weakReference = null;
        }
        sEventCallback = weakReference;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001d, code lost:
    
        r1 = r1.get();
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0023, code lost:
    
        if (r1 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0025, code lost:
    
        com.razorpay.Checkout.sEventCallback = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0027, code lost:
    
        r2 = com.razorpay.Checkout.AudioAttributesImplApi21Parcelizer + 115;
        com.razorpay.Checkout.MediaBrowserCompatCustomActionResultReceiver = r2 % 128;
        r2 = r2 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0030, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0015, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001a, code lost:
    
        if (r1 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001c, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    static com.razorpay.EventCallback getEventCallback() {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.razorpay.Checkout.AudioAttributesImplApi21Parcelizer
            int r1 = r1 + 33
            int r2 = r1 % 128
            com.razorpay.Checkout.MediaBrowserCompatCustomActionResultReceiver = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 == 0) goto L18
            java.lang.ref.WeakReference<com.razorpay.EventCallback> r1 = com.razorpay.Checkout.sEventCallback
            r3 = 71
            int r3 = r3 / 0
            if (r1 != 0) goto L1d
            goto L1c
        L18:
            java.lang.ref.WeakReference<com.razorpay.EventCallback> r1 = com.razorpay.Checkout.sEventCallback
            if (r1 != 0) goto L1d
        L1c:
            return r2
        L1d:
            java.lang.Object r1 = r1.get()
            com.razorpay.EventCallback r1 = (com.razorpay.EventCallback) r1
            if (r1 != 0) goto L27
            com.razorpay.Checkout.sEventCallback = r2
        L27:
            int r2 = com.razorpay.Checkout.AudioAttributesImplApi21Parcelizer
            int r2 = r2 + 115
            int r3 = r2 % 128
            com.razorpay.Checkout.MediaBrowserCompatCustomActionResultReceiver = r3
            int r2 = r2 % r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.Checkout.getEventCallback():com.razorpay.EventCallback");
    }

    void setSubscribedAnalyticsEvents(ArrayList<String> arrayList) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 55;
        int i3 = i2 % 128;
        AudioAttributesImplApi21Parcelizer = i3;
        int i4 = i2 % 2;
        sSubscribedAnalyticsEvents = arrayList;
        int i5 = i3 + 7;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        int i6 = i5 % 2;
    }

    static ArrayList<String> getSubscribedAnalyticsEvents() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 113;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        ArrayList<String> arrayList = sSubscribedAnalyticsEvents;
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
        return arrayList;
    }

    public static void setAddressWalletUpdateHandler(Class<? extends Activity> cls) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 107;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        sAddressWalletUpdateActivityClass = cls;
        if (i3 != 0) {
            throw null;
        }
    }

    static Class<? extends Activity> getAddressWalletUpdateActivityClass() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 73;
        int i3 = i2 % 128;
        AudioAttributesImplApi21Parcelizer = i3;
        int i4 = i2 % 2;
        Class<? extends Activity> cls = sAddressWalletUpdateActivityClass;
        int i5 = i3 + 25;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        return cls;
    }

    public final void setFullScreenDisable(boolean z) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer;
        int i3 = i2 + 83;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        this.disableFullScreen = z;
        int i5 = i2 + 49;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void open(final Activity activity, final JSONObject jSONObject) {
        int i;
        int i2 = 2 % 2;
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("Checkout", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            if (OpinionatedSoln.INSTANCE.getBuildConfigValue(activity, "DEBUG") != null) {
                if (!OpinionatedSoln.INSTANCE.getAlertShownForStatus()) {
                    int i3 = MediaBrowserCompatCustomActionResultReceiver + 37;
                    AudioAttributesImplApi21Parcelizer = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                    if (!this.isGlobalConfigLoaded) {
                        sdkCheckIntegrationInternal(activity, new OpinionatedSoln.DismissCallback() { // from class: com.razorpay.Checkout.1
                            @Override // com.razorpay.OpinionatedSoln.DismissCallback
                            public void alertDismissed() {
                                Checkout.access$000(Checkout.this, activity, jSONObject);
                            }
                        });
                        i = AudioAttributesImplApi21Parcelizer + 77;
                        MediaBrowserCompatCustomActionResultReceiver = i % 128;
                    }
                }
                openInternal(activity, jSONObject);
                AnalyticsUtil.logCheckoutFunctionExit("Checkout", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            }
            openInternal(activity, jSONObject);
            i = MediaBrowserCompatCustomActionResultReceiver + 107;
            AudioAttributesImplApi21Parcelizer = i % 128;
            int i4 = i % 2;
            AnalyticsUtil.logCheckoutFunctionExit("Checkout", TtmlNode.TEXT_EMPHASIS_MARK_OPEN, _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    private void openInternal(Activity activity, JSONObject jSONObject) {
        int i = 2 % 2;
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("Checkout", "openInternal", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            if (TextUtils.isEmpty(this.key)) {
                this.key = BaseUtils.getKeyId(activity);
            } else {
                BaseUtils.apiKey = this.key;
            }
            _Oo_O_$.getAdvertisingIdFromUtil(activity);
            if (TextUtils.isEmpty(this.key)) {
                throw new RuntimeException("Please set your Razorpay API key in AndroidManifest.xml");
            }
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 103;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            Object obj = null;
            if (i2 % 2 == 0) {
                obj.hashCode();
                throw null;
            }
            if (jSONObject == null || jSONObject.length() == 0) {
                throw new RuntimeException("Checkout options cannot be null or empty");
            }
            int i3 = AudioAttributesImplApi21Parcelizer + 25;
            MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
            try {
            } catch (JSONException e) {
                AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
            }
            if (i3 % 2 != 0) {
                jSONObject.put("key", this.key);
                obj.hashCode();
                throw null;
            }
            jSONObject.put("key", this.key);
            abortPreloadIfRequired(this.merchantActivity);
            this.options = jSONObject;
            this.merchantClassName = activity.getClass().getName();
            this.merchantActivity = activity;
            try {
                activity.getFragmentManager().beginTransaction().add(this, (String) null).commitAllowingStateLoss();
            } catch (IllegalStateException e2) {
                AnalyticsUtil.reportError("Checkout", "S2", e2.getMessage());
            }
            AnalyticsUtil.logCheckoutFunctionExit("Checkout", "openInternal", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e3) {
            AnalyticsUtil.reportCaughtException(e3);
        }
    }

    static void trackEvent(AnalyticsEvent analyticsEvent, String str, Object obj) {
        int i = 2 % 2;
        HashMap map = new HashMap();
        map.put(str, obj);
        AnalyticsUtil.trackEvent(analyticsEvent, map);
        int i2 = AudioAttributesImplApi21Parcelizer + 117;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    public static void preload(Context context) {
        int i = 2 % 2;
        isPreloadTriggered = true;
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("Checkout", "preload", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            trackEvent(AnalyticsEvent.CHECKOUT_PRELOAD_STARTED, PaymentConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
            sPreloadCompleteDuration = 0L;
            sPreloadAbortDuration = 0L;
            sPreloadFailed = false;
            Context applicationContext = context.getApplicationContext();
            try {
                WebView webView = new WebView(applicationContext);
                sPreloadView = webView;
                BaseUtils.setWebViewSettings(applicationContext, webView, false);
                sPreloadView.setWebViewClient(new WebViewClient() { // from class: com.razorpay.Checkout.2
                    long pageStartAt;

                    @Override // android.webkit.WebViewClient
                    public void onPageStarted(WebView webView2, String str, Bitmap bitmap) {
                        this.pageStartAt = System.nanoTime();
                        if (Checkout.access$100() == null) {
                            Checkout.trackEvent(AnalyticsEvent.WEB_VIEW_UNEXPECTED_NULL, "error_location", "Checkout->Preload()->onPageStarted");
                        } else {
                            Checkout.access$100().setTag(Long.valueOf(this.pageStartAt));
                            Logger.d("Preload started!");
                        }
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView2, int i2, String str, String str2) {
                        Logger.d("onReceivedError OLD while pre-loading!");
                        Checkout.access$200();
                    }

                    @Override // android.webkit.WebViewClient
                    public void onReceivedError(WebView webView2, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        super.onReceivedError(webView2, webResourceRequest, webResourceError);
                        Logger.d("onReceivedError NEW while pre-loading!");
                        Checkout.access$200();
                    }

                    @Override // android.webkit.WebViewClient
                    public void onPageFinished(WebView webView2, String str) {
                        long jNanoTime = System.nanoTime();
                        if (!Checkout.access$300()) {
                            Checkout.access$402(jNanoTime - this.pageStartAt);
                            Checkout.trackEvent(AnalyticsEvent.CHECKOUT_PRELOAD_COMPLETED, PaymentConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
                            StringBuilder sb = new StringBuilder("Preload finished in ");
                            sb.append(BaseUtils.nanoTimeToSecondsString(Checkout.access$400(), 2));
                            sb.append(" sec.");
                            Logger.d(sb.toString());
                        }
                        Checkout.access$500();
                    }
                });
                sPreloadView.setWebChromeClient(new WebChromeClient() { // from class: com.razorpay.Checkout.3
                    @Override // android.webkit.WebChromeClient
                    public void onProgressChanged(WebView webView2, int i2) {
                        Logger.d("Preload progress: ".concat(String.valueOf(i2)));
                    }
                });
                sPreloadView.loadUrl("https://api.razorpay.com/v1/checkout/public");
                AnalyticsUtil.logCheckoutFunctionExit("Checkout", "preload", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
                int i2 = AudioAttributesImplApi21Parcelizer + 79;
                MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            } catch (Throwable th) {
                AnalyticsUtil.reportCaughtException(th);
                trackEvent(AnalyticsEvent.CHECKOUT_PRELOAD_FAILED, PaymentConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
                sPreloadFailed = true;
            }
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    private static void failPreload() {
        AnalyticsEvent analyticsEvent;
        Long lValueOf;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 79;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            analyticsEvent = AnalyticsEvent.CHECKOUT_PRELOAD_FAILED;
            lValueOf = Long.valueOf(System.currentTimeMillis());
        } else {
            analyticsEvent = AnalyticsEvent.CHECKOUT_PRELOAD_FAILED;
            lValueOf = Long.valueOf(System.currentTimeMillis());
        }
        trackEvent(analyticsEvent, PaymentConstants.TIMESTAMP, lValueOf);
        sPreloadFailed = true;
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 119;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 0 / 0;
        }
    }

    private static void destroyPreloadView() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 17;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            sPreloadView.stopLoading();
            sPreloadView = null;
        } else {
            sPreloadView.stopLoading();
            throw null;
        }
    }

    private void abortPreloadIfRequired(Activity activity) {
        int i = 2 % 2;
        long jNanoTime = System.nanoTime();
        try {
            WebView webView = sPreloadView;
            if (webView != null) {
                sPreloadAbortDuration = jNanoTime - ((Long) webView.getTag()).longValue();
                StorageBridge storageBridge = new StorageBridge(activity);
                if (storageBridge.getString(BaseConstants.PRE_FETCHED_ACCOUNTS) == null) {
                    int i2 = AudioAttributesImplApi21Parcelizer + 93;
                    MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
                    int i3 = i2 % 2;
                    storageBridge.setString(BaseConstants.USE_PRE_FETECHED_ACCOUNTS, "false");
                    int i4 = MediaBrowserCompatCustomActionResultReceiver + 51;
                    AudioAttributesImplApi21Parcelizer = i4 % 128;
                    if (i4 % 2 == 0) {
                        int i5 = 4 % 5;
                    }
                }
                StringBuilder sb = new StringBuilder("Preload aborted in ");
                sb.append(BaseUtils.nanoTimeToSecondsString(sPreloadAbortDuration, 2));
                sb.append(" sec.");
                Logger.d(sb.toString());
                trackEvent(AnalyticsEvent.CHECKOUT_PRELOAD_ABORTED, PaymentConstants.TIMESTAMP, Long.valueOf(System.currentTimeMillis()));
            }
        } catch (Exception unused) {
        }
        destroyPreloadView();
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 87;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
            if (objRemoteActionCompatParcelizer == null) {
                char capsMode = (char) (13183 - TextUtils.getCapsMode("", 0, 0));
                int i3 = (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1648;
                int size = 26 - View.MeasureSpec.getSize(0);
                byte b = $$a[5];
                Object[] objArr2 = new Object[1];
                a(b, (byte) (b | TarConstants.LF_GNUTYPE_LONGNAME), r0[53], objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(capsMode, i3, size, -133433128, false, (String) objArr2[0], null);
            }
            ((Field) objRemoteActionCompatParcelizer).getLong(null);
            obj.hashCode();
            throw null;
        }
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer2 == null) {
            char edgeSlop = (char) (13183 - (ViewConfiguration.getEdgeSlop() >> 16));
            int scrollDefaultDelay = 1649 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            int i4 = 26 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            byte b2 = $$a[5];
            Object[] objArr3 = new Object[1];
            a(b2, (byte) (b2 | TarConstants.LF_GNUTYPE_LONGNAME), r2[53], objArr3);
            objRemoteActionCompatParcelizer2 = startForeground.read(edgeSlop, scrollDefaultDelay, i4, -133433128, false, (String) objArr3[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer2).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer3 == null) {
                char c2 = (char) (13183 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                int keyRepeatDelay = 1649 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 26;
                Object[] objArr4 = new Object[1];
                a(r1[53], (byte) (-$$a[39]), r1[5], objArr4);
                objRemoteActionCompatParcelizer3 = startForeground.read(c2, keyRepeatDelay, touchSlop, -1033747278, false, (String) objArr4[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            c = 3;
        } else {
            Object[] objArr5 = new Object[1];
            b(15 - ((byte) KeyEvent.getModifierMetaStateMask()), new char[]{59271, 1681, 1497, 11414, 24098, 20601, 4793, 8804, 52203, 41462, 61148, 38579, 38607, 996, 17057, 60651}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            b(17 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{20897, 60143, 13189, 41748, 18738, 4192, 40424, 5574, 2180, 40796, 26214, 11427, 49139, 21983, 35125, 12069}, objArr6);
            try {
                Object[] objArr7 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue()), 0, 133824084};
                byte[] bArr = $$d;
                byte b3 = bArr[19];
                byte b4 = (byte) (b3 - 1);
                byte b5 = b3;
                Object[] objArr8 = new Object[1];
                c(b4, b5, b5, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                byte b6 = bArr[19];
                byte b7 = (byte) (b6 - 1);
                Object[] objArr9 = new Object[1];
                c(b6, b7, b7, objArr9);
                objArr = (Object[]) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr7);
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 13183);
                    int iCombineMeasuredStates = 1649 - View.combineMeasuredStates(0, 0);
                    int i5 = 26 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    Object[] objArr10 = new Object[1];
                    a(r12[53], (byte) (-$$a[39]), r12[5], objArr10);
                    objRemoteActionCompatParcelizer4 = startForeground.read(offsetBefore, iCombineMeasuredStates, i5, -1033747278, false, (String) objArr10[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    b(22 - View.MeasureSpec.makeMeasureSpec(0, 0), new char[]{4793, 8804, 16844, 8494, 63350, 18093, 1016, 40933, 16639, 46920, 26523, 54235, 7220, 52484, 40324, 22404, 51400, 18422, 17339, 6855, 60585, 54190}, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b(15 - Drawable.resolveOpacity(0, 0), new char[]{46147, 49421, 35975, 6035, 2098, 18505, 40814, 18706, 19215, 63647, 416, 33258, 6280, 722, 43577, 32661}, objArr12);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char c3 = (char) (13183 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        int minimumFlingVelocity = 1649 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 26;
                        byte[] bArr2 = $$a;
                        byte b8 = bArr2[53];
                        byte b9 = bArr2[5];
                        Object[] objArr13 = new Object[1];
                        a(b8, b9, b9, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(c3, minimumFlingVelocity, iCombineMeasuredStates2, 54351865, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char maximumDrawingCacheSize = (char) (13183 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1649;
                        int i6 = 26 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        byte[] bArr3 = $$a;
                        byte b10 = bArr3[5];
                        byte b11 = (byte) (b10 | TarConstants.LF_GNUTYPE_LONGNAME);
                        byte b12 = bArr3[53];
                        Object[] objArr14 = new Object[1];
                        a(b10, b11, b12, objArr14);
                        objRemoteActionCompatParcelizer6 = startForeground.read(maximumDrawingCacheSize, iKeyCodeFromString, i6, -133433128, false, (String) objArr14[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf2);
                    c = 3;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i7 = ((int[]) objArr[c])[0];
        int i8 = ((int[]) objArr[2])[0];
        if (i8 != i7) {
            long j = -1;
            long j2 = ((long) (i8 ^ i7)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4534), 6054 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 41 - TextUtils.indexOf((CharSequence) "", '0', 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i9 = AudioAttributesImplApi21Parcelizer + 37;
                MediaBrowserCompatCustomActionResultReceiver = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr15 = {-859333818, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) KeyEvent.getDeadChar(0, 0), 6030 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 24);
                    byte b13 = $$d[19];
                    byte b14 = (byte) (b13 - 1);
                    Object[] objArr16 = new Object[1];
                    c(b13, b14, b14, objArr16);
                    cls4.getMethod((String) objArr16[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr15);
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
        super.onCreate(bundle);
        if (this.options != null) {
            Intent intent = new Intent();
            intent.setComponent(new ComponentName(getActivity().getPackageName(), "com.razorpay.CheckoutActivity"));
            long j5 = sPreloadCompleteDuration;
            if (j5 > 0) {
                intent.putExtra("PRELOAD_COMPLETE_DURATION", j5);
            } else {
                long j6 = sPreloadAbortDuration;
                if (j6 > 0) {
                    int i11 = MediaBrowserCompatCustomActionResultReceiver + 119;
                    AudioAttributesImplApi21Parcelizer = i11 % 128;
                    int i12 = i11 % 2;
                    intent.putExtra("PRELOAD_ABORT_DURATION", j6);
                }
            }
            intent.putExtra(C$0o__.OPTIONS, this.options.toString());
            intent.putExtra(C$0o__.IMAGE, this.checkoutImage);
            intent.putExtra(C$0o__.DISABLE_FULL_SCREEN, this.disableFullScreen);
            this.options = null;
            startActivityForResult(intent, RZP_REQUEST_CODE);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0073  */
    @Override // android.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityResult(int r4, int r5, android.content.Intent r6) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            r1 = 62442(0xf3ea, float:8.75E-41)
            if (r4 == r1) goto L9
            return
        L9:
            android.app.Activity r4 = r3.merchantActivity
            if (r4 != 0) goto L29
            int r4 = com.razorpay.Checkout.MediaBrowserCompatCustomActionResultReceiver
            int r4 = r4 + 103
            int r1 = r4 % 128
            com.razorpay.Checkout.AudioAttributesImplApi21Parcelizer = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L23
            android.app.Activity r4 = r3.getActivity()
            r3.merchantActivity = r4
            r4 = 19
            int r4 = r4 / 0
            goto L29
        L23:
            android.app.Activity r4 = r3.getActivity()
            r3.merchantActivity = r4
        L29:
            android.app.Activity r4 = r3.merchantActivity
            java.lang.Class r4 = r4.getClass()
            java.lang.String r4 = r4.getName()
            r3.merchantClassName = r4
            java.lang.String r4 = getPaymentResult(r6)
            r6 = 1
            if (r4 == 0) goto L73
            int r1 = com.razorpay.Checkout.AudioAttributesImplApi21Parcelizer
            int r1 = r1 + 77
            int r2 = r1 % 128
            com.razorpay.Checkout.MediaBrowserCompatCustomActionResultReceiver = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L6b
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L73
            java.lang.String r1 = "cancelled"
            boolean r1 = r4.contains(r1)
            r1 = r1 ^ r6
            if (r1 == r6) goto L81
            java.lang.String r1 = "error"
            boolean r1 = r4.contains(r1)
            if (r1 != 0) goto L81
            com.razorpay.BaseUtils r4 = com.razorpay.BaseUtils.getInstance()
            java.lang.String r4 = r4.getMetadata()
            java.lang.String r4 = com.razorpay.BaseUtils.getPaymentCancelledResponse(r4)
            goto L81
        L6b:
            android.text.TextUtils.isEmpty(r4)
            r3 = 0
            r3.hashCode()
            throw r3
        L73:
            com.razorpay.BaseUtils r4 = com.razorpay.BaseUtils.getInstance()
            java.lang.String r4 = r4.getMetadata()
            java.lang.String r1 = "Payment Error"
            java.lang.String r4 = com.razorpay.BaseUtils.getGenericPaymentErrorResponse(r1, r4)
        L81:
            trackOnActivityResultEvent(r5, r4)
            android.app.Activity r1 = r3.merchantActivity
            createPaymentData(r1, r4)
            if (r5 != r6) goto L98
            r3.handleOnSuccess()
            int r4 = com.razorpay.Checkout.MediaBrowserCompatCustomActionResultReceiver
            int r4 = r4 + 117
            int r5 = r4 % 128
            com.razorpay.Checkout.AudioAttributesImplApi21Parcelizer = r5
            int r4 = r4 % r0
            goto La2
        L98:
            r6 = 4
            if (r5 != r6) goto L9f
            r3.handleExternalWalletSelected()
            goto La2
        L9f:
            r3.handleOnError(r5, r4)
        La2:
            android.app.Activity r4 = r3.getActivity()     // Catch: java.lang.Exception -> Lb6
            android.app.FragmentManager r4 = r4.getFragmentManager()     // Catch: java.lang.Exception -> Lb6
            android.app.FragmentTransaction r4 = r4.beginTransaction()     // Catch: java.lang.Exception -> Lb6
            android.app.FragmentTransaction r3 = r4.remove(r3)     // Catch: java.lang.Exception -> Lb6
            r3.commit()     // Catch: java.lang.Exception -> Lb6
            return
        Lb6:
            r3 = move-exception
            java.lang.String r4 = r3.getMessage()
            java.lang.String r5 = "S1"
            java.lang.String r3 = r3.getMessage()
            com.razorpay.AnalyticsUtil.reportError(r4, r5, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.Checkout.onActivityResult(int, int, android.content.Intent):void");
    }

    private void handleExternalWalletSelected() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 71;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        ExternalWalletListener externalWalletListener = this.externalWalletListenerFromClass;
        if (externalWalletListener != null) {
            externalWalletListener.onExternalWalletSelected(paymentData.getExternalWallet(), paymentData);
            return;
        }
        if (!(getActivity() instanceof ExternalWalletListener)) {
            handleMerchantCallbackError(this.merchantActivity, 4, EVENT_CALLBACK_DNE, new Exception());
            return;
        }
        try {
            ExternalWalletListener externalWalletListener2 = (ExternalWalletListener) getActivity();
            String externalWallet = paymentData.getExternalWallet();
            if (!TextUtils.isEmpty(externalWallet)) {
                int i4 = MediaBrowserCompatCustomActionResultReceiver + 125;
                AudioAttributesImplApi21Parcelizer = i4 % 128;
                int i5 = i4 % 2;
                externalWalletListener2.onExternalWalletSelected(externalWallet, paymentData);
                AnalyticsUtil.trackEvent(AnalyticsEvent.MERCHANT_EXTERNAL_WALLET_SELECTED_CALLED);
                AnalyticsUtil.postData();
            }
            int i6 = AudioAttributesImplApi21Parcelizer + 59;
            MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
            int i7 = i6 % 2;
        } catch (Exception e) {
            handleMerchantCallbackError(this.merchantActivity, 4, EVENT_CALLBACK_THREW_ERROR, e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void handleOnError(int r4, java.lang.String r5) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.razorpay.Checkout.MediaBrowserCompatCustomActionResultReceiver
            int r1 = r1 + 69
            int r2 = r1 % 128
            com.razorpay.Checkout.AudioAttributesImplApi21Parcelizer = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 != 0) goto L19
            r3.isMethodOverridden = r2
            r3.onError(r4, r5)
            boolean r3 = r3.isMethodOverridden
            if (r3 == 0) goto L25
            goto L22
        L19:
            r3.isMethodOverridden = r2
            r3.onError(r4, r5)
            boolean r3 = r3.isMethodOverridden
            if (r3 == 0) goto L25
        L22:
            trackIntegrationType(r4, r2)
        L25:
            int r3 = com.razorpay.Checkout.AudioAttributesImplApi21Parcelizer
            int r3 = r3 + 123
            int r4 = r3 % 128
            com.razorpay.Checkout.MediaBrowserCompatCustomActionResultReceiver = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L31
            return
        L31:
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.Checkout.handleOnError(int, java.lang.String):void");
    }

    private void handleOnSuccess() {
        int i = 2 % 2;
        String paymentId = paymentData.getPaymentId();
        if (paymentId != null) {
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 73;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                this.isMethodOverridden = false;
            } else {
                this.isMethodOverridden = true;
            }
            onSuccess(paymentId);
        }
        if (this.isMethodOverridden) {
            trackIntegrationType(1, 1);
        }
        int i3 = AudioAttributesImplApi21Parcelizer + 19;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSuccess(java.lang.String r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.razorpay.Checkout.MediaBrowserCompatCustomActionResultReceiver
            int r1 = r1 + 67
            int r2 = r1 % 128
            com.razorpay.Checkout.AudioAttributesImplApi21Parcelizer = r2
            int r1 = r1 % r0
            r2 = 0
            if (r1 != 0) goto L18
            r3.isMethodOverridden = r2
            boolean r1 = r3.handleOnSuccessViaInterface(r4)
            if (r1 != 0) goto L23
            goto L20
        L18:
            r3.isMethodOverridden = r2
            boolean r1 = r3.handleOnSuccessViaInterface(r4)
            if (r1 != 0) goto L23
        L20:
            r3.handleOnSuccessViaReflection(r4)
        L23:
            int r3 = com.razorpay.Checkout.AudioAttributesImplApi21Parcelizer
            int r3 = r3 + 15
            int r4 = r3 % 128
            com.razorpay.Checkout.MediaBrowserCompatCustomActionResultReceiver = r4
            int r3 = r3 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.Checkout.onSuccess(java.lang.String):void");
    }

    public void onError(int i, String str) {
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 5;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        this.isMethodOverridden = false;
        if (handleOnErrorViaInterface(i, str)) {
            return;
        }
        int i5 = MediaBrowserCompatCustomActionResultReceiver + 75;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        handleOnErrorViaReflection(i, str);
    }

    private void handleOnErrorViaReflection(int i, String str) {
        Method merchantClassMethod;
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 31;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        try {
            merchantClassMethod = getMerchantClassMethod("onPaymentError", Integer.TYPE, String.class);
            int i5 = MediaBrowserCompatCustomActionResultReceiver + 39;
            AudioAttributesImplApi21Parcelizer = i5 % 128;
            int i6 = i5 % 2;
        } catch (Exception e) {
            handleMerchantCallbackError(this.merchantActivity, i, EVENT_CALLBACK_DNE, e);
            merchantClassMethod = null;
        }
        try {
            invokeMethod(merchantClassMethod, Integer.valueOf(i), str);
            trackIntegrationType(i, 2);
        } catch (Exception e2) {
            handleMerchantCallbackError(this.merchantActivity, i, EVENT_CALLBACK_THREW_ERROR, e2);
        }
    }

    private boolean handleOnErrorViaInterface(int i, String str) {
        int i2 = 2 % 2;
        PaymentResultListener paymentResultListener = this.paymentResultListenerFromClass;
        if (paymentResultListener != null) {
            paymentResultListener.onPaymentError(i, str);
            return true;
        }
        if (getActivity() instanceof PaymentResultListener) {
            try {
                ((PaymentResultListener) getActivity()).onPaymentError(i, str);
                trackIntegrationType(i, 3);
            } catch (Exception e) {
                handleMerchantCallbackError(this.merchantActivity, i, EVENT_CALLBACK_THREW_ERROR, e);
            }
            return true;
        }
        PaymentResultWithDataListener paymentResultWithDataListener = this.paymentResultWithDataListenerFromClass;
        if (paymentResultWithDataListener == null) {
            if (getActivity() instanceof PaymentResultWithDataListener) {
                try {
                    ((PaymentResultWithDataListener) getActivity()).onPaymentError(i, str, paymentData);
                    trackIntegrationType(i, 3);
                } catch (Exception e2) {
                    handleMerchantCallbackError(this.merchantActivity, i, EVENT_CALLBACK_THREW_ERROR, e2);
                }
                return true;
            }
            int i3 = AudioAttributesImplApi21Parcelizer + 99;
            MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 28 / 0;
            }
            return false;
        }
        int i5 = MediaBrowserCompatCustomActionResultReceiver + 37;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            paymentResultWithDataListener.onPaymentError(i, str, paymentData);
            return false;
        }
        paymentResultWithDataListener.onPaymentError(i, str, paymentData);
        return true;
    }

    private boolean handleOnSuccessViaInterface(String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 111;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        PaymentResultListener paymentResultListener = this.paymentResultListenerFromClass;
        if (paymentResultListener != null) {
            paymentResultListener.onPaymentSuccess(str);
            return true;
        }
        if (!(getActivity() instanceof PaymentResultListener)) {
            PaymentResultWithDataListener paymentResultWithDataListener = this.paymentResultWithDataListenerFromClass;
            if (paymentResultWithDataListener != null) {
                int i4 = MediaBrowserCompatCustomActionResultReceiver + 21;
                AudioAttributesImplApi21Parcelizer = i4 % 128;
                int i5 = i4 % 2;
                paymentResultWithDataListener.onPaymentSuccess(str, paymentData);
                return true;
            }
            if (!(getActivity() instanceof PaymentResultWithDataListener)) {
                return false;
            }
            int i6 = MediaBrowserCompatCustomActionResultReceiver + 55;
            AudioAttributesImplApi21Parcelizer = i6 % 128;
            try {
                if (i6 % 2 == 0) {
                    ((PaymentResultWithDataListener) getActivity()).onPaymentSuccess(str, paymentData);
                    trackIntegrationType(1, 2);
                } else {
                    ((PaymentResultWithDataListener) getActivity()).onPaymentSuccess(str, paymentData);
                    trackIntegrationType(1, 3);
                }
            } catch (Exception e) {
                handleMerchantCallbackError(this.merchantActivity, 1, EVENT_CALLBACK_THREW_ERROR, e);
            }
            return true;
        }
        int i7 = MediaBrowserCompatCustomActionResultReceiver + 41;
        AudioAttributesImplApi21Parcelizer = i7 % 128;
        try {
            if (i7 % 2 == 0) {
                ((PaymentResultListener) getActivity()).onPaymentSuccess(str);
                trackIntegrationType(0, 5);
            } else {
                ((PaymentResultListener) getActivity()).onPaymentSuccess(str);
                trackIntegrationType(1, 3);
            }
        } catch (Exception e2) {
            handleMerchantCallbackError(this.merchantActivity, 1, EVENT_CALLBACK_THREW_ERROR, e2);
        }
        return true;
    }

    private void handleOnSuccessViaReflection(String str) {
        Method merchantClassMethod;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 1;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        try {
            if (i2 % 2 == 0) {
                Class[] clsArr = new Class[1];
                clsArr[1] = String.class;
                merchantClassMethod = getMerchantClassMethod("onPaymentSuccess", clsArr);
            } else {
                merchantClassMethod = getMerchantClassMethod("onPaymentSuccess", String.class);
            }
            int i3 = AudioAttributesImplApi21Parcelizer + 93;
            MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
            int i4 = i3 % 2;
        } catch (Exception e) {
            handleMerchantCallbackError(this.merchantActivity, 1, EVENT_CALLBACK_DNE, e);
            merchantClassMethod = null;
        }
        try {
            invokeMethod(merchantClassMethod, str);
            trackIntegrationType(1, 2);
        } catch (Exception e2) {
            handleMerchantCallbackError(this.merchantActivity, 1, EVENT_CALLBACK_THREW_ERROR, e2);
        }
    }

    private void invokeMethod(Method method, Object... objArr) throws Exception {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = i2 + 19;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        if (method != null) {
            method.invoke(this.merchantActivity, objArr);
            return;
        }
        int i5 = i2 + 121;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    private Method getMerchantClassMethod(String str, Class... clsArr) throws Exception {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 21;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return Class.forName(this.merchantClassName).getMethod(str, clsArr);
        }
        Class.forName(this.merchantClassName).getMethod(str, clsArr);
        throw null;
    }

    private static void trackIntegrationType(int i, int i2) {
        int i3 = 2 % 2;
        try {
            HashMap map = new HashMap();
            map.put("integration_type", Integer.toString(i2));
            if (i != 1) {
                AnalyticsUtil.trackEvent(AnalyticsEvent.MERCHANT_ON_ERROR_CALLED, AnalyticsUtil.getJSONResponse(map));
            } else {
                int i4 = MediaBrowserCompatCustomActionResultReceiver + 17;
                AudioAttributesImplApi21Parcelizer = i4 % 128;
                int i5 = i4 % 2;
                AnalyticsUtil.trackEvent(AnalyticsEvent.MERCHANT_ON_SUCCESS_CALLED, AnalyticsUtil.getJSONResponse(map));
            }
            AnalyticsUtil.postData();
            int i6 = AudioAttributesImplApi21Parcelizer + 13;
            MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
            if (i6 % 2 != 0) {
                throw null;
            }
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
        }
    }

    private static void trackOnActivityResultEvent(int i, String str) {
        int i2;
        int i3 = 2 % 2;
        try {
            AnalyticsUtil.addProperty("onActivityResult result", new AnalyticsProperty(str, AnalyticsProperty.Scope.ORDER));
            AnalyticsUtil.addProperty("onActivityResult resultCode", new AnalyticsProperty(String.valueOf(i), AnalyticsProperty.Scope.ORDER));
            if (i == 1) {
                AnalyticsUtil.trackEvent(AnalyticsEvent.CALLING_ON_SUCCESS);
                i2 = MediaBrowserCompatCustomActionResultReceiver + 87;
                AudioAttributesImplApi21Parcelizer = i2 % 128;
            } else if (i != 4) {
                AnalyticsUtil.trackEvent(AnalyticsEvent.CALLING_ON_ERROR);
                AnalyticsUtil.postData();
            } else {
                AnalyticsUtil.trackEvent(AnalyticsEvent.CALLING_EXTERNAL_WALLET_SELECTED);
                i2 = AudioAttributesImplApi21Parcelizer + 39;
                MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            }
            int i4 = i2 % 2;
            AnalyticsUtil.postData();
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
        }
    }

    private static void handleMerchantCallbackError(Activity activity, int i, String str, Exception exc) {
        String str2;
        String str3;
        int i2 = 2 % 2;
        if (i == 1) {
            str2 = "onPaymentSuccess";
            str3 = "success";
        } else if (i == 4) {
            str2 = "onExternalWalletSelected";
            str3 = "redirected";
        } else {
            int i3 = MediaBrowserCompatCustomActionResultReceiver + 71;
            AudioAttributesImplApi21Parcelizer = i3 % 128;
            int i4 = i3 % 2;
            str2 = "onPaymentError";
            str3 = "error";
        }
        try {
            HashMap map = new HashMap();
            map.put("event_details", exc.getMessage());
            map.put("event_type", exc.getMessage());
            map.put("payment_status", str3);
            AnalyticsUtil.trackEvent(AnalyticsEvent.HANDOVER_ERROR, AnalyticsUtil.getJSONResponse(map));
            MonitoringUtil.setCheckoutStage("merchant_callback_handover");
            MonitoringUtil.trackCriticalDependencyFailure(activity, "merchant_callback_handover", "handover", AnalyticsEvent.HANDOVER_ERROR.getEventName(), exc.getMessage(), true, false, "not_available");
            AnalyticsUtil.postData();
        } catch (Exception e) {
            AnalyticsUtil.reportError(e.getMessage(), "S0", e.getMessage());
        }
        if (BaseUtils.isMerchantAppDebuggable(activity)) {
            if (str.equals(EVENT_CALLBACK_DNE)) {
                if (i == 4) {
                    int i5 = AudioAttributesImplApi21Parcelizer + 49;
                    MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
                    int i6 = i5 % 2;
                    Toast.makeText(activity, "Error: ExternalWalletListener probably not implemented in your activity", 0).show();
                    return;
                }
                StringBuilder sb = new StringBuilder("Error: ");
                sb.append(str2);
                sb.append(" probably not implemented in your activity");
                Toast.makeText(activity, sb.toString(), 0).show();
                return;
            }
            if (str.equals(EVENT_CALLBACK_THREW_ERROR)) {
                StringBuilder sb2 = new StringBuilder("Your ");
                sb2.append(str2);
                sb2.append(" method is throwing an error. Wrap the entire code of the method inside a try catch.");
                Toast.makeText(activity, sb2.toString(), 0).show();
            }
        }
        int i7 = MediaBrowserCompatCustomActionResultReceiver + 37;
        AudioAttributesImplApi21Parcelizer = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    private static void createPaymentData(Activity activity, String str) {
        int i = 2 % 2;
        PaymentData paymentData2 = new PaymentData();
        paymentData = paymentData2;
        paymentData2.setUserContact(CheckoutUtils.getUserContact(activity));
        paymentData.setUserEmail(CheckoutUtils.getUserEmail(activity));
        try {
            JSONObject jSONObject = new JSONObject(str);
            if (jSONObject.optJSONObject("error") != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("error", jSONObject.getJSONObject("error"));
                JSONObject jSONObject3 = jSONObject.getJSONObject("error").getJSONObject(TtmlNode.TAG_METADATA);
                if (jSONObject3.has("payment_id")) {
                    int i2 = MediaBrowserCompatCustomActionResultReceiver + 13;
                    AudioAttributesImplApi21Parcelizer = i2 % 128;
                    int i3 = i2 % 2;
                    paymentData.setPaymentId(jSONObject3.getString("payment_id"));
                }
                if (jSONObject3.has(PaymentConstants.ORDER_ID)) {
                    paymentData.setOrderId(jSONObject3.getString(PaymentConstants.ORDER_ID));
                }
                paymentData.setData(jSONObject2);
            } else {
                paymentData.setData(jSONObject);
            }
            if (jSONObject.has("razorpay_payment_id")) {
                paymentData.setPaymentId(jSONObject.getString("razorpay_payment_id"));
            }
            if (jSONObject.has("razorpay_order_id")) {
                paymentData.setOrderId(jSONObject.getString("razorpay_order_id"));
                int i4 = AudioAttributesImplApi21Parcelizer + 81;
                MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 2 / 3;
                }
            }
            if (jSONObject.has("razorpay_signature")) {
                int i6 = MediaBrowserCompatCustomActionResultReceiver + 41;
                AudioAttributesImplApi21Parcelizer = i6 % 128;
                int i7 = i6 % 2;
                paymentData.setSignature(jSONObject.getString("razorpay_signature"));
            }
            if (!jSONObject.has("external_wallet")) {
                return;
            }
            paymentData.setExternalWallet(jSONObject.getString("external_wallet"));
        } catch (JSONException e) {
            JSONObject jSONObject4 = new JSONObject();
            JSONObject jSONObject5 = new JSONObject();
            try {
                jSONObject5.put("code", "RESPONSE");
                jSONObject5.put("description", str);
                jSONObject4.put("error", jSONObject5);
            } catch (JSONException unused) {
            }
            AnalyticsUtil.reportError(e.getMessage(), "S2", e.getMessage());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0058  */
    @java.lang.Deprecated
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void handleActivityResult(android.app.Activity r2, int r3, int r4, android.content.Intent r5, com.razorpay.PaymentResultWithDataListener r6, com.razorpay.ExternalWalletListener r7) {
        /*
            r0 = 2
            int r1 = r0 % r0
            r1 = 62442(0xf3ea, float:8.75E-41)
            if (r3 != r1) goto Lb8
            java.lang.String r3 = getPaymentResult(r5)
            if (r3 == 0) goto L58
            int r5 = com.razorpay.Checkout.AudioAttributesImplApi21Parcelizer
            int r5 = r5 + 89
            int r1 = r5 % 128
            com.razorpay.Checkout.MediaBrowserCompatCustomActionResultReceiver = r1
            int r5 = r5 % r0
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto L1e
            goto L58
        L1e:
            java.lang.String r5 = "cancelled"
            boolean r5 = r3.contains(r5)
            if (r5 == 0) goto L73
            java.lang.String r5 = "error"
            boolean r5 = r3.contains(r5)
            if (r5 == 0) goto L2f
            goto L73
        L2f:
            int r3 = com.razorpay.Checkout.AudioAttributesImplApi21Parcelizer
            int r3 = r3 + 11
            int r5 = r3 % 128
            com.razorpay.Checkout.MediaBrowserCompatCustomActionResultReceiver = r5
            int r3 = r3 % r0
            if (r3 == 0) goto L4b
            com.razorpay.BaseUtils r3 = com.razorpay.BaseUtils.getInstance()
            java.lang.String r3 = r3.getMetadata()
            java.lang.String r3 = com.razorpay.BaseUtils.getPaymentCancelledResponse(r3)
            r5 = 76
            int r5 = r5 / 0
            goto L73
        L4b:
            com.razorpay.BaseUtils r3 = com.razorpay.BaseUtils.getInstance()
            java.lang.String r3 = r3.getMetadata()
            java.lang.String r3 = com.razorpay.BaseUtils.getPaymentCancelledResponse(r3)
            goto L73
        L58:
            com.razorpay.BaseUtils r3 = com.razorpay.BaseUtils.getInstance()
            java.lang.String r3 = r3.getMetadata()
            java.lang.String r5 = "Payment Error"
            java.lang.String r3 = com.razorpay.BaseUtils.getGenericPaymentErrorResponse(r5, r3)
            int r5 = com.razorpay.Checkout.AudioAttributesImplApi21Parcelizer
            int r5 = r5 + 43
            int r1 = r5 % 128
            com.razorpay.Checkout.MediaBrowserCompatCustomActionResultReceiver = r1
            int r5 = r5 % r0
            if (r5 == 0) goto L73
            r5 = 5
            int r5 = r5 / r5
        L73:
            trackOnActivityResultEvent(r4, r3)
            createPaymentData(r2, r3)
            r5 = 1
            java.lang.String r1 = "threw_error"
            if (r4 != r5) goto L8f
            com.razorpay.PaymentData r3 = com.razorpay.Checkout.paymentData     // Catch: java.lang.Exception -> L8a
            java.lang.String r3 = r3.getPaymentId()     // Catch: java.lang.Exception -> L8a
            com.razorpay.PaymentData r5 = com.razorpay.Checkout.paymentData     // Catch: java.lang.Exception -> L8a
            r6.onPaymentSuccess(r3, r5)     // Catch: java.lang.Exception -> L8a
            return
        L8a:
            r3 = move-exception
            handleMerchantCallbackError(r2, r4, r1, r3)
            return
        L8f:
            r5 = 4
            if (r4 != r5) goto Lae
            if (r7 == 0) goto Lb8
            com.razorpay.PaymentData r3 = com.razorpay.Checkout.paymentData     // Catch: java.lang.Exception -> La9
            java.lang.String r3 = r3.getExternalWallet()     // Catch: java.lang.Exception -> La9
            com.razorpay.PaymentData r5 = com.razorpay.Checkout.paymentData     // Catch: java.lang.Exception -> La9
            r7.onExternalWalletSelected(r3, r5)     // Catch: java.lang.Exception -> La9
            int r2 = com.razorpay.Checkout.AudioAttributesImplApi21Parcelizer
            int r2 = r2 + 33
            int r3 = r2 % 128
            com.razorpay.Checkout.MediaBrowserCompatCustomActionResultReceiver = r3
            int r2 = r2 % r0
            return
        La9:
            r3 = move-exception
            handleMerchantCallbackError(r2, r4, r1, r3)
            return
        Lae:
            com.razorpay.PaymentData r5 = com.razorpay.Checkout.paymentData     // Catch: java.lang.Exception -> Lb4
            r6.onPaymentError(r4, r3, r5)     // Catch: java.lang.Exception -> Lb4
            return
        Lb4:
            r3 = move-exception
            handleMerchantCallbackError(r2, r4, r1, r3)
        Lb8:
            int r2 = com.razorpay.Checkout.MediaBrowserCompatCustomActionResultReceiver
            int r2 = r2 + 103
            int r3 = r2 % 128
            com.razorpay.Checkout.AudioAttributesImplApi21Parcelizer = r3
            int r2 = r2 % r0
            if (r2 == 0) goto Lc4
            return
        Lc4:
            r2 = 0
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.Checkout.handleActivityResult(android.app.Activity, int, int, android.content.Intent, com.razorpay.PaymentResultWithDataListener, com.razorpay.ExternalWalletListener):void");
    }

    public void merchantActivityResult(Activity activity, int i, int i2, Intent intent, PaymentResultWithDataListener paymentResultWithDataListener, ExternalWalletListener externalWalletListener) {
        int i3 = 2 % 2;
        int i4 = AudioAttributesImplApi21Parcelizer + 121;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        this.merchantActivity = activity;
        this.paymentResultWithDataListenerFromClass = paymentResultWithDataListener;
        this.externalWalletListenerFromClass = externalWalletListener;
        onActivityResult(i, i2, intent);
        int i6 = AudioAttributesImplApi21Parcelizer + 125;
        MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public void merchantActivityResult(Activity activity, int i, int i2, Intent intent, PaymentResultListener paymentResultListener, ExternalWalletListener externalWalletListener) {
        int i3 = 2 % 2;
        int i4 = AudioAttributesImplApi21Parcelizer + 59;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        this.merchantActivity = activity;
        this.paymentResultListenerFromClass = paymentResultListener;
        this.externalWalletListenerFromClass = externalWalletListener;
        onActivityResult(i, i2, intent);
        int i6 = AudioAttributesImplApi21Parcelizer + 17;
        MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
        int i7 = i6 % 2;
    }

    public static void clearUserData(Context context) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 123;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        CheckoutUtils.clearUserData(context);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 69;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    private static String getPaymentResult(Intent intent) {
        int i = 2 % 2;
        if (intent != null) {
            int i2 = AudioAttributesImplApi21Parcelizer + 117;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            Bundle extras = intent.getExtras();
            if (extras != null) {
                return extras.getString("RESULT");
            }
        }
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 3;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 4 / 0;
        }
        return null;
    }

    public static void sdkCheckIntegration(Activity activity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 49;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        OpinionatedSoln.INSTANCE.integrationStatusCheck(activity);
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
    }

    private void sdkCheckIntegrationInternal(Activity activity, OpinionatedSoln.DismissCallback dismissCallback) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 115;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            OpinionatedSoln.INSTANCE.integrationStatusCheck(activity, dismissCallback);
            throw null;
        }
        OpinionatedSoln.INSTANCE.integrationStatusCheck(activity, dismissCallback);
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 119;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    public String builderTest() {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("key", this.key);
            jSONObject.put("image", this.checkoutImage);
            jSONObject.put("disableFullScreen", this.disableFullScreen);
        } catch (JSONException unused) {
        }
        String string = jSONObject.toString();
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 97;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    static {
        read = 0;
        write();
        int i = AudioAttributesImplApi26Parcelizer + 47;
        read = i % 128;
        int i2 = i % 2;
    }

    static void write() {
        IconCompatParcelizer = (char) 64487;
        RemoteActionCompatParcelizer = (char) 28423;
        write = (char) 28599;
        AudioAttributesCompatParcelizer = (char) 36040;
    }
}
