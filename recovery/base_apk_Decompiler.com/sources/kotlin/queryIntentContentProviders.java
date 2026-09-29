package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.inputmethodservice.InputMethodService;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/queryIntentContentProviders;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "IconCompatParcelizer", "(Landroid/content/Context;)Landroid/content/Context;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class queryIntentContentProviders {
    public static final queryIntentContentProviders INSTANCE = new queryIntentContentProviders();

    private queryIntentContentProviders() {
    }

    public final Context IconCompatParcelizer(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        Context baseContext = p0;
        while (baseContext instanceof ContextWrapper) {
            if (!(baseContext instanceof Activity) && !(baseContext instanceof InputMethodService)) {
                ContextWrapper contextWrapper = (ContextWrapper) baseContext;
                if (contextWrapper.getBaseContext() != null) {
                    baseContext = contextWrapper.getBaseContext();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(baseContext, "");
                }
            }
            return baseContext;
        }
        return p0;
    }
}
