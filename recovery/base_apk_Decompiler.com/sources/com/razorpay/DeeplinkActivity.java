package com.razorpay;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.buildResumeDownloadsIntent;
import kotlin.notifyDownloadRemoved;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/razorpay/DeeplinkActivity;", "Landroid/app/Activity;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class DeeplinkActivity extends Activity {
    private static short[] read;
    private static final byte[] $$c = {9, -88, -121, TarConstants.LF_FIFO};
    private static final int $$f = 26;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {43, -12, TarConstants.LF_GNUTYPE_LONGNAME, -80, -61, 61, 2, 19, -34, 27, 19, 7, -4, 7, -3, -19, 41, -5, -7, -27, TarConstants.LF_NORMAL, 1, 2, -38, TarConstants.LF_NORMAL, 3, 4, -5, 2, 21, -7, 17, -9, 15, 9, -40, 24, 17, -9, 10, 2, 17, -1, -5, 15, -11, 23, 12, 6, 9, -11, -32, 38, 21, -7, 10, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, -61, 61, 2, 19, -30, 19, 23, -7, 9, -3, -9, 0, 7};
    private static final int $$e = 213;
    private static final byte[] $$a = {11, -82, -98, -28, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 225;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;
    private static int AudioAttributesCompatParcelizer = 2123796470;
    private static int IconCompatParcelizer = -819363112;
    private static int RemoteActionCompatParcelizer = 272275879;
    private static byte[] write = {-118, -104, -116, -2, -9, -84, -84, TarConstants.LF_DIR, -114, TarConstants.LF_GNUTYPE_LONGLINK, -60, -11, -12, -9, -104, -16, -121, 87, -80, 8, -72, 38, 104, 12, 10, 39, 13, TarConstants.LF_FIFO, 104, -48, 38, 12, 56, 86, 15, -56, 112, 37, 12, 37, -39, 104, TarConstants.LF_DIR, 85, 38, -38, 12, 121, 10, -56, 37, 112, 34, -36, 37, 12, 87, 13, 56, 9, -39, 12, 56, 12, 56, 125, 34, -39, 32, -26, 60, -38, -10, -11, -58, 41, 43, -15, 36, 43, -15, -120, 35, -8, 57, -31, 42, 44, 42, -63, -11, 36, -9, 43, -8, 57, -37, -58, 32, 44, -10, -15, -10, 35, -11, 44, -27, -61, 47, -120, 42, -9, -44, -120, 32, -63, -38, 57, 43, -26, -10, -57, 42, -11, -11, -34, -62, 45, -25, 44, 57, 71, -94, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -115, 116, -10, 104, -109, 105, -92, 92, -119, -82, 71, 114, -115, 104, -93, -110, 86, -98, 86, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -98, 86, -109, 93, -91, 115, -117, 116, -91, 90, -82, 70, -81, -116, -94, 117, 90, -94, 71, -94, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -110, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 112, -115, 89, 70, 112, 90, -91, -120, 89, 117, -116, 104, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -108, 70, 105, -110, -76, -85, -82, 68, -122, -5, -78, 113, -20, 112, -106, -93, -77, -66, -86, -1, 107, -66, -92, -25, 87, -77, -95, -6, 110, -72, -122, 65, -87, -77, -92, -89, -122, 65, -93, -2, 127, -106, -121, -77, 68, -104, -79, -72, -81, -71, -21, 112, -92, -69, -66, -85, -78, -66, -94, -88, -83, -78, -6, -107, -70, 108, -88, -79, -107, -95, 124, 70, 125, 125, TarConstants.LF_GNUTYPE_LONGLINK, -116, -107, -123, -98, -30, -31, 67, -99, -119, -111, -38, 73, -81, -15, -109, 4, 24, 9, 20, 19, 0, 43, 126, 15, 10, 27, 31, 9, 7, 57, TarConstants.LF_NORMAL, -58, 58, -60, TarConstants.LF_NORMAL, -40, 58, -58, 61, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73};
    private static long MediaBrowserCompatItemReceiver = -3498762522182953692L;
    private static int MediaBrowserCompatCustomActionResultReceiver = -136981212;
    private static char AudioAttributesImplApi21Parcelizer = 65270;

    private static String $$g(int i, byte b, byte b2) {
        int i2 = 112 - (i * 9);
        int i3 = 4 - (b * 4);
        byte[] bArr = $$c;
        int i4 = b2 * 3;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            int i7 = i3 + (-i5);
            i3++;
            i2 = i7;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i2;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            int i8 = i3;
            i3 = i8 + 1;
            i2 += -bArr[i3];
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 65
            int r9 = r9 + 4
            int r7 = 44 - r7
            byte[] r0 = com.razorpay.DeeplinkActivity.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r8 = r9
            r4 = r2
            goto L28
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            int r9 = r9 + 1
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L28:
            int r9 = r9 + r3
            int r9 = r9 + (-1)
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.DeeplinkActivity.c(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 119 - r8
            byte[] r0 = com.razorpay.DeeplinkActivity.$$d
            int r7 = 83 - r7
            int r6 = r6 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r8
            r4 = r2
            r8 = r7
            goto L28
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L28:
            int r3 = r3 + r7
            int r7 = r3 + (-4)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.DeeplinkActivity.d(int, byte, short, java.lang.Object[]):void");
    }

    private static void b(char[] cArr, char c, char[] cArr2, char[] cArr3, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        int i4 = $11 + 9;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i6 = $10 + 95;
            $11 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) Color.blue(0), 22747 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.indexOf("", "", 0, 0) + 36, 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 1;
                    byte b2 = (byte) (b - 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (31370 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 2721 - ExpandableListView.getPackedPositionGroup(0L), 39 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 1895162189, false, $$g(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 15712 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 64 - ExpandableListView.getPackedPositionType(0L), -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (Process.getGidForName("") + 40977), TextUtils.getOffsetAfter("", 0) + 6122, 28 - ExpandableListView.getPackedPositionChild(0L), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) ((((long) ((int) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ (-3498762522182953692L)))) ^ (((long) (cArr4[iIntValue2] ^ cArr3[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (MediaBrowserCompatItemReceiver ^ (-3498762522182953692L)))) ^ ((long) ((char) (((long) AudioAttributesImplApi21Parcelizer) ^ (-3498762522182953692L)))));
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
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0119  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onCreate(android.os.Bundle r43) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3370
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.DeeplinkActivity.onCreate(android.os.Bundle):void");
    }

    private static void a(byte b, int i, int i2, short s, int i3, Object[] objArr) throws Throwable {
        byte b2;
        long j;
        int length;
        byte[] bArr;
        int i4 = 2;
        int i5 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IconCompatParcelizer)};
            int i6 = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (Process.myPid() >> 22), 24296 - ((byte) KeyEvent.getModifierMetaStateMask()), 11 - TextUtils.indexOf((CharSequence) "", '0'), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            int i7 = (iIntValue == -1 ? 0 : 1) ^ 1;
            if (i7 != 0) {
                int i8 = $11 + 77;
                int i9 = i8 % 128;
                $10 = i9;
                if (i8 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr2 = write;
                if (bArr2 != null) {
                    int i10 = i9 + 69;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    int i11 = 0;
                    while (i11 < length) {
                        int i12 = $11 + 97;
                        $10 = i12 % 128;
                        int i13 = i12 % i4;
                        Object[] objArr3 = new Object[1];
                        objArr3[i6] = Integer.valueOf(bArr2[i11]);
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b3 = (byte) i6;
                            byte b4 = b3;
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) View.MeasureSpec.getSize(i6), View.resolveSize(i6, i6) + 3082, Color.argb(i6, i6, i6, i6) + 128, 2145850993, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                        }
                        bArr[i11] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i11++;
                        i4 = 2;
                        i6 = 0;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    int i14 = $11 + 77;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        byte[] bArr3 = write;
                        Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(AudioAttributesCompatParcelizer)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) KeyEvent.getDeadChar(0, 0), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24297, 12 - (ViewConfiguration.getLongPressTimeout() >> 16), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        b2 = (byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) & 7899112766888837815L);
                        j = ((long) IconCompatParcelizer) + 7899112766888837815L;
                    } else {
                        byte[] bArr4 = write;
                        Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(AudioAttributesCompatParcelizer)};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(559968424);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24297, 12 - TextUtils.getOffsetBefore("", 0), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        b2 = (byte) (((long) bArr4[((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue()]) ^ 7899112766888837815L);
                        j = ((long) IconCompatParcelizer) ^ 7899112766888837815L;
                    }
                    iIntValue = (byte) (b2 + ((int) j));
                } else {
                    iIntValue = (short) (((short) (((long) read[i2 + ((int) (((long) AudioAttributesCompatParcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) IconCompatParcelizer) ^ 7899112766888837815L)));
                }
            }
            if (iIntValue > 0) {
                buildresumedownloadsintent.read = ((i2 + iIntValue) - 2) + ((int) (((long) AudioAttributesCompatParcelizer) ^ 7899112766888837815L)) + i7;
                Object[] objArr6 = {buildresumedownloadsintent, Integer.valueOf(i), Integer.valueOf(RemoteActionCompatParcelizer), sb};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (34133 - ImageFormat.getBitsPerPixel(0)), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13431, (Process.myPid() >> 22) + 21, 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr5 = write;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i15 = 0; i15 < length2; i15++) {
                        bArr6[i15] = (byte) (((long) bArr5[i15]) ^ 7899112766888837815L);
                    }
                    bArr5 = bArr6;
                }
                boolean z = bArr5 != null;
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    int i16 = $11 + 101;
                    $10 = i16 % 128;
                    if (i16 % 2 != 0) {
                        Object obj2 = null;
                        obj2.hashCode();
                        throw null;
                    }
                    if (z) {
                        byte[] bArr7 = write;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr7[r6]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        short[] sArr = read;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r6]) ^ 7899112766888837815L)) + s)) ^ b));
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x00eb  */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 452
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.DeeplinkActivity.onResume():void");
    }

    @Override // android.app.Activity
    protected final void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = AudioAttributesImplApi26Parcelizer + 99;
            AudioAttributesImplBaseParcelizer = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            b(new char[]{6230, 3049, 63011, 58445}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 19954), new char[]{0, 0, 0, 0}, new char[]{23244, 36822, 14717, 47213, 39935, 15837, 5731, 57216, 57016, 51425, 61095, 5874, 9213, 51721, 34963, 60078, 21151, 57070, 45405, 19408, 23488, 61285, 30976, 48246, 46421, 5563}, TextUtils.indexOf("", ""), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(new char[]{17501, 46045, 40537, 14983}, (char) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(com.marrow.R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 34717), new char[]{0, 0, 0, 0}, new char[]{36372, 65150, 26823, 63972, 24280, 57734, 59858, 50955, 25913, 35503, 36570, 34231, 64074, 2043, 33621, 5082, 60754, 5636}, ExpandableListView.getPackedPositionType(0L), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i4 = AudioAttributesImplApi26Parcelizer + 77;
                AudioAttributesImplBaseParcelizer = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (baseContext != null) {
            int i6 = AudioAttributesImplApi26Parcelizer + 97;
            AudioAttributesImplBaseParcelizer = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (Color.argb(0, 0, 0, 0) + 4535), 6054 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 42 - TextUtils.indexOf("", "", 0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (KeyEvent.getMaxKeyCode() >> 16), 6030 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 24 - KeyEvent.normalizeMetaState(0), -861814097, false, "read", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0166  */
    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 7434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.razorpay.DeeplinkActivity.attachBaseContext(android.content.Context):void");
    }

    @Override // android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 115;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
        int i4 = AudioAttributesImplBaseParcelizer + 103;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
    }
}
