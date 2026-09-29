package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.ui.activities.base.BaseActivity;
import java.lang.reflect.Method;
import kotlin.VisibilityChecker;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public abstract class CeaDecoder extends BaseActivity implements SubjectStat {
    private static int $10 = 0;
    private static int $11 = 1;
    private getSubjectStat AudioAttributesCompatParcelizer;
    private volatile isHighlighted read;
    private static final byte[] $$j = {38, -16, -7, 121, -70, 71, -5, -18, 2, 21, 7, -6, -48, 39, -7, -2, -20, 14, -41, 12, 12, -20, -3, 2, -8, 12, -26, 8, 14, 3, -3, 0, -20, -41, 29, 12, -16, 1, -6, -48, 39, -7, -2, -20, 14, -41, 12, 12, -20, -3, 2, -8, 12, -26, 8, -70, 18, 46, -14, -36, 23, -16, 19, -25, 8, -46, 31, -2, -9, -46, 39, -7, -2, -6, -6, -14, 4, 1, -45, 24, 5, -4, -20, 4, -14, 8, -50, 46, -9, -20, 8, -9, -18, 6, -30, 33, -16, 1, -17, -8, 10, -16, -11, -28, 16, 7, -16, -3, -8, -52};
    private static final int $$k = 117;
    private static final byte[] $$d = {109, -78, -126, 25, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 173;
    private static int MediaMetadataCompat = 0;
    private static int MediaBrowserCompatMediaItem = 1;
    private static int RemoteActionCompatParcelizer = 1000326208;
    private static char[] MediaBrowserCompatCustomActionResultReceiver = {45009, 44823, 44823, 44804, 45009, 44827, 44828, 44822, 44821, 44827, 44817, 44804, 44827, 44804, 44824, 44821, 44831, 44811, 44844, 44843, 44828, 44841, 44828, 44843, 44826, 45028, 44976, 45051, 45027, 45025, 45048, 45049, 45030, 45026, 45028, 45030, 45028, 45024, 45032, 45036, 45024, 45028, 45050, 45010, 44800, 44919, 44910, 44904, 44910, 44905, 44884, 44906, 44911, 44904, 44914, 44914, 44915, 44697, 44696, 44699, 44912, 44911, 44904, 44885, 44906, 44912, 44912, 44914, 44915, 44906, 44884, 44885, 44904, 44908, 44904, 44884, 44885, 44925, 44913, 44910, 44910, 44911, 44911, 44913, 44699, 44699, 44915, 44913, 44914, 44884, 44925, 44699, 44913, 44910, 44905, 44910, 44912, 44912, 44907, 44925, 44699, 44925, 44907, 44905, 44912, 44913, 44912, 44696, 44950, 44989, 44988, 44988, 44998, 44993, 44993, 44995, 44992, 44993, 44990, 44985, 44995, 45033, 45039, 44998, 44993, 44994, 44987, 44992, 44995, 44992, 44993, 44987, 44993, 44998, 44998, 45033, 45033, 44996, 44998, 44992, 44988, 44990, 44985, 44990, 44988, 44996, 45038, 44997, 44991, 44984, 44984, 44987, 44987, 44995, 45035, 44998, 44996, 45038, 45032, 44998, 44990, 44985, 44998, 45038, 44996, 44999, 44992, 44987, 44992, 45032, 44995, 44995, 44979, 45049, 45051, 45027, 45031, 45031, 44992, 44986, 45022, 45016, 45019, 45049, 45030, 45036, 45024, 45025, 44998, 44998, 45030, 45026, 44994, 44996, 45028, 45027, 44994, 44995, 45025, 45027, 45025, 45049, 45048, 45025, 45025, 45027, 45025, 45028, 44992, 45019, 45049, 45024, 45032, 45025, 45024, 45033, 45025, 45031, 45028, 45019, 45018, 45025, 45027, 45051, 45048, 45050, 45055, 45048, 45024, 45039, 45032, 44995, 44965, 44990, 45020, 45051, 45048, 45054, 45028, 44960, 44997, 44993, 44996, 44999, 44998, 45051, 44906, 44887, 44892, 44889, 44895, 44869, 44895, 44895, 44859, 44861, 44890, 44891, 44894, 44862, 44832, 45009, 44849, 44855, 44874, 44872, 44850, 44863, 44839, 44839, 44860, 44852, 44873, 44848, 44850, 44848, 45002, 44808, 44815, 44809, 44808, 44808, 44811, 44808, 44814, 44812, 44812, 44994, 44824, 44825, 44824, 44826, 44827, 44825, 44805, 44804, 44805, 44827};
    private final Object IconCompatParcelizer = new Object();
    private boolean write = false;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(byte r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r6 = 114 - r6
            int r8 = r8 + 4
            byte[] r0 = kotlin.CeaDecoder.$$d
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r8
            r4 = r2
            goto L28
        L10:
            r3 = r2
        L11:
            int r8 = r8 + 1
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r7) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L22:
            r4 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L28:
            int r8 = -r8
            int r6 = r6 + r8
            int r6 = r6 + (-1)
            r8 = r3
            r3 = r4
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.CeaDecoder.g(byte, short, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(byte r5, byte r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = 55 - r7
            int r6 = r6 + 73
            int r5 = r5 * 2
            int r5 = r5 + 6
            byte[] r0 = kotlin.CeaDecoder.$$j
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L12
            r4 = r5
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L22:
            r4 = r0[r7]
        L24:
            int r7 = r7 + 1
            int r6 = r6 + r4
            int r6 = r6 + 5
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.CeaDecoder.h(byte, byte, byte, java.lang.Object[]):void");
    }

    CeaDecoder() {
        AudioAttributesImplBaseParcelizer();
    }

    private void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        addOnContextAvailableListener(new PlaybackStateCompatCustomAction() { // from class: o.CeaDecoder.3
            @Override // kotlin.PlaybackStateCompatCustomAction
            public final void write(Context context) {
                CeaDecoder.this.MediaBrowserCompatMediaItem();
            }
        });
        int i2 = MediaMetadataCompat + 19;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
    }

    private void MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 97;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        getSubjectStat getsubjectstatWrite = onCommand().write();
        this.AudioAttributesCompatParcelizer = getsubjectstatWrite;
        if (getsubjectstatWrite.RemoteActionCompatParcelizer()) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(getDefaultViewModelCreationExtras());
            int i4 = MediaMetadataCompat + 13;
            MediaBrowserCompatMediaItem = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private static void e(boolean z, int i, char[] cArr, int i2, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i3];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i3) {
            int i5 = $11 + 77;
            $10 = i5 % 128;
            int i6 = i5 % 2;
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i2 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i7 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(RemoteActionCompatParcelizer)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) - 1), KeyEvent.keyCodeFromString("") + 23704, 31 - ExpandableListView.getPackedPositionChild(0L), -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (44863 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), View.MeasureSpec.makeMeasureSpec(0, 0) + 18944, 28 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        if (i > 0) {
            cleardownloadmanagerhelpers.write = i;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i3 - cleardownloadmanagerhelpers.write);
        }
        if (!(!z)) {
            char[] cArr4 = new char[i3];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i3) {
                int i8 = $10 + 119;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i3 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                try {
                    Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (44862 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 18944, (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                    int i10 = $10 + 109;
                    $11 = i10 % 128;
                    int i11 = i10 % 2;
                } catch (Throwable th2) {
                    Throwable cause2 = th2.getCause();
                    if (cause2 == null) {
                        throw th2;
                    }
                    throw cause2;
                }
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    private static void f(boolean z, byte[] bArr, int[] iArr, Object[] objArr) throws Throwable {
        char[] cArr;
        char[] cArr2;
        char c;
        int i = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i2 = iArr[0];
        int i3 = iArr[1];
        int i4 = iArr[2];
        int i5 = iArr[3];
        char[] cArr3 = MediaBrowserCompatCustomActionResultReceiver;
        if (cArr3 != null) {
            int length = cArr3.length;
            char[] cArr4 = new char[length];
            for (int i6 = 0; i6 < length; i6++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr3[i6])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) TextUtils.getOffsetBefore("", 0), 11612 - ((byte) KeyEvent.getModifierMetaStateMask()), 20 - Gravity.getAbsoluteGravity(0, 0), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr4[i6] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr3 = cArr4;
        }
        char[] cArr5 = new char[i3];
        System.arraycopy(cArr3, i2, cArr5, 0, i3);
        if (bArr != null) {
            int i7 = $10 + 71;
            $11 = i7 % 128;
            if (i7 % 2 == 0) {
                cArr2 = new char[i3];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 1;
                c = 1;
            } else {
                cArr2 = new char[i3];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
                c = 0;
            }
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i8 = $11 + 31;
                    $10 = i8 % 128;
                    if (i8 % 2 != 0) {
                        int i9 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                        Object[] objArr3 = {Integer.valueOf(cArr5[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getScrollDefaultDelay() >> 16), 22959 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getFadingEdgeLength() >> 16) + 43, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        Object obj = null;
                        cArr2[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                        obj.hashCode();
                        throw null;
                    }
                    int i10 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr5[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) TextUtils.getCapsMode("", 0, 0), TextUtils.lastIndexOf("", '0', 0) + 22960, 43 - TextUtils.indexOf("", "", 0), -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i10] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                } else {
                    int i11 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr5 = {Integer.valueOf(cArr5[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (View.resolveSize(0, 0) + 31589), 9863 - (Process.myPid() >> 22), 64 - ExpandableListView.getPackedPositionChild(0L), 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr2[i11] = ((Character) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).charValue();
                }
                c = cArr2[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr6 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (37822 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (ViewConfiguration.getScrollDefaultDelay() >> 16) + 9754, 27 - (ViewConfiguration.getLongPressTimeout() >> 16), 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6);
            }
            cArr5 = cArr2;
        }
        if (i5 > 0) {
            int i12 = $10 + 27;
            $11 = i12 % 128;
            if (i12 % 2 == 0) {
                char[] cArr6 = new char[i3];
                System.arraycopy(cArr5, 1, cArr6, 0, i3);
                System.arraycopy(cArr6, 0, cArr5, i3 << i5, i5);
                System.arraycopy(cArr6, i5, cArr5, 1, i3 - i5);
            } else {
                char[] cArr7 = new char[i3];
                System.arraycopy(cArr5, 0, cArr7, 0, i3);
                int i13 = i3 - i5;
                System.arraycopy(cArr7, 0, cArr5, i13, i5);
                System.arraycopy(cArr7, i5, cArr5, 0, i13);
            }
        }
        if (z) {
            int i14 = $10 + 57;
            $11 = i14 % 128;
            if (i14 % 2 == 0) {
                cArr = new char[i3];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 1;
            } else {
                cArr = new char[i3];
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            }
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr5[(i3 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr5 = cArr;
        }
        if (i4 > 0) {
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i3) {
                cArr5[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr5[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
        }
        objArr[0] = new String(cArr5);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0102  */
    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r36) {
        /*
            Method dump skipped, instruction units count: 2210
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.CeaDecoder.onCreate(android.os.Bundle):void");
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 117;
        MediaBrowserCompatMediaItem = i2 % 128;
        if (i2 % 2 != 0) {
            super.onDestroy();
            getSubjectStat getsubjectstat = this.AudioAttributesCompatParcelizer;
            if (getsubjectstat != null) {
                getsubjectstat.AudioAttributesCompatParcelizer();
            }
            int i3 = MediaBrowserCompatMediaItem + 43;
            MediaMetadataCompat = i3 % 128;
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
        int i2 = MediaMetadataCompat + 89;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        Object objAf_ = onCommand().af_();
        int i4 = MediaMetadataCompat + 25;
        MediaBrowserCompatMediaItem = i4 % 128;
        if (i4 % 2 != 0) {
            return objAf_;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private isHighlighted MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i = 2 % 2;
        isHighlighted ishighlighted = new isHighlighted(this);
        int i2 = MediaMetadataCompat + 1;
        MediaBrowserCompatMediaItem = i2 % 128;
        int i3 = i2 % 2;
        return ishighlighted;
    }

    private isHighlighted onCommand() {
        if (this.read == null) {
            synchronized (this.IconCompatParcelizer) {
                if (this.read == null) {
                    this.read = MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
                }
            }
        }
        return this.read;
    }

    protected final void MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 125;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        if (!this.write) {
            this.write = true;
            ((setWindowAttributes) af_()).write((buildSpannableString) getSubmittedOnDate.AudioAttributesCompatParcelizer(this));
            int i4 = MediaBrowserCompatMediaItem + 59;
            MediaMetadataCompat = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = MediaMetadataCompat + 69;
        MediaBrowserCompatMediaItem = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, kotlin.anyExplicitsWithoutIgnoral
    public VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 13;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory = super.getDefaultViewModelProviderFactory();
        if (i3 == 0) {
            return getNextPercentile.RemoteActionCompatParcelizer(this, defaultViewModelProviderFactory);
        }
        getNextPercentile.RemoteActionCompatParcelizer(this, defaultViewModelProviderFactory);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00a7  */
    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 321
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.CeaDecoder.onResume():void");
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            f(true, null, new int[]{0, 26, 45, 12}, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            f(true, new byte[]{0, 0, 1, 1, 0, 1, 0, 1, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1}, new int[]{26, 18, 0, 7}, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i2 = MediaMetadataCompat + 11;
            MediaBrowserCompatMediaItem = i2 % 128;
            int i3 = i2 % 2;
        }
        if (baseContext != null) {
            baseContext = ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) ? null : baseContext.getApplicationContext();
        }
        if (baseContext != null) {
            int i4 = MediaBrowserCompatMediaItem + 85;
            MediaMetadataCompat = i4 % 128;
            try {
                if (i4 % 2 != 0) {
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.indexOf("", "") + 4535), 6054 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), Color.argb(0, 0, 0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                    }
                    Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                    Object[] objArr3 = {baseContext};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), 6030 - Gravity.getAbsoluteGravity(0, 0), TextUtils.getOffsetAfter("", 0) + 24, -861814097, false, "read", new Class[]{Context.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                    throw null;
                }
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (TextUtils.lastIndexOf("", '0', 0, 0) + 4536), 6053 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), TextUtils.indexOf("", "", 0, 0) + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke2 = ((Method) objRemoteActionCompatParcelizer3).invoke(null, null);
                Object[] objArr4 = {baseContext};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (Process.getGidForName("") + 1), MotionEvent.axisFromString("") + 6031, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 23, -861814097, false, "read", new Class[]{Context.class});
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
        int i5 = MediaMetadataCompat + 121;
        MediaBrowserCompatMediaItem = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0136  */
    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r37) {
        /*
            Method dump skipped, instruction units count: 5744
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.CeaDecoder.attachBaseContext(android.content.Context):void");
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatMediaItem + 81;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            throw null;
        }
        int i4 = MediaBrowserCompatMediaItem + 115;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }
}
