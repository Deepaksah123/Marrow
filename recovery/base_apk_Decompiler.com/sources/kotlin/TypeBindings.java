package kotlin;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.util.Objects;
import kotlin.StdKeySerializers;

/* JADX INFO: loaded from: classes2.dex */
public final class TypeBindings extends findCollectionSerializer implements Handler.Callback {
    private int AudioAttributesCompatParcelizer;
    private setLenient AudioAttributesImplApi21Parcelizer;
    private final ObjectNode AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private final _parseDateFromLong IconCompatParcelizer;
    private long MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private final _hasNTypeParameters MediaBrowserCompatMediaItem;
    private withLocale MediaBrowserCompatSearchResultReceiver;
    private C0170format MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final Handler MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private int RatingCompat;
    private final _find RemoteActionCompatParcelizer;
    private long handleMediaPlayPauseIfPendingOnHandler;
    private final invalidCacheKey onAddQueueItem;
    private setLenient onCommand;
    private parseAsISO8601 onCustomAction;
    private boolean onFastForward;
    private ReferenceType read;
    private long write;

    @Override // kotlin.buildIndexedListSerializer
    public final boolean onRemoveQueueItem() {
        return true;
    }

    public TypeBindings(_hasNTypeParameters _hasntypeparameters, Looper looper) {
        this(_hasntypeparameters, looper, invalidCacheKey.RemoteActionCompatParcelizer);
    }

    private TypeBindings(_hasNTypeParameters _hasntypeparameters, Looper looper, invalidCacheKey invalidcachekey) {
        super(3);
        this.MediaBrowserCompatMediaItem = (_hasNTypeParameters) buildTypeSerializer.IconCompatParcelizer(_hasntypeparameters);
        this.MediaDescriptionCompat = looper == null ? null : LaissezFaireSubTypeValidator.write(looper, this);
        this.onAddQueueItem = invalidcachekey;
        this.IconCompatParcelizer = new _parseDateFromLong();
        this.RemoteActionCompatParcelizer = new _find(1);
        this.AudioAttributesImplApi26Parcelizer = new ObjectNode();
        this.write = C.TIME_UNSET;
        this.handleMediaPlayPauseIfPendingOnHandler = C.TIME_UNSET;
        this.MediaBrowserCompatCustomActionResultReceiver = C.TIME_UNSET;
        this.AudioAttributesImplBaseParcelizer = false;
    }

    @Override // kotlin.buildIndexedListSerializer, kotlin.buildIterableSerializer
    public final String onSeekTo() {
        return "TextRenderer";
    }

    @Override // kotlin.buildIterableSerializer
    public final int read(C0170format c0170format) {
        if (write(c0170format) || this.onAddQueueItem.IconCompatParcelizer(c0170format)) {
            return buildIterableSerializer.AudioAttributesCompatParcelizer(c0170format.MediaBrowserCompatCustomActionResultReceiver == 0 ? 4 : 2);
        }
        if (DefaultBaseTypeLimitingValidator.AudioAttributesImplApi26Parcelizer(c0170format.onPlayFromUri)) {
            return buildIterableSerializer.AudioAttributesCompatParcelizer(1);
        }
        return buildIterableSerializer.AudioAttributesCompatParcelizer(0);
    }

    public final void AudioAttributesCompatParcelizer(long j) {
        buildTypeSerializer.write(onAddQueueItem());
        this.write = j;
    }

    @Override // kotlin.findCollectionSerializer
    public final void read(C0170format[] c0170formatArr, long j, long j2, StdKeySerializers.write writeVar) {
        ReferenceType typeBase;
        this.handleMediaPlayPauseIfPendingOnHandler = j2;
        C0170format c0170format = c0170formatArr[0];
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = c0170format;
        if (!write(c0170format)) {
            onPrepareFromUri();
            if (this.onCustomAction != null) {
                this.AudioAttributesCompatParcelizer = 1;
                return;
            } else {
                onSetShuffleMode();
                return;
            }
        }
        if (this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.MediaBrowserCompatItemReceiver == 1) {
            typeBase = new constructUnsafe();
        } else {
            typeBase = new TypeBase();
        }
        this.read = typeBase;
    }

