package kotlin;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class setMcqIdFromResponse {
    public static final Set<getRelatedLessonId> RemoteActionCompatParcelizer(Iterable<? extends setTags> iterable) {
        toMagicModuleMetaRepoModel.write(iterable, "");
        HashSet hashSet = new HashSet();
        Iterator<? extends setTags> it = iterable.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Set<getRelatedLessonId> setAW_ = it.next().aW_();
            if (setAW_ == null) {
                hashSet = null;
                break;
            }
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) hashSet, (Iterable) setAW_);
        }
        return hashSet;
    }
}
