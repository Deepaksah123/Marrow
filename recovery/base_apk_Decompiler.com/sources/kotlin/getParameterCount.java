package kotlin;

import android.content.Context;
import java.io.File;

/* JADX INFO: loaded from: classes4.dex */
public final class getParameterCount {
    public static final File RemoteActionCompatParcelizer(Context context, String str) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        return new File(context.getApplicationContext().getFilesDir(), toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer("datastore/", (Object) str));
    }
}
