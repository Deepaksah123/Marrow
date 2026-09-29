package kotlin;

import android.graphics.SurfaceTexture;
import android.media.MediaFormat;
import android.opengl.GLES20;
import android.opengl.Matrix;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.TypeSerializer1;

/* JADX INFO: loaded from: classes2.dex */
public final class ArrayBuildersShortBuilder implements getRemainingInput, ArrayBuildersDoubleBuilder {
    private SurfaceTexture MediaBrowserCompatMediaItem;
    private int MediaMetadataCompat;
    private byte[] write;
    private final AtomicBoolean RemoteActionCompatParcelizer = new AtomicBoolean();
    private final AtomicBoolean AudioAttributesImplApi21Parcelizer = new AtomicBoolean(true);
    private final BeanUtil AudioAttributesImplBaseParcelizer = new BeanUtil();
    private final ArrayBuildersIntBuilder AudioAttributesCompatParcelizer = new ArrayBuildersIntBuilder();
    private final ClassNameIdResolver<Long> AudioAttributesImplApi26Parcelizer = new ClassNameIdResolver<>();
    private final ClassNameIdResolver<ArrayBuildersLongBuilder> MediaBrowserCompatItemReceiver = new ClassNameIdResolver<>();
    private final float[] MediaBrowserCompatCustomActionResultReceiver = new float[16];
    private final float[] MediaBrowserCompatSearchResultReceiver = new float[16];
    private volatile int read = 0;
    private int IconCompatParcelizer = -1;

    public final void read(int i) {
        this.read = i;
    }

    public final SurfaceTexture read() {
        try {
            GLES20.glClearColor(0.5f, 0.5f, 0.5f, 1.0f);
            TypeSerializer1.RemoteActionCompatParcelizer();
            this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer();
            TypeSerializer1.RemoteActionCompatParcelizer();
            this.MediaMetadataCompat = TypeSerializer1.write();
        } catch (TypeSerializer1.IconCompatParcelizer e) {
            prune.read("SceneRenderer", "Failed to initialize the renderer", e);
        }
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.MediaMetadataCompat);
        this.MediaBrowserCompatMediaItem = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: o.ArrayIterator
            @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
            public final void onFrameAvailable(SurfaceTexture surfaceTexture2) {
                this.read.IconCompatParcelizer();
            }
        });
        return this.MediaBrowserCompatMediaItem;
    }

    final /* synthetic */ void IconCompatParcelizer() {
        this.RemoteActionCompatParcelizer.set(true);
    }

    public final void RemoteActionCompatParcelizer(float[] fArr) {
        GLES20.glClear(16384);
        try {
            TypeSerializer1.RemoteActionCompatParcelizer();
        } catch (TypeSerializer1.IconCompatParcelizer e) {
            prune.read("SceneRenderer", "Failed to draw a frame", e);
        }
        if (this.RemoteActionCompatParcelizer.compareAndSet(true, false)) {
            ((SurfaceTexture) buildTypeSerializer.IconCompatParcelizer(this.MediaBrowserCompatMediaItem)).updateTexImage();
            try {
                TypeSerializer1.RemoteActionCompatParcelizer();
            } catch (TypeSerializer1.IconCompatParcelizer e2) {
                prune.read("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (this.AudioAttributesImplApi21Parcelizer.compareAndSet(true, false)) {
                TypeSerializer1.IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
            }
            long timestamp = this.MediaBrowserCompatMediaItem.getTimestamp();
            Long lAudioAttributesCompatParcelizer = this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(timestamp);
            if (lAudioAttributesCompatParcelizer != null) {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, lAudioAttributesCompatParcelizer.longValue());
            }
            ArrayBuildersLongBuilder arrayBuildersLongBuilder = this.MediaBrowserCompatItemReceiver.read(timestamp);
            if (arrayBuildersLongBuilder != null) {
                this.AudioAttributesImplBaseParcelizer.read(arrayBuildersLongBuilder);
            }
        }
        Matrix.multiplyMM(this.MediaBrowserCompatSearchResultReceiver, 0, fArr, 0, this.MediaBrowserCompatCustomActionResultReceiver, 0);
        this.AudioAttributesImplBaseParcelizer.read(this.MediaMetadataCompat, this.MediaBrowserCompatSearchResultReceiver, false);
    }

    @Override // kotlin.getRemainingInput
    public final void RemoteActionCompatParcelizer(long j, long j2, C0170format c0170format, MediaFormat mediaFormat) {
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(j2, Long.valueOf(j));
        write(c0170format.onPrepareFromMediaId, c0170format.onRemoveQueueItem, j2);
    }

    @Override // kotlin.ArrayBuildersDoubleBuilder
    public final void AudioAttributesCompatParcelizer(long j, float[] fArr) {
        this.AudioAttributesCompatParcelizer.IconCompatParcelizer(j, fArr);
    }

    @Override // kotlin.ArrayBuildersDoubleBuilder
    public final void RemoteActionCompatParcelizer() {
        this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer();
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
        this.AudioAttributesImplApi21Parcelizer.set(true);
    }

    private void write(byte[] bArr, int i, long j) {
        byte[] bArr2 = this.write;
        int i2 = this.IconCompatParcelizer;
        this.write = bArr;
        if (i == -1) {
            i = this.read;
        }
        this.IconCompatParcelizer = i;
        if (i2 == i && Arrays.equals(bArr2, this.write)) {
            return;
        }
        byte[] bArr3 = this.write;
        ArrayBuildersLongBuilder arrayBuildersLongBuilderWrite = bArr3 != null ? checkUnsupportedType.write(bArr3, this.IconCompatParcelizer) : null;
        if (arrayBuildersLongBuilderWrite == null || !BeanUtil.RemoteActionCompatParcelizer(arrayBuildersLongBuilderWrite)) {
            arrayBuildersLongBuilderWrite = ArrayBuildersLongBuilder.IconCompatParcelizer(this.IconCompatParcelizer);
        }
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(j, arrayBuildersLongBuilderWrite);
    }
}
