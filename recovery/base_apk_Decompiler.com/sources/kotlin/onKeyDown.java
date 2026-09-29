package kotlin;

import android.content.Context;
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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.reflect.Method;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class onKeyDown {
    private static short[] RemoteActionCompatParcelizer;
    private static final byte[] $$a = {3, -120, 17, 23};
    private static final int $$b = 116;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static int write = 1161378107;
    private static int read = -819363073;
    private static int AudioAttributesCompatParcelizer = 1214515742;
    private static byte[] IconCompatParcelizer = {96, 73, -81, 77, -96, 127, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -71, 65, -102, -77, 89, -108, 114, 69, -92, 74, -106, -109, 11, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -71, 65, -102, -77, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -68, 105, -68, 70, -80, -79, 66, -78, 64, -107, -105, -73, TarConstants.LF_GNUTYPE_LONGNAME, 106, -99, 73, -73, TarConstants.LF_GNUTYPE_LONGNAME, 10, -3, 113, 67, 72, -93, -124, 2, -78, -68, 64, 74, -91, 73, 69, -14, 1, -96, 92, -94, 64, 96, 69, -92, 74, -106, -109, 11, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -71, 65, -102, -77, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -68, -96, 127, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -71, 65, -102, -77, 89, -108, 110, 73, -81, 77, TarConstants.LF_PAX_EXTENDED_HEADER_LC, TarConstants.LF_GNUTYPE_LONGLINK, -92, 70, -79, 72, -101, -94, 13, -79, -66, 70, -79, 72, -69, -126, 125, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -71, 65, -70, 126, -70, 73, -79, 68, -70, -93, 95, 73, -79, 65, -65, -75, -90, 107, -72, 73, 113, 79, -69, -92, 94, 73, -79, 65, -65, -75, -90, 107, -72, 73, 110, -70, 73, -79, 68, -70, -93, 95, 73, -79, 65, -65, -75, -90, -107, 118, 74, -11, 13, -79, -66, 70, -79, 72, -69, -126, 125, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -71, 65, -70, 113, -66, 79, -110, TarConstants.LF_GNUTYPE_SPARSE, 73, -79, 65, -65, -75, -90, 107, -72, 73, 117, -71, 68, 74, -74, -92, 68, -80, 73, 65, 99, 68, 74, -74, -92, 68, -80, 73, -95, -110, 118, 74, -11, 13, -79, -66, 70, -79, 72, -69, -126, 125, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -71, 65, -70, 124, 70, -92, 73, 77, -76, 74, 66, -75, -70, -107, 105, 70, -92, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -70, 64, -66, 73, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -68, 70, -80, -79, 66, -78, 64, -107, -105, -73, TarConstants.LF_GNUTYPE_LONGNAME, 106, TarConstants.LF_GNUTYPE_SPARSE, -90, 73, TarConstants.LF_GNUTYPE_LONGNAME, -65, 90, -107, 104, -72, 73};
    private static long AudioAttributesImplApi21Parcelizer = 9081311206033267412L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(int r5, byte r6, byte r7) {
        /*
            byte[] r0 = kotlin.onKeyDown.$$a
            int r7 = r7 * 3
            int r1 = 1 - r7
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r5 = r5 * 8
            int r5 = r5 + 104
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            int r6 = r6 + 1
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L26:
            int r3 = r3 + 1
            r4 = r0[r6]
        L2a:
            int r5 = r5 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.onKeyDown.$$c(int, byte, byte):java.lang.String");
    }

    public static final long read(Long l) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 55;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (l == null) {
            return 0L;
        }
        long jLongValue = l.longValue();
        int i3 = MediaBrowserCompatItemReceiver + 19;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        return jLongValue;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(AudioAttributesImplApi21Parcelizer ^ 4027965449757546139L, cArr, i);
        int i3 = 4;
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i4 = $10 + 53;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - i3;
            int i6 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % i3]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(AudioAttributesImplApi21Parcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 12424 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 20 - TextUtils.indexOf("", "", 0), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.green(0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1868, 10 - View.combineMeasuredStates(0, 0), 1983509525, false, $$c(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i7 = $10 + 49;
                $11 = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 3 % 3;
                }
                i3 = 4;
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

    private static void a(byte b, int i, int i2, short s, int i3, Object[] objArr) throws Throwable {
        boolean z;
        long j;
        int length;
        byte[] bArr;
        int i4;
        int i5;
        int i6 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(read)};
            int i7 = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) ((-16777216) - Color.rgb(0, 0, 0)), 24296 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 12 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $10 + 39;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                j = 7899112766888837815L;
            } else {
                byte[] bArr2 = IconCompatParcelizer;
                if (bArr2 != null) {
                    int i10 = $10 + 11;
                    $11 = i10 % 128;
                    if (i10 % 2 == 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i4 = 1;
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                        i4 = 0;
                    }
                    while (i4 < length) {
                        Object[] objArr3 = new Object[1];
                        objArr3[i7] = Integer.valueOf(bArr2[i4]);
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b2 = (byte) 1;
                            byte b3 = (byte) (b2 - 1);
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.argb(i7, i7, i7, i7), 3082 - TextUtils.indexOf("", ""), 128 - Color.red(i7), 2145850993, false, $$c(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr[i4] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i4++;
                        i7 = 0;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = IconCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(write)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ExpandableListView.getPackedPositionGroup(0L), 24297 - ((Process.getThreadPriority(0) + 20) >> 6), 12 - Drawable.resolveOpacity(0, 0), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) read) ^ 7899112766888837815L)));
                    j = 7899112766888837815L;
                } else {
                    j = 7899112766888837815L;
                    iIntValue = (short) (((short) (((long) RemoteActionCompatParcelizer[i2 + ((int) (((long) write) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) read) ^ 7899112766888837815L)));
                }
            }
            if (iIntValue > 0) {
                int i11 = ((i2 + iIntValue) - 2) + ((int) (((long) write) ^ j));
                if (z) {
                    int i12 = $11 + 27;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    i5 = 1;
                } else {
                    i5 = 0;
                }
                buildresumedownloadsintent.read = i11 + i5;
                Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i), Integer.valueOf(AudioAttributesCompatParcelizer), sb};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (34134 - ((Process.getThreadPriority(0) + 20) >> 6)), TextUtils.indexOf("", "", 0) + 13432, 21 - TextUtils.getTrimmedLength(""), 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr4 = IconCompatParcelizer;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i14 = 0;
                    while (i14 < length2) {
                        int i15 = $11 + 29;
                        $10 = i15 % 128;
                        if (i15 % 2 != 0) {
                            bArr5[i14] = (byte) (((long) bArr4[i14]) * 7899112766888837815L);
                        } else {
                            bArr5[i14] = (byte) (((long) bArr4[i14]) ^ 7899112766888837815L);
                            i14++;
                        }
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    if (z2) {
                        int i16 = $11 + 71;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                        byte[] bArr6 = IconCompatParcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r6]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        short[] sArr = RemoteActionCompatParcelizer;
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v49, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r0v92 */
    /* JADX WARN: Type inference failed for: r0v94 */
    /* JADX WARN: Type inference failed for: r11v140, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r2v181, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r30v0 */
    /* JADX WARN: Type inference failed for: r30v1 */
    /* JADX WARN: Type inference failed for: r30v2 */
    /* JADX WARN: Type inference failed for: r31v0 */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v102, types: [int] */
    /* JADX WARN: Type inference failed for: r6v104, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v105 */
    /* JADX WARN: Type inference failed for: r6v110, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v118, types: [int] */
    /* JADX WARN: Type inference failed for: r6v120, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r6v127, types: [int] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v131 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v154, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r6v2, types: [int] */
    /* JADX WARN: Type inference failed for: r6v42, types: [java.lang.reflect.Constructor] */
    /* JADX WARN: Type inference failed for: r6v82, types: [java.lang.Object] */
    public static Object[] RemoteActionCompatParcelizer(Context context, int i, int i2) {
        ?? declaredConstructor;
        Object[] objArr;
        int i3;
        int i4;
        int iAlpha;
        byte bIndexOf;
        Class<?> cls;
        byte b;
        int i5;
        int i6;
        short sResolveSize;
        ?? r30;
        int i7;
        int length;
        int i8;
        ?? r0;
        int i9;
        int i10;
        String str;
        Class<?> cls2;
        String str2;
        int i11 = 2 % 2;
        if (context != null) {
            int i12 = AudioAttributesImplApi26Parcelizer;
            int i13 = (i12 & 41) + (i12 | 41);
            MediaBrowserCompatItemReceiver = i13 % 128;
            try {
                byte absoluteGravity = i13 % 2 == 0 ? (byte) Gravity.getAbsoluteGravity(0, 0) : (byte) Gravity.getAbsoluteGravity(0, 0);
                int offsetAfter = TextUtils.getOffsetAfter("", 0);
                byte b2 = absoluteGravity;
                int i14 = 319 * offsetAfter;
                int i15 = (i14 & (-1962809778)) + (i14 | (-1962809778));
                int i16 = ~offsetAfter;
                int i17 = ~((i16 & i) | (i16 ^ i));
                int i18 = (((-2024961947) & i17) | ((-2024961947) ^ i17)) * (-318);
                int i19 = (i15 & i18) + (i18 | i15);
                int i20 = MediaBrowserCompatItemReceiver;
                int i21 = (i20 & 19) + (i20 | 19);
                AudioAttributesImplApi26Parcelizer = i21 % 128;
                int i22 = i21 % 2;
                int i23 = ~(((-2024961947) ^ i) | ((-2024961947) & i));
                int i24 = ~i;
                int i25 = (i24 ^ offsetAfter) | (i24 & offsetAfter);
                int i26 = i19 + (((~((i25 ^ 2024961946) | (i25 & 2024961946))) | i23) * 318);
                int i27 = ~i;
                int i28 = ((-2024961947) ^ i27) | ((-2024961947) & i27);
                int i29 = ~((i28 ^ offsetAfter) | (i28 & offsetAfter));
                int i30 = offsetAfter | 2024961946;
                int i31 = ~((i30 ^ i) | (i30 & i));
                int i32 = (i26 - (~(-(-(((i29 ^ i31) | (i31 & i29)) * 318))))) - 1;
                int i33 = ((i20 | 111) << 1) - (i20 ^ 111);
                AudioAttributesImplApi26Parcelizer = i33 % 128;
                int i34 = i33 % 2;
                int i35 = -Process.getGidForName("");
                int iWrite = ai.write();
                int i36 = i35 * 860;
                int i37 = ((i36 | (-1139501422)) << 1) - (i36 ^ (-1139501422));
                int i38 = MediaBrowserCompatItemReceiver + 109;
                int i39 = i38 % 128;
                AudioAttributesImplApi26Parcelizer = i39;
                int i40 = i38 % 2;
                int i41 = (-859) * ((i35 ^ iWrite) | (i35 & iWrite));
                int i42 = (i37 ^ i41) + ((i37 & i41) << 1);
                int i43 = ~((~iWrite) | i35);
                int i44 = (~i35) | (-1978614900);
                int i45 = (i39 ^ 39) + ((i39 & 39) << 1);
                MediaBrowserCompatItemReceiver = i45 % 128;
                int i46 = i45 % 2;
                int i47 = ~((i44 ^ iWrite) | (i44 & iWrite));
                int i48 = 859 * ((i43 & i47) | (i43 ^ i47));
                int i49 = (i42 & i48) + (i48 | i42);
                int i50 = ~((-1978614900) | (~iWrite));
                int i51 = ~((-1978614900) | i35);
                int i52 = ((i50 & i51) | (i50 ^ i51)) * 859;
                int i53 = ((i49 | i52) << 1) - (i49 ^ i52);
                declaredConstructor = 0;
                short s = (short) ((-2) - ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) ^ (-1)));
                int i54 = -(-(ViewConfiguration.getLongPressTimeout() >> 16));
                int i55 = (i54 ^ (-73)) + ((i54 & (-73)) << 1);
                Object[] objArr2 = new Object[1];
                a(b2, i32, i53, s, i55, objArr2);
                String str3 = (String) objArr2[0];
                int i56 = AudioAttributesImplApi26Parcelizer;
                int i57 = ((i56 | 3) << 1) - (i56 ^ 3);
                MediaBrowserCompatItemReceiver = i57 % 128;
                int i58 = i57 % 2;
                try {
                    try {
                        Object[] objArr3 = {str3};
                        int threadPriority = Process.getThreadPriority(0);
                        byte b3 = (byte) (((threadPriority ^ 20) + ((threadPriority & 20) << 1)) >> 6);
                        int i59 = -AndroidCharacter.getMirror('0');
                        int i60 = MediaBrowserCompatItemReceiver + 119;
                        AudioAttributesImplApi26Parcelizer = i60 % 128;
                        int i61 = i60 % 2;
                        int i62 = (-813) * i59;
                        int i63 = (i62 ^ 1550788632) + ((i62 & 1550788632) << 1);
                        int i64 = ~(((-2024962034) & i59) | ((-2024962034) ^ i59));
                        int i65 = ~((i59 ^ i) | (i59 & i));
                        int i66 = (i64 | i65) * (-814);
                        int i67 = (i63 ^ i66) + ((i66 & i63) << 1);
                        int i68 = ~(((-2024962034) & i27) | ((-2024962034) ^ i27));
                        int i69 = ~i59;
                        int i70 = ~((i69 ^ 2024962033) | (i69 & 2024962033));
                        int i71 = (i70 & i68) | (i68 ^ i70);
                        int i72 = -(-(((i71 & i65) | (i71 ^ i65)) * 407));
                        int i73 = (i67 ^ i72) + ((i67 & i72) << 1);
                        int i74 = ~((i69 ^ 2024962033) | (i69 & 2024962033));
                        int i75 = ~((i69 & i) | (i69 ^ i));
                        int i76 = (i74 & i75) | (i74 ^ i75);
                        int i77 = ~(i | 2024962033);
                        Object[] objArr4 = new Object[1];
                        a(b3, (i73 - (~(((i76 & i77) | (i76 ^ i77)) * 407))) - 1, 1978614930 - (~(-(-(TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))))), (short) KeyEvent.normalizeMetaState(0), (ViewConfiguration.getPressedStateDuration() >> 16) - 73, objArr4);
                        declaredConstructor = Class.forName((String) objArr4[0]).getDeclaredConstructor(String.class);
                        Object objNewInstance = declaredConstructor.newInstance(objArr3);
                        byte tapTimeout = (byte) (ViewConfiguration.getTapTimeout() >> 16);
                        int i78 = -(ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int i79 = i78 * 881;
                        int i80 = (i79 & 1580046586) + (i79 | 1580046586);
                        int i81 = ~i78;
                        int i82 = (~((i81 ^ (-2024961947)) | (i81 & (-2024961947)))) | (~(i81 | i));
                        int i83 = ~(((-2024961947) ^ i) | ((-2024961947) & i));
                        int i84 = i80 + (((i82 & i83) | (i82 ^ i83)) * (-880));
                        int i85 = ~((i81 & i27) | (i81 ^ i27));
                        int i86 = ((i85 & 2024961946) | (i85 ^ 2024961946) | (~((i78 ^ i) | (i78 & i)))) * (-880);
                        int i87 = (i84 & i86) + (i86 | i84);
                        int i88 = -(-((~(i78 | i)) * 880));
                        Object[] objArr5 = new Object[1];
                        a(tapTimeout, (i87 ^ i88) + ((i88 & i87) << 1), 1978614968 - (~View.MeasureSpec.makeMeasureSpec(0, 0)), (short) Color.alpha(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) - 73, objArr5);
                        String str4 = (String) objArr5[0];
                        int i89 = MediaBrowserCompatItemReceiver;
                        int i90 = (i89 ^ 69) + ((i89 & 69) << 1);
                        int i91 = i90 % 128;
                        AudioAttributesImplApi26Parcelizer = i91;
                        try {
                            if (i90 % 2 != 0) {
                                objArr = new Object[1];
                                objArr[1] = str4;
                                i3 = 0;
                            } else {
                                objArr = new Object[]{str4};
                                i3 = 1;
                            }
                            int i92 = (i91 & 125) + (i91 | 125);
                            MediaBrowserCompatItemReceiver = i92 % 128;
                            if (i92 % 2 == 0) {
                                try {
                                    bIndexOf = (byte) (i3 << TextUtils.indexOf((CharSequence) "", 'w'));
                                    iAlpha = Color.alpha(1);
                                    i4 = 0;
                                } catch (Throwable th) {
                                    th = th;
                                    Throwable cause = th.getCause();
                                    if (cause != null) {
                                        throw cause;
                                    }
                                    throw th;
                                }
                            } else {
                                byte b4 = (byte) ((i3 - (~TextUtils.indexOf((CharSequence) "", '0'))) - 1);
                                i4 = 0;
                                iAlpha = Color.alpha(0);
                                bIndexOf = b4;
                            }
                            int i93 = -(-TextUtils.getCapsMode("", i4, i4));
                            int i94 = (i93 ^ 1978614931) + ((i93 & 1978614931) << 1);
                            short maximumFlingVelocity = (short) (ViewConfiguration.getMaximumFlingVelocity() >> 16);
                            int scrollBarSize = ViewConfiguration.getScrollBarSize() >> 8;
                            int i95 = ((scrollBarSize | (-73)) << 1) - (scrollBarSize ^ (-73));
                            Object[] objArr6 = new Object[1];
                            a(bIndexOf, 2024961985 + iAlpha, i94, maximumFlingVelocity, i95, objArr6);
                            Class<?> cls3 = Class.forName((String) objArr6[0]);
                            int i96 = MediaBrowserCompatItemReceiver;
                            int i97 = (i96 & 49) + (i96 | 49);
                            AudioAttributesImplApi26Parcelizer = i97 % 128;
                            int i98 = i97 % 2;
                            declaredConstructor = cls3.getDeclaredConstructor(String.class).newInstance(objArr);
                            int i99 = MediaBrowserCompatItemReceiver + 23;
                            AudioAttributesImplApi26Parcelizer = i99 % 128;
                            int i100 = i99 % 2;
                            try {
                                byte capsMode = (byte) TextUtils.getCapsMode("", 0, 0);
                                int i101 = -Color.blue(0);
                                int i102 = (i101 & 2024961976) + (i101 | 2024961976);
                                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0);
                                int i103 = (iNormalizeMetaState & 1978615000) + (1978615000 | iNormalizeMetaState);
                                short touchSlop = (short) (ViewConfiguration.getTouchSlop() >> 8);
                                int i104 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1));
                                int i105 = (i104 ^ (-74)) + ((i104 & (-74)) << 1);
                                Object[] objArr7 = new Object[1];
                                a(capsMode, i102, i103, touchSlop, i105, objArr7);
                                Class<?> cls4 = Class.forName((String) objArr7[0]);
                                byte modifierMetaStateMask = (byte) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask()));
                                int i106 = -(-(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                                int i107 = ((i106 | 2024961981) << 1) - (i106 ^ 2024961981);
                                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0);
                                int i108 = ((iResolveSizeAndState | 1978615023) << 1) - (iResolveSizeAndState ^ 1978615023);
                                int bitsPerPixel = ImageFormat.getBitsPerPixel(0);
                                int iWrite2 = ai.write();
                                int i109 = bitsPerPixel * (-129);
                                int i110 = (i109 & TarConstants.PREFIXLEN_XSTAR) + (i109 | TarConstants.PREFIXLEN_XSTAR);
                                int i111 = ~iWrite2;
                                int i112 = ((-2) ^ i111) | ((-2) & i111);
                                int i113 = -(-((~((i112 ^ bitsPerPixel) | (i112 & bitsPerPixel))) * TsExtractor.TS_STREAM_TYPE_HDMV_DTS));
                                int i114 = ((i110 | i113) << 1) - (i110 ^ i113);
                                int i115 = (-2) | bitsPerPixel;
                                int i116 = (~i115) * (-260);
                                int i117 = ((i114 | i116) << 1) - (i114 ^ i116);
                                int i118 = ~bitsPerPixel;
                                int i119 = ~((i118 & 1) | (i118 ^ 1));
                                int i120 = ~((iWrite2 & i115) | (i115 ^ iWrite2));
                                short s2 = (short) (i117 + (((i120 & i119) | (i119 ^ i120)) * TsExtractor.TS_STREAM_TYPE_HDMV_DTS));
                                int threadPriority2 = Process.getThreadPriority(0);
                                int iWrite3 = ai.write();
                                int i121 = threadPriority2 * (-574);
                                int i122 = ((-11480) ^ i121) + (((-11480) & i121) << 1);
                                int i123 = ~iWrite3;
                                int i124 = ~((-21) | i123);
                                int i125 = ~threadPriority2;
                                int i126 = ~((i125 ^ iWrite3) | (i125 & iWrite3));
                                int i127 = -(-(((i124 ^ i126) | (i126 & i124)) * 1150));
                                int i128 = ((i122 | i127) << 1) - (i122 ^ i127);
                                int i129 = ~threadPriority2;
                                int i130 = ~((i129 ^ iWrite3) | (i129 & iWrite3));
                                int i131 = ~((i123 ^ threadPriority2) | (threadPriority2 & i123));
                                int i132 = i128 + (((i130 & i131) | (i130 ^ i131)) * (-575));
                                int i133 = ~(((-21) & iWrite3) | ((-21) ^ iWrite3));
                                int i134 = ~iWrite3;
                                int i135 = ~((i134 & 20) | (i134 ^ 20));
                                int i136 = -(-(((i133 & i135) | (i133 ^ i135)) * 575));
                                int i137 = (-73) - (((i132 ^ i136) + ((i136 & i132) << 1)) >> 6);
                                Object[] objArr8 = new Object[1];
                                a(modifierMetaStateMask, i107, i108, s2, i137, objArr8);
                                Object objInvoke = cls4.getMethod((String) objArr8[0], null).invoke(context, null);
                                int i138 = MediaBrowserCompatItemReceiver;
                                int i139 = (i138 ^ 17) + ((i138 & 17) << 1);
                                AudioAttributesImplApi26Parcelizer = i139 % 128;
                                int i140 = i139 % 2;
                                try {
                                    byte maximumDrawingCacheSize = (byte) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                                    int i141 = (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                                    int iWrite4 = ai.write();
                                    int i142 = ~i141;
                                    int i143 = ~iWrite4;
                                    int i144 = (((i141 * 302) - (-1281359464)) - (~(-(-(((~((i142 ^ i143) | (i142 & i143))) | 2024961976) * (-602)))))) - 1;
                                    int i145 = ~i141;
                                    int i146 = ~((i145 ^ (-2024961977)) | (i145 & (-2024961977)));
                                    int i147 = ~((i142 ^ iWrite4) | (i142 & iWrite4));
                                    int i148 = (i146 ^ i147) | (i147 & i146);
                                    int i149 = ~iWrite4;
                                    int i150 = (i141 & i149) | (i149 ^ i141);
                                    int i151 = ~((i150 & 2024961976) | (i150 ^ 2024961976));
                                    int i152 = -(-(((i151 & i148) | (i148 ^ i151)) * (-301)));
                                    int i153 = ((((i144 | i152) << 1) - (i152 ^ i144)) - (~(-(-((~((i143 ^ 2024961976) | (i143 & 2024961976))) * 301))))) - 1;
                                    int i154 = MediaBrowserCompatItemReceiver;
                                    int i155 = (i154 ^ 33) + ((i154 & 33) << 1);
                                    AudioAttributesImplApi26Parcelizer = i155 % 128;
                                    int i156 = i155 % 2;
                                    int i157 = -(Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                    int i158 = (i157 & 1978615001) + (i157 | 1978615001);
                                    int packedPositionChild = ExpandableListView.getPackedPositionChild(0L);
                                    int i159 = (packedPositionChild * (-209)) - 209;
                                    int i160 = (~((~packedPositionChild) | (-2))) * 210;
                                    int i161 = (i159 & i160) + (i159 | i160);
                                    int i162 = ~((-2) | i27);
                                    int i163 = ~packedPositionChild;
                                    int i164 = ~((i163 ^ i) | (i163 & i));
                                    int i165 = -(-(((i162 & i164) | (i162 ^ i164)) * 210));
                                    int i166 = ((i161 | i165) << 1) - (i165 ^ i161);
                                    int i167 = i163 | i27;
                                    int i168 = ~((i167 & 1) | (i167 ^ 1));
                                    int i169 = (packedPositionChild & (-2)) | ((-2) ^ packedPositionChild);
                                    int i170 = ~((i169 & i) | (i169 ^ i));
                                    int i171 = ((i170 & i168) | (i168 ^ i170)) * 210;
                                    Object[] objArr9 = new Object[1];
                                    a(maximumDrawingCacheSize, i153, i158, (short) ((i166 & i171) + (i171 | i166)), (-74) - (~(-(-TextUtils.getOffsetBefore("", 0)))), objArr9);
                                    cls = Class.forName((String) objArr9[0]);
                                    b = (byte) (1 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                                    int i172 = -(KeyEvent.getMaxKeyCode() >> 16);
                                    i5 = (i172 ^ 2024961982) + ((i172 & 2024961982) << 1);
                                    i6 = 1978615040 - (~(-(-((byte) KeyEvent.getModifierMetaStateMask()))));
                                    sResolveSize = (short) View.resolveSize(0, 0);
                                    int i173 = -(PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                                    int i174 = (i173 * 569) - 41537;
                                    int i175 = ~i173;
                                    int i176 = (i175 ^ 72) | (i175 & 72);
                                    int i177 = ~i176;
                                    r30 = declaredConstructor;
                                    int i178 = ~((i175 ^ i27) | (i175 & i27));
                                    int i179 = (i177 ^ i178) | (i177 & i178);
                                    int i180 = ~((72 ^ i27) | (72 & i27));
                                    int i181 = ((i179 ^ i180) | (i179 & i180)) * (-1136);
                                    int i182 = (i174 ^ i181) + ((i181 & i174) << 1);
                                    int i183 = ~((i175 ^ i) | (i175 & i));
                                    int i184 = ~(72 | i);
                                    int i185 = (i183 & i184) | (i183 ^ i184);
                                    int i186 = (i27 ^ i173) | (i27 & i173);
                                    int i187 = ~((i186 & (-73)) | (i186 ^ (-73)));
                                    int i188 = (i182 - (~(-(-(((i185 & i187) | (i185 ^ i187)) * (-568)))))) - 1;
                                    int i189 = ~((i24 ^ i173) | (i173 & i24));
                                    int i190 = ~((i27 ^ (-73)) | (i27 & (-73)));
                                    int i191 = (i189 & i190) | (i189 ^ i190);
                                    int i192 = ~((i176 ^ i) | (i176 & i));
                                    int i193 = -(-(((i191 & i192) | (i191 ^ i192)) * 568));
                                    i7 = (i188 & i193) + (i193 | i188);
                                } catch (Throwable th2) {
                                    th = th2;
                                }
                                try {
                                    Object[] objArr10 = new Object[1];
                                    a(b, i5, i6, sResolveSize, i7, objArr10);
                                    Object objInvoke2 = cls.getMethod((String) objArr10[0], null).invoke(context, null);
                                    int i194 = MediaBrowserCompatItemReceiver;
                                    int i195 = (i194 & 87) + (i194 | 87);
                                    AudioAttributesImplApi26Parcelizer = i195 % 128;
                                    declaredConstructor = i195 % 2;
                                    try {
                                        declaredConstructor = new Object[]{objInvoke2, 64};
                                        byte bIndexOf2 = (byte) TextUtils.indexOf("", "");
                                        int longPressTimeout = 2024961976 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                        int offsetBefore = TextUtils.getOffsetBefore("", 0);
                                        int i196 = MediaBrowserCompatItemReceiver;
                                        int i197 = (i196 & 25) + (i196 | 25);
                                        AudioAttributesImplApi26Parcelizer = i197 % 128;
                                        int i198 = i197 % 2;
                                        int i199 = offsetBefore * 765;
                                        int i200 = ((i199 | (-1983178370)) << 1) - (i199 ^ (-1983178370));
                                        int i201 = (i27 ^ offsetBefore) | (i27 & offsetBefore);
                                        int i202 = ~i201;
                                        int i203 = i200 + (((i202 & 1978615054) | (1978615054 ^ i202)) * 764);
                                        int i204 = ~offsetBefore;
                                        int i205 = ~(i204 | 1978615054);
                                        int i206 = ~((i27 ^ 1978615054) | (i27 & 1978615054));
                                        int i207 = (i203 - (~(((i205 & i206) | (i205 ^ i206)) * (-1528)))) - 1;
                                        int i208 = ~((i204 & 1978615054) | (i204 ^ 1978615054));
                                        int i209 = ~(offsetBefore | (-1978615055));
                                        int i210 = (i207 - (~(((~i201) | ((i209 & i208) | (i208 ^ i209))) * 764))) - 1;
                                        int i211 = -(-(ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                                        short s3 = (short) ((i211 ^ (-1)) + (i211 << 1));
                                        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
                                        int i212 = MediaBrowserCompatItemReceiver;
                                        int i213 = (i212 & 49) + (i212 | 49);
                                        AudioAttributesImplApi26Parcelizer = i213 % 128;
                                        int i214 = i213 % 2;
                                        int i215 = (jElapsedRealtimeNanos > 0L ? 1 : (jElapsedRealtimeNanos == 0L ? 0 : -1));
                                        int iWrite5 = ai.write();
                                        int i216 = i215 * (-743);
                                        int i217 = (i216 & 54982) + (i216 | 54982);
                                        int i218 = (i215 ^ (-74)) | (i215 & (-74));
                                        int i219 = (~i218) | (~((i215 ^ iWrite5) | (i215 & iWrite5)));
                                        int i220 = ~((iWrite5 ^ (-74)) | (iWrite5 & (-74)));
                                        int i221 = ((i219 & i220) | (i219 ^ i220)) * (-744);
                                        int i222 = (i217 ^ i221) + ((i221 & i217) << 1);
                                        int i223 = ~iWrite5;
                                        int i224 = ~i215;
                                        int i225 = ~((i224 & 73) | (i224 ^ 73));
                                        int i226 = i222 + (((i225 & i223) | (i223 ^ i225)) * 744) + (((i218 ^ iWrite5) | (iWrite5 & i218)) * 744);
                                        Object[] objArr11 = new Object[1];
                                        a(bIndexOf2, longPressTimeout, i210, s3, i226, objArr11);
                                        Class<?> cls5 = Class.forName((String) objArr11[0]);
                                        byte bMyPid = (byte) (Process.myPid() >> 22);
                                        int i227 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                                        int i228 = ((i227 | 2024961981) << 1) - (i227 ^ 2024961981);
                                        int i229 = -TextUtils.lastIndexOf("", '0', 0, 0);
                                        int i230 = ((i229 | 1978615086) << 1) - (i229 ^ 1978615086);
                                        short packedPositionGroup = (short) ExpandableListView.getPackedPositionGroup(0L);
                                        int offsetAfter2 = TextUtils.getOffsetAfter("", 0);
                                        Object[] objArr12 = new Object[1];
                                        a(bMyPid, i228, i230, packedPositionGroup, ((offsetAfter2 | (-73)) << 1) - (offsetAfter2 ^ (-73)), objArr12);
                                        String str5 = (String) objArr12[0];
                                        Class<?>[] clsArr = {String.class, Integer.TYPE};
                                        int i231 = AudioAttributesImplApi26Parcelizer;
                                        int i232 = (i231 ^ 93) + ((i231 & 93) << 1);
                                        MediaBrowserCompatItemReceiver = i232 % 128;
                                        int i233 = i232 % 2;
                                        Object objInvoke3 = cls5.getMethod(str5, clsArr).invoke(objInvoke, declaredConstructor);
                                        try {
                                            Object[] objArr13 = new Object[1];
                                            b(1 - View.resolveSize(0, 0), new char[]{59239, 23253, 6765, 41404, 59142, 5876, 33431, 17699, 54836, 10039, 54227, 47035, 34172, 62589, 57621, 59053, 29878, 47800, 13899, 55603, 9191, 19335, 18381, 2097, 4394, 6349, 38092, 31428, 49256, 10503, 55842, 44423, 49061, 65097}, objArr13);
                                            Class<?> cls6 = Class.forName((String) objArr13[0]);
                                            byte bAlpha = (byte) Color.alpha(0);
                                            int i234 = 2024961993 - (~(-(-TextUtils.indexOf("", "", 0, 0))));
                                            int i235 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                                            int i236 = ((i235 | 1978615101) << 1) - (i235 ^ 1978615101);
                                            short s4 = (short) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                                            int i237 = -TextUtils.lastIndexOf("", '0', 0, 0);
                                            int i238 = (i237 ^ (-74)) + ((i237 & (-74)) << 1);
                                            Object[] objArr14 = new Object[1];
                                            a(bAlpha, i234, i236, s4, i238, objArr14);
                                            Object[] objArr15 = (Object[]) cls6.getField((String) objArr14[0]).get(objInvoke3);
                                            length = objArr15.length;
                                            i8 = 0;
                                            r0 = objArr15;
                                        } catch (Throwable unused) {
                                        }
                                        while (i8 < length) {
                                            declaredConstructor = r0[i8];
                                            Object[] objArr16 = new Object[1];
                                            b(-(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), new char[]{33412, 40388, 38725, 26100, 33500, 53669, 4078, 33065, 45953}, objArr16);
                                            try {
                                                Object[] objArr17 = {(String) objArr16[0]};
                                                int i239 = -(ViewConfiguration.getLongPressTimeout() >> 16);
                                                Object[] objArr18 = new Object[1];
                                                b(((i239 | 1) << 1) - (i239 ^ 1), new char[]{13060, 371, 51321, 24677, 13166, 19805, 20625, 34025, 534, 31883, 454, 30255, 20745, 44998, 13062, 10100, 41161, 57694, 58440, 6305, 63366, 4152, 38361, 51707, 50509, 17274, 18119, 47893, 5130, 29357, 2076, 27729, 27604, 42469, 14717, 23957, 47751, 55080, 60008, 3802, 34913}, objArr18);
                                                Class<?> cls7 = Class.forName((String) objArr18[0]);
                                                int i240 = MediaBrowserCompatItemReceiver + 67;
                                                AudioAttributesImplApi26Parcelizer = i240 % 128;
                                                if (i240 % 2 != 0) {
                                                    Object[] objArr19 = new Object[1];
                                                    b(0 / (ViewConfiguration.getScrollDefaultDelay() % 57), new char[]{13744, 16837, 58722, 2581, 13783, 3567, 32136, 61105, 1250, 15421, 11468, 7261, 22438, 61281, 7697}, objArr19);
                                                    str = (String) objArr19[0];
                                                    i10 = 0;
                                                    i9 = 1;
                                                } else {
                                                    int i241 = -(ViewConfiguration.getScrollDefaultDelay() >> 16);
                                                    i9 = 1;
                                                    Object[] objArr20 = new Object[1];
                                                    b((i241 ^ 1) + ((i241 & 1) << 1), new char[]{13744, 16837, 58722, 2581, 13783, 3567, 32136, 61105, 1250, 15421, 11468, 7261, 22438, 61281, 7697}, objArr20);
                                                    i10 = 0;
                                                    str = (String) objArr20[0];
                                                }
                                                Class<?>[] clsArr2 = new Class[i9];
                                                clsArr2[i10] = String.class;
                                                Object objInvoke4 = cls7.getMethod(str, clsArr2).invoke(null, objArr17);
                                                try {
                                                    byte bKeyCodeFromString = (byte) KeyEvent.keyCodeFromString("");
                                                    int iResolveSize = View.resolveSize(i10, i10);
                                                    int i242 = ((iResolveSize | 2024961976) << 1) - (iResolveSize ^ 2024961976);
                                                    int packedPositionChild2 = ExpandableListView.getPackedPositionChild(0L);
                                                    int i243 = ~((i24 ^ 1978615112) | (i24 & 1978615112));
                                                    int i244 = (packedPositionChild2 * 522) + 1912292800 + (((packedPositionChild2 ^ i243) | (i243 & packedPositionChild2)) * (-1042));
                                                    int i245 = -(-(((i ^ 1978615112) | (i & 1978615112)) * 521));
                                                    int i246 = (i244 ^ i245) + ((i245 & i244) << 1);
                                                    int i247 = ~packedPositionChild2;
                                                    int i248 = MediaBrowserCompatItemReceiver;
                                                    int i249 = (i248 & 77) + (i248 | 77);
                                                    AudioAttributesImplApi26Parcelizer = i249 % 128;
                                                    if (i249 % 2 != 0) {
                                                        try {
                                                            throw null;
                                                        } catch (Throwable th3) {
                                                            th = th3;
                                                            Throwable cause2 = th.getCause();
                                                            if (cause2 != null) {
                                                                throw cause2;
                                                            }
                                                            throw th;
                                                        }
                                                    }
                                                    int i250 = ~((i247 & (-1978615113)) | (i247 ^ (-1978615113)));
                                                    int i251 = ~packedPositionChild2;
                                                    int i252 = ~((i251 & i) | (i251 ^ i));
                                                    int i253 = (i250 & i252) | (i250 ^ i252);
                                                    int i254 = ~((i24 ^ packedPositionChild2) | (i24 & packedPositionChild2) | 1978615112);
                                                    int i255 = -(-(521 * ((i253 & i254) | (i253 ^ i254))));
                                                    int i256 = ((i246 | i255) << 1) - (i246 ^ i255);
                                                    short sAlpha = (short) Color.alpha(0);
                                                    float maxVolume = AudioTrack.getMaxVolume();
                                                    int i257 = MediaBrowserCompatItemReceiver;
                                                    int i258 = length;
                                                    int i259 = (i257 ^ 113) + ((i257 & 113) << 1);
                                                    AudioAttributesImplApi26Parcelizer = i259 % 128;
                                                    if (i259 % 2 != 0) {
                                                        int i260 = (-72) >> (maxVolume > BitmapDescriptorFactory.HUE_RED ? 1 : (maxVolume == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                                                        Object[] objArr21 = new Object[1];
                                                        a(bKeyCodeFromString, i242, i256, sAlpha, i260, objArr21);
                                                        Class<?> cls8 = Class.forName((String) objArr21[0]);
                                                        Object[] objArr22 = new Object[1];
                                                        b(-MotionEvent.axisFromString(""), new char[]{39163, 2434, 24208, 12281, 39055, 17826, 50764, 52077, 43443, 29804, 38667, 14754, 64241, 42788, 42495}, objArr22);
                                                        str2 = (String) objArr22[0];
                                                        cls2 = cls8;
                                                    } else {
                                                        Object[] objArr23 = new Object[1];
                                                        a(bKeyCodeFromString, i242, i256, sAlpha, (-72) - (maxVolume > BitmapDescriptorFactory.HUE_RED ? 1 : (maxVolume == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr23);
                                                        cls2 = Class.forName((String) objArr23[0]);
                                                        Object[] objArr24 = new Object[1];
                                                        b(-MotionEvent.axisFromString(""), new char[]{39163, 2434, 24208, 12281, 39055, 17826, 50764, 52077, 43443, 29804, 38667, 14754, 64241, 42788, 42495}, objArr24);
                                                        str2 = (String) objArr24[0];
                                                    }
                                                    ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream((byte[]) cls2.getMethod(str2, null).invoke(declaredConstructor, null));
                                                    int i261 = MediaBrowserCompatItemReceiver + 115;
                                                    AudioAttributesImplApi26Parcelizer = i261 % 128;
                                                    declaredConstructor = i261 % 2;
                                                    try {
                                                        declaredConstructor = new Object[]{byteArrayInputStream};
                                                        int i262 = -(Process.myTid() >> 22);
                                                        Object[] objArr25 = new Object[1];
                                                        b((i262 & 1) + (i262 | 1), new char[]{13060, 371, 51321, 24677, 13166, 19805, 20625, 34025, 534, 31883, 454, 30255, 20745, 44998, 13062, 10100, 41161, 57694, 58440, 6305, 63366, 4152, 38361, 51707, 50509, 17274, 18119, 47893, 5130, 29357, 2076, 27729, 27604, 42469, 14717, 23957, 47751, 55080, 60008, 3802, 34913}, objArr25);
                                                        Class<?> cls9 = Class.forName((String) objArr25[0]);
                                                        byte jumpTapTimeout = (byte) (ViewConfiguration.getJumpTapTimeout() >> 16);
                                                        int i263 = -View.MeasureSpec.getSize(0);
                                                        int iWrite6 = ai.write();
                                                        int i264 = i263 * (-103);
                                                        int i265 = (i264 ^ 1882313358) + ((i264 & 1882313358) << 1);
                                                        int i266 = ~i263;
                                                        int i267 = ~((i266 ^ (-2024961983)) | (i266 & (-2024961983)));
                                                        int i268 = ~((-2024961983) | iWrite6);
                                                        int i269 = ((i267 ^ i268) | (i268 & i267)) * 104;
                                                        int i270 = (i265 & i269) + (i265 | i269);
                                                        int i271 = ~iWrite6;
                                                        int i272 = (i271 ^ i263) | (i271 & i263);
                                                        int i273 = (~((i272 ^ 2024961982) | (i272 & 2024961982))) * (-104);
                                                        int i274 = ((i270 | i273) << 1) - (i273 ^ i270);
                                                        int i275 = (i263 | iWrite6) * 104;
                                                        int i276 = (i274 & i275) + (i274 | i275);
                                                        int i277 = -MotionEvent.axisFromString("");
                                                        int iWrite7 = ai.write();
                                                        int i278 = i277 * 471;
                                                        int i279 = (i278 ^ (-80173234)) + ((i278 & (-80173234)) << 1);
                                                        int i280 = -(-(((i277 ^ 1978615138) | (i277 & 1978615138)) * (-470)));
                                                        int i281 = (i279 ^ i280) + ((i279 & i280) << 1);
                                                        int i282 = ~((~i277) | (-1978615139));
                                                        int i283 = ~((-1978615139) | iWrite7);
                                                        int i284 = (i282 ^ i283) | (i283 & i282);
                                                        int i285 = ~iWrite7;
                                                        int i286 = (i285 ^ i277) | (i285 & i277);
                                                        ?? r31 = r0;
                                                        int i287 = ~(i286 | 1978615138);
                                                        int i288 = (i281 - (~(-(-(((i284 ^ i287) | (i287 & i284)) * (-470)))))) - 1;
                                                        int i289 = ((-1978615139) ^ i277) | ((-1978615139) & i277);
                                                        int i290 = ~((i289 & iWrite7) | (i289 ^ iWrite7));
                                                        int i291 = ~((i286 ^ 1978615138) | (i286 & 1978615138));
                                                        int i292 = ((i290 & i291) | (i290 ^ i291)) * 470;
                                                        int i293 = (i288 ^ i292) + ((i288 & i292) << 1);
                                                        short trimmedLength = (short) TextUtils.getTrimmedLength("");
                                                        int longPressTimeout2 = ViewConfiguration.getLongPressTimeout() >> 16;
                                                        int i294 = ((longPressTimeout2 | (-73)) << 1) - (longPressTimeout2 ^ (-73));
                                                        Object[] objArr26 = new Object[1];
                                                        a(jumpTapTimeout, i276, i293, trimmedLength, i294, objArr26);
                                                        Object objInvoke5 = cls9.getMethod((String) objArr26[0], InputStream.class).invoke(objInvoke4, declaredConstructor);
                                                        try {
                                                            int i295 = -(-KeyEvent.keyCodeFromString(""));
                                                            Object[] objArr27 = new Object[1];
                                                            b(((i295 | 1) << 1) - (i295 ^ 1), new char[]{36286, 30362, 38250, 982, 36308, 15028, 3458, 59226, 48300, 2914, 23765, 5532, 61363, 55343, 28181, 17607, 7795, 38583, 47451, 31506, 18748, 26577, 51402, 43603, 31655, 13521, 7065, 55436, 43699, 1375, 21784, 4074, 54652, 53760, 25675, 15910, 1066, 41168}, objArr27);
                                                            Class<?> cls10 = Class.forName((String) objArr27[0]);
                                                            declaredConstructor = ViewConfiguration.getPressedStateDuration();
                                                            byte b5 = (byte) (declaredConstructor >> 16);
                                                            int i296 = MediaBrowserCompatItemReceiver + 69;
                                                            AudioAttributesImplApi26Parcelizer = i296 % 128;
                                                            int i297 = i296 % 2;
                                                            int i298 = 2024961981 - (~(-(-TextUtils.indexOf("", "", 0))));
                                                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1978615158;
                                                            int i299 = MediaBrowserCompatItemReceiver;
                                                            int i300 = (i299 & 33) + (i299 | 33);
                                                            AudioAttributesImplApi26Parcelizer = i300 % 128;
                                                            int i301 = i300 % 2;
                                                            short sArgb = (short) Color.argb(0, 0, 0, 0);
                                                            int i302 = -(KeyEvent.getMaxKeyCode() >> 16);
                                                            int i303 = (i302 ^ (-73)) + ((i302 & (-73)) << 1);
                                                            Object[] objArr28 = new Object[1];
                                                            a(b5, i298, scrollDefaultDelay, sArgb, i303, objArr28);
                                                            declaredConstructor = 0;
                                                            if (!objNewInstance.equals(cls10.getMethod((String) objArr28[0], null).invoke(objInvoke5, null))) {
                                                                try {
                                                                    int i304 = -(ViewConfiguration.getPressedStateDuration() >> 16);
                                                                    int i305 = ~i304;
                                                                    int i306 = (i305 & (-2)) | (i305 ^ (-2));
                                                                    int i307 = ~((i306 & i) | (i306 ^ i));
                                                                    int i308 = (-2) | i24;
                                                                    int i309 = ~((i308 & i304) | (i308 ^ i304));
                                                                    int i310 = ((i304 * 51) - 49) + (((i304 ^ i) | (i304 & i)) * (-50)) + (((i307 & i309) | (i307 ^ i309)) * 50);
                                                                    int i311 = ~((-2) | i27);
                                                                    int i312 = ~(((-2) ^ i304) | ((-2) & i304));
                                                                    int i313 = (i311 & i312) | (i311 ^ i312);
                                                                    int i314 = ~((i304 & i27) | (i27 ^ i304));
                                                                    Object[] objArr29 = new Object[1];
                                                                    b((i310 - (~(-(-(((i314 & i313) | (i313 ^ i314)) * 50))))) - 1, new char[]{36286, 30362, 38250, 982, 36308, 15028, 3458, 59226, 48300, 2914, 23765, 5532, 61363, 55343, 28181, 17607, 7795, 38583, 47451, 31506, 18748, 26577, 51402, 43603, 31655, 13521, 7065, 55436, 43699, 1375, 21784, 4074, 54652, 53760, 25675, 15910, 1066, 41168}, objArr29);
                                                                    Class<?> cls11 = Class.forName((String) objArr29[0]);
                                                                    byte deadChar = (byte) KeyEvent.getDeadChar(0, 0);
                                                                    int i315 = -(-AndroidCharacter.getMirror('0'));
                                                                    int i316 = ((i315 | 2024961934) << 1) - (i315 ^ 2024961934);
                                                                    int i317 = -(ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                                                                    int i318 = (i317 * 375) - 556773949;
                                                                    int i319 = ~i317;
                                                                    int i320 = -(-(((~((i27 ^ i317) | (i27 & i317))) | (~((i319 ^ 1978615159) | (i319 & 1978615159)))) * (-374)));
                                                                    int i321 = ((i318 | i320) << 1) - (i320 ^ i318);
                                                                    int i322 = -(-((~(((-1978615160) & i317) | ((-1978615160) ^ i317))) * 748));
                                                                    int i323 = (i321 & i322) + (i322 | i321);
                                                                    int i324 = ~i317;
                                                                    int i325 = ~((i324 ^ (-1978615160)) | (i324 & (-1978615160)));
                                                                    int i326 = ~(i317 | i24);
                                                                    int i327 = ((i325 & i326) | (i325 ^ i326)) * 374;
                                                                    int i328 = (i323 & i327) + (i327 | i323);
                                                                    short defaultSize = (short) View.getDefaultSize(0, 0);
                                                                    int scrollDefaultDelay2 = ViewConfiguration.getScrollDefaultDelay() >> 16;
                                                                    int i329 = ((scrollDefaultDelay2 | (-73)) << 1) - (scrollDefaultDelay2 ^ (-73));
                                                                    Object[] objArr30 = new Object[1];
                                                                    a(deadChar, i316, i328, defaultSize, i329, objArr30);
                                                                    declaredConstructor = cls11.getMethod((String) objArr30[0], null);
                                                                    ?? r2 = r30;
                                                                    if (!r2.equals(declaredConstructor.invoke(objInvoke5, null))) {
                                                                        i8 = (i8 | 1) + (i8 & 1);
                                                                        r30 = r2;
                                                                        length = i258;
                                                                        r0 = r31;
                                                                    }
                                                                } catch (Throwable th4) {
                                                                    Throwable cause3 = th4.getCause();
                                                                    if (cause3 != null) {
                                                                        throw cause3;
                                                                    }
                                                                    throw th4;
                                                                }
                                                            }
                                                            Object[] objArr31 = {new int[]{(i & (-2)) | (i27 & 1)}, null, new int[]{i}, new int[1]};
                                                            int i330 = 732104919 + (((~((-136280725) | i)) | 410112 | (~(1863924213 | i))) * (-754)) + (((~((-410113) | i)) | (~(1864334325 | i27))) * (-754)) + (((-136280725) | i27) * 754);
                                                            int i331 = (-31025) - (~(-(-(i330 * 971))));
                                                            int i332 = ~i330;
                                                            int i333 = ~((i332 ^ 16) | (i332 & 16));
                                                            int i334 = ~((i24 & i330) | (i24 ^ i330));
                                                            int i335 = (((i331 - (~(((i334 & i333) | (i333 ^ i334)) * (-970)))) - 1) - (~(-(-((~(((-17) & i330) | ((-17) ^ i330))) * 1940))))) - 1;
                                                            int i336 = ~((i332 & (-17)) | ((-17) ^ i332));
                                                            int i337 = ~(i330 | i27);
                                                            int i338 = i335 + (((i336 & i337) | (i336 ^ i337)) * 970);
                                                            int iWrite8 = ai.write();
                                                            int i339 = i338 * (-743);
                                                            int i340 = i2 * (-743);
                                                            int i341 = (i339 & i340) + (i339 | i340);
                                                            int i342 = (i338 ^ i2) | (i338 & i2);
                                                            int i343 = i341 + (((~i342) | (~((i338 ^ iWrite8) | (i338 & iWrite8))) | (~((i2 ^ iWrite8) | (i2 & iWrite8)))) * (-744));
                                                            int i344 = ~iWrite8;
                                                            int i345 = ~i338;
                                                            int i346 = ~i2;
                                                            int i347 = ~((i345 & i346) | (i345 ^ i346));
                                                            int i348 = -(-(((i347 & i344) | (i344 ^ i347)) * 744));
                                                            int i349 = ((i343 | i348) << 1) - (i348 ^ i343);
                                                            int i350 = -(-(((i342 ^ iWrite8) | (iWrite8 & i342)) * 744));
                                                            int i351 = ((i349 | i350) << 1) - (i350 ^ i349);
                                                            int i352 = i351 << 13;
                                                            int i353 = (i352 & (~i351)) | ((~i352) & i351);
                                                            int i354 = i353 ^ (i353 >>> 17);
                                                            ((int[]) objArr31[3])[0] = i354 ^ (i354 << 5);
                                                            return objArr31;
                                                        } catch (Throwable th5) {
                                                            Throwable cause4 = th5.getCause();
                                                            if (cause4 != null) {
                                                                throw cause4;
                                                            }
                                                            throw th5;
                                                        }
                                                    } catch (Throwable th6) {
                                                        Throwable cause5 = th6.getCause();
                                                        if (cause5 != null) {
                                                            throw cause5;
                                                        }
                                                        throw th6;
                                                    }
                                                } catch (Throwable th7) {
                                                    th = th7;
                                                }
                                            } catch (Throwable th8) {
                                                Throwable cause6 = th8.getCause();
                                                if (cause6 != null) {
                                                    throw cause6;
                                                }
                                                throw th8;
                                            }
                                            declaredConstructor = i2;
                                        }
                                        declaredConstructor = i2;
                                    } catch (Throwable th9) {
                                        Throwable cause7 = th9.getCause();
                                        if (cause7 != null) {
                                            throw cause7;
                                        }
                                        throw th9;
                                    }
                                } catch (Throwable th10) {
                                    th = th10;
                                    Throwable cause8 = th.getCause();
                                    if (cause8 != null) {
                                        throw cause8;
                                    }
                                    throw th;
                                }
                            } catch (Throwable th11) {
                                Throwable cause9 = th11.getCause();
                                if (cause9 != null) {
                                    throw cause9;
                                }
                                throw th11;
                            }
                        } catch (Throwable th12) {
                            th = th12;
                        }
                    } catch (Throwable unused2) {
                    }
                } catch (Throwable th13) {
                    Throwable cause10 = th13.getCause();
                    if (cause10 != null) {
                        throw cause10;
                    }
                    throw th13;
                }
            } catch (Throwable unused3) {
                declaredConstructor = i2;
            }
        } else {
            declaredConstructor = i2;
        }
        Object[] objArr32 = {new int[]{i}, null, new int[]{i}, new int[1]};
        int i355 = AudioAttributesImplApi26Parcelizer + 5;
        MediaBrowserCompatItemReceiver = i355 % 128;
        int i356 = i355 % 2;
        int i357 = ~i;
        int i358 = 1341451778 + ((1572371321 | i357) * (-369)) + (((~((-427834226) | i357)) | 1572370712) * (-369)) + (((~(i | 427834225)) | 1144537096 | (~(i357 | (-610)))) * 369);
        int iWrite9 = ai.write();
        int i359 = i358 * 71;
        int i360 = declaredConstructor * (-69);
        int i361 = (i359 ^ i360) + ((i359 & i360) << 1);
        int i362 = ~i358;
        int i363 = (i362 & declaredConstructor) | (i362 ^ declaredConstructor);
        int i364 = i361 + (((~i363) | (~(declaredConstructor | iWrite9))) * (-140)) + ((~((i358 ^ declaredConstructor) | (i358 & declaredConstructor) | iWrite9)) * 70);
        int i365 = ~i363;
        int i366 = ~declaredConstructor;
        int i367 = ~((i366 & i358) | (i366 ^ i358));
        int i368 = (i365 & i367) | (i365 ^ i367);
        int i369 = ~((iWrite9 & i358) | (i358 ^ iWrite9));
        int i370 = (i364 - (~(-(-(((i369 & i368) | (i368 ^ i369)) * 70))))) - 1;
        int i371 = i370 << 13;
        int i372 = (i371 | i370) & (~(i370 & i371));
        int i373 = i372 >>> 17;
        int i374 = (i372 | i373) & (~(i372 & i373));
        ((int[]) objArr32[3])[0] = i374 ^ (i374 << 5);
        int i375 = MediaBrowserCompatItemReceiver + 97;
        AudioAttributesImplApi26Parcelizer = i375 % 128;
        int i376 = i375 % 2;
        return objArr32;
    }
}
