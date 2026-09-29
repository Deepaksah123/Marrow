package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003\u0012\b\b\u0002\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\r¨\u0006\u001f"}, d2 = {"Lcom/marrow2/ui/signup/college/college_list/model/CollegeSelectionUiData;", "", "searchedText", "", "collegeList", "", "Lcom/marrow2/ui/signup/college/state_country/model/DataVMModel;", "id", "collegeId", "collegeName", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getSearchedText", "()Ljava/lang/String;", "getCollegeList", "()Ljava/util/List;", "getId", "getCollegeId", "getCollegeName", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class getStreetViewPanoramaLocation {
    private final List<fromPath> AudioAttributesCompatParcelizer;
    private final String IconCompatParcelizer;
    private final String RemoteActionCompatParcelizer;
    private final String read;
    private final String write;

    private getStreetViewPanoramaLocation(String str, List<fromPath> list, String str2, String str3, String str4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        this.IconCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = list;
        this.read = str2;
        this.write = str3;
        this.RemoteActionCompatParcelizer = str4;
    }

    public /* synthetic */ getStreetViewPanoramaLocation(String str, List list, String str2, String str3, String str4, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? "" : str4);
    }

    public final List<fromPath> AudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public getStreetViewPanoramaLocation() {
        this(null, null, null, null, null, 31, null);
    }

    public static /* synthetic */ getStreetViewPanoramaLocation RemoteActionCompatParcelizer(getStreetViewPanoramaLocation getstreetviewpanoramalocation, String str, List list, String str2, String str3, String str4, int i) {
        if ((i & 1) != 0) {
            str = getstreetviewpanoramalocation.IconCompatParcelizer;
        }
        if ((i & 2) != 0) {
            list = getstreetviewpanoramalocation.AudioAttributesCompatParcelizer;
        }
        if ((i & 4) != 0) {
            str2 = getstreetviewpanoramalocation.read;
        }
        if ((i & 8) != 0) {
            str3 = getstreetviewpanoramalocation.write;
        }
        if ((i & 16) != 0) {
            str4 = getstreetviewpanoramalocation.RemoteActionCompatParcelizer;
        }
        return RemoteActionCompatParcelizer(str, list, str2, str3, str4);
    }

    private static getStreetViewPanoramaLocation RemoteActionCompatParcelizer(String str, List<fromPath> list, String str2, String str3, String str4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        toMagicModuleMetaRepoModel.write(str3, "");
        toMagicModuleMetaRepoModel.write(str4, "");
        return new getStreetViewPanoramaLocation(str, list, str2, str3, str4);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof getStreetViewPanoramaLocation)) {
            return false;
        }
        getStreetViewPanoramaLocation getstreetviewpanoramalocation = (getStreetViewPanoramaLocation) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) getstreetviewpanoramalocation.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, getstreetviewpanoramalocation.AudioAttributesCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.read, (Object) getstreetviewpanoramalocation.read) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) getstreetviewpanoramalocation.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) getstreetviewpanoramalocation.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (((((((this.IconCompatParcelizer.hashCode() * 31) + this.AudioAttributesCompatParcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + this.write.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        String str = this.IconCompatParcelizer;
        List<fromPath> list = this.AudioAttributesCompatParcelizer;
        String str2 = this.read;
        String str3 = this.write;
        String str4 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("CollegeSelectionUiData(searchedText=");
        sb.append(str);
        sb.append(", collegeList=");
        sb.append(list);
        sb.append(", id=");
        sb.append(str2);
        sb.append(", collegeId=");
        sb.append(str3);
        sb.append(", collegeName=");
        sb.append(str4);
        sb.append(")");
        return sb.toString();
    }
}
