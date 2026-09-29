package com.google.android.material.snackbar;

import android.animation.TimeInterpolator;
import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import kotlin.AviStreamHeaderChunk;
import kotlin.BinarySearchSeekerSeekOperationParams;
import kotlin.InvalidTypeIdException;
import kotlin.calculateNextSearchBytePosition;
import kotlin.createExtractors;
import kotlin.getSampleRateLookupKey;

/* JADX INFO: loaded from: classes3.dex */
public class SnackbarContentLayout extends LinearLayout implements AviStreamHeaderChunk {
    private TextView AudioAttributesCompatParcelizer;
    private final TimeInterpolator IconCompatParcelizer;
    private Button read;
    private int write;

    public SnackbarContentLayout(Context context) {
        this(context, null);
    }

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.IconCompatParcelizer = getSampleRateLookupKey.read(context, calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingEmphasizedInterpolator, BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer);
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.AudioAttributesCompatParcelizer = (TextView) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.snackbar_text);
        this.read = (Button) findViewById(calculateNextSearchBytePosition.AudioAttributesImplApi26Parcelizer.snackbar_action);
    }

    public final TextView IconCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    public final Button read() {
        return this.read;
    }

    final void read(float f) {
        if (f != 1.0f) {
            this.read.setTextColor(createExtractors.write(createExtractors.RemoteActionCompatParcelizer(this, calculateNextSearchBytePosition.IconCompatParcelizer.colorSurface), this.read.getCurrentTextColor(), f));
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getOrientation() != 1) {
            int dimensionPixelSize = getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.design_snackbar_padding_vertical_2lines);
            int dimensionPixelSize2 = getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.design_snackbar_padding_vertical);
            Layout layout = this.AudioAttributesCompatParcelizer.getLayout();
            boolean z = layout != null && layout.getLineCount() > 1;
            if (z && this.write > 0 && this.read.getMeasuredWidth() > this.write) {
                if (!AudioAttributesCompatParcelizer(1, dimensionPixelSize, dimensionPixelSize - dimensionPixelSize2)) {
                    return;
                }
            } else {
                if (!z) {
                    dimensionPixelSize = dimensionPixelSize2;
                }
                if (!AudioAttributesCompatParcelizer(0, dimensionPixelSize, dimensionPixelSize)) {
                    return;
                }
            }
            super.onMeasure(i, i2);
        }
    }

    private boolean AudioAttributesCompatParcelizer(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.AudioAttributesCompatParcelizer.getPaddingTop() == i2 && this.AudioAttributesCompatParcelizer.getPaddingBottom() == i3) {
            return z;
        }
        write(this.AudioAttributesCompatParcelizer, i2, i3);
        return true;
    }

    private static void write(View view, int i, int i2) {
        if (InvalidTypeIdException.onRewind(view)) {
            InvalidTypeIdException.read(view, InvalidTypeIdException.onCommand(view), i, InvalidTypeIdException.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    @Override // kotlin.AviStreamHeaderChunk
    public final void read(int i, int i2) {
        this.AudioAttributesCompatParcelizer.setAlpha(BitmapDescriptorFactory.HUE_RED);
        long j = i2;
        long j2 = i;
        this.AudioAttributesCompatParcelizer.animate().alpha(1.0f).setDuration(j).setInterpolator(this.IconCompatParcelizer).setStartDelay(j2).start();
        if (this.read.getVisibility() == 0) {
            this.read.setAlpha(BitmapDescriptorFactory.HUE_RED);
            this.read.animate().alpha(1.0f).setDuration(j).setInterpolator(this.IconCompatParcelizer).setStartDelay(j2).start();
        }
    }

    @Override // kotlin.AviStreamHeaderChunk
    public final void read(int i) {
        this.AudioAttributesCompatParcelizer.setAlpha(1.0f);
        long j = i;
        this.AudioAttributesCompatParcelizer.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(j).setInterpolator(this.IconCompatParcelizer).setStartDelay(0L).start();
        if (this.read.getVisibility() == 0) {
            this.read.setAlpha(1.0f);
            this.read.animate().alpha(BitmapDescriptorFactory.HUE_RED).setDuration(j).setInterpolator(this.IconCompatParcelizer).setStartDelay(0L).start();
        }
    }

    public void setMaxInlineActionWidth(int i) {
        this.write = i;
    }
}
