package com.google.android.material.carousel;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.carousel.MaskableFrameLayout;
import kotlin.AmrExtractor;
import kotlin.BinarySearchSeekerSeekOperationParams;
import kotlin.DefaultExtractorsFactory;
import kotlin.StdKeyDeserializer;
import kotlin.VorbisUtilVorbisIdHeader;
import kotlin.amrSignatureNb;
import kotlin.getTimeUsAtPosition;
import kotlin.isValidFrameType;
import kotlin.readAmrHeader;
import kotlin.readSample;
import kotlin.resetPeekPosition;

/* JADX INFO: loaded from: classes5.dex */
public class MaskableFrameLayout extends FrameLayout implements DefaultExtractorsFactory, readSample {
    private isValidFrameType AudioAttributesCompatParcelizer;
    private final readAmrHeader AudioAttributesImplBaseParcelizer;
    private resetPeekPosition IconCompatParcelizer;
    private final RectF RemoteActionCompatParcelizer;
    private Boolean read;
    private float write;

    public MaskableFrameLayout(Context context) {
        this(context, null);
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaskableFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.write = -1.0f;
        this.RemoteActionCompatParcelizer = new RectF();
        this.AudioAttributesImplBaseParcelizer = readAmrHeader.IconCompatParcelizer(this);
        this.read = null;
        setShapeAppearanceModel(isValidFrameType.AudioAttributesCompatParcelizer(context, attributeSet, i, 0).RemoteActionCompatParcelizer());
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        super.onSizeChanged(i, i2, i3, i4);
        if (this.write != -1.0f) {
            read();
        }
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        rect.set((int) this.RemoteActionCompatParcelizer.left, (int) this.RemoteActionCompatParcelizer.top, (int) this.RemoteActionCompatParcelizer.right, (int) this.RemoteActionCompatParcelizer.bottom);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Boolean bool = this.read;
        if (bool != null) {
            this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(this, bool.booleanValue());
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.read = Boolean.valueOf(this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer());
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer((View) this, true);
        super.onDetachedFromWindow();
    }

    @Override // kotlin.readSample
    public void setShapeAppearanceModel(isValidFrameType isvalidframetype) {
        isValidFrameType isvalidframetypeAudioAttributesCompatParcelizer = isvalidframetype.AudioAttributesCompatParcelizer(new isValidFrameType.read() { // from class: o.setRetryPosition
            @Override // o.isValidFrameType.read
            public final VorbisUtilVorbisIdHeader IconCompatParcelizer(VorbisUtilVorbisIdHeader vorbisUtilVorbisIdHeader) {
                return MaskableFrameLayout.RemoteActionCompatParcelizer(vorbisUtilVorbisIdHeader);
            }
        });
        this.AudioAttributesCompatParcelizer = isvalidframetypeAudioAttributesCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer.write(this, isvalidframetypeAudioAttributesCompatParcelizer);
    }

    public static /* synthetic */ VorbisUtilVorbisIdHeader RemoteActionCompatParcelizer(VorbisUtilVorbisIdHeader vorbisUtilVorbisIdHeader) {
        return vorbisUtilVorbisIdHeader instanceof amrSignatureNb ? AmrExtractor.RemoteActionCompatParcelizer((amrSignatureNb) vorbisUtilVorbisIdHeader) : vorbisUtilVorbisIdHeader;
    }

    @Deprecated
    public void setMaskXPercentage(float f) {
        float fWrite = StdKeyDeserializer.write(f, BitmapDescriptorFactory.HUE_RED, 1.0f);
        if (this.write != fWrite) {
            this.write = fWrite;
            read();
        }
    }

    private void read() {
        if (this.write != -1.0f) {
            float fRemoteActionCompatParcelizer = BinarySearchSeekerSeekOperationParams.RemoteActionCompatParcelizer(BitmapDescriptorFactory.HUE_RED, getWidth() / 2.0f, BitmapDescriptorFactory.HUE_RED, 1.0f, this.write);
            setMaskRectF(new RectF(fRemoteActionCompatParcelizer, BitmapDescriptorFactory.HUE_RED, getWidth() - fRemoteActionCompatParcelizer, getHeight()));
        }
    }

    @Override // kotlin.DefaultExtractorsFactory
    public void setMaskRectF(RectF rectF) {
        this.RemoteActionCompatParcelizer.set(rectF);
        IconCompatParcelizer();
    }

    public void setOnMaskChangedListener(resetPeekPosition resetpeekposition) {
        this.IconCompatParcelizer = resetpeekposition;
    }

    private void IconCompatParcelizer() {
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(this, this.RemoteActionCompatParcelizer);
    }

    public void setForceCompatClipping(boolean z) {
        this.AudioAttributesImplBaseParcelizer.IconCompatParcelizer(this, z);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.RemoteActionCompatParcelizer.isEmpty() && motionEvent.getAction() == 0) {
            if (!this.RemoteActionCompatParcelizer.contains(motionEvent.getX(), motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public final /* synthetic */ void RemoteActionCompatParcelizer(Canvas canvas) {
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(canvas, new getTimeUsAtPosition.IconCompatParcelizer() { // from class: o.skipFully
            @Override // o.getTimeUsAtPosition.IconCompatParcelizer
            public final void RemoteActionCompatParcelizer(Canvas canvas2) {
                this.write.RemoteActionCompatParcelizer(canvas2);
            }
        });
    }
}
