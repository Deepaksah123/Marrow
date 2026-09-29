package com.marrow2.ui.video.downloaded_videos.model;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.IntermediateLoginResponseBody;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\r\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00072\b\u0010\u0003\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\fJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0018\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\fR \u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u001a\u0010\u001a\u001a\u00020\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001f\u001a\u0004\b\u001e\u0010 "}, d2 = {"Lcom/marrow2/ui/video/downloaded_videos/model/MaxDownloadReachedArgs;", "Landroid/os/Parcelable;", "", "p0", "", "Lcom/marrow2/ui/video/downloaded_videos/model/DownloadedCourseUIModel;", "p1", "", "p2", "<init>", "(ILjava/util/List;Z)V", "describeContents", "()I", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "AudioAttributesCompatParcelizer", "I", "write", "IconCompatParcelizer", "Ljava/util/List;", "()Ljava/util/List;", "read", "Z", "()Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class MaxDownloadReachedArgs implements Parcelable {
    public static final Parcelable.Creator<MaxDownloadReachedArgs> CREATOR = new AudioAttributesCompatParcelizer();
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final List<DownloadedCourseUIModel> read;
    private final boolean write;

    public static final class AudioAttributesCompatParcelizer implements Parcelable.Creator<MaxDownloadReachedArgs> {
        private static MaxDownloadReachedArgs read(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            int i = parcel.readInt();
            int i2 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 != i2; i3++) {
                arrayList.add(DownloadedCourseUIModel.CREATOR.createFromParcel(parcel));
            }
            return new MaxDownloadReachedArgs(i, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MaxDownloadReachedArgs createFromParcel(Parcel parcel) {
            return read(parcel);
        }

        private static MaxDownloadReachedArgs[] IconCompatParcelizer(int i) {
            return new MaxDownloadReachedArgs[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MaxDownloadReachedArgs[] newArray(int i) {
            return IconCompatParcelizer(i);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public MaxDownloadReachedArgs(int i, List<DownloadedCourseUIModel> list, boolean z) {
        toMagicModuleMetaRepoModel.write(list, "");
        this.AudioAttributesCompatParcelizer = i;
        this.read = list;
        this.write = z;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public /* synthetic */ MaxDownloadReachedArgs(int i, List list, boolean z, int i2, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? IntermediateLoginResponseBody.RemoteActionCompatParcelizer() : list, (i2 & 4) != 0 ? true : z);
    }

    public final List<DownloadedCourseUIModel> AudioAttributesCompatParcelizer() {
        return this.read;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final boolean getWrite() {
        return this.write;
    }

    public MaxDownloadReachedArgs() {
        this(0, null, false, 7, null);
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof MaxDownloadReachedArgs)) {
            return false;
        }
        MaxDownloadReachedArgs maxDownloadReachedArgs = (MaxDownloadReachedArgs) p0;
        return this.AudioAttributesCompatParcelizer == maxDownloadReachedArgs.AudioAttributesCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, maxDownloadReachedArgs.read) && this.write == maxDownloadReachedArgs.write;
    }

    public final int hashCode() {
        return (((Integer.hashCode(this.AudioAttributesCompatParcelizer) * 31) + this.read.hashCode()) * 31) + Boolean.hashCode(this.write);
    }

    public final String toString() {
        int i = this.AudioAttributesCompatParcelizer;
        List<DownloadedCourseUIModel> list = this.read;
        boolean z = this.write;
        StringBuilder sb = new StringBuilder("MaxDownloadReachedArgs(AudioAttributesCompatParcelizer=");
        sb.append(i);
        sb.append(", read=");
        sb.append(list);
        sb.append(", write=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeInt(this.AudioAttributesCompatParcelizer);
        List<DownloadedCourseUIModel> list = this.read;
        p0.writeInt(list.size());
        Iterator<DownloadedCourseUIModel> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(p0, p1);
        }
        p0.writeInt(this.write ? 1 : 0);
    }
}
