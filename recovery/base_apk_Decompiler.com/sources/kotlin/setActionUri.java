package kotlin;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setActionUri;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setActionUri extends setDisplayInterval {
    private static boolean AudioAttributesCompatParcelizer;
    private static boolean AudioAttributesImplApi26Parcelizer;
    private static long IconCompatParcelizer;
    private static int MediaBrowserCompatCustomActionResultReceiver;
    private static int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] write;
    private static final byte[] $$l = {TarConstants.LF_GNUTYPE_LONGNAME, 36, -23, -15};
    private static final int $$m = 157;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {14, -10, 42, -103, -67, TarConstants.LF_CONTIG, -4, 13, -50, 35, -7, -20, 17, -37, TarConstants.LF_LINK, -17, -2, -3, 11, -80, 81, -7, -11, 9, -17, TarConstants.LF_SYMLINK, -19, 3, 4, -48, TarConstants.LF_LINK, -2, -4, -11, -9, 17, -3, -17, 12, -50, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, 17, 6, 0, 3, -17, -38, 32, 15, -13, 4, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, -67, 67, -16, 13, -45, 34, -14, 4, -4, -19, 19, 9, -10, -9};
    private static final int $$k = 156;
    private static final byte[] $$d = {11, 40, -34, 98, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = TsExtractor.TS_STREAM_TYPE_DTS;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;
    private static int AudioAttributesImplApi21Parcelizer = 1;

    private static String $$n(int i, int i2, int i3) {
        int i4 = 4 - (i2 * 3);
        byte[] bArr = $$l;
        int i5 = (i * 2) + 119;
        int i6 = i3 * 3;
        byte[] bArr2 = new byte[1 - i6];
        int i7 = 0 - i6;
        int i8 = -1;
        if (bArr == null) {
            i5 += -i7;
            i4++;
        }
        while (true) {
            i8++;
            bArr2[i8] = (byte) i5;
            if (i8 == i7) {
                return new String(bArr2, 0);
            }
            i5 += -bArr[i4];
            i4++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.setActionUri.$$d
            int r7 = 114 - r7
            int r5 = 190 - r5
            int r1 = 44 - r6
            byte[] r1 = new byte[r1]
            int r6 = 43 - r6
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            int r5 = r5 + 1
            r3 = r0[r5]
        L26:
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setActionUri.g(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r0 = r5 + 15
            int r6 = r6 + 65
            byte[] r1 = kotlin.setActionUri.$$j
            byte[] r0 = new byte[r0]
            int r5 = r5 + 14
            r2 = 0
            if (r1 != 0) goto L15
            r6 = r5
            r4 = r7
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
        L27:
            int r7 = r7 + 1
            int r6 = r6 + r4
            int r6 = r6 + 2
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setActionUri.h(byte, short, int, java.lang.Object[]):void");
    }

    public setActionUri() {
        super((byte) 0);
    }

    /* JADX INFO: renamed from: o.setActionUri$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/setActionUri$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/setExpandedTitleTypeface;", "p1", "Landroid/content/Intent;", "read", "(Landroid/content/Context;Lo/setExpandedTitleTypeface;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent read(Context p0, setExpandedTitleTypeface p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) setActionUri.class);
            p1.AudioAttributesCompatParcelizer(intent);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = $11 + 73;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    char bitsPerPixel = (char) (38460 - ImageFormat.getBitsPerPixel(0));
                    int iResolveSizeAndState = 532 - View.resolveSizeAndState(0, 0, 0);
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 8;
                    byte b = (byte) ($$m & 3);
                    byte b2 = (byte) (b - 1);
                    objRemoteActionCompatParcelizer = startForeground.read(bitsPerPixel, iResolveSizeAndState, maxKeyCode, -735610793, false, $$n(b, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (IconCompatParcelizer ^ 2192498202983240651L);
                try {
                    Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 36621), (-16774876) - Color.rgb(0, 0, 0), 28 - (ViewConfiguration.getTouchSlop() >> 8), 188119637, false, $$n(b3, b4, b4), new Class[]{Object.class, Object.class});
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
        int i6 = $10 + 65;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 2 / 3;
        }
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i8 = $11 + 121;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer3 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 36621), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2339, TextUtils.lastIndexOf("", '0') + 29, 188119637, false, $$n(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static void f(byte[] bArr, int i, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = write;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + 119;
                $10 = i6 % 128;
                int i7 = i6 % i3;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 44861), TextUtils.indexOf((CharSequence) "", '0') + 18945, 27 - TextUtils.lastIndexOf("", '0', 0), -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i5++;
                    i3 = 2;
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
        Object[] objArr3 = {Integer.valueOf(RemoteActionCompatParcelizer)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) Drawable.resolveOpacity(0, 0), 19033 - KeyEvent.getDeadChar(0, 0), 75 - TextUtils.indexOf("", ""), 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        long j = 0;
        if (AudioAttributesImplApi26Parcelizer) {
            int i8 = $10 + 109;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr4 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 11439, TextUtils.indexOf("", "", 0, 0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                j = 0;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!AudioAttributesCompatParcelizer) {
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                int i10 = $11 + 41;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] / i] >>> iIntValue);
                    i2 = notifydownloads.IconCompatParcelizer << 1;
                } else {
                    cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                    i2 = notifydownloads.IconCompatParcelizer + 1;
                }
                notifydownloads.IconCompatParcelizer = i2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
            Object[] objArr5 = {notifydownloads, notifydownloads};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) ((-1) - Process.getGidForName("")), 11439 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 13 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -558368911, false, "q", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        String str = new String(cArr6);
        int i11 = $10 + 53;
        $11 = i11 % 128;
        if (i11 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00a3  */
    @Override // kotlin.setDisplayInterval, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2213
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setActionUri.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00b6  */
    @Override // kotlin.setDisplayInterval, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 481
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setActionUri.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c8  */
    @Override // kotlin.setDisplayInterval, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setActionUri.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x08bb A[Catch: all -> 0x096f, TryCatch #9 {all -> 0x096f, blocks: (B:136:0x08a7, B:138:0x08bb, B:139:0x08e4), top: B:270:0x08a7, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x08f7 A[Catch: all -> 0x0965, TryCatch #5 {all -> 0x0965, blocks: (B:140:0x08ea, B:142:0x08f7, B:143:0x095d), top: B:263:0x08ea, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0a8c  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0ad8  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0b27  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0d69  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0e49  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0e89  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0ee3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x1168  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x088d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:287:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x066f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x06ad A[Catch: all -> 0x0764, TryCatch #4 {all -> 0x0764, blocks: (B:78:0x06a7, B:80:0x06ad, B:81:0x06db), top: B:261:0x06a7, outer: #7 }] */
    @Override // kotlin.setDisplayInterval, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5159
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setActionUri.attachBaseContext(android.content.Context):void");
    }

    static {
        MediaBrowserCompatCustomActionResultReceiver = 0;
        AudioAttributesImplBaseParcelizer();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplApi21Parcelizer + 11;
        MediaBrowserCompatCustomActionResultReceiver = i % 128;
        int i2 = i % 2;
    }

    @Override // kotlin.setDisplayInterval, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 63;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = AudioAttributesImplBaseParcelizer + 75;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    static void AudioAttributesImplBaseParcelizer() {
        IconCompatParcelizer = 3028603144124163059L;
        write = new char[]{28231, 28251, 28351, 28235, 28238, 28337, 28255, 28224, 28239, 28228, 28254, 28307, 28226, 28230, 28339, 28229, 28319, 28290, 28236, 28336, 28318, 28316, 28289, 28315, 28314, 28291, 28288, 28317, 28234, 28225, 28312, 28293, 28292, 28237, 28227, 28252, 28232, 28321, 28330, 28305, 28233};
        RemoteActionCompatParcelizer = 411397842;
        AudioAttributesCompatParcelizer = true;
        AudioAttributesImplApi26Parcelizer = true;
    }
}
