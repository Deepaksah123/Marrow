package com.marrow.data.api.models.response.mcq;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.response.IResetResponseBody;
import kotlin.isDvbProfileDeclared;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class BookmarkResponseBody implements IResetResponseBody {

    @JsonProperty("is_bookmarked")
    public boolean isBookmarked;

    @JsonProperty("is_unbookmarked")
    public boolean isUnbookmarked;

    public static BookmarkResponseBody create(boolean z) {
        BookmarkResponseBody bookmarkResponseBody = new BookmarkResponseBody();
        bookmarkResponseBody.isBookmarked = z;
        bookmarkResponseBody.isUnbookmarked = !z;
        return bookmarkResponseBody;
    }

    public String toString() {
        JSONObject jSONObject = new JSONObject();
        isDvbProfileDeclared.AudioAttributesCompatParcelizer(jSONObject, "is_unbookmarked", Boolean.valueOf(this.isUnbookmarked));
        isDvbProfileDeclared.AudioAttributesCompatParcelizer(jSONObject, "is_bookmarked", Boolean.valueOf(this.isBookmarked));
        return jSONObject.toString();
    }

    @Override // com.marrow.data.api.models.response.IResetResponseBody
    public boolean isResetDone() {
        return this.isUnbookmarked;
    }
}