    @Override // kotlin.findCollectionSerializer
    public final void read(long j, boolean z) {
        this.MediaBrowserCompatCustomActionResultReceiver = j;
        ReferenceType referenceType = this.read;
        if (referenceType != null) {
            referenceType.read();
        }
        onSetPlaybackSpeed();
        this.MediaBrowserCompatItemReceiver = false;
        this.MediaMetadataCompat = false;
        this.write = C.TIME_UNSET;
        C0170format c0170format = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (c0170format == null || write(c0170format)) {
            return;
        }
        if (this.AudioAttributesCompatParcelizer != 0) {
            onStop();
            return;
        }
        onSetRepeatMode();
        parseAsISO8601 parseasiso8601 = (parseAsISO8601) buildTypeSerializer.IconCompatParcelizer(this.onCustomAction);
        parseasiso8601.AudioAttributesCompatParcelizer();
        parseasiso8601.read(AudioAttributesImplApi26Parcelizer());
    }

    @Override // kotlin.buildIndexedListSerializer
    public final void IconCompatParcelizer(long j, long j2) {
        if (onAddQueueItem()) {
            long j3 = this.write;
            if (j3 != C.TIME_UNSET && j >= j3) {
                onSetRepeatMode();
                this.MediaMetadataCompat = true;
            }
        }
        if (this.MediaMetadataCompat) {
            return;
        }
        if (write((C0170format) buildTypeSerializer.IconCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver))) {
            MediaBrowserCompatCustomActionResultReceiver(j);
        } else {
            onPrepareFromUri();
            AudioAttributesImplApi26Parcelizer(j);
        }
    }

    private void MediaBrowserCompatCustomActionResultReceiver(long j) {
        boolean zMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(j);
        long j2 = this.read.read(this.MediaBrowserCompatCustomActionResultReceiver);
        if (j2 == Long.MIN_VALUE && this.MediaBrowserCompatItemReceiver && !zMediaBrowserCompatItemReceiver) {
            this.MediaMetadataCompat = true;
        }
        if ((j2 != Long.MIN_VALUE && j2 <= j) || zMediaBrowserCompatItemReceiver) {
            initExtraTracks<getDefaultImpl> initextratracksWrite = this.read.write(j);
            long jAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(j);
            RemoteActionCompatParcelizer(new idFromValue(initextratracksWrite, IconCompatParcelizer(jAudioAttributesCompatParcelizer)));
            this.read.RemoteActionCompatParcelizer(jAudioAttributesCompatParcelizer);
        }
        this.MediaBrowserCompatCustomActionResultReceiver = j;
    }

    private boolean MediaBrowserCompatItemReceiver(long j) {
        if (this.MediaBrowserCompatItemReceiver || read(this.AudioAttributesImplApi26Parcelizer, this.RemoteActionCompatParcelizer, 0) != -4) {
            return false;
        }
        if (this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer()) {
            this.MediaBrowserCompatItemReceiver = true;
            return false;
        }
        this.RemoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        ByteBuffer byteBuffer = (ByteBuffer) buildTypeSerializer.IconCompatParcelizer(this.RemoteActionCompatParcelizer.read);
        pad3 pad3VarIconCompatParcelizer = _parseDateFromLong.IconCompatParcelizer(this.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer, byteBuffer.array(), byteBuffer.arrayOffset(), byteBuffer.limit());
        this.RemoteActionCompatParcelizer.write();
        return this.read.IconCompatParcelizer(pad3VarIconCompatParcelizer, j);
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void AudioAttributesImplApi26Parcelizer(long r9) {
        /*
            Method dump skipped, instruction units count: 285
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.TypeBindings.AudioAttributesImplApi26Parcelizer(long):void");
    }

    @Override // kotlin.findCollectionSerializer
    public final void handleMediaPlayPauseIfPendingOnHandler() {
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
        this.write = C.TIME_UNSET;
        onSetPlaybackSpeed();
        this.handleMediaPlayPauseIfPendingOnHandler = C.TIME_UNSET;
        this.MediaBrowserCompatCustomActionResultReceiver = C.TIME_UNSET;
        if (this.onCustomAction != null) {
            onSetCaptioningEnabled();
        }
    }

    @Override // kotlin.buildIndexedListSerializer
    public final boolean onRemoveQueueItemAt() {
        return this.MediaMetadataCompat;
    }

    private void onSetRepeatMode() {
        this.MediaBrowserCompatSearchResultReceiver = null;
        this.RatingCompat = -1;
        setLenient setlenient = this.onCommand;
        if (setlenient != null) {
            setlenient.MediaBrowserCompatCustomActionResultReceiver();
            this.onCommand = null;
        }
        setLenient setlenient2 = this.AudioAttributesImplApi21Parcelizer;
        if (setlenient2 != null) {
            setlenient2.MediaBrowserCompatCustomActionResultReceiver();
            this.AudioAttributesImplApi21Parcelizer = null;
        }
    }

    private void onSetCaptioningEnabled() {
        onSetRepeatMode();
        ((parseAsISO8601) buildTypeSerializer.IconCompatParcelizer(this.onCustomAction)).write();
        this.onCustomAction = null;
        this.AudioAttributesCompatParcelizer = 0;
    }

    private void onSetShuffleMode() {
        this.onFastForward = true;
        parseAsISO8601 parseasiso8601Write = this.onAddQueueItem.write((C0170format) buildTypeSerializer.IconCompatParcelizer(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver));
        this.onCustomAction = parseasiso8601Write;
        parseasiso8601Write.read(AudioAttributesImplApi26Parcelizer());
    }

    private void onStop() {
        onSetCaptioningEnabled();
        onSetShuffleMode();
    }

    private long onSetRating() {
        int i = this.RatingCompat;
        if (i != -1 && i < this.onCommand.RemoteActionCompatParcelizer()) {
            return this.onCommand.write(this.RatingCompat);
        }
        return Long.MAX_VALUE;
    }

    private void RemoteActionCompatParcelizer(idFromValue idfromvalue) {
        Handler handler = this.MediaDescriptionCompat;
        if (handler != null) {
            handler.obtainMessage(1, idfromvalue).sendToTarget();
        } else {
            read(idfromvalue);
        }
    }

    private void onSetPlaybackSpeed() {
        RemoteActionCompatParcelizer(new idFromValue(initExtraTracks.AudioAttributesImplApi26Parcelizer(), IconCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver)));
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what == 1) {
            read((idFromValue) message.obj);
            return true;
        }
        throw new IllegalStateException();
    }

    private void read(idFromValue idfromvalue) {
        this.MediaBrowserCompatMediaItem.write(idfromvalue.write);
        this.MediaBrowserCompatMediaItem.IconCompatParcelizer(idfromvalue);
    }

    private void write(parseAsRFC1123 parseasrfc1123) {
        StringBuilder sb = new StringBuilder("Subtitle decoding failed. streamFormat=");
        sb.append(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
        prune.read("TextRenderer", sb.toString(), parseasrfc1123);
        onSetPlaybackSpeed();
        onStop();
    }

    private long read(long j) {
        int iRemoteActionCompatParcelizer = this.onCommand.RemoteActionCompatParcelizer(j);
        if (iRemoteActionCompatParcelizer == 0 || this.onCommand.RemoteActionCompatParcelizer() == 0) {
            return this.onCommand.write;
        }
        if (iRemoteActionCompatParcelizer == -1) {
            return this.onCommand.write(r1.RemoteActionCompatParcelizer() - 1);
        }
        return this.onCommand.write(iRemoteActionCompatParcelizer - 1);
    }

    private long IconCompatParcelizer(long j) {
        buildTypeSerializer.write(j != C.TIME_UNSET);
        buildTypeSerializer.write(this.handleMediaPlayPauseIfPendingOnHandler != C.TIME_UNSET);
        return j - this.handleMediaPlayPauseIfPendingOnHandler;
    }

    private void onPrepareFromUri() {
        boolean z = Objects.equals(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onPlayFromUri, MimeTypes.APPLICATION_CEA608) || Objects.equals(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onPlayFromUri, MimeTypes.APPLICATION_MP4CEA608) || Objects.equals(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onPlayFromUri, MimeTypes.APPLICATION_CEA708);
        StringBuilder sb = new StringBuilder("Legacy decoding is disabled, can't handle ");
        sb.append(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.onPlayFromUri);
        sb.append(" samples (expected application/x-media3-cues).");
        buildTypeSerializer.read(z, sb.toString());
    }

    private static boolean write(C0170format c0170format) {
        return Objects.equals(c0170format.onPlayFromUri, "application/x-media3-cues");
    }
}
