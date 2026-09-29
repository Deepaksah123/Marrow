package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
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
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.internal.IMapViewDelegate;
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
import kotlin.DownloadService;
import kotlin.buildSetStopReasonIntent;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public class MapView extends FrameLayout {
    private final zzb zzbg;
    private static final byte[] $$c = {115, TarConstants.LF_DIR, -117, 77};
    private static final int $$f = 92;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {59, 77, -89, -73, -54, 68, 9, 26, -35, TarConstants.LF_BLK, 10, 17, -22, 33, 28, -10, -5, 36, 6, 22, -69, 57, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24, -8, 30, 19, 13, 16, -4, -25, 45, 28, 0, 17, 10, -32, TarConstants.LF_CONTIG, 9, 14, -4, 30, -25, 28, 28, -4, 13, 18, 8, 28, -10, 24};
    private static final int $$e = 84;
    private static final byte[] $$a = {TarConstants.LF_GNUTYPE_LONGNAME, 36, -23, -15, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 100;
    private static int AudioAttributesCompatParcelizer = 0;
    private static int RemoteActionCompatParcelizer = 1;
    private static char[] write = {56422, 15725, 7802, 32621, 22562, 47456, 39533, 64354, 54379, 13602, 5727, 30581, 20607, 45432, 37481, 62305, 64737, 7660, 16109, 24550, 30972, 39393, 47868, 56305, 62656, 5609, 14075, 22496, 28875, 37351, 45804, 54253, 56429, 15714, 7784, 32638, 22627, 47461, 39528, 64290, 54371, 13695, 5666, 30559, 20597, 45439, 37496, 62313, 52321, 11599, 3680, 28515, 18543, 43367, 23182, 48007, 39050, 63899, 56984, 16270, 7311, 32185, 21134, 45962, 36999, 61855, 54914, 14214, 5262};
    private static long IconCompatParcelizer = 6295102357914336524L;

    private static String $$g(byte b, short s, int i) {
        byte[] bArr = $$c;
        int i2 = 4 - (s * 4);
        int i3 = 101 - (b * 2);
        int i4 = i * 4;
        byte[] bArr2 = new byte[1 - i4];
        int i5 = 0 - i4;
        int i6 = -1;
        if (bArr == null) {
            i3 = (-i3) + i5;
            i2++;
            i6 = -1;
        }
        while (true) {
            int i7 = i6 + 1;
            bArr2[i7] = (byte) i3;
            if (i7 == i5) {
                return new String(bArr2, 0);
            }
            i3 = (-bArr[i2]) + i3;
            i2++;
            i6 = i7;
        }
    }

    public MapView(Context context) {
        super(context);
        this.zzbg = new zzb(this, context, null);
        setClickable(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 12
            int r8 = r8 + 65
            int r6 = 80 - r6
            int r7 = r7 * 10
            int r7 = r7 + 34
            byte[] r0 = com.google.android.gms.maps.MapView.$$a
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r7
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r3 = r0[r6]
        L26:
            int r8 = r8 + r3
            int r6 = r6 + 1
            int r8 = r8 + (-1)
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapView.a(int, int, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 * 29
            int r8 = 111 - r8
            int r7 = r7 * 46
            int r7 = r7 + 4
            byte[] r0 = com.google.android.gms.maps.MapView.$$d
            int r6 = r6 * 19
            int r1 = 47 - r6
            byte[] r1 = new byte[r1]
            int r6 = 46 - r6
            r2 = 0
            if (r0 != 0) goto L19
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L29
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L29:
            r3 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L2e:
            int r7 = r7 + r3
            int r7 = r7 + (-11)
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapView.c(byte, byte, short, java.lang.Object[]):void");
    }

    static final class zza implements MapLifecycleDelegate {
        private static int $10 = 0;
        private static int $11 = 1;
        private final ViewGroup parent;
        private final IMapViewDelegate zzbh;
        private View zzbi;
        private static final byte[] $$d = {32, -1, TarConstants.LF_GNUTYPE_SPARSE, -45, -67, TarConstants.LF_CONTIG, -4, 13, -50, 35, -7, -20, 17, -37, TarConstants.LF_LINK, -17, -2, -3, 11, -80, 81, -7, -11, 9, -17, TarConstants.LF_SYMLINK, -19, 3, 4, -48, TarConstants.LF_LINK, -2, -4, -11, -9, 17, -3, -17, 12, -50, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, 17, 6, 0, 3, -17, -38, 32, 15, -13, 4, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11};
        private static final int $$e = 214;
        private static final byte[] $$a = {3, 113, -44, TarConstants.LF_BLK, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
        private static final int $$b = 27;
        private static int AudioAttributesCompatParcelizer = 0;
        private static int read = 1;
        private static char[] write = {44988, 45027, 45030, 45049, 45052, 45036, 45002, 44992, 45024, 45037, 45036, 44999, 45005, 45025, 45025, 45039, 44982, 45042, 45047, 45031, 45027, 44811, 45044, 45026, 45054, 44800, 44808, 44808, 44815, 45047, 45042, 45040, 44986, 45037, 45027, 45025, 45050, 45030, 45036, 44995, 44996, 45051, 45018, 45002, 45036, 45052, 45049, 45030, 45027, 45010, 45021, 45031, 45027, 45037, 44984, 45026, 45036, 45026, 45051, 45030, 45038, 45009, 45009, 45033, 45036, 45050, 45028, 45025, 45027};

        public zza(ViewGroup viewGroup, IMapViewDelegate iMapViewDelegate) {
            this.zzbh = (IMapViewDelegate) Preconditions.checkNotNull(iMapViewDelegate);
            this.parent = (ViewGroup) Preconditions.checkNotNull(viewGroup);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(int r7, byte r8, byte r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = com.google.android.gms.maps.MapView.zza.$$a
                int r7 = r7 * 12
                int r7 = 77 - r7
                int r8 = 80 - r8
                int r9 = r9 * 10
                int r9 = 44 - r9
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L14
                r3 = r8
                r4 = r2
                goto L29
            L14:
                r3 = r2
            L15:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r9) goto L24
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L24:
                r3 = r0[r8]
                r6 = r3
                r3 = r8
                r8 = r6
            L29:
                int r7 = r7 + r8
                int r8 = r3 + 1
                int r7 = r7 + (-1)
                r3 = r4
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapView.zza.a(int, byte, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void c(int r6, int r7, int r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 + 65
                byte[] r0 = com.google.android.gms.maps.MapView.zza.$$d
                int r8 = r8 * 3
                int r1 = 31 - r8
                int r6 = r6 + 4
                byte[] r1 = new byte[r1]
                int r8 = 30 - r8
                r2 = 0
                if (r0 != 0) goto L15
                r7 = r6
                r3 = r8
                r4 = r2
                goto L2c
            L15:
                r3 = r2
            L16:
                int r6 = r6 + 1
                byte r4 = (byte) r7
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L27:
                r3 = r0[r6]
                r5 = r7
                r7 = r6
                r6 = r5
            L2c:
                int r6 = r6 + r3
                int r6 = r6 + 2
                r3 = r4
                r5 = r7
                r7 = r6
                r6 = r5
                goto L16
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.MapView.zza.c(int, int, int, java.lang.Object[]):void");
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            int i = 2 % 2;
            throw new UnsupportedOperationException("onInflate not allowed on MapViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onCreate(Bundle bundle) throws Throwable {
            Object[] objArr;
            char c;
            int i = 2 % 2;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
            if (objRemoteActionCompatParcelizer == null) {
                char c2 = (char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 13183);
                int i2 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1649;
                int i3 = (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 25;
                byte b = $$a[5];
                byte b2 = b;
                Object[] objArr2 = new Object[1];
                a(b2, (byte) (b2 | TarConstants.LF_GNUTYPE_LONGNAME), b, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(c2, i2, i3, -133433128, false, (String) objArr2[0], null);
            }
            if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
                int i4 = AudioAttributesCompatParcelizer + 113;
                read = i4 % 128;
                int i5 = i4 % 2;
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char keyRepeatTimeout = (char) (13183 - (ViewConfiguration.getKeyRepeatTimeout() >> 16));
                    int doubleTapTimeout = 1649 - (ViewConfiguration.getDoubleTapTimeout() >> 16);
                    int offsetAfter = TextUtils.getOffsetAfter("", 0) + 26;
                    byte[] bArr = $$a;
                    byte b3 = bArr[53];
                    byte b4 = b3;
                    byte b5 = (byte) (-bArr[39]);
                    byte b6 = b3;
                    Object[] objArr3 = new Object[1];
                    a(b4, b5, b6, objArr3);
                    objRemoteActionCompatParcelizer2 = startForeground.read(keyRepeatTimeout, doubleTapTimeout, offsetAfter, -1033747278, false, (String) objArr3[0], null);
                }
                objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
                c = 3;
            } else {
                Object[] objArr4 = new Object[1];
                b(new byte[]{1, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1}, new int[]{0, 16, 0, 0}, true, objArr4);
                Class<?> cls = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                b(new byte[]{1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1}, new int[]{16, 16, 20, 0}, true, objArr5);
                int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
                int i6 = read + 107;
                AudioAttributesCompatParcelizer = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 154075589};
                    byte[] bArr2 = $$d;
                    byte b7 = bArr2[1];
                    Object[] objArr7 = new Object[1];
                    c(b7, (byte) (b7 & 46), bArr2[27], objArr7);
                    Class<?> cls2 = Class.forName((String) objArr7[0]);
                    byte b8 = (byte) (-bArr2[11]);
                    byte b9 = bArr2[49];
                    Object[] objArr8 = new Object[1];
                    c(b8, b9, b9, objArr8);
                    objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 13183);
                        int i8 = (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1649;
                        int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 26;
                        byte[] bArr3 = $$a;
                        byte b10 = bArr3[53];
                        Object[] objArr9 = new Object[1];
                        a(b10, (byte) (-bArr3[39]), b10, objArr9);
                        objRemoteActionCompatParcelizer3 = startForeground.read(pressedStateDuration, i8, minimumFlingVelocity, -1033747278, false, (String) objArr9[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                    try {
                        Object[] objArr10 = new Object[1];
                        b(new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, new int[]{32, 22, 0, 0}, false, objArr10);
                        Class<?> cls3 = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        b(new byte[]{1, 1, 1, 1, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 0}, new int[]{54, 15, 0, 0}, false, objArr11);
                        long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            char cResolveOpacity = (char) (13183 - Drawable.resolveOpacity(0, 0));
                            int offsetBefore = TextUtils.getOffsetBefore("", 0) + 1649;
                            int i9 = 26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                            byte b11 = $$a[53];
                            Object[] objArr12 = new Object[1];
                            a(b11, r13[5], b11, objArr12);
                            objRemoteActionCompatParcelizer4 = startForeground.read(cResolveOpacity, offsetBefore, i9, 54351865, false, (String) objArr12[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            char doubleTapTimeout2 = (char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 13183);
                            int iIndexOf = 1649 - TextUtils.indexOf("", "", 0, 0);
                            int mirror = AndroidCharacter.getMirror('0') - 22;
                            byte b12 = $$a[5];
                            byte b13 = b12;
                            Object[] objArr13 = new Object[1];
                            a(b13, (byte) (b13 | TarConstants.LF_GNUTYPE_LONGNAME), b12, objArr13);
                            objRemoteActionCompatParcelizer5 = startForeground.read(doubleTapTimeout2, iIndexOf, mirror, -133433128, false, (String) objArr13[0], null);
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
            int i10 = ((int[]) objArr[c])[0];
            int i11 = ((int[]) objArr[2])[0];
            if (i11 != i10) {
                long j = -1;
                long j2 = ((long) (i10 ^ i11)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
                long j3 = 0;
                long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
                try {
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        objRemoteActionCompatParcelizer6 = startForeground.read((char) (4535 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 6055 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                    ArrayList arrayList = new ArrayList();
                    String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                    int i12 = AudioAttributesCompatParcelizer;
                    int i13 = i12 + 121;
                    read = i13 % 128;
                    int i14 = i13 % 2;
                    int i15 = i12 + 53;
                    read = i15 % 128;
                    int i16 = i15 % 2;
                    try {
                        Object[] objArr14 = {1792693371, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                        Class cls4 = (Class) startForeground.IconCompatParcelizer((char) Color.argb(0, 0, 0, 0), 6029 - TextUtils.lastIndexOf("", '0'), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 24);
                        byte[] bArr4 = $$d;
                        Object[] objArr15 = new Object[1];
                        c(bArr4[25], bArr4[12], bArr4[42], objArr15);
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
            try {
                Bundle bundle2 = new Bundle();
                zzby.zza(bundle, bundle2);
                this.zzbh.onCreate(bundle2);
                zzby.zza(bundle2, bundle);
                this.zzbi = (View) ObjectWrapper.unwrap(this.zzbh.getView());
                this.parent.removeAllViews();
                this.parent.addView(this.zzbi);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            int i = 2 % 2;
            throw new UnsupportedOperationException("onCreateView not allowed on MapViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onStart() {
            int i = 2 % 2;
            int i2 = read + 53;
            AudioAttributesCompatParcelizer = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    this.zzbh.onStart();
                    int i3 = read + 117;
                    AudioAttributesCompatParcelizer = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                }
                this.zzbh.onStart();
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
            int i2 = read + 55;
            AudioAttributesCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            try {
                this.zzbh.onResume();
                int i4 = read + 85;
                AudioAttributesCompatParcelizer = i4 % 128;
                if (i4 % 2 != 0) {
                    int i5 = 74 / 0;
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onPause() {
            int i = 2 % 2;
            int i2 = read + 113;
            AudioAttributesCompatParcelizer = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    this.zzbh.onPause();
                    int i3 = 75 / 0;
                } else {
                    this.zzbh.onPause();
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onStop() {
            int i = 2 % 2;
            int i2 = AudioAttributesCompatParcelizer + 115;
            read = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    this.zzbh.onStop();
                    int i3 = 36 / 0;
                } else {
                    this.zzbh.onStop();
                }
                int i4 = AudioAttributesCompatParcelizer + 71;
                read = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 43 / 0;
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onDestroyView() {
            int i = 2 % 2;
            throw new UnsupportedOperationException("onDestroyView not allowed on MapViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onDestroy() {
            int i = 2 % 2;
            int i2 = read + 61;
            AudioAttributesCompatParcelizer = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    this.zzbh.onDestroy();
                    int i3 = 40 / 0;
                } else {
                    this.zzbh.onDestroy();
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onLowMemory() {
            int i = 2 % 2;
            int i2 = AudioAttributesCompatParcelizer + 21;
            read = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    this.zzbh.onLowMemory();
                    int i3 = 76 / 0;
                } else {
                    this.zzbh.onLowMemory();
                }
                int i4 = read + 107;
                AudioAttributesCompatParcelizer = i4 % 128;
                if (i4 % 2 != 0) {
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
                this.zzbh.onSaveInstanceState(bundle2);
                zzby.zza(bundle2, bundle);
                int i2 = AudioAttributesCompatParcelizer + 17;
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

        @Override // com.google.android.gms.maps.internal.MapLifecycleDelegate
        public final void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
            int i = 2 % 2;
            try {
                this.zzbh.getMapAsync(new zzac(this, onMapReadyCallback));
                int i2 = read + 67;
                AudioAttributesCompatParcelizer = i2 % 128;
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
                this.zzbh.onEnterAmbient(bundle2);
                zzby.zza(bundle2, bundle);
                int i2 = read + 37;
                AudioAttributesCompatParcelizer = i2 % 128;
                if (i2 % 2 != 0) {
                    int i3 = 78 / 0;
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        public final void onExitAmbient() {
            int i = 2 % 2;
            int i2 = read + 1;
            AudioAttributesCompatParcelizer = i2 % 128;
            try {
                if (i2 % 2 != 0) {
                    this.zzbh.onExitAmbient();
                    int i3 = 27 / 0;
                } else {
                    this.zzbh.onExitAmbient();
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        private static void b(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
            int i;
            int i2 = 2;
            int i3 = 2 % 2;
            buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
            int i4 = iArr[0];
            int i5 = iArr[1];
            int i6 = iArr[2];
            int i7 = iArr[3];
            char[] cArr = write;
            if (cArr != null) {
                int length = cArr.length;
                char[] cArr2 = new char[length];
                int i8 = 0;
                while (i8 < length) {
                    int i9 = $11 + 19;
                    $10 = i9 % 128;
                    int i10 = i9 % i2;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getPressedStateDuration() >> 16), 11612 - TextUtils.lastIndexOf("", '0', 0), 20 - (ViewConfiguration.getFadingEdgeLength() >> 16), -1786471333, false, "u", new Class[]{Integer.TYPE});
                        }
                        cArr2[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        i8++;
                        i2 = 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                cArr = cArr2;
            }
            char[] cArr3 = new char[i5];
            System.arraycopy(cArr, i4, cArr3, 0, i5);
            if (bArr != null) {
                int i11 = $10 + 77;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                char[] cArr4 = new char[i5];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                char c = 0;
                while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                    if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                        int i13 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                        Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (KeyEvent.getMaxKeyCode() >> 16), 22958 - MotionEvent.axisFromString(""), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 42, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i13] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    } else {
                        int i14 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                        Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (31589 - KeyEvent.normalizeMetaState(0)), (ViewConfiguration.getLongPressTimeout() >> 16) + 9863, Color.green(0) + 65, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                    }
                    c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                    Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (View.MeasureSpec.getMode(0) + 37822), 9753 - ((byte) KeyEvent.getModifierMetaStateMask()), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
                cArr3 = cArr4;
            }
            if (i7 > 0) {
                int i15 = $10 + 123;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                char[] cArr5 = new char[i5];
                System.arraycopy(cArr3, 0, cArr5, 0, i5);
                int i17 = i5 - i7;
                System.arraycopy(cArr5, 0, cArr3, i17, i7);
                System.arraycopy(cArr5, i7, cArr3, 0, i17);
            }
            if (z) {
                char[] cArr6 = new char[i5];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                int i18 = $10 + 107;
                $11 = i18 % 128;
                int i19 = 2;
                int i20 = i18 % 2;
                while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                    int i21 = $10 + 69;
                    $11 = i21 % 128;
                    if (i21 % i19 == 0) {
                        int i22 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                        int i23 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                        cArr6[i22] = cArr3[0];
                        i = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    } else {
                        cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i5 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                        i = buildsetstopreasonintent.RemoteActionCompatParcelizer + 1;
                    }
                    buildsetstopreasonintent.RemoteActionCompatParcelizer = i;
                    i19 = 2;
                }
                cArr3 = cArr6;
            }
            if (i6 > 0) {
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                    cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                    buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                }
            }
            objArr[0] = new String(cArr3);
        }
    }

    static final class zzb extends DeferredLifecycleHelper<zza> {
        private OnDelegateCreatedListener<zza> zzbd;
        private final List<OnMapReadyCallback> zzbf = new ArrayList();
        private final ViewGroup zzbj;
        private final Context zzbk;
        private final GoogleMapOptions zzbl;

        zzb(ViewGroup viewGroup, Context context, GoogleMapOptions googleMapOptions) {
            this.zzbj = viewGroup;
            this.zzbk = context;
            this.zzbl = googleMapOptions;
        }

        @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
        public final void createDelegate(OnDelegateCreatedListener<zza> onDelegateCreatedListener) {
            this.zzbd = onDelegateCreatedListener;
            if (onDelegateCreatedListener == null || getDelegate() != null) {
                return;
            }
            try {
                MapsInitializer.initialize(this.zzbk);
                IMapViewDelegate iMapViewDelegateZza = zzbz.zza(this.zzbk).zza(ObjectWrapper.wrap(this.zzbk), this.zzbl);
                if (iMapViewDelegateZza != null) {
                    this.zzbd.onDelegateCreated(new zza(this.zzbj, iMapViewDelegateZza));
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

        public final void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
            if (getDelegate() != null) {
                getDelegate().getMapAsync(onMapReadyCallback);
            } else {
                this.zzbf.add(onMapReadyCallback);
            }
        }
    }

    public MapView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzbg = new zzb(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public MapView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzbg = new zzb(this, context, GoogleMapOptions.createFromAttributes(context, attributeSet));
        setClickable(true);
    }

    public MapView(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.zzbg = new zzb(this, context, googleMapOptions);
        setClickable(true);
    }

    private static void b(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        int i4 = $10 + 83;
        $11 = i4 % 128;
        int i5 = i4 % 2;
        while (downloadService.write < i2) {
            int i6 = $10 + 33;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(write[i + i8])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (36621 - (ViewConfiguration.getEdgeSlop() >> 16)), 2341 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 'L' - AndroidCharacter.getMirror('0'), 480654850, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(IconCompatParcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getOffsetBefore("", 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 9700, 26 - View.resolveSize(0, 0), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i8] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 23784 - (ViewConfiguration.getPressedStateDuration() >> 16), 32 - ExpandableListView.getPackedPositionChild(0L), -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
                objRemoteActionCompatParcelizer4 = startForeground.read((char) View.MeasureSpec.getSize(0), 23783 - TextUtils.lastIndexOf("", '0', 0), 33 - (ViewConfiguration.getWindowTouchSlop() >> 8), -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr);
    }

    public final void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char c = (char) (13184 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
            int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 1649;
            int i2 = 25 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
            byte[] bArr = $$a;
            byte b = bArr[0];
            byte b2 = bArr[53];
            Object[] objArr2 = new Object[1];
            a(b, b2, b2, objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(c, maxKeyCode, i2, -133433128, false, (String) objArr2[0], null);
        }
        Object obj = null;
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            int i3 = AudioAttributesCompatParcelizer + 23;
            RemoteActionCompatParcelizer = i3 % 128;
            if (i3 % 2 == 0) {
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char maximumDrawingCacheSize = (char) (13183 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                    int modifierMetaStateMask = 1648 - ((byte) KeyEvent.getModifierMetaStateMask());
                    int longPressTimeout = 26 - (ViewConfiguration.getLongPressTimeout() >> 16);
                    byte[] bArr2 = $$a;
                    byte b3 = (byte) (-bArr2[39]);
                    byte b4 = bArr2[5];
                    Object[] objArr3 = new Object[1];
                    a(b3, b4, b4, objArr3);
                    objRemoteActionCompatParcelizer2 = startForeground.read(maximumDrawingCacheSize, modifierMetaStateMask, longPressTimeout, -1033747278, false, (String) objArr3[0], null);
                }
                obj.hashCode();
                throw null;
            }
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer3 == null) {
                char touchSlop = (char) (13183 - (ViewConfiguration.getTouchSlop() >> 8));
                int i4 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1649;
                int iAxisFromString = 25 - MotionEvent.axisFromString("");
                byte[] bArr3 = $$a;
                byte b5 = (byte) (-bArr3[39]);
                byte b6 = bArr3[5];
                Object[] objArr4 = new Object[1];
                a(b5, b6, b6, objArr4);
                objRemoteActionCompatParcelizer3 = startForeground.read(touchSlop, i4, iAxisFromString, -1033747278, false, (String) objArr4[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            int i5 = AudioAttributesCompatParcelizer + 97;
            RemoteActionCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
        } else {
            Object[] objArr5 = new Object[1];
            b((char) ExpandableListView.getPackedPositionType(0L), Color.green(0), Color.rgb(0, 0, 0) + 16777232, objArr5);
            Class<?> cls = Class.forName((String) objArr5[0]);
            Object[] objArr6 = new Object[1];
            b((char) (Color.rgb(0, 0, 0) + 16785540), View.MeasureSpec.getMode(0) + 16, 15 - TextUtils.lastIndexOf("", '0', 0), objArr6);
            int iIntValue = ((Integer) cls.getMethod((String) objArr6[0], Object.class).invoke(null, this)).intValue();
            int i7 = RemoteActionCompatParcelizer + 43;
            AudioAttributesCompatParcelizer = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object[] objArr7 = {Integer.valueOf(iIntValue), 0, -455108300};
                byte[] bArr4 = $$d;
                byte b7 = bArr4[30];
                byte b8 = b7;
                Object[] objArr8 = new Object[1];
                c(b7, b8, b8, objArr8);
                Class<?> cls2 = Class.forName((String) objArr8[0]);
                byte b9 = (byte) (bArr4[30] + 1);
                byte b10 = b9;
                Object[] objArr9 = new Object[1];
                c(b9, b10, b10, objArr9);
                objArr = (Object[]) cls2.getMethod((String) objArr9[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr7);
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char packedPositionGroup = (char) (13183 - ExpandableListView.getPackedPositionGroup(0L));
                    int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 1649;
                    int packedPositionChild = 25 - ExpandableListView.getPackedPositionChild(0L);
                    byte[] bArr5 = $$a;
                    byte b11 = (byte) (-bArr5[39]);
                    byte b12 = bArr5[5];
                    Object[] objArr10 = new Object[1];
                    a(b11, b12, b12, objArr10);
                    objRemoteActionCompatParcelizer4 = startForeground.read(packedPositionGroup, maximumDrawingCacheSize2, packedPositionChild, -1033747278, false, (String) objArr10[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                try {
                    Object[] objArr11 = new Object[1];
                    b((char) View.MeasureSpec.makeMeasureSpec(0, 0), 32 - ((Process.getThreadPriority(0) + 20) >> 6), 22 - (ViewConfiguration.getTouchSlop() >> 8), objArr11);
                    Class<?> cls3 = Class.forName((String) objArr11[0]);
                    Object[] objArr12 = new Object[1];
                    b((char) (TextUtils.indexOf((CharSequence) "", '0') + 34536), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 53, 14 - ExpandableListView.getPackedPositionChild(0L), objArr12);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr12[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 13183);
                        int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1649;
                        int offsetAfter = TextUtils.getOffsetAfter("", 0) + 26;
                        byte b13 = $$a[5];
                        byte b14 = b13;
                        Object[] objArr13 = new Object[1];
                        a(b13, b14, b14, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(trimmedLength, keyRepeatTimeout, offsetAfter, 54351865, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char c2 = (char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 13182);
                        int iBlue = 1649 - Color.blue(0);
                        int maximumDrawingCacheSize3 = 26 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        byte[] bArr6 = $$a;
                        byte b15 = bArr6[0];
                        byte b16 = bArr6[53];
                        Object[] objArr14 = new Object[1];
                        a(b15, b16, b16, objArr14);
                        objRemoteActionCompatParcelizer6 = startForeground.read(c2, iBlue, maximumDrawingCacheSize3, -133433128, false, (String) objArr14[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf2);
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
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0') + 4536), 6054 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), KeyEvent.keyCodeFromString("") + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, null);
                try {
                    Object[] objArr15 = {-218669208, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getLongPressTimeout() >> 16), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6029, KeyEvent.getDeadChar(0, 0) + 24);
                    byte b17 = (byte) ($$d[30] + 1);
                    byte b18 = b17;
                    Object[] objArr16 = new Object[1];
                    c(b17, b18, b18, objArr16);
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
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.zzbg.onCreate(bundle);
            if (this.zzbg.getDelegate() == null) {
                DeferredLifecycleHelper.showGooglePlayUnavailableMessage(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public final void onResume() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 29;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.zzbg.onResume();
        int i4 = AudioAttributesCompatParcelizer + 3;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void onPause() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 25;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.zzbg.onPause();
        int i4 = AudioAttributesCompatParcelizer + 65;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 123;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.zzbg.onStart();
        int i4 = AudioAttributesCompatParcelizer + 113;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void onStop() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 63;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.zzbg.onStop();
        int i4 = RemoteActionCompatParcelizer + 57;
        AudioAttributesCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onDestroy() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 85;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.zzbg.onDestroy();
        if (i3 != 0) {
            int i4 = 98 / 0;
        }
        int i5 = AudioAttributesCompatParcelizer + 5;
        RemoteActionCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    public final void onLowMemory() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 53;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.zzbg.onLowMemory();
        int i4 = AudioAttributesCompatParcelizer + 107;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 15;
        RemoteActionCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.zzbg.onSaveInstanceState(bundle);
        int i4 = AudioAttributesCompatParcelizer + 99;
        RemoteActionCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void getMapAsync(OnMapReadyCallback onMapReadyCallback) {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 99;
        AudioAttributesCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            Preconditions.checkMainThread("getMapAsync() must be called on the main thread");
            this.zzbg.getMapAsync(onMapReadyCallback);
            int i3 = 87 / 0;
        } else {
            Preconditions.checkMainThread("getMapAsync() must be called on the main thread");
            this.zzbg.getMapAsync(onMapReadyCallback);
        }
        int i4 = AudioAttributesCompatParcelizer + 43;
        RemoteActionCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onEnterAmbient(Bundle bundle) {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 111;
        RemoteActionCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            Preconditions.checkMainThread("onEnterAmbient() must be called on the main thread");
            zzb zzbVar = this.zzbg;
            if (zzbVar.getDelegate() != null) {
                int i3 = AudioAttributesCompatParcelizer + 17;
                RemoteActionCompatParcelizer = i3 % 128;
                int i4 = i3 % 2;
                zza delegate = zzbVar.getDelegate();
                if (i4 != 0) {
                    delegate.onEnterAmbient(bundle);
                    return;
                } else {
                    delegate.onEnterAmbient(bundle);
                    int i5 = 69 / 0;
                    return;
                }
            }
            return;
        }
        Preconditions.checkMainThread("onEnterAmbient() must be called on the main thread");
        this.zzbg.getDelegate();
        throw null;
    }

    public final void onExitAmbient() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer + 89;
        AudioAttributesCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            Preconditions.checkMainThread("onExitAmbient() must be called on the main thread");
            zzb zzbVar = this.zzbg;
            if (zzbVar.getDelegate() != null) {
                int i3 = RemoteActionCompatParcelizer + 31;
                AudioAttributesCompatParcelizer = i3 % 128;
                int i4 = i3 % 2;
                zzbVar.getDelegate().onExitAmbient();
                if (i4 != 0) {
                    throw null;
                }
                return;
            }
            return;
        }
        Preconditions.checkMainThread("onExitAmbient() must be called on the main thread");
        this.zzbg.getDelegate();
        throw null;
    }
}
