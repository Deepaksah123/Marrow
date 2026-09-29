package androidx.compose.foundation.lazy.layout;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0003\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\fJ\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "Landroid/os/Parcelable;", "", "p0", "<init>", "(I)V", "Landroid/os/Parcel;", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "RemoteActionCompatParcelizer", "I", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final /* data */ class DefaultLazyKey implements Parcelable {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;
    public static final Parcelable.Creator<DefaultLazyKey> CREATOR = new write();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public DefaultLazyKey(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        p0.writeInt(this.AudioAttributesCompatParcelizer);
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0005\u0010\t"}, d2 = {"Landroidx/compose/foundation/lazy/layout/DefaultLazyKey$write;", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "Landroid/os/Parcel;", "p0", "read", "(Landroid/os/Parcel;)Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;", "", "", "(I)[Landroidx/compose/foundation/lazy/layout/DefaultLazyKey;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements Parcelable.Creator<DefaultLazyKey> {
        write() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final DefaultLazyKey createFromParcel(Parcel p0) {
            return new DefaultLazyKey(p0.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final DefaultLazyKey[] newArray(int p0) {
            return new DefaultLazyKey[p0];
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof DefaultLazyKey) && this.AudioAttributesCompatParcelizer == ((DefaultLazyKey) p0).AudioAttributesCompatParcelizer;
    }

    public final int hashCode() {
        return Integer.hashCode(this.AudioAttributesCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DefaultLazyKey(AudioAttributesCompatParcelizer=");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
