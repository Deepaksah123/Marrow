package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class zzpi extends addObserverForBackInvoker implements SubjectStat {
    private getSubjectStat AudioAttributesCompatParcelizer;
    private volatile isHighlighted IconCompatParcelizer;
    private static final byte[] $$c = {TarConstants.LF_PAX_EXTENDED_HEADER_UC, 13, 21, 98};
    private static final int $$f = 242;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {19, -74, 60, -114, -61, 61, 2, 19, -44, TarConstants.LF_DIR, 1, -13, 23, -7, 10, 3, -29, 32, 7, 4, 1, 14, 30, 16, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, 23, 12, 6, 9, -11, -32, 38, 21, -7, 10, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, -61, 27, TarConstants.LF_CONTIG, -5, -27, 32, -7, 28, -16, 17, -37, 40, 7, 0, -37, TarConstants.LF_NORMAL, 2, 7, 3, 3, -5, 13, 10, -36, 33, 14, 5, -11, 13, -5, 17, -41, TarConstants.LF_CONTIG, 0, -11, 17, 0, -9, 15, -21, 42, -7, 10, -8, 1, 19, -7, -2, -19, 25, 16, -7, 6, 1, -43};
    private static final int $$h = 160;
    private static final byte[] $$a = {8, -19, -66, -33, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 116;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int RatingCompat = 1;
    private static char[] write = {28576, 28597, 28607, 28593, 28594, 28600, 28661, 28494, 28563, 28606, 28604, 28595, 28544, 28495, 28493, 28488, 28591, 28603, 28492, 28599, 28556, 28659, 28605, 28577, 28559, 28557, 28558, 28552, 28555, 28656, 28657, 28554, 28660, 28571, 28574, 28590, 28596, 28598, 28561};
    private static int MediaBrowserCompatItemReceiver = 411398083;
    private static boolean AudioAttributesImplApi26Parcelizer = true;
    private static boolean MediaBrowserCompatCustomActionResultReceiver = true;
    private static long AudioAttributesImplBaseParcelizer = -8434034278483447933L;
    private final Object read = new Object();
    private boolean RemoteActionCompatParcelizer = false;

    private static String $$i(byte b, short s, byte b2) {
        int i = b * 4;
        byte[] bArr = $$c;
        int i2 = 104 - (s * 4);
        int i3 = 3 - (b2 * 3);
        byte[] bArr2 = new byte[i + 1];
        int i4 = -1;
        if (bArr == null) {
            i2 += i3;
            i3 = i3;
            i4 = -1;
        }
        while (true) {
            int i5 = i4 + 1;
            bArr2[i5] = (byte) i2;
            if (i5 == i) {
                return new String(bArr2, 0);
            }
            int i6 = i3 + 1;
            i2 = bArr[i6] + i2;
            i3 = i6;
            i4 = i5;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 65
            int r0 = 44 - r7
            byte[] r1 = kotlin.zzpi.$$a
            int r8 = r8 + 4
            byte[] r0 = new byte[r0]
            int r7 = 43 - r7
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2b
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L20:
            int r8 = r8 + 1
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2b:
            int r8 = r8 + r6
            int r6 = r8 + (-1)
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzpi.c(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.zzpi.$$g
            int r6 = 67 - r6
            int r7 = 111 - r7
            int r1 = r8 + 19
            byte[] r1 = new byte[r1]
            int r8 = r8 + 18
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r3 = r8
            r4 = r2
            goto L2c
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r3 = r3 + r6
            int r6 = r3 + (-4)
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzpi.d(short, int, byte, java.lang.Object[]):void");
    }

    zzpi() {
        MediaBrowserCompatItemReceiver();
    }

    private void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.zzpi.2
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                zzpi.this.AudioAttributesImplApi26Parcelizer();
            }
        });
        int i2 = AudioAttributesImplApi21Parcelizer + 35;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0036  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void AudioAttributesImplApi21Parcelizer() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.zzpi.RatingCompat
            int r1 = r1 + 47
            int r2 = r1 % 128
            kotlin.zzpi.AudioAttributesImplApi21Parcelizer = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L23
            o.isHighlighted r1 = r3.MediaBrowserCompatCustomActionResultReceiver()
            o.getSubjectStat r1 = r1.write()
            r3.AudioAttributesCompatParcelizer = r1
            boolean r1 = r1.RemoteActionCompatParcelizer()
            r2 = 88
            int r2 = r2 / 0
            if (r1 == 0) goto L3f
            goto L36
        L23:
            o.isHighlighted r1 = r3.MediaBrowserCompatCustomActionResultReceiver()
            o.getSubjectStat r1 = r1.write()
            r3.AudioAttributesCompatParcelizer = r1
            boolean r1 = r1.RemoteActionCompatParcelizer()
            r1 = r1 ^ 1
            if (r1 == 0) goto L36
            goto L3f
        L36:
            o.getSubjectStat r1 = r3.AudioAttributesCompatParcelizer
            o.withFieldVisibility r3 = r3.getDefaultViewModelCreationExtras()
            r1.IconCompatParcelizer(r3)
        L3f:
            int r3 = kotlin.zzpi.RatingCompat
            int r3 = r3 + 17
            int r1 = r3 % 128
            kotlin.zzpi.AudioAttributesImplApi21Parcelizer = r1
            int r3 = r3 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzpi.AudioAttributesImplApi21Parcelizer():void");
    }

    private static void b(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildSetRequirementsIntent buildsetrequirementsintent = new buildSetRequirementsIntent();
        char[] cArrAudioAttributesCompatParcelizer = buildSetRequirementsIntent.AudioAttributesCompatParcelizer(AudioAttributesImplBaseParcelizer ^ 4027965449757546139L, cArr, i);
        buildsetrequirementsintent.write = 4;
        while (buildsetrequirementsintent.write < cArrAudioAttributesCompatParcelizer.length) {
            int i3 = $11 + 15;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            buildsetrequirementsintent.read = buildsetrequirementsintent.write - 4;
            int i5 = buildsetrequirementsintent.write;
            try {
                Object[] objArr2 = {Long.valueOf(cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write] ^ cArrAudioAttributesCompatParcelizer[buildsetrequirementsintent.write % 4]), Long.valueOf(buildsetrequirementsintent.read), Long.valueOf(AudioAttributesImplBaseParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2134927292);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.indexOf("", ""), ((Process.getThreadPriority(0) + 20) >> 6) + 12424, 20 - Color.alpha(0), -17408815, false, CmcdHeadersFactory.OBJECT_TYPE_INIT_SEGMENT, new Class[]{Long.TYPE, Long.TYPE, Long.TYPE});
                }
                cArrAudioAttributesCompatParcelizer[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {buildsetrequirementsintent, buildsetrequirementsintent};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(141570176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ExpandableListView.getPackedPositionGroup(0L), 1868 - TextUtils.getCapsMode("", 0, 0), 11 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1983509525, false, $$i(b, b2, b2), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i6 = $10 + 13;
                $11 = i6 % 128;
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

    private static void a(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int length;
        char[] cArr2;
        int i3;
        int i4 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr3 = write;
        long j = 0;
        if (cArr3 != null) {
            int i5 = $10 + 93;
            $11 = i5 % 128;
            if (i5 % 2 == 0) {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 1;
            } else {
                length = cArr3.length;
                cArr2 = new char[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i3])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.elapsedRealtime() > j ? 1 : (SystemClock.elapsedRealtime() == j ? 0 : -1)) + 44861), ExpandableListView.getPackedPositionType(j) + 18944, 28 - (Process.myTid() >> 22), -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr2[i3] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i3++;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr2;
        }
        Object[] objArr3 = {Integer.valueOf(MediaBrowserCompatItemReceiver)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) ExpandableListView.getPackedPositionGroup(0L), TextUtils.getCapsMode("", 0, 0) + 19033, Drawable.resolveOpacity(0, 0) + 75, 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        char c = '0';
        if (MediaBrowserCompatCustomActionResultReceiver) {
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                int i6 = $10 + 123;
                $11 = i6 % 128;
                if (i6 % 2 == 0) {
                    cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr3[bArr[notifydownloads.AudioAttributesCompatParcelizer % notifydownloads.IconCompatParcelizer] / i] - iIntValue);
                    Object[] objArr4 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) TextUtils.getTrimmedLength(""), 11438 - TextUtils.indexOf("", c), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } else {
                    cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr3[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                    Object[] objArr5 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) Color.blue(0), 11440 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                }
                c = '0';
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!AudioAttributesImplApi26Parcelizer) {
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                int i7 = $11 + 63;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr3[iArr[(notifydownloads.AudioAttributesCompatParcelizer >>> 1) >> notifydownloads.IconCompatParcelizer] % i] * iIntValue);
                    i2 = notifydownloads.IconCompatParcelizer >>> 1;
                } else {
                    cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr3[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                    i2 = notifydownloads.IconCompatParcelizer + 1;
                }
                notifydownloads.IconCompatParcelizer = i2;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        int i8 = $10 + 113;
        $11 = i8 % 128;
        int i9 = i8 % 2;
        notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            int i10 = $11 + 21;
            $10 = i10 % 128;
            if (i10 % 2 != 0) {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr3[cArr[(notifydownloads.AudioAttributesCompatParcelizer % 0) * notifydownloads.IconCompatParcelizer] * i] >> iIntValue);
                Object[] objArr6 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (1 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), 11439 - View.MeasureSpec.getSize(0), 13 - TextUtils.lastIndexOf("", '0', 0), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            } else {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr3[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                Object[] objArr7 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) View.MeasureSpec.getSize(0), 11440 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 15 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b9  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r29) {
        /*
            Method dump skipped, instruction units count: 2292
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzpi.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 37;
        RatingCompat = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            getSubjectStat getsubjectstat = this.AudioAttributesCompatParcelizer;
            if (getsubjectstat != null) {
                getsubjectstat.AudioAttributesCompatParcelizer();
            }
            int i3 = RatingCompat + 65;
            AudioAttributesImplApi21Parcelizer = i3 % 128;
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
        int i2 = AudioAttributesImplApi21Parcelizer + 95;
        RatingCompat = i2 % 128;
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
        int i2 = AudioAttributesImplApi21Parcelizer + 119;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted MediaBrowserCompatCustomActionResultReceiver() {
        if (this.IconCompatParcelizer == null) {
            synchronized (this.read) {
                if (this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = AudioAttributesImplBaseParcelizer();
                }
            }
        }
        return this.IconCompatParcelizer;
    }

    protected final void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        if (!this.RemoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer = true;
            int i2 = RatingCompat + 53;
            AudioAttributesImplApi21Parcelizer = i2 % 128;
            int i3 = i2 % 2;
        }
        int i4 = AudioAttributesImplApi21Parcelizer + 65;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = RatingCompat + 33;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        if (i3 != 0) {
            int i4 = 26 / 0;
        }
        return RemoteActionCompatParcelizer;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 67;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i4 = RatingCompat + 101;
            AudioAttributesImplApi21Parcelizer = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, new byte[]{-125, -127, -117, -124, -110, -111, -112, -114, -122, -113, -122, -114, -118, -115, -121, -116, -116, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) + 12, new byte[]{-126, -123, -122, -114, -127, -118, -122, -108, -116, -116, -115, -114, -126, -117, -124, -124, -109, -118}, null, null, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getTouchSlop() >> 8)), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 6053, 42 - TextUtils.getOffsetBefore("", 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) View.resolveSize(0, 0), (Process.myTid() >> 22) + 6030, 24 - (Process.myTid() >> 22), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 427
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzpi.onPause():void");
    }

    /* JADX WARN: Can't wrap try/catch for region: R(33:(26:274|33|(3:35|36|(1:40)(1:39))(0)|76|259|77|(1:79)|80|(3:82|(1:84)|85)(19:86|87|275|88|(1:90)|91|92|270|93|(1:95)|96|97|98|(1:100)|101|(1:103)|104|(1:106)|107)|108|(5:111|112|(14:281|114|(3:116|(4:119|(3:288|121|291)(4:287|122|123|290)|289|117)|286)|124|260|125|(1:127)|128|129|130|279|131|132|285)(1:284)|283|109)|282|166|(1:168)|169|(3:171|(1:173)|174)(13:176|254|177|178|(1:180)|181|272|182|183|(1:185)|186|(1:188)|189)|175|190|(6:192|193|(1:195)|196|197|198)|199|(1:201)|202|(3:204|(1:206)|207)(14:209|210|(1:212)|213|214|(1:216)|217|264|218|219|(1:221)|222|(1:224)|225)|208|226|(7:228|229|(1:231)|232|233|234|235)(1:292))|268|45|(1:47)|48|256|49|(1:51)|52|53|76|259|77|(0)|80|(0)(0)|108|(1:109)|282|166|(0)|169|(0)(0)|175|190|(0)|199|(0)|202|(0)(0)|208|226|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0966, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0967, code lost:
    
        r9 = new java.lang.Object[1];
        a(((android.content.Context) java.lang.Class.forName("android.app.ActivityThread").getMethod(r7, new java.lang.Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(com.marrow.R.string.exo_item_list).substring(0, 4).codePointAt(2) + 91, new byte[]{-106, -102, -100, -97, -96, -102, -100, -103, -100, -97, -103}, null, null, r9);
        r2 = (java.lang.String) r9[0];
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x09a6, code lost:
    
        r4 = new java.io.ByteArrayOutputStream();
        r6 = new java.io.PrintStream(r4);
        r0.printStackTrace(r6);
        r6.close();
        r1 = r4.toString(org.apache.commons.compress.utils.CharsetNames.UTF_8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x09bd, code lost:
    
        r1 = java.lang.String.valueOf(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x09c1, code lost:
    
        r4 = new java.util.ArrayList(2);
        r4.add(r1);
        r4.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x09d0, code lost:
    
        r1 = kotlin.startForeground.RemoteActionCompatParcelizer(-1407079962);
     */
    /* JADX WARN: Code restructure failed: missing block: B:161:0x09d4, code lost:
    
        if (r1 == null) goto L162;
     */
    /* JADX WARN: Code restructure failed: missing block: B:162:0x09d6, code lost:
    
        r1 = kotlin.startForeground.read((char) ((android.os.Process.myPid() >> 22) + 4535), (android.view.ViewConfiguration.getTouchSlop() >> 8) + 6054, android.text.AndroidCharacter.getMirror('0') - 6, -764908173, false, "IconCompatParcelizer", new java.lang.Class[0]);
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x09fb, code lost:
    
        r1 = ((java.lang.reflect.Method) r1).invoke(null, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:165:0x0a07, code lost:
    
        r9 = new java.lang.Object[]{-873386771, 81604378625L, r4, com.marrow.TrainingApplication.RemoteActionCompatParcelizer(), false};
        r2 = (java.lang.Class) kotlin.startForeground.IconCompatParcelizer((char) (android.view.ViewConfiguration.getLongPressTimeout() >> 16), 6030 - (android.view.ViewConfiguration.getLongPressTimeout() >> 16), android.view.MotionEvent.axisFromString("") + 25);
        r12 = new java.lang.Object[1];
        d(r4[69], (byte) (-kotlin.zzpi.$$g[16]), r4[44], r12);
        r2.getMethod((java.lang.String) r12[0], java.lang.Integer.TYPE, java.lang.Long.TYPE, java.util.List.class, java.lang.String.class, java.lang.Boolean.TYPE).invoke(r1, r9);
     */
    /* JADX WARN: Removed duplicated region for block: B:111:0x080d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0a8d  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0ad8  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x0b32  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0d61  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0e3f  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0e86  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x0ed5  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x1106  */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0291 A[Catch: all -> 0x0296, TRY_ENTER, TRY_LEAVE, TryCatch #11 {all -> 0x0296, blocks: (B:33:0x026d, B:36:0x027b, B:40:0x0291, B:56:0x0363, B:58:0x0369, B:59:0x036a, B:61:0x036c, B:63:0x0373, B:64:0x0374, B:49:0x02e6, B:51:0x02f3, B:52:0x0357, B:45:0x029b, B:47:0x02af, B:48:0x02e0), top: B:274:0x026d, outer: #2, inners: #1, #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x04a0 A[Catch: all -> 0x0966, TryCatch #3 {all -> 0x0966, blocks: (B:77:0x049a, B:79:0x04a0, B:80:0x04db, B:82:0x04e8, B:84:0x04f1, B:85:0x052e, B:108:0x0803, B:109:0x0807, B:112:0x0817, B:114:0x082d, B:117:0x083a, B:121:0x0849, B:122:0x0851, B:129:0x08b5, B:135:0x0940, B:137:0x0946, B:138:0x0947, B:140:0x0949, B:142:0x0950, B:143:0x0951, B:86:0x0539, B:98:0x0697, B:100:0x069d, B:101:0x06df, B:103:0x0761, B:104:0x07a8, B:106:0x07be, B:107:0x07fd, B:145:0x0953, B:147:0x095a, B:148:0x095b, B:150:0x095d, B:152:0x0964, B:153:0x0965, B:125:0x087e, B:127:0x0884, B:128:0x08ae, B:93:0x060e, B:95:0x0622, B:96:0x068b, B:88:0x05c2, B:90:0x05d6, B:91:0x0607, B:131:0x08ba), top: B:259:0x049a, outer: #2, inners: #4, #9, #12, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x04e8 A[Catch: all -> 0x0966, TryCatch #3 {all -> 0x0966, blocks: (B:77:0x049a, B:79:0x04a0, B:80:0x04db, B:82:0x04e8, B:84:0x04f1, B:85:0x052e, B:108:0x0803, B:109:0x0807, B:112:0x0817, B:114:0x082d, B:117:0x083a, B:121:0x0849, B:122:0x0851, B:129:0x08b5, B:135:0x0940, B:137:0x0946, B:138:0x0947, B:140:0x0949, B:142:0x0950, B:143:0x0951, B:86:0x0539, B:98:0x0697, B:100:0x069d, B:101:0x06df, B:103:0x0761, B:104:0x07a8, B:106:0x07be, B:107:0x07fd, B:145:0x0953, B:147:0x095a, B:148:0x095b, B:150:0x095d, B:152:0x0964, B:153:0x0965, B:125:0x087e, B:127:0x0884, B:128:0x08ae, B:93:0x060e, B:95:0x0622, B:96:0x068b, B:88:0x05c2, B:90:0x05d6, B:91:0x0607, B:131:0x08ba), top: B:259:0x049a, outer: #2, inners: #4, #9, #12, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0539 A[Catch: all -> 0x0966, TRY_LEAVE, TryCatch #3 {all -> 0x0966, blocks: (B:77:0x049a, B:79:0x04a0, B:80:0x04db, B:82:0x04e8, B:84:0x04f1, B:85:0x052e, B:108:0x0803, B:109:0x0807, B:112:0x0817, B:114:0x082d, B:117:0x083a, B:121:0x0849, B:122:0x0851, B:129:0x08b5, B:135:0x0940, B:137:0x0946, B:138:0x0947, B:140:0x0949, B:142:0x0950, B:143:0x0951, B:86:0x0539, B:98:0x0697, B:100:0x069d, B:101:0x06df, B:103:0x0761, B:104:0x07a8, B:106:0x07be, B:107:0x07fd, B:145:0x0953, B:147:0x095a, B:148:0x095b, B:150:0x095d, B:152:0x0964, B:153:0x0965, B:125:0x087e, B:127:0x0884, B:128:0x08ae, B:93:0x060e, B:95:0x0622, B:96:0x068b, B:88:0x05c2, B:90:0x05d6, B:91:0x0607, B:131:0x08ba), top: B:259:0x049a, outer: #2, inners: #4, #9, #12, #14 }] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r32) {
        /*
            Method dump skipped, instruction units count: 5140
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zzpi.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = RatingCompat + 95;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = RatingCompat + 1;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }
}
