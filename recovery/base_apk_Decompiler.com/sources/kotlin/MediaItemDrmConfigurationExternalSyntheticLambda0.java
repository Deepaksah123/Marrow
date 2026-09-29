package kotlin;

import android.content.Context;
import java.io.File;
import kotlin.r8lambdaLWLNpx1CEgzVE8RmNn3qH8o4f4;

/* JADX INFO: loaded from: classes2.dex */
public final class MediaItemDrmConfigurationExternalSyntheticLambda0 extends r8lambdaLWLNpx1CEgzVE8RmNn3qH8o4f4 {
    public MediaItemDrmConfigurationExternalSyntheticLambda0(Context context) {
        this(context, "image_manager_disk_cache");
    }

    private MediaItemDrmConfigurationExternalSyntheticLambda0(final Context context, final String str) {
        super(new r8lambdaLWLNpx1CEgzVE8RmNn3qH8o4f4.AudioAttributesCompatParcelizer() { // from class: o.MediaItemDrmConfigurationExternalSyntheticLambda0.1
            @Override // o.r8lambdaLWLNpx1CEgzVE8RmNn3qH8o4f4.AudioAttributesCompatParcelizer
            public final File write() {
                File cacheDir = context.getCacheDir();
                if (cacheDir == null) {
                    return null;
                }
                return str != null ? new File(cacheDir, str) : cacheDir;
            }
        }, 262144000L);
    }
}
