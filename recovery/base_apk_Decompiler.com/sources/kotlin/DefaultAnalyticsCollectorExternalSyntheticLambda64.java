package kotlin;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001:\u0005\u0015\u000f\b\u0019\nB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\f\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\r\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0007¢\u0006\u0004\b\u0015\u0010\u0003R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0018"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda64;", "", "<init>", "()V", "", "", "", "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda64$read;", "RemoteActionCompatParcelizer", "()Ljava/util/Map;", "AudioAttributesCompatParcelizer", "()Ljava/util/List;", "AudioAttributesImplBaseParcelizer", "p0", "Landroid/net/Uri;", "write", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda64$read;)Landroid/net/Uri;", "Ljava/util/TreeSet;", "", "(Lo/DefaultAnalyticsCollectorExternalSyntheticLambda64$read;)Ljava/util/TreeSet;", "", "IconCompatParcelizer", "Ljava/util/List;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "read"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda64 {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static final AtomicBoolean read;
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda64 INSTANCE;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private static final List<read> RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private static final List<read> write;

    static {
        DefaultAnalyticsCollectorExternalSyntheticLambda64 defaultAnalyticsCollectorExternalSyntheticLambda64 = new DefaultAnalyticsCollectorExternalSyntheticLambda64();
        INSTANCE = defaultAnalyticsCollectorExternalSyntheticLambda64;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda64.class.getName(), "");
        write = defaultAnalyticsCollectorExternalSyntheticLambda64.AudioAttributesImplBaseParcelizer();
        RemoteActionCompatParcelizer = defaultAnalyticsCollectorExternalSyntheticLambda64.AudioAttributesCompatParcelizer();
        defaultAnalyticsCollectorExternalSyntheticLambda64.RemoteActionCompatParcelizer();
        read = new AtomicBoolean(false);
        new Integer[]{20170417, 20160327, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 20121101};
    }

    private DefaultAnalyticsCollectorExternalSyntheticLambda64() {
    }

    public static final /* synthetic */ TreeSet RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda64 defaultAnalyticsCollectorExternalSyntheticLambda64, read readVar) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda64.class)) {
            return null;
        }
        try {
            return defaultAnalyticsCollectorExternalSyntheticLambda64.RemoteActionCompatParcelizer(readVar);
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda64.class);
            return null;
        }
    }

    public static final /* synthetic */ AtomicBoolean read() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda64.class)) {
            return null;
        }
        try {
            return read;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda64.class);
            return null;
        }
    }

    public static final /* synthetic */ List write() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda64.class)) {
            return null;
        }
        try {
            return write;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda64.class);
            return null;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class RemoteActionCompatParcelizer extends read {
        private static short[] AudioAttributesImplBaseParcelizer;
        private static final byte[] $$c = {18, 96, 87, -114};
        private static final int $$f = 26;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {34, 127, 65, -22, -19, -8, -2, -5, 15, 36, -34, -17, 11, -6, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13, 13, 4, -3, -5, 1, 2, -15};
        private static final int $$e = 75;
        private static final byte[] $$a = {115, TarConstants.LF_DIR, -117, 77, 6, -24, 18, TarConstants.LF_NORMAL, -72, 11, -1, -21, 0, 6, -14, -8, 72, -56, -5, -16, -5, 67, -45, 32, 2, -12, -13, -37, -16, -5, 8, 0, -6, 3, -1, -22, 12, -1, -18, 44, -54, 1, 12, -12, -8, 7, -9, -2, 21, -14, -14, -12, 13};
        private static final int $$b = 87;
        private static int MediaBrowserCompatItemReceiver = 0;
        private static int AudioAttributesImplApi26Parcelizer = 1;
        private static int[] RemoteActionCompatParcelizer = {-1144208785, -839142345, 537503271, -1325754417, -2101431998, -222659718, -1916464, -1504164255, -1532493816, -1671147154, -1798538098, 468585036, -229196388, 1324464963, 61145963, 1481264008, 1485944795, -1648295207};
        private static int AudioAttributesCompatParcelizer = -795852857;
        private static int read = -819363086;
        private static int write = 1999200251;
        private static byte[] IconCompatParcelizer = {80, -66, -92, -69, 15, 78, 92, 66, -118, 116, 86, -68, 90, 118, 102, 126, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 31, 85, 95, 2, 126, 127, 124, 107, 115, TarConstants.LF_GNUTYPE_LONGNAME, -72, -88, -96, -118, 65, -121, -127, -114, 102, -106, -112, -92, -82, -103, -83, -71, -42, 94, -80, -122, -92, -73, 68, -68, 92, 72, -76, -108, 100, -70, TarConstants.LF_GNUTYPE_LONGLINK, -85, -65, -74, -93, -77, -95, -98, -105, 122, -71, -73, -67, -27, 111, 65, -105, -75, -63, -50, -102, -114, -3, -94, -13, -124, -20, 111, 42, 40, -23, 30, 45, 57, -14, -1, -114, -46, -87, -122, -28, -119, -115, -12, -118, -126, -11, -6, -43, -72, -8, -119, -18, -4, -32, -111, -14, -10, -114, -8, -9, -18, -88, -104, -26, -117, -113, -10, -116, -124, -9, -4, -41, -28, 79, -9, -4, -9, -60, 68, -12, -2, -126, -116, -25, -117, -121, TarConstants.LF_BLK, -68, -98, -28, -126, 71, -91, 74, 78, -75, TarConstants.LF_GNUTYPE_LONGLINK, 67, -74, -69, -106, -93, 14, -74, -69, -74, -125, 3, -77, -67, 65, TarConstants.LF_GNUTYPE_LONGLINK, -90, 74, 70, -13, 123, 93, -93, 65, -97, -99, -87, -126, -87, -27, 77, -113, -112, -117, -114, -124, -114, -123, -115, -100, -118, -128, -127, -127, -114, -124, -114, -121, -117, -124, -114, -103, -119, -122, -116, -124, 114, 0, 15, 30, 92, 34, 30, 4, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 123, -64, 9, 4, 79, TarConstants.LF_SYMLINK, 20, 122, 24, -42, -28, -29, -14, TarConstants.LF_NORMAL, -33, -92, -19, -8, 35, -106, -120, -34, -4, 27, TarConstants.LF_BLK, 35, 114, -57, TarConstants.LF_SYMLINK, 56, 124, -48, 56, -55, -38, 45, -18, -60, -52, -36, -54, -64, TarConstants.LF_LINK, -26, TarConstants.LF_CHR, -60, 47, 27, 4, 62, 41, 17, 33, 31, 21, 6, -53, 24, 41, -57, -53, -36, -59, -37, -61, -45, 38, -1, -55, -38, -68, -76, -84, -77, TarConstants.LF_GNUTYPE_LONGNAME, -96, -83, 105, TarConstants.LF_GNUTYPE_LONGLINK, TarConstants.LF_GNUTYPE_SPARSE, -75, -75, 125, 78, 30, 39, 37, 119, -54, 31, 59, 29, 36, 16, 61, 27, 27, -64, 29, 46, -69, 74, -78, 69, -69, -92, 80, 74, -78, 66, -80, -74, -89, -106, 119, TarConstants.LF_GNUTYPE_LONGLINK, -10, 14, -78, -65, 71, -78, 73, -68, -125, 126, 77, 78, TarConstants.LF_GNUTYPE_LONGLINK, -70, 66, -69, 26, 43, 126, 63, 21, 29, 45, 27, 17, 2, 113, -46, 22, 81, -23, 29, 26, 34, 29, 20, 7, 110, -39, 40, 41, 22, 5, 45, 6, -103, -116, -100, -100, -123, 66, 66, 85, -90, 107, TarConstants.LF_GNUTYPE_LONGNAME, 66, 87, -93, 101, 78, 79, 93, 66, -84, -112, -118, -16, 79, -113, -112, -34, 35, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$g(short r5, byte r6, byte r7) {
            /*
                int r6 = r6 * 3
                int r6 = r6 + 4
                int r7 = r7 * 2
                int r0 = r7 + 1
                int r5 = r5 * 4
                int r5 = 112 - r5
                byte[] r1 = o.DefaultAnalyticsCollectorExternalSyntheticLambda64.RemoteActionCompatParcelizer.$$c
                byte[] r0 = new byte[r0]
                r2 = -1
                if (r1 != 0) goto L16
                r5 = r6
                r3 = r7
                goto L29
            L16:
                r4 = r6
                r6 = r5
                r5 = r4
            L19:
                int r2 = r2 + 1
                byte r3 = (byte) r6
                r0[r2] = r3
                if (r2 != r7) goto L27
                java.lang.String r5 = new java.lang.String
                r6 = 0
                r5.<init>(r0, r6)
                return r5
            L27:
                r3 = r1[r5]
            L29:
                int r6 = r6 + r3
                int r5 = r5 + 1
                goto L19
            */
            throw new UnsupportedOperationException("Method not decompiled: o.DefaultAnalyticsCollectorExternalSyntheticLambda64.RemoteActionCompatParcelizer.$$g(short, byte, byte):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = o.DefaultAnalyticsCollectorExternalSyntheticLambda64.RemoteActionCompatParcelizer.$$d
                int r7 = r7 + 4
                int r1 = 28 - r6
                int r8 = 114 - r8
                byte[] r1 = new byte[r1]
                int r6 = 27 - r6
                r2 = 0
                if (r0 != 0) goto L13
                r3 = r8
                r4 = r2
                r8 = r7
                goto L2a
            L13:
                r3 = r2
            L14:
                int r7 = r7 + 1
                byte r4 = (byte) r8
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L25:
                r3 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r5
            L2a:
                int r3 = -r3
                int r7 = r7 + r3
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: o.DefaultAnalyticsCollectorExternalSyntheticLambda64.RemoteActionCompatParcelizer.c(byte, byte, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0031). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void d(byte r5, byte r6, int r7, java.lang.Object[] r8) {
            /*
                int r6 = r6 * 33
                int r6 = 37 - r6
                int r5 = r5 * 3
                int r5 = r5 + 103
                int r7 = r7 * 17
                int r0 = r7 + 17
                byte[] r1 = o.DefaultAnalyticsCollectorExternalSyntheticLambda64.RemoteActionCompatParcelizer.$$a
                byte[] r0 = new byte[r0]
                int r7 = r7 + 16
                r2 = -1
                if (r1 != 0) goto L18
                r3 = r2
                r2 = r6
                goto L31
            L18:
                r4 = r6
                r6 = r5
                r5 = r4
            L1b:
                int r2 = r2 + 1
                byte r3 = (byte) r6
                r0[r2] = r3
                if (r2 != r7) goto L2b
                java.lang.String r5 = new java.lang.String
                r6 = 0
                r5.<init>(r0, r6)
                r8[r6] = r5
                return
            L2b:
                r3 = r1[r5]
                r4 = r2
                r2 = r5
                r5 = r3
                r3 = r4
            L31:
                int r5 = -r5
                int r6 = r6 + r5
                int r6 = r6 + (-3)
                int r5 = r2 + 1
                r2 = r3
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: o.DefaultAnalyticsCollectorExternalSyntheticLambda64.RemoteActionCompatParcelizer.d(byte, byte, int, java.lang.Object[]):void");
        }

        private static void b(int i, int[] iArr, Object[] objArr) throws Throwable {
            int i2 = 2;
            int i3 = 2 % 2;
            buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = RemoteActionCompatParcelizer;
            int i4 = -470782045;
            int i5 = 43695;
            int i6 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i7 = 0;
                while (i7 < length) {
                    int i8 = $10 + 91;
                    $11 = i8 % 128;
                    if (i8 % i2 == 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-470782045);
                            if (objRemoteActionCompatParcelizer == null) {
                                objRemoteActionCompatParcelizer = startForeground.read((char) (((Process.getThreadPriority(0) + 20) >> 6) + i5), 23297 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 15 - ((Process.getThreadPriority(0) + 20) >> 6), -1648776394, false, "A", new Class[]{Integer.TYPE});
                            }
                            iArr3[i7] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                            i7 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        try {
                            Object[] objArr3 = {Integer.valueOf(iArr2[i7])};
                            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.getOffsetAfter("", 0) + 43695), Gravity.getAbsoluteGravity(0, 0) + 23297, KeyEvent.normalizeMetaState(0) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                            }
                            iArr3[i7] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                            i7++;
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    }
                    i2 = 2;
                    i5 = 43695;
                }
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = RemoteActionCompatParcelizer;
            if (iArr5 != null) {
                int i9 = $10 + 3;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i11 = 0;
                while (i11 < length3) {
                    int i12 = $11 + 121;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    Object[] objArr4 = new Object[1];
                    objArr4[i6] = Integer.valueOf(iArr5[i11]);
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(i4);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 43695), 23297 - View.resolveSizeAndState(i6, i6, i6), 15 - (ViewConfiguration.getTouchSlop() >> 8), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr6[i11] = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                    i11++;
                    i4 = -470782045;
                    i6 = 0;
                }
                iArr5 = iArr6;
            }
            int i14 = i6;
            System.arraycopy(iArr5, i14, iArr4, i14, length2);
            buildremovealldownloadsintent.RemoteActionCompatParcelizer = i14;
            while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
                int i15 = $10 + 31;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
                cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
                cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
                cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
                buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
                buildRemoveAllDownloadsIntent.read(iArr4);
                int i17 = 0;
                for (int i18 = 16; i17 < i18; i18 = 16) {
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i17];
                    Object[] objArr5 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (43695 - Color.alpha(0)), (KeyEvent.getMaxKeyCode() >> 16) + 23297, 15 - (ViewConfiguration.getJumpTapTimeout() >> 16), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                    buildremovealldownloadsintent.read = iIntValue;
                    i17++;
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
                Object[] objArr6 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(516305436);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (TextUtils.indexOf("", "", 0, 0) + 48194), ((Process.getThreadPriority(0) + 20) >> 6) + 20126, (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 19, 1620047497, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        private static void a(int i, short s, int i2, int i3, byte b, Object[] objArr) throws Throwable {
            boolean z;
            long j;
            int i4;
            boolean z2;
            int i5 = 2 % 2;
            buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(read)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24297, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 12, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i6 = $11 + 97;
                    $10 = i6 % 128;
                    int i7 = i6 % 2;
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    byte[] bArr = IconCompatParcelizer;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        for (int i8 = 0; i8 < length; i8++) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i8])};
                            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getTouchSlop() >> 8) + 3082, Color.red(0) + 128, 2145850993, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = IconCompatParcelizer;
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(AudioAttributesCompatParcelizer)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getScrollBarSize() >> 8), View.resolveSizeAndState(0, 0, 0) + 24297, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) read) ^ 7899112766888837815L)));
                        int i9 = $10 + 71;
                        $11 = i9 % 128;
                        int i10 = i9 % 2;
                        j = 7899112766888837815L;
                    } else {
                        j = 7899112766888837815L;
                        iIntValue = (short) (((short) (((long) AudioAttributesImplBaseParcelizer[i3 + ((int) (((long) AudioAttributesCompatParcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) read) ^ 7899112766888837815L)));
                    }
                } else {
                    j = 7899112766888837815L;
                }
                if (iIntValue > 0) {
                    int i11 = ((i3 + iIntValue) - 2) + ((int) (((long) AudioAttributesCompatParcelizer) ^ j));
                    if (z) {
                        int i12 = $11 + 49;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        i4 = 1;
                    } else {
                        i4 = 0;
                    }
                    buildresumedownloadsintent.read = i11 + i4;
                    Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i2), Integer.valueOf(write), sb};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 34134), 13433 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 21 - Color.red(0), 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    byte[] bArr4 = IconCompatParcelizer;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i14 = 0; i14 < length2; i14++) {
                            bArr5[i14] = (byte) (((long) bArr4[i14]) ^ 7899112766888837815L);
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i15 = $10 + 87;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                    while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                        if (z2) {
                            byte[] bArr6 = IconCompatParcelizer;
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

        @Override // o.DefaultAnalyticsCollectorExternalSyntheticLambda64.read
        public final String AudioAttributesCompatParcelizer() {
            int i = 2 % 2;
            int i2 = MediaBrowserCompatItemReceiver + 45;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                return "com.facebook.orca";
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        /*  JADX ERROR: Type inference failed with stack overflow
            jadx.core.utils.exceptions.JadxOverflowException
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
            */
        public static java.lang.Object[] RemoteActionCompatParcelizer(android.content.Context r67, java.lang.String[] r68, int r69, int r70, int r71) {
            /*
                Method dump skipped, instruction units count: 27354
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.DefaultAnalyticsCollectorExternalSyntheticLambda64.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(android.content.Context, java.lang.String[], int, int, int):java.lang.Object[]");
        }
    }

    private final List<read> AudioAttributesImplBaseParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Object[]) new read[]{new write(), new AudioAttributesCompatParcelizer()});
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }

    private final List<read> AudioAttributesCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            ArrayList arrayListAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Object[]) new read[]{new IconCompatParcelizer()});
            arrayListAudioAttributesCompatParcelizer.addAll(AudioAttributesImplBaseParcelizer());
            return arrayListAudioAttributesCompatParcelizer;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }

    private final Map<String, List<read>> RemoteActionCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            HashMap map = new HashMap();
            ArrayList arrayList = new ArrayList();
            arrayList.add(new RemoteActionCompatParcelizer());
            List<read> list = write;
            map.put("com.facebook.platform.action.request.OGACTIONPUBLISH_DIALOG", list);
            map.put("com.facebook.platform.action.request.FEED_DIALOG", list);
            map.put("com.facebook.platform.action.request.LIKE_DIALOG", list);
            map.put("com.facebook.platform.action.request.APPINVITES_DIALOG", list);
            map.put("com.facebook.platform.action.request.MESSAGE_DIALOG", arrayList);
            map.put("com.facebook.platform.action.request.OGMESSAGEPUBLISH_DIALOG", arrayList);
            map.put("com.facebook.platform.action.request.CAMERA_EFFECT", RemoteActionCompatParcelizer);
            map.put("com.facebook.platform.action.request.SHARE_STORY", list);
            return map;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }

    @getMagicModuleMeta
    public static final void IconCompatParcelizer() {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda64.class)) {
            return;
        }
        try {
            if (read.compareAndSet(false, true)) {
                lambdaonMediaMetadataChanged48.MediaBrowserCompatCustomActionResultReceiver().execute(new Runnable() { // from class: o.DefaultAnalyticsCollectorExternalSyntheticLambda64.4
                    @Override // java.lang.Runnable
                    public final void run() {
                        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                            return;
                        }
                        try {
                            if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
                                return;
                            }
                            try {
                                try {
                                    DefaultAnalyticsCollectorExternalSyntheticLambda64 defaultAnalyticsCollectorExternalSyntheticLambda64 = DefaultAnalyticsCollectorExternalSyntheticLambda64.INSTANCE;
                                    Iterator it = DefaultAnalyticsCollectorExternalSyntheticLambda64.write().iterator();
                                    while (it.hasNext()) {
                                        ((read) it.next()).IconCompatParcelizer();
                                    }
                                } finally {
                                    DefaultAnalyticsCollectorExternalSyntheticLambda64 defaultAnalyticsCollectorExternalSyntheticLambda642 = DefaultAnalyticsCollectorExternalSyntheticLambda64.INSTANCE;
                                    DefaultAnalyticsCollectorExternalSyntheticLambda64.read().set(false);
                                }
                            } catch (Throwable th) {
                                getMinWindowSequenceNumber.read(th, this);
                            }
                        } catch (Throwable th2) {
                            getMinWindowSequenceNumber.read(th2, this);
                        }
                    }
                });
            }
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, DefaultAnalyticsCollectorExternalSyntheticLambda64.class);
        }
    }

    private final TreeSet<Integer> RemoteActionCompatParcelizer(read p0) {
        Throwable th;
        Cursor cursorQuery;
        ProviderInfo providerInfoResolveContentProvider;
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            TreeSet<Integer> treeSet = new TreeSet<>();
            Context contextAudioAttributesCompatParcelizer = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer, "");
            ContentResolver contentResolver = contextAudioAttributesCompatParcelizer.getContentResolver();
            String[] strArr = {"version"};
            Uri uriWrite = write(p0);
            try {
                Context contextAudioAttributesCompatParcelizer2 = lambdaonMediaMetadataChanged48.AudioAttributesCompatParcelizer();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextAudioAttributesCompatParcelizer2, "");
                PackageManager packageManager = contextAudioAttributesCompatParcelizer2.getPackageManager();
                StringBuilder sb = new StringBuilder();
                sb.append(p0.AudioAttributesCompatParcelizer());
                sb.append(".provider.PlatformProvider");
                try {
                    providerInfoResolveContentProvider = packageManager.resolveContentProvider(sb.toString(), 0);
                } catch (RuntimeException e) {
                    RuntimeException runtimeException = e;
                    providerInfoResolveContentProvider = null;
                }
                if (providerInfoResolveContentProvider != null) {
                    try {
                        cursorQuery = contentResolver.query(uriWrite, strArr, null, null, null);
                    } catch (IllegalArgumentException | NullPointerException | SecurityException unused) {
                        cursorQuery = null;
                    }
                    if (cursorQuery != null) {
                        while (cursorQuery.moveToNext()) {
                            try {
                                treeSet.add(Integer.valueOf(cursorQuery.getInt(cursorQuery.getColumnIndex("version"))));
                            } catch (Throwable th2) {
                                th = th2;
                                if (cursorQuery != null) {
                                    cursorQuery.close();
                                }
                                throw th;
                            }
                        }
                    }
                } else {
                    cursorQuery = null;
                }
                if (cursorQuery != null) {
                    cursorQuery.close();
                }
                return treeSet;
            } catch (Throwable th3) {
                th = th3;
                cursorQuery = null;
            }
        } catch (Throwable th4) {
            getMinWindowSequenceNumber.read(th4, this);
            return null;
        }
    }

    private final Uri write(read p0) {
        if (getMinWindowSequenceNumber.IconCompatParcelizer(this)) {
            return null;
        }
        try {
            StringBuilder sb = new StringBuilder("content://");
            sb.append(p0.AudioAttributesCompatParcelizer());
            sb.append(".provider.PlatformProvider/versions");
            Uri uri = Uri.parse(sb.toString());
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(uri, "");
            return uri;
        } catch (Throwable th) {
            getMinWindowSequenceNumber.read(th, this);
            return null;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class read {
        private TreeSet<Integer> write;

        public abstract String AudioAttributesCompatParcelizer();

        public final void IconCompatParcelizer() {
            synchronized (this) {
                this.write = DefaultAnalyticsCollectorExternalSyntheticLambda64.RemoteActionCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda64.INSTANCE, this);
            }
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static final class write extends read {
        @Override // o.DefaultAnalyticsCollectorExternalSyntheticLambda64.read
        public final String AudioAttributesCompatParcelizer() {
            return "com.facebook.katana";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static final class AudioAttributesCompatParcelizer extends read {
        @Override // o.DefaultAnalyticsCollectorExternalSyntheticLambda64.read
        public final String AudioAttributesCompatParcelizer() {
            return "com.facebook.wakizashi";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    static final class IconCompatParcelizer extends read {
        @Override // o.DefaultAnalyticsCollectorExternalSyntheticLambda64.read
        public final String AudioAttributesCompatParcelizer() {
            return "com.facebook.arstudio.player";
        }
    }
}
