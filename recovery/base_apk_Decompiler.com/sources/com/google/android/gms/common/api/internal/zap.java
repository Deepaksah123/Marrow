package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.content.DialogInterface;
import android.content.Intent;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.buildSetStopReasonIntent;
import kotlin.setBackInvokedCallbackEnabled;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class zap extends LifecycleCallback implements DialogInterface.OnCancelListener {
    private static int $10 = 0;
    private static int $11 = 1;
    protected volatile boolean zaa;
    protected final AtomicReference zab;
    protected final GoogleApiAvailability zac;
    private final Handler zad;
    private static final byte[] $$j = {59, 77, -89, -73, 58, -30, -58, 2, 24, -35, 4, -31, 13, -20, 34, -43, -10, -3, 34, -51, -5, -10, -6, -6, 2, -16, -13, 33, -36, -17, -8, 8, -16, 2, -20, 38, -58, -3, 8, -20, -3, 6, -18, 18, -45, 4, -13, 5, -4, -22, 4, -1, 16, -28, -19, 4, -9, -4, 40, -33, -19, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20, -26, -15, -9, -12, 8, 29, -41, -24, 4, -13, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20};
    private static final int $$k = 186;
    private static final byte[] $$d = {57, 34, -8, 64, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 165;
    private static int RemoteActionCompatParcelizer = 0;
    private static int read = 1;
    private static char[] IconCompatParcelizer = {44893, 44856, 44897, 44920, 44911, 44922, 44856, 44911, 44912, 44911, 44900, 44923, 44899, 44914, 44925, 44919, 44986, 45022, 45034, 45052, 45028, 45028, 45051, 45027, 45038, 45036, 45037, 45038, 45027, 45011, 45023, 45031, 44865, 44868, 44874, 44864, 44855, 44877, 44853, 44865, 44866, 44821, 44867, 44875, 44890, 44869, 44895, 44837, 44800, 44869, 44865, 44800, 44874, 44879, 44984, 45026, 45036, 45026, 45051, 45030, 45038, 45009, 45009, 45033, 45036, 45050, 45028, 45025, 45027};

    zap(LifecycleFragment lifecycleFragment, GoogleApiAvailability googleApiAvailability) {
        super(lifecycleFragment);
        this.zab = new AtomicReference(null);
        this.zad = new com.google.android.gms.internal.base.zau(Looper.getMainLooper());
        this.zac = googleApiAvailability;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.common.api.internal.zap.$$d
            int r7 = r7 * 12
            int r7 = 77 - r7
            int r6 = r6 * 10
            int r1 = r6 + 34
            int r8 = r8 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 33
            r2 = 0
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2f
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r8]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2f:
            int r8 = r8 + r7
            int r7 = r8 + (-1)
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zap.d(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void f(byte r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.gms.common.api.internal.zap.$$j
            int r7 = r7 * 4
            int r7 = r7 + 20
            int r8 = 77 - r8
            int r9 = 111 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r7
            r5 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L29:
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + (-7)
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zap.f(byte, byte, int, java.lang.Object[]):void");
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        int i = 2 % 2;
        Object obj = null;
        zaa(new ConnectionResult(13, null), zae((zam) this.zab.get()));
        int i2 = RemoteActionCompatParcelizer + 91;
        read = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    protected abstract void zab(ConnectionResult connectionResult, int i);

    protected abstract void zac();

    private final void zaa(ConnectionResult connectionResult, int i) {
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 107;
        read = i3 % 128;
        int i4 = i3 % 2;
        this.zab.set(null);
        zab(connectionResult, i);
        int i5 = RemoteActionCompatParcelizer + 37;
        read = i5 % 128;
        int i6 = i5 % 2;
    }

    private final void zad() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 89;
        read = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            this.zab.set(null);
            zac();
            obj.hashCode();
            throw null;
        }
        this.zab.set(null);
        zac();
        int i3 = RemoteActionCompatParcelizer + 77;
        read = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        zam zamVar = (zam) this.zab.get();
        if (i != 1) {
            int i4 = read + 95;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            if (i == 2) {
                int iIsGooglePlayServicesAvailable = this.zac.isGooglePlayServicesAvailable(getActivity());
                if (iIsGooglePlayServicesAvailable == 0) {
                    zad();
                    return;
                }
                if (zamVar == null) {
                    return;
                }
                int i6 = RemoteActionCompatParcelizer + 75;
                read = i6 % 128;
                if (i6 % 2 != 0 ? zamVar.zab().getErrorCode() == 18 : zamVar.zab().getErrorCode() == 71) {
                    if (iIsGooglePlayServicesAvailable == 18) {
                        return;
                    }
                }
            }
        } else {
            if (i2 == -1) {
                zad();
                return;
            }
            if (i2 == 0) {
                int i7 = read + 49;
                int i8 = i7 % 128;
                RemoteActionCompatParcelizer = i8;
                int i9 = i7 % 2;
                if (zamVar != null) {
                    int intExtra = 13;
                    if (intent != null) {
                        int i10 = i8 + 31;
                        read = i10 % 128;
                        int i11 = i10 % 2;
                        intExtra = intent.getIntExtra("<<ResolutionFailureErrorDetail>>", 13);
                    }
                    zaa(new ConnectionResult(intExtra, null, zamVar.zab().toString()), zae(zamVar));
                    return;
                }
                return;
            }
        }
        if (zamVar != null) {
            zaa(zamVar.zab(), zamVar.zaa());
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStart() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        read = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        this.zaa = true;
        int i4 = read + 13;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public void onStop() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 29;
        read = i2 % 128;
        int i3 = i2 % 2;
        super.onStop();
        this.zaa = i3 == 0;
        int i4 = read + 105;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void zah(ConnectionResult connectionResult, int i) {
        AtomicReference atomicReference;
        int i2 = 2 % 2;
        zam zamVar = new zam(connectionResult, i);
        do {
            atomicReference = this.zab;
            if (setBackInvokedCallbackEnabled.read(atomicReference, null, zamVar)) {
                this.zad.post(new zao(this, zamVar));
                int i3 = RemoteActionCompatParcelizer + 85;
                read = i3 % 128;
                if (i3 % 2 == 0) {
                    int i4 = 9 / 0;
                    return;
                }
                return;
            }
        } while (atomicReference.get() == null);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 73;
        read = i2 % 128;
        int i3 = i2 % 2;
        super.onSaveInstanceState(bundle);
        zam zamVar = (zam) this.zab.get();
        if (zamVar != null) {
            bundle.putBoolean("resolving_error", true);
            bundle.putInt("failed_client_id", zamVar.zaa());
            bundle.putInt("failed_status", zamVar.zab().getErrorCode());
            bundle.putParcelable("failed_resolution", zamVar.zab().getResolution());
            return;
        }
        int i4 = read + 105;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        char c;
        char c2;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 13183);
            int packedPositionChild = 1648 - ExpandableListView.getPackedPositionChild(0L);
            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 26;
            byte[] bArr = $$d;
            Object[] objArr2 = new Object[1];
            d(bArr[53], bArr[5], bArr[17], objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(packedPositionGroup, packedPositionChild, doubleTapTimeout, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char edgeSlop = (char) (13183 - (ViewConfiguration.getEdgeSlop() >> 16));
                int iMyTid = 1649 - (Process.myTid() >> 22);
                int i2 = 27 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                byte[] bArr2 = $$d;
                byte b = bArr2[5];
                byte b2 = bArr2[53];
                byte b3 = (byte) (-bArr2[65]);
                Object[] objArr3 = new Object[1];
                d(b, b2, b3, objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(edgeSlop, iMyTid, i2, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            c2 = 3;
            c = 2;
        } else {
            Object[] objArr4 = new Object[1];
            e(true, null, new int[]{0, 16, 132, 11}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            e(true, new byte[]{1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1}, new int[]{16, 16, 0, 10}, objArr5);
            try {
                Object[] objArr6 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue()), 0, -1906692378};
                byte[] bArr3 = $$j;
                Object[] objArr7 = new Object[1];
                f((byte) (-bArr3[56]), (byte) 74, (byte) (bArr3[51] + 1), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                f((byte) (bArr3[51] + 1), (byte) (-bArr3[54]), bArr3[35], objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cIndexOf = (char) (13183 - TextUtils.indexOf("", "", 0, 0));
                    int i3 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1648;
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 26;
                    Object[] objArr9 = new Object[1];
                    d(r5[5], r5[53], (byte) (-$$d[65]), objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(cIndexOf, i3, scrollBarFadeDuration, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    e(true, null, new int[]{32, 22, 92, 5}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    e(false, new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, new int[]{54, 15, 0, 0}, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char cNormalizeMetaState = (char) (13183 - KeyEvent.normalizeMetaState(0));
                        int scrollBarFadeDuration2 = 1649 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        int packedPositionGroup2 = 26 - ExpandableListView.getPackedPositionGroup(0L);
                        byte[] bArr4 = $$d;
                        byte b4 = bArr4[5];
                        byte b5 = bArr4[53];
                        Object[] objArr12 = new Object[1];
                        d(b4, b5, (byte) (b5 | 74), objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(cNormalizeMetaState, scrollBarFadeDuration2, packedPositionGroup2, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char pressedStateDuration = (char) (13183 - (ViewConfiguration.getPressedStateDuration() >> 16));
                        int i4 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1649;
                        int touchSlop = 26 - (ViewConfiguration.getTouchSlop() >> 8);
                        byte[] bArr5 = $$d;
                        Object[] objArr13 = new Object[1];
                        d(bArr5[53], bArr5[5], bArr5[17], objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(pressedStateDuration, i4, touchSlop, -133433128, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf2);
                    int i5 = RemoteActionCompatParcelizer + 41;
                    read = i5 % 128;
                    c = 2;
                    int i6 = i5 % 2;
                    c2 = 3;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i7 = ((int[]) objArr[c2])[0];
        int i8 = ((int[]) objArr[c])[0];
        if (i8 != i7) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i8 ^ i7)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (4535 - TextUtils.indexOf("", "")), 6054 - View.MeasureSpec.getSize(0), 'Z' - AndroidCharacter.getMirror('0'), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i9 = read + 29;
                RemoteActionCompatParcelizer = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr14 = {-1443438569, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) TextUtils.getCapsMode("", 0, 0), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6029, 25 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)));
                    byte b6 = $$j[7];
                    Object[] objArr15 = new Object[1];
                    f(b6, (byte) (b6 - 2), r3[68], objArr15);
                    cls4.getMethod((String) objArr15[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr14);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        if (bundle != null) {
            int i11 = RemoteActionCompatParcelizer + 61;
            read = i11 % 128;
            int i12 = i11 % 2;
            this.zab.set(bundle.getBoolean("resolving_error", false) ? new zam(new ConnectionResult(bundle.getInt("failed_status"), (PendingIntent) bundle.getParcelable("failed_resolution")), bundle.getInt("failed_client_id", -1)) : null);
        }
        int i13 = read + 25;
        RemoteActionCompatParcelizer = i13 % 128;
        int i14 = i13 % 2;
    }

    private static void e(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i;
        char[] cArr;
        int i2 = 2;
        int i3 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr2 = IconCompatParcelizer;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $11 + 53;
                $10 = i9 % 128;
                if (i9 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i8])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.indexOf("", "", 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 11613, 20 - ExpandableListView.getPackedPositionType(0L), -1786471333, false, "u", new Class[]{Integer.TYPE});
                        }
                        cArr3[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        i8 >>>= 1;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i8])};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.getDeadChar(0, 0), 11613 - KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getScrollBarSize() >> 8) + 20, -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr3[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i8++;
                }
                int i10 = $11 + 31;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    int i11 = 4 / 2;
                }
                i2 = 2;
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i5];
        System.arraycopy(cArr2, i4, cArr4, 0, i5);
        if (bArr != null) {
            char[] cArr5 = new char[i5];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i12 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) TextUtils.indexOf("", "", 0, 0), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22959, AndroidCharacter.getMirror('0') - 5, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i12] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                } else {
                    int i13 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr5 = {Integer.valueOf(cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (31590 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (ViewConfiguration.getLongPressTimeout() >> 16) + 9863, 'q' - AndroidCharacter.getMirror('0'), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i13] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                }
                c = cArr5[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr6 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (37822 - (ViewConfiguration.getFadingEdgeLength() >> 16)), View.MeasureSpec.getMode(0) + 9754, 27 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            }
            cArr4 = cArr5;
        }
        if (i7 > 0) {
            char[] cArr6 = new char[i5];
            System.arraycopy(cArr4, 0, cArr6, 0, i5);
            int i14 = i5 - i7;
            System.arraycopy(cArr6, 0, cArr4, i14, i7);
            System.arraycopy(cArr6, i7, cArr4, 0, i14);
        }
        if (z) {
            int i15 = $11 + 27;
            $10 = i15 % 128;
            if (i15 % 2 != 0) {
                cArr = new char[i5];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 1;
            } else {
                cArr = new char[i5];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            }
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                cArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr4[(i5 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr4 = cArr;
        }
        if (i6 > 0) {
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                int i16 = $10 + 19;
                $11 = i16 % 128;
                if (i16 % 2 == 0) {
                    cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] % iArr[3]);
                    i = buildsetstopreasonintent.RemoteActionCompatParcelizer - 1;
                } else {
                    cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                    i = buildsetstopreasonintent.RemoteActionCompatParcelizer + 1;
                }
                buildsetstopreasonintent.RemoteActionCompatParcelizer = i;
            }
        }
        objArr[0] = new String(cArr4);
    }

    private static final int zae(zam zamVar) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 85;
        int i3 = i2 % 128;
        read = i3;
        int i4 = i2 % 2;
        if (zamVar != null) {
            return zamVar.zaa();
        }
        int i5 = i3 + 93;
        RemoteActionCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return -1;
    }

    static /* synthetic */ void zaf(zap zapVar, ConnectionResult connectionResult, int i) {
        int i2 = 2 % 2;
        int i3 = read + 77;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        zapVar.zaa(connectionResult, i);
        int i5 = read + 17;
        RemoteActionCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    static /* synthetic */ void zag(zap zapVar) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        read = i2 % 128;
        int i3 = i2 % 2;
        zapVar.zad();
        if (i3 == 0) {
            throw null;
        }
        int i4 = read + 113;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }
}
