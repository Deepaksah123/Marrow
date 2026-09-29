package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin._isBlank;
import kotlin.convertValue;

/* JADX INFO: loaded from: classes4.dex */
public class ReactiveGuide extends View implements convertValue.AudioAttributesCompatParcelizer {
    private boolean AudioAttributesCompatParcelizer;
    private int IconCompatParcelizer;
    private int read;
    private boolean write;

    @Override // android.view.View
    public void draw(Canvas canvas) {
    }

    @Override // android.view.View
    public void setVisibility(int i) {
    }

    public ReactiveGuide(Context context) {
        super(context);
        this.IconCompatParcelizer = -1;
        this.AudioAttributesCompatParcelizer = false;
        this.read = 0;
        this.write = true;
        super.setVisibility(8);
        RemoteActionCompatParcelizer(null);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.IconCompatParcelizer = -1;
        this.AudioAttributesCompatParcelizer = false;
        this.read = 0;
        this.write = true;
        super.setVisibility(8);
        RemoteActionCompatParcelizer(attributeSet);
    }

    public ReactiveGuide(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.IconCompatParcelizer = -1;
        this.AudioAttributesCompatParcelizer = false;
        this.read = 0;
        this.write = true;
        super.setVisibility(8);
        RemoteActionCompatParcelizer(attributeSet);
    }

    private void RemoteActionCompatParcelizer(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, _isBlank.read.ConstraintLayout_ReactiveGuide);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == _isBlank.read.ConstraintLayout_ReactiveGuide_reactiveGuide_valueId) {
                    this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getResourceId(index, this.IconCompatParcelizer);
                } else if (index == _isBlank.read.ConstraintLayout_ReactiveGuide_reactiveGuide_animateChange) {
                    this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getBoolean(index, this.AudioAttributesCompatParcelizer);
                } else if (index == _isBlank.read.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToConstraintSet) {
                    this.read = typedArrayObtainStyledAttributes.getResourceId(index, this.read);
                } else if (index == _isBlank.read.ConstraintLayout_ReactiveGuide_reactiveGuide_applyToAllConstraintSets) {
                    this.write = typedArrayObtainStyledAttributes.getBoolean(index, this.write);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        if (this.IconCompatParcelizer != -1) {
            ConstraintLayout.MediaBrowserCompatMediaItem().RemoteActionCompatParcelizer(this.IconCompatParcelizer, this);
        }
    }

    public void setAttributeId(int i) {
        convertValue convertvalueMediaBrowserCompatMediaItem = ConstraintLayout.MediaBrowserCompatMediaItem();
        int i2 = this.IconCompatParcelizer;
        if (i2 != -1) {
            convertvalueMediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(i2, this);
        }
        this.IconCompatParcelizer = i;
        if (i != -1) {
            convertvalueMediaBrowserCompatMediaItem.RemoteActionCompatParcelizer(i, this);
        }
    }

    public void setApplyToConstraintSetId(int i) {
        this.read = i;
    }

    public void setAnimateChange(boolean z) {
        this.AudioAttributesCompatParcelizer = z;
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setGuidelineBegin(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.onPrepare = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelineEnd(int i) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.onPlayFromSearch = i;
        setLayoutParams(layoutParams);
    }

    public void setGuidelinePercent(float f) {
        ConstraintLayout.LayoutParams layoutParams = (ConstraintLayout.LayoutParams) getLayoutParams();
        layoutParams.onPlayFromUri = f;
        setLayoutParams(layoutParams);
    }
}
