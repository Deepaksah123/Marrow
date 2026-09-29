package com.marrow2.data.user.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.user.College;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin.toMagicModuleMetaRepoModel;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b)\b\u0087\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0012J\u0019\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0018J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0018J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0018J\u0010\u0010\"\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\"\u0010\u001dJl\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010%\u001a\u00020\u00102\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b'\u0010\u001dJ\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0018R\u001a\u0010)\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0018R\u001a\u0010,\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b,\u0010*\u001a\u0004\b-\u0010\u0018R\u001a\u0010.\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u0010\u0018R\u001a\u00100\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u0010\u0018R\u001a\u00102\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u001dR\u001a\u00105\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u001fR\u001a\u00108\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b8\u0010*\u001a\u0004\b9\u0010\u0018R\u001c\u0010:\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b:\u0010*\u001a\u0004\b;\u0010\u0018R\u001a\u0010<\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b<\u00103\u001a\u0004\b=\u0010\u001d"}, d2 = {"Lcom/marrow2/data/user/remote/model/CollegeDetails;", "", "", "p0", "p1", "p2", "p3", "", "p4", "", "p5", "p6", "p7", "p8", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;I)V", "", "isVerified", "()Z", "isUserCollegeDataAvailable", "", "getWhichCollegeDataIsNotPresent", "()Ljava/util/Map;", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()I", "component6", "()J", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/String;I)Lcom/marrow2/data/user/remote/model/CollegeDetails;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "state_id", "Ljava/lang/String;", "getState_id", College.KEY_COLLEGE_NAME, "getClg_name", "country", "getCountry", College.KEY_COLLEGE_ID, "getClg_id", College.KEY_YOP, "I", "getYop", College.KEY_VERIFIED_ON, "J", "getVerified_on", College.KEY_CURRENT_YEAR, "getCurr_year", College.KEY_ADMISSION_YEAR, "getYear_of_admission", College.KEY_MBBS_VERIFICATION_YEAR, "getMbbs_verified_year"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollegeDetails {
    public static final int $stable = 0;

    @JsonProperty(College.KEY_COLLEGE_ID)
    private final String clg_id;

    @JsonProperty(College.KEY_COLLEGE_NAME)
    private final String clg_name;

    @JsonProperty("country")
    private final String country;

    @JsonProperty(College.KEY_CURRENT_YEAR)
    private final String curr_year;

    @JsonProperty(College.KEY_MBBS_VERIFICATION_YEAR)
    private final int mbbs_verified_year;

    @JsonProperty("state_id")
    private final String state_id;

    @JsonProperty(College.KEY_VERIFIED_ON)
    private final long verified_on;

    @JsonProperty(College.KEY_ADMISSION_YEAR)
    private final String year_of_admission;

    @JsonProperty(College.KEY_YOP)
    private final int yop;

    public CollegeDetails(String str, String str2, String str3, String str4, int i, long j, String str5, String str6, int i2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        toMagicModuleMetaRepoModel.write(str5, "");
        this.state_id = str;
        this.clg_name = str2;
        this.country = str3;
        this.clg_id = str4;
        this.yop = i;
        this.verified_on = j;
        this.curr_year = str5;
        this.year_of_admission = str6;
        this.mbbs_verified_year = i2;
    }

    public /* synthetic */ CollegeDetails(String str, String str2, String str3, String str4, int i, long j, String str5, String str6, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? "" : str2, (i3 & 4) != 0 ? "" : str3, (i3 & 8) != 0 ? "" : str4, (i3 & 16) != 0 ? -1 : i, (i3 & 32) != 0 ? -1L : j, (i3 & 64) != 0 ? "" : str5, (i3 & 128) != 0 ? "" : str6, (i3 & 256) != 0 ? 0 : i2);
    }

    public final String getState_id() {
        return this.state_id;
    }

    public final String getClg_name() {
        return this.clg_name;
    }

    public final String getCountry() {
        return this.country;
    }

    public final String getClg_id() {
        return this.clg_id;
    }

    public final int getYop() {
        return this.yop;
    }

    public final long getVerified_on() {
        return this.verified_on;
    }

    public final String getCurr_year() {
        return this.curr_year;
    }

    public final String getYear_of_admission() {
        return this.year_of_admission;
    }

    public final int getMbbs_verified_year() {
        return this.mbbs_verified_year;
    }

    private final boolean isVerified() {
        return (TestGroupLSModel.IconCompatParcelizer((CharSequence) this.clg_id) || TestGroupLSModel.IconCompatParcelizer((CharSequence) this.clg_name) || this.verified_on == -1) ? false : true;
    }

    public final boolean isUserCollegeDataAvailable() {
        return (TestGroupLSModel.IconCompatParcelizer((CharSequence) this.country) || !isVerified() || TestGroupLSModel.IconCompatParcelizer((CharSequence) this.state_id)) ? false : true;
    }

    public final Map<String, String> getWhichCollegeDataIsNotPresent() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("country", this.country);
        linkedHashMap.put("stateId", this.state_id);
        linkedHashMap.put("collegeId", this.clg_id);
        linkedHashMap.put("collegeName", this.clg_name);
        linkedHashMap.put("verifiedOn", String.valueOf(this.verified_on));
        return linkedHashMap;
    }

    public CollegeDetails() {
        this(null, null, null, null, 0, 0L, null, null, 0, UnixStat.DEFAULT_LINK_PERM, null);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getState_id() {
        return this.state_id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getClg_name() {
        return this.clg_name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCountry() {
        return this.country;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getClg_id() {
        return this.clg_id;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getYop() {
        return this.yop;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final long getVerified_on() {
        return this.verified_on;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getCurr_year() {
        return this.curr_year;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getYear_of_admission() {
        return this.year_of_admission;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getMbbs_verified_year() {
        return this.mbbs_verified_year;
    }

    public final CollegeDetails copy(String p0, String p1, String p2, String p3, int p4, long p5, String p6, String p7, int p8) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        toMagicModuleMetaRepoModel.write(p6, "");
        return new CollegeDetails(p0, p1, p2, p3, p4, p5, p6, p7, p8);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof CollegeDetails)) {
            return false;
        }
        CollegeDetails collegeDetails = (CollegeDetails) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.state_id, (Object) collegeDetails.state_id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.clg_name, (Object) collegeDetails.clg_name) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.country, (Object) collegeDetails.country) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.clg_id, (Object) collegeDetails.clg_id) && this.yop == collegeDetails.yop && this.verified_on == collegeDetails.verified_on && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.curr_year, (Object) collegeDetails.curr_year) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.year_of_admission, (Object) collegeDetails.year_of_admission) && this.mbbs_verified_year == collegeDetails.mbbs_verified_year;
    }

    public final int hashCode() {
        int iHashCode = this.state_id.hashCode();
        int iHashCode2 = this.clg_name.hashCode();
        int iHashCode3 = this.country.hashCode();
        int iHashCode4 = this.clg_id.hashCode();
        int iHashCode5 = Integer.hashCode(this.yop);
        int iHashCode6 = Long.hashCode(this.verified_on);
        int iHashCode7 = this.curr_year.hashCode();
        String str = this.year_of_admission;
        return (((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + iHashCode4) * 31) + iHashCode5) * 31) + iHashCode6) * 31) + iHashCode7) * 31) + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.mbbs_verified_year);
    }

    public final String toString() {
        String str = this.state_id;
        String str2 = this.clg_name;
        String str3 = this.country;
        String str4 = this.clg_id;
        int i = this.yop;
        long j = this.verified_on;
        String str5 = this.curr_year;
        String str6 = this.year_of_admission;
        int i2 = this.mbbs_verified_year;
        StringBuilder sb = new StringBuilder("CollegeDetails(state_id=");
        sb.append(str);
        sb.append(", clg_name=");
        sb.append(str2);
        sb.append(", country=");
        sb.append(str3);
        sb.append(", clg_id=");
        sb.append(str4);
        sb.append(", yop=");
        sb.append(i);
        sb.append(", verified_on=");
        sb.append(j);
        sb.append(", curr_year=");
        sb.append(str5);
        sb.append(", year_of_admission=");
        sb.append(str6);
        sb.append(", mbbs_verified_year=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
