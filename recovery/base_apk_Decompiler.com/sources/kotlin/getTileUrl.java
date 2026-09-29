package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes4.dex */
public abstract class getTileUrl extends addObserverForBackInvoker implements SubjectStat {
    private static int $10 = 0;
    private static int $11 = 1;
    private volatile isHighlighted IconCompatParcelizer;
    private final Object RemoteActionCompatParcelizer;
    private boolean read;
    private getSubjectStat write;
    private static final byte[] $$g = {85, -29, -43, -21, 67, -21, 0, -3, -5, -32, 5, 14, 7, 0, 0, 19, -15, -17, 6, 1, 5, 15, 67, -81, 7, 11, -9, 17, -24, -10, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, -17, -6, 0, -3, 17, 38, -32, -15, 13, -4, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, 67, -55, 4, -13, 34, -25, -3, 21, -9, 44, -49, 17, 2, 3, -11, 15, 3, 34, -47, 5, 19, -17, 13, -4, 3, 27, -28, 81, -27, -50, 19, -3, -4, TarConstants.LF_NORMAL, -49, 2, 4, 11, 9, -17, 3, 17, -12, TarConstants.LF_SYMLINK, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, 15, 6, -1};
    private static final int $$h = 219;
    private static final byte[] $$a = {0, -75, -45, -77, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 241;
    private static int AudioAttributesImplApi21Parcelizer = 0;
    private static int MediaBrowserCompatCustomActionResultReceiver = 1;
    private static char[] AudioAttributesCompatParcelizer = {6431, 6403, 6491, 6475, 6426, 6490, 6467, 6406, 6478, 6410, 6407, 6523, 6470, 6400, 6507, 6488, 6466, 6481, 6477, 6468, 6494, 6404, 6474, 6402, 6405, 6520, 6429, 6473, 6505, 6428, 6471, 6465, 6417, 6416, 6424, 6425, 6430, 6408, 6476, 6411, 6464, 6427, 6524, 6492, 6493, 6469, 6479, 6401, 6522};
    private static char MediaBrowserCompatItemReceiver = 11445;
    private static char[] AudioAttributesImplBaseParcelizer = {44960, 45037, 45049, 45026, 45036, 44689, 44898, 44901, 44897, 44695, 44903, 44689, 44695, 44692, 44922, 44903, 44902, 44923, 44899, 44898, 44903, 44923, 44898, 44694, 44899, 44692, 44694, 44694, 44688, 44901, 44922, 44898, 44897, 44896, 44692, 44897, 44688, 44902, 44898, 44898, 44896, 44901, 44923, 44898, 44899, 44899, 44688, 44923, 44902, 44922, 44900, 44923, 44691, 44695, 44691, 44900, 44694, 44899, 44898, 44688, 44694, 44901, 44903, 44900, 44901, 44691, 44901, 44898, 44689, 44977, 45012, 45012, 45053, 45013, 45004, 45013, 45032, 45033, 45043, 45035, 44994, 44995, 45035, 45053, 45043, 45033, 45035, 45052, 45012, 45004, 45004, 45005, 45005, 44992, 45038, 45043, 45033, 44993, 44995, 44994, 44995, 44993, 45013, 45035, 45033, 45042, 45042, 45035, 45035, 45034, 45004, 45034, 45013, 45012, 45013, 45004, 45015, 45034, 45035, 45040, 45042, 45012, 44994, 44995, 45034, 45013, 45012, 45034, 45034, 45035, 44993, 44993, 44998, 45036, 44888, 44882, 44892, 44895, 44848, 44818, 44825, 44839, 44876, 44867, 44868, 44892, 44883, 44894, 44892, 44895, 44871, 44869, 44862, 44863, 44888, 44891, 44869, 44877, 44868, 44869, 44876, 44868, 44893, 44863, 44836, 44888, 44869, 44871, 44869, 44869, 44892, 44893, 44869, 44871, 44869, 44839, 44838, 44871, 44888, 44856, 44838, 44870, 44890, 44858, 44858, 44869, 44868, 44864, 44890, 44893, 44863, 44860, 44850, 44830, 44836, 44891, 44891, 44871, 44895, 44893, 44947, 44987, 44995, 44998, 44988, 44990, 44987, 44987, 44965, 44984, 44997, 44997, 44997, 44995, 44986, 44991, 44991, 44991, 44984, 44985, 44999, 44992, 44987, 44964, 44995, 44996, 44998, 44995, 44990, 44996, 45038, 45038, 44993, 44995, 44993, 44988, 44982, 45052, 45028, 45028, 45051, 45027, 45038, 45036, 45037, 45038, 45027, 45011, 45023, 45031, 45024, 45022, 44944, 44985, 44991, 44988, 44988, 44989, 44988, 44990, 44991, 44989, 44985, 44967, 45011, 45008, 45015, 45015, 45009, 45011, 45010, 45011, 45011, 45008};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.getTileUrl.$$a
            int r6 = r6 + 4
            int r7 = 44 - r7
            int r8 = 114 - r8
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r8 = r6
            r4 = r7
            r3 = r2
            goto L26
        L11:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L15:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            r4 = r0[r8]
        L26:
            int r6 = r6 + r4
            int r6 = r6 + (-1)
            int r8 = r8 + 1
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTileUrl.c(short, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0021 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r7, short r8, short r9, java.lang.Object[] r10) {
        /*
            int r7 = 60 - r7
            byte[] r0 = kotlin.getTileUrl.$$g
            int r8 = r8 + 73
            int r9 = 133 - r9
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r8 = r9
            r4 = r2
            goto L26
        L11:
            r3 = r2
        L12:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L21
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L21:
            r3 = r0[r9]
            r6 = r9
            r9 = r8
            r8 = r6
        L26:
            int r3 = -r3
            int r9 = r9 + r3
            int r9 = r9 + 2
            int r8 = r8 + 1
            r3 = r4
            r6 = r9
            r9 = r8
            r8 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTileUrl.d(byte, short, short, java.lang.Object[]):void");
    }

    getTileUrl() {
        this.RemoteActionCompatParcelizer = new Object();
        this.read = false;
        MediaBrowserCompatCustomActionResultReceiver();
    }

    getTileUrl(byte b) {
        super(R.layout.activity_analytics_container);
        this.RemoteActionCompatParcelizer = new Object();
        this.read = false;
        MediaBrowserCompatCustomActionResultReceiver();
    }

    private void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.getTileUrl.4
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                getTileUrl.this.AudioAttributesImplApi26Parcelizer();
            }
        });
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 63;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
    }

    private void MediaBrowserCompatItemReceiver() {
        int i = 2 % 2;
        getSubjectStat getsubjectstatWrite = AudioAttributesImplApi21Parcelizer().write();
        this.write = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            int i2 = AudioAttributesImplApi21Parcelizer + 49;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            if (i2 % 2 == 0) {
                this.write.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                int i3 = 6 / 0;
            } else {
                this.write.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            }
        }
        int i4 = AudioAttributesImplApi21Parcelizer + 91;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr = AudioAttributesImplBaseParcelizer;
        char c = '0';
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i6 = 0;
            while (i6 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ('0' - AndroidCharacter.getMirror(c)), 11612 - TextUtils.lastIndexOf("", c, 0, 0), 20 - TextUtils.getOffsetAfter("", 0), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i6++;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i3];
        System.arraycopy(cArr, i2, cArr3, 0, i3);
        if (bArr != null) {
            int i7 = $11 + 97;
            $10 = i7 % 128;
            int i8 = i7 % 2;
            char[] cArr4 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c2 = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i9 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollBarSize() >> 8), 22959 - Color.argb(0, 0, 0, 0), 42 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i10 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c2)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (31589 - Color.alpha(0)), 9862 - TextUtils.indexOf((CharSequence) "", '0', 0), 65 - View.MeasureSpec.makeMeasureSpec(0, 0), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i10] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c2 = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (View.MeasureSpec.getSize(0) + 37822), 9754 - (Process.myTid() >> 22), Gravity.getAbsoluteGravity(0, 0) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i5 > 0) {
            char[] cArr5 = new char[i3];
            System.arraycopy(cArr3, 0, cArr5, 0, i3);
            int i11 = i3 - i5;
            System.arraycopy(cArr5, 0, cArr3, i11, i5);
            System.arraycopy(cArr5, i5, cArr3, 0, i11);
            int i12 = $11 + 91;
            $10 = i12 % 128;
            int i13 = i12 % 2;
        }
        if (z) {
            char[] cArr6 = new char[i3];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i3 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                int i14 = $10 + 19;
                $11 = i14 % 128;
                int i15 = i14 % 2;
            }
            cArr3 = cArr6;
        }
        if (i4 > 0) {
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    private static void a(int i, char[] cArr, byte b, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        needsStartedService needsstartedservice = new needsStartedService();
        char[] cArr2 = AudioAttributesCompatParcelizer;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i4 = 0; i4 < length; i4++) {
                int i5 = $10 + 121;
                $11 = i5 % 128;
                int i6 = i5 % 2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i4])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1527982763);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 7014, (Process.myTid() >> 22) + 30, -626716224, false, "o", new Class[]{Integer.TYPE});
                    }
                    cArr3[i4] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(MediaBrowserCompatItemReceiver)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1527982763);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-16777216) - Color.rgb(0, 0, 0)), 7015 - Color.argb(0, 0, 0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) + 31, -626716224, false, "o", new Class[]{Integer.TYPE});
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
            int i7 = $10 + 15;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            needsstartedservice.AudioAttributesCompatParcelizer = 0;
            int i9 = $11 + 53;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            while (needsstartedservice.AudioAttributesCompatParcelizer < i2) {
                needsstartedservice.write = cArr[needsstartedservice.AudioAttributesCompatParcelizer];
                needsstartedservice.RemoteActionCompatParcelizer = cArr[needsstartedservice.AudioAttributesCompatParcelizer + 1];
                if (needsstartedservice.write == needsstartedservice.RemoteActionCompatParcelizer) {
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = (char) (needsstartedservice.write - b);
                    cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = (char) (needsstartedservice.RemoteActionCompatParcelizer - b);
                } else {
                    try {
                        Object[] objArr4 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(105000849);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (Color.argb(0, 0, 0, 0) + 48194), (ViewConfiguration.getFadingEdgeLength() >> 16) + 20126, 19 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), 2014046980, false, "n", new Class[]{Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Object.class});
                        }
                        if (((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue() == needsstartedservice.AudioAttributesImplBaseParcelizer) {
                            Object[] objArr5 = {needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, needsstartedservice, Integer.valueOf(cCharValue), Integer.valueOf(cCharValue), needsstartedservice, Integer.valueOf(cCharValue), needsstartedservice};
                            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(50135433);
                            if (objRemoteActionCompatParcelizer4 == null) {
                                objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getTouchSlop() >> 8), KeyEvent.keyCodeFromString("") + 19368, ImageFormat.getBitsPerPixel(0) + 19, 2092221724, false, "k", new Class[]{Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Object.class, Integer.TYPE, Integer.TYPE, Object.class, Integer.TYPE, Object.class});
                            }
                            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue();
                            int i11 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[iIntValue];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i11];
                        } else if (needsstartedservice.IconCompatParcelizer == needsstartedservice.read) {
                            int i12 = $10 + 99;
                            $11 = i12 % 128;
                            int i13 = i12 % 2;
                            needsstartedservice.MediaBrowserCompatItemReceiver = ((needsstartedservice.MediaBrowserCompatItemReceiver + cCharValue) - 1) % cCharValue;
                            needsstartedservice.AudioAttributesImplBaseParcelizer = ((needsstartedservice.AudioAttributesImplBaseParcelizer + cCharValue) - 1) % cCharValue;
                            int i14 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            int i15 = (needsstartedservice.read * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i14];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i15];
                        } else {
                            int i16 = (needsstartedservice.IconCompatParcelizer * cCharValue) + needsstartedservice.AudioAttributesImplBaseParcelizer;
                            int i17 = (needsstartedservice.read * cCharValue) + needsstartedservice.MediaBrowserCompatItemReceiver;
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer] = cArr2[i16];
                            cArr4[needsstartedservice.AudioAttributesCompatParcelizer + 1] = cArr2[i17];
                        }
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                needsstartedservice.AudioAttributesCompatParcelizer += 2;
            }
        }
        int i18 = $11 + 59;
        $10 = i18 % 128;
        int i19 = i18 % 2;
        for (int i20 = 0; i20 < i; i20++) {
            cArr4[i20] = (char) (cArr4[i20] ^ 13722);
        }
        objArr[0] = new String(cArr4);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x016e  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r30) {
        /*
            Method dump skipped, instruction units count: 2171
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTileUrl.onCreate(android.os.Bundle):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        super.onDestroy();
        getSubjectStat getsubjectstat = this.write;
        if (getsubjectstat != null) {
            int i2 = AudioAttributesImplApi21Parcelizer + 61;
            MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
            int i3 = i2 % 2;
            getsubjectstat.AudioAttributesCompatParcelizer();
            int i4 = AudioAttributesImplApi21Parcelizer + 119;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 75;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesImplApi21Parcelizer().af_();
        if (i3 != 0) {
            int i4 = 66 / 0;
        }
        return objAf_;
    }

    private isHighlighted AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 65;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            return ishighlighted;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted AudioAttributesImplApi21Parcelizer() {
        if (this.IconCompatParcelizer == null) {
            synchronized (this.RemoteActionCompatParcelizer) {
                if (this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = AudioAttributesImplBaseParcelizer();
                }
            }
        }
        return this.IconCompatParcelizer;
    }

    protected final void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 15;
        int i3 = i2 % 128;
        MediaBrowserCompatCustomActionResultReceiver = i3;
        int i4 = i2 % 2;
        if (!this.read) {
            int i5 = i3 + 123;
            AudioAttributesImplApi21Parcelizer = i5 % 128;
            int i6 = i5 % 2;
            this.read = true;
        }
        int i7 = MediaBrowserCompatCustomActionResultReceiver + 65;
        AudioAttributesImplApi21Parcelizer = i7 % 128;
        if (i7 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer;
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 91;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        if (i2 % 2 == 0) {
            RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
            int i3 = 60 / 0;
        } else {
            RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        }
        int i4 = AudioAttributesImplApi21Parcelizer + 109;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
        return RemoteActionCompatParcelizer;
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 73;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(1) - 23, new char[]{26, '\r', '(', 3, 31, ' ', '#', '\n', 22, 20, 14, '\b', 31, 0, '-', 29, 17, '\"', '-', 15, '/', '#', 4, 19, 24, ')'}, (byte) (69 - (Process.myTid() >> 22)), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            a(18 - (KeyEvent.getMaxKeyCode() >> 16), new char[]{2, '-', 13819, 13819, 19, 11, '*', 29, 13821, 13821, 17, '!', 6, 24, '-', 29, '!', '\t'}, (byte) (19 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i4 = AudioAttributesImplApi21Parcelizer + 99;
                MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
                int i5 = i4 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
            }
        }
        if (baseContext != null) {
            int i6 = AudioAttributesImplApi21Parcelizer + 81;
            MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (KeyEvent.normalizeMetaState(0) + 4535), 6054 - (ViewConfiguration.getTapTimeout() >> 16), 42 - Color.blue(0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getTouchSlop() >> 8) + 6030, 24 - View.combineMeasuredStates(0, 0), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i8 = AudioAttributesImplApi21Parcelizer + 13;
                MediaBrowserCompatCustomActionResultReceiver = i8 % 128;
                int i9 = i8 % 2;
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

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ed  */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 430
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTileUrl.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:127:0x081c A[Catch: all -> 0x0272, TryCatch #9 {all -> 0x0272, blocks: (B:169:0x0a11, B:171:0x0a17, B:172:0x0a40, B:202:0x0e31, B:204:0x0e37, B:205:0x0e60, B:245:0x1292, B:247:0x1298, B:248:0x12c4, B:226:0x106c, B:228:0x108e, B:229:0x10dc, B:125:0x0816, B:127:0x081c, B:128:0x0845, B:17:0x00c2, B:19:0x00c8, B:20:0x00ee, B:22:0x01e4, B:24:0x0214, B:25:0x026c), top: B:285:0x00c2 }] */
    /* JADX WARN: Removed duplicated region for block: B:133:0x08d1  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x090c A[Catch: all -> 0x09c6, TryCatch #4 {all -> 0x09c6, blocks: (B:144:0x08f7, B:146:0x090c, B:147:0x0939), top: B:277:0x08f7, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:150:0x094c A[Catch: all -> 0x09bc, TryCatch #12 {all -> 0x09bc, blocks: (B:148:0x093f, B:150:0x094c, B:151:0x09b4), top: B:290:0x093f, outer: #8 }] */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0ad2  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0b1a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0b7e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0e0f  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x0ef1  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x0f38  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x0fef  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x1271  */
    /* JADX WARN: Removed duplicated region for block: B:302:? A[RETURN, SYNTHETIC] */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r34) {
        /*
            Method dump skipped, instruction units count: 5425
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.getTileUrl.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 109;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 107;
        AudioAttributesImplApi21Parcelizer = i4 % 128;
        int i5 = i4 % 2;
    }
}
