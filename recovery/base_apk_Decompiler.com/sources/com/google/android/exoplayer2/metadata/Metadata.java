package com.google.android.exoplayer2.metadata;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.Format;
import com.google.android.exoplayer2.MediaMetadata;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;
import java.util.List;
import kotlin.setFormatMetadata;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class Metadata implements Parcelable {
    public static final Parcelable.Creator<Metadata> CREATOR = new Parcelable.Creator<Metadata>() { // from class: com.google.android.exoplayer2.metadata.Metadata.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Metadata createFromParcel(Parcel parcel) {
            return new Metadata(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Metadata[] newArray(int i) {
            return new Metadata[i];
        }
    };
    private final Entry[] entries;
    public final long presentationTimeUs;

    public interface Entry extends Parcelable {
        default byte[] getWrappedMetadataBytes() {
            return null;
        }

        default Format getWrappedMetadataFormat() {
            return null;
        }

        default void populateMediaMetadata(MediaMetadata.Builder builder) {
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public Metadata(Entry... entryArr) {
        this(C.TIME_UNSET, entryArr);
    }

    public Metadata(long j, Entry... entryArr) {
        this.presentationTimeUs = j;
        this.entries = entryArr;
    }

    public Metadata(List<? extends Entry> list) {
        this((Entry[]) list.toArray(new Entry[0]));
    }

    public Metadata(long j, List<? extends Entry> list) {
        this(j, (Entry[]) list.toArray(new Entry[0]));
    }

    Metadata(Parcel parcel) {
        this.entries = new Entry[parcel.readInt()];
        int i = 0;
        while (true) {
            Entry[] entryArr = this.entries;
            if (i < entryArr.length) {
                entryArr[i] = (Entry) parcel.readParcelable(Entry.class.getClassLoader());
                i++;
            } else {
                this.presentationTimeUs = parcel.readLong();
                return;
            }
        }
    }

    public final int length() {
        return this.entries.length;
    }

    public final Entry get(int i) {
        return this.entries[i];
    }

    public final Metadata copyWithAppendedEntriesFrom(Metadata metadata) {
        return metadata == null ? this : copyWithAppendedEntries(metadata.entries);
    }

    public final Metadata copyWithAppendedEntries(Entry... entryArr) {
        return entryArr.length == 0 ? this : new Metadata(this.presentationTimeUs, (Entry[]) Util.nullSafeArrayConcatenation(this.entries, entryArr));
    }

    public final Metadata copyWithPresentationTimeUs(long j) {
        return this.presentationTimeUs == j ? this : new Metadata(j, this.entries);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Metadata metadata = (Metadata) obj;
        return Arrays.equals(this.entries, metadata.entries) && this.presentationTimeUs == metadata.presentationTimeUs;
    }

    public final int hashCode() {
        return (Arrays.hashCode(this.entries) * 31) + setFormatMetadata.AudioAttributesCompatParcelizer(this.presentationTimeUs);
    }

    public final String toString() {
        String string;
        StringBuilder sb = new StringBuilder("entries=");
        sb.append(Arrays.toString(this.entries));
        if (this.presentationTimeUs == C.TIME_UNSET) {
            string = "";
        } else {
            StringBuilder sb2 = new StringBuilder(", presentationTimeUs=");
            sb2.append(this.presentationTimeUs);
            string = sb2.toString();
        }
        sb.append(string);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.entries.length);
        for (Entry entry : this.entries) {
            parcel.writeParcelable(entry, 0);
        }
        parcel.writeLong(this.presentationTimeUs);
    }
}
