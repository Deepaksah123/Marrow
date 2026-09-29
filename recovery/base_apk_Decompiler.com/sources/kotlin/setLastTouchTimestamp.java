package kotlin;

import com.marrow.data.models.mcq.McqAnswer;

/* JADX INFO: loaded from: classes3.dex */
public final class setLastTouchTimestamp {
    public static final McqAnswer read(CachedContentRange cachedContentRange) {
        toMagicModuleMetaRepoModel.write(cachedContentRange, "");
        McqAnswer mcqAnswer = new McqAnswer();
        mcqAnswer.setServerAnswer(cachedContentRange.getMediaBrowserCompatMediaItem());
        mcqAnswer.setFirstAnswer(cachedContentRange.getRead());
        mcqAnswer.setRight(cachedContentRange.getMediaBrowserCompatItemReceiver());
        mcqAnswer.setParentId(cachedContentRange.getAudioAttributesImplApi26Parcelizer());
        mcqAnswer.setParentMcqId(cachedContentRange.getMediaDescriptionCompat());
        mcqAnswer.setMcqId(cachedContentRange.getAudioAttributesImplBaseParcelizer());
        mcqAnswer.setStarred(cachedContentRange.getMediaBrowserCompatCustomActionResultReceiver());
        mcqAnswer.setGuessed(cachedContentRange.getWrite());
        mcqAnswer.setHighYieldIds((String[]) cachedContentRange.RemoteActionCompatParcelizer().toArray(new String[0]));
        mcqAnswer.setSillyMistake(cachedContentRange.getAudioAttributesImplApi21Parcelizer());
        return mcqAnswer;
    }

    public static final CachedContentRange IconCompatParcelizer(McqAnswer mcqAnswer) {
        toMagicModuleMetaRepoModel.write(mcqAnswer, "");
        String parentId = mcqAnswer.getParentId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parentId, "");
        String mcqId = mcqAnswer.getMcqId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mcqId, "");
        int serverAnswer = mcqAnswer.getServerAnswer();
        boolean zIsRight = mcqAnswer.isRight();
        boolean zIsGuessed = mcqAnswer.isGuessed();
        String parentMcqId = mcqAnswer.getParentMcqId();
        return new CachedContentRange(parentId, mcqId, serverAnswer, zIsRight, zIsGuessed, parentMcqId == null ? "" : parentMcqId, mcqAnswer.isStarred(), mcqAnswer.getFirstAnswer(), false, null, false, 1792, null);
    }
}
