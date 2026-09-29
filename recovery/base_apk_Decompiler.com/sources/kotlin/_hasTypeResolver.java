package kotlin;

import android.net.Uri;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface _hasTypeResolver extends JsonNullFormatVisitor {

    public interface write {
        _hasTypeResolver write();
    }

    void AudioAttributesCompatParcelizer() throws IOException;

    Uri IconCompatParcelizer();

    long RemoteActionCompatParcelizer(SubTypeValidator subTypeValidator) throws IOException;

    void read(TypeNameIdResolver typeNameIdResolver);

    default Map<String, List<String>> read() {
        return Collections.emptyMap();
    }
}
