package com.razorpay;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import in.juspay.hyper.constants.LogCategory;
import kotlin.Metadata;
import kotlin.getMagicModuleMeta;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\n"}, d2 = {"Lcom/razorpay/PerformanceUtil;", "", "()V", "getPerformanceClass", "", LogCategory.CONTEXT, "Landroid/content/Context;", "getPerformanceClassFromRAM", "isLowEndDevice", "", "core_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class PerformanceUtil {
    public static final PerformanceUtil INSTANCE = new PerformanceUtil();

    private PerformanceUtil() {
    }

    @getMagicModuleMeta
    public static final int getPerformanceClass(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        try {
            if (Build.VERSION.SDK_INT >= 31) {
                int i = Build.VERSION.MEDIA_PERFORMANCE_CLASS;
                return i == 0 ? INSTANCE.l$1_I$l$(context) : i;
            }
            return INSTANCE.l$1_I$l$(context);
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    private final int l$1_I$l$(Context context) {
        try {
            Object systemService = context.getSystemService("activity");
            if (systemService == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.app.ActivityManager");
            }
            ((ActivityManager) systemService).getMemoryInfo(new ActivityManager.MemoryInfo());
            double d = r0.totalMem / 1.073741824E9d;
            if (d < 2.0d) {
                return 0;
            }
            if (d < 4.0d) {
                return 30;
            }
            return d < 6.0d ? 31 : 33;
        } catch (Exception e) {
            e.printStackTrace();
            return 0;
        }
    }

    @getMagicModuleMeta
    public static final boolean isLowEndDevice(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        int performanceClass = getPerformanceClass(context);
        return performanceClass == 0 || performanceClass == 30;
    }
}
