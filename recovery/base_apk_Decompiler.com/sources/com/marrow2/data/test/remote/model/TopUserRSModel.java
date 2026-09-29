package com.marrow2.data.test.remote.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.marrow.data.models.test.TopUser;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@JsonIgnoreProperties(ignoreUnknown = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b2\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0003\u0010\b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\n\u001a\u00020\t\u0012\b\b\u0003\u0010\u000b\u001a\u00020\u0007\u0012\b\b\u0003\u0010\f\u001a\u00020\u0007\u0012\b\b\u0003\u0010\r\u001a\u00020\u0007\u0012\b\b\u0003\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0010\u0010\u0017\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0018J\u0010\u0010\u001c\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0018J\u0010\u0010\u001d\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ|\u0010 \u001a\u00020\u00002\n\b\u0003\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0003\u0010\b\u001a\u00020\u00072\b\b\u0003\u0010\n\u001a\u00020\t2\b\b\u0003\u0010\u000b\u001a\u00020\u00072\b\b\u0003\u0010\f\u001a\u00020\u00072\b\b\u0003\u0010\r\u001a\u00020\u00072\b\b\u0003\u0010\u000f\u001a\u00020\u000eHÆ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010\"\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b$\u0010\u0018J\u0010\u0010%\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b%\u0010\u0013R\u0019\u0010&\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010\u0013R\u001c\u0010)\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b)\u0010'\u001a\u0004\b*\u0010\u0013R\u001c\u0010+\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b,\u0010\u0013R\u001c\u0010-\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b-\u0010'\u001a\u0004\b.\u0010\u0013R\u001a\u0010/\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u0010\u0018R\u001a\u00102\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u0010\u001aR\u001a\u00105\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u0010\u0018R\u001a\u00107\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b7\u00100\u001a\u0004\b8\u0010\u0018R\"\u00109\u001a\u00020\u00078\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b9\u00100\u001a\u0004\b:\u0010\u0018\"\u0004\b;\u0010<R\"\u0010=\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b=\u0010\u001f\"\u0004\b?\u0010@"}, d2 = {"Lcom/marrow2/data/test/remote/model/TopUserRSModel;", "", "", "p0", "p1", "p2", "p3", "", "p4", "", "p5", "p6", "p7", "p8", "", "p9", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDIIIZ)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()I", "component6", "()D", "component7", "component8", "component9", "component10", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IDIIIZ)Lcom/marrow2/data/test/remote/model/TopUserRSModel;", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "id", "Ljava/lang/String;", "getId", "firstName", "getFirstName", "lastName", "getLastName", "profilePic", "getProfilePic", TopUser.KEY_RANK, "I", "getRank", "score", "D", "getScore", "wrong", "getWrong", "skipped", "getSkipped", "correct", "getCorrect", "setCorrect", "(I)V", "isAnonymous", "Z", "setAnonymous", "(Z)V"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class TopUserRSModel {
    public static final int $stable = 8;
    private int correct;
    private final String firstName;
    private final String id;
    private boolean isAnonymous;
    private final String lastName;
    private final String profilePic;
    private final int rank;
    private final double score;
    private final int skipped;
    private final int wrong;

    public TopUserRSModel(@JsonProperty("_id") String str, @JsonProperty("fname") String str2, @JsonProperty("lname") String str3, @JsonProperty("profile_pic") String str4, @JsonProperty(TopUser.KEY_RANK) int i, @JsonProperty("score") double d, @JsonProperty("wrong") int i2, @JsonProperty("skipped") int i3, @JsonProperty("correct") int i4, @JsonProperty(TopUser.KEY_IS_ANONYMOUS) boolean z) {
        this.id = str;
        this.firstName = str2;
        this.lastName = str3;
        this.profilePic = str4;
        this.rank = i;
        this.score = d;
        this.wrong = i2;
        this.skipped = i3;
        this.correct = i4;
        this.isAnonymous = z;
    }

    public /* synthetic */ TopUserRSModel(String str, String str2, String str3, String str4, int i, double d, int i2, int i3, int i4, boolean z, int i5, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(str, str2, str3, (i5 & 8) != 0 ? null : str4, (i5 & 16) != 0 ? 0 : i, (i5 & 32) != 0 ? 0.0d : d, (i5 & 64) != 0 ? 0 : i2, (i5 & 128) != 0 ? 0 : i3, (i5 & 256) != 0 ? 0 : i4, (i5 & 512) != 0 ? false : z);
    }

    public final String getId() {
        return this.id;
    }

    public final String getFirstName() {
        return this.firstName;
    }

    public final String getLastName() {
        return this.lastName;
    }

    public final String getProfilePic() {
        return this.profilePic;
    }

    public final int getRank() {
        return this.rank;
    }

    public final double getScore() {
        return this.score;
    }

    public final int getWrong() {
        return this.wrong;
    }

    public final int getSkipped() {
        return this.skipped;
    }

    public final int getCorrect() {
        return this.correct;
    }

    public final void setCorrect(int i) {
        this.correct = i;
    }

    public final boolean isAnonymous() {
        return this.isAnonymous;
    }

    public final void setAnonymous(boolean z) {
        this.isAnonymous = z;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component10, reason: from getter */
    public final boolean getIsAnonymous() {
        return this.isAnonymous;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getFirstName() {
        return this.firstName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getLastName() {
        return this.lastName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getProfilePic() {
        return this.profilePic;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getRank() {
        return this.rank;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final double getScore() {
        return this.score;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getWrong() {
        return this.wrong;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getSkipped() {
        return this.skipped;
    }

    /* JADX INFO: renamed from: component9, reason: from getter */
    public final int getCorrect() {
        return this.correct;
    }

    public final TopUserRSModel copy(@JsonProperty("_id") String p0, @JsonProperty("fname") String p1, @JsonProperty("lname") String p2, @JsonProperty("profile_pic") String p3, @JsonProperty(TopUser.KEY_RANK) int p4, @JsonProperty("score") double p5, @JsonProperty("wrong") int p6, @JsonProperty("skipped") int p7, @JsonProperty("correct") int p8, @JsonProperty(TopUser.KEY_IS_ANONYMOUS) boolean p9) {
        return new TopUserRSModel(p0, p1, p2, p3, p4, p5, p6, p7, p8, p9);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof TopUserRSModel)) {
            return false;
        }
        TopUserRSModel topUserRSModel = (TopUserRSModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.id, (Object) topUserRSModel.id) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.firstName, (Object) topUserRSModel.firstName) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.lastName, (Object) topUserRSModel.lastName) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.profilePic, (Object) topUserRSModel.profilePic) && this.rank == topUserRSModel.rank && Double.compare(this.score, topUserRSModel.score) == 0 && this.wrong == topUserRSModel.wrong && this.skipped == topUserRSModel.skipped && this.correct == topUserRSModel.correct && this.isAnonymous == topUserRSModel.isAnonymous;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = str == null ? 0 : str.hashCode();
        String str2 = this.firstName;
        int iHashCode2 = str2 == null ? 0 : str2.hashCode();
        String str3 = this.lastName;
        int iHashCode3 = str3 == null ? 0 : str3.hashCode();
        String str4 = this.profilePic;
        return (((((((((((((((((iHashCode * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0)) * 31) + Integer.hashCode(this.rank)) * 31) + Double.hashCode(this.score)) * 31) + Integer.hashCode(this.wrong)) * 31) + Integer.hashCode(this.skipped)) * 31) + Integer.hashCode(this.correct)) * 31) + Boolean.hashCode(this.isAnonymous);
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.firstName;
        String str3 = this.lastName;
        String str4 = this.profilePic;
        int i = this.rank;
        double d = this.score;
        int i2 = this.wrong;
        int i3 = this.skipped;
        int i4 = this.correct;
        boolean z = this.isAnonymous;
        StringBuilder sb = new StringBuilder("TopUserRSModel(id=");
        sb.append(str);
        sb.append(", firstName=");
        sb.append(str2);
        sb.append(", lastName=");
        sb.append(str3);
        sb.append(", profilePic=");
        sb.append(str4);
        sb.append(", rank=");
        sb.append(i);
        sb.append(", score=");
        sb.append(d);
        sb.append(", wrong=");
        sb.append(i2);
        sb.append(", skipped=");
        sb.append(i3);
        sb.append(", correct=");
        sb.append(i4);
        sb.append(", isAnonymous=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }
}
