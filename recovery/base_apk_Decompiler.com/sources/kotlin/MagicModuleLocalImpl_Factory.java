package kotlin;

import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/MagicModuleLocalImpl_Factory;", "Lo/MagicModuleRemote;", "Ljava/io/File;", "p0", "p1", "", "p2", "<init>", "(Ljava/io/File;Ljava/io/File;Ljava/lang/String;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class MagicModuleLocalImpl_Factory extends MagicModuleRemote {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private MagicModuleLocalImpl_Factory(File file, File file2, String str) {
        super(file, file2, str);
        toMagicModuleMetaRepoModel.write(file, "");
    }

    public /* synthetic */ MagicModuleLocalImpl_Factory(File file, File file2, String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(file, (i & 2) != 0 ? null : file2, (i & 4) != 0 ? null : str);
    }
}
