package com.razorpay;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.webkit.JavascriptInterface;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import android.widget.Toast;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.razorpay.CheckoutPresenterImpl;
import java.lang.reflect.Method;
import java.util.ConcurrentModificationException;
import java.util.HashMap;
import kotlin.InvalidTypeIdException;
import kotlin.buildSetStopReasonIntent;
import kotlin.finishBranchObject;
import kotlin.needsStartedService;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes5.dex */
class BaseCheckoutActivity extends Activity implements CheckoutPresenterImpl.CheckoutView, SmsAgentInterface {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] AudioAttributesCompatParcelizer = null;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static char[] RemoteActionCompatParcelizer = null;
    private static int UPI_REQUEST_CODE = 99;
    private static char write;
    protected Object checkoutBridgeObject;
    private RelativeLayout container;
    private String lifecycleContext = "";
    private ViewGroup parent;
    protected CheckoutPresenter presenter;
    private WebChromeClient primaryWebChromeClient;
    private WebView primaryWebView;
    private WebViewClient primaryWebViewClient;
    private __O000_$O0 rzpbar;
    private WebChromeClient secondaryWebChromeClient;
    private WebView secondaryWebView;
    private WebViewClient secondaryWebViewClient;
    private SmsAgent smsAgent;
    private static final byte[] $$j = {36, 33, 122, TarConstants.LF_DIR, -70, 71, -5, -18, 2, 21, 7, -6, -48, 39, -7, -2, -20, 14, -41, 12, 12, -20, -3, 2, -8, 12, -26, 8, 14, 3, -3, 0, -20, -41, 29, 12, -16, 1, -6, -48, 39, -7, -2, -20, 14, -41, 12, 12, -20, -3, 2, -8, 12, -26, 8, -70, TarConstants.LF_BLK, -7, 10, -53, 44, -8, -22, 14, -16, 1, -6, -38, 23, -2, -5, -8, 5};
    private static final int $$k = 194;
    private static final byte[] $$a = {9, -121, -22, -93, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 79;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static int IconCompatParcelizer = 0;
    private static int read = 1;

    interface SetOptionsCallback {
        void onError();

        void onFeatureDisabled();

        void onOptionsSet();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 191 - r6
            int r0 = r8 + 4
            byte[] r1 = com.razorpay.BaseCheckoutActivity.$$a
            int r7 = r7 + 65
            byte[] r0 = new byte[r0]
            int r8 = r8 + 3
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2b
        L13:
            r3 = r2
        L14:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2b:
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.BaseCheckoutActivity.c(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = 28 - r8
            int r9 = 111 - r9
            int r7 = r7 + 4
            byte[] r0 = com.razorpay.BaseCheckoutActivity.$$j
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r9
            r4 = r2
            r9 = r7
            goto L29
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            int r7 = r7 + 1
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L29:
            int r3 = r3 + r7
            int r7 = r3 + 5
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.BaseCheckoutActivity.d(short, byte, byte, java.lang.Object[]):void");
    }

    BaseCheckoutActivity() {
    }

    protected void setLifecycleContext(LifecycleContext lifecycleContext, String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 69;
        read = i2 % 128;
        int i3 = i2 % 2;
        this.lifecycleContext = lifecycleContext.format(str);
        int i4 = read + 37;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
    }

    private void setWebViewClient(int i, WebViewClient webViewClient) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 43;
        int i4 = i3 % 128;
        read = i4;
        int i5 = i3 % 2;
        if (i == 1) {
            this.primaryWebViewClient = webViewClient;
            return;
        }
        int i6 = i4 + 17;
        int i7 = i6 % 128;
        IconCompatParcelizer = i7;
        if (i6 % 2 == 0 ? i == 2 : i == 5) {
            this.secondaryWebViewClient = webViewClient;
            return;
        }
        int i8 = i7 + 39;
        read = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void setWebChromeClient(int i, WebChromeClient webChromeClient) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer;
        int i4 = i3 + 13;
        read = i4 % 128;
        int i5 = i4 % 2;
        if (i == 1) {
            this.primaryWebChromeClient = webChromeClient;
            return;
        }
        int i6 = i3 + 123;
        read = i6 % 128;
        if (i6 % 2 == 0) {
            if (i != 3) {
                return;
            }
        } else if (i != 2) {
            return;
        }
        this.secondaryWebChromeClient = webChromeClient;
    }

    private void applyStatusBarScrim() {
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 21;
        read = i3 % 128;
        int i4 = i3 % 2;
        try {
            ViewGroup viewGroup = (ViewGroup) getWindow().getDecorView();
            WindowInsetsCompat windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler = InvalidTypeIdException.handleMediaPlayPauseIfPendingOnHandler(viewGroup);
            if (windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler != null) {
                int i5 = IconCompatParcelizer + 37;
                read = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler.read(WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver()).write;
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                i = windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler.read(WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver()).write;
                int i7 = IconCompatParcelizer + 123;
                read = i7 % 128;
                int i8 = i7 % 2;
            } else {
                int i9 = IconCompatParcelizer + 37;
                read = i9 % 128;
                int i10 = i9 % 2;
                i = 0;
            }
            View view = new View(this);
            view.setBackgroundColor(Color.parseColor("#99000000"));
            viewGroup.addView(view, new FrameLayout.LayoutParams(-1, i));
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        int i2 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = RemoteActionCompatParcelizer;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) KeyEvent.keyCodeFromString(""), TextUtils.getCapsMode("", 0, 0) + 11613, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 20, -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            char[] cArr5 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i8 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.indexOf("", "") + 22959, TextUtils.getOffsetAfter("", 0) + 43, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i9 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 31589), TextUtils.lastIndexOf("", '0', 0, 0) + 9864, 65 - (ViewConfiguration.getEdgeSlop() >> 16), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c = cArr5[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (37822 - (ViewConfiguration.getFadingEdgeLength() >> 16)), Color.alpha(0) + 9754, 28 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i10 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr4, i10, i6);
            System.arraycopy(cArr6, i6, cArr4, 0, i10);
            int i11 = $10 + 15;
            $11 = i11 % 128;
            int i12 = i11 % 2;
        }
        if (z) {
            int i13 = $11 + 93;
            $10 = i13 % 128;
            if (i13 % 2 != 0) {
                cArr = new char[i4];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 1;
            } else {
                cArr = new char[i4];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            }
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr4[(i4 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                int i14 = $10 + 91;
                $11 = i14 % 128;
                int i15 = i14 % 2;
            }
            i = 2;
            int i16 = $11 + 83;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            cArr4 = cArr;
        } else {
            i = 2;
        }
        if (i5 > 0) {
            int i18 = $10 + 97;
            $11 = i18 % 128;
            int i19 = i18 % i;
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[i]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private static void a(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = AudioAttributesCompatParcelizer;
        Object obj2 = null;
        if (cArr2 != null) {
            int i4 = $11 + 89;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 7015 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 30 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr3[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(write)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getTrimmedLength(""), Color.red(0) + 7015, (ViewConfiguration.getTapTimeout() >> 16) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i7 = $10 + 81;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            needsstartedservice.AudioAttributesCompatParcelizer = 0;
            while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                int i9 = $10 + 37;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                    int i11 = $11 + 113;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (48194 - View.resolveSizeAndState(0, 0, 0)), (Process.myPid() >> 22) + 20126, TextUtils.getCapsMode("", 0, 0) + 20, 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                        int i13 = $10 + 39;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 19368 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 19 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        int i15 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i15];
                    } else {
                        obj = null;
                        if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                            needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                            needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                            int i16 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            int i17 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i16];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i17];
                        } else {
                            int i18 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            int i19 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i18];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i19];
                        }
                    }
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
                obj2 = obj;
            }
        }
        for (int i20 = 0; i20 < i; i20++) {
            int i21 = $11 + 65;
            $10 = i21 % 128;
            int i22 = i21 % 2;
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:123:0x08b9 A[Catch: Exception -> 0x09b0, TryCatch #0 {Exception -> 0x09b0, blocks: (B:82:0x076d, B:86:0x07ce, B:89:0x07e5, B:90:0x07ea, B:92:0x07f0, B:93:0x07f5, B:95:0x082c, B:98:0x083b, B:99:0x083f, B:102:0x0848, B:105:0x0861, B:108:0x0868, B:113:0x08a1, B:115:0x08aa, B:124:0x08d2, B:126:0x08e2, B:128:0x08f5, B:130:0x0903, B:133:0x090c, B:137:0x091e, B:142:0x095d, B:143:0x0963, B:145:0x0973, B:149:0x098f, B:153:0x09b2, B:140:0x093e, B:144:0x096f, B:129:0x08fe, B:123:0x08b9, B:121:0x08b1, B:125:0x08d8, B:85:0x07c7), top: B:164:0x076d }] */
    /* JADX WARN: Removed duplicated region for block: B:124:0x08d2 A[Catch: Exception -> 0x09b0, TryCatch #0 {Exception -> 0x09b0, blocks: (B:82:0x076d, B:86:0x07ce, B:89:0x07e5, B:90:0x07ea, B:92:0x07f0, B:93:0x07f5, B:95:0x082c, B:98:0x083b, B:99:0x083f, B:102:0x0848, B:105:0x0861, B:108:0x0868, B:113:0x08a1, B:115:0x08aa, B:124:0x08d2, B:126:0x08e2, B:128:0x08f5, B:130:0x0903, B:133:0x090c, B:137:0x091e, B:142:0x095d, B:143:0x0963, B:145:0x0973, B:149:0x098f, B:153:0x09b2, B:140:0x093e, B:144:0x096f, B:129:0x08fe, B:123:0x08b9, B:121:0x08b1, B:125:0x08d8, B:85:0x07c7), top: B:164:0x076d }] */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2867
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.BaseCheckoutActivity.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 89;
        read = i2 % 128;
        int i3 = i2 % 2;
        super.onSaveInstanceState(bundle);
        this.presenter.saveInstanceState(bundle);
        int i4 = read + 105;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        int i = 2 % 2;
        this.presenter.backPressed(new HashMap());
        int i2 = read + 119;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 28 / 0;
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        int i = 2 % 2;
        int i2 = read + 71;
        IconCompatParcelizer = i2 % 128;
        try {
            try {
            } catch (ConcurrentModificationException e) {
                AnalyticsUtil.reportError(getClass().getName(), "S0", e.getLocalizedMessage());
                e.printStackTrace();
            }
            if (i2 % 2 == 0) {
                CheckoutNfcUtility.INSTANCE.cleanup(this);
                AnalyticsUtil.logCheckoutFunctionEntry("BaseCheckoutActivity", "onDestroy", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
                AnalyticsUtil.trackEvent(AnalyticsEvent.ACTIVITY_ONDESTROY_CALLED);
                Logger.d("CheckoutActivity onDestroy called");
                this.presenter.cleanUpOnDestroy();
                MonitoringUtil.clearCheckout(this);
                super.onDestroy();
                AnalyticsUtil.logCheckoutFunctionExit("BaseCheckoutActivity", "onDestroy", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
                int i3 = IconCompatParcelizer + 45;
                read = i3 % 128;
                if (i3 % 2 == 0) {
                    throw null;
                }
                return;
            }
            CheckoutNfcUtility.INSTANCE.cleanup(this);
            AnalyticsUtil.logCheckoutFunctionEntry("BaseCheckoutActivity", "onDestroy", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            AnalyticsUtil.trackEvent(AnalyticsEvent.ACTIVITY_ONDESTROY_CALLED);
            Logger.d("CheckoutActivity onDestroy called");
            this.presenter.cleanUpOnDestroy();
            throw null;
        } catch (Exception e2) {
            AnalyticsUtil.reportCaughtException(e2);
        }
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        read = i2 % 128;
        int i3 = i2 % 2;
        super.onConfigurationChanged(configuration);
        int i4 = read + 111;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private boolean createPrimaryWebView(Object obj) {
        int i = 2 % 2;
        try {
            WebView webView = new WebView(this);
            this.primaryWebView = webView;
            webView.setBackgroundColor(Color.parseColor("#99000000"));
            this.primaryWebView.setContentDescription("primary_webview");
            if (CheckoutUtils.shouldDisableHardwareAcceleration(this, this.presenter.getCheckoutOptions())) {
                int i2 = IconCompatParcelizer + 57;
                read = i2 % 128;
                if (i2 % 2 == 0) {
                    this.primaryWebView.setLayerType(0, null);
                } else {
                    this.primaryWebView.setLayerType(1, null);
                }
                int i3 = IconCompatParcelizer + 55;
                read = i3 % 128;
                int i4 = i3 % 2;
            }
            BaseUtils.setWebViewSettings(this, this.primaryWebView, false);
            this.primaryWebView.clearFormData();
            this.primaryWebView.addJavascriptInterface(obj, "CheckoutBridge");
            this.primaryWebView.setWebChromeClient(this.primaryWebChromeClient);
            this.primaryWebView.setWebViewClient(this.primaryWebViewClient);
            return true;
        } catch (Throwable th) {
            HashMap map = new HashMap();
            map.put("reason", th.getLocalizedMessage());
            map.put("webview_type", 1);
            AnalyticsUtil.trackEvent(AnalyticsEvent.WEBVIEW_CREATION_FAILED, AnalyticsUtil.getJSONResponse(map));
            MonitoringUtil.trackCriticalDependencyFailure(this, "webview_creation", "create", AnalyticsEvent.WEBVIEW_CREATION_FAILED.getEventName(), th.getLocalizedMessage(), true, false, "not_available");
            Lumberjack.postData();
            destroy(8, BaseConstants.WEBVIEW_CREATION_FAILED_MESSAGE);
            return false;
        }
    }

    private boolean createSecondaryWebView() {
        int i = 2 % 2;
        try {
            WebView webView = new WebView(this);
            this.secondaryWebView = webView;
            webView.setBackgroundColor(Color.parseColor("#99000000"));
            if (CheckoutUtils.shouldDisableHardwareAcceleration(this, this.presenter.getCheckoutOptions())) {
                int i2 = read + 97;
                IconCompatParcelizer = i2 % 128;
                int i3 = i2 % 2;
                this.secondaryWebView.setLayerType(1, null);
            }
            BaseUtils.setWebViewSettings(this, this.secondaryWebView, false);
            this.secondaryWebView.clearFormData();
            WebView webView2 = this.secondaryWebView;
            final CheckoutInteractor checkoutInteractor = (CheckoutInteractor) this.presenter;
            webView2.addJavascriptInterface(new Object(checkoutInteractor) { // from class: com.razorpay.o_$0_O
                private CheckoutInteractor interactor;

                {
                    this.interactor = checkoutInteractor;
                }

                @JavascriptInterface
                public final void relay(String str) {
                    this.interactor.sendDataToWebView(1, str);
                }
            }, "MagicBridge");
            this.secondaryWebView.addJavascriptInterface(new CheckoutBridge((CheckoutInteractor) this.presenter, 2), "CheckoutBridge");
            this.secondaryWebView.setVisibility(8);
            this.secondaryWebView.setWebChromeClient(this.secondaryWebChromeClient);
            this.secondaryWebView.setWebViewClient(this.secondaryWebViewClient);
            int i4 = IconCompatParcelizer + 115;
            read = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 42 / 0;
            }
            return true;
        } catch (Throwable th) {
            HashMap map = new HashMap();
            map.put("reason", th.getLocalizedMessage());
            map.put("webview_type", 2);
            AnalyticsUtil.trackEvent(AnalyticsEvent.WEBVIEW_CREATION_FAILED, AnalyticsUtil.getJSONResponse(map));
            MonitoringUtil.trackCriticalDependencyFailure(this, "webview_creation", "create", AnalyticsEvent.WEBVIEW_CREATION_FAILED.getEventName(), th.getLocalizedMessage(), true, false, "not_available");
            Lumberjack.postData();
            destroy(8, BaseConstants.WEBVIEW_CREATION_FAILED_MESSAGE);
            return false;
        }
    }

    static /* synthetic */ WindowInsetsCompat lambda$createContainer$0(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 123;
        read = i2 % 128;
        int i3 = i2 % 2;
        view.setPadding(view.getPaddingLeft(), windowInsetsCompat.read(WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver()).write, view.getPaddingRight(), windowInsetsCompat.read(WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver()).AudioAttributesCompatParcelizer);
        int i4 = IconCompatParcelizer + 117;
        read = i4 % 128;
        int i5 = i4 % 2;
        return windowInsetsCompat;
    }

    private void createContainer() {
        int i = 2 % 2;
        RelativeLayout relativeLayout = new RelativeLayout(this);
        this.container = relativeLayout;
        relativeLayout.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.container.setBackgroundColor(0);
        this.parent.addView(this.container);
        InvalidTypeIdException.read(this.container, new finishBranchObject() { // from class: com.razorpay.BaseCheckoutActivity$$ExternalSyntheticLambda0
            @Override // kotlin.finishBranchObject
            public final WindowInsetsCompat onApplyWindowInsets(View view, WindowInsetsCompat windowInsetsCompat) {
                return BaseCheckoutActivity.lambda$createContainer$0(view, windowInsetsCompat);
            }
        });
        this.primaryWebView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.secondaryWebView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.primaryWebView.setContentDescription("primary_webview");
        this.secondaryWebView.setContentDescription("secondary_webview");
        this.container.addView(this.primaryWebView);
        this.container.addView(this.secondaryWebView);
        String progressBarColor = this.presenter.getProgressBarColor();
        if (progressBarColor != null) {
            this.rzpbar = new __O000_$O0(this, this.container, progressBarColor);
            int i2 = read + 121;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
        } else {
            this.rzpbar = new __O000_$O0(this, this.container);
        }
        this.presenter.setUpAddOn();
    }

    @Override // android.app.Activity
    protected void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = read + 47;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        try {
            AnalyticsUtil.logCheckoutFunctionEntry("BaseCheckoutActivity", "onActivityResult", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
            super.onActivityResult(i, i2, intent);
            if (i == 1001) {
                int i6 = read + 11;
                IconCompatParcelizer = i6 % 128;
                if (i6 % 2 != 0) {
                    this.presenter.sendOtpPermissionCallback(false);
                } else {
                    this.presenter.sendOtpPermissionCallback(true);
                }
            }
            this.presenter.onActivityResultReceived(i, i2, intent);
            AnalyticsUtil.logCheckoutFunctionExit("BaseCheckoutActivity", "onActivityResult", _Oo_O_$.getInstance().isVerboseLoggingEnabled());
        } catch (Exception e) {
            AnalyticsUtil.reportCaughtException(e);
        }
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = 2 % 2;
        int i3 = read + 55;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        this.presenter.onRequestPermissionsResult(i, strArr, iArr);
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = IconCompatParcelizer + 111;
        read = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.razorpay.SmsAgentInterface
    public void postSms(String str, String str2) {
        int i = 2 % 2;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("sender", str);
            jSONObject.put("message", str2);
            loadUrl(1, String.format("OTPElf.showOTP('%s','%s')", str2, str));
            int i2 = read + 87;
            IconCompatParcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                throw null;
            }
        } catch (JSONException e) {
            AnalyticsUtil.reportError(getClass().getName(), "S1", e.getMessage());
            e.printStackTrace();
        }
    }

    @Override // com.razorpay.SmsAgentInterface
    public void setSmsPermission(boolean z) {
        int i = 2 % 2;
        int i2 = read + 89;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.presenter.sendOtpPermissionCallback(z);
        SmsAgent smsAgent = this.smsAgent;
        if (smsAgent != null) {
            int i4 = IconCompatParcelizer + 45;
            read = i4 % 128;
            int i5 = i4 % 2;
            smsAgent.deregisterForCallbacks(this);
            int i6 = IconCompatParcelizer + 51;
            read = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public void loadUrl(int i, String str) {
        int i2 = 2 % 2;
        if (i == 1) {
            WebView webView = this.primaryWebView;
            if (webView != null) {
                int i3 = read + 123;
                IconCompatParcelizer = i3 % 128;
                int i4 = i3 % 2;
                webView.loadUrl(str);
                if (i4 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            return;
        }
        if (i == 2) {
            int i5 = read + 41;
            int i6 = i5 % 128;
            IconCompatParcelizer = i6;
            int i7 = i5 % 2;
            WebView webView2 = this.secondaryWebView;
            if (webView2 != null) {
                int i8 = i6 + 15;
                read = i8 % 128;
                int i9 = i8 % 2;
                webView2.loadUrl(str);
            }
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public void addJavascriptInterfaceToPrimaryWebview(Object obj, String str) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 3;
        read = i2 % 128;
        int i3 = i2 % 2;
        Object obj2 = null;
        this.primaryWebView.addJavascriptInterface(obj, str);
        if (i3 == 0) {
            throw null;
        }
        int i4 = IconCompatParcelizer + 79;
        read = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj2.hashCode();
        throw null;
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public void loadData(int i, String str, String str2, String str3) {
        int i2 = 2 % 2;
        int i3 = read + 111;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        if (i == 1) {
            this.primaryWebView.loadData(str, str2, str3);
            int i5 = IconCompatParcelizer + 37;
            read = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        if (i != 2) {
            return;
        }
        this.secondaryWebView.loadData(str, str2, str3);
        int i7 = IconCompatParcelizer + 7;
        read = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 53 / 0;
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public void loadDataWithBaseURL(int i, String str, String str2, String str3, String str4, String str5) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 95;
        read = i3 % 128;
        if (i3 % 2 != 0 ? i != 1 : i != 0) {
            if (i != 2) {
                return;
            }
            this.secondaryWebView.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } else {
            this.primaryWebView.loadDataWithBaseURL(str, str2, str3, str4, str5);
            int i4 = read + 5;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public void makeWebViewVisible(int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer;
        int i4 = i3 + 113;
        read = i4 % 128;
        int i5 = i4 % 2;
        if (i == 1) {
            if (this.primaryWebView.getVisibility() == 8) {
                int i6 = IconCompatParcelizer + 75;
                read = i6 % 128;
                int i7 = i6 % 2;
                this.primaryWebView.setVisibility(0);
                this.secondaryWebView.setVisibility(8);
                CheckoutUtils.dismissLoader();
                AnalyticsUtil.trackEvent(AnalyticsEvent.WEB_VIEW_SECONDARY_TO_PRIMARY_SWITCH);
                return;
            }
            return;
        }
        if (i == 2) {
            int i8 = i3 + 73;
            read = i8 % 128;
            if (i8 % 2 == 0) {
                if (this.secondaryWebView.getVisibility() != 109) {
                    return;
                }
            } else if (this.secondaryWebView.getVisibility() != 8) {
                return;
            }
            this.primaryWebView.setVisibility(8);
            this.secondaryWebView.setVisibility(0);
            CheckoutUtils.dismissLoader();
            AnalyticsUtil.trackEvent(AnalyticsEvent.WEB_VIEW_PRIMARY_TO_SECONDARY_SWITCH);
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public boolean isWebViewVisible(int i) {
        WebView webView;
        int i2 = 2 % 2;
        int i3 = read + 87;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        if (i == 1) {
            WebView webView2 = this.primaryWebView;
            if (webView2 != null && webView2.getVisibility() == 0) {
                return true;
            }
        } else if (i == 2 && (webView = this.secondaryWebView) != null && webView.getVisibility() == 0) {
            int i5 = read + 105;
            IconCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
            return true;
        }
        int i7 = read + 93;
        IconCompatParcelizer = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 30 / 0;
        }
        return false;
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public void showToast(String str, int i) {
        int i2 = 2 % 2;
        int i3 = read + 119;
        IconCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        Toast.makeText(this, str, i).show();
        if (i4 != 0) {
            throw null;
        }
        int i5 = IconCompatParcelizer + 53;
        read = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x0024  */
    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void destroy(int r5, java.lang.String r6) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            r1 = 0
            com.razorpay.BaseConfig.paymentInProgress = r1
            com.razorpay.MonitoringUtil.clearCheckout(r4)
            android.content.Intent r1 = new android.content.Intent
            r1.<init>()
            java.lang.String r2 = "RESULT"
            r1.putExtra(r2, r6)
            if (r6 == 0) goto L24
            int r2 = com.razorpay.BaseCheckoutActivity.read
            int r2 = r2 + 105
            int r3 = r2 % 128
            com.razorpay.BaseCheckoutActivity.IconCompatParcelizer = r3
            int r2 = r2 % r0
            boolean r6 = android.text.TextUtils.isEmpty(r6)
            if (r6 == 0) goto L2e
        L24:
            int r5 = com.razorpay.BaseCheckoutActivity.read
            r6 = 5
            int r5 = r5 + r6
            int r2 = r5 % 128
            com.razorpay.BaseCheckoutActivity.IconCompatParcelizer = r2
            int r5 = r5 % r0
            r5 = r6
        L2e:
            r4.setResult(r5, r1)
            com.razorpay.BaseUtils r5 = com.razorpay.BaseUtils.getInstance()
            r5.clearMetadata()
            r4.finish()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.BaseCheckoutActivity.destroy(int, java.lang.String):void");
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public void showProgressBar(int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 91;
        int i4 = i3 % 128;
        read = i4;
        int i5 = i3 % 2;
        __O000_$O0 __o000_$o0 = this.rzpbar;
        if (__o000_$o0 != null) {
            int i6 = i4 + 23;
            IconCompatParcelizer = i6 % 128;
            int i7 = i6 % 2;
            __o000_$o0.show(i);
            if (i7 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public void hideProgressBar() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 113;
        read = i3 % 128;
        int i4 = i3 % 2;
        __O000_$O0 __o000_$o0 = this.rzpbar;
        Object obj = null;
        if (__o000_$o0 != null) {
            int i5 = i2 + 111;
            read = i5 % 128;
            int i6 = i5 % 2;
            __o000_$o0.hide();
            if (i6 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i7 = IconCompatParcelizer + 115;
        read = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public void clearWebViewHistory(int i) {
        int i2 = 2 % 2;
        int i3 = read;
        int i4 = i3 + 47;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0 ? i == 1 : i == 1) {
            this.primaryWebView.clearHistory();
            return;
        }
        int i5 = i3 + 107;
        IconCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        if (i != 2) {
            return;
        }
        this.secondaryWebView.clearHistory();
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public WebView getWebView(int i) {
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer;
        int i4 = i3 + 11;
        read = i4 % 128;
        int i5 = i4 % 2;
        if (i != 1) {
            if (i != 2) {
                return null;
            }
            return this.secondaryWebView;
        }
        WebView webView = this.primaryWebView;
        int i6 = i3 + 19;
        read = i6 % 128;
        int i7 = i6 % 2;
        return webView;
    }

    @Override // android.app.Activity
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 9, new char[]{'\r', 15, 29, 16, 1, ' ', 24, '\"', 14, 24, 24, ' ', 14, '!', 7, '\"', 1, '!', 11, '\t', 29, '\t', '\r', 29, 16, 24}, (byte) (18 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(true, new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, new int[]{0, 18, 0, 0}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i2 = IconCompatParcelizer + 77;
                read = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 4 % 3;
                }
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i4 = IconCompatParcelizer + 107;
            read = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0') + 4536), (Process.myTid() >> 22) + 6054, Drawable.resolveOpacity(0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), (ViewConfiguration.getEdgeSlop() >> 16) + 6030, View.MeasureSpec.getSize(0) + 24, -861814097, false, "read", new Class[]{Context.class});
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
        CheckoutNfcUtility.INSTANCE.disableReaderMode(this);
        HashMap map = new HashMap();
        if (this.lifecycleContext.isEmpty()) {
            Logger.d("CheckoutActivity onPause called");
        } else {
            map.put("reason", this.lifecycleContext);
            StringBuilder sb = new StringBuilder("CheckoutActivity onPause called with reason: ");
            sb.append(this.lifecycleContext);
            Logger.d(sb.toString());
        }
        AnalyticsUtil.trackEvent(AnalyticsEvent.ACTIVITY_ONPAUSE_CALLED, map);
        this.lifecycleContext = "";
        super.onPause();
        int i6 = read + 103;
        IconCompatParcelizer = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x009e  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.BaseCheckoutActivity.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0859 A[Catch: all -> 0x02e5, TryCatch #3 {all -> 0x02e5, blocks: (B:135:0x0853, B:137:0x0859, B:138:0x0889, B:212:0x0e4b, B:214:0x0e51, B:215:0x0e7e, B:255:0x1296, B:257:0x129c, B:258:0x12c5, B:236:0x10a4, B:238:0x10c7, B:239:0x110f, B:179:0x0a55, B:181:0x0a5b, B:182:0x0a86, B:27:0x011e, B:29:0x0124, B:30:0x014c, B:32:0x0256, B:34:0x0288, B:35:0x02df, B:143:0x091c, B:145:0x0920, B:149:0x092c, B:165:0x09fe, B:167:0x0a04, B:168:0x0a05, B:170:0x0a07, B:172:0x0a0e, B:173:0x0a0f), top: B:286:0x011e, inners: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x02e9  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5451
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.BaseCheckoutActivity.attachBaseContext(android.content.Context):void");
    }

    /* JADX INFO: renamed from: $r8$lambda$wp--4ZAzlGAsxsD8T2WMvfLKVkA, reason: not valid java name */
    public static /* synthetic */ void m211$r8$lambda$wp4ZAzlGAsxsD8T2WMvfLKVkA(BaseCheckoutActivity baseCheckoutActivity) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        read = i2 % 128;
        int i3 = i2 % 2;
        baseCheckoutActivity.applyStatusBarScrim();
        int i4 = read + 81;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static {
        AudioAttributesImplApi21Parcelizer = 0;
        write();
        int i = MediaBrowserCompatCustomActionResultReceiver + 11;
        AudioAttributesImplApi21Parcelizer = i % 128;
        if (i % 2 != 0) {
            int i2 = 43 / 0;
        }
    }

    @Override // com.razorpay.CheckoutPresenterImpl.CheckoutView
    public void checkSmsPermission() {
        int i = 2 % 2;
        int i2 = read + 97;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 115;
        read = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = read + 27;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    static void write() {
        AudioAttributesCompatParcelizer = new char[]{6468, 6407, 6471, 6494, 6424, 6493, 6520, 6431, 6481, 6491, 6492, 6464, 6473, 6525, 6470, 6505, 6469, 6490, 6418, 6496, 6522, 6479, 6430, 6507, 6426, 6477, 6488, 6524, 6476, 6417, 6406, 6465, 6475, 6425, 6428, 6489};
        write = (char) 11444;
        RemoteActionCompatParcelizer = new char[]{44989, 45028, 45030, 45028, 45024, 45032, 45036, 45024, 45028, 45050, 45010, 45008, 45051, 45027, 45025, 45048, 45049, 45030, 44987, 44998, 44984, 44993, 45038, 45033, 45032, 45035, 44993, 44991, 44990, 44988, 44997, 45039, 45039, 44998, 44984, 44992, 45038, 44995, 44987, 44998, 45039, 44997, 44978, 44997, 44999, 44992, 44992, 44984, 44987, 44987, 44992, 44993, 44990, 44999, 45033, 45032, 45032, 44998, 44999, 44993, 44988, 44989, 44988, 44978, 44997, 45039, 44987, 45034, 45053, 45042, 45053, 44805, 44826, 45040, 45035, 45013, 45035, 45034, 45009, 45015, 45032, 45013, 45055, 45055, 45052, 44826, 44805, 44804, 45053, 45032, 45013, 45014, 45015, 45053, 45053, 45055, 45052, 45015, 45009, 45014, 45013, 45033, 45013, 45009, 45014, 45054, 45042, 45035, 45035, 45032, 45032, 45042, 44804, 44804, 45052, 45042, 45055, 45009, 45054, 44804, 45042, 45035, 45034, 45035, 45053, 45053, 45012, 45054, 44804, 45054, 44983, 45032, 45032, 45041, 45033, 44992, 45033, 45036, 45037, 45047, 45039, 44998, 44999, 45039, 45041, 45047, 45037, 45039, 45040, 45032, 44992, 44992, 44993, 44993, 44996, 45026, 45047, 45037, 44997, 44999, 44998, 44999, 44997, 45033, 45039, 45037, 45046, 45046, 45039, 45039, 45038, 44992, 45038, 45033, 45032, 45033, 44992, 45035, 45038, 45039, 45044, 45046, 45032, 44998, 44999, 45038, 45033, 45032, 45038, 45038, 45039, 44997, 44997, 45018, 45001, 45051, 45014, 45008, 45021, 45029, 45048, 45014, 45008, 45021, 45021, 45023, 45010, 45055, 45055, 45055, 45029, 45020, 45009, 45009, 45009, 45010, 45011, 45049, 45050, 45021, 45022, 45029, 45054, 45048, 45029, 45008, 45054, 44800, 44800, 45051, 45045, 44915, 44917, 44917, 44881, 44907, 44912, 44913, 44916, 44884, 44894, 44912, 44672, 44685, 44682, 44919, 44957, 44996, 45051, 45018, 45002, 45036, 45052, 45049, 45030, 45027, 45010, 45021, 45031, 45027, 45037, 45036, 45037, 45027, 45025, 45050, 45030, 45036, 44944, 44985, 44991, 44989, 44989, 44990, 44985, 44988, 44990, 44985, 44985};
    }
}
