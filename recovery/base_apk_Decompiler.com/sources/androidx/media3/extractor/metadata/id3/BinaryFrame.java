package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.LaissezFaireSubTypeValidator;

/* JADX INFO: loaded from: classes2.dex */
public final class BinaryFrame extends Id3Frame {
    public static final Parcelable.Creator<BinaryFrame> CREATOR = new Parcelable.Creator<BinaryFrame>() { // from class: androidx.media3.extractor.metadata.id3.BinaryFrame.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BinaryFrame createFromParcel(Parcel parcel) {
            return RemoteActionCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ BinaryFrame[] newArray(int i) {
            return IconCompatParcelizer(i);
        }

        private static BinaryFrame RemoteActionCompatParcelizer(Parcel parcel) {
            return new BinaryFrame(parcel);
        }

        private static BinaryFrame[] IconCompatParcelizer(int i) {
            return new BinaryFrame[i];
        }
    };
    public final byte[] AudioAttributesCompatParcelizer;

    public BinaryFrame(String str, byte[] bArr) {
        super(str);
        this.AudioAttributesCompatParcelizer = bArr;
    }

    BinaryFrame(Parcel parcel) {
        super((String) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.readString()));
        this.AudioAttributesCompatParcelizer = (byte[]) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BinaryFrame binaryFrame = (BinaryFrame) obj;
        return this.MediaBrowserCompatItemReceiver.equals(binaryFrame.MediaBrowserCompatItemReceiver) && Arrays.equals(this.AudioAttributesCompatParcelizer, binaryFrame.AudioAttributesCompatParcelizer);
    }

    public final int hashCode() {
        return ((this.MediaBrowserCompatItemReceiver.hashCode() + 527) * 31) + Arrays.hashCode(this.AudioAttributesCompatParcelizer);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompatItemReceiver);
        parcel.writeByteArray(this.AudioAttributesCompatParcelizer);
    }
}
