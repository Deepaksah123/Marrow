package kotlin;

import android.os.SystemClock;
import com.google.android.exoplayer2.C;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.JsonSerializableSchema;

/* JADX INFO: loaded from: classes2.dex */
public final class findMapSerializer implements _childrenEqual {
    private long AudioAttributesCompatParcelizer;
    private long AudioAttributesImplApi21Parcelizer;
    private long AudioAttributesImplApi26Parcelizer;
    private long AudioAttributesImplBaseParcelizer;
    private long IconCompatParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private final long MediaBrowserCompatItemReceiver;
    private final float MediaBrowserCompatMediaItem;
    private final long MediaBrowserCompatSearchResultReceiver;
    private float MediaDescriptionCompat;
    private long MediaMetadataCompat;
    private final float RatingCompat;
    private final float RemoteActionCompatParcelizer;
    private long handleMediaPlayPauseIfPendingOnHandler;
    private long onAddQueueItem;
    private final long onCommand;
    private long onCustomAction;
    private final float read;
    private float write;

    private static long IconCompatParcelizer(long j, long j2, float f) {
        return (long) ((j * f) + ((1.0f - f) * j2));
    }

    /* synthetic */ findMapSerializer(float f, float f2, long j, float f3, long j2, long j3, float f4, byte b) {
        this(f, f2, j, f3, j2, j3, f4);
    }

    public static final class RemoteActionCompatParcelizer {
        private float write = 0.97f;
        private float read = 1.03f;
        private long IconCompatParcelizer = 1000;
        private float MediaBrowserCompatItemReceiver = 1.0E-7f;
        private long RemoteActionCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(20L);
        private long AudioAttributesImplBaseParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(500L);
        private float AudioAttributesCompatParcelizer = 0.999f;

        public final findMapSerializer write() {
            return new findMapSerializer(this.write, this.read, this.IconCompatParcelizer, this.MediaBrowserCompatItemReceiver, this.RemoteActionCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.AudioAttributesCompatParcelizer, (byte) 0);
        }
    }

    private findMapSerializer(float f, float f2, long j, float f3, long j2, long j3, float f4) {
        this.RemoteActionCompatParcelizer = f;
        this.read = f2;
        this.MediaBrowserCompatSearchResultReceiver = j;
        this.RatingCompat = f3;
        this.MediaBrowserCompatItemReceiver = j2;
        this.onCommand = j3;
        this.MediaBrowserCompatMediaItem = f4;
        this.AudioAttributesImplApi21Parcelizer = C.TIME_UNSET;
        this.onCustomAction = C.TIME_UNSET;
        this.MediaMetadataCompat = C.TIME_UNSET;
        this.AudioAttributesImplApi26Parcelizer = C.TIME_UNSET;
        this.MediaDescriptionCompat = f;
        this.MediaBrowserCompatCustomActionResultReceiver = f2;
        this.write = 1.0f;
        this.AudioAttributesImplBaseParcelizer = C.TIME_UNSET;
        this.AudioAttributesCompatParcelizer = C.TIME_UNSET;
        this.IconCompatParcelizer = C.TIME_UNSET;
        this.handleMediaPlayPauseIfPendingOnHandler = C.TIME_UNSET;
        this.onAddQueueItem = C.TIME_UNSET;
    }

    @Override // kotlin._childrenEqual
    public final void write(JsonSerializableSchema.AudioAttributesImplApi26Parcelizer audioAttributesImplApi26Parcelizer) {
        float f;
        float f2;
        this.AudioAttributesImplApi21Parcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(audioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer);
        this.MediaMetadataCompat = LaissezFaireSubTypeValidator.IconCompatParcelizer(audioAttributesImplApi26Parcelizer.IconCompatParcelizer);
        this.AudioAttributesImplApi26Parcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(audioAttributesImplApi26Parcelizer.read);
        if (audioAttributesImplApi26Parcelizer.write != -3.4028235E38f) {
            f = audioAttributesImplApi26Parcelizer.write;
        } else {
            f = this.RemoteActionCompatParcelizer;
        }
        this.MediaDescriptionCompat = f;
        if (audioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer != -3.4028235E38f) {
            f2 = audioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer;
        } else {
            f2 = this.read;
        }
        this.MediaBrowserCompatCustomActionResultReceiver = f2;
        if (this.MediaDescriptionCompat == 1.0f && f2 == 1.0f) {
            this.AudioAttributesImplApi21Parcelizer = C.TIME_UNSET;
        }
        IconCompatParcelizer();
    }

