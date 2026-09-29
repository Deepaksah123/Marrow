package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.ProcessUtils;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/isAtLeastV;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class isAtLeastV extends isAtLeastT {
    private static int AudioAttributesCompatParcelizer;
    private static int AudioAttributesImplApi26Parcelizer;
    private static short[] AudioAttributesImplBaseParcelizer;
    private static int IconCompatParcelizer;
    private static byte[] MediaBrowserCompatItemReceiver;
    private static int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int write;
    private static final byte[] $$l = {18, -64, -35, -97};
    private static final int $$m = 61;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {TarConstants.LF_SYMLINK, -51, -30, -2, -68, TarConstants.LF_FIFO, -5, 12, -37, 12, 16, -14, 2, -10, -16, -7, 0, 16, 5, -1, 2, -18, -39, 31, 14, -14, 3, -4, -46, 41, -5, 0, -18, 16, -39, 14, 14, -18, -1, 4, -6, 14, -24, 10, 9, -5, -66, TarConstants.LF_FIFO, 5, -3, -11, 2, -10, -58, TarConstants.LF_NORMAL, 10, -13, 11, -6, -9, -8, -57, TarConstants.LF_FIFO, 3, 3, -72, TarConstants.LF_SYMLINK, 9, -5, -3, -1, -4, -67, 68, -4, -14, 0, -65, 73, -3, -28};
    private static final int $$k = 183;
    private static final byte[] $$d = {104, 100, TarConstants.LF_GNUTYPE_SPARSE, -75, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 31;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int RatingCompat = 1;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(byte r6, byte r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r6 = 112 - r6
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r8 = r8 * 2
            int r0 = 1 - r8
            byte[] r1 = kotlin.isAtLeastV.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            int r8 = 0 - r8
            if (r1 != 0) goto L18
            r3 = r7
            r4 = r2
            goto L2d
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r6 = -r6
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isAtLeastV.$$n(byte, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r7 = r7 + 65
            int r8 = 191 - r8
            byte[] r0 = kotlin.isAtLeastV.$$d
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L27
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            r4 = r0[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L27:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r3 + 1
            int r8 = r8 + (-1)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isAtLeastV.g(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = 44 - r7
            int r6 = r6 + 82
            int r8 = r8 + 4
            byte[] r0 = kotlin.isAtLeastV.$$j
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r7
            r4 = r2
            goto L22
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            r3 = r0[r7]
        L22:
            int r7 = r7 + 1
            int r6 = r6 + r3
            int r6 = r6 + 3
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isAtLeastV.h(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.isAtLeastV$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/isAtLeastV$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent AudioAttributesCompatParcelizer(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new Intent(p0, (Class<?>) isAtLeastV.class);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(boolean r21, int r22, char[] r23, int r24, int r25, java.lang.Object[] r26) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 380
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isAtLeastV.e(boolean, int, char[], int, int, java.lang.Object[]):void");
    }

    @Override // kotlin.isAtLeastT, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        e(false, View.MeasureSpec.makeMeasureSpec(0, 0) + 12, new char[]{1, 65483, '\f', 16, 65483, 65517, 15, '\f', 0, 2, 16, 16, 65534, 11, 1, 15, '\f', 6}, TextUtils.indexOf("", "", 0, 0) + 199, 17 - TextUtils.indexOf((CharSequence) "", '0', 0), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object obj = null;
        Object[] objArr3 = new Object[1];
        f((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 97), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), (-292433931) + (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 60, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) + 2079663702, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i2 = RatingCompat + 89;
                AudioAttributesImplApi21Parcelizer = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr4 = new Object[1];
                e(true, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 3, new char[]{15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, '\r', '\r', 65534, 65483, 1, 6, '\f'}, 199 - KeyEvent.normalizeMetaState(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 10, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                f((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), (byte) ('0' - AndroidCharacter.getMirror('0')), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 292433936, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 48, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2079663807, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i4 = AudioAttributesImplApi21Parcelizer + 83;
                RatingCompat = i4 % 128;
                if (i4 % 2 == 0) {
                    boolean z = baseContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf("", "", 0) + 4535), 6102 - AndroidCharacter.getMirror('0'), 41 - TextUtils.indexOf((CharSequence) "", '0'), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    e(true, View.combineMeasuredStates(0, 0) + 10, new char[]{65515, 65513, 23, 22, 25, 24, 27, 65509, 65514, 24, 26, 27, 65518, 65517, 65514, 65518, 65512, 25, 65516, 23, 24, 23, 26, 65515, 65511, 26, 65509, 65511, 65510, 65512, 22, 65513, 27, 65517, 65518, 27, 26, 65512, 65509, 24, 26, 65509, 65514, 25, 27, 26, 65518, 65512}, 175 - TextUtils.getTrimmedLength(""), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) - 1, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    e(false, View.MeasureSpec.getSize(0) + 39, new char[]{65518, 65518, 65517, 65526, 65524, 65519, 65517, 65517, 65521, 31, 65520, '#', 65519, 65520, 65517, 65525, 65524, 31, '!', '!', '#', 65518, '!', 65517, 65526, 65522, 65517, 65518, 65526, 65521, 65522, 65525, '#', '\"', ' ', 65522, '\"', 65520, 65524, 65517, ' ', ' ', 65517, 65524, 30, 65524, 65523, 65522, 65524, '!', 31, 65517, 65518, '!', 65523, 30, '\"', 30, 65526, 65523, 65525, 65521, 65526, 31}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 132, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 60, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) - 30, new char[]{65515, 65513, 26, 65518, 29, 31, 26, 65514, 65519, 65516, 28, 65514, 27, 65518, 27, 65519, 65520, 65519, 65521, 27, 65514, 26, 29, 65514, 65515, 28, 65521, 29, 29, 65518, 65514, 65521, 26, 29, 29, 65521, 26, 27, 65514, 65515, 65514, 65516, 65515, 65522, 30, 29, 65522, 65516, 65519, 65514, 65521, 65517, 26, 65520, 30, 26, 30, 65516, 31, 65514, 65515, 30, 65513, 28}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 57, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 63, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    f((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 4), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 292433910, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 77, Drawable.resolveOpacity(0, 0) + 2079663812, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 104, new char[]{65532, 65535, 2, 65532, 0, 7}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) + 101, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 5, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1, new char[]{65526, 65526, '!', 65521, '&', '#', '%', 65527, 65522, '!', 65527, '&', 65517, 65520, 65522, '\"', 65529, 65517, 65527, 65524, 65526, 65524, 65517, '&', 65528, '&', 65528, 65517, 65521, 65521, 65522, 65526, 65527, '\"', 65521, 65522}, Process.getGidForName("") + 165, MotionEvent.axisFromString("") + 37, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 6029 - ImageFormat.getBitsPerPixel(0), 25 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char deadChar = (char) (13183 - KeyEvent.getDeadChar(0, 0));
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1649;
            int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 26;
            Object[] objArr13 = new Object[1];
            g((byte) ($$d[61] - 1), r5[113], (short) 187, objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(deadChar, scrollBarSize, windowTouchSlop, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char mirror = (char) (AndroidCharacter.getMirror('0') + 13135);
                int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1649;
                int defaultSize = View.getDefaultSize(0, 0) + 26;
                byte[] bArr = $$d;
                byte b = bArr[8];
                byte b2 = bArr[5];
                Object[] objArr14 = new Object[1];
                g(b, b2, (short) (b2 | 144), objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(mirror, keyRepeatTimeout, defaultSize, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            f((short) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 46), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 292433940, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 15, (ViewConfiguration.getLongPressTimeout() >> 16) + 2079663814, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            e(true, 10 - ExpandableListView.getPackedPositionType(0L), new char[]{65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535, 65534, '\t', 65501, 2, '\r'}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 198, Color.red(0) + 16, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, 673825506};
                byte[] bArr2 = $$j;
                Object[] objArr18 = new Object[1];
                h((byte) 29, (byte) (bArr2[29] - 1), (byte) (-bArr2[15]), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                h((byte) ($$k & 104), (byte) (-bArr2[2]), bArr2[16], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 13183);
                    int i5 = (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1648;
                    int i6 = 27 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    byte[] bArr3 = $$d;
                    byte b3 = bArr3[8];
                    byte b4 = bArr3[5];
                    Object[] objArr20 = new Object[1];
                    g(b3, b4, (short) (b4 | 144), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(cNormalizeMetaState, i5, i6, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    f((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 111), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 109), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 292433829, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 45, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2079663770, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    e(true, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 14, new char[]{65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533, 65534, '\f', '\t', 65530, 5, 65534}, (ViewConfiguration.getPressedStateDuration() >> 16) + 203, TextUtils.indexOf("", "", 0, 0) + 15, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "", 0, 0) + 13183);
                        int mirror2 = 1697 - AndroidCharacter.getMirror('0');
                        int i7 = 27 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        byte[] bArr4 = $$d;
                        byte b5 = bArr4[8];
                        byte b6 = bArr4[5];
                        Object[] objArr23 = new Object[1];
                        g(b5, b6, (short) (b6 | 111), objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(cIndexOf, mirror2, i7, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char mirror3 = (char) (13231 - AndroidCharacter.getMirror('0'));
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1649;
                        int defaultSize2 = 26 - View.getDefaultSize(0, 0);
                        Object[] objArr24 = new Object[1];
                        g((byte) ($$d[61] - 1), r6[113], (short) 187, objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(mirror3, iResolveOpacity, defaultSize2, -133433128, false, (String) objArr24[0], null);
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
        int i8 = ((int[]) objArr[3])[0];
        int i9 = ((int[]) objArr[2])[0];
        if (i9 != i8) {
            long j = -1;
            long j2 = ((long) (i9 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4536 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 6054 - (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.lastIndexOf("", '0') + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i10 = RatingCompat + 49;
            int i11 = i10 % 128;
            AudioAttributesImplApi21Parcelizer = i11;
            int i12 = i10 % 2;
            int i13 = i11 + 113;
            RatingCompat = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr25 = {511302816, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) TextUtils.indexOf("", ""), (ViewConfiguration.getEdgeSlop() >> 16) + 6030, 24 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                byte[] bArr5 = $$j;
                byte b7 = bArr5[16];
                Object[] objArr26 = new Object[1];
                h(b7, (byte) (b7 | 27), (byte) (-bArr5[42]), objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        CmcdConfigurationRequestConfig.write(this, null, 0, 0, false, 15);
        super.onCreate(p0);
        setContentView(R.layout.activity_membership_detail);
        if (p0 == null) {
            ProcessUtils.Companion companion = ProcessUtils.INSTANCE;
            CmcdConfigurationRequestConfig.write(this, R.id.container, ProcessUtils.Companion.read());
        }
        int i15 = AudioAttributesImplApi21Parcelizer + 125;
        RatingCompat = i15 % 128;
        int i16 = i15 % 2;
    }

    private static void f(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        int length;
        byte[] bArr;
        int i6;
        int i7 = 2;
        int i8 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(write)};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getScrollBarSize() >> 8) + 24297, ((byte) KeyEvent.getModifierMetaStateMask()) + 13, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i9 = $10 + 75;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                z = true;
            } else {
                z = false;
            }
            int i11 = 3;
            if (z) {
                int i12 = $11 + 105;
                $10 = i12 % 128;
                if (i12 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr2 = MediaBrowserCompatItemReceiver;
                if (bArr2 != null) {
                    int length2 = bArr2.length;
                    byte[] bArr3 = new byte[length2];
                    int i13 = 0;
                    while (i13 < length2) {
                        int i14 = $10 + i11;
                        $11 = i14 % 128;
                        if (i14 % i7 == 0) {
                            Object[] objArr3 = {Integer.valueOf(bArr2[i13])};
                            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 3082, ((byte) KeyEvent.getModifierMetaStateMask()) + 129, 2145850993, false, $$n(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr3[i13] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        } else {
                            Object[] objArr4 = {Integer.valueOf(bArr2[i13])};
                            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(28234468);
                            if (objRemoteActionCompatParcelizer3 == null) {
                                byte b4 = (byte) 0;
                                byte b5 = b4;
                                objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getPressedStateDuration() >> 16), 3082 - Color.alpha(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 128, 2145850993, false, $$n(b4, b5, b5), new Class[]{Integer.TYPE});
                            }
                            bArr3[i13] = ((Byte) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).byteValue();
                            i13++;
                        }
                        i7 = 2;
                        i11 = 3;
                    }
                    bArr2 = bArr3;
                }
                if (bArr2 != null) {
                    int i15 = $10 + 107;
                    $11 = i15 % 128;
                    int i16 = i15 % 2;
                    byte[] bArr4 = MediaBrowserCompatItemReceiver;
                    try {
                        Object[] objArr5 = {Integer.valueOf(i), Integer.valueOf(AudioAttributesCompatParcelizer)};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(559968424);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) View.MeasureSpec.makeMeasureSpec(0, 0), 24297 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 12 - View.MeasureSpec.getMode(0), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr4[((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) write) ^ 7899112766888837815L)));
                        i4 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    iIntValue = (short) (((short) (((long) AudioAttributesImplBaseParcelizer[i + ((int) (((long) AudioAttributesCompatParcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) write) ^ 7899112766888837815L)));
                    int i17 = $11 + 101;
                    $10 = i17 % 128;
                    i4 = 2;
                    int i18 = i17 % 2;
                }
            } else {
                i4 = 2;
            }
            if (iIntValue > 0) {
                int i19 = ((i + iIntValue) - i4) + ((int) (((long) AudioAttributesCompatParcelizer) ^ 7899112766888837815L));
                if (z) {
                    int i20 = $10 + 39;
                    $11 = i20 % 128;
                    int i21 = i20 % 2;
                    i5 = 1;
                } else {
                    int i22 = $11 + 5;
                    $10 = i22 % 128;
                    int i23 = i22 % 2;
                    i5 = 0;
                }
                buildresumedownloadsintent.read = i19 + i5;
                Object[] objArr6 = {buildresumedownloadsintent, Integer.valueOf(i3), Integer.valueOf(RemoteActionCompatParcelizer), sb};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 34134), Color.alpha(0) + 13432, Drawable.resolveOpacity(0, 0) + 21, 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr5 = MediaBrowserCompatItemReceiver;
                if (bArr5 != null) {
                    int i24 = $11 + 93;
                    $10 = i24 % 128;
                    if (i24 % 2 != 0) {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i6 = 1;
                    } else {
                        length = bArr5.length;
                        bArr = new byte[length];
                        i6 = 0;
                    }
                    while (i6 < length) {
                        bArr[i6] = (byte) (((long) bArr5[i6]) ^ 7899112766888837815L);
                        i6++;
                    }
                    bArr5 = bArr;
                }
                boolean z2 = bArr5 != null;
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    int i25 = $10 + 17;
                    int i26 = i25 % 128;
                    $11 = i26;
                    int i27 = i25 % 2;
                    if (!z2) {
                        short[] sArr = AudioAttributesImplBaseParcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r7]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        int i28 = i26 + 61;
                        $10 = i28 % 128;
                        int i29 = i28 % 2;
                        byte[] bArr6 = MediaBrowserCompatItemReceiver;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r8]) ^ 7899112766888837815L)) + s)) ^ b));
                    }
                    sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0141  */
    @Override // kotlin.isAtLeastT, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 502
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isAtLeastV.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x015f  */
    @Override // kotlin.isAtLeastT, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 520
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isAtLeastV.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(31:0|2|(2:(2:7|(2:9|(2:11|(1:18)(1:17))(2:14|(0)(0)))(0))(1:19)|(9:21|298|22|(1:24)|25|26|27|(1:29)|30))|34|(9:299|35|(1:37)|38|(3:40|(1:42)|43)(19:44|45|293|46|(1:48)|49|50|287|51|(1:53)|54|55|56|(1:58)|59|(1:61)|62|(1:64)|65)|66|(6:70|(11:72|(3:74|(3:77|78|75)|307)|79|289|80|(1:82)|83|84|85|281|86)|99|(3:302|101|306)(1:305)|304|67)|303|69)|295|(2:126|(2:128|(1:134)(1:133))(2:137|138))|139|291|140|(1:142)|143|285|144|(1:146)|147|174|(1:176)|177|(2:179|(4:181|(1:183)|184|185)(3:186|(1:188)|189))(13:191|296|192|193|(1:195)|196|277|197|198|(1:200)|201|(1:203)|204)|190|205|(6:207|208|(1:210)|211|212|213)|214|(1:216)|217|(2:219|(3:221|(1:223)|224)(3:225|(1:227)|228))(14:230|231|(1:233)|234|235|(1:237)|238|283|239|240|(1:242)|243|(1:245)|246)|229|247|(7:249|250|(1:252)|253|254|255|256)(1:308)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x0d53, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0e3c, code lost:
    
        r6 = new java.lang.Object[1];
        e(false, (android.util.TypedValue.complexToFraction(0, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) > com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 1 : (android.util.TypedValue.complexToFraction(0, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 11, new char[]{4, 65533, 2, 65532, 0, 65535, 3, 4, 2, 65534, 0}, android.view.View.getDefaultSize(0, 0) + 152, (((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(com.marrow.R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 10, r6);
        r4 = (java.lang.String) r6[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0e8a, code lost:
    
        r2 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r2);
        r0.printStackTrace(r5);
        r5.close();
        r1 = r2.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0ea1, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0ea5, code lost:
    
        r2 = new java.util.ArrayList(2);
        r2.add(r1);
        r2.add(r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0eb4, code lost:
    
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0eb8, code lost:
    
        if (r1 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0eba, code lost:
    
        r1 = kotlin.startForeground.read((char) (4534 - android.text.TextUtils.lastIndexOf("", '0', 0, 0)), 6054 - android.text.TextUtils.indexOf("", ""), android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0) + 43, -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0ee6, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0ef2, code lost:
    
        r6 = new java.lang.Object[]{-473887989, 81604378625L, r2, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r2 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) (android.os.Process.getGidForName("") + 1), 6030 - android.widget.ExpandableListView.getPackedPositionType(0), 24 - android.text.TextUtils.getOffsetAfter("", 0));
        r4 = kotlin.isAtLeastV.$$j;
        r5 = r4[16];
        r10 = new java.lang.Object[1];
        h(r5, (byte) (r5 | 27), (byte) (-r4[42]), r10);
        r2.getMethod((java.lang.String) r10[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:171:0x0f6d, code lost:
    
        r1 = kotlin.isAtLeastV.AudioAttributesImplApi21Parcelizer + 35;
        kotlin.isAtLeastV.RatingCompat = r1 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0f77, code lost:
    
        if ((r1 % 2) == 0) goto L173;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0f79, code lost:
    
        r1 = 4 % 3;
     */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0d32  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0d74 A[Catch: all -> 0x0e32, TryCatch #8 {all -> 0x0e32, blocks: (B:140:0x0d5f, B:142:0x0d74, B:143:0x0da3), top: B:291:0x0d5f, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0db6 A[Catch: all -> 0x0e28, TryCatch #5 {all -> 0x0e28, blocks: (B:144:0x0da9, B:146:0x0db6, B:147:0x0e20), top: B:285:0x0da9, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0f85  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0fd7  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x1088  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x1445  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x1533  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x1584  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x1635  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x1a16  */
    /* JADX WARN: Removed duplicated region for block: B:308:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.isAtLeastT, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 7325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.isAtLeastV.attachBaseContext(android.content.Context):void");
    }

    static {
        AudioAttributesImplApi26Parcelizer = 0;
        AudioAttributesImplBaseParcelizer();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatCustomActionResultReceiver + 51;
        AudioAttributesImplApi26Parcelizer = i % 128;
        int i2 = i % 2;
    }

    @Override // kotlin.isAtLeastT, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 39;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 70 / 0;
        }
    }

    static void AudioAttributesImplBaseParcelizer() {
        IconCompatParcelizer = 1000326239;
        AudioAttributesCompatParcelizer = -565726531;
        write = -819363159;
        RemoteActionCompatParcelizer = 1260608275;
        MediaBrowserCompatItemReceiver = new byte[]{TarConstants.LF_GNUTYPE_LONGNAME, -93, 107, -69, 72, -79, 66, -92, 73, 77, 74, TarConstants.LF_GNUTYPE_LONGLINK, -73, -104, 122, -79, -66, 68, -73, 74, -91, 72, -79, -66, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -90, -127, 74, 11, -16, 12, -74, -71, 73, 78, -78, -115, 113, 78, -72, -123, 117, 73, -69, -126, 126, 68, -90, 91, -77, 73, -72, 69, -90, 91, -71, -114, 13, -74, -91, 73, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -92, TarConstants.LF_GNUTYPE_LONGLINK, 68, -67, 67, -15, 12, -72, 65, 78, -79, 74, 78, -70, -76, -65, 74, -126, -73, 66, 112, -76, TarConstants.LF_GNUTYPE_LONGLINK, -73, -69, -65, 70, -74, 77, -111, -110, 112, 78, -70, 66, -119, 122, 92, -94, 64, -65, 67, -76, -98, 97, -65, 70, -74, 77, -111, -110, 12, -77, -10, 125, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -71, 65, -70, 77, 74, -80, TarConstants.LF_GNUTYPE_LONGNAME, -74, 74, -78, TarConstants.LF_GNUTYPE_LONGNAME, -80, 73, -73, -73, -73, -73, -73, -73};
    }
}
