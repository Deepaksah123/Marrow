package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.ExoMediaDrmProvider;
import kotlin.addLaUrlAttributeIfMissing;
import kotlin.buildRemoveAllDownloadsIntent;
import kotlin.isStopped;
import kotlin.markSeekOperationFinished;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public class JobInfoSchedulerService extends JobService {
    private static final byte[] $$c = {32, -59, 22, 74};
    private static final int $$f = 218;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {TarConstants.LF_PAX_EXTENDED_HEADER_UC, -92, 37, 22, 33, 22, 16, 19, -1, -22, TarConstants.LF_NORMAL, 31, 3, 20, 13, -29, 58, 12, 17, -1, 33, -22, 31, 31, -1, 16, 21, 11, 31, -7, 27, -51, 71, 12, 29, -36, 59, 3, 35, -71, 43, 66, -3, 19, 20, -32, 65, 14, 12, 5, 7, 33, 13, -1, 28, -28, TarConstants.LF_SYMLINK, 17, 10, -28, 45, 32, 0, -7, 31, 31, -1, 16, 21, 11, 31, -7, 27, 9, 5, 25, -1};
    private static final int $$e = 121;
    private static final byte[] $$a = {11, -82, -98, -28, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 150;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;
    private static char write = 33626;
    private static char IconCompatParcelizer = 40819;
    private static char RemoteActionCompatParcelizer = 61739;
    private static char AudioAttributesCompatParcelizer = 20476;
    private static int[] read = {-131560763, 1628824969, -116196646, 1116620087, -1203640823, -1017116090, -162707845, -813880698, 1756512141, 1583587524, 41234975, -463449472, -815230146, 1578723326, 210099465, 1369547958, -286699293, -902923730};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r6, short r7, short r8) {
        /*
            int r7 = r7 * 2
            int r7 = 122 - r7
            byte[] r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.$$c
            int r8 = r8 + 4
            int r6 = r6 * 2
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.$$g(byte, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 65
            byte[] r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.$$a
            int r7 = r7 + 4
            int r9 = 44 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L11
            r8 = r7
            r3 = r9
            r5 = r2
            goto L29
        L11:
            r3 = r2
        L12:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L29:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            r3 = r5
            r6 = r8
            r8 = r7
            r7 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.c(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = 119 - r9
            int r7 = r7 + 4
            byte[] r0 = com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.$$d
            int r8 = 43 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r9 = r7
            r3 = r8
            r5 = r2
            goto L29
        L11:
            r3 = r2
        L12:
            int r7 = r7 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L29:
            int r3 = r3 + r7
            int r7 = r3 + (-14)
            r3 = r5
            r6 = r9
            r9 = r7
            r7 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.d(int, byte, short, java.lang.Object[]):void");
    }

    public final /* synthetic */ void AudioAttributesCompatParcelizer(JobParameters jobParameters) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 65;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        jobFinished(jobParameters, false);
    }

    @Override // android.app.job.JobService
    public boolean onStartJob(final JobParameters jobParameters) {
        int i = 2 % 2;
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i2 = jobParameters.getExtras().getInt("priority");
        int i3 = jobParameters.getExtras().getInt("attemptNumber");
        addLaUrlAttributeIfMissing.AudioAttributesCompatParcelizer(getApplicationContext());
        ExoMediaDrmProvider.RemoteActionCompatParcelizer remoteActionCompatParcelizer = ExoMediaDrmProvider.read().write(string).read(markSeekOperationFinished.RemoteActionCompatParcelizer(i2));
        if (string2 != null) {
            int i4 = AudioAttributesImplBaseParcelizer + 91;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            if (i4 % 2 != 0) {
                remoteActionCompatParcelizer.RemoteActionCompatParcelizer(Base64.decode(string2, 0));
            } else {
                remoteActionCompatParcelizer.RemoteActionCompatParcelizer(Base64.decode(string2, 0));
            }
            int i5 = AudioAttributesImplBaseParcelizer + 87;
            AudioAttributesImplApi21Parcelizer = i5 % 128;
            int i6 = i5 % 2;
        }
        addLaUrlAttributeIfMissing.AudioAttributesCompatParcelizer().IconCompatParcelizer().write(remoteActionCompatParcelizer.RemoteActionCompatParcelizer(), i3, new Runnable() { // from class: o.OfflineLicenseHelperExternalSyntheticLambda3
            @Override // java.lang.Runnable
            public final void run() {
                this.write.AudioAttributesCompatParcelizer(jobParameters);
            }
        });
        return true;
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 27;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (isstopped.read < cArr.length) {
            cArr3[i3] = cArr[isstopped.read];
            cArr3[1] = cArr[isstopped.read + 1];
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 17;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                char[] cArr4 = cArr3;
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i6) ^ ((c2 << 4) + ((char) (((long) RemoteActionCompatParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(AudioAttributesCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) (1 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 1504 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 21 - TextUtils.indexOf("", ""), 1322448859, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) write) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IconCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 1505, 21 - View.resolveSize(0, 0), 1322448859, false, $$g(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
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
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), MotionEvent.axisFromString("") + 9017, 58 - (Process.myPid() >> 22), -1950993821, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void b(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = read;
        int i5 = 43695;
        int i6 = -470782045;
        float f = BitmapDescriptorFactory.HUE_RED;
        int i7 = 0;
        if (iArr2 != null) {
            int i8 = $11 + 111;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i10])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(i6);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (i5 - View.MeasureSpec.getSize(0)), (TypedValue.complexToFraction(0, f, f) > f ? 1 : (TypedValue.complexToFraction(0, f, f) == f ? 0 : -1)) + 23297, Drawable.resolveOpacity(0, 0) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr3[i10] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i10++;
                    i5 = 43695;
                    i6 = -470782045;
                    f = BitmapDescriptorFactory.HUE_RED;
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
        int[] iArr5 = read;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i11 = 0;
            while (i11 < length3) {
                int i12 = $11 + 107;
                $10 = i12 % 128;
                int i13 = i12 % i3;
                Object[] objArr3 = new Object[1];
                objArr3[i7] = Integer.valueOf(iArr5[i11]);
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (43695 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23296, 14 - Process.getGidForName(""), -1648776394, false, "A", new Class[]{Integer.TYPE});
                }
                iArr6[i11] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                i11++;
                int i14 = $11 + 55;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                i3 = 2;
                i7 = 0;
            }
            i2 = i7;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i2;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            cArr[i2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr4);
            int i16 = $11 + 3;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            for (int i18 = 0; i18 < 16; i18++) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i18];
                Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (43694 - TextUtils.lastIndexOf("", '0')), 23297 - (ViewConfiguration.getEdgeSlop() >> 16), MotionEvent.axisFromString("") + 16, -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
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
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (48194 - (Process.myTid() >> 22)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 20126, View.getDefaultSize(0, 0) + 20, 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x08c7  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x08ff A[Catch: all -> 0x09b9, TryCatch #10 {all -> 0x09b9, blocks: (B:139:0x08eb, B:141:0x08ff, B:142:0x092e), top: B:274:0x08eb, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0941 A[Catch: all -> 0x09af, TryCatch #6 {all -> 0x09af, blocks: (B:143:0x0934, B:145:0x0941, B:146:0x09a7), top: B:266:0x0934, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0aec  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0b3b  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0b90  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0dc2  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0e9e  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0eef  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0f39  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x11a5  */
    /* JADX WARN: Removed duplicated region for block: B:295:? A[RETURN, SYNTHETIC] */
    @Override // android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5394
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.datatransport.runtime.scheduling.jobscheduling.JobInfoSchedulerService.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.job.JobService
    public boolean onStopJob(JobParameters jobParameters) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 115;
        int i3 = i2 % 128;
        AudioAttributesImplBaseParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 9;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // android.app.Service
    public void onCreate() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 7;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate();
        int i4 = AudioAttributesImplBaseParcelizer + 37;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
