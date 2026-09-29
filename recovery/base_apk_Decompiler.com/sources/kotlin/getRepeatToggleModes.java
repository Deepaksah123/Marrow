package kotlin;

import android.app.Application;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.marrow.TrainingApplication;
import com.marrow.data.models.common.ApplicationData;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes.dex */
public final class getRepeatToggleModes {
    private static int AudioAttributesCompatParcelizer;
    private static final byte[] AudioAttributesImplApi21Parcelizer;
    private static int AudioAttributesImplApi26Parcelizer;
    private static short[] AudioAttributesImplBaseParcelizer;
    private static int IconCompatParcelizer;
    private static int MediaBrowserCompatCustomActionResultReceiver;
    private static byte[] MediaBrowserCompatItemReceiver;
    private static final int MediaDescriptionCompat;
    private static long RemoteActionCompatParcelizer;
    private static int read;
    private static char[] write;
    private static final byte[] $$c = {122, -64, TarConstants.LF_SYMLINK, -113};
    private static final int $$d = 23;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {TarConstants.LF_GNUTYPE_LONGLINK, 28, -90, 102, 26, 12, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13};
    private static final int $$b = 173;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(short r6, int r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r0 = 1 - r7
            int r8 = r8 * 4
            int r8 = 4 - r8
            byte[] r1 = kotlin.getRepeatToggleModes.$$c
            int r6 = r6 * 11
            int r6 = 112 - r6
            byte[] r0 = new byte[r0]
            r2 = 0
            int r7 = 0 - r7
            if (r1 != 0) goto L19
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L2a
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L2a:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2f:
            int r8 = r8 + 1
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getRepeatToggleModes.$$e(short, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 73
            byte[] r0 = kotlin.getRepeatToggleModes.$$a
            int r8 = r8 + 4
            int r6 = r6 * 2
            int r1 = 20 - r6
            byte[] r1 = new byte[r1]
            int r6 = 19 - r6
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2f
        L16:
            r3 = r2
        L17:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2f:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getRepeatToggleModes.d(byte, short, int, java.lang.Object[]):void");
    }

    private static <T> Pair<Long, T> RemoteActionCompatParcelizer(getCreatedOnDateMs<? extends T> getcreatedondatems) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        long jNanoTime = System.nanoTime();
        Pair<Long, T> pair = new Pair<>(Long.valueOf(System.nanoTime() - jNanoTime), getcreatedondatems.invoke());
        int i2 = read + 113;
        AudioAttributesCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 72 / 0;
        }
        return pair;
    }

    private static final String read(TrainingApplication trainingApplication, String str) throws Throwable {
        int i = 2 % 2;
        TrainingApplication trainingApplication2 = trainingApplication;
        TrainingApplication trainingApplication3 = trainingApplication;
        getSampleFormats getsampleformatsMediaBrowserCompatSearchResultReceiver = trainingApplication.MediaBrowserCompatSearchResultReceiver();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(getsampleformatsMediaBrowserCompatSearchResultReceiver, "");
        try {
            Object[] objArr = {trainingApplication2, trainingApplication3, getsampleformatsMediaBrowserCompatSearchResultReceiver};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(2027788568);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (52128 - TextUtils.lastIndexOf("", '0', 0, 0)), 19716 - View.resolveSizeAndState(0, 0, 0), 21 - Gravity.getAbsoluteGravity(0, 0), 110386573, false, null, new Class[]{Application.class, ApplicationData.class, getSampleFormats.class});
            }
            Object objNewInstance = ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr);
            Object[] objArr2 = {str};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-951227335);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) (52129 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), 19717 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 21, -1190877012, false, "write", new Class[]{String.class});
            }
            String str2 = (String) ((Method) objRemoteActionCompatParcelizer2).invoke(objNewInstance, objArr2);
            int i2 = read + 93;
            AudioAttributesCompatParcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                return str2;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0060, code lost:
    
        if ((r5 % 2) != 0) goto L12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0062, code lost:
    
        return r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0063, code lost:
    
        r5 = null;
        r5.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0067, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0073, code lost:
    
        return new kotlin.buildDownloadFailedNotification(r1.ordinal(), "", 0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0022, code lost:
    
        if (r1 == o.InteractiveVideoElementLSModel.read.write) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0033, code lost:
    
        if (r1 == o.InteractiveVideoElementLSModel.read.write) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0035, code lost:
    
        r5 = RemoteActionCompatParcelizer(new kotlin.hideAfterTimeout(r5, r6));
        r2 = ((java.lang.Number) r5.RemoteActionCompatParcelizer()).longValue();
        r6 = new kotlin.buildDownloadFailedNotification(r1.ordinal(), (java.lang.String) r5.read(), r2);
        r5 = kotlin.getRepeatToggleModes.read + 41;
        kotlin.getRepeatToggleModes.AudioAttributesCompatParcelizer = r5 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final kotlin.buildDownloadFailedNotification AudioAttributesCompatParcelizer(final com.marrow.TrainingApplication r5, final java.lang.String r6) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.getRepeatToggleModes.AudioAttributesCompatParcelizer
            int r1 = r1 + 49
            int r2 = r1 % 128
            kotlin.getRepeatToggleModes.read = r2
            int r1 = r1 % r0
            java.lang.String r2 = ""
            if (r1 != 0) goto L25
            kotlin.toMagicModuleMetaRepoModel.write(r5, r2)
            kotlin.toMagicModuleMetaRepoModel.write(r6, r2)
            o.InteractiveVideoElementLSModel$IconCompatParcelizer r1 = kotlin.InteractiveVideoElementLSModel.INSTANCE
            o.InteractiveVideoElementLSModel$read r1 = kotlin.InteractiveVideoElementLSModel.Companion.read()
            o.InteractiveVideoElementLSModel$read r3 = o.InteractiveVideoElementLSModel.read.write
            r4 = 67
            int r4 = r4 / 0
            if (r1 != r3) goto L68
            goto L35
        L25:
            kotlin.toMagicModuleMetaRepoModel.write(r5, r2)
            kotlin.toMagicModuleMetaRepoModel.write(r6, r2)
            o.InteractiveVideoElementLSModel$IconCompatParcelizer r1 = kotlin.InteractiveVideoElementLSModel.INSTANCE
            o.InteractiveVideoElementLSModel$read r1 = kotlin.InteractiveVideoElementLSModel.Companion.read()
            o.InteractiveVideoElementLSModel$read r3 = o.InteractiveVideoElementLSModel.read.write
            if (r1 != r3) goto L68
        L35:
            o.hideAfterTimeout r2 = new o.hideAfterTimeout
            r2.<init>()
            o.getSubscriptionExpiresOn r5 = RemoteActionCompatParcelizer(r2)
            java.lang.Object r6 = r5.RemoteActionCompatParcelizer()
            java.lang.Number r6 = (java.lang.Number) r6
            long r2 = r6.longValue()
            java.lang.Object r5 = r5.read()
            java.lang.String r5 = (java.lang.String) r5
            o.buildDownloadFailedNotification r6 = new o.buildDownloadFailedNotification
            int r1 = r1.ordinal()
            r6.<init>(r1, r5, r2)
            int r5 = kotlin.getRepeatToggleModes.read
            int r5 = r5 + 41
            int r1 = r5 % 128
            kotlin.getRepeatToggleModes.AudioAttributesCompatParcelizer = r1
            int r5 = r5 % r0
            if (r5 != 0) goto L63
            return r6
        L63:
            r5 = 0
            r5.hashCode()
            throw r5
        L68:
            o.buildDownloadFailedNotification r5 = new o.buildDownloadFailedNotification
            int r6 = r1.ordinal()
            r0 = 0
            r5.<init>(r6, r2, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getRepeatToggleModes.AudioAttributesCompatParcelizer(com.marrow.TrainingApplication, java.lang.String):o.buildDownloadFailedNotification");
    }

    private static void c(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        downloadService.write = 0;
        int i5 = $11 + 71;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (downloadService.write < i) {
            int i7 = $11 + 47;
            $10 = i7 % 128;
            if (i7 % i3 != 0) {
                int i8 = downloadService.write;
                try {
                    Object[] objArr2 = {Integer.valueOf(write[i2 + i8])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 36622);
                        int offsetAfter = 2340 - TextUtils.getOffsetAfter("", 0);
                        int size = View.MeasureSpec.getSize(0) + 28;
                        byte b = (byte) ($$d & 1);
                        byte b2 = (byte) (b - 1);
                        objRemoteActionCompatParcelizer = startForeground.read(cIndexOf, offsetAfter, size, 480654850, false, $$e(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(RemoteActionCompatParcelizer), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 9701 - Color.alpha(0), TextUtils.getOffsetAfter("", 0) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i8] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {downloadService, downloadService};
                            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                            if (objRemoteActionCompatParcelizer3 == null) {
                                objRemoteActionCompatParcelizer3 = startForeground.read((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 23784 - ExpandableListView.getPackedPositionGroup(0L), Process.getGidForName("") + 34, -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
            } else {
                int i9 = downloadService.write;
                Object[] objArr5 = {Integer.valueOf(write[i2 + i9])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char c2 = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 36620);
                    int packedPositionChild = 2339 - ExpandableListView.getPackedPositionChild(0L);
                    int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 28;
                    byte b3 = (byte) ($$d & 1);
                    byte b4 = (byte) (b3 - 1);
                    objRemoteActionCompatParcelizer4 = startForeground.read(c2, packedPositionChild, threadPriority, 480654850, false, $$e(b3, b4, b4), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).longValue()), Long.valueOf(i9), Long.valueOf(RemoteActionCompatParcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) KeyEvent.keyCodeFromString(""), TextUtils.lastIndexOf("", '0', 0, 0) + 9702, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 25, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i9] = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getTapTimeout() >> 16) + 23784, (-16777183) - Color.rgb(0, 0, 0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
            i3 = 2;
        }
        char[] cArr = new char[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            try {
                Object[] objArr8 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23784, View.getDefaultSize(0, 0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr8);
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        objArr[0] = new String(cArr);
    }

    private static void b(int i, short s, int i2, byte b, int i3, Object[] objArr) throws Throwable {
        long j;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getLongPressTimeout() >> 16) + 24297, '<' - AndroidCharacter.getMirror('0'), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            int i4 = iIntValue == -1 ? 1 : 0;
            if (i4 == 0) {
                j = 7899112766888837815L;
            } else {
                byte[] bArr = MediaBrowserCompatItemReceiver;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    for (int i5 = 0; i5 < length; i5++) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i5])};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.alpha(0), View.MeasureSpec.getMode(0) + 3082, (ViewConfiguration.getEdgeSlop() >> 16) + 128, 2145850993, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i5] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = MediaBrowserCompatItemReceiver;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(IconCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getTapTimeout() >> 16), 24297 - ExpandableListView.getPackedPositionType(0L), 12 - View.resolveSizeAndState(0, 0, 0), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ 7899112766888837815L)));
                    j = 7899112766888837815L;
                } else {
                    j = 7899112766888837815L;
                    iIntValue = (short) (((short) (((long) AudioAttributesImplBaseParcelizer[i2 + ((int) (((long) IconCompatParcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ 7899112766888837815L)));
                }
            }
            if (iIntValue > 0) {
                buildresumedownloadsintent.read = ((i2 + iIntValue) - 2) + ((int) (((long) IconCompatParcelizer) ^ j)) + i4;
                Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i), Integer.valueOf(AudioAttributesImplApi26Parcelizer), sb};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (34135 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 13433, 20 - TextUtils.lastIndexOf("", '0'), 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr4 = MediaBrowserCompatItemReceiver;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i6 = 0; i6 < length2; i6++) {
                        bArr5[i6] = (byte) (((long) bArr4[i6]) ^ 7899112766888837815L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    if (z) {
                        byte[] bArr6 = MediaBrowserCompatItemReceiver;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r7]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        short[] sArr = AudioAttributesImplBaseParcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r7]) ^ 7899112766888837815L)) + s)) ^ b));
                    }
                    sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    public static /* synthetic */ String RemoteActionCompatParcelizer(TrainingApplication trainingApplication, String str) throws Throwable {
        int i = 2 % 2;
        int i2 = read + 97;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        String str2 = read(trainingApplication, str);
        int i4 = read + 19;
        AudioAttributesCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return str2;
    }

    /* JADX WARN: Removed duplicated region for block: B:146:0x0946 A[Catch: all -> 0x09ce, TryCatch #11 {all -> 0x09ce, blocks: (B:135:0x092e, B:136:0x0932, B:144:0x093f, B:146:0x0946, B:147:0x0947, B:151:0x0955, B:152:0x0960, B:153:0x0978, B:160:0x099b, B:161:0x09a6, B:162:0x09bd), top: B:277:0x092e }] */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0947 A[Catch: all -> 0x09ce, TryCatch #11 {all -> 0x09ce, blocks: (B:135:0x092e, B:136:0x0932, B:144:0x093f, B:146:0x0946, B:147:0x0947, B:151:0x0955, B:152:0x0960, B:153:0x0978, B:160:0x099b, B:161:0x09a6, B:162:0x09bd), top: B:277:0x092e }] */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0a17  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0a1d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0a28  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0a54  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0ab2  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0ac7 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void IconCompatParcelizer(android.content.Context r23, long r24, long r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2912
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getRepeatToggleModes.IconCompatParcelizer(android.content.Context, long, long):void");
    }

    static {
        byte[] bArr = new byte[629];
        System.arraycopy("\u000b®\u009eäî\u0005íþ\u0001\u00001º÷@ÙÙþ\u0007ùíûï æ\u0000î\u0005íþ\u0001\u00001³\bÿéDÓèÿé/Ïü\u0003øýíþ\fè\u0006õüýì+Ðõ\u000eñ\u0002\fîì\u0017æ÷\u0003ñõüî\u0005íþ\u0001\u00001³\bÿéDÓèÿé\bíÿþñ\f\råê\u0010\u001fÎ\u0005\fÚ\u000eè\nïý\u0006ôö\u0004\u0013ãÿéùþ\bü\fÚ\u000eè\níî\u0005íþ\u0001\u00001µ\nèÿAÕêèÿ\u001aÜ\u0006øô\u0006éú&Ö\u0005úè$ä\u0004æ\u0010.½\u0006î\u00024æÖ\u0002ê\u001aéï÷\u000bò\u0006ùî\u0005íþ\u0001\u00001Âð\fì\u0003ú\u0001ë@æÏþøøð\bûòî\u0005íþ\u0001\u00001º÷@ÖÕ\u0001ú\nó%Òø\u0007ó\u0000÷\u0006÷\u0003\u0013ßøûþñýì(Öø\büð&Ùê\u0006õü\u001eáç æ÷\u0003ñõüî\u0005íþ\u0001\u00001²\t\u0000øýìAäÈ\u0003\nî\u0005þúñ\u0002\u0014Þñú\u0019èÿéýì\u001fêùó\u0001ü\u000fÜ÷\u0005ð\u0006õü#Òø&Ðþõ\u0000\u0004æ\u0010.½\u0006î\u00024ÖÚý\u0004ö\u0002þÿþð\u0004æ\u0010.½\u0006î\u00024àÖõ\nùýî\u0010ðò\u000b\u0011äöõ\u0019ððò\u000býì\"ßö\u0000÷ó\u0003\"Õþö\u0002\fìôø\u0007õðöî\u0005íþ\u0001\u00001³\bÿéDÞáç/Ê\fòõúø\u0000\u0007ðþê\u0010\u0013ãì\u000e\tÚ\u000eè\nî\u0005íþ\u0001\u00001³\bÿéDÓèÿéNÒãÿéùþ\b\rÞ\u0006ý\u0007ñ\u0001\u0013ãÿéùþ\b\rÞ\u0006ý\u0004æ\u0010.½\u0006î\u00024Õçñþó\u0011úñ\u0002ýì,Ýçý\t\u0004æ\u0010.½\u0006î\u00024Úèó\u0000ýê\u0004æ\u0010.½\u0006î\u00024ÝØü\u0002ö\u0004\u0006\u0004æ\u0010.½\u0006î\u00024·\búõ\u0002ýêAèÙûùíû\u0005\u0002ñ\u0002\u0011èó\u0000ýê\tì.Ùûùíû\u0005\u0002ñ\u0002\u0004æ\u0010.½\u0006î\u00024·\búõ\u0002ýêAÜãì\u0007ô\u0006öó\u0002ÿ\u0001\nÝ\u0004æ\u0010.½\u0006î\u00024Úèó\u0000ýê4\u0004æ\u0010.½\u0006î\u00024äÈ\u0010ùð÷\u0006õü".getBytes(CharsetNames.ISO_8859_1), 0, bArr, 0, 629);
        AudioAttributesImplApi21Parcelizer = bArr;
        MediaDescriptionCompat = 79;
        IconCompatParcelizer();
        AudioAttributesCompatParcelizer = 0;
        read = 1;
        write = new char[]{56424, 51979, 62122};
        RemoteActionCompatParcelizer = -5582349790916457618L;
    }

    static void IconCompatParcelizer() {
        IconCompatParcelizer = -1288186199;
        MediaBrowserCompatCustomActionResultReceiver = 808745309;
        AudioAttributesImplApi26Parcelizer = 1625631966;
        MediaBrowserCompatItemReceiver = new byte[]{-73, -77, -74, TarConstants.LF_GNUTYPE_LONGNAME, -73, -77, -74, 79, -74, -79, -74, 79, -74, -79, -74, 78, -73, -79, -74, 77, 72, -79, -74, TarConstants.LF_GNUTYPE_LONGLINK, TarConstants.LF_GNUTYPE_LONGLINK, -65, TarConstants.LF_GNUTYPE_LONGNAME, 73, -79, -74, 67, -78, -80, 66, -77, -80, TarConstants.LF_GNUTYPE_LONGLINK, 74, -79, -74, 68, -80, -78, -74, 68, -80, -78, -74, 67, -79, -78, -74, 66, -78, -78, -74, 77, 72, -80, TarConstants.LF_GNUTYPE_LONGLINK, 73, -79, 65, -77, -78, -74, 77, 72, -80, 64, -75, -80, 79, -74, -80, 64, -76, -78, -74, 79, -75, -78, -74, 68, -65, -78, 78, -73, -80, 78, -74, -78, -74, 68, -65, -78, 77, 72, -80, TarConstants.LF_GNUTYPE_LONGLINK, 73, -79, TarConstants.LF_GNUTYPE_LONGLINK, 73, -79, 77, -73, -78, -74, 68, -65, -78, TarConstants.LF_GNUTYPE_LONGNAME, 72, -78, -74, 66, -79, -78, TarConstants.LF_GNUTYPE_LONGNAME, 73, -80, TarConstants.LF_GNUTYPE_LONGLINK, 73, -78, -74, TarConstants.LF_GNUTYPE_LONGLINK, 74, -80, 68, -65, -77, -74, 68, -80, -79, 67, -80, -77, -74, 79, -75, -79, 67, -79, -79, 66, -79, -77, -74, 66, -78, -79, 65, -78, -77, -74, TarConstants.LF_GNUTYPE_LONGLINK, 73, -79, 64, -77, -77, -74, 79, -76, -77, -74, 64, -76, -79, 68, -70, 66, -79, -78, 65, -77, -79, 64, -76, -79, 79, -75, -79, 66, -79, -78, 78, -74, -79, 78, -75, -77, -74, 68, -65, -78, TarConstants.LF_GNUTYPE_LONGNAME, 72, -79, 77, -74, -77, -74, TarConstants.LF_GNUTYPE_LONGLINK, 73, -79, TarConstants.LF_GNUTYPE_LONGNAME, -73, -77, -74, 68, -65, -78, TarConstants.LF_GNUTYPE_LONGNAME, -73, -77, -74, 68, -65, -78, 66, -79, -78, TarConstants.LF_GNUTYPE_LONGLINK, 72, -77, -74, 68, -69, -74, 67, -68, -74, 64, -77, -78, 66, -67, -74, 64, -77, -78, 65, -66, -74, TarConstants.LF_GNUTYPE_LONGNAME, -78, 64, -65, -74, 79, -80, -74, 68, -70, 77, -74, -78, 78, -79, -74, 68, -70, 67, -69, 66, -68, 65, -67, 77, -78, -74, 79, -65, 78, -80, 77, -79, TarConstants.LF_GNUTYPE_LONGNAME, -78, TarConstants.LF_GNUTYPE_LONGNAME, -77};
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = 610 - r7
            byte[] r0 = kotlin.getRepeatToggleModes.AudioAttributesImplApi21Parcelizer
            int r5 = r5 + 84
            int r1 = r6 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            int r7 = r7 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r3 = r0[r7]
        L26:
            int r3 = -r3
            int r5 = r5 + r3
            int r5 = r5 + (-5)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getRepeatToggleModes.a(byte, byte, short, java.lang.Object[]):void");
    }
}
