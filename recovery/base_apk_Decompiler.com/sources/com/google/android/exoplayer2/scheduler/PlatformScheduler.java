package com.google.android.exoplayer2.scheduler;

import android.app.job.JobInfo;
import android.app.job.JobParameters;
import android.app.job.JobScheduler;
import android.app.job.JobService;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.PersistableBundle;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.util.Assertions;
import com.google.android.exoplayer2.util.Log;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.buildSetStopReasonIntent;
import kotlin.notifyDownloadChanged;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class PlatformScheduler implements Scheduler {
    private static final String KEY_REQUIREMENTS = "requirements";
    private static final String KEY_SERVICE_ACTION = "service_action";
    private static final String KEY_SERVICE_PACKAGE = "service_package";
    private static final int SUPPORTED_REQUIREMENTS;
    private static final String TAG = "PlatformScheduler";
    private final int jobId;
    private final JobScheduler jobScheduler;
    private final ComponentName jobServiceComponentName;

    static {
        SUPPORTED_REQUIREMENTS = (Util.SDK_INT >= 26 ? 16 : 0) | 15;
    }

    public static final class PlatformSchedulerService extends JobService {
        private static final byte[] $$c = {64, -102, 72, -66};
        private static final int $$f = 60;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {26, 47, -113, 59, -23, -12, -6, -9, 11, 32, -38, -21, 7, -10, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17, 61, -61, -2, -19, 44, -53, -1, 13, -23, 7, -10, -3, 29, -32, -7, -4, -1, -14, -30, -16, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17};
        private static final int $$e = 126;
        private static final byte[] $$a = {24, -109, -85, -94, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
        private static final int $$b = 56;
        private static int RemoteActionCompatParcelizer = 0;
        private static int write = 1;
        private static long IconCompatParcelizer = -3811668160584291017L;
        private static char[] AudioAttributesCompatParcelizer = {44995, 44819, 44807, 44815, 44806, 45050, 44864, 44858, 44867, 44904, 44907, 44906, 44885, 44867, 44857, 44856, 44862, 44871, 44905, 44905, 44864, 44858, 44866, 44904, 44877, 44837, 44864, 44905, 44871, 44860, 44871, 44865, 44866, 44866, 44858, 44837, 44837, 44866, 44867, 44856, 44865, 44907, 44906, 44906, 44864, 44865, 44867, 44862, 44863, 44862, 44860, 44871, 44905, 44988, 45017, 44976, 45022, 45021, 45023, 45031, 45031, 45021, 45003, 45003, 45002, 45002, 45021, 45017, 44977, 44976, 44980, 45000, 44980, 44977, 44976, 44982, 45023, 45022, 45020, 45020, 44982, 44977, 44980, 45003, 45020, 45031, 45028, 45029, 45023, 45022, 45022, 44980, 45003, 44982, 44976, 44981, 45002, 44980, 45002, 45011, 45029, 45028, 45020, 45021, 45020, 44981, 44983, 45017, 45031, 45017, 44983, 45020, 45020, 45002, 44981, 45002, 45021, 44950, 44989, 44988, 44988, 44998, 44993, 44993, 44995, 44992, 44993, 44990, 44985, 44995, 45033, 45039, 44998, 44993, 44994, 44987, 44992, 44995, 44992, 44993, 44987, 44993, 44998, 44998, 45033, 45033, 44996, 44998, 44992, 44988, 44990, 44985, 44990, 44988, 44996, 45038, 44997, 44991, 44984, 44984, 44987, 44987, 44995, 45035, 44998, 44996, 45038, 45032, 44998, 44990, 44985, 44998, 45038, 44996, 44999, 44992, 44987, 44992, 45032, 44995, 44995, 44946, 44984, 44985, 44991, 44989, 44989, 44990, 44985, 44988, 44990, 44985, 44836, 44851, 44845, 44804, 44853, 44848, 44837, 44848, 44862, 44833, 44832, 44837, 44833, 44832, 44863, 44803, 44991, 45036, 45037, 45027, 45025, 45050, 45030, 45036, 44995, 44996, 45051, 45018, 45002, 45036, 45052, 45049, 45030, 45027, 45010, 45021, 45031, 45027, 44947, 44991, 44988, 44988, 44989, 44988, 44990, 44991, 44989, 44985, 44984};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$g(int r5, byte r6, byte r7) {
            /*
                int r7 = r7 * 3
                int r0 = r7 + 1
                int r5 = r5 * 2
                int r5 = r5 + 119
                int r6 = r6 * 4
                int r6 = r6 + 4
                byte[] r1 = com.google.android.exoplayer2.scheduler.PlatformScheduler.PlatformSchedulerService.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L26
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r5
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L24
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                return r5
            L24:
                r3 = r1[r6]
            L26:
                int r6 = r6 + 1
                int r5 = r5 + r3
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.scheduler.PlatformScheduler.PlatformSchedulerService.$$g(int, byte, byte):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void c(int r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r0 = r6 + 4
                int r7 = 114 - r7
                byte[] r1 = com.google.android.exoplayer2.scheduler.PlatformScheduler.PlatformSchedulerService.$$a
                int r8 = r8 + 4
                byte[] r0 = new byte[r0]
                int r6 = r6 + 3
                r2 = -1
                if (r1 != 0) goto L13
                r3 = r8
                r4 = r2
                r8 = r6
                goto L2b
            L13:
                r3 = r2
            L14:
                int r3 = r3 + 1
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L24
                java.lang.String r6 = new java.lang.String
                r7 = 0
                r6.<init>(r0, r7)
                r9[r7] = r6
                return
            L24:
                r4 = r1[r8]
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2b:
                int r3 = r3 + 1
                int r7 = -r7
                int r8 = r8 + r7
                int r7 = r8 + (-1)
                r8 = r3
                r3 = r4
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.scheduler.PlatformScheduler.PlatformSchedulerService.c(int, int, int, java.lang.Object[]):void");
        }

        private static void d(byte b, short s, int i, Object[] objArr) {
            byte[] bArr = $$d;
            int i2 = 49 - (b * 9);
            int i3 = 111 - i;
            byte[] bArr2 = new byte[28 - s];
            int i4 = 27 - s;
            int i5 = -1;
            if (bArr == null) {
                i2++;
                i3 = (i2 + (-i4)) - 4;
            }
            while (true) {
                int i6 = i3;
                int i7 = i2;
                i5++;
                bArr2[i5] = (byte) i6;
                if (i5 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i2 = i7 + 1;
                    i3 = (i6 + (-bArr[i7])) - 4;
                }
            }
        }

        private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
            notifydownloadchanged.read = i;
            int length = cArr.length;
            long[] jArr = new long[length];
            notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
            while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
                int i3 = $10 + 1;
                $11 = i3 % 128;
                int i4 = i3 % 2;
                int i5 = notifydownloadchanged.AudioAttributesCompatParcelizer;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 1;
                        byte b2 = (byte) (b - 1);
                        objRemoteActionCompatParcelizer = startForeground.read((char) (38461 - View.MeasureSpec.makeMeasureSpec(0, 0)), View.MeasureSpec.getSize(0) + 532, 8 - View.MeasureSpec.getMode(0), -735610793, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (IconCompatParcelizer ^ 2192498202983240651L);
                    try {
                        Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.indexOf("", "") + 36621), AndroidCharacter.getMirror('0') + 2292, Color.alpha(0) + 28, 188119637, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
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
            }
            char[] cArr2 = new char[length];
            notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
            while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
                int i6 = $10 + 83;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
                Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (Color.argb(0, 0, 0, 0) + 36621), 2340 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 28 - View.resolveSizeAndState(0, 0, 0), 188119637, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr2);
        }

        @Override // android.app.job.JobService
        public final boolean onStartJob(JobParameters jobParameters) {
            int i = 2 % 2;
            PersistableBundle extras = jobParameters.getExtras();
            int notMetRequirements = new Requirements(extras.getInt("requirements")).getNotMetRequirements(this);
            if (notMetRequirements == 0) {
                String str = (String) Assertions.checkNotNull(extras.getString(PlatformScheduler.KEY_SERVICE_ACTION));
                Util.startForegroundService(this, new Intent(str).setPackage((String) Assertions.checkNotNull(extras.getString(PlatformScheduler.KEY_SERVICE_PACKAGE))));
            } else {
                Log.w(PlatformScheduler.TAG, "Requirements not met: ".concat(String.valueOf(notMetRequirements)));
                jobFinished(jobParameters, true);
            }
            int i2 = RemoteActionCompatParcelizer + 57;
            write = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }

        private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
            int i = 2 % 2;
            buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
            int i2 = iArr[0];
            int i3 = iArr[1];
            int i4 = iArr[2];
            int i5 = iArr[3];
            char[] cArr = AudioAttributesCompatParcelizer;
            char c = '0';
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i6 = 0;
                while (i6 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 11613 - KeyEvent.normalizeMetaState(0), TextUtils.indexOf("", c) + 21, -1786471333, false, "u", new Class[]{Integer.TYPE});
                        }
                        cArr2[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        i6++;
                        c = '0';
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr, i2, cArr3, 0, i3);
            if (bArr != null) {
                char[] cArr4 = new char[i3];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                char c2 = 0;
                while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                    int i7 = $11 + 63;
                    $10 = i7 % 128;
                    if (i7 % 2 == 0 ? bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] != 1 : bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] != 1) {
                        int i8 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                        Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1859710730);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (31589 - ExpandableListView.getPackedPositionGroup(0L)), 9863 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 65, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    } else {
                        int i9 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                        Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getScrollBarSize() >> 8), ImageFormat.getBitsPerPixel(0) + 22960, 43 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                    }
                    c2 = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                    Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (37821 - TextUtils.lastIndexOf("", '0', 0, 0)), 9754 - KeyEvent.normalizeMetaState(0), TextUtils.getOffsetAfter("", 0) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i5 > 0) {
                char[] cArr5 = new char[i3];
                System.arraycopy(cArr3, 0, cArr5, 0, i3);
                int i10 = i3 - i5;
                System.arraycopy(cArr5, 0, cArr3, i10, i5);
                System.arraycopy(cArr5, i5, cArr3, 0, i10);
            }
            if (z) {
                char[] cArr6 = new char[i3];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                    int i11 = $11 + 31;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i3 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                    buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                }
                cArr3 = cArr6;
            }
            if (i4 > 0) {
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                    cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                    buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                    int i13 = $11 + 119;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                }
            }
            objArr[0] = new String(cArr3);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0098  */
        /* JADX WARN: Removed duplicated region for block: B:183:0x094a A[Catch: all -> 0x0250, TryCatch #6 {all -> 0x0250, blocks: (B:181:0x0944, B:183:0x094a, B:184:0x0976, B:214:0x0d16, B:216:0x0d1c, B:217:0x0d4a, B:250:0x10ee, B:252:0x10f4, B:253:0x111c, B:231:0x0ee9, B:233:0x0f0b, B:234:0x0f58, B:74:0x0394, B:76:0x039a, B:77:0x03c2, B:25:0x00c9, B:27:0x00cf, B:28:0x00fb, B:30:0x01c5, B:32:0x01f5, B:33:0x024a, B:39:0x0262, B:41:0x0266, B:45:0x0272, B:60:0x033e, B:62:0x0344, B:63:0x0345, B:65:0x0347, B:67:0x034e, B:68:0x034f), top: B:287:0x00c9, inners: #14 }] */
        /* JADX WARN: Removed duplicated region for block: B:189:0x09fe  */
        /* JADX WARN: Removed duplicated region for block: B:192:0x0a4d  */
        /* JADX WARN: Removed duplicated region for block: B:197:0x0aa5  */
        /* JADX WARN: Removed duplicated region for block: B:213:0x0cf7  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00be  */
        /* JADX WARN: Removed duplicated region for block: B:222:0x0dd5  */
        /* JADX WARN: Removed duplicated region for block: B:225:0x0e21  */
        /* JADX WARN: Removed duplicated region for block: B:230:0x0e79  */
        /* JADX WARN: Removed duplicated region for block: B:249:0x10cf  */
        /* JADX WARN: Removed duplicated region for block: B:314:? A[RETURN, SYNTHETIC] */
        @Override // android.app.Service, android.content.ContextWrapper
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void attachBaseContext(android.content.Context r35) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 4989
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.scheduler.PlatformScheduler.PlatformSchedulerService.attachBaseContext(android.content.Context):void");
        }

        @Override // android.app.job.JobService
        public final boolean onStopJob(JobParameters jobParameters) {
            int i = 2 % 2;
            int i2 = write;
            int i3 = i2 + 99;
            RemoteActionCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
            int i5 = i2 + 33;
            RemoteActionCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
            return false;
        }

        @Override // android.app.Service
        public final void onCreate() {
            int i = 2 % 2;
            int i2 = write + 31;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            super.onCreate();
            if (i3 != 0) {
                throw null;
            }
        }
    }

    public PlatformScheduler(Context context, int i) {
        Context applicationContext = context.getApplicationContext();
        this.jobId = i;
        this.jobServiceComponentName = new ComponentName(applicationContext, (Class<?>) PlatformSchedulerService.class);
        this.jobScheduler = (JobScheduler) Assertions.checkNotNull((JobScheduler) applicationContext.getSystemService("jobscheduler"));
    }

    @Override // com.google.android.exoplayer2.scheduler.Scheduler
    public final boolean schedule(Requirements requirements, String str, String str2) {
        return this.jobScheduler.schedule(buildJobInfo(this.jobId, this.jobServiceComponentName, requirements, str2, str)) == 1;
    }

    @Override // com.google.android.exoplayer2.scheduler.Scheduler
    public final boolean cancel() {
        this.jobScheduler.cancel(this.jobId);
        return true;
    }

    @Override // com.google.android.exoplayer2.scheduler.Scheduler
    public final Requirements getSupportedRequirements(Requirements requirements) {
        return requirements.filterRequirements(SUPPORTED_REQUIREMENTS);
    }

    private static JobInfo buildJobInfo(int i, ComponentName componentName, Requirements requirements, String str, String str2) {
        Requirements requirementsFilterRequirements = requirements.filterRequirements(SUPPORTED_REQUIREMENTS);
        if (!requirementsFilterRequirements.equals(requirements)) {
            StringBuilder sb = new StringBuilder("Ignoring unsupported requirements: ");
            sb.append(requirementsFilterRequirements.getRequirements() ^ requirements.getRequirements());
            Log.w(TAG, sb.toString());
        }
        JobInfo.Builder builder = new JobInfo.Builder(i, componentName);
        if (requirements.isUnmeteredNetworkRequired()) {
            builder.setRequiredNetworkType(2);
        } else if (requirements.isNetworkRequired()) {
            builder.setRequiredNetworkType(1);
        }
        builder.setRequiresDeviceIdle(requirements.isIdleRequired());
        builder.setRequiresCharging(requirements.isChargingRequired());
        if (Util.SDK_INT >= 26 && requirements.isStorageNotLowRequired()) {
            builder.setRequiresStorageNotLow(true);
        }
        builder.setPersisted(true);
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString(KEY_SERVICE_ACTION, str);
        persistableBundle.putString(KEY_SERVICE_PACKAGE, str2);
        persistableBundle.putInt("requirements", requirements.getRequirements());
        builder.setExtras(persistableBundle);
        return builder.build();
    }
}
