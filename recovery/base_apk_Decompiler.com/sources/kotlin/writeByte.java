package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class writeByte extends addObserverForBackInvoker implements SubjectStat {
    private final Object AudioAttributesCompatParcelizer = new Object();
    private boolean IconCompatParcelizer = false;
    private getSubjectStat RemoteActionCompatParcelizer;
    private volatile isHighlighted read;
    private static final byte[] $$c = {TarConstants.LF_SYMLINK, 124, -128, 125};
    private static final int $$f = 50;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {TarConstants.LF_PAX_EXTENDED_HEADER_UC, -92, 37, 22, -53, 69, 10, 27, -38, 57, 1, 33, -73, 41, 64, -5, 17, 18, -34, 63, 12, 10, 3, 5, 31, 11, -3, 26, -30, TarConstants.LF_NORMAL, 15, 8, -30, 43, 30, -2, -9, 29, 29, -3, 14, 19, 9, 29, -9, 25, 7, 3, 23, -3, 31, 20, 14, 17, -3, -24, 46, 29, 1, 18, 11, -31, 56, 10, 15, -3, 31, -24, 29, 29, -3, 14, 19, 9, 29, -9, 25, 24, 10, -51, 68, 7, 30, 13, -3, 25, 18, 1, 11, -50, 72, 3, 14, 20, 20, 8, 11, -52, 66, 9, 31, -7, 13, 19, 17, 2, -42, 72, 6, 19, -46, 15, 6, 40, 6, 19, -14, 15, 45, 43, 1, 15, -60, 58, 27, 34, -23, TarConstants.LF_LINK, 3, 1, -11, 31, 24, 4, 64, -5, 17, 18, -34, 63, 12, 10, 3, 5, 31, 11, -3, 26, -36, 56, 10, 15, -3, 31, -24, 29, 29, -3, 14, 19, 9, 29, -9, 25};
    private static final int $$h = 181;
    private static final byte[] $$a = {34, TarConstants.LF_NORMAL, 18, 42, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 52;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static long write = 1740633940595795843L;
    private static int AudioAttributesImplApi21Parcelizer = -136981212;
    private static char AudioAttributesImplBaseParcelizer = 54564;
    private static char[] MediaBrowserCompatCustomActionResultReceiver = {7985, 'J', 8498, 16969, 25494, 33960, 42438, 50479, 58996, 1886, 10485, 18907, 27345, 35384, 43861, 52335, 60896, 3788, 12208, 20672, 28695, 37233, 45637, 54176, 62627, 5592, 13600, 22025, 30552, 39102, 47491, 56041, 64049, 6941, 15411, 23882, 32455, 40955, 32962, 41001, 49529, 57950, 1011, 9437, 17797, 25967, 34304, 42813, 51377, 59792, 2788, 11209, 19216, 27760, 36165, 44716, 53241, 61583, 4212, 12634, 21076, 29676, 38018, 46574, 56421, 49984, 57913, 33050, 41176, 18349, 26248, 1645, 9476, 50181, 60399, 35548, 43439, 18795, 26712, 3889, 56429, 49994, 57912, 33030, 41155, 18349, 26264, 1594, 9507, 50199, 60338, 35559, 43413, 18807, 26696, 3889, 12001, 52711, 60592, 37787, 45903, 21039, 56425, 49992, 57917, 33028, 41183, 18337, 26264, 1606, 9513, 50181, 60400, 35520, 43397, 18793, 26713};
    private static long AudioAttributesImplApi26Parcelizer = -6805403915446402268L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(int r6, int r7, byte r8) {
        /*
            byte[] r0 = kotlin.writeByte.$$c
            int r8 = r8 * 2
            int r8 = 103 - r8
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r6 = r6 + 1
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r8 = r8 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeByte.$$i(int, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 65
            int r0 = r7 + 4
            int r6 = 191 - r6
            byte[] r1 = kotlin.writeByte.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = -1
            if (r1 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L25
        L12:
            r3 = r2
        L13:
            int r3 = r3 + 1
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L23:
            r4 = r1[r6]
        L25:
            int r6 = r6 + 1
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeByte.c(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = 119 - r7
            int r8 = r8 + 5
            int r9 = r9 + 4
            byte[] r0 = kotlin.writeByte.$$g
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r9
            r4 = r2
            goto L27
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r9 = r9 + 1
            if (r4 != r8) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r7 = r7 + r9
            int r7 = r7 + (-12)
            r9 = r3
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeByte.d(byte, int, int, java.lang.Object[]):void");
    }

    writeByte() {
        AudioAttributesImplApi21Parcelizer();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.writeByte.4
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                writeByte.this.AudioAttributesImplBaseParcelizer();
            }
        });
        int i2 = MediaBrowserCompatMediaItem + 39;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 101;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            getSubjectStat getsubjectstatWrite = MediaBrowserCompatItemReceiver().write();
            this.RemoteActionCompatParcelizer = getsubjectstatWrite;
            if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            }
            int i3 = MediaBrowserCompatItemReceiver + 7;
            MediaBrowserCompatMediaItem = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        getSubjectStat getsubjectstatWrite2 = MediaBrowserCompatItemReceiver().write();
        this.RemoteActionCompatParcelizer = getsubjectstatWrite2;
        getsubjectstatWrite2.RemoteActionCompatParcelizer();
        throw null;
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        downloadService.write = 0;
        int i4 = $10 + 1;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (downloadService.write < i) {
            int i6 = $11 + 3;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                int i7 = downloadService.write;
                try {
                    Object[] objArr2 = {Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver[i2 + i7])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b - 1);
                        objRemoteActionCompatParcelizer = startForeground.read((char) (36621 - (Process.myTid() >> 22)), (ViewConfiguration.getTapTimeout() >> 16) + 2340, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 27, 480654850, false, $$i(b, b2, (byte) (-b2)), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(AudioAttributesImplApi26Parcelizer), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getCapsMode("", 0, 0), 9701 - View.MeasureSpec.getSize(0), 25 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i7] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {downloadService, downloadService};
                            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                            if (objRemoteActionCompatParcelizer3 == null) {
                                objRemoteActionCompatParcelizer3 = startForeground.read((char) (1 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 23784 - KeyEvent.normalizeMetaState(0), 33 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
                int i8 = downloadService.write;
                Object[] objArr5 = {Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver[i2 + i8])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = (byte) (b3 - 1);
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (36621 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 2339 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 27 - TextUtils.lastIndexOf("", '0', 0, 0), 480654850, false, $$i(b3, b4, (byte) (-b4)), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(AudioAttributesImplApi26Parcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) ExpandableListView.getPackedPositionType(0L), 9701 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) Color.green(0), 23784 - Color.blue(0), 33 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i9 = $10 + 119;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                cArr[downloadService.write] = (char) jArr[downloadService.write];
                Object[] objArr8 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) View.MeasureSpec.getSize(0), 23784 - TextUtils.indexOf("", "", 0, 0), 32 - TextUtils.indexOf((CharSequence) "", '0'), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr8);
                int i10 = 72 / 0;
            } else {
                cArr[downloadService.write] = (char) jArr[downloadService.write];
                Object[] objArr9 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer8 == null) {
                    objRemoteActionCompatParcelizer8 = startForeground.read((char) TextUtils.getOffsetBefore("", 0), 23784 - Gravity.getAbsoluteGravity(0, 0), AndroidCharacter.getMirror('0') - 15, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer8).invoke(null, objArr9);
            }
        }
        objArr[0] = new String(cArr);
    }

    private static void a(int i, char[] cArr, char[] cArr2, char c, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        int i3 = $10 + 95;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), (-16754468) - Color.rgb(0, 0, 0), TextUtils.getTrimmedLength("") + 36, 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (31369 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2721, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 37, 1895162189, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 15714, 65 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (Color.red(0) + 40976), ExpandableListView.getPackedPositionGroup(0L) + 6122, 29 - (ViewConfiguration.getWindowTouchSlop() >> 8), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (write ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) AudioAttributesImplApi21Parcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) AudioAttributesImplBaseParcelizer) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i5 = $10 + 117;
        $11 = i5 % 128;
        if (i5 % 2 != 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x00c8  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r31) {
        /*
            Method dump skipped, instruction units count: 2862
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeByte.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 93;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.RemoteActionCompatParcelizer;
        if (getsubjectstat != null) {
            getsubjectstat.AudioAttributesCompatParcelizer();
        }
        int i4 = MediaBrowserCompatItemReceiver + 111;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 83;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = MediaBrowserCompatItemReceiver().af_();
        int i4 = MediaBrowserCompatItemReceiver + 125;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            return objAf_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatMediaItem + 35;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 70 / 0;
        }
        return ishighlighted;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        if (this.read == null) {
            synchronized (this.AudioAttributesCompatParcelizer) {
                if (this.read == null) {
                    this.read = MediaBrowserCompatCustomActionResultReceiver();
                }
            }
        }
        return this.read;
    }

    protected final void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 63;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (this.IconCompatParcelizer) {
            return;
        }
        this.IconCompatParcelizer = true;
        int i3 = MediaBrowserCompatItemReceiver + 121;
        MediaBrowserCompatMediaItem = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 61;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
            int i3 = 11 / 0;
        } else {
            RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        }
        int i4 = MediaBrowserCompatItemReceiver + 93;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 450
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeByte.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x010d  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 484
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeByte.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x06e2 A[Catch: all -> 0x0beb, TRY_ENTER, TRY_LEAVE, TryCatch #9 {all -> 0x0beb, blocks: (B:88:0x05cf, B:94:0x061e, B:109:0x06e2), top: B:302:0x05cf }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0a88 A[Catch: all -> 0x0be9, TryCatch #6 {all -> 0x0be9, blocks: (B:133:0x0a7e, B:134:0x0a82, B:136:0x0a88, B:138:0x0a9f, B:144:0x0ab9, B:148:0x0ac8, B:149:0x0ad0, B:156:0x0b35, B:162:0x0bc3, B:164:0x0bc9, B:165:0x0bca, B:167:0x0bcc, B:169:0x0bd3, B:170:0x0bd4, B:111:0x06eb, B:123:0x08bf, B:125:0x08c5, B:126:0x0909, B:128:0x09d6, B:129:0x0a1c, B:131:0x0a32, B:132:0x0a78, B:172:0x0bd6, B:174:0x0bdd, B:175:0x0bde, B:177:0x0be0, B:179:0x0be7, B:180:0x0be8, B:158:0x0b44, B:152:0x0afd, B:154:0x0b03, B:155:0x0b2e, B:118:0x082f, B:120:0x0844, B:121:0x08b3, B:113:0x07e1, B:115:0x07f6, B:116:0x0828), top: B:297:0x06eb, inners: #0, #8, #12, #19 }] */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0c95 A[Catch: all -> 0x03a6, TryCatch #2 {all -> 0x03a6, blocks: (B:224:0x118d, B:226:0x1193, B:227:0x11bf, B:260:0x1655, B:262:0x165b, B:263:0x1683, B:241:0x139a, B:243:0x13bd, B:244:0x1402, B:191:0x0c8f, B:193:0x0c95, B:194:0x0cb7, B:81:0x0511, B:83:0x0517, B:84:0x0541, B:19:0x00ef, B:21:0x00f5, B:22:0x011d, B:24:0x0314, B:26:0x0346, B:27:0x03a0), top: B:289:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0d4e  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0d96  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0de7  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x1170  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x1254  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x129e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x12f2  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x1636  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x03e1 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05d5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:334:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0423 A[Catch: all -> 0x049b, TRY_LEAVE, TryCatch #15 {all -> 0x049b, blocks: (B:51:0x0416, B:53:0x0423), top: B:312:0x0416 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0517 A[Catch: all -> 0x03a6, TryCatch #2 {all -> 0x03a6, blocks: (B:224:0x118d, B:226:0x1193, B:227:0x11bf, B:260:0x1655, B:262:0x165b, B:263:0x1683, B:241:0x139a, B:243:0x13bd, B:244:0x1402, B:191:0x0c8f, B:193:0x0c95, B:194:0x0cb7, B:81:0x0511, B:83:0x0517, B:84:0x0541, B:19:0x00ef, B:21:0x00f5, B:22:0x011d, B:24:0x0314, B:26:0x0346, B:27:0x03a0), top: B:289:0x00ef }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x062b  */
    /* JADX WARN: Type inference failed for: r14v33 */
    /* JADX WARN: Type inference failed for: r14v34, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r14v35, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v46 */
    /* JADX WARN: Type inference failed for: r14v47 */
    /* JADX WARN: Type inference failed for: r14v48 */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r36) {
        /*
            Method dump skipped, instruction units count: 6504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeByte.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 9;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatItemReceiver + 115;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
    }
}
