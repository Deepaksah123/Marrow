package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.TextUtils;
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

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/zat;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lo/parseEventObject;", "RemoteActionCompatParcelizer", "Lo/parseEventObject;", "IconCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zat extends zas {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int AudioAttributesImplApi21Parcelizer;
    private static char[] AudioAttributesImplApi26Parcelizer;
    private static boolean AudioAttributesImplBaseParcelizer;
    private static char IconCompatParcelizer;
    private static char MediaBrowserCompatCustomActionResultReceiver;
    private static boolean MediaBrowserCompatItemReceiver;
    private static int MediaDescriptionCompat;
    private static char read;
    private static char write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private parseEventObject IconCompatParcelizer;
    private static final byte[] $$c = {69, 85, TarConstants.LF_DIR, TarConstants.LF_LINK};
    private static final int $$f = 95;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {91, -118, -51, -87, 10, -4, -65, TarConstants.LF_FIFO, -7, 16, -1, -17, 11, 4, -13, -3, -64, 58, -11, 0, 6, 6, -6, -3, -66, TarConstants.LF_BLK, -5, 17, -21, -1, 5, 3, -12, -56, 58, -8, 5, -60, 1, -8, 26, -8, 5, -28, 1, 31, 29, -13, 1, -74, 44, 13, 20, -37, 35, -11, -13, -25, 17, 10, -10, TarConstants.LF_SYMLINK, -19, 3, 4, -48, TarConstants.LF_LINK, -2, -4, -11, -9, 17, -3, -17, 12, -50, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, 17, 6, 0, 3, -17, -38, 32, 15, -13, 4, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, -67, TarConstants.LF_CONTIG, -4, 13, -50, 35, -7, -20, 17, -37, TarConstants.LF_LINK, -17, -2, -3, 11, -80, 81, -7, -11, 9, -17};
    private static final int $$k = 186;
    private static final byte[] $$d = {47, 110, -5, -26, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = TarConstants.PREFIXLEN;
    private static int MediaBrowserCompatSearchResultReceiver = 0;
    private static int RatingCompat = 1;
    private static int MediaBrowserCompatMediaItem = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r6, byte r7, short r8) {
        /*
            byte[] r0 = kotlin.zat.$$c
            int r6 = r6 + 4
            int r8 = r8 * 4
            int r8 = 1 - r8
            int r7 = r7 * 3
            int r7 = 122 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r4 = r0[r6]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2a:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zat.$$i(short, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = 191 - r7
            int r5 = r5 + 65
            int r0 = r6 + 4
            byte[] r1 = kotlin.zat.$$d
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = -1
            if (r1 != 0) goto L13
            r4 = r5
            r5 = r6
            r3 = r2
            goto L26
        L13:
            r3 = r2
        L14:
            int r3 = r3 + 1
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L24:
            r4 = r1[r7]
        L26:
            int r5 = r5 + r4
            int r5 = r5 + r2
            int r7 = r7 + 1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zat.g(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = 111 - r7
            byte[] r0 = kotlin.zat.$$j
            int r6 = r6 * 3
            int r6 = 118 - r6
            int r8 = r8 * 3
            int r1 = r8 + 22
            byte[] r1 = new byte[r1]
            int r8 = r8 + 21
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2d:
            int r3 = r3 + r6
            int r6 = r3 + 2
            int r7 = r7 + 1
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zat.h(int, byte, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.zat$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/zat$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent RemoteActionCompatParcelizer(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new Intent(p0, (Class<?>) zat.class);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        int i3 = $11 + 5;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (isstopped.read < cArr.length) {
            int i5 = $11 + 73;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cArr3[0] = cArr[isstopped.read];
            cArr3[1] = cArr[isstopped.read + 1];
            int i7 = 58224;
            for (int i8 = 0; i8 < 16; i8++) {
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i7) ^ ((c2 << 4) + ((char) (((long) IconCompatParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1503, TextUtils.lastIndexOf("", '0', 0) + 22, 1322448859, false, $$i(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) read) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(write)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1503, 21 - ExpandableListView.getPackedPositionType(0L), 1322448859, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[isstopped.read] = cArr3[0];
            cArr2[isstopped.read + 1] = cArr3[1];
            Object[] objArr4 = {isstopped, isstopped};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (KeyEvent.getMaxKeyCode() >> 16), 9016 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 58 - (ViewConfiguration.getLongPressTimeout() >> 16), -1950993821, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void f(byte[] bArr, int i, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int length;
        char[] cArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr3 = AudioAttributesImplApi26Parcelizer;
        float f = BitmapDescriptorFactory.HUE_RED;
        if (cArr3 != null) {
            int i4 = $11 + 109;
            $10 = i4 % 128;
            if (i4 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
            }
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 87;
                $11 = i6 % 128;
                if (i6 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (44862 - View.getDefaultSize(0, 0)), 18944 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), 28 - (AudioTrack.getMinVolume() > f ? 1 : (AudioTrack.getMinVolume() == f ? 0 : -1)), -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                        }
                        cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i5])};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (44863 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) + 18944, TextUtils.lastIndexOf("", '0', 0, 0) + 29, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i5++;
                }
                i2 = 2;
                f = BitmapDescriptorFactory.HUE_RED;
            }
            cArr3 = cArr2;
        }
        Object[] objArr4 = {Integer.valueOf(AudioAttributesImplApi21Parcelizer)};
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer3 == null) {
            objRemoteActionCompatParcelizer3 = startForeground.read((char) ((-16777216) - Color.rgb(0, 0, 0)), 19033 - (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 75, 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
        if (AudioAttributesImplBaseParcelizer) {
            int i7 = $11 + 125;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr3[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr5 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 11439 - TextUtils.getCapsMode("", 0, 0), 14 - KeyEvent.normalizeMetaState(0), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!MediaBrowserCompatItemReceiver) {
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr3[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                notifydownloads.IconCompatParcelizer++;
            }
            String str = new String(cArr5);
            int i9 = $11 + 17;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                throw null;
            }
            objArr[0] = str;
            return;
        }
        notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            int i10 = $11 + 17;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr3[cArr[notifydownloads.AudioAttributesCompatParcelizer % notifydownloads.IconCompatParcelizer] * i] + iIntValue);
                Object[] objArr6 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) TextUtils.getTrimmedLength(""), ExpandableListView.getPackedPositionType(0L) + 11439, 14 - KeyEvent.getDeadChar(0, 0), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            } else {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr3[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                try {
                    Object[] objArr7 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        objRemoteActionCompatParcelizer6 = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 11439, 15 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00a3  */
    @Override // kotlin.zas, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2256
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zat.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.zas, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = RatingCompat + 69;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = RatingCompat + 91;
            MediaBrowserCompatSearchResultReceiver = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            f(new byte[]{-125, -127, -112, -124, -113, -114, -115, -117, -122, -116, -122, -117, -118, -119, -121, -120, -120, -127, -121, -125, -122, -123, -124, -125, -126, -127}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 123, null, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(new byte[]{-126, -123, -122, -117, -127, -118, -122, -110, -120, -120, -119, -117, -126, -112, -124, -124, -111, -118}, TextUtils.indexOf("", "", 0, 0) + 127, null, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0) + 4536), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 6053, (KeyEvent.getMaxKeyCode() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.alpha(0), Gravity.getAbsoluteGravity(0, 0) + 6030, 24 - TextUtils.indexOf("", ""), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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

    @Override // kotlin.zas, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = MediaBrowserCompatSearchResultReceiver + 7;
            RatingCompat = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            f(new byte[]{-125, -127, -112, -124, -113, -114, -115, -117, -122, -116, -122, -117, -118, -119, -121, -120, -120, -127, -121, -125, -122, -123, -124, -125, -126, -127}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, null, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(new byte[]{-126, -123, -122, -117, -127, -118, -122, -110, -120, -120, -119, -117, -126, -112, -124, -124, -111, -118}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 123, null, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4536 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 6055 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 42 - Color.alpha(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 6030 - ExpandableListView.getPackedPositionGroup(0L), 24 - TextUtils.getTrimmedLength(""), -861814097, false, "read", new Class[]{Context.class});
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
        int i4 = MediaBrowserCompatSearchResultReceiver + 23;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00b4  */
    @Override // kotlin.zas, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5340
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zat.attachBaseContext(android.content.Context):void");
    }

    static {
        MediaDescriptionCompat = 0;
        AudioAttributesImplApi26Parcelizer();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatMediaItem + 41;
        MediaDescriptionCompat = i % 128;
        int i2 = i % 2;
    }

    @Override // kotlin.zas, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 45;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onStart();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = RatingCompat + 37;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void AudioAttributesImplApi26Parcelizer() {
        read = (char) 41334;
        write = (char) 15504;
        IconCompatParcelizer = (char) 2605;
        MediaBrowserCompatCustomActionResultReceiver = (char) 52571;
        AudioAttributesImplApi26Parcelizer = new char[]{28425, 28442, 28420, 28438, 28443, 28417, 28506, 28440, 28521, 28423, 28436, 28434, 28433, 28532, 28416, 28421, 28437, 28444, 28501, 28504, 28418, 28422, 28500, 28498, 28503, 28497, 28496, 28505, 28502, 28499, 28439, 28526, 28507, 28419, 28441, 28445, 28446, 28535};
        AudioAttributesImplApi21Parcelizer = 411398056;
        MediaBrowserCompatItemReceiver = true;
        AudioAttributesImplBaseParcelizer = true;
    }
}
