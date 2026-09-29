package com.marrow2.data.pearl.remote.model;

import kotlin.CmcdHeadersFactoryStreamType;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\b\u001a\u00020\u00048\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r"}, d2 = {"Lcom/marrow2/data/pearl/remote/model/PearlBookmarkRequestBody;", "Lo/CmcdHeadersFactoryStreamType;", "", "p0", "", "p1", "<init>", "(ILjava/lang/String;)V", "bookmark_type", "Ljava/lang/String;", "getBookmark_type", "()Ljava/lang/String;", "setBookmark_type", "(Ljava/lang/String;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PearlBookmarkRequestBody extends CmcdHeadersFactoryStreamType {
    public static final int $stable = 8;
    private String bookmark_type;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PearlBookmarkRequestBody(int i, String str) {
        super(String.valueOf(i));
        toMagicModuleMetaRepoModel.write(str, "");
        this.bookmark_type = str;
    }

    public final String getBookmark_type() {
        return this.bookmark_type;
    }

    public final void setBookmark_type(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.bookmark_type = str;
    }
}
