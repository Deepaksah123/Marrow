package androidx.media3.extractor.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.LaissezFaireSubTypeValidator;

/* JADX INFO: loaded from: classes2.dex */
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new Parcelable.Creator<UrlLinkFrame>() { // from class: androidx.media3.extractor.metadata.id3.UrlLinkFrame.5
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UrlLinkFrame createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ UrlLinkFrame[] newArray(int i) {
            return write(i);
        }

        private static UrlLinkFrame IconCompatParcelizer(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        private static UrlLinkFrame[] write(int i) {
            return new UrlLinkFrame[i];
        }
    };
    public final String RemoteActionCompatParcelizer;
    public final String write;

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.RemoteActionCompatParcelizer = str2;
        this.write = str3;
    }

    UrlLinkFrame(Parcel parcel) {
        super((String) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.readString()));
        this.RemoteActionCompatParcelizer = parcel.readString();
        this.write = (String) LaissezFaireSubTypeValidator.IconCompatParcelizer(parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.MediaBrowserCompatItemReceiver.equals(urlLinkFrame.MediaBrowserCompatItemReceiver) && LaissezFaireSubTypeValidator.read(this.RemoteActionCompatParcelizer, urlLinkFrame.RemoteActionCompatParcelizer) && LaissezFaireSubTypeValidator.read(this.write, urlLinkFrame.write);
    }

    public final int hashCode() {
        int iHashCode = this.MediaBrowserCompatItemReceiver.hashCode();
        String str = this.RemoteActionCompatParcelizer;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        return ((((iHashCode + 527) * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // androidx.media3.extractor.metadata.id3.Id3Frame
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompatItemReceiver);
        sb.append(": url=");
        sb.append(this.write);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.MediaBrowserCompatItemReceiver);
        parcel.writeString(this.RemoteActionCompatParcelizer);
        parcel.writeString(this.write);
    }
}
