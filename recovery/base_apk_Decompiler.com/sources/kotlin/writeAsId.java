package kotlin;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class writeAsId extends IOException {
    public final long AudioAttributesCompatParcelizer;
    public final SubTypeValidator RemoteActionCompatParcelizer;
    public final Uri read;
    public final Map<String, List<String>> write;

    public writeAsId(SubTypeValidator subTypeValidator, Uri uri, Map<String, List<String>> map, long j, Throwable th) {
        super(th);
        this.RemoteActionCompatParcelizer = subTypeValidator;
        this.read = uri;
        this.write = map;
        this.AudioAttributesCompatParcelizer = j;
    }
}
