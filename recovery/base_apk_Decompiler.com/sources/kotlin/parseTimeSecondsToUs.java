package kotlin;

import android.content.Intent;
import java.io.Serializable;

/* JADX INFO: loaded from: classes3.dex */
public final class parseTimeSecondsToUs implements parseStringAttr {
    private final Intent IconCompatParcelizer;

    public parseTimeSecondsToUs(Intent intent) {
        toMagicModuleMetaRepoModel.write(intent, "");
        this.IconCompatParcelizer = intent;
    }

    @Override // kotlin.parseStringAttr
    public final boolean IconCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.IconCompatParcelizer.getBooleanExtra(str, false);
    }

    @Override // kotlin.parseStringAttr
    public final String AudioAttributesCompatParcelizer(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.IconCompatParcelizer.getStringExtra(str);
    }

    @Override // kotlin.parseStringAttr
    public final Serializable write(String str) {
        toMagicModuleMetaRepoModel.write(str, "");
        return this.IconCompatParcelizer.getSerializableExtra(str);
    }
}
