package com.google.android.gms.maps.internal;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.location.Location;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CircleOptions;
import com.google.android.gms.maps.model.GroundOverlayOptions;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.android.gms.maps.model.PolygonOptions;
import com.google.android.gms.maps.model.PolylineOptions;
import com.google.android.gms.maps.model.TileOverlayOptions;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.buildSetStopReasonIntent;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final class zzg extends com.google.android.gms.internal.maps.zza implements IGoogleMapDelegate {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {42, 85, 82, -118, -18, -4, 57, -63, -14, -6, 2, -11, 1, TarConstants.LF_LINK, -57, -19, 4, -20, -3, 0, -1, TarConstants.LF_NORMAL, -69, 6, -25, 9, -19, 3, 2, -17, 56, -59, -11, -7, -13, 60, -27, -43, -7, -13, 70, -19, -1, 3, -17, 9, -25, -14, -8, -11, 9, 30, -40, -23, 5, -12, -5, 37, -50, -4, -9, 9, -25, 30, -23, -23, 9, -8, -13, -3, -23, 15, -19};
    private static final int $$e = 132;
    private static final byte[] $$a = {TarConstants.LF_SYMLINK, -57, 8, -14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 104;
    private static int RemoteActionCompatParcelizer = 0;
    private static int write = 1;
    private static char[] AudioAttributesCompatParcelizer = {44991, 45039, 45025, 45025, 45005, 44999, 45036, 45037, 45024, 44992, 45002, 45036, 45052, 45049, 45030, 45027, 44984, 45038, 45027, 45011, 45023, 45031, 45024, 45022, 45034, 45052, 45028, 45028, 45051, 45027, 45038, 45036, 44979, 45050, 45030, 45036, 44995, 44996, 45051, 45018, 45002, 45036, 45052, 45049, 45030, 45027, 45010, 45021, 45031, 45027, 45037, 45036, 45037, 45027, 44984, 45038, 45030, 45051, 45026, 45036, 45026, 45039, 45027, 45025, 45028, 45050, 45036, 45033, 45009};

    zzg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 10
            int r8 = 44 - r8
            int r7 = r7 + 4
            int r6 = r6 * 12
            int r6 = r6 + 65
            byte[] r0 = com.google.android.gms.maps.internal.zzg.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r6
            r6 = r8
            r5 = r2
            goto L29
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            int r5 = r3 + 1
            r1[r3] = r4
            int r7 = r7 + 1
            if (r5 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r7]
        L29:
            int r6 = r6 + r3
            int r6 = r6 + (-1)
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzg.a(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 2
            int r6 = 45 - r6
            int r8 = r8 + 5
            byte[] r0 = com.google.android.gms.maps.internal.zzg.$$d
            int r7 = 119 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L12
            r3 = r8
            r5 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r6]
        L26:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-6)
            r3 = r5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzg.c(short, byte, short, java.lang.Object[]):void");
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final CameraPosition getCameraPosition() throws RemoteException {
        Parcel parcelZza;
        Parcelable parcelableZza;
        int i = 2 % 2;
        int i2 = write + 107;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            parcelZza = zza(1, zza());
            parcelableZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza, CameraPosition.CREATOR);
        } else {
            parcelZza = zza(1, zza());
            parcelableZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza, CameraPosition.CREATOR);
        }
        CameraPosition cameraPosition = (CameraPosition) parcelableZza;
        parcelZza.recycle();
        return cameraPosition;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final float getMaxZoomLevel() throws RemoteException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 105;
        write = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza(2, zza());
        float f = parcelZza.readFloat();
        parcelZza.recycle();
        int i4 = RemoteActionCompatParcelizer + 53;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 48 / 0;
        }
        return f;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final float getMinZoomLevel() throws RemoteException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 41;
        write = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza(3, zza());
        float f = parcelZza.readFloat();
        parcelZza.recycle();
        int i4 = write + 39;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return f;
        }
        throw null;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void moveCamera(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 27;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
            i = 5;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
            i = 4;
        }
        zzb(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void animateCamera(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 91;
        write = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
            i = 4;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
            i = 5;
        }
        zzb(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void animateCameraWithCallback(IObjectWrapper iObjectWrapper, zzc zzcVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 109;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzcVar);
            i = 49;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzcVar);
            i = 6;
        }
        zzb(i, parcelZza);
        int i4 = RemoteActionCompatParcelizer + 71;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void animateCameraWithDurationAndCallback(IObjectWrapper iObjectWrapper, int i, zzc zzcVar) throws RemoteException {
        int i2 = 2 % 2;
        int i3 = write + 37;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
        parcelZza.writeInt(i);
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzcVar);
        zzb(7, parcelZza);
        int i5 = RemoteActionCompatParcelizer + 73;
        write = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void stopAnimation() throws RemoteException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 9;
        write = i2 % 128;
        int i3 = i2 % 2;
        zzb(8, zza());
        int i4 = write + 73;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzz addPolyline(PolylineOptions polylineOptions) throws RemoteException {
        Parcel parcelZza;
        int i = 2 % 2;
        int i2 = write + 83;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            Parcel parcelZza2 = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza2, polylineOptions);
            parcelZza = zza(83, parcelZza2);
        } else {
            Parcel parcelZza3 = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza3, polylineOptions);
            parcelZza = zza(9, parcelZza3);
        }
        com.google.android.gms.internal.maps.zzz zzzVarZzi = com.google.android.gms.internal.maps.zzaa.zzi(parcelZza.readStrongBinder());
        parcelZza.recycle();
        return zzzVarZzi;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzw addPolygon(PolygonOptions polygonOptions) throws RemoteException {
        int i = 2 % 2;
        int i2 = write + 57;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, polygonOptions);
        Parcel parcelZza2 = zza(10, parcelZza);
        com.google.android.gms.internal.maps.zzw zzwVarZzh = com.google.android.gms.internal.maps.zzx.zzh(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        int i4 = RemoteActionCompatParcelizer + 15;
        write = i4 % 128;
        if (i4 % 2 != 0) {
            return zzwVarZzh;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzt addMarker(MarkerOptions markerOptions) throws RemoteException {
        int i = 2 % 2;
        int i2 = write + 97;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, markerOptions);
        Parcel parcelZza2 = zza(11, parcelZza);
        com.google.android.gms.internal.maps.zzt zztVarZzg = com.google.android.gms.internal.maps.zzu.zzg(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        int i4 = RemoteActionCompatParcelizer + 33;
        write = i4 % 128;
        int i5 = i4 % 2;
        return zztVarZzg;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzk addGroundOverlay(GroundOverlayOptions groundOverlayOptions) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 47;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, groundOverlayOptions);
            i = 62;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, groundOverlayOptions);
            i = 12;
        }
        Parcel parcelZza2 = zza(i, parcelZza);
        com.google.android.gms.internal.maps.zzk zzkVarZzd = com.google.android.gms.internal.maps.zzl.zzd(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        return zzkVarZzd;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzac addTileOverlay(TileOverlayOptions tileOverlayOptions) throws RemoteException {
        Parcel parcelZza;
        IBinder strongBinder;
        int i = 2 % 2;
        int i2 = write + 109;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            Parcel parcelZza2 = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza2, tileOverlayOptions);
            parcelZza = zza(3, parcelZza2);
            strongBinder = parcelZza.readStrongBinder();
        } else {
            Parcel parcelZza3 = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza3, tileOverlayOptions);
            parcelZza = zza(13, parcelZza3);
            strongBinder = parcelZza.readStrongBinder();
        }
        com.google.android.gms.internal.maps.zzac zzacVarZzj = com.google.android.gms.internal.maps.zzad.zzj(strongBinder);
        parcelZza.recycle();
        return zzacVarZzj;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void clear() throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 123;
        write = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            i = 122;
        } else {
            parcelZza = zza();
            i = 14;
        }
        zzb(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final int getMapType() throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 17;
        write = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            i = 104;
        } else {
            parcelZza = zza();
            i = 15;
        }
        Parcel parcelZza2 = zza(i, parcelZza);
        int i4 = parcelZza2.readInt();
        parcelZza2.recycle();
        return i4;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMapType(int i) throws RemoteException {
        Parcel parcelZza;
        int i2;
        int i3 = 2 % 2;
        int i4 = write + 31;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            parcelZza = zza();
            parcelZza.writeInt(i);
            i2 = 113;
        } else {
            parcelZza = zza();
            parcelZza.writeInt(i);
            i2 = 16;
        }
        zzb(i2, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isTrafficEnabled() throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 107;
        write = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            i = 65;
        } else {
            parcelZza = zza();
            i = 17;
        }
        Parcel parcelZza2 = zza(i, parcelZza);
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza2);
        parcelZza2.recycle();
        int i4 = RemoteActionCompatParcelizer + 1;
        write = i4 % 128;
        if (i4 % 2 != 0) {
            return zZza;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setTrafficEnabled(boolean z) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 59;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
            i = 49;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
            i = 18;
        }
        zzb(i, parcelZza);
        int i4 = RemoteActionCompatParcelizer + 19;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isIndoorEnabled() throws RemoteException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        write = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza(19, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        int i4 = write + 117;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return zZza;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean setIndoorEnabled(boolean z) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 71;
        write = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
            i = 21;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
            i = 20;
        }
        Parcel parcelZza2 = zza(i, parcelZza);
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza2);
        parcelZza2.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isMyLocationEnabled() throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 63;
        write = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            i = 94;
        } else {
            parcelZza = zza();
            i = 21;
        }
        Parcel parcelZza2 = zza(i, parcelZza);
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza2);
        parcelZza2.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMyLocationEnabled(boolean z) throws RemoteException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 89;
        write = i2 % 128;
        if (i2 % 2 == 0) {
            Parcel parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
            zzb(89, parcelZza);
        } else {
            Parcel parcelZza2 = zza();
            com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza2, z);
            zzb(22, parcelZza2);
        }
        int i3 = RemoteActionCompatParcelizer + 63;
        write = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final Location getMyLocation() throws RemoteException {
        int i = 2 % 2;
        int i2 = write + 103;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza(23, zza());
        Location location = (Location) com.google.android.gms.internal.maps.zzc.zza(parcelZza, Location.CREATOR);
        parcelZza.recycle();
        int i4 = RemoteActionCompatParcelizer + 113;
        write = i4 % 128;
        if (i4 % 2 != 0) {
            return location;
        }
        throw null;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setLocationSource(ILocationSourceDelegate iLocationSourceDelegate) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 85;
        write = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, iLocationSourceDelegate);
            i = 74;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, iLocationSourceDelegate);
            i = 24;
        }
        zzb(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final IUiSettingsDelegate getUiSettings() throws RemoteException {
        int i = 2 % 2;
        Parcel parcelZza = zza(25, zza());
        IBinder strongBinder = parcelZza.readStrongBinder();
        IUiSettingsDelegate zzbxVar = null;
        if (strongBinder == null) {
            int i2 = RemoteActionCompatParcelizer + 45;
            write = i2 % 128;
            if (i2 % 2 == 0) {
                throw null;
            }
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (iInterfaceQueryLocalInterface instanceof IUiSettingsDelegate) {
                int i3 = write + 109;
                RemoteActionCompatParcelizer = i3 % 128;
                if (i3 % 2 != 0) {
                    zzbxVar.hashCode();
                    throw null;
                }
                zzbxVar = (IUiSettingsDelegate) iInterfaceQueryLocalInterface;
            } else {
                zzbxVar = new zzbx(strongBinder);
            }
        }
        parcelZza.recycle();
        return zzbxVar;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final IProjectionDelegate getProjection() throws RemoteException {
        IProjectionDelegate zzbrVar;
        int i = 2 % 2;
        int i2 = write + 85;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza(26, zza());
        IBinder strongBinder = parcelZza.readStrongBinder();
        if (strongBinder != null) {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IProjectionDelegate");
            if (iInterfaceQueryLocalInterface instanceof IProjectionDelegate) {
                zzbrVar = (IProjectionDelegate) iInterfaceQueryLocalInterface;
            } else {
                zzbrVar = new zzbr(strongBinder);
            }
        } else {
            int i4 = write + 115;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            zzbrVar = null;
        }
        parcelZza.recycle();
        int i6 = write + 43;
        RemoteActionCompatParcelizer = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 76 / 0;
        }
        return zzbrVar;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraChangeListener(zzl zzlVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        write = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzlVar);
        zzb(27, parcelZza);
        int i4 = RemoteActionCompatParcelizer + 67;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMapClickListener(zzaj zzajVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 47;
        write = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzajVar);
        zzb(28, parcelZza);
        int i4 = RemoteActionCompatParcelizer + 23;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMapLongClickListener(zzan zzanVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        write = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzanVar);
        zzb(29, parcelZza);
        int i4 = write + 91;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMarkerClickListener(zzar zzarVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 21;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzarVar);
            i = 23;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzarVar);
            i = 30;
        }
        zzb(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMarkerDragListener(zzat zzatVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 117;
        write = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzatVar);
            i = 38;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzatVar);
            i = 31;
        }
        zzb(i, parcelZza);
        int i4 = RemoteActionCompatParcelizer + 79;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnInfoWindowClickListener(zzab zzabVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 101;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzabVar);
            i = 104;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzabVar);
            i = 32;
        }
        zzb(i, parcelZza);
        int i4 = write + 45;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 29 / 0;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setInfoWindowAdapter(zzh zzhVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 37;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzhVar);
            i = 7;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzhVar);
            i = 33;
        }
        zzb(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzh addCircle(CircleOptions circleOptions) throws RemoteException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 37;
        write = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, circleOptions);
        Parcel parcelZza2 = zza(35, parcelZza);
        com.google.android.gms.internal.maps.zzh zzhVarZzc = com.google.android.gms.internal.maps.zzi.zzc(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        int i4 = write + 109;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return zzhVarZzc;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMyLocationChangeListener(zzax zzaxVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 89;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzaxVar);
            i = 13;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzaxVar);
            i = 36;
        }
        zzb(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMyLocationButtonClickListener(zzav zzavVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = write + 69;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            Parcel parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzavVar);
            zzb(4, parcelZza);
        } else {
            Parcel parcelZza2 = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza2, zzavVar);
            zzb(37, parcelZza2);
        }
        int i3 = RemoteActionCompatParcelizer + 37;
        write = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void snapshot(zzbs zzbsVar, IObjectWrapper iObjectWrapper) throws RemoteException {
        int i = 2 % 2;
        int i2 = write + 9;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzbsVar);
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, iObjectWrapper);
        zzb(38, parcelZza);
        int i4 = RemoteActionCompatParcelizer + 31;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setPadding(int i, int i2, int i3, int i4) throws RemoteException {
        Parcel parcelZza;
        int i5;
        int i6 = 2 % 2;
        int i7 = write + 1;
        RemoteActionCompatParcelizer = i7 % 128;
        if (i7 % 2 != 0) {
            parcelZza = zza();
            parcelZza.writeInt(i);
            parcelZza.writeInt(i2);
            parcelZza.writeInt(i3);
            parcelZza.writeInt(i4);
            i5 = 24;
        } else {
            parcelZza = zza();
            parcelZza.writeInt(i);
            parcelZza.writeInt(i2);
            parcelZza.writeInt(i3);
            parcelZza.writeInt(i4);
            i5 = 39;
        }
        zzb(i5, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean isBuildingsEnabled() throws RemoteException {
        int i = 2 % 2;
        int i2 = write + 83;
        RemoteActionCompatParcelizer = i2 % 128;
        Parcel parcelZza = i2 % 2 != 0 ? zza(90, zza()) : zza(40, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        return zZza;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setBuildingsEnabled(boolean z) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 105;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
            i = 96;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
            i = 41;
        }
        zzb(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMapLoadedCallback(zzal zzalVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 119;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzalVar);
            i = 67;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzalVar);
            i = 42;
        }
        zzb(i, parcelZza);
        int i4 = write + 23;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final com.google.android.gms.internal.maps.zzn getFocusedBuilding() throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 85;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            i = 87;
        } else {
            parcelZza = zza();
            i = 44;
        }
        Parcel parcelZza2 = zza(i, parcelZza);
        com.google.android.gms.internal.maps.zzn zznVarZze = com.google.android.gms.internal.maps.zzo.zze(parcelZza2.readStrongBinder());
        parcelZza2.recycle();
        return zznVarZze;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnIndoorStateChangeListener(zzz zzzVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 109;
        write = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzzVar);
        zzb(45, parcelZza);
        int i4 = RemoteActionCompatParcelizer + 81;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void b(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = AudioAttributesCompatParcelizer;
        float f = BitmapDescriptorFactory.HUE_RED;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                int i7 = $10 + 63;
                $11 = i7 % 128;
                int i8 = i7 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) View.getDefaultSize(0, 0), (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 11612, 21 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i6++;
                    f = BitmapDescriptorFactory.HUE_RED;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i9 = $11 + 33;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i11 = $10 + 47;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            char[] cArr4 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i13 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 22959 - (ViewConfiguration.getWindowTouchSlop() >> 8), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 42, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i14 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (31589 - TextUtils.getTrimmedLength("")), TextUtils.lastIndexOf("", '0', 0, 0) + 9864, (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 64, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i14] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (KeyEvent.keyCodeFromString("") + 37822), 9753 - TextUtils.indexOf((CharSequence) "", '0', 0), (ViewConfiguration.getScrollBarSize() >> 8) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            int i15 = $10 + 105;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i17 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i17, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i17);
        }
        if (z) {
            int i18 = $11 + 3;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            char[] cArr6 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i3 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            int i20 = $11 + 5;
            $10 = i20 % 128;
            int i21 = i20 % 2;
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            int i22 = $11 + 35;
            $10 = i22 % 128;
            int i23 = i22 % 2;
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setWatermarkEnabled(boolean z) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 93;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
            i = 17;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.writeBoolean(parcelZza, z);
            i = 51;
        }
        zzb(i, parcelZza);
        int i4 = write + 25;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void getMapAsync(zzap zzapVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 83;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzapVar);
            i = 98;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzapVar);
            i = 53;
        }
        zzb(i, parcelZza);
        int i4 = RemoteActionCompatParcelizer + 111;
        write = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 65;
        write = i2 % 128;
        if (i2 % 2 == 0) {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
            if (objRemoteActionCompatParcelizer == null) {
                char cCombineMeasuredStates = (char) (13183 - View.combineMeasuredStates(0, 0));
                int size = View.MeasureSpec.getSize(0) + 1649;
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 26;
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                a(bArr[53], bArr[17], bArr[5], objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cCombineMeasuredStates, size, iCombineMeasuredStates, -133433128, false, (String) objArr2[0], null);
            }
            ((Field) objRemoteActionCompatParcelizer).getLong(null);
            throw null;
        }
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer2 == null) {
            char cResolveSize = (char) (View.resolveSize(0, 0) + 13183);
            int scrollBarSize = 1649 - (ViewConfiguration.getScrollBarSize() >> 8);
            int i3 = (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26;
            byte[] bArr2 = $$a;
            Object[] objArr3 = new Object[1];
            a(bArr2[53], bArr2[17], bArr2[5], objArr3);
            objRemoteActionCompatParcelizer2 = startForeground.read(cResolveSize, scrollBarSize, i3, -133433128, false, (String) objArr3[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer2).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer3 == null) {
                char c2 = (char) (13183 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                int capsMode = 1649 - TextUtils.getCapsMode("", 0, 0);
                int offsetAfter = 26 - TextUtils.getOffsetAfter("", 0);
                Object[] objArr4 = new Object[1];
                a(r10[5], (byte) (-$$a[65]), r10[53], objArr4);
                objRemoteActionCompatParcelizer3 = startForeground.read(c2, capsMode, offsetAfter, -1033747278, false, (String) objArr4[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            c = 3;
        } else {
            Object[] objArr5 = new Object[1];
            b(new byte[]{0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 0, 1, 1, 0}, new int[]{0, 16, 0, 0}, false, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            b(new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, new int[]{16, 16, 0, 0}, true, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            int i4 = write + 33;
            RemoteActionCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr7 = {Integer.valueOf(iIntValue), 0, 1052819121};
                byte[] bArr3 = $$d;
                Object[] objArr8 = new Object[1];
                c((byte) 21, (byte) (-bArr3[17]), (byte) 34, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                byte b = bArr3[10];
                byte b2 = bArr3[19];
                Object[] objArr9 = new Object[1];
                c(b, b2, b2, objArr9);
                objArr = (Object[]) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr7);
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char c3 = (char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13182);
                    int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 1650;
                    int i6 = 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    Object[] objArr10 = new Object[1];
                    a(r5[5], (byte) (-$$a[65]), r5[53], objArr10);
                    objRemoteActionCompatParcelizer4 = startForeground.read(c3, iLastIndexOf, i6, -1033747278, false, (String) objArr10[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    b(new byte[]{0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0}, new int[]{32, 22, 0, 19}, false, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b(new byte[]{0, 1, 0, 1, 1, 1, 1, 0, 0, 0, 1, 0, 1, 0, 1}, new int[]{54, 15, 0, 7}, true, objArr12);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char deadChar = (char) (13183 - KeyEvent.getDeadChar(0, 0));
                        int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1649;
                        int iRgb = Color.rgb(0, 0, 0) + 16777242;
                        byte b3 = $$a[5];
                        Object[] objArr13 = new Object[1];
                        a(b3, (byte) (b3 | TarConstants.LF_GNUTYPE_LONGLINK), r13[53], objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(deadChar, absoluteGravity, iRgb, 54351865, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char c4 = (char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13182);
                        int i7 = 1650 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int defaultSize = View.getDefaultSize(0, 0) + 26;
                        byte[] bArr4 = $$a;
                        Object[] objArr14 = new Object[1];
                        a(bArr4[53], bArr4[17], bArr4[5], objArr14);
                        objRemoteActionCompatParcelizer6 = startForeground.read(c4, i7, defaultSize, -133433128, false, (String) objArr14[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf2);
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
            long j2 = 0;
            long j3 = (((long) (i9 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) (ImageFormat.getBitsPerPixel(0) + 4536), (Process.myPid() >> 22) + 6054, 42 - TextUtils.indexOf("", "", 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, null);
                try {
                    Object[] objArr15 = {-969723294, Long.valueOf(j3), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) ((-1) - MotionEvent.axisFromString("")), TextUtils.indexOf("", "") + 6030, 23 - ExpandableListView.getPackedPositionChild(0L));
                    Object[] objArr16 = new Object[1];
                    c(r1[19], r1[57], (byte) (-$$d[53]), objArr16);
                    cls4.getMethod((String) objArr16[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr15);
                    int i10 = write + 109;
                    RemoteActionCompatParcelizer = i10 % 128;
                    int i11 = i10 % 2;
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
        zzb(54, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onResume() throws RemoteException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 17;
        write = i2 % 128;
        int i3 = i2 % 2;
        zzb(55, zza());
        int i4 = RemoteActionCompatParcelizer + 25;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 10 / 0;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onPause() throws RemoteException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 33;
        write = i2 % 128;
        int i3 = i2 % 2;
        zzb(56, zza());
        int i4 = write + 125;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onDestroy() throws RemoteException {
        int i = 2 % 2;
        int i2 = write + 121;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zzb(57, zza());
        int i4 = write + 121;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onLowMemory() throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 117;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            i = 97;
        } else {
            parcelZza = zza();
            i = 58;
        }
        zzb(i, parcelZza);
        int i4 = RemoteActionCompatParcelizer + 15;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean useViewLifecycleWhenInFragment() throws RemoteException {
        int i = 2 % 2;
        int i2 = write + 117;
        RemoteActionCompatParcelizer = i2 % 128;
        Parcel parcelZza = i2 % 2 != 0 ? zza(126, zza()) : zza(59, zza());
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        int i3 = write + 93;
        RemoteActionCompatParcelizer = i3 % 128;
        int i4 = i3 % 2;
        return zZza;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0035 A[PHI: r3
      0x0035: PHI (r3v2 android.os.Parcel) = (r3v1 android.os.Parcel), (r3v4 android.os.Parcel) binds: [B:8:0x0033, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onSaveInstanceState(android.os.Bundle r4) throws android.os.RemoteException {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.maps.internal.zzg.RemoteActionCompatParcelizer
            int r1 = r1 + 7
            int r2 = r1 % 128
            com.google.android.gms.maps.internal.zzg.write = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L22
            android.os.Parcel r1 = r3.zza()
            com.google.android.gms.internal.maps.zzc.zza(r1, r4)
            r2 = 54
            android.os.Parcel r3 = r3.zza(r2, r1)
            int r1 = r3.readInt()
            if (r1 == 0) goto L41
            goto L35
        L22:
            android.os.Parcel r1 = r3.zza()
            com.google.android.gms.internal.maps.zzc.zza(r1, r4)
            r2 = 60
            android.os.Parcel r3 = r3.zza(r2, r1)
            int r1 = r3.readInt()
            if (r1 == 0) goto L41
        L35:
            r4.readFromParcel(r3)
            int r4 = com.google.android.gms.maps.internal.zzg.write
            int r4 = r4 + 31
            int r1 = r4 % 128
            com.google.android.gms.maps.internal.zzg.RemoteActionCompatParcelizer = r1
            int r4 = r4 % r0
        L41:
            r3.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.internal.zzg.onSaveInstanceState(android.os.Bundle):void");
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setContentDescription(String str) throws RemoteException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 7;
        write = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        parcelZza.writeString(str);
        zzb(61, parcelZza);
        int i4 = RemoteActionCompatParcelizer + 103;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void snapshotForTest(zzbs zzbsVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = write + 123;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzbsVar);
        zzb(71, parcelZza);
        int i4 = write + 47;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnPoiClickListener(zzbb zzbbVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 79;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzbbVar);
            i = 75;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzbbVar);
            i = 80;
        }
        zzb(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onEnterAmbient(Bundle bundle) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 83;
        write = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, bundle);
            i = 95;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, bundle);
            i = 81;
        }
        zzb(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onExitAmbient() throws RemoteException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 45;
        write = i2 % 128;
        int i3 = i2 % 2;
        zzb(82, zza());
        int i4 = RemoteActionCompatParcelizer + 85;
        write = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnGroundOverlayClickListener(zzx zzxVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 111;
        write = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzxVar);
        zzb(83, parcelZza);
        int i4 = write + 83;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnInfoWindowLongClickListener(zzaf zzafVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 23;
        write = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzafVar);
        zzb(84, parcelZza);
        int i4 = write + 1;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnPolygonClickListener(zzbd zzbdVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 89;
        write = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzbdVar);
        zzb(85, parcelZza);
        int i4 = write + 103;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnInfoWindowCloseListener(zzad zzadVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 61;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzadVar);
            i = 78;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzadVar);
            i = 86;
        }
        zzb(i, parcelZza);
        int i4 = write + 61;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnPolylineClickListener(zzbf zzbfVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 81;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzbfVar);
            i = 35;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzbfVar);
            i = 87;
        }
        zzb(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCircleClickListener(zzv zzvVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = RemoteActionCompatParcelizer + 103;
        write = i3 % 128;
        if (i3 % 2 == 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzvVar);
            i = 9;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzvVar);
            i = 89;
        }
        zzb(i, parcelZza);
        int i4 = RemoteActionCompatParcelizer + 59;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMinZoomPreference(float f) throws RemoteException {
        int i = 2 % 2;
        int i2 = write + 123;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzb(92, parcelZza);
        int i4 = write + 5;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setMaxZoomPreference(float f) throws RemoteException {
        int i = 2 % 2;
        int i2 = write + 41;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        parcelZza.writeFloat(f);
        zzb(93, parcelZza);
        int i4 = RemoteActionCompatParcelizer + 57;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void resetMinMaxZoomPreference() throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 31;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            i = 120;
        } else {
            parcelZza = zza();
            i = 94;
        }
        zzb(i, parcelZza);
        int i4 = write + 31;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setLatLngBoundsForCameraTarget(LatLngBounds latLngBounds) throws RemoteException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 39;
        write = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, latLngBounds);
        zzb(95, parcelZza);
        int i4 = RemoteActionCompatParcelizer + 95;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraMoveStartedListener(zzt zztVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 73;
        write = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zztVar);
        zzb(96, parcelZza);
        int i4 = RemoteActionCompatParcelizer + 97;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraMoveListener(zzr zzrVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 67;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzrVar);
            i = 70;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzrVar);
            i = 97;
        }
        zzb(i, parcelZza);
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraMoveCanceledListener(zzp zzpVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 61;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzpVar);
            i = 42;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzpVar);
            i = 98;
        }
        zzb(i, parcelZza);
        int i4 = RemoteActionCompatParcelizer + 45;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 81 / 0;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnCameraIdleListener(zzn zznVar) throws RemoteException {
        Parcel parcelZza;
        int i;
        int i2 = 2 % 2;
        int i3 = write + 119;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zznVar);
            i = 64;
        } else {
            parcelZza = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza, zznVar);
            i = 99;
        }
        zzb(i, parcelZza);
        int i4 = write + 23;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 14 / 0;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final boolean setMapStyle(MapStyleOptions mapStyleOptions) throws RemoteException {
        Parcel parcelZza;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 11;
        write = i2 % 128;
        if (i2 % 2 == 0) {
            Parcel parcelZza2 = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza2, mapStyleOptions);
            parcelZza = zza(58, parcelZza2);
        } else {
            Parcel parcelZza3 = zza();
            com.google.android.gms.internal.maps.zzc.zza(parcelZza3, mapStyleOptions);
            parcelZza = zza(91, parcelZza3);
        }
        boolean zZza = com.google.android.gms.internal.maps.zzc.zza(parcelZza);
        parcelZza.recycle();
        int i3 = RemoteActionCompatParcelizer + 105;
        write = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 0 / 0;
        }
        return zZza;
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onStart() throws RemoteException {
        int i = 2 % 2;
        int i2 = write + 25;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zzb(101, zza());
        int i4 = write + 71;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void onStop() throws RemoteException {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 101;
        write = i2 % 128;
        int i3 = i2 % 2;
        zzb(102, zza());
        int i4 = write + 111;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
    }

    @Override // com.google.android.gms.maps.internal.IGoogleMapDelegate
    public final void setOnMyLocationClickListener(zzaz zzazVar) throws RemoteException {
        int i = 2 % 2;
        int i2 = write + 27;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Parcel parcelZza = zza();
        com.google.android.gms.internal.maps.zzc.zza(parcelZza, zzazVar);
        zzb(107, parcelZza);
        int i4 = write + 5;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }
}
