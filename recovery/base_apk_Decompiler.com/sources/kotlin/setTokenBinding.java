package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.marrow.R;
import com.marrow.TrainingApplication;
import in.juspay.hyper.constants.LogCategory;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.getRp;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/setTokenBinding;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setTokenBinding extends getAuthenticatorSelection {
    private static int AudioAttributesCompatParcelizer;
    private static short[] AudioAttributesImplApi26Parcelizer;
    private static int AudioAttributesImplBaseParcelizer;
    private static int IconCompatParcelizer;
    private static byte[] MediaBrowserCompatItemReceiver;
    private static int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int write;
    private static final byte[] $$l = {18, -4, -80, 95};
    private static final int $$m = 139;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {105, -128, TarConstants.LF_BLK, -25, -67, 29, 22, -3, 3, -10, -32, 42, -13, -1, -4, -15, 17, -7, -1, 8, -31, 17, 7, -12, -1, 11, -15, 11, -49, 42, -13, -1, -4, -24, 18, 21, -36, 9, 9, 7, -18, 12, -15, -6, 1, 17, 6, 0, 3, -17, -38, 32, 15, -13, 4, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, -67, TarConstants.LF_CONTIG, -4, 13, -50, 35, -7, -20, 17, -37, TarConstants.LF_LINK, -17, -2, -3, 11, -80, 81, -7, -11, 9, -17, TarConstants.LF_SYMLINK, -19, 3, 4, -48, TarConstants.LF_LINK, -2, -4, -11, -9, 17, -3, -17, 12, -50, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11};
    private static final int $$k = 126;
    private static final byte[] $$d = {41, -117, 87, 37, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 101;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int MediaDescriptionCompat = 1;
    private static int AudioAttributesImplApi21Parcelizer = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(short r6, int r7, byte r8) {
        /*
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r8 = r8 * 3
            int r8 = r8 + 112
            int r6 = r6 * 4
            int r6 = 4 - r6
            byte[] r1 = kotlin.setTokenBinding.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2b
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r6 = r6 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setTokenBinding.$$n(short, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = 114 - r8
            byte[] r0 = kotlin.setTokenBinding.$$d
            int r7 = 191 - r7
            int r1 = r6 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = -1
            if (r0 != 0) goto L13
            r4 = r8
            r3 = r2
            r8 = r7
            goto L29
        L13:
            r3 = r2
        L14:
            int r3 = r3 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            r9[r7] = r6
            return
        L24:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L29:
            int r4 = -r4
            int r7 = r7 + r4
            int r8 = r8 + 1
            int r7 = r7 + r2
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setTokenBinding.g(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 4
            int r7 = r7 + 65
            byte[] r0 = kotlin.setTokenBinding.$$j
            int r8 = r8 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r5 = r2
            goto L27
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L20
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L20:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L27:
            int r7 = r7 + r8
            int r7 = r7 + 2
            r8 = r3
            r3 = r5
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setTokenBinding.h(int, byte, short, java.lang.Object[]):void");
    }

    public setTokenBinding() {
        super((byte) 0);
    }

    /* JADX INFO: renamed from: o.setTokenBinding$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u00052\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0005H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"Lcom/marrow2/ui/qbank/introduction/QbankIntroductionActivity$Companion;", "", "<init>", "()V", "EXTRA_LESSON_ID", "", "EXTRA_QBANK_SOURCE", "KEY_IS_MCQ_STARTED", "EXTRA_ANALYTICS_SOURCE", "getLaunchIntent", "Landroid/content/Intent;", LogCategory.CONTEXT, "Landroid/content/Context;", "lessonId", "source", "", "analyticsSource", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent IconCompatParcelizer(Context context, String str, int i, String str2) {
            toMagicModuleMetaRepoModel.write(context, "");
            Intent intent = new Intent(context, (Class<?>) setTokenBinding.class);
            intent.putExtra("test_id", str);
            intent.putExtra("qbank_source", i);
            intent.putExtra("analytics_source", str2);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0171  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(boolean r24, int r25, char[] r26, int r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 388
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setTokenBinding.e(boolean, int, char[], int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:67:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(short r23, byte r24, int r25, int r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 746
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setTokenBinding.f(short, byte, int, int, int, java.lang.Object[]):void");
    }

    @Override // kotlin.getAuthenticatorSelection, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 79;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        e(false, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 3, new char[]{0, 2, 16, 16, 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65517, 15, '\f'}, 163 - (ViewConfiguration.getTouchSlop() >> 8), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 18, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        e(false, 5 - ((Process.getThreadPriority(0) + 20) >> 6), new char[]{5, 17, 65517, 1, 65532}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 158, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 5, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                f((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 42), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 128), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1965827672, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 23, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1269781872, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                f((short) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 112), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 121), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 1965827672, (-19) - Color.blue(0), (KeyEvent.getMaxKeyCode() >> 16) + 1269781909, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i4 = MediaDescriptionCompat + 73;
                MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (Color.green(0) + 4535), 6054 - TextUtils.getCapsMode("", 0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    f((short) (Gravity.getAbsoluteGravity(0, 0) - 50), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 66), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 1965827725, (-18) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1269781909 - (ViewConfiguration.getDoubleTapTimeout() >> 16), objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    f((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 116), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 52), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 1965827773, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 54, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1269781858, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    e(false, 23 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{65515, 30, 65513, 28, 65515, 65513, 26, 65518, 29, 31, 26, 65514, 65519, 65516, 28, 65514, 27, 65518, 27, 65519, 65520, 65519, 65521, 27, 65514, 26, 29, 65514, 65515, 28, 65521, 29, 29, 65518, 65514, 65521, 26, 29, 29, 65521, 26, 27, 65514, 65515, 65514, 65516, 65515, 65522, 30, 29, 65522, 65516, 65519, 65514, 65521, 65517, 26, 65520, 30, 26, 30, 65516, 31, 65514}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + TarConstants.PREFIXLEN_XSTAR, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 47, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    f((short) (65 - View.combineMeasuredStates(0, 0)), (byte) (2 - TextUtils.getOffsetAfter("", 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 1965827834, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 20, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1269781879, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f((short) ((-23) - View.resolveSizeAndState(0, 0, 0)), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 43), (Process.myPid() >> 22) + 1965827905, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 23, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 1269781758, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    f((short) (Color.rgb(0, 0, 0) + 16777105), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 135), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 1965827907, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 54, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1269781850, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.green(0) + 6030, TextUtils.indexOf("", "", 0, 0) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char bitsPerPixel = (char) (13182 - ImageFormat.getBitsPerPixel(0));
            int iIndexOf = 1649 - TextUtils.indexOf("", "", 0);
            int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 26;
            byte b = (byte) ($$d[0] - 1);
            Object[] objArr13 = new Object[1];
            g(b, (short) (b | 147), r3[3], objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(bitsPerPixel, iIndexOf, iIndexOf2, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i6 = MediaBrowserCompatCustomActionResultReceiver + 95;
            MediaDescriptionCompat = i6 % 128;
            int i7 = i6 % 2;
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cIndexOf = (char) (TextUtils.indexOf("", "", 0) + 13183);
                int iIndexOf3 = 1648 - TextUtils.indexOf((CharSequence) "", '0');
                int iMyTid = 26 - (Process.myTid() >> 22);
                Object[] objArr14 = new Object[1];
                g(r2[8], (short) 144, (byte) (-$$d[9]), objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(cIndexOf, iIndexOf3, iMyTid, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            e(true, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 34, new char[]{'\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 127, Color.rgb(0, 0, 0) + 16777232, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            e(false, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 35, new char[]{65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r', 2, 65501, '\t', 65534}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + TsExtractor.TS_STREAM_TYPE_AC3, 16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, -303933516};
                byte b2 = (byte) ($$k & 175);
                byte[] bArr = $$j;
                Object[] objArr18 = new Object[1];
                h(b2, bArr[13], bArr[77], objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                h(bArr[82], (byte) (-bArr[81]), bArr[47], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char cBlue = (char) (Color.blue(0) + 13183);
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1649;
                    int i8 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25;
                    Object[] objArr20 = new Object[1];
                    g(r4[8], (short) 144, (byte) (-$$d[9]), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(cBlue, tapTimeout, i8, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    f((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 16), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 91), 1965827947 - Color.red(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 56, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1269781872, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    e(false, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 9, new char[]{65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f'}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 157, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char c = (char) (13184 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                        int maxKeyCode = 1649 - (KeyEvent.getMaxKeyCode() >> 16);
                        int keyRepeatDelay = 26 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        Object[] objArr23 = new Object[1];
                        g(r7[8], (short) ($$e | 10), (byte) (-$$d[9]), objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(c, maxKeyCode, keyRepeatDelay, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char packedPositionChild = (char) (ExpandableListView.getPackedPositionChild(0L) + 13184);
                        int iCombineMeasuredStates = 1649 - View.combineMeasuredStates(0, 0);
                        int iResolveSizeAndState = 26 - View.resolveSizeAndState(0, 0, 0);
                        byte b3 = (byte) ($$d[0] - 1);
                        Object[] objArr24 = new Object[1];
                        g(b3, (short) (b3 | 147), r4[3], objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(packedPositionChild, iCombineMeasuredStates, iResolveSizeAndState, -133433128, false, (String) objArr24[0], null);
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
        int i9 = ((int[]) objArr[3])[0];
        int i10 = ((int[]) objArr[2])[0];
        if (i10 != i9) {
            long j = -1;
            long j2 = ((long) (i10 ^ i9)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4535 - Color.red(0)), (KeyEvent.getMaxKeyCode() >> 16) + 6054, 42 - View.combineMeasuredStates(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {-1771204186, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) Color.alpha(0), (ViewConfiguration.getScrollBarSize() >> 8) + 6030, KeyEvent.normalizeMetaState(0) + 24);
                Object[] objArr26 = new Object[1];
                h(r1[16], (byte) ($$k & 168), (byte) (-$$j[33]), objArr26);
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
        int intExtra = getIntent().getIntExtra("qbank_source", 4);
        String stringExtra = getIntent().getStringExtra("analytics_source");
        String stringExtra2 = getIntent().getStringExtra("test_id");
        if (stringExtra2 == null) {
            finish();
            return;
        }
        int i11 = MediaDescriptionCompat;
        int i12 = i11 + 25;
        MediaBrowserCompatCustomActionResultReceiver = i12 % 128;
        int i13 = i12 % 2;
        if (p0 == null) {
            int i14 = i11 + 125;
            MediaBrowserCompatCustomActionResultReceiver = i14 % 128;
            int i15 = i14 % 2;
            _doAddInjectable _doaddinjectableIconCompatParcelizer = getSupportFragmentManager().IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(_doaddinjectableIconCompatParcelizer, "");
            getRp.Companion audioAttributesCompatParcelizer = getRp.INSTANCE;
            _doaddinjectableIconCompatParcelizer.write(R.id.fragment_container, getRp.Companion.write(stringExtra2, intExtra, stringExtra));
            _doaddinjectableIconCompatParcelizer.write();
            int i16 = MediaBrowserCompatCustomActionResultReceiver + 55;
            MediaDescriptionCompat = i16 % 128;
            int i17 = i16 % 2;
        }
    }

    @Override // kotlin.getAuthenticatorSelection, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 29;
            MediaDescriptionCompat = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            f((short) (46 - TextUtils.indexOf("", "", 0, 0)), (byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 94), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 1965827681, (-18) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), ((byte) KeyEvent.getModifierMetaStateMask()) + 1269781908, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 109), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 17), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) + 1965827672, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 128, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) + 1269781860, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((!(baseContext instanceof ContextWrapper)) || ((ContextWrapper) baseContext).getBaseContext() != null) {
                baseContext = baseContext.getApplicationContext();
                int i4 = MediaDescriptionCompat + 95;
                MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
                int i5 = i4 % 2;
            } else {
                baseContext = null;
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4536 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), 6054 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 42 - Color.blue(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) View.resolveSize(0, 0), Color.red(0) + 6030, View.resolveSize(0, 0) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // kotlin.getAuthenticatorSelection, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 568
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setTokenBinding.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x07fe A[Catch: all -> 0x0de4, TryCatch #3 {all -> 0x0de4, blocks: (B:96:0x07aa, B:98:0x07b0, B:99:0x07f2, B:101:0x07fe, B:103:0x0807, B:104:0x084b, B:128:0x0c96, B:129:0x0c9a, B:132:0x0caa, B:134:0x0cc0, B:137:0x0cd6, B:139:0x0cd9, B:146:0x0d3e, B:152:0x0dbe, B:154:0x0dc4, B:155:0x0dc5, B:157:0x0dc7, B:159:0x0dce, B:160:0x0dcf, B:105:0x0855, B:117:0x0a4e, B:119:0x0a54, B:120:0x0a9a, B:122:0x0bdf, B:123:0x0c24, B:125:0x0c3b, B:126:0x0c86, B:162:0x0dd1, B:164:0x0dd8, B:165:0x0dd9, B:167:0x0ddb, B:169:0x0de2, B:170:0x0de3, B:142:0x0d04, B:144:0x0d0a, B:145:0x0d37, B:112:0x09ca, B:114:0x09de, B:115:0x0a42, B:107:0x0977, B:109:0x098b, B:110:0x09c3, B:148:0x0d43), top: B:275:0x07aa, outer: #5, inners: #4, #10, #14, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0855 A[Catch: all -> 0x0de4, TRY_LEAVE, TryCatch #3 {all -> 0x0de4, blocks: (B:96:0x07aa, B:98:0x07b0, B:99:0x07f2, B:101:0x07fe, B:103:0x0807, B:104:0x084b, B:128:0x0c96, B:129:0x0c9a, B:132:0x0caa, B:134:0x0cc0, B:137:0x0cd6, B:139:0x0cd9, B:146:0x0d3e, B:152:0x0dbe, B:154:0x0dc4, B:155:0x0dc5, B:157:0x0dc7, B:159:0x0dce, B:160:0x0dcf, B:105:0x0855, B:117:0x0a4e, B:119:0x0a54, B:120:0x0a9a, B:122:0x0bdf, B:123:0x0c24, B:125:0x0c3b, B:126:0x0c86, B:162:0x0dd1, B:164:0x0dd8, B:165:0x0dd9, B:167:0x0ddb, B:169:0x0de2, B:170:0x0de3, B:142:0x0d04, B:144:0x0d0a, B:145:0x0d37, B:112:0x09ca, B:114:0x09de, B:115:0x0a42, B:107:0x0977, B:109:0x098b, B:110:0x09c3, B:148:0x0d43), top: B:275:0x07aa, outer: #5, inners: #4, #10, #14, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0ca0  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0f6f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0fbe  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x101b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x1390  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x1471  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x14bb  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x150c  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x18b7  */
    /* JADX WARN: Removed duplicated region for block: B:306:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x057c A[Catch: all -> 0x0636, TRY_LEAVE, TryCatch #12 {all -> 0x0636, blocks: (B:56:0x0568, B:58:0x057c), top: B:273:0x0568 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x05a9  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x05bd A[Catch: all -> 0x062a, TryCatch #7 {all -> 0x062a, blocks: (B:63:0x05b0, B:65:0x05bd, B:66:0x0623), top: B:281:0x05b0, outer: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x06e5 A[Catch: all -> 0x0528, TryCatch #6 {all -> 0x0528, blocks: (B:89:0x06df, B:91:0x06e5, B:92:0x0711, B:210:0x13b0, B:212:0x13b6, B:213:0x13e0, B:246:0x18d5, B:248:0x18db, B:249:0x1904, B:227:0x15e3, B:229:0x1605, B:230:0x165c, B:177:0x0ea9, B:179:0x0eaf, B:180:0x0edc, B:26:0x010a, B:28:0x0110, B:29:0x0136, B:31:0x0498, B:33:0x04c9, B:34:0x0520), top: B:279:0x010a }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x07b0 A[Catch: all -> 0x0de4, TryCatch #3 {all -> 0x0de4, blocks: (B:96:0x07aa, B:98:0x07b0, B:99:0x07f2, B:101:0x07fe, B:103:0x0807, B:104:0x084b, B:128:0x0c96, B:129:0x0c9a, B:132:0x0caa, B:134:0x0cc0, B:137:0x0cd6, B:139:0x0cd9, B:146:0x0d3e, B:152:0x0dbe, B:154:0x0dc4, B:155:0x0dc5, B:157:0x0dc7, B:159:0x0dce, B:160:0x0dcf, B:105:0x0855, B:117:0x0a4e, B:119:0x0a54, B:120:0x0a9a, B:122:0x0bdf, B:123:0x0c24, B:125:0x0c3b, B:126:0x0c86, B:162:0x0dd1, B:164:0x0dd8, B:165:0x0dd9, B:167:0x0ddb, B:169:0x0de2, B:170:0x0de3, B:142:0x0d04, B:144:0x0d0a, B:145:0x0d37, B:112:0x09ca, B:114:0x09de, B:115:0x0a42, B:107:0x0977, B:109:0x098b, B:110:0x09c3, B:148:0x0d43), top: B:275:0x07aa, outer: #5, inners: #4, #10, #14, #16 }] */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v115 */
    /* JADX WARN: Type inference failed for: r10v116 */
    /* JADX WARN: Type inference failed for: r10v117 */
    /* JADX WARN: Type inference failed for: r10v118 */
    /* JADX WARN: Type inference failed for: r10v125 */
    /* JADX WARN: Type inference failed for: r10v126 */
    /* JADX WARN: Type inference failed for: r10v127 */
    /* JADX WARN: Type inference failed for: r10v58 */
    /* JADX WARN: Type inference failed for: r10v62 */
    /* JADX WARN: Type inference failed for: r10v63 */
    /* JADX WARN: Type inference failed for: r10v65 */
    /* JADX WARN: Type inference failed for: r10v66 */
    /* JADX WARN: Type inference failed for: r10v67 */
    /* JADX WARN: Type inference failed for: r10v68 */
    /* JADX WARN: Type inference failed for: r10v69, types: [float] */
    @Override // kotlin.getAuthenticatorSelection, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6895
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setTokenBinding.attachBaseContext(android.content.Context):void");
    }

    static {
        AudioAttributesImplBaseParcelizer = 0;
        AudioAttributesImplBaseParcelizer();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplApi21Parcelizer + 71;
        AudioAttributesImplBaseParcelizer = i % 128;
        int i2 = i % 2;
    }

    @getMagicModuleMeta
    public static final Intent RemoteActionCompatParcelizer(Context context, String str, int i, String str2) {
        int i2 = 2 % 2;
        int i3 = MediaDescriptionCompat + 23;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        Intent intentIconCompatParcelizer = Companion.IconCompatParcelizer(context, str, i, str2);
        int i5 = MediaDescriptionCompat + 49;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        return intentIconCompatParcelizer;
    }

    @Override // kotlin.getAuthenticatorSelection, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 125;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 19;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    static void AudioAttributesImplBaseParcelizer() {
        RemoteActionCompatParcelizer = 1000326267;
        IconCompatParcelizer = 1174035241;
        write = -819363163;
        AudioAttributesCompatParcelizer = 2071537785;
        MediaBrowserCompatItemReceiver = new byte[]{-65, -59, -122, -107, -52, 62, -3, -49, -51, -107, TarConstants.LF_CONTIG, -97, TarConstants.LF_CHR, -28, TarConstants.LF_DIR, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -62, -55, -43, -116, -99, -100, -121, -56, -112, TarConstants.LF_CONTIG, -73, 34, 57, 44, -50, 33, 37, 36, 35, 63, -46, 116, 57, -56, 46, 63, 36, -51, -87, 123, -51, 33, 47, 124, 34, 107, -51, 85, 123, 33, 125, -53, 36, 109, TarConstants.LF_DIR, 122, 33, 122, 94, -51, 106, -54, 123, 95, 33, 62, 47, 109, 122, TarConstants.LF_DIR, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 81, 122, 33, -52, 34, 125, 46, 94, 33, 125, 33, 125, TarConstants.LF_SYMLINK, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 94, -103, -11, TarConstants.LF_GNUTYPE_LONGLINK, -71, 71, 123, 124, -85, -120, -118, 112, -127, -118, 112, 125, -126, 77, -72, 64, -9, -119, -9, -96, 124, -127, 126, -118, 77, -72, 90, -85, -11, -119, 123, 112, 123, -126, 124, -119, TarConstants.LF_GNUTYPE_LONGNAME, -94, -10, 125, -9, 126, 81, 125, -11, -96, 71, -72, -118, TarConstants.LF_GNUTYPE_LONGLINK, 123, -82, -9, 124, 124, 67, -81, -12, 78, -119, -72, -122, 11, 116, 125, 27, 101, 68, 9, -54, -77, -49, 117, 124, 12, 13, 113, 64, TarConstants.LF_BLK, 13, 123, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -56, 12, 122, 65, 61, 7, 101, 26, 114, 12, 123, 24, 101, 26, 124, 77, -64, 117, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 12, 27, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 10, 7, 112, 2, -76, -49, 123, 4, 13, 116, 9, 13, 121, 119, 126, 9, 65, 118, 1, TarConstants.LF_CHR, 119, 10, 118, 122, 67, -43, 123, -44, -44, 102, -91, -68, 15, -84, 113, -71, 102, -106, -65, 11, -110, 11, -93, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 102, 12, -109, 72, 110, -71, 102, -70, -67, 125, -106, 10, -106, -79, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -68, 101, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 101, 15, -85, 101, -77, -39, -99, -64, -6, -5, -39, -110, -62, -105, -21, -18, 104, -51, 2, -121, -88, -105, -106, -61, -101, -58};
    }
}
