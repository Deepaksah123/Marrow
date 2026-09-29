package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin._convert;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u000f2\u00020\u00012\u00020\u0002:\u0001\u000fB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;", "Lo/_convert;", "Landroid/os/Parcelable;", "", "p0", "<init>", "(F)V", "Landroid/os/Parcel;", "", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ParcelableSnapshotMutableFloatState extends _convert implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableFloatState> CREATOR = new IconCompatParcelizer();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ParcelableSnapshotMutableFloatState(float f) {
        super(f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        p0.writeFloat(AudioAttributesCompatParcelizer());
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState$IconCompatParcelizer;", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;", "Landroid/os/Parcel;", "p0", "RemoteActionCompatParcelizer", "(Landroid/os/Parcel;)Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;", "", "", "read", "(I)[Landroidx/compose/runtime/ParcelableSnapshotMutableFloatState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer implements Parcelable.Creator<ParcelableSnapshotMutableFloatState> {
        IconCompatParcelizer() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final ParcelableSnapshotMutableFloatState createFromParcel(Parcel p0) {
            return new ParcelableSnapshotMutableFloatState(p0.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final ParcelableSnapshotMutableFloatState[] newArray(int p0) {
            return new ParcelableSnapshotMutableFloatState[p0];
        }
    }
}
