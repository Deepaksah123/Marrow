package kotlin;

import android.content.Context;
import android.media.DeniedByServerException;
import android.media.MediaCodec;
import android.media.MediaDrm;
import android.media.MediaDrmResetException;
import android.media.NotProvisionedException;
import android.media.metrics.LogSessionId;
import android.media.metrics.MediaMetricsManager;
import android.media.metrics.NetworkEvent;
import android.media.metrics.PlaybackErrorEvent;
import android.media.metrics.PlaybackMetrics;
import android.media.metrics.PlaybackSession;
import android.media.metrics.PlaybackStateEvent;
import android.media.metrics.TrackChangeEvent;
import android.os.SystemClock;
import android.system.ErrnoException;
import android.system.OsConstants;
import android.util.Pair;
import androidx.media3.common.DrmInitData;
import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.PlaybackException;
import com.google.android.exoplayer2.analytics.AnalyticsListener;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.UUID;
import kotlin.PolymorphicTypeValidator;
import kotlin.PropertySerializerMapDouble;
import kotlin.StdKeySerializers;
import kotlin.TypeDeserializerBase;
import kotlin._deserializeWithNativeTypeId;
import kotlin.baseType;
import kotlin.collectAndResolveSubtypesByTypeId;
import kotlin.findAndAddPrimarySerializer;
import kotlin.findSerializerByAnnotations;
import kotlin.modifyCollectionSerializer;
import kotlin.serializeFieldsUsing;
import kotlin.serializePolymorphic;

/* JADX INFO: loaded from: classes2.dex */
public final class modifyCollectionLikeSerializer implements findSerializerByAnnotations, modifyCollectionSerializer.write {
    private C0170format AudioAttributesImplApi21Parcelizer;
    private C0170format AudioAttributesImplApi26Parcelizer;
    private String IconCompatParcelizer;
    private C0170format MediaBrowserCompatItemReceiver;
    private int MediaBrowserCompatMediaItem;
    private int MediaBrowserCompatSearchResultReceiver;
    private read MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private boolean MediaDescriptionCompat;
    private int MediaMetadataCompat;
    private boolean RatingCompat;
    private final Context RemoteActionCompatParcelizer;
    private validateSubClassName handleMediaPlayPauseIfPendingOnHandler;
    private read onAddQueueItem;
    private PlaybackMetrics.Builder onCommand;
    private read onCustomAction;
    private boolean onFastForward;
    private int onPause;
    private final modifyCollectionSerializer onPlay;
    private final PlaybackSession onPlayFromMediaId;
    private int write;
    private final PolymorphicTypeValidator.IconCompatParcelizer onPrepareFromMediaId = new PolymorphicTypeValidator.IconCompatParcelizer();
    private final PolymorphicTypeValidator.AudioAttributesCompatParcelizer onMediaButtonEvent = new PolymorphicTypeValidator.AudioAttributesCompatParcelizer();
    private final HashMap<String, Long> AudioAttributesCompatParcelizer = new HashMap<>();
    private final HashMap<String, Long> read = new HashMap<>();
    private final long onPlayFromUri = SystemClock.elapsedRealtime();
    private int MediaBrowserCompatCustomActionResultReceiver = 0;
    private int AudioAttributesImplBaseParcelizer = 0;

    private static int IconCompatParcelizer(int i) {
        if (i == 1) {
            return 2;
        }
        if (i != 2) {
            return i != 3 ? 1 : 4;
        }
        return 3;
    }

    public static modifyCollectionLikeSerializer IconCompatParcelizer(Context context) {
        MediaMetricsManager mediaMetricsManager = (MediaMetricsManager) context.getSystemService("media_metrics");
        if (mediaMetricsManager == null) {
            return null;
        }
        return new modifyCollectionLikeSerializer(context, mediaMetricsManager.createPlaybackSession());
    }

    private modifyCollectionLikeSerializer(Context context, PlaybackSession playbackSession) {
        this.RemoteActionCompatParcelizer = context.getApplicationContext();
        this.onPlayFromMediaId = playbackSession;
        changeProperties changeproperties = new changeProperties();
        this.onPlay = changeproperties;
        changeproperties.IconCompatParcelizer(this);
    }

