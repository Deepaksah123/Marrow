package com.google.android.gms.maps;

import android.app.Activity;
import android.content.Context;
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
import android.widget.FrameLayout;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.dynamic.DeferredLifecycleHelper;
import com.google.android.gms.dynamic.ObjectWrapper;
import com.google.android.gms.dynamic.OnDelegateCreatedListener;
import com.google.android.gms.maps.internal.IStreetViewPanoramaViewDelegate;
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
import kotlin.buildResumeDownloadsIntent;
import kotlin.notifyDownloadChanged;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
public class StreetViewPanoramaView extends FrameLayout {
    private final zzb zzcd;
    private static final byte[] $$c = {32, -59, 22, 74};
    private static final int $$f = 176;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {TarConstants.LF_PAX_EXTENDED_HEADER_UC, 13, 21, 98, 56, -33, -56, 0, -9, 16, -27, -11, -15, -1, -18, -15, 38, -50, 2, -24, -16, 0, -13, 2, -15, -8, 26, -35, -29, 45, -39, -11, -14, -6, 43, -4, 0, -20, 6, -28, -17, -11, -14, 6, 27, -43, -26, 2, -15, -8, 34, -53, -7, -12, 6, -28, 27, -26, -26, 6, -11, -16, -6, -26, 12, -22};
    private static final int $$e = 31;
    private static final byte[] $$a = {3, -109, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -57, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 191;
    private static int AudioAttributesCompatParcelizer = 0;
    private static int read = 1;
    private static long RemoteActionCompatParcelizer = 1362196570302272231L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r6, int r7, byte r8) {
        /*
            int r8 = r8 * 2
            int r8 = r8 + 1
            int r6 = r6 * 3
            int r6 = r6 + 4
            byte[] r0 = com.google.android.gms.maps.StreetViewPanoramaView.$$c
            int r7 = r7 * 2
            int r7 = r7 + 119
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            r5 = r7
            r7 = r6
            r6 = r5
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L28:
            r4 = r0[r7]
            r5 = r7
            r7 = r6
            r6 = r5
        L2d:
            int r6 = r6 + 1
            int r7 = r7 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.StreetViewPanoramaView.$$g(int, int, byte):java.lang.String");
    }

    public StreetViewPanoramaView(Context context) {
        super(context);
        this.zzcd = new zzb(this, context, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0030). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = com.google.android.gms.maps.StreetViewPanoramaView.$$a
            int r8 = r8 * 12
            int r8 = r8 + 65
            int r7 = r7 * 10
            int r1 = 44 - r7
            int r6 = r6 + 4
            byte[] r1 = new byte[r1]
            int r7 = 43 - r7
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r6
            goto L30
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L30:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.StreetViewPanoramaView.a(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, byte r7, int r8, java.lang.Object[] r9) {
        /*
            int r0 = 32 - r6
            int r8 = r8 + 82
            byte[] r1 = com.google.android.gms.maps.StreetViewPanoramaView.$$d
            int r7 = r7 + 4
            byte[] r0 = new byte[r0]
            int r6 = 31 - r6
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r3
            r3 = r5
        L2b:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-9)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.StreetViewPanoramaView.c(short, byte, int, java.lang.Object[]):void");
    }

    static final class zza implements StreetViewLifecycleDelegate {
        private static short[] AudioAttributesCompatParcelizer;
        private final ViewGroup parent;
        private final IStreetViewPanoramaViewDelegate zzce;
        private View zzcf;
        private static final byte[] $$c = {62, -102, -38, -78};
        private static final int $$f = 92;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {TarConstants.LF_SYMLINK, -51, -30, -2, 61, -61, -2, -19, 47, -39, -10, -15, -2, -5, 11, -3, 11, -31, -7, -5, -2, 9, 0, -16, 35, -45, -7, 1, 8, -23, -23, -12, -6, -9, 11, 32, -38, -21, 7, -10, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17};
        private static final int $$e = 195;
        private static final byte[] $$a = {45, -29, -71, -73, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
        private static final int $$b = 123;
        private static int AudioAttributesImplApi26Parcelizer = 0;
        private static int AudioAttributesImplBaseParcelizer = 1;
        private static int RemoteActionCompatParcelizer = -2103195727;
        private static int IconCompatParcelizer = -819363090;
        private static int write = -845693020;
        private static byte[] read = {0, 57, -96, TarConstants.LF_NORMAL, -105, -45, -44, -14, -88, 60, -92, -21, -4, -122, -60, -94, 0, 92, -32, -89, -14, -32, 73, -76, -122, 80, 66, -32, 93, 68, 92, -46, 10, -105, TarConstants.LF_GNUTYPE_SPARSE, -94, -120, 117, -105, 80, -96, 89, -123, -124, 26, -93, -32, 105, 90, 89, 92, -83, 85, -84, 1, 71, -61, 82, TarConstants.LF_CONTIG, TarConstants.LF_BLK, 91, 60, 105, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 93, -52, -56, 82, -64};

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$g(short r6, int r7, short r8) {
            /*
                int r8 = r8 * 4
                int r8 = 112 - r8
                int r7 = r7 + 4
                byte[] r0 = com.google.android.gms.maps.StreetViewPanoramaView.zza.$$c
                int r6 = r6 * 2
                int r1 = 1 - r6
                byte[] r1 = new byte[r1]
                r2 = 0
                int r6 = 0 - r6
                if (r0 != 0) goto L17
                r3 = r6
                r8 = r7
                r4 = r2
                goto L2d
            L17:
                r3 = r2
            L18:
                byte r4 = (byte) r8
                int r7 = r7 + 1
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r6) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L27:
                r3 = r0[r7]
                r5 = r8
                r8 = r7
                r7 = r3
                r3 = r5
            L2d:
                int r7 = r7 + r3
                r3 = r4
                r5 = r8
                r8 = r7
                r7 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.StreetViewPanoramaView.zza.$$g(short, int, short):java.lang.String");
        }

        public zza(ViewGroup viewGroup, IStreetViewPanoramaViewDelegate iStreetViewPanoramaViewDelegate) {
            this.zzce = (IStreetViewPanoramaViewDelegate) Preconditions.checkNotNull(iStreetViewPanoramaViewDelegate);
            this.parent = (ViewGroup) Preconditions.checkNotNull(viewGroup);
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002e). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(byte r6, int r7, short r8, java.lang.Object[] r9) {
            /*
                byte[] r0 = com.google.android.gms.maps.StreetViewPanoramaView.zza.$$a
                int r7 = r7 + 4
                int r8 = r8 * 10
                int r1 = 44 - r8
                int r6 = r6 * 12
                int r6 = r6 + 65
                byte[] r1 = new byte[r1]
                int r8 = 43 - r8
                r2 = 0
                if (r0 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L2e
            L16:
                r3 = r2
                r5 = r7
                r7 = r6
                r6 = r5
            L1a:
                byte r4 = (byte) r7
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                r9[r2] = r6
                return
            L29:
                r3 = r0[r6]
                r5 = r3
                r3 = r6
                r6 = r5
            L2e:
                int r6 = -r6
                int r7 = r7 + r6
                int r6 = r3 + 1
                int r7 = r7 + (-1)
                r3 = r4
                goto L1a
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.StreetViewPanoramaView.zza.a(byte, int, short, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0029 -> B:11:0x002f). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void c(byte r6, byte r7, short r8, java.lang.Object[] r9) {
            /*
                int r7 = r7 * 26
                int r7 = r7 + 4
                int r0 = 28 - r8
                byte[] r1 = com.google.android.gms.maps.StreetViewPanoramaView.zza.$$d
                int r6 = r6 * 29
                int r6 = r6 + 82
                byte[] r0 = new byte[r0]
                int r8 = 27 - r8
                r2 = 0
                if (r1 != 0) goto L16
                r3 = r7
                r4 = r2
                goto L2f
            L16:
                r3 = r2
            L17:
                r5 = r7
                r7 = r6
                r6 = r5
                byte r4 = (byte) r7
                r0[r3] = r4
                int r4 = r3 + 1
                if (r3 != r8) goto L29
                java.lang.String r6 = new java.lang.String
                r6.<init>(r0, r2)
                r9[r2] = r6
                return
            L29:
                r3 = r1[r6]
                r5 = r7
                r7 = r6
                r6 = r3
                r3 = r5
            L2f:
                int r7 = r7 + 1
                int r6 = -r6
                int r3 = r3 + r6
                int r6 = r3 + (-4)
                r3 = r4
                goto L17
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.maps.StreetViewPanoramaView.zza.c(byte, byte, short, java.lang.Object[]):void");
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onInflate(Activity activity, Bundle bundle, Bundle bundle2) {
            int i = 2 % 2;
            throw new UnsupportedOperationException("onInflate not allowed on StreetViewPanoramaViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onCreate(Bundle bundle) throws Throwable {
            Object[] objArr;
            char c;
            int i = 2 % 2;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
            if (objRemoteActionCompatParcelizer == null) {
                char absoluteGravity = (char) (13183 - Gravity.getAbsoluteGravity(0, 0));
                int iAxisFromString = 1648 - MotionEvent.axisFromString("");
                int i2 = (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26;
                byte[] bArr = $$a;
                byte b = bArr[17];
                byte b2 = bArr[5];
                Object[] objArr2 = new Object[1];
                a(b, b2, b2, objArr2);
                objRemoteActionCompatParcelizer = startForeground.read(absoluteGravity, iAxisFromString, i2, -133433128, false, (String) objArr2[0], null);
            }
            if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
                int i3 = AudioAttributesImplApi26Parcelizer + 55;
                AudioAttributesImplBaseParcelizer = i3 % 128;
                int i4 = i3 % 2;
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char bitsPerPixel = (char) (ImageFormat.getBitsPerPixel(0) + 13184);
                    int i5 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 1648;
                    int iIndexOf = TextUtils.indexOf("", "", 0) + 26;
                    byte[] bArr2 = $$a;
                    Object[] objArr3 = new Object[1];
                    a(bArr2[5], bArr2[27], bArr2[17], objArr3);
                    objRemoteActionCompatParcelizer2 = startForeground.read(bitsPerPixel, i5, iIndexOf, -1033747278, false, (String) objArr3[0], null);
                }
                objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
                int i6 = AudioAttributesImplApi26Parcelizer + 33;
                AudioAttributesImplBaseParcelizer = i6 % 128;
                int i7 = i6 % 2;
                c = 3;
            } else {
                Object[] objArr4 = new Object[1];
                b((byte) (52 - (ViewConfiguration.getLongPressTimeout() >> 16)), (-46021801) - (ViewConfiguration.getPressedStateDuration() >> 16), (-1300907270) - KeyEvent.normalizeMetaState(0), (short) ((ViewConfiguration.getWindowTouchSlop() >> 8) - 82), (-90) - TextUtils.indexOf("", "", 0, 0), objArr4);
                Class<?> cls = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                b((byte) (68 - TextUtils.lastIndexOf("", '0', 0)), (-46021802) - (ViewConfiguration.getTapTimeout() >> 16), (ViewConfiguration.getDoubleTapTimeout() >> 16) - 1300907254, (short) (View.resolveSize(0, 0) + 89), View.MeasureSpec.getMode(0) - 90, objArr5);
                int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
                int i8 = AudioAttributesImplBaseParcelizer + 59;
                AudioAttributesImplApi26Parcelizer = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -1185382907};
                    byte[] bArr3 = $$d;
                    byte b3 = bArr3[27];
                    byte b4 = b3;
                    Object[] objArr7 = new Object[1];
                    c(b3, bArr3[22], b4, objArr7);
                    Class<?> cls2 = Class.forName((String) objArr7[0]);
                    byte b5 = bArr3[22];
                    Object[] objArr8 = new Object[1];
                    c(b5, bArr3[27], b5, objArr8);
                    objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        char trimmedLength = (char) (TextUtils.getTrimmedLength("") + 13183);
                        int i10 = 1650 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1));
                        int i11 = 27 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        byte[] bArr4 = $$a;
                        Object[] objArr9 = new Object[1];
                        a(bArr4[5], bArr4[27], bArr4[17], objArr9);
                        objRemoteActionCompatParcelizer3 = startForeground.read(trimmedLength, i10, i11, -1033747278, false, (String) objArr9[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                    try {
                        Object[] objArr10 = new Object[1];
                        b((byte) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23), (ViewConfiguration.getWindowTouchSlop() >> 8) - 46021810, (-1300907239) - TextUtils.indexOf((CharSequence) "", '0', 0), (short) ((-1) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), KeyEvent.keyCodeFromString("") - 90, objArr10);
                        Class<?> cls3 = Class.forName((String) objArr10[0]);
                        Object[] objArr11 = new Object[1];
                        b((byte) (69 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), (KeyEvent.getMaxKeyCode() >> 16) - 46021806, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1300907216, (short) ((-52) - (ViewConfiguration.getPressedStateDuration() >> 16)), (-90) - (ViewConfiguration.getEdgeSlop() >> 16), objArr11);
                        long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue);
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            char windowTouchSlop = (char) (13183 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                            int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 1649;
                            int iIndexOf2 = TextUtils.indexOf("", "") + 26;
                            byte b6 = $$a[5];
                            Object[] objArr12 = new Object[1];
                            a(b6, (byte) (b6 | TarConstants.LF_GNUTYPE_LONGNAME), r15[17], objArr12);
                            objRemoteActionCompatParcelizer4 = startForeground.read(windowTouchSlop, scrollDefaultDelay, iIndexOf2, 54351865, false, (String) objArr12[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                        Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            char cRed = (char) (13183 - Color.red(0));
                            int packedPositionGroup = 1649 - ExpandableListView.getPackedPositionGroup(0L);
                            int keyRepeatDelay = (ViewConfiguration.getKeyRepeatDelay() >> 16) + 26;
                            byte[] bArr5 = $$a;
                            byte b7 = bArr5[17];
                            byte b8 = bArr5[5];
                            Object[] objArr13 = new Object[1];
                            a(b7, b8, b8, objArr13);
                            objRemoteActionCompatParcelizer5 = startForeground.read(cRed, packedPositionGroup, keyRepeatDelay, -133433128, false, (String) objArr13[0], null);
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
            int i12 = ((int[]) objArr[c])[0];
            int i13 = ((int[]) objArr[2])[0];
            if (i13 != i12) {
                long j = -1;
                long j2 = 0;
                long j3 = (((long) (i12 ^ i13)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
                try {
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        objRemoteActionCompatParcelizer6 = startForeground.read((char) (View.resolveSize(0, 0) + 4535), 6055 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                    try {
                        Object[] objArr14 = {2062840550, Long.valueOf(j3), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                        Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (MotionEvent.axisFromString("") + 1), Color.red(0) + 6030, 24 - Color.blue(0));
                        byte b9 = $$d[22];
                        Object[] objArr15 = new Object[1];
                        c(b9, r4[27], b9, objArr15);
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
                this.zzce.onCreate(bundle2);
                zzby.zza(bundle2, bundle);
                this.zzcf = (View) ObjectWrapper.unwrap(this.zzce.getView());
                this.parent.removeAllViews();
                this.parent.addView(this.zzcf);
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
            int i = 2 % 2;
            throw new UnsupportedOperationException("onCreateView not allowed on StreetViewPanoramaViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onStart() {
            int i = 2 % 2;
            int i2 = AudioAttributesImplBaseParcelizer + 9;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            int i3 = i2 % 2;
            try {
                this.zzce.onStart();
                int i4 = AudioAttributesImplApi26Parcelizer + 7;
                AudioAttributesImplBaseParcelizer = i4 % 128;
                int i5 = i4 % 2;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onResume() {
            int i = 2 % 2;
            int i2 = AudioAttributesImplApi26Parcelizer + 41;
            AudioAttributesImplBaseParcelizer = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    this.zzce.onResume();
                    int i3 = 87 / 0;
                } else {
                    this.zzce.onResume();
                }
                int i4 = AudioAttributesImplApi26Parcelizer + 33;
                AudioAttributesImplBaseParcelizer = i4 % 128;
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
        public final void onPause() {
            int i = 2 % 2;
            int i2 = AudioAttributesImplBaseParcelizer + 115;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    this.zzce.onPause();
                    int i3 = AudioAttributesImplBaseParcelizer + 39;
                    AudioAttributesImplApi26Parcelizer = i3 % 128;
                    int i4 = i3 % 2;
                    return;
                }
                this.zzce.onPause();
                throw null;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onStop() {
            int i = 2 % 2;
            int i2 = AudioAttributesImplBaseParcelizer + 33;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    this.zzce.onStop();
                } else {
                    this.zzce.onStop();
                    throw null;
                }
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onDestroyView() {
            int i = 2 % 2;
            throw new UnsupportedOperationException("onDestroyView not allowed on StreetViewPanoramaViewDelegate");
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onDestroy() {
            int i = 2 % 2;
            int i2 = AudioAttributesImplBaseParcelizer + 31;
            AudioAttributesImplApi26Parcelizer = i2 % 128;
            try {
                if (i2 % 2 == 0) {
                    this.zzce.onDestroy();
                    int i3 = AudioAttributesImplApi26Parcelizer + 51;
                    AudioAttributesImplBaseParcelizer = i3 % 128;
                    if (i3 % 2 == 0) {
                        throw null;
                    }
                    return;
                }
                this.zzce.onDestroy();
                throw null;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        @Override // com.google.android.gms.dynamic.LifecycleDelegate
        public final void onLowMemory() {
            int i = 2 % 2;
            int i2 = AudioAttributesImplApi26Parcelizer + 59;
            AudioAttributesImplBaseParcelizer = i2 % 128;
            int i3 = i2 % 2;
            try {
                this.zzce.onLowMemory();
                int i4 = AudioAttributesImplBaseParcelizer + 33;
                AudioAttributesImplApi26Parcelizer = i4 % 128;
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
                this.zzce.onSaveInstanceState(bundle2);
                zzby.zza(bundle2, bundle);
                int i2 = AudioAttributesImplApi26Parcelizer + 107;
                AudioAttributesImplBaseParcelizer = i2 % 128;
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

        @Override // com.google.android.gms.maps.internal.StreetViewLifecycleDelegate
        public final void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            int i = 2 % 2;
            try {
                this.zzce.getStreetViewPanoramaAsync(new zzaj(this, onStreetViewPanoramaReadyCallback));
                int i2 = AudioAttributesImplBaseParcelizer + 17;
                AudioAttributesImplApi26Parcelizer = i2 % 128;
                int i3 = i2 % 2;
            } catch (RemoteException e) {
                throw new RuntimeRemoteException(e);
            }
        }

        private static void b(byte b, int i, int i2, short s, int i3, Object[] objArr) throws Throwable {
            int i4;
            boolean z;
            int i5;
            int i6 = 2;
            int i7 = 2 % 2;
            buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
            StringBuilder sb = new StringBuilder();
            try {
                Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(IconCompatParcelizer)};
                int i8 = 0;
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
                long j = 0;
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getPressedStateDuration() >> 16), 24296 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 12 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                if (iIntValue == -1) {
                    int i9 = $11 + 11;
                    $10 = i9 % 128;
                    int i10 = i9 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                if (i4 != 0) {
                    byte[] bArr = read;
                    if (bArr != null) {
                        int length = bArr.length;
                        byte[] bArr2 = new byte[length];
                        int i11 = 0;
                        while (i11 < length) {
                            int i12 = $11 + 89;
                            $10 = i12 % 128;
                            if (i12 % i6 != 0) {
                                try {
                                    Object[] objArr3 = new Object[1];
                                    objArr3[i8] = Integer.valueOf(bArr[i11]);
                                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                                    if (objRemoteActionCompatParcelizer2 == null) {
                                        char cGreen = (char) Color.green(i8);
                                        int i13 = (ExpandableListView.getPackedPositionForGroup(i8) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(i8) == j ? 0 : -1)) + 3082;
                                        int packedPositionGroup = 128 - ExpandableListView.getPackedPositionGroup(j);
                                        byte b2 = (byte) i8;
                                        byte b3 = (byte) (b2 - 1);
                                        objRemoteActionCompatParcelizer2 = startForeground.read(cGreen, i13, packedPositionGroup, 2145850993, false, $$g(b2, b3, (byte) (b3 + 1)), new Class[]{Integer.TYPE});
                                    }
                                    bArr2[i11] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                                    i11 >>= 1;
                                } catch (Throwable th) {
                                    Throwable cause = th.getCause();
                                    if (cause == null) {
                                        throw th;
                                    }
                                    throw cause;
                                }
                            } else {
                                Object[] objArr4 = {Integer.valueOf(bArr[i11])};
                                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(28234468);
                                if (objRemoteActionCompatParcelizer3 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = (byte) (b4 - 1);
                                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((-1) - ((byte) KeyEvent.getModifierMetaStateMask())), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 3082, 128 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 2145850993, false, $$g(b4, b5, (byte) (b5 + 1)), new Class[]{Integer.TYPE});
                                }
                                bArr2[i11] = ((Byte) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).byteValue();
                                i11++;
                            }
                            i6 = 2;
                            i8 = 0;
                            j = 0;
                        }
                        bArr = bArr2;
                    }
                    if (bArr != null) {
                        byte[] bArr3 = read;
                        Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(RemoteActionCompatParcelizer)};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(559968424);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 24297 - KeyEvent.keyCodeFromString(""), 12 - (ViewConfiguration.getJumpTapTimeout() >> 16), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) IconCompatParcelizer) ^ 7899112766888837815L)));
                    } else {
                        iIntValue = (short) (((short) (((long) AudioAttributesCompatParcelizer[i2 + ((int) (((long) RemoteActionCompatParcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) IconCompatParcelizer) ^ 7899112766888837815L)));
                    }
                }
                if (iIntValue > 0) {
                    int i14 = $10 + 75;
                    $11 = i14 % 128;
                    int i15 = i14 % 2;
                    buildresumedownloadsintent.read = ((i2 + iIntValue) - 2) + ((int) (((long) RemoteActionCompatParcelizer) ^ 7899112766888837815L)) + i4;
                    Object[] objArr6 = {buildresumedownloadsintent, Integer.valueOf(i), Integer.valueOf(write), sb};
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(107629512);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        objRemoteActionCompatParcelizer5 = startForeground.read((char) ((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 34134), 13431 - Process.getGidForName(""), KeyEvent.keyCodeFromString("") + 21, 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                    }
                    ((StringBuilder) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    byte[] bArr4 = read;
                    if (bArr4 != null) {
                        int length2 = bArr4.length;
                        byte[] bArr5 = new byte[length2];
                        for (int i16 = 0; i16 < length2; i16++) {
                            int i17 = $10 + 81;
                            $11 = i17 % 128;
                            int i18 = i17 % 2;
                            bArr5[i16] = (byte) (((long) bArr4[i16]) ^ 7899112766888837815L);
                        }
                        bArr4 = bArr5;
                    }
                    if (bArr4 != null) {
                        int i19 = $10 + 7;
                        int i20 = i19 % 128;
                        $11 = i20;
                        int i21 = i19 % 2;
                        int i22 = i20 + 119;
                        $10 = i22 % 128;
                        int i23 = i22 % 2;
                        z = true;
                    } else {
                        z = false;
                    }
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                    while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                        int i24 = $10 + 75;
                        int i25 = i24 % 128;
                        $11 = i25;
                        int i26 = i24 % 2;
                        if (z) {
                            int i27 = i25 + 61;
                            $10 = i27 % 128;
                            if (i27 % 2 != 0) {
                                byte[] bArr6 = read;
                                buildresumedownloadsintent.read = buildresumedownloadsintent.read;
                                i5 = buildresumedownloadsintent.RemoteActionCompatParcelizer * (((byte) (((byte) (((long) bArr6[r3]) % 7899112766888837815L)) % s)) ^ b);
                            } else {
                                byte[] bArr7 = read;
                                buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                                i5 = buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr7[r3]) ^ 7899112766888837815L)) + s)) ^ b);
                            }
                            buildresumedownloadsintent.IconCompatParcelizer = (char) i5;
                        } else {
                            short[] sArr = AudioAttributesCompatParcelizer;
                            buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                            buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r3]) ^ 7899112766888837815L)) + s)) ^ b));
                        }
                        sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                        buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                        buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                    }
                }
                objArr[0] = sb.toString();
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.zzcd = new zzb(this, context, null);
    }

    static final class zzb extends DeferredLifecycleHelper<zza> {
        private OnDelegateCreatedListener<zza> zzbd;
        private final ViewGroup zzbj;
        private final Context zzbk;
        private final List<OnStreetViewPanoramaReadyCallback> zzbw = new ArrayList();
        private final StreetViewPanoramaOptions zzcg;

        zzb(ViewGroup viewGroup, Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
            this.zzbj = viewGroup;
            this.zzbk = context;
            this.zzcg = streetViewPanoramaOptions;
        }

        @Override // com.google.android.gms.dynamic.DeferredLifecycleHelper
        public final void createDelegate(OnDelegateCreatedListener<zza> onDelegateCreatedListener) {
            this.zzbd = onDelegateCreatedListener;
            if (onDelegateCreatedListener == null || getDelegate() != null) {
                return;
            }
            try {
                MapsInitializer.initialize(this.zzbk);
                this.zzbd.onDelegateCreated(new zza(this.zzbj, zzbz.zza(this.zzbk).zza(ObjectWrapper.wrap(this.zzbk), this.zzcg)));
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

        public final void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
            if (getDelegate() != null) {
                getDelegate().getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
            } else {
                this.zzbw.add(onStreetViewPanoramaReadyCallback);
            }
        }
    }

    public StreetViewPanoramaView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.zzcd = new zzb(this, context, null);
    }

    public StreetViewPanoramaView(Context context, StreetViewPanoramaOptions streetViewPanoramaOptions) {
        super(context);
        this.zzcd = new zzb(this, context, streetViewPanoramaOptions);
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        int i3 = $11 + 103;
        $10 = i3 % 128;
        int i4 = i3 % 2;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i5 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = (byte) (b + 1);
                    objRemoteActionCompatParcelizer = startForeground.read((char) (38461 - (ViewConfiguration.getKeyRepeatDelay() >> 16)), 532 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 8, -735610793, false, $$g(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (RemoteActionCompatParcelizer ^ 2192498202983240651L);
                Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b3 = (byte) 0;
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (((Process.getThreadPriority(0) + 20) >> 6) + 36621), View.resolveSizeAndState(0, 0, 0) + 2340, 28 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 188119637, false, $$g(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        int i6 = $11 + 41;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            try {
                Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer3 == null) {
                    byte b5 = (byte) 0;
                    byte b6 = b5;
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (36669 - AndroidCharacter.getMirror('0')), 2340 - Gravity.getAbsoluteGravity(0, 0), 29 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 188119637, false, $$g(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        objArr[0] = new String(cArr2);
    }

    public final void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = read + 23;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char packedPositionGroup = (char) (ExpandableListView.getPackedPositionGroup(0L) + 13183);
            int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 1650;
            int iResolveOpacity = 26 - Drawable.resolveOpacity(0, 0);
            byte[] bArr = $$a;
            Object[] objArr2 = new Object[1];
            a(bArr[53], bArr[5], bArr[17], objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(packedPositionGroup, bitsPerPixel, iResolveOpacity, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            int i4 = read + 41;
            AudioAttributesCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char offsetBefore = (char) (13183 - TextUtils.getOffsetBefore("", 0));
                int capsMode = TextUtils.getCapsMode("", 0, 0) + 1649;
                int i6 = 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                byte[] bArr2 = $$a;
                Object[] objArr3 = new Object[1];
                a(bArr2[65], bArr2[17], bArr2[5], objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(offsetBefore, capsMode, i6, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
        } else {
            Object[] objArr4 = new Object[1];
            b((ViewConfiguration.getDoubleTapTimeout() >> 16) + 36451, new char[]{49478, 20270, 56732, 27236, 63630, 1711, 38687, 9719, 45651, 49273, 20129, 57108, 28155, 64095, 2083, 38540}, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(MotionEvent.axisFromString("") + 62684, new char[]{49477, 13715, 10495, 8147, 4660, 2306, 31866, 28840, 26556, 23294, 20945, 17453, 47915, 44636, 41650, 39324}, objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i7 = AudioAttributesCompatParcelizer + 67;
            read = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 1317055763};
                byte[] bArr3 = $$d;
                Object[] objArr7 = new Object[1];
                c(bArr3[7], bArr3[13], (byte) (-bArr3[28]), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                byte b = bArr3[44];
                Object[] objArr8 = new Object[1];
                c(b, (byte) (b + 3), (byte) (bArr3[16] - 1), objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char size = (char) (13183 - View.MeasureSpec.getSize(0));
                    int iResolveSizeAndState = 1649 - View.resolveSizeAndState(0, 0, 0);
                    int i9 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 25;
                    byte[] bArr4 = $$a;
                    Object[] objArr9 = new Object[1];
                    a(bArr4[65], bArr4[17], bArr4[5], objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(size, iResolveSizeAndState, i9, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b(2862 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), new char[]{49485, 51823, 55058, 57561, 60919, 63140, 33350, 36665, 38955, 42442, 44736, 48016, 18249, 20502, 23854, 26346, 29585, 31890, 2154, 5396, 7883, 11254}, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b((TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 57397, new char[]{49481, 8565, 295, 25027, 16779, 41024, 32886, 57357, 49377, 8336, 850, 25375, 17209, 41968, 33711}, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char deadChar = (char) (13183 - KeyEvent.getDeadChar(0, 0));
                        int i10 = (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1649;
                        int windowTouchSlop = 26 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        byte[] bArr5 = $$a;
                        Object[] objArr12 = new Object[1];
                        a((byte) 75, bArr5[17], bArr5[5], objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(deadChar, i10, windowTouchSlop, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char cGreen = (char) (13183 - Color.green(0));
                        int iLastIndexOf = 1648 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int touchSlop = 26 - (ViewConfiguration.getTouchSlop() >> 8);
                        byte[] bArr6 = $$a;
                        Object[] objArr13 = new Object[1];
                        a(bArr6[53], bArr6[5], bArr6[17], objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(cGreen, iLastIndexOf, touchSlop, -133433128, false, (String) objArr13[0], null);
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
        int i11 = ((int[]) objArr[3])[0];
        int i12 = ((int[]) objArr[2])[0];
        if (i12 != i11) {
            long j = -1;
            long j2 = ((long) (i11 ^ i12)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (Gravity.getAbsoluteGravity(0, 0) + 4535), KeyEvent.keyCodeFromString("") + 6054, TextUtils.getOffsetBefore("", 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                try {
                    Object[] objArr14 = {-1276305091, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1), 6030 - ExpandableListView.getPackedPositionType(0L), 24 - (ViewConfiguration.getLongPressTimeout() >> 16));
                    Object[] objArr15 = new Object[1];
                    c((byte) (-$$d[35]), r3[50], r3[7], objArr15);
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
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            this.zzcd.onCreate(bundle);
            if (this.zzcd.getDelegate() == null) {
                DeferredLifecycleHelper.showGooglePlayUnavailableMessage(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void onStart() {
        int i = 2 % 2;
        int i2 = read + 121;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.zzcd.onStart();
        int i4 = read + 65;
        AudioAttributesCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onResume() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 87;
        read = i2 % 128;
        int i3 = i2 % 2;
        this.zzcd.onResume();
        if (i3 == 0) {
            int i4 = 78 / 0;
        }
    }

    public final void onPause() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 15;
        read = i2 % 128;
        int i3 = i2 % 2;
        this.zzcd.onPause();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public void onStop() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 31;
        read = i2 % 128;
        int i3 = i2 % 2;
        this.zzcd.onStop();
        int i4 = AudioAttributesCompatParcelizer + 47;
        read = i4 % 128;
        int i5 = i4 % 2;
    }

    public void onDestroy() {
        int i = 2 % 2;
        int i2 = read + 25;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.zzcd.onDestroy();
        int i4 = AudioAttributesCompatParcelizer + 9;
        read = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onLowMemory() {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 39;
        read = i2 % 128;
        int i3 = i2 % 2;
        this.zzcd.onLowMemory();
        int i4 = read + 105;
        AudioAttributesCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onSaveInstanceState(Bundle bundle) {
        int i = 2 % 2;
        int i2 = read + 53;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.zzcd.onSaveInstanceState(bundle);
        int i4 = read + 45;
        AudioAttributesCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public void getStreetViewPanoramaAsync(OnStreetViewPanoramaReadyCallback onStreetViewPanoramaReadyCallback) {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 47;
        read = i2 % 128;
        int i3 = i2 % 2;
        Preconditions.checkMainThread("getStreetViewPanoramaAsync() must be called on the main thread");
        this.zzcd.getStreetViewPanoramaAsync(onStreetViewPanoramaReadyCallback);
        int i4 = read + 1;
        AudioAttributesCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }
}
