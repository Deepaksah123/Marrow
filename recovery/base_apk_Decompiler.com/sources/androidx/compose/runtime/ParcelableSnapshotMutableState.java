package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin._appendNumeric;
import kotlin._qbuf;
import kotlin.quoteAsUTF8;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u0000 \u0010*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u00022\u00020\u0003:\u0001\u0010B\u001d\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "T", "Lo/_appendNumeric;", "Landroid/os/Parcelable;", "p0", "Lo/quoteAsUTF8;", "p1", "<init>", "(Ljava/lang/Object;Lo/quoteAsUTF8;)V", "Landroid/os/Parcel;", "", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ParcelableSnapshotMutableState<T> extends _appendNumeric<T> implements Parcelable {
    public static final Parcelable.Creator<ParcelableSnapshotMutableState<Object>> CREATOR = new RemoteActionCompatParcelizer();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ParcelableSnapshotMutableState(T t, quoteAsUTF8<T> quoteasutf8) {
        super(t, quoteasutf8);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel p0, int p1) {
        int i;
        p0.writeValue(read());
        quoteAsUTF8<T> quoteasutf8N_ = n_();
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(quoteasutf8N_, _qbuf.AudioAttributesCompatParcelizer())) {
            i = 0;
        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(quoteasutf8N_, _qbuf.RemoteActionCompatParcelizer())) {
            i = 1;
        } else {
            if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(quoteasutf8N_, _qbuf.read())) {
                throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
            }
            i = 2;
        }
        p0.writeInt(i);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\u0010\u0011\n\u0002\b\u0002\b\n\u0018\u00002\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00020\u0001J)\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ'\u0010\u000e\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u00020\r2\u0006\u0010\u0005\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f"}, d2 = {"Landroidx/compose/runtime/ParcelableSnapshotMutableState$RemoteActionCompatParcelizer;", "Landroid/os/Parcelable$ClassLoaderCreator;", "Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "", "Landroid/os/Parcel;", "p0", "Ljava/lang/ClassLoader;", "p1", "AudioAttributesCompatParcelizer", "(Landroid/os/Parcel;Ljava/lang/ClassLoader;)Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "write", "(Landroid/os/Parcel;)Landroidx/compose/runtime/ParcelableSnapshotMutableState;", "", "", "RemoteActionCompatParcelizer", "(I)[Landroidx/compose/runtime/ParcelableSnapshotMutableState;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements Parcelable.ClassLoaderCreator<ParcelableSnapshotMutableState<Object>> {
        RemoteActionCompatParcelizer() {
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final ParcelableSnapshotMutableState<Object> createFromParcel(Parcel p0, ClassLoader p1) {
            quoteAsUTF8 quoteasutf8AudioAttributesCompatParcelizer;
            if (p1 == null) {
                p1 = getClass().getClassLoader();
            }
            Object value = p0.readValue(p1);
            int i = p0.readInt();
            if (i == 0) {
                quoteasutf8AudioAttributesCompatParcelizer = _qbuf.AudioAttributesCompatParcelizer();
            } else if (i == 1) {
                quoteasutf8AudioAttributesCompatParcelizer = _qbuf.RemoteActionCompatParcelizer();
            } else if (i == 2) {
                quoteasutf8AudioAttributesCompatParcelizer = _qbuf.read();
            } else {
                StringBuilder sb = new StringBuilder("Unsupported MutableState policy ");
                sb.append(i);
                sb.append(" was restored");
                throw new IllegalStateException(sb.toString());
            }
            return new ParcelableSnapshotMutableState<>(value, quoteasutf8AudioAttributesCompatParcelizer);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final ParcelableSnapshotMutableState<Object> createFromParcel(Parcel p0) {
            return createFromParcel(p0, null);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final ParcelableSnapshotMutableState<Object>[] newArray(int p0) {
            return new ParcelableSnapshotMutableState[p0];
        }
    }
}
