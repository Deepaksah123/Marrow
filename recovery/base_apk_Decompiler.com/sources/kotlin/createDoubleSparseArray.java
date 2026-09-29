package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class createDoubleSparseArray extends addObserverForBackInvoker implements SubjectStat {
    private static short[] AudioAttributesImplApi21Parcelizer;
    private volatile isHighlighted AudioAttributesCompatParcelizer;
    private getSubjectStat IconCompatParcelizer;
    private final Object RemoteActionCompatParcelizer;
    private boolean write;
    private static final byte[] $$c = {34, 127, 65, -22};
    private static final int $$f = 60;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {112, -82, -21, -22, -13, 1, 62, -58, -9, -1, 7, -6, 6, TarConstants.LF_FIFO, -52, -14, 9, -15, 2, 5, 4, TarConstants.LF_DIR, -64, 11, -20, 14, -14, 8, 7, -12, 61, -71, 18, -2, -18, 68, -39, -14, -2, 21, -22, -25, 9, -7, 0, 79, -79, 12, 3, -4, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -13, 1, 62, -58, -9, -1, 7, -6, 6, TarConstants.LF_FIFO, -52, -14, 9, -15, 2, 5, 4, TarConstants.LF_DIR, -64, 11, -20, 14, -14, 8, 7, -12, 61, -54, -6, -2, -8, 65, -22, -38, -2, -8, TarConstants.LF_GNUTYPE_LONGLINK, -14, 4, 8, -12, 14};
    private static final int $$h = 41;
    private static final byte[] $$a = {TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, TarConstants.LF_GNUTYPE_LONGNAME, 9, 62, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 171;
    private static int MediaBrowserCompatSearchResultReceiver = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int read = -221077312;
    private static int AudioAttributesImplBaseParcelizer = -819363191;
    private static int MediaBrowserCompatCustomActionResultReceiver = 61862188;
    private static byte[] AudioAttributesImplApi26Parcelizer = {117, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 115, 1, 8, TarConstants.LF_GNUTYPE_SPARSE, TarConstants.LF_GNUTYPE_SPARSE, -54, 113, -76, 59, 10, 11, 8, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 15, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -39, TarConstants.LF_NORMAL, -8, -56, -27, -18, -1, -47, -26, -6, -25, -8, -28, TarConstants.LF_DIR, -105, -18, -21, -15, -28, -25, -46, 68, 10, -88, 118, 90, 89, -86, 69, 71, 93, 64, 71, 93, 92, 79, 12, -107, 13, 70, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 70, -83, 89, 64, 91, 71, 12, -107, 119, -86, 68, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 90, 93, 90, 79, 89, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 9, -81, 67, 92, 70, 91, 112, 92, 68, -83, 118, -107, 71, 10, 90, -85, 70, 89, 89, 114, -82, 65, 11, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -107, -123, -104, -122, -77, -22, -76, -42, 73, -41, -102, -126, -73, -100, -123, -24, -77, -42, -103, 72, -44, TarConstants.LF_GNUTYPE_LONGNAME, -44, -122, TarConstants.LF_GNUTYPE_LONGNAME, -44, 73, -125, -101, -23, -79, -22, -101, -128, -100, -124, -99, -78, -104, -21, -128, -104, -123, -104, -122, 72, -122, -18, -77, -121, -124, -18, -128, -101, -74, -121, -21, -78, -42, -122, 74, -124, -41, 72, -32, -101, TarConstants.LF_NORMAL, -107, -19, -30, TarConstants.LF_SYMLINK, -21, -97, TarConstants.LF_FIFO, -97, 39, -29, -30, -112, TarConstants.LF_CONTIG, -44, -6, -19, -30, -18, -23, -87, TarConstants.LF_SYMLINK, -98, TarConstants.LF_SYMLINK, -43, -28, -32, -31, -28, -31, -101, 63, -31, -11, -100, -116, -125, -41, -24, -74, -124, -16, -104, -49, -80, -110, -8, -122, -73, 67, -100, 109, 67, -90, -81, 121, -77, -67, 67, -78, -65, -73, 77, 80, 68, TarConstants.LF_GNUTYPE_SPARSE, 64, 77, 92, -75, 106, 89, 86, 69, 73, TarConstants.LF_GNUTYPE_SPARSE, 65, 67, 89, 71, 68, 65, 70, 65, 91, 64, 92, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73};
    private static long MediaBrowserCompatItemReceiver = 7676505892154416700L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r5, byte r6, int r7) {
        /*
            int r6 = r6 * 2
            int r0 = r6 + 1
            byte[] r1 = kotlin.createDoubleSparseArray.$$c
            int r5 = r5 + 4
            int r7 = r7 * 8
            int r7 = r7 + 104
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r6
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            r3 = r1[r5]
        L26:
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createDoubleSparseArray.$$i(short, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = 44 - r7
            int r9 = r9 + 65
            byte[] r0 = kotlin.createDoubleSparseArray.$$a
            int r8 = 190 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r7
            r4 = r2
            goto L27
        L10:
            r3 = r2
        L11:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + (-1)
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createDoubleSparseArray.c(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.createDoubleSparseArray.$$g
            int r1 = 47 - r5
            int r7 = r7 + 73
            int r6 = 133 - r6
            byte[] r1 = new byte[r1]
            int r5 = 46 - r5
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r6]
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createDoubleSparseArray.d(short, int, int, java.lang.Object[]):void");
    }

    createDoubleSparseArray() {
        this.RemoteActionCompatParcelizer = new Object();
        this.write = false;
        MediaBrowserCompatCustomActionResultReceiver();
    }

    createDoubleSparseArray(byte b) {
        super(R.layout.activity_onboard_landing);
        this.RemoteActionCompatParcelizer = new Object();
        this.write = false;
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.createDoubleSparseArray.2
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                createDoubleSparseArray.this.MediaBrowserCompatItemReceiver();
            }
        });
        int i2 = MediaBrowserCompatMediaItem + 125;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 1;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getSubjectStat getsubjectstatWrite = AudioAttributesImplBaseParcelizer().write();
        this.IconCompatParcelizer = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            int i4 = MediaBrowserCompatSearchResultReceiver + 91;
            MediaBrowserCompatMediaItem = i4 % 128;
            int i5 = i4 % 2;
            this.IconCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(MediaBrowserCompatItemReceiver ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        int i3 = $11 + 105;
        $10 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 2 / 5;
        }
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i5 = $11 + 53;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i7 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(MediaBrowserCompatItemReceiver)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 12424 - TextUtils.indexOf("", "", 0, 0), 20 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (b + 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (KeyEvent.getMaxKeyCode() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 1869, 10 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1983509525, false, $$i(b, b2, b2), new Class[]{Object.class, Object.class});
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

    private static void a(byte b, int i, int i2, short s, int i3, Object[] objArr) throws Throwable {
        boolean z;
        int i4;
        int i5;
        int i6 = 2;
        int i7 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(AudioAttributesImplBaseParcelizer)};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            long j = 0;
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 24297 - View.resolveSize(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 11, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            int i8 = -1;
            if (iIntValue == -1) {
                int i9 = $10 + 33;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                z = true;
            } else {
                z = false;
            }
            if (z) {
                byte[] bArr = AudioAttributesImplApi26Parcelizer;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i11 = 0;
                    while (i11 < length) {
                        int i12 = $11 + 47;
                        $10 = i12 % 128;
                        int i13 = i12 % i6;
                        Object[] objArr3 = {Integer.valueOf(bArr[i11])};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            char cArgb = (char) Color.argb(0, 0, 0, 0);
                            int scrollBarSize = 3082 - (ViewConfiguration.getScrollBarSize() >> 8);
                            int i14 = (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 127;
                            byte b2 = (byte) i8;
                            byte b3 = (byte) (b2 + 1);
                            objRemoteActionCompatParcelizer2 = startForeground.read(cArgb, scrollBarSize, i14, 2145850993, false, $$i(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                        }
                        bArr2[i11] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i11++;
                        i6 = 2;
                        i8 = -1;
                        j = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i15 = $11 + 95;
                    $10 = i15 % 128;
                    if (i15 % 2 != 0) {
                        byte[] bArr3 = AudioAttributesImplApi26Parcelizer;
                        try {
                            Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(read)};
                            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                            if (objRemoteActionCompatParcelizer3 == null) {
                                objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), KeyEvent.normalizeMetaState(0) + 24297, MotionEvent.axisFromString("") + 13, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) | 7899112766888837815L)) - ((int) (((long) AudioAttributesImplBaseParcelizer) * 7899112766888837815L));
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        byte[] bArr4 = AudioAttributesImplApi26Parcelizer;
                        Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(read)};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(559968424);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) - 1), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 24297, ExpandableListView.getPackedPositionGroup(0L) + 12, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (((long) bArr4[((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesImplBaseParcelizer) ^ 7899112766888837815L));
                    }
                    iIntValue = (byte) i5;
                } else {
                    iIntValue = (short) (((short) (((long) AudioAttributesImplApi21Parcelizer[i2 + ((int) (((long) read) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesImplBaseParcelizer) ^ 7899112766888837815L)));
                }
            }
            if (iIntValue > 0) {
                int i16 = $10 + 125;
                int i17 = i16 % 128;
                $11 = i17;
                int i18 = i16 % 2;
                int i19 = ((i2 + iIntValue) - 2) + ((int) (((long) read) ^ 7899112766888837815L));
                if (z) {
                    int i20 = i17 + 33;
                    $10 = i20 % 128;
                    int i21 = i20 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                buildresumedownloadsintent.read = i19 + i4;
                Object[] objArr6 = {buildresumedownloadsintent, Integer.valueOf(i), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver), sb};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (34134 - (ViewConfiguration.getFadingEdgeLength() >> 16)), 13433 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 21, 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr5 = AudioAttributesImplApi26Parcelizer;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i22 = 0; i22 < length2; i22++) {
                        bArr6[i22] = (byte) (((long) bArr5[i22]) ^ 7899112766888837815L);
                    }
                    bArr5 = bArr6;
                }
                boolean z2 = bArr5 != null;
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    if (z2) {
                        byte[] bArr7 = AudioAttributesImplApi26Parcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr7[r4]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        short[] sArr = AudioAttributesImplApi21Parcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r4]) ^ 7899112766888837815L)) + s)) ^ b));
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

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        a((byte) (ViewConfiguration.getScrollBarSize() >> 8), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 863603875, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 1039868584, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 58), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 48, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        a((byte) View.resolveSize(0, 0), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 863603922, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 1039868629, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 161), (-57) - TextUtils.getOffsetBefore("", 0), objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) - 48, new char[]{52705, 49026, 5490, 52608, 30539, 46925, 33880, 61130, 61202, 21672, 42748, 52210, 35000, 45613, 50052, 10318, 43636, 36762, 60452, 30445, 18407, 60668, 3768, 21329, 24761, 51801, 11098, 45097, 552, 10153}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                a((byte) TextUtils.getTrimmedLength(""), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 863603798, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1039868515, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 118), Color.alpha(0) - 44, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
                int i2 = MediaBrowserCompatSearchResultReceiver + 7;
                MediaBrowserCompatMediaItem = i2 % 128;
                int i3 = i2 % 2;
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i4 = MediaBrowserCompatMediaItem + 105;
                MediaBrowserCompatSearchResultReceiver = i4 % 128;
                int i5 = i4 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 4536), 6053 - TextUtils.lastIndexOf("", '0'), KeyEvent.normalizeMetaState(0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 34, new char[]{5837, 43115, 9669, 5806, 24825, 13500, 46267, 27951, 13362, 17228, 38478, 18511, 21441, 42370, 62320, 43944, 29052, 39030, 56451, 62784, 40077, 64281, 15896, 53481, 48114, 56765, 7161, 13188, 55645, 12354, 17671, 7488, 58554, 4785, 42597, 30901, 584, 30174, 33757, 23052, 8659, 43051, 60781, 42490, 19633, 35559, 52890, 32900, 27201, 60681, 11169, 57968}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    a((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 4), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 863603826, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1039868532, (short) (17 - TextUtils.getTrimmedLength("")), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 1, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    a((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) - 49), 863603911 - Color.green(0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) - 1039868483, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 58), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 35, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b(TextUtils.getOffsetBefore("", 0) + 1, new char[]{62857, 35711, 10780, 62945, 17324, 39961, 47910, 50588, 55142, 24582, 39385, 57511, 45269, 34497, 64755, 856, 37412, 47990, 54097, 23973, 32663, 55308, 12753, 30802, 22769, 65188, 5172, 39805, 14912, 4932, 19081, 46565, 1982, 12768, 43424, 53319, 57628, 22169, 35904, 62120, 49798, 35629, 58019, 3337, 45027, 43429, 49492, 10359, 35154, 52809, 9265, 19153, 27305, 60641, 6829, 25909, 13323, 395, 31043, 34699, 4469, 9855, 24508, 41558, 62082, 17617, 45592, 64869, 56359, 31084, 37217}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 34, new char[]{7419, 17374, 32508, 7362, 35671, 10594, 61315, 28835, 15945, 43183}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    a((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) + 863603826, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 1039868375, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 206), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 27, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), AndroidCharacter.getMirror('0') + 5982, 24 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer3 == null) {
            char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 13183);
            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1649;
            int iGreen = Color.green(0) + 26;
            byte b = $$a[5];
            Object[] objArr13 = new Object[1];
            c(b, (short) (b | 187), r3[113], objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(cResolveSizeAndState, packedPositionGroup, iGreen, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i6 = MediaBrowserCompatSearchResultReceiver + 95;
            MediaBrowserCompatMediaItem = i6 % 128;
            int i7 = i6 % 2;
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char c = (char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 13182);
                int i8 = 1650 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int gidForName = Process.getGidForName("") + 27;
                byte[] bArr = $$a;
                Object[] objArr14 = new Object[1];
                c(bArr[30], (short) 144, bArr[5], objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(c, i8, gidForName, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            a((byte) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 863603920 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) - 1039868373, (short) ((-58) - TextUtils.indexOf("", "", 0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 50, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a((byte) ((-1) - MotionEvent.axisFromString("")), 863603918 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1039868322, (short) (View.MeasureSpec.makeMeasureSpec(0, 0) + 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 50, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i9 = MediaBrowserCompatMediaItem + 101;
            MediaBrowserCompatSearchResultReceiver = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, 353405107};
                byte[] bArr2 = $$g;
                byte b2 = bArr2[44];
                Object[] objArr18 = new Object[1];
                d(b2, (short) (b2 | 130), (byte) 26, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                d((byte) (-bArr2[50]), (short) 84, bArr2[44], objArr19);
                Object[] objArr20 = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char keyRepeatTimeout = (char) (13183 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int minimumFlingVelocity = 1649 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                    int i11 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 25;
                    byte[] bArr3 = $$a;
                    Object[] objArr21 = new Object[1];
                    c(bArr3[30], (short) 144, bArr3[5], objArr21);
                    objRemoteActionCompatParcelizer5 = startForeground.read(keyRepeatTimeout, minimumFlingVelocity, i11, -1033747278, false, (String) objArr21[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr20);
                try {
                    Object[] objArr22 = new Object[1];
                    b((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1, new char[]{36535, 27611, 9126, 36566, 41746, 27528, 45708, 12815, 44100, 33009, 36904, 5943, 52192, 26231, 62734, 62710, 59674, 23507, 56048, 43556, 1194, 14479, 14452, 36738, 9176, 7683}, objArr22);
                    Class<?> cls5 = Class.forName((String) objArr22[0]);
                    Object[] objArr23 = new Object[1];
                    a((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 863603913, ExpandableListView.getPackedPositionGroup(0L) - 1039868306, (short) (17 - Color.green(0)), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 48, objArr23);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr23[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char offsetBefore = (char) (13183 - TextUtils.getOffsetBefore("", 0));
                        int i12 = 1649 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        int iLastIndexOf = 25 - TextUtils.lastIndexOf("", '0', 0, 0);
                        byte b3 = $$a[30];
                        Object[] objArr24 = new Object[1];
                        c(b3, (short) (b3 | 101), r6[5], objArr24);
                        objRemoteActionCompatParcelizer6 = startForeground.read(offsetBefore, i12, iLastIndexOf, 54351865, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char packedPositionGroup2 = (char) (ExpandableListView.getPackedPositionGroup(0L) + 13183);
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1649;
                        int iRgb = (-16777190) - Color.rgb(0, 0, 0);
                        byte b4 = $$a[5];
                        Object[] objArr25 = new Object[1];
                        c(b4, (short) (b4 | 187), r4[113], objArr25);
                        objRemoteActionCompatParcelizer7 = startForeground.read(packedPositionGroup2, offsetAfter, iRgb, -133433128, false, (String) objArr25[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf2);
                    objArr = objArr20;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i13 = ((int[]) objArr[3])[0];
        int i14 = ((int[]) objArr[2])[0];
        if (i14 != i13) {
            long j = -1;
            long j2 = ((long) (i14 ^ i13)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (Color.blue(0) + 4535), (Process.myPid() >> 22) + 6054, 42 - (Process.myPid() >> 22), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr26 = {429630050, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) TextUtils.indexOf("", "", 0), 6031 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 24 - TextUtils.getOffsetAfter("", 0));
                Object[] objArr27 = new Object[1];
                d((byte) ($$g[67] - 1), r1[127], r1[16], objArr27);
                cls6.getMethod((String) objArr27[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr26);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.IconCompatParcelizer;
        if (getsubjectstat != null) {
            int i2 = MediaBrowserCompatSearchResultReceiver + 115;
            MediaBrowserCompatMediaItem = i2 % 128;
            int i3 = i2 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
            int i4 = MediaBrowserCompatMediaItem + 3;
            MediaBrowserCompatSearchResultReceiver = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 41;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplBaseParcelizer().af_();
        int i4 = MediaBrowserCompatMediaItem + 39;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return objAf_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatSearchResultReceiver + 117;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 35 / 0;
        }
        return ishighlighted;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        if (this.AudioAttributesCompatParcelizer == null) {
            synchronized (this.RemoteActionCompatParcelizer) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    this.AudioAttributesCompatParcelizer = AudioAttributesImplApi21Parcelizer();
                }
            }
        }
        return this.AudioAttributesCompatParcelizer;
    }

    protected final void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 43;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        if (!this.write) {
            this.write = true;
        }
        int i4 = MediaBrowserCompatMediaItem + 87;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 113;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = MediaBrowserCompatSearchResultReceiver + 21;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        throw null;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 121;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(1 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), new char[]{52705, 49026, 5490, 52608, 30539, 46925, 33880, 61130, 61202, 21672, 42748, 52210, 35000, 45613, 50052, 10318, 43636, 36762, 60452, 30445, 18407, 60668, 3768, 21329, 24761, 51801, 11098, 45097, 552, 10153}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((byte) TextUtils.indexOf("", ""), 863603912 + (Process.myTid() >> 22), (-1039868515) - ImageFormat.getBitsPerPixel(0), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 194), TextUtils.indexOf((CharSequence) "", '0', 0) - 43, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i3 = MediaBrowserCompatSearchResultReceiver + 17;
            MediaBrowserCompatMediaItem = i3 % 128;
            int i4 = i3 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i5 = MediaBrowserCompatSearchResultReceiver + 51;
            MediaBrowserCompatMediaItem = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 4534), 6054 - (Process.myTid() >> 22), 43 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.indexOf("", "", 0) + 6030, (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 460
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createDoubleSparseArray.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0b1d A[Catch: all -> 0x0497, TryCatch #14 {all -> 0x0497, blocks: (B:133:0x0b17, B:135:0x0b1d, B:136:0x0b44, B:179:0x0dac, B:181:0x0db2, B:182:0x0dde, B:212:0x132b, B:214:0x1331, B:215:0x135f, B:249:0x18da, B:251:0x18e0, B:252:0x1903, B:228:0x163d, B:230:0x1660, B:231:0x16b0, B:17:0x0166, B:19:0x016c, B:20:0x0194, B:22:0x040b, B:24:0x043c, B:25:0x0491), top: B:300:0x0166 }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0bd1  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0c0c A[Catch: all -> 0x0ccd, TryCatch #10 {all -> 0x0ccd, blocks: (B:153:0x0bf7, B:155:0x0c0c, B:156:0x0c3b), top: B:293:0x0bf7, outer: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0c4e A[Catch: all -> 0x0cc3, TryCatch #2 {all -> 0x0cc3, blocks: (B:157:0x0c41, B:159:0x0c4e, B:160:0x0cbb), top: B:278:0x0c41, outer: #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0e6e  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0ebf  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0f14  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x130a  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x13f0  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x1440  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x148d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x18bb  */
    /* JADX WARN: Removed duplicated region for block: B:313:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r12v31 */
    /* JADX WARN: Type inference failed for: r12v32 */
    /* JADX WARN: Type inference failed for: r12v33 */
    /* JADX WARN: Type inference failed for: r12v34 */
    /* JADX WARN: Type inference failed for: r12v35, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v48, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v53 */
    /* JADX WARN: Type inference failed for: r12v54 */
    /* JADX WARN: Type inference failed for: r12v55 */
    /* JADX WARN: Type inference failed for: r12v56 */
    /* JADX WARN: Type inference failed for: r12v6, types: [java.lang.Class] */
    /* JADX WARN: Type inference failed for: r12v71 */
    /* JADX WARN: Type inference failed for: r12v72 */
    /* JADX WARN: Type inference failed for: r12v73 */
    /* JADX WARN: Type inference failed for: r12v74 */
    /* JADX WARN: Type inference failed for: r12v78 */
    /* JADX WARN: Type inference failed for: r12v79 */
    /* JADX WARN: Type inference failed for: r12v80 */
    /* JADX WARN: Type inference failed for: r12v81 */
    /* JADX WARN: Type inference failed for: r14v0, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    /* JADX WARN: Type inference failed for: r14v8 */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r36) {
        /*
            Method dump skipped, instruction units count: 6838
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createDoubleSparseArray.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 51;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatSearchResultReceiver + 69;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
    }
}
