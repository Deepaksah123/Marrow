package kotlin;

import android.location.Location;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public final class AudioProcessorUnhandledAudioFormatException {
    public final Location AudioAttributesCompatParcelizer;
    public final boolean IconCompatParcelizer;
    public final List RemoteActionCompatParcelizer;
    public final queueInputBuffer read;
    public final long write;

    public AudioProcessorUnhandledAudioFormatException(Location location, boolean z, List list, long j, queueInputBuffer queueinputbuffer) {
        this.AudioAttributesCompatParcelizer = location;
        this.IconCompatParcelizer = z;
        this.RemoteActionCompatParcelizer = list;
        this.write = j;
        this.read = queueinputbuffer;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AudioProcessorUnhandledAudioFormatException)) {
            return false;
        }
        AudioProcessorUnhandledAudioFormatException audioProcessorUnhandledAudioFormatException = (AudioProcessorUnhandledAudioFormatException) obj;
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, audioProcessorUnhandledAudioFormatException.AudioAttributesCompatParcelizer) && this.IconCompatParcelizer == audioProcessorUnhandledAudioFormatException.IconCompatParcelizer && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, audioProcessorUnhandledAudioFormatException.RemoteActionCompatParcelizer) && this.write == audioProcessorUnhandledAudioFormatException.write && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.read, audioProcessorUnhandledAudioFormatException.read);
    }

    public final int hashCode() {
        Location location = this.AudioAttributesCompatParcelizer;
        int iHashCode = location == null ? 0 : location.hashCode();
        int iHashCode2 = Boolean.hashCode(this.IconCompatParcelizer);
        return this.read.hashCode() + ((Long.hashCode(this.write) + ((this.RemoteActionCompatParcelizer.hashCode() + ((iHashCode2 + (iHashCode * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "";
    }
}
