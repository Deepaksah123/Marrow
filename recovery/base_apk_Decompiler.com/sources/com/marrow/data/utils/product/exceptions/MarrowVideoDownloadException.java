package com.marrow.data.utils.product.exceptions;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.IOException;
import java.lang.reflect.Method;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.buildResumeDownloadsIntent;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\n\b\u0016\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\n\u001a\u0004\b\u000e\u0010\f"}, d2 = {"Lcom/marrow/data/utils/product/exceptions/MarrowVideoDownloadException;", "Ljava/io/IOException;", "", "p0", "p1", "", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V", "errorCode", "Ljava/lang/String;", "getErrorCode", "()Ljava/lang/String;", "errorMsg", "getErrorMsg", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class MarrowVideoDownloadException extends IOException {
    private static final byte[] $$a = {98, 126, 62, 90};
    private static final int $$b = 25;
    private static int AudioAttributesCompatParcelizer = 0;
    private static short[] AudioAttributesImplApi21Parcelizer = null;
    private static final int AudioAttributesImplBaseParcelizer;
    public static final String DIRECTORY_NOT_CREATED = "MVD-ERROR-013";
    public static final String EXTRACTION_MANAGER_VALIDATE_SYNC = "MVD-ERROR-011";
    public static final String FILE_CORRUPTED_ON_DOWNLOAD = "MVD-ERROR-012";
    public static final String FILE_NOT_CREATED = "MVD-ERROR-014";
    public static final String FRAGMENT_COUNT_MISMATCH = "MVD-ERROR-001";
    public static final String FRAGMENT_MISSING_ON_EXTRACTION = "MVD-ERROR-002";
    public static final String INVALIDATED_AUDIO_POST_DOWNLOAD = "MVD-ERROR-009";
    public static final String INVALIDATED_VIDEO_POST_DOWNLOAD = "MVD-ERROR-008";
    private static int IconCompatParcelizer = 0;
    public static final String MULTI_THREAD_RUNNING_ON_DOWNLOADING = "MVD-ERROR-003";
    private static byte[] MediaBrowserCompatCustomActionResultReceiver = null;
    private static final byte[] MediaBrowserCompatItemReceiver;
    public static final String NULL_AUDIO_META_DATA = "MVD-ERROR-007";
    public static final String NULL_LESSON_ID_ON_DOWNLOADING = "MVD-ERROR-004";
    public static final String NULL_VIDEO_META_DATA = "MVD-ERROR-006";
    public static final String NULL_ZIP_DATA_ON_EXTRACTION = "MVD-ERROR-005";
    private static int RemoteActionCompatParcelizer = 0;
    public static final String UNKNOWN_TYPE_POST_DOWNLOAD = "MVD-ERROR-010";
    private static int read;
    private static int write;
    private final String errorCode;
    private final String errorMsg;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(short r6, int r7, byte r8) {
        /*
            byte[] r0 = com.marrow.data.utils.product.exceptions.MarrowVideoDownloadException.$$a
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r6 = r6 * 2
            int r6 = 112 - r6
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r6 = r8
            r5 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r7]
        L27:
            int r7 = r7 + 1
            int r6 = r6 + r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.data.utils.product.exceptions.MarrowVideoDownloadException.$$c(short, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:75:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x05e2  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x05ed  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getErrorCode() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1600
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.data.utils.product.exceptions.MarrowVideoDownloadException.getErrorCode():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:74:0x0525 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0531  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0564  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String getErrorMsg() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.data.utils.product.exceptions.MarrowVideoDownloadException.getErrorMsg():java.lang.String");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MarrowVideoDownloadException(String str, String str2, Throwable th) {
        super(str2, th);
        toMagicModuleMetaRepoModel.write(str, "");
        this.errorCode = str;
        this.errorMsg = str2;
    }

    public /* synthetic */ MarrowVideoDownloadException(String str, String str2, Throwable th, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : th);
    }

    private static void b(int i, int i2, int i3, byte b, short s, Object[] objArr) throws Throwable {
        long j;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(write)};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            long j2 = 0;
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24297, 11 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
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
                            char maxKeyCode = (char) (KeyEvent.getMaxKeyCode() >> 16);
                            int gidForName = Process.getGidForName("") + 3083;
                            int i6 = (SystemClock.uptimeMillis() > j2 ? 1 : (SystemClock.uptimeMillis() == j2 ? 0 : -1)) + 127;
                            byte b2 = (byte) 0;
                            byte b3 = b2;
                            objRemoteActionCompatParcelizer2 = startForeground.read(maxKeyCode, gidForName, i6, 2145850993, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
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
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 24297 - (ViewConfiguration.getDoubleTapTimeout() >> 16), 12 - (ViewConfiguration.getEdgeSlop() >> 16), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) write) ^ 7899112766888837815L)));
                    j = 7899112766888837815L;
                } else {
                    j = 7899112766888837815L;
                    iIntValue = (short) (((short) (((long) AudioAttributesImplApi21Parcelizer[i + ((int) (((long) read) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) write) ^ 7899112766888837815L)));
                }
            }
            if (iIntValue > 0) {
                buildresumedownloadsintent.read = ((i + iIntValue) - 2) + ((int) (((long) read) ^ j)) + i4;
                Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i3), Integer.valueOf(AudioAttributesCompatParcelizer), sb};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (34134 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13431, 21 - Color.green(0), 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
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
                        short[] sArr = AudioAttributesImplApi21Parcelizer;
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

    static {
        byte[] bArr = new byte[623];
        System.arraycopy("\u0000µÓ³\u000e÷\u000fþûüËIôý\u0013¸)\u0014ý\u0013Í-\u0000ù\u0004ÿ\u000fþð\u0014ö\u0007\u0000ÿ\u0010à\u0011\u0010þþ\u0001× \u0012â\u0017\u0012ì\u000e÷\u000fþûüËGò\u0014ý»'\u0012\u0014ýâ ö\u0004\b\u0006÷\u0002\u0014Ø\u0018ø\u0016ìÎ?ö\u000eúÈ\u0016&ú\u0012â\u0013\r\u0005ñ\nö\u0003ÿ\u0010à\u0011\u0010þþ\u0001× \u0012Õ\u001c\u0004\u0002à2þð\u0014ö\u0007\u0000\u000e÷\u000fþûüËGò\bú\fù\b\u0000\f¶6\u0002\nõÎ\u0016\"\nõã#\b\u0001á$õÿ\u0014ö\u0007\u0000\r\u0000\tð\u000e\u0003Þ%í\u0012\u0003à\u0013ÿò\u001cÖ\"ÿâ\"\u0003\fô\u0001\u000f\u000e÷\u000fþûüËB\u0005¼&'û\u0002ò\t×*\u0004õ\t\bö\u0010\u0004ó\u0000ï\u0014ý\f\tö\u0005ùÿ\u0010á\u001c\u0007ï\u0006ì\u001a\u0004\u0002\u000e÷\u000fþûüË:\fð\u0010ù\u0002û\u0011¼\u0016-þ\u0004\u0004\u000b\nñ\u000e÷\u000fþûüË:\fð\u0010ù\u0002û\u0011¼\u001c%õ\u0007ÿâ*\u0004üõ\u0014ÿ\u0010Ï(\f\u0000Þ\u0016\u000eß\u001a\u0010î\b\u000e÷\u000fþûüËJóü\u0004ÿ\u0010»\u00184ùò\u000e÷þ\u0002\u000búè\u001e\u000b\u0002ã\u0014ý\u0013ÿ\u0010Ý\u0012\u0003\tû\u0000í \u0005÷\fö\u0007\u0000Ù*\u0004Ö,þ\u0007üø\u0016ìÎ?ö\u000eúÈ&\"ÿø\u0006úþýþ\fø\u0016ìÎ?ö\u000eúÈ\u001c&\u0007ò\u0003ÿ\u000eì\f\nñë\u0018\u0006\u0007ã\f\f\nñø\u0016ìÎ?ö\u000eúÈ\u00184ì\u0003\f\u0005ö\u0007\u0000\u000e÷\u000fþûüËB\u0005¼##þõ\u0003\u000f\u0001\rØ\u001aüÿ\u0010Ô&\u0004ô\u0000\fÖ#\u0012ö\u0007\u0000Þ\u001b\u0015Ü\u0016\u0005ù\u000b\u0007\u0000ÿ\u0010Ú\u001d\u0006ü\u0005\tùÚ'þ\u0006úð\u0010\b\u0004õ\u0007\f\u0006\u000e÷\u000fþûüË:\fð\u0010ù\u0002û\u0011¼7\u000fð\u0017ë\u0002\u000búÊ\u0017/ð\u0017ë\u0002\u000búô\u000fýþ\u000bðë\"ò\u0003\u0007\f\u0006\u000e÷\u000fþûüËIôý\u0013¸\u001e\u001b\u0015Í2ð\n\u0007\u0002\u0004üõ\fþ\u0012ìé\u0019\u0010îó\"î\u0014òÿ\u0010á\u001fø\u0005\u0001ù\u0000é\u001a\nú\u000eõ\u000e÷\u000fþûüËH\u0000ö\u0004Ã'&øö\u0000ó\f\f\nñ\rÿ\u0004ýú\u0014Ý\u001cØ-ð\u0003\u0012ö\u0007\u0000\fô\u0001\n".getBytes(CharsetNames.ISO_8859_1), 0, bArr, 0, 623);
        MediaBrowserCompatItemReceiver = bArr;
        AudioAttributesImplBaseParcelizer = 239;
        write();
        RemoteActionCompatParcelizer = 0;
        IconCompatParcelizer = 1;
        INSTANCE = new Companion(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MarrowVideoDownloadException(String str) {
        this(str, null, null, 6, null);
        toMagicModuleMetaRepoModel.write(str, "");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public MarrowVideoDownloadException(String str, String str2) {
        this(str, str2, null, 4, null);
        toMagicModuleMetaRepoModel.write(str, "");
    }

    static void write() {
        read = -648170490;
        write = -1504761226;
        AudioAttributesCompatParcelizer = -1293638073;
        MediaBrowserCompatCustomActionResultReceiver = new byte[]{32, 36, 33, -37, 32, 36, 33, -36, -34, 37, 33, -36, -35, 39, -36, -34, 37, 33, -45, 39, 38, -45, 40, 36, 33, -44, 39, 36, 33, -44, 38, 38, -44, 39, 36, 33, -43, 37, 38, -43, 38, 36, 33, -39, 38, 33, -41, 35, 38, -40, 34, 38, -38, 37, 33, -40, 40, -37, 32, 36, 33, -42, 37, 36, 33, -41, 36, 36, 33, -40, 35, 36, 33, -39, 33, 38, -39, 34, 36, 33, -37, -33, 38, -37, 32, 37, -36, -34, 38, -38, 33, 36, 33, -41, 40, 33, -45, 40, 37, -44, 39, 37, -43, 43, -37, 32, 36, 33, -36, -33, 36, 33, -45, 44, 33, -44, 43, 33, -40, 35, 37, -42, 37, 37, -43, 42, 33, -40, 35, 37, -39, 34, 37, -38, 33, 37, -37, 32, 37, -36, -33, 37, -42, 41, 33, -41, 40, 33, -43, 43, -40, 39, 33, -42, 42, -41, 41, -39, 38, 33, -38, 37, 33, -40, 40, -37, 36, 13, 9, 12, -10, 13, 9, 12, -2, 5, 9, 12, -10, -16, 5, -2, 5, 9, 12, -15, -15, 5, -7, 10, 9, 12, -8, 11, 9, 12, -2, 11, 10, -8, 11, 9, 12, -7, 8, 10, -5, 8, 9, 12, -12, 11, 12, -6, 14, 11, -6, 9, 9, 12, -8, 9, 10, -9, 8, 12, -11, 5, -10, 13, 9, 12, -11, 14, 9, 12, -12, 15, 9, 12, -9, 12, 9, 12, -12, 12, 11, -8, 7, 12, -11, 14, 8, -12, 15, 8, -9, 12, 8, -5, 14, 10, -5, 4, 12, -6, 5, 12, -6, 14, 11, -6, 15, 10, -8, 6, -10, 13, 9, 12, -15, -14, 9, 12, -2, 1, 12, -7, 6, 12, -11, 14, 8, -5, 8, 8, -8, 7, 12, -11, 14, 8, -11, 12, 10, -10, 13, 8, -12, 13, 10, -5, 4, 12, -6, 5, 12, -8, 6, -11, 10, 12, -6, 14, 11, -9, -14, 10, -12, 11, 12, -9, 8, 12, -11, 5, -10, 9};
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 97
            int r7 = 39 - r7
            int r8 = 618 - r8
            byte[] r0 = com.marrow.data.utils.product.exceptions.MarrowVideoDownloadException.MediaBrowserCompatItemReceiver
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r7
            r4 = r2
            goto L24
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            int r8 = r8 + 1
            r3 = r0[r8]
        L24:
            int r6 = r6 + r3
            int r6 = r6 + (-1)
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.data.utils.product.exceptions.MarrowVideoDownloadException.a(byte, int, int, java.lang.Object[]):void");
    }
}
