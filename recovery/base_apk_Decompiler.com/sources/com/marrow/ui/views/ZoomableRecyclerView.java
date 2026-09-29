package com.marrow.ui.views;

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
import com.marrow.ui.views.ZoomableRecyclerView;
import kotlin.Metadata;
import kotlin.buildResolutionString;
import kotlin.shortFromChars;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u0000 '2\u00020\u0001:\u0003'\u0014\u0017B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0004\u0010\bB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0004\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\t¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0017\u0010\u0015J\u0017\u0010\u001c\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001c\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u001dH\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u001f\u0010 \u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0016H\u0002¢\u0006\u0004\b \u0010\u0018J\u000f\u0010!\u001a\u00020\fH\u0002¢\u0006\u0004\b!\u0010\u000eJ\u001f\u0010#\u001a\u00020\"2\u0006\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010$J\u001f\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0014\u0010\u0018J\u000f\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\b%\u0010\u000eJ\u000f\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b&\u0010\u000eJ\u001f\u0010'\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00162\u0006\u0010\u0007\u001a\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010\u0018J!\u0010#\u001a\u00020\f2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b#\u0010(R\u0016\u0010#\u001a\u00020)8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b*\u0010+R\u0016\u0010 \u001a\u00020,8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b-\u0010.R\u0016\u0010\u0017\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u0014\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00100R\u0016\u0010'\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00100R\u0016\u00104\u001a\u00020\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00100R$\u00108\u001a\u00020\u00162\u0006\u0010\u0003\u001a\u00020\u00168\u0007@BX\u0086\u000e¢\u0006\f\n\u0004\b5\u00100\u001a\u0004\b6\u00107R\u0016\u0010;\u001a\u00020\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b9\u0010:R\u0016\u0010=\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u00100R\u0016\u0010?\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b>\u00100R\u0016\u0010\u000f\u001a\u00020\u00198\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u0018\u0010E\u001a\u0004\u0018\u00010B8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010G\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u00100R\u0016\u0010I\u001a\u00020\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bH\u00100"}, d2 = {"Lcom/marrow/ui/views/ZoomableRecyclerView;", "Landroidx/recyclerview/widget/RecyclerView;", "Landroid/content/Context;", "p0", "<init>", "(Landroid/content/Context;)V", "Landroid/util/AttributeSet;", "p1", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "p2", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "onPlayFromMediaId", "()V", "RatingCompat", "(I)I", "onMeasure", "(II)V", "Landroid/view/MotionEvent;", "IconCompatParcelizer", "(Landroid/view/MotionEvent;)V", "", "AudioAttributesCompatParcelizer", "(FF)V", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "Landroid/graphics/Canvas;", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "read", "onMediaButtonEvent", "", "write", "(FF)[F", "onFastForward", "onCommand", "RemoteActionCompatParcelizer", "(Ljava/lang/Float;Ljava/lang/Float;)V", "Landroid/view/ScaleGestureDetector;", "ParcelableVolumeInfo", "Landroid/view/ScaleGestureDetector;", "Lo/shortFromChars;", "onStop", "Lo/shortFromChars;", "r8lambdaKUbBm7ckfqTc9QCgukC86fguu4", "F", "ResultReceiver", "PlaybackStateCompatCustomAction", "r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw", "MediaBrowserCompatCustomActionResultReceiver", "MediaSessionCompatQueueItem", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "()F", "MediaBrowserCompatItemReceiver", "onSkipToPrevious", "I", "AudioAttributesImplApi26Parcelizer", "setSessionImpl", "AudioAttributesImplApi21Parcelizer", "onSkipToQueueItem", "AudioAttributesImplBaseParcelizer", "onSkipToNext", "Z", "Landroid/animation/ValueAnimator;", "MediaSessionCompatToken", "Landroid/animation/ValueAnimator;", "MediaBrowserCompatSearchResultReceiver", "MediaSessionCompatResultReceiverWrapper", "MediaDescriptionCompat", "PlaybackStateCompat", "MediaMetadataCompat"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ZoomableRecyclerView extends RecyclerView {

    /* JADX INFO: renamed from: MediaSessionCompatQueueItem, reason: from kotlin metadata */
    private float MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaSessionCompatResultReceiverWrapper, reason: from kotlin metadata */
    private float MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaSessionCompatToken, reason: from kotlin metadata */
    private ValueAnimator MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: ParcelableVolumeInfo, reason: from kotlin metadata */
    private ScaleGestureDetector write;

    /* JADX INFO: renamed from: PlaybackStateCompat, reason: from kotlin metadata */
    private float MediaMetadataCompat;

    /* JADX INFO: renamed from: PlaybackStateCompatCustomAction, reason: from kotlin metadata */
    private float RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: ResultReceiver, reason: from kotlin metadata */
    private float IconCompatParcelizer;

    /* JADX INFO: renamed from: onSkipToNext, reason: from kotlin metadata */
    private boolean RatingCompat;

    /* JADX INFO: renamed from: onSkipToPrevious, reason: from kotlin metadata */
    private int AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: onSkipToQueueItem, reason: from kotlin metadata */
    private float AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onStop, reason: from kotlin metadata */
    private shortFromChars read;

    /* JADX INFO: renamed from: r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, reason: from kotlin metadata */
    private float MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: r8lambdaKUbBm7ckfqTc9QCgukC86fguu4, reason: from kotlin metadata */
    private float AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: setSessionImpl, reason: from kotlin metadata */
    private float AudioAttributesImplApi21Parcelizer;

    public static final /* synthetic */ void onCustomAction() {
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final float getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomableRecyclerView(Context context) {
        super(context);
        toMagicModuleMetaRepoModel.write(context, "");
        this.AudioAttributesImplApi26Parcelizer = -1;
        onPlayFromMediaId();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomableRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        toMagicModuleMetaRepoModel.write(context, "");
        this.AudioAttributesImplApi26Parcelizer = -1;
        onPlayFromMediaId();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomableRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        toMagicModuleMetaRepoModel.write(context, "");
        this.AudioAttributesImplApi26Parcelizer = -1;
        onPlayFromMediaId();
    }

    private final void onPlayFromMediaId() {
        this.write = new ScaleGestureDetector(getContext(), new IconCompatParcelizer());
        this.read = new shortFromChars(getContext(), new AudioAttributesCompatParcelizer());
        this.MediaBrowserCompatItemReceiver = 1.0f;
    }

    public final int RatingCompat(int p0) {
        return (int) (p0 / this.MediaBrowserCompatItemReceiver);
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final void onMeasure(int p0, int p1) {
        this.AudioAttributesCompatParcelizer = View.MeasureSpec.getSize(p0);
        this.IconCompatParcelizer = View.MeasureSpec.getSize(p1);
        super.onMeasure(p0, p1);
    }

    private final void IconCompatParcelizer(MotionEvent p0) {
        try {
            int iFindPointerIndex = p0.findPointerIndex(this.AudioAttributesImplApi26Parcelizer);
            AudioAttributesCompatParcelizer(p0.getX(iFindPointerIndex), p0.getY(iFindPointerIndex));
        } catch (Exception unused) {
            float x = p0.getX();
            float y = p0.getY();
            if (!this.RatingCompat && this.MediaBrowserCompatItemReceiver > 1.0f) {
                float f = this.AudioAttributesImplApi21Parcelizer;
                if (f != -1.0f) {
                    read(this.RemoteActionCompatParcelizer + (x - f), this.MediaBrowserCompatCustomActionResultReceiver + (y - this.AudioAttributesImplBaseParcelizer));
                    onMediaButtonEvent();
                }
            }
            invalidate();
            this.AudioAttributesImplApi21Parcelizer = x;
            this.AudioAttributesImplBaseParcelizer = y;
        }
    }

    private final void AudioAttributesCompatParcelizer(float p0, float p1) {
        StringBuilder sb = new StringBuilder("151 ");
        sb.append(p0);
        sb.append(", ");
        sb.append(p1);
        buildResolutionString.IconCompatParcelizer("ZoomableRecyclerView", sb.toString());
        if (!this.RatingCompat && this.MediaBrowserCompatItemReceiver > 1.0f) {
            float f = this.AudioAttributesImplApi21Parcelizer;
            if (f != -1.0f) {
                read(this.RemoteActionCompatParcelizer + (p0 - f), this.MediaBrowserCompatCustomActionResultReceiver + (p1 - this.AudioAttributesImplBaseParcelizer));
                onMediaButtonEvent();
            }
        }
        invalidate();
        this.AudioAttributesImplApi21Parcelizer = p0;
        this.AudioAttributesImplBaseParcelizer = p1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        shortFromChars shortfromchars = this.read;
        if (shortfromchars == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            shortfromchars = null;
        }
        shortfromchars.write(p0);
        AudioAttributesCompatParcelizer(p0);
        return super.onInterceptTouchEvent(p0);
    }

    private final void AudioAttributesCompatParcelizer(MotionEvent p0) {
        int actionMasked = p0.getActionMasked();
        if (actionMasked == 0) {
            int actionIndex = p0.getActionIndex();
            float x = p0.getX(actionIndex);
            float y = p0.getY(actionIndex);
            this.AudioAttributesImplApi21Parcelizer = x;
            this.AudioAttributesImplBaseParcelizer = y;
            this.AudioAttributesImplApi26Parcelizer = p0.getPointerId(0);
            return;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                IconCompatParcelizer(p0);
                return;
            }
            if (actionMasked != 3) {
                if (actionMasked != 6) {
                    return;
                }
                int actionIndex2 = p0.getActionIndex();
                if (p0.getPointerId(actionIndex2) == this.AudioAttributesImplApi26Parcelizer) {
                    int i = actionIndex2 == 0 ? 1 : 0;
                    this.AudioAttributesImplApi21Parcelizer = p0.getX(i);
                    this.AudioAttributesImplBaseParcelizer = p0.getY(i);
                    this.AudioAttributesImplApi26Parcelizer = p0.getPointerId(i);
                }
                onMediaButtonEvent();
                return;
            }
        }
        this.AudioAttributesImplApi26Parcelizer = -1;
        this.AudioAttributesImplApi21Parcelizer = -1.0f;
        this.AudioAttributesImplBaseParcelizer = -1.0f;
        onMediaButtonEvent();
    }

    @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
    public final boolean onTouchEvent(MotionEvent p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        ScaleGestureDetector scaleGestureDetector = this.write;
        if (scaleGestureDetector == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            scaleGestureDetector = null;
        }
        boolean zOnTouchEvent = scaleGestureDetector.onTouchEvent(p0);
        AudioAttributesCompatParcelizer(p0);
        return super.onTouchEvent(p0) || zOnTouchEvent;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        p0.save();
        p0.translate(this.RemoteActionCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver);
        float f = this.MediaBrowserCompatItemReceiver;
        p0.scale(f, f);
        super.dispatchDraw(p0);
        p0.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(float p0, float p1) {
        if (Float.isNaN(p0)) {
            p0 = this.RemoteActionCompatParcelizer;
        }
        this.RemoteActionCompatParcelizer = p0;
        if (Float.isNaN(p1)) {
            p1 = this.MediaBrowserCompatCustomActionResultReceiver;
        }
        this.MediaBrowserCompatCustomActionResultReceiver = p1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onMediaButtonEvent() {
        float[] fArrWrite = write(this.RemoteActionCompatParcelizer, this.MediaBrowserCompatCustomActionResultReceiver);
        this.RemoteActionCompatParcelizer = Float.isNaN(fArrWrite[0]) ? this.RemoteActionCompatParcelizer : fArrWrite[0];
        this.MediaBrowserCompatCustomActionResultReceiver = Float.isNaN(fArrWrite[1]) ? this.MediaBrowserCompatCustomActionResultReceiver : fArrWrite[1];
    }

    private final float[] write(float p0, float p1) {
        float f = this.MediaBrowserCompatItemReceiver;
        if (f <= 1.0f) {
            return new float[]{p0, p1};
        }
        float f2 = this.AudioAttributesCompatParcelizer;
        float f3 = f2 * f;
        float f4 = this.IconCompatParcelizer;
        float f5 = f * f4;
        if (p0 > BitmapDescriptorFactory.HUE_RED) {
            p0 = 0.0f;
        } else {
            float f6 = f2 - f3;
            if (p0 < f6) {
                p0 = f6;
            }
        }
        if (p1 > BitmapDescriptorFactory.HUE_RED) {
            p1 = 0.0f;
        } else {
            float f7 = f4 - f5;
            if (p1 < f7) {
                p1 = f7;
            }
        }
        return new float[]{p0, p1};
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(float p0, float p1) {
        if (this.MediaBrowserCompatSearchResultReceiver == null) {
            onFastForward();
        }
        ValueAnimator valueAnimator = this.MediaBrowserCompatSearchResultReceiver;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            float f = this.RemoteActionCompatParcelizer;
            float f2 = this.MediaBrowserCompatCustomActionResultReceiver;
            float f3 = p1 - p0;
            float[] fArrWrite = write(f - (this.MediaDescriptionCompat * f3), f2 - (f3 * this.MediaMetadataCompat));
            float f4 = fArrWrite[0];
            float f5 = fArrWrite[1];
            PropertyValuesHolder propertyValuesHolderOfFloat = PropertyValuesHolder.ofFloat("scale", p0, p1);
            PropertyValuesHolder propertyValuesHolderOfFloat2 = PropertyValuesHolder.ofFloat("tranX", f, f4);
            PropertyValuesHolder propertyValuesHolderOfFloat3 = PropertyValuesHolder.ofFloat("tranY", f2, f5);
            ValueAnimator valueAnimator2 = this.MediaBrowserCompatSearchResultReceiver;
            if (valueAnimator2 != null) {
                valueAnimator2.setValues(propertyValuesHolderOfFloat, propertyValuesHolderOfFloat2, propertyValuesHolderOfFloat3);
            }
            ValueAnimator valueAnimator3 = this.MediaBrowserCompatSearchResultReceiver;
            if (valueAnimator3 != null) {
                valueAnimator3.setDuration(300L);
            }
            ValueAnimator valueAnimator4 = this.MediaBrowserCompatSearchResultReceiver;
            if (valueAnimator4 != null) {
                valueAnimator4.start();
            }
        }
    }

    private final void onFastForward() {
        ValueAnimator valueAnimator = new ValueAnimator();
        this.MediaBrowserCompatSearchResultReceiver = valueAnimator;
        valueAnimator.setInterpolator(new DecelerateInterpolator());
        ValueAnimator valueAnimator2 = this.MediaBrowserCompatSearchResultReceiver;
        if (valueAnimator2 != null) {
            valueAnimator2.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: o.drawableStateChanged
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator3) {
                    ZoomableRecyclerView.write(this.write, valueAnimator3);
                }
            });
        }
        ValueAnimator valueAnimator3 = this.MediaBrowserCompatSearchResultReceiver;
        if (valueAnimator3 != null) {
            valueAnimator3.addListener(new read());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void write(ZoomableRecyclerView zoomableRecyclerView, ValueAnimator valueAnimator) {
        toMagicModuleMetaRepoModel.write(valueAnimator, "");
        Object animatedValue = valueAnimator.getAnimatedValue("scale");
        toMagicModuleMetaRepoModel.read(animatedValue, "");
        zoomableRecyclerView.MediaBrowserCompatItemReceiver = ((Float) animatedValue).floatValue();
        Object animatedValue2 = valueAnimator.getAnimatedValue("tranX");
        toMagicModuleMetaRepoModel.read(animatedValue2, "");
        float fFloatValue = ((Float) animatedValue2).floatValue();
        Object animatedValue3 = valueAnimator.getAnimatedValue("tranY");
        toMagicModuleMetaRepoModel.read(animatedValue3, "");
        zoomableRecyclerView.read(fFloatValue, ((Float) animatedValue3).floatValue());
        buildResolutionString.IconCompatParcelizer("ZoomableRecyclerView", "zoom animation");
        zoomableRecyclerView.invalidate();
    }

    public static final class read extends AnimatorListenerAdapter {
        read() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            toMagicModuleMetaRepoModel.write(animator, "");
            ZoomableRecyclerView.this.RatingCompat = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            toMagicModuleMetaRepoModel.write(animator, "");
            ZoomableRecyclerView.this.RatingCompat = false;
            ZoomableRecyclerView.this.onCommand();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
            toMagicModuleMetaRepoModel.write(animator, "");
            ZoomableRecyclerView.this.RatingCompat = false;
            ZoomableRecyclerView.this.onCommand();
        }
    }

    /* JADX INFO: loaded from: classes5.dex */
    final class IconCompatParcelizer extends ScaleGestureDetector.SimpleOnScaleGestureListener {
        public IconCompatParcelizer() {
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
            toMagicModuleMetaRepoModel.write(scaleGestureDetector, "");
            float mediaBrowserCompatItemReceiver = ZoomableRecyclerView.this.getMediaBrowserCompatItemReceiver();
            ZoomableRecyclerView zoomableRecyclerView = ZoomableRecyclerView.this;
            zoomableRecyclerView.MediaBrowserCompatItemReceiver = zoomableRecyclerView.getMediaBrowserCompatItemReceiver() * scaleGestureDetector.getScaleFactor();
            ZoomableRecyclerView zoomableRecyclerView2 = ZoomableRecyclerView.this;
            zoomableRecyclerView2.MediaBrowserCompatItemReceiver = Math.max(0.9f, Math.min(zoomableRecyclerView2.getMediaBrowserCompatItemReceiver(), 3.0f));
            ZoomableRecyclerView.onCustomAction();
            ZoomableRecyclerView.this.MediaDescriptionCompat = scaleGestureDetector.getFocusX();
            ZoomableRecyclerView.this.MediaMetadataCompat = scaleGestureDetector.getFocusY();
            float f = ZoomableRecyclerView.this.MediaDescriptionCompat;
            float mediaBrowserCompatItemReceiver2 = ZoomableRecyclerView.this.getMediaBrowserCompatItemReceiver();
            float f2 = ZoomableRecyclerView.this.MediaMetadataCompat;
            float mediaBrowserCompatItemReceiver3 = ZoomableRecyclerView.this.getMediaBrowserCompatItemReceiver();
            ZoomableRecyclerView zoomableRecyclerView3 = ZoomableRecyclerView.this;
            zoomableRecyclerView3.read(zoomableRecyclerView3.RemoteActionCompatParcelizer + (f * (mediaBrowserCompatItemReceiver - mediaBrowserCompatItemReceiver2)), ZoomableRecyclerView.this.MediaBrowserCompatCustomActionResultReceiver + (f2 * (mediaBrowserCompatItemReceiver - mediaBrowserCompatItemReceiver3)));
            float f3 = ZoomableRecyclerView.this.RemoteActionCompatParcelizer;
            float f4 = ZoomableRecyclerView.this.MediaBrowserCompatCustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("new X - ");
            sb.append(f3);
            sb.append(", new Y - ");
            sb.append(f4);
            buildResolutionString.IconCompatParcelizer("ZoomableRecyclerView", sb.toString());
            ZoomableRecyclerView.this.onMediaButtonEvent();
            ZoomableRecyclerView.this.invalidate();
            ZoomableRecyclerView.this.requestLayout();
            return true;
        }

        @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
        public final void onScaleEnd(ScaleGestureDetector scaleGestureDetector) {
            toMagicModuleMetaRepoModel.write(scaleGestureDetector, "");
            if (ZoomableRecyclerView.this.getMediaBrowserCompatItemReceiver() <= 1.0f) {
                ZoomableRecyclerView zoomableRecyclerView = ZoomableRecyclerView.this;
                zoomableRecyclerView.MediaDescriptionCompat = (-zoomableRecyclerView.RemoteActionCompatParcelizer) / (ZoomableRecyclerView.this.getMediaBrowserCompatItemReceiver() - 1.0f);
                ZoomableRecyclerView zoomableRecyclerView2 = ZoomableRecyclerView.this;
                zoomableRecyclerView2.MediaMetadataCompat = (-zoomableRecyclerView2.MediaBrowserCompatCustomActionResultReceiver) / (ZoomableRecyclerView.this.getMediaBrowserCompatItemReceiver() - 1.0f);
                ZoomableRecyclerView zoomableRecyclerView3 = ZoomableRecyclerView.this;
                zoomableRecyclerView3.MediaDescriptionCompat = Float.isNaN(zoomableRecyclerView3.MediaDescriptionCompat) ? scaleGestureDetector.getFocusX() : ZoomableRecyclerView.this.MediaDescriptionCompat;
                ZoomableRecyclerView zoomableRecyclerView4 = ZoomableRecyclerView.this;
                zoomableRecyclerView4.MediaMetadataCompat = Float.isNaN(zoomableRecyclerView4.MediaMetadataCompat) ? scaleGestureDetector.getFocusY() : ZoomableRecyclerView.this.MediaMetadataCompat;
                ZoomableRecyclerView zoomableRecyclerView5 = ZoomableRecyclerView.this;
                zoomableRecyclerView5.IconCompatParcelizer(zoomableRecyclerView5.getMediaBrowserCompatItemReceiver(), 1.0f);
                boolean zIsNaN = Float.isNaN(ZoomableRecyclerView.this.MediaDescriptionCompat);
                boolean zIsNaN2 = Float.isNaN(ZoomableRecyclerView.this.MediaMetadataCompat);
                float mediaBrowserCompatItemReceiver = ZoomableRecyclerView.this.getMediaBrowserCompatItemReceiver();
                StringBuilder sb = new StringBuilder("nan - ");
                sb.append(zIsNaN);
                sb.append(", ");
                sb.append(zIsNaN2);
                sb.append(", sf - ");
                sb.append(mediaBrowserCompatItemReceiver);
                buildResolutionString.IconCompatParcelizer("ZoomableRecyclerView", sb.toString());
            }
            ZoomableRecyclerView.this.RatingCompat = false;
            ZoomableRecyclerView.this.onCommand();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCommand() {
        setOverScrollMode(this.MediaBrowserCompatItemReceiver > 1.0f ? 2 : 1);
    }

    /* JADX INFO: loaded from: classes5.dex */
    final class AudioAttributesCompatParcelizer extends GestureDetector.SimpleOnGestureListener {
        public AudioAttributesCompatParcelizer() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTap(MotionEvent motionEvent) {
            toMagicModuleMetaRepoModel.write(motionEvent, "");
            if (ZoomableRecyclerView.this.getMediaBrowserCompatItemReceiver() == 1.0f) {
                ZoomableRecyclerView.this.RemoteActionCompatParcelizer(motionEvent.getX(), motionEvent.getY());
            } else {
                ZoomableRecyclerView.this.write(Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY()));
            }
            return super.onDoubleTap(motionEvent);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(float p0, float p1) {
        this.MediaDescriptionCompat = p0;
        this.MediaMetadataCompat = p1;
        IconCompatParcelizer(this.MediaBrowserCompatItemReceiver, 2.0f);
    }

    public final void write(Float p0, Float p1) {
        float f = this.MediaBrowserCompatItemReceiver;
        if (f == 1.0f) {
            return;
        }
        this.MediaDescriptionCompat = (f != 0.9f || p0 == null) ? (-this.RemoteActionCompatParcelizer) / (f - 1.0f) : p0.floatValue();
        float f2 = this.MediaBrowserCompatItemReceiver;
        this.MediaMetadataCompat = (f2 != 0.9f || p1 == null) ? (-this.MediaBrowserCompatCustomActionResultReceiver) / (f2 - 1.0f) : p1.floatValue();
        IconCompatParcelizer(this.MediaBrowserCompatItemReceiver, 1.0f);
    }
}
