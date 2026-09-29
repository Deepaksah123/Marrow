package kotlin;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\b"}, d2 = {"Lo/PropertyNamingStrategyUpperCamelCaseStrategy;", "Landroid/view/translation/ViewTranslationCallback;", "<init>", "()V", "Landroid/view/View;", "p0", "", "onShowTranslation", "(Landroid/view/View;)Z", "onHideTranslation", "onClearTranslation"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class PropertyNamingStrategyUpperCamelCaseStrategy implements ViewTranslationCallback {
    public static final PropertyNamingStrategyUpperCamelCaseStrategy INSTANCE = new PropertyNamingStrategyUpperCamelCaseStrategy();

    private PropertyNamingStrategyUpperCamelCaseStrategy() {
    }

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onShowTranslation(View p0) {
        toMagicModuleMetaRepoModel.read(p0, "");
        ((AndroidComposeView) p0).getContentCaptureManager().MediaBrowserCompatCustomActionResultReceiver();
        return true;
    }

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onHideTranslation(View p0) {
        toMagicModuleMetaRepoModel.read(p0, "");
        ((AndroidComposeView) p0).getContentCaptureManager().AudioAttributesCompatParcelizer();
        return true;
    }

    @Override // android.view.translation.ViewTranslationCallback
    public final boolean onClearTranslation(View p0) {
        toMagicModuleMetaRepoModel.read(p0, "");
        ((AndroidComposeView) p0).getContentCaptureManager().write();
        return true;
    }
}
