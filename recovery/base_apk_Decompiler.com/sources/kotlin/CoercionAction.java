package kotlin;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\n"}, d2 = {"Lo/CoercionAction;", "", "<init>", "()V", "Landroid/view/View;", "p0", "", "p1", "", "write", "(Landroid/view/View;I)V", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CoercionAction {
    public static final CoercionAction INSTANCE = new CoercionAction();

    private CoercionAction() {
    }

    public final void write(View p0, int p1) {
        p0.setOutlineAmbientShadowColor(p1);
    }

    public final void RemoteActionCompatParcelizer(View p0, int p1) {
        p0.setOutlineSpotShadowColor(p1);
    }
}
