package kotlin;

import android.content.Context;
import android.content.Intent;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.isPendingReset;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public class maybeNotifyDownstreamFormat extends seekInsideBufferUs<isPendingReset.write> implements isPendingReset.IconCompatParcelizer {
    private isCtrlCode IconCompatParcelizer = new isCtrlCode() { // from class: o.maybeNotifyDownstreamFormat.1
        @Override // kotlin.isCtrlCode
        public final void read(int i) {
            ((isPendingReset.write) maybeNotifyDownstreamFormat.this.presenter).RemoteActionCompatParcelizer(i);
        }

        @Override // kotlin.isCtrlCode
        public final void AudioAttributesCompatParcelizer(int i) {
            ((isPendingReset.write) maybeNotifyDownstreamFormat.this.presenter).write(i);
        }

        @Override // kotlin.isCtrlCode
        public final void write(int i) {
            ((isPendingReset.write) maybeNotifyDownstreamFormat.this.presenter).AudioAttributesCompatParcelizer(i);
        }

        @Override // kotlin.isCtrlCode
        public final void RemoteActionCompatParcelizer(int i) {
            ((isPendingReset.write) maybeNotifyDownstreamFormat.this.presenter).read(i);
        }

        @Override // kotlin.isCtrlCode, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    };
    private static final byte[] $$l = {85, -29, -43, -21};
    private static final int $$o = 28;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {70, -23, 8, 77, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -54, 68, 9, 26, -35, TarConstants.LF_BLK, 10, 17, -22, 33, 28, -10, -5, 36, 6, 22, -69, 57, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -8};
    private static final int $$n = 223;
    private static final byte[] $$d = {34, TarConstants.LF_NORMAL, 18, 42, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 74;
    private static int read = 0;
    private static int write = 1;
    private static long RemoteActionCompatParcelizer = -1943451896740776030L;
    private static long AudioAttributesCompatParcelizer = -3667258273067587296L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$r(byte r5, short r6, byte r7) {
        /*
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r0 = kotlin.maybeNotifyDownstreamFormat.$$l
            int r5 = 121 - r5
            int r6 = r6 * 2
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L24
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L20:
            int r3 = r3 + 1
            r4 = r0[r7]
        L24:
            int r4 = -r4
            int r7 = r7 + 1
            int r5 = r5 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.maybeNotifyDownstreamFormat.$$r(byte, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = 114 - r7
            int r0 = 44 - r5
            byte[] r1 = kotlin.maybeNotifyDownstreamFormat.$$d
            int r6 = 191 - r6
            byte[] r0 = new byte[r0]
            int r5 = 43 - r5
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r6
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r6]
        L25:
            int r4 = -r4
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.maybeNotifyDownstreamFormat.g(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(short r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 19
            int r9 = 47 - r9
            byte[] r0 = kotlin.maybeNotifyDownstreamFormat.$$m
            int r7 = r7 * 27
            int r7 = 30 - r7
            int r8 = r8 * 29
            int r8 = r8 + 82
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r5 = r2
            goto L30
        L16:
            r3 = r2
            r6 = r8
            r8 = r7
            r7 = r6
        L1a:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L2b
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L2b:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L30:
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r3
            r3 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.maybeNotifyDownstreamFormat.h(short, byte, byte, java.lang.Object[]):void");
    }

    @Override // kotlin.seekInsideBufferUs, com.marrow.bgservices.BaseService, android.app.Service
    public void onCreate() {
        int i = 2 % 2;
        int i2 = write + 51;
        read = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate();
        int i4 = write + 107;
        read = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.marrow.bgservices.BaseService, android.app.Service
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = write + 77;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDestroy();
            buildResolutionString.IconCompatParcelizer("SyncLogger", "Caller sync service -> onDestroy");
            ((isPendingReset.write) this.presenter).RemoteActionCompatParcelizer();
            getShowTimeoutMs.IconCompatParcelizer(this, this.IconCompatParcelizer);
            int i3 = write + 1;
            read = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onDestroy();
        buildResolutionString.IconCompatParcelizer("SyncLogger", "Caller sync service -> onDestroy");
        ((isPendingReset.write) this.presenter).RemoteActionCompatParcelizer();
        getShowTimeoutMs.IconCompatParcelizer(this, this.IconCompatParcelizer);
        throw null;
    }

    @Override // android.app.Service
    public int onStartCommand(Intent intent, int i, int i2) {
        int i3;
        int i4 = 2 % 2;
        int i5 = read + 11;
        write = i5 % 128;
        if (i5 % 2 == 0) {
            super.onStartCommand(intent, i, i2);
            buildResolutionString.IconCompatParcelizer("SyncLogger", "CallerSyncService - onStartCommand called");
            getShowTimeoutMs.read(this, this.IconCompatParcelizer);
            ((isPendingReset.write) this.presenter).IconCompatParcelizer();
            i3 = 4;
        } else {
            super.onStartCommand(intent, i, i2);
            buildResolutionString.IconCompatParcelizer("SyncLogger", "CallerSyncService - onStartCommand called");
            getShowTimeoutMs.read(this, this.IconCompatParcelizer);
            ((isPendingReset.write) this.presenter).IconCompatParcelizer();
            i3 = 2;
        }
        int i6 = read + 99;
        write = i6 % 128;
        int i7 = i6 % 2;
        return i3;
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $11 + 97;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(AudioAttributesCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) View.resolveSize(0, 0), TextUtils.lastIndexOf("", '0') + 12425, 20 - (ViewConfiguration.getEdgeSlop() >> 16), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (Process.getGidForName("") + 1), 1868 - (ViewConfiguration.getTouchSlop() >> 8), 10 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1983509525, false, $$r((byte) 17, b, b), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i6 = $10 + 57;
                $11 = i6 % 128;
                int i7 = i6 % 2;
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

    @Override // o.isPendingReset.IconCompatParcelizer
    public final void write() {
        int i = 2 % 2;
        buildResolutionString.IconCompatParcelizer("SyncLogger", "CallerSyncService - user sync started");
        startService(new Intent(this, (Class<?>) getAdjustedUpstreamFormat.class));
        int i2 = read + 45;
        write = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.isPendingReset.IconCompatParcelizer
    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = read + 47;
        write = i2 % 128;
        int i3 = i2 % 2;
        super.stopSelf();
        int i4 = read + 77;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        int i3 = $11 + 9;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i5 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (38461 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 533 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 8 - TextUtils.getOffsetAfter("", 0), -735610793, false, $$r(b, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (RemoteActionCompatParcelizer ^ 2192498202983240651L);
                Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b3 = (byte) 2;
                    byte b4 = (byte) (b3 - 2);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (36621 - (ViewConfiguration.getEdgeSlop() >> 16)), View.MeasureSpec.makeMeasureSpec(0, 0) + 2340, KeyEvent.getDeadChar(0, 0) + 28, 188119637, false, $$r(b3, b4, b4), new Class[]{Object.class, Object.class});
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
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer3 == null) {
                byte b5 = (byte) 2;
                byte b6 = (byte) (b5 - 2);
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0') + 36622), 2340 - View.MeasureSpec.getMode(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 28, 188119637, false, $$r(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            int i6 = $11 + 97;
            $10 = i6 % 128;
            int i7 = i6 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0978 A[Catch: all -> 0x0297, TryCatch #15 {all -> 0x0297, blocks: (B:232:0x0d42, B:234:0x0d48, B:235:0x0d72, B:268:0x10ec, B:270:0x10f2, B:271:0x1116, B:249:0x0ef1, B:251:0x0f13, B:252:0x0f66, B:199:0x0972, B:201:0x0978, B:202:0x09a2, B:70:0x03d1, B:72:0x03d7, B:73:0x03f8, B:19:0x00ba, B:21:0x00c0, B:22:0x00e8, B:24:0x0208, B:26:0x0238, B:27:0x0291), top: B:319:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0a2d  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0a80  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0adb  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0d24  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x0e04  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0e55  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0ea4  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x10cc  */
    /* JADX WARN: Removed duplicated region for block: B:339:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0089  */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v13 */
    /* JADX WARN: Type inference failed for: r14v14 */
    /* JADX WARN: Type inference failed for: r14v15 */
    /* JADX WARN: Type inference failed for: r14v16 */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v18 */
    /* JADX WARN: Type inference failed for: r14v19, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v27 */
    /* JADX WARN: Type inference failed for: r14v28 */
    /* JADX WARN: Type inference failed for: r14v29 */
    /* JADX WARN: Type inference failed for: r14v30 */
    /* JADX WARN: Type inference failed for: r14v31 */
    /* JADX WARN: Type inference failed for: r14v40 */
    /* JADX WARN: Type inference failed for: r14v41 */
    /* JADX WARN: Type inference failed for: r14v42 */
    /* JADX WARN: Type inference failed for: r14v43 */
    /* JADX WARN: Type inference failed for: r14v44 */
    /* JADX WARN: Type inference failed for: r14v45 */
    /* JADX WARN: Type inference failed for: r14v50 */
    /* JADX WARN: Type inference failed for: r14v54 */
    /* JADX WARN: Type inference failed for: r14v55 */
    /* JADX WARN: Type inference failed for: r14v56 */
    /* JADX WARN: Type inference failed for: r14v57 */
    /* JADX WARN: Type inference failed for: r14v58 */
    /* JADX WARN: Type inference failed for: r14v59 */
    /* JADX WARN: Type inference failed for: r14v60 */
    /* JADX WARN: Type inference failed for: r14v61 */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v108 */
    /* JADX WARN: Type inference failed for: r6v87 */
    /* JADX WARN: Type inference failed for: r6v88 */
    /* JADX WARN: Type inference failed for: r6v89 */
    /* JADX WARN: Type inference failed for: r6v90 */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v32 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39, types: [long] */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45 */
    /* JADX WARN: Type inference failed for: r9v46 */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference failed for: r9v54 */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v56 */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v58 */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v60 */
    @Override // kotlin.seekInsideBufferUs, com.marrow.bgservices.BaseService, android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.maybeNotifyDownstreamFormat.attachBaseContext(android.content.Context):void");
    }
}
