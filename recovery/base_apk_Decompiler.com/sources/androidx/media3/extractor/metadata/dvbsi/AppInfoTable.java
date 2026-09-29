package androidx.media3.extractor.metadata.dvbsi;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.media3.common.Metadata;
import kotlin.buildTypeSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class AppInfoTable implements Metadata.Entry {
    public static final Parcelable.Creator<AppInfoTable> CREATOR = new Parcelable.Creator<AppInfoTable>() { // from class: androidx.media3.extractor.metadata.dvbsi.AppInfoTable.4
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AppInfoTable createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ AppInfoTable[] newArray(int i) {
            return AudioAttributesCompatParcelizer(i);
        }

        private static AppInfoTable IconCompatParcelizer(Parcel parcel) {
            return new AppInfoTable(parcel.readInt(), (String) buildTypeSerializer.IconCompatParcelizer(parcel.readString()));
        }

        private static AppInfoTable[] AudioAttributesCompatParcelizer(int i) {
            return new AppInfoTable[i];
        }
    };
    public final int RemoteActionCompatParcelizer;
    public final String write;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public AppInfoTable(int i, String str) {
        this.RemoteActionCompatParcelizer = i;
        this.write = str;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Ait(controlCode=");
        sb.append(this.RemoteActionCompatParcelizer);
        sb.append(",url=");
        sb.append(this.write);
        sb.append(")");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.write);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
    }
}
