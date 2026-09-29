package kotlin;

import kotlin.Metadata;
import kotlin.resetWithString;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/BasicDeserializerFactory;", "Lo/findAndAddVirtualProperties;", "<init>", "()V", "Lo/calloc;", "p0", "Lo/tryToResolveUnresolved;", "p1", "Lo/bufferMapProperty;", "p2", "Lo/resetWithString;", "write", "(JLo/tryToResolveUnresolved;Lo/bufferMapProperty;)Lo/resetWithString;"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class BasicDeserializerFactory implements findAndAddVirtualProperties {
    public static final BasicDeserializerFactory INSTANCE = new BasicDeserializerFactory();

    private BasicDeserializerFactory() {
    }

    @Override // kotlin.findAndAddVirtualProperties
    public final resetWithString write(long p0, tryToResolveUnresolved p1, bufferMapProperty p2) {
        float fIconCompatParcelizer = calloc.IconCompatParcelizer(p0) / 2.0f;
        long j = -1;
        long jAudioAttributesCompatParcelizer = TypeReference.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(fIconCompatParcelizer)) << 32) | (((long) Float.floatToRawIntBits(fIconCompatParcelizer)) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
        return new resetWithString.RemoteActionCompatParcelizer(allocByteBuffer.RemoteActionCompatParcelizer(allocCharBuffer.IconCompatParcelizer(p0), jAudioAttributesCompatParcelizer, jAudioAttributesCompatParcelizer, jAudioAttributesCompatParcelizer, jAudioAttributesCompatParcelizer));
    }
}
