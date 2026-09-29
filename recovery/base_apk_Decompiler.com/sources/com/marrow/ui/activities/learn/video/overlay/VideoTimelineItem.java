package com.marrow.ui.activities.learn.video.overlay;

import android.os.Parcel;
import android.os.Parcelable;
import com.marrow.data.models.video.Timeline;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0007HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0014\u001a\u00020\u0007J\u0013\u0010\u0015\u001a\u00020\u00052\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\u0016\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u000f\u001a\u00020\u00058F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\f¨\u0006 "}, d2 = {"Lcom/marrow/ui/activities/learn/video/overlay/VideoTimelineItem;", "Landroid/os/Parcelable;", "timeline", "Lcom/marrow/data/models/video/Timeline;", "isActive", "", "bookmarkVideoStyle", "", "<init>", "(Lcom/marrow/data/models/video/Timeline;ZI)V", "getTimeline", "()Lcom/marrow/data/models/video/Timeline;", "()Z", "getBookmarkVideoStyle", "()I", "isBookmarked", "component1", "component2", "component3", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VideoTimelineItem implements Parcelable {
    public static final Parcelable.Creator<VideoTimelineItem> CREATOR = new AudioAttributesCompatParcelizer();
    private final Timeline RemoteActionCompatParcelizer;
    private final boolean read;
    private final int write;

    public static final class AudioAttributesCompatParcelizer implements Parcelable.Creator<VideoTimelineItem> {
        private static VideoTimelineItem RemoteActionCompatParcelizer(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new VideoTimelineItem((Timeline) parcel.readParcelable(VideoTimelineItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VideoTimelineItem createFromParcel(Parcel parcel) {
            return RemoteActionCompatParcelizer(parcel);
        }

        private static VideoTimelineItem[] RemoteActionCompatParcelizer(int i) {
            return new VideoTimelineItem[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ VideoTimelineItem[] newArray(int i) {
            return RemoteActionCompatParcelizer(i);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public VideoTimelineItem(Timeline timeline, boolean z, int i) {
        toMagicModuleMetaRepoModel.write(timeline, "");
        this.RemoteActionCompatParcelizer = timeline;
        this.read = z;
        this.write = i;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final Timeline getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getRead() {
        return this.read;
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.write == 1;
    }

    public static /* synthetic */ VideoTimelineItem AudioAttributesCompatParcelizer(VideoTimelineItem videoTimelineItem, Timeline timeline, boolean z, int i, int i2) {
        if ((i2 & 1) != 0) {
            timeline = videoTimelineItem.RemoteActionCompatParcelizer;
        }
        if ((i2 & 2) != 0) {
            z = videoTimelineItem.read;
        }
        if ((i2 & 4) != 0) {
            i = videoTimelineItem.write;
        }
        return AudioAttributesCompatParcelizer(timeline, z, i);
    }

    private static VideoTimelineItem AudioAttributesCompatParcelizer(Timeline timeline, boolean z, int i) {
        toMagicModuleMetaRepoModel.write(timeline, "");
        return new VideoTimelineItem(timeline, z, i);
    }

    public final boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoTimelineItem)) {
            return false;
        }
        VideoTimelineItem videoTimelineItem = (VideoTimelineItem) other;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, videoTimelineItem.RemoteActionCompatParcelizer) && this.read == videoTimelineItem.read && this.write == videoTimelineItem.write;
    }

    public final int hashCode() {
        return (((this.RemoteActionCompatParcelizer.hashCode() * 31) + Boolean.hashCode(this.read)) * 31) + Integer.hashCode(this.write);
    }

    public final String toString() {
        Timeline timeline = this.RemoteActionCompatParcelizer;
        boolean z = this.read;
        int i = this.write;
        StringBuilder sb = new StringBuilder("VideoTimelineItem(timeline=");
        sb.append(timeline);
        sb.append(", isActive=");
        sb.append(z);
        sb.append(", bookmarkVideoStyle=");
        sb.append(i);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        toMagicModuleMetaRepoModel.write(dest, "");
        dest.writeParcelable(this.RemoteActionCompatParcelizer, flags);
        dest.writeInt(this.read ? 1 : 0);
        dest.writeInt(this.write);
    }
}
