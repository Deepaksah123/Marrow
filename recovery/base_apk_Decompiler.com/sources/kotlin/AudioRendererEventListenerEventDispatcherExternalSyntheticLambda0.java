package kotlin;

import java.io.InputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class AudioRendererEventListenerEventDispatcherExternalSyntheticLambda0 {
    public static final DefaultAudioSinkApi31 RemoteActionCompatParcelizer(List list) {
        try {
            Runtime runtime = Runtime.getRuntime();
            toMagicModuleMetaRepoModel.write(runtime);
            Process processExec = runtime.exec((String[]) list.toArray(new String[0]));
            toMagicModuleMetaRepoModel.write(processExec);
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            long jNanoTime = System.nanoTime();
            long nanos = timeUnit.toNanos(1000L);
            do {
                try {
                    processExec.exitValue();
                    if (processExec.exitValue() != 0) {
                        throw new Exception();
                    }
                    InputStream inputStream = processExec.getInputStream();
                    toMagicModuleMetaRepoModel.write(inputStream);
                    try {
                        String str = new String(getCorrectCount.write(inputStream), getSubmissionTimestamp.IconCompatParcelizer);
                        MagicModuleMetaLSModel.IconCompatParcelizer(inputStream, null);
                        return new Ac4Util(str);
                    } finally {
                    }
                } catch (IllegalThreadStateException unused) {
                    if (nanos > 0) {
                        Thread.sleep(Math.min(TimeUnit.NANOSECONDS.toMillis(nanos) + 1, 100L));
                    }
                    nanos = timeUnit.toNanos(1000L) - (System.nanoTime() - jNanoTime);
                }
            } while (nanos > 0);
            processExec.destroy();
            throw new TimeoutException();
        } catch (Throwable th) {
            return new codecNeedsDiscardChannelsWorkaround(th);
        }
    }
}
