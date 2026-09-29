package kotlin;

import com.marrow2.ui.video.downloaded_videos.model.DownloadedCourseUIModel;
import java.util.List;
import kotlin.Metadata;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\b\b\u0002\u0010\n\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003Ji\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\b\b\u0002\u0010\n\u001a\u00020\u00032\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\b\u0002\u0010\u000e\u001a\u00020\u0003HÆ\u0001J\u0013\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\t\u0010(\u001a\u00020)HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0013R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0013R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u000e\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0011¨\u0006*"}, d2 = {"Lcom/marrow2/ui/video/downloaded_videos/model/DownloadVideosState;", "", "isDeleteActive", "", "downloadLimit", "", "showEmptyState", "showDeleteButton", "downloadedItemsCount", "selectedItemsCount", "areAllChecked", "courses", "", "Lcom/marrow2/ui/video/downloaded_videos/model/DownloadedCourseUIModel;", "isCurrentCourseOnly", "<init>", "(ZIZZIIZLjava/util/List;Z)V", "()Z", "getDownloadLimit", "()I", "getShowEmptyState", "getShowDeleteButton", "getDownloadedItemsCount", "getSelectedItemsCount", "getAreAllChecked", "getCourses", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class setInlineLabel {
    private final boolean AudioAttributesCompatParcelizer;
    private final boolean AudioAttributesImplApi21Parcelizer;
    private final boolean AudioAttributesImplApi26Parcelizer;
    private final List<DownloadedCourseUIModel> IconCompatParcelizer;
    private final boolean MediaBrowserCompatCustomActionResultReceiver;
    private final int MediaBrowserCompatItemReceiver;
    private final int RemoteActionCompatParcelizer;
    private final int read;
    private final boolean write;

    private setInlineLabel(boolean z, int i, boolean z2, boolean z3, int i2, int i3, boolean z4, List<DownloadedCourseUIModel> list, boolean z5) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.AudioAttributesImplApi21Parcelizer = z;
        this.RemoteActionCompatParcelizer = i;
        this.AudioAttributesImplApi26Parcelizer = z2;
        this.MediaBrowserCompatCustomActionResultReceiver = z3;
        this.read = i2;
        this.MediaBrowserCompatItemReceiver = i3;
        this.AudioAttributesCompatParcelizer = z4;
        this.IconCompatParcelizer = list;
        this.write = z5;
    }

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from getter */
    public final boolean getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final boolean getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final boolean getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public /* synthetic */ setInlineLabel(boolean z, int i, boolean z2, boolean z3, int i2, int i3, boolean z4, List list, boolean z5, int i4, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i4 & 1) != 0 ? false : z, (i4 & 2) != 0 ? 10 : i, (i4 & 4) != 0 ? true : z2, (i4 & 8) != 0 ? false : z3, (i4 & 16) != 0 ? 0 : i2, (i4 & 32) != 0 ? 0 : i3, (i4 & 64) != 0 ? false : z4, (i4 & 128) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i4 & 256) != 0 ? true : z5);
    }

    public final List<DownloadedCourseUIModel> IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    public setInlineLabel() {
        this(false, 0, false, false, 0, 0, false, null, false, UnixStat.DEFAULT_LINK_PERM, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static setInlineLabel RemoteActionCompatParcelizer(boolean z, int i, boolean z2, boolean z3, int i2, int i3, boolean z4, List<DownloadedCourseUIModel> list, boolean z5) {
        toMagicModuleMetaRepoModel.write(list, "");
        return new setInlineLabel(z, i, z2, z3, i2, i3, z4, list, z5);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof setInlineLabel)) {
            return false;
        }
        setInlineLabel setinlinelabel = (setInlineLabel) other;
        return this.AudioAttributesImplApi21Parcelizer == setinlinelabel.AudioAttributesImplApi21Parcelizer && this.RemoteActionCompatParcelizer == setinlinelabel.RemoteActionCompatParcelizer && this.AudioAttributesImplApi26Parcelizer == setinlinelabel.AudioAttributesImplApi26Parcelizer && this.MediaBrowserCompatCustomActionResultReceiver == setinlinelabel.MediaBrowserCompatCustomActionResultReceiver && this.read == setinlinelabel.read && this.MediaBrowserCompatItemReceiver == setinlinelabel.MediaBrowserCompatItemReceiver && this.AudioAttributesCompatParcelizer == setinlinelabel.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, setinlinelabel.IconCompatParcelizer) && this.write == setinlinelabel.write;
    }

    public final int hashCode() {
        return (((((((((((((((Boolean.hashCode(this.AudioAttributesImplApi21Parcelizer) * 31) + Integer.hashCode(this.RemoteActionCompatParcelizer)) * 31) + Boolean.hashCode(this.AudioAttributesImplApi26Parcelizer)) * 31) + Boolean.hashCode(this.MediaBrowserCompatCustomActionResultReceiver)) * 31) + Integer.hashCode(this.read)) * 31) + Integer.hashCode(this.MediaBrowserCompatItemReceiver)) * 31) + Boolean.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Boolean.hashCode(this.write);
    }

    public final String toString() {
        boolean z = this.AudioAttributesImplApi21Parcelizer;
        int i = this.RemoteActionCompatParcelizer;
        boolean z2 = this.AudioAttributesImplApi26Parcelizer;
        boolean z3 = this.MediaBrowserCompatCustomActionResultReceiver;
        int i2 = this.read;
        int i3 = this.MediaBrowserCompatItemReceiver;
        boolean z4 = this.AudioAttributesCompatParcelizer;
        List<DownloadedCourseUIModel> list = this.IconCompatParcelizer;
        boolean z5 = this.write;
        StringBuilder sb = new StringBuilder("DownloadVideosState(isDeleteActive=");
        sb.append(z);
        sb.append(", downloadLimit=");
        sb.append(i);
        sb.append(", showEmptyState=");
        sb.append(z2);
        sb.append(", showDeleteButton=");
        sb.append(z3);
        sb.append(", downloadedItemsCount=");
        sb.append(i2);
        sb.append(", selectedItemsCount=");
        sb.append(i3);
        sb.append(", areAllChecked=");
        sb.append(z4);
        sb.append(", courses=");
        sb.append(list);
        sb.append(", isCurrentCourseOnly=");
        sb.append(z5);
        sb.append(")");
        return sb.toString();
    }
}
