package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class getPlaceholderState {
    private final String IconCompatParcelizer;
    private final handleIncreaseDeviceVolume read;
    private final Object write;

    public getPlaceholderState(String str, handleIncreaseDeviceVolume handleincreasedevicevolume, Object obj) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(handleincreasedevicevolume, "");
        this.IconCompatParcelizer = str;
        this.read = handleincreasedevicevolume;
        this.write = obj;
    }

    public final String AudioAttributesCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final handleIncreaseDeviceVolume read() {
        return this.read;
    }

    public final Object write() {
        return this.write;
    }
}
