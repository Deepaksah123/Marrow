package androidx.media3.extractor.metadata.icy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import java.util.List;
import java.util.Map;
import kotlin.LaissezFaireSubTypeValidator;
import kotlin.buildTypeSerializer;
import kotlin.getSchema;
import kotlin.prune;

/* JADX INFO: loaded from: classes2.dex */
public final class IcyHeaders implements Metadata.Entry {
    public static final Parcelable.Creator<IcyHeaders> CREATOR = new Parcelable.Creator<IcyHeaders>() { // from class: androidx.media3.extractor.metadata.icy.IcyHeaders.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IcyHeaders createFromParcel(Parcel parcel) {
            return AudioAttributesCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ IcyHeaders[] newArray(int i) {
            return IconCompatParcelizer(i);
        }

        private static IcyHeaders AudioAttributesCompatParcelizer(Parcel parcel) {
            return new IcyHeaders(parcel);
        }

        private static IcyHeaders[] IconCompatParcelizer(int i) {
            return new IcyHeaders[i];
        }
    };
    public final int AudioAttributesCompatParcelizer;
    public final String AudioAttributesImplApi26Parcelizer;
    public final boolean IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final int read;
    public final String write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public static IcyHeaders write(Map<String, List<String>> map) {
        int i;
        boolean z;
        String str;
        String str2;
        String str3;
        boolean zEquals;
        int i2;
        List<String> list = map.get("icy-br");
        boolean z2 = true;
        int i3 = -1;
        if (list != null) {
            String str4 = list.get(0);
            try {
                i2 = Integer.parseInt(str4) * 1000;
            } catch (NumberFormatException unused) {
                i2 = -1;
            }
            if (i2 > 0) {
                z = true;
                i = i2;
            } else {
                try {
                    StringBuilder sb = new StringBuilder("Invalid bitrate: ");
                    sb.append(str4);
                    prune.RemoteActionCompatParcelizer("IcyHeaders", sb.toString());
                    i2 = -1;
                } catch (NumberFormatException unused2) {
                    prune.RemoteActionCompatParcelizer("IcyHeaders", "Invalid bitrate header: ".concat(String.valueOf(str4)));
                }
                z = false;
                i = i2;
            }
        } else {
            i = -1;
            z = false;
        }
        List<String> list2 = map.get("icy-genre");
        if (list2 != null) {
            str = list2.get(0);
            z = true;
        } else {
            str = null;
        }
        List<String> list3 = map.get("icy-name");
        if (list3 != null) {
            str2 = list3.get(0);
            z = true;
        } else {
            str2 = null;
        }
        List<String> list4 = map.get("icy-url");
        if (list4 != null) {
            str3 = list4.get(0);
            z = true;
        } else {
            str3 = null;
        }
        List<String> list5 = map.get("icy-pub");
        if (list5 != null) {
            zEquals = list5.get(0).equals(com.google.android.exoplayer2.metadata.icy.IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE);
            z = true;
        } else {
            zEquals = false;
        }
        List<String> list6 = map.get("icy-metaint");
        if (list6 != null) {
            String str5 = list6.get(0);
            try {
                int i4 = Integer.parseInt(str5);
                if (i4 > 0) {
                    i3 = i4;
                } else {
                    try {
                        StringBuilder sb2 = new StringBuilder("Invalid metadata interval: ");
                        sb2.append(str5);
                        prune.RemoteActionCompatParcelizer("IcyHeaders", sb2.toString());
                        z2 = z;
                    } catch (NumberFormatException unused3) {
                        i3 = i4;
                        prune.RemoteActionCompatParcelizer("IcyHeaders", "Invalid metadata interval: ".concat(String.valueOf(str5)));
                    }
                }
                z = z2;
            } catch (NumberFormatException unused4) {
            }
        }
        if (z) {
            return new IcyHeaders(i, str, str2, str3, zEquals, i3);
        }
        return null;
    }

    private IcyHeaders(int i, String str, String str2, String str3, boolean z, int i2) {
        buildTypeSerializer.IconCompatParcelizer(i2 == -1 || i2 > 0);
        this.read = i;
        this.RemoteActionCompatParcelizer = str;
        this.write = str2;
        this.AudioAttributesImplApi26Parcelizer = str3;
        this.IconCompatParcelizer = z;
        this.AudioAttributesCompatParcelizer = i2;
    }

    IcyHeaders(Parcel parcel) {
        this.read = parcel.readInt();
        this.RemoteActionCompatParcelizer = parcel.readString();
        this.write = parcel.readString();
        this.AudioAttributesImplApi26Parcelizer = parcel.readString();
        this.IconCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(parcel);
        this.AudioAttributesCompatParcelizer = parcel.readInt();
    }

    @Override // androidx.media3.common.Metadata.Entry
    public final void AudioAttributesCompatParcelizer(getSchema.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        String str = this.write;
        if (str != null) {
            remoteActionCompatParcelizer.MediaBrowserCompatItemReceiver(str);
        }
        String str2 = this.RemoteActionCompatParcelizer;
        if (str2 != null) {
            remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer(str2);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        IcyHeaders icyHeaders = (IcyHeaders) obj;
        return this.read == icyHeaders.read && LaissezFaireSubTypeValidator.read(this.RemoteActionCompatParcelizer, icyHeaders.RemoteActionCompatParcelizer) && LaissezFaireSubTypeValidator.read(this.write, icyHeaders.write) && LaissezFaireSubTypeValidator.read(this.AudioAttributesImplApi26Parcelizer, icyHeaders.AudioAttributesImplApi26Parcelizer) && this.IconCompatParcelizer == icyHeaders.IconCompatParcelizer && this.AudioAttributesCompatParcelizer == icyHeaders.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        int i = this.read;
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.AudioAttributesImplApi26Parcelizer;
        return ((((((((((i + 527) * 31) + iHashCode) * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.IconCompatParcelizer ? 1 : 0)) * 31) + this.AudioAttributesCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IcyHeaders: name=\"");
        sb.append(this.write);
        sb.append("\", genre=\"");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append("\", bitrate=");
        sb.append(this.read);
        sb.append(", metadataInterval=");
        sb.append(this.AudioAttributesCompatParcelizer);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.read);
        parcel.writeString(this.RemoteActionCompatParcelizer);
        parcel.writeString(this.write);
        parcel.writeString(this.AudioAttributesImplApi26Parcelizer);
        LaissezFaireSubTypeValidator.write(parcel, this.IconCompatParcelizer);
        parcel.writeInt(this.AudioAttributesCompatParcelizer);
    }
}
