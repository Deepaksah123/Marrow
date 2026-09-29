package com.google.android.material.slider;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.SeekBar;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.material.slider.BaseSlider;
import java.math.BigDecimal;
import java.math.MathContext;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.AviExtractorAviSeekMap;
import kotlin.AviMainHeaderChunk;
import kotlin.BinarySearchSeekerSeekOperationParams;
import kotlin.DefaultExtractorsFactoryExtensionLoader;
import kotlin.ExtractorOutput;
import kotlin.InvalidTypeIdException;
import kotlin.SeekMap;
import kotlin.StdKeyDeserializer;
import kotlin.calculateNextSearchBytePosition;
import kotlin.call1;
import kotlin.checkAndPeekStreamMarker;
import kotlin.findFormatOverrides;
import kotlin.frameSizeBytesByTypeNb;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.getFrameStartMarker;
import kotlin.getSampleRateLookupKey;
import kotlin.hasSuperClassStartingWith;
import kotlin.isValidFrameType;
import kotlin.populateWithListHeaderFrom;
import kotlin.readFrames;
import kotlin.readId3Metadata;
import kotlin.readTagHeader;

/* JADX INFO: loaded from: classes3.dex */
abstract class BaseSlider<S extends BaseSlider<S, L, T>, L extends AviExtractorAviSeekMap<S>, T extends populateWithListHeaderFrom<S>> extends View {
    private int AudioAttributesImplApi21Parcelizer;
    private final Paint AudioAttributesImplApi26Parcelizer;
    private BaseSlider<S, L, T>.AudioAttributesCompatParcelizer AudioAttributesImplBaseParcelizer;
    private final AccessibilityManager MediaBrowserCompatCustomActionResultReceiver;
    private final write MediaBrowserCompatItemReceiver;
    private final List<L> MediaBrowserCompatMediaItem;
    private Drawable MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private List<Drawable> MediaDescriptionCompat;
    private final Paint MediaMetadataCompat;
    private int MediaSessionCompatQueueItem;
    private ColorStateList MediaSessionCompatResultReceiverWrapper;
    private int MediaSessionCompatToken;
    private ColorStateList ParcelableVolumeInfo;
    private int PlaybackStateCompat;
    private float PlaybackStateCompatCustomAction;
    private final frameSizeBytesByTypeNb RatingCompat;
    private float ResultReceiver;
    private int _init_lambda2;
    private int _init_lambda3;
    private ArrayList<Float> _init_lambda5;
    private float accessaddObserverForBackInvoker;
    private int accessensureViewModelStore;
    private float accessgetReportFullyDrawnExecutorp;
    private int handleMediaPlayPauseIfPendingOnHandler;
    private boolean onAddQueueItem;
    private int onCommand;
    private int onCustomAction;
    private ColorStateList onFastForward;
    private final Paint onMediaButtonEvent;
    private int onPause;
    private boolean onPlay;
    private AviMainHeaderChunk onPlayFromMediaId;
    private int onPlayFromSearch;
    private final Paint onPlayFromUri;
    private final Paint onPrepare;
    private boolean onPrepareFromMediaId;
    private int onPrepareFromSearch;
    private int onPrepareFromUri;
    private int onRemoveQueueItem;
    private boolean onRemoveQueueItemAt;
    private final List<readTagHeader> onRewind;
    private ValueAnimator onSeekTo;
    private int onSetCaptioningEnabled;
    private int onSetPlaybackSpeed;
    private int onSetRating;
    private MotionEvent onSetRepeatMode;
    private ValueAnimator onSetShuffleMode;
    private float onSkipToNext;
    private final Paint onSkipToPrevious;
    private boolean onSkipToQueueItem;
    private int onStop;
    private float[] r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    private final List<T> r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    private boolean r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private ColorStateList r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    private int r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    private ColorStateList r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    private final int setSessionImpl;
    static final int RemoteActionCompatParcelizer = calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_Slider;
    private static final int write = calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationMedium4;
    private static final int read = calculateNextSearchBytePosition.IconCompatParcelizer.motionDurationShort3;
    private static final int IconCompatParcelizer = calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingEmphasizedInterpolator;
    private static final int AudioAttributesCompatParcelizer = calculateNextSearchBytePosition.IconCompatParcelizer.motionEasingEmphasizedAccelerateInterpolator;

    protected float RemoteActionCompatParcelizer() {
        return BitmapDescriptorFactory.HUE_RED;
    }

    static /* synthetic */ float IconCompatParcelizer(BaseSlider baseSlider) {
        return baseSlider.AudioAttributesCompatParcelizer(20);
    }

    public BaseSlider(Context context) {
        this(context, null);
    }

