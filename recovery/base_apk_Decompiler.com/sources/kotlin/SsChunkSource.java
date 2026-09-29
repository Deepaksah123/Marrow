package kotlin;

import android.content.Context;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.DataBufferRef;
import kotlin.SsManifest;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public final class SsChunkSource extends getStartTimeUs<SsManifest.IconCompatParcelizer> implements SsManifest.AudioAttributesCompatParcelizer {
    private static char[] AudioAttributesCompatParcelizer;
    private static char[] MediaBrowserCompatCustomActionResultReceiver;
    private static int MediaBrowserCompatSearchResultReceiver;
    private static char RatingCompat;
    private static long RemoteActionCompatParcelizer;
    private static /* synthetic */ isResolutionNotSupported<Object>[] write;
    private final setSessionInfo IconCompatParcelizer = parseTrackTiming.write(this, SessionDescriptionParser.RemoteActionCompatParcelizer(), new AudioAttributesCompatParcelizer());
    private String read;
    private static final byte[] $$l = {TarConstants.LF_FIFO, -78, 96, -9};
    private static final int $$o = 180;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {98, -46, 102, 39, 59, -63, -4, -21, 28, -21, -25, 5, -11, 1, 7, -2, -9, -25, -14, -8, -11, 9, 30, -40, -23, 5, -12, -5, 37, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19, -18, -4, 57, -62, -1, -24, -7, 9, -19, -12, 5, -5, 56, -66, 3, -8, -14, -14, -2, -5, 58, -60, -3, -25, 13, -7, -13, -11, 4, TarConstants.LF_NORMAL, -66, 0, -13, TarConstants.LF_BLK, -9, 0, -34, 0, -13, 20, -9, -39, -37, 5, -9, 66, -52, -21, -28, 29, -43, 3, 5, 17, -25, -18, 2, -58, 11, -11, -12, 40, -57, -6, -4, 3, 1, -25, -5, 9, -20, 42, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19};
    private static final int $$k = 176;
    private static final byte[] $$d = {TarConstants.LF_PAX_EXTENDED_HEADER_UC, 13, 21, 98, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 251;
    private static int MediaDescriptionCompat = 0;
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaMetadataCompat = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$r(short r6, int r7, short r8) {
        /*
            int r6 = r6 * 4
            int r0 = 1 - r6
            byte[] r1 = kotlin.SsChunkSource.$$l
            int r7 = r7 * 3
            int r7 = r7 + 101
            int r8 = r8 * 4
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SsChunkSource.$$r(short, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(byte r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 4
            int r8 = 114 - r8
            int r7 = 44 - r7
            byte[] r0 = kotlin.SsChunkSource.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r9
            r4 = r2
            goto L27
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L20
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L20:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r9 = -r9
            int r8 = r8 + r9
            int r8 = r8 + (-1)
            r9 = r3
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SsChunkSource.g(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = 58 - r8
            int r7 = r7 + 4
            int r9 = 114 - r9
            byte[] r0 = kotlin.SsChunkSource.$$j
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r9 = r7
            r3 = r8
            r4 = r2
            goto L27
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L27:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r9 + 1
            int r9 = r3 + (-6)
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SsChunkSource.h(int, short, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object write(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~i6;
        int i9 = ~i5;
        int i10 = (~(i8 | i9)) | i7;
        int i11 = ~(i6 | i3);
        int i12 = i5 | i11;
        int i13 = (~(i5 | i3)) | (~(i7 | i8 | i9)) | i11 | (~(i6 | i5));
        int i14 = i6 + i3 + i + (1272450877 * i2) + ((-51365948) * i4);
        int i15 = i14 * i14;
        int i16 = ((-261444822) * i6) + 922746880 + ((-1437248296) * i3) + ((-1175803474) * i10) + (i12 * 587901737) + (587901737 * i13) + ((-849346560) * i) + ((-1881145344) * i2) + ((-578813952) * i4) + ((-124846080) * i15);
        int i17 = (i6 * 1187242746) + 1002376400 + (i3 * 1187242392) + (i10 * (-354)) + (i12 * 177) + (i13 * 177) + (i * 1187242569) + (i2 * (-1484311963)) + (i4 * 1141305060) + (i15 * 516358144);
        return i16 + ((i17 * i17) * (-861863936)) != 1 ? write(objArr) : read(objArr);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private parseSegmentTemplate onFastForward() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 19;
        MediaBrowserCompatMediaItem = i2 % 128;
        return (parseSegmentTemplate) this.IconCompatParcelizer.read(this, i2 % 2 != 0 ? write[1] : write[0]);
    }

    public static final class AudioAttributesCompatParcelizer implements getAnswerMap<SsChunkSource, parseSegmentTemplate> {
        private static parseSegmentTemplate write(SsChunkSource ssChunkSource) {
            toMagicModuleMetaRepoModel.write(ssChunkSource, "");
            return parseSegmentTemplate.write(SessionDescriptionParser.AudioAttributesCompatParcelizer(ssChunkSource));
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [o.getApplicationLabel, o.parseSegmentTemplate] */
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ parseSegmentTemplate invoke(SsChunkSource ssChunkSource) {
            return write(ssChunkSource);
        }
    }

    private static void e(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        int i4 = $11 + 85;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (downloadService.write < i2) {
            int i6 = $11 + 109;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(AudioAttributesCompatParcelizer[i + i8])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (36621 - (ViewConfiguration.getScrollBarSize() >> 8)), 2340 - View.MeasureSpec.makeMeasureSpec(0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28, 480654850, false, $$r(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(RemoteActionCompatParcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - ImageFormat.getBitsPerPixel(0)), TextUtils.lastIndexOf("", '0', 0) + 9702, 26 - (ViewConfiguration.getTapTimeout() >> 16), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (AndroidCharacter.getMirror('0') - '0'), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 23785, 33 - (ViewConfiguration.getEdgeSlop() >> 16), -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
        char[] cArr = new char[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr5 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23783, Gravity.getAbsoluteGravity(0, 0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0105  */
    @Override // kotlin.getStartTimeUs, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2576
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SsChunkSource.onCreate(android.os.Bundle):void");
    }

    private static void f(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int length;
        char[] cArr2;
        int i3 = 2;
        int i4 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr3 = MediaBrowserCompatCustomActionResultReceiver;
        long j = 0;
        if (cArr3 != null) {
            int i5 = $10 + 39;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 39;
                $11 = i7 % 128;
                if (i7 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.getTrimmedLength(""), ExpandableListView.getPackedPositionType(j) + 7015, View.resolveSizeAndState(0, 0, 0) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i6])};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 7016 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 30 - KeyEvent.keyCodeFromString(""), -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i6++;
                }
                i3 = 2;
                j = 0;
            }
            cArr3 = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(RatingCompat)};
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        if (objRemoteActionCompatParcelizer3 == null) {
            objRemoteActionCompatParcelizer3 = startForeground.read((char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.indexOf("", "", 0) + 7015, 29 - TextUtils.lastIndexOf("", '0', 0), -626716224, false, "o", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i8 = $11 + 63;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            needsstartedservice.AudioAttributesCompatParcelizer = 0;
            int i10 = $11 + 111;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                } else {
                    Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(105000849);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (48194 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getLongPressTimeout() >> 16) + 20126, 20 - (ViewConfiguration.getEdgeSlop() >> 16), 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                        Object[] objArr6 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(50135433);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            objRemoteActionCompatParcelizer5 = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 19369, TextUtils.lastIndexOf("", '0', 0) + 19, 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).intValue();
                        int i12 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr3[iIntValue];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr3[i12];
                    } else if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                        int i13 = $11 + 31;
                        $10 = i13 % 128;
                        int i14 = i13 % 2;
                        needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                        needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                        int i15 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                        int i16 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr3[i15];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr3[i16];
                    } else {
                        int i17 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        int i18 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr3[i17];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr3[i18];
                    }
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
            }
        }
        for (int i19 = 0; i19 < i; i19++) {
            cArr4[i19] = (char) (cArr4[i19] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override // o.SsManifest.AudioAttributesCompatParcelizer
    public final void write(String str) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        this.read = str;
        onFastForward().read.setContent(multiplyFft.IconCompatParcelizer(289186412, true, new MagicModuleSubmissionRequestBody() { // from class: o.SsMediaSource1
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return SsChunkSource.read(this.write, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        }));
        int i2 = MediaBrowserCompatMediaItem + 29;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 13 / 0;
        }
    }

    private static final getShowPopup read(SsChunkSource ssChunkSource, String str) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 125;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            ((SsManifest.IconCompatParcelizer) ssChunkSource.getMPresenter()).AudioAttributesCompatParcelizer(str);
            return getShowPopup.INSTANCE;
        }
        toMagicModuleMetaRepoModel.write(str, "");
        ((SsManifest.IconCompatParcelizer) ssChunkSource.getMPresenter()).AudioAttributesCompatParcelizer(str);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final kotlin.getShowPopup AudioAttributesCompatParcelizer(final kotlin.SsChunkSource r7, kotlin._handleUnrecognizedCharacterEscape r8, int r9) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.SsChunkSource.MediaMetadataCompat
            int r1 = r1 + 39
            int r2 = r1 % 128
            kotlin.SsChunkSource.MediaBrowserCompatMediaItem = r2
            int r1 = r1 % r0
            r1 = r9 & 3
            if (r1 == r0) goto L12
            r1 = 1
            goto L13
        L12:
            r1 = 0
        L13:
            r2 = r9 & 1
            boolean r1 = r8.RemoteActionCompatParcelizer(r1, r2)
            if (r1 == 0) goto L7e
            int r1 = kotlin.SsChunkSource.MediaMetadataCompat
            int r1 = r1 + 17
            int r2 = r1 % 128
            kotlin.SsChunkSource.MediaBrowserCompatMediaItem = r2
            int r1 = r1 % r0
            boolean r1 = kotlin._validJsonValueList.AudioAttributesImplApi26Parcelizer()
            if (r1 == 0) goto L33
            r1 = -1
            java.lang.String r2 = "com.marrow.kt.ui.activities.profile.yearupdate.CollegeYearUpdateActivity.setStartYear.<anonymous> (CollegeYearUpdateActivity.kt:30)"
            r3 = 289186412(0x113ca26c, float:1.4880635E-28)
            kotlin._validJsonValueList.AudioAttributesCompatParcelizer(r3, r9, r1, r2)
        L33:
            java.lang.String r9 = r7.read
            if (r9 != 0) goto L3d
            java.lang.String r9 = ""
            kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer(r9)
            r9 = 0
        L3d:
            r1 = r9
            boolean r9 = r8.IconCompatParcelizer(r7)
            java.lang.Object r2 = r8.onPause()
            if (r9 != 0) goto L59
            int r9 = kotlin.SsChunkSource.MediaMetadataCompat
            int r9 = r9 + 3
            int r3 = r9 % 128
            kotlin.SsChunkSource.MediaBrowserCompatMediaItem = r3
            int r9 = r9 % r0
            o._handleUnrecognizedCharacterEscape$write r9 = kotlin._handleUnrecognizedCharacterEscape.INSTANCE
            java.lang.Object r9 = r9.IconCompatParcelizer()
            if (r2 != r9) goto L61
        L59:
            o.SsMediaPeriod r2 = new o.SsMediaPeriod
            r2.<init>()
            r8.RemoteActionCompatParcelizer(r2)
        L61:
            r3 = r2
            o.getAnswerMap r3 = (kotlin.getAnswerMap) r3
            r2 = 0
            r5 = 0
            r6 = 2
            r4 = r8
            kotlin.RtpPayloadReader.IconCompatParcelizer(r1, r2, r3, r4, r5, r6)
            boolean r7 = kotlin._validJsonValueList.AudioAttributesImplApi26Parcelizer()
            if (r7 == 0) goto L8a
            int r7 = kotlin.SsChunkSource.MediaMetadataCompat
            int r7 = r7 + 91
            int r8 = r7 % 128
            kotlin.SsChunkSource.MediaBrowserCompatMediaItem = r8
            int r7 = r7 % r0
            kotlin._validJsonValueList.AudioAttributesImplApi21Parcelizer()
            goto L8a
        L7e:
            r8.onPrepareFromSearch()
            int r7 = kotlin.SsChunkSource.MediaBrowserCompatMediaItem
            int r7 = r7 + 119
            int r8 = r7 % 128
            kotlin.SsChunkSource.MediaMetadataCompat = r8
            int r7 = r7 % r0
        L8a:
            o.getShowPopup r7 = kotlin.getShowPopup.INSTANCE
            int r8 = kotlin.SsChunkSource.MediaBrowserCompatMediaItem
            int r8 = r8 + 3
            int r9 = r8 % 128
            kotlin.SsChunkSource.MediaMetadataCompat = r9
            int r8 = r8 % r0
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SsChunkSource.AudioAttributesCompatParcelizer(o.SsChunkSource, o._handleUnrecognizedCharacterEscape, int):o.getShowPopup");
    }

    @Override // o.SsManifest.AudioAttributesCompatParcelizer
    public final void onCustomAction() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 97;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            setResult(-1);
            AudioAttributesImplBaseParcelizer();
            int i3 = MediaMetadataCompat + 105;
            MediaBrowserCompatMediaItem = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 39 / 0;
                return;
            }
            return;
        }
        setResult(-1);
        AudioAttributesImplBaseParcelizer();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object write(java.lang.Object[] r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SsChunkSource.write(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e9  */
    @Override // kotlin.getStartTimeUs, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SsChunkSource.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:(27:264|33|(3:35|36|(2:38|40)(1:39))(1:40)|75|254|76|(1:78)|79|(4:81|(1:83)|84|85)(18:86|271|87|(1:89)|90|91|265|92|(1:94)|95|96|97|(1:99)|100|(1:102)|103|(1:105)|106)|107|(5:112|(13:281|114|(3:116|(3:119|120|117)|285)|121|252|122|(1:124)|125|126|127|269|128|284)(3:280|141|283)|282|108|109)|279|111|164|(1:166)|167|(3:169|(1:171)|172)(13:174|277|175|176|(1:178)|179|260|180|181|(1:183)|184|(1:186)|187)|173|188|(6:190|191|(1:193)|194|195|196)|197|(1:199)|200|(3:202|(1:204)|205)(14:207|208|(1:210)|211|212|(1:214)|215|267|216|217|(1:219)|220|(1:222)|223)|206|224|(7:226|227|(1:229)|230|231|232|233)(1:286))|273|48|(1:50)|51|52|75|254|76|(0)|79|(0)(0)|107|(2:108|109)|279|111|164|(0)|167|(0)(0)|173|188|(0)|197|(0)|200|(0)(0)|206|224|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0be1, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0be2, code lost:
    
        r9 = new java.lang.Object[1];
        f((byte) (((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod(r8, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_track_resolution).substring(0, 4).length() + 41), ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod(r8, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_item_list).substring(0, 4).codePointAt(1) - 38, new char[]{16, 7, 19, 14, 23, 14, '\b', 11, 23, 14, 13783}, r9);
        r2 = (java.lang.String) r9[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0c4b, code lost:
    
        r5 = new java.io.ByteArrayOutputStream();
        r6 = new java.io.PrintStream(r5);
        r0.printStackTrace(r6);
        r6.close();
        r1 = r5.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0c62, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0c66, code lost:
    
        r5 = new java.util.ArrayList(2);
        r5.add(r1);
        r5.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0c75, code lost:
    
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0c79, code lost:
    
        if (r1 == null) goto L160;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0c7b, code lost:
    
        r1 = kotlin.startForeground.read((char) (4535 - android.widget.ExpandableListView.getPackedPositionGroup(0)), 6053 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()), android.view.View.MeasureSpec.getMode(0) + 42, -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0ca5, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0cb1, code lost:
    
        r7 = new java.lang.Object[]{1699254645, 81604378625L, r5, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r2 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0)), android.text.TextUtils.lastIndexOf("", '0', 0) + 6031, 24 - (android.view.ViewConfiguration.getMaximumFlingVelocity() >> 16));
        r5 = kotlin.SsChunkSource.$$j;
        r6 = r5[68];
        r5 = r5[22];
        r11 = new java.lang.Object[1];
        h(r6, r5, (byte) (r5 + 2), r11);
        r2.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0aa7 A[Catch: all -> 0x0be1, TRY_ENTER, TryCatch #1 {all -> 0x0be1, blocks: (B:76:0x062e, B:78:0x0634, B:79:0x0675, B:81:0x0682, B:83:0x068b, B:84:0x06d7, B:107:0x0a90, B:108:0x0a94, B:112:0x0aa7, B:114:0x0abd, B:117:0x0aca, B:119:0x0acd, B:126:0x0b3a, B:132:0x0bb8, B:134:0x0bbe, B:135:0x0bbf, B:137:0x0bc1, B:139:0x0bc8, B:140:0x0bc9, B:86:0x06ec, B:97:0x08c4, B:99:0x08ca, B:100:0x0915, B:102:0x09ed, B:103:0x0a32, B:105:0x0a47, B:106:0x0a8a, B:143:0x0bce, B:145:0x0bd5, B:146:0x0bd6, B:148:0x0bd8, B:150:0x0bdf, B:151:0x0be0, B:122:0x0afc, B:124:0x0b02, B:125:0x0b33, B:92:0x0831, B:94:0x0845, B:95:0x08b8, B:128:0x0b3f, B:87:0x07e4, B:89:0x07f9, B:90:0x082a), top: B:254:0x062e, outer: #3, inners: #0, #8, #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0d39  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0d88  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0de6  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x1160  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x1243  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x128f  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x12ea  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x1620  */
    /* JADX WARN: Removed duplicated region for block: B:286:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0634 A[Catch: all -> 0x0be1, TryCatch #1 {all -> 0x0be1, blocks: (B:76:0x062e, B:78:0x0634, B:79:0x0675, B:81:0x0682, B:83:0x068b, B:84:0x06d7, B:107:0x0a90, B:108:0x0a94, B:112:0x0aa7, B:114:0x0abd, B:117:0x0aca, B:119:0x0acd, B:126:0x0b3a, B:132:0x0bb8, B:134:0x0bbe, B:135:0x0bbf, B:137:0x0bc1, B:139:0x0bc8, B:140:0x0bc9, B:86:0x06ec, B:97:0x08c4, B:99:0x08ca, B:100:0x0915, B:102:0x09ed, B:103:0x0a32, B:105:0x0a47, B:106:0x0a8a, B:143:0x0bce, B:145:0x0bd5, B:146:0x0bd6, B:148:0x0bd8, B:150:0x0bdf, B:151:0x0be0, B:122:0x0afc, B:124:0x0b02, B:125:0x0b33, B:92:0x0831, B:94:0x0845, B:95:0x08b8, B:128:0x0b3f, B:87:0x07e4, B:89:0x07f9, B:90:0x082a), top: B:254:0x062e, outer: #3, inners: #0, #8, #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0682 A[Catch: all -> 0x0be1, TryCatch #1 {all -> 0x0be1, blocks: (B:76:0x062e, B:78:0x0634, B:79:0x0675, B:81:0x0682, B:83:0x068b, B:84:0x06d7, B:107:0x0a90, B:108:0x0a94, B:112:0x0aa7, B:114:0x0abd, B:117:0x0aca, B:119:0x0acd, B:126:0x0b3a, B:132:0x0bb8, B:134:0x0bbe, B:135:0x0bbf, B:137:0x0bc1, B:139:0x0bc8, B:140:0x0bc9, B:86:0x06ec, B:97:0x08c4, B:99:0x08ca, B:100:0x0915, B:102:0x09ed, B:103:0x0a32, B:105:0x0a47, B:106:0x0a8a, B:143:0x0bce, B:145:0x0bd5, B:146:0x0bd6, B:148:0x0bd8, B:150:0x0bdf, B:151:0x0be0, B:122:0x0afc, B:124:0x0b02, B:125:0x0b33, B:92:0x0831, B:94:0x0845, B:95:0x08b8, B:128:0x0b3f, B:87:0x07e4, B:89:0x07f9, B:90:0x082a), top: B:254:0x062e, outer: #3, inners: #0, #8, #10, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x06ec A[Catch: all -> 0x0be1, TRY_ENTER, TRY_LEAVE, TryCatch #1 {all -> 0x0be1, blocks: (B:76:0x062e, B:78:0x0634, B:79:0x0675, B:81:0x0682, B:83:0x068b, B:84:0x06d7, B:107:0x0a90, B:108:0x0a94, B:112:0x0aa7, B:114:0x0abd, B:117:0x0aca, B:119:0x0acd, B:126:0x0b3a, B:132:0x0bb8, B:134:0x0bbe, B:135:0x0bbf, B:137:0x0bc1, B:139:0x0bc8, B:140:0x0bc9, B:86:0x06ec, B:97:0x08c4, B:99:0x08ca, B:100:0x0915, B:102:0x09ed, B:103:0x0a32, B:105:0x0a47, B:106:0x0a8a, B:143:0x0bce, B:145:0x0bd5, B:146:0x0bd6, B:148:0x0bd8, B:150:0x0bdf, B:151:0x0be0, B:122:0x0afc, B:124:0x0b02, B:125:0x0b33, B:92:0x0831, B:94:0x0845, B:95:0x08b8, B:128:0x0b3f, B:87:0x07e4, B:89:0x07f9, B:90:0x082a), top: B:254:0x062e, outer: #3, inners: #0, #8, #10, #11 }] */
    @Override // kotlin.getStartTimeUs, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6007
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SsChunkSource.attachBaseContext(android.content.Context):void");
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(SsChunkSource ssChunkSource, String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 87;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopup = read(ssChunkSource, str);
        int i4 = MediaMetadataCompat + 67;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    public static /* synthetic */ getShowPopup read(SsChunkSource ssChunkSource, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2 = 2 % 2;
        int i3 = MediaBrowserCompatMediaItem + 25;
        MediaMetadataCompat = i3 % 128;
        if (i3 % 2 != 0) {
            return AudioAttributesCompatParcelizer(ssChunkSource, _handleunrecognizedcharacterescape, i);
        }
        AudioAttributesCompatParcelizer(ssChunkSource, _handleunrecognizedcharacterescape, i);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        MediaBrowserCompatSearchResultReceiver = 1;
        MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        write = new isResolutionNotSupported[]{toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(SsChunkSource.class, "binding", "getBinding()Lcom/marrow/databinding/ActivityProfileUpdateBinding;", 0))};
        int i = MediaDescriptionCompat + 19;
        MediaBrowserCompatSearchResultReceiver = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final int handleMediaPlayPauseIfPendingOnHandler() {
        Object[] objArr = {this};
        return ((Integer) write((-1588560450) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), -916448502, lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), DataBufferRef.AudioAttributesImplBaseParcelizer.read(), objArr, 916448503)).intValue();
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 99;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    @Override // kotlin.getStartTimeUs, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 41;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatMediaItem + 113;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 62 / 0;
        }
    }

    @Override // kotlin.getStartTimeUs, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() {
        int iAudioAttributesCompatParcelizer = lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer();
        write(lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), DataBufferRef.AudioAttributesImplBaseParcelizer.read(), -1148001435, lambdaonAudioUnderrun7.AudioAttributesCompatParcelizer(), iAudioAttributesCompatParcelizer, new Object[]{this}, 1148001435);
    }

    static void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        AudioAttributesCompatParcelizer = new char[]{3829, 17656, 39668, 53472, 9971, 31991, 45820, 2228, 24299, 38133, 60078, 8402, 30462, 52449, 747, 22767, 44743, 58565, 9864, 27806, 45748, 63626, 3721, 24854, 11035, 62743, 48899, 18704, 4884, 56607, 26455, 12550, 64277, 34067, 20303, 6446, 41742, 27935, 14080, 49441, 35644, 21799, 7976, 43275, 29493, 15657, 51004, 37158, 23329, 56431, 38459, 18488, 620, 62567, 44642, 24673, 55904, 35880, 17960, 14379, 61987, 42097, 7792, 53364, 35367, 31772, 13899, 59467, 41498, 5143, 52803, 32838, 31259, 11268, 58968, 22540, 4699, 50183, 48647, 28674, 10754, 39977, 22140, 2174, 49711, 46118, 28197, 8226, 39541, 19512, 1645, 63585, 45679, 25708, 56943, 36918, 18999, 56430, 38463, 18537, 622, 62517, 44596, 24675, 55866, 35960, 18042, 14381, 61995, 42028, 7799, 53364, 35446, 31764, 13903, 59466, 41499, 5142, 52759, 32787, 31248, 11269, 58971, 22620, 4611, 50183, 48640, 28673, 10762, 40056, 22063, 2175, 49711, 46117, 28195, 8307, 39460, 19565, 1644, 63549, 45674, 25655, 56932, 36960, 18995, 15449, 62986, 43022, 25099, 54357, 36432, 16467, 14849, 60493, 42524, 6221, 53784, 33858, 32321, 12358, 59978, 56420, 38522, 18556, 634, 62583, 44604, 24623, 55853, 35960, 18047, 14449, 62070, 42093, 7780, 53375, 35431, 31810, 13898, 59483, 41476, 5200, 52814, 32850, 31303, 11357, 58954, 22619, 4699, 50247, 48706, 28702, 10837, 39993, 22063, 2106, 49710, 46135, 28215, 8245, 39459, 19502, 1595, 63606, 45625, 25659, 56891, 36991, 18995, 15388, 62983, 43079, 25091, 54282, 36353, 16389, 14865, 60424, 42577, 6158, 53832, 33883, 32275, 12294, 59927, 23778, 5882, 51451, 40519, 54342, 2579, 16452, 46667, 60493, 8776, 38986, 52808, 1119, 31239, 45147, 58891, 23618, 37469, 51293, 15969, 29792, 43644, 57450, 22079, 35949, 49769, 14454, 28195, 42096, 6688, 20593, 34426, 64554, 12842, 26669, 56836, 5206, 18951, 32773, 43404, 58245, 15764, 30593, 33216, 56192, 5515, 44934, 63889, 13274, 19873, 34697, 53645, 27528, 42399, 65429, 39466, 53285, 3618, 17451, 45631, 59424, 9787, 39988, 51739, '0', 32292, 46141, 57880, 22582, 38459, 52280, 56429, 38496, 18540, 632, 62571, 44655, 24676, 55852, 35955, 18029, 14390, 62025, 42093, 7781, 53348, 35447, 31809, 13933, 59460, 41541, 5191, 52813, 11857, 25690, 47697, 61506, 1615, 23643, 37468, 10344, 32321, 46151, 51788, 'V', 22085, 60483, 8781, 34609, 52538, 4923, 22847, 44853, 62768, 15154, 33087, 55087, 7465, 25385};
        RemoteActionCompatParcelizer = -4676432955321706994L;
        MediaBrowserCompatCustomActionResultReceiver = new char[]{6429, 6407, 6406, 6488, 6425, 6408, 6474, 6431, 6465, 6401, 6426, 6478, 6410, 6428, 6492, 6427, 6476, 6430, 6473, 6416, 6417, 6411, 6468, 6403, 6424, 6400, 6404, 6402, 6471, 6490, 6475, 6477, 6505, 6470, 6405, 6493};
        RatingCompat = (char) 11444;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 19;
        int i3 = i2 % 128;
        MediaMetadataCompat = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 111;
        MediaBrowserCompatMediaItem = i5 % 128;
        if (i5 % 2 == 0) {
            return Integer.valueOf(R.layout.activity_profile_update);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
