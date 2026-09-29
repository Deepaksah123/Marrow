package com.google.android.gms.maps.internal;

import android.graphics.Color;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final class zzj extends com.google.android.gms.internal.maps.zza implements IMapFragmentDelegate {
    private static final byte[] $$c = {3, -120, 17, 23};
    private static final int $$f = 99;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {121, 72, 116, 113, -61, 61, 2, 19, -44, TarConstants.LF_DIR, 1, -13, 23, -7, 10, 3, -29, 32, 7, 4, 1, 14, 30, 16, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, 23, 12, 6, 9, -11, -32, 38, 21, -7, 10, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17};
    private static final int $$e = 211;
    private static final byte[] $$a = {TarConstants.LF_CHR, -23, 108, 101, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 118;
    private static int write = 0;
    private static int AudioAttributesCompatParcelizer = 1;
    private static char[] IconCompatParcelizer = {3044, 62338, 64290, 58024, 59924, 53699, 55649, 49435, 51329, 45173, 49055, 42840, 44769, 38515, 40477, 34176, 16385, 47201, 45271, 43329, 41384, 39456, 37522, 35562, 33608, 64476, 62553, 60591, 58679, 56718, 54778, 52846, 18078, 48892, 46657, 45002, 42788, 40119, 37909, 35882, 34296, 64857, 62099, 59907, 58266, 56069, 54141, 51449, 49218, 14721, 12601, 13959, 11800, 9829, 56425, 9229, 11447, 13627, 15819, 1608, 3814, 5797, 7937, 26552, 26658, 28887, 31097, 16872, 18847};
    private static long RemoteActionCompatParcelizer = -4769848617573145503L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r6, short r7, byte r8) {
        /*
            int r6 = r6 * 3
            int r6 = 101 - r6
            int r7 = r7 * 4
            int r0 = r7 + 1
            byte[] r1 = com.google.android.gms.maps.internal.zzj.$$c
            int r8 = r8 * 3
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L25:
            r3 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L2a:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzj.$$g(short, short, byte):java.lang.String");
    }

    zzj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.gms.maps.internal.zzj.$$a
            int r8 = r8 * 10
            int r8 = r8 + 34
            int r9 = r9 * 12
            int r9 = 77 - r9
            int r7 = r7 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r4 = r2
            r9 = r7
            goto L2d
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzj.a(short, int, byte, java.lang.Object[]):void");
    }

    private static void c(short s, byte b, byte b2, Object[] objArr) {
        int i = 111 - b2;
        byte[] bArr = $$d;
        int i2 = 40 - b;
        byte[] bArr2 = new byte[s + 19];
        int i3 = s + 18;
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i = (i + i2) - 4;
            i2 = i2;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i;
            if (i5 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            int i6 = i2 + 1;
            i4 = i5;
            i = (i + bArr[i6]) - 4;
            i2 = i6;
        }
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final IGoogleMapDelegate getMap() throws RemoteException {
        IGoogleMapDelegate zzgVar;
        IGoogleMapDelegate iGoogleMapDelegate;
        int i = 2 % 2;
        Parcel parcelZza = zza(1, zza());
        IBinder strongBinder = parcelZza.readStrongBinder();
        if (strongBinder == null) {
            int i2 = write + 63;
            AudioAttributesCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            iGoogleMapDelegate = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
            if (!(!(iInterfaceQueryLocalInterface instanceof IGoogleMapDelegate))) {
                int i4 = write;
                int i5 = i4 + 23;
                AudioAttributesCompatParcelizer = i5 % 128;
                int i6 = i5 % 2;
                zzgVar = (IGoogleMapDelegate) iInterfaceQueryLocalInterface;
                int i7 = i4 + 75;
                AudioAttributesCompatParcelizer = i7 % 128;
                int i8 = i7 % 2;
            } else {
                zzgVar = new zzg(strongBinder);
            }
            iGoogleMapDelegate = zzgVar;
        }
        parcelZza.recycle();
        int i9 = AudioAttributesCompatParcelizer + 107;
        write = i9 % 128;
        int i10 = i9 % 2;
        return iGoogleMapDelegate;
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onInflate(IObjectWrapper iObjectWrapper, GoogleMapOptions googleMapOptions, Bundle bundle) throws RemoteException {
        int i = 2 % 2;
        int i2 = write + 57;
        AudioAttributesCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            Parcel parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, googleMapOptions);
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, bundle);
            zzb(3, parcelZza);
            return;
        }
        Parcel parcelZza2 = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza2, iObjectWrapper);
        com.google.android.gms.internal.maps.zzc.zza(parcelZza2, googleMapOptions);
        com.google.android.gms.internal.maps.zzc.zza(parcelZza2, bundle);
        zzb(2, parcelZza2);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(char r29, int r30, int r31, java.lang.Object[] r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 498
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzj.b(char, int, int, java.lang.Object[]):void");
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char packedPositionChild = (char) (13182 - ExpandableListView.getPackedPositionChild(0L));
            int mode = View.MeasureSpec.getMode(0) + 1649;
            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 26;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[53], bArr[17], bArr[5], objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(packedPositionChild, mode, offsetBefore, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            int i2 = AudioAttributesCompatParcelizer + 31;
            write = i2 % 128;
            int i3 = i2 % 2;
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char c2 = (char) (13183 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 1649;
                int iRed = Color.red(0) + 26;
                byte[] bArr2 = $$a;
                Object[] objArr3 = new Object[1];
                a(bArr2[65], bArr2[5], bArr2[17], objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(c2, packedPositionGroup, iRed, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            int i4 = write + 107;
            AudioAttributesCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            c = 3;
        } else {
            Object[] objArr4 = new Object[1];
            b((char) (View.getDefaultSize(0, 0) + 55170), Color.blue(0), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 16, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b((char) (Process.getGidForName("") + 40037), 16 - TextUtils.getCapsMode("", 0, 0), 16 - Gravity.getAbsoluteGravity(0, 0), objArr5);
            try {
                Object[] objArr6 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue()), 0, -312227759};
                byte b = $$d[10];
                byte b2 = (byte) (b - 1);
                Object[] objArr7 = new Object[1];
                c(b2, (byte) (b2 | 37), (byte) (b - 1), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                c(r2[10], r2[7], r2[47], objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char maxKeyCode = (char) (13183 - (KeyEvent.getMaxKeyCode() >> 16));
                    int iIndexOf = TextUtils.indexOf("", "") + 1649;
                    int iMyPid = 26 - (Process.myPid() >> 22);
                    byte[] bArr3 = $$a;
                    Object[] objArr9 = new Object[1];
                    a(bArr3[65], bArr3[5], bArr3[17], objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(maxKeyCode, iIndexOf, iMyPid, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b((char) (View.MeasureSpec.getSize(0) + 39667), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 31, 22 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), 54 - KeyEvent.normalizeMetaState(0), TextUtils.indexOf((CharSequence) "", '0', 0) + 16, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 13183);
                        int iRed2 = 1649 - Color.red(0);
                        int iMyPid2 = (Process.myPid() >> 22) + 26;
                        byte[] bArr4 = $$a;
                        Object[] objArr12 = new Object[1];
                        a((byte) 75, bArr4[5], bArr4[17], objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(cNormalizeMetaState, iRed2, iMyPid2, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char c3 = (char) (13184 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1649;
                        int iLastIndexOf = 25 - TextUtils.lastIndexOf("", '0', 0);
                        byte[] bArr5 = $$a;
                        Object[] objArr13 = new Object[1];
                        a(bArr5[53], bArr5[17], bArr5[5], objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(c3, absoluteGravity, iLastIndexOf, -133433128, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf2);
                    int i6 = write + 49;
                    AudioAttributesCompatParcelizer = i6 % 128;
                    int i7 = i6 % 2;
                    c = 3;
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
        int i8 = ((int[]) objArr[c])[0];
        int i9 = ((int[]) objArr[2])[0];
        if (i9 != i8) {
            long j = -1;
            long j2 = ((long) (i9 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (4534 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getWindowTouchSlop() >> 8) + 6054, 43 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i10 = write + 23;
                AudioAttributesCompatParcelizer = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Object[] objArr14 = {76846329, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 1), KeyEvent.getDeadChar(0, 0) + 6030, (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24);
                    byte[] bArr6 = $$d;
                    Object[] objArr15 = new Object[1];
                    c(bArr6[44], (byte) (bArr6[10] - 1), (byte) (-bArr6[16]), objArr15);
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
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, bundle);
        zzb(3, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final IObjectWrapper onCreateView(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle) throws RemoteException {
        Parcel parcelZza;
        IBinder strongBinder;
        int i = 2 % 2;
        int i2 = write + 87;
        AudioAttributesCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            Parcel parcelZza2 = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza2, iObjectWrapper);
            com.google.android.gms.internal.maps.zzc.zza(parcelZza2, iObjectWrapper2);
            com.google.android.gms.internal.maps.zzc.zza(parcelZza2, bundle);
            parcelZza = zza(4, parcelZza2);
            strongBinder = parcelZza.readStrongBinder();
        } else {
            Parcel parcelZza3 = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza3, iObjectWrapper);
            com.google.android.gms.internal.maps.zzc.zza(parcelZza3, iObjectWrapper2);
            com.google.android.gms.internal.maps.zzc.zza(parcelZza3, bundle);
            parcelZza = zza(4, parcelZza3);
            strongBinder = parcelZza.readStrongBinder();
        }
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(strongBinder);
        parcelZza.recycle();
        int i3 = write + 75;
        AudioAttributesCompatParcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 81 / 0;
        }
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onResume() throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 79;
        AudioAttributesCompatParcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            i = 3;
        } else {
            parcelZza = zza();
            i = 5;
        }
        zzb(i, parcelZza);
        int i4 = write + 105;
        AudioAttributesCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onPause() throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = AudioAttributesCompatParcelizer + 93;
        write = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            i = 118;
        } else {
            parcelZza = zza();
            i = 6;
        }
        zzb(i, parcelZza);
        int i4 = AudioAttributesCompatParcelizer + 121;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onDestroyView() throws RemoteException {
        int i = 2 % 2;
        int i2 = write + 71;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zzb(7, zza());
        int i4 = AudioAttributesCompatParcelizer + 109;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onDestroy() throws RemoteException {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 67;
        write = i2 % 128;
        int i3 = i2 % 2;
        zzb(8, zza());
        int i4 = AudioAttributesCompatParcelizer + 53;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onLowMemory() throws RemoteException {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 49;
        write = i2 % 128;
        int i3 = i2 % 2;
        zzb(9, zza());
        int i4 = AudioAttributesCompatParcelizer + 99;
        write = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        int i = 2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, bundle);
        Parcel parcelZza2 = zza(10, parcelZza);
        if (parcelZza2.readInt() != 0) {
            bundle.readFromParcel(parcelZza2);
            int i2 = AudioAttributesCompatParcelizer + 9;
            write = i2 % 128;
            int i3 = i2 % 2;
        }
        parcelZza2.recycle();
        int i4 = write + 21;
        AudioAttributesCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final boolean isReady() throws RemoteException {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 97;
        write = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza(11, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        int i4 = write + 85;
        AudioAttributesCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 1 / 0;
        }
        return zZza;
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void getMapAsync(zzap zzapVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = AudioAttributesCompatParcelizer + 31;
        write = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzapVar);
            i = 73;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzapVar);
            i = 12;
        }
        zzb(i, parcelZza);
        int i4 = AudioAttributesCompatParcelizer + 93;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onEnterAmbient(Bundle bundle) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = AudioAttributesCompatParcelizer + 79;
        write = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, bundle);
            i = 26;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, bundle);
            i = 13;
        }
        zzb(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onExitAmbient() throws RemoteException {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 117;
        write = i2 % 128;
        int i3 = i2 % 2;
        zzb(14, zza());
        int i4 = AudioAttributesCompatParcelizer + 35;
        write = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onStart() throws RemoteException {
        int i = 2 % 2;
        int i2 = write + 35;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zzb(15, zza());
        int i4 = AudioAttributesCompatParcelizer + 13;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IMapFragmentDelegate
    public final void onStop() throws RemoteException {
        int i = 2 % 2;
        int i2 = write + 25;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zzb(16, zza());
        int i4 = AudioAttributesCompatParcelizer + 113;
        write = i4 % 128;
        int i5 = i4 % 2;
    }
}
