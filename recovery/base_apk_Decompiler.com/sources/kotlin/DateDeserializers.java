package kotlin;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH&¢\u0006\u0004\b\u0007\u0010\u000bJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\rH&¢\u0006\u0004\b\u000e\u0010\u000fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/DateDeserializers;", "", "Landroid/view/View;", "p0", "Landroid/graphics/Rect;", "p1", "", "write", "(Landroid/view/View;Landroid/graphics/Rect;)V", "", "p2", "(Landroid/view/View;II)V", "Landroid/view/WindowManager;", "Landroid/view/ViewGroup$LayoutParams;", "IconCompatParcelizer", "(Landroid/view/WindowManager;Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface DateDeserializers {
    void IconCompatParcelizer(WindowManager p0, View p1, ViewGroup.LayoutParams p2);

    void write(View p0, int p1, int p2);

    void write(View p0, Rect p1);
}
