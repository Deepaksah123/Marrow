package com.marrow2.ui.qbank.score.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\r\u0010\f\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001d\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u001c\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0014R\u001a\u0010\u001d\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001a\u001a\u0004\b\u0019\u0010\u0014R\u001a\u0010\u0019\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u001b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001f\u001a\u0004\b\u001d\u0010\rR\u001a\u0010 \u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001f\u001a\u0004\b\u001c\u0010\rR\u001a\u0010!\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b \u0010\u001f\u001a\u0004\b \u0010\r"}, d2 = {"Lcom/marrow2/ui/qbank/score/model/RevisionSubjectUIModel;", "Landroid/os/Parcelable;", "", "p0", "p1", "", "p2", "p3", "p4", "p5", "<init>", "(Ljava/lang/String;Ljava/lang/String;IIII)V", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "read", "Ljava/lang/String;", "AudioAttributesCompatParcelizer", "RemoteActionCompatParcelizer", "write", "MediaBrowserCompatCustomActionResultReceiver", "I", "IconCompatParcelizer", "MediaBrowserCompatItemReceiver"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RevisionSubjectUIModel implements Parcelable {
    public static final Parcelable.Creator<RevisionSubjectUIModel> CREATOR = new write();
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final int MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final int read;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final String write;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    public static final class write implements Parcelable.Creator<RevisionSubjectUIModel> {
        private static RevisionSubjectUIModel write(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new RevisionSubjectUIModel(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RevisionSubjectUIModel createFromParcel(Parcel parcel) {
            return write(parcel);
        }

        private static RevisionSubjectUIModel[] write(int i) {
            return new RevisionSubjectUIModel[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ RevisionSubjectUIModel[] newArray(int i) {
            return write(i);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public RevisionSubjectUIModel(String str, String str2, int i, int i2, int i3, int i4) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.read = i;
        this.AudioAttributesCompatParcelizer = i2;
        this.IconCompatParcelizer = i3;
        this.MediaBrowserCompatItemReceiver = i4;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final String getWrite() {
        return this.write;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final int getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof RevisionSubjectUIModel)) {
            return false;
        }
        RevisionSubjectUIModel revisionSubjectUIModel = (RevisionSubjectUIModel) p0;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.RemoteActionCompatParcelizer, (Object) revisionSubjectUIModel.RemoteActionCompatParcelizer) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) this.write, (Object) revisionSubjectUIModel.write) && this.read == revisionSubjectUIModel.read && this.AudioAttributesCompatParcelizer == revisionSubjectUIModel.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == revisionSubjectUIModel.IconCompatParcelizer && this.MediaBrowserCompatItemReceiver == revisionSubjectUIModel.MediaBrowserCompatItemReceiver;
    }

    public final int hashCode() {
        return (((((((((this.RemoteActionCompatParcelizer.hashCode() * 31) + this.write.hashCode()) * 31) + Integer.hashCode(this.read)) * 31) + Integer.hashCode(this.AudioAttributesCompatParcelizer)) * 31) + Integer.hashCode(this.IconCompatParcelizer)) * 31) + Integer.hashCode(this.MediaBrowserCompatItemReceiver);
    }

    public final String toString() {
        String str = this.RemoteActionCompatParcelizer;
        String str2 = this.write;
        int i = this.read;
        int i2 = this.AudioAttributesCompatParcelizer;
        int i3 = this.IconCompatParcelizer;
        int i4 = this.MediaBrowserCompatItemReceiver;
        StringBuilder sb = new StringBuilder("RevisionSubjectUIModel(RemoteActionCompatParcelizer=");
        sb.append(str);
        sb.append(", write=");
        sb.append(str2);
        sb.append(", read=");
        sb.append(i);
        sb.append(", AudioAttributesCompatParcelizer=");
        sb.append(i2);
        sb.append(", IconCompatParcelizer=");
        sb.append(i3);
        sb.append(", MediaBrowserCompatItemReceiver=");
        sb.append(i4);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeString(this.RemoteActionCompatParcelizer);
        p0.writeString(this.write);
        p0.writeInt(this.read);
        p0.writeInt(this.AudioAttributesCompatParcelizer);
        p0.writeInt(this.IconCompatParcelizer);
        p0.writeInt(this.MediaBrowserCompatItemReceiver);
    }
}
