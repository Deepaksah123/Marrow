package kotlin;

import android.graphics.PathEffect;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\t\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\b"}, d2 = {"Lo/finishCurrentSegment;", "Lo/setCurrentLength;", "Landroid/graphics/PathEffect;", "p0", "<init>", "(Landroid/graphics/PathEffect;)V", "read", "Landroid/graphics/PathEffect;", "()Landroid/graphics/PathEffect;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class finishCurrentSegment implements setCurrentLength {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final PathEffect IconCompatParcelizer;

    public finishCurrentSegment(PathEffect pathEffect) {
        this.IconCompatParcelizer = pathEffect;
    }

    /* JADX INFO: renamed from: read, reason: from getter */
    public final PathEffect getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }
}
