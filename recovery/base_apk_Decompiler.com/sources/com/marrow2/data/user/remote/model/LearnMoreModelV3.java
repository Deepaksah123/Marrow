package com.marrow2.data.user.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.common.CourseResponseKeyConstantsKt;
import java.util.ArrayList;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u0005HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003J/\u0010\u000f\u001a\u00020\u00002\u0018\b\u0002\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0004HÖ\u0001R&\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u00040\u0003j\b\u0012\u0004\u0012\u00020\u0004`\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/marrow2/data/user/remote/model/LearnMoreModelV3;", "", "courseComponents", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "introPara", "<init>", "(Ljava/util/ArrayList;Ljava/lang/String;)V", "getCourseComponents", "()Ljava/util/ArrayList;", "getIntroPara", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LearnMoreModelV3 {
    public static final int $stable = 8;

    @JsonProperty(CourseResponseKeyConstantsKt.KEY_COURSE_COMPONENTS)
    private final ArrayList<String> courseComponents;

    @JsonProperty(CourseResponseKeyConstantsKt.KEY_INTRO_PARA)
    private final String introPara;

    public LearnMoreModelV3(ArrayList<String> arrayList, String str) {
        toMagicModuleMetaRepoModel.write(arrayList, "");
        this.courseComponents = arrayList;
        this.introPara = str;
    }

    public /* synthetic */ LearnMoreModelV3(ArrayList arrayList, String str, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? new ArrayList() : arrayList, (i & 2) != 0 ? null : str);
    }

    public final ArrayList<String> getCourseComponents() {
        return this.courseComponents;
    }

    public final String getIntroPara() {
        return this.introPara;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LearnMoreModelV3() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ LearnMoreModelV3 copy$default(LearnMoreModelV3 learnMoreModelV3, ArrayList arrayList, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            arrayList = learnMoreModelV3.courseComponents;
        }
        if ((i & 2) != 0) {
            str = learnMoreModelV3.introPara;
        }
        return learnMoreModelV3.copy(arrayList, str);
    }

    public final ArrayList<String> component1() {
        return this.courseComponents;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getIntroPara() {
        return this.introPara;
    }

    public final LearnMoreModelV3 copy(ArrayList<String> courseComponents, String introPara) {
        toMagicModuleMetaRepoModel.write(courseComponents, "");
        return new LearnMoreModelV3(courseComponents, introPara);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LearnMoreModelV3)) {
            return false;
        }
        LearnMoreModelV3 learnMoreModelV3 = (LearnMoreModelV3) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.courseComponents, learnMoreModelV3.courseComponents) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.introPara, (Object) learnMoreModelV3.introPara);
    }

    public final int hashCode() {
        int iHashCode = this.courseComponents.hashCode();
        String str = this.introPara;
        return (iHashCode * 31) + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        ArrayList<String> arrayList = this.courseComponents;
        String str = this.introPara;
        StringBuilder sb = new StringBuilder("LearnMoreModelV3(courseComponents=");
        sb.append(arrayList);
        sb.append(", introPara=");
        sb.append(str);
        sb.append(")");
        return sb.toString();
    }
}
