package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class setPenAttributes extends addObserverForBackInvoker implements SubjectStat {
    private static short[] AudioAttributesImplBaseParcelizer;
    private volatile isHighlighted read;
    private getSubjectStat write;
    private static final byte[] $$l = {79, -100, -79, 21};
    private static final int $$m = 182;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {106, -113, -78, 7, -67, 21, 0, 3, 5, 32, -5, -14, -7, 0, 0, -19, 15, 17, -6, -1, -5, -15, -67, 81, -7, -11, 9, -17, 24, 10, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, 17, 6, 0, 3, -17, -38, 32, 15, -13, 4, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, -67, TarConstants.LF_CONTIG, -4, 13, -34, 25, 3, -21, 9, -44, TarConstants.LF_LINK, -17, -2, -3, 11, -15, -3, -34, 47, -5, -19, 17, -13, 4, -3, -27, 28, -81, 27, TarConstants.LF_SYMLINK, -19, 3, 4, -48, TarConstants.LF_LINK, -2, -4, -11, -9, 17, -3, -17, 12, -50, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, -15, -6, 1};
    private static final int $$k = 182;
    private static final byte[] $$d = {98, -46, 102, 39, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 91;
    private static int MediaBrowserCompatMediaItem = 0;
    private static int RatingCompat = 1;
    private static int AudioAttributesCompatParcelizer = -458613186;
    private static int AudioAttributesImplApi26Parcelizer = -819363194;
    private static int AudioAttributesImplApi21Parcelizer = -1498651725;
    private static byte[] MediaBrowserCompatItemReceiver = {86, -28, -22, -26, 16, 25, -58, -58, 95, -32, -91, 46, 31, 30, 25, -22, 18, -23, 99, 108, -125, TarConstants.LF_GNUTYPE_LONGLINK, -101, 94, 28, -29, -20, 21, 11, -60, 26, 20, -20, 18, -22, 14, 61, 12, -95, 31, 16, 44, -43, -28, -27, -30, 17, -23, 18, -72, -11, 8, -10, 35, -38, 36, -58, 57, -57, 10, -14, 39, 12, -11, -40, 35, -58, 9, 56, -60, 60, -60, -10, 60, -60, 57, -13, 11, -39, 33, -38, 11, -16, 12, -12, 13, 34, 8, -37, -16, 8, -11, 8, -10, 56, -10, -34, 35, -9, -12, -34, -16, 11, 38, -9, -37, 34, -58, -10, 58, -12, -57, 56, -91, -110, 107, 100, -126, 124, 91, -112, -47, 42, -42, 108, 99, -109, -108, 104, 87, -85, -108, 98, 95, -81, -109, 97, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -92, -98, 124, -127, 105, -109, 98, -97, 124, -127, 99, 84, -41, 108, 127, -109, -126, 126, -111, -98, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, -103, 43, -42, 98, -101, -108, 107, -112, -108, 96, 110, 101, -112, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 109, -104, -86, 110, -111, 109, 97, 98, -57, 57, -64, -64, TarConstants.LF_FIFO, 68, -23, 60, -39, 34, -22, 23, -57, -20, 56, -61, 56, -48, 20, 23, 57, -64, -27, 31, -22, 23, -21, -18, 46, -57, 59, -57, -30, 21, -23, 22, 21, 22, 60, -40, 22, 104, -55, 61, -28, 19, 61, -38, -47, 7, -51, -61, 61, -50, -63, -55, TarConstants.LF_CHR, 109, -29, -28, 30, -30, 24, -28, 28, -30, 30, -25, 109, 34, -36, -34, 33, 36, -33, 36, -38, 37, -39};
    private static char MediaBrowserCompatCustomActionResultReceiver = 13539;
    private static char MediaDescriptionCompat = 15863;
    private static char MediaMetadataCompat = 18706;
    private static char MediaBrowserCompatSearchResultReceiver = 3360;
    private final Object RemoteActionCompatParcelizer = new Object();
    private boolean IconCompatParcelizer = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(int r7, byte r8, short r9) {
        /*
            int r7 = r7 * 10
            int r7 = r7 + 112
            byte[] r0 = kotlin.setPenAttributes.$$l
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r9 = r9 * 2
            int r9 = r9 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r4 = r2
            r9 = r8
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r7 = r7 + r9
            int r9 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setPenAttributes.$$n(int, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.setPenAttributes.$$d
            int r7 = 191 - r7
            int r8 = 114 - r8
            int r1 = r6 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L28:
            int r7 = r7 + 1
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-1)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setPenAttributes.g(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = 60 - r5
            int r6 = 114 - r6
            byte[] r1 = kotlin.setPenAttributes.$$j
            int r7 = 132 - r7
            byte[] r0 = new byte[r0]
            int r5 = 59 - r5
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r0[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
        L26:
            int r6 = r6 + r4
            int r6 = r6 + 2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setPenAttributes.h(byte, short, int, java.lang.Object[]):void");
    }

    setPenAttributes() {
        AudioAttributesImplBaseParcelizer();
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.setPenAttributes.5
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                setPenAttributes.this.AudioAttributesImplApi21Parcelizer();
            }
        });
        int i2 = RatingCompat + 83;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
    }

    private void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 91;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            getSubjectStat getsubjectstatWrite = AudioAttributesImplApi26Parcelizer().write();
            this.write = getsubjectstatWrite;
            if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                this.write.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            }
            int i3 = MediaBrowserCompatMediaItem + 67;
            RatingCompat = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        getSubjectStat getsubjectstatWrite2 = AudioAttributesImplApi26Parcelizer().write();
        this.write = getsubjectstatWrite2;
        getsubjectstatWrite2.RemoteActionCompatParcelizer();
        throw null;
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        while (isstopped.read < cArr.length) {
            cArr3[i3] = cArr[isstopped.read];
            cArr3[1] = cArr[isstopped.read + 1];
            int i4 = $10 + 121;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) MediaMetadataCompat) ^ 1193402106669854891L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(MediaBrowserCompatSearchResultReceiver);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        char scrollDefaultDelay = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', i3, i3) + 1505;
                        int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 21;
                        byte b = (byte) 1;
                        byte b2 = (byte) (b - 1);
                        String str$$n = $$n(b, b2, b2);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objRemoteActionCompatParcelizer = startForeground.read(scrollDefaultDelay, iIndexOf, jumpTapTimeout, 1322448859, false, str$$n, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(MediaDescriptionCompat)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 1;
                        byte b4 = (byte) (b3 - 1);
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 1504, 21 - View.resolveSize(0, 0), 1322448859, false, $$n(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
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
                objRemoteActionCompatParcelizer3 = startForeground.read((char) Color.green(0), TextUtils.getCapsMode("", 0, 0) + 9016, 57 - TextUtils.lastIndexOf("", '0'), -1950993821, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i10 = $11 + 125;
        $10 = i10 % 128;
        if (i10 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0188  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(int r24, byte r25, int r26, int r27, short r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 679
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setPenAttributes.e(int, byte, int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0194  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r40) {
        /*
            Method dump skipped, instruction units count: 2798
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setPenAttributes.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 15;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            getSubjectStat getsubjectstat = this.write;
            if (getsubjectstat != null) {
                getsubjectstat.AudioAttributesCompatParcelizer();
            }
            int i3 = MediaBrowserCompatMediaItem + 119;
            RatingCompat = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onDestroy();
        throw null;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = RatingCompat + 119;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplApi26Parcelizer().af_();
        int i4 = RatingCompat + 75;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = RatingCompat + 101;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            return ishighlighted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        if (this.read == null) {
            synchronized (this.RemoteActionCompatParcelizer) {
                if (this.read == null) {
                    this.read = MediaBrowserCompatCustomActionResultReceiver();
                }
            }
        }
        return this.read;
    }

    protected final void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 33;
        RatingCompat = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 39 / 0;
            if (this.IconCompatParcelizer) {
                return;
            }
        } else if (this.IconCompatParcelizer) {
            return;
        }
        this.IconCompatParcelizer = true;
        int i4 = MediaBrowserCompatMediaItem + 113;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = RatingCompat + 67;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = RatingCompat + 13;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return RemoteActionCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f8  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 404
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setPenAttributes.onResume():void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            e((ViewConfiguration.getScrollBarSize() >> 8) - 1770381475, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 98), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 730045555, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 50, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(17 - TextUtils.indexOf((CharSequence) "", '0', 0), new char[]{23224, 61861, 13731, 14743, 16606, 14357, 32808, 4910, 53351, 51862, 39545, 41634, 58445, 57572, 55946, 9817, 14507, 35071}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i2 = MediaBrowserCompatMediaItem + 83;
                RatingCompat = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 2 % 5;
                }
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i4 = MediaBrowserCompatMediaItem + 29;
                RatingCompat = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - View.MeasureSpec.getMode(0)), 6054 - Color.green(0), 'Z' - AndroidCharacter.getMirror('0'), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 6030 - Color.red(0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 24, -861814097, false, "read", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:73:0x092d  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x097f A[Catch: all -> 0x0a3f, TryCatch #14 {all -> 0x0a3f, blocks: (B:82:0x0979, B:84:0x097f, B:85:0x09a9), top: B:282:0x0979, outer: #6 }] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r38) {
        /*
            Method dump skipped, instruction units count: 6260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setPenAttributes.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 85;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatMediaItem + 31;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }
}
