package kotlin;

import com.marrow.data.models.lesson.home.HomeLessonIndexV2;

/* JADX INFO: loaded from: classes3.dex */
public final class isImage {
    public static final normalizeMimeType read(HomeLessonIndexV2 homeLessonIndexV2, String str, boolean z, boolean z2, String str2, int i) {
        toMagicModuleMetaRepoModel.write(homeLessonIndexV2, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        String id = homeLessonIndexV2.getLessonIndex().getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
        String title = homeLessonIndexV2.getLessonIndex().getTitle();
        String str3 = title == null ? "" : title;
        String imageUrl = homeLessonIndexV2.getLessonIndex().getImageUrl();
        String str4 = imageUrl != null ? imageUrl : "";
        float averageRating = homeLessonIndexV2.getLessonIndex().getAverageRating();
        int totalPeopleRated = homeLessonIndexV2.getLessonIndex().getTotalPeopleRated();
        int status = homeLessonIndexV2.getLessonIndex().getStatus();
        boolean zIsPaid = homeLessonIndexV2.getLessonIndex().isPaid();
        int tag = homeLessonIndexV2.getTag();
        int i2 = homeLessonIndexV2.newCount;
        int i3 = homeLessonIndexV2.updatedCount;
        int mCQCount = homeLessonIndexV2.getLessonIndex().getMCQCount();
        String rootSubjectId = homeLessonIndexV2.getLessonIndex().getRootSubjectId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rootSubjectId, "");
        String subjectId = homeLessonIndexV2.getLessonIndex().getSubjectId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(subjectId, "");
        return new normalizeMimeType(id, str4, str3, str, averageRating, totalPeopleRated, status, zIsPaid, tag, i2, i3, z, mCQCount, rootSubjectId, subjectId, z2, str2, i);
    }
}
