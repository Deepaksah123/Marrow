package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setCheckedIconEnabled;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setCheckedIconEnabled extends MaterialCheckBoxSavedState {
    private static long AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] RemoteActionCompatParcelizer;
    private static int read;
    private static int[] write;
    private static final byte[] $$c = {24, -109, -85, -94};
    private static final int $$f = 53;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {70, -23, 8, 77, 9, -5, -66, TarConstants.LF_FIFO, 5, -3, -11, 2, -10, -58, TarConstants.LF_NORMAL, 10, -13, 11, -6, -9, -8, -57, TarConstants.LF_FIFO, 3, 3, -72, TarConstants.LF_SYMLINK, 9, -5, -3, -1, -4, -67, 68, -4, -14, 0, -65, 73, -3, -28, -16, -7, 0, 16, 5, -1, 2, -18, -39, 31, 14, -14, 3, -4, -46, 41, -5, 0, -18, 16, -39, 14, 14, -18, -1, 4, -6, 14, -24, 10, -68, 21, 44, -12, -3, -28, 15, -1, 3, -11, 6, 3, -50, 38, -14, 12, 4, -12, 1, -14, 3, -4, -38, 23, 17, -57, 27, -1, 2, -6, -55, -8, -12, 8, -18};
    private static final int $$k = 145;
    private static final byte[] $$d = {91, -118, -51, -87, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 179;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static int AudioAttributesImplBaseParcelizer = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r6, short r7, short r8) {
        /*
            int r8 = r8 * 4
            int r8 = 101 - r8
            byte[] r0 = kotlin.setCheckedIconEnabled.$$c
            int r7 = r7 * 2
            int r1 = 1 - r7
            int r6 = r6 * 2
            int r6 = 3 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L19
            r3 = r8
            r4 = r2
            r8 = r6
            goto L30
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            int r6 = r6 + 1
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setCheckedIconEnabled.$$i(short, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = 114 - r9
            int r7 = 44 - r7
            int r8 = 191 - r8
            byte[] r0 = kotlin.setCheckedIconEnabled.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r9
            r4 = r2
            r9 = r8
            goto L27
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L27:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-1)
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setCheckedIconEnabled.g(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.setCheckedIconEnabled.$$j
            int r7 = r7 + 82
            int r6 = r6 + 4
            int r5 = 101 - r5
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L11
            r4 = r7
            r3 = r2
            r7 = r6
            goto L25
        L11:
            r3 = r2
        L12:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            r4 = r0[r5]
        L25:
            int r7 = r7 + r4
            int r7 = r7 + 3
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setCheckedIconEnabled.h(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.setCheckedIconEnabled$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/setCheckedIconEnabled$IconCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "Lo/readBlockToCache;", "p2", "Landroid/content/Intent;", "read", "(Landroid/content/Context;Ljava/lang/String;Lo/readBlockToCache;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent read(Context p0, String p1, readBlockToCache p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            Intent intent = new Intent(p0, (Class<?>) setCheckedIconEnabled.class);
            intent.putExtra("test_id", p1);
            intent.putExtra("parent_type", p2);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void e(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i4 = $10 + 37;
            $11 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = downloadService.write;
                try {
                    Object[] objArr2 = {Integer.valueOf(RemoteActionCompatParcelizer[i - i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 36621), TextUtils.lastIndexOf("", '0') + 2341, MotionEvent.axisFromString("") + 29, 480654850, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    try {
                        Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i5), Long.valueOf(AudioAttributesCompatParcelizer), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.indexOf("", "", 0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 9700, View.MeasureSpec.makeMeasureSpec(0, 0) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                        }
                        jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                        Object[] objArr4 = {downloadService, downloadService};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 23784 - (Process.myPid() >> 22), TextUtils.getOffsetBefore("", 0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
            } else {
                int i6 = downloadService.write;
                Object[] objArr5 = {Integer.valueOf(RemoteActionCompatParcelizer[i + i6])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 36622), 2340 - (ViewConfiguration.getJumpTapTimeout() >> 16), View.combineMeasuredStates(0, 0) + 28, 480654850, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).longValue()), Long.valueOf(i6), Long.valueOf(AudioAttributesCompatParcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (1 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 9701 - View.MeasureSpec.getMode(0), 26 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 23783 - TextUtils.indexOf((CharSequence) "", '0', 0), 32 - TextUtils.indexOf((CharSequence) "", '0', 0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
        }
        char[] cArr = new char[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i7 = $10 + 67;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr8 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer7 == null) {
                objRemoteActionCompatParcelizer7 = startForeground.read((char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 23783 - ImageFormat.getBitsPerPixel(0), View.resolveSizeAndState(0, 0, 0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    private static void f(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = write;
        int i3 = 43694;
        int i4 = -470782045;
        long j = 0;
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $11 + 101;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i8 = 0;
            while (i8 < length2) {
                int i9 = $10 + 49;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getZoomControlsTimeout() > j ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j ? 0 : -1)) + i3), ExpandableListView.getPackedPositionType(j) + 23297, (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 14, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr4[i8] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i8++;
                    int i11 = $10 + 27;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    i3 = 43694;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = write;
        if (iArr6 != null) {
            int i13 = $10 + 75;
            $11 = i13 % 128;
            if (i13 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i14 = 0;
            while (i14 < length) {
                int i15 = $10 + 91;
                $11 = i15 % 128;
                if (i15 % 2 == 0) {
                    Object[] objArr3 = new Object[1];
                    objArr3[i5] = Integer.valueOf(iArr6[i14]);
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(i4);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (43694 - ((byte) KeyEvent.getModifierMetaStateMask())), (ExpandableListView.getPackedPositionForChild(i5, i5) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(i5, i5) == 0L ? 0 : -1)) + 23298, 15 - TextUtils.indexOf("", "", i5, i5), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr2[i14] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                } else {
                    Object[] objArr4 = {Integer.valueOf(iArr6[i14])};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (43696 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 23298 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.getCapsMode("", 0, 0) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr2[i14] = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                    i14++;
                }
                i4 = -470782045;
                i5 = 0;
            }
            iArr6 = iArr2;
        }
        int i16 = i5;
        System.arraycopy(iArr6, i16, iArr5, i16, length3);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i16;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            int i17 = $10 + 91;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr5);
            for (int i19 = 0; i19 < 16; i19++) {
                int i20 = $11 + 101;
                $10 = i20 % 128;
                int i21 = i20 % 2;
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[i19];
                Object[] objArr5 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (43695 - (ViewConfiguration.getScrollBarSize() >> 8)), (ViewConfiguration.getScrollBarSize() >> 8) + 23297, (ViewConfiguration.getJumpTapTimeout() >> 16) + 15, -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
            }
            int i22 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i22;
            buildremovealldownloadsintent.read ^= iArr5[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[17];
            int i23 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i24 = buildremovealldownloadsintent.read;
            cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
            cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
            cArr[3] = (char) buildremovealldownloadsintent.read;
            buildRemoveAllDownloadsIntent.read(iArr5);
            cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
            Object[] objArr6 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(516305436);
            if (objRemoteActionCompatParcelizer5 == null) {
                objRemoteActionCompatParcelizer5 = startForeground.read((char) (KeyEvent.getDeadChar(0, 0) + 48194), 20126 - (KeyEvent.getMaxKeyCode() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 21, 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x010a  */
    @Override // kotlin.MaterialCheckBoxSavedState, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2536
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setCheckedIconEnabled.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.MaterialCheckBoxSavedState, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 5;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i3 = AudioAttributesImplApi21Parcelizer + 33;
            MediaBrowserCompatItemReceiver = i3 % 128;
            int i4 = i3 % 2;
            Object[] objArr = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 16, new int[]{688119599, -1108463629, -2062324667, 562324398, -667639601, -1177659440, -1482191523, -1404750733, -533308430, 2082746798, 373764455, 739793831, -2109822344, -120866044}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 54232), 23 - Color.alpha(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 18, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i5 = MediaBrowserCompatItemReceiver + 67;
            AudioAttributesImplApi21Parcelizer = i5 % 128;
            int i6 = i5 % 2;
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i7 = AudioAttributesImplApi21Parcelizer + 117;
                MediaBrowserCompatItemReceiver = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        if (baseContext != null) {
            int i9 = AudioAttributesImplApi21Parcelizer + 21;
            MediaBrowserCompatItemReceiver = i9 % 128;
            try {
                if (i9 % 2 == 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (Color.alpha(0) + 4535), TextUtils.indexOf("", "", 0, 0) + 6054, 42 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 6030 - View.MeasureSpec.makeMeasureSpec(0, 0), 24 - KeyEvent.getDeadChar(0, 0), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    throw null;
                }
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (4535 - KeyEvent.getDeadChar(0, 0)), 6054 - (Process.myTid() >> 22), ImageFormat.getBitsPerPixel(0) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 6030 - (Process.myPid() >> 22), 24 - (Process.myPid() >> 22), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke2, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
    }

    @Override // kotlin.MaterialCheckBoxSavedState, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 27;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 27, new int[]{688119599, -1108463629, -2062324667, 562324398, -667639601, -1177659440, -1482191523, -1404750733, -533308430, 2082746798, 373764455, 739793831, -2109822344, -120866044}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 54232), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 13, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 17, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = MediaBrowserCompatItemReceiver + 81;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            int i6 = AudioAttributesImplApi21Parcelizer + 41;
            MediaBrowserCompatItemReceiver = i6 % 128;
            int i7 = i6 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), Color.red(0) + 6054, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.argb(0, 0, 0, 0), 6031 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 25 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -861814097, false, "read", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:(26:31|(3:33|(3:35|38|(1:40)(1:41))|42)(2:36|(2:38|(0)(0))(1:42))|78|285|79|(1:81)|82|83|(2:85|(5:87|88|(1:90)|91|92)(3:93|(1:95)|96))(21:97|98|272|99|(1:101)|102|103|288|104|(1:106)|107|108|109|(1:111)|112|(1:114)|115|(1:117)|118|119|(1:121))|122|(4:125|(12:127|(3:129|(3:132|133|130)|295)|134|283|135|(1:137)|138|139|140|270|141|294)(1:293)|154|123)|292|177|(1:179)|180|(3:182|(1:184)|185)(13:187|265|188|189|(1:191)|192|286|193|194|(1:196)|197|(1:199)|200)|186|201|(6:203|204|(1:206)|207|208|209)|210|(1:212)|213|(3:215|(1:217)|218)(14:220|221|(1:223)|224|225|(1:227)|228|277|229|230|(1:232)|233|(1:235)|236)|219|237|(7:239|240|(1:242)|243|244|245|246)(1:296))|281|47|(1:49)|50|268|51|(1:53)|54|78|285|79|(0)|82|83|(0)(0)|122|(1:123)|292|177|(0)|180|(0)(0)|186|201|(0)|210|(0)|213|(0)(0)|219|237|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0b4f, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0b50, code lost:
    
        r9 = new java.lang.Object[1];
        e((char) (((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 119), (((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(com.marrow.R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 214, ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 25, r9);
        r2 = (java.lang.String) r9[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0bd0, code lost:
    
        r4 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r4);
        r0.printStackTrace(r5);
        r5.close();
        r1 = r4.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0be7, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0beb, code lost:
    
        r4 = new java.util.ArrayList(2);
        r4.add(r1);
        r4.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0bfa, code lost:
    
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0bfe, code lost:
    
        if (r1 == null) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0c00, code lost:
    
        r1 = kotlin.startForeground.read((char) (4535 - android.text.TextUtils.getOffsetAfter("", 0)), android.view.KeyEvent.getDeadChar(0, 0) + 6054, (android.view.KeyEvent.getMaxKeyCode() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0c2a, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:176:0x0c36, code lost:
    
        r6 = new java.lang.Object[]{-1769259729, 81604378625L, r4, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r2 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) ((android.widget.ExpandableListView.getPackedPositionForChild(0, 0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForChild(0, 0) == 0 ? 0 : -1)) + 1), 6030 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.widget.ExpandableListView.getPackedPositionGroup(0) + 24);
        r4 = kotlin.setCheckedIconEnabled.$$j;
        r12 = new java.lang.Object[1];
        h((byte) (-r4[13]), (byte) (-r4[69]), r4[36], r12);
        r2.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0a03 A[Catch: all -> 0x0b4f, TryCatch #11 {all -> 0x0b4f, blocks: (B:79:0x056e, B:81:0x0574, B:82:0x05bd, B:88:0x05d9, B:90:0x05df, B:91:0x0627, B:92:0x0633, B:93:0x0634, B:95:0x063d, B:96:0x0687, B:122:0x09f7, B:123:0x09fb, B:125:0x0a03, B:127:0x0a18, B:130:0x0a2e, B:132:0x0a31, B:139:0x0a98, B:145:0x0b26, B:147:0x0b2c, B:148:0x0b2d, B:150:0x0b2f, B:152:0x0b36, B:153:0x0b37, B:97:0x0692, B:109:0x07dd, B:111:0x07e3, B:112:0x082b, B:114:0x0940, B:115:0x0982, B:117:0x0999, B:118:0x09e2, B:156:0x0b3c, B:158:0x0b43, B:159:0x0b44, B:161:0x0b46, B:163:0x0b4d, B:164:0x0b4e, B:141:0x0aa8, B:99:0x0711, B:101:0x0722, B:102:0x0751, B:135:0x0a5e, B:137:0x0a64, B:138:0x0a91, B:104:0x0758, B:106:0x076c, B:107:0x07d1), top: B:285:0x056e, outer: #5, inners: #3, #4, #10, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0cc3  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0d12  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0d6c  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x1084  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x1168  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x11bd  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x1218  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x154c  */
    /* JADX WARN: Removed duplicated region for block: B:296:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0379  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0574 A[Catch: all -> 0x0b4f, TryCatch #11 {all -> 0x0b4f, blocks: (B:79:0x056e, B:81:0x0574, B:82:0x05bd, B:88:0x05d9, B:90:0x05df, B:91:0x0627, B:92:0x0633, B:93:0x0634, B:95:0x063d, B:96:0x0687, B:122:0x09f7, B:123:0x09fb, B:125:0x0a03, B:127:0x0a18, B:130:0x0a2e, B:132:0x0a31, B:139:0x0a98, B:145:0x0b26, B:147:0x0b2c, B:148:0x0b2d, B:150:0x0b2f, B:152:0x0b36, B:153:0x0b37, B:97:0x0692, B:109:0x07dd, B:111:0x07e3, B:112:0x082b, B:114:0x0940, B:115:0x0982, B:117:0x0999, B:118:0x09e2, B:156:0x0b3c, B:158:0x0b43, B:159:0x0b44, B:161:0x0b46, B:163:0x0b4d, B:164:0x0b4e, B:141:0x0aa8, B:99:0x0711, B:101:0x0722, B:102:0x0751, B:135:0x0a5e, B:137:0x0a64, B:138:0x0a91, B:104:0x0758, B:106:0x076c, B:107:0x07d1), top: B:285:0x056e, outer: #5, inners: #3, #4, #10, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0692 A[Catch: all -> 0x0b4f, TRY_LEAVE, TryCatch #11 {all -> 0x0b4f, blocks: (B:79:0x056e, B:81:0x0574, B:82:0x05bd, B:88:0x05d9, B:90:0x05df, B:91:0x0627, B:92:0x0633, B:93:0x0634, B:95:0x063d, B:96:0x0687, B:122:0x09f7, B:123:0x09fb, B:125:0x0a03, B:127:0x0a18, B:130:0x0a2e, B:132:0x0a31, B:139:0x0a98, B:145:0x0b26, B:147:0x0b2c, B:148:0x0b2d, B:150:0x0b2f, B:152:0x0b36, B:153:0x0b37, B:97:0x0692, B:109:0x07dd, B:111:0x07e3, B:112:0x082b, B:114:0x0940, B:115:0x0982, B:117:0x0999, B:118:0x09e2, B:156:0x0b3c, B:158:0x0b43, B:159:0x0b44, B:161:0x0b46, B:163:0x0b4d, B:164:0x0b4e, B:141:0x0aa8, B:99:0x0711, B:101:0x0722, B:102:0x0751, B:135:0x0a5e, B:137:0x0a64, B:138:0x0a91, B:104:0x0758, B:106:0x076c, B:107:0x07d1), top: B:285:0x056e, outer: #5, inners: #3, #4, #10, #13 }] */
    @Override // kotlin.MaterialCheckBoxSavedState, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5978
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setCheckedIconEnabled.attachBaseContext(android.content.Context):void");
    }

    static {
        read = 0;
        MediaBrowserCompatCustomActionResultReceiver();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplBaseParcelizer + 41;
        read = i % 128;
        int i2 = i % 2;
    }

    @Override // kotlin.MaterialCheckBoxSavedState, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 99;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onStart();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = AudioAttributesImplApi21Parcelizer + 89;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    static void MediaBrowserCompatCustomActionResultReceiver() {
        RemoteActionCompatParcelizer = new char[]{56429, 46739, 2442, 40109, 30631, 51920, 24014, 12469, 35819, 7686, 61768, 17415, 57138, 45662, 1345, 39030, 29551, 50814, 56417, 46724, 2491, 40118, 30636, 4019, 25940, 55872, 20337, 42097, 6411, 36354, 58118, 22568, 52697, 8918, 38882, 3327, 24972, 54922, 19366, 41135, 5567, 56431, 46792, 2526, 40121, 30635, 51933, 24011, 12537, 35760, 7747, 61781, 17518, 57125, 45655, 1350, 38950, 29484, 50792, 22685, 13279, 34539, 6572, 60636, 18322, 55980, 44515, 'B', 39686, 28259, 49520, 21504, 12051, 33353, 5423, 59448, 17050, 54666, 43194, 936, 38540, 27072, 64678, 22463, 10818, 48472, 4200, 60196, 32342, 56420, 46729, 2458, 40111, 30651, 51843, 23941, 12468, 35808, 7700, 61711, 17467, 57145, 45635, 1357, 39014, 29554, 50793, 22669, 13249, 34476, 6561, 60616, 18382, 56053, 44529, 21, 39686, 28195, 49461, 21532, 12100, 33369, 5500, 59516, 17051, 54683, 43176, 959, 38618, 27094, 64752, 22440, 10772, 48399, 4156, 60269, 32338, 53580, 42052, 16177, 37478, 25750, 65422, 21183, 9656, 47296, 5002, 59104, 31157, 52319, 42756, 14884, 36134, 24610, 64329, 20061, 56373, 46803, 2527, 40171, 30694, 51851, 7271, 30363, 51593, 23731, 47038, 2770, 40412, 61664, 19406, 56854, 12567, 33853, 7937, 29276, 50500, 22644, 11068, 16834, 65243, 27644, 33014, 15745, 43679, 51172, 31930, 59735, 1561, 45909, 10344, 17683, 61959, 28455, 33824, 12575, 44995, 50385, 29162, 61171, 48949, 54733, 27347, 65523, 5351, 43392, 16018, 21397, 59581, 32072, 37462, 10111, 48245, 53504, 26139, 56376, 46799, 2519, 40171, 30705, 51855, 23965, 12457, 35773, 7747, 61782};
        AudioAttributesCompatParcelizer = -1237039177220573443L;
        write = new int[]{289209136, -776568361, 1241984551, 1292170291, -2110373341, 1055611357, 1733032347, -1265130691, -1359342406, 1642422495, -1855649736, 1353713077, -1422640877, -1404831366, -1266809028, -1143742533, -125115532, -1560064413};
    }
}
