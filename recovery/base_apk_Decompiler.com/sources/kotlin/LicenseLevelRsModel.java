package kotlin;

/* JADX INFO: loaded from: classes4.dex */
public abstract class LicenseLevelRsModel<V> implements PlaybackConfigRootResponseBody<Object, V> {
    private V IconCompatParcelizer;

    public LicenseLevelRsModel(V v) {
        this.IconCompatParcelizer = v;
    }

    @Override // kotlin.PlaybackConfigRootResponseBody, kotlin.PlaybackConfigRootRequestBody
    public final V read(Object obj, isResolutionNotSupported<?> isresolutionnotsupported) {
        toMagicModuleMetaRepoModel.write(isresolutionnotsupported, "");
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.PlaybackConfigRootResponseBody
    public final void RemoteActionCompatParcelizer(isResolutionNotSupported<?> isresolutionnotsupported, V v) {
        toMagicModuleMetaRepoModel.write(isresolutionnotsupported, "");
        write(isresolutionnotsupported);
        this.IconCompatParcelizer = v;
        IconCompatParcelizer(isresolutionnotsupported);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ObservableProperty(value=");
        sb.append(this.IconCompatParcelizer);
        sb.append(')');
        return sb.toString();
    }

    private static void IconCompatParcelizer(isResolutionNotSupported<?> isresolutionnotsupported) {
        toMagicModuleMetaRepoModel.write(isresolutionnotsupported, "");
    }

    protected boolean write(isResolutionNotSupported<?> isresolutionnotsupported) {
        toMagicModuleMetaRepoModel.write(isresolutionnotsupported, "");
        return true;
    }
}
