package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0007H&¢\u0006\u0004\b\u0005\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/_resizeAndFindOffsetForAdd;", "", "", "p0", "", "RemoteActionCompatParcelizer", "(Z)V", "Lo/_checkNeedForRehash;", "(I)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface _resizeAndFindOffsetForAdd {
    void RemoteActionCompatParcelizer(boolean p0);

    boolean RemoteActionCompatParcelizer(int p0);

    static /* synthetic */ void RemoteActionCompatParcelizer$default(_resizeAndFindOffsetForAdd _resizeandfindoffsetforadd, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: clearFocus");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        _resizeandfindoffsetforadd.RemoteActionCompatParcelizer(z);
    }
}
