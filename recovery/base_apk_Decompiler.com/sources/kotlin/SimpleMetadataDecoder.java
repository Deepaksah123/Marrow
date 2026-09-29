package kotlin;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes3.dex */
public class SimpleMetadataDecoder {
    private static volatile SimpleMetadataDecoder IconCompatParcelizer;
    private final Set<readMetadata> RemoteActionCompatParcelizer = new HashSet();

    SimpleMetadataDecoder() {
    }

    final Set<readMetadata> AudioAttributesCompatParcelizer() {
        Set<readMetadata> setUnmodifiableSet;
        synchronized (this.RemoteActionCompatParcelizer) {
            setUnmodifiableSet = Collections.unmodifiableSet(this.RemoteActionCompatParcelizer);
        }
        return setUnmodifiableSet;
    }

    public static SimpleMetadataDecoder read() {
        SimpleMetadataDecoder simpleMetadataDecoder;
        SimpleMetadataDecoder simpleMetadataDecoder2 = IconCompatParcelizer;
        if (simpleMetadataDecoder2 != null) {
            return simpleMetadataDecoder2;
        }
        synchronized (SimpleMetadataDecoder.class) {
            simpleMetadataDecoder = IconCompatParcelizer;
            if (simpleMetadataDecoder == null) {
                simpleMetadataDecoder = new SimpleMetadataDecoder();
                IconCompatParcelizer = simpleMetadataDecoder;
            }
        }
        return simpleMetadataDecoder;
    }
}
