package kotlin;

import com.marrow.data.models.lesson.LessonIndex;
import com.marrow.ui.fragments.learn.model.ActiveRecallQbankLessonUiModel;

/* JADX INFO: loaded from: classes3.dex */
public final class traverseForImage {
    public static final ActiveRecallQbankLessonUiModel read(LessonIndex lessonIndex) {
        toMagicModuleMetaRepoModel.write(lessonIndex, "");
        String id = lessonIndex.getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
        int mCQCount = lessonIndex.getMCQCount();
        ContentDataSourceContentDataSourceException contentDataSourceContentDataSourceException = ContentDataSourceContentDataSourceException.INSTANCE;
        return new ActiveRecallQbankLessonUiModel(id, mCQCount, getOnline.RemoteActionCompatParcelizer(ContentDataSourceContentDataSourceException.IconCompatParcelizer(Integer.valueOf(lessonIndex.getScore()), Integer.valueOf(lessonIndex.getPossibleScore()))), lessonIndex.getAverageRating(), lessonIndex.getCompletionTimeMs(), lessonIndex.getStatus() == 2, lessonIndex.getStatus() == 1);
    }
}
