package kotlin;

import android.app.Activity;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/queryContentProviders;", "", "<init>", "()V", "Landroid/app/Activity;", "p0", "", "read", "(Landroid/app/Activity;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class queryContentProviders {
    public static final queryContentProviders INSTANCE = new queryContentProviders();

    private queryContentProviders() {
    }

    public final boolean read(Activity p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.isInMultiWindowMode();
    }
}
