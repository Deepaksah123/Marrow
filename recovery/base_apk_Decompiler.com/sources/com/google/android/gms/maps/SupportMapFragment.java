package com.google.android.gms.maps;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
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
import kotlin.clearDownloadManagerHelpers;
import kotlin.isStopped;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public class SupportMapFragment extends Fragment {
    private final zzb zzch = new zzb(this);
    private static final byte[] $$c = {57, 34, -8, 64};
    private static final int $$f = 73;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, TarConstants.LF_GNUTYPE_LONGNAME, 9, 62, 61, -61, -2, -19, 44, -53, -1, 13, -23, 7, -10, -3, 29, -32, -7, -4, -1, -14, -30, -16, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17, -23, -12, -6, -9, 11, 32, -38, -21, 7, -10, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17};
    private static final int $$e = 183;
    private static final byte[] $$a = {93, -16, 105, -74, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 201;
    private static int read = 0;
    private static int AudioAttributesImplApi26Parcelizer = 1;
    private static char write = 25699;
    private static char IconCompatParcelizer = 33755;
    private static char AudioAttributesCompatParcelizer = 723;
    private static char RemoteActionCompatParcelizer = 15421;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r5, short r6, byte r7) {
        /*
            int r6 = r6 * 4
            int r6 = 1 - r6
            byte[] r0 = com.google.android.gms.maps.SupportMapFragment.$$c
            int r5 = r5 + 4
            int r7 = r7 * 2
            int r7 = 122 - r7
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L22:
            int r5 = r5 + 1
            r4 = r0[r5]
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.SupportMapFragment.$$g(int, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 10
            int r6 = r6 + 34
            int r7 = r7 + 4
            byte[] r0 = com.google.android.gms.maps.SupportMapFragment.$$a
            int r5 = r5 * 12
            int r5 = 77 - r5
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r4 = r5
            r5 = r6
            r3 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r5
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L25:
            r4 = r0[r7]
        L27:
            int r7 = r7 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.SupportMapFragment.a(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = 40 - r8
            int r7 = 28 - r7
            int r9 = 111 - r9
            byte[] r0 = com.google.android.gms.maps.SupportMapFragment.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r7
            r5 = r2
            goto L27
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r7) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r8]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r9 = -r9
            int r3 = r3 + r9
            int r9 = r3 + (-4)
            r3 = r5
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.SupportMapFragment.c(short, int, byte, java.lang.Object[]):void");
    }

    public static SupportMapFragment newInstance() {
        int i = 2 % 2;
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        int i2 = read + 57;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return supportMapFragment;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class zzb extends DeferredLifecycleHelper<zza> {
        private final Fragment fragment;
        private OnDelegateCreatedListener<zza> zzbd;
        private Activity zzbe;
        private final List<OnMapReadyCallback> zzbf = new ArrayList();

        zzb(Fragment fragment) {
            this.fragment = fragment;
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
                    this.zzbd.onDelegateCreated(new zza(this.fragment, iMapFragmentDelegateZzc));
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

    public static SupportMapFragment newInstance(GoogleMapOptions googleMapOptions) {
        int i = 2 % 2;
        SupportMapFragment supportMapFragment = new SupportMapFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("MapOptions", googleMapOptions);
        supportMapFragment.setArguments(bundle);
        int i2 = AudioAttributesImplApi26Parcelizer + 75;
        read = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 84 / 0;
        }
        return supportMapFragment;
    }

    static final class zza implements MapLifecycleDelegate {
        private static int $10 = 0;
        private static int $11 = 1;
        private final Fragment fragment;
        private final IMapFragmentDelegate zzbb;
        private static final byte[] $$d = {25, 68, TarConstants.LF_LINK, 97, -74, 14, -7, -4, -2, 25, -12, -21, -14, -7, -7, -26, 8, 10, -13, -8, -12, -22, -74, 74, -14, -18, 2, -24, 17, 3, -10, -52, 35, -11, -6, -24, 10, -45, 8, 8, -24, -7, -2, -12, 8, -30, 4, 10, -1, -7, -4, -24, -45, 25, 8, -20, -3, -10, -52, 35, -11, -6, -24, 10, -45, 8, 8, -24, -7, -2, -12, 8, -30, 4};
        private static final int $$e = 104;
        private static final byte[] $$a = {123, -86, 125, 25, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
        private static final int $$b = 210;
        private static int IconCompatParcelizer = 0;
        private static int read = 1;
        private static int RemoteActionCompatParcelizer = 1000326150;

        public zza(Fragment fragment, IMapFragmentDelegate iMapFragmentDelegate) {
            this.zzbb = (IMapFragmentDelegate) Preconditions.checkNotNull(iMapFragmentDelegate);
            this.fragment = (Fragment) Preconditions.checkNotNull(fragment);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(short r7, byte r8, byte r9, java.lang.Object[] r10) {
            /*
                int r8 = r8 + 4
                int r7 = r7 * 10
                int r7 = r7 + 34
                int r9 = r9 * 12
                int r9 = 77 - r9
                byte[] r0 = com.google.android.gms.maps.SupportMapFragment.zza.$$a
                byte[] r1 = new byte[r7]
                r2 = 0
                if (r0 != 0) goto L15
                r3 = r9
                r4 = r2
                r9 = r8
                goto L2d
            L15:
                r3 = r2
            L16:
                int r4 = r3 + 1
                byte r5 = (byte) r9
                r1[r3] = r5
                int r8 = r8 + 1
                if (r4 != r7) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r8]
                r6 = r9
                r9 = r8
                r8 = r3
                r3 = r6
            L2d:
                int r8 = -r8
                int r3 = r3 + r8
                int r8 = r3 + (-1)
                r3 = r4
                r6 = r9
                r9 = r8
                r8 = r6
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.SupportMapFragment.zza.a(short, byte, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void c(byte r6, short r7, short r8, java.lang.Object[] r9) {
            /*
                int r7 = 47 - r7
                byte[] r0 = com.google.android.gms.maps.SupportMapFragment.zza.$$d
                int r1 = 28 - r8
                int r6 = r6 + 73
                byte[] r1 = new byte[r1]
                int r8 = 27 - r8
                r2 = 0
                if (r0 != 0) goto L12
                r3 = r7
                r4 = r2
                goto L27
            L12:
                r3 = r2
            L13:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L22
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L22:
                r3 = r0[r7]
                r5 = r3
                r3 = r7
                r7 = r5
            L27:
                int r6 = r6 + r7
                int r6 = r6 + 9
                int r7 = r3 + 1
                r3 = r4
                goto L13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.SupportMapFragment.zza.c(byte, short, short, java.lang.Object[]):void");
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
                int i2 = IconCompatParcelizer + 15;
                read = i2 % 128;
                int i3 = i2 % 2;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        private static void b(int i, boolean z, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
            char[] cArr2 = new char[i2];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                int i5 = $11 + 67;
                $10 = i5 % 128;
                int i6 = i5 % 2;
                cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
                cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i3 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
                int i7 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(RemoteActionCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 23705 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 32 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 44862), 18944 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 28 - View.MeasureSpec.getMode(0), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            if (i > 0) {
                int i8 = $11 + 31;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                cleardownloadmanagerhelpers.write = i;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
                System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i2 - cleardownloadmanagerhelpers.write);
            }
            if (!(!z)) {
                char[] cArr4 = new char[i2];
                cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
                while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                    cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                    try {
                        Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (44861 - TextUtils.lastIndexOf("", '0', 0, 0)), 18944 - (ViewConfiguration.getPressedStateDuration() >> 16), 28 - ((Process.getThreadPriority(0) + 20) >> 6), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                int i10 = $11 + 27;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onCreate(Bundle bundle) throws Throwable {
            Object[] objArr;
            char c;
            int i = 2 % 2;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
            if (objRemoteActionCompatParcelizer == null) {
                char offsetBefore = (char) (13183 - TextUtils.getOffsetBefore("", 0));
                int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1650;
                int iResolveSize = 26 - View.resolveSize(0, 0);
                byte[] bArr = $$a;
                Object[] objArr2 = new Object[1];
                a(bArr[17], bArr[53], bArr[5], objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(offsetBefore, iLastIndexOf, iResolveSize, -133433128, false, (String) objArr2[0], null);
            }
            if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
                int i2 = read + 23;
                IconCompatParcelizer = i2 % 128;
                if (i2 % 2 != 0) {
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 13183);
                        int pressedStateDuration = 1649 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        int defaultSize = 26 - View.getDefaultSize(0, 0);
                        byte[] bArr2 = $$a;
                        Object[] objArr3 = new Object[1];
                        a(bArr2[5], bArr2[65], bArr2[17], objArr3);
                        objRemoteActionCompatParcelizer2 = startForeground.read(keyRepeatDelay, pressedStateDuration, defaultSize, -1033747278, false, (String) objArr3[0], null);
                    }
                    throw null;
                }
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 13183);
                    int scrollBarFadeDuration = 1649 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 27;
                    byte[] bArr3 = $$a;
                    Object[] objArr4 = new Object[1];
                    a(bArr3[5], bArr3[65], bArr3[17], objArr4);
                    objRemoteActionCompatParcelizer3 = startForeground.read(cKeyCodeFromString, scrollBarFadeDuration, modifierMetaStateMask, -1033747278, false, (String) objArr4[0], null);
                }
                objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
                c = 3;
            } else {
                Object[] objArr5 = new Object[1];
                b((-16777210) - Color.rgb(0, 0, 0), true, new char[]{'\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23, 65521, 65484, 5, '\f', 65535}, 17 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 159 - Gravity.getAbsoluteGravity(0, 0), objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                b(15 - Color.blue(0), true, new char[]{65534, '\t', 65501, 2, '\r', 65531, 65506, 19, 14, 3, 14, '\b', 65535, 65534, 3, 65535}, View.resolveSizeAndState(0, 0, 0) + 16, 163 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr6);
                int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
                int i3 = IconCompatParcelizer + 99;
                read = i3 % 128;
                int i4 = i3 % 2;
                try {
                    Object[] objArr7 = {Integer.valueOf(iIntValue), 0, -1188132748};
                    byte b = (byte) 38;
                    byte[] bArr4 = $$d;
                    Object[] objArr8 = new Object[1];
                    c(b, (byte) (b + 5), bArr4[29], objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    byte b2 = (byte) (bArr4[48] + 1);
                    Object[] objArr9 = new Object[1];
                    c(b2, (byte) (b2 | 19), bArr4[16], objArr9);
                    objArr = (Object[]) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr7);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char c2 = (char) (13183 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                        int modifierMetaStateMask2 = 1648 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int longPressTimeout = 26 - (ViewConfiguration.getLongPressTimeout() >> 16);
                        byte[] bArr5 = $$a;
                        Object[] objArr10 = new Object[1];
                        a(bArr5[5], bArr5[65], bArr5[17], objArr10);
                        objRemoteActionCompatParcelizer4 = startForeground.read(c2, modifierMetaStateMask2, longPressTimeout, -1033747278, false, (String) objArr10[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                    try {
                        Object[] objArr11 = new Object[1];
                        b(Drawable.resolveOpacity(0, 0) + 8, true, new char[]{65483, 1, 6, '\f', 15, 1, 11, 65534, '\b', 0, '\f', '\t', 65504, '\n', 2, 17, 16, 22, 65520, 65483, 16, '\f'}, TextUtils.indexOf("", "", 0) + 22, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 160, objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        b((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 12, false, new char[]{'\t', '\f', 65534, 65533, 65515, 65534, 65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530}, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 15, 164 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), objArr12);
                        long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(2104791916);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            char cMakeMeasureSpec = (char) (13183 - View.MeasureSpec.makeMeasureSpec(0, 0));
                            int keyRepeatTimeout = 1649 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                            int defaultSize2 = 26 - View.getDefaultSize(0, 0);
                            byte b3 = $$a[5];
                            Object[] objArr13 = new Object[1];
                            a(b3, (byte) (b3 | TarConstants.LF_GNUTYPE_LONGLINK), r15[17], objArr13);
                            objRemoteActionCompatParcelizer5 = startForeground.read(cMakeMeasureSpec, keyRepeatTimeout, defaultSize2, 54351865, false, (String) objArr13[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                        if (objRemoteActionCompatParcelizer6 == null) {
                            char c3 = (char) (13184 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)));
                            int scrollBarFadeDuration2 = 1649 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                            int pressedStateDuration2 = (ViewConfiguration.getPressedStateDuration() >> 16) + 26;
                            byte[] bArr6 = $$a;
                            Object[] objArr14 = new Object[1];
                            a(bArr6[17], bArr6[53], bArr6[5], objArr14);
                            objRemoteActionCompatParcelizer6 = startForeground.read(c3, scrollBarFadeDuration2, pressedStateDuration2, -133433128, false, (String) objArr14[0], null);
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
            int i5 = ((int[]) objArr[c])[0];
            int i6 = ((int[]) objArr[2])[0];
            if (i6 != i5) {
                long j = -1;
                long j2 = 0;
                long j3 = (((long) (i5 ^ i6)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
                try {
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        objRemoteActionCompatParcelizer7 = startForeground.read((char) (4535 - KeyEvent.getDeadChar(0, 0)), 6054 - TextUtils.getTrimmedLength(""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, null);
                    ArrayList arrayList = new ArrayList();
                    String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                    int i7 = read + 5;
                    IconCompatParcelizer = i7 % 128;
                    int i8 = i7 % 2;
                    try {
                        Object[] objArr15 = {-215011739, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                        Class cls4 = (Class) startForeground.IconCompatParcelizer((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), Color.blue(0) + 6030, TextUtils.getTrimmedLength("") + 24);
                        byte[] bArr7 = $$d;
                        byte b4 = (byte) (bArr7[17] - 1);
                        byte b5 = (byte) (bArr7[48] + 1);
                        Object[] objArr16 = new Object[1];
                        c(b4, b5, b5, objArr16);
                        cls4.getMethod((String) objArr16[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr15);
                        int i9 = read + 85;
                        IconCompatParcelizer = i9 % 128;
                        if (i9 % 2 != 0) {
                            int i10 = 2 / 2;
                        }
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
                Bundle arguments = this.fragment.getArguments();
                if (arguments != null) {
                    int i11 = read + 51;
                    IconCompatParcelizer = i11 % 128;
                    int i12 = i11 % 2;
                    if (arguments.containsKey("MapOptions")) {
                        zzby.zza(bundle2, "MapOptions", arguments.getParcelable("MapOptions"));
                    }
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
                int i2 = IconCompatParcelizer + 79;
                read = i2 % 128;
                if (i2 % 2 != 0) {
                    return view;
                }
                throw null;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onStart() {
            int i = 2 % 2;
            int i2 = read + 23;
            IconCompatParcelizer = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    this.zzbb.onStart();
                    int i3 = 89 / 0;
                } else {
                    this.zzbb.onStart();
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onResume() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 91;
            read = i2 % 128;
            int i3 = i2 % 2;
            try {
                this.zzbb.onResume();
                int i4 = read + 47;
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
        public final void onPause() {
            int i = 2 % 2;
            int i2 = read + 125;
            IconCompatParcelizer = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    this.zzbb.onPause();
                    int i3 = IconCompatParcelizer + 61;
                    read = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                }
                this.zzbb.onPause();
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onStop() {
            int i = 2 % 2;
            int i2 = read + 29;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            try {
                this.zzbb.onStop();
                int i4 = IconCompatParcelizer + 77;
                read = i4 % 128;
                int i5 = i4 % 2;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onDestroyView() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 105;
            read = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    this.zzbb.onDestroyView();
                    int i3 = read + 59;
                    IconCompatParcelizer = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                }
                this.zzbb.onDestroyView();
                throw null;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onDestroy() {
            int i = 2 % 2;
            int i2 = read + 91;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            try {
                this.zzbb.onDestroy();
                int i4 = IconCompatParcelizer + 35;
                read = i4 % 128;
                int i5 = i4 % 2;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onLowMemory() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 9;
            read = i2 % 128;
            int i3 = i2 % 2;
            try {
                this.zzbb.onLowMemory();
                int i4 = read + 51;
                IconCompatParcelizer = i4 % 128;
                int i5 = i4 % 2;
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
                int i2 = read + 103;
                IconCompatParcelizer = i2 % 128;
                if (i2 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.maps.internal.MapLifecycleDelegate
        public final void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
            int i = 2 % 2;
            try {
                this.zzbb.getMapAsync(new zzak(this, onMapReadyCallback));
                int i2 = read + 17;
                IconCompatParcelizer = i2 % 128;
                int i3 = i2 % 2;
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
                int i2 = IconCompatParcelizer + 19;
                read = i2 % 128;
                if (i2 % 2 != 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onExitAmbient() {
            int i = 2 % 2;
            int i2 = IconCompatParcelizer + 75;
            read = i2 % 128;
            int i3 = i2 % 2;
            try {
                this.zzbb.onExitAmbient();
                int i4 = read + 39;
                IconCompatParcelizer = i4 % 128;
                int i5 = i4 % 2;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 107;
        read = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(activity);
        this.zzch.setActivity(activity);
        int i4 = AudioAttributesImplApi26Parcelizer + 27;
        read = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        int i = 2 % 2;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            this.zzch.setActivity(activity);
            GoogleMapOptions googleMapOptionsCreateFromAttributes = GoogleMapOptions.createFromAttributes(activity, attributeSet);
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("MapOptions", googleMapOptionsCreateFromAttributes);
            this.zzch.onInflate(activity, bundle2, bundle);
            StrictMode.setThreadPolicy(threadPolicy);
            int i2 = read + 33;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        int i3 = 0;
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        int i4 = $11 + 49;
        $10 = i4 % 128;
        int i5 = i4 % 2;
        while (isstopped.read < cArr.length) {
            int i6 = $11 + 105;
            $10 = i6 % 128;
            int i7 = 58224;
            if (i6 % 2 != 0) {
                cArr3[i3] = cArr[isstopped.read];
                cArr3[i3] = cArr[isstopped.read + 1];
            } else {
                cArr3[i3] = cArr[isstopped.read];
                cArr3[1] = cArr[isstopped.read + 1];
            }
            int i8 = i3;
            while (i8 < 16) {
                int i9 = $10 + 125;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                char c = cArr3[1];
                char c2 = cArr3[i3];
                char[] cArr4 = cArr3;
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i7) ^ ((c2 << 4) + ((char) (((long) AudioAttributesCompatParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(RemoteActionCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getTouchSlop() >> 8), View.resolveSizeAndState(0, 0, 0) + 1504, TextUtils.getOffsetAfter("", 0) + 21, 1322448859, false, $$g(b, b2, b2), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr4[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr4[0]), Integer.valueOf((cCharValue + i7) ^ ((cCharValue << 4) + ((char) (((long) write) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(IconCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) (-1);
                        byte b4 = (byte) (b3 + 1);
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 1504 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 21, 1322448859, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i7 -= 40503;
                    i8++;
                    cArr3 = cArr4;
                    i3 = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr5 = cArr3;
            cArr2[isstopped.read] = cArr5[0];
            cArr2[isstopped.read + 1] = cArr5[1];
            Object[] objArr4 = {isstopped, isstopped};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getTouchSlop() >> 8), TextUtils.getCapsMode("", 0, 0) + 9016, 57 - TextUtils.lastIndexOf("", '0'), -1950993821, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            cArr3 = cArr5;
            i3 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 11;
        read = i2 % 128;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char mirror = (char) (13231 - AndroidCharacter.getMirror('0'));
            int offsetAfter = 1649 - TextUtils.getOffsetAfter("", 0);
            int i4 = (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26;
            byte b = $$a[5];
            Object[] objArr2 = new Object[1];
            a(b, r2[53], b, objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(mirror, offsetAfter, i4, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char cKeyCodeFromString = (char) (13183 - KeyEvent.keyCodeFromString(""));
                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1650;
                int iBlue = 26 - Color.blue(0);
                Object[] objArr3 = new Object[1];
                a(r4[53], r4[5], (byte) (-$$a[27]), objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(cKeyCodeFromString, iIndexOf, iBlue, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
        } else {
            Object[] objArr4 = new Object[1];
            b(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 17, new char[]{42341, 56858, 41031, 56794, 64478, 46555, 4783, 37257, 15379, 8920, 29473, 10688, 34179, 48242, 32406, 46810}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(16 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new char[]{62830, 8462, 4596, 4822, 39141, 54827, 4804, 2301, 9807, 13354, 40927, 42349, 8184, 6616, 10038, 54151}, objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i5 = AudioAttributesImplApi26Parcelizer + 83;
            read = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -1371069018};
                byte[] bArr = $$d;
                Object[] objArr7 = new Object[1];
                c(bArr[2], (byte) ($$e & 109), (byte) (bArr[10] + 1), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                c((byte) (bArr[2] - 1), (byte) (-bArr[7]), (byte) (-bArr[47]), objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char defaultSize = (char) (View.getDefaultSize(0, 0) + 13183);
                    int scrollBarFadeDuration = 1649 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                    int i7 = 27 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    Object[] objArr9 = new Object[1];
                    a(r6[53], r6[5], (byte) (-$$a[27]), objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(defaultSize, scrollBarFadeDuration, i7, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 21, new char[]{4783, 37257, 52043, 6493, 48753, 14044, 47825, 15622, 1008, 35378, 16849, 35893, 45963, 19281, 33007, 58043, 18056, 48022, 20851, 47369, 22566, 20081}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b(15 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{33542, 23999, 49666, 26357, 40220, 55055, 33978, 17125, 48329, 47510, 9143, 41287, 61644, 42704, 31402, 28522}, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char cIndexOf = (char) (13183 - TextUtils.indexOf("", "", 0));
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 1649;
                        int scrollBarFadeDuration2 = 26 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
                        byte[] bArr2 = $$a;
                        byte b2 = bArr2[53];
                        byte b3 = bArr2[5];
                        Object[] objArr12 = new Object[1];
                        a(b2, b3, (byte) (b3 | TarConstants.LF_GNUTYPE_LONGNAME), objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(cIndexOf, doubleTapTimeout, scrollBarFadeDuration2, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char cNormalizeMetaState = (char) (13183 - KeyEvent.normalizeMetaState(0));
                        int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1649;
                        int i8 = 26 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        byte[] bArr3 = $$a;
                        byte b4 = bArr3[5];
                        byte b5 = b4;
                        byte b6 = bArr3[53];
                        byte b7 = b4;
                        Object[] objArr13 = new Object[1];
                        a(b5, b6, b7, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(cNormalizeMetaState, scrollBarSize, i8, -133433128, false, (String) objArr13[0], null);
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
        int i9 = ((int[]) objArr[3])[0];
        int i10 = ((int[]) objArr[2])[0];
        if (i10 != i9) {
            long j = -1;
            long j2 = ((long) (i9 ^ i10)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (ExpandableListView.getPackedPositionChild(0L) + 4536), View.resolveSize(0, 0) + 6054, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i11 = read + 75;
                AudioAttributesImplApi26Parcelizer = i11 % 128;
                int i12 = i11 % 2;
                try {
                    Object[] objArr14 = {751929954, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) KeyEvent.getDeadChar(0, 0), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6029, 23 - Process.getGidForName(""));
                    byte b8 = (byte) ($$d[10] + 1);
                    Object[] objArr15 = new Object[1];
                    c(b8, b8, r2[16], objArr15);
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
        this.zzch.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View viewOnCreateView;
        int i = 2 % 2;
        int i2 = read + 67;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            viewOnCreateView = this.zzch.onCreateView(layoutInflater, viewGroup, bundle);
            viewOnCreateView.setClickable(false);
        } else {
            viewOnCreateView = this.zzch.onCreateView(layoutInflater, viewGroup, bundle);
            viewOnCreateView.setClickable(true);
        }
        int i3 = AudioAttributesImplApi26Parcelizer + 115;
        read = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 46 / 0;
        }
        return viewOnCreateView;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 121;
        read = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        this.zzch.onResume();
        int i4 = AudioAttributesImplApi26Parcelizer + 75;
        read = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        int i = 2 % 2;
        int i2 = read + 17;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.zzch.onPause();
        super.onPause();
        int i4 = read + 59;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        int i = 2 % 2;
        int i2 = read + 101;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        this.zzch.onStart();
        int i4 = AudioAttributesImplApi26Parcelizer + 101;
        read = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        int i = 2 % 2;
        int i2 = read + 25;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            this.zzch.onStop();
            super.onStop();
        } else {
            this.zzch.onStop();
            super.onStop();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = read + 115;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            this.zzch.onDestroyView();
            super.onDestroyView();
        } else {
            this.zzch.onDestroyView();
            super.onDestroyView();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = read + 59;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.zzch.onDestroy();
        super.onDestroy();
        int i4 = AudioAttributesImplApi26Parcelizer + 113;
        read = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 73 / 0;
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 77;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            this.zzch.onLowMemory();
            super.onLowMemory();
        } else {
            this.zzch.onLowMemory();
            super.onLowMemory();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        int i = 2 % 2;
        if (bundle != null) {
            int i2 = AudioAttributesImplApi26Parcelizer + 99;
            read = i2 % 128;
            int i3 = i2 % 2;
            bundle.setClassLoader(SupportMapFragment.class.getClassLoader());
            int i4 = read + 51;
            AudioAttributesImplApi26Parcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
        super.onActivityCreated(bundle);
        int i6 = AudioAttributesImplApi26Parcelizer + 33;
        read = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSaveInstanceState(android.os.Bundle r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.maps.SupportMapFragment.AudioAttributesImplApi26Parcelizer
            int r1 = r1 + 33
            int r2 = r1 % 128
            com.google.android.gms.maps.SupportMapFragment.read = r2
            int r1 = r1 % r0
            r2 = 43
            if (r1 == 0) goto L15
            int r1 = r2 / 0
            if (r4 == 0) goto L20
            goto L17
        L15:
            if (r4 == 0) goto L20
        L17:
            java.lang.Class<com.google.android.gms.maps.SupportMapFragment> r1 = com.google.android.gms.maps.SupportMapFragment.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r4.setClassLoader(r1)
        L20:
            super.onSaveInstanceState(r4)
            com.google.android.gms.maps.SupportMapFragment$zzb r3 = r3.zzch
            r3.onSaveInstanceState(r4)
            int r3 = com.google.android.gms.maps.SupportMapFragment.read
            int r3 = r3 + r2
            int r4 = r3 % 128
            com.google.android.gms.maps.SupportMapFragment.AudioAttributesImplApi26Parcelizer = r4
            int r3 = r3 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.SupportMapFragment.onSaveInstanceState(android.os.Bundle):void");
    }

    public final void onEnterAmbient(Bundle bundle) {
        int i = 2 % 2;
        Preconditions.checkMainThread("onEnterAmbient must be called on the main thread.");
        zzb zzbVar = this.zzch;
        if (zzbVar.getDelegate() != null) {
            int i2 = read + 23;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            zzbVar.getDelegate().onEnterAmbient(bundle);
        }
        int i4 = read + 111;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onExitAmbient() {
        int i = 2 % 2;
        Preconditions.checkMainThread("onExitAmbient must be called on the main thread.");
        zzb zzbVar = this.zzch;
        if (zzbVar.getDelegate() != null) {
            int i2 = AudioAttributesImplApi26Parcelizer + 65;
            read = i2 % 128;
            int i3 = i2 % 2;
            zzbVar.getDelegate().onExitAmbient();
            int i4 = AudioAttributesImplApi26Parcelizer + 33;
            read = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 45;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            Preconditions.checkMainThread("getMapAsync must be called on the main thread.");
            this.zzch.getMapAsync(onMapReadyCallback);
        } else {
            Preconditions.checkMainThread("getMapAsync must be called on the main thread.");
            this.zzch.getMapAsync(onMapReadyCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(Bundle bundle) {
        int i = 2 % 2;
        int i2 = read + 117;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.setArguments(bundle);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
