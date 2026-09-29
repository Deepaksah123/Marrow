package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
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
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zaaa extends addObserverForBackInvoker implements SubjectStat {
    private static short[] MediaBrowserCompatCustomActionResultReceiver;
    private getSubjectStat IconCompatParcelizer;
    private volatile isHighlighted write;
    private static final byte[] $$c = {0, -75, -45, -77};
    private static final int $$f = 220;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {5, 107, -8, 109, -54, 68, 9, 26, -35, TarConstants.LF_BLK, 10, 17, -22, 33, 28, -10, -5, 36, 6, 22, -69, 57, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -8, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -54, 68, 9, 26, -23, 26, 30, 0, 16, 4, -2, 7, 14};
    private static final int $$h = 249;
    private static final byte[] $$a = {93, -16, 105, -74, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 85;
    private static int RatingCompat = 0;
    private static int MediaDescriptionCompat = 1;
    private static long RemoteActionCompatParcelizer = 8374839600508195195L;
    private static int AudioAttributesImplApi21Parcelizer = -1919878801;
    private static int AudioAttributesImplBaseParcelizer = -819363121;
    private static int MediaBrowserCompatItemReceiver = -230639379;
    private static byte[] AudioAttributesImplApi26Parcelizer = {-77, 121, -121, 101, 73, 72, -103, -76, -74, TarConstants.LF_GNUTYPE_LONGNAME, -65, -74, TarConstants.LF_GNUTYPE_LONGNAME, TarConstants.LF_GNUTYPE_LONGLINK, -66, 123, -124, 124, -75, -73, -75, -100, 72, -65, 74, -74, 123, -124, 102, -103, -77, -73, 73, TarConstants.LF_GNUTYPE_LONGNAME, 73, -66, 72, -73, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -98, -78, TarConstants.LF_GNUTYPE_LONGLINK, -75, 74, 111, TarConstants.LF_GNUTYPE_LONGLINK, -77, -100, 101, -124, -74, 121, 73, -102, -75, 72, 72, 97, -99, -80, 122, -73, -124, -75, 72, -74, 99, -102, 100, -122, 121, -121, 74, -78, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, TarConstants.LF_GNUTYPE_LONGNAME, -75, -104, 99, -122, 73, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -124, 124, -124, -74, 124, -124, 121, -77, TarConstants.LF_GNUTYPE_LONGLINK, -103, 97, -102, TarConstants.LF_GNUTYPE_LONGLINK, -80, TarConstants.LF_GNUTYPE_LONGNAME, -76, 77, 98, 72, -101, -80, 72, -75, 72, -74, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -74, -98, 99, -73, -76, -98, -80, TarConstants.LF_GNUTYPE_LONGLINK, 102, -73, -101, 98, -122, -74, 122, -76, -121, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 72, -79, -66, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -90, -127, 74, 11, -16, 12, -74, -71, 73, 78, -78, -115, 113, 78, -72, -123, 117, 73, -69, -126, 126, 68, -90, 91, -77, 73, -72, 69, -90, 91, -71, -114, 13, -74, -91, 73, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -92, TarConstants.LF_GNUTYPE_LONGLINK, 68, -67, 67, -15, 12, -72, 65, 78, -79, 74, 78, -70, -76, -65, 74, -126, -73, 66, 112, -76, TarConstants.LF_GNUTYPE_LONGLINK, -73, -69, -77, 77, -76, -76, 66, -73, 98, -121, 124, -76, 73, -103, -78, 102, -99, 102, -114, 74, 73, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, -98, -69, 65, -76, 73, -75, -80, 112, -103, 101, -103, -68, TarConstants.LF_GNUTYPE_LONGLINK, -73, 72, TarConstants.LF_GNUTYPE_LONGLINK, 72, 98, -122, 72, -65, 70, -74, 77, -111, -110, 112, 78, -70, 66, -119, 122, 92, -94, 64, -74, 66, -101, 108, 66, -91, -82, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -78, -68, 66, -79, -66, -74, TarConstants.LF_GNUTYPE_LONGNAME, -75, TarConstants.LF_GNUTYPE_LONGLINK, 73, -74, -77, 72, -77, 77, -78, 78, -73, -73, -73, -73, -73, -73, -73, -73};
    private final Object read = new Object();
    private boolean AudioAttributesCompatParcelizer = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(byte r6, int r7, int r8) {
        /*
            int r7 = r7 * 2
            int r0 = r7 + 1
            int r6 = r6 + 4
            int r8 = r8 * 8
            int r8 = r8 + 104
            byte[] r1 = kotlin.zaaa.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L21:
            int r6 = r6 + 1
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaaa.$$i(byte, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 + 4
            int r8 = 114 - r8
            int r6 = 191 - r6
            byte[] r1 = kotlin.zaaa.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L28:
            int r6 = r6 + r3
            int r6 = r6 + (-1)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaaa.c(short, short, int, java.lang.Object[]):void");
    }

    private static void d(int i, int i2, int i3, Object[] objArr) {
        int i4 = 87 - i3;
        int i5 = 114 - i2;
        byte[] bArr = $$g;
        byte[] bArr2 = new byte[47 - i];
        int i6 = 46 - i;
        int i7 = -1;
        if (bArr == null) {
            i5 = (i6 + i5) - 11;
            i4++;
        }
        while (true) {
            i7++;
            bArr2[i7] = (byte) i5;
            if (i7 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i5 = (i5 + bArr[i4]) - 11;
                i4++;
            }
        }
    }

    zaaa() {
        AudioAttributesImplApi21Parcelizer();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.zaaa.2
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                zaaa.this.AudioAttributesImplBaseParcelizer();
            }
        });
        int i2 = RatingCompat + 69;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 52 / 0;
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        getSubjectStat getsubjectstatWrite = MediaBrowserCompatItemReceiver().write();
        this.IconCompatParcelizer = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            int i2 = MediaDescriptionCompat + 57;
            RatingCompat = i2 % 128;
            int i3 = i2 % 2;
            this.IconCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            int i4 = RatingCompat + 103;
            MediaDescriptionCompat = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        int i3 = $11 + 21;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i5 = $11 + 95;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i7 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(RemoteActionCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) View.MeasureSpec.makeMeasureSpec(0, 0), 12424 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), AndroidCharacter.getMirror('0') - 28, -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char scrollBarFadeDuration = (char) (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int i8 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 1868;
                    int iKeyCodeFromString = 10 - KeyEvent.keyCodeFromString("");
                    byte b = $$c[0];
                    byte b2 = (byte) (b - 1);
                    byte b3 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read(scrollBarFadeDuration, i8, iKeyCodeFromString, 1983509525, false, $$i(b2, b3, b3), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
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

    private static void b(int i, short s, int i2, int i3, byte b, Object[] objArr) throws Throwable {
        boolean z;
        int length;
        byte[] bArr;
        int i4 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(AudioAttributesImplBaseParcelizer)};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            long j = -1;
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 24298 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 11, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            int i5 = iIntValue == -1 ? 1 : 0;
            if (i5 != 0) {
                byte[] bArr2 = AudioAttributesImplApi26Parcelizer;
                if (bArr2 != null) {
                    int i6 = $11 + 23;
                    $10 = i6 % 128;
                    if (i6 % 2 != 0) {
                        length = bArr2.length;
                        bArr = new byte[length];
                    } else {
                        length = bArr2.length;
                        bArr = new byte[length];
                    }
                    int i7 = 0;
                    while (i7 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr2[i7])};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            char cAxisFromString = (char) (MotionEvent.axisFromString("") + 1);
                            int deadChar = 3082 - KeyEvent.getDeadChar(0, 0);
                            int i8 = (SystemClock.currentThreadTimeMillis() > j ? 1 : (SystemClock.currentThreadTimeMillis() == j ? 0 : -1)) + 127;
                            byte b2 = $$c[0];
                            byte b3 = (byte) (b2 - 1);
                            byte b4 = b2;
                            objRemoteActionCompatParcelizer2 = startForeground.read(cAxisFromString, deadChar, i8, 2145850993, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE});
                        }
                        bArr[i7] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i7++;
                        j = -1;
                    }
                    bArr2 = bArr;
                }
                if (bArr2 != null) {
                    byte[] bArr3 = AudioAttributesImplApi26Parcelizer;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(AudioAttributesImplApi21Parcelizer)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getLongPressTimeout() >> 16), 24297 - Color.blue(0), View.combineMeasuredStates(0, 0) + 12, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesImplBaseParcelizer) ^ 7899112766888837815L)));
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    iIntValue = (short) (((short) (((long) MediaBrowserCompatCustomActionResultReceiver[i3 + ((int) (((long) AudioAttributesImplApi21Parcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesImplBaseParcelizer) ^ 7899112766888837815L)));
                }
            }
            if (iIntValue > 0) {
                int i9 = $10 + 43;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                buildresumedownloadsintent.read = ((i3 + iIntValue) - 2) + ((int) (((long) AudioAttributesImplApi21Parcelizer) ^ 7899112766888837815L)) + i5;
                Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i2), Integer.valueOf(MediaBrowserCompatItemReceiver), sb};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 34134), 13431 - TextUtils.indexOf((CharSequence) "", '0'), ExpandableListView.getPackedPositionGroup(0L) + 21, 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr4 = AudioAttributesImplApi26Parcelizer;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i11 = 0;
                    while (i11 < length2) {
                        int i12 = $11 + 107;
                        $10 = i12 % 128;
                        if (i12 % 2 != 0) {
                            bArr5[i11] = (byte) (((long) bArr4[i11]) & 7899112766888837815L);
                        } else {
                            bArr5[i11] = (byte) (((long) bArr4[i11]) ^ 7899112766888837815L);
                            i11++;
                        }
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i13 = $11 + 7;
                    $10 = i13 % 128;
                    int i14 = i13 % 2;
                    z = true;
                } else {
                    z = false;
                }
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    if (!(!z)) {
                        int i15 = $11 + 51;
                        $10 = i15 % 128;
                        int i16 = i15 % 2;
                        byte[] bArr6 = AudioAttributesImplApi26Parcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r8]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        short[] sArr = MediaBrowserCompatCustomActionResultReceiver;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r8]) ^ 7899112766888837815L)) + s)) ^ b));
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

    /* JADX WARN: Removed duplicated region for block: B:20:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0090  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r33) {
        /*
            Method dump skipped, instruction units count: 2757
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaaa.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = RatingCompat + 29;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.IconCompatParcelizer;
        if (getsubjectstat != null) {
            int i4 = MediaDescriptionCompat + 81;
            RatingCompat = i4 % 128;
            int i5 = i4 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
        }
        int i6 = RatingCompat + 47;
        MediaDescriptionCompat = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 29 / 0;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = RatingCompat + 103;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        if (i3 != 0) {
            return ishighlightedMediaBrowserCompatItemReceiver.af_();
        }
        ishighlightedMediaBrowserCompatItemReceiver.af_();
        throw null;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = RatingCompat + 105;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        if (this.write == null) {
            synchronized (this.read) {
                if (this.write == null) {
                    this.write = AudioAttributesImplApi26Parcelizer();
                }
            }
        }
        return this.write;
    }

    protected final void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 107;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        if (!this.AudioAttributesCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = true;
        }
        int i3 = RatingCompat + 21;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 5;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = RatingCompat + 93;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return RemoteActionCompatParcelizer2;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a1  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaaa.onResume():void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = RatingCompat + 59;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr = new Object[1];
                a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10, new char[]{40223, 40412, 50354, 21815, 40318, 39506, 51990, 17125, 33520, 47829, 60310, 25145, 41598, 56140, 35330, 953, 50142, 64479, 43654, 9086, 58217, 6229, 18694, 49390, 203, 14548, 27008, 57458, 8318, 22872}, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                a('0' - AndroidCharacter.getMirror('0'), new char[]{40960, 64517, 45719, 19514, 41059, 64400, 48421, 23528, 49125, 56075, 40355, 31579, 40816, 47765, 64571, 6899, 65251, 39428, 56483, 14963, 56943, 31115}, objArr2);
                baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
                int i3 = MediaDescriptionCompat + 15;
                RatingCompat = i3 % 128;
                int i4 = i3 % 2;
            }
            if (baseContext != null) {
                int i5 = MediaDescriptionCompat + 33;
                RatingCompat = i5 % 128;
                int i6 = i5 % 2;
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - View.MeasureSpec.makeMeasureSpec(0, 0)), 6054 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) View.getDefaultSize(0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6030, View.combineMeasuredStates(0, 0) + 24, -861814097, false, "read", new Class[]{Context.class});
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
            return;
        }
        getBaseContext();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c1  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r34) {
        /*
            Method dump skipped, instruction units count: 6431
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaaa.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = RatingCompat + 117;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 67 / 0;
        }
        int i5 = RatingCompat + 3;
        MediaDescriptionCompat = i5 % 128;
        int i6 = i5 % 2;
    }
}
