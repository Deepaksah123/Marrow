package com.marrow2.data.course_config.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.common.CourseResponseKeyConstantsKt;
import java.io.Serializable;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ4\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\tR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\tR\u001c\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\t"}, d2 = {"Lcom/marrow2/data/course_config/remote/model/FreeVideoPromotionRSModel;", "Ljava/io/Serializable;", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/course_config/remote/model/FreeVideoPromotionRSModel;", "", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "title", "Ljava/lang/String;", "getTitle", "subTitle", "getSubTitle", "toolbarTitle", "getToolbarTitle"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FreeVideoPromotionRSModel implements Serializable {
    public static final int $stable = 0;
    private final String subTitle;
    private final String title;
    private final String toolbarTitle;

    public FreeVideoPromotionRSModel(String str, String str2, String str3) {
        this.title = str;
        this.subTitle = str2;
        this.toolbarTitle = str3;
    }

    public /* synthetic */ FreeVideoPromotionRSModel(String str, String str2, String str3, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    @JsonProperty("title")
    public final String getTitle() {
        return this.title;
    }

    @JsonProperty(CourseResponseKeyConstantsKt.KEY_SUBTITLE)
    public final String getSubTitle() {
        return this.subTitle;
    }

    @JsonProperty("toolbar_title")
    public final String getToolbarTitle() {
        return this.toolbarTitle;
    }

    public FreeVideoPromotionRSModel() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ FreeVideoPromotionRSModel copy$default(FreeVideoPromotionRSModel freeVideoPromotionRSModel, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = freeVideoPromotionRSModel.title;
        }
        if ((i & 2) != 0) {
            str2 = freeVideoPromotionRSModel.subTitle;
        }
        if ((i & 4) != 0) {
            str3 = freeVideoPromotionRSModel.toolbarTitle;
        }
        return freeVideoPromotionRSModel.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getToolbarTitle() {
        return this.toolbarTitle;
    }

    public final FreeVideoPromotionRSModel copy(String p0, String p1, String p2) {
        return new FreeVideoPromotionRSModel(p0, p1, p2);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof FreeVideoPromotionRSModel)) {
            return false;
        }
        FreeVideoPromotionRSModel freeVideoPromotionRSModel = (FreeVideoPromotionRSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.title, (Object) freeVideoPromotionRSModel.title) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.subTitle, (Object) freeVideoPromotionRSModel.subTitle) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.toolbarTitle, (Object) freeVideoPromotionRSModel.toolbarTitle);
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.subTitle;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.toolbarTitle;
        return (((iHashCode * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        String str = this.title;
        String str2 = this.subTitle;
        String str3 = this.toolbarTitle;
        StringBuilder sb = new StringBuilder("FreeVideoPromotionRSModel(title=");
        sb.append(str);
        sb.append(", subTitle=");
        sb.append(str2);
        sb.append(", toolbarTitle=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
