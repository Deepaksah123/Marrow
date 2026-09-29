package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.lang.reflect.Method;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public class zabr extends addObserverForBackInvoker {
    private parsePeriod RemoteActionCompatParcelizer;
    private static final byte[] $$D = {10, -79, -66, -51};
    private static final int $$G = 110;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$B = {32, -1, TarConstants.LF_GNUTYPE_SPARSE, -45, 18, 4, -57, 62, 1, 24, 7, -9, 19, 12, -5, 5, -56, 66, -3, 8, 14, 14, 2, 5, -58, 60, 3, 25, -13, 7, 13, 11, -4, -48, 66, 0, 13, -52, 9, 0, 34, 0, 13, -20, 9, 39, 37, -5, 9, -66, TarConstants.LF_BLK, 21, 28, -29, 43, -3, -5, -17, 25, 18, -2, 58, -11, 11, 12, -40, 57, 6, 4, -3, -1, 25, 5, -9, 20, -42, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19, 25, 14, 8, 11, -9, -30, 40, 23, -5, 12, 5, -37, TarConstants.LF_SYMLINK, 4, 9, -9, 25, -30, 23, 23, -9, 8, 13, 3, 23, -15, 19, -59, 63, 4, 21, -28, 21, 25, -5, 11, -1, -7, 2, 9};
    private static final int $$C = 146;
    private static final byte[] $$j = {18, -64, -35, -97, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$k = 226;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int AudioAttributesImplApi21Parcelizer = 1;
    private static char[] AudioAttributesCompatParcelizer = {6426, 6471, 6465, 6425, 6401, 6477, 6431, 6478, 6417, 6492, 6520, 6430, 6481, 6473, 6409, 6475, 6496, 6416, 6474, 6403, 6491, 6418, 6494, 6469, 6410, 6479, 6476, 6428, 6411, 6424, 6470, 6400, 6408, 6488, 6427, 6507, 6405, 6402, 6404, 6406, 6468, 6407, 6429, 6490, 6464, 6489, 6493, 6522, 6505};
    private static char read = 11445;
    private static char[] IconCompatParcelizer = {56417, 8025, 23041, 38369, 53464, 32824, 17179, 1637, 51631, 35974, 20460, 4917, 54851, 39256, 23717, 8081, 58003, 42504, 26886, 11333, 61348, 45807, 30172, 14645, 64612, 49021, 33453, 17891, 2248, 52248, 36721, 56430, 7953, 23093, 38380, 53389, 5090, 20327, 35328, 50440, 228, 17281, 48857, 64036, 13649, 28672, 46076, 61172, 10625, 25974, 41081, 58190, 56993, 6647, 21706, 36885, 54053, 3600, 18833, 34031, 51142, 789, 32352, 47544, 62657, 14307, 29549, 44637, 59701, 9399, 26590, 41693, 40498, 55633, 5208, 22527, 37506, 52692, 2425, 17529, 34564, 49906, 15785, 30925, 46118, 63351, 12827, 28061, 43170, 60353, 10058, 25194, 23879, 39058, 56288, 41366, 25261, 10182, 59423, 44337, 28225, 15031, 63888, 48371, 29496, 13891, 62829, 43444, 27783, 9178, 59007, 42294, 22592, 7358, 54165, 38608, 21796, 57956, 8519, 25657, 44019, 61146, 11696, 29033, 46111, 64266, 16122, 32147, 32946, 50284, 2890, 19993, 36340, 53416, 6058, 23409, 40494, 56598, 57586, 56372, 7953, 23138, 38328, 53384, 5091, 20275, 35328, 50522, 178, 17280};
    private static long write = 2493296162826559264L;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$J(int r7, short r8, byte r9) {
        /*
            int r9 = r9 * 2
            int r9 = 1 - r9
            byte[] r0 = kotlin.zabr.$$D
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r8 = r8 * 2
            int r8 = r8 + 101
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2b
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r7]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2b:
            int r7 = -r7
            int r7 = r7 + r3
            int r8 = r8 + 1
            r3 = r4
            r6 = r8
            r8 = r7
            r7 = r6
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zabr.$$J(int, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void o(byte r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            int r0 = r7 + 4
            int r6 = 114 - r6
            byte[] r1 = kotlin.zabr.$$j
            int r8 = 190 - r8
            byte[] r0 = new byte[r0]
            int r7 = r7 + 3
            r2 = -1
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2c
        L12:
            r3 = r2
        L13:
            int r3 = r3 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r0, r7)
            r9[r7] = r6
            return
        L23:
            int r8 = r8 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r8 = r8 + r6
            int r6 = r8 + (-1)
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zabr.o(byte, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void p(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.zabr.$$B
            int r6 = r6 + 65
            int r7 = r7 + 4
            int r1 = r8 + 4
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r6 = r7
            r4 = r8
            r3 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L28:
            int r7 = r7 + r4
            int r7 = r7 + (-6)
            int r6 = r6 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zabr.p(short, short, byte, java.lang.Object[]):void");
    }

    private void read(parsePeriod parseperiod) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 21;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(parseperiod, "");
            this.RemoteActionCompatParcelizer = parseperiod;
            throw null;
        }
        toMagicModuleMetaRepoModel.write(parseperiod, "");
        this.RemoteActionCompatParcelizer = parseperiod;
        int i3 = AudioAttributesImplApi21Parcelizer + 85;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        if (i3 % 2 == 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    protected final parsePeriod AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver;
        int i3 = i2 + 69;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            throw null;
        }
        parsePeriod parseperiod = this.RemoteActionCompatParcelizer;
        if (parseperiod == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }
        int i4 = i2 + 93;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            return parseperiod;
        }
        obj.hashCode();
        throw null;
    }

    private static void n(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i5 = $11 + 29;
            $10 = i5 % 128;
            if (i5 % i3 != 0) {
                int i6 = downloadService.write;
                try {
                    Object[] objArr2 = {Integer.valueOf(IconCompatParcelizer[i2 << i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        byte b = (byte) 0;
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read((char) (Color.alpha(0) + 36621), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 2340, 27 - TextUtils.lastIndexOf("", '0', 0), 480654850, false, $$J(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    long jLongValue = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue();
                    long j = i6;
                    long j2 = write;
                    try {
                        Object[] objArr3 = new Object[4];
                        objArr3[3] = Integer.valueOf(c);
                        objArr3[i3] = Long.valueOf(j2);
                        objArr3[1] = Long.valueOf(j);
                        objArr3[0] = Long.valueOf(jLongValue);
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            char c2 = (char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)));
                            int packedPositionGroup = ExpandableListView.getPackedPositionGroup(0L) + 9701;
                            int iResolveSize = 26 - View.resolveSize(0, 0);
                            Class[] clsArr = new Class[4];
                            clsArr[0] = Long.TYPE;
                            clsArr[1] = Long.TYPE;
                            clsArr[i3] = Long.TYPE;
                            clsArr[3] = Integer.TYPE;
                            objRemoteActionCompatParcelizer2 = startForeground.read(c2, packedPositionGroup, iResolveSize, 1186869823, false, "d", clsArr);
                        }
                        jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                        try {
                            Object[] objArr4 = {downloadService, downloadService};
                            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                            if (objRemoteActionCompatParcelizer3 == null) {
                                char edgeSlop = (char) (ViewConfiguration.getEdgeSlop() >> 16);
                                int iAlpha = Color.alpha(0) + 23784;
                                int i7 = (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 32;
                                Class[] clsArr2 = new Class[i3];
                                clsArr2[0] = Object.class;
                                clsArr2[1] = Object.class;
                                objRemoteActionCompatParcelizer3 = startForeground.read(edgeSlop, iAlpha, i7, -1690012015, false, "b", clsArr2);
                            }
                            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
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
            } else {
                int i8 = downloadService.write;
                try {
                    Object[] objArr5 = {Integer.valueOf(IconCompatParcelizer[i2 + i8])};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        byte b3 = (byte) 0;
                        byte b4 = b3;
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (36620 - TextUtils.lastIndexOf("", '0', 0)), View.resolveSizeAndState(0, 0, 0) + 2340, TextUtils.getOffsetBefore("", 0) + 28, 480654850, false, $$J(b3, b4, b4), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr6 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).longValue()), Long.valueOf(i8), Long.valueOf(write), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        objRemoteActionCompatParcelizer5 = startForeground.read((char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), Color.alpha(0) + 9701, ExpandableListView.getPackedPositionChild(0L) + 27, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i8] = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).longValue();
                    Object[] objArr7 = {downloadService, downloadService};
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-452087292);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        objRemoteActionCompatParcelizer6 = startForeground.read((char) (1 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), TextUtils.lastIndexOf("", '0') + 23785, 33 - (ViewConfiguration.getLongPressTimeout() >> 16), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
                } catch (Throwable th4) {
                    Throwable cause4 = th4.getCause();
                    if (cause4 == null) {
                        throw th4;
                    }
                    throw cause4;
                }
            }
            int i9 = $11 + 109;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            i3 = 2;
        }
        char[] cArr = new char[i];
        downloadService.write = 0;
        while (downloadService.write < i) {
            int i11 = $10 + 13;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr8 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer7 == null) {
                objRemoteActionCompatParcelizer7 = startForeground.read((char) (TextUtils.indexOf((CharSequence) "", '0') + 1), 23784 - KeyEvent.keyCodeFromString(""), 32 - TextUtils.lastIndexOf("", '0', 0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr8);
        }
        objArr[0] = new String(cArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x018c  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2685
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zabr.onCreate(android.os.Bundle):void");
    }

    private static void m(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        long j;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = AudioAttributesCompatParcelizer;
        Object obj2 = null;
        int i4 = 6;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getJumpTapTimeout() >> 16), 7015 - ((Process.getThreadPriority(0) + 20) >> i4), Drawable.resolveOpacity(0, 0) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i5++;
                    i4 = 6;
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
        Object[] objArr3 = {Integer.valueOf(read)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        long j2 = 0;
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) View.resolveSize(0, 0), (ViewConfiguration.getWindowTouchSlop() >> 8) + 7015, ExpandableListView.getPackedPositionChild(0L) + 31, -626716224, false, "o", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
            int i6 = $11 + 57;
            $10 = i6 % 128;
            int i7 = i6 % 2;
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
                    j = j2;
                    obj = obj2;
                } else {
                    Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (48193 - MotionEvent.axisFromString("")), TextUtils.getCapsMode("", 0, 0) + 20126, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 20, 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                        int i8 = $11 + 125;
                        $10 = i8 % 128;
                        int i9 = i8 % 2;
                        Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            j = 0;
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) (Color.rgb(0, 0, 0) + BlockingViewModel_HiltModulesKeyModule.OKHTTP_CLIENT_WINDOW_SIZE), 19369 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 18, 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        } else {
                            j = 0;
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        int i10 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i10];
                        int i11 = $10 + 69;
                        $11 = i11 % 128;
                        int i12 = i11 % 2;
                    } else {
                        obj = null;
                        j = 0;
                        if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                            int i13 = $10 + 95;
                            $11 = i13 % 128;
                            int i14 = i13 % 2;
                            needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                            needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                            int i15 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            int i16 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i15];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i16];
                        } else {
                            int i17 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            int i18 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i17];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i18];
                        }
                    }
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
                int i19 = $11 + 47;
                $10 = i19 % 128;
                int i20 = i19 % 2;
                obj2 = obj;
                j2 = j;
            }
        }
        for (int i21 = 0; i21 < i; i21++) {
            cArr4[i21] = (char) (cArr4[i21] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ed  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zabr.onResume():void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            int i2 = AudioAttributesImplApi21Parcelizer + 97;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            n((char) ((AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23637), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(5) - 71, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 4, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            m((byte) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 3), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 14, new char[]{18, '+', 13804, 13804, 2, '!', '\r', ',', 13806, 13806, '%', 5, 20, '\b', 16, '\t', 2, 29}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = AudioAttributesImplApi21Parcelizer + 5;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i6 = MediaBrowserCompatCustomActionResultReceiver + 71;
            AudioAttributesImplApi21Parcelizer = i6 % 128;
            try {
                if (i6 % 2 == 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - TextUtils.indexOf("", "", 0)), 6053 - TextUtils.indexOf((CharSequence) "", '0', 0), 42 - TextUtils.indexOf("", ""), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 6029 - ((byte) KeyEvent.getModifierMetaStateMask()), 24 - View.resolveSizeAndState(0, 0, 0), -861814097, false, "read", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    int i7 = 20 / 0;
                } else {
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (4535 - (Process.myTid() >> 22)), 6053 - TextUtils.lastIndexOf("", '0', 0), 42 - Color.red(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                    Object[] objArr4 = {baseContext};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 6029, (ViewConfiguration.getWindowTouchSlop() >> 8) + 24, -861814097, false, "read", new Class[]{Context.class});
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
        super.onPause();
    }

    /* JADX WARN: Removed duplicated region for block: B:131:0x0926 A[Catch: all -> 0x0392, TryCatch #9 {all -> 0x0392, blocks: (B:178:0x0b51, B:180:0x0b57, B:181:0x0b82, B:211:0x0fc0, B:213:0x0fc6, B:214:0x0ff3, B:254:0x14b8, B:256:0x14be, B:257:0x14e4, B:235:0x125c, B:237:0x127e, B:238:0x12d7, B:129:0x0920, B:131:0x0926, B:132:0x0950, B:19:0x011f, B:21:0x0125, B:22:0x0150, B:24:0x0309, B:26:0x033a, B:27:0x038c, B:139:0x09e3, B:148:0x09fd, B:144:0x09f1, B:142:0x09ed, B:164:0x0ae0, B:166:0x0ae6, B:167:0x0ae7, B:169:0x0ae9, B:171:0x0af0, B:172:0x0af1, B:153:0x0a07, B:155:0x0a1b, B:156:0x0a48, B:157:0x0a4e, B:159:0x0a5b, B:160:0x0acc), top: B:295:0x011f, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x09d7  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x09f1 A[Catch: all -> 0x0a02, TryCatch #2 {all -> 0x0a02, blocks: (B:139:0x09e3, B:148:0x09fd, B:144:0x09f1, B:142:0x09ed, B:164:0x0ae0, B:166:0x0ae6, B:167:0x0ae7, B:169:0x0ae9, B:171:0x0af0, B:172:0x0af1, B:153:0x0a07, B:155:0x0a1b, B:156:0x0a48, B:157:0x0a4e, B:159:0x0a5b, B:160:0x0acc), top: B:283:0x09d5, outer: #9, inners: #6, #14 }] */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0a1b A[Catch: all -> 0x0ae8, TryCatch #6 {all -> 0x0ae8, blocks: (B:153:0x0a07, B:155:0x0a1b, B:156:0x0a48), top: B:289:0x0a07, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:159:0x0a5b A[Catch: all -> 0x0ade, TryCatch #14 {all -> 0x0ade, blocks: (B:157:0x0a4e, B:159:0x0a5b, B:160:0x0acc), top: B:304:0x0a4e, outer: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0c18  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0c68  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0cbf  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0fa0  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x1083  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x10ce  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x117d  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x1498  */
    /* JADX WARN: Removed duplicated region for block: B:320:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0794  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x07cb A[Catch: all -> 0x0881, TryCatch #0 {all -> 0x0881, blocks: (B:89:0x07c5, B:91:0x07cb, B:92:0x07f5), top: B:279:0x07c5, outer: #3 }] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5909
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.zabr.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 69;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 39 / 0;
        }
        int i5 = MediaBrowserCompatCustomActionResultReceiver + 105;
        AudioAttributesImplApi21Parcelizer = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }
}
