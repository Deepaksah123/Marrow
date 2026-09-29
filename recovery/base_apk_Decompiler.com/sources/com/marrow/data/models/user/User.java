package com.marrow.data.models.user;

import android.database.Cursor;
import android.text.TextUtils;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow.data.models.user.PhoneNumber;
import kotlin.getPeriodDurationMs;
import kotlin.parseDolbyChannelConfiguration;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
public class User {
    public static final String DEFAULT_PROFESSION = "Medical Student";
    public static final String KEY_PHONE_NUMBER = "primary_contact";
    public static final String PROFESSION_DOCTOR = "Doctor";
    public static final String SPECIALTY_DOCTOR = "Doctor";
    public static final String SPECIALTY_FINAL_YEAR = "MBBS Final Year";
    public static final String SPECIALTY_FIRST_YEAR = "MBBS First Year";
    public static final String SPECIALTY_INTERNSHIP = "Internship";
    public static final String SPECIALTY_SECOND_YEAR = "MBBS Second Year";
    public static final String SPECIALTY_THIRD_YEAR = "MBBS Third Year";
    private College college;
    private int kycFailureCount;
    private String mFirstName;
    private int mKycStatus;
    private PhoneNumber mPhoneNumber;
    private String mProfilePic;
    private boolean mShowLegalPopup;

    @Deprecated
    private String mSpecialty;
    private String mUserId;
    private long msCreatedOn;
    private String mLastName = "";
    private String mProfession = DEFAULT_PROFESSION;

    public void fromCursor(Cursor cursor) {
        this.mUserId = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "user_id");
        this.mFirstName = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "firstname");
        this.mLastName = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "lastname");
        this.mProfilePic = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, "profile_pic");
        this.mProfession = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, LoggedUserResponse.KEY_PROFESSION);
        this.mSpecialty = getPeriodDurationMs.AudioAttributesImplApi21Parcelizer(cursor, LoggedUserResponse.KEY_SPECIALTY);
        this.mKycStatus = getPeriodDurationMs.write(cursor, LoggedUserResponse.KEY_KYC_STATUS);
        this.kycFailureCount = getPeriodDurationMs.write(cursor, LoggedUserResponse.KEY_KYC_FAILURE_COUNT);
        this.msCreatedOn = getPeriodDurationMs.AudioAttributesImplBaseParcelizer(cursor, LoggedUserResponse.KEY_CREATED_ON);
        JSONObject jSONObjectRemoteActionCompatParcelizer = getPeriodDurationMs.RemoteActionCompatParcelizer(cursor, "phone_number");
        getPeriodDurationMs.AudioAttributesCompatParcelizer(cursor, LoggedUserResponse.KEY_EDUCATION);
        this.college = College.INSTANCE.fromJSON(getPeriodDurationMs.RemoteActionCompatParcelizer(cursor, LoggedUserResponse.KEY_MBBS));
        this.mPhoneNumber = PhoneNumber.JsonParser.fromJSON(jSONObjectRemoteActionCompatParcelizer);
    }

    public void setName(String str) {
        this.mFirstName = str;
        this.mLastName = "";
    }

    public void setProfilePic(String str) {
        this.mProfilePic = str;
    }

    public String getId() {
        return this.mUserId;
    }

    public College getCollege() {
        return this.college;
    }

    public void setCollege(College college) {
        this.college = college;
    }

    public String getDisplayName() {
        String str = this.mLastName;
        if (".".equals(str)) {
            str = "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(this.mFirstName);
        sb.append(" ");
        sb.append(str);
        return sb.toString().trim();
    }

    public String getUserNameInitials() {
        try {
            return String.valueOf(this.mFirstName.charAt(0));
        } catch (Exception unused) {
            return "";
        }
    }

    public String getSpecialty() {
        College college = this.college;
        if (college != null) {
            return college.getCurrentYear();
        }
        return null;
    }

    public boolean isShowLegalPopup() {
        return this.mShowLegalPopup;
    }

    public void setShowLegalPopup(boolean z) {
        this.mShowLegalPopup = z;
    }

    public String getFirstName() {
        return this.mFirstName;
    }

    public String[] getNameArray() {
        if (TextUtils.isEmpty(this.mLastName)) {
            int iIndexOf = this.mFirstName.trim().indexOf(" ");
            if (iIndexOf >= 0) {
                String str = this.mFirstName;
                this.mFirstName = str.substring(0, iIndexOf);
                this.mLastName = str.substring(iIndexOf + 1);
            } else {
                this.mLastName = ".";
            }
        }
        return new String[]{this.mFirstName, this.mLastName};
    }

    public String getLastName() {
        return this.mLastName;
    }

    public PhoneNumber getPhoneNumber() {
        if (this.mPhoneNumber == null) {
            this.mPhoneNumber = new PhoneNumber();
        }
        return this.mPhoneNumber;
    }

    public void setProfession(String str) {
        this.mProfession = str;
    }

    public String getProfession() {
        College college = this.college;
        return (college == null || !parseDolbyChannelConfiguration.RemoteActionCompatParcelizer(college.getCurrentYear(), "Doctor")) ? DEFAULT_PROFESSION : "Doctor";
    }

    public void setId(String str) {
        this.mUserId = str;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public String getProfilePic() {
        return this.mProfilePic;
    }

    public void setFirstName(String str) {
        this.mFirstName = str;
    }

    public void setLastName(String str) {
        this.mLastName = str;
    }

    public void setPhoneNumber(PhoneNumber phoneNumber) {
        this.mPhoneNumber = phoneNumber;
    }

    public boolean isPhoneNumberNull() {
        return this.mPhoneNumber == null;
    }

    public int getKycStatus() {
        return this.mKycStatus;
    }

    public void setKycStatus(int i) {
        this.mKycStatus = i;
    }

    public int getKycFailureCount() {
        return this.kycFailureCount;
    }

    public void setKycFailureCount(int i) {
        this.kycFailureCount = i;
    }

    public long getCreatedOn() {
        return this.msCreatedOn;
    }

    public void setCreatedOn(long j) {
        this.msCreatedOn = j;
    }

    public void setSpecialty(String str) {
        this.mSpecialty = str;
    }
}
