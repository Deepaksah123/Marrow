package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.ui.views.CustomTextView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u00020\f2\b\u0010\u0004\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010R\u0016\u0010\u000f\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0011R\u0016\u0010\u0013\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011"}, d2 = {"Lo/selectTextTrack;", "Lo/shouldEvaluateQueueSize;", "Lo/addSegmentsForAdaptationSet;", "Landroid/content/Context;", "p0", "", "p1", "<init>", "(Landroid/content/Context;I)V", "IconCompatParcelizer", "()Lo/addSegmentsForAdaptationSet;", "Landroid/os/Bundle;", "", "onCreate", "(Landroid/os/Bundle;)V", "RemoteActionCompatParcelizer", "()V", "I", "read", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class selectTextTrack extends shouldEvaluateQueueSize<addSegmentsForAdaptationSet> {
    private static int $10 = 0;
    private static int $11 = 1;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private int write;
    private static final byte[] $$g = {14, -10, 42, -103, -58, 64, 5, 22, -25, 27, 20, -1, -4, 19, -6, 15, 10, -16, 36, 1, -65, TarConstants.LF_DIR, 26, 15, 9, 12, -8, -29, 41, 24, -4, 13, 6, -36, TarConstants.LF_CHR, 5, 10, -8, 26, -29, 24, 24, -8, 9, 14, 4, 24, -14, 20, 26, 15, 9, 12, -8, -29, 41, 24, -4, 13, 6, -36, TarConstants.LF_CHR, 5, 10, -8, 26, -29, 24, 24, -8, 9, 14, 4, 24, -14, 20};
    private static final int $$h = 183;
    private static final byte[] $$a = {8, -19, -66, -33, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 34;
    private static int AudioAttributesCompatParcelizer = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;
    private static char[] write = {6479, 6492, 6471, 6467, 6466, 6494, 6468, 6488, 6490, 6469, 6406, 6507, 6496, 6523, 6475, 6834, 6473, 6477, 6476, 6481, 6464, 6491, 6465, 6470, 6522};
    private static char RemoteActionCompatParcelizer = 11447;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = 79 - r7
            int r8 = r8 * 12
            int r8 = 77 - r8
            int r6 = r6 * 10
            int r0 = r6 + 34
            byte[] r1 = kotlin.selectTextTrack.$$a
            byte[] r0 = new byte[r0]
            int r6 = r6 + 33
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2f
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r7 = r7 + 1
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2f:
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.selectTextTrack.a(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 18
            int r0 = 46 - r6
            int r8 = r8 * 45
            int r8 = 48 - r8
            byte[] r1 = kotlin.selectTextTrack.$$g
            int r7 = r7 * 29
            int r7 = r7 + 82
            byte[] r0 = new byte[r0]
            int r6 = 45 - r6
            r2 = 0
            if (r1 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L30
        L19:
            r3 = r2
        L1a:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L2b:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L30:
            int r7 = r7 + r8
            int r7 = r7 + (-7)
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.selectTextTrack.c(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private selectTextTrack(Context context, int i) {
        super(context, i);
        toMagicModuleMetaRepoModel.write(context, "");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ selectTextTrack(Context context, int i, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        if ((i2 & 2) != 0) {
            int i3 = AudioAttributesCompatParcelizer + 3;
            int i4 = i3 % 128;
            AudioAttributesImplBaseParcelizer = i4;
            if (i3 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            int i5 = i4 + 125;
            AudioAttributesCompatParcelizer = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 2 % 2;
            }
            i = R.style.AppTheme_Light_Dialog;
        }
        this(context, i);
    }

    @Override // kotlin.shouldEvaluateQueueSize
    public final /* synthetic */ getApplicationLabel write() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 13;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        addSegmentsForAdaptationSet addsegmentsforadaptationsetIconCompatParcelizer = IconCompatParcelizer();
        int i4 = AudioAttributesImplBaseParcelizer + 85;
        AudioAttributesCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return addsegmentsforadaptationsetIconCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private addSegmentsForAdaptationSet IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 105;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        addSegmentsForAdaptationSet addsegmentsforadaptationset = addSegmentsForAdaptationSet.read(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(addsegmentsforadaptationset, "");
        int i4 = AudioAttributesCompatParcelizer + 113;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 95 / 0;
        }
        return addsegmentsforadaptationset;
    }

    @Override // kotlin.shouldEvaluateQueueSize, kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char cBlue = (char) (Color.blue(0) + 13183);
            int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1649;
            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 26;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[53], (byte) 76, bArr[5], objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(cBlue, tapTimeout, longPressTimeout, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            int i2 = AudioAttributesCompatParcelizer + 101;
            AudioAttributesImplBaseParcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char c2 = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 13182);
                    int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1649;
                    int gidForName = Process.getGidForName("") + 27;
                    Object[] objArr3 = new Object[1];
                    a(r0[5], (byte) (-$$a[3]), r0[53], objArr3);
                    objRemoteActionCompatParcelizer2 = startForeground.read(c2, pressedStateDuration, gidForName, -1033747278, false, (String) objArr3[0], null);
                }
                throw null;
            }
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer3 == null) {
                char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13183);
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1649;
                int iMyPid = (Process.myPid() >> 22) + 26;
                Object[] objArr4 = new Object[1];
                a(r1[5], (byte) (-$$a[3]), r1[53], objArr4);
                objRemoteActionCompatParcelizer3 = startForeground.read(scrollBarFadeDuration, doubleTapTimeout, iMyPid, -1033747278, false, (String) objArr4[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            c = 3;
        } else {
            Object[] objArr5 = new Object[1];
            b(16 - View.combineMeasuredStates(0, 0), new char[]{1, 19, 6, 15, 11, 5, 18, 21, 5, 15, 14, 18, 1, 6, 19, 7}, (byte) (99 - View.getDefaultSize(0, 0)), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            b(16 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{23, 17, 18, 22, 2, 21, 4, 16, 11, 17, 22, 21, '\f', 1, 19, 18}, (byte) (110 - (ViewConfiguration.getScrollBarSize() >> 8)), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            int i3 = AudioAttributesCompatParcelizer + 117;
            AudioAttributesImplBaseParcelizer = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr7 = {Integer.valueOf(iIntValue), 0, -654878181};
                byte[] bArr2 = $$g;
                byte b = bArr2[19];
                byte b2 = (byte) (b - 1);
                byte b3 = b;
                Object[] objArr8 = new Object[1];
                c(b2, b3, b3, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                byte b4 = bArr2[19];
                byte b5 = (byte) (b4 - 1);
                Object[] objArr9 = new Object[1];
                c(b4, b5, b5, objArr9);
                objArr = (Object[]) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr7);
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char maxKeyCode = (char) ((KeyEvent.getMaxKeyCode() >> 16) + 13183);
                    int maximumFlingVelocity = 1649 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int iMakeMeasureSpec = 26 - View.MeasureSpec.makeMeasureSpec(0, 0);
                    Object[] objArr10 = new Object[1];
                    a(r11[5], (byte) (-$$a[3]), r11[53], objArr10);
                    objRemoteActionCompatParcelizer4 = startForeground.read(maxKeyCode, maximumFlingVelocity, iMakeMeasureSpec, -1033747278, false, (String) objArr10[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    b(22 - ((Process.getThreadPriority(0) + 20) >> 6), new char[]{18, 21, 23, '\r', 7, 2, 15, '\r', 1, 22, 11, 14, 16, 24, 2, 16, 6, 14, 7, 1, '\r', 4}, (byte) (127 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b(ImageFormat.getBitsPerPixel(0) + 16, new char[]{16, 7, 17, 6, 22, 16, 19, 23, 18, 17, 11, 6, 24, 7, 13932}, (byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 109), objArr12);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 13184);
                        int iResolveSizeAndState = 1649 - View.resolveSizeAndState(0, 0, 0);
                        int doubleTapTimeout2 = 26 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                        byte b6 = $$a[5];
                        Object[] objArr13 = new Object[1];
                        a(b6, b6, r10[53], objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(modifierMetaStateMask, iResolveSizeAndState, doubleTapTimeout2, 54351865, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char pressedStateDuration2 = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 13183);
                        int i5 = (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1649;
                        int i6 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25;
                        byte[] bArr3 = $$a;
                        Object[] objArr14 = new Object[1];
                        a(bArr3[53], (byte) 76, bArr3[5], objArr14);
                        objRemoteActionCompatParcelizer6 = startForeground.read(pressedStateDuration2, i5, i6, -133433128, false, (String) objArr14[0], null);
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
            long j2 = 0;
            long j3 = (((long) (i7 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) (KeyEvent.normalizeMetaState(0) + 4535), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6053, KeyEvent.getDeadChar(0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, null);
                try {
                    Object[] objArr15 = {-798213713, Long.valueOf(j3), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 6030 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 25 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                    byte b7 = $$g[19];
                    byte b8 = (byte) (b7 - 1);
                    Object[] objArr16 = new Object[1];
                    c(b7, b8, b8, objArr16);
                    cls4.getMethod((String) objArr16[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr15);
                    int i9 = AudioAttributesImplBaseParcelizer + 125;
                    AudioAttributesCompatParcelizer = i9 % 128;
                    int i10 = i9 % 2;
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
        super.onCreate(p0);
        CustomTextView customTextView = AudioAttributesImplBaseParcelizer().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(customTextView);
    }

    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 39;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.RemoteActionCompatParcelizer = 0;
    }

    private static void b(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = write;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 109;
                $10 = i5 % 128;
                if (i5 % 2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 7014 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getTapTimeout() >> 16) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 7015 - TextUtils.indexOf("", ""), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                        i4++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(RemoteActionCompatParcelizer)};
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        if (objRemoteActionCompatParcelizer3 == null) {
            objRemoteActionCompatParcelizer3 = startForeground.read((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 7014 - ImageFormat.getBitsPerPixel(0), 29 - ((byte) KeyEvent.getModifierMetaStateMask()), -626716224, false, "o", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i6 = $10 + 57;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                i2 = i + 47;
                cArr4[i2] = (char) (cArr[i2] / b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            needsstartedservice.AudioAttributesCompatParcelizer = 0;
            while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                    obj = obj2;
                } else {
                    Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(105000849);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 48194), 20126 - Color.blue(0), 20 - TextUtils.getTrimmedLength(""), 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                        Object[] objArr6 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(50135433);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            objRemoteActionCompatParcelizer5 = startForeground.read((char) Color.blue(0), 19368 - (ViewConfiguration.getLongPressTimeout() >> 16), 18 - (ViewConfiguration.getEdgeSlop() >> 16), 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).intValue();
                        int i7 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i7];
                    } else {
                        obj = null;
                        if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                            needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                            needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                            int i8 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            int i9 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i8];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i9];
                        } else {
                            int i10 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            int i11 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i10];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i11];
                            int i12 = $10 + 59;
                            $11 = i12 % 128;
                            int i13 = i12 % 2;
                        }
                    }
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
                obj2 = obj;
            }
        }
        for (int i14 = 0; i14 < i; i14++) {
            int i15 = $11 + 65;
            $10 = i15 % 128;
            int i16 = i15 % 2;
            cArr4[i14] = (char) (cArr4[i14] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public selectTextTrack(Context context) {
        this(context, 0, 2, null);
        toMagicModuleMetaRepoModel.write(context, "");
    }
}
