package androidx.media3.extractor.metadata.flac;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import java.util.Arrays;
import kotlin.AsPropertyTypeDeserializer;
import kotlin.DefaultBaseTypeLimitingValidator;
import kotlin.LaissezFaireSubTypeValidator;
import kotlin.getSchema;
import kotlin.parseMdtaFromMeta;

/* JADX INFO: loaded from: classes2.dex */
public final class PictureFrame implements Metadata.Entry {
    public static final Parcelable.Creator<PictureFrame> CREATOR = new Parcelable.Creator<PictureFrame>() { // from class: androidx.media3.extractor.metadata.flac.PictureFrame.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PictureFrame createFromParcel(Parcel parcel) {
            return RemoteActionCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PictureFrame[] newArray(int i) {
            return read(i);
        }

        private static PictureFrame RemoteActionCompatParcelizer(Parcel parcel) {
            return new PictureFrame(parcel);
        }

        private static PictureFrame[] read(int i) {
            return new PictureFrame[i];
        }
    };
    public final String AudioAttributesCompatParcelizer;
    public final int AudioAttributesImplApi26Parcelizer;
    public final byte[] AudioAttributesImplBaseParcelizer;
    public final int IconCompatParcelizer;
    public final int MediaBrowserCompatItemReceiver;
    public final int RemoteActionCompatParcelizer;
    public final String read;
    public final int write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private PictureFrame(int i, String str, String str2, int i2, int i3, int i4, int i5, byte[] bArr) {
        this.AudioAttributesImplApi26Parcelizer = i;
        this.read = str;
        this.AudioAttributesCompatParcelizer = str2;
        this.MediaBrowserCompatItemReceiver = i2;
        this.IconCompatParcelizer = i3;
        this.write = i4;
        this.RemoteActionCompatParcelizer = i5;
        this.AudioAttributesImplBaseParcelizer = bArr;
    }

    PictureFrame(Parcel parcel) {
        this.AudioAttributesImplApi26Parcelizer = parcel.readInt();
        this.read = (String) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.readString());
        this.AudioAttributesCompatParcelizer = (String) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.readString());
        this.MediaBrowserCompatItemReceiver = parcel.readInt();
        this.IconCompatParcelizer = parcel.readInt();
        this.write = parcel.readInt();
        this.RemoteActionCompatParcelizer = parcel.readInt();
        this.AudioAttributesImplBaseParcelizer = (byte[]) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.createByteArray());
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void AudioAttributesCompatParcelizer(getSchema.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        remoteActionCompatParcelizer.read(this.AudioAttributesImplBaseParcelizer, this.AudioAttributesImplApi26Parcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Picture: mimeType=");
        sb.append(this.read);
        sb.append(", description=");
        sb.append(this.AudioAttributesCompatParcelizer);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PictureFrame pictureFrame = (PictureFrame) obj;
        return this.AudioAttributesImplApi26Parcelizer == pictureFrame.AudioAttributesImplApi26Parcelizer && this.read.equals(pictureFrame.read) && this.AudioAttributesCompatParcelizer.equals(pictureFrame.AudioAttributesCompatParcelizer) && this.MediaBrowserCompatItemReceiver == pictureFrame.MediaBrowserCompatItemReceiver && this.IconCompatParcelizer == pictureFrame.IconCompatParcelizer && this.write == pictureFrame.write && this.RemoteActionCompatParcelizer == pictureFrame.RemoteActionCompatParcelizer && Arrays.equals(this.AudioAttributesImplBaseParcelizer, pictureFrame.AudioAttributesImplBaseParcelizer);
    }

    public final int hashCode() {
        int i = this.AudioAttributesImplApi26Parcelizer;
        int iHashCode = this.read.hashCode();
        int iHashCode2 = this.AudioAttributesCompatParcelizer.hashCode();
        int i2 = this.MediaBrowserCompatItemReceiver;
        int i3 = this.IconCompatParcelizer;
        return ((((((((((((((i + 527) * 31) + iHashCode) * 31) + iHashCode2) * 31) + i2) * 31) + i3) * 31) + this.write) * 31) + this.RemoteActionCompatParcelizer) * 31) + Arrays.hashCode(this.AudioAttributesImplBaseParcelizer);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.AudioAttributesImplApi26Parcelizer);
        parcel.writeString(this.read);
        parcel.writeString(this.AudioAttributesCompatParcelizer);
        parcel.writeInt(this.MediaBrowserCompatItemReceiver);
        parcel.writeInt(this.IconCompatParcelizer);
        parcel.writeInt(this.write);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
        parcel.writeByteArray(this.AudioAttributesImplBaseParcelizer);
    }

    public static PictureFrame AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        int iMediaBrowserCompatItemReceiver = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        String strMediaMetadataCompat = DefaultBaseTypeLimitingValidator.MediaMetadataCompat(asPropertyTypeDeserializer.AudioAttributesCompatParcelizer(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver(), parseMdtaFromMeta.RemoteActionCompatParcelizer));
        String str = asPropertyTypeDeserializer.read(asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver());
        int iMediaBrowserCompatItemReceiver2 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        int iMediaBrowserCompatItemReceiver3 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        int iMediaBrowserCompatItemReceiver4 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        int iMediaBrowserCompatItemReceiver5 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        int iMediaBrowserCompatItemReceiver6 = asPropertyTypeDeserializer.MediaBrowserCompatItemReceiver();
        byte[] bArr = new byte[iMediaBrowserCompatItemReceiver6];
        asPropertyTypeDeserializer.write(bArr, 0, iMediaBrowserCompatItemReceiver6);
        return new PictureFrame(iMediaBrowserCompatItemReceiver, strMediaMetadataCompat, str, iMediaBrowserCompatItemReceiver2, iMediaBrowserCompatItemReceiver3, iMediaBrowserCompatItemReceiver4, iMediaBrowserCompatItemReceiver5, bArr);
    }
}
