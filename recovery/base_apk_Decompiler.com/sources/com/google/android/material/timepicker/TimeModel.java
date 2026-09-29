package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import kotlin.calculateNextSearchBytePosition;
import kotlin.readMetadataBlocks;

/* JADX INFO: loaded from: classes5.dex */
public class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new Parcelable.Creator<TimeModel>() { // from class: com.google.android.material.timepicker.TimeModel.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TimeModel createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TimeModel[] newArray(int i) {
            return IconCompatParcelizer(i);
        }

        private static TimeModel IconCompatParcelizer(Parcel parcel) {
            return new TimeModel(parcel);
        }

        private static TimeModel[] IconCompatParcelizer(int i) {
            return new TimeModel[i];
        }
    };
    public int AudioAttributesCompatParcelizer;
    private final readMetadataBlocks AudioAttributesImplBaseParcelizer;
    public int IconCompatParcelizer;
    private final readMetadataBlocks MediaBrowserCompatCustomActionResultReceiver;
    public final int RemoteActionCompatParcelizer;
    public int read;
    public int write;

    private static int AudioAttributesCompatParcelizer(int i) {
        return i >= 12 ? 1 : 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public TimeModel() {
        this((byte) 0);
    }

    private TimeModel(byte b) {
        this(0, 0, 10, 0);
    }

    private TimeModel(int i, int i2, int i3, int i4) {
        this.AudioAttributesCompatParcelizer = i;
        this.IconCompatParcelizer = i2;
        this.read = i3;
        this.RemoteActionCompatParcelizer = i4;
        this.write = AudioAttributesCompatParcelizer(i);
        this.MediaBrowserCompatCustomActionResultReceiver = new readMetadataBlocks(59);
        this.AudioAttributesImplBaseParcelizer = new readMetadataBlocks(i4 == 1 ? 23 : 12);
    }

    protected TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }

    public final void read(int i) {
        if (this.RemoteActionCompatParcelizer == 1) {
            this.AudioAttributesCompatParcelizer = i;
        } else {
            this.AudioAttributesCompatParcelizer = (i % 12) + (this.write != 1 ? 0 : 12);
        }
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.IconCompatParcelizer = i % 60;
    }

    public final int read() {
        if (this.RemoteActionCompatParcelizer == 1) {
            return this.AudioAttributesCompatParcelizer % 24;
        }
        int i = this.AudioAttributesCompatParcelizer;
        if (i % 12 == 0) {
            return 12;
        }
        return this.write == 1 ? i - 12 : i;
    }

    public final int RemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer == 1 ? calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.material_hour_24h_suffix : calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.material_hour_suffix;
    }

    public final readMetadataBlocks AudioAttributesCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final readMetadataBlocks write() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.RemoteActionCompatParcelizer), Integer.valueOf(this.AudioAttributesCompatParcelizer), Integer.valueOf(this.IconCompatParcelizer), Integer.valueOf(this.read)});
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.AudioAttributesCompatParcelizer == timeModel.AudioAttributesCompatParcelizer && this.IconCompatParcelizer == timeModel.IconCompatParcelizer && this.RemoteActionCompatParcelizer == timeModel.RemoteActionCompatParcelizer && this.read == timeModel.read;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.AudioAttributesCompatParcelizer);
        parcel.writeInt(this.IconCompatParcelizer);
        parcel.writeInt(this.read);
        parcel.writeInt(this.RemoteActionCompatParcelizer);
    }

    public final void IconCompatParcelizer(int i) {
        if (i != this.write) {
            this.write = i;
            int i2 = this.AudioAttributesCompatParcelizer;
            if (i2 < 12 && i == 1) {
                this.AudioAttributesCompatParcelizer = i2 + 12;
            } else {
                if (i2 < 12 || i != 0) {
                    return;
                }
                this.AudioAttributesCompatParcelizer = i2 - 12;
            }
        }
    }

    public static String IconCompatParcelizer(Resources resources, CharSequence charSequence) {
        return read(resources, charSequence, "%02d");
    }

    public static String read(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
