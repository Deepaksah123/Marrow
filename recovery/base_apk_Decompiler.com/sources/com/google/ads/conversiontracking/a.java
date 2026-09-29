package com.google.ads.conversiontracking;

import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.ApplicationInfo;
import android.content.pm.FeatureInfo;
import android.content.pm.InstrumentationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageInstaller;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.os.UserHandle;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.ads.conversiontracking.i;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.buildSetRequirementsIntent;
import kotlin.clearDownloadManagerHelpers;
import kotlin.startForeground;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes4.dex */
public class a {
    private Context a;

    public a(Context context) {
        this.a = new C0002a(context);
    }

    public i.a a() {
        try {
            return i.a(this.a);
        } catch (j | k | IOException | IllegalStateException unused) {
            return null;
        }
    }

    /* JADX INFO: renamed from: com.google.ads.conversiontracking.a$a, reason: collision with other inner class name */
    static class C0002a extends ContextWrapper {
        private final b a;
        private final c b;
        private static final byte[] $$c = {109, -42, -99, -39};
        private static final int $$f = 37;
        private static int $10 = 0;
        private static int $11 = 1;
        private static final byte[] $$d = {104, -54, 119, 45, 10, -1, -7, -4, -24, -45, 25, 8, -20, -3, -10, -52, 35, -11, -6, -24, 10, -45, 8, 8, -24, -7, -2, -12, 8, -30, 4, -74, 14, -7, -4, -2, 25, -12, -21, -14, -7, -7, -26, 8, 10, -13, -8, -12, -22, -74, 74, -14, -18, 2, -24, 17, 3, -10, -52, 35, -11, -6, -24, 10, -45, 8, 8, -24, -7, -2, -12, 8, -30, 4};
        private static final int $$e = 171;
        private static final byte[] $$a = {7, -56, -121, 7, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
        private static final int $$b = 84;
        private static int IconCompatParcelizer = 0;
        private static int AudioAttributesCompatParcelizer = 1;
        private static int write = 1000326178;
        private static long RemoteActionCompatParcelizer = -1945925708690144538L;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static java.lang.String $$g(byte r6, byte r7, int r8) {
            /*
                byte[] r0 = com.google.ads.conversiontracking.a.C0002a.$$c
                int r6 = r6 + 4
                int r7 = r7 * 3
                int r1 = 1 - r7
                int r8 = r8 * 3
                int r8 = r8 + 104
                byte[] r1 = new byte[r1]
                r2 = 0
                int r7 = 0 - r7
                if (r0 != 0) goto L17
                r8 = r6
                r3 = r7
                r4 = r2
                goto L2d
            L17:
                r3 = r2
            L18:
                int r6 = r6 + 1
                byte r4 = (byte) r8
                r1[r3] = r4
                int r4 = r3 + 1
                if (r3 != r7) goto L27
                java.lang.String r6 = new java.lang.String
                r6.<init>(r1, r2)
                return r6
            L27:
                r3 = r0[r6]
                r5 = r8
                r8 = r6
                r6 = r3
                r3 = r5
            L2d:
                int r6 = -r6
                int r6 = r6 + r3
                r3 = r4
                r5 = r8
                r8 = r6
                r6 = r5
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.ads.conversiontracking.a.C0002a.$$g(byte, byte, int):java.lang.String");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void e(byte r7, short r8, byte r9, java.lang.Object[] r10) {
            /*
                byte[] r0 = com.google.ads.conversiontracking.a.C0002a.$$a
                int r9 = 44 - r9
                int r8 = r8 + 4
                int r7 = 114 - r7
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L11
                r7 = r8
                r3 = r9
                r4 = r2
                goto L28
            L11:
                r3 = r2
            L12:
                int r8 = r8 + 1
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r9) goto L23
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L23:
                r3 = r0[r8]
                r6 = r8
                r8 = r7
                r7 = r6
            L28:
                int r3 = -r3
                int r8 = r8 + r3
                int r8 = r8 + (-1)
                r3 = r4
                r6 = r8
                r8 = r7
                r7 = r6
                goto L12
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.ads.conversiontracking.a.C0002a.e(byte, short, byte, java.lang.Object[]):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void f(int r5, short r6, int r7, java.lang.Object[] r8) {
            /*
                int r7 = 111 - r7
                byte[] r0 = com.google.ads.conversiontracking.a.C0002a.$$d
                int r1 = 28 - r5
                int r6 = r6 * 3
                int r6 = 55 - r6
                byte[] r1 = new byte[r1]
                int r5 = 27 - r5
                r2 = 0
                if (r0 != 0) goto L14
                r4 = r5
                r3 = r2
                goto L26
            L14:
                r3 = r2
            L15:
                byte r4 = (byte) r7
                r1[r3] = r4
                if (r3 != r5) goto L22
                java.lang.String r5 = new java.lang.String
                r5.<init>(r1, r2)
                r8[r2] = r5
                return
            L22:
                int r3 = r3 + 1
                r4 = r0[r6]
            L26:
                int r7 = r7 + r4
                int r7 = r7 + 9
                int r6 = r6 + 1
                goto L15
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.ads.conversiontracking.a.C0002a.f(int, short, int, java.lang.Object[]):void");
        }

        private static void d(int i, char[] cArr, Object[] objArr) throws Throwable {
            int i2 = 2 % 2;
            buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
            char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer ^ 4027965449757546139L, cArr, i);
            buildsetrequirementsintent.write = 4;
            int i3 = $10 + 11;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
                int i5 = $10 + 99;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
                int i7 = buildsetrequirementsintent.write;
                try {
                    Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(RemoteActionCompatParcelizer)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12424, TextUtils.lastIndexOf("", '0') + 21, -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                    }
                    cArrAudioAttributesCompatParcelizer[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    try {
                        Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b = (byte) (-1);
                            byte b2 = (byte) (b + 1);
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 1868 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.getOffsetAfter("", 0) + 10, 1983509525, false, $$g(b, b2, b2), new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
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
            }
            objArr[0] = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
        }

        public C0002a(Context context) {
            super(context);
            this.a = new b(context);
            this.b = new c(context.getResources());
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public PackageManager getPackageManager() {
            int i = 2 % 2;
            int i2 = AudioAttributesCompatParcelizer + 115;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            b bVar = this.a;
            if (i3 != 0) {
                int i4 = 52 / 0;
            }
            return bVar;
        }

        @Override // android.content.ContextWrapper, android.content.Context
        public Resources getResources() {
            int i = 2 % 2;
            int i2 = AudioAttributesCompatParcelizer;
            int i3 = i2 + 3;
            IconCompatParcelizer = i3 % 128;
            int i4 = i3 % 2;
            c cVar = this.b;
            int i5 = i2 + 19;
            IconCompatParcelizer = i5 % 128;
            int i6 = i5 % 2;
            return cVar;
        }

        private static void c(int i, boolean z, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
            int i4 = 2 % 2;
            clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
            char[] cArr2 = new char[i2];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            int i5 = $10 + 109;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                int i6 = 3 % 3;
            }
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
                cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i3 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
                int i7 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(write)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), 23704 - TextUtils.getCapsMode("", 0, 0), 32 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (44862 - TextUtils.getTrimmedLength("")), ExpandableListView.getPackedPositionType(0L) + 18944, (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
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
                int i8 = $10 + 105;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cleardownloadmanagerhelpers.write = i;
                char[] cArr3 = new char[i2];
                System.arraycopy(cArr2, 0, cArr3, 0, i2);
                System.arraycopy(cArr3, 0, cArr2, i2 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
                System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i2 - cleardownloadmanagerhelpers.write);
            }
            if (z) {
                int i10 = $11 + 69;
                $10 = i10 % 128;
                int i11 = i10 % 2;
                char[] cArr4 = new char[i2];
                cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
                int i12 = $11 + 77;
                $10 = i12 % 128;
                int i13 = i12 % 2;
                while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                    int i14 = $11 + 33;
                    $10 = i14 % 128;
                    if (i14 % 2 != 0) {
                        cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer + i2) >> 1];
                        Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (KeyEvent.normalizeMetaState(0) + 44862), TextUtils.getOffsetBefore("", 0) + 18944, KeyEvent.normalizeMetaState(0) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                    } else {
                        cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                        Object[] objArr5 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-322440307);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) (44862 - ((Process.getThreadPriority(0) + 20) >> 6)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 18944, (ViewConfiguration.getEdgeSlop() >> 16) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                    }
                }
                cArr2 = cArr4;
            }
            objArr[0] = new String(cArr2);
        }

        @Override // android.content.ContextWrapper
        public void attachBaseContext(Context context) throws Throwable {
            Context applicationContext;
            String strValueOf;
            String strValueOf2;
            Object[] objArr;
            Object[] objArr2;
            List<Object[]> list;
            Context applicationContext2 = context;
            int i = 2 % 2;
            int i2 = AudioAttributesCompatParcelizer + 117;
            IconCompatParcelizer = i2 % 128;
            int i3 = i2 % 2;
            super.attachBaseContext(context);
            Object[] objArr3 = new Object[1];
            c(View.MeasureSpec.getSize(0) + 18, true, new char[]{16, 16, 2, 0, '\f', 15, 65517, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 14, 124 - Drawable.resolveOpacity(0, 0), objArr3);
            Class<?> cls = Class.forName((String) objArr3[0]);
            Object[] objArr4 = new Object[1];
            c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 6, false, new char[]{17, 65517, 1, 65532, 5}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(com.marrow.R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 4, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_item_list).substring(0, 4).length() + 125, objArr4);
            int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
            if (iIntValue < 99000 || iIntValue > 99999) {
                if (applicationContext2 != null) {
                    int i4 = IconCompatParcelizer + 1;
                    AudioAttributesCompatParcelizer = i4 % 128;
                    int i5 = i4 % 2;
                    applicationContext = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : context.getApplicationContext();
                } else {
                    applicationContext = applicationContext2;
                }
                if (applicationContext != null) {
                    try {
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - Color.blue(0)), TextUtils.getTrimmedLength("") + 6054, 41 - TextUtils.lastIndexOf("", '0', 0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                        }
                        Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                        Object[] objArr5 = new Object[1];
                        c(46 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), true, new char[]{65517, 65514, 65518, 65512, 25, 65516, 23, 24, 23, 26, 65515, 65511, 26, 65509, 65511, 65510, 65512, 22, 65513, 27, 65517, 65518, 27, 26, 65512, 65509, 24, 26, 65509, 65514, 25, 27, 26, 65518, 65512, 65515, 65513, 23, 22, 25, 24, 27, 65509, 65514, 24, 26, 27, 65518}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 66, 101 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), objArr5);
                        String str = (String) objArr5[0];
                        Object[] objArr6 = new Object[1];
                        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_item_list).substring(0, 4).length() + 18, false, new char[]{31, '!', '!', '#', 65518, '!', 65517, 65526, 65522, 65517, 65518, 65526, 65521, 65522, 65525, '#', '\"', ' ', 65522, '\"', 65520, 65524, 65517, ' ', ' ', 65517, 65524, 30, 65524, 65523, 65522, 65524, '!', 31, 65517, 65518, '!', 65523, 30, '\"', 30, 65526, 65523, 65525, 65521, 65526, 31, 65518, 65518, 65517, 65526, 65524, 65519, 65517, 65517, 65521, 31, 65520, '#', 65519, 65520, 65517, 65525, 65524}, Gravity.getAbsoluteGravity(0, 0) + 64, TextUtils.indexOf((CharSequence) "", '0', 0) + 93, objArr6);
                        String str2 = (String) objArr6[0];
                        Object[] objArr7 = new Object[1];
                        d(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 34, new char[]{65295, 65389, 63593, 1195, 45874, 60453, 11312, 36385, 44746, 40490, 32294, 15457, 23683, 16488, 51324, 21084, 2795, 62033, 6681, 32773, 47335, 42053, 29699, 13892, 26361, 22041, 50726, 25659, 5262, 63545, 4221, 39460, 49808, 43638, 25148, 51241, 28827, 23573, 48134, 32320, 7930, 3613, 3606, 44127, 52406, 45150, 22604, 50173, 31248, 24994, 43757, 29088, 10314, 5088, 1191, 42932, 54874, 50622, 22214, 54666, 33894, 30686, 41164, 2975, 12917, 6551, 62171, 47561}, objArr7);
                        String str3 = (String) objArr7[0];
                        Object[] objArr8 = new Object[1];
                        d(-TextUtils.lastIndexOf("", '0'), new char[]{34651, 34611, 24440, 2845, 2994, 19313, 9107, 14005, 55004, 14643, 29148, 34038, 9431, 59260, 51094, 60033, 29438, 21843, 5540, 14484, 49381, 849, 31652, 36571, 7915, 61777, 51665, 56556, 27778, 24377, 8140, 8956, 47748, 3365, 28053, 28918, 2190, 64260, 46069, 50881, 26300, 43288, 486, 5336, 46241, 5912, 22449, 31534, 584, 50924, 42308, 51488, 20571, 46332, 2904, 7996, 44625, 25342, 22822, 27930, 64631, 53378, 44857, 45903, 19000, 48852, 64813, 276, 39029, 27825, 17236}, objArr8);
                        String str4 = (String) objArr8[0];
                        Object[] objArr9 = new Object[1];
                        d(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 110, new char[]{26948, 27005, 4659, 37592, 33643, 1632, 47635, 48680, 14494, 29808}, objArr9);
                        String str5 = (String) objArr9[0];
                        Object[] objArr10 = new Object[1];
                        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_item_list).substring(0, 4).codePointAt(1) - 31, true, new char[]{65527, 65524, 65526, 65524, 65517, '&', 65528, '&', 65528, 65517, 65521, 65521, 65522, 65526, 65527, '\"', 65521, 65522, 65526, 65526, '!', 65521, '&', '#', '%', 65527, 65522, '!', 65527, '&', 65517, 65520, 65522, '\"', 65529, 65517}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 26, 89 - Color.red(0), objArr10);
                        Object[] objArr11 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr10[0], 86400};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getTapTimeout() >> 16), 6029 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 23 - ((byte) KeyEvent.getModifierMetaStateMask()), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                        }
                        ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr11);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
            }
            try {
                try {
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-18205161);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        char c = (char) (61148 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        int i6 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2144;
                        int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 13;
                        byte[] bArr = $$a;
                        byte b = bArr[8];
                        short s = bArr[131];
                        Object[] objArr12 = new Object[1];
                        e(b, s, (byte) (s & 40), objArr12);
                        objRemoteActionCompatParcelizer3 = startForeground.read(c, i6, iIndexOf, -2136739198, false, (String) objArr12[0], null);
                    }
                    if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-629126231);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            char keyRepeatDelay = (char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 61148);
                            int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0) + 2146;
                            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 12;
                            Object[] objArr13 = new Object[1];
                            e((byte) (-$$a[140]), r7[13], r7[22], objArr13);
                            objRemoteActionCompatParcelizer4 = startForeground.read(keyRepeatDelay, iLastIndexOf, keyRepeatTimeout, -1530294468, false, (String) objArr13[0], null);
                        }
                        list = (List) ((Field) objRemoteActionCompatParcelizer4).get(null);
                    } else {
                        Object[] objArr14 = new Object[1];
                        c(KeyEvent.normalizeMetaState(0) + 6, false, new char[]{65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 20, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 88, objArr14);
                        Class<?> cls2 = Class.forName((String) objArr14[0]);
                        Object[] objArr15 = new Object[1];
                        d(KeyEvent.keyCodeFromString("") + 1, new char[]{43388, 43285, 57100, 11105, 65335, 51989, 1022, 49710, 63740, 47380, 20987, 28709, 2780, 26376, 59376, 7680, 23779, 54586, 13779, 52225}, objArr15);
                        int iIntValue2 = ((Integer) cls2.getMethod((String) objArr15[0], Object.class).invoke(null, this)).intValue();
                        try {
                            Object[] objArr16 = {-52171697};
                            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-173351824);
                            if (objRemoteActionCompatParcelizer5 == null) {
                                objRemoteActionCompatParcelizer5 = startForeground.read((char) (45845 - ExpandableListView.getPackedPositionType(0L)), 913 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 10 - TextUtils.getOffsetBefore("", 0), -1948051227, false, null, new Class[]{Integer.TYPE});
                            }
                            try {
                                Object[] objArr17 = {Integer.valueOf(iIntValue2), ((Constructor) objRemoteActionCompatParcelizer5).newInstance(objArr16)};
                                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1891595430);
                                if (objRemoteActionCompatParcelizer6 == null) {
                                    char scrollBarSize = (char) ((ViewConfiguration.getScrollBarSize() >> 8) + 61148);
                                    int iAlpha = 2145 - Color.alpha(0);
                                    int iBlue = 12 - Color.blue(0);
                                    byte[] bArr2 = $$a;
                                    byte b2 = bArr2[139];
                                    short s2 = (short) (bArr2[11] + 1);
                                    Object[] objArr18 = new Object[1];
                                    e(b2, s2, (byte) (s2 & 120), objArr18);
                                    objRemoteActionCompatParcelizer6 = startForeground.read(scrollBarSize, iAlpha, iBlue, 251047987, false, (String) objArr18[0], new Class[]{Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) TextUtils.indexOf("", "", 0, 0), MotionEvent.axisFromString("") + 558, 18 - TextUtils.indexOf("", "", 0))});
                                }
                                list = (List) ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr17);
                                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-629126231);
                                if (objRemoteActionCompatParcelizer7 == null) {
                                    char c2 = (char) (61149 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                                    int fadingEdgeLength = 2145 - (ViewConfiguration.getFadingEdgeLength() >> 16);
                                    int edgeSlop = 12 - (ViewConfiguration.getEdgeSlop() >> 16);
                                    Object[] objArr19 = new Object[1];
                                    e((byte) (-$$a[140]), r9[13], r9[22], objArr19);
                                    objRemoteActionCompatParcelizer7 = startForeground.read(c2, fadingEdgeLength, edgeSlop, -1530294468, false, (String) objArr19[0], null);
                                }
                                ((Field) objRemoteActionCompatParcelizer7).set(null, list);
                                Object[] objArr20 = new Object[1];
                                c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 10, false, new char[]{1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11}, 22 - Color.argb(0, 0, 0, 0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 124, objArr20);
                                Class<?> cls3 = Class.forName((String) objArr20[0]);
                                Object[] objArr21 = new Object[1];
                                d((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1, new char[]{15772, 15865, 56195, 31146, 350, 53138, 20785, 15449, 27675, 48535, 800, 36455, 40465, 25479, 46372, 57461, 51241, 53687, 26393}, objArr21);
                                long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr21[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf = Long.valueOf(jLongValue);
                                Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(301834150);
                                if (objRemoteActionCompatParcelizer8 == null) {
                                    char c3 = (char) (61149 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                                    int iCombineMeasuredStates = View.combineMeasuredStates(0, 0) + 2145;
                                    int fadingEdgeLength2 = (ViewConfiguration.getFadingEdgeLength() >> 16) + 12;
                                    byte b3 = (byte) (-$$a[148]);
                                    Object[] objArr22 = new Object[1];
                                    e(b3, (short) (b3 | 18), r14[34], objArr22);
                                    objRemoteActionCompatParcelizer8 = startForeground.read(c3, iCombineMeasuredStates, fadingEdgeLength2, 1874090803, false, (String) objArr22[0], null);
                                }
                                ((Field) objRemoteActionCompatParcelizer8).set(null, lValueOf);
                                Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                                Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(-18205161);
                                if (objRemoteActionCompatParcelizer9 == null) {
                                    char scrollBarSize2 = (char) (61148 - (ViewConfiguration.getScrollBarSize() >> 8));
                                    int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 2145;
                                    int offsetBefore = TextUtils.getOffsetBefore("", 0) + 12;
                                    byte[] bArr3 = $$a;
                                    byte b4 = bArr3[8];
                                    short s3 = bArr3[131];
                                    Object[] objArr23 = new Object[1];
                                    e(b4, s3, (byte) (s3 & 40), objArr23);
                                    objRemoteActionCompatParcelizer9 = startForeground.read(scrollBarSize2, iKeyCodeFromString, offsetBefore, -2136739198, false, (String) objArr23[0], null);
                                }
                                ((Field) objRemoteActionCompatParcelizer9).set(null, lValueOf2);
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
                    for (Object[] objArr24 : list) {
                        int i7 = ((int[]) objArr24[3])[0];
                        int i8 = ((int[]) objArr24[1])[0];
                        if (i8 != i7) {
                            ArrayList arrayList = new ArrayList();
                            String[] strArr = (String[]) objArr24[2];
                            if (strArr != null) {
                                int i9 = IconCompatParcelizer + 69;
                                AudioAttributesCompatParcelizer = i9 % 128;
                                for (int i10 = i9 % 2 == 0 ? 1 : 0; i10 < strArr.length; i10++) {
                                    arrayList.add(strArr[i10]);
                                }
                            }
                            long j = -1;
                            long j2 = 0;
                            long j3 = (((long) (i8 ^ i7)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 10) << 32) | (j2 - ((j2 >> 63) << 32));
                            try {
                                Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                                if (objRemoteActionCompatParcelizer10 == null) {
                                    objRemoteActionCompatParcelizer10 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0) + 4536), TextUtils.getTrimmedLength("") + 6054, 42 - Color.red(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                                }
                                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer10).invoke(null, null);
                                try {
                                    Object[] objArr25 = {-52171697, Long.valueOf(j3), arrayList, TrainingApplication.RemoteActionCompatParcelizer(), false};
                                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 6030 - TextUtils.getTrimmedLength(""), 24 - TextUtils.indexOf("", "", 0));
                                    byte[] bArr4 = $$d;
                                    byte b5 = (byte) (bArr4[5] + 1);
                                    byte b6 = bArr4[55];
                                    Object[] objArr26 = new Object[1];
                                    f(b5, b6, (byte) (b6 | 12), objArr26);
                                    cls4.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
                                } catch (Throwable th4) {
                                    Throwable cause4 = th4.getCause();
                                    if (cause4 == null) {
                                        throw th4;
                                    }
                                    throw cause4;
                                }
                            } catch (Throwable th5) {
                                Throwable cause5 = th5.getCause();
                                if (cause5 == null) {
                                    throw th5;
                                }
                                throw cause5;
                            }
                        }
                    }
                } catch (Throwable th6) {
                    Throwable cause6 = th6.getCause();
                    if (cause6 == null) {
                        throw th6;
                    }
                    throw cause6;
                }
            } catch (Throwable th7) {
                Object[] objArr27 = new Object[1];
                c(10 - TextUtils.getTrimmedLength(""), true, new char[]{1, 4, 65533, 2, 1, 4, 65535, 4, 65533, 65535, 65531}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(com.marrow.R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 10, TextUtils.indexOf("", "", 0) + 78, objArr27);
                String str6 = (String) objArr27[0];
                try {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    PrintStream printStream = new PrintStream(byteArrayOutputStream);
                    th7.printStackTrace(printStream);
                    printStream.close();
                    strValueOf = byteArrayOutputStream.toString(CharsetNames.UTF_8);
                } catch (Throwable unused) {
                    strValueOf = String.valueOf(th7);
                }
                ArrayList arrayList2 = new ArrayList(2);
                arrayList2.add(strValueOf);
                arrayList2.add(str6);
                Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer11 == null) {
                    objRemoteActionCompatParcelizer11 = startForeground.read((char) (4535 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), TextUtils.getOffsetBefore("", 0) + 6054, 41 - ExpandableListView.getPackedPositionChild(0L), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke3 = ((Method) objRemoteActionCompatParcelizer11).invoke(null, null);
                Object[] objArr28 = {-52171697, 81604378625L, arrayList2, TrainingApplication.RemoteActionCompatParcelizer(), false};
                Class cls5 = (Class) startForeground.IconCompatParcelizer((char) ((-16777216) - Color.rgb(0, 0, 0)), (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 6030, (KeyEvent.getMaxKeyCode() >> 16) + 24);
                byte[] bArr5 = $$d;
                byte b7 = (byte) (bArr5[5] + 1);
                byte b8 = bArr5[55];
                Object[] objArr29 = new Object[1];
                f(b7, b8, (byte) (b8 | 12), objArr29);
                cls5.getMethod((String) objArr29[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke3, objArr28);
            }
            if (applicationContext2 != null) {
                try {
                    applicationContext2 = ((applicationContext2 instanceof ContextWrapper) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : context.getApplicationContext();
                } catch (Throwable th8) {
                    Object[] objArr30 = new Object[1];
                    c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 99, false, new char[]{65533, 2, 65532, 0, 65535, 3, 4, 2, 65534, 0, 4}, 11 - (ViewConfiguration.getTouchSlop() >> 8), 77 - KeyEvent.keyCodeFromString(""), objArr30);
                    String str7 = (String) objArr30[0];
                    try {
                        ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
                        PrintStream printStream2 = new PrintStream(byteArrayOutputStream2);
                        th8.printStackTrace(printStream2);
                        printStream2.close();
                        strValueOf2 = byteArrayOutputStream2.toString(CharsetNames.UTF_8);
                    } catch (Throwable unused2) {
                        strValueOf2 = String.valueOf(th8);
                    }
                    ArrayList arrayList3 = new ArrayList(2);
                    arrayList3.add(strValueOf2);
                    arrayList3.add(str7);
                    Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer12 == null) {
                        objRemoteActionCompatParcelizer12 = startForeground.read((char) (TextUtils.indexOf("", "") + 4535), 6054 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getFadingEdgeLength() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke4 = ((Method) objRemoteActionCompatParcelizer12).invoke(null, null);
                    Object[] objArr31 = {-52171697, 81604378625L, arrayList3, TrainingApplication.RemoteActionCompatParcelizer(), false};
                    Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (AndroidCharacter.getMirror('0') - '0'), 6030 - (KeyEvent.getMaxKeyCode() >> 16), Color.blue(0) + 24);
                    byte[] bArr6 = $$d;
                    byte b9 = (byte) (bArr6[5] + 1);
                    byte b10 = bArr6[55];
                    Object[] objArr32 = new Object[1];
                    f(b9, b10, (byte) (b10 | 12), objArr32);
                    cls6.getMethod((String) objArr32[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke4, objArr31);
                }
            }
            try {
                Object[] objArr33 = {-52171697};
                Object objRemoteActionCompatParcelizer13 = startForeground.RemoteActionCompatParcelizer(-1128409246);
                if (objRemoteActionCompatParcelizer13 == null) {
                    objRemoteActionCompatParcelizer13 = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), Color.rgb(0, 0, 0) + 16779207, 11 - TextUtils.lastIndexOf("", '0', 0, 0), -1024191497, false, null, new Class[]{Integer.TYPE});
                }
                try {
                    Object[] objArr34 = {applicationContext2, ((Constructor) objRemoteActionCompatParcelizer13).newInstance(objArr33)};
                    Object objRemoteActionCompatParcelizer14 = startForeground.RemoteActionCompatParcelizer(352975618);
                    if (objRemoteActionCompatParcelizer14 == null) {
                        char scrollBarSize3 = (char) (19323 - (ViewConfiguration.getScrollBarSize() >> 8));
                        int iMyPid = 2759 - (Process.myPid() >> 22);
                        int windowTouchSlop = 99 - (ViewConfiguration.getWindowTouchSlop() >> 8);
                        byte b11 = (byte) (-$$a[148]);
                        Object[] objArr35 = new Object[1];
                        e(b11, (short) (b11 | 18), r3[34], objArr35);
                        objRemoteActionCompatParcelizer14 = startForeground.read(scrollBarSize3, iMyPid, windowTouchSlop, 1799372695, false, (String) objArr35[0], new Class[]{Context.class, (Class) startForeground.IconCompatParcelizer((char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 9579), ExpandableListView.getPackedPositionChild(0L) + 3447, (-16777072) - Color.rgb(0, 0, 0))});
                    }
                    ((Method) objRemoteActionCompatParcelizer14).invoke(null, objArr34);
                    Object objRemoteActionCompatParcelizer15 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer15 == null) {
                        char mirror = (char) (AndroidCharacter.getMirror('0') + 13135);
                        int offsetAfter = 1649 - TextUtils.getOffsetAfter("", 0);
                        int iResolveOpacity = Drawable.resolveOpacity(0, 0) + 26;
                        Object[] objArr36 = new Object[1];
                        e((byte) (-$$a[140]), (short) 77, r2[8], objArr36);
                        objRemoteActionCompatParcelizer15 = startForeground.read(mirror, offsetAfter, iResolveOpacity, -133433128, false, (String) objArr36[0], null);
                    }
                    if (((Field) objRemoteActionCompatParcelizer15).getLong(null) != -1) {
                        int i11 = IconCompatParcelizer + 43;
                        AudioAttributesCompatParcelizer = i11 % 128;
                        if (i11 % 2 == 0) {
                            Object objRemoteActionCompatParcelizer16 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                            if (objRemoteActionCompatParcelizer16 == null) {
                                char maximumDrawingCacheSize = (char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 13183);
                                int i12 = 1649 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 27;
                                Object[] objArr37 = new Object[1];
                                e((byte) (-$$a[12]), (short) 120, r3[63], objArr37);
                                objRemoteActionCompatParcelizer16 = startForeground.read(maximumDrawingCacheSize, i12, modifierMetaStateMask, -1033747278, false, (String) objArr37[0], null);
                            }
                            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer16).get(null);
                            int i13 = 89 / 0;
                        } else {
                            Object objRemoteActionCompatParcelizer17 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                            if (objRemoteActionCompatParcelizer17 == null) {
                                char c4 = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 13182);
                                int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 1649;
                                int i14 = 26 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                                Object[] objArr38 = new Object[1];
                                e((byte) (-$$a[12]), (short) 120, r3[63], objArr38);
                                objRemoteActionCompatParcelizer17 = startForeground.read(c4, absoluteGravity, i14, -1033747278, false, (String) objArr38[0], null);
                            }
                            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer17).get(null);
                        }
                    } else {
                        Object[] objArr39 = new Object[1];
                        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 29, false, new char[]{65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 20, 123 - (ViewConfiguration.getJumpTapTimeout() >> 16), objArr39);
                        Class<?> cls7 = Class.forName((String) objArr39[0]);
                        Object[] objArr40 = new Object[1];
                        d(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 110, new char[]{43388, 43285, 57100, 11105, 65335, 51989, 1022, 49710, 63740, 47380, 20987, 28709, 2780, 26376, 59376, 7680, 23779, 54586, 13779, 52225}, objArr40);
                        try {
                            Object[] objArr41 = {Integer.valueOf(((Integer) cls7.getMethod((String) objArr40[0], Object.class).invoke(null, this)).intValue()), 0, 283201469};
                            byte[] bArr7 = $$d;
                            Object[] objArr42 = new Object[1];
                            f(bArr7[56], bArr7[11], (byte) (bArr7[5] + 1), objArr42);
                            Class<?> cls8 = Class.forName((String) objArr42[0]);
                            byte b12 = bArr7[11];
                            byte b13 = (byte) (bArr7[5] + 1);
                            Object[] objArr43 = new Object[1];
                            f(b12, b13, (byte) (b13 | 38), objArr43);
                            objArr = (Object[]) cls8.getMethod((String) objArr43[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr41);
                            Object objRemoteActionCompatParcelizer18 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                            if (objRemoteActionCompatParcelizer18 == null) {
                                char size = (char) (13183 - View.MeasureSpec.getSize(0));
                                int i15 = 1650 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                                int iBlue2 = Color.blue(0) + 26;
                                Object[] objArr44 = new Object[1];
                                e((byte) (-$$a[12]), (short) 120, r2[63], objArr44);
                                objRemoteActionCompatParcelizer18 = startForeground.read(size, i15, iBlue2, -1033747278, false, (String) objArr44[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer18).set(null, objArr);
                            try {
                                Object[] objArr45 = new Object[1];
                                c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_track_resolution).substring(0, 4).length() + 16, false, new char[]{1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11}, 22 - (KeyEvent.getMaxKeyCode() >> 16), 123 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), objArr45);
                                Class<?> cls9 = Class.forName((String) objArr45[0]);
                                Object[] objArr46 = new Object[1];
                                d(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 34, new char[]{15772, 15865, 56195, 31146, 350, 53138, 20785, 15449, 27675, 48535, 800, 36455, 40465, 25479, 46372, 57461, 51241, 53687, 26393}, objArr46);
                                long jLongValue2 = ((Long) cls9.getDeclaredMethod((String) objArr46[0], new Class[0]).invoke(null, new Object[0])).longValue();
                                Long lValueOf3 = Long.valueOf(jLongValue2);
                                Object objRemoteActionCompatParcelizer19 = startForeground.RemoteActionCompatParcelizer(2104791916);
                                if (objRemoteActionCompatParcelizer19 == null) {
                                    char touchSlop = (char) (13183 - (ViewConfiguration.getTouchSlop() >> 8));
                                    int iResolveSize = View.resolveSize(0, 0) + 1649;
                                    int scrollBarSize4 = (ViewConfiguration.getScrollBarSize() >> 8) + 26;
                                    Object[] objArr47 = new Object[1];
                                    e((byte) (-$$a[12]), (short) 153, r8[63], objArr47);
                                    objRemoteActionCompatParcelizer19 = startForeground.read(touchSlop, iResolveSize, scrollBarSize4, 54351865, false, (String) objArr47[0], null);
                                }
                                ((Field) objRemoteActionCompatParcelizer19).set(null, lValueOf3);
                                Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                                Object objRemoteActionCompatParcelizer20 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                                if (objRemoteActionCompatParcelizer20 == null) {
                                    char c5 = (char) (13184 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                                    int iArgb = 1649 - Color.argb(0, 0, 0, 0);
                                    int i16 = 27 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1));
                                    Object[] objArr48 = new Object[1];
                                    e((byte) (-$$a[140]), (short) 77, r7[8], objArr48);
                                    objRemoteActionCompatParcelizer20 = startForeground.read(c5, iArgb, i16, -133433128, false, (String) objArr48[0], null);
                                }
                                ((Field) objRemoteActionCompatParcelizer20).set(null, lValueOf4);
                            } catch (Exception unused3) {
                                throw new RuntimeException();
                            }
                        } catch (Throwable th9) {
                            Throwable cause7 = th9.getCause();
                            if (cause7 == null) {
                                throw th9;
                            }
                            throw cause7;
                        }
                    }
                    int i17 = ((int[]) objArr[3])[0];
                    int i18 = ((int[]) objArr[2])[0];
                    if (i18 != i17) {
                        long j4 = -1;
                        long j5 = (((long) 0) << 32) | (j4 - ((j4 >> 63) << 32));
                        long j6 = 0;
                        long j7 = (j5 & ((long) (i18 ^ i17))) | (((long) 2) << 32) | (j6 - ((j6 >> 63) << 32));
                        Object objRemoteActionCompatParcelizer21 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                        if (objRemoteActionCompatParcelizer21 == null) {
                            objRemoteActionCompatParcelizer21 = startForeground.read((char) (4535 - Drawable.resolveOpacity(0, 0)), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 6053, Gravity.getAbsoluteGravity(0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                        }
                        Object objInvoke5 = ((Method) objRemoteActionCompatParcelizer21).invoke(null, null);
                        Object[] objArr49 = {-52171697, Long.valueOf(j7), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                        Class cls10 = (Class) startForeground.IconCompatParcelizer((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Color.red(0) + 6030, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 24);
                        byte[] bArr8 = $$d;
                        byte b14 = (byte) (bArr8[5] + 1);
                        byte b15 = bArr8[55];
                        Object[] objArr50 = new Object[1];
                        f(b14, b15, (byte) (b15 | 12), objArr50);
                        cls10.getMethod((String) objArr50[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke5, objArr49);
                    }
                    Object objRemoteActionCompatParcelizer22 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                    if (objRemoteActionCompatParcelizer22 == null) {
                        int maximumDrawingCacheSize2 = (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 943;
                        int trimmedLength = TextUtils.getTrimmedLength("") + 36;
                        byte[] bArr9 = $$a;
                        byte b16 = bArr9[8];
                        short s4 = bArr9[131];
                        Object[] objArr51 = new Object[1];
                        e(b16, s4, (byte) (s4 & 40), objArr51);
                        objRemoteActionCompatParcelizer22 = startForeground.read((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), maximumDrawingCacheSize2, trimmedLength, -167186806, false, (String) objArr51[0], null);
                    }
                    if (((Field) objRemoteActionCompatParcelizer22).getLong(null) != -1) {
                        int i19 = AudioAttributesCompatParcelizer + 17;
                        IconCompatParcelizer = i19 % 128;
                        if (i19 % 2 != 0) {
                            Object objRemoteActionCompatParcelizer23 = startForeground.RemoteActionCompatParcelizer(-757676623);
                            if (objRemoteActionCompatParcelizer23 == null) {
                                char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0') + 1);
                                int i20 = 943 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                                int iCombineMeasuredStates2 = View.combineMeasuredStates(0, 0) + 36;
                                Object[] objArr52 = new Object[1];
                                e((byte) (-$$a[140]), r1[13], r1[22], objArr52);
                                objRemoteActionCompatParcelizer23 = startForeground.read(cIndexOf, i20, iCombineMeasuredStates2, -1398865628, false, (String) objArr52[0], null);
                            }
                            throw null;
                        }
                        Object objRemoteActionCompatParcelizer24 = startForeground.RemoteActionCompatParcelizer(-757676623);
                        if (objRemoteActionCompatParcelizer24 == null) {
                            char c6 = (char) (1 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
                            int packedPositionType = 943 - ExpandableListView.getPackedPositionType(0L);
                            int i21 = (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 36;
                            Object[] objArr53 = new Object[1];
                            e((byte) (-$$a[140]), r1[13], r1[22], objArr53);
                            objRemoteActionCompatParcelizer24 = startForeground.read(c6, packedPositionType, i21, -1398865628, false, (String) objArr53[0], null);
                        }
                        objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer24).get(null);
                    } else {
                        Object[] objArr54 = new Object[1];
                        c(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 4, false, new char[]{65521, 23, 17, 18, 3, 11, '\b', 65535, 20, 65535, 65484, '\n', 65535, '\f', 5, 65484}, 16 - Drawable.resolveOpacity(0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 88, objArr54);
                        Class<?> cls11 = Class.forName((String) objArr54[0]);
                        Object[] objArr55 = new Object[1];
                        d(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 34, new char[]{43388, 43285, 57100, 11105, 65335, 51989, 1022, 49710, 63740, 47380, 20987, 28709, 2780, 26376, 59376, 7680, 23779, 54586, 13779, 52225}, objArr55);
                        Object[] objArr56 = {Integer.valueOf(((Integer) cls11.getMethod((String) objArr55[0], Object.class).invoke(null, this)).intValue()), 0, 786540878};
                        Object objRemoteActionCompatParcelizer25 = startForeground.RemoteActionCompatParcelizer(-21191141);
                        if (objRemoteActionCompatParcelizer25 == null) {
                            char c7 = (char) ((ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 1);
                            int iKeyCodeFromString2 = KeyEvent.keyCodeFromString("") + 943;
                            int i22 = 35 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                            Object[] objArr57 = new Object[1];
                            e((byte) (-$$a[12]), (short) 186, r2[16], objArr57);
                            objRemoteActionCompatParcelizer25 = startForeground.read(c7, iKeyCodeFromString2, i22, -2131402098, false, (String) objArr57[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
                        }
                        objArr2 = (Object[]) ((Method) objRemoteActionCompatParcelizer25).invoke(null, objArr56);
                        Object objRemoteActionCompatParcelizer26 = startForeground.RemoteActionCompatParcelizer(-757676623);
                        if (objRemoteActionCompatParcelizer26 == null) {
                            char cResolveSizeAndState = (char) View.resolveSizeAndState(0, 0, 0);
                            int packedPositionChild = 942 - ExpandableListView.getPackedPositionChild(0L);
                            int iRed = 36 - Color.red(0);
                            Object[] objArr58 = new Object[1];
                            e((byte) (-$$a[140]), r3[13], r3[22], objArr58);
                            objRemoteActionCompatParcelizer26 = startForeground.read(cResolveSizeAndState, packedPositionChild, iRed, -1398865628, false, (String) objArr58[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer26).set(null, objArr2);
                        try {
                            Object[] objArr59 = new Object[1];
                            c((ViewConfiguration.getTouchSlop() >> 8) + 20, false, new char[]{1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65520, 22, 16, 17, 2, '\n', 65504, '\t', '\f', 0, '\b', 65534, 11}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 18, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 89, objArr59);
                            Class<?> cls12 = Class.forName((String) objArr59[0]);
                            Object[] objArr60 = new Object[1];
                            d(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 3, new char[]{15772, 15865, 56195, 31146, 350, 53138, 20785, 15449, 27675, 48535, 800, 36455, 40465, 25479, 46372, 57461, 51241, 53687, 26393}, objArr60);
                            long jLongValue3 = ((Long) cls12.getDeclaredMethod((String) objArr60[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf5 = Long.valueOf(jLongValue3);
                            Object objRemoteActionCompatParcelizer27 = startForeground.RemoteActionCompatParcelizer(-1539638354);
                            if (objRemoteActionCompatParcelizer27 == null) {
                                char packedPositionChild2 = (char) ((-1) - ExpandableListView.getPackedPositionChild(0L));
                                int iResolveOpacity2 = Drawable.resolveOpacity(0, 0) + 943;
                                int longPressTimeout = 36 - (ViewConfiguration.getLongPressTimeout() >> 16);
                                byte b17 = (byte) (-$$a[148]);
                                Object[] objArr61 = new Object[1];
                                e(b17, (short) (b17 | 18), r5[34], objArr61);
                                objRemoteActionCompatParcelizer27 = startForeground.read(packedPositionChild2, iResolveOpacity2, longPressTimeout, -629981381, false, (String) objArr61[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer27).set(null, lValueOf5);
                            Long lValueOf6 = Long.valueOf(jLongValue3 >> 12);
                            Object objRemoteActionCompatParcelizer28 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                            if (objRemoteActionCompatParcelizer28 == null) {
                                char packedPositionGroup = (char) ExpandableListView.getPackedPositionGroup(0L);
                                int iArgb2 = 943 - Color.argb(0, 0, 0, 0);
                                int iLastIndexOf2 = 35 - TextUtils.lastIndexOf("", '0');
                                byte[] bArr10 = $$a;
                                byte b18 = bArr10[8];
                                short s5 = bArr10[131];
                                Object[] objArr62 = new Object[1];
                                e(b18, s5, (byte) (s5 & 40), objArr62);
                                objRemoteActionCompatParcelizer28 = startForeground.read(packedPositionGroup, iArgb2, iLastIndexOf2, -167186806, false, (String) objArr62[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer28).set(null, lValueOf6);
                        } catch (Exception unused4) {
                            throw new RuntimeException();
                        }
                    }
                    int i23 = ((int[]) objArr2[2])[0];
                    int i24 = ((int[]) objArr2[0])[0];
                    if (i24 != i23) {
                        long j8 = -1;
                        long j9 = 0;
                        long j10 = (((long) (i24 ^ i23)) & ((((long) 0) << 32) | (j8 - ((j8 >> 63) << 32)))) | (((long) 1) << 32) | (j9 - ((j9 >> 63) << 32));
                        Object objRemoteActionCompatParcelizer29 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                        if (objRemoteActionCompatParcelizer29 == null) {
                            objRemoteActionCompatParcelizer29 = startForeground.read((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 4535), 6055 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), MotionEvent.axisFromString("") + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                        }
                        Object objInvoke6 = ((Method) objRemoteActionCompatParcelizer29).invoke(null, null);
                        Object[] objArr63 = {-52171697, Long.valueOf(j10), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                        Class cls13 = (Class) startForeground.IconCompatParcelizer((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 6030, (Process.myPid() >> 22) + 24);
                        byte[] bArr11 = $$d;
                        byte b19 = (byte) (bArr11[5] + 1);
                        byte b20 = bArr11[55];
                        Object[] objArr64 = new Object[1];
                        f(b19, b20, (byte) (b20 | 12), objArr64);
                        cls13.getMethod((String) objArr64[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke6, objArr63);
                    }
                    int i25 = IconCompatParcelizer + 123;
                    AudioAttributesCompatParcelizer = i25 % 128;
                    if (i25 % 2 != 0) {
                        return;
                    }
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                } catch (Throwable th10) {
                    Throwable cause8 = th10.getCause();
                    if (cause8 == null) {
                        throw th10;
                    }
                    throw cause8;
                }
            } catch (Throwable th11) {
                Throwable cause9 = th11.getCause();
                if (cause9 == null) {
                    throw th11;
                }
                throw cause9;
            }
        }
    }

    static class c extends Resources {
        public c(Resources resources) {
            super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        }

        @Override // android.content.res.Resources
        public String getString(int i) {
            return "";
        }
    }

    static class b extends PackageManager {
        private final Context a;
        private final PackageManager b;

        public b(Context context) {
            this.a = context;
            this.b = context.getPackageManager();
        }

        @Override // android.content.pm.PackageManager
        public ApplicationInfo getApplicationInfo(String str, int i) throws PackageManager.NameNotFoundException {
            ApplicationInfo applicationInfo = this.b.getApplicationInfo(str, i);
            if (str.equals(this.a.getPackageName()) && (i & 128) == 128) {
                if (((PackageItemInfo) applicationInfo).metaData == null) {
                    ((PackageItemInfo) applicationInfo).metaData = new Bundle();
                }
                ((PackageItemInfo) applicationInfo).metaData.putInt("com.google.android.gms.version", 4323000);
            }
            return applicationInfo;
        }

        @Override // android.content.pm.PackageManager
        public PackageInfo getPackageInfo(String str, int i) throws PackageManager.NameNotFoundException {
            return this.b.getPackageInfo(str, i);
        }

        @Override // android.content.pm.PackageManager
        public void addPackageToPreferred(String str) {
            this.b.addPackageToPreferred(str);
        }

        @Override // android.content.pm.PackageManager
        public boolean addPermission(PermissionInfo permissionInfo) {
            return this.b.addPermission(permissionInfo);
        }

        @Override // android.content.pm.PackageManager
        public boolean addPermissionAsync(PermissionInfo permissionInfo) {
            return this.b.addPermissionAsync(permissionInfo);
        }

        @Override // android.content.pm.PackageManager
        public void addPreferredActivity(IntentFilter intentFilter, int i, ComponentName[] componentNameArr, ComponentName componentName) {
            this.b.addPreferredActivity(intentFilter, i, componentNameArr, componentName);
        }

        @Override // android.content.pm.PackageManager
        public String[] canonicalToCurrentPackageNames(String[] strArr) {
            return this.b.canonicalToCurrentPackageNames(strArr);
        }

        @Override // android.content.pm.PackageManager
        public int checkPermission(String str, String str2) {
            return this.b.checkPermission(str, str2);
        }

        @Override // android.content.pm.PackageManager
        public int checkSignatures(int i, int i2) {
            return this.b.checkSignatures(i, i2);
        }

        @Override // android.content.pm.PackageManager
        public int checkSignatures(String str, String str2) {
            return this.b.checkSignatures(str, str2);
        }

        @Override // android.content.pm.PackageManager
        public void clearPackagePreferredActivities(String str) {
            this.b.clearPackagePreferredActivities(str);
        }

        @Override // android.content.pm.PackageManager
        public String[] currentToCanonicalPackageNames(String[] strArr) {
            return this.b.currentToCanonicalPackageNames(strArr);
        }

        @Override // android.content.pm.PackageManager
        public void extendVerificationTimeout(int i, int i2, long j) {
            this.b.extendVerificationTimeout(i, i2, j);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getActivityIcon(Intent intent) throws PackageManager.NameNotFoundException {
            return this.b.getActivityIcon(intent);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getActivityIcon(ComponentName componentName) throws PackageManager.NameNotFoundException {
            return this.b.getActivityIcon(componentName);
        }

        @Override // android.content.pm.PackageManager
        public ActivityInfo getActivityInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
            return this.b.getActivityInfo(componentName, i);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getActivityLogo(Intent intent) throws PackageManager.NameNotFoundException {
            return this.b.getActivityLogo(intent);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getActivityLogo(ComponentName componentName) throws PackageManager.NameNotFoundException {
            return this.b.getActivityLogo(componentName);
        }

        @Override // android.content.pm.PackageManager
        public List<PermissionGroupInfo> getAllPermissionGroups(int i) {
            return this.b.getAllPermissionGroups(i);
        }

        @Override // android.content.pm.PackageManager
        public int getApplicationEnabledSetting(String str) {
            return this.b.getApplicationEnabledSetting(str);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getApplicationIcon(String str) throws PackageManager.NameNotFoundException {
            return this.b.getApplicationIcon(str);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getApplicationIcon(ApplicationInfo applicationInfo) {
            return this.b.getApplicationIcon(applicationInfo);
        }

        @Override // android.content.pm.PackageManager
        public CharSequence getApplicationLabel(ApplicationInfo applicationInfo) {
            return this.b.getApplicationLabel(applicationInfo);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getApplicationLogo(String str) throws PackageManager.NameNotFoundException {
            return this.b.getApplicationLogo(str);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getApplicationLogo(ApplicationInfo applicationInfo) {
            return this.b.getApplicationLogo(applicationInfo);
        }

        @Override // android.content.pm.PackageManager
        public int getComponentEnabledSetting(ComponentName componentName) {
            return this.b.getComponentEnabledSetting(componentName);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getDefaultActivityIcon() {
            return this.b.getDefaultActivityIcon();
        }

        @Override // android.content.pm.PackageManager
        public Drawable getDrawable(String str, int i, ApplicationInfo applicationInfo) {
            return this.b.getDrawable(str, i, applicationInfo);
        }

        @Override // android.content.pm.PackageManager
        public List<ApplicationInfo> getInstalledApplications(int i) {
            return this.b.getInstalledApplications(i);
        }

        @Override // android.content.pm.PackageManager
        public List<PackageInfo> getInstalledPackages(int i) {
            return this.b.getInstalledPackages(i);
        }

        @Override // android.content.pm.PackageManager
        public String getInstallerPackageName(String str) {
            return this.b.getInstallerPackageName(str);
        }

        @Override // android.content.pm.PackageManager
        public InstrumentationInfo getInstrumentationInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
            return this.b.getInstrumentationInfo(componentName, i);
        }

        @Override // android.content.pm.PackageManager
        public Intent getLaunchIntentForPackage(String str) {
            return this.b.getLaunchIntentForPackage(str);
        }

        @Override // android.content.pm.PackageManager
        public String getNameForUid(int i) {
            return this.b.getNameForUid(i);
        }

        @Override // android.content.pm.PackageManager
        public int[] getPackageGids(String str) throws PackageManager.NameNotFoundException {
            return this.b.getPackageGids(str);
        }

        @Override // android.content.pm.PackageManager
        public String[] getPackagesForUid(int i) {
            return this.b.getPackagesForUid(i);
        }

        @Override // android.content.pm.PackageManager
        public List<PackageInfo> getPackagesHoldingPermissions(String[] strArr, int i) {
            return this.b.getPackagesHoldingPermissions(strArr, i);
        }

        @Override // android.content.pm.PackageManager
        public PermissionGroupInfo getPermissionGroupInfo(String str, int i) throws PackageManager.NameNotFoundException {
            return this.b.getPermissionGroupInfo(str, i);
        }

        @Override // android.content.pm.PackageManager
        public PermissionInfo getPermissionInfo(String str, int i) throws PackageManager.NameNotFoundException {
            return this.b.getPermissionInfo(str, i);
        }

        @Override // android.content.pm.PackageManager
        public int getPreferredActivities(List<IntentFilter> list, List<ComponentName> list2, String str) {
            return this.b.getPreferredActivities(list, list2, str);
        }

        @Override // android.content.pm.PackageManager
        public List<PackageInfo> getPreferredPackages(int i) {
            return this.b.getPreferredPackages(i);
        }

        @Override // android.content.pm.PackageManager
        public ProviderInfo getProviderInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
            return this.b.getProviderInfo(componentName, i);
        }

        @Override // android.content.pm.PackageManager
        public ActivityInfo getReceiverInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
            return this.b.getReceiverInfo(componentName, i);
        }

        @Override // android.content.pm.PackageManager
        public Resources getResourcesForActivity(ComponentName componentName) throws PackageManager.NameNotFoundException {
            return this.b.getResourcesForActivity(componentName);
        }

        @Override // android.content.pm.PackageManager
        public Resources getResourcesForApplication(String str) throws PackageManager.NameNotFoundException {
            return this.b.getResourcesForApplication(str);
        }

        @Override // android.content.pm.PackageManager
        public Resources getResourcesForApplication(ApplicationInfo applicationInfo) throws PackageManager.NameNotFoundException {
            return this.b.getResourcesForApplication(applicationInfo);
        }

        @Override // android.content.pm.PackageManager
        public ServiceInfo getServiceInfo(ComponentName componentName, int i) throws PackageManager.NameNotFoundException {
            return this.b.getServiceInfo(componentName, i);
        }

        @Override // android.content.pm.PackageManager
        public FeatureInfo[] getSystemAvailableFeatures() {
            return this.b.getSystemAvailableFeatures();
        }

        @Override // android.content.pm.PackageManager
        public String[] getSystemSharedLibraryNames() {
            return this.b.getSystemSharedLibraryNames();
        }

        @Override // android.content.pm.PackageManager
        public CharSequence getText(String str, int i, ApplicationInfo applicationInfo) {
            return this.b.getText(str, i, applicationInfo);
        }

        @Override // android.content.pm.PackageManager
        public XmlResourceParser getXml(String str, int i, ApplicationInfo applicationInfo) {
            return this.b.getXml(str, i, applicationInfo);
        }

        @Override // android.content.pm.PackageManager
        public boolean hasSystemFeature(String str) {
            return this.b.hasSystemFeature(str);
        }

        @Override // android.content.pm.PackageManager
        public boolean isSafeMode() {
            return this.b.isSafeMode();
        }

        @Override // android.content.pm.PackageManager
        public List<ResolveInfo> queryBroadcastReceivers(Intent intent, int i) {
            return this.b.queryBroadcastReceivers(intent, i);
        }

        @Override // android.content.pm.PackageManager
        public List<ProviderInfo> queryContentProviders(String str, int i, int i2) {
            return this.b.queryContentProviders(str, i, i2);
        }

        @Override // android.content.pm.PackageManager
        public List<InstrumentationInfo> queryInstrumentation(String str, int i) {
            return this.b.queryInstrumentation(str, i);
        }

        @Override // android.content.pm.PackageManager
        public List<ResolveInfo> queryIntentActivities(Intent intent, int i) {
            return this.b.queryIntentActivities(intent, i);
        }

        @Override // android.content.pm.PackageManager
        public List<ResolveInfo> queryIntentActivityOptions(ComponentName componentName, Intent[] intentArr, Intent intent, int i) {
            return this.b.queryIntentActivityOptions(componentName, intentArr, intent, i);
        }

        @Override // android.content.pm.PackageManager
        public List<ResolveInfo> queryIntentContentProviders(Intent intent, int i) {
            return this.b.queryIntentContentProviders(intent, i);
        }

        @Override // android.content.pm.PackageManager
        public List<ResolveInfo> queryIntentServices(Intent intent, int i) {
            return this.b.queryIntentServices(intent, i);
        }

        @Override // android.content.pm.PackageManager
        public List<PermissionInfo> queryPermissionsByGroup(String str, int i) throws PackageManager.NameNotFoundException {
            return this.b.queryPermissionsByGroup(str, i);
        }

        @Override // android.content.pm.PackageManager
        public void removePackageFromPreferred(String str) {
            this.b.removePackageFromPreferred(str);
        }

        @Override // android.content.pm.PackageManager
        public void removePermission(String str) {
            this.b.removePermission(str);
        }

        @Override // android.content.pm.PackageManager
        public ResolveInfo resolveActivity(Intent intent, int i) {
            return this.b.resolveActivity(intent, i);
        }

        @Override // android.content.pm.PackageManager
        public ProviderInfo resolveContentProvider(String str, int i) {
            return this.b.resolveContentProvider(str, i);
        }

        @Override // android.content.pm.PackageManager
        public ResolveInfo resolveService(Intent intent, int i) {
            return this.b.resolveService(intent, i);
        }

        @Override // android.content.pm.PackageManager
        public void setApplicationEnabledSetting(String str, int i, int i2) {
            this.b.setApplicationEnabledSetting(str, i, i2);
        }

        @Override // android.content.pm.PackageManager
        public void setComponentEnabledSetting(ComponentName componentName, int i, int i2) {
            this.b.setComponentEnabledSetting(componentName, i, i2);
        }

        @Override // android.content.pm.PackageManager
        public void setInstallerPackageName(String str, String str2) {
            this.b.setInstallerPackageName(str, str2);
        }

        @Override // android.content.pm.PackageManager
        public void verifyPendingInstall(int i, int i2) {
            this.b.verifyPendingInstall(i, i2);
        }

        @Override // android.content.pm.PackageManager
        public PackageInstaller getPackageInstaller() {
            return this.b.getPackageInstaller();
        }

        @Override // android.content.pm.PackageManager
        public CharSequence getUserBadgedLabel(CharSequence charSequence, UserHandle userHandle) {
            return this.b.getUserBadgedLabel(charSequence, userHandle);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getUserBadgedDrawableForDensity(Drawable drawable, UserHandle userHandle, Rect rect, int i) {
            return this.b.getUserBadgedDrawableForDensity(drawable, userHandle, rect, i);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getUserBadgedIcon(Drawable drawable, UserHandle userHandle) {
            return this.b.getUserBadgedIcon(drawable, userHandle);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getActivityBanner(Intent intent) throws PackageManager.NameNotFoundException {
            return this.b.getActivityBanner(intent);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getActivityBanner(ComponentName componentName) throws PackageManager.NameNotFoundException {
            return this.b.getActivityBanner(componentName);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getApplicationBanner(ApplicationInfo applicationInfo) {
            return this.b.getApplicationBanner(applicationInfo);
        }

        @Override // android.content.pm.PackageManager
        public Drawable getApplicationBanner(String str) throws PackageManager.NameNotFoundException {
            return this.b.getApplicationBanner(str);
        }

        @Override // android.content.pm.PackageManager
        public Intent getLeanbackLaunchIntentForPackage(String str) {
            return this.b.getLeanbackLaunchIntentForPackage(str);
        }
    }
}
