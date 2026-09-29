package kotlin;

import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.play.core.integrity.model.IntegrityErrorCode;
import java.lang.reflect.Method;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t"}, d2 = {"Lo/setChunkDurationUs;", "", "<init>", "()V", "", "", "AudioAttributesCompatParcelizer", "Ljava/util/List;", "IconCompatParcelizer", "()Ljava/util/List;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class setChunkDurationUs {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private static List<String> read;
    private static short[] AudioAttributesImplApi21Parcelizer;
    private static int AudioAttributesImplBaseParcelizer;
    public static final setChunkDurationUs INSTANCE;
    private static byte[] MediaBrowserCompatCustomActionResultReceiver;
    private static int MediaBrowserCompatItemReceiver;
    private static int RemoteActionCompatParcelizer;
    private static int read;
    private static int write;
    private static final byte[] $$a = {115, -66, -117, -68};
    private static final int $$b = 217;
    private static final byte[] AudioAttributesImplApi26Parcelizer = {TarConstants.LF_BLK, -62, -101, -125, -13, 10, -14, 3, 6, 5, TarConstants.LF_FIFO, -73, 14, 5, -3, 2, -15, 70, -23, -51, 8, 15, -13, 10, 3, -1, -10, 7, 25, -29, -10, -1, 30, -19, 4, -18, 2, -15, 36, -17, -2, -8, 6, 1, 20, -31, -4, 10, -11, 11, -6, 1, 26, -37, 9, 11, -13, 10, -14, 3, 6, 5, TarConstants.LF_FIFO, -72, 13, 4, -18, 73, -40, -19, 4, -18, TarConstants.LF_BLK, -44, 1, 8, -3, 2, -14, 3, 17, -19, 11, -6, 1, 2, -15, 26, -21, 0, 2, 42, -44, 1, -6, 2, 3, 3, -7, 31, -21, -4, 8, -10, -6, 1, 2, -15, 33, -16, -15, 3, 3, 0, 42, -31, -17, 44, -27, -3, -1, 33, -49, 3, 17, -19, 11, -6, 1, -13, 10, -14, 3, 6, 5, TarConstants.LF_FIFO, -72, 13, 4, -18, 73, -31, -34, -5, 11, -6, 1, 41, -49, 17, -9, -6, -23, 15, -10, 45, -44, 3, 2, 26, -33, 2, 9, -5, 7, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -37, -33, 2, 9, -5, 7, 2, -15, 39, -20, -23, 15, -4, -8, 8, 39, -38, 3, -5, 7, 17, -15, -7, -3, 12, -6, -11, -5, -13, 10, -14, 3, 6, 5, TarConstants.LF_FIFO, -72, 13, 4, -18, 73, -40, -19, 4, -18, -12, 2, 11, -7, -5, 9, 24, -24, 4, -18, -2, 3, 13, 1, 17, -33, 19, -19, 15, -14, -13, 10, -14, 3, 6, 5, TarConstants.LF_FIFO, -65, -4, 69, -34, -34, 3, 12, -2, -14, 0, -12, 37, -21, 5, -13, 10, -14, 3, 6, 5, TarConstants.LF_FIFO, -57, -11, 17, -15, 8, -1, 6, -16, 69, -21, -44, 3, -3, -3, -11, 13, 0, -9, 3, 4, 3, -11, 9, -21, 21, TarConstants.LF_CHR, -62, 11, -13, 7, 57, -27, -37, -6, 15, -2, 2, -13, 21, -11, -9, 16, 22, -23, -5, -6, 30, -11, -11, -9, 16};
    private static final int MediaMetadataCompat = 177;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r6, int r7, int r8) {
        /*
            byte[] r0 = kotlin.setChunkDurationUs.$$a
            int r7 = r7 * 2
            int r7 = r7 + 112
            int r8 = r8 * 2
            int r8 = 3 - r8
            int r6 = r6 * 3
            int r6 = r6 + 1
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r6
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L26:
            r3 = r0[r8]
        L28:
            int r7 = r7 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setChunkDurationUs.$$c(byte, int, int):java.lang.String");
    }

    public final List<String> IconCompatParcelizer() throws Throwable {
        DataSourceBitmapLoaderExternalSyntheticLambda2 dataSourceBitmapLoaderExternalSyntheticLambda2 = new DataSourceBitmapLoaderExternalSyntheticLambda2(this);
        try {
            byte[] bArr = AudioAttributesImplApi26Parcelizer;
            byte b = bArr[89];
            byte b2 = b;
            Object[] objArr = new Object[1];
            a(b, b2, (short) (b2 | TarConstants.LF_SYMLINK), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            short s = (short) 274;
            Object[] objArr2 = new Object[1];
            a(bArr[8], bArr[198], s, objArr2);
            int iIntValue = ((Integer) cls.getMethod((String) objArr2[0], Long.TYPE).invoke(null, 0L)).intValue() - 2098060413;
            short s2 = (short) 254;
            Object[] objArr3 = new Object[1];
            a(bArr[89], bArr[7], s2, objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a(bArr[8], bArr[49], (short) 225, objArr4);
            int i = (((Long) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).longValue() > 0L ? 1 : (((Long) cls2.getMethod((String) objArr4[0], null).invoke(null, null)).longValue() == 0L ? 0 : -1)) - 110;
            Object[] objArr5 = new Object[1];
            a(bArr[89], bArr[7], s2, objArr5);
            Class<?> cls3 = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            a(bArr[8], bArr[54], (short) 204, objArr6);
            short sIntValue = (short) ((-109) - (((Integer) cls3.getMethod((String) objArr6[0], null).invoke(null, null)).intValue() >> 16));
            Object[] objArr7 = new Object[1];
            a(bArr[89], bArr[54], (short) (MediaMetadataCompat + 4), objArr7);
            Class<?> cls4 = Class.forName((String) objArr7[0]);
            Object[] objArr8 = new Object[1];
            a(bArr[89], bArr[234], (short) 158, objArr8);
            String str = (String) objArr8[0];
            byte b3 = bArr[54];
            byte b4 = bArr[80];
            Object[] objArr9 = new Object[1];
            a(b3, b4, (short) (b4 | 128), objArr9);
            byte bIntValue = (byte) ((-106) - ((Integer) cls4.getMethod(str, Class.forName((String) objArr9[0])).invoke(null, "")).intValue());
            Object[] objArr10 = new Object[1];
            a(bArr[89], bArr[7], s2, objArr10);
            Class<?> cls5 = Class.forName((String) objArr10[0]);
            Object[] objArr11 = new Object[1];
            a(bArr[8], bArr[5], (short) TsExtractor.TS_STREAM_TYPE_HDMV_DTS, objArr11);
            int iIntValue2 = (-199576494) - (((Integer) cls5.getMethod((String) objArr11[0], null).invoke(null, null)).intValue() >> 16);
            Object[] objArr12 = new Object[1];
            b(iIntValue, i, sIntValue, bIntValue, iIntValue2, objArr12);
            String str2 = (String) objArr12[0];
            Object[] objArr13 = new Object[1];
            a(bArr[89], bArr[307], (short) 108, objArr13);
            Class<?> cls6 = Class.forName((String) objArr13[0]);
            byte b5 = bArr[15];
            byte b6 = bArr[198];
            Object[] objArr14 = new Object[1];
            a(b5, b6, (short) (b6 | 80), objArr14);
            int iIntValue3 = (-2098060292) - ((Integer) cls6.getMethod((String) objArr14[0], Integer.TYPE, Integer.TYPE).invoke(null, 0, 0)).intValue();
            byte b7 = bArr[89];
            byte b8 = b7;
            Object[] objArr15 = new Object[1];
            a(b7, b8, (short) (b8 | TarConstants.LF_SYMLINK), objArr15);
            Class<?> cls7 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a(bArr[8], bArr[198], s, objArr16);
            int iIntValue4 = ((Integer) cls7.getMethod((String) objArr16[0], Long.TYPE).invoke(null, 0L)).intValue() - 109;
            Object[] objArr17 = new Object[1];
            a(bArr[89], bArr[21], (short) (-bArr[63]), objArr17);
            Class<?> cls8 = Class.forName((String) objArr17[0]);
            byte b9 = bArr[198];
            Object[] objArr18 = new Object[1];
            a(b9, (byte) (b9 | 16), (short) (bArr[10] + 1), objArr18);
            short sIntValue2 = (short) (14 - (((Integer) cls8.getMethod((String) objArr18[0], null).invoke(null, null)).intValue() >> 22));
            Object[] objArr19 = new Object[1];
            a(bArr[89], bArr[49], bArr[168], objArr19);
            Class<?> cls9 = Class.forName((String) objArr19[0]);
            byte b10 = (byte) 28;
            Object[] objArr20 = new Object[1];
            a(bArr[8], b10, bArr[32], objArr20);
            byte bIntValue2 = (byte) (((Integer) cls9.getMethod((String) objArr20[0], Integer.TYPE).invoke(null, 0)).intValue() + 109);
            Object[] objArr21 = new Object[1];
            a(bArr[89], bArr[21], (short) (-bArr[63]), objArr21);
            Class<?> cls10 = Class.forName((String) objArr21[0]);
            byte b11 = bArr[198];
            Object[] objArr22 = new Object[1];
            a(b11, (byte) (b11 | 16), (short) (bArr[10] + 1), objArr22);
            int iIntValue5 = (-199576495) - (((Integer) cls10.getMethod((String) objArr22[0], null).invoke(null, null)).intValue() >> 22);
            Object[] objArr23 = new Object[1];
            b(iIntValue3, iIntValue4, sIntValue2, bIntValue2, iIntValue5, objArr23);
            Object[] objArr24 = {(String) objArr23[0]};
            byte b12 = bArr[54];
            byte b13 = bArr[80];
            Object[] objArr25 = new Object[1];
            a(b12, b13, (short) (b13 | 128), objArr25);
            Class<?> cls11 = Class.forName((String) objArr25[0]);
            Object[] objArr26 = new Object[1];
            a((byte) (-bArr[35]), b10, bArr[52], objArr26);
            String str3 = (String) objArr26[0];
            byte b14 = bArr[54];
            byte b15 = bArr[80];
            Object[] objArr27 = new Object[1];
            a(b14, b15, (short) (b15 | 128), objArr27);
            Object[] objArr28 = (Object[]) cls11.getMethod(str3, Class.forName((String) objArr27[0])).invoke(str2, objArr24);
            int[] iArr = new int[objArr28.length];
            for (int i2 = 0; i2 < objArr28.length; i2++) {
                Object[] objArr29 = {objArr28[i2]};
                byte[] bArr2 = AudioAttributesImplApi26Parcelizer;
                Object[] objArr30 = new Object[1];
                a(bArr2[54], bArr2[307], bArr2[308], objArr30);
                Class<?> cls12 = Class.forName((String) objArr30[0]);
                Object[] objArr31 = new Object[1];
                a(bArr2[167], bArr2[52], bArr2[8], objArr31);
                String str4 = (String) objArr31[0];
                byte b16 = bArr2[54];
                byte b17 = bArr2[80];
                Object[] objArr32 = new Object[1];
                a(b16, b17, (short) (b17 | 128), objArr32);
                Object objInvoke = cls12.getMethod(str4, Class.forName((String) objArr32[0])).invoke(null, objArr29);
                Object[] objArr33 = new Object[1];
                a(bArr2[54], bArr2[307], bArr2[308], objArr33);
                Class<?> cls13 = Class.forName((String) objArr33[0]);
                Object[] objArr34 = new Object[1];
                a(bArr2[20], bArr2[28], bArr2[89], objArr34);
                iArr[i2] = ((Integer) cls13.getMethod((String) objArr34[0], null).invoke(objInvoke, null)).intValue();
            }
            int i3 = 0;
            while (true) {
                int i4 = i3 + 1;
                try {
                } catch (Throwable th) {
                    th = th;
                }
                switch (dataSourceBitmapLoaderExternalSyntheticLambda2.write(iArr[i3])) {
                    case -17:
                        i3 = 36;
                        break;
                    case -16:
                        dataSourceBitmapLoaderExternalSyntheticLambda2.write(19);
                        if (dataSourceBitmapLoaderExternalSyntheticLambda2.write != 14) {
                            i4 = 31;
                            i3 = i4;
                        } else {
                            i3 = 7;
                        }
                        break;
                    case -15:
                        dataSourceBitmapLoaderExternalSyntheticLambda2.AudioAttributesCompatParcelizer = 1;
                        dataSourceBitmapLoaderExternalSyntheticLambda2.write(11);
                        dataSourceBitmapLoaderExternalSyntheticLambda2.write(17);
                        dataSourceBitmapLoaderExternalSyntheticLambda2.AudioAttributesCompatParcelizer = dataSourceBitmapLoaderExternalSyntheticLambda2.IconCompatParcelizer.hashCode();
                        try {
                            dataSourceBitmapLoaderExternalSyntheticLambda2.write(7);
                        } catch (Throwable th2) {
                            th = th2;
                            if (i3 < 32 || i3 >= 36) {
                                throw th;
                            }
                            dataSourceBitmapLoaderExternalSyntheticLambda2.read = th;
                            dataSourceBitmapLoaderExternalSyntheticLambda2.write(22);
                            i4 = 30;
                        }
                        i3 = i4;
                        break;
                    case -14:
                        dataSourceBitmapLoaderExternalSyntheticLambda2.write(6);
                        throw ((Throwable) dataSourceBitmapLoaderExternalSyntheticLambda2.IconCompatParcelizer);
                    case IntegrityErrorCode.NONCE_IS_NOT_BASE64 /* -13 */:
                        i3 = 37;
                        break;
                    case -12:
                        i3 = 39;
                        break;
                    case -11:
                        dataSourceBitmapLoaderExternalSyntheticLambda2.write(13);
                        if (dataSourceBitmapLoaderExternalSyntheticLambda2.write == 0) {
                            i4 = 29;
                        }
                        i3 = i4;
                        break;
                    case -10:
                        i3 = 1;
                        break;
                    case -9:
                        i3 = 19;
                        break;
                    case -8:
                        dataSourceBitmapLoaderExternalSyntheticLambda2.write(13);
                        if (dataSourceBitmapLoaderExternalSyntheticLambda2.write == 0) {
                            i4 = 18;
                        }
                        i3 = i4;
                        break;
                    case -7:
                        dataSourceBitmapLoaderExternalSyntheticLambda2.AudioAttributesCompatParcelizer = 1;
                        dataSourceBitmapLoaderExternalSyntheticLambda2.write(11);
                        dataSourceBitmapLoaderExternalSyntheticLambda2.write(12);
                        RemoteActionCompatParcelizer = dataSourceBitmapLoaderExternalSyntheticLambda2.write;
                        i3 = i4;
                        break;
                    case -6:
                        dataSourceBitmapLoaderExternalSyntheticLambda2.AudioAttributesCompatParcelizer = read;
                        dataSourceBitmapLoaderExternalSyntheticLambda2.write(7);
                        i3 = i4;
                        break;
                    case -5:
                        dataSourceBitmapLoaderExternalSyntheticLambda2.write(6);
                        return (List) dataSourceBitmapLoaderExternalSyntheticLambda2.IconCompatParcelizer;
                    case -4:
                        i3 = 9;
                        break;
                    case -3:
                        i3 = 20;
                        break;
                    case -2:
                        dataSourceBitmapLoaderExternalSyntheticLambda2.read = read;
                        dataSourceBitmapLoaderExternalSyntheticLambda2.write(1);
                        i3 = i4;
                        break;
                    case -1:
                        i3 = 3;
                        break;
                    default:
                        i3 = i4;
                        break;
                }
            }
            throw th;
        } catch (Throwable th3) {
            Throwable cause = th3.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th3;
        }
    }

    private setChunkDurationUs() {
    }

    static {
        write();
        read = 0;
        RemoteActionCompatParcelizer = 1;
        INSTANCE = new setChunkDurationUs();
        read = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new String[]{"com.android.vending", "dev.firebase.appdistribution", "org.marrow.installer"});
    }

    private static void b(int i, int i2, short s, byte b, int i3, Object[] objArr) throws Throwable {
        long j;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(MediaBrowserCompatItemReceiver)};
            int i4 = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24297, View.MeasureSpec.getMode(0) + 12, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 == 0) {
                j = 7899112766888837815L;
            } else {
                byte[] bArr = MediaBrowserCompatCustomActionResultReceiver;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i6 = 0;
                    while (i6 < length) {
                        Object[] objArr3 = new Object[1];
                        objArr3[i4] = Integer.valueOf(bArr[i6]);
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b2 = (byte) i4;
                            byte b3 = b2;
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getFadingEdgeLength() >> 16), Drawable.resolveOpacity(i4, i4) + 3082, 128 - (ViewConfiguration.getScrollBarSize() >> 8), 2145850993, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i6] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i6++;
                        i4 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = MediaBrowserCompatCustomActionResultReceiver;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(write)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) View.resolveSizeAndState(0, 0, 0), View.MeasureSpec.getSize(0) + 24297, 11 - MotionEvent.axisFromString(""), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) MediaBrowserCompatItemReceiver) ^ 7899112766888837815L)));
                    j = 7899112766888837815L;
                } else {
                    j = 7899112766888837815L;
                    iIntValue = (short) (((short) (((long) AudioAttributesImplApi21Parcelizer[i + ((int) (((long) write) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) MediaBrowserCompatItemReceiver) ^ 7899112766888837815L)));
                }
            }
            if (iIntValue > 0) {
                buildresumedownloadsintent.read = ((i + iIntValue) - 2) + ((int) (((long) write) ^ j)) + i5;
                Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i3), Integer.valueOf(AudioAttributesImplBaseParcelizer), sb};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 34134), TextUtils.getCapsMode("", 0, 0) + 13432, 21 - Color.blue(0), 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
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
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        short[] sArr = AudioAttributesImplApi21Parcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r3]) ^ 7899112766888837815L)) + s)) ^ b));
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

    static void write() {
        write = -1306239286;
        MediaBrowserCompatItemReceiver = -819363109;
        AudioAttributesImplBaseParcelizer = -993212052;
        MediaBrowserCompatCustomActionResultReceiver = new byte[]{-70, 73, -73, -76, 110, 98, 73, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 73, -73, -76, 111, 97, 73, 121, 72, -73, -76, 122, -69, -76, 107, -69, 122, -73, -73, -76, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 74, 72, 122, -68, 107, -74, -73, -76, 108, -75, -73, -76, 109, -76, -73, -76, 110, -77, -73, -76, 108, 74, 121, 72, 72, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -67, -76, 108, 74, 111, 98, 72, 122, -73, 72, 121, -68, -76, 111, 98, -73, -76, 111, 98, -73, -76, 102, -65, -76, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, -66, -76, 107, -74, 72, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -67, -76, 108, 74, 111, 98, 72, 102, -80, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, -65, 121, -68, -76, 122, -69, -76, 122, -68, 107, 74, -76, 107, -69, 108, 74, 109, 73, 108, 73, -76, 109, 72, -76, 110, -73, 34};
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 309 - r8
            byte[] r0 = kotlin.setChunkDurationUs.AudioAttributesImplApi26Parcelizer
            int r6 = r6 + 97
            int r1 = 33 - r7
            byte[] r1 = new byte[r1]
            int r7 = 32 - r7
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2c
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setChunkDurationUs.a(short, byte, short, java.lang.Object[]):void");
    }
}
