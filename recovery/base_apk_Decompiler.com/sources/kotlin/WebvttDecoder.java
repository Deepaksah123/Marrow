package kotlin;

import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.getPositionIncrement;
import kotlin.isWebvttHeaderLine;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class WebvttDecoder extends skipInput<isWebvttHeaderLine.AudioAttributesCompatParcelizer, getPositionIncrement> {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int[] AudioAttributesCompatParcelizer;
    private static char[] IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer;
    private static int write;
    private static final byte[] $$a = {91, -41, -108, -7, -26, -12, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13};
    private static final int $$b = 86;
    private static final byte[] AudioAttributesImplApi21Parcelizer = {14, -10, 42, -103, 8, -22, 20, TarConstants.LF_SYMLINK, -63, 10, -14, 6, 56, -38, -34, 1, 8, -6, 6, 2, 3, 2, -12, 8, -22, 20, TarConstants.LF_SYMLINK, -63, 10, -14, 6, 56, -28, -38, -7, 14, -3, 1, -14, 20, -12, -10, 15, 21, -24, -6, -7, 29, -12, -12, -10, 15, -14, 9, -15, 2, 5, 4, TarConstants.LF_DIR, -66, -5, 68, -38, -39, 5, -2, 14, -9, 41, -42, -4, 11, -9, -8, 10, -16, -4, 13, 0, 17, -20, 3, -12, -9, 10, -5, 7, 22, -20, -14, -2, -5, 8, -22, 20, TarConstants.LF_SYMLINK, -63, 10, -14, 6, 56, -39, -21, -11, 2, -9, 21, -2, -11, 6, 1, -16, TarConstants.LF_NORMAL, -31, -21, 1, 13, 8, -22, 20, TarConstants.LF_SYMLINK, -63, 10, -14, 6, 56, -34, -20, -9, 4, 1, -18, 8, -22, 20, TarConstants.LF_SYMLINK, -63, 10, -14, 6, 56, -31, -36, 0, 6, -6, 8, 10, 8, -22, 20, TarConstants.LF_SYMLINK, -63, 10, -14, 6, 56, -69, 12, -2, -7, 6, 1, -18, 69, -20, -35, -1, -3, -15, -1, 9, 6, -11, 6, 21, -20, -9, 4, 1, -18, 13, -16, TarConstants.LF_SYMLINK, -35, -1, -3, -15, -1, 9, 6, -11, 6, 8, -22, 20, TarConstants.LF_SYMLINK, -63, 10, -14, 6, 56, -69, 12, -2, -7, 6, 1, -18, 69, -32, -25, -16, 11, -8, 10, -6, -9, 6, 3, 5, 14, -31, 8, -22, 20, TarConstants.LF_SYMLINK, -63, 10, -14, 6, 56, -34, -20, -9, 4, 1, -18, 56};
    private static final int MediaBrowserCompatCustomActionResultReceiver = 69;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r7 = r7 * 2
            int r7 = 73 - r7
            int r6 = r6 * 2
            int r0 = r6 + 20
            byte[] r1 = kotlin.WebvttDecoder.$$a
            byte[] r0 = new byte[r0]
            int r6 = r6 + 19
            r2 = 0
            if (r1 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2f:
            int r8 = -r8
            int r3 = r3 + 1
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WebvttDecoder.d(byte, byte, short, java.lang.Object[]):void");
    }

    @Override // kotlin.skipInput
    public final /* synthetic */ repositionVerticalCue read(ViewGroup viewGroup, int i) {
        int i2 = 2 % 2;
        int i3 = write + 59;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        getPositionIncrement getpositionincrementWrite = write(viewGroup);
        if (i4 != 0) {
            return getpositionincrementWrite;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @setSdkPayload
    public WebvttDecoder(isWebvttHeaderLine.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        super(audioAttributesCompatParcelizer);
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
    }

    private getPositionIncrement write(ViewGroup viewGroup) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 67;
        write = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(viewGroup, "");
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        getPositionIncrement.Companion companion = getPositionIncrement.INSTANCE;
        toMagicModuleMetaRepoModel.write(layoutInflaterFrom);
        P p = this.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(p, "");
        getPositionIncrement getpositionincrementAudioAttributesCompatParcelizer = getPositionIncrement.Companion.AudioAttributesCompatParcelizer(layoutInflaterFrom, viewGroup, (isWebvttHeaderLine.AudioAttributesCompatParcelizer) p);
        int i4 = RemoteActionCompatParcelizer + 121;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            return getpositionincrementAudioAttributesCompatParcelizer;
        }
        throw null;
    }

    private static void c(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = AudioAttributesCompatParcelizer;
        long j = 0;
        int i3 = 43696;
        int i4 = -470782045;
        int i5 = 1;
        int i6 = 0;
        if (iArr3 != null) {
            int i7 = $11 + 73;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (i3 - (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1))), 23296 - TextUtils.lastIndexOf("", '0'), 15 - (Process.myTid() >> 22), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr2[i8] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i8++;
                    j = 0;
                    i3 = 43696;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = AudioAttributesCompatParcelizer;
        if (iArr5 != null) {
            int i9 = $10 + 67;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $11 + 41;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                Object[] objArr3 = new Object[i5];
                objArr3[i6] = Integer.valueOf(iArr5[i11]);
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(i4);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (43695 - Color.blue(i6)), TextUtils.indexOf((CharSequence) "", '0', i6) + 23298, (ViewConfiguration.getPressedStateDuration() >> 16) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                i11++;
                i4 = -470782045;
                i5 = 1;
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        int i14 = i6;
        System.arraycopy(iArr5, i14, iArr4, i14, length2);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i14;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            int i15 = $10 + 11;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr4);
            int i17 = 0;
            for (int i18 = 16; i17 < i18; i18 = 16) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i17];
                Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 43696), 23297 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 15, -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
                i17++;
            }
            int i19 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i19;
            buildremovealldownloadsintent.read ^= iArr4[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[17];
            int i20 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i21 = buildremovealldownloadsintent.read;
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
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (48194 - View.resolveSizeAndState(0, 0, 0)), TextUtils.lastIndexOf("", '0', 0, 0) + 20127, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 19, 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void a(byte[] bArr, boolean z, int[] iArr, Object[] objArr) throws Throwable {
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = IconCompatParcelizer;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getPressedStateDuration() >> 16), 11613 - ((Process.getThreadPriority(0) + 20) >> 6), Color.green(0) + 20, -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bArr != null) {
            char[] cArr4 = new char[i2];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i2) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i6 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 22959 - View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 44, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i7 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (31590 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 9863, 64 - Process.getGidForName(""), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 37822), 9754 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 26, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i8 = i2 - i4;
            System.arraycopy(cArr5, 0, cArr3, i8, i4);
            System.arraycopy(cArr5, i4, cArr3, 0, i8);
        }
        if (z) {
            char[] cArr6 = new char[i2];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i2) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i2 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i2) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x060d  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x061b A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x01c0 A[Catch: all -> 0x02a6, TryCatch #5 {all -> 0x02a6, blocks: (B:24:0x01ab, B:32:0x01ba, B:34:0x01c0, B:35:0x01c1, B:36:0x01c2, B:37:0x01d2, B:38:0x01d6, B:40:0x01fe, B:42:0x0246, B:44:0x024a, B:46:0x0250, B:47:0x0251, B:48:0x0252, B:56:0x0270, B:57:0x0279, B:58:0x027a, B:41:0x020c), top: B:185:0x01ab, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01c1 A[Catch: all -> 0x02a6, TryCatch #5 {all -> 0x02a6, blocks: (B:24:0x01ab, B:32:0x01ba, B:34:0x01c0, B:35:0x01c1, B:36:0x01c2, B:37:0x01d2, B:38:0x01d6, B:40:0x01fe, B:42:0x0246, B:44:0x024a, B:46:0x0250, B:47:0x0251, B:48:0x0252, B:56:0x0270, B:57:0x0279, B:58:0x027a, B:41:0x020c), top: B:185:0x01ab, inners: #7 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void RemoteActionCompatParcelizer(android.content.Context r20, long r21, long r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1842
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WebvttDecoder.RemoteActionCompatParcelizer(android.content.Context, long, long):void");
    }

    static {
        write();
        write = 0;
        RemoteActionCompatParcelizer = 1;
        AudioAttributesCompatParcelizer = new int[]{-1724610970, 999919067, 469425183, 584745470, 496481666, 979258665, -2116336860, -1773800571, 2140448857, 1583237322, 1848871886, 498101390, -359114178, -17448079, -731807016, 473627832, -351794900, -741648079};
    }

    static void write() {
        IconCompatParcelizer = new char[]{45043, 44926, 44920, 44900, 44922, 44926, 44920, 44900, 44926, 44914, 44920, 44900, 44926, 44925, 44920, 44900, 44926, 44914, 44923, 44922, 44926, 44920, 44900, 44922, 44921, 44923, 44926, 44925, 44923, 44920, 44927, 44923, 44923, 44927, 44920, 44922, 44921, 44920, 44900, 44921, 44925, 44920, 44900, 44921, 44925, 44920, 44900, 44921, 44924, 44920, 44900, 44920, 44924, 44920, 44900, 44926, 44914, 44923, 44922, 44926, 44920, 44900, 44922, 44921, 44923, 44926, 44925, 44923, 44922, 44926, 44920, 44922, 44921, 44920, 44900, 44920, 44927, 44920, 44900, 44920, 44927, 44920, 44900, 44923, 44927, 44920, 44900, 44923, 44926, 44920, 44900, 44926, 44914, 44923, 44922, 44926, 44920, 44900, 44922, 44921, 44923, 44926, 44925, 44923, 44921, 44925, 44923, 44922, 44921, 44920, 44900, 44926, 44925, 44923, 44900, 44926, 44925, 44923, 44900, 44926, 44925, 44923, 44900, 44921, 44924, 44923, 44900, 44922, 44921, 44923, 44921, 44924, 44922, 44921, 44924, 44923, 44900, 44920, 44924, 44923, 44920, 44927, 44923, 44923, 44927, 44923, 44923, 44926, 44923, 44920, 44927, 44923, 44900, 44920, 44927, 44923, 44900, 44921, 44927, 44922, 44922, 44921, 44923, 44921, 44924, 44922, 44921, 44924, 44922, 44923, 44926, 44923, 44900, 44926, 44925, 44923, 44923, 44926, 44923, 44900, 44926, 44925, 44923, 44921, 44924, 44922, 44921, 44924, 44922, 44922, 44921, 44923, 44900, 44921, 44927, 44922, 44922, 44921, 44923, 44900, 44922, 44921, 44923, 44921, 44924, 44923, 44922, 44921, 44923, 44926, 44925, 44923, 44900, 44921, 44924, 44923, 44923, 44921, 44922, 44926, 44924, 44923, 44900, 44923, 44926, 44923, 44921, 44924, 44923, 44900, 44921, 44924, 44923, 44923, 44921, 44922, 44923, 44926, 44923, 44921, 44927, 44923, 44900, 44920, 44927, 44923, 44920, 44927, 44923, 44900, 44921, 44924, 44922, 44920, 44926, 44923, 44900, 44923, 44926, 44923, 44900, 44923, 44926, 44923, 44920, 44927, 44923, 44922, 44921, 44923, 44923, 44926, 44923, 44923, 44926, 44923, 44922, 44921, 44923, 44922, 44921, 44923, 44923, 44921, 44923, 44900, 44921, 44927, 44922, 44926, 44924, 44922, 44922, 44921, 44923, 44900, 44921, 44924, 44922, 44922, 44920, 44923, 44900, 44921, 44927, 44922, 44922, 44920, 44923, 44900, 44920, 44927, 44922, 44926, 44927, 44900, 44926, 44926, 44900, 44921, 44926, 44900, 44923, 44921, 44922, 44921, 44921, 44900, 44923, 44921, 44922, 44920, 44921, 44900, 44922, 44922, 44920, 44920, 44900, 44923, 44920, 44900, 44921, 44921, 44923, 44923, 44900, 44920, 44920, 44920, 44920, 44923, 44923, 44923, 44923, 44922, 44922, 44922, 44923, 44956};
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 84
            byte[] r0 = kotlin.WebvttDecoder.AudioAttributesImplApi21Parcelizer
            int r7 = r7 + 4
            int r1 = r6 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2a
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.WebvttDecoder.b(int, short, int, java.lang.Object[]):void");
    }
}
