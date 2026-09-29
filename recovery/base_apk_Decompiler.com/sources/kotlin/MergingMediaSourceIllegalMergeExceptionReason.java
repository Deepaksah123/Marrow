package kotlin;

import android.graphics.Color;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.bgservices.BaseService;
import com.marrow.bgservices.imageupload.ImageUploadService;
import java.lang.reflect.Method;
import kotlin.getDisplayCues;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public abstract class MergingMediaSourceIllegalMergeExceptionReason<P extends getDisplayCues> extends BaseService<P> implements SubjectStat {
    private static int $10 = 0;
    private static int $11 = 1;
    private volatile GtaResponseBody read;
    private static final byte[] $$m = {104, -54, 119, 45, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -54, 68, 9, 26, -21, 38, 16, -8, 22, -31, 62, -4, 11, 10, 24, -2, 10, -21, 60, 8, -6, 30, 0, 17, 10, -14, 41, -68, 40, 63, -6, 16, 17, -35, 62, 11, 9, 2, 4, 30, 10, -4, 25, -37, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -2, 7, 14};
    private static final int $$n = 173;
    private static final byte[] $$d = {37, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 106, 111, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 168;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;
    private static char[] write = {44984, 45027, 45037, 45024, 45049, 45030, 45038, 45027, 45050, 45035, 44981, 45018, 45051, 44996, 44995, 45036, 45030, 45050, 44946, 44990, 44998, 45032, 45038, 44996, 44998, 45035, 44995, 44987, 44987, 44984, 44984, 44991, 44997, 45038, 44996, 44988, 44990, 44985, 44990, 44988, 44992, 44998, 44996, 45033, 45033, 44998, 44998, 44993, 44987, 44993, 44992, 44995, 44992, 44987, 44994, 44993, 44998, 45039, 45033, 44995, 44985, 44990, 44993, 44992, 44995, 44993, 44993, 44998, 44988, 44988, 44989, 44999, 44995, 44995, 45032, 44992, 44987, 44992, 44999, 44996, 45038, 44998, 44990, 45036, 45038, 45027, 45051, 45028, 45028, 45052, 45034, 45022, 45024, 45031, 45023, 45011, 45027, 45038, 44944, 44985, 44991, 44988, 44988, 44989, 44988, 44990, 44991, 44989, 44985};
    private static char[] IconCompatParcelizer = {6479, 6490, 6839, 6478, 6494, 6471, 6469, 6418, 6466, 6474, 6475, 6476, 6836, 6425, 6407, 6525, 6477, 6406, 6467, 6424, 6416, 6489, 6838, 6428, 6427, 6417, 6522, 6492, 6833, 6431, 6491, 6430, 6468, 6507, 6834, 6481, 6837, 6470, 6465, 6426, 6464, 6832, 6473, 6835, 6488, 6405, 6429, 6523, 6493};
    private static char AudioAttributesImplApi26Parcelizer = 11445;
    private final Object RemoteActionCompatParcelizer = new Object();
    private boolean AudioAttributesCompatParcelizer = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.MergingMediaSourceIllegalMergeExceptionReason.$$d
            int r7 = 114 - r7
            int r1 = 44 - r6
            int r8 = 190 - r8
            byte[] r1 = new byte[r1]
            int r6 = 43 - r6
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            int r8 = r8 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r8 = -r8
            int r7 = r7 + r8
            int r7 = r7 + (-1)
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MergingMediaSourceIllegalMergeExceptionReason.g(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = 114 - r6
            int r8 = r8 * 8
            int r8 = r8 + 4
            int r7 = 90 - r7
            byte[] r0 = kotlin.MergingMediaSourceIllegalMergeExceptionReason.$$m
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L13
            r6 = r7
            r3 = r8
            r4 = r2
            goto L25
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r7]
        L25:
            int r7 = r7 + 1
            int r6 = r6 + r3
            int r6 = r6 + (-11)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MergingMediaSourceIllegalMergeExceptionReason.h(int, byte, short, java.lang.Object[]):void");
    }

    @Override // com.marrow.bgservices.BaseService, android.app.Service
    public void onCreate() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 9;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        read();
        super.onCreate();
        int i4 = AudioAttributesImplBaseParcelizer + 33;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    private GtaResponseBody RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        GtaResponseBody gtaResponseBody = new GtaResponseBody(this);
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 81;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return gtaResponseBody;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private GtaResponseBody write() {
        if (this.read == null) {
            synchronized (this.RemoteActionCompatParcelizer) {
                if (this.read == null) {
                    this.read = RemoteActionCompatParcelizer();
                }
            }
        }
        return this.read;
    }

    private void read() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 75;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        if (this.AudioAttributesCompatParcelizer) {
            return;
        }
        this.AudioAttributesCompatParcelizer = true;
        ((configureRetry) af_()).write((ImageUploadService) getSubmittedOnDate.AudioAttributesCompatParcelizer(this));
        int i4 = AudioAttributesImplBaseParcelizer + 11;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 3 / 5;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 99;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = write().af_();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 29;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private static void e(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = write;
        Object obj = null;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 21;
                $10 = i8 % 128;
                if (i8 % i != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), 11613 - (Process.myTid() >> 22), ((byte) KeyEvent.getModifierMetaStateMask()) + 21, -1786471333, false, "u", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        i7 >>>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr[i7])};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-338863922);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getPressedStateDuration() >> 16), (-16765603) - Color.rgb(0, 0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 20, -1786471333, false, "u", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                        i7++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i = 2;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                int i9 = $10 + 69;
                $11 = i9 % 128;
                if (i9 % 2 != 0 ? bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] != 1 : bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] != 0) {
                    int i10 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    try {
                        Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getTapTimeout() >> 16) + 31589), TextUtils.getOffsetAfter("", 0) + 9863, TextUtils.indexOf("", "") + 65, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(obj, objArr4)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                } else {
                    int i11 = $11 + 49;
                    $10 = i11 % 128;
                    int i12 = i11 % 2;
                    int i13 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr5 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), 22959 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.lastIndexOf("", '0') + 44, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(obj, objArr5)).charValue();
                    int i14 = $11 + 7;
                    $10 = i14 % 128;
                    int i15 = i14 % 2;
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr6 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0) + 37823), 9754 - (Process.myPid() >> 22), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                obj = null;
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i16 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i16, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i16);
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
            int i17 = $10 + 101;
            $11 = i17 % 128;
            char c2 = 2;
            int i18 = i17 % 2;
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[c2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                int i19 = $10 + 43;
                $11 = i19 % 128;
                c2 = 2;
                int i20 = i19 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x012e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(byte r33, int r34, char[] r35, java.lang.Object[] r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 813
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MergingMediaSourceIllegalMergeExceptionReason.f(byte, int, char[], java.lang.Object[]):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x088c A[Catch: all -> 0x0338, TryCatch #16 {all -> 0x0338, blocks: (B:226:0x0ebc, B:228:0x0ec2, B:229:0x0eeb, B:262:0x12fb, B:264:0x1301, B:265:0x1327, B:243:0x108b, B:245:0x10ac, B:246:0x10fc, B:193:0x0ab8, B:195:0x0abe, B:196:0x0aea, B:146:0x0886, B:148:0x088c, B:149:0x08b6, B:26:0x00d3, B:28:0x00d9, B:29:0x0102, B:31:0x02ab, B:33:0x02db, B:34:0x0332), top: B:315:0x00d3 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0b7c  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0bc6  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0c22  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0e9e  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0f81  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0fcb  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x1021  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x12de  */
    /* JADX WARN: Removed duplicated region for block: B:334:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x033c  */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v35 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v4 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v45 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v65 */
    /* JADX WARN: Type inference failed for: r13v66 */
    /* JADX WARN: Type inference failed for: r13v70 */
    /* JADX WARN: Type inference failed for: r13v71 */
    /* JADX WARN: Type inference failed for: r13v72 */
    /* JADX WARN: Type inference failed for: r13v73 */
    /* JADX WARN: Type inference failed for: r13v74 */
    /* JADX WARN: Type inference failed for: r13v75 */
    @Override // com.marrow.bgservices.BaseService, android.app.Service, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5639
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MergingMediaSourceIllegalMergeExceptionReason.attachBaseContext(android.content.Context):void");
    }
}
