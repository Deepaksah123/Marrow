package kotlin;

import com.marrow2.data.subject.local.model.SubjectLSModel;
import com.marrow2.domain.custom_module.model.CustomModuleSubjectListModel;

/* JADX INFO: loaded from: classes3.dex */
public final class isValidColorRange {
    public static final CustomModuleSubjectListModel read(SubjectLSModel subjectLSModel) {
        toMagicModuleMetaRepoModel.write(subjectLSModel, "");
        return new CustomModuleSubjectListModel(subjectLSModel.getRemoteActionCompatParcelizer(), subjectLSModel.getAudioAttributesCompatParcelizer(), false, null, false, 28, null);
    }
}
