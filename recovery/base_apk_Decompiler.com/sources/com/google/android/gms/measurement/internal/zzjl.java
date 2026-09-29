package com.google.android.gms.measurement.internal;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import java.lang.reflect.Method;
import kotlin.buildSetStopReasonIntent;
import kotlin.startForeground;

/* JADX INFO: loaded from: classes5.dex */
public final class zzjl extends zzan {
    private static int $10 = 0;
    private static int $11 = 1;
    final /* synthetic */ zzjz zza;
    private static final byte[] $$a = {121, 72, 116, 113, 11, 2, -5, 3, 7, -13, 13};
    private static final int $$b = TsExtractor.TS_STREAM_TYPE_AC4;
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    private static char[] AudioAttributesCompatParcelizer = {44984, 45038, 45028, 45015, 45016, 45032, 45039, 45036, 45004, 44806, 44828, 44813, 45045, 44824, 44826, 45049, 44896, 44899, 44905, 44900, 44927, 44920, 44901, 44906, 44873, 44870, 44902, 44899, 44898, 44869, 44867, 44903, 44903, 44909, 45037, 44890, 44892, 44866, 44866, 44869, 44877, 44870, 44878, 44866, 44868, 44877, 44867, 44869, 44892, 44994, 44979, 45025, 45027, 45037, 45032, 45032, 45033, 45025, 45031, 45012, 45036, 45052, 45028, 45029, 45029, 45028, 45025, 45016, 44989, 44997, 45050, 45026, 45005, 44995, 45036, 45030, 44989, 45028, 45030, 45028, 45024, 45032, 45036, 45024, 45028, 45050, 45010, 45008, 45051, 45027, 45025, 45048, 45049, 45030, 45042, 44924, 44914, 44912, 44917, 44913, 44927, 44882, 44893, 44914, 44919, 44682, 44913, 44914, 44682, 44906, 44877, 44898, 44919, 44682, 44913, 44919, 44687, 44962, 45008, 45038, 45027, 45011, 45022, 45036, 45038, 45036, 45037, 45032, 45010, 45032, 45030, 45036, 45037, 45028, 45024};

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    zzjl(zzjz zzjzVar, zzgy zzgyVar) {
        super(zzgyVar);
        this.zza = zzjzVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(short r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 3
            int r9 = 6 - r9
            int r7 = r7 * 5
            int r7 = 119 - r7
            int r8 = r8 + 4
            byte[] r0 = com.google.android.gms.measurement.internal.zzjl.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r9
            r4 = r2
            goto L2f
        L14:
            r3 = r2
        L15:
            r6 = r9
            r9 = r7
            r7 = r6
            int r4 = r3 + 1
            int r7 = r7 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L29
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L29:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2f:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-2)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjl.b(short, byte, int, java.lang.Object[]):void");
    }

    @Override // com.google.android.gms.measurement.internal.zzan
    public final void zzc() {
        int i = 2 % 2;
        int i2 = write + 81;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            this.zza.zzt.zzaA().zzk().zza("Tasks have been queued for a long time");
            return;
        }
        this.zza.zzt.zzaA().zzk().zza("Tasks have been queued for a long time");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void a(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = AudioAttributesCompatParcelizer;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $10 + 95;
                $11 = i8 % 128;
                if (i8 % i == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) KeyEvent.keyCodeFromString(""), 11614 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 20, -1786471333, false, "u", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        i7 %= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i7])};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getOffsetBefore("", 0), 11613 - (ViewConfiguration.getPressedStateDuration() >> 16), 19 - ImageFormat.getBitsPerPixel(0), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i7++;
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
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i9 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), 22959 - View.MeasureSpec.makeMeasureSpec(0, 0), ((Process.getThreadPriority(0) + 20) >> 6) + 43, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                } else {
                    int i10 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr5 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (31589 - KeyEvent.getDeadChar(0, 0)), 9863 - KeyEvent.normalizeMetaState(0), 65 - (ViewConfiguration.getFadingEdgeLength() >> 16), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr6 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (37822 - Color.blue(0)), View.resolveSizeAndState(0, 0, 0) + 9754, 26 - TextUtils.lastIndexOf("", '0', 0), 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i11 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i11, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i11);
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
            int i12 = $10 + 105;
            $11 = i12 % 128;
            int i13 = i12 % 2;
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /*  JADX ERROR: NoSuchElementException in pass: ReplaceNewArray
        java.util.NoSuchElementException
        	at java.base/java.util.TreeMap.key(TreeMap.java:1637)
        	at java.base/java.util.TreeMap.lastKey(TreeMap.java:309)
        	at jadx.core.dex.visitors.ReplaceNewArray.processNewArray(ReplaceNewArray.java:171)
        	at jadx.core.dex.visitors.ReplaceNewArray.processInsn(ReplaceNewArray.java:72)
        	at jadx.core.dex.visitors.ReplaceNewArray.visit(ReplaceNewArray.java:53)
        */
    public static java.lang.Object[] AudioAttributesCompatParcelizer(android.content.Context r34, java.lang.Class r35, int r36, int r37, int r38) {
        /*
            Method dump skipped, instruction units count: 4383
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.measurement.internal.zzjl.AudioAttributesCompatParcelizer(android.content.Context, java.lang.Class, int, int, int):java.lang.Object[]");
    }
}
