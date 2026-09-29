package kotlin;

import android.app.Service;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.IBinder;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public class calculatePacketSize extends Service {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {TarConstants.LF_NORMAL, -59, 73, 39, 26, 15, 9, 12, -8, -29, 41, 24, -4, 13, 6, -36, TarConstants.LF_CHR, 5, 10, -8, 26, -29, 24, 24, -8, 9, 14, 4, 24, -14, 20, -58, 64, 5, 22, -25, 27, 20, -1, -4, 19, -6, 15, 10, -16, 36, 1, -65, TarConstants.LF_DIR, 26, 15, 9, 12, -8, -29, 41, 24, -4, 13, 6, -36, TarConstants.LF_CHR, 5, 10, -8, 26, -29, 24, 24, -8, 9, 14, 4, 24, -14, 20};
    private static final int $$e = 200;
    private static final byte[] $$a = {115, TarConstants.LF_DIR, -117, 77, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 170;
    private static int write = 0;
    private static int AudioAttributesCompatParcelizer = 1;
    private static int read = 1000326394;
    private static char[] RemoteActionCompatParcelizer = {6478, 6428, 6430, 6417, 6481, 6471, 6431, 6468, 6523, 6427, 6429, 6835, 6491, 6834, 6416, 6473, 6476, 6474, 6425, 6496, 6406, 6465, 6467, 6490, 6832, 6475, 6525, 6464, 6470, 6507, 6479, 6492, 6477, 6424, 6469, 6426};
    private static char IconCompatParcelizer = 11444;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r0 = r7 + 4
            int r6 = 191 - r6
            byte[] r1 = kotlin.calculatePacketSize.$$a
            int r5 = 114 - r5
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L20:
            r4 = r1[r6]
            int r3 = r3 + 1
        L24:
            int r6 = r6 + 1
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.calculatePacketSize.c(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 29
            int r7 = r7 + 82
            int r6 = r6 + 4
            int r5 = r5 * 18
            int r0 = r5 + 28
            byte[] r1 = kotlin.calculatePacketSize.$$d
            byte[] r0 = new byte[r0]
            int r5 = r5 + 27
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r7
            r3 = r2
            r7 = r5
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r6]
        L2b:
            int r7 = r7 + r4
            int r7 = r7 + (-7)
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.calculatePacketSize.d(short, short, int, java.lang.Object[]):void");
    }

    private static void a(int i, boolean z, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i2];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i3 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i5 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(read)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((-16777216) - Color.rgb(0, 0, 0)), 23704 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), View.MeasureSpec.getMode(0) + 32, -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (44862 - View.resolveSizeAndState(0, 0, 0)), 18944 - (ViewConfiguration.getTouchSlop() >> 8), 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -1836173544, false, "c", new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            cleardownloadmanagerhelpers.write = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i2 - cleardownloadmanagerhelpers.write);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                int i6 = $10 + 43;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
                    Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 44861), 18944 - TextUtils.indexOf("", "", 0, 0), 27 - TextUtils.indexOf((CharSequence) "", '0', 0), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } else {
                    cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                    Object[] objArr5 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (44862 - View.combineMeasuredStates(0, 0)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 18945, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
            }
            int i7 = $11 + 113;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void b(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = RemoteActionCompatParcelizer;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 7015, View.combineMeasuredStates(0, 0) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
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
        try {
            Object[] objArr3 = {Integer.valueOf(IconCompatParcelizer)};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.indexOf("", ""), 7015 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 29 - ExpandableListView.getPackedPositionChild(0L), -626716224, false, "o", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i5 = $11 + 79;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                needsstartedservice.AudioAttributesCompatParcelizer = 0;
                while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                    needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                    needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                    if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                        int i7 = $11 + 17;
                        $10 = i7 % 128;
                        int i8 = i7 % 2;
                        obj = obj2;
                    } else {
                        Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 48195), 20126 - (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 21, 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                            Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) Color.red(0), 19368 - (KeyEvent.getMaxKeyCode() >> 16), Color.blue(0) + 18, 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                            int i9 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i9];
                        } else {
                            obj = null;
                            if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                                int i10 = $11 + 3;
                                $10 = i10 % 128;
                                int i11 = i10 % 2;
                                needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                                needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                                int i12 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                                int i13 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i12];
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i13];
                            } else {
                                int i14 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                int i15 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i14];
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i15];
                            }
                        }
                    }
                    needsstartedservice.AudioAttributesCompatParcelizer += 2;
                    obj2 = obj;
                }
            }
            int i16 = $11 + 49;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            for (int i18 = 0; i18 < i; i18++) {
                cArr4[i18] = (char) (cArr4[i18] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:(28:286|32|33|(1:39)(3:36|37|(0)(1:41))|76|278|77|(4:79|80|275|81)(1:82)|83|84|(4:86|87|(1:89)|90)(19:91|92|264|93|(1:95)|96|97|287|98|(1:100)|101|102|103|(1:105)|106|(1:108)|109|(1:111)|112)|113|(4:116|(14:294|118|(3:120|(4:123|(3:302|125|305)(4:301|126|127|304)|303|121)|300)|128|276|129|(1:131)|132|133|134|266|135|136|(3:295|138|299)(1:298))(1:297)|296|114)|293|175|(1:177)|178|(3:180|(1:182)|183)(13:185|282|186|187|(1:189)|190|272|191|192|(1:194)|195|(1:197)|198)|184|199|(7:201|202|(1:204)|205|206|207|208)|209|(1:211)|212|(3:214|(1:216)|217)(14:219|220|(1:222)|223|224|(1:226)|227|291|228|229|(1:231)|232|(1:234)|235)|218|236|(7:238|239|(1:241)|242|243|244|245)(1:306))|280|45|(1:47)|48|268|49|(1:51)|52|76|278|77|(0)(0)|83|84|(0)(0)|113|(1:114)|293|175|(0)|178|(0)(0)|184|199|(0)|209|(0)|212|(0)(0)|218|236|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0bce, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0bcf, code lost:
    
        r15 = r22;
     */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0a7b A[Catch: all -> 0x0bcc, TryCatch #6 {all -> 0x0bcc, blocks: (B:81:0x0680, B:83:0x06ae, B:87:0x06c8, B:89:0x06ce, B:90:0x0710, B:113:0x0a71, B:114:0x0a75, B:116:0x0a7b, B:118:0x0a91, B:121:0x0a9e, B:125:0x0aad, B:126:0x0ab5, B:133:0x0b18, B:141:0x0ba6, B:143:0x0bac, B:144:0x0bad, B:146:0x0baf, B:148:0x0bb6, B:149:0x0bb7, B:91:0x071b, B:103:0x08ac, B:105:0x08b2, B:106:0x08f6, B:108:0x09d2, B:109:0x0a18, B:111:0x0a2e, B:112:0x0a6b, B:151:0x0bb9, B:153:0x0bc0, B:154:0x0bc1, B:156:0x0bc3, B:158:0x0bca, B:159:0x0bcb, B:93:0x07cb, B:95:0x07df, B:96:0x0813, B:135:0x0b1d, B:129:0x0ae2, B:131:0x0ae8, B:132:0x0b11, B:98:0x081a, B:100:0x082e, B:101:0x08a0), top: B:275:0x0680, inners: #0, #1, #7, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0d0d  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0d53  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0da8  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x10bf  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x11a2  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x11e7  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x1244  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x152e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x040b  */
    /* JADX WARN: Removed duplicated region for block: B:306:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x042f A[Catch: all -> 0x0436, TRY_LEAVE, TryCatch #12 {all -> 0x0436, blocks: (B:32:0x0415, B:37:0x0426, B:39:0x042f, B:56:0x0506, B:58:0x050c, B:59:0x050d, B:61:0x050f, B:63:0x0516, B:64:0x0517, B:49:0x0484, B:51:0x0491, B:52:0x04fc, B:45:0x043b, B:47:0x044f, B:48:0x047e), top: B:286:0x0415, outer: #5, inners: #2, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0672 A[Catch: all -> 0x0bce, TRY_LEAVE, TryCatch #8 {all -> 0x0bce, blocks: (B:77:0x066c, B:79:0x0672), top: B:278:0x066c }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x06ac  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x06bb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x071b A[Catch: all -> 0x0bcc, TRY_LEAVE, TryCatch #6 {all -> 0x0bcc, blocks: (B:81:0x0680, B:83:0x06ae, B:87:0x06c8, B:89:0x06ce, B:90:0x0710, B:113:0x0a71, B:114:0x0a75, B:116:0x0a7b, B:118:0x0a91, B:121:0x0a9e, B:125:0x0aad, B:126:0x0ab5, B:133:0x0b18, B:141:0x0ba6, B:143:0x0bac, B:144:0x0bad, B:146:0x0baf, B:148:0x0bb6, B:149:0x0bb7, B:91:0x071b, B:103:0x08ac, B:105:0x08b2, B:106:0x08f6, B:108:0x09d2, B:109:0x0a18, B:111:0x0a2e, B:112:0x0a6b, B:151:0x0bb9, B:153:0x0bc0, B:154:0x0bc1, B:156:0x0bc3, B:158:0x0bca, B:159:0x0bcb, B:93:0x07cb, B:95:0x07df, B:96:0x0813, B:135:0x0b1d, B:129:0x0ae2, B:131:0x0ae8, B:132:0x0b11, B:98:0x081a, B:100:0x082e, B:101:0x08a0), top: B:275:0x0680, inners: #0, #1, #7, #13 }] */
    @Override // android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.calculatePacketSize.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Service
    public IBinder onBind(Intent intent) {
        int i = 2 % 2;
        int i2 = write + 49;
        int i3 = i2 % 128;
        AudioAttributesCompatParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 97;
        write = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // android.app.Service
    public void onCreate() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 17;
        write = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
