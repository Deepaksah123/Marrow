package kotlin;

import android.os.Handler;
import android.os.Message;
import androidx.media3.extractor.metadata.emsg.EventMessage;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import kotlin.nonNullString;

/* JADX INFO: loaded from: classes2.dex */
public final class AttributePropertyWriter implements Handler.Callback {
    private final _findWellKnownSimple AudioAttributesCompatParcelizer;
    private final IconCompatParcelizer AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private FilteredBeanPropertyWriterMultiView MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private boolean RemoteActionCompatParcelizer;
    private long read;
    private final TreeMap<Long, Long> AudioAttributesImplApi26Parcelizer = new TreeMap<>();
    private final Handler write = LaissezFaireSubTypeValidator.read(this);
    private final constructLookup IconCompatParcelizer = new constructLookup();

    public interface IconCompatParcelizer {
        void write();

        void write(long j);
    }

    public AttributePropertyWriter(FilteredBeanPropertyWriterMultiView filteredBeanPropertyWriterMultiView, IconCompatParcelizer iconCompatParcelizer, _findWellKnownSimple _findwellknownsimple) {
        this.MediaBrowserCompatCustomActionResultReceiver = filteredBeanPropertyWriterMultiView;
        this.AudioAttributesImplApi21Parcelizer = iconCompatParcelizer;
        this.AudioAttributesCompatParcelizer = _findwellknownsimple;
    }

    public final void RemoteActionCompatParcelizer(FilteredBeanPropertyWriterMultiView filteredBeanPropertyWriterMultiView) {
        this.AudioAttributesImplBaseParcelizer = false;
        this.read = C.TIME_UNSET;
        this.MediaBrowserCompatCustomActionResultReceiver = filteredBeanPropertyWriterMultiView;
        AudioAttributesImplApi26Parcelizer();
    }

    public final write IconCompatParcelizer() {
        return new write(this.AudioAttributesCompatParcelizer);
    }

    public final void AudioAttributesCompatParcelizer() {
        this.MediaBrowserCompatItemReceiver = true;
        this.write.removeCallbacksAndMessages(null);
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (this.MediaBrowserCompatItemReceiver) {
            return true;
        }
        if (message.what != 1) {
            return false;
        }
        RemoteActionCompatParcelizer remoteActionCompatParcelizer = (RemoteActionCompatParcelizer) message.obj;
        AudioAttributesCompatParcelizer(remoteActionCompatParcelizer.read, remoteActionCompatParcelizer.RemoteActionCompatParcelizer);
        return true;
    }

