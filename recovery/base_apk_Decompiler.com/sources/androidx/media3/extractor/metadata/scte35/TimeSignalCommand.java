package androidx.media3.extractor.metadata.scte35;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.exoplayer2.C;
import kotlin.AsPropertyTypeDeserializer;
import kotlin.MinimalClassNameIdResolver;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes2.dex */
public final class TimeSignalCommand extends SpliceCommand {
    public static final Parcelable.Creator<TimeSignalCommand> CREATOR = new Parcelable.Creator<TimeSignalCommand>() { // from class: androidx.media3.extractor.metadata.scte35.TimeSignalCommand.3
        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TimeSignalCommand createFromParcel(Parcel parcel) {
            return IconCompatParcelizer(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ TimeSignalCommand[] newArray(int i) {
            return RemoteActionCompatParcelizer(i);
        }

        private static TimeSignalCommand IconCompatParcelizer(Parcel parcel) {
            return new TimeSignalCommand(parcel.readLong(), parcel.readLong(), (byte) 0);
        }

        private static TimeSignalCommand[] RemoteActionCompatParcelizer(int i) {
            return new TimeSignalCommand[i];
        }
    };
    public final long AudioAttributesCompatParcelizer;
    public final long write;

    /* synthetic */ TimeSignalCommand(long j, long j2, byte b) {
        this(j, j2);
    }

    private TimeSignalCommand(long j, long j2) {
        this.write = j;
        this.AudioAttributesCompatParcelizer = j2;
    }

    public static TimeSignalCommand IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, long j, MinimalClassNameIdResolver minimalClassNameIdResolver) {
        long jAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(asPropertyTypeDeserializer, j);
        return new TimeSignalCommand(jAudioAttributesCompatParcelizer, minimalClassNameIdResolver.write(jAudioAttributesCompatParcelizer));
    }

    static long AudioAttributesCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, long j) {
        long jOnPlayFromMediaId = asPropertyTypeDeserializer.onPlayFromMediaId();
        return (128 & jOnPlayFromMediaId) != 0 ? TarConstants.MAXSIZE & ((((jOnPlayFromMediaId & 1) << 32) | asPropertyTypeDeserializer.onMediaButtonEvent()) + j) : C.TIME_UNSET;
    }

    @Override // androidx.media3.extractor.metadata.scte35.SpliceCommand
    public final String toString() {
        StringBuilder sb = new StringBuilder("SCTE-35 TimeSignalCommand { ptsTime=");
        sb.append(this.write);
        sb.append(", playbackPositionUs= ");
        sb.append(this.AudioAttributesCompatParcelizer);
        sb.append(" }");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.write);
        parcel.writeLong(this.AudioAttributesCompatParcelizer);
    }
}
