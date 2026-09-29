package kotlin;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import androidx.media3.common.Metadata;
import com.google.android.exoplayer2.C;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import kotlin.StdKeySerializers;

/* JADX INFO: loaded from: classes2.dex */
public final class NumberSerializerBigDecimalAsStringSerializer extends findCollectionSerializer implements Handler.Callback {
    private final _enumDefault AudioAttributesCompatParcelizer;
    private boolean AudioAttributesImplApi21Parcelizer;
    private androidx.media3.common.Metadata AudioAttributesImplApi26Parcelizer;
    private long AudioAttributesImplBaseParcelizer;
    private final valueToString IconCompatParcelizer;
    private final Handler MediaBrowserCompatCustomActionResultReceiver;
    private final boolean MediaBrowserCompatItemReceiver;
    private long MediaBrowserCompatSearchResultReceiver;
    private boolean RemoteActionCompatParcelizer;
    private final NumberSerializer1 read;
    private _enumConstants write;

    @Override // kotlin.buildIndexedListSerializer
    public final boolean onRemoveQueueItem() {
        return true;
    }

    public NumberSerializerBigDecimalAsStringSerializer(valueToString valuetostring, Looper looper) {
        this(valuetostring, looper, NumberSerializer1.AudioAttributesCompatParcelizer);
    }

    private NumberSerializerBigDecimalAsStringSerializer(valueToString valuetostring, Looper looper, NumberSerializer1 numberSerializer1) {
        this(valuetostring, looper, numberSerializer1, (byte) 0);
    }

    private NumberSerializerBigDecimalAsStringSerializer(valueToString valuetostring, Looper looper, NumberSerializer1 numberSerializer1, byte b) {
        super(5);
        this.IconCompatParcelizer = (valueToString) buildTypeSerializer.IconCompatParcelizer(valuetostring);
        this.MediaBrowserCompatCustomActionResultReceiver = looper == null ? null : LaissezFaireSubTypeValidator.write(looper, this);
        this.read = (NumberSerializer1) buildTypeSerializer.IconCompatParcelizer(numberSerializer1);
        this.MediaBrowserCompatItemReceiver = false;
        this.AudioAttributesCompatParcelizer = new _enumDefault();
        this.AudioAttributesImplBaseParcelizer = C.TIME_UNSET;
    }

    @Override // kotlin.buildIndexedListSerializer, kotlin.buildIterableSerializer
    public final String onSeekTo() {
        return "MetadataRenderer";
    }

    @Override // kotlin.buildIterableSerializer
    public final int read(C0170format c0170format) {
        if (this.read.IconCompatParcelizer(c0170format)) {
            return buildIterableSerializer.AudioAttributesCompatParcelizer(c0170format.MediaBrowserCompatCustomActionResultReceiver == 0 ? 4 : 2);
        }
        return buildIterableSerializer.AudioAttributesCompatParcelizer(0);
    }

    @Override // kotlin.findCollectionSerializer
    public final void read(C0170format[] c0170formatArr, long j, long j2, StdKeySerializers.write writeVar) {
        this.write = this.read.read(c0170formatArr[0]);
        androidx.media3.common.Metadata metadata = this.AudioAttributesImplApi26Parcelizer;
        if (metadata != null) {
            this.AudioAttributesImplApi26Parcelizer = metadata.AudioAttributesCompatParcelizer((metadata.write + this.AudioAttributesImplBaseParcelizer) - j2);
        }
        this.AudioAttributesImplBaseParcelizer = j2;
    }

    @Override // kotlin.findCollectionSerializer
    public final void read(long j, boolean z) {
        this.AudioAttributesImplApi26Parcelizer = null;
        this.RemoteActionCompatParcelizer = false;
        this.AudioAttributesImplApi21Parcelizer = false;
    }

    @Override // kotlin.buildIndexedListSerializer
    public final void IconCompatParcelizer(long j, long j2) {
        boolean z = true;
        while (z) {
            onPrepareFromUri();
            z = read(j);
        }
    }

