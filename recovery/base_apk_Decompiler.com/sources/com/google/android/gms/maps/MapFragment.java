package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.internal.IMapFragmentDelegate;
import com.google.android.gms.maps.internal.MapLifecycleDelegate;
import com.google.android.gms.maps.internal.zzby;
import com.google.android.gms.maps.internal.zzbz;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.buildRemoveAllDownloadsIntent;
import kotlin.buildResumeDownloadsIntent;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public class MapFragment extends Fragment {
    private static short[] write;
    private final zzb zzaz = new zzb(this);
    private static final byte[] $$c = {14, -10, 42, -103};
    private static final int $$f = 41;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {34, 127, 65, -22, 61, -61, -2, -19, 34, -27, -19, -7, 4, -7, 3, 19, -41, 5, 7, 27, -48, -1, -2, 38, -48, -3, -4, 5, -2, -21, 7, -17, 9, -15, -9, 40, -24, -17, 9, -10, -2, -17, 1, 5, -15, 11, -23, -12, -6, -9, 11, 32, -38, -21, 7, -10, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17};
    private static final int $$e = 180;
    private static final byte[] $$a = {94, -36, -26, 62, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 227;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static int RemoteActionCompatParcelizer = -362825486;
    private static int AudioAttributesCompatParcelizer = -819363176;
    private static int read = -1851502840;
    private static byte[] IconCompatParcelizer = {-111, 8, -104, 3, -65, -68, 94, 0, -108, 12, 71, 84, 114, -84, 14, -40, 20, -5, 14, 20, TarConstants.LF_DIR, -64, 26, -60, -34, 20, -63, -48, -40, 46, 15, -109, 4, 110, -79, 15, -106, 6, -99, 97, 98, -36, 3, -58, 77, -100, -99, -102, 9, -111, 10, -17, 115, -30, 127, 124, -21, 4, -39, -24, -27, 116, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -30, 112, -73, -73, -73, -73};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r5, int r6, int r7) {
        /*
            int r7 = r7 * 3
            int r7 = 112 - r7
            byte[] r0 = com.google.android.gms.maps.MapFragment.$$c
            int r6 = r6 * 3
            int r6 = 4 - r6
            int r5 = r5 * 2
            int r1 = r5 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L17
            r4 = r5
            r7 = r6
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
        L27:
            int r6 = r6 + 1
            int r7 = r7 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapFragment.$$g(int, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.maps.MapFragment.$$a
            int r8 = r8 * 12
            int r8 = 77 - r8
            int r6 = 79 - r6
            int r7 = r7 * 10
            int r7 = 44 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2c
        L14:
            r3 = r2
        L15:
            int r6 = r6 + 1
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L26
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L26:
            r4 = r0[r6]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2c:
            int r8 = -r8
            int r3 = r3 + r8
            int r8 = r3 + (-1)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapFragment.a(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 2
            int r7 = 46 - r7
            int r0 = 39 - r8
            byte[] r1 = com.google.android.gms.maps.MapFragment.$$d
            int r6 = r6 + 82
            byte[] r0 = new byte[r0]
            int r8 = 38 - r8
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L2e
        L14:
            r3 = r2
        L15:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = r7 + 1
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-4)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapFragment.c(int, short, short, java.lang.Object[]):void");
    }

    public static MapFragment newInstance() {
        int i = 2 % 2;
        MapFragment mapFragment = new MapFragment();
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 83;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        return mapFragment;
    }

    static final class zzb extends DeferredLifecycleHelper<zza> {
        private final Fragment zzba;
        private OnDelegateCreatedListener<zza> zzbd;
        private Activity zzbe;
        private final List<OnMapReadyCallback> zzbf = new ArrayList();

        zzb(Fragment fragment) {
            this.zzba = fragment;
        }

        @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
        public final void createDelegate(OnDelegateCreatedListener<zza> onDelegateCreatedListener) {
            this.zzbd = onDelegateCreatedListener;
            zzd();
        }

        private final void zzd() {
            if (this.zzbe == null || this.zzbd == null || getDelegate() != null) {
                return;
            }
            try {
                MapsInitializer.initialize(this.zzbe);
                IMapFragmentDelegate iMapFragmentDelegateZzc = zzbz.zza(this.zzbe).zzc(ObjectWrapper.wrap(this.zzbe));
                if (iMapFragmentDelegateZzc != null) {
                    this.zzbd.onDelegateCreated(new zza(this.zzba, iMapFragmentDelegateZzc));
                    Iterator<OnMapReadyCallback> it = this.zzbf.iterator();
                    while (it.hasNext()) {
                        getDelegate().getMapAsync(it.next());
                    }
                    this.zzbf.clear();
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            } catch (GooglePlayServicesNotAvailableException unused) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void setActivity(Activity activity) {
            this.zzbe = activity;
            zzd();
        }

        public final void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
            if (getDelegate() != null) {
                getDelegate().getMapAsync(onMapReadyCallback);
            } else {
                this.zzbf.add(onMapReadyCallback);
            }
        }
    }

    public static MapFragment newInstance(GoogleMapOptions googleMapOptions) {
        int i = 2 % 2;
        MapFragment mapFragment = new MapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        mapFragment.setArguments(bundle);
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 37;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        return mapFragment;
    }

    static final class zza implements MapLifecycleDelegate {
        private static int $10 = 0;
        private static int $11 = 1;
        private final Fragment zzba;
        private final IMapFragmentDelegate zzbb;
        private static final byte[] $$d = {117, -12, 2, 85, -13, 1, 62, -58, -9, -1, 7, -6, 6, TarConstants.LF_FIFO, -52, -14, 9, -15, 2, 5, 4, TarConstants.LF_DIR, -64, 11, -20, 14, -14, 8, 7, -12, 61, -71, 18, -2, -18, 68, -39, -14, -2, 21, -22, -25, 9, -7, 0, 79, -79, 12, 3, -4, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
        private static final int $$e = 60;
        private static final byte[] $$a = {81, -92, 74, -108, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
        private static final int $$b = 254;
        private static int IconCompatParcelizer = 0;
        private static int read = 1;
        private static int[] RemoteActionCompatParcelizer = {2055917437, -83887257, -1149302611, -895903524, -1177748252, 2057401485, 1798162540, -162591321, 585050387, -352322366, 139307673, -112828738, 1362165413, -179119599, -1400982121, -2009245581, -1508993455, -317462574};

        public zza(Fragment fragment, IMapFragmentDelegate iMapFragmentDelegate) {
            this.zzbb = (IMapFragmentDelegate) Preconditions.checkNotNull(iMapFragmentDelegate);
            this.zzba = (Fragment) Preconditions.checkNotNull(fragment);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.google.android.gms.maps.MapFragment.zza.$$a
                int r8 = r8 * 10
                int r1 = r8 + 34
                int r6 = r6 + 4
                int r7 = r7 * 12
                int r7 = r7 + 65
                byte[] r1 = new byte[r1]
                int r8 = r8 + 33
                r2 = -1
                if (r0 != 0) goto L17
                r7 = r6
                r3 = r8
                r4 = r2
                goto L2f
            L17:
                r3 = r2
            L18:
                int r3 = r3 + 1
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r8) goto L28
                java.lang.String r6 = new java.lang.String
                r7 = 0
                r6.<init>(r1, r7)
                r9[r7] = r6
                return
            L28:
                r4 = r0[r6]
                r5 = r7
                r7 = r6
                r6 = r4
                r4 = r3
                r3 = r5
            L2f:
                int r3 = r3 + r6
                int r6 = r7 + 1
                int r7 = r3 + (-1)
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapFragment.zza.a(short, int, int, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void c(short r6, short r7, byte r8, java.lang.Object[] r9) {
            /*
                int r8 = 69 - r8
                int r7 = r7 + 73
                int r0 = r6 + 20
                byte[] r1 = com.google.android.gms.maps.MapFragment.zza.$$d
                byte[] r0 = new byte[r0]
                int r6 = r6 + 19
                r2 = 0
                if (r1 != 0) goto L13
                r3 = r8
                r4 = r2
                r8 = r6
                goto L2a
            L13:
                r3 = r2
            L14:
                byte r4 = (byte) r7
                r0[r3] = r4
                if (r3 != r6) goto L21
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L21:
                r4 = r1[r8]
                int r3 = r3 + 1
                r5 = r8
                r8 = r7
                r7 = r4
                r4 = r3
                r3 = r5
            L2a:
                int r7 = -r7
                int r3 = r3 + 1
                int r8 = r8 + r7
                int r7 = r8 + (-1)
                r8 = r3
                r3 = r4
                goto L14
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapFragment.zza.c(short, short, byte, java.lang.Object[]):void");
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            int i = 2 % 2;
            GoogleMapOptions googleMapOptions = (GoogleMapOptions) bundle.getParcelable("MapOptions");
            try {
                Bundle bundle3 = new Bundle();
                zzby.zza(bundle2, bundle3);
                this.zzbb.onInflate(ObjectWrapper.wrap(activity), googleMapOptions, bundle3);
                zzby.zza(bundle3, bundle2);
                int i2 = IconCompatParcelizer + 1;
                read = i2 % 128;
                int i3 = i2 % 2;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onCreate(Bundle bundle) throws Throwable {
            Object[] objArr;
            char c;
            int i = 2 % 2;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
            if (objRemoteActionCompatParcelizer == null) {
                char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13182);
                int maximumDrawingCacheSize = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1649;
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 26;
                byte[] bArr = $$a;
                byte b = bArr[5];
                byte b2 = bArr[53];
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(c2, maximumDrawingCacheSize, offsetAfter, -133433128, false, (String) objArr2[0], null);
            }
            Object obj = null;
            if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
                int i2 = read + 113;
                IconCompatParcelizer = i2 % 128;
                if (i2 % 2 != 0) {
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        char defaultSize = (char) (13183 - View.getDefaultSize(0, 0));
                        int size = 1649 - View.MeasureSpec.getSize(0);
                        int tapTimeout = 26 - (ViewConfiguration.getTapTimeout() >> 16);
                        byte[] bArr2 = $$a;
                        byte b3 = (byte) (-bArr2[27]);
                        byte b4 = bArr2[5];
                        Object[] objArr3 = new Object[1];
                        a(b3, b4, b4, objArr3);
                        objRemoteActionCompatParcelizer2 = startForeground.read(defaultSize, size, tapTimeout, -1033747278, false, (String) objArr3[0], null);
                    }
                    obj.hashCode();
                    throw null;
                }
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cIndexOf = (char) (13182 - TextUtils.indexOf((CharSequence) "", '0', 0));
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 1649;
                    int iIndexOf2 = 25 - TextUtils.indexOf((CharSequence) "", '0');
                    byte[] bArr3 = $$a;
                    byte b5 = (byte) (-bArr3[27]);
                    byte b6 = bArr3[5];
                    Object[] objArr4 = new Object[1];
                    a(b5, b6, b6, objArr4);
                    objRemoteActionCompatParcelizer3 = startForeground.read(cIndexOf, iIndexOf, iIndexOf2, -1033747278, false, (String) objArr4[0], null);
                }
                objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
                c = 3;
            } else {
                Object[] objArr5 = new Object[1];
                b(16 - TextUtils.getOffsetBefore("", 0), new int[]{-1032462920, -909949897, -292537524, 591651070, 660593279, -1008777772, -110535144, 712306577}, objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                b(MotionEvent.axisFromString("") + 17, new int[]{2029959676, -1331283643, -1888717159, -2085417970, -26961978, 1197168754, -784015016, 112778171}, objArr6);
                try {
                    Object[] objArr7 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue()), 0, 782709379};
                    byte[] bArr4 = $$d;
                    byte b7 = (byte) (-bArr4[50]);
                    Object[] objArr8 = new Object[1];
                    c(b7, (byte) (b7 - 1), (byte) ($$e + 5), objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    byte b8 = bArr4[44];
                    byte b9 = b8;
                    Object[] objArr9 = new Object[1];
                    c(b8, b9, (byte) (b9 | 19), objArr9);
                    objArr = (Object[]) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr7);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char scrollDefaultDelay = (char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 13183);
                        int offsetAfter2 = TextUtils.getOffsetAfter("", 0) + 1649;
                        int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 26;
                        byte[] bArr5 = $$a;
                        byte b10 = (byte) (-bArr5[27]);
                        byte b11 = bArr5[5];
                        Object[] objArr10 = new Object[1];
                        a(b10, b11, b11, objArr10);
                        objRemoteActionCompatParcelizer4 = startForeground.read(scrollDefaultDelay, offsetAfter2, threadPriority, -1033747278, false, (String) objArr10[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                    try {
                        Object[] objArr11 = new Object[1];
                        b(22 - KeyEvent.getDeadChar(0, 0), new int[]{1424741725, 2144820916, -1003351861, 1842368833, -2030919978, 2036472618, 248558291, 161782070, -190137123, 623021831, -318731038, -276671264}, objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        b(15 - (ViewConfiguration.getPressedStateDuration() >> 16), new int[]{-1220744261, 1603041339, 1875329433, -477824580, 319348822, 986701409, 155693965, -1406164230}, objArr12);
                        long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(2104791916);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            char c3 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13182);
                            int gidForName = 1648 - Process.getGidForName("");
                            int i3 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25;
                            byte b12 = (byte) ($$b & 333);
                            byte b13 = $$a[5];
                            Object[] objArr13 = new Object[1];
                            a(b12, b13, b13, objArr13);
                            objRemoteActionCompatParcelizer5 = startForeground.read(c3, gidForName, i3, 54351865, false, (String) objArr13[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                        if (objRemoteActionCompatParcelizer6 == null) {
                            char offsetBefore = (char) (13183 - TextUtils.getOffsetBefore("", 0));
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 1650;
                            int capsMode = TextUtils.getCapsMode("", 0, 0) + 26;
                            byte[] bArr6 = $$a;
                            byte b14 = bArr6[5];
                            byte b15 = bArr6[53];
                            Object[] objArr14 = new Object[1];
                            a(b14, b15, b15, objArr14);
                            objRemoteActionCompatParcelizer6 = startForeground.read(offsetBefore, iLastIndexOf, capsMode, -133433128, false, (String) objArr14[0], null);
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
            int i4 = ((int[]) objArr[c])[0];
            int i5 = ((int[]) objArr[2])[0];
            if (i5 != i4) {
                long j = -1;
                long j2 = 0;
                long j3 = (((long) (i4 ^ i5)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
                try {
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        objRemoteActionCompatParcelizer7 = startForeground.read((char) ((KeyEvent.getMaxKeyCode() >> 16) + 4535), (-16771162) - Color.rgb(0, 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, null);
                    ArrayList arrayList = new ArrayList();
                    String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                    int i6 = IconCompatParcelizer + 11;
                    read = i6 % 128;
                    int i7 = i6 % 2;
                    try {
                        Object[] objArr15 = {-1260995858, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                        Class cls4 = (Class) startForeground.IconCompatParcelizer((char) Gravity.getAbsoluteGravity(0, 0), KeyEvent.keyCodeFromString("") + 6030, KeyEvent.getDeadChar(0, 0) + 24);
                        byte[] bArr7 = $$d;
                        Object[] objArr16 = new Object[1];
                        c(bArr7[27], bArr7[16], bArr7[44], objArr16);
                        cls4.getMethod((String) objArr16[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr15);
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
            try {
                Bundle bundle2 = new Bundle();
                zzby.zza(bundle, bundle2);
                Bundle arguments = this.zzba.getArguments();
                if (arguments != null && !(!arguments.containsKey("MapOptions"))) {
                    int i8 = read + 27;
                    IconCompatParcelizer = i8 % 128;
                    if (i8 % 2 != 0) {
                        zzby.zza(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
                        throw null;
                    }
                    zzby.zza(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
                }
                this.zzbb.onCreate(bundle2);
                zzby.zza(bundle2, bundle);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            int i = 2 % 2;
            try {
                Bundle bundle2 = new Bundle();
                zzby.zza(bundle, bundle2);
                IObjectWrapper iObjectWrapperOnCreateView = this.zzbb.onCreateView(ObjectWrapper.wrap(layoutInflater), ObjectWrapper.wrap(viewGroup), bundle2);
                zzby.zza(bundle2, bundle);
                View view = (View) ObjectWrapper.unwrap(iObjectWrapperOnCreateView);
                int i2 = read + 47;
                IconCompatParcelizer = i2 % 128;
                if (i2 % 2 == 0) {
                    return view;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        private static void b(int i, int[] iArr, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
            char[] cArr = new char[4];
            char[] cArr2 = new char[iArr.length * 2];
            int[] iArr2 = RemoteActionCompatParcelizer;
            int i3 = 43695;
            int i4 = 16;
            int i5 = 0;
            if (iArr2 != null) {
                int length = iArr2.length;
                int[] iArr3 = new int[length];
                int i6 = 0;
                while (i6 < length) {
                    int i7 = $11 + 101;
                    $10 = i7 % 128;
                    if (i7 % 2 != 0) {
                        try {
                            Object[] objArr2 = {Integer.valueOf(iArr2[i6])};
                            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-470782045);
                            if (objRemoteActionCompatParcelizer == null) {
                                objRemoteActionCompatParcelizer = startForeground.read((char) (i3 - (ViewConfiguration.getLongPressTimeout() >> i4)), KeyEvent.keyCodeFromString("") + 23297, 15 - (Process.myPid() >> 22), -1648776394, false, "A", new Class[]{Integer.TYPE});
                            }
                            iArr3[i6] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                        } catch (Throwable th) {
                            Throwable cause = th.getCause();
                            if (cause == null) {
                                throw th;
                            }
                            throw cause;
                        }
                    } else {
                        Object[] objArr3 = {Integer.valueOf(iArr2[i6])};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (43695 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), View.MeasureSpec.getMode(0) + 23297, View.resolveSize(0, 0) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                        }
                        iArr3[i6] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                        i6++;
                    }
                    i3 = 43695;
                    i4 = 16;
                }
                int i8 = $10 + 21;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                iArr2 = iArr3;
            }
            int length2 = iArr2.length;
            int[] iArr4 = new int[length2];
            int[] iArr5 = RemoteActionCompatParcelizer;
            if (iArr5 != null) {
                int length3 = iArr5.length;
                int[] iArr6 = new int[length3];
                int i10 = $10 + 21;
                $11 = i10 % 128;
                int i11 = 2;
                int i12 = i10 % 2;
                int i13 = 0;
                while (i13 < length3) {
                    int i14 = $10 + 117;
                    $11 = i14 % 128;
                    if (i14 % i11 == 0) {
                        Object[] objArr4 = new Object[1];
                        objArr4[i5] = Integer.valueOf(iArr5[i13]);
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-470782045);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 43695), 23297 - View.MeasureSpec.getSize(i5), (Process.myTid() >> 22) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                        }
                        iArr6[i13] = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                    } else {
                        Object[] objArr5 = {Integer.valueOf(iArr5[i13])};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-470782045);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) (43695 - View.MeasureSpec.getSize(0)), 23297 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 15 - View.resolveSize(0, 0), -1648776394, false, "A", new Class[]{Integer.TYPE});
                        }
                        iArr6[i13] = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        i13++;
                    }
                    i5 = 0;
                    i11 = 2;
                }
                iArr5 = iArr6;
            }
            int i15 = i5;
            System.arraycopy(iArr5, i15, iArr4, i15, length2);
            buildremovealldownloadsintent.RemoteActionCompatParcelizer = i15;
            while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
                int i16 = $10 + 43;
                $11 = i16 % 128;
                int i17 = i16 % 2;
                cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
                cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
                cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
                cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
                buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
                buildRemoveAllDownloadsIntent.read(iArr4);
                int i18 = 0;
                for (int i19 = 16; i18 < i19; i19 = 16) {
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i18];
                    Object[] objArr6 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        objRemoteActionCompatParcelizer5 = startForeground.read((char) (43695 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), 23296 - Process.getGidForName(""), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15, -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).intValue();
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                    buildremovealldownloadsintent.read = iIntValue;
                    i18++;
                }
                int i20 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = i20;
                buildremovealldownloadsintent.read ^= iArr4[16];
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[17];
                int i21 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
                int i22 = buildremovealldownloadsintent.read;
                cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
                cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
                cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
                cArr[3] = (char) buildremovealldownloadsintent.read;
                buildRemoveAllDownloadsIntent.read(iArr4);
                cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
                cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
                cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
                cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
                Object[] objArr7 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(516305436);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (Color.blue(0) + 48194), 20126 - TextUtils.getOffsetAfter("", 0), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19, 1620047497, false, "I", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
            String str = new String(cArr2, 0, i);
            int i23 = $10 + 107;
            $11 = i23 % 128;
            int i24 = i23 % 2;
            objArr[0] = str;
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onStart() {
            int i = 2 % 2;
            int i2 = read + 11;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            try {
                this.zzbb.onStart();
                int i4 = IconCompatParcelizer + 27;
                read = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onResume() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 101;
            read = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    this.zzbb.onResume();
                } else {
                    this.zzbb.onResume();
                    throw null;
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onPause() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 125;
            read = i2 % 128;
            int i3 = i2 % 2;
            try {
                this.zzbb.onPause();
                int i4 = read + 11;
                IconCompatParcelizer = i4 % 128;
                int i5 = i4 % 2;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onStop() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 83;
            read = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    this.zzbb.onStop();
                    int i3 = 98 / 0;
                } else {
                    this.zzbb.onStop();
                }
                int i4 = read + 107;
                IconCompatParcelizer = i4 % 128;
                if (i4 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onDestroyView() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 57;
            read = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    this.zzbb.onDestroyView();
                    int i3 = 94 / 0;
                } else {
                    this.zzbb.onDestroyView();
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onDestroy() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 35;
            read = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    this.zzbb.onDestroy();
                    int i3 = read + 25;
                    IconCompatParcelizer = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                }
                this.zzbb.onDestroy();
                throw null;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onLowMemory() {
            int i = 2 % 2;
            int i2 = read + 103;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            try {
                this.zzbb.onLowMemory();
                int i4 = IconCompatParcelizer + 17;
                read = i4 % 128;
                if (i4 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onSaveInstanceState(Bundle bundle) {
            int i = 2 % 2;
            try {
                Bundle bundle2 = new Bundle();
                zzby.zza(bundle, bundle2);
                this.zzbb.onSaveInstanceState(bundle2);
                zzby.zza(bundle2, bundle);
                int i2 = read + 53;
                IconCompatParcelizer = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.maps.internal.MapLifecycleDelegate
        public final void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
            int i = 2 % 2;
            try {
                this.zzbb.getMapAsync(new zzab(this, onMapReadyCallback));
                int i2 = IconCompatParcelizer + 21;
                read = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 73 / 0;
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onEnterAmbient(Bundle bundle) {
            int i = 2 % 2;
            try {
                Bundle bundle2 = new Bundle();
                zzby.zza(bundle, bundle2);
                this.zzbb.onEnterAmbient(bundle2);
                zzby.zza(bundle2, bundle);
                int i2 = IconCompatParcelizer + 39;
                read = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onExitAmbient() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 43;
            read = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    this.zzbb.onExitAmbient();
                    return;
                }
                this.zzbb.onExitAmbient();
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 29;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            super.onAttach(activity);
            this.zzaz.setActivity(activity);
            int i3 = 1 / 0;
        } else {
            super.onAttach(activity);
            this.zzaz.setActivity(activity);
        }
    }

    @Override // android.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        int i = 2 % 2;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            this.zzaz.setActivity(activity);
            GoogleMapOptions googleMapOptionsCreateFromAttributes = GoogleMapOptions.createFromAttributes(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", googleMapOptionsCreateFromAttributes);
            this.zzaz.onInflate(activity, bundle2, bundle);
            StrictMode.setThreadPolicy(threadPolicy);
            int i2 = MediaBrowserCompatItemReceiver + 105;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 11 / 0;
            }
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char cResolveSize = (char) (View.resolveSize(0, 0) + 13183);
            int iResolveOpacity = 1649 - Drawable.resolveOpacity(0, 0);
            int iBlue = 26 - Color.blue(0);
            byte b = $$a[5];
            Object[] objArr2 = new Object[1];
            a((byte) 76, b, b, objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(cResolveSize, iResolveOpacity, iBlue, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            int i2 = MediaBrowserCompatItemReceiver + 75;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char pressedStateDuration = (char) (13183 - (ViewConfiguration.getPressedStateDuration() >> 16));
                int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 1649;
                int iAlpha = 26 - Color.alpha(0);
                byte[] bArr = $$a;
                byte b2 = bArr[39];
                byte b3 = bArr[17];
                Object[] objArr3 = new Object[1];
                a(b2, b3, b3, objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(pressedStateDuration, iCombineMeasuredStates, iAlpha, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
        } else {
            Object[] objArr4 = new Object[1];
            b((byte) (61 - ExpandableListView.getPackedPositionChild(0L)), (-1586351446) - TextUtils.lastIndexOf("", '0', 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 628505158, (short) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 15), TextUtils.indexOf((CharSequence) "", '0') - 30, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b((byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 23), (-1586351446) - (ViewConfiguration.getScrollDefaultDelay() >> 16), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 628505142, (short) (TextUtils.lastIndexOf("", '0', 0, 0) + 122), (-31) - (Process.myPid() >> 22), objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 21;
            MediaBrowserCompatItemReceiver = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -2098573063};
                byte[] bArr2 = $$d;
                Object[] objArr7 = new Object[1];
                c((byte) 29, (byte) (-bArr2[29]), (byte) (bArr2[42] - 1), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                c((byte) (bArr2[23] - 1), (byte) (-bArr2[6]), bArr2[0], objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char scrollBarFadeDuration = (char) (13183 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    int i6 = 1650 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    int pressedStateDuration2 = 26 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    byte[] bArr3 = $$a;
                    byte b4 = bArr3[39];
                    byte b5 = bArr3[17];
                    Object[] objArr9 = new Object[1];
                    a(b4, b5, b5, objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(scrollBarFadeDuration, i6, pressedStateDuration2, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b((byte) (65 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (-1586351454) - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (-628505126) - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (short) ((-112) - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (-25) - TextUtils.getOffsetBefore("", 0), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b((byte) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 48), (-1586351450) - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (-628505106) - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (short) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 111), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 33, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char size = (char) (View.MeasureSpec.getSize(0) + 13183);
                        int gidForName = Process.getGidForName("") + 1650;
                        int size2 = View.MeasureSpec.getSize(0) + 26;
                        byte[] bArr4 = $$a;
                        byte b6 = bArr4[5];
                        byte b7 = bArr4[17];
                        Object[] objArr12 = new Object[1];
                        a(b6, b7, b7, objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(size, gidForName, size2, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char c = (char) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13183);
                        int i7 = (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1649;
                        int windowTouchSlop = 26 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        byte b8 = $$a[5];
                        Object[] objArr13 = new Object[1];
                        a((byte) 76, b8, b8, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(c, i7, windowTouchSlop, -133433128, false, (String) objArr13[0], null);
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
        int i8 = ((int[]) objArr[3])[0];
        int i9 = ((int[]) objArr[2])[0];
        if (i9 != i8) {
            long j = -1;
            long j2 = ((long) (i9 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (4534 - TextUtils.lastIndexOf("", '0', 0, 0)), 6054 - (ViewConfiguration.getDoubleTapTimeout() >> 16), TextUtils.indexOf((CharSequence) "", '0') + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i10 = MediaBrowserCompatCustomActionResultReceiver + 65;
                MediaBrowserCompatItemReceiver = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Object[] objArr14 = {10818021, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) TextUtils.indexOf("", ""), Color.red(0) + 6030, 23 - TextUtils.lastIndexOf("", '0', 0, 0));
                    byte b9 = (byte) ($$d[42] - 1);
                    Object[] objArr15 = new Object[1];
                    c(b9, b9, r2[45], objArr15);
                    cls4.getMethod((String) objArr15[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr14);
                    int i12 = MediaBrowserCompatItemReceiver + 99;
                    MediaBrowserCompatCustomActionResultReceiver = i12 % 128;
                    int i13 = i12 % 2;
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
        this.zzaz.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 103;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        View viewOnCreateView = (i2 % 2 != 0 ? this.zzaz : this.zzaz).onCreateView(layoutInflater, viewGroup, bundle);
        viewOnCreateView.setClickable(true);
        int i3 = MediaBrowserCompatItemReceiver + 29;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 81 / 0;
        }
        return viewOnCreateView;
    }

    @Override // android.app.Fragment
    public void onResume() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 29;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            super.onResume();
            this.zzaz.onResume();
        } else {
            super.onResume();
            this.zzaz.onResume();
            throw null;
        }
    }

    @Override // android.app.Fragment
    public void onPause() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 105;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            this.zzaz.onPause();
            super.onPause();
        } else {
            this.zzaz.onPause();
            super.onPause();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // android.app.Fragment
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 103;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            super.onStart();
            this.zzaz.onStart();
            int i3 = MediaBrowserCompatItemReceiver + 107;
            MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 77 / 0;
                return;
            }
            return;
        }
        super.onStart();
        this.zzaz.onStart();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Fragment
    public void onStop() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 45;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            this.zzaz.onStop();
            super.onStop();
            int i3 = 20 / 0;
        } else {
            this.zzaz.onStop();
            super.onStop();
        }
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 73;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            this.zzaz.onDestroyView();
            super.onDestroyView();
            int i3 = 39 / 0;
        } else {
            this.zzaz.onDestroyView();
            super.onDestroyView();
        }
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 81;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        this.zzaz.onDestroy();
        super.onDestroy();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 45;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 119;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            this.zzaz.onLowMemory();
            super.onLowMemory();
        } else {
            this.zzaz.onLowMemory();
            super.onLowMemory();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        int i = 2 % 2;
        if (bundle != null) {
            int i2 = MediaBrowserCompatItemReceiver + 107;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            if (i2 % 2 == 0) {
                bundle.setClassLoader(MapFragment.class.getClassLoader());
            } else {
                bundle.setClassLoader(MapFragment.class.getClassLoader());
                throw null;
            }
        }
        super.onActivityCreated(bundle);
        int i3 = MediaBrowserCompatCustomActionResultReceiver + 91;
        MediaBrowserCompatItemReceiver = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 89 / 0;
        }
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = i2 + 113;
        MediaBrowserCompatItemReceiver = i3 % 128;
        int i4 = i3 % 2;
        if (bundle != null) {
            int i5 = i2 + 63;
            MediaBrowserCompatItemReceiver = i5 % 128;
            if (i5 % 2 != 0) {
                bundle.setClassLoader(MapFragment.class.getClassLoader());
                int i6 = MediaBrowserCompatItemReceiver + 119;
                MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
                int i7 = i6 % 2;
            } else {
                bundle.setClassLoader(MapFragment.class.getClassLoader());
                throw null;
            }
        }
        super.onSaveInstanceState(bundle);
        this.zzaz.onSaveInstanceState(bundle);
    }

    public final void onEnterAmbient(Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 13;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            Preconditions.checkMainThread("onEnterAmbient must be called on the main thread.");
            zzb zzbVar = this.zzaz;
            if (zzbVar.getDelegate() != null) {
                zzbVar.getDelegate().onEnterAmbient(bundle);
            }
            int i3 = MediaBrowserCompatItemReceiver + 33;
            MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        Preconditions.checkMainThread("onEnterAmbient must be called on the main thread.");
        this.zzaz.getDelegate();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExitAmbient() {
        int i = 2 % 2;
        Preconditions.checkMainThread("onExitAmbient must be called on the main thread.");
        zzb zzbVar = this.zzaz;
        if (zzbVar.getDelegate() != null) {
            int i2 = MediaBrowserCompatItemReceiver + 23;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            zzbVar.getDelegate().onExitAmbient();
            if (i3 != 0) {
                int i4 = 67 / 0;
            }
        }
        int i5 = MediaBrowserCompatCustomActionResultReceiver + 67;
        MediaBrowserCompatItemReceiver = i5 % 128;
        int i6 = i5 % 2;
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 39;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            Preconditions.checkMainThread("getMapAsync must be called on the main thread.");
            this.zzaz.getMapAsync(onMapReadyCallback);
        } else {
            Preconditions.checkMainThread("getMapAsync must be called on the main thread.");
            this.zzaz.getMapAsync(onMapReadyCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // android.app.Fragment
    public void setArguments(Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 35;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.setArguments(bundle);
        if (i3 == 0) {
            throw null;
        }
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 123;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static void b(byte b, int i, int i2, short s, int i3, Object[] objArr) throws Throwable {
        long j;
        int i4 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(AudioAttributesCompatParcelizer)};
            int i5 = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            long j2 = 0;
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 24297 - Color.green(0), 12 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            int i6 = iIntValue == -1 ? 1 : 0;
            if ((i6 ^ 1) != 0) {
                j = 7899112766888837815L;
            } else {
                int i7 = $11;
                int i8 = i7 + 83;
                $10 = i8 % 128;
                if (i8 % 2 != 0) {
                    throw null;
                }
                byte[] bArr = IconCompatParcelizer;
                if (bArr != null) {
                    int i9 = i7 + 121;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i11 = 0;
                    while (i11 < length) {
                        Object[] objArr3 = new Object[1];
                        objArr3[i5] = Integer.valueOf(bArr[i11]);
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b2 = (byte) i5;
                            byte b3 = b2;
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.keyCodeFromString(""), 3083 - (ViewConfiguration.getGlobalActionKeyTimeout() > j2 ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j2 ? 0 : -1)), KeyEvent.keyCodeFromString("") + 128, 2145850993, false, $$g(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i11] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i11++;
                        i5 = 0;
                        j2 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    int i12 = $11 + 31;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    byte[] bArr3 = IconCompatParcelizer;
                    try {
                        Object[] objArr4 = {Integer.valueOf(i2), Integer.valueOf(RemoteActionCompatParcelizer)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (Process.myPid() >> 22) + 24297, 11 - Process.getGidForName(""), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesCompatParcelizer) ^ 7899112766888837815L)));
                        j = 7899112766888837815L;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    j = 7899112766888837815L;
                    iIntValue = (short) (((short) (((long) write[i2 + ((int) (((long) RemoteActionCompatParcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesCompatParcelizer) ^ 7899112766888837815L)));
                }
            }
            if (iIntValue > 0) {
                buildresumedownloadsintent.read = ((i2 + iIntValue) - 2) + ((int) (((long) RemoteActionCompatParcelizer) ^ j)) + i6;
                Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i), Integer.valueOf(read), sb};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 34134), (ViewConfiguration.getLongPressTimeout() >> 16) + 13432, TextUtils.indexOf((CharSequence) "", '0') + 22, 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr4 = IconCompatParcelizer;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i14 = 0; i14 < length2; i14++) {
                        bArr5[i14] = (byte) (((long) bArr4[i14]) ^ 7899112766888837815L);
                    }
                    int i15 = $11 + 71;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    bArr4 = bArr5;
                }
                boolean z = bArr4 != null;
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    if (z) {
                        byte[] bArr6 = IconCompatParcelizer;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        short[] sArr = write;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                        int i17 = $11 + 7;
                        $10 = i17 % 128;
                        int i18 = i17 % 2;
                    }
                    sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                }
            }
            String string = sb.toString();
            int i19 = $10 + 93;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            objArr[0] = string;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }
}
