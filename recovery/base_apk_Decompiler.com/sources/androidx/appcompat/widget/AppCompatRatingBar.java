package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;
import kotlin._init_lambda5;
import kotlin.handleOnBackStarted;
import kotlin.setPositiveButton;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatRatingBar extends RatingBar {
    private final handleOnBackStarted IconCompatParcelizer;

    public AppCompatRatingBar(Context context) {
        this(context, null);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, _init_lambda5.read.ratingBarStyle);
    }

    public AppCompatRatingBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        setPositiveButton.IconCompatParcelizer(this, getContext());
        handleOnBackStarted handleonbackstarted = new handleOnBackStarted(this);
        this.IconCompatParcelizer = handleonbackstarted;
        handleonbackstarted.AudioAttributesCompatParcelizer(attributeSet, i);
    }

    @Override // android.widget.RatingBar, android.widget.AbsSeekBar, android.widget.ProgressBar, android.view.View
    protected void onMeasure(int i, int i2) {
        synchronized (this) {
            super.onMeasure(i, i2);
            Bitmap bitmapWrite = this.IconCompatParcelizer.write();
            if (bitmapWrite != null) {
                setMeasuredDimension(View.resolveSizeAndState(bitmapWrite.getWidth() * getNumStars(), i, 0), getMeasuredHeight());
            }
        }
    }
}
