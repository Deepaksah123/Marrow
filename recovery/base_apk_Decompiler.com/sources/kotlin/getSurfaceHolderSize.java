package kotlin;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class getSurfaceHolderSize {
    private final String AudioAttributesCompatParcelizer;
    private final Context IconCompatParcelizer;
    private int read;

    public getSurfaceHolderSize(Context context, String str) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        this.IconCompatParcelizer = context;
        this.AudioAttributesCompatParcelizer = str;
    }

    public final boolean AudioAttributesCompatParcelizer() {
        return RendererCapabilitiesFormatSupport.RemoteActionCompatParcelizer(this.IconCompatParcelizer, RendererCapabilitiesFormatSupport.write(this.AudioAttributesCompatParcelizer, "ssInAppMigrated"), false);
    }

    public final void write(boolean z) {
        RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, RendererCapabilitiesFormatSupport.write(this.AudioAttributesCompatParcelizer, "ssInAppMigrated"), z);
    }

    public final int RemoteActionCompatParcelizer() {
        return RendererCapabilitiesFormatSupport.RemoteActionCompatParcelizer(this.IconCompatParcelizer, RendererCapabilitiesFormatSupport.write(this.AudioAttributesCompatParcelizer, "encryptionLevel"), -1);
    }

    public final int IconCompatParcelizer() {
        return RendererCapabilitiesFormatSupport.RemoteActionCompatParcelizer(this.IconCompatParcelizer, RendererCapabilitiesFormatSupport.write(this.AudioAttributesCompatParcelizer, "encryptionMigrationFailureCount"), -1);
    }

    public final void IconCompatParcelizer(int i) {
        RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, RendererCapabilitiesFormatSupport.write(this.AudioAttributesCompatParcelizer, "encryptionLevel"), i);
    }

    public final void read(boolean z) {
        this.read = z ? 0 : this.read + 1;
        RendererWakeupListener.RatingCompat();
        RendererCapabilitiesFormatSupport.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, RendererCapabilitiesFormatSupport.write(this.AudioAttributesCompatParcelizer, "encryptionMigrationFailureCount"), this.read);
    }
}
