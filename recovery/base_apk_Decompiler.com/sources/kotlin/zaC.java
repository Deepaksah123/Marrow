package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
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
public abstract class zaC extends addObserverForBackInvoker implements SubjectStat {
    private static int $10 = 0;
    private static int $11 = 1;
    private volatile isHighlighted IconCompatParcelizer;
    private getSubjectStat RemoteActionCompatParcelizer;
    private static final byte[] $$j = {9, -88, -121, TarConstants.LF_FIFO, 61, -61, -2, -19, 34, -27, -19, -7, 4, -7, 3, 19, -41, 5, 7, 27, -48, -1, -2, 38, -48, -3, -4, 5, -2, -21, 7, -17, 9, -15, -9, 40, -24, -17, 9, -10, -2, -17, 1, 5, -15, 11, -23, -12, -6, -9, 11, 32, -38, -21, 7, -10, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17, 61, -61, -2, -19, 30, -19, -23, 7, -9, 3, 9, 0, -7};
    private static final int $$k = 5;
    private static final byte[] $$d = {112, 17, 101, TarConstants.LF_CONTIG, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 41;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static char[] write = {11440, 6425, 6470, 6405, 6492, 6418, 6468, 6505, 6416, 6475, 6429, 6406, 6431, 11443, 6489, 6474, 11448, 6478, 6465, 6417, 6488, 6430, 11444, 6427, 6473, 6491, 11441, 11450, 6407, 6522, 6469, 6479, 6476, 11447, 6481, 6520, 6477, 11446, 6464, 6428, 6471, 6490, 6525, 11445, 6424, 11451, 6493, 6494, 6426};
    private static char AudioAttributesImplApi21Parcelizer = 11445;
    private static int[] AudioAttributesImplBaseParcelizer = {256894094, -542516736, -1547639708, -296516197, -1683493284, 1686267464, -885779317, -1355712438, 1960127354, 739336050, 1311838679, 754142818, 701240546, 555942648, -391160799, -486630384, -606495761, 644768986};
    private final Object read = new Object();
    private boolean AudioAttributesCompatParcelizer = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 + 4
            byte[] r1 = kotlin.zaC.$$d
            int r6 = r6 + 4
            int r8 = 114 - r8
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r6
            goto L2c
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r0[r3] = r4
            int r6 = r6 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r6]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-1)
            r3 = r4
            r5 = r8
            r8 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaC.g(int, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0020  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = 82 - r8
            byte[] r0 = kotlin.zaC.$$j
            int r1 = 39 - r6
            int r7 = r7 + 82
            byte[] r1 = new byte[r1]
            int r6 = 38 - r6
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r7 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r2
            r5 = r8
            r8 = r7
            r7 = r5
        L17:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r7 = r7 + 1
            int r4 = r3 + 1
            if (r3 != r6) goto L28
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L28:
            r3 = r0[r7]
        L2a:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + (-4)
            r3 = r4
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaC.h(short, short, byte, java.lang.Object[]):void");
    }

    zaC() {
        AudioAttributesImplBaseParcelizer();
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.zaC.1
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                zaC.this.MediaBrowserCompatItemReceiver();
            }
        });
        int i2 = AudioAttributesImplApi26Parcelizer + 109;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 61 / 0;
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 71;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getSubjectStat getsubjectstatWrite = AudioAttributesImplApi21Parcelizer().write();
        this.RemoteActionCompatParcelizer = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            int i4 = AudioAttributesImplApi26Parcelizer + 119;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            int i5 = i4 % 2;
            getSubjectStat getsubjectstat = this.RemoteActionCompatParcelizer;
            withFieldVisibility defaultViewModelCreationExtras = getDefaultViewModelCreationExtras();
            if (i5 != 0) {
                getsubjectstat.IconCompatParcelizer(defaultViewModelCreationExtras);
            } else {
                getsubjectstat.IconCompatParcelizer(defaultViewModelCreationExtras);
                throw null;
            }
        }
    }

    private static void f(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = AudioAttributesImplBaseParcelizer;
        int i4 = -470782045;
        int i5 = 43695;
        int i6 = 1;
        int i7 = 0;
        if (iArr3 != null) {
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i8 = 0;
            while (i8 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i8])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(i4);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (i5 - (ViewConfiguration.getTapTimeout() >> 16)), (ViewConfiguration.getEdgeSlop() >> 16) + 23297, 15 - View.resolveSizeAndState(0, 0, 0), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr4[i8] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i8++;
                    i4 = -470782045;
                    i5 = 43695;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i9 = $11 + 39;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = AudioAttributesImplBaseParcelizer;
        long j = 0;
        if (iArr6 != null) {
            int i11 = $10 + 119;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
            }
            int i12 = 0;
            while (i12 < length) {
                try {
                    Object[] objArr3 = new Object[i6];
                    objArr3[i7] = Integer.valueOf(iArr6[i12]);
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((KeyEvent.getMaxKeyCode() >> 16) + 43695), 23298 - (Process.getElapsedCpuTime() > j ? 1 : (Process.getElapsedCpuTime() == j ? 0 : -1)), ImageFormat.getBitsPerPixel(0) + 16, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr2[i12] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    i12++;
                    j = 0;
                    i6 = 1;
                    i7 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            i2 = i7;
            iArr6 = iArr2;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr6, i2, iArr5, i2, length3);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i2;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            cArr[i2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr5);
            int i13 = 0;
            for (int i14 = 16; i13 < i14; i14 = 16) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[i13];
                try {
                    Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (43695 - TextUtils.indexOf("", "", 0)), ExpandableListView.getPackedPositionGroup(0L) + 23297, 14 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                    buildremovealldownloadsintent.read = iIntValue;
                    i13++;
                    int i15 = $10 + 105;
                    $11 = i15 % 128;
                    if (i15 % 2 == 0) {
                        int i16 = 3 % 4;
                    }
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            }
            int i17 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i17;
            buildremovealldownloadsintent.read ^= iArr5[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[17];
            int i18 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i19 = buildremovealldownloadsintent.read;
            cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
            cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
            cArr[3] = (char) buildremovealldownloadsintent.read;
            buildRemoveAllDownloadsIntent.read(iArr5);
            cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
            Object[] objArr5 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(516305436);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 48193), 20126 - (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.argb(0, 0, 0, 0) + 20, 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            i2 = 0;
        }
        String str = new String(cArr2, 0, i);
        int i20 = $10 + 71;
        $11 = i20 % 128;
        if (i20 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0153  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r31) {
        /*
            Method dump skipped, instruction units count: 2495
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaC.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 59;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.RemoteActionCompatParcelizer;
        if (getsubjectstat != null) {
            getsubjectstat.AudioAttributesCompatParcelizer();
        }
        int i4 = AudioAttributesImplApi26Parcelizer + 87;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 67;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (i3 != 0) {
            ishighlightedAudioAttributesImplApi21Parcelizer.af_();
            throw null;
        }
        Object objAf_ = ishighlightedAudioAttributesImplApi21Parcelizer.af_();
        int i4 = AudioAttributesImplApi26Parcelizer + 77;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = AudioAttributesImplApi26Parcelizer + 61;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted AudioAttributesImplApi21Parcelizer() {
        if (this.IconCompatParcelizer == null) {
            synchronized (this.read) {
                if (this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = AudioAttributesImplApi26Parcelizer();
                }
            }
        }
        return this.IconCompatParcelizer;
    }

    private static void e(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = write;
        long j = -1;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (1 - (SystemClock.currentThreadTimeMillis() > j ? 1 : (SystemClock.currentThreadTimeMillis() == j ? 0 : -1))), 7015 - (ViewConfiguration.getTapTimeout() >> 16), 29 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i4++;
                    j = -1;
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
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollBarFadeDuration() >> 16), 7014 - ((byte) KeyEvent.getModifierMetaStateMask()), Color.alpha(0) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            int i5 = $10 + 85;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            needsstartedservice.AudioAttributesCompatParcelizer = 0;
            while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                    obj = obj2;
                } else {
                    Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getWindowTouchSlop() >> 8) + 48194), 20127 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), KeyEvent.normalizeMetaState(0) + 20, 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                        try {
                            Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 19369 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), 19 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            obj = null;
                            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                            int i7 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i7];
                        } catch (Throwable th2) {
                            Throwable cause2 = th2.getCause();
                            if (cause2 == null) {
                                throw th2;
                            }
                            throw cause2;
                        }
                    } else {
                        obj = null;
                        if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                            int i8 = $10 + 103;
                            $11 = i8 % 128;
                            int i9 = i8 % 2;
                            needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                            needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                            int i10 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            int i11 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i10];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i11];
                        } else {
                            int i12 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            int i13 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i12];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i13];
                        }
                    }
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
                obj2 = obj;
            }
        }
        for (int i14 = 0; i14 < i; i14++) {
            int i15 = $10 + 17;
            $11 = i15 % 128;
            int i16 = i15 % 2;
            cArr4[i14] = (char) (cArr4[i14] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    protected final void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        if (!this.AudioAttributesCompatParcelizer) {
            int i2 = AudioAttributesImplApi26Parcelizer + 63;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            this.AudioAttributesCompatParcelizer = true;
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 61;
            AudioAttributesImplApi26Parcelizer = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = MediaBrowserCompatCustomActionResultReceiver + 1;
        AudioAttributesImplApi26Parcelizer = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 5;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 7;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return RemoteActionCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = AudioAttributesImplApi26Parcelizer + 75;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) - 11, new int[]{-1184239262, 1862074856, -1857464919, 1083679535, 1068581135, 597437804, 268136170, -1138030345, -460598891, -1504773156, -857622300, 2071911575, 355943298, -1250057304}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(Drawable.resolveOpacity(0, 0) + 18, new char[]{11, ',', 13912, 13912, '%', 1, 0, 11, 13914, 13914, 4, 20, '\n', 23, 11, 25, '%', 5}, (byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 111), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = MediaBrowserCompatCustomActionResultReceiver + 23;
            AudioAttributesImplApi26Parcelizer = i4 % 128;
            if (i4 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i5 = MediaBrowserCompatCustomActionResultReceiver + 31;
                AudioAttributesImplApi26Parcelizer = i5 % 128;
                int i6 = i5 % 2;
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (KeyEvent.getMaxKeyCode() >> 16)), 6054 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getTapTimeout() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) View.combineMeasuredStates(0, 0), 6031 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), (ViewConfiguration.getEdgeSlop() >> 16) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x00b2  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 476
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaC.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x05f8  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0650 A[Catch: all -> 0x0a7f, TRY_ENTER, TRY_LEAVE, TryCatch #19 {all -> 0x0a7f, blocks: (B:94:0x05a5, B:100:0x05e9, B:109:0x0650), top: B:318:0x05a5 }] */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0938 A[Catch: all -> 0x0a7d, TryCatch #18 {all -> 0x0a7d, blocks: (B:133:0x092e, B:134:0x0932, B:136:0x0938, B:138:0x094e, B:141:0x095b, B:143:0x095e, B:150:0x09c0, B:156:0x0a47, B:158:0x0a4d, B:159:0x0a4e, B:161:0x0a50, B:163:0x0a57, B:164:0x0a58, B:111:0x0658, B:123:0x078d, B:125:0x0793, B:126:0x07d5, B:128:0x0896, B:129:0x08da, B:131:0x08f0, B:132:0x0928, B:169:0x0a6b, B:171:0x0a71, B:172:0x0a72, B:174:0x0a74, B:176:0x0a7b, B:177:0x0a7c, B:152:0x09c5, B:118:0x070b, B:120:0x071f, B:121:0x0781, B:146:0x098b, B:148:0x0991, B:149:0x09b9, B:113:0x06bc, B:115:0x06d0, B:116:0x0704), top: B:317:0x0658, inners: #5, #7, #10, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0acb A[Catch: all -> 0x0388, TryCatch #6 {all -> 0x0388, blocks: (B:221:0x0ee3, B:223:0x0ee9, B:224:0x0f0a, B:257:0x12bd, B:259:0x12c3, B:260:0x12e4, B:238:0x108e, B:240:0x10b0, B:241:0x10fc, B:188:0x0ac5, B:190:0x0acb, B:191:0x0af0, B:87:0x04ef, B:89:0x04f5, B:90:0x051b, B:23:0x0121, B:25:0x0127, B:26:0x014f, B:28:0x02fa, B:30:0x032b, B:31:0x0382), top: B:294:0x0121 }] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0b81  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0bc9  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0c1c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x0ec3  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x0f9d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0fdc  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x102c  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x129d  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x05ab A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:288:0x03ce A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:327:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x03ac A[Catch: all -> 0x03b3, TRY_LEAVE, TryCatch #14 {all -> 0x03b3, blocks: (B:37:0x0392, B:42:0x03a3, B:44:0x03ac), top: B:309:0x0392 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x041c A[Catch: all -> 0x0495, TRY_LEAVE, TryCatch #15 {all -> 0x0495, blocks: (B:57:0x040f, B:59:0x041c), top: B:311:0x040f }] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x047f  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x04f5 A[Catch: all -> 0x0388, TryCatch #6 {all -> 0x0388, blocks: (B:221:0x0ee3, B:223:0x0ee9, B:224:0x0f0a, B:257:0x12bd, B:259:0x12c3, B:260:0x12e4, B:238:0x108e, B:240:0x10b0, B:241:0x10fc, B:188:0x0ac5, B:190:0x0acb, B:191:0x0af0, B:87:0x04ef, B:89:0x04f5, B:90:0x051b, B:23:0x0121, B:25:0x0127, B:26:0x014f, B:28:0x02fa, B:30:0x032b, B:31:0x0382), top: B:294:0x0121 }] */
    /* JADX WARN: Type inference failed for: r4v38 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v41, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v60 */
    /* JADX WARN: Type inference failed for: r4v61 */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r36) {
        /*
            Method dump skipped, instruction units count: 5651
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaC.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 97;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 63;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }
}
