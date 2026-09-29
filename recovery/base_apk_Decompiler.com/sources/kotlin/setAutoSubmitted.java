package kotlin;

import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes4.dex */
public final class setAutoSubmitted implements MarrowTheme {
    private static final byte[] AudioAttributesCompatParcelizer = {66, 100, 74, -7, 7, -23, 19, TarConstants.LF_LINK, -64, 9, -15, 5, TarConstants.LF_CONTIG, -39, -35, 0, 7, -7, 5, 1, 2, 1, -13, 7, -23, 19, TarConstants.LF_LINK, -64, 9, -15, 5, TarConstants.LF_CONTIG, -29, -39, -8, 13, -4, 0, -15, 19, -13, -11, 14, 20, -25, -7, -8, 28, -13, -13, -11, 14, -15, 8, -16, 1, 4, 3, TarConstants.LF_BLK, -67, -6, 67, -22, -53, 10, -5, 6, 62, -52, 15, -15, -3, 8, -8, -1, 13, -9, -22, 20, -7, -8, -15, 8, -16, 1, 4, 3, TarConstants.LF_BLK, -67, -6, 67, -22, -53, 10, -5, 6, -4, 9, -3, -9, 7, -23, 19, TarConstants.LF_LINK, -64, 9, -15, 5, TarConstants.LF_CONTIG, -23, -39, 5, -19, 29, -20, -14, -6, 14, -11, 9, -4, 5, -11, 5, -15, 10, 7, -23, 19, TarConstants.LF_LINK, -64, 9, -15, 5, TarConstants.LF_CONTIG, -25, -53, 19, -4, -13, -6, 9, -8, -1};
    private static final int MediaBrowserCompatCustomActionResultReceiver = 190;
    private static char[] RemoteActionCompatParcelizer;
    private static int read;
    private static int write;
    private final MagicModuleDataKt IconCompatParcelizer;

    /* JADX WARN: Removed duplicated region for block: B:199:0x0794 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:203:0x079e  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x07c3  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x07c5  */
    @Override // kotlin.MarrowTheme
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final kotlin.C0156TypeKt AudioAttributesCompatParcelizer(o.MarrowTheme.AudioAttributesCompatParcelizer r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2270
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAutoSubmitted.AudioAttributesCompatParcelizer(o.MarrowTheme$AudioAttributesCompatParcelizer):o.TypeKt");
    }

    public setAutoSubmitted(MagicModuleDataKt magicModuleDataKt) {
        toMagicModuleMetaRepoModel.write(magicModuleDataKt, "");
        this.IconCompatParcelizer = magicModuleDataKt;
    }