    public final LogSessionId cI_() {
        return this.onPlayFromMediaId.getSessionId();
    }

    @Override // o.modifyCollectionSerializer.write
    public final void write(findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer, String str) {
        if (remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver == null || !remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer()) {
            AudioAttributesCompatParcelizer();
            this.IconCompatParcelizer = str;
            this.onCommand = new PlaybackMetrics.Builder().setPlayerName("AndroidXMedia3").setPlayerVersion("1.4.1");
            write(remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer, remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver);
        }
    }

    @Override // o.modifyCollectionSerializer.write
    public final void IconCompatParcelizer(findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer, String str) {
        if ((remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver == null || !remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer()) && str.equals(this.IconCompatParcelizer)) {
            AudioAttributesCompatParcelizer();
        }
        this.read.remove(str);
        this.AudioAttributesCompatParcelizer.remove(str);
    }

    @Override // kotlin.findSerializerByAnnotations
    public final void AudioAttributesCompatParcelizer(int i) {
        if (i == 1) {
            this.RatingCompat = true;
        }
        this.MediaMetadataCompat = i;
    }

    @Override // kotlin.findSerializerByAnnotations
    public final void read(_at _atVar) {
        this.MediaBrowserCompatSearchResultReceiver += _atVar.AudioAttributesCompatParcelizer;
        this.onPause += _atVar.AudioAttributesImplApi21Parcelizer;
    }

    @Override // kotlin.findSerializerByAnnotations
    public final void write(findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer, int i, long j) {
        if (remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver != null) {
            String strRemoteActionCompatParcelizer = this.onPlay.RemoteActionCompatParcelizer(remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer, (StdKeySerializers.write) buildTypeSerializer.IconCompatParcelizer(remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver));
            Long l = this.AudioAttributesCompatParcelizer.get(strRemoteActionCompatParcelizer);
            Long l2 = this.read.get(strRemoteActionCompatParcelizer);
            this.AudioAttributesCompatParcelizer.put(strRemoteActionCompatParcelizer, Long.valueOf((l == null ? 0L : l.longValue()) + j));
            this.read.put(strRemoteActionCompatParcelizer, Long.valueOf((l2 != null ? l2.longValue() : 0L) + ((long) i)));
        }
    }

    @Override // kotlin.findSerializerByAnnotations
    public final void write(findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizer, StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
        if (remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver != null) {
            read readVar = new read((C0170format) buildTypeSerializer.IconCompatParcelizer(stdArraySerializersShortArraySerializer.read), stdArraySerializersShortArraySerializer.MediaBrowserCompatItemReceiver, this.onPlay.RemoteActionCompatParcelizer(remoteActionCompatParcelizer.AudioAttributesImplApi21Parcelizer, (StdKeySerializers.write) buildTypeSerializer.IconCompatParcelizer(remoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver)));
            int i = stdArraySerializersShortArraySerializer.AudioAttributesImplApi21Parcelizer;
            if (i != 0) {
                if (i == 1) {
                    this.onCustomAction = readVar;
                    return;
                } else if (i != 2) {
                    if (i != 3) {
                        return;
                    }
                    this.onAddQueueItem = readVar;
                    return;
                }
            }
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = readVar;
        }
    }

    @Override // kotlin.findSerializerByAnnotations
    public final void AudioAttributesCompatParcelizer(deserializeTypedFromObject deserializetypedfromobject) {
        read readVar = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        if (readVar == null || readVar.AudioAttributesCompatParcelizer.MediaMetadataCompat != -1) {
            return;
        }
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new read(readVar.AudioAttributesCompatParcelizer.write().onFastForward(deserializetypedfromobject.write).MediaBrowserCompatItemReceiver(deserializetypedfromobject.AudioAttributesCompatParcelizer).IconCompatParcelizer(), readVar.IconCompatParcelizer, readVar.write);
    }

