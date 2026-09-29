package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.UUID;
import kotlin.DefaultBaseTypeLimitingValidator;
import kotlin.JsonMapFormatVisitor;
import kotlin.LaissezFaireSubTypeValidator;
import kotlin.buildTypeSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class DrmInitData implements Comparator<SchemeData>, Parcelable {
    public static final Parcelable.Creator<DrmInitData> CREATOR = new Parcelable.Creator<DrmInitData>() { // from class: androidx.media3.common.DrmInitData.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DrmInitData createFromParcel(Parcel parcel) {
            return RemoteActionCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ DrmInitData[] newArray(int i) {
            return read(i);
        }

        private static DrmInitData RemoteActionCompatParcelizer(Parcel parcel) {
            return new DrmInitData(parcel);
        }

        private static DrmInitData[] read(int i) {
            return new DrmInitData[i];
        }
    };
    public final String AudioAttributesCompatParcelizer;
    public final int IconCompatParcelizer;
    private int RemoteActionCompatParcelizer;
    private final SchemeData[] write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(SchemeData schemeData, SchemeData schemeData2) {
        return RemoteActionCompatParcelizer(schemeData, schemeData2);
    }

    public static DrmInitData AudioAttributesCompatParcelizer(DrmInitData drmInitData, DrmInitData drmInitData2) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (drmInitData != null) {
            str = drmInitData.AudioAttributesCompatParcelizer;
            for (SchemeData schemeData : drmInitData.write) {
                if (schemeData.RemoteActionCompatParcelizer()) {
                    arrayList.add(schemeData);
                }
            }
        } else {
            str = null;
        }
        if (drmInitData2 != null) {
            if (str == null) {
                str = drmInitData2.AudioAttributesCompatParcelizer;
            }
            int size = arrayList.size();
            for (SchemeData schemeData2 : drmInitData2.write) {
                if (schemeData2.RemoteActionCompatParcelizer() && !write(arrayList, size, schemeData2.AudioAttributesCompatParcelizer)) {
                    arrayList.add(schemeData2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new DrmInitData(str, arrayList);
    }

    public DrmInitData(List<SchemeData> list) {
        this(null, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(String str, List<SchemeData> list) {
        this(str, false, (SchemeData[]) list.toArray(new SchemeData[0]));
    }

    public DrmInitData(SchemeData... schemeDataArr) {
        this((String) null, schemeDataArr);
    }

    public DrmInitData(String str, SchemeData... schemeDataArr) {
        this(str, true, schemeDataArr);
    }

    private DrmInitData(String str, boolean z, SchemeData... schemeDataArr) {
        this.AudioAttributesCompatParcelizer = str;
        schemeDataArr = z ? (SchemeData[]) schemeDataArr.clone() : schemeDataArr;
        this.write = schemeDataArr;
        this.IconCompatParcelizer = schemeDataArr.length;
        Arrays.sort(schemeDataArr, this);
    }

    DrmInitData(Parcel parcel) {
        this.AudioAttributesCompatParcelizer = parcel.readString();
        SchemeData[] schemeDataArr = (SchemeData[]) LaissezFaireSubTypeValidator.IconCompatParcelizer((SchemeData[]) parcel.createTypedArray(SchemeData.CREATOR));
        this.write = schemeDataArr;
        this.IconCompatParcelizer = schemeDataArr.length;
    }

    public final SchemeData write(int i) {
        return this.write[i];
    }

    public final DrmInitData IconCompatParcelizer(String str) {
        return LaissezFaireSubTypeValidator.read(this.AudioAttributesCompatParcelizer, str) ? this : new DrmInitData(str, false, this.write);
    }

    public final DrmInitData AudioAttributesCompatParcelizer(DrmInitData drmInitData) {
        String str;
        String str2 = this.AudioAttributesCompatParcelizer;
        buildTypeSerializer.write(str2 == null || (str = drmInitData.AudioAttributesCompatParcelizer) == null || TextUtils.equals(str2, str));
        String str3 = this.AudioAttributesCompatParcelizer;
        if (str3 == null) {
            str3 = drmInitData.AudioAttributesCompatParcelizer;
        }
        return new DrmInitData(str3, (SchemeData[]) LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer((Object[]) this.write, (Object[]) drmInitData.write));
    }

    public final int hashCode() {
        if (this.RemoteActionCompatParcelizer == 0) {
            String str = this.AudioAttributesCompatParcelizer;
            this.RemoteActionCompatParcelizer = ((str == null ? 0 : str.hashCode()) * 31) + Arrays.hashCode(this.write);
        }
        return this.RemoteActionCompatParcelizer;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DrmInitData drmInitData = (DrmInitData) obj;
        return LaissezFaireSubTypeValidator.read(this.AudioAttributesCompatParcelizer, drmInitData.AudioAttributesCompatParcelizer) && Arrays.equals(this.write, drmInitData.write);
    }

    private static int RemoteActionCompatParcelizer(SchemeData schemeData, SchemeData schemeData2) {
        if (JsonMapFormatVisitor.read.equals(schemeData.AudioAttributesCompatParcelizer)) {
            return JsonMapFormatVisitor.read.equals(schemeData2.AudioAttributesCompatParcelizer) ? 0 : 1;
        }
        return schemeData.AudioAttributesCompatParcelizer.compareTo(schemeData2.AudioAttributesCompatParcelizer);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.AudioAttributesCompatParcelizer);
        parcel.writeTypedArray(this.write, 0);
    }

    private static boolean write(ArrayList<SchemeData> arrayList, int i, UUID uuid) {
        for (int i2 = 0; i2 < i; i2++) {
            if (arrayList.get(i2).AudioAttributesCompatParcelizer.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static final class SchemeData implements Parcelable {
        public static final Parcelable.Creator<SchemeData> CREATOR = new Parcelable.Creator<SchemeData>() { // from class: androidx.media3.common.DrmInitData.SchemeData.4
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SchemeData createFromParcel(Parcel parcel) {
                return read(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SchemeData[] newArray(int i) {
                return RemoteActionCompatParcelizer(i);
            }

            private static SchemeData read(Parcel parcel) {
                return new SchemeData(parcel);
            }

            private static SchemeData[] RemoteActionCompatParcelizer(int i) {
                return new SchemeData[i];
            }
        };
        public final UUID AudioAttributesCompatParcelizer;
        public final String IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        public final byte[] read;
        public final String write;

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public SchemeData(UUID uuid, String str, byte[] bArr) {
            this(uuid, null, str, bArr);
        }

        public SchemeData(UUID uuid, String str, String str2, byte[] bArr) {
            this.AudioAttributesCompatParcelizer = (UUID) buildTypeSerializer.IconCompatParcelizer(uuid);
            this.write = str;
            this.IconCompatParcelizer = DefaultBaseTypeLimitingValidator.MediaMetadataCompat((String) buildTypeSerializer.IconCompatParcelizer(str2));
            this.read = bArr;
        }

        SchemeData(Parcel parcel) {
            this.AudioAttributesCompatParcelizer = new UUID(parcel.readLong(), parcel.readLong());
            this.write = parcel.readString();
            this.IconCompatParcelizer = (String) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.readString());
            this.read = parcel.createByteArray();
        }

        public final boolean read(UUID uuid) {
            return JsonMapFormatVisitor.read.equals(this.AudioAttributesCompatParcelizer) || uuid.equals(this.AudioAttributesCompatParcelizer);
        }

        public final boolean RemoteActionCompatParcelizer(SchemeData schemeData) {
            return RemoteActionCompatParcelizer() && !schemeData.RemoteActionCompatParcelizer() && read(schemeData.AudioAttributesCompatParcelizer);
        }

        public final boolean RemoteActionCompatParcelizer() {
            return this.read != null;
        }

        public final SchemeData IconCompatParcelizer(byte[] bArr) {
            return new SchemeData(this.AudioAttributesCompatParcelizer, this.write, this.IconCompatParcelizer, bArr);
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof SchemeData)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            SchemeData schemeData = (SchemeData) obj;
            return LaissezFaireSubTypeValidator.read(this.write, schemeData.write) && LaissezFaireSubTypeValidator.read(this.IconCompatParcelizer, schemeData.IconCompatParcelizer) && LaissezFaireSubTypeValidator.read(this.AudioAttributesCompatParcelizer, schemeData.AudioAttributesCompatParcelizer) && Arrays.equals(this.read, schemeData.read);
        }

        public final int hashCode() {
            if (this.RemoteActionCompatParcelizer == 0) {
                int iHashCode = this.AudioAttributesCompatParcelizer.hashCode();
                String str = this.write;
                this.RemoteActionCompatParcelizer = (((((iHashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.IconCompatParcelizer.hashCode()) * 31) + Arrays.hashCode(this.read);
            }
            return this.RemoteActionCompatParcelizer;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeLong(this.AudioAttributesCompatParcelizer.getMostSignificantBits());
            parcel.writeLong(this.AudioAttributesCompatParcelizer.getLeastSignificantBits());
            parcel.writeString(this.write);
            parcel.writeString(this.IconCompatParcelizer);
            parcel.writeByteArray(this.read);
        }
    }
}
