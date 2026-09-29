package kotlin;

import android.graphics.Bitmap;
import coil.memory.MemoryCache;
import kotlin.Metadata;
import kotlin.access2400;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b`\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fJ\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J'\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0005\u0010\fJ\u0017\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\rH&¢\u0006\u0004\b\u0005\u0010\u000e"}, d2 = {"Lo/addMediaSourcesInternal;", "", "Lcoil/memory/MemoryCache$Key;", "p0", "Lo/access2400$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "(Lcoil/memory/MemoryCache$Key;)Lo/access2400$RemoteActionCompatParcelizer;", "Landroid/graphics/Bitmap;", "p1", "", "p2", "", "(Lcoil/memory/MemoryCache$Key;Landroid/graphics/Bitmap;Z)V", "", "(I)V", "write"}, k = 1, mv = {1, 5, 1}, xi = 48)
public interface addMediaSourcesInternal {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.write;

    access2400.RemoteActionCompatParcelizer IconCompatParcelizer(MemoryCache.Key p0);

    void IconCompatParcelizer(int p0);

    void IconCompatParcelizer(MemoryCache.Key p0, Bitmap p1, boolean p2);

    /* JADX INFO: renamed from: o.addMediaSourcesInternal$write, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion write = new Companion();

        private Companion() {
        }

        public static addMediaSourcesInternal IconCompatParcelizer(evaluateMediaItemTransitionReason evaluatemediaitemtransitionreason, setPlaybackLooper setplaybacklooper, int i, setSurfaceTextureInternal setsurfacetextureinternal) {
            toMagicModuleMetaRepoModel.write(evaluatemediaitemtransitionreason, "");
            toMagicModuleMetaRepoModel.write(setplaybacklooper, "");
            if (i > 0) {
                return new access2500(evaluatemediaitemtransitionreason, setplaybacklooper, i, setsurfacetextureinternal);
            }
            return evaluatemediaitemtransitionreason instanceof access2502 ? new setVideoSurfaceHolder(evaluatemediaitemtransitionreason) : setVideoTextureView.INSTANCE;
        }
    }
}
