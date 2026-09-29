package com.marrow2.data.bookmark.remote.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.request.MarrowRequestBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bR$\u0010\t\u001a\u0004\u0018\u00010\u00048\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014"}, d2 = {"Lcom/marrow2/data/bookmark/remote/model/ResetBookmarkRequestBody;", "Lcom/marrow/data/api/models/request/MarrowRequestBody;", "", "p0", "", "p1", "p2", "<init>", "(ILjava/lang/String;Ljava/lang/Integer;)V", "mcqId", "Ljava/lang/String;", "getMcqId", "()Ljava/lang/String;", "setMcqId", "(Ljava/lang/String;)V", "bookmarkType", "Ljava/lang/Integer;", "getBookmarkType", "()Ljava/lang/Integer;", "setBookmarkType", "(Ljava/lang/Integer;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ResetBookmarkRequestBody extends MarrowRequestBody {
    public static final int $stable = 8;

    @JsonProperty("bookmark_type")
    private Integer bookmarkType;

    @JsonProperty("mcq_ids")
    private String mcqId;

    public ResetBookmarkRequestBody(int i, String str, Integer num) {
        super(i);
        this.mcqId = str;
        this.bookmarkType = num;
    }

    public final String getMcqId() {
        return this.mcqId;
    }

    public final void setMcqId(String str) {
        this.mcqId = str;
    }

    public /* synthetic */ ResetBookmarkRequestBody(int i, String str, Integer num, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(i, (i2 & 2) != 0 ? null : str, (i2 & 4) != 0 ? 0 : num);
    }

    public final Integer getBookmarkType() {
        return this.bookmarkType;
    }

    public final void setBookmarkType(Integer num) {
        this.bookmarkType = num;
    }

    public ResetBookmarkRequestBody(int i) {
        this(i, null, null, 6, null);
    }

    public ResetBookmarkRequestBody(int i, String str) {
        this(i, str, null, 4, null);
    }
}
