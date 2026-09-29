package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public final class SpliceNullCommand extends SpliceCommand {
    public static final Parcelable.Creator<SpliceNullCommand> CREATOR = new Parcelable.Creator<SpliceNullCommand>() { // from class: androidx.media3.extractor.metadata.scte35.SpliceNullCommand.2
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SpliceNullCommand createFromParcel(Parcel parcel) {
            return read();
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ SpliceNullCommand[] newArray(int i) {
            return write(i);
        }

        private static SpliceNullCommand read() {
            return new SpliceNullCommand();
        }

        private static SpliceNullCommand[] write(int i) {
            return new SpliceNullCommand[i];
        }
    };

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
