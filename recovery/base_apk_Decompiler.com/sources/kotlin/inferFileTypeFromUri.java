package kotlin;

import com.marrow.data.models.mcq.McqTimeSpent;

/* JADX INFO: loaded from: classes3.dex */
public final class inferFileTypeFromUri {
    public static final McqTimeSpent IconCompatParcelizer(FlagSet flagSet) {
        toMagicModuleMetaRepoModel.write(flagSet, "");
        McqTimeSpent mcqTimeSpent = new McqTimeSpent();
        mcqTimeSpent.id = System.currentTimeMillis();
        mcqTimeSpent.mcqId = flagSet.AudioAttributesCompatParcelizer();
        mcqTimeSpent.parentId = flagSet.IconCompatParcelizer();
        mcqTimeSpent.timeSpentMs = flagSet.write();
        mcqTimeSpent.type = !flagSet.RemoteActionCompatParcelizer() ? 1 : 0;
        return mcqTimeSpent;
    }
}
