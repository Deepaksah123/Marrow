package kotlin;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
final class hasOutputBuffer {
    private static WeakReference<hasOutputBuffer> write;
    private final Executor IconCompatParcelizer;
    private final SharedPreferences RemoteActionCompatParcelizer;
    private disableBypass read;

    private hasOutputBuffer(SharedPreferences sharedPreferences, Executor executor) {
        this.IconCompatParcelizer = executor;
        this.RemoteActionCompatParcelizer = sharedPreferences;
    }

    private void RemoteActionCompatParcelizer() {
        synchronized (this) {
            this.read = disableBypass.read(this.RemoteActionCompatParcelizer, "topic_operation_queue", ",", this.IconCompatParcelizer);
        }
    }

    public static hasOutputBuffer IconCompatParcelizer(Context context, Executor executor) {
        hasOutputBuffer hasoutputbuffer;
        synchronized (hasOutputBuffer.class) {
            WeakReference<hasOutputBuffer> weakReference = write;
            hasoutputbuffer = weakReference != null ? weakReference.get() : null;
            if (hasoutputbuffer == null) {
                hasoutputbuffer = new hasOutputBuffer(context.getSharedPreferences("com.google.android.gms.appid", 0), executor);
                hasoutputbuffer.RemoteActionCompatParcelizer();
                write = new WeakReference<>(hasoutputbuffer);
            }
        }
        return hasoutputbuffer;
    }

    final getAvailableCodecInfos AudioAttributesCompatParcelizer() {
        getAvailableCodecInfos getavailablecodecinfos;
        synchronized (this) {
            getavailablecodecinfos = getAvailableCodecInfos.read(this.read.RemoteActionCompatParcelizer());
        }
        return getavailablecodecinfos;
    }

    final boolean read(getAvailableCodecInfos getavailablecodecinfos) {
        boolean zRemoteActionCompatParcelizer;
        synchronized (this) {
            zRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer(getavailablecodecinfos.write());
        }
        return zRemoteActionCompatParcelizer;
    }
}
