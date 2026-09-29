package kotlin;

import java.util.Collection;
import java.util.LinkedHashSet;
import kotlin.setTags;

/* JADX INFO: loaded from: classes4.dex */
public final class UpdatedStatus {
    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Collection<T> write(Collection<? extends T> collection, Collection<? extends T> collection2) {
        toMagicModuleMetaRepoModel.write(collection2, "");
        if (collection2.isEmpty()) {
            return collection;
        }
        if (collection == 0) {
            return collection2;
        }
        if (collection instanceof LinkedHashSet) {
            ((LinkedHashSet) collection).addAll(collection2);
            return collection;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        linkedHashSet.addAll(collection2);
        return linkedHashSet;
    }

    public static final getMonthTimeStamp<setTags> IconCompatParcelizer(Iterable<? extends setTags> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        getMonthTimeStamp<setTags> getmonthtimestamp = new getMonthTimeStamp<>();
        for (setTags settags : iterable) {
            setTags settags2 = settags;
            if (settags2 != null && settags2 != setTags.write.RemoteActionCompatParcelizer) {
                getmonthtimestamp.add(settags);
            }
        }
        return getmonthtimestamp;
    }
}
