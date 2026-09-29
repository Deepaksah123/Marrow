package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Process;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
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
public abstract class setOutputSurfaceInfo extends addObserverForBackInvoker implements SubjectStat {
    private volatile isHighlighted AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private final Object RemoteActionCompatParcelizer;
    private getSubjectStat write;
    private static final byte[] $$l = {59, 77, -89, -73};
    private static final int $$m = 48;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {25, 68, TarConstants.LF_LINK, 97, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -50, -9, 5, 3, 1, 4, 67, -68, 4, 14, 0, 65, -73, 3, 28, 16, 7, 0, -16, -5, 1, -2, 18, 39, -31, -14, 14, -3, 4, 46, -41, 5, 0, 18, -16, 39, -14, -14, 18, 1, -4, 6, -14, 24, -10, 68, -73, 3, 25, -9, 8, 12, -8, 18};
    private static final int $$k = 153;
    private static final byte[] $$d = {TarConstants.LF_FIFO, -78, 96, -9, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 61;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static long read = -3600364332529009991L;
    private static char[] AudioAttributesImplBaseParcelizer = {28314, 28335, 28313, 28331, 28332, 28306, 28399, 28333, 28410, 28312, 28329, 28327, 28322, 28297, 28309, 28310, 28390, 28397, 28311, 28315, 28393, 28391, 28392, 28386, 28389, 28394, 28395, 28388, 28328, 28387, 28396, 28305, 28326, 28308, 28330, 28334, 28398, 28299};
    private static int AudioAttributesImplApi21Parcelizer = 411397949;
    private static boolean MediaBrowserCompatCustomActionResultReceiver = true;
    private static boolean MediaBrowserCompatItemReceiver = true;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(short r6, byte r7, int r8) {
        /*
            int r8 = r8 + 4
            int r6 = r6 * 4
            int r6 = 104 - r6
            byte[] r0 = kotlin.setOutputSurfaceInfo.$$l
            int r7 = r7 * 3
            int r1 = r7 + 1
            byte[] r1 = new byte[r1]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L2d
        L14:
            r3 = r2
        L15:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r1[r3] = r4
            int r6 = r6 + 1
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
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setOutputSurfaceInfo.$$n(short, byte, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r5, short r6, short r7, java.lang.Object[] r8) {
        /*
            int r0 = 44 - r7
            int r6 = r6 + 4
            byte[] r1 = kotlin.setOutputSurfaceInfo.$$d
            int r5 = r5 + 65
            byte[] r0 = new byte[r0]
            int r7 = 43 - r7
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r5
            r5 = r7
            r4 = r2
            goto L27
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r5
            r0[r3] = r4
            int r4 = r3 + 1
            int r6 = r6 + 1
            if (r3 != r7) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L25:
            r3 = r1[r6]
        L27:
            int r5 = r5 + r3
            int r5 = r5 + (-1)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setOutputSurfaceInfo.g(int, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(short r5, int r6, short r7, java.lang.Object[] r8) {
        /*
            int r0 = 38 - r7
            int r5 = r5 + 4
            byte[] r1 = kotlin.setOutputSurfaceInfo.$$j
            int r6 = r6 + 82
            byte[] r0 = new byte[r0]
            int r7 = 37 - r7
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L20:
            int r5 = r5 + 1
            int r3 = r3 + 1
            r4 = r1[r5]
        L26:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + 3
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setOutputSurfaceInfo.h(short, int, short, java.lang.Object[]):void");
    }

    setOutputSurfaceInfo() {
        this.RemoteActionCompatParcelizer = new Object();
        this.IconCompatParcelizer = false;
        AudioAttributesImplApi21Parcelizer();
    }

    setOutputSurfaceInfo(byte b) {
        super(R.layout.activity_better_search);
        this.RemoteActionCompatParcelizer = new Object();
        this.IconCompatParcelizer = false;
        AudioAttributesImplApi21Parcelizer();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.setOutputSurfaceInfo.3
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                setOutputSurfaceInfo.this.MediaBrowserCompatItemReceiver();
            }
        });
        int i2 = AudioAttributesImplApi26Parcelizer + 125;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 67;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        this.write = AudioAttributesImplApi26Parcelizer().write();
        if (!r1.RemoteActionCompatParcelizer()) {
            return;
        }
        this.write.IconCompatParcelizer(getDefaultViewModelCreationExtras());
        int i4 = MediaBrowserCompatMediaItem + 89;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(read ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        int i3 = $10 + 99;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i5 = $10 + 81;
            $11 = i5 % 128;
            int i6 = i5 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i7 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(read)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.getTrimmedLength(""), 12424 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 20 - View.resolveSizeAndState(0, 0, 0), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getOffsetAfter("", 0), MotionEvent.axisFromString("") + 1869, 10 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1983509525, false, $$n(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
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
        objArr[0] = new String(cArrAudioAttributesCompatParcelizer, 4, cArrAudioAttributesCompatParcelizer.length - 4);
    }

    private static void f(byte[] bArr, int i, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = AudioAttributesImplBaseParcelizer;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $10 + 67;
                $11 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (44862 - TextUtils.indexOf("", "", 0)), 18944 - (ViewConfiguration.getTapTimeout() >> 16), ((Process.getThreadPriority(0) + 20) >> 6) + 28, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i4++;
                    i2 = 2;
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
            objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.green(0), 19033 - (ViewConfiguration.getLongPressTimeout() >> 16), ExpandableListView.getPackedPositionType(0L) + 75, 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        int i7 = -1593953308;
        if (MediaBrowserCompatItemReceiver) {
            int i8 = $11 + 107;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr4 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(i7);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 11439 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 13 - ((byte) KeyEvent.getModifierMetaStateMask()), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                i7 = -1593953308;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (MediaBrowserCompatCustomActionResultReceiver) {
            notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                Object[] objArr5 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getLongPressTimeout() >> 16), 11487 - AndroidCharacter.getMirror('0'), 14 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                int i10 = $10 + 21;
                $11 = i10 % 128;
                if (i10 % 2 == 0) {
                    int i11 = 3 / 4;
                }
            }
            objArr[0] = new String(cArr5);
            return;
        }
        notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        int i12 = $11 + 101;
        $10 = i12 % 128;
        int i13 = i12 % 2;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
            notifydownloads.IconCompatParcelizer++;
        }
        String str = new String(cArr6);
        int i14 = $11 + 45;
        $10 = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x012d  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00b2  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r25) {
        /*
            Method dump skipped, instruction units count: 2142
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setOutputSurfaceInfo.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 35;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.write;
        if (getsubjectstat != null) {
            int i4 = MediaBrowserCompatMediaItem + 17;
            AudioAttributesImplApi26Parcelizer = i4 % 128;
            int i5 = i4 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
            if (i5 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 107;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplApi26Parcelizer().af_();
        int i4 = MediaBrowserCompatMediaItem + 49;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = AudioAttributesImplApi26Parcelizer + 55;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            return ishighlighted;
        }
        throw null;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        if (this.AudioAttributesCompatParcelizer == null) {
            synchronized (this.RemoteActionCompatParcelizer) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    this.AudioAttributesCompatParcelizer = MediaBrowserCompatCustomActionResultReceiver();
                }
            }
        }
        return this.AudioAttributesCompatParcelizer;
    }

    protected final void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 87;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 76 / 0;
            if (this.IconCompatParcelizer) {
                return;
            }
        } else if (this.IconCompatParcelizer) {
            return;
        }
        this.IconCompatParcelizer = true;
        int i4 = MediaBrowserCompatMediaItem + 49;
        AudioAttributesImplApi26Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi26Parcelizer + 95;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = AudioAttributesImplApi26Parcelizer + 77;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
        return RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 372
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setOutputSurfaceInfo.onResume():void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 79;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f(new byte[]{-125, -127, -112, -124, -113, -114, -115, -117, -122, -116, -122, -117, -118, -119, -121, -120, -120, -127, -121, -125, -122, -123, -124, -125, -126, -127}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, null, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e(KeyEvent.getDeadChar(0, 0), new char[]{58179, 58144, 17954, 58082, 27338, 10869, 15060, 11998, 21422, 23270, 27226, 40549, 33315, 35680, 56282, 53205, 62136, 15353, 2890, 16221, 8460, 26638}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - Color.green(0)), 6054 - (ViewConfiguration.getJumpTapTimeout() >> 16), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 6030 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 24, -861814097, false, "read", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i4 = AudioAttributesImplApi26Parcelizer + 15;
                MediaBrowserCompatMediaItem = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
        int i6 = MediaBrowserCompatMediaItem + 71;
        AudioAttributesImplApi26Parcelizer = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 63 / 0;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x00ae  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r32) {
        /*
            Method dump skipped, instruction units count: 5396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.setOutputSurfaceInfo.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 65;
        AudioAttributesImplApi26Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
    }
}
