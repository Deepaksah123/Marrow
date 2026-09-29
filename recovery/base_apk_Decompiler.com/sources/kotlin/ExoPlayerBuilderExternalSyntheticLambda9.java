package kotlin;

import coil.size.Size;

/* JADX INFO: loaded from: classes2.dex */
public interface ExoPlayerBuilderExternalSyntheticLambda9<T> {

    public static final class AudioAttributesCompatParcelizer {
        public static <T> boolean write(ExoPlayerBuilderExternalSyntheticLambda9<T> exoPlayerBuilderExternalSyntheticLambda9, T t) {
            toMagicModuleMetaRepoModel.write(exoPlayerBuilderExternalSyntheticLambda9, "");
            toMagicModuleMetaRepoModel.write(t, "");
            return true;
        }
    }

    Object RemoteActionCompatParcelizer(T t, Size size, ExoPlayerBuilderExternalSyntheticLambda4 exoPlayerBuilderExternalSyntheticLambda4, SampleVideos<? super ExoPlayerDeviceComponent> sampleVideos);

    String RemoteActionCompatParcelizer(T t);

    boolean write(T t);
}
