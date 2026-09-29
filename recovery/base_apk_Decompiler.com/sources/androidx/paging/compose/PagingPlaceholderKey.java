package androidx.paging.compose;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\bHÖ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\u0007J\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016"}, d2 = {"Landroidx/paging/compose/PagingPlaceholderKey;", "Landroid/os/Parcelable;", "", "p0", "<init>", "(I)V", "describeContents", "()I", "", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "", "toString", "()Ljava/lang/String;", "Landroid/os/Parcel;", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "read", "I", "IconCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final /* data */ class PagingPlaceholderKey implements Parcelable {
    public static final Parcelable.Creator<PagingPlaceholderKey> CREATOR = new RemoteActionCompatParcelizer();

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final int IconCompatParcelizer;

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public PagingPlaceholderKey(int i) {
        this.IconCompatParcelizer = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.writeInt(this.IconCompatParcelizer);
    }

    public static final class RemoteActionCompatParcelizer implements Parcelable.Creator<PagingPlaceholderKey> {
        RemoteActionCompatParcelizer() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PagingPlaceholderKey createFromParcel(Parcel parcel) {
            return RemoteActionCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ PagingPlaceholderKey[] newArray(int i) {
            return AudioAttributesCompatParcelizer(i);
        }

        private static PagingPlaceholderKey RemoteActionCompatParcelizer(Parcel parcel) {
            toMagicModuleMetaRepoModel.write(parcel, "");
            return new PagingPlaceholderKey(parcel.readInt());
        }

        private static PagingPlaceholderKey[] AudioAttributesCompatParcelizer(int i) {
            return new PagingPlaceholderKey[i];
        }
    }

    public final boolean equals(Object p0) {
        if (this == p0) {
            return true;
        }
        return (p0 instanceof PagingPlaceholderKey) && this.IconCompatParcelizer == ((PagingPlaceholderKey) p0).IconCompatParcelizer;
    }

    public final int hashCode() {
        return Integer.hashCode(this.IconCompatParcelizer);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PagingPlaceholderKey(IconCompatParcelizer=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }
}
