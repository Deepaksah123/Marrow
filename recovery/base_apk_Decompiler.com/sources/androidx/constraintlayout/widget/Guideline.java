package androidx.constraintlayout.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;

/* JADX INFO: loaded from: classes2.dex */
public class Guideline extends View {
    private boolean RemoteActionCompatParcelizer;

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public Guideline(Context context) {
        super(context);
        this.RemoteActionCompatParcelizer = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.RemoteActionCompatParcelizer = true;
        super.setVisibility(8);
    }

    public Guideline(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.RemoteActionCompatParcelizer = true;
        super.setVisibility(8);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.RemoteActionCompatParcelizer && layoutParams.onPrepare == i) {
            return;
        }
        layoutParams.onPrepare = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.RemoteActionCompatParcelizer && layoutParams.onPlayFromSearch == i) {
            return;
        }
        layoutParams.onPlayFromSearch = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        if (this.RemoteActionCompatParcelizer && layoutParams.onPlayFromUri == f) {
            return;
        }
        layoutParams.onPlayFromUri = f;
        setLayoutParams(layoutParams);
    }

    public void setFilterRedundantCalls(boolean z) {
        this.RemoteActionCompatParcelizer = z;
    }
}
