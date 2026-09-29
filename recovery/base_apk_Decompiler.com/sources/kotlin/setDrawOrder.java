package kotlin;

import android.os.Bundle;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@submitMagicModule
public final class setDrawOrder {
    private final Bundle IconCompatParcelizer;

    public static final void read(Bundle bundle, String str, List<String> list) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(list, "");
        bundle.putStringArrayList(str, CombinedChart.write(list));
    }

    public static final void IconCompatParcelizer(Bundle bundle, String str, Bundle bundle2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle2, "");
        bundle.putBundle(str, bundle2);
    }

    public static final void AudioAttributesCompatParcelizer(Bundle bundle, Bundle bundle2) {
        toMagicModuleMetaRepoModel.write(bundle2, "");
        bundle.putAll(bundle2);
    }

    public static final void AudioAttributesCompatParcelizer(Bundle bundle, String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        bundle.remove(str);
    }

    public static Bundle AudioAttributesCompatParcelizer(Bundle bundle) {
        toMagicModuleMetaRepoModel.write(bundle, "");
        return bundle;
    }

    private static boolean write(Bundle bundle, Object obj) {
        return (obj instanceof setDrawOrder) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(bundle, ((setDrawOrder) obj).IconCompatParcelizer());
    }

    private static int RemoteActionCompatParcelizer(Bundle bundle) {
        return bundle.hashCode();
    }

    private static String write(Bundle bundle) {
        StringBuilder sb = new StringBuilder("SavedStateWriter(source=");
        sb.append(bundle);
        sb.append(')');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        return write(this.IconCompatParcelizer, obj);
    }

    public final int hashCode() {
        return RemoteActionCompatParcelizer(this.IconCompatParcelizer);
    }

    public final String toString() {
        return write(this.IconCompatParcelizer);
    }

    private /* synthetic */ Bundle IconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
