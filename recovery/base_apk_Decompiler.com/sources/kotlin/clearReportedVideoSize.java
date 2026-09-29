package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class clearReportedVideoSize extends addObserverForBackInvoker implements SubjectStat {
    private getSubjectStat IconCompatParcelizer;
    private volatile isHighlighted RemoteActionCompatParcelizer;
    private static final byte[] $$l = {43, -12, TarConstants.LF_GNUTYPE_LONGNAME, -80};
    private static final int $$m = 41;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {38, -16, -7, 121, 9, -5, -66, TarConstants.LF_FIFO, 5, -3, -11, 2, -10, -58, TarConstants.LF_NORMAL, 10, -13, 11, -6, -9, -8, -57, TarConstants.LF_FIFO, 3, 3, -72, TarConstants.LF_SYMLINK, 9, -5, -3, -1, -4, -67, 68, -4, -14, 0, -65, 73, -3, -28, -16, -7, 0, 16, 5, -1, 2, -18, -39, 31, 14, -14, 3, -4, -46, 41, -5, 0, -18, 16, -39, 14, 14, -18, -1, 4, -6, 14, -24, 10, -68, 20, TarConstants.LF_NORMAL, -12, -34, 25, -14, 21, -23, 10, -44, 33, 0, -7, -44, 41, -5, 0, -4, -4, -12, 6, 3, -43, 26, 7, -2, -18, 6, -12, 10, -48, TarConstants.LF_NORMAL, -7, -18, 10, -7, -16, 8, -28, 35, -14, 3, -15, -6, 12, -14, -9, -26, 18, 9, -14, -1, -6, -50, 23, 9, -4, -46, 41, -5, 0, -18, 16, -39, 14, 14, -18, -1, 4, -6, 14, -24, 10};
    private static final int $$k = 39;
    private static final byte[] $$d = {TarConstants.LF_CHR, -23, 108, 101, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 89;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static long write = -5293241484131414083L;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1000326260;
    private final Object AudioAttributesCompatParcelizer = new Object();
    private boolean read = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(int r7, int r8, short r9) {
        /*
            byte[] r0 = kotlin.clearReportedVideoSize.$$l
            int r9 = r9 * 4
            int r9 = 4 - r9
            int r8 = r8 * 3
            int r8 = 1 - r8
            int r7 = r7 * 2
            int r7 = 121 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            r6 = r9
            r9 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L2d:
            int r9 = r9 + 1
            int r3 = -r3
            int r7 = r7 + r3
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.clearReportedVideoSize.$$n(int, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 4
            int r7 = r7 + 4
            byte[] r1 = kotlin.clearReportedVideoSize.$$d
            int r6 = 114 - r6
            byte[] r0 = new byte[r0]
            int r8 = r8 + 3
            r2 = 0
            if (r1 != 0) goto L13
            r6 = r7
            r4 = r8
            r3 = r2
            goto L28
        L13:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r6]
        L28:
            int r7 = r7 + r4
            int r6 = r6 + 1
            int r7 = r7 + (-1)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.clearReportedVideoSize.g(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(short r7, int r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = 125 - r9
            int r8 = r8 + 73
            int r7 = r7 * 2
            int r7 = r7 + 4
            byte[] r0 = kotlin.clearReportedVideoSize.$$j
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L13
            r8 = r7
            r3 = r9
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            int r4 = r3 + 1
            int r9 = r9 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            r3 = r0[r9]
            r6 = r3
            r3 = r9
            r9 = r6
        L2a:
            int r8 = r8 + r9
            int r8 = r8 + 3
            r9 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.clearReportedVideoSize.h(short, int, short, java.lang.Object[]):void");
    }

    clearReportedVideoSize() {
        AudioAttributesImplApi21Parcelizer();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.clearReportedVideoSize.1
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                clearReportedVideoSize.this.AudioAttributesImplApi26Parcelizer();
            }
        });
        int i2 = AudioAttributesImplBaseParcelizer + 73;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    private void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 61;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            this.IconCompatParcelizer = AudioAttributesImplBaseParcelizer().write();
            if (!(!r1.RemoteActionCompatParcelizer())) {
                this.IconCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            }
            int i3 = AudioAttributesImplBaseParcelizer + 57;
            MediaBrowserCompatItemReceiver = i3 % 128;
            if (i3 % 2 == 0) {
                throw null;
            }
            return;
        }
        getSubjectStat getsubjectstatWrite = AudioAttributesImplBaseParcelizer().write();
        this.IconCompatParcelizer = getsubjectstatWrite;
        getsubjectstatWrite.RemoteActionCompatParcelizer();
        throw null;
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (38461 - (KeyEvent.getMaxKeyCode() >> 16)), 532 - Gravity.getAbsoluteGravity(0, 0), 8 - (ViewConfiguration.getScrollBarSize() >> 8), -735610793, false, $$n(b, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (write ^ 2192498202983240651L);
                Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char bitsPerPixel = (char) (36620 - ImageFormat.getBitsPerPixel(0));
                    int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 2340;
                    int bitsPerPixel2 = ImageFormat.getBitsPerPixel(0) + 29;
                    byte b3 = (byte) ($$m & 7);
                    byte b4 = (byte) (b3 - 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read(bitsPerPixel, packedPositionGroup, bitsPerPixel2, 188119637, false, $$n(b3, b4, b4), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i4 = $10 + 35;
                $11 = i4 % 128;
                int i5 = i4 % 2;
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
            int i6 = $10 + 111;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
                Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char c = (char) (36621 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                    int size = 2340 - View.MeasureSpec.getSize(0);
                    int iResolveSizeAndState = 28 - View.resolveSizeAndState(0, 0, 0);
                    byte b5 = (byte) ($$m & 7);
                    byte b6 = (byte) (b5 - 1);
                    objRemoteActionCompatParcelizer3 = startForeground.read(c, size, iResolveSizeAndState, 188119637, false, $$n(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                int i7 = 96 / 0;
            } else {
                cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
                Object[] objArr5 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char cResolveOpacity = (char) (36621 - Drawable.resolveOpacity(0, 0));
                    int offsetBefore = 2340 - TextUtils.getOffsetBefore("", 0);
                    int capsMode = TextUtils.getCapsMode("", 0, 0) + 28;
                    byte b7 = (byte) ($$m & 7);
                    byte b8 = (byte) (b7 - 1);
                    objRemoteActionCompatParcelizer4 = startForeground.read(cResolveOpacity, offsetBefore, capsMode, 188119637, false, $$n(b7, b8, b8), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
        }
        objArr[0] = new String(cArr2);
    }

    private static void f(int i, int i2, char[] cArr, int i3, boolean z, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i) {
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i3 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i5 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), 23704 - KeyEvent.getDeadChar(0, 0), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 32, -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (44862 - (ViewConfiguration.getWindowTouchSlop() >> 8)), 18944 - Color.green(0), 27 - TextUtils.lastIndexOf("", '0', 0, 0), -1836173544, false, "c", new Class[]{Object.class, Object.class});
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
        if (i2 > 0) {
            cleardownloadmanagerhelpers.write = i2;
            char[] cArr3 = new char[i];
            System.arraycopy(cArr2, 0, cArr3, 0, i);
            System.arraycopy(cArr3, 0, cArr2, i - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i - cleardownloadmanagerhelpers.write);
        }
        if (z) {
            int i6 = $10 + 79;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            char[] cArr4 = new char[i];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            int i8 = $11 + 107;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 4 % 2;
            }
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i) {
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (44862 - (ViewConfiguration.getTouchSlop() >> 8)), Gravity.getAbsoluteGravity(0, 0) + 18944, KeyEvent.keyCodeFromString("") + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x01e8  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r38) {
        /*
            Method dump skipped, instruction units count: 2711
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.clearReportedVideoSize.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 63;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            getSubjectStat getsubjectstat = this.IconCompatParcelizer;
            if (getsubjectstat != null) {
                getsubjectstat.AudioAttributesCompatParcelizer();
            }
            int i3 = AudioAttributesImplBaseParcelizer + 15;
            MediaBrowserCompatItemReceiver = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        super.onDestroy();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 35;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplBaseParcelizer().af_();
        if (i3 == 0) {
            int i4 = 3 / 0;
        }
        int i5 = AudioAttributesImplBaseParcelizer + 9;
        MediaBrowserCompatItemReceiver = i5 % 128;
        int i6 = i5 % 2;
        return objAf_;
    }

    private isHighlighted MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = AudioAttributesImplBaseParcelizer + 125;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        if (this.RemoteActionCompatParcelizer == null) {
            synchronized (this.AudioAttributesCompatParcelizer) {
                if (this.RemoteActionCompatParcelizer == null) {
                    this.RemoteActionCompatParcelizer = MediaBrowserCompatCustomActionResultReceiver();
                }
            }
        }
        return this.RemoteActionCompatParcelizer;
    }

    protected final void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 51;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (!this.read) {
            this.read = true;
        }
        int i3 = MediaBrowserCompatItemReceiver + 107;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 66 / 0;
        }
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 99;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i3 = AudioAttributesImplBaseParcelizer + 13;
        MediaBrowserCompatItemReceiver = i3 % 128;
        int i4 = i3 % 2;
        return RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ea  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.clearReportedVideoSize.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00db  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.clearReportedVideoSize.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0a42 A[Catch: all -> 0x0b02, TryCatch #1 {all -> 0x0b02, blocks: (B:140:0x0a2e, B:142:0x0a42, B:143:0x0a74), top: B:268:0x0a2e, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0a87 A[Catch: all -> 0x0af8, TryCatch #10 {all -> 0x0af8, blocks: (B:144:0x0a7a, B:146:0x0a87, B:147:0x0af0), top: B:284:0x0a7a, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:173:0x0c34  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0c82  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0cde  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0ff1  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x10d2  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x1119  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x11c1  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x1511  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0a14 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:302:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r37) {
        /*
            Method dump skipped, instruction units count: 6281
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.clearReportedVideoSize.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 93;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatItemReceiver + 119;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }
}
