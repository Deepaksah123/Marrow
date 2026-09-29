package com.marrow2.data.user.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow2.data.user.remote.model.onboarding.PhoneNumberDetails;
import java.util.List;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Bw\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0010\u0010\u0016\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0013J\u0018\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0013J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0013J\u0080\u0001\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010\"\u001a\u00020!2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0013R\u001c\u0010(\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010\u0013R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010)\u001a\u0004\b,\u0010\u0013R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010)\u001a\u0004\b.\u0010\u0013R\u001a\u0010/\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0017R\u001c\u00102\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u0010)\u001a\u0004\b3\u0010\u0013R\"\u00104\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u0010\u001aR\u001c\u00107\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010\u001cR\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010)\u001a\u0004\b;\u0010\u0013R\u001c\u0010<\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u0010)\u001a\u0004\b=\u0010\u0013"}, d2 = {"Lcom/marrow2/data/user/remote/model/SaveProfileRequestBody;", "", "", "p0", "p1", "p2", "Lcom/marrow2/data/user/remote/model/CollegeDetails;", "p3", "p4", "", "Lcom/marrow2/data/user/remote/model/EducationDegreeDetails;", "p5", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/marrow2/data/user/remote/model/CollegeDetails;Ljava/lang/String;Ljava/util/List;Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/marrow2/data/user/remote/model/CollegeDetails;", "component5", "component6", "()Ljava/util/List;", "component7", "()Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/marrow2/data/user/remote/model/CollegeDetails;Ljava/lang/String;Ljava/util/List;Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow2/data/user/remote/model/SaveProfileRequestBody;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", LoggedUserResponse.KEY_SPECIALTY, "Ljava/lang/String;", "getSpecialty", "fname", "getFname", "lname", "getLname", "college", "Lcom/marrow2/data/user/remote/model/CollegeDetails;", "getCollege", "defaultCourseId", "getDefaultCourseId", LoggedUserResponse.KEY_EDUCATION, "Ljava/util/List;", "getEducation", "primary_contact", "Lcom/marrow2/data/user/remote/model/onboarding/PhoneNumberDetails;", "getPrimary_contact", LoggedUserResponse.KEY_PROFESSION, "getProfession", "profile_pic", "getProfile_pic"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SaveProfileRequestBody {
    public static final int $stable = 8;

    @JsonProperty(LoggedUserResponse.KEY_MBBS)
    private final CollegeDetails college;

    @JsonProperty(FilterParams.KEY_COURSE_ID)
    private final String defaultCourseId;

    @JsonProperty(LoggedUserResponse.KEY_EDUCATION)
    private final List<EducationDegreeDetails> education;

    @JsonProperty("fname")
    private final String fname;

    @JsonProperty("lname")
    private final String lname;

    @JsonProperty("primary_contact")
    private final PhoneNumberDetails primary_contact;

    @JsonProperty(LoggedUserResponse.KEY_PROFESSION)
    private final String profession;

    @JsonProperty("profile_pic")
    private final String profile_pic;

    @JsonProperty(LoggedUserResponse.KEY_SPECIALTY)
    private final String specialty;

    public SaveProfileRequestBody(String str, String str2, String str3, CollegeDetails collegeDetails, String str4, List<EducationDegreeDetails> list, PhoneNumberDetails phoneNumberDetails, String str5, String str6) {
        toMagicModuleMetaRepoModel.write(collegeDetails, "");
        this.specialty = str;
        this.fname = str2;
        this.lname = str3;
        this.college = collegeDetails;
        this.defaultCourseId = str4;
        this.education = list;
        this.primary_contact = phoneNumberDetails;
        this.profession = str5;
        this.profile_pic = str6;
    }

    public final String getSpecialty() {
        return this.specialty;
    }

    public final String getFname() {
        return this.fname;
    }

    public final String getLname() {
        return this.lname;
    }

    public /* synthetic */ SaveProfileRequestBody(String str, String str2, String str3, CollegeDetails collegeDetails, String str4, List list, PhoneNumberDetails phoneNumberDetails, String str5, String str6, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? new CollegeDetails(null, null, null, null, 0, 0L, null, null, 0, UnixStat.DEFAULT_LINK_PERM, null) : collegeDetails, (i & 16) != 0 ? null : str4, (i & 32) != 0 ? null : list, (i & 64) != 0 ? null : phoneNumberDetails, (i & 128) != 0 ? null : str5, (i & 256) == 0 ? str6 : null);
    }

    public final CollegeDetails getCollege() {
        return this.college;
    }

    public final String getDefaultCourseId() {
        return this.defaultCourseId;
    }

    public final List<EducationDegreeDetails> getEducation() {
        return this.education;
    }

    public final PhoneNumberDetails getPrimary_contact() {
        return this.primary_contact;
    }

    public final String getProfession() {
        return this.profession;
    }

    public final String getProfile_pic() {
        return this.profile_pic;
    }

    public SaveProfileRequestBody() {
        this(null, null, null, null, null, null, null, null, null, UnixStat.DEFAULT_LINK_PERM, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSpecialty() {
        return this.specialty;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFname() {
        return this.fname;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLname() {
        return this.lname;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final CollegeDetails getCollege() {
        return this.college;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getDefaultCourseId() {
        return this.defaultCourseId;
    }

    public final List<EducationDegreeDetails> component6() {
        return this.education;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final PhoneNumberDetails getPrimary_contact() {
        return this.primary_contact;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getProfession() {
        return this.profession;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final String getProfile_pic() {
        return this.profile_pic;
    }

    public final SaveProfileRequestBody copy(String p0, String p1, String p2, CollegeDetails p3, String p4, List<EducationDegreeDetails> p5, PhoneNumberDetails p6, String p7, String p8) {
        toMagicModuleMetaRepoModel.write(p3, "");
        return new SaveProfileRequestBody(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof SaveProfileRequestBody)) {
            return false;
        }
        SaveProfileRequestBody saveProfileRequestBody = (SaveProfileRequestBody) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.specialty, (Object) saveProfileRequestBody.specialty) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.fname, (Object) saveProfileRequestBody.fname) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.lname, (Object) saveProfileRequestBody.lname) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.college, saveProfileRequestBody.college) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.defaultCourseId, (Object) saveProfileRequestBody.defaultCourseId) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.education, saveProfileRequestBody.education) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.primary_contact, saveProfileRequestBody.primary_contact) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.profession, (Object) saveProfileRequestBody.profession) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.profile_pic, (Object) saveProfileRequestBody.profile_pic);
    }

    public final int hashCode() {
        String str = this.specialty;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.fname;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.lname;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        int iHashCode4 = this.college.hashCode();
        String str4 = this.defaultCourseId;
        int iHashCode5 = str4 == null ? 0 : str4.hashCode();
        List<EducationDegreeDetails> list = this.education;
        int iHashCode6 = list == null ? 0 : list.hashCode();
        PhoneNumberDetails phoneNumberDetails = this.primary_contact;
        int iHashCode7 = phoneNumberDetails == null ? 0 : phoneNumberDetails.hashCode();
        String str5 = this.profession;
        int iHashCode8 = str5 == null ? 0 : str5.hashCode();
        String str6 = this.profile_pic;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + iHashCode8) * 31) + (str6 != null ? str6.hashCode() : 0);
    }

    public final String toString() {
        String str = this.specialty;
        String str2 = this.fname;
        String str3 = this.lname;
        CollegeDetails collegeDetails = this.college;
        String str4 = this.defaultCourseId;
        List<EducationDegreeDetails> list = this.education;
        PhoneNumberDetails phoneNumberDetails = this.primary_contact;
        String str5 = this.profession;
        String str6 = this.profile_pic;
        StringBuilder sb = new StringBuilder("SaveProfileRequestBody(specialty=");
        sb.append(str);
        sb.append(", fname=");
        sb.append(str2);
        sb.append(", lname=");
        sb.append(str3);
        sb.append(", college=");
        sb.append(collegeDetails);
        sb.append(", defaultCourseId=");
        sb.append(str4);
        sb.append(", education=");
        sb.append(list);
        sb.append(", primary_contact=");
        sb.append(phoneNumberDetails);
        sb.append(", profession=");
        sb.append(str5);
        sb.append(", profile_pic=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }
}
