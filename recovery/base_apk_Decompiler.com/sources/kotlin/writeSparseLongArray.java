package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class writeSparseLongArray extends addObserverForBackInvoker implements SubjectStat {
    private static short[] MediaBrowserCompatCustomActionResultReceiver;
    private final Object IconCompatParcelizer = new Object();
    private boolean RemoteActionCompatParcelizer = false;
    private volatile isHighlighted read;
    private getSubjectStat write;
    private static final byte[] $$c = {112, -40, -93, -59};
    private static final int $$f = 243;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {111, -119, 57, 106, 61, -61, -2, -19, 47, -39, -10, -15, -2, -5, 11, -3, 11, -31, -7, -5, -2, 9, 0, -16, 35, -45, -7, 1, 8, -23, -23, -12, -6, -9, 11, 32, -38, -21, 7, -10, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17, 61, -27, -55, 5, 27, -32, 7, -28, 16, -17, 37, -40, -7, 0, 37, -48, -2, -7, -3, -3, 5, -13, -10, 36, -33, -14, -5, 11, -13, 5, -17, 41, -55, 0, 11, -17, 0, 9, -15, 21, -42, 7, -10, 8, -1, -19, 7, 2, 19, -25, -16, 7, -6, -1, 43, -30, -16, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17};
    private static final int $$h = 182;
    private static final byte[] $$a = {31, 34, 9, -77, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 4;
    private static int RatingCompat = 0;
    private static int MediaDescriptionCompat = 1;
    private static int AudioAttributesCompatParcelizer = -1440414683;
    private static int MediaBrowserCompatItemReceiver = -819363132;
    private static int AudioAttributesImplApi21Parcelizer = -1059970773;
    private static byte[] AudioAttributesImplBaseParcelizer = {40, 63, -51, TarConstants.LF_LINK, 67, 90, 17, 17, -104, TarConstants.LF_CHR, -2, 9, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 89, 90, -51, 69, -54, 37, 78, 31, 87, 39, 16, TarConstants.LF_GNUTYPE_LONGLINK, 84, 91, 66, -68, 115, 77, 67, 91, 69, 93, -71, -86, -69, 22, 72, 71, -101, 2, TarConstants.LF_GNUTYPE_SPARSE, 82, 85, 70, 94, 69, 40, 42, TarConstants.LF_CHR, 32, -58, 43, 47, 40, 41, TarConstants.LF_DIR, -38, TarConstants.LF_PAX_EXTENDED_HEADER_LC, TarConstants.LF_CHR, 60, 38, TarConstants.LF_DIR, 40, -57, 6, 102, 17, 118, 47, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 60, 12, 97, 21, 0, 21, 125, 57, 60, 22, 13, 106, TarConstants.LF_BLK, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 60, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 99, 35, 12, 40, 12, 111, 58, 102, 59, 58, 59, 17, 117, 59, 43, TarConstants.LF_LINK, TarConstants.LF_DIR, 38, -63, -60, 61, -36, 47, TarConstants.LF_NORMAL, 59, -52, -64, 38, -56, 47, TarConstants.LF_CONTIG, -91, -93, -54, -51, -92, -51, -81, -50, -94};
    private static long AudioAttributesImplApi26Parcelizer = -5520540985105927347L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 1
            byte[] r0 = kotlin.writeSparseLongArray.$$c
            int r7 = r7 * 8
            int r7 = r7 + 104
            int r8 = r8 * 4
            int r8 = 3 - r8
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2d
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            int r8 = r8 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeSparseLongArray.$$i(short, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = 114 - r8
            byte[] r0 = kotlin.writeSparseLongArray.$$a
            int r1 = r6 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r5
        L2b:
            int r7 = r7 + 1
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-1)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeSparseLongArray.c(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 111 - r7
            int r6 = r6 + 4
            byte[] r0 = kotlin.writeSparseLongArray.$$g
            int r1 = 56 - r8
            byte[] r1 = new byte[r1]
            int r8 = 55 - r8
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r7 = r7 + 1
            int r3 = r3 + r6
            int r6 = r3 + (-4)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeSparseLongArray.d(short, short, byte, java.lang.Object[]):void");
    }

    public writeSparseLongArray() {
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.writeSparseLongArray.2
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                writeSparseLongArray.this.AudioAttributesImplApi21Parcelizer();
            }
        });
        int i2 = RatingCompat + 1;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    private void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 37;
        RatingCompat = i2 % 128;
        if (i2 % 2 == 0) {
            this.write = AudioAttributesImplApi26Parcelizer().write();
            if (!(!r1.RemoteActionCompatParcelizer())) {
                this.write.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            }
            int i3 = MediaDescriptionCompat + 43;
            RatingCompat = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 84 / 0;
                return;
            }
            return;
        }
        getSubjectStat getsubjectstatWrite = AudioAttributesImplApi26Parcelizer().write();
        this.write = getsubjectstatWrite;
        getsubjectstatWrite.RemoteActionCompatParcelizer();
        throw null;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(AudioAttributesImplApi26Parcelizer ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        int i3 = $10 + 83;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i5 = $10 + 77;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i7 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(AudioAttributesImplApi26Parcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), Color.rgb(0, 0, 0) + 16789640, TextUtils.indexOf((CharSequence) "", '0') + 21, -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 1868 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 10, 1983509525, false, $$i(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r24, int r25, int r26, short r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 781
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeSparseLongArray.a(byte, int, int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x014c  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r39) {
        /*
            Method dump skipped, instruction units count: 2868
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeSparseLongArray.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.write;
        if (getsubjectstat != null) {
            int i2 = RatingCompat + 55;
            MediaDescriptionCompat = i2 % 128;
            int i3 = i2 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
            if (i3 == 0) {
                int i4 = 25 / 0;
            }
        }
        int i5 = MediaDescriptionCompat + 55;
        RatingCompat = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 115;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplApi26Parcelizer().af_();
        int i4 = RatingCompat + 79;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaDescriptionCompat + 111;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        if (this.read == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.read == null) {
                    this.read = AudioAttributesImplBaseParcelizer();
                }
            }
        }
        return this.read;
    }

    protected final void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 47;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (!this.RemoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer = true;
        }
        int i3 = MediaDescriptionCompat + 83;
        RatingCompat = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = RatingCompat + 109;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = RatingCompat + 117;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0136  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 555
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeSparseLongArray.onResume():void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 87;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 117), (-268149598) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, (-1695319679) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length(), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 147), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 151, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 79), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 268149596, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1695319650, (short) ((-16) - View.getDefaultSize(0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 165, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = RatingCompat + 57;
            MediaDescriptionCompat = i4 % 128;
            int i5 = i4 % 2;
            if ((!(baseContext instanceof ContextWrapper)) || ((ContextWrapper) baseContext).getBaseContext() != null) {
                baseContext = baseContext.getApplicationContext();
            } else {
                int i6 = RatingCompat + 97;
                MediaDescriptionCompat = i6 % 128;
                int i7 = i6 % 2;
                baseContext = null;
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 6053 - TextUtils.lastIndexOf("", '0', 0), TextUtils.getOffsetBefore("", 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.green(0), 6030 - (ViewConfiguration.getFadingEdgeLength() >> 16), KeyEvent.normalizeMetaState(0) + 24, -861814097, false, "read", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:19:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0827  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x086c A[Catch: all -> 0x0929, TryCatch #5 {all -> 0x0929, blocks: (B:92:0x0866, B:94:0x086c, B:95:0x0894), top: B:282:0x0866, outer: #6 }] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r34) {
        /*
            Method dump skipped, instruction units count: 6260
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeSparseLongArray.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 85;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaDescriptionCompat + 17;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }
}
