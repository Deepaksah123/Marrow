package kotlin;

import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0001\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fj\u0002\b\r"}, d2 = {"Lo/g;", "Ljava/util/concurrent/Executor;", "", "<init>", "(Ljava/lang/String;)V", "Ljava/lang/Runnable;", "p0", "", "execute", "(Ljava/lang/Runnable;)V", "", "toString", "()Ljava/lang/String;", "write"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements Executor {
    private static final /* synthetic */ g[] RemoteActionCompatParcelizer;
    public static final g write = new g("INSTANCE");

    private g(String str) {
    }

    static {
        g[] gVarArrIconCompatParcelizer = IconCompatParcelizer();
        RemoteActionCompatParcelizer = gVarArrIconCompatParcelizer;
        getMagicModuleTimeline.IconCompatParcelizer(gVarArrIconCompatParcelizer);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.run();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "DirectExecutor";
    }

    private static final /* synthetic */ g[] IconCompatParcelizer() {
        return new g[]{write};
    }

    public static g valueOf(String str) {
        return (g) Enum.valueOf(g.class, str);
    }

    public static g[] values() {
        return (g[]) RemoteActionCompatParcelizer.clone();
    }
}
