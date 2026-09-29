package com.marrow.data.api.models.request.pearl;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.request.MarrowRequestBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\n\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\"\u0010\u0007\u001a\u00020\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/marrow/data/api/models/request/pearl/PearlBookmarkRequestBody;", "Lcom/marrow/data/api/models/request/MarrowRequestBody;", "", "p0", "p1", "<init>", "(II)V", "bookmarkType", "I", "getBookmarkType", "()I", "setBookmarkType", "(I)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class PearlBookmarkRequestBody extends MarrowRequestBody {

    @JsonProperty("bookmark_type")
    private int bookmarkType;

    public PearlBookmarkRequestBody(int i, int i2) {
        super(i);
        this.bookmarkType = i2;
    }

    public /* synthetic */ PearlBookmarkRequestBody(int i, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, (i3 & 2) != 0 ? 0 : i2);
    }

    public final int getBookmarkType() {
        return this.bookmarkType;
    }

    public final void setBookmarkType(int i) {
        this.bookmarkType = i;
    }

    public PearlBookmarkRequestBody(int i) {
        this(i, 0, 2, null);
    }
}
