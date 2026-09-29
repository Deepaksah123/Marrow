package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
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
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzeg extends addObserverForBackInvoker implements SubjectStat {
    private static int $10 = 0;
    private static int $11 = 1;
    private volatile isHighlighted AudioAttributesCompatParcelizer;
    private final Object IconCompatParcelizer;
    private getSubjectStat RemoteActionCompatParcelizer;
    private boolean write;
    private static final byte[] $$g = {9, -34, 82, 56, 61, -61, -2, -19, 46, -49, 7, -25, 81, -33, -56, 13, -9, -10, 42, -55, -4, -2, 5, 3, -23, -3, 11, -18, 38, -40, -7, 0, 38, -35, -22, 10, 17, -21, -21, 11, -6, -11, -1, -21, 17, -17, 1, 5, -15, 11, -23, -12, -6, -9, 11, 32, -38, -21, 7, -10, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17, -16, -2, 59, -61, -12, -4, 4, -9, 3, TarConstants.LF_CHR, -55, -17, 6, -18, -1, 2, 1, TarConstants.LF_SYMLINK, -61, -10, -10, 65, -57, -16, -2, -4, -6, -3, 60, -75, -3, 7, -7, 58, -80, -4, 21, 9, 0, -7};
    private static final int $$h = 224;
    private static final byte[] $$a = {7, -56, -121, 7, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 14;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int RatingCompat = 1;
    private static char[] read = {45049, 44909, 44906, 44882, 44887, 44910, 44895, 44857, 44878, 44911, 44872, 44855, 44880, 44906, 44910, 44885, 44887, 44881, 44982, 45052, 45042, 44809, 45053, 45028, 44904, 44910, 44908, 44897, 44909, 44907, 44878, 44872, 44905, 44897, 44864, 44856, 44871, 44908, 44899, 44896, 44896, 44899, 44923, 44907, 44883, 44898, 44908, 44884, 44887, 44944, 44984, 44992, 45038, 44995, 44987, 44998, 45039, 44997, 44978, 44997, 44999, 44992, 44992, 44984, 44987, 44987, 44992, 44993, 44990, 44999, 45033, 45032, 45032, 44998, 44999, 44993, 44988, 44989, 44988, 44978, 44997, 45039, 45038, 44998, 44984, 44993, 45038, 45033, 45032, 45035, 44993, 44991, 44990, 44988, 44997, 45039, 45039, 44984, 45033, 44993, 44999, 44992, 44986, 44995, 45033, 44999, 44988, 44991, 44988, 44998, 44998, 44985, 44995, 45033, 44995, 44985, 44991, 44998, 44999, 44998, 45038, 45039, 44997, 44988, 44990, 44988, 44991, 44986, 44984, 44989, 44990, 44992, 44992, 44993, 45039, 45038, 45033, 44998, 44989, 44990, 44987, 44984, 44998, 44998, 44992, 44993, 44984, 44986, 44987, 44990, 44978, 44990, 44986, 44987, 44995, 44999, 44988, 44988, 44989, 44989, 44999, 44809, 44900, 44900, 44685, 44901, 44892, 44901, 44920, 44921, 44675, 44923, 44882, 44883, 44923, 44685, 44675, 44921, 44923, 44684, 44900, 44892, 44892, 44893, 44893, 44880, 44926, 44675, 44921, 44881, 44883, 44882, 44883, 44881, 44901, 44923, 44921, 44674, 44674, 44923, 44923, 44922, 44892, 44922, 44901, 44900, 44901, 44892, 44903, 44922, 44923, 44672, 44674, 44900, 44882, 44883, 44922, 44901, 44900, 44922, 44922, 44923, 44881, 44881, 44886, 45053, 44902, 44903, 44900, 44897, 44901, 44945, 44988, 44993, 44995, 44993, 45038, 45038, 44996, 44990, 44995, 44998, 44996, 44995, 44964, 44987, 44992, 44999, 44985, 44984, 44991, 44991, 44991, 44986, 44995, 44997, 44997, 44997, 44984, 44965, 44987, 44987, 44990, 44988, 44998, 44995, 44987, 44963, 45036, 45052, 45049, 45030, 45027, 45025, 45039, 45025, 45025, 45005, 44999, 45036, 45037, 45024, 44992, 44990, 45037, 45038, 45027, 45011, 45023, 45031, 45024, 45022, 45034, 45052, 45028, 45028, 45051, 45027, 45038, 44976, 45030, 45027, 45010, 45021, 45031, 45027, 45037, 45036, 45037, 45027, 45025, 45050, 45030, 45036, 44995, 44996, 45051, 45018, 45002, 45036, 45052, 44818, 44815, 44829, 44818, 44844, 44841, 44830, 44821, 44818, 44818, 44842, 44822, 44845, 44821, 44830, 44965, 45012, 45034, 45035, 45035, 45032, 45035, 45013, 45034, 45032, 45012};
    private static char[] AudioAttributesImplBaseParcelizer = {28603, 28489, 28490, 28601, 28494, 28488, 28573, 28492, 28592, 28597, 28605, 28495, 28596, 28491, 28546, 28559, 28600, 28485, 28558, 28599, 28493, 28593, 28486, 28554, 28548, 28557, 28550, 28556, 28552, 28555, 28551};
    private static int AudioAttributesImplApi26Parcelizer = 411398108;
    private static boolean AudioAttributesImplApi21Parcelizer = true;
    private static boolean MediaBrowserCompatCustomActionResultReceiver = true;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.zzeg.$$a
            int r6 = 191 - r6
            int r5 = 114 - r5
            int r1 = r7 + 4
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r6
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r3 = r0[r6]
        L24:
            int r6 = r6 + 1
            int r5 = r5 + r3
            int r5 = r5 + (-1)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzeg.c(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r7, int r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 4
            int r7 = 43 - r7
            byte[] r0 = kotlin.zzeg.$$g
            int r8 = 119 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r8 = r9
            r4 = r2
            goto L29
        L11:
            r3 = r2
        L12:
            r6 = r9
            r9 = r8
            r8 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r6
        L29:
            int r9 = r9 + 1
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-4)
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzeg.d(short, int, int, java.lang.Object[]):void");
    }

    zzeg() {
        this.IconCompatParcelizer = new Object();
        this.write = false;
        AudioAttributesImplApi26Parcelizer();
    }

    zzeg(byte b) {
        super(R.layout.activity_qbank_tracker);
        this.IconCompatParcelizer = new Object();
        this.write = false;
        AudioAttributesImplApi26Parcelizer();
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.zzeg.4
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                zzeg.this.AudioAttributesImplBaseParcelizer();
            }
        });
        int i2 = MediaBrowserCompatItemReceiver + 41;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        getSubjectStat getsubjectstatWrite = MediaBrowserCompatItemReceiver().write();
        this.RemoteActionCompatParcelizer = getsubjectstatWrite;
        Object obj = null;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            int i2 = MediaBrowserCompatItemReceiver + 19;
            RatingCompat = i2 % 128;
            if (i2 % 2 == 0) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                obj.hashCode();
                throw null;
            }
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
        }
        int i3 = RatingCompat + 29;
        MediaBrowserCompatItemReceiver = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    private static void b(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = AudioAttributesImplBaseParcelizer;
        if (cArr2 != null) {
            int i3 = $10 + 59;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((-16732354) - Color.rgb(0, 0, 0)), View.resolveSize(0, 0) + 18944, Color.argb(0, 0, 0, 0) + 28, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i5++;
                    int i6 = $10 + 57;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
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
        Object[] objArr3 = {Integer.valueOf(AudioAttributesImplApi26Parcelizer)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 19032, View.resolveSize(0, 0) + 75, 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        if (MediaBrowserCompatCustomActionResultReceiver) {
            int i8 = $11 + 71;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr4 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 11439, 15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!AudioAttributesImplApi21Parcelizer) {
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                int i10 = $11 + 125;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                notifydownloads.IconCompatParcelizer++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
            Object[] objArr5 = {notifydownloads, notifydownloads};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) Color.red(0), Gravity.getAbsoluteGravity(0, 0) + 11439, 15 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -558368911, false, "q", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    private static void a(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        char[] cArr;
        int length;
        char[] cArr2;
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr3 = read;
        Object obj = null;
        if (cArr3 != null) {
            int i8 = $10 + 107;
            $11 = i8 % 128;
            if (i8 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i = 0;
            }
            while (i < length) {
                int i9 = $11 + 101;
                $10 = i9 % 128;
                int i10 = i9 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 11613, 20 - View.resolveSizeAndState(0, 0, 0), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i++;
                    i2 = 2;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr3, i4, cArr4, 0, i5);
        if (bArr != null) {
            int i11 = $11 + 103;
            $10 = i11 % 128;
            if (i11 % 2 != 0) {
                cArr = new char[i5];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 1;
            } else {
                cArr = new char[i5];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            }
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i12 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.getDeadChar(0, 0), Color.rgb(0, 0, 0) + 16800175, 44 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i12] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(obj, objArr3)).charValue();
                } else {
                    int i13 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 31588), (ViewConfiguration.getFadingEdgeLength() >> 16) + 9863, (ViewConfiguration.getTouchSlop() >> 8) + 65, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr[i13] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(obj, objArr4)).charValue();
                    int i14 = $11 + 33;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                }
                c = cArr[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 37822), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 9754, (-16777189) - Color.rgb(0, 0, 0), 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                obj = null;
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr4 = cArr;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr4, 0, cArr5, 0, i5);
            int i16 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr4, i16, i7);
            System.arraycopy(cArr5, i7, cArr4, 0, i16);
        }
        if (z) {
            char[] cArr6 = new char[i5];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr4[(i5 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr4 = cArr6;
        }
        if (i6 > 0) {
            int i17 = $11 + 9;
            $10 = i17 % 128;
            int i18 = i17 % 2;
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                int i19 = $11 + 5;
                $10 = i19 % 128;
                if (i19 % 2 != 0) {
                    cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] / iArr[5]);
                } else {
                    cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                }
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        a(new byte[]{1, 0, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, new int[]{0, 18, 116, 0}, true, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        a(new byte[]{1, 1, 1, 0, 0}, new int[]{18, 5, 16, 2}, false, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                a(new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, new int[]{23, 26, 123, 0}, false, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                b(127 - (ViewConfiguration.getTapTimeout() >> 16), new byte[]{-123, -116, -118, -122, -117, -127, -118, -119, -120, -120, -121, -122, -123, -124, -125, -125, -126, -127}, null, null, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.getOffsetAfter("", 0) + 4535), ((Process.getThreadPriority(0) + 20) >> 6) + 6054, 41 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    a(new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0}, new int[]{49, 48, 0, 33}, false, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    a(new byte[]{1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0}, new int[]{97, 64, 0, 18}, true, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    a(new byte[]{1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0}, new int[]{161, 64, 165, 0}, false, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 16, new byte[]{-114, -122, -123, -124, -105, -124, -112, -104, -105, -112, -122, -114, -124, -108, -123, -118, -112, -118, -120, -117, -112, -106, -116, -127, -109, -124, -125, -117, -126, -107, -114, -111, -125, -117, -126, -108, -109, -122, -114, -117, -127, -122, -117, -124, -125, -115, -122, -109, -114, -111, -123, -126, -116, -125, -110, -119, -118, -117, -111, -112, -112, -113, -114, -120, -122, -122, -115}, null, null, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a(new byte[]{0, 0, 0, 1, 1, 1}, new int[]{225, 6, TsExtractor.TS_PACKET_SIZE, 0}, true, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    a(new byte[]{0, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 0, 0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1}, new int[]{231, 36, 0, 0}, true, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) View.combineMeasuredStates(0, 0), 6029 - Process.getGidForName(""), (ViewConfiguration.getTapTimeout() >> 16) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char windowTouchSlop = (char) (13183 - (ViewConfiguration.getWindowTouchSlop() >> 8));
            int maximumDrawingCacheSize = 1649 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            int i2 = 27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
            short s = (short) 187;
            Object[] objArr13 = new Object[1];
            c($$a[62], s, (byte) (s & 108), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(windowTouchSlop, maximumDrawingCacheSize, i2, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i3 = MediaBrowserCompatItemReceiver + 55;
            RatingCompat = i3 % 128;
            int i4 = i3 % 2;
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cResolveOpacity = (char) (Drawable.resolveOpacity(0, 0) + 13183);
                int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 1649;
                int offsetBefore = TextUtils.getOffsetBefore("", 0) + 26;
                Object[] objArr14 = new Object[1];
                c(r2[9], (short) 144, (byte) (-$$a[8]), objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(cResolveOpacity, jumpTapTimeout, offsetBefore, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            a(new byte[]{1, 0, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{267, 16, 0, 6}, false, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a(new byte[]{1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1}, new int[]{283, 16, 0, 1}, true, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i5 = MediaBrowserCompatItemReceiver + 77;
            RatingCompat = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, 1961077818};
                byte b = $$g[31];
                byte b2 = b;
                Object[] objArr18 = new Object[1];
                d(b2, (byte) (b2 | 8), b, objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                d(r0[28], r0[31], r0[18], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf("", "") + 13183);
                    int iIndexOf = 1649 - TextUtils.indexOf("", "", 0);
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 26;
                    Object[] objArr20 = new Object[1];
                    c(r3[9], (short) 144, (byte) (-$$a[8]), objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(cIndexOf, iIndexOf, longPressTimeout, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    a(new byte[]{0, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0}, new int[]{299, 22, 0, 8}, false, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    a(null, new int[]{321, 15, 51, 9}, true, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0') + 13184);
                        int keyRepeatDelay = 1649 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        int i7 = (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26;
                        Object[] objArr23 = new Object[1];
                        c(r8[9], (short) ($$b | 97), (byte) (-$$a[8]), objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(cLastIndexOf, keyRepeatDelay, i7, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 13183);
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1649;
                        int iResolveSizeAndState = 26 - View.resolveSizeAndState(0, 0, 0);
                        short s2 = (short) 187;
                        Object[] objArr24 = new Object[1];
                        c($$a[62], s2, (byte) (s2 & 108), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(cCombineMeasuredStates, doubleTapTimeout, iResolveSizeAndState, -133433128, false, (String) objArr24[0], null);
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
            long j2 = 0;
            long j3 = (((long) (i9 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4536 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6054, (ViewConfiguration.getScrollBarSize() >> 8) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {1296957142, Long.valueOf(j3), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 6030, (ViewConfiguration.getEdgeSlop() >> 16) + 24);
                byte[] bArr = $$g;
                Object[] objArr26 = new Object[1];
                d((byte) (-bArr[48]), (byte) (bArr[28] - 1), bArr[8], objArr26);
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
            int i2 = RatingCompat + 119;
            MediaBrowserCompatItemReceiver = i2 % 128;
            int i3 = i2 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
            if (i3 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        int i4 = MediaBrowserCompatItemReceiver + 9;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = RatingCompat + 93;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver();
        if (i3 != 0) {
            ishighlightedMediaBrowserCompatItemReceiver.af_();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objAf_ = ishighlightedMediaBrowserCompatItemReceiver.af_();
        int i4 = RatingCompat + 55;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 31 / 0;
        }
        return objAf_;
    }

    private isHighlighted AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatItemReceiver + 99;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        if (this.AudioAttributesCompatParcelizer == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    this.AudioAttributesCompatParcelizer = AudioAttributesImplApi21Parcelizer();
                }
            }
        }
        return this.AudioAttributesCompatParcelizer;
    }

    protected final void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = RatingCompat + 63;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        if (this.write) {
            return;
        }
        this.write = true;
        int i4 = MediaBrowserCompatItemReceiver + 109;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 81;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = RatingCompat + 61;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        return RemoteActionCompatParcelizer;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = RatingCompat + 9;
            MediaBrowserCompatItemReceiver = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, new int[]{23, 26, 123, 0}, false, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 126, new byte[]{-123, -116, -118, -122, -117, -127, -118, -119, -120, -120, -121, -122, -123, -124, -125, -125, -126, -127}, null, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = RatingCompat + 115;
            MediaBrowserCompatItemReceiver = i4 % 128;
            int i5 = i4 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4534 - MotionEvent.axisFromString("")), 6054 - (ViewConfiguration.getFadingEdgeLength() >> 16), 42 - ExpandableListView.getPackedPositionGroup(0L), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), ExpandableListView.getPackedPositionType(0L) + 6030, View.combineMeasuredStates(0, 0) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x0099  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 347
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzeg.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x077d  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x07b2 A[Catch: all -> 0x086c, TryCatch #7 {all -> 0x086c, blocks: (B:129:0x07ac, B:131:0x07b2, B:132:0x07db), top: B:284:0x07ac, outer: #6 }] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r35) {
        /*
            Method dump skipped, instruction units count: 4823
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzeg.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = RatingCompat + 57;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 94 / 0;
        }
        int i5 = MediaBrowserCompatItemReceiver + 21;
        RatingCompat = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
