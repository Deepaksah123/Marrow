package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DefaultAudioSinkConfiguration {
    public static final DefaultAudioSinkApi31 AudioAttributesCompatParcelizer(Object obj) {
        if (C0177getRfBanners.write(obj)) {
            SdkPayloadData.IconCompatParcelizer(obj);
            return new Ac4Util(obj);
        }
        Throwable thIconCompatParcelizer = C0177getRfBanners.IconCompatParcelizer(obj);
        toMagicModuleMetaRepoModel.write((Object) thIconCompatParcelizer);
        return new codecNeedsDiscardChannelsWorkaround(thIconCompatParcelizer);
    }

    public static final DefaultAudioSinkApi31 write(DefaultAudioSinkApi31 defaultAudioSinkApi31) {
        if (defaultAudioSinkApi31 instanceof Ac4Util) {
            return (DefaultAudioSinkApi31) ((Ac4Util) defaultAudioSinkApi31).RemoteActionCompatParcelizer;
        }
        if (defaultAudioSinkApi31 instanceof codecNeedsDiscardChannelsWorkaround) {
            return defaultAudioSinkApi31;
        }
        throw new RenewEligibleCreator();
    }
}
