package kotlin;

import android.os.Looper;
import android.view.SurfaceView;
import android.view.TextureView;
import java.util.List;
import kotlin.enumTypes;

/* JADX INFO: loaded from: classes2.dex */
public interface isUnsafeBaseType {

    public interface AudioAttributesCompatParcelizer {
        default void AudioAttributesCompatParcelizer() {
        }

        default void AudioAttributesCompatParcelizer(int i) {
        }

        default void AudioAttributesCompatParcelizer(SubtypeResolver subtypeResolver) {
        }

        default void AudioAttributesCompatParcelizer(getSchema getschema) {
        }

        default void AudioAttributesCompatParcelizer(write writeVar, write writeVar2, int i) {
        }

        default void AudioAttributesCompatParcelizer(boolean z) {
        }

        default void IconCompatParcelizer(float f) {
        }

        default void IconCompatParcelizer(int i) {
        }

        default void IconCompatParcelizer(deserializeTypedFromObject deserializetypedfromobject) {
        }

        default void IconCompatParcelizer(isUnsafeBaseType isunsafebasetype, RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        }

        default void IconCompatParcelizer(validateSubClassName validatesubclassname) {
        }

        default void IconCompatParcelizer(boolean z) {
        }

        default void RemoteActionCompatParcelizer(int i) {
        }

        default void RemoteActionCompatParcelizer(int i, int i2) {
        }

        default void RemoteActionCompatParcelizer(DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes) {
        }

        default void RemoteActionCompatParcelizer(JsonSerializableSchema jsonSerializableSchema, int i) {
        }

        default void RemoteActionCompatParcelizer(PolymorphicTypeValidator polymorphicTypeValidator, int i) {
        }

        default void RemoteActionCompatParcelizer(collectAndResolveSubtypesByTypeId collectandresolvesubtypesbytypeid) {
        }

        default void RemoteActionCompatParcelizer(read readVar) {
        }

        default void RemoteActionCompatParcelizer(boolean z) {
        }

        default void RemoteActionCompatParcelizer(boolean z, int i) {
        }

        default void read(int i) {
        }

        default void read(int i, boolean z) {
        }

        default void read(androidx.media3.common.Metadata metadata) {
        }

        default void read(boolean z) {
        }

        @Deprecated
        default void write(List<getDefaultImpl> list) {
        }

        default void write(idFromValue idfromvalue) {
        }

        default void write(validateSubClassName validatesubclassname) {
        }

        @Deprecated
        default void write(boolean z, int i) {
        }
    }

    void AudioAttributesCompatParcelizer(long j);

    void AudioAttributesCompatParcelizer(SurfaceView surfaceView);

    void AudioAttributesCompatParcelizer(DefaultBaseTypeLimitingValidatorUnsafeBaseTypes defaultBaseTypeLimitingValidatorUnsafeBaseTypes);

    void AudioAttributesCompatParcelizer(SubtypeResolver subtypeResolver);

    void AudioAttributesCompatParcelizer(boolean z);

    boolean AudioAttributesCompatParcelizer();

    void AudioAttributesImplApi21Parcelizer();

    void AudioAttributesImplApi26Parcelizer();

    boolean AudioAttributesImplBaseParcelizer();

    int IconCompatParcelizer();

    void IconCompatParcelizer(int i);

    void IconCompatParcelizer(int i, long j);

    void IconCompatParcelizer(TextureView textureView);

    void IconCompatParcelizer(boolean z);

    boolean MediaBrowserCompatCustomActionResultReceiver();

    boolean MediaBrowserCompatItemReceiver();

    void MediaBrowserCompatMediaItem();

    void MediaBrowserCompatSearchResultReceiver();

    read MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();

    void MediaDescriptionCompat();

    void MediaMetadataCompat();

    void ParcelableVolumeInfo();

    void RatingCompat();

    long RemoteActionCompatParcelizer();

    void RemoteActionCompatParcelizer(List<JsonSerializableSchema> list);

    validateSubClassName getPlayerError();

    long handleMediaPlayPauseIfPendingOnHandler();

    long onAddQueueItem();

    Looper onCommand();

    long onCustomAction();

    int onFastForward();

    int onMediaButtonEvent();

    int onPause();

    int onPlay();

    idFromValue onPlayFromMediaId();

    long onPlayFromSearch();

    long onPlayFromUri();

    PolymorphicTypeValidator onPrepare();

    long onPrepareFromMediaId();

    collectAndResolveSubtypesByTypeId onPrepareFromSearch();

    boolean onPrepareFromUri();

    getSchema onRemoveQueueItem();

    DefaultBaseTypeLimitingValidatorUnsafeBaseTypes onRemoveQueueItemAt();

    int onRewind();

    int onSeekTo();

    long onSetCaptioningEnabled();

    boolean onSetPlaybackSpeed();

    long onSetRating();

    long onSetRepeatMode();

    int onSetShuffleMode();

    float onSkipToNext();

    deserializeTypedFromObject onSkipToPrevious();

    void onSkipToQueueItem();

    SubtypeResolver onStop();

    void read(float f);

    void read(SurfaceView surfaceView);

    void read(JsonSerializableSchema jsonSerializableSchema);

