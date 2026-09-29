package kotlin;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class RecentUpdateSubjectDetailsResponse {
    private final Map<String, Object> AudioAttributesCompatParcelizer;
    private final resetBookmarks read;

    public RecentUpdateSubjectDetailsResponse(resetBookmarks resetbookmarks) {
        toMagicModuleMetaRepoModel.write(resetbookmarks, "");
        this.read = resetbookmarks;
        SchemaDetailLessonV2 schemaDetailLessonV2 = SchemaDetailLessonV2.read;
        this.AudioAttributesCompatParcelizer = SchemaDetailLessonV2.write();
    }
}
