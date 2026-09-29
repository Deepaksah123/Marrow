package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public final class isKotlinClass {
    public static final boolean write(KotlinDeserializers kotlinDeserializers, KotlinDeserializers kotlinDeserializers2, accessgetStaticJsonKeyGetter accessgetstaticjsonkeygetter) {
        toMagicModuleMetaRepoModel.write(kotlinDeserializers, "");
        toMagicModuleMetaRepoModel.write(kotlinDeserializers2, "");
        toMagicModuleMetaRepoModel.write(accessgetstaticjsonkeygetter, "");
        if (kotlinDeserializers.write() > kotlinDeserializers2.write()) {
            return true;
        }
        if (kotlinDeserializers.write() < kotlinDeserializers2.write()) {
            return false;
        }
        return KotlinFeature.IconCompatParcelizer(kotlinDeserializers.read(), kotlinDeserializers2.read(), accessgetstaticjsonkeygetter);
    }
}
