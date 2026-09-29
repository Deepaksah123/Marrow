package com.marrow2.data.user.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0001%B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u000eJB\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u000eJ\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\fR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\fR\u001a\u0010\u001c\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u001f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u001a\u001a\u0004\b \u0010\fR\u001a\u0010!\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b!\u0010\u001a\u001a\u0004\b\"\u0010\fR\u001a\u0010#\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b#\u0010\u001d\u001a\u0004\b$\u0010\u000e"}, d2 = {"Lcom/marrow2/data/user/remote/model/EducationDegreeDetails;", "", "", "p0", "", "p1", "p2", "p3", "p4", "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V", "component1", "()Ljava/lang/String;", "component2", "()I", "component3", "component4", "component5", "copy", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)Lcom/marrow2/data/user/remote/model/EducationDegreeDetails;", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", EducationDegreeDetails.KEY_DEGREE, "Ljava/lang/String;", "getDegree", "passingYear", "I", "getPassingYear", "institute", "getInstitute", "instituteId", "getInstituteId", "stateId", "getStateId", "Companion"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class EducationDegreeDetails {
    public static final int $stable = 0;
    private static final int INVALID_YEAR = -1;
    private static final String KEY_DEGREE = "degree";
    private static final String KEY_ID = "_id";
    private static final String KEY_INSTITUTE = "institutes";
    private static final String KEY_PASSING_YEAR = "yop";
    private static final String KEY_STATE_ID = "state_id";

    @JsonProperty(KEY_DEGREE)
    private final String degree;

    @JsonProperty(KEY_INSTITUTE)
    private final String institute;

    @JsonProperty("_id")
    private final String instituteId;

    @JsonProperty("yop")
    private final int passingYear;

    @JsonProperty("state_id")
    private final int stateId;

    public EducationDegreeDetails(String str, int i, String str2, String str3, int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.degree = str;
        this.passingYear = i;
        this.institute = str2;
        this.instituteId = str3;
        this.stateId = i2;
    }

    public /* synthetic */ EducationDegreeDetails(String str, int i, String str2, String str3, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? -1 : i, (i3 & 4) != 0 ? "" : str2, (i3 & 8) != 0 ? "" : str3, (i3 & 16) != 0 ? 0 : i2);
    }

    public final String getDegree() {
        return this.degree;
    }

    public final int getPassingYear() {
        return this.passingYear;
    }

    public final String getInstitute() {
        return this.institute;
    }

    public final String getInstituteId() {
        return this.instituteId;
    }

    public final int getStateId() {
        return this.stateId;
    }

    public EducationDegreeDetails() {
        this(null, 0, null, null, 0, 31, null);
    }

    public static /* synthetic */ EducationDegreeDetails copy$default(EducationDegreeDetails educationDegreeDetails, String str, int i, String str2, String str3, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = educationDegreeDetails.degree;
        }
        if ((i3 & 2) != 0) {
            i = educationDegreeDetails.passingYear;
        }
        int i4 = i;
        if ((i3 & 4) != 0) {
            str2 = educationDegreeDetails.institute;
        }
        String str4 = str2;
        if ((i3 & 8) != 0) {
            str3 = educationDegreeDetails.instituteId;
        }
        String str5 = str3;
        if ((i3 & 16) != 0) {
            i2 = educationDegreeDetails.stateId;
        }
        return educationDegreeDetails.copy(str, i4, str4, str5, i2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getDegree() {
        return this.degree;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getPassingYear() {
        return this.passingYear;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getInstitute() {
        return this.institute;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getInstituteId() {
        return this.instituteId;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getStateId() {
        return this.stateId;
    }

    public final EducationDegreeDetails copy(String p0, int p1, String p2, String p3, int p4) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        return new EducationDegreeDetails(p0, p1, p2, p3, p4);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof EducationDegreeDetails)) {
            return false;
        }
        EducationDegreeDetails educationDegreeDetails = (EducationDegreeDetails) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.degree, (Object) educationDegreeDetails.degree) && this.passingYear == educationDegreeDetails.passingYear && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.institute, (Object) educationDegreeDetails.institute) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.instituteId, (Object) educationDegreeDetails.instituteId) && this.stateId == educationDegreeDetails.stateId;
    }

    public final int hashCode() {
        return (((((((this.degree.hashCode() * 31) + Integer.hashCode(this.passingYear)) * 31) + this.institute.hashCode()) * 31) + this.instituteId.hashCode()) * 31) + Integer.hashCode(this.stateId);
    }

    public final String toString() {
        String str = this.degree;
        int i = this.passingYear;
        String str2 = this.institute;
        String str3 = this.instituteId;
        int i2 = this.stateId;
        StringBuilder sb = new StringBuilder("EducationDegreeDetails(degree=");
        sb.append(str);
        sb.append(", passingYear=");
        sb.append(i);
        sb.append(", institute=");
        sb.append(str2);
        sb.append(", instituteId=");
        sb.append(str3);
        sb.append(", stateId=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
