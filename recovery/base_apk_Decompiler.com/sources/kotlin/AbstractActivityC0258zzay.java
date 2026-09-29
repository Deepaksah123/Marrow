package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: renamed from: o.zzay, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractActivityC0258zzay extends addObserverForBackInvoker implements SubjectStat {
    private static int $10 = 0;
    private static int $11 = 1;
    private getSubjectStat AudioAttributesCompatParcelizer;
    private final Object IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private volatile isHighlighted read;
    private static final byte[] $$g = {34, TarConstants.LF_NORMAL, 18, 42, 64, -58, 1, -16, 31, -21, -14, 7, 10, -13, 12, -9, -4, 22, -30, 5, 71, -47, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 64, -70, 13, -16, 42, -37, 11, -7, 1, 16, -22, -12, 7, 6};
    private static final int $$h = 255;
    private static final byte[] $$a = {9, -88, -121, TarConstants.LF_FIFO, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 120;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private static int[] write = {1647665517, -982008615, 11944871, 759232722, 611125475, -1158508776, -1167702785, 17665563, -949901179, -720599161, 738316488, -1764364029, 1713189862, 1884128653, -638051516, -190437884, -1909713899, 1724964451};
    private static char[] AudioAttributesImplBaseParcelizer = {6428, 6410, 6477, 6402, 6479, 6470, 6481, 6494, 6492, 6474, 6476, 6489, 6490, 6427, 6522, 6407, 6496, 6524, 6505, 6488, 6416, 6400, 6493, 6403, 6478, 6425, 6465, 6404, 6426, 6401, 6418, 6430, 6417, 6491, 6424, 6468, 6406, 6473, 6467, 6475, 6469, 6431, 6523, 6466, 6464, 6507, 6471, 6405, 6429};
    private static char MediaBrowserCompatItemReceiver = 11445;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 114 - r7
            int r8 = 44 - r8
            int r6 = r6 + 4
            byte[] r0 = kotlin.AbstractActivityC0258zzay.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r7 = r8
            r4 = r2
            goto L25
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            int r6 = r6 + 1
            r3 = r0[r6]
        L25:
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AbstractActivityC0258zzay.c(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 9
            int r8 = r8 + 4
            int r6 = r6 * 29
            int r6 = 111 - r6
            int r0 = r7 + 15
            byte[] r1 = kotlin.AbstractActivityC0258zzay.$$g
            byte[] r0 = new byte[r0]
            int r7 = r7 + 14
            r2 = 0
            if (r1 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2c:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-1)
            int r8 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AbstractActivityC0258zzay.d(int, short, byte, java.lang.Object[]):void");
    }

    AbstractActivityC0258zzay() {
        this.IconCompatParcelizer = new Object();
        this.RemoteActionCompatParcelizer = false;
        MediaBrowserCompatItemReceiver();
    }

    AbstractActivityC0258zzay(byte b) {
        super(R.layout.activity_qbank_lesson_list);
        this.IconCompatParcelizer = new Object();
        this.RemoteActionCompatParcelizer = false;
        MediaBrowserCompatItemReceiver();
    }

    private void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.zzay.3
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                AbstractActivityC0258zzay.this.MediaBrowserCompatCustomActionResultReceiver();
            }
        });
        int i2 = AudioAttributesImplApi26Parcelizer + 109;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 11;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            this.AudioAttributesCompatParcelizer = AudioAttributesImplApi21Parcelizer().write();
            int i3 = 1 / 0;
            if (!r1.RemoteActionCompatParcelizer()) {
                return;
            }
        } else {
            getSubjectStat getsubjectstatWrite = AudioAttributesImplApi21Parcelizer().write();
            this.AudioAttributesCompatParcelizer = getsubjectstatWrite;
            if (!getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                return;
            }
        }
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
        int i4 = AudioAttributesImplApi21Parcelizer + 29;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = write;
        int i5 = -470782045;
        char c = '0';
        int i6 = 43695;
        int i7 = 1;
        int i8 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i9 = 0;
            while (i9 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i9])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(i5);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (Gravity.getAbsoluteGravity(0, 0) + i6), TextUtils.lastIndexOf("", c) + 23298, 15 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr4[i9] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i9++;
                    i5 = -470782045;
                    c = '0';
                    i6 = 43695;
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
        float f = BitmapDescriptorFactory.HUE_RED;
        if (iArr6 != null) {
            int i10 = $11 + 35;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                int i11 = $10 + 69;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                Object[] objArr3 = new Object[i7];
                objArr3[i8] = Integer.valueOf(iArr6[i3]);
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (KeyEvent.getDeadChar(i8, i8) + 43695), 23297 - TextUtils.indexOf("", "", i8), (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 14, -1648776394, false, "A", new Class[]{Integer.TYPE});
                }
                iArr2[i3] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                i3++;
                f = BitmapDescriptorFactory.HUE_RED;
                i7 = 1;
                i8 = 0;
            }
            int i13 = $11 + 39;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            iArr6 = iArr2;
            i2 = 0;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr6, i2, iArr5, i2, length3);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i2;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            cArr[i2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr5);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                int i17 = $11 + 77;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[i15];
                    Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (43694 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), TextUtils.getOffsetAfter("", 0) + 23297, (ViewConfiguration.getWindowTouchSlop() >> 8) + 15, -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                    buildremovealldownloadsintent.read = iIntValue;
                    i15 += 21;
                } else {
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[i15];
                    Object[] objArr5 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 43695), 23296 - TextUtils.lastIndexOf("", '0', 0), 16 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                    buildremovealldownloadsintent.read = iIntValue2;
                    i15++;
                }
            }
            int i18 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i18;
            buildremovealldownloadsintent.read ^= iArr5[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[17];
            int i19 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i20 = buildremovealldownloadsintent.read;
            cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
            cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
            cArr[3] = (char) buildremovealldownloadsintent.read;
            buildRemoveAllDownloadsIntent.read(iArr5);
            cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
            Object[] objArr6 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(516305436);
            if (objRemoteActionCompatParcelizer5 == null) {
                objRemoteActionCompatParcelizer5 = startForeground.read((char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 48193), 20126 - ((Process.getThreadPriority(0) + 20) >> 6), 20 - (ViewConfiguration.getPressedStateDuration() >> 16), 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void b(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = AudioAttributesImplBaseParcelizer;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ('0' - AndroidCharacter.getMirror('0')), 7015 - TextUtils.getOffsetAfter("", 0), Color.blue(0) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
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
        Object[] objArr3 = {Integer.valueOf(MediaBrowserCompatItemReceiver)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getJumpTapTimeout() >> 16), ExpandableListView.getPackedPositionChild(0L) + 7016, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 29, -626716224, false, "o", new Class[]{Integer.TYPE});
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
            int i5 = $11 + 39;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            needsstartedservice.AudioAttributesCompatParcelizer = 0;
            while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                int i7 = $11 + 109;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                    int i9 = $11 + 83;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                } else {
                    Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 48194), View.combineMeasuredStates(0, 0) + 20126, 20 - Gravity.getAbsoluteGravity(0, 0), 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                        int i11 = $11 + 99;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) ((-1) - Process.getGidForName("")), View.resolveSizeAndState(0, 0, 0) + 19368, 18 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        int i13 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i13];
                    } else if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                        needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                        needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                        int i14 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                        int i15 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i14];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i15];
                    } else {
                        int i16 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        int i17 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i16];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i17];
                    }
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
            }
        }
        for (int i18 = 0; i18 < i; i18++) {
            cArr4[i18] = (char) (cArr4[i18] ^ 13722);
        }
        String str = new String(cArr4);
        int i19 = $10 + 27;
        $11 = i19 % 128;
        if (i19 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        objArr[0] = str;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        char c;
        char c2;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) - 19, new int[]{-1911630557, 1341697544, 1394677528, 1710951417, 260214053, -1792680518, 209367237, -929412523, 1392281155, -958035200}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 1, new int[]{624416841, 440630323, 624462516, -1062257008}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                b((byte) (Drawable.resolveOpacity(0, 0) + 15), 25 - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{'(', 2, 11, '\r', '/', 25, '\b', '&', '(', 16, 15, '(', 25, '.', '\f', 22, '\f', 21, '\r', 1, 16, '-', '\t', 5, '&', '\t'}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 42), Color.blue(0) + 18, new char[]{'$', 25, 13872, 13872, 3, 6, 11, 15, 13874, 13874, '(', 21, '(', '&', '\f', 22, '/', 4}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i2 = AudioAttributesImplApi21Parcelizer + 13;
                AudioAttributesImplApi26Parcelizer = i2 % 128;
                if (i2 % 2 == 0) {
                    boolean z = baseContext instanceof ContextWrapper;
                    throw null;
                }
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i3 = AudioAttributesImplApi26Parcelizer + 37;
                AudioAttributesImplApi21Parcelizer = i3 % 128;
                int i4 = i3 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ExpandableListView.getPackedPositionType(0L) + 4535), 6054 - KeyEvent.normalizeMetaState(0), TextUtils.lastIndexOf("", '0', 0) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 102), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 38, new char[]{')', '.', 31, 27, '&', 11, ',', 16, 3, 28, 11, '\"', 3, 23, '\r', '-', 30, 6, ')', ' ', '\t', 6, 25, 31, 17, 27, 2, '#', 11, 27, 29, 28, 0, 30, 30, 3, 11, '%', '\r', '%', 11, 7, '\"', '.', 18, '\"', 23, 3}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b((byte) (TextUtils.lastIndexOf("", '0', 0, 0) + 92), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 45, new char[]{' ', ')', ')', ' ', '#', '&', '&', '\"', 6, '0', 11, '\n', ' ', 27, 17, '&', ',', '\t', '\'', 30, '\"', 17, 4, 28, 11, 23, 27, ' ', '\"', '\'', 29, 28, 28, 6, '\n', 7, 21, 31, 20, ')', 27, '0', '\n', 11, 17, 31, 24, 11, 28, '!', 6, ')', ' ', '\'', 6, '*', 17, 27, 4, '%', ',', 6, 20, '0'}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 60, new int[]{760871157, 596117353, -2009056236, 2103147641, 2119244908, -1361770744, 2052856116, -1351589110, -1304871830, -1192198392, -649659145, -1415069369, 1747646574, -990601739, 1795333452, 87877436, 95238879, -1329996083, -1188860299, 558408385, 283689733, -2010351039, 1698699780, 929110528, 116201979, 324415398, -1324619071, 1859698270, 1598122507, 2042819563, -2143662663, 1049282642}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 85), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 66, new char[]{'+', '\t', '\f', 15, '\"', 31, 13869, 13869, '\t', '&', 21, '(', 5, '\r', '+', 25, 3, '\f', 29, '(', '\t', '+', '\t', 5, '$', '\t', '(', '&', 29, '\f', '\'', 1, 23, '$', '\r', 11, ' ', '\f', 23, '$', '\t', 5, '%', '(', '/', '\'', 16, '$', 26, '!', 19, 22, 6, 5, 5, 30, 15, 22, 14, '#', 16, 1, '\t', 0, 1, '\f', 13921}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b((byte) (37 - ExpandableListView.getPackedPositionGroup(0L)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 29, new char[]{29, '\'', 21, 4, '#', 29}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 32, new int[]{-694378633, -267110103, -759058732, -1660077517, 218304741, -1328154843, -521813198, 736569896, 1539531338, 1770505479, -535106002, -1453025040, 1772507911, 1152777519, 523050918, -317731730, 1023977504, -1479399713}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.normalizeMetaState(0), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6030, 24 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer3 == null) {
            char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 13183);
            int i5 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 1648;
            int maximumFlingVelocity = 26 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte[] bArr = $$a;
            Object[] objArr13 = new Object[1];
            c(bArr[17], bArr[62], bArr[5], objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(threadPriority, i5, maximumFlingVelocity, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) == -1) {
            Object[] objArr14 = new Object[1];
            b((byte) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 41), TextUtils.indexOf("", "", 0, 0) + 16, new char[]{',', '$', '\t', '#', '%', '$', '(', 2, 1, '\'', '0', 0, 29, '\f', 5, '%'}, objArr14);
            Class<?> cls3 = Class.forName((String) objArr14[0]);
            Object[] objArr15 = new Object[1];
            b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 58), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 12, new char[]{24, '\f', 3, 6, '\f', 22, '\r', 1, 23, ',', 30, '/', '.', '/', '\t', 3}, objArr15);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr15[0], Object.class).invoke(null, this)).intValue();
            int i6 = AudioAttributesImplApi26Parcelizer + 95;
            AudioAttributesImplApi21Parcelizer = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr16 = {Integer.valueOf(iIntValue2), 0, -1653265778};
                byte b = $$g[32];
                Object[] objArr17 = new Object[1];
                d(b, r0[8], b, objArr17);
                Class<?> cls4 = Class.forName((String) objArr17[0]);
                Object[] objArr18 = new Object[1];
                d(r0[6], r0[78], r0[19], objArr18);
                objArr = (Object[]) cls4.getMethod((String) objArr18[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr16);
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char cLastIndexOf = (char) (13182 - TextUtils.lastIndexOf("", '0', 0));
                    int scrollDefaultDelay = 1649 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                    int iIndexOf = 25 - TextUtils.indexOf((CharSequence) "", '0');
                    byte[] bArr2 = $$a;
                    Object[] objArr19 = new Object[1];
                    c((short) (-bArr2[65]), bArr2[9], (byte) (-bArr2[30]), objArr19);
                    objRemoteActionCompatParcelizer4 = startForeground.read(cLastIndexOf, scrollDefaultDelay, iIndexOf, -1033747278, false, (String) objArr19[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                try {
                    Object[] objArr20 = new Object[1];
                    b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(3) - 56), View.getDefaultSize(0, 0) + 22, new char[]{'(', 2, 11, '\r', '/', 25, '\b', '&', '/', ' ', '#', '+', 5, '\"', '\t', 1, '&', '/', '\'', '*', '(', '\''}, objArr20);
                    Class<?> cls5 = Class.forName((String) objArr20[0]);
                    Object[] objArr21 = new Object[1];
                    b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 18), TextUtils.getOffsetBefore("", 0) + 15, new char[]{0, '%', '(', 16, 30, 5, 7, 17, '\t', ',', '$', 7, '!', '/', 13845}, objArr21);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr21[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char keyRepeatDelay = (char) (13183 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                        int i8 = 1650 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                        int packedPositionChild = 25 - ExpandableListView.getPackedPositionChild(0L);
                        byte[] bArr3 = $$a;
                        byte b2 = bArr3[9];
                        byte b3 = (byte) (-bArr3[30]);
                        Object[] objArr22 = new Object[1];
                        c((short) 75, b2, b3, objArr22);
                        objRemoteActionCompatParcelizer5 = startForeground.read(keyRepeatDelay, i8, packedPositionChild, 54351865, false, (String) objArr22[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char capsMode = (char) (TextUtils.getCapsMode("", 0, 0) + 13183);
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1649;
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 26;
                        byte[] bArr4 = $$a;
                        Object[] objArr23 = new Object[1];
                        c(bArr4[17], bArr4[62], bArr4[5], objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(capsMode, minimumFlingVelocity, jumpTapTimeout, -133433128, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf2);
                    int i9 = AudioAttributesImplApi26Parcelizer + 117;
                    AudioAttributesImplApi21Parcelizer = i9 % 128;
                    c = 2;
                    int i10 = i9 % 2;
                    c2 = 3;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        } else {
            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer7 == null) {
                char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 13183);
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1650;
                int iIndexOf2 = TextUtils.indexOf("", "", 0) + 26;
                byte[] bArr5 = $$a;
                short s = (short) (-bArr5[65]);
                byte b4 = bArr5[9];
                byte b5 = (byte) (-bArr5[30]);
                Object[] objArr24 = new Object[1];
                c(s, b4, b5, objArr24);
                objRemoteActionCompatParcelizer7 = startForeground.read(cMakeMeasureSpec, bitsPerPixel, iIndexOf2, -1033747278, false, (String) objArr24[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer7).get(null);
            c2 = 3;
            c = 2;
        }
        int i11 = ((int[]) objArr[c2])[0];
        int i12 = ((int[]) objArr[c])[0];
        if (i12 != i11) {
            long j = -1;
            long j2 = ((long) (i12 ^ i11)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (TextUtils.getTrimmedLength("") + 4535), ((byte) KeyEvent.getModifierMetaStateMask()) + 6055, 42 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {-16832969, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) View.MeasureSpec.getSize(0), 6030 - TextUtils.indexOf("", ""), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23);
                byte[] bArr6 = $$g;
                Object[] objArr26 = new Object[1];
                d(bArr6[6], bArr6[78], bArr6[19], objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.AudioAttributesCompatParcelizer;
        if (getsubjectstat != null) {
            getsubjectstat.AudioAttributesCompatParcelizer();
            int i2 = AudioAttributesImplApi26Parcelizer + 25;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = AudioAttributesImplApi26Parcelizer + 7;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 117;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplApi21Parcelizer().af_();
        int i4 = AudioAttributesImplApi21Parcelizer + 33;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 13 / 0;
        }
        return objAf_;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = AudioAttributesImplApi26Parcelizer + 23;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted AudioAttributesImplApi21Parcelizer() {
        if (this.read == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.read == null) {
                    this.read = AudioAttributesImplApi26Parcelizer();
                }
            }
        }
        return this.read;
    }

    protected final void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        if (!this.RemoteActionCompatParcelizer) {
            int i2 = AudioAttributesImplApi21Parcelizer + 31;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            this.RemoteActionCompatParcelizer = i2 % 2 != 0;
        }
        int i3 = AudioAttributesImplApi26Parcelizer + 57;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 83;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        if (i3 == 0) {
            int i4 = 49 / 0;
        }
        return RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f1  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AbstractActivityC0258zzay.onResume():void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = AudioAttributesImplApi21Parcelizer + 19;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 16, new char[]{'(', 2, 11, '\r', '/', 25, '\b', '&', '(', 16, 15, '(', 25, '.', '\f', 22, '\f', 21, '\r', 1, 16, '-', '\t', 5, '&', '\t'}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 37), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 14, new char[]{'$', 25, 13872, 13872, 3, 6, 11, 15, 13874, 13874, '(', 21, '(', '&', '\f', 22, '/', 4}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = AudioAttributesImplApi26Parcelizer + 9;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            int i5 = i4 % 2;
            baseContext = (((baseContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) baseContext).getBaseContext() != null) ? baseContext.getApplicationContext() : null;
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4534 - TextUtils.lastIndexOf("", '0')), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6053, (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) View.MeasureSpec.makeMeasureSpec(0, 0), 6030 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 24, -861814097, false, "read", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i6 = AudioAttributesImplApi26Parcelizer + 109;
                AudioAttributesImplApi21Parcelizer = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 5 / 3;
                }
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0b22 A[Catch: all -> 0x0303, TryCatch #2 {all -> 0x0303, blocks: (B:69:0x0477, B:71:0x047d, B:72:0x04a9, B:177:0x0b1c, B:179:0x0b22, B:180:0x0b52, B:210:0x0f55, B:212:0x0f5b, B:213:0x0f87, B:246:0x13c1, B:248:0x13c7, B:249:0x13f4, B:227:0x1179, B:229:0x119c, B:230:0x11f4, B:19:0x00ed, B:21:0x00f3, B:22:0x011c, B:24:0x0272, B:26:0x02a3, B:27:0x02fd, B:33:0x0313, B:35:0x0317, B:39:0x0323, B:55:0x03fe, B:57:0x0404, B:58:0x0405, B:60:0x0407, B:62:0x040e, B:63:0x040f), top: B:275:0x00ed, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0be4  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0c39  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0c9b  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0f34  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x101c  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x106b  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x10c6  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x139e  */
    /* JADX WARN: Removed duplicated region for block: B:310:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00c3  */
    /* JADX WARN: Type inference failed for: r24v18 */
    /* JADX WARN: Type inference failed for: r24v2 */
    /* JADX WARN: Type inference failed for: r24v21 */
    /* JADX WARN: Type inference failed for: r24v22 */
    /* JADX WARN: Type inference failed for: r24v23 */
    /* JADX WARN: Type inference failed for: r24v24 */
    /* JADX WARN: Type inference failed for: r24v25 */
    /* JADX WARN: Type inference failed for: r24v27 */
    /* JADX WARN: Type inference failed for: r24v28 */
    /* JADX WARN: Type inference failed for: r24v3 */
    /* JADX WARN: Type inference failed for: r24v33 */
    /* JADX WARN: Type inference failed for: r24v34 */
    /* JADX WARN: Type inference failed for: r24v35 */
    /* JADX WARN: Type inference failed for: r24v37 */
    /* JADX WARN: Type inference failed for: r24v4 */
    /* JADX WARN: Type inference failed for: r24v41 */
    /* JADX WARN: Type inference failed for: r24v42 */
    /* JADX WARN: Type inference failed for: r24v43 */
    /* JADX WARN: Type inference failed for: r24v44 */
    /* JADX WARN: Type inference failed for: r24v45 */
    /* JADX WARN: Type inference failed for: r24v46 */
    /* JADX WARN: Type inference failed for: r24v47 */
    /* JADX WARN: Type inference failed for: r24v48 */
    /* JADX WARN: Type inference failed for: r4v156 */
    /* JADX WARN: Type inference failed for: r4v196 */
    /* JADX WARN: Type inference failed for: r4v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v79, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v163 */
    /* JADX WARN: Type inference failed for: r6v164 */
    /* JADX WARN: Type inference failed for: r6v165 */
    /* JADX WARN: Type inference failed for: r6v180 */
    /* JADX WARN: Type inference failed for: r6v181 */
    /* JADX WARN: Type inference failed for: r6v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v27 */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r33) {
        /*
            Method dump skipped, instruction units count: 5913
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.AbstractActivityC0258zzay.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 57;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