    @Override // kotlin._childrenEqual
    public final void AudioAttributesCompatParcelizer(long j) {
        this.onCustomAction = j;
        IconCompatParcelizer();
    }

    @Override // kotlin._childrenEqual
    public final void AudioAttributesCompatParcelizer() {
        long j = this.IconCompatParcelizer;
        if (j == C.TIME_UNSET) {
            return;
        }
        long j2 = j + this.onCommand;
        this.IconCompatParcelizer = j2;
        long j3 = this.AudioAttributesImplApi26Parcelizer;
        if (j3 != C.TIME_UNSET && j2 > j3) {
            this.IconCompatParcelizer = j3;
        }
        this.AudioAttributesImplBaseParcelizer = C.TIME_UNSET;
    }

    @Override // kotlin._childrenEqual
    public final float read(long j, long j2) {
        if (this.AudioAttributesImplApi21Parcelizer == C.TIME_UNSET) {
            return 1.0f;
        }
        write(j, j2);
        if (this.AudioAttributesImplBaseParcelizer != C.TIME_UNSET && SystemClock.elapsedRealtime() - this.AudioAttributesImplBaseParcelizer < this.MediaBrowserCompatSearchResultReceiver) {
            return this.write;
        }
        this.AudioAttributesImplBaseParcelizer = SystemClock.elapsedRealtime();
        read(j);
        long j3 = j - this.IconCompatParcelizer;
        if (Math.abs(j3) < this.MediaBrowserCompatItemReceiver) {
            this.write = 1.0f;
        } else {
            this.write = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer((this.RatingCompat * j3) + 1.0f, this.MediaDescriptionCompat, this.MediaBrowserCompatCustomActionResultReceiver);
        }
        return this.write;
    }

    @Override // kotlin._childrenEqual
    public final long read() {
        return this.IconCompatParcelizer;
    }

    private void IconCompatParcelizer() {
        long j;
        long j2 = this.AudioAttributesImplApi21Parcelizer;
        if (j2 != C.TIME_UNSET) {
            j = this.onCustomAction;
            if (j == C.TIME_UNSET) {
                long j3 = this.MediaMetadataCompat;
                if (j3 != C.TIME_UNSET && j2 < j3) {
                    j2 = j3;
                }
                j = this.AudioAttributesImplApi26Parcelizer;
                if (j == C.TIME_UNSET || j2 <= j) {
                    j = j2;
                }
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.AudioAttributesCompatParcelizer == j) {
            return;
        }
        this.AudioAttributesCompatParcelizer = j;
        this.IconCompatParcelizer = j;
        this.handleMediaPlayPauseIfPendingOnHandler = C.TIME_UNSET;
        this.onAddQueueItem = C.TIME_UNSET;
        this.AudioAttributesImplBaseParcelizer = C.TIME_UNSET;
    }

    private void write(long j, long j2) {
        long j3 = j - j2;
        long j4 = this.handleMediaPlayPauseIfPendingOnHandler;
        if (j4 == C.TIME_UNSET) {
            this.handleMediaPlayPauseIfPendingOnHandler = j3;
            this.onAddQueueItem = 0L;
        } else {
            long jMax = Math.max(j3, IconCompatParcelizer(j4, j3, this.MediaBrowserCompatMediaItem));
            this.handleMediaPlayPauseIfPendingOnHandler = jMax;
            this.onAddQueueItem = IconCompatParcelizer(this.onAddQueueItem, Math.abs(j3 - jMax), this.MediaBrowserCompatMediaItem);
        }
    }

    private void read(long j) {
        long j2 = this.handleMediaPlayPauseIfPendingOnHandler + (this.onAddQueueItem * 3);
        if (this.IconCompatParcelizer > j2) {
            float fIconCompatParcelizer = LaissezFaireSubTypeValidator.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver);
            this.IconCompatParcelizer = setFormatMetadata.read(j2, this.AudioAttributesCompatParcelizer, this.IconCompatParcelizer - (((long) ((this.write - 1.0f) * fIconCompatParcelizer)) + ((long) ((this.MediaBrowserCompatCustomActionResultReceiver - 1.0f) * fIconCompatParcelizer))));
            return;
        }
        long j3 = LaissezFaireSubTypeValidator.read(j - ((long) (Math.max(BitmapDescriptorFactory.HUE_RED, this.write - 1.0f) / this.RatingCompat)), this.IconCompatParcelizer, j2);
        this.IconCompatParcelizer = j3;
        long j4 = this.AudioAttributesImplApi26Parcelizer;
        if (j4 == C.TIME_UNSET || j3 <= j4) {
            return;
        }
        this.IconCompatParcelizer = j4;
    }
}
