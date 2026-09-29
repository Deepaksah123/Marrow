package com.marrow2.data.bookmark.remote.model;

import kotlin.Metadata;
import kotlin.isWritingToCache;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow2/data/bookmark/remote/model/ResetBookmarkResponseBody;", "Lo/isWritingToCache;", "toResetBookmarkRepoModel", "(Lcom/marrow2/data/bookmark/remote/model/ResetBookmarkResponseBody;)Lo/isWritingToCache;"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class ResetBookmarkResponseBodyKt {
    public static final isWritingToCache toResetBookmarkRepoModel(ResetBookmarkResponseBody resetBookmarkResponseBody) {
        toMagicModuleMetaRepoModel.write(resetBookmarkResponseBody, "");
        return new isWritingToCache(resetBookmarkResponseBody.isUnBookmarked());
    }
}
