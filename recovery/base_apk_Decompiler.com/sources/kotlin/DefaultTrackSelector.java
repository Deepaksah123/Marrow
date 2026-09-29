package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
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
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import com.marrow.ui.views.CustomButton;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class DefaultTrackSelector extends shouldEvaluateQueueSize<Representation1> {
    private static int $10 = 0;
    private static int $11 = 1;
    private final selectVideoTrack IconCompatParcelizer;
    private final int read;
    private static final byte[] $$g = {112, -82, -21, -22, 58, -64, -5, -22, 25, -27, -20, 1, 4, -19, 6, -15, -10, 16, -36, -1, 65, -53, -26, -15, -9, -12, 8, 29, -41, -24, 4, -13, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20, -26, -15, -9, -12, 8, 29, -41, -24, 4, -13, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20};
    private static final int $$h = 33;
    private static final byte[] $$a = {62, -25, -124, -119, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 157;
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    private static int[] AudioAttributesCompatParcelizer = {1131896620, -1028873213, -2048904939, -219461985, -1581807546, -2104061055, 1898185004, -1195495132, 1713205582, -604966581, -882593932, 511874019, -613296909, -1231998606, -598923833, -1419535357, 717936630, 1987234862};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = kotlin.DefaultTrackSelector.$$a
            int r7 = r7 * 10
            int r1 = 44 - r7
            int r6 = r6 * 12
            int r6 = r6 + 65
            byte[] r1 = new byte[r1]
            int r7 = 43 - r7
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2f
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r8 = r8 + 1
            r3 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2f:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-1)
            r8 = r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultTrackSelector.a(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.DefaultTrackSelector.$$g
            int r7 = r7 * 45
            int r7 = 48 - r7
            int r8 = r8 * 29
            int r8 = r8 + 82
            int r6 = r6 * 18
            int r1 = 46 - r6
            byte[] r1 = new byte[r1]
            int r6 = 45 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r7
            goto L30
        L19:
            r3 = r2
        L1a:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L30:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-7)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultTrackSelector.c(short, short, byte, java.lang.Object[]):void");
    }

    @Override // kotlin.shouldEvaluateQueueSize
    public final /* synthetic */ getApplicationLabel write() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 57;
        write = i2 % 128;
        int i3 = i2 % 2;
        Representation1 representation1IconCompatParcelizer = IconCompatParcelizer();
        int i4 = RemoteActionCompatParcelizer + 105;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 22 / 0;
        }
        return representation1IconCompatParcelizer;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultTrackSelector(Context context, int i, selectVideoTrack selectvideotrack) {
        super(context, CmcdConfigurationRequestConfig.read());
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(selectvideotrack, "");
        this.read = i;
        this.IconCompatParcelizer = selectvideotrack;
    }

    private Representation1 IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = write + 107;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Representation1 representation1 = Representation1.read(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(representation1, "");
        int i4 = write + 13;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return representation1;
    }

    private static void b(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = AudioAttributesCompatParcelizer;
        int i4 = -470782045;
        int i5 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = $10 + 3;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                int i7 = 5 % 4;
            }
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(i4);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (43696 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 23297, 14 - TextUtils.lastIndexOf("", '0', 0, 0), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i8++;
                    i4 = -470782045;
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
        int[] iArr5 = AudioAttributesCompatParcelizer;
        if (iArr5 != null) {
            int i9 = $10 + 1;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $10 + 115;
                $11 = i12 % 128;
                if (i12 % i2 == 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i5] = Integer.valueOf(iArr5[i11]);
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (43695 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), (ViewConfiguration.getPressedStateDuration() >> 16) + 23297, 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr5[i11])};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (43695 - TextUtils.getTrimmedLength("")), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 23297, View.MeasureSpec.getMode(0) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                    i11++;
                }
                i2 = 2;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        int i13 = i5;
        System.arraycopy(iArr5, i13, iArr4, i13, length2);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i13;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            cArr[i13] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr4);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i14];
                Object[] objArr5 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (43694 - ImageFormat.getBitsPerPixel(0)), ImageFormat.getBitsPerPixel(0) + 23298, 14 - ExpandableListView.getPackedPositionChild(0L), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
                i14++;
            }
            int i16 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i16;
            buildremovealldownloadsintent.read ^= iArr4[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[17];
            int i17 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i18 = buildremovealldownloadsintent.read;
            cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
            cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
            cArr[3] = (char) buildremovealldownloadsintent.read;
            buildRemoveAllDownloadsIntent.read(iArr4);
            cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
            Object[] objArr6 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(516305436);
            if (objRemoteActionCompatParcelizer5 == null) {
                objRemoteActionCompatParcelizer5 = startForeground.read((char) (TextUtils.getOffsetAfter("", 0) + 48194), View.MeasureSpec.makeMeasureSpec(0, 0) + 20126, 20 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            i13 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // kotlin.shouldEvaluateQueueSize, kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char threadPriority = (char) (13183 - ((Process.getThreadPriority(0) + 20) >> 6));
            int i2 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1648;
            int packedPositionChild = 25 - ExpandableListView.getPackedPositionChild(0L);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[17], bArr[5], bArr[53], objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(threadPriority, i2, packedPositionChild, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            int i3 = write + 75;
            RemoteActionCompatParcelizer = i3 % 128;
            if (i3 % 2 != 0) {
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char cIndexOf = (char) (13183 - TextUtils.indexOf("", ""));
                    int scrollDefaultDelay = 1649 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 26;
                    byte[] bArr2 = $$a;
                    Object[] objArr3 = new Object[1];
                    a(bArr2[5], bArr2[17], bArr2[65], objArr3);
                    objRemoteActionCompatParcelizer2 = startForeground.read(cIndexOf, scrollDefaultDelay, iResolveOpacity, -1033747278, false, (String) objArr3[0], null);
                }
                throw null;
            }
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer3 == null) {
                char cMyTid = (char) ((Process.myTid() >> 22) + 13183);
                int i4 = (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1649;
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 26;
                byte[] bArr3 = $$a;
                byte b = bArr3[5];
                byte b2 = bArr3[17];
                byte b3 = bArr3[65];
                Object[] objArr4 = new Object[1];
                a(b, b2, b3, objArr4);
                objRemoteActionCompatParcelizer3 = startForeground.read(cMyTid, i4, pressedStateDuration, -1033747278, false, (String) objArr4[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
        } else {
            Object[] objArr5 = new Object[1];
            b(17 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), new int[]{-282873008, 549980473, 1819309997, 936067461, 1712757286, -1592401026, -171198455, 2145097078}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            b(TextUtils.indexOf((CharSequence) "", '0', 0) + 17, new int[]{-1352251048, 173771775, -1611427654, 585491008, 323982139, -77849735, -1804861610, 1640621213}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            int i5 = RemoteActionCompatParcelizer + 109;
            write = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr7 = {Integer.valueOf(iIntValue), 0, -379689898};
                byte[] bArr4 = $$g;
                byte b4 = bArr4[11];
                byte b5 = (byte) (b4 - 1);
                byte b6 = b4;
                Object[] objArr8 = new Object[1];
                c(b5, b6, b6, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                byte b7 = bArr4[11];
                byte b8 = (byte) (b7 - 1);
                Object[] objArr9 = new Object[1];
                c(b7, b8, b8, objArr9);
                objArr = (Object[]) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr7);
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 13184);
                    int maximumFlingVelocity = 1649 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int i7 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 25;
                    byte[] bArr5 = $$a;
                    Object[] objArr10 = new Object[1];
                    a(bArr5[5], bArr5[17], bArr5[65], objArr10);
                    objRemoteActionCompatParcelizer4 = startForeground.read(cLastIndexOf, maximumFlingVelocity, i7, -1033747278, false, (String) objArr10[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    b(22 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), new int[]{-667127387, 197061172, 2113136628, 480632892, 1336306841, -1187894002, -1186152533, -1093287992, 4441935, -1446539845, -890525616, -2058454594}, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b((ViewConfiguration.getEdgeSlop() >> 16) + 15, new int[]{1193434501, 486933287, -1969884195, 1142295961, 714817583, 2146009685, 1021871404, -174882291}, objArr12);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 13183);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1650;
                        int capsMode = TextUtils.getCapsMode("", 0, 0) + 26;
                        byte[] bArr6 = $$a;
                        byte b9 = bArr6[5];
                        byte b10 = bArr6[17];
                        Object[] objArr13 = new Object[1];
                        a(b9, b10, (byte) (b10 | 74), objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(cCombineMeasuredStates, iIndexOf, capsMode, 54351865, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13182);
                        int minimumFlingVelocity = 1649 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int iAlpha = Color.alpha(0) + 26;
                        byte[] bArr7 = $$a;
                        Object[] objArr14 = new Object[1];
                        a(bArr7[17], bArr7[5], bArr7[53], objArr14);
                        objRemoteActionCompatParcelizer6 = startForeground.read(c, minimumFlingVelocity, iAlpha, -133433128, false, (String) objArr14[0], null);
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
        int i8 = ((int[]) objArr[3])[0];
        int i9 = ((int[]) objArr[2])[0];
        if (i9 != i8) {
            long j = -1;
            long j2 = ((long) (i8 ^ i9)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 4535), KeyEvent.keyCodeFromString("") + 6054, 41 - TextUtils.indexOf((CharSequence) "", '0'), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i10 = write + 79;
                RemoteActionCompatParcelizer = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Object[] objArr15 = {-1249169891, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getPressedStateDuration() >> 16) + 6030, 24 - Color.blue(0));
                    byte b11 = $$g[11];
                    byte b12 = (byte) (b11 - 1);
                    Object[] objArr16 = new Object[1];
                    c(b11, b12, b12, objArr16);
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
        setCancelable(false);
        TextView textView = AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer;
        int i12 = this.read;
        textView.setText(read(i12, Integer.valueOf(i12)));
        ImageView imageView = AudioAttributesImplBaseParcelizer().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        CustomButton customButton = AudioAttributesImplBaseParcelizer().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customButton, "");
        read(new View[]{imageView, customButton}, (getAnswerMap<? super View, getShowPopup>) new getAnswerMap() { // from class: o.r8lambdaI3u8VQg41qMcsh0F23yItyRd0k
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return DefaultTrackSelector.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, (View) obj);
            }
        });
    }

    private static final getShowPopup AudioAttributesCompatParcelizer(DefaultTrackSelector defaultTrackSelector, View view) {
        int i = 2 % 2;
        int i2 = write + 45;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(view, "");
        defaultTrackSelector.IconCompatParcelizer.read();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = RemoteActionCompatParcelizer + 3;
        write = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(DefaultTrackSelector defaultTrackSelector, View view) {
        int i = 2 % 2;
        int i2 = write + 9;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(defaultTrackSelector, view);
        int i4 = write + 107;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopupAudioAttributesCompatParcelizer;
    }
}
