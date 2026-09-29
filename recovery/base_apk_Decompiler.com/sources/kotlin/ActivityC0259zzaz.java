package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
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
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: renamed from: o.zzaz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/zzaz;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ActivityC0259zzaz extends AbstractActivityC0258zzay {
    private static char AudioAttributesCompatParcelizer;
    private static int AudioAttributesImplApi21Parcelizer;
    private static char AudioAttributesImplBaseParcelizer;
    private static long IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char read;
    private static char write;
    private static final byte[] $$c = {TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, TarConstants.LF_GNUTYPE_LONGNAME, 9, 62};
    private static final int $$f = 124;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {34, 127, 65, -22, 18, 4, -57, 63, 14, 6, -2, 11, -1, -49, 57, 19, -4, 20, 3, 0, 1, -48, 69, -6, 25, -9, 19, -3, -2, 17, -56, 59, 11, 7, 13, -60, 27, 43, 7, 13, -70, 19, 1, -3, 17, -9, 25, 14, 8, 11, -9, -30, 40, 23, -5, 12, 5, -37, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19, -59, 37, 30, 5, 11, -2, -24, TarConstants.LF_SYMLINK, -5, 7, 4, -7, 25, 1, 7, 16, -23, 25, 15, -4, 7, 19, -7, 19, -41, TarConstants.LF_SYMLINK, -5, 7, 4, -16, 26, 29, -28, 17, 17, 15, -10, 20, -7, 2, 9};
    private static final int $$k = 60;
    private static final byte[] $$d = {111, -63, 80, 27, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 39;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static int AudioAttributesImplApi26Parcelizer = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(int r6, int r7, short r8) {
        /*
            int r7 = r7 * 3
            int r7 = 3 - r7
            byte[] r0 = kotlin.ActivityC0259zzaz.$$c
            int r8 = r8 * 18
            int r8 = 122 - r8
            int r6 = r6 * 3
            int r6 = r6 + 1
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityC0259zzaz.$$i(int, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r0 = r7 + 4
            int r6 = 114 - r6
            byte[] r1 = kotlin.ActivityC0259zzaz.$$d
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = -1
            if (r1 != 0) goto L13
            r4 = r7
            r6 = r8
            r3 = r2
            goto L29
        L13:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L17:
            int r3 = r3 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r0, r7)
            r9[r7] = r6
            return
        L27:
            r4 = r1[r6]
        L29:
            int r8 = r8 + r4
            int r8 = r8 + r2
            int r6 = r6 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityC0259zzaz.g(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = 39 - r9
            int r7 = r7 + 82
            byte[] r0 = kotlin.ActivityC0259zzaz.$$j
            int r8 = 111 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L25
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L20
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L20:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L25:
            int r7 = r7 + r8
            int r7 = r7 + (-6)
            int r8 = r3 + 1
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityC0259zzaz.h(byte, int, short, java.lang.Object[]):void");
    }

    public ActivityC0259zzaz() {
        super((byte) 0);
    }

    /* JADX INFO: renamed from: o.zzaz$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/zzaz$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/isCompatible;", "p1", "Landroid/content/Intent;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;Lo/isCompatible;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private static int AudioAttributesCompatParcelizer;
        private static int AudioAttributesImplApi21Parcelizer;
        private static int AudioAttributesImplApi26Parcelizer;
        private static short[] AudioAttributesImplBaseParcelizer;
        private static int IconCompatParcelizer;
        private static byte[] MediaBrowserCompatCustomActionResultReceiver;
        private static final byte[] MediaBrowserCompatItemReceiver;
        private static final int MediaBrowserCompatMediaItem;
        private static char RemoteActionCompatParcelizer;
        private static int read;
        private static char[] write;
        private static final byte[] $$c = {104, 109, 121, 73};
        private static final int $$d = 5;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$a = {62, -25, -124, -119, 26, 12, -1, -43, 44, -2, 3, -15, 19, -36, 17, 17, -15, 2, 7, -3, 17, -21, 13};
        private static final int $$b = 102;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$e(short r5, short r6, int r7) {
            /*
                int r5 = r5 * 4
                int r0 = r5 + 1
                int r6 = r6 * 2
                int r6 = r6 + 112
                int r7 = r7 * 2
                int r7 = 4 - r7
                byte[] r1 = kotlin.ActivityC0259zzaz.Companion.$$c
                byte[] r0 = new byte[r0]
                r2 = 0
                if (r1 != 0) goto L16
                r4 = r5
                r3 = r2
                goto L26
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r6
                r0[r3] = r4
                if (r3 != r5) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r0, r2)
                return r5
            L22:
                r4 = r1[r7]
                int r3 = r3 + 1
            L26:
                int r6 = r6 + r4
                int r7 = r7 + 1
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityC0259zzaz.Companion.$$e(short, short, int):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void d(short r7, short r8, byte r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 3
                int r7 = 3 - r7
                int r9 = r9 * 3
                int r9 = 73 - r9
                int r8 = r8 * 4
                int r8 = r8 + 20
                byte[] r0 = kotlin.ActivityC0259zzaz.Companion.$$a
                byte[] r1 = new byte[r8]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r9
                r4 = r2
                r9 = r7
                goto L2f
            L17:
                r3 = r2
            L18:
                int r7 = r7 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                if (r4 != r8) goto L29
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L29:
                r3 = r0[r7]
                r6 = r9
                r9 = r7
                r7 = r3
                r3 = r6
            L2f:
                int r7 = r7 + r3
                r3 = r4
                r6 = r9
                r9 = r7
                r7 = r6
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityC0259zzaz.Companion.d(short, short, byte, java.lang.Object[]):void");
        }

        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent RemoteActionCompatParcelizer(Context p0, isCompatible p1) {
            int i = 2 % 2;
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) ActivityC0259zzaz.class);
            p1.AudioAttributesCompatParcelizer(intent);
            int i2 = AudioAttributesCompatParcelizer + 107;
            IconCompatParcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                return intent;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }

        private static void b(int i, int i2, short s, int i3, byte b, Object[] objArr) throws Throwable {
            long j;
            buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(AudioAttributesImplApi26Parcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
                long j2 = 0;
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24297, 13 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                int i4 = iIntValue == -1 ? 1 : 0;
                if (i4 == 0) {
                    j = 7899112766888837815L;
                } else {
                    byte[] bArr = MediaBrowserCompatCustomActionResultReceiver;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i5 = 0;
                        while (i5 < length) {
                            Object[] objArr3 = {Integer.valueOf(bArr[i5])};
                            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                char cIndexOf = (char) TextUtils.indexOf("", "");
                                int iMakeMeasureSpec = 3082 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                int i6 = 127 - (ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1));
                                byte b2 = (byte) ($$d - 5);
                                byte b3 = b2;
                                objRemoteActionCompatParcelizer2 = startForeground.read(cIndexOf, iMakeMeasureSpec, i6, 2145850993, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i5] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                            i5++;
                            j2 = 0;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = MediaBrowserCompatCustomActionResultReceiver;
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(read)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) ((-1) - ImageFormat.getBitsPerPixel(0)), (KeyEvent.getMaxKeyCode() >> 16) + 24297, 11 - MotionEvent.axisFromString(""), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesImplApi26Parcelizer) ^ 7899112766888837815L)));
                        j = 7899112766888837815L;
                    } else {
                        j = 7899112766888837815L;
                        iIntValue = (short) (((short) (((long) AudioAttributesImplBaseParcelizer[i + ((int) (((long) read) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesImplApi26Parcelizer) ^ 7899112766888837815L)));
                    }
                }
                if (iIntValue > 0) {
                    buildresumedownloadsintent.read = ((i + iIntValue) - 2) + ((int) (((long) read) ^ j)) + i4;
                    Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i2), Integer.valueOf(AudioAttributesImplApi21Parcelizer), sb};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (34133 - Process.getGidForName("")), (ViewConfiguration.getEdgeSlop() >> 16) + 13432, 21 - (ViewConfiguration.getJumpTapTimeout() >> 16), 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    byte[] bArr4 = MediaBrowserCompatCustomActionResultReceiver;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i7 = 0; i7 < length2; i7++) {
                            bArr5[i7] = (byte) (((long) bArr4[i7]) ^ 7899112766888837815L);
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                    while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                        if (z) {
                            byte[] bArr6 = MediaBrowserCompatCustomActionResultReceiver;
                            buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                            buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r7]) ^ 7899112766888837815L)) + s)) ^ b));
                        } else {
                            short[] sArr = AudioAttributesImplBaseParcelizer;
                            buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                            buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r7]) ^ 7899112766888837815L)) + s)) ^ b));
                        }
                        sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                        buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                        buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }

        private static void c(int i, byte b, char[] cArr, Object[] objArr) throws Throwable {
            int i2;
            Object obj;
            char c;
            int i3 = 2 % 2;
            needsStartedService needsstartedservice = new needsStartedService();
            char[] cArr2 = write;
            if (cArr2 != null) {
                int length = cArr2.length;
                char[] cArr3 = new char[length];
                int i4 = 0;
                while (i4 < length) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getFadingEdgeLength() >> 16) + 7015, 30 - KeyEvent.keyCodeFromString(""), -626716224, false, "o", new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        i4++;
                        int i5 = $11 + 119;
                        $10 = i5 % 128;
                        int i6 = i5 % 2;
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
            Object[] objArr3 = {Integer.valueOf(RemoteActionCompatParcelizer)};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
            char c2 = '\b';
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getTouchSlop() >> 8), 7015 - (ViewConfiguration.getEdgeSlop() >> 16), ExpandableListView.getPackedPositionType(0L) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
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
                needsstartedservice.AudioAttributesCompatParcelizer = 0;
                int i7 = $10 + 1;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                    needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                    needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                    if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                        int i9 = $10 + 13;
                        $11 = i9 % 128;
                        if (i9 % 2 == 0) {
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write * b);
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer >>> b);
                        } else {
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                        }
                        c = c2;
                        obj = null;
                    } else {
                        Object[] objArr4 = new Object[13];
                        objArr4[12] = needsstartedservice;
                        objArr4[11] = Integer.valueOf(cCharValue);
                        objArr4[10] = needsstartedservice;
                        objArr4[9] = needsstartedservice;
                        objArr4[c2] = Integer.valueOf(cCharValue);
                        objArr4[7] = needsstartedservice;
                        objArr4[6] = needsstartedservice;
                        objArr4[5] = Integer.valueOf(cCharValue);
                        objArr4[4] = needsstartedservice;
                        objArr4[3] = needsstartedservice;
                        objArr4[2] = Integer.valueOf(cCharValue);
                        objArr4[1] = needsstartedservice;
                        objArr4[0] = needsstartedservice;
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (48194 - View.getDefaultSize(0, 0)), ExpandableListView.getPackedPositionGroup(0L) + 20126, Color.blue(0) + 20, 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                            try {
                                Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                                if (objRemoteActionCompatParcelizer4 == null) {
                                    c = '\b';
                                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0) + 1), (-16757848) - Color.rgb(0, 0, 0), 18 - (ViewConfiguration.getTapTimeout() >> 16), 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                                } else {
                                    c = '\b';
                                }
                                obj = null;
                                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                                int i10 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i10];
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        } else {
                            obj = null;
                            c = '\b';
                            if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                                needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                                needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                                int i11 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                                int i12 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i11];
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i12];
                            } else {
                                int i13 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                                int i14 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i13];
                                cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i14];
                            }
                        }
                    }
                    needsstartedservice.AudioAttributesCompatParcelizer += 2;
                    c2 = c;
                }
            }
            for (int i15 = 0; i15 < i; i15++) {
                cArr4[i15] = (char) (cArr4[i15] ^ 13722);
            }
            objArr[0] = new String(cArr4);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        /* JADX WARN: Removed duplicated region for block: B:173:0x08b4 A[Catch: all -> 0x08b6, TryCatch #13 {all -> 0x08b6, blocks: (B:154:0x088c, B:171:0x08ad, B:173:0x08b4, B:174:0x08b5), top: B:260:0x088c }] */
        /* JADX WARN: Removed duplicated region for block: B:174:0x08b5 A[Catch: all -> 0x08b6, TRY_LEAVE, TryCatch #13 {all -> 0x08b6, blocks: (B:154:0x088c, B:171:0x08ad, B:173:0x08b4, B:174:0x08b5), top: B:260:0x088c }] */
        /* JADX WARN: Removed duplicated region for block: B:219:0x099f A[PHI: r23
          0x099f: PHI (r23v7 int) = (r23v0 int), (r23v1 int), (r23v2 int), (r23v4 int), (r23v8 int) binds: [B:208:0x0962, B:203:0x092f, B:199:0x090b, B:189:0x08f0, B:22:0x0453] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Removed duplicated region for block: B:226:0x09b5  */
        /* JADX WARN: Removed duplicated region for block: B:303:0x09c3 A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static void read(android.content.Context r24, long r25, long r27) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2590
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityC0259zzaz.Companion.read(android.content.Context, long, long):void");
        }

        static {
            byte[] bArr = new byte[602];
            System.arraycopy("\"\u007fAêó\nò\u0003\u0006\u00056¸\r\u0004îIØí\u0004î4Ô\u0001\bý\u0002ò\u0003\u0011í\u000bú\u0001\u0002ñ)æì'íõ\u000b\u0004í ëü\böú\u0001ó\nò\u0003\u0006\u00056Á\b\u0001û\b3íÌ\u0011ûú\u001bâ\u0011þø\u0002ñ'ìé\"ç\u0003÷\b\bó\nò\u0003\u0006\u00056Çõ\u0011ñ\bÿ\u0006ðEëÔ\u0003ýýõ\r\u0000÷ó\nò\u0003\u0006\u00056¸\r\u0004îIØí\u0004îô\u0002\u000bùû\t\u0018è\u0004îþ\u0003\r\u0001\u0011ß\u0013í\u000fòó\nò\u0003\u0006\u00056Çõ\u0011ñ\bÿ\u0006ðEÊò\u0011ê\u0016ÿö\u00077êÒ\u0011ê\u0016ÿö\u0007\rò\u0004\u0003ö\u0011\u0016ß\u000fþúõûó\nò\u0003\u0006\u00056¿üEÛÚ\u0006ÿ\u000fø*×ý\føî\u0003\u0000\r÷ú ìö\r\u0004ý\u0010ëü\b\u0018äý\u0000\u0003öó\nò\u0003\u0006\u00056¸\r\u0004îIáÞû\u000bú\u0001)Ï\u0011÷úé\u000fö-Ô\u0003\u0002\u001aß\u0002\tû\u0007\të\u00153Â\u000bó\u00079Ûß\u0002\tû\u0007ó\nò\u0003\u0006\u00056¹\u0001\u000bý>ÚÛ\t\u000b\u0001\u000eõõ÷\u0010ô\u0002ý\u0004\u0007í$å)Úý\u000eí\u0005ü\u000bü\b\u0018äý\u0000\u0003ö\u0002ñ'äû\u0005üø\b'Ú\u0003û\u0007\u0011ñùý\fúõû\u0003\u0004\u0003õ\të\u00153Â\u000bó\u00079åÛú\u000fþ\u0002ó\u0015õ÷\u0010\u0016éûú\u001eõõ÷\u0010\u0002ñ*Õ\bý\u001cóñ\u001cëü\böú\u0001ó\nò\u0003\u0006\u00056º\u000fí\u0004FÚïí\u0004\u001fá\u000býù\u000bîÿ+Û\nÿí)é\të\u00153Â\u000bó\u00079ëÛ\u0007ï\u001fîôü\u0010÷\u000bþ\të\u00153Â\u000bó\u00079Úìö\u0003ø\u0016ÿö\u0007\u0002ñ1âì\u0002\u000e\të\u00153Â\u000bó\u00079ßíø\u0005\u0002ï\të\u00153Â\u000bó\u00079âÝ\u0001\u0007û\t\u000b\të\u00153Â\u000bó\u00079¼\rÿú\u0007\u0002ïFíÞ\u0000þò\u0000\n\u0007ö\u0007\u0016íø\u0005\u0002ï\u000eñ3Þ\u0000þò\u0000\n\u0007ö\u0007\të\u00153Â\u000bó\u00079¼\rÿú\u0007\u0002ïFáèñ\fù\u000bûø\u0007\u0004\u0006\u000fâ\të\u00153Â\u000bó\u00079ßíø\u0005\u0002ï9".getBytes(CharsetNames.ISO_8859_1), 0, bArr, 0, 602);
            MediaBrowserCompatItemReceiver = bArr;
            MediaBrowserCompatMediaItem = 198;
            read();
            IconCompatParcelizer = 0;
            AudioAttributesCompatParcelizer = 1;
            write = new char[]{6464, 6470, 6495, 6465};
            RemoteActionCompatParcelizer = (char) 11440;
        }

        static void read() {
            read = 47822994;
            AudioAttributesImplApi26Parcelizer = -69539483;
            AudioAttributesImplApi21Parcelizer = -316429762;
            MediaBrowserCompatCustomActionResultReceiver = new byte[]{-30, -26, -17, 86, -30, -8, 85, -30, -26, -17, 106, 109, -27, 104, -17, -26, -17, 87, -32, -26, -17, 87, -32, -26, -17, 106, 109, -26, -17, 105, 110, -26, -17, 104, -32, -8, TarConstants.LF_GNUTYPE_SPARSE, -29, -29, -17, 81, -26, -27, 87, 109, -8, 86, -28, -29, -17, 85, -31, -29, -17, 106, -32, -26, 106, 110, -8, 105, 107, -8, 108, 107, -26, -17, 81, -27, -29, -17, 84, -26, -29, -17, 85, -30, -27, 86, -6, TarConstants.LF_GNUTYPE_SPARSE, -29, -29, -17, 81, -26, -27, 84, -29, -27, TarConstants.LF_GNUTYPE_SPARSE, -28, -27, 86, -28, -29, -17, 85, -31, -29, -17, 86, -31, -27, 86, -6, 86, -6, 104, -30, -29, -17, 106, -32, -26, 85, -30, -27, 104, -17, -27, 87, -17, -29, -17, 106, -32, -26, 106, -32, -29, -17, 87, -32, -27, 105, 109, -29, -17, 106, 109, -27, 84, -27, -29, 108, 110, -29, -17, 84, -26, -26, 81, -8, -28, -17, 106, 109, -27, 105, 110, -27, 84, -27, -28, -17, 108, 107, -27, TarConstants.LF_GNUTYPE_SPARSE, -26, -28, -17, 86, -6, 86, -29, -28, -17, 85, -28, -28, -17, 84, -26, -26, TarConstants.LF_GNUTYPE_SPARSE, -29, -26, 81, -27, -26, 84, -26, -26, TarConstants.LF_GNUTYPE_SPARSE, -29, -26, 86, -28, -26, 85, -31, -26, 104, -31, -28, -17, 87, -17, -26, 87, -30, -28, -17, 86, -6, 106, -17, -28, -17, 106, -32, -26, 106, -17, -28, -17, 108, 110, -26, 105, -32, -28, -17, 108, 109, -28, -17, 81, -4, -17, 84, -27, -29, 84, -7, -17, 84, -27, -29, TarConstants.LF_GNUTYPE_SPARSE, -6, -17, 105, -29, 86, -25, -17, 85, -8, -17, TarConstants.LF_GNUTYPE_SPARSE, -26, -29, 108, 109, -29, 104, -27, -17, 86, -29, -29, 87, -26, -17, 106, -17, -29, 108, 109, -29, 81, -5, 84, -4, 106, -29, -17, 86, -6, 85, -25, 104, -8, 87, -27, 106, -26, 105, -29, 105, -28};
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(short r5, short r6, byte r7, java.lang.Object[] r8) {
            /*
                int r5 = 118 - r5
                byte[] r0 = kotlin.ActivityC0259zzaz.Companion.MediaBrowserCompatItemReceiver
                int r6 = r6 + 4
                int r1 = 34 - r7
                byte[] r1 = new byte[r1]
                int r7 = 33 - r7
                r2 = 0
                if (r0 != 0) goto L12
                r4 = r7
                r3 = r2
                goto L24
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
                int r3 = r3 + 1
                r4 = r0[r6]
            L24:
                int r4 = -r4
                int r6 = r6 + 1
                int r5 = r5 + r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityC0259zzaz.Companion.a(short, short, byte, java.lang.Object[]):void");
        }
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(IconCompatParcelizer ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $10 + 39;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(IconCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (KeyEvent.getMaxKeyCode() >> 16), 12472 - AndroidCharacter.getMirror('0'), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20, -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.getDeadChar(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1869, View.MeasureSpec.makeMeasureSpec(0, 0) + 10, 1983509525, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
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
        String str = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
        int i6 = $11 + 75;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        while (isstopped.read < cArr.length) {
            cArr3[i3] = cArr[isstopped.read];
            cArr3[1] = cArr[isstopped.read + 1];
            int i4 = $10 + 63;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                int i8 = $11 + 29;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) read) ^ 1193402106669854891L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(AudioAttributesImplBaseParcelizer);
                    objArr2[2] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        char defaultSize = (char) View.getDefaultSize(i3, i3);
                        int iAxisFromString = MotionEvent.axisFromString("") + 1505;
                        int jumpTapTimeout = 21 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                        byte b = (byte) i3;
                        byte b2 = b;
                        String str$$i = $$i(b, b2, b2);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objRemoteActionCompatParcelizer = startForeground.read(defaultSize, iAxisFromString, jumpTapTimeout, 1322448859, false, str$$i, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) write) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(AudioAttributesCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.normalizeMetaState(0), 1503 - ((byte) KeyEvent.getModifierMetaStateMask()), (Process.myTid() >> 22) + 21, 1322448859, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i12 = $11 + 33;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[isstopped.read] = cArr5[0];
            cArr2[isstopped.read + 1] = cArr5[1];
            Object[] objArr4 = {isstopped, isstopped};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) TextUtils.getOffsetAfter("", 0), 9017 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 58 - ExpandableListView.getPackedPositionGroup(0L), -1950993821, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0775  */
    @Override // kotlin.AbstractActivityC0258zzay, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityC0259zzaz.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.AbstractActivityC0258zzay, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 27;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 25, new char[]{38818, 32834, 15271, 57816, 21669, 3163, 40399, 3567, 15996, 15984, 52354, 55037, 57982, 50850, 50220, 12371, 48944, 2264, 6163, 53961, 42780, 5967, 27461, 25032, 7052, 31084}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 34, new char[]{5641, 40263, 20855, 29791, 5738, 46301, 731, 2528, 45520, 19586, 43673, 20887, 22785, 58448, 62029, 47475, 57694, 48133, 6673, 311, 34966, 22006}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 3;
            MediaBrowserCompatItemReceiver = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i6 = MediaBrowserCompatItemReceiver + 51;
            MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 4535), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6054, 42 - View.combineMeasuredStates(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), ImageFormat.getBitsPerPixel(0) + 6031, Drawable.resolveOpacity(0, 0) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00aa  */
    @Override // kotlin.AbstractActivityC0258zzay, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 358
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityC0259zzaz.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x0852  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0893 A[Catch: all -> 0x0948, TryCatch #2 {all -> 0x0948, blocks: (B:134:0x088d, B:136:0x0893, B:137:0x08bc), top: B:272:0x088d, outer: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x09db A[Catch: all -> 0x028f, TryCatch #7 {all -> 0x028f, blocks: (B:207:0x0dc4, B:209:0x0dca, B:210:0x0df0, B:243:0x11cb, B:245:0x11d1, B:246:0x11f9, B:224:0x0f9f, B:226:0x0fc1, B:227:0x1013, B:174:0x09d5, B:176:0x09db, B:177:0x0a0a, B:68:0x03cb, B:70:0x03d1, B:71:0x03f9, B:19:0x00b5, B:21:0x00bb, B:22:0x00e5, B:24:0x0200, B:26:0x0230, B:27:0x0289, B:33:0x029c, B:35:0x02a0, B:39:0x02ac, B:54:0x0379, B:56:0x037f, B:57:0x0380, B:59:0x0382, B:61:0x0389, B:62:0x038a), top: B:281:0x00b5, inners: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0a9d  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0aea  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0b50  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0da6  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0e80  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x0eca  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0f14  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x11ab  */
    /* JADX WARN: Removed duplicated region for block: B:304:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x008b  */
    @Override // kotlin.AbstractActivityC0258zzay, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityC0259zzaz.attachBaseContext(android.content.Context):void");
    }

    static {
        AudioAttributesImplApi21Parcelizer = 1;
        AudioAttributesImplBaseParcelizer();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplApi26Parcelizer + 25;
        AudioAttributesImplApi21Parcelizer = i % 128;
        int i2 = i % 2;
    }

    @getMagicModuleMeta
    public static final Intent AudioAttributesCompatParcelizer(Context context, isCompatible iscompatible) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 59;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Intent intentRemoteActionCompatParcelizer = Companion.RemoteActionCompatParcelizer(context, iscompatible);
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 95;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        return intentRemoteActionCompatParcelizer;
    }

    @Override // kotlin.AbstractActivityC0258zzay, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 85;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        int i5 = MediaBrowserCompatItemReceiver + 81;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        int i6 = i5 % 2;
    }

    static void AudioAttributesImplBaseParcelizer() {
        IconCompatParcelizer = -7948288773710512268L;
        write = (char) 58644;
        AudioAttributesCompatParcelizer = (char) 10124;
        read = (char) 34648;
        AudioAttributesImplBaseParcelizer = (char) 43785;
    }
}
