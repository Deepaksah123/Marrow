package kotlin;

import android.app.Activity;
import android.content.Context;
import android.util.TypedValue;
import com.google.android.gms.common.util.DeviceProperties;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\n¢\u0006\u0004\b\f\u0010\r"}, d2 = {"Lo/DataSourceBitmapLoaderExternalSyntheticLambda1;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "", "p1", "read", "(Landroid/content/Context;I)I", "Landroid/app/Activity;", "", "RemoteActionCompatParcelizer", "(Landroid/app/Activity;)Z"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class DataSourceBitmapLoaderExternalSyntheticLambda1 {
    public static final DataSourceBitmapLoaderExternalSyntheticLambda1 INSTANCE = new DataSourceBitmapLoaderExternalSyntheticLambda1();

    private DataSourceBitmapLoaderExternalSyntheticLambda1() {
    }

    @getMagicModuleMeta
    public static final int read(Context p0, int p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return (int) TypedValue.applyDimension(1, p1, p0.getResources().getDisplayMetrics());
    }

    public static boolean RemoteActionCompatParcelizer(Activity p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        updateNavigation updatenavigation = updateNavigation.INSTANCE;
        return updateNavigation.IconCompatParcelizer(p0) >= 7.5d && !DeviceProperties.isFoldable(p0);
    }
}
