package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
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

/* JADX INFO: loaded from: classes3.dex */
public abstract class validateObjectHeader extends addObserverForBackInvoker implements SubjectStat {
    private volatile isHighlighted AudioAttributesCompatParcelizer;
    private getSubjectStat IconCompatParcelizer;
    private static final byte[] $$c = {42, 85, 82, -118};
    private static final int $$f = 94;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {24, -109, -85, -94, -58, 38, 31, 6, 12, -1, -23, TarConstants.LF_CHR, -4, 8, 5, -6, 26, 2, 8, 17, -22, 26, 16, -3, 8, 20, -6, 20, -40, TarConstants.LF_CHR, -4, 8, 5, -15, 27, 30, -27, 18, 18, 16, -9, 21, -6, 3, 10, 26, 15, 9, 12, -8, -29, 41, 24, -4, 13, 6, -36, TarConstants.LF_CHR, 5, 10, -8, 26, -29, 24, 24, -8, 9, 14, 4, 24, -14, 20, -58, 64, 5, 22, -25, 27, 20, -1, -4, 19, -6, 15, 10, -16, 36, 1, -65, TarConstants.LF_DIR, 26, 15, 9, 12, -8, -29, 41, 24, -4, 13, 6, -36, TarConstants.LF_CHR, 5, 10, -8, 26, -29, 24, 24, -8, 9, 14, 4, 24, -14, 20};
    private static final int $$h = 143;
    private static final byte[] $$a = {11, -82, -98, -28, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 149;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int AudioAttributesImplApi21Parcelizer = 1;
    private static char[] RemoteActionCompatParcelizer = {44986, 45037, 45027, 45025, 45050, 45030, 45036, 44995, 44996, 45051, 45018, 44981, 45035, 45050, 45027, 45038, 45030, 45049, 44960, 45013, 45036, 45026, 45049, 44982, 45052, 45028, 45029, 45029, 45028, 45025, 45016, 44989, 44997, 45050, 45026, 45005, 44995, 45036, 45030, 45050, 45025, 45027, 45037, 45032, 45032, 45033, 45025, 45031, 45012, 44825, 44717, 44717, 44699, 44696, 44698, 44913, 44918, 44913, 44919, 44702, 44704, 44707, 44699, 44925, 44698, 44707, 44706, 44717, 44716, 44698, 44912, 44915, 44913, 44702, 44704, 44704, 44699, 44925, 44677, 44707, 44676, 44924, 44699, 44704, 44702, 44919, 44702, 44696, 44677, 44677, 44925, 44924, 44924, 44677, 44698, 44915, 44696, 44982, 45053, 44804, 44805, 44804, 44844, 44845, 44827, 45042, 45052, 45042, 45053, 45048, 45054, 45043, 45052, 44806, 44806, 44807, 44845, 44844, 44847, 44804, 45043, 45052, 45049, 45054, 44804, 44804, 44806, 44807, 45054, 45048, 45049, 45052, 45040, 45052, 45048, 45049, 44801, 44805, 45042, 45042, 45043, 45043, 44805, 44847, 44847, 44807, 44805, 44806, 45048, 44801, 44847, 44805, 45042, 45053, 45042, 44804, 44804, 45055, 44801, 44847, 44801, 45038, 44877, 44876, 44876, 44886, 44881, 44881, 44883, 44880, 44881, 44878, 44873, 44883, 44921, 44927, 44886, 44881, 44882, 44875, 44880, 44883, 44880, 44881, 44875, 44881, 44886, 44886, 44921, 44921, 44884, 44886, 44880, 44876, 44878, 44873, 44878, 44876, 44884, 44926, 44885, 44879, 44872, 44872, 44875, 44875, 44883, 44923, 44886, 44884, 44926, 44920, 44886, 44878, 44873, 44886, 44926, 44884, 44887, 44880, 44875, 44880, 44920, 44883, 44883, 44809, 44678, 44696, 44698, 44677, 44926, 44888, 44871, 44909, 44682, 44681, 44674, 44698, 44697, 44676, 44698, 44677, 44685, 44675, 44900, 44901, 44678, 44673, 44675, 44683, 44674, 44675, 44682, 44674, 44699, 44901, 44898, 44678, 44675, 44685, 44675, 44675, 44698, 44699, 44675, 44685, 44675, 44909, 44908, 44685, 44678, 44902, 44908, 44684, 44672, 44896, 44896, 44675, 44674, 44686, 44672, 44699, 44901, 44922, 44920, 44868, 44898, 44673, 44673, 44685, 44677, 44699, 44980, 45040, 45041, 45046, 45043, 45047, 44818, 44705, 44716, 44707, 44706, 44716, 44705, 44729, 44730, 44730, 44722, 44712, 44700, 44710, 44709, 44701, 44887, 44897, 44898, 44883, 44910, 44887, 44887, 44911, 44907, 44902, 44910, 44883, 44887, 44864, 44886, 44948, 44982, 44977, 44982, 44982, 44983, 44981, 44982, 44983, 45002, 45002};
    private static long AudioAttributesImplBaseParcelizer = -3498762522182953692L;
    private static int MediaBrowserCompatItemReceiver = -136981212;
    private static char AudioAttributesImplApi26Parcelizer = 14595;
    private final Object write = new Object();
    private boolean read = false;

    private static String $$i(int i, short s, int i2) {
        int i3 = 3 - (i * 3);
        int i4 = i2 * 4;
        byte[] bArr = $$c;
        int i5 = (s * 3) + 103;
        byte[] bArr2 = new byte[i4 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5 = i3 + (-i4);
            i3 = i3;
        }
        while (true) {
            int i7 = i3 + 1;
            i6++;
            bArr2[i6] = (byte) i5;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            i5 += -bArr[i7];
            i3 = i7;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            int r7 = 44 - r7
            int r8 = r8 + 65
            int r9 = 190 - r9
            byte[] r0 = kotlin.validateObjectHeader.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r8 = r7
            r3 = r9
            r4 = r2
            goto L28
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            int r9 = r9 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L28:
            int r8 = r8 + r9
            int r8 = r8 + (-1)
            r9 = r3
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.validateObjectHeader.c(int, short, int, java.lang.Object[]):void");
    }

    private static void d(int i, byte b, short s, Object[] objArr) {
        int i2 = s + 82;
        byte[] bArr = $$g;
        int i3 = i + 4;
        byte[] bArr2 = new byte[46 - b];
        int i4 = 45 - b;
        int i5 = -1;
        if (bArr == null) {
            i2 = (i3 + i2) - 7;
            i3++;
        }
        while (true) {
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i6 = i2;
            i2 = (i6 + bArr[i3]) - 7;
            i3++;
        }
    }

    validateObjectHeader() {
        AudioAttributesImplApi26Parcelizer();
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.validateObjectHeader.4
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                validateObjectHeader.this.AudioAttributesImplApi21Parcelizer();
            }
        });
        int i2 = AudioAttributesImplApi21Parcelizer + 95;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 75;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            getSubjectStat getsubjectstatWrite = AudioAttributesImplBaseParcelizer().write();
            this.IconCompatParcelizer = getsubjectstatWrite;
            if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                int i3 = AudioAttributesImplApi21Parcelizer + 113;
                MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
                if (i3 % 2 != 0) {
                    this.IconCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                    throw null;
                }
                this.IconCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            }
            int i4 = AudioAttributesImplApi21Parcelizer + 3;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            if (i4 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        getSubjectStat getsubjectstatWrite2 = AudioAttributesImplBaseParcelizer().write();
        this.IconCompatParcelizer = getsubjectstatWrite2;
        getsubjectstatWrite2.RemoteActionCompatParcelizer();
        throw null;
    }

    private static void b(char[] cArr, char c, char[] cArr2, char[] cArr3, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        int i5 = $10 + 77;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i7 = $11 + 77;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 22747, 36 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31369), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 2721, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 39, 1895162189, false, $$i(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 15713, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 64, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    i2 = 2;
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (40976 - (ViewConfiguration.getEdgeSlop() >> 16)), 6122 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.indexOf("", "", 0, 0) + 29, -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (AudioAttributesImplBaseParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) MediaBrowserCompatItemReceiver) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) AudioAttributesImplApi26Parcelizer) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                i3 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static void a(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr2 = RemoteActionCompatParcelizer;
        if (cArr2 != null) {
            int i6 = $10 + 111;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                length = cArr2.length;
                cArr = new char[length];
            } else {
                length = cArr2.length;
                cArr = new char[length];
            }
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) Color.alpha(0), 11612 - TextUtils.indexOf((CharSequence) "", '0', 0), 19 - TextUtils.indexOf((CharSequence) "", '0', 0), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr2, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i8 = $10 + 95;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i10 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ExpandableListView.getPackedPositionType(0L), (-16754257) - Color.rgb(0, 0, 0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 43, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i11 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (31589 - View.resolveSizeAndState(0, 0, 0)), KeyEvent.keyCodeFromString("") + 9863, 65 - (ViewConfiguration.getJumpTapTimeout() >> 16), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (37822 - ExpandableListView.getPackedPositionGroup(0L)), 9754 - ExpandableListView.getPackedPositionType(0L), 27 - ExpandableListView.getPackedPositionGroup(0L), 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                int i12 = $11 + 15;
                $10 = i12 % 128;
                int i13 = i12 % 2;
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i14 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i14, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i14);
        }
        if (z) {
            char[] cArr6 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                int i15 = $10 + 123;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i3 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i17 = $11 + 53;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 17;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        a(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0}, new int[]{0, 18, 0, 0}, false, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        a(new byte[]{1, 0, 1, 1, 0}, new int[]{18, 5, 0, 3}, false, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                a(new byte[]{1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0}, new int[]{23, 26, 0, 20}, true, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                b(new char[]{2511, 32746, 45939, 54625}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 25001), new char[]{0, 0, 0, 0}, new char[]{10165, 17149, 60702, 48334, 65245, 18841, 44413, 2692, 62514, 33421, 16812, 1203, 59468, 1959, 18029, 25355, 46186, 64172}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    int i4 = AudioAttributesImplApi21Parcelizer + 69;
                    MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
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
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getLongPressTimeout() >> 16)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 6054, 43 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    a(new byte[]{1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1}, new int[]{49, 48, 197, 12}, false, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    a(new byte[]{1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1}, new int[]{97, 64, 66, 0}, true, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    a(new byte[]{0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1}, new int[]{161, 64, 144, 0}, true, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    a(new byte[]{0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1}, new int[]{225, 67, 158, 67}, false, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a(new byte[]{0, 0, 0, 1, 1, 1}, new int[]{292, 6, 74, 6}, true, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    b(new char[]{33226, 53571, 26537, 21823}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(0) - 99), new char[]{0, 0, 0, 0}, new char[]{2882, 57316, 22991, 49386, 50298, 46393, 35737, 58879, 13418, 25069, 11701, 45286, 32458, 1848, 8374, 26310, 22530, 56074, 61620, 63649, 29178, 10039, 29848, 57798, 12129, 41709, 22067, 32065, 44280, 16356, 57809, 15468, 47066, 60499, 17631, 43733}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (Process.getGidForName("") + 1), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6029, View.getDefaultSize(0, 0) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char cIndexOf = (char) (13182 - TextUtils.indexOf((CharSequence) "", '0', 0, 0));
            int iIndexOf = TextUtils.indexOf("", "", 0) + 1649;
            int i6 = 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
            Object[] objArr13 = new Object[1];
            c(r2[5], (byte) (-$$a[140]), (short) 187, objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(cIndexOf, iIndexOf, i6, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i7 = AudioAttributesImplApi21Parcelizer + 11;
            MediaBrowserCompatCustomActionResultReceiver = i7 % 128;
            int i8 = i7 % 2;
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 13183);
                int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1649;
                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26;
                byte[] bArr = $$a;
                byte b = (byte) (-bArr[30]);
                byte b2 = bArr[5];
                Object[] objArr14 = new Object[1];
                c(b, b2, (short) (b2 | 144), objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(cNormalizeMetaState, scrollBarSize, minimumFlingVelocity, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            b(new char[]{48735, 48108, 14816, 61433}, (char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 63801), new char[]{0, 0, 0, 0}, new char[]{56820, 52686, 7832, 44228, 19739, 19086, 31691, 47186, 36029, 28289, 25485, 59125, 195, 13818, 23893, 58570}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a(new byte[]{1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1}, new int[]{298, 16, 194, 3}, false, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, -1426709619};
                byte[] bArr2 = $$g;
                byte b3 = (byte) (bArr2[87] - 1);
                Object[] objArr18 = new Object[1];
                d(b3, (byte) (b3 | 7), (byte) (-bArr2[50]), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b4 = bArr2[5];
                byte b5 = (byte) (b4 + 4);
                Object[] objArr19 = new Object[1];
                d(b4, b5, (byte) (b5 & 240), objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 13184);
                    int i9 = 1650 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    int iArgb = 26 - Color.argb(0, 0, 0, 0);
                    byte[] bArr3 = $$a;
                    byte b6 = (byte) (-bArr3[30]);
                    byte b7 = bArr3[5];
                    Object[] objArr20 = new Object[1];
                    c(b6, b7, (short) (b7 | 144), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(cLastIndexOf, i9, iArgb, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Method method = Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]);
                    Object[] objArr21 = new Object[1];
                    b(new char[]{28500, 9201, 32824, 26672}, (char) (((Context) method.invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 4), new char[]{0, 0, 0, 0}, new char[]{38250, 11435, 32996, 20354, 6242, 22096, 56922, 5094, 47251, 42579, 35850, 56558, 17155, 62946, 21367, 11027, 62407, 36245, 61133, 10731, 7953, 32410}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) - 49, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    a(null, new int[]{314, 15, 120, 6}, true, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char c = (char) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13183);
                        int iMyTid = (Process.myTid() >> 22) + 1649;
                        int iGreen = 26 - Color.green(0);
                        byte[] bArr4 = $$a;
                        byte b8 = (byte) (-bArr4[30]);
                        byte b9 = bArr4[5];
                        Object[] objArr23 = new Object[1];
                        c(b8, b9, (short) (b9 | 111), objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(c, iMyTid, iGreen, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char cMakeMeasureSpec = (char) (13183 - View.MeasureSpec.makeMeasureSpec(0, 0));
                        int iCombineMeasuredStates = 1649 - View.combineMeasuredStates(0, 0);
                        int iResolveSize = 26 - View.resolveSize(0, 0);
                        Object[] objArr24 = new Object[1];
                        c(r2[5], (byte) (-$$a[140]), (short) 187, objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(cMakeMeasureSpec, iCombineMeasuredStates, iResolveSize, -133433128, false, (String) objArr24[0], null);
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
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4535 - Drawable.resolveOpacity(0, 0)), 6054 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 42 - (ViewConfiguration.getPressedStateDuration() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i12 = AudioAttributesImplApi21Parcelizer + 85;
            MediaBrowserCompatCustomActionResultReceiver = i12 % 128;
            int i13 = i12 % 2;
            try {
                Object[] objArr25 = {-1159626490, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 6029, 24 - (ViewConfiguration.getEdgeSlop() >> 16));
                Object[] objArr26 = new Object[1];
                d(r1[51], r1[37], (byte) ($$g[87] - 1), objArr26);
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
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 59;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.IconCompatParcelizer;
        if (getsubjectstat != null) {
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 59;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            int i5 = i4 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
        }
        int i6 = MediaBrowserCompatCustomActionResultReceiver + 63;
        AudioAttributesImplApi21Parcelizer = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 93;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplBaseParcelizer().af_();
        int i4 = AudioAttributesImplApi21Parcelizer + 119;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return objAf_;
        }
        throw null;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 67;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        if (this.AudioAttributesCompatParcelizer == null) {
            synchronized (this.write) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    this.AudioAttributesCompatParcelizer = MediaBrowserCompatItemReceiver();
                }
            }
        }
        return this.AudioAttributesCompatParcelizer;
    }

    protected final void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 115;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        if (!this.read) {
            this.read = true;
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 27;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer2;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 15;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            RemoteActionCompatParcelizer2 = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
            int i3 = 98 / 0;
        } else {
            RemoteActionCompatParcelizer2 = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        }
        int i4 = AudioAttributesImplApi21Parcelizer + 73;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
        return RemoteActionCompatParcelizer2;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a(new byte[]{1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0}, new int[]{23, 26, 0, 20}, true, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(new char[]{2511, 32746, 45939, 54625}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(3) + 24911), new char[]{0, 0, 0, 0}, new char[]{10165, 17149, 60702, 48334, 65245, 18841, 44413, 2692, 62514, 33421, 16812, 1203, 59468, 1959, 18029, 25355, 46186, 64172}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 4, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = AudioAttributesImplApi21Parcelizer + 35;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            if (i2 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i3 = MediaBrowserCompatCustomActionResultReceiver + 45;
                AudioAttributesImplApi21Parcelizer = i3 % 128;
                int i4 = i3 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i5 = MediaBrowserCompatCustomActionResultReceiver + 65;
            AudioAttributesImplApi21Parcelizer = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getEdgeSlop() >> 16)), 6054 - (Process.myTid() >> 22), 42 - View.combineMeasuredStates(0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) View.MeasureSpec.getMode(0), TextUtils.getTrimmedLength("") + 6030, 24 - Color.green(0), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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
            int i2 = AudioAttributesImplApi21Parcelizer + 49;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(new byte[]{1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 0, 1, 1, 1, 0, 1, 0, 0}, new int[]{23, 26, 0, 20}, true, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(new char[]{2511, 32746, 45939, 54625}, (char) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 25010), new char[]{0, 0, 0, 0}, new char[]{10165, 17149, 60702, 48334, 65245, 18841, 44413, 2692, 62514, 33421, 16812, 1203, 59468, 1959, 18029, 25355, 46186, 64172}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 87;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (ViewConfiguration.getTapTimeout() >> 16) + 6054, 42 - (ViewConfiguration.getScrollBarSize() >> 8), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 6030 - TextUtils.getCapsMode("", 0, 0), 24 - (KeyEvent.getMaxKeyCode() >> 16), -861814097, false, "read", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:7:0x006a  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r41) {
        /*
            Method dump skipped, instruction units count: 5402
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.validateObjectHeader.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 5;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 57;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 11 / 0;
        }
    }
}
