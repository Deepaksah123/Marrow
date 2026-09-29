package kotlin;

import com.marrow.data.models.mcq.McqParentInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class onRequestEndPosition {
    public static final McqParentInfo read(C0162cache c0162cache) {
        toMagicModuleMetaRepoModel.write(c0162cache, "");
        McqParentInfo mcqParentInfo = new McqParentInfo();
        mcqParentInfo.setMCQId(c0162cache.AudioAttributesCompatParcelizer());
        mcqParentInfo.setParentId(c0162cache.read());
        mcqParentInfo.setParentType(c0162cache.write());
        mcqParentInfo.setSortOrder(c0162cache.IconCompatParcelizer());
        mcqParentInfo.setParentMcqId(c0162cache.RemoteActionCompatParcelizer());
        return mcqParentInfo;
    }
}
