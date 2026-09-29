package kotlin;

import android.content.Context;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/removePackageFromPreferred;", "Lo/queryIntentServices;", "<init>", "()V", "Landroid/content/Context;", "p0", "", "write", "(Landroid/content/Context;)F"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class removePackageFromPreferred implements queryIntentServices {
    public static final removePackageFromPreferred INSTANCE = new removePackageFromPreferred();

    private removePackageFromPreferred() {
    }

    @Override // kotlin.queryIntentServices
    public final float write(Context p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return p0.getResources().getDisplayMetrics().density;
    }
}
