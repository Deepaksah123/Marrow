package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.ViewParent;
import androidx.constraintlayout.motion.widget.MotionLayout;
import kotlin._isBlank;

/* JADX INFO: loaded from: classes4.dex */
public class MotionTelltales extends MockView {
    private Paint AudioAttributesCompatParcelizer;
    private float[] AudioAttributesImplApi21Parcelizer;
    private int AudioAttributesImplApi26Parcelizer;
    private int IconCompatParcelizer;
    private float MediaBrowserCompatCustomActionResultReceiver;
    private Matrix RemoteActionCompatParcelizer;
    private MotionLayout write;

    public MotionTelltales(Context context) {
        super(context);
        this.AudioAttributesCompatParcelizer = new Paint();
        this.AudioAttributesImplApi21Parcelizer = new float[2];
        this.RemoteActionCompatParcelizer = new Matrix();
        this.AudioAttributesImplApi26Parcelizer = 0;
        this.IconCompatParcelizer = -65281;
        this.MediaBrowserCompatCustomActionResultReceiver = 0.25f;
        AudioAttributesCompatParcelizer(context, null);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.AudioAttributesCompatParcelizer = new Paint();
        this.AudioAttributesImplApi21Parcelizer = new float[2];
        this.RemoteActionCompatParcelizer = new Matrix();
        this.AudioAttributesImplApi26Parcelizer = 0;
        this.IconCompatParcelizer = -65281;
        this.MediaBrowserCompatCustomActionResultReceiver = 0.25f;
        AudioAttributesCompatParcelizer(context, attributeSet);
    }

    public MotionTelltales(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AudioAttributesCompatParcelizer = new Paint();
        this.AudioAttributesImplApi21Parcelizer = new float[2];
        this.RemoteActionCompatParcelizer = new Matrix();
        this.AudioAttributesImplApi26Parcelizer = 0;
        this.IconCompatParcelizer = -65281;
        this.MediaBrowserCompatCustomActionResultReceiver = 0.25f;
        AudioAttributesCompatParcelizer(context, attributeSet);
    }

    private void AudioAttributesCompatParcelizer(Context context, AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, _isBlank.read.MotionTelltales);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == _isBlank.read.MotionTelltales_telltales_tailColor) {
                    this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getColor(index, this.IconCompatParcelizer);
                } else if (index == _isBlank.read.MotionTelltales_telltales_velocityMode) {
                    this.AudioAttributesImplApi26Parcelizer = typedArrayObtainStyledAttributes.getInt(index, this.AudioAttributesImplApi26Parcelizer);
                } else if (index == _isBlank.read.MotionTelltales_telltales_tailScale) {
                    this.MediaBrowserCompatCustomActionResultReceiver = typedArrayObtainStyledAttributes.getFloat(index, this.MediaBrowserCompatCustomActionResultReceiver);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.AudioAttributesCompatParcelizer.setColor(this.IconCompatParcelizer);
        this.AudioAttributesCompatParcelizer.setStrokeWidth(5.0f);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
    }

    public void setText(CharSequence charSequence) {
        this.read = charSequence.toString();
        requestLayout();
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        postInvalidate();
    }

    @Override // androidx.constraintlayout.utils.widget.MockView, android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        getMatrix().invert(this.RemoteActionCompatParcelizer);
        if (this.write == null) {
            ViewParent parent = getParent();
            if (parent instanceof MotionLayout) {
                this.write = (MotionLayout) parent;
                return;
            }
            return;
        }
        int width = getWidth();
        int height = getHeight();
        float[] fArr = {0.1f, 0.25f, 0.5f, 0.75f, 0.9f};
        for (int i = 0; i < 5; i++) {
            float f = fArr[i];
            for (int i2 = 0; i2 < 5; i2++) {
                float f2 = fArr[i2];
                this.write.IconCompatParcelizer(this, f2, f, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplApi26Parcelizer);
                this.RemoteActionCompatParcelizer.mapVectors(this.AudioAttributesImplApi21Parcelizer);
                float f3 = width * f2;
                float f4 = height * f;
                float[] fArr2 = this.AudioAttributesImplApi21Parcelizer;
                float f5 = fArr2[0];
                float f6 = this.MediaBrowserCompatCustomActionResultReceiver;
                float f7 = fArr2[1];
                this.RemoteActionCompatParcelizer.mapVectors(fArr2);
                canvas.drawLine(f3, f4, f3 - (f5 * f6), f4 - (f7 * f6), this.AudioAttributesCompatParcelizer);
            }
        }
    }
}
