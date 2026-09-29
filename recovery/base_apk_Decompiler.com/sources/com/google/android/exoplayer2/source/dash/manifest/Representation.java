package com.google.android.exoplayer2.source.dash.manifest;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.source.dash.DashSegmentIndex;
import com.google.android.exoplayer2.source.dash.manifest.SegmentBase;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.exoplayer2.util.Assertions;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;
import kotlin.DownloadService;
import kotlin.buildSetRequirementsIntent;
import kotlin.initExtraTracks;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public abstract class Representation {
    public static final long REVISION_ID_DEFAULT = -1;
    public final initExtraTracks<BaseUrl> baseUrls;
    public final List<Descriptor> essentialProperties;
    public final Format format;
    public final List<Descriptor> inbandEventStreams;
    private final RangedUri initializationUri;
    public final long presentationTimeOffsetUs;
    public final long revisionId;
    public final List<Descriptor> supplementalProperties;

    public abstract String getCacheKey();

    public abstract DashSegmentIndex getIndex();

    public abstract RangedUri getIndexUri();

    /* synthetic */ Representation(long j, Format format, List list, SegmentBase segmentBase, List list2, List list3, List list4, AnonymousClass1 anonymousClass1) {
        this(j, format, list, segmentBase, list2, list3, list4);
    }

    /* JADX INFO: renamed from: com.google.android.exoplayer2.source.dash.manifest.Representation$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        private static int AudioAttributesCompatParcelizer;
        private static char[] IconCompatParcelizer;
        private static long RemoteActionCompatParcelizer;
        private static long read;
        private static int write;
        private static final byte[] $$c = {26, 47, -113, 59};
        private static final int $$d = TsExtractor.TS_STREAM_TYPE_AC3;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {84, -83, -23, -21, -26, -12, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13};
        private static final int $$b = 201;
        private static final byte[] AudioAttributesImplApi26Parcelizer = {66, 100, 74, -7, -13, 10, -14, 3, 6, 5, TarConstants.LF_FIFO, -72, 13, 4, -18, 73, -40, -19, 4, -18, TarConstants.LF_BLK, -44, 1, 8, -3, 2, -14, 3, 17, -19, 11, -6, 1, 2, -15, 33, -16, -15, 3, 3, 0, 42, -31, -17, 44, -27, -3, -1, 33, -49, 3, 17, -19, 11, -6, 1, 2, -15, 32, -13, -15, 28, -21, -4, 8, -10, -6, 1, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -37, -33, 2, 9, -5, 7, 3, 4, 3, -11, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -27, -37, -6, 15, -2, 2, -13, 21, -11, -9, 16, 22, -23, -5, -6, 30, -11, -11, -9, 16, 2, -15, 41, -26, -20, 39, -19, -11, 11, 4, -19, TarConstants.LF_NORMAL, -33, -7, 11, -24, -13, 10, -14, 3, 6, 5, TarConstants.LF_FIFO, -70, 15, -19, 4, 70, -38, -17, -19, 4, 31, -31, 11, -3, -7, 2, -15, TarConstants.LF_LINK, -30, -15, -3, 38, -34, 11, -1, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -21, -37, 7, -17, 31, -18, -12, -4, 16, -9, 11, -2, -5, 10, -1, -19, 41, -23, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -38, -20, -10, 3, -8, 22, -1, -10, 7, 2, -15, TarConstants.LF_LINK, -30, -20, 2, 14, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -33, -19, -8, 5, 2, -17, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -30, -35, 1, 7, -5, 9, 11, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -68, 13, -1, -6, 7, 2, -17, 70, -19, -34, 0, -2, -14, 0, 10, 7, -10, 7, 22, -19, -8, 5, 2, -17, 14, -15, TarConstants.LF_CHR, -34, 0, -2, -14, 0, 10, 7, -10, 7, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -68, 13, -1, -6, 7, 2, -17, 70, -31, -24, -15, 12, -7, 11, -5, -8, 7, 4, 6, 15, -30, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -33, -19, -8, 5, 2, -17, 57};
        private static final int MediaBrowserCompatCustomActionResultReceiver = TsExtractor.TS_STREAM_TYPE_AC3;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(short r5, int r6, short r7) {
            /*
                int r5 = r5 * 3
                int r5 = 104 - r5
                int r6 = r6 * 3
                int r0 = 1 - r6
                int r7 = r7 * 2
                int r7 = r7 + 4
                byte[] r1 = com.google.android.exoplayer2.source.dash.manifest.Representation.AnonymousClass1.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                int r6 = 0 - r6
                if (r1 != 0) goto L18
                r4 = r6
                r3 = r2
                goto L28
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r5
                r0[r3] = r4
                if (r3 != r6) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                return r5
            L24:
                int r3 = r3 + 1
                r4 = r1[r7]
            L28:
                int r5 = r5 + r4
                int r7 = r7 + 1
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.Representation.AnonymousClass1.$$e(short, int, short):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0030). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void d(byte r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 3
                int r7 = 3 - r7
                int r6 = r6 * 2
                int r0 = 20 - r6
                byte[] r1 = com.google.android.exoplayer2.source.dash.manifest.Representation.AnonymousClass1.$$a
                int r8 = r8 * 4
                int r8 = r8 + 73
                byte[] r0 = new byte[r0]
                int r6 = 19 - r6
                r2 = 0
                if (r1 != 0) goto L18
                r3 = r6
                r4 = r2
                goto L30
            L18:
                r3 = r2
            L19:
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r6) goto L26
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L26:
                int r7 = r7 + 1
                int r3 = r3 + 1
                r4 = r1[r7]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L30:
                int r8 = -r8
                int r8 = r8 + r3
                r3 = r4
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.Representation.AnonymousClass1.d(byte, short, short, java.lang.Object[]):void");
        }

        private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
            buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
            char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(read ^ 4027965449757546139L, cArr, i);
            buildsetrequirementsintent.write = 4;
            while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
                buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
                int i2 = buildsetrequirementsintent.write;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(read)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12424, 19 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrAudioAttributesCompatParcelizer[i2] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.green(0), Color.rgb(0, 0, 0) + 16779084, ExpandableListView.getPackedPositionGroup(0L) + 10, 1983509525, false, $$e(b, b2, b2), new Class[]{Object.class, Object.class});
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

        private static void c(char c, int i, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            DownloadService downloadService = new DownloadService();
            long[] jArr = new long[i];
            downloadService.write = 0;
            while (downloadService.write < i) {
                int i4 = $11 + 123;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = downloadService.write;
                try {
                    Object[] objArr2 = {Integer.valueOf(IconCompatParcelizer[i2 + i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 36620);
                        int i7 = 2339 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 28;
                        byte b = (byte) ($$d & 7);
                        byte b2 = (byte) (b - 1);
                        objRemoteActionCompatParcelizer = startForeground.read(c2, i7, pressedStateDuration, 480654850, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(RemoteActionCompatParcelizer), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 9702, ImageFormat.getBitsPerPixel(0) + 27, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {downloadService, downloadService};
                            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                            if (objRemoteActionCompatParcelizer3 == null) {
                                objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getTouchSlop() >> 8), ExpandableListView.getPackedPositionType(0L) + 23784, 33 - ((Process.getThreadPriority(0) + 20) >> 6), -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
            char[] cArr = new char[i];
            downloadService.write = 0;
            while (downloadService.write < i) {
                cArr[downloadService.write] = (char) jArr[downloadService.write];
                Object[] objArr5 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) Drawable.resolveOpacity(0, 0), KeyEvent.keyCodeFromString("") + 23784, 33 - Color.argb(0, 0, 0, 0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                int i8 = $10 + 33;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            }
            String str = new String(cArr);
            int i10 = $10 + 113;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            objArr[0] = str;
        }

        /* JADX WARN: Removed duplicated region for block: B:115:0x05e0 A[Catch: all -> 0x073a, TryCatch #19 {all -> 0x073a, blocks: (B:16:0x01ac, B:24:0x020c, B:29:0x0217, B:31:0x021d, B:32:0x021e, B:33:0x021f, B:34:0x022a, B:36:0x02ba, B:37:0x02bd, B:39:0x02c3, B:41:0x02c9, B:42:0x02ca, B:43:0x02cb, B:46:0x036e, B:48:0x0374, B:50:0x037a, B:51:0x037b, B:52:0x037c, B:54:0x03a5, B:56:0x03ec, B:58:0x03f2, B:60:0x03f8, B:61:0x03f9, B:62:0x03fa, B:67:0x040f, B:68:0x0418, B:69:0x0419, B:70:0x0445, B:72:0x049b, B:74:0x04a1, B:76:0x04a7, B:77:0x04a8, B:78:0x04a9, B:79:0x04b0, B:80:0x04c8, B:81:0x04d9, B:88:0x0532, B:93:0x0544, B:113:0x05da, B:115:0x05e0, B:116:0x05e1, B:119:0x05e9, B:71:0x0451, B:35:0x0240, B:55:0x03af, B:45:0x02e1), top: B:239:0x01ac, inners: #0, #4, #10, #13 }] */
        /* JADX WARN: Removed duplicated region for block: B:116:0x05e1 A[Catch: all -> 0x073a, TryCatch #19 {all -> 0x073a, blocks: (B:16:0x01ac, B:24:0x020c, B:29:0x0217, B:31:0x021d, B:32:0x021e, B:33:0x021f, B:34:0x022a, B:36:0x02ba, B:37:0x02bd, B:39:0x02c3, B:41:0x02c9, B:42:0x02ca, B:43:0x02cb, B:46:0x036e, B:48:0x0374, B:50:0x037a, B:51:0x037b, B:52:0x037c, B:54:0x03a5, B:56:0x03ec, B:58:0x03f2, B:60:0x03f8, B:61:0x03f9, B:62:0x03fa, B:67:0x040f, B:68:0x0418, B:69:0x0419, B:70:0x0445, B:72:0x049b, B:74:0x04a1, B:76:0x04a7, B:77:0x04a8, B:78:0x04a9, B:79:0x04b0, B:80:0x04c8, B:81:0x04d9, B:88:0x0532, B:93:0x0544, B:113:0x05da, B:115:0x05e0, B:116:0x05e1, B:119:0x05e9, B:71:0x0451, B:35:0x0240, B:55:0x03af, B:45:0x02e1), top: B:239:0x01ac, inners: #0, #4, #10, #13 }] */
        /* JADX WARN: Removed duplicated region for block: B:168:0x06b7 A[Catch: all -> 0x0721, TryCatch #1 {all -> 0x0721, blocks: (B:143:0x0685, B:166:0x06b1, B:168:0x06b7, B:169:0x06b8, B:173:0x06c9, B:174:0x06d8, B:175:0x06eb, B:180:0x070f), top: B:204:0x0685 }] */
        /* JADX WARN: Removed duplicated region for block: B:169:0x06b8 A[Catch: all -> 0x0721, TryCatch #1 {all -> 0x0721, blocks: (B:143:0x0685, B:166:0x06b1, B:168:0x06b7, B:169:0x06b8, B:173:0x06c9, B:174:0x06d8, B:175:0x06eb, B:180:0x070f), top: B:204:0x0685 }] */
        /* JADX WARN: Removed duplicated region for block: B:193:0x0745  */
        /* JADX WARN: Removed duplicated region for block: B:253:0x0753 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void RemoteActionCompatParcelizer(android.content.Context r18, long r19, long r21) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2247
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.Representation.AnonymousClass1.RemoteActionCompatParcelizer(android.content.Context, long, long):void");
        }

        static {
            AudioAttributesCompatParcelizer();
            AudioAttributesCompatParcelizer = 0;
            write = 1;
            IconCompatParcelizer = new char[]{56446};
            RemoteActionCompatParcelizer = -6669757206880413207L;
        }

        static void AudioAttributesCompatParcelizer() {
            read = 5984536975734286828L;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(short r7, int r8, byte r9, java.lang.Object[] r10) {
            /*
                int r8 = 118 - r8
                byte[] r0 = com.google.android.exoplayer2.source.dash.manifest.Representation.AnonymousClass1.AudioAttributesImplApi26Parcelizer
                int r7 = 318 - r7
                int r9 = r9 + 4
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L11
                r8 = r7
                r3 = r9
                r4 = r2
                goto L28
            L11:
                r3 = r2
            L12:
                int r7 = r7 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r8
                r1[r3] = r5
                if (r4 != r9) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L23:
                r3 = r0[r7]
                r6 = r8
                r8 = r7
                r7 = r6
            L28:
                int r3 = -r3
                int r7 = r7 + r3
                r3 = r4
                r6 = r8
                r8 = r7
                r7 = r6
                goto L12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.source.dash.manifest.Representation.AnonymousClass1.a(short, int, byte, java.lang.Object[]):void");
        }
    }

    public static Representation newInstance(long j, Format format, List<BaseUrl> list, SegmentBase segmentBase) {
        return newInstance(j, format, list, segmentBase, null, initExtraTracks.AudioAttributesImplApi26Parcelizer(), initExtraTracks.AudioAttributesImplApi26Parcelizer(), null);
    }

    public static Representation newInstance(long j, Format format, List<BaseUrl> list, SegmentBase segmentBase, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4, String str) {
        if (segmentBase instanceof SegmentBase.SingleSegmentBase) {
            return new SingleSegmentRepresentation(j, format, list, (SegmentBase.SingleSegmentBase) segmentBase, list2, list3, list4, str, -1L);
        }
        if (segmentBase instanceof SegmentBase.MultiSegmentBase) {
            return new MultiSegmentRepresentation(j, format, list, (SegmentBase.MultiSegmentBase) segmentBase, list2, list3, list4);
        }
        throw new IllegalArgumentException("segmentBase must be of type SingleSegmentBase or MultiSegmentBase");
    }

    private Representation(long j, Format format, List<BaseUrl> list, SegmentBase segmentBase, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4) {
        List<Descriptor> listUnmodifiableList;
        Assertions.checkArgument(!list.isEmpty());
        this.revisionId = j;
        this.format = format;
        this.baseUrls = initExtraTracks.write(list);
        if (list2 == null) {
            listUnmodifiableList = Collections.emptyList();
        } else {
            listUnmodifiableList = Collections.unmodifiableList(list2);
        }
        this.inbandEventStreams = listUnmodifiableList;
        this.essentialProperties = list3;
        this.supplementalProperties = list4;
        this.initializationUri = segmentBase.getInitialization(this);
        this.presentationTimeOffsetUs = segmentBase.getPresentationTimeOffsetUs();
    }

    public RangedUri getInitializationUri() {
        return this.initializationUri;
    }

    public static class SingleSegmentRepresentation extends Representation {
        private final String cacheKey;
        public final long contentLength;
        private final RangedUri indexUri;
        private final SingleSegmentIndex segmentIndex;
        public final Uri uri;

        public static SingleSegmentRepresentation newInstance(long j, Format format, String str, long j2, long j3, long j4, long j5, List<Descriptor> list, String str2, long j6) {
            return new SingleSegmentRepresentation(j, format, initExtraTracks.read(new BaseUrl(str)), new SegmentBase.SingleSegmentBase(new RangedUri(null, j2, (j3 - j2) + 1), 1L, 0L, j4, (j5 - j4) + 1), list, initExtraTracks.AudioAttributesImplApi26Parcelizer(), initExtraTracks.AudioAttributesImplApi26Parcelizer(), str2, j6);
        }

        public SingleSegmentRepresentation(long j, Format format, List<BaseUrl> list, SegmentBase.SingleSegmentBase singleSegmentBase, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4, String str, long j2) {
            super(j, format, list, singleSegmentBase, list2, list3, list4, null);
            this.uri = Uri.parse(list.get(0).url);
            RangedUri index = singleSegmentBase.getIndex();
            this.indexUri = index;
            this.cacheKey = str;
            this.contentLength = j2;
            this.segmentIndex = index != null ? null : new SingleSegmentIndex(new RangedUri(null, 0L, j2));
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        public RangedUri getIndexUri() {
            return this.indexUri;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        public DashSegmentIndex getIndex() {
            return this.segmentIndex;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        public String getCacheKey() {
            return this.cacheKey;
        }
    }

    public static class MultiSegmentRepresentation extends Representation implements DashSegmentIndex {
        final SegmentBase.MultiSegmentBase segmentBase;

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        public String getCacheKey() {
            return null;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        public DashSegmentIndex getIndex() {
            return this;
        }

        @Override // com.google.android.exoplayer2.source.dash.manifest.Representation
        public RangedUri getIndexUri() {
            return null;
        }

        public MultiSegmentRepresentation(long j, Format format, List<BaseUrl> list, SegmentBase.MultiSegmentBase multiSegmentBase, List<Descriptor> list2, List<Descriptor> list3, List<Descriptor> list4) {
            super(j, format, list, multiSegmentBase, list2, list3, list4, null);
            this.segmentBase = multiSegmentBase;
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public RangedUri getSegmentUrl(long j) {
            return this.segmentBase.getSegmentUrl(this, j);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getSegmentNum(long j, long j2) {
            return this.segmentBase.getSegmentNum(j, j2);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getTimeUs(long j) {
            return this.segmentBase.getSegmentTimeUs(j);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getDurationUs(long j, long j2) {
            return this.segmentBase.getSegmentDurationUs(j, j2);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getFirstSegmentNum() {
            return this.segmentBase.getFirstSegmentNum();
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getFirstAvailableSegmentNum(long j, long j2) {
            return this.segmentBase.getFirstAvailableSegmentNum(j, j2);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getSegmentCount(long j) {
            return this.segmentBase.getSegmentCount(j);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getAvailableSegmentCount(long j, long j2) {
            return this.segmentBase.getAvailableSegmentCount(j, j2);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public long getNextSegmentAvailableTimeUs(long j, long j2) {
            return this.segmentBase.getNextSegmentAvailableTimeUs(j, j2);
        }

        @Override // com.google.android.exoplayer2.source.dash.DashSegmentIndex
        public boolean isExplicit() {
            return this.segmentBase.isExplicit();
        }
    }
}
