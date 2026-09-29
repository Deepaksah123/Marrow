package kotlin;

import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getPreferredActivities {
    private final List<getResourcesForActivity> RemoteActionCompatParcelizer;

    /* JADX WARN: Multi-variable type inference failed */
    public getPreferredActivities(List<? extends getResourcesForActivity> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.RemoteActionCompatParcelizer = list;
    }

    public final String toString() {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getClass(), obj.getClass())) {
            return false;
        }
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, ((getPreferredActivities) obj).RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return this.RemoteActionCompatParcelizer.hashCode();
    }
}