    @Override // kotlin.findSerializerByAnnotations
    public final void RemoteActionCompatParcelizer(StdArraySerializersShortArraySerializer stdArraySerializersShortArraySerializer) {
        this.MediaBrowserCompatMediaItem = stdArraySerializersShortArraySerializer.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.findSerializerByAnnotations
    public final void IconCompatParcelizer(validateSubClassName validatesubclassname) {
        this.handleMediaPlayPauseIfPendingOnHandler = validatesubclassname;
    }

    @Override // kotlin.findSerializerByAnnotations
    public final void write(isUnsafeBaseType isunsafebasetype, findSerializerByAnnotations.read readVar) {
        if (readVar.read() != 0) {
            IconCompatParcelizer(readVar);
            long jElapsedRealtime = SystemClock.elapsedRealtime();
            RemoteActionCompatParcelizer(isunsafebasetype, readVar);
            read(jElapsedRealtime);
            write(isunsafebasetype, readVar, jElapsedRealtime);
            AudioAttributesCompatParcelizer(jElapsedRealtime);
            IconCompatParcelizer(isunsafebasetype, readVar, jElapsedRealtime);
            if (readVar.AudioAttributesCompatParcelizer(AnalyticsListener.EVENT_PLAYER_RELEASED)) {
                this.onPlay.AudioAttributesCompatParcelizer(readVar.IconCompatParcelizer(AnalyticsListener.EVENT_PLAYER_RELEASED));
            }
        }
    }

    private void IconCompatParcelizer(findSerializerByAnnotations.read readVar) {
        for (int i = 0; i < readVar.read(); i++) {
            int iWrite = readVar.write(i);
            findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = readVar.IconCompatParcelizer(iWrite);
            if (iWrite == 0) {
                this.onPlay.IconCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer);
            } else if (iWrite == 11) {
                this.onPlay.AudioAttributesCompatParcelizer(remoteActionCompatParcelizerIconCompatParcelizer, this.MediaMetadataCompat);
            } else {
                this.onPlay.write(remoteActionCompatParcelizerIconCompatParcelizer);
            }
        }
    }

    private void RemoteActionCompatParcelizer(isUnsafeBaseType isunsafebasetype, findSerializerByAnnotations.read readVar) {
        DrmInitData drmInitData;
        if (readVar.AudioAttributesCompatParcelizer(0)) {
            findSerializerByAnnotations.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = readVar.IconCompatParcelizer(0);
            if (this.onCommand != null) {
                write(remoteActionCompatParcelizerIconCompatParcelizer.AudioAttributesImplApi21Parcelizer, remoteActionCompatParcelizerIconCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver);
            }
        }
        if (readVar.AudioAttributesCompatParcelizer(2) && this.onCommand != null && (drmInitData = read(isunsafebasetype.onPrepareFromSearch().IconCompatParcelizer())) != null) {
            ((PlaybackMetrics.Builder) LaissezFaireSubTypeValidator.IconCompatParcelizer(this.onCommand)).setDrmType(AudioAttributesCompatParcelizer(drmInitData));
        }
        if (readVar.AudioAttributesCompatParcelizer(AnalyticsListener.EVENT_AUDIO_UNDERRUN)) {
            this.write++;
        }
    }

    private void read(long j) {
        validateSubClassName validatesubclassname = this.handleMediaPlayPauseIfPendingOnHandler;
        if (validatesubclassname == null) {
            return;
        }
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = read(validatesubclassname, this.RemoteActionCompatParcelizer, this.MediaBrowserCompatMediaItem == 4);
        this.onPlayFromMediaId.reportPlaybackErrorEvent(new PlaybackErrorEvent.Builder().setTimeSinceCreatedMillis(j - this.onPlayFromUri).setErrorCode(audioAttributesCompatParcelizer.write).setSubErrorCode(audioAttributesCompatParcelizer.RemoteActionCompatParcelizer).setException(validatesubclassname).build());
        this.onFastForward = true;
        this.handleMediaPlayPauseIfPendingOnHandler = null;
    }

