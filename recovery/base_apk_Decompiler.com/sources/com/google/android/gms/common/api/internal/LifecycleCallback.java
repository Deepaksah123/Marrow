package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.notifyDownloadRemoved;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public class LifecycleCallback {
    protected final LifecycleFragment mLifecycleFragment;
    private static final byte[] $$c = {0, -75, -45, -77};
    private static final int $$f = 227;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {91, -41, -108, -7, 67, -67, 16, -13, 45, -34, 14, -4, 4, 19, -19, -9, 10, 9, -17, -6, 0, -3, 17, 38, -32, -15, 13, -4, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11};
    private static final int $$h = 31;
    private static final byte[] $$a = {18, -64, -35, -97, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 74;
    private static int read = 0;
    private static int write = 1;
    private static long IconCompatParcelizer = -1376302249433405943L;
    private static int AudioAttributesCompatParcelizer = -136981212;
    private static char RemoteActionCompatParcelizer = 54564;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(byte r5, int r6, int r7) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r7 = r7 * 3
            int r0 = r7 + 1
            byte[] r1 = com.google.android.gms.common.api.internal.LifecycleCallback.$$c
            int r5 = r5 * 2
            int r5 = r5 + 103
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r5
            r5 = r7
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
        L27:
            int r6 = r6 + 1
            int r5 = r5 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.LifecycleCallback.$$i(byte, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.common.api.internal.LifecycleCallback.$$a
            int r6 = r6 * 12
            int r6 = 77 - r6
            int r7 = r7 * 10
            int r1 = 44 - r7
            int r8 = 79 - r8
            byte[] r1 = new byte[r1]
            int r7 = 43 - r7
            r2 = -1
            if (r0 != 0) goto L16
            r3 = r8
            r4 = r2
            goto L30
        L16:
            r3 = r2
        L17:
            int r3 = r3 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r8 = r8 + 1
            if (r3 != r7) goto L29
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            r9[r7] = r6
            return
        L29:
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r8 = r8 + r6
            int r6 = r8 + (-1)
            r8 = r3
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.LifecycleCallback.a(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = com.google.android.gms.common.api.internal.LifecycleCallback.$$g
            int r6 = r6 * 14
            int r6 = 18 - r6
            int r5 = r5 * 29
            int r5 = 111 - r5
            int r7 = r7 * 13
            int r1 = 28 - r7
            byte[] r1 = new byte[r1]
            int r7 = 27 - r7
            r2 = 0
            if (r0 != 0) goto L18
            r4 = r7
            r3 = r2
            goto L2a
        L18:
            r3 = r2
        L19:
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L26
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L26:
            r4 = r0[r6]
            int r3 = r3 + 1
        L2a:
            int r4 = -r4
            int r5 = r5 + r4
            int r5 = r5 + 2
            int r6 = r6 + 1
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.common.api.internal.LifecycleCallback.c(byte, byte, int, java.lang.Object[]):void");
    }

    private static LifecycleFragment getChimeraLifecycleFragmentImpl(LifecycleActivity lifecycleActivity) {
        int i = 2 % 2;
        throw new IllegalStateException("Method not available in SDK.");
    }

    public static LifecycleFragment getFragment(Activity activity) {
        int i = 2 % 2;
        LifecycleFragment fragment = getFragment(new LifecycleActivity(activity));
        int i2 = write + 37;
        read = i2 % 128;
        if (i2 % 2 == 0) {
            return fragment;
        }
        throw null;
    }

    public Activity getActivity() {
        int i = 2 % 2;
        int i2 = write + 111;
        read = i2 % 128;
        int i3 = i2 % 2;
        Activity lifecycleActivity = this.mLifecycleFragment.getLifecycleActivity();
        Preconditions.checkNotNull(lifecycleActivity);
        int i4 = write + 41;
        read = i4 % 128;
        int i5 = i4 % 2;
        return lifecycleActivity;
    }

    public static LifecycleFragment getFragment(ContextWrapper contextWrapper) {
        int i = 2 % 2;
        throw new UnsupportedOperationException();
    }

    protected static LifecycleFragment getFragment(LifecycleActivity lifecycleActivity) {
        int i = 2 % 2;
        if (lifecycleActivity.zzd()) {
            zzd zzdVarZzc = zzd.zzc(lifecycleActivity.zzb());
            int i2 = read + 103;
            write = i2 % 128;
            if (i2 % 2 != 0) {
                return zzdVarZzc;
            }
            throw null;
        }
        if (!lifecycleActivity.zzc()) {
            throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
        }
        zzb zzbVarZzc = zzb.zzc(lifecycleActivity.zza());
        int i3 = write + 91;
        read = i3 % 128;
        int i4 = i3 % 2;
        return zzbVarZzc;
    }

    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        int i2 = write + 45;
        read = i2 % 128;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char cNormalizeMetaState = (char) (13183 - KeyEvent.normalizeMetaState(0));
            int offsetAfter = TextUtils.getOffsetAfter("", 0) + 1649;
            int iLastIndexOf = 25 - TextUtils.lastIndexOf("", '0', 0, 0);
            byte b = $$a[5];
            byte b2 = b;
            Object[] objArr2 = new Object[1];
            a(b, b2, (byte) (b2 | TarConstants.LF_GNUTYPE_LONGNAME), objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(cNormalizeMetaState, offsetAfter, iLastIndexOf, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char offsetBefore = (char) (13183 - TextUtils.getOffsetBefore("", 0));
                int deadChar = KeyEvent.getDeadChar(0, 0) + 1649;
                int trimmedLength = 26 - TextUtils.getTrimmedLength("");
                byte b3 = $$a[17];
                Object[] objArr3 = new Object[1];
                a(b3, b3, r1[39], objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(offsetBefore, deadChar, trimmedLength, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            c = 3;
        } else {
            Object[] objArr4 = new Object[1];
            b(TextUtils.lastIndexOf("", '0', 0) + 1, new char[]{45869, 37158, 33376, 9111}, new char[]{28642, 65370, 19394, 48348, 53303, 28448, 37101, 65080, 22930, 32478, 16848, 7052, 27412, 15155, 29610, 5615}, (char) (View.resolveSizeAndState(0, 0, 0) + 9011), new char[]{38646, 29553, 13085, 15651}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(ViewConfiguration.getMinimumFlingVelocity() >> 16, new char[]{45869, 37158, 33376, 9111}, new char[]{6648, 4422, 56593, 53346, 53036, 52662, 5802, 5387, 5884, 5321, 8383, 32486, 56793, 35276, 41791, 53780}, (char) (Color.argb(0, 0, 0, 0) + 20901), new char[]{37050, 52616, 42294, 49233}, objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i4 = read + 115;
            write = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -1975873192};
                byte[] bArr = $$g;
                byte b4 = bArr[20];
                byte b5 = (byte) (-bArr[32]);
                Object[] objArr7 = new Object[1];
                c(b4, b5, b5, objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                byte b6 = (byte) (-bArr[32]);
                byte b7 = bArr[20];
                Object[] objArr8 = new Object[1];
                c(b6, b7, b7, objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13183);
                    int jumpTapTimeout = 1649 - (ViewConfiguration.getJumpTapTimeout() >> 16);
                    int absoluteGravity = 26 - Gravity.getAbsoluteGravity(0, 0);
                    byte b8 = $$a[17];
                    Object[] objArr9 = new Object[1];
                    a(b8, b8, r3[39], objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(maximumDrawingCacheSize, jumpTapTimeout, absoluteGravity, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b(View.MeasureSpec.getMode(0), new char[]{45869, 37158, 33376, 9111}, new char[]{44736, 35729, 16636, 52853, 55212, 56405, 23535, 18065, 63452, 34115, 2187, 40178, 12455, 27663, 23089, 59713, 55848, 37753, 13807, 41365, 52020, 39590}, (char) ((-16777216) - Color.rgb(0, 0, 0)), new char[]{32296, 26540, 50037, 35206}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 481802453, new char[]{45869, 37158, 33376, 9111}, new char[]{25276, 25708, 16624, 29116, 16884, 62592, 36751, 16094, 13145, 2973, 62040, 27053, 47468, 39630, 46757}, (char) (4637 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), new char[]{54458, 47032, 7196, 47890}, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char doubleTapTimeout = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 13183);
                        int iMyTid = 1649 - (Process.myTid() >> 22);
                        int doubleTapTimeout2 = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 26;
                        byte b9 = $$a[17];
                        Object[] objArr12 = new Object[1];
                        a(b9, b9, r10[5], objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(doubleTapTimeout, iMyTid, doubleTapTimeout2, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char maximumFlingVelocity = (char) ((ViewConfiguration.getMaximumFlingVelocity() >> 16) + 13183);
                        int packedPositionGroup = 1649 - ExpandableListView.getPackedPositionGroup(0L);
                        int size = View.MeasureSpec.getSize(0) + 26;
                        byte b10 = $$a[5];
                        byte b11 = b10;
                        Object[] objArr13 = new Object[1];
                        a(b10, b11, (byte) (b11 | TarConstants.LF_GNUTYPE_LONGNAME), objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(maximumFlingVelocity, packedPositionGroup, size, -133433128, false, (String) objArr13[0], null);
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
        int i6 = ((int[]) objArr[c])[0];
        int i7 = ((int[]) objArr[2])[0];
        if (i7 != i6) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i6 ^ i7)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (4535 - TextUtils.indexOf("", "", 0)), View.resolveSizeAndState(0, 0, 0) + 6054, Drawable.resolveOpacity(0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i8 = read + 37;
                write = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr14 = {2061657151, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) View.MeasureSpec.makeMeasureSpec(0, 0), Gravity.getAbsoluteGravity(0, 0) + 6030, 24 - ExpandableListView.getPackedPositionGroup(0L));
                    byte[] bArr2 = $$g;
                    byte b12 = (byte) (-bArr2[32]);
                    byte b13 = bArr2[20];
                    Object[] objArr15 = new Object[1];
                    c(b12, b13, b13, objArr15);
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
        int i10 = read + 99;
        write = i10 % 128;
        int i11 = i10 % 2;
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
        int i4 = $10 + 89;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i6 = $11 + 23;
            $10 = i6 % 128;
            int i7 = i6 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) Color.argb(0, 0, 0, 0), 22748 - Color.red(0), 36 - TextUtils.indexOf("", "", 0, 0), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char c2 = (char) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 31369);
                    int iArgb = Color.argb(0, 0, 0, 0) + 2721;
                    int iIndexOf = TextUtils.indexOf((CharSequence) "", '0') + 39;
                    byte b = $$c[0];
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read(c2, iArgb, iIndexOf, 1895162189, false, $$i(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getPressedStateDuration() >> 16), TextUtils.indexOf("", "", 0, 0) + 15713, 64 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (KeyEvent.keyCodeFromString("") + 40976), 6122 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 28 - MotionEvent.axisFromString(""), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (IconCompatParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) AudioAttributesCompatParcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) RemoteActionCompatParcelizer) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                i2 = 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        String str = new String(cArr6);
        int i8 = $11 + 17;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    public LifecycleCallback(LifecycleFragment lifecycleFragment) {
        this.mLifecycleFragment = lifecycleFragment;
    }

    public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int i = 2 % 2;
        int i2 = write + 123;
        read = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        int i3 = 2 % 2;
        int i4 = read + 39;
        write = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onDestroy() {
        int i = 2 % 2;
        int i2 = write + 117;
        read = i2 % 128;
        int i3 = i2 % 2;
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = read + 85;
        write = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = read + 109;
        write = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = read + 115;
        write = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
    }

    public void onStop() {
        int i = 2 % 2;
        int i2 = write + 117;
        read = i2 % 128;
        int i3 = i2 % 2;
    }
}
