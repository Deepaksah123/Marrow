package coil.size;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\bJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\bJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\bJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00132\u0006\u0010\u0004\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\t\u0010\u0017\u001a\u0004\b\u0018\u0010\bR\u001a\u0010\u0019\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\b"}, d2 = {"Lcoil/size/PixelSize;", "Lcoil/size/Size;", "", "p0", "p1", "<init>", "(II)V", "RemoteActionCompatParcelizer", "()I", "write", "describeContents", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "IconCompatParcelizer", "read", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 5, 1}, xi = 48)
public final /* data */ class PixelSize extends Size {
    public static final Parcelable.Creator<PixelSize> CREATOR = new read();
    private final int read;
    private final int write;

    public static final class read implements Parcelable.Creator<PixelSize> {
        private static PixelSize write(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new PixelSize(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PixelSize createFromParcel(Parcel parcel) {
            return write(parcel);
        }

        private static PixelSize[] IconCompatParcelizer(int i) {
            return new PixelSize[i];
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PixelSize[] newArray(int i) {
            return IconCompatParcelizer(i);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
    public final int getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    public PixelSize(int i, int i2) {
        super(null);
        this.read = i;
        this.write = i2;
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("width and height must be > 0.".toString());
        }
    }

    public final int RemoteActionCompatParcelizer() {
        return this.read;
    }

    public final int write() {
        return this.write;
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        if (!(p0 instanceof PixelSize)) {
            return false;
        }
        PixelSize pixelSize = (PixelSize) p0;
        return this.read == pixelSize.read && this.write == pixelSize.write;
    }

    public final int hashCode() {
        return (Integer.hashCode(this.read) * 31) + Integer.hashCode(this.write);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PixelSize(read=");
        sb.append(this.read);
        sb.append(", write=");
        sb.append(this.write);
        sb.append(')');
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeInt(this.read);
        p0.writeInt(this.write);
    }
}
