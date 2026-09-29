package kotlin;

import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ExpandableListView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.exoplayer2.extractor.ts.TsExtractor;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.getEncryptedLicenseTimeInfo;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0005\u0018\u0000 &2\u00020\u0001:\u0001&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\f\u001a\u00020\b2\b\u0010\u0005\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ+\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u000e2\b\u0010\u0006\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0014\u001a\u00020\u00132\b\u0010\u0005\u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0016\u0010\u0003J\u000f\u0010\u0017\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0003J\u000f\u0010\u0019\u001a\u00020\bH\u0002¢\u0006\u0004\b\u0019\u0010\u0003J\u001d\u0010\u0019\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u001a¢\u0006\u0004\b\u0019\u0010\u001bJ\r\u0010\t\u001a\u00020\u001a¢\u0006\u0004\b\t\u0010\u001cJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u0003J!\u0010\u0019\u001a\u00020\b2\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u001f0\u001e\"\u00020\u001f¢\u0006\u0004\b\u0019\u0010 J\u000f\u0010!\u001a\u00020\u001aH\u0002¢\u0006\u0004\b!\u0010\u001cJ\u000f\u0010\"\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\"\u0010#R\u0018\u0010&\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010%R\u0014\u0010\u001d\u001a\u00020$8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001f0(8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010)R\u0018\u0010*\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010+R\u0018\u0010!\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0017\u0010+R\u0016\u0010-\u001a\u00020\u001a8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b!\u0010,"}, d2 = {"Lo/TtmlRenderUtil;", "Lo/argCount;", "<init>", "()V", "", "p0", "p1", "p2", "", "IconCompatParcelizer", "(III)V", "Landroid/os/Bundle;", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "Landroid/app/Dialog;", "onCreateDialog", "(Landroid/os/Bundle;)Landroid/app/Dialog;", "onStart", "AudioAttributesImplApi26Parcelizer", "onResume", "AudioAttributesCompatParcelizer", "", "(Lo/argCount;)V", "()Z", "write", "", "", "([Ljava/lang/String;)V", "AudioAttributesImplApi21Parcelizer", "getTheme", "()I", "Lo/getPlaylistSnapshot;", "Lo/getPlaylistSnapshot;", "read", "()Lo/getPlaylistSnapshot;", "", "Ljava/util/Set;", "RemoteActionCompatParcelizer", "Ljava/lang/Integer;", "Z", "MediaBrowserCompatCustomActionResultReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class TtmlRenderUtil extends argCount {
    private static char[] MediaBrowserCompatCustomActionResultReceiver;
    private static long MediaBrowserCompatItemReceiver;
    private static int RatingCompat;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private final Set<String> AudioAttributesCompatParcelizer = new LinkedHashSet();

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private boolean MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private Integer AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private getPlaylistSnapshot read;
    private Integer RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private Integer IconCompatParcelizer;
    private static final byte[] $$c = {81, -92, 74, -108};
    private static final int $$f = 248;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {105, -128, TarConstants.LF_BLK, -25, -61, 61, 2, 19, -30, 19, 23, -7, 9, -3, -9, 0, 7, 23, 12, 6, 9, -11, -32, 38, 21, -7, 10, 3, -39, TarConstants.LF_NORMAL, 2, 7, -11, 23, -32, 21, 21, -11, 6, 11, 1, 21, -17, 17};
    private static final int $$e = TsExtractor.TS_STREAM_TYPE_E_AC3;
    private static final byte[] $$a = {73, 111, 30, 98, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 144;
    private static int MediaBrowserCompatSearchResultReceiver = 0;
    private static int AudioAttributesImplBaseParcelizer = 0;
    private static int MediaDescriptionCompat = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0028 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(int r7, byte r8, byte r9) {
        /*
            int r7 = r7 * 4
            int r7 = 4 - r7
            int r8 = r8 * 4
            int r8 = r8 + 101
            byte[] r0 = kotlin.TtmlRenderUtil.$$c
            int r9 = r9 * 3
            int r9 = r9 + 1
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r8 = r7
            r3 = r9
            r5 = r2
            goto L2d
        L17:
            r3 = r2
        L18:
            r6 = r8
            r8 = r7
            r7 = r6
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L28
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L28:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r6
        L2d:
            int r7 = r7 + 1
            int r8 = r8 + r3
            r3 = r5
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TtmlRenderUtil.$$g(int, byte, byte):java.lang.String");
    }

    public static /* synthetic */ Object IconCompatParcelizer(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i);
        int i9 = ~i4;
        int i10 = ~i;
        int i11 = i8 | (~(i9 | i10 | i6));
        int i12 = (~(i | i9 | i6)) | (~(i10 | i7));
        int i13 = ~(i7 | i9);
        int i14 = i4 + i6 + i3 + (762713021 * i2) + (1579510587 * i5);
        int i15 = i14 * i14;
        int i16 = ((i4 * (-1846875272)) - 1480523776) + ((-1846875272) * i6) + (i11 * (-1613556599)) + (i12 * (-1613556599)) + ((-1613556599) * i13) + (834535424 * i3) + ((-750387200) * i2) + ((-523632640) * i5) + ((-1971257344) * i15);
        int i17 = ((i4 * (-1364308824)) - 1074288667) + (i6 * (-1364308824)) + (i11 * 659) + (i12 * 659) + (i13 * 659) + (i3 * (-1364308165)) + (i2 * (-893132913)) + (i5 * 986770329) + (i15 * (-1162149888));
        int i18 = i16 + (i17 * i17 * (-1529413632));
        if (i18 != 1) {
            if (i18 == 2) {
                return RemoteActionCompatParcelizer(objArr);
            }
            if (i18 != 3) {
                return AudioAttributesCompatParcelizer(objArr);
            }
            TtmlRenderUtil ttmlRenderUtil = (TtmlRenderUtil) objArr[0];
            int i19 = 2 % 2;
            int i20 = MediaDescriptionCompat + 75;
            AudioAttributesImplBaseParcelizer = i20 % 128;
            int i21 = i20 % 2;
            ttmlRenderUtil.dismissAllowingStateLoss();
            int i22 = MediaDescriptionCompat + 113;
            AudioAttributesImplBaseParcelizer = i22 % 128;
            int i23 = i22 % 2;
            return null;
        }
        TtmlRenderUtil ttmlRenderUtil2 = (TtmlRenderUtil) objArr[0];
        argCount argcount = (argCount) objArr[1];
        int i24 = 2 % 2;
        int i25 = MediaDescriptionCompat + 79;
        AudioAttributesImplBaseParcelizer = i25 % 128;
        int i26 = i25 % 2;
        toMagicModuleMetaRepoModel.write(argcount, "");
        argcount.setShowsDialog(false);
        _doAddInjectable _doaddinjectableMediaDescriptionCompat = ttmlRenderUtil2.getChildFragmentManager().IconCompatParcelizer().MediaDescriptionCompat();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(_doaddinjectableMediaDescriptionCompat, "");
        _doaddinjectableMediaDescriptionCompat.write(R.id.overlay_container, argcount, argcount.getClass().getName());
        _doaddinjectableMediaDescriptionCompat.read(argcount.getClass().getName());
        _doaddinjectableMediaDescriptionCompat.write();
        int i27 = AudioAttributesImplBaseParcelizer + 35;
        MediaDescriptionCompat = i27 % 128;
        int i28 = i27 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r7, short r8, int r9, java.lang.Object[] r10) {
        /*
            byte[] r0 = kotlin.TtmlRenderUtil.$$a
            int r8 = r8 + 4
            int r9 = r9 * 10
            int r9 = 44 - r9
            int r7 = r7 * 12
            int r7 = 77 - r7
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r8 = r9
            r5 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            int r8 = r8 + 1
            if (r5 != r9) goto L27
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L27:
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-1)
            r8 = r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TtmlRenderUtil.a(int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            int r8 = r8 + 4
            int r0 = r6 + 4
            byte[] r1 = kotlin.TtmlRenderUtil.$$d
            int r7 = r7 + 82
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = 0
            if (r1 != 0) goto L12
            r3 = r8
            r4 = r2
            goto L2a
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            int r8 = r8 + 1
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L22:
            int r3 = r3 + 1
            r4 = r1[r8]
            r5 = r3
            r3 = r8
            r8 = r4
            r4 = r5
        L2a:
            int r7 = r7 + r8
            int r7 = r7 + (-4)
            r8 = r3
            r3 = r4
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TtmlRenderUtil.c(byte, byte, byte, java.lang.Object[]):void");
    }

    private final getPlaylistSnapshot read() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 97;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getPlaylistSnapshot getplaylistsnapshot = this.read;
        toMagicModuleMetaRepoModel.write(getplaylistsnapshot);
        if (i3 != 0) {
            int i4 = 22 / 0;
        }
        int i5 = MediaDescriptionCompat + 109;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
        return getplaylistsnapshot;
    }

    public final void IconCompatParcelizer(int p0, int p1, int p2) {
        boolean z;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 25;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            this.RemoteActionCompatParcelizer = Integer.valueOf(p0);
            this.IconCompatParcelizer = Integer.valueOf(p1);
            this.AudioAttributesImplApi21Parcelizer = Integer.valueOf(p2);
            z = true;
        } else {
            this.RemoteActionCompatParcelizer = Integer.valueOf(p0);
            this.IconCompatParcelizer = Integer.valueOf(p1);
            this.AudioAttributesImplApi21Parcelizer = Integer.valueOf(p2);
            z = false;
        }
        this.MediaBrowserCompatCustomActionResultReceiver = z;
        int i3 = AudioAttributesImplBaseParcelizer + 51;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
    }

    private static void b(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i4 = $10 + 55;
            $11 = i4 % 128;
            int i5 = i4 % 2;
            int i6 = downloadService.write;
            try {
                Object[] objArr2 = {Integer.valueOf(MediaBrowserCompatCustomActionResultReceiver[i + i6])};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) (36622 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 2340 - TextUtils.getOffsetBefore("", 0), 28 - (ViewConfiguration.getScrollBarSize() >> 8), 480654850, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                }
                Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i6), Long.valueOf(MediaBrowserCompatItemReceiver), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((-1) - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 9701, TextUtils.getCapsMode("", 0, 0) + 26, 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i6] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                Object[] objArr4 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) View.MeasureSpec.getMode(0), 23784 - Drawable.resolveOpacity(0, 0), (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)) + 32, -1690012015, false, "b", new Class[]{Object.class, Object.class});
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
            cArr[downloadService.write] = (char) jArr[downloadService.write];
            Object[] objArr5 = {downloadService, downloadService};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-452087292);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) - 1), 23785 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 33, -1690012015, false, "b", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            int i7 = $11 + 9;
            $10 = i7 % 128;
            int i8 = i7 % 2;
        }
        String str = new String(cArr);
        int i9 = $11 + 19;
        $10 = i9 % 128;
        int i10 = i9 % 2;
        objArr[0] = str;
    }

    /* JADX INFO: renamed from: o.TtmlRenderUtil$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ/\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0007\u0010\u000e"}, d2 = {"Lo/TtmlRenderUtil$read;", "", "<init>", "()V", "Landroidx/fragment/app/FragmentManager;", "p0", "Lo/TtmlRenderUtil;", "read", "(Landroidx/fragment/app/FragmentManager;)Lo/TtmlRenderUtil;", "IconCompatParcelizer", "", "p1", "p2", "p3", "(Landroidx/fragment/app/FragmentManager;III)Lo/TtmlRenderUtil;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static TtmlRenderUtil read(FragmentManager p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Fragment fragmentFindFragmentByTag = p0.findFragmentByTag("OverlayHostDialog");
            if (fragmentFindFragmentByTag instanceof TtmlRenderUtil) {
                return (TtmlRenderUtil) fragmentFindFragmentByTag;
            }
            return null;
        }

        @getMagicModuleMeta
        public static TtmlRenderUtil IconCompatParcelizer(FragmentManager p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            TtmlRenderUtil ttmlRenderUtil = read(p0);
            if (ttmlRenderUtil != null) {
                return ttmlRenderUtil;
            }
            TtmlRenderUtil ttmlRenderUtil2 = new TtmlRenderUtil();
            ttmlRenderUtil2.setCancelable(true);
            ttmlRenderUtil2.show(p0, "OverlayHostDialog");
            p0.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            return ttmlRenderUtil2;
        }

        @getMagicModuleMeta
        public static TtmlRenderUtil read(FragmentManager p0, int p1, int p2, int p3) {
            toMagicModuleMetaRepoModel.write(p0, "");
            TtmlRenderUtil ttmlRenderUtil = read(p0);
            if (ttmlRenderUtil != null) {
                return ttmlRenderUtil;
            }
            TtmlRenderUtil ttmlRenderUtil2 = new TtmlRenderUtil();
            ttmlRenderUtil2.IconCompatParcelizer(p1, p2, p3);
            ttmlRenderUtil2.setCancelable(true);
            ttmlRenderUtil2.show(p0, "OverlayHostDialog");
            p0.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            return ttmlRenderUtil2;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 85;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char cCombineMeasuredStates = (char) (View.combineMeasuredStates(0, 0) + 13183);
            int gidForName = Process.getGidForName("") + 1650;
            int threadPriority = 26 - ((Process.getThreadPriority(0) + 20) >> 6);
            byte b = $$a[5];
            Object[] objArr2 = new Object[1];
            a(b, r2[53], b, objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(cCombineMeasuredStates, gidForName, threadPriority, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char cResolveSizeAndState = (char) (13183 - View.resolveSizeAndState(0, 0, 0));
                int iGreen = 1649 - Color.green(0);
                int bitsPerPixel = ImageFormat.getBitsPerPixel(0) + 27;
                byte b2 = $$a[17];
                Object[] objArr3 = new Object[1];
                a(b2, r3[65], b2, objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(cResolveSizeAndState, iGreen, bitsPerPixel, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
        } else {
            Object[] objArr4 = new Object[1];
            b((char) TextUtils.getCapsMode("", 0, 0), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), TextUtils.getOffsetBefore("", 0) + 16, objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b((char) ((ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 37628), 16 - TextUtils.indexOf("", "", 0, 0), View.MeasureSpec.getMode(0) + 16, objArr5);
            int iIntValue = ((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue();
            int i4 = MediaDescriptionCompat + 83;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object[] objArr6 = {Integer.valueOf(iIntValue), 0, 692311461};
                byte[] bArr = $$d;
                Object[] objArr7 = new Object[1];
                c(bArr[16], (byte) 29, (byte) (-bArr[40]), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                Object[] objArr8 = new Object[1];
                c(bArr[15], (byte) (-bArr[22]), bArr[12], objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char c = (char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13182);
                    int scrollBarSize = (ViewConfiguration.getScrollBarSize() >> 8) + 1649;
                    int iLastIndexOf = 25 - TextUtils.lastIndexOf("", '0');
                    byte b3 = $$a[17];
                    Object[] objArr9 = new Object[1];
                    a(b3, r9[65], b3, objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(c, scrollBarSize, iLastIndexOf, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b((char) (3477 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)), (Process.myTid() >> 22) + 32, 21 - TextUtils.lastIndexOf("", '0', 0, 0), objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b((char) (TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1), View.resolveSize(0, 0) + 54, ((byte) KeyEvent.getModifierMetaStateMask()) + 16, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char cCombineMeasuredStates2 = (char) (13183 - View.combineMeasuredStates(0, 0));
                        int touchSlop = (ViewConfiguration.getTouchSlop() >> 8) + 1649;
                        int packedPositionType = 26 - ExpandableListView.getPackedPositionType(0L);
                        byte b4 = $$a[17];
                        byte b5 = b4;
                        Object[] objArr12 = new Object[1];
                        a(b5, (byte) (b5 | 74), b4, objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(cCombineMeasuredStates2, touchSlop, packedPositionType, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char cArgb = (char) (Color.argb(0, 0, 0, 0) + 13183);
                        int iLastIndexOf2 = 1648 - TextUtils.lastIndexOf("", '0', 0, 0);
                        int i6 = 26 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1));
                        byte b6 = $$a[5];
                        Object[] objArr13 = new Object[1];
                        a(b6, r4[53], b6, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(cArgb, iLastIndexOf2, i6, -133433128, false, (String) objArr13[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf2);
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
        int i7 = ((int[]) objArr[3])[0];
        int i8 = ((int[]) objArr[2])[0];
        if (i8 != i7) {
            long j = -1;
            long j2 = 0;
            long j3 = (((long) (i7 ^ i8)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) 2) << 32) | (j2 - ((j2 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (ExpandableListView.getPackedPositionGroup(0L) + 4535), Drawable.resolveOpacity(0, 0) + 6054, 42 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                try {
                    Object[] objArr14 = {910017249, Long.valueOf(j3), new ArrayList(), TrainingApplication.RemoteActionCompatParcelizer(), true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) (ViewConfiguration.getMaximumFlingVelocity() >> 16), 6030 - ExpandableListView.getPackedPositionType(0L), 24 - (ViewConfiguration.getTouchSlop() >> 8));
                    Object[] objArr15 = new Object[1];
                    c((byte) ($$d[10] + 1), r1[15], r1[18], objArr15);
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
        super.onCreate(p0);
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        TtmlRenderUtil ttmlRenderUtil = (TtmlRenderUtil) objArr[0];
        LayoutInflater layoutInflater = (LayoutInflater) objArr[1];
        ViewGroup viewGroup = (ViewGroup) objArr[2];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 77;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(layoutInflater, "");
            ttmlRenderUtil.read = getPlaylistSnapshot.AudioAttributesCompatParcelizer(layoutInflater, viewGroup);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(ttmlRenderUtil.read().IconCompatParcelizer(), "");
            throw null;
        }
        toMagicModuleMetaRepoModel.write(layoutInflater, "");
        ttmlRenderUtil.read = getPlaylistSnapshot.AudioAttributesCompatParcelizer(layoutInflater, viewGroup);
        ConstraintLayout constraintLayoutIconCompatParcelizer = ttmlRenderUtil.read().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // kotlin.argCount
    public final Dialog onCreateDialog(Bundle p0) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 77;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        final Dialog dialogOnCreateDialog = super.onCreateDialog(p0);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(dialogOnCreateDialog, "");
        Window window = dialogOnCreateDialog.getWindow();
        if (window != null) {
            int i4 = MediaDescriptionCompat + 33;
            AudioAttributesImplBaseParcelizer = i4 % 128;
            if (i4 % 2 != 0) {
                window.addFlags(76);
            } else {
                window.addFlags(8);
            }
        }
        dialogOnCreateDialog.setOnShowListener(new DialogInterface.OnShowListener() { // from class: o.applyStylesToSpan
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                TtmlRenderUtil.IconCompatParcelizer(dialogOnCreateDialog, this);
            }
        });
        int i5 = AudioAttributesImplBaseParcelizer + 59;
        MediaDescriptionCompat = i5 % 128;
        if (i5 % 2 != 0) {
            return dialogOnCreateDialog;
        }
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0028, code lost:
    
        if ((r3 % 2) != 0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x002a, code lost:
    
        r3 = 7 / 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002d, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x002e, code lost:
    
        r4.AudioAttributesImplApi26Parcelizer();
        r3.clearFlags(8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0016, code lost:
    
        if (r3 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r3 == null) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x001f, code lost:
    
        r3 = kotlin.TtmlRenderUtil.AudioAttributesImplBaseParcelizer + 39;
        kotlin.TtmlRenderUtil.MediaDescriptionCompat = r3 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void read(android.app.Dialog r3, kotlin.TtmlRenderUtil r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.TtmlRenderUtil.AudioAttributesImplBaseParcelizer
            int r1 = r1 + 69
            int r2 = r1 % 128
            kotlin.TtmlRenderUtil.MediaDescriptionCompat = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L19
            android.view.Window r3 = r3.getWindow()
            r1 = 68
            int r1 = r1 / 0
            if (r3 != 0) goto L2e
            goto L1f
        L19:
            android.view.Window r3 = r3.getWindow()
            if (r3 != 0) goto L2e
        L1f:
            int r3 = kotlin.TtmlRenderUtil.AudioAttributesImplBaseParcelizer
            int r3 = r3 + 39
            int r4 = r3 % 128
            kotlin.TtmlRenderUtil.MediaDescriptionCompat = r4
            int r3 = r3 % r0
            if (r3 != 0) goto L2d
            r3 = 7
            int r3 = r3 / 0
        L2d:
            return
        L2e:
            r4.AudioAttributesImplApi26Parcelizer()
            r4 = 8
            r3.clearFlags(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TtmlRenderUtil.read(android.app.Dialog, o.TtmlRenderUtil):void");
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onStart() {
        Window window;
        View viewFindViewById;
        ViewGroup.LayoutParams layoutParams;
        int i = 2 % 2;
        super.onStart();
        Dialog dialog = getDialog();
        if (dialog != null && (window = dialog.getWindow()) != null) {
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (attributes != null) {
                int i2 = AudioAttributesImplBaseParcelizer + 37;
                MediaDescriptionCompat = i2 % 128;
                int i3 = i2 % 2;
                attributes.windowAnimations = 0;
                int i4 = AudioAttributesImplBaseParcelizer + 29;
                MediaDescriptionCompat = i4 % 128;
                if (i4 % 2 == 0) {
                    int i5 = 5 / 5;
                }
            }
            window.setDimAmount(0.3f);
            if (AudioAttributesImplApi21Parcelizer()) {
                Dialog dialog2 = getDialog();
                ViewGroup.LayoutParams layoutParams2 = null;
                if (dialog2 != null) {
                    int i6 = AudioAttributesImplBaseParcelizer + 5;
                    MediaDescriptionCompat = i6 % 128;
                    if (i6 % 2 == 0) {
                        dialog2.getWindow();
                        throw null;
                    }
                    Window window2 = dialog2.getWindow();
                    if (window2 != null) {
                        window2.setBackgroundDrawableResource(android.R.color.transparent);
                        WindowManager.LayoutParams attributes2 = window2.getAttributes();
                        attributes2.gravity = 8388613;
                        window2.setLayout(-2, -1);
                        window2.setAttributes(attributes2);
                    }
                }
                View view = read().IconCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
                bytesRead.AudioAttributesImplApi21Parcelizer(view);
                View view2 = getView();
                if (view2 != null && (viewFindViewById = view2.findViewById(R.id.overlay_container)) != null) {
                    View view3 = getView();
                    if (view3 != null && (layoutParams = view3.getLayoutParams()) != null) {
                        int i7 = AudioAttributesImplBaseParcelizer + 35;
                        MediaDescriptionCompat = i7 % 128;
                        int i8 = i7 % 2;
                        layoutParams.width = getResources().getDimensionPixelSize(R.dimen.side_sheet_width);
                        layoutParams.height = -1;
                        layoutParams2 = layoutParams;
                    }
                    viewFindViewById.setLayoutParams(layoutParams2);
                }
            } else {
                View view4 = read().IconCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view4, "");
                bytesRead.MediaBrowserCompatCustomActionResultReceiver(view4);
                AudioAttributesCompatParcelizer();
            }
        }
        Dialog dialog3 = getDialog();
        if (dialog3 != null) {
            dialog3.setCanceledOnTouchOutside(true);
        }
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        Dialog dialog;
        Window window;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 49;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        if (!AudioAttributesImplApi21Parcelizer() || (dialog = getDialog()) == null || (window = dialog.getWindow()) == null) {
            return;
        }
        int i4 = AudioAttributesImplBaseParcelizer + 101;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        bytesRead.write(window);
        if (i5 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 61;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            super.onResume();
            AudioAttributesImplApi26Parcelizer();
            int i3 = 75 / 0;
        } else {
            super.onResume();
            AudioAttributesImplApi26Parcelizer();
        }
        int i4 = MediaDescriptionCompat + 99;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x008d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void AudioAttributesCompatParcelizer() {
        /*
            Method dump skipped, instruction units count: 250
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TtmlRenderUtil.AudioAttributesCompatParcelizer():void");
    }

    public final boolean IconCompatParcelizer() {
        int i = 2 % 2;
        if (getChildFragmentManager().onCustomAction() <= 0) {
            dismissAllowingStateLoss();
            return false;
        }
        int i2 = MediaDescriptionCompat + 121;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getChildFragmentManager().onPrepareFromUri();
        int i4 = MediaDescriptionCompat + 29;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    public final void write() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 53;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            getDialog();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Dialog dialog = getDialog();
        if (dialog != null) {
            int i3 = MediaDescriptionCompat + 119;
            AudioAttributesImplBaseParcelizer = i3 % 128;
            int i4 = i3 % 2;
            Window window = dialog.getWindow();
            if (window != null) {
                int i5 = AudioAttributesImplBaseParcelizer + 101;
                MediaDescriptionCompat = i5 % 128;
                if (i5 % 2 == 0) {
                    window.setDimAmount(BitmapDescriptorFactory.HUE_RED);
                } else {
                    window.setDimAmount(BitmapDescriptorFactory.HUE_RED);
                }
            }
        }
        View view = getView();
        if (view != null) {
            view.post(new Runnable() { // from class: o.applyTextElementSpacePolicy
                @Override // java.lang.Runnable
                public final void run() {
                    TtmlRenderUtil.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
                }
            });
        }
        int i6 = MediaDescriptionCompat + 109;
        AudioAttributesImplBaseParcelizer = i6 % 128;
        int i7 = i6 % 2;
    }

    public final void AudioAttributesCompatParcelizer(String... p0) {
        int i;
        int i2 = 2 % 2;
        int i3 = AudioAttributesImplBaseParcelizer + 101;
        MediaDescriptionCompat = i3 % 128;
        if (i3 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            int length = p0.length;
            i = 1;
        } else {
            toMagicModuleMetaRepoModel.write(p0, "");
            int length2 = p0.length;
            i = 0;
        }
        int i4 = MediaDescriptionCompat + 97;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        while (i < 8) {
            int i6 = MediaDescriptionCompat + 9;
            AudioAttributesImplBaseParcelizer = i6 % 128;
            int i7 = i6 % 2;
            String str = p0[i];
            if (this.AudioAttributesCompatParcelizer.add(str)) {
                getChildFragmentManager().IconCompatParcelizer(str, getViewLifecycleOwner(), new _addFields() { // from class: o.resolveStyle
                    @Override // kotlin._addFields
                    public final void AudioAttributesCompatParcelizer(String str2, Bundle bundle) {
                        Object[] objArr = {this.read, str2, bundle};
                        TtmlRenderUtil.IconCompatParcelizer(getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), objArr, getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), -1072900826, getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), 1072900828);
                    }
                });
            }
            i++;
        }
    }

    private static final void IconCompatParcelizer(TtmlRenderUtil ttmlRenderUtil, String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 25;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(bundle, "");
            ttmlRenderUtil.getParentFragmentManager().read(str, bundle);
        } else {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(bundle, "");
            ttmlRenderUtil.getParentFragmentManager().read(str, bundle);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final boolean AudioAttributesImplApi21Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat;
        int i3 = i2 + 93;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        if (this.RemoteActionCompatParcelizer != null && this.IconCompatParcelizer != null) {
            int i5 = i2 + 13;
            AudioAttributesImplBaseParcelizer = i5 % 128;
            return i5 % 2 != 0;
        }
        int i6 = i2 + 31;
        AudioAttributesImplBaseParcelizer = i6 % 128;
        int i7 = i6 % 2;
        return true;
    }

    @Override // kotlin.argCount
    public final int getTheme() {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 81;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            if (!AudioAttributesImplApi21Parcelizer()) {
                return CmcdConfigurationRequestConfig.read();
            }
            int i3 = AudioAttributesImplBaseParcelizer + 107;
            MediaDescriptionCompat = i3 % 128;
            if (i3 % 2 != 0) {
                return R.style.AppThemeV2_Dark_Dialog;
            }
            int i4 = 91 / 0;
            return R.style.AppThemeV2_Dark_Dialog;
        }
        AudioAttributesImplApi21Parcelizer();
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IconCompatParcelizer(Dialog dialog, TtmlRenderUtil ttmlRenderUtil) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 1;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        read(dialog, ttmlRenderUtil);
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
    }

    public static /* synthetic */ void IconCompatParcelizer(TtmlRenderUtil ttmlRenderUtil) {
        int i = 2 % 2;
        int i2 = AudioAttributesImplBaseParcelizer + 5;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            int iWrite = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
            int iWrite2 = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
            IconCompatParcelizer(iWrite, getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), new Object[]{ttmlRenderUtil}, iWrite2, -825066001, getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), 825066004);
            return;
        }
        int iWrite3 = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
        int iWrite4 = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
        IconCompatParcelizer(iWrite3, getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), new Object[]{ttmlRenderUtil}, iWrite4, -825066001, getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), 825066004);
        throw null;
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(TtmlRenderUtil ttmlRenderUtil, String str, Bundle bundle) {
        int iWrite = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
        int iWrite2 = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
        IconCompatParcelizer(iWrite, getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), new Object[]{ttmlRenderUtil, str, bundle}, iWrite2, -1072900826, getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), 1072900828);
    }

    static {
        RatingCompat = 1;
        RemoteActionCompatParcelizer();
        INSTANCE = new Companion(null);
        int i = MediaBrowserCompatSearchResultReceiver + 55;
        RatingCompat = i % 128;
        int i2 = i % 2;
    }

    private static final void AudioAttributesCompatParcelizer(TtmlRenderUtil ttmlRenderUtil) {
        int iWrite = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
        int iWrite2 = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
        IconCompatParcelizer(iWrite, getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), new Object[]{ttmlRenderUtil}, iWrite2, -825066001, getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), 825066004);
    }

    @getMagicModuleMeta
    public static final TtmlRenderUtil RemoteActionCompatParcelizer(FragmentManager fragmentManager) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 59;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            Companion.read(fragmentManager);
            throw null;
        }
        TtmlRenderUtil ttmlRenderUtil = Companion.read(fragmentManager);
        int i3 = MediaDescriptionCompat + 87;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        return ttmlRenderUtil;
    }

    @getMagicModuleMeta
    public static final TtmlRenderUtil write(FragmentManager fragmentManager) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 33;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            Companion.IconCompatParcelizer(fragmentManager);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        TtmlRenderUtil ttmlRenderUtilIconCompatParcelizer = Companion.IconCompatParcelizer(fragmentManager);
        int i3 = MediaDescriptionCompat + 57;
        AudioAttributesImplBaseParcelizer = i3 % 128;
        int i4 = i3 % 2;
        return ttmlRenderUtilIconCompatParcelizer;
    }

    @getMagicModuleMeta
    public static final TtmlRenderUtil AudioAttributesCompatParcelizer(FragmentManager fragmentManager, int i, int i2, int i3) {
        int i4 = 2 % 2;
        int i5 = MediaDescriptionCompat + 89;
        AudioAttributesImplBaseParcelizer = i5 % 128;
        int i6 = i5 % 2;
        TtmlRenderUtil ttmlRenderUtil = Companion.read(fragmentManager, i, i2, i3);
        int i7 = AudioAttributesImplBaseParcelizer + 87;
        MediaDescriptionCompat = i7 % 128;
        if (i7 % 2 != 0) {
            return ttmlRenderUtil;
        }
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        int iWrite = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
        int iWrite2 = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
        return (View) IconCompatParcelizer(iWrite, getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), new Object[]{this, p0, p1, p2}, iWrite2, -1332181071, getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), 1332181071);
    }

    public final void AudioAttributesCompatParcelizer(argCount argcount) {
        int iWrite = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
        int iWrite2 = getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write();
        IconCompatParcelizer(iWrite, getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), new Object[]{this, argcount}, iWrite2, -117711015, getEncryptedLicenseTimeInfo.AudioAttributesCompatParcelizer.write(), 117711016);
    }

    static void RemoteActionCompatParcelizer() {
        MediaBrowserCompatCustomActionResultReceiver = new char[]{56422, 28466, 47812, 50800, 4446, 23739, 59479, 15355, 18067, 37493, 56809, 26976, 46091, 51115, 4955, 24304, 20120, 64970, 10282, 21634, 33785, 52803, 31423, 43281, 54337, 199, 20276, 64396, 9926, 21837, 33191, 52229, 53752, 25256, 46915, 52214, 7306, 20779, 58823, 13870, 19214, 40893, 53249, 25823, 47508, 51769, 7903, 21357, 58372, 14485, 19803, 33275, 53910, 26425, 56425, 28479, 47827, 50785, 4355, 23730, 59474, 15303, 18065, 37434, 56790, 26989, 46097, 51122, 4955};
        MediaBrowserCompatItemReceiver = 7288815568650989395L;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        TtmlRenderUtil ttmlRenderUtil = (TtmlRenderUtil) objArr[0];
        String str = (String) objArr[1];
        Bundle bundle = (Bundle) objArr[2];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 91;
        AudioAttributesImplBaseParcelizer = i2 % 128;
        int i3 = i2 % 2;
        IconCompatParcelizer(ttmlRenderUtil, str, bundle);
        int i4 = MediaDescriptionCompat + 123;
        AudioAttributesImplBaseParcelizer = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }
}
