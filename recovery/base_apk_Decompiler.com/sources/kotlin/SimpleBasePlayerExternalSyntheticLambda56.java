package kotlin;

import android.graphics.BitmapFactory;
import java.io.File;

/* JADX INFO: loaded from: classes2.dex */
public final class SimpleBasePlayerExternalSyntheticLambda56 {
    public static final boolean write(File file) {
        if (file == null || !file.exists()) {
            return false;
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inJustDecodeBounds = true;
        BitmapFactory.decodeFile(file.getPath(), options);
        return (options.outWidth == -1 || options.outHeight == -1) ? false : true;
    }
}
