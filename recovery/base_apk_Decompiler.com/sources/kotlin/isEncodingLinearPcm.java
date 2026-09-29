package kotlin;

import com.marrow.data.models.lesson.home.HomeLessonIndexV2;

/* JADX INFO: loaded from: classes3.dex */
public final class isEncodingLinearPcm {
    public static final isLinebreak write(HomeLessonIndexV2 homeLessonIndexV2, setLogLevel setloglevel, boolean z) {
        Pair pair;
        toMagicModuleMetaRepoModel.write(homeLessonIndexV2, "");
        if (setloglevel != null) {
            ContentDataSourceContentDataSourceException contentDataSourceContentDataSourceException = ContentDataSourceContentDataSourceException.INSTANCE;
            pair = new Pair(Integer.valueOf(getOnline.RemoteActionCompatParcelizer(ContentDataSourceContentDataSourceException.IconCompatParcelizer(Long.valueOf(setloglevel.write()), Long.valueOf(setloglevel.RemoteActionCompatParcelizer())))), Long.valueOf(setloglevel.RemoteActionCompatParcelizer() - setloglevel.write()));
        } else {
            pair = new Pair(0, 0L);
        }
        int iIntValue = ((Number) pair.RemoteActionCompatParcelizer()).intValue();
        String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(((Number) pair.read()).longValue());
        int tag = homeLessonIndexV2.getTag();
        String id = homeLessonIndexV2.getLessonIndex().getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
        String title = homeLessonIndexV2.getLessonIndex().getTitle();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(title, "");
        String rootSubjectId = homeLessonIndexV2.getLessonIndex().getRootSubjectId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rootSubjectId, "");
        String subjectId = homeLessonIndexV2.getLessonIndex().getSubjectId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(subjectId, "");
        String lessonReadTimeText = homeLessonIndexV2.getLessonIndex().getLessonReadTimeText();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonReadTimeText, "");
        String imageUrl = homeLessonIndexV2.getLessonIndex().getImageUrl();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageUrl, "");
        return new isLinebreak(tag, id, title, rootSubjectId, subjectId, lessonReadTimeText, iIntValue, strRemoteActionCompatParcelizer, imageUrl, z);
    }

    private static final String RemoteActionCompatParcelizer(long j) {
        int i = (int) (j / 60000);
        if (i < 5) {
            return "Almost done!";
        }
        if (i < 10) {
            return "Less than 10 mins left";
        }
        if (i < 15) {
            return "Less than 15 mins left";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(" mins left");
        return sb.toString();
    }
}
