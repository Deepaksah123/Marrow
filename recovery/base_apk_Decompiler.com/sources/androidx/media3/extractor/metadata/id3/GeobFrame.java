package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.LaissezFaireSubTypeValidator;

/* JADX INFO: loaded from: classes2.dex */
public final class GeobFrame extends Id3Frame {
    public static final Parcelable.Creator<GeobFrame> CREATOR = new Parcelable.Creator<GeobFrame>() { // from class: androidx.media3.extractor.metadata.id3.GeobFrame.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GeobFrame createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ GeobFrame[] newArray(int i) {
            return IconCompatParcelizer(i);
        }

        private static GeobFrame IconCompatParcelizer(Parcel parcel) {
            return new GeobFrame(parcel);
        }

        private static GeobFrame[] IconCompatParcelizer(int i) {
            return new GeobFrame[i];
        }
    };
    public final String AudioAttributesCompatParcelizer;
    public final String IconCompatParcelizer;
    public final byte[] read;
    public final String write;

    public GeobFrame(String str, String str2, String str3, byte[] bArr) {
        super(com.google.android.exoplayer2.metadata.id3.GeobFrame.ID);
        this.write = str;
        this.IconCompatParcelizer = str2;
        this.AudioAttributesCompatParcelizer = str3;
        this.read = bArr;
    }

    GeobFrame(Parcel parcel) {
        super(com.google.android.exoplayer2.metadata.id3.GeobFrame.ID);
        this.write = (String) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.readString());
        this.IconCompatParcelizer = (String) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.readString());
        this.AudioAttributesCompatParcelizer = (String) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.readString());
        this.read = (byte[]) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GeobFrame geobFrame = (GeobFrame) obj;
        return LaissezFaireSubTypeValidator.read(this.write, geobFrame.write) && LaissezFaireSubTypeValidator.read(this.IconCompatParcelizer, geobFrame.IconCompatParcelizer) && LaissezFaireSubTypeValidator.read(this.AudioAttributesCompatParcelizer, geobFrame.AudioAttributesCompatParcelizer) && Arrays.equals(this.read, geobFrame.read);
    }

    public final int hashCode() {
        String str = this.write;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.AudioAttributesCompatParcelizer;
        return ((((((iHashCode + 527) * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + Arrays.hashCode(this.read);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(": mimeType=");
        sb.append(this.write);
        sb.append(", filename=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", description=");
        sb.append(this.AudioAttributesCompatParcelizer);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.write);
        parcel.writeString(this.IconCompatParcelizer);
        parcel.writeString(this.AudioAttributesCompatParcelizer);
        parcel.writeByteArray(this.read);
    }
}
