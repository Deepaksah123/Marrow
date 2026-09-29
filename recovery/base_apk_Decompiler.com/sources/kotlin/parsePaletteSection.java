package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.kt.base.BaseDaggerActivity;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import kotlin.getExtendedEsFrChar;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
public abstract class parsePaletteSection<P extends getExtendedEsFrChar> extends BaseDaggerActivity<P> implements SubjectStat {
    private static int $10 = 0;
    private static int $11 = 1;
    private getSubjectStat RemoteActionCompatParcelizer;
    private volatile isHighlighted write;
    private static final byte[] $$p = {11, 40, -34, 98, -61, 61, 2, 19, -47, 39, 10, 15, 2, 5, -11, 3, -11, 31, 7, 5, 2, -9, 0, 16, -35, 45, 7, -1, -8, 23, 23, 12, 6, 9, -11, -32, 38, 21, -7, 10, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17, -61, 35, 28, 3, 9, -4, -26, TarConstants.LF_NORMAL, -7, 5, 2, -9, 23, -1, 5, 14, -25, 23, 13, -6, 5, 17, -9, 17, -43, TarConstants.LF_NORMAL, -7, 5, 2, -18, 24, 27, -30, 15, 15, 13, -12, 18, -9, 0, 7};
    private static final int $$q = 120;
    private static final byte[] $$g = {57, 34, -8, 64, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$h = 190;
    private static int RatingCompat = 0;
    private static int MediaMetadataCompat = 1;
    private static char[] AudioAttributesCompatParcelizer = {6464, 6476, 6524, 6429, 6425, 6505, 6473, 6832, 6490, 6492, 6470, 6472, 6488, 6493, 6407, 6418, 6424, 6834, 6468, 6477, 6406, 6426, 6467, 6478, 6471, 6494, 6835, 6496, 6833, 6431, 6491, 6838, 6427, 6430, 6489, 6520, 6428, 6417, 6465, 6523, 6474, 6469, 6475, 6416, 6525, 6479, 6466, 6507, 6481};
    private static char MediaBrowserCompatCustomActionResultReceiver = 11445;
    private static int[] MediaBrowserCompatSearchResultReceiver = {581501407, -1388364192, -76643447, 1872764211, 884385465, -31333325, -597174905, -1040213375, -146896026, -991431263, -2103192976, 757874479, 473278448, -1151447737, 524359871, 1021858542, 1469802087, -1152759183};
    private final Object IconCompatParcelizer = new Object();
    private boolean read = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(short r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.parsePaletteSection.$$g
            int r1 = 44 - r8
            int r6 = 114 - r6
            int r7 = 190 - r7
            byte[] r1 = new byte[r1]
            int r8 = 43 - r8
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r7
            r6 = r8
            r4 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            int r7 = r7 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r3
            r3 = r7
            r7 = r4
            r4 = r5
        L2b:
            int r7 = -r7
            int r6 = r6 + r7
            int r6 = r6 + (-1)
            r7 = r3
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parsePaletteSection.k(short, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.parsePaletteSection.$$p
            int r1 = r6 + 4
            int r7 = r7 + 4
            int r8 = 114 - r8
            byte[] r1 = new byte[r1]
            int r6 = r6 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r8
            r1[r3] = r4
            if (r3 != r6) goto L21
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L21:
            int r3 = r3 + 1
            r4 = r0[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r3 = r3 + r7
            int r7 = r8 + 1
            int r8 = r3 + (-4)
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parsePaletteSection.l(byte, byte, byte, java.lang.Object[]):void");
    }

    parsePaletteSection() {
        onCustomAction();
    }

    private void onCustomAction() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.parsePaletteSection.2
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                parsePaletteSection.this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0();
            }
        });
        int i2 = MediaMetadataCompat + 87;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    private void onCommand() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 61;
        RatingCompat = i2 % 128;
        if (i2 % 2 == 0) {
            getSubjectStat getsubjectstatWrite = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().write();
            this.RemoteActionCompatParcelizer = getsubjectstatWrite;
            if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                int i3 = RatingCompat + 77;
                MediaMetadataCompat = i3 % 128;
                int i4 = i3 % 2;
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                int i5 = RatingCompat + 27;
                MediaMetadataCompat = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            return;
        }
        getSubjectStat getsubjectstatWrite2 = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().write();
        this.RemoteActionCompatParcelizer = getsubjectstatWrite2;
        getsubjectstatWrite2.RemoteActionCompatParcelizer();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void j(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = MediaBrowserCompatSearchResultReceiver;
        int i3 = -470782045;
        int i4 = 43695;
        int i5 = 16;
        if (iArr2 != null) {
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i6 = $11 + 23;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            int i8 = 0;
            while (i8 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i8])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getPressedStateDuration() >> i5) + i4), View.combineMeasuredStates(0, 0) + 23297, View.resolveSizeAndState(0, 0, 0) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr3[i8] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i8++;
                    i4 = 43695;
                    i5 = 16;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            int i9 = $11 + 85;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = MediaBrowserCompatSearchResultReceiver;
        if (iArr5 != null) {
            int i11 = $10 + 57;
            $11 = i11 % 128;
            int i12 = i11 % 2;
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                int i14 = $11 + 77;
                $10 = i14 % 128;
                int i15 = i14 % 2;
                try {
                    Object[] objArr3 = {Integer.valueOf(iArr5[i13])};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(i3);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (43695 - Color.red(0)), (ViewConfiguration.getWindowTouchSlop() >> 8) + 23297, Color.rgb(0, 0, 0) + 16777231, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr6[i13] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    i13++;
                    i3 = -470782045;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            int i16 = $11 + 115;
            $10 = i16 % 128;
            int i17 = i16 % 2;
            iArr5 = iArr6;
        }
        System.arraycopy(iArr5, 0, iArr4, 0, length2);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = 0;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr4);
            int i18 = 0;
            for (int i19 = 16; i18 < i19; i19 = 16) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i18];
                Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (Color.red(0) + 43695), 23298 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getJumpTapTimeout() >> 16) + 15, -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
                i18++;
            }
            int i20 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i20;
            buildremovealldownloadsintent.read ^= iArr4[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[17];
            int i21 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i22 = buildremovealldownloadsintent.read;
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
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (View.getDefaultSize(0, 0) + 48194), 20127 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), TextUtils.indexOf((CharSequence) "", '0', 0) + 21, 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void i(byte b, int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2;
        Object obj;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = AudioAttributesCompatParcelizer;
        int i4 = 13;
        Object obj2 = null;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            int i5 = 0;
            while (i5 < length) {
                int i6 = $11 + i4;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) KeyEvent.getDeadChar(0, 0), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 7014, 30 - KeyEvent.keyCodeFromString(""), -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i5++;
                    int i8 = $10 + 75;
                    $11 = i8 % 128;
                    int i9 = i8 % 2;
                    i4 = 13;
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
        Object[] objArr3 = {Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) Color.red(0), 7014 - TextUtils.lastIndexOf("", '0', 0, 0), 30 - Color.blue(0), -626716224, false, "o", new Class[]{Integer.TYPE});
        }
        char cCharValue = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
        char[] cArr4 = new char[i];
        if (i % 2 != 0) {
            i2 = i - 1;
            cArr4[i2] = (char) (cArr[i2] - b);
        } else {
            i2 = i;
        }
        if (i2 > 1) {
            needsstartedservice.AudioAttributesCompatParcelizer = 0;
            int i10 = $11 + 35;
            $10 = i10 % 128;
            int i11 = i10 % 2;
            while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                    int i12 = $11 + 9;
                    $10 = i12 % 128;
                    int i13 = i12 % 2;
                    obj = obj2;
                } else {
                    Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (Process.getGidForName("") + 48195), (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20126, (ViewConfiguration.getFadingEdgeLength() >> 16) + 20, 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                    }
                    if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                        int i14 = $10 + 89;
                        $11 = i14 % 128;
                        int i15 = i14 % 2;
                        Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) View.resolveSize(0, 0), (-16757848) - Color.rgb(0, 0, 0), View.getDefaultSize(0, 0) + 18, 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                        }
                        obj = null;
                        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                        int i16 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                        cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i16];
                    } else {
                        obj = null;
                        if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                            int i17 = $11 + 77;
                            $10 = i17 % 128;
                            int i18 = i17 % 2;
                            needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                            needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                            int i19 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            int i20 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i19];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i20];
                        } else {
                            int i21 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            int i22 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i21];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i22];
                        }
                    }
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
                obj2 = obj;
            }
        }
        for (int i23 = 0; i23 < i; i23++) {
            cArr4[i23] = (char) (cArr4[i23] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0195  */
    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parsePaletteSection.onCreate(android.os.Bundle):void");
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() throws NoSuchMethodException {
        int i = 2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.RemoteActionCompatParcelizer;
        if (getsubjectstat != null) {
            int i2 = MediaMetadataCompat + 85;
            RatingCompat = i2 % 128;
            int i3 = i2 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
            if (i3 != 0) {
                int i4 = 62 / 0;
            }
        }
        int i5 = RatingCompat + 41;
        MediaMetadataCompat = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = RatingCompat + 5;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().af_();
        int i4 = MediaMetadataCompat + 41;
        RatingCompat = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted onMediaButtonEvent() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = RatingCompat + 79;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return ishighlighted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        if (this.write == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.write == null) {
                    this.write = onMediaButtonEvent();
                }
            }
        }
        return this.write;
    }

    protected final void r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0() {
        int i = 2 % 2;
        int i2 = RatingCompat;
        int i3 = i2 + 11;
        MediaMetadataCompat = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (this.read) {
            return;
        }
        int i4 = i2 + 57;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
        this.read = true;
        ((parseSubtitlingSegment) af_()).read((paintPixelDataSubBlocks) getSubmittedOnDate.AudioAttributesCompatParcelizer(this));
        int i6 = MediaMetadataCompat + 65;
        RatingCompat = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = RatingCompat + 89;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        if (i3 == 0) {
            int i4 = 71 / 0;
        }
        return RemoteActionCompatParcelizer;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00a9  */
    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 360
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parsePaletteSection.onResume():void");
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() throws Throwable {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 39;
        RatingCompat = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            i((byte) (6 - KeyEvent.getDeadChar(0, 0)), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 25, new char[]{3, '\r', '\b', 15, 31, '-', 6, 15, 5, '\r', '\r', 19, 0, '/', '\n', '%', 24, '\'', '\r', ',', 3, 1, '\f', 15, 0, 2}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            i((byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 74), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 91, new char[]{'0', 7, 13884, 13884, 17, '\f', '\f', 2, 13886, 13886, 17, '\'', '0', 0, '\n', '%', 31, 17}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            int i4 = RatingCompat + 101;
            MediaMetadataCompat = i4 % 128;
            int i5 = i4 % 2;
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - Color.alpha(0)), MotionEvent.axisFromString("") + 6055, TextUtils.getCapsMode("", 0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) Drawable.resolveOpacity(0, 0), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 6031, ExpandableListView.getPackedPositionType(0L) + 24, -861814097, false, "read", new Class[]{Context.class});
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
        int i6 = RatingCompat + 29;
        MediaMetadataCompat = i6 % 128;
        int i7 = i6 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x069c A[Catch: all -> 0x0b20, TRY_LEAVE, TryCatch #0 {all -> 0x0b20, blocks: (B:88:0x0580, B:90:0x0586, B:91:0x05cc, B:97:0x05e7, B:99:0x05ed, B:100:0x0633, B:101:0x063f, B:102:0x0640, B:104:0x0649, B:105:0x0691, B:127:0x09ad, B:128:0x09b1, B:130:0x09b7, B:132:0x09cd, B:135:0x09e3, B:139:0x09f2, B:140:0x09fa, B:147:0x0a6b, B:153:0x0aee, B:155:0x0af4, B:156:0x0af5, B:158:0x0af7, B:160:0x0afe, B:161:0x0aff, B:106:0x069c, B:117:0x0814, B:119:0x081a, B:120:0x0860, B:122:0x0906, B:123:0x094e, B:125:0x0962, B:126:0x09a7, B:165:0x0b0e, B:167:0x0b14, B:168:0x0b15, B:170:0x0b17, B:172:0x0b1e, B:173:0x0b1f, B:112:0x0789, B:114:0x079d, B:115:0x0808, B:149:0x0a70, B:107:0x073c, B:109:0x0751, B:110:0x0782, B:143:0x0a2f, B:145:0x0a35, B:146:0x0a64), top: B:274:0x0580, outer: #7, inners: #5, #6, #11, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x09b7 A[Catch: all -> 0x0b20, TryCatch #0 {all -> 0x0b20, blocks: (B:88:0x0580, B:90:0x0586, B:91:0x05cc, B:97:0x05e7, B:99:0x05ed, B:100:0x0633, B:101:0x063f, B:102:0x0640, B:104:0x0649, B:105:0x0691, B:127:0x09ad, B:128:0x09b1, B:130:0x09b7, B:132:0x09cd, B:135:0x09e3, B:139:0x09f2, B:140:0x09fa, B:147:0x0a6b, B:153:0x0aee, B:155:0x0af4, B:156:0x0af5, B:158:0x0af7, B:160:0x0afe, B:161:0x0aff, B:106:0x069c, B:117:0x0814, B:119:0x081a, B:120:0x0860, B:122:0x0906, B:123:0x094e, B:125:0x0962, B:126:0x09a7, B:165:0x0b0e, B:167:0x0b14, B:168:0x0b15, B:170:0x0b17, B:172:0x0b1e, B:173:0x0b1f, B:112:0x0789, B:114:0x079d, B:115:0x0808, B:149:0x0a70, B:107:0x073c, B:109:0x0751, B:110:0x0782, B:143:0x0a2f, B:145:0x0a35, B:146:0x0a64), top: B:274:0x0580, outer: #7, inners: #5, #6, #11, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0c2a  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0c7b  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x0cd9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x0fbb  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x10a6  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x10f7  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x114d  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x13b9  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:317:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x03c4 A[Catch: all -> 0x043c, TRY_LEAVE, TryCatch #17 {all -> 0x043c, blocks: (B:51:0x03b7, B:53:0x03c4), top: B:304:0x03b7 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04c2 A[Catch: all -> 0x032f, TryCatch #7 {all -> 0x032f, blocks: (B:213:0x0fe2, B:215:0x0fe8, B:216:0x1011, B:249:0x13df, B:251:0x13e5, B:252:0x1414, B:230:0x11a7, B:232:0x11c9, B:233:0x1216, B:180:0x0b65, B:182:0x0b6b, B:183:0x0b95, B:81:0x04bc, B:83:0x04c2, B:84:0x04ef, B:17:0x0120, B:19:0x0126, B:20:0x014f, B:22:0x029e, B:24:0x02cf, B:25:0x0329, B:88:0x0580, B:90:0x0586, B:91:0x05cc, B:97:0x05e7, B:99:0x05ed, B:100:0x0633, B:101:0x063f, B:102:0x0640, B:104:0x0649, B:105:0x0691, B:127:0x09ad, B:128:0x09b1, B:130:0x09b7, B:132:0x09cd, B:135:0x09e3, B:139:0x09f2, B:140:0x09fa, B:147:0x0a6b, B:153:0x0aee, B:155:0x0af4, B:156:0x0af5, B:158:0x0af7, B:160:0x0afe, B:161:0x0aff, B:106:0x069c, B:117:0x0814, B:119:0x081a, B:120:0x0860, B:122:0x0906, B:123:0x094e, B:125:0x0962, B:126:0x09a7, B:165:0x0b0e, B:167:0x0b14, B:168:0x0b15, B:170:0x0b17, B:172:0x0b1e, B:173:0x0b1f, B:112:0x0789, B:114:0x079d, B:115:0x0808, B:149:0x0a70, B:107:0x073c, B:109:0x0751, B:110:0x0782, B:143:0x0a2f, B:145:0x0a35, B:146:0x0a64), top: B:287:0x0120, inners: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0586 A[Catch: all -> 0x0b20, TryCatch #0 {all -> 0x0b20, blocks: (B:88:0x0580, B:90:0x0586, B:91:0x05cc, B:97:0x05e7, B:99:0x05ed, B:100:0x0633, B:101:0x063f, B:102:0x0640, B:104:0x0649, B:105:0x0691, B:127:0x09ad, B:128:0x09b1, B:130:0x09b7, B:132:0x09cd, B:135:0x09e3, B:139:0x09f2, B:140:0x09fa, B:147:0x0a6b, B:153:0x0aee, B:155:0x0af4, B:156:0x0af5, B:158:0x0af7, B:160:0x0afe, B:161:0x0aff, B:106:0x069c, B:117:0x0814, B:119:0x081a, B:120:0x0860, B:122:0x0906, B:123:0x094e, B:125:0x0962, B:126:0x09a7, B:165:0x0b0e, B:167:0x0b14, B:168:0x0b15, B:170:0x0b17, B:172:0x0b1e, B:173:0x0b1f, B:112:0x0789, B:114:0x079d, B:115:0x0808, B:149:0x0a70, B:107:0x073c, B:109:0x0751, B:110:0x0782, B:143:0x0a2f, B:145:0x0a35, B:146:0x0a64), top: B:274:0x0580, outer: #7, inners: #5, #6, #11, #12 }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x05d9  */
    /* JADX WARN: Type inference failed for: r13v21 */
    /* JADX WARN: Type inference failed for: r13v22 */
    /* JADX WARN: Type inference failed for: r13v23 */
    /* JADX WARN: Type inference failed for: r13v24, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r13v25, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r13v34 */
    /* JADX WARN: Type inference failed for: r13v36 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5946
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parsePaletteSection.attachBaseContext(android.content.Context):void");
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = RatingCompat + 25;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = RatingCompat + 69;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
    }
}
