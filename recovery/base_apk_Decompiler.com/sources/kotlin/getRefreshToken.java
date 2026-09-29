package kotlin;

import java.util.Collection;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class getRefreshToken extends getKycStatus {
    public static final <T> Set<T> IconCompatParcelizer(Set<? extends T> set, T t) {
        toMagicModuleMetaRepoModel.write(set, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet(VideoTimelineResponseBody.read(set.size()));
        boolean z = false;
        for (T t2 : set) {
            boolean z2 = true;
            if (!z && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                linkedHashSet.add(t2);
            }
        }
        return linkedHashSet;
    }

    public static final <T> Set<T> IconCompatParcelizer(Set<? extends T> set, Iterable<? extends T> iterable) {
        toMagicModuleMetaRepoModel.write(set, "");
        toMagicModuleMetaRepoModel.write(iterable, "");
        Collection<?> collectionAudioAttributesCompatParcelizer = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) iterable);
        if (collectionAudioAttributesCompatParcelizer.isEmpty()) {
            return IntermediateLoginResponseBody.onPlayFromUri(set);
        }
        if (!(collectionAudioAttributesCompatParcelizer instanceof Set)) {
            LinkedHashSet linkedHashSet = new LinkedHashSet(set);
            linkedHashSet.removeAll(collectionAudioAttributesCompatParcelizer);
            return linkedHashSet;
        }
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (T t : set) {
            if (!((Set) collectionAudioAttributesCompatParcelizer).contains(t)) {
                linkedHashSet2.add(t);
            }
        }
        return linkedHashSet2;
    }

    public static final <T> Set<T> write(Set<? extends T> set, T t) {
        toMagicModuleMetaRepoModel.write(set, "");
        LinkedHashSet linkedHashSet = new LinkedHashSet(VideoTimelineResponseBody.read(set.size() + 1));
        linkedHashSet.addAll(set);
        linkedHashSet.add(t);
        return linkedHashSet;
    }

    public static final <T> Set<T> RemoteActionCompatParcelizer(Set<? extends T> set, Iterable<? extends T> iterable) {
        int size;
        toMagicModuleMetaRepoModel.write(set, "");
        toMagicModuleMetaRepoModel.write(iterable, "");
        Integer numIconCompatParcelizer = IntermediateLoginResponseBody.IconCompatParcelizer(iterable);
        if (numIconCompatParcelizer != null) {
            size = set.size() + numIconCompatParcelizer.intValue();
        } else {
            size = set.size() << 1;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(VideoTimelineResponseBody.read(size));
        linkedHashSet.addAll(set);
        IntermediateLoginResponseBody.IconCompatParcelizer((Collection) linkedHashSet, (Iterable) iterable);
        return linkedHashSet;
    }
}
