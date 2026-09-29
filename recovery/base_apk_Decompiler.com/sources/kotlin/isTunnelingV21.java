package kotlin;

import com.google.android.gms.common.util.concurrent.NamedThreadFactory;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public final class isTunnelingV21 {
    static Executor read() {
        return write("Firebase-Messaging-File-Io");
    }

    private static Executor write(String str) {
        return new ThreadPoolExecutor(0, 1, 30L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new NamedThreadFactory(str));
    }

    static ScheduledExecutorService MediaBrowserCompatItemReceiver() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Topics-Io"));
    }

    public static ExecutorService RemoteActionCompatParcelizer() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Network-Io"));
    }

    static ExecutorService write() {
        return Executors.newSingleThreadExecutor(new NamedThreadFactory("Firebase-Messaging-Task"));
    }

    static ExecutorService AudioAttributesCompatParcelizer() {
        shouldContinueRendering shouldcontinuerenderingIconCompatParcelizer = resetOutputBuffer.IconCompatParcelizer();
        NamedThreadFactory namedThreadFactory = new NamedThreadFactory("Firebase-Messaging-Intent-Handle");
        setCodecDrmSession setcodecdrmsession = setCodecDrmSession.HIGH_SPEED;
        return shouldcontinuerenderingIconCompatParcelizer.write(namedThreadFactory);
    }

    static ScheduledExecutorService IconCompatParcelizer() {
        return new ScheduledThreadPoolExecutor(1, new NamedThreadFactory("Firebase-Messaging-Init"));
    }
}
