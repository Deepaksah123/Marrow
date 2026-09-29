package kotlin;

import android.os.Bundle;

/* JADX INFO: loaded from: classes3.dex */
public final class onPlaybackError implements sendTeardownRequest {
    private final Bundle IconCompatParcelizer;

    public onPlaybackError(Bundle bundle) {
        toMagicModuleMetaRepoModel.write(bundle, "");
        this.IconCompatParcelizer = bundle;
    }

    @Override // kotlin.sendTeardownRequest
    public final boolean RemoteActionCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.IconCompatParcelizer.getBoolean(str);
    }

    @Override // kotlin.sendTeardownRequest
    public final boolean AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.IconCompatParcelizer.getBoolean(str, false);
    }

    @Override // kotlin.sendTeardownRequest
    public final int IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.IconCompatParcelizer.getInt(str, 0);
    }

    @Override // kotlin.sendTeardownRequest
    public final String AudioAttributesImplBaseParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.IconCompatParcelizer.getString(str);
    }

    @Override // kotlin.sendTeardownRequest
    public final String IconCompatParcelizer(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        String string = this.IconCompatParcelizer.getString(str, str2);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    @Override // kotlin.sendTeardownRequest
    public final String read(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        String string = this.IconCompatParcelizer.getString(str, "");
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        return string;
    }

    @Override // kotlin.sendTeardownRequest
    public final boolean write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.IconCompatParcelizer.getBoolean(str, false);
    }
}
