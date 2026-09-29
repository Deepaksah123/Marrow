package kotlin;

import kotlin.CurrentQuery;
import kotlin.NotesDispatchAddressRequest;

/* JADX INFO: loaded from: classes4.dex */
public final class isParallelDecodingRequired<T> implements NotesDispatchAddressRequest<T> {
    private final ThreadLocal<T> IconCompatParcelizer;
    private final CurrentQuery.IconCompatParcelizer<?> RemoteActionCompatParcelizer;
    private final T read;

    public isParallelDecodingRequired(T t, ThreadLocal<T> threadLocal) {
        this.read = t;
        this.IconCompatParcelizer = threadLocal;
        this.RemoteActionCompatParcelizer = new getPbDurationMs(threadLocal);
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final <R> R fold(R r, MagicModuleSubmissionRequestBody<? super R, ? super CurrentQuery.write, ? extends R> magicModuleSubmissionRequestBody) {
        return (R) NotesDispatchAddressRequest.AudioAttributesCompatParcelizer.read(this, r, magicModuleSubmissionRequestBody);
    }

    @Override // kotlin.CurrentQuery
    public final CurrentQuery plus(CurrentQuery currentQuery) {
        return NotesDispatchAddressRequest.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this, currentQuery);
    }

    @Override // o.CurrentQuery.write
    public final CurrentQuery.IconCompatParcelizer<?> getKey() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.NotesDispatchAddressRequest
    public final T read(CurrentQuery currentQuery) {
        T t = this.IconCompatParcelizer.get();
        this.IconCompatParcelizer.set(this.read);
        return t;
    }

    @Override // kotlin.NotesDispatchAddressRequest
    public final void RemoteActionCompatParcelizer(T t) {
        this.IconCompatParcelizer.set(t);
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final CurrentQuery minusKey(CurrentQuery.IconCompatParcelizer<?> iconCompatParcelizer) {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getKey(), iconCompatParcelizer) ? VideoSessionResponseBody.RemoteActionCompatParcelizer : this;
    }

    @Override // o.CurrentQuery.write, kotlin.CurrentQuery
    public final <E extends CurrentQuery.write> E get(CurrentQuery.IconCompatParcelizer<E> iconCompatParcelizer) {
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getKey(), iconCompatParcelizer)) {
            return null;
        }
        toMagicModuleMetaRepoModel.read(this, "");
        return this;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ThreadLocal(value=");
        sb.append(this.read);
        sb.append(", threadLocal = ");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
