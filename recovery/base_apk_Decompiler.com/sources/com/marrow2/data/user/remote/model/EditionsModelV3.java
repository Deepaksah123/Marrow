package com.marrow2.data.user.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.common.CourseResponseKeyConstantsKt;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J@\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0010R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u000eR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001c\u0010!\u001a\u0004\u0018\u00010\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010\u0010"}, d2 = {"Lcom/marrow2/data/user/remote/model/EditionsModelV3;", "", "", "p0", "", "p1", "", "p2", "p3", "<init>", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/Boolean;", "component3", "()Ljava/lang/String;", "component4", "copy", "(Ljava/lang/Integer;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/user/remote/model/EditionsModelV3;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "toString", "id", "Ljava/lang/Integer;", "getId", "isDefault", "Ljava/lang/Boolean;", CourseResponseKeyConstantsKt.KEY_SUBTITLE, "Ljava/lang/String;", "getSubtitle", "title", "getTitle"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EditionsModelV3 {
    public static final int $stable = 0;

    @JsonProperty("id")
    private final Integer id;

    @JsonProperty(CourseResponseKeyConstantsKt.KEY_IS_DEFAULT)
    private final Boolean isDefault;

    @JsonProperty(CourseResponseKeyConstantsKt.KEY_SUBTITLE)
    private final String subtitle;

    @JsonProperty("title")
    private final String title;

    public EditionsModelV3(Integer num, Boolean bool, String str, String str2) {
        this.id = num;
        this.isDefault = bool;
        this.subtitle = str;
        this.title = str2;
    }

    public /* synthetic */ EditionsModelV3(Integer num, Boolean bool, String str, String str2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : bool, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : str2);
    }

    public final Integer getId() {
        return this.id;
    }

    public final Boolean isDefault() {
        return this.isDefault;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }

    public final String getTitle() {
        return this.title;
    }

    public EditionsModelV3() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ EditionsModelV3 copy$default(EditionsModelV3 editionsModelV3, Integer num, Boolean bool, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            num = editionsModelV3.id;
        }
        if ((i & 2) != 0) {
            bool = editionsModelV3.isDefault;
        }
        if ((i & 4) != 0) {
            str = editionsModelV3.subtitle;
        }
        if ((i & 8) != 0) {
            str2 = editionsModelV3.title;
        }
        return editionsModelV3.copy(num, bool, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Integer getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Boolean getIsDefault() {
        return this.isDefault;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final EditionsModelV3 copy(Integer p0, Boolean p1, String p2, String p3) {
        return new EditionsModelV3(p0, p1, p2, p3);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof EditionsModelV3)) {
            return false;
        }
        EditionsModelV3 editionsModelV3 = (EditionsModelV3) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.id, editionsModelV3.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.isDefault, editionsModelV3.isDefault) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.subtitle, (Object) editionsModelV3.subtitle) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) editionsModelV3.title);
    }

    public final int hashCode() {
        Integer num = this.id;
        int iHashCode = num == null ? 0 : num.hashCode();
        Boolean bool = this.isDefault;
        int iHashCode2 = bool == null ? 0 : bool.hashCode();
        String str = this.subtitle;
        int iHashCode3 = str == null ? 0 : str.hashCode();
        String str2 = this.title;
        return (((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        Integer num = this.id;
        Boolean bool = this.isDefault;
        String str = this.subtitle;
        String str2 = this.title;
        StringBuilder sb = new StringBuilder("EditionsModelV3(id=");
        sb.append(num);
        sb.append(", isDefault=");
        sb.append(bool);
        sb.append(", subtitle=");
        sb.append(str);
        sb.append(", title=");
        sb.append(str2);
        sb.append(")");
        return sb.toString();
    }
}
