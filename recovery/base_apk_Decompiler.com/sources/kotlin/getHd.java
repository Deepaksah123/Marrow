package kotlin;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/* JADX INFO: loaded from: classes4.dex */
public final class getHd extends getPlaybackAllowed {
    @Override // kotlin.getPlaybackAllowed
    public final Random write() {
        ThreadLocalRandom threadLocalRandomCurrent = ThreadLocalRandom.current();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(threadLocalRandomCurrent, "");
        return threadLocalRandomCurrent;
    }

    @Override // kotlin.getFinalData
    public final int write(int i, int i2) {
        return ThreadLocalRandom.current().nextInt(i, i2);
    }
}
