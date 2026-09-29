package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.LaissezFaireSubTypeValidator;
import kotlin.getSchema;

/* JADX INFO: loaded from: classes2.dex */
public final class ApicFrame extends Id3Frame {
    public static final Parcelable.Creator<ApicFrame> CREATOR = new Parcelable.Creator<ApicFrame>() { // from class: androidx.media3.extractor.metadata.id3.ApicFrame.5
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public ApicFrame createFromParcel(Parcel parcel) {
            return new ApicFrame(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public ApicFrame[] newArray(int i) {
            return new ApicFrame[i];
        }
    };
    public final String AudioAttributesCompatParcelizer;
    public final int IconCompatParcelizer;
    public final byte[] RemoteActionCompatParcelizer;
    public final String read;

    public ApicFrame(String str, String str2, int i, byte[] bArr) {
        super(com.google.android.exoplayer2.metadata.id3.ApicFrame.ID);
        this.read = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.IconCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = bArr;
    }

    ApicFrame(Parcel parcel) {
        super(com.google.android.exoplayer2.metadata.id3.ApicFrame.ID);
        this.read = (String) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.readString());
        this.AudioAttributesCompatParcelizer = parcel.readString();
        this.IconCompatParcelizer = parcel.readInt();
        this.RemoteActionCompatParcelizer = (byte[]) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.createByteArray());
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void AudioAttributesCompatParcelizer(getSchema.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        remoteActionCompatParcelizer.read(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApicFrame apicFrame = (ApicFrame) obj;
        return this.IconCompatParcelizer == apicFrame.IconCompatParcelizer && LaissezFaireSubTypeValidator.read(this.read, apicFrame.read) && LaissezFaireSubTypeValidator.read(this.AudioAttributesCompatParcelizer, apicFrame.AudioAttributesCompatParcelizer) && Arrays.equals(this.RemoteActionCompatParcelizer, apicFrame.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        int i = this.IconCompatParcelizer;
        String str = this.read;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.AudioAttributesCompatParcelizer;
        return ((((((i + 527) * 31) + iHashCode) * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.RemoteActionCompatParcelizer);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(": mimeType=");
        sb.append(this.read);
        sb.append(", description=");
        sb.append(this.AudioAttributesCompatParcelizer);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeString(this.AudioAttributesCompatParcelizer);
        parcel.writeInt(this.IconCompatParcelizer);
        parcel.writeByteArray(this.RemoteActionCompatParcelizer);
    }
}
