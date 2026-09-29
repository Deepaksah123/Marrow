package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setThumbRadius;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setThumbRadius extends setThumbStrokeColorResource {
    private static char AudioAttributesCompatParcelizer;
    private static int[] IconCompatParcelizer;
    private static int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long read;
    private static int write;
    private static final byte[] $$c = {34, TarConstants.LF_NORMAL, 18, 42};
    private static final int $$f = TsExtractor.TS_STREAM_TYPE_HDMV_DTS;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {37, -1, TarConstants.LF_CONTIG, -26, -58, 64, 5, 22, -25, 27, 20, -1, -4, 19, -6, 15, 10, -16, 36, 1, -65, TarConstants.LF_DIR, 26, 15, 9, 12, -8, -29, 41, 24, -4, 13, 6, -36, TarConstants.LF_CHR, 5, 10, -8, 26, -29, 24, 24, -8, 9, 14, 4, 24, -14, 20, 26, 15, 9, 12, -8, -29, 41, 24, -4, 13, 6, -36, TarConstants.LF_CHR, 5, 10, -8, 26, -29, 24, 24, -8, 9, 14, 4, 24, -14, 20, -58, 44, 40, -12, 26, 8, 5, -39, 58, -14, 9, 18, 11, -4, 13, 6, -26, 27, 22, 7, -4, 20};
    private static final int $$h = 249;
    private static final byte[] $$a = {98, 126, 62, 90, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 186;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private static int MediaBrowserCompatItemReceiver = 0;

    private static String $$i(short s, int i, int i2) {
        int i3 = i * 4;
        byte[] bArr = $$c;
        int i4 = 103 - (s * 2);
        int i5 = (i2 * 4) + 4;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4 = i3 + (-i5);
            i5++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i4;
            if (i7 == i3) {
                return new String(bArr2, 0);
            }
            int i8 = i5;
            i4 += -bArr[i5];
            i5 = i8 + 1;
            i6 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = r7 + 65
            byte[] r0 = kotlin.setThumbRadius.$$a
            int r9 = 191 - r9
            int r8 = 44 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r9
            r4 = r2
            goto L26
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L20
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L20:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L26:
            int r9 = r9 + r7
            int r7 = r3 + 1
            int r9 = r9 + (-1)
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setThumbRadius.c(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 * 29
            int r5 = 111 - r5
            int r0 = 46 - r7
            int r6 = r6 + 4
            byte[] r1 = kotlin.setThumbRadius.$$g
            byte[] r0 = new byte[r0]
            int r7 = 45 - r7
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r5
            r5 = r7
            r4 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            r3 = r1[r6]
        L29:
            int r5 = r5 + r3
            int r5 = r5 + (-7)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setThumbRadius.d(int, short, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.setThumbRadius$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setThumbRadius$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent RemoteActionCompatParcelizer(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new Intent(p0, (Class<?>) setThumbRadius.class);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void b(char[] cArr, char c, char[] cArr2, char[] cArr3, int i, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        int i3 = $10 + 43;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 22748 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 36 - TextUtils.indexOf("", "", 0, 0), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {notifydownloadremoved};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31368), (Process.myPid() >> 22) + 2721, 38 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1895162189, false, $$i(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 15713 - (ViewConfiguration.getWindowTouchSlop() >> 8), (KeyEvent.getMaxKeyCode() >> 16) + 64, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) (40977 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 6122 - Color.alpha(0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 29, -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = notifydownloadremoved.write;
                            cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (read ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) write) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) AudioAttributesCompatParcelizer) ^ (-3498762522182953692L)))));
                            notifydownloadremoved.AudioAttributesCompatParcelizer++;
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
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i5 = $11 + 89;
        $10 = i5 % 128;
        if (i5 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i6 = 40 / 0;
            objArr[0] = str;
        }
    }

    private static void a(int i, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        int[] iArr2;
        int i2 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = IconCompatParcelizer;
        int i3 = -470782045;
        int i4 = 16;
        int i5 = 0;
        if (iArr3 != null) {
            int i6 = $10 + 51;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = iArr3.length;
                iArr2 = new int[length];
            } else {
                length = iArr3.length;
                iArr2 = new int[length];
            }
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 75;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i7])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(i3);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getScrollBarFadeDuration() >> i4) + 43695), 23297 - TextUtils.getCapsMode("", 0, 0), 15 - View.resolveSize(0, 0), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr2[i7] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i7++;
                    i3 = -470782045;
                    i4 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i10 = $10 + 115;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            iArr3 = iArr2;
        }
        int length2 = iArr3.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = IconCompatParcelizer;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i12 = 0;
            while (i12 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i5] = Integer.valueOf(iArr5[i12]);
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (Color.blue(i5) + 43695), 23296 - TextUtils.lastIndexOf("", '0', i5), (Process.myTid() >> 22) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                }
                iArr6[i12] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                i12++;
                i5 = 0;
            }
            iArr5 = iArr6;
        }
        int i13 = i5;
        System.arraycopy(iArr5, i13, iArr4, i13, length2);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i13;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            cArr[i13] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr4);
            int i14 = $10 + 111;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                int i15 = 4 / 2;
            }
            for (int i16 = 0; i16 < 16; i16++) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i16];
                Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (Color.blue(0) + 43695), 23297 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getTouchSlop() >> 8) + 15, -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
            }
            int i17 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i17;
            buildremovealldownloadsintent.read ^= iArr4[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[17];
            int i18 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i19 = buildremovealldownloadsintent.read;
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
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (48194 - (ViewConfiguration.getJumpTapTimeout() >> 16)), Color.green(0) + 20126, ImageFormat.getBitsPerPixel(0) + 21, 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            i13 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a1  */
    @Override // kotlin.setThumbStrokeColorResource, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2854
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setThumbRadius.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.setThumbStrokeColorResource, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(3) - 74, new int[]{-717805211, -1710017535, 1901891212, -1815466354, -252781590, -2051369639, -2026560142, 1385835568, 884189640, -83534878, 1313088552, -2061556967, -607842983, -535052921}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(new char[]{30455, 12748, 34361, 13259}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) + 52005), new char[]{46994, 26887, 49931, 33200}, new char[]{5756, 52999, 23955, 60441, 21613, 52417, 17478, 50506, 28261, 57824, 8997, 24103, 8243, 37847, 17758, 17876, 49209, 60157}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = AudioAttributesImplApi21Parcelizer + 51;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = AudioAttributesImplApi26Parcelizer + 33;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4536 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 6054 - (ViewConfiguration.getScrollBarSize() >> 8), 42 - (KeyEvent.getMaxKeyCode() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getTapTimeout() >> 16) + 6030, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    obj.hashCode();
                    throw null;
                }
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (Color.red(0) + 4535), 6054 - TextUtils.getOffsetAfter("", 0), 'Z' - AndroidCharacter.getMirror('0'), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), ExpandableListView.getPackedPositionChild(0L) + 6031, 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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
        int i5 = AudioAttributesImplApi21Parcelizer + 31;
        AudioAttributesImplApi26Parcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00df  */
    @Override // kotlin.setThumbStrokeColorResource, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setThumbRadius.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:146:0x09a5 A[Catch: all -> 0x0390, TryCatch #11 {all -> 0x0390, blocks: (B:144:0x099f, B:146:0x09a5, B:147:0x09d1, B:189:0x0c03, B:191:0x0c09, B:192:0x0c37, B:229:0x10cd, B:231:0x10d3, B:232:0x1101, B:265:0x1544, B:267:0x154a, B:268:0x1577, B:246:0x1304, B:248:0x1327, B:249:0x1378, B:17:0x0118, B:19:0x011e, B:20:0x0146, B:22:0x02fd, B:24:0x032f, B:25:0x038a, B:153:0x0a6f, B:155:0x0a75, B:159:0x0a81, B:175:0x0b5e, B:177:0x0b64, B:178:0x0b65, B:180:0x0b67, B:182:0x0b6e, B:183:0x0b6f, B:164:0x0a8c, B:166:0x0aa1, B:167:0x0ace, B:168:0x0ad4, B:170:0x0ae1, B:171:0x0b54), top: B:309:0x0118, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0a65  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0aa1 A[Catch: all -> 0x0b66, TryCatch #3 {all -> 0x0b66, blocks: (B:164:0x0a8c, B:166:0x0aa1, B:167:0x0ace), top: B:296:0x0a8c, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0ae1 A[Catch: all -> 0x0b5c, TryCatch #20 {all -> 0x0b5c, blocks: (B:168:0x0ad4, B:170:0x0ae1, B:171:0x0b54), top: B:326:0x0ad4, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0ccb  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0d1d  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0dd5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x10aa  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x1192  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x11e6  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x124d  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x1521  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0394 A[PHI: r11
      0x0394: PHI (r11v96 int) = (r11v14 int), (r11v97 int) binds: [B:15:0x0113, B:5:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:334:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0458 A[Catch: all -> 0x0956, TRY_ENTER, TRY_LEAVE, TryCatch #13 {all -> 0x0956, blocks: (B:31:0x039e, B:38:0x03f0, B:47:0x0458, B:66:0x060f, B:69:0x065b, B:72:0x0780), top: B:312:0x039e }] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00fb A[PHI: r11
      0x00fb: PHI (r11v14 int) = (r11v13 int), (r11v103 int) binds: [B:3:0x00ec, B:5:0x00f9] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x07f4 A[Catch: all -> 0x0939, TryCatch #15 {all -> 0x0939, blocks: (B:82:0x07ea, B:83:0x07ee, B:85:0x07f4, B:87:0x080b, B:81:0x07e4), top: B:316:0x07e4 }] */
    /* JADX WARN: Type inference failed for: r11v100 */
    /* JADX WARN: Type inference failed for: r11v101 */
    /* JADX WARN: Type inference failed for: r11v102 */
    /* JADX WARN: Type inference failed for: r11v45 */
    /* JADX WARN: Type inference failed for: r11v46 */
    /* JADX WARN: Type inference failed for: r11v47, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r11v52 */
    /* JADX WARN: Type inference failed for: r11v53 */
    /* JADX WARN: Type inference failed for: r11v54 */
    /* JADX WARN: Type inference failed for: r11v82 */
    /* JADX WARN: Type inference failed for: r11v83 */
    /* JADX WARN: Type inference failed for: r11v84 */
    /* JADX WARN: Type inference failed for: r11v85 */
    /* JADX WARN: Type inference failed for: r11v86 */
    /* JADX WARN: Type inference failed for: r11v87 */
    /* JADX WARN: Type inference failed for: r11v94 */
    /* JADX WARN: Type inference failed for: r11v95 */
    /* JADX WARN: Type inference failed for: r11v99 */
    /* JADX WARN: Type inference failed for: r3v178 */
    /* JADX WARN: Type inference failed for: r3v179 */
    /* JADX WARN: Type inference failed for: r3v180 */
    /* JADX WARN: Type inference failed for: r3v181 */
    /* JADX WARN: Type inference failed for: r3v182 */
    /* JADX WARN: Type inference failed for: r3v193 */
    /* JADX WARN: Type inference failed for: r3v4, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v19, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v29, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v30, types: [long] */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v55 */
    /* JADX WARN: Type inference failed for: r8v56, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v57 */
    /* JADX WARN: Type inference failed for: r8v58 */
    /* JADX WARN: Type inference failed for: r8v76 */
    /* JADX WARN: Type inference failed for: r8v77 */
    /* JADX WARN: Type inference failed for: r8v78 */
    /* JADX WARN: Type inference failed for: r8v79, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r8v80 */
    /* JADX WARN: Type inference failed for: r8v83 */
    /* JADX WARN: Type inference failed for: r8v92 */
    /* JADX WARN: Type inference failed for: r8v93 */
    /* JADX WARN: Type inference failed for: r8v94 */
    /* JADX WARN: Type inference failed for: r8v95 */
    /* JADX WARN: Type inference failed for: r8v96 */
    /* JADX WARN: Type inference failed for: r8v97 */
    /* JADX WARN: Type inference failed for: r8v98 */
    /* JADX WARN: Type inference failed for: r8v99 */
    @Override // kotlin.setThumbStrokeColorResource, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6494
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setThumbRadius.attachBaseContext(android.content.Context):void");
    }

    static {
        MediaBrowserCompatCustomActionResultReceiver = 1;
        MediaBrowserCompatCustomActionResultReceiver();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatItemReceiver + 61;
        MediaBrowserCompatCustomActionResultReceiver = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // kotlin.setThumbStrokeColorResource, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 21;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void MediaBrowserCompatCustomActionResultReceiver() {
        IconCompatParcelizer = new int[]{-971820815, 1977574244, -1742083291, 249133047, -188069394, -2007315525, 1526866917, 1255344506, 1258934959, -863075740, -1510571598, 617180017, -371302979, 1348735960, 1904492212, -725579452, 1409480822, 797819690};
        read = 5674857750187893430L;
        write = -136981212;
        AudioAttributesCompatParcelizer = (char) 54564;
    }
}
