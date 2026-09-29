package com.marrow.bgservices;

import android.app.IntentService;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.DownloadService;
import kotlin.Metadata;
import kotlin.getShowPopup;
import kotlin.notifyDownloadRemoved;
import kotlin.setSdkPayload;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\n\u001a\u00020\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\bH\u0014¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\u000e\u001a\u0004\u0018\u00010\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\b8\u0006@BX\u0086\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\"\u0010\u000f\u001a\u00028\u00008\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/marrow/bgservices/BaseIntentService;", "", "P", "Landroid/app/IntentService;", "", "p0", "<init>", "(Ljava/lang/String;)V", "Landroid/content/Intent;", "", "onHandleIntent", "(Landroid/content/Intent;)V", "IconCompatParcelizer", "Landroid/content/Intent;", "read", "presenter", "Ljava/lang/Object;", "getPresenter", "()Ljava/lang/Object;", "setPresenter", "(Ljava/lang/Object;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class BaseIntentService<P> extends IntentService {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public Intent read;

    @setSdkPayload
    public P presenter;
    private static final byte[] $$c = {64, TarConstants.LF_GNUTYPE_LONGLINK, 61, -128};
    private static final int $$f = 85;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {9, -88, -121, TarConstants.LF_FIFO, 25, 14, 8, 11, -9, -30, 40, 23, -5, 12, 5, -37, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19, 18, 4, -57, 62, 1, 24, 7, -9, 19, 12, -5, 5, -56, 66, -3, 8, 14, 14, 2, 5, -58, 60, 3, 25, -13, 7, 13, 11, -4, -48, 66, 0, 13, -52, 9, 0, 34, 0, 13, -20, 9, 39, 37, -5, 9, -66, TarConstants.LF_BLK, 21, 28, -29, 43, -3, -5, -17, 25, 18, -2, 58, -11, 11, 12, -40, 57, 6, 4, -3, -1, 25, 5, -9, 20, -42, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19};
    private static final int $$n = 125;
    private static final byte[] $$a = {67, -110, -113, 74, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 142;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static char[] RemoteActionCompatParcelizer = {47588, 40558, 63211, 53112, 10238, 31861, 21759, 44296, 34242, 55899, 12953, 2914, 25547, 47147, 37024, 59691, 49574, 9763, 51494, 61111, 34324, 49069, 22331, 56431, 64444, 37686, 43749, 17019, 6641, 12659, 51405, 57360, 49047, 22285, 28290, 1621, 56747, 62766, 36082, 42092, 17340, 6965, 13027, 51803, 57728, 47364, 20678, 26700, 1943, 57274, 63338, 36531, 42540, 32168, 5415, 11465, 50203, 58256, 47942, 21210, 27222, 464, 55672, 61600, 34930, 42983, 32622, 5864, 11860, 50572, 40194, 6487, 16001, 22030, 28632, 34628, 56479, 62542, 3570, 9594, 31485, 37425, 43954, 50027, 6295, 12357, 18842, 24918, 34519, 56924, 63361, 3893, 9398, 31805, 38317, 44413, 49835, 6868, 12880, 19410, 25409, 47299, 53324, 59895, 374, 9903, 32379, 38837, 44908, 50410, 7188, 13719, 19741, 25303, 47700, 54239, 60256, 176, 22632, 29095, 35115, 44712, 50728, 7762, 14295, 20317, 25793, 48199, 54684, 60704, 675, 23166, 29619, 35682, 41195, 56430, 64440, 37735, 43751, 16937, 6567, 12657, 51351, 57408, 49093, 22283, 28298, 1544, 56748, 62766, 36003, 42084, 17336, 6964, 13026, 51802, 57812, 47441, 20685, 26701, 1940, 57322, 63282, 36531, 42539, 32171, 5423, 11416, 50248, 58257, 47942, 21209, 27216, 385, 55593, 61685, 34931, 42939, 32619, 5811, 11871, 50650, 40198, 46281, 19485, 27536, 786, 56121, 62131, 35377, 41468, 31013, 4339, 10267, 51145, 40726, 46730, 19980, 25999, 43513, 36459, 59131, 57211, 14330, 27755, 61217, 51373, 40997, 39334, 28985, 10931, 560, 64386, 54023, 35974, 25631, 15837, 6739, 29387, 19289, 41869, 63554, 53448, 10618, 504, 24116, 46806, 36729, 59384, 15362, 5268, 27921, 24770, 18250, 12228, 5706, 65227, 42331, 36289, 29809, 23755, 871, 60394, 53876, 47828, 24837, 18825, 12293, 56376, 64443, 37695, 43703, 16929, 6563, 12581, 51357, 57373, 49047, 22286};
    private static long read = 6986949275217820553L;
    private static long write = -3498762522182953692L;
    private static int AudioAttributesCompatParcelizer = -136981212;
    private static char AudioAttributesImplBaseParcelizer = 40077;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 2
            int r6 = 103 - r6
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r8 = r8 + 1
            byte[] r0 = com.marrow.bgservices.BaseIntentService.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r6 = r6 + r3
            int r7 = r7 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.bgservices.BaseIntentService.$$i(short, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.marrow.bgservices.BaseIntentService.$$a
            int r7 = 44 - r7
            int r9 = 190 - r9
            int r8 = 114 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r9
            r4 = r2
            goto L27
        L10:
            r3 = r2
        L11:
            int r9 = r9 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L22
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
            int r8 = r8 + r9
            int r8 = r8 + (-1)
            r9 = r3
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.bgservices.BaseIntentService.c(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 17
            int r6 = 99 - r6
            byte[] r0 = com.marrow.bgservices.BaseIntentService.$$m
            int r5 = r5 * 3
            int r1 = r5 + 28
            int r7 = r7 * 3
            int r7 = 87 - r7
            byte[] r1 = new byte[r1]
            int r5 = r5 + 27
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r5
            r3 = r2
            goto L2c
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r5) goto L28
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r7]
        L2c:
            int r6 = r6 + r4
            int r6 = r6 + (-6)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.bgservices.BaseIntentService.d(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BaseIntentService(String str) {
        super(str);
        toMagicModuleMetaRepoModel.write(str, "");
    }

    public final P getPresenter() {
        int i = 2 % 2;
        P p = this.presenter;
        if (p != null) {
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 93;
            MediaBrowserCompatItemReceiver = i2 % 128;
            if (i2 % 2 == 0) {
                return p;
            }
            throw null;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        P p2 = (P) getShowPopup.INSTANCE;
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 1;
        MediaBrowserCompatItemReceiver = i3 % 128;
        int i4 = i3 % 2;
        return p2;
    }

    public final void setPresenter(P p) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 23;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(p, "");
            this.presenter = p;
            int i3 = 46 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(p, "");
            this.presenter = p;
        }
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 9;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // android.app.IntentService
    public void onHandleIntent(Intent p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver;
        int i3 = i2 + 113;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        this.read = p0;
        int i5 = i2 + 103;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 3 / 0;
        }
    }

    private static void a(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        int i4 = 0;
        downloadService.write = 0;
        int i5 = $10 + 99;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (downloadService.write < i2) {
            int i7 = downloadService.write;
            try {
                Object[] objArr2 = new Object[1];
                objArr2[i4] = Integer.valueOf(RemoteActionCompatParcelizer[i + i7]);
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    char cAxisFromString = (char) (36620 - MotionEvent.axisFromString(""));
                    int modifierMetaStateMask = 2339 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int bitsPerPixel = 27 - ImageFormat.getBitsPerPixel(i4);
                    byte b = (byte) ($$f & 3);
                    byte b2 = (byte) (b - 1);
                    String str$$i = $$i(b, b2, b2);
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Integer.TYPE;
                    objRemoteActionCompatParcelizer = startForeground.read(cAxisFromString, modifierMetaStateMask, bitsPerPixel, 480654850, false, str$$i, clsArr);
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(read), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) View.getDefaultSize(0, 0), View.resolveSize(0, 0) + 9701, 27 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {downloadService, downloadService};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) TextUtils.indexOf("", "", 0), 23832 - AndroidCharacter.getMirror('0'), TextUtils.getOffsetBefore("", 0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                        i4 = 0;
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
        }
        char[] cArr = new char[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr5 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 23783 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 32 - TextUtils.lastIndexOf("", '0'), -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            int i8 = $11 + 47;
            $10 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr);
    }

    private static void b(char[] cArr, char c, char[] cArr2, char[] cArr3, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
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
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i4 = $10 + 25;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (AndroidCharacter.getMirror('0') - '0'), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22748, (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 35, 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 31369), 2721 - Color.argb(0, 0, 0, 0), 38 - (KeyEvent.getMaxKeyCode() >> 16), 1895162189, false, $$i(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ImageFormat.getBitsPerPixel(0) + 1), 15713 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), View.combineMeasuredStates(0, 0) + 64, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 40975), TextUtils.getTrimmedLength("") + 6122, 29 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (write ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) AudioAttributesCompatParcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) AudioAttributesImplBaseParcelizer) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                int i6 = $11 + 51;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i8 = $10 + 35;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0af9 A[Catch: all -> 0x0c2e, TryCatch #10 {all -> 0x0c2e, blocks: (B:84:0x06a1, B:86:0x06a7, B:87:0x06e4, B:89:0x06f1, B:91:0x06fa, B:92:0x073e, B:115:0x0aef, B:116:0x0af3, B:118:0x0af9, B:120:0x0b0f, B:123:0x0b1c, B:126:0x0b29, B:133:0x0b8a, B:139:0x0c08, B:141:0x0c0e, B:142:0x0c0f, B:144:0x0c11, B:146:0x0c18, B:147:0x0c19, B:93:0x0749, B:105:0x0939, B:107:0x093f, B:108:0x0982, B:110:0x0a52, B:111:0x0a94, B:113:0x0aa9, B:114:0x0ae9, B:149:0x0c1b, B:151:0x0c22, B:152:0x0c23, B:154:0x0c25, B:156:0x0c2c, B:157:0x0c2d, B:95:0x086b, B:97:0x087c, B:98:0x08ab, B:135:0x0b8f, B:129:0x0b52, B:131:0x0b58, B:132:0x0b83, B:100:0x08b2, B:102:0x08c6, B:103:0x092d), top: B:276:0x06a1, outer: #5, inners: #3, #6, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0d73  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0dc2  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0e1d  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x1138  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x1219  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x1264  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x12b4  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x15dd  */
    /* JADX WARN: Removed duplicated region for block: B:295:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x048e A[Catch: all -> 0x0542, TRY_LEAVE, TryCatch #2 {all -> 0x0542, blocks: (B:44:0x047d, B:46:0x048e), top: B:262:0x047d }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x04c9 A[Catch: all -> 0x0536, TryCatch #12 {all -> 0x0536, blocks: (B:51:0x04bc, B:53:0x04c9, B:54:0x052e), top: B:279:0x04bc, outer: #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x05f1 A[Catch: all -> 0x044c, TryCatch #8 {all -> 0x044c, blocks: (B:197:0x1158, B:199:0x115e, B:200:0x1184, B:233:0x15fd, B:235:0x1603, B:236:0x1627, B:214:0x1386, B:216:0x13a8, B:217:0x13f8, B:164:0x0cb8, B:166:0x0cbe, B:167:0x0ce6, B:77:0x05eb, B:79:0x05f1, B:80:0x0616, B:19:0x0113, B:21:0x0119, B:22:0x0141, B:24:0x03c7, B:26:0x03f8, B:27:0x0446), top: B:273:0x0113 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x06a7 A[Catch: all -> 0x0c2e, TryCatch #10 {all -> 0x0c2e, blocks: (B:84:0x06a1, B:86:0x06a7, B:87:0x06e4, B:89:0x06f1, B:91:0x06fa, B:92:0x073e, B:115:0x0aef, B:116:0x0af3, B:118:0x0af9, B:120:0x0b0f, B:123:0x0b1c, B:126:0x0b29, B:133:0x0b8a, B:139:0x0c08, B:141:0x0c0e, B:142:0x0c0f, B:144:0x0c11, B:146:0x0c18, B:147:0x0c19, B:93:0x0749, B:105:0x0939, B:107:0x093f, B:108:0x0982, B:110:0x0a52, B:111:0x0a94, B:113:0x0aa9, B:114:0x0ae9, B:149:0x0c1b, B:151:0x0c22, B:152:0x0c23, B:154:0x0c25, B:156:0x0c2c, B:157:0x0c2d, B:95:0x086b, B:97:0x087c, B:98:0x08ab, B:135:0x0b8f, B:129:0x0b52, B:131:0x0b58, B:132:0x0b83, B:100:0x08b2, B:102:0x08c6, B:103:0x092d), top: B:276:0x06a1, outer: #5, inners: #3, #6, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x06f1 A[Catch: all -> 0x0c2e, TryCatch #10 {all -> 0x0c2e, blocks: (B:84:0x06a1, B:86:0x06a7, B:87:0x06e4, B:89:0x06f1, B:91:0x06fa, B:92:0x073e, B:115:0x0aef, B:116:0x0af3, B:118:0x0af9, B:120:0x0b0f, B:123:0x0b1c, B:126:0x0b29, B:133:0x0b8a, B:139:0x0c08, B:141:0x0c0e, B:142:0x0c0f, B:144:0x0c11, B:146:0x0c18, B:147:0x0c19, B:93:0x0749, B:105:0x0939, B:107:0x093f, B:108:0x0982, B:110:0x0a52, B:111:0x0a94, B:113:0x0aa9, B:114:0x0ae9, B:149:0x0c1b, B:151:0x0c22, B:152:0x0c23, B:154:0x0c25, B:156:0x0c2c, B:157:0x0c2d, B:95:0x086b, B:97:0x087c, B:98:0x08ab, B:135:0x0b8f, B:129:0x0b52, B:131:0x0b58, B:132:0x0b83, B:100:0x08b2, B:102:0x08c6, B:103:0x092d), top: B:276:0x06a1, outer: #5, inners: #3, #6, #11, #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0749 A[Catch: all -> 0x0c2e, TRY_LEAVE, TryCatch #10 {all -> 0x0c2e, blocks: (B:84:0x06a1, B:86:0x06a7, B:87:0x06e4, B:89:0x06f1, B:91:0x06fa, B:92:0x073e, B:115:0x0aef, B:116:0x0af3, B:118:0x0af9, B:120:0x0b0f, B:123:0x0b1c, B:126:0x0b29, B:133:0x0b8a, B:139:0x0c08, B:141:0x0c0e, B:142:0x0c0f, B:144:0x0c11, B:146:0x0c18, B:147:0x0c19, B:93:0x0749, B:105:0x0939, B:107:0x093f, B:108:0x0982, B:110:0x0a52, B:111:0x0a94, B:113:0x0aa9, B:114:0x0ae9, B:149:0x0c1b, B:151:0x0c22, B:152:0x0c23, B:154:0x0c25, B:156:0x0c2c, B:157:0x0c2d, B:95:0x086b, B:97:0x087c, B:98:0x08ab, B:135:0x0b8f, B:129:0x0b52, B:131:0x0b58, B:132:0x0b83, B:100:0x08b2, B:102:0x08c6, B:103:0x092d), top: B:276:0x06a1, outer: #5, inners: #3, #6, #11, #15 }] */
    /* JADX WARN: Type inference failed for: r15v1 */
    /* JADX WARN: Type inference failed for: r15v14 */
    /* JADX WARN: Type inference failed for: r15v15 */
    /* JADX WARN: Type inference failed for: r15v16, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r15v17, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r15v18 */
    /* JADX WARN: Type inference failed for: r15v20 */
    /* JADX WARN: Type inference failed for: r15v21, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r15v23 */
    /* JADX WARN: Type inference failed for: r15v24 */
    /* JADX WARN: Type inference failed for: r15v25 */
    /* JADX WARN: Type inference failed for: r15v26 */
    /* JADX WARN: Type inference failed for: r15v27 */
    @Override // android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.bgservices.BaseIntentService.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.IntentService, android.app.Service
    public void onCreate() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 123;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onCreate();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 35;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