    private void read(androidx.media3.common.Metadata metadata, List<Metadata.Entry> list) {
        for (int i = 0; i < metadata.write(); i++) {
            C0170format c0170format = metadata.IconCompatParcelizer(i).read();
            if (c0170format != null && this.read.IconCompatParcelizer(c0170format)) {
                _enumConstants _enumconstants = this.read.read(c0170format);
                byte[] bArr = (byte[]) buildTypeSerializer.IconCompatParcelizer(metadata.IconCompatParcelizer(i).RemoteActionCompatParcelizer());
                this.AudioAttributesCompatParcelizer.write();
                this.AudioAttributesCompatParcelizer.read(bArr.length);
                ((ByteBuffer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesCompatParcelizer.read)).put(bArr);
                this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
                androidx.media3.common.Metadata metadataWrite = _enumconstants.write(this.AudioAttributesCompatParcelizer);
                if (metadataWrite != null) {
                    read(metadataWrite, list);
                }
            } else {
                list.add(metadata.IconCompatParcelizer(i));
            }
        }
    }

    @Override // kotlin.findCollectionSerializer
    public final void handleMediaPlayPauseIfPendingOnHandler() {
        this.AudioAttributesImplApi26Parcelizer = null;
        this.write = null;
        this.AudioAttributesImplBaseParcelizer = C.TIME_UNSET;
    }

    @Override // kotlin.buildIndexedListSerializer
    public final boolean onRemoveQueueItemAt() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            AudioAttributesCompatParcelizer((androidx.media3.common.Metadata) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    private void onPrepareFromUri() {
        if (this.RemoteActionCompatParcelizer || this.AudioAttributesImplApi26Parcelizer != null) {
            return;
        }
        this.AudioAttributesCompatParcelizer.write();
        ObjectNode objectNodeMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        int i = read(objectNodeMediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesCompatParcelizer, 0);
        if (i != -4) {
            if (i == -5) {
                this.MediaBrowserCompatSearchResultReceiver = ((C0170format) buildTypeSerializer.IconCompatParcelizer(objectNodeMediaBrowserCompatCustomActionResultReceiver.write)).onSeekTo;
                return;
            }
            return;
        }
        if (this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer()) {
            this.RemoteActionCompatParcelizer = true;
            return;
        }
        if (this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer >= AudioAttributesImplApi26Parcelizer()) {
            this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver = this.MediaBrowserCompatSearchResultReceiver;
            this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
            androidx.media3.common.Metadata metadataWrite = ((_enumConstants) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.write)).write(this.AudioAttributesCompatParcelizer);
            if (metadataWrite != null) {
                ArrayList arrayList = new ArrayList(metadataWrite.write());
                read(metadataWrite, arrayList);
                if (arrayList.isEmpty()) {
                    return;
                }
                this.AudioAttributesImplApi26Parcelizer = new androidx.media3.common.Metadata(AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer), arrayList);
            }
        }
    }

    private boolean read(long j) {
        boolean z;
        androidx.media3.common.Metadata metadata = this.AudioAttributesImplApi26Parcelizer;
        if (metadata == null || (!this.MediaBrowserCompatItemReceiver && metadata.write > AudioAttributesCompatParcelizer(j))) {
            z = false;
        } else {
            read(this.AudioAttributesImplApi26Parcelizer);
            this.AudioAttributesImplApi26Parcelizer = null;
            z = true;
        }
        if (this.RemoteActionCompatParcelizer && this.AudioAttributesImplApi26Parcelizer == null) {
            this.AudioAttributesImplApi21Parcelizer = true;
        }
        return z;
    }

    private void read(androidx.media3.common.Metadata metadata) {
        Handler handler = this.MediaBrowserCompatCustomActionResultReceiver;
        if (handler != null) {
            handler.obtainMessage(1, metadata).sendToTarget();
        } else {
            AudioAttributesCompatParcelizer(metadata);
        }
    }

    private void AudioAttributesCompatParcelizer(androidx.media3.common.Metadata metadata) {
        this.IconCompatParcelizer.write(metadata);
    }

    private long AudioAttributesCompatParcelizer(long j) {
        buildTypeSerializer.write(j != C.TIME_UNSET);
        buildTypeSerializer.write(this.AudioAttributesImplBaseParcelizer != C.TIME_UNSET);
        return j - this.AudioAttributesImplBaseParcelizer;
    }
}
