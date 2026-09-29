package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class setExpirationTime extends addObserverForBackInvoker implements SubjectStat {
    private static int $10 = 0;
    private static int $11 = 1;
    private getSubjectStat AudioAttributesCompatParcelizer;
    private volatile isHighlighted IconCompatParcelizer;
    private final Object RemoteActionCompatParcelizer = new Object();
    private boolean write = false;
    private static final byte[] $$g = {67, -110, -113, 74, 58, -38, -31, -6, -12, 1, 23, -51, 4, -8, -5, 6, -26, -2, -8, -17, 22, -26, -16, 3, -8, -20, 6, -20, 40, -51, 4, -8, -5, 15, -27, -30, 27, -18, -18, -16, 9, -21, 6, -3, -10, -26, -15, -9, -12, 8, 29, -41, -24, 4, -13, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20, 58, -64, -5, -22, 25, -27, -20, 1, 4, -19, 6, -15, -10, 16, -36, -1, 65, -53, -26, -15, -9, -12, 8, 29, -41, -24, 4, -13, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20};
    private static final int $$h = 84;
    private static final byte[] $$a = {16, -111, 25, -45, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 161;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int AudioAttributesImplApi21Parcelizer = 1;
    private static char[] read = {44989, 45027, 45025, 45050, 45030, 45036, 44995, 44996, 45051, 45018, 44981, 45035, 45050, 45027, 45038, 45030, 45049, 45024, 44986, 45037, 45027, 45025, 45050, 45030, 45036, 44995, 45005, 45026, 45050, 44997, 44989, 45016, 45025, 45028, 45029, 45029, 45028, 45052, 45036, 45012, 45031, 45025, 45033, 45032, 45025, 44893, 44895, 44893, 44889, 44865, 44869, 44889, 44893, 44883, 44875, 44873, 44880, 44888, 44894, 44881, 44886, 44895, 44944, 44998, 45039, 45039, 44997, 44988, 44990, 44991, 44993, 45035, 45032, 45033, 45038, 44993, 44984, 44998, 45038, 45039, 44997, 44978, 44988, 44989, 44988, 44993, 44999, 44998, 45032, 45032, 45033, 44999, 44990, 44993, 44992, 44987, 44987, 44984, 44992, 44992, 44999, 44997, 44978, 44997, 45039, 44998, 44987, 44995, 45038, 44992, 44945, 44991, 44998, 44999, 44998, 45038, 45039, 44997, 44988, 44990, 44988, 44991, 44986, 44984, 44989, 44990, 44992, 44992, 44993, 45039, 45038, 45033, 44998, 44989, 44990, 44987, 44984, 44998, 44998, 44992, 44993, 44984, 44986, 44987, 44990, 44978, 44990, 44986, 44987, 44995, 44999, 44988, 44988, 44989, 44989, 44999, 45033, 45033, 44993, 44999, 44992, 44986, 44995, 45033, 44999, 44988, 44991, 44988, 44998, 44998, 44985, 44995, 45033, 44995, 45046, 44917, 44687, 44681, 44680, 44909, 44879, 44874, 44880, 44921, 44924, 44913, 44681, 44684, 44683, 44681, 44680, 44912, 44918, 44907, 44904, 44917, 44916, 44918, 44926, 44913, 44918, 44921, 44913, 44686, 44904, 44881, 44917, 44918, 44912, 44918, 44918, 44681, 44686, 44918, 44912, 44918, 44880, 44883, 44912, 44917, 44885, 44883, 44915, 44919, 44887, 44887, 44918, 44913, 44925, 44919, 44686, 44904, 44905, 44911, 44875, 44881, 44916, 44916, 44912, 44680, 44686, 45017, 44832, 44838, 44837, 44859, 44845, 44846, 44822, 44822, 44847, 44839, 44856, 44835, 44845, 44835, 45010, 44856, 44857, 44863, 44861, 44861, 44862, 44857, 44860, 44862, 44857};
    private static int[] MediaBrowserCompatCustomActionResultReceiver = {-1466847486, -1414026290, 1670352352, 2030871652, -1566312257, 497199323, -1380482700, 1122287726, 1165335246, 1369171013, -217263095, 1348674570, 1198269539, 190716145, 435631642, -3361497, 1569896220, 906645389};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = 190 - r8
            int r9 = r9 + 65
            int r7 = r7 + 4
            byte[] r0 = kotlin.setExpirationTime.$$a
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setExpirationTime.c(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = 71 - r8
            int r7 = r7 + 82
            int r0 = r6 + 4
            byte[] r1 = kotlin.setExpirationTime.$$g
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2b
        L12:
            r3 = r2
        L13:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-7)
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setExpirationTime.d(byte, byte, byte, java.lang.Object[]):void");
    }

    setExpirationTime() {
        AudioAttributesImplApi26Parcelizer();
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.setExpirationTime.5
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                setExpirationTime.this.MediaBrowserCompatCustomActionResultReceiver();
            }
        });
        int i2 = AudioAttributesImplBaseParcelizer + 103;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        this.AudioAttributesCompatParcelizer = MediaBrowserCompatItemReceiver().write();
        if (!r1.RemoteActionCompatParcelizer()) {
            return;
        }
        int i2 = AudioAttributesImplBaseParcelizer + 87;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
        int i4 = AudioAttributesImplApi21Parcelizer + 29;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void b(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = MediaBrowserCompatCustomActionResultReceiver;
        int i4 = 43694;
        int i5 = -470782045;
        int i6 = 1;
        int i7 = 0;
        if (iArr2 != null) {
            int i8 = $10 + 119;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i10 = 0;
            while (i10 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i10])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(i5);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (i4 - TextUtils.lastIndexOf("", '0', 0, 0)), (ViewConfiguration.getTouchSlop() >> 8) + 23297, 15 - (ViewConfiguration.getEdgeSlop() >> 16), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr3[i10] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i10++;
                    int i11 = $11 + 93;
                    $10 = i11 % 128;
                    if (i11 % 2 != 0) {
                        int i12 = 5 / 5;
                    }
                    i4 = 43694;
                    i5 = -470782045;
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
        int[] iArr5 = MediaBrowserCompatCustomActionResultReceiver;
        int i13 = 43695;
        float f = BitmapDescriptorFactory.HUE_RED;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i14 = 0;
            while (i14 < length3) {
                try {
                    Object[] objArr3 = new Object[i6];
                    objArr3[i7] = Integer.valueOf(iArr5[i14]);
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.indexOf("", "") + i13), 23297 - KeyEvent.normalizeMetaState(i7), 15 - (TypedValue.complexToFraction(i7, f, f) > f ? 1 : (TypedValue.complexToFraction(i7, f, f) == f ? 0 : -1)), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr6[i14] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    i14++;
                    i13 = 43695;
                    f = BitmapDescriptorFactory.HUE_RED;
                    i6 = 1;
                    i7 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            i2 = i7;
            iArr5 = iArr6;
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
            int i15 = 0;
            for (int i16 = 16; i15 < i16; i16 = 16) {
                int i17 = $11 + 79;
                $10 = i17 % 128;
                if (i17 % 2 != 0) {
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i15];
                    Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (43695 - (ViewConfiguration.getScrollBarSize() >> 8)), 23298 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 15, -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                    buildremovealldownloadsintent.read = iIntValue;
                    i15 += 73;
                } else {
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i15];
                    Object[] objArr5 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 43694), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23297, 15 - View.resolveSizeAndState(0, 0, 0), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                    buildremovealldownloadsintent.read = iIntValue2;
                    i15++;
                }
            }
            int i18 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i18;
            buildremovealldownloadsintent.read ^= iArr4[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[17];
            int i19 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i20 = buildremovealldownloadsintent.read;
            cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
            cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
            cArr[3] = (char) buildremovealldownloadsintent.read;
            buildRemoveAllDownloadsIntent.read(iArr4);
            cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
            Object[] objArr6 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(516305436);
            if (objRemoteActionCompatParcelizer5 == null) {
                objRemoteActionCompatParcelizer5 = startForeground.read((char) (48194 - (ViewConfiguration.getLongPressTimeout() >> 16)), 20126 - View.getDefaultSize(0, 0), 20 - TextUtils.indexOf("", ""), 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void a(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = read;
        float f = BitmapDescriptorFactory.HUE_RED;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $11 + 119;
                $10 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), Gravity.getAbsoluteGravity(0, 0) + 11613, (ViewConfiguration.getScrollFriction() > f ? 1 : (ViewConfiguration.getScrollFriction() == f ? 0 : -1)) + 19, -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i6++;
                    f = BitmapDescriptorFactory.HUE_RED;
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
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                int i9 = $11 + 77;
                $10 = i9 % 128;
                if (i9 % 2 == 0 ? bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] != 1 : bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] != 0) {
                    int i10 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (31589 - TextUtils.getCapsMode("", 0, 0)), 9863 - View.MeasureSpec.makeMeasureSpec(0, 0), 65 - View.MeasureSpec.getMode(0), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), 22958 - Process.getGidForName(""), (ViewConfiguration.getPressedStateDuration() >> 16) + 43, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                    int i12 = $10 + 47;
                    $11 = i12 % 128;
                    int i13 = i12 % 2;
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (37822 - ExpandableListView.getPackedPositionGroup(0L)), Process.getGidForName("") + 9755, (ViewConfiguration.getEdgeSlop() >> 16) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i14 = $10 + 47;
            $11 = i14 % 128;
            int i15 = i14 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i16 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i16, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i16);
            int i17 = $11 + 5;
            $10 = i17 % 128;
            int i18 = i17 % 2;
        }
        if (z) {
            char[] cArr6 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            int i19 = $11 + 33;
            $10 = i19 % 128;
            int i20 = 2;
            int i21 = i19 % 2;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                int i22 = $10 + 91;
                $11 = i22 % 128;
                if (i22 % i20 == 0) {
                    cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i3 >>> buildsetstopreasonintent.RemoteActionCompatParcelizer) >> 1];
                } else {
                    cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i3 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                }
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                i20 = 2;
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
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00a6  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r30) {
        /*
            Method dump skipped, instruction units count: 2076
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setExpirationTime.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.AudioAttributesCompatParcelizer;
        if (getsubjectstat != null) {
            int i2 = AudioAttributesImplBaseParcelizer + 81;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
        }
        int i4 = AudioAttributesImplApi21Parcelizer + 97;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 13;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        if (i3 == 0) {
            return ishighlightedMediaBrowserCompatItemReceiver.af_();
        }
        ishighlightedMediaBrowserCompatItemReceiver.af_();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = AudioAttributesImplBaseParcelizer + 79;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return ishighlighted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        if (this.IconCompatParcelizer == null) {
            synchronized (this.RemoteActionCompatParcelizer) {
                if (this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = AudioAttributesImplApi21Parcelizer();
                }
            }
        }
        return this.IconCompatParcelizer;
    }

    protected final void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 17;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        if (this.write) {
            return;
        }
        this.write = true;
        int i4 = AudioAttributesImplApi21Parcelizer + 31;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 4 / 3;
        }
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 47;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = AudioAttributesImplApi21Parcelizer + 5;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return RemoteActionCompatParcelizer;
        }
        throw null;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, new int[]{18, 26, 0, 0}, false, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(new byte[]{1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, new int[]{44, 18, 105, 0}, true, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = AudioAttributesImplApi21Parcelizer + 85;
            AudioAttributesImplBaseParcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            if (!(!(baseContext instanceof ContextWrapper)) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i3 = AudioAttributesImplApi21Parcelizer + 77;
                AudioAttributesImplBaseParcelizer = i3 % 128;
                if (i3 % 2 != 0) {
                    int i4 = 3 / 3;
                }
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.getTrimmedLength("") + 4535), 6054 - View.resolveSize(0, 0), 42 - View.MeasureSpec.getSize(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.lastIndexOf("", '0') + 1), 6030 - (ViewConfiguration.getKeyRepeatDelay() >> 16), TextUtils.indexOf("", "") + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = AudioAttributesImplBaseParcelizer + 125;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, new int[]{18, 26, 0, 0}, false, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(new byte[]{1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, new int[]{44, 18, 105, 0}, true, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = AudioAttributesImplApi21Parcelizer + 103;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            if (i4 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i5 = AudioAttributesImplApi21Parcelizer + 73;
                AudioAttributesImplBaseParcelizer = i5 % 128;
                int i6 = i5 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i7 = AudioAttributesImplApi21Parcelizer + 9;
                AudioAttributesImplBaseParcelizer = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (Process.getGidForName("") + 4536), (ViewConfiguration.getTouchSlop() >> 8) + 6054, 43 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), 6030 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), Drawable.resolveOpacity(0, 0) + 24, -861814097, false, "read", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:75:0x0648  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0695 A[Catch: all -> 0x0758, TryCatch #12 {all -> 0x0758, blocks: (B:84:0x068f, B:86:0x0695, B:87:0x06bf), top: B:279:0x068f, outer: #13 }] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r32) {
        /*
            Method dump skipped, instruction units count: 5124
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setExpirationTime.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 81;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
