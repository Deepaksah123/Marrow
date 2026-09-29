package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import kotlin.getExtendedEsFrChar;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class handleChildInline<P extends getExtendedEsFrChar> extends convertMessageToByteArray<P> implements SubjectStat {
    private static int $10 = 0;
    private static int $11 = 1;
    private getSubjectStat IconCompatParcelizer;
    private volatile isHighlighted read;
    private static final byte[] $$B = {77, 21, 89, -51, 74, -14, 7, 4, 2, -25, 12, 21, 14, 7, 7, 26, -8, -10, 13, 8, 12, 22, 74, -74, 14, 18, -2, 24, -17, -3, 10, TarConstants.LF_BLK, -35, 11, 6, 24, -10, 45, -8, -8, 24, 7, 2, 12, -8, 30, -4, -10, 1, 7, 4, 24, 45, -25, -8, 20, 3, 10, TarConstants.LF_BLK, -35, 11, 6, 24, -10, 45, -8, -8, 24, 7, 2, 12, -8, 30, -4, 74, -67, 9, 31, -3, 14, 18, -2, 24};
    private static final int $$C = 160;
    private static final byte[] $$g = {114, -20, -35, -46, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$h = 94;
    private static int MediaDescriptionCompat = 0;
    private static int MediaMetadataCompat = 1;
    private static int[] RemoteActionCompatParcelizer = {2057217369, -763153328, -1549851194, 1033702818, -1865174076, 1207550533, 1560729636, -505377909, -782417652, -1663558185, 171416553, 391355652, -1796859288, -775094209, 706690715, 1478879237, 196712872, -616552007};
    private static char[] MediaBrowserCompatCustomActionResultReceiver = {45008, 44830, 45046, 44829, 44858, 44857, 44862, 44862, 44857, 44849, 44833, 44841, 44856, 44858, 44834, 44845, 44845, 44838, 44836, 44858, 44863, 44859, 44833, 44804, 44806, 44839, 44987, 45030, 45049, 45048, 45025, 45027, 45051, 45008, 45010, 45050, 45028, 45024, 45036, 45032, 45024, 45028, 45030, 45028, 45001, 44814, 44809, 44815, 44822, 44856, 44859, 44819, 45045, 44818, 44859, 44858, 44837, 44836, 44818, 44808, 44811, 44809, 44822, 44856, 44856, 44819, 45045, 44829, 44859, 44828, 45044, 44819, 44856, 44822, 44815, 44822, 44816, 44829, 44829, 45045, 45044, 45044, 44829, 44818, 44811, 44816, 44858, 44837, 44837, 44819, 44816, 44818, 44976, 45049, 45009, 45014, 45009, 45006, 45000, 45010, 45048, 45010, 45000, 45009, 45009, 45007, 45006, 45007, 45014, 45048, 45010, 44981, 45011, 45014, 45008, 45048, 45048, 45014, 45004, 45004, 45007, 45007, 45014, 45010, 45002, 44981, 45001, 45005, 45001, 45002, 44981, 45003, 45008, 45011, 45009, 45009, 45003, 45002, 45001, 45004, 45009, 45048, 45049, 45054, 45008, 45011, 45011, 45001, 45004, 45003, 44981, 45006, 45007, 45001, 45007, 45012, 44947, 44987, 44995, 44998, 44988, 44990, 44987, 44987, 44965, 44984, 44997, 44997, 44997, 44995, 44986, 44991, 44991, 44991, 44984, 44985, 44999, 44992, 44987, 44964, 44995, 44996, 44998, 44995, 44990, 44996, 45038, 45038, 44993, 44995, 44993, 44988, 45030, 44895, 44894, 44894, 44889, 44894, 44892, 44882, 44882, 44895, 44894};
    private final Object write = new Object();
    private boolean AudioAttributesCompatParcelizer = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(short r6, short r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.handleChildInline.$$g
            int r6 = r6 + 4
            int r7 = r7 + 65
            int r1 = 44 - r8
            byte[] r1 = new byte[r1]
            int r8 = 43 - r8
            r2 = -1
            if (r0 != 0) goto L13
            r7 = r6
            r4 = r8
            r3 = r2
            goto L2b
        L13:
            r3 = r2
        L14:
            int r6 = r6 + 1
            int r3 = r3 + 1
            byte r4 = (byte) r7
            r1[r3] = r4
            if (r3 != r8) goto L26
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r1, r7)
            r9[r7] = r6
            return
        L26:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r5
        L2b:
            int r6 = r6 + r4
            int r6 = r6 + r2
            r5 = r7
            r7 = r6
            r6 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.handleChildInline.k(short, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void l(short r7, short r8, byte r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = kotlin.handleChildInline.$$B
            int r8 = 79 - r8
            int r9 = 119 - r9
            int r7 = 28 - r7
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r9
            r4 = r2
            r9 = r8
            goto L26
        L11:
            r3 = r2
            r6 = r9
            r9 = r8
            r8 = r6
        L15:
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r7) goto L24
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L24:
            r3 = r0[r9]
        L26:
            int r3 = -r3
            int r8 = r8 + r3
            int r8 = r8 + 9
            int r9 = r9 + 1
            r3 = r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.handleChildInline.l(short, short, byte, java.lang.Object[]):void");
    }

    handleChildInline() {
        onPlayFromMediaId();
    }

    private void onPlayFromMediaId() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.handleChildInline.3
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                handleChildInline.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            }
        });
        int i2 = MediaDescriptionCompat + 57;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
    }

    private void onPrepareFromSearch() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 5;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 != 0) {
            getSubjectStat getsubjectstatWrite = onPlayFromSearch().write();
            this.IconCompatParcelizer = getsubjectstatWrite;
            if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
                int i3 = MediaDescriptionCompat + 91;
                MediaMetadataCompat = i3 % 128;
                int i4 = i3 % 2;
                this.IconCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                int i5 = MediaMetadataCompat + 77;
                MediaDescriptionCompat = i5 % 128;
                int i6 = i5 % 2;
                return;
            }
            return;
        }
        getSubjectStat getsubjectstatWrite2 = onPlayFromSearch().write();
        this.IconCompatParcelizer = getsubjectstatWrite2;
        getsubjectstatWrite2.RemoteActionCompatParcelizer();
        throw null;
    }

    private static void i(int i, int[] iArr, Object[] objArr) throws Throwable {
        int i2;
        int i3 = 2 % 2;
        buildRemoveAllDownloadsIntent buildremovealldownloadsintent = new buildRemoveAllDownloadsIntent();
        char[] cArr = new char[4];
        char[] cArr2 = new char[iArr.length * 2];
        int[] iArr2 = RemoteActionCompatParcelizer;
        int i4 = -470782045;
        char c = '0';
        int i5 = 0;
        if (iArr2 != null) {
            int i6 = $10 + 5;
            int i7 = i6 % 128;
            $11 = i7;
            int i8 = i6 % 2;
            int length = iArr2.length;
            int[] iArr3 = new int[length];
            int i9 = i7 + 1;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            int i11 = 0;
            while (i11 < length) {
                try {
                    Object[] objArr2 = {Integer.valueOf(iArr2[i11])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(i4);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ImageFormat.getBitsPerPixel(0) + 43696), TextUtils.lastIndexOf("", c, 0) + 23298, 15 - Color.alpha(0), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr3[i11] = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                    i11++;
                    i4 = -470782045;
                    c = '0';
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            iArr2 = iArr3;
        }
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        int[] iArr5 = RemoteActionCompatParcelizer;
        int i12 = 43695;
        if (iArr5 != null) {
            int length3 = iArr5.length;
            int[] iArr6 = new int[length3];
            int i13 = 0;
            while (i13 < length3) {
                try {
                    Object[] objArr3 = new Object[1];
                    objArr3[i5] = Integer.valueOf(iArr5[i13]);
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-470782045);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (i12 - TextUtils.indexOf("", "", i5, i5)), (ViewConfiguration.getScrollBarSize() >> 8) + 23297, 15 - View.getDefaultSize(i5, i5), -1648776394, false, "A", new Class[]{Integer.TYPE});
                    }
                    iArr6[i13] = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                    i13++;
                    i12 = 43695;
                    i5 = 0;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            i2 = i5;
            iArr5 = iArr6;
        } else {
            i2 = 0;
        }
        System.arraycopy(iArr5, i2, iArr4, i2, length2);
        buildremovealldownloadsintent.RemoteActionCompatParcelizer = i2;
        while (buildremovealldownloadsintent.RemoteActionCompatParcelizer < iArr.length) {
            int i14 = $11 + 63;
            $10 = i14 % 128;
            int i15 = i14 % 2;
            cArr[0] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer] >> 16);
            cArr[1] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer];
            cArr[2] = (char) (iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1] >> 16);
            cArr[3] = (char) iArr[buildremovealldownloadsintent.RemoteActionCompatParcelizer + 1];
            buildremovealldownloadsintent.AudioAttributesCompatParcelizer = (cArr[0] << 16) + cArr[1];
            buildremovealldownloadsintent.read = (cArr[2] << 16) + cArr[3];
            buildRemoveAllDownloadsIntent.read(iArr4);
            int i16 = 0;
            for (int i17 = 16; i16 < i17; i17 = 16) {
                buildremovealldownloadsintent.AudioAttributesCompatParcelizer ^= iArr4[i16];
                try {
                    Object[] objArr4 = {buildremovealldownloadsintent, Integer.valueOf(buildRemoveAllDownloadsIntent.read(buildremovealldownloadsintent.AudioAttributesCompatParcelizer)), buildremovealldownloadsintent, buildremovealldownloadsintent};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1112267823);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (Gravity.getAbsoluteGravity(0, 0) + 43695), AndroidCharacter.getMirror('0') + 23249, TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 16, -1006770364, false, "C", new Class[]{Object.class, Integer.TYPE, Object.class, Object.class});
                    }
                    int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).intValue();
                    buildremovealldownloadsintent.AudioAttributesCompatParcelizer = buildremovealldownloadsintent.read;
                    buildremovealldownloadsintent.read = iIntValue;
                    i16++;
                    int i18 = $11 + 17;
                    $10 = i18 % 128;
                    int i19 = i18 % 2;
                } catch (Throwable th3) {
                    Throwable cause3 = th3.getCause();
                    if (cause3 == null) {
                        throw th3;
                    }
                    throw cause3;
                }
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
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (48194 - ExpandableListView.getPackedPositionGroup(0L)), 20126 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 20, 1620047497, false, "I", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr2, 0, i);
    }

    private static void j(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = MediaBrowserCompatCustomActionResultReceiver;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = 0;
            while (i7 < length) {
                int i8 = $11 + 37;
                $10 = i8 % 128;
                if (i8 % i != 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i7])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getScrollBarSize() >> 8), 11613 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), Drawable.resolveOpacity(0, 0) + 20, -1786471333, false, "u", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    try {
                        Object[] objArr3 = {Integer.valueOf(cArr[i7])};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-338863922);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - Process.getGidForName("")), Color.red(0) + 11613, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 20, -1786471333, false, "u", new Class[]{Integer.TYPE});
                        }
                        cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                        i7++;
                    } catch (Throwable th2) {
                        Throwable cause2 = th2.getCause();
                        if (cause2 == null) {
                            throw th2;
                        }
                        throw cause2;
                    }
                }
                i = 2;
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i9 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) KeyEvent.keyCodeFromString(""), (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 22959, Process.getGidForName("") + 44, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                } else {
                    int i10 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    try {
                        Object[] objArr5 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1859710730);
                        if (objRemoteActionCompatParcelizer4 == null) {
                            objRemoteActionCompatParcelizer4 = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 31588), 9863 - Color.alpha(0), 65 - (ViewConfiguration.getMinimumFlingVelocity() >> 16), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr4[i10] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                    } catch (Throwable th3) {
                        Throwable cause3 = th3.getCause();
                        if (cause3 == null) {
                            throw th3;
                        }
                        throw cause3;
                    }
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr6 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (37822 - View.resolveSize(0, 0)), ((byte) KeyEvent.getModifierMetaStateMask()) + 9755, 27 - View.combineMeasuredStates(0, 0), 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i11 = $10 + 83;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                char[] cArr5 = new char[i4];
                System.arraycopy(cArr3, 1, cArr5, 0, i4);
                System.arraycopy(cArr5, 1, cArr3, i4 >> i6, i6);
                System.arraycopy(cArr5, i6, cArr3, 1, i4 + i6);
            } else {
                char[] cArr6 = new char[i4];
                System.arraycopy(cArr3, 0, cArr6, 0, i4);
                int i12 = i4 - i6;
                System.arraycopy(cArr6, 0, cArr3, i12, i6);
                System.arraycopy(cArr6, i6, cArr3, 0, i12);
            }
        }
        if (z) {
            int i13 = $11 + 37;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr7 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                int i15 = $10 + 45;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                cArr7[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i4 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr3 = cArr7;
        }
        if (i5 > 0) {
            int i17 = $10 + 41;
            $11 = i17 % 128;
            int i18 = i17 % 2;
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                int i19 = $11 + 103;
                $10 = i19 % 128;
                int i20 = i19 % 2;
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                int i21 = $10 + 105;
                $11 = i21 % 128;
                int i22 = i21 % 2;
            }
        }
        objArr[0] = new String(cArr3);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00c5  */
    @Override // kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2202
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.handleChildInline.onCreate(android.os.Bundle):void");
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 5;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            getSubjectStat getsubjectstat = this.IconCompatParcelizer;
            if (getsubjectstat != null) {
                int i3 = MediaDescriptionCompat + 25;
                MediaMetadataCompat = i3 % 128;
                int i4 = i3 % 2;
                getsubjectstat.AudioAttributesCompatParcelizer();
                int i5 = MediaDescriptionCompat + 95;
                MediaMetadataCompat = i5 % 128;
                int i6 = i5 % 2;
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
        int i2 = MediaMetadataCompat + 21;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedOnPlayFromSearch = onPlayFromSearch();
        if (i3 != 0) {
            ishighlightedOnPlayFromSearch.af_();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object objAf_ = ishighlightedOnPlayFromSearch.af_();
        int i4 = MediaMetadataCompat + 75;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return objAf_;
    }

    private isHighlighted onPrepareFromMediaId() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaMetadataCompat + 13;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            return ishighlighted;
        }
        throw null;
    }

    private isHighlighted onPlayFromSearch() {
        if (this.read == null) {
            synchronized (this.write) {
                if (this.read == null) {
                    this.read = onPrepareFromMediaId();
                }
            }
        }
        return this.read;
    }

    protected void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 7;
        int i3 = i2 % 128;
        MediaDescriptionCompat = i3;
        int i4 = i2 % 2;
        if (!this.AudioAttributesCompatParcelizer) {
            int i5 = i3 + 31;
            MediaMetadataCompat = i5 % 128;
            int i6 = i5 % 2;
            this.AudioAttributesCompatParcelizer = true;
            ((parseRequiredString) af_()).read((parseRequiredLong) getSubmittedOnDate.AudioAttributesCompatParcelizer(this));
        }
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 111;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        if (i3 == 0) {
            return getNextPercentile.RemoteActionCompatParcelizer(this, defaultViewModelProviderFactory);
        }
        getNextPercentile.RemoteActionCompatParcelizer(this, defaultViewModelProviderFactory);
        throw null;
    }

    @Override // kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            j(false, new byte[]{1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 1}, new int[]{0, 26, 69, 16}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            j(false, new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, new int[]{26, 18, 0, 0}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i2 = MediaDescriptionCompat + 37;
            MediaMetadataCompat = i2 % 128;
            int i3 = i2 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) + 4535), TextUtils.lastIndexOf("", '0', 0, 0) + 6055, KeyEvent.normalizeMetaState(0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0')), 6030 - ExpandableListView.getPackedPositionGroup(0L), 24 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i4 = MediaMetadataCompat + 113;
                MediaDescriptionCompat = i4 % 128;
                int i5 = i4 % 2;
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

    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.handleChildInline.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:175:0x09df A[Catch: all -> 0x0283, TryCatch #0 {all -> 0x0283, blocks: (B:206:0x0ddc, B:208:0x0de2, B:209:0x0e0e, B:242:0x11d4, B:244:0x11da, B:245:0x1200, B:223:0x0fb6, B:225:0x0fd8, B:226:0x102b, B:173:0x09d9, B:175:0x09df, B:176:0x0a08, B:67:0x03c3, B:69:0x03c9, B:70:0x03f0, B:18:0x00cb, B:20:0x00d1, B:21:0x00f7, B:23:0x01f4, B:25:0x0225, B:26:0x027d, B:32:0x028e, B:34:0x0292, B:38:0x029e, B:53:0x036c, B:55:0x0372, B:56:0x0373, B:58:0x0375, B:60:0x037c, B:61:0x037d), top: B:267:0x00cb, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0a96  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0aea  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0b49  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x0dbb  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x0e9d  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0eeb  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0f4f  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x11b3  */
    /* JADX WARN: Removed duplicated region for block: B:306:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00ad  */
    @Override // kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5322
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.handleChildInline.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.convertMessageToByteArray, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 7;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaMetadataCompat + 117;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }
}
