package com.google.android.gms.maps;

import android.app.Activity;
import android.graphics.Color;
import android.graphics.ImageFormat;
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
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate;
import com.google.android.gms.maps.internal.StreetViewLifecycleDelegate;
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
import kotlin.DownloadService;
import kotlin.notifyDownloadRemoved;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public class SupportStreetViewPanoramaFragment extends Fragment {
    private final zzb zzci = new zzb(this);
    private static final byte[] $$c = {112, -40, -93, -59};
    private static final int $$f = 232;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {117, -12, 2, 85, 18, 4, -57, 62, 1, 24, 7, -9, 19, 12, -5, 5, -56, 66, -3, 8, 14, 14, 2, 5, -58, 60, 3, 25, -13, 7, 13, 11, -4, -48, 66, 0, 13, -52, 9, 0, 34, 0, 13, -20, 9, 39, 37, -5, 9, -66, TarConstants.LF_BLK, 21, 28, -29, 43, -3, -5, -17, 25, 18, -2, 58, -11, 11, 12, -40, 57, 6, 4, -3, -1, 25, 5, -9, 20, -42, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19, 25, 14, 8, 11, -9, -30, 40, 23, -5, 12, 5, -37, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19};
    private static final int $$e = 243;
    private static final byte[] $$a = {18, 96, 87, -114, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 63;
    private static int AudioAttributesCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static long IconCompatParcelizer = -3498762522182953692L;
    private static int read = -61156522;
    private static char write = 54564;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r5, short r6, short r7) {
        /*
            int r7 = r7 * 3
            int r0 = r7 + 1
            byte[] r1 = com.google.android.gms.maps.SupportStreetViewPanoramaFragment.$$c
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r5 = r5 * 4
            int r5 = r5 + 103
            byte[] r0 = new byte[r0]
            r2 = -1
            if (r1 != 0) goto L16
            r5 = r6
            r3 = r7
            goto L2b
        L16:
            r4 = r6
            r6 = r5
            r5 = r4
        L19:
            int r2 = r2 + 1
            byte r3 = (byte) r6
            r0[r2] = r3
            int r5 = r5 + 1
            if (r2 != r7) goto L29
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            return r5
        L29:
            r3 = r1[r5]
        L2b:
            int r6 = r6 + r3
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.SupportStreetViewPanoramaFragment.$$g(int, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 10
            int r0 = 44 - r7
            int r6 = r6 * 12
            int r6 = 77 - r6
            byte[] r1 = com.google.android.gms.maps.SupportStreetViewPanoramaFragment.$$a
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            int r7 = 43 - r7
            r2 = 0
            if (r1 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L2c
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            r4 = r1[r8]
            int r3 = r3 + 1
            r5 = r3
            r3 = r6
            r6 = r4
            r4 = r5
        L2c:
            int r6 = -r6
            int r8 = r8 + 1
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.SupportStreetViewPanoramaFragment.a(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 * 17
            int r6 = 99 - r6
            byte[] r0 = com.google.android.gms.maps.SupportStreetViewPanoramaFragment.$$d
            int r8 = r8 * 3
            int r1 = r8 + 28
            int r7 = r7 + 4
            byte[] r1 = new byte[r1]
            int r8 = r8 + 27
            r2 = 0
            if (r0 != 0) goto L17
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2e:
            int r7 = r7 + r4
            int r7 = r7 + (-6)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.SupportStreetViewPanoramaFragment.c(short, short, byte, java.lang.Object[]):void");
    }

    public static SupportStreetViewPanoramaFragment newInstance() {
        int i = 2 % 2;
        SupportStreetViewPanoramaFragment supportStreetViewPanoramaFragment = new SupportStreetViewPanoramaFragment();
        int i2 = AudioAttributesCompatParcelizer + 63;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            return supportStreetViewPanoramaFragment;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static final class zzb extends DeferredLifecycleHelper<zza> {
        private final Fragment fragment;
        private OnDelegateCreatedListener<zza> zzbd;
        private Activity zzbe;
        private final List<OnStreetViewPanoramaReadyCallback> zzbw = new ArrayList();

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
                this.zzbd.onDelegateCreated(new zza(this.fragment, zzbz.zza(this.zzbe).zzd(ObjectWrapper.wrap(this.zzbe))));
                Iterator<OnStreetViewPanoramaReadyCallback> it = this.zzbw.iterator();
                while (it.hasNext()) {
                    getDelegate().getStreetViewPanoramaAsync(it.next());
                }
                this.zzbw.clear();
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

        public final void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            if (getDelegate() != null) {
                getDelegate().getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
            } else {
                this.zzbw.add(onStreetViewPanoramaReadyCallback);
            }
        }
    }

    public static SupportStreetViewPanoramaFragment newInstance(StreetViewPanoramaOptions streetViewPanoramaOptions) {
        int i = 2 % 2;
        SupportStreetViewPanoramaFragment supportStreetViewPanoramaFragment = new SupportStreetViewPanoramaFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", streetViewPanoramaOptions);
        supportStreetViewPanoramaFragment.setArguments(bundle);
        int i2 = RemoteActionCompatParcelizer + 19;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        return supportStreetViewPanoramaFragment;
    }

    static final class zza implements StreetViewLifecycleDelegate {
        private final Fragment fragment;
        private final IStreetViewPanoramaFragmentDelegate zzbu;
        private static final byte[] $$c = {TarConstants.LF_SYMLINK, -57, 8, -14};
        private static final int $$f = 94;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {27, 74, 113, 65, 58, -30, -58, 2, 24, -35, 4, -31, 13, -20, 34, -43, -10, -3, 34, -51, -5, -10, -6, -6, 2, -16, -13, 33, -36, -17, -8, 8, -16, 2, -20, 38, -58, -3, 8, -20, -3, 6, -18, 18, -45, 4, -13, 5, -4, -22, 4, -1, 16, -28, -19, 4, -9, -4, 40, -33, -19, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20, -26, -15, -9, -12, 8, 29, -41, -24, 4, -13, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20};
        private static final int $$e = 52;
        private static final byte[] $$a = {TarConstants.LF_GNUTYPE_LONGLINK, 28, -90, 102, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
        private static final int $$b = 76;
        private static int write = 0;
        private static int AudioAttributesCompatParcelizer = 1;
        private static char[] read = {59612, 20682, 39162, 49280, 2284, 28747, 47225, 57363, 10297, 37277, 55751, 496, 18841, 45499, 63813, 8552, 56374, 25638, 44032, 62566, 15455, 17575, 35973, 54509, 7423, 42299, 60686, 13576, 32064, 34121, 52653, 5513, 43577, 4651, 55814, 33405, 19011, 12960, 64146, 41661, 27359, 54062, 39764, 17204, 2941, 62290, 48058, 25486, 11237, 37878, 22590, 16, 51327, 45138, 34530, 16118, 63196, 44704, 26240, 7795, 54861, 36382, 17930, 65507, 47049, 28620, 10162, 57235, 38772};
        private static long RemoteActionCompatParcelizer = -4936064331625569263L;

        private static String $$g(int i, byte b, byte b2) {
            int i2 = b2 * 4;
            int i3 = 3 - (b * 4);
            int i4 = 101 - (i * 2);
            byte[] bArr = $$c;
            byte[] bArr2 = new byte[i2 + 1];
            int i5 = -1;
            if (bArr == null) {
                i4 = i2 + i3;
                i3 = i3;
                i5 = -1;
            }
            while (true) {
                int i6 = i5 + 1;
                bArr2[i6] = (byte) i4;
                if (i6 == i2) {
                    return new String(bArr2, 0);
                }
                int i7 = i3 + 1;
                i4 += bArr[i7];
                i3 = i7;
                i5 = i6;
            }
        }

        public zza(Fragment fragment, IStreetViewPanoramaFragmentDelegate iStreetViewPanoramaFragmentDelegate) {
            this.zzbu = (IStreetViewPanoramaFragmentDelegate) Preconditions.checkNotNull(iStreetViewPanoramaFragmentDelegate);
            this.fragment = (Fragment) Preconditions.checkNotNull(fragment);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(byte r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                int r8 = r8 * 12
                int r8 = r8 + 65
                int r6 = r6 + 4
                int r7 = r7 * 10
                int r0 = 44 - r7
                byte[] r1 = com.google.android.gms.maps.SupportStreetViewPanoramaFragment.zza.$$a
                byte[] r0 = new byte[r0]
                int r7 = 43 - r7
                r2 = 0
                if (r1 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L2e
            L16:
                r3 = r2
            L17:
                byte r4 = (byte) r8
                r0[r3] = r4
                if (r3 != r7) goto L24
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L24:
                int r3 = r3 + 1
                int r6 = r6 + 1
                r4 = r1[r6]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2e:
                int r8 = -r8
                int r3 = r3 + r8
                int r8 = r3 + (-1)
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.SupportStreetViewPanoramaFragment.zza.a(byte, int, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void c(byte r6, int r7, byte r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.google.android.gms.maps.SupportStreetViewPanoramaFragment.zza.$$d
                int r8 = 77 - r8
                int r6 = r6 + 73
                int r7 = r7 * 4
                int r1 = r7 + 20
                byte[] r1 = new byte[r1]
                int r7 = r7 + 19
                r2 = 0
                if (r0 != 0) goto L15
                r6 = r7
                r3 = r8
                r4 = r2
                goto L2d
            L15:
                r3 = r2
            L16:
                byte r4 = (byte) r6
                r1[r3] = r4
                int r8 = r8 + 1
                if (r3 != r7) goto L25
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L25:
                int r3 = r3 + 1
                r4 = r0[r8]
                r5 = r3
                r3 = r8
                r8 = r4
                r4 = r5
            L2d:
                int r8 = -r8
                int r6 = r6 + r8
                int r6 = r6 + (-7)
                r8 = r3
                r3 = r4
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.SupportStreetViewPanoramaFragment.zza.c(byte, int, byte, java.lang.Object[]):void");
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            int i = 2 % 2;
            try {
                Bundle bundle3 = new Bundle();
                zzby.zza(bundle2, bundle3);
                this.zzbu.onInflate(ObjectWrapper.wrap(activity), null, bundle3);
                zzby.zza(bundle3, bundle2);
                int i2 = AudioAttributesCompatParcelizer + 125;
                write = i2 % 128;
                int i3 = i2 % 2;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        private static void b(char c, int i, int i2, Object[] objArr) throws Throwable {
            int i3 = 2 % 2;
            DownloadService downloadService = new DownloadService();
            long[] jArr = new long[i2];
            downloadService.write = 0;
            while (downloadService.write < i2) {
                int i4 = $11 + 25;
                $10 = i4 % 128;
                int i5 = i4 % 2;
                int i6 = downloadService.write;
                try {
                    Object[] objArr2 = {Integer.valueOf(read[i + i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) (AndroidCharacter.getMirror('0') + 36573), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2339, 28 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 480654850, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(RemoteActionCompatParcelizer), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), Color.green(0) + 9701, AndroidCharacter.getMirror('0') - 22, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {downloadService, downloadService};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (AndroidCharacter.getMirror('0') - '0'), 23784 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 32 - TextUtils.lastIndexOf("", '0'), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            char[] cArr = new char[i2];
            downloadService.write = 0;
            while (downloadService.write < i2) {
                cArr[downloadService.write] = (char) jArr[downloadService.write];
                Object[] objArr5 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), Process.getGidForName("") + 23785, 32 - ImageFormat.getBitsPerPixel(0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            String str = new String(cArr);
            int i7 = $11 + 53;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                throw null;
            }
            objArr[0] = str;
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onCreate(Bundle bundle) throws Throwable {
            Object[] objArr;
            char c;
            int i = 2 % 2;
            int i2 = AudioAttributesCompatParcelizer + 99;
            write = i2 % 128;
            if (i2 % 2 != 0) {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
                if (objRemoteActionCompatParcelizer == null) {
                    char tapTimeout = (char) (13183 - (ViewConfiguration.getTapTimeout() >> 16));
                    int iGreen = 1649 - Color.green(0);
                    int iKeyCodeFromString = 26 - KeyEvent.keyCodeFromString("");
                    byte[] bArr = $$a;
                    Object[] objArr2 = new Object[1];
                    a(bArr[53], bArr[5], bArr[17], objArr2);
                    objRemoteActionCompatParcelizer = startForeground.read(tapTimeout, iGreen, iKeyCodeFromString, -133433128, false, (String) objArr2[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer).getLong(null);
                throw null;
            }
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-2042479539);
            if (objRemoteActionCompatParcelizer2 == null) {
                char cIndexOf = (char) (13182 - TextUtils.indexOf((CharSequence) "", '0', 0));
                int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1649;
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 27;
                byte[] bArr2 = $$a;
                Object[] objArr3 = new Object[1];
                a(bArr2[53], bArr2[5], bArr2[17], objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(cIndexOf, maxKeyCode, iLastIndexOf, -133433128, false, (String) objArr3[0], null);
            }
            if (((Field) objRemoteActionCompatParcelizer2).getLong(null) != -1) {
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char packedPositionGroup = (char) (13183 - ExpandableListView.getPackedPositionGroup(0L));
                    int defaultSize = 1649 - View.getDefaultSize(0, 0);
                    int i3 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 25;
                    byte[] bArr3 = $$a;
                    Object[] objArr4 = new Object[1];
                    a(bArr3[65], bArr3[17], bArr3[5], objArr4);
                    objRemoteActionCompatParcelizer3 = startForeground.read(packedPositionGroup, defaultSize, i3, -1033747278, false, (String) objArr4[0], null);
                }
                objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
                c = 3;
            } else {
                Object[] objArr5 = new Object[1];
                b((char) (13546 - AndroidCharacter.getMirror('0')), KeyEvent.keyCodeFromString(""), TextUtils.indexOf("", "", 0) + 16, objArr5);
                Class<?> cls = Class.forName((String) objArr5[0]);
                Object[] objArr6 = new Object[1];
                b((char) (KeyEvent.normalizeMetaState(0) + 83), View.combineMeasuredStates(0, 0) + 16, (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 15, objArr6);
                try {
                    Object[] objArr7 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue()), 0, 1227513901};
                    byte[] bArr4 = $$d;
                    Object[] objArr8 = new Object[1];
                    c(bArr4[35], (byte) (-bArr4[56]), bArr4[1], objArr8);
                    Class<?> cls2 = Class.forName((String) objArr8[0]);
                    byte b = (byte) (bArr4[51] + 1);
                    Object[] objArr9 = new Object[1];
                    c(b, b, (byte) (-bArr4[54]), objArr9);
                    objArr = (Object[]) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr7);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char cNormalizeMetaState = (char) (13183 - KeyEvent.normalizeMetaState(0));
                        int iResolveSize = 1649 - View.resolveSize(0, 0);
                        int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 26;
                        byte[] bArr5 = $$a;
                        Object[] objArr10 = new Object[1];
                        a(bArr5[65], bArr5[17], bArr5[5], objArr10);
                        objRemoteActionCompatParcelizer4 = startForeground.read(cNormalizeMetaState, iResolveSize, fadingEdgeLength, -1033747278, false, (String) objArr10[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                    try {
                        Object[] objArr11 = new Object[1];
                        b((char) (30292 - View.MeasureSpec.makeMeasureSpec(0, 0)), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 32, 23 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), objArr11);
                        Class<?> cls3 = Class.forName((String) objArr11[0]);
                        Object[] objArr12 = new Object[1];
                        b((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 23179), 54 - (Process.myTid() >> 22), 15 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr12);
                        long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(2104791916);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            char cNormalizeMetaState2 = (char) (13183 - KeyEvent.normalizeMetaState(0));
                            int fadingEdgeLength2 = 1649 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                            int iIndexOf = 25 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                            byte[] bArr6 = $$a;
                            Object[] objArr13 = new Object[1];
                            a(bArr6[0], bArr6[17], bArr6[5], objArr13);
                            objRemoteActionCompatParcelizer5 = startForeground.read(cNormalizeMetaState2, fadingEdgeLength2, iIndexOf, 54351865, false, (String) objArr13[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                        if (objRemoteActionCompatParcelizer6 == null) {
                            char c2 = (char) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13183);
                            int iResolveSizeAndState = 1649 - View.resolveSizeAndState(0, 0, 0);
                            int mirror = AndroidCharacter.getMirror('0') - 22;
                            byte[] bArr7 = $$a;
                            Object[] objArr14 = new Object[1];
                            a(bArr7[53], bArr7[5], bArr7[17], objArr14);
                            objRemoteActionCompatParcelizer6 = startForeground.read(c2, iResolveSizeAndState, mirror, -133433128, false, (String) objArr14[0], null);
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
                long j3 = (((long) (i5 ^ i4)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
                try {
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        objRemoteActionCompatParcelizer7 = startForeground.read((char) (Color.red(0) + 4535), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6054, 42 - ExpandableListView.getPackedPositionType(0L), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, null);
                    ArrayList arrayList = new ArrayList();
                    String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                    int i6 = AudioAttributesCompatParcelizer + 39;
                    write = i6 % 128;
                    int i7 = i6 % 2;
                    try {
                        Object[] objArr15 = {1239347750, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                        Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getLongPressTimeout() >> 16), 6030 - (ViewConfiguration.getJumpTapTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 24);
                        byte[] bArr8 = $$d;
                        byte b2 = (byte) (-bArr8[56]);
                        byte b3 = bArr8[7];
                        Object[] objArr16 = new Object[1];
                        c(b2, b3, (byte) (b3 - 2), objArr16);
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
                Bundle arguments = this.fragment.getArguments();
                if (arguments != null && arguments.containsKey("StreetViewPanoramaOptions")) {
                    zzby.zza(bundle2, "StreetViewPanoramaOptions", arguments.getParcelable("StreetViewPanoramaOptions"));
                }
                this.zzbu.onCreate(bundle2);
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
                IObjectWrapper iObjectWrapperOnCreateView = this.zzbu.onCreateView(ObjectWrapper.wrap(layoutInflater), ObjectWrapper.wrap(viewGroup), bundle2);
                zzby.zza(bundle2, bundle);
                View view = (View) ObjectWrapper.unwrap(iObjectWrapperOnCreateView);
                int i2 = AudioAttributesCompatParcelizer + 91;
                write = i2 % 128;
                int i3 = i2 % 2;
                return view;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onStart() {
            int i = 2 % 2;
            int i2 = write + 9;
            AudioAttributesCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            try {
                this.zzbu.onStart();
                int i4 = AudioAttributesCompatParcelizer + 31;
                write = i4 % 128;
                int i5 = i4 % 2;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onResume() {
            int i = 2 % 2;
            int i2 = AudioAttributesCompatParcelizer + 25;
            write = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    this.zzbu.onResume();
                    int i3 = 41 / 0;
                } else {
                    this.zzbu.onResume();
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onPause() {
            int i = 2 % 2;
            int i2 = AudioAttributesCompatParcelizer + 79;
            write = i2 % 128;
            int i3 = i2 % 2;
            try {
                this.zzbu.onPause();
                int i4 = write + 99;
                AudioAttributesCompatParcelizer = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 24 / 0;
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onStop() {
            int i = 2 % 2;
            int i2 = write + 65;
            AudioAttributesCompatParcelizer = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    this.zzbu.onStop();
                    int i3 = write + 43;
                    AudioAttributesCompatParcelizer = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 95 / 0;
                        return;
                    }
                    return;
                }
                this.zzbu.onStop();
                throw null;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onDestroyView() {
            int i = 2 % 2;
            int i2 = write + 119;
            AudioAttributesCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            try {
                this.zzbu.onDestroyView();
                int i4 = write + 71;
                AudioAttributesCompatParcelizer = i4 % 128;
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
        public final void onDestroy() {
            int i = 2 % 2;
            int i2 = write + 21;
            AudioAttributesCompatParcelizer = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    this.zzbu.onDestroy();
                    int i3 = write + 15;
                    AudioAttributesCompatParcelizer = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                }
                this.zzbu.onDestroy();
                Object obj = null;
                obj.hashCode();
                throw null;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onLowMemory() {
            int i = 2 % 2;
            int i2 = AudioAttributesCompatParcelizer + 83;
            write = i2 % 128;
            int i3 = i2 % 2;
            try {
                this.zzbu.onLowMemory();
                int i4 = AudioAttributesCompatParcelizer + 73;
                write = i4 % 128;
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
        public final void onSaveInstanceState(Bundle bundle) {
            int i = 2 % 2;
            try {
                Bundle bundle2 = new Bundle();
                zzby.zza(bundle, bundle2);
                this.zzbu.onSaveInstanceState(bundle2);
                zzby.zza(bundle2, bundle);
                int i2 = AudioAttributesCompatParcelizer + 77;
                write = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.maps.internal.StreetViewLifecycleDelegate
        public final void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            int i = 2 % 2;
            try {
                this.zzbu.getStreetViewPanoramaAsync(new zzal(this, onStreetViewPanoramaReadyCallback));
                int i2 = write + 23;
                AudioAttributesCompatParcelizer = i2 % 128;
                if (i2 % 2 == 0) {
                    throw null;
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Activity activity) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 47;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(activity);
        this.zzci.setActivity(activity);
        int i4 = AudioAttributesCompatParcelizer + 41;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        int i = 2 % 2;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            this.zzci.setActivity(activity);
            this.zzci.onInflate(activity, new Bundle(), bundle);
            StrictMode.setThreadPolicy(threadPolicy);
            int i2 = AudioAttributesCompatParcelizer + 45;
            RemoteActionCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    private static void b(int i, char[] cArr, char[] cArr2, char c, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i4 = $10 + 75;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.indexOf("", ""), ExpandableListView.getPackedPositionType(0L) + 22748, View.resolveSize(0, 0) + 36, 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {notifydownloadremoved};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.indexOf("", "", 0, 0) + 31369), View.MeasureSpec.getMode(0) + 2721, 38 - Color.alpha(0), 1895162189, false, $$g(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) View.resolveSize(0, 0), Process.getGidForName("") + 15714, 64 - Color.green(0), -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 40976), MotionEvent.axisFromString("") + 6123, (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 29, -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = notifydownloadremoved.write;
                            cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (IconCompatParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) read) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) write) ^ (-3498762522182953692L)))));
                            notifydownloadremoved.AudioAttributesCompatParcelizer++;
                            i2 = 2;
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i6 = $10 + 61;
        $11 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
        objArr[0] = str;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 81;
        AudioAttributesCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
            if (objRemoteActionCompatParcelizer == null) {
                char cLastIndexOf = (char) (13182 - TextUtils.lastIndexOf("", '0', 0));
                int i3 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1648;
                int iMakeMeasureSpec = 26 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte b = $$a[5];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(cLastIndexOf, i3, iMakeMeasureSpec, -133433128, false, (String) objArr2[0], null);
            }
            ((Field) objRemoteActionCompatParcelizer).getLong(null);
            throw null;
        }
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer2 == null) {
            char cAxisFromString = (char) (13182 - MotionEvent.axisFromString(""));
            int offsetBefore = 1649 - TextUtils.getOffsetBefore("", 0);
            int keyRepeatTimeout = 26 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            byte b3 = $$a[5];
            byte b4 = b3;
            Object[] objArr3 = new Object[1];
            a(b3, b4, b4, objArr3);
            objRemoteActionCompatParcelizer2 = startForeground.read(cAxisFromString, offsetBefore, keyRepeatTimeout, -133433128, false, (String) objArr3[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer2).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer3 == null) {
                char maxKeyCode = (char) (13183 - (KeyEvent.getMaxKeyCode() >> 16));
                int i4 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 1648;
                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 26;
                byte b5 = $$a[17];
                Object[] objArr4 = new Object[1];
                a(b5, b5, r14[27], objArr4);
                objRemoteActionCompatParcelizer3 = startForeground.read(maxKeyCode, i4, absoluteGravity, -1033747278, false, (String) objArr4[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
        } else {
            Object[] objArr5 = new Object[1];
            b(Process.myTid() >> 22, new char[]{0, 0, 0, 0}, new char[]{13631, 12737, 40946, 54082, 24469, 21060, 23192, 30322, 7453, 49596, 27360, 61994, 37931, 32785, 43311, 62736}, (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 4425), new char[]{49442, 29432, 18939, 58897}, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            b(ViewConfiguration.getKeyRepeatTimeout() >> 16, new char[]{0, 0, 0, 0}, new char[]{7333, 5723, 30742, 61083, 45730, 13835, 38877, 22276, 11983, 41001, 60809, 56179, 528, 36709, 1298, 12067}, (char) (1719 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), new char[]{58158, 10403, 46941, 55302}, objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            int i5 = RemoteActionCompatParcelizer + 77;
            AudioAttributesCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr7 = {Integer.valueOf(iIntValue), 0, -1452871122};
                byte[] bArr = $$d;
                byte b6 = bArr[35];
                byte b7 = bArr[70];
                Object[] objArr8 = new Object[1];
                c(b6, b7, (byte) (b7 & 10), objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                Object[] objArr9 = new Object[1];
                c(bArr[2], (byte) (-bArr[16]), bArr[8], objArr9);
                objArr = (Object[]) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr7);
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 13184);
                    int i7 = 1649 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    int jumpTapTimeout = (ViewConfiguration.getJumpTapTimeout() >> 16) + 26;
                    byte b8 = $$a[17];
                    Object[] objArr10 = new Object[1];
                    a(b8, b8, r5[27], objArr10);
                    objRemoteActionCompatParcelizer4 = startForeground.read(cIndexOf, i7, jumpTapTimeout, -1033747278, false, (String) objArr10[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    b(Drawable.resolveOpacity(0, 0), new char[]{0, 0, 0, 0}, new char[]{30393, 40651, 51765, 23066, 15306, 14664, 31523, 63127, 27007, 28422, 5746, 45784, 44867, 4274, 45088, 19088, 28839, 6710, 47413, 24665, 15556, 49750}, (char) KeyEvent.normalizeMetaState(0), new char[]{6699, 19003, 38730, 59126}, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b((ViewConfiguration.getMinimumFlingVelocity() >> 16) - 968310130, new char[]{0, 0, 0, 0}, new char[]{58625, 3820, 27649, 15716, 50532, 59608, 36388, 60134, 30309, 3540, 43228, 33752, 43299, 27489, 9549}, (char) ((Process.myPid() >> 22) + 7164), new char[]{36526, 18626, 64710, 13595}, objArr12);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 13183);
                        int iLastIndexOf = 1648 - TextUtils.lastIndexOf("", '0', 0);
                        int iBlue = Color.blue(0) + 26;
                        byte b9 = $$a[17];
                        Object[] objArr13 = new Object[1];
                        a(b9, b9, (byte) 76, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(keyRepeatDelay, iLastIndexOf, iBlue, 54351865, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char cLastIndexOf2 = (char) (13182 - TextUtils.lastIndexOf("", '0', 0, 0));
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1650;
                        int modifierMetaStateMask = 25 - ((byte) KeyEvent.getModifierMetaStateMask());
                        byte b10 = $$a[5];
                        byte b11 = b10;
                        Object[] objArr14 = new Object[1];
                        a(b10, b11, b11, objArr14);
                        objRemoteActionCompatParcelizer6 = startForeground.read(cLastIndexOf2, iIndexOf, modifierMetaStateMask, -133433128, false, (String) objArr14[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf2);
                    int i8 = RemoteActionCompatParcelizer + 117;
                    AudioAttributesCompatParcelizer = i8 % 128;
                    int i9 = i8 % 2;
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
        int i10 = ((int[]) objArr[3])[0];
        int i11 = ((int[]) objArr[2])[0];
        if (i11 != i10) {
            long j = -1;
            long j2 = ((long) (i11 ^ i10)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 4535), 6054 - Gravity.getAbsoluteGravity(0, 0), 42 - TextUtils.getTrimmedLength(""), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, null);
                try {
                    Object[] objArr15 = {293076221, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 6030, (Process.myPid() >> 22) + 24);
                    Object[] objArr16 = new Object[1];
                    c(r2[8], (byte) ($$d[3] + 1), r2[35], objArr16);
                    cls4.getMethod((String) objArr16[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr15);
                    int i12 = RemoteActionCompatParcelizer + 39;
                    AudioAttributesCompatParcelizer = i12 % 128;
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
        this.zzci.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 93;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        View viewOnCreateView = this.zzci.onCreateView(layoutInflater, viewGroup, bundle);
        int i4 = AudioAttributesCompatParcelizer + 113;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return viewOnCreateView;
        }
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 61;
        AudioAttributesCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            super.onStart();
            this.zzci.onStart();
            int i3 = 29 / 0;
        } else {
            super.onStart();
            this.zzci.onStart();
        }
        int i4 = AudioAttributesCompatParcelizer + 87;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 113;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            super.onResume();
            this.zzci.onResume();
            int i3 = 96 / 0;
        } else {
            super.onResume();
            this.zzci.onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 115;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.zzci.onPause();
        super.onPause();
        int i4 = RemoteActionCompatParcelizer + 79;
        AudioAttributesCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 15;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            this.zzci.onStop();
            super.onStop();
        } else {
            this.zzci.onStop();
            super.onStop();
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 17;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.zzci.onDestroyView();
        super.onDestroyView();
        int i4 = AudioAttributesCompatParcelizer + 67;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 43;
        AudioAttributesCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            this.zzci.onDestroy();
            super.onDestroy();
        } else {
            this.zzci.onDestroy();
            super.onDestroy();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 25;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            this.zzci.onLowMemory();
            super.onLowMemory();
        } else {
            this.zzci.onLowMemory();
            super.onLowMemory();
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityCreated(android.os.Bundle r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.maps.SupportStreetViewPanoramaFragment.RemoteActionCompatParcelizer
            int r1 = r1 + 43
            int r2 = r1 % 128
            com.google.android.gms.maps.SupportStreetViewPanoramaFragment.AudioAttributesCompatParcelizer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L15
            r1 = 69
            int r1 = r1 / 0
            if (r4 == 0) goto L20
            goto L17
        L15:
            if (r4 == 0) goto L20
        L17:
            java.lang.Class<com.google.android.gms.maps.SupportStreetViewPanoramaFragment> r1 = com.google.android.gms.maps.SupportStreetViewPanoramaFragment.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r4.setClassLoader(r1)
        L20:
            super.onActivityCreated(r4)
            int r3 = com.google.android.gms.maps.SupportStreetViewPanoramaFragment.RemoteActionCompatParcelizer
            int r3 = r3 + 69
            int r4 = r3 % 128
            com.google.android.gms.maps.SupportStreetViewPanoramaFragment.AudioAttributesCompatParcelizer = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L32
            r3 = 29
            int r3 = r3 / 0
        L32:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.SupportStreetViewPanoramaFragment.onActivityCreated(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 7;
        RemoteActionCompatParcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (bundle != null) {
            bundle.setClassLoader(SupportStreetViewPanoramaFragment.class.getClassLoader());
        }
        super.onSaveInstanceState(bundle);
        this.zzci.onSaveInstanceState(bundle);
        int i3 = AudioAttributesCompatParcelizer + 89;
        RemoteActionCompatParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public void setArguments(Bundle bundle) {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 65;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.setArguments(bundle);
        int i4 = AudioAttributesCompatParcelizer + 63;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 55;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Preconditions.checkMainThread("getStreetViewPanoramaAsync() must be called on the main thread");
        this.zzci.getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        int i4 = AudioAttributesCompatParcelizer + 35;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }
}
