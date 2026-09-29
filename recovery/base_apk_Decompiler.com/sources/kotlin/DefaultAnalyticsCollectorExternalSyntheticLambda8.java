package kotlin;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import in.juspay.hyper.constants.LogCategory;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\n\u001a\u00020\t\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\rH\u0007¢\u0006\u0004\b\n\u0010\u000fJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u0010J+\u0010\u0011\u001a\u00020\t\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0011\u0010\u000bJ+\u0010\u0012\u001a\u00020\t\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0012\u0010\u000bJ!\u0010\u000e\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u0013J!\u0010\u0014\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\u0014\u0010\u0010J\u000f\u0010\u0014\u001a\u00020\tH\u0007¢\u0006\u0004\b\u0014\u0010\u0003"}, d2 = {"Lo/DefaultAnalyticsCollectorExternalSyntheticLambda8;", "", "<init>", "()V", "T", "", "p0", "", "p1", "", "read", "(Ljava/util/Collection;Ljava/lang/String;)V", "Landroid/content/Context;", "", "IconCompatParcelizer", "(Landroid/content/Context;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "RemoteActionCompatParcelizer", "AudioAttributesCompatParcelizer", "(Ljava/lang/Object;Ljava/lang/String;)V", "write"}, k = 1, mv = {1, 4, 0})
public final class DefaultAnalyticsCollectorExternalSyntheticLambda8 {
    public static final DefaultAnalyticsCollectorExternalSyntheticLambda8 INSTANCE = new DefaultAnalyticsCollectorExternalSyntheticLambda8();

    static {
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(DefaultAnalyticsCollectorExternalSyntheticLambda8.class.getName(), "");
    }

    private DefaultAnalyticsCollectorExternalSyntheticLambda8() {
    }

    @getMagicModuleMeta
    public static final void IconCompatParcelizer(Object p0, String p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        if (p0 != null) {
            return;
        }
        StringBuilder sb = new StringBuilder("Argument '");
        sb.append(p1);
        sb.append("' cannot be null");
        throw new NullPointerException(sb.toString());
    }

    @getMagicModuleMeta
    private static <T> void RemoteActionCompatParcelizer(Collection<? extends T> p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (p0.isEmpty()) {
            StringBuilder sb = new StringBuilder("Container '");
            sb.append(p1);
            sb.append("' cannot be empty");
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    @getMagicModuleMeta
    private static <T> void read(Collection<? extends T> p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        IconCompatParcelizer(p0, p1);
        Iterator<? extends T> it = p0.iterator();
        while (it.hasNext()) {
            if (it.next() == null) {
                StringBuilder sb = new StringBuilder("Container '");
                sb.append(p1);
                sb.append("' cannot contain null values");
                throw new NullPointerException(sb.toString());
            }
        }
    }

    @getMagicModuleMeta
    public static final <T> void AudioAttributesCompatParcelizer(Collection<? extends T> p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        read(p0, p1);
        RemoteActionCompatParcelizer(p0, p1);
    }

    @getMagicModuleMeta
    public static final void write(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        if (DefaultAnalyticsCollectorMediaPeriodQueueTracker.IconCompatParcelizer(p0)) {
            StringBuilder sb = new StringBuilder("Argument '");
            sb.append(p1);
            sb.append("' cannot be null or empty");
            throw new IllegalArgumentException(sb.toString().toString());
        }
    }

    @getMagicModuleMeta
    public static final void read(String p0, String p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        if (p0.length() > 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("Argument '");
        sb.append(p1);
        sb.append("' cannot be empty");
        throw new IllegalArgumentException(sb.toString().toString());
    }

    @getMagicModuleMeta
    public static final void write() {
        if (!lambdaonMediaMetadataChanged48.onAddQueueItem()) {
            throw new lambdaonMediaItemTransition30("The SDK has not been initialized, make sure to call FacebookSdk.sdkInitialize() first.");
        }
    }

    @getMagicModuleMeta
    public static final void read(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        IconCompatParcelizer(context, LogCategory.CONTEXT);
        context.checkCallingOrSelfPermission("android.permission.INTERNET");
    }

    @getMagicModuleMeta
    public static final void IconCompatParcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        IconCompatParcelizer(context, LogCategory.CONTEXT);
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null) {
            try {
                packageManager.getActivityInfo(new ComponentName(context, "com.facebook.FacebookActivity"), 1);
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
    }
}
