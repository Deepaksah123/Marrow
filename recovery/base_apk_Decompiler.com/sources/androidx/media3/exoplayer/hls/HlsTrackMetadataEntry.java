package androidx.media3.exoplayer.hls;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.media3.common.Metadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class HlsTrackMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<HlsTrackMetadataEntry> CREATOR = new Parcelable.Creator<HlsTrackMetadataEntry>() { // from class: androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ HlsTrackMetadataEntry createFromParcel(Parcel parcel) {
            return AudioAttributesCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ HlsTrackMetadataEntry[] newArray(int i) {
            return write(i);
        }

        private static HlsTrackMetadataEntry AudioAttributesCompatParcelizer(Parcel parcel) {
            return new HlsTrackMetadataEntry(parcel);
        }

        private static HlsTrackMetadataEntry[] write(int i) {
            return new HlsTrackMetadataEntry[i];
        }
    };
    public final String IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final List<VariantInfo> read;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static final class VariantInfo implements Parcelable {
        public static final Parcelable.Creator<VariantInfo> CREATOR = new Parcelable.Creator<VariantInfo>() { // from class: androidx.media3.exoplayer.hls.HlsTrackMetadataEntry.VariantInfo.3
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ VariantInfo createFromParcel(Parcel parcel) {
                return write(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ VariantInfo[] newArray(int i) {
                return write(i);
            }

            private static VariantInfo write(Parcel parcel) {
                return new VariantInfo(parcel);
            }

            private static VariantInfo[] write(int i) {
                return new VariantInfo[i];
            }
        };
        public final String AudioAttributesCompatParcelizer;
        public final String AudioAttributesImplBaseParcelizer;
        public final String IconCompatParcelizer;
        public final String RemoteActionCompatParcelizer;
        public final int read;
        public final int write;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public VariantInfo(int i, int i2, String str, String str2, String str3, String str4) {
            this.read = i;
            this.write = i2;
            this.AudioAttributesImplBaseParcelizer = str;
            this.RemoteActionCompatParcelizer = str2;
            this.AudioAttributesCompatParcelizer = str3;
            this.IconCompatParcelizer = str4;
        }

        VariantInfo(Parcel parcel) {
            this.read = parcel.readInt();
            this.write = parcel.readInt();
            this.AudioAttributesImplBaseParcelizer = parcel.readString();
            this.RemoteActionCompatParcelizer = parcel.readString();
            this.AudioAttributesCompatParcelizer = parcel.readString();
            this.IconCompatParcelizer = parcel.readString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            VariantInfo variantInfo = (VariantInfo) obj;
            return this.read == variantInfo.read && this.write == variantInfo.write && TextUtils.equals(this.AudioAttributesImplBaseParcelizer, variantInfo.AudioAttributesImplBaseParcelizer) && TextUtils.equals(this.RemoteActionCompatParcelizer, variantInfo.RemoteActionCompatParcelizer) && TextUtils.equals(this.AudioAttributesCompatParcelizer, variantInfo.AudioAttributesCompatParcelizer) && TextUtils.equals(this.IconCompatParcelizer, variantInfo.IconCompatParcelizer);
        }

        public final int hashCode() {
            int i = this.read;
            int i2 = this.write;
            String str = this.AudioAttributesImplBaseParcelizer;
            int iHashCode = str != null ? str.hashCode() : 0;
            String str2 = this.RemoteActionCompatParcelizer;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.AudioAttributesCompatParcelizer;
            int iHashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.IconCompatParcelizer;
            return (((((((((i * 31) + i2) * 31) + iHashCode) * 31) + iHashCode2) * 31) + iHashCode3) * 31) + (str4 != null ? str4.hashCode() : 0);
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeInt(this.read);
            parcel.writeInt(this.write);
            parcel.writeString(this.AudioAttributesImplBaseParcelizer);
            parcel.writeString(this.RemoteActionCompatParcelizer);
            parcel.writeString(this.AudioAttributesCompatParcelizer);
            parcel.writeString(this.IconCompatParcelizer);
        }
    }

    public HlsTrackMetadataEntry(String str, String str2, List<VariantInfo> list) {
        this.RemoteActionCompatParcelizer = str;
        this.IconCompatParcelizer = str2;
        this.read = Collections.unmodifiableList(new ArrayList(list));
    }

    HlsTrackMetadataEntry(Parcel parcel) {
        this.RemoteActionCompatParcelizer = parcel.readString();
        this.IconCompatParcelizer = parcel.readString();
        int i = parcel.readInt();
        ArrayList arrayList = new ArrayList(i);
        for (int i2 = 0; i2 < i; i2++) {
            arrayList.add((VariantInfo) parcel.readParcelable(VariantInfo.class.getClassLoader()));
        }
        this.read = Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder("HlsTrackMetadataEntry");
        if (this.RemoteActionCompatParcelizer != null) {
            StringBuilder sb2 = new StringBuilder(" [");
            sb2.append(this.RemoteActionCompatParcelizer);
            sb2.append(", ");
            sb2.append(this.IconCompatParcelizer);
            sb2.append("]");
            string = sb2.toString();
        } else {
            string = "";
        }
        sb.append(string);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HlsTrackMetadataEntry hlsTrackMetadataEntry = (HlsTrackMetadataEntry) obj;
        return TextUtils.equals(this.RemoteActionCompatParcelizer, hlsTrackMetadataEntry.RemoteActionCompatParcelizer) && TextUtils.equals(this.IconCompatParcelizer, hlsTrackMetadataEntry.IconCompatParcelizer) && this.read.equals(hlsTrackMetadataEntry.read);
    }

    public final int hashCode() {
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.IconCompatParcelizer;
        return (((iHashCode * 31) + (str2 != null ? str2.hashCode() : 0)) * 31) + this.read.hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.RemoteActionCompatParcelizer);
        parcel.writeString(this.IconCompatParcelizer);
        int size = this.read.size();
        parcel.writeInt(size);
        for (int i2 = 0; i2 < size; i2++) {
            parcel.writeParcelable(this.read.get(i2), 0);
        }
    }
}
