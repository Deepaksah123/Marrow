package com.razorpay;

import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.webkit.WebView;
import android.widget.ExpandableListView;
import java.lang.reflect.Method;
import kotlin.buildRemoveAllDownloadsIntent;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final class CheckoutActivity extends BaseCheckoutOtpelfActivity {
    private static short[] read;
    private static final byte[] $$l = {TarConstants.LF_GNUTYPE_LONGNAME, 36, -23, -15};
    private static final int $$o = 2;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$p = {98, 126, 62, 90, 13, -1, -62, 58, 9, 1, -7, 6, -6, -54, TarConstants.LF_BLK, 14, -9, 15, -2, -5, -4, -53, 64, -11, 20, -14, 14, -8, -7, 12, -61, 71, -18, 2, 18, -68, 39, 14, 2, -21, 22, 25, -9, 7, 0, -79, 79, -12, -3, 4, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -64, 58, -1, 16, -47, TarConstants.LF_SYMLINK, -2, -16, 20, -10, 7, 0, -32, 29, 4, 1, -2, 11};
    private static final int $$q = 169;
    private static final byte[] $$g = {32, -1, TarConstants.LF_GNUTYPE_SPARSE, -45, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$h = 166;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int AudioAttributesImplApi21Parcelizer = 1;
    private static int IconCompatParcelizer = 338850992;
    private static int RemoteActionCompatParcelizer = -819363085;
    private static int write = 1478547077;
    private static byte[] AudioAttributesCompatParcelizer = {121, 81, 67, 95, 109, 84, -65, -65, 22, 93, -112, 7, 86, 87, 84, 67, 107, 68, 118, 74, -95, 105, -71, 97, 38, 61, TarConstants.LF_FIFO, 47, 21, -34, 36, 46, TarConstants.LF_FIFO, 44, TarConstants.LF_BLK, 40, 7, 22, -5, 57, 42, 118, -17, 62, 63, 60, 43, TarConstants.LF_CHR, 44, 91, 1, TarConstants.LF_GNUTYPE_SPARSE, 15, 13, 4, 10, TarConstants.LF_LINK, TarConstants.LF_GNUTYPE_SPARSE, 59, 1, 15, 3, 81, 12, TarConstants.LF_CHR, 91, 2, 15, 2, 62, TarConstants.LF_GNUTYPE_SPARSE, TarConstants.LF_SYMLINK, 82, 1, 61, 15, 94, 13, TarConstants.LF_CHR, 2, 91, 5, 63, 2, 15, 84, 10, 3, 14, 62, 15, 3, 15, 3, 90, 5, 62, TarConstants.LF_GNUTYPE_LONGLINK, 11, 14, 12, 57, 80, 58, 92, 63, 93, 0, 8, 61, 2, 11, 94, 57, 92, 15, 62, 90, TarConstants.LF_SYMLINK, 90, 12, TarConstants.LF_SYMLINK, 90, 63, 9, 1, 95, 39, 80, 1, 118, 2, 10, 3, 56, 14, 81, 118, 14, 11, 14, 12, 62, 12, 84, 57, 13, 10, 84, 118, 1, 60, 13, 81, 56, 92, 12, TarConstants.LF_NORMAL, 10, 93, 62, 72, -6, -29, -32, -118, -24, TarConstants.LF_CHR, -4, -67, 34, -66, -8, -21, -5, -16, -28, 63, -93, -16, -22, TarConstants.LF_CONTIG, -89, -5, -19, TarConstants.LF_BLK, -96, -10, -24, -115, -27, -5, -22, -9, -24, -115, -21, TarConstants.LF_NORMAL, -65, -8, -41, -5, -118, -42, -3, -10, -17, -11, 35, -66, -22, -13, -16, -29, -4, -16, -20, -26, -31, -4, TarConstants.LF_BLK, -7, -12, -94, -26, -3, -7, -19, 117, -98, -88, -97, -97, -83, 124, 105, 93, 108, 89, 70, 85, 78, 99, 82, 111, 94, 66, 108, 90, 112, 92, 89, 79, 91, 69, 89, 65, 91, 79, TarConstants.LF_PAX_EXTENDED_HEADER_UC};
    private static int[] MediaBrowserCompatCustomActionResultReceiver = {-676133226, -1769405454, -386788129, 1222615449, 2033141644, -1431752977, -328214802, 1563438218, 1702737776, 1615339876, 1597616374, -459853061, 316370088, -26607405, 765079550, -338454130, -795351938, -111808805};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$r(int r6, int r7, short r8) {
        /*
            int r7 = r7 * 2
            int r7 = 112 - r7
            int r8 = r8 * 2
            int r8 = 1 - r8
            int r6 = r6 + 4
            byte[] r0 = com.razorpay.CheckoutActivity.$$l
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r6 = r6 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r6]
        L26:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.CheckoutActivity.$$r(int, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(short r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = 114 - r7
            int r0 = r6 + 4
            byte[] r1 = com.razorpay.CheckoutActivity.$$g
            int r5 = r5 + 4
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = -1
            if (r1 != 0) goto L13
            r7 = r5
            r4 = r6
            r3 = r2
            goto L26
        L13:
            r3 = r2
        L14:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L24:
            r4 = r1[r5]
        L26:
            int r5 = r5 + 1
            int r7 = r7 + r4
            int r7 = r7 + r2
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.CheckoutActivity.k(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.razorpay.CheckoutActivity.$$p
            int r1 = 47 - r6
            int r7 = 111 - r7
            int r5 = r5 + 4
            byte[] r1 = new byte[r1]
            int r6 = 46 - r6
            r2 = -1
            if (r0 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r5 = r5 + 1
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L25:
            r4 = r0[r5]
        L27:
            int r7 = r7 + r4
            int r7 = r7 + r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.CheckoutActivity.l(short, int, int, java.lang.Object[]):void");
    }

    @Override // com.razorpay.BaseCheckoutActivity, com.razorpay.CheckoutPresenterImpl.CheckoutView
    public final /* bridge */ /* synthetic */ void addJavascriptInterfaceToPrimaryWebview(Object obj, String str) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 33;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.addJavascriptInterfaceToPrimaryWebview(obj, str);
        if (i3 == 0) {
            int i4 = 35 / 0;
        }
    }

    @Override // com.razorpay.BaseCheckoutActivity, com.razorpay.CheckoutPresenterImpl.CheckoutView
    public final /* bridge */ /* synthetic */ void checkSmsPermission() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 43;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.checkSmsPermission();
        int i4 = AudioAttributesImplApi21Parcelizer + 19;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.razorpay.BaseCheckoutActivity, com.razorpay.CheckoutPresenterImpl.CheckoutView
    public final /* bridge */ /* synthetic */ void clearWebViewHistory(int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi21Parcelizer + 105;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        super.clearWebViewHistory(i);
        int i5 = AudioAttributesImplApi26Parcelizer + 37;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.razorpay.BaseCheckoutActivity, com.razorpay.CheckoutPresenterImpl.CheckoutView
    public final /* bridge */ /* synthetic */ void destroy(int i, String str) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi21Parcelizer + 79;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        super.destroy(i, str);
        if (i4 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i5 = AudioAttributesImplApi21Parcelizer + 67;
        AudioAttributesImplApi26Parcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 62 / 0;
        }
    }

    @Override // com.razorpay.BaseCheckoutActivity, com.razorpay.CheckoutPresenterImpl.CheckoutView
    public final /* bridge */ /* synthetic */ WebView getWebView(int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi21Parcelizer + 115;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            return super.getWebView(i);
        }
        super.getWebView(i);
        throw null;
    }

    @Override // com.razorpay.BaseCheckoutActivity, com.razorpay.CheckoutPresenterImpl.CheckoutView
    public final /* bridge */ /* synthetic */ void hideProgressBar() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 65;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.hideProgressBar();
        int i4 = AudioAttributesImplApi26Parcelizer + 23;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 45 / 0;
        }
    }

    @Override // com.razorpay.BaseCheckoutActivity, com.razorpay.CheckoutPresenterImpl.CheckoutView
    public final /* bridge */ /* synthetic */ boolean isWebViewVisible(int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi21Parcelizer + 119;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        boolean zIsWebViewVisible = super.isWebViewVisible(i);
        if (i4 != 0) {
            int i5 = 55 / 0;
        }
        int i6 = AudioAttributesImplApi26Parcelizer + 3;
        AudioAttributesImplApi21Parcelizer = i6 % 128;
        int i7 = i6 % 2;
        return zIsWebViewVisible;
    }

    @Override // com.razorpay.BaseCheckoutActivity, com.razorpay.CheckoutPresenterImpl.CheckoutView
    public final /* bridge */ /* synthetic */ void loadData(int i, String str, String str2, String str3) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi21Parcelizer + 119;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        super.loadData(i, str, str2, str3);
        if (i4 != 0) {
            throw null;
        }
    }

    @Override // com.razorpay.BaseCheckoutActivity, com.razorpay.CheckoutPresenterImpl.CheckoutView
    public final /* bridge */ /* synthetic */ void loadDataWithBaseURL(int i, String str, String str2, String str3, String str4, String str5) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi26Parcelizer + 81;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        super.loadDataWithBaseURL(i, str, str2, str3, str4, str5);
        int i5 = AudioAttributesImplApi21Parcelizer + 39;
        AudioAttributesImplApi26Parcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.razorpay.BaseCheckoutActivity, com.razorpay.CheckoutPresenterImpl.CheckoutView
    public final /* bridge */ /* synthetic */ void loadUrl(int i, String str) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi26Parcelizer + 103;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        super.loadUrl(i, str);
        if (i4 == 0) {
            throw null;
        }
    }

    @Override // com.razorpay.BaseCheckoutActivity, com.razorpay.CheckoutPresenterImpl.CheckoutView
    public final /* bridge */ /* synthetic */ void makeWebViewVisible(int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi21Parcelizer + 31;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        super.makeWebViewVisible(i);
        int i5 = AudioAttributesImplApi26Parcelizer + 97;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.razorpay.BaseCheckoutActivity, android.app.Activity
    public final /* bridge */ /* synthetic */ void onBackPressed() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 19;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onBackPressed();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.razorpay.BaseCheckoutActivity, android.app.Activity, android.content.ComponentCallbacks
    public final /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 115;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onConfigurationChanged(configuration);
        if (i3 == 0) {
            int i4 = 63 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Override // com.razorpay.BaseCheckoutOtpelfActivity, com.razorpay.BaseCheckoutActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.CheckoutActivity.onPause():void");
    }

    @Override // com.razorpay.BaseCheckoutActivity, android.app.Activity
    public final /* bridge */ /* synthetic */ void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi26Parcelizer + 5;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (i4 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00fb  */
    @Override // com.razorpay.BaseCheckoutOtpelfActivity, com.razorpay.BaseCheckoutActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final /* bridge */ /* synthetic */ void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.CheckoutActivity.onResume():void");
    }

    @Override // com.razorpay.BaseCheckoutActivity, android.app.Activity
    public final /* bridge */ /* synthetic */ void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 121;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onSaveInstanceState(bundle);
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = AudioAttributesImplApi21Parcelizer + 111;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // com.razorpay.BaseCheckoutActivity, com.razorpay.SmsAgentInterface
    public final /* bridge */ /* synthetic */ void postSms(String str, String str2) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 37;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.postSms(str, str2);
        int i4 = AudioAttributesImplApi26Parcelizer + 77;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.razorpay.BaseCheckoutActivity, com.razorpay.SmsAgentInterface
    public final /* bridge */ /* synthetic */ void setSmsPermission(boolean z) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 55;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.setSmsPermission(z);
        int i4 = AudioAttributesImplApi26Parcelizer + 67;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.razorpay.BaseCheckoutActivity, com.razorpay.CheckoutPresenterImpl.CheckoutView
    public final /* bridge */ /* synthetic */ void showProgressBar(int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi26Parcelizer + 47;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        super.showProgressBar(i);
        int i5 = AudioAttributesImplApi26Parcelizer + 75;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.razorpay.BaseCheckoutActivity, com.razorpay.CheckoutPresenterImpl.CheckoutView
    public final /* bridge */ /* synthetic */ void showToast(String str, int i) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplApi21Parcelizer + 41;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        super.showToast(str, i);
        if (i4 != 0) {
            int i5 = 7 / 0;
        }
    }

    private static void j(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = -470782045;
        int i4 = 43695;
        int i5 = 16;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = $11 + 47;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getMaximumFlingVelocity() >> i5) + i4), 23297 - ExpandableListView.getPackedPositionGroup(0L), 15 - TextUtils.getOffsetAfter("", 0), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i9++;
                    i4 = 43695;
                    i5 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = MediaBrowserCompatCustomActionResultReceiver;
        if (iArr5 != null) {
            int i10 = $11 + 47;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                try {
                    Object[] objArr3 = new Object[1];
                    objArr3[i6] = Integer.valueOf(iArr5[i12]);
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(i3);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (View.getDefaultSize(i6, i6) + 43695), Color.argb(i6, i6, i6, i6) + 23297, 15 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr6[i12] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    i12++;
                    i3 = -470782045;
                    i6 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        int i13 = i6;
        System.arraycopy(iArr5, i13, iArr4, i13, length2);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i13;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            int i14 = $10 + 125;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr4);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i16];
                Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 43695), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23296, 14 - TextUtils.indexOf((CharSequence) "", '0'), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
                i16++;
            }
            int i18 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i18;
            buildremovealldownloadsintent.read ^= iArr4[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[17];
            int i19 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i20 = buildremovealldownloadsintent.read;
            cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
            cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
            cArr[3] = (char) buildremovealldownloadsintent.read;
            buildRemoveAllDownloadsIntent.read(iArr4);
            cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
            Object[] objArr5 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(516305436);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (48194 - (KeyEvent.getMaxKeyCode() >> 16)), 20126 - ((Process.getThreadPriority(0) + 20) >> 6), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19, 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        String str = new String(cArr2, 0, i);
        int i21 = $10 + 113;
        $11 = i21 % 128;
        int i22 = i21 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0080 A[PHI: r4
      0x0080: PHI (r4v10 byte[] A[IMMUTABLE_TYPE]) = (r4v9 byte[]), (r4v21 byte[]) binds: [B:19:0x007e, B:16:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0178 A[PHI: r4
      0x0178: PHI (r4v20 byte[]) = (r4v9 byte[]), (r4v21 byte[]) binds: [B:19:0x007e, B:16:0x0079] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void i(int r24, short r25, int r26, int r27, byte r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 824
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.CheckoutActivity.i(int, short, int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x028e  */
    @Override // com.razorpay.BaseCheckoutOtpelfActivity, com.razorpay.BaseCheckoutActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2890
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.CheckoutActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0bd1 A[Catch: all -> 0x0c83, TryCatch #0 {all -> 0x0c83, blocks: (B:141:0x0bbd, B:143:0x0bd1, B:144:0x0bff), top: B:260:0x0bbd, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0c12 A[Catch: all -> 0x0c79, TryCatch #12 {all -> 0x0c79, blocks: (B:145:0x0c05, B:147:0x0c12, B:148:0x0c71), top: B:282:0x0c05, outer: #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0d9b  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0ddf  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0e32  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x109f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x117d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x11c1  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x1217  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x148b  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0b99 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:293:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0162  */
    @Override // com.razorpay.BaseCheckoutOtpelfActivity, com.razorpay.BaseCheckoutActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5836
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.CheckoutActivity.attachBaseContext(android.content.Context):void");
    }

    @Override // com.razorpay.BaseCheckoutOtpelfActivity, com.razorpay.BaseCheckoutActivity, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 5;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
        int i4 = AudioAttributesImplApi26Parcelizer + 15;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }
}
