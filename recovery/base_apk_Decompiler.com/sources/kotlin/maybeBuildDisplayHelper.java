package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\fHÆ\u0003JG\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u00072\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006\""}, d2 = {"Lcom/marrow2/ui/bookmark/landing/model/BookmarkUIModel;", "", "isLoading", "", "totalBookmark", "", "bookmarkCountList", "", "Lcom/marrow2/ui/bookmark/landing/model/BookmarkCount;", "subjectBookmarkList", "Lcom/marrow2/ui/bookmark/landing/model/SubjectBookmark;", "bookmarkSyncType", "Lcom/marrow2/ui/bookmark/landing/model/BookmarkSyncType;", "<init>", "(ZILjava/util/List;Ljava/util/List;Lcom/marrow2/ui/bookmark/landing/model/BookmarkSyncType;)V", "()Z", "getTotalBookmark", "()I", "getBookmarkCountList", "()Ljava/util/List;", "getSubjectBookmarkList", "getBookmarkSyncType", "()Lcom/marrow2/ui/bookmark/landing/model/BookmarkSyncType;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class maybeBuildDisplayHelper {
    private final closestVsync AudioAttributesCompatParcelizer;
    private final List<clearSurfaceFrameRate> IconCompatParcelizer;
    private final int RemoteActionCompatParcelizer;
    private final List<adjustReleaseTime> read;
    private final boolean write;

    private maybeBuildDisplayHelper(boolean z, int i, List<clearSurfaceFrameRate> list, List<adjustReleaseTime> list2, closestVsync closestvsync) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(closestvsync, "");
        this.write = z;
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = list;
        this.read = list2;
        this.AudioAttributesCompatParcelizer = closestvsync;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public /* synthetic */ maybeBuildDisplayHelper(boolean z, int i, List list, List list2, closestVsync closestvsync, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? true : z, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i2 & 8) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list2, (i2 & 16) != 0 ? closestVsync.write : closestvsync);
    }

    public final List<clearSurfaceFrameRate> read() {
        return this.IconCompatParcelizer;
    }

    public final List<adjustReleaseTime> write() {
        return this.read;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final closestVsync getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public maybeBuildDisplayHelper() {
        this(false, 0, null, null, null, 31, null);
    }

    public static /* synthetic */ maybeBuildDisplayHelper AudioAttributesCompatParcelizer(maybeBuildDisplayHelper maybebuilddisplayhelper, boolean z, int i, List list, List list2, closestVsync closestvsync, int i2) {
        if ((i2 & 1) != 0) {
            z = maybebuilddisplayhelper.write;
        }
        if ((i2 & 2) != 0) {
            i = maybebuilddisplayhelper.RemoteActionCompatParcelizer;
        }
        if ((i2 & 4) != 0) {
            list = maybebuilddisplayhelper.IconCompatParcelizer;
        }
        if ((i2 & 8) != 0) {
            list2 = maybebuilddisplayhelper.read;
        }
        if ((i2 & 16) != 0) {
            closestvsync = maybebuilddisplayhelper.AudioAttributesCompatParcelizer;
        }
        return IconCompatParcelizer(z, i, list, list2, closestvsync);
    }

    private static maybeBuildDisplayHelper IconCompatParcelizer(boolean z, int i, List<clearSurfaceFrameRate> list, List<adjustReleaseTime> list2, closestVsync closestvsync) {
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(list2, "");
        toMagicModuleMetaRepoModel.write(closestvsync, "");
        return new maybeBuildDisplayHelper(z, i, list, list2, closestvsync);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof maybeBuildDisplayHelper)) {
            return false;
        }
        maybeBuildDisplayHelper maybebuilddisplayhelper = (maybeBuildDisplayHelper) other;
        return this.write == maybebuilddisplayhelper.write && this.RemoteActionCompatParcelizer == maybebuilddisplayhelper.RemoteActionCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, maybebuilddisplayhelper.IconCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, maybebuilddisplayhelper.read) && this.AudioAttributesCompatParcelizer == maybebuilddisplayhelper.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((((((Boolean.hashCode(this.write) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + this.read.hashCode()) * 31) + this.AudioAttributesCompatParcelizer.hashCode();
    }

    public final String toString() {
        boolean z = this.write;
        int i = this.RemoteActionCompatParcelizer;
        List<clearSurfaceFrameRate> list = this.IconCompatParcelizer;
        List<adjustReleaseTime> list2 = this.read;
        closestVsync closestvsync = this.AudioAttributesCompatParcelizer;
        StringBuilder sb = new StringBuilder("BookmarkUIModel(isLoading=");
        sb.append(z);
        sb.append(", totalBookmark=");
        sb.append(i);
        sb.append(", bookmarkCountList=");
        sb.append(list);
        sb.append(", subjectBookmarkList=");
        sb.append(list2);
        sb.append(", bookmarkSyncType=");
        sb.append(closestvsync);
        sb.append(")");
        return sb.toString();
    }
}
