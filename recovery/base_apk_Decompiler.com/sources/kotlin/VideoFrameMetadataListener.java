package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
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
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class VideoFrameMetadataListener extends addObserverForBackInvoker implements SubjectStat {
    private static short[] RatingCompat;
    private volatile isHighlighted AudioAttributesCompatParcelizer;
    private final Object IconCompatParcelizer;
    private boolean read;
    private getSubjectStat write;
    private static final byte[] $$l = {64, TarConstants.LF_GNUTYPE_LONGLINK, 61, -128};
    private static final int $$m = 219;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {84, -83, -23, -21, 64, -77, -1, 21, -13, 4, 8, -12, 14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 64, -58, 1, -16, 31, -28, -6, 18, -12, 41, -52, 14, -1, 0, -14, 12, 0, 31, -50, 2, 16, -20, 10, -7, 0, 24, -31, 78, -30, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4};
    private static final int $$k = 56;
    private static final byte[] $$d = {18, -127, -77, -105, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 50;
    private static int MediaBrowserCompatSearchResultReceiver = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static long RemoteActionCompatParcelizer = -3498762522182953692L;
    private static int MediaBrowserCompatCustomActionResultReceiver = -136981212;
    private static char AudioAttributesImplBaseParcelizer = 4021;
    private static int AudioAttributesImplApi21Parcelizer = -1319012713;
    private static int AudioAttributesImplApi26Parcelizer = -819363149;
    private static int MediaBrowserCompatItemReceiver = 396535254;
    private static byte[] MediaMetadataCompat = {10, 97, 41, 121, -112, -103, -86, -116, -111, -107, -110, -109, -97, -32, 66, -103, -122, -84, -97, -110, -115, TarConstants.LF_GNUTYPE_LONGLINK, -99, 73, -73, 78, -76, 123, -99, 101, TarConstants.LF_GNUTYPE_LONGLINK, 73, 77, -101, -74, 125, -123, TarConstants.LF_GNUTYPE_LONGNAME, 73, TarConstants.LF_GNUTYPE_LONGNAME, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -99, 124, -100, TarConstants.LF_GNUTYPE_LONGLINK, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 73, -104, -73, 125, TarConstants.LF_GNUTYPE_LONGNAME, -123, 79, 121, TarConstants.LF_GNUTYPE_LONGNAME, 73, -98, -76, 77, 72, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 73, 77, 73, 77, -124, 79, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 124, 34, 64, 46, 114, 113, 66, 125, 127, 117, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 127, 117, 116, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 36, 77, 37, 126, 112, 126, 69, 113, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 115, 127, 36, 77, 47, 66, 124, 112, 114, 117, 114, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 113, 112, 33, 71, 123, 116, 126, 115, 40, 116, 124, 69, 46, 77, 127, 34, 114, 67, 126, 113, 113, 42, 70, 121, 35, 112, 77, 58, 61, 59, -24, 15, -23, 11, -18, 12, 63, 39, -20, TarConstants.LF_LINK, 58, 13, -24, 11, 62, -19, 9, -31, 9, 59, -31, 9, -18, 56, TarConstants.LF_NORMAL, 14, -42, 15, TarConstants.LF_NORMAL, 37, TarConstants.LF_LINK, 57, TarConstants.LF_SYMLINK, -41, 61, 0, 37, 61, 58, 61, 59, -19, 59, 3, -24, 60, 57, 3, 37, TarConstants.LF_NORMAL, -21, 60, 0, -41, 11, 59, -17, 57, 12, -19, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 65, 78, 104, -74, -111, 90, 27, -128, 28, 70, 73, 89, 94, 66, -99, 1, 94, 72, -107, 5, 89, TarConstants.LF_GNUTYPE_LONGLINK, -110, 14, 84, -74, 107, 67, 89, 72, 85, -74, 107, 73, -98, 29, 70, -75, 89, 104, -76, 91, 84, 77, TarConstants.LF_GNUTYPE_SPARSE, -127, 28, 72, 81, 94, 65, 90, 94, 74, 68, 79, 90, -110, 71, 82, 0, 68, 91, 71, TarConstants.LF_GNUTYPE_LONGLINK, -9, -94, -57, -68, -12, -119, -39, -14, -90, -35, -90, -50, -118, -119, -89, -34, -5, -127, -12, -119, -11, -16, -80, -39, -91, -39, -4, -117, -9, -120, -117, -120, -94, -58, -120, -18, -14, -29, -51, -112, -18, -11, -27, -4, -64, -63, -69, -30, 37, -84, -5, -4, -7, -24, -16, -23, 4, 8, 7, 116, 113, 0, 121, 30, 13, 26, 9, 125, 7, 117, -73, -73, -73, -73, -73, -73, -73, -73, -73};

    private static String $$n(int i, byte b, byte b2) {
        int i2 = (b * 9) + 103;
        byte[] bArr = $$l;
        int i3 = i * 3;
        int i4 = 3 - (b2 * 4);
        byte[] bArr2 = new byte[1 - i3];
        int i5 = 0 - i3;
        int i6 = -1;
        if (bArr == null) {
            i2 += -i4;
            i4 = i4;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            int i8 = i4 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i2 += -bArr[i8];
            i4 = i8;
            i6 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.VideoFrameMetadataListener.$$d
            int r7 = 190 - r7
            int r8 = r8 + 65
            int r1 = r6 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2a
        L13:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            int r8 = r8 + 1
            r3 = r0[r8]
        L2a:
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.VideoFrameMetadataListener.g(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.VideoFrameMetadataListener.$$j
            int r8 = r8 + 4
            int r6 = r6 + 82
            int r1 = r7 + 4
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r7
            r6 = r8
            r3 = r2
            goto L28
        L13:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r4 = r0[r6]
            int r3 = r3 + 1
        L28:
            int r4 = -r4
            int r8 = r8 + r4
            int r6 = r6 + 1
            int r8 = r8 + (-1)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.VideoFrameMetadataListener.h(int, byte, byte, java.lang.Object[]):void");
    }

    VideoFrameMetadataListener() {
        this.IconCompatParcelizer = new Object();
        this.read = false;
        AudioAttributesImplBaseParcelizer();
    }

    VideoFrameMetadataListener(byte b) {
        super(R.layout.activity_bookmark_landing);
        this.IconCompatParcelizer = new Object();
        this.read = false;
        AudioAttributesImplBaseParcelizer();
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.VideoFrameMetadataListener.5
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                VideoFrameMetadataListener.this.AudioAttributesImplApi26Parcelizer();
            }
        });
        int i2 = MediaBrowserCompatMediaItem + 45;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 91;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getSubjectStat getsubjectstatWrite = AudioAttributesImplApi21Parcelizer().write();
        this.write = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            this.write.IconCompatParcelizer(getDefaultViewModelCreationExtras());
        }
        int i4 = MediaBrowserCompatMediaItem + 13;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 34 / 0;
        }
    }

    private static void e(char[] cArr, int i, char[] cArr2, char[] cArr3, char c, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
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
        int i5 = $10 + 73;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i7 = $10 + 53;
            $11 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) View.resolveSizeAndState(0, 0, 0), 22748 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 36, 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (31369 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)), 2721 - KeyEvent.normalizeMetaState(0), (ViewConfiguration.getScrollBarSize() >> 8) + 38, 1895162189, false, $$n(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (Process.myTid() >> 22) + 15713, ExpandableListView.getPackedPositionChild(0L) + 65, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    i2 = 2;
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (40976 - TextUtils.getOffsetAfter("", 0)), 6122 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 28, -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (RemoteActionCompatParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) AudioAttributesImplBaseParcelizer) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                i3 = i2;
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

    private static void f(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(AudioAttributesImplApi26Parcelizer)};
            int i5 = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - Process.getGidForName("")), 24297 - TextUtils.getOffsetBefore("", 0), TextUtils.lastIndexOf("", '0') + 13, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            int i6 = (iIntValue == -1 ? 0 : 1) ^ 1;
            if (i6 != 0) {
                int i7 = $10 + 63;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                byte[] bArr = MediaMetadataCompat;
                long j = 0;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        Object[] objArr3 = new Object[1];
                        objArr3[i5] = Integer.valueOf(bArr[i9]);
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b2 = (byte) i5;
                            byte b3 = (byte) (b2 + 1);
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) View.resolveSize(i5, i5), 3082 - (ExpandableListView.getPackedPositionForGroup(i5) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(i5) == j ? 0 : -1)), Color.green(i5) + 128, 2145850993, false, $$n(b2, b3, (byte) (b3 - 1)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i9++;
                        i5 = 0;
                        j = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = MediaMetadataCompat;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(AudioAttributesImplApi21Parcelizer)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), KeyEvent.normalizeMetaState(0) + 24297, TextUtils.indexOf((CharSequence) "", '0', 0) + 13, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesImplApi26Parcelizer) ^ 7899112766888837815L)));
                        int i10 = $10 + 55;
                        $11 = i10 % 128;
                        if (i10 % 2 == 0) {
                            int i11 = 5 / 4;
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    iIntValue = (short) (((short) (((long) RatingCompat[i + ((int) (((long) AudioAttributesImplApi21Parcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesImplApi26Parcelizer) ^ 7899112766888837815L)));
                }
            }
            if (iIntValue > 0) {
                buildresumedownloadsintent.read = ((i + iIntValue) - 2) + ((int) (((long) AudioAttributesImplApi21Parcelizer) ^ 7899112766888837815L)) + i6;
                Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i3), Integer.valueOf(MediaBrowserCompatItemReceiver), sb};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (34134 - (KeyEvent.getMaxKeyCode() >> 16)), 13432 - Color.alpha(0), View.resolveSize(0, 0) + 21, 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr4 = MediaMetadataCompat;
                if (bArr4 != null) {
                    int i12 = $11 + 97;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr5[i14] = (byte) (((long) bArr4[i14]) ^ 7899112766888837815L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i15 = $11 + 59;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    z = true;
                } else {
                    z = false;
                }
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    int i17 = $11 + 85;
                    $10 = i17 % 128;
                    if (i17 % 2 != 0) {
                        Object obj = null;
                        obj.hashCode();
                        throw null;
                    }
                    if (!z) {
                        short[] sArr = RatingCompat;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                        int i18 = $10 + 109;
                        $11 = i18 % 128;
                        int i19 = i18 % 2;
                    } else {
                        byte[] bArr6 = MediaMetadataCompat;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r6]) ^ 7899112766888837815L)) + s)) ^ b));
                    }
                    sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
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

    /* JADX WARN: Removed duplicated region for block: B:17:0x0263  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r37) {
        /*
            Method dump skipped, instruction units count: 3186
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.VideoFrameMetadataListener.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 41;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            getSubjectStat getsubjectstat = this.write;
            if (getsubjectstat != null) {
                getsubjectstat.AudioAttributesCompatParcelizer();
                int i3 = MediaBrowserCompatSearchResultReceiver + 91;
                MediaBrowserCompatMediaItem = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        super.onDestroy();
        throw null;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 99;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (i3 == 0) {
            return ishighlightedAudioAttributesImplApi21Parcelizer.af_();
        }
        ishighlightedAudioAttributesImplApi21Parcelizer.af_();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatMediaItem + 47;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted AudioAttributesImplApi21Parcelizer() {
        if (this.AudioAttributesCompatParcelizer == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    this.AudioAttributesCompatParcelizer = MediaBrowserCompatItemReceiver();
                }
            }
        }
        return this.AudioAttributesCompatParcelizer;
    }

    protected final void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 63;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        if (!this.read) {
            this.read = true;
        }
        int i4 = MediaBrowserCompatMediaItem + 83;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 123;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        if (i3 == 0) {
            int i4 = 27 / 0;
        }
        return RemoteActionCompatParcelizer2;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 87;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            e(new char[]{0, 0, 0, 0}, ViewConfiguration.getJumpTapTimeout() >> 16, new char[]{50428, 5690, 52323, 18887, 39311, 27138, 10322, 23135, 51724, 27856, 46608, 60120, 24426, 44345, 42468, 32810, 46261, 59649, 30404, 12447, 31330, 46185, 39201, 8049, 52945, 60625}, new char[]{54187, 50501, 47015, 58336}, (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 57527), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f((short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 75), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 2118710301, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 95, Color.blue(0) + 661969154, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = (((baseContext instanceof ContextWrapper) ^ true) || ((ContextWrapper) baseContext).getBaseContext() != null) ? baseContext.getApplicationContext() : null;
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 6054 - (KeyEvent.getMaxKeyCode() >> 16), 43 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (MotionEvent.axisFromString("") + 1), ((byte) KeyEvent.getModifierMetaStateMask()) + 6031, 24 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i4 = MediaBrowserCompatSearchResultReceiver + 73;
                MediaBrowserCompatMediaItem = i4 % 128;
                int i5 = i4 % 2;
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

    /* JADX WARN: Removed duplicated region for block: B:15:0x0127  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 504
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.VideoFrameMetadataListener.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0d3a A[Catch: all -> 0x0e88, TryCatch #5 {all -> 0x0e88, blocks: (B:85:0x0842, B:87:0x0848, B:88:0x088f, B:92:0x08a9, B:94:0x08af, B:95:0x08fc, B:118:0x0d30, B:119:0x0d34, B:121:0x0d3a, B:123:0x0d51, B:126:0x0d5e, B:129:0x0d6b, B:136:0x0dd1, B:142:0x0e62, B:144:0x0e68, B:145:0x0e69, B:147:0x0e6b, B:149:0x0e72, B:150:0x0e73, B:96:0x0907, B:108:0x0aae, B:110:0x0ab4, B:111:0x0afd, B:113:0x0c85, B:114:0x0ccc, B:116:0x0ce1, B:117:0x0d2a, B:152:0x0e75, B:154:0x0e7c, B:155:0x0e7d, B:157:0x0e7f, B:159:0x0e86, B:160:0x0e87, B:138:0x0de0, B:132:0x0d9a, B:134:0x0da0, B:135:0x0dca, B:103:0x0a25, B:105:0x0a3a, B:106:0x0aa2, B:98:0x09d7, B:100:0x09ec, B:101:0x0a1e), top: B:271:0x0842, outer: #3, inners: #0, #6, #12, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0fdf  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x1031  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x1087  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x1408  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x14f7  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x154b  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x15a6  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x18e4  */
    /* JADX WARN: Removed duplicated region for block: B:299:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x05ca  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0608 A[Catch: all -> 0x06c6, TRY_LEAVE, TryCatch #4 {all -> 0x06c6, blocks: (B:45:0x05f3, B:47:0x0608), top: B:269:0x05f3 }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0635  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x064a A[Catch: all -> 0x06ba, TryCatch #14 {all -> 0x06ba, blocks: (B:52:0x063d, B:54:0x064a, B:55:0x06b2), top: B:287:0x063d, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x077b A[Catch: all -> 0x05c6, TryCatch #3 {all -> 0x05c6, blocks: (B:201:0x142d, B:203:0x1433, B:204:0x1461, B:237:0x1906, B:239:0x190c, B:240:0x1935, B:218:0x164f, B:220:0x1672, B:221:0x16c1, B:167:0x0f06, B:169:0x0f0c, B:170:0x0f3a, B:78:0x0775, B:80:0x077b, B:81:0x07a5, B:17:0x0171, B:19:0x0177, B:21:0x01a2, B:23:0x052b, B:25:0x055d, B:26:0x05b6, B:85:0x0842, B:87:0x0848, B:88:0x088f, B:92:0x08a9, B:94:0x08af, B:95:0x08fc, B:118:0x0d30, B:119:0x0d34, B:121:0x0d3a, B:123:0x0d51, B:126:0x0d5e, B:129:0x0d6b, B:136:0x0dd1, B:142:0x0e62, B:144:0x0e68, B:145:0x0e69, B:147:0x0e6b, B:149:0x0e72, B:150:0x0e73, B:96:0x0907, B:108:0x0aae, B:110:0x0ab4, B:111:0x0afd, B:113:0x0c85, B:114:0x0ccc, B:116:0x0ce1, B:117:0x0d2a, B:152:0x0e75, B:154:0x0e7c, B:155:0x0e7d, B:157:0x0e7f, B:159:0x0e86, B:160:0x0e87), top: B:268:0x0171, inners: #5 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0848 A[Catch: all -> 0x0e88, TryCatch #5 {all -> 0x0e88, blocks: (B:85:0x0842, B:87:0x0848, B:88:0x088f, B:92:0x08a9, B:94:0x08af, B:95:0x08fc, B:118:0x0d30, B:119:0x0d34, B:121:0x0d3a, B:123:0x0d51, B:126:0x0d5e, B:129:0x0d6b, B:136:0x0dd1, B:142:0x0e62, B:144:0x0e68, B:145:0x0e69, B:147:0x0e6b, B:149:0x0e72, B:150:0x0e73, B:96:0x0907, B:108:0x0aae, B:110:0x0ab4, B:111:0x0afd, B:113:0x0c85, B:114:0x0ccc, B:116:0x0ce1, B:117:0x0d2a, B:152:0x0e75, B:154:0x0e7c, B:155:0x0e7d, B:157:0x0e7f, B:159:0x0e86, B:160:0x0e87, B:138:0x0de0, B:132:0x0d9a, B:134:0x0da0, B:135:0x0dca, B:103:0x0a25, B:105:0x0a3a, B:106:0x0aa2, B:98:0x09d7, B:100:0x09ec, B:101:0x0a1e), top: B:271:0x0842, outer: #3, inners: #0, #6, #12, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x089c  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0907 A[Catch: all -> 0x0e88, TRY_LEAVE, TryCatch #5 {all -> 0x0e88, blocks: (B:85:0x0842, B:87:0x0848, B:88:0x088f, B:92:0x08a9, B:94:0x08af, B:95:0x08fc, B:118:0x0d30, B:119:0x0d34, B:121:0x0d3a, B:123:0x0d51, B:126:0x0d5e, B:129:0x0d6b, B:136:0x0dd1, B:142:0x0e62, B:144:0x0e68, B:145:0x0e69, B:147:0x0e6b, B:149:0x0e72, B:150:0x0e73, B:96:0x0907, B:108:0x0aae, B:110:0x0ab4, B:111:0x0afd, B:113:0x0c85, B:114:0x0ccc, B:116:0x0ce1, B:117:0x0d2a, B:152:0x0e75, B:154:0x0e7c, B:155:0x0e7d, B:157:0x0e7f, B:159:0x0e86, B:160:0x0e87, B:138:0x0de0, B:132:0x0d9a, B:134:0x0da0, B:135:0x0dca, B:103:0x0a25, B:105:0x0a3a, B:106:0x0aa2, B:98:0x09d7, B:100:0x09ec, B:101:0x0a1e), top: B:271:0x0842, outer: #3, inners: #0, #6, #12, #16 }] */
    /* JADX WARN: Type inference failed for: r9v2 */
    /* JADX WARN: Type inference failed for: r9v42 */
    /* JADX WARN: Type inference failed for: r9v43 */
    /* JADX WARN: Type inference failed for: r9v44 */
    /* JADX WARN: Type inference failed for: r9v45, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v46, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v47 */
    /* JADX WARN: Type inference failed for: r9v49 */
    /* JADX WARN: Type inference failed for: r9v50, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v52 */
    /* JADX WARN: Type inference failed for: r9v53 */
    /* JADX WARN: Type inference failed for: r9v54 */
    /* JADX WARN: Type inference failed for: r9v55 */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r37) {
        /*
            Method dump skipped, instruction units count: 6976
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.VideoFrameMetadataListener.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 123;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
