package kotlin;

import com.marrow2.data.user.remote.model.CourseModelV3;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/marrow2/ui/courseswitch/model/CourseListData;", "", "courses", "", "Lcom/marrow2/data/user/remote/model/CourseModelV3;", "defaultCourseId", "", "defaultEditionId", "<init>", "(Ljava/util/List;II)V", "getCourses", "()Ljava/util/List;", "getDefaultCourseId", "()I", "getDefaultEditionId", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class addVideoSurfaceListener {
    private final int AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final List<CourseModelV3> read;

    public addVideoSurfaceListener(List<CourseModelV3> list, int i, int i2) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.read = list;
        this.AudioAttributesCompatParcelizer = i;
        this.IconCompatParcelizer = i2;
    }

    public /* synthetic */ addVideoSurfaceListener(List list, int i, int i2, int i3, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i3 & 1) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }

    public final List<CourseModelV3> IconCompatParcelizer() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public addVideoSurfaceListener() {
        this(null, 0, 0, 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static addVideoSurfaceListener AudioAttributesCompatParcelizer(List<CourseModelV3> list, int i, int i2) {
        toMagicModuleMetaRepoModel.write(list, "");
        return new addVideoSurfaceListener(list, i, i2);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof addVideoSurfaceListener)) {
            return false;
        }
        addVideoSurfaceListener addvideosurfacelistener = (addVideoSurfaceListener) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, addvideosurfacelistener.read) && this.AudioAttributesCompatParcelizer == addvideosurfacelistener.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == addvideosurfacelistener.IconCompatParcelizer;
    }

    public final int hashCode() {
        return (((this.read.hashCode() * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        List<CourseModelV3> list = this.read;
        int i = this.AudioAttributesCompatParcelizer;
        int i2 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder("CourseListData(courses=");
        sb.append(list);
        sb.append(", defaultCourseId=");
        sb.append(i);
        sb.append(", defaultEditionId=");
        sb.append(i2);
        sb.append(")");
        return sb.toString();
    }
}
