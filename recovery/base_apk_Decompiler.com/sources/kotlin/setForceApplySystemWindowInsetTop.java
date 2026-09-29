package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setForceApplySystemWindowInsetTop;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setForceApplySystemWindowInsetTop extends BottomAppBar {
    private static int AudioAttributesCompatParcelizer;
    private static int AudioAttributesImplApi21Parcelizer;
    private static short[] AudioAttributesImplApi26Parcelizer;
    private static byte[] IconCompatParcelizer;
    private static int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int read;
    private static int write;
    private static final byte[] $$c = {34, TarConstants.LF_NORMAL, 18, 42};
    private static final int $$f = 2;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {77, 21, 89, -51, -18, -4, 57, -62, -1, -24, -7, 9, -19, -12, 5, -5, 56, -66, 3, -8, -14, -14, -2, -5, 58, -60, -3, -25, 13, -7, -13, -11, 4, TarConstants.LF_NORMAL, -66, 0, -13, TarConstants.LF_BLK, -9, 0, -34, 0, -13, 20, -9, -39, -37, 5, -9, 66, -52, -21, -28, 29, -43, 3, 5, 17, -25, -18, 2, -58, 11, -11, -12, 40, -57, -6, -4, 3, 1, -25, -5, 9, -20, 42, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19, -25, -14, -8, -11, 9, 30, -40, -23, 5, -12, -5, 37, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19, 59, -63, -4, -21, 42, -55, -3, 11, -25, 5, -12, -5, 27, -34, -9, -6, -3, -16, -32, -18, -5, 37, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19};
    private static final int $$h = 100;
    private static final byte[] $$a = {32, -59, 22, 74, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 255;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int MediaBrowserCompatSearchResultReceiver = 1;
    private static int MediaBrowserCompatItemReceiver = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(int r6, int r7, byte r8) {
        /*
            int r7 = r7 * 2
            int r7 = 112 - r7
            byte[] r0 = kotlin.setForceApplySystemWindowInsetTop.$$c
            int r8 = r8 * 2
            int r8 = 1 - r8
            int r6 = r6 * 3
            int r6 = 3 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            int r6 = r6 + 1
            r4 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2c:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setForceApplySystemWindowInsetTop.$$i(int, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 4
            int r7 = r7 + 65
            int r0 = 44 - r6
            byte[] r1 = kotlin.setForceApplySystemWindowInsetTop.$$a
            byte[] r0 = new byte[r0]
            int r6 = 43 - r6
            r2 = -1
            if (r1 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r6
            goto L26
        L13:
            r3 = r2
        L14:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L24:
            r4 = r1[r5]
        L26:
            int r7 = r7 + r4
            int r7 = r7 + r2
            int r5 = r5 + 1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setForceApplySystemWindowInsetTop.c(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.setForceApplySystemWindowInsetTop.$$g
            int r8 = 111 - r8
            int r6 = r6 * 3
            int r6 = 136 - r6
            int r1 = r7 + 19
            byte[] r1 = new byte[r1]
            int r7 = r7 + 18
            r2 = 0
            if (r0 != 0) goto L15
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r8 = r8 + 1
            int r3 = r3 + r6
            int r6 = r3 + (-6)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setForceApplySystemWindowInsetTop.d(int, short, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.setForceApplySystemWindowInsetTop$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/setForceApplySystemWindowInsetTop$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/setStaticLayoutBuilderConfigurer;", "p1", "Landroid/content/Intent;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;Lo/setStaticLayoutBuilderConfigurer;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent AudioAttributesCompatParcelizer(Context p0, setStaticLayoutBuilderConfigurer p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) setForceApplySystemWindowInsetTop.class);
            p1.write(intent);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void b(int i, int i2, boolean z, char[] cArr, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i2];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
            int i5 = $10 + 81;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i7 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 23704 - KeyEvent.normalizeMetaState(0), View.resolveSizeAndState(0, 0, 0) + 32, -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (44862 - ExpandableListView.getPackedPositionType(0L)), 18943 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 27, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i8 = $10 + 41;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i3 > 0) {
            cleardownloadmanagerhelpers.write = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i2 - cleardownloadmanagerhelpers.write);
            int i10 = $10 + 51;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                int i11 = 3 % 3;
            }
        }
        if (z) {
            char[] cArr4 = new char[i2];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                try {
                    Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (44910 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getJumpTapTimeout() >> 16) + 18944, 29 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i12 = $10 + 27;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                int i13 = 2 % 4;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void a(byte b, int i, int i2, short s, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        int length;
        byte[] bArr;
        int i4;
        int i5 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(write)};
            int i6 = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) View.MeasureSpec.getSize(0), 24297 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 12, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            int i7 = iIntValue == -1 ? 1 : 0;
            long j2 = 0;
            if (i7 != 0) {
                int i8 = $10 + 123;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                byte[] bArr2 = IconCompatParcelizer;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i10 = 0;
                    while (i10 < length2) {
                        Object[] objArr3 = new Object[1];
                        objArr3[i6] = Integer.valueOf(bArr2[i10]);
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            char deadChar = (char) KeyEvent.getDeadChar(i6, i6);
                            int iBlue = Color.blue(i6) + 3082;
                            int i11 = 129 - (SystemClock.elapsedRealtime() > j2 ? 1 : (SystemClock.elapsedRealtime() == j2 ? 0 : -1));
                            byte b2 = (byte) ($$f - 2);
                            byte b3 = b2;
                            objRemoteActionCompatParcelizer2 = startForeground.read(deadChar, iBlue, i11, 2145850993, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr3[i10] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i10++;
                        i6 = 0;
                        j2 = 0;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    int i12 = $11 + 109;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    byte[] bArr4 = IconCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(AudioAttributesCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) TextUtils.getOffsetAfter("", 0), Process.getGidForName("") + 24298, 12 - KeyEvent.getDeadChar(0, 0), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) write) ^ 7899112766888837815L)));
                    j = 7899112766888837815L;
                } else {
                    j = 7899112766888837815L;
                    iIntValue = (short) (((short) (((long) AudioAttributesImplApi26Parcelizer[i2 + ((int) (((long) AudioAttributesCompatParcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) write) ^ 7899112766888837815L)));
                }
            } else {
                j = 7899112766888837815L;
            }
            if (iIntValue > 0) {
                buildresumedownloadsintent.read = ((i2 + iIntValue) - 2) + ((int) (((long) AudioAttributesCompatParcelizer) ^ j)) + i7;
                Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i), Integer.valueOf(read), sb};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 34133), TextUtils.getOffsetAfter("", 0) + 13432, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 20, 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr5 = IconCompatParcelizer;
                if (bArr5 != null) {
                    int i14 = $10 + 41;
                    $11 = i14 % 128;
                    if (i14 % 2 == 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i4 = 1;
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i4 = 0;
                    }
                    while (i4 < length) {
                        bArr[i4] = (byte) (((long) bArr5[i4]) ^ 7899112766888837815L);
                        i4++;
                    }
                    bArr5 = bArr;
                }
                if (bArr5 != null) {
                    int i15 = $10 + 75;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    z = true;
                } else {
                    z = false;
                }
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    if (z) {
                        byte[] bArr6 = IconCompatParcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        short[] sArr = AudioAttributesImplApi26Parcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r3]) ^ 7899112766888837815L)) + s)) ^ b));
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x02e5  */
    @Override // kotlin.BottomAppBar, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r39) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3521
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setForceApplySystemWindowInsetTop.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.BottomAppBar, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 75;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a((byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 28), (-753200746) + (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(3) - 304252557, (short) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 86, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((byte) (TextUtils.getCapsMode("", 0, 0) + 3), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 753200859, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 304252452, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 4), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 139, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = AudioAttributesImplBaseParcelizer + 17;
            MediaBrowserCompatSearchResultReceiver = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i6 = MediaBrowserCompatSearchResultReceiver + 45;
                AudioAttributesImplBaseParcelizer = i6 % 128;
                int i7 = i6 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i8 = MediaBrowserCompatSearchResultReceiver + 85;
                AudioAttributesImplBaseParcelizer = i8 % 128;
                if (i8 % 2 != 0) {
                    int i9 = 3 / 4;
                }
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4534 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 6054 - (Process.myPid() >> 22), 42 - KeyEvent.keyCodeFromString(""), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 6029 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 23 - TextUtils.indexOf((CharSequence) "", '0'), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0145  */
    @Override // kotlin.BottomAppBar, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 564
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setForceApplySystemWindowInsetTop.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(37:0|2|(3:(2:9|(1:15)(1:14))(1:16)|(9:18|263|19|(1:21)|22|23|24|(1:26)|27)(1:31)|32)(1:7)|(27:285|34|35|(2:37|(3:39|(2:41|46)|45)(3:42|(2:44|46)|45))(1:46)|82|284|83|(1:85)|86|(3:88|(1:90)|91)(20:92|93|274|94|(1:96)|97|98|264|99|(1:101)|102|103|104|(1:106)|107|(1:109)|110|(1:112)|113|114)|115|(5:118|119|(13:289|121|(3:123|(4:126|(3:295|128|298)(4:294|129|130|297)|296|124)|293)|131|286|132|(1:134)|135|136|137|280|138|292)(1:291)|290|116)|288|173|(1:175)|176|(3:178|(1:180)|181)(13:183|261|184|185|(1:187)|188|276|189|190|(1:192)|193|(1:195)|196)|182|197|(6:199|200|(1:202)|203|204|205)|206|(1:208)|209|(3:211|(1:213)|214)(14:216|217|(1:219)|220|221|(1:223)|224|266|225|226|(1:228)|229|(1:231)|232)|215|233|(7:235|236|(1:238)|239|240|241|242)(1:299))|50|282|51|(1:53)|54|272|55|(1:57)|58|82|284|83|(0)|86|(0)(0)|115|(1:116)|288|173|(0)|176|(0)(0)|182|197|(0)|206|(0)|209|(0)(0)|215|233|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0e7d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0e7e, code lost:
    
        r3 = new java.lang.Object[1];
        a((byte) (((android.content.Context) java.lang.Class.forName(r26).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 87), ((android.content.Context) java.lang.Class.forName(r26).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 753200826, (-304252265) - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)), (short) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0)), ((android.content.Context) java.lang.Class.forName(r26).getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 110, r3);
        r2 = (java.lang.String) r3[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0ef8, code lost:
    
        r3 = new java.io.ByteArrayOutputStream();
        r6 = new java.io.PrintStream(r3);
        r0.printStackTrace(r6);
        r6.close();
        r1 = r3.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0f0f, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0f13, code lost:
    
        r3 = new java.util.ArrayList(2);
        r3.add(r1);
        r3.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0f22, code lost:
    
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0f26, code lost:
    
        if (r1 == null) goto L169;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0f28, code lost:
    
        r1 = kotlin.startForeground.read((char) (4535 - (android.view.ViewConfiguration.getKeyRepeatTimeout() >> 16)), (android.media.AudioTrack.getMinVolume() > com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 1 : (android.media.AudioTrack.getMinVolume() == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6054, 42 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0f4e, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0f5a, code lost:
    
        r8 = new java.lang.Object[]{1167387956, 81604378625L, r3, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r2 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) ('0' - android.text.AndroidCharacter.getMirror('0')), 6030 - android.graphics.Color.blue(0), 23 - ((byte) android.view.KeyEvent.getModifierMetaStateMask()));
        r3 = kotlin.setForceApplySystemWindowInsetTop.$$g;
        r11 = new java.lang.Object[1];
        d(r3[89], r3[11], r3[53], r11);
        r2.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0d33  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0fe2  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x1029  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x107b  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x144d  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x152c  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x1572  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x15c8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x1921  */
    /* JADX WARN: Removed duplicated region for block: B:299:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0821 A[Catch: all -> 0x0e7d, TryCatch #12 {all -> 0x0e7d, blocks: (B:83:0x081b, B:85:0x0821, B:86:0x085d, B:88:0x0869, B:90:0x0872, B:91:0x08b2, B:115:0x0d29, B:116:0x0d2d, B:119:0x0d3d, B:121:0x0d53, B:124:0x0d60, B:128:0x0d6f, B:129:0x0d77, B:136:0x0dd5, B:142:0x0e57, B:144:0x0e5d, B:145:0x0e5e, B:147:0x0e60, B:149:0x0e67, B:150:0x0e68, B:92:0x08bc, B:104:0x0af3, B:106:0x0af9, B:107:0x0b39, B:109:0x0c83, B:110:0x0cc8, B:112:0x0cdd, B:113:0x0d19, B:152:0x0e6a, B:154:0x0e71, B:155:0x0e72, B:157:0x0e74, B:159:0x0e7b, B:160:0x0e7c, B:99:0x0a69, B:101:0x0a7d, B:102:0x0ae8, B:94:0x0a1b, B:96:0x0a2f, B:97:0x0a62, B:138:0x0dda, B:132:0x0da6, B:134:0x0dac, B:135:0x0dce), top: B:284:0x081b, outer: #1, inners: #2, #7, #10, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0869 A[Catch: all -> 0x0e7d, TryCatch #12 {all -> 0x0e7d, blocks: (B:83:0x081b, B:85:0x0821, B:86:0x085d, B:88:0x0869, B:90:0x0872, B:91:0x08b2, B:115:0x0d29, B:116:0x0d2d, B:119:0x0d3d, B:121:0x0d53, B:124:0x0d60, B:128:0x0d6f, B:129:0x0d77, B:136:0x0dd5, B:142:0x0e57, B:144:0x0e5d, B:145:0x0e5e, B:147:0x0e60, B:149:0x0e67, B:150:0x0e68, B:92:0x08bc, B:104:0x0af3, B:106:0x0af9, B:107:0x0b39, B:109:0x0c83, B:110:0x0cc8, B:112:0x0cdd, B:113:0x0d19, B:152:0x0e6a, B:154:0x0e71, B:155:0x0e72, B:157:0x0e74, B:159:0x0e7b, B:160:0x0e7c, B:99:0x0a69, B:101:0x0a7d, B:102:0x0ae8, B:94:0x0a1b, B:96:0x0a2f, B:97:0x0a62, B:138:0x0dda, B:132:0x0da6, B:134:0x0dac, B:135:0x0dce), top: B:284:0x081b, outer: #1, inners: #2, #7, #10, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x08bc A[Catch: all -> 0x0e7d, TRY_LEAVE, TryCatch #12 {all -> 0x0e7d, blocks: (B:83:0x081b, B:85:0x0821, B:86:0x085d, B:88:0x0869, B:90:0x0872, B:91:0x08b2, B:115:0x0d29, B:116:0x0d2d, B:119:0x0d3d, B:121:0x0d53, B:124:0x0d60, B:128:0x0d6f, B:129:0x0d77, B:136:0x0dd5, B:142:0x0e57, B:144:0x0e5d, B:145:0x0e5e, B:147:0x0e60, B:149:0x0e67, B:150:0x0e68, B:92:0x08bc, B:104:0x0af3, B:106:0x0af9, B:107:0x0b39, B:109:0x0c83, B:110:0x0cc8, B:112:0x0cdd, B:113:0x0d19, B:152:0x0e6a, B:154:0x0e71, B:155:0x0e72, B:157:0x0e74, B:159:0x0e7b, B:160:0x0e7c, B:99:0x0a69, B:101:0x0a7d, B:102:0x0ae8, B:94:0x0a1b, B:96:0x0a2f, B:97:0x0a62, B:138:0x0dda, B:132:0x0da6, B:134:0x0dac, B:135:0x0dce), top: B:284:0x081b, outer: #1, inners: #2, #7, #10, #14 }] */
    @Override // kotlin.BottomAppBar, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 7025
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setForceApplySystemWindowInsetTop.attachBaseContext(android.content.Context):void");
    }

    static {
        AudioAttributesImplApi21Parcelizer = 0;
        AudioAttributesImplApi26Parcelizer();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatItemReceiver + 107;
        AudioAttributesImplApi21Parcelizer = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.BottomAppBar, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 53;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void AudioAttributesImplApi26Parcelizer() {
        AudioAttributesCompatParcelizer = -586480488;
        write = -819363112;
        read = -473076612;
        IconCompatParcelizer = new byte[]{-40, -42, -38, 44, 37, -6, -6, 99, -36, -103, 18, 35, 34, 37, -42, 46, -43, -98, 113, -71, 105, 81, -82, -95, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 70, -119, 87, 89, -95, 95, -89, 67, 112, 65, -20, 82, 93, 97, -104, -87, -88, -81, 92, -92, 95, TarConstants.LF_GNUTYPE_LONGLINK, -78, 65, -89, 74, 78, 73, 72, -76, -101, 121, -78, -67, 71, -76, 73, -90, 119, -67, 67, -95, -115, -116, 93, 112, 114, -120, 123, 114, -120, -113, 122, -65, 64, -72, 113, 115, 113, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -116, 123, -114, 114, -65, 64, -94, 93, 119, 115, -115, -120, -115, 122, -116, 115, -68, 90, 118, -113, 113, -114, -85, -113, 119, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -95, 64, 114, -67, -115, 94, 113, -116, -116, -91, 89, 116, -66, 115, 64, -31, TarConstants.LF_BLK, -47, 42, -30, 31, -49, -28, TarConstants.LF_NORMAL, -53, TarConstants.LF_NORMAL, -40, 28, 31, TarConstants.LF_LINK, -56, -19, 23, -30, 31, -29, -26, 38, -49, TarConstants.LF_CHR, -49, -22, 29, -31, 30, 29, 30, TarConstants.LF_BLK, -48, 30, 62, -57, TarConstants.LF_CONTIG, -52, 16, 19, -15, -49, 59, -61, 8, -5, -35, 35, -63, 116, -120, 127, 85, -86, 116, -115, 125, -122, 90, 89, -57, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 61, -74, -121, -122, -127, 114, -118, 113, -127, -122, 124, -128, 122, -122, 126, -128, 124, -123, -73, -73, -73, -73, -73, -73, -73, -73, -73};
        MediaBrowserCompatCustomActionResultReceiver = 1000326307;
    }
}
