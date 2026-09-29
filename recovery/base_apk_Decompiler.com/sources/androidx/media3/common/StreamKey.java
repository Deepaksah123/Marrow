package androidx.media3.common;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.LaissezFaireSubTypeValidator;

/* JADX INFO: loaded from: classes2.dex */
public final class StreamKey implements Comparable<StreamKey>, Parcelable {
    public static final Parcelable.Creator<StreamKey> CREATOR = new Parcelable.Creator<StreamKey>() { // from class: androidx.media3.common.StreamKey.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StreamKey createFromParcel(Parcel parcel) {
            return write(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ StreamKey[] newArray(int i) {
            return AudioAttributesCompatParcelizer(i);
        }

        private static StreamKey write(Parcel parcel) {
            return new StreamKey(parcel);
        }

        private static StreamKey[] AudioAttributesCompatParcelizer(int i) {
            return new StreamKey[i];
        }
    };
    public final int AudioAttributesCompatParcelizer;
    public final int read;
    public final int write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public StreamKey() {
        this.write = -1;
        this.read = -1;
        this.AudioAttributesCompatParcelizer = -1;
    }

    StreamKey(Parcel parcel) {
        this.write = parcel.readInt();
        this.read = parcel.readInt();
        this.AudioAttributesCompatParcelizer = parcel.readInt();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.write);
        sb.append(".");
        sb.append(this.read);
        sb.append(".");
        sb.append(this.AudioAttributesCompatParcelizer);
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StreamKey streamKey = (StreamKey) obj;
        return this.write == streamKey.write && this.read == streamKey.read && this.AudioAttributesCompatParcelizer == streamKey.AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return (((this.write * 31) + this.read) * 31) + this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public int compareTo(StreamKey streamKey) {
        int i = this.write - streamKey.write;
        return (i == 0 && (i = this.read - streamKey.read) == 0) ? this.AudioAttributesCompatParcelizer - streamKey.AudioAttributesCompatParcelizer : i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.write);
        parcel.writeInt(this.read);
        parcel.writeInt(this.AudioAttributesCompatParcelizer);
    }

    static {
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
        LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
    }
}
