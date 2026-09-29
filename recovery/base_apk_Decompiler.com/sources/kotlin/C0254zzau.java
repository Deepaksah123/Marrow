package kotlin;

import com.marrow.data.models.lesson.home.HomeLessonIndexV2;

/* JADX INFO: renamed from: o.zzau, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C0254zzau {
    public static final getNextRepeatMode read(HomeLessonIndexV2 homeLessonIndexV2, requiresCacheSpanTouches requirescachespantouches) {
        toMagicModuleMetaRepoModel.write(homeLessonIndexV2, "");
        toMagicModuleMetaRepoModel.write(requirescachespantouches, "");
        String id = homeLessonIndexV2.getLessonIndex().getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
        String title = homeLessonIndexV2.getLessonIndex().getTitle();
        String str = title == null ? "" : title;
        int tag = homeLessonIndexV2.getTag();
        int i = homeLessonIndexV2.updatedCount;
        int i2 = homeLessonIndexV2.newCount;
        float f = homeLessonIndexV2.videoProgress;
        int remoteActionCompatParcelizer = requirescachespantouches.getRemoteActionCompatParcelizer();
        int iconCompatParcelizer = requirescachespantouches.getIconCompatParcelizer();
        String rootSubjectId = homeLessonIndexV2.getLessonIndex().getRootSubjectId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rootSubjectId, "");
        return new getNextRepeatMode(id, str, tag, i, i2, f, remoteActionCompatParcelizer, iconCompatParcelizer, rootSubjectId);
    }
}
