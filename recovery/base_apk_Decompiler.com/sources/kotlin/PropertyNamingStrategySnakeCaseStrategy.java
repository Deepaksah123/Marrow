package kotlin;

import android.content.Context;
import android.view.PointerIcon;
import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\t\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u000b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\r"}, d2 = {"Lo/PropertyNamingStrategySnakeCaseStrategy;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/extractScalarFromObject;", "p1", "Landroid/view/PointerIcon;", "RemoteActionCompatParcelizer", "(Landroid/content/Context;Lo/extractScalarFromObject;)Landroid/view/PointerIcon;", "Landroid/view/View;", "", "(Landroid/view/View;Lo/extractScalarFromObject;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PropertyNamingStrategySnakeCaseStrategy {
    public static final PropertyNamingStrategySnakeCaseStrategy INSTANCE = new PropertyNamingStrategySnakeCaseStrategy();

    private PropertyNamingStrategySnakeCaseStrategy() {
    }

    public final PointerIcon RemoteActionCompatParcelizer(Context p0, extractScalarFromObject p1) {
        return p1 instanceof _withBase ? ((_withBase) p1).getAudioAttributesCompatParcelizer() : p1 instanceof findCoercionFromBlankString ? PointerIcon.getSystemIcon(p0, ((findCoercionFromBlankString) p1).read()) : PointerIcon.getSystemIcon(p0, 1000);
    }

    public final void RemoteActionCompatParcelizer(View p0, extractScalarFromObject p1) {
        PointerIcon pointerIconRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0.getContext(), p1);
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0.getPointerIcon(), pointerIconRemoteActionCompatParcelizer)) {
            return;
        }
        p0.setPointerIcon(pointerIconRemoteActionCompatParcelizer);
    }
}
