package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.Window;
import android.widget.ExpandableListView;
import android.widget.Toast;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.getApplicationLabel;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class shouldEvaluateQueueSize<T extends getApplicationLabel> extends menuHostHelperlambda0 implements View.OnClickListener, handleMiscCode {
    private static int $10 = 0;
    private static int $11 = 1;
    private Toast IconCompatParcelizer;
    private T read;
    private static final byte[] $$j = {115, -66, -117, -68, TarConstants.LF_CONTIG, -41, -34, -9, -15, -2, 20, -54, 1, -11, -8, 3, -29, -5, -11, -20, 19, -29, -19, 0, -11, -23, 3, -23, 37, -54, 1, -11, -8, 12, -30, -33, 24, -21, -21, -19, 6, -24, 3, -6, -13, -29, -18, -12, -15, 5, 26, -44, -27, 1, -16, -9, 33, -54, -8, -13, 5, -29, 26, -27, -27, 5, -12, -17, -7, -27, 11, -23};
    private static final int $$k = 38;
    private static final byte[] $$d = {20, 28, 18, 12, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 201;
    private static int AudioAttributesCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static int[] write = {1470118753, -2092436400, 1787253181, -434658793, -519635370, -1573786667, 1514376208, -1671883067, -1683316965, -1118928631, -1970120561, 2114415017, -412707944, -1059944234, -1401050691, -169785203, -1486944188, -1948475751};

    public static /* synthetic */ Object IconCompatParcelizer(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~(i7 | i2);
        int i9 = ~(i4 | i2);
        int i10 = ~i4;
        int i11 = ~i2;
        int i12 = i8 | i9 | (~(i10 | i11 | i3));
        int i13 = i8 | (~(i7 | i4)) | i9;
        int i14 = (~(i2 | i3)) | (~(i10 | i2)) | (~(i7 | i11 | i4));
        int i15 = i3 + i4 + i + (1880080305 * i5) + (458392769 * i6);
        int i16 = i15 * i15;
        int i17 = ((766573918 * i3) - Integer.MIN_VALUE) + (1582236324 * i4) + (i12 * (-407831203)) + (815662406 * i13) + ((-407831203) * i14) + (1174405120 * i) + (1711276032 * i5) + ((-973078528) * i6) + (68288512 * i16);
        int i18 = ((i3 * 319678698) - 2002258816) + (i4 * 319678284) + (i12 * 207) + (i13 * (-414)) + (i14 * 207) + (i * 319678491) + (i5 * (-161570901)) + (i6 * (-1160779685)) + (i16 * (-1109000192));
        return i17 + ((i18 * i18) * (-1432485888)) != 1 ? RemoteActionCompatParcelizer(objArr) : AudioAttributesCompatParcelizer(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 10
            int r0 = r6 + 34
            int r5 = 79 - r5
            byte[] r1 = kotlin.shouldEvaluateQueueSize.$$d
            int r7 = r7 * 12
            int r7 = r7 + 65
            byte[] r0 = new byte[r0]
            int r6 = r6 + 33
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r5 = r5 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L28:
            r3 = r1[r5]
        L2a:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.shouldEvaluateQueueSize.d(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            byte[] r0 = kotlin.shouldEvaluateQueueSize.$$j
            int r1 = 39 - r6
            int r8 = 114 - r8
            byte[] r1 = new byte[r1]
            int r6 = 38 - r6
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2c
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-10)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.shouldEvaluateQueueSize.f(int, int, int, java.lang.Object[]):void");
    }

    public abstract T write();

    public final T AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        T t = this.read;
        toMagicModuleMetaRepoModel.write(t);
        if (i3 != 0) {
            int i4 = 57 / 0;
        }
        return t;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public shouldEvaluateQueueSize(Context context) {
        super(context);
        toMagicModuleMetaRepoModel.write(context, "");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public shouldEvaluateQueueSize(Context context, int i) {
        super(context, i);
        toMagicModuleMetaRepoModel.write(context, "");
    }

    private static void e(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = write;
        int i4 = 43695;
        int i5 = -470782045;
        int i6 = 1;
        int i7 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i8 = 0;
            while (i8 < length2) {
                int i9 = $10 + 59;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(i5);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (View.MeasureSpec.getMode(0) + i4), 23297 - View.MeasureSpec.getMode(0), TextUtils.getOffsetBefore("", 0) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr4[i8] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i8++;
                    i4 = 43695;
                    i5 = -470782045;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = write;
        long j = 0;
        if (iArr6 != null) {
            int i11 = $11 + 17;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i12 = 0;
            while (i12 < length) {
                Object[] objArr3 = new Object[i6];
                objArr3[i7] = Integer.valueOf(iArr6[i12]);
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', i7, i7) + 43696), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23297, 15 - ExpandableListView.getPackedPositionType(j), -1648776394, false, "A", new Class[]{Integer.TYPE});
                }
                iArr2[i12] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                i12++;
                j = 0;
                i6 = 1;
                i7 = 0;
            }
            i2 = i7;
            iArr6 = iArr2;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr6, i2, iArr5, i2, length3);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i2;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            int i13 = $10 + 39;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr5);
            for (int i15 = 0; i15 < 16; i15++) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[i15];
                Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (KeyEvent.getDeadChar(0, 0) + 43695), TextUtils.getTrimmedLength("") + 23297, 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
            }
            int i16 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i16;
            buildremovealldownloadsintent.read ^= iArr5[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[17];
            int i17 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i18 = buildremovealldownloadsintent.read;
            cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
            cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
            cArr[3] = (char) buildremovealldownloadsintent.read;
            buildRemoveAllDownloadsIntent.read(iArr5);
            cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
            Object[] objArr5 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(516305436);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) ((-16729022) - Color.rgb(0, 0, 0)), View.getDefaultSize(0, 0) + 20126, 20 - View.getDefaultSize(0, 0), 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char scrollBarSize = (char) (13183 - (ViewConfiguration.getScrollBarSize() >> 8));
            int longPressTimeout = 1649 - (ViewConfiguration.getLongPressTimeout() >> 16);
            int doubleTapTimeout = 26 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
            byte b = $$d[17];
            Object[] objArr2 = new Object[1];
            d((byte) 76, b, b, objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(scrollBarSize, longPressTimeout, doubleTapTimeout, -133433128, false, (String) objArr2[0], null);
        }
        Object obj = null;
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            int i2 = AudioAttributesCompatParcelizer + 75;
            RemoteActionCompatParcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char cIndexOf = (char) (13183 - TextUtils.indexOf("", "", 0));
                    int offsetBefore = 1649 - TextUtils.getOffsetBefore("", 0);
                    int capsMode = 26 - TextUtils.getCapsMode("", 0, 0);
                    byte[] bArr = $$d;
                    byte b2 = bArr[39];
                    byte b3 = bArr[5];
                    Object[] objArr3 = new Object[1];
                    d(b2, b3, b3, objArr3);
                    objRemoteActionCompatParcelizer2 = startForeground.read(cIndexOf, offsetBefore, capsMode, -1033747278, false, (String) objArr3[0], null);
                }
                obj.hashCode();
                throw null;
            }
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer3 == null) {
                char scrollBarFadeDuration = (char) (13183 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1649;
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 26;
                byte[] bArr2 = $$d;
                byte b4 = bArr2[39];
                byte b5 = bArr2[5];
                Object[] objArr4 = new Object[1];
                d(b4, b5, b5, objArr4);
                objRemoteActionCompatParcelizer3 = startForeground.read(scrollBarFadeDuration, iResolveSizeAndState, jumpTapTimeout, -1033747278, false, (String) objArr4[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
        } else {
            Object[] objArr5 = new Object[1];
            e(16 - (ViewConfiguration.getWindowTouchSlop() >> 8), new int[]{1389353674, 158596190, -1204045556, 992560890, 884783740, 1373391955, 1890125200, -551546313}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            e(ExpandableListView.getPackedPositionType(0L) + 16, new int[]{-814551477, -921981208, 999231188, 845262032, -379682925, -254485392, -655306213, -72622990}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            int i3 = RemoteActionCompatParcelizer + 107;
            AudioAttributesCompatParcelizer = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 4 % 3;
            }
            try {
                Object[] objArr7 = {Integer.valueOf(iIntValue), 0, 1051720058};
                Object[] objArr8 = new Object[1];
                f(r3[23], (byte) (-$$j[12]), r3[15], objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                f((byte) ($$k - 3), r3[28], r3[23], objArr9);
                objArr = (Object[]) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr7);
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char cNormalizeMetaState = (char) (13183 - KeyEvent.normalizeMetaState(0));
                    int i5 = 1650 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int iResolveSizeAndState2 = 26 - View.resolveSizeAndState(0, 0, 0);
                    byte[] bArr3 = $$d;
                    byte b6 = bArr3[39];
                    byte b7 = bArr3[5];
                    Object[] objArr10 = new Object[1];
                    d(b6, b7, b7, objArr10);
                    objRemoteActionCompatParcelizer4 = startForeground.read(cNormalizeMetaState, i5, iResolveSizeAndState2, -1033747278, false, (String) objArr10[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    e(22 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new int[]{1783031183, 926851455, 582038860, -182821963, 1958878993, -1978765814, -1591954327, -1264129464, 508764693, -1603102147, -2118995584, 1703601061}, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    e(Color.rgb(0, 0, 0) + 16777231, new int[]{430956799, 559432762, 1835335109, -1128544813, 2044113791, 2067837591, 1761431240, -532259766}, objArr12);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 13183);
                        int trimmedLength = 1649 - TextUtils.getTrimmedLength("");
                        int i6 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25;
                        byte b8 = $$d[5];
                        byte b9 = b8;
                        Object[] objArr13 = new Object[1];
                        d(b8, b9, b9, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(cCombineMeasuredStates, trimmedLength, i6, 54351865, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13182);
                        int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 1650;
                        int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 26;
                        byte b10 = $$d[17];
                        Object[] objArr14 = new Object[1];
                        d((byte) 76, b10, b10, objArr14);
                        objRemoteActionCompatParcelizer6 = startForeground.read(c, packedPositionChild, doubleTapTimeout2, -133433128, false, (String) objArr14[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf2);
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
        int i7 = ((int[]) objArr[3])[0];
        int i8 = ((int[]) objArr[2])[0];
        if (i8 != i7) {
            long j = -1;
            long j2 = ((long) (i8 ^ i7)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) (4535 - (ViewConfiguration.getJumpTapTimeout() >> 16)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6053, 43 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, null);
                try {
                    Object[] objArr15 = {-1415658044, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 6030 - (ViewConfiguration.getWindowTouchSlop() >> 8), 24 - View.resolveSize(0, 0));
                    byte b11 = $$j[70];
                    byte b12 = (byte) ($$k + 2);
                    Object[] objArr16 = new Object[1];
                    f(b11, b12, (byte) (b12 & 240), objArr16);
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
        requestWindowFeature(1);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawableResource(R.color.transparent);
        }
        super.onCreate(bundle);
        this.read = (T) write();
        setContentView(AudioAttributesImplBaseParcelizer().IconCompatParcelizer());
        MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin.menuHostHelperlambda0, android.app.Dialog, android.content.DialogInterface
    public void dismiss() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 55;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.read = null;
        super.dismiss();
        int i4 = AudioAttributesCompatParcelizer + 33;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        shouldEvaluateQueueSize shouldevaluatequeuesize = (shouldEvaluateQueueSize) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 123;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        String string = shouldevaluatequeuesize.getContext().getString(iIntValue);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        int i4 = AudioAttributesCompatParcelizer + 103;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return string;
        }
        throw null;
    }

    public final String IconCompatParcelizer(int i, Object... objArr) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesCompatParcelizer + 7;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        toMagicModuleMetaRepoModel.write(objArr, "");
        String string = getContext().getString(i, Arrays.copyOf(objArr, objArr.length));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        int i5 = AudioAttributesCompatParcelizer + 63;
        RemoteActionCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return string;
    }

    public final String read(int i, Object... objArr) {
        int i2 = 2 % 2;
        int i3 = AudioAttributesCompatParcelizer + 29;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(objArr, "");
            String quantityString = getContext().getResources().getQuantityString(R.plurals.text_bookmark_timeline_deleted, i, Arrays.copyOf(objArr, objArr.length));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(quantityString, "");
            return quantityString;
        }
        toMagicModuleMetaRepoModel.write(objArr, "");
        String quantityString2 = getContext().getResources().getQuantityString(R.plurals.text_bookmark_timeline_deleted, i, Arrays.copyOf(objArr, objArr.length));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(quantityString2, "");
        int i4 = 91 / 0;
        return quantityString2;
    }

    public static void RemoteActionCompatParcelizer(View view, final getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        view.setOnClickListener(new View.OnClickListener() { // from class: o.BaseTrackSelection
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                shouldEvaluateQueueSize.IconCompatParcelizer(getcreatedondatems);
            }
        });
        int i2 = RemoteActionCompatParcelizer + 39;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final void read(getCreatedOnDateMs getcreatedondatems) {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 19;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getcreatedondatems.invoke();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = AudioAttributesCompatParcelizer + 117;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    public static void read(View[] viewArr, final getAnswerMap<? super View, getShowPopup> getanswermap) {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 107;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(viewArr, "");
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        int length = viewArr.length;
        int i4 = AudioAttributesCompatParcelizer + 101;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        int i6 = 0;
        while (i6 < length) {
            viewArr[i6].setOnClickListener(new View.OnClickListener() { // from class: o.createAdaptiveTrackSelection
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    shouldEvaluateQueueSize.RemoteActionCompatParcelizer(getanswermap, view);
                }
            });
            i6++;
            int i7 = RemoteActionCompatParcelizer + 125;
            AudioAttributesCompatParcelizer = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    private static final void IconCompatParcelizer(getAnswerMap getanswermap, View view) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(view);
        getanswermap.invoke(view);
        if (i3 != 0) {
            int i4 = 90 / 0;
        }
    }

    protected final void AudioAttributesCompatParcelizer(int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 123;
        AudioAttributesCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        IconCompatParcelizer(new Object[]{this, (String) IconCompatParcelizer(new Object[]{this, Integer.valueOf(i)}, HlsChunkSourceSegmentBaseHolder.write(), HlsChunkSourceSegmentBaseHolder.write(), -1090992228, 1090992228, HlsChunkSourceSegmentBaseHolder.write(), HlsChunkSourceSegmentBaseHolder.write())}, HlsChunkSourceSegmentBaseHolder.write(), HlsChunkSourceSegmentBaseHolder.write(), 1179702623, -1179702622, HlsChunkSourceSegmentBaseHolder.write(), HlsChunkSourceSegmentBaseHolder.write());
        int i5 = RemoteActionCompatParcelizer + 35;
        AudioAttributesCompatParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        shouldEvaluateQueueSize shouldevaluatequeuesize = (shouldEvaluateQueueSize) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 17;
        AudioAttributesCompatParcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            Toast toast = shouldevaluatequeuesize.IconCompatParcelizer;
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(str, "");
        Toast toast2 = shouldevaluatequeuesize.IconCompatParcelizer;
        if (toast2 != null) {
            toast2.cancel();
        }
        Toast toastMakeText = Toast.makeText(shouldevaluatequeuesize.getContext(), str, 0);
        shouldevaluatequeuesize.IconCompatParcelizer = toastMakeText;
        if (toastMakeText != null) {
            toastMakeText.show();
        }
        int i3 = RemoteActionCompatParcelizer + 7;
        AudioAttributesCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    protected final void AudioAttributesCompatParcelizer(String str) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        Toast toast = this.IconCompatParcelizer;
        if (toast != null) {
            int i2 = AudioAttributesCompatParcelizer + 89;
            RemoteActionCompatParcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                toast.cancel();
                int i3 = 78 / 0;
            } else {
                toast.cancel();
            }
        }
        Toast toastMakeText = Toast.makeText(getContext(), str, 1);
        this.IconCompatParcelizer = toastMakeText;
        if (toastMakeText != null) {
            int i4 = RemoteActionCompatParcelizer + 69;
            AudioAttributesCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            toastMakeText.show();
        }
        int i6 = AudioAttributesCompatParcelizer + 15;
        RemoteActionCompatParcelizer = i6 % 128;
        int i7 = i6 % 2;
    }

    protected final void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        Toast toast = this.IconCompatParcelizer;
        if (toast != null) {
            toast.cancel();
            int i2 = AudioAttributesCompatParcelizer + 19;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
        }
        Toast toastMakeText = Toast.makeText(getContext(), R.string.app_error_no_internet, 1);
        this.IconCompatParcelizer = toastMakeText;
        if (toastMakeText != null) {
            toastMakeText.show();
            int i4 = AudioAttributesCompatParcelizer + 83;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(getAnswerMap getanswermap, View view) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 115;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        IconCompatParcelizer(getanswermap, view);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void IconCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 81;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        read(getcreatedondatems);
        int i4 = RemoteActionCompatParcelizer + 83;
        AudioAttributesCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 41;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    public final String RemoteActionCompatParcelizer(int i) {
        return (String) IconCompatParcelizer(new Object[]{this, Integer.valueOf(i)}, HlsChunkSourceSegmentBaseHolder.write(), HlsChunkSourceSegmentBaseHolder.write(), -1090992228, 1090992228, HlsChunkSourceSegmentBaseHolder.write(), HlsChunkSourceSegmentBaseHolder.write());
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(view, "");
        if (i3 != 0) {
            throw null;
        }
        int i4 = RemoteActionCompatParcelizer + 77;
        AudioAttributesCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    protected final void IconCompatParcelizer(String str) {
        IconCompatParcelizer(new Object[]{this, str}, HlsChunkSourceSegmentBaseHolder.write(), HlsChunkSourceSegmentBaseHolder.write(), 1179702623, -1179702622, HlsChunkSourceSegmentBaseHolder.write(), HlsChunkSourceSegmentBaseHolder.write());
    }
}
