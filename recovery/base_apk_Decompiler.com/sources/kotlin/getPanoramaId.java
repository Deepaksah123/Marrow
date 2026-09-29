package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
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
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getPanoramaId extends addObserverForBackInvoker implements SubjectStat {
    private volatile isHighlighted IconCompatParcelizer;
    private getSubjectStat read;
    private static final byte[] $$c = {73, 111, 30, 98};
    private static final int $$f = 29;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {115, -66, -117, -68, -54, 68, 9, 26, -21, 38, 16, -8, 22, -31, 62, -4, 11, 10, 24, -2, 10, -21, 60, 8, -6, 30, 0, 17, 10, -14, 41, -68, 40, 63, -6, 16, 17, -35, 62, 11, 9, 2, 4, 30, 10, -4, 25, -37, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -2, 7, 14, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -54, 68, 9, 26, -21, 31, 24, 3, 0, 23, -2, 19, 14, -12, 40, 5, -61, 57, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24};
    private static final int $$h = TarConstants.CHKSUM_OFFSET;
    private static final byte[] $$a = {10, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 13, 109, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 23;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int RatingCompat = 1;
    private static char[] write = {44962, 45035, 45050, 45027, 45038, 45030, 45049, 45024, 45037, 45027, 45025, 45050, 45030, 45036, 44995, 44996, 45051, 45018, 44984, 45032, 45033, 45025, 45031, 45012, 45036, 45052, 45028, 45029, 45029, 45028, 45025, 45016, 44989, 44997, 45050, 45026, 45005, 44995, 45036, 45030, 45050, 45025, 45027, 45037, 44990, 45028, 45024, 45032, 45036, 45024, 45028, 45050, 45010, 45008, 45051, 45027, 45025, 45048, 45049, 45030, 45026, 45028, 44986, 45033, 45039, 44998, 44993, 44994, 44987, 44992, 44995, 44992, 44993, 44987, 44993, 44998, 44998, 45033, 45033, 44996, 44998, 44992, 44988, 44990, 44985, 44990, 44988, 44996, 45038, 44997, 44991, 44984, 44984, 44987, 44987, 44995, 45035, 44998, 44996, 45038, 45032, 44998, 44990, 44985, 44998, 45038, 44996, 44999, 44992, 44987, 44992, 45032, 44995, 44995, 44999, 44989, 44988, 44988, 44998, 44993, 44993, 44995, 44992, 44993, 44990, 44985, 45052, 44902, 44864, 44865, 44871, 44835, 44873, 44908, 44908, 44904, 44896, 44902, 44908, 44909, 44903, 44897, 44896, 44869, 44839, 44834, 44872, 44881, 44884, 44905, 44897, 44900, 44899, 44897, 44896, 44904, 44910, 44867, 44864, 44909, 44908, 44910, 44886, 44905, 44910, 44881, 44905, 44902, 44864, 44873, 44909, 44910, 44904, 44910, 44910, 44897, 44902, 44910, 44904, 44910, 44872, 44875, 44904, 44909, 44877, 44875, 44907, 44911, 44879, 44879, 44910, 44905, 44885, 44950, 44985, 44965, 44984, 44987, 44986, 44990, 45031, 45024, 45022, 45034, 45052, 45028, 45028, 45051, 45027, 45038, 45036, 45037, 45038, 45027, 45011, 45052, 44922, 44900, 44922, 44915, 44926, 44902, 44905, 44905, 44897, 44900, 44914, 44924, 44921, 44923};
    private static char AudioAttributesImplBaseParcelizer = 33377;
    private static char MediaBrowserCompatCustomActionResultReceiver = 35091;
    private static char AudioAttributesImplApi26Parcelizer = 36395;
    private static char AudioAttributesImplApi21Parcelizer = 61962;
    private final Object RemoteActionCompatParcelizer = new Object();
    private boolean AudioAttributesCompatParcelizer = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(byte r6, byte r7, int r8) {
        /*
            byte[] r0 = kotlin.getPanoramaId.$$c
            int r6 = r6 * 3
            int r6 = 122 - r6
            int r8 = r8 * 2
            int r1 = r8 + 1
            int r7 = r7 * 3
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r7
            r4 = r2
            goto L29
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L24:
            r3 = r0[r7]
            r5 = r3
            r3 = r6
            r6 = r5
        L29:
            int r7 = r7 + 1
            int r6 = -r6
            int r6 = r6 + r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getPanoramaId.$$i(byte, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r0 = r7 + 4
            byte[] r1 = kotlin.getPanoramaId.$$a
            int r5 = 114 - r5
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r6 = r6 + 1
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            r3 = r1[r6]
        L26:
            int r3 = -r3
            int r5 = r5 + r3
            int r5 = r5 + (-1)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getPanoramaId.c(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            byte[] r0 = kotlin.getPanoramaId.$$g
            int r7 = 114 - r7
            int r8 = r8 * 2
            int r1 = r8 + 4
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2c
        L15:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L19:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            int r3 = r3 + 1
            r4 = r0[r7]
        L2c:
            int r6 = r6 + r4
            int r6 = r6 + (-11)
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getPanoramaId.d(short, int, short, java.lang.Object[]):void");
    }

    getPanoramaId() {
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.getPanoramaId.2
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                getPanoramaId.this.AudioAttributesImplApi21Parcelizer();
            }
        });
        int i2 = MediaBrowserCompatItemReceiver + 71;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void AudioAttributesImplBaseParcelizer() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.getPanoramaId.MediaBrowserCompatItemReceiver
            int r1 = r1 + 47
            int r2 = r1 % 128
            kotlin.getPanoramaId.RatingCompat = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L23
            o.isHighlighted r1 = r3.MediaBrowserCompatItemReceiver()
            o.getSubjectStat r1 = r1.write()
            r3.read = r1
            boolean r1 = r1.RemoteActionCompatParcelizer()
            r2 = 76
            int r2 = r2 / 0
            if (r1 == 0) goto L3c
            goto L33
        L23:
            o.isHighlighted r1 = r3.MediaBrowserCompatItemReceiver()
            o.getSubjectStat r1 = r1.write()
            r3.read = r1
            boolean r1 = r1.RemoteActionCompatParcelizer()
            if (r1 == 0) goto L3c
        L33:
            o.getSubjectStat r1 = r3.read
            o.withFieldVisibility r3 = r3.getDefaultViewModelCreationExtras()
            r1.IconCompatParcelizer(r3)
        L3c:
            int r3 = kotlin.getPanoramaId.RatingCompat
            int r3 = r3 + 71
            int r1 = r3 % 128
            kotlin.getPanoramaId.MediaBrowserCompatItemReceiver = r1
            int r3 = r3 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getPanoramaId.AudioAttributesImplBaseParcelizer():void");
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        while (isstopped.read < cArr.length) {
            cArr3[i3] = cArr[isstopped.read];
            cArr3[1] = cArr[isstopped.read + 1];
            int i4 = $10 + 37;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = 58224;
            int i7 = i3;
            while (i7 < 16) {
                char c = cArr3[1];
                char c2 = cArr3[i3];
                int i8 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) AudioAttributesImplApi26Parcelizer) ^ 1193402106669854891L)));
                int i9 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(AudioAttributesImplApi21Parcelizer);
                    objArr2[2] = Integer.valueOf(i9);
                    objArr2[1] = Integer.valueOf(i8);
                    objArr2[i3] = Integer.valueOf(c);
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', i3, i3) + 1);
                        int deadChar = 1504 - KeyEvent.getDeadChar(i3, i3);
                        int i10 = 21 - (CdmaCellLocation.convertQuartSecToDecDegrees(i3) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(i3) == 0.0d ? 0 : -1));
                        byte b = (byte) i3;
                        byte b2 = b;
                        String str$$i = $$i(b, b2, b2);
                        Class[] clsArr = new Class[4];
                        clsArr[i3] = Integer.TYPE;
                        clsArr[1] = Integer.TYPE;
                        clsArr[2] = Integer.TYPE;
                        clsArr[3] = Integer.TYPE;
                        objRemoteActionCompatParcelizer = startForeground.read(cLastIndexOf, deadChar, i10, 1322448859, false, str$$i, clsArr);
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    char[] cArr4 = cArr3;
                    Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) AudioAttributesImplBaseParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ExpandableListView.getPackedPositionType(0L), 1504 - (KeyEvent.getMaxKeyCode() >> 16), Gravity.getAbsoluteGravity(0, 0) + 21, 1322448859, false, $$i(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i11 = $11 + 33;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[isstopped.read] = cArr5[0];
            cArr2[isstopped.read + 1] = cArr5[1];
            Object[] objArr4 = {isstopped, isstopped};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) Color.argb(0, 0, 0, 0), 9016 - View.combineMeasuredStates(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 59, -1950993821, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            int i13 = $11 + 121;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void a(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        int i2 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        char c = 0;
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = write;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = new Object[1];
                    objArr2[c] = Integer.valueOf(cArr2[i7]);
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.indexOf("", ""), 11614 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), 20 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i7++;
                    c = 0;
                    j = 0;
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
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            char[] cArr5 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c2 = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i8 = $10 + 83;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    int i10 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 22959, (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 43, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i10] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (31589 - (ViewConfiguration.getDoubleTapTimeout() >> 16)), (ViewConfiguration.getTapTimeout() >> 16) + 9863, 65 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i11] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                c2 = cArr5[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 37821), (Process.myTid() >> 22) + 9754, (ViewConfiguration.getLongPressTimeout() >> 16) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            int i12 = $10 + 67;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr4, i14, i6);
            System.arraycopy(cArr6, i6, cArr4, 0, i14);
        }
        if (z) {
            int i15 = $10 + 5;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                cArr = new char[i4];
                i = 0;
            } else {
                i = 0;
                cArr = new char[i4];
            }
            while (true) {
                buildsetstopreasonintent.RemoteActionCompatParcelizer = i;
                if (buildsetstopreasonintent.RemoteActionCompatParcelizer >= i4) {
                    break;
                }
                cArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr4[(i4 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                i = buildsetstopreasonintent.RemoteActionCompatParcelizer + 1;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            int i16 = $11 + 31;
            $10 = i16 % 128;
            if (i16 % 2 != 0) {
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 1;
            } else {
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            }
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = RatingCompat + 115;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        a(new byte[]{0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1}, new int[]{0, 18, 0, 7}, false, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 5, new char[]{43459, 33516, 17674, 56733, 18363, 58763}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                a(new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, new int[]{18, 26, 0, 0}, true, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                a(new byte[]{1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1}, new int[]{44, 18, 0, 16}, true, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    int i4 = RatingCompat + 99;
                    MediaBrowserCompatItemReceiver = i4 % 128;
                    int i5 = i4 % 2;
                    baseContext = null;
                } else {
                    baseContext = baseContext.getApplicationContext();
                }
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - View.MeasureSpec.getSize(0)), 6054 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 42 - Gravity.getAbsoluteGravity(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 44, new char[]{42987, 38150, 3197, 34271, 32743, 19708, 49530, 16954, 28931, 7641, 27033, 41195, 8404, 41748, 17946, 16428, 48428, 58532, 36603, 11759, 58878, 23575, 485, 15222, 16826, 20864, 39175, 52287, 44723, 50420, 26337, 3124, 44603, 39754, 16988, 53864, 29446, 3169, 29169, 26043, 14713, 13323, 30126, 32621, 49117, 30733, 15460, 8918}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b(64 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), new char[]{60827, 47837, 36603, 11759, 30081, 53769, 33265, 33469, 49724, 45831, 9955, 55961, 45264, 60102, 56918, 8187, 11095, 33206, 31484, 60813, 28694, 5843, 49181, 25020, 57059, 4362, 13120, 36845, 11297, 56203, 26337, 3124, 54599, 40892, 3344, 47785, 1188, 24167, 56272, 31282, 48690, 61798, 26000, 64517, 31453, 16913, 60946, 50631, 55355, 15725, 58338, 52109, 'b', 59900, 51225, 28102, 16826, 20864, 43142, 18474, 44608, 64745, 22130, 30437}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    a(new byte[]{1, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, new int[]{62, 64, 0, 52}, true, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    a(new byte[]{0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0}, new int[]{126, 67, 121, 12}, false, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a(new byte[]{1, 1, 1, 1, 0, 0}, new int[]{193, 6, 0, 0}, false, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    b((ViewConfiguration.getDoubleTapTimeout() >> 16) + 36, new char[]{18324, 19322, 29169, 26043, 65002, 3390, 23429, 59371, 2429, 60827, 55528, 31761, 40882, 43952, 28931, 7641, 10015, 61713, 32663, 2153, 41719, 41751, 52270, 59077, 51936, 57470, 30132, 53705, 17596, 41263, 11026, 42543, 44868, 33801, 5440, 30377}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), 6030 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 23 - TextUtils.lastIndexOf("", '0', 0), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char offsetBefore = (char) (TextUtils.getOffsetBefore("", 0) + 13183);
            int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1649;
            int scrollDefaultDelay = 26 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[62]);
            short s = bArr[53];
            Object[] objArr13 = new Object[1];
            c(b, s, (byte) (s & 40), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(offsetBefore, iCombineMeasuredStates, scrollDefaultDelay, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char jumpTapTimeout = (char) ((ViewConfiguration.getJumpTapTimeout() >> 16) + 13183);
                int modifierMetaStateMask = 1648 - ((byte) KeyEvent.getModifierMetaStateMask());
                int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 26;
                Object[] objArr14 = new Object[1];
                c((byte) (-$$a[9]), r0[65], r0[8], objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(jumpTapTimeout, modifierMetaStateMask, longPressTimeout, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 19, new char[]{20698, 52881, 2885, 27017, 20488, 45901, 44267, 37793, 60499, 36874, 8634, 8893, 4378, 53392, 15344, 62627}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a(new byte[]{0, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0}, new int[]{199, 16, 0, 12}, true, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, 842420798};
                byte[] bArr2 = $$g;
                Object[] objArr18 = new Object[1];
                d((byte) (bArr2[26] - 1), bArr2[100], bArr2[54], objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b2 = (byte) (bArr2[110] + 1);
                byte b3 = bArr2[26];
                Object[] objArr19 = new Object[1];
                d(b2, b3, b3, objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char fadingEdgeLength = (char) (13183 - (ViewConfiguration.getFadingEdgeLength() >> 16));
                    int packedPositionChild = 1648 - ExpandableListView.getPackedPositionChild(0L);
                    int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 26;
                    Object[] objArr20 = new Object[1];
                    c((byte) (-$$a[9]), r2[65], r2[8], objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(fadingEdgeLength, packedPositionChild, fadingEdgeLength2, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    b((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 21, new char[]{44267, 37793, 19984, 7991, 52100, 21553, 12443, 56391, 65196, 10626, 24194, 3370, 27917, 23557, 49196, 65214, 53232, 47772, 24437, 17218, 61840, 36356}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    a(new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, new int[]{215, 15, 136, 0}, false, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char defaultSize = (char) (View.getDefaultSize(0, 0) + 13183);
                        int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 1649;
                        int iNormalizeMetaState = 26 - KeyEvent.normalizeMetaState(0);
                        Object[] objArr23 = new Object[1];
                        c((byte) (-$$a[9]), (short) 75, r9[8], objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(defaultSize, iIndexOf, iNormalizeMetaState, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char c = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13182);
                        int iMyPid = (Process.myPid() >> 22) + 1649;
                        int longPressTimeout2 = (ViewConfiguration.getLongPressTimeout() >> 16) + 26;
                        byte[] bArr3 = $$a;
                        byte b4 = (byte) (-bArr3[62]);
                        short s2 = bArr3[53];
                        Object[] objArr24 = new Object[1];
                        c(b4, s2, (byte) (s2 & 40), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(c, iMyPid, longPressTimeout2, -133433128, false, (String) objArr24[0], null);
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
        int i6 = ((int[]) objArr[3])[0];
        int i7 = ((int[]) objArr[2])[0];
        if (i7 != i6) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i7 ^ i6)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4535 - Color.green(0)), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6054, 'Z' - AndroidCharacter.getMirror('0'), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {839218432, Long.valueOf(j3), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) TextUtils.getOffsetAfter("", 0), 6030 - KeyEvent.getDeadChar(0, 0), 24 - (ViewConfiguration.getLongPressTimeout() >> 16));
                byte[] bArr4 = $$g;
                Object[] objArr26 = new Object[1];
                d((byte) (-bArr4[109]), (byte) (-bArr4[77]), (byte) (-bArr4[106]), objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
                int i8 = MediaBrowserCompatItemReceiver + 117;
                RatingCompat = i8 % 128;
                int i9 = i8 % 2;
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        AudioAttributesImplBaseParcelizer();
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.read;
        if (getsubjectstat != null) {
            int i2 = MediaBrowserCompatItemReceiver + 29;
            RatingCompat = i2 % 128;
            int i3 = i2 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
            if (i3 == 0) {
                throw null;
            }
        }
        int i4 = MediaBrowserCompatItemReceiver + 23;
        RatingCompat = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 61;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = MediaBrowserCompatItemReceiver().af_();
        int i4 = MediaBrowserCompatItemReceiver + 83;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = RatingCompat + 31;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        if (this.IconCompatParcelizer == null) {
            synchronized (this.RemoteActionCompatParcelizer) {
                if (this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = AudioAttributesImplApi26Parcelizer();
                }
            }
        }
        return this.IconCompatParcelizer;
    }

    protected final void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        if (!this.AudioAttributesCompatParcelizer) {
            this.AudioAttributesCompatParcelizer = true;
            int i2 = MediaBrowserCompatItemReceiver + 101;
            RatingCompat = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = MediaBrowserCompatItemReceiver + 15;
        RatingCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 39;
        RatingCompat = i2 % 128;
        if (i2 % 2 == 0) {
            RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
            int i3 = 39 / 0;
        } else {
            RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        }
        int i4 = RatingCompat + 67;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        return RemoteActionCompatParcelizer;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        Method method;
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = RatingCompat + 39;
            MediaBrowserCompatItemReceiver = i2 % 128;
            if (i2 % 2 != 0) {
                Object[] objArr = new Object[1];
                a(new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, new int[]{18, 26, 0, 0}, false, objArr);
                Class<?> cls = Class.forName((String) objArr[0]);
                Object[] objArr2 = new Object[1];
                a(new byte[]{1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1}, new int[]{44, 18, 0, 16}, false, objArr2);
                method = cls.getMethod((String) objArr2[0], new Class[0]);
            } else {
                Object[] objArr3 = new Object[1];
                a(new byte[]{0, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1}, new int[]{18, 26, 0, 0}, true, objArr3);
                Class<?> cls2 = Class.forName((String) objArr3[0]);
                Object[] objArr4 = new Object[1];
                a(new byte[]{1, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1}, new int[]{44, 18, 0, 16}, true, objArr4);
                method = cls2.getMethod((String) objArr4[0], new Class[0]);
            }
            baseContext = (Context) method.invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i3 = MediaBrowserCompatItemReceiver + 41;
            RatingCompat = i3 % 128;
            int i4 = i3 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (Color.blue(0) + 4535), MotionEvent.axisFromString("") + 6055, Color.blue(0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr5 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Drawable.resolveOpacity(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 6030, 24 - View.resolveSizeAndState(0, 0, 0), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr5);
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0080  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 289
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getPanoramaId.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:138:0x088e A[Catch: all -> 0x0951, TryCatch #8 {all -> 0x0951, blocks: (B:136:0x0879, B:138:0x088e, B:139:0x08bd), top: B:273:0x0879, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:142:0x08d0 A[Catch: all -> 0x0947, TryCatch #4 {all -> 0x0947, blocks: (B:140:0x08c3, B:142:0x08d0, B:143:0x093f), top: B:266:0x08c3, outer: #10 }] */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0a86  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0ad6  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0b33  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0d55  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0e41  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0e8d  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0ee0  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x112e  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x085f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r33) {
        /*
            Method dump skipped, instruction units count: 5164
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getPanoramaId.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = RatingCompat + 3;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onStart();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = MediaBrowserCompatItemReceiver + 39;
        RatingCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }
}
