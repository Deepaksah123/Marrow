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
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.isHeld;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/createBundleFromClientSettings;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class createBundleFromClientSettings extends TaskCompletionSource {
    private static char[] AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int RemoteActionCompatParcelizer;
    private static long write;
    private static final byte[] $$c = {TarConstants.LF_BLK, -62, -101, -125};
    private static final int $$f = 11;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {18, -64, -35, -97, 70, -71, 5, 27, -7, 10, 14, -6, 20, -14, -3, 3, 0, 20, 41, -29, -12, 16, -1, 6, TarConstants.LF_NORMAL, -39, 7, 2, 20, -14, 41, -12, -12, 20, 3, -2, 8, -12, 26, -8, 70, -52, 7, -10, 39, -10, -14, 16, 0, 12, 18, 9, 2};
    private static final int $$h = 49;
    private static final byte[] $$a = {3, 113, -44, TarConstants.LF_BLK, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 234;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private static int read = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r7, short r8, byte r9) {
        /*
            byte[] r0 = kotlin.createBundleFromClientSettings.$$c
            int r7 = r7 * 2
            int r7 = 121 - r7
            int r9 = r9 * 4
            int r9 = 1 - r9
            int r8 = r8 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r7 = r9
            r5 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2a:
            int r8 = -r8
            int r7 = r7 + r8
            r8 = r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createBundleFromClientSettings.$$i(short, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = 190 - r9
            int r7 = r7 + 4
            byte[] r0 = kotlin.createBundleFromClientSettings.$$a
            int r8 = r8 + 65
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r9
            r4 = r2
            r9 = r7
            goto L29
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            int r9 = r9 + 1
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L29:
            int r8 = -r8
            int r9 = r9 + r8
            int r8 = r9 + (-1)
            r9 = r3
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createBundleFromClientSettings.c(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.createBundleFromClientSettings.$$g
            int r6 = 119 - r6
            int r1 = 28 - r8
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            int r8 = 27 - r8
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L28:
            int r7 = r7 + 1
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + 5
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createBundleFromClientSettings.d(short, byte, byte, java.lang.Object[]):void");
    }

    public createBundleFromClientSettings() {
        super((byte) 0);
    }

    /* JADX INFO: renamed from: o.createBundleFromClientSettings$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/createBundleFromClientSettings$IconCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "read", "(Landroid/content/Context;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent read(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Intent intentAddFlags = new Intent(p0, (Class<?>) createBundleFromClientSettings.class).addFlags(67108864);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(intentAddFlags, "");
            return intentAddFlags;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = $10 + 109;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b - 1);
                    objRemoteActionCompatParcelizer = startForeground.read((char) (38460 - TextUtils.indexOf((CharSequence) "", '0', 0)), View.getDefaultSize(0, 0) + 532, 8 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -735610793, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (write ^ 2192498202983240651L);
                Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char cResolveSizeAndState = (char) (36621 - View.resolveSizeAndState(0, 0, 0));
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 2340;
                    int iMyTid = 28 - (Process.myTid() >> 22);
                    byte b3 = (byte) ($$f & 5);
                    byte b4 = (byte) (-b3);
                    objRemoteActionCompatParcelizer2 = startForeground.read(cResolveSizeAndState, tapTimeout, iMyTid, 188119637, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        int i6 = $11 + 87;
        $10 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 4 % 4;
        }
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer3 == null) {
                char c = (char) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 36621);
                int iResolveSizeAndState = 2340 - View.resolveSizeAndState(0, 0, 0);
                int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 28;
                byte b5 = (byte) ($$f & 5);
                byte b6 = (byte) (-b5);
                objRemoteActionCompatParcelizer3 = startForeground.read(c, iResolveSizeAndState, doubleTapTimeout, 188119637, false, $$i(b5, b6, (byte) (b6 + 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static void a(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = AudioAttributesCompatParcelizer;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 91;
                $10 = i8 % 128;
                int i9 = i8 % i;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 11613, 20 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i7++;
                    int i10 = $10 + 65;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    i = 2;
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
                    int i12 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - ImageFormat.getBitsPerPixel(0)), 22959 - View.resolveSize(0, 0), 43 - (ViewConfiguration.getScrollBarSize() >> 8), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (View.combineMeasuredStates(0, 0) + 31589), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 9864, Color.red(0) + 65, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 37821), TextUtils.getOffsetAfter("", 0) + 9754, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 26, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i14, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i14);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                int i15 = $10 + 63;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i4 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override // kotlin.TaskCompletionSource, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 117;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        a(new byte[]{1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0}, new int[]{0, 18, 0, 14}, false, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        a(new byte[]{1, 0, 0, 0, 1}, new int[]{18, 5, 0, 0}, false, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i4 = AudioAttributesImplApi26Parcelizer + 21;
                MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr4 = new Object[1];
                b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 56534, new char[]{54282, 2300, 28157, 17138, 42976, 34015, 63961, 56970, 13250, 4314, 30113, 43766, 36742, 60589, 49537, 9877, 7053, 30859, 23965, 45673, 38731, 62574, 10623, 3665, 25426, 16478}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                b(Drawable.resolveOpacity(0, 0) + 27773, new char[]{54280, 47203, 3299, 37230, 26106, 51828, 24305, 9025, 47091, 1150, 59621, 32093, 49620, 22099, 15049, 36689, 5076, 57416}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i6 = AudioAttributesImplApi26Parcelizer + 105;
                MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
                int i7 = i6 % 2;
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6054, (ViewConfiguration.getScrollBarSize() >> 8) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 33494, new char[]{54280, 22183, 53673, 23782, 57324, 23250, 50652, 16582, 50071, 20124, 51682, 29921, 63394, 29352, 64913, 30921, 64459, 26247, 57738, 27680, 61228, 27235, 38251, 4109, 37643, 7772, 39189, 1097, 34660, 623, 36215, 2172, 35630, 13888, 45391, 15365, 48909, 14837, 42239, 10163, 41703, 11705, 43144, 11149, 22175, 53655, 23731, 57273}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2232, new char[]{54363, 56531, 50622, 52938, 63280, 63565, 57726, 59808, 37510, 39919, 35969, 46432, 48671, 42821, 45045, 20616, 22970, 17029, 19308, 31763, 25921, 28068, 5773, 8191, 129, 2361, 12900, 15170, 9126, 54419, 56819, 50910, 53051, 61540, 63775, 57769, 60097, 37886, 34010, 36102, 46699, 48975, 42983, 43206, 20907, 23154, 17152, 29754, 32075, 26041, 28312, 6138, 6182, 261, 2669, 13139, 15291, 11470, 54672, 56945, 50954, 51233, 61778, 63929}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    b((ViewConfiguration.getTouchSlop() >> 8) + 43691, new char[]{54281, 32497, 33116, 54286, 32502, 33038, 54282, 32510, 33111, 54284, 32496, 33027, 54359, 32421, 33109, 54282, 32483, 33105, 54287, 32491, 33029, 54365, 32490, 33028, 54362, 32445, 33105, 54363, 32492, 33026, 54352, 32486, 33087, 54273, 32490, 33135, 54278, 32441, 33082, 54272, 32482, 33082, 54272, 32482, 33132, 54358, 32481, 33135, 54350, 32436, 33131, 54299, 32486, 33082, 54346, 32437, 33074, 54298, 32480, 33120, 54345, 32483, 33079, 54342}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    a(new byte[]{1, 1, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 0}, new int[]{23, 67, 0, 0}, true, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b(TextUtils.lastIndexOf("", '0', 0) + 31602, new char[]{54354, 44852, 8888, 42508, 14721, 48492}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    b(AndroidCharacter.getMirror('0') + 56585, new char[]{54361, 2403, 28283, 17399, 41145, 34372, 64268, 55509, 15758, 4946, 28727, 21792, 35489, 61347, 52545, 8714, 1999, 25749, 23108, 49001, 40061, 61940, 54973, 13401, 26965, 20173, 41920, 33114, 58976, 56187, 14502, 7658, 29562, 20563, 46543, 60054}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), 6031 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), AndroidCharacter.getMirror('0') - 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char defaultSize = (char) (13183 - View.getDefaultSize(0, 0));
            int iResolveOpacity = 1649 - Drawable.resolveOpacity(0, 0);
            int modifierMetaStateMask = 25 - ((byte) KeyEvent.getModifierMetaStateMask());
            Object[] objArr13 = new Object[1];
            c((byte) ($$b & 60), $$a[140], (short) 187, objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(defaultSize, iResolveOpacity, modifierMetaStateMask, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 13184);
                int i8 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1649;
                int iMyPid = (Process.myPid() >> 22) + 26;
                byte[] bArr = $$a;
                byte b = bArr[8];
                byte b2 = bArr[5];
                Object[] objArr14 = new Object[1];
                c(b, b2, (short) (b2 | 144), objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(bitsPerPixel, i8, iMyPid, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            a(new byte[]{0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1}, new int[]{90, 16, 0, 5}, true, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            b(57636 - TextUtils.lastIndexOf("", '0', 0, 0), new char[]{54274, 13610, 5700, 30570, 20619, 45499, 37569, 64529, 56587, 15943, 8042, 30868, 22932, 47845, 33801, 58661}, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i9 = MediaBrowserCompatCustomActionResultReceiver + 125;
            AudioAttributesImplApi26Parcelizer = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, -107173959};
                byte[] bArr2 = $$g;
                byte b3 = bArr2[36];
                byte b4 = bArr2[16];
                Object[] objArr18 = new Object[1];
                d(b3, b4, (byte) (b4 | 22), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b5 = bArr2[16];
                byte b6 = bArr2[6];
                Object[] objArr19 = new Object[1];
                d(b5, b6, (byte) (b6 | 18), objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char cMyPid = (char) (13183 - (Process.myPid() >> 22));
                    int packedPositionType = 1649 - ExpandableListView.getPackedPositionType(0L);
                    int packedPositionType2 = 26 - ExpandableListView.getPackedPositionType(0L);
                    byte[] bArr3 = $$a;
                    byte b7 = bArr3[8];
                    byte b8 = bArr3[5];
                    Object[] objArr20 = new Object[1];
                    c(b7, b8, (short) (b8 | 144), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(cMyPid, packedPositionType, packedPositionType2, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    a(null, new int[]{106, 22, 99, 8}, true, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    a(new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, new int[]{128, 15, 0, 0}, false, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char cGreen = (char) (13183 - Color.green(0));
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1650;
                        int iAlpha = Color.alpha(0) + 26;
                        byte[] bArr4 = $$a;
                        byte b9 = bArr4[8];
                        byte b10 = bArr4[5];
                        Object[] objArr23 = new Object[1];
                        c(b9, b10, (short) (b10 | 111), objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(cGreen, iLastIndexOf, iAlpha, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char maxKeyCode = (char) (13183 - (KeyEvent.getMaxKeyCode() >> 16));
                        int iIndexOf = 1648 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                        int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 27;
                        Object[] objArr24 = new Object[1];
                        c((byte) ($$b & 60), $$a[140], (short) 187, objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(maxKeyCode, iIndexOf, bitsPerPixel2, -133433128, false, (String) objArr24[0], null);
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
        int i11 = ((int[]) objArr[3])[0];
        int i12 = ((int[]) objArr[2])[0];
        if (i12 != i11) {
            long j = -1;
            long j2 = ((long) (i12 ^ i11)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4535 - (ViewConfiguration.getTapTimeout() >> 16)), 6054 - (ViewConfiguration.getTouchSlop() >> 8), 43 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i13 = AudioAttributesImplApi26Parcelizer + 99;
            MediaBrowserCompatCustomActionResultReceiver = i13 % 128;
            int i14 = i13 % 2;
            try {
                Object[] objArr25 = {-1404035266, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 6030, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 23);
                byte[] bArr5 = $$g;
                Object[] objArr26 = new Object[1];
                d((byte) 37, bArr5[51], bArr5[16], objArr26);
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
        if (p0 == null) {
            isHeld.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = isHeld.IconCompatParcelizer;
            CmcdConfigurationRequestConfig.write(this, R.id.fragment_container, isHeld.AudioAttributesCompatParcelizer.write());
        }
    }

    @Override // kotlin.TaskCompletionSource, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 11;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 56565, new char[]{54282, 2300, 28157, 17138, 42976, 34015, 63961, 56970, 13250, 4314, 30113, 43766, 36742, 60589, 49537, 9877, 7053, 30859, 23965, 45673, 38731, 62574, 10623, 3665, 25426, 16478}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 27659, new char[]{54280, 47203, 3299, 37230, 26106, 51828, 24305, 9025, 47091, 1150, 59621, 32093, 49620, 22099, 15049, 36689, 5076, 57416}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 19;
            AudioAttributesImplApi26Parcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i6 = AudioAttributesImplApi26Parcelizer + 123;
            MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
            try {
                if (i6 % 2 != 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getEdgeSlop() >> 16)), 6053 - MotionEvent.axisFromString(""), 41 - TextUtils.indexOf((CharSequence) "", '0'), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 6030 - TextUtils.indexOf("", "", 0, 0), KeyEvent.getDeadChar(0, 0) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    obj.hashCode();
                    throw null;
                }
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 4535), 6055 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (TextUtils.lastIndexOf("", '0') + 1), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6030, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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
        int i7 = AudioAttributesImplApi26Parcelizer + 47;
        MediaBrowserCompatCustomActionResultReceiver = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.TaskCompletionSource, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 125;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = AudioAttributesImplApi26Parcelizer + 73;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            b(AndroidCharacter.getMirror('0') + 56521, new char[]{54282, 2300, 28157, 17138, 42976, 34015, 63961, 56970, 13250, 4314, 30113, 43766, 36742, 60589, 49537, 9877, 7053, 30859, 23965, 45673, 38731, 62574, 10623, 3665, 25426, 16478}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 27763, new char[]{54280, 47203, 3299, 37230, 26106, 51828, 24305, 9025, 47091, 1150, 59621, 32093, 49620, 22099, 15049, 36689, 5076, 57416}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i6 = MediaBrowserCompatCustomActionResultReceiver + 99;
                AudioAttributesImplApi26Parcelizer = i6 % 128;
                int i7 = i6 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4534), 6054 - Color.alpha(0), 42 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.blue(0), 6031 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), KeyEvent.keyCodeFromString("") + 24, -861814097, false, "read", new Class[]{Context.class});
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

    /* JADX WARN: Can't wrap try/catch for region: R(39:0|2|(2:(2:7|(1:13)(1:12))(1:14)|(9:16|274|17|(1:19)|20|21|22|(1:24)|25))|29|(28:273|31|(3:33|34|(2:36|38)(1:37))(1:38)|73|290|74|(1:76)|77|(3:79|(1:81)|82)(18:83|282|84|(1:86)|87|88|276|89|(1:91)|92|93|94|(1:96)|97|(1:99)|100|(1:102)|103)|104|(4:107|(13:292|109|(3:111|(4:114|115|116|112)|296)|117|269|118|(1:120)|121|122|123|286|124|295)(1:294)|293|105)|291|159|(1:161)|162|(2:164|(4:166|(1:168)|169|170)(3:171|(1:173)|174))(13:176|288|177|178|(1:180)|181|278|182|183|(1:185)|186|(1:188)|189)|175|190|(6:192|193|(1:195)|196|197|198)|199|(1:201)|202|(2:204|(4:206|(1:208)|209|210)(3:211|(1:213)|214))(14:216|217|(1:219)|220|221|(1:223)|224|271|225|226|(1:228)|229|(1:231)|232)|215|233|(6:235|236|(1:238)|239|240|241)|242|(1:244)(2:245|246))|267|42|(1:44)|45|284|46|(1:48)|49|73|290|74|(0)|77|(0)(0)|104|(1:105)|291|159|(0)|162|(0)(0)|175|190|(0)|199|(0)|202|(0)(0)|215|233|(0)|242|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:147:0x08ff, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x0900, code lost:
    
        r6 = new java.lang.Object[1];
        a(new byte[]{0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0}, new int[]{143, 11, 0, 0}, false, r6);
        r2 = (java.lang.String) r6[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x091a, code lost:
    
        r4 = new java.io.ByteArrayOutputStream();
        r6 = new java.io.PrintStream(r4);
        r0.printStackTrace(r6);
        r6.close();
        r1 = r4.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0931, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x0935, code lost:
    
        r4 = new java.util.ArrayList(2);
        r4.add(r1);
        r4.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:153:0x0944, code lost:
    
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0948, code lost:
    
        if (r1 == null) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x094a, code lost:
    
        r1 = kotlin.startForeground.read((char) (android.view.Gravity.getAbsoluteGravity(0, 0) + 4535), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6054, (android.view.ViewConfiguration.getZoomControlsTimeout() > 0 ? 1 : (android.view.ViewConfiguration.getZoomControlsTimeout() == 0 ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0979, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0985, code lost:
    
        r7 = new java.lang.Object[]{1189536721, 81604378625L, r4, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r2 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) ((-1) - android.widget.ExpandableListView.getPackedPositionChild(0)), (android.os.SystemClock.elapsedRealtimeNanos() > 0 ? 1 : (android.os.SystemClock.elapsedRealtimeNanos() == 0 ? 0 : -1)) + 6029, android.graphics.Color.blue(0) + 24);
        r4 = kotlin.createBundleFromClientSettings.$$g;
        r11 = new java.lang.Object[1];
        d((byte) 37, r4[51], r4[16], r11);
        r2.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r7);
     */
    /* JADX WARN: Removed duplicated region for block: B:107:0x07bb A[Catch: all -> 0x08ff, TryCatch #14 {all -> 0x08ff, blocks: (B:74:0x0494, B:76:0x049a, B:77:0x04de, B:79:0x04eb, B:81:0x04f4, B:82:0x0539, B:104:0x07b1, B:105:0x07b5, B:107:0x07bb, B:109:0x07d1, B:112:0x07de, B:115:0x07eb, B:122:0x0854, B:128:0x08d9, B:130:0x08df, B:131:0x08e0, B:133:0x08e2, B:135:0x08e9, B:136:0x08ea, B:83:0x0544, B:94:0x066b, B:96:0x0671, B:97:0x06b6, B:99:0x070d, B:100:0x074c, B:102:0x0761, B:103:0x07ab, B:138:0x08ec, B:140:0x08f3, B:141:0x08f4, B:143:0x08f6, B:145:0x08fd, B:146:0x08fe, B:118:0x081a, B:120:0x0820, B:121:0x084d, B:89:0x05e0, B:91:0x05f4, B:92:0x065f, B:84:0x0592, B:86:0x05a4, B:87:0x05d9, B:124:0x0859), top: B:290:0x0494, outer: #4, inners: #2, #6, #10, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0a0c  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0a5a  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0b0c  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0d42  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0e2b  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0e80  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0f31  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x1164  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x1248 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:245:0x1249  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x049a A[Catch: all -> 0x08ff, TryCatch #14 {all -> 0x08ff, blocks: (B:74:0x0494, B:76:0x049a, B:77:0x04de, B:79:0x04eb, B:81:0x04f4, B:82:0x0539, B:104:0x07b1, B:105:0x07b5, B:107:0x07bb, B:109:0x07d1, B:112:0x07de, B:115:0x07eb, B:122:0x0854, B:128:0x08d9, B:130:0x08df, B:131:0x08e0, B:133:0x08e2, B:135:0x08e9, B:136:0x08ea, B:83:0x0544, B:94:0x066b, B:96:0x0671, B:97:0x06b6, B:99:0x070d, B:100:0x074c, B:102:0x0761, B:103:0x07ab, B:138:0x08ec, B:140:0x08f3, B:141:0x08f4, B:143:0x08f6, B:145:0x08fd, B:146:0x08fe, B:118:0x081a, B:120:0x0820, B:121:0x084d, B:89:0x05e0, B:91:0x05f4, B:92:0x065f, B:84:0x0592, B:86:0x05a4, B:87:0x05d9, B:124:0x0859), top: B:290:0x0494, outer: #4, inners: #2, #6, #10, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x04eb A[Catch: all -> 0x08ff, TryCatch #14 {all -> 0x08ff, blocks: (B:74:0x0494, B:76:0x049a, B:77:0x04de, B:79:0x04eb, B:81:0x04f4, B:82:0x0539, B:104:0x07b1, B:105:0x07b5, B:107:0x07bb, B:109:0x07d1, B:112:0x07de, B:115:0x07eb, B:122:0x0854, B:128:0x08d9, B:130:0x08df, B:131:0x08e0, B:133:0x08e2, B:135:0x08e9, B:136:0x08ea, B:83:0x0544, B:94:0x066b, B:96:0x0671, B:97:0x06b6, B:99:0x070d, B:100:0x074c, B:102:0x0761, B:103:0x07ab, B:138:0x08ec, B:140:0x08f3, B:141:0x08f4, B:143:0x08f6, B:145:0x08fd, B:146:0x08fe, B:118:0x081a, B:120:0x0820, B:121:0x084d, B:89:0x05e0, B:91:0x05f4, B:92:0x065f, B:84:0x0592, B:86:0x05a4, B:87:0x05d9, B:124:0x0859), top: B:290:0x0494, outer: #4, inners: #2, #6, #10, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0544 A[Catch: all -> 0x08ff, TRY_LEAVE, TryCatch #14 {all -> 0x08ff, blocks: (B:74:0x0494, B:76:0x049a, B:77:0x04de, B:79:0x04eb, B:81:0x04f4, B:82:0x0539, B:104:0x07b1, B:105:0x07b5, B:107:0x07bb, B:109:0x07d1, B:112:0x07de, B:115:0x07eb, B:122:0x0854, B:128:0x08d9, B:130:0x08df, B:131:0x08e0, B:133:0x08e2, B:135:0x08e9, B:136:0x08ea, B:83:0x0544, B:94:0x066b, B:96:0x0671, B:97:0x06b6, B:99:0x070d, B:100:0x074c, B:102:0x0761, B:103:0x07ab, B:138:0x08ec, B:140:0x08f3, B:141:0x08f4, B:143:0x08f6, B:145:0x08fd, B:146:0x08fe, B:118:0x081a, B:120:0x0820, B:121:0x084d, B:89:0x05e0, B:91:0x05f4, B:92:0x065f, B:84:0x0592, B:86:0x05a4, B:87:0x05d9, B:124:0x0859), top: B:290:0x0494, outer: #4, inners: #2, #6, #10, #12 }] */
    @Override // kotlin.TaskCompletionSource, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5182
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createBundleFromClientSettings.attachBaseContext(android.content.Context):void");
    }

    static {
        RemoteActionCompatParcelizer = 0;
        MediaBrowserCompatItemReceiver();
        INSTANCE = new Companion(null);
        int i = read + 115;
        RemoteActionCompatParcelizer = i % 128;
        int i2 = i % 2;
    }

    @getMagicModuleMeta
    public static final Intent RemoteActionCompatParcelizer(Context context) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 107;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Intent intent = Companion.read(context);
        int i4 = AudioAttributesImplApi26Parcelizer + 23;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return intent;
    }

    @Override // kotlin.TaskCompletionSource, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 93;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void MediaBrowserCompatItemReceiver() {
        AudioAttributesCompatParcelizer = new char[]{44989, 45030, 45036, 44995, 44996, 45051, 45018, 44981, 45035, 45050, 45027, 45038, 45030, 45049, 45024, 45037, 45027, 45025, 44988, 45049, 45037, 45013, 45036, 44979, 45049, 45051, 45027, 45031, 45031, 44992, 44986, 45022, 45016, 45019, 45049, 45030, 45036, 45024, 45025, 44998, 44998, 45030, 45026, 44994, 44996, 45028, 45027, 44994, 44995, 45025, 45027, 45025, 45049, 45048, 45025, 45025, 45027, 45025, 45028, 44992, 45019, 45049, 45024, 45032, 45025, 45024, 45033, 45025, 45031, 45028, 45019, 45018, 45025, 45027, 45051, 45048, 45050, 45055, 45048, 45024, 45039, 45032, 44995, 44965, 44990, 45020, 45051, 45048, 45054, 45028, 44957, 45005, 45025, 45025, 45039, 45025, 45027, 45030, 45049, 45052, 45036, 45002, 44992, 45024, 45037, 45036, 44827, 44877, 44870, 44888, 44895, 44877, 44891, 44878, 44868, 44876, 44888, 44869, 44844, 44890, 44866, 44893, 44892, 44886, 44860, 44827, 44892, 44888, 44984, 45026, 45036, 45026, 45051, 45030, 45038, 45009, 45009, 45033, 45036, 45050, 45028, 45025, 45027, 44944, 44985, 44991, 44988, 44988, 44989, 44988, 44990, 44991, 44989, 44985};
        write = -273298444932986976L;
    }
}
