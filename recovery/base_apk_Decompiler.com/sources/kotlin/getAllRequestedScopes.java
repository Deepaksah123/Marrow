package kotlin;

import kotlin.getRealClientPackageName;

/* JADX INFO: loaded from: classes3.dex */
public final class getAllRequestedScopes {
    public static final getRealClientPackageName read(CachedContent cachedContent) {
        toMagicModuleMetaRepoModel.write(cachedContent, "");
        return cachedContent.getMediaMetadataCompat().length() > 0 ? new getRealClientPackageName.IconCompatParcelizer(cachedContent.getMediaMetadataCompat(), cachedContent.getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), cachedContent.getOnCustomAction()) : cachedContent.getMediaBrowserCompatSearchResultReceiver().length() > 0 ? new getRealClientPackageName.write(cachedContent.getMediaBrowserCompatSearchResultReceiver()) : getRealClientPackageName.read.INSTANCE;
    }
}
