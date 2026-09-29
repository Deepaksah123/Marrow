package kotlin;

import coil.size.Size;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bæ\u0080\u0001\u0018\u0000 \u00032\u00020\u0001:\u0001\u0003J\u0013\u0010\u0003\u001a\u00020\u0002H¦@ø\u0001\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u0082\u0002\u0004\n\u0002\b\u0019"}, d2 = {"Lo/lambdaupdatePlaybackInfo15;", "", "Lcoil/size/Size;", "write", "(Lo/SampleVideos;)Ljava/lang/Object;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface lambdaupdatePlaybackInfo15 {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.IconCompatParcelizer;

    Object write(SampleVideos<? super Size> sampleVideos);

    /* JADX INFO: renamed from: o.lambdaupdatePlaybackInfo15$write, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion IconCompatParcelizer = new Companion();

        private Companion() {
        }

        @getMagicModuleMeta
        public static lambdaupdatePlaybackInfo15 read(Size size) {
            toMagicModuleMetaRepoModel.write(size, "");
            return new lambdasetSkipSilenceEnabled11(size);
        }
    }
}
