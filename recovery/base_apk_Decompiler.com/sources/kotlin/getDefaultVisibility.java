package kotlin;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import kotlin.Metadata;
import kotlin.unshare;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/unshare$RemoteActionCompatParcelizer;", "Landroid/content/res/Resources;", "p0", "", "p1", "Lo/unshare;", "read", "(Lo/unshare$RemoteActionCompatParcelizer;Landroid/content/res/Resources;I)Lo/unshare;"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class getDefaultVisibility {
    public static final unshare read(unshare.Companion companion, Resources resources, int i) {
        Drawable drawable = resources.getDrawable(i, null);
        toMagicModuleMetaRepoModel.read(drawable, "");
        return _allocMore.AudioAttributesCompatParcelizer(((BitmapDrawable) drawable).getBitmap());
    }
}
