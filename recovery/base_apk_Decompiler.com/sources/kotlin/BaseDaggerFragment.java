package kotlin;

import java.io.IOException;
import java.util.List;
import kotlin.MarrowTheme;

/* JADX INFO: loaded from: classes4.dex */
public final class BaseDaggerFragment implements MarrowTheme.AudioAttributesCompatParcelizer {
    private final int AudioAttributesCompatParcelizer;
    private final int AudioAttributesImplApi21Parcelizer;
    private final int AudioAttributesImplBaseParcelizer;
    private int IconCompatParcelizer;
    private final ThemeKtExternalSyntheticLambda0 MediaBrowserCompatCustomActionResultReceiver;
    private final List<MarrowTheme> MediaBrowserCompatItemReceiver;
    private final LicenseProviderModule RemoteActionCompatParcelizer;
    private final PlaybackDrmModule read;
    private final int write;

    /* JADX WARN: Multi-variable type inference failed */
    public BaseDaggerFragment(PlaybackDrmModule playbackDrmModule, List<? extends MarrowTheme> list, int i, LicenseProviderModule licenseProviderModule, ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0, int i2, int i3, int i4) {
        toMagicModuleMetaRepoModel.write(playbackDrmModule, "");
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(themeKtExternalSyntheticLambda0, "");
        this.read = playbackDrmModule;
        this.MediaBrowserCompatItemReceiver = list;
        this.AudioAttributesCompatParcelizer = i;
        this.RemoteActionCompatParcelizer = licenseProviderModule;
        this.MediaBrowserCompatCustomActionResultReceiver = themeKtExternalSyntheticLambda0;
        this.write = i2;
        this.AudioAttributesImplApi21Parcelizer = i3;
        this.AudioAttributesImplBaseParcelizer = i4;
    }

    public final PlaybackDrmModule write() {
        return this.read;
    }

    public final LicenseProviderModule MediaBrowserCompatItemReceiver() {
        return this.RemoteActionCompatParcelizer;
    }

