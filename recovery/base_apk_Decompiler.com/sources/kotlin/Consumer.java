package kotlin;

import com.marrow.data.models.lesson.StepIndex;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class Consumer {
    public static final ColorParser write(StepIndex stepIndex) {
        toMagicModuleMetaRepoModel.write(stepIndex, "");
        String id = stepIndex.getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
        String relatedLessonId = stepIndex.getRelatedLessonId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(relatedLessonId, "");
        String title = stepIndex.getTitle();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(title, "");
        String readTime = stepIndex.getReadTime();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(readTime, "");
        int stepType = stepIndex.getStepType();
        String str = stepIndex.mStepEncryptBody;
        String str2 = str == null ? "" : str;
        int courseId = stepIndex.getCourseId();
        String str3 = stepIndex.videoEncrypt;
        String str4 = str3 == null ? "" : str3;
        String psshData = stepIndex.getPsshData();
        String str5 = psshData == null ? "" : psshData;
        String videoMetaEncrypt = stepIndex.getVideoMetaEncrypt();
        String str6 = videoMetaEncrypt == null ? "" : videoMetaEncrypt;
        int slidesCount = stepIndex.getSlidesCount();
        int notesCount = stepIndex.getNotesCount();
        List<parseColorInternal> listWrite = count.write(stepIndex.videoTimelines);
        if (listWrite == null) {
            listWrite = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        }
        return new ColorParser(id, relatedLessonId, title, readTime, 0, stepType, str2, courseId, str4, str5, str6, slidesCount, notesCount, listWrite, stepIndex.isResumeExplanation(), 16, null);
    }
}
