package kotlin;

import com.marrow2.domain.custom_module.model.CustomModuleSubjectListModel;
import kotlin.SequenceSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class setDividerDrawableVertical extends SequenceSerializer.RemoteActionCompatParcelizer<CustomModuleSubjectListModel> {
    @Override // o.SequenceSerializer.RemoteActionCompatParcelizer
    public final /* synthetic */ boolean RemoteActionCompatParcelizer(CustomModuleSubjectListModel customModuleSubjectListModel, CustomModuleSubjectListModel customModuleSubjectListModel2) {
        return write(customModuleSubjectListModel, customModuleSubjectListModel2);
    }

    @Override // o.SequenceSerializer.RemoteActionCompatParcelizer
    public final /* synthetic */ boolean read(CustomModuleSubjectListModel customModuleSubjectListModel, CustomModuleSubjectListModel customModuleSubjectListModel2) {
        return IconCompatParcelizer(customModuleSubjectListModel, customModuleSubjectListModel2);
    }

    private static boolean IconCompatParcelizer(CustomModuleSubjectListModel customModuleSubjectListModel, CustomModuleSubjectListModel customModuleSubjectListModel2) {
        toMagicModuleMetaRepoModel.write(customModuleSubjectListModel, "");
        toMagicModuleMetaRepoModel.write(customModuleSubjectListModel2, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) customModuleSubjectListModel.getRead(), (Object) customModuleSubjectListModel2.getRead()) && customModuleSubjectListModel.getWrite() == customModuleSubjectListModel2.getWrite() && customModuleSubjectListModel.write().size() == customModuleSubjectListModel2.write().size();
    }

    private static boolean write(CustomModuleSubjectListModel customModuleSubjectListModel, CustomModuleSubjectListModel customModuleSubjectListModel2) {
        toMagicModuleMetaRepoModel.write(customModuleSubjectListModel, "");
        toMagicModuleMetaRepoModel.write(customModuleSubjectListModel2, "");
        return customModuleSubjectListModel == customModuleSubjectListModel2;
    }
}
