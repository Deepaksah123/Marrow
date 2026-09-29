package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import kotlin.AlertControllerRecycleListView;

/* JADX INFO: loaded from: classes4.dex */
public class FitWindowsFrameLayout extends FrameLayout implements AlertControllerRecycleListView {
    private AlertControllerRecycleListView.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer;

    public FitWindowsFrameLayout(Context context) {
        super(context);
    }

    public FitWindowsFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnFitSystemWindowsListener(AlertControllerRecycleListView.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.AudioAttributesCompatParcelizer = audioAttributesCompatParcelizer;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }
}
