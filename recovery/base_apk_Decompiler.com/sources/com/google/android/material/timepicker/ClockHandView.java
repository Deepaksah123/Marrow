package com.google.android.material.timepicker;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.Pair;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.BinarySearchSeekerSeekOperationParams;
import kotlin.InvalidTypeIdException;
import kotlin.calculateNextSearchBytePosition;
import kotlin.checkAndPeekStreamMarker;
import kotlin.getSampleRateLookupKey;
import kotlin.readVorbisCommentMetadataBlock;

/* JADX INFO: loaded from: classes5.dex */
public class ClockHandView extends View {
    private boolean AudioAttributesCompatParcelizer;
    private int AudioAttributesImplApi21Parcelizer;
    private float AudioAttributesImplApi26Parcelizer;
    private int AudioAttributesImplBaseParcelizer;
    private final int IconCompatParcelizer;
    private double MediaBrowserCompatCustomActionResultReceiver;
    private float MediaBrowserCompatItemReceiver;
    private float MediaBrowserCompatMediaItem;
    private boolean MediaBrowserCompatSearchResultReceiver;
    private final int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private final List<RemoteActionCompatParcelizer> MediaDescriptionCompat;
    private boolean MediaMetadataCompat;
    private AudioAttributesCompatParcelizer RatingCompat;
    private final TimeInterpolator RemoteActionCompatParcelizer;
    private final int handleMediaPlayPauseIfPendingOnHandler;
    private final RectF onAddQueueItem;
    private final ValueAnimator onCommand;
    private final Paint onCustomAction;
    private final int onPlay;
    private final float read;
    private boolean write;

    public interface AudioAttributesCompatParcelizer {
        void write(float f, boolean z);
    }

    public interface RemoteActionCompatParcelizer {
        void RemoteActionCompatParcelizer(float f, boolean z);
    }

    public ClockHandView(Context context) {
        this(context, null);
    }

