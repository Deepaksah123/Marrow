package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.text.TextUtils;
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
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bR\u0016\u0010\f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/SafeParcelReaderParseException;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Lo/parseSegmentTimeline;", "RemoteActionCompatParcelizer", "Lo/parseSegmentTimeline;", "IconCompatParcelizer", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SafeParcelReaderParseException extends validateObjectHeader {
    private static long IconCompatParcelizer;
    private static int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private parseSegmentTimeline IconCompatParcelizer;
    private static final byte[] $$l = {45, 96, -22, -65};
    private static final int $$m = 89;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {3, -109, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -57, -64, 70, -13, 16, -42, 37, -11, 7, -1, -16, 22, 12, -7, -6, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 13, -1, -62, 58, 9, 1, -7, 6, -6, -54, TarConstants.LF_BLK, 14, -9, 15, -2, -5, -4, -53, 64, -11, 20, -14, 14, -8, -7, 12, -61, 71, -18, 2, 18, -68, 39, 14, 2, -21, 22, 25, -9, 7, 0, -79, 79, -12, -3, 4, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$k = 254;
    private static final byte[] $$d = {79, -100, -79, 21, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 71;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;
    private static int AudioAttributesCompatParcelizer = 0;

    private static String $$n(byte b, short s, int i) {
        byte[] bArr = $$l;
        int i2 = 3 - (s * 2);
        int i3 = 104 - (b * 2);
        int i4 = i * 4;
        byte[] bArr2 = new byte[i4 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = i4 + i2;
            i2 = i2;
            i5 = -1;
        }
        while (true) {
            int i6 = i2 + 1;
            int i7 = i5 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i4) {
                return new String(bArr2, 0);
            }
            i3 += bArr[i6];
            i2 = i6;
            i5 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r7 = r7 + 65
            byte[] r0 = kotlin.SafeParcelReaderParseException.$$d
            int r6 = 44 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L11
            r4 = r6
            r7 = r8
            r3 = r2
            goto L28
        L11:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L15:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r7 = r7 + 1
            r4 = r0[r7]
        L28:
            int r4 = -r4
            int r8 = r8 + r4
            int r8 = r8 + (-1)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SafeParcelReaderParseException.g(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = 91 - r6
            byte[] r0 = kotlin.SafeParcelReaderParseException.$$j
            int r1 = r5 + 15
            int r7 = 111 - r7
            byte[] r1 = new byte[r1]
            int r5 = r5 + 14
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r3 = r2
            r7 = r5
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L21
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L21:
            r4 = r0[r6]
            int r3 = r3 + 1
        L25:
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SafeParcelReaderParseException.h(int, int, int, java.lang.Object[]):void");
    }

    /* JADX INFO: renamed from: o.SafeParcelReaderParseException$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/SafeParcelReaderParseException$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Landroid/content/Intent;", "read", "(Landroid/content/Context;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent read(Context p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new Intent(p0, (Class<?>) SafeParcelReaderParseException.class);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(IconCompatParcelizer ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        int i3 = $11 + 7;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i5 = $10 + 89;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i7 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(IconCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 12423 - ((byte) KeyEvent.getModifierMetaStateMask()), 20 - View.getDefaultSize(0, 0), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) View.resolveSize(0, 0), (-16775348) - Color.rgb(0, 0, 0), 9 - TextUtils.lastIndexOf("", '0', 0, 0), 1983509525, false, $$n(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i8 = $10 + 45;
                $11 = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
    }

    private static void e(boolean z, int i, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i3];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i3) {
            int i5 = $10 + 47;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i2 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i7 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(write)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) View.MeasureSpec.getMode(0), (-16753512) - Color.rgb(0, 0, 0), 32 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (44861 - ImageFormat.getBitsPerPixel(0)), TextUtils.indexOf("", "", 0, 0) + 18944, 29 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                    int i8 = $11 + 17;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        if (i > 0) {
            int i10 = $10 + 13;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            cleardownloadmanagerhelpers.write = i;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i3 - cleardownloadmanagerhelpers.write);
        }
        if (z) {
            char[] cArr4 = new char[i3];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i3) {
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i3 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                try {
                    Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 44862), TextUtils.lastIndexOf("", '0', 0) + 18945, 28 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x018d  */
    @Override // kotlin.validateObjectHeader, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2647
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SafeParcelReaderParseException.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // kotlin.validateObjectHeader, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 426
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SafeParcelReaderParseException.onResume():void");
    }

    @Override // kotlin.validateObjectHeader, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = AudioAttributesImplBaseParcelizer + 107;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            f((ViewConfiguration.getScrollBarSize() >> 8) + 1, new char[]{28931, 29026, 17189, 3880, 54266, 11822, 3126, 48727, 13224, 230, 19052, 19118, 62698, 50611, 34996, 35298, 47374, 35684, 51188, 50273, 31333, 18514, 552, 781, 15491, 3351, 16746, 16853, 57850, 62167}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(true, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6, new char[]{'\n', 4, 65531, '\b', '\b', 11, 65529, 4, 5, 65535, '\n', 65527, 65529, 65535, 2, 6, 6, 65495}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) + 141, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) - 31, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i4 = AudioAttributesImplApi21Parcelizer + 101;
                AudioAttributesImplBaseParcelizer = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (baseContext != null) {
            int i6 = AudioAttributesImplApi21Parcelizer + 81;
            AudioAttributesImplBaseParcelizer = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (Color.rgb(0, 0, 0) + 16781751), 6053 - ImageFormat.getBitsPerPixel(0), (ViewConfiguration.getScrollBarSize() >> 8) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), (ViewConfiguration.getTapTimeout() >> 16) + 6030, (ViewConfiguration.getWindowTouchSlop() >> 8) + 24, -861814097, false, "read", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i8 = AudioAttributesImplBaseParcelizer + 83;
                AudioAttributesImplApi21Parcelizer = i8 % 128;
                int i9 = i8 % 2;
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

    /* JADX WARN: Can't wrap try/catch for region: R(34:(29:31|286|32|(2:34|(3:36|(2:38|43)|42)(3:39|(2:41|43)|42))(1:43)|79|279|80|(1:82)|83|(3:85|(1:87)|88)(19:89|90|271|91|(1:93)|94|95|287|96|(1:98)|99|100|101|(1:103)|104|(1:106)|107|(1:109)|110)|111|(4:114|(3:296|116|(14:295|118|121|(3:123|(3:126|127|124)|302)|128|280|129|(1:131)|132|133|134|273|135|300)(1:301))(3:294|119|(13:297|121|(0)|128|280|129|(0)|132|133|134|273|135|300)(1:299))|298|112)|293|170|(1:172)|173|(2:175|(3:177|(1:179)|180)(3:181|(1:183)|184))(13:186|277|187|188|(1:190)|191|284|192|193|(1:195)|196|(1:198)|199)|185|200|(6:202|203|(1:205)|206|207|208)|209|(1:211)|212|(3:214|(1:216)|217)(14:219|220|(1:222)|223|224|(1:226)|227|291|228|229|(1:231)|232|(1:234)|235)|218|236|(6:238|239|(1:241)|242|243|244)|245|(2:247|248)(1:303))|282|48|(1:50)|51|275|52|(1:54)|55|79|279|80|(0)|83|(0)(0)|111|(1:112)|293|170|(0)|173|(0)(0)|185|200|(0)|209|(0)|212|(0)(0)|218|236|(0)|245|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0aef, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0af0, code lost:
    
        r6 = new java.lang.Object[1];
        f(((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod("currentApplication", new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_track_resolution).substring(0, 4).length() - 3, new char[]{39540, 39488, 18700, 33130, 55695, 41009, 23426, 59813, 55433, 2764, 50208, 7488, 8133, 53120, 1771}, r6);
        r2 = (java.lang.String) r6[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x0b2d, code lost:
    
        r4 = new java.io.ByteArrayOutputStream();
        r5 = new java.io.PrintStream(r4);
        r0.printStackTrace(r5);
        r5.close();
        r1 = r4.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0b44, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0b48, code lost:
    
        r4 = new java.util.ArrayList(2);
        r4.add(r1);
        r4.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0b57, code lost:
    
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0b5b, code lost:
    
        if (r1 == null) goto L166;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0b5d, code lost:
    
        r1 = kotlin.startForeground.read((char) (4535 - (android.widget.ExpandableListView.getPackedPositionForGroup(0) > 0 ? 1 : (android.widget.ExpandableListView.getPackedPositionForGroup(0) == 0 ? 0 : -1))), (android.view.ViewConfiguration.getScrollBarFadeDuration() >> 16) + 6054, 42 - ((android.os.Process.getThreadPriority(0) + 20) >> 6), -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0b8e, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x0b9a, code lost:
    
        r6 = new java.lang.Object[]{228241709, 81604378625L, r4, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r2 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) (android.os.Process.myPid() >> 22), 6030 - (android.view.ViewConfiguration.getMinimumFlingVelocity() >> 16), android.view.View.MeasureSpec.makeMeasureSpec(0, 0) + 24);
        r12 = new java.lang.Object[1];
        h(kotlin.SafeParcelReaderParseException.$$j[45], (byte) 73, (byte) 29, r12);
        r2.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:114:0x098d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x09d2  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0a19 A[Catch: all -> 0x0ad1, TryCatch #7 {all -> 0x0ad1, blocks: (B:129:0x0a13, B:131:0x0a19, B:132:0x0a46), top: B:280:0x0a13, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0c1d  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0c6d  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0d2d  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0fc2  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x10a1  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x10f0  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x114d  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x1449  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x151e  */
    /* JADX WARN: Removed duplicated region for block: B:303:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x05d9 A[Catch: all -> 0x0aef, TryCatch #6 {all -> 0x0aef, blocks: (B:80:0x05d3, B:82:0x05d9, B:83:0x0620, B:85:0x062d, B:87:0x0636, B:88:0x067a, B:111:0x0983, B:112:0x0987, B:116:0x0999, B:121:0x09c6, B:124:0x09e3, B:126:0x09e6, B:133:0x0a4d, B:139:0x0ac9, B:141:0x0acf, B:142:0x0ad0, B:144:0x0ad2, B:146:0x0ad9, B:147:0x0ada, B:119:0x09b0, B:89:0x0685, B:101:0x0816, B:103:0x081c, B:104:0x0862, B:106:0x08e0, B:107:0x091d, B:109:0x0933, B:110:0x097d, B:149:0x0adc, B:151:0x0ae3, B:152:0x0ae4, B:154:0x0ae6, B:156:0x0aed, B:157:0x0aee, B:91:0x0747, B:93:0x075b, B:94:0x078b, B:135:0x0a52, B:129:0x0a13, B:131:0x0a19, B:132:0x0a46, B:96:0x0792, B:98:0x07a6, B:99:0x080a), top: B:279:0x05d3, outer: #10, inners: #2, #3, #7, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x062d A[Catch: all -> 0x0aef, TryCatch #6 {all -> 0x0aef, blocks: (B:80:0x05d3, B:82:0x05d9, B:83:0x0620, B:85:0x062d, B:87:0x0636, B:88:0x067a, B:111:0x0983, B:112:0x0987, B:116:0x0999, B:121:0x09c6, B:124:0x09e3, B:126:0x09e6, B:133:0x0a4d, B:139:0x0ac9, B:141:0x0acf, B:142:0x0ad0, B:144:0x0ad2, B:146:0x0ad9, B:147:0x0ada, B:119:0x09b0, B:89:0x0685, B:101:0x0816, B:103:0x081c, B:104:0x0862, B:106:0x08e0, B:107:0x091d, B:109:0x0933, B:110:0x097d, B:149:0x0adc, B:151:0x0ae3, B:152:0x0ae4, B:154:0x0ae6, B:156:0x0aed, B:157:0x0aee, B:91:0x0747, B:93:0x075b, B:94:0x078b, B:135:0x0a52, B:129:0x0a13, B:131:0x0a19, B:132:0x0a46, B:96:0x0792, B:98:0x07a6, B:99:0x080a), top: B:279:0x05d3, outer: #10, inners: #2, #3, #7, #11 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0685 A[Catch: all -> 0x0aef, TRY_LEAVE, TryCatch #6 {all -> 0x0aef, blocks: (B:80:0x05d3, B:82:0x05d9, B:83:0x0620, B:85:0x062d, B:87:0x0636, B:88:0x067a, B:111:0x0983, B:112:0x0987, B:116:0x0999, B:121:0x09c6, B:124:0x09e3, B:126:0x09e6, B:133:0x0a4d, B:139:0x0ac9, B:141:0x0acf, B:142:0x0ad0, B:144:0x0ad2, B:146:0x0ad9, B:147:0x0ada, B:119:0x09b0, B:89:0x0685, B:101:0x0816, B:103:0x081c, B:104:0x0862, B:106:0x08e0, B:107:0x091d, B:109:0x0933, B:110:0x097d, B:149:0x0adc, B:151:0x0ae3, B:152:0x0ae4, B:154:0x0ae6, B:156:0x0aed, B:157:0x0aee, B:91:0x0747, B:93:0x075b, B:94:0x078b, B:135:0x0a52, B:129:0x0a13, B:131:0x0a19, B:132:0x0a46, B:96:0x0792, B:98:0x07a6, B:99:0x080a), top: B:279:0x05d3, outer: #10, inners: #2, #3, #7, #11 }] */
    @Override // kotlin.validateObjectHeader, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6141
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SafeParcelReaderParseException.attachBaseContext(android.content.Context):void");
    }

    static {
        MediaBrowserCompatItemReceiver = 1;
        AudioAttributesImplBaseParcelizer();
        INSTANCE = new Companion(null);
        int i = AudioAttributesCompatParcelizer + 15;
        MediaBrowserCompatItemReceiver = i % 128;
        if (i % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.validateObjectHeader, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 17;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = AudioAttributesImplBaseParcelizer + 117;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    static void AudioAttributesImplBaseParcelizer() {
        write = 1000326317;
        IconCompatParcelizer = -2583781875541096918L;
    }
}
