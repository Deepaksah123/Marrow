package androidx.media3.container;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import java.util.Arrays;
import kotlin.LaissezFaireSubTypeValidator;
import kotlin.parseTextAttribute;

/* JADX INFO: loaded from: classes2.dex */
public final class MdtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<MdtaMetadataEntry> CREATOR = new Parcelable.Creator<MdtaMetadataEntry>() { // from class: androidx.media3.container.MdtaMetadataEntry.1
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MdtaMetadataEntry createFromParcel(Parcel parcel) {
            return RemoteActionCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MdtaMetadataEntry[] newArray(int i) {
            return IconCompatParcelizer(i);
        }

        private static MdtaMetadataEntry RemoteActionCompatParcelizer(Parcel parcel) {
            return new MdtaMetadataEntry(parcel, (byte) 0);
        }

        private static MdtaMetadataEntry[] IconCompatParcelizer(int i) {
            return new MdtaMetadataEntry[i];
        }
    };
    public final byte[] IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final String read;
    public final int write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* synthetic */ MdtaMetadataEntry(Parcel parcel, byte b) {
        this(parcel);
    }

    public MdtaMetadataEntry(String str, byte[] bArr, int i, int i2) {
        this.read = str;
        this.IconCompatParcelizer = bArr;
        this.write = i;
        this.RemoteActionCompatParcelizer = i2;
    }

    private MdtaMetadataEntry(Parcel parcel) {
        this.read = (String) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.readString());
        this.IconCompatParcelizer = (byte[]) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.createByteArray());
        this.write = parcel.readInt();
        this.RemoteActionCompatParcelizer = parcel.readInt();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MdtaMetadataEntry mdtaMetadataEntry = (MdtaMetadataEntry) obj;
        return this.read.equals(mdtaMetadataEntry.read) && Arrays.equals(this.IconCompatParcelizer, mdtaMetadataEntry.IconCompatParcelizer) && this.write == mdtaMetadataEntry.write && this.RemoteActionCompatParcelizer == mdtaMetadataEntry.RemoteActionCompatParcelizer;
    }

    public final int hashCode() {
        int iHashCode = this.read.hashCode();
        return ((((((iHashCode + 527) * 31) + Arrays.hashCode(this.IconCompatParcelizer)) * 31) + this.write) * 31) + this.RemoteActionCompatParcelizer;
    }

    public final String toString() {
        String strAudioAttributesCompatParcelizer;
        int i = this.RemoteActionCompatParcelizer;
        if (i == 1) {
            strAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        } else if (i == 23) {
            strAudioAttributesCompatParcelizer = String.valueOf(Float.intBitsToFloat(parseTextAttribute.RemoteActionCompatParcelizer(this.IconCompatParcelizer)));
        } else if (i == 67) {
            strAudioAttributesCompatParcelizer = String.valueOf(parseTextAttribute.RemoteActionCompatParcelizer(this.IconCompatParcelizer));
        } else {
            strAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(this.IconCompatParcelizer);
        }
        StringBuilder sb = new StringBuilder("mdta: key=");
        sb.append(this.read);
        sb.append(", value=");
        sb.append(strAudioAttributesCompatParcelizer);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.read);
        parcel.writeByteArray(this.IconCompatParcelizer);
        parcel.writeInt(this.write);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
    }
}
