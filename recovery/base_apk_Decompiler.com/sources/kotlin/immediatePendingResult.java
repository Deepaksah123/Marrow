package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
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
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class immediatePendingResult extends addObserverForBackInvoker implements SubjectStat {
    private static short[] MediaBrowserCompatItemReceiver;
    private volatile isHighlighted IconCompatParcelizer;
    private getSubjectStat write;
    private static final byte[] $$c = {43, -12, TarConstants.LF_GNUTYPE_LONGNAME, -80};
    private static final int $$f = 96;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {18, -64, -35, -97, -54, 68, 9, 26, -21, 31, 24, 3, 0, 23, -2, 19, 14, -12, 40, 5, -61, 57, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -54, 68, 9, 26, -35, TarConstants.LF_BLK, 10, 17, -22, 33, 28, -10, -5, 36, 6, 22, -69, 57, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -8};
    private static final int $$h = 57;
    private static final byte[] $$a = {TarConstants.LF_GNUTYPE_LONGNAME, 36, -23, -15, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 84;
    private static int MediaMetadataCompat = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer = 222026891;
    private static int AudioAttributesImplBaseParcelizer = -819363188;
    private static int AudioAttributesImplApi21Parcelizer = 24568325;
    private static byte[] AudioAttributesImplApi26Parcelizer = {96, -86, -92, -88, 94, 87, -120, -120, 17, -82, -21, 96, 81, 80, 87, -92, 92, -89, 125, -36, TarConstants.LF_CHR, -5, 43, 96, 9, -16, 3, -27, 8, 12, 11, 10, -10, -39, 59, -16, -1, 5, -10, 11, -28, -78, -7, TarConstants.LF_CHR, -51, 47, 3, 2, -45, -2, -4, 6, -11, -4, 6, 1, -12, TarConstants.LF_LINK, -50, TarConstants.LF_FIFO, -1, -3, -1, -42, 2, -11, 0, -4, TarConstants.LF_LINK, -50, 44, -45, -7, -3, 3, 6, 3, -12, 2, -3, TarConstants.LF_SYMLINK, -44, -8, 1, -1, 0, 37, 1, -7, -42, 47, -50, -4, TarConstants.LF_CHR, 3, -48, -1, 2, 2, 43, -41, -6, TarConstants.LF_NORMAL, -3, -50, -78, 98, -97, 97, -76, 77, -77, 81, -82, 80, -99, 101, -80, -101, 98, 79, -76, 81, -98, -81, TarConstants.LF_GNUTYPE_SPARSE, -85, TarConstants.LF_GNUTYPE_SPARSE, 97, -85, TarConstants.LF_GNUTYPE_SPARSE, -82, 100, -100, 78, -74, 77, -100, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, -101, 99, -102, -75, -97, TarConstants.LF_GNUTYPE_LONGNAME, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, -97, 98, -97, 97, -81, 97, 73, -76, 96, 99, 73, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, -100, -79, 96, TarConstants.LF_GNUTYPE_LONGNAME, -75, 81, 97, -83, 99, 80, -81, -65, -43, 44, 35, -59, 59, 28, -41, -106, 109, -111, 43, 36, -44, -45, 47, 16, -20, -45, 37, 24, -24, -44, 38, 31, -29, -39, 59, -58, 46, -44, 37, -40, 59, -58, 36, 19, -112, 43, 56, -44, -59, 57, -42, -39, 32, -34, 108, -111, 37, -36, -45, 44, -41, -45, 39, 41, 34, -41, 31, 42, -33, -19, 41, -42, 42, 38, 124, -70, 68, -67, -67, TarConstants.LF_GNUTYPE_LONGLINK, 94, -36, 9, -20, 23, -33, 34, -14, -39, 13, -10, 13, -27, 33, 34, 12, -11, -48, 42, -33, 34, -34, -37, 27, -14, 14, -14, -41, 32, -36, 35, 32, 35, 9, -19, 35, 98, 33, -40, 40, -45, 15, 12, -18, -48, 36, -36, 23, -28, -62, 60, -34, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, -85, -84, 86, -86, 80, -84, 84, -86, 86, -81};
    private static long MediaBrowserCompatCustomActionResultReceiver = -6049463603435896366L;
    private final Object AudioAttributesCompatParcelizer = new Object();
    private boolean read = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(byte r5, int r6, int r7) {
        /*
            int r5 = r5 + 4
            int r7 = r7 + 112
            byte[] r0 = kotlin.immediatePendingResult.$$c
            int r6 = r6 * 2
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L20:
            r4 = r0[r5]
            int r3 = r3 + 1
        L24:
            int r7 = r7 + r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.immediatePendingResult.$$i(byte, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 114 - r8
            byte[] r0 = kotlin.immediatePendingResult.$$a
            int r6 = 190 - r6
            int r1 = r7 + 4
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2b
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r6 = r6 + 1
            r3 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.immediatePendingResult.c(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.immediatePendingResult.$$g
            int r8 = r8 * 29
            int r8 = 111 - r8
            int r1 = 47 - r7
            int r6 = r6 * 9
            int r6 = 76 - r6
            byte[] r1 = new byte[r1]
            int r7 = 46 - r7
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r3 = r3 + r6
            int r6 = r3 + (-11)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.immediatePendingResult.d(byte, short, int, java.lang.Object[]):void");
    }

    immediatePendingResult() {
        MediaBrowserCompatItemReceiver();
    }

    private void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.immediatePendingResult.5
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                immediatePendingResult.this.AudioAttributesImplApi26Parcelizer();
            }
        });
        int i2 = MediaBrowserCompatMediaItem + 67;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 31;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            this.write = AudioAttributesImplApi21Parcelizer().write();
            if (!(!r1.RemoteActionCompatParcelizer())) {
                this.write.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                int i3 = MediaMetadataCompat + 121;
                MediaBrowserCompatMediaItem = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        getSubjectStat getsubjectstatWrite = AudioAttributesImplApi21Parcelizer().write();
        this.write = getsubjectstatWrite;
        getsubjectstatWrite.RemoteActionCompatParcelizer();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = $11 + 81;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = notifydownloadchanged.AudioAttributesCompatParcelizer;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        objRemoteActionCompatParcelizer = startForeground.read((char) (38462 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 532, 8 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -735610793, false, $$i(b, b2, (byte) (b2 | 9)), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() - (MediaBrowserCompatCustomActionResultReceiver / 2192498202983240651L);
                    Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ExpandableListView.getPackedPositionType(0L) + 36621), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2340, 28 - View.getDefaultSize(0, 0), 188119637, false, $$i(b3, b4, (byte) (b4 | 7)), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i5 = notifydownloadchanged.AudioAttributesCompatParcelizer;
                Object[] objArr4 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b5 = (byte) (-1);
                    byte b6 = (byte) (b5 + 1);
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (38461 - (KeyEvent.getMaxKeyCode() >> 16)), 532 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 7, -735610793, false, $$i(b5, b6, (byte) (b6 | 9)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).longValue() ^ (MediaBrowserCompatCustomActionResultReceiver ^ 2192498202983240651L);
                Object[] objArr5 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b7 = (byte) (-1);
                    byte b8 = (byte) (b7 + 1);
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (36621 - (ViewConfiguration.getEdgeSlop() >> 16)), 2340 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 27 - MotionEvent.axisFromString(""), 188119637, false, $$i(b7, b8, (byte) (b8 | 7)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i6 = $10 + 25;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr6 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer5 == null) {
                byte b9 = (byte) (-1);
                byte b10 = (byte) (b9 + 1);
                objRemoteActionCompatParcelizer5 = startForeground.read((char) ((ViewConfiguration.getTapTimeout() >> 16) + 36621), Color.alpha(0) + 2340, (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 27, 188119637, false, $$i(b9, b10, (byte) (b10 | 7)), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x015f  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r42) {
        /*
            Method dump skipped, instruction units count: 2869
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.immediatePendingResult.onCreate(android.os.Bundle):void");
    }

    private static void a(byte b, int i, int i2, short s, int i3, Object[] objArr) throws Throwable {
        int i4;
        long j;
        int i5 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(AudioAttributesImplBaseParcelizer)};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            int i6 = -1;
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), 24297 - Drawable.resolveOpacity(0, 0), 12 - View.combineMeasuredStates(0, 0), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                i4 = 1;
            } else {
                int i7 = $10 + 21;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i4 = 0;
            }
            if (i4 != 0) {
                byte[] bArr = AudioAttributesImplApi26Parcelizer;
                long j2 = 0;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            char cBlue = (char) Color.blue(0);
                            int iAxisFromString = MotionEvent.axisFromString("") + 3083;
                            int i10 = (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)) + 127;
                            byte b2 = (byte) i6;
                            byte b3 = (byte) (b2 + 1);
                            objRemoteActionCompatParcelizer2 = startForeground.read(cBlue, iAxisFromString, i10, 2145850993, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i9++;
                        i6 = -1;
                        j2 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = AudioAttributesImplApi26Parcelizer;
                    Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(RemoteActionCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 24298, 12 - View.MeasureSpec.getSize(0), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesImplBaseParcelizer) ^ 7899112766888837815L)));
                    j = 7899112766888837815L;
                } else {
                    j = 7899112766888837815L;
                    iIntValue = (short) (((short) (((long) MediaBrowserCompatItemReceiver[i2 + ((int) (((long) RemoteActionCompatParcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesImplBaseParcelizer) ^ 7899112766888837815L)));
                }
            } else {
                j = 7899112766888837815L;
            }
            if (iIntValue > 0) {
                buildresumedownloadsintent.read = ((i2 + iIntValue) - 2) + ((int) (((long) RemoteActionCompatParcelizer) ^ j)) + i4;
                Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i), Integer.valueOf(AudioAttributesImplApi21Parcelizer), sb};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (34133 - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 13432, 21 - View.combineMeasuredStates(0, 0), 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr4 = AudioAttributesImplApi26Parcelizer;
                if (bArr4 != null) {
                    int i11 = $10 + 123;
                    $11 = i11 % 128;
                    int i12 = i11 % 2;
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        bArr5[i13] = (byte) (((long) bArr4[i13]) ^ 7899112766888837815L);
                    }
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    if (!z) {
                        short[] sArr = MediaBrowserCompatItemReceiver;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r7]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        int i14 = $11 + 9;
                        $10 = i14 % 128;
                        if (i14 % 2 != 0) {
                            byte[] bArr6 = AudioAttributesImplApi26Parcelizer;
                            buildresumedownloadsintent.read = buildresumedownloadsintent.read;
                            buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer * (((byte) (((byte) (((long) bArr6[r7]) | 7899112766888837815L)) + s)) ^ b));
                        } else {
                            byte[] bArr7 = AudioAttributesImplApi26Parcelizer;
                            buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                            buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr7[r7]) ^ 7899112766888837815L)) + s)) ^ b));
                            sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                            buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                            buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                        }
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

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 101;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.write;
        if (getsubjectstat != null) {
            getsubjectstat.AudioAttributesCompatParcelizer();
            int i4 = MediaMetadataCompat + 57;
            MediaBrowserCompatMediaItem = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 107;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (i3 != 0) {
            ishighlightedAudioAttributesImplApi21Parcelizer.af_();
            throw null;
        }
        Object objAf_ = ishighlightedAudioAttributesImplApi21Parcelizer.af_();
        int i4 = MediaMetadataCompat + 67;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaMetadataCompat + 37;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 91 / 0;
        }
        return ishighlighted;
    }

    private isHighlighted AudioAttributesImplApi21Parcelizer() {
        if (this.IconCompatParcelizer == null) {
            synchronized (this.AudioAttributesCompatParcelizer) {
                if (this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = AudioAttributesImplBaseParcelizer();
                }
            }
        }
        return this.IconCompatParcelizer;
    }

    protected final void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 51;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        if (!this.read) {
            this.read = true;
        }
        int i4 = MediaBrowserCompatMediaItem + 115;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 119;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        if (i3 == 0) {
            int i4 = 52 / 0;
        }
        return RemoteActionCompatParcelizer2;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = MediaMetadataCompat + 61;
            MediaBrowserCompatMediaItem = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(3) + 27229, new char[]{4728, 30902, 51199, 21032, 47474, 1973, 37627, 63856, 17520, 53920, 14819, 33916, 4948, 31159, 50403, 21311, 48767, 1185, 37887, 65075, 17753, 54180, 16125, 34091, 4192, 32420}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((byte) (65 - (ViewConfiguration.getTouchSlop() >> 8)), 832610190 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, 1038983633 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 157, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = MediaMetadataCompat + 77;
            MediaBrowserCompatMediaItem = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            int i6 = MediaBrowserCompatMediaItem + 83;
            MediaMetadataCompat = i6 % 128;
            if (i6 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (Process.myPid() >> 22)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 6054, Color.green(0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.resolveSizeAndState(0, 0, 0) + 6030, 23 - ImageFormat.getBitsPerPixel(0), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i7 = MediaBrowserCompatMediaItem + 3;
                MediaMetadataCompat = i7 % 128;
                int i8 = i7 % 2;
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

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(27329 - TextUtils.getCapsMode("", 0, 0), new char[]{4728, 30902, 51199, 21032, 47474, 1973, 37627, 63856, 17520, 53920, 14819, 33916, 4948, 31159, 50403, 21311, 48767, 1185, 37887, 65075, 17753, 54180, 16125, 34091, 4192, 32420}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a((byte) (64 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 832610114 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 1038983642, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 4), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 64, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = MediaBrowserCompatMediaItem + 17;
            MediaMetadataCompat = i2 % 128;
            if (i2 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 4535), (KeyEvent.getMaxKeyCode() >> 16) + 6054, (ViewConfiguration.getScrollBarSize() >> 8) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.green(0), (-16771186) - Color.rgb(0, 0, 0), Color.argb(0, 0, 0, 0) + 24, -861814097, false, "read", new Class[]{Context.class});
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
        int i3 = MediaBrowserCompatMediaItem + 81;
        MediaMetadataCompat = i3 % 128;
        int i4 = i3 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x015d  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r42) {
        /*
            Method dump skipped, instruction units count: 6223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.immediatePendingResult.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 85;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaMetadataCompat + 29;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
    }
}
