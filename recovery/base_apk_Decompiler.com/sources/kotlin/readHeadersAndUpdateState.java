package kotlin;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class readHeadersAndUpdateState extends VorbisReader {
    private final List<FlacReaderFlacOggSeeker<?>> RemoteActionCompatParcelizer;

    public readHeadersAndUpdateState(List<FlacReaderFlacOggSeeker<?>> list) {
        StringBuilder sb = new StringBuilder("Dependency cycle detected: ");
        sb.append(Arrays.toString(list.toArray()));
        super(sb.toString());
        this.RemoteActionCompatParcelizer = list;
    }
}
