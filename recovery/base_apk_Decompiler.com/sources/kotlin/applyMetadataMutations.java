package kotlin;

import com.marrow.data.models.mcq.bookmark.MultiBookmarkCounter;

/* JADX INFO: loaded from: classes3.dex */
public final class applyMetadataMutations {
    public static final CacheWriterProgressListener write(MultiBookmarkCounter multiBookmarkCounter) {
        toMagicModuleMetaRepoModel.write(multiBookmarkCounter, "");
        return new CacheWriterProgressListener(multiBookmarkCounter.getBookmarkType(), multiBookmarkCounter.getBookmarkCount());
    }
}
