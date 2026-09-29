package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class createBigInteger extends addObserverForBackInvoker implements SubjectStat {
    private volatile isHighlighted RemoteActionCompatParcelizer;
    private getSubjectStat read;
    private static final byte[] $$l = {18, 96, 87, -114};
    private static final int $$m = 252;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {9, -34, 82, 56, -5, 9, 70, -50, -1, 7, 15, 2, 14, 62, -44, -6, 17, -7, 10, 13, 12, 61, -50, 1, 1, TarConstants.LF_GNUTYPE_LONGNAME, -46, -5, 9, 7, 5, 8, 71, -64, 8, 18, 4, 69, -69, 7, 32, 20, 11, 4, -12, -1, 5, 2, 22, 43, -27, -10, 18, 1, 8, TarConstants.LF_SYMLINK, -37, 9, 4, 22, -12, 43, -10, -10, 22, 5, 0, 10, -10, 28, -6, 72, -16, 5, 2, 0, -27, 10, 19, 12, 5, 5, 24, -10, -12, 11, 6, 10, 20, 72, -76, 12, 16, -4, 22, -19, -5, 8, TarConstants.LF_SYMLINK, -37, 9, 4, 22, -12, 43, -10, -10, 22, 5, 0, 10, -10, 28, -6};
    private static final int $$k = 136;
    private static final byte[] $$d = {29, -75, -112, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 156;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int AudioAttributesImplApi21Parcelizer = 1;
    private static long AudioAttributesCompatParcelizer = 48785965689676206L;
    private static int[] AudioAttributesImplBaseParcelizer = {-2063992003, -1503498399, -538498319, 482178966, 1152761478, -1637837017, -2005610414, 924324168, -941367687, 1893775804, 1395791743, 61476793, 900141432, -1815830829, -1848561620, -1687884870, 1057896860, -153209930};
    private final Object IconCompatParcelizer = new Object();
    private boolean write = false;

    private static String $$n(byte b, int i, int i2) {
        int i3 = b * 2;
        int i4 = 4 - (i2 * 2);
        byte[] bArr = $$l;
        int i5 = (i * 2) + 104;
        byte[] bArr2 = new byte[i3 + 1];
        int i6 = -1;
        if (bArr == null) {
            i5 = i3 + i5;
            i4++;
        }
        while (true) {
            i6++;
            bArr2[i6] = (byte) i5;
            if (i6 == i3) {
                return new String(bArr2, 0);
            }
            i5 += bArr[i4];
            i4++;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.createBigInteger.$$d
            int r7 = r7 + 4
            int r5 = 114 - r5
            int r1 = r6 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = -1
            if (r0 != 0) goto L13
            r4 = r5
            r5 = r6
            r3 = r2
            goto L26
        L13:
            r3 = r2
        L14:
            int r3 = r3 + 1
            byte r4 = (byte) r5
            r1[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r6 = 0
            r5.<init>(r1, r6)
            r8[r6] = r5
            return
        L24:
            r4 = r0[r7]
        L26:
            int r5 = r5 + r4
            int r5 = r5 + r2
            int r7 = r7 + 1
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createBigInteger.g(int, int, int, java.lang.Object[]):void");
    }

    private static void h(short s, short s2, int i, Object[] objArr) {
        int i2 = s2 + 73;
        int i3 = 94 - i;
        byte[] bArr = $$j;
        byte[] bArr2 = new byte[38 - s];
        int i4 = 37 - s;
        int i5 = -1;
        if (bArr == null) {
            i2 = i3 + (-i2) + 7;
            i3 = i3;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            int i7 = i3 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2 = i2 + (-bArr[i7]) + 7;
            i3 = i7;
            i5 = i6;
        }
    }

    createBigInteger() {
        AudioAttributesImplApi21Parcelizer();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.createBigInteger.5
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                createBigInteger.this.MediaBrowserCompatCustomActionResultReceiver();
            }
        });
        int i2 = AudioAttributesImplApi21Parcelizer + 65;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        getSubjectStat getsubjectstatWrite = MediaBrowserCompatItemReceiver().write();
        this.read = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            int i2 = AudioAttributesImplApi21Parcelizer + 97;
            MediaBrowserCompatItemReceiver = i2 % 128;
            if (i2 % 2 != 0) {
                this.read.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                int i3 = 36 / 0;
            } else {
                this.read.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            }
        }
        int i4 = MediaBrowserCompatItemReceiver + 53;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $10 + 37;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(AudioAttributesCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (ViewConfiguration.getWindowTouchSlop() >> 8) + 12424, 20 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), ImageFormat.getBitsPerPixel(0) + 1869, 11 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 1983509525, false, $$n(b, b2, b2), new Class[]{Object.class, Object.class});
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
        String str = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
        int i6 = $11 + 125;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    private static void f(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = AudioAttributesImplBaseParcelizer;
        int i4 = -470782045;
        int i5 = 43695;
        int i6 = 0;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 65;
                $10 = i8 % 128;
                int i9 = i8 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i7])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(i4);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.getTrimmedLength("") + i5), 23297 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr3[i7] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i7++;
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
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = AudioAttributesImplBaseParcelizer;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i10 = 0;
            while (i10 < length3) {
                int i11 = $11 + 19;
                $10 = i11 % 128;
                int i12 = i11 % i2;
                Object[] objArr3 = new Object[1];
                objArr3[i6] = Integer.valueOf(iArr5[i10]);
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (43695 - View.combineMeasuredStates(i6, i6)), 23296 - ExpandableListView.getPackedPositionChild(0L), Color.argb(i6, i6, i6, i6) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                }
                iArr6[i10] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                i10++;
                i2 = 2;
                i6 = 0;
            }
            iArr5 = iArr6;
        }
        int i13 = i6;
        System.arraycopy(iArr5, i13, iArr4, i13, length2);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i13;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            int i14 = $11 + 71;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr4);
            int i16 = $11 + 115;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            for (int i18 = 0; i18 < 16; i18++) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i18];
                try {
                    Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (43695 - Color.argb(0, 0, 0, 0)), 23297 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 14 - TextUtils.lastIndexOf("", '0', 0), -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                    buildremovealldownloadsintent.read = iIntValue;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i19 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i19;
            buildremovealldownloadsintent.read ^= iArr4[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[17];
            int i20 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i21 = buildremovealldownloadsintent.read;
            cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
            cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
            cArr[3] = (char) buildremovealldownloadsintent.read;
            buildRemoveAllDownloadsIntent.read(iArr4);
            cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
            Object[] objArr5 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(516305436);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (48194 - (ViewConfiguration.getLongPressTimeout() >> 16)), View.MeasureSpec.getSize(0) + 20126, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20, 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x008a  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r31) {
        /*
            Method dump skipped, instruction units count: 2272
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createBigInteger.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.read;
        if (getsubjectstat != null) {
            getsubjectstat.AudioAttributesCompatParcelizer();
            int i2 = MediaBrowserCompatItemReceiver + 107;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = MediaBrowserCompatItemReceiver + 53;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 51;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = MediaBrowserCompatItemReceiver().af_();
        int i4 = MediaBrowserCompatItemReceiver + 25;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return objAf_;
        }
        throw null;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = AudioAttributesImplApi21Parcelizer + 77;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        if (this.RemoteActionCompatParcelizer == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.RemoteActionCompatParcelizer == null) {
                    this.RemoteActionCompatParcelizer = AudioAttributesImplBaseParcelizer();
                }
            }
        }
        return this.RemoteActionCompatParcelizer;
    }

    protected final void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        if (!this.write) {
            this.write = true;
            int i2 = AudioAttributesImplApi21Parcelizer + 63;
            MediaBrowserCompatItemReceiver = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = AudioAttributesImplApi21Parcelizer + 119;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 49;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = MediaBrowserCompatItemReceiver + 73;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        return RemoteActionCompatParcelizer;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 3;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            getBaseContext();
            obj.hashCode();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 3, new char[]{9395, 9426, 35455, 64804, 51764, 42813, 9274, 49872, 63496, 56863, 366, 58720, 40314, 47826, 25174, 47188, 45710, 34733, 20134, 23375, 22421, 24723, 44026, 32683, 29891, 19790, 62664, 4763, 2090, 11830}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).codePointAt(1) - 31, new int[]{-1680366005, 1568835451, -46806965, 1918196203, 448340144, -1965211411, 1996858431, -1549438430, 894108454, -1957685724}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i3 = MediaBrowserCompatItemReceiver + 115;
            AudioAttributesImplApi21Parcelizer = i3 % 128;
            if (i3 % 2 == 0) {
                boolean z = baseContext instanceof ContextWrapper;
                throw null;
            }
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 4536), 6054 - View.combineMeasuredStates(0, 0), TextUtils.lastIndexOf("", '0', 0) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollBarSize() >> 8), 6030 - (ViewConfiguration.getFadingEdgeLength() >> 16), 25 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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
        int i4 = MediaBrowserCompatItemReceiver + 61;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = AudioAttributesImplApi21Parcelizer + 105;
            MediaBrowserCompatItemReceiver = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3), new char[]{9395, 9426, 35455, 64804, 51764, 42813, 9274, 49872, 63496, 56863, 366, 58720, 40314, 47826, 25174, 47188, 45710, 34733, 20134, 23375, 22421, 24723, 44026, 32683, 29891, 19790, 62664, 4763, 2090, 11830}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 14, new int[]{-1680366005, 1568835451, -46806965, 1918196203, 448340144, -1965211411, 1996858431, -1549438430, 894108454, -1957685724}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = MediaBrowserCompatItemReceiver + 125;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            int i5 = i4 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4534 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6054, 42 - View.MeasureSpec.getSize(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.alpha(0), 6030 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 24 - View.MeasureSpec.getMode(0), -861814097, false, "read", new Class[]{Context.class});
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
        int i6 = AudioAttributesImplApi21Parcelizer + 105;
        MediaBrowserCompatItemReceiver = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:177:0x0a0a A[Catch: all -> 0x02b8, TryCatch #13 {all -> 0x02b8, blocks: (B:175:0x0a04, B:177:0x0a0a, B:178:0x0a35, B:214:0x0e51, B:216:0x0e57, B:217:0x0e7e, B:251:0x1250, B:253:0x1256, B:254:0x1279, B:232:0x103f, B:234:0x1061, B:235:0x10ac, B:67:0x0417, B:69:0x041d, B:70:0x0449, B:17:0x00d6, B:19:0x00dc, B:20:0x0104, B:22:0x022d, B:24:0x025d, B:25:0x02b2), top: B:301:0x00d6 }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0ac9  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0b14  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0bcb  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0e32  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0f16  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0f62  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0fb7  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x1231  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x02bc  */
    /* JADX WARN: Removed duplicated region for block: B:314:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00b9  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r33) {
        /*
            Method dump skipped, instruction units count: 5596
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createBigInteger.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 99;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onStart();
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = MediaBrowserCompatItemReceiver + 3;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
