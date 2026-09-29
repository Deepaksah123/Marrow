package kotlin;

import kotlin.Metadata;
import kotlin.ScrollingTabContainerView;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0003*\u00020\u00022\u00020\u0004J\u0017\u0010\u0007\u001a\u00028\u00002\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00028\u00012\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\f\u001a\u00020\u00058'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000eR \u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u000f8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\u0010R\u0014\u0010\u0011\u001a\u00028\u00008'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u000b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0013ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0003"}, d2 = {"Lo/setMeasureWithLargestChildEnabled;", "T", "Lo/ScrollingTabContainerView;", "V", "", "", "p0", "read", "(J)Ljava/lang/Object;", "IconCompatParcelizer", "(J)Lo/ScrollingTabContainerView;", "", "write", "(J)Z", "()J", "Lo/evictionCount;", "()Lo/evictionCount;", "RemoteActionCompatParcelizer", "()Ljava/lang/Object;", "()Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface setMeasureWithLargestChildEnabled<T, V extends ScrollingTabContainerView> {
    long IconCompatParcelizer();

    V IconCompatParcelizer(long p0);

    T RemoteActionCompatParcelizer();

    T read(long p0);

    boolean read();

    evictionCount<T, V> write();

    default boolean write(long p0) {
        return p0 >= IconCompatParcelizer();
    }
}
