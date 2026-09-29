package com.marrow.data.api.models.request.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow.data.models.custommodule.FilterParams;
import com.marrow.data.models.user.College;
import com.marrow.data.models.user.EducationalDegree;
import com.marrow.data.models.user.LoggedUser;
import com.marrow.data.models.user.PhoneNumber;
import com.marrow.data.models.user.User;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
public class SaveProfileRequestBody {

    @JsonProperty(LoggedUserResponse.KEY_MBBS)
    private College college;

    @JsonProperty(FilterParams.KEY_COURSE_ID)
    private String defaultCourseId;

    @JsonProperty(LoggedUserResponse.KEY_EDUCATION)
    private List<EducationalDegree> eductionDegrees;
    private String fname;
    private String lname;

    @JsonProperty("primary_contact")
    private PhoneNumber primaryContact;

    @JsonProperty(LoggedUserResponse.KEY_PROFESSION)
    private String profession;

    @JsonProperty("profile_pic")
    private String profilePic;
    private String specialty;

    public static SaveProfileRequestBody getSaveProfileModel(LoggedUser loggedUser) {
        SaveProfileRequestBody saveProfileRequestBody = new SaveProfileRequestBody();
        User user = loggedUser.getUser();
        saveProfileRequestBody.setFname(user.getNameArray()[0]);
        saveProfileRequestBody.setLname(user.getNameArray()[1]);
        saveProfileRequestBody.setPrimaryContact(user.getPhoneNumber());
        saveProfileRequestBody.setProfilePic(user.getProfilePic());
        saveProfileRequestBody.setCollege(user.getCollege());
        saveProfileRequestBody.setDefaultCourseId(String.valueOf(loggedUser.getCourseId()));
        saveProfileRequestBody.setProfession(user.getProfession());
        return saveProfileRequestBody;
    }

    private void setDefaultCourseId(String str) {
        this.defaultCourseId = str;
    }

    public String getSpecialty() {
        return this.specialty;
    }

    public void setSpecialty(String str) {
        this.specialty = str;
    }

    public String getProfession() {
        return this.profession;
    }

    public void setProfession(String str) {
        this.profession = str;
    }

    public String getFname() {
        return this.fname;
    }

    public void setFname(String str) {
        this.fname = str;
    }

    public String getLname() {
        return this.lname;
    }

    public void setLname(String str) {
        this.lname = str;
    }

    public PhoneNumber getPrimaryContact() {
        return this.primaryContact;
    }

    public void setPrimaryContact(PhoneNumber phoneNumber) {
        this.primaryContact = phoneNumber;
    }

    public String getProfilePic() {
        return this.profilePic;
    }

    public void setProfilePic(String str) {
        this.profilePic = str;
    }

    public College getCollege() {
        return this.college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    @Deprecated
    private List<EducationalDegree> getEductionDegrees() {
        return this.eductionDegrees;
    }

    @Deprecated
    private void setEductionDegrees(List<EducationalDegree> list) {
        this.eductionDegrees = list;
    }
}
