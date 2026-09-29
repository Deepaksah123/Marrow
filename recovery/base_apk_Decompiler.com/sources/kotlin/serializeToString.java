package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class serializeToString extends addObserverForBackInvoker implements SubjectStat {
    private volatile isHighlighted IconCompatParcelizer;
    private getSubjectStat write;
    private static final byte[] $$c = {112, -82, -21, -22};
    private static final int $$f = 107;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {19, -74, 60, -114, -61, 27, TarConstants.LF_CONTIG, -5, -27, 32, -7, 28, -16, 17, -37, 40, 7, 0, -37, TarConstants.LF_NORMAL, 2, 7, 3, 3, -5, 13, 10, -36, 33, 14, 5, -11, 13, -5, 17, -41, TarConstants.LF_CONTIG, 0, -11, 17, 0, -9, 15, -21, 42, -7, 10, -8, 1, 19, -7, -2, -19, 25, 16, -7, 6, 1, -43, 30, 16, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, 23, 12, 6, 9, -11, -32, 38, 21, -7, 10, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, -61, 61, 2, 19, -30, 19, 23, -7, 9, -3, -9, 0, 7};
    private static final int $$h = 249;
    private static final byte[] $$a = {109, -42, -99, -39, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 218;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static long RemoteActionCompatParcelizer = -2919509739185289531L;
    private static long AudioAttributesImplApi26Parcelizer = -1443034329015701408L;
    private final Object read = new Object();
    private boolean AudioAttributesCompatParcelizer = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(int r7, byte r8, byte r9) {
        /*
            int r7 = 121 - r7
            int r8 = r8 * 4
            int r8 = 4 - r8
            byte[] r0 = kotlin.serializeToString.$$c
            int r9 = r9 * 4
            int r9 = r9 + 1
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L14
            r3 = r8
            r4 = r2
            goto L27
        L14:
            r3 = r2
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L22
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L22:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L27:
            int r8 = -r8
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeToString.$$i(int, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r7 = 191 - r7
            byte[] r0 = kotlin.serializeToString.$$a
            int r9 = r9 + 4
            int r8 = r8 + 65
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L11
            r8 = r7
            r3 = r9
            r4 = r2
            goto L27
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L27:
            int r7 = -r7
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            int r8 = r8 + 1
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeToString.c(short, byte, byte, java.lang.Object[]):void");
    }

    private static void d(int i, short s, byte b, Object[] objArr) {
        byte[] bArr = $$g;
        int i2 = b + 73;
        int i3 = 114 - s;
        byte[] bArr2 = new byte[56 - i];
        int i4 = 55 - i;
        int i5 = -1;
        if (bArr == null) {
            i2 = (i2 + i4) - 4;
        }
        while (true) {
            i3++;
            i5++;
            bArr2[i5] = (byte) i2;
            if (i5 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i2 = (i2 + bArr[i3]) - 4;
        }
    }

    serializeToString() {
        AudioAttributesImplApi21Parcelizer();
    }

    private void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.serializeToString.1
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                serializeToString.this.MediaBrowserCompatCustomActionResultReceiver();
            }
        });
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 69;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 77;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            getSubjectStat getsubjectstatWrite = AudioAttributesImplApi26Parcelizer().write();
            this.write = getsubjectstatWrite;
            if (!getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                return;
            }
            this.write.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            int i3 = MediaBrowserCompatCustomActionResultReceiver + 89;
            MediaBrowserCompatItemReceiver = i3 % 128;
            int i4 = i3 % 2;
            return;
        }
        getSubjectStat getsubjectstatWrite2 = AudioAttributesImplApi26Parcelizer().write();
        this.write = getsubjectstatWrite2;
        getsubjectstatWrite2.RemoteActionCompatParcelizer();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(AudioAttributesImplApi26Parcelizer ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $11 + 15;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(AudioAttributesImplApi26Parcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) KeyEvent.getDeadChar(0, 0), (Process.myTid() >> 22) + 12424, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 20, -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getLongPressTimeout() >> 16) + 1868, (ViewConfiguration.getDoubleTapTimeout() >> 16) + 10, 1983509525, false, $$i((byte) 17, b, b), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i6 = $11 + 85;
                $10 = i6 % 128;
                int i7 = i6 % 2;
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

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = $11 + 121;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int i5 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (Color.green(0) + 38461), TextUtils.indexOf((CharSequence) "", '0', 0) + 533, 8 - Color.argb(0, 0, 0, 0), -735610793, false, $$i(b, b2, b2), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i5] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (RemoteActionCompatParcelizer ^ 2192498202983240651L);
                Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 36622);
                    int iNormalizeMetaState = 2340 - KeyEvent.normalizeMetaState(0);
                    int threadPriority = 28 - ((Process.getThreadPriority(0) + 20) >> 6);
                    byte b3 = (byte) ($$f & 6);
                    byte b4 = (byte) (b3 - 2);
                    objRemoteActionCompatParcelizer2 = startForeground.read(cIndexOf, iNormalizeMetaState, threadPriority, 188119637, false, $$i(b3, b4, b4), new Class[]{Object.class, Object.class});
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
            int i6 = $10 + 101;
            $11 = i6 % 128;
            if (i6 % 2 == 0) {
                cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
                Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 36621);
                    int iNormalizeMetaState2 = 2340 - KeyEvent.normalizeMetaState(0);
                    int iIndexOf = 27 - TextUtils.indexOf((CharSequence) "", '0', 0);
                    byte b5 = (byte) ($$f & 6);
                    byte b6 = (byte) (b5 - 2);
                    objRemoteActionCompatParcelizer3 = startForeground.read(cResolveSizeAndState, iNormalizeMetaState2, iIndexOf, 188119637, false, $$i(b5, b6, b6), new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                obj.hashCode();
                throw null;
            }
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr5 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer4 == null) {
                char offsetAfter = (char) (36621 - TextUtils.getOffsetAfter("", 0));
                int iIndexOf2 = TextUtils.indexOf((CharSequence) "", '0', 0) + 2341;
                int i7 = 29 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1));
                byte b7 = (byte) ($$f & 6);
                byte b8 = (byte) (b7 - 2);
                objRemoteActionCompatParcelizer4 = startForeground.read(offsetAfter, iIndexOf2, i7, 188119637, false, $$i(b7, b8, b8), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        String str = new String(cArr2);
        int i8 = $10 + 119;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00b4  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r31) {
        /*
            Method dump skipped, instruction units count: 2315
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeToString.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 95;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            getSubjectStat getsubjectstat = this.write;
            if (getsubjectstat != null) {
                getsubjectstat.AudioAttributesCompatParcelizer();
                int i3 = MediaBrowserCompatItemReceiver + 61;
                MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
                int i4 = i3 % 2;
                return;
            }
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
        int i2 = MediaBrowserCompatItemReceiver + 31;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplApi26Parcelizer().af_();
        int i4 = MediaBrowserCompatItemReceiver + 113;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return objAf_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatItemReceiver + 77;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 97 / 0;
        }
        return ishighlighted;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        if (this.IconCompatParcelizer == null) {
            synchronized (this.read) {
                if (this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = AudioAttributesImplBaseParcelizer();
                }
            }
        }
        return this.IconCompatParcelizer;
    }

    protected final void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 69;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.AudioAttributesCompatParcelizer) {
            return;
        }
        this.AudioAttributesCompatParcelizer = true;
        int i3 = MediaBrowserCompatItemReceiver + 5;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        int i4 = i3 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 51;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer2 = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 119;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        return RemoteActionCompatParcelizer2;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 1;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            getBaseContext();
            throw null;
        }
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(9) - 118, new char[]{59789, 48779, 59884, 4180, 9547, 55326, 56774, 4552, 29198, 48133, 31186, 62904, 56884, 8232, 5610, 18860, 14856, 33879, 45466, 11671, 34379, 26697, 11654, 33171, 57925, 52340, 51636, 26019, 20068, 45164}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(1 - (ViewConfiguration.getDoubleTapTimeout() >> 16), new char[]{44684, 7919, 44783, 54128, 7556, 30817, 7924, 10503, 13573, 7270, 47846, 52504, 39204, 32844, 54994, 28964, 32043, 9265, 29374, 5464, 49491, 51242}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i3 = MediaBrowserCompatCustomActionResultReceiver + 7;
            MediaBrowserCompatItemReceiver = i3 % 128;
            int i4 = i3 % 2;
        }
        if (baseContext != null) {
            baseContext = (!((baseContext instanceof ContextWrapper) ^ true) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4536 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), TextUtils.indexOf((CharSequence) "", '0', 0) + 6055, 42 - (ViewConfiguration.getFadingEdgeLength() >> 16), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ExpandableListView.getPackedPositionChild(0L) + 1), TextUtils.getOffsetAfter("", 0) + 6030, MotionEvent.axisFromString("") + 25, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i5 = MediaBrowserCompatItemReceiver + 83;
                MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
                int i6 = i5 % 2;
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

    /* JADX WARN: Removed duplicated region for block: B:16:0x008f  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 338
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeToString.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0b00  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0b4f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0ba6  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0de4  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0ec1  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x0f0c  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0f67  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x11d0  */
    /* JADX WARN: Removed duplicated region for block: B:306:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x06c5  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0703 A[Catch: all -> 0x07b8, TryCatch #11 {all -> 0x07b8, blocks: (B:91:0x06fd, B:93:0x0703, B:94:0x072b), top: B:289:0x06fd, outer: #13 }] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r33) {
        /*
            Method dump skipped, instruction units count: 5479
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.serializeToString.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 79;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            int i4 = 94 / 0;
        }
    }
}
