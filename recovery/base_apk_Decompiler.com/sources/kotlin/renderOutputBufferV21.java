package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003J=\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00032\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/marrow2/ui/bookmark/detail/model/BookmarkFilterUIState;", "", "showSubjectFilter", "", "showBookmarkFilter", "subjectList", "", "Lcom/marrow2/ui/bookmark/landing/model/SubjectBookmark;", "bookmarkList", "Lcom/marrow2/ui/bookmark/landing/model/BookmarkCount;", "<init>", "(ZZLjava/util/List;Ljava/util/List;)V", "getShowSubjectFilter", "()Z", "getShowBookmarkFilter", "getSubjectList", "()Ljava/util/List;", "getBookmarkList", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class renderOutputBufferV21 {
    private final boolean AudioAttributesCompatParcelizer;
    private final boolean IconCompatParcelizer;
    private final List<clearSurfaceFrameRate> RemoteActionCompatParcelizer;
    private final List<adjustReleaseTime> write;

    private renderOutputBufferV21(boolean z, boolean z2, List<adjustReleaseTime> list, List<clearSurfaceFrameRate> list2) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        this.AudioAttributesCompatParcelizer = z;
        this.IconCompatParcelizer = z2;
        this.write = list;
        this.RemoteActionCompatParcelizer = list2;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final boolean getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public /* synthetic */ renderOutputBufferV21(boolean z, boolean z2, List list, List list2, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i & 1) != 0 ? false : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i & 8) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2);
    }

    public final List<adjustReleaseTime> write() {
        return this.write;
    }

    public final List<clearSurfaceFrameRate> read() {
        return this.RemoteActionCompatParcelizer;
    }

    public renderOutputBufferV21() {
        this(false, false, null, null, 15, null);
    }

    public static /* synthetic */ renderOutputBufferV21 read(renderOutputBufferV21 renderoutputbufferv21, boolean z, boolean z2, List list, List list2, int i) {
        if ((i & 1) != 0) {
            z = renderoutputbufferv21.AudioAttributesCompatParcelizer;
        }
        if ((i & 2) != 0) {
            z2 = renderoutputbufferv21.IconCompatParcelizer;
        }
        if ((i & 4) != 0) {
            list = renderoutputbufferv21.write;
        }
        if ((i & 8) != 0) {
            list2 = renderoutputbufferv21.RemoteActionCompatParcelizer;
        }
        return IconCompatParcelizer(z, z2, list, list2);
    }

    private static renderOutputBufferV21 IconCompatParcelizer(boolean z, boolean z2, List<adjustReleaseTime> list, List<clearSurfaceFrameRate> list2) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        return new renderOutputBufferV21(z, z2, list, list2);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof renderOutputBufferV21)) {
            return false;
        }
        renderOutputBufferV21 renderoutputbufferv21 = (renderOutputBufferV21) other;
        return this.AudioAttributesCompatParcelizer == renderoutputbufferv21.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == renderoutputbufferv21.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.write, renderoutputbufferv21.write) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, renderoutputbufferv21.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        return (((((Boolean.hashCode(this.AudioAttributesCompatParcelizer) * 31) + Boolean.hashCode(this.IconCompatParcelizer)) * 31) + this.write.hashCode()) * 31) + this.RemoteActionCompatParcelizer.hashCode();
    }

    public final String toString() {
        boolean z = this.AudioAttributesCompatParcelizer;
        boolean z2 = this.IconCompatParcelizer;
        List<adjustReleaseTime> list = this.write;
        List<clearSurfaceFrameRate> list2 = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("BookmarkFilterUIState(showSubjectFilter=");
        sb.append(z);
        sb.append(", showBookmarkFilter=");
        sb.append(z2);
        sb.append(", subjectList=");
        sb.append(list);
        sb.append(", bookmarkList=");
        sb.append(list2);
        sb.append(")");
        return sb.toString();
    }
}