    void read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer);

    boolean read();

    void replaceMediaItems(int i, int i2, List<JsonSerializableSchema> list);

    boolean setSessionImpl();

    void write(TextureView textureView);

    void write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer);

    boolean write();

    boolean write(int i);

    public static final class RemoteActionCompatParcelizer {
        private final enumTypes read;

        public RemoteActionCompatParcelizer(enumTypes enumtypes) {
            this.read = enumtypes;
        }

        public final boolean AudioAttributesCompatParcelizer(int i) {
            return this.read.AudioAttributesCompatParcelizer(i);
        }

        public final boolean read(int... iArr) {
            return this.read.write(iArr);
        }

        public final int hashCode() {
            return this.read.hashCode();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof RemoteActionCompatParcelizer) {
                return this.read.equals(((RemoteActionCompatParcelizer) obj).read);
            }
            return false;
        }
    }

    public static final class write {
        public final long AudioAttributesCompatParcelizer;
        public final int AudioAttributesImplApi21Parcelizer;
        public final long AudioAttributesImplApi26Parcelizer;

        @Deprecated
        public final int AudioAttributesImplBaseParcelizer;
        public final int IconCompatParcelizer;
        public final Object MediaBrowserCompatCustomActionResultReceiver;
        public final Object MediaBrowserCompatItemReceiver;
        public final int RemoteActionCompatParcelizer;
        public final int read;
        public final JsonSerializableSchema write;

        public write(Object obj, int i, JsonSerializableSchema jsonSerializableSchema, Object obj2, int i2, long j, long j2, int i3, int i4) {
            this.MediaBrowserCompatCustomActionResultReceiver = obj;
            this.AudioAttributesImplBaseParcelizer = i;
            this.read = i;
            this.write = jsonSerializableSchema;
            this.MediaBrowserCompatItemReceiver = obj2;
            this.AudioAttributesImplApi21Parcelizer = i2;
            this.AudioAttributesImplApi26Parcelizer = j;
            this.AudioAttributesCompatParcelizer = j2;
            this.RemoteActionCompatParcelizer = i3;
            this.IconCompatParcelizer = i4;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            write writeVar = (write) obj;
            return AudioAttributesCompatParcelizer(writeVar) && parseSmta.AudioAttributesCompatParcelizer(this.MediaBrowserCompatCustomActionResultReceiver, writeVar.MediaBrowserCompatCustomActionResultReceiver) && parseSmta.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver, writeVar.MediaBrowserCompatItemReceiver);
        }

        public final int hashCode() {
            Object obj = this.MediaBrowserCompatCustomActionResultReceiver;
            int i = this.read;
            return parseSmta.read(obj, Integer.valueOf(i), this.write, this.MediaBrowserCompatItemReceiver, Integer.valueOf(this.AudioAttributesImplApi21Parcelizer), Long.valueOf(this.AudioAttributesImplApi26Parcelizer), Long.valueOf(this.AudioAttributesCompatParcelizer), Integer.valueOf(this.RemoteActionCompatParcelizer), Integer.valueOf(this.IconCompatParcelizer));
        }

        private boolean AudioAttributesCompatParcelizer(write writeVar) {
            return this.read == writeVar.read && this.AudioAttributesImplApi21Parcelizer == writeVar.AudioAttributesImplApi21Parcelizer && this.AudioAttributesImplApi26Parcelizer == writeVar.AudioAttributesImplApi26Parcelizer && this.AudioAttributesCompatParcelizer == writeVar.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == writeVar.RemoteActionCompatParcelizer && this.IconCompatParcelizer == writeVar.IconCompatParcelizer && parseSmta.AudioAttributesCompatParcelizer(this.write, writeVar.write);
        }

        static {
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(1);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(2);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(3);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(4);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(5);
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(6);
        }
    }

    public static final class read {
        private final enumTypes read;

        /* synthetic */ read(enumTypes enumtypes, byte b) {
            this(enumtypes);
        }

        /* JADX INFO: renamed from: o.isUnsafeBaseType$read$read, reason: collision with other inner class name */
        public static final class C0120read {
            private final enumTypes.write read = new enumTypes.write();

            public final C0120read IconCompatParcelizer(int i) {
                this.read.RemoteActionCompatParcelizer(i);
                return this;
            }

            public final C0120read IconCompatParcelizer(int i, boolean z) {
                this.read.read(i, z);
                return this;
            }

            public final C0120read AudioAttributesCompatParcelizer(int... iArr) {
                this.read.AudioAttributesCompatParcelizer(iArr);
                return this;
            }

            public final C0120read IconCompatParcelizer(read readVar) {
                this.read.AudioAttributesCompatParcelizer(readVar.read);
                return this;
            }

            public final read read() {
                return new read(this.read.AudioAttributesCompatParcelizer(), (byte) 0);
            }
        }

        static {
            new C0120read().read();
            LaissezFaireSubTypeValidator.AudioAttributesImplApi26Parcelizer(0);
        }

        private read(enumTypes enumtypes) {
            this.read = enumtypes;
        }

        public final boolean read(int i) {
            return this.read.AudioAttributesCompatParcelizer(i);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof read) {
                return this.read.equals(((read) obj).read);
            }
            return false;
        }

        public final int hashCode() {
            return this.read.hashCode();
        }
    }
}
