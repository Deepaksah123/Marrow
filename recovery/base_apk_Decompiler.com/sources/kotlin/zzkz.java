package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzkz extends addObserverForBackInvoker implements SubjectStat {
    private volatile isHighlighted AudioAttributesCompatParcelizer;
    private final Object IconCompatParcelizer = new Object();
    private boolean RemoteActionCompatParcelizer = false;
    private getSubjectStat read;
    private static final byte[] $$c = {79, -100, -79, 21};
    private static final int $$f = 235;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {TarConstants.LF_CONTIG, -94, -3, -122, 56, -40, -33, -8, -14, -1, 21, -53, 2, -10, -7, 4, -28, -4, -10, -19, 20, -28, -18, 1, -10, -22, 4, -22, 38, -53, 2, -10, -7, 13, -29, -32, 25, -20, -20, -18, 7, -23, 4, -5, -12, -28, -17, -11, -14, 6, 27, -43, -26, 2, -15, -8, 34, -53, -7, -12, 6, -28, 27, -26, -26, 6, -11, -16, -6, -26, 12, -22, 56, -33, -56, 0, -9, 16, -27, -11, -15, -1, -18, -15, 38, -50, 2, -24, -16, 0, -13, 2, -15, -8, 26, -35, -29, 45, -39, -11, -14, -6, 43, -4, 0, -20, 6};
    private static final int $$h = 208;
    private static final byte[] $$a = {94, -36, -26, 62, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 143;
    private static int MediaBrowserCompatItemReceiver = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static long write = 3732531426872540174L;
    private static long AudioAttributesImplApi21Parcelizer = -3498762522182953692L;
    private static int AudioAttributesImplBaseParcelizer = -136981212;
    private static char AudioAttributesImplApi26Parcelizer = 50801;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(int r5, int r6, byte r7) {
        /*
            int r5 = r5 + 4
            int r7 = r7 * 3
            int r0 = r7 + 1
            int r6 = r6 + 103
            byte[] r1 = kotlin.zzkz.$$c
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r7
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            int r5 = r5 + 1
            r0[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L20:
            int r3 = r3 + 1
            r4 = r1[r5]
        L24:
            int r6 = r6 + r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzkz.$$i(int, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, short r7, int r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.zzkz.$$a
            int r8 = 114 - r8
            int r6 = r6 + 4
            int r7 = r7 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L11
            r4 = r6
            r8 = r7
            r3 = r2
            goto L26
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r5
        L26:
            int r7 = r7 + r4
            int r8 = r8 + 1
            int r7 = r7 + (-1)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzkz.c(short, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 82
            int r7 = 39 - r7
            byte[] r0 = kotlin.zzkz.$$g
            int r8 = r8 + 4
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r4 = r7
            r6 = r8
            r3 = r2
            goto L26
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r4 = r0[r8]
            r5 = r8
            r8 = r6
            r6 = r5
        L26:
            int r4 = -r4
            int r8 = r8 + r4
            int r6 = r6 + 1
            int r8 = r8 + (-9)
            r5 = r8
            r8 = r6
            r6 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzkz.d(byte, short, byte, java.lang.Object[]):void");
    }

    zzkz() {
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.zzkz.5
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                zzkz.this.MediaBrowserCompatItemReceiver();
            }
        });
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 103;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 111;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        getSubjectStat getsubjectstatWrite = AudioAttributesImplApi21Parcelizer().write();
        this.read = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            int i4 = MediaBrowserCompatItemReceiver + 7;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            int i5 = i4 % 2;
            this.read.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            int i6 = MediaBrowserCompatCustomActionResultReceiver + 1;
            MediaBrowserCompatItemReceiver = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    private static void a(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(write ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $10 + 11;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(write)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (Process.myTid() >> 22), View.MeasureSpec.getMode(0) + 12424, TextUtils.lastIndexOf("", '0') + 21, -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) (-1);
                    byte b2 = (byte) (-b);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (Process.myPid() >> 22), TextUtils.indexOf((CharSequence) "", '0', 0) + 1869, 9 - TextUtils.lastIndexOf("", '0', 0), 1983509525, false, $$i(b, b2, (byte) (b2 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i6 = $11 + 111;
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
            int i4 = $10 + 1;
            $11 = i4 % 128;
            int i5 = i4 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 22748, ExpandableListView.getPackedPositionChild(0L) + 37, 1417974126, false, "j", new Class[]{Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                try {
                    Object[] objArr3 = {notifydownloadremoved};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        byte b = (byte) (-1);
                        byte b2 = (byte) (b + 1);
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (Color.blue(0) + 31369), MotionEvent.axisFromString("") + 2722, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 37, 1895162189, false, $$i(b, b2, b2), new Class[]{Object.class});
                    }
                    int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    try {
                        Object[] objArr4 = {notifydownloadremoved, Integer.valueOf(cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718), Integer.valueOf(cArr5[iIntValue])};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) ExpandableListView.getPackedPositionType(0L), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15713, MotionEvent.axisFromString("") + 65, -837789177, false, "f", new Class[]{Object.class, Integer.TYPE, Integer.TYPE});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                        try {
                            Object[] objArr5 = {Integer.valueOf(cArr4[iIntValue2] * 32718), Integer.valueOf(cArr5[iIntValue])};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) ((CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 40976), 6122 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28, -566873061, false, "m", new Class[]{Integer.TYPE, Integer.TYPE});
                            }
                            cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                            cArr4[iIntValue2] = notifydownloadremoved.write;
                            cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) (((((long) (cArr4[iIntValue2] ^ cArr3[notifydownloadremoved.AudioAttributesCompatParcelizer])) ^ (AudioAttributesImplApi21Parcelizer ^ (-3498762522182953692L))) ^ ((long) ((int) (((long) AudioAttributesImplBaseParcelizer) ^ (-3498762522182953692L))))) ^ ((long) ((char) (((long) AudioAttributesImplApi26Parcelizer) ^ (-3498762522182953692L)))));
                            notifydownloadremoved.AudioAttributesCompatParcelizer++;
                            i2 = 2;
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
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
            } catch (Throwable th4) {
                Throwable cause4 = th4.getCause();
                if (cause4 == null) {
                    throw th4;
                }
                throw cause4;
            }
        }
        String str = new String(cArr6);
        int i6 = $11 + 95;
        $10 = i6 % 128;
        int i7 = i6 % 2;
        objArr[0] = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0084  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r39) {
        /*
            Method dump skipped, instruction units count: 2761
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzkz.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        getSubjectStat getsubjectstat;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 61;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            getsubjectstat = this.read;
            int i3 = 56 / 0;
            if (getsubjectstat == null) {
                return;
            }
        } else {
            super.onDestroy();
            getsubjectstat = this.read;
            if (getsubjectstat == null) {
                return;
            }
        }
        getsubjectstat.AudioAttributesCompatParcelizer();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 97;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 19;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedAudioAttributesImplApi21Parcelizer = AudioAttributesImplApi21Parcelizer();
        if (i3 == 0) {
            ishighlightedAudioAttributesImplApi21Parcelizer.af_();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objAf_ = ishighlightedAudioAttributesImplApi21Parcelizer.af_();
        int i4 = MediaBrowserCompatItemReceiver + 75;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 1;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted AudioAttributesImplApi21Parcelizer() {
        if (this.AudioAttributesCompatParcelizer == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.AudioAttributesCompatParcelizer == null) {
                    this.AudioAttributesCompatParcelizer = AudioAttributesImplApi26Parcelizer();
                }
            }
        }
        return this.AudioAttributesCompatParcelizer;
    }

    protected final void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 63;
        int i3 = i2 % 128;
        MediaBrowserCompatItemReceiver = i3;
        if (i2 % 2 == 0) {
            if (!this.RemoteActionCompatParcelizer) {
                int i4 = i3 + 25;
                MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
                if (i4 % 2 == 0) {
                    this.RemoteActionCompatParcelizer = false;
                } else {
                    this.RemoteActionCompatParcelizer = true;
                }
                int i5 = MediaBrowserCompatCustomActionResultReceiver + 91;
                MediaBrowserCompatItemReceiver = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 61;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 75;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        return RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00b2  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzkz.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00f5  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 446
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzkz.onPause():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x095b A[Catch: all -> 0x036c, TryCatch #11 {all -> 0x036c, blocks: (B:214:0x0fa2, B:216:0x0fa8, B:217:0x0fd9, B:250:0x13fd, B:252:0x1403, B:253:0x1429, B:231:0x11d0, B:233:0x11f3, B:234:0x1248, B:180:0x0b74, B:182:0x0b7a, B:183:0x0ba6, B:135:0x0955, B:137:0x095b, B:138:0x0987, B:23:0x00bd, B:25:0x00c3, B:26:0x00eb, B:28:0x02de, B:30:0x0310, B:31:0x0366), top: B:296:0x00bd }] */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0a56 A[Catch: all -> 0x0b0d, TryCatch #12 {all -> 0x0b0d, blocks: (B:155:0x0a41, B:157:0x0a56, B:158:0x0a81), top: B:298:0x0a41, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0a94 A[Catch: all -> 0x0b03, TryCatch #6 {all -> 0x0b03, blocks: (B:159:0x0a87, B:161:0x0a94, B:162:0x0afb), top: B:287:0x0a87, outer: #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0c44  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0c94  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0cf2  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0f81  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x1071  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x10ba  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x1109  */
    /* JADX WARN: Removed duplicated region for block: B:249:0x13db  */
    /* JADX WARN: Removed duplicated region for block: B:307:0x0a1d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:319:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0098  */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v25, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v26 */
    /* JADX WARN: Type inference failed for: r13v27 */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v33 */
    /* JADX WARN: Type inference failed for: r13v34, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v36, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v39 */
    /* JADX WARN: Type inference failed for: r13v40 */
    /* JADX WARN: Type inference failed for: r13v41 */
    /* JADX WARN: Type inference failed for: r13v42 */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r32) {
        /*
            Method dump skipped, instruction units count: 6169
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzkz.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 61;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 119;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
    }
}