    private static void a(int[] iArr, boolean z, byte[] bArr, Object[] objArr) throws Throwable {
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i = iArr[0];
        int i2 = iArr[1];
        int i3 = iArr[2];
        int i4 = iArr[3];
        char[] cArr = RemoteActionCompatParcelizer;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 11612 - Process.getGidForName(""), (ViewConfiguration.getLongPressTimeout() >> 16) + 20, -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i2];
        System.arraycopy(cArr, i, cArr3, 0, i2);
        if (bArr != null) {
            char[] cArr4 = new char[i2];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i2) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i6 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 22959 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 43, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i7 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((KeyEvent.getMaxKeyCode() >> 16) + 31589), 9863 - View.resolveSize(0, 0), 65 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getTouchSlop() >> 8) + 37822), 9754 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), Gravity.getAbsoluteGravity(0, 0) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i4 > 0) {
            char[] cArr5 = new char[i2];
            System.arraycopy(cArr3, 0, cArr5, 0, i2);
            int i8 = i2 - i4;
            System.arraycopy(cArr5, 0, cArr3, i8, i4);
            System.arraycopy(cArr5, i4, cArr3, 0, i8);
        }
        if (z) {
            char[] cArr6 = new char[i2];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i2) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i2 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr3 = cArr6;
        }
        if (i3 > 0) {
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i2) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    static {
        AudioAttributesCompatParcelizer();
        write = 0;
        read = 1;
    }

    static void AudioAttributesCompatParcelizer() {
        char[] cArr = new char[591];
        ByteBuffer.wrap("¯å¯T¯P¯_¯S¯T¯P¯_¯]¯V¯Q¯_¯Q¯U¯R¯]¯V¯Q¯_¯Q¯T¯R¯Q¯j¯P¯_¯Q¯j¯P¯_¯Q¯U¯R¯Q¯j¯P¯_¯Q¯T¯R¯P¯U¯P¯_¯P¯U¯P¯_¯P¯T¯R¯P¯U¯P¯_¯P¯W¯R¯S¯T¯P¯_¯S¯T¯P¯_¯S¯T¯P¯_¯R¯W¯P¯_¯R¯W¯P¯_¯]¯P¯R¯Q¯T¯]¯Q¯U¯P¯_¯]¯P¯R¯S¯V¯R¯R¯V¯R¯P¯U¯P¯_¯]¯V¯P¯_¯]¯V¯P¯_¯]¯V¯P¯_¯Q¯j¯P¯_¯]¯P¯R¯Q¯T¯]¯Q¯U¯P¯_¯R¯Q¯R¯]¯Q¯R¯]¯P¯R¯P¯U¯P¯_¯Q¯U¯S¯_¯]¯Q¯S¯_¯P¯T¯P¯_¯S¯V¯]¯Q¯T¯R¯Q¯T¯R¯_¯]¯P¯]¯S¯T¯P¯_¯S¯W¯P¯_¯R¯W¯P¯_¯R¯V¯P¯_¯Q¯T¯R¯Q¯U¯S¯_¯]¯P¯R¯P¯W¯R¯P¯W¯R¯P¯T¯S¯_¯R¯Q¯S¯_¯S¯V¯]¯S¯V¯R¯]¯V¯P¯_¯]¯Q¯P¯_¯Q¯U¯S¯_¯]¯P¯R¯Q¯T¯]¯Q¯U¯S¯_¯]¯P¯R¯R¯Q¯R¯R¯Q¯R¯P¯T¯S¯_¯R¯Q¯S¯_¯S¯V¯]¯]¯P¯R¯P¯T¯S¯_¯S¯V¯]¯]¯P¯R¯Q¯T¯]¯Q¯T¯]¯S¯W¯S¯_¯S¯W¯S¯_¯R¯V¯S¯_¯]¯S¯]¯R¯R¯Q¯U¯S¯_¯S¯V¯]¯Q¯V¯_¯]¯P¯]¯R¯V¯S¯_¯]¯S¯]¯R¯V¯S¯_¯P¯W¯]¯P¯V¯]¯P¯W¯S¯_¯P¯Q¯_¯S¯S¯Q¯U¯S¯_¯]¯Q¯S¯_¯]¯Q¯S¯_¯Q¯T¯R¯_¯]¯P¯]¯Q¯U¯S¯_¯Q¯T¯S¯_¯P¯T¯S¯_¯Q¯Q¯S¯V¯R¯_¯P¯W¯S¯_¯P¯Q¯_¯S¯S¯S¯W¯S¯_¯S¯V¯]¯Q¯V¯_¯]¯P¯]¯S¯V¯S¯_¯]¯S¯]¯R¯V¯S¯_¯Q¯Q¯S¯V¯R¯_¯P¯Q¯_¯S¯S¯R¯Q¯S¯_¯]¯Q¯S¯_¯]¯P¯S¯_¯Q¯T¯R¯_¯]¯P¯]¯Q¯T¯R¯_¯P¯W¯R¯_¯P¯W¯R¯_¯Q¯Q¯S¯V¯R¯_¯S¯V¯R¯_¯P¯Q¯_¯R¯P¯]¯Q¯V¯_¯]¯P¯]¯R¯Q¯R¯_¯]¯S¯]¯R¯Q¯R¯_¯R¯R¯_¯Q¯Q¯]¯P¯R¯_¯Q¯Q¯Q¯V¯_¯]¯P¯R¯_¯P¯Q¯_¯S¯S¯Q¯T¯R¯_¯Q¯V¯_¯Q¯W¯R¯_¯P¯W¯R¯_¯Q¯V¯_¯P¯V¯R¯_¯S¯V¯R¯_¯S¯Q¯R¯_¯Q¯V¯_¯R¯Q¯R¯_¯P¯Q¯_¯S¯S¯R¯P¯R¯_¯Q¯V¯_¯]¯P¯R¯_¯P¯Q¯_¯S¯S¯]¯S¯R¯_¯Q¯V¯_¯Q¯Q¯_¯P¯Q¯_¯S¯S¯P¯P¯_¯S¯P¯_¯S¯S¯_¯R¯R¯R¯S¯_¯R¯R¯_¯R¯R¯]¯R¯ó".getBytes(CharsetNames.ISO_8859_1)).asCharBuffer().get(cArr, 0, 591);
        RemoteActionCompatParcelizer = cArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r8 = r8 + 77
            byte[] r0 = kotlin.setAutoSubmitted.AudioAttributesCompatParcelizer
            int r1 = 24 - r7
            byte[] r1 = new byte[r1]
            int r7 = 23 - r7
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r6
            r4 = r7
            r3 = r2
            goto L2a
        L13:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r3 = r3 + 1
            r4 = r0[r8]
        L2a:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-2)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setAutoSubmitted.b(byte, int, byte, java.lang.Object[]):void");
    }
}
