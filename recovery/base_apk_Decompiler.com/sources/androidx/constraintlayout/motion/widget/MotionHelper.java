package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintHelper;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.HashMap;
import kotlin.PrimitiveArrayDeserializersByteDeser;
import kotlin._isBlank;
import kotlin.handleSingleElementUnwrapped;

/* JADX INFO: loaded from: classes2.dex */
public class MotionHelper extends ConstraintHelper implements PrimitiveArrayDeserializersByteDeser {
    private boolean AudioAttributesImplApi21Parcelizer;
    private float AudioAttributesImplApi26Parcelizer;
    private View[] AudioAttributesImplBaseParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;

    public boolean IconCompatParcelizer() {
        return false;
    }

    public void read(int i) {
    }

    public void read(MotionLayout motionLayout, HashMap<View, handleSingleElementUnwrapped> map) {
    }

    public void setProgress(View view, float f) {
    }

    public MotionHelper(Context context) {
        super(context);
        this.MediaBrowserCompatCustomActionResultReceiver = false;
        this.AudioAttributesImplApi21Parcelizer = false;
    }

    public MotionHelper(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.MediaBrowserCompatCustomActionResultReceiver = false;
        this.AudioAttributesImplApi21Parcelizer = false;
        AudioAttributesCompatParcelizer(attributeSet);
    }

    public MotionHelper(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.MediaBrowserCompatCustomActionResultReceiver = false;
        this.AudioAttributesImplApi21Parcelizer = false;
        AudioAttributesCompatParcelizer(attributeSet);
    }

    @Override // androidx.constraintlayout.widget.ConstraintHelper
    public final void AudioAttributesCompatParcelizer(AttributeSet attributeSet) {
        super.AudioAttributesCompatParcelizer(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, _isBlank.read.MotionHelper);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == _isBlank.read.MotionHelper_onShow) {
                    this.MediaBrowserCompatCustomActionResultReceiver = typedArrayObtainStyledAttributes.getBoolean(index, this.MediaBrowserCompatCustomActionResultReceiver);
                } else if (index == _isBlank.read.MotionHelper_onHide) {
                    this.AudioAttributesImplApi21Parcelizer = typedArrayObtainStyledAttributes.getBoolean(index, this.AudioAttributesImplApi21Parcelizer);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public final boolean RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    public final boolean read() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public void setProgress(float f) {
        this.AudioAttributesImplApi26Parcelizer = f;
        int i = 0;
        if (this.write > 0) {
            this.AudioAttributesImplBaseParcelizer = write((ConstraintLayout) getParent());
            while (i < this.write) {
                setProgress(this.AudioAttributesImplBaseParcelizer[i], f);
                i++;
            }
            return;
        }
        ViewGroup viewGroup = (ViewGroup) getParent();
        int childCount = viewGroup.getChildCount();
        while (i < childCount) {
            View childAt = viewGroup.getChildAt(i);
            if (!(childAt instanceof MotionHelper)) {
                setProgress(childAt, f);
            }
            i++;
        }
    }
}
