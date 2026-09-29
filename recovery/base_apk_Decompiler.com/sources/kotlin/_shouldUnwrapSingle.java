package kotlin;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
final class _shouldUnwrapSingle {
    private final LinkedHashMap<Uri, byte[]> write = new LinkedHashMap<Uri, byte[]>(5, 4) { // from class: o._shouldUnwrapSingle.5
        final /* synthetic */ int write = 4;

        {
            super(5, 1.0f, false);
        }

        @Override // java.util.LinkedHashMap
        protected final boolean removeEldestEntry(Map.Entry<Uri, byte[]> entry) {
            return size() > this.write;
        }
    };

    public final byte[] write(Uri uri) {
        if (uri == null) {
            return null;
        }
        return this.write.get(uri);
    }

    public final byte[] AudioAttributesCompatParcelizer(Uri uri, byte[] bArr) {
        return this.write.put((Uri) buildTypeSerializer.IconCompatParcelizer(uri), (byte[]) buildTypeSerializer.IconCompatParcelizer(bArr));
    }

    public final byte[] RemoteActionCompatParcelizer(Uri uri) {
        return this.write.remove(buildTypeSerializer.IconCompatParcelizer(uri));
    }
}
