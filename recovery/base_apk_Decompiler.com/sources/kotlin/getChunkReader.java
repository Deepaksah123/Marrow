package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.alignInputToEvenPosition;
import kotlin.calculateNextSearchBytePosition;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes5.dex */
abstract class getChunkReader<C extends alignInputToEvenPosition> extends menuHostHelperlambda0 {
    private static int $10 = 0;
    private static int $11 = 1;
    private static char[] MediaBrowserCompatMediaItem;
    private static boolean MediaBrowserCompatSearchResultReceiver;
    private static int MediaDescriptionCompat;
    private static int MediaMetadataCompat;
    private static boolean RatingCompat;
    private static final int RemoteActionCompatParcelizer;
    private static final int read;
    private AmrExtractorFlags<C> AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private FrameLayout AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    boolean IconCompatParcelizer;
    private FrameLayout MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private FlacStreamMetadata write;
    private static final byte[] $$d = {94, -36, -26, 62, 61, -61, -2, -19, 30, -19, -23, 7, -9, 3, 9, 0, -7, -23, -12, -6, -9, 11, 32, -38, -21, 7, -10, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17};
    private static final int $$e = 171;
    private static final byte[] $$a = {37, TarConstants.LF_PAX_EXTENDED_HEADER_UC, 106, 111, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 49;
    private static int onAddQueueItem = 0;
    private static int onCommand = 1;
    private static int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 * 12
            int r7 = r7 + 65
            byte[] r0 = kotlin.getChunkReader.$$a
            int r6 = r6 * 10
            int r6 = 44 - r6
            int r8 = r8 + 4
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r7 = r6
            r3 = r8
            r5 = r2
            goto L27
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L25:
            r3 = r0[r8]
        L27:
            int r8 = r8 + 1
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getChunkReader.a(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r8 = 17 - r8
            int r0 = r7 + 4
            byte[] r1 = kotlin.getChunkReader.$$d
            int r6 = r6 + 82
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2c
        L12:
            r3 = r2
        L13:
            r5 = r8
            r8 = r6
            r6 = r5
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r1[r6]
            int r3 = r3 + 1
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r8 = r8 + 1
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + (-4)
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getChunkReader.c(short, byte, short, java.lang.Object[]):void");
    }

    abstract int IconCompatParcelizer();

    abstract AmrExtractorFlags<C> IconCompatParcelizer(FrameLayout frameLayout);

    abstract int MediaBrowserCompatCustomActionResultReceiver();

    abstract int RemoteActionCompatParcelizer();

    abstract void write(AmrExtractorFlags<C> amrExtractorFlags);

    static {
        MediaDescriptionCompat = 0;
        AudioAttributesImplApi21Parcelizer();
        read = calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.coordinator;
        RemoteActionCompatParcelizer = calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.touch_outside;
        int i = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver + 11;
        MediaDescriptionCompat = i % 128;
        int i2 = i % 2;
    }

    getChunkReader(Context context, int i, int i2, int i3) {
        super(context, RemoteActionCompatParcelizer(context, i, i2, i3));
        this.IconCompatParcelizer = true;
        this.AudioAttributesImplBaseParcelizer = true;
        IconCompatParcelizer(1);
    }

    @Override // kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public void setContentView(int i) {
        int i2 = 2 % 2;
        int i3 = onAddQueueItem + 81;
        onCommand = i3 % 128;
        int i4 = i3 % 2;
        super.setContentView(IconCompatParcelizer(i, null, null));
        if (i4 == 0) {
            throw null;
        }
        int i5 = onCommand + 45;
        onAddQueueItem = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public void setContentView(View view) {
        int i = 2 % 2;
        int i2 = onCommand + 55;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        super.setContentView(IconCompatParcelizer(0, view, null));
    }

    @Override // kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        int i = 2 % 2;
        int i2 = onCommand + 7;
        onAddQueueItem = i2 % 128;
        super.setContentView(IconCompatParcelizer(i2 % 2 != 0 ? 1 : 0, view, layoutParams));
    }

