package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.kt.base.BaseDaggerActivity;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import kotlin.getExtendedEsFrChar;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class getStartTimeUs<P extends getExtendedEsFrChar> extends BaseDaggerActivity<P> implements SubjectStat {
    private static short[] RatingCompat;
    private getSubjectStat AudioAttributesCompatParcelizer;
    private final Object IconCompatParcelizer = new Object();
    private boolean read = false;
    private volatile isHighlighted write;
    private static final byte[] $$s = {84, -83, -23, -21};
    private static final int $$t = TsExtractor.TS_STREAM_TYPE_AC3;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$p = {TarConstants.LF_CHR, -23, 108, 101, -12, 2, 63, -57, -8, 0, 8, -5, 7, TarConstants.LF_CONTIG, -51, -13, 10, -14, 3, 6, 5, TarConstants.LF_FIFO, -57, -6, -6, 69, -53, -12, 2, 0, -2, 1, 64, -71, 1, 11, -3, 62, -76, 0, 25, 13, 4, -3, -19, -8, -2, -5, 15, 36, -34, -17, 11, -6, 1, 43, -44, 2, -3, 15, -19, 36, -17, -17, 15, -2, -7, 3, -17, 21, -13, -12, 2, 63, -57, -8, 0, 8, -5, 7, TarConstants.LF_CONTIG, -51, -13, 10, -14, 3, 6, 5, TarConstants.LF_FIFO, -63, 12, -19, 15, -13, 9, 8, -11, 62, -53, -5, -1, -7, 66, -21, -37, -1, -7, TarConstants.LF_GNUTYPE_LONGNAME, -13, 5, 9, -11, 15};
    private static final int $$q = 194;
    private static final byte[] $$g = {24, -109, -85, -94, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$h = 211;
    private static int MediaBrowserCompatMediaItem = 0;
    private static int handleMediaPlayPauseIfPendingOnHandler = 1;
    private static int RemoteActionCompatParcelizer = -1658988881;
    private static int MediaBrowserCompatCustomActionResultReceiver = -819363166;
    private static int MediaMetadataCompat = -929575837;
    private static byte[] MediaBrowserCompatSearchResultReceiver = {-73, -71, -75, 67, 74, -107, -107, 12, -77, -10, 125, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -71, 65, -70, -76, TarConstants.LF_GNUTYPE_LONGLINK, 68, -67, -93, 108, -78, -68, 68, -70, 66, -90, -107, -92, 9, -73, -72, -124, 125, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -71, 65, -70, 72, -79, 66, -92, 73, 77, 74, TarConstants.LF_GNUTYPE_LONGLINK, -73, -104, 122, -79, -66, 68, -73, 74, -91, 72, -102, -74, -76, TarConstants.LF_GNUTYPE_LONGLINK, -79, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -102, 98, 72, -74, 74, -104, -77, 122, -126, 73, -74, 73, 101, -102, 121, -103, 72, 100, -74, -123, -76, 122, 73, -126, TarConstants.LF_GNUTYPE_LONGNAME, 102, 73, -74, -101, -79, 74, -75, 101, -74, 74, -74, 74, -127, TarConstants.LF_GNUTYPE_LONGNAME, 101, -77, 121, -121, 101, 73, 72, -103, -76, -74, TarConstants.LF_GNUTYPE_LONGNAME, -65, -74, TarConstants.LF_GNUTYPE_LONGNAME, TarConstants.LF_GNUTYPE_LONGLINK, -66, 123, -124, 124, -75, -73, -75, -100, 72, -65, 74, -74, 123, -124, 102, -103, -77, -73, 73, TarConstants.LF_GNUTYPE_LONGNAME, 73, -66, 72, -73, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -98, -78, TarConstants.LF_GNUTYPE_LONGLINK, -75, 74, 111, TarConstants.LF_GNUTYPE_LONGLINK, -77, -100, 101, -124, -74, 121, 73, -102, -75, 72, 72, 97, -99, -80, 122, -73, -124, -75, 72, -74, 99, -102, 100, -122, 121, -121, 74, -78, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, TarConstants.LF_GNUTYPE_LONGNAME, -75, -104, 99, -122, 73, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -124, 124, -124, -74, 124, -124, 121, -77, TarConstants.LF_GNUTYPE_LONGLINK, -103, 97, -102, TarConstants.LF_GNUTYPE_LONGLINK, -80, TarConstants.LF_GNUTYPE_LONGNAME, -76, 77, 98, 72, -101, -80, 72, -75, 72, -74, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -74, -98, 99, -73, -76, -98, -80, TarConstants.LF_GNUTYPE_LONGLINK, 102, -73, -101, 98, -122, -74, 122, -76, -121, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -77, 77, -76, -76, 66, -65, 70, -74, 77, -111, -110, 112, 78, -70, 66, -119, 122, 92, -94, 64, -74, 66, -101, 108, 66, -91, -82, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -78, -68, 66, -79, -66, -74, TarConstants.LF_GNUTYPE_LONGNAME, -65, 67, -76, -98, 97, -65, 70, -74, 77, -111, -110, 12, -77, -10, 125, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -71, 65, -70, 77, 74, -80, TarConstants.LF_GNUTYPE_LONGNAME, -74, 74, -78, TarConstants.LF_GNUTYPE_LONGNAME, -80, 73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73};
    private static int[] MediaDescriptionCompat = {566770487, 294966772, -1483294673, 1727761332, -2100461451, -801459317, -1046359751, -1573846806, 1723845722, -1976907570, 1950061428, 184602024, 2034500526, 1179144823, 332825302, 589086336, 856638294, 1483761546};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$u(byte r6, byte r7, short r8) {
        /*
            int r8 = r8 * 4
            int r8 = 112 - r8
            byte[] r0 = kotlin.getStartTimeUs.$$s
            int r7 = r7 * 3
            int r1 = 1 - r7
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            if (r0 != 0) goto L17
            r8 = r6
            r3 = r7
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L27:
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2c:
            int r3 = -r3
            int r6 = r6 + r3
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getStartTimeUs.$$u(byte, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r6 = r6 + 65
            int r7 = r7 + 4
            byte[] r0 = kotlin.getStartTimeUs.$$g
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L22
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            r3 = r0[r7]
        L22:
            int r3 = -r3
            int r6 = r6 + r3
            int r6 = r6 + (-1)
            int r7 = r7 + 1
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getStartTimeUs.k(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 108 - r6
            byte[] r0 = kotlin.getStartTimeUs.$$p
            int r1 = 39 - r8
            int r7 = r7 + 82
            byte[] r1 = new byte[r1]
            int r8 = 38 - r8
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L2c
        L12:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L16:
            byte r4 = (byte) r6
            int r7 = r7 + 1
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2c:
            int r7 = -r7
            int r6 = r6 + r7
            r7 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getStartTimeUs.l(int, int, int, java.lang.Object[]):void");
    }

    getStartTimeUs() {
        onCustomAction();
    }

    private void onCustomAction() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.getStartTimeUs.2
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                getStartTimeUs.this.onCommand();
            }
        });
        int i2 = MediaBrowserCompatMediaItem + 95;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        int i3 = i2 % 2;
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 117;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        int i3 = i2 % 2;
        this.AudioAttributesCompatParcelizer = onMediaButtonEvent().write();
        if (!(!r1.RemoteActionCompatParcelizer())) {
            int i4 = MediaBrowserCompatMediaItem + 89;
            handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
            int i5 = i4 % 2;
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            int i6 = handleMediaPlayPauseIfPendingOnHandler + 75;
            MediaBrowserCompatMediaItem = i6 % 128;
            int i7 = i6 % 2;
        }
        int i8 = handleMediaPlayPauseIfPendingOnHandler + 71;
        MediaBrowserCompatMediaItem = i8 % 128;
        if (i8 % 2 != 0) {
            throw null;
        }
    }

    private static void j(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = MediaDescriptionCompat;
        int i4 = 43694;
        int i5 = -470782045;
        long j = 0;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (i4 - (ExpandableListView.getPackedPositionForChild(0, 0) > j ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j ? 0 : -1))), 23297 - TextUtils.indexOf("", ""), KeyEvent.normalizeMetaState(0) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i7++;
                    i4 = 43694;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = MediaDescriptionCompat;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i8 = $11 + 15;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            int i10 = 0;
            while (i10 < length3) {
                Object[] objArr3 = new Object[1];
                objArr3[i6] = Integer.valueOf(iArr5[i10]);
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(i5);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (43695 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (ExpandableListView.getPackedPositionForGroup(i6) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(i6) == 0L ? 0 : -1)) + 23297, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 14, -1648776394, false, "A", new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                i10++;
                i5 = -470782045;
                i6 = 0;
            }
            int i11 = $11 + 111;
            $10 = i11 % 128;
            int i12 = i11 % 2;
            iArr5 = iArr6;
            i2 = 0;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i2;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            cArr[i2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr4);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i13];
                Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (43694 - MotionEvent.axisFromString("")), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23296, TextUtils.getOffsetAfter("", 0) + 15, -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
                i13++;
            }
            int i15 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i15;
            buildremovealldownloadsintent.read ^= iArr4[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[17];
            int i16 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i17 = buildremovealldownloadsintent.read;
            cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
            cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
            cArr[3] = (char) buildremovealldownloadsintent.read;
            buildRemoveAllDownloadsIntent.read(iArr4);
            cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
            Object[] objArr5 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(516305436);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (Color.red(0) + 48194), 20126 - (Process.myPid() >> 22), 20 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void i(int i, short s, int i2, int i3, byte b, Object[] objArr) throws Throwable {
        int i4;
        int i5;
        int i6 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
            char c = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (KeyEvent.getMaxKeyCode() >> 16), 24297 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 11, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            int i7 = -1;
            boolean z = iIntValue == -1;
            if (z) {
                byte[] bArr = MediaBrowserCompatSearchResultReceiver;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        try {
                            Object[] objArr3 = new Object[1];
                            objArr3[c] = Integer.valueOf(bArr[i8]);
                            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                byte b2 = (byte) i7;
                                byte b3 = (byte) (b2 + 1);
                                objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 3082 - (Process.myTid() >> 22), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 128, 2145850993, false, $$u(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i8] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                            i8++;
                            c = 0;
                            i7 = -1;
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i9 = $11 + 15;
                    $10 = i9 % 128;
                    if (i9 % 2 != 0) {
                        byte[] bArr3 = MediaBrowserCompatSearchResultReceiver;
                        try {
                            Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(RemoteActionCompatParcelizer)};
                            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                            if (objRemoteActionCompatParcelizer3 == null) {
                                objRemoteActionCompatParcelizer3 = startForeground.read((char) TextUtils.getTrimmedLength(""), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 24296, 12 - (ViewConfiguration.getPressedStateDuration() >> 16), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            i5 = ((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) * 7899112766888837815L)) >> ((int) (((long) MediaBrowserCompatCustomActionResultReceiver) & 7899112766888837815L));
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        byte[] bArr4 = MediaBrowserCompatSearchResultReceiver;
                        Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(RemoteActionCompatParcelizer)};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(559968424);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) Color.green(0), 24297 - (ViewConfiguration.getFadingEdgeLength() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 11, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        i5 = ((byte) (((long) bArr4[((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ 7899112766888837815L));
                    }
                    iIntValue = (byte) i5;
                } else {
                    iIntValue = (short) (((short) (((long) RatingCompat[i2 + ((int) (((long) RemoteActionCompatParcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ 7899112766888837815L)));
                }
            }
            if (iIntValue > 0) {
                int i10 = ((i2 + iIntValue) - 2) + ((int) (((long) RemoteActionCompatParcelizer) ^ 7899112766888837815L));
                if (!z) {
                    i4 = 0;
                } else {
                    int i11 = $11 + 71;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    i4 = 1;
                }
                buildresumedownloadsintent.read = i10 + i4;
                Object[] objArr6 = {buildresumedownloadsintent, Integer.valueOf(i), Integer.valueOf(MediaMetadataCompat), sb};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (34133 - TextUtils.lastIndexOf("", '0', 0, 0)), (Process.myTid() >> 22) + 13432, 21 - Color.red(0), 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr5 = MediaBrowserCompatSearchResultReceiver;
                if (bArr5 != null) {
                    int length2 = bArr5.length;
                    byte[] bArr6 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        bArr6[i13] = (byte) (((long) bArr5[i13]) ^ 7899112766888837815L);
                    }
                    bArr5 = bArr6;
                }
                boolean z2 = bArr5 != null;
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    int i14 = $11 + 85;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    if (z2) {
                        byte[] bArr7 = MediaBrowserCompatSearchResultReceiver;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr7[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        short[] sArr = RatingCompat;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                        int i16 = $11 + 115;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                    }
                    sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x029e  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x010c  */
    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3106
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getStartTimeUs.onCreate(android.os.Bundle):void");
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 97;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.AudioAttributesCompatParcelizer;
        if (getsubjectstat != null) {
            getsubjectstat.AudioAttributesCompatParcelizer();
        }
        int i4 = handleMediaPlayPauseIfPendingOnHandler + 37;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 28 / 0;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 43;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = onMediaButtonEvent().af_();
        int i4 = handleMediaPlayPauseIfPendingOnHandler + 35;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return objAf_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted onFastForward() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatMediaItem + 109;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted onMediaButtonEvent() {
        if (this.write == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.write == null) {
                    this.write = onFastForward();
                }
            }
        }
        return this.write;
    }

    protected final void onCommand() {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 7;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.read) {
            return;
        }
        this.read = true;
        ((SsMediaSourceExternalSyntheticLambda0) af_()).read((SsChunkSource) getSubmittedOnDate.AudioAttributesCompatParcelizer(this));
        int i3 = MediaBrowserCompatMediaItem + 125;
        handleMediaPlayPauseIfPendingOnHandler = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 121;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = MediaBrowserCompatMediaItem + 11;
        handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
        if (i4 % 2 != 0) {
            return RemoteActionCompatParcelizer2;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 107;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = MediaBrowserCompatMediaItem + 93;
            handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            i(Color.rgb(0, 0, 0) - 113135219, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), (-1379161130) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 5, (byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            i(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) - 129912482, (short) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1379161105, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 117, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 4), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i6 = handleMediaPlayPauseIfPendingOnHandler + 65;
            MediaBrowserCompatMediaItem = i6 % 128;
            if (i6 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i7 = handleMediaPlayPauseIfPendingOnHandler + 3;
                MediaBrowserCompatMediaItem = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        if (baseContext != null) {
            int i9 = handleMediaPlayPauseIfPendingOnHandler + 35;
            MediaBrowserCompatMediaItem = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - KeyEvent.getDeadChar(0, 0)), TextUtils.lastIndexOf("", '0', 0) + 6055, 42 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 6030, 24 - KeyEvent.normalizeMetaState(0), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i11 = MediaBrowserCompatMediaItem + 45;
                handleMediaPlayPauseIfPendingOnHandler = i11 % 128;
                int i12 = i11 % 2;
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

    /* JADX WARN: Removed duplicated region for block: B:13:0x0126  */
    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 539
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getStartTimeUs.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0dc1 A[Catch: all -> 0x04c3, TryCatch #3 {all -> 0x04c3, blocks: (B:208:0x12e6, B:210:0x12ec, B:211:0x1311, B:250:0x1824, B:252:0x182a, B:253:0x184e, B:231:0x15a7, B:233:0x15c9, B:234:0x161c, B:176:0x0dbb, B:178:0x0dc1, B:179:0x0de4, B:69:0x05f5, B:71:0x05fb, B:72:0x0620, B:19:0x010b, B:21:0x0111, B:22:0x013e, B:24:0x0431, B:26:0x0462, B:27:0x04bd, B:33:0x04ce, B:35:0x04d2, B:39:0x04de, B:55:0x05a3, B:57:0x05a9, B:58:0x05aa, B:60:0x05ac, B:62:0x05b3, B:63:0x05b4), top: B:280:0x010b, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0e77  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0ebd  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0f1a  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x12c5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x13a6  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x13ef  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x1493  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x1803  */
    /* JADX WARN: Removed duplicated region for block: B:319:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e1  */
    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r35) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6590
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getStartTimeUs.attachBaseContext(android.content.Context):void");
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 41;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
        int i4 = MediaBrowserCompatMediaItem + 11;
        handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 53 / 0;
        }
    }
}
