package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class DynamiteModuleDynamiteLoaderClassLoader extends addObserverForBackInvoker implements SubjectStat {
    private getSubjectStat IconCompatParcelizer;
    private volatile isHighlighted write;
    private static final byte[] $$c = {9, -34, 82, 56};
    private static final int $$f = 86;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {3, 113, -44, TarConstants.LF_BLK, -14, 0, 61, -59, -10, -2, 6, -7, 5, TarConstants.LF_DIR, -53, -15, 8, -16, 1, 4, 3, TarConstants.LF_BLK, -59, -8, -8, 67, -55, -14, 0, -2, -4, -1, 62, -73, -1, 9, -5, 60, -78, -2, 23, 11, 2, -5, -21, -10, -4, -7, 13, 34, -36, -19, 9, -8, -1, 41, -46, 0, -5, 13, -21, 34, -19, -19, 13, -4, -9, 1, -19, 19, -15, 63, -59, 0, -17, 44, -43, -1, -8, 31, -24, -19, 19, 14, -27, 3, -13, 78, -48, -21, -10, -4, -7, 13, 34, -36, -19, 9, -8, -1, 41, -46, 0, -5, 13, -21, 34, -19, -19, 13, -4, -9, 1, -19, 19, -15, 17};
    private static final int $$h = 128;
    private static final byte[] $$a = {59, 79, 7, -2, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 225;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int MediaBrowserCompatItemReceiver = 1;
    private static long RemoteActionCompatParcelizer = 5697202570021019331L;
    private static long AudioAttributesImplApi21Parcelizer = -3498762522182953692L;
    private static int AudioAttributesImplBaseParcelizer = -1842135871;
    private static char AudioAttributesImplApi26Parcelizer = 54564;
    private final Object read = new Object();
    private boolean AudioAttributesCompatParcelizer = false;

    private static String $$i(short s, byte b, byte b2) {
        byte[] bArr = $$c;
        int i = 4 - (b * 3);
        int i2 = s + 103;
        int i3 = b2 * 4;
        byte[] bArr2 = new byte[1 - i3];
        int i4 = 0 - i3;
        int i5 = -1;
        if (bArr == null) {
            i2 = i4 + i;
            i++;
            i5 = -1;
        }
        while (true) {
            int i6 = i5 + 1;
            bArr2[i6] = (byte) i2;
            if (i6 == i4) {
                return new String(bArr2, 0);
            }
            int i7 = i;
            i2 += bArr[i];
            i = i7 + 1;
            i5 = i6;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            int r6 = 190 - r6
            int r0 = 44 - r5
            int r7 = r7 + 65
            byte[] r1 = kotlin.DynamiteModuleDynamiteLoaderClassLoader.$$a
            byte[] r0 = new byte[r0]
            int r5 = 43 - r5
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r5
            r4 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L22:
            int r6 = r6 + 1
            r3 = r1[r6]
        L26:
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DynamiteModuleDynamiteLoaderClassLoader.c(short, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 4
            int r9 = 71 - r9
            int r7 = r7 + 82
            byte[] r0 = kotlin.DynamiteModuleDynamiteLoaderClassLoader.$$g
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r9
            r4 = r2
            r9 = r8
            goto L27
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r8) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            r3 = r0[r9]
            r6 = r9
            r9 = r7
            r7 = r3
            r3 = r6
        L27:
            int r7 = -r7
            int r9 = r9 + r7
            int r7 = r9 + (-2)
            int r9 = r3 + 1
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DynamiteModuleDynamiteLoaderClassLoader.d(byte, short, short, java.lang.Object[]):void");
    }

    DynamiteModuleDynamiteLoaderClassLoader() {
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.DynamiteModuleDynamiteLoaderClassLoader.3
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                DynamiteModuleDynamiteLoaderClassLoader.this.MediaBrowserCompatItemReceiver();
            }
        });
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 5;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 81 / 0;
        }
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 49;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        this.IconCompatParcelizer = AudioAttributesImplBaseParcelizer().write();
        if (!(!r1.RemoteActionCompatParcelizer())) {
            int i4 = MediaBrowserCompatItemReceiver + 75;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            if (i4 % 2 != 0) {
                this.IconCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                throw null;
            }
            this.IconCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
        }
        int i5 = MediaBrowserCompatItemReceiver + 53;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        int i6 = i5 % 2;
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        int i3 = $10 + 35;
        $11 = i3 % 128;
        int i4 = i3 % 2;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i5 = $11 + 107;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i7 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(RemoteActionCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (1 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (ViewConfiguration.getTouchSlop() >> 8) + 12424, (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 19, -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 1;
                    byte b2 = (byte) (b - 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 1869, 10 - ((Process.getThreadPriority(0) + 20) >> 6), 1983509525, false, $$i(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i8 = $11 + 123;
                $10 = i8 % 128;
                int i9 = i8 % 2;
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

    private static void b(char[] cArr, char c, char[] cArr2, char[] cArr3, int i, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
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
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i4 = $11 + 59;
            $10 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getMinimumFlingVelocity() >> 16), View.resolveSizeAndState(0, 0, 0) + 22748, (ViewConfiguration.getTouchSlop() >> 8) + 36, 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getEdgeSlop() >> 16) + 31369), (ViewConfiguration.getEdgeSlop() >> 16) + 2721, 38 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1895162189, false, $$i(b, b2, b2), new Class[]{Object.class});
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getTapTimeout() >> 16), Color.green(0) + 15713, View.MeasureSpec.getSize(0) + 64, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 40976), (ViewConfiguration.getWindowTouchSlop() >> 8) + 6122, 29 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (AudioAttributesImplApi21Parcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) AudioAttributesImplBaseParcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) AudioAttributesImplApi26Parcelizer) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                int i6 = $11 + 1;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                i2 = 2;
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x0089  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r37) {
        /*
            Method dump skipped, instruction units count: 2769
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DynamiteModuleDynamiteLoaderClassLoader.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        getSubjectStat getsubjectstat;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 45;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            getsubjectstat = this.IconCompatParcelizer;
            int i3 = 22 / 0;
            if (getsubjectstat == null) {
                return;
            }
        } else {
            super.onDestroy();
            getsubjectstat = this.IconCompatParcelizer;
            if (getsubjectstat == null) {
                return;
            }
        }
        getsubjectstat.AudioAttributesCompatParcelizer();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 115;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 95;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplBaseParcelizer().af_();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 81;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 91;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 56 / 0;
        }
        return ishighlighted;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        if (this.write == null) {
            synchronized (this.read) {
                if (this.write == null) {
                    this.write = AudioAttributesImplApi26Parcelizer();
                }
            }
        }
        return this.write;
    }

    protected final void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver;
        int i3 = i2 + 7;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
        if (!(!this.AudioAttributesCompatParcelizer)) {
            return;
        }
        int i5 = i2 + 59;
        MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
        int i6 = i5 % 2;
        this.AudioAttributesCompatParcelizer = true;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 85;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 73;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return RemoteActionCompatParcelizer2;
        }
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
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
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DynamiteModuleDynamiteLoaderClassLoader.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x008c  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DynamiteModuleDynamiteLoaderClassLoader.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0613 A[Catch: all -> 0x0ad9, TRY_LEAVE, TryCatch #15 {all -> 0x0ad9, blocks: (B:92:0x0562, B:94:0x0568, B:95:0x05af, B:97:0x05bc, B:99:0x05c5, B:100:0x0608, B:123:0x0967, B:124:0x096b, B:128:0x097d, B:133:0x09ac, B:136:0x09c2, B:138:0x09c5, B:145:0x0a29, B:151:0x0ab3, B:153:0x0ab9, B:154:0x0aba, B:156:0x0abc, B:158:0x0ac3, B:159:0x0ac4, B:131:0x0995, B:101:0x0613, B:113:0x0793, B:115:0x0799, B:116:0x07da, B:118:0x08bc, B:119:0x08fe, B:121:0x0914, B:122:0x0961, B:161:0x0ac6, B:163:0x0acd, B:164:0x0ace, B:166:0x0ad0, B:168:0x0ad7, B:169:0x0ad8, B:108:0x0710, B:110:0x0725, B:111:0x0787, B:103:0x06c8, B:105:0x06da, B:106:0x0709, B:147:0x0a38, B:141:0x09ee, B:143:0x09f4, B:144:0x0a22), top: B:298:0x0562, outer: #7, inners: #2, #6, #9, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0971  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x09b8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x09f4 A[Catch: all -> 0x0abb, TryCatch #16 {all -> 0x0abb, blocks: (B:141:0x09ee, B:143:0x09f4, B:144:0x0a22), top: B:299:0x09ee, outer: #15 }] */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0c15  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0c5b  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0caf  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0faa  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x108c  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x10db  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x1139  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x1487  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x034d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:313:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x04a6 A[Catch: all -> 0x0313, TryCatch #10 {all -> 0x0313, blocks: (B:209:0x0fc8, B:211:0x0fce, B:212:0x0ff4, B:245:0x14a7, B:247:0x14ad, B:248:0x14d1, B:226:0x11f8, B:228:0x121b, B:229:0x1268, B:176:0x0b56, B:178:0x0b5c, B:179:0x0b82, B:85:0x04a0, B:87:0x04a6, B:88:0x04cd, B:23:0x00a4, B:25:0x00aa, B:26:0x00d0, B:28:0x0280, B:30:0x02b2, B:31:0x030d), top: B:289:0x00a4 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0568 A[Catch: all -> 0x0ad9, TryCatch #15 {all -> 0x0ad9, blocks: (B:92:0x0562, B:94:0x0568, B:95:0x05af, B:97:0x05bc, B:99:0x05c5, B:100:0x0608, B:123:0x0967, B:124:0x096b, B:128:0x097d, B:133:0x09ac, B:136:0x09c2, B:138:0x09c5, B:145:0x0a29, B:151:0x0ab3, B:153:0x0ab9, B:154:0x0aba, B:156:0x0abc, B:158:0x0ac3, B:159:0x0ac4, B:131:0x0995, B:101:0x0613, B:113:0x0793, B:115:0x0799, B:116:0x07da, B:118:0x08bc, B:119:0x08fe, B:121:0x0914, B:122:0x0961, B:161:0x0ac6, B:163:0x0acd, B:164:0x0ace, B:166:0x0ad0, B:168:0x0ad7, B:169:0x0ad8, B:108:0x0710, B:110:0x0725, B:111:0x0787, B:103:0x06c8, B:105:0x06da, B:106:0x0709, B:147:0x0a38, B:141:0x09ee, B:143:0x09f4, B:144:0x0a22), top: B:298:0x0562, outer: #7, inners: #2, #6, #9, #16 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x05bc A[Catch: all -> 0x0ad9, TryCatch #15 {all -> 0x0ad9, blocks: (B:92:0x0562, B:94:0x0568, B:95:0x05af, B:97:0x05bc, B:99:0x05c5, B:100:0x0608, B:123:0x0967, B:124:0x096b, B:128:0x097d, B:133:0x09ac, B:136:0x09c2, B:138:0x09c5, B:145:0x0a29, B:151:0x0ab3, B:153:0x0ab9, B:154:0x0aba, B:156:0x0abc, B:158:0x0ac3, B:159:0x0ac4, B:131:0x0995, B:101:0x0613, B:113:0x0793, B:115:0x0799, B:116:0x07da, B:118:0x08bc, B:119:0x08fe, B:121:0x0914, B:122:0x0961, B:161:0x0ac6, B:163:0x0acd, B:164:0x0ace, B:166:0x0ad0, B:168:0x0ad7, B:169:0x0ad8, B:108:0x0710, B:110:0x0725, B:111:0x0787, B:103:0x06c8, B:105:0x06da, B:106:0x0709, B:147:0x0a38, B:141:0x09ee, B:143:0x09f4, B:144:0x0a22), top: B:298:0x0562, outer: #7, inners: #2, #6, #9, #16 }] */
    /* JADX WARN: Type inference failed for: r5v30 */
    /* JADX WARN: Type inference failed for: r5v31 */
    /* JADX WARN: Type inference failed for: r5v32 */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8, types: [java.lang.CharSequence, java.lang.String] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r34) {
        /*
            Method dump skipped, instruction units count: 6429
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.DynamiteModuleDynamiteLoaderClassLoader.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 19;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 117;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
