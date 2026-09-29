package kotlin;

import java.util.Random;

/* JADX INFO: loaded from: classes4.dex */
public final class PlaybackConfigRsModel extends getPlaybackAllowed {
    private final write AudioAttributesCompatParcelizer = new write();

    public static final class write extends ThreadLocal<Random> {
        write() {
        }

        @Override // java.lang.ThreadLocal
        public final /* synthetic */ Random initialValue() {
            return RemoteActionCompatParcelizer();
        }

        private static Random RemoteActionCompatParcelizer() {
            return new Random();
        }
    }

    @Override // kotlin.getPlaybackAllowed
    public final Random write() {
        Random random = this.AudioAttributesCompatParcelizer.get();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(random, "");
        return random;
    }
}