    private static void b(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = MediaBrowserCompatMediaItem;
        char c = '0';
        Object obj = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i3 = 0;
            while (i3 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (44861 - TextUtils.indexOf("", c)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 18944, TextUtils.indexOf("", "", 0) + 28, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i3++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i4 = $10 + 111;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            cArr2 = cArr3;
        }
        try {
            Object[] objArr3 = {Integer.valueOf(MediaMetadataCompat)};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) View.combineMeasuredStates(0, 0), View.getDefaultSize(0, 0) + 19033, 74 - TextUtils.indexOf((CharSequence) "", '0'), 1457087504, false, "r", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
            int i6 = -1593953308;
            if (MediaBrowserCompatSearchResultReceiver) {
                notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
                char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 0;
                while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                    cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                    Object[] objArr4 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 11439, 13 - ExpandableListView.getPackedPositionChild(0L), -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!RatingCompat) {
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
            int i7 = $11 + 11;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
            char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                int i9 = $11 + 81;
                $10 = i9 % 128;
                if (i9 % 2 != 0) {
                    cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[notifydownloads.AudioAttributesCompatParcelizer >>> notifydownloads.IconCompatParcelizer] << i] - iIntValue);
                    Object[] objArr5 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(i6);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 11438 - TextUtils.lastIndexOf("", '0', 0), 13 - TextUtils.lastIndexOf("", '0'), -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer4).invoke(obj, objArr5);
                } else {
                    cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                    Object[] objArr6 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        objRemoteActionCompatParcelizer5 = startForeground.read((char) View.combineMeasuredStates(0, 0), 11439 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 15, -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
                    obj = null;
                }
                i6 = -1593953308;
            }
            objArr[0] = new String(cArr6);
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    @Override // kotlin.menuHostHelperlambda0, kotlin.onFastForward, android.app.Dialog
    public void onCreate(Bundle bundle) throws Throwable {
        Object[] objArr;
        char c;
        int i = 2 % 2;
        int i2 = onAddQueueItem + 79;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char absoluteGravity = (char) (13183 - Gravity.getAbsoluteGravity(0, 0));
            int iIndexOf = TextUtils.indexOf("", "", 0, 0) + 1649;
            int i4 = 27 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            byte b = $$a[5];
            Object[] objArr2 = new Object[1];
            a(b, r1[53], b, objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(absoluteGravity, iIndexOf, i4, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char c2 = (char) (13184 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                int tapTimeout = 1649 - (ViewConfiguration.getTapTimeout() >> 16);
                int i5 = 25 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1));
                byte[] bArr = $$a;
                byte b2 = bArr[53];
                byte b3 = bArr[5];
                byte b4 = (byte) (-bArr[27]);
                Object[] objArr3 = new Object[1];
                a(b2, b3, b4, objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(c2, tapTimeout, i5, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            c = 3;
        } else {
            Object[] objArr4 = new Object[1];
            b(128 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), new byte[]{-115, -116, -117, -118, -119, -120, -124, -121, -122, -126, -123, -124, -126, -125, -126, -127}, null, null, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b(Color.red(0) + 127, new byte[]{-116, -113, -109, -110, -111, -118, -126, -112, -119, -117, -114, -117, -122, -116, -113, -114}, null, null, objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i6 = onAddQueueItem + 27;
            onCommand = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, -1778756472};
                Object[] objArr7 = new Object[1];
                c((byte) ($$d[8] - 1), r1[11], (byte) 13, objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                c(r1[22], r1[15], r1[13], objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char scrollBarFadeDuration = (char) (13183 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    int i8 = (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1648;
                    int i9 = 26 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                    byte[] bArr2 = $$a;
                    byte b5 = bArr2[53];
                    byte b6 = bArr2[5];
                    byte b7 = (byte) (-bArr2[27]);
                    Object[] objArr9 = new Object[1];
                    a(b5, b6, b7, objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(scrollBarFadeDuration, i8, i9, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b(((Process.getThreadPriority(0) + 20) >> 6) + 127, new byte[]{-106, -107, -109, -123, -110, -115, -116, -117, -118, -119, -120, -124, -118, -109, -124, -113, -114, -109, -108, -113, -122, -126}, null, null, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b(126 - ImageFormat.getBitsPerPixel(0), new byte[]{-116, -115, -114, -117, -123, -126, -116, -104, -113, -116, -118, -105, -126, -123, -116}, null, null, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char c3 = (char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 13182);
                        int deadChar = KeyEvent.getDeadChar(0, 0) + 1649;
                        int iIndexOf2 = TextUtils.indexOf("", "", 0, 0) + 26;
                        byte[] bArr3 = $$a;
                        byte b8 = bArr3[53];
                        byte b9 = bArr3[5];
                        Object[] objArr12 = new Object[1];
                        a(b8, b9, (byte) (b9 | TarConstants.LF_GNUTYPE_LONGNAME), objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(c3, deadChar, iIndexOf2, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char pressedStateDuration = (char) ((ViewConfiguration.getPressedStateDuration() >> 16) + 13183);
                        int i10 = (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 1649;
                        int i11 = (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 25;
                        byte b10 = $$a[5];
                        Object[] objArr13 = new Object[1];
                        a(b10, r9[53], b10, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(pressedStateDuration, i10, i11, -133433128, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf2);
                    c = 3;
                } catch (Exception unused) {
                    throw new RuntimeException();
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        int i12 = ((int[]) objArr[c])[0];
        int i13 = ((int[]) objArr[2])[0];
        if (i13 != i12) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i12 ^ i13)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 4536), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6054, (ViewConfiguration.getEdgeSlop() >> 16) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i14 = onCommand + 123;
                onAddQueueItem = i14 % 128;
                int i15 = i14 % 2;
                try {
                    Object[] objArr14 = {-1928509275, Long.valueOf(j3), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) Color.red(0), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6030, (Process.myPid() >> 22) + 24);
                    byte b11 = $$d[15];
                    byte b12 = b11;
                    Object[] objArr15 = new Object[1];
                    c(b12, (byte) (b12 | 24), b11, objArr15);
                    cls4.getMethod((String) objArr15[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke, objArr14);
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
        }
        super.onCreate(bundle);
        Window window = getWindow();
        if (window != null) {
            window.setStatusBarColor(0);
            window.addFlags(Integer.MIN_VALUE);
            window.setLayout(-1, -1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    @Override // android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void setCancelable(boolean r4) {
        /*
            r3 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.getChunkReader.onAddQueueItem
            int r1 = r1 + 19
            int r2 = r1 % 128
            kotlin.getChunkReader.onCommand = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L1a
            super.setCancelable(r4)
            boolean r1 = r3.IconCompatParcelizer
            r2 = 63
            int r2 = r2 / 0
            if (r1 == r4) goto L23
            goto L21
        L1a:
            super.setCancelable(r4)
            boolean r1 = r3.IconCompatParcelizer
            if (r1 == r4) goto L23
        L21:
            r3.IconCompatParcelizer = r4
        L23:
            android.view.Window r4 = r3.getWindow()
            if (r4 == 0) goto L49
            int r4 = kotlin.getChunkReader.onCommand
            int r4 = r4 + 99
            int r1 = r4 % 128
            kotlin.getChunkReader.onAddQueueItem = r1
            int r4 = r4 % r0
            if (r4 != 0) goto L41
            r3.RatingCompat()
            int r3 = kotlin.getChunkReader.onCommand
            int r3 = r3 + 21
            int r4 = r3 % 128
            kotlin.getChunkReader.onAddQueueItem = r4
            int r3 = r3 % r0
            goto L49
        L41:
            r3.RatingCompat()
            r3 = 0
            r3.hashCode()
            throw r3
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getChunkReader.setCancelable(boolean):void");
    }

    private void RatingCompat() {
        int i = 2 % 2;
        int i2 = onCommand + 35;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        FlacStreamMetadata flacStreamMetadata = this.write;
        if (flacStreamMetadata == null) {
            return;
        }
        if (this.IconCompatParcelizer) {
            flacStreamMetadata.RemoteActionCompatParcelizer();
            return;
        }
        flacStreamMetadata.IconCompatParcelizer();
        int i4 = onCommand + 75;
        onAddQueueItem = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.onFastForward, android.app.Dialog
    public void onStart() {
        int i = 2 % 2;
        super.onStart();
        AmrExtractorFlags<C> amrExtractorFlags = this.AudioAttributesCompatParcelizer;
        if (amrExtractorFlags != null) {
            int i2 = onAddQueueItem + 119;
            onCommand = i2 % 128;
            if (i2 % 2 == 0) {
                if (amrExtractorFlags.write() != 5) {
                    return;
                }
            } else if (amrExtractorFlags.write() != 5) {
                return;
            }
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(MediaBrowserCompatCustomActionResultReceiver());
            int i3 = onCommand + 115;
            onAddQueueItem = i3 % 128;
            int i4 = i3 % 2;
        }
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onAttachedToWindow() {
        int i = 2 % 2;
        int i2 = onCommand + 101;
        onAddQueueItem = i2 % 128;
        if (i2 % 2 != 0) {
            super.onAttachedToWindow();
            MediaMetadataCompat();
            RatingCompat();
            int i3 = 45 / 0;
            return;
        }
        super.onAttachedToWindow();
        MediaMetadataCompat();
        RatingCompat();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public void onDetachedFromWindow() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 23;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        super.onDetachedFromWindow();
        FlacStreamMetadata flacStreamMetadata = this.write;
        if (flacStreamMetadata != null) {
            int i4 = onCommand + 19;
            onAddQueueItem = i4 % 128;
            int i5 = i4 % 2;
            flacStreamMetadata.IconCompatParcelizer();
            if (i5 != 0) {
                int i6 = 92 / 0;
            }
        }
        int i7 = onAddQueueItem + 79;
        onCommand = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public void cancel() {
        int i = 2 % 2;
        int i2 = onCommand + 97;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        write();
        super.cancel();
        int i4 = onCommand + 121;
        onAddQueueItem = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Dialog
    public void setCanceledOnTouchOutside(boolean z) {
        int i = 2 % 2;
        int i2 = onCommand + 111;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        super.setCanceledOnTouchOutside(z);
        if (z) {
            int i4 = onCommand;
            int i5 = i4 + 67;
            onAddQueueItem = i5 % 128;
            if (i5 % 2 == 0) {
                if (!this.IconCompatParcelizer) {
                    int i6 = i4 + 75;
                    onAddQueueItem = i6 % 128;
                    int i7 = i6 % 2;
                    this.IconCompatParcelizer = true;
                }
            } else {
                throw null;
            }
        }
        this.AudioAttributesImplBaseParcelizer = z;
        this.MediaBrowserCompatItemReceiver = true;
    }

    private void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 39;
        onCommand = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            obj.hashCode();
            throw null;
        }
        if (this.AudioAttributesImplApi26Parcelizer == null) {
            FrameLayout frameLayout = (FrameLayout) View.inflate(getContext(), IconCompatParcelizer(), null);
            this.AudioAttributesImplApi26Parcelizer = frameLayout;
            FrameLayout frameLayout2 = (FrameLayout) frameLayout.findViewById(RemoteActionCompatParcelizer());
            this.MediaBrowserCompatCustomActionResultReceiver = frameLayout2;
            AmrExtractorFlags<C> amrExtractorFlagsIconCompatParcelizer = IconCompatParcelizer(frameLayout2);
            this.AudioAttributesCompatParcelizer = amrExtractorFlagsIconCompatParcelizer;
            write(amrExtractorFlagsIconCompatParcelizer);
            this.write = new FlacStreamMetadata(this.AudioAttributesCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver);
        }
        int i3 = onAddQueueItem + 19;
        onCommand = i3 % 128;
        int i4 = i3 % 2;
    }

    private FrameLayout AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = onCommand;
        int i3 = i2 + 37;
        onAddQueueItem = i3 % 128;
        int i4 = i3 % 2;
        if (this.AudioAttributesImplApi26Parcelizer == null) {
            int i5 = i2 + 25;
            onAddQueueItem = i5 % 128;
            if (i5 % 2 == 0) {
                AudioAttributesImplApi26Parcelizer();
            } else {
                AudioAttributesImplApi26Parcelizer();
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        FrameLayout frameLayout = this.AudioAttributesImplApi26Parcelizer;
        int i6 = onCommand + 81;
        onAddQueueItem = i6 % 128;
        int i7 = i6 % 2;
        return frameLayout;
    }

    private FrameLayout MediaBrowserCompatSearchResultReceiver() {
        int i = 2 % 2;
        if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
            AudioAttributesImplApi26Parcelizer();
            int i2 = onCommand + 53;
            onAddQueueItem = i2 % 128;
            int i3 = i2 % 2;
        }
        FrameLayout frameLayout = this.MediaBrowserCompatCustomActionResultReceiver;
        int i4 = onCommand + 89;
        onAddQueueItem = i4 % 128;
        if (i4 % 2 == 0) {
            return frameLayout;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    AmrExtractorFlags<C> write() {
        int i = 2 % 2;
        int i2 = onAddQueueItem + 117;
        onCommand = i2 % 128;
        if (i2 % 2 != 0) {
            if (this.AudioAttributesCompatParcelizer == null) {
                AudioAttributesImplApi26Parcelizer();
                int i3 = onCommand + 41;
                onAddQueueItem = i3 % 128;
                int i4 = i3 % 2;
            }
            return this.AudioAttributesCompatParcelizer;
        }
        throw null;
    }

    final /* synthetic */ void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        if (this.IconCompatParcelizer && isShowing()) {
            int i2 = onCommand + 43;
            onAddQueueItem = i2 % 128;
            int i3 = i2 % 2;
            if (MediaBrowserCompatMediaItem()) {
                int i4 = onAddQueueItem + 33;
                onCommand = i4 % 128;
                int i5 = i4 % 2;
                cancel();
                if (i5 == 0) {
                    int i6 = 5 / 0;
                }
            }
        }
        int i7 = onCommand + 21;
        onAddQueueItem = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 28 / 0;
        }
    }

    private View IconCompatParcelizer(int i, View view, ViewGroup.LayoutParams layoutParams) {
        int i2 = 2 % 2;
        int i3 = onCommand + 111;
        onAddQueueItem = i3 % 128;
        if (i3 % 2 == 0) {
            AudioAttributesImplApi26Parcelizer();
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) AudioAttributesImplBaseParcelizer().findViewById(read);
            if (i != 0 && view == null) {
                int i4 = onAddQueueItem + 51;
                onCommand = i4 % 128;
                int i5 = i4 % 2;
                view = getLayoutInflater().inflate(i, (ViewGroup) coordinatorLayout, false);
            }
            FrameLayout frameLayoutMediaBrowserCompatSearchResultReceiver = MediaBrowserCompatSearchResultReceiver();
            frameLayoutMediaBrowserCompatSearchResultReceiver.removeAllViews();
            if (layoutParams == null) {
                frameLayoutMediaBrowserCompatSearchResultReceiver.addView(view);
            } else {
                frameLayoutMediaBrowserCompatSearchResultReceiver.addView(view, layoutParams);
            }
            coordinatorLayout.findViewById(RemoteActionCompatParcelizer).setOnClickListener(new View.OnClickListener() { // from class: o.parseIdx1Body
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.IconCompatParcelizer.MediaBrowserCompatItemReceiver();
                }
            });
            InvalidTypeIdException.AudioAttributesCompatParcelizer(MediaBrowserCompatSearchResultReceiver(), new deserializeUsingCustom() { // from class: o.getChunkReader.5
                @Override // kotlin.deserializeUsingCustom
                public final void onInitializeAccessibilityNodeInfo(View view2, hasSuperClassStartingWith hassuperclassstartingwith) {
                    super.onInitializeAccessibilityNodeInfo(view2, hassuperclassstartingwith);
                    if (getChunkReader.this.IconCompatParcelizer) {
                        hassuperclassstartingwith.AudioAttributesCompatParcelizer(ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES);
                        hassuperclassstartingwith.MediaBrowserCompatItemReceiver(true);
                    } else {
                        hassuperclassstartingwith.MediaBrowserCompatItemReceiver(false);
                    }
                }

                @Override // kotlin.deserializeUsingCustom
                public final boolean performAccessibilityAction(View view2, int i6, Bundle bundle) {
                    if (i6 == 1048576 && getChunkReader.this.IconCompatParcelizer) {
                        getChunkReader.this.cancel();
                        return true;
                    }
                    return super.performAccessibilityAction(view2, i6, bundle);
                }
            });
            return this.AudioAttributesImplApi26Parcelizer;
        }
        AudioAttributesImplApi26Parcelizer();
        throw null;
    }

    private void MediaMetadataCompat() {
        FrameLayout frameLayout;
        int i;
        int i2 = 2 % 2;
        Window window = getWindow();
        if (window == null || (frameLayout = this.MediaBrowserCompatCustomActionResultReceiver) == null || !(frameLayout.getLayoutParams() instanceof CoordinatorLayout.RemoteActionCompatParcelizer)) {
            return;
        }
        int i3 = onCommand + 113;
        onAddQueueItem = i3 % 128;
        if (i3 % 2 == 0 ? _clearIfStdImpl.write(((CoordinatorLayout.RemoteActionCompatParcelizer) this.MediaBrowserCompatCustomActionResultReceiver.getLayoutParams()).write, InvalidTypeIdException.MediaBrowserCompatMediaItem(this.MediaBrowserCompatCustomActionResultReceiver)) != 3 : _clearIfStdImpl.write(((CoordinatorLayout.RemoteActionCompatParcelizer) this.MediaBrowserCompatCustomActionResultReceiver.getLayoutParams()).write, InvalidTypeIdException.MediaBrowserCompatMediaItem(this.MediaBrowserCompatCustomActionResultReceiver)) != 2) {
            i = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Animation_Material3_SideSheetDialog_Right;
        } else {
            i = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Animation_Material3_SideSheetDialog_Left;
            int i4 = onCommand + 101;
            onAddQueueItem = i4 % 128;
            int i5 = i4 % 2;
        }
        window.setWindowAnimations(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean MediaBrowserCompatMediaItem() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.getChunkReader.onAddQueueItem
            int r1 = r1 + 19
            int r2 = r1 % 128
            kotlin.getChunkReader.onCommand = r2
            int r1 = r1 % r0
            r3 = 0
            if (r1 != 0) goto L17
            boolean r1 = r5.MediaBrowserCompatItemReceiver
            r4 = 10
            int r4 = r4 / r3
            if (r1 != 0) goto L3e
            goto L1c
        L17:
            boolean r1 = r5.MediaBrowserCompatItemReceiver
            if (r1 == 0) goto L1c
            goto L3e
        L1c:
            int r2 = r2 + 123
            int r1 = r2 % 128
            kotlin.getChunkReader.onAddQueueItem = r1
            int r2 = r2 % r0
            android.content.Context r0 = r5.getContext()
            r1 = 16843611(0x101035b, float:2.3695965E-38)
            int[] r1 = new int[]{r1}
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            r1 = 1
            boolean r2 = r0.getBoolean(r3, r1)
            r5.AudioAttributesImplBaseParcelizer = r2
            r0.recycle()
            r5.MediaBrowserCompatItemReceiver = r1
        L3e:
            boolean r5 = r5.AudioAttributesImplBaseParcelizer
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getChunkReader.MediaBrowserCompatMediaItem():boolean");
    }

    private static int RemoteActionCompatParcelizer(Context context, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = onCommand + 91;
        int i6 = i5 % 128;
        onAddQueueItem = i6;
        int i7 = i5 % 2;
        if (i != 0) {
            int i8 = i6 + 45;
            onCommand = i8 % 128;
            int i9 = i8 % 2;
            return i;
        }
        TypedValue typedValue = new TypedValue();
        if (!context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return i3;
        }
        int i10 = onAddQueueItem + 87;
        onCommand = i10 % 128;
        int i11 = i10 % 2;
        int i12 = typedValue.resourceId;
        int i13 = onAddQueueItem + 117;
        onCommand = i13 % 128;
        int i14 = i13 % 2;
        return i12;
    }

    static void AudioAttributesImplApi21Parcelizer() {
        MediaBrowserCompatMediaItem = new char[]{28460, 28439, 28448, 28520, 28458, 28456, 28433, 28421, 28479, 28453, 28450, 28435, 28459, 28463, 28434, 28430, 28462, 28533, 28457, 28452, 28437, 28461, 28454, 28420};
        MediaMetadataCompat = 411398070;
        RatingCompat = true;
        MediaBrowserCompatSearchResultReceiver = true;
    }
}
