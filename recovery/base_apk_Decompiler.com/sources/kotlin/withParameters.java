package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0014¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\n\u001a\u00020\b8WX\u0096\u0004ø\u0001\u0000¢\u0006\u0006\u001a\u0004\b\u0006\u0010\t\u0082\u0002\u0004\n\u0002\b!"}, d2 = {"Lo/withParameters;", "Lo/isAnnotationBundle;", "<init>", "()V", "Lo/findSetterInfo;", "", "read", "(Lo/findSetterInfo;)V", "Lo/calloc;", "()J", "write"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class withParameters extends isAnnotationBundle {
    public static final withParameters INSTANCE = new withParameters();

    private withParameters() {
    }

    @Override // kotlin.isAnnotationBundle
    public final long read() {
        return calloc.INSTANCE.IconCompatParcelizer();
    }

    @Override // kotlin.isAnnotationBundle
    public final void read(findSetterInfo findsetterinfo) {
        toMagicModuleMetaRepoModel.write(findsetterinfo, "");
    }
}
