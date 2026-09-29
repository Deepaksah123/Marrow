package in.juspay.hypernfc;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import in.juspay.hypernfc.NfcActivity;
import java.lang.reflect.Method;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.DownloadService;
import kotlin.MediaSourceListExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin._isNaN;
import kotlin._verifyEndArrayForSingle;
import kotlin.getRenewGrpId;
import kotlin.maybeGetTypeVariable;
import kotlin.notifyDownloads;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0003J\u0019\u0010\b\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0014¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000e\u0010\u0003J\u000f\u0010\u000f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u000f\u0010\u0003J\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001d"}, d2 = {"Lin/juspay/hypernfc/NfcActivity;", "Lo/maybeGetTypeVariable;", "<init>", "()V", "", "onBackPressed", "Landroid/os/Bundle;", "p0", "onCreate", "(Landroid/os/Bundle;)V", "onDestroy", "Landroid/content/Intent;", "onNewIntent", "(Landroid/content/Intent;)V", "onPause", "onResume", "Lorg/json/JSONObject;", "timedOut", "(Lorg/json/JSONObject;)V", "Lo/MediaSourceListExternalSyntheticLambda0;", "cardTask", "Lo/MediaSourceListExternalSyntheticLambda0;", "data", "Lorg/json/JSONObject;", "Ljava/util/TimerTask;", "task", "Ljava/util/TimerTask;", "Ljava/util/Timer;", "timerForWaitingInActivity", "Ljava/util/Timer;", "timerToReadChangedMessage"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class NfcActivity extends maybeGetTypeVariable {
    private TimerTask task;
    private static final byte[] $$c = {115, TarConstants.LF_DIR, -117, 77};
    private static final int $$f = 99;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {93, -16, 105, -74, 9, -5, -66, TarConstants.LF_FIFO, 5, -3, -11, 2, -10, -58, TarConstants.LF_NORMAL, 10, -13, 11, -6, -9, -8, -57, TarConstants.LF_FIFO, 3, 3, -72, TarConstants.LF_SYMLINK, 9, -5, -3, -1, -4, -67, 68, -4, -14, 0, -65, 73, -3, -28, -16, -7, 0, 16, 5, -1, 2, -18, -39, 31, 14, -14, 3, -4, -46, 41, -5, 0, -18, 16, -39, 14, 14, -18, -1, 4, -6, 14, -24, 10, -68, 34, 30, -22, 16, -2, -5, -49, TarConstants.LF_NORMAL, -24, -1, 8, 1, -14, 3, -4, -36, 17, 12, -3, -14, 10};
    private static final int $$e = 13;
    private static final byte[] $$a = {31, 80, -124, -66, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 226;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static char[] IconCompatParcelizer = {28425, 28442, 28420, 28438, 28443, 28417, 28506, 28439, 28536, 28423, 28421, 28437, 28436, 28521, 28440, 28444, 28504, 28499, 28498, 28501, 28422, 28505, 28497, 28496, 28500, 28502, 28503, 28418, 28416, 28526, 28507, 28433, 28419, 28441, 28445, 28434, 28512, 28519, 28535, 28447, 28534};
    private static int AudioAttributesCompatParcelizer = 411398056;
    private static boolean write = true;
    private static boolean read = true;
    private static char[] RemoteActionCompatParcelizer = {56417, 29711, 36013, 9483, 32128, 56429, 29720, 35996, 9488, 32139, 38407, 11956, 18292, 40893, 12342, 18616, 57628, 14837, 21085, 60116, 835, 23514, 60543, 1260, 23931, 62928, 3686, 42498, 65183, 5917, 44930, 56431, 29763, 36040, 9476, 32135, 38410, 11953, 18232, 40936, 12400, 18683, 57611, 14801, 21080, 60100, 799, 23452, 60531, 1275, 23858, 62903, 3691, 42518, 65219, 5956, 44928, 49244, 6323, 45415, 51695, 25202, 47866, 54057, 27524, 48142, 54471, 27974, 34253, 56946, 30381, 36728, 10165, 30769, 36935, 10444, 16711, 39302, 12815, 54740, 32185, 34088, 11447, 29739, 40893, 56382, 29767, 35994, 9557, 32210, 38492, 12001, 18283, 40945, 12414, 18606, 57610, 14802, 21011, 60052, 796, 23448, 60449, 1205, 23867, 62950, 3644, 42560, 65239, 5914, 45009, 49161, 6368, 45411, 51643, 25123, 47788, 54141, 27607, 48142, 54420, 47796, 4805, 59996, 17361, 6936, 61648, 18531, 8678, 63849, 22202, 11849, 34713, 24341, 13464, 35863, 26005};
    private static long MediaBrowserCompatCustomActionResultReceiver = 7778638585528087670L;
    private final JSONObject data = new JSONObject();
    private final MediaSourceListExternalSyntheticLambda0 cardTask = new MediaSourceListExternalSyntheticLambda0();
    private final Timer timerForWaitingInActivity = new Timer();
    private final Timer timerToReadChangedMessage = new Timer();

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r5, int r6, short r7) {
        /*
            int r5 = r5 * 4
            int r0 = 1 - r5
            byte[] r1 = in.juspay.hypernfc.NfcActivity.$$c
            int r6 = r6 * 2
            int r6 = 3 - r6
            int r7 = r7 * 3
            int r7 = r7 + 101
            byte[] r0 = new byte[r0]
            r2 = 0
            int r5 = 0 - r5
            if (r1 != 0) goto L19
            r4 = r7
            r3 = r2
            r7 = r5
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L25:
            int r6 = r6 + 1
            r4 = r1[r6]
            int r3 = r3 + 1
        L2b:
            int r7 = r7 + r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypernfc.NfcActivity.$$g(int, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 65
            int r5 = 44 - r5
            byte[] r0 = in.juspay.hypernfc.NfcActivity.$$a
            int r6 = r6 + 4
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L10
            r4 = r5
            r3 = r2
            goto L24
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L20:
            int r6 = r6 + 1
            r4 = r0[r6]
        L24:
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypernfc.NfcActivity.c(short, int, short, java.lang.Object[]):void");
    }

    private static void d(byte b, int i, short s, Object[] objArr) {
        int i2 = 114 - s;
        int i3 = 71 - b;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[38 - i];
        int i4 = 37 - i;
        int i5 = -1;
        if (bArr == null) {
            i3++;
            i2 = i3 + i4 + 3;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                byte b2 = bArr[i3];
                i3++;
                i2 = i2 + b2 + 3;
            }
        }
    }

    public static final /* synthetic */ JSONObject access$getData$p(NfcActivity nfcActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver;
        int i3 = i2 + 37;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        JSONObject jSONObject = nfcActivity.data;
        if (i4 != 0) {
            obj.hashCode();
            throw null;
        }
        int i5 = i2 + 97;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            return jSONObject;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void access$timedOut(NfcActivity nfcActivity, JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 13;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        nfcActivity.timedOut(jSONObject);
        int i4 = MediaBrowserCompatItemReceiver + 121;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX INFO: renamed from: in.juspay.hypernfc.NfcActivity$onCreate$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lin/juspay/hypernfc/NfcActivity$onCreate$4;", "Ljava/util/TimerTask;", "", "run", "()V"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class AnonymousClass4 extends TimerTask {
        AnonymousClass4() {
        }

        @Override // java.util.TimerTask, java.lang.Runnable
        public final void run() {
            try {
                NfcActivity.access$getData$p(NfcActivity.this).put("error", "Request timed out!");
                NfcActivity.access$getData$p(NfcActivity.this).put("data", (Object) null);
                final NfcActivity nfcActivity = NfcActivity.this;
                nfcActivity.runOnUiThread(new Runnable() { // from class: in.juspay.hypernfc.NfcActivity$onCreate$4$$ExternalSyntheticLambda0
                    @Override // java.lang.Runnable
                    public final void run() {
                        NfcActivity.AnonymousClass4.run$lambda$0(nfcActivity);
                    }
                });
                NfcActivity nfcActivity2 = NfcActivity.this;
                NfcActivity.access$timedOut(nfcActivity2, NfcActivity.access$getData$p(nfcActivity2));
            } catch (Exception unused) {
                Intent intent = new Intent();
                intent.putExtra("result_data", "{\"error\":\"Couldn't read the card! Try again or type your card number\"}");
                NfcActivity.this.setResult(0, intent);
                NfcActivity.this.finish();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void run$lambda$0(NfcActivity nfcActivity) {
            toMagicModuleMetaRepoModel.write(nfcActivity, "");
            nfcActivity.findViewById(R.id.backgroundImage).setBackground(_isNaN.getDrawable(nfcActivity.getApplicationContext(), R.drawable.image_border));
        }
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i4 = $11 + 89;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(RemoteActionCompatParcelizer[i2 + i6])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (36620 - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getFadingEdgeLength() >> 16) + 2340, 28 - Color.red(0), 480654850, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(MediaBrowserCompatCustomActionResultReceiver), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 9702 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 25, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), View.MeasureSpec.getMode(0) + 23784, (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 32, -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
        char[] cArr = new char[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i7 = $10 + 43;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr5 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 23783 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    private static void a(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2;
        int i3 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr3 = IconCompatParcelizer;
        long j = 0;
        if (cArr3 != null) {
            int i4 = $10 + 9;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 27;
                $11 = i7 % 128;
                if (i7 % i2 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44862), 18943 - ImageFormat.getBitsPerPixel(0), 29 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                        }
                        cArr4[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr3[i6])};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (44910 - AndroidCharacter.getMirror('0')), (ViewConfiguration.getScrollBarSize() >> 8) + 18944, (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr4[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i6++;
                }
                i2 = 2;
                j = 0;
            }
            cArr3 = cArr4;
        }
        Object[] objArr4 = {Integer.valueOf(AudioAttributesCompatParcelizer)};
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer3 == null) {
            objRemoteActionCompatParcelizer3 = startForeground.read((char) View.MeasureSpec.makeMeasureSpec(0, 0), 19033 - (ViewConfiguration.getScrollBarSize() >> 8), 75 - ExpandableListView.getPackedPositionType(0L), 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
        if (!read) {
            if (!write) {
                notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
                char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 0;
                while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                    cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr3[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                    notifydownloads.IconCompatParcelizer++;
                }
                objArr[0] = new String(cArr5);
                return;
            }
            notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
            char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr3[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                Object[] objArr5 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), Color.alpha(0) + 11439, View.MeasureSpec.getMode(0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i8 = $10 + 39;
        $11 = i8 % 128;
        if (i8 % 2 == 0) {
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            cArr2 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 1;
        } else {
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            cArr2 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
        }
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            int i9 = $11 + 75;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                cArr2[notifydownloads.IconCompatParcelizer] = (char) (cArr3[bArr[notifydownloads.AudioAttributesCompatParcelizer >>> notifydownloads.IconCompatParcelizer] >> i] % iIntValue);
                Object[] objArr6 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 11440 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            } else {
                cArr2[notifydownloads.IconCompatParcelizer] = (char) (cArr3[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr7 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) TextUtils.indexOf("", ""), 11439 - (ViewConfiguration.getJumpTapTimeout() >> 16), 14 - TextUtils.indexOf("", "", 0, 0), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
        }
        objArr[0] = new String(cArr2);
    }

    private static final void onCreate$lambda$1(NfcActivity nfcActivity, View view) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 115;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(nfcActivity, "");
        nfcActivity.onBackPressed();
        int i4 = MediaBrowserCompatItemReceiver + 39;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void onCreate$lambda$2(NfcActivity nfcActivity, ImageView imageView) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 41;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(nfcActivity, "");
            ((Wave) nfcActivity.findViewById(R.id.rippleView)).startRippleAnimation(imageView.getTop() + (imageView.getHeight() * 3));
        } else {
            toMagicModuleMetaRepoModel.write(nfcActivity, "");
            ((Wave) nfcActivity.findViewById(R.id.rippleView)).startRippleAnimation(imageView.getTop() + (imageView.getHeight() / 2));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00b2  */
    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypernfc.NfcActivity.onCreate(android.os.Bundle):void");
    }

    private final void timedOut(final JSONObject p0) {
        int i = 2 % 2;
        ((TextView) findViewById(R.id.nfcStatus)).setText(R.string.no_card_detected);
        TimerTask timerTask = new TimerTask() { // from class: in.juspay.hypernfc.NfcActivity.timedOut.1
            @Override // java.util.TimerTask, java.lang.Runnable
            public final void run() {
                Intent intent = new Intent();
                intent.putExtra("result_data", p0.toString());
                this.setResult(0, intent);
                this.finish();
            }
        };
        this.task = timerTask;
        this.timerToReadChangedMessage.schedule(timerTask, 1500L);
        int i2 = MediaBrowserCompatItemReceiver + 117;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00e6  */
    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 393
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypernfc.NfcActivity.onResume():void");
    }

    @Override // kotlin.maybeGetTypeVariable, android.app.Activity
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 31;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        try {
            TimerTask timerTask = this.task;
            if (timerTask != null) {
                timerTask.cancel();
            }
            this.timerForWaitingInActivity.cancel();
            this.timerToReadChangedMessage.cancel();
            int i4 = MediaBrowserCompatItemReceiver + 123;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception unused) {
        }
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    @getRenewGrpId
    public final void onBackPressed() {
        int i = 2 % 2;
        setResult(0, new Intent());
        finish();
        int i2 = AudioAttributesImplApi21Parcelizer + 119;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final WindowInsetsCompat onCreate$lambda$0(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 101;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(windowInsetsCompat, "");
        _verifyEndArrayForSingle _verifyendarrayforsingle = windowInsetsCompat.read(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer() | WindowInsetsCompat.MediaBrowserCompatItemReceiver.read());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(_verifyendarrayforsingle, "");
        view.setPadding(_verifyendarrayforsingle.read, _verifyendarrayforsingle.write, _verifyendarrayforsingle.IconCompatParcelizer, _verifyendarrayforsingle.AudioAttributesCompatParcelizer);
        int i4 = AudioAttributesImplApi21Parcelizer + 79;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        return windowInsetsCompat;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a2  */
    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 317
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypernfc.NfcActivity.onPause():void");
    }

    private static final void onNewIntent$lambda$3(NfcActivity nfcActivity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 25;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(nfcActivity, "");
            nfcActivity.findViewById(R.id.backgroundImage).setBackground(_isNaN.getDrawable(nfcActivity.getApplicationContext(), R.drawable.image_border));
        } else {
            toMagicModuleMetaRepoModel.write(nfcActivity, "");
            nfcActivity.findViewById(R.id.backgroundImage).setBackground(_isNaN.getDrawable(nfcActivity.getApplicationContext(), R.drawable.image_border));
            throw null;
        }
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public final void onNewIntent(Intent p0) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 43;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onNewIntent(p0);
        try {
            String strRemoteActionCompatParcelizer = this.cardTask.RemoteActionCompatParcelizer(p0);
            this.data.put("error", (Object) null);
            this.data.put("data", strRemoteActionCompatParcelizer);
            if (strRemoteActionCompatParcelizer == null) {
                runOnUiThread(new Runnable() { // from class: in.juspay.hypernfc.NfcActivity$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        NfcActivity.m236$r8$lambda$dFkGTxPfMffY8KYdo4HbdJV0Yc(this.f$0);
                    }
                });
                ((TextView) findViewById(R.id.nfcStatus)).setText(R.string.scan_failed);
                TimerTask timerTask = new TimerTask() { // from class: in.juspay.hypernfc.NfcActivity.onNewIntent.3
                    @Override // java.util.TimerTask, java.lang.Runnable
                    public final void run() {
                        Intent intent = new Intent();
                        intent.putExtra("result_data", "{\"error\":\"Couldn't read your card ! Try again or type your card number\"}");
                        NfcActivity.this.setResult(0, intent);
                        NfcActivity.this.finish();
                    }
                };
                this.task = timerTask;
                this.timerToReadChangedMessage.schedule(timerTask, 1500L);
                return;
            }
            ((TextView) findViewById(R.id.nfcStatus)).setText(R.string.scan_successful);
            TimerTask timerTask2 = new TimerTask() { // from class: in.juspay.hypernfc.NfcActivity.onNewIntent.1
                @Override // java.util.TimerTask, java.lang.Runnable
                public final void run() {
                    Intent intent = new Intent();
                    intent.putExtra("result_data", NfcActivity.access$getData$p(NfcActivity.this).toString());
                    NfcActivity.this.setResult(-1, intent);
                    NfcActivity.this.finish();
                }
            };
            this.task = timerTask2;
            this.timerToReadChangedMessage.schedule(timerTask2, 1500L);
            int i4 = MediaBrowserCompatItemReceiver + 83;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception unused) {
            Intent intent = new Intent();
            intent.putExtra("result_data", "{\"error\":\"Couldn't recognize card ! Try again or type your card number\"}");
            setResult(0, intent);
            finish();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x09ca  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0a02 A[Catch: all -> 0x0abb, TryCatch #13 {all -> 0x0abb, blocks: (B:150:0x09ee, B:152:0x0a02, B:153:0x0a30), top: B:292:0x09ee, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0a43 A[Catch: all -> 0x0ab1, TryCatch #7 {all -> 0x0ab1, blocks: (B:154:0x0a36, B:156:0x0a43, B:157:0x0aa9), top: B:281:0x0a36, outer: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0be3  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0c34  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0c8c  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0f3f  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x1029  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x1076  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x10c6  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x132e  */
    /* JADX WARN: Removed duplicated region for block: B:302:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0355  */
    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypernfc.NfcActivity.attachBaseContext(android.content.Context):void");
    }

    /* JADX INFO: renamed from: $r8$lambda$dFkGTxP-fMffY8KYdo4HbdJV0Yc, reason: not valid java name */
    public static /* synthetic */ void m236$r8$lambda$dFkGTxPfMffY8KYdo4HbdJV0Yc(NfcActivity nfcActivity) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 11;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        onNewIntent$lambda$3(nfcActivity);
        int i4 = MediaBrowserCompatItemReceiver + 67;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ WindowInsetsCompat $r8$lambda$fQzFoKwfABmHjnNIiUB5b8q2LA8(View view, WindowInsetsCompat windowInsetsCompat) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 33;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        WindowInsetsCompat windowInsetsCompatOnCreate$lambda$0 = onCreate$lambda$0(view, windowInsetsCompat);
        int i4 = MediaBrowserCompatItemReceiver + 99;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 65 / 0;
        }
        return windowInsetsCompatOnCreate$lambda$0;
    }

    /* JADX INFO: renamed from: $r8$lambda$nehL08aG7vBa2TT3F-To0no3PiY, reason: not valid java name */
    public static /* synthetic */ void m237$r8$lambda$nehL08aG7vBa2TT3FTo0no3PiY(NfcActivity nfcActivity, View view) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 3;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        onCreate$lambda$1(nfcActivity, view);
        if (i3 != 0) {
            int i4 = 50 / 0;
        }
        int i5 = AudioAttributesImplApi21Parcelizer + 113;
        MediaBrowserCompatItemReceiver = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void $r8$lambda$sNeuM9MoesSUJDvIfkh089CsSw0(NfcActivity nfcActivity, ImageView imageView) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 87;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        onCreate$lambda$2(nfcActivity, imageView);
        int i4 = AudioAttributesImplApi21Parcelizer + 103;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 121;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = AudioAttributesImplApi21Parcelizer + 77;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 34 / 0;
        }
    }
}
