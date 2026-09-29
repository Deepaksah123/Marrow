package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
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

/* JADX INFO: loaded from: classes4.dex */
public abstract class MaterialCheckBoxSavedState extends addObserverForBackInvoker implements SubjectStat {
    private static int $10 = 0;
    private static int $11 = 1;
    private volatile isHighlighted RemoteActionCompatParcelizer;
    private getSubjectStat write;
    private static final byte[] $$g = {9, -121, -22, -93, 74, -14, 7, 4, 2, -25, 12, 21, 14, 7, 7, 26, -8, -10, 13, 8, 12, 22, 74, -74, 14, 18, -2, 24, -17, -3, 10, TarConstants.LF_BLK, -35, 11, 6, 24, -10, 45, -8, -8, 24, 7, 2, 12, -8, 30, -4, -10, 1, 7, 4, 24, 45, -25, -8, 20, 3, 10, TarConstants.LF_BLK, -35, 11, 6, 24, -10, 45, -8, -8, 24, 7, 2, 12, -8, 30, -4, 74, -48, 11, -6, 47, -14, -6, 6, 17, 6, 16, 32, -28, 18, 20, 40, -35, 12, 11, TarConstants.LF_CHR, -35, 10, 9, 18, 11, -8, 20, -4, 22, -2, 4, TarConstants.LF_DIR, -11, -4, 22, 3, 11, -4, 14, 18, -2, 24};
    private static final int $$h = 36;
    private static final byte[] $$a = {79, -100, -79, 21, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 215;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;
    private static int[] IconCompatParcelizer = {-2096344033, 1855211515, 1719026905, -526769019, -730571044, -1346745669, -1881861375, -87503607, -893769870, 236859376, -551441716, -894827527, -1579571003, 1105489507, 1168736762, -309020419, 1537189929, 1622463897};
    private static char[] AudioAttributesImplApi21Parcelizer = {6417, 6467, 6481, 6426, 6479, 6431, 6505, 6474, 6493, 6425, 6401, 6410, 6422, 6475, 6477, 6468, 6471, 6402, 6420, 6407, 6429, 6428, 6406, 6423, 6490, 6470, 6427, 6524, 6466, 6491, 6416, 6492, 6478, 6430, 6523, 6469, 6405, 6424, 6494, 6507, 6476, 6403, 6488, 6473, 6404, 6400, 6465, 6464, 6421};
    private static char MediaBrowserCompatItemReceiver = 11445;
    private final Object read = new Object();
    private boolean AudioAttributesCompatParcelizer = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.MaterialCheckBoxSavedState.$$a
            int r1 = 44 - r8
            int r6 = r6 + 4
            int r7 = 114 - r7
            byte[] r1 = new byte[r1]
            int r8 = 43 - r8
            r2 = -1
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L2e
        L12:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L16:
            int r3 = r3 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            r9[r7] = r6
            return
        L28:
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2e:
            int r6 = r6 + r7
            int r6 = r6 + r2
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MaterialCheckBoxSavedState.c(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = kotlin.MaterialCheckBoxSavedState.$$g
            int r7 = 112 - r7
            int r9 = r9 + 73
            int r8 = r8 + 5
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L25
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L20
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L20:
            r3 = r0[r7]
            r6 = r3
            r3 = r9
            r9 = r6
        L25:
            int r9 = -r9
            int r3 = r3 + r9
            int r7 = r7 + 1
            int r9 = r3 + 9
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MaterialCheckBoxSavedState.d(int, short, byte, java.lang.Object[]):void");
    }

    MaterialCheckBoxSavedState() {
        AudioAttributesImplBaseParcelizer();
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.MaterialCheckBoxSavedState.3
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                MaterialCheckBoxSavedState.this.AudioAttributesImplApi21Parcelizer();
            }
        });
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 99;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 121;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getSubjectStat getsubjectstatWrite = MediaBrowserCompatCustomActionResultReceiver().write();
        this.write = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            this.write.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 3;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = IconCompatParcelizer;
        int i3 = -470782045;
        int i4 = 43694;
        long j = 0;
        int i5 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i6 = 0;
            while (i6 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(i3);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (i4 - MotionEvent.axisFromString("")), ExpandableListView.getPackedPositionChild(j) + 23298, TextUtils.indexOf("", "", 0, 0) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr4[i6] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i6++;
                    i3 = -470782045;
                    i4 = 43694;
                    j = 0;
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
        int[] iArr6 = IconCompatParcelizer;
        if (iArr6 != null) {
            int i7 = $10 + 53;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr3 = new Object[1];
                    objArr3[i5] = Integer.valueOf(iArr6[i8]);
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 43694), MotionEvent.axisFromString("") + 23298, (ViewConfiguration.getJumpTapTimeout() >> 16) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr2[i8] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    i8++;
                    i5 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr6 = iArr2;
        }
        int i9 = i5;
        System.arraycopy(iArr6, i9, iArr5, i9, length3);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i9;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            cArr[i9] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr5);
            int i10 = 0;
            for (int i11 = 16; i10 < i11; i11 = 16) {
                int i12 = $11 + 55;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[i10];
                    Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (43696 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23298, (ViewConfiguration.getFadingEdgeLength() >> 16) + 15, -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                    buildremovealldownloadsintent.read = iIntValue;
                    i10 += 52;
                } else {
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[i10];
                    try {
                        Object[] objArr5 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) (43694 - MotionEvent.axisFromString("")), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 23296, (ViewConfiguration.getScrollBarSize() >> 8) + 15, -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                        }
                        int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                        buildremovealldownloadsintent.read = iIntValue2;
                        i10++;
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
            }
            int i13 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i13;
            buildremovealldownloadsintent.read ^= iArr5[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[17];
            int i14 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i15 = buildremovealldownloadsintent.read;
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
                objRemoteActionCompatParcelizer5 = startForeground.read((char) (KeyEvent.getDeadChar(0, 0) + 48194), KeyEvent.keyCodeFromString("") + 20126, 21 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            i9 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i16 = $11 + 59;
        $10 = i16 % 128;
        int i17 = i16 % 2;
        objArr[0] = str;
    }

    private static void b(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = AudioAttributesImplApi21Parcelizer;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 7015 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (-16777186) - Color.rgb(0, 0, 0), -626716224, false, "o", new Class[]{Integer.TYPE});
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
            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getPressedStateDuration() >> 16), 7015 - ExpandableListView.getPackedPositionType(0L), 30 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -626716224, false, "o", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i5 = $11 + 93;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                i2 = i + 43;
                cArr4[i2] = (char) (cArr[i2] - b);
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
                } else {
                    Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (48194 - View.getDefaultSize(0, 0)), 20127 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 21 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                        int i6 = $11 + 119;
                        $10 = i6 % 128;
                        int i7 = i6 % 2;
                        Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 19368 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 18 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        int i8 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i8];
                    } else if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                        needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                        needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                        int i9 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                        int i10 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i9];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i10];
                        int i11 = $11 + 25;
                        $10 = i11 % 128;
                        if (i11 % 2 != 0) {
                            int i12 = 4 % 5;
                        }
                    } else {
                        int i13 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        int i14 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i13];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i14];
                        int i15 = $10 + 9;
                        $11 = i15 % 128;
                        if (i15 % 2 == 0) {
                            int i16 = 3 % 3;
                        }
                    }
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
            }
        }
        for (int i17 = 0; i17 < i; i17++) {
            cArr4[i17] = (char) (cArr4[i17] ^ 13722);
        }
        String str = new String(cArr4);
        int i18 = $10 + 63;
        $11 = i18 % 128;
        if (i18 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 8, new int[]{-1184682775, 706481580, -71463260, 758866963, 476780267, -2060747814, 1978688947, 222341738, -1907415980, 1018143945}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        a(4 - ((byte) KeyEvent.getModifierMetaStateMask()), new int[]{-2054068802, -1011076404, -1229955219, -1359568323}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 12), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 9, new char[]{'.', 22, '&', 26, 18, ',', '$', 26, ',', '+', '+', 21, '\r', 20, ' ', '-', '\'', '-', 30, 3, 26, '0', 21, 17, '/', '$'}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                b((byte) (TextUtils.indexOf((CharSequence) "", '0') + 84), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 14, new char[]{7, '\t', 13883, 13883, 18, 21, '\"', 3, 13885, 13885, 18, '+', '\b', '0', ' ', '-', 18, 23}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i2 = AudioAttributesImplBaseParcelizer + 101;
                MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
                int i3 = i2 % 2;
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (Color.alpha(0) + 4535), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 6054, 42 - (ViewConfiguration.getTouchSlop() >> 8), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) + 12, new int[]{1645564758, -261468937, -2133598601, 1822260506, -1448098204, -469804123, -340895187, 928569750, -111652463, 1482992556, -38373026, -1714425785, 1720443462, 317977142, -783055218, 1397516120, -2118643817, 1743129448, 1688718460, -1975021110, 2144177678, -2095425647, 744863259, 1749934934}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 29, new int[]{-86559030, -248401163, 1954992266, 1934988797, -494888712, -1520291124, -531318594, -826559084, -659026193, -1071965235, -1618431400, -1442782777, 1802282295, 1243119566, 2146143209, 676103794, -1303072752, 1316300345, 3324219, -1536063116, -1658192432, -1613189133, -380848055, -772404497, -293312778, 1759699348, -558285379, -1834148700, -399084954, 81874765, 854288847, 258657217}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 40), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) + 15, new char[]{'\b', '\n', '/', '$', '\n', 2, '\t', '\"', 13891, 13891, 16, '\r', 29, ',', 13891, 13891, 29, ',', '\b', '\n', 2, '\n', 24, 5, 7, 21, '#', 5, '!', '(', 16, '%', 22, '*', 0, 19, '*', 15, 25, '!', '\n', 2, 16, '#', '\n', 6, '$', ',', 19, ')', 29, '.', '\f', 30, 27, '\f', '\n', '\b', 14, '\r', '(', '\f', '\"', 31}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    a(67 - View.combineMeasuredStates(0, 0), new int[]{-532693706, -449932784, 378709780, 2125654697, -927741558, -1283486798, -905966038, -1655414824, 996574059, -1364919498, 480043765, 92355084, 1032363235, -1687329421, -633839129, -1339370908, -1343271280, 76358568, -6956833, -918001118, 1591200220, -1421702155, 507396991, 1935174940, -559898627, -272390529, 1878645798, 404979438, -1190886288, -626494409, -718716501, 1969743192, -991724760, -716130287}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 44), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 30, new char[]{1, 21, 7, 23, 24, 1}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 11), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2), new char[]{2, '\n', '\f', 0, 31, 5, 13842, 13842, '%', 29, '!', 31, 29, '\'', 26, 28, 26, 0, '#', 1, '\n', 0, '&', '%', '!', 4, '-', 1, 0, 19, 11, '\"', '\b', ',', 13843, 13843}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 6030 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13184);
            int i4 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1648;
            int iAxisFromString = 25 - MotionEvent.axisFromString("");
            byte[] bArr = $$a;
            Object[] objArr13 = new Object[1];
            c(bArr[17], bArr[62], bArr[5], objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(cIndexOf, i4, iAxisFromString, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i5 = AudioAttributesImplBaseParcelizer + 95;
            MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
            int i6 = i5 % 2;
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char c = (char) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13183);
                int mode = View.MeasureSpec.getMode(0) + 1649;
                int i7 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25;
                byte[] bArr2 = $$a;
                short s = (short) (-bArr2[65]);
                byte b = bArr2[9];
                byte b2 = (byte) (-bArr2[30]);
                Object[] objArr14 = new Object[1];
                c(s, b, b2, objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(c, mode, i7, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 20, new char[]{29, '*', '$', '-', 29, 22, '.', 22, 1, 25, 30, 6, 30, ' ', 21, '*'}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 12, new int[]{1622258960, -1903331457, 581689829, -1022658632, 2130971746, 2021135797, 977772946, 1076018129}, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i8 = AudioAttributesImplBaseParcelizer + 7;
            MediaBrowserCompatCustomActionResultReceiver = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, 1778198182};
                int i10 = $$h;
                byte[] bArr3 = $$g;
                Object[] objArr18 = new Object[1];
                d((byte) (i10 | 72), bArr3[55], (byte) (i10 + 2), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                d((byte) 84, (byte) (bArr3[84] - 1), (byte) (bArr3[48] - 1), objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char fadingEdgeLength = (char) (13183 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                    int packedPositionChild = 1648 - ExpandableListView.getPackedPositionChild(0L);
                    int packedPositionType = 26 - ExpandableListView.getPackedPositionType(0L);
                    byte[] bArr4 = $$a;
                    Object[] objArr20 = new Object[1];
                    c((short) (-bArr4[65]), bArr4[9], (byte) (-bArr4[30]), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(fadingEdgeLength, packedPositionChild, packedPositionType, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 67), 22 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{'.', 22, '&', 26, 18, ',', '$', 26, 15, 30, 27, 29, 1, 30, 28, 17, '$', '(', 16, 17, '\b', 6}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, new int[]{1377334873, -274292549, 506461352, 399499034, -676466051, 1659568484, 1774938939, -736552121}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char jumpTapTimeout = (char) (13183 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        int iGreen = Color.green(0) + 1649;
                        int offsetBefore = 26 - TextUtils.getOffsetBefore("", 0);
                        byte[] bArr5 = $$a;
                        byte b3 = bArr5[9];
                        byte b4 = (byte) (-bArr5[30]);
                        Object[] objArr23 = new Object[1];
                        c((short) 75, b3, b4, objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(jumpTapTimeout, iGreen, offsetBefore, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 13183);
                        int i11 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1648;
                        int i12 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25;
                        byte[] bArr6 = $$a;
                        Object[] objArr24 = new Object[1];
                        c(bArr6[17], bArr6[62], bArr6[5], objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(scrollBarFadeDuration, i11, i12, -133433128, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf2);
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
        }
        int i13 = ((int[]) objArr[3])[0];
        int i14 = ((int[]) objArr[2])[0];
        if (i14 != i13) {
            long j = -1;
            long j2 = ((long) (i14 ^ i13)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4536 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionType(0L) + 6054, 42 - KeyEvent.getDeadChar(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {904513410, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 6078 - AndroidCharacter.getMirror('0'), 25 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                Object[] objArr26 = new Object[1];
                d((byte) 65, (byte) ($$g[27] - 1), r4[0], objArr26);
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
        AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        getSubjectStat getsubjectstat;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 111;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDestroy();
            getsubjectstat = this.write;
            int i3 = 7 / 0;
            if (getsubjectstat == null) {
                return;
            }
        } else {
            super.onDestroy();
            getsubjectstat = this.write;
            if (getsubjectstat == null) {
                return;
            }
        }
        int i4 = AudioAttributesImplBaseParcelizer + 117;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        getsubjectstat.AudioAttributesCompatParcelizer();
        if (i5 != 0) {
            int i6 = 97 / 0;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 15;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = MediaBrowserCompatCustomActionResultReceiver().af_();
        int i4 = AudioAttributesImplBaseParcelizer + 59;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
        return objAf_;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 71;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted MediaBrowserCompatCustomActionResultReceiver() {
        if (this.RemoteActionCompatParcelizer == null) {
            synchronized (this.read) {
                if (this.RemoteActionCompatParcelizer == null) {
                    this.RemoteActionCompatParcelizer = MediaBrowserCompatItemReceiver();
                }
            }
        }
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void AudioAttributesImplApi21Parcelizer() {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.MaterialCheckBoxSavedState.AudioAttributesImplBaseParcelizer
            int r1 = r1 + 85
            int r2 = r1 % 128
            kotlin.MaterialCheckBoxSavedState.MediaBrowserCompatCustomActionResultReceiver = r2
            int r1 = r1 % r0
            r2 = 1
            if (r1 == 0) goto L18
            boolean r1 = r4.AudioAttributesCompatParcelizer
            r3 = 15
            int r3 = r3 / 0
            if (r1 != 0) goto L37
            goto L1c
        L18:
            boolean r1 = r4.AudioAttributesCompatParcelizer
            if (r1 == r2) goto L37
        L1c:
            r4.AudioAttributesCompatParcelizer = r2
            java.lang.Object r1 = r4.af_()
            o.setCheckableResource r1 = (kotlin.setCheckableResource) r1
            java.lang.Object r4 = kotlin.getSubmittedOnDate.AudioAttributesCompatParcelizer(r4)
            o.setCheckedIconEnabled r4 = (kotlin.setCheckedIconEnabled) r4
            int r4 = kotlin.MaterialCheckBoxSavedState.AudioAttributesImplBaseParcelizer
            int r4 = r4 + 107
            int r1 = r4 % 128
            kotlin.MaterialCheckBoxSavedState.MediaBrowserCompatCustomActionResultReceiver = r1
            int r4 = r4 % r0
            if (r4 == 0) goto L37
            int r4 = r0 / 5
        L37:
            int r4 = kotlin.MaterialCheckBoxSavedState.AudioAttributesImplBaseParcelizer
            int r4 = r4 + 89
            int r1 = r4 % 128
            kotlin.MaterialCheckBoxSavedState.MediaBrowserCompatCustomActionResultReceiver = r1
            int r4 = r4 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MaterialCheckBoxSavedState.AudioAttributesImplApi21Parcelizer():void");
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 85;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = AudioAttributesImplBaseParcelizer + 41;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return RemoteActionCompatParcelizer;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = AudioAttributesImplBaseParcelizer + 65;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            b((byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 96), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 85, new char[]{'.', 22, '&', 26, 18, ',', '$', 26, ',', '+', '+', 21, '\r', 20, ' ', '-', '\'', '-', 30, 3, 26, '0', 21, 17, '/', '$'}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 73), Color.rgb(0, 0, 0) + 16777234, new char[]{7, '\t', 13883, 13883, 18, 21, '\"', 3, 13885, 13885, 18, '+', '\b', '0', ' ', '-', 18, 23}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 109;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            int i5 = i4 % 2;
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i6 = AudioAttributesImplBaseParcelizer + 13;
                MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (baseContext != null) {
            int i8 = AudioAttributesImplBaseParcelizer + 115;
            MediaBrowserCompatCustomActionResultReceiver = i8 % 128;
            try {
                if (i8 % 2 != 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 4535), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 6054, Color.alpha(0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getEdgeSlop() >> 16) + 6030, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    int i9 = 4 / 0;
                } else {
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((Process.myPid() >> 22) + 4535), TextUtils.indexOf((CharSequence) "", '0') + 6055, 43 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), TextUtils.lastIndexOf("", '0', 0) + 6031, 24 - (ViewConfiguration.getFadingEdgeLength() >> 16), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke2, objArr4);
                }
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x00e1  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 526
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MaterialCheckBoxSavedState.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:139:0x0931 A[Catch: all -> 0x09fa, TryCatch #12 {all -> 0x09fa, blocks: (B:137:0x091c, B:139:0x0931, B:140:0x0967), top: B:276:0x091c, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:143:0x097a A[Catch: all -> 0x09f0, TryCatch #3 {all -> 0x09f0, blocks: (B:141:0x096d, B:143:0x097a, B:144:0x09e8), top: B:261:0x096d, outer: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0b27  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0b7c  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0bd8  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0e66  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0f4d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0f9d  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0ff0  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x1281  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x08ef A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r31) {
        /*
            Method dump skipped, instruction units count: 5626
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MaterialCheckBoxSavedState.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 63;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 113;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }
}
