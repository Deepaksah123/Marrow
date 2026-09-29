package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import java.util.Arrays;
import kotlin.buildTypeSerializer;
import kotlin.getSchema;

/* JADX INFO: loaded from: classes2.dex */
public final class IcyInfo implements Metadata.Entry {
    public static final Parcelable.Creator<IcyInfo> CREATOR = new Parcelable.Creator<IcyInfo>() { // from class: androidx.media3.extractor.metadata.icy.IcyInfo.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IcyInfo createFromParcel(Parcel parcel) {
            return RemoteActionCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IcyInfo[] newArray(int i) {
            return IconCompatParcelizer(i);
        }

        private static IcyInfo RemoteActionCompatParcelizer(Parcel parcel) {
            return new IcyInfo(parcel);
        }

        private static IcyInfo[] IconCompatParcelizer(int i) {
            return new IcyInfo[i];
        }
    };
    public final byte[] IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final String read;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public IcyInfo(byte[] bArr, String str, String str2) {
        this.IconCompatParcelizer = bArr;
        this.RemoteActionCompatParcelizer = str;
        this.read = str2;
    }

    IcyInfo(Parcel parcel) {
        this.IconCompatParcelizer = (byte[]) buildTypeSerializer.IconCompatParcelizer(parcel.createByteArray());
        this.RemoteActionCompatParcelizer = parcel.readString();
        this.read = parcel.readString();
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void AudioAttributesCompatParcelizer(getSchema.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        String str = this.RemoteActionCompatParcelizer;
        if (str != null) {
            remoteActionCompatParcelizer.AudioAttributesImplApi26Parcelizer(str);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.IconCompatParcelizer, ((IcyInfo) obj).IconCompatParcelizer);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        return String.format("ICY: title=\"%s\", url=\"%s\", rawMetadata.length=\"%s\"", this.RemoteActionCompatParcelizer, this.read, Integer.valueOf(this.IconCompatParcelizer.length));
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.IconCompatParcelizer);
        parcel.writeString(this.RemoteActionCompatParcelizer);
        parcel.writeString(this.read);
    }
}
