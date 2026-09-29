package kotlin;

import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.ViewConfiguration;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class getRawResourceDataSource implements getCreatedOnDateMs {
    private /* synthetic */ Object AudioAttributesCompatParcelizer;
    private /* synthetic */ String IconCompatParcelizer;
    private /* synthetic */ String write;

    public /* synthetic */ getRawResourceDataSource(Object obj, String str, String str2) {
        this.AudioAttributesCompatParcelizer = obj;
        this.IconCompatParcelizer = str;
        this.write = str2;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() throws Throwable {
        try {
            Object[] objArr = {this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer, this.write};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1051239440);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) ((Process.getThreadPriority(0) + 20) >> 6), TextUtils.lastIndexOf("", '0', 0) + 19350, 20 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), -1088512155, false, "read", new Class[]{(Class) startForeground.IconCompatParcelizer((char) (1 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 19350 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), 19 - (ViewConfiguration.getPressedStateDuration() >> 16)), String.class, String.class});
            }
            return ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr);
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }
}
