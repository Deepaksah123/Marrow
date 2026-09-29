package kotlin;

import android.os.Bundle;
import kotlin.VisibilityChecker;

/* JADX INFO: loaded from: classes3.dex */
public final class CmcdHeadersFactory implements TypeResolutionContext, allocReadIOBuffer, anyExplicitsWithoutIgnoral {
    private final anyExplicitsWithoutIgnoral AudioAttributesCompatParcelizer;
    private final withFieldVisibility IconCompatParcelizer;
    private final Bundle RemoteActionCompatParcelizer;
    private final hasMixIns read;
    private final hasMixIns write;

    @Override // kotlin.allocReadIOBuffer
    public final void o_() {
    }

    public CmcdHeadersFactory(anyExplicitsWithoutIgnoral anyexplicitswithoutignoral, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(anyexplicitswithoutignoral, "");
        this.AudioAttributesCompatParcelizer = anyexplicitswithoutignoral;
        this.RemoteActionCompatParcelizer = bundle;
        hasMixIns hasmixins = new hasMixIns();
        this.write = hasmixins;
        this.read = hasmixins;
        _defaultOrOverride _defaultoroverride = new _defaultOrOverride(anyexplicitswithoutignoral.getDefaultViewModelCreationExtras());
        Bundle bundle2 = new Bundle();
        Bundle bundle3 = (Bundle) _defaultoroverride.read(withoutIgnored.write);
        if (bundle3 != null) {
            bundle2.putAll(bundle3);
        }
        if (bundle != null) {
            bundle2.putAll(bundle);
        }
        _defaultoroverride.AudioAttributesCompatParcelizer(withoutIgnored.write, bundle2);
        this.IconCompatParcelizer = _defaultoroverride;
    }

    @Override // kotlin.TypeResolutionContext
    public final hasMixIns getViewModelStore() {
        return this.read;
    }

    @Override // kotlin.allocReadIOBuffer
    public final void AudioAttributesCompatParcelizer() {
        getViewModelStore().IconCompatParcelizer();
    }

    @Override // kotlin.allocReadIOBuffer
    public final void IconCompatParcelizer() {
        getViewModelStore().IconCompatParcelizer();
    }

    @Override // kotlin.anyExplicitsWithoutIgnoral
    public final withFieldVisibility getDefaultViewModelCreationExtras() {
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.anyExplicitsWithoutIgnoral
    public final VisibilityChecker.RemoteActionCompatParcelizer getDefaultViewModelProviderFactory() {
        return this.AudioAttributesCompatParcelizer.getDefaultViewModelProviderFactory();
    }
}
