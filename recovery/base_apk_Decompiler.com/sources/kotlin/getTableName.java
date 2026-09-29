package kotlin;

import com.marrow.data.models.mcq.McqAnswer;

/* JADX INFO: loaded from: classes3.dex */
public final class getTableName {
    public static final McqAnswer write(dropTable droptable) {
        toMagicModuleMetaRepoModel.write(droptable, "");
        McqAnswer mcqAnswer = new McqAnswer();
        mcqAnswer.setServerAnswer(droptable.getMediaBrowserCompatCustomActionResultReceiver());
        mcqAnswer.setFirstAnswer(droptable.getRemoteActionCompatParcelizer());
        mcqAnswer.setRight(droptable.getIconCompatParcelizer());
        mcqAnswer.setParentId(droptable.getAudioAttributesImplApi21Parcelizer());
        mcqAnswer.setParentMcqId(droptable.getAudioAttributesImplApi26Parcelizer());
        mcqAnswer.setMcqId(droptable.getMediaBrowserCompatItemReceiver());
        mcqAnswer.setStarred(droptable.getAudioAttributesImplBaseParcelizer());
        mcqAnswer.setGuessed(droptable.getRead());
        return mcqAnswer;
    }

    public static final dropTable IconCompatParcelizer(McqAnswer mcqAnswer) {
        toMagicModuleMetaRepoModel.write(mcqAnswer, "");
        String parentId = mcqAnswer.getParentId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parentId, "");
        String mcqId = mcqAnswer.getMcqId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mcqId, "");
        int serverAnswer = mcqAnswer.getServerAnswer();
        boolean zIsRight = mcqAnswer.isRight();
        boolean zIsGuessed = mcqAnswer.isGuessed();
        String parentMcqId = mcqAnswer.getParentMcqId();
        return new dropTable(parentId, mcqId, serverAnswer, zIsRight, zIsGuessed, parentMcqId == null ? "" : parentMcqId, mcqAnswer.isStarred(), mcqAnswer.getFirstAnswer(), false, 256, null);
    }
}
