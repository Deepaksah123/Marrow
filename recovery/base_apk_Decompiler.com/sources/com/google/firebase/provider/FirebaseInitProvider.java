package com.google.firebase.provider;

import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.ProviderInfo;
import android.database.Cursor;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.net.Uri;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.firebase.FirebaseApp;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TrackTransformation;
import kotlin.clearDownloadManagerHelpers;
import kotlin.notifyDownloadChanged;
import kotlin.startForeground;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseInitProvider extends ContentProvider {
    private static long AudioAttributesCompatParcelizer;
    private static TrackTransformation IconCompatParcelizer;
    private static int RemoteActionCompatParcelizer;
    private static AtomicBoolean read;
    private static int write;
    private static final byte[] $$a = {80, -72, 126, -24};
    private static final int $$b = 195;
    private static int $10 = 0;
    private static int $11 = 1;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$c(byte r5, int r6, byte r7) {
        /*
            int r6 = r6 * 3
            int r0 = r6 + 1
            byte[] r1 = com.google.firebase.provider.FirebaseInitProvider.$$a
            int r5 = r5 * 2
            int r5 = r5 + 119
            int r7 = r7 * 4
            int r7 = 3 - r7
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L17
            r4 = r5
            r5 = r6
            r3 = r2
            goto L29
        L17:
            r3 = r2
        L18:
            int r7 = r7 + 1
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L25:
            r4 = r1[r7]
            int r3 = r3 + 1
        L29:
            int r5 = r5 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.provider.FirebaseInitProvider.$$c(byte, int, byte):java.lang.String");
    }

    static {
        write = 0;
        read();
        IconCompatParcelizer = TrackTransformation.IconCompatParcelizer();
        read = new AtomicBoolean(false);
        int i = MediaBrowserCompatCustomActionResultReceiver + 15;
        write = i % 128;
        if (i % 2 != 0) {
            int i2 = 56 / 0;
        }
    }

    public static TrackTransformation IconCompatParcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer;
        int i3 = i2 + 47;
        MediaBrowserCompatItemReceiver = i3 % 128;
        int i4 = i3 % 2;
        TrackTransformation trackTransformation = IconCompatParcelizer;
        int i5 = i2 + 59;
        MediaBrowserCompatItemReceiver = i5 % 128;
        int i6 = i5 % 2;
        return trackTransformation;
    }

    public static boolean RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 1;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        boolean z = read.get();
        int i4 = AudioAttributesImplApi21Parcelizer + 59;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo providerInfo) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 121;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        read(providerInfo);
        super.attachInfo(context, providerInfo);
        int i4 = AudioAttributesImplApi21Parcelizer + 91;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = $11 + 121;
            $10 = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = notifydownloadchanged.AudioAttributesCompatParcelizer;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                    if (objRemoteActionCompatParcelizer == null) {
                        char maximumDrawingCacheSize = (char) (38461 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                        int i5 = (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 532;
                        int keyRepeatTimeout = 8 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                        byte b = (byte) ($$b & 5);
                        byte b2 = (byte) (b - 1);
                        objRemoteActionCompatParcelizer = startForeground.read(maximumDrawingCacheSize, i5, keyRepeatTimeout, -735610793, false, $$c(b, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                    }
                    jArr[i4] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() % (AudioAttributesCompatParcelizer - 2192498202983240651L);
                    Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (36621 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 2340 - Drawable.resolveOpacity(0, 0), 28 - View.MeasureSpec.getMode(0), 188119637, false, $$c(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i6 = notifydownloadchanged.AudioAttributesCompatParcelizer;
                Object[] objArr4 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char mode = (char) (View.MeasureSpec.getMode(0) + 38461);
                    int edgeSlop = (ViewConfiguration.getEdgeSlop() >> 16) + 532;
                    int i7 = 7 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                    byte b5 = (byte) ($$b & 5);
                    byte b6 = (byte) (b5 - 1);
                    objRemoteActionCompatParcelizer3 = startForeground.read(mode, edgeSlop, i7, -735610793, false, $$c(b5, b6, b6), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).longValue() ^ (AudioAttributesCompatParcelizer ^ 2192498202983240651L);
                Object[] objArr5 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer4 == null) {
                    byte b7 = (byte) 0;
                    byte b8 = b7;
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (Color.alpha(0) + 36621), (ViewConfiguration.getEdgeSlop() >> 16) + 2340, View.combineMeasuredStates(0, 0) + 28, 188119637, false, $$c(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
        }
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i8 = $11 + 53;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
                try {
                    Object[] objArr6 = {notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1971306176);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        byte b9 = (byte) 0;
                        byte b10 = b9;
                        objRemoteActionCompatParcelizer5 = startForeground.read((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 36620), TextUtils.indexOf("", "", 0, 0) + 2340, 28 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), 188119637, false, $$c(b9, b10, b10), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
                    int i9 = 78 / 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            } else {
                cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
                Object[] objArr7 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer6 == null) {
                    byte b11 = (byte) 0;
                    byte b12 = b11;
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) ((ViewConfiguration.getTapTimeout() >> 16) + 36621), View.MeasureSpec.getMode(0) + 2340, 27 - Process.getGidForName(""), 188119637, false, $$c(b11, b12, b12), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
        }
        objArr[0] = new String(cArr2);
    }

    private static void a(int i, boolean z, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i2];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i3 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i5 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(RemoteActionCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (Process.getGidForName("") + 1), 23704 - TextUtils.indexOf("", ""), 32 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (44862 - (ViewConfiguration.getKeyRepeatTimeout() >> 16)), TextUtils.getCapsMode("", 0, 0) + 18944, 29 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1836173544, false, "c", new Class[]{Object.class, Object.class});
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
        if (i > 0) {
            int i6 = $11 + 95;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cleardownloadmanagerhelpers.write = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i2 - cleardownloadmanagerhelpers.write);
        }
        if (z) {
            int i8 = $11 + 89;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            char[] cArr4 = new char[i2];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (44862 - (ViewConfiguration.getLongPressTimeout() >> 16)), TextUtils.lastIndexOf("", '0') + 18945, (ViewConfiguration.getPressedStateDuration() >> 16) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            int i10 = $11 + 3;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 103;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object[] objArr = new Object[1];
        a(7 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), false, new char[]{15, '\f', 0, 2, 16, 16, 65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65517}, 18 - (ViewConfiguration.getKeyRepeatDelay() >> 16), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 265, objArr);
        Class<?> cls = Class.forName((String) objArr[0]);
        Object[] objArr2 = new Object[1];
        b(64552 - ExpandableListView.getPackedPositionChild(0L), new char[]{35136, 30077, 28970, 32063, 31213}, objArr2);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr2[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Object[] objArr3 = new Object[1];
            a(20 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), false, new char[]{1, 65483, 65534, '\r', '\r', 65483, 65502, 0, 17, 6, 19, 6, 17, 22, 65521, 5, 15, 2, 65534, 1, 65534, 11, 1, 15, '\f', 6}, 25 - MotionEvent.axisFromString(""), 266 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), objArr3);
            Class<?> cls2 = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            a((ViewConfiguration.getWindowTouchSlop() >> 8) + 2, false, new char[]{5, 4, 65529, 11, '\b', '\b', 65531, 4, '\n', 65495, 6, 6, 2, 65535, 65529, 65527, '\n', 65535}, (-16777198) - Color.rgb(0, 0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 272, objArr4);
            Context applicationContext = (Context) cls2.getMethod((String) objArr4[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                int i4 = AudioAttributesImplApi21Parcelizer + 83;
                MediaBrowserCompatItemReceiver = i4 % 128;
                int i5 = i4 % 2;
                if ((!(applicationContext instanceof ContextWrapper)) || ((ContextWrapper) applicationContext).getBaseContext() != null) {
                    applicationContext = applicationContext.getApplicationContext();
                } else {
                    int i6 = MediaBrowserCompatItemReceiver + 103;
                    AudioAttributesImplApi21Parcelizer = i6 % 128;
                    int i7 = i6 % 2;
                    applicationContext = null;
                }
            }
            if (applicationContext != null) {
                int i8 = AudioAttributesImplApi21Parcelizer + 47;
                MediaBrowserCompatItemReceiver = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 4536), 6055 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    a(ExpandableListView.getPackedPositionType(0L) + 18, true, new char[]{26, 65509, 65514, 25, 27, 26, 65518, 65512, 65515, 65513, 23, 22, 25, 24, 27, 65509, 65514, 24, 26, 27, 65518, 65517, 65514, 65518, 65512, 25, 65516, 23, 24, 23, 26, 65515, 65511, 26, 65509, 65511, 65510, 65512, 22, 65513, 27, 65517, 65518, 27, 26, 65512, 65509, 24}, View.resolveSize(0, 0) + 48, 241 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    a((ViewConfiguration.getScrollBarSize() >> 8) + 33, false, new char[]{65517, 65517, 65521, 31, 65520, '#', 65519, 65520, 65517, 65525, 65524, 31, '!', '!', '#', 65518, '!', 65517, 65526, 65522, 65517, 65518, 65526, 65521, 65522, 65525, '#', '\"', ' ', 65522, '\"', 65520, 65524, 65517, ' ', ' ', 65517, 65524, 30, 65524, 65523, 65522, 65524, '!', 31, 65517, 65518, '!', 65523, 30, '\"', 30, 65526, 65523, 65525, 65521, 65526, 31, 65518, 65518, 65517, 65526, 65524, 65519}, 64 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 232, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b(14822 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), new char[]{35151, 45305, 64134, 9446, 28296, 43110, 53776, 7254, 18017, 32836, 52202, 62923, 16297, 31213, 41935, 60706, 5957, 20857, 39765, 49891, 3323, 14037, 28848, 47756, 58476, 11797, 26635, 37427, 56338, 2026, 16842, 35758, 46521, 65481, 14704, 25351, 44408, 55121, 7904, 22696, 33492, 52402, 63194, 12394, 31250, 42078, 60987, 10311, 21480, 40348, 51185, 467, 19352, 30066, 48976, 63869, 8964, 27314, 38138, 56968, 6327, 17035, 35949, 46670}, objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    a(View.MeasureSpec.makeMeasureSpec(0, 0) + 2, true, new char[]{18, 6, 17, 18, '\f', 3, 20, 3, 65485, 65488, 20, 65485, 18, 17, 3, 5, '\f', 7, 65485, 7, 14, 65535, 65485, 11, '\r', 1, 65484, 3, 16, 65535, 19, 15, 17, 2, 16, 65535, 19, 5, 65484, 18, 17, 65535, 1, 18, 65535, 3, 16, 6, 18, 65484, 17, 2, '\f', 19, '\r', 16, 23, '\n', 7, 65535, 2, 65485, 65485, 65496, 17, 14, 18}, (-16777149) - Color.rgb(0, 0, 0), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 264, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    a(TextUtils.indexOf((CharSequence) "", '0') + 3, false, new char[]{65532, 0, 7, 65532, 65535, 2}, (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6, 216 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b(56807 - (ViewConfiguration.getScrollDefaultDelay() >> 16), new char[]{35103, 21755, 12929, 4271, 65159, 56476, 47734, 38989, 26168, 17418, 8781, 504, 61343, 52667, 43963, 35218, 22377, 13645, 4926, 61745, 57155, 47852, 39111, 26305, 17635, 8853, ':', 60994, 52318, 43619, 34908, 22450, 13820, 5003, 61877, 57230}, objArr10);
                    Object[] objArr11 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr10[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 6030 - (Process.myPid() >> 22), TextUtils.lastIndexOf("", '0') + 25, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr11);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            }
        }
        try {
            read.set(true);
            FirebaseApp.RemoteActionCompatParcelizer(getContext());
            return false;
        } finally {
            read.set(false);
        }
    }

    private static void read(ProviderInfo providerInfo) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 55;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Preconditions.checkNotNull(providerInfo, "FirebaseInitProvider ProviderInfo cannot be null.");
        if ("com.google.firebase.firebaseinitprovider".equals(providerInfo.authority)) {
            throw new IllegalStateException("Incorrect provider authority in manifest. Most likely due to a missing applicationId variable in application's build.gradle.");
        }
        int i4 = MediaBrowserCompatItemReceiver + 87;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String str, String[] strArr) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 9;
        int i3 = i2 % 128;
        AudioAttributesImplApi21Parcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 13;
        MediaBrowserCompatItemReceiver = i5 % 128;
        int i6 = i5 % 2;
        return 0;
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver;
        int i3 = i2 + 69;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            throw null;
        }
        int i4 = i2 + 25;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues contentValues) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver;
        int i3 = i2 + 69;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 83;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] strArr, String str, String[] strArr2, String str2) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver;
        int i3 = i2 + 43;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 63;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 16 / 0;
        }
        return null;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues contentValues, String str, String[] strArr) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 61;
        int i3 = i2 % 128;
        AudioAttributesImplApi21Parcelizer = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 23;
        MediaBrowserCompatItemReceiver = i5 % 128;
        if (i5 % 2 != 0) {
            return 0;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static void read() {
        RemoteActionCompatParcelizer = 1000326301;
        AudioAttributesCompatParcelizer = 593678125754489574L;
    }
}
