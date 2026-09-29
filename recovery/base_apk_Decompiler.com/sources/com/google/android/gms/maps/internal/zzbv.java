package com.google.android.gms.maps.internal;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.StreetViewPanoramaOptions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.DownloadService;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final class zzbv extends com.google.android.gms.internal.maps.zza implements IStreetViewPanoramaFragmentDelegate {
    private static final byte[] $$c = {9, -88, -121, TarConstants.LF_FIFO};
    private static final int $$f = 203;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {16, -101, -28, -55, 18, 4, -57, 63, 14, 6, -2, 11, -1, -49, 57, 19, -4, 20, 3, 0, 1, -48, 69, -6, 25, -9, 19, -3, -2, 17, -56, 59, 11, 7, 13, -60, 27, 43, 7, 13, -70, 19, 1, -3, 17, -9, 25, 14, 8, 11, -9, -30, 40, 23, -5, 12, 5, -37, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19};
    private static final int $$e = 73;
    private static final byte[] $$a = {34, TarConstants.LF_NORMAL, 18, 42, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 153;
    private static int write = 0;
    private static int read = 1;
    private static char[] AudioAttributesCompatParcelizer = {39846, 56377, 5266, 19729, 34226, 65092, 14037, 28334, 42763, 8150, 20567, 35049, 49487, 14652, 29105, 43533, 44247, 60238, 9203, 31340, 45722, 51507, 434, 22987, 36950, 10475, 26373, 49034, 62989, 3669, 18114, 40311, 56429, 39926, 21312, 2754, 49715, 47489, 28944, 10542, 57539, 22603, 6122, 52995, 34437, 32507, 13920, 60869, 42273, 7323, 54280, 37791, 19455, 835, 27454, 11427, 58386, 48535, 30072, 3802, 50759, 40453, 22430, 61198, 41215, 30835, 12738, 51634, 33062};
    private static long RemoteActionCompatParcelizer = -3806151530291487848L;

    private static String $$g(int i, int i2, short s) {
        int i3 = (s * 3) + 101;
        byte[] bArr = $$c;
        int i4 = 4 - (i * 4);
        int i5 = i2 * 4;
        byte[] bArr2 = new byte[i5 + 1];
        int i6 = -1;
        if (bArr == null) {
            i4++;
            i3 += i5;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i3;
            if (i6 == i5) {
                return new String(bArr2, 0);
            }
            int i7 = bArr[i4];
            i4++;
            i3 += i7;
        }
    }

    zzbv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 + 4
            int r7 = r7 * 10
            int r0 = 44 - r7
            int r5 = r5 * 12
            int r5 = 77 - r5
            byte[] r1 = com.google.android.gms.maps.internal.zzbv.$$a
            byte[] r0 = new byte[r0]
            int r7 = 43 - r7
            r2 = 0
            if (r1 != 0) goto L17
            r3 = r6
            r5 = r7
            r4 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L27:
            r3 = r1[r6]
        L29:
            int r6 = r6 + 1
            int r5 = r5 + r3
            int r5 = r5 + (-1)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzbv.a(int, int, byte, java.lang.Object[]):void");
    }

    private static void c(int i, int i2, int i3, Object[] objArr) {
        int i4 = 45 - (i3 * 2);
        int i5 = 119 - i2;
        byte[] bArr = $$d;
        byte[] bArr2 = new byte[i + 5];
        int i6 = i + 4;
        int i7 = -1;
        if (bArr == null) {
            i5 = (i5 + i4) - 6;
            i4 = i4;
            i7 = -1;
        }
        while (true) {
            int i8 = i7 + 1;
            bArr2[i8] = (byte) i5;
            int i9 = i4 + 1;
            if (i8 == i6) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i5 = (i5 + bArr[i9]) - 6;
                i4 = i9;
                i7 = i8;
            }
        }
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
    public final IStreetViewPanoramaDelegate getStreetViewPanorama() throws RemoteException {
        Parcel parcelZza;
        IBinder strongBinder;
        IStreetViewPanoramaDelegate zzbuVar;
        int i = 2 % 2;
        int i2 = write + 37;
        read = i2 % 128;
        if (i2 % 2 != 0 ? (strongBinder = (parcelZza = zza(1, zza())).readStrongBinder()) != null : (strongBinder = (parcelZza = zza(1, zza())).readStrongBinder()) != null) {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
            if (iInterfaceQueryLocalInterface instanceof IStreetViewPanoramaDelegate) {
                zzbuVar = (IStreetViewPanoramaDelegate) iInterfaceQueryLocalInterface;
                int i3 = write + 21;
                read = i3 % 128;
                int i4 = i3 % 2;
            } else {
                zzbuVar = new zzbu(strongBinder);
            }
        } else {
            zzbuVar = null;
        }
        parcelZza.recycle();
        int i5 = write + 53;
        read = i5 % 128;
        int i6 = i5 % 2;
        return zzbuVar;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
    public final void onInflate(IObjectWrapper iObjectWrapper, StreetViewPanoramaOptions streetViewPanoramaOptions, Bundle bundle) throws RemoteException {
        int i = 2 % 2;
        int i2 = read + 27;
        write = i2 % 128;
        if (i2 % 2 != 0) {
            Parcel parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, streetViewPanoramaOptions);
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, bundle);
            zzb(3, parcelZza);
        } else {
            Parcel parcelZza2 = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza2, iObjectWrapper);
            com.google.android.gms.internal.maps.zzc.zza(parcelZza2, streetViewPanoramaOptions);
            com.google.android.gms.internal.maps.zzc.zza(parcelZza2, bundle);
            zzb(2, parcelZza2);
        }
        int i3 = read + 89;
        write = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void b(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        int i5 = $11 + 11;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (downloadService.write < i2) {
            int i7 = $11 + 107;
            $10 = i7 % 128;
            if (i7 % i3 != 0) {
                int i8 = downloadService.write;
                try {
                    Object[] objArr2 = {Integer.valueOf(AudioAttributesCompatParcelizer[i - i8])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) (36620 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), TextUtils.getCapsMode("", 0, 0) + 2340, View.getDefaultSize(0, 0) + 28, 480654850, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(RemoteActionCompatParcelizer), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - MotionEvent.axisFromString("")), (Process.myTid() >> 22) + 9701, 26 - TextUtils.getTrimmedLength(""), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i8] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {downloadService, downloadService};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0) + 1), 23784 - Color.red(0), TextUtils.indexOf((CharSequence) "", '0') + 34, -1690012015, false, "b", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i9 = downloadService.write;
                Object[] objArr5 = {Integer.valueOf(AudioAttributesCompatParcelizer[i + i9])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 36621), 2340 - KeyEvent.keyCodeFromString(""), (ViewConfiguration.getJumpTapTimeout() >> 16) + 28, 480654850, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).longValue()), Long.valueOf(i9), Long.valueOf(RemoteActionCompatParcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) ((Process.getThreadPriority(0) + 20) >> 6), 9701 - (ViewConfiguration.getScrollDefaultDelay() >> 16), Drawable.resolveOpacity(0, 0) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i9] = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23783, 33 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
            i3 = 2;
        }
        char[] cArr = new char[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr8 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer7 == null) {
                objRemoteActionCompatParcelizer7 = startForeground.read((char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 23784 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (ViewConfiguration.getWindowTouchSlop() >> 8) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
    public final void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = write + 85;
        read = i2 % 128;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 13183);
            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 1649;
            int defaultSize = 26 - View.getDefaultSize(0, 0);
            byte b = $$a[5];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            a(b, b2, b2, objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(pressedStateDuration, packedPositionType, defaultSize, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) == -1) {
            Object[] objArr3 = new Object[1];
            b((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 18367), (-1) - ImageFormat.getBitsPerPixel(0), 16 - View.combineMeasuredStates(0, 0), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            b((char) (TextUtils.getCapsMode("", 0, 0) + 28850), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 15, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 15, objArr4);
            try {
                Object[] objArr5 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr4[0], Object.class).invoke(null, this)).intValue()), 0, -1427913826};
                byte[] bArr = $$d;
                byte b3 = bArr[17];
                Object[] objArr6 = new Object[1];
                c((byte) 34, b3, (byte) (b3 + 1), objArr6);
                Class<?> cls2 = Class.forName((String) objArr6[0]);
                byte b4 = bArr[19];
                Object[] objArr7 = new Object[1];
                c(b4, b4, (byte) (-bArr[10]), objArr7);
                objArr = (Object[]) cls2.getMethod((String) objArr7[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr5);
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char c = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 13183);
                    int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 1649;
                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 26;
                    byte[] bArr2 = $$a;
                    byte b5 = bArr2[53];
                    Object[] objArr8 = new Object[1];
                    a(b5, (byte) (-bArr2[27]), b5, objArr8);
                    objRemoteActionCompatParcelizer2 = startForeground.read(c, longPressTimeout, iCombineMeasuredStates, -1033747278, false, (String) objArr8[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer2).set(null, objArr);
                try {
                    Object[] objArr9 = new Object[1];
                    b((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), 31 - TextUtils.lastIndexOf("", '0', 0), 22 - Color.red(0), objArr9);
                    Class<?> cls3 = Class.forName((String) objArr9[0]);
                    Object[] objArr10 = new Object[1];
                    b((char) (46936 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), ExpandableListView.getPackedPositionGroup(0L) + 54, 15 - (ViewConfiguration.getKeyRepeatDelay() >> 16), objArr10);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr10[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        char cNormalizeMetaState = (char) (13183 - KeyEvent.normalizeMetaState(0));
                        int iResolveSizeAndState = 1649 - View.resolveSizeAndState(0, 0, 0);
                        int threadPriority = 26 - ((Process.getThreadPriority(0) + 20) >> 6);
                        byte b6 = $$a[53];
                        Object[] objArr11 = new Object[1];
                        a(b6, (byte) ($$b >>> 1), b6, objArr11);
                        objRemoteActionCompatParcelizer3 = startForeground.read(cNormalizeMetaState, iResolveSizeAndState, threadPriority, 54351865, false, (String) objArr11[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer3).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char cBlue = (char) (13183 - Color.blue(0));
                        int offsetBefore = 1649 - TextUtils.getOffsetBefore("", 0);
                        int deadChar = 26 - KeyEvent.getDeadChar(0, 0);
                        byte b7 = $$a[5];
                        byte b8 = b7;
                        Object[] objArr12 = new Object[1];
                        a(b7, b8, b8, objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(cBlue, offsetBefore, deadChar, -133433128, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf2);
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
        } else {
            int i4 = read + 51;
            write = i4 % 128;
            int i5 = i4 % 2;
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer5 == null) {
                char cResolveSize = (char) (View.resolveSize(0, 0) + 13183);
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 1650;
                int iKeyCodeFromString = 26 - KeyEvent.keyCodeFromString("");
                byte[] bArr3 = $$a;
                byte b9 = bArr3[53];
                Object[] objArr13 = new Object[1];
                a(b9, (byte) (-bArr3[27]), b9, objArr13);
                objRemoteActionCompatParcelizer5 = startForeground.read(cResolveSize, iLastIndexOf, iKeyCodeFromString, -1033747278, false, (String) objArr13[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer5).get(null);
        }
        int i6 = ((int[]) objArr[3])[0];
        int i7 = ((int[]) objArr[2])[0];
        if (i7 != i6) {
            long j = -1;
            long j2 = ((long) (i7 ^ i6)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (4535 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 6053 - ImageFormat.getBitsPerPixel(0), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                try {
                    Object[] objArr14 = {-1751812691, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) TextUtils.indexOf("", "", 0, 0), 6030 - Color.green(0), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 24);
                    Object[] objArr15 = new Object[1];
                    c(r2[53], (byte) (-$$d[57]), r2[19], objArr15);
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

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
    public final IObjectWrapper onCreateView(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2, Bundle bundle) throws RemoteException {
        int i = 2 % 2;
        int i2 = read + 37;
        write = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper2);
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, bundle);
        Parcel parcelZza2 = zza(4, parcelZza);
        IObjectWrapper iObjectWrapperAsInterface = IObjectWrapper.Stub.asInterface(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        int i4 = write + 61;
        read = i4 % 128;
        if (i4 % 2 != 0) {
            return iObjectWrapperAsInterface;
        }
        throw null;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
    public final void onResume() throws RemoteException {
        int i = 2 % 2;
        int i2 = write + 63;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            zzb(3, zza());
        } else {
            zzb(5, zza());
        }
        int i3 = read + 5;
        write = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
    public final void onPause() throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 33;
        read = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            i = 62;
        } else {
            parcelZza = zza();
            i = 6;
        }
        zzb(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
    public final void onDestroyView() throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 31;
        read = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            i = 62;
        } else {
            parcelZza = zza();
            i = 7;
        }
        zzb(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
    public final void onDestroy() throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 119;
        read = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            i = 7;
        } else {
            parcelZza = zza();
            i = 8;
        }
        zzb(i, parcelZza);
        int i4 = write + 13;
        read = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 82 / 0;
        }
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
    public final void onLowMemory() throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 15;
        read = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            i = 8;
        } else {
            parcelZza = zza();
            i = 9;
        }
        zzb(i, parcelZza);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[PHI: r3
      0x0035: PHI (r3v2 android.os.Parcel) = (r3v1 android.os.Parcel), (r3v4 android.os.Parcel) binds: [B:8:0x0033, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSaveInstanceState(android.os.Bundle r4) throws android.os.RemoteException {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.maps.internal.zzbv.read
            int r1 = r1 + 49
            int r2 = r1 % 128
            com.google.android.gms.maps.internal.zzbv.write = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L22
            android.os.Parcel r1 = r3.zza()
            com.google.android.gms.internal.maps.zzc.zza(r1, r4)
            r2 = 55
            android.os.Parcel r3 = r3.zza(r2, r1)
            int r1 = r3.readInt()
            if (r1 == 0) goto L41
            goto L35
        L22:
            android.os.Parcel r1 = r3.zza()
            com.google.android.gms.internal.maps.zzc.zza(r1, r4)
            r2 = 10
            android.os.Parcel r3 = r3.zza(r2, r1)
            int r1 = r3.readInt()
            if (r1 == 0) goto L41
        L35:
            r4.readFromParcel(r3)
            int r4 = com.google.android.gms.maps.internal.zzbv.read
            int r4 = r4 + 21
            int r1 = r4 % 128
            com.google.android.gms.maps.internal.zzbv.write = r1
            int r4 = r4 % r0
        L41:
            r3.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzbv.onSaveInstanceState(android.os.Bundle):void");
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
    public final boolean isReady() throws RemoteException {
        int i = 2 % 2;
        int i2 = read + 85;
        write = i2 % 128;
        Parcel parcelZza = i2 % 2 != 0 ? zza(100, zza()) : zza(11, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        int i3 = read + 29;
        write = i3 % 128;
        if (i3 % 2 == 0) {
            return zZza;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
    public final void getStreetViewPanoramaAsync(zzbp zzbpVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 31;
        read = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzbpVar);
            i = 44;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzbpVar);
            i = 12;
        }
        zzb(i, parcelZza);
        int i4 = write + 21;
        read = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
    public final void onStart() throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 83;
        read = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            i = 35;
        } else {
            parcelZza = zza();
            i = 13;
        }
        zzb(i, parcelZza);
        int i4 = write + 113;
        read = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate
    public final void onStop() throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 53;
        read = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            i = 85;
        } else {
            parcelZza = zza();
            i = 14;
        }
        zzb(i, parcelZza);
        int i4 = read + 65;
        write = i4 % 128;
        int i5 = i4 % 2;
    }
}
