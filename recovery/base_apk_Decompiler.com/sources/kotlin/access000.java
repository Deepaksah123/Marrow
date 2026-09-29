package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u0001B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\n\u001a\u00020\u00042\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\n\u0010\u0007R\"\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/access000;", "Lo/initLifecycle;", "Lkotlin/Function1;", "Lo/onCreateView;", "", "p0", "<init>", "(Lo/getAnswerMap;)V", "RemoteActionCompatParcelizer", "(Lo/onCreateView;)Lo/onCreateView;", "AudioAttributesCompatParcelizer", "Lo/getAnswerMap;", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class access000 extends initLifecycle {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private getAnswerMap<? super onCreateView, getShowPopup> write;

    public access000(getAnswerMap<? super onCreateView, getShowPopup> getanswermap) {
        this.write = getanswermap;
    }

    @Override // kotlin.initLifecycle
    public final onCreateView RemoteActionCompatParcelizer(onCreateView p0) {
        this.write.invoke(p0);
        return p0;
    }

    public final void AudioAttributesCompatParcelizer(getAnswerMap<? super onCreateView, getShowPopup> p0) {
        if (p0 != this.write) {
            this.write = p0;
        }
    }
}
