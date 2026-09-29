package kotlin;

import java.util.Collection;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class getImageType extends hasImageCitation implements isResultAvailable {
    private final getNotesCount read;

    @Override // kotlin.HomeQbankModel
    public final boolean IconCompatParcelizer() {
        return false;
    }

    public getImageType(getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        this.read = getnotescount;
    }

    @Override // kotlin.HomeQbankModel
    public final /* synthetic */ Collection read() {
        return AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.isResultAvailable
    public final getNotesCount write() {
        return this.read;
    }

    @Override // kotlin.isResultAvailable
    public final Collection<isPaused> read(getAnswerMap<? super getRelatedLessonId, Boolean> getanswermap) {
        toMagicModuleMetaRepoModel.write(getanswermap, "");
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.isResultAvailable
    public final Collection<isResultAvailable> RemoteActionCompatParcelizer() {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    private static List<RecentUpdatesReferences> AudioAttributesCompatParcelizer() {
        return IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    public final boolean equals(Object obj) {
        return (obj instanceof getImageType) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(write(), ((getImageType) obj).write());
    }

    public final int hashCode() {
        return write().hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getName());
        sb.append(": ");
        sb.append(write());
        return sb.toString();
    }

    @Override // kotlin.HomeQbankModel
    public final RecentUpdatesReferences write(getNotesCount getnotescount) {
        toMagicModuleMetaRepoModel.write(getnotescount, "");
        return null;
    }
}
