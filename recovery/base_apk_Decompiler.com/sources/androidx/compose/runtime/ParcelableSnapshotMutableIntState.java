package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin._initialCharBufSize;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u000e2\u00020\u00012\u00020\u0002:\u0001\u000eB\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;", "Lo/_initialCharBufSize;", "Landroid/os/Parcelable;", "", "p0", "<init>", "(I)V", "Landroid/os/Parcel;", "p1", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ParcelableSnapshotMutableIntState extends _initialCharBufSize implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = new AudioAttributesCompatParcelizer();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ParcelableSnapshotMutableIntState(int i) {
        super(i);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        p0.writeInt(IconCompatParcelizer());
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0002\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableIntState$AudioAttributesCompatParcelizer;", "Landroid/os/Parcelable$Creator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;", "Landroid/os/Parcel;", "p0", "RemoteActionCompatParcelizer", "(Landroid/os/Parcel;)Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;", "", "", "AudioAttributesCompatParcelizer", "(I)[Landroidx/compose/runtime/ParcelableSnapshotMutableIntState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements Parcelable.Creator<ParcelableSnapshotMutableIntState> {
        AudioAttributesCompatParcelizer() {
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final ParcelableSnapshotMutableIntState createFromParcel(Parcel p0) {
            return new ParcelableSnapshotMutableIntState(p0.readInt());
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final ParcelableSnapshotMutableIntState[] newArray(int p0) {
            return new ParcelableSnapshotMutableIntState[p0];
        }
    }
}
