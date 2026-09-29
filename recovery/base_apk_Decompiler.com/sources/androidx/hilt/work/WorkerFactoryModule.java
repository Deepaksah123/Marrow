package androidx.hilt.work;

import java.util.Map;
import kotlin._mergeAnnotations;
import kotlin._removeIgnored;
import kotlin.j;
import kotlin.setDescriptionList;

/* JADX INFO: loaded from: classes2.dex */
public abstract class WorkerFactoryModule {
    abstract Map<String, _mergeAnnotations<? extends j>> write();

    WorkerFactoryModule() {
    }

    public static _removeIgnored write(Map<String, setDescriptionList<_mergeAnnotations<? extends j>>> map) {
        return new _removeIgnored(map);
    }
}
