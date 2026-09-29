package kotlin;

import android.net.Uri;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class _parseInt {
    public static final File read(Uri uri) {
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) uri.getScheme(), (Object) "file")) {
            throw new IllegalArgumentException("Uri lacks 'file' scheme: ".concat(String.valueOf(uri)).toString());
        }
        String path = uri.getPath();
        if (path != null) {
            return new File(path);
        }
        throw new IllegalArgumentException("Uri path is null: ".concat(String.valueOf(uri)).toString());
    }
}
