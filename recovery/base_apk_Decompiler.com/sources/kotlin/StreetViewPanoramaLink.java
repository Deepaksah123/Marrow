package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
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
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes4.dex */
public abstract class StreetViewPanoramaLink extends addObserverForBackInvoker implements SubjectStat {
    private static short[] AudioAttributesImplApi26Parcelizer;
    private getSubjectStat RemoteActionCompatParcelizer;
    private volatile isHighlighted write;
    private static final byte[] $$c = {TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 23, -13, 96};
    private static final int $$f = 230;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {87, 74, -120, 12, 18, 4, -57, 62, 1, 24, 7, -9, 19, 12, -5, 5, -56, 66, -3, 8, 14, 14, 2, 5, -58, 60, 3, 25, -13, 7, 13, 11, -4, -48, 66, 0, 13, -52, 9, 0, 34, 0, 13, -20, 9, 39, 37, -5, 9, -66, TarConstants.LF_BLK, 21, 28, -29, 43, -3, -5, -17, 25, 18, -2, 58, -11, 11, 12, -40, 57, 6, 4, -3, -1, 25, 5, -9, 20, -42, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19, 25, 14, 8, 11, -9, -30, 40, 23, -5, 12, 5, -37, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19, -59, 63, 4, 21, -28, 21, 25, -5, 11, -1, -7, 2, 9};
    private static final int $$h = 153;
    private static final byte[] $$a = {123, -86, 125, 25, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 239;
    private static int MediaDescriptionCompat = 0;
    private static int MediaBrowserCompatSearchResultReceiver = 1;
    private static int AudioAttributesCompatParcelizer = 1000326251;
    private static int AudioAttributesImplBaseParcelizer = 953179274;
    private static int MediaBrowserCompatItemReceiver = -819363149;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1037526902;
    private static byte[] AudioAttributesImplApi21Parcelizer = {-92, -35, -82, -64, -91, -71, -90, -89, -45, -12, -106, -35, -22, -96, -45, -90, -63, 98, 60, -66, 16, 12, 13, 92, 97, 111, 9, 102, 111, 9, 10, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 58, -79, 57, 96, 110, 96, 89, 13, 102, 11, 111, 58, -79, 31, 92, 98, 110, 12, 9, 12, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 13, 110, 61, 71, 99, 10, 96, 11, 22, 10, 98, 89, 16, -79, 111, 60, 12, 91, 96, 13, 13, 20, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 101, 59, 110, -79, -72, -51, -89, -46, -101, -23, -9, -4, -10, -53, -93, -42, -63, -72, -99, -46, -9, -52, -3, -119, -15, -119, -89, -15, -119, -4, -94, -54, -100, -44, -101, -54, -91, -63, -71, -64, -45, -51, -102, -91, -51, -72, -51, -89, -3, -89, -97, -46, -90, -71, -97, -91, -54, -41, -90, -102, -45, -9, -89, -5, -71, -10, -3, -38, 67, 64, -22, 72, -109, -36, 29, 2, 30, TarConstants.LF_PAX_EXTENDED_HEADER_UC, TarConstants.LF_GNUTYPE_LONGLINK, -37, -48, 68, -97, -125, -48, 74, -105, -121, -37, 77, -108, -128, -42, 72, -19, 69, -37, 74, -41, 72, -19, TarConstants.LF_GNUTYPE_LONGLINK, -112, 31, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -73, -37, -22, -74, -35, -42, 79, -43, 3, 30, 74, -45, -48, 67, -36, -48, TarConstants.LF_GNUTYPE_LONGNAME, 70, 65, -36, -108, 89, -44, -126, 70, -35, 89, 77, -6, -80, -7, -7, TarConstants.LF_GNUTYPE_LONGLINK, -114, -6, -95, -44, -6, -101, -106, -64, -118, -124, -6, -9, -122, -114, -12, -12, -16, -119, -109, -34, -12, -5, -117, -30, -82, -81, 33, -128, TarConstants.LF_GNUTYPE_LONGLINK, TarConstants.LF_SYMLINK, -31, -30, -25, -10, -2, -9, 116, -8, 119, -28, -27, 112, -19, 2, 113, 14, -3, -31, 119, -7, -88, -62, -60, -105, -86, -59, -86, -64, -85, -49, -73, -73, -73, -73, -73, -73, -73, -73, -73};
    private final Object IconCompatParcelizer = new Object();
    private boolean read = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(byte r5, short r6, int r7) {
        /*
            byte[] r0 = kotlin.StreetViewPanoramaLink.$$c
            int r6 = r6 * 2
            int r6 = 112 - r6
            int r7 = r7 * 2
            int r1 = 1 - r7
            int r5 = r5 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r5 = r5 + 1
            int r4 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L26:
            r3 = r0[r5]
        L28:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.StreetViewPanoramaLink.$$i(byte, short, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.StreetViewPanoramaLink.$$a
            int r7 = r7 + 65
            int r5 = r5 + 4
            int r1 = 44 - r6
            byte[] r1 = new byte[r1]
            int r6 = 43 - r6
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r5
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L23:
            r3 = r0[r5]
        L25:
            int r5 = r5 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.StreetViewPanoramaLink.c(short, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = 128 - r7
            int r6 = r6 + 65
            byte[] r0 = kotlin.StreetViewPanoramaLink.$$g
            int r1 = 58 - r5
            byte[] r1 = new byte[r1]
            int r5 = 57 - r5
            r2 = -1
            if (r0 != 0) goto L12
            r3 = r5
            r6 = r7
            goto L27
        L12:
            r4 = r7
            r7 = r6
            r6 = r4
        L15:
            int r2 = r2 + 1
            byte r3 = (byte) r7
            r1[r2] = r3
            if (r2 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L25:
            r3 = r0[r6]
        L27:
            int r7 = r7 + r3
            int r6 = r6 + 1
            int r7 = r7 + (-6)
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.StreetViewPanoramaLink.d(int, int, byte, java.lang.Object[]):void");
    }

    StreetViewPanoramaLink() {
        MediaBrowserCompatItemReceiver();
    }

    private void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.StreetViewPanoramaLink.3
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                StreetViewPanoramaLink.this.AudioAttributesImplApi21Parcelizer();
            }
        });
        int i2 = MediaBrowserCompatSearchResultReceiver + 109;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 95;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            getSubjectStat getsubjectstatWrite = MediaBrowserCompatCustomActionResultReceiver().write();
            this.RemoteActionCompatParcelizer = getsubjectstatWrite;
            if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                int i3 = MediaBrowserCompatSearchResultReceiver + 109;
                MediaDescriptionCompat = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        getSubjectStat getsubjectstatWrite2 = MediaBrowserCompatCustomActionResultReceiver().write();
        this.RemoteActionCompatParcelizer = getsubjectstatWrite2;
        getsubjectstatWrite2.RemoteActionCompatParcelizer();
        throw null;
    }

    private static void a(int i, boolean z, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i2];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i3 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i5 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(AudioAttributesCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ExpandableListView.getPackedPositionType(0L), AndroidCharacter.getMirror('0') + 23656, 32 - View.combineMeasuredStates(0, 0), -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 44862), (ViewConfiguration.getScrollBarSize() >> 8) + 18944, 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1836173544, false, "c", new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            cleardownloadmanagerhelpers.write = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i2 - cleardownloadmanagerhelpers.write);
        }
        if (z) {
            int i6 = $10 + 31;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            char[] cArr4 = new char[i2];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                int i8 = $10 + 67;
                $11 = i8 % 128;
                if (i8 % 2 == 0) {
                    cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[i2 / cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
                    Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.getTrimmedLength("") + 44862), 18944 - (KeyEvent.getMaxKeyCode() >> 16), 27 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } else {
                    cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                    Object[] objArr5 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (44862 - Drawable.resolveOpacity(0, 0)), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 18943, Color.green(0) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
            }
            int i9 = $11 + 65;
            $10 = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 5 % 5;
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void b(int i, short s, int i2, int i3, byte b, Object[] objArr) throws Throwable {
        long j;
        int i4;
        char c;
        int i5 = 2;
        int i6 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(MediaBrowserCompatItemReceiver)};
            int i7 = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            int i8 = -1;
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), 24297 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 12, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            boolean z = iIntValue == -1;
            if (!z) {
                j = 7899112766888837815L;
            } else {
                byte[] bArr = AudioAttributesImplApi21Parcelizer;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = $11 + 65;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = 0;
                    while (i11 < length) {
                        int i12 = $11 + 23;
                        $10 = i12 % 128;
                        int i13 = i12 % i5;
                        Object[] objArr3 = new Object[1];
                        objArr3[i7] = Integer.valueOf(bArr[i11]);
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b2 = (byte) i8;
                            byte b3 = (byte) (b2 + 1);
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (Color.rgb(i7, i7, i7) + BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE), TextUtils.indexOf("", "", i7) + 3082, (CdmaCellLocation.convertQuartSecToDecDegrees(i7) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i7) == 0.0d ? 0 : -1)) + 128, 2145850993, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i11] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i11++;
                        i5 = 2;
                        i7 = 0;
                        i8 = -1;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = AudioAttributesImplApi21Parcelizer;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(AudioAttributesImplBaseParcelizer)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((Process.getThreadPriority(0) + 20) >> 6), 24296 - ((byte) KeyEvent.getModifierMetaStateMask()), 13 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) MediaBrowserCompatItemReceiver) ^ 7899112766888837815L)));
                    j = 7899112766888837815L;
                } else {
                    j = 7899112766888837815L;
                    iIntValue = (short) (((short) (((long) AudioAttributesImplApi26Parcelizer[i3 + ((int) (((long) AudioAttributesImplBaseParcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) MediaBrowserCompatItemReceiver) ^ 7899112766888837815L)));
                }
            }
            if (iIntValue > 0) {
                int i14 = ((i3 + iIntValue) - 2) + ((int) (((long) AudioAttributesImplBaseParcelizer) ^ j));
                if (z) {
                    int i15 = $11 + 79;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                buildresumedownloadsintent.read = i14 + i4;
                Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i2), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver), sb};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (34134 - TextUtils.getTrimmedLength("")), (Process.myTid() >> 22) + 13432, Process.getGidForName("") + 22, 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr4 = AudioAttributesImplApi21Parcelizer;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i17 = 0; i17 < length2; i17++) {
                        bArr5[i17] = (byte) (((long) bArr4[i17]) ^ 7899112766888837815L);
                    }
                    bArr4 = bArr5;
                }
                boolean z2 = bArr4 != null;
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    if (z2) {
                        int i18 = $11 + 7;
                        $10 = i18 % 128;
                        if (i18 % 2 != 0) {
                            byte[] bArr6 = AudioAttributesImplApi21Parcelizer;
                            buildresumedownloadsintent.read = buildresumedownloadsintent.read / 0;
                            c = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer >> (((byte) (((byte) (((long) bArr6[r6]) & 7899112766888837815L)) << s)) ^ b));
                        } else {
                            byte[] bArr7 = AudioAttributesImplApi21Parcelizer;
                            buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                            c = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr7[r6]) ^ 7899112766888837815L)) + s)) ^ b));
                        }
                        buildresumedownloadsintent.IconCompatParcelizer = c;
                    } else {
                        short[] sArr = AudioAttributesImplApi26Parcelizer;
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

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 53;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        a(18 - View.combineMeasuredStates(0, 0), false, new char[]{65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65517, 15, '\f', 0, 2, 16, 16}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) - 19, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 144, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 34, true, new char[]{5, 65532, 1, 65517, 17}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 30, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 180, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i4 = MediaDescriptionCompat + 25;
                MediaBrowserCompatSearchResultReceiver = i4 % 128;
                int i5 = i4 % 2;
                Object[] objArr4 = new Object[1];
                a(8 - (KeyEvent.getMaxKeyCode() >> 16), true, new char[]{65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6, 19, 6, 17, 0, 65502, 65483, '\r', '\r', 65534}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) - 23, (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 179, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 21, (short) (68 - (Process.myTid() >> 22)), View.MeasureSpec.getMode(0) + 218176162, 134619587 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 98), objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                int i6 = MediaBrowserCompatSearchResultReceiver + 117;
                MediaDescriptionCompat = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.lastIndexOf("", '0') + 4536), (ViewConfiguration.getJumpTapTimeout() >> 16) + 6054, ExpandableListView.getPackedPositionType(0L) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 12, true, new char[]{27, 26, 65512, 65509, 24, 26, 65509, 65514, 25, 27, 26, 65518, 65512, 65515, 65513, 23, 22, 25, 24, 27, 65509, 65514, 24, 26, 27, 65518, 65517, 65514, 65518, 65512, 25, 65516, 23, 24, 23, 26, 65515, 65511, 26, 65509, 65511, 65510, 65512, 22, 65513, 27, 65517, 65518}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 38, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) + 106, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 54, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(3) - 46), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 218176107, 117842388 - Color.rgb(0, 0, 0), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20), objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 50, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 23), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 218176125, 134619667 - ((Process.getThreadPriority(0) + 20) >> 6), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 40), objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 28, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(4) - 155), 218176167 - TextUtils.getOffsetBefore("", 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 134619681, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 99), objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 1, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(3) - 157), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 218176085, 134619796 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) + 3), objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 24, true, new char[]{'&', 65528, 65517, 65521, 65521, 65522, 65526, 65527, '\"', 65521, 65522, 65526, 65526, '!', 65521, '&', '#', '%', 65527, 65522, '!', 65527, '&', 65517, 65520, 65522, '\"', 65529, 65517, 65527, 65524, 65526, 65524, 65517, '&', 65528}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 35, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 143, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.alpha(0), 6030 - (ViewConfiguration.getTapTimeout() >> 16), 23 - Process.getGidForName(""), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char mirror = (char) (AndroidCharacter.getMirror('0') + 13135);
            int size = 1649 - View.MeasureSpec.getSize(0);
            int gidForName = Process.getGidForName("") + 27;
            byte[] bArr = $$a;
            short s = bArr[5];
            Object[] objArr13 = new Object[1];
            c(s, (byte) s, (byte) (-bArr[113]), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(mirror, size, gidForName, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char fadingEdgeLength = (char) (13183 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 1649;
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 26;
                byte[] bArr2 = $$a;
                Object[] objArr14 = new Object[1];
                c((short) (-bArr2[27]), (byte) (-bArr2[30]), bArr2[5], objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(fadingEdgeLength, iMakeMeasureSpec, iCombineMeasuredStates, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
            int i8 = MediaDescriptionCompat + 1;
            MediaBrowserCompatSearchResultReceiver = i8 % 128;
            if (i8 % 2 == 0) {
                int i9 = 2 % 4;
            }
        } else {
            Object[] objArr15 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 4, true, new char[]{'\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 6, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 177, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            b(12 - Color.green(0), (short) ((-65) - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 218176164, 134619801 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 8), objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, -1398160917};
                byte[] bArr3 = $$g;
                Object[] objArr18 = new Object[1];
                d(bArr3[35], bArr3[40], (byte) 124, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b = (byte) (bArr3[52] - 1);
                byte b2 = bArr3[35];
                Object[] objArr19 = new Object[1];
                d(b, b2, (byte) (b2 | 67), objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char c = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 13184);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1650;
                    int packedPositionType = 26 - ExpandableListView.getPackedPositionType(0L);
                    byte[] bArr4 = $$a;
                    Object[] objArr20 = new Object[1];
                    c((short) (-bArr4[27]), (byte) (-bArr4[30]), bArr4[5], objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(c, iLastIndexOf, packedPositionType, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 28, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 106), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 218176159, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 134619806, (byte) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 13), objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 7, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 84), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 218176160, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 134619827, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 66), objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char keyRepeatDelay = (char) (13183 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                        int deadChar = 1649 - KeyEvent.getDeadChar(0, 0);
                        int touchSlop = 26 - (ViewConfiguration.getTouchSlop() >> 8);
                        Object[] objArr23 = new Object[1];
                        c((short) ($$b & 348), (byte) (-$$a[30]), r11[5], objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(keyRepeatDelay, deadChar, touchSlop, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 13183);
                        int modifierMetaStateMask = 1648 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int longPressTimeout = 26 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte[] bArr5 = $$a;
                        short s2 = bArr5[5];
                        Object[] objArr24 = new Object[1];
                        c(s2, (byte) s2, (byte) (-bArr5[113]), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(cCombineMeasuredStates, modifierMetaStateMask, longPressTimeout, -133433128, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf2);
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
        int i10 = ((int[]) objArr[3])[0];
        int i11 = ((int[]) objArr[2])[0];
        if (i11 != i10) {
            long j = -1;
            long j2 = ((long) (i11 ^ i10)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4535 - TextUtils.indexOf("", "")), Color.blue(0) + 6054, 42 - View.resolveSize(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {-1543573572, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 6031 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23);
                byte[] bArr6 = $$g;
                Object[] objArr26 = new Object[1];
                d((byte) (-bArr6[81]), (byte) (-bArr6[57]), bArr6[46], objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
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
        getSubjectStat getsubjectstat = this.RemoteActionCompatParcelizer;
        if (getsubjectstat != null) {
            int i2 = MediaBrowserCompatSearchResultReceiver + 25;
            MediaDescriptionCompat = i2 % 128;
            int i3 = i2 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
        }
        int i4 = MediaBrowserCompatSearchResultReceiver + 53;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 119;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = MediaBrowserCompatCustomActionResultReceiver().af_();
        int i4 = MediaDescriptionCompat + 33;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaDescriptionCompat + 15;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted MediaBrowserCompatCustomActionResultReceiver() {
        if (this.write == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.write == null) {
                    this.write = AudioAttributesImplBaseParcelizer();
                }
            }
        }
        return this.write;
    }

    protected final void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver;
        int i3 = i2 + 91;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        if (this.read) {
            return;
        }
        int i5 = i2 + 49;
        MediaDescriptionCompat = i5 % 128;
        int i6 = i5 % 2;
        this.read = true;
        int i7 = MediaDescriptionCompat + 61;
        MediaBrowserCompatSearchResultReceiver = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 55;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        if (i3 != 0) {
            return getNextPercentile.RemoteActionCompatParcelizer(this, defaultViewModelProviderFactory);
        }
        getNextPercentile.RemoteActionCompatParcelizer(this, defaultViewModelProviderFactory);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x014f  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 488
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.StreetViewPanoramaLink.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.StreetViewPanoramaLink.onPause():void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        String strValueOf;
        String strValueOf2;
        Object[] objArr;
        Object[] objArr2;
        List<Object[]> list;
        Context applicationContext = context;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object[] objArr3 = new Object[1];
        a('B' - AndroidCharacter.getMirror('0'), false, new char[]{65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65517, 15, '\f', 0, 2, 16, 16}, 18 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 175, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 9, true, new char[]{5, 65532, 1, 65517, 17}, 5 - (ViewConfiguration.getJumpTapTimeout() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) + TsExtractor.TS_STREAM_TYPE_E_AC3, objArr4);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context applicationContext2 = applicationContext != null ? ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : context.getApplicationContext() : applicationContext;
            if (applicationContext2 != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - ((Process.getThreadPriority(0) + 20) >> 6)), 6054 - Color.green(0), 41 - ExpandableListView.getPackedPositionChild(0L), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 12, true, new char[]{27, 26, 65512, 65509, 24, 26, 65509, 65514, 25, 27, 26, 65518, 65512, 65515, 65513, 23, 22, 25, 24, 27, 65509, 65514, 24, 26, 27, 65518, 65517, 65514, 65518, 65512, 25, 65516, 23, 24, 23, 26, 65515, 65511, 26, 65509, 65511, 65510, 65512, 22, 65513, 27, 65517, 65518}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 38, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 154, objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 50, (short) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 54), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) + 218176074, 134619604 - View.MeasureSpec.getSize(0), (byte) (16 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b(View.resolveSizeAndState(0, 0, 0) + 60, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + 9), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) + 218176046, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 134619632, (byte) (75 - (Process.myPid() >> 22)), objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 51, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 81), TextUtils.getOffsetBefore("", 0) + 218176167, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 134619720, (byte) (TextUtils.getOffsetAfter("", 0) - 64), objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b(2 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (short) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 43), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 218176116, (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 134619795, (byte) (39 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 7, true, new char[]{'&', 65528, 65517, 65521, 65521, 65522, 65526, 65527, '\"', 65521, 65522, 65526, 65526, '!', 65521, '&', '#', '%', 65527, 65522, '!', 65527, '&', 65517, 65520, 65522, '\"', 65529, 65517, 65527, 65524, 65526, 65524, 65517, '&', 65528}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 32, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 109, objArr10);
                    Object[] objArr11 = {applicationContext2, str, str2, str3, str4, true, str5, (String) objArr10[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.indexOf("", "", 0), 6030 - (ViewConfiguration.getWindowTouchSlop() >> 8), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 23, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr11);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        try {
            try {
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-18205161);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char threadPriority = (char) (((Process.getThreadPriority(0) + 20) >> 6) + 61148);
                    int iNormalizeMetaState = 2145 - KeyEvent.normalizeMetaState(0);
                    int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 12;
                    short s = (short) ($$b & 381);
                    Object[] objArr12 = new Object[1];
                    c(s, (byte) (s & 186), $$a[9], objArr12);
                    objRemoteActionCompatParcelizer3 = startForeground.read(threadPriority, iNormalizeMetaState, packedPositionType, -2136739198, false, (String) objArr12[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
                    int i2 = MediaDescriptionCompat + 7;
                    MediaBrowserCompatSearchResultReceiver = i2 % 128;
                    int i3 = i2 % 2;
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-629126231);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char capsMode = (char) (61148 - TextUtils.getCapsMode("", 0, 0));
                        int i4 = (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2145;
                        int i5 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 11;
                        Object[] objArr13 = new Object[1];
                        c((short) 112, r8[14], (byte) (-$$a[113]), objArr13);
                        objRemoteActionCompatParcelizer4 = startForeground.read(capsMode, i4, i5, -1530294468, false, (String) objArr13[0], null);
                    }
                    list = (List) ((Field) objRemoteActionCompatParcelizer4).get(null);
                } else {
                    Object[] objArr14 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 27, true, new char[]{'\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5}, 16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(3) + 78, objArr14);
                    Class<?> cls2 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) - 37, (short) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 66), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 218176133, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 134619791, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) - 56), objArr15);
                    int iIntValue2 = ((Integer) cls2.getMethod((String) objArr15[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr16 = {1325758999};
                        Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-173351824);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            objRemoteActionCompatParcelizer5 = startForeground.read((char) (Color.rgb(0, 0, 0) + 16823061), 913 - TextUtils.getOffsetAfter("", 0), ((Process.getThreadPriority(0) + 20) >> 6) + 10, -1948051227, false, null, new Class[]{Integer.TYPE});
                        }
                        try {
                            Object[] objArr17 = {Integer.valueOf(iIntValue2), ((Constructor) objRemoteActionCompatParcelizer5).newInstance(objArr16)};
                            Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1891595430);
                            if (objRemoteActionCompatParcelizer6 == null) {
                                char cAxisFromString = (char) (61147 - MotionEvent.axisFromString(""));
                                int i6 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2144;
                                int jumpTapTimeout = 12 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                                Object[] objArr18 = new Object[1];
                                c((short) ($$b & 925), (byte) ($$a[3] - 1), r9[75], objArr18);
                                objRemoteActionCompatParcelizer6 = startForeground.read(cAxisFromString, i6, jumpTapTimeout, 251047987, false, (String) objArr18[0], new Class[]{Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getTouchSlop() >> 8), 556 - MotionEvent.axisFromString(""), 18 - (ViewConfiguration.getTouchSlop() >> 8))});
                            }
                            list = (List) ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr17);
                            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-629126231);
                            if (objRemoteActionCompatParcelizer7 == null) {
                                char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 61148);
                                int iResolveOpacity = 2145 - Drawable.resolveOpacity(0, 0);
                                int iMakeMeasureSpec = 12 - View.MeasureSpec.makeMeasureSpec(0, 0);
                                Object[] objArr19 = new Object[1];
                                c((short) 112, r9[14], (byte) (-$$a[113]), objArr19);
                                objRemoteActionCompatParcelizer7 = startForeground.read(pressedStateDuration, iResolveOpacity, iMakeMeasureSpec, -1530294468, false, (String) objArr19[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer7).set(null, list);
                            Object[] objArr20 = new Object[1];
                            b((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 17, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 81), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 218176125, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 134619812, (byte) ((-12) - TextUtils.indexOf("", "", 0, 0)), objArr20);
                            Class<?> cls3 = Class.forName((String) objArr20[0]);
                            Object[] objArr21 = new Object[1];
                            b((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 10, (short) (119 - (ViewConfiguration.getPressedStateDuration() >> 16)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) + 218176053, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 134619833, (byte) ((ViewConfiguration.getTapTimeout() >> 16) - 62), objArr21);
                            long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr21[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue);
                            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(301834150);
                            if (objRemoteActionCompatParcelizer8 == null) {
                                char c = (char) (61148 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                                int i7 = 2144 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                                int iLastIndexOf = 11 - TextUtils.lastIndexOf("", '0', 0, 0);
                                short s2 = (short) ($$b & 944);
                                byte b = (byte) (-$$a[45]);
                                Object[] objArr22 = new Object[1];
                                c(s2, b, (byte) (b + 1), objArr22);
                                objRemoteActionCompatParcelizer8 = startForeground.read(c, i7, iLastIndexOf, 1874090803, false, (String) objArr22[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer8).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                            Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(-18205161);
                            if (objRemoteActionCompatParcelizer9 == null) {
                                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 61149);
                                int iIndexOf = TextUtils.indexOf("", "", 0) + 2145;
                                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 12;
                                short s3 = (short) ($$b & 381);
                                Object[] objArr23 = new Object[1];
                                c(s3, (byte) (s3 & 186), $$a[9], objArr23);
                                objRemoteActionCompatParcelizer9 = startForeground.read(cLastIndexOf, iIndexOf, iResolveSizeAndState, -2136739198, false, (String) objArr23[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer9).set(null, lValueOf2);
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                for (Object[] objArr24 : list) {
                    int i8 = MediaDescriptionCompat + 77;
                    MediaBrowserCompatSearchResultReceiver = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = ((int[]) objArr24[3])[0];
                    int i11 = ((int[]) objArr24[1])[0];
                    if (i11 != i10) {
                        ArrayList arrayList = new ArrayList();
                        String[] strArr = (String[]) objArr24[2];
                        if (strArr != null) {
                            for (String str6 : strArr) {
                                arrayList.add(str6);
                            }
                        }
                        long j = -1;
                        long j2 = 0;
                        long j3 = (((long) (i11 ^ i10)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 10) << 32) | (j2 - ((j2 >> 63) << 32));
                        try {
                            Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                            if (objRemoteActionCompatParcelizer10 == null) {
                                objRemoteActionCompatParcelizer10 = startForeground.read((char) (4535 - View.getDefaultSize(0, 0)), 6054 - Drawable.resolveOpacity(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                            }
                            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer10).invoke(null, null);
                            try {
                                Object[] objArr25 = {1325758999, Long.valueOf(j3), arrayList, TrainingApplication.RemoteActionCompatParcelizer(), false};
                                Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (TextUtils.lastIndexOf("", '0') + 1), 6030 - Color.alpha(0), Color.alpha(0) + 24);
                                byte[] bArr = $$g;
                                Object[] objArr26 = new Object[1];
                                d((byte) (-bArr[81]), (byte) (-bArr[57]), bArr[46], objArr26);
                                cls4.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
                            } catch (Throwable th4) {
                                Throwable cause4 = th4.getCause();
                                if (cause4 == null) {
                                    throw th4;
                                }
                                throw cause4;
                            }
                        } catch (Throwable th5) {
                            Throwable cause5 = th5.getCause();
                            if (cause5 == null) {
                                throw th5;
                            }
                            throw cause5;
                        }
                    }
                }
            } catch (Throwable th6) {
                Throwable cause6 = th6.getCause();
                if (cause6 == null) {
                    throw th6;
                }
                throw cause6;
            }
        } catch (Throwable th7) {
            Object[] objArr27 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 2, true, new char[]{65533, 65535, 65531, 1, 4, 65533, 2, 1, 4, 65535, 4}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 7, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 132, objArr27);
            String str7 = (String) objArr27[0];
            try {
                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                PrintStream printStream = new PrintStream(byteArrayOutputStream);
                th7.printStackTrace(printStream);
                printStream.close();
                strValueOf = byteArrayOutputStream.toString(CharsetNames.UTF_8);
            } catch (Throwable unused) {
                strValueOf = String.valueOf(th7);
            }
            ArrayList arrayList2 = new ArrayList(2);
            arrayList2.add(strValueOf);
            arrayList2.add(str7);
            Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer11 == null) {
                objRemoteActionCompatParcelizer11 = startForeground.read((char) (Gravity.getAbsoluteGravity(0, 0) + 4535), TextUtils.indexOf((CharSequence) "", '0', 0) + 6055, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke3 = ((Method) objRemoteActionCompatParcelizer11).invoke(null, null);
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i12 = MediaBrowserCompatSearchResultReceiver + 53;
            MediaDescriptionCompat = i12 % 128;
            int i13 = i12 % 2;
            Object[] objArr28 = {1325758999, 81604378625L, arrayList2, strRemoteActionCompatParcelizer, false};
            Class cls5 = (Class) startForeground.IconCompatParcelizer((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 6030 - Color.red(0), TextUtils.indexOf((CharSequence) "", '0') + 25);
            byte[] bArr2 = $$g;
            Object[] objArr29 = new Object[1];
            d((byte) (-bArr2[81]), (byte) (-bArr2[57]), bArr2[46], objArr29);
            cls5.getMethod((String) objArr29[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke3, objArr28);
        }
        if (applicationContext != null) {
            try {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : context.getApplicationContext();
            } catch (Throwable th8) {
                Object[] objArr30 = new Object[1];
                b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 3, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 110), (ViewConfiguration.getFadingEdgeLength() >> 16) + 218176119, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 134619852, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 51), objArr30);
                String str8 = (String) objArr30[0];
                try {
                    ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                    PrintStream printStream2 = new PrintStream(byteArrayOutputStream2);
                    th8.printStackTrace(printStream2);
                    printStream2.close();
                    strValueOf2 = byteArrayOutputStream2.toString(CharsetNames.UTF_8);
                } catch (Throwable unused2) {
                    strValueOf2 = String.valueOf(th8);
                }
                ArrayList arrayList3 = new ArrayList(2);
                arrayList3.add(strValueOf2);
                arrayList3.add(str8);
                Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer12 == null) {
                    objRemoteActionCompatParcelizer12 = startForeground.read((char) ((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 4535), ((Process.getThreadPriority(0) + 20) >> 6) + 6054, Color.red(0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke4 = ((Method) objRemoteActionCompatParcelizer12).invoke(null, null);
                Object[] objArr31 = {1325758999, 81604378625L, arrayList3, TrainingApplication.RemoteActionCompatParcelizer(), false};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) View.combineMeasuredStates(0, 0), Gravity.getAbsoluteGravity(0, 0) + 6030, 24 - KeyEvent.keyCodeFromString(""));
                byte[] bArr3 = $$g;
                Object[] objArr32 = new Object[1];
                d((byte) (-bArr3[81]), (byte) (-bArr3[57]), bArr3[46], objArr32);
                cls6.getMethod((String) objArr32[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke4, objArr31);
                int i14 = MediaBrowserCompatSearchResultReceiver + 39;
                MediaDescriptionCompat = i14 % 128;
                int i15 = i14 % 2;
            }
        }
        try {
            Object[] objArr33 = {1325758999};
            Object objRemoteActionCompatParcelizer13 = startForeground.RemoteActionCompatParcelizer(-1128409246);
            if (objRemoteActionCompatParcelizer13 == null) {
                objRemoteActionCompatParcelizer13 = startForeground.read((char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1991 - (ViewConfiguration.getEdgeSlop() >> 16), 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), -1024191497, false, null, new Class[]{Integer.TYPE});
            }
            try {
                Object[] objArr34 = {applicationContext, ((Constructor) objRemoteActionCompatParcelizer13).newInstance(objArr33)};
                Object objRemoteActionCompatParcelizer14 = startForeground.RemoteActionCompatParcelizer(352975618);
                if (objRemoteActionCompatParcelizer14 == null) {
                    char cResolveSizeAndState = (char) (19323 - View.resolveSizeAndState(0, 0, 0));
                    int i16 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 2758;
                    int iBlue = Color.blue(0) + 99;
                    short s4 = (short) ($$b & 944);
                    byte b2 = (byte) (-$$a[45]);
                    Object[] objArr35 = new Object[1];
                    c(s4, b2, (byte) (b2 + 1), objArr35);
                    objRemoteActionCompatParcelizer14 = startForeground.read(cResolveSizeAndState, i16, iBlue, 1799372695, false, (String) objArr35[0], new Class[]{Context.class, (Class) startForeground.IconCompatParcelizer((char) (View.resolveSizeAndState(0, 0, 0) + 9580), ImageFormat.getBitsPerPixel(0) + 3447, View.MeasureSpec.getSize(0) + 144)});
                }
                ((Method) objRemoteActionCompatParcelizer14).invoke(null, objArr34);
                Object objRemoteActionCompatParcelizer15 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                if (objRemoteActionCompatParcelizer15 == null) {
                    char cLastIndexOf2 = (char) (TextUtils.lastIndexOf("", '0', 0) + 13184);
                    int mirror = AndroidCharacter.getMirror('0') + 1601;
                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 26;
                    byte[] bArr4 = $$a;
                    short s5 = bArr4[5];
                    Object[] objArr36 = new Object[1];
                    c(s5, (byte) s5, (byte) (-bArr4[113]), objArr36);
                    objRemoteActionCompatParcelizer15 = startForeground.read(cLastIndexOf2, mirror, iKeyCodeFromString, -133433128, false, (String) objArr36[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer15).getLong(null) != -1) {
                    Object objRemoteActionCompatParcelizer16 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                    if (objRemoteActionCompatParcelizer16 == null) {
                        char touchSlop = (char) ((ViewConfiguration.getTouchSlop() >> 8) + 13183);
                        int i17 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 1648;
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 26;
                        byte[] bArr5 = $$a;
                        Object[] objArr37 = new Object[1];
                        c((short) (-bArr5[27]), (byte) (-bArr5[30]), bArr5[5], objArr37);
                        objRemoteActionCompatParcelizer16 = startForeground.read(touchSlop, i17, scrollBarSize, -1033747278, false, (String) objArr37[0], null);
                    }
                    objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer16).get(null);
                } else {
                    Object[] objArr38 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 2, true, new char[]{'\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5}, 16 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 177, objArr38);
                    Class<?> cls7 = Class.forName((String) objArr38[0]);
                    Object[] objArr39 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) - 37, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 75), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 218176158, 134619802 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 11), objArr39);
                    int iIntValue3 = ((Integer) cls7.getMethod((String) objArr39[0], Object.class).invoke(null, this)).intValue();
                    int i18 = MediaBrowserCompatSearchResultReceiver + 21;
                    MediaDescriptionCompat = i18 % 128;
                    int i19 = i18 % 2;
                    try {
                        Object[] objArr40 = {Integer.valueOf(iIntValue3), 0, 1402361173};
                        byte b3 = (byte) 47;
                        byte b4 = (byte) (b3 - 1);
                        Object[] objArr41 = new Object[1];
                        d(b3, b4, (byte) (b4 & 27), objArr41);
                        Class<?> cls8 = Class.forName((String) objArr41[0]);
                        byte b5 = (byte) 54;
                        Object[] objArr42 = new Object[1];
                        d(b5, (byte) (b5 - 5), $$g[35], objArr42);
                        objArr = (Object[]) cls8.getMethod((String) objArr42[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr40);
                        Object objRemoteActionCompatParcelizer17 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                        if (objRemoteActionCompatParcelizer17 == null) {
                            char cRed = (char) (Color.red(0) + 13183);
                            int i20 = 1650 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                            int iBlue2 = 26 - Color.blue(0);
                            byte[] bArr6 = $$a;
                            Object[] objArr43 = new Object[1];
                            c((short) (-bArr6[27]), (byte) (-bArr6[30]), bArr6[5], objArr43);
                            objRemoteActionCompatParcelizer17 = startForeground.read(cRed, i20, iBlue2, -1033747278, false, (String) objArr43[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer17).set(null, objArr);
                        try {
                            Object[] objArr44 = new Object[1];
                            b(18 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 182), (KeyEvent.getMaxKeyCode() >> 16) + 218176160, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 134619806, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 47), objArr44);
                            Class<?> cls9 = Class.forName((String) objArr44[0]);
                            Object[] objArr45 = new Object[1];
                            b(';' - AndroidCharacter.getMirror('0'), (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 115), 218176164 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 134619836, (byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 63), objArr45);
                            long jLongValue2 = ((Long) cls9.getDeclaredMethod((String) objArr45[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf3 = Long.valueOf(jLongValue2);
                            Object objRemoteActionCompatParcelizer18 = startForeground.RemoteActionCompatParcelizer(2104791916);
                            if (objRemoteActionCompatParcelizer18 == null) {
                                char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13182);
                                int i21 = (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1649;
                                int i22 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25;
                                Object[] objArr46 = new Object[1];
                                c((short) ($$b & 348), (byte) (-$$a[30]), r9[5], objArr46);
                                objRemoteActionCompatParcelizer18 = startForeground.read(c2, i21, i22, 54351865, false, (String) objArr46[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer18).set(null, lValueOf3);
                            Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                            Object objRemoteActionCompatParcelizer19 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                            if (objRemoteActionCompatParcelizer19 == null) {
                                char minimumFlingVelocity = (char) (13183 - (ViewConfiguration.getMinimumFlingVelocity() >> 16));
                                int i23 = (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1649;
                                int iResolveOpacity2 = 26 - Drawable.resolveOpacity(0, 0);
                                byte[] bArr7 = $$a;
                                short s6 = bArr7[5];
                                Object[] objArr47 = new Object[1];
                                c(s6, (byte) s6, (byte) (-bArr7[113]), objArr47);
                                objRemoteActionCompatParcelizer19 = startForeground.read(minimumFlingVelocity, i23, iResolveOpacity2, -133433128, false, (String) objArr47[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer19).set(null, lValueOf4);
                        } catch (Exception unused3) {
                            throw new RuntimeException();
                        }
                    } catch (Throwable th9) {
                        Throwable cause7 = th9.getCause();
                        if (cause7 == null) {
                            throw th9;
                        }
                        throw cause7;
                    }
                }
                int i24 = ((int[]) objArr[3])[0];
                int i25 = ((int[]) objArr[2])[0];
                if (i25 != i24) {
                    long j4 = -1;
                    long j5 = 0;
                    long j6 = (((((long) 0) << 32) | (j4 - ((j4 >> 63) << 32))) & ((long) (i25 ^ i24))) | (((long) 2) << 32) | (j5 - ((j5 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer20 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer20 == null) {
                        objRemoteActionCompatParcelizer20 = startForeground.read((char) ((ViewConfiguration.getTouchSlop() >> 8) + 4535), 6054 - View.combineMeasuredStates(0, 0), 42 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke5 = ((Method) objRemoteActionCompatParcelizer20).invoke(null, null);
                    Object[] objArr48 = {1325758999, Long.valueOf(j6), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls10 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getPressedStateDuration() >> 16), 6030 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), KeyEvent.keyCodeFromString("") + 24);
                    byte[] bArr8 = $$g;
                    Object[] objArr49 = new Object[1];
                    d((byte) (-bArr8[81]), (byte) (-bArr8[57]), bArr8[46], objArr49);
                    cls10.getMethod((String) objArr49[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke5, objArr48);
                }
                Object objRemoteActionCompatParcelizer21 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                if (objRemoteActionCompatParcelizer21 == null) {
                    char c3 = (char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    int iAlpha = 943 - Color.alpha(0);
                    int iResolveSizeAndState2 = 36 - View.resolveSizeAndState(0, 0, 0);
                    short s7 = (short) ($$b & 381);
                    Object[] objArr50 = new Object[1];
                    c(s7, (byte) (s7 & 186), $$a[9], objArr50);
                    objRemoteActionCompatParcelizer21 = startForeground.read(c3, iAlpha, iResolveSizeAndState2, -167186806, false, (String) objArr50[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer21).getLong(null) != -1) {
                    Object objRemoteActionCompatParcelizer22 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer22 == null) {
                        char minimumFlingVelocity2 = (char) (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                        int fadingEdgeLength = 943 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                        int iIndexOf2 = 35 - TextUtils.indexOf((CharSequence) "", '0', 0);
                        Object[] objArr51 = new Object[1];
                        c((short) 112, r2[14], (byte) (-$$a[113]), objArr51);
                        objRemoteActionCompatParcelizer22 = startForeground.read(minimumFlingVelocity2, fadingEdgeLength, iIndexOf2, -1398865628, false, (String) objArr51[0], null);
                    }
                    objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer22).get(null);
                } else {
                    Object[] objArr52 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 2, true, new char[]{'\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 6, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) + TsExtractor.TS_STREAM_TYPE_AC3, objArr52);
                    Class<?> cls11 = Class.forName((String) objArr52[0]);
                    Object[] objArr53 = new Object[1];
                    b(TextUtils.indexOf("", "") + 12, (short) ((-65) - (ViewConfiguration.getEdgeSlop() >> 16)), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 218176169, (KeyEvent.getMaxKeyCode() >> 16) + 134619801, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 17), objArr53);
                    Object[] objArr54 = {Integer.valueOf(((Integer) cls11.getMethod((String) objArr53[0], Object.class).invoke(null, this)).intValue()), 0, 937213416};
                    Object objRemoteActionCompatParcelizer23 = startForeground.RemoteActionCompatParcelizer(-21191141);
                    if (objRemoteActionCompatParcelizer23 == null) {
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 943;
                        int minimumFlingVelocity3 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 36;
                        byte[] bArr9 = $$a;
                        Object[] objArr55 = new Object[1];
                        c((short) 187, bArr9[146], bArr9[5], objArr55);
                        objRemoteActionCompatParcelizer23 = startForeground.read((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), absoluteGravity, minimumFlingVelocity3, -2131402098, false, (String) objArr55[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    objArr2 = (Object[]) ((Method) objRemoteActionCompatParcelizer23).invoke(null, objArr54);
                    Object objRemoteActionCompatParcelizer24 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer24 == null) {
                        char bitsPerPixel = (char) ((-1) - ImageFormat.getBitsPerPixel(0));
                        int iCombineMeasuredStates = 943 - View.combineMeasuredStates(0, 0);
                        int scrollBarFadeDuration = 36 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        Object[] objArr56 = new Object[1];
                        c((short) 112, r3[14], (byte) (-$$a[113]), objArr56);
                        objRemoteActionCompatParcelizer24 = startForeground.read(bitsPerPixel, iCombineMeasuredStates, scrollBarFadeDuration, -1398865628, false, (String) objArr56[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer24).set(null, objArr2);
                    try {
                        Object[] objArr57 = new Object[1];
                        b(18 - Color.argb(0, 0, 0, 0), (short) (View.resolveSizeAndState(0, 0, 0) - 71), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 218176125, 134619816 - (Process.myTid() >> 22), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 16), objArr57);
                        Class<?> cls12 = Class.forName((String) objArr57[0]);
                        Object[] objArr58 = new Object[1];
                        b((ViewConfiguration.getPressedStateDuration() >> 16) + 11, (short) (TextUtils.lastIndexOf("", '0', 0, 0) + 120), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 218176154, 134619838 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 72), objArr58);
                        long jLongValue3 = ((Long) cls12.getDeclaredMethod((String) objArr58[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf5 = Long.valueOf(jLongValue3);
                        Object objRemoteActionCompatParcelizer25 = startForeground.RemoteActionCompatParcelizer(-1539638354);
                        if (objRemoteActionCompatParcelizer25 == null) {
                            char cIndexOf = (char) TextUtils.indexOf("", "");
                            int doubleTapTimeout = 943 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int size = 36 - View.MeasureSpec.getSize(0);
                            short s8 = (short) ($$b & 944);
                            byte b6 = (byte) (-$$a[45]);
                            Object[] objArr59 = new Object[1];
                            c(s8, b6, (byte) (b6 + 1), objArr59);
                            objRemoteActionCompatParcelizer25 = startForeground.read(cIndexOf, doubleTapTimeout, size, -629981381, false, (String) objArr59[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer25).set(null, lValueOf5);
                        Long lValueOf6 = Long.valueOf(jLongValue3 >> 12);
                        Object objRemoteActionCompatParcelizer26 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                        if (objRemoteActionCompatParcelizer26 == null) {
                            char cRed2 = (char) Color.red(0);
                            int iResolveSize = View.resolveSize(0, 0) + 943;
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 36;
                            short s9 = (short) ($$b & 381);
                            Object[] objArr60 = new Object[1];
                            c(s9, (byte) (s9 & 186), $$a[9], objArr60);
                            objRemoteActionCompatParcelizer26 = startForeground.read(cRed2, iResolveSize, absoluteGravity2, -167186806, false, (String) objArr60[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer26).set(null, lValueOf6);
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                }
                int i26 = ((int[]) objArr2[2])[0];
                int i27 = ((int[]) objArr2[0])[0];
                if (i27 != i26) {
                    long j7 = -1;
                    long j8 = ((long) (i27 ^ i26)) & ((((long) 0) << 32) | (j7 - ((j7 >> 63) << 32)));
                    long j9 = 0;
                    long j10 = j8 | (((long) 1) << 32) | (j9 - ((j9 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer27 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer27 == null) {
                        objRemoteActionCompatParcelizer27 = startForeground.read((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4535), 6054 - (Process.myTid() >> 22), TextUtils.getCapsMode("", 0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke6 = ((Method) objRemoteActionCompatParcelizer27).invoke(null, null);
                    Object[] objArr61 = {1325758999, Long.valueOf(j10), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls13 = (Class) startForeground.IconCompatParcelizer((char) ((-1) - ImageFormat.getBitsPerPixel(0)), (ViewConfiguration.getTapTimeout() >> 16) + 6030, 24 - View.resolveSizeAndState(0, 0, 0));
                    byte[] bArr10 = $$g;
                    Object[] objArr62 = new Object[1];
                    d((byte) (-bArr10[81]), (byte) (-bArr10[57]), bArr10[46], objArr62);
                    cls13.getMethod((String) objArr62[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke6, objArr61);
                }
            } catch (Throwable th10) {
                Throwable cause8 = th10.getCause();
                if (cause8 == null) {
                    throw th10;
                }
                throw cause8;
            }
        } catch (Throwable th11) {
            Throwable cause9 = th11.getCause();
            if (cause9 == null) {
                throw th11;
            }
            throw cause9;
        }
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 83;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 46 / 0;
        }
        int i5 = MediaBrowserCompatSearchResultReceiver + 5;
        MediaDescriptionCompat = i5 % 128;
        if (i5 % 2 != 0) {
            throw null;
        }
    }
}
