package kotlin;

import java.util.Set;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J#\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u0006H&¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u0007\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\rJ%\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH&¢\u0006\u0004\b\u000f\u0010\u0010ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/child;", "", "Lo/parseDigitsRecursive;", "p0", "", "p1", "Lo/rootDetector;", "IconCompatParcelizer", "(Lo/parseDigitsRecursive;Z)Lo/rootDetector;", "p2", "", "RemoteActionCompatParcelizer", "(Lo/parseDigitsRecursive;Lo/parseDigitsRecursive;Lo/rootDetector;)V", "(Lo/parseDigitsRecursive;)V", "", "write", "(Lo/parseDigitsRecursive;Ljava/util/Set;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface child {
    default rootDetector IconCompatParcelizer(parseDigitsRecursive p0, boolean p1) {
        return null;
    }

    default void IconCompatParcelizer(parseDigitsRecursive p0) {
    }

    default void RemoteActionCompatParcelizer(parseDigitsRecursive p0, parseDigitsRecursive p1, rootDetector p2) {
    }

    default void write(parseDigitsRecursive p0, Set<? extends Object> p1) {
    }
}
