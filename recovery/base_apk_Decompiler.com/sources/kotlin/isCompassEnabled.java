package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class isCompassEnabled extends addObserverForBackInvoker implements SubjectStat {
    private getSubjectStat AudioAttributesCompatParcelizer;
    private final Object IconCompatParcelizer;
    private volatile isHighlighted RemoteActionCompatParcelizer;
    private boolean write;
    private static final byte[] $$c = {3, 113, -44, TarConstants.LF_BLK};
    private static final int $$f = 83;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {57, 34, -8, 64, 59, -63, -4, -21, 32, -29, -21, -9, 2, -9, 1, 17, -43, 3, 5, 25, -50, -3, -4, 36, -50, -5, -6, 3, -4, -23, 5, -19, 7, -17, -11, 38, -26, -19, 7, -12, -4, -19, -1, 3, -17, 9, -25, -14, -8, -11, 9, 30, -40, -23, 5, -12, -5, 37, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19, -18, -4, 57, -63, -14, -6, 2, -11, 1, TarConstants.LF_LINK, -57, -19, 4, -20, -3, 0, -1, TarConstants.LF_NORMAL, -69, 6, -25, 9, -19, 3, 2, -17, 56, -59, -11, -7, -13, 60, -27, -43, -7, -13, 70, -19};
    private static final int $$h = TsExtractor.TS_STREAM_TYPE_DTS;
    private static final byte[] $$a = {47, 110, -5, -26, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 190;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private static long read = -8678287105749044816L;
    private static char[] AudioAttributesImplBaseParcelizer = {20638, 57753, 12928, 17315, 38107, 56429, 28017, 48718, 53063, 6191, 43322, 64026, 2983, 21749, 58839, 14018, 18419, 37033, 8600, 29554, 48248, 52554, 7718, 44846, 63516, 2340, 23275, 60380, 13532, 17829, 38579, 30307, 50979, 5190, 25948, 45692, 876, 20496, 41404, 65277, 20430, 40074, 60897, 15069, 35735, 55663, 5752, 26377, 46115, 1333, 21081, 41807, 61631, 16784, 40582, 61424, 15551, 36235, 56121, 10278, 30992, 46602, 1908, 21589, 42259, 62128, 17405, 37068, 57819, 16096, 36738, 56520, 10808, 31610, 51200, 6438, 22116, 42843, 62493, 17828, 37574, 58321, 12457, 33260, 57048, 11312, 32119, 51736, 7000, 26746, 47362, 63043, 18353, 38061, 58772, 56373, 27953, 48667, 52993, 6254, 43361, 42016, 5424, 50774, 46876, 24680, 53631, 33361, 29606, 11431, 40321, 20170, 16379, 59536, 22984, 2860, 50233, 46358, 26214, 55145, 32834, 28940, 8879, 37760, 19594, 15804, 61182, 24477, 2337, 64049, 43856, 25675, 54585, 34371, 30464, 8354, 37309, 53026, 32314, 44312, 56336, 2858, 47739, 59739, 6307, 18359, 63181, 9637, 21728, 33759, 13003, 24615, 44856, 62033, 17231, 36987, 57711, 13824, 34574, 54334, 9668, 31464, 52210, 6389, 27009, 48799, 4000, 23894, 37440, 56425, 28019, 48715, 53061, 6195, 43318, 64026, 3035, 21745, 58822, 14046, 18345, 36993, 8598, 29539, 16882, 61671, 9177, 21195, 34227, 13487, 26499, 38513, 51559, 30811, 43848, 56372, 27950, 48668, 52997, 6260, 43360, 64073, 2993, 21666, 58773, 13958};
    private static long AudioAttributesImplApi21Parcelizer = 3308531050998492447L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(int r5, short r6, short r7) {
        /*
            byte[] r0 = kotlin.isCompassEnabled.$$c
            int r5 = r5 * 4
            int r1 = 1 - r5
            int r7 = r7 * 3
            int r7 = r7 + 101
            int r6 = r6 * 2
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r5 = 0 - r5
            if (r0 != 0) goto L18
            r4 = r6
            r3 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            int r3 = r3 + 1
            r4 = r0[r6]
        L28:
            int r6 = r6 + 1
            int r7 = r7 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isCompassEnabled.$$i(int, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.isCompassEnabled.$$a
            int r7 = 190 - r7
            int r1 = 44 - r6
            int r8 = 114 - r8
            byte[] r1 = new byte[r1]
            int r6 = 43 - r6
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L2d
        L12:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L16:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r7 = r7 + r8
            int r7 = r7 + (-1)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isCompassEnabled.c(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = 73 - r7
            int r8 = 39 - r8
            byte[] r0 = kotlin.isCompassEnabled.$$g
            int r9 = r9 + 82
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r9
            r4 = r2
            r9 = r7
            goto L29
        L11:
            r3 = r2
        L12:
            r6 = r9
            r9 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r6
        L29:
            int r7 = r7 + 1
            int r3 = -r3
            int r9 = r9 + r3
            int r9 = r9 + (-6)
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isCompassEnabled.d(byte, byte, short, java.lang.Object[]):void");
    }

    isCompassEnabled() {
        this.IconCompatParcelizer = new Object();
        this.write = false;
        AudioAttributesImplBaseParcelizer();
    }

    isCompassEnabled(byte b) {
        super(R.layout.activity_share_app);
        this.IconCompatParcelizer = new Object();
        this.write = false;
        AudioAttributesImplBaseParcelizer();
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.isCompassEnabled.2
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                isCompassEnabled.this.MediaBrowserCompatItemReceiver();
            }
        });
        int i2 = AudioAttributesImplApi26Parcelizer + 15;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 19;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        getSubjectStat getsubjectstatWrite = AudioAttributesImplApi26Parcelizer().write();
        this.AudioAttributesCompatParcelizer = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            int i4 = AudioAttributesImplApi26Parcelizer + 57;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            int i5 = i4 % 2;
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            if (i5 != 0) {
                throw null;
            }
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(read ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        int i3 = $10 + 39;
        $11 = i3 % 128;
        while (true) {
            int i4 = i3 % 2;
            if (buildsetrequirementsintent.write >= cArrAudioAttributesCompatParcelizer.length) {
                objArr[0] = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
                return;
            }
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(read)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12424, 20 - KeyEvent.getDeadChar(0, 0), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getTouchSlop() >> 8) + 1868, (ViewConfiguration.getEdgeSlop() >> 16) + 10, 1983509525, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                i3 = $11 + 31;
                $10 = i3 % 128;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i4 = $11 + 41;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(AudioAttributesImplBaseParcelizer[i2 + i6])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (Color.green(0) + 36621), 2340 - (KeyEvent.getMaxKeyCode() >> 16), 28 - (KeyEvent.getMaxKeyCode() >> 16), 480654850, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(AudioAttributesImplApi21Parcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 9700, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 25, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) TextUtils.getOffsetAfter("", 0), 23784 - TextUtils.getCapsMode("", 0, 0), AndroidCharacter.getMirror('0') - 15, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i];
        downloadService.write = 0;
        int i7 = $10 + 39;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        while (downloadService.write < i) {
            int i9 = $11 + 125;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr5 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 23783 - ExpandableListView.getPackedPositionChild(0L), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i11 = $11 + 75;
        $10 = i11 % 128;
        int i12 = i11 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00c1  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r32) {
        /*
            Method dump skipped, instruction units count: 2460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isCompassEnabled.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.AudioAttributesCompatParcelizer;
        Object obj = null;
        if (getsubjectstat != null) {
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 99;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
            if (i3 == 0) {
                throw null;
            }
        }
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 43;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 33;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplApi26Parcelizer().af_();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 13;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = AudioAttributesImplApi26Parcelizer + 109;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        if (this.RemoteActionCompatParcelizer == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.RemoteActionCompatParcelizer == null) {
                    this.RemoteActionCompatParcelizer = AudioAttributesImplApi21Parcelizer();
                }
            }
        }
        return this.RemoteActionCompatParcelizer;
    }

    protected final void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = i2 + 109;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        if (!this.write) {
            int i5 = i2 + 109;
            AudioAttributesImplApi26Parcelizer = i5 % 128;
            int i6 = i5 % 2;
            this.write = true;
        }
        int i7 = MediaBrowserCompatCustomActionResultReceiver + 35;
        AudioAttributesImplApi26Parcelizer = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 15;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = AudioAttributesImplApi26Parcelizer + 67;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return RemoteActionCompatParcelizer;
        }
        throw null;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 101;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 89, (char) Drawable.resolveOpacity(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 104, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 118, new char[]{65232, 24740, 65203, 17120, 34810, 25471, 36036, 54924, 25113, 58141, 10646, 12563, 51192, 16471, 17698, 36303, 10423, 56810, 59086, 59539, 35855, 14609}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i3 = AudioAttributesImplApi26Parcelizer + 51;
            MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
            int i4 = i3 % 2;
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i5 = MediaBrowserCompatCustomActionResultReceiver + 105;
                AudioAttributesImplApi26Parcelizer = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        if (baseContext != null) {
            int i7 = AudioAttributesImplApi26Parcelizer + 19;
            MediaBrowserCompatCustomActionResultReceiver = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (Process.getGidForName("") + 4536), 6055 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6029, 24 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x00f6  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 408
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isCompassEnabled.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x0923 A[Catch: all -> 0x0358, TryCatch #12 {all -> 0x0358, blocks: (B:206:0x0fc0, B:208:0x0fc6, B:209:0x0ff3, B:243:0x1412, B:245:0x1418, B:246:0x143e, B:224:0x11f5, B:226:0x1217, B:227:0x1268, B:173:0x0b5d, B:175:0x0b63, B:176:0x0b8b, B:125:0x091d, B:127:0x0923, B:128:0x094d, B:19:0x0107, B:21:0x010d, B:22:0x0137, B:24:0x02cc, B:26:0x02fd, B:27:0x0352, B:133:0x09e0, B:137:0x09f0, B:141:0x09fc, B:142:0x0a02, B:143:0x0a03, B:159:0x0ad4, B:161:0x0ada, B:162:0x0adb, B:164:0x0add, B:166:0x0ae4, B:167:0x0ae5, B:152:0x0a56, B:154:0x0a63, B:155:0x0aca, B:148:0x0a0d, B:150:0x0a21, B:151:0x0a50), top: B:290:0x0107, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0a21 A[Catch: all -> 0x0adc, TryCatch #15 {all -> 0x0adc, blocks: (B:148:0x0a0d, B:150:0x0a21, B:151:0x0a50), top: B:295:0x0a0d, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0a63 A[Catch: all -> 0x0ad2, TryCatch #10 {all -> 0x0ad2, blocks: (B:152:0x0a56, B:154:0x0a63, B:155:0x0aca), top: B:286:0x0a56, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0c1c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0c69  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0cc2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0fa0  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x1090  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x10da  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x1129  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x13f4  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x09e0 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:305:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e0  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r34) {
        /*
            Method dump skipped, instruction units count: 5680
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isCompassEnabled.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 109;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 23 / 0;
        }
    }
}
