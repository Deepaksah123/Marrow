package com.marrow.data.models.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.isDvbProfileDeclared;
import kotlin.toMagicModuleMetaRepoModel;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0013\b\u0017\u0018\u0000 52\u00020\u0001:\u00015B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\u0019\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bR$\u0010\f\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R$\u0010\u0012\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\r\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R$\u0010\u0015\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\r\u001a\u0004\b\u0016\u0010\u000f\"\u0004\b\u0017\u0010\u0011R$\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\r\u001a\u0004\b\u0019\u0010\u000f\"\u0004\b\u001a\u0010\u0011R$\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R$\u0010#\u001a\u0004\u0018\u00010\"8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R$\u0010)\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b)\u0010\r\u001a\u0004\b*\u0010\u000f\"\u0004\b+\u0010\u0011R$\u0010,\u001a\u0004\u0018\u00010\t8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b,\u0010\r\u001a\u0004\b-\u0010\u000f\"\u0004\b.\u0010\u0011R\"\u0010/\u001a\u00020\u001b8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b/\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u00104"}, d2 = {"Lcom/marrow/data/models/user/College;", "", "<init>", "()V", "", "isVerified", "()Z", "isUserCollegeDataAvailable", "", "", "getWhichCollegeDataIsNotPresent", "()Ljava/util/Map;", "stateId", "Ljava/lang/String;", "getStateId", "()Ljava/lang/String;", "setStateId", "(Ljava/lang/String;)V", "collegeName", "getCollegeName", "setCollegeName", "country", "getCountry", "setCountry", "collegeId", "getCollegeId", "setCollegeId", "", "yearOfPassout", "Ljava/lang/Integer;", "getYearOfPassout", "()Ljava/lang/Integer;", "setYearOfPassout", "(Ljava/lang/Integer;)V", "", "verifiedOn", "Ljava/lang/Long;", "getVerifiedOn", "()Ljava/lang/Long;", "setVerifiedOn", "(Ljava/lang/Long;)V", "currentYear", "getCurrentYear", "setCurrentYear", "yearOfAdmission", "getYearOfAdmission", "setYearOfAdmission", "mbbsVerificationYear", "I", "getMbbsVerificationYear", "()I", "setMbbsVerificationYear", "(I)V", "JsonParser"}, k = 1, mv = {2, 2, 0}, xi = 48)
public class College {

