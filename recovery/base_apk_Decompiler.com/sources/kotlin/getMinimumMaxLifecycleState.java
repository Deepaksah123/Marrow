package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0004\u001a\u0004\u0018\u00010\u0012H\u0096\u0002¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0016R \u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019"}, d2 = {"Lo/getMinimumMaxLifecycleState;", "Lo/writerFor;", "Lo/prepareCallInternal;", "Lo/onCreateView;", "p0", "Lkotlin/Function1;", "Lo/as;", "", "p1", "<init>", "(Lo/onCreateView;Lo/getAnswerMap;)V", "write", "()Lo/prepareCallInternal;", "AudioAttributesCompatParcelizer", "(Lo/prepareCallInternal;)V", "", "hashCode", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "Lo/onCreateView;", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "Lo/getAnswerMap;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class getMinimumMaxLifecycleState extends writerFor<prepareCallInternal> {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final getAnswerMap<as, getShowPopup> read;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final onCreateView RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public getMinimumMaxLifecycleState(onCreateView oncreateview, getAnswerMap<? super as, getShowPopup> getanswermap) {
        this.RemoteActionCompatParcelizer = oncreateview;
        this.read = getanswermap;
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public final prepareCallInternal IconCompatParcelizer() {
        return new prepareCallInternal(this.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.writerFor
    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
    public final void IconCompatParcelizer(prepareCallInternal p0) {
        p0.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (p0 instanceof getMinimumMaxLifecycleState) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((getMinimumMaxLifecycleState) p0).RemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer);
        }
        return false;
    }
}
