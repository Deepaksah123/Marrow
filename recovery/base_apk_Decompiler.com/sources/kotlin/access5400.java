package kotlin;

import android.graphics.Bitmap;
import java.io.File;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/access5400;", "", "<init>", "()V", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class access5400 {

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o.access5400$IconCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\r\u0010\u000bJ%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000e\u0010\u000b"}, d2 = {"Lo/access5400$IconCompatParcelizer;", "", "<init>", "()V", "Ljava/io/File;", "p0", "Lo/PlaylistTimeline1;", "p1", "Lo/access4300;", "", "RemoteActionCompatParcelizer", "(Ljava/io/File;Lo/PlaylistTimeline1;)Lo/access4300;", "Landroid/graphics/Bitmap;", "AudioAttributesCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static access4300<byte[]> RemoteActionCompatParcelizer(File p0, PlaylistTimeline1 p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new SimpleBasePlayerExternalSyntheticLambda62(new SimpleBasePlayerMediaItemDataBuilder(5120L, Runtime.getRuntime().maxMemory() / 32768, p0), p1);
        }

        public static access4300<Bitmap> AudioAttributesCompatParcelizer(File p0, PlaylistTimeline1 p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new SimpleBasePlayer1(new SimpleBasePlayerMediaItemDataBuilder(20480L, Runtime.getRuntime().maxMemory() / 32768, p0), p1);
        }

        public static access4300<byte[]> write(File p0, PlaylistTimeline1 p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            return new SimpleBasePlayerExternalSyntheticLambda7(new SimpleBasePlayerMediaItemDataBuilder(15360L, Runtime.getRuntime().maxMemory() / 32768, p0), p1);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
