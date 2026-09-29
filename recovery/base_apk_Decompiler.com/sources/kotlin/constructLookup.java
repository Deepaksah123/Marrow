package kotlin;

import androidx.media3.extractor.metadata.emsg.EventMessage;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* JADX INFO: loaded from: classes2.dex */
public final class constructLookup extends _isIntType {
    @Override // kotlin._isIntType
    public final androidx.media3.common.Metadata AudioAttributesCompatParcelizer(_enumDefault _enumdefault, ByteBuffer byteBuffer) {
        return new androidx.media3.common.Metadata(read(new AsPropertyTypeDeserializer(byteBuffer.array(), byteBuffer.limit())));
    }

    public static EventMessage read(AsPropertyTypeDeserializer asPropertyTypeDeserializer) {
        return new EventMessage((String) buildTypeSerializer.IconCompatParcelizer(asPropertyTypeDeserializer.onAddQueueItem()), (String) buildTypeSerializer.IconCompatParcelizer(asPropertyTypeDeserializer.onAddQueueItem()), asPropertyTypeDeserializer.handleMediaPlayPauseIfPendingOnHandler(), asPropertyTypeDeserializer.handleMediaPlayPauseIfPendingOnHandler(), Arrays.copyOfRange(asPropertyTypeDeserializer.RemoteActionCompatParcelizer(), asPropertyTypeDeserializer.write(), asPropertyTypeDeserializer.read()));
    }
}
