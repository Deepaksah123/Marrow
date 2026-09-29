package kotlin;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.google.android.exoplayer2.offline.DownloadService;
import com.marrow.data.models.custommodule.FilterParams;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0015\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0016R\u0014\u0010\u0019\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0016R\u0014\u0010\u001a\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\n8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e"}, d2 = {"Lo/isFallbackAvailable;", "", "", "p0", "p1", "p2", "p3", "", "p4", "p5", "", "p6", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/util/List;)V", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "()Ljava/lang/String;", "contentType", "Ljava/lang/String;", "contentId", "title", "courseId", "rating", "I", "feedbackType", "ratingTags", "Ljava/util/List;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class isFallbackAvailable {
    public static final int $stable = 8;

    @JsonProperty(DownloadService.KEY_CONTENT_ID)
    private final String contentId;

    @JsonProperty("content_type")
    private final String contentType;

    @JsonProperty(FilterParams.KEY_COURSE_ID)
    private final String courseId;

    @JsonProperty("feedback_type")
    private final int feedbackType;

    @JsonProperty("rating")
    private final int rating;

    @JsonProperty("rating_tags")
    private final List<String> ratingTags;

    @JsonProperty("title")
    private final String title;

    public isFallbackAvailable(String str, String str2, String str3, String str4, int i, int i2, List<String> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(list, "");
        this.contentType = str;
        this.contentId = str2;
        this.title = str3;
        this.courseId = str4;
        this.rating = i;
        this.feedbackType = i2;
        this.ratingTags = list;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof isFallbackAvailable)) {
            return false;
        }
        isFallbackAvailable isfallbackavailable = (isFallbackAvailable) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.contentType, (Object) isfallbackavailable.contentType) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.contentId, (Object) isfallbackavailable.contentId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) isfallbackavailable.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.courseId, (Object) isfallbackavailable.courseId) && this.rating == isfallbackavailable.rating && this.feedbackType == isfallbackavailable.feedbackType && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.ratingTags, isfallbackavailable.ratingTags);
    }

    public final int hashCode() {
        return (((((((((((this.contentType.hashCode() * 31) + this.contentId.hashCode()) * 31) + this.title.hashCode()) * 31) + this.courseId.hashCode()) * 31) + Integer.hashCode(this.rating)) * 31) + Integer.hashCode(this.feedbackType)) * 31) + this.ratingTags.hashCode();
    }

    public final String toString() {
        String str = this.contentType;
        String str2 = this.contentId;
        String str3 = this.title;
        String str4 = this.courseId;
        int i = this.rating;
        int i2 = this.feedbackType;
        List<String> list = this.ratingTags;
        StringBuilder sb = new StringBuilder("isFallbackAvailable(contentType=");
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
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }
}
