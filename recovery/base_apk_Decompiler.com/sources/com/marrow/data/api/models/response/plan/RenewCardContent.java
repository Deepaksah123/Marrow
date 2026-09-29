package com.marrow.data.api.models.response.plan;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.common.CourseResponseKeyConstantsKt;
import kotlin.Metadata;
import kotlin.isFirst;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\tR\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\t"}, d2 = {"Lcom/marrow/data/api/models/response/plan/RenewCardContent;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow/data/api/models/response/plan/RenewCardContent;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "description", "Ljava/lang/String;", "getDescription", "title", "getTitle", "subTitle", "getSubTitle"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RenewCardContent {

    @isFirst(RemoteActionCompatParcelizer = "description")
    private final String description;

    @isFirst(RemoteActionCompatParcelizer = CourseResponseKeyConstantsKt.KEY_SUBTITLE)
    private final String subTitle;

    @isFirst(RemoteActionCompatParcelizer = "title")
    private final String title;

    public RenewCardContent(@JsonProperty("description") String str, @JsonProperty("title") String str2, @JsonProperty(CourseResponseKeyConstantsKt.KEY_SUBTITLE) String str3) {
        this.description = str;
        this.title = str2;
        this.subTitle = str3;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    public static /* synthetic */ RenewCardContent copy$default(RenewCardContent renewCardContent, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = renewCardContent.description;
        }
        if ((i & 2) != 0) {
            str2 = renewCardContent.title;
        }
        if ((i & 4) != 0) {
            str3 = renewCardContent.subTitle;
        }
        return renewCardContent.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    public final RenewCardContent copy(@JsonProperty("description") String p0, @JsonProperty("title") String p1, @JsonProperty(CourseResponseKeyConstantsKt.KEY_SUBTITLE) String p2) {
        return new RenewCardContent(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RenewCardContent)) {
            return false;
        }
        RenewCardContent renewCardContent = (RenewCardContent) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.description, (Object) renewCardContent.description) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) renewCardContent.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.subTitle, (Object) renewCardContent.subTitle);
    }

    public final int hashCode() {
        String str = this.description;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.title;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.subTitle;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.description;
        String str2 = this.title;
        String str3 = this.subTitle;
        StringBuilder sb = new StringBuilder("RenewCardContent(description=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(", subTitle=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
