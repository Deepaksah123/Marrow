package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.LaissezFaireSubTypeValidator;

/* JADX INFO: loaded from: classes2.dex */
public final class PrivFrame extends Id3Frame {
    public static final Parcelable.Creator<PrivFrame> CREATOR = new Parcelable.Creator<PrivFrame>() { // from class: androidx.media3.extractor.metadata.id3.PrivFrame.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PrivFrame createFromParcel(Parcel parcel) {
            return write(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PrivFrame[] newArray(int i) {
            return write(i);
        }

        private static PrivFrame write(Parcel parcel) {
            return new PrivFrame(parcel);
        }

        private static PrivFrame[] write(int i) {
            return new PrivFrame[i];
        }
    };
    public final String AudioAttributesCompatParcelizer;
    public final byte[] RemoteActionCompatParcelizer;

    public PrivFrame(String str, byte[] bArr) {
        super(com.google.android.exoplayer2.metadata.id3.PrivFrame.ID);
        this.AudioAttributesCompatParcelizer = str;
        this.RemoteActionCompatParcelizer = bArr;
    }

    PrivFrame(Parcel parcel) {
        super(com.google.android.exoplayer2.metadata.id3.PrivFrame.ID);
        this.AudioAttributesCompatParcelizer = (String) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.readString());
        this.RemoteActionCompatParcelizer = (byte[]) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PrivFrame privFrame = (PrivFrame) obj;
        return LaissezFaireSubTypeValidator.read(this.AudioAttributesCompatParcelizer, privFrame.AudioAttributesCompatParcelizer) && Arrays.equals(this.RemoteActionCompatParcelizer, privFrame.RemoteActionCompatParcelizer);
    }

    public final int hashCode() {
        String str = this.AudioAttributesCompatParcelizer;
        return (((str != null ? str.hashCode() : 0) + 527) * 31) + Arrays.hashCode(this.RemoteActionCompatParcelizer);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(": owner=");
        sb.append(this.AudioAttributesCompatParcelizer);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.AudioAttributesCompatParcelizer);
        parcel.writeByteArray(this.RemoteActionCompatParcelizer);
    }
}
