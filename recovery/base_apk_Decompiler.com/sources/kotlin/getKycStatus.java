package kotlin;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public class getKycStatus extends getInitiateKyc {
    public static final <T> Set<T> read() {
        return isContentTypeLesson.IconCompatParcelizer;
    }

    public static final <T> Set<T> IconCompatParcelizer(T... tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return getOrderDetails.handleMediaPlayPauseIfPendingOnHandler(tArr);
    }

    public static final <T> Set<T> write(T... tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return (Set) getOrderDetails.write((Object[]) tArr, new LinkedHashSet(VideoTimelineResponseBody.read(tArr.length)));
    }

    public static final <T> HashSet<T> read(T... tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return (HashSet) getOrderDetails.write((Object[]) tArr, new HashSet(VideoTimelineResponseBody.read(tArr.length)));
    }

    public static final <T> LinkedHashSet<T> RemoteActionCompatParcelizer(T... tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return (LinkedHashSet) getOrderDetails.write((Object[]) tArr, new LinkedHashSet(VideoTimelineResponseBody.read(tArr.length)));
    }

    public static final <T> Set<T> AudioAttributesCompatParcelizer(T... tArr) {
        toMagicModuleMetaRepoModel.write(tArr, "");
        return (Set) getOrderDetails.AudioAttributesCompatParcelizer((Object[]) tArr, new LinkedHashSet());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> Set<T> read(Set<? extends T> set) {
        toMagicModuleMetaRepoModel.write(set, "");
        int size = set.size();
        if (size != 0) {
            return size != 1 ? set : getKycMessage.read(set.iterator().next());
        }
        return getKycMessage.read();
    }
}
