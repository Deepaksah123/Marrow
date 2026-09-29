package kotlin;

import android.graphics.Bitmap;
import androidx.media3.exoplayer.image.ImageOutput;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.PlaybackException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import kotlin.FileSerializer;

/* JADX INFO: loaded from: classes2.dex */
public final class IterableSerializer extends findCollectionSerializer {
    private FileSerializer AudioAttributesCompatParcelizer;
    private ImageOutput AudioAttributesImplApi21Parcelizer;
    private final _find AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private C0170format MediaBrowserCompatCustomActionResultReceiver;
    private _find MediaBrowserCompatItemReceiver;
    private long MediaBrowserCompatMediaItem;
    private Bitmap MediaBrowserCompatSearchResultReceiver;
    private boolean MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private IconCompatParcelizer MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private long RatingCompat;
    private int RemoteActionCompatParcelizer;
    private RemoteActionCompatParcelizer handleMediaPlayPauseIfPendingOnHandler;
    private IconCompatParcelizer onAddQueueItem;
    private final ArrayDeque<RemoteActionCompatParcelizer> onCommand;
    private int read;
    private final FileSerializer.read write;

    public IterableSerializer(FileSerializer.read readVar) {
        super(4);
        this.write = readVar;
        this.AudioAttributesImplApi21Parcelizer = IconCompatParcelizer((ImageOutput) null);
        this.AudioAttributesImplApi26Parcelizer = _find.AudioAttributesImplApi26Parcelizer();
        this.handleMediaPlayPauseIfPendingOnHandler = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        this.onCommand = new ArrayDeque<>();
        this.RatingCompat = C.TIME_UNSET;
        this.MediaBrowserCompatMediaItem = C.TIME_UNSET;
        this.read = 0;
        this.RemoteActionCompatParcelizer = 1;
    }

    @Override // kotlin.buildIndexedListSerializer, kotlin.buildIterableSerializer
    public final String onSeekTo() {
        return "ImageRenderer";
    }

    @Override // kotlin.buildIterableSerializer
    public final int read(C0170format c0170format) {
        return this.write.AudioAttributesCompatParcelizer(c0170format);
    }

    @Override // kotlin.buildIndexedListSerializer
    public final void IconCompatParcelizer(long j, long j2) throws addNull {
        if (this.MediaMetadataCompat) {
            return;
        }
        if (this.MediaBrowserCompatCustomActionResultReceiver == null) {
            ObjectNode objectNodeMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
            this.AudioAttributesImplApi26Parcelizer.write();
            int i = read(objectNodeMediaBrowserCompatCustomActionResultReceiver, this.AudioAttributesImplApi26Parcelizer, 2);
            if (i != -5) {
                if (i == -4) {
                    buildTypeSerializer.write(this.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer());
                    this.AudioAttributesImplBaseParcelizer = true;
                    this.MediaMetadataCompat = true;
                    return;
                }
                return;
            }
            this.MediaBrowserCompatCustomActionResultReceiver = (C0170format) buildTypeSerializer.AudioAttributesCompatParcelizer(objectNodeMediaBrowserCompatCustomActionResultReceiver.write);
            onPrepareFromUri();
        }
        try {
            StdSubtypeResolver.write("drainAndFeedDecoder");
            while (read(j)) {
            }
            while (IconCompatParcelizer(j)) {
            }
            StdSubtypeResolver.RemoteActionCompatParcelizer();
        } catch (InetAddressSerializer e) {
            throw write(e, (C0170format) null, PlaybackException.ERROR_CODE_DECODING_FAILED);
        }
    }

    @Override // kotlin.buildIndexedListSerializer
    public final boolean onRemoveQueueItem() {
        int i = this.RemoteActionCompatParcelizer;
        if (i != 3) {
            return i == 0 && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        }
        return true;
    }

    @Override // kotlin.buildIndexedListSerializer
    public final boolean onRemoveQueueItemAt() {
        return this.MediaMetadataCompat;
    }

