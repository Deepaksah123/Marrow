package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class setBackBuffer {
    private final String AudioAttributesCompatParcelizer;
    private final String RemoteActionCompatParcelizer;

    public setBackBuffer(String str, String str2) {
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        this.RemoteActionCompatParcelizer = str;
        this.AudioAttributesCompatParcelizer = str2;
    }

    public final String IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public final String read() {
        return this.AudioAttributesCompatParcelizer;
    }
}
