package com.marrow.data.models.user;

import com.marrow.data.api.models.response.user.LoggedUserResponse;
import kotlin.Metadata;
import kotlin.TestGroupLSModel;
import kotlin.isFirst;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\t\u001a\u00020\b2\b\u0010\u0003\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ.\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fR\u001a\u0010\u0015\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\fR\u001a\u0010\u0018\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0016\u001a\u0004\b\u0019\u0010\fR\u001a\u0010\u001a\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0016\u001a\u0004\b\u001b\u0010\f"}, d2 = {"Lcom/marrow/data/models/user/CollegeYear;", "", "", "p0", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "equals", "(Ljava/lang/Object;)Z", "component1", "()Ljava/lang/String;", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/marrow/data/models/user/CollegeYear;", "", "hashCode", "()I", "toString", "id", "Ljava/lang/String;", "getId", "display", "getDisplay", LoggedUserResponse.KEY_PROFESSION, "getProfession"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CollegeYear {

    @isFirst(RemoteActionCompatParcelizer = "display")
    private final String display;

    @isFirst(RemoteActionCompatParcelizer = "id")
    private final String id;

    @isFirst(RemoteActionCompatParcelizer = LoggedUserResponse.KEY_PROFESSION)
    private final String profession;

    public CollegeYear(String str, String str2, String str3) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        this.id = str;
        this.display = str2;
        this.profession = str3;
    }

    public final String getId() {
        return this.id;
    }

    public final String getDisplay() {
        return this.display;
    }

    public final String getProfession() {
        return this.profession;
    }

    public final boolean equals(Object p0) {
        return p0 != null && (p0 instanceof CollegeYear) && TestGroupLSModel.read(((CollegeYear) p0).display, this.display, true);
    }

    public static /* synthetic */ CollegeYear copy$default(CollegeYear collegeYear, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = collegeYear.id;
        }
        if ((i & 2) != 0) {
            str2 = collegeYear.display;
        }
        if ((i & 4) != 0) {
            str3 = collegeYear.profession;
        }
        return collegeYear.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDisplay() {
        return this.display;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getProfession() {
        return this.profession;
    }

    public final CollegeYear copy(String p0, String p1, String p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        return new CollegeYear(p0, p1, p2);
    }

    public final int hashCode() {
        return (((this.id.hashCode() * 31) + this.display.hashCode()) * 31) + this.profession.hashCode();
    }

    public final String toString() {
        String str = this.id;
        String str2 = this.display;
        String str3 = this.profession;
        StringBuilder sb = new StringBuilder("CollegeYear(id=");
        sb.append(str);
        sb.append(", display=");
        sb.append(str2);
        sb.append(", profession=");
        sb.append(str3);
        sb.append(")");
        return sb.toString();
    }
}
