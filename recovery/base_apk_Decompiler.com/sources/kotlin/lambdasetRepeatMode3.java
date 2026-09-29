package kotlin;

import android.graphics.drawable.Drawable;
import coil.memory.MemoryCache;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0001\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00048'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8'X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\n\u0082\u0001\u0002\u000b\f"}, d2 = {"Lo/lambdasetRepeatMode3;", "", "<init>", "()V", "Landroid/graphics/drawable/Drawable;", "IconCompatParcelizer", "()Landroid/graphics/drawable/Drawable;", "AudioAttributesCompatParcelizer", "Lo/lambdamaybeNotifySurfaceSizeChanged27;", "write", "()Lo/lambdamaybeNotifySurfaceSizeChanged27;", "Lo/lambdasetAudioSessionId9;", "Lo/handlePlaybackInfo;"}, k = 1, mv = {1, 5, 1}, xi = 48)
public abstract class lambdasetRepeatMode3 {
    public abstract Drawable IconCompatParcelizer();

    public abstract lambdamaybeNotifySurfaceSizeChanged27 write();

    private lambdasetRepeatMode3() {
    }

    public /* synthetic */ lambdasetRepeatMode3(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this();
    }

    public static final class AudioAttributesCompatParcelizer {
        private final boolean AudioAttributesCompatParcelizer;
        private final MemoryCache.Key IconCompatParcelizer;
        private final ExoPlayerBuilderExternalSyntheticLambda15 RemoteActionCompatParcelizer;
        private final boolean write;

        public AudioAttributesCompatParcelizer(MemoryCache.Key key, boolean z, ExoPlayerBuilderExternalSyntheticLambda15 exoPlayerBuilderExternalSyntheticLambda15, boolean z2) {
            toMagicModuleMetaRepoModel.write(exoPlayerBuilderExternalSyntheticLambda15, "");
            this.IconCompatParcelizer = key;
            this.AudioAttributesCompatParcelizer = z;
            this.RemoteActionCompatParcelizer = exoPlayerBuilderExternalSyntheticLambda15;
            this.write = z2;
        }

        public final ExoPlayerBuilderExternalSyntheticLambda15 write() {
            return this.RemoteActionCompatParcelizer;
        }

        public final boolean read() {
            return this.write;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof AudioAttributesCompatParcelizer)) {
                return false;
            }
            AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (AudioAttributesCompatParcelizer) obj;
            return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.IconCompatParcelizer, audioAttributesCompatParcelizer.IconCompatParcelizer) && this.AudioAttributesCompatParcelizer == audioAttributesCompatParcelizer.AudioAttributesCompatParcelizer && this.RemoteActionCompatParcelizer == audioAttributesCompatParcelizer.RemoteActionCompatParcelizer && this.write == audioAttributesCompatParcelizer.write;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v1, types: [int] */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r2v0 */
        /* JADX WARN: Type inference failed for: r2v1, types: [int] */
        /* JADX WARN: Type inference failed for: r2v2 */
        public final int hashCode() {
            MemoryCache.Key key = this.IconCompatParcelizer;
            int iHashCode = key == null ? 0 : key.hashCode();
            boolean z = this.AudioAttributesCompatParcelizer;
            ?? r1 = z;
            if (z) {
                r1 = 1;
            }
            int iHashCode2 = this.RemoteActionCompatParcelizer.hashCode();
            boolean z2 = this.write;
            return (((((iHashCode * 31) + r1) * 31) + iHashCode2) * 31) + (z2 ? 1 : z2);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Metadata(memoryCacheKey=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", isSampled=");
            sb.append(this.AudioAttributesCompatParcelizer);
            sb.append(", dataSource=");
            sb.append(this.RemoteActionCompatParcelizer);
            sb.append(", isPlaceholderMemoryCacheKeyPresent=");
            sb.append(this.write);
            sb.append(')');
            return sb.toString();
        }
    }
}
