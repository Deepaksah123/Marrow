package kotlin;

import com.marrow2.data.inapprating.remote.model.InAppRatingThreshHoldRemoteModel;

/* JADX INFO: loaded from: classes3.dex */
public final class resolveDataSpec {
    public static final resolveReportedUri write(InAppRatingThreshHoldRemoteModel inAppRatingThreshHoldRemoteModel) {
        toMagicModuleMetaRepoModel.write(inAppRatingThreshHoldRemoteModel, "");
        return new resolveReportedUri(inAppRatingThreshHoldRemoteModel.getQbankThreshold(), inAppRatingThreshHoldRemoteModel.getVideoThreshold());
    }
}
