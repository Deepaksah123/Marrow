package com.google.android.gms.maps.internal;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final class zzbw extends com.google.android.gms.internal.maps.zza implements IStreetViewPanoramaViewDelegate {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {122, -64, TarConstants.LF_SYMLINK, -113, TarConstants.LF_CONTIG, -41, -34, -9, -15, -2, 20, -54, 1, -11, -8, 3, -29, -5, -11, -20, 19, -29, -19, 0, -11, -23, 3, -23, 37, -54, 1, -11, -8, 12, -30, -33, 24, -21, -21, -19, 6, -24, 3, -6, -13, -29, -18, -12, -15, 5, 26, -44, -27, 1, -16, -9, 33, -54, -8, -13, 5, -29, 26, -27, -27, 5, -12, -17, -7, -27, 11, -23};
    private static final int $$e = 151;
    private static final byte[] $$a = {69, 85, TarConstants.LF_DIR, TarConstants.LF_LINK, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 95;
    private static int write = 0;
    private static int IconCompatParcelizer = 1;
    private static char[] read = {6471, 6522, 6475, 6491, 6469, 6406, 6473, 6467, 6470, 6496, 6479, 6465, 6523, 6476, 6477, 6474, 6481, 6490, 6464, 6468, 6488, 6466, 6494, 6492, 6507};
    private static char AudioAttributesCompatParcelizer = 11447;

    zzbw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r7 = r7 * 12
            int r7 = r7 + 65
            byte[] r0 = com.google.android.gms.maps.internal.zzbw.$$a
            int r6 = r6 * 10
            int r6 = 44 - r6
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L29
        L15:
            r3 = r2
        L16:
            int r8 = r8 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r8]
        L29:
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzbw.a(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r5 = r5 + 4
            int r6 = r6 + 4
            byte[] r0 = com.google.android.gms.maps.internal.zzbw.$$d
            int r7 = 114 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L10
            r4 = r6
            r3 = r2
            goto L24
        L10:
            r3 = r2
        L11:
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r5]
        L24:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-10)
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzbw.c(byte, short, byte, java.lang.Object[]):void");
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final IStreetViewPanoramaDelegate getStreetViewPanorama() throws RemoteException {
        IStreetViewPanoramaDelegate zzbuVar;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 33;
        write = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza(1, zza());
        IBinder strongBinder = parcelZza.readStrongBinder();
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (iInterfaceQueryLocalInterface instanceof IStreetViewPanoramaDelegate) {
                zzbuVar = (IStreetViewPanoramaDelegate) iInterfaceQueryLocalInterface;
            } else {
                zzbuVar = new zzbu(strongBinder);
            }
        } else {
            int i4 = write + 9;
            IconCompatParcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 5 / 5;
            }
            zzbuVar = null;
        }
        parcelZza.recycle();
        return zzbuVar;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char c = (char) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13183);
            int capsMode = TextUtils.getCapsMode("", 0, 0) + 1649;
            int maximumDrawingCacheSize = 26 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[5], bArr[53], bArr[17], objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(c, capsMode, maximumDrawingCacheSize, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char cMyPid = (char) (13183 - (Process.myPid() >> 22));
                int minimumFlingVelocity = 1649 - (ViewConfiguration.getMinimumFlingVelocity() >> 16);
                int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 26;
                Object[] objArr3 = new Object[1];
                a(r1[53], r1[5], (byte) (-$$a[65]), objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(cMyPid, minimumFlingVelocity, maximumDrawingCacheSize2, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
        } else {
            Object[] objArr4 = new Object[1];
            b(Gravity.getAbsoluteGravity(0, 0) + 16, new char[]{1, 11, 21, 7, '\t', 15, 7, '\t', 15, '\n', 11, 17, '\b', 3, 19, '\t'}, (byte) (110 - TextUtils.lastIndexOf("", '0', 0)), objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(ExpandableListView.getPackedPositionGroup(0L) + 16, new char[]{'\f', 14, '\r', '\t', 21, '\r', 21, 18, 5, 7, '\b', 23, 20, 4, 14, '\n'}, (byte) (50 - ((Process.getThreadPriority(0) + 20) >> 6)), objArr5);
            try {
                Object[] objArr6 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue()), 0, 869442250};
                byte[] bArr2 = $$d;
                byte b = (byte) (-bArr2[12]);
                Object[] objArr7 = new Object[1];
                c(b, (byte) (b & 35), bArr2[15], objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                byte b2 = bArr2[28];
                byte b3 = bArr2[23];
                Object[] objArr8 = new Object[1];
                c(b2, b3, b3, objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 13183);
                    int i2 = 1649 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    int i3 = 27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    Object[] objArr9 = new Object[1];
                    a(r11[53], r11[5], (byte) (-$$a[65]), objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(pressedStateDuration, i2, i3, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b(Color.argb(0, 0, 0, 0) + 22, new char[]{7, '\t', '\f', 18, 1, '\n', '\n', '\b', 1, 4, 7, '\n', 18, 1, 24, '\r', '\t', 4, 15, 4, 7, '\f'}, (byte) (46 - Process.getGidForName("")), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 14, new char[]{19, 24, 5, 21, 4, '\r', 11, 3, 11, '\t', 18, 24, 14, 1, 13916}, (byte) (TextUtils.getOffsetAfter("", 0) + 93), objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char mode = (char) (13183 - View.MeasureSpec.getMode(0));
                        int iLastIndexOf = 1648 - TextUtils.lastIndexOf("", '0', 0);
                        int iLastIndexOf2 = 25 - TextUtils.lastIndexOf("", '0', 0, 0);
                        byte[] bArr3 = $$a;
                        byte b4 = bArr3[53];
                        byte b5 = bArr3[5];
                        Object[] objArr12 = new Object[1];
                        a(b4, b5, (byte) (b5 | TarConstants.LF_GNUTYPE_LONGLINK), objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(mode, iLastIndexOf, iLastIndexOf2, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char defaultSize = (char) (13183 - View.getDefaultSize(0, 0));
                        int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 1649;
                        int i4 = (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 26;
                        byte[] bArr4 = $$a;
                        Object[] objArr13 = new Object[1];
                        a(bArr4[5], bArr4[53], bArr4[17], objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(defaultSize, iIndexOf, i4, -133433128, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf2);
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
        int i5 = ((int[]) objArr[3])[0];
        int i6 = ((int[]) objArr[2])[0];
        if (i6 == i5) {
            int i7 = write + 29;
            IconCompatParcelizer = i7 % 128;
            int i8 = i7 % 2;
        } else {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i5 ^ i6)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (4534 - TextUtils.lastIndexOf("", '0')), (-16771162) - Color.rgb(0, 0, 0), 41 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i9 = write + 77;
                IconCompatParcelizer = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr14 = {945004114, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) KeyEvent.getDeadChar(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 6031, AndroidCharacter.getMirror('0') - 24);
                    Object[] objArr15 = new Object[1];
                    c((byte) 40, r3[36], (byte) ($$d[56] - 1), objArr15);
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
        zzb(2, parcelZza);
        int i11 = IconCompatParcelizer + 61;
        write = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onResume() throws RemoteException {
        int i = 2 % 2;
        int i2 = write + 111;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zzb(3, zza());
        int i4 = IconCompatParcelizer + 119;
        write = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 1 / 0;
        }
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onPause() throws RemoteException {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 15;
        write = i2 % 128;
        if (i2 % 2 != 0) {
            zzb(2, zza());
        } else {
            zzb(4, zza());
        }
        int i3 = IconCompatParcelizer + 111;
        write = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onDestroy() throws RemoteException {
        int i = 2 % 2;
        int i2 = write + 87;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zzb(5, zza());
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onLowMemory() throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = IconCompatParcelizer + 85;
        write = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            i = 106;
        } else {
            parcelZza = zza();
            i = 6;
        }
        zzb(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onSaveInstanceState(Bundle bundle) throws RemoteException {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 105;
        write = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, bundle);
        Parcel parcelZza2 = zza(7, parcelZza);
        if (parcelZza2.readInt() != 0) {
            int i4 = write + 29;
            IconCompatParcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                bundle.readFromParcel(parcelZza2);
                int i5 = 99 / 0;
            } else {
                bundle.readFromParcel(parcelZza2);
            }
        }
        parcelZza2.recycle();
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final IObjectWrapper getView() throws RemoteException {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 99;
        write = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza(8, zza());
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZza.readStrongBinder());
        parcelZza.recycle();
        int i4 = IconCompatParcelizer + 123;
        write = i4 % 128;
        int i5 = i4 % 2;
        return iObjectWrapperAsInterface;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void getStreetViewPanoramaAsync(zzbp zzbpVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 29;
        IconCompatParcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzbpVar);
            i = 16;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzbpVar);
            i = 9;
        }
        zzb(i, parcelZza);
        int i4 = IconCompatParcelizer + 99;
        write = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 6 / 0;
        }
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onStart() throws RemoteException {
        int i = 2 % 2;
        int i2 = write + 81;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zzb(10, zza());
        int i4 = IconCompatParcelizer + 99;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate
    public final void onStop() throws RemoteException {
        int i = 2 % 2;
        int i2 = write + 31;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zzb(11, zza());
        int i4 = IconCompatParcelizer + 31;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(int r31, char[] r32, byte r33, java.lang.Object[] r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 791
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzbw.b(int, char[], byte, java.lang.Object[]):void");
    }
}
