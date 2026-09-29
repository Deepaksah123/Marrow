package kotlin;

import kotlin.CurrentQuery;

/* JADX INFO: loaded from: classes4.dex */
public final class getPlaybackType implements CurrentQuery {
    private final /* synthetic */ CurrentQuery RemoteActionCompatParcelizer;
    public final Throwable write;

    public getPlaybackType(Throwable th, CurrentQuery currentQuery) {
        this.RemoteActionCompatParcelizer = currentQuery;
        this.write = th;
    }

    @Override // kotlin.CurrentQuery
    public final <R> R fold(R r, MagicModuleSubmissionRequestBody<? super R, ? super CurrentQuery.write, ? extends R> magicModuleSubmissionRequestBody) {
        return (R) this.RemoteActionCompatParcelizer.fold(r, magicModuleSubmissionRequestBody);
    }

    @Override // kotlin.CurrentQuery
    public final <E extends CurrentQuery.write> E get(CurrentQuery.IconCompatParcelizer<E> iconCompatParcelizer) {
        return (E) this.RemoteActionCompatParcelizer.get(iconCompatParcelizer);
    }

    @Override // kotlin.CurrentQuery
    public final CurrentQuery minusKey(CurrentQuery.IconCompatParcelizer<?> iconCompatParcelizer) {
        return this.RemoteActionCompatParcelizer.minusKey(iconCompatParcelizer);
    }

    @Override // kotlin.CurrentQuery
    public final CurrentQuery plus(CurrentQuery currentQuery) {
        return this.RemoteActionCompatParcelizer.plus(currentQuery);
    }
}
