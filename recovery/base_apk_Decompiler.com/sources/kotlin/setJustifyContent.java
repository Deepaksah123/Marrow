package kotlin;

import com.marrow2.domain.custom_module.model.CustomModuleTopicListModel;
import kotlin.SequenceSerializer;

/* JADX INFO: loaded from: classes3.dex */
public final class setJustifyContent extends SequenceSerializer.RemoteActionCompatParcelizer<CustomModuleTopicListModel> {
    @Override // o.SequenceSerializer.RemoteActionCompatParcelizer
    public final /* synthetic */ boolean RemoteActionCompatParcelizer(CustomModuleTopicListModel customModuleTopicListModel, CustomModuleTopicListModel customModuleTopicListModel2) {
        return IconCompatParcelizer(customModuleTopicListModel, customModuleTopicListModel2);
    }

    @Override // o.SequenceSerializer.RemoteActionCompatParcelizer
    public final /* synthetic */ boolean read(CustomModuleTopicListModel customModuleTopicListModel, CustomModuleTopicListModel customModuleTopicListModel2) {
        return AudioAttributesCompatParcelizer(customModuleTopicListModel, customModuleTopicListModel2);
    }

    private static boolean AudioAttributesCompatParcelizer(CustomModuleTopicListModel customModuleTopicListModel, CustomModuleTopicListModel customModuleTopicListModel2) {
        toMagicModuleMetaRepoModel.write(customModuleTopicListModel, "");
        toMagicModuleMetaRepoModel.write(customModuleTopicListModel2, "");
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) customModuleTopicListModel.getRemoteActionCompatParcelizer(), (Object) customModuleTopicListModel2.getRemoteActionCompatParcelizer()) && customModuleTopicListModel.getRead() == customModuleTopicListModel2.getRead();
    }

    private static boolean IconCompatParcelizer(CustomModuleTopicListModel customModuleTopicListModel, CustomModuleTopicListModel customModuleTopicListModel2) {
        toMagicModuleMetaRepoModel.write(customModuleTopicListModel, "");
        toMagicModuleMetaRepoModel.write(customModuleTopicListModel2, "");
        return customModuleTopicListModel == customModuleTopicListModel2;
    }
}
