package com.razorpay;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.needsStartedService;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
abstract class BaseCheckoutOtpelfActivity extends BaseCheckoutActivity {
    private static short[] AudioAttributesImplApi26Parcelizer;
    private static final byte[] $$c = {TarConstants.LF_GNUTYPE_LONGLINK, 94, -43, -123};
    private static final int $$f = TsExtractor.TS_STREAM_TYPE_AC4;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {31, 34, 9, -77, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -50, -9, 5, 3, 1, 4, 67, -68, 4, 14, 0, 65, -73, 3, 28, 16, 7, 0, -16, -5, 1, -2, 18, 39, -31, -14, 14, -3, 4, 46, -41, 5, 0, 18, -16, 39, -14, -14, 18, 1, -4, 6, -14, 24, -10, 68, -21, -44, 12, 3, 28, -15, 1, -3, 11, -6, -3, TarConstants.LF_SYMLINK, -38, 14, -12, -4, 12, -1, 14, -3, 4, 38, -23, -17, 57, -27, 1, -2, 6, TarConstants.LF_CONTIG, 8, 12, -8, 18};
    private static final int $$n = 77;
    private static final byte[] $$d = {29, -75, -112, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 193;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;
    private static char[] write = {6466, 6491, 6490, 6469, 6494, 6425, 6842, 6473, 6493, 6431, 6405, 6836, 6837, 6477, 6523, 6832, 6475, 6834, 6428, 6479, 6416, 6835, 6464, 6470, 6505, 6833, 6417, 6467, 6476, 6492, 6472, 6468, 6465, 6481, 6839, 6424, 6520, 6507, 6406, 6474, 6429, 6426, 6478, 6427, 6838, 6488, 6524, 6471, 6430};
    private static char read = 11445;
    private static int AudioAttributesCompatParcelizer = 523064159;
    private static int RemoteActionCompatParcelizer = -819363114;
    private static int IconCompatParcelizer = -1020310102;
    private static byte[] AudioAttributesImplApi21Parcelizer = {19, 6, 125, 37, 117, 104, 116, 119, 117, 34, 89, 35, 69, 56, 70, 9, 113, 38, 11, 116, 71, 34, 69, 8, 39, 67, 59, 67, 117, 59, 67, 56, 114, 10, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 32, 89, 10, 127, 11, 115, 12, 33, 119, 90, 127, 119, 116, 119, 117, 39, 117, 93, 34, 118, 115, 93, 127, 10, 37, 118, 90, 33, 69, 117, 57, 115, 70, 39, 85, 70, 79, TarConstants.LF_GNUTYPE_LONGNAME, 86, -76, -97, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 25, -114, 26, 68, -73, 71, 92, 64, -101, 15, 92, -74, -109, 3, 71, 73, -112, 12, 82, -76, 105, 65, 71, -74, TarConstants.LF_GNUTYPE_SPARSE, -76, 105, -73, -100, 27, 68, -77, 71, 86, -78, 89, 82, TarConstants.LF_GNUTYPE_LONGLINK, 81, -113, 26, -74, 95, 92, 79, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 92, 72, 66, 77, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -112, 69, 80, 14, 66, 89, 69, 73, 18, 72, 66, 73, 73, 71, 24, 85, 97, -70, 11, 97, 68, 77, 7, 81, 91, 97, 80, 93, 85, 107, 25, -81, -109, -94, -97, -100, -85, -124, -71, -88, -91, -108, -104, -94, -112, 29, -92, -95, -105, -93, -83, -95, -87, -93, -105, -96};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r6, short r7, int r8) {
        /*
            byte[] r0 = com.razorpay.BaseCheckoutOtpelfActivity.$$c
            int r7 = r7 * 4
            int r7 = 112 - r7
            int r6 = r6 + 4
            int r8 = r8 * 4
            int r1 = 1 - r8
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r6 = r6 + r3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.BaseCheckoutOtpelfActivity.$$i(short, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            int r9 = r9 + 65
            int r7 = r7 + 4
            byte[] r0 = com.razorpay.BaseCheckoutOtpelfActivity.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r9 = r8
            r4 = r2
            goto L27
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L27:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-1)
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.BaseCheckoutOtpelfActivity.g(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.razorpay.BaseCheckoutOtpelfActivity.$$m
            int r9 = 101 - r9
            int r7 = r7 + 82
            int r8 = r8 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r8
            r7 = r9
            r4 = r2
            goto L28
        L11:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            r3 = r0[r7]
        L28:
            int r3 = -r3
            int r9 = r9 + r3
            int r9 = r9 + 3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.BaseCheckoutOtpelfActivity.h(byte, short, int, java.lang.Object[]):void");
    }

    BaseCheckoutOtpelfActivity() {
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01cc  */
    @Override // com.razorpay.BaseCheckoutActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.BaseCheckoutOtpelfActivity.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x008a A[PHI: r4
      0x008a: PHI (r4v8 byte[] A[IMMUTABLE_TYPE]) = (r4v7 byte[]), (r4v23 byte[]) binds: [B:20:0x0088, B:17:0x0083] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x01e4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(short r25, byte r26, int r27, int r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 825
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.BaseCheckoutOtpelfActivity.f(short, byte, int, int, int, java.lang.Object[]):void");
    }

    private static void e(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
        int i2;
        char c;
        Object obj;
        int length;
        char[] cArr2;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr3 = write;
        long j = 0;
        char c2 = '\b';
        Object obj2 = null;
        if (cArr3 != null) {
            int i4 = $11 + 11;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 5;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) - 1), 7015 - (ViewConfiguration.getTouchSlop() >> 8), 30 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -626716224, false, "o", new Class[]{Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
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
                        Object[] objArr3 = {Integer.valueOf(cArr3[i5])};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 7015 - TextUtils.getOffsetBefore("", 0), 30 - TextUtils.getTrimmedLength(""), -626716224, false, "o", new Class[]{Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                        i5++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                j = 0;
            }
            cArr3 = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(read)};
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        if (objRemoteActionCompatParcelizer3 == null) {
            objRemoteActionCompatParcelizer3 = startForeground.read((char) ((-1) - Process.getGidForName("")), ExpandableListView.getPackedPositionType(0L) + 7015, (ViewConfiguration.getPressedStateDuration() >> 16) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i7 = $10 + 55;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                needsstartedservice.AudioAttributesCompatParcelizer = 1;
            } else {
                needsstartedservice.AudioAttributesCompatParcelizer = 0;
            }
            while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                    c = c2;
                    obj = obj2;
                } else {
                    Object[] objArr5 = new Object[13];
                    objArr5[12] = needsstartedservice;
                    objArr5[11] = Integer.valueOf(cCharValue);
                    objArr5[10] = needsstartedservice;
                    objArr5[9] = needsstartedservice;
                    objArr5[c2] = Integer.valueOf(cCharValue);
                    objArr5[7] = needsstartedservice;
                    objArr5[6] = needsstartedservice;
                    objArr5[5] = Integer.valueOf(cCharValue);
                    objArr5[4] = needsstartedservice;
                    objArr5[3] = needsstartedservice;
                    objArr5[2] = Integer.valueOf(cCharValue);
                    objArr5[1] = needsstartedservice;
                    objArr5[0] = needsstartedservice;
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(105000849);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char c3 = (char) (48195 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int modifierMetaStateMask = 20125 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int i8 = (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20;
                        Class[] clsArr = new Class[13];
                        clsArr[0] = Object.class;
                        clsArr[1] = Object.class;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Object.class;
                        clsArr[4] = Object.class;
                        clsArr[5] = Integer.TYPE;
                        clsArr[6] = Object.class;
                        clsArr[7] = Object.class;
                        clsArr[c2] = Integer.TYPE;
                        clsArr[9] = Object.class;
                        clsArr[10] = Object.class;
                        clsArr[11] = Integer.TYPE;
                        clsArr[12] = Object.class;
                        objRemoteActionCompatParcelizer4 = startForeground.read(c3, modifierMetaStateMask, i8, 2014046980, false, "n", clsArr);
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                        int i9 = $11 + 11;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        Object[] objArr6 = new Object[11];
                        objArr6[10] = needsstartedservice;
                        objArr6[9] = Integer.valueOf(cCharValue);
                        objArr6[c2] = needsstartedservice;
                        objArr6[7] = Integer.valueOf(cCharValue);
                        objArr6[6] = Integer.valueOf(cCharValue);
                        objArr6[5] = needsstartedservice;
                        objArr6[4] = needsstartedservice;
                        objArr6[3] = Integer.valueOf(cCharValue);
                        objArr6[2] = Integer.valueOf(cCharValue);
                        objArr6[1] = needsstartedservice;
                        objArr6[0] = needsstartedservice;
                        Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(50135433);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            c = '\b';
                            objRemoteActionCompatParcelizer5 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 19368 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), View.combineMeasuredStates(0, 0) + 18, 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            c = c2;
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).intValue();
                        int i11 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr3[iIntValue];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr3[i11];
                    } else {
                        c = c2;
                        obj = null;
                        if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                            needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                            needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                            int i12 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            int i13 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr3[i12];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr3[i13];
                        } else {
                            int i14 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            int i15 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr3[i14];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr3[i15];
                        }
                    }
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
                obj2 = obj;
                c2 = c;
            }
        }
        for (int i16 = 0; i16 < i; i16++) {
            cArr4[i16] = (char) (cArr4[i16] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.razorpay.BaseCheckoutActivity, android.app.Activity
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = AudioAttributesImplBaseParcelizer + 43;
            MediaBrowserCompatItemReceiver = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_item_list).substring(0, 4).length() + 22, new char[]{'\t', 21, 30, 0, '.', '!', 31, '#', '\n', '*', 3, '-', 23, 17, 30, '!', 11, '\'', 30, '\"', '+', 25, 6, '\t', 14, '#'}, (byte) (95 - Color.argb(0, 0, 0, 0)), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 93, new char[]{15, '\t', 13819, 13819, '\t', 27, 31, 22, 13821, 13821, ' ', '!', 14, '\t', 30, '!', ',', 26}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 9), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i4 = MediaBrowserCompatItemReceiver + 103;
                AudioAttributesImplBaseParcelizer = i4 % 128;
                int i5 = i4 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i6 = AudioAttributesImplBaseParcelizer + 53;
                MediaBrowserCompatItemReceiver = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 4535), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 6054, ExpandableListView.getPackedPositionGroup(0L) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0')), TextUtils.getCapsMode("", 0, 0) + 6030, 25 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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
        super.onResume();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00d2  */
    @Override // com.razorpay.BaseCheckoutActivity, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.BaseCheckoutOtpelfActivity.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:132:0x0ad2 A[Catch: all -> 0x0482, TryCatch #1 {all -> 0x0482, blocks: (B:182:0x0d2e, B:184:0x0d34, B:185:0x0d61, B:221:0x12ac, B:223:0x12b2, B:224:0x12da, B:257:0x17d6, B:259:0x17dc, B:260:0x17fd, B:238:0x150e, B:240:0x1530, B:241:0x1581, B:130:0x0acc, B:132:0x0ad2, B:133:0x0afb, B:25:0x0127, B:27:0x012d, B:28:0x0155, B:30:0x03f3, B:32:0x0422, B:33:0x047c), top: B:284:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0ba4 A[Catch: all -> 0x0c99, TryCatch #14 {all -> 0x0c99, blocks: (B:152:0x0bad, B:150:0x0ba4, B:147:0x0b9e, B:167:0x0c87, B:169:0x0c8d, B:170:0x0c8e, B:172:0x0c90, B:174:0x0c97, B:175:0x0c98, B:160:0x0c06, B:162:0x0c13, B:163:0x0c7d, B:156:0x0bbe, B:158:0x0bd2, B:159:0x0c00), top: B:309:0x0b9e, inners: #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0bad A[Catch: all -> 0x0c99, TRY_LEAVE, TryCatch #14 {all -> 0x0c99, blocks: (B:152:0x0bad, B:150:0x0ba4, B:147:0x0b9e, B:167:0x0c87, B:169:0x0c8d, B:170:0x0c8e, B:172:0x0c90, B:174:0x0c97, B:175:0x0c98, B:160:0x0c06, B:162:0x0c13, B:163:0x0c7d, B:156:0x0bbe, B:158:0x0bd2, B:159:0x0c00), top: B:309:0x0b9e, inners: #3, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0d34 A[Catch: all -> 0x0482, TryCatch #1 {all -> 0x0482, blocks: (B:182:0x0d2e, B:184:0x0d34, B:185:0x0d61, B:221:0x12ac, B:223:0x12b2, B:224:0x12da, B:257:0x17d6, B:259:0x17dc, B:260:0x17fd, B:238:0x150e, B:240:0x1530, B:241:0x1581, B:130:0x0acc, B:132:0x0ad2, B:133:0x0afb, B:25:0x0127, B:27:0x012d, B:28:0x0155, B:30:0x03f3, B:32:0x0422, B:33:0x047c), top: B:284:0x0127 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0df1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0e3f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0ef7  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x128c  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x136a  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x13b7  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x1406  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x17b6  */
    /* JADX WARN: Removed duplicated region for block: B:322:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e3  */
    @Override // com.razorpay.BaseCheckoutActivity, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6656
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.BaseCheckoutOtpelfActivity.attachBaseContext(android.content.Context):void");
    }

    @Override // com.razorpay.BaseCheckoutActivity, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 19;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = AudioAttributesImplBaseParcelizer + 31;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
    }
}
