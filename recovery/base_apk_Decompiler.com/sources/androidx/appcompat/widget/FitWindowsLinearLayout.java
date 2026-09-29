package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import kotlin.AlertControllerRecycleListView;

/* JADX INFO: loaded from: classes4.dex */
public class FitWindowsLinearLayout extends LinearLayout implements AlertControllerRecycleListView {
    private AlertControllerRecycleListView.AudioAttributesCompatParcelizer RemoteActionCompatParcelizer;

    public FitWindowsLinearLayout(Context context) {
        super(context);
    }

    public FitWindowsLinearLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void setOnFitSystemWindowsListener(AlertControllerRecycleListView.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.RemoteActionCompatParcelizer = audioAttributesCompatParcelizer;
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }
}
