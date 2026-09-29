package kotlin;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.ExpandableListView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.card.MaterialCardView;
import com.marrow.R;
import com.marrow.TrainingApplication;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.setSubject;
import kotlin.shouldEscapeCharacter;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\r2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0003J\u000f\u0010\u0013\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0013\u0010\u0003J'\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\u00152\u0006\u0010\f\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0012\u001a\u00020\u00198CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u001c"}, d2 = {"Lo/SaveAccountLinkingTokenResult;", "Lo/argCount;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "write", "onDestroyView", "", "Lcom/google/android/material/card/MaterialCardView;", "Landroid/widget/TextView;", "AudioAttributesCompatParcelizer", "(ZLcom/google/android/material/card/MaterialCardView;Landroid/widget/TextView;)V", "Lo/getCacheKey;", "RemoteActionCompatParcelizer", "Lo/getCacheKey;", "()Lo/getCacheKey;", "read"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class SaveAccountLinkingTokenResult extends argCount {
    private static long IconCompatParcelizer;
    private static int MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static char[] write;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private getCacheKey AudioAttributesCompatParcelizer;
    private static final byte[] $$c = {0, -75, -45, -77};
    private static final int $$f = 59;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {18, 96, 87, -114, -58, 64, 5, 22, -25, 27, 20, -1, -4, 19, -6, 15, 10, -16, 36, 1, -65, TarConstants.LF_DIR, 26, 15, 9, 12, -8, -29, 41, 24, -4, 13, 6, -36, TarConstants.LF_CHR, 5, 10, -8, 26, -29, 24, 24, -8, 9, 14, 4, 24, -14, 20, 26, 15, 9, 12, -8, -29, 41, 24, -4, 13, 6, -36, TarConstants.LF_CHR, 5, 10, -8, 26, -29, 24, 24, -8, 9, 14, 4, 24, -14, 20};
    private static final int $$e = 171;
    private static final byte[] $$a = {104, -54, 119, 45, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$b = 35;
    private static int AudioAttributesImplApi26Parcelizer = 0;
    private static int AudioAttributesCompatParcelizer = 0;
    private static int MediaBrowserCompatItemReceiver = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x0027). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(short r5, int r6, short r7) {
        /*
            int r6 = r6 * 2
            int r6 = r6 + 4
            int r5 = r5 * 4
            int r5 = 1 - r5
            int r7 = r7 * 4
            int r7 = r7 + 101
            byte[] r0 = kotlin.SaveAccountLinkingTokenResult.$$c
            byte[] r1 = new byte[r5]
            r2 = 0
            if (r0 != 0) goto L17
            r7 = r5
            r4 = r6
            r3 = r2
            goto L27
        L17:
            r3 = r2
        L18:
            byte r4 = (byte) r7
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r5) goto L25
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            return r5
        L25:
            r4 = r0[r6]
        L27:
            int r6 = r6 + 1
            int r7 = r7 + r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SaveAccountLinkingTokenResult.$$g(short, int, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r5, short r6, byte r7, java.lang.Object[] r8) {
        /*
            int r7 = r7 + 4
            int r5 = r5 * 12
            int r5 = 77 - r5
            int r6 = r6 * 10
            int r0 = r6 + 34
            byte[] r1 = kotlin.SaveAccountLinkingTokenResult.$$a
            byte[] r0 = new byte[r0]
            int r6 = r6 + 33
            r2 = 0
            if (r1 != 0) goto L16
            r4 = r7
            r3 = r2
            goto L28
        L16:
            r3 = r2
        L17:
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L24
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r7]
        L28:
            int r7 = r7 + 1
            int r5 = r5 + r4
            int r5 = r5 + (-1)
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SaveAccountLinkingTokenResult.a(byte, short, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x0029). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(short r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r8 = r8 * 29
            int r8 = 111 - r8
            byte[] r0 = kotlin.SaveAccountLinkingTokenResult.$$d
            int r6 = r6 * 18
            int r6 = r6 + 28
            byte[] r1 = new byte[r6]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r4 = r2
            r8 = r6
            goto L29
        L15:
            r3 = r2
        L16:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r8
            r1[r3] = r5
            if (r4 != r6) goto L27
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L27:
            r3 = r0[r7]
        L29:
            int r8 = r8 + r3
            int r8 = r8 + (-7)
            r3 = r4
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SaveAccountLinkingTokenResult.c(short, int, byte, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object read(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i;
        int i8 = ~i2;
        int i9 = i5 | i7 | i8;
        int i10 = (~(i7 | i2)) | (~(i8 | i5));
        int i11 = (~(i2 | i5)) | (~(i7 | (~i5) | i8));
        int i12 = i5 + i + i6 + ((-160716491) * i4) + (1883135422 * i3);
        int i13 = i12 * i12;
        int i14 = (((-1835184368) * i5) - 666828800) + ((-962678542) * i) + ((-1711230735) * i9) + (i10 * 1711230735) + (1711230735 * i11) + (748552192 * i6) + ((-1967783936) * i4) + ((-2092695552) * i3) + ((-870252544) * i13);
        int i15 = (i5 * 1975847376) + 750996803 + (i * 1975845642) + (i9 * (-867)) + (i10 * 867) + (i11 * 867) + (i6 * 1975846509) + (i4 * (-526956143)) + (i3 * 972447206) + (i13 * (-1341325312));
        int i16 = i14 + (i15 * i15 * 1929838592);
        return i16 != 1 ? i16 != 2 ? IconCompatParcelizer(objArr) : AudioAttributesCompatParcelizer(objArr) : write(objArr);
    }

    private final getCacheKey AudioAttributesCompatParcelizer() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 99;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        getCacheKey getcachekey = this.AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.write(getcachekey);
        int i4 = AudioAttributesCompatParcelizer + 93;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return getcachekey;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void b(char c, int i, int i2, Object[] objArr) throws Throwable {
        int i3 = 2;
        int i4 = 2 % 2;
        DownloadService downloadService = new DownloadService();
        long[] jArr = new long[i2];
        downloadService.write = 0;
        int i5 = $10 + 13;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (downloadService.write < i2) {
            int i7 = $11 + 3;
            $10 = i7 % 128;
            if (i7 % i3 != 0) {
                int i8 = downloadService.write;
                try {
                    Object[] objArr2 = {Integer.valueOf(write[i / i8])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1659892375);
                    if (objRemoteActionCompatParcelizer == null) {
                        char c2 = (char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 36620);
                        int absoluteGravity = 2340 - Gravity.getAbsoluteGravity(0, 0);
                        int i9 = 28 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        byte b = $$c[0];
                        byte b2 = b;
                        objRemoteActionCompatParcelizer = startForeground.read(c2, absoluteGravity, i9, 480654850, false, $$g(b, b2, b2), new Class[]{Integer.TYPE});
                    }
                    Object[] objArr3 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue()), Long.valueOf(i8), Long.valueOf(IconCompatParcelizer), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(955774634);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getPressedStateDuration() >> 16), 9701 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (-16777190) - Color.rgb(0, 0, 0), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                    }
                    jArr[i8] = ((Long) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).longValue();
                    Object[] objArr4 = {downloadService, downloadService};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-452087292);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), View.MeasureSpec.getMode(0) + 23784, 33 - TextUtils.getCapsMode("", 0, 0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            } else {
                int i10 = downloadService.write;
                Object[] objArr5 = {Integer.valueOf(write[i + i10])};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1659892375);
                if (objRemoteActionCompatParcelizer4 == null) {
                    char modifierMetaStateMask = (char) (((byte) KeyEvent.getModifierMetaStateMask()) + 36622);
                    int iArgb = 2340 - Color.argb(0, 0, 0, 0);
                    int keyRepeatTimeout = 28 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
                    byte b3 = $$c[0];
                    byte b4 = b3;
                    objRemoteActionCompatParcelizer4 = startForeground.read(modifierMetaStateMask, iArgb, keyRepeatTimeout, 480654850, false, $$g(b3, b4, b4), new Class[]{Integer.TYPE});
                }
                Object[] objArr6 = {Long.valueOf(((Long) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).longValue()), Long.valueOf(i10), Long.valueOf(IconCompatParcelizer), Integer.valueOf(c)};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(955774634);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (1 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), 9701 - (ViewConfiguration.getWindowTouchSlop() >> 8), 26 - View.resolveSizeAndState(0, 0, 0), 1186869823, false, "d", new Class[]{Long.TYPE, Long.TYPE, Long.TYPE, Integer.TYPE});
                }
                jArr[i10] = ((Long) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).longValue();
                Object[] objArr7 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (ViewConfiguration.getEdgeSlop() >> 16), 23784 - (ViewConfiguration.getTapTimeout() >> 16), 33 - TextUtils.getOffsetAfter("", 0), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer6).invoke(null, objArr7);
            }
            i3 = 2;
        }
        char[] cArr = new char[i2];
        downloadService.write = 0;
        while (downloadService.write < i2) {
            int i11 = $10 + 31;
            $11 = i11 % 128;
            if (i11 % 2 == 0) {
                cArr[downloadService.write] = (char) jArr[downloadService.write];
                Object[] objArr8 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer7 == null) {
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) (ViewConfiguration.getDoubleTapTimeout() >> 16), 23784 - Color.argb(0, 0, 0, 0), 33 - TextUtils.indexOf("", ""), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer7).invoke(null, objArr8);
                int i12 = 94 / 0;
            } else {
                cArr[downloadService.write] = (char) jArr[downloadService.write];
                Object[] objArr9 = {downloadService, downloadService};
                Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(-452087292);
                if (objRemoteActionCompatParcelizer8 == null) {
                    objRemoteActionCompatParcelizer8 = startForeground.read((char) (1 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), 23783 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), 34 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), -1690012015, false, "b", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer8).invoke(null, objArr9);
            }
        }
        objArr[0] = new String(cArr);
    }

    /* JADX INFO: renamed from: o.SaveAccountLinkingTokenResult$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/marrow2/ui/dialogs/CallbackDialogFragment$Companion;", "", "<init>", "()V", "ALLOW_BACK_PRESS_KEY", "", "REQUEST_KEY", "BUTTON_COUNTRY_CODE", "BUTTON_PHONE", "BUTTON_SLOT", "ON_ERROR", "newInstance", "Lcom/marrow2/ui/dialogs/CallbackDialogFragment;", "allowBackPress", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        @getMagicModuleMeta
        public static SaveAccountLinkingTokenResult write(boolean z) {
            SaveAccountLinkingTokenResult saveAccountLinkingTokenResult = new SaveAccountLinkingTokenResult();
            Bundle bundle = new Bundle();
            bundle.putBoolean("back_press_allow_key", true);
            saveAccountLinkingTokenResult.setArguments(bundle);
            return saveAccountLinkingTokenResult;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onCreate(Bundle p0) throws Throwable {
        Object[] objArr;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 99;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-2042479539);
        if (objRemoteActionCompatParcelizer == null) {
            char cIndexOf = (char) (13183 - TextUtils.indexOf("", "", 0, 0));
            int iResolveSizeAndState = View.resolveSizeAndState(0, 0, 0) + 1649;
            int iRed = 26 - Color.red(0);
            byte b = $$a[5];
            Object[] objArr2 = new Object[1];
            a(b, r2[53], b, objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(cIndexOf, iResolveSizeAndState, iRed, -133433128, false, (String) objArr2[0], null);
        }
        if (((Field) objRemoteActionCompatParcelizer).getLong(null) != -1) {
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1137999833);
            if (objRemoteActionCompatParcelizer2 == null) {
                char cLastIndexOf = (char) (TextUtils.lastIndexOf("", '0', 0) + 13184);
                int iRed2 = 1649 - Color.red(0);
                int packedPositionType = 26 - ExpandableListView.getPackedPositionType(0L);
                Object[] objArr3 = new Object[1];
                a(r11[53], r11[5], (byte) (-$$a[27]), objArr3);
                objRemoteActionCompatParcelizer2 = startForeground.read(cLastIndexOf, iRed2, packedPositionType, -1033747278, false, (String) objArr3[0], null);
            }
            objArr = (Object[]) ((Field) objRemoteActionCompatParcelizer2).get(null);
            int i4 = AudioAttributesCompatParcelizer + 121;
            MediaBrowserCompatItemReceiver = i4 % 128;
            int i5 = i4 % 2;
        } else {
            Object[] objArr4 = new Object[1];
            b((char) (ExpandableListView.getPackedPositionChild(0L) + 17460), Color.alpha(0), 15 - TextUtils.indexOf((CharSequence) "", '0'), objArr4);
            Class<?> cls = Class.forName((String) objArr4[0]);
            Object[] objArr5 = new Object[1];
            b((char) (ExpandableListView.getPackedPositionType(0L) + 49633), Drawable.resolveOpacity(0, 0) + 16, 15 - TextUtils.indexOf((CharSequence) "", '0', 0, 0), objArr5);
            try {
                Object[] objArr6 = {Integer.valueOf(((Integer) cls.getMethod((String) objArr5[0], Object.class).invoke(null, this)).intValue()), 0, 73320767};
                byte[] bArr = $$d;
                byte b2 = bArr[19];
                byte b3 = bArr[11];
                Object[] objArr7 = new Object[1];
                c(b2, b3, (byte) (b3 + 1), objArr7);
                Class<?> cls2 = Class.forName((String) objArr7[0]);
                byte b4 = bArr[19];
                byte b5 = (byte) (b4 - 1);
                Object[] objArr8 = new Object[1];
                c(b5, (byte) (b5 | 44), b4, objArr8);
                objArr = (Object[]) cls2.getMethod((String) objArr8[0], Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr6);
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1137999833);
                if (objRemoteActionCompatParcelizer3 == null) {
                    char cResolveSizeAndState = (char) (View.resolveSizeAndState(0, 0, 0) + 13183);
                    int iIndexOf = 1649 - TextUtils.indexOf("", "");
                    int i6 = 27 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1));
                    Object[] objArr9 = new Object[1];
                    a(r9[53], r9[5], (byte) (-$$a[27]), objArr9);
                    objRemoteActionCompatParcelizer3 = startForeground.read(cResolveSizeAndState, iIndexOf, i6, -1033747278, false, (String) objArr9[0], null);
                }
                ((Field) objRemoteActionCompatParcelizer3).set(null, objArr);
                try {
                    Object[] objArr10 = new Object[1];
                    b((char) (TextUtils.indexOf((CharSequence) "", '0') + 63456), (ViewConfiguration.getTapTimeout() >> 16) + 32, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 22, objArr10);
                    Class<?> cls3 = Class.forName((String) objArr10[0]);
                    Object[] objArr11 = new Object[1];
                    b((char) Color.red(0), 54 - (ViewConfiguration.getWindowTouchSlop() >> 8), KeyEvent.normalizeMetaState(0) + 15, objArr11);
                    long jLongValue = ((Long) cls3.getDeclaredMethod((String) objArr11[0], new Class[0]).invoke(null, new Object[0])).longValue();
                    Long lValueOf = Long.valueOf(jLongValue);
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(2104791916);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char cAlpha = (char) (Color.alpha(0) + 13183);
                        int i7 = (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 1649;
                        int iRed3 = 26 - Color.red(0);
                        byte[] bArr2 = $$a;
                        byte b6 = bArr2[53];
                        byte b7 = bArr2[5];
                        Object[] objArr12 = new Object[1];
                        a(b6, b7, (byte) (b7 | TarConstants.LF_GNUTYPE_LONGNAME), objArr12);
                        objRemoteActionCompatParcelizer4 = startForeground.read(cAlpha, i7, iRed3, 54351865, false, (String) objArr12[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, lValueOf);
                    Long lValueOf2 = Long.valueOf(jLongValue >> 12);
                    Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-2042479539);
                    if (objRemoteActionCompatParcelizer5 == null) {
                        char jumpTapTimeout = (char) (13183 - (ViewConfiguration.getJumpTapTimeout() >> 16));
                        int iResolveOpacity = 1649 - Drawable.resolveOpacity(0, 0);
                        int i8 = (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 25;
                        byte b8 = $$a[5];
                        Object[] objArr13 = new Object[1];
                        a(b8, r4[53], b8, objArr13);
                        objRemoteActionCompatParcelizer5 = startForeground.read(jumpTapTimeout, iResolveOpacity, i8, -133433128, false, (String) objArr13[0], null);
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
        int i9 = ((int[]) objArr[3])[0];
        int i10 = ((int[]) objArr[2])[0];
        if (i10 != i9) {
            long j = -1;
            long j2 = ((long) (i9 ^ i10)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)));
            long j3 = 0;
            long j4 = j2 | (((long) 2) << 32) | (j3 - ((j3 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer6 == null) {
                    objRemoteActionCompatParcelizer6 = startForeground.read((char) (Color.rgb(0, 0, 0) + 16781751), 6053 - ExpandableListView.getPackedPositionChild(0L), TextUtils.getTrimmedLength("") + 42, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer6).invoke(null, null);
                ArrayList arrayList = new ArrayList();
                String strRemoteActionCompatParcelizer = TrainingApplication.RemoteActionCompatParcelizer();
                int i11 = AudioAttributesCompatParcelizer + 67;
                MediaBrowserCompatItemReceiver = i11 % 128;
                int i12 = i11 % 2;
                try {
                    Object[] objArr14 = {-848409014, Long.valueOf(j4), arrayList, strRemoteActionCompatParcelizer, true};
                    Class cls4 = (Class) startForeground.IconCompatParcelizer((char) Color.argb(0, 0, 0, 0), 6030 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 23 - ((byte) KeyEvent.getModifierMetaStateMask()));
                    byte b9 = $$d[19];
                    byte b10 = (byte) (b9 - 1);
                    Object[] objArr15 = new Object[1];
                    c(b10, (byte) (b10 | 44), b9, objArr15);
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
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i13 = AudioAttributesCompatParcelizer + 113;
            MediaBrowserCompatItemReceiver = i13 % 128;
            int i14 = i13 % 2;
            setCancelable(arguments.getBoolean("back_press_allow_key"));
        }
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        SaveAccountLinkingTokenResult saveAccountLinkingTokenResult = (SaveAccountLinkingTokenResult) objArr[0];
        LayoutInflater layoutInflater = (LayoutInflater) objArr[1];
        ViewGroup viewGroup = (ViewGroup) objArr[2];
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 27;
        MediaBrowserCompatItemReceiver = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(layoutInflater, "");
            saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer = getCacheKey.IconCompatParcelizer(layoutInflater, viewGroup);
            CardView cardViewIconCompatParcelizer = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().IconCompatParcelizer();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(cardViewIconCompatParcelizer, "");
            return cardViewIconCompatParcelizer;
        }
        toMagicModuleMetaRepoModel.write(layoutInflater, "");
        saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer = getCacheKey.IconCompatParcelizer(layoutInflater, viewGroup);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().IconCompatParcelizer(), "");
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 55;
        AudioAttributesCompatParcelizer = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            super.onViewCreated(p0, p1);
            write();
        } else {
            toMagicModuleMetaRepoModel.write(p0, "");
            super.onViewCreated(p0, p1);
            write();
            int i3 = 16 / 0;
        }
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        SaveAccountLinkingTokenResult saveAccountLinkingTokenResult = (SaveAccountLinkingTokenResult) objArr[0];
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 31;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        updateNavigation updatenavigation = updateNavigation.INSTANCE;
        updateNavigation.read(saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer);
        int i4 = MediaBrowserCompatItemReceiver + 11;
        AudioAttributesCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static final void MediaBrowserCompatCustomActionResultReceiver(SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 11;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        MaterialCardView materialCardView = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView, "");
        TextView textView = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer(true, materialCardView, textView);
        MaterialCardView materialCardView2 = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView2, "");
        TextView textView2 = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer(false, materialCardView2, textView2);
        MaterialCardView materialCardView3 = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView3, "");
        TextView textView3 = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
        saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer(false, materialCardView3, textView3);
        int i4 = AudioAttributesCompatParcelizer + 31;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 23 / 0;
        }
    }

    private static final void MediaBrowserCompatItemReceiver(SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 9;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        MaterialCardView materialCardView = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView, "");
        TextView textView = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer(false, materialCardView, textView);
        MaterialCardView materialCardView2 = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView2, "");
        TextView textView2 = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer(true, materialCardView2, textView2);
        MaterialCardView materialCardView3 = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView3, "");
        TextView textView3 = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
        saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer(false, materialCardView3, textView3);
        int i4 = MediaBrowserCompatItemReceiver + 3;
        AudioAttributesCompatParcelizer = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void AudioAttributesImplApi26Parcelizer(SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 93;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        MaterialCardView materialCardView = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView, "");
        TextView textView = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer(false, materialCardView, textView);
        MaterialCardView materialCardView2 = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView2, "");
        TextView textView2 = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer(false, materialCardView2, textView2);
        MaterialCardView materialCardView3 = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView3, "");
        TextView textView3 = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
        saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer(true, materialCardView3, textView3);
        int i4 = AudioAttributesCompatParcelizer + 91;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void MediaBrowserCompatSearchResultReceiver(SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 35;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        saveAccountLinkingTokenResult.dismiss();
        int i4 = AudioAttributesCompatParcelizer + 51;
        MediaBrowserCompatItemReceiver = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void write() throws Throwable {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 117;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        MaterialCardView materialCardView = AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView, "");
        TextView textView = AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        AudioAttributesCompatParcelizer(true, materialCardView, textView);
        MaterialCardView materialCardView2 = AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView2, "");
        TextView textView2 = AudioAttributesCompatParcelizer().MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        AudioAttributesCompatParcelizer(false, materialCardView2, textView2);
        MaterialCardView materialCardView3 = AudioAttributesCompatParcelizer().AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(materialCardView3, "");
        TextView textView3 = AudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
        AudioAttributesCompatParcelizer(false, materialCardView3, textView3);
        TrainingApplication trainingApplicationIconCompatParcelizer = TrainingApplication.IconCompatParcelizer(getContext());
        String nationalNumber = trainingApplicationIconCompatParcelizer.getLoggedUser().getInfo().getPhoneNumber().getNationalNumber();
        String countryCode = trainingApplicationIconCompatParcelizer.getLoggedUser().getInfo().getPhoneNumber().getCountryCode();
        String str = nationalNumber;
        if (str != null && str.length() != 0) {
            int i4 = MediaBrowserCompatItemReceiver + 115;
            AudioAttributesCompatParcelizer = i4 % 128;
            int i5 = i4 % 2;
            AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer.setText(str);
            AudioAttributesCompatParcelizer().read.setText("+".concat(String.valueOf(countryCode)));
            AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer.setSelection(nationalNumber.length());
        }
        AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer.postDelayed(new Runnable() { // from class: o.setTokenType
            @Override // java.lang.Runnable
            public final void run() {
                SaveAccountLinkingTokenResult.read(this.AudioAttributesCompatParcelizer);
            }
        }, 200L);
        AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.setServiceId
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SaveAccountLinkingTokenResult.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer);
            }
        });
        AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.SavePasswordResult
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object[] objArr = {this.read};
                int i6 = setSubject.onPlay.read();
                int i7 = setSubject.onPlay.read();
                SaveAccountLinkingTokenResult.read(-1652436117, i6, setSubject.onPlay.read(), setSubject.onPlay.read(), 1652436117, objArr, i7);
            }
        });
        AudioAttributesCompatParcelizer().AudioAttributesImplBaseParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.beginSignIn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SaveAccountLinkingTokenResult.AudioAttributesImplApi21Parcelizer(this.IconCompatParcelizer);
            }
        });
        AudioAttributesCompatParcelizer().IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.setSignInPassword
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SaveAccountLinkingTokenResult.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
        AudioAttributesCompatParcelizer().write.setOnClickListener(new View.OnClickListener() { // from class: o.SavePasswordRequestBuilder
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SaveAccountLinkingTokenResult.write(this.AudioAttributesCompatParcelizer);
            }
        });
    }

    private static final void MediaMetadataCompat(SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) {
        CharSequence text;
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 49;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        dispatchTouchEvent.read(saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer);
        dispatchTouchEvent.read(saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().read);
        saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().write.requestFocus();
        String string = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer.getText().toString();
        String string2 = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().read.getText().toString();
        int i4 = dispatchTouchEvent.read(string2, string);
        if (i4 == 200) {
            Object obj = null;
            saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().read.setError(null);
            saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer.setError(null);
            if (saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer.isSelected()) {
                text = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer.getText();
            } else if (saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer.isSelected()) {
                int i5 = AudioAttributesCompatParcelizer + 9;
                MediaBrowserCompatItemReceiver = i5 % 128;
                if (i5 % 2 == 0) {
                    saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().MediaBrowserCompatItemReceiver.getText();
                    obj.hashCode();
                    throw null;
                }
                text = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().MediaBrowserCompatItemReceiver.getText();
            } else {
                text = saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver.getText();
            }
            withAlwaysAsId.read(saveAccountLinkingTokenResult, "dialog_key", _getIndexResolver.write(setAction.write("on_error", Boolean.FALSE), setAction.write("BUTTON_COUNTRY_CODE", string2), setAction.write("BUTTON_PHONE", string), setAction.write("BUTTON_SLOT", text)));
            saveAccountLinkingTokenResult.dismiss();
            return;
        }
        switch (i4) {
            case 101:
                String string3 = saveAccountLinkingTokenResult.getString(R.string.error_country_code_empty);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(saveAccountLinkingTokenResult, string3, 0);
                saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().read.requestFocus();
                return;
            case 102:
                String string4 = saveAccountLinkingTokenResult.getString(R.string.error_country_code_invalid);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
                CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(saveAccountLinkingTokenResult, string4, 0);
                saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().read.requestFocus();
                return;
            case 103:
                saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer.setError(saveAccountLinkingTokenResult.getString(R.string.error_phone_number_empty));
                saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer.requestFocus();
                return;
            case 104:
                saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer.setError(saveAccountLinkingTokenResult.getString(R.string.error_phone_number_invalid));
                saveAccountLinkingTokenResult.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer.requestFocus();
                return;
            default:
                return;
        }
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 21;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroyView();
        this.AudioAttributesCompatParcelizer = null;
        int i4 = MediaBrowserCompatItemReceiver + 29;
        AudioAttributesCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void AudioAttributesCompatParcelizer(boolean p0, MaterialCardView p1, TextView p2) {
        int i;
        int i2 = 2 % 2;
        if (!p0) {
            i = R.attr.colorSurface;
        } else {
            int i3 = AudioAttributesCompatParcelizer + 107;
            int i4 = i3 % 128;
            MediaBrowserCompatItemReceiver = i4;
            int i5 = i3 % 2;
            int i6 = i4 + 53;
            AudioAttributesCompatParcelizer = i6 % 128;
            int i7 = i6 % 2;
            i = R.attr.colorSurfaceVariant12;
        }
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        int i8 = shouldEscapeCharacter.Companion.read(contextRequireContext, i, new TypedValue(), true);
        shouldEscapeCharacter.Companion companion2 = shouldEscapeCharacter.INSTANCE;
        Context contextRequireContext2 = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
        int i9 = shouldEscapeCharacter.Companion.read(contextRequireContext2, R.attr.colorOnSurface, new TypedValue(), true);
        p1.setCardBackgroundColor(i8);
        p2.setTextColor(i9);
        p1.setSelected(p0);
    }

    public static /* synthetic */ void read(SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 37;
        AudioAttributesCompatParcelizer = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = setSubject.onPlay.read();
            int i4 = setSubject.onPlay.read();
            int i5 = setSubject.onPlay.read();
            read(1164206500, i3, setSubject.onPlay.read(), i5, -1164206498, new Object[]{saveAccountLinkingTokenResult}, i4);
            throw null;
        }
        int i6 = setSubject.onPlay.read();
        int i7 = setSubject.onPlay.read();
        int i8 = setSubject.onPlay.read();
        read(1164206500, i6, setSubject.onPlay.read(), i8, -1164206498, new Object[]{saveAccountLinkingTokenResult}, i7);
        int i9 = AudioAttributesCompatParcelizer + 11;
        MediaBrowserCompatItemReceiver = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 34 / 0;
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 59;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        MediaBrowserCompatCustomActionResultReceiver(saveAccountLinkingTokenResult);
        int i4 = MediaBrowserCompatItemReceiver + 23;
        AudioAttributesCompatParcelizer = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void IconCompatParcelizer(SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) {
        int i = setSubject.onPlay.read();
        int i2 = setSubject.onPlay.read();
        int i3 = setSubject.onPlay.read();
        read(-1652436117, i, setSubject.onPlay.read(), i3, 1652436117, new Object[]{saveAccountLinkingTokenResult}, i2);
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer(SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 105;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        MediaBrowserCompatSearchResultReceiver(saveAccountLinkingTokenResult);
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void write(SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 3;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        MediaMetadataCompat(saveAccountLinkingTokenResult);
        if (i3 != 0) {
            throw null;
        }
        int i4 = MediaBrowserCompatItemReceiver + 15;
        AudioAttributesCompatParcelizer = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void AudioAttributesImplApi21Parcelizer(SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) {
        int i = 2 % 2;
        int i2 = AudioAttributesCompatParcelizer + 31;
        MediaBrowserCompatItemReceiver = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesImplApi26Parcelizer(saveAccountLinkingTokenResult);
        if (i3 == 0) {
            int i4 = 48 / 0;
        }
        int i5 = MediaBrowserCompatItemReceiver + 101;
        AudioAttributesCompatParcelizer = i5 % 128;
        int i6 = i5 % 2;
    }

    static {
        MediaBrowserCompatCustomActionResultReceiver = 1;
        IconCompatParcelizer();
        INSTANCE = new Companion(null);
        int i = AudioAttributesImplApi26Parcelizer + 13;
        MediaBrowserCompatCustomActionResultReceiver = i % 128;
        if (i % 2 == 0) {
            int i2 = 71 / 0;
        }
    }

    private static final void AudioAttributesImplBaseParcelizer(SaveAccountLinkingTokenResult saveAccountLinkingTokenResult) {
        int i = setSubject.onPlay.read();
        int i2 = setSubject.onPlay.read();
        int i3 = setSubject.onPlay.read();
        read(1164206500, i, setSubject.onPlay.read(), i3, -1164206498, new Object[]{saveAccountLinkingTokenResult}, i2);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        int i = setSubject.onPlay.read();
        int i2 = setSubject.onPlay.read();
        int i3 = setSubject.onPlay.read();
        return (View) read(747806744, i, setSubject.onPlay.read(), i3, -747806743, new Object[]{this, p0, p1, p2}, i2);
    }

    static void IconCompatParcelizer() {
        write = new char[]{38997, 45906, 52817, 6522, 13345, 20335, 39446, 46341, 49208, 7037, 13844, 16834, 40156, 47063, 49906, 7654, 7556, 13957, 19344, 40103, 45481, 51896, 8145, 12480, 17861, 40672, 46054, 50177, 6462, 12830, 18209, 38972, 11186, 177, 32175, 43653, 34700, 64646, 10751, 1705, 29660, 43212, 34181, 61956, 12090, 1084, 28943, 44546, 39806, 61532, 11623, 6744, 30528, 44100, 56425, 63340, 35445, 23896, 28751, 2901, 56864, 61706, 33801, 24321, 29208, 1532, 55541, 62461, 34497};
        IconCompatParcelizer = -5623616817433217280L;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        SaveAccountLinkingTokenResult saveAccountLinkingTokenResult = (SaveAccountLinkingTokenResult) objArr[0];
        int i = 2 % 2;
        int i2 = MediaBrowserCompatItemReceiver + 105;
        AudioAttributesCompatParcelizer = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        MediaBrowserCompatItemReceiver(saveAccountLinkingTokenResult);
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = AudioAttributesCompatParcelizer + 93;
        MediaBrowserCompatItemReceiver = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }
}
