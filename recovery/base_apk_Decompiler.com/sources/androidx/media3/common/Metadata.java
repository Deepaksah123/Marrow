package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import java.util.Arrays;
import java.util.List;
import kotlin.C0170format;
import kotlin.LaissezFaireSubTypeValidator;
import kotlin.getSchema;
import kotlin.setFormatMetadata;

/* JADX INFO: loaded from: classes2.dex */
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new Parcelable.Creator<Metadata>() { // from class: androidx.media3.common.Metadata.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Metadata createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Metadata[] newArray(int i) {
            return AudioAttributesCompatParcelizer(i);
        }

        private static Metadata IconCompatParcelizer(Parcel parcel) {
            return new Metadata(parcel);
        }

        private static Metadata[] AudioAttributesCompatParcelizer(int i) {
            return new Metadata[i];
        }
    };
    private final Entry[] read;
    public final long write;

    public interface Entry extends Parcelable {
        default void AudioAttributesCompatParcelizer(getSchema.RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        }

        default byte[] RemoteActionCompatParcelizer() {
            return null;
        }

        default C0170format read() {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public Metadata(Entry... entryArr) {
        this(C.TIME_UNSET, entryArr);
    }

    private Metadata(long j, Entry... entryArr) {
        this.write = j;
        this.read = entryArr;
    }

    public Metadata(List<? extends Entry> list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(long j, List<? extends Entry> list) {
        this(j, (Entry[]) list.toArray(new Entry[0]));
    }

    Metadata(Parcel parcel) {
        this.read = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.read;
            if (i < entryArr.length) {
                entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            } else {
                this.write = parcel.readLong();
                return;
            }
        }
    }

    public final int write() {
        return this.read.length;
    }

    public final Entry IconCompatParcelizer(int i) {
        return this.read[i];
    }

    public final Metadata RemoteActionCompatParcelizer(Metadata metadata) {
        return metadata == null ? this : read(metadata.read);
    }

    public final Metadata read(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata(this.write, (Entry[]) LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer((Object[]) this.read, (Object[]) entryArr));
    }

    public final Metadata AudioAttributesCompatParcelizer(long j) {
        return this.write == j ? this : new Metadata(j, this.read);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        return Arrays.equals(this.read, metadata.read) && this.write == metadata.write;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.read) * 31) + setFormatMetadata.AudioAttributesCompatParcelizer(this.write);
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.read));
        if (this.write == C.TIME_UNSET) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder(", presentationTimeUs=");
            sb2.append(this.write);
            string = sb2.toString();
        }
        sb.append(string);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.read.length);
        for (Entry entry : this.read) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.write);
    }
}
