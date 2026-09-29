package com.github.mikephil.charting.data;

import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.playClearSamplesWithoutKeys;

/* JADX INFO: loaded from: classes.dex */
public class Entry extends playClearSamplesWithoutKeys implements Parcelable {
    public static final Parcelable.Creator<Entry> CREATOR = new Parcelable.Creator<Entry>() { // from class: com.github.mikephil.charting.data.Entry.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Entry createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ Entry[] newArray(int i) {
            return write(i);
        }

        private static Entry IconCompatParcelizer(Parcel parcel) {
            return new Entry(parcel);
        }

        private static Entry[] write(int i) {
            return new Entry[i];
        }
    };
    private float AudioAttributesCompatParcelizer;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public Entry() {
        this.AudioAttributesCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    }

    public Entry(float f) {
        super(f);
        this.AudioAttributesCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
    }

    public float MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesCompatParcelizer;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Entry, x: ");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(" y: ");
        sb.append(read());
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.AudioAttributesCompatParcelizer);
        parcel.writeFloat(read());
        if (IconCompatParcelizer() != null) {
            if (IconCompatParcelizer() instanceof Parcelable) {
                parcel.writeInt(1);
                parcel.writeParcelable((Parcelable) IconCompatParcelizer(), i);
                return;
            }
            throw new ParcelFormatException("Cannot parcel an Entry with non-parcelable data");
        }
        parcel.writeInt(0);
    }

    protected Entry(Parcel parcel) {
        this.AudioAttributesCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesCompatParcelizer = parcel.readFloat();
        AudioAttributesCompatParcelizer(parcel.readFloat());
        if (parcel.readInt() == 1) {
            RemoteActionCompatParcelizer(parcel.readParcelable(Object.class.getClassLoader()));
        }
    }
}
