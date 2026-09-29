package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class component12 extends getStartTimeMs<Runnable> {
    @Override // kotlin.getStartTimeMs
    protected final /* synthetic */ void AudioAttributesCompatParcelizer(Runnable runnable) {
        write(runnable);
    }

    component12(Runnable runnable) {
        super(runnable);
    }

    private static void write(Runnable runnable) {
        runnable.run();
    }

    @Override // java.util.concurrent.atomic.AtomicReference
    public final String toString() {
        StringBuilder sb = new StringBuilder("RunnableDisposable(disposed=");
        sb.append(write());
        sb.append(", ");
        sb.append(get());
        sb.append(")");
        return sb.toString();
    }
}
