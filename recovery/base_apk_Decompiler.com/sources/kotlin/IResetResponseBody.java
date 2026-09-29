package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.play.core.integrity.model.IntegrityErrorCode;
import com.google.android.play.core.integrity.model.StandardIntegrityErrorCode;
import com.marrow.TrainingApplication;
import java.lang.reflect.Array;
import java.lang.reflect.Method;
import kotlin.getCurrentEventTimeUs;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class IResetResponseBody implements getCurrentEventTimeUs.IconCompatParcelizer {
    private static char AudioAttributesImplApi21Parcelizer;
    private static int IconCompatParcelizer;
    private static char MediaBrowserCompatCustomActionResultReceiver;
    private static char MediaBrowserCompatItemReceiver;
    private static int[] RemoteActionCompatParcelizer;
    private static char read;
    private static int write;
    private /* synthetic */ getCurrentEventTimeUs AudioAttributesCompatParcelizer;
    private static final byte[] $$c = {TarConstants.LF_CHR, -23, 108, 101};
    private static final int $$d = 215;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {115, TarConstants.LF_DIR, -117, 77, TarConstants.LF_SYMLINK, -19, 3, 4, -48, TarConstants.LF_LINK, -2, -4, -11, -9, 17, -3, -17, 12, -50, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, 24, 10, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11};
    private static final int $$b = 185;
    private static final byte[] AudioAttributesImplBaseParcelizer = {91, -41, -108, -7, 12, -11, 13, -4, -7, -6, -55, 69, -16, 18, -5, -71, 37, 16, 18, -5, -32, 30, -12, 2, 6, 4, -11, 0, 18, -42, 22, -10, 20, -22, -52, 61, -12, 12, -8, -58, 20, 36, -8, 16, -32, 17, 11, 3, -17, 8, -12, 1, 12, -11, 13, -4, -7, -6, -55, 72, -15, -6, 2, -3, 14, -71, 22, TarConstants.LF_SYMLINK, -9, -16, 12, -11, -4, 0, 9, -8, -26, 28, 9, 0, -31, 18, -5, 17, -3, 14, -37, 16, 1, 7, -7, -2, -21, 30, 3, -11, 10, -12, 5, -2, -44, 36, 0, 2, -9, -10, 20, -22, -52, 61, -12, 12, -8, -58, 36, 32, -3, -10, 4, -8, -4, -5, -4, 10, -10, 20, -22, -52, 61, -12, 12, -8, -58, 26, 36, 5, -16, 1, -3, 12, -22, 10, 8, -17, -23, 22, 4, 5, -31, 10, 10, 8, -17, 12, -11, 13, -4, -7, -6, -55, 64, 3, -70, 33, 33, -4, -13, 1, 13, -1, 11, -42, 24, -6, -10, 20, -22, -52, 61, -12, 12, -8, -58, 37, 19, 9, -4, 7, -23, 0, 9, -8, -3, 14, -50, 29, 19, -3, -15, -10, 20, -22, -52, 61, -12, 12, -8, -58, 32, 18, 7, -6, -3, 16, -10, 20, -22, -52, 61, -12, 12, -8, -58, 29, 34, -2, -8, 4, -10, -12, -10, 20, -22, -52, 61, -12, 12, -8, -58, 67, -14, 0, 5, -8, -3, 16, -71, 18, 33, -1, 1, 13, -1, -11, -8, 9, -8, -23, 18, 7, -6, -3, 16, -15, 14, -52, 33, -1, 1, 13, -1, -11, -8, 9, -8, -10, 20, -22, -52, 61, -12, 12, -8, -58, 67, -14, 0, 5, -8, -3, 16, -71, 30, 23, 14, -13, 6, -12, 4, 7, -8, -5, -7, -16, 29, -10, 20, -22, -52, 61, -12, 12, -8, -58, 32, 18, 7, -6, -3, 16, -58};
    private static final int AudioAttributesImplApi26Parcelizer = 187;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(byte r7, byte r8, short r9) {
        /*
            int r8 = r8 * 2
            int r8 = 4 - r8
            int r9 = r9 * 2
            int r9 = r9 + 1
            byte[] r0 = kotlin.IResetResponseBody.$$c
            int r7 = r7 * 4
            int r7 = 122 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2c
        L16:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L1a:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r7]
            r6 = r3
            r3 = r7
            r7 = r6
        L2c:
            int r8 = r8 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.IResetResponseBody.$$e(byte, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 8
            int r8 = 73 - r8
            byte[] r0 = kotlin.IResetResponseBody.$$a
            int r7 = r7 * 11
            int r7 = 31 - r7
            int r9 = r9 * 30
            int r9 = 33 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r8 = r9
            r5 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            int r9 = r9 + 1
            if (r5 != r7) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L2e:
            int r9 = r9 + r3
            int r9 = r9 + 2
            r3 = r5
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.IResetResponseBody.a(short, byte, int, java.lang.Object[]):void");
    }

    private static void c(int i, char[] cArr, Object[] objArr) throws Throwable {
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        while (isstopped.read < cArr.length) {
            cArr3[0] = cArr[isstopped.read];
            cArr3[1] = cArr[isstopped.read + 1];
            int i2 = 58224;
            for (int i3 = 0; i3 < 16; i3++) {
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i2) ^ ((c2 << 4) + ((char) (((long) AudioAttributesImplApi21Parcelizer) ^ 1193402106669854891L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1504 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 21, 1322448859, false, $$e(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i2) ^ ((cCharValue << 4) + ((char) (((long) read) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(MediaBrowserCompatItemReceiver)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (Process.myPid() >> 22), ExpandableListView.getPackedPositionGroup(0L) + 1504, Color.blue(0) + 21, 1322448859, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i2 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[isstopped.read] = cArr3[0];
            cArr2[isstopped.read + 1] = cArr3[1];
            Object[] objArr4 = {isstopped, isstopped};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 9015 - ExpandableListView.getPackedPositionChild(0L), 58 - ExpandableListView.getPackedPositionGroup(0L), -1950993821, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void d(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = RemoteActionCompatParcelizer;
        int i4 = -470782045;
        if (iArr2 != null) {
            int i5 = $10 + 121;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 13;
                $10 = i8 % 128;
                int i9 = i8 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 43694), (ViewConfiguration.getFadingEdgeLength() >> 16) + 23297, (ViewConfiguration.getTapTimeout() >> 16) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i7++;
                    i2 = 2;
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
        int[] iArr5 = RemoteActionCompatParcelizer;
        float f = BitmapDescriptorFactory.HUE_RED;
        int i10 = 43695;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                Object[] objArr3 = {Integer.valueOf(iArr5[i11])};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(i4);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (i10 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 23297 - (ViewConfiguration.getJumpTapTimeout() >> 16), (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                i11++;
                i4 = -470782045;
                f = BitmapDescriptorFactory.HUE_RED;
                i10 = 43695;
            }
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = 0;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            int i12 = $10 + 89;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr4);
            int i14 = 0;
            for (int i15 = 16; i14 < i15; i15 = 16) {
                int i16 = $10 + 121;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i14];
                    Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43695), 23297 - View.MeasureSpec.getSize(0), 14 - TextUtils.lastIndexOf("", '0', 0), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                    buildremovealldownloadsintent.read = iIntValue;
                    i14 += 29;
                } else {
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i14];
                    Object[] objArr5 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (43695 - TextUtils.getCapsMode("", 0, 0)), 23297 - View.combineMeasuredStates(0, 0), 15 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                    buildremovealldownloadsintent.read = iIntValue2;
                    i14++;
                }
            }
            int i17 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i17;
            buildremovealldownloadsintent.read ^= iArr4[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[17];
            int i18 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i19 = buildremovealldownloadsintent.read;
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
                objRemoteActionCompatParcelizer5 = startForeground.read((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 48194), 20126 - (ViewConfiguration.getEdgeSlop() >> 16), 20 - View.MeasureSpec.getSize(0), 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // o.getCurrentEventTimeUs.IconCompatParcelizer
    public final void write(Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = write + 77;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getCurrentEventTimeUs getcurrenteventtimeus = this.AudioAttributesCompatParcelizer;
        try {
            if (i3 == 0) {
                Object[] objArr = {getcurrenteventtimeus, (Throwable) obj};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-354549801);
                if (objRemoteActionCompatParcelizer == null) {
                    char cAlpha = (char) (63098 - Color.alpha(0));
                    int i4 = 24580 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    int iIndexOf = 19 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    byte[] bArr = $$a;
                    byte b = bArr[28];
                    byte b2 = bArr[21];
                    Object[] objArr2 = new Object[1];
                    a(b, b2, b2, objArr2);
                    objRemoteActionCompatParcelizer = startForeground.read(cAlpha, i4, iIndexOf, -1802224830, false, (String) objArr2[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (KeyEvent.getDeadChar(0, 0) + 63098), 24579 - TextUtils.indexOf((CharSequence) "", '0'), 20 - KeyEvent.normalizeMetaState(0)), Throwable.class});
                }
                ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
                throw null;
            }
            Object[] objArr3 = {getcurrenteventtimeus, (Throwable) obj};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-354549801);
            if (objRemoteActionCompatParcelizer2 == null) {
                char c = (char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 63097);
                int absoluteGravity = 24580 - Gravity.getAbsoluteGravity(0, 0);
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 20;
                byte[] bArr2 = $$a;
                byte b3 = bArr2[28];
                byte b4 = bArr2[21];
                Object[] objArr4 = new Object[1];
                a(b3, b4, b4, objArr4);
                objRemoteActionCompatParcelizer2 = startForeground.read(c, absoluteGravity, capsMode, -1802224830, false, (String) objArr4[0], new Class[]{(Class) startForeground.IconCompatParcelizer((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 63099), 24580 - View.combineMeasuredStates(0, 0), 20 - View.MeasureSpec.getMode(0)), Throwable.class});
            }
            ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            int i5 = IconCompatParcelizer + 107;
            write = i5 % 128;
            int i6 = i5 % 2;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void read(Context context, long j, long j2) throws Throwable {
        int i;
        EmailLoginTypeRequest emailLoginTypeRequest = new EmailLoginTypeRequest(context, j, j2);
        char c = 4;
        try {
            char c2 = 0;
            Object[] objArr = {"", "", 0, 0};
            byte[] bArr = AudioAttributesImplBaseParcelizer;
            Object[] objArr2 = new Object[1];
            b((byte) (-bArr[92]), (short) 299, bArr[13], objArr2);
            Class<?> cls = Class.forName((String) objArr2[0]);
            char c3 = 6;
            Object[] objArr3 = new Object[1];
            b(bArr[6], (short) 278, bArr[47], objArr3);
            String str = (String) objArr3[0];
            short s = (short) 272;
            Object[] objArr4 = new Object[1];
            b(bArr[4], s, bArr[13], objArr4);
            Object[] objArr5 = new Object[1];
            b(bArr[4], s, bArr[13], objArr5);
            Object[] objArr6 = new Object[1];
            c(293 - ((Integer) cls.getMethod(str, Class.forName((String) objArr4[0]), Class.forName((String) objArr5[0]), Integer.TYPE, Integer.TYPE).invoke(null, objArr)).intValue(), new char[]{21651, 56940, 18109, 20617, 19483, 52730, 16751, 18516, 57253, 7192, 41702, 36070, 20416, 6271, 39770, 22134, 55208, 25920, 16097, 60326, 60437, 'u', 34632, 28752, 20416, 6271, 23116, 5876, 28501, 17753, 22894, 38434, 18109, 20617, 23116, 5876, 33894, 39000, 18109, 20617, 23116, 5876, 797, 11763, 20416, 6271, 16097, 60326, 58975, 6381, 18109, 20617, 20492, 41101, 56525, 55362, 20416, 6271, 25664, 6331, 18109, 20617, 55208, 25920, 21651, 56940, 25102, 28395, 53304, 34901, 20416, 6271, 51311, 10953, 19483, 52730, 25102, 28395, 56525, 55362, 20416, 6271, 12620, 29212, 18109, 20617, 20492, 41101, 57892, 43853, 19483, 52730, 11786, 64067, 35946, 24363, 19483, 52730, 11786, 64067, 21651, 56940, 11786, 64067, 21651, 56940, 23116, 5876, 53304, 34901, 20416, 6271, 856, 7507, 18109, 20617, 23116, 5876, 36764, 36554, 20416, 6271, 32890, 4357, 19483, 52730, 20492, 41101, 21651, 56940, 55208, 25920, 32740, 39521, 20416, 6271, 63886, 3669, 19483, 52730, 16097, 60326, 21651, 56940, 60437, 'u', 51090, 43036, 18109, 20617, 20492, 41101, 31328, 1572, 25102, 28395, 56525, 55362, 20416, 6271, 22984, 51613, 16751, 18516, 25102, 28395, 56525, 55362, 20416, 6271, 57892, 43853, 18109, 20617, 60437, 'u', 53304, 34901, 16751, 18516, 28501, 17753, 56525, 55362, 20416, 6271, 56161, 14301, 20416, 6271, 35946, 24363, 16751, 18516, 39770, 22134, 1513, 44975, 20416, 6271, 36764, 36554, 16751, 18516, 19029, 29994, 31328, 1572, 20492, 41101, 31328, 1572, 55208, 25920, 31328, 1572, 16097, 60326, 31328, 1572, 16097, 60326, 31328, 1572, 23116, 5876, 16981, 26152, 16751, 18516, 55208, 25920, 1513, 44975, 20416, 6271, 36764, 36554, 16751, 18516, 19029, 29994, 31328, 1572, 60437, 'u', 34632, 28752, 25102, 28395, 34632, 28752, 28501, 17753, 34632, 28752, 28501, 17753, 31328, 1572, 23116, 5876, 29750, 5698, 16751, 18516, 60437, 'u', 23562, 45350, 20416, 6271, 36764, 36554, 16751, 18516, 19029, 29994, 34632, 28752, 39770, 22134, 34632, 28752, 11786, 64067, 34632, 28752, 23116, 5876, 34632, 28752, 61976, 37315}, objArr6);
            String str2 = (String) objArr6[0];
            Object[] objArr7 = {0L};
            Object[] objArr8 = new Object[1];
            b((byte) (-bArr[92]), (short) (AudioAttributesImplApi26Parcelizer | 64), bArr[195], objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b((byte) (-bArr[60]), (short) 219, bArr[13], objArr9);
            Object[] objArr10 = new Object[1];
            c(-((Integer) cls2.getMethod((String) objArr9[0], Long.TYPE).invoke(null, objArr7)).intValue(), new char[]{39889, 23157}, objArr10);
            Object[] objArr11 = {(String) objArr10[0]};
            byte b = bArr[4];
            short s2 = (short) 198;
            Object[] objArr12 = new Object[1];
            b(b, s2, b, objArr12);
            Class<?> cls3 = Class.forName((String) objArr12[0]);
            byte b2 = bArr[47];
            Object[] objArr13 = new Object[1];
            b(b2, (short) (b2 | 180), bArr[51], objArr13);
            String str3 = (String) objArr13[0];
            byte b3 = bArr[4];
            Object[] objArr14 = new Object[1];
            b(b3, s2, b3, objArr14);
            Object[] objArr15 = (Object[]) cls3.getMethod(str3, Class.forName((String) objArr14[0])).invoke(str2, objArr11);
            int[] iArr = new int[objArr15.length];
            int i2 = 0;
            while (i2 < objArr15.length) {
                Object[] objArr16 = {objArr15[i2]};
                byte[] bArr2 = AudioAttributesImplBaseParcelizer;
                byte b4 = bArr2[c];
                int i3 = AudioAttributesImplApi26Parcelizer;
                short s3 = (short) (i3 & AnalyticsListener.EVENT_VIDEO_ENABLED);
                byte b5 = bArr2[c3];
                Object[] objArr17 = new Object[1];
                b(b4, s3, b5, objArr17);
                Class<?> cls4 = Class.forName((String) objArr17[0]);
                byte b6 = bArr2[27];
                Object[] objArr18 = new Object[1];
                b(b6, (short) (b6 | 163), bArr2[47], objArr18);
                String str4 = (String) objArr18[0];
                byte b7 = bArr2[c];
                Object[] objArr19 = new Object[1];
                b(b7, s2, b7, objArr19);
                Object objInvoke = cls4.getMethod(str4, Class.forName((String) objArr19[0])).invoke(null, objArr16);
                Object[] objArr20 = new Object[1];
                b(bArr2[4], (short) (i3 & AnalyticsListener.EVENT_VIDEO_ENABLED), bArr2[6], objArr20);
                Class<?> cls5 = Class.forName((String) objArr20[0]);
                byte b8 = bArr2[6];
                byte b9 = bArr2[25];
                Object[] objArr21 = new Object[1];
                b(b8, (short) (b8 | 144), b9, objArr21);
                iArr[i2] = ((Integer) cls5.getMethod((String) objArr21[0], null).invoke(objInvoke, null)).intValue();
                i2++;
                c = 4;
                c3 = 6;
            }
            int i4 = 0;
            while (true) {
                int i5 = i4 + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (emailLoginTypeRequest.write(iArr[i4])) {
                    case -34:
                        i4 = 56;
                        break;
                    case -33:
                        i4 = 89;
                        break;
                    case -32:
                        emailLoginTypeRequest.write(34);
                        if (emailLoginTypeRequest.write == 0) {
                            i5 = 88;
                        }
                        i4 = i5;
                        break;
                    case -31:
                        i4 = 1;
                        break;
                    case -30:
                        i4 = 79;
                        break;
                    case -29:
                        emailLoginTypeRequest.write(34);
                        if (emailLoginTypeRequest.write == 0) {
                            i5 = 78;
                        }
                        i4 = i5;
                        break;
                    case -28:
                        i4 = 25;
                        break;
                    case -27:
                        i4 = 69;
                        break;
                    case -26:
                        emailLoginTypeRequest.write(34);
                        if (emailLoginTypeRequest.write == 0) {
                            i5 = 68;
                        }
                        i4 = i5;
                        break;
                    case -25:
                        emailLoginTypeRequest.AudioAttributesCompatParcelizer = 1;
                        emailLoginTypeRequest.write(11);
                        emailLoginTypeRequest.write(12);
                        IconCompatParcelizer = emailLoginTypeRequest.write;
                        i4 = i5;
                        break;
                    case -24:
                        emailLoginTypeRequest.AudioAttributesCompatParcelizer = write;
                        try {
                            emailLoginTypeRequest.write(6);
                            i4 = i5;
                        } catch (Throwable th2) {
                            th = th2;
                            if (i4 >= 25 || i4 >= 53) {
                                throw th;
                            }
                            emailLoginTypeRequest.RemoteActionCompatParcelizer = th;
                            emailLoginTypeRequest.write(40);
                            i4 = 14;
                        }
                        break;
                    case -23:
                        i4 = 61;
                        break;
                    case -22:
                        i4 = 70;
                        break;
                    case -21:
                        return;
                    case -20:
                        emailLoginTypeRequest.AudioAttributesCompatParcelizer = 3;
                        emailLoginTypeRequest.write(11);
                        emailLoginTypeRequest.write(13);
                        Object obj = emailLoginTypeRequest.read;
                        emailLoginTypeRequest.write(13);
                        Object obj2 = emailLoginTypeRequest.read;
                        emailLoginTypeRequest.write(13);
                        try {
                            Object[] objArr22 = {obj2, emailLoginTypeRequest.read};
                            byte[] bArr3 = AudioAttributesImplBaseParcelizer;
                            Object[] objArr23 = new Object[1];
                            b(bArr3[4], bArr3[77], bArr3[32], objArr23);
                            Class<?> cls6 = Class.forName((String) objArr23[c2]);
                            Object[] objArr24 = new Object[1];
                            b(bArr3[6], bArr3[98], bArr3[23], objArr24);
                            String str5 = (String) objArr24[c2];
                            Class<?>[] clsArr = new Class[2];
                            byte b10 = bArr3[4];
                            try {
                                Object[] objArr25 = new Object[1];
                                b(b10, (short) 104, b10, objArr25);
                                try {
                                    clsArr[0] = Class.forName((String) objArr25[0]);
                                    Object[] objArr26 = new Object[1];
                                    b((byte) (AudioAttributesImplApi26Parcelizer & 95), bArr3[27], (byte) (-bArr3[60]), objArr26);
                                    c2 = 0;
                                    clsArr[1] = Class.forName((String) objArr26[0]);
                                    emailLoginTypeRequest.RemoteActionCompatParcelizer = cls6.getMethod(str5, clsArr).invoke(obj, objArr22);
                                    i = 10;
                                    emailLoginTypeRequest.write(i);
                                    i4 = i5;
                                } catch (Throwable th3) {
                                    th = th3;
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            th = th5;
                        }
                        break;
                    case StandardIntegrityErrorCode.INTEGRITY_TOKEN_PROVIDER_INVALID /* -19 */:
                        emailLoginTypeRequest.AudioAttributesCompatParcelizer = 2;
                        emailLoginTypeRequest.write(11);
                        emailLoginTypeRequest.write(13);
                        Object obj3 = emailLoginTypeRequest.read;
                        emailLoginTypeRequest.write(12);
                        try {
                            Object[] objArr27 = new Object[1];
                            objArr27[c2] = Boolean.valueOf(emailLoginTypeRequest.write != 0 ? 1 : c2);
                            Object[] objArr28 = new Object[1];
                            b(r6[4], (short) (AudioAttributesImplBaseParcelizer[59] + 1), r6[21], objArr28);
                            Class<?> cls7 = Class.forName((String) objArr28[c2]);
                            Object[] objArr29 = new Object[1];
                            b(r6[47], (short) (AudioAttributesImplApi26Parcelizer & 108), r6[74], objArr29);
                            String str6 = (String) objArr29[c2];
                            Class<?>[] clsArr2 = new Class[1];
                            clsArr2[c2] = Boolean.TYPE;
                            cls7.getMethod(str6, clsArr2).invoke(obj3, objArr27);
                            i4 = i5;
                        } catch (Throwable th6) {
                            Throwable cause2 = th6.getCause();
                            if (cause2 == null) {
                                throw th6;
                            }
                            throw cause2;
                        }
                        break;
                    case StandardIntegrityErrorCode.CLIENT_TRANSIENT_ERROR /* -18 */:
                        emailLoginTypeRequest.AudioAttributesCompatParcelizer = 3;
                        emailLoginTypeRequest.write(11);
                        emailLoginTypeRequest.write(13);
                        Class cls8 = (Class) emailLoginTypeRequest.read;
                        emailLoginTypeRequest.write(13);
                        String str7 = (String) emailLoginTypeRequest.read;
                        emailLoginTypeRequest.write(13);
                        emailLoginTypeRequest.RemoteActionCompatParcelizer = cls8.getMethod(str7, (Class[]) emailLoginTypeRequest.read);
                        emailLoginTypeRequest.write(10);
                        i4 = i5;
                        break;
                    case -17:
                        try {
                            byte[] bArr4 = AudioAttributesImplBaseParcelizer;
                            Object[] objArr30 = new Object[1];
                            b(bArr4[4], (short) 89, bArr4[96], objArr30);
                            Class<?> cls9 = Class.forName((String) objArr30[c2]);
                            Object[] objArr31 = new Object[1];
                            b(bArr4[224], (short) 76, bArr4[27], objArr31);
                            emailLoginTypeRequest.RemoteActionCompatParcelizer = cls9.getField((String) objArr31[c2]).get(null);
                            emailLoginTypeRequest.write(10);
                            i4 = i5;
                        } catch (Throwable th7) {
                            th = th7;
                            if (i4 >= 25) {
                            }
                            throw th;
                        }
                        break;
                    case -16:
                        byte b11 = AudioAttributesImplBaseParcelizer[4];
                        Object[] objArr32 = new Object[1];
                        b(b11, s2, b11, objArr32);
                        emailLoginTypeRequest.RemoteActionCompatParcelizer = Class.forName((String) objArr32[c2]);
                        emailLoginTypeRequest.write(10);
                        i4 = i5;
                        break;
                    case -15:
                        emailLoginTypeRequest.AudioAttributesCompatParcelizer = 1;
                        emailLoginTypeRequest.write(11);
                        emailLoginTypeRequest.write(12);
                        emailLoginTypeRequest.RemoteActionCompatParcelizer = new Class[emailLoginTypeRequest.write];
                        emailLoginTypeRequest.write(10);
                        i4 = i5;
                        break;
                    case -14:
                        byte[] bArr5 = $$a;
                        byte b12 = bArr5[21];
                        byte b13 = bArr5[28];
                        Object[] objArr33 = new Object[1];
                        a(b12, b13, b13, objArr33);
                        emailLoginTypeRequest.RemoteActionCompatParcelizer = (String) objArr33[c2];
                        emailLoginTypeRequest.write(10);
                        i4 = i5;
                        break;
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        emailLoginTypeRequest.RemoteActionCompatParcelizer = TrainingApplication.class;
                        emailLoginTypeRequest.write(10);
                        i4 = i5;
                        break;
                    case -12:
                        emailLoginTypeRequest.AudioAttributesCompatParcelizer = 1;
                        emailLoginTypeRequest.write(11);
                        emailLoginTypeRequest.write(21);
                        try {
                            Object[] objArr34 = new Object[1];
                            objArr34[c2] = Long.valueOf(emailLoginTypeRequest.IconCompatParcelizer);
                            byte[] bArr6 = AudioAttributesImplBaseParcelizer;
                            Object[] objArr35 = new Object[1];
                            b(bArr6[4], (short) 89, bArr6[96], objArr35);
                            Class<?> cls10 = Class.forName((String) objArr35[c2]);
                            byte b14 = bArr6[27];
                            Object[] objArr36 = new Object[1];
                            b(b14, (short) (b14 | 163), bArr6[47], objArr36);
                            String str8 = (String) objArr36[c2];
                            Class<?>[] clsArr3 = new Class[1];
                            clsArr3[c2] = Long.TYPE;
                            emailLoginTypeRequest.RemoteActionCompatParcelizer = cls10.getMethod(str8, clsArr3).invoke(null, objArr34);
                            emailLoginTypeRequest.write(10);
                            i4 = i5;
                        } catch (Throwable th8) {
                            Throwable cause3 = th8.getCause();
                            if (cause3 == null) {
                                throw th8;
                            }
                            throw cause3;
                        }
                        break;
                    case -11:
                        emailLoginTypeRequest.AudioAttributesCompatParcelizer = 1;
                        emailLoginTypeRequest.write(11);
                        emailLoginTypeRequest.write(12);
                        int i6 = emailLoginTypeRequest.write;
                        byte b15 = AudioAttributesImplBaseParcelizer[4];
                        Object[] objArr37 = new Object[1];
                        b(b15, (short) 104, b15, objArr37);
                        emailLoginTypeRequest.RemoteActionCompatParcelizer = Array.newInstance(Class.forName((String) objArr37[c2]), i6);
                        emailLoginTypeRequest.write(10);
                        i4 = i5;
                        break;
                    case -10:
                        emailLoginTypeRequest.write(18);
                        throw ((Throwable) emailLoginTypeRequest.read);
                    case -9:
                        i4 = 23;
                        break;
                    case -8:
                        i4 = 20;
                        break;
                    case -7:
                        emailLoginTypeRequest.write(15);
                        if (emailLoginTypeRequest.write == 0) {
                            i5 = 19;
                        }
                        i4 = i5;
                        break;
                    case -6:
                        emailLoginTypeRequest.AudioAttributesCompatParcelizer = 1;
                        emailLoginTypeRequest.write(11);
                        emailLoginTypeRequest.write(13);
                        Object obj4 = emailLoginTypeRequest.read;
                        try {
                            byte[] bArr7 = AudioAttributesImplBaseParcelizer;
                            Object[] objArr38 = new Object[1];
                            b(bArr7[4], (short) (AudioAttributesImplApi26Parcelizer & 965), (byte) (-bArr7[60]), objArr38);
                            Class<?> cls11 = Class.forName((String) objArr38[c2]);
                            byte b16 = (byte) (-bArr7[60]);
                            Object[] objArr39 = new Object[1];
                            b(b16, (short) (b16 | 96), bArr7[25], objArr39);
                            emailLoginTypeRequest.RemoteActionCompatParcelizer = cls11.getMethod((String) objArr39[c2], null).invoke(obj4, null);
                            emailLoginTypeRequest.write(10);
                            i4 = i5;
                        } catch (Throwable th9) {
                            Throwable cause4 = th9.getCause();
                            if (cause4 == null) {
                                throw th9;
                            }
                            throw cause4;
                        }
                        break;
                    case -5:
                        i4 = 80;
                        break;
                    case -4:
                        emailLoginTypeRequest.AudioAttributesCompatParcelizer = 2;
                        emailLoginTypeRequest.write(11);
                        emailLoginTypeRequest.write(12);
                        int i7 = emailLoginTypeRequest.write;
                        emailLoginTypeRequest.write(13);
                        Object[] objArr40 = new Object[1];
                        d(i7, (int[]) emailLoginTypeRequest.read, objArr40);
                        emailLoginTypeRequest.RemoteActionCompatParcelizer = (String) objArr40[c2];
                        emailLoginTypeRequest.write(10);
                        i4 = i5;
                        break;
                    case -3:
                        emailLoginTypeRequest.RemoteActionCompatParcelizer = new int[]{-1748360406, 1989054800};
                        emailLoginTypeRequest.write(10);
                        i4 = i5;
                        break;
                    case -2:
                        try {
                            Object[] objArr41 = new Object[1];
                            b((byte) (-AudioAttributesImplBaseParcelizer[92]), (short) 150, r3[64], objArr41);
                            Class<?> cls12 = Class.forName((String) objArr41[c2]);
                            Object[] objArr42 = new Object[1];
                            b(r3[74], (short) 133, r3[51], objArr42);
                            emailLoginTypeRequest.AudioAttributesCompatParcelizer = ((Integer) cls12.getMethod((String) objArr42[c2], null).invoke(null, null)).intValue();
                            i = 6;
                            emailLoginTypeRequest.write(i);
                            i4 = i5;
                        } catch (Throwable th10) {
                            Throwable cause5 = th10.getCause();
                            if (cause5 == null) {
                                throw th10;
                            }
                            throw cause5;
                        }
                        break;
                    case -1:
                        i4 = 53;
                        break;
                    default:
                        i4 = i5;
                        break;
                }
            }
            throw th;
        } catch (Throwable th11) {
            Throwable cause6 = th11.getCause();
            if (cause6 == null) {
                throw th11;
            }
            throw cause6;
        }
    }

    static {
        read();
        write = 0;
        IconCompatParcelizer = 1;
        RemoteActionCompatParcelizer = new int[]{-1984370247, -1542579485, 871150655, 513957830, 1881943055, 285323354, 1424266128, -1639362102, -1616701746, -836242486, -534494853, -1278078036, 325684343, 243346381, 215574789, 1168749592, -469369852, -2100895593};
    }

    static void read() {
        read = (char) 8446;
        MediaBrowserCompatItemReceiver = (char) 20631;
        AudioAttributesImplApi21Parcelizer = (char) 15324;
        MediaBrowserCompatCustomActionResultReceiver = (char) 14526;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r0 = r7 + 4
            int r5 = 118 - r5
            int r6 = 302 - r6
            byte[] r1 = kotlin.IResetResponseBody.AudioAttributesImplBaseParcelizer
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r6]
        L26:
            int r5 = r5 + r4
            int r5 = r5 + 1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.IResetResponseBody.b(int, int, short, java.lang.Object[]):void");
    }
}
