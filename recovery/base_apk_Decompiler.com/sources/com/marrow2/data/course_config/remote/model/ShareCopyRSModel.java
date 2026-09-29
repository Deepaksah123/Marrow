package com.marrow2.data.course_config.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\u000bJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000bJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJB\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0003\u001a\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u00022\b\b\u0003\u0010\u0005\u001a\u00020\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00022\b\b\u0003\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001a\u0010\u001c\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u001e\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001a\u001a\u0004\b\u001f\u0010\u000bR\u001a\u0010 \u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001a\u001a\u0004\b!\u0010\u000bR\u001a\u0010\"\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\"\u0010\u001a\u001a\u0004\b#\u0010\u000b"}, d2 = {"Lcom/marrow2/data/course_config/remote/model/ShareCopyRSModel;", "", "", "p0", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/course_config/remote/model/ShareCopyRSModel;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "title", "Ljava/lang/String;", "getTitle", "description", "getDescription", "longDescription", "getLongDescription", "shortDescription", "getShortDescription", "subject", "getSubject"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ShareCopyRSModel {
    public static final int $stable = 0;
    private final String description;
    private final String longDescription;
    private final String shortDescription;
    private final String subject;
    private final String title;

    public ShareCopyRSModel(@JsonProperty("share_screen_title") String str, @JsonProperty("share_screen_description") String str2, @JsonProperty("share_long_description") String str3, @JsonProperty("share_short_description") String str4, @JsonProperty("share_subject") String str5) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        this.title = str;
        this.description = str2;
        this.longDescription = str3;
        this.shortDescription = str4;
        this.subject = str5;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getLongDescription() {
        return this.longDescription;
    }

    public final String getShortDescription() {
        return this.shortDescription;
    }

    public final String getSubject() {
        return this.subject;
    }

    public static /* synthetic */ ShareCopyRSModel copy$default(ShareCopyRSModel shareCopyRSModel, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareCopyRSModel.title;
        }
        if ((i & 2) != 0) {
            str2 = shareCopyRSModel.description;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = shareCopyRSModel.longDescription;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = shareCopyRSModel.shortDescription;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = shareCopyRSModel.subject;
        }
        return shareCopyRSModel.copy(str, str6, str7, str8, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLongDescription() {
        return this.longDescription;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getShortDescription() {
        return this.shortDescription;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSubject() {
        return this.subject;
    }

    public final ShareCopyRSModel copy(@JsonProperty("share_screen_title") String p0, @JsonProperty("share_screen_description") String p1, @JsonProperty("share_long_description") String p2, @JsonProperty("share_short_description") String p3, @JsonProperty("share_subject") String p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p4, "");
        return new ShareCopyRSModel(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof ShareCopyRSModel)) {
            return false;
        }
        ShareCopyRSModel shareCopyRSModel = (ShareCopyRSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) shareCopyRSModel.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.description, (Object) shareCopyRSModel.description) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.longDescription, (Object) shareCopyRSModel.longDescription) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.shortDescription, (Object) shareCopyRSModel.shortDescription) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.subject, (Object) shareCopyRSModel.subject);
    }

    public final int hashCode() {
        return (((((((this.title.hashCode() * 31) + this.description.hashCode()) * 31) + this.longDescription.hashCode()) * 31) + this.shortDescription.hashCode()) * 31) + this.subject.hashCode();
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.description;
        String str3 = this.longDescription;
        String str4 = this.shortDescription;
        String str5 = this.subject;
        StringBuilder sb = new StringBuilder("ShareCopyRSModel(title=");
        sb.append(str);
        sb.append(", description=");
        sb.append(str2);
        sb.append(", longDescription=");
        sb.append(str3);
        sb.append(", shortDescription=");
        sb.append(str4);
        sb.append(", subject=");
        sb.append(str5);
        sb.append(")");
        return sb.toString();
    }
}
