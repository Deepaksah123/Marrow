package com.marrow2.ui.video.downloaded_videos.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0011\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0017\u001a\u00020\u00048\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0018\u001a\u0004\b\u0017\u0010\fR\u001a\u0010\u001c\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f"}, d2 = {"Lcom/marrow2/ui/video/downloaded_videos/model/DownloadedCourseUIModel;", "Landroid/os/Parcelable;", "", "p0", "", "p1", "p2", "", "p3", "<init>", "(ILjava/lang/String;IZ)V", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "IconCompatParcelizer", "I", "write", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "Z", "read", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DownloadedCourseUIModel implements Parcelable {
    public static final Parcelable.Creator<DownloadedCourseUIModel> CREATOR = new AudioAttributesCompatParcelizer();
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int write;
    private final boolean RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final String IconCompatParcelizer;

    public static final class AudioAttributesCompatParcelizer implements Parcelable.Creator<DownloadedCourseUIModel> {
        private static DownloadedCourseUIModel IconCompatParcelizer(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new DownloadedCourseUIModel(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DownloadedCourseUIModel createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        private static DownloadedCourseUIModel[] AudioAttributesCompatParcelizer(int i) {
            return new DownloadedCourseUIModel[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DownloadedCourseUIModel[] newArray(int i) {
            return AudioAttributesCompatParcelizer(i);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public DownloadedCourseUIModel(int i, String str, int i2, boolean z) {
        toMagicModuleMetaRepoModel.write(str, "");
        this.write = i;
        this.IconCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = i2;
        this.RemoteActionCompatParcelizer = z;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof DownloadedCourseUIModel)) {
            return false;
        }
        DownloadedCourseUIModel downloadedCourseUIModel = (DownloadedCourseUIModel) p0;
        return this.write == downloadedCourseUIModel.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.IconCompatParcelizer, (Object) downloadedCourseUIModel.IconCompatParcelizer) && this.AudioAttributesCompatParcelizer == downloadedCourseUIModel.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == downloadedCourseUIModel.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        return (((((Integer.hashCode(this.write) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Boolean.hashCode(this.RemoteActionCompatParcelizer);
    }

    public final String toString() {
        int i = this.write;
        String str = this.IconCompatParcelizer;
        int i2 = this.AudioAttributesCompatParcelizer;
        boolean z = this.RemoteActionCompatParcelizer;
        StringBuilder sb = new StringBuilder("DownloadedCourseUIModel(write=");
        sb.append(i);
        sb.append(", IconCompatParcelizer=");
        sb.append(str);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(i2);
        sb.append(", RemoteActionCompatParcelizer=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeInt(this.write);
        p0.writeString(this.IconCompatParcelizer);
        p0.writeInt(this.AudioAttributesCompatParcelizer);
        p0.writeInt(this.RemoteActionCompatParcelizer ? 1 : 0);
    }
}
