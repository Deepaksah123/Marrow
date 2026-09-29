package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
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
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
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
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/StreetViewSource;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lo/parseProfiles;", "RemoteActionCompatParcelizer", "Lo/parseProfiles;", "write", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class StreetViewSource extends StreetViewPanoramaLink {
    private static int AudioAttributesCompatParcelizer;
    private static int AudioAttributesImplApi21Parcelizer;
    private static int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static long read;
    private static char write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private parseProfiles write;
    private static final byte[] $$l = {16, -101, -28, -55};
    private static final int $$m = 144;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {81, 95, TarConstants.LF_LINK, -71, 70, -52, 7, -10, 39, -10, -14, 16, 0, 12, 18, 9, 2, -14, -3, 3, 0, 20, 41, -29, -12, 16, -1, 6, TarConstants.LF_NORMAL, -39, 7, 2, 20, -14, 41, -12, -12, 20, 3, -2, 8, -12, 26, -8, 70, -71, 5, 27, -7, 10, 14, -6, 20};
    private static final int $$k = 93;
    private static final byte[] $$d = {18, -64, -35, -97, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 12;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static int AudioAttributesImplBaseParcelizer = 0;

    private static String $$n(int i, short s, int i2) {
        int i3 = 103 - (i2 * 3);
        int i4 = s * 3;
        int i5 = (i * 3) + 4;
        byte[] bArr = $$l;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i6 = -1;
            i3 = i5 + i3;
            i5++;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i4) {
                return new String(bArr2, 0);
            }
            int i8 = i3;
            i6 = i7;
            i3 = bArr[i5] + i8;
            i5++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.StreetViewSource.$$d
            int r1 = r7 + 4
            int r5 = r5 + 65
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r5
            r5 = r7
            r3 = r2
            goto L27
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
        L27:
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.StreetViewSource.g(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.StreetViewSource.$$j
            int r1 = r7 + 4
            int r5 = r5 + 82
            int r6 = 48 - r6
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L20:
            int r6 = r6 + 1
            r4 = r0[r6]
            int r3 = r3 + 1
        L26:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + 5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.StreetViewSource.h(byte, byte, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.StreetViewSource$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/StreetViewSource$IconCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "Landroid/content/Intent;", "IconCompatParcelizer", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent IconCompatParcelizer(Context p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) StreetViewSource.class);
            intent.putExtra("email", p1);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void e(char[] cArr, int i, char[] cArr2, char[] cArr3, char c, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        int i4 = $10 + 55;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i6 = $11 + 43;
            $10 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 22796 - AndroidCharacter.getMirror('0'), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 37, 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (31368 - TextUtils.lastIndexOf("", '0', 0, 0)), 2721 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf("", "") + 38, 1895162189, false, $$n(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) TextUtils.getOffsetBefore("", 0), 15713 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getLongPressTimeout() >> 16) + 64, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (40976 - (ViewConfiguration.getTapTimeout() >> 16)), 6123 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.getTrimmedLength("") + 29, -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (read ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) AudioAttributesCompatParcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) write) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i8 = $10 + 11;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    private static void f(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i) {
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i3 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i5 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(AudioAttributesImplApi26Parcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getTouchSlop() >> 8), ((byte) KeyEvent.getModifierMetaStateMask()) + 23705, (Process.myPid() >> 22) + 32, -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (Color.rgb(0, 0, 0) + 16822078), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 18944, 28 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i6 = $10 + 3;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i2 > 0) {
            cleardownloadmanagerhelpers.write = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i - cleardownloadmanagerhelpers.write);
        }
        if (z) {
            int i8 = $10 + 31;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i) {
                int i10 = $11 + 119;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 44861), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 18943, Color.red(0) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                int i12 = $10 + 117;
                $11 = i12 % 128;
                int i13 = i12 % 2;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x00f3  */
    @Override // kotlin.StreetViewPanoramaLink, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.StreetViewSource.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.StreetViewPanoramaLink, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 71, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 30, new char[]{5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6, 1, 65483, 65534, '\r', '\r', 65483, 65502, 0, 17, 6, 19, 6, 17, 22, 65521}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) + 166, false, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f((ViewConfiguration.getFadingEdgeLength() >> 16) + 18, 8 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), new char[]{65535, 65529, 65527, '\n', 65535, 5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2}, (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 219, false, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 51;
            MediaBrowserCompatItemReceiver = i2 % 128;
            if (i2 % 2 != 0) {
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
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4535), 6053 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 43 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), Color.rgb(0, 0, 0) + 16783246, TextUtils.lastIndexOf("", '0', 0, 0) + 25, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i3 = MediaBrowserCompatCustomActionResultReceiver + 71;
                MediaBrowserCompatItemReceiver = i3 % 128;
                int i4 = i3 % 2;
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013f  */
    @Override // kotlin.StreetViewPanoramaLink, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.StreetViewSource.onPause():void");
    }

    @Override // kotlin.StreetViewPanoramaLink, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        String strValueOf;
        String strValueOf2;
        Object[] objArr;
        Object[] objArr2;
        List<Object[]> list;
        Context applicationContext = context;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object[] objArr3 = new Object[1];
        e(new char[]{0, 0, 0, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 36, new char[]{56868, 40106, 33530, 2295, 30256, 60634, 55768, 11580, 3767, 55350, 594, 56687, 32371, 17359, 27394, 28016, 5225, 46288}, new char[]{429, 30673, 299, 9319}, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26369), objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        f((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 4, KeyEvent.normalizeMetaState(0) + 1, new char[]{5, 65532, 1, 65517, 17}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 213, true, objArr4);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context applicationContext2 = applicationContext != null ? ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : context.getApplicationContext() : applicationContext;
            if (applicationContext2 != null) {
                int i2 = MediaBrowserCompatItemReceiver + 27;
                MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
                int i3 = i2 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (Color.rgb(0, 0, 0) + 16781751), Color.green(0) + 6054, (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), new char[]{10265, 40822, 62400, 18832, 16421, 44074, 47556, 49457, 7404, 30605, 11141, 4126, 370, 20889, 21822, 6917, 26786, 52896, 41489, 43438, 54087, 36415, 21032, 10602, 7494, 15371, 32923, 50423, 11959, 26106, 26229, 33521, 28689, 5548, 7087, 11179, 23290, 9529, 17165, 19638, 11318, 22628, 3216, 57149, 18568, 24746, 21635, 47096}, new char[]{37300, 14138, 26151, 9452}, (char) ExpandableListView.getPackedPositionType(0L), objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, View.getDefaultSize(0, 0), new char[]{50318, 56272, 35460, 26831, 3856, 49140, 23466, 6219, 61469, 36818, 56002, 29328, 64071, 60899, 52531, 14944, 35882, 38822, 60961, 725, 36345, 29111, 29799, 51290, 16683, 35805, 46759, 52058, 2759, 6626, 44534, 62058, 41481, 46371, 60413, 14286, 17501, 1264, 18965, 2895, 30123, 33949, 211, 12327, 42914, 22477, 9854, 53492, 60855, 43198, 38707, 57946, 3796, 34778, 16829, 12058, 60292, 38129, 57647, 20339, 10167, 39603, 17384, 5590}, new char[]{11588, 41675, 27997, 13710}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 36), objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    f(64 - ExpandableListView.getPackedPositionType(0L), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 3, new char[]{27, 65521, 65519, 65520, 65519, 27, 65518, 27, 65514, 28, 65516, 65519, 65514, 26, 31, 29, 65518, 26, 65513, 65515, 28, 65513, 30, 65515, 65514, 31, 65516, 30, 26, 30, 65520, 26, 65517, 65521, 65514, 65519, 65516, 65522, 29, 30, 65522, 65515, 65516, 65514, 65515, 65514, 27, 26, 65521, 29, 29, 26, 65521, 65514, 65518, 29, 29, 65521, 28, 65515, 65514, 29, 26, 65514}, 184 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), true, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 32, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 49, new char[]{17, 65484, 18, 6, 16, 3, 65535, 18, 1, 65535, 17, 18, 65484, 5, 19, 65535, 16, 2, 17, 15, 19, 65535, 16, 3, 65484, 1, '\r', 11, 65485, 65535, 14, 7, 65485, 7, '\f', 5, 3, 17, 18, 65485, 20, 65488, 65485, 3, 20, 3, '\f', 18, 17, 6, 18, 18, 14, 17, 65496, 65485, 65485, 2, 65535, 7, '\n', 23, 16, '\r', 19, '\f', 2}, 212 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), false, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 4, View.MeasureSpec.getMode(0) + 3, new char[]{65535, 65532, 7, 0, 65532, 2}, TextUtils.indexOf((CharSequence) "", '0') + 164, true, objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 26, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 11, new char[]{'&', 65517, 65524, 65526, 65524, 65527, 65517, 65529, '\"', 65522, 65520, 65517, '&', 65527, '!', 65522, 65527, '%', '#', '&', 65521, '!', 65526, 65526, 65522, 65521, '\"', 65527, 65526, 65522, 65521, 65521, 65517, 65528, '&', 65528}, ((byte) KeyEvent.getModifierMetaStateMask()) + 178, false, objArr10);
                    Object[] objArr11 = {applicationContext2, str, str2, str3, str4, true, str5, (String) objArr10[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.indexOf("", "", 0), 6030 - TextUtils.indexOf("", ""), 24 - KeyEvent.getDeadChar(0, 0), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
        if (applicationContext != null) {
            try {
                try {
                    applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : context.getApplicationContext();
                } catch (Throwable th2) {
                    Object[] objArr12 = new Object[1];
                    e(new char[]{0, 0, 0, 0}, TextUtils.indexOf((CharSequence) "", '0') - 580143027, new char[]{522, 32294, 11121, 40580, 30696, 57286, 53870, 14308, 52309, 52888, 60889}, new char[]{19520, 27576, 59357, 46216}, (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), objArr12);
                    String str6 = (String) objArr12[0];
                    try {
                        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                        PrintStream printStream = new PrintStream(byteArrayOutputStream);
                        th2.printStackTrace(printStream);
                        printStream.close();
                        strValueOf = byteArrayOutputStream.toString(CharsetNames.UTF_8);
                    } catch (Throwable unused) {
                        strValueOf = String.valueOf(th2);
                    }
                    ArrayList arrayList = new ArrayList(2);
                    arrayList.add(strValueOf);
                    arrayList.add(str6);
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (4535 - TextUtils.getCapsMode("", 0, 0)), Process.getGidForName("") + 6055, AndroidCharacter.getMirror('0') - 6, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                    Object[] objArr13 = {-982505877, 81604378625L, arrayList, TrainingApplication.RemoteActionCompatParcelizer(), false};
                    Class cls2 = (Class) startForeground.IconCompatParcelizer((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6030, (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23);
                    byte b = $$j[12];
                    Object[] objArr14 = new Object[1];
                    h(b, (byte) (b | 32), (byte) ($$k & 58), objArr14);
                    cls2.getMethod((String) objArr14[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr13);
                }
            } catch (Throwable th3) {
                Throwable cause2 = th3.getCause();
                if (cause2 == null) {
                    throw th3;
                }
                throw cause2;
            }
        }
        try {
            Object[] objArr15 = {-982505877};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1128409246);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 1991 - (Process.myTid() >> 22), 12 - (ViewConfiguration.getDoubleTapTimeout() >> 16), -1024191497, false, null, new Class[]{Integer.TYPE});
            }
            try {
                Object[] objArr16 = {applicationContext, ((Constructor) objRemoteActionCompatParcelizer4).newInstance(objArr15)};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(352975618);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char cIndexOf = (char) (19322 - TextUtils.indexOf((CharSequence) "", '0'));
                    int i4 = (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2759;
                    int iBlue = 99 - Color.blue(0);
                    int i5 = $$e;
                    Object[] objArr17 = new Object[1];
                    g((byte) (i5 + 5), (short) (i5 | 96), (byte) (i5 << 1), objArr17);
                    objRemoteActionCompatParcelizer5 = startForeground.read(cIndexOf, i4, iBlue, 1799372695, false, (String) objArr17[0], new Class[]{Context.class, (Class) startForeground.IconCompatParcelizer((char) (AndroidCharacter.getMirror('0') + 9532), 3447 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 192 - AndroidCharacter.getMirror('0'))});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr16);
                try {
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-18205161);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char mode = (char) (61148 - View.MeasureSpec.getMode(0));
                        int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 2145;
                        int gidForName = 11 - Process.getGidForName("");
                        byte[] bArr = $$d;
                        Object[] objArr18 = new Object[1];
                        g(bArr[9], (short) TsExtractor.TS_STREAM_TYPE_E_AC3, bArr[5], objArr18);
                        objRemoteActionCompatParcelizer6 = startForeground.read(mode, iResolveSizeAndState, gidForName, -2136739198, false, (String) objArr18[0], null);
                    }
                    if (((Field) objRemoteActionCompatParcelizer6).getLong(null) != -1) {
                        Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-629126231);
                        if (objRemoteActionCompatParcelizer7 == null) {
                            char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 61147);
                            int scrollBarFadeDuration = 2145 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int gidForName2 = 11 - Process.getGidForName("");
                            Object[] objArr19 = new Object[1];
                            g((byte) $$e, (short) TsExtractor.TS_STREAM_TYPE_DTS, (byte) (-$$d[164]), objArr19);
                            objRemoteActionCompatParcelizer7 = startForeground.read(c, scrollBarFadeDuration, gidForName2, -1530294468, false, (String) objArr19[0], null);
                        }
                        list = (List) ((Field) objRemoteActionCompatParcelizer7).get(null);
                    } else {
                        Object[] objArr20 = new Object[1];
                        f(16 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 15, new char[]{11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b'}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) + 96, true, objArr20);
                        Class<?> cls3 = Class.forName((String) objArr20[0]);
                        Object[] objArr21 = new Object[1];
                        f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 98, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 1, new char[]{2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r'}, (ViewConfiguration.getPressedStateDuration() >> 16) + 215, false, objArr21);
                        int iIntValue2 = ((Integer) cls3.getMethod((String) objArr21[0], Object.class).invoke(null, this)).intValue();
                        try {
                            Object[] objArr22 = {-982505877};
                            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-173351824);
                            if (objRemoteActionCompatParcelizer8 == null) {
                                objRemoteActionCompatParcelizer8 = startForeground.read((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 45845), 913 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 10 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1948051227, false, null, new Class[]{Integer.TYPE});
                            }
                            try {
                                Object[] objArr23 = {Integer.valueOf(iIntValue2), ((Constructor) objRemoteActionCompatParcelizer8).newInstance(objArr22)};
                                Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(1891595430);
                                if (objRemoteActionCompatParcelizer9 == null) {
                                    char cIndexOf2 = (char) (61147 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
                                    int size = View.MeasureSpec.getSize(0) + 2145;
                                    int i6 = 12 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                    Object[] objArr24 = new Object[1];
                                    g(r4[75], (short) 167, (byte) (-$$d[45]), objArr24);
                                    objRemoteActionCompatParcelizer9 = startForeground.read(cIndexOf2, size, i6, 251047987, false, (String) objArr24[0], new Class[]{Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), View.MeasureSpec.makeMeasureSpec(0, 0) + 557, 17 - ImageFormat.getBitsPerPixel(0))});
                                }
                                list = (List) ((Method) objRemoteActionCompatParcelizer9).invoke(null, objArr23);
                                Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(-629126231);
                                if (objRemoteActionCompatParcelizer10 == null) {
                                    char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 61148);
                                    int iCombineMeasuredStates = 2145 - View.combineMeasuredStates(0, 0);
                                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 12;
                                    Object[] objArr25 = new Object[1];
                                    g((byte) $$e, (short) TsExtractor.TS_STREAM_TYPE_DTS, (byte) (-$$d[164]), objArr25);
                                    objRemoteActionCompatParcelizer10 = startForeground.read(touchSlop, iCombineMeasuredStates, edgeSlop, -1530294468, false, (String) objArr25[0], null);
                                }
                                ((Field) objRemoteActionCompatParcelizer10).set(null, list);
                                Object[] objArr26 = new Object[1];
                                e(new char[]{0, 0, 0, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 119, new char[]{50640, 59652, 41621, 60611, 37341, 6210, 32518, 57516, 64152, 59424, 24540, 63413, 51013, 16211, 52609, 62620, 35927, 21479, 36094, 38075, 1898, 23188}, new char[]{9607, 19788, 65171, 2449}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 46), objArr26);
                                Class<?> cls4 = Class.forName((String) objArr26[0]);
                                Object[] objArr27 = new Object[1];
                                e(new char[]{0, 0, 0, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1580264469, new char[]{50583, 18229, 41788, 28251, 5932, 783, 37688, 37807, 18263, 19703, 42752, 54526, 49770, 353, 18946}, new char[]{14518, 12524, 54366, 25834}, (char) (Color.green(0) + 60116), objArr27);
                                long jLongValue = ((Long) cls4.getDeclaredMethod((String) objArr27[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue);
                                Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(301834150);
                                if (objRemoteActionCompatParcelizer11 == null) {
                                    char cGreen = (char) (Color.green(0) + 61148);
                                    int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2145;
                                    int maximumDrawingCacheSize = 12 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                    int i7 = $$e;
                                    Object[] objArr28 = new Object[1];
                                    g((byte) (i7 + 5), (short) (i7 | 96), (byte) (i7 << 1), objArr28);
                                    objRemoteActionCompatParcelizer11 = startForeground.read(cGreen, scrollDefaultDelay, maximumDrawingCacheSize, 1874090803, false, (String) objArr28[0], null);
                                }
                                ((Field) objRemoteActionCompatParcelizer11).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                                Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(-18205161);
                                if (objRemoteActionCompatParcelizer12 == null) {
                                    char mirror = (char) (61196 - AndroidCharacter.getMirror('0'));
                                    int i8 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 2146;
                                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 12;
                                    byte[] bArr2 = $$d;
                                    Object[] objArr29 = new Object[1];
                                    g(bArr2[9], (short) TsExtractor.TS_STREAM_TYPE_E_AC3, bArr2[5], objArr29);
                                    objRemoteActionCompatParcelizer12 = startForeground.read(mirror, i8, iNormalizeMetaState, -2136739198, false, (String) objArr29[0], null);
                                }
                                ((Field) objRemoteActionCompatParcelizer12).set(null, lValueOf2);
                            } catch (Throwable th4) {
                                Throwable cause3 = th4.getCause();
                                if (cause3 == null) {
                                    throw th4;
                                }
                                throw cause3;
                            }
                        } catch (Throwable th5) {
                            Throwable cause4 = th5.getCause();
                            if (cause4 == null) {
                                throw th5;
                            }
                            throw cause4;
                        }
                    }
                    int i9 = MediaBrowserCompatCustomActionResultReceiver + 49;
                    MediaBrowserCompatItemReceiver = i9 % 128;
                    int i10 = i9 % 2;
                    for (Object[] objArr30 : list) {
                        int i11 = MediaBrowserCompatItemReceiver + 109;
                        MediaBrowserCompatCustomActionResultReceiver = i11 % 128;
                        int i12 = i11 % 2;
                        int i13 = ((int[]) objArr30[3])[0];
                        int i14 = ((int[]) objArr30[1])[0];
                        if (i14 != i13) {
                            ArrayList arrayList2 = new ArrayList();
                            String[] strArr = (String[]) objArr30[2];
                            if (strArr != null) {
                                for (String str7 : strArr) {
                                    int i15 = MediaBrowserCompatItemReceiver + 113;
                                    MediaBrowserCompatCustomActionResultReceiver = i15 % 128;
                                    int i16 = i15 % 2;
                                    arrayList2.add(str7);
                                }
                            }
                            long j = -1;
                            long j2 = ((long) (i14 ^ i13)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
                            long j3 = 0;
                            long j4 = j2 | (((long) 10) << 32) | (j3 - ((j3 >> 63) << 32));
                            try {
                                Object objRemoteActionCompatParcelizer13 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                                if (objRemoteActionCompatParcelizer13 == null) {
                                    objRemoteActionCompatParcelizer13 = startForeground.read((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4534), 6053 - TextUtils.indexOf((CharSequence) "", '0', 0), (Process.myPid() >> 22) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                                }
                                Object objInvoke3 = ((Method) objRemoteActionCompatParcelizer13).invoke(null, null);
                                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                                int i17 = MediaBrowserCompatCustomActionResultReceiver + 5;
                                MediaBrowserCompatItemReceiver = i17 % 128;
                                int i18 = i17 % 2;
                                try {
                                    Object[] objArr31 = {-982505877, Long.valueOf(j4), arrayList2, strRemoteActionCompatParcelizer, false};
                                    Class cls5 = (Class) startForeground.IconCompatParcelizer((char) TextUtils.indexOf("", "", 0, 0), 6029 - ImageFormat.getBitsPerPixel(0), 24 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                                    byte b2 = $$j[12];
                                    Object[] objArr32 = new Object[1];
                                    h(b2, (byte) (b2 | 32), (byte) ($$k & 58), objArr32);
                                    cls5.getMethod((String) objArr32[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke3, objArr31);
                                } catch (Throwable th6) {
                                    Throwable cause5 = th6.getCause();
                                    if (cause5 == null) {
                                        throw th6;
                                    }
                                    throw cause5;
                                }
                            } catch (Throwable th7) {
                                Throwable cause6 = th7.getCause();
                                if (cause6 == null) {
                                    throw th7;
                                }
                                throw cause6;
                            }
                        }
                    }
                } catch (Throwable th8) {
                    Object[] objArr33 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 1, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 25, new char[]{1, 4, 65533, 2, 1, 4, 65535, 4, 65533, 65535, 65531}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 156, true, objArr33);
                    String str8 = (String) objArr33[0];
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
                    Object objRemoteActionCompatParcelizer14 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer14 == null) {
                        objRemoteActionCompatParcelizer14 = startForeground.read((char) (4535 - ((Process.getThreadPriority(0) + 20) >> 6)), 6054 - ((Process.getThreadPriority(0) + 20) >> 6), 42 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke4 = ((Method) objRemoteActionCompatParcelizer14).invoke(null, null);
                    Object[] objArr34 = {-982505877, 81604378625L, arrayList3, TrainingApplication.RemoteActionCompatParcelizer(), false};
                    Class cls6 = (Class) startForeground.IconCompatParcelizer((char) View.resolveSize(0, 0), 6030 - (Process.myTid() >> 22), 24 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)));
                    byte b3 = $$j[12];
                    Object[] objArr35 = new Object[1];
                    h(b3, (byte) (b3 | 32), (byte) ($$k & 58), objArr35);
                    cls6.getMethod((String) objArr35[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke4, objArr34);
                    int i19 = MediaBrowserCompatItemReceiver + 75;
                    MediaBrowserCompatCustomActionResultReceiver = i19 % 128;
                    int i20 = i19 % 2;
                }
                Object objRemoteActionCompatParcelizer15 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                if (objRemoteActionCompatParcelizer15 == null) {
                    char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 13183);
                    int iLastIndexOf = 1648 - TextUtils.lastIndexOf("", '0', 0);
                    int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 26;
                    byte b4 = (byte) $$e;
                    short s = $$d[17];
                    Object[] objArr36 = new Object[1];
                    g(b4, s, (byte) (s & 40), objArr36);
                    objRemoteActionCompatParcelizer15 = startForeground.read(cNormalizeMetaState, iLastIndexOf, touchSlop2, -133433128, false, (String) objArr36[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer15).getLong(null) != -1) {
                    Object objRemoteActionCompatParcelizer16 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                    if (objRemoteActionCompatParcelizer16 == null) {
                        char c2 = (char) (13183 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 1649;
                        int trimmedLength = TextUtils.getTrimmedLength("") + 26;
                        byte[] bArr3 = $$d;
                        Object[] objArr37 = new Object[1];
                        g(bArr3[5], (short) (-bArr3[65]), (byte) (-bArr3[8]), objArr37);
                        objRemoteActionCompatParcelizer16 = startForeground.read(c2, iKeyCodeFromString, trimmedLength, -1033747278, false, (String) objArr37[0], null);
                    }
                    objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer16).get(null);
                } else {
                    Object[] objArr38 = new Object[1];
                    f((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 15, 15 - TextUtils.lastIndexOf("", '0'), new char[]{11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b'}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 97, true, objArr38);
                    Class<?> cls7 = Class.forName((String) objArr38[0]);
                    Object[] objArr39 = new Object[1];
                    f((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 15, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 4, new char[]{2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r'}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 211, false, objArr39);
                    try {
                        Object[] objArr40 = {Integer.valueOf(((Integer) cls7.getMethod((String) objArr39[0], Object.class).invoke(null, this)).intValue()), 0, -1530347093};
                        byte[] bArr4 = $$j;
                        Object[] objArr41 = new Object[1];
                        h((byte) (-bArr4[23]), bArr4[46], bArr4[16], objArr41);
                        Class<?> cls8 = Class.forName((String) objArr41[0]);
                        Object[] objArr42 = new Object[1];
                        h((byte) 37, bArr4[12], (byte) (-bArr4[26]), objArr42);
                        objArr = (Object[]) cls8.getMethod((String) objArr42[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr40);
                        Object objRemoteActionCompatParcelizer17 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                        if (objRemoteActionCompatParcelizer17 == null) {
                            char c3 = (char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13182);
                            int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1649;
                            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 26;
                            byte[] bArr5 = $$d;
                            Object[] objArr43 = new Object[1];
                            g(bArr5[5], (short) (-bArr5[65]), (byte) (-bArr5[8]), objArr43);
                            objRemoteActionCompatParcelizer17 = startForeground.read(c3, scrollBarFadeDuration2, doubleTapTimeout, -1033747278, false, (String) objArr43[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer17).set(null, objArr);
                        try {
                            Object[] objArr44 = new Object[1];
                            e(new char[]{0, 0, 0, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 109, new char[]{50640, 59652, 41621, 60611, 37341, 6210, 32518, 57516, 64152, 59424, 24540, 63413, 51013, 16211, 52609, 62620, 35927, 21479, 36094, 38075, 1898, 23188}, new char[]{9607, 19788, 65171, 2449}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 49), objArr44);
                            Class<?> cls9 = Class.forName((String) objArr44[0]);
                            Object[] objArr45 = new Object[1];
                            e(new char[]{0, 0, 0, 0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(3) + 1580264389, new char[]{50583, 18229, 41788, 28251, 5932, 783, 37688, 37807, 18263, 19703, 42752, 54526, 49770, 353, 18946}, new char[]{14518, 12524, 54366, 25834}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 60081), objArr45);
                            long jLongValue2 = ((Long) cls9.getDeclaredMethod((String) objArr45[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf3 = Long.valueOf(jLongValue2);
                            Object objRemoteActionCompatParcelizer18 = startForeground.RemoteActionCompatParcelizer(2104791916);
                            if (objRemoteActionCompatParcelizer18 == null) {
                                char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 13183);
                                int i21 = 1650 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                                int packedPositionChild = 25 - ExpandableListView.getPackedPositionChild(0L);
                                byte[] bArr6 = $$d;
                                byte b5 = bArr6[5];
                                Object[] objArr46 = new Object[1];
                                g(b5, (short) (b5 | TarConstants.LF_GNUTYPE_LONGLINK), (byte) (-bArr6[8]), objArr46);
                                objRemoteActionCompatParcelizer18 = startForeground.read(jumpTapTimeout, i21, packedPositionChild, 54351865, false, (String) objArr46[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer18).set(null, lValueOf3);
                            Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                            Object objRemoteActionCompatParcelizer19 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                            if (objRemoteActionCompatParcelizer19 == null) {
                                char jumpTapTimeout2 = (char) (13183 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                                int trimmedLength2 = TextUtils.getTrimmedLength("") + 1649;
                                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 26;
                                byte b6 = (byte) $$e;
                                short s2 = $$d[17];
                                Object[] objArr47 = new Object[1];
                                g(b6, s2, (byte) (s2 & 40), objArr47);
                                objRemoteActionCompatParcelizer19 = startForeground.read(jumpTapTimeout2, trimmedLength2, absoluteGravity, -133433128, false, (String) objArr47[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer19).set(null, lValueOf4);
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
                int i22 = ((int[]) objArr[3])[0];
                int i23 = ((int[]) objArr[2])[0];
                if (i23 != i22) {
                    long j5 = -1;
                    long j6 = 0;
                    long j7 = (((long) (i23 ^ i22)) & ((((long) 0) << 32) | (j5 - ((j5 >> 63) << 32)))) | (((long) 2) << 32) | (j6 - ((j6 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer20 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer20 == null) {
                        objRemoteActionCompatParcelizer20 = startForeground.read((char) (4536 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6054, 43 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke5 = ((Method) objRemoteActionCompatParcelizer20).invoke(null, null);
                    Object[] objArr48 = {-982505877, Long.valueOf(j7), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls10 = (Class) startForeground.IconCompatParcelizer((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 6031 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 23 - TextUtils.indexOf((CharSequence) "", '0', 0));
                    byte b7 = $$j[12];
                    Object[] objArr49 = new Object[1];
                    h(b7, (byte) (b7 | 32), (byte) ($$k & 58), objArr49);
                    cls10.getMethod((String) objArr49[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke5, objArr48);
                }
                Object objRemoteActionCompatParcelizer21 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                if (objRemoteActionCompatParcelizer21 == null) {
                    char minimumFlingVelocity = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int packedPositionChild2 = 942 - ExpandableListView.getPackedPositionChild(0L);
                    int iRed = 36 - Color.red(0);
                    byte[] bArr7 = $$d;
                    Object[] objArr50 = new Object[1];
                    g(bArr7[9], (short) TsExtractor.TS_STREAM_TYPE_E_AC3, bArr7[5], objArr50);
                    objRemoteActionCompatParcelizer21 = startForeground.read(minimumFlingVelocity, packedPositionChild2, iRed, -167186806, false, (String) objArr50[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer21).getLong(null) != -1) {
                    Object objRemoteActionCompatParcelizer22 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer22 == null) {
                        char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                        int i24 = 943 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        int i25 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 37;
                        Object[] objArr51 = new Object[1];
                        g((byte) $$e, (short) TsExtractor.TS_STREAM_TYPE_DTS, (byte) (-$$d[164]), objArr51);
                        objRemoteActionCompatParcelizer22 = startForeground.read(deadChar, i24, i25, -1398865628, false, (String) objArr51[0], null);
                    }
                    objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer22).get(null);
                } else {
                    Object[] objArr52 = new Object[1];
                    f((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 15, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 19, new char[]{11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b'}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 176, true, objArr52);
                    Class<?> cls11 = Class.forName((String) objArr52[0]);
                    Object[] objArr53 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 95, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 1, new char[]{2, 65501, '\t', 65534, 65535, 3, 65534, 65535, '\b', 14, 3, 14, 19, 65506, 65531, '\r'}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 180, false, objArr53);
                    Object[] objArr54 = {Integer.valueOf(((Integer) cls11.getMethod((String) objArr53[0], Object.class).invoke(null, this)).intValue()), 0, -1127787647};
                    Object objRemoteActionCompatParcelizer23 = startForeground.RemoteActionCompatParcelizer(-21191141);
                    if (objRemoteActionCompatParcelizer23 == null) {
                        char c4 = (char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                        int jumpTapTimeout3 = 943 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        int windowTouchSlop = 36 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        byte b8 = $$d[5];
                        Object[] objArr55 = new Object[1];
                        g(b8, (short) (b8 | 186), r5[103], objArr55);
                        objRemoteActionCompatParcelizer23 = startForeground.read(c4, jumpTapTimeout3, windowTouchSlop, -2131402098, false, (String) objArr55[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    objArr2 = (Object[]) ((Method) objRemoteActionCompatParcelizer23).invoke(null, objArr54);
                    Object objRemoteActionCompatParcelizer24 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer24 == null) {
                        char maximumFlingVelocity = (char) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        int iIndexOf = 943 - TextUtils.indexOf("", "");
                        int iNormalizeMetaState2 = KeyEvent.normalizeMetaState(0) + 36;
                        Object[] objArr56 = new Object[1];
                        g((byte) $$e, (short) TsExtractor.TS_STREAM_TYPE_DTS, (byte) (-$$d[164]), objArr56);
                        objRemoteActionCompatParcelizer24 = startForeground.read(maximumFlingVelocity, iIndexOf, iNormalizeMetaState2, -1398865628, false, (String) objArr56[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer24).set(null, objArr2);
                    try {
                        Object[] objArr57 = new Object[1];
                        e(new char[]{0, 0, 0, 0}, KeyEvent.keyCodeFromString(""), new char[]{50640, 59652, 41621, 60611, 37341, 6210, 32518, 57516, 64152, 59424, 24540, 63413, 51013, 16211, 52609, 62620, 35927, 21479, 36094, 38075, 1898, 23188}, new char[]{9607, 19788, 65171, 2449}, (char) Color.red(0), objArr57);
                        Class<?> cls12 = Class.forName((String) objArr57[0]);
                        Object[] objArr58 = new Object[1];
                        e(new char[]{0, 0, 0, 0}, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1580264504, new char[]{50583, 18229, 41788, 28251, 5932, 783, 37688, 37807, 18263, 19703, 42752, 54526, 49770, 353, 18946}, new char[]{14518, 12524, 54366, 25834}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) + 60079), objArr58);
                        long jLongValue3 = ((Long) cls12.getDeclaredMethod((String) objArr58[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf5 = Long.valueOf(jLongValue3);
                        Object objRemoteActionCompatParcelizer25 = startForeground.RemoteActionCompatParcelizer(-1539638354);
                        if (objRemoteActionCompatParcelizer25 == null) {
                            char windowTouchSlop2 = (char) (ViewConfiguration.getWindowTouchSlop() >> 8);
                            int defaultSize = View.getDefaultSize(0, 0) + 943;
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 36;
                            int i26 = $$e;
                            Object[] objArr59 = new Object[1];
                            g((byte) (i26 + 5), (short) (i26 | 96), (byte) (i26 << 1), objArr59);
                            objRemoteActionCompatParcelizer25 = startForeground.read(windowTouchSlop2, defaultSize, longPressTimeout, -629981381, false, (String) objArr59[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer25).set(null, lValueOf5);
                        Long lValueOf6 = Long.valueOf(jLongValue3 >> 12);
                        Object objRemoteActionCompatParcelizer26 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                        if (objRemoteActionCompatParcelizer26 == null) {
                            char scrollDefaultDelay2 = (char) (ViewConfiguration.getScrollDefaultDelay() >> 16);
                            int iAxisFromString = 942 - MotionEvent.axisFromString("");
                            int offsetBefore = 36 - TextUtils.getOffsetBefore("", 0);
                            byte[] bArr8 = $$d;
                            Object[] objArr60 = new Object[1];
                            g(bArr8[9], (short) TsExtractor.TS_STREAM_TYPE_E_AC3, bArr8[5], objArr60);
                            objRemoteActionCompatParcelizer26 = startForeground.read(scrollDefaultDelay2, iAxisFromString, offsetBefore, -167186806, false, (String) objArr60[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer26).set(null, lValueOf6);
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                }
                int i27 = ((int[]) objArr2[2])[0];
                int i28 = ((int[]) objArr2[0])[0];
                if (i28 != i27) {
                    long j8 = -1;
                    long j9 = 0;
                    long j10 = (((long) (i28 ^ i27)) & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32)))) | (((long) 1) << 32) | (j9 - ((j9 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer27 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer27 == null) {
                        objRemoteActionCompatParcelizer27 = startForeground.read((char) (MotionEvent.axisFromString("") + 4536), 6054 - Color.red(0), 42 - View.MeasureSpec.makeMeasureSpec(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke6 = ((Method) objRemoteActionCompatParcelizer27).invoke(null, null);
                    Object[] objArr61 = {-982505877, Long.valueOf(j10), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls13 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getScrollBarSize() >> 8), 6030 - (ViewConfiguration.getScrollBarSize() >> 8), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24);
                    byte b9 = $$j[12];
                    Object[] objArr62 = new Object[1];
                    h(b9, (byte) (b9 | 32), (byte) ($$k & 58), objArr62);
                    cls13.getMethod((String) objArr62[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke6, objArr61);
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
        AudioAttributesImplApi21Parcelizer = 1;
        AudioAttributesImplBaseParcelizer();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplBaseParcelizer + 89;
        AudioAttributesImplApi21Parcelizer = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.StreetViewPanoramaLink, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 19;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 15;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    static void AudioAttributesImplBaseParcelizer() {
        read = -3498762522182953692L;
        AudioAttributesCompatParcelizer = -136981212;
        write = (char) 11979;
        AudioAttributesImplApi26Parcelizer = 1000326218;
    }
}
