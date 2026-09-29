package com.google.android.gms.measurement;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.internal.zzkf;
import com.google.android.gms.measurement.internal.zzkg;
import java.lang.reflect.Method;
import kotlin.DownloadService;
import kotlin.buildResumeDownloadsIntent;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final class AppMeasurementJobService extends JobService implements zzkf {
    private static short[] AudioAttributesCompatParcelizer;
    private zzkg zza;
    private static final byte[] $$c = {20, 28, 18, 12};
    private static final int $$f = 164;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {42, 85, 82, -118, -23, -12, -6, -9, 11, 32, -38, -21, 7, -10, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17, 61, -61, -2, -19, 34, -27, -19, -7, 4, -7, 3, 19, -41, 5, 7, 27, -48, -1, -2, 38, -48, -3, -4, 5, -2, -21, 7, -17, 9, -15, -9, 40, -24, -17, 9, -10, -2, -17, 1, 5, -15, 11};
    private static final int $$e = 162;
    private static final byte[] $$a = {62, -102, -38, -78, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 110;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int AudioAttributesImplApi21Parcelizer = 1;
    private static int write = -770442982;
    private static int IconCompatParcelizer = -819363186;
    private static int RemoteActionCompatParcelizer = 476570;
    private static byte[] read = {110, -73, -71, -75, 67, 74, -107, -107, 12, -77, -10, 125, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -71, 65, -70, -67, 72, -79, -66, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -90, -127, 74, 11, -16, 12, -74, -71, 73, 78, -78, -115, 113, 78, -72, -123, 117, 73, -69, -126, 126, 68, -90, 91, -77, 73, -72, 69, -90, 91, -71, -114, 13, -74, -91, 73, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -92, TarConstants.LF_GNUTYPE_LONGLINK, 68, -67, 67, -15, 12, -72, 65, 78, -79, 74, 78, -70, -76, -65, 74, -126, -73, 66, 112, -76, TarConstants.LF_GNUTYPE_LONGLINK, -73, -69, 122, -77, 77, -76, -76, 66, 101, -75, TarConstants.LF_GNUTYPE_LONGLINK, 73, -74, -77, 72, -77, 77, -78, 78, 96, -65, 70, -74, 77, -111, -110, 112, 78, -70, 66, -119, 122, 92, -94, 64, 97, 79, -77, 66, -65, -68, TarConstants.LF_GNUTYPE_LONGLINK, -92, 89, 72, 69, -76, -72, 66, -80, 101, 77, 74, -80, TarConstants.LF_GNUTYPE_LONGNAME, -74, 74, -78, TarConstants.LF_GNUTYPE_LONGNAME, -80, 73};
    private static char[] MediaBrowserCompatItemReceiver = {21728, 19514, 25924, 7822, 14289, 56431, 50423, 60832, 38400, 48983, 41070, 18617, 29132, 6728, 772, 9267, 52463, 62913, 40476, 34604, 43051, 20700, 31175, 25107, 2934, 11303, 54415, 64990, 59063, 36708, 45172, 22740, 16855, 27319, 4971, 13338, 56526, 50601, 61104, 38758, 47171, 41110, 18857, 29434, 7001, 15448, 9409, 52729, 63139, 40796, 32771, 43374, 20923, 58343, 64378, 53800, 43405, 32984, 40880, 30516, 20035, 9618, 15582, 7103, 62319, 51791, 41360, 47351, 38899, 28502, 17948, 24010, 13476, 5113, 60169, 49751, 55660, 45285, 36856, 26378, 32349, 21862, 11446, 3009, 58133, 64039, 53613, 43241, 34766, 40777, 30243, 19824, 9349, 991, 6942, 62073, 51497, 41179, 49031, 38626, 28257, 17735, 23680, 15326, 4845, 59966, 49480, 55447, 47008, 36607, 26223, 32030, 21710, 13226, 2724, 57856, 63826, 30687, 28482, 17984, 15795, 5300, 2953, 58122, 55847, 45481, 43239, 36740, 26454, 24109, 13738, 11421, 971, 64357, 53874, 51619, 41158, 34711, 32618, 22074, 19725, 9428, 7110, 62261, 59966, 49414, 47325, 40872, 30583, 28233, 17746, 15574, 5106, 2852, 57886, 55578, 45241, 38844, 36721, 26132, 23831, 13494, 11193, 649, 64014, 53544, 51383, 45031, 34518, 32340, 21805, 19706, 9116, 6812, 61953, 59684, 49317, 42947, 40604, 30319, 27959, 30480, 28637, 18140, 15743, 5164, 2838, 58311, 55985, 45439, 43044, 36680, 26560, 24300, 13689, 11346, 774, 64502, 53947, 51571, 41041, 34648, 32758, 22182, 19853, 9236, 6923, 62383, 60074, 49565, 47121, 40805, 30646, 28371, 17869, 15432, 4926, 56421, 50342, 60917, 38408, 48960, 41059, 18604, 29143, 6708, 851, 9331, 52414, 62951, 40469, 34604, 43131, 56429, 50348, 60916, 38420, 48987, 41059, 18620, 29056, 6675, 833, 9262, 52357, 62941, 40457, 34620, 43131, 20609, 31201, 25116, 2857, 11383, 54401};
    private static long AudioAttributesImplApi26Parcelizer = -6404119002772683582L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r6, int r7, int r8) {
        /*
            byte[] r0 = com.google.android.gms.measurement.AppMeasurementJobService.$$c
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r6 = r6 + 1
            int r8 = r8 * 11
            int r8 = r8 + 101
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r7]
        L27:
            int r7 = r7 + 1
            int r8 = r8 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurementJobService.$$g(int, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = 114 - r8
            int r0 = 44 - r6
            byte[] r1 = com.google.android.gms.measurement.AppMeasurementJobService.$$a
            byte[] r0 = new byte[r0]
            int r6 = 43 - r6
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurementJobService.c(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r6 = 119 - r6
            byte[] r0 = com.google.android.gms.measurement.AppMeasurementJobService.$$d
            int r8 = r8 + 5
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r7
            r4 = r2
            goto L29
        L10:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r6]
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L29:
            int r6 = -r6
            int r7 = r7 + r6
            int r7 = r7 + (-4)
            int r6 = r3 + 1
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurementJobService.d(short, byte, byte, java.lang.Object[]):void");
    }

    private final zzkg zzd() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 11;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        if (this.zza == null) {
            this.zza = new zzkg(this);
            int i4 = AudioAttributesImplApi21Parcelizer + 33;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            if (i4 % 2 != 0) {
                int i5 = 4 / 3;
            }
        }
        return this.zza;
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 31;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        zzd().zzg(intent);
        if (i3 == 0) {
            throw null;
        }
        int i4 = AudioAttributesImplBaseParcelizer + 39;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 111;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zzd().zzi(jobParameters);
        int i4 = AudioAttributesImplApi21Parcelizer + 115;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 13;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zzd().zzj(intent);
        return i3 == 0;
    }

    @Override // com.google.android.gms.measurement.internal.zzkf
    public final void zzb(JobParameters jobParameters, boolean z) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 115;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        jobFinished(jobParameters, false);
        int i4 = AudioAttributesImplApi21Parcelizer + 105;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.measurement.internal.zzkf
    public final boolean zzc(int i) {
        int i2 = 2 % 2;
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final void onCreate() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 69;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate();
        zzd().zze();
        int i4 = AudioAttributesImplApi21Parcelizer + 67;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 99 / 0;
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 47;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        zzd().zzf();
        super.onDestroy();
        int i4 = AudioAttributesImplApi21Parcelizer + 35;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i4 = $10 + 55;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(MediaBrowserCompatItemReceiver[i2 + i6])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (36621 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), Color.blue(0) + 2340, 'L' - AndroidCharacter.getMirror('0'), 480654850, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(AudioAttributesImplApi26Parcelizer), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) View.getDefaultSize(0, 0), 9701 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 26 - Color.alpha(0), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {downloadService, downloadService};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getLongPressTimeout() >> 16), 23784 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getEdgeSlop() >> 16) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
            int i7 = $11 + 111;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr5 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (MotionEvent.axisFromString("") + 1), 23784 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getPressedStateDuration() >> 16) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            int i9 = $10 + 105;
            $11 = i9 % 128;
            int i10 = i9 % 2;
        }
        objArr[0] = new String(cArr);
    }

    private static void a(byte b, int i, int i2, short s, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int i4;
        boolean z2;
        int i5 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IconCompatParcelizer)};
            int i6 = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            long j2 = 0;
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (ExpandableListView.getPackedPositionChild(0L) + 1), 24296 - TextUtils.indexOf((CharSequence) "", '0'), 12 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i7 = $11 + 51;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                int i9 = $10 + 25;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                byte[] bArr = read;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i11 = 0;
                    while (i11 < length) {
                        try {
                            Object[] objArr3 = new Object[1];
                            objArr3[i6] = Integer.valueOf(bArr[i11]);
                            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                byte b2 = (byte) i6;
                                byte b3 = b2;
                                objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (SystemClock.elapsedRealtimeNanos() > j2 ? 1 : (SystemClock.elapsedRealtimeNanos() == j2 ? 0 : -1)) + 3081, 128 - TextUtils.indexOf("", ""), 2145850993, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                            }
                            bArr2[i11] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                            i11++;
                            i6 = 0;
                            j2 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = read;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(write)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf((CharSequence) "", '0') + 24298, (ViewConfiguration.getEdgeSlop() >> 16) + 12, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) IconCompatParcelizer) ^ 7899112766888837815L)));
                    j = 7899112766888837815L;
                } else {
                    j = 7899112766888837815L;
                    iIntValue = (short) (((short) (((long) AudioAttributesCompatParcelizer[i2 + ((int) (((long) write) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) IconCompatParcelizer) ^ 7899112766888837815L)));
                }
            } else {
                j = 7899112766888837815L;
            }
            if (iIntValue > 0) {
                int i12 = ((i2 + iIntValue) - 2) + ((int) (((long) write) ^ j));
                if (z) {
                    int i13 = $11 + 87;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                buildresumedownloadsintent.read = i12 + i4;
                Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i), Integer.valueOf(RemoteActionCompatParcelizer), sb};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (34134 - (Process.myTid() >> 22)), TextUtils.indexOf("", "") + 13432, 20 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr4 = read;
                if (bArr4 != null) {
                    int i15 = $11 + 83;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i17 = 0; i17 < length2; i17++) {
                        int i18 = $11 + 43;
                        $10 = i18 % 128;
                        int i19 = i18 % 2;
                        bArr5[i17] = (byte) (((long) bArr4[i17]) ^ 7899112766888837815L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i20 = $10 + 39;
                    $11 = i20 % 128;
                    int i21 = i20 % 2;
                    z2 = true;
                } else {
                    z2 = false;
                }
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    if (z2) {
                        byte[] bArr6 = read;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        short[] sArr = AudioAttributesCompatParcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                    }
                    sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:(27:33|253|34|(3:36|37|(2:39|41)(1:40))(1:41)|77|275|78|(1:80)|81|(3:83|(1:85)|86)(19:87|88|262|89|(1:91)|92|93|254|94|(1:96)|97|98|99|(1:101)|102|(1:104)|105|(1:107)|108)|109|(4:112|(12:114|(3:116|(3:119|120|117)|283)|121|264|122|(1:124)|125|126|127|256|128|282)(1:281)|141|110)|280|165|(1:167)|168|(3:170|(1:172)|173)(13:175|260|176|177|(1:179)|180|273|181|182|(1:184)|185|(1:187)|188)|174|189|(6:191|192|(1:194)|195|196|197)|198|(1:200)|201|(3:203|(1:205)|206)(14:208|209|(1:211)|212|213|(1:215)|216|278|217|218|(1:220)|221|(1:223)|224)|207|225|(7:227|228|(1:230)|231|232|233|234)(1:284))|276|46|(1:48)|49|266|50|(1:52)|53|54|77|275|78|(0)|81|(0)(0)|109|(1:110)|280|165|(0)|168|(0)(0)|174|189|(0)|198|(0)|201|(0)(0)|207|225|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0d9a, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0d9b, code lost:
    
        r8 = new java.lang.Object[1];
        a((byte) (((android.content.Context) java.lang.Class.forName(r26).getMethod(r6, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), ((android.content.Context) java.lang.Class.forName(r26).getMethod(r6, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 819017981, ((android.content.Context) java.lang.Class.forName(r26).getMethod(r6, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 490371915, (short) (((android.content.Context) java.lang.Class.forName(r26).getMethod(r6, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_track_resolution).substring(0, 4).length() - 4), ((android.content.Context) java.lang.Class.forName(r26).getMethod(r6, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_item_list).substring(0, 4).length() - 62, r8);
        r3 = (java.lang.String) r8[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0e60, code lost:
    
        r4 = new java.io.ByteArrayOutputStream();
        r7 = new java.io.PrintStream(r4);
        r0.printStackTrace(r7);
        r7.close();
        r1 = r4.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0e77, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0e7b, code lost:
    
        r4 = new java.util.ArrayList(2);
        r4.add(r1);
        r4.add(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0e8a, code lost:
    
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0e8e, code lost:
    
        if (r1 == null) goto L161;
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0e90, code lost:
    
        r1 = kotlin.startForeground.read((char) (android.text.TextUtils.getOffsetAfter("", 0) + 4535), (android.graphics.PointF.length(com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) > com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 1 : (android.graphics.PointF.length(com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6054, 42 - (android.view.ViewConfiguration.getTouchSlop() >> 8), -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0ebc, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0ec8, code lost:
    
        r8 = new java.lang.Object[]{-1538585176, 81604378625L, r4, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r3 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 6031, 25 - (android.media.AudioTrack.getMaxVolume() > com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 1 : (android.media.AudioTrack.getMaxVolume() == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
        r4 = com.google.android.gms.measurement.AppMeasurementJobService.$$d;
        r11 = new java.lang.Object[1];
        d((byte) (r4[50] - 1), (byte) (r4[69] - 1), (byte) (-r4[4]), r11);
        r3.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0c5f A[Catch: all -> 0x0d9a, TryCatch #12 {all -> 0x0d9a, blocks: (B:78:0x073e, B:80:0x0744, B:81:0x0788, B:83:0x0795, B:85:0x079e, B:86:0x07e3, B:109:0x0c55, B:110:0x0c59, B:112:0x0c5f, B:114:0x0c75, B:117:0x0c82, B:119:0x0c85, B:126:0x0ce5, B:132:0x0d68, B:134:0x0d6e, B:135:0x0d6f, B:137:0x0d71, B:139:0x0d78, B:140:0x0d79, B:87:0x07ee, B:99:0x0a1b, B:101:0x0a21, B:102:0x0a63, B:104:0x0baf, B:105:0x0bf3, B:107:0x0c08, B:108:0x0c4f, B:144:0x0d88, B:146:0x0d8e, B:147:0x0d8f, B:149:0x0d91, B:151:0x0d98, B:152:0x0d99, B:94:0x0993, B:96:0x09a7, B:97:0x0a0f, B:128:0x0cea, B:89:0x0949, B:91:0x095d, B:92:0x098c, B:122:0x0cb0, B:124:0x0cb6, B:125:0x0cde), top: B:275:0x073e, outer: #8, inners: #1, #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0f52  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0fa1  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0ff2  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x13a2  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x147f  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x14d1  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x152d  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x1946  */
    /* JADX WARN: Removed duplicated region for block: B:284:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0744 A[Catch: all -> 0x0d9a, TryCatch #12 {all -> 0x0d9a, blocks: (B:78:0x073e, B:80:0x0744, B:81:0x0788, B:83:0x0795, B:85:0x079e, B:86:0x07e3, B:109:0x0c55, B:110:0x0c59, B:112:0x0c5f, B:114:0x0c75, B:117:0x0c82, B:119:0x0c85, B:126:0x0ce5, B:132:0x0d68, B:134:0x0d6e, B:135:0x0d6f, B:137:0x0d71, B:139:0x0d78, B:140:0x0d79, B:87:0x07ee, B:99:0x0a1b, B:101:0x0a21, B:102:0x0a63, B:104:0x0baf, B:105:0x0bf3, B:107:0x0c08, B:108:0x0c4f, B:144:0x0d88, B:146:0x0d8e, B:147:0x0d8f, B:149:0x0d91, B:151:0x0d98, B:152:0x0d99, B:94:0x0993, B:96:0x09a7, B:97:0x0a0f, B:128:0x0cea, B:89:0x0949, B:91:0x095d, B:92:0x098c, B:122:0x0cb0, B:124:0x0cb6, B:125:0x0cde), top: B:275:0x073e, outer: #8, inners: #1, #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0795 A[Catch: all -> 0x0d9a, TryCatch #12 {all -> 0x0d9a, blocks: (B:78:0x073e, B:80:0x0744, B:81:0x0788, B:83:0x0795, B:85:0x079e, B:86:0x07e3, B:109:0x0c55, B:110:0x0c59, B:112:0x0c5f, B:114:0x0c75, B:117:0x0c82, B:119:0x0c85, B:126:0x0ce5, B:132:0x0d68, B:134:0x0d6e, B:135:0x0d6f, B:137:0x0d71, B:139:0x0d78, B:140:0x0d79, B:87:0x07ee, B:99:0x0a1b, B:101:0x0a21, B:102:0x0a63, B:104:0x0baf, B:105:0x0bf3, B:107:0x0c08, B:108:0x0c4f, B:144:0x0d88, B:146:0x0d8e, B:147:0x0d8f, B:149:0x0d91, B:151:0x0d98, B:152:0x0d99, B:94:0x0993, B:96:0x09a7, B:97:0x0a0f, B:128:0x0cea, B:89:0x0949, B:91:0x095d, B:92:0x098c, B:122:0x0cb0, B:124:0x0cb6, B:125:0x0cde), top: B:275:0x073e, outer: #8, inners: #1, #2, #5, #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x07ee A[Catch: all -> 0x0d9a, TRY_LEAVE, TryCatch #12 {all -> 0x0d9a, blocks: (B:78:0x073e, B:80:0x0744, B:81:0x0788, B:83:0x0795, B:85:0x079e, B:86:0x07e3, B:109:0x0c55, B:110:0x0c59, B:112:0x0c5f, B:114:0x0c75, B:117:0x0c82, B:119:0x0c85, B:126:0x0ce5, B:132:0x0d68, B:134:0x0d6e, B:135:0x0d6f, B:137:0x0d71, B:139:0x0d78, B:140:0x0d79, B:87:0x07ee, B:99:0x0a1b, B:101:0x0a21, B:102:0x0a63, B:104:0x0baf, B:105:0x0bf3, B:107:0x0c08, B:108:0x0c4f, B:144:0x0d88, B:146:0x0d8e, B:147:0x0d8f, B:149:0x0d91, B:151:0x0d98, B:152:0x0d99, B:94:0x0993, B:96:0x09a7, B:97:0x0a0f, B:128:0x0cea, B:89:0x0949, B:91:0x095d, B:92:0x098c, B:122:0x0cb0, B:124:0x0cb6, B:125:0x0cde), top: B:275:0x073e, outer: #8, inners: #1, #2, #5, #6 }] */
    @Override // android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6729
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.AppMeasurementJobService.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 19;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        return false;
    }

    @Override // com.google.android.gms.measurement.internal.zzkf
    public final void zza(Intent intent) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 115;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }
}
