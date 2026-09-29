package kotlin;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/icon;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lo/parseContentProtection;", "AudioAttributesCompatParcelizer", "Lo/parseContentProtection;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class icon extends alpha {
    private static byte[] AudioAttributesImplApi21Parcelizer;
    private static int AudioAttributesImplBaseParcelizer;
    private static int IconCompatParcelizer;
    private static int MediaBrowserCompatCustomActionResultReceiver;
    private static short[] MediaBrowserCompatItemReceiver;
    private static int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int write;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private parseContentProtection read;
    private static final byte[] $$l = {26, 47, -113, 59};
    private static final int $$m = 158;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {41, -117, 87, 37, -66, 22, 1, 4, 6, 33, -4, -13, -6, 1, 1, -18, 16, 18, -5, 0, -4, -14, -66, 82, -6, -10, 10, -16, 25, 11, -2, -44, 43, -3, 2, -16, 18, -37, 16, 16, -16, 1, 6, -4, 16, -22, 12, 18, 7, 1, 4, -16, -37, 33, 16, -12, 5, -2, -44, 43, -3, 2, -16, 18, -37, 16, 16, -16, 1, 6, -4, 16, -22, 12, 11, -3, -64, 56, 7, -1, -9, 4, -8, -56, TarConstants.LF_SYMLINK, 12, -11, 13, -4, -7, -6, -55, 62, -13, 18, -16, 12, -10, -9, 10, -63, 69, -20, 0, 16, -70, 37, 12, 0, -23, 20, 23, -11, 5, -2, -81, 77, -14, -5, 2};
    private static final int $$k = 175;
    private static final byte[] $$d = {112, -40, -93, -59, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 144;
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    private static int AudioAttributesImplApi26Parcelizer = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(int r6, byte r7, int r8) {
        /*
            int r6 = r6 * 3
            int r6 = 112 - r6
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r8 = r8 * 4
            int r0 = 1 - r8
            byte[] r1 = kotlin.icon.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L19
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2d
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2d:
            int r7 = -r7
            int r3 = r3 + 1
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.icon.$$n(int, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.icon.$$d
            int r7 = 190 - r7
            int r1 = 44 - r8
            int r6 = r6 + 65
            byte[] r1 = new byte[r1]
            int r8 = 43 - r8
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2b:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-1)
            r7 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.icon.g(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = 47 - r5
            int r7 = r7 + 4
            byte[] r1 = kotlin.icon.$$j
            int r6 = r6 + 73
            byte[] r0 = new byte[r0]
            int r5 = 46 - r5
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r6
            r3 = r2
            r6 = r5
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r5) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L21:
            int r3 = r3 + 1
            r4 = r1[r7]
        L25:
            int r6 = r6 + r4
            int r6 = r6 + 1
            int r7 = r7 + 1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.icon.h(int, int, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.icon$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/icon$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "read", "(Landroid/content/Context;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent read(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new Intent(p0, (Class<?>) icon.class);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void e(boolean z, int i, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i3];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i3) {
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i2 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i5 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(RemoteActionCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((Process.getThreadPriority(0) + 20) >> 6), 23703 - ((byte) KeyEvent.getModifierMetaStateMask()), TextUtils.getCapsMode("", 0, 0) + 32, -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (44861 - TextUtils.lastIndexOf("", '0', 0)), TextUtils.indexOf("", "", 0) + 18944, 28 - (ViewConfiguration.getLongPressTimeout() >> 16), -1836173544, false, "c", new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            int i6 = $11 + 81;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cleardownloadmanagerhelpers.write = i;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i3 - cleardownloadmanagerhelpers.write);
        }
        if (z) {
            char[] cArr4 = new char[i3];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i3) {
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i3 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ImageFormat.getBitsPerPixel(0) + 44863), 18944 - (Process.myTid() >> 22), (ViewConfiguration.getPressedStateDuration() >> 16) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i8 = $11 + 21;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    private static void f(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        long j;
        int i6 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(write)};
            int i7 = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), KeyEvent.keyCodeFromString("") + 24297, 12 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                i4 = 1;
            } else {
                int i8 = $10 + 47;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                i4 = 0;
            }
            if ((i4 ^ 1) == 0) {
                byte[] bArr = AudioAttributesImplApi21Parcelizer;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i10 = 0;
                    while (i10 < length) {
                        Object[] objArr3 = new Object[1];
                        objArr3[i7] = Integer.valueOf(bArr[i10]);
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b2 = (byte) i7;
                            byte b3 = b2;
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.green(i7), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 3082, 128 - TextUtils.getCapsMode("", i7, i7), 2145850993, false, $$n(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i10] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i10++;
                        i7 = 0;
                    }
                    int i11 = $11 + 23;
                    $10 = i11 % 128;
                    i5 = 2;
                    int i12 = i11 % 2;
                    bArr = bArr2;
                } else {
                    i5 = 2;
                }
                if (bArr != null) {
                    byte[] bArr3 = AudioAttributesImplApi21Parcelizer;
                    Object[] objArr4 = new Object[i5];
                    objArr4[1] = Integer.valueOf(IconCompatParcelizer);
                    objArr4[0] = Integer.valueOf(i);
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (1 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 24296, Color.argb(0, 0, 0, 0) + 12, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) write) ^ 7899112766888837815L)));
                    j = 7899112766888837815L;
                } else {
                    j = 7899112766888837815L;
                    iIntValue = (short) (((short) (((long) MediaBrowserCompatItemReceiver[i + ((int) (((long) IconCompatParcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) write) ^ 7899112766888837815L)));
                }
            } else {
                j = 7899112766888837815L;
            }
            if (iIntValue > 0) {
                buildresumedownloadsintent.read = ((i + iIntValue) - 2) + ((int) (((long) IconCompatParcelizer) ^ j)) + i4;
                Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i3), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver), sb};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (34134 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), KeyEvent.normalizeMetaState(0) + 13432, 20 - ExpandableListView.getPackedPositionChild(0L), 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr4 = AudioAttributesImplApi21Parcelizer;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        int i14 = $10 + 15;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        bArr5[i13] = (byte) (((long) bArr4[i13]) ^ 7899112766888837815L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    if (z) {
                        byte[] bArr6 = AudioAttributesImplApi21Parcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        short[] sArr = MediaBrowserCompatItemReceiver;
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

    /* JADX WARN: Removed duplicated region for block: B:6:0x0140  */
    @Override // kotlin.alpha, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3197
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.icon.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f7  */
    @Override // kotlin.alpha, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.icon.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00b2  */
    @Override // kotlin.alpha, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 480
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.icon.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0bd4  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0eb6  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0f03  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0fb6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x1356  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x143c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x148b  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x14e5  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x18b2  */
    /* JADX WARN: Removed duplicated region for block: B:306:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x04e9  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x051d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0532 A[Catch: all -> 0x05a3, TryCatch #2 {all -> 0x05a3, blocks: (B:53:0x0525, B:55:0x0532, B:56:0x059c), top: B:272:0x0525, outer: #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0667 A[Catch: all -> 0x04a3, TryCatch #1 {all -> 0x04a3, blocks: (B:208:0x1376, B:210:0x137c, B:211:0x13a6, B:244:0x18d2, B:246:0x18d8, B:247:0x1900, B:225:0x15ec, B:227:0x160e, B:228:0x1660, B:168:0x0ded, B:170:0x0df3, B:171:0x0e1d, B:79:0x0661, B:81:0x0667, B:82:0x0692, B:22:0x015a, B:24:0x0160, B:25:0x0188, B:27:0x0416, B:29:0x0447, B:30:0x049d), top: B:270:0x015a }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0724 A[Catch: all -> 0x0d19, TryCatch #13 {all -> 0x0d19, blocks: (B:86:0x071e, B:88:0x0724, B:89:0x0769, B:91:0x0775, B:93:0x077e, B:94:0x07c4, B:118:0x0bca, B:119:0x0bce, B:122:0x0bde, B:124:0x0bf4, B:127:0x0c01, B:130:0x0c0e, B:137:0x0c6f, B:143:0x0cf3, B:145:0x0cf9, B:146:0x0cfa, B:148:0x0cfc, B:150:0x0d03, B:151:0x0d04, B:95:0x07ce, B:107:0x097c, B:109:0x0982, B:110:0x09ca, B:112:0x0b1c, B:113:0x0b5e, B:115:0x0b74, B:116:0x0bba, B:153:0x0d06, B:155:0x0d0d, B:156:0x0d0e, B:158:0x0d10, B:160:0x0d17, B:161:0x0d18, B:102:0x08f1, B:104:0x0905, B:105:0x0971, B:97:0x08a2, B:99:0x08b6, B:100:0x08ea, B:139:0x0c74, B:133:0x0c37, B:135:0x0c3d, B:136:0x0c68), top: B:294:0x071e, outer: #0, inners: #3, #8, #11, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0775 A[Catch: all -> 0x0d19, TryCatch #13 {all -> 0x0d19, blocks: (B:86:0x071e, B:88:0x0724, B:89:0x0769, B:91:0x0775, B:93:0x077e, B:94:0x07c4, B:118:0x0bca, B:119:0x0bce, B:122:0x0bde, B:124:0x0bf4, B:127:0x0c01, B:130:0x0c0e, B:137:0x0c6f, B:143:0x0cf3, B:145:0x0cf9, B:146:0x0cfa, B:148:0x0cfc, B:150:0x0d03, B:151:0x0d04, B:95:0x07ce, B:107:0x097c, B:109:0x0982, B:110:0x09ca, B:112:0x0b1c, B:113:0x0b5e, B:115:0x0b74, B:116:0x0bba, B:153:0x0d06, B:155:0x0d0d, B:156:0x0d0e, B:158:0x0d10, B:160:0x0d17, B:161:0x0d18, B:102:0x08f1, B:104:0x0905, B:105:0x0971, B:97:0x08a2, B:99:0x08b6, B:100:0x08ea, B:139:0x0c74, B:133:0x0c37, B:135:0x0c3d, B:136:0x0c68), top: B:294:0x071e, outer: #0, inners: #3, #8, #11, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x07ce A[Catch: all -> 0x0d19, TRY_LEAVE, TryCatch #13 {all -> 0x0d19, blocks: (B:86:0x071e, B:88:0x0724, B:89:0x0769, B:91:0x0775, B:93:0x077e, B:94:0x07c4, B:118:0x0bca, B:119:0x0bce, B:122:0x0bde, B:124:0x0bf4, B:127:0x0c01, B:130:0x0c0e, B:137:0x0c6f, B:143:0x0cf3, B:145:0x0cf9, B:146:0x0cfa, B:148:0x0cfc, B:150:0x0d03, B:151:0x0d04, B:95:0x07ce, B:107:0x097c, B:109:0x0982, B:110:0x09ca, B:112:0x0b1c, B:113:0x0b5e, B:115:0x0b74, B:116:0x0bba, B:153:0x0d06, B:155:0x0d0d, B:156:0x0d0e, B:158:0x0d10, B:160:0x0d17, B:161:0x0d18, B:102:0x08f1, B:104:0x0905, B:105:0x0971, B:97:0x08a2, B:99:0x08b6, B:100:0x08ea, B:139:0x0c74, B:133:0x0c37, B:135:0x0c3d, B:136:0x0c68), top: B:294:0x071e, outer: #0, inners: #3, #8, #11, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0128  */
    /* JADX WARN: Type inference failed for: r7v34 */
    /* JADX WARN: Type inference failed for: r7v42 */
    /* JADX WARN: Type inference failed for: r7v43 */
    /* JADX WARN: Type inference failed for: r7v44 */
    /* JADX WARN: Type inference failed for: r7v45, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v46, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v78 */
    /* JADX WARN: Type inference failed for: r7v80 */
    /* JADX WARN: Type inference failed for: r7v81 */
    /* JADX WARN: Type inference failed for: r7v83 */
    /* JADX WARN: Type inference failed for: r7v84 */
    /* JADX WARN: Type inference failed for: r7v85 */
    /* JADX WARN: Type inference failed for: r7v86 */
    /* JADX WARN: Type inference failed for: r7v87 */
    /* JADX WARN: Type inference failed for: r7v88 */
    /* JADX WARN: Type inference failed for: r7v89 */
    @Override // kotlin.alpha, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 7057
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.icon.attachBaseContext(android.content.Context):void");
    }

    static {
        AudioAttributesImplBaseParcelizer = 1;
        MediaBrowserCompatCustomActionResultReceiver();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplApi26Parcelizer + 77;
        AudioAttributesImplBaseParcelizer = i % 128;
        if (i % 2 == 0) {
            throw null;
        }
    }

    @Override // kotlin.alpha, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = RatingCompat + 97;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        int i5 = MediaDescriptionCompat + 77;
        RatingCompat = i5 % 128;
        int i6 = i5 % 2;
    }

    static void MediaBrowserCompatCustomActionResultReceiver() {
        RemoteActionCompatParcelizer = 1000326203;
        IconCompatParcelizer = -958145295;
        write = -819363192;
        MediaBrowserCompatCustomActionResultReceiver = 194107794;
        AudioAttributesImplApi21Parcelizer = new byte[]{-28, -37, -125, -45, -43, -17, -42, -42, -28, 89, 116, -87, 14, 70, 91, -85, 68, 8, -81, 8, -112, 92, 91, 9, -96, 77, TarConstants.LF_GNUTYPE_SPARSE, 70, 91, 71, 66, 2, -85, 119, -85, 78, 93, 89, 90, 93, 90, 116, -88, 90, 8, 28, 13, 87, 58, 8, 31, 15, 6, 106, 107, -59, 12, 79, TarConstants.LF_FIFO, 5, 6, 3, 114, 26, 115, 5, 2, 8, 4, 14, 2, 10, 4, 8, 1, -73, -73, -73, -73, -73};
    }
}
