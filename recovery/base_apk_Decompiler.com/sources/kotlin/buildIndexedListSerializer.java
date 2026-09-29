package kotlin;

import java.io.IOException;
import kotlin.StdKeySerializers;
import kotlin.buildMapEntrySerializer;

/* JADX INFO: loaded from: classes2.dex */
public interface buildIndexedListSerializer extends buildMapEntrySerializer.write {

    public interface IconCompatParcelizer {
        void AudioAttributesCompatParcelizer();

        void IconCompatParcelizer();
    }

    default long AudioAttributesCompatParcelizer(long j, long j2) {
        return 10000L;
    }

    putArray AudioAttributesImplBaseParcelizer();

    void IconCompatParcelizer(long j, long j2) throws addNull;

    void IconCompatParcelizer(buildIteratorSerializer builditeratorserializer, C0170format[] c0170formatArr, visitStringFormat visitstringformat, boolean z, boolean z2, long j, long j2, StdKeySerializers.write writeVar) throws addNull;

    void IconCompatParcelizer(C0170format[] c0170formatArr, visitStringFormat visitstringformat, long j, long j2, StdKeySerializers.write writeVar) throws addNull;

    long MediaBrowserCompatItemReceiver();

    int MediaBrowserCompatMediaItem();

    visitStringFormat MediaBrowserCompatSearchResultReceiver();

    void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() throws IOException;

    boolean MediaMetadataCompat();

    int RatingCompat();

    void RemoteActionCompatParcelizer(long j) throws addNull;

    boolean onAddQueueItem();

    default void onPlay() {
    }

    void onPlayFromUri();

    void onPrepare() throws addNull;

    void onPrepareFromMediaId();

    void onPrepareFromSearch();

    boolean onRemoveQueueItem();

    boolean onRemoveQueueItemAt();

    default void onRewind() {
    }

    String onSeekTo();

    default void read(float f, float f2) throws addNull {
    }

    buildIterableSerializer write();

    void write(int i, modifyArraySerializer modifyarrayserializer, buildTypeDeserializer buildtypedeserializer);

    void write(PolymorphicTypeValidator polymorphicTypeValidator);

    void y_();
}