    public ClockHandView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.materialClockStyle);
    }

    public ClockHandView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.onCommand = new ValueAnimator();
        this.MediaDescriptionCompat = new ArrayList();
        Paint paint = new Paint();
        this.onCustomAction = paint;
        this.onAddQueueItem = new RectF();
        this.AudioAttributesImplApi21Parcelizer = 1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.ClockHandView, i, calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_TimePicker_Clock);
        this.IconCompatParcelizer = getSampleRateLookupKey.write(context, calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationLong2, 200);
        this.RemoteActionCompatParcelizer = getSampleRateLookupKey.read(context, calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingEmphasizedInterpolator, BinarySearchSeekerSeekOperationParams.AudioAttributesCompatParcelizer);
        this.AudioAttributesImplBaseParcelizer = typedArrayObtainStyledAttributes.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.ClockHandView_materialCircleRadius, 0);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = typedArrayObtainStyledAttributes.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.ClockHandView_selectorSize, 0);
        this.onPlay = getResources().getDimensionPixelSize(calculateNextSearchBytePosition.write.material_clock_hand_stroke_width);
        this.read = r7.getDimensionPixelSize(calculateNextSearchBytePosition.write.material_clock_hand_center_dot_radius);
        int color = typedArrayObtainStyledAttributes.getColor(calculateNextSearchBytePosition.MediaMetadataCompat.ClockHandView_clockHandColor, 0);
        paint.setAntiAlias(true);
        paint.setColor(color);
        setHandRotation(BitmapDescriptorFactory.HUE_RED);
        this.handleMediaPlayPauseIfPendingOnHandler = ViewConfiguration.get(context).getScaledTouchSlop();
        InvalidTypeIdException.AudioAttributesImplBaseParcelizer(this, 2);
        typedArrayObtainStyledAttributes.recycle();
    }

    @Override // android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (this.onCommand.isRunning()) {
            return;
        }
        setHandRotation(IconCompatParcelizer());
    }

    public void setHandRotation(float f) {
        setHandRotation(f, false);
    }

    public void setHandRotation(float f, boolean z) {
        ValueAnimator valueAnimator = this.onCommand;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            IconCompatParcelizer(f, false);
            return;
        }
        Pair<Float, Float> pairAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(f);
        this.onCommand.setFloatValues(((Float) pairAudioAttributesCompatParcelizer.first).floatValue(), ((Float) pairAudioAttributesCompatParcelizer.second).floatValue());
        this.onCommand.setDuration(this.IconCompatParcelizer);
        this.onCommand.setInterpolator(this.RemoteActionCompatParcelizer);
        this.onCommand.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.outputSampleMetadata
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(valueAnimator2);
            }
        });
        this.onCommand.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.timepicker.ClockHandView.4
            @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator) {
                animator.end();
            }
        });
        this.onCommand.start();
    }

    public final /* synthetic */ void AudioAttributesCompatParcelizer(ValueAnimator valueAnimator) {
        IconCompatParcelizer(((Float) valueAnimator.getAnimatedValue()).floatValue(), true);
    }

    private Pair<Float, Float> AudioAttributesCompatParcelizer(float f) {
        float fIconCompatParcelizer = IconCompatParcelizer();
        if (Math.abs(fIconCompatParcelizer - f) > 180.0f) {
            if (fIconCompatParcelizer > 180.0f && f < 180.0f) {
                f += 360.0f;
            }
            if (fIconCompatParcelizer < 180.0f && f > 180.0f) {
                fIconCompatParcelizer += 360.0f;
            }
        }
        return new Pair<>(Float.valueOf(fIconCompatParcelizer), Float.valueOf(f));
    }

    private void IconCompatParcelizer(float f, boolean z) {
        float f2 = f % 360.0f;
        this.MediaBrowserCompatMediaItem = f2;
        this.MediaBrowserCompatCustomActionResultReceiver = Math.toRadians(f2 - 90.0f);
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float fWrite = write(this.AudioAttributesImplApi21Parcelizer);
        float fCos = width + (((float) Math.cos(this.MediaBrowserCompatCustomActionResultReceiver)) * fWrite);
        float fSin = height + (fWrite * ((float) Math.sin(this.MediaBrowserCompatCustomActionResultReceiver)));
        RectF rectF = this.onAddQueueItem;
        float f3 = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        rectF.set(fCos - f3, fSin - f3, fCos + f3, fSin + f3);
        Iterator<RemoteActionCompatParcelizer> it = this.MediaDescriptionCompat.iterator();
        while (it.hasNext()) {
            it.next().RemoteActionCompatParcelizer(f2, z);
        }
        invalidate();
    }

    public void setAnimateOnTouchUp(boolean z) {
        this.write = z;
    }

    public final void read(RemoteActionCompatParcelizer remoteActionCompatParcelizer) {
        this.MediaDescriptionCompat.add(remoteActionCompatParcelizer);
    }

    public void setOnActionUpListener(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        this.RatingCompat = audioAttributesCompatParcelizer;
    }

    private float IconCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        AudioAttributesCompatParcelizer(canvas);
    }

    private void AudioAttributesCompatParcelizer(Canvas canvas) {
        int height = getHeight() / 2;
        int width = getWidth() / 2;
        float f = width;
        float fWrite = write(this.AudioAttributesImplApi21Parcelizer);
        float fCos = (float) Math.cos(this.MediaBrowserCompatCustomActionResultReceiver);
        float f2 = height;
        float fSin = (float) Math.sin(this.MediaBrowserCompatCustomActionResultReceiver);
        this.onCustomAction.setStrokeWidth(BitmapDescriptorFactory.HUE_RED);
        canvas.drawCircle((fCos * fWrite) + f, (fWrite * fSin) + f2, this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, this.onCustomAction);
        double dSin = Math.sin(this.MediaBrowserCompatCustomActionResultReceiver);
        double dCos = Math.cos(this.MediaBrowserCompatCustomActionResultReceiver);
        this.onCustomAction.setStrokeWidth(this.onPlay);
        canvas.drawLine(f, f2, width + ((int) (dCos * d)), height + ((int) (d * dSin)), this.onCustomAction);
        canvas.drawCircle(f, f2, this.read, this.onCustomAction);
    }

    public final RectF RemoteActionCompatParcelizer() {
        return this.onAddQueueItem;
    }

    public final int AudioAttributesCompatParcelizer() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    public void setCircleRadius(int i) {
        this.AudioAttributesImplBaseParcelizer = i;
        invalidate();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean z;
        boolean z2;
        boolean z3;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer;
        int actionMasked = motionEvent.getActionMasked();
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        if (actionMasked == 0) {
            this.AudioAttributesImplApi26Parcelizer = x;
            this.MediaBrowserCompatItemReceiver = y;
            this.MediaBrowserCompatSearchResultReceiver = true;
            this.AudioAttributesCompatParcelizer = false;
            z = false;
            z2 = false;
            z3 = true;
        } else if (actionMasked == 1 || actionMasked == 2) {
            int i = (int) (x - this.AudioAttributesImplApi26Parcelizer);
            int i2 = (int) (y - this.MediaBrowserCompatItemReceiver);
            this.MediaBrowserCompatSearchResultReceiver = (i * i) + (i2 * i2) > this.handleMediaPlayPauseIfPendingOnHandler;
            boolean z4 = this.AudioAttributesCompatParcelizer;
            z = actionMasked == 1;
            if (this.MediaMetadataCompat) {
                AudioAttributesCompatParcelizer(x, y);
            }
            z3 = false;
            z2 = z4;
        } else {
            z = false;
            z2 = false;
            z3 = false;
        }
        boolean zRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(x, y, z2, z3, z) | this.AudioAttributesCompatParcelizer;
        this.AudioAttributesCompatParcelizer = zRemoteActionCompatParcelizer;
        if (zRemoteActionCompatParcelizer && z && (audioAttributesCompatParcelizer = this.RatingCompat) != null) {
            audioAttributesCompatParcelizer.write(IconCompatParcelizer(x, y), this.MediaBrowserCompatSearchResultReceiver);
        }
        return true;
    }

    private void AudioAttributesCompatParcelizer(float f, float f2) {
        this.AudioAttributesImplApi21Parcelizer = readVorbisCommentMetadataBlock.AudioAttributesCompatParcelizer((float) (getWidth() / 2), (float) (getHeight() / 2), f, f2) > ((float) write(2)) + checkAndPeekStreamMarker.AudioAttributesCompatParcelizer(getContext(), 12) ? 1 : 2;
    }

    private boolean RemoteActionCompatParcelizer(float f, float f2, boolean z, boolean z2, boolean z3) {
        float fIconCompatParcelizer = IconCompatParcelizer(f, f2);
        boolean z4 = false;
        boolean z5 = IconCompatParcelizer() != fIconCompatParcelizer;
        if (z2 && z5) {
            return true;
        }
        if (!z5 && !z) {
            return false;
        }
        if (z3 && this.write) {
            z4 = true;
        }
        setHandRotation(fIconCompatParcelizer, z4);
        return true;
    }

    private int IconCompatParcelizer(float f, float f2) {
        int degrees = (int) Math.toDegrees(Math.atan2(f2 - (getHeight() / 2), f - (getWidth() / 2)));
        int i = degrees + 90;
        return i < 0 ? degrees + 450 : i;
    }

    final int read() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    final void IconCompatParcelizer(int i) {
        this.AudioAttributesImplApi21Parcelizer = i;
        invalidate();
    }

    final void read(boolean z) {
        if (this.MediaMetadataCompat && !z) {
            this.AudioAttributesImplApi21Parcelizer = 1;
        }
        this.MediaMetadataCompat = z;
        invalidate();
    }

    private int write(int i) {
        int i2 = this.AudioAttributesImplBaseParcelizer;
        return i == 2 ? Math.round(i2 * 0.66f) : i2;
    }
}
