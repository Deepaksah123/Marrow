package kotlin;

import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Collection;
import kotlin.getEncryptKey;

/* JADX INFO: loaded from: classes4.dex */
public final class setImageType extends getEncryptKey implements TestSubModelCompanion {
    private final Collection<RecentUpdatesReferences> AudioAttributesCompatParcelizer;
    private final WildcardType IconCompatParcelizer;
    private final boolean RemoteActionCompatParcelizer;

    public setImageType(WildcardType wildcardType) {
        toMagicModuleMetaRepoModel.write(wildcardType, "");
        this.IconCompatParcelizer = wildcardType;
        this.AudioAttributesCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.getEncryptKey
    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: merged with bridge method [inline-methods] */
    public WildcardType RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // kotlin.TestSubModelCompanion
    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: merged with bridge method [inline-methods] */
    public getEncryptKey write() {
        Type[] upperBounds = RemoteActionCompatParcelizer().getUpperBounds();
        Type[] lowerBounds = RemoteActionCompatParcelizer().getLowerBounds();
        if (upperBounds.length > 1 || lowerBounds.length > 1) {
            StringBuilder sb = new StringBuilder("Wildcard types with many bounds are not yet supported: ");
            sb.append(RemoteActionCompatParcelizer());
            throw new UnsupportedOperationException(sb.toString());
        }
        if (lowerBounds.length == 1) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerBounds, "");
            Object objMediaBrowserCompatSearchResultReceiver = getOrderDetails.MediaBrowserCompatSearchResultReceiver(lowerBounds);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(objMediaBrowserCompatSearchResultReceiver, "");
            return getEncryptKey.RemoteActionCompatParcelizer.IconCompatParcelizer((Type) objMediaBrowserCompatSearchResultReceiver);
        }
        if (upperBounds.length != 1) {
            return null;
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperBounds, "");
        Type type = (Type) getOrderDetails.MediaBrowserCompatSearchResultReceiver(upperBounds);
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(type, Object.class)) {
            return null;
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(type, "");
        return getEncryptKey.RemoteActionCompatParcelizer.IconCompatParcelizer(type);
    }

    @Override // kotlin.TestSubModelCompanion
    public final boolean AudioAttributesCompatParcelizer() {
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer().getUpperBounds(), "");
        return !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getOrderDetails.MediaBrowserCompatCustomActionResultReceiver(r1), Object.class);
    }

    @Override // kotlin.HomeQbankModel
    public final Collection<RecentUpdatesReferences> read() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.HomeQbankModel
    public final boolean IconCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }
}
