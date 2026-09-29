package kotlin;

import android.content.Context;

/* JADX INFO: loaded from: classes2.dex */
public final class getVolumeMultiplier extends setVisibleYRange {
    private final Context IconCompatParcelizer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public getVolumeMultiplier(Context context, int i, int i2) {
        super(i, i2);
        toMagicModuleMetaRepoModel.write(context, "");
        this.IconCompatParcelizer = context;
    }

    @Override // kotlin.setVisibleYRange
    public final void AudioAttributesCompatParcelizer(setDrawSliceText setdrawslicetext) {
        toMagicModuleMetaRepoModel.write(setdrawslicetext, "");
        if (this.RemoteActionCompatParcelizer >= 10) {
            setdrawslicetext.IconCompatParcelizer("INSERT OR REPLACE INTO `Preference` (`key`, `long_value`) VALUES (@key, @long_value)", new Object[]{"reschedule_needed", 1});
        } else {
            this.IconCompatParcelizer.getSharedPreferences("androidx.work.util.preferences", 0).edit().putBoolean("reschedule_needed", true).apply();
        }
    }
}
