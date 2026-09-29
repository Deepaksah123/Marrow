package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.JdkDeserializers;
import kotlin._isBlank;

/* JADX INFO: loaded from: classes2.dex */
public class Placeholder extends View {
    private int AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;
    private View RemoteActionCompatParcelizer;

    public Placeholder(Context context) {
        super(context);
        this.IconCompatParcelizer = -1;
        this.RemoteActionCompatParcelizer = null;
        this.AudioAttributesCompatParcelizer = 4;
        IconCompatParcelizer(null);
    }

    public Placeholder(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.IconCompatParcelizer = -1;
        this.RemoteActionCompatParcelizer = null;
        this.AudioAttributesCompatParcelizer = 4;
        IconCompatParcelizer(attributeSet);
    }

    public Placeholder(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.IconCompatParcelizer = -1;
        this.RemoteActionCompatParcelizer = null;
        this.AudioAttributesCompatParcelizer = 4;
        IconCompatParcelizer(attributeSet);
    }

    private void IconCompatParcelizer(AttributeSet attributeSet) {
        super.setVisibility(this.AudioAttributesCompatParcelizer);
        this.IconCompatParcelizer = -1;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, _isBlank.read.ConstraintLayout_placeholder);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == _isBlank.read.ConstraintLayout_placeholder_content) {
                    this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getResourceId(index, this.IconCompatParcelizer);
                } else if (index == _isBlank.read.ConstraintLayout_placeholder_placeholder_emptyVisibility) {
                    this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getInt(index, this.AudioAttributesCompatParcelizer);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setEmptyVisibility(int i) {
        this.AudioAttributesCompatParcelizer = i;
    }

    public final View read() {
        return this.RemoteActionCompatParcelizer;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (isInEditMode()) {
            canvas.drawRGB(223, 223, 223);
            Paint paint = new Paint();
            paint.setARGB(255, 210, 210, 210);
            paint.setTextAlign(Paint.Align.CENTER);
            paint.setTypeface(Typeface.create(Typeface.DEFAULT, 0));
            Rect rect = new Rect();
            canvas.getClipBounds(rect);
            paint.setTextSize(rect.height());
            int iHeight = rect.height();
            int iWidth = rect.width();
            paint.setTextAlign(Paint.Align.LEFT);
            paint.getTextBounds("?", 0, 1, rect);
            canvas.drawText("?", ((iWidth / 2.0f) - (rect.width() / 2.0f)) - rect.left, ((iHeight / 2.0f) + (rect.height() / 2.0f)) - rect.bottom, paint);
        }
    }

    public final void RemoteActionCompatParcelizer(ConstraintLayout constraintLayout) {
        if (this.IconCompatParcelizer == -1 && !isInEditMode()) {
            setVisibility(this.AudioAttributesCompatParcelizer);
        }
        View viewFindViewById = constraintLayout.findViewById(this.IconCompatParcelizer);
        this.RemoteActionCompatParcelizer = viewFindViewById;
        if (viewFindViewById != null) {
            ((ConstraintLayout.LayoutParams) viewFindViewById.getLayoutParams()).onSetShuffleMode = true;
            this.RemoteActionCompatParcelizer.setVisibility(0);
            setVisibility(0);
        }
    }

    public void setContentId(int i) {
        View viewFindViewById;
        if (this.IconCompatParcelizer != i) {
            View view = this.RemoteActionCompatParcelizer;
            if (view != null) {
                view.setVisibility(0);
                ((ConstraintLayout.LayoutParams) this.RemoteActionCompatParcelizer.getLayoutParams()).onSetShuffleMode = false;
                this.RemoteActionCompatParcelizer = null;
            }
            this.IconCompatParcelizer = i;
            if (i == -1 || (viewFindViewById = ((View) getParent()).findViewById(i)) == null) {
                return;
            }
            viewFindViewById.setVisibility(8);
        }
    }

    public final void write() {
        if (this.RemoteActionCompatParcelizer == null) {
            return;
        }
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        ConstraintLayout.LayoutParams layoutParams2 = (ConstraintLayout.LayoutParams) this.RemoteActionCompatParcelizer.getLayoutParams();
        layoutParams2.getOnBackPressedDispatcherannotations.onAddQueueItem(0);
        if (layoutParams.getOnBackPressedDispatcherannotations.onPlayFromMediaId() != JdkDeserializers.IconCompatParcelizer.FIXED) {
            layoutParams.getOnBackPressedDispatcherannotations.onFastForward(layoutParams2.getOnBackPressedDispatcherannotations.onSetShuffleMode());
        }
        if (layoutParams.getOnBackPressedDispatcherannotations.onSeekTo() != JdkDeserializers.IconCompatParcelizer.FIXED) {
            layoutParams.getOnBackPressedDispatcherannotations.MediaMetadataCompat(layoutParams2.getOnBackPressedDispatcherannotations.onAddQueueItem());
        }
        layoutParams2.getOnBackPressedDispatcherannotations.onAddQueueItem(8);
    }
}
