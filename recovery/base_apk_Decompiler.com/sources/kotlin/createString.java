package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
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

/* JADX INFO: loaded from: classes.dex */
public abstract class createString extends addObserverForBackInvoker implements SubjectStat {
    private static short[] MediaDescriptionCompat;
    private getSubjectStat IconCompatParcelizer;
    private volatile isHighlighted write;
    private static final byte[] $$c = {115, TarConstants.LF_DIR, -117, 77};
    private static final int $$f = 253;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {TarConstants.LF_PAX_EXTENDED_HEADER_UC, -92, 37, 22, 64, -77, -1, 21, -13, 4, 8, -12, 14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -13, 1, 62, -58, -9, -1, 7, -6, 6, TarConstants.LF_FIFO, -52, -14, 9, -15, 2, 5, 4, TarConstants.LF_DIR, -64, 11, -20, 14, -14, 8, 7, -12, 61, -71, 18, -2, -18, 68, -39, -14, -2, 21, -22, -25, 9, -7, 0, 79, -79, 12, 3, -4, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$h = 48;
    private static final byte[] $$a = {42, 85, 82, -118, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 103;
    private static int MediaBrowserCompatMediaItem = 0;
    private static int MediaBrowserCompatSearchResultReceiver = 1;
    private static char[] AudioAttributesCompatParcelizer = {28337, 28226, 28236, 28254, 28227, 28233, 28290, 28255, 28320, 28239, 28237, 28224, 28305, 28252, 28250, 28249, 28348, 28232, 28317, 28288, 28234, 28238, 28316, 28314, 28319, 28313, 28312, 28289, 28318, 28315, 28310, 28291, 28228, 28253, 28235, 28225, 28229, 28293, 28230, 28351, 28328, 28335, 28231};
    private static int AudioAttributesImplBaseParcelizer = 411397840;
    private static boolean MediaBrowserCompatItemReceiver = true;
    private static boolean MediaBrowserCompatCustomActionResultReceiver = true;
    private static int AudioAttributesImplApi21Parcelizer = 851113589;
    private static int AudioAttributesImplApi26Parcelizer = -819363129;
    private static int RatingCompat = -1915944332;
    private static byte[] MediaMetadataCompat = {-34, -115, TarConstants.LF_DIR, -123, -105, -114, -111, -5, -106, -110, -87, -88, -116, -25, 89, -114, -123, -101, -116, -87, -6, 79, -85, 90, -97, -112, 67, -72, -75, 68, 89, -88, -108, 90, -84, 63, 58, 20, TarConstants.LF_NORMAL, 22, 58, 18, TarConstants.LF_NORMAL, 20, 59, -73, -73, -73, -73};
    private final Object read = new Object();
    private boolean RemoteActionCompatParcelizer = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(short r6, byte r7, byte r8) {
        /*
            int r8 = r8 * 3
            int r8 = r8 + 112
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r0 = kotlin.createString.$$c
            int r6 = r6 * 4
            int r6 = r6 + 1
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2c
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r7 = -r7
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createString.$$i(short, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r5, int r6, byte r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.createString.$$a
            int r7 = r7 + 65
            int r1 = 44 - r6
            int r5 = r5 + 4
            byte[] r1 = new byte[r1]
            int r6 = 43 - r6
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L26
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L20:
            int r5 = r5 + 1
            r4 = r0[r5]
            int r3 = r3 + 1
        L26:
            int r4 = -r4
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createString.c(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(int r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r8 = r8 + 5
            byte[] r0 = kotlin.createString.$$g
            int r9 = r9 + 4
            int r7 = 119 - r7
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r8
            r7 = r9
            r4 = r2
            goto L29
        L11:
            r3 = r2
        L12:
            r6 = r9
            r9 = r7
            r7 = r6
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L29:
            int r9 = r9 + 1
            int r3 = -r3
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createString.d(int, byte, byte, java.lang.Object[]):void");
    }

    createString() {
        AudioAttributesImplApi26Parcelizer();
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.createString.4
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                createString.this.AudioAttributesImplApi21Parcelizer();
            }
        });
        int i2 = MediaBrowserCompatMediaItem + 121;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 59;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        getSubjectStat getsubjectstatWrite = AudioAttributesImplBaseParcelizer().write();
        this.IconCompatParcelizer = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            int i4 = MediaBrowserCompatSearchResultReceiver + 13;
            MediaBrowserCompatMediaItem = i4 % 128;
            int i5 = i4 % 2;
            this.IconCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            if (i5 == 0) {
                return;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private static void a(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = AudioAttributesCompatParcelizer;
        char c = '0';
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i4 = 0;
            while (i4 < length) {
                int i5 = $11 + 97;
                $10 = i5 % 128;
                if (i5 % i2 != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf("", c) + 44863), 18944 - (ViewConfiguration.getKeyRepeatDelay() >> 16), 28 - (ViewConfiguration.getEdgeSlop() >> 16), -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                        }
                        cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        i4--;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr2[i4])};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (TextUtils.indexOf("", "", 0) + 44862), 18945 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), KeyEvent.keyCodeFromString("") + 28, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i4++;
                }
                i2 = 2;
                c = '0';
            }
            cArr2 = cArr3;
        }
        Object[] objArr4 = {Integer.valueOf(AudioAttributesImplBaseParcelizer)};
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer3 == null) {
            objRemoteActionCompatParcelizer3 = startForeground.read((char) KeyEvent.keyCodeFromString(""), KeyEvent.keyCodeFromString("") + 19033, 75 - Color.blue(0), 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
        if (MediaBrowserCompatCustomActionResultReceiver) {
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr5 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 11438 - Process.getGidForName(""), 13 - TextUtils.lastIndexOf("", '0'), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
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
            int i6 = $11 + 109;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
            Object[] objArr6 = {notifydownloads, notifydownloads};
            Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1593953308);
            if (objRemoteActionCompatParcelizer5 == null) {
                objRemoteActionCompatParcelizer5 = startForeground.read((char) Drawable.resolveOpacity(0, 0), (ViewConfiguration.getLongPressTimeout() >> 16) + 11439, (ViewConfiguration.getEdgeSlop() >> 16) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
        }
        String str = new String(cArr6);
        int i8 = $11 + 5;
        $10 = i8 % 128;
        int i9 = i8 % 2;
        objArr[0] = str;
    }

    private static void b(int i, short s, int i2, int i3, byte b, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int i5 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i), Integer.valueOf(AudioAttributesImplApi26Parcelizer)};
            int i6 = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), (KeyEvent.getMaxKeyCode() >> 16) + 24297, 12 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            boolean z2 = iIntValue == -1;
            if (z2) {
                int i7 = $11 + 89;
                $10 = i7 % 128;
                if (i7 % 2 != 0) {
                    throw null;
                }
                byte[] bArr = MediaMetadataCompat;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i8 = 0;
                    while (i8 < length) {
                        Object[] objArr3 = new Object[1];
                        objArr3[i6] = Integer.valueOf(bArr[i8]);
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            byte b2 = (byte) i6;
                            byte b3 = b2;
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getWindowTouchSlop() >> 8) + 3082, KeyEvent.keyCodeFromString("") + 128, 2145850993, false, $$i(b2, b3, b3), new Class[]{Integer.TYPE});
                        }
                        bArr2[i8] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                        i8++;
                        int i9 = $11 + 113;
                        $10 = i9 % 128;
                        int i10 = i9 % 2;
                        i6 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = MediaMetadataCompat;
                    Object[] objArr4 = {Integer.valueOf(i3), Integer.valueOf(AudioAttributesImplApi21Parcelizer)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(559968424);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ('0' - AndroidCharacter.getMirror('0')), ((byte) KeyEvent.getModifierMetaStateMask()) + 24298, TextUtils.lastIndexOf("", '0') + 13, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesImplApi26Parcelizer) ^ 7899112766888837815L)));
                } else {
                    iIntValue = (short) (((short) (((long) MediaDescriptionCompat[i3 + ((int) (((long) AudioAttributesImplApi21Parcelizer) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) AudioAttributesImplApi26Parcelizer) ^ 7899112766888837815L)));
                }
            }
            if (iIntValue > 0) {
                int i11 = $10 + 25;
                int i12 = i11 % 128;
                $11 = i12;
                int i13 = i11 % 2;
                int i14 = ((i3 + iIntValue) - 2) + ((int) (((long) AudioAttributesImplApi21Parcelizer) ^ 7899112766888837815L));
                if (z2) {
                    int i15 = i12 + 7;
                    $10 = i15 % 128;
                    int i16 = i15 % 2;
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                buildresumedownloadsintent.read = i14 + i4;
                Object[] objArr5 = {buildresumedownloadsintent, Integer.valueOf(i2), Integer.valueOf(RatingCompat), sb};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (Color.blue(0) + 34134), 13433 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), MotionEvent.axisFromString("") + 22, 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr4 = MediaMetadataCompat;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    int i17 = $10 + 67;
                    $11 = i17 % 128;
                    int i18 = i17 % 2;
                    for (int i19 = 0; i19 < length2; i19++) {
                        bArr5[i19] = (byte) (((long) bArr4[i19]) ^ 7899112766888837815L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i20 = $11 + 19;
                    $10 = i20 % 128;
                    int i21 = i20 % 2;
                    z = true;
                } else {
                    z = false;
                }
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    if (z) {
                        int i22 = $10 + 13;
                        $11 = i22 % 128;
                        int i23 = i22 % 2;
                        byte[] bArr6 = MediaMetadataCompat;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r6]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        short[] sArr = MediaDescriptionCompat;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r6]) ^ 7899112766888837815L)) + s)) ^ b));
                    }
                    sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x012d  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2447
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createString.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.IconCompatParcelizer;
        if (getsubjectstat != null) {
            int i2 = MediaBrowserCompatSearchResultReceiver + 87;
            MediaBrowserCompatMediaItem = i2 % 128;
            int i3 = i2 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
            if (i3 != 0) {
                throw null;
            }
        }
        int i4 = MediaBrowserCompatSearchResultReceiver + 41;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 56 / 0;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 93;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplBaseParcelizer().af_();
        int i4 = MediaBrowserCompatMediaItem + 51;
        MediaBrowserCompatSearchResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatSearchResultReceiver + 23;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        if (this.write == null) {
            synchronized (this.read) {
                if (this.write == null) {
                    this.write = MediaBrowserCompatItemReceiver();
                }
            }
        }
        return this.write;
    }

    protected final void AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 67;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        if (this.RemoteActionCompatParcelizer) {
            return;
        }
        this.RemoteActionCompatParcelizer = true;
        int i4 = MediaBrowserCompatSearchResultReceiver + 51;
        MediaBrowserCompatMediaItem = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 113;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = MediaBrowserCompatSearchResultReceiver + 97;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 == 0) {
            return RemoteActionCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatSearchResultReceiver + 23;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 126, new byte[]{-125, -127, -117, -124, -110, -111, -112, -114, -122, -113, -122, -114, -118, -115, -121, -116, -116, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 95, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) + 46), (-1122271377) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1), 40667970 + (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 125), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i4 = MediaBrowserCompatMediaItem + 63;
                MediaBrowserCompatSearchResultReceiver = i4 % 128;
                int i5 = i4 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i6 = MediaBrowserCompatMediaItem + 57;
            MediaBrowserCompatSearchResultReceiver = i6 % 128;
            try {
                if (i6 % 2 == 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ExpandableListView.getPackedPositionType(0L) + 4535), 6054 - View.resolveSize(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) View.resolveSizeAndState(0, 0, 0), 6030 - Color.red(0), TextUtils.getCapsMode("", 0, 0) + 24, 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    int i7 = 10 / 0;
                } else {
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (4535 - (KeyEvent.getMaxKeyCode() >> 16)), 6055 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.lastIndexOf("", '0', 0) + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(823471051);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (1 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 6030, 23 - TextUtils.indexOf((CharSequence) "", '0'), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke2, objArr4);
                }
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

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = MediaBrowserCompatMediaItem + 95;
            MediaBrowserCompatSearchResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a((ViewConfiguration.getScrollBarSize() >> 8) + 127, new byte[]{-125, -127, -117, -124, -110, -111, -112, -114, -122, -113, -122, -114, -118, -115, -121, -116, -116, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 98, (short) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 47), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() - 1122271332, (ViewConfiguration.getFadingEdgeLength() >> 16) + 40667970, (byte) ((Process.myTid() >> 22) - 115), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = MediaBrowserCompatSearchResultReceiver + 35;
            MediaBrowserCompatMediaItem = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ExpandableListView.getPackedPositionChild(0L) + 4536), ImageFormat.getBitsPerPixel(0) + 6055, 42 - TextUtils.indexOf("", "", 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6030, 24 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -861814097, false, "read", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    throw null;
                }
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (4535 - (ViewConfiguration.getWindowTouchSlop() >> 8)), (KeyEvent.getMaxKeyCode() >> 16) + 6054, MotionEvent.axisFromString("") + 43, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) KeyEvent.keyCodeFromString(""), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 6030, TextUtils.getOffsetBefore("", 0) + 24, -861814097, false, "read", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(objInvoke2, objArr4);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
        int i5 = MediaBrowserCompatMediaItem + 35;
        MediaBrowserCompatSearchResultReceiver = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:178:0x0b1b A[Catch: all -> 0x02e7, TryCatch #4 {all -> 0x02e7, blocks: (B:176:0x0b15, B:178:0x0b1b, B:179:0x0b45, B:209:0x0fb6, B:211:0x0fbc, B:212:0x0fe5, B:245:0x145f, B:247:0x1465, B:248:0x148c, B:226:0x1196, B:228:0x11b8, B:229:0x120d, B:69:0x044c, B:71:0x0452, B:72:0x0482, B:19:0x0142, B:21:0x0148, B:22:0x0174, B:24:0x025c, B:26:0x028c, B:27:0x02e1, B:34:0x02f1, B:36:0x02f5, B:40:0x0301, B:55:0x03d4, B:57:0x03da, B:58:0x03db, B:60:0x03dd, B:62:0x03e4, B:63:0x03e5, B:48:0x0350, B:50:0x035d, B:51:0x03c9, B:44:0x030a, B:46:0x031e, B:47:0x034a), top: B:280:0x0142, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0113  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5765
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createString.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 43;
        MediaBrowserCompatSearchResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatSearchResultReceiver + 117;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
