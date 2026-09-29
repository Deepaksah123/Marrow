package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
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
import kotlin.zznf;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/zzna;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class zzna extends zznc {
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AudioAttributesCompatParcelizer;
    private static int AudioAttributesImplApi21Parcelizer;
    private static boolean AudioAttributesImplApi26Parcelizer;
    private static char[] IconCompatParcelizer;
    private static boolean MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char read;
    private static char[] write;
    private static final byte[] $$j = {66, 100, 74, -7, -54, 68, 9, 26, -27, 34, 26, 14, 3, 14, 4, -12, TarConstants.LF_NORMAL, 2, 0, -20, TarConstants.LF_CONTIG, 8, 9, -31, TarConstants.LF_CONTIG, 10, 11, 2, 9, 28, 0, 24, -2, 22, 16, -33, 31, 24, -2, 17, 9, 24, 6, 2, 22, -4, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -54, 68, 9, 26, -35, TarConstants.LF_BLK, 10, 17, -22, 33, 28, -10, -5, 36, 6, 22, -69, 57, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -8};
    private static final int $$k = 101;
    private static final byte[] $$d = {8, -19, -66, -33, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 136;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int MediaMetadataCompat = 1;
    private static int AudioAttributesImplBaseParcelizer = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 65
            int r0 = r7 + 4
            byte[] r1 = kotlin.zzna.$$d
            int r5 = r5 + 4
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            int r5 = r5 + 1
            r3 = r1[r5]
        L26:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-1)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzna.g(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r5, byte r6, short r7, java.lang.Object[] r8) {
        /*
            int r6 = 73 - r6
            int r5 = r5 + 82
            byte[] r0 = kotlin.zzna.$$j
            int r1 = 47 - r7
            byte[] r1 = new byte[r1]
            int r7 = 46 - r7
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r5
            r5 = r7
            r3 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L21:
            r4 = r0[r6]
            int r3 = r3 + 1
        L25:
            int r5 = r5 + r4
            int r6 = r6 + 1
            int r5 = r5 + (-11)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzna.h(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.zzna$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/zzna$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "p2", "Landroid/content/Intent;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent RemoteActionCompatParcelizer(Context p0, String p1, String p2) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            Intent intent = new Intent(p0, (Class<?>) zzna.class);
            intent.putExtra("schema_id", p1);
            intent.putExtra("schema_title", p2);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void f(byte[] bArr, int i, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = IconCompatParcelizer;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 44862), 18944 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(AudioAttributesCompatParcelizer)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), ((Process.getThreadPriority(0) + 20) >> 6) + 19033, (Process.myPid() >> 22) + 75, 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        if (MediaBrowserCompatItemReceiver) {
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr4 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), ((Process.getThreadPriority(0) + 20) >> 6) + 11439, KeyEvent.normalizeMetaState(0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!AudioAttributesImplApi26Parcelizer) {
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                int i4 = $11 + 19;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                notifydownloads.IconCompatParcelizer++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i6 = $10 + 71;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
            Object[] objArr5 = {notifydownloads, notifydownloads};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) Drawable.resolveOpacity(0, 0), (KeyEvent.getMaxKeyCode() >> 16) + 11439, KeyEvent.normalizeMetaState(0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    @Override // kotlin.zznc, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        char c;
        char c2;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 83;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        String str = "";
        Object[] objArr2 = new Object[1];
        e(TextUtils.getCapsMode("", 0, 0) + 18, new char[]{14, '&', '0', 6, 19, 7, '#', ')', 19, 0, '/', 5, '*', 20, 28, 2, 13857, 13857}, (byte) (KeyEvent.getDeadChar(0, 0) + 56), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        f(new byte[]{-123, -124, -125, -126, -127}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) + 8, null, null, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                f(new byte[]{-123, -122, -110, -120, -111, -112, -126, -114, -124, -113, -124, -114, -115, -116, -118, -117, -117, -122, -118, -123, -124, -119, -120, -123, -121, -122}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) + 18, null, null, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                f(new byte[]{-121, -119, -124, -114, -122, -115, -124, -108, -117, -117, -116, -114, -121, -110, -120, -120, -109, -115}, 127 - View.MeasureSpec.getMode(0), null, null, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getEdgeSlop() >> 16)), (ViewConfiguration.getTapTimeout() >> 16) + 6054, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    e(ExpandableListView.getPackedPositionChild(0L) + 49, new char[]{29, '%', 14, '#', '\"', '%', 18, '\n', 30, '\f', ' ', 6, 7, '#', '#', '%', 14, 7, 28, '\t', 28, 6, ' ', 0, '*', 31, 31, 19, 30, 20, '\t', '\b', 1, 7, 7, 2, '\t', ' ', '\t', 25, '0', ')', 1, '\'', '.', 3, '#', 7}, (byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 85), objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 29, new char[]{'\t', 28, 28, '\t', 24, 16, 30, 16, '%', 22, '\'', '\r', '\t', 14, '%', '\r', 14, 3, 18, 3, '\n', ',', ' ', 5, '\t', 18, 14, '\t', 2, 25, '\t', '\b', '\f', 28, '\r', ' ', 29, 7, 28, '\r', ',', 24, '\r', '\'', '#', '\"', 20, '%', 11, 0, '#', '\b', 18, 2, 29, '(', '*', 31, 2, 28, '#', 1, 30, 27}, (byte) (52 - (ViewConfiguration.getTapTimeout() >> 16)), objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    e((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 63, new char[]{'\t', 18, 20, '&', 15, '\t', 31, ',', 13948, 13948, '%', 15, 3, 24, 13948, 13948, 3, 24, '\t', 18, '\t', 15, 29, '\r', 5, 1, '\'', 6, 30, '\r', 17, ',', 31, 19, 21, 2, 14, 3, 28, 29, 15, '\t', 7, 14, 29, '\t', '\n', 14, '%', '#', 31, 14, 23, 16, 28, 31, 18, '\t', '\'', '\b', 16, 30, '\n', ','}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 91), objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 47, new char[]{21, '0', '0', 7, 1, '!', 13776, 13776, '&', 20, '\n', 5, 6, '+', 17, 21, '$', '#', '\f', '/', '0', 21, '*', 6, 14, '-', 31, 16, 0, '/', ')', '\'', 31, 24, 6, '0', 4, '/', 31, 24, '*', 6, '%', '!', 16, '*', 24, 18, 7, '\r', 26, 11, '$', '\'', 1, 6, '.', 21, 22, '\f', 21, 4, 21, 5, '*', 0, 13828}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 8), objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f(new byte[]{-104, -118, -105, -106, -118, -107}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 127, null, null, objArr10);
                    String str6 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    e(36 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{'\t', 15, '\t', 25, '\n', '\t', 13778, 13778, 3, ',', 31, '*', 30, 0, 30, '\f', 30, 26, 3, 5, '\f', '\t', '\t', 0, 30, 21, 15, '\n', 21, 2, 31, 29, 17, 18, 13779, 13779}, (byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 38), objArr11);
                    Object[] objArr12 = {baseContext, str2, str3, str4, str5, true, str6, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0) + 6031, 24 - (ViewConfiguration.getWindowTouchSlop() >> 8), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char scrollBarFadeDuration = (char) (13183 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
            int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1649;
            int i4 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25;
            Object[] objArr13 = new Object[1];
            g(r4[53], r4[113], (byte) ($$d[61] - 1), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(scrollBarFadeDuration, maximumDrawingCacheSize, i4, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char packedPositionGroup = (char) (13183 - ExpandableListView.getPackedPositionGroup(0L));
                int i5 = 1650 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                int iArgb = 26 - Color.argb(0, 0, 0, 0);
                byte[] bArr = $$d;
                Object[] objArr14 = new Object[1];
                g(bArr[65], bArr[5], bArr[8], objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(packedPositionGroup, i5, iArgb, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
            c2 = 3;
            c = 2;
        } else {
            Object[] objArr15 = new Object[1];
            e((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 15, new char[]{'&', 24, 24, 19, '&', 5, 14, '&', '\'', ')', 1, '\b', 0, '/', 2, '*'}, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 119), objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 12, new char[]{'\r', '(', 7, '*', '/', 7, '+', 0, 20, 18, 6, 26, 19, 15, '#', 6}, (byte) (TextUtils.indexOf("", "", 0) + 26), objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, -1279639756};
                byte[] bArr2 = $$j;
                Object[] objArr18 = new Object[1];
                h((byte) (bArr2[46] - 1), (byte) (-bArr2[89]), bArr2[21], objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                h((byte) ($$k & 191), bArr2[36], (byte) 42, objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 13183);
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 1649;
                    int iLastIndexOf = 25 - TextUtils.lastIndexOf("", '0', 0);
                    byte[] bArr3 = $$d;
                    Object[] objArr20 = new Object[1];
                    g(bArr3[65], bArr3[5], bArr3[8], objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(pressedStateDuration, capsMode, iLastIndexOf, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    f(new byte[]{-100, -115, -119, -108, -101, -127, -110, -114, -103, -126, -102, -118, -103, -119, -118, -123, -124, -119, -120, -123, -121, -122}, 127 - (ViewConfiguration.getFadingEdgeLength() >> 16), null, null, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    f(new byte[]{-110, -127, -124, -114, -108, -122, -110, -99, -123, -110, -103, -117, -122, -108, -110}, 127 - (ViewConfiguration.getPressedStateDuration() >> 16), null, null, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 13183);
                        int packedPositionGroup2 = 1649 - ExpandableListView.getPackedPositionGroup(0L);
                        int i6 = 27 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                        byte[] bArr4 = $$d;
                        Object[] objArr23 = new Object[1];
                        g((short) 75, bArr4[5], bArr4[8], objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(trimmedLength, packedPositionGroup2, i6, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char c3 = (char) (13184 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1649;
                        int i7 = 27 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                        Object[] objArr24 = new Object[1];
                        g(r4[53], r4[113], (byte) ($$d[61] - 1), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(c3, maximumDrawingCacheSize2, i7, -133433128, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf2);
                    int i8 = MediaMetadataCompat + 91;
                    MediaBrowserCompatCustomActionResultReceiver = i8 % 128;
                    c = 2;
                    int i9 = i8 % 2;
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
        int i10 = ((int[]) objArr[c2])[0];
        int i11 = ((int[]) objArr[c])[0];
        if (i11 != i10) {
            long j = -1;
            long j2 = ((long) (i11 ^ i10)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4535 - TextUtils.getOffsetAfter("", 0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 6054, (ViewConfiguration.getJumpTapTimeout() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {884788988, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), Color.argb(0, 0, 0, 0) + 6030, TextUtils.getTrimmedLength("") + 24);
                Object[] objArr26 = new Object[1];
                h(r1[18], (byte) (-$$j[8]), r1[47], objArr26);
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
        setContentView(R.layout.activity_schema_incomplete);
        String stringExtra = getIntent().getStringExtra("schema_id");
        if (stringExtra == null) {
            int i12 = MediaMetadataCompat + 61;
            MediaBrowserCompatCustomActionResultReceiver = i12 % 128;
            int i13 = i12 % 2;
            stringExtra = "";
        }
        String stringExtra2 = getIntent().getStringExtra("schema_title");
        if (stringExtra2 != null) {
            int i14 = MediaMetadataCompat + 45;
            MediaBrowserCompatCustomActionResultReceiver = i14 % 128;
            if (i14 % 2 != 0) {
                int i15 = 31 / 0;
            }
            str = stringExtra2;
        }
        if (p0 == null) {
            int i16 = MediaBrowserCompatCustomActionResultReceiver + 1;
            MediaMetadataCompat = i16 % 128;
            int i17 = i16 % 2;
            zznf.Companion companion = zznf.INSTANCE;
            CmcdConfigurationRequestConfig.write(this, R.id.container, zznf.Companion.read(stringExtra, str));
        }
    }

    private static void e(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = write;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (KeyEvent.getMaxKeyCode() >> 16), TextUtils.getOffsetBefore("", 0) + 7015, 29 - TextUtils.indexOf((CharSequence) "", '0', 0), -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(read)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), 7015 - (Process.myTid() >> 22), 30 - TextUtils.indexOf("", "", 0, 0), -626716224, false, "o", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            int i5 = $11 + 5;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            needsstartedservice.AudioAttributesCompatParcelizer = 0;
            while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.getOffsetBefore("", 0) + 48194), TextUtils.getTrimmedLength("") + 20126, 20 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                        Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) KeyEvent.keyCodeFromString(""), View.MeasureSpec.getMode(0) + 19368, Gravity.getAbsoluteGravity(0, 0) + 18, 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        int i7 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i7];
                    } else {
                        obj = null;
                        if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                            int i8 = $10 + 15;
                            $11 = i8 % 128;
                            int i9 = i8 % 2;
                            needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                            needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                            int i10 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            int i11 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i10];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i11];
                        } else {
                            int i12 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            int i13 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i12];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i13];
                        }
                    }
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
                obj2 = obj;
            }
        }
        for (int i14 = 0; i14 < i; i14++) {
            cArr4[i14] = (char) (cArr4[i14] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    @Override // kotlin.zznc, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f(new byte[]{-123, -122, -110, -120, -111, -112, -126, -114, -124, -113, -124, -114, -115, -116, -118, -117, -117, -122, -118, -123, -124, -119, -120, -123, -121, -122}, (ViewConfiguration.getTouchSlop() >> 8) + 127, null, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(new byte[]{-121, -119, -124, -114, -122, -115, -124, -108, -117, -117, -116, -114, -121, -110, -120, -120, -109, -115}, TextUtils.indexOf("", "") + 127, null, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i2 = MediaBrowserCompatCustomActionResultReceiver + 41;
                MediaMetadataCompat = i2 % 128;
                int i3 = i2 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i4 = MediaMetadataCompat + 51;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - View.MeasureSpec.getMode(0)), View.getDefaultSize(0, 0) + 6054, 41 - TextUtils.indexOf((CharSequence) "", '0'), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getOffsetAfter("", 0), 6030 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 23 - ((byte) KeyEvent.getModifierMetaStateMask()), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    int i5 = 73 / 0;
                } else {
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 4535), 6054 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 42 - Gravity.getAbsoluteGravity(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0')), 6030 - View.MeasureSpec.getSize(0), 24 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00ae  */
    @Override // kotlin.zznc, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 465
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzna.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:134:0x08d3 A[Catch: all -> 0x0367, TryCatch #3 {all -> 0x0367, blocks: (B:182:0x0aee, B:184:0x0af4, B:185:0x0b1f, B:215:0x0f51, B:217:0x0f57, B:218:0x0f87, B:251:0x133e, B:253:0x1344, B:254:0x136c, B:232:0x1138, B:234:0x115a, B:235:0x11af, B:132:0x08cd, B:134:0x08d3, B:135:0x08f9, B:24:0x0106, B:26:0x010c, B:27:0x0136, B:29:0x02db, B:31:0x030a, B:32:0x0361, B:142:0x0992, B:148:0x09a7, B:152:0x09b3, B:145:0x099a, B:168:0x0a84, B:170:0x0a8a, B:171:0x0a8b, B:173:0x0a8d, B:175:0x0a94, B:176:0x0a95), top: B:282:0x0106, inners: #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x09b0  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x09b1  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0bb1  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x0c07  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0c66  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0f32  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x1017  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x106a  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x10bf  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x131e  */
    /* JADX WARN: Removed duplicated region for block: B:318:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00d2  */
    @Override // kotlin.zznc, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5718
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzna.attachBaseContext(android.content.Context):void");
    }

    static {
        AudioAttributesImplApi21Parcelizer = 0;
        AudioAttributesImplApi21Parcelizer();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplBaseParcelizer + 9;
        AudioAttributesImplApi21Parcelizer = i % 128;
        if (i % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.zznc, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 31;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaMetadataCompat + 55;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 36 / 0;
        }
    }

    static void AudioAttributesImplApi21Parcelizer() {
        write = new char[]{6477, 6481, 6405, 6468, 6417, 6491, 6839, 6424, 6426, 6430, 6832, 6474, 6465, 6488, 6471, 6837, 6425, 6473, 6507, 6496, 6836, 6838, 6833, 6431, 6493, 6407, 6494, 6464, 6478, 6418, 6475, 6466, 6834, 6428, 6427, 6470, 6429, 6842, 6479, 6835, 6406, 6476, 6492, 6523, 6469, 6416, 6489, 6520, 6490};
        read = (char) 11445;
        IconCompatParcelizer = new char[]{28512, 28532, 28504, 28516, 28523, 28524, 28513, 28541, 28542, 28577, 28543, 28492, 28522, 28539, 28537, 28507, 28519, 28520, 28536, 28515, 28596, 28604, 28603, 28605, 28538, 28506, 28490, 28514, 28509, 28599, 28601, 28607, 28602, 28598};
        AudioAttributesCompatParcelizer = 411398031;
        AudioAttributesImplApi26Parcelizer = true;
        MediaBrowserCompatItemReceiver = true;
    }
}
