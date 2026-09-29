package kotlin;

import android.view.View;
import android.view.Window;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010"}, d2 = {"Lo/onPlayFromUri;", "Lo/onPrepareFromMediaId;", "<init>", "()V", "Lo/onSkipToNext;", "p0", "p1", "Landroid/view/Window;", "p2", "Landroid/view/View;", "p3", "", "p4", "p5", "", "read", "(Lo/onSkipToNext;Lo/onSkipToNext;Landroid/view/Window;Landroid/view/View;ZZ)V"}, k = 1, mv = {1, 8, 0}, xi = 48)
class onPlayFromUri extends onPrepareFromMediaId {
    @Override // kotlin.onPlayFromSearch, kotlin.onPrepareFromSearch, kotlin.onPrepareFromUri
    public void read(onSkipToNext p0, onSkipToNext p1, Window p2, View p3, boolean p4, boolean p5) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        _IsXOfY.write(p2, false);
        p2.setStatusBarColor(p0.RemoteActionCompatParcelizer(p4));
        p2.setNavigationBarColor(p1.RemoteActionCompatParcelizer(p5));
        p2.setStatusBarContrastEnforced(false);
        p2.setNavigationBarContrastEnforced(p1.getRead() == 0);
        findNameForMutator findnameformutator = new findNameForMutator(p2, p3);
        findnameformutator.IconCompatParcelizer(!p4);
        findnameformutator.AudioAttributesCompatParcelizer(!p5);
    }
}
