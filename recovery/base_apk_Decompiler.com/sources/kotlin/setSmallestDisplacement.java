package kotlin;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.fragment.app.Fragment;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003"}, d2 = {"Lo/setSmallestDisplacement;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setSmallestDisplacement extends setExpirationTime {
    private static char AudioAttributesCompatParcelizer;
    private static long AudioAttributesImplApi21Parcelizer;
    private static int AudioAttributesImplBaseParcelizer;
    private static char IconCompatParcelizer;
    private static int MediaBrowserCompatCustomActionResultReceiver;
    private static char MediaBrowserCompatItemReceiver;
    private static char RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char write;
    private static final byte[] $$c = {66, 100, 74, -7};
    private static final int $$f = 69;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {34, TarConstants.LF_NORMAL, 18, 42, -54, 68, 9, 26, -35, TarConstants.LF_BLK, 10, 17, -22, 33, 28, -10, -5, 36, 6, 22, -69, 57, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -8, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -54, 68, 9, 26, -40, 46, 17, 22, 9, 12, -4, 10, -4, 38, 14, 12, 9, -2, 7, 23, -28, TarConstants.LF_BLK, 14, 6, -1, 30};
    private static final int $$k = 38;
    private static final byte[] $$d = {TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, TarConstants.LF_GNUTYPE_LONGNAME, 9, 62, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 59;
    private static int MediaMetadataCompat = 0;
    private static int RatingCompat = 1;
    private static int AudioAttributesImplApi26Parcelizer = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(int r7, int r8, short r9) {
        /*
            int r7 = r7 * 19
            int r7 = 122 - r7
            int r9 = r9 * 2
            int r9 = 1 - r9
            int r8 = r8 + 4
            byte[] r0 = kotlin.setSmallestDisplacement.$$c
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2a
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2a:
            int r7 = r7 + r8
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setSmallestDisplacement.$$i(int, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r0 = r7 + 4
            byte[] r1 = kotlin.setSmallestDisplacement.$$d
            int r6 = r6 + 65
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = -1
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2c
        L12:
            r3 = r2
        L13:
            int r3 = r3 + 1
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r0, r7)
            r9[r7] = r6
            return
        L25:
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-1)
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setSmallestDisplacement.g(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 27
            int r9 = r9 + 4
            byte[] r0 = kotlin.setSmallestDisplacement.$$j
            int r7 = r7 * 29
            int r7 = r7 + 82
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r9
            r4 = r2
            goto L27
        L12:
            r3 = r2
        L13:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r7 = r7 + r9
            int r7 = r7 + (-11)
            int r9 = r3 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setSmallestDisplacement.h(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.setSmallestDisplacement$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/setSmallestDisplacement$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "Landroid/content/Intent;", "write", "(Landroid/content/Context;I)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent write(Context p0, int p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Intent intentPutExtra = new Intent(p0, (Class<?>) setSmallestDisplacement.class).putExtra(LoggedUserResponse.KEY_KYC_STATUS, p1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(intentPutExtra, "");
            return intentPutExtra;
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
        while (isstopped.read < cArr.length) {
            int i3 = $10 + 45;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            cArr3[0] = cArr[isstopped.read];
            cArr3[1] = cArr[isstopped.read + 1];
            int i5 = 58224;
            for (int i6 = 0; i6 < 16; i6++) {
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i5) ^ ((c2 << 4) + ((char) (((long) RemoteActionCompatParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(AudioAttributesCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b - 1);
                        objRemoteActionCompatParcelizer = startForeground.read((char) View.resolveSize(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 1504, 21 - Color.red(0), 1322448859, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) IconCompatParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(write)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1503, 21 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1322448859, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
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
                objRemoteActionCompatParcelizer3 = startForeground.read((char) Color.red(0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 9016, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 58, -1950993821, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            int i7 = $11 + 43;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 % 2;
            }
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void f(char c, int i, char[] cArr, char[] cArr2, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr2.length;
        char[] cArr4 = new char[length];
        int length2 = cArr3.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr2, 0, cArr4, 0, length);
        System.arraycopy(cArr3, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i3 = $10 + 45;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ('0' - AndroidCharacter.getMirror('0')), TextUtils.indexOf((CharSequence) "", '0') + 22749, 36 - Color.blue(0), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char cIndexOf = (char) (31368 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 2722;
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 38;
                    byte b = (byte) ($$f & 3);
                    byte b2 = (byte) (-b);
                    objRemoteActionCompatParcelizer2 = startForeground.read(cIndexOf, iIndexOf, iMakeMeasureSpec, 1895162189, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) KeyEvent.keyCodeFromString(""), 15714 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (Process.myPid() >> 22) + 64, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (40976 - Color.alpha(0)), View.getDefaultSize(0, 0) + 6122, 30 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (AudioAttributesImplApi21Parcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) AudioAttributesImplBaseParcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) MediaBrowserCompatItemReceiver) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                int i5 = $11 + 13;
                $10 = i5 % 128;
                int i6 = i5 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0129  */
    @Override // kotlin.setExpirationTime, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2898
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setSmallestDisplacement.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public final void onBackPressed() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 1;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        List<Fragment> listHandleMediaPlayPauseIfPendingOnHandler = getSupportFragmentManager().handleMediaPlayPauseIfPendingOnHandler();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(listHandleMediaPlayPauseIfPendingOnHandler, "");
        Fragment fragment = (Fragment) IntermediateLoginResponseBody.RatingCompat((List) listHandleMediaPlayPauseIfPendingOnHandler);
        if (fragment.getChildFragmentManager().onCustomAction() > 1) {
            fragment.getChildFragmentManager().onRemoveQueueItemAt();
            return;
        }
        super.onBackPressed();
        int i4 = RatingCompat + 31;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // kotlin.setExpirationTime, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 422
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setSmallestDisplacement.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // kotlin.setExpirationTime, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 436
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setSmallestDisplacement.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0905 A[Catch: all -> 0x0317, TryCatch #17 {all -> 0x0317, blocks: (B:158:0x08ff, B:160:0x0905, B:161:0x0930, B:235:0x0f99, B:237:0x0f9f, B:238:0x0fcb, B:277:0x1457, B:279:0x145d, B:280:0x1485, B:258:0x1242, B:260:0x1264, B:261:0x12b4, B:202:0x0b1a, B:204:0x0b20, B:205:0x0b4f, B:17:0x00b2, B:19:0x00b8, B:20:0x00e4, B:22:0x0287, B:24:0x02b8, B:25:0x0311), top: B:335:0x00b2 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x09f6 A[Catch: all -> 0x0aaa, TryCatch #9 {all -> 0x0aaa, blocks: (B:177:0x09e1, B:179:0x09f6, B:180:0x0a24), top: B:319:0x09e1, outer: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0a37 A[Catch: all -> 0x0aa0, TryCatch #1 {all -> 0x0aa0, blocks: (B:181:0x0a2a, B:183:0x0a37, B:184:0x0a98), top: B:304:0x0a2a, outer: #21 }] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0be4  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0c35  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0c8c  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0f76  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x1063  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x10ae  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x1160  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x1439  */
    /* JADX WARN: Removed duplicated region for block: B:342:0x09be A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:349:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0095 A[PHI: r8
      0x0095: PHI (r8v13 ??) = (r8v12 ??), (r8v57 ??) binds: [B:3:0x008e, B:5:0x0093] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v24, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v25 */
    /* JADX WARN: Type inference failed for: r5v36 */
    /* JADX WARN: Type inference failed for: r5v47 */
    /* JADX WARN: Type inference failed for: r5v51 */
    /* JADX WARN: Type inference failed for: r5v52 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v18, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r8v24 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r8v27, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r8v34 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v49 */
    /* JADX WARN: Type inference failed for: r8v56 */
    /* JADX WARN: Type inference failed for: r8v57 */
    /* JADX WARN: Type inference failed for: r8v58 */
    /* JADX WARN: Type inference failed for: r8v59 */
    /* JADX WARN: Type inference failed for: r8v60 */
    /* JADX WARN: Type inference failed for: r8v61 */
    /* JADX WARN: Type inference failed for: r8v62 */
    @Override // kotlin.setExpirationTime, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setSmallestDisplacement.attachBaseContext(android.content.Context):void");
    }

    static {
        MediaBrowserCompatCustomActionResultReceiver = 0;
        AudioAttributesImplApi21Parcelizer();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplApi26Parcelizer + 9;
        MediaBrowserCompatCustomActionResultReceiver = i % 128;
        int i2 = i % 2;
    }

    @Override // kotlin.setExpirationTime, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = RatingCompat + 93;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 92 / 0;
        }
        int i5 = RatingCompat + 25;
        MediaMetadataCompat = i5 % 128;
        int i6 = i5 % 2;
    }

    static void AudioAttributesImplApi21Parcelizer() {
        IconCompatParcelizer = (char) 53962;
        write = (char) 35367;
        RemoteActionCompatParcelizer = (char) 9802;
        AudioAttributesCompatParcelizer = (char) 60557;
        AudioAttributesImplApi21Parcelizer = -3498762522182953692L;
        AudioAttributesImplBaseParcelizer = -136981212;
        MediaBrowserCompatItemReceiver = (char) 5265;
    }
}
