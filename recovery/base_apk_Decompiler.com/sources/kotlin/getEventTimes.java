package kotlin;

import android.app.Presentation;
import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Display;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public final class getEventTimes extends Presentation {
    private static int $10 = 0;
    private static int $11 = 1;
    private final PgsDecoderCueBuilder IconCompatParcelizer;
    private static final byte[] $$d = {TarConstants.LF_PAX_EXTENDED_HEADER_UC, -92, 37, 22, -55, 41, 34, 9, 15, 2, -20, TarConstants.LF_FIFO, -1, 11, 8, -3, 29, 5, 11, 20, -19, 29, 19, 0, 11, 23, -3, 23, -37, TarConstants.LF_FIFO, -1, 11, 8, -12, 30, 33, -24, 21, 21, 19, -6, 24, -3, 6, 13, 29, 18, 12, 15, -5, -26, 44, 27, -1, 16, 9, -33, TarConstants.LF_FIFO, 8, 13, -5, 29, -26, 27, 27, -5, 12, 17, 7, 27, -11, 23};
    private static final int $$e = 132;
    private static final byte[] $$a = {8, -19, -66, -33, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = TsExtractor.TS_STREAM_TYPE_AC4;
    private static int read = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static char[] AudioAttributesCompatParcelizer = {44800, 44699, 44702, 44689, 44692, 44676, 44898, 44920, 44696, 44677, 44676, 44927, 44901, 44697, 44697, 44679, 44853, 44825, 44850, 44873, 44859, 44818, 44867, 44878, 44851, 44878, 44852, 44863, 44862, 44851, 44863, 44862, 44991, 45037, 45027, 45031, 45021, 45010, 45027, 45030, 45049, 45052, 45036, 45002, 45018, 45051, 44996, 44995, 45036, 45030, 45050, 45025, 45027, 45037, 44986, 45033, 45009, 45009, 45038, 45030, 45051, 45026, 45036, 45026, 45039, 45027, 45025, 45028, 45050};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 10
            int r0 = 44 - r8
            int r7 = 79 - r7
            byte[] r1 = kotlin.getEventTimes.$$a
            int r6 = r6 * 12
            int r6 = r6 + 65
            byte[] r0 = new byte[r0]
            int r8 = 43 - r8
            r2 = 0
            if (r1 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2e:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getEventTimes.a(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 44 - r8
            int r6 = 39 - r6
            byte[] r0 = kotlin.getEventTimes.$$d
            int r7 = r7 + 82
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L11
            r7 = r6
            r3 = r8
            r4 = r2
            goto L29
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            int r8 = r8 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L29:
            int r7 = r7 + r8
            int r7 = r7 + (-10)
            r8 = r3
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getEventTimes.c(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getEventTimes(Context context, Display display, PgsDecoderCueBuilder pgsDecoderCueBuilder) {
        super(context, display);
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(display, "");
        toMagicModuleMetaRepoModel.write(pgsDecoderCueBuilder, "");
        this.IconCompatParcelizer = pgsDecoderCueBuilder;
    }

    @Override // android.app.Dialog
    protected final void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = read + 73;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 13183);
            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1649;
            int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 26;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[17], (byte) 76, bArr[5], objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(edgeSlop, scrollDefaultDelay, pressedStateDuration, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            int i4 = read + 109;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char offsetBefore = (char) (13183 - TextUtils.getOffsetBefore("", 0));
                int iIndexOf = 1649 - TextUtils.indexOf("", "", 0, 0);
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 27;
                byte[] bArr2 = $$a;
                byte b = bArr2[5];
                byte b2 = bArr2[39];
                byte b3 = bArr2[17];
                Object[] objArr3 = new Object[1];
                a(b, b2, b3, objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(offsetBefore, iIndexOf, bitsPerPixel, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            int i6 = read + 107;
            RemoteActionCompatParcelizer = i6 % 128;
            int i7 = i6 % 2;
        } else {
            Object[] objArr4 = new Object[1];
            b(new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{0, 16, 168, 0}, true, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(null, new int[]{16, 16, 80, 14}, true, objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i8 = RemoteActionCompatParcelizer + 75;
            read = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 283235184};
                byte[] bArr3 = $$d;
                Object[] objArr7 = new Object[1];
                c(bArr3[23], bArr3[16], bArr3[5], objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                byte b4 = (byte) (bArr3[6] + 1);
                Object[] objArr8 = new Object[1];
                c(b4, (byte) (b4 - 3), (byte) (-bArr3[15]), objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cIndexOf = (char) (13182 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int packedPositionGroup = 1649 - ExpandableListView.getPackedPositionGroup(0L);
                    int iLastIndexOf = 25 - TextUtils.lastIndexOf("", '0', 0, 0);
                    byte[] bArr4 = $$a;
                    Object[] objArr9 = new Object[1];
                    a(bArr4[5], bArr4[39], bArr4[17], objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(cIndexOf, packedPositionGroup, iLastIndexOf, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b(new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, new int[]{32, 22, 0, 0}, true, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b(new byte[]{1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0}, new int[]{54, 15, 0, 10}, true, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char defaultSize = (char) (View.getDefaultSize(0, 0) + 13183);
                        int jumpTapTimeout = 1649 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int i10 = 26 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        byte b5 = $$a[5];
                        Object[] objArr12 = new Object[1];
                        a(b5, b5, r14[17], objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(defaultSize, jumpTapTimeout, i10, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char maximumFlingVelocity = (char) (13183 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        int maximumFlingVelocity2 = 1649 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int i11 = (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26;
                        byte[] bArr5 = $$a;
                        Object[] objArr13 = new Object[1];
                        a(bArr5[17], (byte) 76, bArr5[5], objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(maximumFlingVelocity, maximumFlingVelocity2, i11, -133433128, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf2);
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
        int i12 = ((int[]) objArr[3])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 != i12) {
            long j = -1;
            long j2 = ((long) (i12 ^ i13)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (4535 - ExpandableListView.getPackedPositionGroup(0L)), (Process.myPid() >> 22) + 6054, (ViewConfiguration.getJumpTapTimeout() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i14 = RemoteActionCompatParcelizer + 73;
                read = i14 % 128;
                int i15 = i14 % 2;
                try {
                    Object[] objArr14 = {538154461, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 6030 - (ViewConfiguration.getScrollDefaultDelay() >> 16), Color.alpha(0) + 24);
                    byte[] bArr6 = $$d;
                    byte b6 = bArr6[13];
                    byte b7 = bArr6[23];
                    Object[] objArr15 = new Object[1];
                    c(b6, b7, b7, objArr15);
                    cls4.getMethod((String) objArr15[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr14);
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
        this.IconCompatParcelizer.RemoteActionCompatParcelizer();
        setContentView(R.layout.activity_presentation);
    }

    private static void b(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i;
        int length;
        char[] cArr;
        int i2;
        int i3 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = AudioAttributesCompatParcelizer;
        char c = '0';
        if (cArr2 != null) {
            int i8 = $10 + 67;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i2])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 11613 - Color.red(0), TextUtils.lastIndexOf("", c, 0) + 21, -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr[i2] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i2++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr2, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c2 = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                int i9 = $11 + 85;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i11 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.blue(0) + 22959, 43 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i11] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i12 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (Color.green(0) + 31589), TextUtils.lastIndexOf("", '0', 0, 0) + 9864, (ViewConfiguration.getFadingEdgeLength() >> 16) + 65, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                try {
                    Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (37822 - (KeyEvent.getMaxKeyCode() >> 16)), 9753 - TextUtils.lastIndexOf("", '0'), 27 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1066774687, false, "B", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i13 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i13, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i13);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i5 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            int i14 = $10 + 27;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                int i16 = $11 + 71;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] >>> iArr[5]);
                    i = buildsetstopreasonintent.RemoteActionCompatParcelizer - 1;
                } else {
                    cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                    i = buildsetstopreasonintent.RemoteActionCompatParcelizer + 1;
                }
                buildsetstopreasonintent.RemoteActionCompatParcelizer = i;
                int i17 = $10 + 53;
                $11 = i17 % 128;
                int i18 = i17 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }
}
