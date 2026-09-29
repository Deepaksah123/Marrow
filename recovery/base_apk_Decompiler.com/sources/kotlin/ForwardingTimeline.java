package kotlin;

import android.os.Handler;
import android.webkit.JavascriptInterface;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hcaptcha.sdk.HCaptchaConfig;
import java.io.Serializable;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
final class ForwardingTimeline implements Serializable {
    private final String AudioAttributesCompatParcelizer;
    private final transient getPreparePositionWithOverride IconCompatParcelizer;
    private final transient Handler write;

    public ForwardingTimeline(Handler handler, HCaptchaConfig hCaptchaConfig, getPreparePositionWithOverride getpreparepositionwithoverride) {
        String strWriteValueAsString;
        if (handler == null) {
            throw new NullPointerException("handler is marked non-null but is null");
        }
        if (hCaptchaConfig == null) {
            throw new NullPointerException("config is marked non-null but is null");
        }
        if (getpreparepositionwithoverride == null) {
            throw new NullPointerException("captchaVerifier is marked non-null but is null");
        }
        this.write = handler;
        this.IconCompatParcelizer = getpreparepositionwithoverride;
        try {
            strWriteValueAsString = new ObjectMapper().writeValueAsString(hCaptchaConfig);
        } catch (JsonProcessingException unused) {
            strWriteValueAsString = null;
        }
        this.AudioAttributesCompatParcelizer = strWriteValueAsString;
    }

    final /* synthetic */ void AudioAttributesCompatParcelizer(DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4 defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4) {
        this.IconCompatParcelizer.RemoteActionCompatParcelizer(new FilteringMediaSourceFilteringMediaPeriod(defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4));
    }

    final /* synthetic */ void read(String str) {
        this.IconCompatParcelizer.IconCompatParcelizer(str);
    }

    @JavascriptInterface
    public final String getConfig() {
        return this.AudioAttributesCompatParcelizer;
    }

    @JavascriptInterface
    public final void onError(int i) {
        new Object[]{Integer.valueOf(i)};
        final DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4 defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4 = DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4.read(i);
        this.write.post(new Runnable() { // from class: o.addTransferListener
            @Override // java.lang.Runnable
            public final void run() {
                this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(defaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4);
            }
        });
    }

    @JavascriptInterface
    public final void onLoaded() {
        Handler handler = this.write;
        final getPreparePositionWithOverride getpreparepositionwithoverride = this.IconCompatParcelizer;
        Objects.requireNonNull(getpreparepositionwithoverride);
        handler.post(new Runnable() { // from class: o.getUri
            @Override // java.lang.Runnable
            public final void run() {
                getpreparepositionwithoverride.read();
            }
        });
    }

    @JavascriptInterface
    public final void onOpen() {
        Handler handler = this.write;
        final getPreparePositionWithOverride getpreparepositionwithoverride = this.IconCompatParcelizer;
        Objects.requireNonNull(getpreparepositionwithoverride);
        handler.post(new Runnable() { // from class: o.getStreamKeys
            @Override // java.lang.Runnable
            public final void run() {
                getpreparepositionwithoverride.RemoteActionCompatParcelizer();
            }
        });
    }

    @JavascriptInterface
    public final void onPass(final String str) {
        this.write.post(new Runnable() { // from class: o.getResponseHeaders
            @Override // java.lang.Runnable
            public final void run() {
                this.AudioAttributesCompatParcelizer.read(str);
            }
        });
    }
}
