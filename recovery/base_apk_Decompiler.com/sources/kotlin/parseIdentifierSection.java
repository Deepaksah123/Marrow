package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.kt.base.BaseDaggerActivity;
import com.marrow.ui.activities.learn.video.LessonVideoActivity;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import kotlin.getExtendedEsFrChar;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class parseIdentifierSection<P extends getExtendedEsFrChar> extends BaseDaggerActivity<P> implements SubjectStat {
    private volatile isHighlighted IconCompatParcelizer;
    private getSubjectStat read;
    private static final byte[] $$l = {37, -1, TarConstants.LF_CONTIG, -26};
    private static final int $$o = 92;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {104, 100, TarConstants.LF_GNUTYPE_SPARSE, -75, 64, -70, 13, -16, 42, -37, 11, -7, 1, 16, -22, -12, 7, 6, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -13, 1, 62, -58, -9, -1, 7, -6, 6, TarConstants.LF_FIFO, -52, -14, 9, -15, 2, 5, 4, TarConstants.LF_DIR, -64, 11, -20, 14, -14, 8, 7, -12, 61, -71, 18, -2, -18, 68, -39, -14, -2, 21, -22, -25, 9, -7, 0, 79, -79, 12, 3, -4, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$k = TsExtractor.TS_STREAM_TYPE_SPLICE_INFO;
    private static final byte[] $$d = {87, 74, -120, 12, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 205;
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    private static char[] RemoteActionCompatParcelizer = {56429, 28616, 47932, 50816, 4811, 24119, 59796, 13700, 16691, 35973, 55430, 25618, 46982, 50113, 3875, 23199, 59103, 12853, 65407, 19674, 38958, 58770, 12761, 32037, 51846, 5782, 25135, 44948, 64458, 18302, 38055, 57567, 11302, 31105, 50632, 4413, 24222, 43769, 62978, 17284, 36848, 56125, 10383, 29920, 21630, 59271, 13177, 20096, 39633, 54909, 24965, 48606, 51499, 1155, 20622, 60514, 16262, 19421, 34662, 53902, 28303, 47713, 62939, 489, 23856, 59524, 9446, 28721, 33756, 57317, 27451, 42640, 62191, 3643, 22928, 38376, 8510, 31888, 35000, 50243, 6080, 41966, 65345, 2712, 18150, 37443, 11720, 31140, 46354, 49354, 7411, 43036, 64414, 14333, 17231, 40608, 10999, 26181, 45478, 52733, 6470, 21746, 57519, 15363, 20387, 39849, 55121, 25263, 5269, 42860, 29634, 3693, 55918, 38551, 8552, 64873, 35267, 17513, 4198, 44168, 32567, 2868, 51167, 37477, 11887, 64220, 46433, 16728, 7565, 43060, 25688, 12419, 49982, 40712, 11223, 58912, 45660, 20099, 6442, 54617, 24963, 15484, 51284, 33964, 22398, 58112, 49144, 19063, 1622, 54015, 28022, 14665, 62892, 32807, 23627, 59552, 47906, 30489, 933, 56904, 27214, 9971, 61720, 36114, 23030, 5199, 41030, 31931, 3865, 56130, 38893, 8729, 55856, 27021, 48492, 49347, 5263, 22633, 56382, 28567, 47930, 50885, 4754, 24172, 59841, 13723, 16753, 36046, 55502, 25722, 46994, 50051, 3956, 23244, 59032, 12913, 32213, 35243, 54566, 24780, 44192, 63591, 2970, 22433, 58153, 11984, 31395, 34347, 53635, 7676, 43389, 62599, 174, 19460, 60251, 22778, 35859, 61870, 9655, 26895, 57004, 761, 30214, 48101, 61382, 21254, 32954, 62695, 14360, 28074};
    private static long MediaBrowserCompatCustomActionResultReceiver = 757954736240947110L;
    private static long RatingCompat = -5883376581403320158L;
    private final Object AudioAttributesCompatParcelizer = new Object();
    private boolean write = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$r(short r6, int r7, int r8) {
        /*
            int r6 = r6 * 3
            int r6 = r6 + 101
            int r7 = r7 * 3
            int r7 = r7 + 1
            byte[] r0 = kotlin.parseIdentifierSection.$$l
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r5 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r8]
        L26:
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseIdentifierSection.$$r(short, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = 44 - r6
            byte[] r1 = kotlin.parseIdentifierSection.$$d
            int r7 = 191 - r7
            int r8 = r8 + 65
            byte[] r0 = new byte[r0]
            int r6 = 43 - r6
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r6
            r8 = r7
            r3 = r2
            goto L28
        L13:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
        L28:
            int r4 = -r4
            int r7 = r7 + r4
            int r8 = r8 + 1
            int r7 = r7 + (-1)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseIdentifierSection.g(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r5 = 111 - r5
            byte[] r0 = kotlin.parseIdentifierSection.$$j
            int r6 = r6 + 4
            int r7 = 47 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r4 = r7
            r3 = r2
            goto L24
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r5
            int r6 = r6 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r6]
        L24:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseIdentifierSection.h(int, int, int, java.lang.Object[]):void");
    }

    public parseIdentifierSection() {
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.parseIdentifierSection.4
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                parseIdentifierSection.this.onCommand();
            }
        });
        int i2 = MediaMetadataCompat + 11;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 37 / 0;
        }
    }

    private void onCustomAction() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 51;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        getSubjectStat getsubjectstatWrite = onFastForward().write();
        this.read = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            this.read.IconCompatParcelizer(getDefaultViewModelCreationExtras());
        }
        int i4 = MediaMetadataCompat + 83;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(RatingCompat ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $11 + 65;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(RatingCompat)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 12424 - (KeyEvent.getMaxKeyCode() >> 16), 21 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char cArgb = (char) Color.argb(0, 0, 0, 0);
                    int maximumFlingVelocity = 1868 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                    int i6 = 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                    byte b = (byte) (-$$l[1]);
                    byte b2 = (byte) (b - 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read(cArgb, maximumFlingVelocity, i6, 1983509525, false, $$r(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i7 = $10 + 75;
                $11 = i7 % 128;
                int i8 = i7 % 2;
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

    private static void e(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i4 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(RemoteActionCompatParcelizer[i + i4])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    char scrollBarFadeDuration = (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 36621);
                    int packedPositionGroup = 2340 - ExpandableListView.getPackedPositionGroup(0L);
                    int deadChar = KeyEvent.getDeadChar(0, 0) + 28;
                    byte b = (byte) ($$l[1] + 1);
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read(scrollBarFadeDuration, packedPositionGroup, deadChar, 480654850, false, $$r(b, b2, b2), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(MediaBrowserCompatCustomActionResultReceiver), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (KeyEvent.getMaxKeyCode() >> 16), 9701 - TextUtils.indexOf("", ""), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 25, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i4] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {downloadService, downloadService};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) Color.blue(0), 23784 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        char[] cArr = new char[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            try {
                Object[] objArr5 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 23783 - MotionEvent.axisFromString(""), Color.alpha(0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                int i5 = $11 + 91;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr);
        int i7 = $11 + 39;
        $10 = i7 % 128;
        if (i7 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00f5  */
    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r32) {
        /*
            Method dump skipped, instruction units count: 2461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseIdentifierSection.onCreate(android.os.Bundle):void");
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 29;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.read;
        if (getsubjectstat != null) {
            getsubjectstat.AudioAttributesCompatParcelizer();
            int i4 = MediaMetadataCompat + 15;
            MediaDescriptionCompat = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 103;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedOnFastForward = onFastForward();
        if (i3 == 0) {
            return ishighlightedOnFastForward.af_();
        }
        ishighlightedOnFastForward.af_();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted onPlay() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaMetadataCompat + 119;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            return ishighlighted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted onFastForward() {
        if (this.IconCompatParcelizer == null) {
            synchronized (this.AudioAttributesCompatParcelizer) {
                if (this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = onPlay();
                }
            }
        }
        return this.IconCompatParcelizer;
    }

    protected final void onCommand() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 107;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 50 / 0;
            if (this.write) {
                return;
            }
        } else if (this.write) {
            return;
        }
        this.write = true;
        ((toPositionAnchor) af_()).RemoteActionCompatParcelizer((LessonVideoActivity) getSubmittedOnDate.AudioAttributesCompatParcelizer(this));
        int i4 = MediaDescriptionCompat + 73;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 107;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = MediaDescriptionCompat + 81;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
        return RemoteActionCompatParcelizer2;
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 57;
        MediaMetadataCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getBaseContext();
            obj.hashCode();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            e((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 8943), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 93, TextUtils.getOffsetAfter("", 0) + 26, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(-ImageFormat.getBitsPerPixel(0), new char[]{34230, 34261, 40559, 43043, 12428, 9612, 23692, 34645, 23863, 42832, 30126, 24130, 13326, 16466, 11994, 29078, 3961, 26791, 51174, 2226, 58953, 12676}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = (((baseContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) baseContext).getBaseContext() != null) ? baseContext.getApplicationContext() : null;
        }
        if (baseContext != null) {
            int i3 = MediaMetadataCompat + 29;
            MediaDescriptionCompat = i3 % 128;
            try {
                if (i3 % 2 != 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 4536), TextUtils.indexOf("", "") + 6054, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getOffsetAfter("", 0), 6030 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    obj.hashCode();
                    throw null;
                }
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (4536 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), MotionEvent.axisFromString("") + 6055, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (AndroidCharacter.getMirror('0') - '0'), TextUtils.indexOf("", "", 0, 0) + 6030, (Process.myPid() >> 22) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke2, objArr4);
                int i4 = MediaMetadataCompat + 9;
                MediaDescriptionCompat = i4 % 128;
                int i5 = i4 % 2;
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f0  */
    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 400
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseIdentifierSection.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:(26:256|33|(3:35|36|(2:38|40)(1:39))(1:40)|76|267|77|(1:79)|80|(3:82|(1:84)|85)(19:86|87|259|88|(1:90)|91|92|274|93|(1:95)|96|97|98|(1:100)|101|(1:103)|104|(1:106)|107)|108|(5:111|112|(12:114|(3:116|(3:119|120|117)|281)|121|265|122|(1:124)|125|126|127|257|128|280)(1:279)|141|109)|278|164|(1:166)|167|(3:169|(1:171)|172)(13:174|254|175|176|(1:178)|179|272|180|181|(1:183)|184|(1:186)|187)|173|188|(6:190|191|(1:193)|194|195|196)|197|(1:199)|200|(3:202|(1:204)|205)(14:207|208|(1:210)|211|212|(1:214)|215|263|216|217|(1:219)|220|(1:222)|223)|206|224|(7:226|227|(1:229)|230|231|232|233)(1:282))|268|45|(1:47)|48|261|49|(1:51)|52|53|76|267|77|(0)|80|(0)(0)|108|(1:109)|278|164|(0)|167|(0)(0)|173|188|(0)|197|(0)|200|(0)(0)|206|224|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0a8e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0a8f, code lost:
    
        r6 = new java.lang.Object[1];
        f(((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod(r9, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(com.marrow.R.integer.m3c_window_layout_in_display_cutout_mode) & (-3), new char[]{37512, 37564, 42390, 37789, 36201, 59672, 57634, 19335, 19029, 40118, 51208, 37541, 9081, 31658, 37731}, r6);
        r4 = (java.lang.String) r6[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0ac5, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r2);
        r0.printStackTrace(r5);
        r5.close();
        r1 = r2.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0adc, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0ae0, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0aef, code lost:
    
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0af3, code lost:
    
        if (r1 == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0af5, code lost:
    
        r1 = kotlin.startForeground.read((char) ((android.media.AudioTrack.getMinVolume() > com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 1 : (android.media.AudioTrack.getMinVolume() == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 4535), 6054 - (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (android.telephony.cdma.CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 42 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0b26, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0b32, code lost:
    
        r6 = new java.lang.Object[]{-1266621435, 81604378625L, r2, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r2 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) android.view.View.MeasureSpec.makeMeasureSpec(0, 0), 6030 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.view.KeyEvent.normalizeMetaState(0) + 24);
        r11 = new java.lang.Object[1];
        h((byte) 29, r5[6], (byte) (kotlin.parseIdentifierSection.$$j[43] - 1), r11);
        r2.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0942  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0bb7  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0c05  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0c60  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0eea  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0fd5  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x1028  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x1081  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x1356  */
    /* JADX WARN: Removed duplicated region for block: B:282:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0594 A[Catch: all -> 0x0a8e, TryCatch #9 {all -> 0x0a8e, blocks: (B:77:0x058e, B:79:0x0594, B:80:0x05dd, B:82:0x05ea, B:84:0x05f3, B:85:0x0639, B:108:0x0938, B:109:0x093c, B:112:0x094c, B:114:0x0962, B:117:0x0978, B:119:0x097b, B:126:0x09e0, B:132:0x0a65, B:134:0x0a6b, B:135:0x0a6c, B:137:0x0a6e, B:139:0x0a75, B:140:0x0a76, B:86:0x0644, B:98:0x07cb, B:100:0x07d1, B:101:0x0815, B:103:0x088c, B:104:0x08ce, B:106:0x08e5, B:107:0x0932, B:143:0x0a7b, B:145:0x0a82, B:146:0x0a83, B:148:0x0a85, B:150:0x0a8c, B:151:0x0a8d, B:128:0x09e5, B:88:0x06f9, B:90:0x070a, B:91:0x073d, B:122:0x09aa, B:124:0x09b0, B:125:0x09d9, B:93:0x0744, B:95:0x0758, B:96:0x07bf), top: B:267:0x058e, outer: #7, inners: #3, #4, #8, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x05ea A[Catch: all -> 0x0a8e, TryCatch #9 {all -> 0x0a8e, blocks: (B:77:0x058e, B:79:0x0594, B:80:0x05dd, B:82:0x05ea, B:84:0x05f3, B:85:0x0639, B:108:0x0938, B:109:0x093c, B:112:0x094c, B:114:0x0962, B:117:0x0978, B:119:0x097b, B:126:0x09e0, B:132:0x0a65, B:134:0x0a6b, B:135:0x0a6c, B:137:0x0a6e, B:139:0x0a75, B:140:0x0a76, B:86:0x0644, B:98:0x07cb, B:100:0x07d1, B:101:0x0815, B:103:0x088c, B:104:0x08ce, B:106:0x08e5, B:107:0x0932, B:143:0x0a7b, B:145:0x0a82, B:146:0x0a83, B:148:0x0a85, B:150:0x0a8c, B:151:0x0a8d, B:128:0x09e5, B:88:0x06f9, B:90:0x070a, B:91:0x073d, B:122:0x09aa, B:124:0x09b0, B:125:0x09d9, B:93:0x0744, B:95:0x0758, B:96:0x07bf), top: B:267:0x058e, outer: #7, inners: #3, #4, #8, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0644 A[Catch: all -> 0x0a8e, TRY_LEAVE, TryCatch #9 {all -> 0x0a8e, blocks: (B:77:0x058e, B:79:0x0594, B:80:0x05dd, B:82:0x05ea, B:84:0x05f3, B:85:0x0639, B:108:0x0938, B:109:0x093c, B:112:0x094c, B:114:0x0962, B:117:0x0978, B:119:0x097b, B:126:0x09e0, B:132:0x0a65, B:134:0x0a6b, B:135:0x0a6c, B:137:0x0a6e, B:139:0x0a75, B:140:0x0a76, B:86:0x0644, B:98:0x07cb, B:100:0x07d1, B:101:0x0815, B:103:0x088c, B:104:0x08ce, B:106:0x08e5, B:107:0x0932, B:143:0x0a7b, B:145:0x0a82, B:146:0x0a83, B:148:0x0a85, B:150:0x0a8c, B:151:0x0a8d, B:128:0x09e5, B:88:0x06f9, B:90:0x070a, B:91:0x073d, B:122:0x09aa, B:124:0x09b0, B:125:0x09d9, B:93:0x0744, B:95:0x0758, B:96:0x07bf), top: B:267:0x058e, outer: #7, inners: #3, #4, #8, #13 }] */
    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r35) {
        /*
            Method dump skipped, instruction units count: 5633
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseIdentifierSection.attachBaseContext(android.content.Context):void");
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 105;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
        int i4 = MediaDescriptionCompat + 53;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
    }
}
