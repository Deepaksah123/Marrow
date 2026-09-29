package kotlin;

import java.io.IOException;
import kotlin.StdKeySerializers;
import kotlin.buildIterableSerializer;

/* JADX INFO: loaded from: classes2.dex */
public abstract class findCollectionSerializer implements buildIndexedListSerializer, buildIterableSerializer {
    private buildTypeDeserializer AudioAttributesCompatParcelizer;
    private modifyArraySerializer AudioAttributesImplApi26Parcelizer;
    private int MediaBrowserCompatCustomActionResultReceiver;
    private buildIterableSerializer.write MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private C0170format[] MediaBrowserCompatSearchResultReceiver;
    private final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private visitStringFormat MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private long RatingCompat;
    private long RemoteActionCompatParcelizer;
    private int read;
    private buildIteratorSerializer write;
    private final Object AudioAttributesImplApi21Parcelizer = new Object();
    private final ObjectNode IconCompatParcelizer = new ObjectNode();
    private long AudioAttributesImplBaseParcelizer = Long.MIN_VALUE;
    private PolymorphicTypeValidator onAddQueueItem = PolymorphicTypeValidator.RemoteActionCompatParcelizer;

    @Override // o.buildMapEntrySerializer.write
    public void AudioAttributesCompatParcelizer(int i, Object obj) throws addNull {
    }

    @Override // kotlin.buildIndexedListSerializer
    public putArray AudioAttributesImplBaseParcelizer() {
        return null;
    }

    protected void handleMediaPlayPauseIfPendingOnHandler() {
    }

    public void onCustomAction() {
    }

    protected void onFastForward() {
    }

    protected void onMediaButtonEvent() {
    }

    protected void onPause() throws addNull {
    }

    @Override // kotlin.buildIterableSerializer
    public int onPlayFromSearch() throws addNull {
        return 0;
    }

    protected void read(long j, boolean z) throws addNull {
    }

    public void read(C0170format[] c0170formatArr, long j, long j2, StdKeySerializers.write writeVar) throws addNull {
    }

    @Override // kotlin.buildIndexedListSerializer
    public final buildIterableSerializer write() {
        return this;
    }

    protected void write(boolean z, boolean z2) throws addNull {
    }

    public findCollectionSerializer(int i) {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = i;
    }

    @Override // kotlin.buildIndexedListSerializer, kotlin.buildIterableSerializer
    public final int MediaBrowserCompatMediaItem() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    @Override // kotlin.buildIndexedListSerializer
    public final void write(int i, modifyArraySerializer modifyarrayserializer, buildTypeDeserializer buildtypedeserializer) {
        this.read = i;
        this.AudioAttributesImplApi26Parcelizer = modifyarrayserializer;
        this.AudioAttributesCompatParcelizer = buildtypedeserializer;
    }

    @Override // kotlin.buildIndexedListSerializer
    public final int RatingCompat() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // kotlin.buildIndexedListSerializer
    public final void IconCompatParcelizer(buildIteratorSerializer builditeratorserializer, C0170format[] c0170formatArr, visitStringFormat visitstringformat, boolean z, boolean z2, long j, long j2, StdKeySerializers.write writeVar) throws addNull {
        buildTypeSerializer.write(this.MediaBrowserCompatCustomActionResultReceiver == 0);
        this.write = builditeratorserializer;
        this.MediaBrowserCompatCustomActionResultReceiver = 1;
        write(z, z2);
        IconCompatParcelizer(c0170formatArr, visitstringformat, j, j2, writeVar);
        RemoteActionCompatParcelizer(j, z);
    }

    @Override // kotlin.buildIndexedListSerializer
    public final void onPrepare() throws addNull {
        buildTypeSerializer.write(this.MediaBrowserCompatCustomActionResultReceiver == 1);
        this.MediaBrowserCompatCustomActionResultReceiver = 2;
        onPause();
    }