    @Override // kotlin.findCollectionSerializer
    public final void write(boolean z, boolean z2) throws addNull {
        this.RemoteActionCompatParcelizer = z2 ? 1 : 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0026, code lost:
    
        if (r2 >= r5) goto L14;
     */
    @Override // kotlin.findCollectionSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void read(kotlin.C0170format[] r5, long r6, long r8, o.StdKeySerializers.write r10) throws kotlin.addNull {
        /*
            r4 = this;
            super.read(r5, r6, r8, r10)
            o.IterableSerializer$RemoteActionCompatParcelizer r5 = r4.handleMediaPlayPauseIfPendingOnHandler
            long r5 = r5.read
            r0 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 == 0) goto L35
            java.util.ArrayDeque<o.IterableSerializer$RemoteActionCompatParcelizer> r5 = r4.onCommand
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L28
            long r5 = r4.RatingCompat
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 == 0) goto L35
            long r2 = r4.MediaBrowserCompatMediaItem
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 == 0) goto L28
            int r5 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r5 >= 0) goto L35
        L28:
            java.util.ArrayDeque<o.IterableSerializer$RemoteActionCompatParcelizer> r5 = r4.onCommand
            o.IterableSerializer$RemoteActionCompatParcelizer r6 = new o.IterableSerializer$RemoteActionCompatParcelizer
            long r0 = r4.RatingCompat
            r6.<init>(r0, r8)
            r5.add(r6)
            return
        L35:
            o.IterableSerializer$RemoteActionCompatParcelizer r5 = new o.IterableSerializer$RemoteActionCompatParcelizer
            r5.<init>(r0, r8)
            r4.handleMediaPlayPauseIfPendingOnHandler = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.IterableSerializer.read(o.format[], long, long, o.StdKeySerializers$write):void");
    }

    @Override // kotlin.findCollectionSerializer
    public final void read(long j, boolean z) throws addNull {
        onSetRating();
        this.MediaMetadataCompat = false;
        this.AudioAttributesImplBaseParcelizer = false;
        this.MediaBrowserCompatSearchResultReceiver = null;
        this.onAddQueueItem = null;
        this.MediaDescriptionCompat = null;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = false;
        this.MediaBrowserCompatItemReceiver = null;
        FileSerializer fileSerializer = this.AudioAttributesCompatParcelizer;
        if (fileSerializer != null) {
            fileSerializer.AudioAttributesCompatParcelizer();
        }
        this.onCommand.clear();
    }

    @Override // kotlin.findCollectionSerializer
    public final void handleMediaPlayPauseIfPendingOnHandler() {
        this.MediaBrowserCompatCustomActionResultReceiver = null;
        this.handleMediaPlayPauseIfPendingOnHandler = RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer;
        this.onCommand.clear();
        onSetShuffleMode();
    }

    @Override // kotlin.findCollectionSerializer
    public final void onMediaButtonEvent() {
        onSetShuffleMode();
        onSetRating();
    }

    @Override // kotlin.findCollectionSerializer
    public final void onCustomAction() {
        onSetShuffleMode();
    }

    @Override // kotlin.findCollectionSerializer, o.buildMapEntrySerializer.write
    public final void AudioAttributesCompatParcelizer(int i, Object obj) throws addNull {
        if (i == 15) {
            RemoteActionCompatParcelizer(obj instanceof ImageOutput ? (ImageOutput) obj : null);
        } else {
            super.AudioAttributesCompatParcelizer(i, obj);
        }
    }

    private boolean read(long j) throws addNull, InetAddressSerializer {
        Bitmap bitmapAudioAttributesImplApi26Parcelizer;
        if (this.MediaBrowserCompatSearchResultReceiver != null && this.onAddQueueItem == null) {
            return false;
        }
        if (this.RemoteActionCompatParcelizer == 0 && RatingCompat() != 2) {
            return false;
        }
        if (this.MediaBrowserCompatSearchResultReceiver == null) {
            buildTypeSerializer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer);
            InetSocketAddressSerializer inetSocketAddressSerializerIconCompatParcelizer = this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
            if (inetSocketAddressSerializerIconCompatParcelizer == null) {
                return false;
            }
            if (((InetSocketAddressSerializer) buildTypeSerializer.AudioAttributesCompatParcelizer(inetSocketAddressSerializerIconCompatParcelizer)).AudioAttributesCompatParcelizer()) {
                if (this.read == 3) {
                    onSetShuffleMode();
                    buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
                    onPrepareFromUri();
                } else {
                    ((InetSocketAddressSerializer) buildTypeSerializer.AudioAttributesCompatParcelizer(inetSocketAddressSerializerIconCompatParcelizer)).MediaBrowserCompatCustomActionResultReceiver();
                    if (this.onCommand.isEmpty()) {
                        this.MediaMetadataCompat = true;
                    }
                }
                return false;
            }
            buildTypeSerializer.read(inetSocketAddressSerializerIconCompatParcelizer.RemoteActionCompatParcelizer, "Non-EOS buffer came back from the decoder without bitmap.");
            this.MediaBrowserCompatSearchResultReceiver = inetSocketAddressSerializerIconCompatParcelizer.RemoteActionCompatParcelizer;
            ((InetSocketAddressSerializer) buildTypeSerializer.AudioAttributesCompatParcelizer(inetSocketAddressSerializerIconCompatParcelizer)).MediaBrowserCompatCustomActionResultReceiver();
        }
        if (!this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver || this.MediaBrowserCompatSearchResultReceiver == null || this.onAddQueueItem == null) {
            return false;
        }
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver);
        boolean z = ((this.MediaBrowserCompatCustomActionResultReceiver.onRemoveQueueItemAt == 1 && this.MediaBrowserCompatCustomActionResultReceiver.onSetShuffleMode == 1) || this.MediaBrowserCompatCustomActionResultReceiver.onRemoveQueueItemAt == -1 || this.MediaBrowserCompatCustomActionResultReceiver.onSetShuffleMode == -1) ? false : true;
        if (!this.onAddQueueItem.read()) {
            IconCompatParcelizer iconCompatParcelizer = this.onAddQueueItem;
            if (z) {
                bitmapAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(iconCompatParcelizer.write());
            } else {
                bitmapAudioAttributesImplApi26Parcelizer = (Bitmap) buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver);
            }
            iconCompatParcelizer.AudioAttributesCompatParcelizer(bitmapAudioAttributesImplApi26Parcelizer);
        }
        if (!IconCompatParcelizer(j, (Bitmap) buildTypeSerializer.AudioAttributesCompatParcelizer(this.onAddQueueItem.RemoteActionCompatParcelizer()), this.onAddQueueItem.AudioAttributesCompatParcelizer())) {
            return false;
        }
        AudioAttributesCompatParcelizer(((IconCompatParcelizer) buildTypeSerializer.AudioAttributesCompatParcelizer(this.onAddQueueItem)).AudioAttributesCompatParcelizer());
        this.RemoteActionCompatParcelizer = 3;
        if (!z || ((IconCompatParcelizer) buildTypeSerializer.AudioAttributesCompatParcelizer(this.onAddQueueItem)).write() == (((C0170format) buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver)).onSetShuffleMode * ((C0170format) buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver)).onRemoveQueueItemAt) - 1) {
            this.MediaBrowserCompatSearchResultReceiver = null;
        }
        this.onAddQueueItem = this.MediaDescriptionCompat;
        this.MediaDescriptionCompat = null;
        return true;
    }

    private boolean onSetPlaybackSpeed() {
        boolean z = RatingCompat() == 2;
        int i = this.RemoteActionCompatParcelizer;
        if (i == 0) {
            return z;
        }
        if (i == 1) {
            return true;
        }
        if (i == 3) {
            return false;
        }
        throw new IllegalStateException();
    }

    private boolean IconCompatParcelizer(long j, Bitmap bitmap, long j2) throws addNull {
        if (!onSetPlaybackSpeed() && j2 - j >= 30000) {
            return false;
        }
        this.AudioAttributesImplApi21Parcelizer.onImageAvailable(j2 - this.handleMediaPlayPauseIfPendingOnHandler.read, bitmap);
        return true;
    }

    private void AudioAttributesCompatParcelizer(long j) {
        this.MediaBrowserCompatMediaItem = j;
        while (!this.onCommand.isEmpty() && j >= this.onCommand.peek().IconCompatParcelizer) {
            this.handleMediaPlayPauseIfPendingOnHandler = this.onCommand.removeFirst();
        }
    }

    private boolean IconCompatParcelizer(long j) throws InetAddressSerializer {
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver && this.onAddQueueItem != null) {
            return false;
        }
        ObjectNode objectNodeMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
        FileSerializer fileSerializer = this.AudioAttributesCompatParcelizer;
        if (fileSerializer == null || this.read == 3 || this.AudioAttributesImplBaseParcelizer) {
            return false;
        }
        if (this.MediaBrowserCompatItemReceiver == null) {
            _find _findVar = fileSerializer.read();
            this.MediaBrowserCompatItemReceiver = _findVar;
            if (_findVar == null) {
                return false;
            }
        }
        if (this.read == 2) {
            buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver);
            this.MediaBrowserCompatItemReceiver.c_(4);
            ((FileSerializer) buildTypeSerializer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer)).RemoteActionCompatParcelizer(this.MediaBrowserCompatItemReceiver);
            this.MediaBrowserCompatItemReceiver = null;
            this.read = 3;
            return false;
        }
        int i = read(objectNodeMediaBrowserCompatCustomActionResultReceiver, this.MediaBrowserCompatItemReceiver, 0);
        if (i == -5) {
            this.MediaBrowserCompatCustomActionResultReceiver = (C0170format) buildTypeSerializer.AudioAttributesCompatParcelizer(objectNodeMediaBrowserCompatCustomActionResultReceiver.write);
            this.read = 2;
            return true;
        }
        if (i != -4) {
            if (i == -3) {
                return false;
            }
            throw new IllegalStateException();
        }
        this.MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer();
        boolean z = ((ByteBuffer) buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver.read)).remaining() > 0 || ((_find) buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver)).AudioAttributesCompatParcelizer();
        if (z) {
            ((FileSerializer) buildTypeSerializer.AudioAttributesCompatParcelizer(this.AudioAttributesCompatParcelizer)).RemoteActionCompatParcelizer((_find) buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver));
            this.IconCompatParcelizer = 0;
        }
        write(j, (_find) buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver));
        if (((_find) buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver)).AudioAttributesCompatParcelizer()) {
            this.AudioAttributesImplBaseParcelizer = true;
            this.MediaBrowserCompatItemReceiver = null;
            return false;
        }
        this.RatingCompat = Math.max(this.RatingCompat, ((_find) buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver)).RemoteActionCompatParcelizer);
        if (z) {
            this.MediaBrowserCompatItemReceiver = null;
        } else {
            ((_find) buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver)).write();
        }
        return !this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    private void onPrepareFromUri() throws addNull {
        if (RemoteActionCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver)) {
            FileSerializer fileSerializer = this.AudioAttributesCompatParcelizer;
            if (fileSerializer != null) {
                fileSerializer.write();
            }
            this.AudioAttributesCompatParcelizer = this.write.write();
            return;
        }
        throw write(new InetAddressSerializer("Provided decoder factory can't create decoder for format."), this.MediaBrowserCompatCustomActionResultReceiver, PlaybackException.ERROR_CODE_DECODING_FORMAT_UNSUPPORTED);
    }

    private boolean RemoteActionCompatParcelizer(C0170format c0170format) {
        int iAudioAttributesCompatParcelizer = this.write.AudioAttributesCompatParcelizer(c0170format);
        return iAudioAttributesCompatParcelizer == buildIterableSerializer.AudioAttributesCompatParcelizer(4) || iAudioAttributesCompatParcelizer == buildIterableSerializer.AudioAttributesCompatParcelizer(3);
    }

    private void onSetRating() {
        this.RemoteActionCompatParcelizer = Math.min(this.RemoteActionCompatParcelizer, 1);
    }

    private void onSetShuffleMode() {
        this.MediaBrowserCompatItemReceiver = null;
        this.read = 0;
        this.RatingCompat = C.TIME_UNSET;
        FileSerializer fileSerializer = this.AudioAttributesCompatParcelizer;
        if (fileSerializer != null) {
            fileSerializer.write();
            this.AudioAttributesCompatParcelizer = null;
        }
    }

    private void RemoteActionCompatParcelizer(ImageOutput imageOutput) {
        this.AudioAttributesImplApi21Parcelizer = IconCompatParcelizer(imageOutput);
    }

    private void write(long j, _find _findVar) {
        boolean z = true;
        if (_findVar.AudioAttributesCompatParcelizer()) {
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = true;
            return;
        }
        IconCompatParcelizer iconCompatParcelizer = new IconCompatParcelizer(this.IconCompatParcelizer, _findVar.RemoteActionCompatParcelizer);
        this.MediaDescriptionCompat = iconCompatParcelizer;
        this.IconCompatParcelizer++;
        if (!this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
            long jAudioAttributesCompatParcelizer = iconCompatParcelizer.AudioAttributesCompatParcelizer();
            boolean z2 = jAudioAttributesCompatParcelizer - 30000 <= j && j <= 30000 + jAudioAttributesCompatParcelizer;
            IconCompatParcelizer iconCompatParcelizer2 = this.onAddQueueItem;
            boolean z3 = iconCompatParcelizer2 != null && iconCompatParcelizer2.AudioAttributesCompatParcelizer() <= j && j < jAudioAttributesCompatParcelizer;
            boolean z4 = read((IconCompatParcelizer) buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaDescriptionCompat));
            if (!z2 && !z3 && !z4) {
                z = false;
            }
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = z;
            if (z3 && !z2) {
                return;
            }
        }
        this.onAddQueueItem = this.MediaDescriptionCompat;
        this.MediaDescriptionCompat = null;
    }

    private boolean read(IconCompatParcelizer iconCompatParcelizer) {
        return ((C0170format) buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver)).onRemoveQueueItemAt == -1 || this.MediaBrowserCompatCustomActionResultReceiver.onSetShuffleMode == -1 || iconCompatParcelizer.write() == (((C0170format) buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver)).onSetShuffleMode * this.MediaBrowserCompatCustomActionResultReceiver.onRemoveQueueItemAt) - 1;
    }

    private Bitmap AudioAttributesImplApi26Parcelizer(int i) {
        buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver);
        int width = this.MediaBrowserCompatSearchResultReceiver.getWidth() / ((C0170format) buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver)).onRemoveQueueItemAt;
        int height = this.MediaBrowserCompatSearchResultReceiver.getHeight() / ((C0170format) buildTypeSerializer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver)).onSetShuffleMode;
        return Bitmap.createBitmap(this.MediaBrowserCompatSearchResultReceiver, (i % this.MediaBrowserCompatCustomActionResultReceiver.onRemoveQueueItemAt) * width, (i / this.MediaBrowserCompatCustomActionResultReceiver.onRemoveQueueItemAt) * height, width, height);
    }

    private static ImageOutput IconCompatParcelizer(ImageOutput imageOutput) {
        return imageOutput == null ? ImageOutput.write : imageOutput;
    }

    static class IconCompatParcelizer {
        private Bitmap AudioAttributesCompatParcelizer;
        private final long read;
        private final int write;

        public IconCompatParcelizer(int i, long j) {
            this.write = i;
            this.read = j;
        }

        public final int write() {
            return this.write;
        }

        public final long AudioAttributesCompatParcelizer() {
            return this.read;
        }

        public final Bitmap RemoteActionCompatParcelizer() {
            return this.AudioAttributesCompatParcelizer;
        }

        public final void AudioAttributesCompatParcelizer(Bitmap bitmap) {
            this.AudioAttributesCompatParcelizer = bitmap;
        }

        public final boolean read() {
            return this.AudioAttributesCompatParcelizer != null;
        }
    }

    static final class RemoteActionCompatParcelizer {
        public static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer(C.TIME_UNSET, C.TIME_UNSET);
        public final long IconCompatParcelizer;
        public final long read;

        public RemoteActionCompatParcelizer(long j, long j2) {
            this.IconCompatParcelizer = j;
            this.read = j2;
        }
    }
}
