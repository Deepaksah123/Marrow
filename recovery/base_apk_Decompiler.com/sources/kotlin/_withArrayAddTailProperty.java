package kotlin;

import kotlin.StdKeySerializers;

/* JADX INFO: loaded from: classes2.dex */
public interface _withArrayAddTailProperty {
    _findWellKnownSimple AudioAttributesCompatParcelizer();

    public static final class AudioAttributesCompatParcelizer {
        public final long AudioAttributesCompatParcelizer;
        public final PolymorphicTypeValidator AudioAttributesImplApi21Parcelizer;
        public final boolean AudioAttributesImplApi26Parcelizer;
        public final long AudioAttributesImplBaseParcelizer;
        public final StdKeySerializers.write IconCompatParcelizer;
        public final modifyArraySerializer MediaBrowserCompatCustomActionResultReceiver;
        public final long RemoteActionCompatParcelizer;
        public final boolean read;
        public final float write;

        public AudioAttributesCompatParcelizer(modifyArraySerializer modifyarrayserializer, PolymorphicTypeValidator polymorphicTypeValidator, StdKeySerializers.write writeVar, long j, long j2, float f, boolean z, boolean z2, long j3) {
            this.MediaBrowserCompatCustomActionResultReceiver = modifyarrayserializer;
            this.AudioAttributesImplApi21Parcelizer = polymorphicTypeValidator;
            this.IconCompatParcelizer = writeVar;
            this.RemoteActionCompatParcelizer = j;
            this.AudioAttributesCompatParcelizer = j2;
            this.write = f;
            this.read = z;
            this.AudioAttributesImplApi26Parcelizer = z2;
            this.AudioAttributesImplBaseParcelizer = j3;
        }
    }

    static {
        new StdKeySerializers.write(new Object());
    }

    default void write(modifyArraySerializer modifyarrayserializer) {
        RemoteActionCompatParcelizer();
    }

    @Deprecated
    default void RemoteActionCompatParcelizer() {
        throw new IllegalStateException("onPrepared not implemented");
    }

    default void RemoteActionCompatParcelizer(modifyArraySerializer modifyarrayserializer, buildIndexedListSerializer[] buildindexedlistserializerArr, _writeAsBinary _writeasbinary, _verifyAndResolvePlaceholders[] _verifyandresolveplaceholdersArr) {
        MediaBrowserCompatItemReceiver();
    }

    @Deprecated
    default void MediaBrowserCompatItemReceiver() {
        AudioAttributesImplApi26Parcelizer();
    }

    @Deprecated
    default void AudioAttributesImplApi26Parcelizer() {
        throw new IllegalStateException("onTracksSelected not implemented");
    }

    default void RemoteActionCompatParcelizer(modifyArraySerializer modifyarrayserializer) {
        AudioAttributesImplBaseParcelizer();
    }

    @Deprecated
    default void AudioAttributesImplBaseParcelizer() {
        throw new IllegalStateException("onStopped not implemented");
    }

    default void IconCompatParcelizer(modifyArraySerializer modifyarrayserializer) {
        MediaBrowserCompatCustomActionResultReceiver();
    }

    @Deprecated
    default void MediaBrowserCompatCustomActionResultReceiver() {
        throw new IllegalStateException("onReleased not implemented");
    }

    default long IconCompatParcelizer() {
        return read();
    }

    @Deprecated
    default long read() {
        throw new IllegalStateException("getBackBufferDurationUs not implemented");
    }

    default boolean write() {
        return AudioAttributesImplApi21Parcelizer();
    }

    @Deprecated
    default boolean AudioAttributesImplApi21Parcelizer() {
        throw new IllegalStateException("retainBackBufferFromKeyframe not implemented");
    }

    default boolean AudioAttributesCompatParcelizer(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        long j = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
        long j2 = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        float f = audioAttributesCompatParcelizer.write;
        return RatingCompat();
    }

    @Deprecated
    default boolean RatingCompat() {
        throw new IllegalStateException("shouldContinueLoading not implemented");
    }

    default boolean read(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        PolymorphicTypeValidator polymorphicTypeValidator = audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer;
        StdKeySerializers.write writeVar = audioAttributesCompatParcelizer.IconCompatParcelizer;
        long j = audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
        float f = audioAttributesCompatParcelizer.write;
        boolean z = audioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer;
        long j2 = audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer;
        return MediaBrowserCompatMediaItem();
    }

    @Deprecated
    default boolean MediaBrowserCompatMediaItem() {
        return MediaBrowserCompatSearchResultReceiver();
    }

    @Deprecated
    default boolean MediaBrowserCompatSearchResultReceiver() {
        throw new IllegalStateException("shouldStartPlayback not implemented");
    }
}
