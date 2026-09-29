package kotlin;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0012\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ'\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\t\u0010\rJ'\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lo/DateDeserializers1;", "Lo/DateDeserializers;", "<init>", "()V", "Landroid/view/View;", "p0", "Landroid/graphics/Rect;", "p1", "", "write", "(Landroid/view/View;Landroid/graphics/Rect;)V", "", "p2", "(Landroid/view/View;II)V", "Landroid/view/WindowManager;", "Landroid/view/ViewGroup$LayoutParams;", "IconCompatParcelizer", "(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
class DateDeserializers1 implements DateDeserializers {
    @Override // kotlin.DateDeserializers
    public void write(View p0, int p1, int p2) {
    }

    @Override // kotlin.DateDeserializers
    public void write(View p0, Rect p1) {
        p0.getWindowVisibleDisplayFrame(p1);
    }

    @Override // kotlin.DateDeserializers
    public void IconCompatParcelizer(WindowManager p0, View p1, ViewGroup.LayoutParams p2) {
        p0.updateViewLayout(p1, p2);
    }
}
