package kotlin;

import android.net.Uri;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class lambdaonReceive0 {
    private final Map<String, String> AudioAttributesCompatParcelizer;
    private final Uri read;
    private final String write;

    public lambdaonReceive0(Uri uri, Map<String, String> map, String str) {
        toMagicModuleMetaRepoModel.write(uri, "");
        toMagicModuleMetaRepoModel.write(map, "");
        this.read = uri;
        this.AudioAttributesCompatParcelizer = map;
        this.write = str;
    }

    public final Uri IconCompatParcelizer() {
        return this.read;
    }

    public final Map<String, String> read() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.write;
    }
}
