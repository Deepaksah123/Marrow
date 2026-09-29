package kotlin;

import com.marrow.data.models.mcq.McqTimerAnalyticsModel;

/* JADX INFO: loaded from: classes3.dex */
public final class getCipher {
    public static final writeContentMetadata read(McqTimerAnalyticsModel mcqTimerAnalyticsModel) {
        toMagicModuleMetaRepoModel.write(mcqTimerAnalyticsModel, "");
        return new writeContentMetadata(mcqTimerAnalyticsModel.getMcqId(), mcqTimerAnalyticsModel.getParentId(), mcqTimerAnalyticsModel.getFirstAttemptTime(), mcqTimerAnalyticsModel.getReviewTime(), mcqTimerAnalyticsModel.getChangeAnswerTime(), mcqTimerAnalyticsModel.getHasBeenAnswered());
    }

    public static final McqTimerAnalyticsModel write(writeContentMetadata writecontentmetadata) {
        toMagicModuleMetaRepoModel.write(writecontentmetadata, "");
        return new McqTimerAnalyticsModel(writecontentmetadata.IconCompatParcelizer(), writecontentmetadata.read(), writecontentmetadata.write(), writecontentmetadata.RemoteActionCompatParcelizer(), writecontentmetadata.AudioAttributesImplBaseParcelizer(), writecontentmetadata.AudioAttributesCompatParcelizer());
    }
}
