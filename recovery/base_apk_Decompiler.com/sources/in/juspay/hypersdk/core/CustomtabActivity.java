package in.juspay.hypersdk.core;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcelable;
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
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.DownloadService;
import kotlin.getProvider;
import kotlin.notifyDownloads;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public class CustomtabActivity extends Activity {
    public static final String CUSTOMTAB_RESULT = "customtab-result";
    private static final String LOG_TAG = "CustomtabActivity";
    private Boolean isFirstResume = Boolean.TRUE;
    private static final byte[] $$c = {3, -109, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -57};
    private static final int $$f = 16;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {91, -41, -108, -7, 13, -1, -62, 58, 9, 1, -7, 6, -6, -54, TarConstants.LF_BLK, 14, -9, 15, -2, -5, -4, -53, 64, -11, 20, -14, 14, -8, -7, 12, -61, 71, -18, 2, 18, -68, 39, 14, 2, -21, 22, 25, -9, 7, 0, -79, 79, -12, -3, 4, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -64, 38, 34, -18, 20, 2, -1, -45, TarConstants.LF_BLK, -20, 3, 12, 5, -10, 7, 0, -32, 21, 16, 1, -10, 14};
    private static final int $$e = TsExtractor.TS_PACKET_SIZE;
    private static final byte[] $$a = {87, 74, -120, 12, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 140;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private static char[] RemoteActionCompatParcelizer = {28439, 28456, 28434, 28452, 28457, 28463, 28520, 28453, 28422, 28437, 28435, 28459, 28479, 28419, 28454, 28535, 28450, 28448, 28418, 28462, 28451, 28458, 28540, 28521, 28433, 28455, 28516, 28543, 28519, 28514, 28436, 28513, 28512, 28523, 28542, 28432, 28518, 28420, 28517};
    private static int write = 411398070;
    private static boolean IconCompatParcelizer = true;
    private static boolean AudioAttributesCompatParcelizer = true;
    private static char[] read = {56431, 4886, 16994, 45543, 57555, 55171, 1911, 30247, 42304, 38045, 52201, 15152, 27229, 22793, 35066, 65528, 11980, 7798, 19745, 48193, 62355, 8882, 4704, 16652, 45148, 59389, 55038, 1432, 29979, 42094, 39868, 51853, 14729, 26929, 22532, 36612, 65266, 11684, 7316, 19474, 33584, 62136, 8579, 4316, 16416, 46966, 58904, 54728, 39521, 21789, 1132, 63468, 42714, 37339, 16764, 12334, 58140, 53953, 36323, 32054, 11349, 7939, 52903, 47526, 26816, 22571, 2942, 64021, 46539, 25778, 21615, 1873, 63067, 41463, 37030, 17300, 13132, 57909, 56801, 36048, 32641, 12138, 7693, 51471, 47275, 27560, 23192, 2632, 50481, 46305, 26501, 22224, 1569, 61812, 40978, 37780, 17073, 15767, 60746, 56380, 36844, 32467, 10639, 6525, 51233, 47936, 27282, 9703, 5472, 50183, 46848, 26359, 35095, 18027, 5962, 58524, 46584, 33452, 21004, 8964, 61545, 49590, 40598, 28225, 16249, 3191, 56707, 43728, 31677, 19211, 6233, 59705, 42731, 30623, 18252, 5246, 58660, 45703, 33751, 20665, 8290, 61712, 52934, 40956, 27809, 15387, 3452, 55933, 43912, 30939, 18876, 6458, 54812, 42944, 29862, 17824, 5378, 57860, 45879, 32949, 20880, 12014, 65085, 53065, 40136, 28152, 15020, 2575, 56076, 43104, 31206, 14018, 1607, 55153, 42017, 30172, 56422, 4930, 16932, 45536, 57502, 55179, 1911, 30251, 42259, 38021, 52105, 15216, 27211, 22811, 35067, 65440, 52560, 626, 21250, 41178, 61937, 50875, 5719, 26377, 46089, 34303, 55964, 10836, 31566, 18485, 39375, 61085, 56429, 4941, 16950, 45555, 57567, 55182, 1906, 30315, 42267, 38104, 52212, 15194, 27201, 22812, 35050, 65448, 11921, 7760, 19758, 48158, 62403, 8892, 56376, 4881, 17003, 45493, 57481, 55249, 1825, 30327, 42317, 38045, 52202};
    private static long AudioAttributesImplApi21Parcelizer = -3910613245356076253L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r6, int r7, short r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 101
            int r6 = r6 * 3
            int r0 = 1 - r6
            byte[] r1 = in.juspay.hypersdk.core.CustomtabActivity.$$c
            int r8 = r8 * 2
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L19
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2d
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r8 = -r8
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.CustomtabActivity.$$g(int, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = 114 - r7
            byte[] r0 = in.juspay.hypersdk.core.CustomtabActivity.$$a
            int r8 = r8 + 4
            int r1 = 44 - r6
            byte[] r1 = new byte[r1]
            int r6 = 43 - r6
            r2 = -1
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2b
        L13:
            r3 = r2
        L14:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            r9[r7] = r6
            return
        L24:
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r3 = r3 + 1
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-1)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.CustomtabActivity.c(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 73
            int r8 = 47 - r8
            byte[] r0 = in.juspay.hypersdk.core.CustomtabActivity.$$d
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r9
            r4 = r2
            r9 = r7
            goto L26
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L26:
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.CustomtabActivity.d(short, int, int, java.lang.Object[]):void");
    }

    public static boolean isChromeInstalled(ArrayList<ResolveInfo> arrayList) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 29;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Iterator<ResolveInfo> it = arrayList.iterator();
        while (it.hasNext()) {
            int i4 = AudioAttributesImplApi26Parcelizer + 97;
            MediaBrowserCompatItemReceiver = i4 % 128;
            if (i4 % 2 != 0) {
                ((PackageItemInfo) it.next().activityInfo).packageName.equals("com.android.chrome");
                throw null;
            }
            if (((PackageItemInfo) it.next().activityInfo).packageName.equals("com.android.chrome")) {
                return true;
            }
        }
        return false;
    }

    private void launchInBrowser(String str) {
        int i = 2 % 2;
        startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        int i2 = MediaBrowserCompatItemReceiver + 77;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    public void launchIntentChooser(ArrayList<ResolveInfo> arrayList, String str) {
        int i = 2 % 2;
        ArrayList arrayList2 = new ArrayList();
        Iterator<ResolveInfo> it = arrayList.iterator();
        int i2 = AudioAttributesImplApi26Parcelizer + 45;
        MediaBrowserCompatItemReceiver = i2 % 128;
        while (true) {
            int i3 = i2 % 2;
            if (!it.hasNext()) {
                Intent intentCreateChooser = Intent.createChooser((Intent) arrayList2.remove(0), "Select app");
                intentCreateChooser.putExtra("android.intent.extra.INITIAL_INTENTS", (Parcelable[]) arrayList2.toArray(new Parcelable[0]));
                startActivity(intentCreateChooser);
                return;
            } else {
                ResolveInfo next = it.next();
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
                intent.setPackage(((PackageItemInfo) next.activityInfo).packageName);
                arrayList2.add(intent);
                i2 = MediaBrowserCompatItemReceiver + 107;
                AudioAttributesImplApi26Parcelizer = i2 % 128;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0036, code lost:
    
        if (isChromeInstalled(r2) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x003f, code lost:
    
        if (isChromeInstalled(r2) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        r1.read.setPackage("com.android.chrome");
        r1.read(r5, android.net.Uri.parse(r6));
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        r5 = in.juspay.hypersdk.core.CustomtabActivity.MediaBrowserCompatItemReceiver + 93;
        in.juspay.hypersdk.core.CustomtabActivity.AudioAttributesImplApi26Parcelizer = r5 % 128;
        r5 = r5 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0058, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0059, code lost:
    
        launchIntentChooser(r2, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005c, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void loadUrl(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            o.setTabContainer$RemoteActionCompatParcelizer r1 = new o.setTabContainer$RemoteActionCompatParcelizer
            r1.<init>()
            o.setTabContainer r1 = r1.write()
            android.content.Intent r2 = r1.read
            android.net.Uri r3 = android.net.Uri.parse(r6)
            r2.setData(r3)
            android.content.Context r2 = r5.getBaseContext()     // Catch: java.lang.Exception -> L6a
            java.util.ArrayList r2 = getCustomTabsPackages(r2, r6)     // Catch: java.lang.Exception -> L6a
            int r3 = r2.size()     // Catch: java.lang.Exception -> L6a
            if (r3 <= 0) goto L5d
            int r3 = in.juspay.hypersdk.core.CustomtabActivity.AudioAttributesImplApi26Parcelizer
            int r3 = r3 + 89
            int r4 = r3 % 128
            in.juspay.hypersdk.core.CustomtabActivity.MediaBrowserCompatItemReceiver = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L3b
            boolean r3 = isChromeInstalled(r2)     // Catch: java.lang.Exception -> L6a
            r4 = 42
            int r4 = r4 / 0
            if (r3 == 0) goto L59
            goto L41
        L39:
            r5 = move-exception
            throw r5
        L3b:
            boolean r3 = isChromeInstalled(r2)     // Catch: java.lang.Exception -> L6a
            if (r3 == 0) goto L59
        L41:
            android.content.Intent r2 = r1.read     // Catch: java.lang.Exception -> L6a
            java.lang.String r3 = "com.android.chrome"
            r2.setPackage(r3)     // Catch: java.lang.Exception -> L6a
            android.net.Uri r6 = android.net.Uri.parse(r6)     // Catch: java.lang.Exception -> L6a
            r1.read(r5, r6)     // Catch: java.lang.Exception -> L6a
            int r5 = in.juspay.hypersdk.core.CustomtabActivity.MediaBrowserCompatItemReceiver
            int r5 = r5 + 93
            int r6 = r5 % 128
            in.juspay.hypersdk.core.CustomtabActivity.AudioAttributesImplApi26Parcelizer = r6
            int r5 = r5 % r0
            return
        L59:
            r5.launchIntentChooser(r2, r6)     // Catch: java.lang.Exception -> L6a
            return
        L5d:
            r5.launchInBrowser(r6)     // Catch: java.lang.Exception -> L6a
            int r5 = in.juspay.hypersdk.core.CustomtabActivity.AudioAttributesImplApi26Parcelizer
            int r5 = r5 + 113
            int r6 = r5 % 128
            in.juspay.hypersdk.core.CustomtabActivity.MediaBrowserCompatItemReceiver = r6
            int r5 = r5 % r0
            return
        L6a:
            r5 = move-exception
            java.lang.String r6 = "CustomtabActivity"
            java.lang.String r0 = "Exception in customtab activity"
            in.juspay.hyper.core.JuspayLogger.e(r6, r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.CustomtabActivity.loadUrl(java.lang.String):void");
    }

    public static ArrayList<ResolveInfo> getCustomTabsPackages(Context context, String str) {
        int i = 2 % 2;
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> listQueryIntentActivities = packageManager.queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(str)), 131072);
        ArrayList<ResolveInfo> arrayList = new ArrayList<>();
        for (ResolveInfo resolveInfo : listQueryIntentActivities) {
            Intent intent = new Intent();
            intent.setAction("android.support.customtabs.action.CustomTabsService");
            intent.setPackage(((PackageItemInfo) resolveInfo.activityInfo).packageName);
            if (packageManager.resolveService(intent, 0) != null) {
                arrayList.add(resolveInfo);
                int i2 = AudioAttributesImplApi26Parcelizer + 29;
                MediaBrowserCompatItemReceiver = i2 % 128;
                int i3 = i2 % 2;
            }
        }
        int i4 = MediaBrowserCompatItemReceiver + 39;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return arrayList;
        }
        throw null;
    }

    private static void b(int i, char c, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i5 = $10 + 105;
            $11 = i5 % 128;
            int i6 = i5 % i3;
            int i7 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(read[i2 + i7])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 36620), 2340 - TextUtils.getOffsetAfter("", 0), 28 - KeyEvent.getDeadChar(0, 0), 480654850, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i7), Long.valueOf(AudioAttributesImplApi21Parcelizer), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 9701 - Color.alpha(0), View.combineMeasuredStates(0, 0) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i7] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    try {
                        Object[] objArr4 = {downloadService, downloadService};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) View.MeasureSpec.getMode(0), 23784 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                        i3 = 2;
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
        char[] cArr = new char[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i8 = $11 + 35;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr5 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 23784 - Color.alpha(0), (KeyEvent.getMaxKeyCode() >> 16) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    private static void a(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        char[] cArr2;
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr3 = RemoteActionCompatParcelizer;
        long j = 0;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            int i3 = $11 + 71;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 3 % 3;
            }
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (44862 - (ViewConfiguration.getEdgeSlop() >> 16)), 18945 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 29, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr4[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i5++;
                    int i6 = $10 + 119;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        Object[] objArr3 = {Integer.valueOf(write)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.green(0), 19034 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), View.resolveSizeAndState(0, 0, 0) + 75, 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        int i8 = -1593953308;
        if (AudioAttributesCompatParcelizer) {
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                int i9 = $11 + 35;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr3[bArr[notifydownloads.AudioAttributesCompatParcelizer >> notifydownloads.IconCompatParcelizer] * i] - iIntValue);
                    Object[] objArr4 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(i8);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), (ViewConfiguration.getTapTimeout() >> 16) + 11439, (ViewConfiguration.getEdgeSlop() >> 16) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } else {
                    cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr3[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                    Object[] objArr5 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 11439, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 13, -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
                i8 = -1593953308;
            }
            String str = new String(cArr5);
            int i10 = $10 + 115;
            $11 = i10 % 128;
            if (i10 % 2 != 0) {
                objArr[0] = str;
                return;
            } else {
                int i11 = 40 / 0;
                objArr[0] = str;
                return;
            }
        }
        if (!IconCompatParcelizer) {
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr3[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                notifydownloads.IconCompatParcelizer++;
            }
            objArr[0] = new String(cArr6);
            return;
        }
        int i12 = $11 + 69;
        $10 = i12 % 128;
        if (i12 % 2 != 0) {
            notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
            cArr2 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 1;
        } else {
            notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
            cArr2 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
        }
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            int i13 = $11 + 45;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr2[notifydownloads.IconCompatParcelizer] = (char) (cArr3[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
            Object[] objArr6 = {notifydownloads, notifydownloads};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1593953308);
            if (objRemoteActionCompatParcelizer5 == null) {
                objRemoteActionCompatParcelizer5 = startForeground.read((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 11438, (ViewConfiguration.getScrollBarSize() >> 8) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 85;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, new byte[]{-120, -120, -117, -118, -123, -124, -119, -121, -120, -123, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, new byte[]{-125, -122, -114, -115, -116}, null, null, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i4 = AudioAttributesImplApi26Parcelizer + 93;
                MediaBrowserCompatItemReceiver = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr4 = new Object[1];
                a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, new byte[]{-125, -127, -117, -124, -108, -109, -115, -111, -122, -110, -122, -111, -118, -112, -121, -113, -113, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                a((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 128, new byte[]{-126, -123, -122, -111, -127, -118, -122, -106, -113, -113, -112, -111, -126, -117, -124, -124, -107, -118}, null, null, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i6 = AudioAttributesImplApi26Parcelizer + 47;
                MediaBrowserCompatItemReceiver = i6 % 128;
                if (i6 % 2 != 0) {
                    boolean z = baseContext instanceof ContextWrapper;
                    throw null;
                }
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i7 = MediaBrowserCompatItemReceiver + 43;
                AudioAttributesImplApi26Parcelizer = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 4535), 6055 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), Color.red(0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b(View.MeasureSpec.getMode(0) + 48, (char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.indexOf("", "", 0, 0), objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 15, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 18009), 48 - (ViewConfiguration.getFadingEdgeLength() >> 16), objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 54, (char) (21881 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 102, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) + 91, new byte[]{-120, -111, -126, -117, -110, -117, -104, -101, -110, -104, -111, -120, -117, -103, -126, -122, -104, -122, -113, -127, -104, -116, -123, -118, -121, -117, -124, -127, -107, -102, -120, -125, -124, -127, -107, -103, -121, -111, -120, -127, -118, -111, -127, -117, -124, -108, -111, -121, -120, -125, -126, -107, -123, -124, -115, -106, -122, -127, -125, -104, -104, -105, -120, -113, -111, -111, -108}, null, null, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a(127 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new byte[]{-101, -121, -98, -99, -121, -100}, null, null, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(3) + 27, new byte[]{-95, -95, -127, -99, -92, -118, -117, -96, -101, -127, -96, -92, -94, -91, -101, -97, -100, -94, -96, -98, -95, -98, -94, -92, -93, -92, -93, -94, -99, -99, -101, -95, -96, -97, -99, -101}, null, null, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getEdgeSlop() >> 16), 6030 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), KeyEvent.getDeadChar(0, 0) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer3 == null) {
            char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 13183);
            int i9 = 1650 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            int i10 = 25 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            byte[] bArr = $$a;
            byte b = bArr[5];
            Object[] objArr13 = new Object[1];
            c(b, (byte) (-bArr[62]), b, objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(absoluteGravity, i9, i10, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i11 = MediaBrowserCompatItemReceiver + 9;
            AudioAttributesImplApi26Parcelizer = i11 % 128;
            int i12 = i11 % 2;
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 13183);
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1649;
                int maximumDrawingCacheSize = 26 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                Object[] objArr14 = new Object[1];
                c(r2[30], (byte) (-$$a[9]), r2[27], objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(pressedStateDuration, maxKeyCode, maximumDrawingCacheSize, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            b(16 - KeyEvent.normalizeMetaState(0), (char) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 141, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 6, (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 4405), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 157, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i13 = AudioAttributesImplApi26Parcelizer + 75;
            MediaBrowserCompatItemReceiver = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, -350144828};
                byte[] bArr2 = $$d;
                byte b2 = bArr2[44];
                byte b3 = b2;
                Object[] objArr18 = new Object[1];
                d(b2, b3, (byte) (b3 | 26), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                d((byte) (bArr2[54] + 1), bArr2[50], bArr2[44], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char absoluteGravity2 = (char) (Gravity.getAbsoluteGravity(0, 0) + 13183);
                    int iAlpha = Color.alpha(0) + 1649;
                    int trimmedLength = TextUtils.getTrimmedLength("") + 26;
                    Object[] objArr20 = new Object[1];
                    c(r7[30], (byte) (-$$a[9]), r7[27], objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(absoluteGravity2, iAlpha, trimmedLength, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 97, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 207 - ((byte) KeyEvent.getModifierMetaStateMask()), objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    a(127 - KeyEvent.keyCodeFromString(""), new byte[]{-117, -116, -122, -111, -106, -127, -117, -90, -125, -117, -120, -113, -127, -106, -117}, null, null, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 13183);
                        int scrollBarSize = 1649 - (ViewConfiguration.getScrollBarSize() >> 8);
                        int windowTouchSlop = 26 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        Object[] objArr23 = new Object[1];
                        c(r9[30], (byte) (-$$a[9]), (short) 76, objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(longPressTimeout, scrollBarSize, windowTouchSlop, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13184);
                        int absoluteGravity3 = 1649 - Gravity.getAbsoluteGravity(0, 0);
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 27;
                        byte[] bArr3 = $$a;
                        byte b4 = bArr3[5];
                        Object[] objArr24 = new Object[1];
                        c(b4, (byte) (-bArr3[62]), b4, objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(cIndexOf, absoluteGravity3, iLastIndexOf, -133433128, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i15 = ((int[]) objArr[3])[0];
        int i16 = ((int[]) objArr[2])[0];
        if (i16 != i15) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i16 ^ i15)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4535 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 6053 - TextUtils.lastIndexOf("", '0'), 41 - Process.getGidForName(""), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {-681132480, Long.valueOf(j3), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (KeyEvent.getMaxKeyCode() >> 16), 6030 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), AndroidCharacter.getMirror('0') - 24);
                byte[] bArr4 = $$d;
                Object[] objArr26 = new Object[1];
                d((byte) (bArr4[22] + 1), (byte) (bArr4[24] - 1), bArr4[8], objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        if (getIntent() == null) {
            finish();
            return;
        }
        Uri data = getIntent().getData();
        if (data != null && data.getHost() != null) {
            finish();
            return;
        }
        Bundle extras = getIntent().getExtras();
        String string = extras == null ? null : extras.getString("url");
        if (string == null) {
            finish();
            return;
        }
        int i17 = AudioAttributesImplApi26Parcelizer + 121;
        MediaBrowserCompatItemReceiver = i17 % 128;
        if (i17 % 2 == 0) {
            loadUrl(string);
        } else {
            loadUrl(string);
            throw null;
        }
    }

    @Override // android.app.Activity
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = MediaBrowserCompatItemReceiver + 1;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, new byte[]{-125, -127, -117, -124, -108, -109, -115, -111, -122, -110, -122, -111, -118, -112, -121, -113, -113, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 126, new byte[]{-126, -123, -122, -111, -127, -118, -122, -106, -113, -113, -112, -111, -126, -117, -124, -124, -107, -118}, null, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (Color.red(0) + 4535), 6054 - KeyEvent.keyCodeFromString(""), 42 - TextUtils.getCapsMode("", 0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 6030, 24 - View.MeasureSpec.makeMeasureSpec(0, 0), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i4 = AudioAttributesImplApi26Parcelizer + 17;
                MediaBrowserCompatItemReceiver = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
        if (this.isFirstResume.booleanValue()) {
            this.isFirstResume = Boolean.FALSE;
            int i6 = MediaBrowserCompatItemReceiver + 79;
            AudioAttributesImplApi26Parcelizer = i6 % 128;
            int i7 = i6 % 2;
            return;
        }
        Intent intent = new Intent("customtab-result");
        intent.putExtra("status", "CANCELLED");
        getProvider.getInstance(this).AudioAttributesCompatParcelizer(intent);
        finish();
    }

    @Override // android.app.Activity
    protected void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 125;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 123, new byte[]{-125, -127, -117, -124, -108, -109, -115, -111, -122, -110, -122, -111, -118, -112, -121, -113, -113, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 126, new byte[]{-126, -123, -122, -111, -127, -118, -122, -106, -113, -113, -112, -111, -126, -117, -124, -124, -107, -118}, null, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i3 = AudioAttributesImplApi26Parcelizer + 89;
            MediaBrowserCompatItemReceiver = i3 % 128;
            int i4 = i3 % 2;
        }
        if (baseContext != null) {
            int i5 = MediaBrowserCompatItemReceiver + 7;
            AudioAttributesImplApi26Parcelizer = i5 % 128;
            int i6 = i5 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i7 = MediaBrowserCompatItemReceiver + 57;
            AudioAttributesImplApi26Parcelizer = i7 % 128;
            try {
                if (i7 % 2 == 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - KeyEvent.keyCodeFromString("")), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6053, (ViewConfiguration.getWindowTouchSlop() >> 8) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), KeyEvent.keyCodeFromString("") + 6030, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24, -861814097, false, "read", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    int i8 = 14 / 0;
                } else {
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (4535 - View.resolveSizeAndState(0, 0, 0)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6053, (ViewConfiguration.getPressedStateDuration() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 6031 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23, -861814097, false, "read", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke2, objArr4);
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
    }

    /* JADX WARN: Removed duplicated region for block: B:182:0x0b63 A[Catch: all -> 0x032b, TryCatch #4 {all -> 0x032b, blocks: (B:77:0x0471, B:79:0x0477, B:80:0x049e, B:213:0x0fbd, B:215:0x0fc3, B:216:0x0fed, B:249:0x1408, B:251:0x140e, B:252:0x1438, B:230:0x11c5, B:232:0x11e6, B:233:0x1238, B:180:0x0b5d, B:182:0x0b63, B:183:0x0b8d, B:28:0x00f8, B:30:0x00fe, B:31:0x012a, B:33:0x029f, B:35:0x02cf, B:36:0x0325, B:42:0x033b, B:44:0x033f, B:48:0x034b, B:63:0x041d, B:65:0x0423, B:66:0x0424, B:68:0x0426, B:70:0x042d, B:71:0x042e), top: B:282:0x00f8, inners: #7 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00b2  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5486
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: in.juspay.hypersdk.core.CustomtabActivity.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 29;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatItemReceiver + 77;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }
}
