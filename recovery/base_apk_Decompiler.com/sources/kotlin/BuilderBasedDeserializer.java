package kotlin;

import kotlin.Metadata;
import kotlin.getDataStream;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\b\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\b\u0010\t\"\u0018\u0010\r\u001a\u00020\u0000*\u00020\n8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f"}, d2 = {"Lo/getDataStream;", "p0", "Lo/withValueDeserializer;", "p1", "", "RemoteActionCompatParcelizer", "(Lo/getDataStream;I)I", "", "IconCompatParcelizer", "(ZZ)I", "Lo/getDataStream$RemoteActionCompatParcelizer;", "write", "(Lo/getDataStream$RemoteActionCompatParcelizer;)Lo/getDataStream;", "read"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class BuilderBasedDeserializer {
    public static final int IconCompatParcelizer(boolean z, boolean z2) {
        if (z2 && z) {
            return 3;
        }
        if (z) {
            return 1;
        }
        return z2 ? 2 : 0;
    }

    public static final getDataStream write(getDataStream.Companion companion) {
        return companion.AudioAttributesImplBaseParcelizer();
    }

    public static final int RemoteActionCompatParcelizer(getDataStream getdatastream, int i) {
        return IconCompatParcelizer(getdatastream.compareTo(write(getDataStream.INSTANCE)) >= 0, withValueDeserializer.write(i, withValueDeserializer.INSTANCE.AudioAttributesCompatParcelizer()));
    }
}