    public BaseSlider(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, calculateNextSearchBytePosition.IconCompatParcelizer.sliderStyle);
    }

    public BaseSlider(Context context, AttributeSet attributeSet, int i) {
        super(readFrames.IconCompatParcelizer(context, attributeSet, i, RemoteActionCompatParcelizer), attributeSet, i);
        this.onRewind = new ArrayList();
        this.MediaBrowserCompatMediaItem = new ArrayList();
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = new ArrayList();
        this.onRemoveQueueItemAt = false;
        this.onSkipToQueueItem = false;
        this._init_lambda5 = new ArrayList<>();
        this.AudioAttributesImplApi21Parcelizer = -1;
        this.onPause = -1;
        this.onSkipToNext = BitmapDescriptorFactory.HUE_RED;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = true;
        this.onPrepareFromMediaId = false;
        frameSizeBytesByTypeNb framesizebytesbytypenb = new frameSizeBytesByTypeNb();
        this.RatingCompat = framesizebytesbytypenb;
        this.MediaDescriptionCompat = Collections.emptyList();
        this.onStop = 0;
        Context context2 = getContext();
        Paint paint = new Paint();
        this.onPrepare = paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeCap(Paint.Cap.ROUND);
        Paint paint2 = new Paint();
        this.MediaMetadataCompat = paint2;
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeCap(Paint.Cap.ROUND);
        Paint paint3 = new Paint(1);
        this.onSkipToPrevious = paint3;
        paint3.setStyle(Paint.Style.FILL);
        paint3.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
        Paint paint4 = new Paint(1);
        this.onMediaButtonEvent = paint4;
        paint4.setStyle(Paint.Style.FILL);
        Paint paint5 = new Paint();
        this.onPlayFromUri = paint5;
        paint5.setStyle(Paint.Style.STROKE);
        paint5.setStrokeCap(Paint.Cap.ROUND);
        Paint paint6 = new Paint();
        this.AudioAttributesImplApi26Parcelizer = paint6;
        paint6.setStyle(Paint.Style.STROKE);
        paint6.setStrokeCap(Paint.Cap.ROUND);
        read(context2.getResources());
        RemoteActionCompatParcelizer(context2, attributeSet, i);
        setFocusable(true);
        setClickable(true);
        framesizebytesbytypenb.onSeekTo(2);
        this.setSessionImpl = ViewConfiguration.get(context2).getScaledTouchSlop();
        write writeVar = new write(this);
        this.MediaBrowserCompatItemReceiver = writeVar;
        InvalidTypeIdException.AudioAttributesCompatParcelizer(this, writeVar);
        this.MediaBrowserCompatCustomActionResultReceiver = (AccessibilityManager) getContext().getSystemService("accessibility");
    }

    private void read(Resources resources) {
        this.onSetRating = resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_slider_widget_height);
        int dimensionPixelOffset = resources.getDimensionPixelOffset(calculateNextSearchBytePosition.write.mtrl_slider_track_side_padding);
        this.onSetCaptioningEnabled = dimensionPixelOffset;
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = dimensionPixelOffset;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_slider_thumb_radius);
        this.onCustomAction = resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_slider_track_height);
        this.onCommand = resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_slider_tick_radius);
        this.handleMediaPlayPauseIfPendingOnHandler = resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_slider_tick_radius);
        this.onRemoveQueueItem = resources.getDimensionPixelSize(calculateNextSearchBytePosition.write.mtrl_slider_label_padding);
    }

    private void RemoteActionCompatParcelizer(Context context, AttributeSet attributeSet, int i) {
        TypedArray typedArrayWrite = readId3Metadata.write(context, attributeSet, calculateNextSearchBytePosition.MediaMetadataCompat.Slider, i, RemoteActionCompatParcelizer, new int[0]);
        this.onPrepareFromUri = typedArrayWrite.getResourceId(calculateNextSearchBytePosition.MediaMetadataCompat.Slider_labelStyle, calculateNextSearchBytePosition.MediaBrowserCompatMediaItem.Widget_MaterialComponents_Tooltip);
        this.accessgetReportFullyDrawnExecutorp = typedArrayWrite.getFloat(calculateNextSearchBytePosition.MediaMetadataCompat.Slider_android_valueFrom, BitmapDescriptorFactory.HUE_RED);
        this.accessaddObserverForBackInvoker = typedArrayWrite.getFloat(calculateNextSearchBytePosition.MediaMetadataCompat.Slider_android_valueTo, 1.0f);
        setValues(Float.valueOf(this.accessgetReportFullyDrawnExecutorp));
        this.onSkipToNext = typedArrayWrite.getFloat(calculateNextSearchBytePosition.MediaMetadataCompat.Slider_android_stepSize, BitmapDescriptorFactory.HUE_RED);
        this.onSetPlaybackSpeed = (int) Math.ceil(typedArrayWrite.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.Slider_minTouchTargetSize, (float) Math.ceil(checkAndPeekStreamMarker.AudioAttributesCompatParcelizer(getContext(), 48))));
        boolean zHasValue = typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.Slider_trackColor);
        int i2 = zHasValue ? calculateNextSearchBytePosition.MediaMetadataCompat.Slider_trackColor : calculateNextSearchBytePosition.MediaMetadataCompat.Slider_trackColorInactive;
        int i3 = zHasValue ? calculateNextSearchBytePosition.MediaMetadataCompat.Slider_trackColor : calculateNextSearchBytePosition.MediaMetadataCompat.Slider_trackColorActive;
        ColorStateList colorStateListIconCompatParcelizer = SeekMap.IconCompatParcelizer(context, typedArrayWrite, i2);
        if (colorStateListIconCompatParcelizer == null) {
            colorStateListIconCompatParcelizer = getDefaultViewModelCreationExtras.IconCompatParcelizer(context, calculateNextSearchBytePosition.read.material_slider_inactive_track_color);
        }
        setTrackInactiveTintList(colorStateListIconCompatParcelizer);
        ColorStateList colorStateListIconCompatParcelizer2 = SeekMap.IconCompatParcelizer(context, typedArrayWrite, i3);
        if (colorStateListIconCompatParcelizer2 == null) {
            colorStateListIconCompatParcelizer2 = getDefaultViewModelCreationExtras.IconCompatParcelizer(context, calculateNextSearchBytePosition.read.material_slider_active_track_color);
        }
        setTrackActiveTintList(colorStateListIconCompatParcelizer2);
        this.RatingCompat.AudioAttributesImplApi21Parcelizer(SeekMap.IconCompatParcelizer(context, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.Slider_thumbColor));
        if (typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.Slider_thumbStrokeColor)) {
            setThumbStrokeColor(SeekMap.IconCompatParcelizer(context, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.Slider_thumbStrokeColor));
        }
        setThumbStrokeWidth(typedArrayWrite.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.Slider_thumbStrokeWidth, BitmapDescriptorFactory.HUE_RED));
        ColorStateList colorStateListIconCompatParcelizer3 = SeekMap.IconCompatParcelizer(context, typedArrayWrite, calculateNextSearchBytePosition.MediaMetadataCompat.Slider_haloColor);
        if (colorStateListIconCompatParcelizer3 == null) {
            colorStateListIconCompatParcelizer3 = getDefaultViewModelCreationExtras.IconCompatParcelizer(context, calculateNextSearchBytePosition.read.material_slider_halo_color);
        }
        setHaloTintList(colorStateListIconCompatParcelizer3);
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.Slider_tickVisible, true);
        boolean zHasValue2 = typedArrayWrite.hasValue(calculateNextSearchBytePosition.MediaMetadataCompat.Slider_tickColor);
        int i4 = zHasValue2 ? calculateNextSearchBytePosition.MediaMetadataCompat.Slider_tickColor : calculateNextSearchBytePosition.MediaMetadataCompat.Slider_tickColorInactive;
        int i5 = zHasValue2 ? calculateNextSearchBytePosition.MediaMetadataCompat.Slider_tickColor : calculateNextSearchBytePosition.MediaMetadataCompat.Slider_tickColorActive;
        ColorStateList colorStateListIconCompatParcelizer4 = SeekMap.IconCompatParcelizer(context, typedArrayWrite, i4);
        if (colorStateListIconCompatParcelizer4 == null) {
            colorStateListIconCompatParcelizer4 = getDefaultViewModelCreationExtras.IconCompatParcelizer(context, calculateNextSearchBytePosition.read.material_slider_inactive_tick_marks_color);
        }
        setTickInactiveTintList(colorStateListIconCompatParcelizer4);
        ColorStateList colorStateListIconCompatParcelizer5 = SeekMap.IconCompatParcelizer(context, typedArrayWrite, i5);
        if (colorStateListIconCompatParcelizer5 == null) {
            colorStateListIconCompatParcelizer5 = getDefaultViewModelCreationExtras.IconCompatParcelizer(context, calculateNextSearchBytePosition.read.material_slider_active_tick_marks_color);
        }
        setTickActiveTintList(colorStateListIconCompatParcelizer5);
        setThumbRadius(typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.Slider_thumbRadius, 0));
        setHaloRadius(typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.Slider_haloRadius, 0));
        setThumbElevation(typedArrayWrite.getDimension(calculateNextSearchBytePosition.MediaMetadataCompat.Slider_thumbElevation, BitmapDescriptorFactory.HUE_RED));
        setTrackHeight(typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.Slider_trackHeight, 0));
        setTickActiveRadius(typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.Slider_tickRadiusActive, 0));
        setTickInactiveRadius(typedArrayWrite.getDimensionPixelSize(calculateNextSearchBytePosition.MediaMetadataCompat.Slider_tickRadiusInactive, 0));
        setLabelBehavior(typedArrayWrite.getInt(calculateNextSearchBytePosition.MediaMetadataCompat.Slider_labelBehavior, 0));
        if (!typedArrayWrite.getBoolean(calculateNextSearchBytePosition.MediaMetadataCompat.Slider_android_enabled, true)) {
            setEnabled(false);
        }
        typedArrayWrite.recycle();
    }

    private boolean onFastForward() {
        int iMax = this.onSetCaptioningEnabled + Math.max(Math.max(Math.max(this.MediaSessionCompatQueueItem - this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, 0), Math.max((this._init_lambda3 - this.onCustomAction) / 2, 0)), Math.max(Math.max(this.MediaSessionCompatToken - this.onCommand, 0), Math.max(this.PlaybackStateCompat - this.handleMediaPlayPauseIfPendingOnHandler, 0)));
        if (this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 == iMax) {
            return false;
        }
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = iMax;
        if (!InvalidTypeIdException.onSeekTo(this)) {
            return true;
        }
        AudioAttributesImplBaseParcelizer(getWidth());
        return true;
    }

    private void onPrepareFromUri() {
        float f = this.accessgetReportFullyDrawnExecutorp;
        float f2 = this.accessaddObserverForBackInvoker;
        if (f >= f2) {
            throw new IllegalStateException(String.format("valueFrom(%s) must be smaller than valueTo(%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
    }

    private void onRemoveQueueItem() {
        float f = this.accessaddObserverForBackInvoker;
        float f2 = this.accessgetReportFullyDrawnExecutorp;
        if (f <= f2) {
            throw new IllegalStateException(String.format("valueTo(%s) must be greater than valueFrom(%s)", Float.valueOf(f), Float.valueOf(f2)));
        }
    }

    private boolean AudioAttributesImplApi21Parcelizer(float f) {
        return AudioAttributesCompatParcelizer(f - this.accessgetReportFullyDrawnExecutorp);
    }

    private boolean AudioAttributesCompatParcelizer(float f) {
        double dDoubleValue = new BigDecimal(Float.toString(f)).divide(new BigDecimal(Float.toString(this.onSkipToNext)), MathContext.DECIMAL64).doubleValue();
        return Math.abs(((double) Math.round(dDoubleValue)) - dDoubleValue) < 1.0E-4d;
    }

    private void onRewind() {
        if (this.onSkipToNext <= BitmapDescriptorFactory.HUE_RED || AudioAttributesImplApi21Parcelizer(this.accessaddObserverForBackInvoker)) {
            return;
        }
        throw new IllegalStateException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(this.onSkipToNext), Float.valueOf(this.accessgetReportFullyDrawnExecutorp), Float.valueOf(this.accessaddObserverForBackInvoker)));
    }

    private void onSetShuffleMode() {
        for (Float f : this._init_lambda5) {
            if (f.floatValue() < this.accessgetReportFullyDrawnExecutorp || f.floatValue() > this.accessaddObserverForBackInvoker) {
                throw new IllegalStateException(String.format("Slider value(%s) must be greater or equal to valueFrom(%s), and lower or equal to valueTo(%s)", f, Float.valueOf(this.accessgetReportFullyDrawnExecutorp), Float.valueOf(this.accessaddObserverForBackInvoker)));
            }
            if (this.onSkipToNext > BitmapDescriptorFactory.HUE_RED && !AudioAttributesImplApi21Parcelizer(f.floatValue())) {
                float f2 = this.accessgetReportFullyDrawnExecutorp;
                float f3 = this.onSkipToNext;
                throw new IllegalStateException(String.format("Value(%s) must be equal to valueFrom(%s) plus a multiple of stepSize(%s) when using stepSize(%s)", f, Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f3)));
            }
        }
    }

    private void onSeekTo() {
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (fRemoteActionCompatParcelizer < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal to 0", Float.valueOf(fRemoteActionCompatParcelizer)));
        }
        float f = this.onSkipToNext;
        if (f <= BitmapDescriptorFactory.HUE_RED || fRemoteActionCompatParcelizer <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        if (this.onStop != 1) {
            throw new IllegalStateException(String.format("minSeparation(%s) cannot be set as a dimension when using stepSize(%s)", Float.valueOf(fRemoteActionCompatParcelizer), Float.valueOf(f)));
        }
        if (fRemoteActionCompatParcelizer < f || !AudioAttributesCompatParcelizer(fRemoteActionCompatParcelizer)) {
            float f2 = this.onSkipToNext;
            throw new IllegalStateException(String.format("minSeparation(%s) must be greater or equal and a multiple of stepSize(%s) when using stepSize(%s)", Float.valueOf(fRemoteActionCompatParcelizer), Float.valueOf(f2), Float.valueOf(f2)));
        }
    }

    private void onSetCaptioningEnabled() {
        float f = this.onSkipToNext;
        if (f != BitmapDescriptorFactory.HUE_RED) {
            if (((int) f) != f) {
                new Object[]{"stepSize", Float.valueOf(f)};
            }
            float f2 = this.accessgetReportFullyDrawnExecutorp;
            if (((int) f2) != f2) {
                new Object[]{"valueFrom", Float.valueOf(f2)};
            }
            float f3 = this.accessaddObserverForBackInvoker;
            if (((int) f3) != f3) {
                new Object[]{"valueTo", Float.valueOf(f3)};
            }
        }
    }

    private void onRemoveQueueItemAt() {
        if (this.onAddQueueItem) {
            onPrepareFromUri();
            onRemoveQueueItem();
            onRewind();
            onSetShuffleMode();
            onSeekTo();
            onSetCaptioningEnabled();
            this.onAddQueueItem = false;
        }
    }

    public float AudioAttributesCompatParcelizer() {
        return this.accessgetReportFullyDrawnExecutorp;
    }

    public void setValueFrom(float f) {
        this.accessgetReportFullyDrawnExecutorp = f;
        this.onAddQueueItem = true;
        postInvalidate();
    }

    public float IconCompatParcelizer() {
        return this.accessaddObserverForBackInvoker;
    }

    public void setValueTo(float f) {
        this.accessaddObserverForBackInvoker = f;
        this.onAddQueueItem = true;
        postInvalidate();
    }

    List<Float> write() {
        return new ArrayList(this._init_lambda5);
    }

    void setValues(Float... fArr) {
        ArrayList<Float> arrayList = new ArrayList<>();
        Collections.addAll(arrayList, fArr);
        IconCompatParcelizer(arrayList);
    }

    void setValues(List<Float> list) {
        IconCompatParcelizer(new ArrayList<>(list));
    }

    private void IconCompatParcelizer(ArrayList<Float> arrayList) {
        if (arrayList.isEmpty()) {
            throw new IllegalArgumentException("At least one value must be set");
        }
        Collections.sort(arrayList);
        if (this._init_lambda5.size() == arrayList.size() && this._init_lambda5.equals(arrayList)) {
            return;
        }
        this._init_lambda5 = arrayList;
        this.onAddQueueItem = true;
        this.onPause = 0;
        onPrepareFromMediaId();
        MediaDescriptionCompat();
        MediaBrowserCompatSearchResultReceiver();
        postInvalidate();
    }

    private void MediaDescriptionCompat() {
        if (this.onRewind.size() > this._init_lambda5.size()) {
            List<readTagHeader> listSubList = this.onRewind.subList(this._init_lambda5.size(), this.onRewind.size());
            for (readTagHeader readtagheader : listSubList) {
                if (InvalidTypeIdException.onPlayFromSearch(this)) {
                    read(readtagheader);
                }
            }
            listSubList.clear();
        }
        while (this.onRewind.size() < this._init_lambda5.size()) {
            readTagHeader readtagheaderAudioAttributesCompatParcelizer = readTagHeader.AudioAttributesCompatParcelizer(getContext(), this.onPrepareFromUri);
            this.onRewind.add(readtagheaderAudioAttributesCompatParcelizer);
            if (InvalidTypeIdException.onPlayFromSearch(this)) {
                AudioAttributesCompatParcelizer(readtagheaderAudioAttributesCompatParcelizer);
            }
        }
        int i = this.onRewind.size() == 1 ? 0 : 1;
        Iterator<readTagHeader> it = this.onRewind.iterator();
        while (it.hasNext()) {
            it.next().onAddQueueItem(i);
        }
    }

    public void setStepSize(float f) {
        if (f < BitmapDescriptorFactory.HUE_RED) {
            throw new IllegalArgumentException(String.format("The stepSize(%s) must be 0, or a factor of the valueFrom(%s)-valueTo(%s) range", Float.valueOf(f), Float.valueOf(this.accessgetReportFullyDrawnExecutorp), Float.valueOf(this.accessaddObserverForBackInvoker)));
        }
        if (this.onSkipToNext != f) {
            this.onSkipToNext = f;
            this.onAddQueueItem = true;
            postInvalidate();
        }
    }

    void setCustomThumbDrawable(int i) {
        setCustomThumbDrawable(getResources().getDrawable(i));
    }

    void setCustomThumbDrawable(Drawable drawable) {
        this.MediaBrowserCompatSearchResultReceiver = AudioAttributesCompatParcelizer(drawable);
        this.MediaDescriptionCompat.clear();
        postInvalidate();
    }

    void setCustomThumbDrawablesForValues(int... iArr) {
        Drawable[] drawableArr = new Drawable[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            drawableArr[i] = getResources().getDrawable(iArr[i]);
        }
        setCustomThumbDrawablesForValues(drawableArr);
    }

    void setCustomThumbDrawablesForValues(Drawable... drawableArr) {
        this.MediaBrowserCompatSearchResultReceiver = null;
        this.MediaDescriptionCompat = new ArrayList();
        for (Drawable drawable : drawableArr) {
            this.MediaDescriptionCompat.add(AudioAttributesCompatParcelizer(drawable));
        }
        postInvalidate();
    }

    private Drawable AudioAttributesCompatParcelizer(Drawable drawable) {
        Drawable drawableNewDrawable = drawable.mutate().getConstantState().newDrawable();
        IconCompatParcelizer(drawableNewDrawable);
        return drawableNewDrawable;
    }

    private void IconCompatParcelizer(Drawable drawable) {
        int i = this.MediaSessionCompatQueueItem << 1;
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth == -1 && intrinsicHeight == -1) {
            drawable.setBounds(0, 0, i, i);
        } else {
            float fMax = i / Math.max(intrinsicWidth, intrinsicHeight);
            drawable.setBounds(0, 0, (int) (intrinsicWidth * fMax), (int) (intrinsicHeight * fMax));
        }
    }

    public void setFocusedThumbIndex(int i) {
        if (i < 0 || i >= this._init_lambda5.size()) {
            throw new IllegalArgumentException("index out of range");
        }
        this.onPause = i;
        this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(i);
        postInvalidate();
    }

    protected final void AudioAttributesImplApi26Parcelizer() {
        this.AudioAttributesImplApi21Parcelizer = 0;
    }

    public int read() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    public void write(L l) {
        this.MediaBrowserCompatMediaItem.add(l);
    }

    public boolean MediaBrowserCompatItemReceiver() {
        return this.onPlayFromMediaId != null;
    }

    public void setLabelFormatter(AviMainHeaderChunk aviMainHeaderChunk) {
        this.onPlayFromMediaId = aviMainHeaderChunk;
    }

    public void setThumbElevation(float f) {
        this.RatingCompat.handleMediaPlayPauseIfPendingOnHandler(f);
    }

    public void setThumbElevationResource(int i) {
        setThumbElevation(getResources().getDimension(i));
    }

    public void setThumbRadius(int i) {
        if (i == this.MediaSessionCompatQueueItem) {
            return;
        }
        this.MediaSessionCompatQueueItem = i;
        this.RatingCompat.setShapeAppearanceModel(isValidFrameType.RemoteActionCompatParcelizer().RemoteActionCompatParcelizer(this.MediaSessionCompatQueueItem).RemoteActionCompatParcelizer());
        frameSizeBytesByTypeNb framesizebytesbytypenb = this.RatingCompat;
        int i2 = this.MediaSessionCompatQueueItem << 1;
        framesizebytesbytypenb.setBounds(0, 0, i2, i2);
        Drawable drawable = this.MediaBrowserCompatSearchResultReceiver;
        if (drawable != null) {
            IconCompatParcelizer(drawable);
        }
        Iterator<Drawable> it = this.MediaDescriptionCompat.iterator();
        while (it.hasNext()) {
            IconCompatParcelizer(it.next());
        }
        onPrepare();
    }

    public void setThumbRadiusResource(int i) {
        setThumbRadius(getResources().getDimensionPixelSize(i));
    }

    public void setThumbStrokeColor(ColorStateList colorStateList) {
        this.RatingCompat.MediaBrowserCompatCustomActionResultReceiver(colorStateList);
        postInvalidate();
    }

    public void setThumbStrokeColorResource(int i) {
        if (i != 0) {
            setThumbStrokeColor(getDefaultViewModelCreationExtras.IconCompatParcelizer(getContext(), i));
        }
    }

    public void setThumbStrokeWidth(float f) {
        this.RatingCompat.onAddQueueItem(f);
        postInvalidate();
    }

    public void setThumbStrokeWidthResource(int i) {
        if (i != 0) {
            setThumbStrokeWidth(getResources().getDimension(i));
        }
    }

    public void setHaloRadius(int i) {
        if (i == this.onPrepareFromSearch) {
            return;
        }
        this.onPrepareFromSearch = i;
        Drawable background = getBackground();
        if (!onPlayFromUri() && (background instanceof RippleDrawable)) {
            DefaultExtractorsFactoryExtensionLoader.RemoteActionCompatParcelizer((RippleDrawable) background, this.onPrepareFromSearch);
        } else {
            postInvalidate();
        }
    }

    public void setHaloRadiusResource(int i) {
        setHaloRadius(getResources().getDimensionPixelSize(i));
    }

    public void setLabelBehavior(int i) {
        if (this.onPlayFromSearch != i) {
            this.onPlayFromSearch = i;
            requestLayout();
        }
    }

    private boolean onPlayFromSearch() {
        return this.onPlayFromSearch == 3;
    }

    public void setTrackHeight(int i) {
        if (this._init_lambda3 != i) {
            this._init_lambda3 = i;
            MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
            onPrepare();
        }
    }

    public void setTickActiveRadius(int i) {
        if (this.MediaSessionCompatToken != i) {
            this.MediaSessionCompatToken = i;
            this.AudioAttributesImplApi26Parcelizer.setStrokeWidth(i << 1);
            onPrepare();
        }
    }

    public void setTickInactiveRadius(int i) {
        if (this.PlaybackStateCompat != i) {
            this.PlaybackStateCompat = i;
            this.onPlayFromUri.setStrokeWidth(i << 1);
            onPrepare();
        }
    }

    private void onPrepare() {
        boolean zOnMediaButtonEvent = onMediaButtonEvent();
        boolean zOnFastForward = onFastForward();
        if (zOnMediaButtonEvent) {
            requestLayout();
        } else if (zOnFastForward) {
            postInvalidate();
        }
    }

    private boolean onMediaButtonEvent() {
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i = this._init_lambda3;
        int i2 = this.MediaSessionCompatQueueItem;
        int paddingTop2 = getPaddingTop();
        int iMax = Math.max(this.onSetRating, Math.max(i + paddingTop + paddingBottom, (i2 << 1) + paddingTop2 + getPaddingBottom()));
        if (iMax == this.accessensureViewModelStore) {
            return false;
        }
        this.accessensureViewModelStore = iMax;
        return true;
    }

    public void setHaloTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.onFastForward)) {
            return;
        }
        this.onFastForward = colorStateList;
        Drawable background = getBackground();
        if (!onPlayFromUri() && (background instanceof RippleDrawable)) {
            ((RippleDrawable) background).setColor(colorStateList);
            return;
        }
        this.onMediaButtonEvent.setColor(AudioAttributesCompatParcelizer(colorStateList));
        this.onMediaButtonEvent.setAlpha(63);
        invalidate();
    }

    public void setThumbTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.RatingCompat.onPlay())) {
            return;
        }
        this.RatingCompat.AudioAttributesImplApi21Parcelizer(colorStateList);
        invalidate();
    }

    public void setTickTintList(ColorStateList colorStateList) {
        setTickInactiveTintList(colorStateList);
        setTickActiveTintList(colorStateList);
    }

    public void setTickActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.MediaSessionCompatResultReceiverWrapper)) {
            return;
        }
        this.MediaSessionCompatResultReceiverWrapper = colorStateList;
        this.AudioAttributesImplApi26Parcelizer.setColor(AudioAttributesCompatParcelizer(colorStateList));
        invalidate();
    }

    public void setTickInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.ParcelableVolumeInfo)) {
            return;
        }
        this.ParcelableVolumeInfo = colorStateList;
        this.onPlayFromUri.setColor(AudioAttributesCompatParcelizer(colorStateList));
        invalidate();
    }

    public void setTickVisible(boolean z) {
        if (this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM != z) {
            this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = z;
            postInvalidate();
        }
    }

    public void setTrackTintList(ColorStateList colorStateList) {
        setTrackInactiveTintList(colorStateList);
        setTrackActiveTintList(colorStateList);
    }

    public void setTrackActiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28)) {
            return;
        }
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = colorStateList;
        this.MediaMetadataCompat.setColor(AudioAttributesCompatParcelizer(colorStateList));
        invalidate();
    }

    public void setTrackInactiveTintList(ColorStateList colorStateList) {
        if (colorStateList.equals(this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0)) {
            return;
        }
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = colorStateList;
        this.onPrepare.setColor(AudioAttributesCompatParcelizer(colorStateList));
        invalidate();
    }

    @Override // android.view.View
    protected void onVisibilityChanged(View view, int i) {
        getFrameStartMarker getframestartmarker;
        super.onVisibilityChanged(view, i);
        if (i == 0 || (getframestartmarker = checkAndPeekStreamMarker.read(this)) == null) {
            return;
        }
        Iterator<readTagHeader> it = this.onRewind.iterator();
        while (it.hasNext()) {
            getframestartmarker.IconCompatParcelizer(it.next());
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        setLayerType(z ? 0 : 2, null);
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Iterator<readTagHeader> it = this.onRewind.iterator();
        while (it.hasNext()) {
            AudioAttributesCompatParcelizer(it.next());
        }
    }

    private void AudioAttributesCompatParcelizer(readTagHeader readtagheader) {
        readtagheader.IconCompatParcelizer(checkAndPeekStreamMarker.AudioAttributesCompatParcelizer(this));
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        BaseSlider<S, L, T>.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesImplBaseParcelizer;
        if (audioAttributesCompatParcelizer != null) {
            removeCallbacks(audioAttributesCompatParcelizer);
        }
        this.onRemoveQueueItemAt = false;
        Iterator<readTagHeader> it = this.onRewind.iterator();
        while (it.hasNext()) {
            read(it.next());
        }
        super.onDetachedFromWindow();
    }

    private void read(readTagHeader readtagheader) {
        getFrameStartMarker getframestartmarker = checkAndPeekStreamMarker.read(this);
        if (getframestartmarker != null) {
            getframestartmarker.IconCompatParcelizer(readtagheader);
            readtagheader.RemoteActionCompatParcelizer(checkAndPeekStreamMarker.AudioAttributesCompatParcelizer(this));
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(this.accessensureViewModelStore + ((this.onPlayFromSearch == 1 || onPlayFromSearch()) ? this.onRewind.get(0).getIntrinsicHeight() : 0), 1073741824));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        AudioAttributesImplBaseParcelizer(i);
        onPrepareFromMediaId();
    }

    private void onPause() {
        if (this.onSkipToNext > BitmapDescriptorFactory.HUE_RED) {
            onRemoveQueueItemAt();
            int iMin = Math.min((int) (((this.accessaddObserverForBackInvoker - this.accessgetReportFullyDrawnExecutorp) / this.onSkipToNext) + 1.0f), (this._init_lambda2 / (this._init_lambda3 << 1)) + 1);
            float[] fArr = this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
            if (fArr == null || fArr.length != (iMin << 1)) {
                this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = new float[iMin << 1];
            }
            float f = this._init_lambda2 / (iMin - 1);
            for (int i = 0; i < (iMin << 1); i += 2) {
                float[] fArr2 = this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
                fArr2[i] = this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 + ((i / 2.0f) * f);
                fArr2[i + 1] = MediaBrowserCompatMediaItem();
            }
        }
    }

    private void AudioAttributesImplBaseParcelizer(int i) {
        this._init_lambda2 = Math.max(i - (this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 << 1), 0);
        onPause();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void onPrepareFromMediaId() {
        if (onPlayFromUri() || getMeasuredWidth() <= 0) {
            return;
        }
        Drawable background = getBackground();
        if (background instanceof RippleDrawable) {
            int iRemoteActionCompatParcelizer = (int) ((RemoteActionCompatParcelizer(this._init_lambda5.get(this.onPause).floatValue()) * this._init_lambda2) + this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8);
            int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
            int i = this.onPrepareFromSearch;
            findFormatOverrides.write(background, iRemoteActionCompatParcelizer - i, iMediaBrowserCompatMediaItem - i, iRemoteActionCompatParcelizer + i, iMediaBrowserCompatMediaItem + i);
        }
    }

    private int MediaBrowserCompatMediaItem() {
        return (this.accessensureViewModelStore / 2) + ((this.onPlayFromSearch == 1 || onPlayFromSearch()) ? this.onRewind.get(0).getIntrinsicHeight() : 0);
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        if (this.onAddQueueItem) {
            onRemoveQueueItemAt();
            onPause();
        }
        super.onDraw(canvas);
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        RemoteActionCompatParcelizer(canvas, this._init_lambda2, iMediaBrowserCompatMediaItem);
        if (((Float) Collections.max(write())).floatValue() > this.accessgetReportFullyDrawnExecutorp) {
            AudioAttributesCompatParcelizer(canvas, this._init_lambda2, iMediaBrowserCompatMediaItem);
        }
        read(canvas);
        if ((this.onSkipToQueueItem || isFocused()) && isEnabled()) {
            write(canvas, this._init_lambda2, iMediaBrowserCompatMediaItem);
        }
        if ((this.AudioAttributesImplApi21Parcelizer != -1 || onPlayFromSearch()) && isEnabled()) {
            MediaMetadataCompat();
        } else {
            RatingCompat();
        }
        IconCompatParcelizer(canvas, this._init_lambda2, iMediaBrowserCompatMediaItem);
    }

    private float[] handleMediaPlayPauseIfPendingOnHandler() {
        float fFloatValue = ((Float) Collections.max(write())).floatValue();
        float fFloatValue2 = ((Float) Collections.min(write())).floatValue();
        if (this._init_lambda5.size() == 1) {
            fFloatValue2 = this.accessgetReportFullyDrawnExecutorp;
        }
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(fFloatValue2);
        float fRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(fFloatValue);
        return MediaBrowserCompatCustomActionResultReceiver() ? new float[]{fRemoteActionCompatParcelizer2, fRemoteActionCompatParcelizer} : new float[]{fRemoteActionCompatParcelizer, fRemoteActionCompatParcelizer2};
    }

    private void RemoteActionCompatParcelizer(Canvas canvas, int i, int i2) {
        float[] fArrHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
        int i3 = this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
        float f = i;
        float f2 = i3 + (fArrHandleMediaPlayPauseIfPendingOnHandler[1] * f);
        float f3 = i3 + i;
        if (f2 < f3) {
            float f4 = i2;
            canvas.drawLine(f2, f4, f3, f4, this.onPrepare);
        }
        float f5 = this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
        float f6 = f5 + (fArrHandleMediaPlayPauseIfPendingOnHandler[0] * f);
        if (f6 > f5) {
            float f7 = i2;
            canvas.drawLine(f5, f7, f6, f7, this.onPrepare);
        }
    }

    private float RemoteActionCompatParcelizer(float f) {
        float f2 = this.accessgetReportFullyDrawnExecutorp;
        float f3 = (f - f2) / (this.accessaddObserverForBackInvoker - f2);
        return MediaBrowserCompatCustomActionResultReceiver() ? 1.0f - f3 : f3;
    }

    private void AudioAttributesCompatParcelizer(Canvas canvas, int i, int i2) {
        float[] fArrHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
        float f = this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
        float f2 = i;
        float f3 = i2;
        canvas.drawLine(f + (fArrHandleMediaPlayPauseIfPendingOnHandler[0] * f2), f3, f + (fArrHandleMediaPlayPauseIfPendingOnHandler[1] * f2), f3, this.MediaMetadataCompat);
    }

    private void read(Canvas canvas) {
        if (!this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM || this.onSkipToNext <= BitmapDescriptorFactory.HUE_RED) {
            return;
        }
        float[] fArrHandleMediaPlayPauseIfPendingOnHandler = handleMediaPlayPauseIfPendingOnHandler();
        int iWrite = write(this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, fArrHandleMediaPlayPauseIfPendingOnHandler[0]);
        int iWrite2 = write(this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, fArrHandleMediaPlayPauseIfPendingOnHandler[1]);
        int i = iWrite << 1;
        canvas.drawPoints(this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, 0, i, this.onPlayFromUri);
        int i2 = iWrite2 << 1;
        canvas.drawPoints(this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, i, i2 - i, this.AudioAttributesImplApi26Parcelizer);
        float[] fArr = this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
        canvas.drawPoints(fArr, i2, fArr.length - i2, this.onPlayFromUri);
    }

    private void IconCompatParcelizer(Canvas canvas, int i, int i2) {
        for (int i3 = 0; i3 < this._init_lambda5.size(); i3++) {
            float fFloatValue = this._init_lambda5.get(i3).floatValue();
            Drawable drawable = this.MediaBrowserCompatSearchResultReceiver;
            if (drawable != null) {
                read(canvas, i, i2, fFloatValue, drawable);
            } else if (i3 < this.MediaDescriptionCompat.size()) {
                read(canvas, i, i2, fFloatValue, this.MediaDescriptionCompat.get(i3));
            } else {
                if (!isEnabled()) {
                    canvas.drawCircle(this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 + (RemoteActionCompatParcelizer(fFloatValue) * i), i2, this.MediaSessionCompatQueueItem, this.onSkipToPrevious);
                }
                read(canvas, i, i2, fFloatValue, this.RatingCompat);
            }
        }
    }

    private void read(Canvas canvas, int i, int i2, float f, Drawable drawable) {
        canvas.save();
        canvas.translate((this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 + ((int) (RemoteActionCompatParcelizer(f) * i))) - (drawable.getBounds().width() / 2.0f), i2 - (drawable.getBounds().height() / 2.0f));
        drawable.draw(canvas);
        canvas.restore();
    }

    private void write(Canvas canvas, int i, int i2) {
        if (onPlayFromUri()) {
            canvas.drawCircle((int) (this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 + (RemoteActionCompatParcelizer(this._init_lambda5.get(this.onPause).floatValue()) * i)), i2, this.onPrepareFromSearch, this.onMediaButtonEvent);
        }
    }

    private boolean onPlayFromUri() {
        return !(getBackground() instanceof RippleDrawable);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x006d  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r6) {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.slider.BaseSlider.onTouchEvent(android.view.MotionEvent):boolean");
    }

    private static int write(float[] fArr, float f) {
        return Math.round(f * ((fArr.length / 2) - 1));
    }

    private double AudioAttributesImplApi26Parcelizer(float f) {
        float f2 = this.onSkipToNext;
        if (f2 <= BitmapDescriptorFactory.HUE_RED) {
            return f;
        }
        int i = (int) ((this.accessaddObserverForBackInvoker - this.accessgetReportFullyDrawnExecutorp) / f2);
        return ((double) Math.round(f * i)) / ((double) i);
    }

    protected boolean AudioAttributesImplApi21Parcelizer() {
        if (this.AudioAttributesImplApi21Parcelizer != -1) {
            return true;
        }
        float fOnCommand = onCommand();
        float fMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(fOnCommand);
        this.AudioAttributesImplApi21Parcelizer = 0;
        float fAbs = Math.abs(this._init_lambda5.get(0).floatValue() - fOnCommand);
        for (int i = 1; i < this._init_lambda5.size(); i++) {
            float fAbs2 = Math.abs(this._init_lambda5.get(i).floatValue() - fOnCommand);
            float fMediaBrowserCompatCustomActionResultReceiver2 = MediaBrowserCompatCustomActionResultReceiver(this._init_lambda5.get(i).floatValue());
            if (Float.compare(fAbs2, fAbs) > 1) {
                break;
            }
            boolean z = !MediaBrowserCompatCustomActionResultReceiver() ? fMediaBrowserCompatCustomActionResultReceiver2 - fMediaBrowserCompatCustomActionResultReceiver >= BitmapDescriptorFactory.HUE_RED : fMediaBrowserCompatCustomActionResultReceiver2 - fMediaBrowserCompatCustomActionResultReceiver <= BitmapDescriptorFactory.HUE_RED;
            if (Float.compare(fAbs2, fAbs) < 0) {
                this.AudioAttributesImplApi21Parcelizer = i;
            } else {
                if (Float.compare(fAbs2, fAbs) != 0) {
                    continue;
                } else {
                    if (Math.abs(fMediaBrowserCompatCustomActionResultReceiver2 - fMediaBrowserCompatCustomActionResultReceiver) < this.setSessionImpl) {
                        this.AudioAttributesImplApi21Parcelizer = -1;
                        return false;
                    }
                    if (z) {
                        this.AudioAttributesImplApi21Parcelizer = i;
                    }
                }
            }
            fAbs = fAbs2;
        }
        return this.AudioAttributesImplApi21Parcelizer != -1;
    }

    private float onCommand() {
        float f = this.PlaybackStateCompatCustomAction;
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            f = 1.0f - f;
        }
        float f2 = this.accessaddObserverForBackInvoker;
        float f3 = this.accessgetReportFullyDrawnExecutorp;
        return (f * (f2 - f3)) + f3;
    }

    private boolean onPrepareFromSearch() {
        return write(onAddQueueItem());
    }

    private boolean write(float f) {
        return IconCompatParcelizer(this.AudioAttributesImplApi21Parcelizer, f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean IconCompatParcelizer(int i, float f) {
        this.onPause = i;
        if (Math.abs(f - this._init_lambda5.get(i).floatValue()) < 1.0E-4d) {
            return false;
        }
        this._init_lambda5.set(i, Float.valueOf(write(i, f)));
        write(i);
        return true;
    }

    private float write(int i, float f) {
        float fRemoteActionCompatParcelizer = RemoteActionCompatParcelizer();
        if (this.onStop == 0) {
            fRemoteActionCompatParcelizer = IconCompatParcelizer(fRemoteActionCompatParcelizer);
        }
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            fRemoteActionCompatParcelizer = -fRemoteActionCompatParcelizer;
        }
        int i2 = i + 1;
        int i3 = i - 1;
        return StdKeyDeserializer.write(f, i3 < 0 ? this.accessgetReportFullyDrawnExecutorp : this._init_lambda5.get(i3).floatValue() + fRemoteActionCompatParcelizer, i2 >= this._init_lambda5.size() ? this.accessaddObserverForBackInvoker : this._init_lambda5.get(i2).floatValue() - fRemoteActionCompatParcelizer);
    }

    private float IconCompatParcelizer(float f) {
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return BitmapDescriptorFactory.HUE_RED;
        }
        float f2 = (f - this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8) / this._init_lambda2;
        float f3 = this.accessgetReportFullyDrawnExecutorp;
        return (f2 * (f3 - this.accessaddObserverForBackInvoker)) + f3;
    }

    protected final void IconCompatParcelizer(int i) {
        this.onStop = i;
        this.onAddQueueItem = true;
        postInvalidate();
    }

    private float onAddQueueItem() {
        double dAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(this.PlaybackStateCompatCustomAction);
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            dAudioAttributesImplApi26Parcelizer = 1.0d - dAudioAttributesImplApi26Parcelizer;
        }
        float f = this.accessaddObserverForBackInvoker;
        float f2 = this.accessgetReportFullyDrawnExecutorp;
        return (float) ((dAudioAttributesImplApi26Parcelizer * ((double) (f - f2))) + ((double) f2));
    }

    private float MediaBrowserCompatCustomActionResultReceiver(float f) {
        return (RemoteActionCompatParcelizer(f) * this._init_lambda2) + this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    }

    private static float AudioAttributesCompatParcelizer(ValueAnimator valueAnimator, float f) {
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            return f;
        }
        float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        valueAnimator.cancel();
        return fFloatValue;
    }

    private ValueAnimator RemoteActionCompatParcelizer(boolean z) {
        int iWrite;
        TimeInterpolator timeInterpolator;
        float f = BitmapDescriptorFactory.HUE_RED;
        float fAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(z ? this.onSetShuffleMode : this.onSeekTo, z ? 0.0f : 1.0f);
        if (z) {
            f = 1.0f;
        }
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fAudioAttributesCompatParcelizer, f);
        if (z) {
            iWrite = getSampleRateLookupKey.write(getContext(), write, 83);
            timeInterpolator = getSampleRateLookupKey.read(getContext(), IconCompatParcelizer, BinarySearchSeekerSeekOperationParams.read);
        } else {
            iWrite = getSampleRateLookupKey.write(getContext(), read, 117);
            timeInterpolator = getSampleRateLookupKey.read(getContext(), AudioAttributesCompatParcelizer, BinarySearchSeekerSeekOperationParams.IconCompatParcelizer);
        }
        valueAnimatorOfFloat.setDuration(iWrite);
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.slider.BaseSlider.2
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                Iterator it = BaseSlider.this.onRewind.iterator();
                while (it.hasNext()) {
                    ((readTagHeader) it.next()).IconCompatParcelizer(fFloatValue);
                }
                InvalidTypeIdException.onRemoveQueueItem(BaseSlider.this);
            }
        });
        return valueAnimatorOfFloat;
    }

    private void RatingCompat() {
        if (this.onRemoveQueueItemAt) {
            this.onRemoveQueueItemAt = false;
            ValueAnimator valueAnimatorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(false);
            this.onSetShuffleMode = valueAnimatorRemoteActionCompatParcelizer;
            this.onSeekTo = null;
            valueAnimatorRemoteActionCompatParcelizer.addListener(new AnimatorListenerAdapter() { // from class: com.google.android.material.slider.BaseSlider.1
                @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
                public final void onAnimationEnd(Animator animator) {
                    super.onAnimationEnd(animator);
                    getFrameStartMarker getframestartmarker = checkAndPeekStreamMarker.read(BaseSlider.this);
                    Iterator it = BaseSlider.this.onRewind.iterator();
                    while (it.hasNext()) {
                        getframestartmarker.IconCompatParcelizer((readTagHeader) it.next());
                    }
                }
            });
            this.onSetShuffleMode.start();
        }
    }

    private void MediaMetadataCompat() {
        if (this.onPlayFromSearch == 2) {
            return;
        }
        if (!this.onRemoveQueueItemAt) {
            this.onRemoveQueueItemAt = true;
            ValueAnimator valueAnimatorRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(true);
            this.onSeekTo = valueAnimatorRemoteActionCompatParcelizer;
            this.onSetShuffleMode = null;
            valueAnimatorRemoteActionCompatParcelizer.start();
        }
        Iterator<readTagHeader> it = this.onRewind.iterator();
        for (int i = 0; i < this._init_lambda5.size() && it.hasNext(); i++) {
            if (i != this.onPause) {
                read(it.next(), this._init_lambda5.get(i).floatValue());
            }
        }
        if (!it.hasNext()) {
            throw new IllegalStateException(String.format("Not enough labels(%d) to display all the values(%d)", Integer.valueOf(this.onRewind.size()), Integer.valueOf(this._init_lambda5.size())));
        }
        read(it.next(), this._init_lambda5.get(this.onPause).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public String read(float f) {
        if (MediaBrowserCompatItemReceiver()) {
            return this.onPlayFromMediaId.IconCompatParcelizer();
        }
        return String.format(((float) ((int) f)) == f ? "%.0f" : "%.2f", Float.valueOf(f));
    }

    private void read(readTagHeader readtagheader, float f) {
        readtagheader.AudioAttributesCompatParcelizer(read(f));
        int iRemoteActionCompatParcelizer = (this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 + ((int) (RemoteActionCompatParcelizer(f) * this._init_lambda2))) - (readtagheader.getIntrinsicWidth() / 2);
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem() - (this.onRemoveQueueItem + this.MediaSessionCompatQueueItem);
        readtagheader.setBounds(iRemoteActionCompatParcelizer, iMediaBrowserCompatMediaItem - readtagheader.getIntrinsicHeight(), readtagheader.getIntrinsicWidth() + iRemoteActionCompatParcelizer, iMediaBrowserCompatMediaItem);
        Rect rect = new Rect(readtagheader.getBounds());
        ExtractorOutput.read(checkAndPeekStreamMarker.AudioAttributesCompatParcelizer(this), this, rect);
        readtagheader.setBounds(rect);
        checkAndPeekStreamMarker.read(this).RemoteActionCompatParcelizer(readtagheader);
    }

    private void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        this.onPrepare.setStrokeWidth(this._init_lambda3);
        this.MediaMetadataCompat.setStrokeWidth(this._init_lambda3);
    }

    private boolean onCustomAction() {
        for (ViewParent parent = getParent(); parent instanceof ViewGroup; parent = parent.getParent()) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if ((viewGroup.canScrollVertically(1) || viewGroup.canScrollVertically(-1)) && viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
        }
        return false;
    }

    private static boolean RemoteActionCompatParcelizer(MotionEvent motionEvent) {
        return motionEvent.getToolType(0) == 3;
    }

    private boolean IconCompatParcelizer(MotionEvent motionEvent) {
        return !RemoteActionCompatParcelizer(motionEvent) && onCustomAction();
    }

    private void MediaBrowserCompatSearchResultReceiver() {
        for (L l : this.MediaBrowserCompatMediaItem) {
            Iterator<Float> it = this._init_lambda5.iterator();
            while (it.hasNext()) {
                l.AudioAttributesCompatParcelizer(this, it.next().floatValue(), false);
            }
        }
    }

    private void write(int i) {
        Iterator<L> it = this.MediaBrowserCompatMediaItem.iterator();
        while (it.hasNext()) {
            it.next().AudioAttributesCompatParcelizer(this, this._init_lambda5.get(i).floatValue(), true);
        }
        AccessibilityManager accessibilityManager = this.MediaBrowserCompatCustomActionResultReceiver;
        if (accessibilityManager == null || !accessibilityManager.isEnabled()) {
            return;
        }
        AudioAttributesImplApi21Parcelizer(i);
    }

    private void onPlay() {
        for (T t : this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4) {
        }
    }

    private void onPlayFromMediaId() {
        for (T t : this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4) {
        }
    }

    @Override // android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        this.onPrepare.setColor(AudioAttributesCompatParcelizer(this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0));
        this.MediaMetadataCompat.setColor(AudioAttributesCompatParcelizer(this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28));
        this.onPlayFromUri.setColor(AudioAttributesCompatParcelizer(this.ParcelableVolumeInfo));
        this.AudioAttributesImplApi26Parcelizer.setColor(AudioAttributesCompatParcelizer(this.MediaSessionCompatResultReceiverWrapper));
        for (readTagHeader readtagheader : this.onRewind) {
            if (readtagheader.isStateful()) {
                readtagheader.setState(getDrawableState());
            }
        }
        if (this.RatingCompat.isStateful()) {
            this.RatingCompat.setState(getDrawableState());
        }
        this.onMediaButtonEvent.setColor(AudioAttributesCompatParcelizer(this.onFastForward));
        this.onMediaButtonEvent.setAlpha(63);
    }

    private int AudioAttributesCompatParcelizer(ColorStateList colorStateList) {
        return colorStateList.getColorForState(getDrawableState(), colorStateList.getDefaultColor());
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        if (!isEnabled()) {
            return super.onKeyDown(i, keyEvent);
        }
        if (this._init_lambda5.size() == 1) {
            this.AudioAttributesImplApi21Parcelizer = 0;
        }
        if (this.AudioAttributesImplApi21Parcelizer == -1) {
            Boolean boolRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(i, keyEvent);
            return boolRemoteActionCompatParcelizer != null ? boolRemoteActionCompatParcelizer.booleanValue() : super.onKeyDown(i, keyEvent);
        }
        this.onPrepareFromMediaId |= keyEvent.isLongPress();
        Float f = read(i);
        if (f != null) {
            if (write(this._init_lambda5.get(this.AudioAttributesImplApi21Parcelizer).floatValue() + f.floatValue())) {
                onPrepareFromMediaId();
                postInvalidate();
            }
            return true;
        }
        if (i != 23) {
            if (i == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return MediaBrowserCompatCustomActionResultReceiver(1);
                }
                if (keyEvent.isShiftPressed()) {
                    return MediaBrowserCompatCustomActionResultReceiver(-1);
                }
                return false;
            }
            if (i != 66) {
                return super.onKeyDown(i, keyEvent);
            }
        }
        this.AudioAttributesImplApi21Parcelizer = -1;
        postInvalidate();
        return true;
    }

    private Boolean RemoteActionCompatParcelizer(int i, KeyEvent keyEvent) {
        Boolean bool = Boolean.TRUE;
        if (i == 61) {
            if (keyEvent.hasNoModifiers()) {
                return Boolean.valueOf(MediaBrowserCompatCustomActionResultReceiver(1));
            }
            if (keyEvent.isShiftPressed()) {
                return Boolean.valueOf(MediaBrowserCompatCustomActionResultReceiver(-1));
            }
            return Boolean.FALSE;
        }
        if (i != 66) {
            if (i != 81) {
                if (i == 69) {
                    MediaBrowserCompatCustomActionResultReceiver(-1);
                    return bool;
                }
                if (i != 70) {
                    switch (i) {
                        case 21:
                            MediaBrowserCompatItemReceiver(-1);
                            break;
                        case 22:
                            MediaBrowserCompatItemReceiver(1);
                            break;
                    }
                    return bool;
                }
            }
            MediaBrowserCompatCustomActionResultReceiver(1);
            return bool;
        }
        this.AudioAttributesImplApi21Parcelizer = this.onPause;
        postInvalidate();
        return bool;
    }

    @Override // android.view.View, android.view.KeyEvent.Callback
    public boolean onKeyUp(int i, KeyEvent keyEvent) {
        this.onPrepareFromMediaId = false;
        return super.onKeyUp(i, keyEvent);
    }

    final boolean MediaBrowserCompatCustomActionResultReceiver() {
        return InvalidTypeIdException.MediaBrowserCompatMediaItem(this) == 1;
    }

    private boolean MediaBrowserCompatCustomActionResultReceiver(int i) {
        int i2 = this.onPause;
        int iAudioAttributesCompatParcelizer = (int) StdKeyDeserializer.AudioAttributesCompatParcelizer(((long) i2) + ((long) i), this._init_lambda5.size() - 1);
        this.onPause = iAudioAttributesCompatParcelizer;
        if (iAudioAttributesCompatParcelizer == i2) {
            return false;
        }
        if (this.AudioAttributesImplApi21Parcelizer != -1) {
            this.AudioAttributesImplApi21Parcelizer = iAudioAttributesCompatParcelizer;
        }
        onPrepareFromMediaId();
        postInvalidate();
        return true;
    }

    private boolean MediaBrowserCompatItemReceiver(int i) {
        if (MediaBrowserCompatCustomActionResultReceiver()) {
            i = i == Integer.MIN_VALUE ? Integer.MAX_VALUE : -i;
        }
        return MediaBrowserCompatCustomActionResultReceiver(i);
    }

    private Float read(int i) {
        float fAudioAttributesCompatParcelizer = this.onPrepareFromMediaId ? AudioAttributesCompatParcelizer(20) : AudioAttributesImplBaseParcelizer();
        if (i == 21) {
            if (!MediaBrowserCompatCustomActionResultReceiver()) {
                fAudioAttributesCompatParcelizer = -fAudioAttributesCompatParcelizer;
            }
            return Float.valueOf(fAudioAttributesCompatParcelizer);
        }
        if (i == 22) {
            if (MediaBrowserCompatCustomActionResultReceiver()) {
                fAudioAttributesCompatParcelizer = -fAudioAttributesCompatParcelizer;
            }
            return Float.valueOf(fAudioAttributesCompatParcelizer);
        }
        if (i == 69) {
            return Float.valueOf(-fAudioAttributesCompatParcelizer);
        }
        if (i == 70 || i == 81) {
            return Float.valueOf(fAudioAttributesCompatParcelizer);
        }
        return null;
    }

    private float AudioAttributesImplBaseParcelizer() {
        float f = this.onSkipToNext;
        if (f == BitmapDescriptorFactory.HUE_RED) {
            return 1.0f;
        }
        return f;
    }

    private float AudioAttributesCompatParcelizer(int i) {
        float fAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer();
        return (this.accessaddObserverForBackInvoker - this.accessgetReportFullyDrawnExecutorp) / fAudioAttributesImplBaseParcelizer <= 20.0f ? fAudioAttributesImplBaseParcelizer : Math.round(r0 / 20.0f) * fAudioAttributesImplBaseParcelizer;
    }

    @Override // android.view.View
    protected void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        if (!z) {
            this.AudioAttributesImplApi21Parcelizer = -1;
            this.MediaBrowserCompatItemReceiver.read(this.onPause);
        } else {
            RemoteActionCompatParcelizer(i);
            this.MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(this.onPause);
        }
    }

    private void RemoteActionCompatParcelizer(int i) {
        if (i == 1) {
            MediaBrowserCompatCustomActionResultReceiver(Integer.MAX_VALUE);
            return;
        }
        if (i == 2) {
            MediaBrowserCompatCustomActionResultReceiver(Integer.MIN_VALUE);
        } else if (i == 17) {
            MediaBrowserCompatItemReceiver(Integer.MAX_VALUE);
        } else {
            if (i != 66) {
                return;
            }
            MediaBrowserCompatItemReceiver(Integer.MIN_VALUE);
        }
    }

    @Override // android.view.View
    public CharSequence getAccessibilityClassName() {
        return SeekBar.class.getName();
    }

    @Override // android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        return this.MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(motionEvent) || super.dispatchHoverEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    private void AudioAttributesImplApi21Parcelizer(int i) {
        BaseSlider<S, L, T>.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.AudioAttributesImplBaseParcelizer;
        if (audioAttributesCompatParcelizer == null) {
            this.AudioAttributesImplBaseParcelizer = new AudioAttributesCompatParcelizer(this, (byte) 0);
        } else {
            removeCallbacks(audioAttributesCompatParcelizer);
        }
        this.AudioAttributesImplBaseParcelizer.RemoteActionCompatParcelizer(i);
        postDelayed(this.AudioAttributesImplBaseParcelizer, 200L);
    }

    class AudioAttributesCompatParcelizer implements Runnable {
        private int read;

        private AudioAttributesCompatParcelizer() {
            this.read = -1;
        }

        /* synthetic */ AudioAttributesCompatParcelizer(BaseSlider baseSlider, byte b) {
            this();
        }

        final void RemoteActionCompatParcelizer(int i) {
            this.read = i;
        }

        @Override // java.lang.Runnable
        public final void run() {
            BaseSlider.this.MediaBrowserCompatItemReceiver.write(this.read, 4);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SliderState sliderState = new SliderState(super.onSaveInstanceState());
        sliderState.read = this.accessgetReportFullyDrawnExecutorp;
        sliderState.write = this.accessaddObserverForBackInvoker;
        sliderState.AudioAttributesCompatParcelizer = new ArrayList<>(this._init_lambda5);
        sliderState.RemoteActionCompatParcelizer = this.onSkipToNext;
        sliderState.IconCompatParcelizer = hasFocus();
        return sliderState;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        SliderState sliderState = (SliderState) parcelable;
        super.onRestoreInstanceState(sliderState.getSuperState());
        this.accessgetReportFullyDrawnExecutorp = sliderState.read;
        this.accessaddObserverForBackInvoker = sliderState.write;
        IconCompatParcelizer(sliderState.AudioAttributesCompatParcelizer);
        this.onSkipToNext = sliderState.RemoteActionCompatParcelizer;
        if (sliderState.IconCompatParcelizer) {
            requestFocus();
        }
    }

    static class SliderState extends View.BaseSavedState {
        public static final Parcelable.Creator<SliderState> CREATOR = new Parcelable.Creator<SliderState>() { // from class: com.google.android.material.slider.BaseSlider.SliderState.4
            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SliderState createFromParcel(Parcel parcel) {
                return AudioAttributesCompatParcelizer(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final /* synthetic */ SliderState[] newArray(int i) {
                return AudioAttributesCompatParcelizer(i);
            }

            private static SliderState AudioAttributesCompatParcelizer(Parcel parcel) {
                return new SliderState(parcel, (byte) 0);
            }

            private static SliderState[] AudioAttributesCompatParcelizer(int i) {
                return new SliderState[i];
            }
        };
        ArrayList<Float> AudioAttributesCompatParcelizer;
        boolean IconCompatParcelizer;
        float RemoteActionCompatParcelizer;
        float read;
        float write;

        /* synthetic */ SliderState(Parcel parcel, byte b) {
            this(parcel);
        }

        SliderState(Parcelable parcelable) {
            super(parcelable);
        }

        private SliderState(Parcel parcel) {
            super(parcel);
            this.read = parcel.readFloat();
            this.write = parcel.readFloat();
            ArrayList<Float> arrayList = new ArrayList<>();
            this.AudioAttributesCompatParcelizer = arrayList;
            parcel.readList(arrayList, Float.class.getClassLoader());
            this.RemoteActionCompatParcelizer = parcel.readFloat();
            this.IconCompatParcelizer = parcel.createBooleanArray()[0];
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeFloat(this.read);
            parcel.writeFloat(this.write);
            parcel.writeList(this.AudioAttributesCompatParcelizer);
            parcel.writeFloat(this.RemoteActionCompatParcelizer);
            parcel.writeBooleanArray(new boolean[]{this.IconCompatParcelizer});
        }
    }

    final void IconCompatParcelizer(int i, Rect rect) {
        int iRemoteActionCompatParcelizer = this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 + ((int) (RemoteActionCompatParcelizer(write().get(i).floatValue()) * this._init_lambda2));
        int iMediaBrowserCompatMediaItem = MediaBrowserCompatMediaItem();
        int i2 = this.MediaSessionCompatQueueItem;
        int i3 = this.onSetPlaybackSpeed;
        if (i2 <= i3) {
            i2 = i3;
        }
        int i4 = i2 / 2;
        rect.set(iRemoteActionCompatParcelizer - i4, iMediaBrowserCompatMediaItem - i4, iRemoteActionCompatParcelizer + i4, iMediaBrowserCompatMediaItem + i4);
    }

    static class write extends call1 {
        private final BaseSlider<?, ?, ?> RemoteActionCompatParcelizer;
        private Rect read;

        write(BaseSlider<?, ?, ?> baseSlider) {
            super(baseSlider);
            this.read = new Rect();
            this.RemoteActionCompatParcelizer = baseSlider;
        }

        @Override // kotlin.call1
        public final int IconCompatParcelizer(float f, float f2) {
            for (int i = 0; i < this.RemoteActionCompatParcelizer.write().size(); i++) {
                this.RemoteActionCompatParcelizer.IconCompatParcelizer(i, this.read);
                if (this.read.contains((int) f, (int) f2)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // kotlin.call1
        public final void read(List<Integer> list) {
            for (int i = 0; i < this.RemoteActionCompatParcelizer.write().size(); i++) {
                list.add(Integer.valueOf(i));
            }
        }

        @Override // kotlin.call1
        public final void read(int i, hasSuperClassStartingWith hassuperclassstartingwith) {
            hassuperclassstartingwith.AudioAttributesCompatParcelizer(hasSuperClassStartingWith.read.onSetRepeatMode);
            List<Float> listWrite = this.RemoteActionCompatParcelizer.write();
            float fFloatValue = listWrite.get(i).floatValue();
            float fAudioAttributesCompatParcelizer = this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer();
            float fIconCompatParcelizer = this.RemoteActionCompatParcelizer.IconCompatParcelizer();
            if (this.RemoteActionCompatParcelizer.isEnabled()) {
                if (fFloatValue > fAudioAttributesCompatParcelizer) {
                    hassuperclassstartingwith.AudioAttributesCompatParcelizer(8192);
                }
                if (fFloatValue < fIconCompatParcelizer) {
                    hassuperclassstartingwith.AudioAttributesCompatParcelizer(4096);
                }
            }
            hassuperclassstartingwith.RemoteActionCompatParcelizer(hasSuperClassStartingWith.MediaBrowserCompatItemReceiver.IconCompatParcelizer(1, fAudioAttributesCompatParcelizer, fIconCompatParcelizer, fFloatValue));
            hassuperclassstartingwith.AudioAttributesCompatParcelizer((CharSequence) SeekBar.class.getName());
            StringBuilder sb = new StringBuilder();
            if (this.RemoteActionCompatParcelizer.getContentDescription() != null) {
                sb.append(this.RemoteActionCompatParcelizer.getContentDescription());
                sb.append(",");
            }
            String str = this.RemoteActionCompatParcelizer.read(fFloatValue);
            String string = this.RemoteActionCompatParcelizer.getContext().getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.material_slider_value);
            if (listWrite.size() > 1) {
                string = RemoteActionCompatParcelizer(i);
            }
            sb.append(String.format(Locale.US, "%s, %s", string, str));
            hassuperclassstartingwith.IconCompatParcelizer(sb.toString());
            this.RemoteActionCompatParcelizer.IconCompatParcelizer(i, this.read);
            hassuperclassstartingwith.RemoteActionCompatParcelizer(this.read);
        }

        private String RemoteActionCompatParcelizer(int i) {
            if (i == this.RemoteActionCompatParcelizer.write().size() - 1) {
                return this.RemoteActionCompatParcelizer.getContext().getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.material_slider_range_end);
            }
            if (i == 0) {
                return this.RemoteActionCompatParcelizer.getContext().getString(calculateNextSearchBytePosition.MediaBrowserCompatSearchResultReceiver.material_slider_range_start);
            }
            return "";
        }

        @Override // kotlin.call1
        public final boolean IconCompatParcelizer(int i, int i2, Bundle bundle) {
            if (!this.RemoteActionCompatParcelizer.isEnabled()) {
                return false;
            }
            if (i2 != 4096 && i2 != 8192) {
                if (i2 == 16908349 && bundle != null && bundle.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")) {
                    if (this.RemoteActionCompatParcelizer.IconCompatParcelizer(i, bundle.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE"))) {
                        this.RemoteActionCompatParcelizer.onPrepareFromMediaId();
                        this.RemoteActionCompatParcelizer.postInvalidate();
                        write(i);
                        return true;
                    }
                }
                return false;
            }
            float fIconCompatParcelizer = BaseSlider.IconCompatParcelizer(this.RemoteActionCompatParcelizer);
            if (i2 == 8192) {
                fIconCompatParcelizer = -fIconCompatParcelizer;
            }
            if (this.RemoteActionCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver()) {
                fIconCompatParcelizer = -fIconCompatParcelizer;
            }
            if (!this.RemoteActionCompatParcelizer.IconCompatParcelizer(i, StdKeyDeserializer.write(this.RemoteActionCompatParcelizer.write().get(i).floatValue() + fIconCompatParcelizer, this.RemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(), this.RemoteActionCompatParcelizer.IconCompatParcelizer()))) {
                return false;
            }
            this.RemoteActionCompatParcelizer.onPrepareFromMediaId();
            this.RemoteActionCompatParcelizer.postInvalidate();
            write(i);
            return true;
        }
    }
}
