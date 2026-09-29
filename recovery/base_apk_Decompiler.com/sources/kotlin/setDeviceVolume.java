package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public interface setDeviceVolume<T, V> {

    public static final class IconCompatParcelizer {
        public static <T, V> boolean AudioAttributesCompatParcelizer(setDeviceVolume<T, V> setdevicevolume, T t) {
            toMagicModuleMetaRepoModel.write(setdevicevolume, "");
            toMagicModuleMetaRepoModel.write(t, "");
            return true;
        }
    }

    boolean RemoteActionCompatParcelizer(T t);

    V write(T t);
}
