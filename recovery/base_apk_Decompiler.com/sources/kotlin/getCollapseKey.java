package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.os.Process;
import android.os.SystemClock;
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
public abstract class getCollapseKey extends addObserverForBackInvoker implements SubjectStat {
    private getSubjectStat IconCompatParcelizer;
    private volatile isHighlighted read;
    private static final byte[] $$c = {111, -119, 57, 106};
    private static final int $$f = 147;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {115, -66, -117, -68, -5, 9, 70, -50, -1, 7, 15, 2, 14, 62, -44, -6, 17, -7, 10, 13, 12, 61, -50, 1, 1, TarConstants.LF_GNUTYPE_LONGNAME, -46, -5, 9, 7, 5, 8, 71, -64, 8, 18, 4, 69, -69, 7, 32, 20, 11, 4, -12, -1, 5, 2, 22, 43, -27, -10, 18, 1, 8, TarConstants.LF_SYMLINK, -37, 9, 4, 22, -12, 43, -10, -10, 22, 5, 0, 10, -10, 28, -6, 72, -16, 5, 2, 0, -27, 10, 19, 12, 5, 5, 24, -10, -12, 11, 6, 10, 20, 72, -76, 12, 16, -4, 22, -19, -5, 8, TarConstants.LF_SYMLINK, -37, 9, 4, 22, -12, 43, -10, -10, 22, 5, 0, 10, -10, 28, -6};
    private static final int $$h = 205;
    private static final byte[] $$a = {112, -82, -21, -22, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 96;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int MediaBrowserCompatSearchResultReceiver = 1;
    private static char[] write = {28334, 28323, 28333, 28351, 28320, 28326, 28387, 28348, 28289, 28332, 28330, 28322, 28342, 28314, 28410, 28385, 28331, 28335, 28413, 28411, 28412, 28406, 28409, 28414, 28415, 28408, 28329, 28349, 28321, 28407, 28384, 28325, 28346, 28328, 28350, 28347, 28297, 28300, 28316, 28324};
    private static int AudioAttributesImplApi21Parcelizer = 411397937;
    private static boolean AudioAttributesImplBaseParcelizer = true;
    private static boolean MediaBrowserCompatItemReceiver = true;
    private static long AudioAttributesImplApi26Parcelizer = 4808442846186575558L;
    private final Object AudioAttributesCompatParcelizer = new Object();
    private boolean RemoteActionCompatParcelizer = false;

    private static String $$i(short s, short s2, short s3) {
        int i = 104 - (s3 * 3);
        int i2 = s2 * 2;
        int i3 = (s * 2) + 4;
        byte[] bArr = $$c;
        byte[] bArr2 = new byte[i2 + 1];
        int i4 = -1;
        if (bArr == null) {
            i4 = -1;
            i = i3 + i;
            i3++;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i;
            if (i5 == i2) {
                return new String(bArr2, 0);
            }
            int i6 = i;
            i4 = i5;
            i = bArr[i3] + i6;
            i3++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r9 = 191 - r9
            int r7 = 114 - r7
            int r8 = 44 - r8
            byte[] r0 = kotlin.getCollapseKey.$$a
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r9
            r5 = r2
            goto L28
        L10:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L14:
            byte r4 = (byte) r9
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r7]
            r6 = r3
            r3 = r7
            r7 = r6
        L28:
            int r7 = -r7
            int r9 = r9 + r7
            int r9 = r9 + (-1)
            int r7 = r3 + 1
            r3 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCollapseKey.c(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r7, int r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = 38 - r9
            int r7 = r7 + 73
            byte[] r0 = kotlin.getCollapseKey.$$g
            int r8 = 94 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r5 = r2
            goto L28
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L20
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L20:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L28:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + 7
            r8 = r3
            r3 = r5
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCollapseKey.d(int, int, byte, java.lang.Object[]):void");
    }

    getCollapseKey() {
        AudioAttributesImplApi21Parcelizer();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.getCollapseKey.3
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                getCollapseKey.this.MediaBrowserCompatItemReceiver();
            }
        });
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 121;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 55;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            getSubjectStat getsubjectstatWrite = MediaBrowserCompatCustomActionResultReceiver().write();
            this.IconCompatParcelizer = getsubjectstatWrite;
            if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                this.IconCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            }
            int i3 = MediaBrowserCompatSearchResultReceiver + 35;
            MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
            if (i3 % 2 != 0) {
                throw null;
            }
            return;
        }
        getSubjectStat getsubjectstatWrite2 = MediaBrowserCompatCustomActionResultReceiver().write();
        this.IconCompatParcelizer = getsubjectstatWrite2;
        getsubjectstatWrite2.RemoteActionCompatParcelizer();
        throw null;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(AudioAttributesImplApi26Parcelizer ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $10 + 1;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(AudioAttributesImplApi26Parcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((-1) - ExpandableListView.getPackedPositionChild(0L)), Gravity.getAbsoluteGravity(0, 0) + 12424, 20 - Color.argb(0, 0, 0, 0), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                try {
                    Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), KeyEvent.normalizeMetaState(0) + 1868, 10 - TextUtils.getTrimmedLength(""), 1983509525, false, $$i(b, b2, b2), new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                    int i6 = $11 + 1;
                    $10 = i6 % 128;
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
        objArr[0] = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
    }

    private static void a(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = write;
        long j = 0;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (44862 - (ViewConfiguration.getEdgeSlop() >> 16)), 18944 - TextUtils.indexOf("", "", 0), 29 - (SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)), -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i4++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(AudioAttributesImplApi21Parcelizer)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), View.getDefaultSize(0, 0) + 19033, (ViewConfiguration.getPressedStateDuration() >> 16) + 75, 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        if (MediaBrowserCompatItemReceiver) {
            int i5 = $10 + 75;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
                i2 = notifydownloads.AudioAttributesCompatParcelizer;
            } else {
                notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
                i2 = notifydownloads.AudioAttributesCompatParcelizer;
            }
            char[] cArr4 = new char[i2];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr4 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getScrollBarSize() >> 8), (ViewConfiguration.getTapTimeout() >> 16) + 11439, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                int i6 = $10 + 83;
                $11 = i6 % 128;
                int i7 = i6 % 2;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!AudioAttributesImplBaseParcelizer) {
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                notifydownloads.IconCompatParcelizer++;
            }
            String str = new String(cArr5);
            int i8 = $11 + 57;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            objArr[0] = str;
            return;
        }
        int i9 = $10 + 63;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
            Object[] objArr5 = {notifydownloads, notifydownloads};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (1 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 11439, (Process.myPid() >> 22) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x013b  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r26) {
        /*
            Method dump skipped, instruction units count: 2237
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCollapseKey.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021 A[PHI: r3
      0x0021: PHI (r3v2 o.getSubjectStat) = (r3v1 o.getSubjectStat), (r3v6 o.getSubjectStat) binds: [B:8:0x001f, B:5:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onDestroy() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.getCollapseKey.MediaBrowserCompatCustomActionResultReceiver
            int r1 = r1 + 69
            int r2 = r1 % 128
            kotlin.getCollapseKey.MediaBrowserCompatSearchResultReceiver = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1a
            super.onDestroy()
            o.getSubjectStat r3 = r3.IconCompatParcelizer
            r1 = 46
            int r1 = r1 / 0
            if (r3 == 0) goto L24
            goto L21
        L1a:
            super.onDestroy()
            o.getSubjectStat r3 = r3.IconCompatParcelizer
            if (r3 == 0) goto L24
        L21:
            r3.AudioAttributesCompatParcelizer()
        L24:
            int r3 = kotlin.getCollapseKey.MediaBrowserCompatSearchResultReceiver
            int r3 = r3 + 93
            int r1 = r3 % 128
            kotlin.getCollapseKey.MediaBrowserCompatCustomActionResultReceiver = r1
            int r3 = r3 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCollapseKey.onDestroy():void");
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 103;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        if (i3 != 0) {
            return ishighlightedMediaBrowserCompatCustomActionResultReceiver.af_();
        }
        ishighlightedMediaBrowserCompatCustomActionResultReceiver.af_();
        throw null;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatSearchResultReceiver + 125;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            return ishighlighted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted MediaBrowserCompatCustomActionResultReceiver() {
        if (this.read == null) {
            synchronized (this.AudioAttributesCompatParcelizer) {
                if (this.read == null) {
                    this.read = AudioAttributesImplBaseParcelizer();
                }
            }
        }
        return this.read;
    }

    protected final void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        if (!this.RemoteActionCompatParcelizer) {
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 67;
            MediaBrowserCompatSearchResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            this.RemoteActionCompatParcelizer = true;
        }
        int i4 = MediaBrowserCompatSearchResultReceiver + 27;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 107;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        if (i3 != 0) {
            return getNextPercentile.RemoteActionCompatParcelizer(this, defaultViewModelProviderFactory);
        }
        getNextPercentile.RemoteActionCompatParcelizer(this, defaultViewModelProviderFactory);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ae  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 378
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCollapseKey.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x008e  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 336
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCollapseKey.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(30:(28:285|36|(3:38|39|(2:41|43)(1:42))(1:43)|78|277|79|(2:281|81)|85|86|284|(5:88|89|(1:91)|92|93)(20:94|300|95|(3:97|282|98)|102|103|286|104|(3:106|288|107)|111|112|113|(1:115)|116|117|118|(1:120)|121|(1:123)|124)|125|(5:128|129|(13:308|131|(3:133|(3:136|137|134)|313)|138|306|139|(1:141)|142|143|144|296|145|312)(1:311)|310|126)|309|186|(1:188)|189|(3:191|(1:193)|194)(13:196|302|197|198|(1:200)|201|290|202|203|(1:205)|206|(1:208)|209)|195|210|(6:212|213|(1:215)|216|217|218)|219|(1:221)|222|(3:224|(1:226)|227)(14:229|230|(1:232)|233|234|(1:236)|237|279|238|239|(1:241)|242|(1:244)|245)|228|246|(7:248|249|(1:251)|252|253|254|255)(1:314))|292|51|(1:53)|54|78|277|79|(0)|85|86|284|(0)(0)|125|(1:126)|309|186|(0)|189|(0)(0)|195|210|(0)|219|(0)|222|(0)(0)|228|246|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0928, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0929, code lost:
    
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:172:0x0942, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:173:0x0943, code lost:
    
        r9 = r22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:174:0x0945, code lost:
    
        r1 = r0;
        r9 = r9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x009d A[PHI: r9
      0x009d: PHI (r9v15 int) = (r9v14 int), (r9v99 int) binds: [B:3:0x0086, B:7:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x07fe  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x098b A[Catch: all -> 0x0282, TryCatch #1 {all -> 0x0282, blocks: (B:213:0x0d74, B:215:0x0d7a, B:216:0x0da9, B:249:0x1157, B:251:0x115d, B:252:0x1182, B:230:0x0f41, B:232:0x0f62, B:233:0x0fb0, B:180:0x0985, B:182:0x098b, B:183:0x09bb, B:72:0x03c9, B:74:0x03cf, B:75:0x03f8, B:22:0x00c3, B:24:0x00c9, B:25:0x00f4, B:27:0x01f2, B:29:0x0222, B:30:0x027c), top: B:275:0x00c3 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0a48  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0a98  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0aea  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0d54  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0e35  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0e85  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0ed7  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x1139  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0481 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:314:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0286 A[PHI: r9
      0x0286: PHI (r9v94 int) = (r9v16 int), (r9v98 int) binds: [B:20:0x00be, B:7:0x0096] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x04d9  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0532 A[Catch: all -> 0x0942, TRY_ENTER, TRY_LEAVE, TryCatch #2 {all -> 0x0942, blocks: (B:79:0x047b, B:85:0x04cc, B:94:0x0532, B:113:0x065f, B:116:0x06aa), top: B:277:0x047b }] */
    /* JADX WARN: Type inference failed for: r9v100 */
    /* JADX WARN: Type inference failed for: r9v101 */
    /* JADX WARN: Type inference failed for: r9v102 */
    /* JADX WARN: Type inference failed for: r9v103 */
    /* JADX WARN: Type inference failed for: r9v104 */
    /* JADX WARN: Type inference failed for: r9v105 */
    /* JADX WARN: Type inference failed for: r9v106 */
    /* JADX WARN: Type inference failed for: r9v107 */
    /* JADX WARN: Type inference failed for: r9v108 */
    /* JADX WARN: Type inference failed for: r9v109 */
    /* JADX WARN: Type inference failed for: r9v110 */
    /* JADX WARN: Type inference failed for: r9v111 */
    /* JADX WARN: Type inference failed for: r9v112 */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v29 */
    /* JADX WARN: Type inference failed for: r9v30 */
    /* JADX WARN: Type inference failed for: r9v38 */
    /* JADX WARN: Type inference failed for: r9v39 */
    /* JADX WARN: Type inference failed for: r9v40 */
    /* JADX WARN: Type inference failed for: r9v41 */
    /* JADX WARN: Type inference failed for: r9v42, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v59 */
    /* JADX WARN: Type inference failed for: r9v60 */
    /* JADX WARN: Type inference failed for: r9v83 */
    /* JADX WARN: Type inference failed for: r9v84 */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r32) {
        /*
            Method dump skipped, instruction units count: 5171
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getCollapseKey.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 57;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatSearchResultReceiver + 25;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }
}
