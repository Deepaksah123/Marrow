package com.google.android.gms.wallet.callback;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.IBinder;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.buildRemoveAllDownloadsIntent;
import kotlin.notifyDownloads;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public abstract class BasePaymentDataCallbacksService extends zzd {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {115, TarConstants.LF_DIR, -117, 77, 25, 14, 8, 11, -9, -30, 40, 23, -5, 12, 5, -37, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19, 18, 4, -57, 62, 1, 24, 7, -9, 19, 12, -5, 5, -56, 66, -3, 8, 14, 14, 2, 5, -58, 60, 3, 25, -13, 7, 13, 11, -4, -48, 66, 0, 13, -52, 9, 0, 34, 0, 13, -20, 9, 39, 37, -5, 9, -66, TarConstants.LF_BLK, 21, 28, -29, 43, -3, -5, -17, 25, 18, -2, 58, -11, 11, 12, -40, 57, 6, 4, -3, -1, 25, 5, -9, 20, -42, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19};
    private static final int $$h = 98;
    private static final byte[] $$a = {122, -64, TarConstants.LF_SYMLINK, -113, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 116;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static char[] AudioAttributesCompatParcelizer = {28437, 28454, 28432, 28450, 28455, 28461, 28518, 28451, 28420, 28435, 28433, 28513, 28516, 28462, 28434, 28512, 28542, 28515, 28541, 28540, 28517, 28514, 28543, 28448, 28477, 28428, 28460, 28531, 28419, 28457, 28456, 28459, 28452, 28418};
    private static int IconCompatParcelizer = 411398068;
    private static boolean RemoteActionCompatParcelizer = true;
    private static boolean write = true;
    private static int[] read = {-2019162246, -1637571103, 1863171595, -2137342153, 44677709, 1754554865, -897756344, -1834830610, 1116742897, 732154957, -881336135, 1128973723, -115037987, -578753741, -1761828569, -459214840, -1251431057, -1737423580};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.wallet.callback.BasePaymentDataCallbacksService.$$a
            int r7 = r7 + 65
            int r6 = 190 - r6
            int r1 = 44 - r8
            byte[] r1 = new byte[r1]
            int r8 = 43 - r8
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r6
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2a:
            int r6 = r6 + r4
            int r6 = r6 + (-1)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.callback.BasePaymentDataCallbacksService.c(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 3
            int r6 = 87 - r6
            int r5 = r5 * 17
            int r5 = 99 - r5
            int r7 = r7 * 3
            int r0 = 58 - r7
            byte[] r1 = com.google.android.gms.wallet.callback.BasePaymentDataCallbacksService.$$g
            byte[] r0 = new byte[r0]
            int r7 = 57 - r7
            r2 = 0
            if (r1 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L26:
            int r6 = r6 + 1
            r4 = r1[r6]
            int r3 = r3 + 1
        L2c:
            int r5 = r5 + r4
            int r5 = r5 + (-6)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.callback.BasePaymentDataCallbacksService.d(short, byte, byte, java.lang.Object[]):void");
    }

    protected abstract BasePaymentDataCallbacks createPaymentDataCallbacks();

    @Override // com.google.android.gms.wallet.callback.zzd, android.app.Service
    public IBinder onBind(Intent intent) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 83;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        IBinder iBinderOnBind = super.onBind(intent);
        if (i3 != 0) {
            int i4 = 91 / 0;
        }
        int i5 = MediaBrowserCompatCustomActionResultReceiver + 25;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 30 / 0;
        }
        return iBinderOnBind;
    }

    @Override // com.google.android.gms.wallet.callback.zzd, android.app.Service
    public void onCreate() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 29;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 37;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 26 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
    
        if ((r0 % 2) != 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002b, code lost:
    
        r2 = createPaymentDataCallbacks();
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r4.getCallbackType() != 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        r2 = createPaymentDataCallbacks();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003e, code lost:
    
        if (r4.getCallbackType() != 1) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0040, code lost:
    
        r2.onPaymentAuthorized((com.google.android.gms.wallet.PaymentData) r4.deserializeRequest(com.google.android.gms.wallet.PaymentData.CREATOR), new com.google.android.gms.wallet.callback.zze(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0050, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r4.getCallbackType() != 2) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0057, code lost:
    
        r2.onPaymentDataChanged((com.google.android.gms.wallet.callback.IntermediatePaymentData) r4.deserializeRequest(com.google.android.gms.wallet.callback.IntermediatePaymentData.CREATOR), new com.google.android.gms.wallet.callback.zzf(r5));
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x006f, code lost:
    
        throw new java.lang.IllegalStateException("Unknown Callback Types");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0077, code lost:
    
        throw new java.lang.IllegalStateException("Callback Types must be set");
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r4.getCallbackType() != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r4.getCallbackType() != 0) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r0 = com.google.android.gms.wallet.callback.BasePaymentDataCallbacksService.AudioAttributesImplBaseParcelizer + 69;
        com.google.android.gms.wallet.callback.BasePaymentDataCallbacksService.MediaBrowserCompatCustomActionResultReceiver = r0 % 128;
     */
    @Override // com.google.android.gms.wallet.callback.zzd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onRunTask(java.lang.String r3, com.google.android.gms.wallet.callback.CallbackInput r4, com.google.android.gms.wallet.callback.OnCompleteListener<com.google.android.gms.wallet.callback.CallbackOutput> r5) {
        /*
            r2 = this;
            r3 = 2
            int r0 = r3 % r3
            int r0 = com.google.android.gms.wallet.callback.BasePaymentDataCallbacksService.AudioAttributesImplBaseParcelizer
            int r0 = r0 + 105
            int r1 = r0 % 128
            com.google.android.gms.wallet.callback.BasePaymentDataCallbacksService.MediaBrowserCompatCustomActionResultReceiver = r1
            int r0 = r0 % r3
            if (r0 != 0) goto L19
            int r0 = r4.getCallbackType()
            r1 = 52
            int r1 = r1 / 0
            if (r0 == 0) goto L70
            goto L1f
        L19:
            int r0 = r4.getCallbackType()
            if (r0 == 0) goto L70
        L1f:
            int r0 = com.google.android.gms.wallet.callback.BasePaymentDataCallbacksService.AudioAttributesImplBaseParcelizer
            int r0 = r0 + 69
            int r1 = r0 % 128
            com.google.android.gms.wallet.callback.BasePaymentDataCallbacksService.MediaBrowserCompatCustomActionResultReceiver = r1
            int r0 = r0 % r3
            r1 = 1
            if (r0 != 0) goto L36
            com.google.android.gms.wallet.callback.BasePaymentDataCallbacks r2 = r2.createPaymentDataCallbacks()
            int r0 = r4.getCallbackType()
            if (r0 != r1) goto L51
            goto L40
        L36:
            com.google.android.gms.wallet.callback.BasePaymentDataCallbacks r2 = r2.createPaymentDataCallbacks()
            int r0 = r4.getCallbackType()
            if (r0 != r1) goto L51
        L40:
            android.os.Parcelable$Creator<com.google.android.gms.wallet.PaymentData> r3 = com.google.android.gms.wallet.PaymentData.CREATOR
            com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r3 = r4.deserializeRequest(r3)
            com.google.android.gms.wallet.PaymentData r3 = (com.google.android.gms.wallet.PaymentData) r3
            com.google.android.gms.wallet.callback.zze r4 = new com.google.android.gms.wallet.callback.zze
            r4.<init>(r5)
            r2.onPaymentAuthorized(r3, r4)
            return
        L51:
            int r0 = r4.getCallbackType()
            if (r0 != r3) goto L68
            android.os.Parcelable$Creator<com.google.android.gms.wallet.callback.IntermediatePaymentData> r3 = com.google.android.gms.wallet.callback.IntermediatePaymentData.CREATOR
            com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable r3 = r4.deserializeRequest(r3)
            com.google.android.gms.wallet.callback.IntermediatePaymentData r3 = (com.google.android.gms.wallet.callback.IntermediatePaymentData) r3
            com.google.android.gms.wallet.callback.zzf r4 = new com.google.android.gms.wallet.callback.zzf
            r4.<init>(r5)
            r2.onPaymentDataChanged(r3, r4)
            return
        L68:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Unknown Callback Types"
            r2.<init>(r3)
            throw r2
        L70:
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r3 = "Callback Types must be set"
            r2.<init>(r3)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.callback.BasePaymentDataCallbacksService.onRunTask(java.lang.String, com.google.android.gms.wallet.callback.CallbackInput, com.google.android.gms.wallet.callback.OnCompleteListener):void");
    }

    private static void b(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = read;
        char c = '0';
        int i3 = -470782045;
        int i4 = 43695;
        if (iArr2 != null) {
            int i5 = $11 + 71;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(i3);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (i4 - (ViewConfiguration.getWindowTouchSlop() >> 8)), TextUtils.lastIndexOf("", c) + 23298, TextUtils.getOffsetBefore("", 0) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i7++;
                    c = '0';
                    i3 = -470782045;
                    i4 = 43695;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i8 = $10 + 1;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = read;
        if (iArr5 != null) {
            int i10 = $11 + 5;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            for (int i12 = 0; i12 < length3; i12++) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i12])};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (43695 - TextUtils.getCapsMode("", 0, 0)), (-16753919) - Color.rgb(0, 0, 0), 15 - View.getDefaultSize(0, 0), -1648776394, false, "A", new Class[]{Integer.TYPE});
                }
                iArr6[i12] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = 0;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr4);
            for (int i13 = 0; i13 < 16; i13++) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i13];
                Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 43695), TextUtils.indexOf((CharSequence) "", '0', 0) + 23298, 15 - View.MeasureSpec.getSize(0), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
            }
            int i14 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i14;
            buildremovealldownloadsintent.read ^= iArr4[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[17];
            int i15 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i16 = buildremovealldownloadsintent.read;
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
                objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 48194), 20126 - (ViewConfiguration.getJumpTapTimeout() >> 16), KeyEvent.getDeadChar(0, 0) + 20, 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void a(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = AudioAttributesCompatParcelizer;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                int i4 = $11 + 91;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (44861 - ExpandableListView.getPackedPositionChild(j)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 18944, 28 - (KeyEvent.getMaxKeyCode() >> 16), -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
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
        Object[] objArr3 = {Integer.valueOf(IconCompatParcelizer)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 19033 - Color.alpha(0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 75, 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        if (write) {
            int i6 = $11 + 95;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                int i8 = $11 + 111;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer % 0) / notifydownloads.IconCompatParcelizer] * i] >> iIntValue);
                    Object[] objArr4 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 11439 - TextUtils.indexOf("", ""), 13 - TextUtils.lastIndexOf("", '0', 0, 0), -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } else {
                    cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                    Object[] objArr5 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 11439, 14 - TextUtils.getOffsetAfter("", 0), -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!RemoteActionCompatParcelizer) {
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                notifydownloads.IconCompatParcelizer++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i9 = $11 + 65;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
            Object[] objArr6 = {notifydownloads, notifydownloads};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1593953308);
            if (objRemoteActionCompatParcelizer5 == null) {
                objRemoteActionCompatParcelizer5 = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), ExpandableListView.getPackedPositionType(0L) + 11439, Color.green(0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            int i11 = $10 + 9;
            $11 = i11 % 128;
            int i12 = i11 % 2;
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:136:0x08a0 A[Catch: all -> 0x0960, TryCatch #1 {all -> 0x0960, blocks: (B:134:0x088b, B:136:0x08a0, B:137:0x08cc), top: B:254:0x088b, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:140:0x08df A[Catch: all -> 0x0956, TryCatch #9 {all -> 0x0956, blocks: (B:138:0x08d2, B:140:0x08df, B:141:0x094e), top: B:268:0x08d2, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0a9c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0aec  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0dce  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0eb3  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0efd  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0f4e  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x1192  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x0858 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:284:? A[RETURN, SYNTHETIC] */
    @Override // com.google.android.gms.wallet.callback.zzd, android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.callback.BasePaymentDataCallbacksService.attachBaseContext(android.content.Context):void");
    }
}
