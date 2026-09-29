package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import com.clevertap.android.sdk.CTInboxStyleConfig;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.inbox.CTInboxMessage;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.tabs.TabLayout;
import com.marrow.R;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import kotlin.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
public class SimpleBasePlayerPlaceholderUid extends maybeGetTypeVariable implements SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.RemoteActionCompatParcelizer, Rarray {
    private static int $10 = 0;
    private static int $11 = 1;
    public static int read;
    private PlayerTimelineChangeReason AudioAttributesCompatParcelizer;
    private WeakReference<write> AudioAttributesImplApi21Parcelizer;
    private ViewPager AudioAttributesImplApi26Parcelizer;
    private TabLayout AudioAttributesImplBaseParcelizer;
    private CleverTapInstanceConfig IconCompatParcelizer;
    private getTunnelingSupport MediaBrowserCompatCustomActionResultReceiver;
    private CTInboxStyleConfig MediaBrowserCompatItemReceiver;
    private PlayerEvents RemoteActionCompatParcelizer = null;
    private access3700 write;
    private static final byte[] $$d = {98, 126, 62, 90, 68, -54, 5, -12, TarConstants.LF_FIFO, -32, -3, -8, 5, 2, 18, 4, 18, -24, 0, 2, 5, 16, 7, -9, 42, -38, 0, 8, 15, -16, -16, -5, 1, -2, 18, 39, -31, -14, 14, -3, 4, 46, -41, 5, 0, 18, -16, 39, -14, -14, 18, 1, -4, 6, -14, 24, -10, -9, 5, 66, -54, -5, 3, 11, -2, 10, 58, -48, -10, 13, -11, 6, 9, 8, 57, -54, -3, -3, 72, -50, -9, 5, 3, 1, 4, 67, -68, 4, 14, 0, 65, -73, 3, 28, 16, 7, 0};
    private static final int $$e = 71;
    private static final byte[] $$a = {66, 100, 74, -7, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 160;
    private static int onAddQueueItem = 0;
    private static int onCommand = 1;
    private static char[] MediaDescriptionCompat = {28350, 28339, 28349, 28239, 28336, 28342, 28403, 28236, 28305, 28348, 28346, 28337, 28318, 28237, 28235, 28230, 28333, 28345, 28298, 28401, 28347, 28351, 28301, 28299, 28300, 28294, 28297, 28302, 28303, 28296, 28343, 28341, 28344, 28332, 28338, 28335};
    private static int RatingCompat = 411397825;
    private static boolean MediaMetadataCompat = true;
    private static boolean MediaBrowserCompatSearchResultReceiver = true;
    private static int MediaBrowserCompatMediaItem = 1000326260;

    public interface write {
        void AudioAttributesCompatParcelizer(CTInboxMessage cTInboxMessage, Bundle bundle);

        void write(CTInboxMessage cTInboxMessage, Bundle bundle, HashMap<String, String> map);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(int r6, int r7, byte r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            int r0 = 44 - r7
            int r8 = r8 + 65
            byte[] r1 = kotlin.SimpleBasePlayerPlaceholderUid.$$a
            byte[] r0 = new byte[r0]
            int r7 = 43 - r7
            r2 = 0
            if (r1 != 0) goto L13
            r4 = r8
            r3 = r2
            r8 = r6
            goto L28
        L13:
            r3 = r2
            r5 = r8
            r8 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r6
            r0[r3] = r4
            if (r3 != r7) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r0, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r1[r8]
        L28:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-1)
            int r8 = r8 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SimpleBasePlayerPlaceholderUid.c(int, int, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void d(byte r6, int r7, int r8, java.lang.Object[] r9) {
        /*
            int r6 = 93 - r6
            int r8 = 38 - r8
            int r7 = 114 - r7
            byte[] r0 = kotlin.SimpleBasePlayerPlaceholderUid.$$d
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r3 = r7
            r4 = r2
            r7 = r6
            goto L2a
        L11:
            r3 = r2
        L12:
            byte r4 = (byte) r7
            int r6 = r6 + 1
            r1[r3] = r4
            int r3 = r3 + 1
            if (r3 != r8) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r4 = r0[r6]
            r5 = r7
            r7 = r6
            r6 = r4
            r4 = r3
            r3 = r5
        L2a:
            int r6 = -r6
            int r3 = r3 + r6
            int r6 = r3 + 3
            r3 = r4
            r5 = r7
            r7 = r6
            r6 = r5
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SimpleBasePlayerPlaceholderUid.d(byte, int, int, java.lang.Object[]):void");
    }

    private static void b(int i, int i2, boolean z, char[] cArr, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i2];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        int i5 = $10 + 87;
        $11 = i5 % 128;
        int i6 = i5 % 2;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i7 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i7]), Integer.valueOf(MediaBrowserCompatMediaItem)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) View.resolveSize(0, 0), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 23704, TextUtils.indexOf("", "", 0, 0) + 32, -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i7] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (MotionEvent.axisFromString("") + 44863), (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 18943, 29 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1836173544, false, "c", new Class[]{Object.class, Object.class});
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
        if (i3 > 0) {
            int i8 = $10 + 17;
            $11 = i8 % 128;
            int i9 = i8 % 2;
            cleardownloadmanagerhelpers.write = i3;
            char[] cArr3 = new char[i2];
            System.arraycopy(cArr2, 0, cArr3, 0, i2);
            System.arraycopy(cArr3, 0, cArr2, i2 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i2 - cleardownloadmanagerhelpers.write);
        }
        if (z) {
            int i10 = $10 + 23;
            $11 = i10 % 128;
            int i11 = i10 % 2;
            char[] cArr4 = new char[i2];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i2) {
                int i12 = $10 + 97;
                $11 = i12 % 128;
                int i13 = i12 % 2;
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i2 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (44861 - TextUtils.indexOf((CharSequence) "", '0')), (ViewConfiguration.getScrollBarSize() >> 8) + 18944, (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)) + 29, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        String str = new String(cArr2);
        int i14 = $11 + 41;
        $10 = i14 % 128;
        int i15 = i14 % 2;
        objArr[0] = str;
    }

    private static void a(int i, byte[] bArr, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = MediaDescriptionCompat;
        if (cArr2 != null) {
            int i3 = $11 + 121;
            $10 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (44862 - Color.alpha(0)), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 18944, (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 28, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
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
        Object[] objArr3 = {Integer.valueOf(RatingCompat)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1))), View.MeasureSpec.getMode(0) + 19033, (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 75, 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        if (MediaBrowserCompatSearchResultReceiver) {
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                int i6 = $10 + 35;
                $11 = i6 % 128;
                int i7 = i6 % 2;
                cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr4 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((-1) - ImageFormat.getBitsPerPixel(0)), Drawable.resolveOpacity(0, 0) + 11439, 14 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!MediaMetadataCompat) {
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
        notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            int i8 = $11 + 7;
            $10 = i8 % 128;
            int i9 = i8 % 2;
            cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
            Object[] objArr5 = {notifydownloads, notifydownloads};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) View.MeasureSpec.getMode(0), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 11439, TextUtils.getOffsetAfter("", 0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x00e0  */
    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r32) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 3212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SimpleBasePlayerPlaceholderUid.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00dc  */
    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SimpleBasePlayerPlaceholderUid.onResume():void");
    }

    @Override // kotlin.Rarray
    public final void read(boolean z) {
        int i = 2 % 2;
        int i2 = onCommand + 79;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        getTunnelingSupport gettunnelingsupport = this.MediaBrowserCompatCustomActionResultReceiver;
        if (gettunnelingsupport != null) {
            gettunnelingsupport.RemoteActionCompatParcelizer(this, z);
        }
        int i4 = onAddQueueItem + 47;
        onCommand = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // kotlin.Rarray
    public final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = onCommand + 69;
        int i3 = i2 % 128;
        onAddQueueItem = i3;
        int i4 = i2 % 2;
        getTunnelingSupport gettunnelingsupport = this.MediaBrowserCompatCustomActionResultReceiver;
        if (gettunnelingsupport != null) {
            int i5 = i3 + 11;
            onCommand = i5 % 128;
            int i6 = i5 % 2;
            gettunnelingsupport.RemoteActionCompatParcelizer(this);
        }
        int i7 = onCommand + 115;
        onAddQueueItem = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        int i2 = 2 % 2;
        super.onRequestPermissionsResult(i, strArr, iArr);
        getTunnelingSupport gettunnelingsupport = this.MediaBrowserCompatCustomActionResultReceiver;
        if (gettunnelingsupport != null) {
            int i3 = onAddQueueItem + 3;
            onCommand = i3 % 128;
            int i4 = i3 % 2;
            gettunnelingsupport.write(this, i, iArr);
            int i5 = onCommand + 67;
            onAddQueueItem = i5 % 128;
            int i6 = i5 % 2;
        }
        int i7 = onAddQueueItem + 63;
        onCommand = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // kotlin.maybeGetTypeVariable, android.app.Activity
    public void onDestroy() {
        Iterator<Fragment> it;
        int i = 2 % 2;
        int i2 = onAddQueueItem + 21;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver().AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer((Activity) null);
        if (this.MediaBrowserCompatItemReceiver.MediaBrowserCompatSearchResultReceiver()) {
            int i4 = onAddQueueItem + 39;
            onCommand = i4 % 128;
            if (i4 % 2 == 0) {
                it = getSupportFragmentManager().handleMediaPlayPauseIfPendingOnHandler().iterator();
                int i5 = 9 / 0;
            } else {
                it = getSupportFragmentManager().handleMediaPlayPauseIfPendingOnHandler().iterator();
            }
            int i6 = onAddQueueItem + 79;
            onCommand = i6 % 128;
            int i7 = i6 % 2;
            while (it.hasNext()) {
                int i8 = onAddQueueItem + 125;
                onCommand = i8 % 128;
                int i9 = i8 % 2;
                Fragment next = it.next();
                if (next instanceof SimpleBasePlayerPositionSupplierExternalSyntheticLambda0) {
                    next.toString();
                    RendererWakeupListener.MediaMetadataCompat();
                    getSupportFragmentManager().handleMediaPlayPauseIfPendingOnHandler().remove(next);
                }
            }
        }
        super.onDestroy();
    }

    @Override // o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.RemoteActionCompatParcelizer
    public final void AudioAttributesCompatParcelizer(int i, CTInboxMessage cTInboxMessage, Bundle bundle, HashMap<String, String> map, int i2) {
        int i3 = 2 % 2;
        int i4 = onCommand + 29;
        onAddQueueItem = i4 % 128;
        int i5 = i4 % 2;
        AudioAttributesCompatParcelizer(bundle, i, cTInboxMessage, map, i2);
        int i6 = onCommand + 77;
        onAddQueueItem = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // o.SimpleBasePlayerPositionSupplierExternalSyntheticLambda0.RemoteActionCompatParcelizer
    public final void write(CTInboxMessage cTInboxMessage, Bundle bundle) {
        int i = 2 % 2;
        cTInboxMessage.write();
        RendererWakeupListener.MediaMetadataCompat();
        Object obj = null;
        IconCompatParcelizer(null, cTInboxMessage);
        int i2 = onAddQueueItem + 13;
        onCommand = i2 % 128;
        if (i2 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private void AudioAttributesCompatParcelizer(Bundle bundle, int i, CTInboxMessage cTInboxMessage, HashMap<String, String> map, int i2) {
        int i3 = 2 % 2;
        write writeVarAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (writeVarAudioAttributesCompatParcelizer != null) {
            int i4 = onAddQueueItem + 3;
            onCommand = i4 % 128;
            int i5 = i4 % 2;
            writeVarAudioAttributesCompatParcelizer.write(cTInboxMessage, bundle, map);
        }
        int i6 = onCommand + 85;
        onAddQueueItem = i6 % 128;
        int i7 = i6 % 2;
    }

    private void IconCompatParcelizer(Bundle bundle, CTInboxMessage cTInboxMessage) {
        int i = 2 % 2;
        Objects.toString(bundle);
        cTInboxMessage.write();
        RendererWakeupListener.MediaMetadataCompat();
        write writeVarAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        if (writeVarAudioAttributesCompatParcelizer != null) {
            int i2 = onCommand + 15;
            onAddQueueItem = i2 % 128;
            int i3 = i2 % 2;
            writeVarAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(cTInboxMessage, bundle);
            if (i3 != 0) {
                int i4 = 8 / 0;
            }
            int i5 = onCommand + 123;
            onAddQueueItem = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private write AudioAttributesCompatParcelizer() {
        write writeVar;
        int i = 2 % 2;
        int i2 = onCommand + 115;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        try {
            writeVar = this.AudioAttributesImplApi21Parcelizer.get();
        } catch (Throwable unused) {
            writeVar = null;
        }
        if (writeVar == null) {
            int i4 = onCommand + 37;
            onAddQueueItem = i4 % 128;
            int i5 = i4 % 2;
            this.IconCompatParcelizer.MediaBrowserCompatItemReceiver().write(this.IconCompatParcelizer.write(), "InboxActivityListener is null for notification inbox ");
        }
        int i6 = onCommand + 101;
        onAddQueueItem = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 23 / 0;
        }
        return writeVar;
    }

    private void RemoteActionCompatParcelizer(write writeVar) {
        int i = 2 % 2;
        this.AudioAttributesImplApi21Parcelizer = new WeakReference<>(writeVar);
        int i2 = onCommand + 125;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
    }

    private String read() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(this.IconCompatParcelizer.write());
        sb.append(":CT_INBOX_LIST_VIEW_FRAGMENT");
        String string = sb.toString();
        int i2 = onAddQueueItem + 63;
        onCommand = i2 % 128;
        int i3 = i2 % 2;
        return string;
    }

    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        Object obj = null;
        if (baseContext == null) {
            int i2 = onAddQueueItem + 31;
            onCommand = i2 % 128;
            int i3 = i2 % 2;
            Object[] objArr = new Object[1];
            a(127 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), new byte[]{-125, -127, -117, -124, -110, -111, -112, -114, -122, -113, -122, -114, -118, -115, -121, -116, -116, -127, -121, -125, -122, -123, -124, -125, -126, -127}, null, null, objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            b(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_track_resolution).substring(0, 4).length() + 181, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(1) - 93, true, new char[]{65529, 4, 5, 65535, '\n', 65527, 65529, 65535, 2, 6, 6, 65495, '\n', 4, 65531, '\b', '\b', 11}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 34, objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
            int i4 = onCommand + 61;
            onAddQueueItem = i4 % 128;
            int i5 = i4 % 2;
        }
        if (baseContext != null) {
            int i6 = onCommand + 69;
            onAddQueueItem = i6 % 128;
            if (i6 % 2 != 0) {
                boolean z = baseContext instanceof ContextWrapper;
                obj.hashCode();
                throw null;
            }
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i7 = onAddQueueItem + 73;
                onCommand = i7 % 128;
                if (i7 % 2 == 0) {
                    int i8 = 5 % 3;
                }
            }
        }
        if (baseContext != null) {
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (4535 - (ViewConfiguration.getTapTimeout() >> 16)), 6054 - (ViewConfiguration.getScrollBarSize() >> 8), 43 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 6029, (ViewConfiguration.getScrollBarSize() >> 8) + 24, -861814097, false, "read", new Class[]{Context.class});
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
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0961 A[Catch: all -> 0x0a9a, TryCatch #14 {all -> 0x0a9a, blocks: (B:88:0x059a, B:90:0x05a0, B:91:0x05e0, B:93:0x05ec, B:95:0x05f5, B:96:0x0634, B:119:0x0957, B:120:0x095b, B:122:0x0961, B:124:0x0977, B:130:0x0991, B:132:0x0994, B:139:0x09f1, B:145:0x0a74, B:147:0x0a7a, B:148:0x0a7b, B:150:0x0a7d, B:152:0x0a84, B:153:0x0a85, B:97:0x063e, B:109:0x07d3, B:111:0x07d9, B:112:0x0818, B:114:0x08ba, B:115:0x08fe, B:117:0x0913, B:118:0x0951, B:155:0x0a87, B:157:0x0a8e, B:158:0x0a8f, B:160:0x0a91, B:162:0x0a98, B:163:0x0a99, B:104:0x0746, B:106:0x075a, B:107:0x07c8, B:99:0x06f9, B:101:0x070d, B:102:0x073f, B:141:0x09f6, B:135:0x09c3, B:137:0x09c9, B:138:0x09ea), top: B:296:0x059a, outer: #8, inners: #1, #10, #13, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0c04  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0c47  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0c96  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x0f34  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x1014  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x105e  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x110a  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x13a2  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x03a7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:309:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0444  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x00e5 A[PHI: r4
      0x00e5: PHI (r4v64 ??) = (r4v20 ??), (r4v18 ??) binds: [B:17:0x0103, B:5:0x00e2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x04e0 A[Catch: all -> 0x035b, TryCatch #16 {all -> 0x035b, blocks: (B:81:0x04da, B:83:0x04e0, B:84:0x0504, B:203:0x0f59, B:205:0x0f5f, B:206:0x0f80, B:245:0x13c7, B:247:0x13cd, B:248:0x13ef, B:226:0x117f, B:228:0x11a1, B:229:0x11ef, B:170:0x0b45, B:172:0x0b4b, B:173:0x0b6d, B:19:0x0108, B:21:0x010e, B:22:0x0134, B:24:0x02cd, B:26:0x02fe, B:27:0x0355), top: B:298:0x0108 }] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x05a0 A[Catch: all -> 0x0a9a, TryCatch #14 {all -> 0x0a9a, blocks: (B:88:0x059a, B:90:0x05a0, B:91:0x05e0, B:93:0x05ec, B:95:0x05f5, B:96:0x0634, B:119:0x0957, B:120:0x095b, B:122:0x0961, B:124:0x0977, B:130:0x0991, B:132:0x0994, B:139:0x09f1, B:145:0x0a74, B:147:0x0a7a, B:148:0x0a7b, B:150:0x0a7d, B:152:0x0a84, B:153:0x0a85, B:97:0x063e, B:109:0x07d3, B:111:0x07d9, B:112:0x0818, B:114:0x08ba, B:115:0x08fe, B:117:0x0913, B:118:0x0951, B:155:0x0a87, B:157:0x0a8e, B:158:0x0a8f, B:160:0x0a91, B:162:0x0a98, B:163:0x0a99, B:104:0x0746, B:106:0x075a, B:107:0x07c8, B:99:0x06f9, B:101:0x070d, B:102:0x073f, B:141:0x09f6, B:135:0x09c3, B:137:0x09c9, B:138:0x09ea), top: B:296:0x059a, outer: #8, inners: #1, #10, #13, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x05ec A[Catch: all -> 0x0a9a, TryCatch #14 {all -> 0x0a9a, blocks: (B:88:0x059a, B:90:0x05a0, B:91:0x05e0, B:93:0x05ec, B:95:0x05f5, B:96:0x0634, B:119:0x0957, B:120:0x095b, B:122:0x0961, B:124:0x0977, B:130:0x0991, B:132:0x0994, B:139:0x09f1, B:145:0x0a74, B:147:0x0a7a, B:148:0x0a7b, B:150:0x0a7d, B:152:0x0a84, B:153:0x0a85, B:97:0x063e, B:109:0x07d3, B:111:0x07d9, B:112:0x0818, B:114:0x08ba, B:115:0x08fe, B:117:0x0913, B:118:0x0951, B:155:0x0a87, B:157:0x0a8e, B:158:0x0a8f, B:160:0x0a91, B:162:0x0a98, B:163:0x0a99, B:104:0x0746, B:106:0x075a, B:107:0x07c8, B:99:0x06f9, B:101:0x070d, B:102:0x073f, B:141:0x09f6, B:135:0x09c3, B:137:0x09c9, B:138:0x09ea), top: B:296:0x059a, outer: #8, inners: #1, #10, #13, #17 }] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x063e A[Catch: all -> 0x0a9a, TRY_LEAVE, TryCatch #14 {all -> 0x0a9a, blocks: (B:88:0x059a, B:90:0x05a0, B:91:0x05e0, B:93:0x05ec, B:95:0x05f5, B:96:0x0634, B:119:0x0957, B:120:0x095b, B:122:0x0961, B:124:0x0977, B:130:0x0991, B:132:0x0994, B:139:0x09f1, B:145:0x0a74, B:147:0x0a7a, B:148:0x0a7b, B:150:0x0a7d, B:152:0x0a84, B:153:0x0a85, B:97:0x063e, B:109:0x07d3, B:111:0x07d9, B:112:0x0818, B:114:0x08ba, B:115:0x08fe, B:117:0x0913, B:118:0x0951, B:155:0x0a87, B:157:0x0a8e, B:158:0x0a8f, B:160:0x0a91, B:162:0x0a98, B:163:0x0a99, B:104:0x0746, B:106:0x075a, B:107:0x07c8, B:99:0x06f9, B:101:0x070d, B:102:0x073f, B:141:0x09f6, B:135:0x09c3, B:137:0x09c9, B:138:0x09ea), top: B:296:0x059a, outer: #8, inners: #1, #10, #13, #17 }] */
    /* JADX WARN: Type inference failed for: r14v33, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.reflect.Method] */
    /* JADX WARN: Type inference failed for: r4v18, types: [int] */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v39 */
    /* JADX WARN: Type inference failed for: r4v40 */
    /* JADX WARN: Type inference failed for: r4v41 */
    /* JADX WARN: Type inference failed for: r4v49, types: [java.lang.CharSequence, java.lang.String] */
    /* JADX WARN: Type inference failed for: r4v60, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r4v62 */
    /* JADX WARN: Type inference failed for: r4v63 */
    /* JADX WARN: Type inference failed for: r4v64 */
    /* JADX WARN: Type inference failed for: r4v65 */
    /* JADX WARN: Type inference failed for: r4v66 */
    /* JADX WARN: Type inference failed for: r4v67 */
    /* JADX WARN: Type inference failed for: r4v68 */
    /* JADX WARN: Type inference failed for: r4v69 */
    /* JADX WARN: Type inference failed for: r4v70 */
    /* JADX WARN: Type inference failed for: r4v71 */
    /* JADX WARN: Type inference failed for: r4v73 */
    /* JADX WARN: Type inference failed for: r4v74 */
    /* JADX WARN: Type inference failed for: r4v75 */
    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5766
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.SimpleBasePlayerPlaceholderUid.attachBaseContext(android.content.Context):void");
    }

    @Override // kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = onCommand + 9;
        onAddQueueItem = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = onAddQueueItem + 39;
        onCommand = i4 % 128;
        int i5 = i4 % 2;
    }
}
