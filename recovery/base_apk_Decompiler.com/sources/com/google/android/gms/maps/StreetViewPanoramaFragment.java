package com.google.android.gms.maps;

import android.app.Activity;
import android.app.Fragment;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.os.StrictMode;
import android.os.SystemClock;
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
import kotlin.isStopped;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public class StreetViewPanoramaFragment extends Fragment {
    private final zzb zzbt = new zzb(this);
    private static final byte[] $$c = {111, -63, 80, 27};
    private static final int $$f = 206;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {36, 0, 10, -55, -55, 41, 34, 9, 15, 2, -20, TarConstants.LF_FIFO, -1, 11, 8, -3, 29, 5, 11, 20, -19, 29, 19, 0, 11, 23, -3, 23, -37, TarConstants.LF_FIFO, -1, 11, 8, -12, 30, 33, -24, 21, 21, 19, -6, 24, -3, 6, 13, 29, 18, 12, 15, -5, -26, 44, 27, -1, 16, 9, -33, TarConstants.LF_FIFO, 8, 13, -5, 29, -26, 27, 27, -5, 12, 17, 7, 27, -11, 23};
    private static final int $$e = 242;
    private static final byte[] $$a = {66, 100, 74, -7, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 85;
    private static int write = 0;
    private static int IconCompatParcelizer = 1;
    private static char[] read = {56422, 20105, 63922, 25793, 38834, 532, 44341, 55390, 19275, 63014, 24759, 37817, 16079, 43500, 54289, 18237, 54209, 16680, 62981, 27498, 38988, 3509, 41604, 55277, 17600, 63949, 28467, 39948, 12635, 42579, 56244, 18577, 41636, 12367, 34665, 6683, 59706, 31960, 54265, 42711, 13706, 34994, 7683, 60762, 16396, 55074, 43721, 14844, 36072, 25506, 63137, 17478, 56182, 44570, 21562, 50903, 29174, 60547, 8124, 35406, 9571, 20529, 49946, 32314, 59611, 7143, 46726, 8614, 23618};
    private static long RemoteActionCompatParcelizer = 6561679706332810984L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r6, byte r7, short r8) {
        /*
            byte[] r0 = com.google.android.gms.maps.StreetViewPanoramaFragment.$$c
            int r7 = r7 * 2
            int r7 = 101 - r7
            int r6 = r6 * 3
            int r6 = r6 + 1
            int r8 = r8 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r7
            r4 = r2
            r7 = r6
            goto L27
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r8 = r8 + 1
            if (r4 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r3 = r0[r8]
        L27:
            int r7 = r7 + r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.StreetViewPanoramaFragment.$$g(byte, byte, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 10
            int r8 = 44 - r8
            int r6 = 80 - r6
            int r7 = r7 * 12
            int r7 = r7 + 65
            byte[] r0 = com.google.android.gms.maps.StreetViewPanoramaFragment.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r6]
        L26:
            int r3 = -r3
            int r7 = r7 + r3
            int r6 = r6 + 1
            int r7 = r7 + (-1)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.StreetViewPanoramaFragment.a(short, int, int, java.lang.Object[]):void");
    }

    private static void c(byte b, byte b2, short s, Object[] objArr) {
        int i = 114 - b2;
        byte[] bArr = $$d;
        int i2 = 45 - b;
        byte[] bArr2 = new byte[39 - s];
        int i3 = 38 - s;
        int i4 = -1;
        if (bArr == null) {
            i = (i3 + i) - 10;
            i2++;
        }
        while (true) {
            i4++;
            bArr2[i4] = (byte) i;
            if (i4 == i3) {
                objArr[0] = new String(bArr2, 0);
                return;
            } else {
                i = (i + bArr[i2]) - 10;
                i2++;
            }
        }
    }

    public static StreetViewPanoramaFragment newInstance() {
        int i = 2 % 2;
        StreetViewPanoramaFragment streetViewPanoramaFragment = new StreetViewPanoramaFragment();
        int i2 = IconCompatParcelizer + 21;
        write = i2 % 128;
        if (i2 % 2 == 0) {
            return streetViewPanoramaFragment;
        }
        throw null;
    }

    static final class zzb extends DeferredLifecycleHelper<zza> {
        private final Fragment zzba;
        private OnDelegateCreatedListener<zza> zzbd;
        private Activity zzbe;
        private final List<OnStreetViewPanoramaReadyCallback> zzbw = new ArrayList();

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
                this.zzbd.onDelegateCreated(new zza(this.zzba, zzbz.zza(this.zzbe).zzd(ObjectWrapper.wrap(this.zzbe))));
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

    public static StreetViewPanoramaFragment newInstance(StreetViewPanoramaOptions streetViewPanoramaOptions) {
        int i = 2 % 2;
        StreetViewPanoramaFragment streetViewPanoramaFragment = new StreetViewPanoramaFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("StreetViewPanoramaOptions", streetViewPanoramaOptions);
        streetViewPanoramaFragment.setArguments(bundle);
        int i2 = IconCompatParcelizer + 41;
        write = i2 % 128;
        int i3 = i2 % 2;
        return streetViewPanoramaFragment;
    }

    static final class zza implements StreetViewLifecycleDelegate {
        private final Fragment zzba;
        private final IStreetViewPanoramaFragmentDelegate zzbu;
        private static final byte[] $$c = {104, -54, 119, 45};
        private static final int $$f = 95;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {7, -56, -121, 7, -67, 67, -16, 13, -45, 34, -14, 4, -4, -19, 19, 9, -10, -9, 17, 6, 0, 3, -17, -38, 32, 15, -13, 4, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11};
        private static final int $$e = 139;
        private static final byte[] $$a = {3, 113, -44, TarConstants.LF_BLK, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
        private static final int $$b = 18;
        private static int write = 0;
        private static int AudioAttributesImplApi21Parcelizer = 1;
        private static char IconCompatParcelizer = 53826;
        private static char RemoteActionCompatParcelizer = 39102;
        private static char AudioAttributesCompatParcelizer = 35879;
        private static char read = 48820;

        private static String $$g(short s, byte b, int i) {
            int i2 = i * 4;
            int i3 = 122 - (b * 3);
            int i4 = (s * 4) + 4;
            byte[] bArr = $$c;
            byte[] bArr2 = new byte[i2 + 1];
            int i5 = -1;
            if (bArr == null) {
                i5 = -1;
                i3 = i4 + i3;
                i4++;
            }
            while (true) {
                int i6 = i5 + 1;
                bArr2[i6] = (byte) i3;
                if (i6 == i2) {
                    return new String(bArr2, 0);
                }
                int i7 = i3;
                i5 = i6;
                i3 = bArr[i4] + i7;
                i4++;
            }
        }

        public zza(Fragment fragment, IStreetViewPanoramaFragmentDelegate iStreetViewPanoramaFragmentDelegate) {
            this.zzbu = (IStreetViewPanoramaFragmentDelegate) Preconditions.checkNotNull(iStreetViewPanoramaFragmentDelegate);
            this.zzba = (Fragment) Preconditions.checkNotNull(fragment);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(byte r6, short r7, int r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.google.android.gms.maps.StreetViewPanoramaFragment.zza.$$a
                int r7 = 79 - r7
                int r8 = r8 * 10
                int r1 = 44 - r8
                int r6 = r6 * 12
                int r6 = 77 - r6
                byte[] r1 = new byte[r1]
                int r8 = 43 - r8
                r2 = 0
                if (r0 != 0) goto L17
                r6 = r7
                r4 = r8
                r3 = r2
                goto L2e
            L17:
                r3 = r2
                r5 = r7
                r7 = r6
                r6 = r5
            L1b:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r8) goto L28
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L28:
                int r3 = r3 + 1
                int r6 = r6 + 1
                r4 = r0[r6]
            L2e:
                int r4 = -r4
                int r7 = r7 + r4
                int r7 = r7 + (-1)
                goto L1b
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.StreetViewPanoramaFragment.zza.a(byte, short, int, java.lang.Object[]):void");
        }

        private static void c(byte b, byte b2, byte b3, Object[] objArr) {
            int i = b3 * 13;
            byte[] bArr = $$d;
            int i2 = (b * 29) + 82;
            int i3 = b2 + 4;
            byte[] bArr2 = new byte[i + 15];
            int i4 = i + 14;
            int i5 = -1;
            if (bArr == null) {
                i2 = i4 + i2 + 2;
            }
            while (true) {
                i5++;
                bArr2[i5] = (byte) i2;
                if (i5 == i4) {
                    objArr[0] = new String(bArr2, 0);
                    return;
                } else {
                    i3++;
                    i2 = i2 + bArr[i3] + 2;
                }
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            int i = 2 % 2;
            try {
                Bundle bundle3 = new Bundle();
                zzby.zza(bundle2, bundle3);
                this.zzbu.onInflate(ObjectWrapper.wrap(activity), null, bundle3);
                zzby.zza(bundle3, bundle2);
                int i2 = AudioAttributesImplApi21Parcelizer + 109;
                write = i2 % 128;
                if (i2 % 2 != 0) {
                    throw null;
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
            char c;
            int i2 = 2 % 2;
            isStopped isstopped = new isStopped();
            char[] cArr2 = new char[cArr.length];
            int i3 = 0;
            isstopped.read = 0;
            char[] cArr3 = new char[2];
            while (isstopped.read < cArr.length) {
                char c2 = 3;
                int i4 = $10 + 3;
                $11 = i4 % 128;
                int i5 = 58224;
                if (i4 % 2 == 0) {
                    cArr3[1] = cArr[isstopped.read];
                    cArr3[i3] = cArr[isstopped.read >> 1];
                } else {
                    cArr3[i3] = cArr[isstopped.read];
                    cArr3[1] = cArr[isstopped.read + 1];
                }
                int i6 = i3;
                while (i6 < 16) {
                    char c3 = cArr3[1];
                    char c4 = cArr3[i3];
                    int i7 = (c4 + i5) ^ ((c4 << 4) + ((char) (((long) AudioAttributesCompatParcelizer) ^ 1193402106669854891L)));
                    int i8 = c4 >>> 5;
                    try {
                        Object[] objArr2 = new Object[4];
                        objArr2[c2] = Integer.valueOf(read);
                        objArr2[2] = Integer.valueOf(i8);
                        objArr2[1] = Integer.valueOf(i7);
                        objArr2[i3] = Integer.valueOf(c3);
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                        if (objRemoteActionCompatParcelizer == null) {
                            char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(i3) + 1);
                            int iResolveSize = View.resolveSize(i3, i3) + 1504;
                            int mode = View.MeasureSpec.getMode(i3) + 21;
                            byte b = (byte) i3;
                            byte b2 = b;
                            String str$$g = $$g(b, b2, b2);
                            Class[] clsArr = new Class[4];
                            clsArr[i3] = Integer.TYPE;
                            clsArr[1] = Integer.TYPE;
                            clsArr[2] = Integer.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objRemoteActionCompatParcelizer = startForeground.read(bitsPerPixel, iResolveSize, mode, 1322448859, false, str$$g, clsArr);
                        }
                        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        cArr3[1] = cCharValue;
                        char[] cArr4 = cArr3;
                        Object[] objArr3 = {Integer.valueOf(cArr3[i3]), Integer.valueOf((cCharValue + i5) ^ ((cCharValue << 4) + ((char) (((long) IconCompatParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(RemoteActionCompatParcelizer)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            char deadChar = (char) KeyEvent.getDeadChar(0, 0);
                            int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 1504;
                            int absoluteGravity = 21 - Gravity.getAbsoluteGravity(0, 0);
                            byte b3 = (byte) 0;
                            byte b4 = b3;
                            String str$$g2 = $$g(b3, b4, b4);
                            c = 3;
                            objRemoteActionCompatParcelizer2 = startForeground.read(deadChar, minimumFlingVelocity, absoluteGravity, 1322448859, false, str$$g2, new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        } else {
                            c = 3;
                        }
                        cArr4[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                        i5 -= 40503;
                        i6++;
                        c2 = c;
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
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 9015 - ((byte) KeyEvent.getModifierMetaStateMask()), 58 - (ViewConfiguration.getEdgeSlop() >> 16), -1950993821, false, "D", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                int i9 = $10 + 51;
                $11 = i9 % 128;
                int i10 = i9 % 2;
                cArr3 = cArr5;
                i3 = 0;
            }
            objArr[0] = new String(cArr2, 0, i);
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onCreate(Bundle bundle) throws Throwable {
            Object[] objArr;
            char c;
            int i = 2 % 2;
            int i2 = AudioAttributesImplApi21Parcelizer + 63;
            write = i2 % 128;
            int i3 = i2 % 2;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
            if (objRemoteActionCompatParcelizer == null) {
                char longPressTimeout = (char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 13183);
                int i4 = 1649 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                int i5 = 26 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                byte b = $$a[5];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b2, (byte) (b2 | TarConstants.LF_GNUTYPE_LONGNAME), b, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(longPressTimeout, i4, i5, -133433128, false, (String) objArr2[0], null);
            }
            if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char mirror = (char) (AndroidCharacter.getMirror('0') + 13135);
                    int iIndexOf = 1648 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                    int i6 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 25;
                    byte b3 = $$a[17];
                    Object[] objArr3 = new Object[1];
                    a(b3, r7[39], b3, objArr3);
                    objRemoteActionCompatParcelizer2 = startForeground.read(mirror, iIndexOf, i6, -1033747278, false, (String) objArr3[0], null);
                }
                objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
                c = 3;
            } else {
                Object[] objArr4 = new Object[1];
                b(16 - KeyEvent.normalizeMetaState(0), new char[]{50078, 13593, 8755, 17969, 37990, 19902, 30912, 50026, 8652, 44020, 7200, 44612, 58949, 25591, 22214, 50343}, objArr4);
                Class<?> cls = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                b(16 - (ViewConfiguration.getJumpTapTimeout() >> 16), new char[]{64044, 25668, 65432, 43806, 12206, 29393, 49760, 8363, 6502, 28778, 33479, 13995, 35246, 46187, 19550, 9181}, objArr5);
                int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
                int i7 = write + 105;
                int i8 = i7 % 128;
                AudioAttributesImplApi21Parcelizer = i8;
                int i9 = i7 % 2;
                int i10 = i8 + 45;
                write = i10 % 128;
                int i11 = i10 % 2;
                try {
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 1416051385};
                    byte b4 = $$d[32];
                    Object[] objArr7 = new Object[1];
                    c(b4, (byte) (-b4), r5[20], objArr7);
                    Class<?> cls2 = Class.forName((String) objArr7[0]);
                    Object[] objArr8 = new Object[1];
                    c(r5[20], r5[7], r5[32], objArr8);
                    objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        char c2 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 13183);
                        int iGreen = 1649 - Color.green(0);
                        int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 27;
                        byte b5 = $$a[17];
                        Object[] objArr9 = new Object[1];
                        a(b5, r8[39], b5, objArr9);
                        objRemoteActionCompatParcelizer3 = startForeground.read(c2, iGreen, bitsPerPixel, -1033747278, false, (String) objArr9[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                    try {
                        Object[] objArr10 = new Object[1];
                        b((-16777194) - Color.rgb(0, 0, 0), new char[]{30912, 50026, 32284, 16440, 61162, 60986, 35991, 37606, 45096, 61347, 23792, 59331, 61503, 5701, 47022, 2668, 31616, 5006, 37758, 36249, 1006, 23157}, objArr10);
                        Class<?> cls3 = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        b((ViewConfiguration.getKeyRepeatDelay() >> 16) + 15, new char[]{21515, 13867, 38085, 37076, 53576, 24255, 31787, 41665, 61833, 15602, 4953, 16592, 30037, 56700, 5041, 27142}, objArr11);
                        long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            char pressedStateDuration = (char) (13183 - (ViewConfiguration.getPressedStateDuration() >> 16));
                            int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1649;
                            int iRgb = Color.rgb(0, 0, 0) + 16777242;
                            byte b6 = $$a[17];
                            Object[] objArr12 = new Object[1];
                            a(b6, r14[5], b6, objArr12);
                            objRemoteActionCompatParcelizer4 = startForeground.read(pressedStateDuration, fadingEdgeLength, iRgb, 54351865, false, (String) objArr12[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            char c3 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 13184);
                            int i12 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 1648;
                            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 26;
                            byte b7 = $$a[5];
                            byte b8 = b7;
                            Object[] objArr13 = new Object[1];
                            a(b8, (byte) (b8 | TarConstants.LF_GNUTYPE_LONGNAME), b7, objArr13);
                            objRemoteActionCompatParcelizer5 = startForeground.read(c3, i12, iResolveOpacity, -133433128, false, (String) objArr13[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf2);
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
            int i13 = ((int[]) objArr[c])[0];
            int i14 = ((int[]) objArr[2])[0];
            if (i14 != i13) {
                long j = -1;
                long j2 = 0;
                long j3 = (((long) (i13 ^ i14)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
                try {
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        objRemoteActionCompatParcelizer6 = startForeground.read((char) ((ViewConfiguration.getScrollBarFadeDuration() >> 16) + 4535), 6054 - KeyEvent.keyCodeFromString(""), 43 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                    try {
                        Object[] objArr14 = {177162511, Long.valueOf(j3), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                        Class cls4 = (Class) startForeground.IconCompatParcelizer((char) View.getDefaultSize(0, 0), 6030 - (ViewConfiguration.getScrollBarSize() >> 8), 23 - ImageFormat.getBitsPerPixel(0));
                        byte[] bArr = $$d;
                        Object[] objArr15 = new Object[1];
                        c(bArr[20], bArr[7], bArr[32], objArr15);
                        cls4.getMethod((String) objArr15[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr14);
                        int i15 = write + 29;
                        AudioAttributesImplApi21Parcelizer = i15 % 128;
                        int i16 = i15 % 2;
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
                int i2 = AudioAttributesImplApi21Parcelizer + 9;
                write = i2 % 128;
                if (i2 % 2 == 0) {
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
            int i2 = write + 75;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            try {
                this.zzbu.onStart();
                int i4 = write + 25;
                AudioAttributesImplApi21Parcelizer = i4 % 128;
                int i5 = i4 % 2;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onResume() {
            int i = 2 % 2;
            int i2 = write + 45;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    this.zzbu.onResume();
                } else {
                    this.zzbu.onResume();
                    throw null;
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onPause() {
            int i = 2 % 2;
            int i2 = write + 5;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    this.zzbu.onPause();
                    int i3 = write + 31;
                    AudioAttributesImplApi21Parcelizer = i3 % 128;
                    if (i3 % 2 == 0) {
                        int i4 = 40 / 0;
                        return;
                    }
                    return;
                }
                this.zzbu.onPause();
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
            int i2 = AudioAttributesImplApi21Parcelizer + 69;
            write = i2 % 128;
            int i3 = i2 % 2;
            try {
                this.zzbu.onStop();
                int i4 = write + 111;
                AudioAttributesImplApi21Parcelizer = i4 % 128;
                if (i4 % 2 == 0) {
                    throw null;
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onDestroyView() {
            int i = 2 % 2;
            int i2 = write + 7;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            try {
                this.zzbu.onDestroyView();
                int i4 = AudioAttributesImplApi21Parcelizer + 47;
                write = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 55 / 0;
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onDestroy() {
            int i = 2 % 2;
            int i2 = write + 19;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    this.zzbu.onDestroy();
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
            int i2 = write + 121;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    this.zzbu.onLowMemory();
                } else {
                    this.zzbu.onLowMemory();
                    throw null;
                }
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
                int i2 = AudioAttributesImplApi21Parcelizer + 101;
                write = i2 % 128;
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

        @Override // com.google.android.gms.maps.internal.StreetViewLifecycleDelegate
        public final void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            int i = 2 % 2;
            try {
                this.zzbu.getStreetViewPanoramaAsync(new zzah(this, onStreetViewPanoramaReadyCallback));
                int i2 = write + 27;
                AudioAttributesImplApi21Parcelizer = i2 % 128;
                int i3 = i2 % 2;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }
    }

    @Override // android.app.Fragment
    public void onAttach(Activity activity) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 109;
        write = i2 % 128;
        int i3 = i2 % 2;
        super.onAttach(activity);
        this.zzbt.setActivity(activity);
        int i4 = write + 19;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Fragment
    public void onInflate(Activity activity, AttributeSet attributeSet, Bundle bundle) {
        int i = 2 % 2;
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            super.onInflate(activity, attributeSet, bundle);
            this.zzbt.setActivity(activity);
            this.zzbt.onInflate(activity, new Bundle(), bundle);
            StrictMode.setThreadPolicy(threadPolicy);
            int i2 = write + 27;
            IconCompatParcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            StrictMode.setThreadPolicy(threadPolicy);
            throw th;
        }
    }

    private static void b(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i4 = $10 + 65;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(read[i + i6])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (Gravity.getAbsoluteGravity(0, 0) + 36621), 2340 - (ViewConfiguration.getFadingEdgeLength() >> 16), 28 - KeyEvent.getDeadChar(0, 0), 480654850, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(RemoteActionCompatParcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (MotionEvent.axisFromString("") + 1), 9701 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.indexOf("", "") + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 23783, KeyEvent.getDeadChar(0, 0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
        int i7 = $10 + 109;
        $11 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 5 / 3;
        }
        while (downloadService.write < i2) {
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            try {
                Object[] objArr5 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ExpandableListView.getPackedPositionGroup(0L), KeyEvent.getDeadChar(0, 0) + 23784, 32 - ImageFormat.getBitsPerPixel(0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                int i9 = $11 + 47;
                $10 = i9 % 128;
                int i10 = i9 % 2;
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr);
    }

    @Override // android.app.Fragment
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 19;
        write = i2 % 128;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 13183);
            int i4 = 1650 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            int iIndexOf = 26 - TextUtils.indexOf("", "");
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a((byte) 76, bArr[17], bArr[5], objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(trimmedLength, i4, iIndexOf, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 13183);
                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1649;
                int iMakeMeasureSpec = 26 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte[] bArr2 = $$a;
                Object[] objArr3 = new Object[1];
                a(bArr2[39], bArr2[5], bArr2[17], objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(cNormalizeMetaState, scrollDefaultDelay, iMakeMeasureSpec, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            c = 3;
        } else {
            Object[] objArr4 = new Object[1];
            b((char) ((-1) - TextUtils.lastIndexOf("", '0', 0, 0)), KeyEvent.getMaxKeyCode() >> 16, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 16, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b((char) (4004 - ExpandableListView.getPackedPositionGroup(0L)), 16 - View.MeasureSpec.getSize(0), 15 - ExpandableListView.getPackedPositionChild(0L), objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i5 = write + 49;
            IconCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -2108806885};
                byte[] bArr3 = $$d;
                Object[] objArr7 = new Object[1];
                c(bArr3[5], (byte) (-bArr3[15]), bArr3[1], objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                byte b = (byte) (-bArr3[15]);
                byte b2 = bArr3[1];
                Object[] objArr8 = new Object[1];
                c(b, b2, (byte) (b2 | 35), objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cLastIndexOf = (char) (13182 - TextUtils.lastIndexOf("", '0', 0));
                    int iNormalizeMetaState = KeyEvent.normalizeMetaState(0) + 1649;
                    int iIndexOf2 = 26 - TextUtils.indexOf("", "");
                    byte[] bArr4 = $$a;
                    Object[] objArr9 = new Object[1];
                    a(bArr4[39], bArr4[5], bArr4[17], objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(cLastIndexOf, iNormalizeMetaState, iIndexOf2, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b((char) (32457 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), Drawable.resolveOpacity(0, 0) + 32, 22 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b((char) (34899 - Color.red(0)), 54 - View.MeasureSpec.getMode(0), Gravity.getAbsoluteGravity(0, 0) + 15, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char c2 = (char) (13184 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int i7 = 1649 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        int scrollDefaultDelay2 = 26 - (ViewConfiguration.getScrollDefaultDelay() >> 16);
                        byte b3 = $$a[5];
                        Object[] objArr12 = new Object[1];
                        a(b3, b3, r15[17], objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(c2, i7, scrollDefaultDelay2, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char gidForName = (char) (13182 - Process.getGidForName(""));
                        int pressedStateDuration = (ViewConfiguration.getPressedStateDuration() >> 16) + 1649;
                        int i8 = (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26;
                        byte[] bArr5 = $$a;
                        Object[] objArr13 = new Object[1];
                        a((byte) 76, bArr5[17], bArr5[5], objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(gidForName, pressedStateDuration, i8, -133433128, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf2);
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
        int i9 = ((int[]) objArr[c])[0];
        int i10 = ((int[]) objArr[2])[0];
        if (i10 != i9) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i9 ^ i10)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (KeyEvent.getDeadChar(0, 0) + 4535), 6054 - TextUtils.indexOf("", ""), 42 - View.MeasureSpec.getSize(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i11 = write + 45;
                IconCompatParcelizer = i11 % 128;
                int i12 = i11 % 2;
                try {
                    Object[] objArr14 = {-1979940108, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6029, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 24);
                    byte b4 = $$d[1];
                    Object[] objArr15 = new Object[1];
                    c(b4, (byte) (b4 | 32), r2[13], objArr15);
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
        this.zzbt.onCreate(bundle);
    }

    @Override // android.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        int i2 = write + 17;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zzb zzbVar = this.zzbt;
        if (i3 != 0) {
            return zzbVar.onCreateView(layoutInflater, viewGroup, bundle);
        }
        zzbVar.onCreateView(layoutInflater, viewGroup, bundle);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Fragment
    public void onStart() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 53;
        write = i2 % 128;
        if (i2 % 2 == 0) {
            super.onStart();
            this.zzbt.onStart();
        } else {
            super.onStart();
            this.zzbt.onStart();
            throw null;
        }
    }

    @Override // android.app.Fragment
    public void onResume() {
        int i = 2 % 2;
        int i2 = write + 83;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            super.onResume();
            this.zzbt.onResume();
        } else {
            super.onResume();
            this.zzbt.onResume();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // android.app.Fragment
    public void onPause() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 87;
        write = i2 % 128;
        int i3 = i2 % 2;
        this.zzbt.onPause();
        super.onPause();
        int i4 = write + 125;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 38 / 0;
        }
    }

    @Override // android.app.Fragment
    public void onStop() {
        int i = 2 % 2;
        int i2 = write + 17;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            this.zzbt.onStop();
            super.onStop();
        } else {
            this.zzbt.onStop();
            super.onStop();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // android.app.Fragment
    public void onDestroyView() {
        int i = 2 % 2;
        int i2 = write + 59;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.zzbt.onDestroyView();
        super.onDestroyView();
        int i4 = IconCompatParcelizer + 117;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = write + 59;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            this.zzbt.onDestroy();
            super.onDestroy();
            int i3 = write + 109;
            IconCompatParcelizer = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        this.zzbt.onDestroy();
        super.onDestroy();
        throw null;
    }

    @Override // android.app.Fragment, android.content.ComponentCallbacks
    public void onLowMemory() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 67;
        write = i2 % 128;
        int i3 = i2 % 2;
        this.zzbt.onLowMemory();
        super.onLowMemory();
        int i4 = write + 107;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x0017  */
    @Override // android.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onActivityCreated(android.os.Bundle r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.maps.StreetViewPanoramaFragment.write
            int r2 = r1 + 85
            int r3 = r2 % 128
            com.google.android.gms.maps.StreetViewPanoramaFragment.IconCompatParcelizer = r3
            int r2 = r2 % r0
            if (r2 != 0) goto L15
            r2 = 19
            int r2 = r2 / 0
            if (r5 == 0) goto L30
            goto L17
        L15:
            if (r5 == 0) goto L30
        L17:
            int r1 = r1 + 15
            int r2 = r1 % 128
            com.google.android.gms.maps.StreetViewPanoramaFragment.IconCompatParcelizer = r2
            int r1 = r1 % r0
            java.lang.Class<com.google.android.gms.maps.StreetViewPanoramaFragment> r1 = com.google.android.gms.maps.StreetViewPanoramaFragment.class
            java.lang.ClassLoader r1 = r1.getClassLoader()
            r5.setClassLoader(r1)
            int r1 = com.google.android.gms.maps.StreetViewPanoramaFragment.IconCompatParcelizer
            int r1 = r1 + 79
            int r2 = r1 % 128
            com.google.android.gms.maps.StreetViewPanoramaFragment.write = r2
            int r1 = r1 % r0
        L30:
            super.onActivityCreated(r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.StreetViewPanoramaFragment.onActivityCreated(android.os.Bundle):void");
    }

    @Override // android.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 1;
        write = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (bundle != null) {
            bundle.setClassLoader(StreetViewPanoramaFragment.class.getClassLoader());
            int i3 = write + 85;
            IconCompatParcelizer = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 / 2;
            }
        }
        super.onSaveInstanceState(bundle);
        this.zzbt.onSaveInstanceState(bundle);
    }

    @Override // android.app.Fragment
    public void setArguments(Bundle bundle) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 77;
        write = i2 % 128;
        int i3 = i2 % 2;
        super.setArguments(bundle);
        if (i3 != 0) {
            throw null;
        }
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 69;
        write = i2 % 128;
        if (i2 % 2 == 0) {
            Preconditions.checkMainThread("getStreetViewPanoramaAsync() must be called on the main thread");
            this.zzbt.getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
            int i3 = IconCompatParcelizer + 105;
            write = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        Preconditions.checkMainThread("getStreetViewPanoramaAsync() must be called on the main thread");
        this.zzbt.getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
