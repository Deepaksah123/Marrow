package kotlin;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class createRenderers {
    static {
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(n.write("ProcessUtils"), "");
    }

    public static final boolean AudioAttributesCompatParcelizer(Context context, b bVar) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bVar, "");
        String strWrite = write();
        String mediaDescriptionCompat = bVar.getMediaDescriptionCompat();
        if (mediaDescriptionCompat != null && mediaDescriptionCompat.length() != 0) {
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strWrite, (Object) bVar.getMediaDescriptionCompat());
        }
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) strWrite, (Object) context.getApplicationInfo().processName);
    }

    private static final String write() {
        return shouldUseStandaloneClock.INSTANCE.IconCompatParcelizer();
    }
}
