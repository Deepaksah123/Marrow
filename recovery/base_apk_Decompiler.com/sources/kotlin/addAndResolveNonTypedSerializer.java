package kotlin;

import android.content.Context;
import android.media.AudioDeviceInfo;
import android.media.MediaCrypto;
import android.media.MediaFormat;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.util.MimeTypes;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.List;
import java.util.Objects;
import kotlin.C0170format;
import kotlin._ensureOverride;
import kotlin.buildIndexedListSerializer;
import kotlin.modifyMapLikeSerializer;
import kotlin.serializeFilteredFields;
import kotlin.serializePolymorphic;

/* JADX INFO: loaded from: classes2.dex */
public final class addAndResolveNonTypedSerializer extends serializeFieldsUsing implements putArray {
    private final serializePolymorphic AudioAttributesCompatParcelizer;
    private final Context AudioAttributesImplApi21Parcelizer;
    private long AudioAttributesImplApi26Parcelizer;
    private boolean AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private C0170format MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private boolean MediaBrowserCompatMediaItem;
    private C0170format MediaBrowserCompatSearchResultReceiver;
    private final modifyMapLikeSerializer.AudioAttributesCompatParcelizer MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private long RatingCompat;
    private boolean RemoteActionCompatParcelizer;
    private int onAddQueueItem;
    private boolean read;

    @Override // kotlin.findCollectionSerializer, kotlin.buildIndexedListSerializer
    public final putArray AudioAttributesImplBaseParcelizer() {
        return this;
    }

    static /* synthetic */ boolean AudioAttributesCompatParcelizer(addAndResolveNonTypedSerializer addandresolvenontypedserializer) {
        addandresolvenontypedserializer.MediaMetadataCompat = true;
        return true;
    }

    public addAndResolveNonTypedSerializer(Context context, _ensureOverride.IconCompatParcelizer iconCompatParcelizer, serializeFilteredAnyProperties serializefilteredanyproperties, boolean z, Handler handler, modifyMapLikeSerializer modifymaplikeserializer, serializePolymorphic serializepolymorphic) {
        super(1, iconCompatParcelizer, serializefilteredanyproperties, z, 44100.0f);
        this.AudioAttributesImplApi21Parcelizer = context.getApplicationContext();
        this.AudioAttributesCompatParcelizer = serializepolymorphic;
        this.onAddQueueItem = -1000;
        this.MediaDescriptionCompat = new modifyMapLikeSerializer.AudioAttributesCompatParcelizer(handler, modifymaplikeserializer);
        this.RatingCompat = C.TIME_UNSET;
        serializepolymorphic.write(new RemoteActionCompatParcelizer(this, (byte) 0));
    }

    @Override // kotlin.buildIndexedListSerializer, kotlin.buildIterableSerializer
    public final String onSeekTo() {
        return "MediaCodecAudioRenderer";
    }

