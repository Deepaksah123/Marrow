package kotlin;

import com.marrow.data.models.subject.SubjectCompletionInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class removeResource {
    public static final isCached read(SubjectCompletionInfo subjectCompletionInfo) {
        toMagicModuleMetaRepoModel.write(subjectCompletionInfo, "");
        String str = subjectCompletionInfo.id;
        String str2 = subjectCompletionInfo.title;
        String str3 = subjectCompletionInfo.imageUrl;
        return new isCached(str, str2, str3 == null ? "" : str3, subjectCompletionInfo.totalLessons, subjectCompletionInfo.completedCount, subjectCompletionInfo.lastOpened, subjectCompletionInfo.cardType, subjectCompletionInfo.totalNewLessons, subjectCompletionInfo.isInteractive, subjectCompletionInfo.allNewActive, subjectCompletionInfo.allNewExpiresOn, subjectCompletionInfo.allNewActiveEdition);
    }
}
