package kotlin;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.di.app.data.SchedulerModule;
import java.lang.reflect.Method;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class RtpDataLoadable implements getSubmittedOn<getIds> {
    private static short[] AudioAttributesImplApi26Parcelizer;
    private final SchedulerModule read;
    private static final byte[] $$c = {TarConstants.LF_FIFO, -78, 96, -9};
    private static final int $$d = 213;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$a = {14, -40, -35, 110, 8, -1, -8};
    private static final int $$b = 166;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static int write = 68066197;
    private static int AudioAttributesCompatParcelizer = -819363176;
    private static int RemoteActionCompatParcelizer = -622566021;
    private static byte[] IconCompatParcelizer = {TarConstants.LF_GNUTYPE_LONGNAME, 70, -90, 77, 68, -73, TarConstants.LF_GNUTYPE_LONGNAME, -101, 102, -70, 77, -73, 89, -72, 74, -106, 102, -79, -118, -37, -123, -41, -120, -38, -90, TarConstants.LF_CONTIG, -104, -82, 60, -34, -126, -46, -128, -115, -17, 70, -27, 79, -109, -6, 13, -120, TarConstants.LF_CHR, -66, 77, 78, 79, -14, 90, -1, -1, -118, -118, 29, 46, -121, 17, -10, -13, 57, -116, 47, -102, -8, TarConstants.LF_BLK, 35, -9, -10, -118, 29, 46, -73, TarConstants.LF_BLK, 58, -103, 47, -117, -25, -55, -11, 37, 32, -1, 34, -32, 96, 34, -10, 72, 1, 1, 115, 117, -40, -51, 127, -59, -52, 8, -64, -64, 99, 116, -60, 59, 15, -53, 123, 114, -63, 8, TarConstants.LF_SYMLINK, -78, 8, -52, -118, 2, 122, 113, -64, -115, 72, -99, -75, -74, -94, -81, -85, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -73, -30, 101, -74, -94, -81, -85, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -73, -30, 101, -69, -100, 74, -82, -14, 108, -96, -80, 73, -70, -77, -119, 9, -77, -81, -31, -73, -73, -73, -73, -73, -73, -73, -73};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$e(short r6, int r7, byte r8) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r6 = r6 * 4
            int r6 = 112 - r6
            byte[] r0 = kotlin.RtpDataLoadable.$$c
            int r8 = r8 * 4
            int r1 = r8 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L29:
            int r7 = -r7
            int r6 = r6 + r7
            int r7 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.RtpDataLoadable.$$e(short, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x0033). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(byte r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.RtpDataLoadable.$$a
            int r6 = r6 * 2
            int r6 = 3 - r6
            int r7 = r7 * 4
            int r7 = 114 - r7
            int r8 = r8 * 3
            int r1 = 4 - r8
            byte[] r1 = new byte[r1]
            int r8 = 3 - r8
            r2 = 0
            if (r0 != 0) goto L18
            r3 = r6
            r4 = r2
            goto L33
        L18:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1c:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L2b:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L33:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-5)
            r7 = r3
            r3 = r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.RtpDataLoadable.b(byte, byte, int, java.lang.Object[]):void");
    }

    @Override // kotlin.setDescriptionList
    public final /* synthetic */ Object get() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 113;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        getIds getidsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        int i5 = AudioAttributesImplApi21Parcelizer + 1;
        MediaBrowserCompatItemReceiver = i5 % 128;
        int i6 = i5 % 2;
        return getidsRemoteActionCompatParcelizer;
    }

    private getIds RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 111;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        SchedulerModule schedulerModule = this.read;
        if (i3 == 0) {
            read(schedulerModule);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        getIds getids = read(schedulerModule);
        int i4 = MediaBrowserCompatItemReceiver + 125;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 87 / 0;
        }
        return getids;
    }

    public static getIds read(SchedulerModule schedulerModule) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 23;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object objWrite = setPossibleScore.write(schedulerModule.RemoteActionCompatParcelizer());
        if (i3 != 0) {
            return (getIds) objWrite;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(byte b, int i, int i2, short s, int i3, Object[] objArr) throws Throwable {
        long j;
        boolean z;
        int i4 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(AudioAttributesCompatParcelizer)};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 24297 - TextUtils.getOffsetAfter("", 0), Color.green(0) + 12, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            float f = BitmapDescriptorFactory.HUE_RED;
            if (i5 == 1) {
                byte[] bArr = IconCompatParcelizer;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = 0;
                    while (i6 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i6])};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (PointF.length(f, f) > f ? 1 : (PointF.length(f, f) == f ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 3082, 127 - TextUtils.lastIndexOf("", '0', 0), 2145850993, false, $$e(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i6] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i6++;
                        f = BitmapDescriptorFactory.HUE_RED;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = IconCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(write)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), KeyEvent.normalizeMetaState(0) + 24297, 12 - KeyEvent.getDeadChar(0, 0), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesCompatParcelizer) ^ 7899112766888837815L)));
                    int i7 = $11 + 113;
                    $10 = i7 % 128;
                    int i8 = i7 % 2;
                    j = 7899112766888837815L;
                } else {
                    j = 7899112766888837815L;
                    iIntValue = (short) (((short) (((long) AudioAttributesImplApi26Parcelizer[i2 + ((int) (((long) write) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesCompatParcelizer) ^ 7899112766888837815L)));
                }
            } else {
                j = 7899112766888837815L;
            }
            if (iIntValue > 0) {
                buildresumedownloadsintent.read = ((i2 + iIntValue) - 2) + ((int) (((long) write) ^ j)) + i5;
                try {
                    Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i), Integer.valueOf(RemoteActionCompatParcelizer), sb};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (34134 - Color.argb(0, 0, 0, 0)), (ViewConfiguration.getPressedStateDuration() >> 16) + 13432, 22 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    byte[] bArr4 = IconCompatParcelizer;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i9 = 0; i9 < length2; i9++) {
                            bArr5[i9] = (byte) (((long) bArr4[i9]) ^ 7899112766888837815L);
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i10 = $11 + 125;
                        $10 = i10 % 128;
                        int i11 = i10 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                    while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                        if (z) {
                            byte[] bArr6 = IconCompatParcelizer;
                            buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                            buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r7]) ^ 7899112766888837815L)) + s)) ^ b));
                            int i12 = $10 + 7;
                            $11 = i12 % 128;
                            int i13 = i12 % 2;
                        } else {
                            short[] sArr = AudioAttributesImplApi26Parcelizer;
                            buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                            buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r7]) ^ 7899112766888837815L)) + s)) ^ b));
                        }
                        sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                        buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                        buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                        int i14 = $11 + 1;
                        $10 = i14 % 128;
                        int i15 = i14 % 2;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] write(int r31, int r32) {
        /*
            Method dump skipped, instruction units count: 3163
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.RtpDataLoadable.write(int, int):java.lang.Object[]");
    }
}
