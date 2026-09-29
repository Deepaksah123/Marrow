package kotlin;

import com.google.android.exoplayer2.C;
import com.google.android.exoplayer2.source.ProgressiveMediaSource;
import kotlin.Metadata;
import kotlin.find;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\u0006\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u001a\u0010\u000b\u001a\u00020\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\n\" \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0001X\u0081\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u000e\u001a\u0004\b\b\u0010\u000f"}, d2 = {"Lo/deserializeWithObjectId;", "Lo/_reportMissingSetter;", "p0", "write", "(Lo/deserializeWithObjectId;Lo/_reportMissingSetter;)Lo/deserializeWithObjectId;", "Lo/find;", "RemoteActionCompatParcelizer", "Lo/find;", "IconCompatParcelizer", "Lo/deserializeWithObjectId;", "()Lo/deserializeWithObjectId;", "read", "Lo/CharacterEscapes;", "Lo/canWriteTypeId;", "Lo/CharacterEscapes;", "()Lo/CharacterEscapes;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class copyCurrentStructure {
    private static final deserializeWithObjectId IconCompatParcelizer;
    private static final find RemoteActionCompatParcelizer;
    private static final CharacterEscapes<canWriteTypeId> read;

    /* JADX INFO: Access modifiers changed from: private */
    public static final deserializeWithObjectId write(deserializeWithObjectId deserializewithobjectid, _reportMissingSetter _reportmissingsetter) {
        if (deserializewithobjectid.AudioAttributesImplBaseParcelizer() != null) {
            return deserializewithobjectid;
        }
        return deserializewithobjectid.IconCompatParcelizer((16777212 & 1) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.read() : 0L, (16777212 & 2) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer() : 0L, (16777212 & 4) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer() : null, (16777212 & 8) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getWrite() : null, (16777212 & 16) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getRead() : null, (16777212 & 32) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getAudioAttributesImplBaseParcelizer() : _reportmissingsetter, (16777212 & 64) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver() : null, (16777212 & 128) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getMediaBrowserCompatItemReceiver() : 0L, (16777212 & 256) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getAudioAttributesImplApi21Parcelizer() : null, (16777212 & 512) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getAudioAttributesImplApi26Parcelizer() : null, (16777212 & 1024) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getMediaBrowserCompatMediaItem() : null, (16777212 & 2048) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getMediaDescriptionCompat() : 0L, (16777212 & 4096) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getMediaMetadataCompat() : null, (16777212 & 8192) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getMediaBrowserCompatSearchResultReceiver() : null, (16777212 & 16384) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getOnCustomAction() : null, (16777212 & 32768) != 0 ? deserializewithobjectid.read.getWrite() : 0, (16777212 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? deserializewithobjectid.read.getIconCompatParcelizer() : 0, (16777212 & 131072) != 0 ? deserializewithobjectid.read.getRead() : 0L, (16777212 & 262144) != 0 ? deserializewithobjectid.read.getAudioAttributesCompatParcelizer() : null, (16777212 & 524288) != 0 ? deserializewithobjectid.write : null, (16777212 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? deserializewithobjectid.read.getAudioAttributesImplApi21Parcelizer() : null, (16777212 & 2097152) != 0 ? deserializewithobjectid.read.getAudioAttributesImplApi26Parcelizer() : 0, (16777212 & 4194304) != 0 ? deserializewithobjectid.read.getMediaBrowserCompatCustomActionResultReceiver() : 0, (16777212 & 8388608) != 0 ? deserializewithobjectid.read.getAudioAttributesImplBaseParcelizer() : null);
    }

    static {
        find findVar = new find(find.IconCompatParcelizer.INSTANCE.read(), find.write.INSTANCE.AudioAttributesCompatParcelizer(), (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
        RemoteActionCompatParcelizer = findVar;
        deserializeWithObjectId deserializewithobjectid = deserializeWithObjectId.INSTANCE.read();
        IconCompatParcelizer = deserializewithobjectid.IconCompatParcelizer((16777212 & 1) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.read() : 0L, (16777212 & 2) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer() : 0L, (16777212 & 4) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer() : null, (16777212 & 8) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getWrite() : null, (16777212 & 16) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getRead() : null, (16777212 & 32) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getAudioAttributesImplBaseParcelizer() : null, (16777212 & 64) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver() : null, (16777212 & 128) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getMediaBrowserCompatItemReceiver() : 0L, (16777212 & 256) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getAudioAttributesImplApi21Parcelizer() : null, (16777212 & 512) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getAudioAttributesImplApi26Parcelizer() : null, (16777212 & 1024) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getMediaBrowserCompatMediaItem() : null, (16777212 & 2048) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getMediaDescriptionCompat() : 0L, (16777212 & 4096) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getMediaMetadataCompat() : null, (16777212 & 8192) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getMediaBrowserCompatSearchResultReceiver() : null, (16777212 & 16384) != 0 ? deserializewithobjectid.AudioAttributesCompatParcelizer.getOnCustomAction() : null, (16777212 & 32768) != 0 ? deserializewithobjectid.read.getWrite() : 0, (16777212 & C.DEFAULT_BUFFER_SEGMENT_SIZE) != 0 ? deserializewithobjectid.read.getIconCompatParcelizer() : 0, (16777212 & 131072) != 0 ? deserializewithobjectid.read.getRead() : 0L, (16777212 & 262144) != 0 ? deserializewithobjectid.read.getAudioAttributesCompatParcelizer() : null, (16777212 & 524288) != 0 ? deserializewithobjectid.write : Rid.write(), (16777212 & ProgressiveMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES) != 0 ? deserializewithobjectid.read.getAudioAttributesImplApi21Parcelizer() : findVar, (16777212 & 2097152) != 0 ? deserializewithobjectid.read.getAudioAttributesImplApi26Parcelizer() : 0, (16777212 & 4194304) != 0 ? deserializewithobjectid.read.getMediaBrowserCompatCustomActionResultReceiver() : 0, (16777212 & 8388608) != 0 ? deserializewithobjectid.read.getAudioAttributesImplBaseParcelizer() : null);
        read = resetAsNaN.read(new getCreatedOnDateMs() { // from class: o.copyCurrentEvent
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return copyCurrentStructure.AudioAttributesCompatParcelizer();
            }
        });
    }

    public static final deserializeWithObjectId RemoteActionCompatParcelizer() {
        return IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final canWriteTypeId AudioAttributesCompatParcelizer() {
        return new canWriteTypeId(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
    }

    public static final CharacterEscapes<canWriteTypeId> IconCompatParcelizer() {
        return read;
    }
}
