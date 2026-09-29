package kotlin;

import android.net.Uri;
import androidx.media3.common.StreamKey;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import kotlin.NumberSerializersFloatSerializer;
import kotlin.constructGeneralizedType;

/* JADX INFO: loaded from: classes2.dex */
public final class NumberSerializersDoubleSerializer<T extends NumberSerializersFloatSerializer<T>> implements constructGeneralizedType.IconCompatParcelizer<T> {
    private final List<StreamKey> RemoteActionCompatParcelizer;
    private final constructGeneralizedType.IconCompatParcelizer<? extends T> read;

    public NumberSerializersDoubleSerializer(constructGeneralizedType.IconCompatParcelizer<? extends T> iconCompatParcelizer, List<StreamKey> list) {
        this.read = iconCompatParcelizer;
        this.RemoteActionCompatParcelizer = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // o.constructGeneralizedType.IconCompatParcelizer
    /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
    public T RemoteActionCompatParcelizer(Uri uri, InputStream inputStream) throws IOException {
        T tRemoteActionCompatParcelizer = this.read.RemoteActionCompatParcelizer(uri, inputStream);
        List<StreamKey> list = this.RemoteActionCompatParcelizer;
        return (list == null || list.isEmpty()) ? tRemoteActionCompatParcelizer : (T) tRemoteActionCompatParcelizer.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
    }
}
