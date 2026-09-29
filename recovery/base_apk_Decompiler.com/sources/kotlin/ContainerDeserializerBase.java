package kotlin;

import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lo/ContainerDeserializerBase;", "Lo/DateDeserializers1;", "<init>", "()V", "Landroid/view/View;", "p0", "", "p1", "p2", "", "write", "(Landroid/view/View;II)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ContainerDeserializerBase extends DateDeserializers1 {
    @Override // kotlin.DateDeserializers1, kotlin.DateDeserializers
    public final void write(View p0, int p1, int p2) {
        p0.setSystemGestureExclusionRects(IntermediateLoginResponseBody.write(new Rect(0, 0, p1, p2)));
    }
}
