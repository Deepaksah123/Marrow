package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class showGooglePlayUnavailableMessage extends addObserverForBackInvoker implements SubjectStat {
    private volatile isHighlighted IconCompatParcelizer;
    private getSubjectStat RemoteActionCompatParcelizer;
    private boolean read;
    private final Object write;
    private static final byte[] $$c = {10, -58, 112, 6};
    private static final int $$f = 235;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {37, -1, TarConstants.LF_CONTIG, -26, 61, -35, -28, -3, -9, 4, 26, -48, 7, -5, -2, 9, -23, 1, -5, -14, 25, -23, -13, 6, -5, -17, 9, -17, 43, -48, 7, -5, -2, 18, -24, -27, 30, -15, -15, -13, 12, -18, 9, 0, -7, -23, -12, -6, -9, 11, 32, -38, -21, 7, -10, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17, 61, -61, -2, -19, 34, -27, -19, -7, 4, -7, 3, 19, -41, 5, 7, 27, -48, -1, -2, 38, -48, -3, -4, 5, -2, -21, 7, -17, 9, -15, -9, 40, -24, -17, 9, -10, -2, -17, 1, 5, -15, 11};
    private static final int $$h = 10;
    private static final byte[] $$a = {121, 72, 116, 113, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 52;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static int AudioAttributesCompatParcelizer = 1000326262;
    private static long AudioAttributesImplBaseParcelizer = -5606772025023202655L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(int r6, short r7, short r8) {
        /*
            int r6 = r6 * 2
            int r6 = 121 - r6
            int r7 = r7 * 4
            int r0 = r7 + 1
            int r8 = r8 + 4
            byte[] r1 = kotlin.showGooglePlayUnavailableMessage.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2b
        L14:
            r3 = r2
        L15:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            return r6
        L22:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r6 = -r6
            int r6 = r6 + r8
            r8 = r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.showGooglePlayUnavailableMessage.$$i(int, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = 44 - r7
            byte[] r1 = kotlin.showGooglePlayUnavailableMessage.$$a
            int r6 = r6 + 4
            int r5 = r5 + 65
            byte[] r0 = new byte[r0]
            int r7 = 43 - r7
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            r3 = r1[r6]
        L24:
            int r3 = -r3
            int r5 = r5 + r3
            int r5 = r5 + (-1)
            int r6 = r6 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.showGooglePlayUnavailableMessage.c(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r7, byte r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            int r9 = 109 - r9
            int r7 = r7 + 82
            byte[] r0 = kotlin.showGooglePlayUnavailableMessage.$$g
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r9
            r4 = r2
            goto L27
        L10:
            r3 = r2
        L11:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            int r9 = r9 + 1
            r1[r3] = r5
            if (r4 != r8) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L22:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L27:
            int r9 = -r9
            int r7 = r7 + r9
            int r7 = r7 + (-4)
            r9 = r3
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.showGooglePlayUnavailableMessage.d(short, byte, short, java.lang.Object[]):void");
    }

    showGooglePlayUnavailableMessage() {
        this.write = new Object();
        this.read = false;
        MediaBrowserCompatCustomActionResultReceiver();
    }

    showGooglePlayUnavailableMessage(byte b) {
        super(R.layout.activity_plan_validity);
        this.write = new Object();
        this.read = false;
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.showGooglePlayUnavailableMessage.1
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                showGooglePlayUnavailableMessage.this.MediaBrowserCompatItemReceiver();
            }
        });
        int i2 = MediaBrowserCompatItemReceiver + 31;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 24 / 0;
        }
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 69;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            getSubjectStat getsubjectstatWrite = AudioAttributesImplApi21Parcelizer().write();
            this.RemoteActionCompatParcelizer = getsubjectstatWrite;
            if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                int i3 = AudioAttributesImplApi26Parcelizer + 35;
                MediaBrowserCompatItemReceiver = i3 % 128;
                int i4 = i3 % 2;
                getSubjectStat getsubjectstat = this.RemoteActionCompatParcelizer;
                withFieldVisibility defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
                if (i4 != 0) {
                    getsubjectstat.IconCompatParcelizer(defaultViewModelCreationExtras);
                    return;
                } else {
                    getsubjectstat.IconCompatParcelizer(defaultViewModelCreationExtras);
                    throw null;
                }
            }
            return;
        }
        getSubjectStat getsubjectstatWrite2 = AudioAttributesImplApi21Parcelizer().write();
        this.RemoteActionCompatParcelizer = getsubjectstatWrite2;
        getsubjectstatWrite2.RemoteActionCompatParcelizer();
        throw null;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = $10 + 9;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (38462 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), ((Process.getThreadPriority(0) + 20) >> 6) + 532, 8 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), -735610793, false, $$i(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (AudioAttributesImplBaseParcelizer ^ 2192498202983240651L);
                Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char c = (char) (36622 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)));
                    int size = 2340 - View.MeasureSpec.getSize(0);
                    int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 29;
                    byte b3 = (byte) ($$f & 5);
                    byte b4 = (byte) (b3 - 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read(c, size, modifierMetaStateMask, 188119637, false, $$i(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
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
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i6 = $11 + 3;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer3 == null) {
                char cRed = (char) (36621 - Color.red(0));
                int iLastIndexOf = TextUtils.lastIndexOf("", '0', 0, 0) + 2341;
                int iMakeMeasureSpec = 28 - View.MeasureSpec.makeMeasureSpec(0, 0);
                byte b5 = (byte) ($$f & 5);
                byte b6 = (byte) (b5 - 1);
                objRemoteActionCompatParcelizer3 = startForeground.read(cRed, iLastIndexOf, iMakeMeasureSpec, 188119637, false, $$i(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
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
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(AudioAttributesCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) View.getDefaultSize(0, 0), 23704 - (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 32, -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (44862 - Color.green(0)), (KeyEvent.getMaxKeyCode() >> 16) + 18944, 28 - (ViewConfiguration.getScrollDefaultDelay() >> 16), -1836173544, false, "c", new Class[]{Object.class, Object.class});
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
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                int i6 = $11 + 19;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (KeyEvent.getDeadChar(0, 0) + 44862), TextUtils.getOffsetAfter("", 0) + 18944, 28 - (ViewConfiguration.getTouchSlop() >> 8), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                int i8 = $11 + 97;
                $10 = i8 % 128;
                int i9 = i8 % 2;
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i10 = $11 + 63;
        $10 = i10 % 128;
        if (i10 % 2 == 0) {
            objArr[0] = str;
        } else {
            int i11 = 20 / 0;
            objArr[0] = str;
        }
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 31, false, new char[]{65534, 11, 1, 15, '\f', 6, 1, 65483, '\f', 16, 65483, 65517, 15, '\f', 0, 2, 16, 16}, (ViewConfiguration.getKeyRepeatDelay() >> 16) + 18, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 175, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 34, false, new char[]{65532, 5, 17, 65517, 1}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 4, 181 - TextUtils.getTrimmedLength(""), objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                Object[] objArr4 = new Object[1];
                a((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 15, true, new char[]{6, 17, 0, 65502, 65483, '\r', '\r', 65534, 65483, 1, 6, '\f', 15, 1, 11, 65534, 1, 65534, 2, 15, 5, 65521, 22, 17, 6, 19}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 22, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 141, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                a((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 3, true, new char[]{'\b', '\b', 11, 65529, 4, 5, 65535, '\n', 65527, 65529, 65535, 2, 6, 6, 65495, '\n', 4, 65531}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 14, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 182, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                int i2 = AudioAttributesImplApi26Parcelizer + 1;
                MediaBrowserCompatItemReceiver = i2 % 128;
                if (i2 % 2 == 0) {
                    boolean z = baseContext instanceof ContextWrapper;
                    throw null;
                }
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4534 - TextUtils.lastIndexOf("", '0', 0)), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6054, (Process.myTid() >> 22) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    a(View.resolveSizeAndState(0, 0, 0) + 2, true, new char[]{65514, 24, 26, 27, 65518, 65517, 65514, 65518, 65512, 25, 65516, 23, 24, 23, 26, 65515, 65511, 26, 65509, 65511, 65510, 65512, 22, 65513, 27, 65517, 65518, 27, 26, 65512, 65509, 24, 26, 65509, 65514, 25, 27, 26, 65518, 65512, 65515, 65513, 23, 22, 25, 24, 27, 65509}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(2) + 12, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + TarConstants.CHKSUM_OFFSET, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 24, true, new char[]{65517, 65518, 65518, 31, 65526, 65521, 65525, 65523, 65526, 30, '\"', 30, 65523, '!', 65518, 65517, 31, '!', 65524, 65522, 65523, 65524, 30, 65524, 65517, ' ', ' ', 65517, 65524, 65520, '\"', 65522, ' ', '\"', '#', 65525, 65522, 65521, 65526, 65518, 65517, 65522, 65526, 65517, '!', 65518, '#', '!', '!', 31, 65524, 65525, 65517, 65520, 65519, '#', 65520, 31, 65521, 65517, 65517, 65519, 65524, 65526}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 55, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 109, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 65389, new char[]{26888, 38442, 38889, 38749, 38047, 37997, 38319, 38213, 37510, 37879, 37685, 36992, 36894, 37302, 37152, 40593, 40514, 40842, 40186, 39992, 40332, 40222, 39663, 39551, 39883, 39686, 39028, 39352, 39173, 34449, 34405, 34813, 34686, 33946, 33887, 34172, 33519, 33370, 33695, 33595, 33011, 32833, 33157, 36513, 36453, 36741, 36628, 36020, 35951, 36271, 36126, 35464, 35759, 35641, 34959, 34894, 35299, 35105, 46789, 46595, 46880, 46256, 46082, 46493}, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    a((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 61, true, new char[]{3, 65485, 65488, 20, 65485, 18, 17, 3, 5, '\f', 7, 65485, 7, 14, 65535, 65485, 11, '\r', 1, 65484, 3, 16, 65535, 19, 15, 17, 2, 16, 65535, 19, 5, 65484, 18, 17, 65535, 1, 18, 65535, 3, 16, 6, 18, 65484, 17, 2, '\f', 19, '\r', 16, 23, '\n', 7, 65535, 2, 65485, 65485, 65496, 17, 14, 18, 18, 6, 17, 18, '\f', 3, 20}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(0) + 30, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 140, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    b((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 15646, new char[]{26963, 21595, 4965, 56835, 40248, 22723}, objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(3) + 23784, new char[]{26968, 13312, 54206, 29004, 7216, 48031, 22905, 58406, 33695, 8545, 52354, 27579, 2376, 54488, 29604, 4361, 48366, 23126, 63777, 33938, 8724, 49455, 27784, 2666, 43396, 29886, 4661, 45505, 23721, 64064, 39331, 9993, 49723, 25008, 3914, 43565}, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getTrimmedLength(""), 6030 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer3 == null) {
            char cNormalizeMetaState = (char) (KeyEvent.normalizeMetaState(0) + 13183);
            int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1649;
            int i3 = 26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
            byte[] bArr = $$a;
            byte b = bArr[140];
            short s = bArr[5];
            Object[] objArr13 = new Object[1];
            c(b, s, (byte) s, objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(cNormalizeMetaState, scrollBarSize, i3, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cArgb = (char) (Color.argb(0, 0, 0, 0) + 13183);
                int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1649;
                int i4 = (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 27;
                byte[] bArr2 = $$a;
                Object[] objArr14 = new Object[1];
                c(bArr2[5], bArr2[27], bArr2[30], objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(cArgb, iResolveSizeAndState, i4, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr15 = new Object[1];
            a((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 10, true, new char[]{65521, 65484, 5, '\f', 65535, '\n', 65484, 65535, 20, 65535, '\b', 11, 3, 18, 17, 23}, 16 - View.resolveSizeAndState(0, 0, 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 171, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) + 10414, new char[]{26883, 16431, 15181, 4711, 52634, 42150, 40920, 30452, 8234, 6946, 62035, 44393, 33957, 32680, 22208, 480}, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i5 = MediaBrowserCompatItemReceiver + 13;
            AudioAttributesImplApi26Parcelizer = i5 % 128;
            int i6 = i5 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, 2050545730};
                byte[] bArr3 = $$g;
                Object[] objArr18 = new Object[1];
                d((byte) (bArr3[36] - 1), (byte) (-bArr3[5]), (byte) ($$h | 96), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b2 = bArr3[50];
                byte b3 = bArr3[43];
                Object[] objArr19 = new Object[1];
                d(b2, b3, (byte) (b3 | 68), objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char cMyPid = (char) (13183 - (Process.myPid() >> 22));
                    int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 1649;
                    int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0) + 26;
                    byte[] bArr4 = $$a;
                    Object[] objArr20 = new Object[1];
                    c(bArr4[5], bArr4[27], bArr4[30], objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(cMyPid, iIndexOf, iMakeMeasureSpec, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    b((ViewConfiguration.getTapTimeout() >> 16) + 14321, new char[]{26891, 24309, 1772, 52939, 46785, 32438, 9896, 61139, 54925, 40544, 17966, 3682, 63071, 48676, 26160, 11792, 5655, 56872, 34804, 20454, 14301, 65476}, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    a((ViewConfiguration.getFadingEdgeLength() >> 16) + 6, true, new char[]{65534, '\f', '\t', 65530, 5, 65534, 65534, 6, 2, '\r', 5, 65530, 65534, 65515, 65533}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 11, 179 - TextUtils.lastIndexOf("", '0', 0, 0), objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char capsMode = (char) (13183 - TextUtils.getCapsMode("", 0, 0));
                        int iLastIndexOf = 1648 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int iMyPid = 26 - (Process.myPid() >> 22);
                        byte b4 = $$a[5];
                        Object[] objArr23 = new Object[1];
                        c(b4, (short) (b4 | TarConstants.LF_GNUTYPE_LONGNAME), r10[30], objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(capsMode, iLastIndexOf, iMyPid, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char cIndexOf = (char) (TextUtils.indexOf("", "") + 13183);
                        int iMyTid = (Process.myTid() >> 22) + 1649;
                        int defaultSize = View.getDefaultSize(0, 0) + 26;
                        byte[] bArr5 = $$a;
                        byte b5 = bArr5[140];
                        short s2 = bArr5[5];
                        Object[] objArr24 = new Object[1];
                        c(b5, s2, (byte) s2, objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(cIndexOf, iMyTid, defaultSize, -133433128, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf2);
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i7 = ((int[]) objArr[3])[0];
        int i8 = ((int[]) objArr[2])[0];
        if (i8 != i7) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i8 ^ i7)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4535 - Color.blue(0)), 6054 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), Drawable.resolveOpacity(0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i9 = AudioAttributesImplApi26Parcelizer + 27;
            MediaBrowserCompatItemReceiver = i9 % 128;
            int i10 = i9 % 2;
            try {
                Object[] objArr25 = {-1466061964, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ExpandableListView.getPackedPositionChild(0L) + 1), (ViewConfiguration.getJumpTapTimeout() >> 16) + 6030, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 25);
                Object[] objArr26 = new Object[1];
                d(r1[43], (byte) (-$$g[34]), (byte) 65, objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 65;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            getSubjectStat getsubjectstat = this.RemoteActionCompatParcelizer;
            if (getsubjectstat != null) {
                getsubjectstat.AudioAttributesCompatParcelizer();
                int i3 = MediaBrowserCompatItemReceiver + 85;
                AudioAttributesImplApi26Parcelizer = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
            return;
        }
        super.onDestroy();
        throw null;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 101;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplApi21Parcelizer().af_();
        int i4 = MediaBrowserCompatItemReceiver + 117;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 49 / 0;
        }
        return objAf_;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatItemReceiver + 81;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted AudioAttributesImplApi21Parcelizer() {
        if (this.IconCompatParcelizer == null) {
            synchronized (this.write) {
                if (this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = AudioAttributesImplBaseParcelizer();
                }
            }
        }
        return this.IconCompatParcelizer;
    }

    protected final void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 75;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (this.read) {
            return;
        }
        this.read = true;
        int i3 = AudioAttributesImplApi26Parcelizer + 123;
        MediaBrowserCompatItemReceiver = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 31;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
            throw null;
        }
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i3 = AudioAttributesImplApi26Parcelizer + 119;
        MediaBrowserCompatItemReceiver = i3 % 128;
        int i4 = i3 % 2;
        return RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f5  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 428
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.showGooglePlayUnavailableMessage.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0118  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.showGooglePlayUnavailableMessage.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0105  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r35) {
        /*
            Method dump skipped, instruction units count: 6247
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.showGooglePlayUnavailableMessage.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 73;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatItemReceiver + 35;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }
}
