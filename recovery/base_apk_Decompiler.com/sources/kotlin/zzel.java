package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/zzel;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zzel extends zzeg {
    private static long AudioAttributesCompatParcelizer;
    private static int IconCompatParcelizer;
    private static int MediaBrowserCompatCustomActionResultReceiver;
    private static int[] RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char write;
    private static final byte[] $$c = {37, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 106, 111};
    private static final int $$f = 162;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {94, -36, -26, 62, -70, 71, -5, -18, 2, 21, 7, -6, -48, 39, -7, -2, -20, 14, -41, 12, 12, -20, -3, 2, -8, 12, -26, 8, 14, 3, -3, 0, -20, -41, 29, 12, -16, 1, -6, -48, 39, -7, -2, -20, 14, -41, 12, 12, -20, -3, 2, -8, 12, -26, 8, -70, 71, -5, -27, 7, -10, -14, 6, -20};
    private static final int $$k = TsExtractor.TS_STREAM_TYPE_E_AC3;
    private static final byte[] $$d = {80, -72, 126, -24, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 83;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private static int MediaBrowserCompatItemReceiver = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(int r6, short r7, byte r8) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 103
            int r7 = r7 * 3
            int r7 = 1 - r7
            int r8 = r8 * 2
            int r8 = 4 - r8
            byte[] r0 = kotlin.zzel.$$c
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2b:
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzel.$$i(int, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r6 = r6 + 4
            byte[] r0 = kotlin.zzel.$$d
            int r7 = r7 + 65
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r6
            r5 = r2
            goto L22
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            r3 = r0[r6]
        L22:
            int r6 = r6 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r5
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzel.g(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.zzel.$$j
            int r1 = 28 - r5
            int r7 = 119 - r7
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r5 = 27 - r5
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r5
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L24:
            r3 = r0[r6]
        L26:
            int r7 = r7 + r3
            int r7 = r7 + 5
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzel.h(int, int, int, java.lang.Object[]):void");
    }

    public zzel() {
        super((byte) 0);
    }

    /* JADX INFO: renamed from: o.zzel$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/zzel$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "write", "(Landroid/content/Context;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent write(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new Intent(p0, (Class<?>) zzel.class);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void e(char[] cArr, int i, char[] cArr2, char[] cArr3, char c, Object[] objArr) throws Throwable {
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
        int i3 = $11 + 47;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.indexOf("", ""), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 22747, 36 - View.MeasureSpec.getMode(0), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 31368), 2721 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 37, 1895162189, false, $$i(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 15714 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 63, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (40976 - Drawable.resolveOpacity(0, 0)), 6121 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 29, -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (AudioAttributesCompatParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) IconCompatParcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) write) ^ (-3498762522182953692L)))));
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
        int i5 = $10 + 69;
        $11 = i5 % 128;
        if (i5 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i6 = 65 / 0;
            objArr[0] = str;
        }
    }

    private static void f(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = RemoteActionCompatParcelizer;
        int i4 = 43696;
        int i5 = -470782045;
        int i6 = 0;
        if (iArr2 != null) {
            int i7 = $10 + 109;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 11;
                $11 = i10 % 128;
                if (i10 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(iArr2[i9])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-470782045);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (MotionEvent.axisFromString("") + i4), 23297 - Color.alpha(0), 15 - View.MeasureSpec.getSize(0), -1648776394, false, "A", new Class[]{Integer.TYPE});
                        }
                        iArr3[i9] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                        i9 %= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(iArr2[i9])};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (43695 - (ViewConfiguration.getEdgeSlop() >> 16)), (ViewConfiguration.getPressedStateDuration() >> 16) + 23297, (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 14, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr3[i9] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    i9++;
                }
                i2 = 2;
                i4 = 43696;
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = RemoteActionCompatParcelizer;
        if (iArr5 != null) {
            int i11 = $10 + 45;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                Object[] objArr4 = new Object[1];
                objArr4[i6] = Integer.valueOf(iArr5[i13]);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(i5);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getTouchSlop() >> 8) + 43695), (TypedValue.complexToFraction(i6, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(i6, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23297, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 14, -1648776394, false, "A", new Class[]{Integer.TYPE});
                }
                iArr6[i13] = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                i13++;
                i5 = -470782045;
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        int i14 = i6;
        System.arraycopy(iArr5, i14, iArr4, i14, length2);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i14;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            int i15 = $11 + 123;
            $10 = i15 % 128;
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
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (43696 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 23297 - (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16, -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
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
                objRemoteActionCompatParcelizer5 = startForeground.read((char) (View.MeasureSpec.getMode(0) + 48194), 20126 - (ViewConfiguration.getJumpTapTimeout() >> 16), 20 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00da  */
    @Override // kotlin.zzeg, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2776
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzel.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.zzeg, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 47;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            int i4 = AudioAttributesImplApi21Parcelizer + 89;
            AudioAttributesImplApi26Parcelizer = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            f((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25, new int[]{1369553715, -611099783, 1445877086, 1422397933, -1152763628, -815247402, -1690604052, 1938731895, 1868756991, 448259059, 1566797271, -446004218, -458399748, -1011431345}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 17, new int[]{304472613, 1425754287, 277613497, -1636866074, -1554804156, -710602525, -98080053, -483072377, -333171018, -543183551}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i6 = AudioAttributesImplApi21Parcelizer + 99;
            AudioAttributesImplApi26Parcelizer = i6 % 128;
            int i7 = i6 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i8 = AudioAttributesImplApi26Parcelizer + 61;
            AudioAttributesImplApi21Parcelizer = i8 % 128;
            try {
                if (i8 % 2 != 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (Color.rgb(0, 0, 0) + 16781751), TextUtils.indexOf("", "", 0, 0) + 6054, 42 - ExpandableListView.getPackedPositionType(0L), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getTrimmedLength(""), (Process.myPid() >> 22) + 6030, ImageFormat.getBitsPerPixel(0) + 25, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    obj.hashCode();
                    throw null;
                }
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.indexOf("", "", 0) + 4535), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6053, 41 - TextUtils.indexOf((CharSequence) "", '0', 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) TextUtils.getOffsetBefore("", 0), Color.red(0) + 6030, 25 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bd  */
    @Override // kotlin.zzeg, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzel.onPause():void");
    }

    @Override // kotlin.zzeg, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        String strValueOf;
        String strValueOf2;
        Object[] objArr;
        Object[] objArr2;
        char c;
        List<Object[]> list;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object[] objArr3 = new Object[1];
        e(new char[]{0, 0, 0, 0}, TextUtils.getOffsetAfter("", 0), new char[]{50939, 46449, 31244, 11899, 16669, 22005, 6932, 60924, 11519, 46783, 2265, 54360, 33170, 10605, 31523, 47489, 5669, 19500}, new char[]{14456, 63364, 28549, 53904}, (char) (36975 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new char[]{0, 0, 0, 0}, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) - 642977799, new char[]{15584, 46041, 35009, 65171, 31549}, new char[]{63944, 44271, 1241, 62907}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) + 47767), objArr4);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context applicationContext = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            if (applicationContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0') + 4536), 6054 - KeyEvent.getDeadChar(0, 0), 42 - ExpandableListView.getPackedPositionType(0L), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, ViewConfiguration.getMaximumDrawingCacheSize() >> 24, new char[]{42904, 37316, 5411, 1840, 30617, 6410, 3696, 50844, 59418, 60929, 63938, 45492, 32452, 65235, 48710, 11709, 1358, 55703, 21647, 46782, 32908, 15375, 35734, 56185, 2107, 51620, 5554, 5728, 50999, 47239, 34907, 62452, 8298, 40738, 7797, 60049, 9933, 59130, 49106, 48598, 36004, 8390, 23759, 310, 53782, 60203, 45186, 44649}, new char[]{56112, 40129, 38728, 61260}, (char) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1), objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) + 15, new int[]{1849283097, -793569479, 241448647, -1840852321, 694124067, -100330634, -80875181, -1007675464, 1755521935, -481041931, 2053954231, -2075187110, 1212804101, 1055786182, 2014844758, -1088780303, -1139929643, -1042723631, 1530211929, -2142487694, 1297599637, 1228764168, -1333619698, 88268105, -1505936664, -2139456074, -1172763900, 408588660, 872866522, -944504336, 1254877647, 421785209}, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    f(64 - Color.green(0), new int[]{-915443348, 478974121, -1202066073, -294038096, -573905137, -1375165530, 1419388113, 1677336915, 183591550, -2054149983, 1135732633, -886049555, 1813453258, -147481461, -1186408365, -516574151, -2022120742, -2111093751, -1628505383, -210017878, -137836063, -797734154, 1960559114, -1041638720, 1181205519, 430993567, 1600913255, -2005844551, 2081209686, 730980926, -1937355767, -381799035}, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 1286826636, new char[]{31417, 51243, 34085, 37794, 30792, 7892, 43863, 7462, 64599, 62431, 21937, 45814, 52459, 20038, 22041, 64383, 9241, 53950, 48751, 15083, 53674, 65407, 28303, 26209, 13670, 9908, 60537, 4942, 8042, 37032, 32590, 23071, 26151, 21750, 11752, 40294, 45785, 1374, 26830, 11866, 14301, 13491, 15841, 56264, 48054, 36793, 63676, 27772, 202, 25166, 1076, 30159, 53361, 39594, 21980, 23978, 12179, 15029, 19412, 18432, 45432, 54844, 15289, 29764, 23007, 28594, 54018}, new char[]{59090, 19605, 63667, 33089}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 16853), objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 29, new int[]{-1665439182, -1367548973, 1468050873, 2002014018}, objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, new char[]{16946, 24368, 51128, 22725, 15481, 8692, 18633, 55897, 47865, 8030, 12618, 58506, 50515, 45716, 29613, 40261, 51031, 41069, 52334, 21223, 41686, 17838, 44449, 19601, 8056, 8893, 43424, 65015, 54223, 35134, 42016, 16269, 33178, 20395, 36951, 4445}, new char[]{41063, 45727, 56691, 57865}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10), objArr10);
                    Object[] objArr11 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr10[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) View.combineMeasuredStates(0, 0), 6030 - Color.green(0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr11);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        try {
            try {
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-18205161);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char gidForName = (char) (61147 - Process.getGidForName(""));
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 2146;
                    int defaultSize = View.getDefaultSize(0, 0) + 12;
                    byte[] bArr = $$d;
                    Object[] objArr12 = new Object[1];
                    g((short) 109, bArr[9], bArr[5], objArr12);
                    objRemoteActionCompatParcelizer3 = startForeground.read(gidForName, packedPositionChild, defaultSize, -2136739198, false, (String) objArr12[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
                    int i2 = AudioAttributesImplApi21Parcelizer + 5;
                    AudioAttributesImplApi26Parcelizer = i2 % 128;
                    if (i2 % 2 == 0) {
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-629126231);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            char cMyTid = (char) (61148 - (Process.myTid() >> 22));
                            int iRed = Color.red(0) + 2145;
                            int keyRepeatDelay = 12 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            byte[] bArr2 = $$d;
                            Object[] objArr13 = new Object[1];
                            g((short) 112, (byte) (-bArr2[113]), (byte) (-bArr2[137]), objArr13);
                            objRemoteActionCompatParcelizer4 = startForeground.read(cMyTid, iRed, keyRepeatDelay, -1530294468, false, (String) objArr13[0], null);
                        }
                        throw null;
                    }
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-629126231);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 61148);
                        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 2145;
                        int iMyPid = (Process.myPid() >> 22) + 12;
                        byte[] bArr3 = $$d;
                        Object[] objArr14 = new Object[1];
                        g((short) 112, (byte) (-bArr3[113]), (byte) (-bArr3[137]), objArr14);
                        objRemoteActionCompatParcelizer5 = startForeground.read(touchSlop, iMakeMeasureSpec, iMyPid, -1530294468, false, (String) objArr14[0], null);
                    }
                    list = (List) ((Field) objRemoteActionCompatParcelizer5).get(null);
                } else {
                    Object[] objArr15 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 21, new int[]{359431183, 1648647158, -498559871, 1558435077, 485268193, 1534464631, 555918630, -764902320}, objArr15);
                    Class<?> cls2 = Class.forName((String) objArr15[0]);
                    Object[] objArr16 = new Object[1];
                    f(ExpandableListView.getPackedPositionChild(0L) + 17, new int[]{1176060000, 943140570, -811232561, -481147629, -1322463790, 633565612, -1751995713, -1724135706}, objArr16);
                    int iIntValue2 = ((Integer) cls2.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr17 = {-1153785035};
                        Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-173351824);
                        if (objRemoteActionCompatParcelizer6 == null) {
                            objRemoteActionCompatParcelizer6 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 45844), 914 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 10 - Color.green(0), -1948051227, false, null, new Class[]{Integer.TYPE});
                        }
                        try {
                            Object[] objArr18 = {Integer.valueOf(iIntValue2), ((Constructor) objRemoteActionCompatParcelizer6).newInstance(objArr17)};
                            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(1891595430);
                            if (objRemoteActionCompatParcelizer7 == null) {
                                char gidForName2 = (char) (Process.getGidForName("") + 61149);
                                int i3 = 2145 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 13;
                                Object[] objArr19 = new Object[1];
                                g((short) 141, r11[75], (byte) (-$$d[45]), objArr19);
                                objRemoteActionCompatParcelizer7 = startForeground.read(gidForName2, i3, iLastIndexOf, 251047987, false, (String) objArr19[0], new Class[]{Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) View.resolveSizeAndState(0, 0, 0), 557 - Drawable.resolveOpacity(0, 0), 19 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)))});
                            }
                            list = (List) ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr18);
                            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-629126231);
                            if (objRemoteActionCompatParcelizer8 == null) {
                                char scrollDefaultDelay = (char) (61148 - (ViewConfiguration.getScrollDefaultDelay() >> 16));
                                int iRgb = (-16775071) - Color.rgb(0, 0, 0);
                                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 12;
                                byte[] bArr4 = $$d;
                                Object[] objArr20 = new Object[1];
                                g((short) 112, (byte) (-bArr4[113]), (byte) (-bArr4[137]), objArr20);
                                objRemoteActionCompatParcelizer8 = startForeground.read(scrollDefaultDelay, iRgb, absoluteGravity, -1530294468, false, (String) objArr20[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer8).set(null, list);
                            Object[] objArr21 = new Object[1];
                            e(new char[]{0, 0, 0, 0}, ExpandableListView.getPackedPositionGroup(0L), new char[]{58691, 62596, 27587, 23242, 24397, 14873, 2860, 32478, 47792, 23050, 32723, 1387, 23220, 4040, 22097, 19311, 10230, 11165, 59089, 60448, 36658, 23449}, new char[]{63069, 11519, 8154, 233}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) - 49), objArr21);
                            Class<?> cls3 = Class.forName((String) objArr21[0]);
                            Object[] objArr22 = new Object[1];
                            e(new char[]{0, 0, 0, 0}, (-319842306) - (ViewConfiguration.getWindowTouchSlop() >> 8), new char[]{54550, 48053, 23586, 574, 20029, 29202, 36172, 13624, 15811, 31523, 35871, 48465, 6639, 20823, 52213}, new char[]{65088, 61335, 18412, 44130}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 25124), objArr22);
                            long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue);
                            Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(301834150);
                            if (objRemoteActionCompatParcelizer9 == null) {
                                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 61149);
                                int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 2145;
                                int iMyPid2 = (Process.myPid() >> 22) + 12;
                                Object[] objArr23 = new Object[1];
                                g((short) 160, (byte) ($$e & 61), (byte) (-$$d[3]), objArr23);
                                objRemoteActionCompatParcelizer9 = startForeground.read(cIndexOf, packedPositionType, iMyPid2, 1874090803, false, (String) objArr23[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer9).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                            Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(-18205161);
                            if (objRemoteActionCompatParcelizer10 == null) {
                                char capsMode = (char) (61148 - TextUtils.getCapsMode("", 0, 0));
                                int iMyTid = (Process.myTid() >> 22) + 2145;
                                int i4 = 13 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                                byte[] bArr5 = $$d;
                                Object[] objArr24 = new Object[1];
                                g((short) 109, bArr5[9], bArr5[5], objArr24);
                                objRemoteActionCompatParcelizer10 = startForeground.read(capsMode, iMyTid, i4, -2136739198, false, (String) objArr24[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer10).set(null, lValueOf2);
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
                for (Object[] objArr25 : list) {
                    int i5 = ((int[]) objArr25[3])[0];
                    int i6 = ((int[]) objArr25[1])[0];
                    if (i6 != i5) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr25[2];
                        if (strArr != null) {
                            int i7 = AudioAttributesImplApi26Parcelizer + 65;
                            AudioAttributesImplApi21Parcelizer = i7 % 128;
                            int i8 = i7 % 2;
                            for (String str6 : strArr) {
                                int i9 = AudioAttributesImplApi21Parcelizer + 57;
                                AudioAttributesImplApi26Parcelizer = i9 % 128;
                                int i10 = i9 % 2;
                                arrayList.add(str6);
                            }
                        }
                        long j = -1;
                        long j2 = ((long) (i6 ^ i5)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
                        long j3 = 0;
                        long j4 = j2 | (((long) 10) << 32) | (j3 - ((j3 >> 63) << 32));
                        try {
                            Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                            if (objRemoteActionCompatParcelizer11 == null) {
                                objRemoteActionCompatParcelizer11 = startForeground.read((char) (ExpandableListView.getPackedPositionGroup(0L) + 4535), 6054 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                            }
                            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer11).invoke(null, null);
                            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                            int i11 = AudioAttributesImplApi21Parcelizer + 63;
                            AudioAttributesImplApi26Parcelizer = i11 % 128;
                            int i12 = i11 % 2;
                            try {
                                Object[] objArr26 = {-1153785035, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, false};
                                Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 6030 - Color.argb(0, 0, 0, 0), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24);
                                byte b = $$j[31];
                                Object[] objArr27 = new Object[1];
                                h(b, (byte) (b | 23), (byte) 37, objArr27);
                                cls4.getMethod((String) objArr27[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr26);
                            } catch (Throwable th4) {
                                Throwable cause4 = th4.getCause();
                                if (cause4 == null) {
                                    throw th4;
                                }
                                throw cause4;
                            }
                        } catch (Throwable th5) {
                            Throwable cause5 = th5.getCause();
                            if (cause5 == null) {
                                throw th5;
                            }
                            throw cause5;
                        }
                    }
                    int i13 = AudioAttributesImplApi26Parcelizer + 101;
                    AudioAttributesImplApi21Parcelizer = i13 % 128;
                    int i14 = i13 % 2;
                }
            } catch (Throwable th6) {
                Object[] objArr28 = new Object[1];
                e(new char[]{0, 0, 0, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 139935822, new char[]{60337, 5510, 17669, 6936, 19424, 32297, 24875, 37851, 36869, 15985, 34560}, new char[]{48227, 43199, 503, 39645}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 109), objArr28);
                String str7 = (String) objArr28[0];
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    PrintStream printStream = new PrintStream(byteArrayOutputStream);
                    th6.printStackTrace(printStream);
                    printStream.close();
                    strValueOf = byteArrayOutputStream.toString(CharsetNames.UTF_8);
                } catch (Throwable unused) {
                    strValueOf = String.valueOf(th6);
                }
                ArrayList arrayList2 = new ArrayList(2);
                arrayList2.add(strValueOf);
                arrayList2.add(str7);
                Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer12 == null) {
                    objRemoteActionCompatParcelizer12 = startForeground.read((char) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 4535), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6054, TextUtils.getTrimmedLength("") + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke3 = ((Method) objRemoteActionCompatParcelizer12).invoke(null, null);
                Object[] objArr29 = {-1153785035, 81604378625L, arrayList2, TrainingApplication.RemoteActionCompatParcelizer(), false};
                Class cls5 = (Class) startForeground.IconCompatParcelizer((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 6029 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.getOffsetBefore("", 0) + 24);
                byte b2 = $$j[31];
                Object[] objArr30 = new Object[1];
                h(b2, (byte) (b2 | 23), (byte) 37, objArr30);
                cls5.getMethod((String) objArr30[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke3, objArr29);
            }
            Context applicationContext2 = context;
            try {
                if (applicationContext2 != null) {
                    int i15 = AudioAttributesImplApi26Parcelizer + 55;
                    AudioAttributesImplApi21Parcelizer = i15 % 128;
                    if (i15 % 2 != 0) {
                        boolean z = applicationContext2 instanceof ContextWrapper;
                        throw null;
                    }
                    applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : context.getApplicationContext();
                }
            } catch (Throwable th7) {
                Object[] objArr31 = new Object[1];
                f((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 10, new int[]{-1097240535, -144138726, -1343093886, 1341181263, 46869399, 438554936}, objArr31);
                String str8 = (String) objArr31[0];
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    PrintStream printStream2 = new PrintStream(byteArrayOutputStream2);
                    th7.printStackTrace(printStream2);
                    printStream2.close();
                    strValueOf2 = byteArrayOutputStream2.toString(CharsetNames.UTF_8);
                } catch (Throwable unused2) {
                    strValueOf2 = String.valueOf(th7);
                }
                ArrayList arrayList3 = new ArrayList(2);
                arrayList3.add(strValueOf2);
                arrayList3.add(str8);
                Object objRemoteActionCompatParcelizer13 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer13 == null) {
                    objRemoteActionCompatParcelizer13 = startForeground.read((char) (4535 - (KeyEvent.getMaxKeyCode() >> 16)), 6055 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 43 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke4 = ((Method) objRemoteActionCompatParcelizer13).invoke(null, null);
                Object[] objArr32 = {-1153785035, 81604378625L, arrayList3, TrainingApplication.RemoteActionCompatParcelizer(), false};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) View.resolveSize(0, 0), 6030 - (Process.myPid() >> 22), TextUtils.getCapsMode("", 0, 0) + 24);
                byte b3 = $$j[31];
                Object[] objArr33 = new Object[1];
                h(b3, (byte) (b3 | 23), (byte) 37, objArr33);
                cls6.getMethod((String) objArr33[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke4, objArr32);
            }
            try {
                Object[] objArr34 = {-1153785035};
                Object objRemoteActionCompatParcelizer14 = startForeground.RemoteActionCompatParcelizer(-1128409246);
                if (objRemoteActionCompatParcelizer14 == null) {
                    objRemoteActionCompatParcelizer14 = startForeground.read((char) TextUtils.getTrimmedLength(""), 1992 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 12 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1024191497, false, null, new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr35 = {applicationContext2, ((Constructor) objRemoteActionCompatParcelizer14).newInstance(objArr34)};
                    Object objRemoteActionCompatParcelizer15 = startForeground.RemoteActionCompatParcelizer(352975618);
                    if (objRemoteActionCompatParcelizer15 == null) {
                        char cBlue = (char) (19323 - Color.blue(0));
                        int i16 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 2759;
                        int iAlpha = Color.alpha(0) + 99;
                        Object[] objArr36 = new Object[1];
                        g((short) 160, (byte) ($$e & 61), (byte) (-$$d[3]), objArr36);
                        objRemoteActionCompatParcelizer15 = startForeground.read(cBlue, i16, iAlpha, 1799372695, false, (String) objArr36[0], new Class[]{Context.class, (Class) startForeground.IconCompatParcelizer((char) (9579 - Process.getGidForName("")), 3446 - (Process.myTid() >> 22), KeyEvent.getDeadChar(0, 0) + 144)});
                    }
                    ((Method) objRemoteActionCompatParcelizer15).invoke(null, objArr35);
                    int i17 = AudioAttributesImplApi21Parcelizer + 51;
                    AudioAttributesImplApi26Parcelizer = i17 % 128;
                    int i18 = i17 % 2;
                    Object objRemoteActionCompatParcelizer16 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer16 == null) {
                        char cResolveSize = (char) (View.resolveSize(0, 0) + 13183);
                        int iAlpha2 = Color.alpha(0) + 1649;
                        int i19 = 27 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        Object[] objArr37 = new Object[1];
                        g(r3[5], (byte) (-$$d[113]), (byte) 40, objArr37);
                        objRemoteActionCompatParcelizer16 = startForeground.read(cResolveSize, iAlpha2, i19, -133433128, false, (String) objArr37[0], null);
                    }
                    if (((Field) objRemoteActionCompatParcelizer16).getLong(null) != -1) {
                        Object objRemoteActionCompatParcelizer17 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                        if (objRemoteActionCompatParcelizer17 == null) {
                            char packedPositionType2 = (char) (ExpandableListView.getPackedPositionType(0L) + 13183);
                            int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1649;
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 26;
                            byte[] bArr6 = $$d;
                            Object[] objArr38 = new Object[1];
                            g((short) (-bArr6[27]), bArr6[5], (byte) (-bArr6[8]), objArr38);
                            objRemoteActionCompatParcelizer17 = startForeground.read(packedPositionType2, iNormalizeMetaState, iResolveOpacity, -1033747278, false, (String) objArr38[0], null);
                        }
                        objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer17).get(null);
                    } else {
                        Object[] objArr39 = new Object[1];
                        f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 6, new int[]{359431183, 1648647158, -498559871, 1558435077, 485268193, 1534464631, 555918630, -764902320}, objArr39);
                        Class<?> cls7 = Class.forName((String) objArr39[0]);
                        Object[] objArr40 = new Object[1];
                        f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 19, new int[]{1176060000, 943140570, -811232561, -481147629, -1322463790, 633565612, -1751995713, -1724135706}, objArr40);
                        try {
                            Object[] objArr41 = {Integer.valueOf(((Integer) cls7.getMethod((String) objArr40[0], Object.class).invoke(null, this)).intValue()), 0, -2109134230};
                            Object[] objArr42 = new Object[1];
                            h((byte) ($$j[9] + 1), (byte) 50, r1[27], objArr42);
                            Class<?> cls8 = Class.forName((String) objArr42[0]);
                            byte b4 = (byte) 23;
                            Object[] objArr43 = new Object[1];
                            h(b4, (byte) (b4 | 32), r1[31], objArr43);
                            objArr = (Object[]) cls8.getMethod((String) objArr43[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr41);
                            Object objRemoteActionCompatParcelizer18 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                            if (objRemoteActionCompatParcelizer18 == null) {
                                char cArgb = (char) (Color.argb(0, 0, 0, 0) + 13183);
                                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0') + 1650;
                                int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 26;
                                byte[] bArr7 = $$d;
                                Object[] objArr44 = new Object[1];
                                g((short) (-bArr7[27]), bArr7[5], (byte) (-bArr7[8]), objArr44);
                                objRemoteActionCompatParcelizer18 = startForeground.read(cArgb, iLastIndexOf2, iKeyCodeFromString, -1033747278, false, (String) objArr44[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer18).set(null, objArr);
                            try {
                                Object[] objArr45 = new Object[1];
                                e(new char[]{0, 0, 0, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, new char[]{58691, 62596, 27587, 23242, 24397, 14873, 2860, 32478, 47792, 23050, 32723, 1387, 23220, 4040, 22097, 19311, 10230, 11165, 59089, 60448, 36658, 23449}, new char[]{63069, 11519, 8154, 233}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 109), objArr45);
                                Class<?> cls9 = Class.forName((String) objArr45[0]);
                                Object[] objArr46 = new Object[1];
                                e(new char[]{0, 0, 0, 0}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 319842307, new char[]{54550, 48053, 23586, 574, 20029, 29202, 36172, 13624, 15811, 31523, 35871, 48465, 6639, 20823, 52213}, new char[]{65088, 61335, 18412, 44130}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 25124), objArr46);
                                long jLongValue2 = ((Long) cls9.getDeclaredMethod((String) objArr46[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf3 = Long.valueOf(jLongValue2);
                                Object objRemoteActionCompatParcelizer19 = startForeground.RemoteActionCompatParcelizer(2104791916);
                                if (objRemoteActionCompatParcelizer19 == null) {
                                    char cResolveOpacity = (char) (13183 - Drawable.resolveOpacity(0, 0));
                                    int i20 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1649;
                                    int iGreen = Color.green(0) + 26;
                                    Object[] objArr47 = new Object[1];
                                    g((short) 76, r12[5], (byte) (-$$d[8]), objArr47);
                                    objRemoteActionCompatParcelizer19 = startForeground.read(cResolveOpacity, i20, iGreen, 54351865, false, (String) objArr47[0], null);
                                }
                                ((Field) objRemoteActionCompatParcelizer19).set(null, lValueOf3);
                                Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                                Object objRemoteActionCompatParcelizer20 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                                if (objRemoteActionCompatParcelizer20 == null) {
                                    char fadingEdgeLength = (char) (13183 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                                    int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 1649;
                                    int i21 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25;
                                    Object[] objArr48 = new Object[1];
                                    g(r8[5], (byte) (-$$d[113]), (byte) 40, objArr48);
                                    objRemoteActionCompatParcelizer20 = startForeground.read(fadingEdgeLength, windowTouchSlop, i21, -133433128, false, (String) objArr48[0], null);
                                }
                                ((Field) objRemoteActionCompatParcelizer20).set(null, lValueOf4);
                            } catch (Exception unused3) {
                                throw new RuntimeException();
                            }
                        } catch (Throwable th8) {
                            Throwable cause6 = th8.getCause();
                            if (cause6 == null) {
                                throw th8;
                            }
                            throw cause6;
                        }
                    }
                    int i22 = ((int[]) objArr[3])[0];
                    int i23 = ((int[]) objArr[2])[0];
                    if (i23 != i22) {
                        long j5 = -1;
                        long j6 = (((long) 0) << 32) | (j5 - ((j5 >> 63) << 32));
                        long j7 = 0;
                        long j8 = (j6 & ((long) (i23 ^ i22))) | (((long) 2) << 32) | (j7 - ((j7 >> 63) << 32));
                        Object objRemoteActionCompatParcelizer21 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                        if (objRemoteActionCompatParcelizer21 == null) {
                            objRemoteActionCompatParcelizer21 = startForeground.read((char) (4535 - (ViewConfiguration.getJumpTapTimeout() >> 16)), 6054 - TextUtils.getOffsetAfter("", 0), 41 - ImageFormat.getBitsPerPixel(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                        }
                        Object objInvoke5 = ((Method) objRemoteActionCompatParcelizer21).invoke(null, null);
                        Object[] objArr49 = {-1153785035, Long.valueOf(j8), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                        Class cls10 = (Class) startForeground.IconCompatParcelizer((char) (ExpandableListView.getPackedPositionChild(0L) + 1), TextUtils.getCapsMode("", 0, 0) + 6030, 24 - KeyEvent.getDeadChar(0, 0));
                        byte b5 = $$j[31];
                        Object[] objArr50 = new Object[1];
                        h(b5, (byte) (b5 | 23), (byte) 37, objArr50);
                        cls10.getMethod((String) objArr50[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke5, objArr49);
                    }
                    Object objRemoteActionCompatParcelizer22 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                    if (objRemoteActionCompatParcelizer22 == null) {
                        char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 943;
                        int iArgb = Color.argb(0, 0, 0, 0) + 36;
                        byte[] bArr8 = $$d;
                        Object[] objArr51 = new Object[1];
                        g((short) 109, bArr8[9], bArr8[5], objArr51);
                        objRemoteActionCompatParcelizer22 = startForeground.read(scrollDefaultDelay2, touchSlop2, iArgb, -167186806, false, (String) objArr51[0], null);
                    }
                    if (((Field) objRemoteActionCompatParcelizer22).getLong(null) != -1) {
                        Object objRemoteActionCompatParcelizer23 = startForeground.RemoteActionCompatParcelizer(-757676623);
                        if (objRemoteActionCompatParcelizer23 == null) {
                            char cBlue2 = (char) Color.blue(0);
                            int keyRepeatDelay2 = 943 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int keyRepeatDelay3 = 36 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            byte[] bArr9 = $$d;
                            Object[] objArr52 = new Object[1];
                            g((short) 112, (byte) (-bArr9[113]), (byte) (-bArr9[137]), objArr52);
                            objRemoteActionCompatParcelizer23 = startForeground.read(cBlue2, keyRepeatDelay2, keyRepeatDelay3, -1398865628, false, (String) objArr52[0], null);
                        }
                        objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer23).get(null);
                        c = 2;
                    } else {
                        Object[] objArr53 = new Object[1];
                        f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(3) - 84, new int[]{359431183, 1648647158, -498559871, 1558435077, 485268193, 1534464631, 555918630, -764902320}, objArr53);
                        Class<?> cls11 = Class.forName((String) objArr53[0]);
                        Object[] objArr54 = new Object[1];
                        f((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 15, new int[]{1176060000, 943140570, -811232561, -481147629, -1322463790, 633565612, -1751995713, -1724135706}, objArr54);
                        Object[] objArr55 = {Integer.valueOf(((Integer) cls11.getMethod((String) objArr54[0], Object.class).invoke(null, this)).intValue()), 0, -782772969};
                        Object objRemoteActionCompatParcelizer24 = startForeground.RemoteActionCompatParcelizer(-21191141);
                        if (objRemoteActionCompatParcelizer24 == null) {
                            char fadingEdgeLength2 = (char) (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 943;
                            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 37;
                            byte[] bArr10 = $$d;
                            Object[] objArr56 = new Object[1];
                            g((short) 187, bArr10[5], bArr10[103], objArr56);
                            objRemoteActionCompatParcelizer24 = startForeground.read(fadingEdgeLength2, offsetBefore, iIndexOf, -2131402098, false, (String) objArr56[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        objArr2 = (Object[]) ((Method) objRemoteActionCompatParcelizer24).invoke(null, objArr55);
                        Object objRemoteActionCompatParcelizer25 = startForeground.RemoteActionCompatParcelizer(-757676623);
                        if (objRemoteActionCompatParcelizer25 == null) {
                            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 943;
                            int touchSlop3 = (ViewConfiguration.getTouchSlop() >> 8) + 36;
                            byte[] bArr11 = $$d;
                            Object[] objArr57 = new Object[1];
                            g((short) 112, (byte) (-bArr11[113]), (byte) (-bArr11[137]), objArr57);
                            objRemoteActionCompatParcelizer25 = startForeground.read(cNormalizeMetaState, absoluteGravity2, touchSlop3, -1398865628, false, (String) objArr57[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer25).set(null, objArr2);
                        try {
                            Object[] objArr58 = new Object[1];
                            e(new char[]{0, 0, 0, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4, new char[]{58691, 62596, 27587, 23242, 24397, 14873, 2860, 32478, 47792, 23050, 32723, 1387, 23220, 4040, 22097, 19311, 10230, 11165, 59089, 60448, 36658, 23449}, new char[]{63069, 11519, 8154, 233}, (char) (Color.rgb(0, 0, 0) + BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE), objArr58);
                            Class<?> cls12 = Class.forName((String) objArr58[0]);
                            Object[] objArr59 = new Object[1];
                            e(new char[]{0, 0, 0, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 319842316, new char[]{54550, 48053, 23586, 574, 20029, 29202, 36172, 13624, 15811, 31523, 35871, 48465, 6639, 20823, 52213}, new char[]{65088, 61335, 18412, 44130}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 25123), objArr59);
                            long jLongValue3 = ((Long) cls12.getDeclaredMethod((String) objArr59[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf5 = Long.valueOf(jLongValue3);
                            Object objRemoteActionCompatParcelizer26 = startForeground.RemoteActionCompatParcelizer(-1539638354);
                            if (objRemoteActionCompatParcelizer26 == null) {
                                int absoluteGravity3 = Gravity.getAbsoluteGravity(0, 0) + 943;
                                int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L) + 37;
                                Object[] objArr60 = new Object[1];
                                g((short) 160, (byte) ($$e & 61), (byte) (-$$d[3]), objArr60);
                                objRemoteActionCompatParcelizer26 = startForeground.read((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), absoluteGravity3, packedPositionChild2, -629981381, false, (String) objArr60[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer26).set(null, lValueOf5);
                            Long lValueOf6 = Long.valueOf(jLongValue3 >> 12);
                            Object objRemoteActionCompatParcelizer27 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                            if (objRemoteActionCompatParcelizer27 == null) {
                                char cResolveSize2 = (char) View.resolveSize(0, 0);
                                int iCombineMeasuredStates = 943 - View.combineMeasuredStates(0, 0);
                                int size = 36 - View.MeasureSpec.getSize(0);
                                byte[] bArr12 = $$d;
                                Object[] objArr61 = new Object[1];
                                g((short) 109, bArr12[9], bArr12[5], objArr61);
                                objRemoteActionCompatParcelizer27 = startForeground.read(cResolveSize2, iCombineMeasuredStates, size, -167186806, false, (String) objArr61[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer27).set(null, lValueOf6);
                            int i24 = AudioAttributesImplApi26Parcelizer + 53;
                            AudioAttributesImplApi21Parcelizer = i24 % 128;
                            c = 2;
                            int i25 = i24 % 2;
                        } catch (Exception unused4) {
                            throw new RuntimeException();
                        }
                    }
                    int i26 = ((int[]) objArr2[c])[0];
                    int i27 = ((int[]) objArr2[0])[0];
                    if (i27 != i26) {
                        long j9 = -1;
                        long j10 = 0;
                        long j11 = (((long) (i27 ^ i26)) & ((((long) 0) << 32) | (j9 - ((j9 >> 63) << 32)))) | (((long) 1) << 32) | (j10 - ((j10 >> 63) << 32));
                        Object objRemoteActionCompatParcelizer28 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                        if (objRemoteActionCompatParcelizer28 == null) {
                            objRemoteActionCompatParcelizer28 = startForeground.read((char) (4535 - View.MeasureSpec.getSize(0)), Color.green(0) + 6054, KeyEvent.getDeadChar(0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                        }
                        Object objInvoke6 = ((Method) objRemoteActionCompatParcelizer28).invoke(null, null);
                        Object[] objArr62 = {-1153785035, Long.valueOf(j11), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                        Class cls13 = (Class) startForeground.IconCompatParcelizer((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 6029 - ((byte) KeyEvent.getModifierMetaStateMask()), 23 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                        byte b6 = $$j[31];
                        Object[] objArr63 = new Object[1];
                        h(b6, (byte) (b6 | 23), (byte) 37, objArr63);
                        cls13.getMethod((String) objArr63[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke6, objArr62);
                    }
                } catch (Throwable th9) {
                    Throwable cause7 = th9.getCause();
                    if (cause7 == null) {
                        throw th9;
                    }
                    throw cause7;
                }
            } catch (Throwable th10) {
                Throwable cause8 = th10.getCause();
                if (cause8 == null) {
                    throw th10;
                }
                throw cause8;
            }
        } catch (Throwable th11) {
            Throwable cause9 = th11.getCause();
            if (cause9 == null) {
                throw th11;
            }
            throw cause9;
        }
    }

    static {
        MediaBrowserCompatCustomActionResultReceiver = 0;
        MediaBrowserCompatCustomActionResultReceiver();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatItemReceiver + 109;
        MediaBrowserCompatCustomActionResultReceiver = i % 128;
        if (i % 2 != 0) {
            int i2 = 65 / 0;
        }
    }

    @getMagicModuleMeta
    public static final Intent IconCompatParcelizer(Context context) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 99;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Intent intentWrite = Companion.write(context);
        int i4 = AudioAttributesImplApi26Parcelizer + 45;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 19 / 0;
        }
        return intentWrite;
    }

    @Override // kotlin.zzeg, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 25;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = AudioAttributesImplApi26Parcelizer + 81;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void MediaBrowserCompatCustomActionResultReceiver() {
        AudioAttributesCompatParcelizer = -3498762522182953692L;
        IconCompatParcelizer = -136981212;
        write = (char) 60626;
        RemoteActionCompatParcelizer = new int[]{1070447183, 1736193084, 2018666376, 1035198298, 1848544110, -1856111360, 265541070, 1191187980, -820986663, -1052756140, -751733806, -823331371, -693050936, 2077650907, -352037399, -2048043356, 429568634, 1275302958};
    }
}
