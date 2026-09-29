package kotlin;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes.dex */
public final class ac {

    public static final class read implements ThreadFactory {
        final /* synthetic */ boolean RemoteActionCompatParcelizer;
        private final AtomicInteger write = new AtomicInteger(0);

        read(boolean z) {
            this.RemoteActionCompatParcelizer = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            toMagicModuleMetaRepoModel.write(runnable, "");
            String str = this.RemoteActionCompatParcelizer ? "WM.task-" : "androidx.work-";
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(this.write.incrementAndGet());
            return new Thread(runnable, sb.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor write(boolean z) {
        ExecutorService executorServiceNewFixedThreadPool = Executors.newFixedThreadPool(Math.max(2, Math.min(Runtime.getRuntime().availableProcessors() - 1, 4)), new read(z));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(executorServiceNewFixedThreadPool, "");
        return executorServiceNewFixedThreadPool;
    }

    public static final class AudioAttributesCompatParcelizer implements getConcatenatedUid {
        AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.getConcatenatedUid
        public final boolean IconCompatParcelizer() {
            return MarkerView.IconCompatParcelizer();
        }

        @Override // kotlin.getConcatenatedUid
        public final void read(String str) {
            toMagicModuleMetaRepoModel.write(str, "");
            MarkerView.AudioAttributesCompatParcelizer(str);
        }

        @Override // kotlin.getConcatenatedUid
        public final void RemoteActionCompatParcelizer() {
            MarkerView.RemoteActionCompatParcelizer();
        }

        @Override // kotlin.getConcatenatedUid
        public final void IconCompatParcelizer(String str, int i) {
            toMagicModuleMetaRepoModel.write(str, "");
            MarkerView.write(str, i);
        }

        @Override // kotlin.getConcatenatedUid
        public final void AudioAttributesCompatParcelizer(String str, int i) {
            toMagicModuleMetaRepoModel.write(str, "");
            MarkerView.IconCompatParcelizer(str, i);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getConcatenatedUid AudioAttributesCompatParcelizer() {
        return new AudioAttributesCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Executor RemoteActionCompatParcelizer(CurrentQuery currentQuery) {
        getPlaybackInterval getplaybackinterval = currentQuery != null ? (getPlaybackInterval) currentQuery.get(getPlaybackInterval.INSTANCE) : null;
        getPlatform getplatform = getplaybackinterval instanceof getPlatform ? (getPlatform) getplaybackinterval : null;
        if (getplatform != null) {
            return getDegree.read(getplatform);
        }
        return null;
    }
}
