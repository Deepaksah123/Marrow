package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/StringResourceValueReader;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lo/parseServiceDescription;", "AudioAttributesCompatParcelizer", "Lo/parseServiceDescription;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StringResourceValueReader extends createBigInteger {
    private static int AudioAttributesImplApi21Parcelizer;
    private static int AudioAttributesImplApi26Parcelizer;
    private static int IconCompatParcelizer;
    private static byte[] MediaBrowserCompatCustomActionResultReceiver;
    private static short[] MediaBrowserCompatItemReceiver;
    private static int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int write;
    private parseServiceDescription AudioAttributesCompatParcelizer;
    private static final byte[] $$c = {10, -96, 35, -27};
    private static final int $$f = 74;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {62, -25, -124, -119, 61, -61, -2, -19, 47, -39, -10, -15, -2, -5, 11, -3, 11, -31, -7, -5, -2, 9, 0, -16, 35, -45, -7, 1, 8, -23, -23, -12, -6, -9, 11, 32, -38, -21, 7, -10, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17, 61, -27, -55, 5, 27, -32, 7, -28, 16, -17, 37, -40, -7, 0, 37, -48, -2, -7, -3, -3, 5, -13, -10, 36, -33, -14, -5, 11, -13, 5, -17, 41, -55, 0, 11, -17, 0, 9, -15, 21, -42, 7, -10, 8, -1, -19, 7, 2, 19, -25, -16, 7, -6, -1, 43, -30, -16, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17};
    private static final int $$h = 195;
    private static final byte[] $$a = {87, 74, -120, 12, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 41;
    private static int MediaDescriptionCompat = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int AudioAttributesImplBaseParcelizer = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(byte r6, int r7, int r8) {
        /*
            int r7 = r7 * 2
            int r7 = 4 - r7
            int r6 = r6 * 4
            int r6 = 112 - r6
            int r8 = r8 * 4
            int r8 = 1 - r8
            byte[] r0 = kotlin.StringResourceValueReader.$$c
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r5 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
        L26:
            int r7 = r7 + 1
            int r6 = r6 + r3
            r3 = r5
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.StringResourceValueReader.$$i(byte, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = 44 - r7
            byte[] r0 = kotlin.StringResourceValueReader.$$a
            int r9 = 191 - r9
            int r8 = r8 + 65
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r9
            r4 = r2
            goto L25
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L20
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L20:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L25:
            int r8 = r8 + r9
            int r8 = r8 + (-1)
            int r9 = r3 + 1
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.StringResourceValueReader.c(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 112 - r6
            int r0 = 56 - r7
            int r8 = r8 + 73
            byte[] r1 = kotlin.StringResourceValueReader.$$g
            byte[] r0 = new byte[r0]
            int r7 = 55 - r7
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r8
            r3 = r2
            r8 = r6
            goto L28
        L13:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
        L28:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-4)
            int r8 = r8 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.StringResourceValueReader.d(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.StringResourceValueReader$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001d\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/StringResourceValueReader$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "read", "(Landroid/content/Context;)Landroid/content/Intent;", "", "p1", "IconCompatParcelizer", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent read(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new Intent(p0, (Class<?>) StringResourceValueReader.class);
        }

        public static Intent IconCompatParcelizer(Context p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) StringResourceValueReader.class);
            intent.putExtra("email_id", p1);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void b(int i, int i2, boolean z, char[] cArr, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i2];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i5 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(AudioAttributesImplApi21Parcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 23703 - TextUtils.indexOf((CharSequence) "", '0'), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 31, -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 44862), 18944 - View.MeasureSpec.getMode(0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            cleardownloadmanagerhelpers.write = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i2 - cleardownloadmanagerhelpers.write);
        }
        if (z) {
            int i6 = $10 + 19;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            char[] cArr4 = new char[i2];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            int i8 = $11 + 63;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                int i10 = $10 + 51;
                $11 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 44863), 18944 - KeyEvent.normalizeMetaState(0), ((Process.getThreadPriority(0) + 20) >> 6) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x008d A[PHI: r4
      0x008d: PHI (r4v9 byte[] A[IMMUTABLE_TYPE]) = (r4v8 byte[]), (r4v23 byte[]) binds: [B:19:0x008b, B:16:0x0086] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0240 A[PHI: r0
      0x0240: PHI (r0v9 int) = (r0v8 int), (r0v64 int) binds: [B:57:0x023e, B:54:0x022c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0242 A[PHI: r0
      0x0242: PHI (r0v61 int) = (r0v8 int), (r0v64 int) binds: [B:57:0x023e, B:54:0x022c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r25, int r26, int r27, short r28, int r29, java.lang.Object[] r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 858
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.StringResourceValueReader.a(byte, int, int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x02b0  */
    @Override // kotlin.createBigInteger, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.StringResourceValueReader.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.createBigInteger, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 105;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = MediaBrowserCompatMediaItem + 83;
            MediaDescriptionCompat = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            a((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 36), (-1956706668) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1), (-487157386) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, (short) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 70, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 82, 18 - (ViewConfiguration.getKeyRepeatDelay() >> 16), true, new char[]{2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b', 11, 65529, 4, 5, 65535, '\n', 65527, 65529, 65535}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 25, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = (!((baseContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i6 = MediaDescriptionCompat + 105;
            MediaBrowserCompatMediaItem = i6 % 128;
            try {
                if (i6 % 2 == 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 4535), 6054 - (Process.myTid() >> 22), (ViewConfiguration.getLongPressTimeout() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (KeyEvent.getMaxKeyCode() >> 16), Color.argb(0, 0, 0, 0) + 6030, 23 - TextUtils.indexOf((CharSequence) "", '0', 0), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    int i7 = 22 / 0;
                } else {
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (4535 - KeyEvent.normalizeMetaState(0)), 6054 - View.MeasureSpec.makeMeasureSpec(0, 0), 42 - View.resolveSizeAndState(0, 0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) Color.argb(0, 0, 0, 0), TextUtils.lastIndexOf("", '0', 0) + 6031, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0119  */
    @Override // kotlin.createBigInteger, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.StringResourceValueReader.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(27:(25:282|36|(2:38|(2:40|(2:42|46)(1:43))(2:44|45))(1:46)|82|275|83|(1:85)|86|(3:88|(1:90)|91)(19:92|93|268|94|(1:96)|97|98|285|99|(1:101)|102|103|104|(1:106)|107|(1:109)|110|(1:112)|113)|114|(4:117|(13:292|119|(3:121|(4:124|(3:298|126|301)(4:297|127|128|300)|299|122)|296)|129|276|130|(1:132)|133|134|135|271|136|295)(1:294)|293|115)|291|171|(1:173)|174|(2:176|(3:178|(1:180)|181)(3:182|(1:184)|185))(13:187|278|188|189|(1:191)|192|264|193|194|(1:196)|197|(1:199)|200)|186|201|(6:203|204|(1:206)|207|208|209)|210|(1:212)|213|(3:215|(1:217)|218)(14:219|220|(1:222)|223|224|(1:226)|227|283|228|229|(1:231)|232|(1:234)|235)|236|(7:238|239|(1:241)|242|243|244|245)(1:302))|280|55|(1:57)|58|82|275|83|(0)|86|(0)(0)|114|(1:115)|291|171|(0)|174|(0)(0)|186|201|(0)|210|(0)|213|(0)(0)|236|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0e0e, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0e0f, code lost:
    
        r4 = new java.lang.Object[1];
        a((byte) (((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), (-1956706665) - android.text.TextUtils.lastIndexOf("", '0', 0), ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 487157072, (short) (((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10), ((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_track_resolution).substring(0, 4).length() - 54, r4);
        r2 = (java.lang.String) r4[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x0ead, code lost:
    
        r4 = new java.io.ByteArrayOutputStream();
        r6 = new java.io.PrintStream(r4);
        r0.printStackTrace(r6);
        r6.close();
        r1 = r4.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0ec4, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0ec8, code lost:
    
        r4 = new java.util.ArrayList(2);
        r4.add(r1);
        r4.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0ed7, code lost:
    
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0edb, code lost:
    
        if (r1 == null) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0edd, code lost:
    
        r1 = kotlin.startForeground.read((char) (android.view.KeyEvent.keyCodeFromString("") + 4535), 6054 - android.graphics.Color.red(0), 41 - android.text.TextUtils.indexOf((java.lang.CharSequence) "", '0', 0, 0), -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x0efe, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:170:0x0f0a, code lost:
    
        r8 = new java.lang.Object[]{-205212504, 81604378625L, r4, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r2 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) ((-16777216) - android.graphics.Color.rgb(0, 0, 0)), 6031 - (android.os.Process.getElapsedCpuTime() > 0 ? 1 : (android.os.Process.getElapsedCpuTime() == 0 ? 0 : -1)), android.view.View.combineMeasuredStates(0, 0) + 24);
        r11 = new java.lang.Object[1];
        d((byte) 82, (byte) (-kotlin.StringResourceValueReader.$$g[64]), r6[21], r11);
        r2.getMethod((java.lang.String) r11[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r8);
     */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0cc8 A[Catch: all -> 0x0e0e, TryCatch #6 {all -> 0x0e0e, blocks: (B:83:0x07ee, B:85:0x07f4, B:86:0x0836, B:88:0x0843, B:90:0x084c, B:91:0x0887, B:114:0x0cbe, B:115:0x0cc2, B:117:0x0cc8, B:119:0x0cde, B:122:0x0ceb, B:126:0x0cfa, B:127:0x0d02, B:134:0x0d68, B:140:0x0de8, B:142:0x0dee, B:143:0x0def, B:145:0x0df1, B:147:0x0df8, B:148:0x0df9, B:92:0x0892, B:104:0x0a7c, B:106:0x0a82, B:107:0x0ac1, B:109:0x0c12, B:110:0x0c59, B:112:0x0c6f, B:113:0x0cb8, B:150:0x0dfb, B:152:0x0e02, B:153:0x0e03, B:155:0x0e05, B:157:0x0e0c, B:158:0x0e0d, B:94:0x09ab, B:96:0x09bf, B:97:0x09f2, B:136:0x0d6d, B:130:0x0d2f, B:132:0x0d35, B:133:0x0d61, B:99:0x09f9, B:101:0x0a0d, B:102:0x0a70), top: B:275:0x07ee, outer: #3, inners: #2, #4, #7, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0f91  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0fe3  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x1093  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x148e  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x156a  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x15b3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x1604  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x19d2  */
    /* JADX WARN: Removed duplicated region for block: B:302:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x07f4 A[Catch: all -> 0x0e0e, TryCatch #6 {all -> 0x0e0e, blocks: (B:83:0x07ee, B:85:0x07f4, B:86:0x0836, B:88:0x0843, B:90:0x084c, B:91:0x0887, B:114:0x0cbe, B:115:0x0cc2, B:117:0x0cc8, B:119:0x0cde, B:122:0x0ceb, B:126:0x0cfa, B:127:0x0d02, B:134:0x0d68, B:140:0x0de8, B:142:0x0dee, B:143:0x0def, B:145:0x0df1, B:147:0x0df8, B:148:0x0df9, B:92:0x0892, B:104:0x0a7c, B:106:0x0a82, B:107:0x0ac1, B:109:0x0c12, B:110:0x0c59, B:112:0x0c6f, B:113:0x0cb8, B:150:0x0dfb, B:152:0x0e02, B:153:0x0e03, B:155:0x0e05, B:157:0x0e0c, B:158:0x0e0d, B:94:0x09ab, B:96:0x09bf, B:97:0x09f2, B:136:0x0d6d, B:130:0x0d2f, B:132:0x0d35, B:133:0x0d61, B:99:0x09f9, B:101:0x0a0d, B:102:0x0a70), top: B:275:0x07ee, outer: #3, inners: #2, #4, #7, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0843 A[Catch: all -> 0x0e0e, TryCatch #6 {all -> 0x0e0e, blocks: (B:83:0x07ee, B:85:0x07f4, B:86:0x0836, B:88:0x0843, B:90:0x084c, B:91:0x0887, B:114:0x0cbe, B:115:0x0cc2, B:117:0x0cc8, B:119:0x0cde, B:122:0x0ceb, B:126:0x0cfa, B:127:0x0d02, B:134:0x0d68, B:140:0x0de8, B:142:0x0dee, B:143:0x0def, B:145:0x0df1, B:147:0x0df8, B:148:0x0df9, B:92:0x0892, B:104:0x0a7c, B:106:0x0a82, B:107:0x0ac1, B:109:0x0c12, B:110:0x0c59, B:112:0x0c6f, B:113:0x0cb8, B:150:0x0dfb, B:152:0x0e02, B:153:0x0e03, B:155:0x0e05, B:157:0x0e0c, B:158:0x0e0d, B:94:0x09ab, B:96:0x09bf, B:97:0x09f2, B:136:0x0d6d, B:130:0x0d2f, B:132:0x0d35, B:133:0x0d61, B:99:0x09f9, B:101:0x0a0d, B:102:0x0a70), top: B:275:0x07ee, outer: #3, inners: #2, #4, #7, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0892 A[Catch: all -> 0x0e0e, TRY_LEAVE, TryCatch #6 {all -> 0x0e0e, blocks: (B:83:0x07ee, B:85:0x07f4, B:86:0x0836, B:88:0x0843, B:90:0x084c, B:91:0x0887, B:114:0x0cbe, B:115:0x0cc2, B:117:0x0cc8, B:119:0x0cde, B:122:0x0ceb, B:126:0x0cfa, B:127:0x0d02, B:134:0x0d68, B:140:0x0de8, B:142:0x0dee, B:143:0x0def, B:145:0x0df1, B:147:0x0df8, B:148:0x0df9, B:92:0x0892, B:104:0x0a7c, B:106:0x0a82, B:107:0x0ac1, B:109:0x0c12, B:110:0x0c59, B:112:0x0c6f, B:113:0x0cb8, B:150:0x0dfb, B:152:0x0e02, B:153:0x0e03, B:155:0x0e05, B:157:0x0e0c, B:158:0x0e0d, B:94:0x09ab, B:96:0x09bf, B:97:0x09f2, B:136:0x0d6d, B:130:0x0d2f, B:132:0x0d35, B:133:0x0d61, B:99:0x09f9, B:101:0x0a0d, B:102:0x0a70), top: B:275:0x07ee, outer: #3, inners: #2, #4, #7, #12 }] */
    @Override // kotlin.createBigInteger, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6990
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.StringResourceValueReader.attachBaseContext(android.content.Context):void");
    }

    static {
        AudioAttributesImplApi26Parcelizer = 0;
        AudioAttributesImplApi26Parcelizer();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplBaseParcelizer + 3;
        AudioAttributesImplApi26Parcelizer = i % 128;
        int i2 = i % 2;
    }

    @Override // kotlin.createBigInteger, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 65;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatMediaItem + 91;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    static void AudioAttributesImplApi26Parcelizer() {
        write = -769594165;
        IconCompatParcelizer = -819363190;
        RemoteActionCompatParcelizer = -1148617941;
        MediaBrowserCompatCustomActionResultReceiver = new byte[]{-73, -71, -75, 67, 74, -107, -107, 12, -77, -10, 125, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -71, 65, -70, TarConstants.LF_GNUTYPE_LONGNAME, -93, 107, -69, -76, TarConstants.LF_GNUTYPE_LONGLINK, 68, -67, -93, 108, -78, -68, 68, -70, 66, -90, -107, -92, 9, -73, -72, -124, 125, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -71, 65, -70, 72, -102, -74, -76, TarConstants.LF_GNUTYPE_LONGLINK, -79, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -102, 98, 72, -74, 74, -104, -77, 122, -126, 73, -74, 73, 101, -102, 121, -103, 72, 100, -74, -123, -76, 122, 73, -126, TarConstants.LF_GNUTYPE_LONGNAME, 102, 73, -74, -101, -79, 74, -75, 101, -74, 74, -74, 74, -127, TarConstants.LF_GNUTYPE_LONGNAME, 101, -77, 121, -121, 101, 73, 72, -103, -76, -74, TarConstants.LF_GNUTYPE_LONGNAME, -65, -74, TarConstants.LF_GNUTYPE_LONGNAME, TarConstants.LF_GNUTYPE_LONGLINK, -66, 123, -124, 124, -75, -73, -75, -100, 72, -65, 74, -74, 123, -124, 102, -103, -77, -73, 73, TarConstants.LF_GNUTYPE_LONGNAME, 73, -66, 72, -73, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -98, -78, TarConstants.LF_GNUTYPE_LONGLINK, -75, 74, 111, TarConstants.LF_GNUTYPE_LONGLINK, -77, -100, 101, -124, -74, 121, 73, -102, -75, 72, 72, 97, -99, -80, 122, -73, -124, -75, 72, -74, 99, -102, 100, -122, 121, -121, 74, -78, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, TarConstants.LF_GNUTYPE_LONGNAME, -75, -104, 99, -122, 73, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -124, 124, -124, -74, 124, -124, 121, -77, TarConstants.LF_GNUTYPE_LONGLINK, -103, 97, -102, TarConstants.LF_GNUTYPE_LONGLINK, -80, TarConstants.LF_GNUTYPE_LONGNAME, -76, 77, 98, 72, -101, -80, 72, -75, 72, -74, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -74, -98, 99, -73, -76, -98, -80, TarConstants.LF_GNUTYPE_LONGLINK, 102, -73, -101, 98, -122, -74, 122, -76, -121, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 72, -79, -66, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -90, -127, 74, 11, -16, 12, -74, -71, 73, 78, -78, -115, 113, 78, -72, -123, 117, 73, -69, -126, 126, 68, -90, 91, -77, 73, -72, 69, -90, 91, -71, -114, 13, -74, -91, 73, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -92, TarConstants.LF_GNUTYPE_LONGLINK, 68, -67, 67, -15, 12, -72, 65, 78, -79, 74, 78, -70, -76, -65, 74, -126, -73, 66, 112, -76, TarConstants.LF_GNUTYPE_LONGLINK, -73, -69, -74, 66, -101, 108, 66, -91, -82, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -78, -68, 66, -79, -66, -74, TarConstants.LF_GNUTYPE_LONGNAME, -65, 67, -76, -98, 97, -65, 70, -74, 77, -111, -110, 12, -77, -10, 125, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -71, 65, -70, 79, -77, 66, -65, -68, TarConstants.LF_GNUTYPE_LONGLINK, -92, 89, 72, 69, -76, -72, 66, -80, 77, 74, -80, TarConstants.LF_GNUTYPE_LONGNAME, -74, 74, -78, TarConstants.LF_GNUTYPE_LONGNAME, -80, 73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73};
        AudioAttributesImplApi21Parcelizer = 1000326252;
    }
}
