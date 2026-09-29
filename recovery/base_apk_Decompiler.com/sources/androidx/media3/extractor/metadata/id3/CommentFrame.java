package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.LaissezFaireSubTypeValidator;

/* JADX INFO: loaded from: classes2.dex */
public final class CommentFrame extends Id3Frame {
    public static final Parcelable.Creator<CommentFrame> CREATOR = new Parcelable.Creator<CommentFrame>() { // from class: androidx.media3.extractor.metadata.id3.CommentFrame.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CommentFrame createFromParcel(Parcel parcel) {
            return RemoteActionCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ CommentFrame[] newArray(int i) {
            return read(i);
        }

        private static CommentFrame RemoteActionCompatParcelizer(Parcel parcel) {
            return new CommentFrame(parcel);
        }

        private static CommentFrame[] read(int i) {
            return new CommentFrame[i];
        }
    };
    public final String RemoteActionCompatParcelizer;
    public final String read;
    public final String write;

    public CommentFrame(String str, String str2, String str3) {
        super(com.google.android.exoplayer2.metadata.id3.CommentFrame.ID);
        this.write = str;
        this.RemoteActionCompatParcelizer = str2;
        this.read = str3;
    }

    CommentFrame(Parcel parcel) {
        super(com.google.android.exoplayer2.metadata.id3.CommentFrame.ID);
        this.write = (String) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.readString());
        this.RemoteActionCompatParcelizer = (String) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.readString());
        this.read = (String) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CommentFrame commentFrame = (CommentFrame) obj;
        return LaissezFaireSubTypeValidator.read(this.RemoteActionCompatParcelizer, commentFrame.RemoteActionCompatParcelizer) && LaissezFaireSubTypeValidator.read(this.write, commentFrame.write) && LaissezFaireSubTypeValidator.read(this.read, commentFrame.read);
    }

    public final int hashCode() {
        String str = this.write;
        int iHashCode = str != null ? str.hashCode() : 0;
        String str2 = this.RemoteActionCompatParcelizer;
        int iHashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        return ((((iHashCode + 527) * 31) + iHashCode2) * 31) + (str3 != null ? str3.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(": language=");
        sb.append(this.write);
        sb.append(", description=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(", text=");
        sb.append(this.read);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompatItemReceiver);
        parcel.writeString(this.write);
        parcel.writeString(this.read);
    }
}