    final boolean RemoteActionCompatParcelizer(long j) {
        boolean z = false;
        if (!this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer) {
            return false;
        }
        if (this.AudioAttributesImplBaseParcelizer) {
            return true;
        }
        Map.Entry<Long, Long> entryAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer);
        if (entryAudioAttributesCompatParcelizer != null && entryAudioAttributesCompatParcelizer.getValue().longValue() < j) {
            this.read = entryAudioAttributesCompatParcelizer.getKey().longValue();
            RemoteActionCompatParcelizer();
            z = true;
        }
        if (z) {
            write();
        }
        return z;
    }

    final void read() {
        this.RemoteActionCompatParcelizer = true;
    }

    final boolean write(boolean z) {
        if (!this.MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer) {
            return false;
        }
        if (this.AudioAttributesImplBaseParcelizer) {
            return true;
        }
        if (!z) {
            return false;
        }
        write();
        return true;
    }

    private void AudioAttributesCompatParcelizer(long j, long j2) {
        Long l = this.AudioAttributesImplApi26Parcelizer.get(Long.valueOf(j2));
        if (l == null) {
            this.AudioAttributesImplApi26Parcelizer.put(Long.valueOf(j2), Long.valueOf(j));
        } else if (l.longValue() > j) {
            this.AudioAttributesImplApi26Parcelizer.put(Long.valueOf(j2), Long.valueOf(j));
        }
    }

    private Map.Entry<Long, Long> AudioAttributesCompatParcelizer(long j) {
        return this.AudioAttributesImplApi26Parcelizer.ceilingEntry(Long.valueOf(j));
    }

    private void AudioAttributesImplApi26Parcelizer() {
        Iterator<Map.Entry<Long, Long>> it = this.AudioAttributesImplApi26Parcelizer.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getKey().longValue() < this.MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer) {
                it.remove();
            }
        }
    }

    private void RemoteActionCompatParcelizer() {
        this.AudioAttributesImplApi21Parcelizer.write(this.read);
    }

    private void write() {
        if (this.RemoteActionCompatParcelizer) {
            this.AudioAttributesImplBaseParcelizer = true;
            this.RemoteActionCompatParcelizer = false;
            this.AudioAttributesImplApi21Parcelizer.write();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long RemoteActionCompatParcelizer(EventMessage eventMessage) {
        try {
            return LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(eventMessage.write));
        } catch (SchemaAware unused) {
            return C.TIME_UNSET;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean AudioAttributesCompatParcelizer(String str, String str2) {
        if ("urn:mpeg:dash:event:2012".equals(str)) {
            return IcyHeaders.REQUEST_HEADER_ENABLE_METADATA_VALUE.equals(str2) || "2".equals(str2) || "3".equals(str2);
        }
        return false;
    }

    public final class write implements nonNullString {
        private final visitIntFormat read;
        private final ObjectNode write = new ObjectNode();
        private final _enumDefault AudioAttributesCompatParcelizer = new _enumDefault();
        private long IconCompatParcelizer = C.TIME_UNSET;

        write(_findWellKnownSimple _findwellknownsimple) {
            this.read = visitIntFormat.write(_findwellknownsimple);
        }

        @Override // kotlin.nonNullString
        public final void write(C0170format c0170format) {
            this.read.write(c0170format);
        }

        @Override // kotlin.nonNullString
        public final int AudioAttributesCompatParcelizer(JsonNullFormatVisitor jsonNullFormatVisitor, int i, boolean z, int i2) throws IOException {
            return this.read.AudioAttributesCompatParcelizer(jsonNullFormatVisitor, i, z);
        }

        @Override // kotlin.nonNullString
        public final void IconCompatParcelizer(AsPropertyTypeDeserializer asPropertyTypeDeserializer, int i, int i2) {
            this.read.RemoteActionCompatParcelizer(asPropertyTypeDeserializer, i);
        }

        @Override // kotlin.nonNullString
        public final void IconCompatParcelizer(long j, int i, int i2, int i3, nonNullString.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
            this.read.IconCompatParcelizer(j, i, i2, i3, audioAttributesCompatParcelizer);
            RemoteActionCompatParcelizer();
        }

        public final boolean RemoteActionCompatParcelizer(long j) {
            return AttributePropertyWriter.this.RemoteActionCompatParcelizer(j);
        }

        public final void RemoteActionCompatParcelizer(CollectionLikeType collectionLikeType) {
            if (this.IconCompatParcelizer == C.TIME_UNSET || collectionLikeType.AudioAttributesImplApi21Parcelizer > this.IconCompatParcelizer) {
                this.IconCompatParcelizer = collectionLikeType.AudioAttributesImplApi21Parcelizer;
            }
            AttributePropertyWriter.this.read();
        }

        public final boolean write(CollectionLikeType collectionLikeType) {
            long j = this.IconCompatParcelizer;
            return AttributePropertyWriter.this.write(j != C.TIME_UNSET && j < collectionLikeType.MediaBrowserCompatItemReceiver);
        }

        public final void read() {
            this.read.onAddQueueItem();
        }

        private void RemoteActionCompatParcelizer() {
            while (this.read.write(false)) {
                _enumDefault _enumdefaultIconCompatParcelizer = IconCompatParcelizer();
                if (_enumdefaultIconCompatParcelizer != null) {
                    long j = _enumdefaultIconCompatParcelizer.RemoteActionCompatParcelizer;
                    androidx.media3.common.Metadata metadataWrite = AttributePropertyWriter.this.IconCompatParcelizer.write(_enumdefaultIconCompatParcelizer);
                    if (metadataWrite != null) {
                        EventMessage eventMessage = (EventMessage) metadataWrite.IconCompatParcelizer(0);
                        if (AttributePropertyWriter.AudioAttributesCompatParcelizer(eventMessage.AudioAttributesCompatParcelizer, eventMessage.RemoteActionCompatParcelizer)) {
                            write(j, eventMessage);
                        }
                    }
                }
            }
            this.read.RemoteActionCompatParcelizer();
        }

        private _enumDefault IconCompatParcelizer() {
            this.AudioAttributesCompatParcelizer.write();
            if (this.read.read(this.write, (_find) this.AudioAttributesCompatParcelizer, 0, false) != -4) {
                return null;
            }
            this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
            return this.AudioAttributesCompatParcelizer;
        }

        private void write(long j, EventMessage eventMessage) {
            long jRemoteActionCompatParcelizer = AttributePropertyWriter.RemoteActionCompatParcelizer(eventMessage);
            if (jRemoteActionCompatParcelizer == C.TIME_UNSET) {
                return;
            }
            AudioAttributesCompatParcelizer(j, jRemoteActionCompatParcelizer);
        }

        private void AudioAttributesCompatParcelizer(long j, long j2) {
            AttributePropertyWriter.this.write.sendMessage(AttributePropertyWriter.this.write.obtainMessage(1, new RemoteActionCompatParcelizer(j, j2)));
        }
    }

    static final class RemoteActionCompatParcelizer {
        public final long RemoteActionCompatParcelizer;
        public final long read;

        public RemoteActionCompatParcelizer(long j, long j2) {
            this.read = j;
            this.RemoteActionCompatParcelizer = j2;
        }
    }
}
