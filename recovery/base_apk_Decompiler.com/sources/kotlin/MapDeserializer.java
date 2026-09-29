package kotlin;

import kotlin.JdkDeserializers;

/* JADX INFO: loaded from: classes2.dex */
public final class MapDeserializer {
    static boolean[] RemoteActionCompatParcelizer = new boolean[3];

    public static final boolean IconCompatParcelizer(int i, int i2) {
        return (i & i2) == i2;
    }

    static void IconCompatParcelizer(_long _longVar, _getToStringLookup _gettostringlookup, JdkDeserializers jdkDeserializers) {
        jdkDeserializers.MediaBrowserCompatMediaItem = -1;
        jdkDeserializers.onRemoveQueueItemAt = -1;
        if (_longVar.MediaBrowserCompatSearchResultReceiver[0] != JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT && jdkDeserializers.MediaBrowserCompatSearchResultReceiver[0] == JdkDeserializers.IconCompatParcelizer.MATCH_PARENT) {
            int i = jdkDeserializers.MediaMetadataCompat.AudioAttributesCompatParcelizer;
            int iOnSetShuffleMode = _longVar.onSetShuffleMode() - jdkDeserializers.onPrepareFromMediaId.AudioAttributesCompatParcelizer;
            jdkDeserializers.MediaMetadataCompat.RemoteActionCompatParcelizer = _gettostringlookup.RemoteActionCompatParcelizer(jdkDeserializers.MediaMetadataCompat);
            jdkDeserializers.onPrepareFromMediaId.RemoteActionCompatParcelizer = _gettostringlookup.RemoteActionCompatParcelizer(jdkDeserializers.onPrepareFromMediaId);
            _gettostringlookup.read(jdkDeserializers.MediaMetadataCompat.RemoteActionCompatParcelizer, i);
            _gettostringlookup.read(jdkDeserializers.onPrepareFromMediaId.RemoteActionCompatParcelizer, iOnSetShuffleMode);
            jdkDeserializers.MediaBrowserCompatMediaItem = 2;
            jdkDeserializers.AudioAttributesCompatParcelizer(i, iOnSetShuffleMode);
        }
        if (_longVar.MediaBrowserCompatSearchResultReceiver[1] == JdkDeserializers.IconCompatParcelizer.WRAP_CONTENT || jdkDeserializers.MediaBrowserCompatSearchResultReceiver[1] != JdkDeserializers.IconCompatParcelizer.MATCH_PARENT) {
            return;
        }
        int i2 = jdkDeserializers.onSeekTo.AudioAttributesCompatParcelizer;
        int iOnAddQueueItem = _longVar.onAddQueueItem() - jdkDeserializers.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer;
        jdkDeserializers.onSeekTo.RemoteActionCompatParcelizer = _gettostringlookup.RemoteActionCompatParcelizer(jdkDeserializers.onSeekTo);
        jdkDeserializers.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer = _gettostringlookup.RemoteActionCompatParcelizer(jdkDeserializers.AudioAttributesImplApi26Parcelizer);
        _gettostringlookup.read(jdkDeserializers.onSeekTo.RemoteActionCompatParcelizer, i2);
        _gettostringlookup.read(jdkDeserializers.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer, iOnAddQueueItem);
        if (jdkDeserializers.AudioAttributesCompatParcelizer > 0 || jdkDeserializers.onRewind() == 8) {
            jdkDeserializers.read.RemoteActionCompatParcelizer = _gettostringlookup.RemoteActionCompatParcelizer(jdkDeserializers.read);
            _gettostringlookup.read(jdkDeserializers.read.RemoteActionCompatParcelizer, jdkDeserializers.AudioAttributesCompatParcelizer + i2);
        }
        jdkDeserializers.onRemoveQueueItemAt = 2;
        jdkDeserializers.AudioAttributesImplApi21Parcelizer(i2, iOnAddQueueItem);
    }
}
