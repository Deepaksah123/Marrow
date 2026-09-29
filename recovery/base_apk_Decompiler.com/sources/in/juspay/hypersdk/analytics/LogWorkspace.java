package in.juspay.hypersdk.analytics;

import in.juspay.hypersdk.services.Workspace;
import java.io.File;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004R\u0011\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Lin/juspay/hypersdk/analytics/LogWorkspace;", "Lin/juspay/hypersdk/services/Workspace;", "p0", "<init>", "(Lin/juspay/hypersdk/services/Workspace;)V", "Ljava/io/File;", "logsDir", "Ljava/io/File;", "Companion"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class LogWorkspace extends Workspace {
    private static final String LOGS_DIR_NAME = "juspay_logs";
    public final File logsDir;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LogWorkspace(Workspace workspace) {
        super(workspace);
        toMagicModuleMetaRepoModel.write(workspace, "");
        File fileOpenInCache = openInCache(LOGS_DIR_NAME);
        this.logsDir = fileOpenInCache;
        if (!fileOpenInCache.exists()) {
            fileOpenInCache.mkdir();
        }
        setRoot(fileOpenInCache);
    }
}
