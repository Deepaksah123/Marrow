package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.LaissezFaireSubTypeValidator;

/* JADX INFO: loaded from: classes2.dex */
public final class ChapterFrame extends Id3Frame {
    public static final Parcelable.Creator<ChapterFrame> CREATOR = new Parcelable.Creator<ChapterFrame>() { // from class: androidx.media3.extractor.metadata.id3.ChapterFrame.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ChapterFrame createFromParcel(Parcel parcel) {
            return write(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ChapterFrame[] newArray(int i) {
            return write(i);
        }

        private static ChapterFrame write(Parcel parcel) {
            return new ChapterFrame(parcel);
        }

        private static ChapterFrame[] write(int i) {
            return new ChapterFrame[i];
        }
    };
    public final int AudioAttributesCompatParcelizer;
    private final Id3Frame[] AudioAttributesImplApi21Parcelizer;
    public final long IconCompatParcelizer;
    public final String RemoteActionCompatParcelizer;
    public final long read;
    public final int write;

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ChapterFrame(String str, int i, int i2, long j, long j2, Id3Frame[] id3FrameArr) {
        super(com.google.android.exoplayer2.metadata.id3.ChapterFrame.ID);
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = i;
        this.write = i2;
        this.IconCompatParcelizer = j;
        this.read = j2;
        this.AudioAttributesImplApi21Parcelizer = id3FrameArr;
    }

    ChapterFrame(Parcel parcel) {
        super(com.google.android.exoplayer2.metadata.id3.ChapterFrame.ID);
        this.RemoteActionCompatParcelizer = (String) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.readString());
        this.AudioAttributesCompatParcelizer = parcel.readInt();
        this.write = parcel.readInt();
        this.IconCompatParcelizer = parcel.readLong();
        this.read = parcel.readLong();
        int i = parcel.readInt();
        this.AudioAttributesImplApi21Parcelizer = new Id3Frame[i];
        for (int i2 = 0; i2 < i; i2++) {
            this.AudioAttributesImplApi21Parcelizer[i2] = (Id3Frame) parcel.readParcelable(Id3Frame.class.getClassLoader());
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChapterFrame chapterFrame = (ChapterFrame) obj;
        return this.AudioAttributesCompatParcelizer == chapterFrame.AudioAttributesCompatParcelizer && this.write == chapterFrame.write && this.IconCompatParcelizer == chapterFrame.IconCompatParcelizer && this.read == chapterFrame.read && LaissezFaireSubTypeValidator.read(this.RemoteActionCompatParcelizer, chapterFrame.RemoteActionCompatParcelizer) && Arrays.equals(this.AudioAttributesImplApi21Parcelizer, chapterFrame.AudioAttributesImplApi21Parcelizer);
    }

    public final int hashCode() {
        int i = this.AudioAttributesCompatParcelizer;
        int i2 = this.write;
        int i3 = (int) this.IconCompatParcelizer;
        int i4 = (int) this.read;
        String str = this.RemoteActionCompatParcelizer;
        return ((((((((i + 527) * 31) + i2) * 31) + i3) * 31) + i4) * 31) + (str != null ? str.hashCode() : 0);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.RemoteActionCompatParcelizer);
        parcel.writeInt(this.AudioAttributesCompatParcelizer);
        parcel.writeInt(this.write);
        parcel.writeLong(this.IconCompatParcelizer);
        parcel.writeLong(this.read);
        parcel.writeInt(this.AudioAttributesImplApi21Parcelizer.length);
        for (Id3Frame id3Frame : this.AudioAttributesImplApi21Parcelizer) {
            parcel.writeParcelable(id3Frame, 0);
        }
    }
}
