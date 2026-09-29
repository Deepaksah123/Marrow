package kotlin;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;

/* JADX INFO: loaded from: classes2.dex */
public final class DrmUtil {
    public static int RemoteActionCompatParcelizer;
    public static int read;

    public static void IconCompatParcelizer(Parcel parcel, Parcelable parcelable) {
        parcel.writeInt(1);
        parcelable.writeToParcel(parcel, 0);
    }

    public static <T extends Parcelable> T read(Parcel parcel, Parcelable.Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return creator.createFromParcel(parcel);
    }

    public static void write(Parcel parcel, Parcelable parcelable) {
        if (parcelable == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcelable.writeToParcel(parcel, 1);
        }
    }

    public static int IconCompatParcelizer() {
        int i = read;
        int i2 = i % 7900609;
        read = i + 1;
        if (i2 != 0) {
            return RemoteActionCompatParcelizer;
        }
        int startUptimeMillis = (int) Process.getStartUptimeMillis();
        RemoteActionCompatParcelizer = startUptimeMillis;
        return startUptimeMillis;
    }
}
