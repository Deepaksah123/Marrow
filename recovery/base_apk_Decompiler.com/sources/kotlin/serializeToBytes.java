package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class serializeToBytes extends addObserverForBackInvoker implements SubjectStat {
    private getSubjectStat IconCompatParcelizer;
    private volatile isHighlighted read;
    private static final byte[] $$c = {91, -118, -51, -87};
    private static final int $$f = 232;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {79, -100, -79, 21, -70, 71, -5, -27, 7, -10, -14, 6, -20, 14, 3, -3, 0, -20, -41, 29, 12, -16, 1, -6, -48, 39, -7, -2, -20, 14, -41, 12, 12, -20, -3, 2, -8, 12, -26, 8, -70, 26, 19, -6, 0, -13, -35, 39, -16, -4, -7, -18, 14, -10, -4, 5, -34, 14, 4, -15, -4, 8, -18, 8, -52, 39, -16, -4, -7, -27, 15, 18, -39, 6, 6, 4, -21, 9, -18, -9, -2};
    private static final int $$h = 84;
    private static final byte[] $$a = {104, 109, 121, 73, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 103;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int MediaDescriptionCompat = 1;
    private static char AudioAttributesCompatParcelizer = 10173;
    private static char MediaBrowserCompatItemReceiver = 58287;
    private static char AudioAttributesImplApi26Parcelizer = 56076;
    private static char AudioAttributesImplBaseParcelizer = 58385;
    private static int[] AudioAttributesImplApi21Parcelizer = {1423179414, -2010819547, 540038165, -785097958, 1900269081, 875413155, 1511505355, 823760175, 775871335, -1373096843, 2051082329, 1044921294, -1281789397, -192205069, 1492697990, -769752615, 83071320, -241266202};
    private final Object RemoteActionCompatParcelizer = new Object();
    private boolean write = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(int r7, byte r8, short r9) {
        /*
            int r8 = r8 * 2
            int r8 = 1 - r8
            int r7 = r7 * 2
            int r7 = 122 - r7
            byte[] r0 = kotlin.serializeToBytes.$$c
            int r9 = r9 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L29
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            int r9 = r9 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L24:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r9 = -r9
            int r7 = r7 + r9
            r9 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeToBytes.$$i(int, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 190 - r8
            int r0 = r6 + 4
            int r7 = r7 + 65
            byte[] r1 = kotlin.serializeToBytes.$$a
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r6
            r7 = r8
            r3 = r2
            goto L2a
        L13:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L17:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r7 = r7 + 1
            int r3 = r3 + 1
            r4 = r1[r7]
        L2a:
            int r8 = r8 + r4
            int r8 = r8 + (-1)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeToBytes.c(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 82
            int r0 = r6 + 4
            int r7 = r7 + 4
            byte[] r1 = kotlin.serializeToBytes.$$g
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L21:
            r4 = r1[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r3 = r3 + r7
            int r7 = r8 + 1
            int r8 = r3 + 5
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeToBytes.d(int, int, short, java.lang.Object[]):void");
    }

    serializeToBytes() {
        AudioAttributesImplApi26Parcelizer();
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.serializeToBytes.4
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                serializeToBytes.this.AudioAttributesImplApi21Parcelizer();
            }
        });
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 83;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void MediaBrowserCompatCustomActionResultReceiver() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.serializeToBytes.MediaBrowserCompatCustomActionResultReceiver
            int r1 = r1 + 45
            int r2 = r1 % 128
            kotlin.serializeToBytes.MediaDescriptionCompat = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L23
            o.isHighlighted r1 = r3.AudioAttributesImplBaseParcelizer()
            o.getSubjectStat r1 = r1.write()
            r3.IconCompatParcelizer = r1
            boolean r1 = r1.RemoteActionCompatParcelizer()
            r2 = 65
            int r2 = r2 / 0
            if (r1 == 0) goto L3c
            goto L33
        L23:
            o.isHighlighted r1 = r3.AudioAttributesImplBaseParcelizer()
            o.getSubjectStat r1 = r1.write()
            r3.IconCompatParcelizer = r1
            boolean r1 = r1.RemoteActionCompatParcelizer()
            if (r1 == 0) goto L3c
        L33:
            o.getSubjectStat r1 = r3.IconCompatParcelizer
            o.withFieldVisibility r3 = r3.getDefaultViewModelCreationExtras()
            r1.IconCompatParcelizer(r3)
        L3c:
            int r3 = kotlin.serializeToBytes.MediaDescriptionCompat
            int r3 = r3 + 9
            int r1 = r3 % 128
            kotlin.serializeToBytes.MediaBrowserCompatCustomActionResultReceiver = r1
            int r3 = r3 % r0
            if (r3 != 0) goto L48
            return
        L48:
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeToBytes.MediaBrowserCompatCustomActionResultReceiver():void");
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        int i5 = 0;
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        while (isstopped.read < cArr.length) {
            cArr3[i5] = cArr[isstopped.read];
            cArr3[1] = cArr[isstopped.read + 1];
            int i6 = 58224;
            int i7 = i5;
            while (i7 < 16) {
                int i8 = $11 + 105;
                $10 = i8 % 128;
                int i9 = i8 % i3;
                char c = cArr3[1];
                char c2 = cArr3[i5];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) AudioAttributesImplApi26Parcelizer) ^ 1193402106669854891L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(AudioAttributesImplBaseParcelizer);
                    objArr2[i3] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i5] = Integer.valueOf(c);
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        char cIndexOf = (char) TextUtils.indexOf("", "");
                        int iIndexOf = 1503 - TextUtils.indexOf((CharSequence) "", '0');
                        int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 22;
                        byte b = (byte) i5;
                        byte b2 = b;
                        String str$$i = $$i(b, b2, (byte) (b2 - 1));
                        Class[] clsArr = new Class[4];
                        clsArr[i5] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objRemoteActionCompatParcelizer = startForeground.read(cIndexOf, iIndexOf, modifierMetaStateMask, 1322448859, false, str$$i, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) AudioAttributesCompatParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(MediaBrowserCompatItemReceiver)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) View.combineMeasuredStates(0, 0), 1504 - TextUtils.indexOf("", "", 0), TextUtils.indexOf((CharSequence) "", '0') + 22, 1322448859, false, $$i(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i12 = $10 + 13;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr3 = cArr4;
                    i3 = 2;
                    i5 = 0;
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
                i2 = 2;
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 9016, 58 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1950993821, false, "D", new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            i3 = i2;
            cArr3 = cArr5;
            i5 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void b(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2;
        int i3 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = AudioAttributesImplApi21Parcelizer;
        int i4 = 43695;
        int i5 = -470782045;
        int i6 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i7 = $10 + 101;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int i9 = 0;
            while (i9 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i9])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (i4 - Drawable.resolveOpacity(0, 0)), 23298 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 15 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr4[i9] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i9++;
                    i4 = 43695;
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
        int[] iArr6 = AudioAttributesImplApi21Parcelizer;
        if (iArr6 != null) {
            int i10 = $10 + 47;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i2 = 0;
            }
            while (i2 < length) {
                int i11 = $11 + 121;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i6] = Integer.valueOf(iArr6[i2]);
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(i5);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 43694), 23296 - (ExpandableListView.getPackedPositionForChild(i6, i6) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i6, i6) == 0L ? 0 : -1)), Color.red(i6) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr2[i2] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    i2--;
                } else {
                    try {
                        Object[] objArr4 = {Integer.valueOf(iArr6[i2])};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-470782045);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (43694 - MotionEvent.axisFromString("")), 23297 - (ViewConfiguration.getFadingEdgeLength() >> 16), 15 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1648776394, false, "A", new Class[]{Integer.TYPE});
                        }
                        iArr2[i2] = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                        i2++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i5 = -470782045;
                i6 = 0;
            }
            iArr6 = iArr2;
        }
        int i12 = i6;
        System.arraycopy(iArr6, i12, iArr5, i12, length3);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i12;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            cArr[i12] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr5);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[i13];
                Object[] objArr5 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (43695 - KeyEvent.normalizeMetaState(0)), 23297 - View.combineMeasuredStates(0, 0), 15 - Gravity.getAbsoluteGravity(0, 0), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
                i13++;
            }
            int i15 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i15;
            buildremovealldownloadsintent.read ^= iArr5[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[17];
            int i16 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i17 = buildremovealldownloadsintent.read;
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
                objRemoteActionCompatParcelizer5 = startForeground.read((char) (48193 - TextUtils.indexOf((CharSequence) "", '0', 0)), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20126, 20 - (Process.myTid() >> 22), 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            int i18 = $11 + 49;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            i12 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0098  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r31) {
        /*
            Method dump skipped, instruction units count: 2198
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeToBytes.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
      0x0021: PHI (r3v2 o.getSubjectStat) = (r3v1 o.getSubjectStat), (r3v7 o.getSubjectStat) binds: [B:8:0x001f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDestroy() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.serializeToBytes.MediaBrowserCompatCustomActionResultReceiver
            int r1 = r1 + 35
            int r2 = r1 % 128
            kotlin.serializeToBytes.MediaDescriptionCompat = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1a
            super.onDestroy()
            o.getSubjectStat r3 = r3.IconCompatParcelizer
            r1 = 50
            int r1 = r1 / 0
            if (r3 == 0) goto L24
            goto L21
        L1a:
            super.onDestroy()
            o.getSubjectStat r3 = r3.IconCompatParcelizer
            if (r3 == 0) goto L24
        L21:
            r3.AudioAttributesCompatParcelizer()
        L24:
            int r3 = kotlin.serializeToBytes.MediaDescriptionCompat
            int r3 = r3 + 23
            int r1 = r3 % 128
            kotlin.serializeToBytes.MediaBrowserCompatCustomActionResultReceiver = r1
            int r3 = r3 % r0
            if (r3 != 0) goto L30
            return
        L30:
            r3 = 0
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeToBytes.onDestroy():void");
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 99;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        if (i3 == 0) {
            ishighlightedAudioAttributesImplBaseParcelizer.af_();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objAf_ = ishighlightedAudioAttributesImplBaseParcelizer.af_();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 69;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 49;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return ishighlighted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        if (this.read == null) {
            synchronized (this.RemoteActionCompatParcelizer) {
                if (this.read == null) {
                    this.read = MediaBrowserCompatItemReceiver();
                }
            }
        }
        return this.read;
    }

    protected final void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 17;
        int i3 = i2 % 128;
        MediaBrowserCompatCustomActionResultReceiver = i3;
        int i4 = i2 % 2;
        if (this.write) {
            return;
        }
        int i5 = i3 + 99;
        MediaDescriptionCompat = i5 % 128;
        int i6 = i5 % 2;
        this.write = true;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 77;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 41;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        throw null;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 83, new int[]{41656350, -575994691, -61320491, -196101416, -827882417, 1688230436, 2114231348, -1757586865, -1368960845, 877239631, -2056303134, -1016618390, -1613760061, 1433637544}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 17, new int[]{254668918, 1308241177, 683796504, -548616436, 327341782, 2049112745, -1068756516, 712612091, -227561222, -1909379610}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = MediaDescriptionCompat + 123;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            if (i2 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i3 = MediaBrowserCompatCustomActionResultReceiver + 35;
            MediaDescriptionCompat = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (KeyEvent.keyCodeFromString("") + 4535), Color.alpha(0) + 6054, Color.argb(0, 0, 0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 6030 - KeyEvent.normalizeMetaState(0), 23 - ImageFormat.getBitsPerPixel(0), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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
        super.onResume();
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 31;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            int i4 = MediaDescriptionCompat + 1;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 22, new int[]{41656350, -575994691, -61320491, -196101416, -827882417, 1688230436, 2114231348, -1757586865, -1368960845, 877239631, -2056303134, -1016618390, -1613760061, 1433637544}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 14, new int[]{254668918, 1308241177, 683796504, -548616436, 327341782, 2049112745, -1068756516, 712612091, -227561222, -1909379610}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i6 = MediaDescriptionCompat + 27;
                MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
                int i7 = i6 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i8 = MediaDescriptionCompat + 79;
            MediaBrowserCompatCustomActionResultReceiver = i8 % 128;
            try {
                if (i8 % 2 != 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - TextUtils.indexOf("", "", 0, 0)), 6054 - TextUtils.indexOf("", ""), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getCapsMode("", 0, 0), 6030 - (ViewConfiguration.getFadingEdgeLength() >> 16), 25 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -861814097, false, "read", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    obj.hashCode();
                    throw null;
                }
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (4535 - (ViewConfiguration.getWindowTouchSlop() >> 8)), TextUtils.getOffsetBefore("", 0) + 6054, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) TextUtils.getTrimmedLength(""), Color.red(0) + 6030, 24 - (ViewConfiguration.getScrollBarSize() >> 8), -861814097, false, "read", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke2, objArr4);
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
    /* JADX WARN: Removed duplicated region for block: B:184:0x09e0 A[Catch: all -> 0x0273, TryCatch #12 {all -> 0x0273, blocks: (B:182:0x09da, B:184:0x09e0, B:185:0x0a0b, B:221:0x0e24, B:223:0x0e2a, B:224:0x0e52, B:257:0x11df, B:259:0x11e5, B:260:0x1205, B:238:0x0ff4, B:240:0x1017, B:241:0x1066, B:71:0x03d9, B:73:0x03df, B:74:0x040b, B:22:0x00cd, B:24:0x00d3, B:25:0x00fa, B:27:0x01e0, B:29:0x0211, B:30:0x026d), top: B:305:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0aec  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0ba5  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0e02  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0ee5  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0f34  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0f86  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x11c1  */
    /* JADX WARN: Removed duplicated region for block: B:321:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0092  */
    /* JADX WARN: Type inference failed for: r25v10, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r25v14 */
    /* JADX WARN: Type inference failed for: r25v15 */
    /* JADX WARN: Type inference failed for: r25v26 */
    /* JADX WARN: Type inference failed for: r25v27 */
    /* JADX WARN: Type inference failed for: r25v28 */
    /* JADX WARN: Type inference failed for: r25v29 */
    /* JADX WARN: Type inference failed for: r25v31 */
    /* JADX WARN: Type inference failed for: r25v46 */
    /* JADX WARN: Type inference failed for: r25v47 */
    /* JADX WARN: Type inference failed for: r25v48 */
    /* JADX WARN: Type inference failed for: r25v49 */
    /* JADX WARN: Type inference failed for: r25v50 */
    /* JADX WARN: Type inference failed for: r25v8 */
    /* JADX WARN: Type inference failed for: r25v9 */
    /* JADX WARN: Type inference failed for: r8v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v40 */
    /* JADX WARN: Type inference failed for: r8v51 */
    /* JADX WARN: Type inference failed for: r8v52 */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r34) {
        /*
            Method dump skipped, instruction units count: 5420
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeToBytes.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 93;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 43;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }
}
