package kotlin;

import android.graphics.Color;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.telephony.cdma.CdmaCellLocation;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.widget.Toolbar;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.kt.base.BaseDaggerActivity;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.getExtendedEsFrChar;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0011\u0010\f\u001a\u0004\u0018\u00010\u000bH&¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u000f\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0007\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0017\u0010\u0005"}, d2 = {"Lo/convertMessageToByteArray;", "Lo/getExtendedEsFrChar;", "P", "Lcom/marrow/kt/base/BaseDaggerActivity;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onPostCreate", "(Landroid/os/Bundle;)V", "Landroidx/appcompat/widget/Toolbar;", "onCommand", "()Landroidx/appcompat/widget/Toolbar;", "", "setTitle", "(Ljava/lang/CharSequence;)V", "", "(I)V", "Landroid/view/MenuItem;", "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class convertMessageToByteArray<P extends getExtendedEsFrChar> extends BaseDaggerActivity<P> {
    private static final byte[] $$l = {45, 96, -22, -65};
    private static final int $$o = 194;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$y = {77, 21, 89, -51, -51, TarConstants.LF_CHR, 47, -5, 33, 15, 12, -32, 65, -7, 16, 25, 18, 3, 20, 13, -19, 34, 29, 14, 3, 27, 33, 22, 16, 19, -1, -22, TarConstants.LF_NORMAL, 31, 3, 20, 13, -29, 58, 12, 17, -1, 33, -22, 31, 31, -1, 16, 21, 11, 31, -7, 27, -51, 71, 12, 29, -36, 59, 3, 35, -71, 43, 66, -3, 19, 20, -32, 65, 14, 12, 5, 7, 33, 13, -1, 28, -28, TarConstants.LF_SYMLINK, 17, 10, -28, 45, 32, 0, -7, 31, 31, -1, 16, 21, 11, 31, -7, 27, 9, 5, 25, -1};
    private static final int $$z = 103;
    private static final byte[] $$d = {61, 46, 102, -127, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -12, -3, 4, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14};
    private static final int $$e = 64;
    private static int MediaBrowserCompatCustomActionResultReceiver = 0;
    private static int MediaDescriptionCompat = 1;
    private static long IconCompatParcelizer = 5371702838292308667L;
    private static char[] RemoteActionCompatParcelizer = {28497, 28514, 28524, 28542, 28515, 28521, 28578, 28512, 28593, 28527, 28540, 28538, 28537, 28508, 28520, 28525, 28541, 28516, 28605, 28576, 28522, 28526, 28604, 28602, 28607, 28601, 28600, 28577, 28606, 28603, 28543, 28598, 28579, 28523, 28513, 28517, 28581, 28518, 28511, 28488, 28495, 28519};
    private static int AudioAttributesCompatParcelizer = 411398128;
    private static boolean read = true;
    private static boolean write = true;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0022 -> B:11:0x0026). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$r(int r5, byte r6, byte r7) {
        /*
            int r6 = r6 * 4
            int r0 = r6 + 1
            byte[] r1 = kotlin.convertMessageToByteArray.$$l
            int r7 = r7 + 4
            int r5 = r5 * 2
            int r5 = 121 - r5
            byte[] r0 = new byte[r0]
            r2 = 0
            if (r1 != 0) goto L14
            r4 = r6
            r3 = r2
            goto L26
        L14:
            r3 = r2
        L15:
            int r7 = r7 + 1
            byte r4 = (byte) r5
            r0[r3] = r4
            if (r3 != r6) goto L22
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            return r5
        L22:
            r4 = r1[r7]
            int r3 = r3 + 1
        L26:
            int r5 = r5 + r4
            goto L15
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.convertMessageToByteArray.$$r(int, byte, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0024). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(int r5, byte r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = 44 - r6
            byte[] r1 = kotlin.convertMessageToByteArray.$$d
            int r5 = 191 - r5
            int r7 = r7 + 65
            byte[] r0 = new byte[r0]
            int r6 = 43 - r6
            r2 = 0
            if (r1 != 0) goto L12
            r4 = r6
            r3 = r2
            goto L24
        L12:
            r3 = r2
        L13:
            byte r4 = (byte) r7
            r0[r3] = r4
            if (r3 != r6) goto L20
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L20:
            int r3 = r3 + 1
            r4 = r1[r5]
        L24:
            int r7 = r7 + r4
            int r7 = r7 + (-1)
            int r5 = r5 + 1
            goto L13
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.convertMessageToByteArray.g(int, byte, int, java.lang.Object[]):void");
    }

    private static void h(short s, int i, int i2, Object[] objArr) {
        byte[] bArr = $$y;
        int i3 = 119 - i;
        int i4 = 95 - s;
        byte[] bArr2 = new byte[43 - i2];
        int i5 = 42 - i2;
        int i6 = -1;
        if (bArr == null) {
            int i7 = i3 + i4;
            i4++;
            i3 = i7 - 14;
            i6 = -1;
        }
        while (true) {
            int i8 = i6 + 1;
            bArr2[i8] = (byte) i3;
            if (i8 == i5) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i4++;
            i3 = (i3 + bArr[i4]) - 14;
            i6 = i8;
        }
    }

    public abstract Toolbar onCommand();

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, android.app.Activity
    public void onPostCreate(Bundle p0) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 45;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onPostCreate(p0);
        IconCompatParcelizer(onCommand());
        setTitle(getIntent().getStringExtra("android.intent.extra.TITLE"));
        int i4 = MediaDescriptionCompat + 99;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // android.app.Activity
    public void setTitle(CharSequence p0) {
        int i = 2 % 2;
        super.setTitle(p0);
        ActionBar actionBarAs_ = as_();
        if (actionBarAs_ != null) {
            int i2 = MediaBrowserCompatCustomActionResultReceiver + 37;
            MediaDescriptionCompat = i2 % 128;
            int i3 = i2 % 2;
            actionBarAs_.RemoteActionCompatParcelizer(true);
        }
        ActionBar actionBarAs_2 = as_();
        if (actionBarAs_2 != null) {
            int i4 = MediaDescriptionCompat + 11;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            if (i4 % 2 != 0) {
                actionBarAs_2.MediaBrowserCompatCustomActionResultReceiver();
                throw null;
            }
            actionBarAs_2.MediaBrowserCompatCustomActionResultReceiver();
        }
        ActionBar actionBarAs_3 = as_();
        if (actionBarAs_3 != null) {
            if (p0 == null) {
                int i5 = MediaDescriptionCompat + 37;
                MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
                int i6 = i5 % 2;
            }
            actionBarAs_3.write(p0);
            int i7 = MediaBrowserCompatCustomActionResultReceiver + 111;
            MediaDescriptionCompat = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    @Override // android.app.Activity
    public void setTitle(int p0) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 17;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.setTitle(p0);
        ActionBar actionBarAs_ = as_();
        if (actionBarAs_ != null) {
            int i4 = MediaDescriptionCompat + 111;
            MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
            if (i4 % 2 != 0) {
                actionBarAs_.RemoteActionCompatParcelizer(true);
            } else {
                actionBarAs_.RemoteActionCompatParcelizer(true);
            }
        }
        ActionBar actionBarAs_2 = as_();
        if (actionBarAs_2 != null) {
            actionBarAs_2.MediaBrowserCompatCustomActionResultReceiver();
        }
        ActionBar actionBarAs_3 = as_();
        if (actionBarAs_3 != null) {
            int i5 = MediaDescriptionCompat + 39;
            MediaBrowserCompatCustomActionResultReceiver = i5 % 128;
            if (i5 % 2 != 0) {
                actionBarAs_3.AudioAttributesCompatParcelizer(p0);
                throw null;
            }
            actionBarAs_3.AudioAttributesCompatParcelizer(p0);
            int i6 = MediaDescriptionCompat + 71;
            MediaBrowserCompatCustomActionResultReceiver = i6 % 128;
            int i7 = i6 % 2;
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem p0) {
        int i = 2 % 2;
        int i2 = MediaBrowserCompatCustomActionResultReceiver + 33;
        MediaDescriptionCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            p0.getItemId();
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.getItemId() == 16908332) {
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            return true;
        }
        boolean zOnOptionsItemSelected = super.onOptionsItemSelected(p0);
        int i3 = MediaDescriptionCompat + 115;
        MediaBrowserCompatCustomActionResultReceiver = i3 % 128;
        if (i3 % 2 == 0) {
            return zOnOptionsItemSelected;
        }
        obj.hashCode();
        throw null;
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 3;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        onBackPressed();
        int i4 = MediaDescriptionCompat + 117;
        MediaBrowserCompatCustomActionResultReceiver = i4 % 128;
        int i5 = i4 % 2;
    }

    private static void e(int i, char[] cArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloadChanged notifydownloadchanged = new notifyDownloadChanged();
        notifydownloadchanged.read = i;
        int length = cArr.length;
        long[] jArr = new long[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i3 = notifydownloadchanged.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr[notifydownloadchanged.AudioAttributesCompatParcelizer]), notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1435583294);
                if (objRemoteActionCompatParcelizer == null) {
                    byte b = (byte) 0;
                    byte b2 = b;
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 38460), 532 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 8 - TextUtils.indexOf("", ""), -735610793, false, $$r(b, b2, (byte) (b2 - 1)), new Class[]{Integer.TYPE, Object.class, Object.class});
                }
                jArr[i3] = ((Long) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).longValue() ^ (IconCompatParcelizer ^ 2192498202983240651L);
                Object[] objArr3 = {notifydownloadchanged, notifydownloadchanged};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1971306176);
                if (objRemoteActionCompatParcelizer2 == null) {
                    byte b3 = (byte) 1;
                    byte b4 = (byte) (b3 - 1);
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (36620 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), Color.rgb(0, 0, 0) + 16779556, ExpandableListView.getPackedPositionChild(0L) + 29, 188119637, false, $$r(b3, b4, (byte) (b4 - 1)), new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                int i4 = $11 + 105;
                $10 = i4 % 128;
                int i5 = i4 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        char[] cArr2 = new char[length];
        notifydownloadchanged.AudioAttributesCompatParcelizer = 0;
        while (notifydownloadchanged.AudioAttributesCompatParcelizer < cArr.length) {
            int i6 = $11 + 33;
            $10 = i6 % 128;
            int i7 = i6 % 2;
            cArr2[notifydownloadchanged.AudioAttributesCompatParcelizer] = (char) jArr[notifydownloadchanged.AudioAttributesCompatParcelizer];
            Object[] objArr4 = {notifydownloadchanged, notifydownloadchanged};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1971306176);
            if (objRemoteActionCompatParcelizer3 == null) {
                byte b5 = (byte) 1;
                byte b6 = (byte) (b5 - 1);
                objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 36620), (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)) + 2339, 27 - ((byte) KeyEvent.getModifierMetaStateMask()), 188119637, false, $$r(b5, b6, (byte) (b6 - 1)), new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            int i8 = $10 + 13;
            $11 = i8 % 128;
            int i9 = i8 % 2;
        }
        objArr[0] = new String(cArr2);
    }

    private static void f(byte[] bArr, int i, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = RemoteActionCompatParcelizer;
        if (cArr2 != null) {
            int i3 = $10 + 61;
            $11 = i3 % 128;
            int i4 = i3 % 2;
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i5 = 0; i5 < length; i5++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i5])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (Process.getGidForName("") + 44863), 18945 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) + 28, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
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
        try {
            Object[] objArr3 = {Integer.valueOf(AudioAttributesCompatParcelizer)};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) - 1), 19033 - (ViewConfiguration.getJumpTapTimeout() >> 16), 75 - (ViewConfiguration.getScrollBarSize() >> 8), 1457087504, false, "r", new Class[]{Integer.TYPE});
            }
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
            int i6 = -1593953308;
            if (write) {
                notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
                char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
                notifydownloads.IconCompatParcelizer = 0;
                while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                    cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                    Object[] objArr4 = {notifydownloads, notifydownloads};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) Gravity.getAbsoluteGravity(0, 0), 11439 - (CdmaCellLocation.convertQuartSecToDecDegrees(0) > 0.0d ? 1 : (CdmaCellLocation.convertQuartSecToDecDegrees(0) == 0.0d ? 0 : -1)), 14 - (ViewConfiguration.getWindowTouchSlop() >> 8), -558368911, false, "q", new Class[]{Object.class, Object.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                    int i7 = $10 + 5;
                    $11 = i7 % 128;
                    int i8 = i7 % 2;
                }
                objArr[0] = new String(cArr4);
                return;
            }
            if (!read) {
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
                cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                Object[] objArr5 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(i6);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (ViewConfiguration.getWindowTouchSlop() >> 8), (ViewConfiguration.getPressedStateDuration() >> 16) + 11439, TextUtils.indexOf("", "", 0) + 14, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
                i6 = -1593953308;
            }
            String str = new String(cArr6);
            int i9 = $11 + 43;
            $10 = i9 % 128;
            int i10 = i9 % 2;
            objArr[0] = str;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 == null) {
                throw th2;
            }
            throw cause2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x00b7  */
    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onCreate(android.os.Bundle r26) {
        /*
            Method dump skipped, instruction units count: 2203
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.convertMessageToByteArray.onCreate(android.os.Bundle):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0071  */
    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onResume() {
        /*
            Method dump skipped, instruction units count: 319
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.convertMessageToByteArray.onResume():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00a3  */
    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onPause() {
        /*
            Method dump skipped, instruction units count: 337
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.convertMessageToByteArray.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x0a52 A[Catch: all -> 0x027c, TryCatch #15 {all -> 0x027c, blocks: (B:211:0x0e45, B:213:0x0e4b, B:214:0x0e74, B:247:0x1245, B:249:0x124b, B:250:0x1277, B:228:0x102d, B:230:0x104f, B:231:0x109c, B:178:0x0a4c, B:180:0x0a52, B:181:0x0a78, B:72:0x03bd, B:74:0x03c3, B:75:0x03ef, B:22:0x00be, B:24:0x00c4, B:25:0x00eb, B:27:0x01f2, B:29:0x0223, B:30:0x0276), top: B:297:0x00be }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0280  */
    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void attachBaseContext(android.content.Context r31) {
        /*
            Method dump skipped, instruction units count: 5333
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.convertMessageToByteArray.attachBaseContext(android.content.Context):void");
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public void onStart() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 85;
        MediaBrowserCompatCustomActionResultReceiver = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        int i4 = MediaBrowserCompatCustomActionResultReceiver + 87;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 69 / 0;
        }
    }
}
