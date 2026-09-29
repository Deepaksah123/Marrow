package kotlin;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public interface findAnnotatedContentSerializer {

    public interface AudioAttributesCompatParcelizer {
        findAnnotatedContentSerializer write();
    }

    void AudioAttributesCompatParcelizer();

    int RemoteActionCompatParcelizer(isJacksonStdImpl isjacksonstdimpl) throws IOException;

    void RemoteActionCompatParcelizer();

    void read(long j, long j2);

    void read(JsonNullFormatVisitor jsonNullFormatVisitor, Uri uri, Map<String, List<String>> map, long j, long j2, findRawSuperTypes findrawsupertypes) throws IOException;

    long write();
}
