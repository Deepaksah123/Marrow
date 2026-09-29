package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class serializeIterableToIntentExtraSafe extends addObserverForBackInvoker implements SubjectStat {
    private final Object AudioAttributesCompatParcelizer = new Object();
    private boolean IconCompatParcelizer = false;
    private getSubjectStat read;
    private volatile isHighlighted write;
    private static final byte[] $$c = {94, -36, -26, 62};
    private static final int $$f = 109;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {43, -12, TarConstants.LF_GNUTYPE_LONGNAME, -80, 67, -22, -45, 11, 2, 27, -16, 0, -4, 10, -7, -4, TarConstants.LF_LINK, -39, 13, -13, -5, 11, -2, 13, -4, 3, 37, -24, -18, 56, -28, 0, -3, 5, TarConstants.LF_FIFO, 7, 11, -9, 17, -17, -6, 0, -3, 17, 38, -32, -15, 13, -4, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, 67, -55, 4, -13, TarConstants.LF_SYMLINK, -35, 7, 20, -17, 37, -49, 17, 2, 3, -11, 80, -81, 7, 11, -9, 17, -50, 19, -3, -4, TarConstants.LF_NORMAL, -49, 2, 4, 11, 9, -17, 3, 17, -12, TarConstants.LF_SYMLINK, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11};
    private static final int $$h = 63;
    private static final byte[] $$a = {18, -127, -77, -105, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 98;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    private static int[] RemoteActionCompatParcelizer = {2119585270, 1047855575, -428088274, 774117337, -1527341085, 204526877, 509427269, -1739956898, 500842486, 398308998, 739982447, 1062006585, 402285425, 867626737, 431456651, -234683110, -1366449827, -1364100334};
    private static char AudioAttributesImplApi21Parcelizer = 48964;
    private static char MediaBrowserCompatItemReceiver = 56366;
    private static char MediaBrowserCompatCustomActionResultReceiver = 58410;
    private static char AudioAttributesImplApi26Parcelizer = 46892;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r7, int r8, short r9) {
        /*
            int r9 = r9 * 2
            int r9 = r9 + 1
            byte[] r0 = kotlin.serializeIterableToIntentExtraSafe.$$c
            int r7 = r7 * 2
            int r7 = 122 - r7
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r7 = r9
            r5 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2c:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeIterableToIntentExtraSafe.$$i(short, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = kotlin.serializeIterableToIntentExtraSafe.$$a
            int r9 = 44 - r9
            int r7 = r7 + 65
            int r8 = 190 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L27
        L10:
            r3 = r2
        L11:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L27:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-1)
            r8 = r3
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeIterableToIntentExtraSafe.c(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = 87 - r6
            byte[] r0 = kotlin.serializeIterableToIntentExtraSafe.$$g
            int r1 = r7 + 5
            int r8 = r8 + 65
            byte[] r1 = new byte[r1]
            int r7 = r7 + 4
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L2b:
            int r6 = r6 + 1
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + 2
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeIterableToIntentExtraSafe.d(short, short, byte, java.lang.Object[]):void");
    }

    serializeIterableToIntentExtraSafe() {
        AudioAttributesImplApi26Parcelizer();
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.serializeIterableToIntentExtraSafe.5
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                serializeIterableToIntentExtraSafe.this.AudioAttributesImplBaseParcelizer();
            }
        });
        int i2 = AudioAttributesImplBaseParcelizer + 69;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 17;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getSubjectStat getsubjectstatWrite = MediaBrowserCompatItemReceiver().write();
        this.read = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            this.read.IconCompatParcelizer(getDefaultViewModelCreationExtras());
        }
        int i4 = MediaDescriptionCompat + 117;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        int i5 = $10 + 99;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (isstopped.read < cArr.length) {
            cArr3[0] = cArr[isstopped.read];
            cArr3[1] = cArr[isstopped.read + 1];
            int i7 = 58224;
            int i8 = 0;
            while (i8 < 16) {
                int i9 = $10 + 85;
                $11 = i9 % 128;
                int i10 = i9 % i3;
                char c = cArr3[1];
                char c2 = cArr3[0];
                int i11 = (c2 + i7) ^ ((c2 << 4) + ((char) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ 1193402106669854891L)));
                int i12 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(AudioAttributesImplApi26Parcelizer);
                    objArr2[i3] = Integer.valueOf(i12);
                    objArr2[1] = Integer.valueOf(i11);
                    objArr2[0] = Integer.valueOf(c);
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.alpha(0) + 1504, 20 - TextUtils.indexOf((CharSequence) "", '0'), 1322448859, false, $$i(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) AudioAttributesImplApi21Parcelizer) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(MediaBrowserCompatItemReceiver)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 1505, ExpandableListView.getPackedPositionGroup(0L) + 21, 1322448859, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    int i13 = $10 + 91;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    i3 = 2;
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
                i2 = 2;
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 9016, 58 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1950993821, false, "D", new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            i3 = i2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = RemoteActionCompatParcelizer;
        int i4 = -470782045;
        long j = 0;
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $10 + 3;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i2])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(i4);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)) + 43694), View.MeasureSpec.getSize(0) + 23297, 14 - MotionEvent.axisFromString(""), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i2++;
                    i4 = -470782045;
                    j = 0;
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
        int[] iArr5 = RemoteActionCompatParcelizer;
        if (iArr5 != null) {
            int i7 = $10 + 121;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i9 = 0;
            while (i9 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i5] = Integer.valueOf(iArr5[i9]);
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (43695 - (CdmaCellLocation.convertQuartSecToDecDegrees(i5) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i5) == 0.0d ? 0 : -1))), (TypedValue.complexToFloat(i5) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(i5) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23297, 15 - TextUtils.indexOf("", ""), -1648776394, false, "A", new Class[]{Integer.TYPE});
                }
                iArr6[i9] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                i9++;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        int i10 = i5;
        System.arraycopy(iArr5, i10, iArr4, i10, length2);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i10;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            cArr[i10] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr4);
            for (int i11 = 0; i11 < 16; i11++) {
                int i12 = $11 + 87;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i11];
                Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ExpandableListView.getPackedPositionChild(0L) + 43696), Color.red(0) + 23297, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 14, -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
            }
            int i14 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i14;
            buildremovealldownloadsintent.read ^= iArr4[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[17];
            int i15 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i16 = buildremovealldownloadsintent.read;
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
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (TextUtils.lastIndexOf("", '0') + 48195), 20125 - ((byte) KeyEvent.getModifierMetaStateMask()), 20 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            i10 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00cd  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r32) {
        /*
            Method dump skipped, instruction units count: 2242
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeIterableToIntentExtraSafe.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 95;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.read;
        if (getsubjectstat != null) {
            int i4 = MediaDescriptionCompat + 57;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            int i5 = i4 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
            if (i5 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i6 = MediaDescriptionCompat + 47;
        AudioAttributesImplBaseParcelizer = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 75;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = MediaBrowserCompatItemReceiver().af_();
        int i4 = MediaDescriptionCompat + 117;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = AudioAttributesImplBaseParcelizer + 17;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        if (this.write == null) {
            synchronized (this.AudioAttributesCompatParcelizer) {
                if (this.write == null) {
                    this.write = AudioAttributesImplApi21Parcelizer();
                }
            }
        }
        return this.write;
    }

    protected final void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        if (this.IconCompatParcelizer) {
            return;
        }
        int i2 = MediaDescriptionCompat + 91;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = true;
        int i4 = AudioAttributesImplBaseParcelizer + 61;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 59;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = AudioAttributesImplBaseParcelizer + 35;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 76 / 0;
        }
        return RemoteActionCompatParcelizer2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeIterableToIntentExtraSafe.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c4  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeIterableToIntentExtraSafe.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:162:0x0a6e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0aba  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0b12  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0d9b  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0e83  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0ed1  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0f8b  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x1213  */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r34) {
        /*
            Method dump skipped, instruction units count: 5512
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeIterableToIntentExtraSafe.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 57;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
    }
}
