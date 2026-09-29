package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
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
public abstract class PaymentInstrumentType extends addObserverForBackInvoker implements SubjectStat {
    private volatile isHighlighted IconCompatParcelizer;
    private boolean RemoteActionCompatParcelizer;
    private getSubjectStat read;
    private final Object write;
    private static final byte[] $$c = {TarConstants.LF_GNUTYPE_LONGNAME, 36, -23, -15};
    private static final int $$f = 196;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {16, -111, 25, -45, -63, 59, 0, 17, -44, 43, 1, 8, -31, 24, 19, -19, -14, 27, -3, 13, -78, TarConstants.LF_NORMAL, 21, 10, 4, 7, -13, -34, 36, 19, -9, 8, 1, -41, 46, 0, 5, -13, 21, -34, 19, 19, -13, 4, 9, -1, 19, -19, 15, -17, 21, 10, 4, 7, -13, -34, 36, 19, -9, 8, 1, -41, 46, 0, 5, -13, 21, -34, 19, 19, -13, 4, 9, -1, 19, -19, 15, -63, 78, 2, -11, 9, 28, 14, 1, -41, 46, 0, 5, -13, 21, -34, 19, 19, -13, 4, 9, -1, 19, -19, 15};
    private static final int $$h = 74;
    private static final byte[] $$a = {79, -100, -79, 21, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 104;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static char[] AudioAttributesCompatParcelizer = {44990, 45036, 44995, 44996, 45051, 45018, 44981, 45035, 45050, 45027, 45038, 45030, 45049, 45024, 45037, 45027, 45025, 45050, 44816, 44709, 44718, 44712, 44689, 44814, 44674, 44684, 44674, 44686, 44918, 44682, 44686, 44674, 44672, 44920, 44926, 44673, 44681, 44687, 44678, 44679, 44684, 44950, 44997, 45039, 44998, 44987, 44995, 45038, 44992, 44984, 44998, 45039, 45039, 44997, 44988, 44990, 44991, 44993, 45035, 45032, 45033, 45038, 44993, 44984, 44998, 45038, 45039, 44997, 44978, 44988, 44989, 44988, 44993, 44999, 44998, 45032, 45032, 45033, 44999, 44990, 44993, 44992, 44987, 44987, 44984, 44992, 44992, 44999, 44997, 45035, 44835, 44835, 44872, 44832, 44827, 44832, 44839, 44836, 44878, 44838, 44825, 44830, 44838, 44872, 44878, 44836, 44838, 44875, 44835, 44827, 44827, 44824, 44824, 44831, 44837, 44878, 44836, 44828, 44830, 44825, 44830, 44828, 44832, 44838, 44836, 44873, 44873, 44838, 44838, 44833, 44827, 44833, 44832, 44835, 44832, 44827, 44834, 44833, 44838, 44879, 44873, 44835, 44825, 44830, 44833, 44832, 44835, 44833, 44833, 44838, 44828, 44828, 44829, 44978, 45052, 45046, 45040, 45043, 45012, 44982, 44989, 45019, 45024, 45031, 45048, 45040, 45047, 45042, 45040, 45043, 45051, 45049, 45010, 45011, 45052, 45055, 45049, 45025, 45048, 45049, 45024, 45048, 45041, 45011, 45016, 45052, 45049, 45051, 45049, 45049, 45040, 45041, 45049, 45051, 45049, 45019, 45018, 45051, 45052, 45020, 45018, 45050, 45054, 45022, 45022, 45049, 45048, 45028, 45054, 45041, 45011, 45008, 45014, 44978, 45016, 45055, 45055, 45051, 45043, 45041, 45045, 44687, 44678, 44677, 44917, 44883, 44905, 44681, 44682, 44917, 44908, 44906, 44686, 44686, 44916, 44686, 44976, 45028, 45028, 45051, 45027, 45038, 45036, 45037, 45038, 45027, 45011, 45023, 45031, 45024, 45022, 45034, 45047, 44925, 44915, 44919, 44909, 44898, 44915, 44918, 44681, 44684, 44924, 44890, 44906, 44683, 44884, 44883, 44924, 44918, 44682, 44913, 44915, 44925};
    private static long AudioAttributesImplBaseParcelizer = -3498762522182953692L;
    private static int AudioAttributesImplApi26Parcelizer = -136981212;
    private static char MediaBrowserCompatItemReceiver = 59344;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r5, int r6, byte r7) {
        /*
            int r6 = r6 * 2
            int r0 = 1 - r6
            int r5 = r5 * 4
            int r5 = r5 + 4
            byte[] r1 = kotlin.PaymentInstrumentType.$$c
            int r7 = r7 * 3
            int r7 = 103 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            int r6 = 0 - r6
            if (r1 != 0) goto L18
            r4 = r6
            r3 = r2
            goto L28
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            r4 = r1[r5]
            int r3 = r3 + 1
        L28:
            int r5 = r5 + 1
            int r7 = r7 + r4
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.PaymentInstrumentType.$$i(short, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.PaymentInstrumentType.$$a
            int r1 = r8 + 4
            int r7 = 114 - r7
            int r6 = 190 - r6
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2b
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.PaymentInstrumentType.c(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = 47 - r5
            int r7 = r7 + 73
            byte[] r1 = kotlin.PaymentInstrumentType.$$g
            int r6 = r6 + 4
            byte[] r0 = new byte[r0]
            int r5 = 46 - r5
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r5
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            int r6 = r6 + 1
            r3 = r1[r6]
        L26:
            int r7 = r7 + r3
            int r7 = r7 + (-2)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.PaymentInstrumentType.d(byte, byte, int, java.lang.Object[]):void");
    }

    PaymentInstrumentType() {
        this.write = new Object();
        this.RemoteActionCompatParcelizer = false;
        AudioAttributesImplBaseParcelizer();
    }

    PaymentInstrumentType(byte b) {
        super(R.layout.activity_test_introduction_marrow2);
        this.write = new Object();
        this.RemoteActionCompatParcelizer = false;
        AudioAttributesImplBaseParcelizer();
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.PaymentInstrumentType.3
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                PaymentInstrumentType.this.MediaBrowserCompatCustomActionResultReceiver();
            }
        });
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 53;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 35;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getSubjectStat getsubjectstatWrite = AudioAttributesImplApi26Parcelizer().write();
        this.read = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            this.read.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            int i4 = AudioAttributesImplApi21Parcelizer + 101;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static void b(char[] cArr, char c, char[] cArr2, char[] cArr3, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
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
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i4 = $11 + 41;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getEdgeSlop() >> 16) + 22748, 36 - TextUtils.getOffsetBefore("", 0), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (31370 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), (Process.myPid() >> 22) + 2721, 37 - Process.getGidForName(""), 1895162189, false, $$i(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (KeyEvent.getMaxKeyCode() >> 16), KeyEvent.keyCodeFromString("") + 15713, KeyEvent.getDeadChar(0, 0) + 64, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (40976 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), (ViewConfiguration.getTapTimeout() >> 16) + 6122, ExpandableListView.getPackedPositionType(0L) + 29, -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (AudioAttributesImplBaseParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) AudioAttributesImplApi26Parcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) MediaBrowserCompatItemReceiver) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i6 = $10 + 57;
        $11 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    private static void a(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = AudioAttributesCompatParcelizer;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 15;
                $11 = i9 % 128;
                int i10 = i9 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), KeyEvent.keyCodeFromString("") + 11613, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 20, -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 2;
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
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i11 = $11 + 71;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getLongPressTimeout() >> 16), 22959 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 43, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 31589), 9863 - (Process.myTid() >> 22), Color.rgb(0, 0, 0) + 16777281, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (KeyEvent.normalizeMetaState(0) + 37822), ExpandableListView.getPackedPositionType(0L) + 9754, 27 - Color.alpha(0), 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            char[] cArr5 = new char[i5];
            System.arraycopy(cArr3, 0, cArr5, 0, i5);
            int i15 = i5 - i7;
            System.arraycopy(cArr5, 0, cArr3, i15, i7);
            System.arraycopy(cArr5, i7, cArr3, 0, i15);
            int i16 = $10 + 85;
            $11 = i16 % 128;
            int i17 = i16 % 2;
        }
        if (!(!z)) {
            char[] cArr6 = new char[i5];
            loop2: while (true) {
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                    int i18 = $10 + 29;
                    $11 = i18 % 128;
                    if (i18 % 2 == 0) {
                        break;
                    }
                    cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i5 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                    buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                }
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer + i5];
                int i19 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
            }
            cArr3 = cArr6;
        }
        if (i6 > 0) {
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                int i20 = $11 + 65;
                $10 = i20 % 128;
                if (i20 % 2 != 0) {
                    cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] << iArr[3]);
                    i = buildsetstopreasonintent.RemoteActionCompatParcelizer;
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
        char c;
        char c2;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 33;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr2 = new Object[1];
        a(new byte[]{1, 1, 0, 1, 0, 1, 0, 0, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1}, new int[]{0, 18, 0, 13}, false, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        a(new byte[]{1, 0, 1, 1, 0}, new int[]{18, 5, TsExtractor.TS_PACKET_SIZE, 2}, true, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                b(new char[]{40645, 59311, 53733, 36361}, (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 2513), new char[]{0, 0, 0, 0}, new char[]{64273, 51455, 2029, 20219, 19593, 48760, 55342, 35066, 19798, 59777, 31623, 29246, 45567, 37681, 54197, 62231, 60462, 1853, 55006, 20623, 12422, 29774, 5590, 13624, 19920, 21890}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 49, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                a(new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, new int[]{23, 18, 154, 0}, true, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4535), 6054 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    a(new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0, 1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0}, new int[]{41, 48, 0, 24}, true, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b(new char[]{46365, 40288, 2378, 8150}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 4), new char[]{0, 0, 0, 0}, new char[]{18437, 37666, 48141, 8428, 29383, 39152, 65336, 54428, 42150, 63751, 64295, 58200, 16049, 63689, 59052, 20176, 26064, 52965, 21982, 14528, 24464, 32944, 15940, 8943, 45937, 63951, 2112, 21823, 63419, 17108, 63622, 56443, 13733, 30158, 48975, 17777, 35708, 9432, 53111, 25068, 50750, 32217, 50216, 4924, 61309, 63182, 38512, 8993, 10779, 10081, 17546, 12764, 60107, 40479, 17260, 18158, 41986, 17303, 28042, 15705, 60850, 21998, 6355, 18512}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    a(new byte[]{0, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0}, new int[]{89, 64, 96, 0}, false, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    a(new byte[]{0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1}, new int[]{153, 67, 8, 0}, false, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b(new char[]{31598, 51774, 40295, 9431}, (char) (View.combineMeasuredStates(0, 0) + 55197), new char[]{0, 0, 0, 0}, new char[]{15407, 50661, 21514, 46722, 52588, 38037}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    b(new char[]{10716, 5136, 11801, 44978}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35), new char[]{0, 0, 0, 0}, new char[]{54571, 17502, 39313, 33600, 38193, 54027, 23173, 26880, 7561, 6569, 128, 15559, 31570, 23491, 60486, 58514, 34470, 12158, 61711, 49137, 6267, 20175, 36199, 42544, 63551, 46471, 49236, 40407, 4187, 50751, 56075, 64084, 13654, 55288, 38261, 20337}, View.getDefaultSize(0, 0), objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.normalizeMetaState(0), Color.argb(0, 0, 0, 0) + 6030, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
            char minimumFlingVelocity = (char) ((ViewConfiguration.getMinimumFlingVelocity() >> 16) + 13183);
            int fadingEdgeLength = 1649 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            int iLastIndexOf = 25 - TextUtils.lastIndexOf("", '0', 0);
            byte b = (byte) (-$$a[62]);
            Object[] objArr13 = new Object[1];
            c((short) 187, b, (byte) (b + 3), objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(minimumFlingVelocity, fadingEdgeLength, iLastIndexOf, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            int i4 = AudioAttributesImplApi21Parcelizer + 31;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            int i5 = i4 % 2;
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char c3 = (char) (13184 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)));
                int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1649;
                int iMyPid = 26 - (Process.myPid() >> 22);
                Object[] objArr14 = new Object[1];
                c((short) 144, (byte) (-$$a[9]), r1[8], objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(c3, pressedStateDuration, iMyPid, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
            c2 = 3;
            c = 2;
        } else {
            Object[] objArr15 = new Object[1];
            a(new byte[]{0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1}, new int[]{220, 16, 153, 15}, true, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            a(new byte[]{0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1}, new int[]{236, 16, 0, 7}, true, objArr16);
            try {
                Object[] objArr17 = {Integer.valueOf(((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue()), 0, 1345431141};
                byte[] bArr = $$g;
                byte b2 = bArr[6];
                byte b3 = bArr[45];
                Object[] objArr18 = new Object[1];
                d(b2, b3, (byte) (b3 & 38), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                Object[] objArr19 = new Object[1];
                d(bArr[14], (byte) (-bArr[3]), bArr[44], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char c4 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 13184);
                    int packedPositionChild = 1648 - ExpandableListView.getPackedPositionChild(0L);
                    int iLastIndexOf2 = 25 - TextUtils.lastIndexOf("", '0', 0);
                    Object[] objArr20 = new Object[1];
                    c((short) 144, (byte) (-$$a[9]), r3[8], objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(c4, packedPositionChild, iLastIndexOf2, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    a(new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, new int[]{252, 22, 144, 0}, true, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    b(new char[]{65237, 46367, 55941, 52148}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 46263), new char[]{0, 0, 0, 0}, new char[]{31896, 53896, 22146, 61723, 11090, 32510, 12008, 33253, 10421, 47422, 52744, 12987, 58703, 1437, 35008}, (-2051727363) + (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)), objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char offsetAfter = (char) (TextUtils.getOffsetAfter("", 0) + 13183);
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1649;
                        int bitsPerPixel = 25 - ImageFormat.getBitsPerPixel(0);
                        Object[] objArr23 = new Object[1];
                        c((short) ($$b | 7), (byte) (-$$a[9]), r12[8], objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(offsetAfter, absoluteGravity, bitsPerPixel, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char c5 = (char) ((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13183);
                        int iLastIndexOf3 = TextUtils.lastIndexOf("", '0', 0, 0) + 1650;
                        int iLastIndexOf4 = TextUtils.lastIndexOf("", '0', 0, 0) + 27;
                        byte b4 = (byte) (-$$a[62]);
                        Object[] objArr24 = new Object[1];
                        c((short) 187, b4, (byte) (b4 + 3), objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(c5, iLastIndexOf3, iLastIndexOf4, -133433128, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf2);
                    int i6 = AudioAttributesImplApi21Parcelizer + 17;
                    MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
                    c = 2;
                    int i7 = i6 % 2;
                    c2 = 3;
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
        int i8 = ((int[]) objArr[c2])[0];
        int i9 = ((int[]) objArr[c])[0];
        if (i9 != i8) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i9 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 4535), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6053, 42 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {137077410, Long.valueOf(j3), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) Gravity.getAbsoluteGravity(0, 0), 6030 - (ViewConfiguration.getWindowTouchSlop() >> 8), (-16777192) - Color.rgb(0, 0, 0));
                Object[] objArr26 = new Object[1];
                d(r1[14], (byte) (-$$g[3]), r1[44], objArr26);
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
        AudioAttributesImplApi21Parcelizer();
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 99;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.read;
        if (getsubjectstat != null) {
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 61;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            int i5 = i4 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 81;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplApi26Parcelizer().af_();
        if (i3 != 0) {
            int i4 = 76 / 0;
        }
        int i5 = AudioAttributesImplApi21Parcelizer + 11;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            return objAf_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 37;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 98 / 0;
        }
        return ishighlighted;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        if (this.IconCompatParcelizer == null) {
            synchronized (this.write) {
                if (this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = MediaBrowserCompatItemReceiver();
                }
            }
        }
        return this.IconCompatParcelizer;
    }

    protected final void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        if (!this.RemoteActionCompatParcelizer) {
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 47;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                this.RemoteActionCompatParcelizer = false;
            } else {
                this.RemoteActionCompatParcelizer = true;
            }
            int i3 = AudioAttributesImplApi21Parcelizer + 79;
            MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
            int i4 = i3 % 2;
        }
        int i5 = MediaBrowserCompatCustomActionResultReceiver + 53;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 2 / 0;
        }
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 27;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        if (i3 == 0) {
            int i4 = 13 / 0;
        }
        return RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a1  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.PaymentInstrumentType.onResume():void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 91;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(new char[]{40645, 59311, 53733, 36361}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2478), new char[]{0, 0, 0, 0}, new char[]{64273, 51455, 2029, 20219, 19593, 48760, 55342, 35066, 19798, 59777, 31623, 29246, 45567, 37681, 54197, 62231, 60462, 1853, 55006, 20623, 12422, 29774, 5590, 13624, 19920, 21890}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 4, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, new int[]{23, 18, 154, 0}, true, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i3 = MediaBrowserCompatCustomActionResultReceiver + 33;
            AudioAttributesImplApi21Parcelizer = i3 % 128;
            int i4 = i3 % 2;
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i5 = MediaBrowserCompatCustomActionResultReceiver + 11;
                AudioAttributesImplApi21Parcelizer = i5 % 128;
                int i6 = i5 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i7 = AudioAttributesImplApi21Parcelizer + 49;
                MediaBrowserCompatCustomActionResultReceiver = i7 % 128;
                int i8 = i7 % 2;
            }
        }
        if (baseContext != null) {
            int i9 = AudioAttributesImplApi21Parcelizer + 113;
            MediaBrowserCompatCustomActionResultReceiver = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (View.combineMeasuredStates(0, 0) + 4535), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6053, 42 - (ViewConfiguration.getKeyRepeatDelay() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 6030 - View.combineMeasuredStates(0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23, -861814097, false, "read", new Class[]{Context.class});
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

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0691 A[Catch: all -> 0x074f, TryCatch #10 {all -> 0x074f, blocks: (B:112:0x068b, B:114:0x0691, B:115:0x06bc), top: B:315:0x068b, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0808 A[Catch: all -> 0x0283, TryCatch #3 {all -> 0x0283, blocks: (B:237:0x0e90, B:239:0x0e96, B:240:0x0ec3, B:272:0x12be, B:274:0x12c4, B:275:0x12f3, B:253:0x1056, B:255:0x1079, B:256:0x10d3, B:204:0x0a60, B:206:0x0a66, B:207:0x0a92, B:159:0x0802, B:161:0x0808, B:162:0x082f, B:24:0x00a5, B:26:0x00ab, B:27:0x00d6, B:29:0x01f5, B:31:0x0227, B:32:0x027d, B:167:0x08c3, B:170:0x08d1, B:174:0x08dd, B:190:0x09b8, B:192:0x09be, B:193:0x09bf, B:195:0x09c1, B:197:0x09c8, B:198:0x09c9, B:179:0x08e8, B:181:0x08fd, B:182:0x092f, B:183:0x0935, B:185:0x0942, B:186:0x09ae), top: B:302:0x00a5, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0b27  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0b75  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0bd7  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0e6e  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0f5c  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0fa4  */
    /* JADX WARN: Removed duplicated region for block: B:252:0x1007  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x129d  */
    /* JADX WARN: Removed duplicated region for block: B:344:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0070  */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v12 */
    /* JADX WARN: Type inference failed for: r9v13, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v29, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v35 */
    /* JADX WARN: Type inference failed for: r9v36 */
    /* JADX WARN: Type inference failed for: r9v37 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r36) {
        /*
            Method dump skipped, instruction units count: 5611
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.PaymentInstrumentType.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 75;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            throw null;
        }
    }
}