    @Override // kotlin.buildIndexedListSerializer
    public final void IconCompatParcelizer(C0170format[] c0170formatArr, visitStringFormat visitstringformat, long j, long j2, StdKeySerializers.write writeVar) throws addNull {
        buildTypeSerializer.write(!this.MediaBrowserCompatMediaItem);
        this.MediaDescriptionCompat = visitstringformat;
        if (this.AudioAttributesImplBaseParcelizer == Long.MIN_VALUE) {
            this.AudioAttributesImplBaseParcelizer = j;
        }
        this.MediaBrowserCompatSearchResultReceiver = c0170formatArr;
        this.RatingCompat = j2;
        read(c0170formatArr, j, j2, writeVar);
    }

    @Override // kotlin.buildIndexedListSerializer
    public final visitStringFormat MediaBrowserCompatSearchResultReceiver() {
        return this.MediaDescriptionCompat;
    }

    @Override // kotlin.buildIndexedListSerializer
    public final boolean MediaMetadataCompat() {
        return this.AudioAttributesImplBaseParcelizer == Long.MIN_VALUE;
    }

    @Override // kotlin.buildIndexedListSerializer
    public final long MediaBrowserCompatItemReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    @Override // kotlin.buildIndexedListSerializer
    public final void onPlayFromUri() {
        this.MediaBrowserCompatMediaItem = true;
    }

    @Override // kotlin.buildIndexedListSerializer
    public final boolean onAddQueueItem() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // kotlin.buildIndexedListSerializer
    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() throws IOException {
        ((visitStringFormat) buildTypeSerializer.IconCompatParcelizer(this.MediaDescriptionCompat)).G_();
    }

    @Override // kotlin.buildIndexedListSerializer
    public final void write(PolymorphicTypeValidator polymorphicTypeValidator) {
        if (LaissezFaireSubTypeValidator.read(this.onAddQueueItem, polymorphicTypeValidator)) {
            return;
        }
        this.onAddQueueItem = polymorphicTypeValidator;
    }

    @Override // kotlin.buildIndexedListSerializer
    public final void RemoteActionCompatParcelizer(long j) throws addNull {
        RemoteActionCompatParcelizer(j, false);
    }

    private void RemoteActionCompatParcelizer(long j, boolean z) throws addNull {
        this.MediaBrowserCompatMediaItem = false;
        this.RemoteActionCompatParcelizer = j;
        this.AudioAttributesImplBaseParcelizer = j;
        read(j, z);
    }

    @Override // kotlin.buildIndexedListSerializer
    public final void onPrepareFromMediaId() {
        buildTypeSerializer.write(this.MediaBrowserCompatCustomActionResultReceiver == 2);
        this.MediaBrowserCompatCustomActionResultReceiver = 1;
        onFastForward();
    }

    @Override // kotlin.buildIndexedListSerializer
    public final void y_() {
        buildTypeSerializer.write(this.MediaBrowserCompatCustomActionResultReceiver == 1);
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        this.MediaBrowserCompatCustomActionResultReceiver = 0;
        this.MediaDescriptionCompat = null;
        this.MediaBrowserCompatSearchResultReceiver = null;
        this.MediaBrowserCompatMediaItem = false;
        handleMediaPlayPauseIfPendingOnHandler();
    }

    @Override // kotlin.buildIndexedListSerializer
    public final void onPrepareFromSearch() {
        buildTypeSerializer.write(this.MediaBrowserCompatCustomActionResultReceiver == 0);
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        onMediaButtonEvent();
    }

    @Override // kotlin.buildIndexedListSerializer
    public final void onPlay() {
        buildTypeSerializer.write(this.MediaBrowserCompatCustomActionResultReceiver == 0);
        onCustomAction();
    }

    @Override // kotlin.buildIterableSerializer
    public final void read(buildIterableSerializer.write writeVar) {
        synchronized (this.AudioAttributesImplApi21Parcelizer) {
            this.MediaBrowserCompatItemReceiver = writeVar;
        }
    }

