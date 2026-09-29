package kotlin;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014JM\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0005\u001a\u00020\u00042\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J;\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u000f2\b\u0010\t\u001a\u0004\u0018\u00010\u00062\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\bH\u0016¢\u0006\u0004\b\u001a\u0010\u001b"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda53;", "Landroid/content/ContentProvider;", "<init>", "()V", "Landroid/net/Uri;", "p0", "", "p1", "", "p2", "", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "getType", "(Landroid/net/Uri;)Ljava/lang/String;", "Landroid/content/ContentValues;", "insert", "(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;", "", "onCreate", "()Z", "p3", "p4", "Landroid/database/Cursor;", SearchIntents.EXTRA_QUERY, "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "RemoteActionCompatParcelizer"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda53 extends ContentProvider {
    private static char AudioAttributesCompatParcelizer;
    private static char AudioAttributesImplApi21Parcelizer;
    private static long IconCompatParcelizer;
    private static int MediaBrowserCompatCustomActionResultReceiver;
    private static char MediaBrowserCompatItemReceiver;
    private static char[] read;
    private static char write;
    private static final byte[] $$a = {14, -10, 42, -103};
    private static final int $$b = 153;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int MediaDescriptionCompat = 1;
    private static int AudioAttributesImplApi26Parcelizer = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r6, short r7, int r8) {
        /*
            int r8 = r8 * 3
            int r8 = 4 - r8
            int r7 = r7 * 21
            int r7 = r7 + 101
            byte[] r0 = kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda53.$$a
            int r6 = r6 * 4
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r7 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2d:
            int r3 = -r3
            int r8 = r8 + 1
            int r7 = r7 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DefaultAnalyticsCollectorExternalSyntheticLambda53.$$c(byte, short, int):java.lang.String");
    }

    static {
        MediaBrowserCompatCustomActionResultReceiver = 0;
        RemoteActionCompatParcelizer();
        INSTANCE = new Companion(null);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer("FacebookInitProvider", "");
        int i = AudioAttributesImplApi26Parcelizer + 7;
        MediaBrowserCompatCustomActionResultReceiver = i % 128;
        int i2 = i % 2;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() throws Throwable {
        int i = 2 % 2;
        Object[] objArr = new Object[1];
        a((char) View.MeasureSpec.makeMeasureSpec(0, 0), (-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.getCapsMode("", 0, 0) + 18, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        a((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 53744), 17 - Process.getGidForName(""), 5 - TextUtils.indexOf("", "", 0, 0), objArr2);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Object[] objArr3 = new Object[1];
            b((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 25, new char[]{21639, 19231, 39250, 61754, 54752, 34332, 55280, 16252, 29408, 30023, 62637, 54868, 45329, 49805, 10865, 52275, 50794, 58865, 55976, 16310, 26523, 60633, 19781, 38056, 53945, 42438}, objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 17, new char[]{30061, 58162, 2298, 37551, 53633, 29015, 43993, 18260, 54096, 53217, 1136, 29894, 25433, 33354, 10865, 52275, 14972, 12500}, objArr4);
            Context applicationContext = (Context) cls2.getMethod((String) objArr4[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                if (!(applicationContext instanceof ContextWrapper) || ((ContextWrapper) applicationContext).getBaseContext() != null) {
                    applicationContext = applicationContext.getApplicationContext();
                } else {
                    int i2 = MediaDescriptionCompat + 99;
                    AudioAttributesImplBaseParcelizer = i2 % 128;
                    int i3 = i2 % 2;
                    applicationContext = null;
                }
            }
            if (applicationContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (Drawable.resolveOpacity(0, 0) + 4535), View.getDefaultSize(0, 0) + 6054, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    b(TextUtils.getTrimmedLength("") + 48, new char[]{56128, 39418, 60112, 57700, 47343, 54198, 5487, 52710, 63459, 39574, 53191, 10430, 34639, 15464, 59200, 34027, 11952, 57468, 232, 803, 13866, 21478, 853, 30122, 62502, 22320, 9990, 36359, 37239, 51630, 5270, 61816, 36931, 54624, 50200, 11388, 28747, 22469, 10446, 3862, 63752, 3132, 52750, 28643, 41696, 15787, 3545, 61497}, objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    a((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 24 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 64 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    a((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 87 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 65, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    a((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 32120), 151 - Drawable.resolveOpacity(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 67, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b(6 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), new char[]{58917, 61776, 23085, 40886, 30290, 46686}, objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a((char) (ViewConfiguration.getJumpTapTimeout() >> 16), KeyEvent.normalizeMetaState(0) + 218, 35 - TextUtils.lastIndexOf("", '0'), objArr10);
                    Object[] objArr11 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr10[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 6031 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 24 - Color.green(0), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr11);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
        try {
            lambdaonMediaMetadataChanged48.RemoteActionCompatParcelizer(getContext());
            int i4 = MediaDescriptionCompat + 115;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            int i5 = i4 % 2;
        } catch (Exception e) {
        }
        return false;
    }

    private static void a(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i4 = $10 + 77;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(read[i + i6])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (36621 - Color.red(0)), 2340 - View.combineMeasuredStates(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0) + 28, 480654850, false, $$c(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(IconCompatParcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.red(0), 9700 - TextUtils.lastIndexOf("", '0', 0, 0), 26 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) Color.green(0), View.getDefaultSize(0, 0) + 23784, 33 - TextUtils.indexOf("", "", 0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
        char[] cArr = new char[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i7 = $11 + 23;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[downloadService.write] = (char) jArr[downloadService.write];
                Object[] objArr5 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) TextUtils.indexOf("", "", 0, 0), ExpandableListView.getPackedPositionChild(0L) + 23785, (Process.myTid() >> 22) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                obj.hashCode();
                throw null;
            }
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr6 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer5 == null) {
                objRemoteActionCompatParcelizer5 = startForeground.read((char) TextUtils.indexOf("", "", 0), 23784 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr);
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        while (isstopped.read < cArr.length) {
            cArr3[0] = cArr[isstopped.read];
            cArr3[1] = cArr[isstopped.read + 1];
            int i3 = $11 + 89;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = 58224;
            int i6 = 0;
            while (i6 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i5) ^ ((c2 << 4) + ((char) (((long) MediaBrowserCompatItemReceiver) ^ 1193402106669854891L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(AudioAttributesImplApi21Parcelizer)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b + 1);
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getTapTimeout() >> 16), View.resolveSize(0, 0) + 1504, 21 - View.MeasureSpec.makeMeasureSpec(0, 0), 1322448859, false, $$c(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) write) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(AudioAttributesCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 + 1);
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), ((byte) KeyEvent.getModifierMetaStateMask()) + 1505, 21 - Gravity.getAbsoluteGravity(0, 0), 1322448859, false, $$c(b3, b4, (byte) (b4 - 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i5 -= 40503;
                    i6++;
                    int i7 = $11 + 87;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
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
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 9017 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 58, -1950993821, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // android.content.ContentProvider
    public final int delete(Uri p0, String p1, String[] p2) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 99;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        int i4 = AudioAttributesImplBaseParcelizer + 97;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return 0;
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri p0) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 41;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        if (i3 == 0) {
            throw null;
        }
        int i4 = MediaDescriptionCompat + 13;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // android.content.ContentProvider
    public final Uri insert(Uri p0, ContentValues p1) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 17;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        int i4 = AudioAttributesImplBaseParcelizer + 7;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // android.content.ContentProvider
    public final Cursor query(Uri p0, String[] p1, String p2, String[] p3, String p4) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 25;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        if (i3 != 0) {
            return null;
        }
        throw null;
    }

    @Override // android.content.ContentProvider
    public final int update(Uri p0, ContentValues p1, String p2, String[] p3) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 47;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        return i3 == 0 ? 1 : 0;
    }

    static void RemoteActionCompatParcelizer() {
        read = new char[]{56429, 64069, 36902, 44555, 17663, 25254, 14466, 55091, 60763, 35616, 41380, 32753, 5546, 13208, 51789, 57376, 48655, 21736, 3473, 11170, 16871, 32736, 38148, 56380, 64072, 36897, 44617, 17575, 25262, 14545, 55083, 60673, 35684, 41454, 32707, 5608, 13254, 51786, 57459, 48669, 21758, 29395, 2256, 10038, 64775, 39778, 45492, 20422, 26098, 971, 55841, 61553, 36432, 42156, 17029, 6364, 14143, 52544, 60266, 33046, 24477, 30197, 5069, 10796, 49156, 40456, 46309, 21212, 26801, 1855, 56641, 64364, 37186, 44967, 17913, 25553, 14886, 53250, 61016, 33980, 41669, 30911, 5778, 11549, 52002, 57677, 49058, 56430, 64026, 36899, 44573, 17569, 25341, 14469, 55077, 60752, 35639, 41407, 32656, 5600, 13206, 51786, 57377, 48708, 21754, 29392, 2264, 10034, 64782, 39781, 45503, 20381, 26022, 926, 55848, 61563, 36433, 42159, 17037, 6360, 14186, 52501, 60220, 33041, 24522, 30197, 5019, 10789, 49153, 40463, 46257, 21211, 26853, 1854, 56644, 64361, 37151, 45044, 17832, 25553, 14889, 53253, 60942, 33973, 41665, 30959, 5779, 11550, 52080, 57672, 49069, 41245, 34598, 60751, 54128, 14746, 8076, 17840, 43595, 36905, 63051, 56474, 692, 26840, 20220, 46904, 40265, 50027, 10630, 4024, 30142, 23053, 32814, 58973, 52369, 12988, 6350, 32480, 42761, 36162, 62314, 55753, 16299, 26080, 18963, 45097, 38468, 64634, 8871, 2250, 28389, 22303, 48431, 58173, 51611, 12206, 5571, 31320, 41021, 34389, 60523, 53956, 14553, 7927, 18177, 44330, 37735, 63881, 57333, 1493, 27578, 20606, 46683, 40049, 49801, 10459, 3814, 30472, 56382, 64026, 36896, 44622, 17574, 25341, 14551, 55084, 60697, 35691, 41452, 32665, 5566, 13274, 51738, 57459, 48712, 21676, 29343, 2256, 10082, 64781, 39782, 45472, 20418, 26100, 923, 55843, 61567, 36354, 42237, 17107, 6365, 14186, 52500, 60271};
        IconCompatParcelizer = 8535514226759891499L;
        write = (char) 36156;
        AudioAttributesCompatParcelizer = (char) 8470;
        MediaBrowserCompatItemReceiver = (char) 20201;
        AudioAttributesImplApi21Parcelizer = (char) 21787;
    }
}
