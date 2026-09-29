package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.ui.activities.base.BaseActivity;
import com.marrow.ui.activities.plan.renew.RenewActivity;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class parseCue extends BaseActivity implements SubjectStat {
    private volatile isHighlighted IconCompatParcelizer;
    private final Object RemoteActionCompatParcelizer = new Object();
    private boolean read = false;
    private getSubjectStat write;
    private static final byte[] $$c = {70, -23, 8, 77};
    private static final int $$f = 118;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$g = {16, 77, -78, 14, 70, -71, 5, 27, -7, 10, 14, -6, 20, -14, -3, 3, 0, 20, 41, -29, -12, 16, -1, 6, TarConstants.LF_NORMAL, -39, 7, 2, 20, -14, 41, -12, -12, 20, 3, -2, 8, -12, 26, -8, 70, -18, -46, 14, 36, -23, 16, -19, 25, -8, 46, -31, 2, 9, 46, -39, 7, 2, 6, 6, 14, -4, -1, 45, -24, -5, 4, 20, -4, 14, -8, TarConstants.LF_SYMLINK, -46, 9, 20, -8, 9, 18, -6, 30, -33, 16, -1, 17, 8, -10, 16, 11, 28, -16, -7, 16, 3, 8, TarConstants.LF_BLK, -21, -7, 6, TarConstants.LF_NORMAL, -39, 7, 2, 20, -14, 41, -12, -12, 20, 3, -2, 8, -12, 26, -8};
    private static final int $$h = 59;
    private static final byte[] $$a = {18, -127, -77, -105, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 50;
    private static int MediaMetadataCompat = 0;
    private static int MediaDescriptionCompat = 1;
    private static long AudioAttributesCompatParcelizer = -3498762522182953692L;
    private static int MediaBrowserCompatCustomActionResultReceiver = -136981212;
    private static char MediaBrowserCompatSearchResultReceiver = 52638;
    private static char[] RatingCompat = {44986, 45037, 45027, 45025, 45050, 45030, 45036, 44995, 45005, 45026, 45050, 44997, 44989, 45016, 45025, 45028, 45029, 45029, 45028, 45052, 45036, 45012, 45031, 45025, 45033, 45032, 44987, 45030, 45049, 45048, 45025, 45027, 45051, 45008, 45010, 45050, 45028, 45024, 45036, 45032, 45024, 45028, 45030, 45028, 44944, 44998, 45038, 45039, 44997, 44978, 44988, 44989, 44988, 44993, 44999, 44998, 45032, 45032, 45033, 44999, 44990, 44993, 44992, 44987, 44987, 44984, 44992, 44992, 44999, 44997, 44978, 44997, 45039, 44998, 44987, 44995, 45038, 44992, 44984, 44998, 45039, 45039, 44997, 44988, 44990, 44991, 44993, 45035, 45032, 45033, 45038, 44993, 45006, 44840, 44854, 44840, 44806, 44847, 44847, 44805, 44804, 44805, 44844, 44854, 44840, 44803, 44841, 44844, 44846, 44854, 44854, 44844, 44826, 44826, 44805, 44805, 44844, 44840, 44800, 44803, 44807, 44827, 44807, 44800, 44803, 44801, 44846, 44841, 44847, 44847, 44801, 44800, 44807, 44826, 44847, 44854, 44855, 44852, 44846, 44841, 44841, 44807, 44826, 44801, 44803, 44804, 44805, 44807, 44805, 44834, 44852, 44855, 44847, 44844, 44847, 44804, 45050, 44908, 44902, 44896, 44899, 44868, 44838, 44845, 44875, 44880, 44887, 44904, 44896, 44903, 44898, 44896, 44899, 44907, 44905, 44866, 44867, 44908, 44911, 44905, 44881, 44904, 44905, 44880, 44904, 44897, 44867, 44872, 44908, 44905, 44907, 44905, 44905, 44896, 44897, 44905, 44907, 44905, 44875, 44874, 44907, 44908, 44876, 44874, 44906, 44910, 44878, 44878, 44905, 44904, 44884, 44910, 44897, 44867, 44864, 44870, 44834, 44872, 44911, 44911, 44907, 44899, 44897, 44976, 45052, 45034, 45022, 45024, 45031, 45023, 45011, 45027, 45038, 45037, 45036, 45038, 45027, 45051, 45028, 45006, 44804, 44826, 44824, 44829, 44825, 44807, 45050, 45055, 44818, 45053, 45037, 44807, 44823, 44816, 44825, 44826, 45045, 45044, 44830, 44826, 44804, 45012, 44874, 44878, 44872, 44875, 44873, 44878, 44873, 44873, 44872, 44874};

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$i(byte r6, int r7, byte r8) {
        /*
            byte[] r0 = kotlin.parseCue.$$c
            int r7 = r7 + 4
            int r6 = r6 * 3
            int r1 = 1 - r6
            int r8 = r8 * 3
            int r8 = r8 + 103
            byte[] r1 = new byte[r1]
            r2 = 0
            int r6 = 0 - r6
            if (r0 != 0) goto L17
            r3 = r6
            r8 = r7
            r4 = r2
            goto L2e
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r8
            int r7 = r7 + 1
            r1[r3] = r4
            if (r3 != r6) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2e:
            int r7 = r7 + r3
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseCue.$$i(byte, int, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 65
            int r7 = r7 + 4
            int r0 = 44 - r8
            byte[] r1 = kotlin.parseCue.$$a
            byte[] r0 = new byte[r0]
            int r8 = 43 - r8
            r2 = -1
            if (r1 != 0) goto L12
            r3 = r7
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            int r3 = r3 + 1
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r0, r7)
            r9[r7] = r6
            return
        L23:
            r4 = r1[r7]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r7 = r7 + r6
            int r6 = r7 + (-1)
            int r7 = r3 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseCue.c(int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = 119 - r7
            int r0 = r6 + 5
            int r8 = 95 - r8
            byte[] r1 = kotlin.parseCue.$$g
            byte[] r0 = new byte[r0]
            int r6 = r6 + 4
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L29
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L20:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L29:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + 5
            int r8 = r3 + 1
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseCue.d(byte, byte, byte, java.lang.Object[]):void");
    }

    public parseCue() {
        MediaDescriptionCompat();
    }

    private void MediaDescriptionCompat() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.parseCue.3
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                parseCue.this.AudioAttributesImplBaseParcelizer();
            }
        });
        int i2 = MediaMetadataCompat + 69;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private void MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        getSubjectStat getsubjectstatWrite = onCommand().write();
        this.write = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            int i2 = MediaMetadataCompat + 27;
            MediaDescriptionCompat = i2 % 128;
            if (i2 % 2 == 0) {
                this.write.IconCompatParcelizer(getDefaultViewModelCreationExtras());
                throw null;
            }
            this.write.IconCompatParcelizer(getDefaultViewModelCreationExtras());
        }
        int i3 = MediaMetadataCompat + 41;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void a(int i, char[] cArr, char[] cArr2, char c, char[] cArr3, Object[] objArr) throws Throwable {
        int i2 = 2;
        int i3 = 2 % 2;
        notifyDownloadRemoved notifydownloadremoved = new notifyDownloadRemoved();
        int length = cArr3.length;
        char[] cArr4 = new char[length];
        int length2 = cArr.length;
        char[] cArr5 = new char[length2];
        int i4 = 0;
        System.arraycopy(cArr3, 0, cArr4, 0, length);
        System.arraycopy(cArr, 0, cArr5, 0, length2);
        cArr4[0] = (char) (cArr4[0] ^ c);
        cArr5[2] = (char) (cArr5[2] + ((char) i));
        int length3 = cArr2.length;
        char[] cArr6 = new char[length3];
        notifydownloadremoved.AudioAttributesCompatParcelizer = 0;
        int i5 = $11 + 125;
        $10 = i5 % 128;
        int i6 = i5 % 2;
        while (notifydownloadremoved.AudioAttributesCompatParcelizer < length3) {
            int i7 = $10 + 7;
            $11 = i7 % 128;
            int i8 = i7 % i2;
            try {
                Object[] objArr2 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(718099963);
                if (objRemoteActionCompatParcelizer == null) {
                    int iLastIndexOf = 22747 - TextUtils.lastIndexOf("", '0', i4, i4);
                    int i9 = (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 35;
                    Class[] clsArr = new Class[1];
                    clsArr[i4] = Object.class;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (AndroidCharacter.getMirror('0') - '0'), iLastIndexOf, i9, 1417974126, false, "j", clsArr);
                }
                int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
                Object[] objArr3 = {notifydownloadremoved};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(247211480);
                if (objRemoteActionCompatParcelizer2 == null) {
                    char cIndexOf = (char) (TextUtils.indexOf((CharSequence) "", '0', i4, i4) + 31370);
                    int capsMode = TextUtils.getCapsMode("", i4, i4) + 2721;
                    int packedPositionChild = 37 - ExpandableListView.getPackedPositionChild(0L);
                    byte b = (byte) i4;
                    byte b2 = (byte) (b - 1);
                    String str$$i = $$i(b, b2, (byte) (b2 + 1));
                    Class[] clsArr2 = new Class[1];
                    clsArr2[i4] = Object.class;
                    objRemoteActionCompatParcelizer2 = startForeground.read(cIndexOf, capsMode, packedPositionChild, 1895162189, false, str$$i, clsArr2);
                }
                int iIntValue2 = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
                int i10 = cArr4[notifydownloadremoved.AudioAttributesCompatParcelizer % 4] * 32718;
                Object[] objArr4 = new Object[3];
                objArr4[2] = Integer.valueOf(cArr5[iIntValue]);
                objArr4[1] = Integer.valueOf(i10);
                objArr4[i4] = notifydownloadremoved;
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1336303982);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cArgb = (char) Color.argb(i4, i4, i4, i4);
                    int scrollBarFadeDuration = (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 15713;
                    int iNormalizeMetaState = 64 - KeyEvent.normalizeMetaState(i4);
                    Class[] clsArr3 = new Class[3];
                    clsArr3[i4] = Object.class;
                    clsArr3[1] = Integer.TYPE;
                    clsArr3[2] = Integer.TYPE;
                    objRemoteActionCompatParcelizer3 = startForeground.read(cArgb, scrollBarFadeDuration, iNormalizeMetaState, -837789177, false, "f", clsArr3);
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                int i11 = cArr4[iIntValue2] * 32718;
                Object[] objArr5 = new Object[2];
                objArr5[1] = Integer.valueOf(cArr5[iIntValue]);
                objArr5[i4] = Integer.valueOf(i11);
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1602228082);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char scrollBarFadeDuration2 = (char) (40976 - (ViewConfiguration.getScrollBarFadeDuration() >> 16));
                    int packedPositionGroup = 6122 - ExpandableListView.getPackedPositionGroup(0L);
                    int pressedStateDuration = 29 - (ViewConfiguration.getPressedStateDuration() >> 16);
                    Class[] clsArr4 = new Class[2];
                    clsArr4[i4] = Integer.TYPE;
                    clsArr4[1] = Integer.TYPE;
                    objRemoteActionCompatParcelizer4 = startForeground.read(scrollBarFadeDuration2, packedPositionGroup, pressedStateDuration, -566873061, false, "m", clsArr4);
                }
                cArr5[iIntValue2] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                cArr4[iIntValue2] = notifydownloadremoved.write;
                cArr6[notifydownloadremoved.AudioAttributesCompatParcelizer] = (char) ((((long) ((int) (((long) MediaBrowserCompatCustomActionResultReceiver) ^ (-3498762522182953692L)))) ^ (((long) (cArr2[notifydownloadremoved.AudioAttributesCompatParcelizer] ^ cArr4[iIntValue2])) ^ (AudioAttributesCompatParcelizer ^ (-3498762522182953692L)))) ^ ((long) ((char) (((long) MediaBrowserCompatSearchResultReceiver) ^ (-3498762522182953692L)))));
                notifydownloadremoved.AudioAttributesCompatParcelizer++;
                i2 = 2;
                i4 = 0;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        objArr[0] = new String(cArr6);
    }

    private static void b(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = RatingCompat;
        if (cArr != null) {
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i7 = $11 + 55;
            $10 = i7 % 128;
            if (i7 % 2 != 0) {
                int i8 = 2 % 5;
            }
            int i9 = 0;
            while (i9 < length) {
                int i10 = $10 + 81;
                $11 = i10 % 128;
                if (i10 % i == 0) {
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 1), 11613 - (ViewConfiguration.getTouchSlop() >> 8), 20 - View.resolveSizeAndState(0, 0, 0), -1786471333, false, "u", new Class[]{Integer.TYPE});
                        }
                        cArr2[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                } else {
                    Object[] objArr3 = {Integer.valueOf(cArr[i9])};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 11613, 20 - TextUtils.getOffsetBefore("", 0), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                    i9++;
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
                    int i11 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 22959 - TextUtils.getOffsetBefore("", 0), 43 - View.MeasureSpec.makeMeasureSpec(0, 0), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i11] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                } else {
                    int i12 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr5 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (31589 - View.combineMeasuredStates(0, 0)), 9863 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), 65 - (ViewConfiguration.getTapTimeout() >> 16), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                try {
                    Object[] objArr6 = {buildsetstopreasonintent, buildsetstopreasonintent};
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1104966666);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        objRemoteActionCompatParcelizer5 = startForeground.read((char) (37822 - (ViewConfiguration.getTouchSlop() >> 8)), 9754 - (ViewConfiguration.getDoubleTapTimeout() >> 16), (Process.myPid() >> 22) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            int i13 = $11 + 125;
            $10 = i13 % 128;
            int i14 = i13 % 2;
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i15 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i15, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i15);
        }
        if (!(!z)) {
            char[] cArr6 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                int i16 = $11 + 39;
                $10 = i16 % 128;
                int i17 = i16 % 2;
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i4 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            int i18 = $11 + 59;
            $10 = i18 % 128;
            int i19 = i18 % 2;
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr3);
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onCreate(Bundle bundle) throws Throwable {
        Method method;
        Object[] objArr;
        int i = 2 % 2;
        Object[] objArr2 = new Object[1];
        a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4, new char[]{0, 0, 0, 0}, new char[]{45705, 24118, 19909, 1747, 40018, 30956, 51706, 4829, 59920, 51523, 43641, 61384, 38914, 30952, 34688, 27379, 18250, 59582}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 33359), new char[]{35599, 6714, 29373, 45698}, objArr2);
        Class<?> cls = Class.forName((String) objArr2[0]);
        Object[] objArr3 = new Object[1];
        a(1592982799 - TextUtils.getOffsetBefore("", 0), new char[]{0, 0, 0, 0}, new char[]{18783, 64769, 51490, 44448, 64446}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(6) + 1071), new char[]{3992, 62205, 41310, 50180}, objArr3);
        int iIntValue = ((Integer) cls.getDeclaredMethod((String) objArr3[0], new Class[0]).invoke(null, new Object[0])).intValue() % 100000;
        if (iIntValue < 99000 || iIntValue > 99999) {
            Context baseContext = getBaseContext();
            if (baseContext == null) {
                int i2 = MediaMetadataCompat + 87;
                MediaDescriptionCompat = i2 % 128;
                if (i2 % 2 == 0) {
                    Object[] objArr4 = new Object[1];
                    b(false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, new int[]{0, 26, 0, 0}, objArr4);
                    Class<?> cls2 = Class.forName((String) objArr4[0]);
                    Object[] objArr5 = new Object[1];
                    b(true, new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, new int[]{26, 18, 0, 0}, objArr5);
                    method = cls2.getMethod((String) objArr5[0], new Class[0]);
                } else {
                    Object[] objArr6 = new Object[1];
                    b(false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, new int[]{0, 26, 0, 0}, objArr6);
                    Class<?> cls3 = Class.forName((String) objArr6[0]);
                    Object[] objArr7 = new Object[1];
                    b(false, new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, new int[]{26, 18, 0, 0}, objArr7);
                    method = cls3.getMethod((String) objArr7[0], new Class[0]);
                }
                baseContext = (Context) method.invoke(null, null);
            }
            if (baseContext != null) {
                baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
            }
            if (baseContext != null) {
                try {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 4534), (ViewConfiguration.getScrollBarSize() >> 8) + 6054, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr8 = new Object[1];
                    b(true, new byte[]{1, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 0, 1, 1, 1, 1, 0}, new int[]{44, 48, 0, 2}, objArr8);
                    String str = (String) objArr8[0];
                    Object[] objArr9 = new Object[1];
                    b(false, new byte[]{1, 1, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0}, new int[]{92, 64, 89, 0}, objArr9);
                    String str2 = (String) objArr9[0];
                    Object[] objArr10 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, new char[]{0, 0, 0, 0}, new char[]{41390, 31219, 56039, 26126, 23580, 54623, 45953, 34106, 60106, 6215, 65311, 40693, 43429, 43661, 58890, 43696, 57315, 2713, 49272, 26970, 51653, 39163, 40852, 27410, 31634, 53399, 64799, 33556, 26410, 23803, 54951, 23573, 34835, 31444, 18019, 59561, 46239, 62917, 43389, 63680, 34780, 62904, 14357, 4589, 35380, 57599, 15476, 16308, 25073, 15080, 17617, 35928, 28348, 59549, 49451, 51939, 17959, 16095, 51701, 1675, 38430, 46729, 44389, 53183}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 4), new char[]{17576, 46801, 15060, 30265}, objArr10);
                    String str3 = (String) objArr10[0];
                    Object[] objArr11 = new Object[1];
                    b(false, new byte[]{0, 0, 0, 0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1, 0, 0, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0, 0, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1}, new int[]{156, 67, 120, 0}, objArr11);
                    String str4 = (String) objArr11[0];
                    Object[] objArr12 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 4, new char[]{0, 0, 0, 0}, new char[]{17636, 9950, 63413, 49393, 506, 62461}, (char) (KeyEvent.normalizeMetaState(0) + 10569), new char[]{29830, 27938, 18864, 45353}, objArr12);
                    String str5 = (String) objArr12[0];
                    Object[] objArr13 = new Object[1];
                    a((-1) - TextUtils.indexOf((CharSequence) "", '0', 0, 0), new char[]{0, 0, 0, 0}, new char[]{2632, 44670, 65006, 32437, 12259, 44982, 36836, 8933, 56560, 19226, 6135, 51467, 60394, 60334, 15640, 6398, 63593, 11369, 31733, 3437, 57039, 8266, 50260, 31891, 2488, 46400, 56743, 2531, 3623, 49618, 24649, 6249, 34831, 41915, 53712, 20995}, (char) ((-16777216) - Color.rgb(0, 0, 0)), new char[]{22410, 3262, 12280, 23439}, objArr13);
                    Object[] objArr14 = {baseContext, str, str2, str3, str4, true, str5, (String) objArr13[0], 86400};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(448819875);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0', 0)), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 6030, 23 - TextUtils.indexOf((CharSequence) "", '0'), 1686746678, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class, String.class, String.class, String.class, String.class, Boolean.TYPE, String.class, String.class, Integer.TYPE});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr14);
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
            char touchSlop = (char) (13183 - (ViewConfiguration.getTouchSlop() >> 8));
            int keyRepeatTimeout = (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 1649;
            int capsMode = 26 - TextUtils.getCapsMode("", 0, 0);
            byte[] bArr = $$a;
            byte b = (byte) (-bArr[113]);
            short s = bArr[5];
            Object[] objArr15 = new Object[1];
            c(b, s, (byte) s, objArr15);
            objRemoteActionCompatParcelizer3 = startForeground.read(touchSlop, keyRepeatTimeout, capsMode, -133433128, false, (String) objArr15[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer3).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer4 == null) {
                char cAxisFromString = (char) (MotionEvent.axisFromString("") + 13184);
                int iIndexOf = TextUtils.indexOf("", "", 0) + 1649;
                int i3 = 27 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1));
                byte[] bArr2 = $$a;
                Object[] objArr16 = new Object[1];
                c(bArr2[5], (short) (-bArr2[27]), (byte) (-bArr2[30]), objArr16);
                objRemoteActionCompatParcelizer4 = startForeground.read(cAxisFromString, iIndexOf, i3, -1033747278, false, (String) objArr16[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer4).get(null);
        } else {
            Object[] objArr17 = new Object[1];
            a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 35, new char[]{0, 0, 0, 0}, new char[]{61752, 32077, 12738, 5989, 32228, 40031, 16300, 28567, 65433, 2446, 43638, 17186, 62518, 29018, 56489, 7527}, (char) (57108 - Color.red(0)), new char[]{51766, 38088, 5138, 21727}, objArr17);
            Class<?> cls4 = Class.forName((String) objArr17[0]);
            Object[] objArr18 = new Object[1];
            b(false, new byte[]{0, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 0, 1}, new int[]{223, 16, 0, 10}, objArr18);
            try {
                Object[] objArr19 = {Integer.valueOf(((Integer) cls4.getMethod((String) objArr18[0], Object.class).invoke(null, this)).intValue()), 0, 571148006};
                byte[] bArr3 = $$g;
                byte b2 = (byte) (-bArr3[22]);
                byte b3 = bArr3[36];
                Object[] objArr20 = new Object[1];
                d(b2, b3, (byte) (b3 | TarConstants.LF_GNUTYPE_SPARSE), objArr20);
                Class<?> cls5 = Class.forName((String) objArr20[0]);
                byte b4 = bArr3[16];
                byte b5 = b4;
                Object[] objArr21 = new Object[1];
                d(b4, b5, (byte) (b5 | 86), objArr21);
                objArr = (Object[]) cls5.getMethod((String) objArr21[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr19);
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer5 == null) {
                    char c = (char) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 13182);
                    int iArgb = 1649 - Color.argb(0, 0, 0, 0);
                    int i4 = 26 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1));
                    byte[] bArr4 = $$a;
                    Object[] objArr22 = new Object[1];
                    c(bArr4[5], (short) (-bArr4[27]), (byte) (-bArr4[30]), objArr22);
                    objRemoteActionCompatParcelizer5 = startForeground.read(c, iArgb, i4, -1033747278, false, (String) objArr22[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer5).set(null, objArr);
                try {
                    Object[] objArr23 = new Object[1];
                    b(false, new byte[]{0, 1, 0, 0, 1, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, new int[]{239, 22, 39, 0}, objArr23);
                    Class<?> cls6 = Class.forName((String) objArr23[0]);
                    Object[] objArr24 = new Object[1];
                    a(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 553737146, new char[]{0, 0, 0, 0}, new char[]{20756, 25219, 48106, 8980, 21909, 3681, 45383, 17608, 41214, 50099, 9166, 8936, 55780, 63082, 14330}, (char) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 3302), new char[]{56635, 347, 59937, 31500}, objArr24);
                    long jLongValue = ((Long) cls6.getDeclaredMethod((String) objArr24[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer6 == null) {
                        char maximumFlingVelocity = (char) (13183 - (ViewConfiguration.getMaximumFlingVelocity() >> 16));
                        int iIndexOf2 = 1649 - TextUtils.indexOf("", "");
                        int capsMode2 = 26 - TextUtils.getCapsMode("", 0, 0);
                        byte[] bArr5 = $$a;
                        byte b6 = bArr5[5];
                        Object[] objArr25 = new Object[1];
                        c(b6, (short) (b6 | TarConstants.LF_GNUTYPE_LONGNAME), (byte) (-bArr5[30]), objArr25);
                        objRemoteActionCompatParcelizer6 = startForeground.read(maximumFlingVelocity, iIndexOf2, capsMode2, 54351865, false, (String) objArr25[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer7 == null) {
                        char c2 = (char) (13183 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)));
                        int iRed = Color.red(0) + 1649;
                        int iKeyCodeFromString = KeyEvent.keyCodeFromString("") + 26;
                        byte[] bArr6 = $$a;
                        byte b7 = (byte) (-bArr6[113]);
                        short s2 = bArr6[5];
                        Object[] objArr26 = new Object[1];
                        c(b7, s2, (byte) s2, objArr26);
                        objRemoteActionCompatParcelizer7 = startForeground.read(c2, iRed, iKeyCodeFromString, -133433128, false, (String) objArr26[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer7).set(null, lValueOf2);
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
        int i5 = ((int[]) objArr[3])[0];
        int i6 = ((int[]) objArr[2])[0];
        if (i6 != i5) {
            long j = -1;
            long j2 = ((long) (i6 ^ i5)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32)) | j2;
            Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-1407079962);
            if (objRemoteActionCompatParcelizer8 == null) {
                objRemoteActionCompatParcelizer8 = startForeground.read((char) (View.resolveSize(0, 0) + 4535), (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 6053, (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
            }
            Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer8).invoke(null, null);
            ArrayList arrayList = new ArrayList();
            String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
            int i7 = MediaMetadataCompat + 109;
            MediaDescriptionCompat = i7 % 128;
            int i8 = i7 % 2;
            try {
                Object[] objArr27 = {805247723, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                Class cls7 = (Class) startForeground.IconCompatParcelizer((char) View.resolveSize(0, 0), Process.getGidForName("") + 6031, (ViewConfiguration.getWindowTouchSlop() >> 8) + 24);
                byte[] bArr7 = $$g;
                Object[] objArr28 = new Object[1];
                d((byte) (-bArr7[45]), (byte) (bArr7[44] + 1), (byte) 82, objArr28);
                cls7.getMethod((String) objArr28[0], Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE).invoke(objInvoke2, objArr27);
                int i9 = MediaMetadataCompat + 113;
                MediaDescriptionCompat = i9 % 128;
                int i10 = i9 % 2;
            } catch (Throwable th3) {
                Throwable cause3 = th3.getCause();
                if (cause3 == null) {
                    throw th3;
                }
                throw cause3;
            }
        }
        super.onCreate(bundle);
        MediaBrowserCompatMediaItem();
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 87;
        MediaMetadataCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.onDestroy();
            getSubjectStat getsubjectstat = this.write;
            if (getsubjectstat != null) {
                int i3 = MediaMetadataCompat + 81;
                MediaDescriptionCompat = i3 % 128;
                int i4 = i3 % 2;
                getsubjectstat.AudioAttributesCompatParcelizer();
                if (i4 == 0) {
                    throw null;
                }
            }
            int i5 = MediaMetadataCompat + 125;
            MediaDescriptionCompat = i5 % 128;
            int i6 = i5 % 2;
            return;
        }
        super.onDestroy();
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.getModifiedScore
    public final Object af_() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 17;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        isHighlighted ishighlightedOnCommand = onCommand();
        if (i3 != 0) {
            return ishighlightedOnCommand.af_();
        }
        ishighlightedOnCommand.af_();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted onCustomAction() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaDescriptionCompat + 59;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 == 0) {
            return ishighlighted;
        }
        throw null;
    }

    private isHighlighted onCommand() {
        if (this.IconCompatParcelizer == null) {
            synchronized (this.RemoteActionCompatParcelizer) {
                if (this.IconCompatParcelizer == null) {
                    this.IconCompatParcelizer = onCustomAction();
                }
            }
        }
        return this.IconCompatParcelizer;
    }

    protected final void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        if (!this.read) {
            int i2 = MediaMetadataCompat + 103;
            MediaDescriptionCompat = i2 % 128;
            int i3 = i2 % 2;
            this.read = true;
            ((parsePositionAttribute) af_()).IconCompatParcelizer((RenewActivity) getSubmittedOnDate.AudioAttributesCompatParcelizer(this));
        }
        int i4 = MediaDescriptionCompat + 23;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 0 / 0;
        }
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 1;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer RemoteActionCompatParcelizer = getNextPercentile.RemoteActionCompatParcelizer(this, super.getDefaultViewModelProviderFactory());
        int i4 = MediaDescriptionCompat + 77;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return RemoteActionCompatParcelizer;
        }
        throw null;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onResume() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            b(false, new byte[]{1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1}, new int[]{0, 26, 0, 0}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(false, new byte[]{1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1}, new int[]{26, 18, 0, 0}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                int i2 = MediaDescriptionCompat + 95;
                MediaMetadataCompat = i2 % 128;
                int i3 = i2 % 2;
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i4 = MediaDescriptionCompat + 15;
                MediaMetadataCompat = i4 % 128;
                int i5 = i4 % 2;
            }
        }
        if (baseContext != null) {
            int i6 = MediaMetadataCompat + 77;
            MediaDescriptionCompat = i6 % 128;
            int i7 = i6 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 6053 - TextUtils.lastIndexOf("", '0', 0), 43 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(823471051);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.lastIndexOf("", '0', 0)), TextUtils.lastIndexOf("", '0') + 6031, 24 - (ViewConfiguration.getPressedStateDuration() >> 16), 1331490654, false, "RemoteActionCompatParcelizer", new Class[]{Context.class});
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

    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 287
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseCue.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:128:0x086e A[Catch: all -> 0x02ec, TryCatch #7 {all -> 0x02ec, blocks: (B:126:0x0868, B:128:0x086e, B:129:0x089b, B:171:0x0adc, B:173:0x0ae2, B:174:0x0b10, B:204:0x0f56, B:206:0x0f5c, B:207:0x0f89, B:240:0x13a9, B:242:0x13af, B:243:0x13dc, B:221:0x1148, B:223:0x116a, B:224:0x11bb, B:19:0x00ff, B:21:0x0105, B:22:0x012c, B:24:0x0258, B:26:0x0289, B:27:0x02e6, B:135:0x0930, B:138:0x093b, B:142:0x0947, B:157:0x0a20, B:159:0x0a26, B:160:0x0a27, B:162:0x0a29, B:164:0x0a30, B:165:0x0a31, B:146:0x0950, B:148:0x0965, B:149:0x0995, B:150:0x099b, B:152:0x09a8, B:153:0x0a16), top: B:278:0x00ff, inners: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0926  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0965 A[Catch: all -> 0x0a28, TryCatch #3 {all -> 0x0a28, blocks: (B:146:0x0950, B:148:0x0965, B:149:0x0995), top: B:271:0x0950, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x09a8 A[Catch: all -> 0x0a1e, TryCatch #15 {all -> 0x0a1e, blocks: (B:150:0x099b, B:152:0x09a8, B:153:0x0a16), top: B:292:0x099b, outer: #6 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0ba6  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0bf6  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0c54  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x0f32  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x101c  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x106f  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x10c1  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x1389  */
    /* JADX WARN: Removed duplicated region for block: B:302:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00de  */
    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r40) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5934
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.parseCue.attachBaseContext(android.content.Context):void");
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 75;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = MediaDescriptionCompat + 1;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
    }
}