    @Override // kotlin.serializeFieldsUsing
    public final int IconCompatParcelizer(serializeFilteredAnyProperties serializefilteredanyproperties, C0170format c0170format) throws serializeFilteredFields.write {
        int i;
        boolean z;
        if (!DefaultBaseTypeLimitingValidator.AudioAttributesImplApi21Parcelizer(c0170format.onPlayFromUri)) {
            return buildIterableSerializer.AudioAttributesCompatParcelizer(0);
        }
        int i2 = LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21 ? 32 : 0;
        boolean z2 = true;
        boolean z3 = c0170format.MediaBrowserCompatCustomActionResultReceiver != 0;
        boolean zIconCompatParcelizer = IconCompatParcelizer(c0170format);
        if (!zIconCompatParcelizer || (z3 && serializeFilteredFields.AudioAttributesCompatParcelizer() == null)) {
            i = 0;
        } else {
            int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(c0170format);
            if (this.AudioAttributesCompatParcelizer.IconCompatParcelizer(c0170format)) {
                return buildIterableSerializer.IconCompatParcelizer(4, 8, i2, iMediaBrowserCompatItemReceiver);
            }
            i = iMediaBrowserCompatItemReceiver;
        }
        if (MimeTypes.AUDIO_RAW.equals(c0170format.onPlayFromUri) && !this.AudioAttributesCompatParcelizer.IconCompatParcelizer(c0170format)) {
            return buildIterableSerializer.AudioAttributesCompatParcelizer(1);
        }
        if (!this.AudioAttributesCompatParcelizer.IconCompatParcelizer(LaissezFaireSubTypeValidator.read(2, c0170format.AudioAttributesCompatParcelizer, c0170format.onPrepareFromUri))) {
            return buildIterableSerializer.AudioAttributesCompatParcelizer(1);
        }
        List<_writeNullKeyedEntry> listAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(serializefilteredanyproperties, c0170format, false, this.AudioAttributesCompatParcelizer);
        if (listAudioAttributesCompatParcelizer.isEmpty()) {
            return buildIterableSerializer.AudioAttributesCompatParcelizer(1);
        }
        if (!zIconCompatParcelizer) {
            return buildIterableSerializer.AudioAttributesCompatParcelizer(2);
        }
        _writeNullKeyedEntry _writenullkeyedentry = listAudioAttributesCompatParcelizer.get(0);
        boolean zWrite = _writenullkeyedentry.write(c0170format);
        if (zWrite) {
            z = true;
            z2 = zWrite;
        } else {
            for (int i3 = 1; i3 < listAudioAttributesCompatParcelizer.size(); i3++) {
                _writeNullKeyedEntry _writenullkeyedentry2 = listAudioAttributesCompatParcelizer.get(i3);
                if (_writenullkeyedentry2.write(c0170format)) {
                    z = false;
                    _writenullkeyedentry = _writenullkeyedentry2;
                    break;
                }
            }
            z = true;
            z2 = zWrite;
        }
        return buildIterableSerializer.IconCompatParcelizer(!z2 ? 3 : 4, (z2 && _writenullkeyedentry.RemoteActionCompatParcelizer(c0170format)) ? 16 : 8, i2, _writenullkeyedentry.IconCompatParcelizer ? 64 : 0, z ? 128 : 0, i);
    }

    private int MediaBrowserCompatItemReceiver(C0170format c0170format) {
        modifyEnumSerializer modifyenumserializer = this.AudioAttributesCompatParcelizer.read(c0170format);
        if (!modifyenumserializer.RemoteActionCompatParcelizer) {
            return 0;
        }
        int i = modifyenumserializer.AudioAttributesCompatParcelizer ? 1536 : 512;
        return modifyenumserializer.IconCompatParcelizer ? i | 2048 : i;
    }

    @Override // kotlin.serializeFieldsUsing
    public final List<_writeNullKeyedEntry> AudioAttributesCompatParcelizer(serializeFilteredAnyProperties serializefilteredanyproperties, C0170format c0170format, boolean z) throws serializeFilteredFields.write {
        return serializeFilteredFields.read(AudioAttributesCompatParcelizer(serializefilteredanyproperties, c0170format, z, this.AudioAttributesCompatParcelizer), c0170format);
    }

    private static List<_writeNullKeyedEntry> AudioAttributesCompatParcelizer(serializeFilteredAnyProperties serializefilteredanyproperties, C0170format c0170format, boolean z, serializePolymorphic serializepolymorphic) throws serializeFilteredFields.write {
        _writeNullKeyedEntry _writenullkeyedentryAudioAttributesCompatParcelizer;
        if (c0170format.onPlayFromUri == null) {
            return initExtraTracks.AudioAttributesImplApi26Parcelizer();
        }
        if (serializepolymorphic.IconCompatParcelizer(c0170format) && (_writenullkeyedentryAudioAttributesCompatParcelizer = serializeFilteredFields.AudioAttributesCompatParcelizer()) != null) {
            return initExtraTracks.read(_writenullkeyedentryAudioAttributesCompatParcelizer);
        }
        return serializeFilteredFields.write(serializefilteredanyproperties, c0170format, z, false);
    }

    @Override // kotlin.serializeFieldsUsing
    public final boolean AudioAttributesCompatParcelizer(C0170format c0170format) {
        if (A_().IconCompatParcelizer != 0) {
            int iMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(c0170format);
            if ((iMediaBrowserCompatItemReceiver & 512) != 0) {
                if (A_().IconCompatParcelizer == 2 || (iMediaBrowserCompatItemReceiver & 1024) != 0) {
                    return true;
                }
                if (c0170format.MediaDescriptionCompat == 0 && c0170format.MediaBrowserCompatSearchResultReceiver == 0) {
                    return true;
                }
            }
        }
        return this.AudioAttributesCompatParcelizer.IconCompatParcelizer(c0170format);
    }

