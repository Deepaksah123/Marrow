package kotlin;

import android.net.NetworkRequest;
import android.os.Build;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0015\n\u0002\b\u0006\"\u0015\u0010\u0004\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003\"\u0015\u0010\u0005\u001a\u00020\u0001*\u00020\u00008G¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0003\"\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroid/net/NetworkRequest;", "", "write", "(Landroid/net/NetworkRequest;)[I", "read", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "[I"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class buildMetadataRenderers {
    private static final int[] AudioAttributesCompatParcelizer = {13, 15, 14};

    public static final int[] write(NetworkRequest networkRequest) {
        toMagicModuleMetaRepoModel.write(networkRequest, "");
        if (Build.VERSION.SDK_INT >= 31) {
            buildMiscellaneousRenderers buildmiscellaneousrenderers = buildMiscellaneousRenderers.INSTANCE;
            return buildMiscellaneousRenderers.RemoteActionCompatParcelizer(networkRequest);
        }
        int[] iArr = {2, 0, 3, 6, 10, 9, 8, 4, 1, 5};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 10; i++) {
            int i2 = iArr[i];
            buildCameraMotionRenderers buildcameramotionrenderers = buildCameraMotionRenderers.INSTANCE;
            if (buildCameraMotionRenderers.RemoteActionCompatParcelizer(networkRequest, i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return IntermediateLoginResponseBody.IconCompatParcelizer((Collection<Integer>) arrayList);
    }

    public static final int[] read(NetworkRequest networkRequest) {
        toMagicModuleMetaRepoModel.write(networkRequest, "");
        if (Build.VERSION.SDK_INT >= 31) {
            buildMiscellaneousRenderers buildmiscellaneousrenderers = buildMiscellaneousRenderers.INSTANCE;
            return buildMiscellaneousRenderers.write(networkRequest);
        }
        int[] iArr = {17, 5, 2, 10, 29, 19, 3, 32, 7, 4, 12, 36, 23, 0, 33, 20, 11, 13, 18, 21, 15, 35, 34, 8, 1, 25, 14, 16, 6, 9};
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < 30; i++) {
            int i2 = iArr[i];
            buildCameraMotionRenderers buildcameramotionrenderers = buildCameraMotionRenderers.INSTANCE;
            if (buildCameraMotionRenderers.AudioAttributesCompatParcelizer(networkRequest, i2)) {
                arrayList.add(Integer.valueOf(i2));
            }
        }
        return IntermediateLoginResponseBody.IconCompatParcelizer((Collection<Integer>) arrayList);
    }
}
