package kotlin;

import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lo/translate;", "", "<init>", "()V", "Landroid/view/View;", "p0", "Lo/_skipWS;", "p1", "Lo/_closeObjectScope;", "p2", "", "IconCompatParcelizer", "(Landroid/view/View;Lo/_skipWS;Lo/_closeObjectScope;)Z"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class translate {
    public static final translate INSTANCE = new translate();

    private translate() {
    }

    public final boolean IconCompatParcelizer(View p0, _skipWS p1, _closeObjectScope p2) {
        return p0.startDragAndDrop(p1.getRead(), p2, p1.getAudioAttributesCompatParcelizer(), p1.getRemoteActionCompatParcelizer());
    }
}
