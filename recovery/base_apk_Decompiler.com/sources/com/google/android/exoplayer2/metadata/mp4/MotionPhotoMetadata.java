package com.google.android.exoplayer2.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import kotlin.setFormatMetadata;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class MotionPhotoMetadata implements Metadata.Entry {
    public static final Parcelable.Creator<MotionPhotoMetadata> CREATOR = new Parcelable.Creator<MotionPhotoMetadata>() { // from class: com.google.android.exoplayer2.metadata.mp4.MotionPhotoMetadata.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MotionPhotoMetadata createFromParcel(Parcel parcel) {
            return new MotionPhotoMetadata(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MotionPhotoMetadata[] newArray(int i) {
            return new MotionPhotoMetadata[i];
        }
    };
    public final long photoPresentationTimestampUs;
    public final long photoSize;
    public final long photoStartPosition;
    public final long videoSize;
    public final long videoStartPosition;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public MotionPhotoMetadata(long j, long j2, long j3, long j4, long j5) {
        this.photoStartPosition = j;
        this.photoSize = j2;
        this.photoPresentationTimestampUs = j3;
        this.videoStartPosition = j4;
        this.videoSize = j5;
    }

    private MotionPhotoMetadata(Parcel parcel) {
        this.photoStartPosition = parcel.readLong();
        this.photoSize = parcel.readLong();
        this.photoPresentationTimestampUs = parcel.readLong();
        this.videoStartPosition = parcel.readLong();
        this.videoSize = parcel.readLong();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MotionPhotoMetadata motionPhotoMetadata = (MotionPhotoMetadata) obj;
        return this.photoStartPosition == motionPhotoMetadata.photoStartPosition && this.photoSize == motionPhotoMetadata.photoSize && this.photoPresentationTimestampUs == motionPhotoMetadata.photoPresentationTimestampUs && this.videoStartPosition == motionPhotoMetadata.videoStartPosition && this.videoSize == motionPhotoMetadata.videoSize;
    }

    public final int hashCode() {
        int iAudioAttributesCompatParcelizer = setFormatMetadata.AudioAttributesCompatParcelizer(this.photoStartPosition);
        int iAudioAttributesCompatParcelizer2 = setFormatMetadata.AudioAttributesCompatParcelizer(this.photoSize);
        return ((((((((iAudioAttributesCompatParcelizer + 527) * 31) + iAudioAttributesCompatParcelizer2) * 31) + setFormatMetadata.AudioAttributesCompatParcelizer(this.photoPresentationTimestampUs)) * 31) + setFormatMetadata.AudioAttributesCompatParcelizer(this.videoStartPosition)) * 31) + setFormatMetadata.AudioAttributesCompatParcelizer(this.videoSize);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Motion photo metadata: photoStartPosition=");
        sb.append(this.photoStartPosition);
        sb.append(", photoSize=");
        sb.append(this.photoSize);
        sb.append(", photoPresentationTimestampUs=");
        sb.append(this.photoPresentationTimestampUs);
        sb.append(", videoStartPosition=");
        sb.append(this.videoStartPosition);
        sb.append(", videoSize=");
        sb.append(this.videoSize);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.photoStartPosition);
        parcel.writeLong(this.photoSize);
        parcel.writeLong(this.photoPresentationTimestampUs);
        parcel.writeLong(this.videoStartPosition);
        parcel.writeLong(this.videoSize);
    }
}
