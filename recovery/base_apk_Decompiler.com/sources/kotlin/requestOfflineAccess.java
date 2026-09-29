package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class requestOfflineAccess extends addObserverForBackInvoker implements SubjectStat {
    private static short[] AudioAttributesImplApi26Parcelizer;
    private getSubjectStat IconCompatParcelizer;
    private volatile isHighlighted write;
    private static final byte[] $$l = {30, 6, -112, TarConstants.LF_FIFO};
    private static final int $$m = 12;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {85, -29, -43, -21, -64, 38, 34, -18, 20, 2, -1, -45, TarConstants.LF_BLK, -20, 3, 12, 5, -10, 7, 0, -32, 21, 16, 1, -10, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 13, -1, -62, 58, 9, 1, -7, 6, -6, -54, TarConstants.LF_BLK, 14, -9, 15, -2, -5, -4, -53, 64, -11, 20, -14, 14, -8, -7, 12, -61, 71, -18, 2, 18, -68, 39, 14, 2, -21, 22, 25, -9, 7, 0, -79, 79, -12, -3, 4, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$k = 81;
    private static final byte[] $$d = {28, -38, TarConstants.LF_DIR, -29, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 90;
    private static int MediaMetadataCompat = 0;
    private static int MediaDescriptionCompat = 1;
    private static char[] AudioAttributesCompatParcelizer = {44989, 45037, 45024, 45049, 45030, 45038, 45027, 45050, 45035, 44981, 45018, 45051, 44996, 44995, 45036, 45030, 45050, 45025, 44984, 44992, 44995, 44992, 44987, 44994, 44993, 44998, 45039, 45033, 44995, 44985, 44990, 44993, 44992, 44995, 44993, 44993, 44998, 44988, 44988, 44989, 44999, 44995, 44995, 45032, 44992, 44987, 44992, 44999, 44996, 45038, 44998, 44985, 44990, 44998, 45032, 45038, 44996, 44998, 45035, 44995, 44987, 44987, 44984, 44984, 44991, 44997, 45038, 44996, 44988, 44990, 44985, 44990, 44988, 44992, 44998, 44996, 45033, 45033, 44998, 44998, 44993, 44987, 45024, 44895, 44896, 44898, 44896, 44681, 44681, 44903, 44889, 44898, 44897, 44903, 44898, 44871, 44890, 44899, 44902, 44888, 44891, 44894, 44894, 44894, 44869, 44898, 44900, 44900, 44900, 44891, 44868, 44890, 44890, 44889, 44895, 44897, 44898, 44890, 44991, 45037, 45027, 45031, 45021, 45010, 45027, 45030, 45049, 45052, 45036, 45002, 45018, 45051, 44996, 44995, 45036, 45030, 45050, 45025, 45027, 45037, 44984, 45027, 45025, 45028, 45050, 45036, 45033, 45009, 45009, 45038, 45030, 45051, 45026, 45036, 45026};
    private static int AudioAttributesImplApi21Parcelizer = -381447385;
    private static int MediaBrowserCompatCustomActionResultReceiver = -819363139;
    private static int MediaBrowserCompatItemReceiver = 1508158827;
    private static byte[] AudioAttributesImplBaseParcelizer = {TarConstants.LF_GNUTYPE_LONGNAME, -93, 107, -69, -76, TarConstants.LF_GNUTYPE_LONGLINK, 68, -67, -93, 108, -78, -68, 68, -70, 66, -90, -107, -92, 9, -73, -72, -124, 125, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -71, 65, -70, 72, -79, 66, -92, 73, 77, 74, TarConstants.LF_GNUTYPE_LONGLINK, -73, -104, 122, -79, -66, 68, -73, 74, -91, 72, -102, -74, -76, TarConstants.LF_GNUTYPE_LONGLINK, -79, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -102, 98, 72, -74, 74, -104, -77, 122, -126, 73, -74, 73, 101, -102, 121, -103, 72, 100, -74, -123, -76, 122, 73, -126, TarConstants.LF_GNUTYPE_LONGNAME, 102, 73, -74, -101, -79, 74, -75, 101, -74, 74, -74, 74, -127, TarConstants.LF_GNUTYPE_LONGNAME, 101, -77, 121, -121, 101, 73, 72, -103, -76, -74, TarConstants.LF_GNUTYPE_LONGNAME, -65, -74, TarConstants.LF_GNUTYPE_LONGNAME, TarConstants.LF_GNUTYPE_LONGLINK, -66, 123, -124, 124, -75, -73, -75, -100, 72, -65, 74, -74, 123, -124, 102, -103, -77, -73, 73, TarConstants.LF_GNUTYPE_LONGNAME, 73, -66, 72, -73, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -98, -78, TarConstants.LF_GNUTYPE_LONGLINK, -75, 74, 111, TarConstants.LF_GNUTYPE_LONGLINK, -77, -100, 101, -124, -74, 121, 73, -102, -75, 72, 72, 97, -99, -80, 122, -73, -124, 72, -79, -66, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -90, -127, 74, 11, -16, 12, -74, -71, 73, 78, -78, -115, 113, 78, -72, -123, 117, 73, -69, -126, 126, 68, -90, 91, -77, 73, -72, 69, -90, 91, -71, -114, 13, -74, -91, 73, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -92, TarConstants.LF_GNUTYPE_LONGLINK, 68, -67, 67, -15, 12, -72, 65, 78, -79, 74, 78, -70, -76, -65, 74, -126, -73, 66, 112, -76, TarConstants.LF_GNUTYPE_LONGLINK, -73, -69, -77, 77, -76, -76, 66, -65, 70, -74, 77, -111, -110, 112, 78, -70, 66, -119, 122, 92, -94, 64, -74, 66, -101, 108, 66, -91, -82, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -78, -68, 66, -79, -66, -74, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -80, TarConstants.LF_GNUTYPE_LONGNAME, -74, 74, -78, TarConstants.LF_GNUTYPE_LONGNAME, -80, 73, -75, TarConstants.LF_GNUTYPE_LONGLINK, 73, -74, -77, 72, -77, 77, -78, 78, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73, -73};
    private final Object read = new Object();
    private boolean RemoteActionCompatParcelizer = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(byte r6, byte r7, short r8) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 112
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r0 = kotlin.requestOfflineAccess.$$l
            int r6 = r6 * 2
            int r1 = r6 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2a
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L22:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.requestOfflineAccess.$$n(byte, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.requestOfflineAccess.$$d
            int r7 = 114 - r7
            int r1 = r8 + 4
            int r6 = 191 - r6
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r3 = r3 + r6
            int r6 = r7 + 1
            int r7 = r3 + (-1)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.requestOfflineAccess.g(int, byte, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r0 = r8 + 20
            byte[] r1 = kotlin.requestOfflineAccess.$$j
            int r7 = r7 + 73
            byte[] r0 = new byte[r0]
            int r8 = r8 + 19
            r2 = -1
            if (r1 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2d
        L13:
            r3 = r2
        L14:
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r0, r7)
            r9[r7] = r6
            return
        L24:
            int r6 = r6 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.requestOfflineAccess.h(byte, byte, byte, java.lang.Object[]):void");
    }

    requestOfflineAccess() {
        AudioAttributesImplBaseParcelizer();
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.requestOfflineAccess.1
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                requestOfflineAccess.this.AudioAttributesImplApi26Parcelizer();
            }
        });
        int i2 = MediaDescriptionCompat + 57;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 11;
        MediaMetadataCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getSubjectStat getsubjectstatWrite = MediaBrowserCompatItemReceiver().write();
            this.IconCompatParcelizer = getsubjectstatWrite;
            if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                this.IconCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            }
            int i3 = MediaDescriptionCompat + 61;
            MediaMetadataCompat = i3 % 128;
            if (i3 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        getSubjectStat getsubjectstatWrite2 = MediaBrowserCompatItemReceiver().write();
        this.IconCompatParcelizer = getsubjectstatWrite2;
        getsubjectstatWrite2.RemoteActionCompatParcelizer();
        throw null;
    }

    private static void e(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        char[] cArr;
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = AudioAttributesCompatParcelizer;
        char c = '0';
        if (cArr2 != null) {
            int i8 = $10 + 55;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i10 = 0;
            while (i10 < length) {
                int i11 = $10 + 101;
                $11 = i11 % 128;
                int i12 = i11 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i10])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.getOffsetBefore("", 0), AndroidCharacter.getMirror(c) + 11565, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 20, -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr3[i10] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i10++;
                    i2 = 2;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr2, i4, cArr4, 0, i5);
        if (bArr != null) {
            char[] cArr5 = new char[i5];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c2 = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i13 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 22959 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 43, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i13] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (KeyEvent.getDeadChar(0, 0) + 31589), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 9862, TextUtils.lastIndexOf("", '0', 0, 0) + 66, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i14] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr5[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (View.resolveSize(0, 0) + 37822), Color.alpha(0) + 9754, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr4 = cArr5;
        }
        if (i7 > 0) {
            int i15 = $11 + 23;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                char[] cArr6 = new char[i5];
                System.arraycopy(cArr4, 0, cArr6, 1, i5);
                System.arraycopy(cArr6, 0, cArr4, i5 % i7, i7);
                System.arraycopy(cArr6, i7, cArr4, 1, i5 * i7);
            } else {
                char[] cArr7 = new char[i5];
                System.arraycopy(cArr4, 0, cArr7, 0, i5);
                int i16 = i5 - i7;
                System.arraycopy(cArr7, 0, cArr4, i16, i7);
                System.arraycopy(cArr7, i7, cArr4, 0, i16);
            }
        }
        if (z) {
            int i17 = $10 + 3;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                cArr = new char[i5];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 1;
            } else {
                cArr = new char[i5];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            }
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                int i18 = $11 + 53;
                $10 = i18 % 128;
                if (i18 % 2 != 0) {
                    cArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr4[(i5 % buildsetstopreasonintent.RemoteActionCompatParcelizer) << 1];
                    i = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                } else {
                    cArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr4[(i5 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                    i = buildsetstopreasonintent.RemoteActionCompatParcelizer + 1;
                }
                buildsetstopreasonintent.RemoteActionCompatParcelizer = i;
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private static void f(short s, byte b, int i, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i2), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
            int i5 = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 24297 - TextUtils.getOffsetAfter("", 0), 11 - TextUtils.indexOf((CharSequence) "", '0', 0), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if ((i6 ^ 1) == 0) {
                int i7 = $11 + 1;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                byte[] bArr = AudioAttributesImplBaseParcelizer;
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
                            byte b3 = b2;
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (TypedValue.complexToFraction(i5, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(i5, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 3082 - TextUtils.indexOf("", "", i5, i5), 129 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 2145850993, false, $$n(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i9] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i9++;
                        i5 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = AudioAttributesImplBaseParcelizer;
                    Object[] objArr4 = {Integer.valueOf(i), Integer.valueOf(AudioAttributesImplApi21Parcelizer)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) View.combineMeasuredStates(0, 0), View.MeasureSpec.getSize(0) + 24297, 12 - Color.argb(0, 0, 0, 0), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ 7899112766888837815L)));
                } else {
                    iIntValue = (short) (((short) (((long) AudioAttributesImplApi26Parcelizer[i + ((int) (((long) AudioAttributesImplApi21Parcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ 7899112766888837815L)));
                }
            }
            if (iIntValue > 0) {
                buildresumedownloadsintent.read = ((i + iIntValue) - 2) + ((int) (((long) AudioAttributesImplApi21Parcelizer) ^ 7899112766888837815L)) + i6;
                try {
                    Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i3), Integer.valueOf(MediaBrowserCompatItemReceiver), sb};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 34133), ImageFormat.getBitsPerPixel(0) + 13433, View.combineMeasuredStates(0, 0) + 21, 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    byte[] bArr4 = AudioAttributesImplBaseParcelizer;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i10 = 0; i10 < length2; i10++) {
                            bArr5[i10] = (byte) (((long) bArr4[i10]) ^ 7899112766888837815L);
                        }
                        bArr4 = bArr5;
                    }
                    boolean z = bArr4 != null;
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                    while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                        int i11 = $11;
                        int i12 = i11 + 79;
                        $10 = i12 % 128;
                        int i13 = i12 % 2;
                        if (z) {
                            int i14 = i11 + 121;
                            $10 = i14 % 128;
                            int i15 = i14 % 2;
                            byte[] bArr6 = AudioAttributesImplBaseParcelizer;
                            buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                            buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                        } else {
                            short[] sArr = AudioAttributesImplApi26Parcelizer;
                            buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                            buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                        }
                        sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                        buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                        buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                        int i16 = $11 + 75;
                        $10 = i16 % 128;
                        int i17 = i16 % 2;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
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

    /* JADX WARN: Removed duplicated region for block: B:10:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0291  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0293  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r36) {
        /*
            Method dump skipped, instruction units count: 2732
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.requestOfflineAccess.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.IconCompatParcelizer;
        if (getsubjectstat != null) {
            int i2 = MediaDescriptionCompat + 73;
            MediaMetadataCompat = i2 % 128;
            int i3 = i2 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
            int i4 = MediaDescriptionCompat + 5;
            MediaMetadataCompat = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 67;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        if (i3 != 0) {
            return ishighlightedMediaBrowserCompatItemReceiver.af_();
        }
        ishighlightedMediaBrowserCompatItemReceiver.af_();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaMetadataCompat + 17;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        if (this.write == null) {
            synchronized (this.read) {
                if (this.write == null) {
                    this.write = MediaBrowserCompatCustomActionResultReceiver();
                }
            }
        }
        return this.write;
    }

    protected final void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 75;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 56 / 0;
            if (this.RemoteActionCompatParcelizer) {
                return;
            }
        } else if (!(!this.RemoteActionCompatParcelizer)) {
            return;
        }
        this.RemoteActionCompatParcelizer = true;
        int i4 = MediaDescriptionCompat + 15;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 % 5;
        }
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 35;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 != 0) {
            RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
            int i3 = 31 / 0;
        } else {
            RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        }
        int i4 = MediaMetadataCompat + 5;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x01ae  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 567
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.requestOfflineAccess.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x01ca  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 597
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.requestOfflineAccess.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x0987  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x09c7 A[Catch: all -> 0x0a7e, TryCatch #14 {all -> 0x0a7e, blocks: (B:87:0x09c1, B:89:0x09c7, B:90:0x09f3), top: B:292:0x09c1, outer: #0 }] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r34) {
        /*
            Method dump skipped, instruction units count: 6434
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.requestOfflineAccess.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 103;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaMetadataCompat + 7;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }
}
