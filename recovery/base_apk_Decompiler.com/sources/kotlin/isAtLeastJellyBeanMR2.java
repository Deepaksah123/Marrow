package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class isAtLeastJellyBeanMR2 extends addObserverForBackInvoker implements SubjectStat {
    private static int $10 = 0;
    private static int $11 = 1;
    private getSubjectStat AudioAttributesCompatParcelizer;
    private volatile isHighlighted write;
    private static final byte[] $$g = {112, -40, -93, -59, -51, 71, 12, 29, -36, 59, 3, 35, -71, 43, 66, -3, 19, 20, -32, 65, 14, 12, 5, 7, 33, 13, -1, 28, -28, TarConstants.LF_SYMLINK, 17, 10, -28, 45, 32, 0, -7, 31, 31, -1, 16, 21, 11, 31, -7, 27, 9, 5, 25, -1, 33, 22, 16, 19, -1, -22, TarConstants.LF_NORMAL, 31, 3, 20, 13, -29, 58, 12, 17, -1, 33, -22, 31, 31, -1, 16, 21, 11, 31, -7, 27, -51, 71, 12, 29, -37, TarConstants.LF_LINK, 20, 25, 12, 15, -1, 13, -1, 41, 17, 15, 12, 1, 10, 26, -25, TarConstants.LF_CONTIG, 17, 9, 2, 33};
    private static final int $$h = 186;
    private static final byte[] $$a = {27, -119, -113, 73, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 79;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static int[] RemoteActionCompatParcelizer = {1028401208, 6203440, -482455401, 2013510292, -215800244, -548803882, 189841450, -1504313990, 1303503647, 1687114582, -1956979959, -1142106886, 1867568014, -1700764208, -140742920, 1367920836, 802279121, -1886308680};
    private static char[] MediaBrowserCompatItemReceiver = {6471, 6477, 6476, 6470, 6522, 6427, 6431, 6507, 6425, 6467, 6525, 6472, 6429, 6465, 6490, 6474, 6405, 6417, 6430, 6492, 6481, 6468, 6424, 6406, 6426, 6488, 6473, 6416, 6475, 6428, 6469, 6523, 6491, 6478, 6479, 6834};
    private static char AudioAttributesImplApi21Parcelizer = 11444;
    private final Object read = new Object();
    private boolean IconCompatParcelizer = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 44 - r6
            byte[] r0 = kotlin.isAtLeastJellyBeanMR2.$$a
            int r7 = r7 + 4
            int r8 = r8 + 65
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r8
            r5 = r2
            r8 = r6
            goto L25
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r7]
        L25:
            int r8 = r8 + r3
            int r8 = r8 + (-1)
            r3 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isAtLeastJellyBeanMR2.c(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = kotlin.isAtLeastJellyBeanMR2.$$g
            int r9 = 43 - r9
            int r7 = r7 + 82
            int r8 = 76 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L28
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
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L28:
            int r8 = r8 + r7
            int r7 = r8 + (-14)
            r8 = r3
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isAtLeastJellyBeanMR2.d(short, int, int, java.lang.Object[]):void");
    }

    isAtLeastJellyBeanMR2() {
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.isAtLeastJellyBeanMR2.4
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                isAtLeastJellyBeanMR2.this.AudioAttributesImplApi21Parcelizer();
            }
        });
        int i2 = AudioAttributesImplApi26Parcelizer + 75;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 53;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        this.AudioAttributesCompatParcelizer = AudioAttributesImplBaseParcelizer().write();
        if (!(!r1.RemoteActionCompatParcelizer())) {
            int i4 = AudioAttributesImplApi26Parcelizer + 125;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            if (i4 % 2 == 0) {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                int i5 = 82 / 0;
            } else {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            }
            int i6 = AudioAttributesImplApi26Parcelizer + 79;
            MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
            int i7 = i6 % 2;
        }
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
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(i3);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (43695 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 23297 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 16, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr3[i6] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i6++;
                    i3 = -470782045;
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
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i7 = 0;
            while (i7 < length3) {
                int i8 = $10 + 13;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr3 = new Object[1];
                    objArr3[i5] = Integer.valueOf(iArr5[i7]);
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (i4 - Gravity.getAbsoluteGravity(i5, i5)), View.resolveSizeAndState(i5, i5, i5) + 23297, 15 - KeyEvent.normalizeMetaState(i5), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr6[i7] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    i7++;
                    i4 = 43695;
                    i5 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            iArr5 = iArr6;
        }
        int i10 = i5;
        System.arraycopy(iArr5, i10, iArr4, i10, length2);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i10;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            int i11 = $11 + 89;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr4);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i13];
                Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (43695 - TextUtils.indexOf("", "")), (Process.myPid() >> 22) + 23297, 15 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
                i13++;
            }
            int i15 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i15;
            buildremovealldownloadsintent.read ^= iArr4[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[17];
            int i16 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i17 = buildremovealldownloadsintent.read;
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
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (48194 - ExpandableListView.getPackedPositionType(0L)), 20127 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 20, 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void b(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        char c;
        int length;
        char[] cArr2;
        int i3;
        int i4 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr3 = MediaBrowserCompatItemReceiver;
        long j = 0;
        Object obj2 = null;
        if (cArr3 != null) {
            int i5 = $11 + 27;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (1 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1))), (ViewConfiguration.getScrollBarSize() >> 8) + 7015, 30 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr2[i3] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i3++;
                    int i6 = $11 + 23;
                    $10 = i6 % 128;
                    if (i6 % 2 != 0) {
                        int i7 = 2 % 3;
                    }
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(AudioAttributesImplApi21Parcelizer)};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 7015 - Color.red(0), 29 - TextUtils.lastIndexOf("", '0'), -626716224, false, "o", new Class[]{Integer.TYPE});
            }
            char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
            char[] cArr4 = new char[i];
            char c2 = 5;
            if (i % 2 != 0) {
                int i8 = $11;
                int i9 = i8 + 39;
                $10 = i9 % 128;
                int i10 = i9 % 2;
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
                int i11 = i8 + 19;
                $10 = i11 % 128;
                if (i11 % 2 != 0) {
                    int i12 = 4 / 5;
                }
            } else {
                i2 = i;
            }
            if (i2 > 1) {
                int i13 = $11 + 113;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                needsstartedservice.AudioAttributesCompatParcelizer = 0;
                while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                    int i15 = $11 + 87;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                    needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                    if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                        int i17 = $11 + 125;
                        $10 = i17 % 128;
                        int i18 = i17 % 2;
                        c = c2;
                        obj = obj2;
                    } else {
                        try {
                            Object[] objArr4 = new Object[13];
                            objArr4[12] = needsstartedservice;
                            objArr4[11] = Integer.valueOf(cCharValue);
                            objArr4[10] = needsstartedservice;
                            objArr4[9] = needsstartedservice;
                            objArr4[8] = Integer.valueOf(cCharValue);
                            objArr4[7] = needsstartedservice;
                            objArr4[6] = needsstartedservice;
                            objArr4[c2] = Integer.valueOf(cCharValue);
                            objArr4[4] = needsstartedservice;
                            objArr4[3] = needsstartedservice;
                            objArr4[2] = Integer.valueOf(cCharValue);
                            objArr4[1] = needsstartedservice;
                            objArr4[0] = needsstartedservice;
                            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                            if (objRemoteActionCompatParcelizer3 == null) {
                                objRemoteActionCompatParcelizer3 = startForeground.read((char) ((Process.myPid() >> 22) + 48194), (ViewConfiguration.getTouchSlop() >> 8) + 20126, 20 - (ViewConfiguration.getPressedStateDuration() >> 16), 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                            }
                            if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                                Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                                if (objRemoteActionCompatParcelizer4 == null) {
                                    c = 5;
                                    objRemoteActionCompatParcelizer4 = startForeground.read((char) View.MeasureSpec.makeMeasureSpec(0, 0), TextUtils.lastIndexOf("", '0', 0, 0) + 19369, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 17, 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                } else {
                                    c = 5;
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                                int i19 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr3[iIntValue];
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr3[i19];
                            } else {
                                obj = null;
                                c = 5;
                                if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                                    needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                                    needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                                    int i20 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                                    int i21 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr3[i20];
                                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr3[i21];
                                } else {
                                    int i22 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                    int i23 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr3[i22];
                                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr3[i23];
                                }
                            }
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    needsstartedservice.AudioAttributesCompatParcelizer += 2;
                    obj2 = obj;
                    c2 = c;
                }
            }
            int i24 = $11 + 57;
            $10 = i24 % 128;
            if (i24 % 2 != 0) {
                int i25 = 4 / 2;
            }
            for (int i26 = 0; i26 < i; i26++) {
                cArr4[i26] = (char) (cArr4[i26] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0138  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r30) {
        /*
            Method dump skipped, instruction units count: 2365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isAtLeastJellyBeanMR2.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
      0x0021: PHI (r3v2 o.getSubjectStat) = (r3v1 o.getSubjectStat), (r3v6 o.getSubjectStat) binds: [B:8:0x001f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
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
            int r1 = kotlin.isAtLeastJellyBeanMR2.AudioAttributesImplApi26Parcelizer
            int r1 = r1 + 93
            int r2 = r1 % 128
            kotlin.isAtLeastJellyBeanMR2.MediaBrowserCompatCustomActionResultReceiver = r2
            int r1 = r1 % r0
            r2 = 61
            if (r1 != 0) goto L1a
            super.onDestroy()
            o.getSubjectStat r3 = r3.AudioAttributesCompatParcelizer
            int r1 = r2 / 0
            if (r3 == 0) goto L24
            goto L21
        L1a:
            super.onDestroy()
            o.getSubjectStat r3 = r3.AudioAttributesCompatParcelizer
            if (r3 == 0) goto L24
        L21:
            r3.AudioAttributesCompatParcelizer()
        L24:
            int r3 = kotlin.isAtLeastJellyBeanMR2.AudioAttributesImplApi26Parcelizer
            int r3 = r3 + r2
            int r1 = r3 % 128
            kotlin.isAtLeastJellyBeanMR2.MediaBrowserCompatCustomActionResultReceiver = r1
            int r3 = r3 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isAtLeastJellyBeanMR2.onDestroy():void");
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 107;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplBaseParcelizer().af_();
        int i4 = AudioAttributesImplApi26Parcelizer + 83;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return objAf_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 13;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        if (this.write == null) {
            synchronized (this.read) {
                if (this.write == null) {
                    this.write = MediaBrowserCompatItemReceiver();
                }
            }
        }
        return this.write;
    }

    protected final void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 41;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        if (this.IconCompatParcelizer) {
            return;
        }
        this.IconCompatParcelizer = true;
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 57;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 101;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = AudioAttributesImplApi26Parcelizer + 5;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return RemoteActionCompatParcelizer2;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b1  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isAtLeastJellyBeanMR2.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x007d  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 318
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isAtLeastJellyBeanMR2.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:140:0x08a1 A[Catch: all -> 0x0289, TryCatch #7 {all -> 0x0289, blocks: (B:220:0x0f07, B:222:0x0f0d, B:223:0x0f37, B:263:0x1393, B:265:0x1399, B:266:0x13bf, B:244:0x112f, B:246:0x1151, B:247:0x11a8, B:187:0x0adb, B:189:0x0ae1, B:190:0x0b09, B:138:0x089b, B:140:0x08a1, B:141:0x08ca, B:19:0x00b3, B:21:0x00b9, B:22:0x00e1, B:24:0x01fb, B:26:0x022b, B:27:0x0283), top: B:301:0x00b3 }] */
    /* JADX WARN: Removed duplicated region for block: B:164:0x09a9 A[Catch: all -> 0x0a6d, TryCatch #9 {all -> 0x0a6d, blocks: (B:162:0x0995, B:164:0x09a9, B:165:0x09db), top: B:305:0x0995, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:168:0x09ee A[Catch: all -> 0x0a63, TryCatch #2 {all -> 0x0a63, blocks: (B:166:0x09e1, B:168:0x09ee, B:169:0x0a5b), top: B:292:0x09e1, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0b9c  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0bf0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0c4b  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0ee7  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0fca  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x1016  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x10ca  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x1376  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0962 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:323:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x06f0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x073c A[Catch: all -> 0x0802, TryCatch #1 {all -> 0x0802, blocks: (B:96:0x0736, B:98:0x073c, B:99:0x0768), top: B:290:0x0736, outer: #11 }] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r40) {
        /*
            Method dump skipped, instruction units count: 5873
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isAtLeastJellyBeanMR2.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 33;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 81;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }
}
