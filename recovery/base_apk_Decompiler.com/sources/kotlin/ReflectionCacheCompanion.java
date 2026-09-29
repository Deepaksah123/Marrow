package kotlin;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import kotlin.SequenceSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class ReflectionCacheCompanion<T> {
    private final Executor AudioAttributesCompatParcelizer;
    private final SequenceSerializer.RemoteActionCompatParcelizer<T> IconCompatParcelizer;
    private final Executor read;

    ReflectionCacheCompanion(Executor executor, Executor executor2, SequenceSerializer.RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer) {
        this.AudioAttributesCompatParcelizer = executor;
        this.read = executor2;
        this.IconCompatParcelizer = remoteActionCompatParcelizer;
    }

    public final Executor IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final Executor RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final SequenceSerializer.RemoteActionCompatParcelizer<T> write() {
        return this.IconCompatParcelizer;
    }

    public static final class RemoteActionCompatParcelizer<T> {
        private static Executor RemoteActionCompatParcelizer;
        private static final Object read = new Object();
        private Executor AudioAttributesCompatParcelizer;
        private final SequenceSerializer.RemoteActionCompatParcelizer<T> IconCompatParcelizer;
        private Executor write;

        public RemoteActionCompatParcelizer(SequenceSerializer.RemoteActionCompatParcelizer<T> remoteActionCompatParcelizer) {
            this.IconCompatParcelizer = remoteActionCompatParcelizer;
        }

        public final ReflectionCacheCompanion<T> AudioAttributesCompatParcelizer() {
            if (this.write == null) {
                synchronized (read) {
                    if (RemoteActionCompatParcelizer == null) {
                        RemoteActionCompatParcelizer = Executors.newFixedThreadPool(2);
                    }
                }
                this.write = RemoteActionCompatParcelizer;
            }
            return new ReflectionCacheCompanion<>(this.AudioAttributesCompatParcelizer, this.write, this.IconCompatParcelizer);
        }
    }
}
