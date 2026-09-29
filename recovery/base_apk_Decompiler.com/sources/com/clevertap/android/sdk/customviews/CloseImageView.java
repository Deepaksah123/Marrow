package com.clevertap.android.sdk.customviews;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.TypedValue;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import kotlin.RendererWakeupListener;

/* JADX INFO: loaded from: classes2.dex */
public final class CloseImageView extends AppCompatImageView {
    private final int AudioAttributesCompatParcelizer;

    public CloseImageView(Context context) {
        super(context);
        this.AudioAttributesCompatParcelizer = write();
        setId(199272);
    }

    public CloseImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.AudioAttributesCompatParcelizer = write();
        setId(199272);
    }

    public CloseImageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.AudioAttributesCompatParcelizer = write();
        setId(199272);
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        try {
            Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(getContext().getResources(), R.drawable.ct_close, null);
            if (bitmapDecodeResource != null) {
                int i = this.AudioAttributesCompatParcelizer;
                canvas.drawBitmap(Bitmap.createScaledBitmap(bitmapDecodeResource, i, i, true), BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED, new Paint());
            } else {
                RendererWakeupListener.MediaMetadataCompat();
            }
        } catch (Throwable unused) {
            RendererWakeupListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
    }

    @Override // android.widget.ImageView, android.view.View
    protected final void onMeasure(int i, int i2) {
        int i3 = this.AudioAttributesCompatParcelizer;
        setMeasuredDimension(i3, i3);
    }

    private int write() {
        return (int) TypedValue.applyDimension(1, 40.0f, getResources().getDisplayMetrics());
    }
}
