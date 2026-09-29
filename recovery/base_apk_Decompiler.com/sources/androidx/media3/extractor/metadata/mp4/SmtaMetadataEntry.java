package androidx.media3.extractor.metadata.mp4;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import kotlin.parseMdtaMetadataEntryFromIlst;

/* JADX INFO: loaded from: classes2.dex */
public final class SmtaMetadataEntry implements Metadata.Entry {
    public static final Parcelable.Creator<SmtaMetadataEntry> CREATOR = new Parcelable.Creator<SmtaMetadataEntry>() { // from class: androidx.media3.extractor.metadata.mp4.SmtaMetadataEntry.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SmtaMetadataEntry createFromParcel(Parcel parcel) {
            return write(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SmtaMetadataEntry[] newArray(int i) {
            return IconCompatParcelizer(i);
        }

        private static SmtaMetadataEntry write(Parcel parcel) {
            return new SmtaMetadataEntry(parcel, (byte) 0);
        }

        private static SmtaMetadataEntry[] IconCompatParcelizer(int i) {
            return new SmtaMetadataEntry[i];
        }
    };
    public final int IconCompatParcelizer;
    public final float read;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* synthetic */ SmtaMetadataEntry(Parcel parcel, byte b) {
        this(parcel);
    }

    public SmtaMetadataEntry(float f, int i) {
        this.read = f;
        this.IconCompatParcelizer = i;
    }

    private SmtaMetadataEntry(Parcel parcel) {
        this.read = parcel.readFloat();
        this.IconCompatParcelizer = parcel.readInt();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SmtaMetadataEntry smtaMetadataEntry = (SmtaMetadataEntry) obj;
        return this.read == smtaMetadataEntry.read && this.IconCompatParcelizer == smtaMetadataEntry.IconCompatParcelizer;
    }

    public final int hashCode() {
        return ((parseMdtaMetadataEntryFromIlst.read(this.read) + 527) * 31) + this.IconCompatParcelizer;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("smta: captureFrameRate=");
        sb.append(this.read);
        sb.append(", svcTemporalLayerCount=");
        sb.append(this.IconCompatParcelizer);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.read);
        parcel.writeInt(this.IconCompatParcelizer);
    }
}
