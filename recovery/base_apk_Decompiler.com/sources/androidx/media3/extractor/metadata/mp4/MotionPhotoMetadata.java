package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import kotlin.setFormatMetadata;

/* JADX INFO: loaded from: classes2.dex */
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new Parcelable.Creator<MotionPhotoMetadata>() { // from class: androidx.media3.extractor.metadata.mp4.MotionPhotoMetadata.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return AudioAttributesCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MotionPhotoMetadata[] newArray(int i) {
            return RemoteActionCompatParcelizer(i);
        }

        private static MotionPhotoMetadata AudioAttributesCompatParcelizer(Parcel parcel) {
            return new MotionPhotoMetadata(parcel, (byte) 0);
        }

        private static MotionPhotoMetadata[] RemoteActionCompatParcelizer(int i) {
            return new MotionPhotoMetadata[i];
        }
    };
    public final long AudioAttributesCompatParcelizer;
    public final long IconCompatParcelizer;
    public final long RemoteActionCompatParcelizer;
    public final long read;
    public final long write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* synthetic */ MotionPhotoMetadata(Parcel parcel, byte b) {
        this(parcel);
    }

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.write = j;
        this.AudioAttributesCompatParcelizer = j2;
        this.read = j3;
        this.RemoteActionCompatParcelizer = j4;
        this.IconCompatParcelizer = j5;
    }

    private MotionPhotoMetadata(Parcel parcel) {
        this.write = parcel.readLong();
        this.AudioAttributesCompatParcelizer = parcel.readLong();
        this.read = parcel.readLong();
        this.RemoteActionCompatParcelizer = parcel.readLong();
        this.IconCompatParcelizer = parcel.readLong();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.write == motionPhotoMetadata.write && this.AudioAttributesCompatParcelizer == motionPhotoMetadata.AudioAttributesCompatParcelizer && this.read == motionPhotoMetadata.read && this.RemoteActionCompatParcelizer == motionPhotoMetadata.RemoteActionCompatParcelizer && this.IconCompatParcelizer == motionPhotoMetadata.IconCompatParcelizer;
    }

    public final int hashCode() {
        int iAudioAttributesCompatParcelizer = setFormatMetadata.AudioAttributesCompatParcelizer(this.write);
        int iAudioAttributesCompatParcelizer2 = setFormatMetadata.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
        return ((((((((iAudioAttributesCompatParcelizer + 527) * 31) + iAudioAttributesCompatParcelizer2) * 31) + setFormatMetadata.AudioAttributesCompatParcelizer(this.read)) * 31) + setFormatMetadata.AudioAttributesCompatParcelizer(this.RemoteActionCompatParcelizer)) * 31) + setFormatMetadata.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Motion photo metadata: photoStartPosition=");
        sb.append(this.write);
        sb.append(", photoSize=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(this.read);
        sb.append(", videoStartPosition=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", videoSize=");
        sb.append(this.IconCompatParcelizer);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.write);
        parcel.writeLong(this.AudioAttributesCompatParcelizer);
        parcel.writeLong(this.read);
        parcel.writeLong(this.RemoteActionCompatParcelizer);
        parcel.writeLong(this.IconCompatParcelizer);
    }
}
