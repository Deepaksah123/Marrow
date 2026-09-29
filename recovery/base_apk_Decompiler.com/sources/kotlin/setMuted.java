package kotlin;

import com.clevertap.android.sdk.CleverTapInstanceConfig;

/* JADX INFO: loaded from: classes2.dex */
public final class setMuted {
    private final CleverTapInstanceConfig AudioAttributesCompatParcelizer;
    private final getChildTimelines IconCompatParcelizer;
    private final getMutedFromManager read;
    private final RenewEligible write;

    public setMuted(getMutedFromManager getmutedfrommanager, CleverTapInstanceConfig cleverTapInstanceConfig, getChildTimelines getchildtimelines) {
        toMagicModuleMetaRepoModel.write(getmutedfrommanager, "");
        toMagicModuleMetaRepoModel.write(cleverTapInstanceConfig, "");
        toMagicModuleMetaRepoModel.write(getchildtimelines, "");
        this.read = getmutedfrommanager;
        this.AudioAttributesCompatParcelizer = cleverTapInstanceConfig;
        this.IconCompatParcelizer = getchildtimelines;
        this.write = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.StreamVolumeManagerListener
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return setMuted.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
            }
        });
    }

    public final updateVolumeAndNotifyIfChanged AudioAttributesCompatParcelizer() {
        return (updateVolumeAndNotifyIfChanged) this.write.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final updateVolumeAndNotifyIfChanged IconCompatParcelizer(setMuted setmuted) {
        toMagicModuleMetaRepoModel.write(setmuted, "");
        getMinVolume getminvolume = getMinVolume.INSTANCE;
        return getMinVolume.AudioAttributesCompatParcelizer(setmuted.read, setmuted.AudioAttributesCompatParcelizer, setmuted.IconCompatParcelizer);
    }

    public final boolean write(boolean z) {
        return AudioAttributesCompatParcelizer().read(z);
    }
}
