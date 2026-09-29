package kotlin;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import com.hcaptcha.sdk.HCaptchaConfig;
import com.hcaptcha.sdk.HCaptchaStateListener;
import com.hcaptcha.sdk.HCaptchaWebView;
import kotlin.overridePreparePositionUs;

/* JADX INFO: loaded from: classes3.dex */
final class DefaultMediaSourceFactoryUnknownSubtitlesExtractor implements getPreparePositionWithOverride {
    private final HCaptchaStateListener AudioAttributesCompatParcelizer;
    private boolean IconCompatParcelizer;
    private boolean MediaBrowserCompatItemReceiver;
    private boolean RemoteActionCompatParcelizer;
    private final LoopingMediaSource read;
    private final HCaptchaConfig write;

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.onPrepareComplete
    public void IconCompatParcelizer(String str) {
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(str);
    }

    public DefaultMediaSourceFactoryUnknownSubtitlesExtractor(Activity activity, HCaptchaConfig hCaptchaConfig, IcyDataSource icyDataSource, HCaptchaStateListener hCaptchaStateListener) {
        if (activity == null) {
            throw new NullPointerException("activity is marked non-null but is null");
        }
        if (hCaptchaConfig == null) {
            throw new NullPointerException("config is marked non-null but is null");
        }
        if (icyDataSource == null) {
            throw new NullPointerException("internalConfig is marked non-null but is null");
        }
        this.write = hCaptchaConfig;
        this.AudioAttributesCompatParcelizer = hCaptchaStateListener;
        HCaptchaWebView hCaptchaWebView = new HCaptchaWebView(activity);
        hCaptchaWebView.setId(overridePreparePositionUs.IconCompatParcelizer.webView);
        hCaptchaWebView.setVisibility(8);
        if (hCaptchaWebView.getParent() == null) {
            ((ViewGroup) activity.getWindow().getDecorView().getRootView()).addView(hCaptchaWebView);
        }
        this.read = new LoopingMediaSource(new Handler(Looper.getMainLooper()), activity, hCaptchaConfig, icyDataSource, this, hCaptchaWebView);
    }

    @Override // kotlin.getPreparePositionUs
    public final void RemoteActionCompatParcelizer(FilteringMediaSourceFilteringMediaPeriod filteringMediaSourceFilteringMediaPeriod) {
        if (filteringMediaSourceFilteringMediaPeriod == null) {
            throw new NullPointerException("exception is marked non-null but is null");
        }
        if (this.read.IconCompatParcelizer(filteringMediaSourceFilteringMediaPeriod)) {
            this.read.IconCompatParcelizer();
        } else {
            this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(filteringMediaSourceFilteringMediaPeriod);
        }
    }

    @Override // kotlin.getPreparePositionOverrideUs
    public final void read() {
        this.MediaBrowserCompatItemReceiver = true;
        if (this.IconCompatParcelizer) {
            this.IconCompatParcelizer = false;
            write();
        } else if (this.RemoteActionCompatParcelizer) {
            this.RemoteActionCompatParcelizer = false;
            this.read.IconCompatParcelizer();
        }
    }

    @Override // kotlin.setPrepareListener
    public final void RemoteActionCompatParcelizer() {
        this.AudioAttributesCompatParcelizer.write();
    }

    @Override // kotlin.getPreparePositionWithOverride
    public final void write() {
        if (!this.MediaBrowserCompatItemReceiver) {
            this.IconCompatParcelizer = true;
            return;
        }
        this.read.AudioAttributesCompatParcelizer();
        HCaptchaWebView hCaptchaWebViewWrite = this.read.write();
        if (hCaptchaWebViewWrite.getParent() != null) {
            ((ViewGroup) hCaptchaWebViewWrite.getParent()).removeView(hCaptchaWebViewWrite);
        }
    }

    @Override // kotlin.getPreparePositionWithOverride
    public final void AudioAttributesCompatParcelizer(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("activity is marked non-null but is null");
        }
        if (this.MediaBrowserCompatItemReceiver) {
            this.read.IconCompatParcelizer();
        } else {
            this.RemoteActionCompatParcelizer = true;
        }
    }
}
