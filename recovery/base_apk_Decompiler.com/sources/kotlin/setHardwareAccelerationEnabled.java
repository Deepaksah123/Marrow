package kotlin;

/* JADX INFO: loaded from: classes4.dex */
final class setHardwareAccelerationEnabled implements Comparable<setHardwareAccelerationEnabled> {
    private final int AudioAttributesCompatParcelizer;
    private final int IconCompatParcelizer;
    private final String read;
    private final String write;

    public setHardwareAccelerationEnabled(int i, int i2, String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.AudioAttributesCompatParcelizer = i;
        this.IconCompatParcelizer = i2;
        this.write = str;
        this.read = str2;
    }

    public final int IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final String read() {
        return this.write;
    }

    public final String write() {
        return this.read;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
    public int compareTo(setHardwareAccelerationEnabled sethardwareaccelerationenabled) {
        toMagicModuleMetaRepoModel.write(sethardwareaccelerationenabled, "");
        int i = this.AudioAttributesCompatParcelizer - sethardwareaccelerationenabled.AudioAttributesCompatParcelizer;
        return i == 0 ? this.IconCompatParcelizer - sethardwareaccelerationenabled.IconCompatParcelizer : i;
    }
}
