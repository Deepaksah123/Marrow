package kotlin;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tB\t\b\u0016¢\u0006\u0004\b\b\u0010\nB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u000b¢\u0006\u0004\b\b\u0010\fR\u001a\u0010\r\u001a\u00020\u000b8\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/ResponseErrorException;", "", "", "p0", "", "p1", "Ljava/util/concurrent/TimeUnit;", "p2", "<init>", "(Ljava/util/concurrent/TimeUnit;)V", "()V", "Lo/ResourceProviderModule;", "(Lo/ResourceProviderModule;)V", "delegate", "Lo/ResourceProviderModule;", "write", "()Lo/ResourceProviderModule;"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class ResponseErrorException {
    private final ResourceProviderModule delegate;

    private ResponseErrorException(ResourceProviderModule resourceProviderModule) {
        toMagicModuleMetaRepoModel.write(resourceProviderModule, "");
        this.delegate = resourceProviderModule;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final ResourceProviderModule getDelegate() {
        return this.delegate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    private ResponseErrorException(TimeUnit timeUnit) {
        this(new ResourceProviderModule(SyncModule.INSTANCE, 5, 5L, timeUnit));
        toMagicModuleMetaRepoModel.write(timeUnit, "");
    }

    public ResponseErrorException() {
        this(TimeUnit.MINUTES);
    }
}
