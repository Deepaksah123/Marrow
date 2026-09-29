package kotlin;

import java.util.ArrayList;
import java.util.Collection;

/* JADX INFO: loaded from: classes2.dex */
final /* synthetic */ class LineChart {
    public static final <T> ArrayList<T> write(Collection<?> collection) {
        toMagicModuleMetaRepoModel.write(collection, "");
        return collection instanceof ArrayList ? (ArrayList) collection : new ArrayList<>(collection);
    }
}
