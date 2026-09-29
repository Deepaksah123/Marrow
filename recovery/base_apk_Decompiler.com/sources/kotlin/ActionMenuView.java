package kotlin;

/* JADX INFO: loaded from: classes.dex */
public final class ActionMenuView {
    private static final setProvider read = new setProvider(0);

    public static final <V> setExpandedActionViewsExclusive<V> IconCompatParcelizer() {
        setProvider setprovider = read;
        toMagicModuleMetaRepoModel.read(setprovider, "");
        return setprovider;
    }

    public static final <V> setExpandedActionViewsExclusive<V> RemoteActionCompatParcelizer() {
        setProvider setprovider = read;
        toMagicModuleMetaRepoModel.read(setprovider, "");
        return setprovider;
    }

    public static final <V> setProvider<V> write() {
        return new setProvider<>(0, 1, null);
    }

    public static final <V> setProvider<V> AudioAttributesCompatParcelizer(int i, V v, int i2, V v2, int i3, V v3) {
        setProvider<V> setprovider = new setProvider<>(0, 1, null);
        setprovider.write(i, v);
        setprovider.write(i2, v2);
        setprovider.write(i3, v3);
        return setprovider;
    }
}
