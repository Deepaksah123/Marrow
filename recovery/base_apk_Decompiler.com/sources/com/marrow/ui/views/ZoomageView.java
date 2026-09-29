package com.marrow.ui.views;

import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ScaleGestureDetector;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import com.google.android.exoplayer2.text.ttml.TtmlNode;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import in.juspay.hyper.constants.LogCategory;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MediaPeriodId;
import kotlin.Metadata;
import kotlin.getScrubberPosition;
import kotlin.putValue;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u009e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 |2\u00020\u00012\u00020\u0002:\u0003z{|B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006B\u001b\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0005\u0010\tB#\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\u0005\u0010\fJ\u001a\u0010=\u001a\u00020>2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0002J\b\u0010?\u001a\u00020>H\u0002J\u0010\u0010@\u001a\u00020>2\b\u0010A\u001a\u0004\u0018\u00010<J\u0006\u0010B\u001a\u00020>J\u0012\u0010C\u001a\u00020>2\b\u0010D\u001a\u0004\u0018\u00010\u000fH\u0016J\u0010\u0010E\u001a\u00020>2\u0006\u0010F\u001a\u00020\u001eH\u0016J\u0010\u0010G\u001a\u00020>2\u0006\u0010H\u001a\u00020\u000bH\u0016J\u0012\u0010I\u001a\u00020>2\b\u0010J\u001a\u0004\u0018\u00010KH\u0016J\u0010\u0010L\u001a\u00020>2\u0006\u0010M\u001a\u00020NH\u0016J\u0012\u0010O\u001a\u00020>2\b\u0010P\u001a\u0004\u0018\u00010QH\u0016J\u0010\u0010R\u001a\u00020>2\u0006\u0010S\u001a\u00020\u0014H\u0002J\b\u0010Y\u001a\u00020\u0014H\u0002J\u0010\u0010Z\u001a\u00020\u001e2\u0006\u0010[\u001a\u00020\\H\u0016J\b\u0010]\u001a\u00020>H\u0002J\b\u0010^\u001a\u00020>H\u0002J\u0012\u0010_\u001a\u00020>2\b\b\u0002\u0010`\u001a\u00020\u001eH\u0007J\b\u0010a\u001a\u00020>H\u0002J\u0018\u0010b\u001a\u00020>2\u0006\u0010c\u001a\u00020\u00112\u0006\u0010d\u001a\u00020\u000bH\u0002J\b\u0010e\u001a\u00020>H\u0002J\b\u0010f\u001a\u00020>H\u0002J\u0018\u0010g\u001a\u00020>2\u0006\u0010h\u001a\u00020\u000b2\u0006\u0010i\u001a\u00020\u0017H\u0002J\u0018\u0010j\u001a\u00020\u00172\u0006\u0010k\u001a\u00020\u00172\u0006\u0010l\u001a\u00020\u0017H\u0002J\u0010\u0010m\u001a\u00020\u00172\u0006\u0010n\u001a\u00020\u0017H\u0002J\u0018\u0010o\u001a\u00020\u00172\u0006\u0010p\u001a\u00020\u00172\u0006\u0010q\u001a\u00020\u0017H\u0002J\u0010\u0010r\u001a\u00020\u00172\u0006\u0010s\u001a\u00020\u0017H\u0002J\u0010\u0010t\u001a\u00020\u001e2\u0006\u0010u\u001a\u000206H\u0016J\u0010\u0010v\u001a\u00020\u001e2\u0006\u0010u\u001a\u000206H\u0016J\u0010\u0010w\u001a\u00020>2\u0006\u0010u\u001a\u000206H\u0016R\u000e\u0010\r\u001a\u00020\u000bX\u0082D¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0011X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0014X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001f\"\u0004\b \u0010!R\u000e\u0010\"\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R \u0010(\u001a\u00020\u000bX\u0086\u000e¢\u0006\u0014\n\u0000\u0012\u0004\b)\u0010*\u001a\u0004\b+\u0010,\"\u0004\b-\u0010.R\u000e\u0010/\u001a\u000200X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00101\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u00020\u0017X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00104\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082.¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010:\u001a\u00020\u001eX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010;\u001a\u0004\u0018\u00010<X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010T\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bU\u0010VR\u0014\u0010W\u001a\u00020\u00178BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010VR\u000e\u0010x\u001a\u00020yX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006}"}, d2 = {"Lcom/marrow/ui/views/ZoomageView;", "Landroidx/appcompat/widget/AppCompatImageView;", "Landroid/view/ScaleGestureDetector$OnScaleGestureListener;", LogCategory.CONTEXT, "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyle", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "RESET_DURATION", "startScaleType", "Landroid/widget/ImageView$ScaleType;", "matrixMain", "Landroid/graphics/Matrix;", "startMatrix", "matrixValues", "", "startValues", "minScale", "", "maxScale", "calculatedMinScale", "calculatedMaxScale", "bounds", "Landroid/graphics/RectF;", "isTranslatable", "", "()Z", "setTranslatable", "(Z)V", "isZoomable", "doubleTapToZoom", "restrictBounds", "animateOnReset", "autoCenter", "doubleTapToZoomScaleFactor", "autoResetMode", "getAutoResetMode$annotations", "()V", "getAutoResetMode", "()I", "setAutoResetMode", "(I)V", "last", "Landroid/graphics/PointF;", "startScale", "scaleBy", "currentScaleFactor", "previousPointerCount", "scaleDetector", "Landroid/view/ScaleGestureDetector;", "gestureDetector", "Landroid/view/GestureDetector;", "doubleTapDetected", "singleTapDetected", "scaleFactorChangeListener", "Lcom/marrow/ui/views/ZoomageView$GestureListener;", "init", "", "verifyScaleRange", "setOnScaleFatorChangeListener", ServiceSpecificExtraArgs.CastExtraArgs.LISTENER, "removeOnScaleFactorChangeListener", "setScaleType", "scaleType", "setEnabled", "enabled", "setImageResource", "resId", "setImageDrawable", "drawable", "Landroid/graphics/drawable/Drawable;", "setImageBitmap", "bm", "Landroid/graphics/Bitmap;", "setImageURI", "uri", "Landroid/net/Uri;", "updateBounds", "values", "currentDisplayedWidth", "getCurrentDisplayedWidth", "()F", "currentDisplayedHeight", "getCurrentDisplayedHeight", "getNewStartValues", "onTouchEvent", "event", "Landroid/view/MotionEvent;", "resetImage", TtmlNode.CENTER, CourseConfigKeyConstantsKt.KEY_RESET, "animate", "animateToStartMatrix", "animateScaleAndTranslationToMatrix", "targetMatrix", "duration", "animateTranslationX", "animateTranslationY", "animateMatrixIndex", "index", "to", "getXDistance", "toX", "fromX", "getRestrictedXDistance", "xDistance", "getYDistance", "toY", "fromY", "getRestrictedYDistance", "ydistance", "onScale", "detector", "onScaleBegin", "onScaleEnd", "gestureListener", "Landroid/view/GestureDetector$OnGestureListener;", "SimpleAnimatorListener", "GestureListener", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class ZoomageView extends AppCompatImageView implements ScaleGestureDetector.OnScaleGestureListener {
    public static final IconCompatParcelizer write = new IconCompatParcelizer(null);
    private boolean AudioAttributesCompatParcelizer;
    private float AudioAttributesImplApi21Parcelizer;
    private boolean AudioAttributesImplApi26Parcelizer;
    private float AudioAttributesImplBaseParcelizer;
    private boolean IconCompatParcelizer;
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private float MediaBrowserCompatItemReceiver;
    private final PointF MediaBrowserCompatMediaItem;
    private final GestureDetector.OnGestureListener MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private float MediaDescriptionCompat;
    private GestureDetector MediaMetadataCompat;
    private boolean RatingCompat;
    private final RectF RemoteActionCompatParcelizer;
    private int autoResetMode;
    private Matrix handleMediaPlayPauseIfPendingOnHandler;
    private boolean isTranslatable;
    private final float[] onAddQueueItem;
    private float onCommand;
    private float onCustomAction;
    private boolean onFastForward;
    private ScaleGestureDetector onMediaButtonEvent;
    private read onPause;
    private float onPlay;
    private boolean onPlayFromMediaId;
    private ImageView.ScaleType onPlayFromUri;
    private float onPrepare;
    private float[] onPrepareFromMediaId;
    private Matrix onPrepareFromSearch;
    private final int read;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\bf\u0018\u00002\u00020\u0001À\u0006\u0003"}, d2 = {"Lcom/marrow/ui/views/ZoomageView$read;", ""}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface read {
    }

    /* JADX INFO: renamed from: isTranslatable, reason: from getter */
    public final boolean getIsTranslatable() {
        return this.isTranslatable;
    }

    public final void setTranslatable(boolean z) {
        this.isTranslatable = z;
    }

    public final int getAutoResetMode() {
        return this.autoResetMode;
    }

    public final void setAutoResetMode(int i) {
        this.autoResetMode = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomageView(Context context) {
        super(context);
        toMagicModuleMetaRepoModel.write(context, "");
        this.read = 200;
        this.handleMediaPlayPauseIfPendingOnHandler = new Matrix();
        this.onPrepareFromSearch = new Matrix();
        this.onAddQueueItem = new float[9];
        this.onCustomAction = 0.6f;
        this.onCommand = 8.0f;
        this.AudioAttributesImplBaseParcelizer = 0.6f;
        this.AudioAttributesImplApi21Parcelizer = 8.0f;
        this.RemoteActionCompatParcelizer = new RectF();
        this.MediaBrowserCompatMediaItem = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.onPrepare = 1.0f;
        this.onPlay = 1.0f;
        this.MediaBrowserCompatItemReceiver = 1.0f;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 1;
        this.MediaBrowserCompatSearchResultReceiver = new MediaBrowserCompatCustomActionResultReceiver();
        read(context, (AttributeSet) null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        toMagicModuleMetaRepoModel.write(context, "");
        this.read = 200;
        this.handleMediaPlayPauseIfPendingOnHandler = new Matrix();
        this.onPrepareFromSearch = new Matrix();
        this.onAddQueueItem = new float[9];
        this.onCustomAction = 0.6f;
        this.onCommand = 8.0f;
        this.AudioAttributesImplBaseParcelizer = 0.6f;
        this.AudioAttributesImplApi21Parcelizer = 8.0f;
        this.RemoteActionCompatParcelizer = new RectF();
        this.MediaBrowserCompatMediaItem = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.onPrepare = 1.0f;
        this.onPlay = 1.0f;
        this.MediaBrowserCompatItemReceiver = 1.0f;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 1;
        this.MediaBrowserCompatSearchResultReceiver = new MediaBrowserCompatCustomActionResultReceiver();
        read(context, attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ZoomageView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        toMagicModuleMetaRepoModel.write(context, "");
        this.read = 200;
        this.handleMediaPlayPauseIfPendingOnHandler = new Matrix();
        this.onPrepareFromSearch = new Matrix();
        this.onAddQueueItem = new float[9];
        this.onCustomAction = 0.6f;
        this.onCommand = 8.0f;
        this.AudioAttributesImplBaseParcelizer = 0.6f;
        this.AudioAttributesImplApi21Parcelizer = 8.0f;
        this.RemoteActionCompatParcelizer = new RectF();
        this.MediaBrowserCompatMediaItem = new PointF(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED);
        this.onPrepare = 1.0f;
        this.onPlay = 1.0f;
        this.MediaBrowserCompatItemReceiver = 1.0f;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = 1;
        this.MediaBrowserCompatSearchResultReceiver = new MediaBrowserCompatCustomActionResultReceiver();
        read(context, attributeSet);
    }

    private final void read(Context context, AttributeSet attributeSet) {
        this.onMediaButtonEvent = new ScaleGestureDetector(context, this);
        this.MediaMetadataCompat = new GestureDetector(context, this.MediaBrowserCompatSearchResultReceiver);
        ScaleGestureDetector scaleGestureDetector = this.onMediaButtonEvent;
        if (scaleGestureDetector == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            scaleGestureDetector = null;
        }
        putValue.AudioAttributesCompatParcelizer(scaleGestureDetector, false);
        this.onPlayFromUri = getScaleType();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, MediaPeriodId.AudioAttributesCompatParcelizer.ZoomageView);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(typedArrayObtainStyledAttributes, "");
        this.RatingCompat = typedArrayObtainStyledAttributes.getBoolean(9, true);
        this.isTranslatable = typedArrayObtainStyledAttributes.getBoolean(8, true);
        this.AudioAttributesCompatParcelizer = typedArrayObtainStyledAttributes.getBoolean(0, true);
        this.IconCompatParcelizer = typedArrayObtainStyledAttributes.getBoolean(1, true);
        this.onFastForward = typedArrayObtainStyledAttributes.getBoolean(7, false);
        this.MediaBrowserCompatCustomActionResultReceiver = typedArrayObtainStyledAttributes.getBoolean(3, true);
        this.onCustomAction = typedArrayObtainStyledAttributes.getFloat(6, 0.6f);
        this.onCommand = typedArrayObtainStyledAttributes.getFloat(5, 8.0f);
        this.MediaDescriptionCompat = typedArrayObtainStyledAttributes.getFloat(4, 3.0f);
        getScrubberPosition.RemoteActionCompatParcelizer remoteActionCompatParcelizer = getScrubberPosition.RemoteActionCompatParcelizer.INSTANCE;
        this.autoResetMode = getScrubberPosition.RemoteActionCompatParcelizer.read(typedArrayObtainStyledAttributes.getInt(2, 0));
        MediaBrowserCompatItemReceiver();
        typedArrayObtainStyledAttributes.recycle();
    }

    private final void MediaBrowserCompatItemReceiver() {
        float f = this.onCustomAction;
        float f2 = this.onCommand;
        if (f >= f2) {
            throw new IllegalStateException("minScale must be less than maxScale".toString());
        }
        if (f < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalStateException("minScale must be greater than 0".toString());
        }
        if (f2 < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalStateException("maxScale must be greater than 0".toString());
        }
        if (this.MediaDescriptionCompat > f2) {
            this.MediaDescriptionCompat = f2;
        }
        if (this.MediaDescriptionCompat < f) {
            this.MediaDescriptionCompat = f;
        }
    }

    public final void setOnScaleFatorChangeListener(read readVar) {
        this.onPause = readVar;
    }

    @Override // android.widget.ImageView
    public final void setScaleType(ImageView.ScaleType scaleType) {
        if (scaleType != null) {
            super.setScaleType(scaleType);
            this.onPlayFromUri = scaleType;
            this.onPrepareFromMediaId = null;
        }
    }

    @Override // android.view.View
    public final void setEnabled(boolean enabled) {
        super.setEnabled(enabled);
        if (enabled) {
            return;
        }
        setScaleType(this.onPlayFromUri);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageResource(int resId) {
        super.setImageResource(resId);
        setScaleType(this.onPlayFromUri);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        setScaleType(this.onPlayFromUri);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageBitmap(Bitmap bm) {
        toMagicModuleMetaRepoModel.write(bm, "");
        super.setImageBitmap(bm);
        setScaleType(this.onPlayFromUri);
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public final void setImageURI(Uri uri) {
        super.setImageURI(uri);
        setScaleType(this.onPlayFromUri);
    }

    private final void IconCompatParcelizer(float[] fArr) {
        if (getDrawable() != null) {
            this.RemoteActionCompatParcelizer.set(fArr[2], fArr[5], (getDrawable().getIntrinsicWidth() * fArr[0]) + fArr[2], (getDrawable().getIntrinsicHeight() * fArr[4]) + fArr[5]);
        }
    }

    private final float AudioAttributesImplBaseParcelizer() {
        return getDrawable() != null ? getDrawable().getIntrinsicWidth() * this.onAddQueueItem[0] : BitmapDescriptorFactory.HUE_RED;
    }

    private final float IconCompatParcelizer() {
        return getDrawable() != null ? getDrawable().getIntrinsicHeight() * this.onAddQueueItem[4] : BitmapDescriptorFactory.HUE_RED;
    }

    private final float[] MediaBrowserCompatCustomActionResultReceiver() {
        float[] fArr = new float[9];
        Matrix matrix = new Matrix(getImageMatrix());
        this.onPrepareFromSearch = matrix;
        matrix.getValues(fArr);
        float f = this.onCustomAction;
        float f2 = fArr[0];
        this.AudioAttributesImplBaseParcelizer = f * f2;
        this.AudioAttributesImplApi21Parcelizer = this.onCommand * f2;
        return fArr;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent event) {
        toMagicModuleMetaRepoModel.write(event, "");
        this.isTranslatable = this.MediaBrowserCompatItemReceiver > 1.0f;
        if (!isClickable() && isEnabled() && (this.RatingCompat || this.isTranslatable)) {
            if (getScaleType() != ImageView.ScaleType.MATRIX) {
                super.setScaleType(ImageView.ScaleType.MATRIX);
            }
            float[] fArrMediaBrowserCompatCustomActionResultReceiver = this.onPrepareFromMediaId;
            if (fArrMediaBrowserCompatCustomActionResultReceiver == null) {
                fArrMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver();
            }
            this.onPrepareFromMediaId = fArrMediaBrowserCompatCustomActionResultReceiver;
            this.handleMediaPlayPauseIfPendingOnHandler.set(getImageMatrix());
            this.handleMediaPlayPauseIfPendingOnHandler.getValues(this.onAddQueueItem);
            IconCompatParcelizer(this.onAddQueueItem);
            ScaleGestureDetector scaleGestureDetector = this.onMediaButtonEvent;
            ScaleGestureDetector scaleGestureDetector2 = null;
            if (scaleGestureDetector == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                scaleGestureDetector = null;
            }
            scaleGestureDetector.onTouchEvent(event);
            GestureDetector gestureDetector = this.MediaMetadataCompat;
            if (gestureDetector == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                gestureDetector = null;
            }
            gestureDetector.onTouchEvent(event);
            if (this.MediaBrowserCompatCustomActionResultReceiver && this.AudioAttributesImplApi26Parcelizer) {
                this.AudioAttributesImplApi26Parcelizer = false;
                this.onPlayFromMediaId = false;
                if (this.onAddQueueItem[0] != fArrMediaBrowserCompatCustomActionResultReceiver[0]) {
                    write(this);
                } else {
                    Matrix matrix = new Matrix(this.handleMediaPlayPauseIfPendingOnHandler);
                    float f = this.MediaDescriptionCompat;
                    ScaleGestureDetector scaleGestureDetector3 = this.onMediaButtonEvent;
                    if (scaleGestureDetector3 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        scaleGestureDetector3 = null;
                    }
                    float focusX = scaleGestureDetector3.getFocusX();
                    ScaleGestureDetector scaleGestureDetector4 = this.onMediaButtonEvent;
                    if (scaleGestureDetector4 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        scaleGestureDetector2 = scaleGestureDetector4;
                    }
                    matrix.postScale(f, f, focusX, scaleGestureDetector2.getFocusY());
                    write(matrix, this.read);
                }
                return true;
            }
            if (!this.onPlayFromMediaId) {
                if (event.getActionMasked() == 0 || event.getPointerCount() != this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) {
                    PointF pointF = this.MediaBrowserCompatMediaItem;
                    ScaleGestureDetector scaleGestureDetector5 = this.onMediaButtonEvent;
                    if (scaleGestureDetector5 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        scaleGestureDetector5 = null;
                    }
                    float focusX2 = scaleGestureDetector5.getFocusX();
                    ScaleGestureDetector scaleGestureDetector6 = this.onMediaButtonEvent;
                    if (scaleGestureDetector6 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        scaleGestureDetector2 = scaleGestureDetector6;
                    }
                    pointF.set(focusX2, scaleGestureDetector2.getFocusY());
                } else if (event.getActionMasked() == 2) {
                    ScaleGestureDetector scaleGestureDetector7 = this.onMediaButtonEvent;
                    if (scaleGestureDetector7 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                        scaleGestureDetector7 = null;
                    }
                    float focusX3 = scaleGestureDetector7.getFocusX();
                    ScaleGestureDetector scaleGestureDetector8 = this.onMediaButtonEvent;
                    if (scaleGestureDetector8 == null) {
                        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    } else {
                        scaleGestureDetector2 = scaleGestureDetector8;
                    }
                    float focusY = scaleGestureDetector2.getFocusY();
                    if (this.isTranslatable) {
                        this.handleMediaPlayPauseIfPendingOnHandler.postTranslate(read(focusX3, this.MediaBrowserCompatMediaItem.x), write(focusY, this.MediaBrowserCompatMediaItem.y));
                    }
                    if (this.RatingCompat) {
                        Matrix matrix2 = this.handleMediaPlayPauseIfPendingOnHandler;
                        float f2 = this.onPlay;
                        matrix2.postScale(f2, f2, focusX3, focusY);
                        this.MediaBrowserCompatItemReceiver = this.onAddQueueItem[0] / fArrMediaBrowserCompatCustomActionResultReceiver[0];
                    }
                    setImageMatrix(this.handleMediaPlayPauseIfPendingOnHandler);
                    this.MediaBrowserCompatMediaItem.set(focusX3, focusY);
                }
                if (event.getActionMasked() == 1) {
                    this.onPlay = 1.0f;
                    AudioAttributesImplApi21Parcelizer();
                }
            }
            this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = event.getPointerCount();
            return true;
        }
        return super.onTouchEvent(event);
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        float[] fArr = this.onPrepareFromMediaId;
        if (fArr != null) {
            int i = this.autoResetMode;
            if (i == 0) {
                if (this.onAddQueueItem[0] <= fArr[0]) {
                    write(this);
                    return;
                } else {
                    read();
                    return;
                }
            }
            if (i == 1) {
                if (this.onAddQueueItem[0] >= fArr[0]) {
                    write(this);
                    return;
                } else {
                    read();
                    return;
                }
            }
            if (i == 2) {
                write(this);
            } else {
                if (i != 3) {
                    return;
                }
                read();
            }
        }
    }

    private final void read() {
        if (this.IconCompatParcelizer) {
            AudioAttributesCompatParcelizer();
            write();
        }
    }

    private static /* synthetic */ void write(ZoomageView zoomageView) {
        zoomageView.AudioAttributesCompatParcelizer(zoomageView.AudioAttributesCompatParcelizer);
    }

    private void AudioAttributesCompatParcelizer(boolean z) {
        if (z) {
            RemoteActionCompatParcelizer();
        } else {
            setImageMatrix(this.onPrepareFromSearch);
        }
    }

    private final void RemoteActionCompatParcelizer() {
        write(this.onPrepareFromSearch, this.read);
    }

    private final void write(Matrix matrix, int i) {
        float[] fArr = new float[9];
        matrix.getValues(fArr);
        Matrix matrix2 = new Matrix(getImageMatrix());
        matrix2.getValues(this.onAddQueueItem);
        float f = fArr[0];
        float[] fArr2 = this.onAddQueueItem;
        float f2 = fArr2[0];
        float f3 = fArr[4];
        float f4 = fArr2[4];
        float f5 = fArr[2];
        float f6 = fArr2[2];
        float f7 = fArr[5];
        float f8 = fArr2[5];
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(BitmapDescriptorFactory.HUE_RED, 1.0f);
        valueAnimatorOfFloat.addUpdateListener(new write(matrix2, f5 - f6, f7 - f8, f - f2, f3 - f4));
        valueAnimatorOfFloat.addListener(new AudioAttributesImplBaseParcelizer(matrix));
        valueAnimatorOfFloat.setDuration(i);
        valueAnimatorOfFloat.start();
    }

    public static final class write implements ValueAnimator.AnimatorUpdateListener {
        private /* synthetic */ float AudioAttributesCompatParcelizer;
        private final Matrix AudioAttributesImplApi21Parcelizer;
        private /* synthetic */ float IconCompatParcelizer;
        private final float[] MediaBrowserCompatItemReceiver = new float[9];
        private /* synthetic */ float RemoteActionCompatParcelizer;
        private /* synthetic */ float read;
        private /* synthetic */ Matrix write;

        write(Matrix matrix, float f, float f2, float f3, float f4) {
            this.write = matrix;
            this.RemoteActionCompatParcelizer = f;
            this.AudioAttributesCompatParcelizer = f2;
            this.IconCompatParcelizer = f3;
            this.read = f4;
            this.AudioAttributesImplApi21Parcelizer = new Matrix(ZoomageView.this.getImageMatrix());
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            toMagicModuleMetaRepoModel.write(valueAnimator, "");
            Object animatedValue = valueAnimator.getAnimatedValue();
            toMagicModuleMetaRepoModel.read(animatedValue, "");
            float fFloatValue = ((Float) animatedValue).floatValue();
            this.AudioAttributesImplApi21Parcelizer.set(this.write);
            this.AudioAttributesImplApi21Parcelizer.getValues(this.MediaBrowserCompatItemReceiver);
            float[] fArr = this.MediaBrowserCompatItemReceiver;
            fArr[2] = fArr[2] + (this.RemoteActionCompatParcelizer * fFloatValue);
            fArr[5] = fArr[5] + (this.AudioAttributesCompatParcelizer * fFloatValue);
            fArr[0] = fArr[0] + (this.IconCompatParcelizer * fFloatValue);
            fArr[4] = fArr[4] + (this.read * fFloatValue);
            this.AudioAttributesImplApi21Parcelizer.setValues(fArr);
            ZoomageView.this.setImageMatrix(this.AudioAttributesImplApi21Parcelizer);
        }
    }

    public static final class AudioAttributesImplBaseParcelizer extends RemoteActionCompatParcelizer {
        private /* synthetic */ Matrix RemoteActionCompatParcelizer;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplBaseParcelizer(Matrix matrix) {
            super();
            this.RemoteActionCompatParcelizer = matrix;
        }

        @Override // com.marrow.ui.views.ZoomageView.RemoteActionCompatParcelizer, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            toMagicModuleMetaRepoModel.write(animator, "");
            ZoomageView.this.setImageMatrix(this.RemoteActionCompatParcelizer);
        }
    }

    private final void AudioAttributesCompatParcelizer() {
        if (AudioAttributesImplBaseParcelizer() > getWidth()) {
            if (this.RemoteActionCompatParcelizer.left > BitmapDescriptorFactory.HUE_RED) {
                write(2, BitmapDescriptorFactory.HUE_RED);
                return;
            } else {
                if (this.RemoteActionCompatParcelizer.right < getWidth()) {
                    write(2, (this.RemoteActionCompatParcelizer.left + getWidth()) - this.RemoteActionCompatParcelizer.right);
                    return;
                }
                return;
            }
        }
        if (this.RemoteActionCompatParcelizer.left < BitmapDescriptorFactory.HUE_RED) {
            write(2, BitmapDescriptorFactory.HUE_RED);
        } else if (this.RemoteActionCompatParcelizer.right > getWidth()) {
            write(2, (this.RemoteActionCompatParcelizer.left + getWidth()) - this.RemoteActionCompatParcelizer.right);
        }
    }

    private final void write() {
        if (IconCompatParcelizer() > getHeight()) {
            if (this.RemoteActionCompatParcelizer.top > BitmapDescriptorFactory.HUE_RED) {
                write(5, BitmapDescriptorFactory.HUE_RED);
                return;
            } else {
                if (this.RemoteActionCompatParcelizer.bottom < getHeight()) {
                    write(5, (this.RemoteActionCompatParcelizer.top + getHeight()) - this.RemoteActionCompatParcelizer.bottom);
                    return;
                }
                return;
            }
        }
        if (this.RemoteActionCompatParcelizer.top < BitmapDescriptorFactory.HUE_RED) {
            write(5, BitmapDescriptorFactory.HUE_RED);
        } else if (this.RemoteActionCompatParcelizer.bottom > getHeight()) {
            write(5, (this.RemoteActionCompatParcelizer.top + getHeight()) - this.RemoteActionCompatParcelizer.bottom);
        }
    }

    public static final class AudioAttributesCompatParcelizer implements ValueAnimator.AnimatorUpdateListener {
        private /* synthetic */ int AudioAttributesCompatParcelizer;
        private final float[] IconCompatParcelizer = new float[9];
        private Matrix read = new Matrix();

        AudioAttributesCompatParcelizer(int i) {
            this.AudioAttributesCompatParcelizer = i;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            toMagicModuleMetaRepoModel.write(valueAnimator, "");
            this.read.set(ZoomageView.this.getImageMatrix());
            this.read.getValues(this.IconCompatParcelizer);
            float[] fArr = this.IconCompatParcelizer;
            int i = this.AudioAttributesCompatParcelizer;
            Object animatedValue = valueAnimator.getAnimatedValue();
            toMagicModuleMetaRepoModel.read(animatedValue, "");
            fArr[i] = ((Float) animatedValue).floatValue();
            this.read.setValues(this.IconCompatParcelizer);
            ZoomageView.this.setImageMatrix(this.read);
        }
    }

    private final void write(int i, float f) {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(this.onAddQueueItem[i], f);
        valueAnimatorOfFloat.addUpdateListener(new AudioAttributesCompatParcelizer(i));
        valueAnimatorOfFloat.setDuration(this.read);
        valueAnimatorOfFloat.start();
    }

    private final float read(float f, float f2) {
        float fRemoteActionCompatParcelizer = f - f2;
        if (this.onFastForward) {
            fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(fRemoteActionCompatParcelizer);
        }
        if (this.RemoteActionCompatParcelizer.right + fRemoteActionCompatParcelizer < BitmapDescriptorFactory.HUE_RED) {
            return -this.RemoteActionCompatParcelizer.right;
        }
        return this.RemoteActionCompatParcelizer.left + fRemoteActionCompatParcelizer > ((float) getWidth()) ? getWidth() - this.RemoteActionCompatParcelizer.left : fRemoteActionCompatParcelizer;
    }

    private final float RemoteActionCompatParcelizer(float f) {
        float width;
        float f2;
        float f3;
        ScaleGestureDetector scaleGestureDetector = null;
        if (AudioAttributesImplBaseParcelizer() < getWidth()) {
            ScaleGestureDetector scaleGestureDetector2 = this.onMediaButtonEvent;
            if (scaleGestureDetector2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                scaleGestureDetector = scaleGestureDetector2;
            }
            if (scaleGestureDetector.isInProgress()) {
                return f;
            }
            if (this.RemoteActionCompatParcelizer.left >= BitmapDescriptorFactory.HUE_RED && this.RemoteActionCompatParcelizer.left + f < BitmapDescriptorFactory.HUE_RED) {
                f3 = this.RemoteActionCompatParcelizer.left;
                return -f3;
            }
            if (this.RemoteActionCompatParcelizer.right > getWidth() || this.RemoteActionCompatParcelizer.right + f <= getWidth()) {
                return f;
            }
            width = getWidth();
            f2 = this.RemoteActionCompatParcelizer.right;
            return width - f2;
        }
        if (this.RemoteActionCompatParcelizer.left <= BitmapDescriptorFactory.HUE_RED && this.RemoteActionCompatParcelizer.left + f > BitmapDescriptorFactory.HUE_RED) {
            ScaleGestureDetector scaleGestureDetector3 = this.onMediaButtonEvent;
            if (scaleGestureDetector3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                scaleGestureDetector3 = null;
            }
            if (!scaleGestureDetector3.isInProgress()) {
                f3 = this.RemoteActionCompatParcelizer.left;
                return -f3;
            }
        }
        if (this.RemoteActionCompatParcelizer.right < getWidth() || this.RemoteActionCompatParcelizer.right + f >= getWidth()) {
            return f;
        }
        ScaleGestureDetector scaleGestureDetector4 = this.onMediaButtonEvent;
        if (scaleGestureDetector4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            scaleGestureDetector = scaleGestureDetector4;
        }
        if (scaleGestureDetector.isInProgress()) {
            return f;
        }
        width = getWidth();
        f2 = this.RemoteActionCompatParcelizer.right;
        return width - f2;
    }

    private final float write(float f, float f2) {
        float fWrite = f - f2;
        if (this.onFastForward) {
            fWrite = write(fWrite);
        }
        if (this.RemoteActionCompatParcelizer.bottom + fWrite < BitmapDescriptorFactory.HUE_RED) {
            return -this.RemoteActionCompatParcelizer.bottom;
        }
        return this.RemoteActionCompatParcelizer.top + fWrite > ((float) getHeight()) ? getHeight() - this.RemoteActionCompatParcelizer.top : fWrite;
    }

    private final float write(float f) {
        float height;
        float f2;
        float f3;
        ScaleGestureDetector scaleGestureDetector = null;
        if (IconCompatParcelizer() < getHeight()) {
            ScaleGestureDetector scaleGestureDetector2 = this.onMediaButtonEvent;
            if (scaleGestureDetector2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                scaleGestureDetector = scaleGestureDetector2;
            }
            if (scaleGestureDetector.isInProgress()) {
                return f;
            }
            if (this.RemoteActionCompatParcelizer.top >= BitmapDescriptorFactory.HUE_RED && this.RemoteActionCompatParcelizer.top + f < BitmapDescriptorFactory.HUE_RED) {
                f3 = this.RemoteActionCompatParcelizer.top;
                return -f3;
            }
            if (this.RemoteActionCompatParcelizer.bottom > getHeight() || this.RemoteActionCompatParcelizer.bottom + f <= getHeight()) {
                return f;
            }
            height = getHeight();
            f2 = this.RemoteActionCompatParcelizer.bottom;
            return height - f2;
        }
        if (this.RemoteActionCompatParcelizer.top <= BitmapDescriptorFactory.HUE_RED && this.RemoteActionCompatParcelizer.top + f > BitmapDescriptorFactory.HUE_RED) {
            ScaleGestureDetector scaleGestureDetector3 = this.onMediaButtonEvent;
            if (scaleGestureDetector3 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                scaleGestureDetector3 = null;
            }
            if (!scaleGestureDetector3.isInProgress()) {
                f3 = this.RemoteActionCompatParcelizer.top;
                return -f3;
            }
        }
        if (this.RemoteActionCompatParcelizer.bottom < getHeight() || this.RemoteActionCompatParcelizer.bottom + f >= getHeight()) {
            return f;
        }
        ScaleGestureDetector scaleGestureDetector4 = this.onMediaButtonEvent;
        if (scaleGestureDetector4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            scaleGestureDetector = scaleGestureDetector4;
        }
        if (scaleGestureDetector.isInProgress()) {
            return f;
        }
        height = getHeight();
        f2 = this.RemoteActionCompatParcelizer.bottom;
        return height - f2;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector detector) {
        toMagicModuleMetaRepoModel.write(detector, "");
        float f = this.onPrepare;
        float scaleFactor = detector.getScaleFactor();
        float f2 = this.onAddQueueItem[0];
        float f3 = (f * scaleFactor) / f2;
        this.onPlay = f3;
        float f4 = f3 * f2;
        float f5 = this.AudioAttributesImplBaseParcelizer;
        if (f4 < f5) {
            this.onPlay = f5 / f2;
        } else {
            float f6 = this.AudioAttributesImplApi21Parcelizer;
            if (f4 > f6) {
                this.onPlay = f6 / f2;
            }
        }
        return false;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScaleBegin(ScaleGestureDetector detector) {
        toMagicModuleMetaRepoModel.write(detector, "");
        this.onPrepare = this.onAddQueueItem[0];
        return true;
    }

    @Override // android.view.ScaleGestureDetector.OnScaleGestureListener
    public final void onScaleEnd(ScaleGestureDetector detector) {
        toMagicModuleMetaRepoModel.write(detector, "");
        this.onPlay = 1.0f;
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver extends GestureDetector.SimpleOnGestureListener {
        MediaBrowserCompatCustomActionResultReceiver() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onDoubleTapEvent(MotionEvent motionEvent) {
            toMagicModuleMetaRepoModel.write(motionEvent, "");
            if (motionEvent.getAction() != 1) {
                return false;
            }
            ZoomageView.this.AudioAttributesImplApi26Parcelizer = true;
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            toMagicModuleMetaRepoModel.write(motionEvent, "");
            if (ZoomageView.this.onPause != null) {
                read unused = ZoomageView.this.onPause;
            }
            ZoomageView.this.onPlayFromMediaId = true;
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(MotionEvent motionEvent) {
            toMagicModuleMetaRepoModel.write(motionEvent, "");
            ZoomageView.this.onPlayFromMediaId = false;
            return false;
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onDown(MotionEvent motionEvent) {
            toMagicModuleMetaRepoModel.write(motionEvent, "");
            return true;
        }
    }

    class RemoteActionCompatParcelizer implements Animator.AnimatorListener {
        public RemoteActionCompatParcelizer() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            toMagicModuleMetaRepoModel.write(animator, "");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            toMagicModuleMetaRepoModel.write(animator, "");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
            toMagicModuleMetaRepoModel.write(animator, "");
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            toMagicModuleMetaRepoModel.write(animator, "");
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow/ui/views/ZoomageView$IconCompatParcelizer;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
