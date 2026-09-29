package kotlin;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0086\u0002¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0010"}, d2 = {"Lo/withAppendedAnnotationIntrospector;", "Lo/getTopRankers;", "Lo/withClassIntrospector;", "<init>", "()V", "", "write", "()Ljava/util/Iterator;", "", "p0", "", "p1", "", "IconCompatParcelizer", "(Ljava/lang/String;Ljava/lang/Object;)V", "", "Ljava/util/List;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class withAppendedAnnotationIntrospector implements getTopRankers<withClassIntrospector> {
    private final List<withClassIntrospector> IconCompatParcelizer = new ArrayList();

    @Override // kotlin.getTopRankers
    public final Iterator<withClassIntrospector> write() {
        return this.IconCompatParcelizer.iterator();
    }

    public final void IconCompatParcelizer(String p0, Object p1) {
        this.IconCompatParcelizer.add(new withClassIntrospector(p0, p1));
    }
}
