package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0018\u001a\u00020\u00038\u0006¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0006¢\u0006\u0006\n\u0004\b\r\u0010\u0019"}, d2 = {"Lo/getSharedElementReturnTransition;", "Lo/writerFor;", "Lo/getRetainInstance;", "Lo/getReturnTransition;", "p0", "Lkotlin/Function1;", "Lo/as;", "", "p1", "<init>", "(Lo/getReturnTransition;Lo/getAnswerMap;)V", "write", "()Lo/getRetainInstance;", "read", "(Lo/getRetainInstance;)V", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "RemoteActionCompatParcelizer", "Lo/getReturnTransition;", "IconCompatParcelizer", "Lo/getAnswerMap;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getSharedElementReturnTransition extends writerFor<getRetainInstance> {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final getReturnTransition IconCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getAnswerMap<as, getShowPopup> RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public getSharedElementReturnTransition(getReturnTransition getreturntransition, getAnswerMap<? super as, getShowPopup> getanswermap) {
        this.IconCompatParcelizer = getreturntransition;
        this.RemoteActionCompatParcelizer = getanswermap;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final getRetainInstance IconCompatParcelizer() {
        return new getRetainInstance(this.IconCompatParcelizer);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(getRetainInstance p0) {
        p0.IconCompatParcelizer(this.IconCompatParcelizer);
    }

    public final int hashCode() {
        return this.IconCompatParcelizer.hashCode();
    }

    public final boolean equals(Object p0) {
        getSharedElementReturnTransition getsharedelementreturntransition = p0 instanceof getSharedElementReturnTransition ? (getSharedElementReturnTransition) p0 : null;
        if (getsharedelementreturntransition == null) {
            return false;
        }
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, getsharedelementreturntransition.IconCompatParcelizer);
    }
}
