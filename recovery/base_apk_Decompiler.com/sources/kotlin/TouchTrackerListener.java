package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class TouchTrackerListener extends addObserverForBackInvoker implements SubjectStat {
    private getSubjectStat AudioAttributesCompatParcelizer;
    private volatile isHighlighted RemoteActionCompatParcelizer;
    private static final byte[] $$l = {31, 80, -124, -66};
    private static final int $$m = 167;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {11, -82, -98, -28, -13, 1, 62, -58, -9, -1, 7, -6, 6, TarConstants.LF_FIFO, -52, -14, 9, -15, 2, 5, 4, TarConstants.LF_DIR, -64, 11, -20, 14, -14, 8, 7, -12, 61, -71, 18, -2, -18, 68, -39, -14, -2, 21, -22, -25, 9, -7, 0, 79, -79, 12, 3, -4, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -13, 1, 62, -58, -9, -1, 7, -6, 6, TarConstants.LF_FIFO, -52, -14, 9, -15, 2, 5, 4, TarConstants.LF_DIR, -64, 11, -20, 14, -14, 8, 7, -12, 61, -54, -6, -2, -8, 65, -22, -38, -2, -8, TarConstants.LF_GNUTYPE_LONGLINK, -14, 4, 8, -12, 14};
    private static final int $$k = 50;
    private static final byte[] $$d = {11, 40, -34, 98, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 30;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int MediaMetadataCompat = 1;
    private static char IconCompatParcelizer = 63405;
    private static char MediaBrowserCompatCustomActionResultReceiver = 21619;
    private static char AudioAttributesImplBaseParcelizer = 18685;
    private static char AudioAttributesImplApi21Parcelizer = 40244;
    private static long MediaBrowserCompatItemReceiver = 7720394146586310616L;
    private final Object write = new Object();
    private boolean read = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(int r5, int r6, int r7) {
        /*
            int r6 = r6 * 4
            int r6 = 3 - r6
            int r7 = r7 + 119
            int r5 = r5 * 4
            int r0 = r5 + 1
            byte[] r1 = kotlin.TouchTrackerListener.$$l
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r3 = r5
            r4 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r6 = r6 + 1
            int r4 = r3 + 1
            if (r3 != r5) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L24:
            r3 = r1[r6]
        L26:
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TouchTrackerListener.$$n(int, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0023). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 65
            int r7 = r7 + 4
            byte[] r0 = kotlin.TouchTrackerListener.$$d
            int r6 = r6 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r6
            r8 = r7
            r4 = r2
            goto L23
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r3 = r0[r7]
        L23:
            int r7 = r7 + 1
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-1)
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TouchTrackerListener.g(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r5, short r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.TouchTrackerListener.$$j
            int r1 = r7 + 5
            int r6 = 134 - r6
            int r5 = r5 + 73
            byte[] r1 = new byte[r1]
            int r7 = r7 + 4
            r2 = -1
            if (r0 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L25
        L12:
            r3 = r2
        L13:
            int r3 = r3 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L23:
            r4 = r0[r6]
        L25:
            int r4 = -r4
            int r6 = r6 + 1
            int r5 = r5 + r4
            int r5 = r5 + r2
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TouchTrackerListener.h(byte, short, int, java.lang.Object[]):void");
    }

    TouchTrackerListener() {
        MediaBrowserCompatItemReceiver();
    }

    private void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.TouchTrackerListener.5
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                TouchTrackerListener.this.AudioAttributesImplApi21Parcelizer();
            }
        });
        int i2 = MediaMetadataCompat + 75;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 113;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        this.AudioAttributesCompatParcelizer = AudioAttributesImplBaseParcelizer().write();
        if (!(!r1.RemoteActionCompatParcelizer())) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
        }
        int i4 = AudioAttributesImplApi26Parcelizer + 21;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void f(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = $11 + 43;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (38460 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getWindowTouchSlop() >> 8) + 532, 9 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -735610793, false, $$n(b, b2, (byte) (b2 + 2)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (MediaBrowserCompatItemReceiver ^ 2192498202983240651L);
                try {
                    Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 36620), KeyEvent.getDeadChar(0, 0) + 2340, (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28, 188119637, false, $$n(b3, b4, b4), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                    int i6 = $10 + 101;
                    $11 = i6 % 128;
                    int i7 = i6 % 2;
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
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer3 == null) {
                byte b5 = (byte) 0;
                byte b6 = b5;
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (36621 - (Process.myPid() >> 22)), TextUtils.indexOf("", "") + 2340, 28 - TextUtils.getCapsMode("", 0, 0), 188119637, false, $$n(b5, b6, b6), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2);
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        isStopped isstopped = new isStopped();
        char[] cArr2 = new char[cArr.length];
        isstopped.read = 0;
        char[] cArr3 = new char[2];
        int i3 = $10 + 67;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (isstopped.read < cArr.length) {
            int i5 = $10 + 71;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                cArr3[0] = cArr[isstopped.read];
                cArr3[1] = cArr[isstopped.read];
            } else {
                cArr3[0] = cArr[isstopped.read];
                cArr3[1] = cArr[isstopped.read + 1];
            }
            int i6 = $11 + 83;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 58224;
            for (int i9 = 0; i9 < 16; i9++) {
                char c = cArr3[1];
                char c2 = cArr3[0];
                try {
                    Object[] objArr2 = {Integer.valueOf(c), Integer.valueOf((c2 + i8) ^ ((c2 << 4) + ((char) (((long) AudioAttributesImplBaseParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(c2 >>> 5), Integer.valueOf(AudioAttributesImplApi21Parcelizer)};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) View.MeasureSpec.makeMeasureSpec(0, 0), 1503 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 21, 1322448859, false, $$n(b, b2, (byte) (b2 + 3)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    cArr3[1] = cCharValue;
                    Object[] objArr3 = {Integer.valueOf(cArr3[0]), Integer.valueOf((cCharValue + i8) ^ ((cCharValue << 4) + ((char) (((long) IconCompatParcelizer) ^ 1193402106669854891L)))), Integer.valueOf(cCharValue >>> 5), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(815477582);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1504 - Color.red(0), (Process.myPid() >> 22) + 21, 1322448859, false, $$n(b3, b4, (byte) (b4 + 3)), new Class[]{Integer.TYPE, Integer.TYPE, Integer.TYPE, Integer.TYPE});
                    }
                    cArr3[0] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i8 -= 40503;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2[isstopped.read] = cArr3[0];
            cArr2[isstopped.read + 1] = cArr3[1];
            Object[] objArr4 = {isstopped, isstopped};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-167774474);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (1 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), Gravity.getAbsoluteGravity(0, 0) + 9016, 57 - TextUtils.lastIndexOf("", '0', 0), -1950993821, false, "D", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x011f  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r30) {
        /*
            Method dump skipped, instruction units count: 2253
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TouchTrackerListener.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        getSubjectStat getsubjectstat;
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 39;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDestroy();
            getsubjectstat = this.AudioAttributesCompatParcelizer;
            int i3 = 89 / 0;
            if (getsubjectstat == null) {
                return;
            }
        } else {
            super.onDestroy();
            getsubjectstat = this.AudioAttributesCompatParcelizer;
            if (getsubjectstat == null) {
                return;
            }
        }
        getsubjectstat.AudioAttributesCompatParcelizer();
        int i4 = AudioAttributesImplApi26Parcelizer + 43;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 21;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplBaseParcelizer().af_();
        if (i3 == 0) {
            int i4 = 96 / 0;
        }
        int i5 = AudioAttributesImplApi26Parcelizer + 35;
        MediaMetadataCompat = i5 % 128;
        int i6 = i5 % 2;
        return objAf_;
    }

    private isHighlighted MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaMetadataCompat + 51;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        if (this.RemoteActionCompatParcelizer == null) {
            synchronized (this.write) {
                if (this.RemoteActionCompatParcelizer == null) {
                    this.RemoteActionCompatParcelizer = MediaBrowserCompatCustomActionResultReceiver();
                }
            }
        }
        return this.RemoteActionCompatParcelizer;
    }

    protected final void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 79;
        AudioAttributesImplApi26Parcelizer = i3 % 128;
        int i4 = i3 % 2;
        if (this.read) {
            return;
        }
        int i5 = i2 + 77;
        AudioAttributesImplApi26Parcelizer = i5 % 128;
        int i6 = i5 % 2;
        this.read = true;
        int i7 = AudioAttributesImplApi26Parcelizer + 71;
        MediaMetadataCompat = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 9;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 == 0) {
            RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
            int i3 = 66 / 0;
        } else {
            RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        }
        int i4 = AudioAttributesImplApi26Parcelizer + 81;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
        return RemoteActionCompatParcelizer;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            e((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 25, new char[]{7769, 23032, 11507, 8245, 4137, 10763, 42549, 44794, 62610, 31621, 11100, 24748, 25350, 60841, 60232, 5294, 27275, 40981, 57608, 56654, 56912, 14631, 49142, 38704, 24050, 30568}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f((ViewConfiguration.getTouchSlop() >> 8) + 31469, new char[]{42096, 56971, 20923, 54438, 20418, 49884, 17897, 63529, 29451, 63030, 26941, 60501, 26476, 39547, 7313, 38809, 2732, 36288}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i2 = AudioAttributesImplApi26Parcelizer + 101;
            MediaMetadataCompat = i2 % 128;
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
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4535), (ViewConfiguration.getJumpTapTimeout() >> 16) + 6054, 42 - KeyEvent.normalizeMetaState(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getFadingEdgeLength() >> 16), 6030 - (ViewConfiguration.getFadingEdgeLength() >> 16), (Process.myPid() >> 22) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i3 = MediaMetadataCompat + 67;
                AudioAttributesImplApi26Parcelizer = i3 % 128;
                int i4 = i3 % 2;
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

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = AudioAttributesImplApi26Parcelizer + 67;
            MediaMetadataCompat = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            e(TextUtils.indexOf((CharSequence) "", '0', 0) + 27, new char[]{7769, 23032, 11507, 8245, 4137, 10763, 42549, 44794, 62610, 31621, 11100, 24748, 25350, 60841, 60232, 5294, 27275, 40981, 57608, 56654, 56912, 14631, 49142, 38704, 24050, 30568}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 31459, new char[]{42096, 56971, 20923, 54438, 20418, 49884, 17897, 63529, 29451, 63030, 26941, 60501, 26476, 39547, 7313, 38809, 2732, 36288}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = MediaMetadataCompat + 107;
            AudioAttributesImplApi26Parcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            int i6 = AudioAttributesImplApi26Parcelizer + 97;
            MediaMetadataCompat = i6 % 128;
            if (i6 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - Color.green(0)), (-16771162) - Color.rgb(0, 0, 0), 42 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 6030 - Color.green(0), 25 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -861814097, false, "read", new Class[]{Context.class});
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
        super.onPause();
    }

    /* JADX WARN: Removed duplicated region for block: B:133:0x079f A[Catch: all -> 0x0260, TryCatch #0 {all -> 0x0260, blocks: (B:131:0x0799, B:133:0x079f, B:134:0x07c8, B:213:0x0d5e, B:215:0x0d64, B:216:0x0d8f, B:249:0x1152, B:251:0x1158, B:252:0x1185, B:230:0x0f53, B:232:0x0f75, B:233:0x0fc2, B:180:0x09a3, B:182:0x09a9, B:183:0x09d2, B:17:0x00ac, B:19:0x00b2, B:20:0x00da, B:22:0x01d2, B:24:0x0202, B:25:0x025a, B:139:0x0851, B:143:0x0861, B:146:0x086e, B:150:0x087a, B:166:0x094e, B:168:0x0954, B:169:0x0955, B:171:0x0957, B:173:0x095e, B:174:0x095f), top: B:277:0x00ac, inners: #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0899 A[Catch: all -> 0x0956, TryCatch #13 {all -> 0x0956, blocks: (B:155:0x0885, B:157:0x0899, B:158:0x08cb), top: B:301:0x0885, outer: #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x08de A[Catch: all -> 0x094c, TryCatch #8 {all -> 0x094c, blocks: (B:159:0x08d1, B:161:0x08de, B:162:0x0944), top: B:292:0x08d1, outer: #18 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0a62  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0ab0  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0b04  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0d40  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0e1d  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0e6b  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0ec3  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x1133  */
    /* JADX WARN: Removed duplicated region for block: B:311:0x0851 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:316:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x008f  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r34) {
        /*
            Method dump skipped, instruction units count: 5311
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TouchTrackerListener.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 1;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = AudioAttributesImplApi26Parcelizer + 125;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
    }
}
