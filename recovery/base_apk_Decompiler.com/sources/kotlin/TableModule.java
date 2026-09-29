package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0012\b&\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0011\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\n\u0010\u0010R\"\u0010\u0017\u001a\u00020\f8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000e\"\u0004\b\r\u0010\u001aR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\b8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e"}, d2 = {"Lo/TableModule;", "", "", "p0", "", "p1", "<init>", "(Ljava/lang/String;Z)V", "Lo/SubscriptionDataModule;", "", "read", "(Lo/SubscriptionDataModule;)V", "", "AudioAttributesCompatParcelizer", "()J", "toString", "()Ljava/lang/String;", "cancelable", "Z", "write", "()Z", "name", "Ljava/lang/String;", "nextExecuteNanoTime", "J", "RemoteActionCompatParcelizer", "(J)V", "queue", "Lo/SubscriptionDataModule;", "IconCompatParcelizer", "()Lo/SubscriptionDataModule;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public abstract class TableModule {
    private final boolean cancelable;
    private final String name;
    private long nextExecuteNanoTime;
    private SubscriptionDataModule queue;

    public abstract long AudioAttributesCompatParcelizer();

    public TableModule(String str, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.name = str;
        this.cancelable = z;
        this.nextExecuteNanoTime = -1L;
    }

    public /* synthetic */ TableModule(String str, boolean z, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, (i & 2) != 0 ? true : z);
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getCancelable() {
        return this.cancelable;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final SubscriptionDataModule getQueue() {
        return this.queue;
    }

    public final void AudioAttributesCompatParcelizer(long j) {
        this.nextExecuteNanoTime = j;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final long getNextExecuteNanoTime() {
        return this.nextExecuteNanoTime;
    }

    public final void read(SubscriptionDataModule p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        SubscriptionDataModule subscriptionDataModule = this.queue;
        if (subscriptionDataModule == p0) {
            return;
        }
        if (subscriptionDataModule != null) {
            throw new IllegalStateException("task is in multiple queues".toString());
        }
        this.queue = p0;
    }

    public String toString() {
        return this.name;
    }
}
