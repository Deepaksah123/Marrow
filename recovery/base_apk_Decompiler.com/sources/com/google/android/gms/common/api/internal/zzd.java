package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Looper;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.notifyDownloadRemoved;
import kotlin.setTitleOptional;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class zzd extends Fragment implements LifecycleFragment {
    private static int AudioAttributesCompatParcelizer;
    private static int IconCompatParcelizer;
    private static long read;
    private static char write;
    private static final WeakHashMap zza;
    private final Map zzb = Collections.synchronizedMap(new setTitleOptional());
    private int zzc = 0;
    private Bundle zzd;
    private static final byte[] $$c = {124, -87, 60, -63};
    private static final int $$f = 163;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {TarConstants.LF_NORMAL, -108, 98, 5, -70, 71, -5, -18, 2, 21, 7, -6, -48, 39, -7, -2, -20, 14, -41, 12, 12, -20, -3, 2, -8, 12, -26, 8, 14, 3, -3, 0, -20, -41, 29, 12, -16, 1, -6, -48, 39, -7, -2, -20, 14, -41, 12, 12, -20, -3, 2, -8, 12, -26, 8};
    private static final int $$e = 248;
    private static final byte[] $$a = {98, -46, 102, 39, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 83;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static int RemoteActionCompatParcelizer = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r6, int r7, short r8) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 4
            int r8 = r8 * 4
            int r0 = r8 + 1
            byte[] r1 = com.google.android.gms.common.api.internal.zzd.$$c
            int r6 = r6 * 2
            int r6 = r6 + 103
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2a
        L17:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L1b:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L28:
            r3 = r1[r6]
        L2a:
            int r7 = r7 + r3
            int r6 = r6 + 1
            r3 = r4
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzd.$$g(int, int, short):java.lang.String");
    }

    static {
        IconCompatParcelizer = 0;
        read();
        zza = new WeakHashMap();
        int i = RemoteActionCompatParcelizer + 47;
        IconCompatParcelizer = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 * 10
            int r8 = 44 - r8
            int r7 = r7 * 12
            int r7 = r7 + 65
            byte[] r0 = com.google.android.gms.common.api.internal.zzd.$$a
            int r9 = r9 + 4
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r9 = r9 + 1
            if (r4 != r8) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r6
        L2c:
            int r3 = -r3
            int r9 = r9 + r3
            int r9 = r9 + (-1)
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzd.a(short, int, byte, java.lang.Object[]):void");
    }

    private static void c(int i, byte b, byte b2, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = b2 + 4;
        int i3 = i + 73;
        int i4 = b * 2;
        byte[] bArr2 = new byte[i4 + 6];
        int i5 = i4 + 5;
        int i6 = -1;
        if (bArr == null) {
            int i7 = i5 + i2;
            i2++;
            i3 = i7 + 5;
            i6 = -1;
        }
        while (true) {
            int i8 = i6 + 1;
            bArr2[i8] = (byte) i3;
            if (i8 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2++;
            i3 = i3 + bArr[i2] + 5;
            i6 = i8;
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final <T extends LifecycleCallback> T getCallbackOrNull(String str, Class<T> cls) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 35;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        T tCast = cls.cast(this.zzb.get(str));
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = MediaBrowserCompatItemReceiver + 81;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return tCast;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final /* synthetic */ Activity getLifecycleActivity() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 59;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            return getActivity();
        }
        getActivity();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = 2 % 2;
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.zzb.values().iterator();
        while (true) {
            Object obj = null;
            if (!it.hasNext()) {
                int i2 = MediaBrowserCompatItemReceiver + 89;
                AudioAttributesImplBaseParcelizer = i2 % 128;
                if (i2 % 2 == 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
            int i3 = MediaBrowserCompatItemReceiver + 93;
            AudioAttributesImplBaseParcelizer = i3 % 128;
            if (i3 % 2 != 0) {
                ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
                obj.hashCode();
                throw null;
            }
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = AudioAttributesImplBaseParcelizer + 3;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            super.onActivityResult(i, i2, intent);
            this.zzb.values().iterator();
            throw null;
        }
        super.onActivityResult(i, i2, intent);
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            int i5 = MediaBrowserCompatItemReceiver + 65;
            AudioAttributesImplBaseParcelizer = i5 % 128;
            if (i5 % 2 != 0) {
                ((LifecycleCallback) it.next()).onActivityResult(i, i2, intent);
                throw null;
            }
            ((LifecycleCallback) it.next()).onActivityResult(i, i2, intent);
        }
        int i6 = MediaBrowserCompatItemReceiver + 37;
        AudioAttributesImplBaseParcelizer = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 56 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.google.android.gms.common.api.internal.zzd zzc(kotlin.maybeGetTypeVariable r6) {
        /*
            java.lang.String r0 = "SupportLifecycleFragmentImpl"
            r1 = 2
            int r2 = r1 % r1
            java.util.WeakHashMap r2 = com.google.android.gms.common.api.internal.zzd.zza
            java.lang.Object r3 = r2.get(r6)
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            if (r3 == 0) goto L19
            java.lang.Object r3 = r3.get()
            com.google.android.gms.common.api.internal.zzd r3 = (com.google.android.gms.common.api.internal.zzd) r3
            if (r3 != 0) goto L18
            goto L19
        L18:
            return r3
        L19:
            androidx.fragment.app.FragmentManager r3 = r6.getSupportFragmentManager()     // Catch: java.lang.ClassCastException -> L5a
            androidx.fragment.app.Fragment r3 = r3.findFragmentByTag(r0)     // Catch: java.lang.ClassCastException -> L5a
            com.google.android.gms.common.api.internal.zzd r3 = (com.google.android.gms.common.api.internal.zzd) r3     // Catch: java.lang.ClassCastException -> L5a
            if (r3 == 0) goto L34
            int r4 = com.google.android.gms.common.api.internal.zzd.AudioAttributesImplBaseParcelizer
            int r4 = r4 + 31
            int r5 = r4 % 128
            com.google.android.gms.common.api.internal.zzd.MediaBrowserCompatItemReceiver = r5
            int r4 = r4 % r1
            boolean r4 = r3.isRemoving()
            if (r4 == 0) goto L48
        L34:
            com.google.android.gms.common.api.internal.zzd r3 = new com.google.android.gms.common.api.internal.zzd
            r3.<init>()
            androidx.fragment.app.FragmentManager r4 = r6.getSupportFragmentManager()
            o._doAddInjectable r4 = r4.IconCompatParcelizer()
            o._doAddInjectable r0 = r4.IconCompatParcelizer(r3, r0)
            r0.read()
        L48:
            java.lang.ref.WeakReference r0 = new java.lang.ref.WeakReference
            r0.<init>(r3)
            r2.put(r6, r0)
            int r6 = com.google.android.gms.common.api.internal.zzd.MediaBrowserCompatItemReceiver
            int r6 = r6 + 55
            int r0 = r6 % 128
            com.google.android.gms.common.api.internal.zzd.AudioAttributesImplBaseParcelizer = r0
            int r6 = r6 % r1
            return r3
        L5a:
            r6 = move-exception
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Fragment with tag SupportLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl"
            r0.<init>(r1, r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzd.zzc(o.maybeGetTypeVariable):com.google.android.gms.common.api.internal.zzd");
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void addCallback(String str, LifecycleCallback lifecycleCallback) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 79;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        if (this.zzb.containsKey(str)) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        int i4 = MediaBrowserCompatItemReceiver + 99;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            this.zzb.put(str, lifecycleCallback);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.zzb.put(str, lifecycleCallback);
        if (this.zzc > 0) {
            new zzi(Looper.getMainLooper()).post(new zzc(this, lifecycleCallback, str));
            int i5 = MediaBrowserCompatItemReceiver + 49;
            AudioAttributesImplBaseParcelizer = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 63;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        this.zzc = 5;
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            int i4 = MediaBrowserCompatItemReceiver + 93;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            int i5 = i4 % 2;
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 29;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            super.onResume();
            this.zzc = 5;
        } else {
            super.onResume();
            this.zzc = 3;
        }
        Iterator it = this.zzb.values().iterator();
        while (!(!it.hasNext())) {
            int i3 = MediaBrowserCompatItemReceiver + 5;
            AudioAttributesImplBaseParcelizer = i3 % 128;
            int i4 = i3 % 2;
            ((LifecycleCallback) it.next()).onResume();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 55;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        this.zzc = 2;
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).onStart();
            int i4 = AudioAttributesImplBaseParcelizer + 75;
            MediaBrowserCompatItemReceiver = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 57;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStop();
        this.zzc = 4;
        Iterator it = this.zzb.values().iterator();
        while (!(!it.hasNext())) {
            int i4 = AudioAttributesImplBaseParcelizer + 31;
            MediaBrowserCompatItemReceiver = i4 % 128;
            if (i4 % 2 == 0) {
                ((LifecycleCallback) it.next()).onStop();
                int i5 = 12 / 0;
            } else {
                ((LifecycleCallback) it.next()).onStop();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        Bundle bundle2;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 13183);
            int fadingEdgeLength = 1649 - (ViewConfiguration.getFadingEdgeLength() >> 16);
            int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 27;
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[17], bArr[5], bArr[53], objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(scrollBarSize, fadingEdgeLength, iIndexOf, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            int i2 = AudioAttributesImplBaseParcelizer + 95;
            MediaBrowserCompatItemReceiver = i2 % 128;
            int i3 = i2 % 2;
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char defaultSize = (char) (View.getDefaultSize(0, 0) + 13183);
                int i4 = 1650 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                int windowTouchSlop = (ViewConfiguration.getWindowTouchSlop() >> 8) + 26;
                byte[] bArr2 = $$a;
                Object[] objArr3 = new Object[1];
                a(bArr2[5], bArr2[17], bArr2[65], objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(defaultSize, i4, windowTouchSlop, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            int i5 = MediaBrowserCompatItemReceiver + 15;
            AudioAttributesImplBaseParcelizer = i5 % 128;
            int i6 = i5 % 2;
        } else {
            Object[] objArr4 = new Object[1];
            b(TextUtils.getOffsetAfter("", 0), new char[]{0, 0, 0, 0}, new char[]{40803, 7127, 51346, 35315, 20923, 4121, 35683, 14218, 32486, 11625, 53793, 26421, 17054, 29455, 34261, 4801}, (char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 47526), new char[]{65123, 17786, 42839, 5305}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(TextUtils.indexOf("", ""), new char[]{0, 0, 0, 0}, new char[]{48810, 36715, 16933, 51876, 36798, 30005, 43420, 27534, 39865, 1516, 29941, 17751, 15523, 56859, 34348, 3270}, (char) (TextUtils.indexOf("", "", 0, 0) + 61217), new char[]{41414, 43531, 8464, 57839}, objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i7 = MediaBrowserCompatItemReceiver + 37;
            AudioAttributesImplBaseParcelizer = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 874425121};
                byte[] bArr3 = $$d;
                byte b = (byte) (bArr3[13] - 1);
                byte b2 = bArr3[31];
                Object[] objArr7 = new Object[1];
                c(b, b2, b2, objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                c(bArr3[31], bArr3[10], bArr3[3], objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 13183);
                    int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 1649;
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 26;
                    byte[] bArr4 = $$a;
                    Object[] objArr9 = new Object[1];
                    a(bArr4[5], bArr4[17], bArr4[65], objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(maximumFlingVelocity, iIndexOf2, iResolveSizeAndState, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b(ExpandableListView.getPackedPositionGroup(0L), new char[]{0, 0, 0, 0}, new char[]{58974, 45268, 27385, 43985, 8964, 28571, 16597, 17042, 50992, 42834, 59849, 64406, 13893, 17313, 48675, 57171, 30951, 46420, 57534, 10412, 21735, 55836}, (char) (TextUtils.indexOf((CharSequence) "", '0') + 1), new char[]{59046, 4200, 61610, 47365}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b(1570082175 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), new char[]{0, 0, 0, 0}, new char[]{5750, 37848, 13697, 44153, 26579, 14562, 60571, 43116, 342, 63837, 31557, 41391, 35348, 5670, 18929}, (char) (33594 - KeyEvent.normalizeMetaState(0)), new char[]{32256, 38285, 14941, 64643}, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char pressedStateDuration = (char) (13183 - (ViewConfiguration.getPressedStateDuration() >> 16));
                        int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1649;
                        int iLastIndexOf = 25 - TextUtils.lastIndexOf("", '0', 0, 0);
                        byte[] bArr5 = $$a;
                        byte b3 = bArr5[5];
                        byte b4 = bArr5[17];
                        Object[] objArr12 = new Object[1];
                        a(b3, b4, (byte) (b4 | 74), objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(pressedStateDuration, offsetBefore, iLastIndexOf, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char keyRepeatDelay = (char) (13183 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                        int mode = View.MeasureSpec.getMode(0) + 1649;
                        int mirror = AndroidCharacter.getMirror('0') - 22;
                        byte[] bArr6 = $$a;
                        Object[] objArr13 = new Object[1];
                        a(bArr6[17], bArr6[5], bArr6[53], objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(keyRepeatDelay, mode, mirror, -133433128, false, (String) objArr13[0], null);
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
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (4535 - TextUtils.getOffsetBefore("", 0)), TextUtils.getOffsetAfter("", 0) + 6054, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                try {
                    Object[] objArr14 = {690692648, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (1 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), View.resolveSize(0, 0) + 6030, View.resolveSize(0, 0) + 24);
                    byte b5 = (byte) ($$d[27] + 1);
                    Object[] objArr15 = new Object[1];
                    c(b5, (byte) (b5 + 2), (byte) ($$e & 30), objArr15);
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
        this.zzc = 1;
        this.zzd = bundle;
        for (Map.Entry entry : this.zzb.entrySet()) {
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                bundle2 = bundle.getBundle((String) entry.getKey());
                int i11 = AudioAttributesImplBaseParcelizer + 101;
                MediaBrowserCompatItemReceiver = i11 % 128;
                int i12 = i11 % 2;
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.zzb.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
                int i2 = AudioAttributesImplBaseParcelizer + 103;
                MediaBrowserCompatItemReceiver = i2 % 128;
                int i3 = i2 % 2;
            }
        }
        int i4 = MediaBrowserCompatItemReceiver + 29;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 5 / 0;
        }
    }

    private static void b(int i, char[] cArr, char[] cArr2, char c, char[] cArr3, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
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
        int i5 = $11 + 105;
        $10 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 3 % 4;
        }
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i7 = $11 + 21;
            $10 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 22748, View.MeasureSpec.getSize(0) + 36, 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (31368 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), 2721 - ExpandableListView.getPackedPositionGroup(0L), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 37, 1895162189, false, $$g(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), View.combineMeasuredStates(0, 0) + 15713, 64 - (ViewConfiguration.getTouchSlop() >> 8), -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    i2 = 2;
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (40976 - View.MeasureSpec.makeMeasureSpec(0, 0)), 6122 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 29 - TextUtils.getTrimmedLength(""), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (read ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) AudioAttributesCompatParcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) write) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                i3 = i2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    static /* synthetic */ int zza(zzd zzdVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 59;
        int i3 = i2 % 128;
        AudioAttributesImplBaseParcelizer = i3;
        int i4 = i2 % 2;
        int i5 = zzdVar.zzc;
        int i6 = i3 + 37;
        MediaBrowserCompatItemReceiver = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static /* synthetic */ Bundle zzb(zzd zzdVar) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 23;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Bundle bundle = zzdVar.zzd;
        if (i3 == 0) {
            return bundle;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isCreated() {
        int i = 2 % 2;
        if (this.zzc > 0) {
            int i2 = MediaBrowserCompatItemReceiver + 103;
            AudioAttributesImplBaseParcelizer = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = MediaBrowserCompatItemReceiver + 7;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return false;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isStarted() {
        int i = 2 % 2;
        if (this.zzc >= 2) {
            int i2 = AudioAttributesImplBaseParcelizer + 15;
            MediaBrowserCompatItemReceiver = i2 % 128;
            int i3 = i2 % 2;
            return true;
        }
        int i4 = AudioAttributesImplBaseParcelizer + 111;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 35 / 0;
        }
        return false;
    }

    static void read() {
        read = -3498762522182953692L;
        AudioAttributesCompatParcelizer = -136981212;
        write = (char) 21921;
    }
}
