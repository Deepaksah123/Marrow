package coil.size;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Lcoil/size/OriginalSize;", "Lcoil/size/Size;", "<init>", "()V", "", "describeContents", "()I", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "p0", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final class OriginalSize extends Size {
    public static final OriginalSize INSTANCE = new OriginalSize();
    public static final Parcelable.Creator<OriginalSize> CREATOR = new read();

    public static final class read implements Parcelable.Creator<OriginalSize> {
        private static OriginalSize AudioAttributesCompatParcelizer(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            parcel.readInt();
            return OriginalSize.INSTANCE;
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OriginalSize createFromParcel(Parcel parcel) {
            return AudioAttributesCompatParcelizer(parcel);
        }

        private static OriginalSize[] read(int i) {
            return new OriginalSize[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ OriginalSize[] newArray(int i) {
            return read(i);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    private OriginalSize() {
        super(null);
    }

    public final String toString() {
        return "coil.size.OriginalSize";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeInt(1);
    }
}