    @Override // kotlin.serializeFieldsUsing
    public final _ensureOverride.write write(_writeNullKeyedEntry _writenullkeyedentry, C0170format c0170format, MediaCrypto mediaCrypto, float f) {
        this.IconCompatParcelizer = RemoteActionCompatParcelizer(_writenullkeyedentry, c0170format, MediaDescriptionCompat());
        this.MediaBrowserCompatItemReceiver = AudioAttributesCompatParcelizer(_writenullkeyedentry.MediaBrowserCompatCustomActionResultReceiver);
        this.AudioAttributesImplBaseParcelizer = RemoteActionCompatParcelizer(_writenullkeyedentry.MediaBrowserCompatCustomActionResultReceiver);
        MediaFormat mediaFormatAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(c0170format, _writenullkeyedentry.read, this.IconCompatParcelizer, f);
        this.MediaBrowserCompatCustomActionResultReceiver = (!MimeTypes.AUDIO_RAW.equals(_writenullkeyedentry.write) || MimeTypes.AUDIO_RAW.equals(c0170format.onPlayFromUri)) ? null : c0170format;
        return _ensureOverride.write.AudioAttributesCompatParcelizer(_writenullkeyedentry, mediaFormatAudioAttributesCompatParcelizer, c0170format, mediaCrypto);
    }

    @Override // kotlin.serializeFieldsUsing
    public final findMapLikeSerializer RemoteActionCompatParcelizer(_writeNullKeyedEntry _writenullkeyedentry, C0170format c0170format, C0170format c0170format2) {
        findMapLikeSerializer findmaplikeserializerAudioAttributesCompatParcelizer = _writenullkeyedentry.AudioAttributesCompatParcelizer(c0170format, c0170format2);
        int i = findmaplikeserializerAudioAttributesCompatParcelizer.IconCompatParcelizer;
        if (RemoteActionCompatParcelizer(c0170format2)) {
            i |= 32768;
        }
        if (AudioAttributesCompatParcelizer(_writenullkeyedentry, c0170format2) > this.IconCompatParcelizer) {
            i |= 64;
        }
        int i2 = i;
        return new findMapLikeSerializer(_writenullkeyedentry.MediaBrowserCompatCustomActionResultReceiver, c0170format, c0170format2, i2 != 0 ? 0 : findmaplikeserializerAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer, i2);
    }

    @Override // kotlin.serializeFieldsUsing
    public final long read(boolean z, long j, long j2) {
        if (this.RatingCompat != C.TIME_UNSET) {
            long jIconCompatParcelizer = (long) (((r0 - j) / (IconCompatParcelizer() != null ? IconCompatParcelizer().AudioAttributesCompatParcelizer : 1.0f)) / 2.0f);
            if (this.MediaBrowserCompatMediaItem) {
                jIconCompatParcelizer -= LaissezFaireSubTypeValidator.IconCompatParcelizer(z_().RemoteActionCompatParcelizer()) - j2;
            }
            return Math.max(10000L, jIconCompatParcelizer);
        }
        return super.read(z, j, j2);
    }

    @Override // kotlin.serializeFieldsUsing
    public final float write(float f, C0170format[] c0170formatArr) {
        int iMax = -1;
        for (C0170format c0170format : c0170formatArr) {
            int i = c0170format.onPrepareFromUri;
            if (i != -1) {
                iMax = Math.max(iMax, i);
            }
        }
        if (iMax == -1) {
            return -1.0f;
        }
        return iMax * f;
    }

    @Override // kotlin.serializeFieldsUsing
    public final void AudioAttributesCompatParcelizer(String str, long j, long j2) {
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer(str, j, j2);
    }

    @Override // kotlin.serializeFieldsUsing
    public final void IconCompatParcelizer(String str) {
        this.MediaDescriptionCompat.AudioAttributesCompatParcelizer(str);
    }

