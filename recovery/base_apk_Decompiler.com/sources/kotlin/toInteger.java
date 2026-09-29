package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
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
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.utils.CharsetNames;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \t2\u00020\u0001:\u0001\tB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/toInteger;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class toInteger extends setOutputSurfaceInfo {
    private static int AudioAttributesCompatParcelizer;
    private static long IconCompatParcelizer;
    private static int MediaBrowserCompatItemReceiver;
    private static char RemoteActionCompatParcelizer;
    private static int read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static final byte[] $$c = {TarConstants.LF_BLK, -62, -101, -125};
    private static final int $$f = TsExtractor.TS_STREAM_TYPE_AC3;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {7, -56, -121, 7, -70, 64, -19, 10, -48, 31, -17, 1, -7, -22, 16, 6, -13, -12, 14, 3, -3, 0, -20, -41, 29, 12, -16, 1, -6, -48, 39, -7, -2, -20, 14, -41, 12, 12, -20, -3, 2, -8, 12, -26, 8, -70, 71, -5, -18, 2, 21, 7, -6, -48, 39, -7, -2, -20, 14, -41, 12, 12, -20, -3, 2, -8, 12, -26, 8};
    private static final int $$h = 73;
    private static final byte[] $$a = {70, -23, 8, 77, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 183;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static int AudioAttributesImplApi26Parcelizer = 0;

    private static String $$i(short s, int i, short s2) {
        byte[] bArr = $$c;
        int i2 = s * 2;
        int i3 = 103 - (i * 2);
        int i4 = 3 - (s2 * 3);
        byte[] bArr2 = new byte[i2 + 1];
        int i5 = -1;
        if (bArr == null) {
            i3 = i2 + (-i4);
            i4 = i4;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i3;
            if (i6 == i2) {
                return new String(bArr2, 0);
            }
            int i7 = i4 + 1;
            i3 += -bArr[i7];
            i4 = i7;
            i5 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r0 = 44 - r5
            int r6 = 191 - r6
            int r7 = r7 + 65
            byte[] r1 = kotlin.toInteger.$$a
            byte[] r0 = new byte[r0]
            int r5 = 43 - r5
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r5) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L20:
            int r3 = r3 + 1
            r4 = r1[r6]
        L24:
            int r4 = -r4
            int r6 = r6 + 1
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.toInteger.c(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = 111 - r6
            int r7 = r7 + 4
            int r0 = r8 + 6
            byte[] r1 = kotlin.toInteger.$$g
            byte[] r0 = new byte[r0]
            int r8 = r8 + 5
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r1[r7]
            r5 = r3
            r3 = r7
            r7 = r5
        L2a:
            int r6 = r6 + r7
            int r6 = r6 + 5
            r7 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.toInteger.d(short, short, byte, java.lang.Object[]):void");
    }

    public toInteger() {
        super((byte) 0);
    }

    /* JADX INFO: renamed from: o.toInteger$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/toInteger$write;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "Landroid/content/Intent;", "write", "(Landroid/content/Context;Ljava/lang/String;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static Intent write(Context p0, String p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Intent intentPutExtra = new Intent(p0, (Class<?>) toInteger.class).putExtra("mcq_display_id", p1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(intentPutExtra, "");
            return intentPutExtra;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private static void b(char[] cArr, char c, char[] cArr2, char[] cArr3, int i, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2;
        int i4 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr.length;
        char[] cArr4 = new char[length];
        int length2 = cArr2.length;
        char[] cArr5 = new char[length2];
        System.arraycopy(cArr, 0, cArr4, 0, length);
        System.arraycopy(cArr2, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr3.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        int i5 = $11 + 9;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i7 = $10 + 85;
            $11 = i7 % 128;
            int i8 = i7 % i3;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (Color.rgb(0, 0, 0) + BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE), 22749 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 36 - TextUtils.getOffsetBefore("", 0), 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (Color.rgb(0, 0, 0) + 16808585), 2721 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 38, 1895162189, false, $$i(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) TextUtils.getTrimmedLength(""), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 15713, 63 - MotionEvent.axisFromString(""), -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    i2 = 2;
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (40976 - ExpandableListView.getPackedPositionGroup(0L)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6122, 28 - ExpandableListView.getPackedPositionChild(0L), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                } else {
                    i2 = 2;
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (IconCompatParcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) AudioAttributesCompatParcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) RemoteActionCompatParcelizer) ^ (-3498762522182953692L)))));
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

    private static void a(int i, boolean z, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i2];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
            int i5 = $11 + 15;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i3 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i7 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(read)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 23703 - Process.getGidForName(""), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 31, -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (44862 - TextUtils.getOffsetBefore("", 0)), TextUtils.lastIndexOf("", '0', 0, 0) + 18945, TextUtils.getCapsMode("", 0, 0) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
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
            cleardownloadmanagerhelpers.write = i;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i2 - cleardownloadmanagerhelpers.write);
        }
        if (z) {
            char[] cArr4 = new char[i2];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            int i8 = $10 + 9;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                int i10 = $11 + 125;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 >> cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) / 0];
                    Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (44862 - Gravity.getAbsoluteGravity(0, 0)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 18944, (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } else {
                    cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                    Object[] objArr5 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) ((KeyEvent.getMaxKeyCode() >> 16) + 44862), (-16758272) - Color.rgb(0, 0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 27, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x00fd  */
    @Override // kotlin.setOutputSurfaceInfo, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r36) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.toInteger.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.setOutputSurfaceInfo, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = AudioAttributesImplBaseParcelizer + 57;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            b(new char[]{40825, 17481, 20775, 44889}, (char) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 22864), new char[]{42286, 62519, 62828, 526}, new char[]{453, 1568, 38046, 62484, 13330, 2778, 16222, 55863, 5849, 55503, 39727, 13896, 53902, 25487, 24957, 54356, 32645, 27503, 41122, 13648, 65258, 57481, 43050, 60378, 60700, 13864}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 36, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(new char[]{29894, 62062, 13060, 47147}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 11024), new char[]{42286, 62519, 62828, 526}, new char[]{16951, 56869, 63428, 5016, 40392, 56924, 17351, 7859, 10338, 41456, 20229, 34474, 54121, 56532, 10913, 14766, 43809, 18070}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = AudioAttributesImplBaseParcelizer + 37;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getEdgeSlop() >> 16)), 6054 - (ViewConfiguration.getScrollDefaultDelay() >> 16), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 6030 - (ViewConfiguration.getFadingEdgeLength() >> 16), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onResume();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x013e  */
    @Override // kotlin.setOutputSurfaceInfo, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 530
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.toInteger.onPause():void");
    }

    @Override // kotlin.setOutputSurfaceInfo, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) throws Throwable {
        Context applicationContext;
        String strValueOf;
        String strValueOf2;
        Object[] objArr;
        Object[] objArr2;
        char c;
        List<Object[]> list;
        int i = 2 % 2;
        super.attachBaseContext(context);
        Object obj = null;
        Object[] objArr3 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 23, true, new char[]{15, 65517, 65483, 16, '\f', 65483, 1, 6, '\f', 15, 1, 11, 65534, 16, 16, 2, 0, '\f'}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 17, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) + 63, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(2) - 35, true, new char[]{5, 65532, 1, 65517, 17}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) - 109, (ViewConfiguration.getFadingEdgeLength() >> 16) + 104, objArr4);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            if (context != null) {
                int i2 = AudioAttributesImplBaseParcelizer + 59;
                MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
                if (i2 % 2 == 0) {
                    boolean z = context instanceof ContextWrapper;
                    obj.hashCode();
                    throw null;
                }
                applicationContext = ((context instanceof ContextWrapper) && ((ContextWrapper) context).getBaseContext() == null) ? null : context.getApplicationContext();
            } else {
                applicationContext = context;
            }
            if (applicationContext != null) {
                int i3 = MediaBrowserCompatCustomActionResultReceiver + 123;
                AudioAttributesImplBaseParcelizer = i3 % 128;
                int i4 = i3 % 2;
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - View.resolveSizeAndState(0, 0, 0)), 6054 - (ViewConfiguration.getWindowTouchSlop() >> 8), ImageFormat.getBitsPerPixel(0) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr5 = new Object[1];
                    a((ViewConfiguration.getTouchSlop() >> 8) + 6, false, new char[]{65518, 65514, 65517, 65518, 27, 26, 24, 65514, 65509, 27, 24, 25, 22, 23, 65513, 65515, 65512, 65518, 26, 27, 25, 65514, 65509, 26, 24, 65509, 65512, 26, 27, 65518, 65517, 27, 65513, 22, 65512, 65510, 65511, 65509, 26, 65511, 65515, 26, 23, 24, 23, 65516, 25, 65512}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 38, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 74, objArr5);
                    String str = (String) objArr5[0];
                    Object[] objArr6 = new Object[1];
                    b(new char[]{9440, 53207, 14477, 23545}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 4), new char[]{42286, 62519, 62828, 526}, new char[]{28939, 55549, 1623, 16532, 27523, 17781, 31101, 64358, 45613, 27837, 36809, 21597, 38094, 63014, 58105, 54895, 17804, 7928, 61628, 35068, 52092, 62655, 22945, 30570, 27106, 32221, 20592, 20289, 55934, 54288, 16311, 62140, 48305, 29303, 58310, 28870, 41291, 52233, 13463, 31167, 15414, 30892, 44646, 2449, 43574, 34457, 10026, 41564, 19525, 65397, 5637, 1189, 11419, 30471, 49741, 26448, 5995, 27656, 62066, 38148, 54242, 24270, 11087, 3926}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4, objArr6);
                    String str2 = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    b(new char[]{61082, 31220, 10821, 48724}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) - 37), new char[]{42286, 62519, 62828, 526}, new char[]{30523, 28511, 28656, 45053, 23693, 4576, 30681, 34395, 41782, 24987, 41962, 36153, 9734, 36590, 15275, 3727, 33143, 44417, 64067, 25495, 1270, 38319, 1519, 17802, 23580, 38055, 3691, 3487, 28142, 16458, 10080, 24413, 22913, 3557, 10709, 19895, 31418, 57819, 57936, 56584, 38771, 33602, 17544, 50866, 30110, 21719, 26703, 10895, 21960, 37306, 2483, 61641, 44621, 8329, 13801, 32946, 29201, 23319, 52419, 6067, 49462, 20765, 51091, 28873}, KeyEvent.keyCodeFromString(""), objArr7);
                    String str3 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 10, false, new char[]{65484, 1, '\r', 11, 65485, 65535, 14, 7, 65485, 7, '\f', 5, 3, 17, 18, 65485, 20, 65488, 65485, 3, 20, 3, '\f', 18, 17, 6, 18, 18, 14, 17, 65496, 65485, 65485, 2, 65535, 7, '\n', 23, 16, '\r', 19, '\f', 2, 17, 65484, 18, 6, 16, 3, 65535, 18, 1, 65535, 17, 18, 65484, 5, 19, 65535, 16, 2, 17, 15, 19, 65535, 16, 3}, KeyEvent.normalizeMetaState(0) + 67, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 63, objArr8);
                    String str4 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b(new char[]{39445, 20962, 902, 5793}, (char) (41219 - ExpandableListView.getPackedPositionType(0L)), new char[]{42286, 62519, 62828, 526}, new char[]{11703, 37642, 51722, 6348, 11208, 60556}, View.getDefaultSize(0, 0), objArr9);
                    String str5 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1, false, new char[]{65522, 65521, '\"', 65527, 65526, 65522, 65521, 65521, 65517, 65528, '&', 65528, '&', 65517, 65524, 65526, 65524, 65527, 65517, 65529, '\"', 65522, 65520, 65517, '&', 65527, '!', 65522, 65527, '%', '#', '&', 65521, '!', 65526, 65526}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 35, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 33, objArr10);
                    Object[] objArr11 = {applicationContext, str, str2, str3, str4, true, str5, (String) objArr10[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 6030, 24 - TextUtils.indexOf("", "", 0), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
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
                    char pressedStateDuration = (char) (61148 - (ViewConfiguration.getPressedStateDuration() >> 16));
                    int mirror = AndroidCharacter.getMirror('0') + 2097;
                    int i5 = 12 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                    byte[] bArr = $$a;
                    Object[] objArr12 = new Object[1];
                    c((byte) (bArr[61] - 1), (short) (bArr[3] + 1), (byte) (-bArr[9]), objArr12);
                    objRemoteActionCompatParcelizer3 = startForeground.read(pressedStateDuration, mirror, i5, -2136739198, false, (String) objArr12[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-629126231);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char c2 = (char) (61148 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 2145;
                        int maximumDrawingCacheSize = 12 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                        byte[] bArr2 = $$a;
                        Object[] objArr13 = new Object[1];
                        c(bArr2[19], (short) 75, bArr2[113], objArr13);
                        objRemoteActionCompatParcelizer4 = startForeground.read(c2, scrollBarFadeDuration, maximumDrawingCacheSize, -1530294468, false, (String) objArr13[0], null);
                    }
                    list = (List) ((Field) objRemoteActionCompatParcelizer4).get(null);
                } else {
                    Object[] objArr14 = new Object[1];
                    b(new char[]{22142, 4332, 11897, 5571}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) + 49852), new char[]{42286, 62519, 62828, 526}, new char[]{45852, 24695, 27460, 4901, 20920, 38359, 47516, 45155, 54128, 49755, 9349, 5904, 11069, 48162, 40951, 7284}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 4, objArr14);
                    Class<?> cls2 = Class.forName((String) objArr14[0]);
                    Object[] objArr15 = new Object[1];
                    b(new char[]{61526, 45490, 52332, 28730}, (char) (15052 - TextUtils.getTrimmedLength("")), new char[]{42286, 62519, 62828, 526}, new char[]{27961, 32432, 31575, 12659, 30806, 54468, 57475, 5553, 29300, 51607, 41293, 10748, 59674, 1799, 42255, 7614}, TextUtils.indexOf("", "", 0), objArr15);
                    int iIntValue2 = ((Integer) cls2.getMethod((String) objArr15[0], Object.class).invoke(null, this)).intValue();
                    try {
                        Object[] objArr16 = {1599871411};
                        Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-173351824);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            objRemoteActionCompatParcelizer5 = startForeground.read((char) ((Process.myTid() >> 22) + 45845), Color.argb(0, 0, 0, 0) + 913, 10 - TextUtils.getOffsetBefore("", 0), -1948051227, false, null, new Class[]{Integer.TYPE});
                        }
                        try {
                            Object[] objArr17 = {Integer.valueOf(iIntValue2), ((Constructor) objRemoteActionCompatParcelizer5).newInstance(objArr16)};
                            Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(1891595430);
                            if (objRemoteActionCompatParcelizer6 == null) {
                                char deadChar = (char) (KeyEvent.getDeadChar(0, 0) + 61148);
                                int maxKeyCode = 2145 - (KeyEvent.getMaxKeyCode() >> 16);
                                int iAlpha = 12 - Color.alpha(0);
                                byte[] bArr3 = $$a;
                                Object[] objArr18 = new Object[1];
                                c((byte) 24, bArr3[15], bArr3[2], objArr18);
                                objRemoteActionCompatParcelizer6 = startForeground.read(deadChar, maxKeyCode, iAlpha, 251047987, false, (String) objArr18[0], new Class[]{Integer.TYPE, (Class) startForeground.IconCompatParcelizer((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 557 - TextUtils.indexOf("", "", 0), (ViewConfiguration.getTapTimeout() >> 16) + 18)});
                            }
                            list = (List) ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr17);
                            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-629126231);
                            if (objRemoteActionCompatParcelizer7 == null) {
                                char bitsPerPixel = (char) (61147 - ImageFormat.getBitsPerPixel(0));
                                int scrollDefaultDelay = (ViewConfiguration.getScrollDefaultDelay() >> 16) + 2145;
                                int minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 12;
                                byte[] bArr4 = $$a;
                                Object[] objArr19 = new Object[1];
                                c(bArr4[19], (short) 75, bArr4[113], objArr19);
                                objRemoteActionCompatParcelizer7 = startForeground.read(bitsPerPixel, scrollDefaultDelay, minimumFlingVelocity, -1530294468, false, (String) objArr19[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer7).set(null, list);
                            Object[] objArr20 = new Object[1];
                            b(new char[]{36554, 37050, 30631, 13409}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 10), new char[]{42286, 62519, 62828, 526}, new char[]{64525, 47956, 301, 41137, 53145, 18371, 52453, 3130, 37634, 57521, 7486, 37817, 27163, 57259, 11949, 58346, 61933, 29261, 45174, 17259, 12068, 46577}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, objArr20);
                            Class<?> cls3 = Class.forName((String) objArr20[0]);
                            Object[] objArr21 = new Object[1];
                            a(Color.blue(0) + 6, false, new char[]{65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 11, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 93, objArr21);
                            long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr21[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf = Long.valueOf(jLongValue);
                            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(301834150);
                            if (objRemoteActionCompatParcelizer8 == null) {
                                char maximumFlingVelocity = (char) (61148 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                                int i6 = (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 2144;
                                int iRed = 12 - Color.red(0);
                                byte[] bArr5 = $$a;
                                byte b = bArr5[45];
                                short s = bArr5[33];
                                Object[] objArr22 = new Object[1];
                                c(b, s, (byte) (s & 117), objArr22);
                                objRemoteActionCompatParcelizer8 = startForeground.read(maximumFlingVelocity, i6, iRed, 1874090803, false, (String) objArr22[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer8).set(null, lValueOf);
                            Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                            Object objRemoteActionCompatParcelizer9 = startForeground.RemoteActionCompatParcelizer(-18205161);
                            if (objRemoteActionCompatParcelizer9 == null) {
                                char windowTouchSlop = (char) (61148 - (ViewConfiguration.getWindowTouchSlop() >> 8));
                                int threadPriority = ((Process.getThreadPriority(0) + 20) >> 6) + 2145;
                                int mode = 12 - View.MeasureSpec.getMode(0);
                                byte[] bArr6 = $$a;
                                Object[] objArr23 = new Object[1];
                                c((byte) (bArr6[61] - 1), (short) (bArr6[3] + 1), (byte) (-bArr6[9]), objArr23);
                                objRemoteActionCompatParcelizer9 = startForeground.read(windowTouchSlop, threadPriority, mode, -2136739198, false, (String) objArr23[0], null);
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
                            for (String str6 : strArr) {
                                arrayList.add(str6);
                            }
                        }
                        long j = -1;
                        long j2 = ((long) (i8 ^ i7)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
                        long j3 = 0;
                        long j4 = j2 | (((long) 10) << 32) | (j3 - ((j3 >> 63) << 32));
                        try {
                            Object objRemoteActionCompatParcelizer10 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                            if (objRemoteActionCompatParcelizer10 == null) {
                                objRemoteActionCompatParcelizer10 = startForeground.read((char) (4534 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), 6053 - TextUtils.lastIndexOf("", '0'), ExpandableListView.getPackedPositionChild(0L) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                            }
                            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer10).invoke(null, null);
                            try {
                                Object[] objArr25 = {1599871411, Long.valueOf(j4), arrayList, TrainingApplication.RemoteActionCompatParcelizer(), false};
                                Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), Gravity.getAbsoluteGravity(0, 0) + 6030, Color.green(0) + 24);
                                byte[] bArr7 = $$g;
                                Object[] objArr26 = new Object[1];
                                d(bArr7[24], (byte) (-bArr7[16]), (byte) (-bArr7[13]), objArr26);
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
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 31, true, new char[]{65535, 4, 65533, 65535, 65531, 1, 4, 65533, 2, 1, 4}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) - 25, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 18, objArr27);
            String str7 = (String) objArr27[0];
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
            arrayList2.add(str7);
            Object objRemoteActionCompatParcelizer11 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer11 == null) {
                objRemoteActionCompatParcelizer11 = startForeground.read((char) (4535 - KeyEvent.keyCodeFromString("")), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6054, 42 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke3 = ((Method) objRemoteActionCompatParcelizer11).invoke(null, null);
            Object[] objArr28 = {1599871411, 81604378625L, arrayList2, TrainingApplication.RemoteActionCompatParcelizer(), false};
            Class cls5 = (Class) startForeground.IconCompatParcelizer((char) ((-1) - MotionEvent.axisFromString("")), 6030 - View.MeasureSpec.getSize(0), Color.red(0) + 24);
            byte[] bArr8 = $$g;
            Object[] objArr29 = new Object[1];
            d(bArr8[24], (byte) (-bArr8[16]), (byte) (-bArr8[13]), objArr29);
            cls5.getMethod((String) objArr29[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke3, objArr28);
        }
        Context applicationContext2 = context;
        try {
            if (applicationContext2 != null) {
                int i9 = AudioAttributesImplBaseParcelizer + 89;
                MediaBrowserCompatCustomActionResultReceiver = i9 % 128;
                if (i9 % 2 == 0) {
                    boolean z2 = applicationContext2 instanceof ContextWrapper;
                    throw null;
                }
                applicationContext2 = (!((applicationContext2 instanceof ContextWrapper) ^ true) && ((ContextWrapper) applicationContext2).getBaseContext() == null) ? null : context.getApplicationContext();
            }
        } catch (Throwable th8) {
            Object[] objArr30 = new Object[1];
            a(View.resolveSizeAndState(0, 0, 0) + 7, false, new char[]{0, 65535, 3, 4, 2, 65534, 0, 4, 65533, 2, 65532}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 10, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 48, objArr30);
            String str8 = (String) objArr30[0];
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
            arrayList3.add(str8);
            Object objRemoteActionCompatParcelizer12 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer12 == null) {
                objRemoteActionCompatParcelizer12 = startForeground.read((char) ((ViewConfiguration.getScrollDefaultDelay() >> 16) + 4535), 6054 - TextUtils.getTrimmedLength(""), 42 - TextUtils.indexOf("", "", 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke4 = ((Method) objRemoteActionCompatParcelizer12).invoke(null, null);
            Object[] objArr31 = {1599871411, 81604378625L, arrayList3, TrainingApplication.RemoteActionCompatParcelizer(), false};
            Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 6030 - View.resolveSizeAndState(0, 0, 0), Color.rgb(0, 0, 0) + 16777240);
            byte[] bArr9 = $$g;
            Object[] objArr32 = new Object[1];
            d(bArr9[24], (byte) (-bArr9[16]), (byte) (-bArr9[13]), objArr32);
            cls6.getMethod((String) objArr32[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke4, objArr31);
        }
        try {
            Object[] objArr33 = {1599871411};
            Object objRemoteActionCompatParcelizer13 = startForeground.RemoteActionCompatParcelizer(-1128409246);
            if (objRemoteActionCompatParcelizer13 == null) {
                objRemoteActionCompatParcelizer13 = startForeground.read((char) (1 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 1992 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 12 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1024191497, false, null, new Class[]{Integer.TYPE});
            }
            try {
                Object[] objArr34 = {applicationContext2, ((Constructor) objRemoteActionCompatParcelizer13).newInstance(objArr33)};
                Object objRemoteActionCompatParcelizer14 = startForeground.RemoteActionCompatParcelizer(352975618);
                if (objRemoteActionCompatParcelizer14 == null) {
                    char maximumFlingVelocity2 = (char) (19323 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                    int tapTimeout = 2759 - (ViewConfiguration.getTapTimeout() >> 16);
                    int fadingEdgeLength = (ViewConfiguration.getFadingEdgeLength() >> 16) + 99;
                    byte[] bArr10 = $$a;
                    byte b2 = bArr10[45];
                    short s2 = bArr10[33];
                    Object[] objArr35 = new Object[1];
                    c(b2, s2, (byte) (s2 & 117), objArr35);
                    objRemoteActionCompatParcelizer14 = startForeground.read(maximumFlingVelocity2, tapTimeout, fadingEdgeLength, 1799372695, false, (String) objArr35[0], new Class[]{Context.class, (Class) startForeground.IconCompatParcelizer((char) (9580 - (ViewConfiguration.getTouchSlop() >> 8)), View.getDefaultSize(0, 0) + 3446, 145 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)))});
                }
                ((Method) objRemoteActionCompatParcelizer14).invoke(null, objArr34);
                Object objRemoteActionCompatParcelizer15 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                if (objRemoteActionCompatParcelizer15 == null) {
                    char absoluteGravity = (char) (13183 - Gravity.getAbsoluteGravity(0, 0));
                    int iAlpha2 = Color.alpha(0) + 1649;
                    int iNormalizeMetaState = 26 - KeyEvent.normalizeMetaState(0);
                    byte b3 = $$a[5];
                    Object[] objArr36 = new Object[1];
                    c(b3, (short) (b3 | 187), r1[113], objArr36);
                    objRemoteActionCompatParcelizer15 = startForeground.read(absoluteGravity, iAlpha2, iNormalizeMetaState, -133433128, false, (String) objArr36[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer15).getLong(null) != -1) {
                    Object objRemoteActionCompatParcelizer16 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                    if (objRemoteActionCompatParcelizer16 == null) {
                        char bitsPerPixel2 = (char) (ImageFormat.getBitsPerPixel(0) + 13184);
                        int i10 = 1650 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                        int keyRepeatDelay = 26 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                        byte[] bArr11 = $$a;
                        Object[] objArr37 = new Object[1];
                        c(bArr11[30], (short) ($$b & 984), bArr11[5], objArr37);
                        objRemoteActionCompatParcelizer16 = startForeground.read(bitsPerPixel2, i10, keyRepeatDelay, -1033747278, false, (String) objArr37[0], null);
                    }
                    objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer16).get(null);
                } else {
                    Object[] objArr38 = new Object[1];
                    b(new char[]{22142, 4332, 11897, 5571}, (char) ((Process.myTid() >> 22) + 49966), new char[]{42286, 62519, 62828, 526}, new char[]{45852, 24695, 27460, 4901, 20920, 38359, 47516, 45155, 54128, 49755, 9349, 5904, 11069, 48162, 40951, 7284}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 49, objArr38);
                    Class<?> cls7 = Class.forName((String) objArr38[0]);
                    Object[] objArr39 = new Object[1];
                    b(new char[]{61526, 45490, 52332, 28730}, (char) (15052 - (ViewConfiguration.getPressedStateDuration() >> 16)), new char[]{42286, 62519, 62828, 526}, new char[]{27961, 32432, 31575, 12659, 30806, 54468, 57475, 5553, 29300, 51607, 41293, 10748, 59674, 1799, 42255, 7614}, View.getDefaultSize(0, 0), objArr39);
                    try {
                        Object[] objArr40 = {Integer.valueOf(((Integer) cls7.getMethod((String) objArr39[0], Object.class).invoke(null, this)).intValue()), 0, -2075898896};
                        byte[] bArr12 = $$g;
                        byte b4 = bArr12[21];
                        byte b5 = b4;
                        Object[] objArr41 = new Object[1];
                        d(b5, (byte) (b5 | 40), b4, objArr41);
                        Class<?> cls8 = Class.forName((String) objArr41[0]);
                        Object[] objArr42 = new Object[1];
                        d((byte) (bArr12[30] - 1), (byte) 45, bArr12[18], objArr42);
                        objArr = (Object[]) cls8.getMethod((String) objArr42[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr40);
                        Object objRemoteActionCompatParcelizer17 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                        if (objRemoteActionCompatParcelizer17 == null) {
                            char edgeSlop = (char) ((ViewConfiguration.getEdgeSlop() >> 16) + 13183);
                            int scrollBarFadeDuration2 = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 1649;
                            int packedPositionType = ExpandableListView.getPackedPositionType(0L) + 26;
                            byte[] bArr13 = $$a;
                            Object[] objArr43 = new Object[1];
                            c(bArr13[30], (short) ($$b & 984), bArr13[5], objArr43);
                            objRemoteActionCompatParcelizer17 = startForeground.read(edgeSlop, scrollBarFadeDuration2, packedPositionType, -1033747278, false, (String) objArr43[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer17).set(null, objArr);
                        try {
                            Object[] objArr44 = new Object[1];
                            b(new char[]{36554, 37050, 30631, 13409}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 109), new char[]{42286, 62519, 62828, 526}, new char[]{64525, 47956, 301, 41137, 53145, 18371, 52453, 3130, 37634, 57521, 7486, 37817, 27163, 57259, 11949, 58346, 61933, 29261, 45174, 17259, 12068, 46577}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4, objArr44);
                            Class<?> cls9 = Class.forName((String) objArr44[0]);
                            Object[] objArr45 = new Object[1];
                            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 29, false, new char[]{65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 5, 151 - AndroidCharacter.getMirror('0'), objArr45);
                            long jLongValue2 = ((Long) cls9.getDeclaredMethod((String) objArr45[0], new Class[0]).invoke(null, new Object[0])).longValue();
                            Long lValueOf3 = Long.valueOf(jLongValue2);
                            Object objRemoteActionCompatParcelizer18 = startForeground.RemoteActionCompatParcelizer(2104791916);
                            if (objRemoteActionCompatParcelizer18 == null) {
                                char c3 = (char) (13184 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)));
                                int iIndexOf = TextUtils.indexOf((CharSequence) "", '0', 0) + 1650;
                                int edgeSlop2 = 26 - (ViewConfiguration.getEdgeSlop() >> 16);
                                byte b6 = $$a[30];
                                Object[] objArr46 = new Object[1];
                                c(b6, (short) (b6 | 101), r8[5], objArr46);
                                objRemoteActionCompatParcelizer18 = startForeground.read(c3, iIndexOf, edgeSlop2, 54351865, false, (String) objArr46[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer18).set(null, lValueOf3);
                            Long lValueOf4 = Long.valueOf(jLongValue2 >> 12);
                            Object objRemoteActionCompatParcelizer19 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                            if (objRemoteActionCompatParcelizer19 == null) {
                                char maximumDrawingCacheSize2 = (char) (13183 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24));
                                int i11 = 1650 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                                int iIndexOf2 = 25 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                                byte b7 = $$a[5];
                                Object[] objArr47 = new Object[1];
                                c(b7, (short) (b7 | 187), r5[113], objArr47);
                                objRemoteActionCompatParcelizer19 = startForeground.read(maximumDrawingCacheSize2, i11, iIndexOf2, -133433128, false, (String) objArr47[0], null);
                            }
                            ((Field) objRemoteActionCompatParcelizer19).set(null, lValueOf4);
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
                int i12 = ((int[]) objArr[3])[0];
                int i13 = ((int[]) objArr[2])[0];
                if (i13 != i12) {
                    long j5 = -1;
                    long j6 = ((long) (i13 ^ i12)) & ((((long) 0) << 32) | (j5 - ((j5 >> 63) << 32)));
                    long j7 = 0;
                    long j8 = (((long) 2) << 32) | (j7 - ((j7 >> 63) << 32)) | j6;
                    Object objRemoteActionCompatParcelizer20 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer20 == null) {
                        objRemoteActionCompatParcelizer20 = startForeground.read((char) (4536 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 6054, KeyEvent.normalizeMetaState(0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke5 = ((Method) objRemoteActionCompatParcelizer20).invoke(null, null);
                    Object[] objArr48 = {1599871411, Long.valueOf(j8), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls10 = (Class) startForeground.IconCompatParcelizer((char) View.resolveSize(0, 0), 6030 - TextUtils.indexOf("", "", 0), 24 - TextUtils.getOffsetBefore("", 0));
                    byte[] bArr14 = $$g;
                    Object[] objArr49 = new Object[1];
                    d(bArr14[24], (byte) (-bArr14[16]), (byte) (-bArr14[13]), objArr49);
                    cls10.getMethod((String) objArr49[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke5, objArr48);
                }
                Object objRemoteActionCompatParcelizer21 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                if (objRemoteActionCompatParcelizer21 == null) {
                    char c4 = (char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                    int i14 = (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 942;
                    int iArgb = 36 - Color.argb(0, 0, 0, 0);
                    byte[] bArr15 = $$a;
                    Object[] objArr50 = new Object[1];
                    c((byte) (bArr15[61] - 1), (short) (bArr15[3] + 1), (byte) (-bArr15[9]), objArr50);
                    objRemoteActionCompatParcelizer21 = startForeground.read(c4, i14, iArgb, -167186806, false, (String) objArr50[0], null);
                }
                if (((Field) objRemoteActionCompatParcelizer21).getLong(null) != -1) {
                    int i15 = MediaBrowserCompatCustomActionResultReceiver + 101;
                    AudioAttributesImplBaseParcelizer = i15 % 128;
                    if (i15 % 2 != 0) {
                        Object objRemoteActionCompatParcelizer22 = startForeground.RemoteActionCompatParcelizer(-757676623);
                        if (objRemoteActionCompatParcelizer22 == null) {
                            char doubleTapTimeout = (char) (ViewConfiguration.getDoubleTapTimeout() >> 16);
                            int absoluteGravity2 = Gravity.getAbsoluteGravity(0, 0) + 943;
                            int i16 = 37 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                            byte[] bArr16 = $$a;
                            Object[] objArr51 = new Object[1];
                            c(bArr16[19], (short) 75, bArr16[113], objArr51);
                            objRemoteActionCompatParcelizer22 = startForeground.read(doubleTapTimeout, absoluteGravity2, i16, -1398865628, false, (String) objArr51[0], null);
                        }
                        throw null;
                    }
                    Object objRemoteActionCompatParcelizer23 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer23 == null) {
                        char cCombineMeasuredStates = (char) View.combineMeasuredStates(0, 0);
                        int modifierMetaStateMask = 942 - ((byte) KeyEvent.getModifierMetaStateMask());
                        int iMyTid = (Process.myTid() >> 22) + 36;
                        byte[] bArr17 = $$a;
                        Object[] objArr52 = new Object[1];
                        c(bArr17[19], (short) 75, bArr17[113], objArr52);
                        objRemoteActionCompatParcelizer23 = startForeground.read(cCombineMeasuredStates, modifierMetaStateMask, iMyTid, -1398865628, false, (String) objArr52[0], null);
                    }
                    objArr2 = (Object[]) ((Field) objRemoteActionCompatParcelizer23).get(null);
                    c = 2;
                } else {
                    Object[] objArr53 = new Object[1];
                    b(new char[]{22142, 4332, 11897, 5571}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 49931), new char[]{42286, 62519, 62828, 526}, new char[]{45852, 24695, 27460, 4901, 20920, 38359, 47516, 45155, 54128, 49755, 9349, 5904, 11069, 48162, 40951, 7284}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1, objArr53);
                    Class<?> cls11 = Class.forName((String) objArr53[0]);
                    Object[] objArr54 = new Object[1];
                    b(new char[]{61526, 45490, 52332, 28730}, (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 15052), new char[]{42286, 62519, 62828, 526}, new char[]{27961, 32432, 31575, 12659, 30806, 54468, 57475, 5553, 29300, 51607, 41293, 10748, 59674, 1799, 42255, 7614}, (Process.getThreadPriority(0) + 20) >> 6, objArr54);
                    Object[] objArr55 = {Integer.valueOf(((Integer) cls11.getMethod((String) objArr54[0], Object.class).invoke(null, this)).intValue()), 0, -213454001};
                    Object objRemoteActionCompatParcelizer24 = startForeground.RemoteActionCompatParcelizer(-21191141);
                    if (objRemoteActionCompatParcelizer24 == null) {
                        char cMakeMeasureSpec = (char) View.MeasureSpec.makeMeasureSpec(0, 0);
                        int iAxisFromString = 942 - MotionEvent.axisFromString("");
                        int packedPositionGroup = 36 - ExpandableListView.getPackedPositionGroup(0L);
                        byte[] bArr18 = $$a;
                        byte b8 = bArr18[13];
                        short s3 = bArr18[5];
                        Object[] objArr56 = new Object[1];
                        c(b8, s3, (byte) s3, objArr56);
                        objRemoteActionCompatParcelizer24 = startForeground.read(cMakeMeasureSpec, iAxisFromString, packedPositionGroup, -2131402098, false, (String) objArr56[0], new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    objArr2 = (Object[]) ((Method) objRemoteActionCompatParcelizer24).invoke(null, objArr55);
                    Object objRemoteActionCompatParcelizer25 = startForeground.RemoteActionCompatParcelizer(-757676623);
                    if (objRemoteActionCompatParcelizer25 == null) {
                        char c5 = (char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        int i17 = 942 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                        int minimumFlingVelocity2 = (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 36;
                        byte[] bArr19 = $$a;
                        Object[] objArr57 = new Object[1];
                        c(bArr19[19], (short) 75, bArr19[113], objArr57);
                        objRemoteActionCompatParcelizer25 = startForeground.read(c5, i17, minimumFlingVelocity2, -1398865628, false, (String) objArr57[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer25).set(null, objArr2);
                    try {
                        Object[] objArr58 = new Object[1];
                        b(new char[]{36554, 37050, 30631, 13409}, (char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), new char[]{42286, 62519, 62828, 526}, new char[]{64525, 47956, 301, 41137, 53145, 18371, 52453, 3130, 37634, 57521, 7486, 37817, 27163, 57259, 11949, 58346, 61933, 29261, 45174, 17259, 12068, 46577}, TextUtils.getOffsetAfter("", 0), objArr58);
                        Class<?> cls12 = Class.forName((String) objArr58[0]);
                        Object[] objArr59 = new Object[1];
                        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) - 105, false, new char[]{65530, 5, '\r', 2, 6, 65534, 65534, 5, 65530, '\t', '\f', 65534, 65533, 65515, 65534}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 20, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 93, objArr59);
                        long jLongValue3 = ((Long) cls12.getDeclaredMethod((String) objArr59[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf5 = Long.valueOf(jLongValue3);
                        Object objRemoteActionCompatParcelizer26 = startForeground.RemoteActionCompatParcelizer(-1539638354);
                        if (objRemoteActionCompatParcelizer26 == null) {
                            char maximumDrawingCacheSize3 = (char) (ViewConfiguration.getMaximumDrawingCacheSize() >> 24);
                            int bitsPerPixel3 = ImageFormat.getBitsPerPixel(0) + 944;
                            int i18 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 35;
                            byte[] bArr20 = $$a;
                            byte b9 = bArr20[45];
                            short s4 = bArr20[33];
                            Object[] objArr60 = new Object[1];
                            c(b9, s4, (byte) (s4 & 117), objArr60);
                            objRemoteActionCompatParcelizer26 = startForeground.read(maximumDrawingCacheSize3, bitsPerPixel3, i18, -629981381, false, (String) objArr60[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer26).set(null, lValueOf5);
                        Long lValueOf6 = Long.valueOf(jLongValue3 >> 12);
                        Object objRemoteActionCompatParcelizer27 = startForeground.RemoteActionCompatParcelizer(-2008995297);
                        if (objRemoteActionCompatParcelizer27 == null) {
                            int keyRepeatDelay2 = 943 - (ViewConfiguration.getKeyRepeatDelay() >> 16);
                            int longPressTimeout = (ViewConfiguration.getLongPressTimeout() >> 16) + 36;
                            byte[] bArr21 = $$a;
                            Object[] objArr61 = new Object[1];
                            c((byte) (bArr21[61] - 1), (short) (bArr21[3] + 1), (byte) (-bArr21[9]), objArr61);
                            objRemoteActionCompatParcelizer27 = startForeground.read((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), keyRepeatDelay2, longPressTimeout, -167186806, false, (String) objArr61[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer27).set(null, lValueOf6);
                        int i19 = AudioAttributesImplBaseParcelizer + 35;
                        MediaBrowserCompatCustomActionResultReceiver = i19 % 128;
                        c = 2;
                        int i20 = i19 % 2;
                    } catch (Exception unused4) {
                        throw new RuntimeException();
                    }
                }
                int i21 = ((int[]) objArr2[c])[0];
                int i22 = ((int[]) objArr2[0])[0];
                if (i22 != i21) {
                    long j9 = -1;
                    long j10 = 0;
                    long j11 = (((long) (i22 ^ i21)) & ((((long) 0) << 32) | (j9 - ((j9 >> 63) << 32)))) | (((long) 1) << 32) | (j10 - ((j10 >> 63) << 32));
                    Object objRemoteActionCompatParcelizer28 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer28 == null) {
                        objRemoteActionCompatParcelizer28 = startForeground.read((char) (View.MeasureSpec.getMode(0) + 4535), 6054 - TextUtils.indexOf("", "", 0), TextUtils.indexOf("", "", 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke6 = ((Method) objRemoteActionCompatParcelizer28).invoke(null, null);
                    Object[] objArr62 = {1599871411, Long.valueOf(j11), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls13 = (Class) startForeground.IconCompatParcelizer((char) (Process.myPid() >> 22), (KeyEvent.getMaxKeyCode() >> 16) + 6030, Color.alpha(0) + 24);
                    byte[] bArr22 = $$g;
                    Object[] objArr63 = new Object[1];
                    d(bArr22[24], (byte) (-bArr22[16]), (byte) (-bArr22[13]), objArr63);
                    cls13.getMethod((String) objArr63[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke6, objArr62);
                }
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

    static {
        MediaBrowserCompatItemReceiver = 1;
        MediaBrowserCompatCustomActionResultReceiver();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplApi26Parcelizer + 61;
        MediaBrowserCompatItemReceiver = i % 128;
        int i2 = i % 2;
    }

    @getMagicModuleMeta
    public static final Intent read(Context context, String str) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 89;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Intent intentWrite = Companion.write(context, str);
        if (i3 != 0) {
            int i4 = 30 / 0;
        }
        return intentWrite;
    }

    @Override // kotlin.setOutputSurfaceInfo, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 121;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 75;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    static void MediaBrowserCompatCustomActionResultReceiver() {
        read = 1000326203;
        IconCompatParcelizer = -3639168632134406134L;
        AudioAttributesCompatParcelizer = -136981212;
        RemoteActionCompatParcelizer = (char) 54564;
    }
}
