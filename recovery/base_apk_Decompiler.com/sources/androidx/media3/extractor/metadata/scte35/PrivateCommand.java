package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.AsPropertyTypeDeserializer;
import kotlin.LaissezFaireSubTypeValidator;

/* JADX INFO: loaded from: classes2.dex */
public final class PrivateCommand extends SpliceCommand {
    public static final Parcelable.Creator<PrivateCommand> CREATOR = new Parcelable.Creator<PrivateCommand>() { // from class: androidx.media3.extractor.metadata.scte35.PrivateCommand.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PrivateCommand createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PrivateCommand[] newArray(int i) {
            return IconCompatParcelizer(i);
        }

        private static PrivateCommand IconCompatParcelizer(Parcel parcel) {
            return new PrivateCommand(parcel, (byte) 0);
        }

        private static PrivateCommand[] IconCompatParcelizer(int i) {
            return new PrivateCommand[i];
        }
    };
    public final byte[] AudioAttributesCompatParcelizer;
    public final long IconCompatParcelizer;
    public final long read;

    /* synthetic */ PrivateCommand(Parcel parcel, byte b) {
        this(parcel);
    }

    private PrivateCommand(long j, byte[] bArr, long j2) {
        this.read = j2;
        this.IconCompatParcelizer = j;
        this.AudioAttributesCompatParcelizer = bArr;
    }

    private PrivateCommand(Parcel parcel) {
        this.read = parcel.readLong();
        this.IconCompatParcelizer = parcel.readLong();
        this.AudioAttributesCompatParcelizer = (byte[]) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.createByteArray());
    }

    public static PrivateCommand read(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, long j) {
        long jOnMediaButtonEvent = asPropertyTypeDeserializer.onMediaButtonEvent();
        int i2 = i - 4;
        byte[] bArr = new byte[i2];
        asPropertyTypeDeserializer.write(bArr, 0, i2);
        return new PrivateCommand(jOnMediaButtonEvent, bArr, j);
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 PrivateCommand { ptsAdjustment=");
        sb.append(this.read);
        sb.append(", identifier= ");
        sb.append(this.IconCompatParcelizer);
        sb.append(" }");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.read);
        parcel.writeLong(this.IconCompatParcelizer);
        parcel.writeByteArray(this.AudioAttributesCompatParcelizer);
    }
}
