package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.setAllowableAccountsTypes;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/getOriginalPriority;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lo/parseEventStream;", "IconCompatParcelizer", "Lo/parseEventStream;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getOriginalPriority extends getMessageId {
    private static char[] AudioAttributesCompatParcelizer;
    private static char AudioAttributesImplBaseParcelizer;
    private static int MediaBrowserCompatCustomActionResultReceiver;
    private static int MediaBrowserCompatItemReceiver;
    private static long RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char write;
    private parseEventStream IconCompatParcelizer;
    private static final byte[] $$l = {8, -19, -66, -33};
    private static final int $$m = 63;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {67, -110, -113, 74, -61, 61, 2, 19, -46, TarConstants.LF_LINK, -7, 25, -81, 33, 56, -13, 9, 10, -42, TarConstants.LF_CONTIG, 4, 2, -5, -3, 23, 3, -11, 18, -38, 40, 7, 0, -38, 35, 22, -10, -17, 21, 21, -11, 6, 11, 1, 21, -17, 17, -1, -5, 15, -11, 23, 12, 6, 9, -11, -32, 38, 21, -7, 10, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, -61, 80, 4, -18, 16};
    private static final int $$k = 76;
    private static final byte[] $$d = {26, 47, -113, 59, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 66;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int RatingCompat = 1;
    private static int AudioAttributesImplApi21Parcelizer = 0;

    private static String $$n(int i, byte b, byte b2) {
        int i2 = 103 - (i * 4);
        int i3 = b + 4;
        byte[] bArr = $$l;
        int i4 = b2 * 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i2 = i4 + i3;
            i3 = i3;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i3 + 1;
            i2 += bArr[i7];
            i3 = i7;
            i5 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.getOriginalPriority.$$d
            int r8 = 44 - r8
            int r7 = 114 - r7
            int r6 = r6 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r7 = r6
            r4 = r8
            r3 = r2
            goto L26
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L26:
            int r6 = r6 + r4
            int r6 = r6 + (-1)
            int r7 = r7 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getOriginalPriority.g(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 76 - r8
            int r6 = 119 - r6
            byte[] r0 = kotlin.getOriginalPriority.$$j
            int r1 = r7 + 5
            byte[] r1 = new byte[r1]
            int r7 = r7 + 4
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r6 = r8
            r3 = r2
            goto L2a
        L13:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r0[r6]
        L2a:
            int r8 = r8 + r4
            int r8 = r8 + (-4)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getOriginalPriority.h(short, int, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.getOriginalPriority$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/getOriginalPriority$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "IconCompatParcelizer", "(Landroid/content/Context;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent IconCompatParcelizer(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new Intent(p0, (Class<?>) getOriginalPriority.class);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
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
        int i3 = $11 + 17;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 22748 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 36, 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 31369), 2721 - TextUtils.getOffsetAfter("", 0), Color.red(0) + 38, 1895162189, false, $$n(b, b2, (byte) (b2 + 1)), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), Color.argb(0, 0, 0, 0) + 15713, 64 - (ViewConfiguration.getTapTimeout() >> 16), -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (40976 - (ViewConfiguration.getPressedStateDuration() >> 16)), 6122 - TextUtils.getCapsMode("", 0, 0), 29 - (ViewConfiguration.getWindowTouchSlop() >> 8), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (RemoteActionCompatParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) AudioAttributesImplBaseParcelizer) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                int i5 = $10 + 21;
                $11 = i5 % 128;
                if (i5 % 2 == 0) {
                    int i6 = 2 / 5;
                }
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

    @Override // kotlin.getMessageId, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        char c;
        char c2;
        parseEventStream parseeventstream;
        parseEventStream parseeventstream2;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 17, new char[]{'+', '\'', 20, '\t', 14, 1, 23, '%', 16, '\b', '!', 16, '\b', 20, ' ', ')', 13813, 13813}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 8), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 31, new char[]{27, 6, 14, 3, 13884}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) + 13), objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 10, new char[]{'+', '\'', 20, '\t', 14, 1, 23, '%', '*', '\'', '%', 28, 27, 30, '#', 2, 7, 3, ')', ',', 3, '\"', 11, ')', ',', 18}, (byte) (100 - View.getDefaultSize(0, 0)), objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                f((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 51388), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, new char[]{53731, 57834, 7238, 5071, 30791, 36710, 9851, 61389, 9830, 33975, 24241, 9289, 25749, 29348, 7844, 238, 5660, 19575}, new char[]{3153, 10123, 49243, 59080}, new char[]{0, 0, 0, 0}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - TextUtils.indexOf("", "", 0)), 6053 - MotionEvent.axisFromString(""), 41 - ((byte) KeyEvent.getModifierMetaStateMask()), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    e(Color.red(0) + 48, new char[]{' ', 6, 28, 22, 30, 20, '/', '+', '0', '\"', '\f', '\'', '#', 25, 18, 2, ' ', '$', 28, 30, 18, '.', 26, '#', 27, 22, '\'', '0', '\n', '\'', 22, 31, '&', 25, 25, ')', '0', 28, '.', 14, 18, '\t', '\'', 5, '!', '/', 25, '#'}, (byte) ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2), objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    f((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10), (-1) - Process.getGidForName(""), new char[]{65041, 17595, 46947, 5841, 40741, 19739, 30430, 34864, 32524, 58048, 50677, 40974, 61610, 56004, 26003, 61389, 14637, 7252, 2476, 9164, 10882, 26653, 48623, 37143, 26307, 62101, 53834, 59233, 28187, 54159, 33482, 2476, 50589, 63466, 40187, 46248, 12937, 60001, 19980, 18989, 44758, 43769, 46806, 17785, 34648, 25204, 51933, 1077, 16110, 37929, 50882, 28888, 57108, 34210, 49714, 52845, 29952, 20443, 35851, 33148, 12820, 40114, 33432, 16711}, new char[]{35320, 22361, 21398, 39131}, new char[]{0, 0, 0, 0}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    f((char) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 4, new char[]{62021, 30855, 30312, 7991, 42794, 55979, 57632, 4503, 19806, 12883, 21052, 15406, 37305, 28179, 19334, 42802, 4667, 65013, 37746, 35354, 39529, 34937, 37985, 32778, 46306, 60088, 55252, 29049, 23994, 46142, 51220, 22107, 5424, 8250, 34685, 61552, 17564, 43714, 17123, 15317, 63789, 64089, 35021, 21678, 45928, 43256, 41831, 11879, 13323, 3069, 25255, 8748, 58354, 30337, 62830, 10263, 57215, 50071, 19548, 17955, 34589, 61984, 55584, 11208}, new char[]{31286, 61069, 27651, 60172}, new char[]{0, 0, 0, 0}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 44, new char[]{30, '&', '&', '$', '\b', 2, 13754, 13754, 18, ',', 7, 21, 6, 20, 14, 29, '%', 15, 16, '%', '&', 30, 11, ')', ',', '\'', ' ', '0', 16, ',', 28, '\t', ' ', '*', '\t', 20, '\f', 30, ' ', '*', 11, ')', 31, 28, 16, 14, 4, '-', '*', 7, 4, 1, '#', '\b', '%', 11, '&', 2, 17, 31, 4, '&', 11, '&', '%', '&', 13806}, (byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 4), objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 16155), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, new char[]{25176, 53409, 48292, 25467, 54692, 1207}, new char[]{3357, 23462, 15930, 27455}, new char[]{0, 0, 0, 0}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    e((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 35, new char[]{31, '-', '.', 14, 21, 25, 13795, 13795, 19, '!', 22, 27, 26, 7, '0', '\"', '\'', 20, 19, '/', '-', 21, '!', '\b', 25, 14, '-', 25, 25, '.', 28, 27, '\'', '-', 13796, 13796}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 52), objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Color.alpha(0) + 6030, 24 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
                    int i2 = AudioAttributesImplApi26Parcelizer + 125;
                    RatingCompat = i2 % 128;
                    int i3 = i2 % 2;
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
            char defaultSize = (char) (View.getDefaultSize(0, 0) + 13183);
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1649;
            int i4 = 27 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            byte b = $$d[5];
            Object[] objArr13 = new Object[1];
            g(b, r0[62], b, objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(defaultSize, doubleTapTimeout, i4, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cMyPid = (char) (13183 - (Process.myPid() >> 22));
                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 1649;
                int iIndexOf = TextUtils.indexOf("", "") + 26;
                byte[] bArr = $$d;
                Object[] objArr14 = new Object[1];
                g((short) (-bArr[27]), bArr[9], (byte) (-bArr[30]), objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(cMyPid, threadPriority, iIndexOf, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
            c2 = 3;
            c = 2;
        } else {
            Object[] objArr15 = new Object[1];
            f((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 35495), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4, new char[]{51122, 17165, 15449, 11238, 49139, 26936, 8051, 44131, 34642, 52258, 31836, 55623, 62066, 59143, 55050, 1910}, new char[]{5261, 42417, 44013, 62090}, new char[]{0, 0, 0, 0}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            f((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 7718), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{20973, 32591, 30607, 64496, 562, 44590, 49931, 26726, 59515, 64268, 10173, 53864, 44982, 36547, 4808, 48505}, new char[]{3072, 55631, 9502, 45342}, new char[]{0, 0, 0, 0}, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i5 = RatingCompat + 103;
            AudioAttributesImplApi26Parcelizer = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, -1274927853};
                int i7 = $$k;
                byte[] bArr2 = $$j;
                Object[] objArr18 = new Object[1];
                h((byte) (i7 & 58), bArr2[56], (byte) (i7 - 3), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b2 = bArr2[31];
                byte b3 = b2;
                Object[] objArr19 = new Object[1];
                h(b2, b3, (byte) (b3 | 31), objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char cLastIndexOf = (char) (13182 - TextUtils.lastIndexOf("", '0', 0));
                    int i8 = 1649 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int maxKeyCode = 26 - (KeyEvent.getMaxKeyCode() >> 16);
                    byte[] bArr3 = $$d;
                    Object[] objArr20 = new Object[1];
                    g((short) (-bArr3[27]), bArr3[9], (byte) (-bArr3[30]), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(cLastIndexOf, i8, maxKeyCode, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    e((ViewConfiguration.getDoubleTapTimeout() >> 16) + 22, new char[]{'+', '\'', 20, '\t', 14, 1, 23, '%', 16, '\b', 31, ',', ',', '\r', '&', '(', 16, 6, 15, 16, 28, '!'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 29), objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, new char[]{'#', 18, '*', '\'', 11, '%', 15, '\t', '.', 4, 16, '#', 6, 14, 13824}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 9), objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char fadingEdgeLength = (char) (13183 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                        int mode = View.MeasureSpec.getMode(0) + 1649;
                        int i9 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 25;
                        Object[] objArr23 = new Object[1];
                        g((short) 76, r12[9], (byte) (-$$d[30]), objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(fadingEdgeLength, mode, i9, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char bitsPerPixel = (char) (13182 - ImageFormat.getBitsPerPixel(0));
                        int i10 = (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1649;
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 26;
                        byte b4 = $$d[5];
                        Object[] objArr24 = new Object[1];
                        g(b4, r3[62], b4, objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(bitsPerPixel, i10, deadChar, -133433128, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf2);
                    int i11 = AudioAttributesImplApi26Parcelizer + 103;
                    RatingCompat = i11 % 128;
                    c = 2;
                    if (i11 % 2 == 0) {
                        int i12 = 2 % 4;
                    }
                    c2 = 3;
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
        int i13 = ((int[]) objArr[c2])[0];
        int i14 = ((int[]) objArr[c])[0];
        if (i14 != i13) {
            long j = -1;
            long j2 = ((long) (i14 ^ i13)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4535), View.MeasureSpec.makeMeasureSpec(0, 0) + 6054, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            parseeventstream = null;
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {-1887199153, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) Color.argb(0, 0, 0, 0), TextUtils.indexOf((CharSequence) "", '0', 0) + 6031, 24 - View.MeasureSpec.getSize(0));
                byte[] bArr4 = $$j;
                byte b5 = (byte) (bArr4[56] - 1);
                byte b6 = bArr4[24];
                Object[] objArr26 = new Object[1];
                h(b5, b6, (byte) (b6 + 4), objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        } else {
            parseeventstream = null;
        }
        CmcdConfigurationRequestConfig.write(this, null, 0, 0, false, 15);
        super.onCreate(p0);
        parseEventStream parseeventstreamIconCompatParcelizer = parseEventStream.IconCompatParcelizer(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parseeventstreamIconCompatParcelizer, "");
        this.IconCompatParcelizer = parseeventstreamIconCompatParcelizer;
        if (parseeventstreamIconCompatParcelizer == null) {
            int i15 = RatingCompat + 81;
            AudioAttributesImplApi26Parcelizer = i15 % 128;
            int i16 = i15 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            parseeventstream2 = parseeventstream;
        } else {
            parseeventstream2 = parseeventstreamIconCompatParcelizer;
        }
        setContentView(parseeventstream2.IconCompatParcelizer());
        if (p0 == null) {
            setAllowableAccountsTypes.Companion companion = setAllowableAccountsTypes.INSTANCE;
            CmcdConfigurationRequestConfig.write(this, R.id.container, setAllowableAccountsTypes.Companion.write());
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0130  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(int r31, char[] r32, byte r33, java.lang.Object[] r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 796
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getOriginalPriority.e(int, char[], byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ca  */
    @Override // kotlin.getMessageId, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getOriginalPriority.onResume():void");
    }

    @Override // kotlin.getMessageId, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = AudioAttributesImplApi26Parcelizer + 25;
            RatingCompat = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 9, new char[]{'+', '\'', 20, '\t', 14, 1, 23, '%', '*', '\'', '%', 28, 27, 30, '#', 2, 7, 3, ')', ',', 3, '\"', 11, ')', ',', 18}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) + 1), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f((char) (ImageFormat.getBitsPerPixel(0) + 51393), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 111, new char[]{53731, 57834, 7238, 5071, 30791, 36710, 9851, 61389, 9830, 33975, 24241, 9289, 25749, 29348, 7844, 238, 5660, 19575}, new char[]{3153, 10123, 49243, 59080}, new char[]{0, 0, 0, 0}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = AudioAttributesImplApi26Parcelizer + 43;
            RatingCompat = i4 % 128;
            int i5 = i4 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 4535), 6054 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getLongPressTimeout() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.normalizeMetaState(0), 6030 - (KeyEvent.getMaxKeyCode() >> 16), 24 - (ViewConfiguration.getScrollBarSize() >> 8), -861814097, false, "read", new Class[]{Context.class});
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
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0a50 A[Catch: all -> 0x0426, TryCatch #3 {all -> 0x0426, blocks: (B:206:0x1134, B:208:0x113a, B:209:0x1167, B:241:0x15d3, B:243:0x15d9, B:244:0x1602, B:222:0x1363, B:224:0x1386, B:225:0x13d9, B:173:0x0c8e, B:175:0x0c94, B:176:0x0cc0, B:129:0x0a4a, B:131:0x0a50, B:132:0x0a7b, B:22:0x0117, B:24:0x011d, B:25:0x0144, B:27:0x0393, B:29:0x03c5, B:30:0x0420), top: B:271:0x0117 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x042a  */
    @Override // kotlin.getMessageId, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6591
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getOriginalPriority.attachBaseContext(android.content.Context):void");
    }

    static {
        MediaBrowserCompatItemReceiver = 1;
        MediaBrowserCompatCustomActionResultReceiver();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplApi21Parcelizer + 19;
        MediaBrowserCompatItemReceiver = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.getMessageId, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = RatingCompat + 27;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = AudioAttributesImplApi26Parcelizer + 47;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static void MediaBrowserCompatCustomActionResultReceiver() {
        AudioAttributesCompatParcelizer = new char[]{6465, 6418, 6507, 6407, 6429, 6835, 6524, 6479, 6522, 6491, 6494, 6427, 6405, 6490, 6468, 6471, 6476, 6525, 6431, 6520, 6469, 6478, 6832, 6505, 6426, 6838, 6416, 6430, 6493, 6424, 6406, 6464, 6467, 6489, 6475, 6488, 6470, 6492, 6425, 6477, 6417, 6428, 6474, 6472, 6833, 6523, 6473, 6834, 6481};
        write = (char) 11445;
        RemoteActionCompatParcelizer = -3498762522182953692L;
        MediaBrowserCompatCustomActionResultReceiver = -136981212;
        AudioAttributesImplBaseParcelizer = (char) 31092;
    }
}
