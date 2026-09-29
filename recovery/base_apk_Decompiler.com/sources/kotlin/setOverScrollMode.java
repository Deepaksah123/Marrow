package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class setOverScrollMode extends addObserverForBackInvoker implements SubjectStat {
    private volatile isHighlighted AudioAttributesCompatParcelizer;
    private getSubjectStat RemoteActionCompatParcelizer;
    private static final byte[] $$c = {TarConstants.LF_SYMLINK, -57, 8, -14};
    private static final int $$f = 28;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {43, -12, TarConstants.LF_GNUTYPE_LONGNAME, -80, -64, 24, 3, 6, 8, 35, -2, -11, -4, 3, 3, -16, 18, 20, -3, 2, -2, -12, -64, 84, -4, -8, 12, -14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -64, 58, -1, 16, -49, 46, -10, 22, -84, 30, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -41, 32, 19, -13, -20, 18, 18, -14, 3, 8, -2, 18, -20, 14, -4, -8, 12, -14};
    private static final int $$h = 123;
    private static final byte[] $$a = {TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 23, -13, 96, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 117;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int AudioAttributesImplApi21Parcelizer = 1;
    private static char[] read = {44960, 45039, 44813, 44828, 44805, 44800, 44824, 44819, 44826, 44807, 44805, 44827, 44828, 44824, 44806, 45029, 45054, 44829, 44811, 44678, 44697, 44703, 44714, 45024, 44871, 44865, 44889, 44854, 44848, 44888, 44890, 44870, 44866, 44878, 44870, 44890, 44868, 44890, 44864, 44868, 44895, 44805, 44692, 44694, 44702, 44690, 44690, 44927, 44881, 44917, 44919, 44918, 44692, 44701, 44699, 44703, 44700, 44925, 44925, 44701, 44697, 44921, 44915, 44691, 44702, 44921, 44926, 44700, 44702, 44700, 44692, 44695, 44700, 44700, 44702, 44700, 44691, 44927, 44918, 44692, 44703, 44679, 44700, 44703, 44676, 44700, 44690, 44691, 44918, 44913, 44700, 44702, 44694, 44695, 44689, 44714, 44695, 44703, 44698, 44679, 44926, 44880, 44885, 44683, 44694, 44695, 44693, 44691, 44946, 44984, 44987, 44986, 44991, 44985, 44985, 44997, 44984, 44965, 44987, 44987, 44990, 44988, 44998, 44995, 44987, 44990, 44988, 44993, 44995, 44993, 45038, 45038, 44996, 44990, 44995, 44998, 44996, 44995, 44964, 44987, 44992, 44999, 44985, 44984, 44991, 44991, 44991, 44986, 44995, 44997, 44990, 45036, 45038, 45027, 45051, 45028, 45028, 45052, 45034, 45022, 45024, 45031, 45023, 45011, 45027, 45038, 44848, 44860, 45055, 44833, 44858, 44860, 44851, 44833, 44863, 44834, 44856, 44832, 44860, 44857, 44800, 44862, 44838, 44849, 44848, 44874, 44816, 45055, 44995, 44824, 44830, 44831, 44831, 44828, 44831, 44825, 44830, 44828, 44824};
    private static long AudioAttributesImplApi26Parcelizer = -3367577227502064462L;
    private final Object IconCompatParcelizer = new Object();
    private boolean write = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(int r5, byte r6, byte r7) {
        /*
            int r6 = r6 * 3
            int r6 = 1 - r6
            int r7 = r7 * 2
            int r7 = 104 - r7
            byte[] r0 = kotlin.setOverScrollMode.$$c
            int r5 = r5 * 3
            int r5 = r5 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L26
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L24:
            r4 = r0[r5]
        L26:
            int r7 = r7 + r4
            int r5 = r5 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setOverScrollMode.$$i(int, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = 190 - r7
            byte[] r0 = kotlin.setOverScrollMode.$$a
            int r6 = 114 - r6
            int r1 = 44 - r8
            byte[] r1 = new byte[r1]
            int r8 = 43 - r8
            r2 = 0
            if (r0 != 0) goto L13
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L17:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r6]
        L2a:
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setOverScrollMode.c(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = kotlin.setOverScrollMode.$$g
            int r7 = r7 + 73
            int r9 = r9 + 5
            int r8 = r8 + 4
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L25
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L20
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L20:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L25:
            int r7 = r7 + r8
            int r7 = r7 + (-1)
            int r8 = r3 + 1
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setOverScrollMode.d(byte, int, short, java.lang.Object[]):void");
    }

    setOverScrollMode() {
        AudioAttributesImplApi21Parcelizer();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.setOverScrollMode.3
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                setOverScrollMode.this.MediaBrowserCompatItemReceiver();
            }
        });
        int i2 = MediaBrowserCompatItemReceiver + 93;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 33;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        getSubjectStat getsubjectstatWrite = AudioAttributesImplBaseParcelizer().write();
        this.RemoteActionCompatParcelizer = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            int i4 = MediaBrowserCompatItemReceiver + 121;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            int i5 = i4 % 2;
            getSubjectStat getsubjectstat = this.RemoteActionCompatParcelizer;
            withFieldVisibility defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
            if (i5 != 0) {
                getsubjectstat.IconCompatParcelizer(defaultViewModelCreationExtras);
            } else {
                getsubjectstat.IconCompatParcelizer(defaultViewModelCreationExtras);
                int i6 = 19 / 0;
            }
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(AudioAttributesImplApi26Parcelizer ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        int i3 = $10 + 111;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i5 = $10 + 117;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i7 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(AudioAttributesImplApi26Parcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 1), TextUtils.getTrimmedLength("") + 12424, Color.alpha(0) + 20, -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.lastIndexOf("", '0') + 1), Color.rgb(0, 0, 0) + 16779084, (-16777206) - Color.rgb(0, 0, 0), 1983509525, false, $$i(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
    }

    private static void a(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int length;
        char[] cArr;
        int i;
        int i2 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = read;
        Object obj = null;
        if (cArr2 != null) {
            int i7 = $11 + 5;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                length = cArr2.length;
                cArr = new char[length];
                i = 1;
            } else {
                length = cArr2.length;
                cArr = new char[length];
                i = 0;
            }
            while (i < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (Process.getGidForName("") + 1), View.MeasureSpec.getMode(0) + 11613, 19 - ImageFormat.getBitsPerPixel(0), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr[i] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i++;
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
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr2, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            int i8 = $11 + 13;
            $10 = i8 % 128;
            int i9 = 2;
            int i10 = i8 % 2;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                int i11 = $10 + 89;
                $11 = i11 % 128;
                int i12 = i11 % i9;
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i13 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    char c2 = cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                    Object[] objArr3 = new Object[i9];
                    objArr3[1] = Integer.valueOf(c);
                    objArr3[0] = Integer.valueOf(c2);
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 22958, (ViewConfiguration.getFadingEdgeLength() >> 16) + 43, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(obj, objArr3)).charValue();
                } else {
                    int i14 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (31588 - ((byte) KeyEvent.getModifierMetaStateMask())), KeyEvent.getDeadChar(0, 0) + 9863, ExpandableListView.getPackedPositionType(0L) + 65, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(obj, objArr4)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 37822), 9754 - (KeyEvent.getMaxKeyCode() >> 16), 27 - View.MeasureSpec.getMode(0), 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                obj = null;
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                i9 = 2;
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i15 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i15, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i15);
        }
        if (z) {
            int i16 = $10 + 125;
            $11 = i16 % 128;
            int i17 = i16 % 2;
            char[] cArr6 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                int i18 = $11 + 11;
                $10 = i18 % 128;
                int i19 = i18 % 2;
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i4 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i20 = $10 + 11;
            $11 = i20 % 128;
            char c3 = 2;
            int i21 = i20 % 2;
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[c3]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                c3 = 2;
            }
        }
        String str = new String(cArr3);
        int i22 = $10 + 87;
        $11 = i22 % 128;
        int i23 = i22 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0076  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r32) {
        /*
            Method dump skipped, instruction units count: 1941
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setOverScrollMode.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 123;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.RemoteActionCompatParcelizer;
        if (getsubjectstat != null) {
            getsubjectstat.AudioAttributesCompatParcelizer();
        }
        int i4 = AudioAttributesImplApi21Parcelizer + 73;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 90 / 0;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 69;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplBaseParcelizer().af_();
        int i4 = AudioAttributesImplApi21Parcelizer + 37;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = AudioAttributesImplApi21Parcelizer + 61;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            return ishighlighted;
        }
        throw null;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        if (this.AudioAttributesCompatParcelizer == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    this.AudioAttributesCompatParcelizer = AudioAttributesImplApi26Parcelizer();
                }
            }
        }
        return this.AudioAttributesCompatParcelizer;
    }

    protected final void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        if (!this.write) {
            int i2 = MediaBrowserCompatItemReceiver + 51;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            this.write = true;
            int i4 = MediaBrowserCompatItemReceiver + 85;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 3 % 4;
            }
        }
        int i6 = AudioAttributesImplApi21Parcelizer + 101;
        MediaBrowserCompatItemReceiver = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 121;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = AudioAttributesImplApi21Parcelizer + 99;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 37 / 0;
        }
        return RemoteActionCompatParcelizer;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = AudioAttributesImplApi21Parcelizer + 89;
            MediaBrowserCompatItemReceiver = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 34, new char[]{2176, 2273, 36960, 43559, 63302, 33648, 25870, 57419, 34947, 51975, 57314, 23606, 55721, 41254, 50842, 46314, 45357, 24145, 44346, 41737, 43622, 30455, 38374, 39541, 33760, 28434, 31876, 62157, 31545, 1090}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(new byte[]{0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1}, new int[]{23, 18, 98, 15}, false, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = MediaBrowserCompatItemReceiver + 43;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            int i5 = i4 % 2;
            if (!(!(baseContext instanceof ContextWrapper)) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i6 = MediaBrowserCompatItemReceiver + 69;
                AudioAttributesImplApi21Parcelizer = i6 % 128;
                if (i6 % 2 == 0) {
                    int i7 = 2 % 3;
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
                    objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf("", "", 0, 0) + 4535), (ViewConfiguration.getFadingEdgeLength() >> 16) + 6054, TextUtils.indexOf((CharSequence) "", '0', 0) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((Process.getThreadPriority(0) + 20) >> 6), 6030 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), Gravity.getAbsoluteGravity(0, 0) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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
        Object obj = null;
        if (baseContext == null) {
            int i2 = MediaBrowserCompatItemReceiver + 29;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 34, new char[]{2176, 2273, 36960, 43559, 63302, 33648, 25870, 57419, 34947, 51975, 57314, 23606, 55721, 41254, 50842, 46314, 45357, 24145, 44346, 41737, 43622, 30455, 38374, 39541, 33760, 28434, 31876, 62157, 31545, 1090}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(new byte[]{0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1}, new int[]{23, 18, 98, 15}, false, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = AudioAttributesImplApi21Parcelizer + 9;
            MediaBrowserCompatItemReceiver = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            int i6 = AudioAttributesImplApi21Parcelizer + 17;
            MediaBrowserCompatItemReceiver = i6 % 128;
            int i7 = i6 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i8 = AudioAttributesImplApi21Parcelizer + 85;
            MediaBrowserCompatItemReceiver = i8 % 128;
            try {
                if (i8 % 2 != 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 4534), (ViewConfiguration.getTouchSlop() >> 8) + 6054, 42 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 6030 - Color.alpha(0), 24 - KeyEvent.keyCodeFromString(""), -861814097, false, "read", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    obj.hashCode();
                    throw null;
                }
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (4535 - TextUtils.getOffsetBefore("", 0)), View.resolveSize(0, 0) + 6054, TextUtils.indexOf("", "") + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0) + 1), View.MeasureSpec.makeMeasureSpec(0, 0) + 6030, (ViewConfiguration.getLongPressTimeout() >> 16) + 24, -861814097, false, "read", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke2, objArr4);
                int i9 = AudioAttributesImplApi21Parcelizer + 39;
                MediaBrowserCompatItemReceiver = i9 % 128;
                if (i9 % 2 != 0) {
                    int i10 = 5 % 2;
                }
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

    /* JADX WARN: Can't wrap try/catch for region: R(38:0|2|(2:4|(2:6|(2:(2:12|(1:18)(1:17))(1:19)|(9:21|269|22|(1:24)|25|26|27|(1:29)|30)(1:34))(0))(2:9|10))(0)|35|(27:274|37|38|(2:40|(3:42|(2:44|49)|48)(3:45|(2:47|49)|48))(1:49)|84|287|85|(1:87)|88|(3:90|(1:92)|93)(18:94|275|95|(1:97)|98|99|267|100|(1:102)|103|104|105|(1:107)|108|(1:110)|111|(1:113)|114)|115|(4:118|(13:293|120|(3:122|(3:125|126|123)|297)|127|288|128|(1:130)|131|132|133|277|134|296)(1:295)|294|116)|292|170|(1:172)|173|(2:175|(4:177|(1:179)|180|181)(3:182|(1:184)|185))(13:187|272|188|189|(1:191)|192|283|193|194|(1:196)|197|(1:199)|200)|186|201|(6:203|204|(1:206)|207|208|209)|210|(1:212)|213|(3:215|(1:217)|218)(14:220|221|(1:223)|224|225|(1:227)|228|290|229|230|(1:232)|233|(1:235)|236)|219|237|(7:239|240|(1:242)|243|244|245|246)(1:298))|265|53|(1:55)|56|281|57|(1:59)|60|61|84|287|85|(0)|88|(0)(0)|115|(1:116)|292|170|(0)|173|(0)(0)|186|201|(0)|210|(0)|213|(0)(0)|219|237|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x08da, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x08db, code lost:
    
        r4 = new java.lang.Object[1];
        a(new byte[]{1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0}, new int[]{com.google.android.exoplayer2.extractor.ts.TsExtractor.TS_PACKET_SIZE, 11, 95, 0}, false, r4);
        r2 = (java.lang.String) r4[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x08f6, code lost:
    
        r3 = new java.io.ByteArrayOutputStream();
        r4 = new java.io.PrintStream(r3);
        r0.printStackTrace(r4);
        r4.close();
        r1 = r3.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x090d, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x0911, code lost:
    
        r3 = new java.util.ArrayList(2);
        r3.add(r1);
        r3.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0920, code lost:
    
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:164:0x0924, code lost:
    
        if (r1 == null) goto L165;
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0926, code lost:
    
        r1 = kotlin.startForeground.read((char) ((android.graphics.PointF.length(com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) > com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 1 : (android.graphics.PointF.length(com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED, com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED) == com.google.android.gms.maps.model.BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 4535), android.text.TextUtils.indexOf("", "", 0) + 6054, (android.view.ViewConfiguration.getLongPressTimeout() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x0952, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:168:0x095e, code lost:
    
        r5 = new java.lang.Object[]{-2109547070, 81604378625L, r3, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r2 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) (android.view.ViewConfiguration.getScrollDefaultDelay() >> 16), (android.view.ViewConfiguration.getFadingEdgeLength() >> 16) + 6030, android.text.TextUtils.getTrimmedLength("") + 24);
        r9 = new java.lang.Object[1];
        d(r3[48], r3[0], (byte) (kotlin.setOverScrollMode.$$g[5] - 1), r9);
        r2.getMethod((java.lang.String) r9[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x09d5, code lost:
    
        r1 = kotlin.setOverScrollMode.MediaBrowserCompatItemReceiver + 9;
        kotlin.setOverScrollMode.AudioAttributesImplApi21Parcelizer = r1 % 128;
        r1 = r1 % 2;
     */
    /* JADX WARN: Removed duplicated region for block: B:118:0x07a9 A[Catch: all -> 0x08da, TryCatch #12 {all -> 0x08da, blocks: (B:85:0x047b, B:87:0x0481, B:88:0x04be, B:90:0x04cb, B:92:0x04d4, B:93:0x051b, B:115:0x079f, B:116:0x07a3, B:118:0x07a9, B:120:0x07be, B:123:0x07cb, B:125:0x07ce, B:132:0x0836, B:138:0x08b4, B:140:0x08ba, B:141:0x08bb, B:143:0x08bd, B:145:0x08c4, B:146:0x08c5, B:94:0x0526, B:105:0x065d, B:107:0x0663, B:108:0x06a8, B:110:0x06fd, B:111:0x0740, B:113:0x0756, B:114:0x0799, B:148:0x08c7, B:150:0x08ce, B:151:0x08cf, B:153:0x08d1, B:155:0x08d8, B:156:0x08d9, B:100:0x05d4, B:102:0x05e7, B:103:0x0651, B:95:0x0589, B:97:0x059d, B:98:0x05cd, B:134:0x083b, B:128:0x07f9, B:130:0x07ff, B:131:0x082f), top: B:287:0x047b, outer: #2, inners: #1, #6, #7, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x09e9  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0a33  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0add  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0d00  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0de3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0e34  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0e8b  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x10f3  */
    /* JADX WARN: Removed duplicated region for block: B:298:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0481 A[Catch: all -> 0x08da, TryCatch #12 {all -> 0x08da, blocks: (B:85:0x047b, B:87:0x0481, B:88:0x04be, B:90:0x04cb, B:92:0x04d4, B:93:0x051b, B:115:0x079f, B:116:0x07a3, B:118:0x07a9, B:120:0x07be, B:123:0x07cb, B:125:0x07ce, B:132:0x0836, B:138:0x08b4, B:140:0x08ba, B:141:0x08bb, B:143:0x08bd, B:145:0x08c4, B:146:0x08c5, B:94:0x0526, B:105:0x065d, B:107:0x0663, B:108:0x06a8, B:110:0x06fd, B:111:0x0740, B:113:0x0756, B:114:0x0799, B:148:0x08c7, B:150:0x08ce, B:151:0x08cf, B:153:0x08d1, B:155:0x08d8, B:156:0x08d9, B:100:0x05d4, B:102:0x05e7, B:103:0x0651, B:95:0x0589, B:97:0x059d, B:98:0x05cd, B:134:0x083b, B:128:0x07f9, B:130:0x07ff, B:131:0x082f), top: B:287:0x047b, outer: #2, inners: #1, #6, #7, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x04cb A[Catch: all -> 0x08da, TryCatch #12 {all -> 0x08da, blocks: (B:85:0x047b, B:87:0x0481, B:88:0x04be, B:90:0x04cb, B:92:0x04d4, B:93:0x051b, B:115:0x079f, B:116:0x07a3, B:118:0x07a9, B:120:0x07be, B:123:0x07cb, B:125:0x07ce, B:132:0x0836, B:138:0x08b4, B:140:0x08ba, B:141:0x08bb, B:143:0x08bd, B:145:0x08c4, B:146:0x08c5, B:94:0x0526, B:105:0x065d, B:107:0x0663, B:108:0x06a8, B:110:0x06fd, B:111:0x0740, B:113:0x0756, B:114:0x0799, B:148:0x08c7, B:150:0x08ce, B:151:0x08cf, B:153:0x08d1, B:155:0x08d8, B:156:0x08d9, B:100:0x05d4, B:102:0x05e7, B:103:0x0651, B:95:0x0589, B:97:0x059d, B:98:0x05cd, B:134:0x083b, B:128:0x07f9, B:130:0x07ff, B:131:0x082f), top: B:287:0x047b, outer: #2, inners: #1, #6, #7, #13 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0526 A[Catch: all -> 0x08da, TRY_LEAVE, TryCatch #12 {all -> 0x08da, blocks: (B:85:0x047b, B:87:0x0481, B:88:0x04be, B:90:0x04cb, B:92:0x04d4, B:93:0x051b, B:115:0x079f, B:116:0x07a3, B:118:0x07a9, B:120:0x07be, B:123:0x07cb, B:125:0x07ce, B:132:0x0836, B:138:0x08b4, B:140:0x08ba, B:141:0x08bb, B:143:0x08bd, B:145:0x08c4, B:146:0x08c5, B:94:0x0526, B:105:0x065d, B:107:0x0663, B:108:0x06a8, B:110:0x06fd, B:111:0x0740, B:113:0x0756, B:114:0x0799, B:148:0x08c7, B:150:0x08ce, B:151:0x08cf, B:153:0x08d1, B:155:0x08d8, B:156:0x08d9, B:100:0x05d4, B:102:0x05e7, B:103:0x0651, B:95:0x0589, B:97:0x059d, B:98:0x05cd, B:134:0x083b, B:128:0x07f9, B:130:0x07ff, B:131:0x082f), top: B:287:0x047b, outer: #2, inners: #1, #6, #7, #13 }] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r33) {
        /*
            Method dump skipped, instruction units count: 5085
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setOverScrollMode.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 35;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
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