    @Override // kotlin.serializeFieldsUsing
    public final void IconCompatParcelizer(Exception exc) {
        prune.read("MediaCodecAudioRenderer", "Audio codec error", exc);
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer(exc);
    }

    @Override // kotlin.serializeFieldsUsing
    public final findMapLikeSerializer write(ObjectNode objectNode) throws addNull {
        C0170format c0170format = (C0170format) buildTypeSerializer.IconCompatParcelizer(objectNode.write);
        this.MediaBrowserCompatSearchResultReceiver = c0170format;
        findMapLikeSerializer findmaplikeserializerWrite = super.write(objectNode);
        this.MediaDescriptionCompat.AudioAttributesCompatParcelizer(c0170format, findmaplikeserializerWrite);
        return findmaplikeserializerWrite;
    }

    @Override // kotlin.serializeFieldsUsing
    public final void AudioAttributesCompatParcelizer(C0170format c0170format, MediaFormat mediaFormat) throws addNull {
        int iAudioAttributesCompatParcelizer;
        C0170format c0170format2 = this.MediaBrowserCompatCustomActionResultReceiver;
        int[] iArrIconCompatParcelizer = null;
        if (c0170format2 != null) {
            c0170format = c0170format2;
        } else if (onSetShuffleMode() != null) {
            if (MimeTypes.AUDIO_RAW.equals(c0170format.onPlayFromUri)) {
                iAudioAttributesCompatParcelizer = c0170format.onMediaButtonEvent;
            } else if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 24 && mediaFormat.containsKey("pcm-encoding")) {
                iAudioAttributesCompatParcelizer = mediaFormat.getInteger("pcm-encoding");
            } else {
                iAudioAttributesCompatParcelizer = mediaFormat.containsKey("v-bits-per-sample") ? LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(mediaFormat.getInteger("v-bits-per-sample")) : 2;
            }
            C0170format c0170formatIconCompatParcelizer = new C0170format.RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer(MimeTypes.AUDIO_RAW).RatingCompat(iAudioAttributesCompatParcelizer).MediaBrowserCompatCustomActionResultReceiver(c0170format.MediaDescriptionCompat).AudioAttributesImplApi21Parcelizer(c0170format.MediaBrowserCompatSearchResultReceiver).read(c0170format.onPlay).IconCompatParcelizer(c0170format.AudioAttributesImplApi26Parcelizer).AudioAttributesCompatParcelizer(c0170format.handleMediaPlayPauseIfPendingOnHandler).write(c0170format.onCustomAction).IconCompatParcelizer(c0170format.onCommand).read(c0170format.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver).handleMediaPlayPauseIfPendingOnHandler(c0170format.onRewind).MediaBrowserCompatSearchResultReceiver(c0170format.onPrepare).read(mediaFormat.getInteger("channel-count")).MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(mediaFormat.getInteger("sample-rate")).IconCompatParcelizer();
            if (this.MediaBrowserCompatItemReceiver && c0170formatIconCompatParcelizer.AudioAttributesCompatParcelizer == 6 && c0170format.AudioAttributesCompatParcelizer < 6) {
                int[] iArr = new int[c0170format.AudioAttributesCompatParcelizer];
                for (int i = 0; i < c0170format.AudioAttributesCompatParcelizer; i++) {
                    iArr[i] = i;
                }
                iArrIconCompatParcelizer = iArr;
            } else if (this.AudioAttributesImplBaseParcelizer) {
                iArrIconCompatParcelizer = primitiveType.IconCompatParcelizer(c0170formatIconCompatParcelizer.AudioAttributesCompatParcelizer);
            }
            c0170format = c0170formatIconCompatParcelizer;
        }
        try {
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 29) {
                if (MediaSessionCompatQueueItem() && A_().IconCompatParcelizer != 0) {
                    this.AudioAttributesCompatParcelizer.IconCompatParcelizer(A_().IconCompatParcelizer);
                } else {
                    this.AudioAttributesCompatParcelizer.IconCompatParcelizer(0);
                }
            }
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(c0170format, iArrIconCompatParcelizer);
        } catch (serializePolymorphic.RemoteActionCompatParcelizer e) {
            throw write(e, e.read, PlaybackException.ERROR_CODE_AUDIO_TRACK_INIT_FAILED);
        }
    }

    protected final void onPrepareFromUri() {
        this.RemoteActionCompatParcelizer = true;
    }

    @Override // kotlin.serializeFieldsUsing, kotlin.findCollectionSerializer
    public final void write(boolean z, boolean z2) throws addNull {
        super.write(z, z2);
        this.MediaDescriptionCompat.IconCompatParcelizer(((serializeFieldsUsing) this).write);
        if (A_().RemoteActionCompatParcelizer) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer();
        } else {
            this.AudioAttributesCompatParcelizer.read();
        }
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(AudioAttributesImplApi21Parcelizer());
        this.AudioAttributesCompatParcelizer.write(z_());
    }

    @Override // kotlin.serializeFieldsUsing, kotlin.findCollectionSerializer
    public final void read(long j, boolean z) throws addNull {
        super.read(j, z);
        this.AudioAttributesCompatParcelizer.write();
        this.AudioAttributesImplApi26Parcelizer = j;
        this.MediaMetadataCompat = false;
        this.RemoteActionCompatParcelizer = true;
    }

    @Override // kotlin.serializeFieldsUsing, kotlin.findCollectionSerializer
    public final void onPause() {
        super.onPause();
        this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver();
        this.MediaBrowserCompatMediaItem = true;
    }

    @Override // kotlin.serializeFieldsUsing, kotlin.findCollectionSerializer
    public final void onFastForward() {
        r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
        this.MediaBrowserCompatMediaItem = false;
        this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer();
        super.onFastForward();
    }

    @Override // kotlin.serializeFieldsUsing, kotlin.findCollectionSerializer
    public final void handleMediaPlayPauseIfPendingOnHandler() {
        this.read = true;
        this.MediaBrowserCompatSearchResultReceiver = null;
        try {
            this.AudioAttributesCompatParcelizer.write();
            try {
                super.handleMediaPlayPauseIfPendingOnHandler();
            } finally {
            }
        } catch (Throwable th) {
            try {
                super.handleMediaPlayPauseIfPendingOnHandler();
                throw th;
            } finally {
            }
        }
    }

    @Override // kotlin.serializeFieldsUsing, kotlin.findCollectionSerializer
    public final void onMediaButtonEvent() {
        this.MediaMetadataCompat = false;
        try {
            super.onMediaButtonEvent();
        } finally {
            if (this.read) {
                this.read = false;
                this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver();
            }
        }
    }

    @Override // kotlin.findCollectionSerializer
    public final void onCustomAction() {
        this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem();
    }

    @Override // kotlin.serializeFieldsUsing, kotlin.buildIndexedListSerializer
    public final boolean onRemoveQueueItemAt() {
        return super.onRemoveQueueItemAt() && this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer();
    }

    @Override // kotlin.serializeFieldsUsing, kotlin.buildIndexedListSerializer
    public final boolean onRemoveQueueItem() {
        return this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver() || super.onRemoveQueueItem();
    }

    @Override // kotlin.putArray
    public final long read() {
        if (RatingCompat() == 2) {
            r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
        }
        return this.AudioAttributesImplApi26Parcelizer;
    }

    @Override // kotlin.putArray
    public final boolean AudioAttributesCompatParcelizer() {
        boolean z = this.MediaMetadataCompat;
        this.MediaMetadataCompat = false;
        return z;
    }

    @Override // kotlin.putArray
    public final void IconCompatParcelizer(DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes) {
        this.AudioAttributesCompatParcelizer.read(defaultBaseTypeLimitingValidatorUnsafeBaseTypes);
    }

    @Override // kotlin.putArray
    public final DefaultBaseTypeLimitingValidatorUnsafeBaseTypes IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
    }

    @Override // kotlin.serializeFieldsUsing
    public final void onSetPlaybackSpeed() {
        super.onSetPlaybackSpeed();
        this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
    }

    @Override // kotlin.serializeFieldsUsing
    public final boolean write(long j, long j2, _ensureOverride _ensureoverride, ByteBuffer byteBuffer, int i, int i2, int i3, long j3, boolean z, boolean z2, C0170format c0170format) throws addNull {
        this.RatingCompat = C.TIME_UNSET;
        if (this.MediaBrowserCompatCustomActionResultReceiver != null && (i2 & 2) != 0) {
            ((_ensureOverride) buildTypeSerializer.IconCompatParcelizer(_ensureoverride)).write(i, false);
            return true;
        }
        if (z) {
            if (_ensureoverride != null) {
                _ensureoverride.write(i, false);
            }
            ((serializeFieldsUsing) this).write.MediaBrowserCompatCustomActionResultReceiver += i3;
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer();
            return true;
        }
        try {
            if (this.AudioAttributesCompatParcelizer.read(byteBuffer, j3, i3)) {
                if (_ensureoverride != null) {
                    _ensureoverride.write(i, false);
                }
                ((serializeFieldsUsing) this).write.AudioAttributesImplApi21Parcelizer += i3;
                return true;
            }
            this.RatingCompat = j3;
            return false;
        } catch (serializePolymorphic.AudioAttributesCompatParcelizer e) {
            throw write(e, this.MediaBrowserCompatSearchResultReceiver, e.IconCompatParcelizer, (!MediaSessionCompatQueueItem() || A_().IconCompatParcelizer == 0) ? PlaybackException.ERROR_CODE_AUDIO_TRACK_INIT_FAILED : 5004);
        } catch (serializePolymorphic.MediaBrowserCompatItemReceiver e2) {
            throw write(e2, c0170format, e2.IconCompatParcelizer, (!MediaSessionCompatQueueItem() || A_().IconCompatParcelizer == 0) ? PlaybackException.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED : 5003);
        }
    }

    @Override // kotlin.serializeFieldsUsing
    public final void onSetCaptioningEnabled() throws addNull {
        try {
            this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer();
            if (onStop() != C.TIME_UNSET) {
                this.RatingCompat = onStop();
            }
        } catch (serializePolymorphic.MediaBrowserCompatItemReceiver e) {
            throw write(e, e.write, e.IconCompatParcelizer, MediaSessionCompatQueueItem() ? 5003 : PlaybackException.ERROR_CODE_AUDIO_TRACK_WRITE_FAILED);
        }
    }

    @Override // kotlin.serializeFieldsUsing, kotlin.findCollectionSerializer, o.buildMapEntrySerializer.write
    public final void AudioAttributesCompatParcelizer(int i, Object obj) throws addNull {
        if (i == 2) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(((Float) buildTypeSerializer.IconCompatParcelizer(obj)).floatValue());
            return;
        }
        if (i == 3) {
            this.AudioAttributesCompatParcelizer.read((JsonIntegerFormatVisitor) buildTypeSerializer.IconCompatParcelizer((JsonIntegerFormatVisitor) obj));
            return;
        }
        if (i == 6) {
            this.AudioAttributesCompatParcelizer.read((expectNumberFormat) buildTypeSerializer.IconCompatParcelizer((expectNumberFormat) obj));
            return;
        }
        if (i == 12) {
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23) {
                write.write(this.AudioAttributesCompatParcelizer, obj);
            }
        } else if (i == 16) {
            this.onAddQueueItem = ((Integer) buildTypeSerializer.IconCompatParcelizer(obj)).intValue();
            ResultReceiver();
        } else if (i == 9) {
            this.AudioAttributesCompatParcelizer.IconCompatParcelizer(((Boolean) buildTypeSerializer.IconCompatParcelizer(obj)).booleanValue());
        } else if (i == 10) {
            this.AudioAttributesCompatParcelizer.write(((Integer) buildTypeSerializer.IconCompatParcelizer(obj)).intValue());
        } else {
            super.AudioAttributesCompatParcelizer(i, obj);
        }
    }

    @Override // kotlin.serializeFieldsUsing
    public final void AudioAttributesCompatParcelizer(_find _findVar) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 29 || _findVar.AudioAttributesCompatParcelizer == null || !Objects.equals(_findVar.AudioAttributesCompatParcelizer.onPlayFromUri, MimeTypes.AUDIO_OPUS) || !MediaSessionCompatQueueItem()) {
            return;
        }
        ByteBuffer byteBuffer = (ByteBuffer) buildTypeSerializer.IconCompatParcelizer(_findVar.write);
        int i = ((C0170format) buildTypeSerializer.IconCompatParcelizer(_findVar.AudioAttributesCompatParcelizer)).MediaDescriptionCompat;
        if (byteBuffer.remaining() == 8) {
            this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(i, (int) ((byteBuffer.order(ByteOrder.LITTLE_ENDIAN).getLong() * 48000) / C.NANOS_PER_SECOND));
        }
    }

    private int RemoteActionCompatParcelizer(_writeNullKeyedEntry _writenullkeyedentry, C0170format c0170format, C0170format[] c0170formatArr) {
        int iAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(_writenullkeyedentry, c0170format);
        if (c0170formatArr.length == 1) {
            return iAudioAttributesCompatParcelizer;
        }
        for (C0170format c0170format2 : c0170formatArr) {
            if (_writenullkeyedentry.AudioAttributesCompatParcelizer(c0170format, c0170format2).RemoteActionCompatParcelizer != 0) {
                iAudioAttributesCompatParcelizer = Math.max(iAudioAttributesCompatParcelizer, AudioAttributesCompatParcelizer(_writenullkeyedentry, c0170format2));
            }
        }
        return iAudioAttributesCompatParcelizer;
    }

    private int AudioAttributesCompatParcelizer(_writeNullKeyedEntry _writenullkeyedentry, C0170format c0170format) {
        if (!"OMX.google.raw.decoder".equals(_writenullkeyedentry.MediaBrowserCompatCustomActionResultReceiver) || LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 24 || (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver == 23 && LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(this.AudioAttributesImplApi21Parcelizer))) {
            return c0170format.onPause;
        }
        return -1;
    }

    private MediaFormat AudioAttributesCompatParcelizer(C0170format c0170format, String str, int i, float f) {
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        mediaFormat.setInteger("channel-count", c0170format.AudioAttributesCompatParcelizer);
        mediaFormat.setInteger("sample-rate", c0170format.onPrepareFromUri);
        _deserializeTypedForId.read(mediaFormat, c0170format.onAddQueueItem);
        _deserializeTypedForId.RemoteActionCompatParcelizer(mediaFormat, "max-input-size", i);
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23) {
            mediaFormat.setInteger("priority", 0);
            if (f != -1.0f && !r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM()) {
                mediaFormat.setFloat("operating-rate", f);
            }
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver <= 28 && MimeTypes.AUDIO_AC4.equals(c0170format.onPlayFromUri)) {
            mediaFormat.setInteger("ac4-is-sync", 1);
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 24 && this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(LaissezFaireSubTypeValidator.read(4, c0170format.AudioAttributesCompatParcelizer, c0170format.onPrepareFromUri)) == 2) {
            mediaFormat.setInteger("pcm-encoding", 4);
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 32) {
            mediaFormat.setInteger("max-output-channel-count", 99);
        }
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 35) {
            mediaFormat.setInteger("importance", Math.max(0, -this.onAddQueueItem));
        }
        return mediaFormat;
    }

    private void ResultReceiver() {
        _ensureOverride _ensureoverrideOnSetShuffleMode = onSetShuffleMode();
        if (_ensureoverrideOnSetShuffleMode == null || LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 35) {
            return;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("importance", Math.max(0, -this.onAddQueueItem));
        _ensureoverrideOnSetShuffleMode.read(bundle);
    }

    private void r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() {
        long jAudioAttributesCompatParcelizer = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(onRemoveQueueItemAt());
        if (jAudioAttributesCompatParcelizer != Long.MIN_VALUE) {
            if (!this.RemoteActionCompatParcelizer) {
                jAudioAttributesCompatParcelizer = Math.max(this.AudioAttributesImplApi26Parcelizer, jAudioAttributesCompatParcelizer);
            }
            this.AudioAttributesImplApi26Parcelizer = jAudioAttributesCompatParcelizer;
            this.RemoteActionCompatParcelizer = false;
        }
    }

    private static boolean r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver == 23) {
            return "ZTE B2017G".equals(LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver) || "AXON 7 mini".equals(LaissezFaireSubTypeValidator.MediaBrowserCompatItemReceiver);
        }
        return false;
    }

    private static boolean AudioAttributesCompatParcelizer(String str) {
        if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver < 24 && "OMX.SEC.aac.dec".equals(str) && "samsung".equals(LaissezFaireSubTypeValidator.read)) {
            return LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer.startsWith("zeroflte") || LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer.startsWith("herolte") || LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer.startsWith("heroqlte");
        }
        return false;
    }

    private static boolean RemoteActionCompatParcelizer(String str) {
        return str.equals("OMX.google.opus.decoder") || str.equals("c2.android.opus.decoder") || str.equals("OMX.google.vorbis.decoder") || str.equals("c2.android.vorbis.decoder");
    }

    final class RemoteActionCompatParcelizer implements serializePolymorphic.IconCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        /* synthetic */ RemoteActionCompatParcelizer(addAndResolveNonTypedSerializer addandresolvenontypedserializer, byte b) {
            this();
        }

        @Override // o.serializePolymorphic.IconCompatParcelizer
        public final void read() {
            addAndResolveNonTypedSerializer.this.onPrepareFromUri();
        }

        @Override // o.serializePolymorphic.IconCompatParcelizer
        public final void write() {
            addAndResolveNonTypedSerializer.AudioAttributesCompatParcelizer(addAndResolveNonTypedSerializer.this);
        }

        @Override // o.serializePolymorphic.IconCompatParcelizer
        public final void write(long j) {
            addAndResolveNonTypedSerializer.this.MediaDescriptionCompat.IconCompatParcelizer(j);
        }

        @Override // o.serializePolymorphic.IconCompatParcelizer
        public final void AudioAttributesCompatParcelizer(int i, long j, long j2) {
            addAndResolveNonTypedSerializer.this.MediaDescriptionCompat.write(i, j, j2);
        }

        @Override // o.serializePolymorphic.IconCompatParcelizer
        public final void write(boolean z) {
            addAndResolveNonTypedSerializer.this.MediaDescriptionCompat.IconCompatParcelizer(z);
        }

        @Override // o.serializePolymorphic.IconCompatParcelizer
        public final void RemoteActionCompatParcelizer() {
            buildIndexedListSerializer.IconCompatParcelizer iconCompatParcelizerPlaybackStateCompat = addAndResolveNonTypedSerializer.this.PlaybackStateCompat();
            if (iconCompatParcelizerPlaybackStateCompat != null) {
                iconCompatParcelizerPlaybackStateCompat.AudioAttributesCompatParcelizer();
            }
        }

        @Override // o.serializePolymorphic.IconCompatParcelizer
        public final void AudioAttributesCompatParcelizer() {
            buildIndexedListSerializer.IconCompatParcelizer iconCompatParcelizerPlaybackStateCompat = addAndResolveNonTypedSerializer.this.PlaybackStateCompat();
            if (iconCompatParcelizerPlaybackStateCompat != null) {
                iconCompatParcelizerPlaybackStateCompat.IconCompatParcelizer();
            }
        }

        @Override // o.serializePolymorphic.IconCompatParcelizer
        public final void IconCompatParcelizer(Exception exc) {
            prune.read("MediaCodecAudioRenderer", "Audio sink error", exc);
            addAndResolveNonTypedSerializer.this.MediaDescriptionCompat.IconCompatParcelizer(exc);
        }

        @Override // o.serializePolymorphic.IconCompatParcelizer
        public final void IconCompatParcelizer() {
            addAndResolveNonTypedSerializer.this.onPlayFromMediaId();
        }

        @Override // o.serializePolymorphic.IconCompatParcelizer
        public final void RemoteActionCompatParcelizer(serializePolymorphic.read readVar) {
            addAndResolveNonTypedSerializer.this.MediaDescriptionCompat.AudioAttributesCompatParcelizer(readVar);
        }

        @Override // o.serializePolymorphic.IconCompatParcelizer
        public final void read(serializePolymorphic.read readVar) {
            addAndResolveNonTypedSerializer.this.MediaDescriptionCompat.read(readVar);
        }
    }

    static final class write {
        public static void write(serializePolymorphic serializepolymorphic, Object obj) {
            serializepolymorphic.RemoteActionCompatParcelizer((AudioDeviceInfo) obj);
        }
    }
}
