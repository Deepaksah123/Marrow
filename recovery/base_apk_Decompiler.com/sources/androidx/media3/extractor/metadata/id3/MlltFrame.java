package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.LaissezFaireSubTypeValidator;

/* JADX INFO: loaded from: classes2.dex */
public final class MlltFrame extends Id3Frame {
    public static final Parcelable.Creator<MlltFrame> CREATOR = new Parcelable.Creator<MlltFrame>() { // from class: androidx.media3.extractor.metadata.id3.MlltFrame.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MlltFrame createFromParcel(Parcel parcel) {
            return write(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ MlltFrame[] newArray(int i) {
            return RemoteActionCompatParcelizer(i);
        }

        private static MlltFrame write(Parcel parcel) {
            return new MlltFrame(parcel);
        }

        private static MlltFrame[] RemoteActionCompatParcelizer(int i) {
            return new MlltFrame[i];
        }
    };
    public final int[] AudioAttributesCompatParcelizer;
    public final int IconCompatParcelizer;
    public final int RemoteActionCompatParcelizer;
    public final int[] read;
    public final int write;

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public MlltFrame(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        super(com.google.android.exoplayer2.metadata.id3.MlltFrame.ID);
        this.RemoteActionCompatParcelizer = i;
        this.IconCompatParcelizer = i2;
        this.write = i3;
        this.read = iArr;
        this.AudioAttributesCompatParcelizer = iArr2;
    }

    MlltFrame(Parcel parcel) {
        super(com.google.android.exoplayer2.metadata.id3.MlltFrame.ID);
        this.RemoteActionCompatParcelizer = parcel.readInt();
        this.IconCompatParcelizer = parcel.readInt();
        this.write = parcel.readInt();
        this.read = (int[]) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.createIntArray());
        this.AudioAttributesCompatParcelizer = (int[]) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.createIntArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        MlltFrame mlltFrame = (MlltFrame) obj;
        return this.RemoteActionCompatParcelizer == mlltFrame.RemoteActionCompatParcelizer && this.IconCompatParcelizer == mlltFrame.IconCompatParcelizer && this.write == mlltFrame.write && Arrays.equals(this.read, mlltFrame.read) && Arrays.equals(this.AudioAttributesCompatParcelizer, mlltFrame.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        int i = this.RemoteActionCompatParcelizer;
        int i2 = this.IconCompatParcelizer;
        return ((((((((i + 527) * 31) + i2) * 31) + this.write) * 31) + Arrays.hashCode(this.read)) * 31) + Arrays.hashCode(this.AudioAttributesCompatParcelizer);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.RemoteActionCompatParcelizer);
        parcel.writeInt(this.IconCompatParcelizer);
        parcel.writeInt(this.write);
        parcel.writeIntArray(this.read);
        parcel.writeIntArray(this.AudioAttributesCompatParcelizer);
    }
}
