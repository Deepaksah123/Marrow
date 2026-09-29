package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.LaissezFaireSubTypeValidator;

/* JADX INFO: loaded from: classes2.dex */
public final class InternalFrame extends Id3Frame {
    public static final Parcelable.Creator<InternalFrame> CREATOR = new Parcelable.Creator<InternalFrame>() { // from class: androidx.media3.extractor.metadata.id3.InternalFrame.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InternalFrame createFromParcel(Parcel parcel) {
            return RemoteActionCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ InternalFrame[] newArray(int i) {
            return IconCompatParcelizer(i);
        }

        private static InternalFrame RemoteActionCompatParcelizer(Parcel parcel) {
            return new InternalFrame(parcel);
        }

        private static InternalFrame[] IconCompatParcelizer(int i) {
            return new InternalFrame[i];
        }
    };
    public final String AudioAttributesCompatParcelizer;
    public final String read;
    public final String write;

    public InternalFrame(String str, String str2, String str3) {
        super(com.google.android.exoplayer2.metadata.id3.InternalFrame.ID);
        this.read = str;
        this.write = str2;
        this.AudioAttributesCompatParcelizer = str3;
    }

    InternalFrame(Parcel parcel) {
        super(com.google.android.exoplayer2.metadata.id3.InternalFrame.ID);
        this.read = (String) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.readString());
        this.write = (String) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.readString());
        this.AudioAttributesCompatParcelizer = (String) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InternalFrame internalFrame = (InternalFrame) obj;
        return LaissezFaireSubTypeValidator.read(this.write, internalFrame.write) && LaissezFaireSubTypeValidator.read(this.read, internalFrame.read) && LaissezFaireSubTypeValidator.read(this.AudioAttributesCompatParcelizer, internalFrame.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.read;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.AudioAttributesCompatParcelizer;
        return ((((iHashCode + 527) * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(": domain=");
        sb.append(this.read);
        sb.append(", description=");
        sb.append(this.write);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompatItemReceiver);
        parcel.writeString(this.read);
        parcel.writeString(this.AudioAttributesCompatParcelizer);
    }
}
