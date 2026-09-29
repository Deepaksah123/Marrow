package com.google.android.gms.dynamic;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.common.GoogleApiAvailability;
import com.google.android.gms.dynamic.LifecycleDelegate;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import kotlin.buildSetStopReasonIntent;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public abstract class DeferredLifecycleHelper<T extends LifecycleDelegate> {
    private static int $10 = 0;
    private static int $11 = 1;
    private LifecycleDelegate zaa;
    private Bundle zab;
    private LinkedList zac;
    private final OnDelegateCreatedListener zad = new zaa(this);
    private static final byte[] $$d = {42, -44, 23, -55, 61, -61, -2, -19, 44, -53, -1, 13, -23, 7, -10, -3, 29, -32, -7, -4, -1, -14, -30, -16, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17, -23, -12, -6, -9, 11, 32, -38, -21, 7, -10, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17};
    private static final int $$e = 87;
    private static final byte[] $$a = {99, -29, 19, 27, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 29;
    private static int IconCompatParcelizer = 0;
    private static int write = 1;
    private static char[] read = {44988, 45027, 45030, 45049, 45052, 45036, 45002, 44992, 45024, 45037, 45036, 44999, 45005, 45025, 45025, 45039, 44976, 45028, 45028, 45051, 45027, 45038, 45036, 45037, 45038, 45027, 45011, 45023, 45031, 45024, 45022, 45034, 45005, 44831, 44829, 44819, 44820, 44816, 44830, 45053, 45046, 44821, 45044, 45028, 44830, 44846, 44843, 44816, 44829, 44812, 44815, 44817, 44829, 44831, 44815, 44683, 44683, 44675, 44678, 44700, 44702, 44699, 44677, 44673, 44676, 44678, 44676, 44701, 44696};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 12
            int r7 = r7 + 65
            int r6 = r6 * 10
            int r0 = 44 - r6
            int r8 = r8 + 4
            byte[] r1 = com.google.android.gms.dynamic.DeferredLifecycleHelper.$$a
            byte[] r0 = new byte[r0]
            int r6 = 43 - r6
            r2 = 0
            if (r1 != 0) goto L17
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2d:
            int r7 = r7 + r8
            int r8 = r3 + 1
            int r7 = r7 + (-1)
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamic.DeferredLifecycleHelper.a(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r7, byte r8, int r9, java.lang.Object[] r10) {
        /*
            int r8 = 40 - r8
            int r9 = 111 - r9
            int r7 = r7 + 19
            byte[] r0 = com.google.android.gms.dynamic.DeferredLifecycleHelper.$$d
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
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamic.DeferredLifecycleHelper.c(short, byte, int, java.lang.Object[]):void");
    }

    protected abstract void createDelegate(OnDelegateCreatedListener<T> onDelegateCreatedListener);

    protected void handleGooglePlayUnavailable(FrameLayout frameLayout) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 61;
        write = i2 % 128;
        int i3 = i2 % 2;
        showGooglePlayUnavailableMessage(frameLayout);
        int i4 = IconCompatParcelizer + 23;
        write = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x004f, code lost:
    
        r4 = com.google.android.gms.dynamic.DeferredLifecycleHelper.IconCompatParcelizer + 31;
        com.google.android.gms.dynamic.DeferredLifecycleHelper.write = r4 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if ((r4 % 2) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x005a, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        r2.hashCode();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x005e, code lost:
    
        throw null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zae(int r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
        L3:
            java.util.LinkedList r1 = r4.zac
            boolean r1 = r1.isEmpty()
            r2 = 0
            if (r1 != 0) goto L4f
            int r1 = com.google.android.gms.dynamic.DeferredLifecycleHelper.IconCompatParcelizer
            int r1 = r1 + 37
            int r3 = r1 % 128
            com.google.android.gms.dynamic.DeferredLifecycleHelper.write = r3
            int r1 = r1 % r0
            if (r1 == 0) goto L40
            java.util.LinkedList r1 = r4.zac
            java.lang.Object r1 = r1.getLast()
            com.google.android.gms.dynamic.zah r1 = (com.google.android.gms.dynamic.zah) r1
            int r1 = r1.zaa()
            if (r1 < r5) goto L4f
            int r1 = com.google.android.gms.dynamic.DeferredLifecycleHelper.write
            int r1 = r1 + 113
            int r3 = r1 % 128
            com.google.android.gms.dynamic.DeferredLifecycleHelper.IconCompatParcelizer = r3
            int r1 = r1 % 2
            if (r1 != 0) goto L37
            java.util.LinkedList r1 = r4.zac
            r1.removeLast()
            goto L3
        L37:
            java.util.LinkedList r4 = r4.zac
            r4.removeLast()
            r2.hashCode()
            throw r2
        L40:
            java.util.LinkedList r4 = r4.zac
            java.lang.Object r4 = r4.getLast()
            com.google.android.gms.dynamic.zah r4 = (com.google.android.gms.dynamic.zah) r4
            r4.zaa()
            r2.hashCode()
            throw r2
        L4f:
            int r4 = com.google.android.gms.dynamic.DeferredLifecycleHelper.IconCompatParcelizer
            int r4 = r4 + 31
            int r5 = r4 % 128
            com.google.android.gms.dynamic.DeferredLifecycleHelper.write = r5
            int r4 = r4 % r0
            if (r4 == 0) goto L5b
            return
        L5b:
            r2.hashCode()
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamic.DeferredLifecycleHelper.zae(int):void");
    }

    private final void zaf(Bundle bundle, zah zahVar) {
        int i = 2 % 2;
        LifecycleDelegate lifecycleDelegate = this.zaa;
        if (lifecycleDelegate != null) {
            zahVar.zab(lifecycleDelegate);
            int i2 = IconCompatParcelizer + 109;
            write = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        if (this.zac == null) {
            this.zac = new LinkedList();
        }
        this.zac.add(zahVar);
        if (bundle != null) {
            int i4 = IconCompatParcelizer + 75;
            int i5 = i4 % 128;
            write = i5;
            int i6 = i4 % 2;
            Bundle bundle2 = this.zab;
            if (bundle2 == null) {
                int i7 = i5 + 85;
                IconCompatParcelizer = i7 % 128;
                int i8 = i7 % 2;
                this.zab = (Bundle) bundle.clone();
            } else {
                bundle2.putAll(bundle);
            }
        }
        createDelegate(this.zad);
    }

    public static void showGooglePlayUnavailableMessage(FrameLayout frameLayout) {
        int i = 2 % 2;
        GoogleApiAvailability googleApiAvailability = GoogleApiAvailability.getInstance();
        Context context = frameLayout.getContext();
        int iIsGooglePlayServicesAvailable = googleApiAvailability.isGooglePlayServicesAvailable(context);
        String strZac = com.google.android.gms.common.internal.zac.zac(context, iIsGooglePlayServicesAvailable);
        String strZab = com.google.android.gms.common.internal.zac.zab(context, iIsGooglePlayServicesAvailable);
        LinearLayout linearLayout = new LinearLayout(frameLayout.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        frameLayout.addView(linearLayout);
        TextView textView = new TextView(frameLayout.getContext());
        textView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
        textView.setText(strZac);
        linearLayout.addView(textView);
        Intent errorResolutionIntent = googleApiAvailability.getErrorResolutionIntent(context, iIsGooglePlayServicesAvailable, null);
        if (errorResolutionIntent != null) {
            Button button = new Button(context);
            button.setId(R.id.button1);
            button.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
            button.setText(strZab);
            linearLayout.addView(button);
            button.setOnClickListener(new zae(context, errorResolutionIntent));
        }
        int i2 = write + 85;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char cMakeMeasureSpec = (char) (View.MeasureSpec.makeMeasureSpec(0, 0) + 13183);
            int iLastIndexOf = 1648 - TextUtils.lastIndexOf("", '0');
            int iAlpha = 26 - Color.alpha(0);
            byte b = $$a[5];
            Object[] objArr2 = new Object[1];
            a(b, r4[53], b, objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(cMakeMeasureSpec, iLastIndexOf, iAlpha, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char tapTimeout = (char) (13183 - (ViewConfiguration.getTapTimeout() >> 16));
                int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 1649;
                int iGreen = 26 - Color.green(0);
                Object[] objArr3 = new Object[1];
                a(r7[53], r7[5], (byte) (-$$a[27]), objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(tapTimeout, fadingEdgeLength, iGreen, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            int i2 = IconCompatParcelizer + 41;
            write = i2 % 128;
            int i3 = i2 % 2;
            c = 3;
        } else {
            Object[] objArr4 = new Object[1];
            b(new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{0, 16, 0, 0}, true, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(new byte[]{0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1}, new int[]{16, 16, 0, 7}, true, objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i4 = write + 27;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 1057843366};
                byte[] bArr = $$d;
                byte b2 = bArr[10];
                byte b3 = (byte) (b2 + 1);
                Object[] objArr7 = new Object[1];
                c(b3, (byte) (b3 | 37), (byte) (b2 + 1), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                c((byte) (-bArr[10]), (byte) (-bArr[7]), (byte) (-bArr[47]), objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0, 0) + 13184);
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 1649;
                    int i6 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25;
                    Object[] objArr9 = new Object[1];
                    a(r6[53], r6[5], (byte) (-$$a[27]), objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(cLastIndexOf, capsMode, i6, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, new int[]{32, 22, 46, 0}, false, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b(new byte[]{0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0}, new int[]{54, 15, 166, 9}, false, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char defaultSize = (char) (13183 - View.getDefaultSize(0, 0));
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1650;
                        int maximumDrawingCacheSize = 26 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        byte[] bArr2 = $$a;
                        byte b4 = bArr2[53];
                        byte b5 = bArr2[5];
                        Object[] objArr12 = new Object[1];
                        a(b4, b5, (byte) (b5 | TarConstants.LF_GNUTYPE_LONGNAME), objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(defaultSize, iIndexOf, maximumDrawingCacheSize, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char c2 = (char) (13184 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                        int i7 = 1650 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int iLastIndexOf2 = 25 - TextUtils.lastIndexOf("", '0', 0, 0);
                        byte b6 = $$a[5];
                        Object[] objArr13 = new Object[1];
                        a(b6, r7[53], b6, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(c2, i7, iLastIndexOf2, -133433128, false, (String) objArr13[0], null);
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
        int i8 = ((int[]) objArr[c])[0];
        int i9 = ((int[]) objArr[2])[0];
        if (i9 != i8) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i9 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (4535 - (KeyEvent.getMaxKeyCode() >> 16)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 6054, (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                try {
                    Object[] objArr14 = {-1488186722, Long.valueOf(j3), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (Process.myPid() >> 22), 6031 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 24 - KeyEvent.normalizeMetaState(0));
                    byte[] bArr3 = $$d;
                    Object[] objArr15 = new Object[1];
                    c((byte) (-bArr3[44]), (byte) (bArr3[10] + 1), bArr3[16], objArr15);
                    cls4.getMethod((String) objArr15[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr14);
                    int i10 = IconCompatParcelizer + 39;
                    write = i10 % 128;
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
        zaf(bundle, new zac(this, bundle));
    }

    public void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
        int i = 2 % 2;
        zaf(bundle2, new zab(this, activity, bundle, bundle2));
        int i2 = write + 125;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onLowMemory() {
        int i = 2 % 2;
        LifecycleDelegate lifecycleDelegate = this.zaa;
        if (lifecycleDelegate != null) {
            int i2 = write + 39;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            lifecycleDelegate.onLowMemory();
            int i4 = write + 37;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public void onResume() {
        int i = 2 % 2;
        zaf(null, new zag(this));
        int i2 = write + 55;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onStart() {
        int i = 2 % 2;
        zaf(null, new zaf(this));
        int i2 = write + 107;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 13 / 0;
        }
    }

    public void onDestroy() {
        int i = 2 % 2;
        LifecycleDelegate lifecycleDelegate = this.zaa;
        if (lifecycleDelegate != null) {
            lifecycleDelegate.onDestroy();
            int i2 = write + 19;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            return;
        }
        zae(1);
        int i4 = write + 109;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void onDestroyView() {
        int i = 2 % 2;
        LifecycleDelegate lifecycleDelegate = this.zaa;
        Object obj = null;
        if (lifecycleDelegate == null) {
            zae(2);
            int i2 = write + 103;
            IconCompatParcelizer = i2 % 128;
            if (i2 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        int i3 = write + 105;
        IconCompatParcelizer = i3 % 128;
        if (i3 % 2 == 0) {
            lifecycleDelegate.onDestroyView();
        } else {
            lifecycleDelegate.onDestroyView();
            obj.hashCode();
            throw null;
        }
    }

    public void onPause() {
        int i = 2 % 2;
        LifecycleDelegate lifecycleDelegate = this.zaa;
        if (lifecycleDelegate == null) {
            zae(5);
            return;
        }
        int i2 = IconCompatParcelizer + 117;
        write = i2 % 128;
        int i3 = i2 % 2;
        lifecycleDelegate.onPause();
        int i4 = IconCompatParcelizer + 49;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001e, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x001f, code lost:
    
        r3 = r3.zab;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if (r3 == null) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r4.putAll(r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0026, code lost:
    
        r3 = com.google.android.gms.dynamic.DeferredLifecycleHelper.IconCompatParcelizer + 97;
        com.google.android.gms.dynamic.DeferredLifecycleHelper.write = r3 % 128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002f, code lost:
    
        if ((r3 % 2) == 0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0031, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0033, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0014, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0019, code lost:
    
        if (r1 != null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001b, code lost:
    
        r1.onSaveInstanceState(r4);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onSaveInstanceState(android.os.Bundle r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.google.android.gms.dynamic.DeferredLifecycleHelper.IconCompatParcelizer
            int r1 = r1 + 51
            int r2 = r1 % 128
            com.google.android.gms.dynamic.DeferredLifecycleHelper.write = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            com.google.android.gms.dynamic.LifecycleDelegate r1 = r3.zaa
            r2 = 44
            int r2 = r2 / 0
            if (r1 == 0) goto L1f
            goto L1b
        L17:
            com.google.android.gms.dynamic.LifecycleDelegate r1 = r3.zaa
            if (r1 == 0) goto L1f
        L1b:
            r1.onSaveInstanceState(r4)
            return
        L1f:
            android.os.Bundle r3 = r3.zab
            if (r3 == 0) goto L26
            r4.putAll(r3)
        L26:
            int r3 = com.google.android.gms.dynamic.DeferredLifecycleHelper.IconCompatParcelizer
            int r3 = r3 + 97
            int r4 = r3 % 128
            com.google.android.gms.dynamic.DeferredLifecycleHelper.write = r4
            int r3 = r3 % r0
            if (r3 == 0) goto L32
            return
        L32:
            r3 = 0
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.dynamic.DeferredLifecycleHelper.onSaveInstanceState(android.os.Bundle):void");
    }

    public void onStop() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 77;
        write = i3 % 128;
        int i4 = i3 % 2;
        LifecycleDelegate lifecycleDelegate = this.zaa;
        if (lifecycleDelegate == null) {
            zae(4);
            return;
        }
        int i5 = i2 + 101;
        write = i5 % 128;
        if (i5 % 2 == 0) {
            lifecycleDelegate.onStop();
            throw null;
        }
        lifecycleDelegate.onStop();
        int i6 = write + 23;
        IconCompatParcelizer = i6 % 128;
        int i7 = i6 % 2;
    }

    @ResultIgnorabilityUnspecified
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 2 % 2;
        FrameLayout frameLayout = new FrameLayout(layoutInflater.getContext());
        zaf(bundle, new zad(this, frameLayout, layoutInflater, viewGroup, bundle));
        if (this.zaa == null) {
            int i2 = IconCompatParcelizer + 49;
            write = i2 % 128;
            int i3 = i2 % 2;
            handleGooglePlayUnavailable(frameLayout);
            if (i3 == 0) {
                int i4 = 32 / 0;
            }
        }
        int i5 = write + 115;
        IconCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return frameLayout;
    }

    private static void b(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        char[] cArr;
        int i;
        int i2 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr2 = read;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i7 = 0; i7 < length; i7++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) Color.red(0), 11613 - (ViewConfiguration.getScrollDefaultDelay() >> 16), View.resolveSizeAndState(0, 0, 0) + 20, -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr3[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        char[] cArr4 = new char[i4];
        System.arraycopy(cArr2, i3, cArr4, 0, i4);
        if (bArr != null) {
            int i8 = $11 + 91;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr5 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i10 = $10 + 25;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                    int i12 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 22959 - (ViewConfiguration.getEdgeSlop() >> 16), 42 - ImageFormat.getBitsPerPixel(0), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr5[i12] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                } else {
                    int i13 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 31590), 9863 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (KeyEvent.getMaxKeyCode() >> 16) + 65, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr5[i13] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c = cArr5[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (Color.rgb(0, 0, 0) + 16815038), 9755 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 26 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                int i14 = $10 + 29;
                $11 = i14 % 128;
                if (i14 % 2 == 0) {
                    int i15 = 5 / 4;
                }
            }
            cArr4 = cArr5;
        }
        if (i6 > 0) {
            char[] cArr6 = new char[i4];
            System.arraycopy(cArr4, 0, cArr6, 0, i4);
            int i16 = i4 - i6;
            System.arraycopy(cArr6, 0, cArr4, i16, i6);
            System.arraycopy(cArr6, i6, cArr4, 0, i16);
        }
        if (z) {
            int i17 = $10 + 33;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                cArr = new char[i4];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 1;
            } else {
                cArr = new char[i4];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            }
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                int i18 = $10 + 113;
                $11 = i18 % 128;
                if (i18 % 2 == 0) {
                    cArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr4[i4 - buildsetstopreasonintent.RemoteActionCompatParcelizer];
                    i = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                } else {
                    cArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr4[(i4 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                    i = buildsetstopreasonintent.RemoteActionCompatParcelizer + 1;
                }
                buildsetstopreasonintent.RemoteActionCompatParcelizer = i;
            }
            cArr4 = cArr;
        }
        if (i5 > 0) {
            int i19 = $10 + 17;
            $11 = i19 % 128;
            int i20 = i19 % 2;
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr4);
    }

    static /* synthetic */ LifecycleDelegate zaa(DeferredLifecycleHelper deferredLifecycleHelper) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 83;
        write = i2 % 128;
        int i3 = i2 % 2;
        LifecycleDelegate lifecycleDelegate = deferredLifecycleHelper.zaa;
        if (i3 != 0) {
            return lifecycleDelegate;
        }
        throw null;
    }

    static /* synthetic */ LinkedList zab(DeferredLifecycleHelper deferredLifecycleHelper) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        write = i2 % 128;
        int i3 = i2 % 2;
        LinkedList linkedList = deferredLifecycleHelper.zac;
        if (i3 == 0) {
            int i4 = 93 / 0;
        }
        return linkedList;
    }

    static /* synthetic */ void zac(DeferredLifecycleHelper deferredLifecycleHelper, LifecycleDelegate lifecycleDelegate) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 3;
        write = i2 % 128;
        int i3 = i2 % 2;
        deferredLifecycleHelper.zaa = lifecycleDelegate;
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static /* synthetic */ void zad(DeferredLifecycleHelper deferredLifecycleHelper, Bundle bundle) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer;
        int i3 = i2 + 59;
        write = i3 % 128;
        int i4 = i3 % 2;
        deferredLifecycleHelper.zab = null;
        int i5 = i2 + 47;
        write = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 2 / 0;
        }
    }

    public T getDelegate() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 31;
        int i3 = i2 % 128;
        write = i3;
        int i4 = i2 % 2;
        T t = (T) this.zaa;
        int i5 = i3 + 75;
        IconCompatParcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            return t;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
