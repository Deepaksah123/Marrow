package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
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
import java.lang.reflect.Method;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/LastLocationRequestBuilder;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LastLocationRequestBuilder extends GeofencingRequestInitialTrigger {
    private static int AudioAttributesCompatParcelizer;
    private static short[] AudioAttributesImplApi21Parcelizer;
    private static int IconCompatParcelizer;
    private static byte[] MediaBrowserCompatCustomActionResultReceiver;
    private static int MediaBrowserCompatItemReceiver;
    private static int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] write;
    private static final byte[] $$l = {57, 34, -8, 64};
    private static final int $$m = 85;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {10, -58, 112, 6, -54, 68, 9, 26, -39, 56, 0, 32, -74, 40, 63, -6, 16, 17, -35, 62, 11, 9, 2, 4, 30, 10, -4, 25, -31, 47, 14, 7, -31, 42, 29, -3, -10, 28, 28, -4, 13, 18, 8, 28, -10, 24, 6, 2, 22, -4, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, 23, 9, -52, 68, 19, 11, 3, 16, 4, -44, 62, 24, 1, 25, 8, 5, 6, -43, 74, -1, 30, -4, 24, 2, 3, 22, -51, 64, 16, 12, 18, -55, 32, TarConstants.LF_NORMAL, 12, 18, -65, 24};
    private static final int $$k = 190;
    private static final byte[] $$d = {TarConstants.LF_GNUTYPE_LONGNAME, 36, -23, -15, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 144;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int AudioAttributesImplBaseParcelizer = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0032). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(byte r6, short r7, short r8) {
        /*
            int r8 = r8 * 3
            int r8 = 3 - r8
            byte[] r0 = kotlin.LastLocationRequestBuilder.$$l
            int r7 = r7 * 3
            int r1 = 1 - r7
            int r6 = r6 * 3
            int r6 = 112 - r6
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L18
            r3 = r8
            r4 = r2
            goto L32
        L18:
            r3 = r2
        L19:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            int r3 = r3 + 1
            int r6 = r6 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L32:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.LastLocationRequestBuilder.$$n(byte, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            byte[] r0 = kotlin.LastLocationRequestBuilder.$$d
            int r7 = r7 + 65
            int r1 = 44 - r6
            byte[] r1 = new byte[r1]
            int r6 = 43 - r6
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L29
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L29:
            int r7 = r7 + r8
            int r7 = r7 + (-1)
            int r8 = r3 + 1
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.LastLocationRequestBuilder.g(short, byte, short, java.lang.Object[]):void");
    }

    private static void h(byte b, byte b2, short s, Object[] objArr) {
        int i = s + 82;
        int i2 = 76 - b;
        byte[] bArr = $$j;
        byte[] bArr2 = new byte[43 - b2];
        int i3 = 42 - b2;
        int i4 = -1;
        if (bArr == null) {
            i = (i3 + i) - 11;
        }
        while (true) {
            i4++;
            i2++;
            bArr2[i4] = (byte) i;
            if (i4 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i = (i + bArr[i2]) - 11;
        }
    }

    public LastLocationRequestBuilder() {
        super((byte) 0);
    }

    /* JADX INFO: renamed from: o.LastLocationRequestBuilder$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/LastLocationRequestBuilder$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/isFastestIntervalExplicitlySet;", "p1", "Landroid/content/Intent;", "write", "(Landroid/content/Context;Lo/isFastestIntervalExplicitlySet;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent write(Context p0, isFastestIntervalExplicitlySet p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) LastLocationRequestBuilder.class);
            p1.AudioAttributesCompatParcelizer(intent);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void e(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i;
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i5 = iArr[0];
        int i6 = iArr[1];
        int i7 = iArr[2];
        int i8 = iArr[3];
        char[] cArr = write;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 113;
                $10 = i10 % 128;
                if (i10 % i3 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 11613 - Drawable.resolveOpacity(0, 0), View.MeasureSpec.getMode(0) + 20, -1786471333, false, "u", new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        i9 %= 0;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr[i9])};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-338863922);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), Color.rgb(0, 0, 0) + 16788829, (ViewConfiguration.getLongPressTimeout() >> 16) + 20, -1786471333, false, "u", new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                        i9++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                int i11 = $11 + 75;
                $10 = i11 % 128;
                int i12 = i11 % 2;
                i3 = 2;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i6];
        System.arraycopy(cArr, i5, cArr3, 0, i6);
        if (bArr != null) {
            char[] cArr4 = new char[i6];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i6) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i13 = $11 + 105;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) TextUtils.getTrimmedLength(""), 22959 - (Process.myPid() >> 22), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 42, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                } else {
                    int i16 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr5 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 31589), Color.alpha(0) + 9863, (-16777151) - Color.rgb(0, 0, 0), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr6 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (View.resolveSize(0, 0) + 37822), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 9753, 27 - (Process.myPid() >> 22), 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i8 > 0) {
            char[] cArr5 = new char[i6];
            System.arraycopy(cArr3, 0, cArr5, 0, i6);
            int i17 = i6 - i8;
            System.arraycopy(cArr5, 0, cArr3, i17, i8);
            System.arraycopy(cArr5, i8, cArr3, 0, i17);
        }
        if (z) {
            char[] cArr6 = new char[i6];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i6) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i6 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            int i18 = $11 + 39;
            $10 = i18 % 128;
            i = 2;
            int i19 = i18 % 2;
            cArr3 = cArr6;
        } else {
            i = 2;
        }
        if (i7 > 0) {
            int i20 = $11 + 65;
            $10 = i20 % 128;
            int i21 = i20 % i;
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i6) {
                int i22 = $11 + 105;
                $10 = i22 % 128;
                if (i22 % 2 != 0) {
                    cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] << iArr[4]);
                    i2 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                } else {
                    cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                    i2 = buildsetstopreasonintent.RemoteActionCompatParcelizer + 1;
                }
                buildsetstopreasonintent.RemoteActionCompatParcelizer = i2;
            }
        }
        String str = new String(cArr3);
        int i23 = $10 + 31;
        $11 = i23 % 128;
        if (i23 % 2 != 0) {
            objArr[0] = str;
        } else {
            int i24 = 10 / 0;
            objArr[0] = str;
        }
    }

    private static void f(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        int i4 = 2;
        int i5 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(AudioAttributesCompatParcelizer)};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            float f = BitmapDescriptorFactory.HUE_RED;
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24297, 12 - View.MeasureSpec.getSize(0), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            long j2 = 0;
            if (i6 == 0) {
                j = 7899112766888837815L;
            } else {
                byte[] bArr = MediaBrowserCompatCustomActionResultReceiver;
                if (bArr != null) {
                    int i7 = $10 + 121;
                    int i8 = i7 % 128;
                    $11 = i8;
                    int i9 = i7 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i10 = i8 + 63;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = 0;
                    while (i12 < length) {
                        int i13 = $11 + 87;
                        $10 = i13 % 128;
                        int i14 = i13 % i4;
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i12])};
                            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                char c = (char) (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1));
                                int iRed = Color.red(0) + 3082;
                                int i15 = 127 - (ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1));
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objRemoteActionCompatParcelizer2 = startForeground.read(c, iRed, i15, 2145850993, false, $$n(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i12] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                            i12++;
                            int i16 = $10 + 35;
                            $11 = i16 % 128;
                            int i17 = i16 % 2;
                            i4 = 2;
                            f = BitmapDescriptorFactory.HUE_RED;
                            j2 = 0;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = MediaBrowserCompatCustomActionResultReceiver;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(IconCompatParcelizer)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) Color.red(0), 24297 - (ViewConfiguration.getPressedStateDuration() >> 16), 12 - View.resolveSizeAndState(0, 0, 0), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesCompatParcelizer) ^ 7899112766888837815L)));
                        j = 7899112766888837815L;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    j = 7899112766888837815L;
                    iIntValue = (short) (((short) (((long) AudioAttributesImplApi21Parcelizer[i + ((int) (((long) IconCompatParcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesCompatParcelizer) ^ 7899112766888837815L)));
                }
            }
            if (iIntValue > 0) {
                buildresumedownloadsintent.read = ((i + iIntValue) - 2) + ((int) (((long) IconCompatParcelizer) ^ j)) + i6;
                Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i3), Integer.valueOf(RemoteActionCompatParcelizer), sb};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 34133), ((Process.getThreadPriority(0) + 20) >> 6) + 13432, 22 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr4 = MediaBrowserCompatCustomActionResultReceiver;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i18 = 0; i18 < length2; i18++) {
                        bArr5[i18] = (byte) (((long) bArr4[i18]) ^ 7899112766888837815L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i19 = $11 + 17;
                    $10 = i19 % 128;
                    int i20 = i19 % 2;
                    z = true;
                } else {
                    z = false;
                }
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    int i21 = $11 + 47;
                    $10 = i21 % 128;
                    int i22 = i21 % 2;
                    if (z) {
                        byte[] bArr6 = MediaBrowserCompatCustomActionResultReceiver;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r8]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        short[] sArr = AudioAttributesImplApi21Parcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r8]) ^ 7899112766888837815L)) + s)) ^ b));
                    }
                    sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c5  */
    @Override // kotlin.GeofencingRequestInitialTrigger, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2686
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.LastLocationRequestBuilder.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.GeofencingRequestInitialTrigger, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 71;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            e(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, new int[]{18, 26, 144, 0}, false, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 49), (byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 60), 97206732 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1), MotionEvent.axisFromString("") - 83, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 1531977926, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = MediaBrowserCompatMediaItem + 5;
            AudioAttributesImplApi26Parcelizer = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4535), View.resolveSize(0, 0) + 6054, 42 - Color.red(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.normalizeMetaState(0), 6031 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), View.combineMeasuredStates(0, 0) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i6 = AudioAttributesImplApi26Parcelizer + 45;
                MediaBrowserCompatMediaItem = i6 % 128;
                int i7 = i6 % 2;
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

    @Override // kotlin.GeofencingRequestInitialTrigger, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = MediaBrowserCompatMediaItem + 85;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            e(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, new int[]{18, 26, 144, 0}, false, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 94), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 97206777, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 85, (-1531977922) - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = AudioAttributesImplApi26Parcelizer + 17;
            MediaBrowserCompatMediaItem = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (View.resolveSizeAndState(0, 0, 0) + 4535), 6053 - ((byte) KeyEvent.getModifierMetaStateMask()), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (Process.myTid() >> 22), TextUtils.lastIndexOf("", '0', 0) + 6031, 23 - MotionEvent.axisFromString(""), -861814097, false, "read", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i6 = AudioAttributesImplApi26Parcelizer + 19;
                MediaBrowserCompatMediaItem = i6 % 128;
                int i7 = i6 % 2;
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

    /* JADX WARN: Removed duplicated region for block: B:134:0x0bc3 A[Catch: all -> 0x0c80, TryCatch #2 {all -> 0x0c80, blocks: (B:132:0x0baf, B:134:0x0bc3, B:135:0x0bf4), top: B:261:0x0baf, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0c07 A[Catch: all -> 0x0c76, TryCatch #11 {all -> 0x0c76, blocks: (B:136:0x0bfa, B:138:0x0c07, B:139:0x0c6e), top: B:278:0x0bfa, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0d91  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0dde  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0e9f  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x1269  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x134a  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x1393  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x13ef  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x17c6  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0b95 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:290:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00ef  */
    @Override // kotlin.GeofencingRequestInitialTrigger, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r33) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6538
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.LastLocationRequestBuilder.attachBaseContext(android.content.Context):void");
    }

    static {
        MediaBrowserCompatItemReceiver = 0;
        MediaBrowserCompatItemReceiver();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplBaseParcelizer + 121;
        MediaBrowserCompatItemReceiver = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // kotlin.GeofencingRequestInitialTrigger, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 107;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = AudioAttributesImplApi26Parcelizer + 79;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 67 / 0;
        }
    }

    static void MediaBrowserCompatItemReceiver() {
        write = new char[]{44979, 45049, 45030, 45038, 45027, 45050, 45035, 44981, 45018, 45051, 44996, 44995, 45036, 45030, 45050, 45025, 45027, 45037, 45042, 44925, 44915, 44913, 44682, 44918, 44924, 44883, 44893, 44914, 44682, 44885, 44877, 44904, 44913, 44916, 44917, 44917, 44916, 44684, 44924, 44900, 44919, 44913, 44921, 44920, 44946, 44992, 45038, 44995, 44987, 44998, 45039, 44997, 44978, 44997, 44999, 44992, 44992, 44984, 44987, 44987, 44992, 44993, 44990, 44999, 45033, 45032, 45032, 44998, 44999, 44993, 44988, 44989, 44988, 44978, 44997, 45039, 45038, 44998, 44984, 44993, 45038, 45033, 45032, 45035, 44993, 44991, 44990, 44988, 44997, 45039, 45039, 44998, 44946, 44995, 44993, 44993, 44998, 44988, 44988, 44989, 44999, 44995, 44995, 45032, 44992, 44987, 44992, 44999, 44996, 45038, 44998, 44985, 44990, 44998, 45032, 45038, 44996, 44998, 45035, 44995, 44987, 44987, 44984, 44984, 44991, 44997, 45038, 44996, 44988, 44990, 44985, 44990, 44988, 44992, 44998, 44996, 45033, 45033, 44998, 44998, 44993, 44987, 44993, 44992, 44995, 44992, 44987, 44994, 44993, 44998, 45039, 45033, 44995, 44985, 44990, 44993, 44957, 44965, 44995, 45032, 45039, 45024, 45048, 45055, 45050, 45048, 45051, 45027, 45025, 45018, 45019, 45028, 45031, 45025, 45033, 45024, 45025, 45032, 45024, 45049, 45019, 44992, 45028, 45025, 45027, 45025, 45025, 45048, 45049, 45025, 45027, 45025, 44995, 44994, 45027, 45028, 44996, 44994, 45026, 45030, 44998, 44998, 45025, 45024, 45036, 45030, 45049, 45019, 45016, 45022, 44986, 44992, 45031, 45031, 45027, 45051, 45049, 45031, 45028, 45054, 45048, 45051, 45020, 45010, 44858, 44879, 44873, 44879, 44884, 44884, 44866, 44836, 44873, 44876, 44866, 44873, 44834, 44833, 44878, 44877, 44839, 44838, 44837, 44837, 44837, 44832, 44873, 44867, 44867, 44867, 44838, 44835, 44833, 44833, 44836, 44858, 44876, 44873, 44833, 44974, 45022, 45024, 45031, 45023, 45011, 45027, 45038, 45037, 45036, 45038, 45027, 45051, 45028, 45028, 45052, 45007, 44800, 44801, 44804, 44804, 44806, 44800, 44803, 44800, 44800, 44801};
        IconCompatParcelizer = 891108528;
        AudioAttributesCompatParcelizer = -819363119;
        RemoteActionCompatParcelizer = -1803967598;
        MediaBrowserCompatCustomActionResultReceiver = new byte[]{-23, 6, -50, 30, -115, 116, -121, 97, -116, -120, -113, -114, 114, 93, -65, 116, 123, -127, 114, -113, 96, -84, 102, -104, 122, 86, 87, -122, -85, -87, TarConstants.LF_GNUTYPE_SPARSE, -96, -87, TarConstants.LF_GNUTYPE_SPARSE, 84, -95, 100, -101, 99, -86, -88, -86, -125, 87, -96, 85, -87, 100, -101, 121, -122, -84, -88, 86, TarConstants.LF_GNUTYPE_SPARSE, 86, -95, 87, -88, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, -127, -83, 84, -86, 85, 112, 84, -84, -125, 122, -101, -87, 102, 86, -123, -86, 87, 87, 126, -126, -81, 101, -88, -101, -111, 111, -106, -106, 96, -13, 10, -6, 1, -35, -34, 60, 2, -10, 14, -59, TarConstants.LF_FIFO, 16, -18, 12, -60, 56, -49, -27, 26, -60, 61, -51, TarConstants.LF_FIFO, -22, -23, 119, -56, -115, 6, TarConstants.LF_CONTIG, TarConstants.LF_FIFO, TarConstants.LF_LINK, -62, 58, -63, 127, -125, 114, -113, -116, 123, -108, 105, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 117, -124, -120, 114, -128, -117, -116, 118, -118, 112, -116, 116, -118, 118, -113, -73, -73, -73, -73, -73, -73, -73, -73};
    }
}
