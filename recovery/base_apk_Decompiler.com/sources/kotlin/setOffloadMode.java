package kotlin;

import android.content.ContentResolver;
import android.provider.Settings;

/* JADX INFO: loaded from: classes2.dex */
public final class setOffloadMode extends MagicModuleUseCase implements getCreatedOnDateMs {
    private /* synthetic */ onTearDown IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public setOffloadMode(onTearDown onteardown) {
        super(0);
        this.IconCompatParcelizer = onteardown;
    }

    @Override // kotlin.getCreatedOnDateMs
    public final Object invoke() {
        ContentResolver contentResolver = this.IconCompatParcelizer.IconCompatParcelizer;
        toMagicModuleMetaRepoModel.write(contentResolver);
        return Integer.valueOf(Settings.Global.getInt(contentResolver, "auto_time_zone"));
    }
}
