package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.internal.common.zzi;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.setTitleOptional;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public final class zzb extends Fragment implements LifecycleFragment {
    private static int AudioAttributesCompatParcelizer;
    private static byte[] IconCompatParcelizer;
    private static int MediaBrowserCompatItemReceiver;
    private static short[] RemoteActionCompatParcelizer;
    private static int read;
    private static int write;
    private static final WeakHashMap zza;
    private final Map zzb = Collections.synchronizedMap(new setTitleOptional());
    private int zzc = 0;
    private Bundle zzd;
    private static final byte[] $$c = {25, 68, TarConstants.LF_LINK, 97};
    private static final int $$f = 153;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {111, -63, 80, 27, 61, -61, -2, -19, 47, -39, -10, -15, -2, -5, 11, -3, 11, -31, -7, -5, -2, 9, 0, -16, 35, -45, -7, 1, 8, -23, -23, -12, -6, -9, 11, 32, -38, -21, 7, -10, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17};
    private static final int $$e = 103;
    private static final byte[] $$a = {123, -86, 125, 25, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 106;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int AudioAttributesImplBaseParcelizer = 1;
    private static int AudioAttributesImplApi21Parcelizer = 0;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r7, short r8, byte r9) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 112
            byte[] r0 = com.google.android.gms.common.api.internal.zzb.$$c
            int r9 = r9 + 4
            int r8 = r8 * 3
            int r8 = 1 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r8
            r3 = r9
            r4 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            int r9 = r9 + 1
            if (r4 != r8) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2a:
            int r9 = -r9
            int r7 = r7 + r9
            r9 = r3
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzb.$$g(byte, short, byte):java.lang.String");
    }

    static {
        MediaBrowserCompatItemReceiver = 1;
        RemoteActionCompatParcelizer();
        zza = new WeakHashMap();
        int i = AudioAttributesImplApi21Parcelizer + 93;
        MediaBrowserCompatItemReceiver = i % 128;
        int i2 = i % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(short r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 12
            int r9 = 77 - r9
            int r8 = r8 + 4
            byte[] r0 = com.google.android.gms.common.api.internal.zzb.$$a
            int r7 = r7 * 10
            int r7 = r7 + 34
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r9
            r5 = r2
            r9 = r8
            goto L2b
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r8]
            r6 = r9
            r9 = r8
            r8 = r3
            r3 = r6
        L2b:
            int r3 = r3 + r8
            int r8 = r9 + 1
            int r9 = r3 + (-1)
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzb.a(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = com.google.android.gms.common.api.internal.zzb.$$d
            int r8 = r8 + 4
            int r9 = r9 * 29
            int r9 = r9 + 82
            int r7 = 28 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r9 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L17:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L26
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L26:
            int r9 = r9 + 1
            r3 = r0[r9]
        L2a:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-4)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzb.c(short, int, byte, java.lang.Object[]):void");
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final <T extends LifecycleCallback> T getCallbackOrNull(String str, Class<T> cls) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 25;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        T tCast = cls.cast(this.zzb.get(str));
        int i4 = AudioAttributesImplBaseParcelizer + 105;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        return tCast;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final Activity getLifecycleActivity() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 31;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Activity activity = getActivity();
        if (i3 == 0) {
            int i4 = 20 / 0;
        }
        int i5 = AudioAttributesImplApi26Parcelizer + 11;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 42 / 0;
        }
        return activity;
    }

    @Override // android.app.Fragment
    public final void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 101;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.dump(str, fileDescriptor, printWriter, strArr);
        Iterator it = this.zzb.values().iterator();
        int i4 = AudioAttributesImplApi26Parcelizer + 89;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        while (it.hasNext()) {
            ((LifecycleCallback) it.next()).dump(str, fileDescriptor, printWriter, strArr);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = AudioAttributesImplApi26Parcelizer + 29;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        super.onActivityResult(i, i2, intent);
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            int i6 = AudioAttributesImplApi26Parcelizer + 77;
            AudioAttributesImplBaseParcelizer = i6 % 128;
            if (i6 % 2 == 0) {
                ((LifecycleCallback) it.next()).onActivityResult(i, i2, intent);
                throw null;
            }
            ((LifecycleCallback) it.next()).onActivityResult(i, i2, intent);
            int i7 = AudioAttributesImplBaseParcelizer + 113;
            AudioAttributesImplApi26Parcelizer = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 4 % 5;
            }
        }
    }

    public static zzb zzc(Activity activity) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 55;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        WeakHashMap weakHashMap = zza;
        WeakReference weakReference = (WeakReference) weakHashMap.get(activity);
        if (weakReference != null) {
            zzb zzbVar = (zzb) weakReference.get();
            if (zzbVar != null) {
                return zzbVar;
            }
            int i3 = AudioAttributesImplApi26Parcelizer + 119;
            AudioAttributesImplBaseParcelizer = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 3 % 3;
            }
        }
        try {
            zzb zzbVar2 = (zzb) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (zzbVar2 == null || zzbVar2.isRemoving()) {
                zzbVar2 = new zzb();
                activity.getFragmentManager().beginTransaction().add(zzbVar2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap.put(activity, new WeakReference(zzbVar2));
            return zzbVar2;
        } catch (ClassCastException e) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e);
        }
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final void addCallback(String str, LifecycleCallback lifecycleCallback) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 79;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        if (!(!this.zzb.containsKey(str))) {
            throw new IllegalArgumentException("LifecycleCallback with tag " + str + " already added to this fragment.");
        }
        int i4 = AudioAttributesImplBaseParcelizer + 25;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        this.zzb.put(str, lifecycleCallback);
        if (this.zzc > 0) {
            new zzi(Looper.getMainLooper()).post(new zza(this, lifecycleCallback, str));
        }
        int i6 = AudioAttributesImplApi26Parcelizer + 91;
        AudioAttributesImplBaseParcelizer = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 15;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            this.zzc = 2;
        } else {
            super.onDestroy();
            this.zzc = 5;
        }
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            int i3 = AudioAttributesImplBaseParcelizer + 121;
            AudioAttributesImplApi26Parcelizer = i3 % 128;
            int i4 = i3 % 2;
            ((LifecycleCallback) it.next()).onDestroy();
        }
    }

    @Override // android.app.Fragment
    public final void onResume() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 93;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onResume();
        this.zzc = 3;
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            int i4 = AudioAttributesImplApi26Parcelizer + 49;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                ((LifecycleCallback) it.next()).onResume();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ((LifecycleCallback) it.next()).onResume();
        }
        int i5 = AudioAttributesImplApi26Parcelizer + 117;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // android.app.Fragment
    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 73;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        this.zzc = 2;
        Iterator it = this.zzb.values().iterator();
        while (it.hasNext()) {
            int i4 = AudioAttributesImplApi26Parcelizer + 125;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            if (i4 % 2 == 0) {
                ((LifecycleCallback) it.next()).onStart();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            ((LifecycleCallback) it.next()).onStart();
        }
    }

    @Override // android.app.Fragment
    public final void onStop() {
        Map map;
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 15;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            super.onStop();
            this.zzc = 5;
            map = this.zzb;
        } else {
            super.onStop();
            this.zzc = 4;
            map = this.zzb;
        }
        Iterator it = map.values().iterator();
        while (it.hasNext()) {
            int i3 = AudioAttributesImplApi26Parcelizer + 1;
            AudioAttributesImplBaseParcelizer = i3 % 128;
            int i4 = i3 % 2;
            ((LifecycleCallback) it.next()).onStop();
        }
        int i5 = AudioAttributesImplApi26Parcelizer + 7;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        char c;
        Bundle bundle2;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char c2 = (char) (13183 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
            int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 1649;
            int touchSlop = 26 - (ViewConfiguration.getTouchSlop() >> 8);
            byte[] bArr = $$a;
            byte b = bArr[53];
            byte b2 = bArr[5];
            Object[] objArr2 = new Object[1];
            a(b, b2, b2, objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(c2, iResolveOpacity, touchSlop, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            int i2 = AudioAttributesImplBaseParcelizer + 79;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            if (i2 % 2 != 0) {
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char c3 = (char) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13183);
                    int tapTimeout = (ViewConfiguration.getTapTimeout() >> 16) + 1649;
                    int pressedStateDuration = 26 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    Object[] objArr3 = new Object[1];
                    a(r0[5], (byte) (-$$a[27]), r0[53], objArr3);
                    objRemoteActionCompatParcelizer2 = startForeground.read(c3, tapTimeout, pressedStateDuration, -1033747278, false, (String) objArr3[0], null);
                }
                throw null;
            }
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer3 == null) {
                char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 13183);
                int iMyTid = (Process.myTid() >> 22) + 1649;
                int i3 = 26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                Object[] objArr4 = new Object[1];
                a(r3[5], (byte) (-$$a[27]), r3[53], objArr4);
                objRemoteActionCompatParcelizer3 = startForeground.read(cMakeMeasureSpec, iMyTid, i3, -1033747278, false, (String) objArr4[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            int i4 = AudioAttributesImplApi26Parcelizer + 121;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            int i5 = i4 % 2;
            c = 3;
        } else {
            Object[] objArr5 = new Object[1];
            b((byte) (8 - KeyEvent.getDeadChar(0, 0)), (-1226432419) - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 1672922392, (short) View.getDefaultSize(0, 0), (-95) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            b((byte) (42 - Color.alpha(0)), (-1226432421) - MotionEvent.axisFromString(""), 1672922408 - TextUtils.lastIndexOf("", '0', 0), (short) (ViewConfiguration.getJumpTapTimeout() >> 16), (-95) - View.resolveSizeAndState(0, 0, 0), objArr6);
            try {
                Object[] objArr7 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue()), 0, -506891051};
                byte[] bArr2 = $$d;
                byte b3 = bArr2[27];
                Object[] objArr8 = new Object[1];
                c(b3, bArr2[53], b3, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                byte b4 = bArr2[22];
                byte b5 = b4;
                Object[] objArr9 = new Object[1];
                c(b5, (byte) (b5 | 25), b4, objArr9);
                objArr = (Object[]) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr7);
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char absoluteGravity = (char) (Gravity.getAbsoluteGravity(0, 0) + 13183);
                    int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1649;
                    int iResolveSizeAndState2 = 26 - View.resolveSizeAndState(0, 0, 0);
                    Object[] objArr10 = new Object[1];
                    a(r10[5], (byte) (-$$a[27]), r10[53], objArr10);
                    objRemoteActionCompatParcelizer4 = startForeground.read(absoluteGravity, iResolveSizeAndState, iResolveSizeAndState2, -1033747278, false, (String) objArr10[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    b((byte) (TextUtils.indexOf("", "") + 8), (-1226432428) - ExpandableListView.getPackedPositionGroup(0L), TextUtils.indexOf((CharSequence) "", '0', 0) + 1672922426, (short) (ViewConfiguration.getTapTimeout() >> 16), ExpandableListView.getPackedPositionType(0L) - 95, objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b((byte) (ExpandableListView.getPackedPositionType(0L) - 93), 8328 - AndroidCharacter.getMirror('0'), Color.alpha(0) + 1672922447, (short) ((-1) - TextUtils.lastIndexOf("", '0', 0)), (-96) - Process.getGidForName(""), objArr12);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 13183);
                        int i6 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1648;
                        int gidForName = Process.getGidForName("") + 27;
                        byte b6 = $$a[5];
                        Object[] objArr13 = new Object[1];
                        a(b6, (byte) (b6 | TarConstants.LF_GNUTYPE_LONGNAME), r12[53], objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(keyRepeatDelay, i6, gidForName, 54351865, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char cRgb = (char) (Color.rgb(0, 0, 0) + 16790399);
                        int iIndexOf = 1649 - TextUtils.indexOf("", "");
                        int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 26;
                        byte[] bArr3 = $$a;
                        byte b7 = bArr3[53];
                        byte b8 = bArr3[5];
                        Object[] objArr14 = new Object[1];
                        a(b7, b8, b8, objArr14);
                        objRemoteActionCompatParcelizer6 = startForeground.read(cRgb, iIndexOf, packedPositionType, -133433128, false, (String) objArr14[0], null);
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
        int i7 = ((int[]) objArr[c])[0];
        int i8 = ((int[]) objArr[2])[0];
        if (i8 != i7) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i7 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) (Drawable.resolveOpacity(0, 0) + 4535), 6055 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), View.resolveSize(0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i9 = AudioAttributesImplApi26Parcelizer + 87;
                AudioAttributesImplBaseParcelizer = i9 % 128;
                int i10 = i9 % 2;
                try {
                    Object[] objArr15 = {-585560518, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 6030 - View.combineMeasuredStates(0, 0), (ViewConfiguration.getJumpTapTimeout() >> 16) + 24);
                    byte b9 = $$d[22];
                    byte b10 = b9;
                    Object[] objArr16 = new Object[1];
                    c(b10, (byte) (b10 | 25), b9, objArr16);
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
        super.onCreate(bundle);
        this.zzc = 1;
        this.zzd = bundle;
        Iterator it = this.zzb.entrySet().iterator();
        while (!(!it.hasNext())) {
            Map.Entry entry = (Map.Entry) it.next();
            LifecycleCallback lifecycleCallback = (LifecycleCallback) entry.getValue();
            if (bundle != null) {
                int i11 = AudioAttributesImplApi26Parcelizer + 107;
                AudioAttributesImplBaseParcelizer = i11 % 128;
                if (i11 % 2 == 0) {
                    bundle2 = bundle.getBundle((String) entry.getKey());
                    int i12 = 95 / 0;
                } else {
                    bundle2 = bundle.getBundle((String) entry.getKey());
                }
            } else {
                bundle2 = null;
            }
            lifecycleCallback.onCreate(bundle2);
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            for (Map.Entry entry : this.zzb.entrySet()) {
                Bundle bundle2 = new Bundle();
                ((LifecycleCallback) entry.getValue()).onSaveInstanceState(bundle2);
                bundle.putBundle((String) entry.getKey(), bundle2);
            }
        } else {
            int i2 = AudioAttributesImplBaseParcelizer + 53;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = AudioAttributesImplApi26Parcelizer + 67;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x025e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(byte r24, int r25, int r26, short r27, int r28, java.lang.Object[] r29) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 677
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.zzb.b(byte, int, int, short, int, java.lang.Object[]):void");
    }

    static /* synthetic */ int zza(zzb zzbVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer;
        int i3 = i2 + 79;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        int i5 = zzbVar.zzc;
        int i6 = i2 + 7;
        AudioAttributesImplApi26Parcelizer = i6 % 128;
        int i7 = i6 % 2;
        return i5;
    }

    static /* synthetic */ Bundle zzb(zzb zzbVar) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 113;
        int i3 = i2 % 128;
        AudioAttributesImplApi26Parcelizer = i3;
        int i4 = i2 % 2;
        Bundle bundle = zzbVar.zzd;
        if (i4 != 0) {
            int i5 = 9 / 0;
        }
        int i6 = i3 + 33;
        AudioAttributesImplBaseParcelizer = i6 % 128;
        if (i6 % 2 != 0) {
            return bundle;
        }
        throw null;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isCreated() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer;
        int i3 = i2 + 1;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        if (this.zzc <= 0) {
            return false;
        }
        int i5 = i2 + 105;
        AudioAttributesImplApi26Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        return true;
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleFragment
    public final boolean isStarted() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer;
        int i3 = i2 + 121;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        int i5 = this.zzc;
        if (i4 == 0 ? i5 < 2 : i5 < 4) {
            return false;
        }
        int i6 = i2 + 123;
        AudioAttributesImplApi26Parcelizer = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 40 / 0;
        }
        return true;
    }

    static void RemoteActionCompatParcelizer() {
        write = 1398847568;
        read = -819363095;
        AudioAttributesCompatParcelizer = -2043649350;
        IconCompatParcelizer = new byte[]{5, -73, 78, -66, 69, -103, -102, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 70, -78, 74, -127, 114, 84, -86, 72, 5, -100, 104, -79, 70, 104, -113, -124, 82, -104, -106, 104, -101, -108, -100, 102, 15, -73, TarConstants.LF_GNUTYPE_LONGLINK, -68, -106, 105, -73, 78, -66, 69, -103, -102, 4, -69, -2, 117, 68, 69, 66, -79, 73, -78, 6, -20, 16, -31, 28, 31, -24, 7, -6, -21, -26, 23, 27, -31, 19};
    }
}
