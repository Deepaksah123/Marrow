package kotlin;

import com.google.android.exoplayer2.analytics.AnalyticsListener;
import com.marrow.data.models.mcq.McqAnswer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class delete {
    public static final CacheFileMetadataIndex RemoteActionCompatParcelizer(McqAnswer mcqAnswer) {
        List listRemoteActionCompatParcelizer;
        if (mcqAnswer != null) {
            String strIconCompatParcelizer = PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(mcqAnswer.getParentId());
            String strIconCompatParcelizer2 = PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(mcqAnswer.getMcqId());
            int serverAnswer = mcqAnswer.getServerAnswer();
            boolean zIsRight = mcqAnswer.isRight();
            boolean zIsSillyMistake = mcqAnswer.isSillyMistake();
            boolean zIsGuessed = mcqAnswer.isGuessed();
            String strIconCompatParcelizer3 = PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(mcqAnswer.getParentMcqId());
            String[] highYieldIds = mcqAnswer.getHighYieldIds();
            if (highYieldIds == null || (listRemoteActionCompatParcelizer = getOrderDetails.onCommand(highYieldIds)) == null) {
                listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            }
            return new CacheFileMetadataIndex(strIconCompatParcelizer, strIconCompatParcelizer2, serverAnswer, zIsRight, zIsSillyMistake, zIsGuessed, strIconCompatParcelizer3, listRemoteActionCompatParcelizer, mcqAnswer.isStarred(), mcqAnswer.getFirstAnswer());
        }
        return new CacheFileMetadataIndex(null, null, 0, false, false, false, null, null, false, 0, AnalyticsListener.EVENT_DRM_KEYS_LOADED, null);
    }

    public static final List<CacheFileMetadataIndex> IconCompatParcelizer(List<dropTable> list) {
        toMagicModuleMetaRepoModel.write(list, "");
        ArrayList arrayList = new ArrayList();
        for (dropTable droptable : list) {
            arrayList.add(new CacheFileMetadataIndex(droptable.getAudioAttributesImplApi21Parcelizer(), droptable.getMediaBrowserCompatItemReceiver(), droptable.getMediaBrowserCompatCustomActionResultReceiver(), droptable.getIconCompatParcelizer(), false, droptable.getRead(), PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(droptable.getAudioAttributesImplApi26Parcelizer()), null, droptable.getAudioAttributesImplBaseParcelizer(), droptable.getRemoteActionCompatParcelizer(), 144, null));
        }
        return arrayList;
    }
}