    private void write(isUnsafeBaseType isunsafebasetype, findSerializerByAnnotations.read readVar, long j) {
        if (readVar.AudioAttributesCompatParcelizer(2)) {
            collectAndResolveSubtypesByTypeId collectandresolvesubtypesbytypeidOnPrepareFromSearch = isunsafebasetype.onPrepareFromSearch();
            boolean zIconCompatParcelizer = collectandresolvesubtypesbytypeidOnPrepareFromSearch.IconCompatParcelizer(2);
            boolean zIconCompatParcelizer2 = collectandresolvesubtypesbytypeidOnPrepareFromSearch.IconCompatParcelizer(1);
            boolean zIconCompatParcelizer3 = collectandresolvesubtypesbytypeidOnPrepareFromSearch.IconCompatParcelizer(3);
            if (zIconCompatParcelizer || zIconCompatParcelizer2 || zIconCompatParcelizer3) {
                if (!zIconCompatParcelizer) {
                    write(j, (C0170format) null, 0);
                }
                if (!zIconCompatParcelizer2) {
                    AudioAttributesCompatParcelizer(j, null, 0);
                }
                if (!zIconCompatParcelizer3) {
                    IconCompatParcelizer(j, (C0170format) null, 0);
                }
            }
        }
        if (read(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) && this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer.MediaMetadataCompat != -1) {
            write(j, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.AudioAttributesCompatParcelizer, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver.IconCompatParcelizer);
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = null;
        }
        if (read(this.onCustomAction)) {
            AudioAttributesCompatParcelizer(j, this.onCustomAction.AudioAttributesCompatParcelizer, this.onCustomAction.IconCompatParcelizer);
            this.onCustomAction = null;
        }
        if (read(this.onAddQueueItem)) {
            IconCompatParcelizer(j, this.onAddQueueItem.AudioAttributesCompatParcelizer, this.onAddQueueItem.IconCompatParcelizer);
            this.onAddQueueItem = null;
        }
    }

    private boolean read(read readVar) {
        return readVar != null && readVar.write.equals(this.onPlay.write());
    }

    private void AudioAttributesCompatParcelizer(long j) {
        int i = read(this.RemoteActionCompatParcelizer);
        if (i != this.AudioAttributesImplBaseParcelizer) {
            this.AudioAttributesImplBaseParcelizer = i;
            this.onPlayFromMediaId.reportNetworkEvent(new NetworkEvent.Builder().setNetworkType(i).setTimeSinceCreatedMillis(j - this.onPlayFromUri).build());
        }
    }

    private void IconCompatParcelizer(isUnsafeBaseType isunsafebasetype, findSerializerByAnnotations.read readVar, long j) {
        if (isunsafebasetype.onRewind() != 2) {
            this.RatingCompat = false;
        }
        if (isunsafebasetype.getPlayerError() == null) {
            this.MediaDescriptionCompat = false;
        } else if (readVar.AudioAttributesCompatParcelizer(10)) {
            this.MediaDescriptionCompat = true;
        }
        int iRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(isunsafebasetype);
        if (this.MediaBrowserCompatCustomActionResultReceiver != iRemoteActionCompatParcelizer) {
            this.MediaBrowserCompatCustomActionResultReceiver = iRemoteActionCompatParcelizer;
            this.onFastForward = true;
            this.onPlayFromMediaId.reportPlaybackStateEvent(new PlaybackStateEvent.Builder().setState(this.MediaBrowserCompatCustomActionResultReceiver).setTimeSinceCreatedMillis(j - this.onPlayFromUri).build());
        }
    }

    private int RemoteActionCompatParcelizer(isUnsafeBaseType isunsafebasetype) {
        int iOnRewind = isunsafebasetype.onRewind();
        if (this.RatingCompat) {
            return 5;
        }
        if (this.MediaDescriptionCompat) {
            return 13;
        }
        if (iOnRewind == 4) {
            return 11;
        }
        if (iOnRewind == 2) {
            int i = this.MediaBrowserCompatCustomActionResultReceiver;
            if (i == 0 || i == 2 || i == 12) {
                return 2;
            }
            if (isunsafebasetype.onPrepareFromUri()) {
                return isunsafebasetype.onSeekTo() != 0 ? 10 : 6;
            }
            return 7;
        }
        if (iOnRewind == 3) {
            if (isunsafebasetype.onPrepareFromUri()) {
                return isunsafebasetype.onSeekTo() != 0 ? 9 : 3;
            }
            return 4;
        }
        if (iOnRewind != 1 || this.MediaBrowserCompatCustomActionResultReceiver == 0) {
            return this.MediaBrowserCompatCustomActionResultReceiver;
        }
        return 12;
    }

