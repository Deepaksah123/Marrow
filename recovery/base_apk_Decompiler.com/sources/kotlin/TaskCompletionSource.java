package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class TaskCompletionSource extends addObserverForBackInvoker implements SubjectStat {
    private final Object AudioAttributesCompatParcelizer;
    private getSubjectStat IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private volatile isHighlighted read;
    private static final byte[] $$l = {TarConstants.LF_CHR, -23, 108, 101};
    private static final int $$m = 241;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {25, 68, TarConstants.LF_LINK, 97, TarConstants.LF_CHR, -45, -38, -13, -19, -6, 16, -58, -3, -15, -12, -1, -33, -9, -15, -24, 15, -33, -23, -4, -15, -27, -1, -27, 33, -58, -3, -15, -12, 8, -34, -37, 20, -25, -25, -23, 2, -28, -1, -10, -17, -33, -22, -16, -19, 1, 22, -48, -31, -3, -20, -13, 29, -58, -12, -17, 1, -33, 22, -31, -31, 1, -16, -21, -11, -31, 7, -27, TarConstants.LF_CHR, -71, -12, -29, 36, -59, -3, -35, 71, -43, -66, 3, -19, -20, 32, -65, -14, -12, -5, -7, -33, -13, 1, -28, 28, -50, -17, -10, 28, -45, -32, 0, 7, -31, -31, 1, -16, -21, -11, -31, 7, -27, -9, -5, -25, 1};
    private static final int $$k = 7;
    private static final byte[] $$d = {9, -34, 82, 56, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 146;
    private static int MediaDescriptionCompat = 0;
    private static int MediaBrowserCompatSearchResultReceiver = 1;
    private static char write = 5896;
    private static char MediaBrowserCompatCustomActionResultReceiver = 40363;
    private static char AudioAttributesImplApi21Parcelizer = 20658;
    private static char MediaBrowserCompatItemReceiver = 52591;
    private static char[] AudioAttributesImplBaseParcelizer = {28589, 28603, 28604, 28587, 28576, 28602, 28559, 28606, 28578, 28583, 28591, 28577, 28588, 28671, 28586, 28668, 28662, 28667, 28669, 28663, 28664, 28666, 28665, 28584, 28670, 28640};
    private static int AudioAttributesImplApi26Parcelizer = 411398094;
    private static boolean MediaBrowserCompatMediaItem = true;
    private static boolean RatingCompat = true;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(byte r5, byte r6, short r7) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 122
            int r5 = r5 * 2
            int r5 = r5 + 4
            byte[] r0 = kotlin.TaskCompletionSource.$$l
            int r6 = r6 * 4
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r5
            r7 = r6
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r3 = r0[r5]
        L27:
            int r5 = r5 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TaskCompletionSource.$$n(byte, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = 114 - r5
            byte[] r0 = kotlin.TaskCompletionSource.$$d
            int r1 = r7 + 4
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r5
            r5 = r7
            r3 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L21:
            int r3 = r3 + 1
            r4 = r0[r6]
        L25:
            int r6 = r6 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TaskCompletionSource.g(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r0 = 43 - r6
            int r7 = r7 + 82
            byte[] r1 = kotlin.TaskCompletionSource.$$j
            byte[] r0 = new byte[r0]
            int r6 = 42 - r6
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2d
        L12:
            r3 = r2
        L13:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r7 = r7 + 1
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2d:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-14)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TaskCompletionSource.h(byte, byte, short, java.lang.Object[]):void");
    }

    TaskCompletionSource() {
        this.AudioAttributesCompatParcelizer = new Object();
        this.RemoteActionCompatParcelizer = false;
        MediaBrowserCompatCustomActionResultReceiver();
    }

    TaskCompletionSource(byte b) {
        super(R.layout.activity_gt_analytics);
        this.AudioAttributesCompatParcelizer = new Object();
        this.RemoteActionCompatParcelizer = false;
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.TaskCompletionSource.1
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                TaskCompletionSource.this.AudioAttributesImplApi21Parcelizer();
            }
        });
        int i2 = MediaDescriptionCompat + 111;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 67;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getSubjectStat getsubjectstatWrite = AudioAttributesImplBaseParcelizer().write();
        this.IconCompatParcelizer = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            int i4 = MediaBrowserCompatSearchResultReceiver + 101;
            MediaDescriptionCompat = i4 % 128;
            if (i4 % 2 != 0) {
                this.IconCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                throw null;
            }
            this.IconCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
        }
        int i5 = MediaDescriptionCompat + 123;
        MediaBrowserCompatSearchResultReceiver = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        while (isstopped.read < cArr.length) {
            int i4 = $11 + 109;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[isstopped.read];
            cArr3[1] = cArr[isstopped.read + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) AudioAttributesImplApi21Parcelizer) ^ 1193402106669854891L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(MediaBrowserCompatItemReceiver);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        char threadPriority = (char) ((Process.getThreadPriority(i3) + 20) >> 6);
                        int capsMode = TextUtils.getCapsMode("", i3, i3) + 1504;
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 21;
                        byte b = (byte) i3;
                        byte b2 = b;
                        String str$$n = $$n(b, b2, b2);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objRemoteActionCompatParcelizer = startForeground.read(threadPriority, capsMode, scrollDefaultDelay, 1322448859, false, str$$n, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) write) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ('0' - AndroidCharacter.getMirror('0')), 1504 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 21, 1322448859, false, $$n(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[isstopped.read] = cArr5[0];
            cArr2[isstopped.read + 1] = cArr5[1];
            Object[] objArr4 = {isstopped, isstopped};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) KeyEvent.keyCodeFromString(""), 9016 - View.MeasureSpec.makeMeasureSpec(0, 0), 58 - (Process.myTid() >> 22), -1950993821, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            int i10 = $10 + 77;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void f(byte[] bArr, int i, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = AudioAttributesImplBaseParcelizer;
        char c = '0';
        long j = 0;
        char c2 = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[c2] = Integer.valueOf(cArr2[i3]);
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 44863), 18943 - TextUtils.indexOf("", c), 28 - ExpandableListView.getPackedPositionType(0L), -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i3++;
                    c = '0';
                    c2 = 0;
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
        Object[] objArr3 = {Integer.valueOf(AudioAttributesImplApi26Parcelizer)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 19033 - View.MeasureSpec.getSize(0), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 74, 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        if (RatingCompat) {
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                int i4 = $10 + 89;
                $11 = i4 % 128;
                if (i4 % 2 == 0) {
                    cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[notifydownloads.AudioAttributesCompatParcelizer >>> notifydownloads.IconCompatParcelizer] >> i] % iIntValue);
                    Object[] objArr4 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), KeyEvent.normalizeMetaState(0) + 11439, Color.alpha(0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } else {
                    cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                    Object[] objArr5 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) KeyEvent.normalizeMetaState(0), ExpandableListView.getPackedPositionType(0L) + 11439, (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13, -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (MediaBrowserCompatMediaItem) {
            int i5 = $10 + 59;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                Object[] objArr6 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) ((-1) - ExpandableListView.getPackedPositionChild(j)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 11440, 14 - View.MeasureSpec.makeMeasureSpec(0, 0), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
                int i7 = $11 + 1;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                j = 0;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i9 = 0;
        notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        while (true) {
            notifydownloads.IconCompatParcelizer = i9;
            if (notifydownloads.IconCompatParcelizer >= notifydownloads.AudioAttributesCompatParcelizer) {
                objArr[0] = new String(cArr6);
                return;
            }
            int i10 = $11 + 41;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[notifydownloads.AudioAttributesCompatParcelizer % notifydownloads.IconCompatParcelizer] << i] % iIntValue);
                i9 = notifydownloads.IconCompatParcelizer - 1;
            } else {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                i9 = notifydownloads.IconCompatParcelizer + 1;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00c0  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r31) {
        /*
            Method dump skipped, instruction units count: 2262
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TaskCompletionSource.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        getSubjectStat getsubjectstat;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 87;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDestroy();
            getsubjectstat = this.IconCompatParcelizer;
            int i3 = 31 / 0;
            if (getsubjectstat == null) {
                return;
            }
        } else {
            super.onDestroy();
            getsubjectstat = this.IconCompatParcelizer;
            if (getsubjectstat == null) {
                return;
            }
        }
        getsubjectstat.AudioAttributesCompatParcelizer();
        int i4 = MediaDescriptionCompat + 71;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 111;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplBaseParcelizer().af_();
        if (i3 == 0) {
            int i4 = 51 / 0;
        }
        return objAf_;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaDescriptionCompat + 3;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        if (this.read == null) {
            synchronized (this.AudioAttributesCompatParcelizer) {
                if (this.read == null) {
                    this.read = AudioAttributesImplApi26Parcelizer();
                }
            }
        }
        return this.read;
    }

    protected final void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 57;
        MediaDescriptionCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            if (!this.RemoteActionCompatParcelizer) {
                this.RemoteActionCompatParcelizer = true;
            }
            int i3 = MediaBrowserCompatSearchResultReceiver + 27;
            MediaDescriptionCompat = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 85;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
            int i3 = 0 / 0;
        } else {
            RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        }
        int i4 = MediaDescriptionCompat + 57;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 369
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TaskCompletionSource.onResume():void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = MediaBrowserCompatSearchResultReceiver + 65;
            MediaDescriptionCompat = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 9, new char[]{3113, 37272, 23068, 43365, 38452, 62916, 13288, 22931, 4506, 4930, 47932, 28263, 50238, 27236, 42948, 39703, 33333, '!', 57623, 62829, 52358, 15364, 63352, 19933, 20869, 30097}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(new byte[]{-123, -116, -118, -122, -117, -127, -118, -119, -120, -120, -121, -122, -123, -124, -125, -125, -126, -127}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, null, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i4 = MediaDescriptionCompat + 81;
                MediaBrowserCompatSearchResultReceiver = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4535), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6053, TextUtils.lastIndexOf("", '0', 0) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), ((byte) KeyEvent.getModifierMetaStateMask()) + 6031, 24 - Color.blue(0), -861814097, false, "read", new Class[]{Context.class});
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
        super.onPause();
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0096  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r33) {
        /*
            Method dump skipped, instruction units count: 5132
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TaskCompletionSource.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 7;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatSearchResultReceiver + 13;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 32 / 0;
        }
    }
}
