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
import android.view.MotionEvent;
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
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setDisplayInterval extends addObserverForBackInvoker implements SubjectStat {
    private final Object AudioAttributesCompatParcelizer;
    private getSubjectStat IconCompatParcelizer;
    private boolean read;
    private volatile isHighlighted write;
    private static final byte[] $$c = {TarConstants.LF_CONTIG, -94, -3, -122};
    private static final int $$f = TsExtractor.TS_PACKET_SIZE;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {116, TarConstants.LF_GNUTYPE_SPARSE, -5, 59, 59, -43, -39, 13, -25, -7, -4, 40, -57, 15, -8, -17, -10, 5, -12, -5, 27, -26, -21, -6, 5, -19, -25, -14, -8, -11, 9, 30, -40, -23, 5, -12, -5, 37, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19, -18, -4, 57, -63, -14, -6, 2, -11, 1, TarConstants.LF_LINK, -57, -19, 4, -20, -3, 0, -1, TarConstants.LF_NORMAL, -69, 6, -25, 9, -19, 3, 2, -17, 56, -59, -11, -7, -13, 60, -27, -43, -7, -13, 70, -19, -1, 3, -17, 9};
    private static final int $$h = 41;
    private static final byte[] $$a = {62, -25, -124, -119, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 93;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int MediaMetadataCompat = 1;
    private static int[] RemoteActionCompatParcelizer = {97138018, -1578303604, 1176633402, 202251922, -399339429, -1276784275, -1920151505, -1902031696, -468079392, -1911431035, -298510271, 1455046743, -1665656179, -2132327897, 692685130, 1128159830, -1706815807, 1810508411};
    private static char AudioAttributesImplApi21Parcelizer = 52062;
    private static char AudioAttributesImplBaseParcelizer = 36534;
    private static char AudioAttributesImplApi26Parcelizer = 17644;
    private static char MediaBrowserCompatCustomActionResultReceiver = 48426;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(int r7, int r8, short r9) {
        /*
            int r9 = r9 * 4
            int r9 = 122 - r9
            int r8 = r8 * 2
            int r8 = 1 - r8
            int r7 = r7 + 4
            byte[] r0 = kotlin.setDisplayInterval.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2b
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r7 = r7 + 1
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = r7 + r3
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setDisplayInterval.$$i(int, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.setDisplayInterval.$$a
            int r7 = r7 + 65
            int r1 = r5 + 4
            int r6 = 190 - r6
            byte[] r1 = new byte[r1]
            int r5 = r5 + 3
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r5
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r3 = r0[r6]
        L26:
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setDisplayInterval.c(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 119 - r7
            byte[] r0 = kotlin.setDisplayInterval.$$g
            int r8 = 91 - r8
            int r1 = r6 + 5
            byte[] r1 = new byte[r1]
            int r6 = r6 + 4
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r7 = r8
            r4 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L28:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-6)
            int r7 = r7 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setDisplayInterval.d(int, byte, byte, java.lang.Object[]):void");
    }

    setDisplayInterval() {
        this.AudioAttributesCompatParcelizer = new Object();
        this.read = false;
        MediaBrowserCompatCustomActionResultReceiver();
    }

    setDisplayInterval(byte b) {
        super(R.layout.activity_score_container);
        this.AudioAttributesCompatParcelizer = new Object();
        this.read = false;
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.setDisplayInterval.5
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                setDisplayInterval.this.AudioAttributesImplApi21Parcelizer();
            }
        });
        int i2 = MediaBrowserCompatItemReceiver + 71;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 103;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        getSubjectStat getsubjectstatWrite = MediaBrowserCompatItemReceiver().write();
        this.IconCompatParcelizer = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            int i4 = MediaBrowserCompatItemReceiver + 13;
            MediaMetadataCompat = i4 % 128;
            int i5 = i4 % 2;
            this.IconCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            if (i5 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        while (isstopped.read < cArr.length) {
            int i4 = $10 + 105;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr3[i3] = cArr[isstopped.read];
            cArr3[1] = cArr[isstopped.read + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 113;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) AudioAttributesImplApi26Parcelizer) ^ 1193402106669854891L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(i3, i3);
                        int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1504;
                        int i12 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 20;
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        String str$$i = $$i(b, b2, b2);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objRemoteActionCompatParcelizer = startForeground.read(cMakeMeasureSpec, windowTouchSlop, i12, 1322448859, false, str$$i, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) AudioAttributesImplApi21Parcelizer) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(AudioAttributesImplBaseParcelizer)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), KeyEvent.getDeadChar(0, 0) + 1504, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 22, 1322448859, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
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
                objRemoteActionCompatParcelizer3 = startForeground.read((char) KeyEvent.getDeadChar(0, 0), 9016 - Color.red(0), 58 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1950993821, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i13 = $10 + 87;
        $11 = i13 % 128;
        if (i13 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = RemoteActionCompatParcelizer;
        int i3 = -470782045;
        int i4 = 43695;
        int i5 = 0;
        if (iArr2 != null) {
            int i6 = $10 + 17;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 53;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(i3);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (i4 - TextUtils.indexOf("", "", 0)), Color.blue(0) + 23297, TextUtils.indexOf("", "") + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i8++;
                    i3 = -470782045;
                    i4 = 43695;
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
        if (iArr5 != null) {
            int i11 = $11 + 105;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i5] = Integer.valueOf(iArr5[i13]);
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (Color.green(i5) + 43695), 23297 - (ViewConfiguration.getScrollDefaultDelay() >> 16), '?' - AndroidCharacter.getMirror('0'), -1648776394, false, "A", new Class[]{Integer.TYPE});
                }
                iArr6[i13] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                i13++;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        int i14 = i5;
        System.arraycopy(iArr5, i14, iArr4, i14, length2);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i14;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            cArr[i14] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr4);
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                int i17 = $10 + 93;
                $11 = i17 % 128;
                int i18 = i17 % 2;
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i15];
                Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.indexOf("", "", 0) + 43695), 23297 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 15 - Color.alpha(0), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
                i15++;
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
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (48194 - Color.argb(0, 0, 0, 0)), 20126 - Color.blue(0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 20, 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            i14 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 15;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 96, new int[]{1033321692, -201214595, 837148050, -658791193, 1749472544, 940447662, 1572361177, -1012585534, -869532827, -2094405934}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        a((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 4, new int[]{1729241598, 911864684, -1853998591, -1206866739}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i4 = MediaMetadataCompat + 101;
                MediaBrowserCompatItemReceiver = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr4 = new Object[1];
                a((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 25, new int[]{1033321692, -201214595, 837148050, -658791193, -778466094, 1598812454, 2003991658, -2054537938, 1243688599, 1774767568, 459678813, 493353850, -1275487558, -337324802}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                a((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 17, new int[]{578573684, -12463636, -581152600, -736436306, 1961191888, -1125086248, 1166645243, -1055114772, -1531681933, -225755831}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i6 = MediaMetadataCompat + 109;
                MediaBrowserCompatItemReceiver = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getScrollBarSize() >> 8)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6055, 42 - Color.alpha(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 44, new char[]{8219, 64364, 22036, 40680, 14243, 29238, 11866, 25182, 52962, 8507, 24537, 51707, 30634, 41865, 33349, 36343, 23077, 7461, 63243, 58223, 60821, 30071, 30428, 38273, 27570, 10424, 59709, 62124, 45450, 28969, 1557, 29342, 52514, 62995, 29787, 39319, 26759, 31971, 16849, 24871, 31070, 32905, 65135, 19810, 16212, 41838, 19056, 7882}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b(64 - (ViewConfiguration.getLongPressTimeout() >> 16), new char[]{38107, 26876, 63243, 58223, 5450, 46640, 39036, 26700, 39161, 60818, 54838, 4940, 30090, 24406, 10812, 16765, 16238, 12931, 27737, 29808, 30862, 41694, 12643, 38157, 25182, 50611, 56443, 26998, 63450, 4754, 1557, 29342, 2515, 34675, 59903, 1376, 48078, 14744, 54022, 23304, 1188, 8553, 34416, 36053, 54999, 41617, 7357, 15754, 26129, 46007, 11360, 3700, 27100, 63738, 6060, 4146, 27570, 10424, 5104, 43363, 61423, 34903, 61059, 14675}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) + 15, new char[]{25182, 50611, 5566, 34452, 34213, 39705, 19509, 7857, 21720, 22145, 13142, 44560, 54551, 36803, 21720, 22145, 54551, 36803, 25182, 50611, 18829, 19675, 27422, 32166, 10680, 65166, 19129, 21163, 2948, 46065, 51376, 34328, 59709, 62124, 53930, 58030, 16238, 12931, 22218, 22716, 34213, 39705, 47010, 5411, 2346, 46972, 27513, 40100, 32838, 62283, 51451, 36920, 47125, 20547, 2076, 54849, 58674, 17140, 43164, 2493, 55713, 23741, 30862, 41694}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 66, new char[]{30516, 35467, 52392, 25251, 19629, 15332, 13638, 11392, 12258, 26663, 53114, 19412, 54749, 38283, 45673, 28626, 22840, 22545, 18787, 55683, 3900, 55490, 22637, 24471, 57019, 18065, 9854, 55751, 15041, 28551, 48526, 53193, 1621, 24469, 6066, 23359, 57477, 38507, 1621, 24469, 22637, 24471, 33671, 4214, 10143, 7615, 24846, 22514, 9807, 16352, 23499, 26764, 61934, 11878, 31340, 27407, 33510, 13744, 17708, 61841, 49912, 26309, 44877, 49402, 17501, 24100, 55287, 58977}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 4, new int[]{-1498482217, 2084764396, -416885708, -422837533}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 1, new char[]{18829, 19675, 16849, 24871, 319, 65254, 59956, 12401, 15101, 16005, 50088, 38875, 12975, 22638, 52962, 8507, 35469, 9195, 33348, 61014, 44541, 58557, 24223, 40382, 38332, 51156, 41387, 32809, 53930, 58030, 46948, 62966, 29300, 3273, 49539, 64410}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 6029 - TextUtils.lastIndexOf("", '0', 0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 13183);
            int packedPositionType = 1649 - ExpandableListView.getPackedPositionType(0L);
            int iIndexOf = TextUtils.indexOf("", "", 0) + 26;
            byte b = (byte) 40;
            Object[] objArr13 = new Object[1];
            c(b, (short) (b | 147), (byte) (-$$a[140]), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(maximumFlingVelocity, packedPositionType, iIndexOf, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char threadPriority = (char) (13183 - ((Process.getThreadPriority(0) + 20) >> 6));
                int i8 = 1650 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                int iLastIndexOf = 25 - TextUtils.lastIndexOf("", '0', 0);
                Object[] objArr14 = new Object[1];
                c((byte) (-$$a[8]), (short) 144, r2[5], objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(threadPriority, i8, iLastIndexOf, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            a((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 15, new int[]{648416784, -884301042, 924302917, -1342396198, -109173305, 2144166854, -1010341192, 1281887898}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a(View.MeasureSpec.getSize(0) + 16, new int[]{2062434870, 558246893, 1156050751, 1652604439, 51485518, -1111690745, 761245994, -17421600}, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, 724969872};
                byte[] bArr = $$g;
                Object[] objArr18 = new Object[1];
                d((byte) (-bArr[53]), (byte) (-bArr[14]), (byte) 87, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                d((byte) (-bArr[33]), bArr[37], (byte) 65, objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 13183);
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1649;
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26;
                    Object[] objArr20 = new Object[1];
                    c((byte) (-$$a[8]), (short) 144, r6[5], objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(offsetAfter, iCombineMeasuredStates, scrollBarFadeDuration, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 18, new char[]{56644, 18823, 8452, 8108, 35111, 65376, 1071, 65139, 50263, 40580, 63248, 61337, 2235, 3288, 59666, 28634, 63154, 10504, 8093, 41258, 21212, 3326}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 11, new int[]{-573859565, -1790564581, 2049537640, 169575276, -309261164, -1234517300, 831452361, 1354023849}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char c = (char) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13183);
                        int iAxisFromString = MotionEvent.axisFromString("") + 1650;
                        int iMyPid = 26 - (Process.myPid() >> 22);
                        Object[] objArr23 = new Object[1];
                        c((byte) (-$$a[8]), (short) 111, r7[5], objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(c, iAxisFromString, iMyPid, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "") + 13183);
                        int i9 = 1650 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 26;
                        byte b2 = (byte) 40;
                        Object[] objArr24 = new Object[1];
                        c(b2, (short) (b2 | 147), (byte) (-$$a[140]), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(cIndexOf, i9, scrollDefaultDelay, -133433128, false, (String) objArr24[0], null);
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
        int i10 = ((int[]) objArr[3])[0];
        int i11 = ((int[]) objArr[2])[0];
        if (i11 != i10) {
            long j = -1;
            long j2 = ((long) (i11 ^ i10)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (Color.alpha(0) + 4535), 6053 - ImageFormat.getBitsPerPixel(0), Gravity.getAbsoluteGravity(0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i12 = MediaBrowserCompatItemReceiver + 73;
            int i13 = i12 % 128;
            MediaMetadataCompat = i13;
            int i14 = i12 % 2;
            int i15 = i13 + 49;
            MediaBrowserCompatItemReceiver = i15 % 128;
            int i16 = i15 % 2;
            try {
                Object[] objArr25 = {-1712439504, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getLongPressTimeout() >> 16), 6029 - TextUtils.lastIndexOf("", '0', 0), TextUtils.getOffsetBefore("", 0) + 24);
                Object[] objArr26 = new Object[1];
                d((byte) (-$$g[33]), r1[37], (byte) 65, objArr26);
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
        int i = 2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.IconCompatParcelizer;
        if (getsubjectstat != null) {
            int i2 = MediaMetadataCompat + 85;
            MediaBrowserCompatItemReceiver = i2 % 128;
            int i3 = i2 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i4 = MediaMetadataCompat + 47;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 61 / 0;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 25;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = MediaBrowserCompatItemReceiver().af_();
        int i4 = MediaMetadataCompat + 85;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatItemReceiver + 87;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        if (this.write == null) {
            synchronized (this.AudioAttributesCompatParcelizer) {
                if (this.write == null) {
                    this.write = AudioAttributesImplBaseParcelizer();
                }
            }
        }
        return this.write;
    }

    protected final void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 59;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 != 0) {
            if (!this.read) {
                this.read = true;
                int i3 = MediaMetadataCompat + 5;
                MediaBrowserCompatItemReceiver = i3 % 128;
                int i4 = i3 % 2;
            }
            int i5 = MediaMetadataCompat + 77;
            MediaBrowserCompatItemReceiver = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        throw null;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 113;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = MediaMetadataCompat + 113;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return RemoteActionCompatParcelizer2;
        }
        throw null;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = MediaMetadataCompat + 1;
            MediaBrowserCompatItemReceiver = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(26 - TextUtils.getCapsMode("", 0, 0), new int[]{1033321692, -201214595, 837148050, -658791193, -778466094, 1598812454, 2003991658, -2054537938, 1243688599, 1774767568, 459678813, 493353850, -1275487558, -337324802}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 14, new int[]{578573684, -12463636, -581152600, -736436306, 1961191888, -1125086248, 1166645243, -1055114772, -1531681933, -225755831}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = MediaMetadataCompat + 57;
            MediaBrowserCompatItemReceiver = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (KeyEvent.getDeadChar(0, 0) + 4535), 6055 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 42 - TextUtils.indexOf("", "", 0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.blue(0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 6030, Color.alpha(0) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    int i5 = 98 / 0;
                } else {
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (4534 - TextUtils.indexOf((CharSequence) "", '0', 0)), 6054 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 42 - TextUtils.getOffsetBefore("", 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) TextUtils.getCapsMode("", 0, 0), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6030, (Process.myTid() >> 22) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 45;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 16, new int[]{1033321692, -201214595, 837148050, -658791193, -778466094, 1598812454, 2003991658, -2054537938, 1243688599, 1774767568, 459678813, 493353850, -1275487558, -337324802}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 17, new int[]{578573684, -12463636, -581152600, -736436306, 1961191888, -1125086248, 1166645243, -1055114772, -1531681933, -225755831}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = MediaBrowserCompatItemReceiver + 45;
            MediaMetadataCompat = i4 % 128;
            int i5 = i4 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i6 = MediaMetadataCompat + 15;
            MediaBrowserCompatItemReceiver = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.getTrimmedLength("") + 4535), Drawable.resolveOpacity(0, 0) + 6054, 41 - TextUtils.lastIndexOf("", '0'), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (Process.myPid() >> 22), 6030 - TextUtils.indexOf("", "", 0), 24 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -861814097, false, "read", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:122:0x083f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0881 A[Catch: all -> 0x094b, TryCatch #7 {all -> 0x094b, blocks: (B:128:0x087b, B:130:0x0881, B:131:0x08b1), top: B:269:0x087b, outer: #5 }] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r31) {
        /*
            Method dump skipped, instruction units count: 5352
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setDisplayInterval.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 59;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
        int i4 = MediaMetadataCompat + 63;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
    }
}
