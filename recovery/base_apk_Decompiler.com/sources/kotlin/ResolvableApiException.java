package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
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

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/ResolvableApiException;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ResolvableApiException extends immediatePendingResult {
    private static char[] AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int RemoteActionCompatParcelizer;
    private static long write;
    private static final byte[] $$l = {16, 77, -78, 14};
    private static final int $$m = 29;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {85, -29, -43, -21, 9, -5, -66, TarConstants.LF_FIFO, 5, -3, -11, 2, -10, -58, TarConstants.LF_NORMAL, 10, -13, 11, -6, -9, -8, -57, TarConstants.LF_FIFO, 3, 3, -72, TarConstants.LF_SYMLINK, 9, -5, -3, -1, -4, -67, 68, -4, -14, 0, -65, 73, -3, -28, -16, -7, 0, 16, 5, -1, 2, -18, -39, 31, 14, -14, 3, -4, -46, 41, -5, 0, -18, 16, -39, 14, 14, -18, -1, 4, -6, 14, -24, 10, -68, 34, 30, -22, 16, -2, -5, -49, TarConstants.LF_NORMAL, -24, -1, 8, 1, -14, 3, -4, -36, 17, 12, -3, -14, 10};
    private static final int $$k = 10;
    private static final byte[] $$d = {24, -109, -85, -94, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 123;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static int read = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(short r6, byte r7, short r8) {
        /*
            int r7 = r7 * 2
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r8 = r8 + 104
            int r6 = r6 * 4
            int r6 = r6 + 1
            byte[] r0 = kotlin.ResolvableApiException.$$l
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ResolvableApiException.$$n(short, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.ResolvableApiException.$$d
            int r6 = r6 + 4
            int r8 = r8 + 65
            int r1 = 44 - r7
            byte[] r1 = new byte[r1]
            int r7 = 43 - r7
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L2c
        L12:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L16:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r8 = r8 + 1
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2c:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-1)
            r8 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ResolvableApiException.g(short, int, short, java.lang.Object[]):void");
    }

    private static void h(int i, byte b, int i2, Object[] objArr) {
        int i3 = i + 82;
        byte[] bArr = $$j;
        int i4 = 70 - i2;
        byte[] bArr2 = new byte[b + 4];
        int i5 = b + 3;
        int i6 = -1;
        if (bArr == null) {
            int i7 = i4 + i5 + 3;
            i4 = i4;
            i3 = i7;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            int i8 = i4 + 1;
            if (i6 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4 = i8;
            i3 = i3 + bArr[i8] + 3;
        }
    }

    /* JADX INFO: renamed from: o.ResolvableApiException$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/ResolvableApiException$IconCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/canceledPendingResult;", "p1", "Landroid/content/Intent;", "read", "(Landroid/content/Context;Lo/canceledPendingResult;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent read(Context p0, canceledPendingResult p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) ResolvableApiException.class);
            p1.IconCompatParcelizer(intent);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(write ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $10 + 61;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(write)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.indexOf("", ""), 12423 - Process.getGidForName(""), 20 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0) + 1), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1868, 10 - TextUtils.getOffsetAfter("", 0), 1983509525, false, $$n(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i6 = $11 + 1;
                $10 = i6 % 128;
                if (i6 % 2 != 0) {
                    int i7 = 4 % 2;
                }
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

    private static void e(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        char[] cArr;
        char c;
        int i = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = AudioAttributesCompatParcelizer;
        char c2 = '0';
        if (cArr2 != null) {
            int i6 = $11 + 49;
            int i7 = i6 % 128;
            $10 = i7;
            int i8 = i6 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i9 = i7 + 23;
            $11 = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 4 % 3;
            }
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i11])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((Process.getThreadPriority(0) + 20) >> 6), View.MeasureSpec.getSize(0) + 11613, TextUtils.indexOf("", c2, 0, 0) + 21, -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr3[i11] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i11++;
                    c2 = '0';
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
        char[] cArr4 = new char[i3];
        System.arraycopy(cArr2, i2, cArr4, 0, i3);
        if (bArr != null) {
            int i12 = $10 + 43;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                cArr = new char[i3];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 1;
                c = 1;
            } else {
                cArr = new char[i3];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                c = 0;
            }
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                int i13 = $10 + 87;
                $11 = i13 % 128;
                if (i13 % 2 != 0 ? bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] != 1 : bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] != 0) {
                    int i14 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (31588 - ExpandableListView.getPackedPositionChild(0L)), 9863 - KeyEvent.keyCodeFromString(""), 65 - KeyEvent.keyCodeFromString(""), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i14] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i15 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (Process.myPid() >> 22), TextUtils.lastIndexOf("", '0') + 22960, 42 - Process.getGidForName(""), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i15] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c = cArr[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (((Process.getThreadPriority(0) + 20) >> 6) + 37822), 9754 - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 28, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr4, 0, cArr5, 0, i3);
            int i16 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr4, i16, i5);
            System.arraycopy(cArr5, i5, cArr4, 0, i16);
        }
        if (!(!z)) {
            char[] cArr6 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr4[(i3 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr4 = cArr6;
        }
        if (i4 > 0) {
            int i17 = $11 + 53;
            $10 = i17 % 128;
            char c3 = 2;
            int i18 = i17 % 2;
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[c3]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                c3 = 2;
            }
        }
        String str = new String(cArr4);
        int i19 = $11 + 43;
        $10 = i19 % 128;
        int i20 = i19 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0075  */
    @Override // kotlin.immediatePendingResult, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2087
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ResolvableApiException.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00aa  */
    @Override // kotlin.immediatePendingResult, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 367
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ResolvableApiException.onResume():void");
    }

    @Override // kotlin.immediatePendingResult, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 37;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            e(new byte[]{1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1}, new int[]{23, 26, 0, 13}, true, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, new int[]{49, 18, 0, 0}, true, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i4 = MediaBrowserCompatCustomActionResultReceiver + 69;
                AudioAttributesImplApi26Parcelizer = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - KeyEvent.keyCodeFromString("")), 6055 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 42 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 6030 - KeyEvent.normalizeMetaState(0), View.MeasureSpec.makeMeasureSpec(0, 0) + 24, -861814097, false, "read", new Class[]{Context.class});
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

    @Override // kotlin.immediatePendingResult, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        String strValueOf;
        Object[] objArr;
        Object[] objArr2;
        String strValueOf2;
        List<Object[]> list;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object[] objArr3 = new Object[1];
        e(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0}, new int[]{0, 18, 0, 0}, false, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        e(new byte[]{1, 1, 0, 0, 0}, new int[]{18, 5, 177, 0}, true, objArr4);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context applicationContext = context != null ? ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext() : context;
            if (applicationContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4536 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 6053 - Process.getGidForName(""), 42 - KeyEvent.normalizeMetaState(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    e(new byte[]{1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1}, new int[]{67, 48, 0, 0}, false, objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    e(new byte[]{1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1}, new int[]{115, 64, 0, 0}, true, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    e(new byte[]{0, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1}, new int[]{179, 64, 0, 33}, false, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    e(new byte[]{1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1}, new int[]{243, 67, 0, 55}, false, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) - 49, new char[]{32651, 32690, 52428, 52500, 22115, 36689, 30845, 50408, 21950, 35463}, objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(0) - 37, new char[]{35437, 35423, 31898, 32093, 18814, 63845, 36227, 29857, 16645, 19184, 64688, 61755, 34288, 27843, 22794, 59674, 40323, 25614, 20912, 57836, 38201, 23612, 27025, 55755, 44343, 21569, 25060, 53639, 42267, 19564, 30829, 51312, 48306, 17894, 28743, 49180, 46236, 15754, 2154, 47140}, objArr10);
                    Object[] objArr11 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr10[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 6030 - KeyEvent.keyCodeFromString(""), Color.green(0) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
                    char c = (char) (61148 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                    int modifierMetaStateMask = 2144 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int iIndexOf = TextUtils.indexOf("", "") + 12;
                    short s = (short) 108;
                    Object[] objArr12 = new Object[1];
                    g(s, (byte) (s & 186), (byte) (-$$d[9]), objArr12);
                    objRemoteActionCompatParcelizer3 = startForeground.read(c, modifierMetaStateMask, iIndexOf, -2136739198, false, (String) objArr12[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-629126231);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 61148);
                        int mode = 2145 - View.MeasureSpec.getMode(0);
                        int capsMode = 12 - TextUtils.getCapsMode("", 0, 0);
                        byte[] bArr = $$d;
                        Object[] objArr13 = new Object[1];
                        g((short) 111, bArr[19], bArr[113], objArr13);
                        objRemoteActionCompatParcelizer4 = startForeground.read(packedPositionGroup, mode, capsMode, -1530294468, false, (String) objArr13[0], null);
                    }
                    list = (List) ((Field) objRemoteActionCompatParcelizer4).get(null);
                } else {
                    Object[] objArr14 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, new char[]{16882, 16792, 18306, 17941, 38674, 54524, 17924, 20407, 40749, 38024, 53631, 56491, 20005, 22429, 34631, 50324, 22025, 24351, 36761, 52344}, objArr14);
                    Class<?> cls2 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) - 49, new char[]{31822, 31783, 47549, 47151, 33268, 34131, 31714, 45448, 35277, 33405, 32991, 36124, 29622, 43496, 37266, 38181, 27525, 41278, 39277, 40400}, objArr15);
                    int iIntValue2 = ((Integer) cls2.getMethod((String) objArr15[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr16 = {1160603143};
                        Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-173351824);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            objRemoteActionCompatParcelizer5 = startForeground.read((char) (45845 - View.MeasureSpec.makeMeasureSpec(0, 0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 913, 10 - (ViewConfiguration.getScrollBarSize() >> 8), -1948051227, false, null, new Class[]{Integer.TYPE});
                        }
                        try {
                            Object[] objArr17 = {Integer.valueOf(iIntValue2), ((Constructor) objRemoteActionCompatParcelizer5).newInstance(objArr16)};
                            Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1891595430);
                            if (objRemoteActionCompatParcelizer6 == null) {
                                char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 61148);
                                int iRgb = (-16775071) - Color.rgb(0, 0, 0);
                                int modifierMetaStateMask2 = ((byte) KeyEvent.getModifierMetaStateMask()) + 13;
                                byte[] bArr2 = $$d;
                                Object[] objArr18 = new Object[1];
                                g((short) 140, bArr2[0], bArr2[37], objArr18);
                                objRemoteActionCompatParcelizer6 = startForeground.read(touchSlop, iRgb, modifierMetaStateMask2, 251047987, false, (String) objArr18[0], new Class[]{Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf("", "") + 557, (ViewConfiguration.getLongPressTimeout() >> 16) + 18)});
                            }
                            list = (List) ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr17);
                            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-629126231);
                            if (objRemoteActionCompatParcelizer7 == null) {
                                char cResolveSize = (char) (61148 - View.resolveSize(0, 0));
                                int iKeyCodeFromString = 2145 - KeyEvent.keyCodeFromString("");
                                int maximumDrawingCacheSize = 12 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                byte[] bArr3 = $$d;
                                Object[] objArr19 = new Object[1];
                                g((short) 111, bArr3[19], bArr3[113], objArr19);
                                objRemoteActionCompatParcelizer7 = startForeground.read(cResolveSize, iKeyCodeFromString, maximumDrawingCacheSize, -1530294468, false, (String) objArr19[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer7).set(null, list);
                            Object[] objArr20 = new Object[1];
                            e(null, new int[]{310, 22, 117, 12}, true, objArr20);
                            Class<?> cls3 = Class.forName((String) objArr20[0]);
                            Object[] objArr21 = new Object[1];
                            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 109, new char[]{60702, 60795, 43018, 43408, 5766, 38481, 60085, 41019, 7851, 5387, 37827, 40491, 58059, 47191, 1787, 34341, 64255, 45187, 3610}, objArr21);
                            long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr21[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue);
                            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(301834150);
                            if (objRemoteActionCompatParcelizer8 == null) {
                                char c2 = (char) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 61148);
                                int iAxisFromString = 2144 - MotionEvent.axisFromString("");
                                int iLastIndexOf = 11 - TextUtils.lastIndexOf("", '0', 0, 0);
                                byte b = $$d[45];
                                Object[] objArr22 = new Object[1];
                                g((short) 159, b, (byte) (b + 1), objArr22);
                                objRemoteActionCompatParcelizer8 = startForeground.read(c2, iAxisFromString, iLastIndexOf, 1874090803, false, (String) objArr22[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer8).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                            Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(-18205161);
                            if (objRemoteActionCompatParcelizer9 == null) {
                                char cLastIndexOf = (char) (61147 - TextUtils.lastIndexOf("", '0', 0));
                                int i2 = 2145 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                int i3 = 12 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                                short s2 = (short) 108;
                                Object[] objArr23 = new Object[1];
                                g(s2, (byte) (s2 & 186), (byte) (-$$d[9]), objArr23);
                                objRemoteActionCompatParcelizer9 = startForeground.read(cLastIndexOf, i2, i3, -2136739198, false, (String) objArr23[0], null);
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
                int i4 = AudioAttributesImplApi26Parcelizer + 41;
                MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
                int i5 = i4 % 2;
                for (Object[] objArr24 : list) {
                    int i6 = ((int[]) objArr24[3])[0];
                    int i7 = ((int[]) objArr24[1])[0];
                    if (i7 != i6) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr24[2];
                        if (strArr != null) {
                            for (String str6 : strArr) {
                                int i8 = AudioAttributesImplApi26Parcelizer + 107;
                                MediaBrowserCompatCustomActionResultReceiver = i8 % 128;
                                int i9 = i8 % 2;
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
                                objRemoteActionCompatParcelizer10 = startForeground.read((char) (Drawable.resolveOpacity(0, 0) + 4535), KeyEvent.keyCodeFromString("") + 6054, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
                            }
                            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer10).invoke(null, null);
                            try {
                                Object[] objArr25 = {1160603143, Long.valueOf(j4), arrayList, TrainingApplication.RemoteActionCompatParcelizer(), false};
                                Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6029, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 25);
                                byte[] bArr4 = $$j;
                                byte b2 = bArr4[36];
                                byte b3 = (byte) (-bArr4[69]);
                                Object[] objArr26 = new Object[1];
                                h(b2, b3, (byte) (b3 + 3), objArr26);
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
            } catch (Throwable th6) {
                Throwable cause6 = th6.getCause();
                if (cause6 == null) {
                    throw th6;
                }
                throw cause6;
            }
        } catch (Throwable th7) {
            Object[] objArr27 = new Object[1];
            f(Color.red(0), new char[]{22754, 22742, 6700, 7144, 47218, 35929, 24323, 4624, 45140, 48039, 35215, 33799, 22379, 2680, 43019}, objArr27);
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
                objRemoteActionCompatParcelizer11 = startForeground.read((char) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 4535), TextUtils.indexOf("", "", 0, 0) + 6054, 42 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke3 = ((Method) objRemoteActionCompatParcelizer11).invoke(null, null);
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i10 = AudioAttributesImplApi26Parcelizer + 17;
            MediaBrowserCompatCustomActionResultReceiver = i10 % 128;
            int i11 = i10 % 2;
            Object[] objArr28 = {1160603143, 81604378625L, arrayList2, strRemoteActionCompatParcelizer, false};
            Class cls5 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 6030 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Process.getGidForName("") + 25);
            byte[] bArr5 = $$j;
            byte b4 = bArr5[36];
            byte b5 = (byte) (-bArr5[69]);
            Object[] objArr29 = new Object[1];
            h(b4, b5, (byte) (b5 + 3), objArr29);
            cls5.getMethod((String) objArr29[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke3, objArr28);
        }
        Context applicationContext2 = context;
        if (applicationContext2 != null) {
            int i12 = MediaBrowserCompatCustomActionResultReceiver + 93;
            AudioAttributesImplApi26Parcelizer = i12 % 128;
            int i13 = i12 % 2;
            try {
                applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : context.getApplicationContext();
            } catch (Throwable th8) {
                Object[] objArr30 = new Object[1];
                f(AndroidCharacter.getMirror('0') - '0', new char[]{13194, 13234, 49095, 48640, 58864, 57644, 13414, 47101, 60889, 58922, 58622, 59772, 15372, 44948, 62850}, objArr30);
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
                    objRemoteActionCompatParcelizer12 = startForeground.read((char) (4535 - (ViewConfiguration.getFadingEdgeLength() >> 16)), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6053, (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke4 = ((Method) objRemoteActionCompatParcelizer12).invoke(null, null);
                Object[] objArr31 = {1160603143, 81604378625L, arrayList3, TrainingApplication.RemoteActionCompatParcelizer(), false};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), KeyEvent.normalizeMetaState(0) + 6030, 24 - View.getDefaultSize(0, 0));
                byte[] bArr6 = $$j;
                byte b6 = bArr6[36];
                byte b7 = (byte) (-bArr6[69]);
                Object[] objArr32 = new Object[1];
                h(b6, b7, (byte) (b7 + 3), objArr32);
                cls6.getMethod((String) objArr32[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke4, objArr31);
            }
        }
        try {
            Object[] objArr33 = {1160603143};
            Object objRemoteActionCompatParcelizer13 = startForeground.RemoteActionCompatParcelizer(-1128409246);
            if (objRemoteActionCompatParcelizer13 == null) {
                objRemoteActionCompatParcelizer13 = startForeground.read((char) View.MeasureSpec.makeMeasureSpec(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 1992, 11 - TextUtils.lastIndexOf("", '0', 0), -1024191497, false, null, new Class[]{Integer.TYPE});
            }
            try {
                Object[] objArr34 = {applicationContext2, ((Constructor) objRemoteActionCompatParcelizer13).newInstance(objArr33)};
                Object objRemoteActionCompatParcelizer14 = startForeground.RemoteActionCompatParcelizer(352975618);
                if (objRemoteActionCompatParcelizer14 == null) {
                    char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 19323);
                    int iArgb = 2759 - Color.argb(0, 0, 0, 0);
                    int iResolveSizeAndState = 99 - View.resolveSizeAndState(0, 0, 0);
                    byte b8 = $$d[45];
                    Object[] objArr35 = new Object[1];
                    g((short) 159, b8, (byte) (b8 + 1), objArr35);
                    objRemoteActionCompatParcelizer14 = startForeground.read(keyRepeatDelay, iArgb, iResolveSizeAndState, 1799372695, false, (String) objArr35[0], new Class[]{Context.class, (Class) startForeground.IconCompatParcelizer((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 9581), 3446 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 144 - (ViewConfiguration.getMaximumFlingVelocity() >> 16))});
                }
                ((Method) objRemoteActionCompatParcelizer14).invoke(null, objArr34);
                Object objRemoteActionCompatParcelizer15 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                if (objRemoteActionCompatParcelizer15 == null) {
                    char keyRepeatTimeout = (char) (13183 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int touchSlop2 = (ViewConfiguration.getTouchSlop() >> 8) + 1649;
                    int iIndexOf2 = 25 - TextUtils.indexOf((CharSequence) "", '0');
                    byte[] bArr7 = $$d;
                    Object[] objArr36 = new Object[1];
                    g(bArr7[53], bArr7[5], bArr7[113], objArr36);
                    objRemoteActionCompatParcelizer15 = startForeground.read(keyRepeatTimeout, touchSlop2, iIndexOf2, -133433128, false, (String) objArr36[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer15).getLong(null) != -1) {
                    Object objRemoteActionCompatParcelizer16 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                    if (objRemoteActionCompatParcelizer16 == null) {
                        char c3 = (char) (13184 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        int i14 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1649;
                        int i15 = 26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        byte[] bArr8 = $$d;
                        Object[] objArr37 = new Object[1];
                        g(bArr8[65], bArr8[30], bArr8[5], objArr37);
                        objRemoteActionCompatParcelizer16 = startForeground.read(c3, i14, i15, -1033747278, false, (String) objArr37[0], null);
                    }
                    objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer16).get(null);
                } else {
                    Object[] objArr38 = new Object[1];
                    f(1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), new char[]{16882, 16792, 18306, 17941, 38674, 54524, 17924, 20407, 40749, 38024, 53631, 56491, 20005, 22429, 34631, 50324, 22025, 24351, 36761, 52344}, objArr38);
                    Class<?> cls7 = Class.forName((String) objArr38[0]);
                    Object[] objArr39 = new Object[1];
                    f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(3) - 115, new char[]{31822, 31783, 47549, 47151, 33268, 34131, 31714, 45448, 35277, 33405, 32991, 36124, 29622, 43496, 37266, 38181, 27525, 41278, 39277, 40400}, objArr39);
                    int iIntValue3 = ((Integer) cls7.getMethod((String) objArr39[0], Object.class).invoke(null, this)).intValue();
                    int i16 = AudioAttributesImplApi26Parcelizer + 27;
                    MediaBrowserCompatCustomActionResultReceiver = i16 % 128;
                    int i17 = i16 % 2;
                    try {
                        Object[] objArr40 = {Integer.valueOf(iIntValue3), 0, 1045264835};
                        byte[] bArr9 = $$j;
                        Object[] objArr41 = new Object[1];
                        h((byte) (-bArr9[1]), (byte) 19, bArr9[36], objArr41);
                        Class<?> cls8 = Class.forName((String) objArr41[0]);
                        byte b9 = bArr9[36];
                        byte b10 = (byte) (-bArr9[69]);
                        Object[] objArr42 = new Object[1];
                        h(b9, b10, (byte) (b10 + 3), objArr42);
                        objArr = (Object[]) cls8.getMethod((String) objArr42[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr40);
                        Object objRemoteActionCompatParcelizer17 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                        if (objRemoteActionCompatParcelizer17 == null) {
                            char capsMode2 = (char) (TextUtils.getCapsMode("", 0, 0) + 13183);
                            int i18 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1648;
                            int iIndexOf3 = TextUtils.indexOf("", "", 0) + 26;
                            byte[] bArr10 = $$d;
                            Object[] objArr43 = new Object[1];
                            g(bArr10[65], bArr10[30], bArr10[5], objArr43);
                            objRemoteActionCompatParcelizer17 = startForeground.read(capsMode2, i18, iIndexOf3, -1033747278, false, (String) objArr43[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer17).set(null, objArr);
                        try {
                            Object[] objArr44 = new Object[1];
                            e(null, new int[]{310, 22, 117, 12}, true, objArr44);
                            Class<?> cls9 = Class.forName((String) objArr44[0]);
                            Object[] objArr45 = new Object[1];
                            f((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1, new char[]{60702, 60795, 43018, 43408, 5766, 38481, 60085, 41019, 7851, 5387, 37827, 40491, 58059, 47191, 1787, 34341, 64255, 45187, 3610}, objArr45);
                            long jLongValue2 = ((Long) cls9.getDeclaredMethod((String) objArr45[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf3 = Long.valueOf(jLongValue2);
                            Object objRemoteActionCompatParcelizer18 = startForeground.RemoteActionCompatParcelizer(2104791916);
                            if (objRemoteActionCompatParcelizer18 == null) {
                                char cAxisFromString = (char) (13182 - MotionEvent.axisFromString(""));
                                int iMyTid = (Process.myTid() >> 22) + 1649;
                                int mode2 = View.MeasureSpec.getMode(0) + 26;
                                short s3 = (short) ($$e & 463);
                                byte[] bArr11 = $$d;
                                Object[] objArr46 = new Object[1];
                                g(s3, bArr11[30], bArr11[5], objArr46);
                                objRemoteActionCompatParcelizer18 = startForeground.read(cAxisFromString, iMyTid, mode2, 54351865, false, (String) objArr46[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer18).set(null, lValueOf3);
                            Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                            Object objRemoteActionCompatParcelizer19 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                            if (objRemoteActionCompatParcelizer19 == null) {
                                char cBlue = (char) (13183 - Color.blue(0));
                                int iLastIndexOf2 = 1648 - TextUtils.lastIndexOf("", '0', 0, 0);
                                int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 27;
                                byte[] bArr12 = $$d;
                                Object[] objArr47 = new Object[1];
                                g(bArr12[53], bArr12[5], bArr12[113], objArr47);
                                objRemoteActionCompatParcelizer19 = startForeground.read(cBlue, iLastIndexOf2, iLastIndexOf3, -133433128, false, (String) objArr47[0], null);
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
                int i19 = ((int[]) objArr[3])[0];
                int i20 = ((int[]) objArr[2])[0];
                if (i20 != i19) {
                    long j5 = -1;
                    long j6 = 0;
                    long j7 = (((long) (i20 ^ i19)) & ((((long) 0) << 32) | (j5 - ((j5 >> 63) << 32)))) | (((long) 2) << 32) | (j6 - ((j6 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer20 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer20 == null) {
                        objRemoteActionCompatParcelizer20 = startForeground.read((char) (Color.blue(0) + 4535), 6053 - TextUtils.lastIndexOf("", '0', 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke5 = ((Method) objRemoteActionCompatParcelizer20).invoke(null, null);
                    Object[] objArr48 = {1160603143, Long.valueOf(j7), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls10 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getLongPressTimeout() >> 16), TextUtils.lastIndexOf("", '0', 0, 0) + 6031, 24 - Color.argb(0, 0, 0, 0));
                    byte[] bArr13 = $$j;
                    byte b11 = bArr13[36];
                    byte b12 = (byte) (-bArr13[69]);
                    Object[] objArr49 = new Object[1];
                    h(b11, b12, (byte) (b12 + 3), objArr49);
                    cls10.getMethod((String) objArr49[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke5, objArr48);
                }
                Object objRemoteActionCompatParcelizer21 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                if (objRemoteActionCompatParcelizer21 == null) {
                    char cIndexOf = (char) TextUtils.indexOf("", "", 0);
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 943;
                    int i21 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 35;
                    short s4 = (short) 108;
                    Object[] objArr50 = new Object[1];
                    g(s4, (byte) (s4 & 186), (byte) (-$$d[9]), objArr50);
                    objRemoteActionCompatParcelizer21 = startForeground.read(cIndexOf, edgeSlop, i21, -167186806, false, (String) objArr50[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer21).getLong(null) != -1) {
                    Object objRemoteActionCompatParcelizer22 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer22 == null) {
                        char packedPositionType = (char) ExpandableListView.getPackedPositionType(0L);
                        int size = 943 - View.MeasureSpec.getSize(0);
                        int bitsPerPixel = 35 - ImageFormat.getBitsPerPixel(0);
                        byte[] bArr14 = $$d;
                        Object[] objArr51 = new Object[1];
                        g((short) 111, bArr14[19], bArr14[113], objArr51);
                        objRemoteActionCompatParcelizer22 = startForeground.read(packedPositionType, size, bitsPerPixel, -1398865628, false, (String) objArr51[0], null);
                    }
                    objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer22).get(null);
                } else {
                    Object[] objArr52 = new Object[1];
                    f(TextUtils.indexOf("", "", 0), new char[]{16882, 16792, 18306, 17941, 38674, 54524, 17924, 20407, 40749, 38024, 53631, 56491, 20005, 22429, 34631, 50324, 22025, 24351, 36761, 52344}, objArr52);
                    Class<?> cls11 = Class.forName((String) objArr52[0]);
                    Object[] objArr53 = new Object[1];
                    f(Color.red(0), new char[]{31822, 31783, 47549, 47151, 33268, 34131, 31714, 45448, 35277, 33405, 32991, 36124, 29622, 43496, 37266, 38181, 27525, 41278, 39277, 40400}, objArr53);
                    Object[] objArr54 = {Integer.valueOf(((Integer) cls11.getMethod((String) objArr53[0], Object.class).invoke(null, this)).intValue()), 0, 657836210};
                    Object objRemoteActionCompatParcelizer23 = startForeground.RemoteActionCompatParcelizer(-21191141);
                    if (objRemoteActionCompatParcelizer23 == null) {
                        char keyRepeatDelay2 = (char) (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 943;
                        int maximumFlingVelocity = 36 - (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                        byte[] bArr15 = $$d;
                        Object[] objArr55 = new Object[1];
                        g((short) 186, bArr15[13], bArr15[5], objArr55);
                        objRemoteActionCompatParcelizer23 = startForeground.read(keyRepeatDelay2, tapTimeout, maximumFlingVelocity, -2131402098, false, (String) objArr55[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    objArr2 = (Object[]) ((Method) objRemoteActionCompatParcelizer23).invoke(null, objArr54);
                    Object objRemoteActionCompatParcelizer24 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer24 == null) {
                        char cLastIndexOf2 = (char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0));
                        int iArgb2 = 943 - Color.argb(0, 0, 0, 0);
                        int i22 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 35;
                        byte[] bArr16 = $$d;
                        Object[] objArr56 = new Object[1];
                        g((short) 111, bArr16[19], bArr16[113], objArr56);
                        objRemoteActionCompatParcelizer24 = startForeground.read(cLastIndexOf2, iArgb2, i22, -1398865628, false, (String) objArr56[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer24).set(null, objArr2);
                    try {
                        Object[] objArr57 = new Object[1];
                        e(null, new int[]{310, 22, 117, 12}, true, objArr57);
                        Class<?> cls12 = Class.forName((String) objArr57[0]);
                        Object[] objArr58 = new Object[1];
                        f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 109, new char[]{60702, 60795, 43018, 43408, 5766, 38481, 60085, 41019, 7851, 5387, 37827, 40491, 58059, 47191, 1787, 34341, 64255, 45187, 3610}, objArr58);
                        long jLongValue3 = ((Long) cls12.getDeclaredMethod((String) objArr58[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf5 = Long.valueOf(jLongValue3);
                        Object objRemoteActionCompatParcelizer25 = startForeground.RemoteActionCompatParcelizer(-1539638354);
                        if (objRemoteActionCompatParcelizer25 == null) {
                            char offsetAfter = (char) TextUtils.getOffsetAfter("", 0);
                            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 943;
                            int packedPositionGroup2 = ExpandableListView.getPackedPositionGroup(0L) + 36;
                            byte b13 = $$d[45];
                            Object[] objArr59 = new Object[1];
                            g((short) 159, b13, (byte) (b13 + 1), objArr59);
                            objRemoteActionCompatParcelizer25 = startForeground.read(offsetAfter, iCombineMeasuredStates, packedPositionGroup2, -629981381, false, (String) objArr59[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer25).set(null, lValueOf5);
                        Long lValueOf6 = Long.valueOf(jLongValue3 >> 12);
                        Object objRemoteActionCompatParcelizer26 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                        if (objRemoteActionCompatParcelizer26 == null) {
                            char cNormalizeMetaState = (char) KeyEvent.normalizeMetaState(0);
                            int iIndexOf4 = 942 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            int i23 = 36 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                            short s5 = (short) 108;
                            Object[] objArr60 = new Object[1];
                            g(s5, (byte) (s5 & 186), (byte) (-$$d[9]), objArr60);
                            objRemoteActionCompatParcelizer26 = startForeground.read(cNormalizeMetaState, iIndexOf4, i23, -167186806, false, (String) objArr60[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer26).set(null, lValueOf6);
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                }
                int i24 = ((int[]) objArr2[2])[0];
                int i25 = ((int[]) objArr2[0])[0];
                if (i25 != i24) {
                    long j8 = -1;
                    long j9 = ((long) (i25 ^ i24)) & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32)));
                    long j10 = 0;
                    long j11 = j9 | (((long) 1) << 32) | (j10 - ((j10 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer27 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer27 == null) {
                        objRemoteActionCompatParcelizer27 = startForeground.read((char) (4535 - TextUtils.getOffsetAfter("", 0)), 6054 - (ViewConfiguration.getFadingEdgeLength() >> 16), 42 - TextUtils.indexOf("", ""), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke6 = ((Method) objRemoteActionCompatParcelizer27).invoke(null, null);
                    Object[] objArr61 = {1160603143, Long.valueOf(j11), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls13 = (Class) startForeground.IconCompatParcelizer((char) View.getDefaultSize(0, 0), 6030 - KeyEvent.normalizeMetaState(0), View.resolveSize(0, 0) + 24);
                    byte[] bArr17 = $$j;
                    byte b14 = bArr17[36];
                    byte b15 = (byte) (-bArr17[69]);
                    Object[] objArr62 = new Object[1];
                    h(b14, b15, (byte) (b15 + 3), objArr62);
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
        RemoteActionCompatParcelizer = 0;
        AudioAttributesImplBaseParcelizer();
        INSTANCE = new Companion(null);
        int i = read + 39;
        RemoteActionCompatParcelizer = i % 128;
        int i2 = i % 2;
    }

    @Override // kotlin.immediatePendingResult, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 73;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 81;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    static void AudioAttributesImplBaseParcelizer() {
        AudioAttributesCompatParcelizer = new char[]{44986, 45037, 45027, 45025, 45050, 45030, 45036, 44995, 44996, 45051, 45018, 44981, 45035, 45050, 45027, 45038, 45030, 45049, 44800, 44701, 44698, 44690, 44718, 44970, 44989, 44997, 45050, 45026, 45005, 44995, 45036, 45030, 45050, 45025, 45027, 45037, 45032, 45032, 45033, 45025, 45031, 45012, 45036, 45052, 45028, 45029, 45029, 45028, 45025, 44989, 45028, 45030, 45028, 45024, 45032, 45036, 45024, 45028, 45050, 45010, 45008, 45051, 45027, 45025, 45048, 45049, 45030, 44987, 44998, 44984, 44993, 45038, 45033, 45032, 45035, 44993, 44991, 44990, 44988, 44997, 45039, 45039, 44998, 44984, 44992, 45038, 44995, 44987, 44998, 45039, 44997, 44978, 44997, 44999, 44992, 44992, 44984, 44987, 44987, 44992, 44993, 44990, 44999, 45033, 45032, 45032, 44998, 44999, 44993, 44988, 44989, 44988, 44978, 44997, 45039, 44945, 44991, 44998, 44999, 44998, 45038, 45039, 44997, 44988, 44990, 44988, 44991, 44986, 44984, 44989, 44990, 44992, 44992, 44993, 45039, 45038, 45033, 44998, 44989, 44990, 44987, 44984, 44998, 44998, 44992, 44993, 44984, 44986, 44987, 44990, 44978, 44990, 44986, 44987, 44995, 44999, 44988, 44988, 44989, 44989, 44999, 45033, 45033, 44993, 44999, 44992, 44986, 44995, 45033, 44999, 44988, 44991, 44988, 44998, 44998, 44985, 44995, 45033, 44995, 44950, 44988, 44992, 44998, 44996, 45033, 45033, 44998, 44998, 44993, 44987, 44993, 44992, 44995, 44992, 44987, 44994, 44993, 44998, 45039, 45033, 44995, 44985, 44990, 44993, 44992, 44995, 44993, 44993, 44998, 44988, 44988, 44989, 44999, 44995, 44995, 45032, 44992, 44987, 44992, 44999, 44996, 45038, 44998, 44985, 44990, 44998, 45032, 45038, 44996, 44998, 45035, 44995, 44987, 44987, 44984, 44984, 44991, 44997, 45038, 44996, 44988, 44990, 44985, 44982, 45055, 45050, 45048, 45051, 45027, 45025, 45018, 45019, 45028, 45031, 45025, 45033, 45024, 45025, 45032, 45024, 45049, 45019, 44992, 45028, 45025, 45027, 45025, 45025, 45048, 45049, 45025, 45027, 45025, 44995, 44994, 45027, 45028, 44996, 44994, 45026, 45030, 44998, 44998, 45025, 45024, 45036, 45030, 45049, 45019, 45016, 45022, 44986, 44992, 45031, 45031, 45027, 45051, 45049, 45031, 45028, 45054, 45048, 45051, 45020, 44990, 44965, 44995, 45032, 45039, 45024, 44866, 44841, 44898, 44910, 44841, 44883, 44884, 44910, 44909, 44883, 44905, 44892, 44906, 44882, 44910, 44907, 44850, 44904, 44880, 44899, 44898, 44900};
        write = -8557466720374663315L;
    }
}
