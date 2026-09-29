package kotlin;

import com.marrow2.data.lesson.remote.model.MarkLessonCompleteRequestBody;

/* JADX INFO: loaded from: classes3.dex */
public final class CacheDataSource {
    public static final MarkLessonCompleteRequestBody write(closeCurrentSource closecurrentsource) {
        toMagicModuleMetaRepoModel.write(closecurrentsource, "");
        return new MarkLessonCompleteRequestBody(closecurrentsource.AudioAttributesCompatParcelizer(), closecurrentsource.getRead(), closecurrentsource.getAudioAttributesCompatParcelizer());
    }
}
