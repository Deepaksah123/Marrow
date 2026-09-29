package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
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

/* JADX INFO: loaded from: classes4.dex */
public abstract class ActivityTransitionResult extends addObserverForBackInvoker implements SubjectStat {
    private static short[] AudioAttributesImplApi21Parcelizer;
    private getSubjectStat AudioAttributesCompatParcelizer;
    private volatile isHighlighted read;
    private static final byte[] $$c = {10, -58, 112, 6};
    private static final int $$f = 96;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {TarConstants.LF_SYMLINK, -57, 8, -14, TarConstants.LF_FIFO, -68, -9, -26, 35, -52, -10, -17, 22, -33, -28, 10, 5, -36, -6, -22, 69, -57, -30, -19, -13, -16, 4, 25, -45, -28, 0, -17, -10, 32, -55, -9, -14, 4, -30, 25, -28, -28, 4, -13, -18, -8, -28, 10, -24, 8, -30, -19, -13, -16, 4, 25, -45, -28, 0, -17, -10, 32, -55, -9, -14, 4, -30, 25, -28, -28, 4, -13, -18, -8, -28, 10, -24, TarConstants.LF_FIFO, -35, -58, -2, -11, 14, -29, -13, -17, -3, -20, -17, 36, -52, 0, -26, -18, -2, -15, 0, -17, -10, 24, -37, -31, 43, -41, -13, -16, -8, 41, -6, -2, -22, 4};
    private static final int $$h = 85;
    private static final byte[] $$a = {28, -38, TarConstants.LF_DIR, -29, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 84;
    private static int MediaDescriptionCompat = 0;
    private static int RatingCompat = 1;
    private static char[] RemoteActionCompatParcelizer = {44986, 45037, 45027, 45025, 45050, 45030, 45036, 44995, 44996, 45051, 45018, 44981, 45035, 45050, 45027, 45038, 45030, 45049, 45004, 44805, 44802, 44826, 44822, 44946, 44986, 44991, 44988, 44990, 44988, 44997, 45039, 45038, 44998, 44999, 44998, 44991, 44985, 44995, 45033, 44995, 44985, 44998, 44998, 44988, 44991, 44988, 44999, 45033, 44995, 44986, 44992, 44999, 44993, 45033, 45033, 44999, 44989, 44989, 44988, 44988, 44999, 44995, 44987, 44986, 44990, 44978, 44990, 44987, 44986, 44984, 44993, 44992, 44998, 44998, 44984, 44987, 44990, 44989, 44998, 45033, 45038, 45039, 44993, 44992, 44992, 44990, 44989, 45018, 44823, 44822, 44843, 44821, 44817, 44964, 45009, 45049, 45052, 45034, 45012, 45009, 45009, 45011, 45014, 45043, 45043, 45043, 45049, 45008, 45013, 45013, 45013, 45014, 45015, 45053, 45054, 45009, 45010, 45049, 45042, 45052, 45049, 45012, 45042, 44804, 44804, 45055, 45049, 45055, 45034, 44991, 45037, 45027, 45031, 45021, 45010, 45027, 45030, 45049, 45052, 45036, 45002, 45018, 45051, 44996, 44995, 45036, 45030, 45050, 45025, 45027, 45037, 45019, 44844, 44844, 44845, 44835, 44844, 44845, 44832, 44832, 44834, 44844, 44946, 44985, 44989, 44991, 44990, 44988, 44989, 44988, 44988, 44991, 44985};
    private static int AudioAttributesImplApi26Parcelizer = -912619458;
    private static int MediaBrowserCompatCustomActionResultReceiver = -819363096;
    private static int MediaBrowserCompatItemReceiver = 48376362;
    private static byte[] AudioAttributesImplBaseParcelizer = {-64, 63, TarConstants.LF_NORMAL, -55, -41, 24, -58, -56, TarConstants.LF_NORMAL, -50, TarConstants.LF_FIFO, -46, -31, -48, 125, -61, -52, -16, 9, 56, 57, 62, -51, TarConstants.LF_DIR, -50, -101, 98, -111, 119, -102, -98, -103, -104, 100, TarConstants.LF_GNUTYPE_LONGLINK, -87, 98, 109, -105, 100, -103, 118, 115, -95, -115, -113, 112, -118, 67, -95, 89, 115, -115, 113, -93, -120, 65, -71, 114, -115, 114, 94, -95, 66, -94, 115, 95, -115, -66, -113, 65, 114, -71, 119, 93, 114, -115, -96, -118, 113, -114, 94, -115, 113, -115, 113, -70, 119, 94, -19, 16, -18, 59, -62, 60, -34, 33, -33, 18, -22, 63, 20, -19, -64, 59, -34, 17, 32, -36, 36, -36, -18, 36, -36, 33, -21, 19, -63, 57, -62, 19, -24, 20, -20, 21, 58, 16, -61, -24, 16, -19, 16, -18, 32, -18, -58, 59, -17, -20, -58, -24, 19, 62, -17, -61, 58, -34, -18, 34, -20, -33, 32, 35, -38, -43, TarConstants.LF_CHR, -51, -22, 33, 96, -101, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, -35, -46, 34, 37, -39, -26, 26, 37, -45, -18, 30, 34, -48, -23, 21, 47, -51, TarConstants.LF_NORMAL, -40, 34, -45, 46, -51, TarConstants.LF_NORMAL, -46, -27, 102, -35, -50, 34, TarConstants.LF_CHR, -49, 32, 47, -42, 40, -102, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, -45, 42, 37, -38, 33, 37, -47, -33, -44, 33, -23, -36, 41, 27, -33, 32, -36, -48, 94, -89, 87, -84, 112, 115, -111, -81, 91, -93, 104, -101, -67, 67, -95, -4, 8, -47, 38, 8, -17, -28, TarConstants.LF_SYMLINK, -8, -10, 8, -5, -12, -4, 6, -110, 110, -97, 98, 97, -106, 121, -124, -107, -104, 105, 101, -97, 109, -73, -73, -73, -73, -73, -73, -73, -73};
    private final Object IconCompatParcelizer = new Object();
    private boolean write = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(byte r7, byte r8, int r9) {
        /*
            int r9 = r9 * 3
            int r9 = 3 - r9
            int r7 = r7 * 3
            int r7 = r7 + 112
            byte[] r0 = kotlin.ActivityTransitionResult.$$c
            int r8 = r8 * 2
            int r8 = r8 + 1
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r9
            r4 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r9 = r9 + 1
            if (r4 != r8) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L26:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2b:
            int r9 = -r9
            int r7 = r7 + r9
            r9 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityTransitionResult.$$i(byte, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 + 4
            int r6 = 114 - r6
            int r8 = r8 + 4
            byte[] r1 = kotlin.ActivityTransitionResult.$$a
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L28
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L20:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L28:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-1)
            int r8 = r3 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityTransitionResult.c(byte, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = 108 - r7
            int r8 = r8 + 82
            byte[] r0 = kotlin.ActivityTransitionResult.$$g
            int r1 = r6 + 5
            byte[] r1 = new byte[r1]
            int r6 = r6 + 4
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            r5 = r8
            r8 = r7
            r7 = r5
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
        L2b:
            int r4 = -r4
            int r7 = r7 + 1
            int r8 = r8 + r4
            int r8 = r8 + (-11)
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityTransitionResult.d(int, int, int, java.lang.Object[]):void");
    }

    ActivityTransitionResult() {
        AudioAttributesImplApi26Parcelizer();
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.ActivityTransitionResult.1
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                ActivityTransitionResult.this.MediaBrowserCompatItemReceiver();
            }
        });
        int i2 = RatingCompat + 17;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 3;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            getSubjectStat getsubjectstatWrite = AudioAttributesImplBaseParcelizer().write();
            this.AudioAttributesCompatParcelizer = getsubjectstatWrite;
            int i3 = 6 / 0;
            if (!getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                return;
            }
        } else {
            getSubjectStat getsubjectstatWrite2 = AudioAttributesImplBaseParcelizer().write();
            this.AudioAttributesCompatParcelizer = getsubjectstatWrite2;
            if (!getsubjectstatWrite2.RemoteActionCompatParcelizer()) {
                return;
            }
        }
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
        int i4 = RatingCompat + 87;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void a(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = RemoteActionCompatParcelizer;
        char c = '0';
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), Color.red(0) + 11613, 19 - TextUtils.indexOf("", c, 0, 0), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i6++;
                    int i7 = $10 + 37;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            char[] cArr4 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c2 = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i9 = $10 + 103;
                    $11 = i9 % 128;
                    int i10 = i9 % 2;
                    int i11 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), MotionEvent.axisFromString("") + 22960, 43 - KeyEvent.normalizeMetaState(0), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    int i12 = $11 + 31;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                } else {
                    int i14 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (31589 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 9862, 65 - (Process.myTid() >> 22), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 37822), 9754 - ((Process.getThreadPriority(0) + 20) >> 6), 27 - TextUtils.getOffsetAfter("", 0), 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i15 = $10 + 101;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i17 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i17, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i17);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i3 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        String str = new String(cArr3);
        int i18 = $11 + 125;
        $10 = i18 % 128;
        if (i18 % 2 == 0) {
            objArr[0] = str;
        } else {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void b(int i, short s, int i2, int i3, byte b, Object[] objArr) throws Throwable {
        int i4;
        long j;
        boolean z;
        int i5 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            long j2 = 0;
            int i6 = -1;
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), 24297 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), AndroidCharacter.getMirror('0') - '$', 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                i4 = 1;
            } else {
                int i7 = $10 + 83;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                i4 = 0;
            }
            if (i4 == 1) {
                byte[] bArr = AudioAttributesImplBaseParcelizer;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i9 = 0;
                    while (i9 < length) {
                        try {
                            Object[] objArr3 = {Integer.valueOf(bArr[i9])};
                            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                            if (objRemoteActionCompatParcelizer2 == null) {
                                char c = (char) ((ViewConfiguration.getZoomControlsTimeout() > j2 ? 1 : (ViewConfiguration.getZoomControlsTimeout() == j2 ? 0 : -1)) + i6);
                                int fadingEdgeLength = 3082 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                int i10 = 127 - (ExpandableListView.getPackedPositionForChild(0, 0) > j2 ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == j2 ? 0 : -1));
                                byte b2 = (byte) 0;
                                byte b3 = b2;
                                objRemoteActionCompatParcelizer2 = startForeground.read(c, fadingEdgeLength, i10, 2145850993, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                            }
                            bArr2[i9] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                            i9++;
                            int i11 = $10 + 113;
                            $11 = i11 % 128;
                            int i12 = i11 % 2;
                            j2 = 0;
                            i6 = -1;
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
                    byte[] bArr3 = AudioAttributesImplBaseParcelizer;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(AudioAttributesImplApi26Parcelizer)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (-16752919) - Color.rgb(0, 0, 0), View.MeasureSpec.getMode(0) + 12, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ 7899112766888837815L)));
                    j = 7899112766888837815L;
                } else {
                    j = 7899112766888837815L;
                    iIntValue = (short) (((short) (((long) AudioAttributesImplApi21Parcelizer[i3 + ((int) (((long) AudioAttributesImplApi26Parcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ 7899112766888837815L)));
                }
            } else {
                j = 7899112766888837815L;
            }
            if (iIntValue > 0) {
                buildresumedownloadsintent.read = ((i3 + iIntValue) - 2) + ((int) (((long) AudioAttributesImplApi26Parcelizer) ^ j)) + i4;
                Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i2), Integer.valueOf(MediaBrowserCompatItemReceiver), sb};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (34134 - View.getDefaultSize(0, 0)), View.getDefaultSize(0, 0) + 13432, MotionEvent.axisFromString("") + 22, 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr4 = AudioAttributesImplBaseParcelizer;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        bArr5[i13] = (byte) (((long) bArr4[i13]) ^ 7899112766888837815L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i14 = $11 + 53;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                    z = true;
                } else {
                    z = false;
                }
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    if (!(!z)) {
                        byte[] bArr6 = AudioAttributesImplBaseParcelizer;
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
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x020b  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r34) {
        /*
            Method dump skipped, instruction units count: 2745
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityTransitionResult.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = RatingCompat + 19;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.AudioAttributesCompatParcelizer;
        if (getsubjectstat != null) {
            int i4 = RatingCompat + 3;
            MediaDescriptionCompat = i4 % 128;
            int i5 = i4 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = RatingCompat + 3;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplBaseParcelizer().af_();
        if (i3 != 0) {
            int i4 = 7 / 0;
        }
        return objAf_;
    }

    private isHighlighted MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaDescriptionCompat + 85;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return ishighlighted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        if (this.read == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.read == null) {
                    this.read = MediaBrowserCompatCustomActionResultReceiver();
                }
            }
        }
        return this.read;
    }

    protected final void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 55;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        if (!this.write) {
            this.write = true;
        }
        int i4 = RatingCompat + 37;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 65;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        if (i3 == 0) {
            int i4 = 26 / 0;
        }
        return RemoteActionCompatParcelizer2;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0195  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityTransitionResult.onResume():void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 104, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), 842291140 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (-112396936) - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (byte) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 116), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(3) - 123, (short) (Process.getGidForName("") + 1), 842291142 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (-112396916) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length(), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 154), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i2 = RatingCompat + 47;
            MediaDescriptionCompat = i2 % 128;
            int i3 = i2 % 2;
        }
        if (baseContext != null) {
            int i4 = RatingCompat + 69;
            MediaDescriptionCompat = i4 % 128;
            int i5 = i4 % 2;
            if (!(!(baseContext instanceof ContextWrapper)) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i6 = MediaDescriptionCompat + 21;
                RatingCompat = i6 % 128;
                int i7 = i6 % 2;
            }
        }
        if (baseContext != null) {
            int i8 = RatingCompat + 25;
            MediaDescriptionCompat = i8 % 128;
            int i9 = i8 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf("", "", 0) + 4535), Color.rgb(0, 0, 0) + 16783270, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.blue(0), 6030 - (Process.myPid() >> 22), (ViewConfiguration.getFadingEdgeLength() >> 16) + 24, -861814097, false, "read", new Class[]{Context.class});
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
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0b8b A[Catch: all -> 0x0323, TryCatch #1 {all -> 0x0323, blocks: (B:171:0x0b85, B:173:0x0b8b, B:174:0x0bb6, B:204:0x10a1, B:206:0x10a7, B:207:0x10d2, B:240:0x1652, B:242:0x1658, B:243:0x1684, B:221:0x1395, B:223:0x13b7, B:224:0x140c, B:68:0x0463, B:70:0x0469, B:71:0x0492, B:19:0x0091, B:21:0x0097, B:22:0x00c2, B:24:0x028f, B:26:0x02c0, B:27:0x031d, B:33:0x032f, B:35:0x0334, B:39:0x0340, B:54:0x040b, B:56:0x0411, B:57:0x0412, B:59:0x0414, B:61:0x041b, B:62:0x041c), top: B:268:0x0091, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0068  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r35) {
        /*
            Method dump skipped, instruction units count: 6113
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.ActivityTransitionResult.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = RatingCompat + 21;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 25 / 0;
        }
    }
}
