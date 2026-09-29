package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.appcompat.widget.AppCompatButton;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin._isBlank;

/* JADX INFO: loaded from: classes4.dex */
public class MotionButton extends AppCompatButton {
    private float AudioAttributesCompatParcelizer;
    private ViewOutlineProvider IconCompatParcelizer;
    private float RemoteActionCompatParcelizer;
    private Path read;
    private RectF write;

    public MotionButton(Context context) {
        super(context);
        this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesCompatParcelizer = Float.NaN;
        IconCompatParcelizer(null);
    }

    public MotionButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesCompatParcelizer = Float.NaN;
        IconCompatParcelizer(attributeSet);
    }

    public MotionButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.RemoteActionCompatParcelizer = BitmapDescriptorFactory.HUE_RED;
        this.AudioAttributesCompatParcelizer = Float.NaN;
        IconCompatParcelizer(attributeSet);
    }

    private void IconCompatParcelizer(AttributeSet attributeSet) {
        setPadding(0, 0, 0, 0);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, _isBlank.read.ImageFilterView);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == _isBlank.read.ImageFilterView_round) {
                    setRound(typedArrayObtainStyledAttributes.getDimension(index, BitmapDescriptorFactory.HUE_RED));
                } else if (index == _isBlank.read.ImageFilterView_roundPercent) {
                    setRoundPercent(typedArrayObtainStyledAttributes.getFloat(index, BitmapDescriptorFactory.HUE_RED));
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setRoundPercent(float f) {
        boolean z = this.RemoteActionCompatParcelizer != f;
        this.RemoteActionCompatParcelizer = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.read == null) {
                this.read = new Path();
            }
            if (this.write == null) {
                this.write = new RectF();
            }
            if (this.IconCompatParcelizer == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionButton.1
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), (Math.min(r3, r4) * MotionButton.this.RemoteActionCompatParcelizer) / 2.0f);
                    }
                };
                this.IconCompatParcelizer = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            int width = getWidth();
            int height = getHeight();
            float fMin = (Math.min(width, height) * this.RemoteActionCompatParcelizer) / 2.0f;
            this.write.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, width, height);
            this.read.reset();
            this.read.addRoundRect(this.write, fMin, fMin, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    public void setRound(float f) {
        if (Float.isNaN(f)) {
            this.AudioAttributesCompatParcelizer = f;
            float f2 = this.RemoteActionCompatParcelizer;
            this.RemoteActionCompatParcelizer = -1.0f;
            setRoundPercent(f2);
            return;
        }
        boolean z = this.AudioAttributesCompatParcelizer != f;
        this.AudioAttributesCompatParcelizer = f;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (this.read == null) {
                this.read = new Path();
            }
            if (this.write == null) {
                this.write = new RectF();
            }
            if (this.IconCompatParcelizer == null) {
                ViewOutlineProvider viewOutlineProvider = new ViewOutlineProvider() { // from class: androidx.constraintlayout.utils.widget.MotionButton.5
                    @Override // android.view.ViewOutlineProvider
                    public final void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, MotionButton.this.getWidth(), MotionButton.this.getHeight(), MotionButton.this.AudioAttributesCompatParcelizer);
                    }
                };
                this.IconCompatParcelizer = viewOutlineProvider;
                setOutlineProvider(viewOutlineProvider);
            }
            setClipToOutline(true);
            this.write.set(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, getWidth(), getHeight());
            this.read.reset();
            Path path = this.read;
            RectF rectF = this.write;
            float f3 = this.AudioAttributesCompatParcelizer;
            path.addRoundRect(rectF, f3, f3, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (z) {
            invalidateOutline();
        }
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
    }
}
