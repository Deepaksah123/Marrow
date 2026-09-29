package kotlin;

import com.marrow2.data.search.remote.model.SearchTextResponseBody;
import com.marrow2.data.search.remote.model.Source;

/* JADX INFO: loaded from: classes3.dex */
public final class Clock {
    public static final toBundleSparseArray IconCompatParcelizer(SearchTextResponseBody searchTextResponseBody) {
        toMagicModuleMetaRepoModel.write(searchTextResponseBody, "");
        return new toBundleSparseArray(searchTextResponseBody.getId(), searchTextResponseBody.getIndex(), searchTextResponseBody.getScore(), searchTextResponseBody.getSortOrder(), RemoteActionCompatParcelizer(searchTextResponseBody.getSource()), searchTextResponseBody.getType());
    }

    private static currentTimeMillis RemoteActionCompatParcelizer(Source source) {
        toMagicModuleMetaRepoModel.write(source, "");
        return new currentTimeMillis(source.getContentType(), source.getVideoStartTime(), source.getRootSubjectIds(), source.getVideoId(), source.getTitle(), source.getSubTitle(), source.getTestType(), source.getPytMcqCount());
    }
}
