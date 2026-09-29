package kotlin;

import android.content.res.Configuration;
import android.content.res.Resources;
import com.marrow.R;

/* JADX INFO: loaded from: classes3.dex */
public final class VideoRendererEventListenerEventDispatcherExternalSyntheticLambda8 {
    public static final boolean read(Resources resources, int i) {
        toMagicModuleMetaRepoModel.write(resources, "");
        try {
            resources.getResourceEntryName(R.drawable.ic_arrow_back);
            return true;
        } catch (Resources.NotFoundException unused) {
            return false;
        }
    }

    public static final boolean read(Configuration configuration) {
        toMagicModuleMetaRepoModel.write(configuration, "");
        return configuration.orientation == 1;
    }
}
