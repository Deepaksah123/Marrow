package kotlin;

import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class TestResponseBody<T> implements Iterable<SyncResult<? extends T>>, getCurrentAnsweredMcqProgress {
    private final getCreatedOnDateMs<Iterator<T>> AudioAttributesCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public TestResponseBody(getCreatedOnDateMs<? extends Iterator<? extends T>> getcreatedondatems) {
        toMagicModuleMetaRepoModel.write(getcreatedondatems, "");
        this.AudioAttributesCompatParcelizer = getcreatedondatems;
    }

    @Override // java.lang.Iterable
    public final Iterator<SyncResult<T>> iterator() {
        return new SyncResultKt(this.AudioAttributesCompatParcelizer.invoke());
    }
}