    /* JADX INFO: renamed from: JsonParser, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final String KEY_ADMISSION_YEAR = "year_of_admission";
    public static final String KEY_COLLEGE_ID = "clg_id";
    public static final String KEY_COLLEGE_NAME = "clg_name";
    public static final String KEY_COUNTRY = "country";
    public static final String KEY_CURRENT_YEAR = "curr_year";
    public static final String KEY_MBBS_VERIFICATION_YEAR = "mbbs_verified_year";
    public static final String KEY_STATE_ID = "state_id";
    public static final String KEY_VERIFIED_ON = "verified_on";
    public static final String KEY_YOP = "yop";

    @JsonProperty(KEY_COLLEGE_ID)
    private String collegeId;

    @JsonProperty(KEY_COLLEGE_NAME)
    private String collegeName;

    @JsonProperty("country")
    private String country;

    @JsonProperty(KEY_CURRENT_YEAR)
    private String currentYear;

    @JsonProperty(KEY_MBBS_VERIFICATION_YEAR)
    private int mbbsVerificationYear;

    @JsonProperty("state_id")
    private String stateId;

    @JsonProperty(KEY_VERIFIED_ON)
    private Long verifiedOn;

    @JsonProperty(KEY_ADMISSION_YEAR)
    private String yearOfAdmission;

    @JsonProperty(KEY_YOP)
    private Integer yearOfPassout;

    /* JADX INFO: renamed from: com.marrow.data.models.user.College$JsonParser, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0006X\u0087T¢\u0006\u0006\n\u0004\b\u0015\u0010\r"}, d2 = {"Lcom/marrow/data/models/user/College$JsonParser;", "", "<init>", "()V", "Lorg/json/JSONObject;", "p0", "Lcom/marrow/data/models/user/College;", "fromJSON", "(Lorg/json/JSONObject;)Lcom/marrow/data/models/user/College;", "toJSON", "(Lcom/marrow/data/models/user/College;)Lorg/json/JSONObject;", "", "KEY_STATE_ID", "Ljava/lang/String;", "KEY_COLLEGE_NAME", "KEY_COUNTRY", "KEY_COLLEGE_ID", "KEY_YOP", "KEY_VERIFIED_ON", "KEY_CURRENT_YEAR", "KEY_ADMISSION_YEAR", "KEY_MBBS_VERIFICATION_YEAR"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final College fromJSON(JSONObject p0) {
            if (p0 == null) {
                return null;
            }
            College college = new College();
            college.setStateId(p0.optString("state_id"));
            college.setCollegeName(p0.optString(College.KEY_COLLEGE_NAME));
            college.setCollegeId(p0.optString(College.KEY_COLLEGE_ID));
            college.setCountry(p0.optString("country"));
            college.setYearOfPassout(Integer.valueOf(p0.optInt(College.KEY_YOP)));
            college.setVerifiedOn(Long.valueOf(p0.optLong(College.KEY_VERIFIED_ON)));
            college.setCurrentYear(p0.optString(College.KEY_CURRENT_YEAR));
            college.setYearOfAdmission(p0.optString(College.KEY_ADMISSION_YEAR));
            college.setMbbsVerificationYear(p0.optInt(College.KEY_MBBS_VERIFICATION_YEAR));
            return college;
        }

        public final JSONObject toJSON(College p0) {
            if (p0 == null) {
                return null;
            }
            JSONObject jSONObject = new JSONObject();
            isDvbProfileDeclared.write(jSONObject, "state_id", p0.getStateId());
            isDvbProfileDeclared.write(jSONObject, College.KEY_COLLEGE_ID, p0.getCollegeId());
            isDvbProfileDeclared.write(jSONObject, College.KEY_COLLEGE_NAME, p0.getCollegeName());
            Integer yearOfPassout = p0.getYearOfPassout();
            isDvbProfileDeclared.read(jSONObject, College.KEY_YOP, Integer.valueOf(yearOfPassout != null ? yearOfPassout.intValue() : 0));
            isDvbProfileDeclared.write(jSONObject, "country", p0.getCountry());
            Long verifiedOn = p0.getVerifiedOn();
            isDvbProfileDeclared.read(jSONObject, College.KEY_VERIFIED_ON, Long.valueOf(verifiedOn != null ? verifiedOn.longValue() : 0L));
            isDvbProfileDeclared.write(jSONObject, College.KEY_CURRENT_YEAR, p0.getCurrentYear());
            isDvbProfileDeclared.write(jSONObject, College.KEY_ADMISSION_YEAR, p0.getYearOfAdmission());
            isDvbProfileDeclared.read(jSONObject, College.KEY_MBBS_VERIFICATION_YEAR, Integer.valueOf(p0.getMbbsVerificationYear()));
            return jSONObject;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final String getStateId() {
        return this.stateId;
    }

    public final void setStateId(String str) {
        this.stateId = str;
    }

    public final String getCollegeName() {
        return this.collegeName;
    }

    public final void setCollegeName(String str) {
        this.collegeName = str;
    }

    public final String getCountry() {
        return this.country;
    }

    public final void setCountry(String str) {
        this.country = str;
    }

    public final String getCollegeId() {
        return this.collegeId;
    }

    public final void setCollegeId(String str) {
        this.collegeId = str;
    }

    public final Integer getYearOfPassout() {
        return this.yearOfPassout;
    }

    public final void setYearOfPassout(Integer num) {
        this.yearOfPassout = num;
    }

    public final Long getVerifiedOn() {
        return this.verifiedOn;
    }

    public final void setVerifiedOn(Long l) {
        this.verifiedOn = l;
    }

    public final String getCurrentYear() {
        return this.currentYear;
    }

    public final void setCurrentYear(String str) {
        this.currentYear = str;
    }

    public final String getYearOfAdmission() {
        return this.yearOfAdmission;
    }

    public final void setYearOfAdmission(String str) {
        this.yearOfAdmission = str;
    }

    public final int getMbbsVerificationYear() {
        return this.mbbsVerificationYear;
    }

    public final void setMbbsVerificationYear(int i) {
        this.mbbsVerificationYear = i;
    }

    private final boolean isVerified() {
        String str;
        Long l;
        String str2 = this.collegeId;
        if (str2 == null || str2.length() == 0 || (str = this.collegeName) == null || str.length() == 0 || (l = this.verifiedOn) == null) {
            return false;
        }
        toMagicModuleMetaRepoModel.write(l);
        return l.longValue() != -1;
    }

    public final boolean isUserCollegeDataAvailable() {
        String str;
        String str2 = this.country;
        return (str2 == null || str2.length() == 0 || !isVerified() || (str = this.stateId) == null || str.length() == 0) ? false : true;
    }

    public final Map<String, String> getWhichCollegeDataIsNotPresent() {
        String strValueOf;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String str = this.country;
        String str2 = "null";
        if (str == null) {
            str = "null";
        }
        linkedHashMap.put("country", str);
        String str3 = this.stateId;
        if (str3 == null) {
            str3 = "null";
        }
        linkedHashMap.put("stateId", str3);
        String str4 = this.collegeId;
        if (str4 == null) {
            str4 = "null";
        }
        linkedHashMap.put("collegeId", str4);
        String str5 = this.collegeName;
        if (str5 == null) {
            str5 = "null";
        }
        linkedHashMap.put("collegeName", str5);
        Long l = this.verifiedOn;
        if (l != null && (strValueOf = String.valueOf(l.longValue())) != null) {
            str2 = strValueOf;
        }
        linkedHashMap.put("verifiedOn", str2);
        return linkedHashMap;
    }
}