    @Override // kotlin.buildIterableSerializer
    public final void RemoteActionCompatParcelizer() {
        synchronized (this.AudioAttributesImplApi21Parcelizer) {
            this.MediaBrowserCompatItemReceiver = null;
        }
    }

    protected final long AudioAttributesImplApi26Parcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    protected final ObjectNode MediaBrowserCompatCustomActionResultReceiver() {
        this.IconCompatParcelizer.AudioAttributesCompatParcelizer();
        return this.IconCompatParcelizer;
    }

    protected final C0170format[] MediaDescriptionCompat() {
        return (C0170format[]) buildTypeSerializer.IconCompatParcelizer(this.MediaBrowserCompatSearchResultReceiver);
    }

    protected final buildIteratorSerializer A_() {
        return (buildIteratorSerializer) buildTypeSerializer.IconCompatParcelizer(this.write);
    }

    private int onPrepareFromUri() {
        return this.read;
    }

    protected final modifyArraySerializer AudioAttributesImplApi21Parcelizer() {
        return (modifyArraySerializer) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesImplApi26Parcelizer);
    }

    protected final buildTypeDeserializer z_() {
        return (buildTypeDeserializer) buildTypeSerializer.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
    }

    protected final addNull write(Throwable th, C0170format c0170format, int i) {
        return write(th, c0170format, false, i);
    }

    protected final addNull write(Throwable th, C0170format c0170format, boolean z, int i) {
        int i2;
        if (c0170format == null || this.MediaMetadataCompat) {
            i2 = 4;
        } else {
            this.MediaMetadataCompat = true;
            try {
                i2 = buildIterableSerializer.read(read(c0170format));
            } catch (addNull unused) {
                i2 = 4;
            } finally {
                this.MediaMetadataCompat = false;
            }
        }
        return addNull.read(th, onSeekTo(), onPrepareFromUri(), c0170format, i2, z, i);
    }

    protected final int read(ObjectNode objectNode, _find _findVar, int i) {
        int iAudioAttributesCompatParcelizer = ((visitStringFormat) buildTypeSerializer.IconCompatParcelizer(this.MediaDescriptionCompat)).AudioAttributesCompatParcelizer(objectNode, _findVar, i);
        if (iAudioAttributesCompatParcelizer != -4) {
            if (iAudioAttributesCompatParcelizer == -5) {
                C0170format c0170format = (C0170format) buildTypeSerializer.IconCompatParcelizer(objectNode.write);
                if (c0170format.onSeekTo != Long.MAX_VALUE) {
                    objectNode.write = c0170format.write().write(c0170format.onSeekTo + this.RatingCompat).IconCompatParcelizer();
                }
            }
            return iAudioAttributesCompatParcelizer;
        }
        if (_findVar.AudioAttributesCompatParcelizer()) {
            this.AudioAttributesImplBaseParcelizer = Long.MIN_VALUE;
            return this.MediaBrowserCompatMediaItem ? -4 : -3;
        }
        _findVar.RemoteActionCompatParcelizer += this.RatingCompat;
        this.AudioAttributesImplBaseParcelizer = Math.max(this.AudioAttributesImplBaseParcelizer, _findVar.RemoteActionCompatParcelizer);
        return iAudioAttributesCompatParcelizer;
    }

    protected final int write(long j) {
        return ((visitStringFormat) buildTypeSerializer.IconCompatParcelizer(this.MediaDescriptionCompat)).IconCompatParcelizer(j - this.RatingCompat);
    }

    protected final boolean onCommand() {
        return MediaMetadataCompat() ? this.MediaBrowserCompatMediaItem : ((visitStringFormat) buildTypeSerializer.IconCompatParcelizer(this.MediaDescriptionCompat)).F_();
    }

    public final void onPlayFromMediaId() {
        buildIterableSerializer.write writeVar;
        synchronized (this.AudioAttributesImplApi21Parcelizer) {
            writeVar = this.MediaBrowserCompatItemReceiver;
        }
        if (writeVar != null) {
            writeVar.AudioAttributesCompatParcelizer(this);
        }
    }
}
