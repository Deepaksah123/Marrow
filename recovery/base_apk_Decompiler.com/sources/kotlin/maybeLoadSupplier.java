package kotlin;

import android.app.Activity;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.util.AndroidRuntimeException;
import com.hcaptcha.sdk.HCaptchaConfig;
import com.hcaptcha.sdk.HCaptchaStateListener;
import kotlin.FilteringMediaSourceFilteringMediaPeriod;
import kotlin.MaskingMediaPeriod;
import kotlin.maybeLoadSupplier;

/* JADX INFO: loaded from: classes3.dex */
public final class maybeLoadSupplier extends MaskingMediaPeriodPrepareListener<MaskingMediaPeriod> {
    private getPreparePositionWithOverride AudioAttributesCompatParcelizer;
    private final Activity IconCompatParcelizer;
    private final IcyDataSource RemoteActionCompatParcelizer;
    private HCaptchaConfig write;

    public static maybeLoadSupplier AudioAttributesCompatParcelizer(Activity activity) {
        if (activity != null) {
            return new maybeLoadSupplier(activity, IcyDataSource.RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer());
        }
        throw new NullPointerException("activity is marked non-null but is null");
    }

    private maybeLoadSupplier AudioAttributesImplApi26Parcelizer() {
        try {
            String string = ((PackageItemInfo) DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda3.read(this.IconCompatParcelizer)).metaData.getString("com.hcaptcha.sdk.site-key");
            if (string != null) {
                return write(string);
            }
            throw new IllegalStateException("The site-key is missing. You can pass it by adding com.hcaptcha.sdk.site-key as meta-data to AndroidManifest.xml or as an argument for setup/verifyWithHCaptcha methods.");
        } catch (PackageManager.NameNotFoundException e) {
            throw new IllegalStateException(e);
        }
    }

    public final maybeLoadSupplier AudioAttributesCompatParcelizer() {
        if (this.AudioAttributesCompatParcelizer == null) {
            AudioAttributesImplApi26Parcelizer();
        }
        return IconCompatParcelizer();
    }

    public final maybeLoadSupplier IconCompatParcelizer(HCaptchaConfig hCaptchaConfig) {
        if (hCaptchaConfig == null) {
            throw new NullPointerException("inputConfig is marked non-null but is null");
        }
        onIcyMetadata.AudioAttributesCompatParcelizer = hCaptchaConfig.getDiagnosticLog().booleanValue();
        HCaptchaStateListener hCaptchaStateListener = new HCaptchaStateListener() { // from class: com.hcaptcha.sdk.HCaptcha$1
            @Override // com.hcaptcha.sdk.HCaptchaStateListener
            public final void AudioAttributesCompatParcelizer(FilteringMediaSourceFilteringMediaPeriod filteringMediaSourceFilteringMediaPeriod) {
                this.AudioAttributesCompatParcelizer.IconCompatParcelizer(filteringMediaSourceFilteringMediaPeriod);
            }

            @Override // com.hcaptcha.sdk.HCaptchaStateListener
            public final void write() {
                this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
            }

            @Override // com.hcaptcha.sdk.HCaptchaStateListener
            public final void RemoteActionCompatParcelizer(String str) {
                maybeLoadSupplier maybeloadsupplier = this.AudioAttributesCompatParcelizer;
                maybeloadsupplier.AudioAttributesCompatParcelizer(maybeloadsupplier.write.getTokenExpiration());
                maybeLoadSupplier maybeloadsupplier2 = this.AudioAttributesCompatParcelizer;
                maybeloadsupplier2.write(new MaskingMediaPeriod(str, maybeloadsupplier2.read));
            }
        };
        try {
            if (Boolean.TRUE.equals(hCaptchaConfig.getHideDialog())) {
                HCaptchaConfig hCaptchaConfigRemoteActionCompatParcelizer = hCaptchaConfig.toBuilder().read(open.INVISIBLE).IconCompatParcelizer(Boolean.FALSE).RemoteActionCompatParcelizer();
                this.write = hCaptchaConfigRemoteActionCompatParcelizer;
                this.AudioAttributesCompatParcelizer = new DefaultMediaSourceFactoryUnknownSubtitlesExtractor(this.IconCompatParcelizer, hCaptchaConfigRemoteActionCompatParcelizer, this.RemoteActionCompatParcelizer, hCaptchaStateListener);
                return this;
            }
            if (!(this.IconCompatParcelizer instanceof maybeGetTypeVariable)) {
                throw new IllegalStateException("Visual hCaptcha challenge verification requires FragmentActivity.");
            }
            this.AudioAttributesCompatParcelizer = lambdamaybeLoadSupplier4comgoogleandroidexoplayer2sourceDefaultMediaSourceFactoryDelegateFactoryLoader.IconCompatParcelizer(hCaptchaConfig, this.RemoteActionCompatParcelizer, hCaptchaStateListener);
            this.write = hCaptchaConfig;
            return this;
        } catch (AndroidRuntimeException unused) {
            hCaptchaStateListener.AudioAttributesCompatParcelizer(new FilteringMediaSourceFilteringMediaPeriod(DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4.ERROR));
            return this;
        }
    }

    private maybeLoadSupplier write(String str) {
        if (str != null) {
            return IconCompatParcelizer(HCaptchaConfig.builder().MediaMetadataCompat(str).RemoteActionCompatParcelizer());
        }
        throw new NullPointerException("siteKey is marked non-null but is null");
    }

    private maybeLoadSupplier(Activity activity, IcyDataSource icyDataSource) {
        if (activity == null) {
            throw new NullPointerException("activity is marked non-null but is null");
        }
        if (icyDataSource == null) {
            throw new NullPointerException("internalConfig is marked non-null but is null");
        }
        this.IconCompatParcelizer = activity;
        this.RemoteActionCompatParcelizer = icyDataSource;
    }

    private maybeLoadSupplier IconCompatParcelizer() {
        this.read.removeCallbacksAndMessages(null);
        getPreparePositionWithOverride getpreparepositionwithoverride = this.AudioAttributesCompatParcelizer;
        if (getpreparepositionwithoverride == null) {
            IconCompatParcelizer(new FilteringMediaSourceFilteringMediaPeriod(DefaultMediaSourceFactoryDelegateFactoryLoaderExternalSyntheticLambda4.ERROR));
            return this;
        }
        getpreparepositionwithoverride.AudioAttributesCompatParcelizer(this.IconCompatParcelizer);
        return this;
    }

    public final void read() {
        getPreparePositionWithOverride getpreparepositionwithoverride = this.AudioAttributesCompatParcelizer;
        if (getpreparepositionwithoverride != null) {
            getpreparepositionwithoverride.write();
            this.AudioAttributesCompatParcelizer = null;
        }
    }
}
