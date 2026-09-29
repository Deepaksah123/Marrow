package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.zzbE;
import kotlin.zzlh;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/zzlb;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zzlb extends zzkz {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AudioAttributesCompatParcelizer;
    private static char[] IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char read;
    private static char[] write;
    private static final byte[] $$j = {31, 34, 9, -77, -54, 68, 9, 26, -21, 38, 16, -8, 22, -31, 62, -4, 11, 10, 24, -2, 10, -21, 60, 8, -6, 30, 0, 17, 10, -14, 41, -68, 40, 63, -6, 16, 17, -35, 62, 11, 9, 2, 4, 30, 10, -4, 25, -37, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -2, 7, 14, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24};
    private static final int $$k = 100;
    private static final byte[] $$d = {16, 77, -78, 14, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 40;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static int AudioAttributesImplApi21Parcelizer = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 65
            int r8 = r8 + 4
            int r7 = 191 - r7
            byte[] r0 = kotlin.zzlb.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r9 = r7
            r3 = r8
            r4 = r2
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
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            int r9 = r9 + 1
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzlb.g(short, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            byte[] r0 = kotlin.zzlb.$$j
            int r9 = r9 * 8
            int r9 = 60 - r9
            int r7 = 114 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2a:
            int r7 = r7 + r8
            int r7 = r7 + (-11)
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzlb.h(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.zzlb$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/zzlb$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/zzlh;", "p1", "Landroid/content/Intent;", "write", "(Landroid/content/Context;Lo/zzlh;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent write(Context p0, zzlh p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) zzlb.class);
            p1.AudioAttributesCompatParcelizer(intent);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void f(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = IconCompatParcelizer;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.indexOf("", ""), 11613 - (ViewConfiguration.getScrollBarSize() >> 8), 20 - Color.blue(0), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
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
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i8 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 22958, Color.argb(0, 0, 0, 0) + 43, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i9 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 31589), KeyEvent.keyCodeFromString("") + 9863, 64 - TextUtils.indexOf((CharSequence) "", '0'), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (TextUtils.getCapsMode("", 0, 0) + 37822), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 9754, KeyEvent.normalizeMetaState(0) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i10 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i10, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i10);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i4 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            int i11 = $10 + 47;
            $11 = i11 % 128;
            i = 2;
            int i12 = i11 % 2;
            cArr3 = cArr6;
        } else {
            i = 2;
        }
        if (i5 > 0) {
            int i13 = $10 + 115;
            $11 = i13 % 128;
            int i14 = i13 % i;
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            int i15 = $11 + 31;
            $10 = i15 % 128;
            char c2 = 2;
            int i16 = i15 % 2;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[c2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                c2 = 2;
            }
        }
        String str = new String(cArr3);
        int i17 = $10 + 61;
        $11 = i17 % 128;
        if (i17 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    @Override // kotlin.zzkz, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 67;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        Object[] objArr2 = new Object[1];
        e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 14, new char[]{'!', '+', 20, 3, '\n', 26, 16, 31, 7, 5, 29, 2, 5, '\r', 30, 25, 13883, 13883}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 78), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        f(true, new byte[]{0, 1, 0, 0, 0}, new int[]{0, 5, 60, 0}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) - 23, new char[]{'!', '+', 20, 3, '\n', 26, 16, 31, '!', 15, 16, '!', 11, '\'', '&', 22, 22, 25, ')', '\b', ',', '-', 2, 27, 31, 15}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 2), objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                f(false, new byte[]{0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, new int[]{5, 18, 25, 0}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i4 = MediaBrowserCompatCustomActionResultReceiver + 25;
                MediaBrowserCompatItemReceiver = i4 % 128;
                if (i4 % 2 != 0) {
                    boolean z = baseContext instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i5 = MediaBrowserCompatCustomActionResultReceiver + 35;
                MediaBrowserCompatItemReceiver = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (Color.rgb(0, 0, 0) + 16781751), 6054 - (ViewConfiguration.getPressedStateDuration() >> 16), View.MeasureSpec.getMode(0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    f(false, new byte[]{1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0}, new int[]{23, 48, 0, 16}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    f(false, new byte[]{0, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0}, new int[]{71, 64, 0, 37}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    e(65 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new char[]{17, '&', 31, 15, '&', '-', 29, 25, 13869, 13869, '\"', ' ', 29, '$', 13869, 13869, 29, '$', 17, '&', '-', '&', 17, ')', 2, 26, 19, 3, 16, 6, 29, 24, 22, ' ', 16, 25, 30, 22, 18, '0', '&', '-', 22, 16, 31, '\'', 22, '$', 31, 19, '+', ' ', 30, 3, 18, '\"', '&', 17, 31, '\f', 4, 16, 1, 23}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 43), objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    f(true, new byte[]{1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1}, new int[]{TsExtractor.TS_STREAM_TYPE_E_AC3, 67, 0, 28}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    e(7 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{2, '!', ' ', 24, 31, '%'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 104), objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    f(true, new byte[]{1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1}, new int[]{202, 36, 139, 1}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 6030, 24 - (ViewConfiguration.getPressedStateDuration() >> 16), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char c = (char) (13183 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
            int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1650;
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 27;
            int i7 = $$e;
            Object[] objArr13 = new Object[1];
            g((short) (i7 | 147), (byte) i7, $$d[140], objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(c, iLastIndexOf, iIndexOf, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cGreen = (char) (13183 - Color.green(0));
                int mode = 1649 - View.MeasureSpec.getMode(0);
                int iLastIndexOf2 = TextUtils.lastIndexOf("", '0', 0, 0) + 27;
                byte[] bArr = $$d;
                Object[] objArr14 = new Object[1];
                g((short) 144, bArr[8], bArr[5], objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(cGreen, mode, iLastIndexOf2, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 12, new char[]{1, 31, 22, 28, 31, ',', '!', '+', 16, '%', '\b', 7, 1, '#', 24, 21}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 50), objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 6, new char[]{31, 24, 26, ',', '&', 22, ')', '\b', '$', 30, 2, '*', '(', '\r', 16, 24}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 14), objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, 1171719275};
                byte[] bArr2 = $$j;
                byte b = (byte) (bArr2[42] - 1);
                Object[] objArr18 = new Object[1];
                h(b, (byte) (b - 4), bArr2[26], objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b2 = bArr2[26];
                Object[] objArr19 = new Object[1];
                h(b2, (byte) (b2 | 58), bArr2[64], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char c2 = (char) (13183 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    int iResolveSizeAndState = 1649 - View.resolveSizeAndState(0, 0, 0);
                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L) + 27;
                    byte[] bArr3 = $$d;
                    Object[] objArr20 = new Object[1];
                    g((short) 144, bArr3[8], bArr3[5], objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(c2, iResolveSizeAndState, packedPositionChild, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    e((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 21, new char[]{'!', '+', 20, 3, '\n', 26, 16, 31, 7, 5, 28, '\t', 7, 6, '%', 22, '\"', '0', '/', '\n', '\'', '.'}, (byte) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 52), objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    f(false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, new int[]{238, 15, 0, 0}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char cResolveSizeAndState = (char) (13183 - View.resolveSizeAndState(0, 0, 0));
                        int iMyPid = (Process.myPid() >> 22) + 1649;
                        int i8 = 27 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        short s = (short) ($$e | 71);
                        byte[] bArr4 = $$d;
                        Object[] objArr23 = new Object[1];
                        g(s, bArr4[8], bArr4[5], objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(cResolveSizeAndState, iMyPid, i8, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char cLastIndexOf = (char) (13182 - TextUtils.lastIndexOf("", '0', 0));
                        int i9 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1648;
                        int i10 = 27 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        int i11 = $$e;
                        Object[] objArr24 = new Object[1];
                        g((short) (i11 | 147), (byte) i11, $$d[140], objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(cLastIndexOf, i9, i10, -133433128, false, (String) objArr24[0], null);
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
            long j2 = 0;
            long j3 = (((long) (i13 ^ i12)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4535 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 6053 - TextUtils.indexOf((CharSequence) "", '0', 0), 42 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {-549563826, Long.valueOf(j3), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), 6030 - (KeyEvent.getMaxKeyCode() >> 16), 24 - KeyEvent.keyCodeFromString(""));
                byte b3 = (byte) (-$$j[77]);
                Object[] objArr26 = new Object[1];
                h(b3, (byte) (b3 | 29), r2[42], objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(p0);
        CmcdConfigurationRequestConfig.write(this, null, 0, 0, false, 15);
        setContentView(R.layout.activity_schema_detail);
        if (p0 == null) {
            zzlh.Companion companion = zzlh.INSTANCE;
            Intent intent = getIntent();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(intent, "");
            zzlh zzlhVar = zzlh.Companion.read(intent);
            if (zzlhVar == null) {
                finish();
            } else {
                zzbE.Companion companion2 = zzbE.INSTANCE;
                CmcdConfigurationRequestConfig.write(this, R.id.container, zzbE.Companion.RemoteActionCompatParcelizer(zzlhVar));
            }
        }
    }

    private static void e(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
        int i2;
        int length;
        char[] cArr2;
        int i3;
        int i4 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr3 = write;
        if (cArr3 != null) {
            int i5 = $11 + 35;
            $10 = i5 % 128;
            if (i5 % 2 != 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.indexOf("", ""), 7015 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 30 - View.MeasureSpec.getMode(0), -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr2[i3] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i3++;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i6 = $11 + 83;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(read)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.red(0), View.MeasureSpec.getSize(0) + 7015, 30 - TextUtils.getOffsetAfter("", 0), -626716224, false, "o", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i8 = $11 + 119;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                i2 = i + 59;
                cArr4[i2] = (char) (cArr[i2] + b);
            } else {
                i2 = i - 1;
                cArr4[i2] = (char) (cArr[i2] - b);
            }
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            needsstartedservice.AudioAttributesCompatParcelizer = 0;
            while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                } else {
                    Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (ExpandableListView.getPackedPositionType(0L) + 48194), 20125 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 21 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() != needsstartedservice.AudioAttributesImplBaseParcelizer) {
                        if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                            needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                            needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                            int i9 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            int i10 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr3[i9];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr3[i10];
                        } else {
                            int i11 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            int i12 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr3[i11];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr3[i12];
                        }
                    } else {
                        int i13 = $10 + 29;
                        $11 = i13 % 128;
                        int i14 = i13 % 2;
                        Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 19367 - TextUtils.indexOf((CharSequence) "", '0'), 18 - (ViewConfiguration.getTapTimeout() >> 16), 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        int i15 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr3[iIntValue];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr3[i15];
                    }
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
            }
        }
        int i16 = 0;
        while (i16 < i) {
            int i17 = $11 + 65;
            $10 = i17 % 128;
            if (i17 % 2 != 0) {
                cArr4[i16] = (char) (cArr4[i16] ^ 24902);
                i16 += 33;
            } else {
                cArr4[i16] = (char) (cArr4[i16] ^ 13722);
                i16++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0092  */
    @Override // kotlin.zzkz, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 329
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzlb.onResume():void");
    }

    @Override // kotlin.zzkz, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = MediaBrowserCompatItemReceiver + 37;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) - 89, new char[]{'!', '+', 20, 3, '\n', 26, 16, 31, '!', 15, 16, '!', 11, '\'', '&', 22, 22, 25, ')', '\b', ',', '-', 2, 27, 31, 15}, (byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 115), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(false, new byte[]{0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, new int[]{5, 18, 25, 0}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 105;
            MediaBrowserCompatItemReceiver = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i6 = MediaBrowserCompatCustomActionResultReceiver + 93;
                MediaBrowserCompatItemReceiver = i6 % 128;
                int i7 = i6 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i8 = MediaBrowserCompatItemReceiver + 97;
            MediaBrowserCompatCustomActionResultReceiver = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - Color.red(0)), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 6053, ImageFormat.getBitsPerPixel(0) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 6031 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 23 - TextUtils.lastIndexOf("", '0', 0, 0), -861814097, false, "read", new Class[]{Context.class});
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

    /* JADX WARN: Can't wrap try/catch for region: R(29:(27:279|33|(3:35|36|(2:38|40)(1:39))(1:40)|77|293|78|(3:80|271|81)|85|86|(5:88|89|(1:91)|92|93)(24:94|95|290|96|97|280|98|(1:100)|101|102|273|103|(1:105)|106|107|108|(1:110)|111|(1:113)|114|(1:116)|117|118|(1:120))|121|(4:124|(13:298|126|(3:128|(3:131|132|129)|302)|133|291|134|(1:136)|137|138|139|284|140|301)(1:300)|299|122)|297|179|(1:181)|182|(3:184|(1:186)|187)(13:189|269|190|191|(1:193)|194|282|195|196|(1:198)|199|(1:201)|202)|188|203|(6:205|206|(1:208)|209|210|211)|212|(1:214)|215|(3:217|(1:219)|220)(14:222|223|(1:225)|226|227|(1:229)|230|275|231|232|(1:234)|235|(1:237)|238)|221|239|(7:241|242|(1:244)|245|246|247|248)(1:303))|295|49|(1:51)|52|77|293|78|(0)|85|86|(0)(0)|121|(1:122)|297|179|(0)|182|(0)(0)|188|203|(0)|212|(0)|215|(0)(0)|221|239|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x095e, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x095f, code lost:
    
        r5 = r23;
     */
    /* JADX WARN: Removed duplicated region for block: B:124:0x082e A[Catch: all -> 0x095c, TryCatch #13 {all -> 0x095c, blocks: (B:121:0x0824, B:122:0x0828, B:124:0x082e, B:126:0x0845, B:129:0x0852, B:131:0x0855, B:138:0x08b3, B:144:0x0936, B:146:0x093c, B:147:0x093d, B:149:0x093f, B:151:0x0946, B:152:0x0947, B:96:0x0539, B:108:0x0681, B:110:0x0687, B:111:0x06c8, B:113:0x076e, B:114:0x07b3, B:116:0x07c9, B:117:0x080f, B:154:0x0949, B:156:0x0950, B:157:0x0951, B:159:0x0953, B:161:0x095a, B:162:0x095b, B:103:0x05f5, B:105:0x060a, B:106:0x0675, B:98:0x05aa, B:100:0x05bf, B:101:0x05ee, B:140:0x08b8, B:134:0x0880, B:136:0x0886, B:137:0x08ac), top: B:290:0x0539, inners: #3, #7, #9, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x09ae A[Catch: all -> 0x0274, TryCatch #10 {all -> 0x0274, blocks: (B:173:0x09a8, B:175:0x09ae, B:176:0x09d7, B:206:0x0d7e, B:208:0x0d84, B:209:0x0daf, B:242:0x1184, B:244:0x118a, B:245:0x11ac, B:223:0x0f67, B:225:0x0f8a, B:226:0x0fd3, B:70:0x03b7, B:72:0x03bd, B:73:0x03e2, B:19:0x00c4, B:21:0x00ca, B:22:0x00f4, B:24:0x01eb, B:26:0x021b, B:27:0x026e), top: B:286:0x00c4 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0a6c  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0ab2  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0b05  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0d5d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0e41  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0e8c  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0ee1  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x1161  */
    /* JADX WARN: Removed duplicated region for block: B:303:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0530 A[Catch: all -> 0x095e, TRY_ENTER, TRY_LEAVE, TryCatch #15 {all -> 0x095e, blocks: (B:78:0x047b, B:85:0x04cc, B:94:0x0530), top: B:293:0x047b }] */
    @Override // kotlin.zzkz, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5190
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzlb.attachBaseContext(android.content.Context):void");
    }

    static {
        AudioAttributesCompatParcelizer = 0;
        AudioAttributesImplBaseParcelizer();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplApi21Parcelizer + 47;
        AudioAttributesCompatParcelizer = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.zzkz, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 65;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 12 / 0;
        }
        int i5 = MediaBrowserCompatCustomActionResultReceiver + 19;
        MediaBrowserCompatItemReceiver = i5 % 128;
        int i6 = i5 % 2;
    }

    static void AudioAttributesImplBaseParcelizer() {
        write = new char[]{6491, 6520, 6430, 6466, 6505, 6417, 6490, 6523, 6495, 6479, 6474, 6838, 6471, 6481, 6835, 6424, 6834, 6476, 6431, 6488, 6427, 6494, 6416, 6477, 6465, 6428, 6489, 6469, 6832, 6473, 6406, 6425, 6475, 6429, 6493, 6839, 6492, 6496, 6426, 6467, 6472, 6507, 6836, 6524, 6464, 6468, 6478, 6470, 6833};
        read = (char) 11445;
        IconCompatParcelizer = new char[]{45018, 44840, 44817, 44841, 44837, 44980, 44815, 44806, 44801, 44814, 44808, 44800, 45049, 45051, 44803, 44813, 44809, 45045, 45041, 44809, 44813, 44815, 44813, 44984, 44993, 44990, 44999, 45033, 45032, 45032, 44998, 44999, 44993, 44988, 44989, 44988, 44978, 44997, 45039, 45038, 44998, 44984, 44993, 45038, 45033, 45032, 45035, 44993, 44991, 44990, 44988, 44997, 45039, 45039, 44998, 44984, 44992, 45038, 44995, 44987, 44998, 45039, 44997, 44978, 44997, 44999, 44992, 44992, 44984, 44987, 44987, 44946, 44990, 44978, 44990, 44987, 44986, 44984, 44993, 44992, 44998, 44998, 44984, 44987, 44990, 44989, 44998, 45033, 45038, 45039, 44993, 44992, 44992, 44990, 44989, 44984, 44986, 44991, 44988, 44990, 44988, 44997, 45039, 45038, 44998, 44999, 44998, 44991, 44985, 44995, 45033, 44995, 44985, 44998, 44998, 44988, 44991, 44988, 44999, 45033, 44995, 44986, 44992, 44999, 44993, 45033, 45033, 44999, 44989, 44989, 44988, 44988, 44999, 44995, 44987, 44986, 45032, 45025, 45024, 45033, 45025, 45031, 45028, 45019, 45018, 45025, 45027, 45051, 45048, 45050, 45055, 45048, 45024, 45039, 45032, 44995, 44965, 44990, 45020, 45051, 45048, 45054, 45028, 45031, 45049, 45051, 45027, 45031, 45031, 44992, 44986, 45022, 45016, 45019, 45049, 45030, 45036, 45024, 45025, 44998, 44998, 45030, 45026, 44994, 44996, 45028, 45027, 44994, 44995, 45025, 45027, 45025, 45049, 45048, 45025, 45025, 45027, 45025, 45028, 44992, 45019, 45049, 45012, 44853, 44875, 44892, 44894, 44892, 44901, 44901, 44883, 44853, 44894, 44893, 44883, 44894, 44851, 44854, 44895, 44882, 44852, 44855, 44874, 44874, 44874, 44849, 44894, 44880, 44880, 44880, 44855, 44848, 44854, 44854, 44853, 44875, 44893, 44894, 44984, 45026, 45036, 45026, 45051, 45030, 45038, 45009, 45009, 45033, 45036, 45050, 45028, 45025, 45027, 44944, 44985, 44990, 44989, 44989, 44991, 44985, 44984, 44985, 44985, 44990, 45040, 44920, 44921, 44925, 44927, 44926, 44924, 44925, 44924, 44924, 44927};
    }
}
