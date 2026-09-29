package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.LaissezFaireSubTypeValidator;

/* JADX INFO: loaded from: classes2.dex */
public final class ChapterTocFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterTocFrame> CREATOR = new Parcelable.Creator<ChapterTocFrame>() { // from class: androidx.media3.extractor.metadata.id3.ChapterTocFrame.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ChapterTocFrame createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ChapterTocFrame[] newArray(int i) {
            return IconCompatParcelizer(i);
        }

        private static ChapterTocFrame IconCompatParcelizer(Parcel parcel) {
            return new ChapterTocFrame(parcel);
        }

        private static ChapterTocFrame[] IconCompatParcelizer(int i) {
            return new ChapterTocFrame[i];
        }
    };
    public final String AudioAttributesCompatParcelizer;
    private final Id3Frame[] IconCompatParcelizer;
    public final String[] RemoteActionCompatParcelizer;
    public final boolean read;
    public final boolean write;

    public ChapterTocFrame(String str, boolean z, boolean z2, String[] strArr, Id3Frame[] id3FrameArr) {
        super(com.google.android.exoplayer2.metadata.id3.ChapterTocFrame.ID);
        this.AudioAttributesCompatParcelizer = str;
        this.write = z;
        this.read = z2;
        this.RemoteActionCompatParcelizer = strArr;
        this.IconCompatParcelizer = id3FrameArr;
    }

    ChapterTocFrame(Parcel parcel) {
        super(com.google.android.exoplayer2.metadata.id3.ChapterTocFrame.ID);
        this.AudioAttributesCompatParcelizer = (String) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.readString());
        this.write = parcel.readByte() != 0;
        this.read = parcel.readByte() != 0;
        this.RemoteActionCompatParcelizer = (String[]) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.createStringArray());
        int i = parcel.readInt();
        this.IconCompatParcelizer = new Id3Frame[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.IconCompatParcelizer[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChapterTocFrame chapterTocFrame = (ChapterTocFrame) obj;
        return this.write == chapterTocFrame.write && this.read == chapterTocFrame.read && LaissezFaireSubTypeValidator.read(this.AudioAttributesCompatParcelizer, chapterTocFrame.AudioAttributesCompatParcelizer) && Arrays.equals(this.RemoteActionCompatParcelizer, chapterTocFrame.RemoteActionCompatParcelizer) && Arrays.equals(this.IconCompatParcelizer, chapterTocFrame.IconCompatParcelizer);
    }

    public final int hashCode() {
        boolean z = this.write;
        boolean z2 = this.read;
        String str = this.AudioAttributesCompatParcelizer;
        return (((((z ? 1 : 0) + 527) * 31) + (z2 ? 1 : 0)) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.AudioAttributesCompatParcelizer);
        parcel.writeByte(this.write ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.read ? (byte) 1 : (byte) 0);
        parcel.writeStringArray(this.RemoteActionCompatParcelizer);
        parcel.writeInt(this.IconCompatParcelizer.length);
        for (Id3Frame id3Frame : this.IconCompatParcelizer) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
