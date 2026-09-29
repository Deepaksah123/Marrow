package com.marrow2.ui.video.notes.custom_view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.marrow2.ui.video.notes.custom_view.ZoomableRecyclerViewV2;
import in.juspay.hyper.constants.LogCategory;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.buildResolutionString;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u000f\b\u0007\u0018\u0000 F2\u00020\u0001:\u0003FGHB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\u000bJ\b\u0010$\u001a\u00020%H\u0002J\u000e\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\nJ\u0018\u0010(\u001a\u00020%2\u0006\u0010)\u001a\u00020\n2\u0006\u0010*\u001a\u00020\nH\u0014J\u0010\u0010+\u001a\u00020%2\u0006\u0010,\u001a\u00020-H\u0002J\u0018\u0010.\u001a\u00020%2\u0006\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011H\u0002J\u0010\u00101\u001a\u00020%2\u0006\u0010,\u001a\u00020-H\u0002J\u0010\u00102\u001a\u00020\u001d2\u0006\u0010,\u001a\u00020-H\u0016J\u0010\u00103\u001a\u00020%2\u0006\u00104\u001a\u000205H\u0014J\u0018\u00106\u001a\u00020%2\u0006\u00107\u001a\u00020\u00112\u0006\u00108\u001a\u00020\u0011H\u0002J\b\u00109\u001a\u00020%H\u0002J\u0018\u00109\u001a\u00020:2\u0006\u0010/\u001a\u00020\u00112\u0006\u00100\u001a\u00020\u0011H\u0002J\b\u0010;\u001a\u00020%H\u0002J\u0018\u0010<\u001a\u00020%2\u0006\u0010=\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u0011H\u0002J\b\u0010?\u001a\u00020%H\u0002J\b\u0010@\u001a\u00020%H\u0002J\u0018\u0010A\u001a\u00020%2\u0006\u0010B\u001a\u00020\u00112\u0006\u0010C\u001a\u00020\u0011H\u0002J#\u0010D\u001a\u00020%2\n\b\u0002\u0010B\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010C\u001a\u0004\u0018\u00010\u0011¢\u0006\u0002\u0010ER\u000e\u0010\f\u001a\u00020\rX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u0011@BX\u0086\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u000e\u0010\u0019\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006I"}, d2 = {"Lcom/marrow2/ui/video/notes/custom_view/ZoomableRecyclerViewV2;", "Landroidx/recyclerview/widget/RecyclerView;", LogCategory.CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "scaleDetector", "Landroid/view/ScaleGestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "viewWidth", "", "viewHeight", "translateX", "translateY", AppMeasurementSdk.ConditionalUserProperty.VALUE, "scaleFactor", "getScaleFactor", "()F", "activePointerId", "lastTouchX", "lastTouchY", "isScaling", "", "scaleAnimator", "Landroid/animation/ValueAnimator;", "scaleCenterX", "scaleCenterY", "maxTranslateX", "maxTranslateY", "init", "", "calculateScrollOffset", "dy", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "performMoveAction", "ev", "Landroid/view/MotionEvent;", "onMoveTranslateToPosition", "x", "y", "consumeTouch", "onTouchEvent", "dispatchDraw", "canvas", "Landroid/graphics/Canvas;", "setTranslateXY", "tranX", "tranY", "correctTranslateXY", "", "updateMaxTranslation", "zoom", "startVal", "endVal", "newZoomAnimation", "adjustScrollEffect", "zoomIn", "pointerIndexX", "pointerIndexY", "zoomOut", "(Ljava/lang/Float;Ljava/lang/Float;)V", "Companion", "ScaleListener", "GestureListener", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ZoomableRecyclerViewV2 extends RecyclerView {
    public static final IconCompatParcelizer RemoteActionCompatParcelizer = new IconCompatParcelizer(null);
    private ScaleGestureDetector MediaSessionCompatQueueItem;
    private ValueAnimator MediaSessionCompatResultReceiverWrapper;
    private float MediaSessionCompatToken;
    private float ParcelableVolumeInfo;
    private float PlaybackStateCompat;
    private float PlaybackStateCompatCustomAction;
    private float ResultReceiver;
    private float onSkipToNext;
    private int onSkipToPrevious;
    private boolean onSkipToQueueItem;
    private float onStop;
    private float r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    private float r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private GestureDetector setSessionImpl;

    public static final /* synthetic */ void onCommand() {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow2/ui/video/notes/custom_view/ZoomableRecyclerViewV2$IconCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final float getPlaybackStateCompat() {
        return this.PlaybackStateCompat;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomableRecyclerViewV2(Context context) {
        super(context);
        toMagicModuleMetaRepoModel.write(context, "");
        this.onSkipToPrevious = -1;
        onPause();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomableRecyclerViewV2(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        toMagicModuleMetaRepoModel.write(context, "");
        this.onSkipToPrevious = -1;
        onPause();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomableRecyclerViewV2(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        toMagicModuleMetaRepoModel.write(context, "");
        this.onSkipToPrevious = -1;
        onPause();
    }

    private final void onPause() {
        this.MediaSessionCompatQueueItem = new ScaleGestureDetector(getContext(), new AudioAttributesCompatParcelizer());
        this.setSessionImpl = new GestureDetector(getContext(), new write());
        this.PlaybackStateCompat = 1.0f;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        this.PlaybackStateCompatCustomAction = View.MeasureSpec.getSize(widthMeasureSpec);
        this.ResultReceiver = View.MeasureSpec.getSize(heightMeasureSpec);
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
    }

    private final void RemoteActionCompatParcelizer(MotionEvent motionEvent) {
        try {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.onSkipToPrevious);
            RemoteActionCompatParcelizer(motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex));
        } catch (Exception unused) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            if (!this.onSkipToQueueItem && this.PlaybackStateCompat > 1.0f) {
                float f = this.onSkipToNext;
                if (f != -1.0f) {
                    IconCompatParcelizer(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + (x - f), this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 + (y - this.onStop));
                    onFastForward();
                }
            }
            invalidate();
            this.onSkipToNext = x;
            this.onStop = y;
        }
    }

    private final void RemoteActionCompatParcelizer(float f, float f2) {
        StringBuilder sb = new StringBuilder("151 ");
        sb.append(f);
        sb.append(", ");
        sb.append(f2);
        buildResolutionString.IconCompatParcelizer("ZoomableRecyclerView", sb.toString());
        if (!this.onSkipToQueueItem && this.PlaybackStateCompat > 1.0f) {
            float f3 = this.onSkipToNext;
            if (f3 != -1.0f) {
                IconCompatParcelizer(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + (f - f3), this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 + (f2 - this.onStop));
                onFastForward();
            }
        }
        invalidate();
        this.onSkipToNext = f;
        this.onStop = f2;
    }

    private final void IconCompatParcelizer(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            int actionIndex = motionEvent.getActionIndex();
            float x = motionEvent.getX(actionIndex);
            float y = motionEvent.getY(actionIndex);
            this.onSkipToNext = x;
            this.onStop = y;
            this.onSkipToPrevious = motionEvent.getPointerId(0);
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                RemoteActionCompatParcelizer(motionEvent);
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex2 = motionEvent.getActionIndex();
                if (motionEvent.getPointerId(actionIndex2) == this.onSkipToPrevious) {
                    int i = actionIndex2 == 0 ? 1 : 0;
                    this.onSkipToNext = motionEvent.getX(i);
                    this.onStop = motionEvent.getY(i);
                    this.onSkipToPrevious = motionEvent.getPointerId(i);
                }
                onFastForward();
                return;
            }
        }
        this.onSkipToPrevious = -1;
        this.onSkipToNext = -1.0f;
        this.onStop = -1.0f;
        onFastForward();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent ev) {
        toMagicModuleMetaRepoModel.write(ev, "");
        ScaleGestureDetector scaleGestureDetector = this.MediaSessionCompatQueueItem;
        GestureDetector gestureDetector = null;
        if (scaleGestureDetector == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            scaleGestureDetector = null;
        }
        boolean zOnTouchEvent = scaleGestureDetector.onTouchEvent(ev);
        GestureDetector gestureDetector2 = this.setSessionImpl;
        if (gestureDetector2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            gestureDetector = gestureDetector2;
        }
        boolean zOnTouchEvent2 = gestureDetector.onTouchEvent(ev);
        IconCompatParcelizer(ev);
        return super.onTouchEvent(ev) || zOnTouchEvent || zOnTouchEvent2;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas canvas) {
        toMagicModuleMetaRepoModel.write(canvas, "");
        canvas.save();
        canvas.translate(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4);
        float f = this.PlaybackStateCompat;
        canvas.scale(f, f);
        super.dispatchDraw(canvas);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(float f, float f2) {
        if (Float.isNaN(f)) {
            f = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        }
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = f;
        if (Float.isNaN(f2)) {
            f2 = this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
        }
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = f2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFastForward() {
        float[] fArr = read(this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4);
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = Float.isNaN(fArr[0]) ? this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM : fArr[0];
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = Float.isNaN(fArr[1]) ? this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 : fArr[1];
    }

    private final float[] read(float f, float f2) {
        float f3 = this.PlaybackStateCompat;
        if (f3 <= 1.0f) {
            return new float[]{f, f2};
        }
        float f4 = this.PlaybackStateCompatCustomAction;
        float f5 = f4 * f3;
        float f6 = this.ResultReceiver;
        float f7 = f3 * f6;
        if (f > BitmapDescriptorFactory.HUE_RED) {
            f = 0.0f;
        } else {
            float f8 = f4 - f5;
            if (f < f8) {
                f = f8;
            }
        }
        if (f2 > BitmapDescriptorFactory.HUE_RED) {
            f2 = 0.0f;
        } else {
            float f9 = f6 - f7;
            if (f2 < f9) {
                f2 = f9;
            }
        }
        return new float[]{f, f2};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(float f, float f2) {
        if (this.MediaSessionCompatResultReceiverWrapper == null) {
            onPlayFromMediaId();
        }
        ValueAnimator valueAnimator = this.MediaSessionCompatResultReceiverWrapper;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            float f3 = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            float f4 = this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
            float f5 = f2 - f;
            float[] fArr = read(f3 - (this.MediaSessionCompatToken * f5), f4 - (f5 * this.ParcelableVolumeInfo));
            float f6 = fArr[0];
            float f7 = fArr[1];
            PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat("scale", f, f2);
            PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat("tranX", f3, f6);
            PropertyValuesHolder propertyValuesHolderOfFloat3 = PropertyValuesHolder.ofFloat("tranY", f4, f7);
            ValueAnimator valueAnimator2 = this.MediaSessionCompatResultReceiverWrapper;
            if (valueAnimator2 != null) {
                valueAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2, propertyValuesHolderOfFloat3);
            }
            ValueAnimator valueAnimator3 = this.MediaSessionCompatResultReceiverWrapper;
            if (valueAnimator3 != null) {
                valueAnimator3.setDuration(300L);
            }
            ValueAnimator valueAnimator4 = this.MediaSessionCompatResultReceiverWrapper;
            if (valueAnimator4 != null) {
                valueAnimator4.start();
            }
        }
    }

    private final void onPlayFromMediaId() {
        ValueAnimator valueAnimator = new ValueAnimator();
        this.MediaSessionCompatResultReceiverWrapper = valueAnimator;
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        ValueAnimator valueAnimator2 = this.MediaSessionCompatResultReceiverWrapper;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.zzlce
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    ZoomableRecyclerViewV2.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, valueAnimator3);
                }
            });
        }
        ValueAnimator valueAnimator3 = this.MediaSessionCompatResultReceiverWrapper;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new RemoteActionCompatParcelizer());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RemoteActionCompatParcelizer(ZoomableRecyclerViewV2 zoomableRecyclerViewV2, ValueAnimator valueAnimator) {
        toMagicModuleMetaRepoModel.write(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue("scale");
        toMagicModuleMetaRepoModel.read(animatedValue, "");
        zoomableRecyclerViewV2.PlaybackStateCompat = ((Float) animatedValue).floatValue();
        Object animatedValue2 = valueAnimator.getAnimatedValue("tranX");
        toMagicModuleMetaRepoModel.read(animatedValue2, "");
        float fFloatValue = ((Float) animatedValue2).floatValue();
        Object animatedValue3 = valueAnimator.getAnimatedValue("tranY");
        toMagicModuleMetaRepoModel.read(animatedValue3, "");
        zoomableRecyclerViewV2.IconCompatParcelizer(fFloatValue, ((Float) animatedValue3).floatValue());
        buildResolutionString.IconCompatParcelizer("ZoomableRecyclerView", "zoom animation");
        zoomableRecyclerViewV2.invalidate();
    }

    public static final class RemoteActionCompatParcelizer extends AnimatorListenerAdapter {
        RemoteActionCompatParcelizer() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            toMagicModuleMetaRepoModel.write(animator, "");
            ZoomableRecyclerViewV2.this.onSkipToQueueItem = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            toMagicModuleMetaRepoModel.write(animator, "");
            ZoomableRecyclerViewV2.this.onSkipToQueueItem = false;
            ZoomableRecyclerViewV2.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            toMagicModuleMetaRepoModel.write(animator, "");
            ZoomableRecyclerViewV2.this.onSkipToQueueItem = false;
            ZoomableRecyclerViewV2.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    final class AudioAttributesCompatParcelizer extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public AudioAttributesCompatParcelizer() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            toMagicModuleMetaRepoModel.write(scaleGestureDetector, "");
            float playbackStateCompat = ZoomableRecyclerViewV2.this.getPlaybackStateCompat();
            ZoomableRecyclerViewV2 zoomableRecyclerViewV2 = ZoomableRecyclerViewV2.this;
            zoomableRecyclerViewV2.PlaybackStateCompat = zoomableRecyclerViewV2.getPlaybackStateCompat() * scaleGestureDetector.getScaleFactor();
            ZoomableRecyclerViewV2 zoomableRecyclerViewV22 = ZoomableRecyclerViewV2.this;
            zoomableRecyclerViewV22.PlaybackStateCompat = Math.max(0.9f, Math.min(zoomableRecyclerViewV22.getPlaybackStateCompat(), 3.0f));
            ZoomableRecyclerViewV2.onCommand();
            ZoomableRecyclerViewV2.this.MediaSessionCompatToken = scaleGestureDetector.getFocusX();
            ZoomableRecyclerViewV2.this.ParcelableVolumeInfo = scaleGestureDetector.getFocusY();
            float f = ZoomableRecyclerViewV2.this.MediaSessionCompatToken;
            float playbackStateCompat2 = ZoomableRecyclerViewV2.this.getPlaybackStateCompat();
            float f2 = ZoomableRecyclerViewV2.this.ParcelableVolumeInfo;
            float playbackStateCompat3 = ZoomableRecyclerViewV2.this.getPlaybackStateCompat();
            ZoomableRecyclerViewV2 zoomableRecyclerViewV23 = ZoomableRecyclerViewV2.this;
            zoomableRecyclerViewV23.IconCompatParcelizer(zoomableRecyclerViewV23.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM + (f * (playbackStateCompat - playbackStateCompat2)), ZoomableRecyclerViewV2.this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 + (f2 * (playbackStateCompat - playbackStateCompat3)));
            float f3 = ZoomableRecyclerViewV2.this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
            float f4 = ZoomableRecyclerViewV2.this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
            StringBuilder sb = new StringBuilder("new X - ");
            sb.append(f3);
            sb.append(", new Y - ");
            sb.append(f4);
            buildResolutionString.IconCompatParcelizer("ZoomableRecyclerView", sb.toString());
            ZoomableRecyclerViewV2.this.onFastForward();
            ZoomableRecyclerViewV2.this.invalidate();
            ZoomableRecyclerViewV2.this.requestLayout();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            toMagicModuleMetaRepoModel.write(scaleGestureDetector, "");
            if (ZoomableRecyclerViewV2.this.getPlaybackStateCompat() <= 1.0f) {
                ZoomableRecyclerViewV2 zoomableRecyclerViewV2 = ZoomableRecyclerViewV2.this;
                zoomableRecyclerViewV2.MediaSessionCompatToken = (-zoomableRecyclerViewV2.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) / (ZoomableRecyclerViewV2.this.getPlaybackStateCompat() - 1.0f);
                ZoomableRecyclerViewV2 zoomableRecyclerViewV22 = ZoomableRecyclerViewV2.this;
                zoomableRecyclerViewV22.ParcelableVolumeInfo = (-zoomableRecyclerViewV22.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4) / (ZoomableRecyclerViewV2.this.getPlaybackStateCompat() - 1.0f);
                ZoomableRecyclerViewV2 zoomableRecyclerViewV23 = ZoomableRecyclerViewV2.this;
                zoomableRecyclerViewV23.MediaSessionCompatToken = Float.isNaN(zoomableRecyclerViewV23.MediaSessionCompatToken) ? scaleGestureDetector.getFocusX() : ZoomableRecyclerViewV2.this.MediaSessionCompatToken;
                ZoomableRecyclerViewV2 zoomableRecyclerViewV24 = ZoomableRecyclerViewV2.this;
                zoomableRecyclerViewV24.ParcelableVolumeInfo = Float.isNaN(zoomableRecyclerViewV24.ParcelableVolumeInfo) ? scaleGestureDetector.getFocusY() : ZoomableRecyclerViewV2.this.ParcelableVolumeInfo;
                ZoomableRecyclerViewV2 zoomableRecyclerViewV25 = ZoomableRecyclerViewV2.this;
                zoomableRecyclerViewV25.AudioAttributesCompatParcelizer(zoomableRecyclerViewV25.getPlaybackStateCompat(), 1.0f);
                boolean zIsNaN = Float.isNaN(ZoomableRecyclerViewV2.this.MediaSessionCompatToken);
                boolean zIsNaN2 = Float.isNaN(ZoomableRecyclerViewV2.this.ParcelableVolumeInfo);
                float playbackStateCompat = ZoomableRecyclerViewV2.this.getPlaybackStateCompat();
                StringBuilder sb = new StringBuilder("nan - ");
                sb.append(zIsNaN);
                sb.append(", ");
                sb.append(zIsNaN2);
                sb.append(", sf - ");
                sb.append(playbackStateCompat);
                buildResolutionString.IconCompatParcelizer("ZoomableRecyclerView", sb.toString());
            }
            ZoomableRecyclerViewV2.this.onSkipToQueueItem = false;
            ZoomableRecyclerViewV2.this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        setOverScrollMode(this.PlaybackStateCompat > 1.0f ? 2 : 1);
    }

    /* JADX INFO: loaded from: classes5.dex */
    final class write extends GestureDetector.SimpleOnGestureListener {
        public write() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            toMagicModuleMetaRepoModel.write(motionEvent, "");
            if (ZoomableRecyclerViewV2.this.getPlaybackStateCompat() == 1.0f) {
                ZoomableRecyclerViewV2.this.write(motionEvent.getX(), motionEvent.getY());
            } else {
                ZoomableRecyclerViewV2.this.RemoteActionCompatParcelizer(Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()));
            }
            return super.onDoubleTap(motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(float f, float f2) {
        this.MediaSessionCompatToken = f;
        this.ParcelableVolumeInfo = f2;
        AudioAttributesCompatParcelizer(this.PlaybackStateCompat, 2.0f);
    }

    public final void RemoteActionCompatParcelizer(Float f, Float f2) {
        float f3 = this.PlaybackStateCompat;
        if (f3 == 1.0f) {
            return;
        }
        this.MediaSessionCompatToken = (f3 != 0.9f || f == null) ? (-this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM) / (f3 - 1.0f) : f.floatValue();
        float f4 = this.PlaybackStateCompat;
        this.ParcelableVolumeInfo = (f4 != 0.9f || f2 == null) ? (-this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4) / (f4 - 1.0f) : f2.floatValue();
        AudioAttributesCompatParcelizer(this.PlaybackStateCompat, 1.0f);
    }
}
