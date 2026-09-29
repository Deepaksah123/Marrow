package kotlin;

import kotlin.Metadata;
import kotlin.getReader;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"", "p0", "Lo/getDataStream;", "p1", "Lo/withValueDeserializer;", "p2", "Lo/DataFormatReaders;", "p3", "Lo/deserializeAndSet;", "write", "(ILo/getDataStream;II)Lo/deserializeAndSet;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class setFallbackSetter {
    public static /* synthetic */ deserializeAndSet write$default(int i, getDataStream getdatastream, int i2, int i3, int i4, Object obj) {
        if ((i4 & 2) != 0) {
            getdatastream = getDataStream.INSTANCE.RemoteActionCompatParcelizer();
        }
        if ((i4 & 4) != 0) {
            i2 = withValueDeserializer.INSTANCE.IconCompatParcelizer();
        }
        if ((i4 & 8) != 0) {
            i3 = DataFormatReaders.INSTANCE.IconCompatParcelizer();
        }
        return write(i, getdatastream, i2, i3);
    }

    public static final deserializeAndSet write(int i, getDataStream getdatastream, int i2, int i3) {
        return new DeserializerCache(i, getdatastream, i2, new getReader.read(new getReader.write[0]), i3, null);
    }
}