    private void write(long j, C0170format c0170format, int i) {
        if (LaissezFaireSubTypeValidator.read(this.AudioAttributesImplApi21Parcelizer, c0170format)) {
            return;
        }
        if (this.AudioAttributesImplApi21Parcelizer == null && i == 0) {
            i = 1;
        }
        this.AudioAttributesImplApi21Parcelizer = c0170format;
        AudioAttributesCompatParcelizer(1, j, c0170format, i);
    }

    private void AudioAttributesCompatParcelizer(long j, C0170format c0170format, int i) {
        if (LaissezFaireSubTypeValidator.read(this.AudioAttributesImplApi26Parcelizer, c0170format)) {
            return;
        }
        if (this.AudioAttributesImplApi26Parcelizer == null && i == 0) {
            i = 1;
        }
        this.AudioAttributesImplApi26Parcelizer = c0170format;
        AudioAttributesCompatParcelizer(0, j, c0170format, i);
    }

    private void IconCompatParcelizer(long j, C0170format c0170format, int i) {
        if (LaissezFaireSubTypeValidator.read(this.MediaBrowserCompatItemReceiver, c0170format)) {
            return;
        }
        if (this.MediaBrowserCompatItemReceiver == null && i == 0) {
            i = 1;
        }
        this.MediaBrowserCompatItemReceiver = c0170format;
        AudioAttributesCompatParcelizer(2, j, c0170format, i);
    }

