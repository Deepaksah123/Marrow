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
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getLessonIds extends addObserverForBackInvoker implements SubjectStat {
    private volatile isHighlighted AudioAttributesCompatParcelizer;
    private getSubjectStat RemoteActionCompatParcelizer;
    private static final byte[] $$c = {TarConstants.LF_SYMLINK, -51, -30, -2};
    private static final int $$f = 126;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {33, 74, 31, 28, 67, -21, 0, -3, -5, -32, 5, 14, 7, 0, 0, 19, -15, -17, 6, 1, 5, 15, 67, -81, 7, 11, -9, 17, -24, -10, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, -17, -6, 0, -3, 17, 38, -32, -15, 13, -4, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, 67, -55, 4, -13, TarConstants.LF_SYMLINK, -35, 7, 20, -17, 37, -49, 17, 2, 3, -11, 80, -81, 7, 11, -9, 17, -50, 19, -3, -4, TarConstants.LF_NORMAL, -49, 2, 4, 11, 9, -17, 3, 17, -12, TarConstants.LF_SYMLINK, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11};
    private static final int $$h = 137;
    private static final byte[] $$a = {TarConstants.LF_GNUTYPE_LONGLINK, 94, -43, -123, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 35;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int MediaMetadataCompat = 1;
    private static char IconCompatParcelizer = 62345;
    private static char MediaBrowserCompatCustomActionResultReceiver = 42976;
    private static char AudioAttributesImplApi26Parcelizer = 33255;
    private static char AudioAttributesImplBaseParcelizer = 19634;
    private static char[] MediaBrowserCompatItemReceiver = {45047, 44919, 44924, 44916, 44672, 45024, 44890, 44875, 44867, 44883, 44891, 44888, 44888, 44891, 44868, 44863, 44816, 44856, 44889, 44865, 44832, 44838, 44867, 44869, 44889, 44868, 44870, 44864, 44879, 44879, 44876, 45040, 44919, 44686, 44681, 44918, 44912, 44680, 44897, 44899, 44683, 44917, 44913, 44925, 44921, 44913, 44917, 44919, 44917, 44978, 45008, 45002, 45011, 45048, 45051, 45050, 45029, 45011, 45001, 45000, 45006, 45015, 45049, 45049, 45008, 45002, 45010, 45048, 45021, 44981, 45008, 45049, 45015, 45004, 45015, 45009, 45010, 45010, 45002, 44981, 44981, 45010, 45011, 45000, 45009, 45051, 45050, 45050, 45008, 45009, 45011, 45006, 45007, 45006, 45004, 45015, 45049, 44990, 45044, 45041, 45032, 45041, 44825, 45040, 45040, 45044, 45026, 45037, 45037, 45047, 45046, 45046, 45040, 45041, 45046, 45039, 45038, 45040, 44830, 44828, 45047, 45046, 45043, 45032, 45041, 45040, 45041, 45046, 45032, 45046, 45047, 45047, 44830, 44830, 45045, 45047, 45041, 45037, 45039, 45038, 45039, 45037, 45045, 44831, 44810, 45036, 45033, 45033, 45032, 45032, 45040, 44824, 45047, 45045, 44831, 44825, 45047, 45039, 45038, 45047, 44831, 45043, 44915, 44917, 44919, 44918, 44907, 44853, 44848, 44894, 44903, 44922, 44927, 44919, 44682, 44913, 44919, 44918, 44926, 44924, 44881, 44886, 44915, 44914, 44924, 44900, 44927, 44924, 44903, 44927, 44916, 44886, 44895, 44915, 44924, 44926, 44924, 44924, 44919, 44916, 44924, 44926, 44924, 44894, 44889, 44926, 44915, 44883, 44889, 44921, 44925, 44893, 44893, 44924, 44927, 44923, 44925, 44916, 44886, 44887, 44885, 44849, 44895, 44914, 44914, 44926, 44918, 44916, 44998, 44829, 44818, 44819, 44828, 44816, 45007, 44812, 44806, 44806, 45026, 45028, 44813, 44802, 44801, 45025, 45035, 44813, 44829, 44830, 44807, 44800, 44989, 45037, 45036, 45037, 45027, 45031, 45021, 45010, 45027, 45030, 45049, 45052, 45036, 45002, 45018, 45051, 44996, 44995, 45036, 45030, 45050, 45025, 44984, 45033, 45036, 45050, 45028, 45025, 45027, 45039, 45026, 45036, 45026, 45051, 45030, 45038, 45009, 44946, 44985, 44989, 44991, 44990, 44988, 44989, 44988, 44988, 44991, 44985};
    private final Object write = new Object();
    private boolean read = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(byte r6, byte r7, short r8) {
        /*
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r0 = r6 + 1
            int r8 = r8 * 3
            int r8 = r8 + 122
            byte[] r1 = kotlin.getLessonIds.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getLessonIds.$$i(byte, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 114 - r8
            int r0 = r7 + 4
            byte[] r1 = kotlin.getLessonIds.$$a
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = -1
            if (r1 != 0) goto L13
            r4 = r8
            r3 = r2
            r8 = r6
            goto L2b
        L13:
            r3 = r2
        L14:
            int r3 = r3 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r0, r7)
            r9[r7] = r6
            return
        L26:
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r5
        L2b:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + r2
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getLessonIds.c(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = 31 - r7
            byte[] r0 = kotlin.getLessonIds.$$g
            int r8 = 94 - r8
            int r9 = r9 + 65
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
            int r9 = r3 + 2
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getLessonIds.d(int, short, int, java.lang.Object[]):void");
    }

    getLessonIds() {
        AudioAttributesImplApi26Parcelizer();
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.getLessonIds.5
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                getLessonIds.this.AudioAttributesImplApi21Parcelizer();
            }
        });
        int i2 = MediaMetadataCompat + 45;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        getSubjectStat getsubjectstatWrite = MediaBrowserCompatItemReceiver().write();
        this.RemoteActionCompatParcelizer = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            int i2 = AudioAttributesImplApi21Parcelizer + 59;
            MediaMetadataCompat = i2 % 128;
            int i3 = i2 % 2;
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
        }
        int i4 = AudioAttributesImplApi21Parcelizer + 45;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        while (isstopped.read < cArr.length) {
            int i5 = $10 + 35;
            $11 = i5 % 128;
            int i6 = 58224;
            if (i5 % i3 == 0) {
                cArr3[1] = cArr[isstopped.read];
                cArr3[1] = cArr[isstopped.read + 1];
            } else {
                cArr3[0] = cArr[isstopped.read];
                cArr3[1] = cArr[isstopped.read + 1];
            }
            int i7 = 0;
            while (i7 < 16) {
                int i8 = $10 + 7;
                $11 = i8 % 128;
                int i9 = i8 % i3;
                char c = cArr3[1];
                char c2 = cArr3[0];
                int i10 = (c2 + i6) ^ ((c2 << 4) + ((char) (((long) AudioAttributesImplApi26Parcelizer) ^ 1193402106669854891L)));
                int i11 = c2 >>> 5;
                try {
                    Object[] objArr2 = new Object[4];
                    objArr2[3] = Integer.valueOf(AudioAttributesImplBaseParcelizer);
                    objArr2[i3] = Integer.valueOf(i11);
                    objArr2[1] = Integer.valueOf(i10);
                    objArr2[0] = Integer.valueOf(c);
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = (byte) (b - 1);
                        objRemoteActionCompatParcelizer = startForeground.read((char) View.resolveSizeAndState(0, 0, 0), 1504 - (ViewConfiguration.getEdgeSlop() >> 16), (-16777195) - Color.rgb(0, 0, 0), 1322448859, false, $$i(b, b2, (byte) (b2 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i6) ^ ((cCharValue << 4) + ((char) (((long) IconCompatParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = (byte) (b3 - 1);
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ('0' - AndroidCharacter.getMirror('0')), ExpandableListView.getPackedPositionChild(0L) + 1505, 21 - (Process.myTid() >> 22), 1322448859, false, $$i(b3, b4, (byte) (b4 + 1)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i6 -= 40503;
                    i7++;
                    int i12 = $11 + 123;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    i3 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[isstopped.read] = cArr3[0];
            cArr2[isstopped.read + 1] = cArr3[1];
            Object[] objArr4 = {isstopped, isstopped};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
            if (objRemoteActionCompatParcelizer3 == null) {
                i2 = 2;
                objRemoteActionCompatParcelizer3 = startForeground.read((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), TextUtils.getTrimmedLength("") + 9016, MotionEvent.axisFromString("") + 59, -1950993821, false, "D", new Class[]{Object.class, Object.class});
            } else {
                i2 = 2;
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            i3 = i2;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = MediaBrowserCompatItemReceiver;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.getOffsetAfter("", 0), 11613 - (ViewConfiguration.getScrollBarSize() >> 8), 20 - KeyEvent.keyCodeFromString(""), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i7++;
                    int i8 = $11 + 11;
                    $10 = i8 % 128;
                    int i9 = i8 % 2;
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
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            int i10 = $10 + 57;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i12 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), ImageFormat.getBitsPerPixel(0) + 22960, 43 - (ViewConfiguration.getFadingEdgeLength() >> 16), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (31589 - KeyEvent.keyCodeFromString("")), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 9863, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 64, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (37822 - KeyEvent.getDeadChar(0, 0)), 9755 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 26, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i14, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i14);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i4 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i15 = $10 + 99;
            $11 = i15 % 128;
            if (i15 % 2 == 0) {
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 1;
            } else {
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            }
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                int i16 = $11 + 99;
                $10 = i16 % 128;
                if (i16 % 2 != 0) {
                    cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                    i = buildsetstopreasonintent.RemoteActionCompatParcelizer % 1;
                } else {
                    cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                    i = buildsetstopreasonintent.RemoteActionCompatParcelizer + 1;
                }
                buildsetstopreasonintent.RemoteActionCompatParcelizer = i;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 39;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 17, new char[]{15426, 48262, 25201, 5565, 15737, 58276, 42973, 8223, 38135, 23540, 1567, 25931, 13176, 39733, 5364, 53301, 8339, 65058}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        b(true, new byte[]{1, 1, 0, 0, 0}, new int[]{0, 5, 151, 0}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                b(true, new byte[]{1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0}, new int[]{5, 26, 99, 23}, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                b(false, new byte[]{0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, new int[]{31, 18, 145, 0}, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 4535), TextUtils.lastIndexOf("", '0', 0, 0) + 6055, 42 - (ViewConfiguration.getTapTimeout() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b(false, new byte[]{1, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1}, new int[]{49, 48, 14, 0}, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 54, new char[]{29087, 16356, 37909, 23615, 44930, 8467, 29706, 39407, 28010, 56007, 61826, 4840, 19378, 38069, 40856, 48431, 49915, 43525, 21659, 9866, 24386, 46440, 14385, 19571, 49369, 35059, 22001, 1718, 40901, 14212, 54818, 3031, 13029, 59944, 47544, 20395, 34168, 2381, 63315, 19037, 9250, 49139, 35083, 1706, 39686, 32286, 34404, 42129, 16604, 50114, 56255, 27479, 63422, 59062, 57419, 44622, 62569, 20762, 60008, 10385, 4855, 3657, 58916, 11654}, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    b(true, new byte[]{1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0}, new int[]{97, 64, 49, 8}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b(false, new byte[]{1, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1}, new int[]{161, 67, 139, 0}, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b(true, new byte[]{1, 0, 0, 1, 1, 1}, new int[]{228, 6, 103, 0}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1, new char[]{748, 5666, 61465, 47397, 35251, 13801, 20924, 25228, 42723, 4970, 13061, 42479, 19357, 40213, 24720, 14748, 15171, 62744, 17058, 39260, 15888, 37591, 6438, 42251, 13670, 56816, 55589, 11824, 26757, 59307, 52257, 35722, 60412, 55453, 60447, 11044}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), 6030 - (Process.myPid() >> 22), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char mode = (char) (13183 - View.MeasureSpec.getMode(0));
            int i4 = 1650 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 26;
            byte[] bArr = $$a;
            short s = bArr[53];
            Object[] objArr13 = new Object[1];
            c(s, (byte) (s & 40), (byte) (-bArr[62]), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(mode, i4, fadingEdgeLength, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char c = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13182);
                int mode2 = 1649 - View.MeasureSpec.getMode(0);
                int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 26;
                Object[] objArr14 = new Object[1];
                c(r2[65], r2[8], (byte) (-$$a[9]), objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(c, mode2, iNormalizeMetaState, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            b(false, new byte[]{1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, new int[]{234, 16, 33, 0}, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 16, new char[]{37849, 27479, 2825, 22648, 31407, 8424, 26366, 50858, 23891, 58277, 25885, 3508, 51878, 25126, 60790, 23331}, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i5 = MediaMetadataCompat + 67;
            AudioAttributesImplApi21Parcelizer = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, 208161123};
                Object[] objArr18 = new Object[1];
                d(r0[18], (byte) 91, (byte) ($$g[31] + 1), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                d(r0[25], r0[4], (byte) ($$h & 62), objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char offsetAfter = (char) (13183 - TextUtils.getOffsetAfter("", 0));
                    int i7 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1649;
                    int iRgb = (-16777190) - Color.rgb(0, 0, 0);
                    Object[] objArr20 = new Object[1];
                    c(r6[65], r6[8], (byte) (-$$a[9]), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(offsetAfter, i7, iRgb, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    b(true, new byte[]{0, 1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0}, new int[]{250, 22, 0, 2}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    b(false, new byte[]{1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 1, 0}, new int[]{272, 15, 0, 7}, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char windowTouchSlop = (char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 13183);
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1649;
                        int iRgb2 = (-16777190) - Color.rgb(0, 0, 0);
                        Object[] objArr23 = new Object[1];
                        c(r10[0], r10[8], (byte) (-$$a[9]), objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(windowTouchSlop, scrollBarFadeDuration, iRgb2, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char c2 = (char) (13183 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1649;
                        int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26;
                        byte[] bArr2 = $$a;
                        short s2 = bArr2[53];
                        byte b = (byte) (-bArr2[62]);
                        Object[] objArr24 = new Object[1];
                        c(s2, (byte) (s2 & 40), b, objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(c2, keyRepeatTimeout, maximumDrawingCacheSize, -133433128, false, (String) objArr24[0], null);
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
        int i8 = ((int[]) objArr[3])[0];
        int i9 = ((int[]) objArr[2])[0];
        if (i9 != i8) {
            long j = -1;
            long j2 = ((long) (i9 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4535 - (ViewConfiguration.getScrollBarSize() >> 8)), 6054 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getTapTimeout() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i10 = MediaMetadataCompat + 57;
            AudioAttributesImplApi21Parcelizer = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr25 = {1194322291, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getScrollBarSize() >> 8), View.MeasureSpec.makeMeasureSpec(0, 0) + 6030, 24 - View.resolveSize(0, 0));
                byte[] bArr3 = $$g;
                Object[] objArr26 = new Object[1];
                d(bArr3[30], bArr3[99], bArr3[27], objArr26);
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
        MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.RemoteActionCompatParcelizer;
        if (getsubjectstat != null) {
            int i2 = MediaMetadataCompat + 89;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
            int i4 = MediaMetadataCompat + 21;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 29;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = MediaBrowserCompatItemReceiver().af_();
        int i4 = MediaMetadataCompat + 7;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaMetadataCompat + 93;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            return ishighlighted;
        }
        throw null;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        if (this.AudioAttributesCompatParcelizer == null) {
            synchronized (this.write) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    this.AudioAttributesCompatParcelizer = AudioAttributesImplBaseParcelizer();
                }
            }
        }
        return this.AudioAttributesCompatParcelizer;
    }

    protected final void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 3;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        if (this.read) {
            return;
        }
        int i5 = i2 + 53;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        this.read = i5 % 2 == 0;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 65;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        if (i3 != 0) {
            return getNextPercentile.RemoteActionCompatParcelizer(this, defaultViewModelProviderFactory);
        }
        getNextPercentile.RemoteActionCompatParcelizer(this, defaultViewModelProviderFactory);
        throw null;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(true, new byte[]{1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0}, new int[]{5, 26, 99, 23}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(false, new byte[]{0, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, new int[]{31, 18, 145, 0}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i2 = MediaMetadataCompat + 47;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            int i3 = i2 % 2;
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i4 = MediaMetadataCompat + 27;
                AudioAttributesImplApi21Parcelizer = i4 % 128;
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
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ExpandableListView.getPackedPositionChild(0L) + 4536), (ViewConfiguration.getJumpTapTimeout() >> 16) + 6054, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getFadingEdgeLength() >> 16), Gravity.getAbsoluteGravity(0, 0) + 6030, 24 - View.getDefaultSize(0, 0), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x007a  */
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getLessonIds.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x098c  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0a2d  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0c29  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0d08  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0d50  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0da5  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0fd3  */
    /* JADX WARN: Removed duplicated region for block: B:285:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r34) {
        /*
            Method dump skipped, instruction units count: 4752
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getLessonIds.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 77;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
