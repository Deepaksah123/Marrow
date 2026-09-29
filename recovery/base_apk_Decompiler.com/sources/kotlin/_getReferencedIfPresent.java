package kotlin;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import kotlin.withTimeZone;

/* JADX INFO: loaded from: classes2.dex */
public interface _getReferencedIfPresent {
    public static final _getReferencedIfPresent write = new ArraySerializerBase();

    _serializeObjectId AudioAttributesCompatParcelizer(Uri uri, C0170format c0170format, List<C0170format> list, MinimalClassNameIdResolver minimalClassNameIdResolver, Map<String, List<String>> map, closeOnFailAndThrowAsIOE closeonfailandthrowasioe) throws IOException;

    default _getReferencedIfPresent IconCompatParcelizer(withTimeZone.IconCompatParcelizer iconCompatParcelizer) {
        return this;
    }

    default _getReferencedIfPresent write(boolean z) {
        return this;
    }

    default C0170format write(C0170format c0170format) {
        return c0170format;
    }
}
