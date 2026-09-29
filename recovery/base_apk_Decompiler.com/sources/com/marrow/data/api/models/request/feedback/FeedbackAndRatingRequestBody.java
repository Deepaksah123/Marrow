package com.marrow.data.api.models.request.feedback;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.exoplayer2.offline.DownloadService;
import com.marrow.data.models.custommodule.FilterParams;
import java.io.Serializable;
import java.util.Arrays;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u001f\b\u0087\b\u0018\u00002\u00020\u0001B[\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u000fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000fJ\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u000fJ\u0010\u0010\u0013\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0016\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017Jd\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0014J\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u000fR$\u0010 \u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010\u000f\"\u0004\b#\u0010$R$\u0010%\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\u000f\"\u0004\b'\u0010$R$\u0010(\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b(\u0010!\u001a\u0004\b)\u0010\u000f\"\u0004\b*\u0010$R$\u0010+\u001a\u0004\u0018\u00010\u00028\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b+\u0010!\u001a\u0004\b,\u0010\u000f\"\u0004\b-\u0010$R\"\u0010.\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b.\u0010/\u001a\u0004\b0\u0010\u0014\"\u0004\b1\u00102R\"\u00103\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b3\u0010/\u001a\u0004\b4\u0010\u0014\"\u0004\b5\u00102R(\u00106\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b6\u00107\u001a\u0004\b8\u0010\u0017\"\u0004\b9\u0010:"}, d2 = {"Lcom/marrow/data/api/models/request/feedback/FeedbackAndRatingRequestBody;", "Ljava/io/Serializable;", "", "p0", "p1", "p2", "p3", "", "p4", "p5", "", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II[Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()I", "component6", "component7", "()[Ljava/lang/String;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II[Ljava/lang/String;)Lcom/marrow/data/api/models/request/feedback/FeedbackAndRatingRequestBody;", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "contentType", "Ljava/lang/String;", "getContentType", "setContentType", "(Ljava/lang/String;)V", "contentId", "getContentId", "setContentId", "title", "getTitle", "setTitle", "courseId", "getCourseId", "setCourseId", "rating", "I", "getRating", "setRating", "(I)V", "feedbackType", "getFeedbackType", "setFeedbackType", "ratingTags", "[Ljava/lang/String;", "getRatingTags", "setRatingTags", "([Ljava/lang/String;)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FeedbackAndRatingRequestBody implements Serializable {
    private String contentId;
    private String contentType;
    private String courseId;
    private int feedbackType;
    private int rating;
    private String[] ratingTags;
    private String title;

    public FeedbackAndRatingRequestBody(String str, String str2, String str3, String str4, int i, int i2, String[] strArr) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        this.contentType = str;
        this.contentId = str2;
        this.title = str3;
        this.courseId = str4;
        this.rating = i;
        this.feedbackType = i2;
        this.ratingTags = strArr;
    }

    @JsonProperty("content_type")
    public final String getContentType() {
        return this.contentType;
    }

    public final void setContentType(String str) {
        this.contentType = str;
    }

    @JsonProperty(DownloadService.KEY_CONTENT_ID)
    public final String getContentId() {
        return this.contentId;
    }

    public final void setContentId(String str) {
        this.contentId = str;
    }

    @JsonProperty("title")
    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    @JsonProperty(FilterParams.KEY_COURSE_ID)
    public final String getCourseId() {
        return this.courseId;
    }

    public final void setCourseId(String str) {
        this.courseId = str;
    }

    @JsonProperty("rating")
    public final int getRating() {
        return this.rating;
    }

    public final void setRating(int i) {
        this.rating = i;
    }

    @JsonProperty("feedback_type")
    public final int getFeedbackType() {
        return this.feedbackType;
    }

    public final void setFeedbackType(int i) {
        this.feedbackType = i;
    }

    public /* synthetic */ FeedbackAndRatingRequestBody(String str, String str2, String str3, String str4, int i, int i2, String[] strArr, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? null : str, (i3 & 2) != 0 ? null : str2, (i3 & 4) != 0 ? null : str3, (i3 & 8) != 0 ? null : str4, (i3 & 16) != 0 ? 0 : i, (i3 & 32) != 0 ? 0 : i2, (i3 & 64) != 0 ? new String[0] : strArr);
    }

    @JsonProperty("rating_tags")
    public final String[] getRatingTags() {
        return this.ratingTags;
    }

    public final void setRatingTags(String[] strArr) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        this.ratingTags = strArr;
    }

    public FeedbackAndRatingRequestBody() {
        this(null, null, null, null, 0, 0, null, 127, null);
    }

    public static /* synthetic */ FeedbackAndRatingRequestBody copy$default(FeedbackAndRatingRequestBody feedbackAndRatingRequestBody, String str, String str2, String str3, String str4, int i, int i2, String[] strArr, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = feedbackAndRatingRequestBody.contentType;
        }
        if ((i3 & 2) != 0) {
            str2 = feedbackAndRatingRequestBody.contentId;
        }
        String str5 = str2;
        if ((i3 & 4) != 0) {
            str3 = feedbackAndRatingRequestBody.title;
        }
        String str6 = str3;
        if ((i3 & 8) != 0) {
            str4 = feedbackAndRatingRequestBody.courseId;
        }
        String str7 = str4;
        if ((i3 & 16) != 0) {
            i = feedbackAndRatingRequestBody.rating;
        }
        int i4 = i;
        if ((i3 & 32) != 0) {
            i2 = feedbackAndRatingRequestBody.feedbackType;
        }
        int i5 = i2;
        if ((i3 & 64) != 0) {
            strArr = feedbackAndRatingRequestBody.ratingTags;
        }
        return feedbackAndRatingRequestBody.copy(str, str5, str6, str7, i4, i5, strArr);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getContentType() {
        return this.contentType;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContentId() {
        return this.contentId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRating() {
        return this.rating;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getFeedbackType() {
        return this.feedbackType;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String[] getRatingTags() {
        return this.ratingTags;
    }

    public final FeedbackAndRatingRequestBody copy(String p0, String p1, String p2, String p3, int p4, int p5, String[] p6) {
        toMagicModuleMetaRepoModel.write(p6, "");
        return new FeedbackAndRatingRequestBody(p0, p1, p2, p3, p4, p5, p6);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof FeedbackAndRatingRequestBody)) {
            return false;
        }
        FeedbackAndRatingRequestBody feedbackAndRatingRequestBody = (FeedbackAndRatingRequestBody) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.contentType, (Object) feedbackAndRatingRequestBody.contentType) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.contentId, (Object) feedbackAndRatingRequestBody.contentId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) feedbackAndRatingRequestBody.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.courseId, (Object) feedbackAndRatingRequestBody.courseId) && this.rating == feedbackAndRatingRequestBody.rating && this.feedbackType == feedbackAndRatingRequestBody.feedbackType && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.ratingTags, feedbackAndRatingRequestBody.ratingTags);
    }

    public final int hashCode() {
        String str = this.contentType;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.contentId;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.title;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.courseId;
        return (((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + Integer.hashCode(this.rating)) * 31) + Integer.hashCode(this.feedbackType)) * 31) + Arrays.hashCode(this.ratingTags);
    }

    public final String toString() {
        String str = this.contentType;
        String str2 = this.contentId;
        String str3 = this.title;
        String str4 = this.courseId;
        int i = this.rating;
        int i2 = this.feedbackType;
        String string = Arrays.toString(this.ratingTags);
        StringBuilder sb = new StringBuilder("FeedbackAndRatingRequestBody(contentType=");
        sb.append(str);
        sb.append(", contentId=");
        sb.append(str2);
        sb.append(", title=");
        sb.append(str3);
        sb.append(", courseId=");
        sb.append(str4);
        sb.append(", rating=");
        sb.append(i);
        sb.append(", feedbackType=");
        sb.append(i2);
        sb.append(", ratingTags=");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
