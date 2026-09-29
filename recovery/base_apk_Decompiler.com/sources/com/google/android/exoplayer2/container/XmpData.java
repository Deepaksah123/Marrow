package com.google.android.exoplayer2.container;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.util.Util;
import java.util.Arrays;

/* JADX INFO: loaded from: classes5.dex */
@Deprecated
public final class XmpData implements Metadata.Entry {
    public static final Parcelable.Creator<XmpData> CREATOR = new Parcelable.Creator<XmpData>() { // from class: com.google.android.exoplayer2.container.XmpData.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public XmpData createFromParcel(Parcel parcel) {
            return new XmpData(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public XmpData[] newArray(int i) {
            return new XmpData[i];
        }
    };
    public final byte[] data;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public XmpData(byte[] bArr) {
        this.data = bArr;
    }

    private XmpData(Parcel parcel) {
        this.data = (byte[]) Util.castNonNull(parcel.createByteArray());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.data, ((XmpData) obj).data);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.data);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("XMP: ");
        sb.append(Util.toHexString(this.data));
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeByteArray(this.data);
    }
}