    public final ThemeKtExternalSyntheticLambda0 AudioAttributesImplApi21Parcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.write;
    }

    public final int AudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public final int MediaBrowserCompatCustomActionResultReceiver() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    public static /* synthetic */ BaseDaggerFragment read(BaseDaggerFragment baseDaggerFragment, int i, LicenseProviderModule licenseProviderModule, ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0, int i2, int i3, int i4, int i5) {
        if ((i5 & 1) != 0) {
            i = baseDaggerFragment.AudioAttributesCompatParcelizer;
        }
        int i6 = i;
        if ((i5 & 2) != 0) {
            licenseProviderModule = baseDaggerFragment.RemoteActionCompatParcelizer;
        }
        LicenseProviderModule licenseProviderModule2 = licenseProviderModule;
        if ((i5 & 4) != 0) {
            themeKtExternalSyntheticLambda0 = baseDaggerFragment.MediaBrowserCompatCustomActionResultReceiver;
        }
        ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda02 = themeKtExternalSyntheticLambda0;
        if ((i5 & 8) != 0) {
            i2 = baseDaggerFragment.write;
        }
        int i7 = i2;
        if ((i5 & 16) != 0) {
            i3 = baseDaggerFragment.AudioAttributesImplApi21Parcelizer;
        }
        int i8 = i3;
        if ((i5 & 32) != 0) {
            i4 = baseDaggerFragment.AudioAttributesImplBaseParcelizer;
        }
        return baseDaggerFragment.RemoteActionCompatParcelizer(i6, licenseProviderModule2, themeKtExternalSyntheticLambda02, i7, i8, i4);
    }

    private BaseDaggerFragment RemoteActionCompatParcelizer(int i, LicenseProviderModule licenseProviderModule, ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0, int i2, int i3, int i4) {
        toMagicModuleMetaRepoModel.write(themeKtExternalSyntheticLambda0, "");
        return new BaseDaggerFragment(this.read, this.MediaBrowserCompatItemReceiver, i, licenseProviderModule, themeKtExternalSyntheticLambda0, i2, i3, i4);
    }

    @Override // o.MarrowTheme.AudioAttributesCompatParcelizer
    public final UserLoggedOutException RemoteActionCompatParcelizer() {
        LicenseProviderModule licenseProviderModule = this.RemoteActionCompatParcelizer;
        return licenseProviderModule != null ? licenseProviderModule.getConnection() : null;
    }

    public final int AudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    @Override // o.MarrowTheme.AudioAttributesCompatParcelizer
    public final toDownloadInfo read() {
        return this.read;
    }

    @Override // o.MarrowTheme.AudioAttributesCompatParcelizer
    public final ThemeKtExternalSyntheticLambda0 IconCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    @Override // o.MarrowTheme.AudioAttributesCompatParcelizer
    public final C0156TypeKt RemoteActionCompatParcelizer(ThemeKtExternalSyntheticLambda0 themeKtExternalSyntheticLambda0) throws IOException {
        toMagicModuleMetaRepoModel.write(themeKtExternalSyntheticLambda0, "");
        if (this.AudioAttributesCompatParcelizer >= this.MediaBrowserCompatItemReceiver.size()) {
            throw new IllegalStateException("Check failed.".toString());
        }
        this.IconCompatParcelizer++;
        LicenseProviderModule licenseProviderModule = this.RemoteActionCompatParcelizer;
        if (licenseProviderModule != null) {
            if (!licenseProviderModule.getFinder().write(themeKtExternalSyntheticLambda0.getUrl())) {
                StringBuilder sb = new StringBuilder("network interceptor ");
                sb.append(this.MediaBrowserCompatItemReceiver.get(this.AudioAttributesCompatParcelizer - 1));
                sb.append(" must retain the same host and port");
                throw new IllegalStateException(sb.toString().toString());
            }
            if (this.IconCompatParcelizer != 1) {
                StringBuilder sb2 = new StringBuilder("network interceptor ");
                sb2.append(this.MediaBrowserCompatItemReceiver.get(this.AudioAttributesCompatParcelizer - 1));
                sb2.append(" must call proceed() exactly once");
                throw new IllegalStateException(sb2.toString().toString());
            }
        }
        BaseDaggerFragment baseDaggerFragment = read(this, this.AudioAttributesCompatParcelizer + 1, null, themeKtExternalSyntheticLambda0, 0, 0, 0, 58);
        MarrowTheme marrowTheme = this.MediaBrowserCompatItemReceiver.get(this.AudioAttributesCompatParcelizer);
        C0156TypeKt c0156TypeKtAudioAttributesCompatParcelizer = marrowTheme.AudioAttributesCompatParcelizer(baseDaggerFragment);
        if (c0156TypeKtAudioAttributesCompatParcelizer == null) {
            StringBuilder sb3 = new StringBuilder("interceptor ");
            sb3.append(marrowTheme);
            sb3.append(" returned null");
            throw new NullPointerException(sb3.toString());
        }
        if (this.RemoteActionCompatParcelizer != null && this.AudioAttributesCompatParcelizer + 1 < this.MediaBrowserCompatItemReceiver.size() && baseDaggerFragment.IconCompatParcelizer != 1) {
            StringBuilder sb4 = new StringBuilder("network interceptor ");
            sb4.append(marrowTheme);
            sb4.append(" must call proceed() exactly once");
            throw new IllegalStateException(sb4.toString().toString());
        }
        if (c0156TypeKtAudioAttributesCompatParcelizer.getBody() != null) {
            return c0156TypeKtAudioAttributesCompatParcelizer;
        }
        StringBuilder sb5 = new StringBuilder("interceptor ");
        sb5.append(marrowTheme);
        sb5.append(" returned a response with no body");
        throw new IllegalStateException(sb5.toString().toString());
    }
}
