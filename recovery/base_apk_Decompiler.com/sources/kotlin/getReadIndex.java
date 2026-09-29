package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.bgservices.BaseService;
import com.marrow2.ui.home.HomeViewModelV2;
import java.lang.reflect.Method;
import kotlin.getDisplayCues;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class getReadIndex<P extends getDisplayCues> extends BaseService<P> implements SubjectStat {
    private static short[] AudioAttributesImplApi21Parcelizer;
    private volatile GtaResponseBody IconCompatParcelizer;
    private static final byte[] $$l = {16, -111, 25, -45};
    private static final int $$o = 17;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, TarConstants.LF_GNUTYPE_LONGNAME, 9, 62, 25, 14, 8, 11, -9, -30, 40, 23, -5, 12, 5, -37, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19, 18, 4, -57, 62, 1, 24, 7, -9, 19, 12, -5, 5, -56, 66, -3, 8, 14, 14, 2, 5, -58, 60, 3, 25, -13, 7, 13, 11, -4, -48, 66, 0, 13, -52, 9, 0, 34, 0, 13, -20, 9, 39, 37, -5, 9, -66, TarConstants.LF_BLK, 21, 28, -29, 43, -3, -5, -17, 25, 18, -2, 58, -11, 11, 12, -40, 57, 6, 4, -3, -1, 25, 5, -9, 20, -42, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19};
    private static final int $$n = 144;
    private static final byte[] $$d = {77, 21, 89, -51, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 149;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int MediaDescriptionCompat = 1;
    private static long RemoteActionCompatParcelizer = 1164892779118865284L;
    private static int read = 1912724557;
    private static int MediaBrowserCompatCustomActionResultReceiver = -819363135;
    private static int AudioAttributesImplApi26Parcelizer = 1961624572;
    private static byte[] AudioAttributesImplBaseParcelizer = {57, 66, 26, 74, 5, -53, -55, -41, -5, -6, 43, 6, 24, -2, 1, 24, -2, -3, 0, -51, TarConstants.LF_FIFO, -50, 7, 25, 7, 46, -6, 1, -4, 24, -51, TarConstants.LF_FIFO, -24, 43, 5, 25, -5, -2, -5, 0, -6, 25, -54, 32, 4, -3, 7, -4, -47, -3, 5, 46, -41, TarConstants.LF_FIFO, 24, -53, -5, 44, 7, -6, -6, -45, 47, 2, -52, 25, TarConstants.LF_FIFO, -14, -59, -13, 32, -105, 33, -125, TarConstants.LF_FIFO, -124, -57, -1, 36, -39, -14, -107, 32, -125, -58, TarConstants.LF_DIR, -127, -55, -127, -13, -55, -127, TarConstants.LF_FIFO, -16, -40, -106, 46, -105, -40, -3, -39, -15, -38, 47, -59, -88, -3, -59, -14, -59, -13, TarConstants.LF_DIR, -13, -85, 32, -12, -15, -85, -3, -40, 35, -12, -88, 47, -125, -13, TarConstants.LF_CONTIG, -15, -124, TarConstants.LF_DIR, -25, -13, -38, -95, -13, -24, -17, -67, -29, -15, -13, -28, -1, -25, -127, -73, -73, -73, -73};
    private final Object write = new Object();
    private boolean AudioAttributesCompatParcelizer = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$r(int r5, short r6, byte r7) {
        /*
            int r6 = r6 + 4
            byte[] r0 = kotlin.getReadIndex.$$l
            int r7 = r7 + 112
            int r5 = r5 * 2
            int r1 = 1 - r5
            byte[] r1 = new byte[r1]
            r2 = 0
            int r5 = 0 - r5
            if (r0 != 0) goto L15
            r4 = r7
            r3 = r2
            r7 = r5
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L21:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r0[r6]
        L27:
            int r7 = r7 + r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getReadIndex.$$r(int, short, byte):java.lang.String");
    }

    public static /* synthetic */ Object AudioAttributesCompatParcelizer(int i, Object[] objArr, int i2, int i3, int i4, int i5, int i6) {
        int i7 = ~i3;
        int i8 = ~i4;
        int i9 = ~(i7 | i8);
        int i10 = ~(i7 | i2);
        int i11 = i9 | i10 | (~(i8 | i2));
        int i12 = i10 | i4;
        int i13 = ~i2;
        int i14 = (~(i4 | i13 | i3)) | (~(i7 | i13 | i8)) | (~(i8 | i3 | i2));
        int i15 = i3 + i2 + i5 + ((-1329026341) * i) + ((-1277752516) * i6);
        int i16 = i15 * i15;
        int i17 = ((1212708917 * i3) - 1912602624) + ((-659060787) * i2) + ((-1871769704) * i11) + (i12 * 935884852) + (935884852 * i14) + (276824064 * i5) + (494927872 * i) + (1577058304 * i6) + ((-1783103488) * i16);
        int i18 = (i3 * 595972471) + 129777640 + (i2 * 595971967) + (i11 * (-504)) + (i12 * 252) + (i14 * 252) + (i5 * 595972219) + (i * (-1341978823)) + (i6 * 731850196) + (i16 * 1869086720);
        int i19 = i17 + (i18 * i18 * (-846725120));
        return i19 != 1 ? i19 != 2 ? i19 != 3 ? RemoteActionCompatParcelizer(objArr) : read(objArr) : IconCompatParcelizer(objArr) : AudioAttributesCompatParcelizer(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 65
            int r7 = 191 - r7
            int r0 = 44 - r5
            byte[] r1 = kotlin.getReadIndex.$$d
            byte[] r0 = new byte[r0]
            int r5 = 43 - r5
            r2 = -1
            if (r1 != 0) goto L13
            r6 = r5
            r4 = r7
            r3 = r2
            goto L26
        L13:
            r3 = r2
        L14:
            int r3 = r3 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L24:
            r4 = r1[r7]
        L26:
            int r7 = r7 + 1
            int r6 = r6 + r4
            int r6 = r6 + r2
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getReadIndex.g(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.getReadIndex.$$m
            int r7 = r7 * 17
            int r7 = r7 + 65
            int r8 = r8 * 3
            int r1 = 58 - r8
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r8 = 57 - r8
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            int r6 = r6 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2e:
            int r6 = r6 + r4
            int r6 = r6 + (-6)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getReadIndex.h(byte, short, byte, java.lang.Object[]):void");
    }

    @Override // com.marrow.bgservices.BaseService, android.app.Service
    public void onCreate() throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 ^ 1;
        int i4 = (((i2 & 1) | i3) << 1) - i3;
        MediaBrowserCompatItemReceiver = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            AudioAttributesCompatParcelizer(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 246975008, new Object[]{this}, 1768788717, -1768788717, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1400320536, HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 99031656);
            super.onCreate();
            int i5 = MediaBrowserCompatItemReceiver;
            int i6 = ((i5 & 89) - (~(-(-(i5 | 89))))) - 1;
            MediaDescriptionCompat = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            return;
        }
        AudioAttributesCompatParcelizer(246975008 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8), new Object[]{this}, 1768788717, -1768788717, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1400320536, HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 99031656);
        super.onCreate();
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        int i = 2 % 2;
        GtaResponseBody gtaResponseBody = new GtaResponseBody((getReadIndex) objArr[0]);
        int i2 = MediaBrowserCompatItemReceiver;
        int i3 = ((i2 ^ 91) | (i2 & 91)) << 1;
        int i4 = -(((~i2) & 91) | (i2 & (-92)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        MediaDescriptionCompat = i5 % 128;
        int i6 = i5 % 2;
        return gtaResponseBody;
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        getReadIndex getreadindex = (getReadIndex) objArr[0];
        if (getreadindex.IconCompatParcelizer == null) {
            synchronized (getreadindex.write) {
                if (getreadindex.IconCompatParcelizer == null) {
                    int iAudioAttributesCompatParcelizer = HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer();
                    int iAudioAttributesCompatParcelizer2 = HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer();
                    getreadindex.IconCompatParcelizer = (GtaResponseBody) AudioAttributesCompatParcelizer(HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(), new Object[]{getreadindex}, -412223359, 412223362, iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer2, HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer());
                }
            }
        }
        return getreadindex.IconCompatParcelizer;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        getReadIndex getreadindex = (getReadIndex) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver;
        int i3 = ((i2 ^ 119) | (i2 & 119)) << 1;
        int i4 = -((i2 & (-120)) | ((~i2) & 119));
        int i5 = (i3 ^ i4) + ((i3 & i4) << 1);
        MediaDescriptionCompat = i5 % 128;
        int i6 = i5 % 2;
        Object obj = null;
        if (!getreadindex.AudioAttributesCompatParcelizer) {
            int i7 = ((i2 ^ 95) | (i2 & 95)) << 1;
            int i8 = -(((~i2) & 95) | (i2 & (-96)));
            int i9 = (i7 & i8) + (i8 | i7);
            MediaDescriptionCompat = i9 % 128;
            int i10 = i9 % 2;
            getreadindex.AudioAttributesCompatParcelizer = true;
            int iAudioAttributesCompatParcelizer = HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer();
            int iAudioAttributesCompatParcelizer2 = HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer();
            SampleQueueExternalSyntheticLambda0 sampleQueueExternalSyntheticLambda0 = (SampleQueueExternalSyntheticLambda0) AudioAttributesCompatParcelizer(HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(), new Object[]{getreadindex}, -1311034075, 1311034077, iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer2, HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer());
            Object objAudioAttributesCompatParcelizer = getSubmittedOnDate.AudioAttributesCompatParcelizer(getreadindex);
            int i11 = MediaBrowserCompatItemReceiver + 11;
            MediaDescriptionCompat = i11 % 128;
            int i12 = i11 % 2;
            sampleQueueExternalSyntheticLambda0.AudioAttributesCompatParcelizer((SampleQueueSharedSampleMetadata) objAudioAttributesCompatParcelizer);
            if (i12 == 0) {
                obj.hashCode();
                throw null;
            }
        }
        int i13 = MediaDescriptionCompat;
        int i14 = i13 & 93;
        int i15 = -(-((i13 ^ 93) | i14));
        int i16 = (i14 ^ i15) + ((i15 & i14) << 1);
        MediaBrowserCompatItemReceiver = i16 % 128;
        int i17 = i16 % 2;
        return null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        getReadIndex getreadindex = (getReadIndex) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver;
        int i3 = i2 ^ 55;
        int i4 = ((i2 & 55) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        MediaDescriptionCompat = i6 % 128;
        int i7 = i6 % 2;
        int iAudioAttributesCompatParcelizer = HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer();
        Object objAf_ = ((GtaResponseBody) AudioAttributesCompatParcelizer(HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(), new Object[]{getreadindex}, 49532888, -49532887, iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer2, HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer())).af_();
        int i8 = MediaBrowserCompatItemReceiver;
        int i9 = ((i8 | 101) << 1) - (i8 ^ 101);
        MediaDescriptionCompat = i9 % 128;
        int i10 = i9 % 2;
        return objAf_;
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = $11 + 61;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = notifydownloadchanged.AudioAttributesCompatParcelizer;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b - 1);
                        objRemoteActionCompatParcelizer = startForeground.read((char) (View.combineMeasuredStates(0, 0) + 38461), 532 - View.getDefaultSize(0, 0), 8 - ExpandableListView.getPackedPositionGroup(0L), -735610793, false, $$r(b, b2, (byte) (b2 & 9)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() & (RemoteActionCompatParcelizer ^ 2192498202983240651L);
                    Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (36621 - TextUtils.indexOf("", "", 0)), 2340 - TextUtils.indexOf("", ""), View.MeasureSpec.getSize(0) + 28, 188119637, false, $$r(b3, b4, (byte) (b4 & 7)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = notifydownloadchanged.AudioAttributesCompatParcelizer;
                Object[] objArr4 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = (byte) (b5 - 1);
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (38461 - (KeyEvent.getMaxKeyCode() >> 16)), TextUtils.lastIndexOf("", '0', 0) + 533, (ViewConfiguration.getTapTimeout() >> 16) + 8, -735610793, false, $$r(b5, b6, (byte) (b6 & 9)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).longValue() ^ (RemoteActionCompatParcelizer ^ 2192498202983240651L);
                Object[] objArr5 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = (byte) (b7 - 1);
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (36621 - TextUtils.getOffsetBefore("", 0)), (Process.myPid() >> 22) + 2340, 28 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 188119637, false, $$r(b7, b8, (byte) (b8 & 7)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i6 = $11 + 65;
            $10 = i6 % 128;
            if (i6 % 2 != 0) {
                cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
                Object[] objArr6 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer5 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = (byte) (b9 - 1);
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (36621 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), (Process.myPid() >> 22) + 2340, 28 - (KeyEvent.getMaxKeyCode() >> 16), 188119637, false, $$r(b9, b10, (byte) (b10 & 7)), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
                obj.hashCode();
                throw null;
            }
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr7 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer6 == null) {
                byte b11 = (byte) 0;
                byte b12 = (byte) (b11 - 1);
                objRemoteActionCompatParcelizer6 = startForeground.read((char) (36621 - (ViewConfiguration.getEdgeSlop() >> 16)), 2340 - (ViewConfiguration.getWindowTouchSlop() >> 8), 28 - Color.green(0), 188119637, false, $$r(b11, b12, (byte) (b12 & 7)), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
        }
        objArr[0] = new String(cArr2);
    }

    private static void f(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        boolean z;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24296, TextUtils.indexOf("", "") + 12, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $10 + 33;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            long j2 = -1;
            if (i4 == 0) {
                j = 7899112766888837815L;
            } else {
                byte[] bArr = AudioAttributesImplBaseParcelizer;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i10 = 0;
                    while (i10 < length) {
                        int i11 = $11 + 39;
                        $10 = i11 % 128;
                        int i12 = i11 % i6;
                        Object[] objArr3 = {Integer.valueOf(bArr[i10])};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            char windowTouchSlop = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int i13 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 3081;
                            int i14 = (SystemClock.currentThreadTimeMillis() > j2 ? 1 : (SystemClock.currentThreadTimeMillis() == j2 ? 0 : -1)) + 127;
                            byte b2 = (byte) 0;
                            byte b3 = (byte) (b2 - 1);
                            objRemoteActionCompatParcelizer2 = startForeground.read(windowTouchSlop, i13, i14, 2145850993, false, $$r(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i10] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i10++;
                        i6 = 2;
                        j2 = -1;
                    }
                    int i15 = $10 + 49;
                    $11 = i15 % 128;
                    i5 = 2;
                    int i16 = i15 % 2;
                    bArr = bArr2;
                } else {
                    i5 = 2;
                }
                if (bArr != null) {
                    byte[] bArr3 = AudioAttributesImplBaseParcelizer;
                    Object[] objArr4 = new Object[i5];
                    objArr4[1] = Integer.valueOf(read);
                    objArr4[0] = Integer.valueOf(i);
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) Color.alpha(0), TextUtils.indexOf("", "", 0) + 24297, 12 - TextUtils.getTrimmedLength(""), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ 7899112766888837815L)));
                    j = 7899112766888837815L;
                } else {
                    j = 7899112766888837815L;
                    iIntValue = (short) (((short) (((long) AudioAttributesImplApi21Parcelizer[i + ((int) (((long) read) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ 7899112766888837815L)));
                }
            }
            if (iIntValue > 0) {
                buildresumedownloadsintent.read = ((i + iIntValue) - 2) + ((int) (((long) read) ^ j)) + i4;
                Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i3), Integer.valueOf(AudioAttributesImplApi26Parcelizer), sb};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 34133), TextUtils.getTrimmedLength("") + 13432, ImageFormat.getBitsPerPixel(0) + 22, 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr4 = AudioAttributesImplBaseParcelizer;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i17 = 0;
                    while (i17 < length2) {
                        int i18 = $11 + 65;
                        int i19 = i18 % 128;
                        $10 = i19;
                        if (i18 % 2 != 0) {
                            bArr5[i17] = (byte) (((long) bArr4[i17]) % 7899112766888837815L);
                            i17 = 0;
                        } else {
                            bArr5[i17] = (byte) (((long) bArr4[i17]) ^ 7899112766888837815L);
                            i17++;
                        }
                        int i20 = i19 + 109;
                        $11 = i20 % 128;
                        int i21 = i20 % 2;
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i22 = $10 + 81;
                    $11 = i22 % 128;
                    int i23 = i22 % 2;
                    z = true;
                } else {
                    z = false;
                }
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    if (z) {
                        byte[] bArr6 = AudioAttributesImplBaseParcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r7]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        short[] sArr = AudioAttributesImplApi21Parcelizer;
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

    /* JADX WARN: Removed duplicated region for block: B:29:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00d9  */
    @Override // com.marrow.bgservices.BaseService, android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5929
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getReadIndex.attachBaseContext(android.content.Context):void");
    }

    private GtaResponseBody write() {
        int iAudioAttributesCompatParcelizer = HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer();
        return (GtaResponseBody) AudioAttributesCompatParcelizer(HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(), new Object[]{this}, 49532888, -49532887, iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer2, HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer());
    }

    private GtaResponseBody AudioAttributesCompatParcelizer() {
        int iAudioAttributesCompatParcelizer = HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer();
        return (GtaResponseBody) AudioAttributesCompatParcelizer(HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(), new Object[]{this}, -412223359, 412223362, iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer2, HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer());
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int iAudioAttributesCompatParcelizer = HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer();
        int iAudioAttributesCompatParcelizer2 = HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer();
        return AudioAttributesCompatParcelizer(HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(), new Object[]{this}, -1311034075, 1311034077, iAudioAttributesCompatParcelizer, iAudioAttributesCompatParcelizer2, HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer());
    }

    private void read() {
        int integer = (-1400320536) + (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3));
        int iAudioAttributesCompatParcelizer = HomeViewModelV2.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer();
        AudioAttributesCompatParcelizer(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 246975008, new Object[]{this}, 1768788717, -1768788717, integer, iAudioAttributesCompatParcelizer, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 99031656);
    }
}
