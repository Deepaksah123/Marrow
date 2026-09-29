package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/writeDoubleArray;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lo/parseRoleFlagsFromRoleDescriptors;", "RemoteActionCompatParcelizer", "Lo/parseRoleFlagsFromRoleDescriptors;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class writeDoubleArray extends writeByte {
    private static char[] AudioAttributesCompatParcelizer;
    private static char[] IconCompatParcelizer;
    private static int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long write;
    private parseRoleFlagsFromRoleDescriptors RemoteActionCompatParcelizer;
    private static final byte[] $$l = {61, -4, -83, 58};
    private static final int $$m = 116;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {37, -1, TarConstants.LF_CONTIG, -26, -54, 34, 62, 2, -20, 39, 0, 35, -9, 24, -30, 47, 14, 7, -30, TarConstants.LF_CONTIG, 9, 14, 10, 10, 2, 20, 17, -29, 40, 21, 12, -4, 20, 2, 24, -34, 62, 7, -4, 24, 7, -2, 22, -14, TarConstants.LF_LINK, 0, 17, -1, 8, 26, 0, 5, -12, 32, 23, 0, 13, 8, -36, 37, 23, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -54, 68, 9, 26, -21, 38, 16, -8, 22, -31, 62, -4, 11, 10, 24, -2, 10, -21, 60, 8, -6, 30, 0, 17, 10, -14, 41, -68, 40, 63, -6, 16, 17, -35, 62, 11, 9, 2, 4, 30, 10, -4, 25, -37, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -2, 7, 14};
    private static final int $$k = 64;
    private static final byte[] $$d = {112, 17, 101, TarConstants.LF_CONTIG, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 34;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int AudioAttributesImplApi21Parcelizer = 1;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(int r7, short r8, byte r9) {
        /*
            int r9 = r9 * 3
            int r9 = r9 + 101
            byte[] r0 = kotlin.writeDoubleArray.$$l
            int r8 = r8 * 4
            int r8 = 3 - r8
            int r7 = r7 * 4
            int r7 = 1 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r7) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L27:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L2c:
            int r3 = -r3
            int r8 = r8 + r3
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeDoubleArray.$$n(int, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.writeDoubleArray.$$d
            int r6 = r6 + 4
            int r8 = r8 + 65
            int r1 = r7 + 4
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeDoubleArray.g(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 4
            int r5 = r5 * 4
            int r0 = r5 + 4
            int r6 = r6 + 73
            byte[] r1 = kotlin.writeDoubleArray.$$j
            byte[] r0 = new byte[r0]
            int r5 = r5 + 3
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r5
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r7]
        L26:
            int r7 = r7 + 1
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeDoubleArray.h(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.writeDoubleArray$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/writeDoubleArray$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "Landroid/content/Intent;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent AudioAttributesCompatParcelizer(Context p0, String p1, String p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            Intent intent = new Intent(p0, (Class<?>) writeDoubleArray.class);
            intent.putExtra("country_code", p1);
            intent.putExtra("phone_num", p2);
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
            int i4 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(IconCompatParcelizer[i + i4])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 36622), 2339 - ((byte) KeyEvent.getModifierMetaStateMask()), 29 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 480654850, false, $$n(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i4), Long.valueOf(write), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) View.resolveSize(0, 0), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 9701, TextUtils.lastIndexOf("", '0') + 27, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i4] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 23784 - (ViewConfiguration.getTouchSlop() >> 8), 33 - (ViewConfiguration.getEdgeSlop() >> 16), -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
            int i5 = $11 + 93;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr5 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 23784 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        String str = new String(cArr);
        int i7 = $10 + 101;
        $11 = i7 % 128;
        int i8 = i7 % 2;
        objArr[0] = str;
    }

    private static void f(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char c;
        int i = 2;
        int i2 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = AudioAttributesCompatParcelizer;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 25;
                $10 = i8 % 128;
                int i9 = i8 % i;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((Process.getThreadPriority(0) + 20) >> 6), 11613 - (ViewConfiguration.getFadingEdgeLength() >> 16), 20 - ExpandableListView.getPackedPositionType(0L), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i7++;
                    i = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i10 = $10 + 47;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr = new char[i4];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                c = 1;
            } else {
                cArr = new char[i4];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                c = 0;
            }
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i11 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0, 0) + 22960, (-16777173) - Color.rgb(0, 0, 0), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i11] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i12 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (31588 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), KeyEvent.keyCodeFromString("") + 9863, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 65, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i12] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c = cArr[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (37821 - TextUtils.indexOf((CharSequence) "", '0', 0)), 9754 - Color.green(0), AndroidCharacter.getMirror('0') - 21, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            int i13 = $11 + 123;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr4 = cArr;
        }
        if (i6 > 0) {
            int i15 = $10 + 15;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr4, 0, cArr5, 0, i4);
            int i17 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr4, i17, i6);
            System.arraycopy(cArr5, i6, cArr4, 0, i17);
            int i18 = $11 + 79;
            $10 = i18 % 128;
            int i19 = i18 % 2;
        }
        if (z) {
            int i20 = $10 + 101;
            $11 = i20 % 128;
            int i21 = i20 % 2;
            char[] cArr6 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr4[(i4 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr4 = cArr6;
        }
        if (i5 > 0) {
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c5  */
    @Override // kotlin.writeByte, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2216
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeDoubleArray.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // kotlin.writeByte, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 307
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeDoubleArray.onResume():void");
    }

    @Override // kotlin.writeByte, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f(true, new byte[]{0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1}, new int[]{5, 26, 103, 13}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 17, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(3) - 97, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = (((baseContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) baseContext).getBaseContext() != null) ? baseContext.getApplicationContext() : null;
        }
        if (baseContext != null) {
            int i2 = AudioAttributesImplApi26Parcelizer + 99;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - TextUtils.getTrimmedLength("")), Color.rgb(0, 0, 0) + 16783270, 43 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), TextUtils.indexOf("", "", 0, 0) + 6030, (KeyEvent.getMaxKeyCode() >> 16) + 24, -861814097, false, "read", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    int i3 = 85 / 0;
                } else {
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.indexOf("", "", 0, 0) + 4535), 6054 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) KeyEvent.getDeadChar(0, 0), View.MeasureSpec.getSize(0) + 6030, 24 - Drawable.resolveOpacity(0, 0), -861814097, false, "read", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke2, objArr4);
                }
                int i4 = AudioAttributesImplApi21Parcelizer + 41;
                AudioAttributesImplApi26Parcelizer = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 4 % 3;
                }
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00dd  */
    @Override // kotlin.writeByte, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.writeDoubleArray.attachBaseContext(android.content.Context):void");
    }

    static {
        MediaBrowserCompatItemReceiver = 0;
        AudioAttributesImplApi21Parcelizer();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatCustomActionResultReceiver + 3;
        MediaBrowserCompatItemReceiver = i % 128;
        int i2 = i % 2;
    }

    @Override // kotlin.writeByte, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 19;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = AudioAttributesImplApi21Parcelizer + 9;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    static void AudioAttributesImplApi21Parcelizer() {
        IconCompatParcelizer = new char[]{51977, 46381, 14170, 45467, 13227, 48598, 15886, 47211, 14943, 42136, 9960, 41185, 8478, 41768, 11601, 44936, 10667, 43968, 56431, 41554, 8232, 42751, 9413, 43701, 10618, 44896, 11556, 46079, 12750, 47036, 13931, 46146, 14882, 47328, 16083, 48313, 56430, 41494, 8251, 42729, 9361, 43753, 10605, 44825, 11568, 46059, 12695, 47076, 13872, 46146, 14898, 47341, 16004, 48310, 872, 33036, 1890, 34234, 2957, 35299, 2109, 36442, 3126, 37564, 4235, 38629, 5431, 39681, 6488, 40934, 7565, 58248, 25185, 57438, 26205, 58599, 27269, 59613, 28519, 60677, 29451, 61873, 30598, 62856, 29737, 64083, 30732, 65276, 31873, 49885, 16685, 51026, 17749, 52221, 18823, 53127, 20014, 52228, 21072, 53409, 57705, 40789, 7479, 39909, 6610, 38837, 59331, 39403, 7109, 40263, 8043, 37140, 4802, 38125, 5764, 34890, 2617, 35856, 3475, 36851, 415, 33602, 1397, 34589, 14554, 47865, 15567, 48708, 12403, 45569, 13215, 46581, 14286, 43338, 11122, 44363, 11928, 41122, 8864, 42011, 9841, 55334, 56422, 41542, 8236, 42732, 9358, 43703, 10607, 44879, 11571, 45985, 12785, 47020, 13947, 46167, 14899, 47332, 51727, 46125, 13911, 45190, 12975, 48339, 16130, 47394, 15193, 42374, 10157, 30710, 2523, 35757, 3447, 36695, 291, 33527, 1245, 34467, 6263, 39516};
        write = -1974873897464782297L;
        AudioAttributesCompatParcelizer = new char[]{44801, 44702, 44700, 44715, 44703, 45022, 44820, 44860, 44893, 44869, 44836, 44858, 44871, 44889, 44893, 44888, 44890, 44868, 44867, 44867, 44864, 44888, 44894, 44879, 44871, 44887, 44895, 44892, 44892, 44895, 44888, 44987, 45038, 44992, 44984, 44998, 45039, 45039, 44997, 44988, 44990, 44991, 44993, 45035, 45032, 45033, 45038, 44993, 44984, 44998, 45038, 45039, 44997, 44978, 44988, 44989, 44988, 44993, 44999, 44998, 45032, 45032, 45033, 44999, 44990, 44993, 44992, 44987, 44987, 44984, 44992, 44992, 44999, 44997, 44978, 44997, 45039, 44998, 44987, 44975, 45038, 45044, 45038, 44996, 45037, 45037, 45019, 45018, 45019, 45026, 45044, 45038, 44993, 45039, 45026, 45036, 45044, 45044, 45026, 45016, 45016, 45019, 45019, 45026, 45038, 44998, 44993, 44997, 45017, 44997, 44998, 44993, 44999, 45036, 45039, 45037, 45037, 44999, 44998, 44997, 45016, 45037, 45044, 45045, 44810, 45036, 45039, 45039, 44997, 45016, 44999, 44993, 45018, 45019, 44997, 45019, 45024, 44810, 45045, 45037, 45026, 45037, 45018, 45037, 44890, 44869, 44865, 44891, 44882, 44860, 44861, 44851, 44831, 44837, 44888, 44888, 44868, 44892, 44882, 44888, 44889, 44883, 44893, 44892, 44849, 44819, 44830, 44836, 44877, 44864, 44869, 44893, 44880, 44895, 44893, 44892, 44868, 44890, 44863, 44860, 44889, 44888, 44890, 44866, 44869, 44890, 44877, 44869, 44882, 44860, 44837, 44889, 44890, 44868, 44890, 44890, 44893, 44882, 44890, 44868, 44890, 44836, 44839, 44868, 44889, 44857, 44839, 44871, 44891, 44859, 44990, 45036, 45038, 45027, 45051, 45028, 45028, 45052, 45034, 45022, 45024, 45031, 45023, 45011, 45027, 45038, 45050, 44887, 44885, 44905, 44871, 44868, 44885, 44904, 44899, 44902, 44886, 44860, 44876, 44909, 44878, 44853, 44886, 44904, 44908, 44907, 44885, 44887, 44988, 45027, 45039, 45026, 45036, 45026, 45051, 45030, 45038, 45009, 45009, 45033, 45036, 45050, 45028};
    }
}
