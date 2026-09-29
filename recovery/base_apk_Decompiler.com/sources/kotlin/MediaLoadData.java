package kotlin;

import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.TrainingApplication;
import dagger.hilt.android.internal.modules.ApplicationContextModule;
import java.lang.reflect.Method;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class MediaLoadData extends containsAny implements SubjectStat {
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$m = {28, -38, TarConstants.LF_DIR, -29, -23, -12, -6, -9, 11, 32, -38, -21, 7, -10, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17, 61, -61, -2, -19, 44, -53, -1, 13, -23, 7, -10, -3, 29, -32, -7, -4, -1, -14, -30, -16, -3, 39, -48, -2, -7, 11, -23, 32, -21, -21, 11, -6, -11, -1, -21, 17, -17};
    private static final int $$n = 213;
    private static final byte[] $$d = {62, -25, -124, -119, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 144;
    private static int IconCompatParcelizer = 0;
    private static int AudioAttributesImplApi21Parcelizer = 1;
    private static int[] read = {-1612769450, 1166364701, 1103887487, -67055572, -2146315399, 704759554, 490593755, 860830196, 1083753409, -897563309, 1935526128, -295119020, -348285375, -1142129966, -267296281, 927973250, -607167743, 1656027528};
    private static char[] RemoteActionCompatParcelizer = {45029, 44907, 44880, 44904, 44900, 45047, 44914, 44924, 44927, 44924, 44914, 44678, 44676, 44698, 44719, 44719, 44676, 44676, 44679, 44921, 44679, 44678, 44673, 44678, 44921, 44672, 44679, 44676, 44717, 44719, 44673, 44927, 44924, 44679, 44678, 44673, 44679, 44679, 44676, 44914, 44914, 44915, 44677, 44673, 44673, 44718, 44678, 44921, 44678, 44677, 44698, 44716, 44676, 44927, 44924, 44676, 44718, 44716, 44698, 44676, 44713, 44673, 44921, 44921, 44926, 44926, 44925, 44699, 44716, 44990, 45028, 45054, 45048, 45051, 45020, 44990, 44965, 44995, 45032, 45039, 45024, 45048, 45055, 45050, 45048, 45051, 45027, 45025, 45018, 45019, 45028, 45031, 45025, 45033, 45024, 45025, 45032, 45024, 45049, 45019, 44992, 45028, 45025, 45027, 45025, 45025, 45048, 45049, 45025, 45027, 45025, 44995, 44994, 45027, 45028, 44996, 44994, 45026, 45030, 44998, 44998, 45025, 45024, 45036, 45030, 45049, 45019, 45016, 45022, 44986, 44992, 45031, 45031, 45027, 45051, 45049, 44950, 44985, 44965, 44984, 44987, 44986, 44944, 44985, 44990, 44989, 44989, 44991, 44985, 44984, 44985, 44985, 44990, 44988, 45031, 45027, 45037, 45036, 45037, 45027, 45025, 45050, 45030, 45036, 44995, 44996, 45051, 45018, 45002, 45036, 45052, 45049, 45030, 45027, 45010, 44991, 45039, 45025, 45025, 45005, 44999, 45036, 45037, 45024, 44992, 45002, 45036, 45052, 45049, 45030, 45027, 44983, 45040, 45045, 44813, 44814, 44814, 44806, 45052, 45024, 44810, 44809, 45025, 45029, 45045, 45040, 45047};
    private boolean write = false;
    private final setScore AudioAttributesCompatParcelizer = new setScore(new GtaModelCreator() { // from class: o.MediaLoadData.3
        @Override // kotlin.GtaModelCreator
        public final Object write() {
            return cloneWithUpdatedTimeline.read().RemoteActionCompatParcelizer(new ApplicationContextModule(MediaLoadData.this)).read();
        }
    });

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 65
            int r8 = r8 + 4
            byte[] r0 = kotlin.MediaLoadData.$$d
            int r1 = r7 + 4
            byte[] r1 = new byte[r1]
            int r7 = r7 + 3
            r2 = -1
            if (r0 != 0) goto L13
            r6 = r7
            r3 = r8
            r4 = r2
            goto L2a
        L13:
            r3 = r2
        L14:
            int r3 = r3 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            r9[r7] = r6
            return
        L24:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r6 = r6 + r8
            int r6 = r6 + r2
            int r8 = r3 + 1
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MediaLoadData.g(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r0 = r8 + 19
            byte[] r1 = kotlin.MediaLoadData.$$m
            int r7 = r7 * 9
            int r7 = 49 - r7
            int r6 = 111 - r6
            byte[] r0 = new byte[r0]
            int r8 = r8 + 18
            r2 = 0
            if (r1 != 0) goto L15
            r3 = r7
            r7 = r8
            r4 = r2
            goto L2c
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L23:
            int r3 = r3 + 1
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2c:
            int r6 = -r6
            int r7 = r7 + r6
            int r6 = r7 + (-4)
            int r7 = r3 + 1
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MediaLoadData.h(short, int, byte, java.lang.Object[]):void");
    }

    private setScore AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 43;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        setScore setscore = this.AudioAttributesCompatParcelizer;
        if (i3 != 0) {
            int i4 = 38 / 0;
        }
        return setscore;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = IconCompatParcelizer + 17;
        AudioAttributesImplApi21Parcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = AudioAttributesCompatParcelizer().af_();
        int i4 = AudioAttributesImplApi21Parcelizer + 115;
        IconCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return objAf_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.containsAny, android.app.Application
    public void onCreate() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplApi21Parcelizer + 71;
        IconCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        read();
        super.onCreate();
        int i4 = AudioAttributesImplApi21Parcelizer + 47;
        IconCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    private void read() {
        int i = 2 % 2;
        if (this.write) {
            return;
        }
        int i2 = AudioAttributesImplApi21Parcelizer + 89;
        IconCompatParcelizer = i2 % 128;
        this.write = i2 % 2 == 0;
        ((MediaSourceEventListenerEventDispatcherExternalSyntheticLambda0) af_()).RemoteActionCompatParcelizer((TrainingApplication) getSubmittedOnDate.AudioAttributesCompatParcelizer(this));
        int i3 = IconCompatParcelizer + 31;
        AudioAttributesImplApi21Parcelizer = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void e(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int length;
        int[] iArr2;
        int i3;
        int i4 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr3 = read;
        int i5 = 43695;
        int i6 = -470782045;
        int i7 = 1;
        int i8 = 0;
        if (iArr3 != null) {
            int i9 = $10 + 103;
            $11 = i9 % 128;
            int i10 = i9 % 2;
            int length2 = iArr3.length;
            int[] iArr4 = new int[length2];
            int i11 = 0;
            while (i11 < length2) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr3[i11])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(i6);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (KeyEvent.getDeadChar(0, 0) + i5), Color.red(0) + 23297, TextUtils.indexOf("", "", 0) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr4[i11] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i11++;
                    i5 = 43695;
                    i6 = -470782045;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr3 = iArr4;
        }
        int length3 = iArr3.length;
        int[] iArr5 = new int[length3];
        int[] iArr6 = read;
        long j = 0;
        if (iArr6 != null) {
            int i12 = $10 + 7;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 1;
            } else {
                length = iArr6.length;
                iArr2 = new int[length];
                i3 = 0;
            }
            while (i3 < length) {
                try {
                    Object[] objArr3 = new Object[i7];
                    objArr3[i8] = Integer.valueOf(iArr6[i3]);
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (43695 - TextUtils.getOffsetAfter("", i8)), 23296 - (ExpandableListView.getPackedPositionForChild(i8, i8) > j ? 1 : (ExpandableListView.getPackedPositionForChild(i8, i8) == j ? 0 : -1)), (ViewConfiguration.getScrollBarSize() >> 8) + 15, -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr2[i3] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    i3++;
                    j = 0;
                    i7 = 1;
                    i8 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            i2 = i8;
            iArr6 = iArr2;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr6, i2, iArr5, i2, length3);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i2;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            cArr[i2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr5);
            int i13 = $10 + 37;
            $11 = i13 % 128;
            int i14 = i13 % 2;
            for (int i15 = 0; i15 < 16; i15++) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[i15];
                Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 43694), ExpandableListView.getPackedPositionGroup(0L) + 23297, (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 14, -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                buildremovealldownloadsintent.read = iIntValue;
            }
            int i16 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
            buildremovealldownloadsintent.read = i16;
            buildremovealldownloadsintent.read ^= iArr5[16];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr5[17];
            int i17 = buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            int i18 = buildremovealldownloadsintent.read;
            cArr[0] = (char) (buildremovealldownloadsintent.AudioAttributesCompatParcelizer >>> 16);
            cArr[1] = (char) buildremovealldownloadsintent.AudioAttributesCompatParcelizer;
            cArr[2] = (char) (buildremovealldownloadsintent.read >>> 16);
            cArr[3] = (char) buildremovealldownloadsintent.read;
            buildRemoveAllDownloadsIntent.read(iArr5);
            cArr2[buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2] = cArr[0];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 1] = cArr[1];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 2] = cArr[2];
            cArr2[(buildremovealldownloadsintent.RemoteActionCompatParcelizer * 2) + 3] = cArr[3];
            Object[] objArr5 = {buildremovealldownloadsintent, buildremovealldownloadsintent};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(516305436);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (48194 - (ViewConfiguration.getPressedStateDuration() >> 16)), 20127 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 20, 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            i2 = 0;
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void f(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i;
        int i2 = 2;
        int i3 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i4 = iArr[0];
        int i5 = iArr[1];
        int i6 = iArr[2];
        int i7 = iArr[3];
        char[] cArr = RemoteActionCompatParcelizer;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i8 = 0;
            while (i8 < length) {
                int i9 = $10 + 57;
                $11 = i9 % 128;
                int i10 = i9 % i2;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i8])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 11613, 20 - TextUtils.getOffsetAfter("", 0), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i8] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i8++;
                    i2 = 2;
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
        char[] cArr3 = new char[i5];
        System.arraycopy(cArr, i4, cArr3, 0, i5);
        if (bArr != null) {
            char[] cArr4 = new char[i5];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                int i11 = $10 + 27;
                $11 = i11 % 128;
                int i12 = i11 % 2;
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i13 = $10 + 101;
                    $11 = i13 % 128;
                    if (i13 % 2 == 0) {
                        int i14 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                        Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 22960 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), 42 - Process.getGidForName(""), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i14] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                        throw null;
                    }
                    int i15 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) ExpandableListView.getPackedPositionType(0L), (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 22959, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 42, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i15] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                } else {
                    int i16 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr5 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (View.resolveSizeAndState(0, 0, 0) + 31589), TextUtils.indexOf((CharSequence) "", '0') + 9864, 65 - KeyEvent.normalizeMetaState(0), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i16] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr6 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) ((PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 37822), 9754 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getTouchSlop() >> 8) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i7 > 0) {
            int i17 = $10 + 33;
            $11 = i17 % 128;
            if (i17 % 2 == 0) {
                char[] cArr5 = new char[i5];
                System.arraycopy(cArr3, 1, cArr5, 0, i5);
                int i18 = i5 << i7;
                System.arraycopy(cArr5, 0, cArr3, i18, i7);
                System.arraycopy(cArr5, i7, cArr3, 1, i18);
            } else {
                char[] cArr6 = new char[i5];
                System.arraycopy(cArr3, 0, cArr6, 0, i5);
                int i19 = i5 - i7;
                System.arraycopy(cArr6, 0, cArr3, i19, i7);
                System.arraycopy(cArr6, i7, cArr3, 0, i19);
            }
        }
        if (z) {
            char[] cArr7 = new char[i5];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                int i20 = $10 + 57;
                $11 = i20 % 128;
                if (i20 % 2 == 0) {
                    cArr7[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer * i5];
                    i = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                } else {
                    cArr7[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i5 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                    i = buildsetstopreasonintent.RemoteActionCompatParcelizer + 1;
                }
                buildsetstopreasonintent.RemoteActionCompatParcelizer = i;
                int i21 = $10 + 33;
                $11 = i21 % 128;
                if (i21 % 2 == 0) {
                    int i22 = 3 / 2;
                }
            }
            cArr3 = cArr7;
        }
        if (i6 > 0) {
            int i23 = $11 + 3;
            $10 = i23 % 128;
            int i24 = i23 % 2;
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            int i25 = $11 + 37;
            $10 = i25 % 128;
            int i26 = i25 % 2;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i5) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x078a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x07c8 A[Catch: all -> 0x087a, TryCatch #13 {all -> 0x087a, blocks: (B:107:0x07c2, B:109:0x07c8, B:110:0x07f2), top: B:259:0x07c2, outer: #12 }] */
    @Override // kotlin.containsAny, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r41) {
        /*
            Method dump skipped, instruction units count: 4810
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MediaLoadData.attachBaseContext(android.content.Context):void");
    }
}
