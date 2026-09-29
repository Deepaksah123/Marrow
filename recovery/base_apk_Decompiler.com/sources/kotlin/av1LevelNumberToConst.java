package kotlin;

import com.google.firebase.perf.metrics.Counter;
import com.google.firebase.perf.metrics.Trace;
import com.google.firebase.perf.session.PerfSession;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.MetadataInputBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class av1LevelNumberToConst {
    private final Trace write;

    public av1LevelNumberToConst(Trace trace) {
        this.write = trace;
    }

    public final MetadataInputBuffer read() {
        MetadataInputBuffer.RemoteActionCompatParcelizer remoteActionCompatParcelizer = MetadataInputBuffer.read().read(this.write.MediaBrowserCompatItemReceiver()).IconCompatParcelizer(this.write.AudioAttributesImplBaseParcelizer().write()).read(this.write.AudioAttributesImplBaseParcelizer().write(this.write.MediaBrowserCompatCustomActionResultReceiver()));
        for (Counter counter : this.write.AudioAttributesImplApi21Parcelizer().values()) {
            remoteActionCompatParcelizer.RemoteActionCompatParcelizer(counter.read(), counter.write());
        }
        List<Trace> listMediaMetadataCompat = this.write.MediaMetadataCompat();
        if (!listMediaMetadataCompat.isEmpty()) {
            Iterator<Trace> it = listMediaMetadataCompat.iterator();
            while (it.hasNext()) {
                remoteActionCompatParcelizer.write(new av1LevelNumberToConst(it.next()).read());
            }
        }
        remoteActionCompatParcelizer.IconCompatParcelizer(this.write.RemoteActionCompatParcelizer());
        MetadataDecoderFactory[] metadataDecoderFactoryArrIconCompatParcelizer = PerfSession.IconCompatParcelizer(this.write.AudioAttributesImplApi26Parcelizer());
        if (metadataDecoderFactoryArrIconCompatParcelizer != null) {
            remoteActionCompatParcelizer.write(Arrays.asList(metadataDecoderFactoryArrIconCompatParcelizer));
        }
        return remoteActionCompatParcelizer.MediaBrowserCompatMediaItem();
    }
}
