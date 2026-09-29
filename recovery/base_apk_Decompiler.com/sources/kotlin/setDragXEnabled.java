package kotlin;

import kotlin.CurrentQuery;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00000\n8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lo/setDragXEnabled;", "Lo/CurrentQuery$write;", "Lo/setRendererRightYAxis;", "p0", "<init>", "(Lo/setRendererRightYAxis;)V", "write", "Lo/setRendererRightYAxis;", "IconCompatParcelizer", "()Lo/setRendererRightYAxis;", "Lo/CurrentQuery$IconCompatParcelizer;", "getKey", "()Lo/CurrentQuery$IconCompatParcelizer;", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class setDragXEnabled implements CurrentQuery.write {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final setRendererRightYAxis write;

    public setDragXEnabled(setRendererRightYAxis setrendererrightyaxis) {
        toMagicModuleMetaRepoModel.write(setrendererrightyaxis, "");
        this.write = setrendererrightyaxis;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final setRendererRightYAxis getWrite() {
        return this.write;
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final <R> R fold(R r, MagicModuleSubmissionRequestBody<? super R, ? super CurrentQuery.write, ? extends R> magicModuleSubmissionRequestBody) {
        return (R) CurrentQuery.write.DefaultImpls.fold(this, r, magicModuleSubmissionRequestBody);
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final <E extends CurrentQuery.write> E get(CurrentQuery.IconCompatParcelizer<E> iconCompatParcelizer) {
        return (E) CurrentQuery.write.DefaultImpls.get(this, iconCompatParcelizer);
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final CurrentQuery minusKey(CurrentQuery.IconCompatParcelizer<?> iconCompatParcelizer) {
        return CurrentQuery.write.DefaultImpls.minusKey(this, iconCompatParcelizer);
    }

    @Override // kotlin.CurrentQuery
    public final CurrentQuery plus(CurrentQuery currentQuery) {
        return CurrentQuery.write.DefaultImpls.AudioAttributesCompatParcelizer(this, currentQuery);
    }

    /* JADX INFO: renamed from: o.setDragXEnabled$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/setDragXEnabled$read;", "Lo/CurrentQuery$IconCompatParcelizer;", "Lo/setDragXEnabled;", "<init>", "()V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion implements CurrentQuery.IconCompatParcelizer<setDragXEnabled> {
        private Companion() {
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    @Override // o.CurrentQuery.write
    public final CurrentQuery.IconCompatParcelizer<setDragXEnabled> getKey() {
        return INSTANCE;
    }
}
