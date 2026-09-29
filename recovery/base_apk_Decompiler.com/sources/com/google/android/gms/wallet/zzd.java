package com.google.android.gms.wallet;

import android.app.Fragment;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.tasks.Task;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public final class zzd extends Fragment {
    boolean zza;
    private int zzb;
    private zzc<?> zzc;
    private static final byte[] $$c = {80, -72, 126, -24};
    private static final int $$f = 210;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {112, -82, -21, -22, -54, 68, 9, 26, -35, TarConstants.LF_BLK, 10, 17, -22, 33, 28, -10, -5, 36, 6, 22, -69, 57, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -8, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24};
    private static final int $$e = 27;
    private static final byte[] $$a = {11, -82, -98, -28, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 113;
    private static int write = 0;
    private static int IconCompatParcelizer = 1;
    private static long AudioAttributesCompatParcelizer = 9061082889723777040L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r6, int r7, short r8) {
        /*
            byte[] r0 = com.google.android.gms.wallet.zzd.$$c
            int r7 = r7 * 4
            int r1 = 1 - r7
            int r8 = r8 * 4
            int r8 = 3 - r8
            int r6 = r6 * 2
            int r6 = r6 + 119
            byte[] r1 = new byte[r1]
            r2 = 0
            int r7 = 0 - r7
            r3 = -1
            if (r0 != 0) goto L19
            r4 = r7
            r6 = r8
            goto L2d
        L19:
            r5 = r8
            r8 = r6
            r6 = r5
        L1c:
            int r3 = r3 + 1
            byte r4 = (byte) r8
            int r6 = r6 + 1
            r1[r3] = r4
            if (r3 != r7) goto L2b
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L2b:
            r4 = r0[r6]
        L2d:
            int r8 = r8 + r4
            goto L1c
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.zzd.$$g(byte, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = r6 * 10
            int r0 = 44 - r6
            byte[] r1 = com.google.android.gms.wallet.zzd.$$a
            int r7 = r7 * 12
            int r7 = 77 - r7
            int r5 = 79 - r5
            byte[] r0 = new byte[r0]
            int r6 = 43 - r6
            r2 = -1
            if (r1 != 0) goto L16
            r4 = r6
            r3 = r2
            goto L2b
        L16:
            r3 = r2
        L17:
            int r3 = r3 + 1
            int r5 = r5 + 1
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L29
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r0, r6)
            r8[r6] = r5
            return
        L29:
            r4 = r1[r5]
        L2b:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + r2
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.zzd.a(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 46
            int r8 = r8 + 4
            int r6 = r6 * 29
            int r6 = r6 + 82
            int r7 = r7 * 19
            int r0 = 47 - r7
            byte[] r1 = com.google.android.gms.wallet.zzd.$$d
            byte[] r0 = new byte[r0]
            int r7 = 46 - r7
            r2 = 0
            if (r1 != 0) goto L19
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2f
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2f:
            int r6 = r6 + r8
            int r8 = r3 + 1
            int r6 = r6 + (-11)
            r3 = r4
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.zzd.c(int, byte, int, java.lang.Object[]):void");
    }

    static /* synthetic */ void zza(zzd zzdVar, Task task) {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 57;
        write = i2 % 128;
        int i3 = i2 % 2;
        zzdVar.zzb(task);
        if (i3 != 0) {
            throw null;
        }
    }

    private final void zzc() {
        int i = 2 % 2;
        int i2 = write + 63;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        zzc<?> zzcVar = this.zzc;
        if (zzcVar != null) {
            zzcVar.zzb(this);
        }
        int i4 = IconCompatParcelizer + 25;
        write = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0042, code lost:
    
        if (r5 != null) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0044, code lost:
    
        com.google.android.gms.wallet.AutoResolveHelper.zzf(r1, r4.zzb, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004a, code lost:
    
        com.google.android.gms.wallet.AutoResolveHelper.zze(r1, r4.zzb, 0, new android.content.Intent());
        r4 = com.google.android.gms.wallet.zzd.write + 83;
        com.google.android.gms.wallet.zzd.IconCompatParcelizer = r4 % 128;
        r4 = r4 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x002a, code lost:
    
        if (r5 != null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void zzb(com.google.android.gms.tasks.Task<? extends com.google.android.gms.wallet.AutoResolvableResult> r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            boolean r1 = r4.zza
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L5d
            int r1 = com.google.android.gms.wallet.zzd.write
            int r1 = r1 + 31
            int r3 = r1 % 128
            com.google.android.gms.wallet.zzd.IconCompatParcelizer = r3
            int r1 = r1 % r0
            r3 = 0
            if (r1 != 0) goto L2d
            r4.zza = r3
            android.app.Activity r1 = r4.getActivity()
            android.app.FragmentManager r2 = r1.getFragmentManager()
            android.app.FragmentTransaction r2 = r2.beginTransaction()
            android.app.FragmentTransaction r2 = r2.remove(r4)
            r2.commit()
            if (r5 == 0) goto L4a
            goto L44
        L2d:
            r4.zza = r2
            android.app.Activity r1 = r4.getActivity()
            android.app.FragmentManager r2 = r1.getFragmentManager()
            android.app.FragmentTransaction r2 = r2.beginTransaction()
            android.app.FragmentTransaction r2 = r2.remove(r4)
            r2.commit()
            if (r5 == 0) goto L4a
        L44:
            int r4 = r4.zzb
            com.google.android.gms.wallet.AutoResolveHelper.zzb(r1, r4, r5)
            return
        L4a:
            int r4 = r4.zzb
            android.content.Intent r5 = new android.content.Intent
            r5.<init>()
            com.google.android.gms.wallet.AutoResolveHelper.zzc(r1, r4, r3, r5)
            int r4 = com.google.android.gms.wallet.zzd.write
            int r4 = r4 + 83
            int r5 = r4 % 128
            com.google.android.gms.wallet.zzd.IconCompatParcelizer = r5
            int r4 = r4 % r0
        L5d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.zzd.zzb(com.google.android.gms.tasks.Task):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x01c4  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x01c5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(int r25, char[] r26, java.lang.Object[] r27) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.wallet.zzd.b(int, char[], java.lang.Object[]):void");
    }

    @Override // android.app.Fragment
    public final void onPause() {
        int i = 2 % 2;
        int i2 = write + 73;
        IconCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            super.onPause();
            zzc();
        } else {
            super.onPause();
            zzc();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // android.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = write + 99;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("delivered", this.zza);
        zzc();
        int i4 = IconCompatParcelizer + 5;
        write = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Fragment
    public final void onResume() {
        int i = 2 % 2;
        super.onResume();
        zzc<?> zzcVar = this.zzc;
        if (zzcVar != null) {
            zzcVar.zzc(this);
            return;
        }
        if (Log.isLoggable("AutoResolveHelper", 5)) {
            int i2 = write + 115;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            Log.w("AutoResolveHelper", "Sending canceled result for garbage collected task!");
            int i4 = write + 65;
            IconCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
        zzb(null);
        int i6 = IconCompatParcelizer + 77;
        write = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    @Override // android.app.Fragment
    public final void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char c2 = (char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 13182);
            int i2 = 1650 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
            int scrollBarFadeDuration = 26 - (ViewConfiguration.getScrollBarFadeDuration() >> 16);
            byte b = $$a[5];
            Object[] objArr2 = new Object[1];
            a((byte) 76, b, b, objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(c2, i2, scrollBarFadeDuration, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char c3 = (char) (13184 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                int i3 = 1650 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                int offsetAfter = TextUtils.getOffsetAfter("", 0) + 26;
                byte[] bArr = $$a;
                byte b2 = bArr[39];
                byte b3 = bArr[17];
                Object[] objArr3 = new Object[1];
                a(b2, b3, b3, objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(c3, i3, offsetAfter, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            c = 3;
        } else {
            Object[] objArr4 = new Object[1];
            b((ViewConfiguration.getPressedStateDuration() >> 16) + 58477, new char[]{33713, 26583, 19319, 12029, 4673, 62870, 55604, 48462, 41172, 33824, 28618, 21261, 14004, 6694, 65096, 57813}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(23143 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{33714, 55768, 14192, 35968, 59955, 18353, 40389, 64371, 20651, 44581, 2990, 25054, 48972, 5263, 29213, 53175}, objArr5);
            try {
                Object[] objArr6 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue()), 0, 1272954373};
                byte b4 = (byte) ($$e & 5);
                byte[] bArr2 = $$d;
                byte b5 = bArr2[30];
                Object[] objArr7 = new Object[1];
                c(b4, b5, b5, objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                byte b6 = bArr2[30];
                byte b7 = (byte) (b6 + 1);
                Object[] objArr8 = new Object[1];
                c(b6, b7, b7, objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cMakeMeasureSpec = (char) (13183 - View.MeasureSpec.makeMeasureSpec(0, 0));
                    int iMyTid = (Process.myTid() >> 22) + 1649;
                    int offsetAfter2 = 26 - TextUtils.getOffsetAfter("", 0);
                    byte[] bArr3 = $$a;
                    byte b8 = bArr3[39];
                    byte b9 = bArr3[17];
                    Object[] objArr9 = new Object[1];
                    a(b8, b9, b9, objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(cMakeMeasureSpec, iMyTid, offsetAfter2, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b(11677 - View.resolveSizeAndState(0, 0, 0), new char[]{33722, 44584, 55429, 2942, 13760, 26531, 37393, 48318, 61276, 6445, 19415, 30263, 41214, 54097, 64825, 12173, 23142, 34037, 46781, 57619, 5116, 15953}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b(TextUtils.getCapsMode("", 0, 0) + 20897, new char[]{33726, 53782, 8440, 30536, 50476, 7067, 27257, 47342, 3766, 23827, 46077, 580, 20542, 42651, 62832}, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char threadPriority = (char) (13183 - ((Process.getThreadPriority(0) + 20) >> 6));
                        int iLastIndexOf = TextUtils.lastIndexOf("", '0') + 1650;
                        int gidForName = 25 - Process.getGidForName("");
                        byte[] bArr4 = $$a;
                        byte b10 = bArr4[5];
                        byte b11 = bArr4[17];
                        Object[] objArr12 = new Object[1];
                        a(b10, b11, b11, objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(threadPriority, iLastIndexOf, gidForName, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char packedPositionChild = (char) (13182 - ExpandableListView.getPackedPositionChild(0L));
                        int iKeyCodeFromString = 1649 - KeyEvent.keyCodeFromString("");
                        int iKeyCodeFromString2 = 26 - KeyEvent.keyCodeFromString("");
                        byte b12 = $$a[5];
                        Object[] objArr13 = new Object[1];
                        a((byte) 76, b12, b12, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(packedPositionChild, iKeyCodeFromString, iKeyCodeFromString2, -133433128, false, (String) objArr13[0], null);
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
        int i4 = ((int[]) objArr[c])[0];
        int i5 = ((int[]) objArr[2])[0];
        if (i5 == i4) {
            int i6 = IconCompatParcelizer + 13;
            write = i6 % 128;
            int i7 = i6 % 2;
        } else {
            long j = -1;
            long j2 = ((long) (i4 ^ i5)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (((Process.getThreadPriority(0) + 20) >> 6) + 4535), 6054 - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i8 = IconCompatParcelizer + 55;
                write = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr14 = {651558905, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) TextUtils.indexOf("", ""), 6029 - Process.getGidForName(""), 24 - (ViewConfiguration.getKeyRepeatDelay() >> 16));
                    byte b13 = $$d[30];
                    byte b14 = (byte) (b13 + 1);
                    Object[] objArr15 = new Object[1];
                    c(b13, b14, b14, objArr15);
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
        this.zzb = getArguments().getInt("requestCode");
        if (AutoResolveHelper.zza != getArguments().getLong("initializationElapsedRealtime")) {
            this.zzc = null;
        } else {
            this.zzc = zzc.zzb.get(getArguments().getInt("resolveCallId"));
            int i10 = IconCompatParcelizer + 97;
            write = i10 % 128;
            int i11 = i10 % 2;
        }
        this.zza = bundle != null && bundle.getBoolean("delivered");
    }
}
