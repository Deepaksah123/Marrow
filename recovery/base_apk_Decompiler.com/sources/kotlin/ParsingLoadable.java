package kotlin;

import com.hcaptcha.sdk.HCaptchaConfig;
import java.io.Serializable;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: loaded from: classes3.dex */
public final class ParsingLoadable implements LoopingMediaSourceLoopingTimeline, Serializable {
    private final int RemoteActionCompatParcelizer = 2;
    private final AtomicInteger write = new AtomicInteger(0);

    @Override // kotlin.LoopingMediaSourceLoopingTimeline
    public final boolean IconCompatParcelizer(HCaptchaConfig hCaptchaConfig, FilteringMediaSourceFilteringMediaPeriod filteringMediaSourceFilteringMediaPeriod) {
        if (this.write.incrementAndGet() <= this.RemoteActionCompatParcelizer) {
            return (filteringMediaSourceFilteringMediaPeriod != null ? filteringMediaSourceFilteringMediaPeriod.AudioAttributesCompatParcelizer() : null) == DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4.SESSION_TIMEOUT;
        }
        return false;
    }
}
