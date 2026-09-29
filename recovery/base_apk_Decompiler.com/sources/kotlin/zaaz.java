package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class zaaz extends zaay implements SubjectStat {
    private volatile isHighlighted IconCompatParcelizer;
    private getSubjectStat write;
    private static final byte[] $$c = {70, -23, 8, 77};
    private static final int $$f = 118;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$s = {3, -109, TarConstants.LF_PAX_EXTENDED_HEADER_UC, -57, -61, 61, 2, 19, -47, 39, 10, 15, 2, 5, -11, 3, -11, 31, 7, 5, 2, -9, 0, 16, -35, 45, 7, -1, -8, 23, 23, 12, 6, 9, -11, -32, 38, 21, -7, 10, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, -61, 61, 2, 19, -34, 27, 19, 7, -4, 7, -3, -19, 41, -5, -7, -27, TarConstants.LF_NORMAL, 1, 2, -38, TarConstants.LF_NORMAL, 3, 4, -5, 2, 21, -7, 17, -9, 15, 9, -40, 24, 17, -9, 10, 2, 17, -1, -5, 15, -11};
    private static final int $$t = 232;
    private static final byte[] $$a = {91, -118, -51, -87, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 152;
    private static int MediaMetadataCompat = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static char[] AudioAttributesImplApi26Parcelizer = {51466, 25976, 37365, 52334, 30960, 38771, 50145, 32302, 43756, 55677, 30119, 41060, 56517, 2909, 42974, 53853, 3784, 48469, 56429, 28703, 33938, 55561, 28055, 33300, 54918, 27465, 49029, 52249, 24734, 46461, 51601, 7734, 45742, 50998, 7082, 43048, 64690, 4402, 42396, 64037, 3776, 41810, 63445, 1117, 29313, 57007, 10792, 30710, 50034, 11425, 30824, 50668, 4460, 25315, 52791, 7052, 26461, 45273, 7171, 27092, 46336, 1689, 21018, 49103, 2883, 21704, 41019, 3507, 22891, 43701, 63026, 17326, 44836, 63663, 17445, 37282, 64801, 20120, 39497, 59285, 13123, 40082, 59404, 13706, 33025, 53891, 15953, 35370, 55209, 9006, 36086, 55334, 9713, 29029, 49902, 11878, 31716, 51049, 4315, 31839, 51665, 5378, 26246, 45597, 8136, 27421, 46276, 'E', 56373, 28767, 33991, 55631, 28118, 33359, 56372, 28736, 33984, 55627, 28108, 33358, 54997, 27487, 49106, 52315, 24794};
    private static long AudioAttributesImplApi21Parcelizer = -475004308165136271L;
    private static char[] MediaBrowserCompatCustomActionResultReceiver = {28439, 28459, 28431, 28443, 28446, 28417, 28463, 28432, 28447, 28436, 28462, 28515, 28434, 28438, 28419, 28437, 28527, 28498, 28444, 28416, 28526, 28524, 28497, 28523, 28522, 28499, 28496, 28525, 28442, 28433, 28520, 28501, 28500, 28445, 28435, 28460, 28503, 28440, 28529, 28538, 28513, 28441, 28528};
    private static int AudioAttributesImplBaseParcelizer = 411398050;
    private static boolean MediaBrowserCompatItemReceiver = true;
    private static boolean MediaDescriptionCompat = true;
    private final Object read = new Object();
    private boolean AudioAttributesCompatParcelizer = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r7, int r8, int r9) {
        /*
            int r7 = r7 * 3
            int r7 = 4 - r7
            byte[] r0 = kotlin.zaaz.$$c
            int r8 = r8 * 4
            int r8 = r8 + 1
            int r9 = r9 * 4
            int r9 = 101 - r9
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r9
            r5 = r2
            r9 = r7
            goto L2a
        L17:
            r3 = r2
            r6 = r9
            r9 = r7
            r7 = r6
        L1b:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r8) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r9]
        L2a:
            int r3 = -r3
            int r7 = r7 + r3
            int r9 = r9 + 1
            r3 = r5
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaaz.$$i(short, int, int):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 65
            int r7 = r7 + 4
            byte[] r0 = kotlin.zaaz.$$a
            int r1 = r6 + 4
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r4 = r6
            r8 = r7
            r3 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r7 = r7 + 1
            if (r3 != r6) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r5
        L2a:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaaz.c(byte, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0023). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 5
            int r7 = 95 - r7
            int r6 = r6 + 82
            byte[] r0 = kotlin.zaaz.$$s
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r6
            r6 = r8
            r4 = r2
            goto L23
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r6
            r1[r3] = r5
            if (r4 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r3 = r0[r7]
        L23:
            int r6 = r6 + r3
            int r6 = r6 + (-4)
            int r7 = r7 + 1
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaaz.d(short, short, short, java.lang.Object[]):void");
    }

    zaaz() {
        MediaBrowserCompatSearchResultReceiver();
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.zaaz.1
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                zaaz.this.MediaBrowserCompatCustomActionResultReceiver();
            }
        });
        int i2 = MediaBrowserCompatMediaItem + 101;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void MediaDescriptionCompat() {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.zaaz.MediaBrowserCompatMediaItem
            int r1 = r1 + 65
            int r2 = r1 % 128
            kotlin.zaaz.MediaMetadataCompat = r2
            int r1 = r1 % r0
            if (r1 == 0) goto L23
            o.isHighlighted r1 = r3.RatingCompat()
            o.getSubjectStat r1 = r1.write()
            r3.write = r1
            boolean r1 = r1.RemoteActionCompatParcelizer()
            r2 = 92
            int r2 = r2 / 0
            if (r1 == 0) goto L3c
            goto L33
        L23:
            o.isHighlighted r1 = r3.RatingCompat()
            o.getSubjectStat r1 = r1.write()
            r3.write = r1
            boolean r1 = r1.RemoteActionCompatParcelizer()
            if (r1 == 0) goto L3c
        L33:
            o.getSubjectStat r1 = r3.write
            o.withFieldVisibility r3 = r3.getDefaultViewModelCreationExtras()
            r1.IconCompatParcelizer(r3)
        L3c:
            int r3 = kotlin.zaaz.MediaMetadataCompat
            int r3 = r3 + 87
            int r1 = r3 % 128
            kotlin.zaaz.MediaBrowserCompatMediaItem = r1
            int r3 = r3 % r0
            if (r3 == 0) goto L48
            return
        L48:
            r3 = 0
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaaz.MediaDescriptionCompat():void");
    }

    private static void a(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i4 = $10 + 109;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(AudioAttributesImplApi26Parcelizer[i + i6])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (36621 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), 2339 - TextUtils.indexOf((CharSequence) "", '0'), 27 - TextUtils.lastIndexOf("", '0'), 480654850, false, $$i(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(AudioAttributesImplApi21Parcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getEdgeSlop() >> 16), 9701 - ((Process.getThreadPriority(0) + 20) >> 6), (ViewConfiguration.getLongPressTimeout() >> 16) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23783, 34 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr = new char[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i7 = $11 + 45;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                cArr[downloadService.write] = (char) jArr[downloadService.write];
                Object[] objArr5 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 23784 - KeyEvent.keyCodeFromString(""), 33 - TextUtils.indexOf("", "", 0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                Object obj = null;
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                obj.hashCode();
                throw null;
            }
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr6 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer5 == null) {
                objRemoteActionCompatParcelizer5 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 23783, View.MeasureSpec.getSize(0) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            int i8 = $10 + 47;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr);
    }

    private static void b(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = MediaBrowserCompatCustomActionResultReceiver;
        float f = BitmapDescriptorFactory.HUE_RED;
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 41;
                $10 = i5 % 128;
                int i6 = i5 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 44862), 18944 - (TypedValue.complexToFloat(0) > f ? 1 : (TypedValue.complexToFloat(0) == f ? 0 : -1)), (AudioTrack.getMaxVolume() > f ? 1 : (AudioTrack.getMaxVolume() == f ? 0 : -1)) + 27, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i4++;
                    i2 = 2;
                    f = BitmapDescriptorFactory.HUE_RED;
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
        Object[] objArr3 = {Integer.valueOf(AudioAttributesImplBaseParcelizer)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.normalizeMetaState(0), 19033 - (ViewConfiguration.getEdgeSlop() >> 16), 75 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        int i7 = -1593953308;
        if (MediaDescriptionCompat) {
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr4 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(i7);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (KeyEvent.getMaxKeyCode() >> 16), 11439 - TextUtils.indexOf("", ""), 14 - View.resolveSizeAndState(0, 0, 0), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                int i8 = $10 + 9;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                i7 = -1593953308;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!MediaBrowserCompatItemReceiver) {
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                notifydownloads.IconCompatParcelizer++;
            }
            objArr[0] = new String(cArr5);
            return;
        }
        notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            int i10 = $10 + 101;
            $11 = i10 % 128;
            if (i10 % 2 == 0) {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer >>> 1) << notifydownloads.IconCompatParcelizer] >>> i] << iIntValue);
                Object[] objArr5 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getKeyRepeatTimeout() >> 16), 11487 - AndroidCharacter.getMirror('0'), View.MeasureSpec.getMode(0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            } else {
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                Object[] objArr6 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) View.getDefaultSize(0, 0), 11439 - Color.red(0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 13, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            }
        }
        String str = new String(cArr6);
        int i11 = $10 + 97;
        $11 = i11 % 128;
        if (i11 % 2 != 0) {
            objArr[0] = str;
        } else {
            obj.hashCode();
            throw null;
        }
    }

    @Override // kotlin.zaay, kotlin.zabz, kotlin.zaO, kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) {
        Object[] objArr;
        char c;
        char c2;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        a((char) (5479 - KeyEvent.getDeadChar(0, 0)), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4, 18 - (ViewConfiguration.getLongPressTimeout() >> 16), objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        b((ViewConfiguration.getScrollBarSize() >> 8) + 127, new byte[]{-123, -124, -125, -126, -127}, null, null, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i2 = MediaMetadataCompat + 3;
                MediaBrowserCompatMediaItem = i2 % 128;
                int i3 = i2 % 2;
                Object[] objArr4 = new Object[1];
                a((char) TextUtils.getOffsetAfter("", 0), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 18, KeyEvent.getDeadChar(0, 0) + 26, objArr4);
                Class<?> cls2 = Class.forName((String) objArr4[0]);
                Object[] objArr5 = new Object[1];
                b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, new byte[]{-118, -112, -124, -117, -113, -122, -124, -114, -115, -115, -116, -117, -118, -119, -120, -120, -121, -122}, null, null, objArr5);
                baseContext = (Context) cls2.getMethod((String) objArr5[0], new Class[0]).invoke(null, null);
            }
            if (baseContext != null) {
                if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                    baseContext = null;
                } else {
                    baseContext = baseContext.getApplicationContext();
                    int i4 = MediaBrowserCompatMediaItem + 87;
                    MediaMetadataCompat = i4 % 128;
                    int i5 = i4 % 2;
                }
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4534 - Process.getGidForName("")), 6054 - ExpandableListView.getPackedPositionGroup(0L), 43 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr6 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 123, new byte[]{-119, -109, -104, -103, -111, -104, -105, -123, -100, -108, -122, -108, -119, -106, -101, -119, -110, -101, -102, -105, -113, -107, -109, -103, -104, -109, -119, -105, -110, -122, -119, -110, -111, -123, -109, -119, -104, -105, -106, -107, -108, -113, -123, -122, -109, -110, -111, -122}, null, null, objArr6);
                    String str = (String) objArr6[0];
                    Object[] objArr7 = new Object[1];
                    a((char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(3) + 44618), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 43, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 29, objArr7);
                    String str2 = (String) objArr7[0];
                    Object[] objArr8 = new Object[1];
                    b((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 126, new byte[]{-103, -106, -100, -106, -108, -111, -108, -102, -122, -105, -106, -102, -113, -109, -123, -111, -113, -110, -101, -122, -110, -119, -101, -102, -109, -105, -119, -113, -119, -100, -113, -107, -103, -102, -106, -105, -104, -123, -119, -104, -101, -105, -102, -101, -102, -108, -113, -103, -123, -123, -113, -103, -102, -111, -123, -123, -103, -122, -101, -102, -123, -113, -102, -108}, null, null, objArr8);
                    String str3 = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(8) + 16, new byte[]{-98, -117, -118, -119, -92, -119, -96, -101, -92, -96, -117, -98, -119, -94, -118, -124, -96, -124, -115, -113, -96, -127, -112, -122, -95, -119, -120, -113, -121, -93, -98, -123, -120, -113, -121, -94, -95, -117, -98, -113, -122, -117, -113, -119, -120, -99, -117, -95, -98, -123, -118, -121, -112, -120, -126, -114, -124, -113, -123, -96, -96, -97, -98, -115, -117, -117, -99}, null, null, objArr9);
                    String str4 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a((char) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 104, 6 - View.MeasureSpec.makeMeasureSpec(0, 0), objArr10);
                    String str5 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    b(126 - TextUtils.lastIndexOf("", '0', 0, 0), new byte[]{-106, -106, -113, -102, -109, -122, -119, -100, -101, -113, -100, -109, -91, -110, -101, -108, -104, -91, -100, -107, -106, -107, -91, -109, -103, -109, -103, -91, -102, -102, -101, -106, -100, -108, -102, -101}, null, null, objArr11);
                    Object[] objArr12 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr11[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) TextUtils.getOffsetAfter("", 0), 6031 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 24, 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr12);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
        }
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer3 == null) {
            char threadPriority = (char) (13183 - ((Process.getThreadPriority(0) + 20) >> 6));
            int defaultSize = View.getDefaultSize(0, 0) + 1649;
            int i6 = (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26;
            Object[] objArr13 = new Object[1];
            c((byte) ($$a[61] - 1), r4[53], r4[113], objArr13);
            objRemoteActionCompatParcelizer3 = startForeground.read(threadPriority, defaultSize, i6, -133433128, false, (String) objArr13[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char packedPositionType = (char) (13183 - ExpandableListView.getPackedPositionType(0L));
                int iIndexOf = 1648 - TextUtils.indexOf((CharSequence) "", '0', 0, 0);
                int scrollBarSize = 26 - (ViewConfiguration.getScrollBarSize() >> 8);
                byte[] bArr = $$a;
                Object[] objArr14 = new Object[1];
                c(bArr[8], bArr[65], bArr[5], objArr14);
                objRemoteActionCompatParcelizer4 = startForeground.read(packedPositionType, iIndexOf, scrollBarSize, -1033747278, false, (String) objArr14[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
            c2 = 3;
            c = 2;
        } else {
            Object[] objArr15 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, new byte[]{-127, -119, -117, -98, -126, -89, -95, -94, -118, -113, -114, -95, -113, -92, -113, -90}, null, null, objArr15);
            Class<?> cls3 = Class.forName((String) objArr15[0]);
            Object[] objArr16 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 92, new byte[]{-119, -123, -112, -87, -99, -98, -113, -88, -126, -117, -124, -117, -118, -119, -123, -124}, null, null, objArr16);
            int iIntValue2 = ((Integer) cls3.getMethod((String) objArr16[0], Object.class).invoke(null, this)).intValue();
            int i7 = MediaMetadataCompat + 53;
            MediaBrowserCompatMediaItem = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object[] objArr17 = {Integer.valueOf(iIntValue2), 0, -559700672};
                byte b = (byte) 91;
                Object[] objArr18 = new Object[1];
                d((byte) 29, b, (byte) (b >>> 2), objArr18);
                Class<?> cls4 = Class.forName((String) objArr18[0]);
                byte b2 = $$s[22];
                Object[] objArr19 = new Object[1];
                d(b2, (byte) (b2 | 65), r2[29], objArr19);
                objArr = (Object[]) cls4.getMethod((String) objArr19[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr17);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char threadPriority2 = (char) (13183 - ((Process.getThreadPriority(0) + 20) >> 6));
                    int pressedStateDuration = 1649 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    int maxKeyCode = (KeyEvent.getMaxKeyCode() >> 16) + 26;
                    byte[] bArr2 = $$a;
                    Object[] objArr20 = new Object[1];
                    c(bArr2[8], bArr2[65], bArr2[5], objArr20);
                    objRemoteActionCompatParcelizer5 = startForeground.read(threadPriority2, pressedStateDuration, maxKeyCode, -1033747278, false, (String) objArr20[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr21 = new Object[1];
                    b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 123, new byte[]{-86, -122, -112, -114, -87, -127, -119, -117, -98, -126, -89, -95, -98, -112, -95, -123, -124, -112, -120, -123, -118, -113}, null, null, objArr21);
                    Class<?> cls5 = Class.forName((String) objArr21[0]);
                    Object[] objArr22 = new Object[1];
                    b((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 127, new byte[]{-119, -127, -124, -117, -114, -113, -119, -85, -123, -119, -98, -115, -113, -114, -119}, null, null, objArr22);
                    long jLongValue = ((Long) cls5.getDeclaredMethod((String) objArr22[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char offsetBefore = (char) (13183 - TextUtils.getOffsetBefore("", 0));
                        int iMakeMeasureSpec = 1649 - View.MeasureSpec.makeMeasureSpec(0, 0);
                        int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 26;
                        byte[] bArr3 = $$a;
                        Object[] objArr23 = new Object[1];
                        c(bArr3[8], (short) 75, bArr3[5], objArr23);
                        objRemoteActionCompatParcelizer6 = startForeground.read(offsetBefore, iMakeMeasureSpec, doubleTapTimeout, 54351865, false, (String) objArr23[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char cKeyCodeFromString = (char) (KeyEvent.keyCodeFromString("") + 13183);
                        int maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 1649;
                        int i9 = (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 26;
                        Object[] objArr24 = new Object[1];
                        c((byte) ($$a[61] - 1), r6[53], r6[113], objArr24);
                        objRemoteActionCompatParcelizer7 = startForeground.read(cKeyCodeFromString, maximumFlingVelocity, i9, -133433128, false, (String) objArr24[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf2);
                    int i10 = MediaMetadataCompat + 47;
                    MediaBrowserCompatMediaItem = i10 % 128;
                    c = 2;
                    int i11 = i10 % 2;
                    c2 = 3;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 == null) {
                    throw th2;
                }
                throw cause2;
            }
        }
        int i12 = ((int[]) objArr[c2])[0];
        int i13 = ((int[]) objArr[c])[0];
        if (i13 != i12) {
            long j = -1;
            long j2 = ((long) (i13 ^ i12)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (4536 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (Process.myTid() >> 22) + 6054, View.getDefaultSize(0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            try {
                Object[] objArr25 = {-895612670, Long.valueOf(j4), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                Class cls6 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), Color.green(0) + 6030, ImageFormat.getBitsPerPixel(0) + 25);
                byte b3 = $$s[22];
                Object[] objArr26 = new Object[1];
                d(b3, (byte) (b3 | 65), r3[29], objArr26);
                cls6.getMethod((String) objArr26[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr25);
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        MediaDescriptionCompat();
    }

    @Override // kotlin.zaay, kotlin.zaO, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 43;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.write;
        if (getsubjectstat != null) {
            int i4 = MediaBrowserCompatMediaItem + 27;
            MediaMetadataCompat = i4 % 128;
            int i5 = i4 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
        }
        int i6 = MediaMetadataCompat + 33;
        MediaBrowserCompatMediaItem = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 78 / 0;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 119;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = RatingCompat().af_();
        int i4 = MediaMetadataCompat + 13;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            return objAf_;
        }
        throw null;
    }

    private isHighlighted onAddQueueItem() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatMediaItem + 39;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 99 / 0;
        }
        return ishighlighted;
    }

    private isHighlighted RatingCompat() {
        if (this.IconCompatParcelizer == null) {
            synchronized (this.read) {
                if (this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = onAddQueueItem();
                }
            }
        }
        return this.IconCompatParcelizer;
    }

    protected final void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem;
        int i3 = i2 + 45;
        MediaMetadataCompat = i3 % 128;
        int i4 = i3 % 2;
        if (!this.AudioAttributesCompatParcelizer) {
            int i5 = i2 + 57;
            MediaMetadataCompat = i5 % 128;
            int i6 = i5 % 2;
            this.AudioAttributesCompatParcelizer = true;
        }
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 69;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 == 0) {
            getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i3 = MediaMetadataCompat + 19;
        MediaBrowserCompatMediaItem = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 68 / 0;
        }
        return RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x00ab  */
    @Override // kotlin.zaay, kotlin.zabz, kotlin.zaO, kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 455
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaaz.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00c4  */
    @Override // kotlin.zaay, kotlin.zabz, kotlin.zaO, kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaaz.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00d4  */
    @Override // kotlin.zaay, kotlin.zabz, kotlin.zaO, kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r33) {
        /*
            Method dump skipped, instruction units count: 5154
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zaaz.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.zaay, kotlin.zabz, kotlin.zaO, kotlin.zabr, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 75;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        super.onStart();
        if (i3 == 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = MediaMetadataCompat + 15;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }
}
