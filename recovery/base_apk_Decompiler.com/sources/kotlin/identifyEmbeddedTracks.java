package kotlin;

import android.content.Context;
import android.graphics.PointF;
import android.media.AudioTrack;
import android.os.Process;
import android.os.StatFs;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import com.google.android.exoplayer2.util.TimestampAdjuster;
import com.google.android.exoplayer2.util.Util;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.io.File;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes3.dex */
public final class identifyEmbeddedTracks implements releaseDisabledStreams {
    private final File AudioAttributesCompatParcelizer;

    public identifyEmbeddedTracks(Context context) throws Throwable {
        try {
            Object[] objArr = {context};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-220465252);
            this.AudioAttributesCompatParcelizer = (File) ((Method) (objRemoteActionCompatParcelizer == null ? startForeground.read((char) ((ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 46566), (ViewConfiguration.getDoubleTapTimeout() >> 16) + 17245, (Process.myTid() >> 22) + 63, -1936575735, false, "write", new Class[]{Context.class}) : objRemoteActionCompatParcelizer)).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private long IconCompatParcelizer() {
        File file = this.AudioAttributesCompatParcelizer;
        return write(file != null ? file.getAbsolutePath() : null);
    }

    @Override // kotlin.releaseDisabledStreams
    public final void read(String str) throws Throwable {
        try {
            Object[] objArr = {this.AudioAttributesCompatParcelizer, ".marrow"};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(780100948);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 46566), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 17245, 63 - TextUtils.getOffsetBefore("", 0), 1345757633, false, "read", new Class[]{File.class, String.class});
            }
            File file = new File((File) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr), str);
            if (!file.exists() || file.listFiles() == null) {
                return;
            }
            Util.recursiveDelete(file);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    @Override // kotlin.releaseDisabledStreams
    public final boolean RemoteActionCompatParcelizer() {
        return IconCompatParcelizer() < 524288000;
    }

    @Override // kotlin.releaseDisabledStreams
    public final void IconCompatParcelizer(String[] strArr) throws Throwable {
        if (strArr == null || strArr.length == 0) {
            return;
        }
        for (String str : strArr) {
            read(str);
        }
    }

    private static long write(String str) {
        try {
            StatFs statFs = new StatFs(str);
            return statFs.getAvailableBlocksLong() * statFs.getBlockSizeLong();
        } catch (IllegalArgumentException unused) {
            return TimestampAdjuster.MODE_SHARED;
        }
    }
}
