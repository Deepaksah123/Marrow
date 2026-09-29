package com.google.android.exoplayer2.metadata.id3;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.util.Util;

/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public final class UrlLinkFrame extends Id3Frame {
    public static final Parcelable.Creator<UrlLinkFrame> CREATOR = new Parcelable.Creator<UrlLinkFrame>() { // from class: com.google.android.exoplayer2.metadata.id3.UrlLinkFrame.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UrlLinkFrame createFromParcel(Parcel parcel) {
            return new UrlLinkFrame(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public UrlLinkFrame[] newArray(int i) {
            return new UrlLinkFrame[i];
        }
    };
    public final String description;
    public final String url;

    public UrlLinkFrame(String str, String str2, String str3) {
        super(str);
        this.description = str2;
        this.url = str3;
    }

    UrlLinkFrame(Parcel parcel) {
        super((String) Util.castNonNull(parcel.readString()));
        this.description = parcel.readString();
        this.url = (String) Util.castNonNull(parcel.readString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UrlLinkFrame urlLinkFrame = (UrlLinkFrame) obj;
        return this.id.equals(urlLinkFrame.id) && Util.areEqual(this.description, urlLinkFrame.description) && Util.areEqual(this.url, urlLinkFrame.url);
    }

    public final int hashCode() {
        int iHashCode = this.id.hashCode();
        String str = this.description;
        int iHashCode2 = str != null ? str.hashCode() : 0;
        String str2 = this.url;
        return ((((iHashCode + 527) * 31) + iHashCode2) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // com.google.android.exoplayer2.metadata.id3.Id3Frame
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.id);
        sb.append(": url=");
        sb.append(this.url);
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.id);
        parcel.writeString(this.description);
        parcel.writeString(this.url);
    }
}
