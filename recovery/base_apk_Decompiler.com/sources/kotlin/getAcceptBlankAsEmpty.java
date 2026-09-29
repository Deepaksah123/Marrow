package kotlin;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/getAcceptBlankAsEmpty;", "", "<init>", "()V", "Landroid/view/View;", "p0", "Lo/parseVersionPart;", "p1", "", "read", "(Landroid/view/View;Lo/parseVersionPart;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getAcceptBlankAsEmpty {
    public static final getAcceptBlankAsEmpty INSTANCE = new getAcceptBlankAsEmpty();

    private getAcceptBlankAsEmpty() {
    }

    public final void read(View p0, parseVersionPart p1) {
        p0.setRenderEffect(p1 != null ? p1.cc_() : null);
    }
}