    private void AudioAttributesCompatParcelizer(int i, long j, C0170format c0170format, int i2) {
        TrackChangeEvent.Builder timeSinceCreatedMillis = new TrackChangeEvent.Builder(i).setTimeSinceCreatedMillis(j - this.onPlayFromUri);
        if (c0170format != null) {
            timeSinceCreatedMillis.setTrackState(1);
            timeSinceCreatedMillis.setTrackChangeReason(IconCompatParcelizer(i2));
            if (c0170format.AudioAttributesImplApi21Parcelizer != null) {
                timeSinceCreatedMillis.setContainerMimeType(c0170format.AudioAttributesImplApi21Parcelizer);
            }
            if (c0170format.onPlayFromUri != null) {
                timeSinceCreatedMillis.setSampleMimeType(c0170format.onPlayFromUri);
            }
            if (c0170format.RemoteActionCompatParcelizer != null) {
                timeSinceCreatedMillis.setCodecName(c0170format.RemoteActionCompatParcelizer);
            }
            if (c0170format.read != -1) {
                timeSinceCreatedMillis.setBitrate(c0170format.read);
            }
            if (c0170format.onSetCaptioningEnabled != -1) {
                timeSinceCreatedMillis.setWidth(c0170format.onSetCaptioningEnabled);
            }
            if (c0170format.MediaMetadataCompat != -1) {
                timeSinceCreatedMillis.setHeight(c0170format.MediaMetadataCompat);
            }
            if (c0170format.AudioAttributesCompatParcelizer != -1) {
                timeSinceCreatedMillis.setChannelCount(c0170format.AudioAttributesCompatParcelizer);
            }
            if (c0170format.onPrepareFromUri != -1) {
                timeSinceCreatedMillis.setAudioSampleRate(c0170format.onPrepareFromUri);
            }
            if (c0170format.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver != null) {
                Pair<String, String> pairIconCompatParcelizer = IconCompatParcelizer(c0170format.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
                timeSinceCreatedMillis.setLanguage((String) pairIconCompatParcelizer.first);
                if (pairIconCompatParcelizer.second != null) {
                    timeSinceCreatedMillis.setLanguageRegion((String) pairIconCompatParcelizer.second);
                }
            }
            if (c0170format.RatingCompat != -1.0f) {
                timeSinceCreatedMillis.setVideoFrameRate(c0170format.RatingCompat);
            }
        } else {
            timeSinceCreatedMillis.setTrackState(0);
        }
        this.onFastForward = true;
        this.onPlayFromMediaId.reportTrackChangeEvent(timeSinceCreatedMillis.build());
    }

    private void write(PolymorphicTypeValidator polymorphicTypeValidator, StdKeySerializers.write writeVar) {
        int i;
        PlaybackMetrics.Builder builder = this.onCommand;
        if (writeVar == null || (i = polymorphicTypeValidator.read(writeVar.AudioAttributesCompatParcelizer)) == -1) {
            return;
        }
        polymorphicTypeValidator.AudioAttributesCompatParcelizer(i, this.onMediaButtonEvent);
        polymorphicTypeValidator.RemoteActionCompatParcelizer(this.onMediaButtonEvent.AudioAttributesImplBaseParcelizer, this.onPrepareFromMediaId);
        builder.setStreamType(RemoteActionCompatParcelizer(this.onPrepareFromMediaId.AudioAttributesImplApi26Parcelizer));
        if (this.onPrepareFromMediaId.IconCompatParcelizer != C.TIME_UNSET && !this.onPrepareFromMediaId.MediaBrowserCompatItemReceiver && !this.onPrepareFromMediaId.write && !this.onPrepareFromMediaId.AudioAttributesImplApi26Parcelizer()) {
            builder.setMediaDurationMillis(this.onPrepareFromMediaId.write());
        }
        builder.setPlaybackType(this.onPrepareFromMediaId.AudioAttributesImplApi26Parcelizer() ? 2 : 1);
        this.onFastForward = true;
    }

    private void AudioAttributesCompatParcelizer() {
        PlaybackMetrics.Builder builder = this.onCommand;
        if (builder != null && this.onFastForward) {
            builder.setAudioUnderrunCount(this.write);
            this.onCommand.setVideoFramesDropped(this.MediaBrowserCompatSearchResultReceiver);
            this.onCommand.setVideoFramesPlayed(this.onPause);
            Long l = this.read.get(this.IconCompatParcelizer);
            this.onCommand.setNetworkTransferDurationMillis(l == null ? 0L : l.longValue());
            Long l2 = this.AudioAttributesCompatParcelizer.get(this.IconCompatParcelizer);
            this.onCommand.setNetworkBytesRead(l2 == null ? 0L : l2.longValue());
            this.onCommand.setStreamSource((l2 == null || l2.longValue() <= 0) ? 0 : 1);
            this.onPlayFromMediaId.reportPlaybackMetrics(this.onCommand.build());
        }
        this.onCommand = null;
        this.IconCompatParcelizer = null;
        this.write = 0;
        this.MediaBrowserCompatSearchResultReceiver = 0;
        this.onPause = 0;
        this.AudioAttributesImplApi21Parcelizer = null;
        this.AudioAttributesImplApi26Parcelizer = null;
        this.MediaBrowserCompatItemReceiver = null;
        this.onFastForward = false;
    }

    private static Pair<String, String> IconCompatParcelizer(String str) {
        String[] strArrAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(str, "-");
        return Pair.create(strArrAudioAttributesCompatParcelizer[0], strArrAudioAttributesCompatParcelizer.length >= 2 ? strArrAudioAttributesCompatParcelizer[1] : null);
    }

    private static int read(Context context) {
        switch (AsExternalTypeDeserializer.RemoteActionCompatParcelizer(context).read()) {
            case 0:
                return 0;
            case 1:
                return 9;
            case 2:
                return 2;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
            case 8:
            default:
                return 1;
            case 7:
                return 3;
            case 9:
                return 8;
            case 10:
                return 7;
        }
    }

    private static int RemoteActionCompatParcelizer(JsonSerializableSchema jsonSerializableSchema) {
        if (jsonSerializableSchema.AudioAttributesCompatParcelizer == null) {
            return 0;
        }
        int i = LaissezFaireSubTypeValidator.read(jsonSerializableSchema.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver, jsonSerializableSchema.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer);
        if (i == 0) {
            return 3;
        }
        if (i != 1) {
            return i != 2 ? 1 : 4;
        }
        return 5;
    }

    private static AudioAttributesCompatParcelizer read(validateSubClassName validatesubclassname, Context context, boolean z) {
        int i;
        boolean z2;
        if (validatesubclassname.IconCompatParcelizer == 1001) {
            return new AudioAttributesCompatParcelizer(20, 0);
        }
        if (validatesubclassname instanceof addNull) {
            addNull addnull = (addNull) validatesubclassname;
            z2 = addnull.AudioAttributesImplApi26Parcelizer == 1;
            i = addnull.AudioAttributesImplApi21Parcelizer;
        } else {
            i = 0;
            z2 = false;
        }
        Throwable th = (Throwable) buildTypeSerializer.IconCompatParcelizer(validatesubclassname.getCause());
        if (!(th instanceof IOException)) {
            if (z2 && (i == 0 || i == 1)) {
                return new AudioAttributesCompatParcelizer(35, 0);
            }
            if (z2 && i == 3) {
                return new AudioAttributesCompatParcelizer(15, 0);
            }
            if (z2 && i == 2) {
                return new AudioAttributesCompatParcelizer(23, 0);
            }
            if (th instanceof serializeFieldsUsing.RemoteActionCompatParcelizer) {
                return new AudioAttributesCompatParcelizer(13, LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(((serializeFieldsUsing.RemoteActionCompatParcelizer) th).IconCompatParcelizer));
            }
            if (th instanceof _hasNullKey) {
                return new AudioAttributesCompatParcelizer(14, ((_hasNullKey) th).write);
            }
            if (th instanceof OutOfMemoryError) {
                return new AudioAttributesCompatParcelizer(14, 0);
            }
            if (th instanceof serializePolymorphic.AudioAttributesCompatParcelizer) {
                return new AudioAttributesCompatParcelizer(17, ((serializePolymorphic.AudioAttributesCompatParcelizer) th).RemoteActionCompatParcelizer);
            }
            if (th instanceof serializePolymorphic.MediaBrowserCompatItemReceiver) {
                return new AudioAttributesCompatParcelizer(18, ((serializePolymorphic.MediaBrowserCompatItemReceiver) th).read);
            }
            if (th instanceof MediaCodec.CryptoException) {
                int errorCode = ((MediaCodec.CryptoException) th).getErrorCode();
                return new AudioAttributesCompatParcelizer(write(errorCode), errorCode);
            }
            return new AudioAttributesCompatParcelizer(22, 0);
        }
        if (th instanceof _deserializeWithNativeTypeId.write) {
            return new AudioAttributesCompatParcelizer(5, ((_deserializeWithNativeTypeId.write) th).AudioAttributesImplApi26Parcelizer);
        }
        if ((th instanceof _deserializeWithNativeTypeId.RemoteActionCompatParcelizer) || (th instanceof SchemaAware)) {
            return new AudioAttributesCompatParcelizer(z ? 10 : 11, 0);
        }
        boolean z3 = th instanceof _deserializeWithNativeTypeId.read;
        if (z3 || (th instanceof baseType.AudioAttributesCompatParcelizer)) {
            if (AsExternalTypeDeserializer.RemoteActionCompatParcelizer(context).read() == 1) {
                return new AudioAttributesCompatParcelizer(3, 0);
            }
            Throwable cause = th.getCause();
            if (cause instanceof UnknownHostException) {
                return new AudioAttributesCompatParcelizer(6, 0);
            }
            if (cause instanceof SocketTimeoutException) {
                return new AudioAttributesCompatParcelizer(7, 0);
            }
            if (z3 && ((_deserializeWithNativeTypeId.read) th).IconCompatParcelizer == 1) {
                return new AudioAttributesCompatParcelizer(4, 0);
            }
            return new AudioAttributesCompatParcelizer(8, 0);
        }
        if (validatesubclassname.IconCompatParcelizer == 1002) {
            return new AudioAttributesCompatParcelizer(21, 0);
        }
        if (th instanceof PropertySerializerMapDouble.IconCompatParcelizer) {
            Throwable th2 = (Throwable) buildTypeSerializer.IconCompatParcelizer(th.getCause());
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21 && (th2 instanceof MediaDrm.MediaDrmStateException)) {
                int iAudioAttributesCompatParcelizer = LaissezFaireSubTypeValidator.AudioAttributesCompatParcelizer(((MediaDrm.MediaDrmStateException) th2).getDiagnosticInfo());
                return new AudioAttributesCompatParcelizer(write(iAudioAttributesCompatParcelizer), iAudioAttributesCompatParcelizer);
            }
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 23 && (th2 instanceof MediaDrmResetException)) {
                return new AudioAttributesCompatParcelizer(27, 0);
            }
            if (th2 instanceof NotProvisionedException) {
                return new AudioAttributesCompatParcelizer(24, 0);
            }
            if (th2 instanceof DeniedByServerException) {
                return new AudioAttributesCompatParcelizer(29, 0);
            }
            if (th2 instanceof UnwrappingBeanPropertyWriter1) {
                return new AudioAttributesCompatParcelizer(23, 0);
            }
            if (th2 instanceof findAndAddPrimarySerializer.write) {
                return new AudioAttributesCompatParcelizer(28, 0);
            }
            return new AudioAttributesCompatParcelizer(30, 0);
        }
        if ((th instanceof TypeDeserializerBase.IconCompatParcelizer) && (th.getCause() instanceof FileNotFoundException)) {
            Throwable cause2 = ((Throwable) buildTypeSerializer.IconCompatParcelizer(th.getCause())).getCause();
            if (LaissezFaireSubTypeValidator.MediaBrowserCompatCustomActionResultReceiver >= 21 && (cause2 instanceof ErrnoException) && ((ErrnoException) cause2).errno == OsConstants.EACCES) {
                return new AudioAttributesCompatParcelizer(32, 0);
            }
            return new AudioAttributesCompatParcelizer(31, 0);
        }
        return new AudioAttributesCompatParcelizer(9, 0);
    }

    private static DrmInitData read(initExtraTracks<collectAndResolveSubtypesByTypeId.write> initextratracks) {
        DrmInitData drmInitData;
        getCurrentSampleFlags<collectAndResolveSubtypesByTypeId.write> it = initextratracks.iterator();
        while (it.hasNext()) {
            collectAndResolveSubtypesByTypeId.write next = it.next();
            for (int i = 0; i < next.IconCompatParcelizer; i++) {
                if (next.read(i) && (drmInitData = next.RemoteActionCompatParcelizer(i).MediaBrowserCompatMediaItem) != null) {
                    return drmInitData;
                }
            }
        }
        return null;
    }

    private static int AudioAttributesCompatParcelizer(DrmInitData drmInitData) {
        for (int i = 0; i < drmInitData.IconCompatParcelizer; i++) {
            UUID uuid = drmInitData.write(i).AudioAttributesCompatParcelizer;
            if (uuid.equals(JsonMapFormatVisitor.IconCompatParcelizer)) {
                return 3;
            }
            if (uuid.equals(JsonMapFormatVisitor.RemoteActionCompatParcelizer)) {
                return 2;
            }
            if (uuid.equals(JsonMapFormatVisitor.AudioAttributesCompatParcelizer)) {
                return 6;
            }
        }
        return 1;
    }

    private static int write(int i) {
        switch (LaissezFaireSubTypeValidator.IconCompatParcelizer(i)) {
            case PlaybackException.ERROR_CODE_DRM_PROVISIONING_FAILED /* 6002 */:
                return 24;
            case PlaybackException.ERROR_CODE_DRM_CONTENT_ERROR /* 6003 */:
                return 28;
            case PlaybackException.ERROR_CODE_DRM_LICENSE_ACQUISITION_FAILED /* 6004 */:
                return 25;
            case PlaybackException.ERROR_CODE_DRM_DISALLOWED_OPERATION /* 6005 */:
                return 26;
            default:
                return 27;
        }
    }

    static final class AudioAttributesCompatParcelizer {
        public final int RemoteActionCompatParcelizer;
        public final int write;

        public AudioAttributesCompatParcelizer(int i, int i2) {
            this.write = i;
            this.RemoteActionCompatParcelizer = i2;
        }
    }

    static final class read {
        public final C0170format AudioAttributesCompatParcelizer;
        public final int IconCompatParcelizer;
        public final String write;

        public read(C0170format c0170format, int i, String str) {
            this.AudioAttributesCompatParcelizer = c0170format;
            this.IconCompatParcelizer = i;
            this.write = str;
        }
    }
}
