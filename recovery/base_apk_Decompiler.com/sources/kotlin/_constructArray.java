package kotlin;

import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import kotlin.StdKeySerializers;

/* JADX INFO: loaded from: classes2.dex */
public final class _constructArray extends findCollectionSerializer {
    private ArrayBuildersDoubleBuilder AudioAttributesCompatParcelizer;
    private long IconCompatParcelizer;
    private long RemoteActionCompatParcelizer;
    private final _find read;
    private final AsPropertyTypeDeserializer write;

    @Override // kotlin.buildIndexedListSerializer
    public final boolean onRemoveQueueItem() {
        return true;
    }

    public _constructArray() {
        super(6);
        this.read = new _find(1);
        this.write = new AsPropertyTypeDeserializer();
    }

    @Override // kotlin.buildIndexedListSerializer, kotlin.buildIterableSerializer
    public final String onSeekTo() {
        return "CameraMotionRenderer";
    }

    @Override // kotlin.buildIterableSerializer
    public final int read(C0170format c0170format) {
        if (MimeTypes.APPLICATION_CAMERA_MOTION.equals(c0170format.onPlayFromUri)) {
            return buildIterableSerializer.AudioAttributesCompatParcelizer(4);
        }
        return buildIterableSerializer.AudioAttributesCompatParcelizer(0);
    }

    @Override // kotlin.findCollectionSerializer, o.buildMapEntrySerializer.write
    public final void AudioAttributesCompatParcelizer(int i, Object obj) throws addNull {
        if (i == 8) {
            this.AudioAttributesCompatParcelizer = (ArrayBuildersDoubleBuilder) obj;
        } else {
            super.AudioAttributesCompatParcelizer(i, obj);
        }
    }

    @Override // kotlin.findCollectionSerializer
    public final void read(C0170format[] c0170formatArr, long j, long j2, StdKeySerializers.write writeVar) {
        this.RemoteActionCompatParcelizer = j2;
    }

    @Override // kotlin.findCollectionSerializer
    public final void read(long j, boolean z) {
        this.IconCompatParcelizer = Long.MIN_VALUE;
        onPrepareFromUri();
    }

    @Override // kotlin.findCollectionSerializer
    public final void handleMediaPlayPauseIfPendingOnHandler() {
        onPrepareFromUri();
    }

    @Override // kotlin.buildIndexedListSerializer
    public final void IconCompatParcelizer(long j, long j2) {
        while (!MediaMetadataCompat() && this.IconCompatParcelizer < 100000 + j) {
            this.read.write();
            if (read(MediaBrowserCompatCustomActionResultReceiver(), this.read, 0) != -4 || this.read.AudioAttributesCompatParcelizer()) {
                return;
            }
            long j3 = this.read.RemoteActionCompatParcelizer;
            this.IconCompatParcelizer = j3;
            boolean z = j3 < AudioAttributesImplApi26Parcelizer();
            if (this.AudioAttributesCompatParcelizer != null && !z) {
                this.read.AudioAttributesImplApi21Parcelizer();
                float[] fArrRemoteActionCompatParcelizer = RemoteActionCompatParcelizer((ByteBuffer) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.read.read));
                if (fArrRemoteActionCompatParcelizer != null) {
                    ((ArrayBuildersDoubleBuilder) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.AudioAttributesCompatParcelizer)).AudioAttributesCompatParcelizer(this.IconCompatParcelizer - this.RemoteActionCompatParcelizer, fArrRemoteActionCompatParcelizer);
                }
            }
        }
    }

    @Override // kotlin.buildIndexedListSerializer
    public final boolean onRemoveQueueItemAt() {
        return MediaMetadataCompat();
    }

    private float[] RemoteActionCompatParcelizer(ByteBuffer byteBuffer) {
        if (byteBuffer.remaining() != 16) {
            return null;
        }
        this.write.IconCompatParcelizer(byteBuffer.array(), byteBuffer.limit());
        this.write.MediaBrowserCompatCustomActionResultReceiver(byteBuffer.arrayOffset() + 4);
        float[] fArr = new float[3];
        for (int i = 0; i < 3; i++) {
            fArr[i] = Float.intBitsToFloat(this.write.MediaMetadataCompat());
        }
        return fArr;
    }

    private void onPrepareFromUri() {
        ArrayBuildersDoubleBuilder arrayBuildersDoubleBuilder = this.AudioAttributesCompatParcelizer;
        if (arrayBuildersDoubleBuilder != null) {
            arrayBuildersDoubleBuilder.RemoteActionCompatParcelizer();
        }
    }
}
