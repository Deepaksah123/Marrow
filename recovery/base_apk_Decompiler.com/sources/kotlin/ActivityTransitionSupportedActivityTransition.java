package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.getGranularity;
import kotlin.setDurationMillis;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/ActivityTransitionSupportedActivityTransition;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActivityTransitionSupportedActivityTransition extends ActivityTransitionResult {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char AudioAttributesCompatParcelizer;
    private static int AudioAttributesImplBaseParcelizer;
    private static char[] RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] write;
    private static final byte[] $$j = {TarConstants.LF_SYMLINK, -57, 8, -14, TarConstants.LF_CHR, -71, -12, -29, 36, -59, -3, -35, 71, -43, -66, 3, -19, -20, 32, -65, -14, -12, -5, -7, -33, -13, 1, -28, 28, -50, -17, -10, 28, -45, -32, 0, 7, -31, -31, 1, -16, -21, -11, -31, 7, -27, -9, -5, -25, 1, -33, -22, -16, -19, 1, 22, -48, -31, -3, -20, -13, 29, -58, -12, -17, 1, -33, 22, -31, -31, 1, -16, -21, -11, -31, 7, -27, TarConstants.LF_CHR, -71, -12, -29, 37, -49, -20, -25, -12, -15, 1, -13, 1, -41, -17, -15, -12, -1, -10, -26, 25, -55, -17, -9, -2, -33};
    private static final int $$k = 103;
    private static final byte[] $$d = {32, -59, 22, 74, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 122;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static int IconCompatParcelizer = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.ActivityTransitionSupportedActivityTransition.$$d
            int r1 = 44 - r5
            int r7 = 114 - r7
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r5 = 43 - r5
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r5
            r7 = r6
            r4 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            r3 = r0[r6]
        L25:
            int r6 = r6 + 1
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityTransitionSupportedActivityTransition.g(byte, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = 43 - r8
            int r7 = 76 - r7
            byte[] r0 = kotlin.ActivityTransitionSupportedActivityTransition.$$j
            int r6 = r6 + 82
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2a
        L11:
            r3 = r2
        L12:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + (-14)
            r7 = r3
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityTransitionSupportedActivityTransition.h(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.ActivityTransitionSupportedActivityTransition$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/ActivityTransitionSupportedActivityTransition$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/setDurationMillis;", "p1", "Landroid/content/Intent;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;Lo/setDurationMillis;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent RemoteActionCompatParcelizer(Context p0, setDurationMillis p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) ActivityTransitionSupportedActivityTransition.class);
            p1.AudioAttributesCompatParcelizer(intent);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void e(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = write;
        long j = 0;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getEdgeSlop() >> 16), 11613 - Color.red(0), 21 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i7++;
                    j = 0;
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
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                int i8 = $11 + 39;
                $10 = i8 % 128;
                if (i8 % 2 == 0 ? bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] != 1 : bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] != 1) {
                    int i9 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.getTrimmedLength("") + 31589), 9863 - (Process.myPid() >> 22), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 64, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i10 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) KeyEvent.normalizeMetaState(0), 22959 - View.MeasureSpec.getSize(0), (ViewConfiguration.getPressedStateDuration() >> 16) + 43, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                        int i11 = $10 + 45;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (37822 - Color.blue(0)), 9754 - KeyEvent.getDeadChar(0, 0), 27 - TextUtils.getTrimmedLength(""), 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i13 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i13, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i13);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i4 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            int i14 = $11 + 47;
            $10 = i14 % 128;
            i = 2;
            int i15 = i14 % 2;
            cArr3 = cArr6;
        } else {
            i = 2;
        }
        if (i5 > 0) {
            int i16 = $10 + 13;
            $11 = i16 % 128;
            int i17 = i16 % i;
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0166  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(byte r33, int r34, char[] r35, java.lang.Object[] r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityTransitionSupportedActivityTransition.f(byte, int, char[], java.lang.Object[]):void");
    }

    @Override // kotlin.ActivityTransitionResult, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        e(new byte[]{1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1}, new int[]{0, 18, 24, 9}, true, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object obj = null;
        Object[] objArr3 = new Object[1];
        f((byte) (115 - (ViewConfiguration.getTouchSlop() >> 8)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 1, new char[]{'$', '\b', 6, 3, 13937}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                f((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) - 23, new char[]{'!', 17, 11, 30, 30, 0, '\n', '\b', '&', 31, 21, '\n', '%', 28, 23, '\t', 0, 3, 15, 2, 25, ')', '\'', ' ', 30, '\n'}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                f((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 46), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 14, new char[]{'!', 23, 13850, 13850, 26, 18, 14, '%', 13852, 13852, 5, 3, 31, ' ', 23, '\t', '!', 14}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i2 = MediaBrowserCompatItemReceiver + 73;
                MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
                if (i2 % 2 != 0) {
                    boolean z = baseContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i3 = MediaBrowserCompatItemReceiver + 39;
                MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
                int i4 = i3 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (KeyEvent.normalizeMetaState(0) + 4535), 6054 - (ViewConfiguration.getWindowTouchSlop() >> 8), 43 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    f((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 45), 48 - Color.blue(0), new char[]{29, ',', '\r', '&', '%', 16, '&', '-', '\'', '\t', 15, ')', 27, '\'', '\b', ',', 11, 24, 31, '\t', 18, 27, '#', '%', 20, '&', '&', 30, 14, 27, '\n', 17, 24, 4, 18, ' ', '%', 31, '#', 17, '\r', 16, '+', 1, 15, '&', '\'', 27}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    e(new byte[]{1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0}, new int[]{18, 64, 0, 58}, false, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    e(new byte[]{0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0}, new int[]{82, 64, 52, 0}, false, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    f((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 10), 68 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{'%', 18, 17, 23, 19, '\'', 13794, 13794, '\n', 30, 3, 5, 4, 29, '!', 21, 16, '\f', 14, 11, 18, '%', '\'', ' ', 30, 17, 31, ' ', 19, 17, '\b', 14, 24, '!', 30, 11, 20, '.', 24, '!', '\'', ' ', '\t', 28, 29, 30, '-', 30, 23, 3, 2, '\t', 20, 16, ' ', 25, 23, 2, 0, 4, '.', 23, 4, 27, 20, 17, 13846}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    e(new byte[]{1, 1, 1, 1, 0, 0}, new int[]{146, 6, 0, 0}, false, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    f((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 6), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1, new char[]{0, 24, '#', 17, '\n', 4, 13842, 13842, '\n', 15, '&', 20, '$', '\r', '\'', '\t', '#', 16, 15, '+', '-', '\n', 11, '\t', '#', 20, '&', '\n', 18, 21, '\"', '%', 24, 28, 13843, 13843}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) View.combineMeasuredStates(0, 0), 6031 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 24 - (ViewConfiguration.getLongPressTimeout() >> 16), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
                    int i5 = MediaBrowserCompatItemReceiver + 61;
                    MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
                    int i6 = i5 % 2;
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
            char scrollBarSize = (char) (13183 - (ViewConfiguration.getScrollBarSize() >> 8));
            int windowTouchSlop = 1649 - (ViewConfiguration.getWindowTouchSlop() >> 8);
            int maximumFlingVelocity = 26 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
            byte[] bArr = $$d;
            byte b = bArr[5];
            Object[] objArr13 = new Object[1];
            g(b, b, (byte) (-bArr[62]), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(scrollBarSize, windowTouchSlop, maximumFlingVelocity, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i7 = MediaBrowserCompatCustomActionResultReceiver + 15;
            MediaBrowserCompatItemReceiver = i7 % 128;
            if (i7 % 2 == 0) {
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 13184);
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1649;
                    int i8 = (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26;
                    Object[] objArr14 = new Object[1];
                    g(r0[30], r0[27], (byte) (-$$d[9]), objArr14);
                    objRemoteActionCompatParcelizer4 = startForeground.read(cIndexOf, fadingEdgeLength, i8, -1033747278, false, (String) objArr14[0], null);
                }
                Object obj2 = null;
                obj2.hashCode();
                throw null;
            }
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer5 == null) {
                char fadingEdgeLength2 = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 13183);
                int i9 = 1650 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                int bitsPerPixel = 25 - ImageFormat.getBitsPerPixel(0);
                Object[] objArr15 = new Object[1];
                g(r1[30], r1[27], (byte) (-$$d[9]), objArr15);
                objRemoteActionCompatParcelizer5 = startForeground.read(fadingEdgeLength2, i9, bitsPerPixel, -1033747278, false, (String) objArr15[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer5).get(null);
        } else {
            Object[] objArr16 = new Object[1];
            e(new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{152, 16, 186, 0}, true, objArr16);
            Class<?> cls3 = Class.forName((String) objArr16[0]);
            Object[] objArr17 = new Object[1];
            e(new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, new int[]{168, 16, 0, 0}, false, objArr17);
            try {
                Object[] objArr18 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr17[0], Object.class).invoke(null, this)).intValue()), 0, -1479217783};
                byte[] bArr2 = $$j;
                Object[] objArr19 = new Object[1];
                h(bArr2[61], (byte) 73, bArr2[35], objArr19);
                Class<?> cls4 = Class.forName((String) objArr19[0]);
                Object[] objArr20 = new Object[1];
                h(bArr2[81], (byte) (-bArr2[37]), (byte) ($$k & 190), objArr20);
                objArr = (Object[]) cls4.getMethod((String) objArr20[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr18);
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer6 == null) {
                    char cIndexOf2 = (char) (13182 - TextUtils.indexOf((CharSequence) "", '0'));
                    int longPressTimeout = 1649 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    int mirror = AndroidCharacter.getMirror('0') - 22;
                    Object[] objArr21 = new Object[1];
                    g(r7[30], r7[27], (byte) (-$$d[9]), objArr21);
                    objRemoteActionCompatParcelizer6 = startForeground.read(cIndexOf2, longPressTimeout, mirror, -1033747278, false, (String) objArr21[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer6).set(null, objArr);
                try {
                    Object[] objArr22 = new Object[1];
                    e(new byte[]{0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0}, new int[]{184, 22, 28, 4}, false, objArr22);
                    Class<?> cls5 = Class.forName((String) objArr22[0]);
                    Object[] objArr23 = new Object[1];
                    f((byte) (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, new char[]{' ', 11, '&', 31, 25, ' ', '\r', 30, 24, ' ', 2, 18, 1, 30, 13824}, objArr23);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr23[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char mirror2 = (char) (AndroidCharacter.getMirror('0') + 13135);
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1649;
                        int i10 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 26;
                        Object[] objArr24 = new Object[1];
                        g(r7[30], (short) 76, (byte) (-$$d[9]), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(mirror2, tapTimeout, i10, 54351865, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer8 == null) {
                        char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 13183);
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1649;
                        int maxKeyCode = 26 - (KeyEvent.getMaxKeyCode() >> 16);
                        byte[] bArr3 = $$d;
                        byte b2 = bArr3[5];
                        Object[] objArr25 = new Object[1];
                        g(b2, b2, (byte) (-bArr3[62]), objArr25);
                        objRemoteActionCompatParcelizer8 = startForeground.read(offsetAfter, pressedStateDuration, maxKeyCode, -133433128, false, (String) objArr25[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer8).set(null, lValueOf2);
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
        int i11 = ((int[]) objArr[3])[0];
        int i12 = ((int[]) objArr[2])[0];
        if (i12 != i11) {
            long j = -1;
            long j2 = ((long) (i12 ^ i11)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer9 == null) {
                objRemoteActionCompatParcelizer9 = startForeground.read((char) (4535 - TextUtils.indexOf("", "", 0, 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 6054, 43 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer9).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i13 = MediaBrowserCompatCustomActionResultReceiver + 45;
            MediaBrowserCompatItemReceiver = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr26 = {2032916609, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), 6030 - ExpandableListView.getPackedPositionType(0L), (Process.myPid() >> 22) + 24);
                byte[] bArr4 = $$j;
                Object[] objArr27 = new Object[1];
                h(bArr4[35], (byte) (-bArr4[45]), (byte) (-bArr4[86]), objArr27);
                cls6.getMethod((String) objArr27[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr26);
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
        setContentView(R.layout.activity_schema_review);
        setDurationMillis.Companion companion = setDurationMillis.INSTANCE;
        Intent intent = getIntent();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(intent, "");
        setDurationMillis setdurationmillisRemoteActionCompatParcelizer = setDurationMillis.Companion.RemoteActionCompatParcelizer(intent);
        getGranularity.Companion companion2 = getGranularity.INSTANCE;
        getGranularity getgranularityWrite = getGranularity.Companion.write(setdurationmillisRemoteActionCompatParcelizer);
        if (p0 == null) {
            CmcdConfigurationRequestConfig.write(this, R.id.container, getgranularityWrite);
        }
    }

    @Override // kotlin.ActivityTransitionResult, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 37;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21), 26 - (ViewConfiguration.getKeyRepeatDelay() >> 16), new char[]{'!', 17, 11, 30, 30, 0, '\n', '\b', '&', 31, 21, '\n', '%', 28, 23, '\t', 0, 3, 15, 2, 25, ')', '\'', ' ', 30, '\n'}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f((byte) (50 - Color.red(0)), 19 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{'!', 23, 13850, 13850, 26, 18, 14, '%', 13852, 13852, 5, 3, 31, ' ', 23, '\t', '!', 14}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = MediaBrowserCompatItemReceiver + 97;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i6 = MediaBrowserCompatItemReceiver + 81;
            MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
            try {
                if (i6 % 2 != 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1))), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6054, Drawable.resolveOpacity(0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-16777216) - Color.rgb(0, 0, 0)), 6030 - View.resolveSize(0, 0), 23 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    obj.hashCode();
                    throw null;
                }
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ExpandableListView.getPackedPositionChild(0L) + 4536), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6053, 42 - KeyEvent.keyCodeFromString(""), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getLongPressTimeout() >> 16), 6030 - View.getDefaultSize(0, 0), 23 - MotionEvent.axisFromString(""), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke2, objArr4);
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00d2  */
    @Override // kotlin.ActivityTransitionResult, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 390
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityTransitionSupportedActivityTransition.onPause():void");
    }

    @Override // kotlin.ActivityTransitionResult, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        String strValueOf;
        String strValueOf2;
        Object[] objArr;
        Object[] objArr2;
        List<Object[]> list;
        Context applicationContext = context;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 61;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.attachBaseContext(context);
        Object[] objArr3 = new Object[1];
        e(new byte[]{1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1}, new int[]{0, 18, 24, 9}, true, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        f((byte) (115 - Color.argb(0, 0, 0, 0)), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 4, new char[]{'$', '\b', 6, 3, 13937}, objArr4);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context applicationContext2 = applicationContext != null ? ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : context.getApplicationContext() : applicationContext;
            if (applicationContext2 != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4534 - TextUtils.lastIndexOf("", '0', 0)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6053, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    f((byte) (80 - KeyEvent.getDeadChar(0, 0)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 48, new char[]{29, ',', '\r', '&', '%', 16, '&', '-', '\'', '\t', 15, ')', 27, '\'', '\b', ',', 11, 24, 31, '\t', 18, 27, '#', '%', 20, '&', '&', 30, 14, 27, '\n', 17, 24, 4, 18, ' ', '%', 31, '#', 17, '\r', 16, '+', 1, 15, '&', '\'', 27}, objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    e(new byte[]{1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0}, new int[]{18, 64, 0, 58}, false, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    e(new byte[]{0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0}, new int[]{82, 64, 52, 0}, false, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    f((byte) (44 - TextUtils.lastIndexOf("", '0', 0)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 67, new char[]{'%', 18, 17, 23, 19, '\'', 13794, 13794, '\n', 30, 3, 5, 4, 29, '!', 21, 16, '\f', 14, 11, 18, '%', '\'', ' ', 30, 17, 31, ' ', 19, 17, '\b', 14, 24, '!', 30, 11, 20, '.', 24, '!', '\'', ' ', '\t', 28, 29, 30, '-', 30, 23, 3, 2, '\t', 20, 16, ' ', 25, 23, 2, 0, 4, '.', 23, 4, 27, 20, 17, 13846}, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    e(new byte[]{1, 1, 1, 1, 0, 0}, new int[]{146, 6, 0, 0}, false, objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f((byte) ((Process.myPid() >> 22) + 103), 36 - KeyEvent.keyCodeFromString(""), new char[]{0, 24, '#', 17, '\n', 4, 13842, 13842, '\n', 15, '&', 20, '$', '\r', '\'', '\t', '#', 16, 15, '+', '-', '\n', 11, '\t', '#', 20, '&', '\n', 18, 21, '\"', '%', 24, 28, 13843, 13843}, objArr10);
                    Object[] objArr11 = {applicationContext2, str, str2, str3, str4, true, str5, (String) objArr10[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 6030, Color.argb(0, 0, 0, 0) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr11);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        try {
            try {
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-18205161);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 61148);
                    int offsetAfter = 2145 - TextUtils.getOffsetAfter("", 0);
                    int iKeyCodeFromString = 12 - KeyEvent.keyCodeFromString("");
                    byte b = (byte) ($$e & TsExtractor.TS_STREAM_TYPE_AC4);
                    Object[] objArr12 = new Object[1];
                    g(b, (short) (b | 69), $$d[5], objArr12);
                    objRemoteActionCompatParcelizer3 = startForeground.read(windowTouchSlop, offsetAfter, iKeyCodeFromString, -2136739198, false, (String) objArr12[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-629126231);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char offsetBefore = (char) (61148 - TextUtils.getOffsetBefore("", 0));
                        int iIndexOf = 2144 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int i4 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11;
                        Object[] objArr13 = new Object[1];
                        g(r11[19], (short) ($$e & 500), (byte) (-$$d[62]), objArr13);
                        objRemoteActionCompatParcelizer4 = startForeground.read(offsetBefore, iIndexOf, i4, -1530294468, false, (String) objArr13[0], null);
                    }
                    list = (List) ((Field) objRemoteActionCompatParcelizer4).get(null);
                } else {
                    Object[] objArr14 = new Object[1];
                    e(new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{152, 16, 186, 0}, true, objArr14);
                    Class<?> cls2 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    e(new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, new int[]{168, 16, 0, 0}, false, objArr15);
                    int iIntValue2 = ((Integer) cls2.getMethod((String) objArr15[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr16 = {-209773216};
                        Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-173351824);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            objRemoteActionCompatParcelizer5 = startForeground.read((char) (KeyEvent.normalizeMetaState(0) + 45845), 914 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 10 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1948051227, false, null, new Class[]{Integer.TYPE});
                        }
                        try {
                            Object[] objArr17 = {Integer.valueOf(iIntValue2), ((Constructor) objRemoteActionCompatParcelizer5).newInstance(objArr16)};
                            Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1891595430);
                            if (objRemoteActionCompatParcelizer6 == null) {
                                char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 61148);
                                int edgeSlop = 2145 - (ViewConfiguration.getEdgeSlop() >> 16);
                                int iBlue = Color.blue(0) + 12;
                                Object[] objArr18 = new Object[1];
                                g((byte) ($$e & 28), (short) 141, $$d[61], objArr18);
                                objRemoteActionCompatParcelizer6 = startForeground.read(minimumFlingVelocity, edgeSlop, iBlue, 251047987, false, (String) objArr18[0], new Class[]{Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) View.MeasureSpec.getMode(0), 557 - (ViewConfiguration.getTapTimeout() >> 16), AndroidCharacter.getMirror('0') - 30)});
                            }
                            list = (List) ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr17);
                            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-629126231);
                            if (objRemoteActionCompatParcelizer7 == null) {
                                char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 61148);
                                int defaultSize = View.getDefaultSize(0, 0) + 2145;
                                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0') + 13;
                                Object[] objArr19 = new Object[1];
                                g(r12[19], (short) ($$e & 500), (byte) (-$$d[62]), objArr19);
                                objRemoteActionCompatParcelizer7 = startForeground.read(doubleTapTimeout, defaultSize, iIndexOf2, -1530294468, false, (String) objArr19[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer7).set(null, list);
                            Object[] objArr20 = new Object[1];
                            e(new byte[]{0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0}, new int[]{184, 22, 28, 4}, false, objArr20);
                            Class<?> cls3 = Class.forName((String) objArr20[0]);
                            Object[] objArr21 = new Object[1];
                            f((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 98), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 96, new char[]{' ', 11, '&', 31, 25, ' ', '\r', 30, 24, ' ', 2, 18, 1, 30, 13824}, objArr21);
                            long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr21[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue);
                            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(301834150);
                            if (objRemoteActionCompatParcelizer8 == null) {
                                char offsetAfter2 = (char) (61148 - TextUtils.getOffsetAfter("", 0));
                                int threadPriority = 2145 - ((Process.getThreadPriority(0) + 20) >> 6);
                                int i5 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11;
                                byte[] bArr = $$d;
                                Object[] objArr22 = new Object[1];
                                g(bArr[45], (short) 160, bArr[0], objArr22);
                                objRemoteActionCompatParcelizer8 = startForeground.read(offsetAfter2, threadPriority, i5, 1874090803, false, (String) objArr22[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer8).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                            Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(-18205161);
                            if (objRemoteActionCompatParcelizer9 == null) {
                                char c = (char) (61148 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                int iCombineMeasuredStates = 2145 - View.combineMeasuredStates(0, 0);
                                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 13;
                                byte b2 = (byte) ($$e & TsExtractor.TS_STREAM_TYPE_AC4);
                                Object[] objArr23 = new Object[1];
                                g(b2, (short) (b2 | 69), $$d[5], objArr23);
                                objRemoteActionCompatParcelizer9 = startForeground.read(c, iCombineMeasuredStates, modifierMetaStateMask, -2136739198, false, (String) objArr23[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer9).set(null, lValueOf2);
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
                for (Object[] objArr24 : list) {
                    int i6 = ((int[]) objArr24[3])[0];
                    int i7 = ((int[]) objArr24[1])[0];
                    if (i7 != i6) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr24[2];
                        if (strArr != null) {
                            for (String str6 : strArr) {
                                arrayList.add(str6);
                            }
                        }
                        long j = -1;
                        long j2 = ((long) (i7 ^ i6)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
                        long j3 = 0;
                        long j4 = j2 | (((long) 10) << 32) | (j3 - ((j3 >> 63) << 32));
                        try {
                            Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                            if (objRemoteActionCompatParcelizer10 == null) {
                                objRemoteActionCompatParcelizer10 = startForeground.read((char) (4534 - ExpandableListView.getPackedPositionChild(0L)), 6054 - (ViewConfiguration.getTouchSlop() >> 8), 42 - ((Process.getThreadPriority(0) + 20) >> 6), -764908173, false, "IconCompatParcelizer", new Class[0]);
                            }
                            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer10).invoke(null, null);
                            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                            int i8 = MediaBrowserCompatCustomActionResultReceiver + 101;
                            MediaBrowserCompatItemReceiver = i8 % 128;
                            int i9 = i8 % 2;
                            try {
                                Object[] objArr25 = {-209773216, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, false};
                                Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), Color.red(0) + 6030, 25 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                byte[] bArr2 = $$j;
                                Object[] objArr26 = new Object[1];
                                h(bArr2[35], (byte) (-bArr2[45]), (byte) (-bArr2[86]), objArr26);
                                cls4.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
                            } catch (Throwable th4) {
                                Throwable cause4 = th4.getCause();
                                if (cause4 == null) {
                                    throw th4;
                                }
                                throw cause4;
                            }
                        } catch (Throwable th5) {
                            Throwable cause5 = th5.getCause();
                            if (cause5 == null) {
                                throw th5;
                            }
                            throw cause5;
                        }
                    }
                }
                int i10 = MediaBrowserCompatItemReceiver + 31;
                MediaBrowserCompatCustomActionResultReceiver = i10 % 128;
                int i11 = i10 % 2;
            } catch (Throwable th6) {
                Throwable cause6 = th6.getCause();
                if (cause6 == null) {
                    throw th6;
                }
                throw cause6;
            }
        } catch (Throwable th7) {
            Object[] objArr27 = new Object[1];
            e(null, new int[]{206, 11, 150, 2}, true, objArr27);
            String str7 = (String) objArr27[0];
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintStream printStream = new PrintStream(byteArrayOutputStream);
                th7.printStackTrace(printStream);
                printStream.close();
                strValueOf = byteArrayOutputStream.toString(CharsetNames.UTF_8);
            } catch (Throwable unused) {
                strValueOf = String.valueOf(th7);
            }
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(strValueOf);
            arrayList2.add(str7);
            Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer11 == null) {
                objRemoteActionCompatParcelizer11 = startForeground.read((char) (4535 - KeyEvent.keyCodeFromString("")), TextUtils.lastIndexOf("", '0', 0) + 6055, 42 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke3 = ((Method) objRemoteActionCompatParcelizer11).invoke(null, null);
            Object[] objArr28 = {-209773216, 81604378625L, arrayList2, TrainingApplication.RemoteActionCompatParcelizer(), false};
            Class cls5 = (Class) startForeground.IconCompatParcelizer((char) (KeyEvent.getMaxKeyCode() >> 16), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6029, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25);
            byte[] bArr3 = $$j;
            Object[] objArr29 = new Object[1];
            h(bArr3[35], (byte) (-bArr3[45]), (byte) (-bArr3[86]), objArr29);
            cls5.getMethod((String) objArr29[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke3, objArr28);
        }
        if (applicationContext != null) {
            try {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : context.getApplicationContext();
            } catch (Throwable th8) {
                Object[] objArr30 = new Object[1];
                f((byte) (77 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 24, new char[]{14, 24, '\f', 11, ')', 16, 15, 18, '\n', 4, 13818}, objArr30);
                String str8 = (String) objArr30[0];
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    PrintStream printStream2 = new PrintStream(byteArrayOutputStream2);
                    th8.printStackTrace(printStream2);
                    printStream2.close();
                    strValueOf2 = byteArrayOutputStream2.toString(CharsetNames.UTF_8);
                } catch (Throwable unused2) {
                    strValueOf2 = String.valueOf(th8);
                }
                ArrayList arrayList3 = new ArrayList(2);
                arrayList3.add(strValueOf2);
                arrayList3.add(str8);
                Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer12 == null) {
                    objRemoteActionCompatParcelizer12 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 4534), 6054 - Color.argb(0, 0, 0, 0), Drawable.resolveOpacity(0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke4 = ((Method) objRemoteActionCompatParcelizer12).invoke(null, null);
                Object[] objArr31 = {-209773216, 81604378625L, arrayList3, TrainingApplication.RemoteActionCompatParcelizer(), false};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) ExpandableListView.getPackedPositionType(0L), (Process.myPid() >> 22) + 6030, Drawable.resolveOpacity(0, 0) + 24);
                byte[] bArr4 = $$j;
                Object[] objArr32 = new Object[1];
                h(bArr4[35], (byte) (-bArr4[45]), (byte) (-bArr4[86]), objArr32);
                cls6.getMethod((String) objArr32[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke4, objArr31);
            }
        }
        try {
            Object[] objArr33 = {-209773216};
            Object objRemoteActionCompatParcelizer13 = startForeground.RemoteActionCompatParcelizer(-1128409246);
            if (objRemoteActionCompatParcelizer13 == null) {
                objRemoteActionCompatParcelizer13 = startForeground.read((char) View.combineMeasuredStates(0, 0), View.resolveSizeAndState(0, 0, 0) + 1991, 12 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1024191497, false, null, new Class[]{Integer.TYPE});
            }
            try {
                Object[] objArr34 = {applicationContext, ((Constructor) objRemoteActionCompatParcelizer13).newInstance(objArr33)};
                Object objRemoteActionCompatParcelizer14 = startForeground.RemoteActionCompatParcelizer(352975618);
                if (objRemoteActionCompatParcelizer14 == null) {
                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 19323);
                    int threadPriority2 = 2759 - ((Process.getThreadPriority(0) + 20) >> 6);
                    int packedPositionType = 99 - ExpandableListView.getPackedPositionType(0L);
                    byte[] bArr5 = $$d;
                    Object[] objArr35 = new Object[1];
                    g(bArr5[45], (short) 160, bArr5[0], objArr35);
                    objRemoteActionCompatParcelizer14 = startForeground.read(keyRepeatDelay, threadPriority2, packedPositionType, 1799372695, false, (String) objArr35[0], new Class[]{Context.class, (Class) startForeground.IconCompatParcelizer((char) (9579 - ((byte) KeyEvent.getModifierMetaStateMask())), TextUtils.getTrimmedLength("") + 3446, TextUtils.getTrimmedLength("") + 144)});
                }
                ((Method) objRemoteActionCompatParcelizer14).invoke(null, objArr34);
                Object objRemoteActionCompatParcelizer15 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                if (objRemoteActionCompatParcelizer15 == null) {
                    char tapTimeout = (char) (13183 - (ViewConfiguration.getTapTimeout() >> 16));
                    int i12 = 1650 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                    int offsetBefore2 = TextUtils.getOffsetBefore("", 0) + 26;
                    byte[] bArr6 = $$d;
                    byte b3 = bArr6[5];
                    Object[] objArr36 = new Object[1];
                    g(b3, b3, (byte) (-bArr6[62]), objArr36);
                    objRemoteActionCompatParcelizer15 = startForeground.read(tapTimeout, i12, offsetBefore2, -133433128, false, (String) objArr36[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer15).getLong(null) != -1) {
                    int i13 = MediaBrowserCompatItemReceiver + 99;
                    MediaBrowserCompatCustomActionResultReceiver = i13 % 128;
                    if (i13 % 2 != 0) {
                        Object objRemoteActionCompatParcelizer16 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                        if (objRemoteActionCompatParcelizer16 == null) {
                            char c2 = (char) (13183 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                            int i14 = (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1649;
                            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 26;
                            Object[] objArr37 = new Object[1];
                            g(r4[30], r4[27], (byte) (-$$d[9]), objArr37);
                            objRemoteActionCompatParcelizer16 = startForeground.read(c2, i14, maxKeyCode, -1033747278, false, (String) objArr37[0], null);
                        }
                        throw null;
                    }
                    Object objRemoteActionCompatParcelizer17 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                    if (objRemoteActionCompatParcelizer17 == null) {
                        char c3 = (char) ((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13183);
                        int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1649;
                        int tapTimeout2 = 26 - (ViewConfiguration.getTapTimeout() >> 16);
                        Object[] objArr38 = new Object[1];
                        g(r6[30], r6[27], (byte) (-$$d[9]), objArr38);
                        objRemoteActionCompatParcelizer17 = startForeground.read(c3, packedPositionGroup, tapTimeout2, -1033747278, false, (String) objArr38[0], null);
                    }
                    objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer17).get(null);
                } else {
                    Object[] objArr39 = new Object[1];
                    e(new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{152, 16, 186, 0}, true, objArr39);
                    Class<?> cls7 = Class.forName((String) objArr39[0]);
                    Object[] objArr40 = new Object[1];
                    e(new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, new int[]{168, 16, 0, 0}, false, objArr40);
                    int iIntValue3 = ((Integer) cls7.getMethod((String) objArr40[0], Object.class).invoke(null, this)).intValue();
                    int i15 = MediaBrowserCompatCustomActionResultReceiver + 51;
                    MediaBrowserCompatItemReceiver = i15 % 128;
                    int i16 = i15 % 2;
                    try {
                        Object[] objArr41 = {Integer.valueOf(iIntValue3), 0, -1046141502};
                        byte[] bArr7 = $$j;
                        Object[] objArr42 = new Object[1];
                        h(bArr7[61], bArr7[35], (byte) (-bArr7[40]), objArr42);
                        Class<?> cls8 = Class.forName((String) objArr42[0]);
                        Object[] objArr43 = new Object[1];
                        h(bArr7[35], (byte) (-bArr7[45]), (byte) (-bArr7[86]), objArr43);
                        objArr = (Object[]) cls8.getMethod((String) objArr43[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr41);
                        Object objRemoteActionCompatParcelizer18 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                        if (objRemoteActionCompatParcelizer18 == null) {
                            char cAlpha = (char) (Color.alpha(0) + 13183);
                            int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1649;
                            int capsMode = 26 - TextUtils.getCapsMode("", 0, 0);
                            Object[] objArr44 = new Object[1];
                            g(r7[30], r7[27], (byte) (-$$d[9]), objArr44);
                            objRemoteActionCompatParcelizer18 = startForeground.read(cAlpha, minimumFlingVelocity2, capsMode, -1033747278, false, (String) objArr44[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer18).set(null, objArr);
                        try {
                            Object[] objArr45 = new Object[1];
                            e(new byte[]{0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0}, new int[]{184, 22, 28, 4}, false, objArr45);
                            Class<?> cls9 = Class.forName((String) objArr45[0]);
                            Object[] objArr46 = new Object[1];
                            f((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 3), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 21, new char[]{' ', 11, '&', 31, 25, ' ', '\r', 30, 24, ' ', 2, 18, 1, 30, 13824}, objArr46);
                            long jLongValue2 = ((Long) cls9.getDeclaredMethod((String) objArr46[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf3 = Long.valueOf(jLongValue2);
                            Object objRemoteActionCompatParcelizer19 = startForeground.RemoteActionCompatParcelizer(2104791916);
                            if (objRemoteActionCompatParcelizer19 == null) {
                                char capsMode2 = (char) (TextUtils.getCapsMode("", 0, 0) + 13183);
                                int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1649;
                                int iIndexOf3 = 25 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                Object[] objArr47 = new Object[1];
                                g(r12[30], (short) 76, (byte) (-$$d[9]), objArr47);
                                objRemoteActionCompatParcelizer19 = startForeground.read(capsMode2, touchSlop, iIndexOf3, 54351865, false, (String) objArr47[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer19).set(null, lValueOf3);
                            Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                            Object objRemoteActionCompatParcelizer20 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                            if (objRemoteActionCompatParcelizer20 == null) {
                                char size = (char) (13183 - View.MeasureSpec.getSize(0));
                                int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1649;
                                int i17 = 26 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                                byte[] bArr8 = $$d;
                                byte b4 = bArr8[5];
                                Object[] objArr48 = new Object[1];
                                g(b4, b4, (byte) (-bArr8[62]), objArr48);
                                objRemoteActionCompatParcelizer20 = startForeground.read(size, maximumFlingVelocity, i17, -133433128, false, (String) objArr48[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer20).set(null, lValueOf4);
                        } catch (Exception unused3) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th9) {
                        Throwable cause7 = th9.getCause();
                        if (cause7 == null) {
                            throw th9;
                        }
                        throw cause7;
                    }
                }
                int i18 = ((int[]) objArr[3])[0];
                int i19 = ((int[]) objArr[2])[0];
                if (i19 != i18) {
                    long j5 = -1;
                    long j6 = ((long) (i19 ^ i18)) & ((((long) 0) << 32) | (j5 - ((j5 >> 63) << 32)));
                    long j7 = 0;
                    long j8 = j6 | (((long) 2) << 32) | (j7 - ((j7 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer21 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer21 == null) {
                        objRemoteActionCompatParcelizer21 = startForeground.read((char) ((ViewConfiguration.getTouchSlop() >> 8) + 4535), 6054 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke5 = ((Method) objRemoteActionCompatParcelizer21).invoke(null, null);
                    Object[] objArr49 = {-209773216, Long.valueOf(j8), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls10 = (Class) startForeground.IconCompatParcelizer((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (ViewConfiguration.getFadingEdgeLength() >> 16) + 6030, 24 - TextUtils.indexOf("", "", 0));
                    byte[] bArr9 = $$j;
                    Object[] objArr50 = new Object[1];
                    h(bArr9[35], (byte) (-bArr9[45]), (byte) (-bArr9[86]), objArr50);
                    cls10.getMethod((String) objArr50[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke5, objArr49);
                }
                Object objRemoteActionCompatParcelizer22 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                if (objRemoteActionCompatParcelizer22 == null) {
                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 943;
                    int maximumDrawingCacheSize = 36 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                    byte b5 = (byte) ($$e & TsExtractor.TS_STREAM_TYPE_AC4);
                    Object[] objArr51 = new Object[1];
                    g(b5, (short) (b5 | 69), $$d[5], objArr51);
                    objRemoteActionCompatParcelizer22 = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), scrollDefaultDelay, maximumDrawingCacheSize, -167186806, false, (String) objArr51[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer22).getLong(null) != -1) {
                    Object objRemoteActionCompatParcelizer23 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer23 == null) {
                        char longPressTimeout = (char) (ViewConfiguration.getLongPressTimeout() >> 16);
                        int i20 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 942;
                        int keyRepeatTimeout = 36 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        Object[] objArr52 = new Object[1];
                        g(r2[19], (short) ($$e & 500), (byte) (-$$d[62]), objArr52);
                        objRemoteActionCompatParcelizer23 = startForeground.read(longPressTimeout, i20, keyRepeatTimeout, -1398865628, false, (String) objArr52[0], null);
                    }
                    objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer23).get(null);
                } else {
                    Object[] objArr53 = new Object[1];
                    e(new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{152, 16, 186, 0}, true, objArr53);
                    Class<?> cls11 = Class.forName((String) objArr53[0]);
                    Object[] objArr54 = new Object[1];
                    e(new byte[]{1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1}, new int[]{168, 16, 0, 0}, false, objArr54);
                    Object[] objArr55 = {Integer.valueOf(((Integer) cls11.getMethod((String) objArr54[0], Object.class).invoke(null, this)).intValue()), 0, -24333252};
                    Object objRemoteActionCompatParcelizer24 = startForeground.RemoteActionCompatParcelizer(-21191141);
                    if (objRemoteActionCompatParcelizer24 == null) {
                        char cBlue = (char) Color.blue(0);
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 943;
                        int iResolveSizeAndState = 36 - View.resolveSizeAndState(0, 0, 0);
                        Object[] objArr56 = new Object[1];
                        g(r6[13], (short) 187, (byte) (-$$d[9]), objArr56);
                        objRemoteActionCompatParcelizer24 = startForeground.read(cBlue, scrollBarSize, iResolveSizeAndState, -2131402098, false, (String) objArr56[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    objArr2 = (Object[]) ((Method) objRemoteActionCompatParcelizer24).invoke(null, objArr55);
                    Object objRemoteActionCompatParcelizer25 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer25 == null) {
                        char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int iNormalizeMetaState = 943 - KeyEvent.normalizeMetaState(0);
                        int maximumFlingVelocity2 = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 36;
                        Object[] objArr57 = new Object[1];
                        g(r4[19], (short) ($$e & 500), (byte) (-$$d[62]), objArr57);
                        objRemoteActionCompatParcelizer25 = startForeground.read(keyRepeatDelay2, iNormalizeMetaState, maximumFlingVelocity2, -1398865628, false, (String) objArr57[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer25).set(null, objArr2);
                    try {
                        Object[] objArr58 = new Object[1];
                        e(new byte[]{0, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0}, new int[]{184, 22, 28, 4}, false, objArr58);
                        Class<?> cls12 = Class.forName((String) objArr58[0]);
                        Object[] objArr59 = new Object[1];
                        f((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 110), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, new char[]{' ', 11, '&', 31, 25, ' ', '\r', 30, 24, ' ', 2, 18, 1, 30, 13824}, objArr59);
                        long jLongValue3 = ((Long) cls12.getDeclaredMethod((String) objArr59[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf5 = Long.valueOf(jLongValue3);
                        Object objRemoteActionCompatParcelizer26 = startForeground.RemoteActionCompatParcelizer(-1539638354);
                        if (objRemoteActionCompatParcelizer26 == null) {
                            char cResolveSize = (char) View.resolveSize(0, 0);
                            int keyRepeatTimeout2 = 943 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int i21 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 35;
                            byte[] bArr10 = $$d;
                            Object[] objArr60 = new Object[1];
                            g(bArr10[45], (short) 160, bArr10[0], objArr60);
                            objRemoteActionCompatParcelizer26 = startForeground.read(cResolveSize, keyRepeatTimeout2, i21, -629981381, false, (String) objArr60[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer26).set(null, lValueOf5);
                        Long lValueOf6 = Long.valueOf(jLongValue3 >> 12);
                        Object objRemoteActionCompatParcelizer27 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                        if (objRemoteActionCompatParcelizer27 == null) {
                            char trimmedLength = (char) TextUtils.getTrimmedLength("");
                            int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 943;
                            int absoluteGravity = 36 - Gravity.getAbsoluteGravity(0, 0);
                            byte b6 = (byte) ($$e & TsExtractor.TS_STREAM_TYPE_AC4);
                            Object[] objArr61 = new Object[1];
                            g(b6, (short) (b6 | 69), $$d[5], objArr61);
                            objRemoteActionCompatParcelizer27 = startForeground.read(trimmedLength, iCombineMeasuredStates2, absoluteGravity, -167186806, false, (String) objArr61[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer27).set(null, lValueOf6);
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                }
                int i22 = ((int[]) objArr2[2])[0];
                int i23 = ((int[]) objArr2[0])[0];
                if (i23 != i22) {
                    long j9 = -1;
                    long j10 = ((long) (i23 ^ i22)) & ((((long) 0) << 32) | (j9 - ((j9 >> 63) << 32)));
                    long j11 = 0;
                    long j12 = j10 | (((long) 1) << 32) | (j11 - ((j11 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer28 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer28 == null) {
                        objRemoteActionCompatParcelizer28 = startForeground.read((char) (4535 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6054, 42 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke6 = ((Method) objRemoteActionCompatParcelizer28).invoke(null, null);
                    Object[] objArr62 = {-209773216, Long.valueOf(j12), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls13 = (Class) startForeground.IconCompatParcelizer((char) (Color.rgb(0, 0, 0) + BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE), 6030 - (ViewConfiguration.getScrollBarSize() >> 8), 'H' - AndroidCharacter.getMirror('0'));
                    byte[] bArr11 = $$j;
                    Object[] objArr63 = new Object[1];
                    h(bArr11[35], (byte) (-bArr11[45]), (byte) (-bArr11[86]), objArr63);
                    cls13.getMethod((String) objArr63[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke6, objArr62);
                }
            } catch (Throwable th10) {
                Throwable cause8 = th10.getCause();
                if (cause8 == null) {
                    throw th10;
                }
                throw cause8;
            }
        } catch (Throwable th11) {
            Throwable cause9 = th11.getCause();
            if (cause9 == null) {
                throw th11;
            }
            throw cause9;
        }
    }

    static {
        AudioAttributesImplBaseParcelizer = 1;
        AudioAttributesImplBaseParcelizer();
        INSTANCE = new Companion(null);
        int i = IconCompatParcelizer + 9;
        AudioAttributesImplBaseParcelizer = i % 128;
        if (i % 2 == 0) {
            int i2 = 79 / 0;
        }
    }

    @Override // kotlin.ActivityTransitionResult, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 111;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatItemReceiver + 53;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    static void AudioAttributesImplBaseParcelizer() {
        write = new char[]{45001, 45036, 45035, 45044, 44814, 44802, 44809, 44811, 45045, 44808, 44801, 44814, 45046, 44811, 44802, 45043, 45021, 45026, 44945, 44988, 44991, 44988, 44999, 45033, 44995, 44986, 44992, 44999, 44993, 45033, 45033, 44999, 44989, 44989, 44988, 44988, 44999, 44995, 44987, 44986, 44990, 44978, 44990, 44987, 44986, 44984, 44993, 44992, 44998, 44998, 44984, 44987, 44990, 44989, 44998, 45033, 45038, 45039, 44993, 44992, 44992, 44990, 44989, 44984, 44986, 44991, 44988, 44990, 44988, 44997, 45039, 45038, 44998, 44999, 44998, 44991, 44985, 44995, 45033, 44995, 44985, 44998, 44993, 45047, 45047, 44828, 45044, 45039, 45044, 44811, 44808, 44818, 44810, 45037, 45026, 44810, 44828, 44818, 44808, 44810, 44831, 45047, 45039, 45039, 45036, 45036, 45027, 44809, 44818, 44808, 45024, 45026, 45037, 45026, 45024, 45044, 44810, 44808, 44829, 44829, 44810, 44810, 45045, 45039, 45045, 45044, 45047, 45044, 45039, 45046, 45045, 44810, 44819, 44829, 45047, 45037, 45026, 45045, 45044, 45047, 45045, 45045, 44810, 45024, 45024, 45025, 44950, 44985, 44965, 44984, 44987, 44986, 44825, 44713, 44716, 44711, 44730, 44714, 44912, 44686, 44718, 44715, 44714, 44685, 44683, 44719, 44719, 44693, 44990, 45036, 45038, 45027, 45051, 45028, 45028, 45052, 45034, 45022, 45024, 45031, 45023, 45011, 45027, 45038, 45006, 44803, 44815, 44809, 44808, 44809, 44815, 44813, 44806, 44802, 44808, 45039, 45024, 44807, 45030, 45014, 44808, 44824, 44805, 44802, 44815, 45054, 44866, 44864, 44876, 44870, 44869, 44866, 44871, 44870, 44869, 44864, 44869};
        RemoteActionCompatParcelizer = new char[]{11446, 6481, 6465, 6426, 6468, 6525, 6494, 6406, 6405, 6476, 6424, 6430, 11443, 11445, 6431, 6479, 6492, 6416, 6491, 6470, 6427, 6425, 11447, 11441, 6488, 6477, 6493, 6524, 6471, 6469, 6475, 6473, 6490, 11440, 6522, 6505, 6417, 6428, 6474, 6464, 6418, 6478, 11451, 6429, 6407, 11444, 11450, 11448, 6489};
        AudioAttributesCompatParcelizer = (char) 11445;
    }
}
