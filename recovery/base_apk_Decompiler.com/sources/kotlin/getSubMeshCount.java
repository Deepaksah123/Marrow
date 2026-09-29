package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow2.ui.courseswitch.fragment.CourseSwitchFragment;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.getCameraMotionListener;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/getSubMeshCount;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lo/parseAdaptationSet;", "read", "Lo/parseAdaptationSet;", "AudioAttributesCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getSubMeshCount extends getVertexCount {
    private static long AudioAttributesCompatParcelizer;
    private static char IconCompatParcelizer;
    private static int MediaBrowserCompatItemReceiver;
    private static char[] RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private parseAdaptationSet AudioAttributesCompatParcelizer;
    private static final byte[] $$c = {TarConstants.LF_CHR, -23, 108, 101};
    private static final int $$f = 186;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {26, 47, -113, 59, -54, 68, 9, 26, -21, 38, 16, -8, 22, -31, 62, -4, 11, 10, 24, -2, 10, -21, 60, 8, -6, 30, 0, 17, 10, -14, 41, -68, 40, 63, -6, 16, 17, -35, 62, 11, 9, 2, 4, 30, 10, -4, 25, -37, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -2, 7, 14, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -54, 42, 35, 10, 16, 3, -19, TarConstants.LF_CONTIG, 0, 12, 9, -2, 30, 6, 12, 21, -18, 30, 20, 1, 12, 24, -2, 24, -36, TarConstants.LF_CONTIG, 0, 12, 9, -11, 31, 34, -23, 22, 22, 20, -5, 25};
    private static final int $$h = 243;
    private static final byte[] $$a = {TarConstants.LF_NORMAL, -108, 98, 5, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 39;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int AudioAttributesImplApi21Parcelizer = 1;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(byte r5, byte r6, short r7) {
        /*
            byte[] r0 = kotlin.getSubMeshCount.$$c
            int r6 = r6 * 3
            int r1 = r6 + 1
            int r7 = r7 * 2
            int r7 = r7 + 119
            int r5 = r5 * 3
            int r5 = 4 - r5
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r5
            r4 = r6
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r0[r5]
        L27:
            int r4 = -r4
            int r5 = r5 + 1
            int r7 = r7 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getSubMeshCount.$$i(byte, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = 190 - r8
            int r9 = 114 - r9
            int r7 = 44 - r7
            byte[] r0 = kotlin.getSubMeshCount.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r7
            r5 = r2
            goto L27
        L10:
            r3 = r2
        L11:
            int r8 = r8 + 1
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + (-1)
            r3 = r5
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getSubMeshCount.c(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.getSubMeshCount.$$g
            int r1 = r8 + 4
            int r6 = 114 - r6
            int r7 = 93 - r7
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r6 = r8
            r4 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L28:
            int r6 = r6 + r7
            int r6 = r6 + (-11)
            int r7 = r3 + 1
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getSubMeshCount.d(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.getSubMeshCount$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/getSubMeshCount$write;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/getCameraMotionListener;", "p1", "Landroid/content/Intent;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;Lo/getCameraMotionListener;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent RemoteActionCompatParcelizer(Context p0, getCameraMotionListener p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) getSubMeshCount.class);
            p1.read(intent);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = $10 + 99;
            $11 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = notifydownloadchanged.AudioAttributesCompatParcelizer;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 38460), Gravity.getAbsoluteGravity(0, 0) + 532, TextUtils.indexOf((CharSequence) "", '0', 0) + 9, -735610793, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() * (AudioAttributesCompatParcelizer % 2192498202983240651L);
                    Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (36621 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (ViewConfiguration.getJumpTapTimeout() >> 16) + 2340, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 28, 188119637, false, $$i(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = notifydownloadchanged.AudioAttributesCompatParcelizer;
                Object[] objArr4 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (Color.blue(0) + 38461), TextUtils.getTrimmedLength("") + 532, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 8, -735610793, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).longValue() ^ (AudioAttributesCompatParcelizer ^ 2192498202983240651L);
                Object[] objArr5 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (36621 - (ViewConfiguration.getPressedStateDuration() >> 16)), 2340 - View.getDefaultSize(0, 0), 27 - MotionEvent.axisFromString(""), 188119637, false, $$i(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i6 = $11 + 87;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            try {
                Object[] objArr6 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer5 == null) {
                    byte b9 = (byte) 0;
                    byte b10 = b9;
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (36621 - TextUtils.getOffsetBefore("", 0)), 2340 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 28 - (KeyEvent.getMaxKeyCode() >> 16), 188119637, false, $$i(b9, b10, b10), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
                int i8 = $10 + 95;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr2);
    }

    @Override // kotlin.getVertexCount, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 43843, new char[]{35323, 8889, 57188, 34831, 9409, 53618, 35376, 9903, 54173, 35932, 14518, 54661, 36468, 15132, 55247, 32892, 15673, 59892}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 53), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 1, new char[]{'\t', '(', 4, '%', 13910}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                a(54581 - TextUtils.getTrimmedLength(""), new char[]{35323, 23745, 9108, 63095, 56609, 41978, 30400, 24007, 8275, 63287, 56824, 41203, 30631, 23112, 8456, 63464, 55996, 41334, 29780, 23308, 8682, 62635, 56166, 44604, 29955, 23507}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 70), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 8, new char[]{'0', '$', 13874, 13874, 18, ' ', 18, 16, 13876, 13876, 18, ')', '*', '\b', 18, '&', ' ', 23}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i2 = AudioAttributesImplApi21Parcelizer + 109;
                AudioAttributesImplApi26Parcelizer = i2 % 128;
                int i3 = i2 % 2;
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    baseContext = null;
                } else {
                    baseContext = baseContext.getApplicationContext();
                    int i4 = AudioAttributesImplApi26Parcelizer + 45;
                    AudioAttributesImplApi21Parcelizer = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - KeyEvent.keyCodeFromString("")), 6054 - (ViewConfiguration.getTouchSlop() >> 8), 42 - TextUtils.indexOf("", ""), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 17), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 71, new char[]{',', '/', 30, 17, '-', 1, '\f', 0, '\"', '\f', '-', 3, '\t', 18, 4, '-', ' ', '\n', '-', 29, '\'', '\n', 17, ',', 2, 15, 28, '\f', '-', 17, '-', 28, 7, '.', 7, '\f', 1, '/', 6, '!', '\n', '-', '.', '/', 3, '+', 18, '\t'}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b((byte) (KeyEvent.getDeadChar(0, 0) + 67), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 54, new char[]{29, '-', '-', 29, 28, '\r', ')', 20, '0', ' ', 4, 6, '&', 17, 6, '\n', '\b', '\f', '\n', '*', '\b', 6, 31, '/', 3, '\f', 17, '&', '0', 31, '-', 28, ' ', '\"', 3, '(', 14, ',', '-', '&', 6, 29, 6, 4, 2, 17, 17, '\n', '&', 3, '-', ' ', 17, 3, ' ', '/', 2, 15, '\b', '.', 4, 18, ')', 31}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 44382, new char[]{35320, 9258, 54009, 33149, 16303, 59949, 39167, 14117, 58870, 36983, 20133, 64800, 43950, 18038, 62704, 41841, 20914, 3178, 47850, 26936, 1980, 45630, 24767, 7999, 52667, 30822, 5860, 50488, 29621, 11825, 56501, 35645, 14734, 54362, 33423, 12636, 61407, 39514, 18575, 59227, 38275, 16385, 65237, 44289, 23509, 62981, 42116, 21332, 415, 48207, 27342, 6472, 47007, 25113, 4255, 53070, 32147, 10305, 50837, 30019, 9104, 56848, 35986, 15133}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 106), 66 - TextUtils.indexOf((CharSequence) "", '0'), new char[]{24, 16, 20, 24, 4, '\"', 13859, 13859, 0, '\n', ')', 18, ',', 16, '\"', '%', 24, 4, 0, 1, 16, 24, '\n', '\f', '\n', 14, '*', '\b', 3, 20, 1, '#', '#', '\r', '\n', 2, 1, '\"', '#', '\r', '\n', '\f', 1, '*', '!', '\t', '\t', '\b', 25, ')', 11, '$', 22, '\'', '\r', 4, 15, '\n', 21, '/', '\t', '\f', 25, '\f', 24, 18, 13911}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 5346, new char[]{35235, 40113, 41889, 46753, 56736, 57521}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    b((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 90), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2), new char[]{'-', 7, 6, '!', 7, '0', 13864, 13864, 15, 4, 15, 2, 17, 19, '\"', '\f', '\"', 28, 17, '.', 0, '/', ' ', 17, 20, 30, 14, 0, ' ', '\r', ',', 15, 11, '\b', 13865, 13865}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) View.resolveSize(0, 0), 6029 - TextUtils.indexOf((CharSequence) "", '0'), TextUtils.getOffsetBefore("", 0) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char c = (char) (13184 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
            int gidForName = 1648 - Process.getGidForName("");
            int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 26;
            byte[] bArr = $$a;
            byte b = bArr[5];
            Object[] objArr13 = new Object[1];
            c(b, (short) (b | 187), (byte) (-bArr[62]), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(c, gidForName, touchSlop, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i6 = AudioAttributesImplApi21Parcelizer + 125;
            AudioAttributesImplApi26Parcelizer = i6 % 128;
            int i7 = i6 % 2;
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cMyTid = (char) (13183 - (Process.myTid() >> 22));
                int modifierMetaStateMask = 1648 - ((byte) KeyEvent.getModifierMetaStateMask());
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 26;
                Object[] objArr14 = new Object[1];
                c(r0[30], (short) 144, (byte) (-$$a[9]), objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(cMyTid, modifierMetaStateMask, scrollDefaultDelay, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            b((byte) ((ViewConfiguration.getScrollBarSize() >> 8) + 36), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 6, new char[]{'*', '\t', 21, '\f', 6, 14, 11, 21, '#', 1, ',', ')', 3, 20, '\f', '\r'}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            b((byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 61), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 19, new char[]{'&', 4, 18, ' ', 18, '&', 16, '&', 0, 11, 2, 27, 23, 28, 4, '\n'}, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, -683766327};
                byte[] bArr2 = $$g;
                Object[] objArr18 = new Object[1];
                d(bArr2[98], (byte) 89, (byte) (bArr2[48] + 1), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b2 = bArr2[26];
                Object[] objArr19 = new Object[1];
                d(b2, bArr2[25], b2, objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char keyRepeatTimeout = (char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 13183);
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1649;
                    int i8 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26;
                    Object[] objArr20 = new Object[1];
                    c(r7[30], (short) 144, (byte) (-$$a[9]), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(keyRepeatTimeout, maxKeyCode, i8, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 60067, new char[]{35323, 25433, 23716, 18927, 9025, 7314, 2544, 58127, 56477, 51708, 41846, 40102, 35327, 25376, 23704, 18908, 8999, 7332, 2524, 58146, 56445, 51648}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    a(63197 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), new char[]{35327, 32555, 25665, 28029, 21149, 23470, 16592, 18883, 16151, 9278, 11604, 4753, 7087, 206, 2537}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char doubleTapTimeout = (char) (13183 - (ViewConfiguration.getDoubleTapTimeout() >> 16));
                        int mode = 1649 - View.MeasureSpec.getMode(0);
                        int i9 = 27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                        byte[] bArr3 = $$a;
                        byte b3 = bArr3[30];
                        Object[] objArr23 = new Object[1];
                        c(b3, (short) (b3 | 101), (byte) (-bArr3[9]), objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(doubleTapTimeout, mode, i9, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 13183);
                        int i10 = 1649 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        int i11 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25;
                        byte[] bArr4 = $$a;
                        byte b4 = bArr4[5];
                        Object[] objArr24 = new Object[1];
                        c(b4, (short) (b4 | 187), (byte) (-bArr4[62]), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(threadPriority, i10, i11, -133433128, false, (String) objArr24[0], null);
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
        int i12 = ((int[]) objArr[3])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 != i12) {
            long j = -1;
            long j2 = ((long) (i13 ^ i12)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4536 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 6055 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 41 - TextUtils.lastIndexOf("", '0'), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {1568245951, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), View.MeasureSpec.getMode(0) + 6030, 24 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                byte b5 = (byte) (-$$g[77]);
                Object[] objArr26 = new Object[1];
                d(b5, (byte) (b5 - 5), r2[18], objArr26);
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
        parseAdaptationSet parseadaptationsetRemoteActionCompatParcelizer = parseAdaptationSet.RemoteActionCompatParcelizer(getLayoutInflater());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parseadaptationsetRemoteActionCompatParcelizer, "");
        this.AudioAttributesCompatParcelizer = parseadaptationsetRemoteActionCompatParcelizer;
        if (parseadaptationsetRemoteActionCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            parseadaptationsetRemoteActionCompatParcelizer = null;
        }
        setContentView(parseadaptationsetRemoteActionCompatParcelizer.IconCompatParcelizer());
        getCameraMotionListener.Companion companion = getCameraMotionListener.INSTANCE;
        Intent intent = getIntent();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(intent, "");
        getCameraMotionListener getcameramotionlistenerIconCompatParcelizer = getCameraMotionListener.Companion.IconCompatParcelizer(intent);
        if (getcameramotionlistenerIconCompatParcelizer != null) {
            int i14 = AudioAttributesImplApi26Parcelizer + 61;
            AudioAttributesImplApi21Parcelizer = i14 % 128;
            if (i14 % 2 == 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            if (p0 == null) {
                CourseSwitchFragment.Companion companion2 = CourseSwitchFragment.INSTANCE;
                CmcdConfigurationRequestConfig.write(this, R.id.container, CourseSwitchFragment.Companion.AudioAttributesCompatParcelizer(getcameramotionlistenerIconCompatParcelizer));
            }
        }
    }

    private static void b(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = RemoteActionCompatParcelizer;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $10 + 85;
                $11 = i6 % 128;
                if (i6 % i3 == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 7015 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 31 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), -626716224, false, "o", new Class[]{Integer.TYPE});
                        }
                        cArr3[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        i5 <<= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i5])};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), Color.blue(0) + 7015, 29 - TextUtils.lastIndexOf("", '0', 0, 0), -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i5++;
                }
                i3 = 2;
                j = 0;
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(IconCompatParcelizer)};
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        if (objRemoteActionCompatParcelizer3 == null) {
            objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 7014 - ((byte) KeyEvent.getModifierMetaStateMask()), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i7 = $11 + 99;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr4[i] = (char) (cArr[i] % b);
                i2 = i;
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i8 = $10 + 1;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                needsstartedservice.AudioAttributesCompatParcelizer = 1;
            } else {
                needsstartedservice.AudioAttributesCompatParcelizer = 0;
            }
            while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                    int i9 = $10 + 63;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                } else {
                    Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(105000849);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (48194 - Gravity.getAbsoluteGravity(0, 0)), 20126 - TextUtils.getTrimmedLength(""), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 21, 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                        int i11 = $11 + 119;
                        $10 = i11 % 128;
                        int i12 = i11 % 2;
                        Object[] objArr6 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(50135433);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            objRemoteActionCompatParcelizer5 = startForeground.read((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.getCapsMode("", 0, 0) + 19368, 19 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).intValue();
                        int i13 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i13];
                    } else if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                        int i14 = $10 + 47;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                        needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                        int i16 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                        int i17 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i16];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i17];
                    } else {
                        int i18 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        int i19 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i18];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i19];
                    }
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
                int i20 = $10 + 115;
                $11 = i20 % 128;
                int i21 = i20 % 2;
            }
        }
        for (int i22 = 0; i22 < i; i22++) {
            cArr4[i22] = (char) (cArr4[i22] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a5  */
    @Override // kotlin.getVertexCount, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 354
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getSubMeshCount.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // kotlin.getVertexCount, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getSubMeshCount.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00b5  */
    @Override // kotlin.getVertexCount, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5819
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getSubMeshCount.attachBaseContext(android.content.Context):void");
    }

    static {
        MediaBrowserCompatItemReceiver = 0;
        AudioAttributesImplBaseParcelizer();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatCustomActionResultReceiver + 45;
        MediaBrowserCompatItemReceiver = i % 128;
        int i2 = i % 2;
    }

    @getMagicModuleMeta
    public static final Intent IconCompatParcelizer(Context context, getCameraMotionListener getcameramotionlistener) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 9;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Intent intentRemoteActionCompatParcelizer = Companion.RemoteActionCompatParcelizer(context, getcameramotionlistener);
        int i4 = AudioAttributesImplApi21Parcelizer + 113;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        return intentRemoteActionCompatParcelizer;
    }

    @Override // kotlin.getVertexCount, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 43;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 27 / 0;
        }
        int i5 = AudioAttributesImplApi26Parcelizer + 89;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
    }

    static void AudioAttributesImplBaseParcelizer() {
        AudioAttributesCompatParcelizer = 3447499553768020561L;
        RemoteActionCompatParcelizer = new char[]{6406, 6416, 6525, 6476, 6496, 6474, 6491, 6473, 6407, 6490, 6425, 6477, 6469, 6430, 6404, 6505, 6478, 6492, 6405, 6414, 6468, 6507, 6409, 6464, 6410, 6470, 6494, 6488, 6408, 6489, 6471, 6424, 6418, 6428, 6431, 6411, 6479, 6481, 6427, 6465, 6415, 6493, 6426, 6475, 6466, 6417, 6429, 6412, 6523};
        IconCompatParcelizer = (char) 11445;
    }
}
