package kotlin;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import kotlin.getSynchronizationSampleIndex;

/* JADX INFO: loaded from: classes5.dex */
final class parseSchemeSpecificData<V> extends getSynchronizationSampleIndex.RemoteActionCompatParcelizer<V> implements RunnableFuture<V> {
    private volatile processUnparsedAtom<?> write;

    static <V> parseSchemeSpecificData<V> AudioAttributesCompatParcelizer(Callable<V> callable) {
        return new parseSchemeSpecificData<>(callable);
    }

    static <V> parseSchemeSpecificData<V> read(Runnable runnable, V v) {
        return new parseSchemeSpecificData<>(Executors.callable(runnable, v));
    }

    private parseSchemeSpecificData(Callable<V> callable) {
        this.write = new read(callable);
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        processUnparsedAtom<?> processunparsedatom = this.write;
        if (processunparsedatom != null) {
            processunparsedatom.run();
        }
        this.write = null;
    }

    @Override // kotlin.setFormatGaplessInfo
    protected final void write() {
        processUnparsedAtom<?> processunparsedatom;
        super.write();
        if (IconCompatParcelizer() && (processunparsedatom = this.write) != null) {
            processunparsedatom.write();
        }
        this.write = null;
    }

    @Override // kotlin.setFormatGaplessInfo
    protected final String AudioAttributesCompatParcelizer() {
        processUnparsedAtom<?> processunparsedatom = this.write;
        if (processunparsedatom != null) {
            StringBuilder sb = new StringBuilder("task=[");
            sb.append(processunparsedatom);
            sb.append("]");
            return sb.toString();
        }
        return super.AudioAttributesCompatParcelizer();
    }

    final class read extends processUnparsedAtom<V> {
        private final Callable<V> IconCompatParcelizer;

        read(Callable<V> callable) {
            this.IconCompatParcelizer = (Callable) parseStsd.IconCompatParcelizer(callable);
        }

        @Override // kotlin.processUnparsedAtom
        final boolean AudioAttributesCompatParcelizer() {
            return parseSchemeSpecificData.this.isDone();
        }

        @Override // kotlin.processUnparsedAtom
        final V RemoteActionCompatParcelizer() throws Exception {
            return this.IconCompatParcelizer.call();
        }

        @Override // kotlin.processUnparsedAtom
        final void read(V v) {
            parseSchemeSpecificData.this.read(v);
        }

        @Override // kotlin.processUnparsedAtom
        final void IconCompatParcelizer(Throwable th) {
            parseSchemeSpecificData.this.IconCompatParcelizer(th);
        }

        @Override // kotlin.processUnparsedAtom
        final String read() {
            return this.IconCompatParcelizer.toString();
        }
    }
}
