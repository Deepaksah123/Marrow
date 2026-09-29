package com.marrow2.data.custom_module.remote.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001d\b\u0086\b\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0015J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0016\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0016\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001bJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0010\u0010!\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003¢\u0006\u0004\b\"\u0010\u001bJ\u0010\u0010#\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0015J¤\u0001\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00022\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000f\u001a\u00020\t2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\u0011\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b$\u0010%J\r\u0010&\u001a\u00020\u0004¢\u0006\u0004\b&\u0010\u0017J\u001a\u0010(\u001a\u00020\u00022\b\u0010\u0003\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b*\u0010\u0017J\u0010\u0010+\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b+\u0010\u001fJ\u001d\u0010.\u001a\u00020-2\u0006\u0010\u0003\u001a\u00020,2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b.\u0010/R\u0017\u00100\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u0010\u0015R\u001a\u00102\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u0017R\u001a\u00105\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00103\u001a\u0004\b6\u0010\u0017R\u001a\u00107\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b8\u0010\u0015R \u00109\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010\u001bR \u0010<\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010:\u001a\u0004\b=\u0010\u001bR \u0010>\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b?\u0010\u001bR\u001c\u0010@\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b@\u0010A\u001a\u0004\bB\u0010\u001fR\u001c\u0010C\u001a\u0004\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bC\u0010A\u001a\u0004\bD\u0010\u001fR\u001a\u0010E\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bE\u0010A\u001a\u0004\bF\u0010\u001fR \u0010G\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\bG\u0010:\u001a\u0004\bH\u0010\u001bR\u001a\u0010I\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\bI\u00101\u001a\u0004\bJ\u0010\u0015"}, d2 = {"Lcom/marrow2/data/custom_module/remote/model/FilterParams;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "p2", "p3", "", "", "p4", "p5", "p6", "p7", "p8", "p9", "p10", "p11", "<init>", "(ZIIZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)V", "component1", "()Z", "component2", "()I", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "()Ljava/lang/String;", "component9", "component10", "component11", "component12", "copy", "(ZIIZLjava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Z)Lcom/marrow2/data/custom_module/remote/model/FilterParams;", "describeContents", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "isBookmarked", "Z", com.marrow.data.models.custommodule.FilterParams.KEY_MODE, "I", "getMode", "noOfQuestions", "getNoOfQuestions", "wrong", "getWrong", com.marrow.data.models.custommodule.FilterParams.KEY_SUBJECTS, "Ljava/util/List;", "getSubjects", "rootSubjects", "getRootSubjects", com.marrow.data.models.custommodule.FilterParams.KEY_TAGS, "getTags", "courseId", "Ljava/lang/String;", "getCourseId", com.marrow.data.models.custommodule.FilterParams.KEY_DIFFICULTY, "getDifficulty", "category", "getCategory", "categoryTypes", "getCategoryTypes", "includeUntagged", "getIncludeUntagged"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class FilterParams implements Parcelable {
    private final String category;
    private final List<String> categoryTypes;
    private final String courseId;
    private final String difficulty;
    private final boolean includeUntagged;
    private final boolean isBookmarked;
    private final int mode;
    private final int noOfQuestions;
    private final List<String> rootSubjects;
    private final List<String> subjects;
    private final List<String> tags;
    private final boolean wrong;
    public static final Parcelable.Creator<FilterParams> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FilterParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilterParams createFromParcel(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new FilterParams(parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt() != 0, parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final FilterParams[] newArray(int i) {
            return new FilterParams[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public FilterParams(boolean z, int i, int i2, boolean z2, List<String> list, List<String> list2, List<String> list3, String str, String str2, String str3, List<String> list4, boolean z3) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(list3, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(list4, "");
        this.isBookmarked = z;
        this.mode = i;
        this.noOfQuestions = i2;
        this.wrong = z2;
        this.subjects = list;
        this.rootSubjects = list2;
        this.tags = list3;
        this.courseId = str;
        this.difficulty = str2;
        this.category = str3;
        this.categoryTypes = list4;
        this.includeUntagged = z3;
    }

    public final boolean isBookmarked() {
        return this.isBookmarked;
    }

    public final int getMode() {
        return this.mode;
    }

    public final int getNoOfQuestions() {
        return this.noOfQuestions;
    }

    public final boolean getWrong() {
        return this.wrong;
    }

    public /* synthetic */ FilterParams(boolean z, int i, int i2, boolean z2, List list, List list2, List list3, String str, String str2, String str3, List list4, boolean z3, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? false : z, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? false : z2, (i3 & 16) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i3 & 32) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2, (i3 & 64) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list3, (i3 & 128) != 0 ? null : str, (i3 & 256) == 0 ? str2 : null, (i3 & 512) != 0 ? "all" : str3, (i3 & 1024) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list4, (i3 & 2048) == 0 ? z3 : false);
    }

    public final List<String> getSubjects() {
        return this.subjects;
    }

    public final List<String> getRootSubjects() {
        return this.rootSubjects;
    }

    public final List<String> getTags() {
        return this.tags;
    }

    public final String getCourseId() {
        return this.courseId;
    }

    public final String getDifficulty() {
        return this.difficulty;
    }

    public final String getCategory() {
        return this.category;
    }

    public final List<String> getCategoryTypes() {
        return this.categoryTypes;
    }

    public final boolean getIncludeUntagged() {
        return this.includeUntagged;
    }

    public FilterParams() {
        this(false, 0, 0, false, null, null, null, null, null, null, null, false, UnixStat.PERM_MASK, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getIsBookmarked() {
        return this.isBookmarked;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    public final List<String> component11() {
        return this.categoryTypes;
    }

    /* JADX INFO: renamed from: component12, reason: from getter */
    public final boolean getIncludeUntagged() {
        return this.includeUntagged;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getMode() {
        return this.mode;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getNoOfQuestions() {
        return this.noOfQuestions;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getWrong() {
        return this.wrong;
    }

    public final List<String> component5() {
        return this.subjects;
    }

    public final List<String> component6() {
        return this.rootSubjects;
    }

    public final List<String> component7() {
        return this.tags;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getCourseId() {
        return this.courseId;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getDifficulty() {
        return this.difficulty;
    }

    public final FilterParams copy(boolean p0, int p1, int p2, boolean p3, List<String> p4, List<String> p5, List<String> p6, String p7, String p8, String p9, List<String> p10, boolean p11) {
        toMagicModuleMetaRepoModel.write(p4, "");
        toMagicModuleMetaRepoModel.write(p5, "");
        toMagicModuleMetaRepoModel.write(p6, "");
        toMagicModuleMetaRepoModel.write(p9, "");
        toMagicModuleMetaRepoModel.write(p10, "");
        return new FilterParams(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof FilterParams)) {
            return false;
        }
        FilterParams filterParams = (FilterParams) p0;
        return this.isBookmarked == filterParams.isBookmarked && this.mode == filterParams.mode && this.noOfQuestions == filterParams.noOfQuestions && this.wrong == filterParams.wrong && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.subjects, filterParams.subjects) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.rootSubjects, filterParams.rootSubjects) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.tags, filterParams.tags) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.courseId, (Object) filterParams.courseId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.difficulty, (Object) filterParams.difficulty) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.category, (Object) filterParams.category) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.categoryTypes, filterParams.categoryTypes) && this.includeUntagged == filterParams.includeUntagged;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.isBookmarked);
        int iHashCode2 = Integer.hashCode(this.mode);
        int iHashCode3 = Integer.hashCode(this.noOfQuestions);
        int iHashCode4 = Boolean.hashCode(this.wrong);
        int iHashCode5 = this.subjects.hashCode();
        int iHashCode6 = this.rootSubjects.hashCode();
        int iHashCode7 = this.tags.hashCode();
        String str = this.courseId;
        int iHashCode8 = str == null ? 0 : str.hashCode();
        String str2 = this.difficulty;
        return (((((((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.category.hashCode()) * 31) + this.categoryTypes.hashCode()) * 31) + Boolean.hashCode(this.includeUntagged);
    }

    public final String toString() {
        boolean z = this.isBookmarked;
        int i = this.mode;
        int i2 = this.noOfQuestions;
        boolean z2 = this.wrong;
        List<String> list = this.subjects;
        List<String> list2 = this.rootSubjects;
        List<String> list3 = this.tags;
        String str = this.courseId;
        String str2 = this.difficulty;
        String str3 = this.category;
        List<String> list4 = this.categoryTypes;
        boolean z3 = this.includeUntagged;
        StringBuilder sb = new StringBuilder("FilterParams(isBookmarked=");
        sb.append(z);
        sb.append(", mode=");
        sb.append(i);
        sb.append(", noOfQuestions=");
        sb.append(i2);
        sb.append(", wrong=");
        sb.append(z2);
        sb.append(", subjects=");
        sb.append(list);
        sb.append(", rootSubjects=");
        sb.append(list2);
        sb.append(", tags=");
        sb.append(list3);
        sb.append(", courseId=");
        sb.append(str);
        sb.append(", difficulty=");
        sb.append(str2);
        sb.append(", category=");
        sb.append(str3);
        sb.append(", categoryTypes=");
        sb.append(list4);
        sb.append(", includeUntagged=");
        sb.append(z3);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeInt(this.isBookmarked ? 1 : 0);
        p0.writeInt(this.mode);
        p0.writeInt(this.noOfQuestions);
        p0.writeInt(this.wrong ? 1 : 0);
        p0.writeStringList(this.subjects);
        p0.writeStringList(this.rootSubjects);
        p0.writeStringList(this.tags);
        p0.writeString(this.courseId);
        p0.writeString(this.difficulty);
        p0.writeString(this.category);
        p0.writeStringList(this.categoryTypes);
        p0.writeInt(this.includeUntagged ? 1 : 0);
    }
}
