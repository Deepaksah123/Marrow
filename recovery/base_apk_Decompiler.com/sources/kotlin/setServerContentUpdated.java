package kotlin;

import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public final class setServerContentUpdated implements getExams {
    private final List<isServerContentUpdated> AudioAttributesCompatParcelizer;
    private final List<isServerContentUpdated> IconCompatParcelizer;
    private final Set<isServerContentUpdated> read;
    private final Set<isServerContentUpdated> write;

    public setServerContentUpdated(List<isServerContentUpdated> list, Set<isServerContentUpdated> set, List<isServerContentUpdated> list2, Set<isServerContentUpdated> set2) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(set, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(set2, "");
        this.AudioAttributesCompatParcelizer = list;
        this.read = set;
        this.IconCompatParcelizer = list2;
        this.write = set2;
    }

    @Override // kotlin.getExams
    public final List<isServerContentUpdated> IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getExams
    public final Set<isServerContentUpdated> RemoteActionCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.getExams
    public final List<isServerContentUpdated> AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
